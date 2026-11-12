package com.garmin.gcsprotos.generated;

import com.google.common.net.HttpHeaders;
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

/* JADX INFO: loaded from: classes12.dex */
public final class WeatherProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\rweather.proto\u0012\u0011CSM.Proto.Weather\u001a\u000fdataTypes.proto\"¿\u0001\n\u000eWeatherRequest\u00128\n\nconditions\u0018\u000b \u0001(\u000b2$.CSM.Proto.Weather.ConditionsRequest\u00120\n\u0006alerts\u0018\f \u0001(\u000b2 .CSM.Proto.Weather.AlertsRequest\u0012A\n\u000fhourly_forecast\u0018\u0010 \u0001(\u000b2(.CSM.Proto.Weather.HourlyForecastRequest\"\u0082\u0002\n\u000fWeatherResponse\u0012=\n\u000fresponse_status\u0018\u0001 \u0001(\u000e2 .CSM.Proto.Weather.WeatherStatus:\u0002OK\u00129\n\nconditions\u0018\u000b \u0001(\u000b2%.CSM.Proto.Weather.ConditionsResponse\u00121\n\u0006alerts\u0018\f \u0001(\u000b2!.CSM.Proto.Weather.AlertsResponse\u0012B\n\u000fhourly_forecast\u0018\u0010 \u0001(\u000b2).CSM.Proto.Weather.HourlyForecastResponse\"ß\u0001\n\u0015HourlyForecastRequest\u0012+\n\bposition\u0018\u0001 \u0002(\u000b2\u0019.CSM.Proto.Common.ScPoint\u0012,\n\blanguage\u0018\u0002 \u0001(\u000b2\u001a.CSM.Proto.Common.Language\u0012\u0014\n\tnum_hours\u0018\u0003 \u0001(\r:\u00018\u00124\n\ttext_size\u0018\u0005 \u0001(\u000e2\u001b.CSM.Proto.Weather.TextSize:\u0004FULL\u0012\u001f\n\u0010attrib_supported\u0018\u0006 \u0001(\b:\u0005false\"ê\u0002\n\u0016HourlyForecastResponse\u0012D\n\bforecast\u0018\u0001 \u0003(\u000b22.CSM.Proto.Weather.HourlyForecastResponse.Forecast\u00122\n\tproviders\u0018\u0002 \u0003(\u000b2\u001f.CSM.Proto.Weather.DataProvider\u001aÕ\u0001\n\bForecast\u0012\u0013\n\u000bhour_of_day\u0018\u0001 \u0001(\u0004\u0012\u0015\n\rforecast_temp\u0018\u0003 \u0001(\u0011\u0012\u0013\n\u000bprecip_prob\u0018\u0004 \u0001(\r\u0012,\n\u0004icon\u0018\u0005 \u0001(\u000e2\u001e.CSM.Proto.Weather.WeatherIcon\u00123\n\rsized_summary\u0018\u0006 \u0003(\u000b2\u001c.CSM.Proto.Weather.SizedText\u0012%\n\u0004wind\u0018\u0007 \u0001(\u000b2\u0017.CSM.Proto.Weather.Wind\">\n\u0004Wind\u0012\r\n\u0005speed\u0018\u0001 \u0001(\u0005\u0012\u0016\n\u000edirection_name\u0018\u0002 \u0001(\t\u0012\u000f\n\u0007bearing\u0018\u0003 \u0001(\r\"Ü\u0001\n\u0011ConditionsRequest\u0012+\n\bposition\u0018\u0001 \u0002(\u000b2\u0019.CSM.Proto.Common.ScPoint\u0012,\n\blanguage\u0018\u0002 \u0001(\u000b2\u001a.CSM.Proto.Common.Language\u0012\u0013\n\bnum_days\u0018\u0003 \u0001(\r:\u00015\u00126\n\ttext_size\u0018\u0004 \u0001(\u000e2\u001b.CSM.Proto.Weather.TextSize:\u0006MEDIUM\u0012\u001f\n\u0010attrib_supported\u0018\u0005 \u0001(\b:\u0005false\"Ò\b\n\u0012ConditionsResponse\u0012E\n\u0007current\u0018\u0001 \u0001(\u000b24.CSM.Proto.Weather.ConditionsResponse.CurrentWeather\u0012G\n\bforecast\u0018\u0002 \u0003(\u000b25.CSM.Proto.Weather.ConditionsResponse.ForecastWeather\u0012\u0019\n\u0011forecast_location\u0018\u0003 \u0001(\t\u0012:\n\u0011forecastProviders\u0018\u0004 \u0003(\u000b2\u001f.CSM.Proto.Weather.DataProvider\u001aæ\u0003\n\u000eCurrentWeather\u0012\u0013\n\u000bdescription\u0018\u0001 \u0001(\t\u0012\u0014\n\fcurrent_temp\u0018\u0002 \u0001(\u0011\u0012\u0010\n\bwind_dir\u0018\u0003 \u0001(\t\u0012\u0012\n\nwind_speed\u0018\u0004 \u0001(\u0005\u0012\u0012\n\nfeels_like\u0018\u0005 \u0001(\u0005\u0012,\n\u0004icon\u0018\b \u0001(\u000e2\u001e.CSM.Proto.Weather.WeatherIcon\u0012\u0010\n\blocation\u0018\t \u0001(\t\u0012\u0014\n\frelative_hum\u0018\n \u0001(\u0005\u0012D\n\u000bday_of_week\u0018\u000b \u0001(\u000e2/.CSM.Proto.Weather.ConditionsResponse.DayOfWeek\u00120\n\nsized_text\u0018\f \u0003(\u000b2\u001c.CSM.Proto.Weather.SizedText\u00128\n\u000fcurrentProvider\u0018\r \u0001(\u000b2\u001f.CSM.Proto.Weather.DataProvider\u0012\u0011\n\ttimestamp\u0018\u000e \u0001(\u0004\u0012>\n\u0011observed_location\u0018\u000f \u0001(\u000b2#.CSM.Proto.Weather.ObservedLocation\u0012\u0014\n\fwind_bearing\u0018\u0010 \u0001(\r\u001a\u0082\u0002\n\u000fForecastWeather\u0012D\n\u000bday_of_week\u0018\u0001 \u0001(\u000e2/.CSM.Proto.Weather.ConditionsResponse.DayOfWeek\u0012\u0011\n\thigh_temp\u0018\u0002 \u0001(\u0011\u0012\u0010\n\blow_temp\u0018\u0003 \u0001(\u0011\u0012\u000f\n\u0007summary\u0018\u0004 \u0001(\t\u0012,\n\u0004icon\u0018\u0005 \u0001(\u000e2\u001e.CSM.Proto.Weather.WeatherIcon\u0012\u0013\n\u000bprecip_prob\u0018\u0006 \u0001(\u0005\u00120\n\nsized_text\u0018\u0007 \u0003(\u000b2\u001c.CSM.Proto.Weather.SizedText\"g\n\tDayOfWeek\u0012\n\n\u0006SUNDAY\u0010\u0001\u0012\n\n\u0006MONDAY\u0010\u0002\u0012\u000b\n\u0007TUESDAY\u0010\u0003\u0012\r\n\tWEDNESDAY\u0010\u0004\u0012\f\n\bTHURSDAY\u0010\u0005\u0012\n\n\u0006FRIDAY\u0010\u0006\u0012\f\n\bSATURDAY\u0010\u0007\"8\n\fDataProvider\u0012\u0013\n\u000bprovideName\u0018\u0001 \u0001(\t\u0012\u0013\n\u000bdisplayTime\u0018\u0002 \u0001(\r\"I\n\tSizedText\u0012.\n\ttext_size\u0018\u0001 \u0002(\u000e2\u001b.CSM.Proto.Weather.TextSize\u0012\f\n\u0004text\u0018\u0002 \u0002(\t\"V\n\u0010ObservedLocation\u0012\u0015\n\rlocation_name\u0018\u0001 \u0001(\t\u0012+\n\bposition\u0018\u0002 \u0001(\u000b2\u0019.CSM.Proto.Common.ScPoint\"ã\u0001\n\rAlertsRequest\u0012,\n\fbounding_box\u0018\u0001 \u0002(\u000b2\u0016.CSM.Proto.Common.Bbox\u0012\u0017\n\fquery_cookie\u0018\u0002 \u0001(\t:\u00010\u0012;\n\bseverity\u0018\u0003 \u0001(\u000e2\".CSM.Proto.Weather.WeatherSeverity:\u0005WATCH\u0012,\n\blanguage\u0018\u0004 \u0001(\u000b2\u001a.CSM.Proto.Common.Language\u0012 \n\u0011summary_requested\u0018\u0005 \u0001(\b:\u0005false\"\u0093\u0004\n\u000eAlertsResponse\u0012T\n\u0015severe_weather_report\u0018\u0001 \u0003(\u000b25.CSM.Proto.Weather.AlertsResponse.SevereWeatherReport\u0012\u0014\n\fquery_cookie\u0018\u0002 \u0001(\t\u001a\u0094\u0003\n\u0013SevereWeatherReport\u0012\u0010\n\breportId\u0018\u0001 \u0001(\t\u00124\n\bseverity\u0018\u0002 \u0001(\u000e2\".CSM.Proto.Weather.WeatherSeverity\u0012\f\n\u0004text\u0018\u0003 \u0001(\t\u0012\u0012\n\nissue_time\u0018\u0004 \u0001(\u0004\u0012\u0013\n\u000bexpire_time\u0018\u0005 \u0001(\u0004\u00124\n\fweather_zone\u0018\u0006 \u0003(\u000b2\u001e.CSM.Proto.Weather.WeatherZone\u00120\n\nadhoc_zone\u0018\u0007 \u0001(\u000b2\u001c.CSM.Proto.Weather.AdhocZone\u0012\u000f\n\u0007caption\u0018\b \u0001(\t\u0012/\n\talertType\u0018\t \u0001(\u000e2\u001c.CSM.Proto.Weather.AlertType\u0012\u0010\n\bprovider\u0018\n \u0001(\t\u0012\u0010\n\bpriority\u0018\u000b \u0001(\r\u00120\n\nalert_enum\u0018\f \u0001(\u000e2\u001c.CSM.Proto.Weather.AlertEnum\"W\n\u000bWeatherZone\u0012\n\n\u0002id\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007version\u0018\u0002 \u0001(\r\u0012+\n\bpolygons\u0018\u0003 \u0003(\u000b2\u0019.CSM.Proto.Common.Polygon\"8\n\tAdhocZone\u0012+\n\bpolygons\u0018\u0001 \u0003(\u000b2\u0019.CSM.Proto.Common.Polygon*\u0017\n\rWeatherStatus\u0012\u0006\n\u0002OK\u0010\u0000*:\n\bTextSize\u0012\r\n\tALL_SIZES\u0010\u0000\u0012\t\n\u0005SMALL\u0010\u0001\u0012\n\n\u0006MEDIUM\u0010\u0002\u0012\b\n\u0004FULL\u0010\u0003*â\u0002\n\u000bWeatherIcon\u0012\t\n\u0005CLEAR\u0010\u0000\u0012\u0011\n\rPARTLY_CLOUDY\u0010\u0001\u0012\u0011\n\rMOSTLY_CLOUDY\u0010\u0002\u0012\b\n\u0004RAIN\u0010\u0003\u0012\b\n\u0004SNOW\u0010\u0004\u0012\t\n\u0005WINDY\u0010\u0005\u0012\u0011\n\rTHUNDERSTORMS\u0010\u0006\u0012\u000e\n\nWINTRY_MIX\u0010\u0007\u0012\u0007\n\u0003FOG\u0010\b\u0012\b\n\u0004HAZY\u0010\u000b\u0012\b\n\u0004HAIL\u0010\f\u0012\u0015\n\u0011SCATTERED_SHOWERS\u0010\r\u0012\u001b\n\u0017SCATTERED_THUNDERSTORMS\u0010\u000e\u0012\u0019\n\u0015UNKNOWN_PRECIPITATION\u0010\u000f\u0012\u000e\n\nLIGHT_RAIN\u0010\u0010\u0012\u000e\n\nHEAVY_RAIN\u0010\u0011\u0012\u000e\n\nLIGHT_SNOW\u0010\u0012\u0012\u000e\n\nHEAVY_SNOW\u0010\u0013\u0012\u0013\n\u000fLIGHT_RAIN_SNOW\u0010\u0014\u0012\u0013\n\u000fHEAVY_RAIN_SNOW\u0010\u0015\u0012\n\n\u0006CLOUDY\u0010\u0016*\u009e\u0001\n\tAlertType\u0012\u0012\n\u000eALERT_ADVISORY\u0010\u0000\u0012\u000f\n\u000bALERT_WATCH\u0010\u0001\u0012\u0014\n\u0010ALERT_STORM_WARN\u0010\u0002\u0012\u0013\n\u000fALERT_WIND_WARN\u0010\u0003\u0012\u0014\n\u0010ALERT_FLOOD_WARN\u0010\u0004\u0012\u0015\n\u0011ALERT_WINTER_WARN\u0010\u0005\u0012\u0014\n\u0010ALERT_OTHER_WARN\u0010\u0006*S\n\u000fWeatherSeverity\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u000b\n\u0007WARNING\u0010\u0001\u0012\t\n\u0005WATCH\u0010\u0002\u0012\f\n\bADVISORY\u0010\u0003\u0012\r\n\tSTATEMENT\u0010\u0004*ß\u000b\n\tAlertEnum\u0012\u000b\n\u0007TORNADO\u0010\u0001\u0012\u000b\n\u0007TSUNAMI\u0010\u0002\u0012\r\n\tHURRICANE\u0010\u0003\u0012\u0010\n\fEXTREME_WIND\u0010\u0004\u0012\u000b\n\u0007TYPHOON\u0010\u0005\u0012\u0014\n\u0010INLAND_HURRICANE\u0010\u0006\u0012\u0018\n\u0014HURRICANE_FORCE_WIND\u0010\u0007\u0012\u000e\n\nWATERSPOUT\u0010\b\u0012\u0012\n\u000eSEVERE_T_STORM\u0010\t\u0012\u0014\n\u0010WRECKHOUSE_WINDS\u0010\n\u0012\u0013\n\u000fLES_SUETES_WIND\u0010\u000b\u0012\r\n\tAVALANCHE\u0010\f\u0012\u000f\n\u000bFLASH_FLOOD\u0010\r\u0012\u0012\n\u000eTROPICAL_STORM\u0010\u000e\u0012\u0019\n\u0015INLAND_TROPICAL_STORM\u0010\u000f\u0012\f\n\bBLIZZARD\u0010\u0010\u0012\r\n\tICE_STORM\u0010\u0011\u0012\u0011\n\rFREEZING_RAIN\u0010\u0012\u0012\u000f\n\u000bDEBRIS_FLOW\u0010\u0013\u0012\u0010\n\fFLASH_FREEZE\u0010\u0014\u0012\u000e\n\nDUST_STORM\u0010\u0015\u0012\r\n\tHIGH_WIND\u0010\u0016\u0012\u0010\n\fWINTER_STORM\u0010\u0017\u0012\u0018\n\u0014HEAVY_FREEZING_SPRAY\u0010\u0018\u0012\u0010\n\fEXTREME_COLD\u0010\u0019\u0012\u000e\n\nWIND_CHILL\u0010\u001a\u0012\r\n\tCOLD_WAVE\u0010\u001b\u0012\u0014\n\u0010HEAVY_SNOW_ALERT\u0010\u001c\u0012\u001c\n\u0018LAKE_EFFECT_BLOWING_SNOW\u0010\u001d\u0012\u000f\n\u000bSNOW_SQUALL\u0010\u001e\u0012\u0014\n\u0010LAKE_EFFECT_SNOW\u0010\u001f\u0012\u0012\n\u000eWINTER_WEATHER\u0010 \u0012\t\n\u0005SLEET\u0010!\u0012\f\n\bSNOWFALL\u0010\"\u0012\u0019\n\u0015SNOW_AND_BLOWING_SNOW\u0010#\u0012\u0010\n\fBLOWING_SNOW\u0010$\u0012\u000e\n\nSNOW_ALERT\u0010%\u0012\u0012\n\u000eARCTIC_OUTFLOW\u0010&\u0012\u0014\n\u0010FREEZING_DRIZZLE\u0010'\u0012\t\n\u0005STORM\u0010(\u0012\u000f\n\u000bSTORM_SURGE\u0010)\u0012\f\n\bRAINFALL\u0010*\u0012\u000f\n\u000bAREAL_FLOOD\u0010+\u0012\u0011\n\rCOASTAL_FLOOD\u0010,\u0012\u0013\n\u000fLAKESHORE_FLOOD\u0010-\u0012\u0012\n\u000eEXCESSIVE_HEAT\u0010.\u0012\b\n\u0004HEAT\u0010/\u0012\u000b\n\u0007WEATHER\u00100\u0012\u001a\n\u0016HIGH_HEAT_AND_HUMIDITY\u00101\u0012\u0016\n\u0012HUMIDEX_AND_HEALTH\u00102\u0012\u000b\n\u0007HUMIDEX\u00103\u0012\b\n\u0004GALE\u00104\u0012\u0012\n\u000eFREEZING_SPRAY\u00105\u0012\u0012\n\u000eSPECIAL_MARINE\u00106\u0012\n\n\u0006SQUALL\u00107\u0012\u000f\n\u000bSTRONG_WIND\u00108\u0012\r\n\tLAKE_WIND\u00109\u0012\u0012\n\u000eMARINE_WEATHER\u0010:\u0012\b\n\u0004WIND\u0010;\u0012\u001e\n\u001aSMALL_CRAFT_HAZARDOUS_SEAS\u0010<\u0012\u0012\n\u000eHAZARDOUS_SEAS\u0010=\u0012\u000f\n\u000bSMALL_CRAFT\u0010>\u0012\u0015\n\u0011SMALL_CRAFT_WINDS\u0010?\u0012\u0019\n\u0015SMALL_CRAFT_ROUGH_BAR\u0010@\u0012\u0014\n\u0010HIGH_WATER_LEVEL\u0010A\u0012\u000b\n\u0007ASHFALL\u0010B\u0012\u0010\n\fFREEZING_FOG\u0010C\u0012\r\n\tDENSE_FOG\u0010D\u0012\u000f\n\u000bDENSE_SMOKE\u0010E\u0012\u0010\n\fBLOWING_DUST\u0010F\u0012\u000f\n\u000bHARD_FREEZE\u0010G\u0012\n\n\u0006FREEZE\u0010H\u0012\t\n\u0005FROST\u0010I\u0012\u0010\n\fFIRE_WEATHER\u0010J\u0012\t\n\u0005FLOOD\u0010K\u0012\f\n\bRIP_TIDE\u0010L\u0012\r\n\tHIGH_SURF\u0010M\u0012\b\n\u0004SMOG\u0010N\u0012\u000f\n\u000bAIR_QUALITY\u0010O\u0012\u000e\n\nBRISK_WIND\u0010P\u0012\u0012\n\u000eAIR_STAGNATION\u0010Q\u0012\r\n\tLOW_WATER\u0010R\u0012\u0010\n\fHYDROLOGICAL\u0010S\u0012\u0013\n\u000fSPECIAL_WEATHER\u0010TB0\n\u001ecom.garmin.gcsprotos.generatedB\fWeatherProtoH\u0003"}, new Descriptors.FileDescriptor[]{DataTypesProto.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_CSM_Proto_Weather_AdhocZone_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CSM_Proto_Weather_AdhocZone_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_CSM_Proto_Weather_AlertsRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CSM_Proto_Weather_AlertsRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_CSM_Proto_Weather_AlertsResponse_SevereWeatherReport_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CSM_Proto_Weather_AlertsResponse_SevereWeatherReport_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_CSM_Proto_Weather_AlertsResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CSM_Proto_Weather_AlertsResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_CSM_Proto_Weather_ConditionsRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CSM_Proto_Weather_ConditionsRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_CSM_Proto_Weather_ConditionsResponse_CurrentWeather_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CSM_Proto_Weather_ConditionsResponse_CurrentWeather_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_CSM_Proto_Weather_ConditionsResponse_ForecastWeather_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CSM_Proto_Weather_ConditionsResponse_ForecastWeather_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_CSM_Proto_Weather_ConditionsResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CSM_Proto_Weather_ConditionsResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_CSM_Proto_Weather_DataProvider_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CSM_Proto_Weather_DataProvider_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_CSM_Proto_Weather_HourlyForecastRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CSM_Proto_Weather_HourlyForecastRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_CSM_Proto_Weather_HourlyForecastResponse_Forecast_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CSM_Proto_Weather_HourlyForecastResponse_Forecast_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_CSM_Proto_Weather_HourlyForecastResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CSM_Proto_Weather_HourlyForecastResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_CSM_Proto_Weather_ObservedLocation_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CSM_Proto_Weather_ObservedLocation_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_CSM_Proto_Weather_SizedText_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CSM_Proto_Weather_SizedText_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_CSM_Proto_Weather_WeatherRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CSM_Proto_Weather_WeatherRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_CSM_Proto_Weather_WeatherResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CSM_Proto_Weather_WeatherResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_CSM_Proto_Weather_WeatherZone_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CSM_Proto_Weather_WeatherZone_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_CSM_Proto_Weather_Wind_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CSM_Proto_Weather_Wind_fieldAccessorTable;

    public interface AdhocZoneOrBuilder extends MessageOrBuilder {
        DataTypesProto.Polygon getPolygons(int i14);

        int getPolygonsCount();

        List<DataTypesProto.Polygon> getPolygonsList();

        DataTypesProto.PolygonOrBuilder getPolygonsOrBuilder(int i14);

        List<? extends DataTypesProto.PolygonOrBuilder> getPolygonsOrBuilderList();
    }

    public interface AlertsRequestOrBuilder extends MessageOrBuilder {
        DataTypesProto.Bbox getBoundingBox();

        DataTypesProto.BboxOrBuilder getBoundingBoxOrBuilder();

        DataTypesProto.Language getLanguage();

        DataTypesProto.LanguageOrBuilder getLanguageOrBuilder();

        String getQueryCookie();

        ByteString getQueryCookieBytes();

        WeatherSeverity getSeverity();

        boolean getSummaryRequested();

        boolean hasBoundingBox();

        boolean hasLanguage();

        boolean hasQueryCookie();

        boolean hasSeverity();

        boolean hasSummaryRequested();
    }

    public interface AlertsResponseOrBuilder extends MessageOrBuilder {
        String getQueryCookie();

        ByteString getQueryCookieBytes();

        AlertsResponse.SevereWeatherReport getSevereWeatherReport(int i14);

        int getSevereWeatherReportCount();

        List<AlertsResponse.SevereWeatherReport> getSevereWeatherReportList();

        AlertsResponse.SevereWeatherReportOrBuilder getSevereWeatherReportOrBuilder(int i14);

        List<? extends AlertsResponse.SevereWeatherReportOrBuilder> getSevereWeatherReportOrBuilderList();

        boolean hasQueryCookie();
    }

    public interface ConditionsRequestOrBuilder extends MessageOrBuilder {
        boolean getAttribSupported();

        DataTypesProto.Language getLanguage();

        DataTypesProto.LanguageOrBuilder getLanguageOrBuilder();

        int getNumDays();

        DataTypesProto.ScPoint getPosition();

        DataTypesProto.ScPointOrBuilder getPositionOrBuilder();

        TextSize getTextSize();

        boolean hasAttribSupported();

        boolean hasLanguage();

        boolean hasNumDays();

        boolean hasPosition();

        boolean hasTextSize();
    }

    public interface ConditionsResponseOrBuilder extends MessageOrBuilder {
        ConditionsResponse.CurrentWeather getCurrent();

        ConditionsResponse.CurrentWeatherOrBuilder getCurrentOrBuilder();

        ConditionsResponse.ForecastWeather getForecast(int i14);

        int getForecastCount();

        List<ConditionsResponse.ForecastWeather> getForecastList();

        String getForecastLocation();

        ByteString getForecastLocationBytes();

        ConditionsResponse.ForecastWeatherOrBuilder getForecastOrBuilder(int i14);

        List<? extends ConditionsResponse.ForecastWeatherOrBuilder> getForecastOrBuilderList();

        DataProvider getForecastProviders(int i14);

        int getForecastProvidersCount();

        List<DataProvider> getForecastProvidersList();

        DataProviderOrBuilder getForecastProvidersOrBuilder(int i14);

        List<? extends DataProviderOrBuilder> getForecastProvidersOrBuilderList();

        boolean hasCurrent();

        boolean hasForecastLocation();
    }

    public interface DataProviderOrBuilder extends MessageOrBuilder {
        int getDisplayTime();

        String getProvideName();

        ByteString getProvideNameBytes();

        boolean hasDisplayTime();

        boolean hasProvideName();
    }

    public interface HourlyForecastRequestOrBuilder extends MessageOrBuilder {
        boolean getAttribSupported();

        DataTypesProto.Language getLanguage();

        DataTypesProto.LanguageOrBuilder getLanguageOrBuilder();

        int getNumHours();

        DataTypesProto.ScPoint getPosition();

        DataTypesProto.ScPointOrBuilder getPositionOrBuilder();

        TextSize getTextSize();

        boolean hasAttribSupported();

        boolean hasLanguage();

        boolean hasNumHours();

        boolean hasPosition();

        boolean hasTextSize();
    }

    public interface HourlyForecastResponseOrBuilder extends MessageOrBuilder {
        HourlyForecastResponse.Forecast getForecast(int i14);

        int getForecastCount();

        List<HourlyForecastResponse.Forecast> getForecastList();

        HourlyForecastResponse.ForecastOrBuilder getForecastOrBuilder(int i14);

        List<? extends HourlyForecastResponse.ForecastOrBuilder> getForecastOrBuilderList();

        DataProvider getProviders(int i14);

        int getProvidersCount();

        List<DataProvider> getProvidersList();

        DataProviderOrBuilder getProvidersOrBuilder(int i14);

        List<? extends DataProviderOrBuilder> getProvidersOrBuilderList();
    }

    public interface ObservedLocationOrBuilder extends MessageOrBuilder {
        String getLocationName();

        ByteString getLocationNameBytes();

        DataTypesProto.ScPoint getPosition();

        DataTypesProto.ScPointOrBuilder getPositionOrBuilder();

        boolean hasLocationName();

        boolean hasPosition();
    }

    public interface SizedTextOrBuilder extends MessageOrBuilder {
        String getText();

        ByteString getTextBytes();

        TextSize getTextSize();

        boolean hasText();

        boolean hasTextSize();
    }

    public interface WeatherRequestOrBuilder extends MessageOrBuilder {
        AlertsRequest getAlerts();

        AlertsRequestOrBuilder getAlertsOrBuilder();

        ConditionsRequest getConditions();

        ConditionsRequestOrBuilder getConditionsOrBuilder();

        HourlyForecastRequest getHourlyForecast();

        HourlyForecastRequestOrBuilder getHourlyForecastOrBuilder();

        boolean hasAlerts();

        boolean hasConditions();

        boolean hasHourlyForecast();
    }

    public interface WeatherResponseOrBuilder extends MessageOrBuilder {
        AlertsResponse getAlerts();

        AlertsResponseOrBuilder getAlertsOrBuilder();

        ConditionsResponse getConditions();

        ConditionsResponseOrBuilder getConditionsOrBuilder();

        HourlyForecastResponse getHourlyForecast();

        HourlyForecastResponseOrBuilder getHourlyForecastOrBuilder();

        WeatherStatus getResponseStatus();

        boolean hasAlerts();

        boolean hasConditions();

        boolean hasHourlyForecast();

        boolean hasResponseStatus();
    }

    public interface WeatherZoneOrBuilder extends MessageOrBuilder {
        String getId();

        ByteString getIdBytes();

        DataTypesProto.Polygon getPolygons(int i14);

        int getPolygonsCount();

        List<DataTypesProto.Polygon> getPolygonsList();

        DataTypesProto.PolygonOrBuilder getPolygonsOrBuilder(int i14);

        List<? extends DataTypesProto.PolygonOrBuilder> getPolygonsOrBuilderList();

        int getVersion();

        boolean hasId();

        boolean hasVersion();
    }

    public interface WindOrBuilder extends MessageOrBuilder {
        int getBearing();

        String getDirectionName();

        ByteString getDirectionNameBytes();

        int getSpeed();

        boolean hasBearing();

        boolean hasDirectionName();

        boolean hasSpeed();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_CSM_Proto_Weather_WeatherRequest_descriptor = descriptor2;
        internal_static_CSM_Proto_Weather_WeatherRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Conditions", "Alerts", "HourlyForecast"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_CSM_Proto_Weather_WeatherResponse_descriptor = descriptor3;
        internal_static_CSM_Proto_Weather_WeatherResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"ResponseStatus", "Conditions", "Alerts", "HourlyForecast"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_CSM_Proto_Weather_HourlyForecastRequest_descriptor = descriptor4;
        internal_static_CSM_Proto_Weather_HourlyForecastRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Position", "Language", "NumHours", "TextSize", "AttribSupported"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_CSM_Proto_Weather_HourlyForecastResponse_descriptor = descriptor5;
        internal_static_CSM_Proto_Weather_HourlyForecastResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Forecast", "Providers"});
        Descriptors.Descriptor descriptor6 = descriptor5.getNestedTypes().get(0);
        internal_static_CSM_Proto_Weather_HourlyForecastResponse_Forecast_descriptor = descriptor6;
        internal_static_CSM_Proto_Weather_HourlyForecastResponse_Forecast_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"HourOfDay", "ForecastTemp", "PrecipProb", "Icon", "SizedSummary", "Wind"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(4);
        internal_static_CSM_Proto_Weather_Wind_descriptor = descriptor7;
        internal_static_CSM_Proto_Weather_Wind_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Speed", "DirectionName", "Bearing"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(5);
        internal_static_CSM_Proto_Weather_ConditionsRequest_descriptor = descriptor8;
        internal_static_CSM_Proto_Weather_ConditionsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Position", "Language", "NumDays", "TextSize", "AttribSupported"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(6);
        internal_static_CSM_Proto_Weather_ConditionsResponse_descriptor = descriptor9;
        internal_static_CSM_Proto_Weather_ConditionsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Current", "Forecast", "ForecastLocation", "ForecastProviders"});
        Descriptors.Descriptor descriptor10 = descriptor9.getNestedTypes().get(0);
        internal_static_CSM_Proto_Weather_ConditionsResponse_CurrentWeather_descriptor = descriptor10;
        internal_static_CSM_Proto_Weather_ConditionsResponse_CurrentWeather_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Description", "CurrentTemp", "WindDir", "WindSpeed", "FeelsLike", "Icon", HttpHeaders.LOCATION, "RelativeHum", "DayOfWeek", "SizedText", "CurrentProvider", "Timestamp", "ObservedLocation", "WindBearing"});
        Descriptors.Descriptor descriptor11 = descriptor9.getNestedTypes().get(1);
        internal_static_CSM_Proto_Weather_ConditionsResponse_ForecastWeather_descriptor = descriptor11;
        internal_static_CSM_Proto_Weather_ConditionsResponse_ForecastWeather_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"DayOfWeek", "HighTemp", "LowTemp", "Summary", "Icon", "PrecipProb", "SizedText"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(7);
        internal_static_CSM_Proto_Weather_DataProvider_descriptor = descriptor12;
        internal_static_CSM_Proto_Weather_DataProvider_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"ProvideName", "DisplayTime"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(8);
        internal_static_CSM_Proto_Weather_SizedText_descriptor = descriptor13;
        internal_static_CSM_Proto_Weather_SizedText_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"TextSize", "Text"});
        Descriptors.Descriptor descriptor14 = getDescriptor().getMessageTypes().get(9);
        internal_static_CSM_Proto_Weather_ObservedLocation_descriptor = descriptor14;
        internal_static_CSM_Proto_Weather_ObservedLocation_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"LocationName", "Position"});
        Descriptors.Descriptor descriptor15 = getDescriptor().getMessageTypes().get(10);
        internal_static_CSM_Proto_Weather_AlertsRequest_descriptor = descriptor15;
        internal_static_CSM_Proto_Weather_AlertsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"BoundingBox", "QueryCookie", "Severity", "Language", "SummaryRequested"});
        Descriptors.Descriptor descriptor16 = getDescriptor().getMessageTypes().get(11);
        internal_static_CSM_Proto_Weather_AlertsResponse_descriptor = descriptor16;
        internal_static_CSM_Proto_Weather_AlertsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"SevereWeatherReport", "QueryCookie"});
        Descriptors.Descriptor descriptor17 = descriptor16.getNestedTypes().get(0);
        internal_static_CSM_Proto_Weather_AlertsResponse_SevereWeatherReport_descriptor = descriptor17;
        internal_static_CSM_Proto_Weather_AlertsResponse_SevereWeatherReport_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[]{"ReportId", "Severity", "Text", "IssueTime", "ExpireTime", "WeatherZone", "AdhocZone", "Caption", "AlertType", "Provider", "Priority", "AlertEnum"});
        Descriptors.Descriptor descriptor18 = getDescriptor().getMessageTypes().get(12);
        internal_static_CSM_Proto_Weather_WeatherZone_descriptor = descriptor18;
        internal_static_CSM_Proto_Weather_WeatherZone_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor18, new String[]{"Id", "Version", "Polygons"});
        Descriptors.Descriptor descriptor19 = getDescriptor().getMessageTypes().get(13);
        internal_static_CSM_Proto_Weather_AdhocZone_descriptor = descriptor19;
        internal_static_CSM_Proto_Weather_AdhocZone_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor19, new String[]{"Polygons"});
        DataTypesProto.getDescriptor();
    }

    private WeatherProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class AlertsResponse extends GeneratedMessageV3 implements AlertsResponseOrBuilder {
        private static final AlertsResponse DEFAULT_INSTANCE = new AlertsResponse();

        @Deprecated
        public static final Parser<AlertsResponse> PARSER = new AbstractParser<AlertsResponse>() { // from class: com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.1
            @Override // com.google.protobuf.Parser
            public AlertsResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AlertsResponse.newBuilder();
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
        public static final int QUERY_COOKIE_FIELD_NUMBER = 2;
        public static final int SEVERE_WEATHER_REPORT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private volatile Object queryCookie_;
        private List<SevereWeatherReport> severeWeatherReport_;

        public interface SevereWeatherReportOrBuilder extends MessageOrBuilder {
            AdhocZone getAdhocZone();

            AdhocZoneOrBuilder getAdhocZoneOrBuilder();

            AlertEnum getAlertEnum();

            AlertType getAlertType();

            String getCaption();

            ByteString getCaptionBytes();

            long getExpireTime();

            long getIssueTime();

            int getPriority();

            String getProvider();

            ByteString getProviderBytes();

            String getReportId();

            ByteString getReportIdBytes();

            WeatherSeverity getSeverity();

            String getText();

            ByteString getTextBytes();

            WeatherZone getWeatherZone(int i14);

            int getWeatherZoneCount();

            List<WeatherZone> getWeatherZoneList();

            WeatherZoneOrBuilder getWeatherZoneOrBuilder(int i14);

            List<? extends WeatherZoneOrBuilder> getWeatherZoneOrBuilderList();

            boolean hasAdhocZone();

            boolean hasAlertEnum();

            boolean hasAlertType();

            boolean hasCaption();

            boolean hasExpireTime();

            boolean hasIssueTime();

            boolean hasPriority();

            boolean hasProvider();

            boolean hasReportId();

            boolean hasSeverity();

            boolean hasText();
        }

        private AlertsResponse() {
            this.queryCookie_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.severeWeatherReport_ = Collections.EMPTY_LIST;
            this.queryCookie_ = "";
        }

        public static AlertsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WeatherProto.internal_static_CSM_Proto_Weather_AlertsResponse_descriptor;
        }

        public static Builder newBuilder(AlertsResponse alertsResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(alertsResponse);
        }

        public static AlertsResponse parseDelimitedFrom(InputStream inputStream) {
            return (AlertsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AlertsResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AlertsResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AlertsResponse)) {
                return super.equals(obj);
            }
            AlertsResponse alertsResponse = (AlertsResponse) obj;
            if (getSevereWeatherReportList().equals(alertsResponse.getSevereWeatherReportList()) && hasQueryCookie() == alertsResponse.hasQueryCookie()) {
                return (!hasQueryCookie() || getQueryCookie().equals(alertsResponse.getQueryCookie())) && getUnknownFields().equals(alertsResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AlertsResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponseOrBuilder
        public String getQueryCookie() {
            Object obj = this.queryCookie_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.queryCookie_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponseOrBuilder
        public ByteString getQueryCookieBytes() {
            Object obj = this.queryCookie_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.queryCookie_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = 0;
            for (int i15 = 0; i15 < this.severeWeatherReport_.size(); i15++) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(1, this.severeWeatherReport_.get(i15));
            }
            if ((this.bitField0_ & 1) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.queryCookie_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponseOrBuilder
        public SevereWeatherReport getSevereWeatherReport(int i14) {
            return this.severeWeatherReport_.get(i14);
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponseOrBuilder
        public int getSevereWeatherReportCount() {
            return this.severeWeatherReport_.size();
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponseOrBuilder
        public List<SevereWeatherReport> getSevereWeatherReportList() {
            return this.severeWeatherReport_;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponseOrBuilder
        public SevereWeatherReportOrBuilder getSevereWeatherReportOrBuilder(int i14) {
            return this.severeWeatherReport_.get(i14);
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponseOrBuilder
        public List<? extends SevereWeatherReportOrBuilder> getSevereWeatherReportOrBuilderList() {
            return this.severeWeatherReport_;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponseOrBuilder
        public boolean hasQueryCookie() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getSevereWeatherReportCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSevereWeatherReportList().hashCode();
            }
            if (hasQueryCookie()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getQueryCookie().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WeatherProto.internal_static_CSM_Proto_Weather_AlertsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(AlertsResponse.class, Builder.class);
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
            for (int i14 = 0; i14 < getSevereWeatherReportCount(); i14++) {
                if (!getSevereWeatherReport(i14).isInitialized()) {
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
            return new AlertsResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.severeWeatherReport_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.severeWeatherReport_.get(i14));
            }
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.queryCookie_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class SevereWeatherReport extends GeneratedMessageV3 implements SevereWeatherReportOrBuilder {
            public static final int ADHOC_ZONE_FIELD_NUMBER = 7;
            public static final int ALERTTYPE_FIELD_NUMBER = 9;
            public static final int ALERT_ENUM_FIELD_NUMBER = 12;
            public static final int CAPTION_FIELD_NUMBER = 8;
            public static final int EXPIRE_TIME_FIELD_NUMBER = 5;
            public static final int ISSUE_TIME_FIELD_NUMBER = 4;
            public static final int PRIORITY_FIELD_NUMBER = 11;
            public static final int PROVIDER_FIELD_NUMBER = 10;
            public static final int REPORTID_FIELD_NUMBER = 1;
            public static final int SEVERITY_FIELD_NUMBER = 2;
            public static final int TEXT_FIELD_NUMBER = 3;
            public static final int WEATHER_ZONE_FIELD_NUMBER = 6;
            private static final long serialVersionUID = 0;
            private AdhocZone adhocZone_;
            private int alertEnum_;
            private int alertType_;
            private int bitField0_;
            private volatile Object caption_;
            private long expireTime_;
            private long issueTime_;
            private byte memoizedIsInitialized;
            private int priority_;
            private volatile Object provider_;
            private volatile Object reportId_;
            private int severity_;
            private volatile Object text_;
            private List<WeatherZone> weatherZone_;
            private static final SevereWeatherReport DEFAULT_INSTANCE = new SevereWeatherReport();

            @Deprecated
            public static final Parser<SevereWeatherReport> PARSER = new AbstractParser<SevereWeatherReport>() { // from class: com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReport.1
                @Override // com.google.protobuf.Parser
                public SevereWeatherReport parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = SevereWeatherReport.newBuilder();
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

            private SevereWeatherReport() {
                this.reportId_ = "";
                this.severity_ = 0;
                this.text_ = "";
                this.issueTime_ = 0L;
                this.expireTime_ = 0L;
                this.caption_ = "";
                this.alertType_ = 0;
                this.provider_ = "";
                this.priority_ = 0;
                this.alertEnum_ = 1;
                this.memoizedIsInitialized = (byte) -1;
                this.reportId_ = "";
                this.severity_ = 0;
                this.text_ = "";
                this.weatherZone_ = Collections.EMPTY_LIST;
                this.caption_ = "";
                this.alertType_ = 0;
                this.provider_ = "";
                this.alertEnum_ = 1;
            }

            public static SevereWeatherReport getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WeatherProto.internal_static_CSM_Proto_Weather_AlertsResponse_SevereWeatherReport_descriptor;
            }

            public static Builder newBuilder(SevereWeatherReport severeWeatherReport) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(severeWeatherReport);
            }

            public static SevereWeatherReport parseDelimitedFrom(InputStream inputStream) {
                return (SevereWeatherReport) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static SevereWeatherReport parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<SevereWeatherReport> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof SevereWeatherReport)) {
                    return super.equals(obj);
                }
                SevereWeatherReport severeWeatherReport = (SevereWeatherReport) obj;
                if (hasReportId() != severeWeatherReport.hasReportId()) {
                    return false;
                }
                if ((hasReportId() && !getReportId().equals(severeWeatherReport.getReportId())) || hasSeverity() != severeWeatherReport.hasSeverity()) {
                    return false;
                }
                if ((hasSeverity() && this.severity_ != severeWeatherReport.severity_) || hasText() != severeWeatherReport.hasText()) {
                    return false;
                }
                if ((hasText() && !getText().equals(severeWeatherReport.getText())) || hasIssueTime() != severeWeatherReport.hasIssueTime()) {
                    return false;
                }
                if ((hasIssueTime() && getIssueTime() != severeWeatherReport.getIssueTime()) || hasExpireTime() != severeWeatherReport.hasExpireTime()) {
                    return false;
                }
                if ((hasExpireTime() && getExpireTime() != severeWeatherReport.getExpireTime()) || !getWeatherZoneList().equals(severeWeatherReport.getWeatherZoneList()) || hasAdhocZone() != severeWeatherReport.hasAdhocZone()) {
                    return false;
                }
                if ((hasAdhocZone() && !getAdhocZone().equals(severeWeatherReport.getAdhocZone())) || hasCaption() != severeWeatherReport.hasCaption()) {
                    return false;
                }
                if ((hasCaption() && !getCaption().equals(severeWeatherReport.getCaption())) || hasAlertType() != severeWeatherReport.hasAlertType()) {
                    return false;
                }
                if ((hasAlertType() && this.alertType_ != severeWeatherReport.alertType_) || hasProvider() != severeWeatherReport.hasProvider()) {
                    return false;
                }
                if ((hasProvider() && !getProvider().equals(severeWeatherReport.getProvider())) || hasPriority() != severeWeatherReport.hasPriority()) {
                    return false;
                }
                if ((!hasPriority() || getPriority() == severeWeatherReport.getPriority()) && hasAlertEnum() == severeWeatherReport.hasAlertEnum()) {
                    return (!hasAlertEnum() || this.alertEnum_ == severeWeatherReport.alertEnum_) && getUnknownFields().equals(severeWeatherReport.getUnknownFields());
                }
                return false;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
            public AdhocZone getAdhocZone() {
                AdhocZone adhocZone = this.adhocZone_;
                return adhocZone == null ? AdhocZone.getDefaultInstance() : adhocZone;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
            public AdhocZoneOrBuilder getAdhocZoneOrBuilder() {
                AdhocZone adhocZone = this.adhocZone_;
                return adhocZone == null ? AdhocZone.getDefaultInstance() : adhocZone;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
            public AlertEnum getAlertEnum() {
                AlertEnum alertEnumForNumber = AlertEnum.forNumber(this.alertEnum_);
                return alertEnumForNumber == null ? AlertEnum.TORNADO : alertEnumForNumber;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
            public AlertType getAlertType() {
                AlertType alertTypeForNumber = AlertType.forNumber(this.alertType_);
                return alertTypeForNumber == null ? AlertType.ALERT_ADVISORY : alertTypeForNumber;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
            public String getCaption() {
                Object obj = this.caption_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.caption_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
            public ByteString getCaptionBytes() {
                Object obj = this.caption_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.caption_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
            public long getExpireTime() {
                return this.expireTime_;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
            public long getIssueTime() {
                return this.issueTime_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<SevereWeatherReport> getParserForType() {
                return PARSER;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
            public int getPriority() {
                return this.priority_;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
            public String getProvider() {
                Object obj = this.provider_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.provider_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
            public ByteString getProviderBytes() {
                Object obj = this.provider_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.provider_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
            public String getReportId() {
                Object obj = this.reportId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.reportId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
            public ByteString getReportIdBytes() {
                Object obj = this.reportId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.reportId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i14 = this.memoizedSize;
                if (i14 != -1) {
                    return i14;
                }
                int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.reportId_) : 0;
                if ((this.bitField0_ & 2) != 0) {
                    iComputeStringSize += CodedOutputStream.computeEnumSize(2, this.severity_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.text_);
                }
                if ((this.bitField0_ & 8) != 0) {
                    iComputeStringSize += CodedOutputStream.computeUInt64Size(4, this.issueTime_);
                }
                if ((this.bitField0_ & 16) != 0) {
                    iComputeStringSize += CodedOutputStream.computeUInt64Size(5, this.expireTime_);
                }
                for (int i15 = 0; i15 < this.weatherZone_.size(); i15++) {
                    iComputeStringSize += CodedOutputStream.computeMessageSize(6, this.weatherZone_.get(i15));
                }
                if ((this.bitField0_ & 32) != 0) {
                    iComputeStringSize += CodedOutputStream.computeMessageSize(7, getAdhocZone());
                }
                if ((this.bitField0_ & 64) != 0) {
                    iComputeStringSize += GeneratedMessageV3.computeStringSize(8, this.caption_);
                }
                if ((this.bitField0_ & 128) != 0) {
                    iComputeStringSize += CodedOutputStream.computeEnumSize(9, this.alertType_);
                }
                if ((this.bitField0_ & 256) != 0) {
                    iComputeStringSize += GeneratedMessageV3.computeStringSize(10, this.provider_);
                }
                if ((this.bitField0_ & 512) != 0) {
                    iComputeStringSize += CodedOutputStream.computeUInt32Size(11, this.priority_);
                }
                if ((this.bitField0_ & 1024) != 0) {
                    iComputeStringSize += CodedOutputStream.computeEnumSize(12, this.alertEnum_);
                }
                int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
            public WeatherSeverity getSeverity() {
                WeatherSeverity weatherSeverityForNumber = WeatherSeverity.forNumber(this.severity_);
                return weatherSeverityForNumber == null ? WeatherSeverity.UNKNOWN : weatherSeverityForNumber;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
            public String getText() {
                Object obj = this.text_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.text_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
            public ByteString getTextBytes() {
                Object obj = this.text_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.text_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
            public WeatherZone getWeatherZone(int i14) {
                return this.weatherZone_.get(i14);
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
            public int getWeatherZoneCount() {
                return this.weatherZone_.size();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
            public List<WeatherZone> getWeatherZoneList() {
                return this.weatherZone_;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
            public WeatherZoneOrBuilder getWeatherZoneOrBuilder(int i14) {
                return this.weatherZone_.get(i14);
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
            public List<? extends WeatherZoneOrBuilder> getWeatherZoneOrBuilderList() {
                return this.weatherZone_;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
            public boolean hasAdhocZone() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
            public boolean hasAlertEnum() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
            public boolean hasAlertType() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
            public boolean hasCaption() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
            public boolean hasExpireTime() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
            public boolean hasIssueTime() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
            public boolean hasPriority() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
            public boolean hasProvider() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
            public boolean hasReportId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
            public boolean hasSeverity() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
            public boolean hasText() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i14 = this.memoizedHashCode;
                if (i14 != 0) {
                    return i14;
                }
                int iHashCode = getDescriptor().hashCode() + 779;
                if (hasReportId()) {
                    iHashCode = e5.c(iHashCode, 37, 1, 53) + getReportId().hashCode();
                }
                if (hasSeverity()) {
                    iHashCode = e5.c(iHashCode, 37, 2, 53) + this.severity_;
                }
                if (hasText()) {
                    iHashCode = e5.c(iHashCode, 37, 3, 53) + getText().hashCode();
                }
                if (hasIssueTime()) {
                    iHashCode = e5.c(iHashCode, 37, 4, 53) + Internal.hashLong(getIssueTime());
                }
                if (hasExpireTime()) {
                    iHashCode = e5.c(iHashCode, 37, 5, 53) + Internal.hashLong(getExpireTime());
                }
                if (getWeatherZoneCount() > 0) {
                    iHashCode = e5.c(iHashCode, 37, 6, 53) + getWeatherZoneList().hashCode();
                }
                if (hasAdhocZone()) {
                    iHashCode = e5.c(iHashCode, 37, 7, 53) + getAdhocZone().hashCode();
                }
                if (hasCaption()) {
                    iHashCode = e5.c(iHashCode, 37, 8, 53) + getCaption().hashCode();
                }
                if (hasAlertType()) {
                    iHashCode = e5.c(iHashCode, 37, 9, 53) + this.alertType_;
                }
                if (hasProvider()) {
                    iHashCode = e5.c(iHashCode, 37, 10, 53) + getProvider().hashCode();
                }
                if (hasPriority()) {
                    iHashCode = e5.c(iHashCode, 37, 11, 53) + getPriority();
                }
                if (hasAlertEnum()) {
                    iHashCode = e5.c(iHashCode, 37, 12, 53) + this.alertEnum_;
                }
                int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WeatherProto.internal_static_CSM_Proto_Weather_AlertsResponse_SevereWeatherReport_fieldAccessorTable.ensureFieldAccessorsInitialized(SevereWeatherReport.class, Builder.class);
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
                for (int i14 = 0; i14 < getWeatherZoneCount(); i14++) {
                    if (!getWeatherZone(i14).isInitialized()) {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }
                }
                if (!hasAdhocZone() || getAdhocZone().isInitialized()) {
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
                return new SevereWeatherReport();
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                int i14 = 0;
                return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                if ((this.bitField0_ & 1) != 0) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.reportId_);
                }
                if ((this.bitField0_ & 2) != 0) {
                    codedOutputStream.writeEnum(2, this.severity_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    GeneratedMessageV3.writeString(codedOutputStream, 3, this.text_);
                }
                if ((this.bitField0_ & 8) != 0) {
                    codedOutputStream.writeUInt64(4, this.issueTime_);
                }
                if ((this.bitField0_ & 16) != 0) {
                    codedOutputStream.writeUInt64(5, this.expireTime_);
                }
                for (int i14 = 0; i14 < this.weatherZone_.size(); i14++) {
                    codedOutputStream.writeMessage(6, this.weatherZone_.get(i14));
                }
                if ((this.bitField0_ & 32) != 0) {
                    codedOutputStream.writeMessage(7, getAdhocZone());
                }
                if ((this.bitField0_ & 64) != 0) {
                    GeneratedMessageV3.writeString(codedOutputStream, 8, this.caption_);
                }
                if ((this.bitField0_ & 128) != 0) {
                    codedOutputStream.writeEnum(9, this.alertType_);
                }
                if ((this.bitField0_ & 256) != 0) {
                    GeneratedMessageV3.writeString(codedOutputStream, 10, this.provider_);
                }
                if ((this.bitField0_ & 512) != 0) {
                    codedOutputStream.writeUInt32(11, this.priority_);
                }
                if ((this.bitField0_ & 1024) != 0) {
                    codedOutputStream.writeEnum(12, this.alertEnum_);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SevereWeatherReportOrBuilder {
                private SingleFieldBuilderV3<AdhocZone, AdhocZone.Builder, AdhocZoneOrBuilder> adhocZoneBuilder_;
                private AdhocZone adhocZone_;
                private int alertEnum_;
                private int alertType_;
                private int bitField0_;
                private Object caption_;
                private long expireTime_;
                private long issueTime_;
                private int priority_;
                private Object provider_;
                private Object reportId_;
                private int severity_;
                private Object text_;
                private RepeatedFieldBuilderV3<WeatherZone, WeatherZone.Builder, WeatherZoneOrBuilder> weatherZoneBuilder_;
                private List<WeatherZone> weatherZone_;

                private Builder() {
                    this.reportId_ = "";
                    this.severity_ = 0;
                    this.text_ = "";
                    this.weatherZone_ = Collections.EMPTY_LIST;
                    this.caption_ = "";
                    this.alertType_ = 0;
                    this.provider_ = "";
                    this.alertEnum_ = 1;
                    maybeForceBuilderInitialization();
                }

                private void buildPartial0(SevereWeatherReport severeWeatherReport) {
                    int i14;
                    int i15 = this.bitField0_;
                    if ((i15 & 1) != 0) {
                        severeWeatherReport.reportId_ = this.reportId_;
                        i14 = 1;
                    } else {
                        i14 = 0;
                    }
                    if ((i15 & 2) != 0) {
                        severeWeatherReport.severity_ = this.severity_;
                        i14 |= 2;
                    }
                    if ((i15 & 4) != 0) {
                        severeWeatherReport.text_ = this.text_;
                        i14 |= 4;
                    }
                    if ((i15 & 8) != 0) {
                        severeWeatherReport.issueTime_ = this.issueTime_;
                        i14 |= 8;
                    }
                    if ((i15 & 16) != 0) {
                        severeWeatherReport.expireTime_ = this.expireTime_;
                        i14 |= 16;
                    }
                    if ((i15 & 64) != 0) {
                        SingleFieldBuilderV3<AdhocZone, AdhocZone.Builder, AdhocZoneOrBuilder> singleFieldBuilderV3 = this.adhocZoneBuilder_;
                        severeWeatherReport.adhocZone_ = singleFieldBuilderV3 == null ? this.adhocZone_ : (AdhocZone) singleFieldBuilderV3.build();
                        i14 |= 32;
                    }
                    if ((i15 & 128) != 0) {
                        severeWeatherReport.caption_ = this.caption_;
                        i14 |= 64;
                    }
                    if ((i15 & 256) != 0) {
                        severeWeatherReport.alertType_ = this.alertType_;
                        i14 |= 128;
                    }
                    if ((i15 & 512) != 0) {
                        severeWeatherReport.provider_ = this.provider_;
                        i14 |= 256;
                    }
                    if ((i15 & 1024) != 0) {
                        severeWeatherReport.priority_ = this.priority_;
                        i14 |= 512;
                    }
                    if ((i15 & 2048) != 0) {
                        severeWeatherReport.alertEnum_ = this.alertEnum_;
                        i14 |= 1024;
                    }
                    severeWeatherReport.bitField0_ |= i14;
                }

                private void buildPartialRepeatedFields(SevereWeatherReport severeWeatherReport) {
                    RepeatedFieldBuilderV3<WeatherZone, WeatherZone.Builder, WeatherZoneOrBuilder> repeatedFieldBuilderV3 = this.weatherZoneBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        severeWeatherReport.weatherZone_ = repeatedFieldBuilderV3.build();
                        return;
                    }
                    if ((this.bitField0_ & 32) != 0) {
                        this.weatherZone_ = Collections.unmodifiableList(this.weatherZone_);
                        this.bitField0_ &= -33;
                    }
                    severeWeatherReport.weatherZone_ = this.weatherZone_;
                }

                private void ensureWeatherZoneIsMutable() {
                    if ((this.bitField0_ & 32) == 0) {
                        this.weatherZone_ = new ArrayList(this.weatherZone_);
                        this.bitField0_ |= 32;
                    }
                }

                private SingleFieldBuilderV3<AdhocZone, AdhocZone.Builder, AdhocZoneOrBuilder> getAdhocZoneFieldBuilder() {
                    if (this.adhocZoneBuilder_ == null) {
                        this.adhocZoneBuilder_ = new SingleFieldBuilderV3<>(getAdhocZone(), getParentForChildren(), isClean());
                        this.adhocZone_ = null;
                    }
                    return this.adhocZoneBuilder_;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return WeatherProto.internal_static_CSM_Proto_Weather_AlertsResponse_SevereWeatherReport_descriptor;
                }

                private RepeatedFieldBuilderV3<WeatherZone, WeatherZone.Builder, WeatherZoneOrBuilder> getWeatherZoneFieldBuilder() {
                    if (this.weatherZoneBuilder_ == null) {
                        this.weatherZoneBuilder_ = new RepeatedFieldBuilderV3<>(this.weatherZone_, (this.bitField0_ & 32) != 0, getParentForChildren(), isClean());
                        this.weatherZone_ = null;
                    }
                    return this.weatherZoneBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                        getWeatherZoneFieldBuilder();
                        getAdhocZoneFieldBuilder();
                    }
                }

                public Builder addAllWeatherZone(Iterable<? extends WeatherZone> iterable) {
                    RepeatedFieldBuilderV3<WeatherZone, WeatherZone.Builder, WeatherZoneOrBuilder> repeatedFieldBuilderV3 = this.weatherZoneBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addAllMessages(iterable);
                        return this;
                    }
                    ensureWeatherZoneIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.weatherZone_);
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                public Builder addWeatherZone(WeatherZone.Builder builder) {
                    RepeatedFieldBuilderV3<WeatherZone, WeatherZone.Builder, WeatherZoneOrBuilder> repeatedFieldBuilderV3 = this.weatherZoneBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(builder.build());
                        return this;
                    }
                    ensureWeatherZoneIsMutable();
                    this.weatherZone_.add(builder.build());
                    onChanged();
                    return this;
                }

                public WeatherZone.Builder addWeatherZoneBuilder() {
                    return (WeatherZone.Builder) getWeatherZoneFieldBuilder().addBuilder(WeatherZone.getDefaultInstance());
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public SevereWeatherReport build() {
                    SevereWeatherReport severeWeatherReportBuildPartial = buildPartial();
                    if (severeWeatherReportBuildPartial.isInitialized()) {
                        return severeWeatherReportBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) severeWeatherReportBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public SevereWeatherReport buildPartial() {
                    SevereWeatherReport severeWeatherReport = new SevereWeatherReport(this);
                    buildPartialRepeatedFields(severeWeatherReport);
                    if (this.bitField0_ != 0) {
                        buildPartial0(severeWeatherReport);
                    }
                    onBuilt();
                    return severeWeatherReport;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.reportId_ = "";
                    this.severity_ = 0;
                    this.text_ = "";
                    this.issueTime_ = 0L;
                    this.expireTime_ = 0L;
                    RepeatedFieldBuilderV3<WeatherZone, WeatherZone.Builder, WeatherZoneOrBuilder> repeatedFieldBuilderV3 = this.weatherZoneBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        this.weatherZone_ = Collections.EMPTY_LIST;
                    } else {
                        this.weatherZone_ = null;
                        repeatedFieldBuilderV3.clear();
                    }
                    this.bitField0_ &= -33;
                    this.adhocZone_ = null;
                    SingleFieldBuilderV3<AdhocZone, AdhocZone.Builder, AdhocZoneOrBuilder> singleFieldBuilderV3 = this.adhocZoneBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.dispose();
                        this.adhocZoneBuilder_ = null;
                    }
                    this.caption_ = "";
                    this.alertType_ = 0;
                    this.provider_ = "";
                    this.priority_ = 0;
                    this.alertEnum_ = 1;
                    return this;
                }

                public Builder clearAdhocZone() {
                    this.bitField0_ &= -65;
                    this.adhocZone_ = null;
                    SingleFieldBuilderV3<AdhocZone, AdhocZone.Builder, AdhocZoneOrBuilder> singleFieldBuilderV3 = this.adhocZoneBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.dispose();
                        this.adhocZoneBuilder_ = null;
                    }
                    onChanged();
                    return this;
                }

                public Builder clearAlertEnum() {
                    this.bitField0_ &= -2049;
                    this.alertEnum_ = 1;
                    onChanged();
                    return this;
                }

                public Builder clearAlertType() {
                    this.bitField0_ &= -257;
                    this.alertType_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearCaption() {
                    this.caption_ = SevereWeatherReport.getDefaultInstance().getCaption();
                    this.bitField0_ &= -129;
                    onChanged();
                    return this;
                }

                public Builder clearExpireTime() {
                    this.bitField0_ &= -17;
                    this.expireTime_ = 0L;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                public Builder clearIssueTime() {
                    this.bitField0_ &= -9;
                    this.issueTime_ = 0L;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (Builder) super.clearOneof(oneofDescriptor);
                }

                public Builder clearPriority() {
                    this.bitField0_ &= -1025;
                    this.priority_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearProvider() {
                    this.provider_ = SevereWeatherReport.getDefaultInstance().getProvider();
                    this.bitField0_ &= -513;
                    onChanged();
                    return this;
                }

                public Builder clearReportId() {
                    this.reportId_ = SevereWeatherReport.getDefaultInstance().getReportId();
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearSeverity() {
                    this.bitField0_ &= -3;
                    this.severity_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearText() {
                    this.text_ = SevereWeatherReport.getDefaultInstance().getText();
                    this.bitField0_ &= -5;
                    onChanged();
                    return this;
                }

                public Builder clearWeatherZone() {
                    RepeatedFieldBuilderV3<WeatherZone, WeatherZone.Builder, WeatherZoneOrBuilder> repeatedFieldBuilderV3 = this.weatherZoneBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.clear();
                        return this;
                    }
                    this.weatherZone_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -33;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo57clone() {
                    return (Builder) super.mo57clone();
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
                public AdhocZone getAdhocZone() {
                    SingleFieldBuilderV3<AdhocZone, AdhocZone.Builder, AdhocZoneOrBuilder> singleFieldBuilderV3 = this.adhocZoneBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return (AdhocZone) singleFieldBuilderV3.getMessage();
                    }
                    AdhocZone adhocZone = this.adhocZone_;
                    return adhocZone == null ? AdhocZone.getDefaultInstance() : adhocZone;
                }

                public AdhocZone.Builder getAdhocZoneBuilder() {
                    this.bitField0_ |= 64;
                    onChanged();
                    return (AdhocZone.Builder) getAdhocZoneFieldBuilder().getBuilder();
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
                public AdhocZoneOrBuilder getAdhocZoneOrBuilder() {
                    SingleFieldBuilderV3<AdhocZone, AdhocZone.Builder, AdhocZoneOrBuilder> singleFieldBuilderV3 = this.adhocZoneBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return (AdhocZoneOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    AdhocZone adhocZone = this.adhocZone_;
                    return adhocZone == null ? AdhocZone.getDefaultInstance() : adhocZone;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
                public AlertEnum getAlertEnum() {
                    AlertEnum alertEnumForNumber = AlertEnum.forNumber(this.alertEnum_);
                    return alertEnumForNumber == null ? AlertEnum.TORNADO : alertEnumForNumber;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
                public AlertType getAlertType() {
                    AlertType alertTypeForNumber = AlertType.forNumber(this.alertType_);
                    return alertTypeForNumber == null ? AlertType.ALERT_ADVISORY : alertTypeForNumber;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
                public String getCaption() {
                    Object obj = this.caption_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String stringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.caption_ = stringUtf8;
                    }
                    return stringUtf8;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
                public ByteString getCaptionBytes() {
                    Object obj = this.caption_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.caption_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return WeatherProto.internal_static_CSM_Proto_Weather_AlertsResponse_SevereWeatherReport_descriptor;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
                public long getExpireTime() {
                    return this.expireTime_;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
                public long getIssueTime() {
                    return this.issueTime_;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
                public int getPriority() {
                    return this.priority_;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
                public String getProvider() {
                    Object obj = this.provider_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String stringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.provider_ = stringUtf8;
                    }
                    return stringUtf8;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
                public ByteString getProviderBytes() {
                    Object obj = this.provider_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.provider_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
                public String getReportId() {
                    Object obj = this.reportId_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String stringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.reportId_ = stringUtf8;
                    }
                    return stringUtf8;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
                public ByteString getReportIdBytes() {
                    Object obj = this.reportId_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.reportId_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
                public WeatherSeverity getSeverity() {
                    WeatherSeverity weatherSeverityForNumber = WeatherSeverity.forNumber(this.severity_);
                    return weatherSeverityForNumber == null ? WeatherSeverity.UNKNOWN : weatherSeverityForNumber;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
                public String getText() {
                    Object obj = this.text_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String stringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.text_ = stringUtf8;
                    }
                    return stringUtf8;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
                public ByteString getTextBytes() {
                    Object obj = this.text_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.text_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
                public WeatherZone getWeatherZone(int i14) {
                    RepeatedFieldBuilderV3<WeatherZone, WeatherZone.Builder, WeatherZoneOrBuilder> repeatedFieldBuilderV3 = this.weatherZoneBuilder_;
                    return repeatedFieldBuilderV3 == null ? this.weatherZone_.get(i14) : (WeatherZone) repeatedFieldBuilderV3.getMessage(i14);
                }

                public WeatherZone.Builder getWeatherZoneBuilder(int i14) {
                    return (WeatherZone.Builder) getWeatherZoneFieldBuilder().getBuilder(i14);
                }

                public List<WeatherZone.Builder> getWeatherZoneBuilderList() {
                    return getWeatherZoneFieldBuilder().getBuilderList();
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
                public int getWeatherZoneCount() {
                    RepeatedFieldBuilderV3<WeatherZone, WeatherZone.Builder, WeatherZoneOrBuilder> repeatedFieldBuilderV3 = this.weatherZoneBuilder_;
                    return repeatedFieldBuilderV3 == null ? this.weatherZone_.size() : repeatedFieldBuilderV3.getCount();
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
                public List<WeatherZone> getWeatherZoneList() {
                    RepeatedFieldBuilderV3<WeatherZone, WeatherZone.Builder, WeatherZoneOrBuilder> repeatedFieldBuilderV3 = this.weatherZoneBuilder_;
                    return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.weatherZone_) : repeatedFieldBuilderV3.getMessageList();
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
                public WeatherZoneOrBuilder getWeatherZoneOrBuilder(int i14) {
                    RepeatedFieldBuilderV3<WeatherZone, WeatherZone.Builder, WeatherZoneOrBuilder> repeatedFieldBuilderV3 = this.weatherZoneBuilder_;
                    return repeatedFieldBuilderV3 == null ? this.weatherZone_.get(i14) : (WeatherZoneOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
                public List<? extends WeatherZoneOrBuilder> getWeatherZoneOrBuilderList() {
                    RepeatedFieldBuilderV3<WeatherZone, WeatherZone.Builder, WeatherZoneOrBuilder> repeatedFieldBuilderV3 = this.weatherZoneBuilder_;
                    return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.weatherZone_);
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
                public boolean hasAdhocZone() {
                    return (this.bitField0_ & 64) != 0;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
                public boolean hasAlertEnum() {
                    return (this.bitField0_ & 2048) != 0;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
                public boolean hasAlertType() {
                    return (this.bitField0_ & 256) != 0;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
                public boolean hasCaption() {
                    return (this.bitField0_ & 128) != 0;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
                public boolean hasExpireTime() {
                    return (this.bitField0_ & 16) != 0;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
                public boolean hasIssueTime() {
                    return (this.bitField0_ & 8) != 0;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
                public boolean hasPriority() {
                    return (this.bitField0_ & 1024) != 0;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
                public boolean hasProvider() {
                    return (this.bitField0_ & 512) != 0;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
                public boolean hasReportId() {
                    return (this.bitField0_ & 1) != 0;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
                public boolean hasSeverity() {
                    return (this.bitField0_ & 2) != 0;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponse.SevereWeatherReportOrBuilder
                public boolean hasText() {
                    return (this.bitField0_ & 4) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return WeatherProto.internal_static_CSM_Proto_Weather_AlertsResponse_SevereWeatherReport_fieldAccessorTable.ensureFieldAccessorsInitialized(SevereWeatherReport.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    for (int i14 = 0; i14 < getWeatherZoneCount(); i14++) {
                        if (!getWeatherZone(i14).isInitialized()) {
                            return false;
                        }
                    }
                    return !hasAdhocZone() || getAdhocZone().isInitialized();
                }

                public Builder mergeAdhocZone(AdhocZone adhocZone) {
                    AdhocZone adhocZone2;
                    SingleFieldBuilderV3<AdhocZone, AdhocZone.Builder, AdhocZoneOrBuilder> singleFieldBuilderV3 = this.adhocZoneBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.mergeFrom(adhocZone);
                    } else if ((this.bitField0_ & 64) == 0 || (adhocZone2 = this.adhocZone_) == null || adhocZone2 == AdhocZone.getDefaultInstance()) {
                        this.adhocZone_ = adhocZone;
                    } else {
                        getAdhocZoneBuilder().mergeFrom(adhocZone);
                    }
                    this.bitField0_ |= 64;
                    onChanged();
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
                                        this.reportId_ = codedInputStream.readBytes();
                                        this.bitField0_ |= 1;
                                        continue;
                                    case 16:
                                        int i14 = codedInputStream.readEnum();
                                        if (WeatherSeverity.forNumber(i14) == null) {
                                            mergeUnknownVarintField(2, i14);
                                        } else {
                                            this.severity_ = i14;
                                            this.bitField0_ |= 2;
                                            continue;
                                        }
                                        break;
                                    case 26:
                                        this.text_ = codedInputStream.readBytes();
                                        this.bitField0_ |= 4;
                                        continue;
                                    case 32:
                                        this.issueTime_ = codedInputStream.readUInt64();
                                        this.bitField0_ |= 8;
                                        continue;
                                    case 40:
                                        this.expireTime_ = codedInputStream.readUInt64();
                                        this.bitField0_ |= 16;
                                        continue;
                                    case 50:
                                        WeatherZone weatherZone = (WeatherZone) codedInputStream.readMessage(WeatherZone.PARSER, extensionRegistryLite);
                                        RepeatedFieldBuilderV3<WeatherZone, WeatherZone.Builder, WeatherZoneOrBuilder> repeatedFieldBuilderV3 = this.weatherZoneBuilder_;
                                        if (repeatedFieldBuilderV3 == null) {
                                            ensureWeatherZoneIsMutable();
                                            this.weatherZone_.add(weatherZone);
                                        } else {
                                            repeatedFieldBuilderV3.addMessage(weatherZone);
                                            continue;
                                        }
                                        break;
                                    case 58:
                                        codedInputStream.readMessage(getAdhocZoneFieldBuilder().getBuilder(), extensionRegistryLite);
                                        this.bitField0_ |= 64;
                                        continue;
                                    case 66:
                                        this.caption_ = codedInputStream.readBytes();
                                        this.bitField0_ |= 128;
                                        continue;
                                    case 72:
                                        int i15 = codedInputStream.readEnum();
                                        if (AlertType.forNumber(i15) == null) {
                                            mergeUnknownVarintField(9, i15);
                                        } else {
                                            this.alertType_ = i15;
                                            this.bitField0_ |= 256;
                                            continue;
                                        }
                                        break;
                                    case 82:
                                        this.provider_ = codedInputStream.readBytes();
                                        this.bitField0_ |= 512;
                                        continue;
                                    case 88:
                                        this.priority_ = codedInputStream.readUInt32();
                                        this.bitField0_ |= 1024;
                                        continue;
                                    case 96:
                                        int i16 = codedInputStream.readEnum();
                                        if (AlertEnum.forNumber(i16) == null) {
                                            mergeUnknownVarintField(12, i16);
                                        } else {
                                            this.alertEnum_ = i16;
                                            this.bitField0_ |= 2048;
                                            continue;
                                        }
                                        break;
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

                public Builder removeWeatherZone(int i14) {
                    RepeatedFieldBuilderV3<WeatherZone, WeatherZone.Builder, WeatherZoneOrBuilder> repeatedFieldBuilderV3 = this.weatherZoneBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.remove(i14);
                        return this;
                    }
                    ensureWeatherZoneIsMutable();
                    this.weatherZone_.remove(i14);
                    onChanged();
                    return this;
                }

                public Builder setAdhocZone(AdhocZone.Builder builder) {
                    SingleFieldBuilderV3<AdhocZone, AdhocZone.Builder, AdhocZoneOrBuilder> singleFieldBuilderV3 = this.adhocZoneBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.adhocZone_ = builder.build();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    this.bitField0_ |= 64;
                    onChanged();
                    return this;
                }

                public Builder setAlertEnum(AlertEnum alertEnum) {
                    alertEnum.getClass();
                    this.bitField0_ |= 2048;
                    this.alertEnum_ = alertEnum.getNumber();
                    onChanged();
                    return this;
                }

                public Builder setAlertType(AlertType alertType) {
                    alertType.getClass();
                    this.bitField0_ |= 256;
                    this.alertType_ = alertType.getNumber();
                    onChanged();
                    return this;
                }

                public Builder setCaption(String str) {
                    str.getClass();
                    this.caption_ = str;
                    this.bitField0_ |= 128;
                    onChanged();
                    return this;
                }

                public Builder setCaptionBytes(ByteString byteString) {
                    byteString.getClass();
                    this.caption_ = byteString;
                    this.bitField0_ |= 128;
                    onChanged();
                    return this;
                }

                public Builder setExpireTime(long j8) {
                    this.expireTime_ = j8;
                    this.bitField0_ |= 16;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.setField(fieldDescriptor, obj);
                }

                public Builder setIssueTime(long j8) {
                    this.issueTime_ = j8;
                    this.bitField0_ |= 8;
                    onChanged();
                    return this;
                }

                public Builder setPriority(int i14) {
                    this.priority_ = i14;
                    this.bitField0_ |= 1024;
                    onChanged();
                    return this;
                }

                public Builder setProvider(String str) {
                    str.getClass();
                    this.provider_ = str;
                    this.bitField0_ |= 512;
                    onChanged();
                    return this;
                }

                public Builder setProviderBytes(ByteString byteString) {
                    byteString.getClass();
                    this.provider_ = byteString;
                    this.bitField0_ |= 512;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                    return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
                }

                public Builder setReportId(String str) {
                    str.getClass();
                    this.reportId_ = str;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setReportIdBytes(ByteString byteString) {
                    byteString.getClass();
                    this.reportId_ = byteString;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setSeverity(WeatherSeverity weatherSeverity) {
                    weatherSeverity.getClass();
                    this.bitField0_ |= 2;
                    this.severity_ = weatherSeverity.getNumber();
                    onChanged();
                    return this;
                }

                public Builder setText(String str) {
                    str.getClass();
                    this.text_ = str;
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                public Builder setTextBytes(ByteString byteString) {
                    byteString.getClass();
                    this.text_ = byteString;
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.setUnknownFields(unknownFieldSet);
                }

                public Builder setWeatherZone(int i14, WeatherZone.Builder builder) {
                    RepeatedFieldBuilderV3<WeatherZone, WeatherZone.Builder, WeatherZoneOrBuilder> repeatedFieldBuilderV3 = this.weatherZoneBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.setMessage(i14, builder.build());
                        return this;
                    }
                    ensureWeatherZoneIsMutable();
                    this.weatherZone_.set(i14, builder.build());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public SevereWeatherReport getDefaultInstanceForType() {
                    return SevereWeatherReport.getDefaultInstance();
                }

                public WeatherZone.Builder addWeatherZoneBuilder(int i14) {
                    return (WeatherZone.Builder) getWeatherZoneFieldBuilder().addBuilder(i14, WeatherZone.getDefaultInstance());
                }

                public Builder addWeatherZone(int i14, WeatherZone weatherZone) {
                    RepeatedFieldBuilderV3<WeatherZone, WeatherZone.Builder, WeatherZoneOrBuilder> repeatedFieldBuilderV3 = this.weatherZoneBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        weatherZone.getClass();
                        ensureWeatherZoneIsMutable();
                        this.weatherZone_.add(i14, weatherZone);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilderV3.addMessage(i14, weatherZone);
                    return this;
                }

                public Builder setAdhocZone(AdhocZone adhocZone) {
                    SingleFieldBuilderV3<AdhocZone, AdhocZone.Builder, AdhocZoneOrBuilder> singleFieldBuilderV3 = this.adhocZoneBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        adhocZone.getClass();
                        this.adhocZone_ = adhocZone;
                    } else {
                        singleFieldBuilderV3.setMessage(adhocZone);
                    }
                    this.bitField0_ |= 64;
                    onChanged();
                    return this;
                }

                public Builder setWeatherZone(int i14, WeatherZone weatherZone) {
                    RepeatedFieldBuilderV3<WeatherZone, WeatherZone.Builder, WeatherZoneOrBuilder> repeatedFieldBuilderV3 = this.weatherZoneBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        weatherZone.getClass();
                        ensureWeatherZoneIsMutable();
                        this.weatherZone_.set(i14, weatherZone);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilderV3.setMessage(i14, weatherZone);
                    return this;
                }

                public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                    this(builderParent);
                }

                public /* synthetic */ Builder(int i14) {
                    this();
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.reportId_ = "";
                    this.severity_ = 0;
                    this.text_ = "";
                    this.weatherZone_ = Collections.EMPTY_LIST;
                    this.caption_ = "";
                    this.alertType_ = 0;
                    this.provider_ = "";
                    this.alertEnum_ = 1;
                    maybeForceBuilderInitialization();
                }

                public Builder addWeatherZone(WeatherZone weatherZone) {
                    RepeatedFieldBuilderV3<WeatherZone, WeatherZone.Builder, WeatherZoneOrBuilder> repeatedFieldBuilderV3 = this.weatherZoneBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        weatherZone.getClass();
                        ensureWeatherZoneIsMutable();
                        this.weatherZone_.add(weatherZone);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilderV3.addMessage(weatherZone);
                    return this;
                }

                public Builder addWeatherZone(int i14, WeatherZone.Builder builder) {
                    RepeatedFieldBuilderV3<WeatherZone, WeatherZone.Builder, WeatherZoneOrBuilder> repeatedFieldBuilderV3 = this.weatherZoneBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureWeatherZoneIsMutable();
                        this.weatherZone_.add(i14, builder.build());
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilderV3.addMessage(i14, builder.build());
                    return this;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof SevereWeatherReport) {
                        return mergeFrom((SevereWeatherReport) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(SevereWeatherReport severeWeatherReport) {
                    if (severeWeatherReport == SevereWeatherReport.getDefaultInstance()) {
                        return this;
                    }
                    if (severeWeatherReport.hasReportId()) {
                        this.reportId_ = severeWeatherReport.reportId_;
                        this.bitField0_ |= 1;
                        onChanged();
                    }
                    if (severeWeatherReport.hasSeverity()) {
                        setSeverity(severeWeatherReport.getSeverity());
                    }
                    if (severeWeatherReport.hasText()) {
                        this.text_ = severeWeatherReport.text_;
                        this.bitField0_ |= 4;
                        onChanged();
                    }
                    if (severeWeatherReport.hasIssueTime()) {
                        setIssueTime(severeWeatherReport.getIssueTime());
                    }
                    if (severeWeatherReport.hasExpireTime()) {
                        setExpireTime(severeWeatherReport.getExpireTime());
                    }
                    if (this.weatherZoneBuilder_ == null) {
                        if (!severeWeatherReport.weatherZone_.isEmpty()) {
                            if (this.weatherZone_.isEmpty()) {
                                this.weatherZone_ = severeWeatherReport.weatherZone_;
                                this.bitField0_ &= -33;
                            } else {
                                ensureWeatherZoneIsMutable();
                                this.weatherZone_.addAll(severeWeatherReport.weatherZone_);
                            }
                            onChanged();
                        }
                    } else if (!severeWeatherReport.weatherZone_.isEmpty()) {
                        boolean zIsEmpty = this.weatherZoneBuilder_.isEmpty();
                        RepeatedFieldBuilderV3<WeatherZone, WeatherZone.Builder, WeatherZoneOrBuilder> repeatedFieldBuilderV3 = this.weatherZoneBuilder_;
                        if (zIsEmpty) {
                            repeatedFieldBuilderV3.dispose();
                            this.weatherZoneBuilder_ = null;
                            this.weatherZone_ = severeWeatherReport.weatherZone_;
                            this.bitField0_ &= -33;
                            this.weatherZoneBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getWeatherZoneFieldBuilder() : null;
                        } else {
                            repeatedFieldBuilderV3.addAllMessages(severeWeatherReport.weatherZone_);
                        }
                    }
                    if (severeWeatherReport.hasAdhocZone()) {
                        mergeAdhocZone(severeWeatherReport.getAdhocZone());
                    }
                    if (severeWeatherReport.hasCaption()) {
                        this.caption_ = severeWeatherReport.caption_;
                        this.bitField0_ |= 128;
                        onChanged();
                    }
                    if (severeWeatherReport.hasAlertType()) {
                        setAlertType(severeWeatherReport.getAlertType());
                    }
                    if (severeWeatherReport.hasProvider()) {
                        this.provider_ = severeWeatherReport.provider_;
                        this.bitField0_ |= 512;
                        onChanged();
                    }
                    if (severeWeatherReport.hasPriority()) {
                        setPriority(severeWeatherReport.getPriority());
                    }
                    if (severeWeatherReport.hasAlertEnum()) {
                        setAlertEnum(severeWeatherReport.getAlertEnum());
                    }
                    mergeUnknownFields(severeWeatherReport.getUnknownFields());
                    onChanged();
                    return this;
                }
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SevereWeatherReport getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public static SevereWeatherReport parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SevereWeatherReport) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static SevereWeatherReport parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static SevereWeatherReport parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static SevereWeatherReport parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static SevereWeatherReport parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            public static SevereWeatherReport parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static SevereWeatherReport parseFrom(InputStream inputStream) {
                return (SevereWeatherReport) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static SevereWeatherReport parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SevereWeatherReport) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static SevereWeatherReport parseFrom(CodedInputStream codedInputStream) {
                return (SevereWeatherReport) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static SevereWeatherReport parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (SevereWeatherReport) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            private SevereWeatherReport(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.reportId_ = "";
                this.severity_ = 0;
                this.text_ = "";
                this.issueTime_ = 0L;
                this.expireTime_ = 0L;
                this.caption_ = "";
                this.alertType_ = 0;
                this.provider_ = "";
                this.priority_ = 0;
                this.alertEnum_ = 1;
                this.memoizedIsInitialized = (byte) -1;
            }

            public /* synthetic */ SevereWeatherReport(Builder builder) {
                this((GeneratedMessageV3.Builder<?>) builder);
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AlertsResponseOrBuilder {
            private int bitField0_;
            private Object queryCookie_;
            private RepeatedFieldBuilderV3<SevereWeatherReport, SevereWeatherReport.Builder, SevereWeatherReportOrBuilder> severeWeatherReportBuilder_;
            private List<SevereWeatherReport> severeWeatherReport_;

            private Builder() {
                this.severeWeatherReport_ = Collections.EMPTY_LIST;
                this.queryCookie_ = "";
            }

            private void buildPartial0(AlertsResponse alertsResponse) {
                int i14;
                if ((this.bitField0_ & 2) != 0) {
                    alertsResponse.queryCookie_ = this.queryCookie_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                alertsResponse.bitField0_ = i14 | alertsResponse.bitField0_;
            }

            private void buildPartialRepeatedFields(AlertsResponse alertsResponse) {
                RepeatedFieldBuilderV3<SevereWeatherReport, SevereWeatherReport.Builder, SevereWeatherReportOrBuilder> repeatedFieldBuilderV3 = this.severeWeatherReportBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    alertsResponse.severeWeatherReport_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.severeWeatherReport_ = Collections.unmodifiableList(this.severeWeatherReport_);
                    this.bitField0_ &= -2;
                }
                alertsResponse.severeWeatherReport_ = this.severeWeatherReport_;
            }

            private void ensureSevereWeatherReportIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.severeWeatherReport_ = new ArrayList(this.severeWeatherReport_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WeatherProto.internal_static_CSM_Proto_Weather_AlertsResponse_descriptor;
            }

            private RepeatedFieldBuilderV3<SevereWeatherReport, SevereWeatherReport.Builder, SevereWeatherReportOrBuilder> getSevereWeatherReportFieldBuilder() {
                if (this.severeWeatherReportBuilder_ == null) {
                    this.severeWeatherReportBuilder_ = new RepeatedFieldBuilderV3<>(this.severeWeatherReport_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.severeWeatherReport_ = null;
                }
                return this.severeWeatherReportBuilder_;
            }

            public Builder addAllSevereWeatherReport(Iterable<? extends SevereWeatherReport> iterable) {
                RepeatedFieldBuilderV3<SevereWeatherReport, SevereWeatherReport.Builder, SevereWeatherReportOrBuilder> repeatedFieldBuilderV3 = this.severeWeatherReportBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureSevereWeatherReportIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.severeWeatherReport_);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addSevereWeatherReport(SevereWeatherReport.Builder builder) {
                RepeatedFieldBuilderV3<SevereWeatherReport, SevereWeatherReport.Builder, SevereWeatherReportOrBuilder> repeatedFieldBuilderV3 = this.severeWeatherReportBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureSevereWeatherReportIsMutable();
                this.severeWeatherReport_.add(builder.build());
                onChanged();
                return this;
            }

            public SevereWeatherReport.Builder addSevereWeatherReportBuilder() {
                return (SevereWeatherReport.Builder) getSevereWeatherReportFieldBuilder().addBuilder(SevereWeatherReport.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlertsResponse build() {
                AlertsResponse alertsResponseBuildPartial = buildPartial();
                if (alertsResponseBuildPartial.isInitialized()) {
                    return alertsResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) alertsResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlertsResponse buildPartial() {
                AlertsResponse alertsResponse = new AlertsResponse(this);
                buildPartialRepeatedFields(alertsResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(alertsResponse);
                }
                onBuilt();
                return alertsResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<SevereWeatherReport, SevereWeatherReport.Builder, SevereWeatherReportOrBuilder> repeatedFieldBuilderV3 = this.severeWeatherReportBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.severeWeatherReport_ = Collections.EMPTY_LIST;
                } else {
                    this.severeWeatherReport_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                this.queryCookie_ = "";
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

            public Builder clearQueryCookie() {
                this.queryCookie_ = AlertsResponse.getDefaultInstance().getQueryCookie();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearSevereWeatherReport() {
                RepeatedFieldBuilderV3<SevereWeatherReport, SevereWeatherReport.Builder, SevereWeatherReportOrBuilder> repeatedFieldBuilderV3 = this.severeWeatherReportBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.severeWeatherReport_ = Collections.EMPTY_LIST;
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
                return WeatherProto.internal_static_CSM_Proto_Weather_AlertsResponse_descriptor;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponseOrBuilder
            public String getQueryCookie() {
                Object obj = this.queryCookie_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.queryCookie_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponseOrBuilder
            public ByteString getQueryCookieBytes() {
                Object obj = this.queryCookie_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.queryCookie_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponseOrBuilder
            public SevereWeatherReport getSevereWeatherReport(int i14) {
                RepeatedFieldBuilderV3<SevereWeatherReport, SevereWeatherReport.Builder, SevereWeatherReportOrBuilder> repeatedFieldBuilderV3 = this.severeWeatherReportBuilder_;
                return repeatedFieldBuilderV3 == null ? this.severeWeatherReport_.get(i14) : (SevereWeatherReport) repeatedFieldBuilderV3.getMessage(i14);
            }

            public SevereWeatherReport.Builder getSevereWeatherReportBuilder(int i14) {
                return (SevereWeatherReport.Builder) getSevereWeatherReportFieldBuilder().getBuilder(i14);
            }

            public List<SevereWeatherReport.Builder> getSevereWeatherReportBuilderList() {
                return getSevereWeatherReportFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponseOrBuilder
            public int getSevereWeatherReportCount() {
                RepeatedFieldBuilderV3<SevereWeatherReport, SevereWeatherReport.Builder, SevereWeatherReportOrBuilder> repeatedFieldBuilderV3 = this.severeWeatherReportBuilder_;
                return repeatedFieldBuilderV3 == null ? this.severeWeatherReport_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponseOrBuilder
            public List<SevereWeatherReport> getSevereWeatherReportList() {
                RepeatedFieldBuilderV3<SevereWeatherReport, SevereWeatherReport.Builder, SevereWeatherReportOrBuilder> repeatedFieldBuilderV3 = this.severeWeatherReportBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.severeWeatherReport_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponseOrBuilder
            public SevereWeatherReportOrBuilder getSevereWeatherReportOrBuilder(int i14) {
                RepeatedFieldBuilderV3<SevereWeatherReport, SevereWeatherReport.Builder, SevereWeatherReportOrBuilder> repeatedFieldBuilderV3 = this.severeWeatherReportBuilder_;
                return repeatedFieldBuilderV3 == null ? this.severeWeatherReport_.get(i14) : (SevereWeatherReportOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponseOrBuilder
            public List<? extends SevereWeatherReportOrBuilder> getSevereWeatherReportOrBuilderList() {
                RepeatedFieldBuilderV3<SevereWeatherReport, SevereWeatherReport.Builder, SevereWeatherReportOrBuilder> repeatedFieldBuilderV3 = this.severeWeatherReportBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.severeWeatherReport_);
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsResponseOrBuilder
            public boolean hasQueryCookie() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WeatherProto.internal_static_CSM_Proto_Weather_AlertsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(AlertsResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i14 = 0; i14 < getSevereWeatherReportCount(); i14++) {
                    if (!getSevereWeatherReport(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(AlertsResponse alertsResponse) {
                if (alertsResponse == AlertsResponse.getDefaultInstance()) {
                    return this;
                }
                if (this.severeWeatherReportBuilder_ == null) {
                    if (!alertsResponse.severeWeatherReport_.isEmpty()) {
                        if (this.severeWeatherReport_.isEmpty()) {
                            this.severeWeatherReport_ = alertsResponse.severeWeatherReport_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureSevereWeatherReportIsMutable();
                            this.severeWeatherReport_.addAll(alertsResponse.severeWeatherReport_);
                        }
                        onChanged();
                    }
                } else if (!alertsResponse.severeWeatherReport_.isEmpty()) {
                    boolean zIsEmpty = this.severeWeatherReportBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<SevereWeatherReport, SevereWeatherReport.Builder, SevereWeatherReportOrBuilder> repeatedFieldBuilderV3 = this.severeWeatherReportBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.severeWeatherReportBuilder_ = null;
                        this.severeWeatherReport_ = alertsResponse.severeWeatherReport_;
                        this.bitField0_ &= -2;
                        this.severeWeatherReportBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getSevereWeatherReportFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(alertsResponse.severeWeatherReport_);
                    }
                }
                if (alertsResponse.hasQueryCookie()) {
                    this.queryCookie_ = alertsResponse.queryCookie_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                mergeUnknownFields(alertsResponse.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeSevereWeatherReport(int i14) {
                RepeatedFieldBuilderV3<SevereWeatherReport, SevereWeatherReport.Builder, SevereWeatherReportOrBuilder> repeatedFieldBuilderV3 = this.severeWeatherReportBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureSevereWeatherReportIsMutable();
                this.severeWeatherReport_.remove(i14);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setQueryCookie(String str) {
                str.getClass();
                this.queryCookie_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setQueryCookieBytes(ByteString byteString) {
                byteString.getClass();
                this.queryCookie_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSevereWeatherReport(int i14, SevereWeatherReport.Builder builder) {
                RepeatedFieldBuilderV3<SevereWeatherReport, SevereWeatherReport.Builder, SevereWeatherReportOrBuilder> repeatedFieldBuilderV3 = this.severeWeatherReportBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureSevereWeatherReportIsMutable();
                this.severeWeatherReport_.set(i14, builder.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AlertsResponse getDefaultInstanceForType() {
                return AlertsResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.severeWeatherReport_ = Collections.EMPTY_LIST;
                this.queryCookie_ = "";
            }

            public SevereWeatherReport.Builder addSevereWeatherReportBuilder(int i14) {
                return (SevereWeatherReport.Builder) getSevereWeatherReportFieldBuilder().addBuilder(i14, SevereWeatherReport.getDefaultInstance());
            }

            public Builder addSevereWeatherReport(int i14, SevereWeatherReport severeWeatherReport) {
                RepeatedFieldBuilderV3<SevereWeatherReport, SevereWeatherReport.Builder, SevereWeatherReportOrBuilder> repeatedFieldBuilderV3 = this.severeWeatherReportBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    severeWeatherReport.getClass();
                    ensureSevereWeatherReportIsMutable();
                    this.severeWeatherReport_.add(i14, severeWeatherReport);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, severeWeatherReport);
                return this;
            }

            public Builder setSevereWeatherReport(int i14, SevereWeatherReport severeWeatherReport) {
                RepeatedFieldBuilderV3<SevereWeatherReport, SevereWeatherReport.Builder, SevereWeatherReportOrBuilder> repeatedFieldBuilderV3 = this.severeWeatherReportBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    severeWeatherReport.getClass();
                    ensureSevereWeatherReportIsMutable();
                    this.severeWeatherReport_.set(i14, severeWeatherReport);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, severeWeatherReport);
                return this;
            }

            public Builder addSevereWeatherReport(SevereWeatherReport severeWeatherReport) {
                RepeatedFieldBuilderV3<SevereWeatherReport, SevereWeatherReport.Builder, SevereWeatherReportOrBuilder> repeatedFieldBuilderV3 = this.severeWeatherReportBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    severeWeatherReport.getClass();
                    ensureSevereWeatherReportIsMutable();
                    this.severeWeatherReport_.add(severeWeatherReport);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(severeWeatherReport);
                return this;
            }

            public Builder addSevereWeatherReport(int i14, SevereWeatherReport.Builder builder) {
                RepeatedFieldBuilderV3<SevereWeatherReport, SevereWeatherReport.Builder, SevereWeatherReportOrBuilder> repeatedFieldBuilderV3 = this.severeWeatherReportBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureSevereWeatherReportIsMutable();
                    this.severeWeatherReport_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AlertsResponse) {
                    return mergeFrom((AlertsResponse) message);
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
                                    SevereWeatherReport severeWeatherReport = (SevereWeatherReport) codedInputStream.readMessage(SevereWeatherReport.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<SevereWeatherReport, SevereWeatherReport.Builder, SevereWeatherReportOrBuilder> repeatedFieldBuilderV3 = this.severeWeatherReportBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureSevereWeatherReportIsMutable();
                                        this.severeWeatherReport_.add(severeWeatherReport);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(severeWeatherReport);
                                    }
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.queryCookie_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
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
        public AlertsResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static AlertsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlertsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlertsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AlertsResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AlertsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AlertsResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AlertsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AlertsResponse parseFrom(InputStream inputStream) {
            return (AlertsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AlertsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlertsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private AlertsResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.queryCookie_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AlertsResponse parseFrom(CodedInputStream codedInputStream) {
            return (AlertsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public /* synthetic */ AlertsResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static AlertsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlertsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ConditionsResponse extends GeneratedMessageV3 implements ConditionsResponseOrBuilder {
        public static final int CURRENT_FIELD_NUMBER = 1;
        public static final int FORECASTPROVIDERS_FIELD_NUMBER = 4;
        public static final int FORECAST_FIELD_NUMBER = 2;
        public static final int FORECAST_LOCATION_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private CurrentWeather current_;
        private volatile Object forecastLocation_;
        private List<DataProvider> forecastProviders_;
        private List<ForecastWeather> forecast_;
        private byte memoizedIsInitialized;
        private static final ConditionsResponse DEFAULT_INSTANCE = new ConditionsResponse();

        @Deprecated
        public static final Parser<ConditionsResponse> PARSER = new AbstractParser<ConditionsResponse>() { // from class: com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.1
            @Override // com.google.protobuf.Parser
            public ConditionsResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConditionsResponse.newBuilder();
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

        public interface CurrentWeatherOrBuilder extends MessageOrBuilder {
            DataProvider getCurrentProvider();

            DataProviderOrBuilder getCurrentProviderOrBuilder();

            int getCurrentTemp();

            DayOfWeek getDayOfWeek();

            String getDescription();

            ByteString getDescriptionBytes();

            int getFeelsLike();

            WeatherIcon getIcon();

            String getLocation();

            ByteString getLocationBytes();

            ObservedLocation getObservedLocation();

            ObservedLocationOrBuilder getObservedLocationOrBuilder();

            int getRelativeHum();

            SizedText getSizedText(int i14);

            int getSizedTextCount();

            List<SizedText> getSizedTextList();

            SizedTextOrBuilder getSizedTextOrBuilder(int i14);

            List<? extends SizedTextOrBuilder> getSizedTextOrBuilderList();

            long getTimestamp();

            int getWindBearing();

            String getWindDir();

            ByteString getWindDirBytes();

            int getWindSpeed();

            boolean hasCurrentProvider();

            boolean hasCurrentTemp();

            boolean hasDayOfWeek();

            boolean hasDescription();

            boolean hasFeelsLike();

            boolean hasIcon();

            boolean hasLocation();

            boolean hasObservedLocation();

            boolean hasRelativeHum();

            boolean hasTimestamp();

            boolean hasWindBearing();

            boolean hasWindDir();

            boolean hasWindSpeed();
        }

        public interface ForecastWeatherOrBuilder extends MessageOrBuilder {
            DayOfWeek getDayOfWeek();

            int getHighTemp();

            WeatherIcon getIcon();

            int getLowTemp();

            int getPrecipProb();

            SizedText getSizedText(int i14);

            int getSizedTextCount();

            List<SizedText> getSizedTextList();

            SizedTextOrBuilder getSizedTextOrBuilder(int i14);

            List<? extends SizedTextOrBuilder> getSizedTextOrBuilderList();

            String getSummary();

            ByteString getSummaryBytes();

            boolean hasDayOfWeek();

            boolean hasHighTemp();

            boolean hasIcon();

            boolean hasLowTemp();

            boolean hasPrecipProb();

            boolean hasSummary();
        }

        private ConditionsResponse() {
            this.forecastLocation_ = "";
            this.memoizedIsInitialized = (byte) -1;
            List list = Collections.EMPTY_LIST;
            this.forecast_ = list;
            this.forecastLocation_ = "";
            this.forecastProviders_ = list;
        }

        public static ConditionsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WeatherProto.internal_static_CSM_Proto_Weather_ConditionsResponse_descriptor;
        }

        public static Builder newBuilder(ConditionsResponse conditionsResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(conditionsResponse);
        }

        public static ConditionsResponse parseDelimitedFrom(InputStream inputStream) {
            return (ConditionsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConditionsResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConditionsResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConditionsResponse)) {
                return super.equals(obj);
            }
            ConditionsResponse conditionsResponse = (ConditionsResponse) obj;
            if (hasCurrent() != conditionsResponse.hasCurrent()) {
                return false;
            }
            if ((!hasCurrent() || getCurrent().equals(conditionsResponse.getCurrent())) && getForecastList().equals(conditionsResponse.getForecastList()) && hasForecastLocation() == conditionsResponse.hasForecastLocation()) {
                return (!hasForecastLocation() || getForecastLocation().equals(conditionsResponse.getForecastLocation())) && getForecastProvidersList().equals(conditionsResponse.getForecastProvidersList()) && getUnknownFields().equals(conditionsResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponseOrBuilder
        public CurrentWeather getCurrent() {
            CurrentWeather currentWeather = this.current_;
            return currentWeather == null ? CurrentWeather.getDefaultInstance() : currentWeather;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponseOrBuilder
        public CurrentWeatherOrBuilder getCurrentOrBuilder() {
            CurrentWeather currentWeather = this.current_;
            return currentWeather == null ? CurrentWeather.getDefaultInstance() : currentWeather;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponseOrBuilder
        public ForecastWeather getForecast(int i14) {
            return this.forecast_.get(i14);
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponseOrBuilder
        public int getForecastCount() {
            return this.forecast_.size();
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponseOrBuilder
        public List<ForecastWeather> getForecastList() {
            return this.forecast_;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponseOrBuilder
        public String getForecastLocation() {
            Object obj = this.forecastLocation_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.forecastLocation_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponseOrBuilder
        public ByteString getForecastLocationBytes() {
            Object obj = this.forecastLocation_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.forecastLocation_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponseOrBuilder
        public ForecastWeatherOrBuilder getForecastOrBuilder(int i14) {
            return this.forecast_.get(i14);
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponseOrBuilder
        public List<? extends ForecastWeatherOrBuilder> getForecastOrBuilderList() {
            return this.forecast_;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponseOrBuilder
        public DataProvider getForecastProviders(int i14) {
            return this.forecastProviders_.get(i14);
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponseOrBuilder
        public int getForecastProvidersCount() {
            return this.forecastProviders_.size();
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponseOrBuilder
        public List<DataProvider> getForecastProvidersList() {
            return this.forecastProviders_;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponseOrBuilder
        public DataProviderOrBuilder getForecastProvidersOrBuilder(int i14) {
            return this.forecastProviders_.get(i14);
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponseOrBuilder
        public List<? extends DataProviderOrBuilder> getForecastProvidersOrBuilderList() {
            return this.forecastProviders_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConditionsResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getCurrent()) : 0;
            for (int i15 = 0; i15 < this.forecast_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, this.forecast_.get(i15));
            }
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += GeneratedMessageV3.computeStringSize(3, this.forecastLocation_);
            }
            for (int i16 = 0; i16 < this.forecastProviders_.size(); i16++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, this.forecastProviders_.get(i16));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponseOrBuilder
        public boolean hasCurrent() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponseOrBuilder
        public boolean hasForecastLocation() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCurrent()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getCurrent().hashCode();
            }
            if (getForecastCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getForecastList().hashCode();
            }
            if (hasForecastLocation()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getForecastLocation().hashCode();
            }
            if (getForecastProvidersCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getForecastProvidersList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WeatherProto.internal_static_CSM_Proto_Weather_ConditionsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConditionsResponse.class, Builder.class);
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
            if (hasCurrent() && !getCurrent().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i14 = 0; i14 < getForecastCount(); i14++) {
                if (!getForecast(i14).isInitialized()) {
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
            return new ConditionsResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getCurrent());
            }
            for (int i14 = 0; i14 < this.forecast_.size(); i14++) {
                codedOutputStream.writeMessage(2, this.forecast_.get(i14));
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.forecastLocation_);
            }
            for (int i15 = 0; i15 < this.forecastProviders_.size(); i15++) {
                codedOutputStream.writeMessage(4, this.forecastProviders_.get(i15));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class CurrentWeather extends GeneratedMessageV3 implements CurrentWeatherOrBuilder {
            public static final int CURRENTPROVIDER_FIELD_NUMBER = 13;
            public static final int CURRENT_TEMP_FIELD_NUMBER = 2;
            public static final int DAY_OF_WEEK_FIELD_NUMBER = 11;
            public static final int DESCRIPTION_FIELD_NUMBER = 1;
            public static final int FEELS_LIKE_FIELD_NUMBER = 5;
            public static final int ICON_FIELD_NUMBER = 8;
            public static final int LOCATION_FIELD_NUMBER = 9;
            public static final int OBSERVED_LOCATION_FIELD_NUMBER = 15;
            public static final int RELATIVE_HUM_FIELD_NUMBER = 10;
            public static final int SIZED_TEXT_FIELD_NUMBER = 12;
            public static final int TIMESTAMP_FIELD_NUMBER = 14;
            public static final int WIND_BEARING_FIELD_NUMBER = 16;
            public static final int WIND_DIR_FIELD_NUMBER = 3;
            public static final int WIND_SPEED_FIELD_NUMBER = 4;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private DataProvider currentProvider_;
            private int currentTemp_;
            private int dayOfWeek_;
            private volatile Object description_;
            private int feelsLike_;
            private int icon_;
            private volatile Object location_;
            private byte memoizedIsInitialized;
            private ObservedLocation observedLocation_;
            private int relativeHum_;
            private List<SizedText> sizedText_;
            private long timestamp_;
            private int windBearing_;
            private volatile Object windDir_;
            private int windSpeed_;
            private static final CurrentWeather DEFAULT_INSTANCE = new CurrentWeather();

            @Deprecated
            public static final Parser<CurrentWeather> PARSER = new AbstractParser<CurrentWeather>() { // from class: com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeather.1
                @Override // com.google.protobuf.Parser
                public CurrentWeather parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = CurrentWeather.newBuilder();
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

            private CurrentWeather() {
                this.description_ = "";
                this.currentTemp_ = 0;
                this.windDir_ = "";
                this.windSpeed_ = 0;
                this.feelsLike_ = 0;
                this.icon_ = 0;
                this.location_ = "";
                this.relativeHum_ = 0;
                this.dayOfWeek_ = 1;
                this.timestamp_ = 0L;
                this.windBearing_ = 0;
                this.memoizedIsInitialized = (byte) -1;
                this.description_ = "";
                this.windDir_ = "";
                this.icon_ = 0;
                this.location_ = "";
                this.dayOfWeek_ = 1;
                this.sizedText_ = Collections.EMPTY_LIST;
            }

            public static CurrentWeather getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WeatherProto.internal_static_CSM_Proto_Weather_ConditionsResponse_CurrentWeather_descriptor;
            }

            public static Builder newBuilder(CurrentWeather currentWeather) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(currentWeather);
            }

            public static CurrentWeather parseDelimitedFrom(InputStream inputStream) {
                return (CurrentWeather) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static CurrentWeather parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<CurrentWeather> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof CurrentWeather)) {
                    return super.equals(obj);
                }
                CurrentWeather currentWeather = (CurrentWeather) obj;
                if (hasDescription() != currentWeather.hasDescription()) {
                    return false;
                }
                if ((hasDescription() && !getDescription().equals(currentWeather.getDescription())) || hasCurrentTemp() != currentWeather.hasCurrentTemp()) {
                    return false;
                }
                if ((hasCurrentTemp() && getCurrentTemp() != currentWeather.getCurrentTemp()) || hasWindDir() != currentWeather.hasWindDir()) {
                    return false;
                }
                if ((hasWindDir() && !getWindDir().equals(currentWeather.getWindDir())) || hasWindSpeed() != currentWeather.hasWindSpeed()) {
                    return false;
                }
                if ((hasWindSpeed() && getWindSpeed() != currentWeather.getWindSpeed()) || hasFeelsLike() != currentWeather.hasFeelsLike()) {
                    return false;
                }
                if ((hasFeelsLike() && getFeelsLike() != currentWeather.getFeelsLike()) || hasIcon() != currentWeather.hasIcon()) {
                    return false;
                }
                if ((hasIcon() && this.icon_ != currentWeather.icon_) || hasLocation() != currentWeather.hasLocation()) {
                    return false;
                }
                if ((hasLocation() && !getLocation().equals(currentWeather.getLocation())) || hasRelativeHum() != currentWeather.hasRelativeHum()) {
                    return false;
                }
                if ((hasRelativeHum() && getRelativeHum() != currentWeather.getRelativeHum()) || hasDayOfWeek() != currentWeather.hasDayOfWeek()) {
                    return false;
                }
                if ((hasDayOfWeek() && this.dayOfWeek_ != currentWeather.dayOfWeek_) || !getSizedTextList().equals(currentWeather.getSizedTextList()) || hasCurrentProvider() != currentWeather.hasCurrentProvider()) {
                    return false;
                }
                if ((hasCurrentProvider() && !getCurrentProvider().equals(currentWeather.getCurrentProvider())) || hasTimestamp() != currentWeather.hasTimestamp()) {
                    return false;
                }
                if ((hasTimestamp() && getTimestamp() != currentWeather.getTimestamp()) || hasObservedLocation() != currentWeather.hasObservedLocation()) {
                    return false;
                }
                if ((!hasObservedLocation() || getObservedLocation().equals(currentWeather.getObservedLocation())) && hasWindBearing() == currentWeather.hasWindBearing()) {
                    return (!hasWindBearing() || getWindBearing() == currentWeather.getWindBearing()) && getUnknownFields().equals(currentWeather.getUnknownFields());
                }
                return false;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
            public DataProvider getCurrentProvider() {
                DataProvider dataProvider = this.currentProvider_;
                return dataProvider == null ? DataProvider.getDefaultInstance() : dataProvider;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
            public DataProviderOrBuilder getCurrentProviderOrBuilder() {
                DataProvider dataProvider = this.currentProvider_;
                return dataProvider == null ? DataProvider.getDefaultInstance() : dataProvider;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
            public int getCurrentTemp() {
                return this.currentTemp_;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
            public DayOfWeek getDayOfWeek() {
                DayOfWeek dayOfWeekForNumber = DayOfWeek.forNumber(this.dayOfWeek_);
                return dayOfWeekForNumber == null ? DayOfWeek.SUNDAY : dayOfWeekForNumber;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
            public String getDescription() {
                Object obj = this.description_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.description_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
            public ByteString getDescriptionBytes() {
                Object obj = this.description_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.description_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
            public int getFeelsLike() {
                return this.feelsLike_;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
            public WeatherIcon getIcon() {
                WeatherIcon weatherIconForNumber = WeatherIcon.forNumber(this.icon_);
                return weatherIconForNumber == null ? WeatherIcon.CLEAR : weatherIconForNumber;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
            public String getLocation() {
                Object obj = this.location_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.location_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
            public ByteString getLocationBytes() {
                Object obj = this.location_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.location_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
            public ObservedLocation getObservedLocation() {
                ObservedLocation observedLocation = this.observedLocation_;
                return observedLocation == null ? ObservedLocation.getDefaultInstance() : observedLocation;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
            public ObservedLocationOrBuilder getObservedLocationOrBuilder() {
                ObservedLocation observedLocation = this.observedLocation_;
                return observedLocation == null ? ObservedLocation.getDefaultInstance() : observedLocation;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<CurrentWeather> getParserForType() {
                return PARSER;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
            public int getRelativeHum() {
                return this.relativeHum_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i14 = this.memoizedSize;
                if (i14 != -1) {
                    return i14;
                }
                int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.description_) : 0;
                if ((this.bitField0_ & 2) != 0) {
                    iComputeStringSize += CodedOutputStream.computeSInt32Size(2, this.currentTemp_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.windDir_);
                }
                if ((this.bitField0_ & 8) != 0) {
                    iComputeStringSize += CodedOutputStream.computeInt32Size(4, this.windSpeed_);
                }
                if ((this.bitField0_ & 16) != 0) {
                    iComputeStringSize += CodedOutputStream.computeInt32Size(5, this.feelsLike_);
                }
                if ((this.bitField0_ & 32) != 0) {
                    iComputeStringSize += CodedOutputStream.computeEnumSize(8, this.icon_);
                }
                if ((this.bitField0_ & 64) != 0) {
                    iComputeStringSize += GeneratedMessageV3.computeStringSize(9, this.location_);
                }
                if ((this.bitField0_ & 128) != 0) {
                    iComputeStringSize += CodedOutputStream.computeInt32Size(10, this.relativeHum_);
                }
                if ((this.bitField0_ & 256) != 0) {
                    iComputeStringSize += CodedOutputStream.computeEnumSize(11, this.dayOfWeek_);
                }
                for (int i15 = 0; i15 < this.sizedText_.size(); i15++) {
                    iComputeStringSize += CodedOutputStream.computeMessageSize(12, this.sizedText_.get(i15));
                }
                if ((this.bitField0_ & 512) != 0) {
                    iComputeStringSize += CodedOutputStream.computeMessageSize(13, getCurrentProvider());
                }
                if ((this.bitField0_ & 1024) != 0) {
                    iComputeStringSize += CodedOutputStream.computeUInt64Size(14, this.timestamp_);
                }
                if ((this.bitField0_ & 2048) != 0) {
                    iComputeStringSize += CodedOutputStream.computeMessageSize(15, getObservedLocation());
                }
                if ((this.bitField0_ & 4096) != 0) {
                    iComputeStringSize += CodedOutputStream.computeUInt32Size(16, this.windBearing_);
                }
                int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
            public SizedText getSizedText(int i14) {
                return this.sizedText_.get(i14);
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
            public int getSizedTextCount() {
                return this.sizedText_.size();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
            public List<SizedText> getSizedTextList() {
                return this.sizedText_;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
            public SizedTextOrBuilder getSizedTextOrBuilder(int i14) {
                return this.sizedText_.get(i14);
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
            public List<? extends SizedTextOrBuilder> getSizedTextOrBuilderList() {
                return this.sizedText_;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
            public long getTimestamp() {
                return this.timestamp_;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
            public int getWindBearing() {
                return this.windBearing_;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
            public String getWindDir() {
                Object obj = this.windDir_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.windDir_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
            public ByteString getWindDirBytes() {
                Object obj = this.windDir_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.windDir_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
            public int getWindSpeed() {
                return this.windSpeed_;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
            public boolean hasCurrentProvider() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
            public boolean hasCurrentTemp() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
            public boolean hasDayOfWeek() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
            public boolean hasDescription() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
            public boolean hasFeelsLike() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
            public boolean hasIcon() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
            public boolean hasLocation() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
            public boolean hasObservedLocation() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
            public boolean hasRelativeHum() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
            public boolean hasTimestamp() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
            public boolean hasWindBearing() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
            public boolean hasWindDir() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
            public boolean hasWindSpeed() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i14 = this.memoizedHashCode;
                if (i14 != 0) {
                    return i14;
                }
                int iHashCode = getDescriptor().hashCode() + 779;
                if (hasDescription()) {
                    iHashCode = e5.c(iHashCode, 37, 1, 53) + getDescription().hashCode();
                }
                if (hasCurrentTemp()) {
                    iHashCode = e5.c(iHashCode, 37, 2, 53) + getCurrentTemp();
                }
                if (hasWindDir()) {
                    iHashCode = e5.c(iHashCode, 37, 3, 53) + getWindDir().hashCode();
                }
                if (hasWindSpeed()) {
                    iHashCode = e5.c(iHashCode, 37, 4, 53) + getWindSpeed();
                }
                if (hasFeelsLike()) {
                    iHashCode = e5.c(iHashCode, 37, 5, 53) + getFeelsLike();
                }
                if (hasIcon()) {
                    iHashCode = e5.c(iHashCode, 37, 8, 53) + this.icon_;
                }
                if (hasLocation()) {
                    iHashCode = e5.c(iHashCode, 37, 9, 53) + getLocation().hashCode();
                }
                if (hasRelativeHum()) {
                    iHashCode = e5.c(iHashCode, 37, 10, 53) + getRelativeHum();
                }
                if (hasDayOfWeek()) {
                    iHashCode = e5.c(iHashCode, 37, 11, 53) + this.dayOfWeek_;
                }
                if (getSizedTextCount() > 0) {
                    iHashCode = e5.c(iHashCode, 37, 12, 53) + getSizedTextList().hashCode();
                }
                if (hasCurrentProvider()) {
                    iHashCode = e5.c(iHashCode, 37, 13, 53) + getCurrentProvider().hashCode();
                }
                if (hasTimestamp()) {
                    iHashCode = e5.c(iHashCode, 37, 14, 53) + Internal.hashLong(getTimestamp());
                }
                if (hasObservedLocation()) {
                    iHashCode = e5.c(iHashCode, 37, 15, 53) + getObservedLocation().hashCode();
                }
                if (hasWindBearing()) {
                    iHashCode = e5.c(iHashCode, 37, 16, 53) + getWindBearing();
                }
                int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WeatherProto.internal_static_CSM_Proto_Weather_ConditionsResponse_CurrentWeather_fieldAccessorTable.ensureFieldAccessorsInitialized(CurrentWeather.class, Builder.class);
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
                for (int i14 = 0; i14 < getSizedTextCount(); i14++) {
                    if (!getSizedText(i14).isInitialized()) {
                        this.memoizedIsInitialized = (byte) 0;
                        return false;
                    }
                }
                if (!hasObservedLocation() || getObservedLocation().isInitialized()) {
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
                return new CurrentWeather();
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                int i14 = 0;
                return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                if ((this.bitField0_ & 1) != 0) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.description_);
                }
                if ((this.bitField0_ & 2) != 0) {
                    codedOutputStream.writeSInt32(2, this.currentTemp_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    GeneratedMessageV3.writeString(codedOutputStream, 3, this.windDir_);
                }
                if ((this.bitField0_ & 8) != 0) {
                    codedOutputStream.writeInt32(4, this.windSpeed_);
                }
                if ((this.bitField0_ & 16) != 0) {
                    codedOutputStream.writeInt32(5, this.feelsLike_);
                }
                if ((this.bitField0_ & 32) != 0) {
                    codedOutputStream.writeEnum(8, this.icon_);
                }
                if ((this.bitField0_ & 64) != 0) {
                    GeneratedMessageV3.writeString(codedOutputStream, 9, this.location_);
                }
                if ((this.bitField0_ & 128) != 0) {
                    codedOutputStream.writeInt32(10, this.relativeHum_);
                }
                if ((this.bitField0_ & 256) != 0) {
                    codedOutputStream.writeEnum(11, this.dayOfWeek_);
                }
                for (int i14 = 0; i14 < this.sizedText_.size(); i14++) {
                    codedOutputStream.writeMessage(12, this.sizedText_.get(i14));
                }
                if ((this.bitField0_ & 512) != 0) {
                    codedOutputStream.writeMessage(13, getCurrentProvider());
                }
                if ((this.bitField0_ & 1024) != 0) {
                    codedOutputStream.writeUInt64(14, this.timestamp_);
                }
                if ((this.bitField0_ & 2048) != 0) {
                    codedOutputStream.writeMessage(15, getObservedLocation());
                }
                if ((this.bitField0_ & 4096) != 0) {
                    codedOutputStream.writeUInt32(16, this.windBearing_);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CurrentWeatherOrBuilder {
                private int bitField0_;
                private SingleFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> currentProviderBuilder_;
                private DataProvider currentProvider_;
                private int currentTemp_;
                private int dayOfWeek_;
                private Object description_;
                private int feelsLike_;
                private int icon_;
                private Object location_;
                private SingleFieldBuilderV3<ObservedLocation, ObservedLocation.Builder, ObservedLocationOrBuilder> observedLocationBuilder_;
                private ObservedLocation observedLocation_;
                private int relativeHum_;
                private RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> sizedTextBuilder_;
                private List<SizedText> sizedText_;
                private long timestamp_;
                private int windBearing_;
                private Object windDir_;
                private int windSpeed_;

                private Builder() {
                    this.description_ = "";
                    this.windDir_ = "";
                    this.icon_ = 0;
                    this.location_ = "";
                    this.dayOfWeek_ = 1;
                    this.sizedText_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                private void buildPartial0(CurrentWeather currentWeather) {
                    int i14;
                    int i15 = this.bitField0_;
                    if ((i15 & 1) != 0) {
                        currentWeather.description_ = this.description_;
                        i14 = 1;
                    } else {
                        i14 = 0;
                    }
                    if ((i15 & 2) != 0) {
                        currentWeather.currentTemp_ = this.currentTemp_;
                        i14 |= 2;
                    }
                    if ((i15 & 4) != 0) {
                        currentWeather.windDir_ = this.windDir_;
                        i14 |= 4;
                    }
                    if ((i15 & 8) != 0) {
                        currentWeather.windSpeed_ = this.windSpeed_;
                        i14 |= 8;
                    }
                    if ((i15 & 16) != 0) {
                        currentWeather.feelsLike_ = this.feelsLike_;
                        i14 |= 16;
                    }
                    if ((i15 & 32) != 0) {
                        currentWeather.icon_ = this.icon_;
                        i14 |= 32;
                    }
                    if ((i15 & 64) != 0) {
                        currentWeather.location_ = this.location_;
                        i14 |= 64;
                    }
                    if ((i15 & 128) != 0) {
                        currentWeather.relativeHum_ = this.relativeHum_;
                        i14 |= 128;
                    }
                    if ((i15 & 256) != 0) {
                        currentWeather.dayOfWeek_ = this.dayOfWeek_;
                        i14 |= 256;
                    }
                    if ((i15 & 1024) != 0) {
                        SingleFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> singleFieldBuilderV3 = this.currentProviderBuilder_;
                        currentWeather.currentProvider_ = singleFieldBuilderV3 == null ? this.currentProvider_ : (DataProvider) singleFieldBuilderV3.build();
                        i14 |= 512;
                    }
                    if ((i15 & 2048) != 0) {
                        currentWeather.timestamp_ = this.timestamp_;
                        i14 |= 1024;
                    }
                    if ((i15 & 4096) != 0) {
                        SingleFieldBuilderV3<ObservedLocation, ObservedLocation.Builder, ObservedLocationOrBuilder> singleFieldBuilderV4 = this.observedLocationBuilder_;
                        currentWeather.observedLocation_ = singleFieldBuilderV4 == null ? this.observedLocation_ : (ObservedLocation) singleFieldBuilderV4.build();
                        i14 |= 2048;
                    }
                    if ((i15 & 8192) != 0) {
                        currentWeather.windBearing_ = this.windBearing_;
                        i14 |= 4096;
                    }
                    currentWeather.bitField0_ |= i14;
                }

                private void buildPartialRepeatedFields(CurrentWeather currentWeather) {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedTextBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        currentWeather.sizedText_ = repeatedFieldBuilderV3.build();
                        return;
                    }
                    if ((this.bitField0_ & 512) != 0) {
                        this.sizedText_ = Collections.unmodifiableList(this.sizedText_);
                        this.bitField0_ &= -513;
                    }
                    currentWeather.sizedText_ = this.sizedText_;
                }

                private void ensureSizedTextIsMutable() {
                    if ((this.bitField0_ & 512) == 0) {
                        this.sizedText_ = new ArrayList(this.sizedText_);
                        this.bitField0_ |= 512;
                    }
                }

                private SingleFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> getCurrentProviderFieldBuilder() {
                    if (this.currentProviderBuilder_ == null) {
                        this.currentProviderBuilder_ = new SingleFieldBuilderV3<>(getCurrentProvider(), getParentForChildren(), isClean());
                        this.currentProvider_ = null;
                    }
                    return this.currentProviderBuilder_;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return WeatherProto.internal_static_CSM_Proto_Weather_ConditionsResponse_CurrentWeather_descriptor;
                }

                private SingleFieldBuilderV3<ObservedLocation, ObservedLocation.Builder, ObservedLocationOrBuilder> getObservedLocationFieldBuilder() {
                    if (this.observedLocationBuilder_ == null) {
                        this.observedLocationBuilder_ = new SingleFieldBuilderV3<>(getObservedLocation(), getParentForChildren(), isClean());
                        this.observedLocation_ = null;
                    }
                    return this.observedLocationBuilder_;
                }

                private RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> getSizedTextFieldBuilder() {
                    if (this.sizedTextBuilder_ == null) {
                        this.sizedTextBuilder_ = new RepeatedFieldBuilderV3<>(this.sizedText_, (this.bitField0_ & 512) != 0, getParentForChildren(), isClean());
                        this.sizedText_ = null;
                    }
                    return this.sizedTextBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                        getSizedTextFieldBuilder();
                        getCurrentProviderFieldBuilder();
                        getObservedLocationFieldBuilder();
                    }
                }

                public Builder addAllSizedText(Iterable<? extends SizedText> iterable) {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedTextBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addAllMessages(iterable);
                        return this;
                    }
                    ensureSizedTextIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.sizedText_);
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                public Builder addSizedText(SizedText.Builder builder) {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedTextBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(builder.build());
                        return this;
                    }
                    ensureSizedTextIsMutable();
                    this.sizedText_.add(builder.build());
                    onChanged();
                    return this;
                }

                public SizedText.Builder addSizedTextBuilder() {
                    return (SizedText.Builder) getSizedTextFieldBuilder().addBuilder(SizedText.getDefaultInstance());
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public CurrentWeather build() {
                    CurrentWeather currentWeatherBuildPartial = buildPartial();
                    if (currentWeatherBuildPartial.isInitialized()) {
                        return currentWeatherBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) currentWeatherBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public CurrentWeather buildPartial() {
                    CurrentWeather currentWeather = new CurrentWeather(this);
                    buildPartialRepeatedFields(currentWeather);
                    if (this.bitField0_ != 0) {
                        buildPartial0(currentWeather);
                    }
                    onBuilt();
                    return currentWeather;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.description_ = "";
                    this.currentTemp_ = 0;
                    this.windDir_ = "";
                    this.windSpeed_ = 0;
                    this.feelsLike_ = 0;
                    this.icon_ = 0;
                    this.location_ = "";
                    this.relativeHum_ = 0;
                    this.dayOfWeek_ = 1;
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedTextBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        this.sizedText_ = Collections.EMPTY_LIST;
                    } else {
                        this.sizedText_ = null;
                        repeatedFieldBuilderV3.clear();
                    }
                    this.bitField0_ &= -513;
                    this.currentProvider_ = null;
                    SingleFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> singleFieldBuilderV3 = this.currentProviderBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.dispose();
                        this.currentProviderBuilder_ = null;
                    }
                    this.timestamp_ = 0L;
                    this.observedLocation_ = null;
                    SingleFieldBuilderV3<ObservedLocation, ObservedLocation.Builder, ObservedLocationOrBuilder> singleFieldBuilderV4 = this.observedLocationBuilder_;
                    if (singleFieldBuilderV4 != null) {
                        singleFieldBuilderV4.dispose();
                        this.observedLocationBuilder_ = null;
                    }
                    this.windBearing_ = 0;
                    return this;
                }

                public Builder clearCurrentProvider() {
                    this.bitField0_ &= -1025;
                    this.currentProvider_ = null;
                    SingleFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> singleFieldBuilderV3 = this.currentProviderBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.dispose();
                        this.currentProviderBuilder_ = null;
                    }
                    onChanged();
                    return this;
                }

                public Builder clearCurrentTemp() {
                    this.bitField0_ &= -3;
                    this.currentTemp_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearDayOfWeek() {
                    this.bitField0_ &= -257;
                    this.dayOfWeek_ = 1;
                    onChanged();
                    return this;
                }

                public Builder clearDescription() {
                    this.description_ = CurrentWeather.getDefaultInstance().getDescription();
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                public Builder clearFeelsLike() {
                    this.bitField0_ &= -17;
                    this.feelsLike_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                public Builder clearIcon() {
                    this.bitField0_ &= -33;
                    this.icon_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearLocation() {
                    this.location_ = CurrentWeather.getDefaultInstance().getLocation();
                    this.bitField0_ &= -65;
                    onChanged();
                    return this;
                }

                public Builder clearObservedLocation() {
                    this.bitField0_ &= -4097;
                    this.observedLocation_ = null;
                    SingleFieldBuilderV3<ObservedLocation, ObservedLocation.Builder, ObservedLocationOrBuilder> singleFieldBuilderV3 = this.observedLocationBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.dispose();
                        this.observedLocationBuilder_ = null;
                    }
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (Builder) super.clearOneof(oneofDescriptor);
                }

                public Builder clearRelativeHum() {
                    this.bitField0_ &= -129;
                    this.relativeHum_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearSizedText() {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedTextBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.clear();
                        return this;
                    }
                    this.sizedText_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -513;
                    onChanged();
                    return this;
                }

                public Builder clearTimestamp() {
                    this.bitField0_ &= -2049;
                    this.timestamp_ = 0L;
                    onChanged();
                    return this;
                }

                public Builder clearWindBearing() {
                    this.bitField0_ &= -8193;
                    this.windBearing_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearWindDir() {
                    this.windDir_ = CurrentWeather.getDefaultInstance().getWindDir();
                    this.bitField0_ &= -5;
                    onChanged();
                    return this;
                }

                public Builder clearWindSpeed() {
                    this.bitField0_ &= -9;
                    this.windSpeed_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo57clone() {
                    return (Builder) super.mo57clone();
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
                public DataProvider getCurrentProvider() {
                    SingleFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> singleFieldBuilderV3 = this.currentProviderBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return (DataProvider) singleFieldBuilderV3.getMessage();
                    }
                    DataProvider dataProvider = this.currentProvider_;
                    return dataProvider == null ? DataProvider.getDefaultInstance() : dataProvider;
                }

                public DataProvider.Builder getCurrentProviderBuilder() {
                    this.bitField0_ |= 1024;
                    onChanged();
                    return (DataProvider.Builder) getCurrentProviderFieldBuilder().getBuilder();
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
                public DataProviderOrBuilder getCurrentProviderOrBuilder() {
                    SingleFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> singleFieldBuilderV3 = this.currentProviderBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return (DataProviderOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    DataProvider dataProvider = this.currentProvider_;
                    return dataProvider == null ? DataProvider.getDefaultInstance() : dataProvider;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
                public int getCurrentTemp() {
                    return this.currentTemp_;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
                public DayOfWeek getDayOfWeek() {
                    DayOfWeek dayOfWeekForNumber = DayOfWeek.forNumber(this.dayOfWeek_);
                    return dayOfWeekForNumber == null ? DayOfWeek.SUNDAY : dayOfWeekForNumber;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
                public String getDescription() {
                    Object obj = this.description_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String stringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.description_ = stringUtf8;
                    }
                    return stringUtf8;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
                public ByteString getDescriptionBytes() {
                    Object obj = this.description_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.description_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return WeatherProto.internal_static_CSM_Proto_Weather_ConditionsResponse_CurrentWeather_descriptor;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
                public int getFeelsLike() {
                    return this.feelsLike_;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
                public WeatherIcon getIcon() {
                    WeatherIcon weatherIconForNumber = WeatherIcon.forNumber(this.icon_);
                    return weatherIconForNumber == null ? WeatherIcon.CLEAR : weatherIconForNumber;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
                public String getLocation() {
                    Object obj = this.location_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String stringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.location_ = stringUtf8;
                    }
                    return stringUtf8;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
                public ByteString getLocationBytes() {
                    Object obj = this.location_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.location_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
                public ObservedLocation getObservedLocation() {
                    SingleFieldBuilderV3<ObservedLocation, ObservedLocation.Builder, ObservedLocationOrBuilder> singleFieldBuilderV3 = this.observedLocationBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return (ObservedLocation) singleFieldBuilderV3.getMessage();
                    }
                    ObservedLocation observedLocation = this.observedLocation_;
                    return observedLocation == null ? ObservedLocation.getDefaultInstance() : observedLocation;
                }

                public ObservedLocation.Builder getObservedLocationBuilder() {
                    this.bitField0_ |= 4096;
                    onChanged();
                    return (ObservedLocation.Builder) getObservedLocationFieldBuilder().getBuilder();
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
                public ObservedLocationOrBuilder getObservedLocationOrBuilder() {
                    SingleFieldBuilderV3<ObservedLocation, ObservedLocation.Builder, ObservedLocationOrBuilder> singleFieldBuilderV3 = this.observedLocationBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return (ObservedLocationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    ObservedLocation observedLocation = this.observedLocation_;
                    return observedLocation == null ? ObservedLocation.getDefaultInstance() : observedLocation;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
                public int getRelativeHum() {
                    return this.relativeHum_;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
                public SizedText getSizedText(int i14) {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedTextBuilder_;
                    return repeatedFieldBuilderV3 == null ? this.sizedText_.get(i14) : (SizedText) repeatedFieldBuilderV3.getMessage(i14);
                }

                public SizedText.Builder getSizedTextBuilder(int i14) {
                    return (SizedText.Builder) getSizedTextFieldBuilder().getBuilder(i14);
                }

                public List<SizedText.Builder> getSizedTextBuilderList() {
                    return getSizedTextFieldBuilder().getBuilderList();
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
                public int getSizedTextCount() {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedTextBuilder_;
                    return repeatedFieldBuilderV3 == null ? this.sizedText_.size() : repeatedFieldBuilderV3.getCount();
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
                public List<SizedText> getSizedTextList() {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedTextBuilder_;
                    return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.sizedText_) : repeatedFieldBuilderV3.getMessageList();
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
                public SizedTextOrBuilder getSizedTextOrBuilder(int i14) {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedTextBuilder_;
                    return repeatedFieldBuilderV3 == null ? this.sizedText_.get(i14) : (SizedTextOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
                public List<? extends SizedTextOrBuilder> getSizedTextOrBuilderList() {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedTextBuilder_;
                    return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.sizedText_);
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
                public long getTimestamp() {
                    return this.timestamp_;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
                public int getWindBearing() {
                    return this.windBearing_;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
                public String getWindDir() {
                    Object obj = this.windDir_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String stringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.windDir_ = stringUtf8;
                    }
                    return stringUtf8;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
                public ByteString getWindDirBytes() {
                    Object obj = this.windDir_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.windDir_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
                public int getWindSpeed() {
                    return this.windSpeed_;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
                public boolean hasCurrentProvider() {
                    return (this.bitField0_ & 1024) != 0;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
                public boolean hasCurrentTemp() {
                    return (this.bitField0_ & 2) != 0;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
                public boolean hasDayOfWeek() {
                    return (this.bitField0_ & 256) != 0;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
                public boolean hasDescription() {
                    return (this.bitField0_ & 1) != 0;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
                public boolean hasFeelsLike() {
                    return (this.bitField0_ & 16) != 0;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
                public boolean hasIcon() {
                    return (this.bitField0_ & 32) != 0;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
                public boolean hasLocation() {
                    return (this.bitField0_ & 64) != 0;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
                public boolean hasObservedLocation() {
                    return (this.bitField0_ & 4096) != 0;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
                public boolean hasRelativeHum() {
                    return (this.bitField0_ & 128) != 0;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
                public boolean hasTimestamp() {
                    return (this.bitField0_ & 2048) != 0;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
                public boolean hasWindBearing() {
                    return (this.bitField0_ & 8192) != 0;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
                public boolean hasWindDir() {
                    return (this.bitField0_ & 4) != 0;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.CurrentWeatherOrBuilder
                public boolean hasWindSpeed() {
                    return (this.bitField0_ & 8) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return WeatherProto.internal_static_CSM_Proto_Weather_ConditionsResponse_CurrentWeather_fieldAccessorTable.ensureFieldAccessorsInitialized(CurrentWeather.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    for (int i14 = 0; i14 < getSizedTextCount(); i14++) {
                        if (!getSizedText(i14).isInitialized()) {
                            return false;
                        }
                    }
                    return !hasObservedLocation() || getObservedLocation().isInitialized();
                }

                public Builder mergeCurrentProvider(DataProvider dataProvider) {
                    DataProvider dataProvider2;
                    SingleFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> singleFieldBuilderV3 = this.currentProviderBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.mergeFrom(dataProvider);
                    } else if ((this.bitField0_ & 1024) == 0 || (dataProvider2 = this.currentProvider_) == null || dataProvider2 == DataProvider.getDefaultInstance()) {
                        this.currentProvider_ = dataProvider;
                    } else {
                        getCurrentProviderBuilder().mergeFrom(dataProvider);
                    }
                    this.bitField0_ |= 1024;
                    onChanged();
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
                                        this.description_ = codedInputStream.readBytes();
                                        this.bitField0_ |= 1;
                                        continue;
                                    case 16:
                                        this.currentTemp_ = codedInputStream.readSInt32();
                                        this.bitField0_ |= 2;
                                        continue;
                                    case 26:
                                        this.windDir_ = codedInputStream.readBytes();
                                        this.bitField0_ |= 4;
                                        continue;
                                    case 32:
                                        this.windSpeed_ = codedInputStream.readInt32();
                                        this.bitField0_ |= 8;
                                        continue;
                                    case 40:
                                        this.feelsLike_ = codedInputStream.readInt32();
                                        this.bitField0_ |= 16;
                                        continue;
                                    case 64:
                                        int i14 = codedInputStream.readEnum();
                                        if (WeatherIcon.forNumber(i14) == null) {
                                            mergeUnknownVarintField(8, i14);
                                        } else {
                                            this.icon_ = i14;
                                            this.bitField0_ |= 32;
                                            continue;
                                        }
                                        break;
                                    case 74:
                                        this.location_ = codedInputStream.readBytes();
                                        this.bitField0_ |= 64;
                                        continue;
                                    case 80:
                                        this.relativeHum_ = codedInputStream.readInt32();
                                        this.bitField0_ |= 128;
                                        continue;
                                    case 88:
                                        int i15 = codedInputStream.readEnum();
                                        if (DayOfWeek.forNumber(i15) == null) {
                                            mergeUnknownVarintField(11, i15);
                                        } else {
                                            this.dayOfWeek_ = i15;
                                            this.bitField0_ |= 256;
                                            continue;
                                        }
                                        break;
                                    case 98:
                                        SizedText sizedText = (SizedText) codedInputStream.readMessage(SizedText.PARSER, extensionRegistryLite);
                                        RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedTextBuilder_;
                                        if (repeatedFieldBuilderV3 == null) {
                                            ensureSizedTextIsMutable();
                                            this.sizedText_.add(sizedText);
                                        } else {
                                            repeatedFieldBuilderV3.addMessage(sizedText);
                                            continue;
                                        }
                                        break;
                                    case 106:
                                        codedInputStream.readMessage(getCurrentProviderFieldBuilder().getBuilder(), extensionRegistryLite);
                                        this.bitField0_ |= 1024;
                                        continue;
                                    case 112:
                                        this.timestamp_ = codedInputStream.readUInt64();
                                        this.bitField0_ |= 2048;
                                        continue;
                                    case 122:
                                        codedInputStream.readMessage(getObservedLocationFieldBuilder().getBuilder(), extensionRegistryLite);
                                        this.bitField0_ |= 4096;
                                        continue;
                                    case 128:
                                        this.windBearing_ = codedInputStream.readUInt32();
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

                public Builder mergeObservedLocation(ObservedLocation observedLocation) {
                    ObservedLocation observedLocation2;
                    SingleFieldBuilderV3<ObservedLocation, ObservedLocation.Builder, ObservedLocationOrBuilder> singleFieldBuilderV3 = this.observedLocationBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.mergeFrom(observedLocation);
                    } else if ((this.bitField0_ & 4096) == 0 || (observedLocation2 = this.observedLocation_) == null || observedLocation2 == ObservedLocation.getDefaultInstance()) {
                        this.observedLocation_ = observedLocation;
                    } else {
                        getObservedLocationBuilder().mergeFrom(observedLocation);
                    }
                    this.bitField0_ |= 4096;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.mergeUnknownFields(unknownFieldSet);
                }

                public Builder removeSizedText(int i14) {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedTextBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.remove(i14);
                        return this;
                    }
                    ensureSizedTextIsMutable();
                    this.sizedText_.remove(i14);
                    onChanged();
                    return this;
                }

                public Builder setCurrentProvider(DataProvider.Builder builder) {
                    SingleFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> singleFieldBuilderV3 = this.currentProviderBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.currentProvider_ = builder.build();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    this.bitField0_ |= 1024;
                    onChanged();
                    return this;
                }

                public Builder setCurrentTemp(int i14) {
                    this.currentTemp_ = i14;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                public Builder setDayOfWeek(DayOfWeek dayOfWeek) {
                    dayOfWeek.getClass();
                    this.bitField0_ |= 256;
                    this.dayOfWeek_ = dayOfWeek.getNumber();
                    onChanged();
                    return this;
                }

                public Builder setDescription(String str) {
                    str.getClass();
                    this.description_ = str;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setDescriptionBytes(ByteString byteString) {
                    byteString.getClass();
                    this.description_ = byteString;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setFeelsLike(int i14) {
                    this.feelsLike_ = i14;
                    this.bitField0_ |= 16;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.setField(fieldDescriptor, obj);
                }

                public Builder setIcon(WeatherIcon weatherIcon) {
                    weatherIcon.getClass();
                    this.bitField0_ |= 32;
                    this.icon_ = weatherIcon.getNumber();
                    onChanged();
                    return this;
                }

                public Builder setLocation(String str) {
                    str.getClass();
                    this.location_ = str;
                    this.bitField0_ |= 64;
                    onChanged();
                    return this;
                }

                public Builder setLocationBytes(ByteString byteString) {
                    byteString.getClass();
                    this.location_ = byteString;
                    this.bitField0_ |= 64;
                    onChanged();
                    return this;
                }

                public Builder setObservedLocation(ObservedLocation.Builder builder) {
                    SingleFieldBuilderV3<ObservedLocation, ObservedLocation.Builder, ObservedLocationOrBuilder> singleFieldBuilderV3 = this.observedLocationBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.observedLocation_ = builder.build();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    this.bitField0_ |= 4096;
                    onChanged();
                    return this;
                }

                public Builder setRelativeHum(int i14) {
                    this.relativeHum_ = i14;
                    this.bitField0_ |= 128;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                    return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
                }

                public Builder setSizedText(int i14, SizedText.Builder builder) {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedTextBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.setMessage(i14, builder.build());
                        return this;
                    }
                    ensureSizedTextIsMutable();
                    this.sizedText_.set(i14, builder.build());
                    onChanged();
                    return this;
                }

                public Builder setTimestamp(long j8) {
                    this.timestamp_ = j8;
                    this.bitField0_ |= 2048;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.setUnknownFields(unknownFieldSet);
                }

                public Builder setWindBearing(int i14) {
                    this.windBearing_ = i14;
                    this.bitField0_ |= 8192;
                    onChanged();
                    return this;
                }

                public Builder setWindDir(String str) {
                    str.getClass();
                    this.windDir_ = str;
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                public Builder setWindDirBytes(ByteString byteString) {
                    byteString.getClass();
                    this.windDir_ = byteString;
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                public Builder setWindSpeed(int i14) {
                    this.windSpeed_ = i14;
                    this.bitField0_ |= 8;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public CurrentWeather getDefaultInstanceForType() {
                    return CurrentWeather.getDefaultInstance();
                }

                public SizedText.Builder addSizedTextBuilder(int i14) {
                    return (SizedText.Builder) getSizedTextFieldBuilder().addBuilder(i14, SizedText.getDefaultInstance());
                }

                public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                    this(builderParent);
                }

                public /* synthetic */ Builder(int i14) {
                    this();
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.description_ = "";
                    this.windDir_ = "";
                    this.icon_ = 0;
                    this.location_ = "";
                    this.dayOfWeek_ = 1;
                    this.sizedText_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                public Builder addSizedText(int i14, SizedText sizedText) {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedTextBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        sizedText.getClass();
                        ensureSizedTextIsMutable();
                        this.sizedText_.add(i14, sizedText);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilderV3.addMessage(i14, sizedText);
                    return this;
                }

                public Builder setCurrentProvider(DataProvider dataProvider) {
                    SingleFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> singleFieldBuilderV3 = this.currentProviderBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        dataProvider.getClass();
                        this.currentProvider_ = dataProvider;
                    } else {
                        singleFieldBuilderV3.setMessage(dataProvider);
                    }
                    this.bitField0_ |= 1024;
                    onChanged();
                    return this;
                }

                public Builder setObservedLocation(ObservedLocation observedLocation) {
                    SingleFieldBuilderV3<ObservedLocation, ObservedLocation.Builder, ObservedLocationOrBuilder> singleFieldBuilderV3 = this.observedLocationBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        observedLocation.getClass();
                        this.observedLocation_ = observedLocation;
                    } else {
                        singleFieldBuilderV3.setMessage(observedLocation);
                    }
                    this.bitField0_ |= 4096;
                    onChanged();
                    return this;
                }

                public Builder setSizedText(int i14, SizedText sizedText) {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedTextBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        sizedText.getClass();
                        ensureSizedTextIsMutable();
                        this.sizedText_.set(i14, sizedText);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilderV3.setMessage(i14, sizedText);
                    return this;
                }

                public Builder addSizedText(SizedText sizedText) {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedTextBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        sizedText.getClass();
                        ensureSizedTextIsMutable();
                        this.sizedText_.add(sizedText);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilderV3.addMessage(sizedText);
                    return this;
                }

                public Builder addSizedText(int i14, SizedText.Builder builder) {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedTextBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureSizedTextIsMutable();
                        this.sizedText_.add(i14, builder.build());
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilderV3.addMessage(i14, builder.build());
                    return this;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof CurrentWeather) {
                        return mergeFrom((CurrentWeather) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(CurrentWeather currentWeather) {
                    if (currentWeather == CurrentWeather.getDefaultInstance()) {
                        return this;
                    }
                    if (currentWeather.hasDescription()) {
                        this.description_ = currentWeather.description_;
                        this.bitField0_ |= 1;
                        onChanged();
                    }
                    if (currentWeather.hasCurrentTemp()) {
                        setCurrentTemp(currentWeather.getCurrentTemp());
                    }
                    if (currentWeather.hasWindDir()) {
                        this.windDir_ = currentWeather.windDir_;
                        this.bitField0_ |= 4;
                        onChanged();
                    }
                    if (currentWeather.hasWindSpeed()) {
                        setWindSpeed(currentWeather.getWindSpeed());
                    }
                    if (currentWeather.hasFeelsLike()) {
                        setFeelsLike(currentWeather.getFeelsLike());
                    }
                    if (currentWeather.hasIcon()) {
                        setIcon(currentWeather.getIcon());
                    }
                    if (currentWeather.hasLocation()) {
                        this.location_ = currentWeather.location_;
                        this.bitField0_ |= 64;
                        onChanged();
                    }
                    if (currentWeather.hasRelativeHum()) {
                        setRelativeHum(currentWeather.getRelativeHum());
                    }
                    if (currentWeather.hasDayOfWeek()) {
                        setDayOfWeek(currentWeather.getDayOfWeek());
                    }
                    if (this.sizedTextBuilder_ == null) {
                        if (!currentWeather.sizedText_.isEmpty()) {
                            if (this.sizedText_.isEmpty()) {
                                this.sizedText_ = currentWeather.sizedText_;
                                this.bitField0_ &= -513;
                            } else {
                                ensureSizedTextIsMutable();
                                this.sizedText_.addAll(currentWeather.sizedText_);
                            }
                            onChanged();
                        }
                    } else if (!currentWeather.sizedText_.isEmpty()) {
                        boolean zIsEmpty = this.sizedTextBuilder_.isEmpty();
                        RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedTextBuilder_;
                        if (zIsEmpty) {
                            repeatedFieldBuilderV3.dispose();
                            this.sizedTextBuilder_ = null;
                            this.sizedText_ = currentWeather.sizedText_;
                            this.bitField0_ &= -513;
                            this.sizedTextBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getSizedTextFieldBuilder() : null;
                        } else {
                            repeatedFieldBuilderV3.addAllMessages(currentWeather.sizedText_);
                        }
                    }
                    if (currentWeather.hasCurrentProvider()) {
                        mergeCurrentProvider(currentWeather.getCurrentProvider());
                    }
                    if (currentWeather.hasTimestamp()) {
                        setTimestamp(currentWeather.getTimestamp());
                    }
                    if (currentWeather.hasObservedLocation()) {
                        mergeObservedLocation(currentWeather.getObservedLocation());
                    }
                    if (currentWeather.hasWindBearing()) {
                        setWindBearing(currentWeather.getWindBearing());
                    }
                    mergeUnknownFields(currentWeather.getUnknownFields());
                    onChanged();
                    return this;
                }
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CurrentWeather getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public static CurrentWeather parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (CurrentWeather) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static CurrentWeather parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static CurrentWeather parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static CurrentWeather parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static CurrentWeather parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            public static CurrentWeather parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static CurrentWeather parseFrom(InputStream inputStream) {
                return (CurrentWeather) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static CurrentWeather parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (CurrentWeather) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static CurrentWeather parseFrom(CodedInputStream codedInputStream) {
                return (CurrentWeather) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static CurrentWeather parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (CurrentWeather) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            private CurrentWeather(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.description_ = "";
                this.currentTemp_ = 0;
                this.windDir_ = "";
                this.windSpeed_ = 0;
                this.feelsLike_ = 0;
                this.icon_ = 0;
                this.location_ = "";
                this.relativeHum_ = 0;
                this.dayOfWeek_ = 1;
                this.timestamp_ = 0L;
                this.windBearing_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            public /* synthetic */ CurrentWeather(Builder builder) {
                this((GeneratedMessageV3.Builder<?>) builder);
            }
        }

        public static final class ForecastWeather extends GeneratedMessageV3 implements ForecastWeatherOrBuilder {
            public static final int DAY_OF_WEEK_FIELD_NUMBER = 1;
            public static final int HIGH_TEMP_FIELD_NUMBER = 2;
            public static final int ICON_FIELD_NUMBER = 5;
            public static final int LOW_TEMP_FIELD_NUMBER = 3;
            public static final int PRECIP_PROB_FIELD_NUMBER = 6;
            public static final int SIZED_TEXT_FIELD_NUMBER = 7;
            public static final int SUMMARY_FIELD_NUMBER = 4;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private int dayOfWeek_;
            private int highTemp_;
            private int icon_;
            private int lowTemp_;
            private byte memoizedIsInitialized;
            private int precipProb_;
            private List<SizedText> sizedText_;
            private volatile Object summary_;
            private static final ForecastWeather DEFAULT_INSTANCE = new ForecastWeather();

            @Deprecated
            public static final Parser<ForecastWeather> PARSER = new AbstractParser<ForecastWeather>() { // from class: com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.ForecastWeather.1
                @Override // com.google.protobuf.Parser
                public ForecastWeather parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = ForecastWeather.newBuilder();
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

            private ForecastWeather() {
                this.dayOfWeek_ = 1;
                this.highTemp_ = 0;
                this.lowTemp_ = 0;
                this.summary_ = "";
                this.icon_ = 0;
                this.precipProb_ = 0;
                this.memoizedIsInitialized = (byte) -1;
                this.dayOfWeek_ = 1;
                this.summary_ = "";
                this.icon_ = 0;
                this.sizedText_ = Collections.EMPTY_LIST;
            }

            public static ForecastWeather getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WeatherProto.internal_static_CSM_Proto_Weather_ConditionsResponse_ForecastWeather_descriptor;
            }

            public static Builder newBuilder(ForecastWeather forecastWeather) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(forecastWeather);
            }

            public static ForecastWeather parseDelimitedFrom(InputStream inputStream) {
                return (ForecastWeather) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static ForecastWeather parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<ForecastWeather> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof ForecastWeather)) {
                    return super.equals(obj);
                }
                ForecastWeather forecastWeather = (ForecastWeather) obj;
                if (hasDayOfWeek() != forecastWeather.hasDayOfWeek()) {
                    return false;
                }
                if ((hasDayOfWeek() && this.dayOfWeek_ != forecastWeather.dayOfWeek_) || hasHighTemp() != forecastWeather.hasHighTemp()) {
                    return false;
                }
                if ((hasHighTemp() && getHighTemp() != forecastWeather.getHighTemp()) || hasLowTemp() != forecastWeather.hasLowTemp()) {
                    return false;
                }
                if ((hasLowTemp() && getLowTemp() != forecastWeather.getLowTemp()) || hasSummary() != forecastWeather.hasSummary()) {
                    return false;
                }
                if ((hasSummary() && !getSummary().equals(forecastWeather.getSummary())) || hasIcon() != forecastWeather.hasIcon()) {
                    return false;
                }
                if ((!hasIcon() || this.icon_ == forecastWeather.icon_) && hasPrecipProb() == forecastWeather.hasPrecipProb()) {
                    return (!hasPrecipProb() || getPrecipProb() == forecastWeather.getPrecipProb()) && getSizedTextList().equals(forecastWeather.getSizedTextList()) && getUnknownFields().equals(forecastWeather.getUnknownFields());
                }
                return false;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.ForecastWeatherOrBuilder
            public DayOfWeek getDayOfWeek() {
                DayOfWeek dayOfWeekForNumber = DayOfWeek.forNumber(this.dayOfWeek_);
                return dayOfWeekForNumber == null ? DayOfWeek.SUNDAY : dayOfWeekForNumber;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.ForecastWeatherOrBuilder
            public int getHighTemp() {
                return this.highTemp_;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.ForecastWeatherOrBuilder
            public WeatherIcon getIcon() {
                WeatherIcon weatherIconForNumber = WeatherIcon.forNumber(this.icon_);
                return weatherIconForNumber == null ? WeatherIcon.CLEAR : weatherIconForNumber;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.ForecastWeatherOrBuilder
            public int getLowTemp() {
                return this.lowTemp_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<ForecastWeather> getParserForType() {
                return PARSER;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.ForecastWeatherOrBuilder
            public int getPrecipProb() {
                return this.precipProb_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i14 = this.memoizedSize;
                if (i14 != -1) {
                    return i14;
                }
                int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.dayOfWeek_) : 0;
                if ((this.bitField0_ & 2) != 0) {
                    iComputeEnumSize += CodedOutputStream.computeSInt32Size(2, this.highTemp_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    iComputeEnumSize += CodedOutputStream.computeSInt32Size(3, this.lowTemp_);
                }
                if ((this.bitField0_ & 8) != 0) {
                    iComputeEnumSize += GeneratedMessageV3.computeStringSize(4, this.summary_);
                }
                if ((this.bitField0_ & 16) != 0) {
                    iComputeEnumSize += CodedOutputStream.computeEnumSize(5, this.icon_);
                }
                if ((this.bitField0_ & 32) != 0) {
                    iComputeEnumSize += CodedOutputStream.computeInt32Size(6, this.precipProb_);
                }
                for (int i15 = 0; i15 < this.sizedText_.size(); i15++) {
                    iComputeEnumSize += CodedOutputStream.computeMessageSize(7, this.sizedText_.get(i15));
                }
                int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.ForecastWeatherOrBuilder
            public SizedText getSizedText(int i14) {
                return this.sizedText_.get(i14);
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.ForecastWeatherOrBuilder
            public int getSizedTextCount() {
                return this.sizedText_.size();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.ForecastWeatherOrBuilder
            public List<SizedText> getSizedTextList() {
                return this.sizedText_;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.ForecastWeatherOrBuilder
            public SizedTextOrBuilder getSizedTextOrBuilder(int i14) {
                return this.sizedText_.get(i14);
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.ForecastWeatherOrBuilder
            public List<? extends SizedTextOrBuilder> getSizedTextOrBuilderList() {
                return this.sizedText_;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.ForecastWeatherOrBuilder
            public String getSummary() {
                Object obj = this.summary_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.summary_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.ForecastWeatherOrBuilder
            public ByteString getSummaryBytes() {
                Object obj = this.summary_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.summary_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.ForecastWeatherOrBuilder
            public boolean hasDayOfWeek() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.ForecastWeatherOrBuilder
            public boolean hasHighTemp() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.ForecastWeatherOrBuilder
            public boolean hasIcon() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.ForecastWeatherOrBuilder
            public boolean hasLowTemp() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.ForecastWeatherOrBuilder
            public boolean hasPrecipProb() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.ForecastWeatherOrBuilder
            public boolean hasSummary() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i14 = this.memoizedHashCode;
                if (i14 != 0) {
                    return i14;
                }
                int iHashCode = getDescriptor().hashCode() + 779;
                if (hasDayOfWeek()) {
                    iHashCode = e5.c(iHashCode, 37, 1, 53) + this.dayOfWeek_;
                }
                if (hasHighTemp()) {
                    iHashCode = e5.c(iHashCode, 37, 2, 53) + getHighTemp();
                }
                if (hasLowTemp()) {
                    iHashCode = e5.c(iHashCode, 37, 3, 53) + getLowTemp();
                }
                if (hasSummary()) {
                    iHashCode = e5.c(iHashCode, 37, 4, 53) + getSummary().hashCode();
                }
                if (hasIcon()) {
                    iHashCode = e5.c(iHashCode, 37, 5, 53) + this.icon_;
                }
                if (hasPrecipProb()) {
                    iHashCode = e5.c(iHashCode, 37, 6, 53) + getPrecipProb();
                }
                if (getSizedTextCount() > 0) {
                    iHashCode = e5.c(iHashCode, 37, 7, 53) + getSizedTextList().hashCode();
                }
                int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WeatherProto.internal_static_CSM_Proto_Weather_ConditionsResponse_ForecastWeather_fieldAccessorTable.ensureFieldAccessorsInitialized(ForecastWeather.class, Builder.class);
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
                for (int i14 = 0; i14 < getSizedTextCount(); i14++) {
                    if (!getSizedText(i14).isInitialized()) {
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
                return new ForecastWeather();
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                int i14 = 0;
                return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                if ((this.bitField0_ & 1) != 0) {
                    codedOutputStream.writeEnum(1, this.dayOfWeek_);
                }
                if ((this.bitField0_ & 2) != 0) {
                    codedOutputStream.writeSInt32(2, this.highTemp_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    codedOutputStream.writeSInt32(3, this.lowTemp_);
                }
                if ((this.bitField0_ & 8) != 0) {
                    GeneratedMessageV3.writeString(codedOutputStream, 4, this.summary_);
                }
                if ((this.bitField0_ & 16) != 0) {
                    codedOutputStream.writeEnum(5, this.icon_);
                }
                if ((this.bitField0_ & 32) != 0) {
                    codedOutputStream.writeInt32(6, this.precipProb_);
                }
                for (int i14 = 0; i14 < this.sizedText_.size(); i14++) {
                    codedOutputStream.writeMessage(7, this.sizedText_.get(i14));
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ForecastWeatherOrBuilder {
                private int bitField0_;
                private int dayOfWeek_;
                private int highTemp_;
                private int icon_;
                private int lowTemp_;
                private int precipProb_;
                private RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> sizedTextBuilder_;
                private List<SizedText> sizedText_;
                private Object summary_;

                private Builder() {
                    this.dayOfWeek_ = 1;
                    this.summary_ = "";
                    this.icon_ = 0;
                    this.sizedText_ = Collections.EMPTY_LIST;
                }

                private void buildPartial0(ForecastWeather forecastWeather) {
                    int i14;
                    int i15 = this.bitField0_;
                    if ((i15 & 1) != 0) {
                        forecastWeather.dayOfWeek_ = this.dayOfWeek_;
                        i14 = 1;
                    } else {
                        i14 = 0;
                    }
                    if ((i15 & 2) != 0) {
                        forecastWeather.highTemp_ = this.highTemp_;
                        i14 |= 2;
                    }
                    if ((i15 & 4) != 0) {
                        forecastWeather.lowTemp_ = this.lowTemp_;
                        i14 |= 4;
                    }
                    if ((i15 & 8) != 0) {
                        forecastWeather.summary_ = this.summary_;
                        i14 |= 8;
                    }
                    if ((i15 & 16) != 0) {
                        forecastWeather.icon_ = this.icon_;
                        i14 |= 16;
                    }
                    if ((i15 & 32) != 0) {
                        forecastWeather.precipProb_ = this.precipProb_;
                        i14 |= 32;
                    }
                    forecastWeather.bitField0_ |= i14;
                }

                private void buildPartialRepeatedFields(ForecastWeather forecastWeather) {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedTextBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        forecastWeather.sizedText_ = repeatedFieldBuilderV3.build();
                        return;
                    }
                    if ((this.bitField0_ & 64) != 0) {
                        this.sizedText_ = Collections.unmodifiableList(this.sizedText_);
                        this.bitField0_ &= -65;
                    }
                    forecastWeather.sizedText_ = this.sizedText_;
                }

                private void ensureSizedTextIsMutable() {
                    if ((this.bitField0_ & 64) == 0) {
                        this.sizedText_ = new ArrayList(this.sizedText_);
                        this.bitField0_ |= 64;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return WeatherProto.internal_static_CSM_Proto_Weather_ConditionsResponse_ForecastWeather_descriptor;
                }

                private RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> getSizedTextFieldBuilder() {
                    if (this.sizedTextBuilder_ == null) {
                        this.sizedTextBuilder_ = new RepeatedFieldBuilderV3<>(this.sizedText_, (this.bitField0_ & 64) != 0, getParentForChildren(), isClean());
                        this.sizedText_ = null;
                    }
                    return this.sizedTextBuilder_;
                }

                public Builder addAllSizedText(Iterable<? extends SizedText> iterable) {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedTextBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addAllMessages(iterable);
                        return this;
                    }
                    ensureSizedTextIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.sizedText_);
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                public Builder addSizedText(SizedText.Builder builder) {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedTextBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(builder.build());
                        return this;
                    }
                    ensureSizedTextIsMutable();
                    this.sizedText_.add(builder.build());
                    onChanged();
                    return this;
                }

                public SizedText.Builder addSizedTextBuilder() {
                    return (SizedText.Builder) getSizedTextFieldBuilder().addBuilder(SizedText.getDefaultInstance());
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public ForecastWeather build() {
                    ForecastWeather forecastWeatherBuildPartial = buildPartial();
                    if (forecastWeatherBuildPartial.isInitialized()) {
                        return forecastWeatherBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) forecastWeatherBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public ForecastWeather buildPartial() {
                    ForecastWeather forecastWeather = new ForecastWeather(this);
                    buildPartialRepeatedFields(forecastWeather);
                    if (this.bitField0_ != 0) {
                        buildPartial0(forecastWeather);
                    }
                    onBuilt();
                    return forecastWeather;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.dayOfWeek_ = 1;
                    this.highTemp_ = 0;
                    this.lowTemp_ = 0;
                    this.summary_ = "";
                    this.icon_ = 0;
                    this.precipProb_ = 0;
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedTextBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        this.sizedText_ = Collections.EMPTY_LIST;
                    } else {
                        this.sizedText_ = null;
                        repeatedFieldBuilderV3.clear();
                    }
                    this.bitField0_ &= -65;
                    return this;
                }

                public Builder clearDayOfWeek() {
                    this.bitField0_ &= -2;
                    this.dayOfWeek_ = 1;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                public Builder clearHighTemp() {
                    this.bitField0_ &= -3;
                    this.highTemp_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearIcon() {
                    this.bitField0_ &= -17;
                    this.icon_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearLowTemp() {
                    this.bitField0_ &= -5;
                    this.lowTemp_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (Builder) super.clearOneof(oneofDescriptor);
                }

                public Builder clearPrecipProb() {
                    this.bitField0_ &= -33;
                    this.precipProb_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearSizedText() {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedTextBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.clear();
                        return this;
                    }
                    this.sizedText_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -65;
                    onChanged();
                    return this;
                }

                public Builder clearSummary() {
                    this.summary_ = ForecastWeather.getDefaultInstance().getSummary();
                    this.bitField0_ &= -9;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo57clone() {
                    return (Builder) super.mo57clone();
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.ForecastWeatherOrBuilder
                public DayOfWeek getDayOfWeek() {
                    DayOfWeek dayOfWeekForNumber = DayOfWeek.forNumber(this.dayOfWeek_);
                    return dayOfWeekForNumber == null ? DayOfWeek.SUNDAY : dayOfWeekForNumber;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return WeatherProto.internal_static_CSM_Proto_Weather_ConditionsResponse_ForecastWeather_descriptor;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.ForecastWeatherOrBuilder
                public int getHighTemp() {
                    return this.highTemp_;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.ForecastWeatherOrBuilder
                public WeatherIcon getIcon() {
                    WeatherIcon weatherIconForNumber = WeatherIcon.forNumber(this.icon_);
                    return weatherIconForNumber == null ? WeatherIcon.CLEAR : weatherIconForNumber;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.ForecastWeatherOrBuilder
                public int getLowTemp() {
                    return this.lowTemp_;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.ForecastWeatherOrBuilder
                public int getPrecipProb() {
                    return this.precipProb_;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.ForecastWeatherOrBuilder
                public SizedText getSizedText(int i14) {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedTextBuilder_;
                    return repeatedFieldBuilderV3 == null ? this.sizedText_.get(i14) : (SizedText) repeatedFieldBuilderV3.getMessage(i14);
                }

                public SizedText.Builder getSizedTextBuilder(int i14) {
                    return (SizedText.Builder) getSizedTextFieldBuilder().getBuilder(i14);
                }

                public List<SizedText.Builder> getSizedTextBuilderList() {
                    return getSizedTextFieldBuilder().getBuilderList();
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.ForecastWeatherOrBuilder
                public int getSizedTextCount() {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedTextBuilder_;
                    return repeatedFieldBuilderV3 == null ? this.sizedText_.size() : repeatedFieldBuilderV3.getCount();
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.ForecastWeatherOrBuilder
                public List<SizedText> getSizedTextList() {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedTextBuilder_;
                    return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.sizedText_) : repeatedFieldBuilderV3.getMessageList();
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.ForecastWeatherOrBuilder
                public SizedTextOrBuilder getSizedTextOrBuilder(int i14) {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedTextBuilder_;
                    return repeatedFieldBuilderV3 == null ? this.sizedText_.get(i14) : (SizedTextOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.ForecastWeatherOrBuilder
                public List<? extends SizedTextOrBuilder> getSizedTextOrBuilderList() {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedTextBuilder_;
                    return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.sizedText_);
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.ForecastWeatherOrBuilder
                public String getSummary() {
                    Object obj = this.summary_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String stringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.summary_ = stringUtf8;
                    }
                    return stringUtf8;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.ForecastWeatherOrBuilder
                public ByteString getSummaryBytes() {
                    Object obj = this.summary_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.summary_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.ForecastWeatherOrBuilder
                public boolean hasDayOfWeek() {
                    return (this.bitField0_ & 1) != 0;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.ForecastWeatherOrBuilder
                public boolean hasHighTemp() {
                    return (this.bitField0_ & 2) != 0;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.ForecastWeatherOrBuilder
                public boolean hasIcon() {
                    return (this.bitField0_ & 16) != 0;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.ForecastWeatherOrBuilder
                public boolean hasLowTemp() {
                    return (this.bitField0_ & 4) != 0;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.ForecastWeatherOrBuilder
                public boolean hasPrecipProb() {
                    return (this.bitField0_ & 32) != 0;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.ForecastWeatherOrBuilder
                public boolean hasSummary() {
                    return (this.bitField0_ & 8) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return WeatherProto.internal_static_CSM_Proto_Weather_ConditionsResponse_ForecastWeather_fieldAccessorTable.ensureFieldAccessorsInitialized(ForecastWeather.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    for (int i14 = 0; i14 < getSizedTextCount(); i14++) {
                        if (!getSizedText(i14).isInitialized()) {
                            return false;
                        }
                    }
                    return true;
                }

                public Builder mergeFrom(ForecastWeather forecastWeather) {
                    if (forecastWeather == ForecastWeather.getDefaultInstance()) {
                        return this;
                    }
                    if (forecastWeather.hasDayOfWeek()) {
                        setDayOfWeek(forecastWeather.getDayOfWeek());
                    }
                    if (forecastWeather.hasHighTemp()) {
                        setHighTemp(forecastWeather.getHighTemp());
                    }
                    if (forecastWeather.hasLowTemp()) {
                        setLowTemp(forecastWeather.getLowTemp());
                    }
                    if (forecastWeather.hasSummary()) {
                        this.summary_ = forecastWeather.summary_;
                        this.bitField0_ |= 8;
                        onChanged();
                    }
                    if (forecastWeather.hasIcon()) {
                        setIcon(forecastWeather.getIcon());
                    }
                    if (forecastWeather.hasPrecipProb()) {
                        setPrecipProb(forecastWeather.getPrecipProb());
                    }
                    if (this.sizedTextBuilder_ == null) {
                        if (!forecastWeather.sizedText_.isEmpty()) {
                            if (this.sizedText_.isEmpty()) {
                                this.sizedText_ = forecastWeather.sizedText_;
                                this.bitField0_ &= -65;
                            } else {
                                ensureSizedTextIsMutable();
                                this.sizedText_.addAll(forecastWeather.sizedText_);
                            }
                            onChanged();
                        }
                    } else if (!forecastWeather.sizedText_.isEmpty()) {
                        boolean zIsEmpty = this.sizedTextBuilder_.isEmpty();
                        RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedTextBuilder_;
                        if (zIsEmpty) {
                            repeatedFieldBuilderV3.dispose();
                            this.sizedTextBuilder_ = null;
                            this.sizedText_ = forecastWeather.sizedText_;
                            this.bitField0_ &= -65;
                            this.sizedTextBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getSizedTextFieldBuilder() : null;
                        } else {
                            repeatedFieldBuilderV3.addAllMessages(forecastWeather.sizedText_);
                        }
                    }
                    mergeUnknownFields(forecastWeather.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.mergeUnknownFields(unknownFieldSet);
                }

                public Builder removeSizedText(int i14) {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedTextBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.remove(i14);
                        return this;
                    }
                    ensureSizedTextIsMutable();
                    this.sizedText_.remove(i14);
                    onChanged();
                    return this;
                }

                public Builder setDayOfWeek(DayOfWeek dayOfWeek) {
                    dayOfWeek.getClass();
                    this.bitField0_ |= 1;
                    this.dayOfWeek_ = dayOfWeek.getNumber();
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.setField(fieldDescriptor, obj);
                }

                public Builder setHighTemp(int i14) {
                    this.highTemp_ = i14;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                public Builder setIcon(WeatherIcon weatherIcon) {
                    weatherIcon.getClass();
                    this.bitField0_ |= 16;
                    this.icon_ = weatherIcon.getNumber();
                    onChanged();
                    return this;
                }

                public Builder setLowTemp(int i14) {
                    this.lowTemp_ = i14;
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                public Builder setPrecipProb(int i14) {
                    this.precipProb_ = i14;
                    this.bitField0_ |= 32;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                    return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
                }

                public Builder setSizedText(int i14, SizedText.Builder builder) {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedTextBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.setMessage(i14, builder.build());
                        return this;
                    }
                    ensureSizedTextIsMutable();
                    this.sizedText_.set(i14, builder.build());
                    onChanged();
                    return this;
                }

                public Builder setSummary(String str) {
                    str.getClass();
                    this.summary_ = str;
                    this.bitField0_ |= 8;
                    onChanged();
                    return this;
                }

                public Builder setSummaryBytes(ByteString byteString) {
                    byteString.getClass();
                    this.summary_ = byteString;
                    this.bitField0_ |= 8;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.setUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public ForecastWeather getDefaultInstanceForType() {
                    return ForecastWeather.getDefaultInstance();
                }

                public SizedText.Builder addSizedTextBuilder(int i14) {
                    return (SizedText.Builder) getSizedTextFieldBuilder().addBuilder(i14, SizedText.getDefaultInstance());
                }

                public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                    this(builderParent);
                }

                public /* synthetic */ Builder(int i14) {
                    this();
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.dayOfWeek_ = 1;
                    this.summary_ = "";
                    this.icon_ = 0;
                    this.sizedText_ = Collections.EMPTY_LIST;
                }

                public Builder addSizedText(int i14, SizedText sizedText) {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedTextBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        sizedText.getClass();
                        ensureSizedTextIsMutable();
                        this.sizedText_.add(i14, sizedText);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilderV3.addMessage(i14, sizedText);
                    return this;
                }

                public Builder setSizedText(int i14, SizedText sizedText) {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedTextBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        sizedText.getClass();
                        ensureSizedTextIsMutable();
                        this.sizedText_.set(i14, sizedText);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilderV3.setMessage(i14, sizedText);
                    return this;
                }

                public Builder addSizedText(SizedText sizedText) {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedTextBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        sizedText.getClass();
                        ensureSizedTextIsMutable();
                        this.sizedText_.add(sizedText);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilderV3.addMessage(sizedText);
                    return this;
                }

                public Builder addSizedText(int i14, SizedText.Builder builder) {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedTextBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureSizedTextIsMutable();
                        this.sizedText_.add(i14, builder.build());
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilderV3.addMessage(i14, builder.build());
                    return this;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof ForecastWeather) {
                        return mergeFrom((ForecastWeather) message);
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
                                        if (DayOfWeek.forNumber(i14) == null) {
                                            mergeUnknownVarintField(1, i14);
                                        } else {
                                            this.dayOfWeek_ = i14;
                                            this.bitField0_ |= 1;
                                        }
                                    } else if (tag == 16) {
                                        this.highTemp_ = codedInputStream.readSInt32();
                                        this.bitField0_ |= 2;
                                    } else if (tag == 24) {
                                        this.lowTemp_ = codedInputStream.readSInt32();
                                        this.bitField0_ |= 4;
                                    } else if (tag == 34) {
                                        this.summary_ = codedInputStream.readBytes();
                                        this.bitField0_ |= 8;
                                    } else if (tag == 40) {
                                        int i15 = codedInputStream.readEnum();
                                        if (WeatherIcon.forNumber(i15) == null) {
                                            mergeUnknownVarintField(5, i15);
                                        } else {
                                            this.icon_ = i15;
                                            this.bitField0_ |= 16;
                                        }
                                    } else if (tag == 48) {
                                        this.precipProb_ = codedInputStream.readInt32();
                                        this.bitField0_ |= 32;
                                    } else if (tag != 58) {
                                        if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        SizedText sizedText = (SizedText) codedInputStream.readMessage(SizedText.PARSER, extensionRegistryLite);
                                        RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedTextBuilder_;
                                        if (repeatedFieldBuilderV3 == null) {
                                            ensureSizedTextIsMutable();
                                            this.sizedText_.add(sizedText);
                                        } else {
                                            repeatedFieldBuilderV3.addMessage(sizedText);
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
            public ForecastWeather getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public static ForecastWeather parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ForecastWeather) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static ForecastWeather parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static ForecastWeather parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static ForecastWeather parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static ForecastWeather parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            public static ForecastWeather parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static ForecastWeather parseFrom(InputStream inputStream) {
                return (ForecastWeather) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static ForecastWeather parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ForecastWeather) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static ForecastWeather parseFrom(CodedInputStream codedInputStream) {
                return (ForecastWeather) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static ForecastWeather parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (ForecastWeather) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            private ForecastWeather(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.dayOfWeek_ = 1;
                this.highTemp_ = 0;
                this.lowTemp_ = 0;
                this.summary_ = "";
                this.icon_ = 0;
                this.precipProb_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            public /* synthetic */ ForecastWeather(Builder builder) {
                this((GeneratedMessageV3.Builder<?>) builder);
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConditionsResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<CurrentWeather, CurrentWeather.Builder, CurrentWeatherOrBuilder> currentBuilder_;
            private CurrentWeather current_;
            private RepeatedFieldBuilderV3<ForecastWeather, ForecastWeather.Builder, ForecastWeatherOrBuilder> forecastBuilder_;
            private Object forecastLocation_;
            private RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> forecastProvidersBuilder_;
            private List<DataProvider> forecastProviders_;
            private List<ForecastWeather> forecast_;

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.forecast_ = list;
                this.forecastLocation_ = "";
                this.forecastProviders_ = list;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ConditionsResponse conditionsResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<CurrentWeather, CurrentWeather.Builder, CurrentWeatherOrBuilder> singleFieldBuilderV3 = this.currentBuilder_;
                    conditionsResponse.current_ = singleFieldBuilderV3 == null ? this.current_ : (CurrentWeather) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 4) != 0) {
                    conditionsResponse.forecastLocation_ = this.forecastLocation_;
                    i14 |= 2;
                }
                conditionsResponse.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(ConditionsResponse conditionsResponse) {
                RepeatedFieldBuilderV3<ForecastWeather, ForecastWeather.Builder, ForecastWeatherOrBuilder> repeatedFieldBuilderV3 = this.forecastBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 2) != 0) {
                        this.forecast_ = Collections.unmodifiableList(this.forecast_);
                        this.bitField0_ &= -3;
                    }
                    conditionsResponse.forecast_ = this.forecast_;
                } else {
                    conditionsResponse.forecast_ = repeatedFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> repeatedFieldBuilderV4 = this.forecastProvidersBuilder_;
                if (repeatedFieldBuilderV4 != null) {
                    conditionsResponse.forecastProviders_ = repeatedFieldBuilderV4.build();
                    return;
                }
                if ((this.bitField0_ & 8) != 0) {
                    this.forecastProviders_ = Collections.unmodifiableList(this.forecastProviders_);
                    this.bitField0_ &= -9;
                }
                conditionsResponse.forecastProviders_ = this.forecastProviders_;
            }

            private void ensureForecastIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.forecast_ = new ArrayList(this.forecast_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureForecastProvidersIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.forecastProviders_ = new ArrayList(this.forecastProviders_);
                    this.bitField0_ |= 8;
                }
            }

            private SingleFieldBuilderV3<CurrentWeather, CurrentWeather.Builder, CurrentWeatherOrBuilder> getCurrentFieldBuilder() {
                if (this.currentBuilder_ == null) {
                    this.currentBuilder_ = new SingleFieldBuilderV3<>(getCurrent(), getParentForChildren(), isClean());
                    this.current_ = null;
                }
                return this.currentBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WeatherProto.internal_static_CSM_Proto_Weather_ConditionsResponse_descriptor;
            }

            private RepeatedFieldBuilderV3<ForecastWeather, ForecastWeather.Builder, ForecastWeatherOrBuilder> getForecastFieldBuilder() {
                if (this.forecastBuilder_ == null) {
                    this.forecastBuilder_ = new RepeatedFieldBuilderV3<>(this.forecast_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.forecast_ = null;
                }
                return this.forecastBuilder_;
            }

            private RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> getForecastProvidersFieldBuilder() {
                if (this.forecastProvidersBuilder_ == null) {
                    this.forecastProvidersBuilder_ = new RepeatedFieldBuilderV3<>(this.forecastProviders_, (this.bitField0_ & 8) != 0, getParentForChildren(), isClean());
                    this.forecastProviders_ = null;
                }
                return this.forecastProvidersBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getCurrentFieldBuilder();
                    getForecastFieldBuilder();
                    getForecastProvidersFieldBuilder();
                }
            }

            public Builder addAllForecast(Iterable<? extends ForecastWeather> iterable) {
                RepeatedFieldBuilderV3<ForecastWeather, ForecastWeather.Builder, ForecastWeatherOrBuilder> repeatedFieldBuilderV3 = this.forecastBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureForecastIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.forecast_);
                onChanged();
                return this;
            }

            public Builder addAllForecastProviders(Iterable<? extends DataProvider> iterable) {
                RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> repeatedFieldBuilderV3 = this.forecastProvidersBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureForecastProvidersIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.forecastProviders_);
                onChanged();
                return this;
            }

            public Builder addForecast(ForecastWeather.Builder builder) {
                RepeatedFieldBuilderV3<ForecastWeather, ForecastWeather.Builder, ForecastWeatherOrBuilder> repeatedFieldBuilderV3 = this.forecastBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureForecastIsMutable();
                this.forecast_.add(builder.build());
                onChanged();
                return this;
            }

            public ForecastWeather.Builder addForecastBuilder() {
                return (ForecastWeather.Builder) getForecastFieldBuilder().addBuilder(ForecastWeather.getDefaultInstance());
            }

            public Builder addForecastProviders(DataProvider.Builder builder) {
                RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> repeatedFieldBuilderV3 = this.forecastProvidersBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureForecastProvidersIsMutable();
                this.forecastProviders_.add(builder.build());
                onChanged();
                return this;
            }

            public DataProvider.Builder addForecastProvidersBuilder() {
                return (DataProvider.Builder) getForecastProvidersFieldBuilder().addBuilder(DataProvider.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConditionsResponse build() {
                ConditionsResponse conditionsResponseBuildPartial = buildPartial();
                if (conditionsResponseBuildPartial.isInitialized()) {
                    return conditionsResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) conditionsResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConditionsResponse buildPartial() {
                ConditionsResponse conditionsResponse = new ConditionsResponse(this);
                buildPartialRepeatedFields(conditionsResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(conditionsResponse);
                }
                onBuilt();
                return conditionsResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.current_ = null;
                SingleFieldBuilderV3<CurrentWeather, CurrentWeather.Builder, CurrentWeatherOrBuilder> singleFieldBuilderV3 = this.currentBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.currentBuilder_ = null;
                }
                RepeatedFieldBuilderV3<ForecastWeather, ForecastWeather.Builder, ForecastWeatherOrBuilder> repeatedFieldBuilderV3 = this.forecastBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.forecast_ = Collections.EMPTY_LIST;
                } else {
                    this.forecast_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -3;
                this.forecastLocation_ = "";
                RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> repeatedFieldBuilderV4 = this.forecastProvidersBuilder_;
                if (repeatedFieldBuilderV4 == null) {
                    this.forecastProviders_ = Collections.EMPTY_LIST;
                } else {
                    this.forecastProviders_ = null;
                    repeatedFieldBuilderV4.clear();
                }
                this.bitField0_ &= -9;
                return this;
            }

            public Builder clearCurrent() {
                this.bitField0_ &= -2;
                this.current_ = null;
                SingleFieldBuilderV3<CurrentWeather, CurrentWeather.Builder, CurrentWeatherOrBuilder> singleFieldBuilderV3 = this.currentBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.currentBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearForecast() {
                RepeatedFieldBuilderV3<ForecastWeather, ForecastWeather.Builder, ForecastWeatherOrBuilder> repeatedFieldBuilderV3 = this.forecastBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.forecast_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearForecastLocation() {
                this.forecastLocation_ = ConditionsResponse.getDefaultInstance().getForecastLocation();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearForecastProviders() {
                RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> repeatedFieldBuilderV3 = this.forecastProvidersBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.forecastProviders_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -9;
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

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponseOrBuilder
            public CurrentWeather getCurrent() {
                SingleFieldBuilderV3<CurrentWeather, CurrentWeather.Builder, CurrentWeatherOrBuilder> singleFieldBuilderV3 = this.currentBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CurrentWeather) singleFieldBuilderV3.getMessage();
                }
                CurrentWeather currentWeather = this.current_;
                return currentWeather == null ? CurrentWeather.getDefaultInstance() : currentWeather;
            }

            public CurrentWeather.Builder getCurrentBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (CurrentWeather.Builder) getCurrentFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponseOrBuilder
            public CurrentWeatherOrBuilder getCurrentOrBuilder() {
                SingleFieldBuilderV3<CurrentWeather, CurrentWeather.Builder, CurrentWeatherOrBuilder> singleFieldBuilderV3 = this.currentBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CurrentWeatherOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CurrentWeather currentWeather = this.current_;
                return currentWeather == null ? CurrentWeather.getDefaultInstance() : currentWeather;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WeatherProto.internal_static_CSM_Proto_Weather_ConditionsResponse_descriptor;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponseOrBuilder
            public ForecastWeather getForecast(int i14) {
                RepeatedFieldBuilderV3<ForecastWeather, ForecastWeather.Builder, ForecastWeatherOrBuilder> repeatedFieldBuilderV3 = this.forecastBuilder_;
                return repeatedFieldBuilderV3 == null ? this.forecast_.get(i14) : (ForecastWeather) repeatedFieldBuilderV3.getMessage(i14);
            }

            public ForecastWeather.Builder getForecastBuilder(int i14) {
                return (ForecastWeather.Builder) getForecastFieldBuilder().getBuilder(i14);
            }

            public List<ForecastWeather.Builder> getForecastBuilderList() {
                return getForecastFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponseOrBuilder
            public int getForecastCount() {
                RepeatedFieldBuilderV3<ForecastWeather, ForecastWeather.Builder, ForecastWeatherOrBuilder> repeatedFieldBuilderV3 = this.forecastBuilder_;
                return repeatedFieldBuilderV3 == null ? this.forecast_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponseOrBuilder
            public List<ForecastWeather> getForecastList() {
                RepeatedFieldBuilderV3<ForecastWeather, ForecastWeather.Builder, ForecastWeatherOrBuilder> repeatedFieldBuilderV3 = this.forecastBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.forecast_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponseOrBuilder
            public String getForecastLocation() {
                Object obj = this.forecastLocation_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.forecastLocation_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponseOrBuilder
            public ByteString getForecastLocationBytes() {
                Object obj = this.forecastLocation_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.forecastLocation_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponseOrBuilder
            public ForecastWeatherOrBuilder getForecastOrBuilder(int i14) {
                RepeatedFieldBuilderV3<ForecastWeather, ForecastWeather.Builder, ForecastWeatherOrBuilder> repeatedFieldBuilderV3 = this.forecastBuilder_;
                return repeatedFieldBuilderV3 == null ? this.forecast_.get(i14) : (ForecastWeatherOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponseOrBuilder
            public List<? extends ForecastWeatherOrBuilder> getForecastOrBuilderList() {
                RepeatedFieldBuilderV3<ForecastWeather, ForecastWeather.Builder, ForecastWeatherOrBuilder> repeatedFieldBuilderV3 = this.forecastBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.forecast_);
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponseOrBuilder
            public DataProvider getForecastProviders(int i14) {
                RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> repeatedFieldBuilderV3 = this.forecastProvidersBuilder_;
                return repeatedFieldBuilderV3 == null ? this.forecastProviders_.get(i14) : (DataProvider) repeatedFieldBuilderV3.getMessage(i14);
            }

            public DataProvider.Builder getForecastProvidersBuilder(int i14) {
                return (DataProvider.Builder) getForecastProvidersFieldBuilder().getBuilder(i14);
            }

            public List<DataProvider.Builder> getForecastProvidersBuilderList() {
                return getForecastProvidersFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponseOrBuilder
            public int getForecastProvidersCount() {
                RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> repeatedFieldBuilderV3 = this.forecastProvidersBuilder_;
                return repeatedFieldBuilderV3 == null ? this.forecastProviders_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponseOrBuilder
            public List<DataProvider> getForecastProvidersList() {
                RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> repeatedFieldBuilderV3 = this.forecastProvidersBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.forecastProviders_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponseOrBuilder
            public DataProviderOrBuilder getForecastProvidersOrBuilder(int i14) {
                RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> repeatedFieldBuilderV3 = this.forecastProvidersBuilder_;
                return repeatedFieldBuilderV3 == null ? this.forecastProviders_.get(i14) : (DataProviderOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponseOrBuilder
            public List<? extends DataProviderOrBuilder> getForecastProvidersOrBuilderList() {
                RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> repeatedFieldBuilderV3 = this.forecastProvidersBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.forecastProviders_);
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponseOrBuilder
            public boolean hasCurrent() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponseOrBuilder
            public boolean hasForecastLocation() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WeatherProto.internal_static_CSM_Proto_Weather_ConditionsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConditionsResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasCurrent() && !getCurrent().isInitialized()) {
                    return false;
                }
                for (int i14 = 0; i14 < getForecastCount(); i14++) {
                    if (!getForecast(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeCurrent(CurrentWeather currentWeather) {
                CurrentWeather currentWeather2;
                SingleFieldBuilderV3<CurrentWeather, CurrentWeather.Builder, CurrentWeatherOrBuilder> singleFieldBuilderV3 = this.currentBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(currentWeather);
                } else if ((this.bitField0_ & 1) == 0 || (currentWeather2 = this.current_) == null || currentWeather2 == CurrentWeather.getDefaultInstance()) {
                    this.current_ = currentWeather;
                } else {
                    getCurrentBuilder().mergeFrom(currentWeather);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder mergeFrom(ConditionsResponse conditionsResponse) {
                if (conditionsResponse == ConditionsResponse.getDefaultInstance()) {
                    return this;
                }
                if (conditionsResponse.hasCurrent()) {
                    mergeCurrent(conditionsResponse.getCurrent());
                }
                if (this.forecastBuilder_ == null) {
                    if (!conditionsResponse.forecast_.isEmpty()) {
                        if (this.forecast_.isEmpty()) {
                            this.forecast_ = conditionsResponse.forecast_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureForecastIsMutable();
                            this.forecast_.addAll(conditionsResponse.forecast_);
                        }
                        onChanged();
                    }
                } else if (!conditionsResponse.forecast_.isEmpty()) {
                    boolean zIsEmpty = this.forecastBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<ForecastWeather, ForecastWeather.Builder, ForecastWeatherOrBuilder> repeatedFieldBuilderV3 = this.forecastBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.forecastBuilder_ = null;
                        this.forecast_ = conditionsResponse.forecast_;
                        this.bitField0_ &= -3;
                        this.forecastBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getForecastFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(conditionsResponse.forecast_);
                    }
                }
                if (conditionsResponse.hasForecastLocation()) {
                    this.forecastLocation_ = conditionsResponse.forecastLocation_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (this.forecastProvidersBuilder_ == null) {
                    if (!conditionsResponse.forecastProviders_.isEmpty()) {
                        if (this.forecastProviders_.isEmpty()) {
                            this.forecastProviders_ = conditionsResponse.forecastProviders_;
                            this.bitField0_ &= -9;
                        } else {
                            ensureForecastProvidersIsMutable();
                            this.forecastProviders_.addAll(conditionsResponse.forecastProviders_);
                        }
                        onChanged();
                    }
                } else if (!conditionsResponse.forecastProviders_.isEmpty()) {
                    boolean zIsEmpty2 = this.forecastProvidersBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> repeatedFieldBuilderV4 = this.forecastProvidersBuilder_;
                    if (zIsEmpty2) {
                        repeatedFieldBuilderV4.dispose();
                        this.forecastProvidersBuilder_ = null;
                        this.forecastProviders_ = conditionsResponse.forecastProviders_;
                        this.bitField0_ &= -9;
                        this.forecastProvidersBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getForecastProvidersFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV4.addAllMessages(conditionsResponse.forecastProviders_);
                    }
                }
                mergeUnknownFields(conditionsResponse.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeForecast(int i14) {
                RepeatedFieldBuilderV3<ForecastWeather, ForecastWeather.Builder, ForecastWeatherOrBuilder> repeatedFieldBuilderV3 = this.forecastBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureForecastIsMutable();
                this.forecast_.remove(i14);
                onChanged();
                return this;
            }

            public Builder removeForecastProviders(int i14) {
                RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> repeatedFieldBuilderV3 = this.forecastProvidersBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureForecastProvidersIsMutable();
                this.forecastProviders_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setCurrent(CurrentWeather.Builder builder) {
                SingleFieldBuilderV3<CurrentWeather, CurrentWeather.Builder, CurrentWeatherOrBuilder> singleFieldBuilderV3 = this.currentBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.current_ = builder.build();
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

            public Builder setForecast(int i14, ForecastWeather.Builder builder) {
                RepeatedFieldBuilderV3<ForecastWeather, ForecastWeather.Builder, ForecastWeatherOrBuilder> repeatedFieldBuilderV3 = this.forecastBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureForecastIsMutable();
                this.forecast_.set(i14, builder.build());
                onChanged();
                return this;
            }

            public Builder setForecastLocation(String str) {
                str.getClass();
                this.forecastLocation_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setForecastLocationBytes(ByteString byteString) {
                byteString.getClass();
                this.forecastLocation_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setForecastProviders(int i14, DataProvider.Builder builder) {
                RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> repeatedFieldBuilderV3 = this.forecastProvidersBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureForecastProvidersIsMutable();
                this.forecastProviders_.set(i14, builder.build());
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
            public ConditionsResponse getDefaultInstanceForType() {
                return ConditionsResponse.getDefaultInstance();
            }

            public ForecastWeather.Builder addForecastBuilder(int i14) {
                return (ForecastWeather.Builder) getForecastFieldBuilder().addBuilder(i14, ForecastWeather.getDefaultInstance());
            }

            public DataProvider.Builder addForecastProvidersBuilder(int i14) {
                return (DataProvider.Builder) getForecastProvidersFieldBuilder().addBuilder(i14, DataProvider.getDefaultInstance());
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                List list = Collections.EMPTY_LIST;
                this.forecast_ = list;
                this.forecastLocation_ = "";
                this.forecastProviders_ = list;
                maybeForceBuilderInitialization();
            }

            public Builder addForecast(int i14, ForecastWeather forecastWeather) {
                RepeatedFieldBuilderV3<ForecastWeather, ForecastWeather.Builder, ForecastWeatherOrBuilder> repeatedFieldBuilderV3 = this.forecastBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    forecastWeather.getClass();
                    ensureForecastIsMutable();
                    this.forecast_.add(i14, forecastWeather);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, forecastWeather);
                return this;
            }

            public Builder addForecastProviders(int i14, DataProvider dataProvider) {
                RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> repeatedFieldBuilderV3 = this.forecastProvidersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    dataProvider.getClass();
                    ensureForecastProvidersIsMutable();
                    this.forecastProviders_.add(i14, dataProvider);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, dataProvider);
                return this;
            }

            public Builder setCurrent(CurrentWeather currentWeather) {
                SingleFieldBuilderV3<CurrentWeather, CurrentWeather.Builder, CurrentWeatherOrBuilder> singleFieldBuilderV3 = this.currentBuilder_;
                if (singleFieldBuilderV3 == null) {
                    currentWeather.getClass();
                    this.current_ = currentWeather;
                } else {
                    singleFieldBuilderV3.setMessage(currentWeather);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setForecast(int i14, ForecastWeather forecastWeather) {
                RepeatedFieldBuilderV3<ForecastWeather, ForecastWeather.Builder, ForecastWeatherOrBuilder> repeatedFieldBuilderV3 = this.forecastBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    forecastWeather.getClass();
                    ensureForecastIsMutable();
                    this.forecast_.set(i14, forecastWeather);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, forecastWeather);
                return this;
            }

            public Builder setForecastProviders(int i14, DataProvider dataProvider) {
                RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> repeatedFieldBuilderV3 = this.forecastProvidersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    dataProvider.getClass();
                    ensureForecastProvidersIsMutable();
                    this.forecastProviders_.set(i14, dataProvider);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, dataProvider);
                return this;
            }

            public Builder addForecast(ForecastWeather forecastWeather) {
                RepeatedFieldBuilderV3<ForecastWeather, ForecastWeather.Builder, ForecastWeatherOrBuilder> repeatedFieldBuilderV3 = this.forecastBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    forecastWeather.getClass();
                    ensureForecastIsMutable();
                    this.forecast_.add(forecastWeather);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(forecastWeather);
                return this;
            }

            public Builder addForecastProviders(DataProvider dataProvider) {
                RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> repeatedFieldBuilderV3 = this.forecastProvidersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    dataProvider.getClass();
                    ensureForecastProvidersIsMutable();
                    this.forecastProviders_.add(dataProvider);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(dataProvider);
                return this;
            }

            public Builder addForecast(int i14, ForecastWeather.Builder builder) {
                RepeatedFieldBuilderV3<ForecastWeather, ForecastWeather.Builder, ForecastWeatherOrBuilder> repeatedFieldBuilderV3 = this.forecastBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureForecastIsMutable();
                    this.forecast_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            public Builder addForecastProviders(int i14, DataProvider.Builder builder) {
                RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> repeatedFieldBuilderV3 = this.forecastProvidersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureForecastProvidersIsMutable();
                    this.forecastProviders_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConditionsResponse) {
                    return mergeFrom((ConditionsResponse) message);
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
                                    codedInputStream.readMessage(getCurrentFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    ForecastWeather forecastWeather = (ForecastWeather) codedInputStream.readMessage(ForecastWeather.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<ForecastWeather, ForecastWeather.Builder, ForecastWeatherOrBuilder> repeatedFieldBuilderV3 = this.forecastBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureForecastIsMutable();
                                        this.forecast_.add(forecastWeather);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(forecastWeather);
                                    }
                                } else if (tag == 26) {
                                    this.forecastLocation_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (tag != 34) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    DataProvider dataProvider = (DataProvider) codedInputStream.readMessage(DataProvider.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> repeatedFieldBuilderV4 = this.forecastProvidersBuilder_;
                                    if (repeatedFieldBuilderV4 == null) {
                                        ensureForecastProvidersIsMutable();
                                        this.forecastProviders_.add(dataProvider);
                                    } else {
                                        repeatedFieldBuilderV4.addMessage(dataProvider);
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
        public ConditionsResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConditionsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConditionsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConditionsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConditionsResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConditionsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConditionsResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConditionsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConditionsResponse parseFrom(InputStream inputStream) {
            return (ConditionsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConditionsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConditionsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConditionsResponse parseFrom(CodedInputStream codedInputStream) {
            return (ConditionsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        private ConditionsResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.forecastLocation_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConditionsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConditionsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ ConditionsResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public enum DayOfWeek implements ProtocolMessageEnum {
            SUNDAY(1),
            MONDAY(2),
            TUESDAY(3),
            WEDNESDAY(4),
            THURSDAY(5),
            FRIDAY(6),
            SATURDAY(7);

            public static final int FRIDAY_VALUE = 6;
            public static final int MONDAY_VALUE = 2;
            public static final int SATURDAY_VALUE = 7;
            public static final int SUNDAY_VALUE = 1;
            public static final int THURSDAY_VALUE = 5;
            public static final int TUESDAY_VALUE = 3;
            public static final int WEDNESDAY_VALUE = 4;
            private final int value;
            private static final Internal.EnumLiteMap<DayOfWeek> internalValueMap = new Internal.EnumLiteMap<DayOfWeek>() { // from class: com.garmin.gcsprotos.generated.WeatherProto.ConditionsResponse.DayOfWeek.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public DayOfWeek findValueByNumber(int i14) {
                    return DayOfWeek.forNumber(i14);
                }
            };
            private static final DayOfWeek[] VALUES = values();

            DayOfWeek(int i14) {
                this.value = i14;
            }

            public static DayOfWeek forNumber(int i14) {
                switch (i14) {
                    case 1:
                        return SUNDAY;
                    case 2:
                        return MONDAY;
                    case 3:
                        return TUESDAY;
                    case 4:
                        return WEDNESDAY;
                    case 5:
                        return THURSDAY;
                    case 6:
                        return FRIDAY;
                    case 7:
                        return SATURDAY;
                    default:
                        return null;
                }
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ConditionsResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<DayOfWeek> internalGetValueMap() {
                return internalValueMap;
            }

            public static DayOfWeek valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static DayOfWeek valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class HourlyForecastResponse extends GeneratedMessageV3 implements HourlyForecastResponseOrBuilder {
        public static final int FORECAST_FIELD_NUMBER = 1;
        public static final int PROVIDERS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private List<Forecast> forecast_;
        private byte memoizedIsInitialized;
        private List<DataProvider> providers_;
        private static final HourlyForecastResponse DEFAULT_INSTANCE = new HourlyForecastResponse();

        @Deprecated
        public static final Parser<HourlyForecastResponse> PARSER = new AbstractParser<HourlyForecastResponse>() { // from class: com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponse.1
            @Override // com.google.protobuf.Parser
            public HourlyForecastResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = HourlyForecastResponse.newBuilder();
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

        public interface ForecastOrBuilder extends MessageOrBuilder {
            int getForecastTemp();

            long getHourOfDay();

            WeatherIcon getIcon();

            int getPrecipProb();

            SizedText getSizedSummary(int i14);

            int getSizedSummaryCount();

            List<SizedText> getSizedSummaryList();

            SizedTextOrBuilder getSizedSummaryOrBuilder(int i14);

            List<? extends SizedTextOrBuilder> getSizedSummaryOrBuilderList();

            Wind getWind();

            WindOrBuilder getWindOrBuilder();

            boolean hasForecastTemp();

            boolean hasHourOfDay();

            boolean hasIcon();

            boolean hasPrecipProb();

            boolean hasWind();
        }

        private HourlyForecastResponse() {
            this.memoizedIsInitialized = (byte) -1;
            List list = Collections.EMPTY_LIST;
            this.forecast_ = list;
            this.providers_ = list;
        }

        public static HourlyForecastResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WeatherProto.internal_static_CSM_Proto_Weather_HourlyForecastResponse_descriptor;
        }

        public static Builder newBuilder(HourlyForecastResponse hourlyForecastResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(hourlyForecastResponse);
        }

        public static HourlyForecastResponse parseDelimitedFrom(InputStream inputStream) {
            return (HourlyForecastResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static HourlyForecastResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<HourlyForecastResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HourlyForecastResponse)) {
                return super.equals(obj);
            }
            HourlyForecastResponse hourlyForecastResponse = (HourlyForecastResponse) obj;
            return getForecastList().equals(hourlyForecastResponse.getForecastList()) && getProvidersList().equals(hourlyForecastResponse.getProvidersList()) && getUnknownFields().equals(hourlyForecastResponse.getUnknownFields());
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponseOrBuilder
        public Forecast getForecast(int i14) {
            return this.forecast_.get(i14);
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponseOrBuilder
        public int getForecastCount() {
            return this.forecast_.size();
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponseOrBuilder
        public List<Forecast> getForecastList() {
            return this.forecast_;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponseOrBuilder
        public ForecastOrBuilder getForecastOrBuilder(int i14) {
            return this.forecast_.get(i14);
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponseOrBuilder
        public List<? extends ForecastOrBuilder> getForecastOrBuilderList() {
            return this.forecast_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<HourlyForecastResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponseOrBuilder
        public DataProvider getProviders(int i14) {
            return this.providers_.get(i14);
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponseOrBuilder
        public int getProvidersCount() {
            return this.providers_.size();
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponseOrBuilder
        public List<DataProvider> getProvidersList() {
            return this.providers_;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponseOrBuilder
        public DataProviderOrBuilder getProvidersOrBuilder(int i14) {
            return this.providers_.get(i14);
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponseOrBuilder
        public List<? extends DataProviderOrBuilder> getProvidersOrBuilderList() {
            return this.providers_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = 0;
            for (int i15 = 0; i15 < this.forecast_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.forecast_.get(i15));
            }
            for (int i16 = 0; i16 < this.providers_.size(); i16++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, this.providers_.get(i16));
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
            if (getForecastCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getForecastList().hashCode();
            }
            if (getProvidersCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getProvidersList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WeatherProto.internal_static_CSM_Proto_Weather_HourlyForecastResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(HourlyForecastResponse.class, Builder.class);
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
            for (int i14 = 0; i14 < getForecastCount(); i14++) {
                if (!getForecast(i14).isInitialized()) {
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
            return new HourlyForecastResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.forecast_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.forecast_.get(i14));
            }
            for (int i15 = 0; i15 < this.providers_.size(); i15++) {
                codedOutputStream.writeMessage(2, this.providers_.get(i15));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Forecast extends GeneratedMessageV3 implements ForecastOrBuilder {
            public static final int FORECAST_TEMP_FIELD_NUMBER = 3;
            public static final int HOUR_OF_DAY_FIELD_NUMBER = 1;
            public static final int ICON_FIELD_NUMBER = 5;
            public static final int PRECIP_PROB_FIELD_NUMBER = 4;
            public static final int SIZED_SUMMARY_FIELD_NUMBER = 6;
            public static final int WIND_FIELD_NUMBER = 7;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private int forecastTemp_;
            private long hourOfDay_;
            private int icon_;
            private byte memoizedIsInitialized;
            private int precipProb_;
            private List<SizedText> sizedSummary_;
            private Wind wind_;
            private static final Forecast DEFAULT_INSTANCE = new Forecast();

            @Deprecated
            public static final Parser<Forecast> PARSER = new AbstractParser<Forecast>() { // from class: com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponse.Forecast.1
                @Override // com.google.protobuf.Parser
                public Forecast parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = Forecast.newBuilder();
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

            private Forecast() {
                this.hourOfDay_ = 0L;
                this.forecastTemp_ = 0;
                this.precipProb_ = 0;
                this.memoizedIsInitialized = (byte) -1;
                this.icon_ = 0;
                this.sizedSummary_ = Collections.EMPTY_LIST;
            }

            public static Forecast getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WeatherProto.internal_static_CSM_Proto_Weather_HourlyForecastResponse_Forecast_descriptor;
            }

            public static Builder newBuilder(Forecast forecast) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(forecast);
            }

            public static Forecast parseDelimitedFrom(InputStream inputStream) {
                return (Forecast) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Forecast parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<Forecast> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Forecast)) {
                    return super.equals(obj);
                }
                Forecast forecast = (Forecast) obj;
                if (hasHourOfDay() != forecast.hasHourOfDay()) {
                    return false;
                }
                if ((hasHourOfDay() && getHourOfDay() != forecast.getHourOfDay()) || hasForecastTemp() != forecast.hasForecastTemp()) {
                    return false;
                }
                if ((hasForecastTemp() && getForecastTemp() != forecast.getForecastTemp()) || hasPrecipProb() != forecast.hasPrecipProb()) {
                    return false;
                }
                if ((hasPrecipProb() && getPrecipProb() != forecast.getPrecipProb()) || hasIcon() != forecast.hasIcon()) {
                    return false;
                }
                if ((!hasIcon() || this.icon_ == forecast.icon_) && getSizedSummaryList().equals(forecast.getSizedSummaryList()) && hasWind() == forecast.hasWind()) {
                    return (!hasWind() || getWind().equals(forecast.getWind())) && getUnknownFields().equals(forecast.getUnknownFields());
                }
                return false;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponse.ForecastOrBuilder
            public int getForecastTemp() {
                return this.forecastTemp_;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponse.ForecastOrBuilder
            public long getHourOfDay() {
                return this.hourOfDay_;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponse.ForecastOrBuilder
            public WeatherIcon getIcon() {
                WeatherIcon weatherIconForNumber = WeatherIcon.forNumber(this.icon_);
                return weatherIconForNumber == null ? WeatherIcon.CLEAR : weatherIconForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<Forecast> getParserForType() {
                return PARSER;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponse.ForecastOrBuilder
            public int getPrecipProb() {
                return this.precipProb_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i14 = this.memoizedSize;
                if (i14 != -1) {
                    return i14;
                }
                int iComputeUInt64Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt64Size(1, this.hourOfDay_) : 0;
                if ((this.bitField0_ & 2) != 0) {
                    iComputeUInt64Size += CodedOutputStream.computeSInt32Size(3, this.forecastTemp_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    iComputeUInt64Size += CodedOutputStream.computeUInt32Size(4, this.precipProb_);
                }
                if ((this.bitField0_ & 8) != 0) {
                    iComputeUInt64Size += CodedOutputStream.computeEnumSize(5, this.icon_);
                }
                for (int i15 = 0; i15 < this.sizedSummary_.size(); i15++) {
                    iComputeUInt64Size += CodedOutputStream.computeMessageSize(6, this.sizedSummary_.get(i15));
                }
                if ((this.bitField0_ & 16) != 0) {
                    iComputeUInt64Size += CodedOutputStream.computeMessageSize(7, getWind());
                }
                int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt64Size;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponse.ForecastOrBuilder
            public SizedText getSizedSummary(int i14) {
                return this.sizedSummary_.get(i14);
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponse.ForecastOrBuilder
            public int getSizedSummaryCount() {
                return this.sizedSummary_.size();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponse.ForecastOrBuilder
            public List<SizedText> getSizedSummaryList() {
                return this.sizedSummary_;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponse.ForecastOrBuilder
            public SizedTextOrBuilder getSizedSummaryOrBuilder(int i14) {
                return this.sizedSummary_.get(i14);
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponse.ForecastOrBuilder
            public List<? extends SizedTextOrBuilder> getSizedSummaryOrBuilderList() {
                return this.sizedSummary_;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponse.ForecastOrBuilder
            public Wind getWind() {
                Wind wind = this.wind_;
                return wind == null ? Wind.getDefaultInstance() : wind;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponse.ForecastOrBuilder
            public WindOrBuilder getWindOrBuilder() {
                Wind wind = this.wind_;
                return wind == null ? Wind.getDefaultInstance() : wind;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponse.ForecastOrBuilder
            public boolean hasForecastTemp() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponse.ForecastOrBuilder
            public boolean hasHourOfDay() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponse.ForecastOrBuilder
            public boolean hasIcon() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponse.ForecastOrBuilder
            public boolean hasPrecipProb() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponse.ForecastOrBuilder
            public boolean hasWind() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i14 = this.memoizedHashCode;
                if (i14 != 0) {
                    return i14;
                }
                int iHashCode = getDescriptor().hashCode() + 779;
                if (hasHourOfDay()) {
                    iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashLong(getHourOfDay());
                }
                if (hasForecastTemp()) {
                    iHashCode = e5.c(iHashCode, 37, 3, 53) + getForecastTemp();
                }
                if (hasPrecipProb()) {
                    iHashCode = e5.c(iHashCode, 37, 4, 53) + getPrecipProb();
                }
                if (hasIcon()) {
                    iHashCode = e5.c(iHashCode, 37, 5, 53) + this.icon_;
                }
                if (getSizedSummaryCount() > 0) {
                    iHashCode = e5.c(iHashCode, 37, 6, 53) + getSizedSummaryList().hashCode();
                }
                if (hasWind()) {
                    iHashCode = e5.c(iHashCode, 37, 7, 53) + getWind().hashCode();
                }
                int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WeatherProto.internal_static_CSM_Proto_Weather_HourlyForecastResponse_Forecast_fieldAccessorTable.ensureFieldAccessorsInitialized(Forecast.class, Builder.class);
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
                for (int i14 = 0; i14 < getSizedSummaryCount(); i14++) {
                    if (!getSizedSummary(i14).isInitialized()) {
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
                return new Forecast();
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                int i14 = 0;
                return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                if ((this.bitField0_ & 1) != 0) {
                    codedOutputStream.writeUInt64(1, this.hourOfDay_);
                }
                if ((this.bitField0_ & 2) != 0) {
                    codedOutputStream.writeSInt32(3, this.forecastTemp_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    codedOutputStream.writeUInt32(4, this.precipProb_);
                }
                if ((this.bitField0_ & 8) != 0) {
                    codedOutputStream.writeEnum(5, this.icon_);
                }
                for (int i14 = 0; i14 < this.sizedSummary_.size(); i14++) {
                    codedOutputStream.writeMessage(6, this.sizedSummary_.get(i14));
                }
                if ((this.bitField0_ & 16) != 0) {
                    codedOutputStream.writeMessage(7, getWind());
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ForecastOrBuilder {
                private int bitField0_;
                private int forecastTemp_;
                private long hourOfDay_;
                private int icon_;
                private int precipProb_;
                private RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> sizedSummaryBuilder_;
                private List<SizedText> sizedSummary_;
                private SingleFieldBuilderV3<Wind, Wind.Builder, WindOrBuilder> windBuilder_;
                private Wind wind_;

                private Builder() {
                    this.icon_ = 0;
                    this.sizedSummary_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                private void buildPartial0(Forecast forecast) {
                    int i14;
                    int i15 = this.bitField0_;
                    if ((i15 & 1) != 0) {
                        forecast.hourOfDay_ = this.hourOfDay_;
                        i14 = 1;
                    } else {
                        i14 = 0;
                    }
                    if ((i15 & 2) != 0) {
                        forecast.forecastTemp_ = this.forecastTemp_;
                        i14 |= 2;
                    }
                    if ((i15 & 4) != 0) {
                        forecast.precipProb_ = this.precipProb_;
                        i14 |= 4;
                    }
                    if ((i15 & 8) != 0) {
                        forecast.icon_ = this.icon_;
                        i14 |= 8;
                    }
                    if ((i15 & 32) != 0) {
                        SingleFieldBuilderV3<Wind, Wind.Builder, WindOrBuilder> singleFieldBuilderV3 = this.windBuilder_;
                        forecast.wind_ = singleFieldBuilderV3 == null ? this.wind_ : (Wind) singleFieldBuilderV3.build();
                        i14 |= 16;
                    }
                    forecast.bitField0_ |= i14;
                }

                private void buildPartialRepeatedFields(Forecast forecast) {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedSummaryBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        forecast.sizedSummary_ = repeatedFieldBuilderV3.build();
                        return;
                    }
                    if ((this.bitField0_ & 16) != 0) {
                        this.sizedSummary_ = Collections.unmodifiableList(this.sizedSummary_);
                        this.bitField0_ &= -17;
                    }
                    forecast.sizedSummary_ = this.sizedSummary_;
                }

                private void ensureSizedSummaryIsMutable() {
                    if ((this.bitField0_ & 16) == 0) {
                        this.sizedSummary_ = new ArrayList(this.sizedSummary_);
                        this.bitField0_ |= 16;
                    }
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return WeatherProto.internal_static_CSM_Proto_Weather_HourlyForecastResponse_Forecast_descriptor;
                }

                private RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> getSizedSummaryFieldBuilder() {
                    if (this.sizedSummaryBuilder_ == null) {
                        this.sizedSummaryBuilder_ = new RepeatedFieldBuilderV3<>(this.sizedSummary_, (this.bitField0_ & 16) != 0, getParentForChildren(), isClean());
                        this.sizedSummary_ = null;
                    }
                    return this.sizedSummaryBuilder_;
                }

                private SingleFieldBuilderV3<Wind, Wind.Builder, WindOrBuilder> getWindFieldBuilder() {
                    if (this.windBuilder_ == null) {
                        this.windBuilder_ = new SingleFieldBuilderV3<>(getWind(), getParentForChildren(), isClean());
                        this.wind_ = null;
                    }
                    return this.windBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                        getSizedSummaryFieldBuilder();
                        getWindFieldBuilder();
                    }
                }

                public Builder addAllSizedSummary(Iterable<? extends SizedText> iterable) {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedSummaryBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addAllMessages(iterable);
                        return this;
                    }
                    ensureSizedSummaryIsMutable();
                    AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.sizedSummary_);
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                public Builder addSizedSummary(SizedText.Builder builder) {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedSummaryBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.addMessage(builder.build());
                        return this;
                    }
                    ensureSizedSummaryIsMutable();
                    this.sizedSummary_.add(builder.build());
                    onChanged();
                    return this;
                }

                public SizedText.Builder addSizedSummaryBuilder() {
                    return (SizedText.Builder) getSizedSummaryFieldBuilder().addBuilder(SizedText.getDefaultInstance());
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Forecast build() {
                    Forecast forecastBuildPartial = buildPartial();
                    if (forecastBuildPartial.isInitialized()) {
                        return forecastBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) forecastBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Forecast buildPartial() {
                    Forecast forecast = new Forecast(this);
                    buildPartialRepeatedFields(forecast);
                    if (this.bitField0_ != 0) {
                        buildPartial0(forecast);
                    }
                    onBuilt();
                    return forecast;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.hourOfDay_ = 0L;
                    this.forecastTemp_ = 0;
                    this.precipProb_ = 0;
                    this.icon_ = 0;
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedSummaryBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        this.sizedSummary_ = Collections.EMPTY_LIST;
                    } else {
                        this.sizedSummary_ = null;
                        repeatedFieldBuilderV3.clear();
                    }
                    this.bitField0_ &= -17;
                    this.wind_ = null;
                    SingleFieldBuilderV3<Wind, Wind.Builder, WindOrBuilder> singleFieldBuilderV3 = this.windBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.dispose();
                        this.windBuilder_ = null;
                    }
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                public Builder clearForecastTemp() {
                    this.bitField0_ &= -3;
                    this.forecastTemp_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearHourOfDay() {
                    this.bitField0_ &= -2;
                    this.hourOfDay_ = 0L;
                    onChanged();
                    return this;
                }

                public Builder clearIcon() {
                    this.bitField0_ &= -9;
                    this.icon_ = 0;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (Builder) super.clearOneof(oneofDescriptor);
                }

                public Builder clearPrecipProb() {
                    this.bitField0_ &= -5;
                    this.precipProb_ = 0;
                    onChanged();
                    return this;
                }

                public Builder clearSizedSummary() {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedSummaryBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.clear();
                        return this;
                    }
                    this.sizedSummary_ = Collections.EMPTY_LIST;
                    this.bitField0_ &= -17;
                    onChanged();
                    return this;
                }

                public Builder clearWind() {
                    this.bitField0_ &= -33;
                    this.wind_ = null;
                    SingleFieldBuilderV3<Wind, Wind.Builder, WindOrBuilder> singleFieldBuilderV3 = this.windBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.dispose();
                        this.windBuilder_ = null;
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
                    return WeatherProto.internal_static_CSM_Proto_Weather_HourlyForecastResponse_Forecast_descriptor;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponse.ForecastOrBuilder
                public int getForecastTemp() {
                    return this.forecastTemp_;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponse.ForecastOrBuilder
                public long getHourOfDay() {
                    return this.hourOfDay_;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponse.ForecastOrBuilder
                public WeatherIcon getIcon() {
                    WeatherIcon weatherIconForNumber = WeatherIcon.forNumber(this.icon_);
                    return weatherIconForNumber == null ? WeatherIcon.CLEAR : weatherIconForNumber;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponse.ForecastOrBuilder
                public int getPrecipProb() {
                    return this.precipProb_;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponse.ForecastOrBuilder
                public SizedText getSizedSummary(int i14) {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedSummaryBuilder_;
                    return repeatedFieldBuilderV3 == null ? this.sizedSummary_.get(i14) : (SizedText) repeatedFieldBuilderV3.getMessage(i14);
                }

                public SizedText.Builder getSizedSummaryBuilder(int i14) {
                    return (SizedText.Builder) getSizedSummaryFieldBuilder().getBuilder(i14);
                }

                public List<SizedText.Builder> getSizedSummaryBuilderList() {
                    return getSizedSummaryFieldBuilder().getBuilderList();
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponse.ForecastOrBuilder
                public int getSizedSummaryCount() {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedSummaryBuilder_;
                    return repeatedFieldBuilderV3 == null ? this.sizedSummary_.size() : repeatedFieldBuilderV3.getCount();
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponse.ForecastOrBuilder
                public List<SizedText> getSizedSummaryList() {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedSummaryBuilder_;
                    return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.sizedSummary_) : repeatedFieldBuilderV3.getMessageList();
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponse.ForecastOrBuilder
                public SizedTextOrBuilder getSizedSummaryOrBuilder(int i14) {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedSummaryBuilder_;
                    return repeatedFieldBuilderV3 == null ? this.sizedSummary_.get(i14) : (SizedTextOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponse.ForecastOrBuilder
                public List<? extends SizedTextOrBuilder> getSizedSummaryOrBuilderList() {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedSummaryBuilder_;
                    return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.sizedSummary_);
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponse.ForecastOrBuilder
                public Wind getWind() {
                    SingleFieldBuilderV3<Wind, Wind.Builder, WindOrBuilder> singleFieldBuilderV3 = this.windBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return (Wind) singleFieldBuilderV3.getMessage();
                    }
                    Wind wind = this.wind_;
                    return wind == null ? Wind.getDefaultInstance() : wind;
                }

                public Wind.Builder getWindBuilder() {
                    this.bitField0_ |= 32;
                    onChanged();
                    return (Wind.Builder) getWindFieldBuilder().getBuilder();
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponse.ForecastOrBuilder
                public WindOrBuilder getWindOrBuilder() {
                    SingleFieldBuilderV3<Wind, Wind.Builder, WindOrBuilder> singleFieldBuilderV3 = this.windBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return (WindOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    Wind wind = this.wind_;
                    return wind == null ? Wind.getDefaultInstance() : wind;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponse.ForecastOrBuilder
                public boolean hasForecastTemp() {
                    return (this.bitField0_ & 2) != 0;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponse.ForecastOrBuilder
                public boolean hasHourOfDay() {
                    return (this.bitField0_ & 1) != 0;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponse.ForecastOrBuilder
                public boolean hasIcon() {
                    return (this.bitField0_ & 8) != 0;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponse.ForecastOrBuilder
                public boolean hasPrecipProb() {
                    return (this.bitField0_ & 4) != 0;
                }

                @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponse.ForecastOrBuilder
                public boolean hasWind() {
                    return (this.bitField0_ & 32) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return WeatherProto.internal_static_CSM_Proto_Weather_HourlyForecastResponse_Forecast_fieldAccessorTable.ensureFieldAccessorsInitialized(Forecast.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    for (int i14 = 0; i14 < getSizedSummaryCount(); i14++) {
                        if (!getSizedSummary(i14).isInitialized()) {
                            return false;
                        }
                    }
                    return true;
                }

                public Builder mergeFrom(Forecast forecast) {
                    if (forecast == Forecast.getDefaultInstance()) {
                        return this;
                    }
                    if (forecast.hasHourOfDay()) {
                        setHourOfDay(forecast.getHourOfDay());
                    }
                    if (forecast.hasForecastTemp()) {
                        setForecastTemp(forecast.getForecastTemp());
                    }
                    if (forecast.hasPrecipProb()) {
                        setPrecipProb(forecast.getPrecipProb());
                    }
                    if (forecast.hasIcon()) {
                        setIcon(forecast.getIcon());
                    }
                    if (this.sizedSummaryBuilder_ == null) {
                        if (!forecast.sizedSummary_.isEmpty()) {
                            if (this.sizedSummary_.isEmpty()) {
                                this.sizedSummary_ = forecast.sizedSummary_;
                                this.bitField0_ &= -17;
                            } else {
                                ensureSizedSummaryIsMutable();
                                this.sizedSummary_.addAll(forecast.sizedSummary_);
                            }
                            onChanged();
                        }
                    } else if (!forecast.sizedSummary_.isEmpty()) {
                        boolean zIsEmpty = this.sizedSummaryBuilder_.isEmpty();
                        RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedSummaryBuilder_;
                        if (zIsEmpty) {
                            repeatedFieldBuilderV3.dispose();
                            this.sizedSummaryBuilder_ = null;
                            this.sizedSummary_ = forecast.sizedSummary_;
                            this.bitField0_ &= -17;
                            this.sizedSummaryBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getSizedSummaryFieldBuilder() : null;
                        } else {
                            repeatedFieldBuilderV3.addAllMessages(forecast.sizedSummary_);
                        }
                    }
                    if (forecast.hasWind()) {
                        mergeWind(forecast.getWind());
                    }
                    mergeUnknownFields(forecast.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.mergeUnknownFields(unknownFieldSet);
                }

                public Builder mergeWind(Wind wind) {
                    Wind wind2;
                    SingleFieldBuilderV3<Wind, Wind.Builder, WindOrBuilder> singleFieldBuilderV3 = this.windBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.mergeFrom(wind);
                    } else if ((this.bitField0_ & 32) == 0 || (wind2 = this.wind_) == null || wind2 == Wind.getDefaultInstance()) {
                        this.wind_ = wind;
                    } else {
                        getWindBuilder().mergeFrom(wind);
                    }
                    this.bitField0_ |= 32;
                    onChanged();
                    return this;
                }

                public Builder removeSizedSummary(int i14) {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedSummaryBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.remove(i14);
                        return this;
                    }
                    ensureSizedSummaryIsMutable();
                    this.sizedSummary_.remove(i14);
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.setField(fieldDescriptor, obj);
                }

                public Builder setForecastTemp(int i14) {
                    this.forecastTemp_ = i14;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                public Builder setHourOfDay(long j8) {
                    this.hourOfDay_ = j8;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setIcon(WeatherIcon weatherIcon) {
                    weatherIcon.getClass();
                    this.bitField0_ |= 8;
                    this.icon_ = weatherIcon.getNumber();
                    onChanged();
                    return this;
                }

                public Builder setPrecipProb(int i14) {
                    this.precipProb_ = i14;
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                    return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
                }

                public Builder setSizedSummary(int i14, SizedText.Builder builder) {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedSummaryBuilder_;
                    if (repeatedFieldBuilderV3 != null) {
                        repeatedFieldBuilderV3.setMessage(i14, builder.build());
                        return this;
                    }
                    ensureSizedSummaryIsMutable();
                    this.sizedSummary_.set(i14, builder.build());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.setUnknownFields(unknownFieldSet);
                }

                public Builder setWind(Wind.Builder builder) {
                    SingleFieldBuilderV3<Wind, Wind.Builder, WindOrBuilder> singleFieldBuilderV3 = this.windBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.wind_ = builder.build();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    this.bitField0_ |= 32;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public Forecast getDefaultInstanceForType() {
                    return Forecast.getDefaultInstance();
                }

                public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                    this(builderParent);
                }

                public /* synthetic */ Builder(int i14) {
                    this();
                }

                public SizedText.Builder addSizedSummaryBuilder(int i14) {
                    return (SizedText.Builder) getSizedSummaryFieldBuilder().addBuilder(i14, SizedText.getDefaultInstance());
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.icon_ = 0;
                    this.sizedSummary_ = Collections.EMPTY_LIST;
                    maybeForceBuilderInitialization();
                }

                public Builder addSizedSummary(int i14, SizedText sizedText) {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedSummaryBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        sizedText.getClass();
                        ensureSizedSummaryIsMutable();
                        this.sizedSummary_.add(i14, sizedText);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilderV3.addMessage(i14, sizedText);
                    return this;
                }

                public Builder setSizedSummary(int i14, SizedText sizedText) {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedSummaryBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        sizedText.getClass();
                        ensureSizedSummaryIsMutable();
                        this.sizedSummary_.set(i14, sizedText);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilderV3.setMessage(i14, sizedText);
                    return this;
                }

                public Builder setWind(Wind wind) {
                    SingleFieldBuilderV3<Wind, Wind.Builder, WindOrBuilder> singleFieldBuilderV3 = this.windBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        wind.getClass();
                        this.wind_ = wind;
                    } else {
                        singleFieldBuilderV3.setMessage(wind);
                    }
                    this.bitField0_ |= 32;
                    onChanged();
                    return this;
                }

                public Builder addSizedSummary(SizedText sizedText) {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedSummaryBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        sizedText.getClass();
                        ensureSizedSummaryIsMutable();
                        this.sizedSummary_.add(sizedText);
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilderV3.addMessage(sizedText);
                    return this;
                }

                public Builder addSizedSummary(int i14, SizedText.Builder builder) {
                    RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedSummaryBuilder_;
                    if (repeatedFieldBuilderV3 == null) {
                        ensureSizedSummaryIsMutable();
                        this.sizedSummary_.add(i14, builder.build());
                        onChanged();
                        return this;
                    }
                    repeatedFieldBuilderV3.addMessage(i14, builder.build());
                    return this;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof Forecast) {
                        return mergeFrom((Forecast) message);
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
                                        this.hourOfDay_ = codedInputStream.readUInt64();
                                        this.bitField0_ |= 1;
                                    } else if (tag == 24) {
                                        this.forecastTemp_ = codedInputStream.readSInt32();
                                        this.bitField0_ |= 2;
                                    } else if (tag == 32) {
                                        this.precipProb_ = codedInputStream.readUInt32();
                                        this.bitField0_ |= 4;
                                    } else if (tag == 40) {
                                        int i14 = codedInputStream.readEnum();
                                        if (WeatherIcon.forNumber(i14) == null) {
                                            mergeUnknownVarintField(5, i14);
                                        } else {
                                            this.icon_ = i14;
                                            this.bitField0_ |= 8;
                                        }
                                    } else if (tag == 50) {
                                        SizedText sizedText = (SizedText) codedInputStream.readMessage(SizedText.PARSER, extensionRegistryLite);
                                        RepeatedFieldBuilderV3<SizedText, SizedText.Builder, SizedTextOrBuilder> repeatedFieldBuilderV3 = this.sizedSummaryBuilder_;
                                        if (repeatedFieldBuilderV3 == null) {
                                            ensureSizedSummaryIsMutable();
                                            this.sizedSummary_.add(sizedText);
                                        } else {
                                            repeatedFieldBuilderV3.addMessage(sizedText);
                                        }
                                    } else if (tag != 58) {
                                        if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        }
                                    } else {
                                        codedInputStream.readMessage(getWindFieldBuilder().getBuilder(), extensionRegistryLite);
                                        this.bitField0_ |= 32;
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
            public Forecast getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public static Forecast parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Forecast) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Forecast parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Forecast parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Forecast parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static Forecast parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            public static Forecast parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static Forecast parseFrom(InputStream inputStream) {
                return (Forecast) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static Forecast parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Forecast) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static Forecast parseFrom(CodedInputStream codedInputStream) {
                return (Forecast) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static Forecast parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Forecast) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            private Forecast(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.hourOfDay_ = 0L;
                this.forecastTemp_ = 0;
                this.precipProb_ = 0;
                this.icon_ = 0;
                this.memoizedIsInitialized = (byte) -1;
            }

            public /* synthetic */ Forecast(Builder builder) {
                this((GeneratedMessageV3.Builder<?>) builder);
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HourlyForecastResponseOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> forecastBuilder_;
            private List<Forecast> forecast_;
            private RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> providersBuilder_;
            private List<DataProvider> providers_;

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.forecast_ = list;
                this.providers_ = list;
            }

            private void buildPartial0(HourlyForecastResponse hourlyForecastResponse) {
            }

            private void buildPartialRepeatedFields(HourlyForecastResponse hourlyForecastResponse) {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.forecast_ = Collections.unmodifiableList(this.forecast_);
                        this.bitField0_ &= -2;
                    }
                    hourlyForecastResponse.forecast_ = this.forecast_;
                } else {
                    hourlyForecastResponse.forecast_ = repeatedFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> repeatedFieldBuilderV4 = this.providersBuilder_;
                if (repeatedFieldBuilderV4 != null) {
                    hourlyForecastResponse.providers_ = repeatedFieldBuilderV4.build();
                    return;
                }
                if ((this.bitField0_ & 2) != 0) {
                    this.providers_ = Collections.unmodifiableList(this.providers_);
                    this.bitField0_ &= -3;
                }
                hourlyForecastResponse.providers_ = this.providers_;
            }

            private void ensureForecastIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.forecast_ = new ArrayList(this.forecast_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureProvidersIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.providers_ = new ArrayList(this.providers_);
                    this.bitField0_ |= 2;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WeatherProto.internal_static_CSM_Proto_Weather_HourlyForecastResponse_descriptor;
            }

            private RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> getForecastFieldBuilder() {
                if (this.forecastBuilder_ == null) {
                    this.forecastBuilder_ = new RepeatedFieldBuilderV3<>(this.forecast_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.forecast_ = null;
                }
                return this.forecastBuilder_;
            }

            private RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> getProvidersFieldBuilder() {
                if (this.providersBuilder_ == null) {
                    this.providersBuilder_ = new RepeatedFieldBuilderV3<>(this.providers_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.providers_ = null;
                }
                return this.providersBuilder_;
            }

            public Builder addAllForecast(Iterable<? extends Forecast> iterable) {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureForecastIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.forecast_);
                onChanged();
                return this;
            }

            public Builder addAllProviders(Iterable<? extends DataProvider> iterable) {
                RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> repeatedFieldBuilderV3 = this.providersBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureProvidersIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.providers_);
                onChanged();
                return this;
            }

            public Builder addForecast(Forecast.Builder builder) {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureForecastIsMutable();
                this.forecast_.add(builder.build());
                onChanged();
                return this;
            }

            public Forecast.Builder addForecastBuilder() {
                return (Forecast.Builder) getForecastFieldBuilder().addBuilder(Forecast.getDefaultInstance());
            }

            public Builder addProviders(DataProvider.Builder builder) {
                RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> repeatedFieldBuilderV3 = this.providersBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureProvidersIsMutable();
                this.providers_.add(builder.build());
                onChanged();
                return this;
            }

            public DataProvider.Builder addProvidersBuilder() {
                return (DataProvider.Builder) getProvidersFieldBuilder().addBuilder(DataProvider.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HourlyForecastResponse build() {
                HourlyForecastResponse hourlyForecastResponseBuildPartial = buildPartial();
                if (hourlyForecastResponseBuildPartial.isInitialized()) {
                    return hourlyForecastResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) hourlyForecastResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HourlyForecastResponse buildPartial() {
                HourlyForecastResponse hourlyForecastResponse = new HourlyForecastResponse(this);
                buildPartialRepeatedFields(hourlyForecastResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(hourlyForecastResponse);
                }
                onBuilt();
                return hourlyForecastResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.forecast_ = Collections.EMPTY_LIST;
                } else {
                    this.forecast_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> repeatedFieldBuilderV4 = this.providersBuilder_;
                if (repeatedFieldBuilderV4 == null) {
                    this.providers_ = Collections.EMPTY_LIST;
                } else {
                    this.providers_ = null;
                    repeatedFieldBuilderV4.clear();
                }
                this.bitField0_ &= -3;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearForecast() {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.forecast_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearProviders() {
                RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> repeatedFieldBuilderV3 = this.providersBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.providers_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
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
                return WeatherProto.internal_static_CSM_Proto_Weather_HourlyForecastResponse_descriptor;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponseOrBuilder
            public Forecast getForecast(int i14) {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastBuilder_;
                return repeatedFieldBuilderV3 == null ? this.forecast_.get(i14) : (Forecast) repeatedFieldBuilderV3.getMessage(i14);
            }

            public Forecast.Builder getForecastBuilder(int i14) {
                return (Forecast.Builder) getForecastFieldBuilder().getBuilder(i14);
            }

            public List<Forecast.Builder> getForecastBuilderList() {
                return getForecastFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponseOrBuilder
            public int getForecastCount() {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastBuilder_;
                return repeatedFieldBuilderV3 == null ? this.forecast_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponseOrBuilder
            public List<Forecast> getForecastList() {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.forecast_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponseOrBuilder
            public ForecastOrBuilder getForecastOrBuilder(int i14) {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastBuilder_;
                return repeatedFieldBuilderV3 == null ? this.forecast_.get(i14) : (ForecastOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponseOrBuilder
            public List<? extends ForecastOrBuilder> getForecastOrBuilderList() {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.forecast_);
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponseOrBuilder
            public DataProvider getProviders(int i14) {
                RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> repeatedFieldBuilderV3 = this.providersBuilder_;
                return repeatedFieldBuilderV3 == null ? this.providers_.get(i14) : (DataProvider) repeatedFieldBuilderV3.getMessage(i14);
            }

            public DataProvider.Builder getProvidersBuilder(int i14) {
                return (DataProvider.Builder) getProvidersFieldBuilder().getBuilder(i14);
            }

            public List<DataProvider.Builder> getProvidersBuilderList() {
                return getProvidersFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponseOrBuilder
            public int getProvidersCount() {
                RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> repeatedFieldBuilderV3 = this.providersBuilder_;
                return repeatedFieldBuilderV3 == null ? this.providers_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponseOrBuilder
            public List<DataProvider> getProvidersList() {
                RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> repeatedFieldBuilderV3 = this.providersBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.providers_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponseOrBuilder
            public DataProviderOrBuilder getProvidersOrBuilder(int i14) {
                RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> repeatedFieldBuilderV3 = this.providersBuilder_;
                return repeatedFieldBuilderV3 == null ? this.providers_.get(i14) : (DataProviderOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastResponseOrBuilder
            public List<? extends DataProviderOrBuilder> getProvidersOrBuilderList() {
                RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> repeatedFieldBuilderV3 = this.providersBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.providers_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WeatherProto.internal_static_CSM_Proto_Weather_HourlyForecastResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(HourlyForecastResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i14 = 0; i14 < getForecastCount(); i14++) {
                    if (!getForecast(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(HourlyForecastResponse hourlyForecastResponse) {
                if (hourlyForecastResponse == HourlyForecastResponse.getDefaultInstance()) {
                    return this;
                }
                if (this.forecastBuilder_ == null) {
                    if (!hourlyForecastResponse.forecast_.isEmpty()) {
                        if (this.forecast_.isEmpty()) {
                            this.forecast_ = hourlyForecastResponse.forecast_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureForecastIsMutable();
                            this.forecast_.addAll(hourlyForecastResponse.forecast_);
                        }
                        onChanged();
                    }
                } else if (!hourlyForecastResponse.forecast_.isEmpty()) {
                    boolean zIsEmpty = this.forecastBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.forecastBuilder_ = null;
                        this.forecast_ = hourlyForecastResponse.forecast_;
                        this.bitField0_ &= -2;
                        this.forecastBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getForecastFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(hourlyForecastResponse.forecast_);
                    }
                }
                if (this.providersBuilder_ == null) {
                    if (!hourlyForecastResponse.providers_.isEmpty()) {
                        if (this.providers_.isEmpty()) {
                            this.providers_ = hourlyForecastResponse.providers_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureProvidersIsMutable();
                            this.providers_.addAll(hourlyForecastResponse.providers_);
                        }
                        onChanged();
                    }
                } else if (!hourlyForecastResponse.providers_.isEmpty()) {
                    boolean zIsEmpty2 = this.providersBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> repeatedFieldBuilderV4 = this.providersBuilder_;
                    if (zIsEmpty2) {
                        repeatedFieldBuilderV4.dispose();
                        this.providersBuilder_ = null;
                        this.providers_ = hourlyForecastResponse.providers_;
                        this.bitField0_ &= -3;
                        this.providersBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getProvidersFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV4.addAllMessages(hourlyForecastResponse.providers_);
                    }
                }
                mergeUnknownFields(hourlyForecastResponse.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeForecast(int i14) {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureForecastIsMutable();
                this.forecast_.remove(i14);
                onChanged();
                return this;
            }

            public Builder removeProviders(int i14) {
                RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> repeatedFieldBuilderV3 = this.providersBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureProvidersIsMutable();
                this.providers_.remove(i14);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setForecast(int i14, Forecast.Builder builder) {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureForecastIsMutable();
                this.forecast_.set(i14, builder.build());
                onChanged();
                return this;
            }

            public Builder setProviders(int i14, DataProvider.Builder builder) {
                RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> repeatedFieldBuilderV3 = this.providersBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureProvidersIsMutable();
                this.providers_.set(i14, builder.build());
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
            public HourlyForecastResponse getDefaultInstanceForType() {
                return HourlyForecastResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                List list = Collections.EMPTY_LIST;
                this.forecast_ = list;
                this.providers_ = list;
            }

            public Forecast.Builder addForecastBuilder(int i14) {
                return (Forecast.Builder) getForecastFieldBuilder().addBuilder(i14, Forecast.getDefaultInstance());
            }

            public DataProvider.Builder addProvidersBuilder(int i14) {
                return (DataProvider.Builder) getProvidersFieldBuilder().addBuilder(i14, DataProvider.getDefaultInstance());
            }

            public Builder addForecast(int i14, Forecast forecast) {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    forecast.getClass();
                    ensureForecastIsMutable();
                    this.forecast_.add(i14, forecast);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, forecast);
                return this;
            }

            public Builder addProviders(int i14, DataProvider dataProvider) {
                RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> repeatedFieldBuilderV3 = this.providersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    dataProvider.getClass();
                    ensureProvidersIsMutable();
                    this.providers_.add(i14, dataProvider);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, dataProvider);
                return this;
            }

            public Builder setForecast(int i14, Forecast forecast) {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    forecast.getClass();
                    ensureForecastIsMutable();
                    this.forecast_.set(i14, forecast);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, forecast);
                return this;
            }

            public Builder setProviders(int i14, DataProvider dataProvider) {
                RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> repeatedFieldBuilderV3 = this.providersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    dataProvider.getClass();
                    ensureProvidersIsMutable();
                    this.providers_.set(i14, dataProvider);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, dataProvider);
                return this;
            }

            public Builder addForecast(Forecast forecast) {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    forecast.getClass();
                    ensureForecastIsMutable();
                    this.forecast_.add(forecast);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(forecast);
                return this;
            }

            public Builder addProviders(DataProvider dataProvider) {
                RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> repeatedFieldBuilderV3 = this.providersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    dataProvider.getClass();
                    ensureProvidersIsMutable();
                    this.providers_.add(dataProvider);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(dataProvider);
                return this;
            }

            public Builder addForecast(int i14, Forecast.Builder builder) {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureForecastIsMutable();
                    this.forecast_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            public Builder addProviders(int i14, DataProvider.Builder builder) {
                RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> repeatedFieldBuilderV3 = this.providersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureProvidersIsMutable();
                    this.providers_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof HourlyForecastResponse) {
                    return mergeFrom((HourlyForecastResponse) message);
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
                                    Forecast forecast = (Forecast) codedInputStream.readMessage(Forecast.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureForecastIsMutable();
                                        this.forecast_.add(forecast);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(forecast);
                                    }
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    DataProvider dataProvider = (DataProvider) codedInputStream.readMessage(DataProvider.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<DataProvider, DataProvider.Builder, DataProviderOrBuilder> repeatedFieldBuilderV4 = this.providersBuilder_;
                                    if (repeatedFieldBuilderV4 == null) {
                                        ensureProvidersIsMutable();
                                        this.providers_.add(dataProvider);
                                    } else {
                                        repeatedFieldBuilderV4.addMessage(dataProvider);
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
        public HourlyForecastResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static HourlyForecastResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HourlyForecastResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HourlyForecastResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static HourlyForecastResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static HourlyForecastResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static HourlyForecastResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private HourlyForecastResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static HourlyForecastResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static HourlyForecastResponse parseFrom(InputStream inputStream) {
            return (HourlyForecastResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ HourlyForecastResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static HourlyForecastResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HourlyForecastResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HourlyForecastResponse parseFrom(CodedInputStream codedInputStream) {
            return (HourlyForecastResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static HourlyForecastResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HourlyForecastResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class AdhocZone extends GeneratedMessageV3 implements AdhocZoneOrBuilder {
        private static final AdhocZone DEFAULT_INSTANCE = new AdhocZone();

        @Deprecated
        public static final Parser<AdhocZone> PARSER = new AbstractParser<AdhocZone>() { // from class: com.garmin.gcsprotos.generated.WeatherProto.AdhocZone.1
            @Override // com.google.protobuf.Parser
            public AdhocZone parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AdhocZone.newBuilder();
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
        public static final int POLYGONS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private List<DataTypesProto.Polygon> polygons_;

        private AdhocZone() {
            this.memoizedIsInitialized = (byte) -1;
            this.polygons_ = Collections.EMPTY_LIST;
        }

        public static AdhocZone getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WeatherProto.internal_static_CSM_Proto_Weather_AdhocZone_descriptor;
        }

        public static Builder newBuilder(AdhocZone adhocZone) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(adhocZone);
        }

        public static AdhocZone parseDelimitedFrom(InputStream inputStream) {
            return (AdhocZone) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AdhocZone parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AdhocZone> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AdhocZone)) {
                return super.equals(obj);
            }
            AdhocZone adhocZone = (AdhocZone) obj;
            return getPolygonsList().equals(adhocZone.getPolygonsList()) && getUnknownFields().equals(adhocZone.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AdhocZone> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.AdhocZoneOrBuilder
        public DataTypesProto.Polygon getPolygons(int i14) {
            return this.polygons_.get(i14);
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.AdhocZoneOrBuilder
        public int getPolygonsCount() {
            return this.polygons_.size();
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.AdhocZoneOrBuilder
        public List<DataTypesProto.Polygon> getPolygonsList() {
            return this.polygons_;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.AdhocZoneOrBuilder
        public DataTypesProto.PolygonOrBuilder getPolygonsOrBuilder(int i14) {
            return this.polygons_.get(i14);
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.AdhocZoneOrBuilder
        public List<? extends DataTypesProto.PolygonOrBuilder> getPolygonsOrBuilderList() {
            return this.polygons_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = 0;
            for (int i15 = 0; i15 < this.polygons_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.polygons_.get(i15));
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
            if (getPolygonsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getPolygonsList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WeatherProto.internal_static_CSM_Proto_Weather_AdhocZone_fieldAccessorTable.ensureFieldAccessorsInitialized(AdhocZone.class, Builder.class);
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
            for (int i14 = 0; i14 < getPolygonsCount(); i14++) {
                if (!getPolygons(i14).isInitialized()) {
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
            return new AdhocZone();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.polygons_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.polygons_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AdhocZoneOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> polygonsBuilder_;
            private List<DataTypesProto.Polygon> polygons_;

            private Builder() {
                this.polygons_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(AdhocZone adhocZone) {
            }

            private void buildPartialRepeatedFields(AdhocZone adhocZone) {
                RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> repeatedFieldBuilderV3 = this.polygonsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    adhocZone.polygons_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.polygons_ = Collections.unmodifiableList(this.polygons_);
                    this.bitField0_ &= -2;
                }
                adhocZone.polygons_ = this.polygons_;
            }

            private void ensurePolygonsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.polygons_ = new ArrayList(this.polygons_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WeatherProto.internal_static_CSM_Proto_Weather_AdhocZone_descriptor;
            }

            private RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> getPolygonsFieldBuilder() {
                if (this.polygonsBuilder_ == null) {
                    this.polygonsBuilder_ = new RepeatedFieldBuilderV3<>(this.polygons_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.polygons_ = null;
                }
                return this.polygonsBuilder_;
            }

            public Builder addAllPolygons(Iterable<? extends DataTypesProto.Polygon> iterable) {
                RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> repeatedFieldBuilderV3 = this.polygonsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensurePolygonsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.polygons_);
                onChanged();
                return this;
            }

            public Builder addPolygons(DataTypesProto.Polygon.Builder builder) {
                RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> repeatedFieldBuilderV3 = this.polygonsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensurePolygonsIsMutable();
                this.polygons_.add(builder.build());
                onChanged();
                return this;
            }

            public DataTypesProto.Polygon.Builder addPolygonsBuilder() {
                return (DataTypesProto.Polygon.Builder) getPolygonsFieldBuilder().addBuilder(DataTypesProto.Polygon.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AdhocZone build() {
                AdhocZone adhocZoneBuildPartial = buildPartial();
                if (adhocZoneBuildPartial.isInitialized()) {
                    return adhocZoneBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) adhocZoneBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AdhocZone buildPartial() {
                AdhocZone adhocZone = new AdhocZone(this);
                buildPartialRepeatedFields(adhocZone);
                if (this.bitField0_ != 0) {
                    buildPartial0(adhocZone);
                }
                onBuilt();
                return adhocZone;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> repeatedFieldBuilderV3 = this.polygonsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.polygons_ = Collections.EMPTY_LIST;
                } else {
                    this.polygons_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
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

            public Builder clearPolygons() {
                RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> repeatedFieldBuilderV3 = this.polygonsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.polygons_ = Collections.EMPTY_LIST;
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
                return WeatherProto.internal_static_CSM_Proto_Weather_AdhocZone_descriptor;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AdhocZoneOrBuilder
            public DataTypesProto.Polygon getPolygons(int i14) {
                RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> repeatedFieldBuilderV3 = this.polygonsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.polygons_.get(i14) : (DataTypesProto.Polygon) repeatedFieldBuilderV3.getMessage(i14);
            }

            public DataTypesProto.Polygon.Builder getPolygonsBuilder(int i14) {
                return (DataTypesProto.Polygon.Builder) getPolygonsFieldBuilder().getBuilder(i14);
            }

            public List<DataTypesProto.Polygon.Builder> getPolygonsBuilderList() {
                return getPolygonsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AdhocZoneOrBuilder
            public int getPolygonsCount() {
                RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> repeatedFieldBuilderV3 = this.polygonsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.polygons_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AdhocZoneOrBuilder
            public List<DataTypesProto.Polygon> getPolygonsList() {
                RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> repeatedFieldBuilderV3 = this.polygonsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.polygons_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AdhocZoneOrBuilder
            public DataTypesProto.PolygonOrBuilder getPolygonsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> repeatedFieldBuilderV3 = this.polygonsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.polygons_.get(i14) : (DataTypesProto.PolygonOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AdhocZoneOrBuilder
            public List<? extends DataTypesProto.PolygonOrBuilder> getPolygonsOrBuilderList() {
                RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> repeatedFieldBuilderV3 = this.polygonsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.polygons_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WeatherProto.internal_static_CSM_Proto_Weather_AdhocZone_fieldAccessorTable.ensureFieldAccessorsInitialized(AdhocZone.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i14 = 0; i14 < getPolygonsCount(); i14++) {
                    if (!getPolygons(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(AdhocZone adhocZone) {
                if (adhocZone == AdhocZone.getDefaultInstance()) {
                    return this;
                }
                if (this.polygonsBuilder_ == null) {
                    if (!adhocZone.polygons_.isEmpty()) {
                        if (this.polygons_.isEmpty()) {
                            this.polygons_ = adhocZone.polygons_;
                            this.bitField0_ &= -2;
                        } else {
                            ensurePolygonsIsMutable();
                            this.polygons_.addAll(adhocZone.polygons_);
                        }
                        onChanged();
                    }
                } else if (!adhocZone.polygons_.isEmpty()) {
                    boolean zIsEmpty = this.polygonsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> repeatedFieldBuilderV3 = this.polygonsBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.polygonsBuilder_ = null;
                        this.polygons_ = adhocZone.polygons_;
                        this.bitField0_ &= -2;
                        this.polygonsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getPolygonsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(adhocZone.polygons_);
                    }
                }
                mergeUnknownFields(adhocZone.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removePolygons(int i14) {
                RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> repeatedFieldBuilderV3 = this.polygonsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensurePolygonsIsMutable();
                this.polygons_.remove(i14);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setPolygons(int i14, DataTypesProto.Polygon.Builder builder) {
                RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> repeatedFieldBuilderV3 = this.polygonsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensurePolygonsIsMutable();
                this.polygons_.set(i14, builder.build());
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
            public AdhocZone getDefaultInstanceForType() {
                return AdhocZone.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.polygons_ = Collections.EMPTY_LIST;
            }

            public DataTypesProto.Polygon.Builder addPolygonsBuilder(int i14) {
                return (DataTypesProto.Polygon.Builder) getPolygonsFieldBuilder().addBuilder(i14, DataTypesProto.Polygon.getDefaultInstance());
            }

            public Builder addPolygons(int i14, DataTypesProto.Polygon polygon) {
                RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> repeatedFieldBuilderV3 = this.polygonsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    polygon.getClass();
                    ensurePolygonsIsMutable();
                    this.polygons_.add(i14, polygon);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, polygon);
                return this;
            }

            public Builder setPolygons(int i14, DataTypesProto.Polygon polygon) {
                RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> repeatedFieldBuilderV3 = this.polygonsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    polygon.getClass();
                    ensurePolygonsIsMutable();
                    this.polygons_.set(i14, polygon);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, polygon);
                return this;
            }

            public Builder addPolygons(DataTypesProto.Polygon polygon) {
                RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> repeatedFieldBuilderV3 = this.polygonsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    polygon.getClass();
                    ensurePolygonsIsMutable();
                    this.polygons_.add(polygon);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(polygon);
                return this;
            }

            public Builder addPolygons(int i14, DataTypesProto.Polygon.Builder builder) {
                RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> repeatedFieldBuilderV3 = this.polygonsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensurePolygonsIsMutable();
                    this.polygons_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AdhocZone) {
                    return mergeFrom((AdhocZone) message);
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
                                    DataTypesProto.Polygon polygon = (DataTypesProto.Polygon) codedInputStream.readMessage(DataTypesProto.Polygon.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> repeatedFieldBuilderV3 = this.polygonsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensurePolygonsIsMutable();
                                        this.polygons_.add(polygon);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(polygon);
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
        public AdhocZone getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static AdhocZone parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AdhocZone) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AdhocZone parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AdhocZone parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private AdhocZone(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AdhocZone parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AdhocZone parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ AdhocZone(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static AdhocZone parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AdhocZone parseFrom(InputStream inputStream) {
            return (AdhocZone) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AdhocZone parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AdhocZone) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AdhocZone parseFrom(CodedInputStream codedInputStream) {
            return (AdhocZone) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AdhocZone parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AdhocZone) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class AlertsRequest extends GeneratedMessageV3 implements AlertsRequestOrBuilder {
        public static final int BOUNDING_BOX_FIELD_NUMBER = 1;
        public static final int LANGUAGE_FIELD_NUMBER = 4;
        public static final int QUERY_COOKIE_FIELD_NUMBER = 2;
        public static final int SEVERITY_FIELD_NUMBER = 3;
        public static final int SUMMARY_REQUESTED_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private DataTypesProto.Bbox boundingBox_;
        private DataTypesProto.Language language_;
        private byte memoizedIsInitialized;
        private volatile Object queryCookie_;
        private int severity_;
        private boolean summaryRequested_;
        private static final AlertsRequest DEFAULT_INSTANCE = new AlertsRequest();

        @Deprecated
        public static final Parser<AlertsRequest> PARSER = new AbstractParser<AlertsRequest>() { // from class: com.garmin.gcsprotos.generated.WeatherProto.AlertsRequest.1
            @Override // com.google.protobuf.Parser
            public AlertsRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AlertsRequest.newBuilder();
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

        private AlertsRequest() {
            this.queryCookie_ = "0";
            this.severity_ = 2;
            this.summaryRequested_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.queryCookie_ = "0";
            this.severity_ = 2;
        }

        public static AlertsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WeatherProto.internal_static_CSM_Proto_Weather_AlertsRequest_descriptor;
        }

        public static Builder newBuilder(AlertsRequest alertsRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(alertsRequest);
        }

        public static AlertsRequest parseDelimitedFrom(InputStream inputStream) {
            return (AlertsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AlertsRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AlertsRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AlertsRequest)) {
                return super.equals(obj);
            }
            AlertsRequest alertsRequest = (AlertsRequest) obj;
            if (hasBoundingBox() != alertsRequest.hasBoundingBox()) {
                return false;
            }
            if ((hasBoundingBox() && !getBoundingBox().equals(alertsRequest.getBoundingBox())) || hasQueryCookie() != alertsRequest.hasQueryCookie()) {
                return false;
            }
            if ((hasQueryCookie() && !getQueryCookie().equals(alertsRequest.getQueryCookie())) || hasSeverity() != alertsRequest.hasSeverity()) {
                return false;
            }
            if ((hasSeverity() && this.severity_ != alertsRequest.severity_) || hasLanguage() != alertsRequest.hasLanguage()) {
                return false;
            }
            if ((!hasLanguage() || getLanguage().equals(alertsRequest.getLanguage())) && hasSummaryRequested() == alertsRequest.hasSummaryRequested()) {
                return (!hasSummaryRequested() || getSummaryRequested() == alertsRequest.getSummaryRequested()) && getUnknownFields().equals(alertsRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsRequestOrBuilder
        public DataTypesProto.Bbox getBoundingBox() {
            DataTypesProto.Bbox bbox = this.boundingBox_;
            return bbox == null ? DataTypesProto.Bbox.getDefaultInstance() : bbox;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsRequestOrBuilder
        public DataTypesProto.BboxOrBuilder getBoundingBoxOrBuilder() {
            DataTypesProto.Bbox bbox = this.boundingBox_;
            return bbox == null ? DataTypesProto.Bbox.getDefaultInstance() : bbox;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsRequestOrBuilder
        public DataTypesProto.Language getLanguage() {
            DataTypesProto.Language language = this.language_;
            return language == null ? DataTypesProto.Language.getDefaultInstance() : language;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsRequestOrBuilder
        public DataTypesProto.LanguageOrBuilder getLanguageOrBuilder() {
            DataTypesProto.Language language = this.language_;
            return language == null ? DataTypesProto.Language.getDefaultInstance() : language;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AlertsRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsRequestOrBuilder
        public String getQueryCookie() {
            Object obj = this.queryCookie_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.queryCookie_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsRequestOrBuilder
        public ByteString getQueryCookieBytes() {
            Object obj = this.queryCookie_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.queryCookie_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getBoundingBox()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += GeneratedMessageV3.computeStringSize(2, this.queryCookie_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(3, this.severity_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getLanguage());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeBoolSize(5, this.summaryRequested_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsRequestOrBuilder
        public WeatherSeverity getSeverity() {
            WeatherSeverity weatherSeverityForNumber = WeatherSeverity.forNumber(this.severity_);
            return weatherSeverityForNumber == null ? WeatherSeverity.WATCH : weatherSeverityForNumber;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsRequestOrBuilder
        public boolean getSummaryRequested() {
            return this.summaryRequested_;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsRequestOrBuilder
        public boolean hasBoundingBox() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsRequestOrBuilder
        public boolean hasLanguage() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsRequestOrBuilder
        public boolean hasQueryCookie() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsRequestOrBuilder
        public boolean hasSeverity() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsRequestOrBuilder
        public boolean hasSummaryRequested() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasBoundingBox()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getBoundingBox().hashCode();
            }
            if (hasQueryCookie()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getQueryCookie().hashCode();
            }
            if (hasSeverity()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + this.severity_;
            }
            if (hasLanguage()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getLanguage().hashCode();
            }
            if (hasSummaryRequested()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + Internal.hashBoolean(getSummaryRequested());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WeatherProto.internal_static_CSM_Proto_Weather_AlertsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(AlertsRequest.class, Builder.class);
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
            if (!hasBoundingBox()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!getBoundingBox().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasLanguage() || getLanguage().isInitialized()) {
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
            return new AlertsRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getBoundingBox());
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.queryCookie_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(3, this.severity_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getLanguage());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeBool(5, this.summaryRequested_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AlertsRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<DataTypesProto.Bbox, DataTypesProto.Bbox.Builder, DataTypesProto.BboxOrBuilder> boundingBoxBuilder_;
            private DataTypesProto.Bbox boundingBox_;
            private SingleFieldBuilderV3<DataTypesProto.Language, DataTypesProto.Language.Builder, DataTypesProto.LanguageOrBuilder> languageBuilder_;
            private DataTypesProto.Language language_;
            private Object queryCookie_;
            private int severity_;
            private boolean summaryRequested_;

            private Builder() {
                this.queryCookie_ = "0";
                this.severity_ = 2;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(AlertsRequest alertsRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<DataTypesProto.Bbox, DataTypesProto.Bbox.Builder, DataTypesProto.BboxOrBuilder> singleFieldBuilderV3 = this.boundingBoxBuilder_;
                    alertsRequest.boundingBox_ = singleFieldBuilderV3 == null ? this.boundingBox_ : (DataTypesProto.Bbox) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    alertsRequest.queryCookie_ = this.queryCookie_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    alertsRequest.severity_ = this.severity_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<DataTypesProto.Language, DataTypesProto.Language.Builder, DataTypesProto.LanguageOrBuilder> singleFieldBuilderV4 = this.languageBuilder_;
                    alertsRequest.language_ = singleFieldBuilderV4 == null ? this.language_ : (DataTypesProto.Language) singleFieldBuilderV4.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    alertsRequest.summaryRequested_ = this.summaryRequested_;
                    i14 |= 16;
                }
                alertsRequest.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<DataTypesProto.Bbox, DataTypesProto.Bbox.Builder, DataTypesProto.BboxOrBuilder> getBoundingBoxFieldBuilder() {
                if (this.boundingBoxBuilder_ == null) {
                    this.boundingBoxBuilder_ = new SingleFieldBuilderV3<>(getBoundingBox(), getParentForChildren(), isClean());
                    this.boundingBox_ = null;
                }
                return this.boundingBoxBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WeatherProto.internal_static_CSM_Proto_Weather_AlertsRequest_descriptor;
            }

            private SingleFieldBuilderV3<DataTypesProto.Language, DataTypesProto.Language.Builder, DataTypesProto.LanguageOrBuilder> getLanguageFieldBuilder() {
                if (this.languageBuilder_ == null) {
                    this.languageBuilder_ = new SingleFieldBuilderV3<>(getLanguage(), getParentForChildren(), isClean());
                    this.language_ = null;
                }
                return this.languageBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getBoundingBoxFieldBuilder();
                    getLanguageFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlertsRequest build() {
                AlertsRequest alertsRequestBuildPartial = buildPartial();
                if (alertsRequestBuildPartial.isInitialized()) {
                    return alertsRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) alertsRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlertsRequest buildPartial() {
                AlertsRequest alertsRequest = new AlertsRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(alertsRequest);
                }
                onBuilt();
                return alertsRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.boundingBox_ = null;
                SingleFieldBuilderV3<DataTypesProto.Bbox, DataTypesProto.Bbox.Builder, DataTypesProto.BboxOrBuilder> singleFieldBuilderV3 = this.boundingBoxBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.boundingBoxBuilder_ = null;
                }
                this.queryCookie_ = "0";
                this.severity_ = 2;
                this.language_ = null;
                SingleFieldBuilderV3<DataTypesProto.Language, DataTypesProto.Language.Builder, DataTypesProto.LanguageOrBuilder> singleFieldBuilderV4 = this.languageBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.languageBuilder_ = null;
                }
                this.summaryRequested_ = false;
                return this;
            }

            public Builder clearBoundingBox() {
                this.bitField0_ &= -2;
                this.boundingBox_ = null;
                SingleFieldBuilderV3<DataTypesProto.Bbox, DataTypesProto.Bbox.Builder, DataTypesProto.BboxOrBuilder> singleFieldBuilderV3 = this.boundingBoxBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.boundingBoxBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLanguage() {
                this.bitField0_ &= -9;
                this.language_ = null;
                SingleFieldBuilderV3<DataTypesProto.Language, DataTypesProto.Language.Builder, DataTypesProto.LanguageOrBuilder> singleFieldBuilderV3 = this.languageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.languageBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearQueryCookie() {
                this.queryCookie_ = AlertsRequest.getDefaultInstance().getQueryCookie();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearSeverity() {
                this.bitField0_ &= -5;
                this.severity_ = 2;
                onChanged();
                return this;
            }

            public Builder clearSummaryRequested() {
                this.bitField0_ &= -17;
                this.summaryRequested_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsRequestOrBuilder
            public DataTypesProto.Bbox getBoundingBox() {
                SingleFieldBuilderV3<DataTypesProto.Bbox, DataTypesProto.Bbox.Builder, DataTypesProto.BboxOrBuilder> singleFieldBuilderV3 = this.boundingBoxBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypesProto.Bbox) singleFieldBuilderV3.getMessage();
                }
                DataTypesProto.Bbox bbox = this.boundingBox_;
                return bbox == null ? DataTypesProto.Bbox.getDefaultInstance() : bbox;
            }

            public DataTypesProto.Bbox.Builder getBoundingBoxBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (DataTypesProto.Bbox.Builder) getBoundingBoxFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsRequestOrBuilder
            public DataTypesProto.BboxOrBuilder getBoundingBoxOrBuilder() {
                SingleFieldBuilderV3<DataTypesProto.Bbox, DataTypesProto.Bbox.Builder, DataTypesProto.BboxOrBuilder> singleFieldBuilderV3 = this.boundingBoxBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypesProto.BboxOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DataTypesProto.Bbox bbox = this.boundingBox_;
                return bbox == null ? DataTypesProto.Bbox.getDefaultInstance() : bbox;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WeatherProto.internal_static_CSM_Proto_Weather_AlertsRequest_descriptor;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsRequestOrBuilder
            public DataTypesProto.Language getLanguage() {
                SingleFieldBuilderV3<DataTypesProto.Language, DataTypesProto.Language.Builder, DataTypesProto.LanguageOrBuilder> singleFieldBuilderV3 = this.languageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypesProto.Language) singleFieldBuilderV3.getMessage();
                }
                DataTypesProto.Language language = this.language_;
                return language == null ? DataTypesProto.Language.getDefaultInstance() : language;
            }

            public DataTypesProto.Language.Builder getLanguageBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (DataTypesProto.Language.Builder) getLanguageFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsRequestOrBuilder
            public DataTypesProto.LanguageOrBuilder getLanguageOrBuilder() {
                SingleFieldBuilderV3<DataTypesProto.Language, DataTypesProto.Language.Builder, DataTypesProto.LanguageOrBuilder> singleFieldBuilderV3 = this.languageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypesProto.LanguageOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DataTypesProto.Language language = this.language_;
                return language == null ? DataTypesProto.Language.getDefaultInstance() : language;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsRequestOrBuilder
            public String getQueryCookie() {
                Object obj = this.queryCookie_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.queryCookie_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsRequestOrBuilder
            public ByteString getQueryCookieBytes() {
                Object obj = this.queryCookie_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.queryCookie_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsRequestOrBuilder
            public WeatherSeverity getSeverity() {
                WeatherSeverity weatherSeverityForNumber = WeatherSeverity.forNumber(this.severity_);
                return weatherSeverityForNumber == null ? WeatherSeverity.WATCH : weatherSeverityForNumber;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsRequestOrBuilder
            public boolean getSummaryRequested() {
                return this.summaryRequested_;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsRequestOrBuilder
            public boolean hasBoundingBox() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsRequestOrBuilder
            public boolean hasLanguage() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsRequestOrBuilder
            public boolean hasQueryCookie() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsRequestOrBuilder
            public boolean hasSeverity() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.AlertsRequestOrBuilder
            public boolean hasSummaryRequested() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WeatherProto.internal_static_CSM_Proto_Weather_AlertsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(AlertsRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasBoundingBox() && getBoundingBox().isInitialized()) {
                    return !hasLanguage() || getLanguage().isInitialized();
                }
                return false;
            }

            public Builder mergeBoundingBox(DataTypesProto.Bbox bbox) {
                DataTypesProto.Bbox bbox2;
                SingleFieldBuilderV3<DataTypesProto.Bbox, DataTypesProto.Bbox.Builder, DataTypesProto.BboxOrBuilder> singleFieldBuilderV3 = this.boundingBoxBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(bbox);
                } else if ((this.bitField0_ & 1) == 0 || (bbox2 = this.boundingBox_) == null || bbox2 == DataTypesProto.Bbox.getDefaultInstance()) {
                    this.boundingBox_ = bbox;
                } else {
                    getBoundingBoxBuilder().mergeFrom(bbox);
                }
                this.bitField0_ |= 1;
                onChanged();
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
                                    codedInputStream.readMessage(getBoundingBoxFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.queryCookie_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    int i14 = codedInputStream.readEnum();
                                    if (WeatherSeverity.forNumber(i14) == null) {
                                        mergeUnknownVarintField(3, i14);
                                    } else {
                                        this.severity_ = i14;
                                        this.bitField0_ |= 4;
                                    }
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getLanguageFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.summaryRequested_ = codedInputStream.readBool();
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

            public Builder mergeLanguage(DataTypesProto.Language language) {
                DataTypesProto.Language language2;
                SingleFieldBuilderV3<DataTypesProto.Language, DataTypesProto.Language.Builder, DataTypesProto.LanguageOrBuilder> singleFieldBuilderV3 = this.languageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(language);
                } else if ((this.bitField0_ & 8) == 0 || (language2 = this.language_) == null || language2 == DataTypesProto.Language.getDefaultInstance()) {
                    this.language_ = language;
                } else {
                    getLanguageBuilder().mergeFrom(language);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setBoundingBox(DataTypesProto.Bbox.Builder builder) {
                SingleFieldBuilderV3<DataTypesProto.Bbox, DataTypesProto.Bbox.Builder, DataTypesProto.BboxOrBuilder> singleFieldBuilderV3 = this.boundingBoxBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.boundingBox_ = builder.build();
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

            public Builder setLanguage(DataTypesProto.Language.Builder builder) {
                SingleFieldBuilderV3<DataTypesProto.Language, DataTypesProto.Language.Builder, DataTypesProto.LanguageOrBuilder> singleFieldBuilderV3 = this.languageBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.language_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setQueryCookie(String str) {
                str.getClass();
                this.queryCookie_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setQueryCookieBytes(ByteString byteString) {
                byteString.getClass();
                this.queryCookie_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSeverity(WeatherSeverity weatherSeverity) {
                weatherSeverity.getClass();
                this.bitField0_ |= 4;
                this.severity_ = weatherSeverity.getNumber();
                onChanged();
                return this;
            }

            public Builder setSummaryRequested(boolean z14) {
                this.summaryRequested_ = z14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AlertsRequest getDefaultInstanceForType() {
                return AlertsRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.queryCookie_ = "0";
                this.severity_ = 2;
                maybeForceBuilderInitialization();
            }

            public Builder setBoundingBox(DataTypesProto.Bbox bbox) {
                SingleFieldBuilderV3<DataTypesProto.Bbox, DataTypesProto.Bbox.Builder, DataTypesProto.BboxOrBuilder> singleFieldBuilderV3 = this.boundingBoxBuilder_;
                if (singleFieldBuilderV3 == null) {
                    bbox.getClass();
                    this.boundingBox_ = bbox;
                } else {
                    singleFieldBuilderV3.setMessage(bbox);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setLanguage(DataTypesProto.Language language) {
                SingleFieldBuilderV3<DataTypesProto.Language, DataTypesProto.Language.Builder, DataTypesProto.LanguageOrBuilder> singleFieldBuilderV3 = this.languageBuilder_;
                if (singleFieldBuilderV3 == null) {
                    language.getClass();
                    this.language_ = language;
                } else {
                    singleFieldBuilderV3.setMessage(language);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AlertsRequest) {
                    return mergeFrom((AlertsRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AlertsRequest alertsRequest) {
                if (alertsRequest == AlertsRequest.getDefaultInstance()) {
                    return this;
                }
                if (alertsRequest.hasBoundingBox()) {
                    mergeBoundingBox(alertsRequest.getBoundingBox());
                }
                if (alertsRequest.hasQueryCookie()) {
                    this.queryCookie_ = alertsRequest.queryCookie_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (alertsRequest.hasSeverity()) {
                    setSeverity(alertsRequest.getSeverity());
                }
                if (alertsRequest.hasLanguage()) {
                    mergeLanguage(alertsRequest.getLanguage());
                }
                if (alertsRequest.hasSummaryRequested()) {
                    setSummaryRequested(alertsRequest.getSummaryRequested());
                }
                mergeUnknownFields(alertsRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AlertsRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static AlertsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlertsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlertsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AlertsRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AlertsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AlertsRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AlertsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AlertsRequest parseFrom(InputStream inputStream) {
            return (AlertsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AlertsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlertsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlertsRequest parseFrom(CodedInputStream codedInputStream) {
            return (AlertsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AlertsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlertsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private AlertsRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.queryCookie_ = "0";
            this.severity_ = 2;
            this.summaryRequested_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ AlertsRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class ConditionsRequest extends GeneratedMessageV3 implements ConditionsRequestOrBuilder {
        public static final int ATTRIB_SUPPORTED_FIELD_NUMBER = 5;
        public static final int LANGUAGE_FIELD_NUMBER = 2;
        public static final int NUM_DAYS_FIELD_NUMBER = 3;
        public static final int POSITION_FIELD_NUMBER = 1;
        public static final int TEXT_SIZE_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private boolean attribSupported_;
        private int bitField0_;
        private DataTypesProto.Language language_;
        private byte memoizedIsInitialized;
        private int numDays_;
        private DataTypesProto.ScPoint position_;
        private int textSize_;
        private static final ConditionsRequest DEFAULT_INSTANCE = new ConditionsRequest();

        @Deprecated
        public static final Parser<ConditionsRequest> PARSER = new AbstractParser<ConditionsRequest>() { // from class: com.garmin.gcsprotos.generated.WeatherProto.ConditionsRequest.1
            @Override // com.google.protobuf.Parser
            public ConditionsRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConditionsRequest.newBuilder();
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

        private ConditionsRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.numDays_ = 5;
            this.textSize_ = 2;
            this.attribSupported_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConditionsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WeatherProto.internal_static_CSM_Proto_Weather_ConditionsRequest_descriptor;
        }

        public static Builder newBuilder(ConditionsRequest conditionsRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(conditionsRequest);
        }

        public static ConditionsRequest parseDelimitedFrom(InputStream inputStream) {
            return (ConditionsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConditionsRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConditionsRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConditionsRequest)) {
                return super.equals(obj);
            }
            ConditionsRequest conditionsRequest = (ConditionsRequest) obj;
            if (hasPosition() != conditionsRequest.hasPosition()) {
                return false;
            }
            if ((hasPosition() && !getPosition().equals(conditionsRequest.getPosition())) || hasLanguage() != conditionsRequest.hasLanguage()) {
                return false;
            }
            if ((hasLanguage() && !getLanguage().equals(conditionsRequest.getLanguage())) || hasNumDays() != conditionsRequest.hasNumDays()) {
                return false;
            }
            if ((hasNumDays() && getNumDays() != conditionsRequest.getNumDays()) || hasTextSize() != conditionsRequest.hasTextSize()) {
                return false;
            }
            if ((!hasTextSize() || this.textSize_ == conditionsRequest.textSize_) && hasAttribSupported() == conditionsRequest.hasAttribSupported()) {
                return (!hasAttribSupported() || getAttribSupported() == conditionsRequest.getAttribSupported()) && getUnknownFields().equals(conditionsRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsRequestOrBuilder
        public boolean getAttribSupported() {
            return this.attribSupported_;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsRequestOrBuilder
        public DataTypesProto.Language getLanguage() {
            DataTypesProto.Language language = this.language_;
            return language == null ? DataTypesProto.Language.getDefaultInstance() : language;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsRequestOrBuilder
        public DataTypesProto.LanguageOrBuilder getLanguageOrBuilder() {
            DataTypesProto.Language language = this.language_;
            return language == null ? DataTypesProto.Language.getDefaultInstance() : language;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsRequestOrBuilder
        public int getNumDays() {
            return this.numDays_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConditionsRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsRequestOrBuilder
        public DataTypesProto.ScPoint getPosition() {
            DataTypesProto.ScPoint scPoint = this.position_;
            return scPoint == null ? DataTypesProto.ScPoint.getDefaultInstance() : scPoint;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsRequestOrBuilder
        public DataTypesProto.ScPointOrBuilder getPositionOrBuilder() {
            DataTypesProto.ScPoint scPoint = this.position_;
            return scPoint == null ? DataTypesProto.ScPoint.getDefaultInstance() : scPoint;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getPosition()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getLanguage());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeUInt32Size(3, this.numDays_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(4, this.textSize_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeBoolSize(5, this.attribSupported_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsRequestOrBuilder
        public TextSize getTextSize() {
            TextSize textSizeForNumber = TextSize.forNumber(this.textSize_);
            return textSizeForNumber == null ? TextSize.MEDIUM : textSizeForNumber;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsRequestOrBuilder
        public boolean hasAttribSupported() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsRequestOrBuilder
        public boolean hasLanguage() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsRequestOrBuilder
        public boolean hasNumDays() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsRequestOrBuilder
        public boolean hasPosition() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsRequestOrBuilder
        public boolean hasTextSize() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasPosition()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getPosition().hashCode();
            }
            if (hasLanguage()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getLanguage().hashCode();
            }
            if (hasNumDays()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getNumDays();
            }
            if (hasTextSize()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + this.textSize_;
            }
            if (hasAttribSupported()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + Internal.hashBoolean(getAttribSupported());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WeatherProto.internal_static_CSM_Proto_Weather_ConditionsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConditionsRequest.class, Builder.class);
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
            if (!hasPosition()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!getPosition().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasLanguage() || getLanguage().isInitialized()) {
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
            return new ConditionsRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getPosition());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getLanguage());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.numDays_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeEnum(4, this.textSize_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeBool(5, this.attribSupported_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConditionsRequestOrBuilder {
            private boolean attribSupported_;
            private int bitField0_;
            private SingleFieldBuilderV3<DataTypesProto.Language, DataTypesProto.Language.Builder, DataTypesProto.LanguageOrBuilder> languageBuilder_;
            private DataTypesProto.Language language_;
            private int numDays_;
            private SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> positionBuilder_;
            private DataTypesProto.ScPoint position_;
            private int textSize_;

            private Builder() {
                this.numDays_ = 5;
                this.textSize_ = 2;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ConditionsRequest conditionsRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                    conditionsRequest.position_ = singleFieldBuilderV3 == null ? this.position_ : (DataTypesProto.ScPoint) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<DataTypesProto.Language, DataTypesProto.Language.Builder, DataTypesProto.LanguageOrBuilder> singleFieldBuilderV4 = this.languageBuilder_;
                    conditionsRequest.language_ = singleFieldBuilderV4 == null ? this.language_ : (DataTypesProto.Language) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    conditionsRequest.numDays_ = this.numDays_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    conditionsRequest.textSize_ = this.textSize_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    conditionsRequest.attribSupported_ = this.attribSupported_;
                    i14 |= 16;
                }
                conditionsRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WeatherProto.internal_static_CSM_Proto_Weather_ConditionsRequest_descriptor;
            }

            private SingleFieldBuilderV3<DataTypesProto.Language, DataTypesProto.Language.Builder, DataTypesProto.LanguageOrBuilder> getLanguageFieldBuilder() {
                if (this.languageBuilder_ == null) {
                    this.languageBuilder_ = new SingleFieldBuilderV3<>(getLanguage(), getParentForChildren(), isClean());
                    this.language_ = null;
                }
                return this.languageBuilder_;
            }

            private SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> getPositionFieldBuilder() {
                if (this.positionBuilder_ == null) {
                    this.positionBuilder_ = new SingleFieldBuilderV3<>(getPosition(), getParentForChildren(), isClean());
                    this.position_ = null;
                }
                return this.positionBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getPositionFieldBuilder();
                    getLanguageFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConditionsRequest build() {
                ConditionsRequest conditionsRequestBuildPartial = buildPartial();
                if (conditionsRequestBuildPartial.isInitialized()) {
                    return conditionsRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) conditionsRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConditionsRequest buildPartial() {
                ConditionsRequest conditionsRequest = new ConditionsRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(conditionsRequest);
                }
                onBuilt();
                return conditionsRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.position_ = null;
                SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.positionBuilder_ = null;
                }
                this.language_ = null;
                SingleFieldBuilderV3<DataTypesProto.Language, DataTypesProto.Language.Builder, DataTypesProto.LanguageOrBuilder> singleFieldBuilderV4 = this.languageBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.languageBuilder_ = null;
                }
                this.numDays_ = 5;
                this.textSize_ = 2;
                this.attribSupported_ = false;
                return this;
            }

            public Builder clearAttribSupported() {
                this.bitField0_ &= -17;
                this.attribSupported_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLanguage() {
                this.bitField0_ &= -3;
                this.language_ = null;
                SingleFieldBuilderV3<DataTypesProto.Language, DataTypesProto.Language.Builder, DataTypesProto.LanguageOrBuilder> singleFieldBuilderV3 = this.languageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.languageBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearNumDays() {
                this.bitField0_ &= -5;
                this.numDays_ = 5;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPosition() {
                this.bitField0_ &= -2;
                this.position_ = null;
                SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.positionBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTextSize() {
                this.bitField0_ &= -9;
                this.textSize_ = 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsRequestOrBuilder
            public boolean getAttribSupported() {
                return this.attribSupported_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WeatherProto.internal_static_CSM_Proto_Weather_ConditionsRequest_descriptor;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsRequestOrBuilder
            public DataTypesProto.Language getLanguage() {
                SingleFieldBuilderV3<DataTypesProto.Language, DataTypesProto.Language.Builder, DataTypesProto.LanguageOrBuilder> singleFieldBuilderV3 = this.languageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypesProto.Language) singleFieldBuilderV3.getMessage();
                }
                DataTypesProto.Language language = this.language_;
                return language == null ? DataTypesProto.Language.getDefaultInstance() : language;
            }

            public DataTypesProto.Language.Builder getLanguageBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (DataTypesProto.Language.Builder) getLanguageFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsRequestOrBuilder
            public DataTypesProto.LanguageOrBuilder getLanguageOrBuilder() {
                SingleFieldBuilderV3<DataTypesProto.Language, DataTypesProto.Language.Builder, DataTypesProto.LanguageOrBuilder> singleFieldBuilderV3 = this.languageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypesProto.LanguageOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DataTypesProto.Language language = this.language_;
                return language == null ? DataTypesProto.Language.getDefaultInstance() : language;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsRequestOrBuilder
            public int getNumDays() {
                return this.numDays_;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsRequestOrBuilder
            public DataTypesProto.ScPoint getPosition() {
                SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypesProto.ScPoint) singleFieldBuilderV3.getMessage();
                }
                DataTypesProto.ScPoint scPoint = this.position_;
                return scPoint == null ? DataTypesProto.ScPoint.getDefaultInstance() : scPoint;
            }

            public DataTypesProto.ScPoint.Builder getPositionBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (DataTypesProto.ScPoint.Builder) getPositionFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsRequestOrBuilder
            public DataTypesProto.ScPointOrBuilder getPositionOrBuilder() {
                SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypesProto.ScPointOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DataTypesProto.ScPoint scPoint = this.position_;
                return scPoint == null ? DataTypesProto.ScPoint.getDefaultInstance() : scPoint;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsRequestOrBuilder
            public TextSize getTextSize() {
                TextSize textSizeForNumber = TextSize.forNumber(this.textSize_);
                return textSizeForNumber == null ? TextSize.MEDIUM : textSizeForNumber;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsRequestOrBuilder
            public boolean hasAttribSupported() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsRequestOrBuilder
            public boolean hasLanguage() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsRequestOrBuilder
            public boolean hasNumDays() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsRequestOrBuilder
            public boolean hasPosition() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ConditionsRequestOrBuilder
            public boolean hasTextSize() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WeatherProto.internal_static_CSM_Proto_Weather_ConditionsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConditionsRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasPosition() && getPosition().isInitialized()) {
                    return !hasLanguage() || getLanguage().isInitialized();
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
                                if (tag == 10) {
                                    codedInputStream.readMessage(getPositionFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getLanguageFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.numDays_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    int i14 = codedInputStream.readEnum();
                                    if (TextSize.forNumber(i14) == null) {
                                        mergeUnknownVarintField(4, i14);
                                    } else {
                                        this.textSize_ = i14;
                                        this.bitField0_ |= 8;
                                    }
                                } else if (tag == 40) {
                                    this.attribSupported_ = codedInputStream.readBool();
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

            public Builder mergeLanguage(DataTypesProto.Language language) {
                DataTypesProto.Language language2;
                SingleFieldBuilderV3<DataTypesProto.Language, DataTypesProto.Language.Builder, DataTypesProto.LanguageOrBuilder> singleFieldBuilderV3 = this.languageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(language);
                } else if ((this.bitField0_ & 2) == 0 || (language2 = this.language_) == null || language2 == DataTypesProto.Language.getDefaultInstance()) {
                    this.language_ = language;
                } else {
                    getLanguageBuilder().mergeFrom(language);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder mergePosition(DataTypesProto.ScPoint scPoint) {
                DataTypesProto.ScPoint scPoint2;
                SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(scPoint);
                } else if ((this.bitField0_ & 1) == 0 || (scPoint2 = this.position_) == null || scPoint2 == DataTypesProto.ScPoint.getDefaultInstance()) {
                    this.position_ = scPoint;
                } else {
                    getPositionBuilder().mergeFrom(scPoint);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setAttribSupported(boolean z14) {
                this.attribSupported_ = z14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setLanguage(DataTypesProto.Language.Builder builder) {
                SingleFieldBuilderV3<DataTypesProto.Language, DataTypesProto.Language.Builder, DataTypesProto.LanguageOrBuilder> singleFieldBuilderV3 = this.languageBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.language_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setNumDays(int i14) {
                this.numDays_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPosition(DataTypesProto.ScPoint.Builder builder) {
                SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.position_ = builder.build();
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

            public Builder setTextSize(TextSize textSize) {
                textSize.getClass();
                this.bitField0_ |= 8;
                this.textSize_ = textSize.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ConditionsRequest getDefaultInstanceForType() {
                return ConditionsRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.numDays_ = 5;
                this.textSize_ = 2;
                maybeForceBuilderInitialization();
            }

            public Builder setLanguage(DataTypesProto.Language language) {
                SingleFieldBuilderV3<DataTypesProto.Language, DataTypesProto.Language.Builder, DataTypesProto.LanguageOrBuilder> singleFieldBuilderV3 = this.languageBuilder_;
                if (singleFieldBuilderV3 == null) {
                    language.getClass();
                    this.language_ = language;
                } else {
                    singleFieldBuilderV3.setMessage(language);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setPosition(DataTypesProto.ScPoint scPoint) {
                SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    scPoint.getClass();
                    this.position_ = scPoint;
                } else {
                    singleFieldBuilderV3.setMessage(scPoint);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConditionsRequest) {
                    return mergeFrom((ConditionsRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConditionsRequest conditionsRequest) {
                if (conditionsRequest == ConditionsRequest.getDefaultInstance()) {
                    return this;
                }
                if (conditionsRequest.hasPosition()) {
                    mergePosition(conditionsRequest.getPosition());
                }
                if (conditionsRequest.hasLanguage()) {
                    mergeLanguage(conditionsRequest.getLanguage());
                }
                if (conditionsRequest.hasNumDays()) {
                    setNumDays(conditionsRequest.getNumDays());
                }
                if (conditionsRequest.hasTextSize()) {
                    setTextSize(conditionsRequest.getTextSize());
                }
                if (conditionsRequest.hasAttribSupported()) {
                    setAttribSupported(conditionsRequest.getAttribSupported());
                }
                mergeUnknownFields(conditionsRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConditionsRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConditionsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConditionsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConditionsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConditionsRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConditionsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConditionsRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConditionsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConditionsRequest parseFrom(InputStream inputStream) {
            return (ConditionsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ ConditionsRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ConditionsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConditionsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private ConditionsRequest() {
            this.attribSupported_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.numDays_ = 5;
            this.textSize_ = 2;
        }

        public static ConditionsRequest parseFrom(CodedInputStream codedInputStream) {
            return (ConditionsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConditionsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConditionsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DataProvider extends GeneratedMessageV3 implements DataProviderOrBuilder {
        public static final int DISPLAYTIME_FIELD_NUMBER = 2;
        public static final int PROVIDENAME_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int displayTime_;
        private byte memoizedIsInitialized;
        private volatile Object provideName_;
        private static final DataProvider DEFAULT_INSTANCE = new DataProvider();

        @Deprecated
        public static final Parser<DataProvider> PARSER = new AbstractParser<DataProvider>() { // from class: com.garmin.gcsprotos.generated.WeatherProto.DataProvider.1
            @Override // com.google.protobuf.Parser
            public DataProvider parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DataProvider.newBuilder();
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

        private DataProvider() {
            this.provideName_ = "";
            this.displayTime_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.provideName_ = "";
        }

        public static DataProvider getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WeatherProto.internal_static_CSM_Proto_Weather_DataProvider_descriptor;
        }

        public static Builder newBuilder(DataProvider dataProvider) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(dataProvider);
        }

        public static DataProvider parseDelimitedFrom(InputStream inputStream) {
            return (DataProvider) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DataProvider parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DataProvider> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DataProvider)) {
                return super.equals(obj);
            }
            DataProvider dataProvider = (DataProvider) obj;
            if (hasProvideName() != dataProvider.hasProvideName()) {
                return false;
            }
            if ((!hasProvideName() || getProvideName().equals(dataProvider.getProvideName())) && hasDisplayTime() == dataProvider.hasDisplayTime()) {
                return (!hasDisplayTime() || getDisplayTime() == dataProvider.getDisplayTime()) && getUnknownFields().equals(dataProvider.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.DataProviderOrBuilder
        public int getDisplayTime() {
            return this.displayTime_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DataProvider> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.DataProviderOrBuilder
        public String getProvideName() {
            Object obj = this.provideName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.provideName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.DataProviderOrBuilder
        public ByteString getProvideNameBytes() {
            Object obj = this.provideName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.provideName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.provideName_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(2, this.displayTime_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.DataProviderOrBuilder
        public boolean hasDisplayTime() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.DataProviderOrBuilder
        public boolean hasProvideName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasProvideName()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getProvideName().hashCode();
            }
            if (hasDisplayTime()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getDisplayTime();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WeatherProto.internal_static_CSM_Proto_Weather_DataProvider_fieldAccessorTable.ensureFieldAccessorsInitialized(DataProvider.class, Builder.class);
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
            return new DataProvider();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.provideName_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.displayTime_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DataProviderOrBuilder {
            private int bitField0_;
            private int displayTime_;
            private Object provideName_;

            private Builder() {
                this.provideName_ = "";
            }

            private void buildPartial0(DataProvider dataProvider) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    dataProvider.provideName_ = this.provideName_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    dataProvider.displayTime_ = this.displayTime_;
                    i14 |= 2;
                }
                dataProvider.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WeatherProto.internal_static_CSM_Proto_Weather_DataProvider_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DataProvider build() {
                DataProvider dataProviderBuildPartial = buildPartial();
                if (dataProviderBuildPartial.isInitialized()) {
                    return dataProviderBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dataProviderBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DataProvider buildPartial() {
                DataProvider dataProvider = new DataProvider(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(dataProvider);
                }
                onBuilt();
                return dataProvider;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.provideName_ = "";
                this.displayTime_ = 0;
                return this;
            }

            public Builder clearDisplayTime() {
                this.bitField0_ &= -3;
                this.displayTime_ = 0;
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

            public Builder clearProvideName() {
                this.provideName_ = DataProvider.getDefaultInstance().getProvideName();
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
                return WeatherProto.internal_static_CSM_Proto_Weather_DataProvider_descriptor;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.DataProviderOrBuilder
            public int getDisplayTime() {
                return this.displayTime_;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.DataProviderOrBuilder
            public String getProvideName() {
                Object obj = this.provideName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.provideName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.DataProviderOrBuilder
            public ByteString getProvideNameBytes() {
                Object obj = this.provideName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.provideName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.DataProviderOrBuilder
            public boolean hasDisplayTime() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.DataProviderOrBuilder
            public boolean hasProvideName() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WeatherProto.internal_static_CSM_Proto_Weather_DataProvider_fieldAccessorTable.ensureFieldAccessorsInitialized(DataProvider.class, Builder.class);
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
                                    this.provideName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.displayTime_ = codedInputStream.readUInt32();
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

            public Builder setDisplayTime(int i14) {
                this.displayTime_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setProvideName(String str) {
                str.getClass();
                this.provideName_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setProvideNameBytes(ByteString byteString) {
                byteString.getClass();
                this.provideName_ = byteString;
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
            public DataProvider getDefaultInstanceForType() {
                return DataProvider.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.provideName_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DataProvider) {
                    return mergeFrom((DataProvider) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DataProvider dataProvider) {
                if (dataProvider == DataProvider.getDefaultInstance()) {
                    return this;
                }
                if (dataProvider.hasProvideName()) {
                    this.provideName_ = dataProvider.provideName_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (dataProvider.hasDisplayTime()) {
                    setDisplayTime(dataProvider.getDisplayTime());
                }
                mergeUnknownFields(dataProvider.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DataProvider getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DataProvider parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataProvider) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DataProvider parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DataProvider parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DataProvider parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DataProvider parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DataProvider parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DataProvider parseFrom(InputStream inputStream) {
            return (DataProvider) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private DataProvider(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.provideName_ = "";
            this.displayTime_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DataProvider parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataProvider) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DataProvider parseFrom(CodedInputStream codedInputStream) {
            return (DataProvider) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public /* synthetic */ DataProvider(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DataProvider parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataProvider) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class HourlyForecastRequest extends GeneratedMessageV3 implements HourlyForecastRequestOrBuilder {
        public static final int ATTRIB_SUPPORTED_FIELD_NUMBER = 6;
        public static final int LANGUAGE_FIELD_NUMBER = 2;
        public static final int NUM_HOURS_FIELD_NUMBER = 3;
        public static final int POSITION_FIELD_NUMBER = 1;
        public static final int TEXT_SIZE_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        private boolean attribSupported_;
        private int bitField0_;
        private DataTypesProto.Language language_;
        private byte memoizedIsInitialized;
        private int numHours_;
        private DataTypesProto.ScPoint position_;
        private int textSize_;
        private static final HourlyForecastRequest DEFAULT_INSTANCE = new HourlyForecastRequest();

        @Deprecated
        public static final Parser<HourlyForecastRequest> PARSER = new AbstractParser<HourlyForecastRequest>() { // from class: com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastRequest.1
            @Override // com.google.protobuf.Parser
            public HourlyForecastRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = HourlyForecastRequest.newBuilder();
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

        private HourlyForecastRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.numHours_ = 8;
            this.textSize_ = 3;
            this.attribSupported_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static HourlyForecastRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WeatherProto.internal_static_CSM_Proto_Weather_HourlyForecastRequest_descriptor;
        }

        public static Builder newBuilder(HourlyForecastRequest hourlyForecastRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(hourlyForecastRequest);
        }

        public static HourlyForecastRequest parseDelimitedFrom(InputStream inputStream) {
            return (HourlyForecastRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static HourlyForecastRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<HourlyForecastRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HourlyForecastRequest)) {
                return super.equals(obj);
            }
            HourlyForecastRequest hourlyForecastRequest = (HourlyForecastRequest) obj;
            if (hasPosition() != hourlyForecastRequest.hasPosition()) {
                return false;
            }
            if ((hasPosition() && !getPosition().equals(hourlyForecastRequest.getPosition())) || hasLanguage() != hourlyForecastRequest.hasLanguage()) {
                return false;
            }
            if ((hasLanguage() && !getLanguage().equals(hourlyForecastRequest.getLanguage())) || hasNumHours() != hourlyForecastRequest.hasNumHours()) {
                return false;
            }
            if ((hasNumHours() && getNumHours() != hourlyForecastRequest.getNumHours()) || hasTextSize() != hourlyForecastRequest.hasTextSize()) {
                return false;
            }
            if ((!hasTextSize() || this.textSize_ == hourlyForecastRequest.textSize_) && hasAttribSupported() == hourlyForecastRequest.hasAttribSupported()) {
                return (!hasAttribSupported() || getAttribSupported() == hourlyForecastRequest.getAttribSupported()) && getUnknownFields().equals(hourlyForecastRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastRequestOrBuilder
        public boolean getAttribSupported() {
            return this.attribSupported_;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastRequestOrBuilder
        public DataTypesProto.Language getLanguage() {
            DataTypesProto.Language language = this.language_;
            return language == null ? DataTypesProto.Language.getDefaultInstance() : language;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastRequestOrBuilder
        public DataTypesProto.LanguageOrBuilder getLanguageOrBuilder() {
            DataTypesProto.Language language = this.language_;
            return language == null ? DataTypesProto.Language.getDefaultInstance() : language;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastRequestOrBuilder
        public int getNumHours() {
            return this.numHours_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<HourlyForecastRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastRequestOrBuilder
        public DataTypesProto.ScPoint getPosition() {
            DataTypesProto.ScPoint scPoint = this.position_;
            return scPoint == null ? DataTypesProto.ScPoint.getDefaultInstance() : scPoint;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastRequestOrBuilder
        public DataTypesProto.ScPointOrBuilder getPositionOrBuilder() {
            DataTypesProto.ScPoint scPoint = this.position_;
            return scPoint == null ? DataTypesProto.ScPoint.getDefaultInstance() : scPoint;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getPosition()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getLanguage());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeUInt32Size(3, this.numHours_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(5, this.textSize_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeBoolSize(6, this.attribSupported_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastRequestOrBuilder
        public TextSize getTextSize() {
            TextSize textSizeForNumber = TextSize.forNumber(this.textSize_);
            return textSizeForNumber == null ? TextSize.FULL : textSizeForNumber;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastRequestOrBuilder
        public boolean hasAttribSupported() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastRequestOrBuilder
        public boolean hasLanguage() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastRequestOrBuilder
        public boolean hasNumHours() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastRequestOrBuilder
        public boolean hasPosition() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastRequestOrBuilder
        public boolean hasTextSize() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasPosition()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getPosition().hashCode();
            }
            if (hasLanguage()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getLanguage().hashCode();
            }
            if (hasNumHours()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getNumHours();
            }
            if (hasTextSize()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + this.textSize_;
            }
            if (hasAttribSupported()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + Internal.hashBoolean(getAttribSupported());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WeatherProto.internal_static_CSM_Proto_Weather_HourlyForecastRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(HourlyForecastRequest.class, Builder.class);
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
            if (!hasPosition()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!getPosition().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasLanguage() || getLanguage().isInitialized()) {
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
            return new HourlyForecastRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getPosition());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getLanguage());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.numHours_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeEnum(5, this.textSize_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeBool(6, this.attribSupported_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HourlyForecastRequestOrBuilder {
            private boolean attribSupported_;
            private int bitField0_;
            private SingleFieldBuilderV3<DataTypesProto.Language, DataTypesProto.Language.Builder, DataTypesProto.LanguageOrBuilder> languageBuilder_;
            private DataTypesProto.Language language_;
            private int numHours_;
            private SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> positionBuilder_;
            private DataTypesProto.ScPoint position_;
            private int textSize_;

            private Builder() {
                this.numHours_ = 8;
                this.textSize_ = 3;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(HourlyForecastRequest hourlyForecastRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                    hourlyForecastRequest.position_ = singleFieldBuilderV3 == null ? this.position_ : (DataTypesProto.ScPoint) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<DataTypesProto.Language, DataTypesProto.Language.Builder, DataTypesProto.LanguageOrBuilder> singleFieldBuilderV4 = this.languageBuilder_;
                    hourlyForecastRequest.language_ = singleFieldBuilderV4 == null ? this.language_ : (DataTypesProto.Language) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    hourlyForecastRequest.numHours_ = this.numHours_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    hourlyForecastRequest.textSize_ = this.textSize_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    hourlyForecastRequest.attribSupported_ = this.attribSupported_;
                    i14 |= 16;
                }
                hourlyForecastRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WeatherProto.internal_static_CSM_Proto_Weather_HourlyForecastRequest_descriptor;
            }

            private SingleFieldBuilderV3<DataTypesProto.Language, DataTypesProto.Language.Builder, DataTypesProto.LanguageOrBuilder> getLanguageFieldBuilder() {
                if (this.languageBuilder_ == null) {
                    this.languageBuilder_ = new SingleFieldBuilderV3<>(getLanguage(), getParentForChildren(), isClean());
                    this.language_ = null;
                }
                return this.languageBuilder_;
            }

            private SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> getPositionFieldBuilder() {
                if (this.positionBuilder_ == null) {
                    this.positionBuilder_ = new SingleFieldBuilderV3<>(getPosition(), getParentForChildren(), isClean());
                    this.position_ = null;
                }
                return this.positionBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getPositionFieldBuilder();
                    getLanguageFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HourlyForecastRequest build() {
                HourlyForecastRequest hourlyForecastRequestBuildPartial = buildPartial();
                if (hourlyForecastRequestBuildPartial.isInitialized()) {
                    return hourlyForecastRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) hourlyForecastRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HourlyForecastRequest buildPartial() {
                HourlyForecastRequest hourlyForecastRequest = new HourlyForecastRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(hourlyForecastRequest);
                }
                onBuilt();
                return hourlyForecastRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.position_ = null;
                SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.positionBuilder_ = null;
                }
                this.language_ = null;
                SingleFieldBuilderV3<DataTypesProto.Language, DataTypesProto.Language.Builder, DataTypesProto.LanguageOrBuilder> singleFieldBuilderV4 = this.languageBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.languageBuilder_ = null;
                }
                this.numHours_ = 8;
                this.textSize_ = 3;
                this.attribSupported_ = false;
                return this;
            }

            public Builder clearAttribSupported() {
                this.bitField0_ &= -17;
                this.attribSupported_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLanguage() {
                this.bitField0_ &= -3;
                this.language_ = null;
                SingleFieldBuilderV3<DataTypesProto.Language, DataTypesProto.Language.Builder, DataTypesProto.LanguageOrBuilder> singleFieldBuilderV3 = this.languageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.languageBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearNumHours() {
                this.bitField0_ &= -5;
                this.numHours_ = 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPosition() {
                this.bitField0_ &= -2;
                this.position_ = null;
                SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.positionBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTextSize() {
                this.bitField0_ &= -9;
                this.textSize_ = 3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastRequestOrBuilder
            public boolean getAttribSupported() {
                return this.attribSupported_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WeatherProto.internal_static_CSM_Proto_Weather_HourlyForecastRequest_descriptor;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastRequestOrBuilder
            public DataTypesProto.Language getLanguage() {
                SingleFieldBuilderV3<DataTypesProto.Language, DataTypesProto.Language.Builder, DataTypesProto.LanguageOrBuilder> singleFieldBuilderV3 = this.languageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypesProto.Language) singleFieldBuilderV3.getMessage();
                }
                DataTypesProto.Language language = this.language_;
                return language == null ? DataTypesProto.Language.getDefaultInstance() : language;
            }

            public DataTypesProto.Language.Builder getLanguageBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (DataTypesProto.Language.Builder) getLanguageFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastRequestOrBuilder
            public DataTypesProto.LanguageOrBuilder getLanguageOrBuilder() {
                SingleFieldBuilderV3<DataTypesProto.Language, DataTypesProto.Language.Builder, DataTypesProto.LanguageOrBuilder> singleFieldBuilderV3 = this.languageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypesProto.LanguageOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DataTypesProto.Language language = this.language_;
                return language == null ? DataTypesProto.Language.getDefaultInstance() : language;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastRequestOrBuilder
            public int getNumHours() {
                return this.numHours_;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastRequestOrBuilder
            public DataTypesProto.ScPoint getPosition() {
                SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypesProto.ScPoint) singleFieldBuilderV3.getMessage();
                }
                DataTypesProto.ScPoint scPoint = this.position_;
                return scPoint == null ? DataTypesProto.ScPoint.getDefaultInstance() : scPoint;
            }

            public DataTypesProto.ScPoint.Builder getPositionBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (DataTypesProto.ScPoint.Builder) getPositionFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastRequestOrBuilder
            public DataTypesProto.ScPointOrBuilder getPositionOrBuilder() {
                SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypesProto.ScPointOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DataTypesProto.ScPoint scPoint = this.position_;
                return scPoint == null ? DataTypesProto.ScPoint.getDefaultInstance() : scPoint;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastRequestOrBuilder
            public TextSize getTextSize() {
                TextSize textSizeForNumber = TextSize.forNumber(this.textSize_);
                return textSizeForNumber == null ? TextSize.FULL : textSizeForNumber;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastRequestOrBuilder
            public boolean hasAttribSupported() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastRequestOrBuilder
            public boolean hasLanguage() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastRequestOrBuilder
            public boolean hasNumHours() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastRequestOrBuilder
            public boolean hasPosition() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.HourlyForecastRequestOrBuilder
            public boolean hasTextSize() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WeatherProto.internal_static_CSM_Proto_Weather_HourlyForecastRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(HourlyForecastRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasPosition() && getPosition().isInitialized()) {
                    return !hasLanguage() || getLanguage().isInitialized();
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
                                if (tag == 10) {
                                    codedInputStream.readMessage(getPositionFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getLanguageFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.numHours_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 40) {
                                    int i14 = codedInputStream.readEnum();
                                    if (TextSize.forNumber(i14) == null) {
                                        mergeUnknownVarintField(5, i14);
                                    } else {
                                        this.textSize_ = i14;
                                        this.bitField0_ |= 8;
                                    }
                                } else if (tag == 48) {
                                    this.attribSupported_ = codedInputStream.readBool();
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

            public Builder mergeLanguage(DataTypesProto.Language language) {
                DataTypesProto.Language language2;
                SingleFieldBuilderV3<DataTypesProto.Language, DataTypesProto.Language.Builder, DataTypesProto.LanguageOrBuilder> singleFieldBuilderV3 = this.languageBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(language);
                } else if ((this.bitField0_ & 2) == 0 || (language2 = this.language_) == null || language2 == DataTypesProto.Language.getDefaultInstance()) {
                    this.language_ = language;
                } else {
                    getLanguageBuilder().mergeFrom(language);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder mergePosition(DataTypesProto.ScPoint scPoint) {
                DataTypesProto.ScPoint scPoint2;
                SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(scPoint);
                } else if ((this.bitField0_ & 1) == 0 || (scPoint2 = this.position_) == null || scPoint2 == DataTypesProto.ScPoint.getDefaultInstance()) {
                    this.position_ = scPoint;
                } else {
                    getPositionBuilder().mergeFrom(scPoint);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setAttribSupported(boolean z14) {
                this.attribSupported_ = z14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setLanguage(DataTypesProto.Language.Builder builder) {
                SingleFieldBuilderV3<DataTypesProto.Language, DataTypesProto.Language.Builder, DataTypesProto.LanguageOrBuilder> singleFieldBuilderV3 = this.languageBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.language_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setNumHours(int i14) {
                this.numHours_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPosition(DataTypesProto.ScPoint.Builder builder) {
                SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.position_ = builder.build();
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

            public Builder setTextSize(TextSize textSize) {
                textSize.getClass();
                this.bitField0_ |= 8;
                this.textSize_ = textSize.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public HourlyForecastRequest getDefaultInstanceForType() {
                return HourlyForecastRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.numHours_ = 8;
                this.textSize_ = 3;
                maybeForceBuilderInitialization();
            }

            public Builder setLanguage(DataTypesProto.Language language) {
                SingleFieldBuilderV3<DataTypesProto.Language, DataTypesProto.Language.Builder, DataTypesProto.LanguageOrBuilder> singleFieldBuilderV3 = this.languageBuilder_;
                if (singleFieldBuilderV3 == null) {
                    language.getClass();
                    this.language_ = language;
                } else {
                    singleFieldBuilderV3.setMessage(language);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setPosition(DataTypesProto.ScPoint scPoint) {
                SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    scPoint.getClass();
                    this.position_ = scPoint;
                } else {
                    singleFieldBuilderV3.setMessage(scPoint);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof HourlyForecastRequest) {
                    return mergeFrom((HourlyForecastRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(HourlyForecastRequest hourlyForecastRequest) {
                if (hourlyForecastRequest == HourlyForecastRequest.getDefaultInstance()) {
                    return this;
                }
                if (hourlyForecastRequest.hasPosition()) {
                    mergePosition(hourlyForecastRequest.getPosition());
                }
                if (hourlyForecastRequest.hasLanguage()) {
                    mergeLanguage(hourlyForecastRequest.getLanguage());
                }
                if (hourlyForecastRequest.hasNumHours()) {
                    setNumHours(hourlyForecastRequest.getNumHours());
                }
                if (hourlyForecastRequest.hasTextSize()) {
                    setTextSize(hourlyForecastRequest.getTextSize());
                }
                if (hourlyForecastRequest.hasAttribSupported()) {
                    setAttribSupported(hourlyForecastRequest.getAttribSupported());
                }
                mergeUnknownFields(hourlyForecastRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public HourlyForecastRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static HourlyForecastRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HourlyForecastRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HourlyForecastRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static HourlyForecastRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static HourlyForecastRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static HourlyForecastRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static HourlyForecastRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static HourlyForecastRequest parseFrom(InputStream inputStream) {
            return (HourlyForecastRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static HourlyForecastRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HourlyForecastRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ HourlyForecastRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private HourlyForecastRequest() {
            this.attribSupported_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.numHours_ = 8;
            this.textSize_ = 3;
        }

        public static HourlyForecastRequest parseFrom(CodedInputStream codedInputStream) {
            return (HourlyForecastRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static HourlyForecastRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HourlyForecastRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ObservedLocation extends GeneratedMessageV3 implements ObservedLocationOrBuilder {
        public static final int LOCATION_NAME_FIELD_NUMBER = 1;
        public static final int POSITION_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object locationName_;
        private byte memoizedIsInitialized;
        private DataTypesProto.ScPoint position_;
        private static final ObservedLocation DEFAULT_INSTANCE = new ObservedLocation();

        @Deprecated
        public static final Parser<ObservedLocation> PARSER = new AbstractParser<ObservedLocation>() { // from class: com.garmin.gcsprotos.generated.WeatherProto.ObservedLocation.1
            @Override // com.google.protobuf.Parser
            public ObservedLocation parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ObservedLocation.newBuilder();
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

        private ObservedLocation() {
            this.locationName_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.locationName_ = "";
        }

        public static ObservedLocation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WeatherProto.internal_static_CSM_Proto_Weather_ObservedLocation_descriptor;
        }

        public static Builder newBuilder(ObservedLocation observedLocation) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(observedLocation);
        }

        public static ObservedLocation parseDelimitedFrom(InputStream inputStream) {
            return (ObservedLocation) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ObservedLocation parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ObservedLocation> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ObservedLocation)) {
                return super.equals(obj);
            }
            ObservedLocation observedLocation = (ObservedLocation) obj;
            if (hasLocationName() != observedLocation.hasLocationName()) {
                return false;
            }
            if ((!hasLocationName() || getLocationName().equals(observedLocation.getLocationName())) && hasPosition() == observedLocation.hasPosition()) {
                return (!hasPosition() || getPosition().equals(observedLocation.getPosition())) && getUnknownFields().equals(observedLocation.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.ObservedLocationOrBuilder
        public String getLocationName() {
            Object obj = this.locationName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.locationName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.ObservedLocationOrBuilder
        public ByteString getLocationNameBytes() {
            Object obj = this.locationName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.locationName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ObservedLocation> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.ObservedLocationOrBuilder
        public DataTypesProto.ScPoint getPosition() {
            DataTypesProto.ScPoint scPoint = this.position_;
            return scPoint == null ? DataTypesProto.ScPoint.getDefaultInstance() : scPoint;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.ObservedLocationOrBuilder
        public DataTypesProto.ScPointOrBuilder getPositionOrBuilder() {
            DataTypesProto.ScPoint scPoint = this.position_;
            return scPoint == null ? DataTypesProto.ScPoint.getDefaultInstance() : scPoint;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.locationName_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(2, getPosition());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.ObservedLocationOrBuilder
        public boolean hasLocationName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.ObservedLocationOrBuilder
        public boolean hasPosition() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasLocationName()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getLocationName().hashCode();
            }
            if (hasPosition()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getPosition().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WeatherProto.internal_static_CSM_Proto_Weather_ObservedLocation_fieldAccessorTable.ensureFieldAccessorsInitialized(ObservedLocation.class, Builder.class);
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
            if (!hasPosition() || getPosition().isInitialized()) {
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
            return new ObservedLocation();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.locationName_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getPosition());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ObservedLocationOrBuilder {
            private int bitField0_;
            private Object locationName_;
            private SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> positionBuilder_;
            private DataTypesProto.ScPoint position_;

            private Builder() {
                this.locationName_ = "";
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ObservedLocation observedLocation) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    observedLocation.locationName_ = this.locationName_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                    observedLocation.position_ = singleFieldBuilderV3 == null ? this.position_ : (DataTypesProto.ScPoint) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                observedLocation.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WeatherProto.internal_static_CSM_Proto_Weather_ObservedLocation_descriptor;
            }

            private SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> getPositionFieldBuilder() {
                if (this.positionBuilder_ == null) {
                    this.positionBuilder_ = new SingleFieldBuilderV3<>(getPosition(), getParentForChildren(), isClean());
                    this.position_ = null;
                }
                return this.positionBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getPositionFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ObservedLocation build() {
                ObservedLocation observedLocationBuildPartial = buildPartial();
                if (observedLocationBuildPartial.isInitialized()) {
                    return observedLocationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) observedLocationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ObservedLocation buildPartial() {
                ObservedLocation observedLocation = new ObservedLocation(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(observedLocation);
                }
                onBuilt();
                return observedLocation;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.locationName_ = "";
                this.position_ = null;
                SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.positionBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLocationName() {
                this.locationName_ = ObservedLocation.getDefaultInstance().getLocationName();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPosition() {
                this.bitField0_ &= -3;
                this.position_ = null;
                SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.positionBuilder_ = null;
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
                return WeatherProto.internal_static_CSM_Proto_Weather_ObservedLocation_descriptor;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ObservedLocationOrBuilder
            public String getLocationName() {
                Object obj = this.locationName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.locationName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ObservedLocationOrBuilder
            public ByteString getLocationNameBytes() {
                Object obj = this.locationName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.locationName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ObservedLocationOrBuilder
            public DataTypesProto.ScPoint getPosition() {
                SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypesProto.ScPoint) singleFieldBuilderV3.getMessage();
                }
                DataTypesProto.ScPoint scPoint = this.position_;
                return scPoint == null ? DataTypesProto.ScPoint.getDefaultInstance() : scPoint;
            }

            public DataTypesProto.ScPoint.Builder getPositionBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (DataTypesProto.ScPoint.Builder) getPositionFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ObservedLocationOrBuilder
            public DataTypesProto.ScPointOrBuilder getPositionOrBuilder() {
                SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypesProto.ScPointOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DataTypesProto.ScPoint scPoint = this.position_;
                return scPoint == null ? DataTypesProto.ScPoint.getDefaultInstance() : scPoint;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ObservedLocationOrBuilder
            public boolean hasLocationName() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.ObservedLocationOrBuilder
            public boolean hasPosition() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WeatherProto.internal_static_CSM_Proto_Weather_ObservedLocation_fieldAccessorTable.ensureFieldAccessorsInitialized(ObservedLocation.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasPosition() || getPosition().isInitialized();
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
                                    this.locationName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getPositionFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergePosition(DataTypesProto.ScPoint scPoint) {
                DataTypesProto.ScPoint scPoint2;
                SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(scPoint);
                } else if ((this.bitField0_ & 2) == 0 || (scPoint2 = this.position_) == null || scPoint2 == DataTypesProto.ScPoint.getDefaultInstance()) {
                    this.position_ = scPoint;
                } else {
                    getPositionBuilder().mergeFrom(scPoint);
                }
                this.bitField0_ |= 2;
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

            public Builder setLocationName(String str) {
                str.getClass();
                this.locationName_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setLocationNameBytes(ByteString byteString) {
                byteString.getClass();
                this.locationName_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setPosition(DataTypesProto.ScPoint.Builder builder) {
                SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.position_ = builder.build();
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

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ObservedLocation getDefaultInstanceForType() {
                return ObservedLocation.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.locationName_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder setPosition(DataTypesProto.ScPoint scPoint) {
                SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    scPoint.getClass();
                    this.position_ = scPoint;
                } else {
                    singleFieldBuilderV3.setMessage(scPoint);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ObservedLocation) {
                    return mergeFrom((ObservedLocation) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ObservedLocation observedLocation) {
                if (observedLocation == ObservedLocation.getDefaultInstance()) {
                    return this;
                }
                if (observedLocation.hasLocationName()) {
                    this.locationName_ = observedLocation.locationName_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (observedLocation.hasPosition()) {
                    mergePosition(observedLocation.getPosition());
                }
                mergeUnknownFields(observedLocation.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ObservedLocation getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ObservedLocation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ObservedLocation) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ObservedLocation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ObservedLocation parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ObservedLocation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ObservedLocation parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private ObservedLocation(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.locationName_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ObservedLocation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ObservedLocation parseFrom(InputStream inputStream) {
            return (ObservedLocation) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ ObservedLocation(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ObservedLocation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ObservedLocation) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ObservedLocation parseFrom(CodedInputStream codedInputStream) {
            return (ObservedLocation) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ObservedLocation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ObservedLocation) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SizedText extends GeneratedMessageV3 implements SizedTextOrBuilder {
        private static final SizedText DEFAULT_INSTANCE = new SizedText();

        @Deprecated
        public static final Parser<SizedText> PARSER = new AbstractParser<SizedText>() { // from class: com.garmin.gcsprotos.generated.WeatherProto.SizedText.1
            @Override // com.google.protobuf.Parser
            public SizedText parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SizedText.newBuilder();
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
        public static final int TEXT_FIELD_NUMBER = 2;
        public static final int TEXT_SIZE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int textSize_;
        private volatile Object text_;

        private SizedText() {
            this.textSize_ = 0;
            this.text_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.textSize_ = 0;
            this.text_ = "";
        }

        public static SizedText getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WeatherProto.internal_static_CSM_Proto_Weather_SizedText_descriptor;
        }

        public static Builder newBuilder(SizedText sizedText) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sizedText);
        }

        public static SizedText parseDelimitedFrom(InputStream inputStream) {
            return (SizedText) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SizedText parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SizedText> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SizedText)) {
                return super.equals(obj);
            }
            SizedText sizedText = (SizedText) obj;
            if (hasTextSize() != sizedText.hasTextSize()) {
                return false;
            }
            if ((!hasTextSize() || this.textSize_ == sizedText.textSize_) && hasText() == sizedText.hasText()) {
                return (!hasText() || getText().equals(sizedText.getText())) && getUnknownFields().equals(sizedText.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SizedText> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.textSize_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += GeneratedMessageV3.computeStringSize(2, this.text_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.SizedTextOrBuilder
        public String getText() {
            Object obj = this.text_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.text_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.SizedTextOrBuilder
        public ByteString getTextBytes() {
            Object obj = this.text_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.text_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.SizedTextOrBuilder
        public TextSize getTextSize() {
            TextSize textSizeForNumber = TextSize.forNumber(this.textSize_);
            return textSizeForNumber == null ? TextSize.ALL_SIZES : textSizeForNumber;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.SizedTextOrBuilder
        public boolean hasText() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.SizedTextOrBuilder
        public boolean hasTextSize() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasTextSize()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.textSize_;
            }
            if (hasText()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getText().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WeatherProto.internal_static_CSM_Proto_Weather_SizedText_fieldAccessorTable.ensureFieldAccessorsInitialized(SizedText.class, Builder.class);
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
            if (!hasTextSize()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasText()) {
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
            return new SizedText();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.textSize_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.text_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SizedTextOrBuilder {
            private int bitField0_;
            private int textSize_;
            private Object text_;

            private Builder() {
                this.textSize_ = 0;
                this.text_ = "";
            }

            private void buildPartial0(SizedText sizedText) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    sizedText.textSize_ = this.textSize_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    sizedText.text_ = this.text_;
                    i14 |= 2;
                }
                sizedText.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WeatherProto.internal_static_CSM_Proto_Weather_SizedText_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SizedText build() {
                SizedText sizedTextBuildPartial = buildPartial();
                if (sizedTextBuildPartial.isInitialized()) {
                    return sizedTextBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sizedTextBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SizedText buildPartial() {
                SizedText sizedText = new SizedText(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sizedText);
                }
                onBuilt();
                return sizedText;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.textSize_ = 0;
                this.text_ = "";
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

            public Builder clearText() {
                this.text_ = SizedText.getDefaultInstance().getText();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearTextSize() {
                this.bitField0_ &= -2;
                this.textSize_ = 0;
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
                return WeatherProto.internal_static_CSM_Proto_Weather_SizedText_descriptor;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.SizedTextOrBuilder
            public String getText() {
                Object obj = this.text_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.text_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.SizedTextOrBuilder
            public ByteString getTextBytes() {
                Object obj = this.text_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.text_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.SizedTextOrBuilder
            public TextSize getTextSize() {
                TextSize textSizeForNumber = TextSize.forNumber(this.textSize_);
                return textSizeForNumber == null ? TextSize.ALL_SIZES : textSizeForNumber;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.SizedTextOrBuilder
            public boolean hasText() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.SizedTextOrBuilder
            public boolean hasTextSize() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WeatherProto.internal_static_CSM_Proto_Weather_SizedText_fieldAccessorTable.ensureFieldAccessorsInitialized(SizedText.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasTextSize() && hasText();
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
                                    if (TextSize.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.textSize_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    this.text_ = codedInputStream.readBytes();
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

            public Builder setText(String str) {
                str.getClass();
                this.text_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTextBytes(ByteString byteString) {
                byteString.getClass();
                this.text_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTextSize(TextSize textSize) {
                textSize.getClass();
                this.bitField0_ |= 1;
                this.textSize_ = textSize.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SizedText getDefaultInstanceForType() {
                return SizedText.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.textSize_ = 0;
                this.text_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SizedText) {
                    return mergeFrom((SizedText) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SizedText sizedText) {
                if (sizedText == SizedText.getDefaultInstance()) {
                    return this;
                }
                if (sizedText.hasTextSize()) {
                    setTextSize(sizedText.getTextSize());
                }
                if (sizedText.hasText()) {
                    this.text_ = sizedText.text_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                mergeUnknownFields(sizedText.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SizedText getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SizedText parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SizedText) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SizedText parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SizedText parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SizedText parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SizedText parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SizedText parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SizedText parseFrom(InputStream inputStream) {
            return (SizedText) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SizedText parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SizedText) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private SizedText(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.textSize_ = 0;
            this.text_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SizedText parseFrom(CodedInputStream codedInputStream) {
            return (SizedText) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SizedText parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SizedText) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ SizedText(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class WeatherRequest extends GeneratedMessageV3 implements WeatherRequestOrBuilder {
        public static final int ALERTS_FIELD_NUMBER = 12;
        public static final int CONDITIONS_FIELD_NUMBER = 11;
        public static final int HOURLY_FORECAST_FIELD_NUMBER = 16;
        private static final long serialVersionUID = 0;
        private AlertsRequest alerts_;
        private int bitField0_;
        private ConditionsRequest conditions_;
        private HourlyForecastRequest hourlyForecast_;
        private byte memoizedIsInitialized;
        private static final WeatherRequest DEFAULT_INSTANCE = new WeatherRequest();

        @Deprecated
        public static final Parser<WeatherRequest> PARSER = new AbstractParser<WeatherRequest>() { // from class: com.garmin.gcsprotos.generated.WeatherProto.WeatherRequest.1
            @Override // com.google.protobuf.Parser
            public WeatherRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = WeatherRequest.newBuilder();
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

        private WeatherRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WeatherRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WeatherProto.internal_static_CSM_Proto_Weather_WeatherRequest_descriptor;
        }

        public static Builder newBuilder(WeatherRequest weatherRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(weatherRequest);
        }

        public static WeatherRequest parseDelimitedFrom(InputStream inputStream) {
            return (WeatherRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static WeatherRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<WeatherRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WeatherRequest)) {
                return super.equals(obj);
            }
            WeatherRequest weatherRequest = (WeatherRequest) obj;
            if (hasConditions() != weatherRequest.hasConditions()) {
                return false;
            }
            if ((hasConditions() && !getConditions().equals(weatherRequest.getConditions())) || hasAlerts() != weatherRequest.hasAlerts()) {
                return false;
            }
            if ((!hasAlerts() || getAlerts().equals(weatherRequest.getAlerts())) && hasHourlyForecast() == weatherRequest.hasHourlyForecast()) {
                return (!hasHourlyForecast() || getHourlyForecast().equals(weatherRequest.getHourlyForecast())) && getUnknownFields().equals(weatherRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherRequestOrBuilder
        public AlertsRequest getAlerts() {
            AlertsRequest alertsRequest = this.alerts_;
            return alertsRequest == null ? AlertsRequest.getDefaultInstance() : alertsRequest;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherRequestOrBuilder
        public AlertsRequestOrBuilder getAlertsOrBuilder() {
            AlertsRequest alertsRequest = this.alerts_;
            return alertsRequest == null ? AlertsRequest.getDefaultInstance() : alertsRequest;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherRequestOrBuilder
        public ConditionsRequest getConditions() {
            ConditionsRequest conditionsRequest = this.conditions_;
            return conditionsRequest == null ? ConditionsRequest.getDefaultInstance() : conditionsRequest;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherRequestOrBuilder
        public ConditionsRequestOrBuilder getConditionsOrBuilder() {
            ConditionsRequest conditionsRequest = this.conditions_;
            return conditionsRequest == null ? ConditionsRequest.getDefaultInstance() : conditionsRequest;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherRequestOrBuilder
        public HourlyForecastRequest getHourlyForecast() {
            HourlyForecastRequest hourlyForecastRequest = this.hourlyForecast_;
            return hourlyForecastRequest == null ? HourlyForecastRequest.getDefaultInstance() : hourlyForecastRequest;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherRequestOrBuilder
        public HourlyForecastRequestOrBuilder getHourlyForecastOrBuilder() {
            HourlyForecastRequest hourlyForecastRequest = this.hourlyForecast_;
            return hourlyForecastRequest == null ? HourlyForecastRequest.getDefaultInstance() : hourlyForecastRequest;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<WeatherRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(11, getConditions()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(12, getAlerts());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(16, getHourlyForecast());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherRequestOrBuilder
        public boolean hasAlerts() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherRequestOrBuilder
        public boolean hasConditions() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherRequestOrBuilder
        public boolean hasHourlyForecast() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasConditions()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getConditions().hashCode();
            }
            if (hasAlerts()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + getAlerts().hashCode();
            }
            if (hasHourlyForecast()) {
                iHashCode = e5.c(iHashCode, 37, 16, 53) + getHourlyForecast().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WeatherProto.internal_static_CSM_Proto_Weather_WeatherRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(WeatherRequest.class, Builder.class);
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
            if (hasConditions() && !getConditions().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasAlerts() && !getAlerts().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasHourlyForecast() || getHourlyForecast().isInitialized()) {
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
            return new WeatherRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(11, getConditions());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(12, getAlerts());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(16, getHourlyForecast());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WeatherRequestOrBuilder {
            private SingleFieldBuilderV3<AlertsRequest, AlertsRequest.Builder, AlertsRequestOrBuilder> alertsBuilder_;
            private AlertsRequest alerts_;
            private int bitField0_;
            private SingleFieldBuilderV3<ConditionsRequest, ConditionsRequest.Builder, ConditionsRequestOrBuilder> conditionsBuilder_;
            private ConditionsRequest conditions_;
            private SingleFieldBuilderV3<HourlyForecastRequest, HourlyForecastRequest.Builder, HourlyForecastRequestOrBuilder> hourlyForecastBuilder_;
            private HourlyForecastRequest hourlyForecast_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(WeatherRequest weatherRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<ConditionsRequest, ConditionsRequest.Builder, ConditionsRequestOrBuilder> singleFieldBuilderV3 = this.conditionsBuilder_;
                    weatherRequest.conditions_ = singleFieldBuilderV3 == null ? this.conditions_ : (ConditionsRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<AlertsRequest, AlertsRequest.Builder, AlertsRequestOrBuilder> singleFieldBuilderV4 = this.alertsBuilder_;
                    weatherRequest.alerts_ = singleFieldBuilderV4 == null ? this.alerts_ : (AlertsRequest) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<HourlyForecastRequest, HourlyForecastRequest.Builder, HourlyForecastRequestOrBuilder> singleFieldBuilderV5 = this.hourlyForecastBuilder_;
                    weatherRequest.hourlyForecast_ = singleFieldBuilderV5 == null ? this.hourlyForecast_ : (HourlyForecastRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                weatherRequest.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<AlertsRequest, AlertsRequest.Builder, AlertsRequestOrBuilder> getAlertsFieldBuilder() {
                if (this.alertsBuilder_ == null) {
                    this.alertsBuilder_ = new SingleFieldBuilderV3<>(getAlerts(), getParentForChildren(), isClean());
                    this.alerts_ = null;
                }
                return this.alertsBuilder_;
            }

            private SingleFieldBuilderV3<ConditionsRequest, ConditionsRequest.Builder, ConditionsRequestOrBuilder> getConditionsFieldBuilder() {
                if (this.conditionsBuilder_ == null) {
                    this.conditionsBuilder_ = new SingleFieldBuilderV3<>(getConditions(), getParentForChildren(), isClean());
                    this.conditions_ = null;
                }
                return this.conditionsBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WeatherProto.internal_static_CSM_Proto_Weather_WeatherRequest_descriptor;
            }

            private SingleFieldBuilderV3<HourlyForecastRequest, HourlyForecastRequest.Builder, HourlyForecastRequestOrBuilder> getHourlyForecastFieldBuilder() {
                if (this.hourlyForecastBuilder_ == null) {
                    this.hourlyForecastBuilder_ = new SingleFieldBuilderV3<>(getHourlyForecast(), getParentForChildren(), isClean());
                    this.hourlyForecast_ = null;
                }
                return this.hourlyForecastBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getConditionsFieldBuilder();
                    getAlertsFieldBuilder();
                    getHourlyForecastFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WeatherRequest build() {
                WeatherRequest weatherRequestBuildPartial = buildPartial();
                if (weatherRequestBuildPartial.isInitialized()) {
                    return weatherRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) weatherRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WeatherRequest buildPartial() {
                WeatherRequest weatherRequest = new WeatherRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(weatherRequest);
                }
                onBuilt();
                return weatherRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.conditions_ = null;
                SingleFieldBuilderV3<ConditionsRequest, ConditionsRequest.Builder, ConditionsRequestOrBuilder> singleFieldBuilderV3 = this.conditionsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.conditionsBuilder_ = null;
                }
                this.alerts_ = null;
                SingleFieldBuilderV3<AlertsRequest, AlertsRequest.Builder, AlertsRequestOrBuilder> singleFieldBuilderV4 = this.alertsBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.alertsBuilder_ = null;
                }
                this.hourlyForecast_ = null;
                SingleFieldBuilderV3<HourlyForecastRequest, HourlyForecastRequest.Builder, HourlyForecastRequestOrBuilder> singleFieldBuilderV5 = this.hourlyForecastBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.hourlyForecastBuilder_ = null;
                }
                return this;
            }

            public Builder clearAlerts() {
                this.bitField0_ &= -3;
                this.alerts_ = null;
                SingleFieldBuilderV3<AlertsRequest, AlertsRequest.Builder, AlertsRequestOrBuilder> singleFieldBuilderV3 = this.alertsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.alertsBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConditions() {
                this.bitField0_ &= -2;
                this.conditions_ = null;
                SingleFieldBuilderV3<ConditionsRequest, ConditionsRequest.Builder, ConditionsRequestOrBuilder> singleFieldBuilderV3 = this.conditionsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.conditionsBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearHourlyForecast() {
                this.bitField0_ &= -5;
                this.hourlyForecast_ = null;
                SingleFieldBuilderV3<HourlyForecastRequest, HourlyForecastRequest.Builder, HourlyForecastRequestOrBuilder> singleFieldBuilderV3 = this.hourlyForecastBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.hourlyForecastBuilder_ = null;
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

            @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherRequestOrBuilder
            public AlertsRequest getAlerts() {
                SingleFieldBuilderV3<AlertsRequest, AlertsRequest.Builder, AlertsRequestOrBuilder> singleFieldBuilderV3 = this.alertsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlertsRequest) singleFieldBuilderV3.getMessage();
                }
                AlertsRequest alertsRequest = this.alerts_;
                return alertsRequest == null ? AlertsRequest.getDefaultInstance() : alertsRequest;
            }

            public AlertsRequest.Builder getAlertsBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (AlertsRequest.Builder) getAlertsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherRequestOrBuilder
            public AlertsRequestOrBuilder getAlertsOrBuilder() {
                SingleFieldBuilderV3<AlertsRequest, AlertsRequest.Builder, AlertsRequestOrBuilder> singleFieldBuilderV3 = this.alertsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlertsRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AlertsRequest alertsRequest = this.alerts_;
                return alertsRequest == null ? AlertsRequest.getDefaultInstance() : alertsRequest;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherRequestOrBuilder
            public ConditionsRequest getConditions() {
                SingleFieldBuilderV3<ConditionsRequest, ConditionsRequest.Builder, ConditionsRequestOrBuilder> singleFieldBuilderV3 = this.conditionsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConditionsRequest) singleFieldBuilderV3.getMessage();
                }
                ConditionsRequest conditionsRequest = this.conditions_;
                return conditionsRequest == null ? ConditionsRequest.getDefaultInstance() : conditionsRequest;
            }

            public ConditionsRequest.Builder getConditionsBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (ConditionsRequest.Builder) getConditionsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherRequestOrBuilder
            public ConditionsRequestOrBuilder getConditionsOrBuilder() {
                SingleFieldBuilderV3<ConditionsRequest, ConditionsRequest.Builder, ConditionsRequestOrBuilder> singleFieldBuilderV3 = this.conditionsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConditionsRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConditionsRequest conditionsRequest = this.conditions_;
                return conditionsRequest == null ? ConditionsRequest.getDefaultInstance() : conditionsRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WeatherProto.internal_static_CSM_Proto_Weather_WeatherRequest_descriptor;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherRequestOrBuilder
            public HourlyForecastRequest getHourlyForecast() {
                SingleFieldBuilderV3<HourlyForecastRequest, HourlyForecastRequest.Builder, HourlyForecastRequestOrBuilder> singleFieldBuilderV3 = this.hourlyForecastBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HourlyForecastRequest) singleFieldBuilderV3.getMessage();
                }
                HourlyForecastRequest hourlyForecastRequest = this.hourlyForecast_;
                return hourlyForecastRequest == null ? HourlyForecastRequest.getDefaultInstance() : hourlyForecastRequest;
            }

            public HourlyForecastRequest.Builder getHourlyForecastBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (HourlyForecastRequest.Builder) getHourlyForecastFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherRequestOrBuilder
            public HourlyForecastRequestOrBuilder getHourlyForecastOrBuilder() {
                SingleFieldBuilderV3<HourlyForecastRequest, HourlyForecastRequest.Builder, HourlyForecastRequestOrBuilder> singleFieldBuilderV3 = this.hourlyForecastBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HourlyForecastRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                HourlyForecastRequest hourlyForecastRequest = this.hourlyForecast_;
                return hourlyForecastRequest == null ? HourlyForecastRequest.getDefaultInstance() : hourlyForecastRequest;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherRequestOrBuilder
            public boolean hasAlerts() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherRequestOrBuilder
            public boolean hasConditions() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherRequestOrBuilder
            public boolean hasHourlyForecast() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WeatherProto.internal_static_CSM_Proto_Weather_WeatherRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(WeatherRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasConditions() && !getConditions().isInitialized()) {
                    return false;
                }
                if (!hasAlerts() || getAlerts().isInitialized()) {
                    return !hasHourlyForecast() || getHourlyForecast().isInitialized();
                }
                return false;
            }

            public Builder mergeAlerts(AlertsRequest alertsRequest) {
                AlertsRequest alertsRequest2;
                SingleFieldBuilderV3<AlertsRequest, AlertsRequest.Builder, AlertsRequestOrBuilder> singleFieldBuilderV3 = this.alertsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(alertsRequest);
                } else if ((this.bitField0_ & 2) == 0 || (alertsRequest2 = this.alerts_) == null || alertsRequest2 == AlertsRequest.getDefaultInstance()) {
                    this.alerts_ = alertsRequest;
                } else {
                    getAlertsBuilder().mergeFrom(alertsRequest);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder mergeConditions(ConditionsRequest conditionsRequest) {
                ConditionsRequest conditionsRequest2;
                SingleFieldBuilderV3<ConditionsRequest, ConditionsRequest.Builder, ConditionsRequestOrBuilder> singleFieldBuilderV3 = this.conditionsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(conditionsRequest);
                } else if ((this.bitField0_ & 1) == 0 || (conditionsRequest2 = this.conditions_) == null || conditionsRequest2 == ConditionsRequest.getDefaultInstance()) {
                    this.conditions_ = conditionsRequest;
                } else {
                    getConditionsBuilder().mergeFrom(conditionsRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
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
                                if (tag == 90) {
                                    codedInputStream.readMessage(getConditionsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 98) {
                                    codedInputStream.readMessage(getAlertsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 130) {
                                    codedInputStream.readMessage(getHourlyForecastFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeHourlyForecast(HourlyForecastRequest hourlyForecastRequest) {
                HourlyForecastRequest hourlyForecastRequest2;
                SingleFieldBuilderV3<HourlyForecastRequest, HourlyForecastRequest.Builder, HourlyForecastRequestOrBuilder> singleFieldBuilderV3 = this.hourlyForecastBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(hourlyForecastRequest);
                } else if ((this.bitField0_ & 4) == 0 || (hourlyForecastRequest2 = this.hourlyForecast_) == null || hourlyForecastRequest2 == HourlyForecastRequest.getDefaultInstance()) {
                    this.hourlyForecast_ = hourlyForecastRequest;
                } else {
                    getHourlyForecastBuilder().mergeFrom(hourlyForecastRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setAlerts(AlertsRequest.Builder builder) {
                SingleFieldBuilderV3<AlertsRequest, AlertsRequest.Builder, AlertsRequestOrBuilder> singleFieldBuilderV3 = this.alertsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.alerts_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setConditions(ConditionsRequest.Builder builder) {
                SingleFieldBuilderV3<ConditionsRequest, ConditionsRequest.Builder, ConditionsRequestOrBuilder> singleFieldBuilderV3 = this.conditionsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.conditions_ = builder.build();
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

            public Builder setHourlyForecast(HourlyForecastRequest.Builder builder) {
                SingleFieldBuilderV3<HourlyForecastRequest, HourlyForecastRequest.Builder, HourlyForecastRequestOrBuilder> singleFieldBuilderV3 = this.hourlyForecastBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.hourlyForecast_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
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
            public WeatherRequest getDefaultInstanceForType() {
                return WeatherRequest.getDefaultInstance();
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

            public Builder setAlerts(AlertsRequest alertsRequest) {
                SingleFieldBuilderV3<AlertsRequest, AlertsRequest.Builder, AlertsRequestOrBuilder> singleFieldBuilderV3 = this.alertsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    alertsRequest.getClass();
                    this.alerts_ = alertsRequest;
                } else {
                    singleFieldBuilderV3.setMessage(alertsRequest);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setConditions(ConditionsRequest conditionsRequest) {
                SingleFieldBuilderV3<ConditionsRequest, ConditionsRequest.Builder, ConditionsRequestOrBuilder> singleFieldBuilderV3 = this.conditionsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    conditionsRequest.getClass();
                    this.conditions_ = conditionsRequest;
                } else {
                    singleFieldBuilderV3.setMessage(conditionsRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setHourlyForecast(HourlyForecastRequest hourlyForecastRequest) {
                SingleFieldBuilderV3<HourlyForecastRequest, HourlyForecastRequest.Builder, HourlyForecastRequestOrBuilder> singleFieldBuilderV3 = this.hourlyForecastBuilder_;
                if (singleFieldBuilderV3 == null) {
                    hourlyForecastRequest.getClass();
                    this.hourlyForecast_ = hourlyForecastRequest;
                } else {
                    singleFieldBuilderV3.setMessage(hourlyForecastRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof WeatherRequest) {
                    return mergeFrom((WeatherRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(WeatherRequest weatherRequest) {
                if (weatherRequest == WeatherRequest.getDefaultInstance()) {
                    return this;
                }
                if (weatherRequest.hasConditions()) {
                    mergeConditions(weatherRequest.getConditions());
                }
                if (weatherRequest.hasAlerts()) {
                    mergeAlerts(weatherRequest.getAlerts());
                }
                if (weatherRequest.hasHourlyForecast()) {
                    mergeHourlyForecast(weatherRequest.getHourlyForecast());
                }
                mergeUnknownFields(weatherRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public WeatherRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ WeatherRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private WeatherRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WeatherRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WeatherRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WeatherRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static WeatherRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static WeatherRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static WeatherRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static WeatherRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static WeatherRequest parseFrom(InputStream inputStream) {
            return (WeatherRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static WeatherRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WeatherRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WeatherRequest parseFrom(CodedInputStream codedInputStream) {
            return (WeatherRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static WeatherRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WeatherRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class WeatherResponse extends GeneratedMessageV3 implements WeatherResponseOrBuilder {
        public static final int ALERTS_FIELD_NUMBER = 12;
        public static final int CONDITIONS_FIELD_NUMBER = 11;
        public static final int HOURLY_FORECAST_FIELD_NUMBER = 16;
        public static final int RESPONSE_STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private AlertsResponse alerts_;
        private int bitField0_;
        private ConditionsResponse conditions_;
        private HourlyForecastResponse hourlyForecast_;
        private byte memoizedIsInitialized;
        private int responseStatus_;
        private static final WeatherResponse DEFAULT_INSTANCE = new WeatherResponse();

        @Deprecated
        public static final Parser<WeatherResponse> PARSER = new AbstractParser<WeatherResponse>() { // from class: com.garmin.gcsprotos.generated.WeatherProto.WeatherResponse.1
            @Override // com.google.protobuf.Parser
            public WeatherResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = WeatherResponse.newBuilder();
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

        private WeatherResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.responseStatus_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WeatherResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WeatherProto.internal_static_CSM_Proto_Weather_WeatherResponse_descriptor;
        }

        public static Builder newBuilder(WeatherResponse weatherResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(weatherResponse);
        }

        public static WeatherResponse parseDelimitedFrom(InputStream inputStream) {
            return (WeatherResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static WeatherResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<WeatherResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WeatherResponse)) {
                return super.equals(obj);
            }
            WeatherResponse weatherResponse = (WeatherResponse) obj;
            if (hasResponseStatus() != weatherResponse.hasResponseStatus()) {
                return false;
            }
            if ((hasResponseStatus() && this.responseStatus_ != weatherResponse.responseStatus_) || hasConditions() != weatherResponse.hasConditions()) {
                return false;
            }
            if ((hasConditions() && !getConditions().equals(weatherResponse.getConditions())) || hasAlerts() != weatherResponse.hasAlerts()) {
                return false;
            }
            if ((!hasAlerts() || getAlerts().equals(weatherResponse.getAlerts())) && hasHourlyForecast() == weatherResponse.hasHourlyForecast()) {
                return (!hasHourlyForecast() || getHourlyForecast().equals(weatherResponse.getHourlyForecast())) && getUnknownFields().equals(weatherResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherResponseOrBuilder
        public AlertsResponse getAlerts() {
            AlertsResponse alertsResponse = this.alerts_;
            return alertsResponse == null ? AlertsResponse.getDefaultInstance() : alertsResponse;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherResponseOrBuilder
        public AlertsResponseOrBuilder getAlertsOrBuilder() {
            AlertsResponse alertsResponse = this.alerts_;
            return alertsResponse == null ? AlertsResponse.getDefaultInstance() : alertsResponse;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherResponseOrBuilder
        public ConditionsResponse getConditions() {
            ConditionsResponse conditionsResponse = this.conditions_;
            return conditionsResponse == null ? ConditionsResponse.getDefaultInstance() : conditionsResponse;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherResponseOrBuilder
        public ConditionsResponseOrBuilder getConditionsOrBuilder() {
            ConditionsResponse conditionsResponse = this.conditions_;
            return conditionsResponse == null ? ConditionsResponse.getDefaultInstance() : conditionsResponse;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherResponseOrBuilder
        public HourlyForecastResponse getHourlyForecast() {
            HourlyForecastResponse hourlyForecastResponse = this.hourlyForecast_;
            return hourlyForecastResponse == null ? HourlyForecastResponse.getDefaultInstance() : hourlyForecastResponse;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherResponseOrBuilder
        public HourlyForecastResponseOrBuilder getHourlyForecastOrBuilder() {
            HourlyForecastResponse hourlyForecastResponse = this.hourlyForecast_;
            return hourlyForecastResponse == null ? HourlyForecastResponse.getDefaultInstance() : hourlyForecastResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<WeatherResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherResponseOrBuilder
        public WeatherStatus getResponseStatus() {
            WeatherStatus weatherStatusForNumber = WeatherStatus.forNumber(this.responseStatus_);
            return weatherStatusForNumber == null ? WeatherStatus.OK : weatherStatusForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.responseStatus_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(11, getConditions());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(12, getAlerts());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(16, getHourlyForecast());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherResponseOrBuilder
        public boolean hasAlerts() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherResponseOrBuilder
        public boolean hasConditions() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherResponseOrBuilder
        public boolean hasHourlyForecast() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherResponseOrBuilder
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
            if (hasConditions()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getConditions().hashCode();
            }
            if (hasAlerts()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + getAlerts().hashCode();
            }
            if (hasHourlyForecast()) {
                iHashCode = e5.c(iHashCode, 37, 16, 53) + getHourlyForecast().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WeatherProto.internal_static_CSM_Proto_Weather_WeatherResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(WeatherResponse.class, Builder.class);
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
            if (hasConditions() && !getConditions().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasAlerts() && !getAlerts().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasHourlyForecast() || getHourlyForecast().isInitialized()) {
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
            return new WeatherResponse();
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
                codedOutputStream.writeMessage(11, getConditions());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(12, getAlerts());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(16, getHourlyForecast());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WeatherResponseOrBuilder {
            private SingleFieldBuilderV3<AlertsResponse, AlertsResponse.Builder, AlertsResponseOrBuilder> alertsBuilder_;
            private AlertsResponse alerts_;
            private int bitField0_;
            private SingleFieldBuilderV3<ConditionsResponse, ConditionsResponse.Builder, ConditionsResponseOrBuilder> conditionsBuilder_;
            private ConditionsResponse conditions_;
            private SingleFieldBuilderV3<HourlyForecastResponse, HourlyForecastResponse.Builder, HourlyForecastResponseOrBuilder> hourlyForecastBuilder_;
            private HourlyForecastResponse hourlyForecast_;
            private int responseStatus_;

            private Builder() {
                this.responseStatus_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(WeatherResponse weatherResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    weatherResponse.responseStatus_ = this.responseStatus_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<ConditionsResponse, ConditionsResponse.Builder, ConditionsResponseOrBuilder> singleFieldBuilderV3 = this.conditionsBuilder_;
                    weatherResponse.conditions_ = singleFieldBuilderV3 == null ? this.conditions_ : (ConditionsResponse) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<AlertsResponse, AlertsResponse.Builder, AlertsResponseOrBuilder> singleFieldBuilderV4 = this.alertsBuilder_;
                    weatherResponse.alerts_ = singleFieldBuilderV4 == null ? this.alerts_ : (AlertsResponse) singleFieldBuilderV4.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<HourlyForecastResponse, HourlyForecastResponse.Builder, HourlyForecastResponseOrBuilder> singleFieldBuilderV5 = this.hourlyForecastBuilder_;
                    weatherResponse.hourlyForecast_ = singleFieldBuilderV5 == null ? this.hourlyForecast_ : (HourlyForecastResponse) singleFieldBuilderV5.build();
                    i14 |= 8;
                }
                weatherResponse.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<AlertsResponse, AlertsResponse.Builder, AlertsResponseOrBuilder> getAlertsFieldBuilder() {
                if (this.alertsBuilder_ == null) {
                    this.alertsBuilder_ = new SingleFieldBuilderV3<>(getAlerts(), getParentForChildren(), isClean());
                    this.alerts_ = null;
                }
                return this.alertsBuilder_;
            }

            private SingleFieldBuilderV3<ConditionsResponse, ConditionsResponse.Builder, ConditionsResponseOrBuilder> getConditionsFieldBuilder() {
                if (this.conditionsBuilder_ == null) {
                    this.conditionsBuilder_ = new SingleFieldBuilderV3<>(getConditions(), getParentForChildren(), isClean());
                    this.conditions_ = null;
                }
                return this.conditionsBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WeatherProto.internal_static_CSM_Proto_Weather_WeatherResponse_descriptor;
            }

            private SingleFieldBuilderV3<HourlyForecastResponse, HourlyForecastResponse.Builder, HourlyForecastResponseOrBuilder> getHourlyForecastFieldBuilder() {
                if (this.hourlyForecastBuilder_ == null) {
                    this.hourlyForecastBuilder_ = new SingleFieldBuilderV3<>(getHourlyForecast(), getParentForChildren(), isClean());
                    this.hourlyForecast_ = null;
                }
                return this.hourlyForecastBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getConditionsFieldBuilder();
                    getAlertsFieldBuilder();
                    getHourlyForecastFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WeatherResponse build() {
                WeatherResponse weatherResponseBuildPartial = buildPartial();
                if (weatherResponseBuildPartial.isInitialized()) {
                    return weatherResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) weatherResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WeatherResponse buildPartial() {
                WeatherResponse weatherResponse = new WeatherResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(weatherResponse);
                }
                onBuilt();
                return weatherResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.responseStatus_ = 0;
                this.conditions_ = null;
                SingleFieldBuilderV3<ConditionsResponse, ConditionsResponse.Builder, ConditionsResponseOrBuilder> singleFieldBuilderV3 = this.conditionsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.conditionsBuilder_ = null;
                }
                this.alerts_ = null;
                SingleFieldBuilderV3<AlertsResponse, AlertsResponse.Builder, AlertsResponseOrBuilder> singleFieldBuilderV4 = this.alertsBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.alertsBuilder_ = null;
                }
                this.hourlyForecast_ = null;
                SingleFieldBuilderV3<HourlyForecastResponse, HourlyForecastResponse.Builder, HourlyForecastResponseOrBuilder> singleFieldBuilderV5 = this.hourlyForecastBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.hourlyForecastBuilder_ = null;
                }
                return this;
            }

            public Builder clearAlerts() {
                this.bitField0_ &= -5;
                this.alerts_ = null;
                SingleFieldBuilderV3<AlertsResponse, AlertsResponse.Builder, AlertsResponseOrBuilder> singleFieldBuilderV3 = this.alertsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.alertsBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConditions() {
                this.bitField0_ &= -3;
                this.conditions_ = null;
                SingleFieldBuilderV3<ConditionsResponse, ConditionsResponse.Builder, ConditionsResponseOrBuilder> singleFieldBuilderV3 = this.conditionsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.conditionsBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearHourlyForecast() {
                this.bitField0_ &= -9;
                this.hourlyForecast_ = null;
                SingleFieldBuilderV3<HourlyForecastResponse, HourlyForecastResponse.Builder, HourlyForecastResponseOrBuilder> singleFieldBuilderV3 = this.hourlyForecastBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.hourlyForecastBuilder_ = null;
                }
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

            @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherResponseOrBuilder
            public AlertsResponse getAlerts() {
                SingleFieldBuilderV3<AlertsResponse, AlertsResponse.Builder, AlertsResponseOrBuilder> singleFieldBuilderV3 = this.alertsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlertsResponse) singleFieldBuilderV3.getMessage();
                }
                AlertsResponse alertsResponse = this.alerts_;
                return alertsResponse == null ? AlertsResponse.getDefaultInstance() : alertsResponse;
            }

            public AlertsResponse.Builder getAlertsBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (AlertsResponse.Builder) getAlertsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherResponseOrBuilder
            public AlertsResponseOrBuilder getAlertsOrBuilder() {
                SingleFieldBuilderV3<AlertsResponse, AlertsResponse.Builder, AlertsResponseOrBuilder> singleFieldBuilderV3 = this.alertsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlertsResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AlertsResponse alertsResponse = this.alerts_;
                return alertsResponse == null ? AlertsResponse.getDefaultInstance() : alertsResponse;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherResponseOrBuilder
            public ConditionsResponse getConditions() {
                SingleFieldBuilderV3<ConditionsResponse, ConditionsResponse.Builder, ConditionsResponseOrBuilder> singleFieldBuilderV3 = this.conditionsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConditionsResponse) singleFieldBuilderV3.getMessage();
                }
                ConditionsResponse conditionsResponse = this.conditions_;
                return conditionsResponse == null ? ConditionsResponse.getDefaultInstance() : conditionsResponse;
            }

            public ConditionsResponse.Builder getConditionsBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (ConditionsResponse.Builder) getConditionsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherResponseOrBuilder
            public ConditionsResponseOrBuilder getConditionsOrBuilder() {
                SingleFieldBuilderV3<ConditionsResponse, ConditionsResponse.Builder, ConditionsResponseOrBuilder> singleFieldBuilderV3 = this.conditionsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConditionsResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConditionsResponse conditionsResponse = this.conditions_;
                return conditionsResponse == null ? ConditionsResponse.getDefaultInstance() : conditionsResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WeatherProto.internal_static_CSM_Proto_Weather_WeatherResponse_descriptor;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherResponseOrBuilder
            public HourlyForecastResponse getHourlyForecast() {
                SingleFieldBuilderV3<HourlyForecastResponse, HourlyForecastResponse.Builder, HourlyForecastResponseOrBuilder> singleFieldBuilderV3 = this.hourlyForecastBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HourlyForecastResponse) singleFieldBuilderV3.getMessage();
                }
                HourlyForecastResponse hourlyForecastResponse = this.hourlyForecast_;
                return hourlyForecastResponse == null ? HourlyForecastResponse.getDefaultInstance() : hourlyForecastResponse;
            }

            public HourlyForecastResponse.Builder getHourlyForecastBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (HourlyForecastResponse.Builder) getHourlyForecastFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherResponseOrBuilder
            public HourlyForecastResponseOrBuilder getHourlyForecastOrBuilder() {
                SingleFieldBuilderV3<HourlyForecastResponse, HourlyForecastResponse.Builder, HourlyForecastResponseOrBuilder> singleFieldBuilderV3 = this.hourlyForecastBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HourlyForecastResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                HourlyForecastResponse hourlyForecastResponse = this.hourlyForecast_;
                return hourlyForecastResponse == null ? HourlyForecastResponse.getDefaultInstance() : hourlyForecastResponse;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherResponseOrBuilder
            public WeatherStatus getResponseStatus() {
                WeatherStatus weatherStatusForNumber = WeatherStatus.forNumber(this.responseStatus_);
                return weatherStatusForNumber == null ? WeatherStatus.OK : weatherStatusForNumber;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherResponseOrBuilder
            public boolean hasAlerts() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherResponseOrBuilder
            public boolean hasConditions() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherResponseOrBuilder
            public boolean hasHourlyForecast() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherResponseOrBuilder
            public boolean hasResponseStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WeatherProto.internal_static_CSM_Proto_Weather_WeatherResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(WeatherResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasConditions() && !getConditions().isInitialized()) {
                    return false;
                }
                if (!hasAlerts() || getAlerts().isInitialized()) {
                    return !hasHourlyForecast() || getHourlyForecast().isInitialized();
                }
                return false;
            }

            public Builder mergeAlerts(AlertsResponse alertsResponse) {
                AlertsResponse alertsResponse2;
                SingleFieldBuilderV3<AlertsResponse, AlertsResponse.Builder, AlertsResponseOrBuilder> singleFieldBuilderV3 = this.alertsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(alertsResponse);
                } else if ((this.bitField0_ & 4) == 0 || (alertsResponse2 = this.alerts_) == null || alertsResponse2 == AlertsResponse.getDefaultInstance()) {
                    this.alerts_ = alertsResponse;
                } else {
                    getAlertsBuilder().mergeFrom(alertsResponse);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder mergeConditions(ConditionsResponse conditionsResponse) {
                ConditionsResponse conditionsResponse2;
                SingleFieldBuilderV3<ConditionsResponse, ConditionsResponse.Builder, ConditionsResponseOrBuilder> singleFieldBuilderV3 = this.conditionsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(conditionsResponse);
                } else if ((this.bitField0_ & 2) == 0 || (conditionsResponse2 = this.conditions_) == null || conditionsResponse2 == ConditionsResponse.getDefaultInstance()) {
                    this.conditions_ = conditionsResponse;
                } else {
                    getConditionsBuilder().mergeFrom(conditionsResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
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
                                    if (WeatherStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.responseStatus_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 90) {
                                    codedInputStream.readMessage(getConditionsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 98) {
                                    codedInputStream.readMessage(getAlertsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 130) {
                                    codedInputStream.readMessage(getHourlyForecastFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeHourlyForecast(HourlyForecastResponse hourlyForecastResponse) {
                HourlyForecastResponse hourlyForecastResponse2;
                SingleFieldBuilderV3<HourlyForecastResponse, HourlyForecastResponse.Builder, HourlyForecastResponseOrBuilder> singleFieldBuilderV3 = this.hourlyForecastBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(hourlyForecastResponse);
                } else if ((this.bitField0_ & 8) == 0 || (hourlyForecastResponse2 = this.hourlyForecast_) == null || hourlyForecastResponse2 == HourlyForecastResponse.getDefaultInstance()) {
                    this.hourlyForecast_ = hourlyForecastResponse;
                } else {
                    getHourlyForecastBuilder().mergeFrom(hourlyForecastResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setAlerts(AlertsResponse.Builder builder) {
                SingleFieldBuilderV3<AlertsResponse, AlertsResponse.Builder, AlertsResponseOrBuilder> singleFieldBuilderV3 = this.alertsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.alerts_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setConditions(ConditionsResponse.Builder builder) {
                SingleFieldBuilderV3<ConditionsResponse, ConditionsResponse.Builder, ConditionsResponseOrBuilder> singleFieldBuilderV3 = this.conditionsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.conditions_ = builder.build();
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

            public Builder setHourlyForecast(HourlyForecastResponse.Builder builder) {
                SingleFieldBuilderV3<HourlyForecastResponse, HourlyForecastResponse.Builder, HourlyForecastResponseOrBuilder> singleFieldBuilderV3 = this.hourlyForecastBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.hourlyForecast_ = builder.build();
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

            public Builder setResponseStatus(WeatherStatus weatherStatus) {
                weatherStatus.getClass();
                this.bitField0_ |= 1;
                this.responseStatus_ = weatherStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public WeatherResponse getDefaultInstanceForType() {
                return WeatherResponse.getDefaultInstance();
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
                maybeForceBuilderInitialization();
            }

            public Builder setAlerts(AlertsResponse alertsResponse) {
                SingleFieldBuilderV3<AlertsResponse, AlertsResponse.Builder, AlertsResponseOrBuilder> singleFieldBuilderV3 = this.alertsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    alertsResponse.getClass();
                    this.alerts_ = alertsResponse;
                } else {
                    singleFieldBuilderV3.setMessage(alertsResponse);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setConditions(ConditionsResponse conditionsResponse) {
                SingleFieldBuilderV3<ConditionsResponse, ConditionsResponse.Builder, ConditionsResponseOrBuilder> singleFieldBuilderV3 = this.conditionsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    conditionsResponse.getClass();
                    this.conditions_ = conditionsResponse;
                } else {
                    singleFieldBuilderV3.setMessage(conditionsResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setHourlyForecast(HourlyForecastResponse hourlyForecastResponse) {
                SingleFieldBuilderV3<HourlyForecastResponse, HourlyForecastResponse.Builder, HourlyForecastResponseOrBuilder> singleFieldBuilderV3 = this.hourlyForecastBuilder_;
                if (singleFieldBuilderV3 == null) {
                    hourlyForecastResponse.getClass();
                    this.hourlyForecast_ = hourlyForecastResponse;
                } else {
                    singleFieldBuilderV3.setMessage(hourlyForecastResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof WeatherResponse) {
                    return mergeFrom((WeatherResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(WeatherResponse weatherResponse) {
                if (weatherResponse == WeatherResponse.getDefaultInstance()) {
                    return this;
                }
                if (weatherResponse.hasResponseStatus()) {
                    setResponseStatus(weatherResponse.getResponseStatus());
                }
                if (weatherResponse.hasConditions()) {
                    mergeConditions(weatherResponse.getConditions());
                }
                if (weatherResponse.hasAlerts()) {
                    mergeAlerts(weatherResponse.getAlerts());
                }
                if (weatherResponse.hasHourlyForecast()) {
                    mergeHourlyForecast(weatherResponse.getHourlyForecast());
                }
                mergeUnknownFields(weatherResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public WeatherResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static WeatherResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WeatherResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WeatherResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ WeatherResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static WeatherResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private WeatherResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.responseStatus_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static WeatherResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static WeatherResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static WeatherResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static WeatherResponse parseFrom(InputStream inputStream) {
            return (WeatherResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static WeatherResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WeatherResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WeatherResponse parseFrom(CodedInputStream codedInputStream) {
            return (WeatherResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static WeatherResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WeatherResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class WeatherZone extends GeneratedMessageV3 implements WeatherZoneOrBuilder {
        public static final int ID_FIELD_NUMBER = 1;
        public static final int POLYGONS_FIELD_NUMBER = 3;
        public static final int VERSION_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object id_;
        private byte memoizedIsInitialized;
        private List<DataTypesProto.Polygon> polygons_;
        private int version_;
        private static final WeatherZone DEFAULT_INSTANCE = new WeatherZone();

        @Deprecated
        public static final Parser<WeatherZone> PARSER = new AbstractParser<WeatherZone>() { // from class: com.garmin.gcsprotos.generated.WeatherProto.WeatherZone.1
            @Override // com.google.protobuf.Parser
            public WeatherZone parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = WeatherZone.newBuilder();
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

        private WeatherZone() {
            this.id_ = "";
            this.version_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.id_ = "";
            this.polygons_ = Collections.EMPTY_LIST;
        }

        public static WeatherZone getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WeatherProto.internal_static_CSM_Proto_Weather_WeatherZone_descriptor;
        }

        public static Builder newBuilder(WeatherZone weatherZone) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(weatherZone);
        }

        public static WeatherZone parseDelimitedFrom(InputStream inputStream) {
            return (WeatherZone) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static WeatherZone parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<WeatherZone> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WeatherZone)) {
                return super.equals(obj);
            }
            WeatherZone weatherZone = (WeatherZone) obj;
            if (hasId() != weatherZone.hasId()) {
                return false;
            }
            if ((!hasId() || getId().equals(weatherZone.getId())) && hasVersion() == weatherZone.hasVersion()) {
                return (!hasVersion() || getVersion() == weatherZone.getVersion()) && getPolygonsList().equals(weatherZone.getPolygonsList()) && getUnknownFields().equals(weatherZone.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherZoneOrBuilder
        public String getId() {
            Object obj = this.id_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.id_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherZoneOrBuilder
        public ByteString getIdBytes() {
            Object obj = this.id_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.id_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<WeatherZone> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherZoneOrBuilder
        public DataTypesProto.Polygon getPolygons(int i14) {
            return this.polygons_.get(i14);
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherZoneOrBuilder
        public int getPolygonsCount() {
            return this.polygons_.size();
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherZoneOrBuilder
        public List<DataTypesProto.Polygon> getPolygonsList() {
            return this.polygons_;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherZoneOrBuilder
        public DataTypesProto.PolygonOrBuilder getPolygonsOrBuilder(int i14) {
            return this.polygons_.get(i14);
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherZoneOrBuilder
        public List<? extends DataTypesProto.PolygonOrBuilder> getPolygonsOrBuilderList() {
            return this.polygons_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.id_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(2, this.version_);
            }
            for (int i15 = 0; i15 < this.polygons_.size(); i15++) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(3, this.polygons_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherZoneOrBuilder
        public int getVersion() {
            return this.version_;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherZoneOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherZoneOrBuilder
        public boolean hasVersion() {
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
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getId().hashCode();
            }
            if (hasVersion()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getVersion();
            }
            if (getPolygonsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getPolygonsList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WeatherProto.internal_static_CSM_Proto_Weather_WeatherZone_fieldAccessorTable.ensureFieldAccessorsInitialized(WeatherZone.class, Builder.class);
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
            for (int i14 = 0; i14 < getPolygonsCount(); i14++) {
                if (!getPolygons(i14).isInitialized()) {
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
            return new WeatherZone();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.id_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.version_);
            }
            for (int i14 = 0; i14 < this.polygons_.size(); i14++) {
                codedOutputStream.writeMessage(3, this.polygons_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WeatherZoneOrBuilder {
            private int bitField0_;
            private Object id_;
            private RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> polygonsBuilder_;
            private List<DataTypesProto.Polygon> polygons_;
            private int version_;

            private Builder() {
                this.id_ = "";
                this.polygons_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(WeatherZone weatherZone) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    weatherZone.id_ = this.id_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    weatherZone.version_ = this.version_;
                    i14 |= 2;
                }
                weatherZone.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(WeatherZone weatherZone) {
                RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> repeatedFieldBuilderV3 = this.polygonsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    weatherZone.polygons_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 4) != 0) {
                    this.polygons_ = Collections.unmodifiableList(this.polygons_);
                    this.bitField0_ &= -5;
                }
                weatherZone.polygons_ = this.polygons_;
            }

            private void ensurePolygonsIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.polygons_ = new ArrayList(this.polygons_);
                    this.bitField0_ |= 4;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WeatherProto.internal_static_CSM_Proto_Weather_WeatherZone_descriptor;
            }

            private RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> getPolygonsFieldBuilder() {
                if (this.polygonsBuilder_ == null) {
                    this.polygonsBuilder_ = new RepeatedFieldBuilderV3<>(this.polygons_, (this.bitField0_ & 4) != 0, getParentForChildren(), isClean());
                    this.polygons_ = null;
                }
                return this.polygonsBuilder_;
            }

            public Builder addAllPolygons(Iterable<? extends DataTypesProto.Polygon> iterable) {
                RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> repeatedFieldBuilderV3 = this.polygonsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensurePolygonsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.polygons_);
                onChanged();
                return this;
            }

            public Builder addPolygons(DataTypesProto.Polygon.Builder builder) {
                RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> repeatedFieldBuilderV3 = this.polygonsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensurePolygonsIsMutable();
                this.polygons_.add(builder.build());
                onChanged();
                return this;
            }

            public DataTypesProto.Polygon.Builder addPolygonsBuilder() {
                return (DataTypesProto.Polygon.Builder) getPolygonsFieldBuilder().addBuilder(DataTypesProto.Polygon.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WeatherZone build() {
                WeatherZone weatherZoneBuildPartial = buildPartial();
                if (weatherZoneBuildPartial.isInitialized()) {
                    return weatherZoneBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) weatherZoneBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WeatherZone buildPartial() {
                WeatherZone weatherZone = new WeatherZone(this);
                buildPartialRepeatedFields(weatherZone);
                if (this.bitField0_ != 0) {
                    buildPartial0(weatherZone);
                }
                onBuilt();
                return weatherZone;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = "";
                this.version_ = 0;
                RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> repeatedFieldBuilderV3 = this.polygonsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.polygons_ = Collections.EMPTY_LIST;
                } else {
                    this.polygons_ = null;
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
                this.id_ = WeatherZone.getDefaultInstance().getId();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPolygons() {
                RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> repeatedFieldBuilderV3 = this.polygonsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.polygons_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearVersion() {
                this.bitField0_ &= -3;
                this.version_ = 0;
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
                return WeatherProto.internal_static_CSM_Proto_Weather_WeatherZone_descriptor;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherZoneOrBuilder
            public String getId() {
                Object obj = this.id_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.id_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherZoneOrBuilder
            public ByteString getIdBytes() {
                Object obj = this.id_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.id_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherZoneOrBuilder
            public DataTypesProto.Polygon getPolygons(int i14) {
                RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> repeatedFieldBuilderV3 = this.polygonsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.polygons_.get(i14) : (DataTypesProto.Polygon) repeatedFieldBuilderV3.getMessage(i14);
            }

            public DataTypesProto.Polygon.Builder getPolygonsBuilder(int i14) {
                return (DataTypesProto.Polygon.Builder) getPolygonsFieldBuilder().getBuilder(i14);
            }

            public List<DataTypesProto.Polygon.Builder> getPolygonsBuilderList() {
                return getPolygonsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherZoneOrBuilder
            public int getPolygonsCount() {
                RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> repeatedFieldBuilderV3 = this.polygonsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.polygons_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherZoneOrBuilder
            public List<DataTypesProto.Polygon> getPolygonsList() {
                RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> repeatedFieldBuilderV3 = this.polygonsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.polygons_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherZoneOrBuilder
            public DataTypesProto.PolygonOrBuilder getPolygonsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> repeatedFieldBuilderV3 = this.polygonsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.polygons_.get(i14) : (DataTypesProto.PolygonOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherZoneOrBuilder
            public List<? extends DataTypesProto.PolygonOrBuilder> getPolygonsOrBuilderList() {
                RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> repeatedFieldBuilderV3 = this.polygonsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.polygons_);
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherZoneOrBuilder
            public int getVersion() {
                return this.version_;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherZoneOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.WeatherZoneOrBuilder
            public boolean hasVersion() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WeatherProto.internal_static_CSM_Proto_Weather_WeatherZone_fieldAccessorTable.ensureFieldAccessorsInitialized(WeatherZone.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i14 = 0; i14 < getPolygonsCount(); i14++) {
                    if (!getPolygons(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(WeatherZone weatherZone) {
                if (weatherZone == WeatherZone.getDefaultInstance()) {
                    return this;
                }
                if (weatherZone.hasId()) {
                    this.id_ = weatherZone.id_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (weatherZone.hasVersion()) {
                    setVersion(weatherZone.getVersion());
                }
                if (this.polygonsBuilder_ == null) {
                    if (!weatherZone.polygons_.isEmpty()) {
                        if (this.polygons_.isEmpty()) {
                            this.polygons_ = weatherZone.polygons_;
                            this.bitField0_ &= -5;
                        } else {
                            ensurePolygonsIsMutable();
                            this.polygons_.addAll(weatherZone.polygons_);
                        }
                        onChanged();
                    }
                } else if (!weatherZone.polygons_.isEmpty()) {
                    boolean zIsEmpty = this.polygonsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> repeatedFieldBuilderV3 = this.polygonsBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.polygonsBuilder_ = null;
                        this.polygons_ = weatherZone.polygons_;
                        this.bitField0_ &= -5;
                        this.polygonsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getPolygonsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(weatherZone.polygons_);
                    }
                }
                mergeUnknownFields(weatherZone.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removePolygons(int i14) {
                RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> repeatedFieldBuilderV3 = this.polygonsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensurePolygonsIsMutable();
                this.polygons_.remove(i14);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setId(String str) {
                str.getClass();
                this.id_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setIdBytes(ByteString byteString) {
                byteString.getClass();
                this.id_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setPolygons(int i14, DataTypesProto.Polygon.Builder builder) {
                RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> repeatedFieldBuilderV3 = this.polygonsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensurePolygonsIsMutable();
                this.polygons_.set(i14, builder.build());
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

            public Builder setVersion(int i14) {
                this.version_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public WeatherZone getDefaultInstanceForType() {
                return WeatherZone.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.id_ = "";
                this.polygons_ = Collections.EMPTY_LIST;
            }

            public DataTypesProto.Polygon.Builder addPolygonsBuilder(int i14) {
                return (DataTypesProto.Polygon.Builder) getPolygonsFieldBuilder().addBuilder(i14, DataTypesProto.Polygon.getDefaultInstance());
            }

            public Builder addPolygons(int i14, DataTypesProto.Polygon polygon) {
                RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> repeatedFieldBuilderV3 = this.polygonsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    polygon.getClass();
                    ensurePolygonsIsMutable();
                    this.polygons_.add(i14, polygon);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, polygon);
                return this;
            }

            public Builder setPolygons(int i14, DataTypesProto.Polygon polygon) {
                RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> repeatedFieldBuilderV3 = this.polygonsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    polygon.getClass();
                    ensurePolygonsIsMutable();
                    this.polygons_.set(i14, polygon);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, polygon);
                return this;
            }

            public Builder addPolygons(DataTypesProto.Polygon polygon) {
                RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> repeatedFieldBuilderV3 = this.polygonsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    polygon.getClass();
                    ensurePolygonsIsMutable();
                    this.polygons_.add(polygon);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(polygon);
                return this;
            }

            public Builder addPolygons(int i14, DataTypesProto.Polygon.Builder builder) {
                RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> repeatedFieldBuilderV3 = this.polygonsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensurePolygonsIsMutable();
                    this.polygons_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof WeatherZone) {
                    return mergeFrom((WeatherZone) message);
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
                                    this.id_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.version_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag != 26) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    DataTypesProto.Polygon polygon = (DataTypesProto.Polygon) codedInputStream.readMessage(DataTypesProto.Polygon.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<DataTypesProto.Polygon, DataTypesProto.Polygon.Builder, DataTypesProto.PolygonOrBuilder> repeatedFieldBuilderV3 = this.polygonsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensurePolygonsIsMutable();
                                        this.polygons_.add(polygon);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(polygon);
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
        public WeatherZone getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static WeatherZone parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WeatherZone) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WeatherZone parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static WeatherZone parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static WeatherZone parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static WeatherZone parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static WeatherZone parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static WeatherZone parseFrom(InputStream inputStream) {
            return (WeatherZone) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static WeatherZone parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WeatherZone) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WeatherZone parseFrom(CodedInputStream codedInputStream) {
            return (WeatherZone) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        private WeatherZone(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.id_ = "";
            this.version_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WeatherZone parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WeatherZone) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ WeatherZone(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class Wind extends GeneratedMessageV3 implements WindOrBuilder {
        public static final int BEARING_FIELD_NUMBER = 3;
        public static final int DIRECTION_NAME_FIELD_NUMBER = 2;
        public static final int SPEED_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bearing_;
        private int bitField0_;
        private volatile Object directionName_;
        private byte memoizedIsInitialized;
        private int speed_;
        private static final Wind DEFAULT_INSTANCE = new Wind();

        @Deprecated
        public static final Parser<Wind> PARSER = new AbstractParser<Wind>() { // from class: com.garmin.gcsprotos.generated.WeatherProto.Wind.1
            @Override // com.google.protobuf.Parser
            public Wind parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Wind.newBuilder();
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

        private Wind() {
            this.speed_ = 0;
            this.directionName_ = "";
            this.bearing_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.directionName_ = "";
        }

        public static Wind getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return WeatherProto.internal_static_CSM_Proto_Weather_Wind_descriptor;
        }

        public static Builder newBuilder(Wind wind) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(wind);
        }

        public static Wind parseDelimitedFrom(InputStream inputStream) {
            return (Wind) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Wind parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Wind> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Wind)) {
                return super.equals(obj);
            }
            Wind wind = (Wind) obj;
            if (hasSpeed() != wind.hasSpeed()) {
                return false;
            }
            if ((hasSpeed() && getSpeed() != wind.getSpeed()) || hasDirectionName() != wind.hasDirectionName()) {
                return false;
            }
            if ((!hasDirectionName() || getDirectionName().equals(wind.getDirectionName())) && hasBearing() == wind.hasBearing()) {
                return (!hasBearing() || getBearing() == wind.getBearing()) && getUnknownFields().equals(wind.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.WindOrBuilder
        public int getBearing() {
            return this.bearing_;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.WindOrBuilder
        public String getDirectionName() {
            Object obj = this.directionName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.directionName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.WindOrBuilder
        public ByteString getDirectionNameBytes() {
            Object obj = this.directionName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.directionName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Wind> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeInt32Size(1, this.speed_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeInt32Size += GeneratedMessageV3.computeStringSize(2, this.directionName_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeInt32Size += CodedOutputStream.computeUInt32Size(3, this.bearing_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.WindOrBuilder
        public int getSpeed() {
            return this.speed_;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.WindOrBuilder
        public boolean hasBearing() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.WindOrBuilder
        public boolean hasDirectionName() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.WeatherProto.WindOrBuilder
        public boolean hasSpeed() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSpeed()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSpeed();
            }
            if (hasDirectionName()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getDirectionName().hashCode();
            }
            if (hasBearing()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getBearing();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return WeatherProto.internal_static_CSM_Proto_Weather_Wind_fieldAccessorTable.ensureFieldAccessorsInitialized(Wind.class, Builder.class);
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
            return new Wind();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeInt32(1, this.speed_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.directionName_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.bearing_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WindOrBuilder {
            private int bearing_;
            private int bitField0_;
            private Object directionName_;
            private int speed_;

            private Builder() {
                this.directionName_ = "";
            }

            private void buildPartial0(Wind wind) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    wind.speed_ = this.speed_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    wind.directionName_ = this.directionName_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    wind.bearing_ = this.bearing_;
                    i14 |= 4;
                }
                wind.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return WeatherProto.internal_static_CSM_Proto_Weather_Wind_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Wind build() {
                Wind windBuildPartial = buildPartial();
                if (windBuildPartial.isInitialized()) {
                    return windBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) windBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Wind buildPartial() {
                Wind wind = new Wind(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(wind);
                }
                onBuilt();
                return wind;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.speed_ = 0;
                this.directionName_ = "";
                this.bearing_ = 0;
                return this;
            }

            public Builder clearBearing() {
                this.bitField0_ &= -5;
                this.bearing_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDirectionName() {
                this.directionName_ = Wind.getDefaultInstance().getDirectionName();
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

            public Builder clearSpeed() {
                this.bitField0_ &= -2;
                this.speed_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.WindOrBuilder
            public int getBearing() {
                return this.bearing_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return WeatherProto.internal_static_CSM_Proto_Weather_Wind_descriptor;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.WindOrBuilder
            public String getDirectionName() {
                Object obj = this.directionName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.directionName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.WindOrBuilder
            public ByteString getDirectionNameBytes() {
                Object obj = this.directionName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.directionName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.WindOrBuilder
            public int getSpeed() {
                return this.speed_;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.WindOrBuilder
            public boolean hasBearing() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.WindOrBuilder
            public boolean hasDirectionName() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.WeatherProto.WindOrBuilder
            public boolean hasSpeed() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return WeatherProto.internal_static_CSM_Proto_Weather_Wind_fieldAccessorTable.ensureFieldAccessorsInitialized(Wind.class, Builder.class);
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
                                    this.speed_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.directionName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.bearing_ = codedInputStream.readUInt32();
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

            public Builder setBearing(int i14) {
                this.bearing_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setDirectionName(String str) {
                str.getClass();
                this.directionName_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setDirectionNameBytes(ByteString byteString) {
                byteString.getClass();
                this.directionName_ = byteString;
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

            public Builder setSpeed(int i14) {
                this.speed_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Wind getDefaultInstanceForType() {
                return Wind.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.directionName_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Wind) {
                    return mergeFrom((Wind) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Wind wind) {
                if (wind == Wind.getDefaultInstance()) {
                    return this;
                }
                if (wind.hasSpeed()) {
                    setSpeed(wind.getSpeed());
                }
                if (wind.hasDirectionName()) {
                    this.directionName_ = wind.directionName_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (wind.hasBearing()) {
                    setBearing(wind.getBearing());
                }
                mergeUnknownFields(wind.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Wind getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Wind parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Wind) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Wind parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Wind parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Wind parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Wind parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Wind parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Wind parseFrom(InputStream inputStream) {
            return (Wind) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Wind parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Wind) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private Wind(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.speed_ = 0;
            this.directionName_ = "";
            this.bearing_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Wind parseFrom(CodedInputStream codedInputStream) {
            return (Wind) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Wind parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Wind) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ Wind(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public enum AlertEnum implements ProtocolMessageEnum {
        TORNADO(1),
        TSUNAMI(2),
        HURRICANE(3),
        EXTREME_WIND(4),
        TYPHOON(5),
        INLAND_HURRICANE(6),
        HURRICANE_FORCE_WIND(7),
        WATERSPOUT(8),
        SEVERE_T_STORM(9),
        WRECKHOUSE_WINDS(10),
        LES_SUETES_WIND(11),
        AVALANCHE(12),
        FLASH_FLOOD(13),
        TROPICAL_STORM(14),
        INLAND_TROPICAL_STORM(15),
        BLIZZARD(16),
        ICE_STORM(17),
        FREEZING_RAIN(18),
        DEBRIS_FLOW(19),
        FLASH_FREEZE(20),
        DUST_STORM(21),
        HIGH_WIND(22),
        WINTER_STORM(23),
        HEAVY_FREEZING_SPRAY(24),
        EXTREME_COLD(25),
        WIND_CHILL(26),
        COLD_WAVE(27),
        HEAVY_SNOW_ALERT(28),
        LAKE_EFFECT_BLOWING_SNOW(29),
        SNOW_SQUALL(30),
        LAKE_EFFECT_SNOW(31),
        WINTER_WEATHER(32),
        SLEET(33),
        SNOWFALL(34),
        SNOW_AND_BLOWING_SNOW(35),
        BLOWING_SNOW(36),
        SNOW_ALERT(37),
        ARCTIC_OUTFLOW(38),
        FREEZING_DRIZZLE(39),
        STORM(40),
        STORM_SURGE(41),
        RAINFALL(42),
        AREAL_FLOOD(43),
        COASTAL_FLOOD(44),
        LAKESHORE_FLOOD(45),
        EXCESSIVE_HEAT(46),
        HEAT(47),
        WEATHER(48),
        HIGH_HEAT_AND_HUMIDITY(49),
        HUMIDEX_AND_HEALTH(50),
        HUMIDEX(51),
        GALE(52),
        FREEZING_SPRAY(53),
        SPECIAL_MARINE(54),
        SQUALL(55),
        STRONG_WIND(56),
        LAKE_WIND(57),
        MARINE_WEATHER(58),
        WIND(59),
        SMALL_CRAFT_HAZARDOUS_SEAS(60),
        HAZARDOUS_SEAS(61),
        SMALL_CRAFT(62),
        SMALL_CRAFT_WINDS(63),
        SMALL_CRAFT_ROUGH_BAR(64),
        HIGH_WATER_LEVEL(65),
        ASHFALL(66),
        FREEZING_FOG(67),
        DENSE_FOG(68),
        DENSE_SMOKE(69),
        BLOWING_DUST(70),
        HARD_FREEZE(71),
        FREEZE(72),
        FROST(73),
        FIRE_WEATHER(74),
        FLOOD(75),
        RIP_TIDE(76),
        HIGH_SURF(77),
        SMOG(78),
        AIR_QUALITY(79),
        BRISK_WIND(80),
        AIR_STAGNATION(81),
        LOW_WATER(82),
        HYDROLOGICAL(83),
        SPECIAL_WEATHER(84);

        public static final int AIR_QUALITY_VALUE = 79;
        public static final int AIR_STAGNATION_VALUE = 81;
        public static final int ARCTIC_OUTFLOW_VALUE = 38;
        public static final int AREAL_FLOOD_VALUE = 43;
        public static final int ASHFALL_VALUE = 66;
        public static final int AVALANCHE_VALUE = 12;
        public static final int BLIZZARD_VALUE = 16;
        public static final int BLOWING_DUST_VALUE = 70;
        public static final int BLOWING_SNOW_VALUE = 36;
        public static final int BRISK_WIND_VALUE = 80;
        public static final int COASTAL_FLOOD_VALUE = 44;
        public static final int COLD_WAVE_VALUE = 27;
        public static final int DEBRIS_FLOW_VALUE = 19;
        public static final int DENSE_FOG_VALUE = 68;
        public static final int DENSE_SMOKE_VALUE = 69;
        public static final int DUST_STORM_VALUE = 21;
        public static final int EXCESSIVE_HEAT_VALUE = 46;
        public static final int EXTREME_COLD_VALUE = 25;
        public static final int EXTREME_WIND_VALUE = 4;
        public static final int FIRE_WEATHER_VALUE = 74;
        public static final int FLASH_FLOOD_VALUE = 13;
        public static final int FLASH_FREEZE_VALUE = 20;
        public static final int FLOOD_VALUE = 75;
        public static final int FREEZE_VALUE = 72;
        public static final int FREEZING_DRIZZLE_VALUE = 39;
        public static final int FREEZING_FOG_VALUE = 67;
        public static final int FREEZING_RAIN_VALUE = 18;
        public static final int FREEZING_SPRAY_VALUE = 53;
        public static final int FROST_VALUE = 73;
        public static final int GALE_VALUE = 52;
        public static final int HARD_FREEZE_VALUE = 71;
        public static final int HAZARDOUS_SEAS_VALUE = 61;
        public static final int HEAT_VALUE = 47;
        public static final int HEAVY_FREEZING_SPRAY_VALUE = 24;
        public static final int HEAVY_SNOW_ALERT_VALUE = 28;
        public static final int HIGH_HEAT_AND_HUMIDITY_VALUE = 49;
        public static final int HIGH_SURF_VALUE = 77;
        public static final int HIGH_WATER_LEVEL_VALUE = 65;
        public static final int HIGH_WIND_VALUE = 22;
        public static final int HUMIDEX_AND_HEALTH_VALUE = 50;
        public static final int HUMIDEX_VALUE = 51;
        public static final int HURRICANE_FORCE_WIND_VALUE = 7;
        public static final int HURRICANE_VALUE = 3;
        public static final int HYDROLOGICAL_VALUE = 83;
        public static final int ICE_STORM_VALUE = 17;
        public static final int INLAND_HURRICANE_VALUE = 6;
        public static final int INLAND_TROPICAL_STORM_VALUE = 15;
        public static final int LAKESHORE_FLOOD_VALUE = 45;
        public static final int LAKE_EFFECT_BLOWING_SNOW_VALUE = 29;
        public static final int LAKE_EFFECT_SNOW_VALUE = 31;
        public static final int LAKE_WIND_VALUE = 57;
        public static final int LES_SUETES_WIND_VALUE = 11;
        public static final int LOW_WATER_VALUE = 82;
        public static final int MARINE_WEATHER_VALUE = 58;
        public static final int RAINFALL_VALUE = 42;
        public static final int RIP_TIDE_VALUE = 76;
        public static final int SEVERE_T_STORM_VALUE = 9;
        public static final int SLEET_VALUE = 33;
        public static final int SMALL_CRAFT_HAZARDOUS_SEAS_VALUE = 60;
        public static final int SMALL_CRAFT_ROUGH_BAR_VALUE = 64;
        public static final int SMALL_CRAFT_VALUE = 62;
        public static final int SMALL_CRAFT_WINDS_VALUE = 63;
        public static final int SMOG_VALUE = 78;
        public static final int SNOWFALL_VALUE = 34;
        public static final int SNOW_ALERT_VALUE = 37;
        public static final int SNOW_AND_BLOWING_SNOW_VALUE = 35;
        public static final int SNOW_SQUALL_VALUE = 30;
        public static final int SPECIAL_MARINE_VALUE = 54;
        public static final int SPECIAL_WEATHER_VALUE = 84;
        public static final int SQUALL_VALUE = 55;
        public static final int STORM_SURGE_VALUE = 41;
        public static final int STORM_VALUE = 40;
        public static final int STRONG_WIND_VALUE = 56;
        public static final int TORNADO_VALUE = 1;
        public static final int TROPICAL_STORM_VALUE = 14;
        public static final int TSUNAMI_VALUE = 2;
        public static final int TYPHOON_VALUE = 5;
        public static final int WATERSPOUT_VALUE = 8;
        public static final int WEATHER_VALUE = 48;
        public static final int WIND_CHILL_VALUE = 26;
        public static final int WIND_VALUE = 59;
        public static final int WINTER_STORM_VALUE = 23;
        public static final int WINTER_WEATHER_VALUE = 32;
        public static final int WRECKHOUSE_WINDS_VALUE = 10;
        private final int value;
        private static final Internal.EnumLiteMap<AlertEnum> internalValueMap = new Internal.EnumLiteMap<AlertEnum>() { // from class: com.garmin.gcsprotos.generated.WeatherProto.AlertEnum.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public AlertEnum findValueByNumber(int i14) {
                return AlertEnum.forNumber(i14);
            }
        };
        private static final AlertEnum[] VALUES = values();

        AlertEnum(int i14) {
            this.value = i14;
        }

        public static AlertEnum forNumber(int i14) {
            switch (i14) {
                case 1:
                    return TORNADO;
                case 2:
                    return TSUNAMI;
                case 3:
                    return HURRICANE;
                case 4:
                    return EXTREME_WIND;
                case 5:
                    return TYPHOON;
                case 6:
                    return INLAND_HURRICANE;
                case 7:
                    return HURRICANE_FORCE_WIND;
                case 8:
                    return WATERSPOUT;
                case 9:
                    return SEVERE_T_STORM;
                case 10:
                    return WRECKHOUSE_WINDS;
                case 11:
                    return LES_SUETES_WIND;
                case 12:
                    return AVALANCHE;
                case 13:
                    return FLASH_FLOOD;
                case 14:
                    return TROPICAL_STORM;
                case 15:
                    return INLAND_TROPICAL_STORM;
                case 16:
                    return BLIZZARD;
                case 17:
                    return ICE_STORM;
                case 18:
                    return FREEZING_RAIN;
                case 19:
                    return DEBRIS_FLOW;
                case 20:
                    return FLASH_FREEZE;
                case 21:
                    return DUST_STORM;
                case 22:
                    return HIGH_WIND;
                case 23:
                    return WINTER_STORM;
                case 24:
                    return HEAVY_FREEZING_SPRAY;
                case 25:
                    return EXTREME_COLD;
                case 26:
                    return WIND_CHILL;
                case 27:
                    return COLD_WAVE;
                case 28:
                    return HEAVY_SNOW_ALERT;
                case 29:
                    return LAKE_EFFECT_BLOWING_SNOW;
                case 30:
                    return SNOW_SQUALL;
                case 31:
                    return LAKE_EFFECT_SNOW;
                case 32:
                    return WINTER_WEATHER;
                case 33:
                    return SLEET;
                case 34:
                    return SNOWFALL;
                case 35:
                    return SNOW_AND_BLOWING_SNOW;
                case 36:
                    return BLOWING_SNOW;
                case 37:
                    return SNOW_ALERT;
                case 38:
                    return ARCTIC_OUTFLOW;
                case 39:
                    return FREEZING_DRIZZLE;
                case 40:
                    return STORM;
                case 41:
                    return STORM_SURGE;
                case 42:
                    return RAINFALL;
                case 43:
                    return AREAL_FLOOD;
                case 44:
                    return COASTAL_FLOOD;
                case 45:
                    return LAKESHORE_FLOOD;
                case 46:
                    return EXCESSIVE_HEAT;
                case 47:
                    return HEAT;
                case 48:
                    return WEATHER;
                case 49:
                    return HIGH_HEAT_AND_HUMIDITY;
                case 50:
                    return HUMIDEX_AND_HEALTH;
                case 51:
                    return HUMIDEX;
                case 52:
                    return GALE;
                case 53:
                    return FREEZING_SPRAY;
                case 54:
                    return SPECIAL_MARINE;
                case 55:
                    return SQUALL;
                case 56:
                    return STRONG_WIND;
                case 57:
                    return LAKE_WIND;
                case 58:
                    return MARINE_WEATHER;
                case 59:
                    return WIND;
                case 60:
                    return SMALL_CRAFT_HAZARDOUS_SEAS;
                case 61:
                    return HAZARDOUS_SEAS;
                case 62:
                    return SMALL_CRAFT;
                case 63:
                    return SMALL_CRAFT_WINDS;
                case 64:
                    return SMALL_CRAFT_ROUGH_BAR;
                case 65:
                    return HIGH_WATER_LEVEL;
                case 66:
                    return ASHFALL;
                case 67:
                    return FREEZING_FOG;
                case 68:
                    return DENSE_FOG;
                case 69:
                    return DENSE_SMOKE;
                case 70:
                    return BLOWING_DUST;
                case 71:
                    return HARD_FREEZE;
                case 72:
                    return FREEZE;
                case 73:
                    return FROST;
                case 74:
                    return FIRE_WEATHER;
                case 75:
                    return FLOOD;
                case 76:
                    return RIP_TIDE;
                case 77:
                    return HIGH_SURF;
                case 78:
                    return SMOG;
                case 79:
                    return AIR_QUALITY;
                case 80:
                    return BRISK_WIND;
                case 81:
                    return AIR_STAGNATION;
                case 82:
                    return LOW_WATER;
                case 83:
                    return HYDROLOGICAL;
                case 84:
                    return SPECIAL_WEATHER;
                default:
                    return null;
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return WeatherProto.getDescriptor().getEnumTypes().get(5);
        }

        public static Internal.EnumLiteMap<AlertEnum> internalGetValueMap() {
            return internalValueMap;
        }

        public static AlertEnum valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static AlertEnum valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum AlertType implements ProtocolMessageEnum {
        ALERT_ADVISORY(0),
        ALERT_WATCH(1),
        ALERT_STORM_WARN(2),
        ALERT_WIND_WARN(3),
        ALERT_FLOOD_WARN(4),
        ALERT_WINTER_WARN(5),
        ALERT_OTHER_WARN(6);

        public static final int ALERT_ADVISORY_VALUE = 0;
        public static final int ALERT_FLOOD_WARN_VALUE = 4;
        public static final int ALERT_OTHER_WARN_VALUE = 6;
        public static final int ALERT_STORM_WARN_VALUE = 2;
        public static final int ALERT_WATCH_VALUE = 1;
        public static final int ALERT_WIND_WARN_VALUE = 3;
        public static final int ALERT_WINTER_WARN_VALUE = 5;
        private final int value;
        private static final Internal.EnumLiteMap<AlertType> internalValueMap = new Internal.EnumLiteMap<AlertType>() { // from class: com.garmin.gcsprotos.generated.WeatherProto.AlertType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public AlertType findValueByNumber(int i14) {
                return AlertType.forNumber(i14);
            }
        };
        private static final AlertType[] VALUES = values();

        AlertType(int i14) {
            this.value = i14;
        }

        public static AlertType forNumber(int i14) {
            switch (i14) {
                case 0:
                    return ALERT_ADVISORY;
                case 1:
                    return ALERT_WATCH;
                case 2:
                    return ALERT_STORM_WARN;
                case 3:
                    return ALERT_WIND_WARN;
                case 4:
                    return ALERT_FLOOD_WARN;
                case 5:
                    return ALERT_WINTER_WARN;
                case 6:
                    return ALERT_OTHER_WARN;
                default:
                    return null;
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return WeatherProto.getDescriptor().getEnumTypes().get(3);
        }

        public static Internal.EnumLiteMap<AlertType> internalGetValueMap() {
            return internalValueMap;
        }

        public static AlertType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static AlertType valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum TextSize implements ProtocolMessageEnum {
        ALL_SIZES(0),
        SMALL(1),
        MEDIUM(2),
        FULL(3);

        public static final int ALL_SIZES_VALUE = 0;
        public static final int FULL_VALUE = 3;
        public static final int MEDIUM_VALUE = 2;
        public static final int SMALL_VALUE = 1;
        private final int value;
        private static final Internal.EnumLiteMap<TextSize> internalValueMap = new Internal.EnumLiteMap<TextSize>() { // from class: com.garmin.gcsprotos.generated.WeatherProto.TextSize.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public TextSize findValueByNumber(int i14) {
                return TextSize.forNumber(i14);
            }
        };
        private static final TextSize[] VALUES = values();

        TextSize(int i14) {
            this.value = i14;
        }

        public static TextSize forNumber(int i14) {
            if (i14 == 0) {
                return ALL_SIZES;
            }
            if (i14 == 1) {
                return SMALL;
            }
            if (i14 == 2) {
                return MEDIUM;
            }
            if (i14 != 3) {
                return null;
            }
            return FULL;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return WeatherProto.getDescriptor().getEnumTypes().get(1);
        }

        public static Internal.EnumLiteMap<TextSize> internalGetValueMap() {
            return internalValueMap;
        }

        public static TextSize valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static TextSize valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum WeatherIcon implements ProtocolMessageEnum {
        CLEAR(0),
        PARTLY_CLOUDY(1),
        MOSTLY_CLOUDY(2),
        RAIN(3),
        SNOW(4),
        WINDY(5),
        THUNDERSTORMS(6),
        WINTRY_MIX(7),
        FOG(8),
        HAZY(11),
        HAIL(12),
        SCATTERED_SHOWERS(13),
        SCATTERED_THUNDERSTORMS(14),
        UNKNOWN_PRECIPITATION(15),
        LIGHT_RAIN(16),
        HEAVY_RAIN(17),
        LIGHT_SNOW(18),
        HEAVY_SNOW(19),
        LIGHT_RAIN_SNOW(20),
        HEAVY_RAIN_SNOW(21),
        CLOUDY(22);

        public static final int CLEAR_VALUE = 0;
        public static final int CLOUDY_VALUE = 22;
        public static final int FOG_VALUE = 8;
        public static final int HAIL_VALUE = 12;
        public static final int HAZY_VALUE = 11;
        public static final int HEAVY_RAIN_SNOW_VALUE = 21;
        public static final int HEAVY_RAIN_VALUE = 17;
        public static final int HEAVY_SNOW_VALUE = 19;
        public static final int LIGHT_RAIN_SNOW_VALUE = 20;
        public static final int LIGHT_RAIN_VALUE = 16;
        public static final int LIGHT_SNOW_VALUE = 18;
        public static final int MOSTLY_CLOUDY_VALUE = 2;
        public static final int PARTLY_CLOUDY_VALUE = 1;
        public static final int RAIN_VALUE = 3;
        public static final int SCATTERED_SHOWERS_VALUE = 13;
        public static final int SCATTERED_THUNDERSTORMS_VALUE = 14;
        public static final int SNOW_VALUE = 4;
        public static final int THUNDERSTORMS_VALUE = 6;
        public static final int UNKNOWN_PRECIPITATION_VALUE = 15;
        public static final int WINDY_VALUE = 5;
        public static final int WINTRY_MIX_VALUE = 7;
        private final int value;
        private static final Internal.EnumLiteMap<WeatherIcon> internalValueMap = new Internal.EnumLiteMap<WeatherIcon>() { // from class: com.garmin.gcsprotos.generated.WeatherProto.WeatherIcon.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public WeatherIcon findValueByNumber(int i14) {
                return WeatherIcon.forNumber(i14);
            }
        };
        private static final WeatherIcon[] VALUES = values();

        WeatherIcon(int i14) {
            this.value = i14;
        }

        public static WeatherIcon forNumber(int i14) {
            switch (i14) {
                case 0:
                    return CLEAR;
                case 1:
                    return PARTLY_CLOUDY;
                case 2:
                    return MOSTLY_CLOUDY;
                case 3:
                    return RAIN;
                case 4:
                    return SNOW;
                case 5:
                    return WINDY;
                case 6:
                    return THUNDERSTORMS;
                case 7:
                    return WINTRY_MIX;
                case 8:
                    return FOG;
                case 9:
                case 10:
                default:
                    return null;
                case 11:
                    return HAZY;
                case 12:
                    return HAIL;
                case 13:
                    return SCATTERED_SHOWERS;
                case 14:
                    return SCATTERED_THUNDERSTORMS;
                case 15:
                    return UNKNOWN_PRECIPITATION;
                case 16:
                    return LIGHT_RAIN;
                case 17:
                    return HEAVY_RAIN;
                case 18:
                    return LIGHT_SNOW;
                case 19:
                    return HEAVY_SNOW;
                case 20:
                    return LIGHT_RAIN_SNOW;
                case 21:
                    return HEAVY_RAIN_SNOW;
                case 22:
                    return CLOUDY;
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return WeatherProto.getDescriptor().getEnumTypes().get(2);
        }

        public static Internal.EnumLiteMap<WeatherIcon> internalGetValueMap() {
            return internalValueMap;
        }

        public static WeatherIcon valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static WeatherIcon valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum WeatherSeverity implements ProtocolMessageEnum {
        UNKNOWN(0),
        WARNING(1),
        WATCH(2),
        ADVISORY(3),
        STATEMENT(4);

        public static final int ADVISORY_VALUE = 3;
        public static final int STATEMENT_VALUE = 4;
        public static final int UNKNOWN_VALUE = 0;
        public static final int WARNING_VALUE = 1;
        public static final int WATCH_VALUE = 2;
        private final int value;
        private static final Internal.EnumLiteMap<WeatherSeverity> internalValueMap = new Internal.EnumLiteMap<WeatherSeverity>() { // from class: com.garmin.gcsprotos.generated.WeatherProto.WeatherSeverity.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public WeatherSeverity findValueByNumber(int i14) {
                return WeatherSeverity.forNumber(i14);
            }
        };
        private static final WeatherSeverity[] VALUES = values();

        WeatherSeverity(int i14) {
            this.value = i14;
        }

        public static WeatherSeverity forNumber(int i14) {
            if (i14 == 0) {
                return UNKNOWN;
            }
            if (i14 == 1) {
                return WARNING;
            }
            if (i14 == 2) {
                return WATCH;
            }
            if (i14 == 3) {
                return ADVISORY;
            }
            if (i14 != 4) {
                return null;
            }
            return STATEMENT;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return WeatherProto.getDescriptor().getEnumTypes().get(4);
        }

        public static Internal.EnumLiteMap<WeatherSeverity> internalGetValueMap() {
            return internalValueMap;
        }

        public static WeatherSeverity valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static WeatherSeverity valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum WeatherStatus implements ProtocolMessageEnum {
        OK(0);

        public static final int OK_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<WeatherStatus> internalValueMap = new Internal.EnumLiteMap<WeatherStatus>() { // from class: com.garmin.gcsprotos.generated.WeatherProto.WeatherStatus.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public WeatherStatus findValueByNumber(int i14) {
                return WeatherStatus.forNumber(i14);
            }
        };
        private static final WeatherStatus[] VALUES = values();

        WeatherStatus(int i14) {
            this.value = i14;
        }

        public static WeatherStatus forNumber(int i14) {
            if (i14 != 0) {
                return null;
            }
            return OK;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return WeatherProto.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<WeatherStatus> internalGetValueMap() {
            return internalValueMap;
        }

        public static WeatherStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static WeatherStatus valueOf(int i14) {
            return forNumber(i14);
        }
    }
}
