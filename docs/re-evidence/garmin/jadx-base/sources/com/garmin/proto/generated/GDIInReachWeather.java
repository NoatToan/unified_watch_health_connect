package com.garmin.proto.generated;

import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.f3;
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

/* JADX INFO: loaded from: classes5.dex */
public final class GDIInReachWeather {
    public static final int CONFIG_EXT_FIELD_NUMBER = 103;
    public static final int ITEM_REF_EXT_FIELD_NUMBER = 103;
    public static final int STATUS_EXT_FIELD_NUMBER = 103;
    public static final GeneratedMessage.GeneratedExtension<GDIGenericItemTransferProto.DataTypeConfig, DataTypeConfigExt> configExt;
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachWeather_CapabilitiesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachWeather_CapabilitiesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachWeather_CapabilitiesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachWeather_CapabilitiesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachWeather_Capabilities_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachWeather_Capabilities_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachWeather_DataTypeConfigExt_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachWeather_DataTypeConfigExt_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachWeather_DataTypeStatusExt_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachWeather_DataTypeStatusExt_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachWeather_ForecastDaySummary_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachWeather_ForecastDaySummary_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachWeather_ForecastDetailQuery_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachWeather_ForecastDetailQuery_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachWeather_ForecastStatusNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachWeather_ForecastStatusNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachWeather_Forecast_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachWeather_Forecast_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachWeather_GenericItemReferenceExt_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachWeather_GenericItemReferenceExt_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachWeather_InReachWeatherService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachWeather_InReachWeatherService_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachWeather_LandForecastDetail_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachWeather_LandForecastDetail_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachWeather_LocationModifiedNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachWeather_LocationModifiedNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachWeather_Location_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachWeather_Location_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachWeather_LocationsAndForecastsQuery_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachWeather_LocationsAndForecastsQuery_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachWeather_MarineForecastDetail_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachWeather_MarineForecastDetail_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachWeather_RequestForecastRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachWeather_RequestForecastRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachWeather_RequestForecastResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachWeather_RequestForecastResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachWeather_SubscribeRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachWeather_SubscribeRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachWeather_SubscribeResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachWeather_SubscribeResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachWeather_SyncRequestInfo_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachWeather_SyncRequestInfo_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachWeather_SyncRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachWeather_SyncRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InReachWeather_SyncResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InReachWeather_SyncResponse_fieldAccessorTable;
    public static final GeneratedMessage.GeneratedExtension<GDIGenericItemTransferProto.GenericItemReference, GenericItemReferenceExt> itemRefExt;
    public static final GeneratedMessage.GeneratedExtension<GDIGenericItemTransferProto.DataTypeStatus, DataTypeStatusExt> statusExt;

    public interface CapabilitiesOrBuilder extends MessageOrBuilder {
        Forecast.Provider getForecastProviders(int i14);

        int getForecastProvidersCount();

        List<Forecast.Provider> getForecastProvidersList();

        Forecast.Type getForecastTypes(int i14);

        int getForecastTypesCount();

        List<Forecast.Type> getForecastTypesList();

        int getMaxLocationCount();

        int getMaxProtocolVersion();

        Forecast.Type getSyncForecastTypes(int i14);

        int getSyncForecastTypesCount();

        List<Forecast.Type> getSyncForecastTypesList();

        boolean hasMaxLocationCount();

        boolean hasMaxProtocolVersion();
    }

    public interface CapabilitiesRequestOrBuilder extends MessageOrBuilder {
        Capabilities getCapabilities();

        CapabilitiesOrBuilder getCapabilitiesOrBuilder();

        boolean hasCapabilities();
    }

    public interface CapabilitiesResponseOrBuilder extends MessageOrBuilder {
        Capabilities getCapabilities();

        CapabilitiesOrBuilder getCapabilitiesOrBuilder();

        boolean hasCapabilities();
    }

    public interface DataTypeConfigExtOrBuilder extends MessageOrBuilder {
        ForecastDetailQuery getForecastDetailQuery();

        ForecastDetailQueryOrBuilder getForecastDetailQueryOrBuilder();

        LocationsAndForecastsQuery getLocsAndForecastsQuery();

        LocationsAndForecastsQueryOrBuilder getLocsAndForecastsQueryOrBuilder();

        SyncRequestInfo getRequestInfo();

        SyncRequestInfoOrBuilder getRequestInfoOrBuilder();

        boolean hasForecastDetailQuery();

        boolean hasLocsAndForecastsQuery();

        boolean hasRequestInfo();
    }

    public interface DataTypeStatusExtOrBuilder extends MessageOrBuilder {
        DataTypeStatusExt.Status getStatus();

        boolean hasStatus();
    }

    public interface ForecastDaySummaryOrBuilder extends MessageOrBuilder {
        ForecastDayOfWeek getDayOfWeek();

        float getHighTempC();

        WeatherIcon getIcon();

        float getLowTempC();

        int getPrecipAmountMm();

        int getPrecipChancePercent();

        Precipitation getPrecipType();

        int getSnowfallAmountMm();

        int getStartTime();

        int getSunriseTime();

        int getSunsetTime();

        boolean hasDayOfWeek();

        boolean hasHighTempC();

        boolean hasIcon();

        boolean hasLowTempC();

        boolean hasPrecipAmountMm();

        boolean hasPrecipChancePercent();

        boolean hasPrecipType();

        boolean hasSnowfallAmountMm();

        boolean hasStartTime();

        boolean hasSunriseTime();

        boolean hasSunsetTime();
    }

    public interface ForecastDetailQueryOrBuilder extends MessageOrBuilder {
        int getDetailTimeBegin();

        int getDetailTimeEnd();

        GDIDataTypes.UUID getForecastUuid();

        GDIDataTypes.UUIDOrBuilder getForecastUuidOrBuilder();

        boolean hasDetailTimeBegin();

        boolean hasDetailTimeEnd();

        boolean hasForecastUuid();
    }

    public interface ForecastOrBuilder extends MessageOrBuilder {
        int getCreatedTime();

        int getEndTime();

        int getIssuedTime();

        GDIDataTypes.UUID getLocationUuid();

        GDIDataTypes.UUIDOrBuilder getLocationUuidOrBuilder();

        int getModifiedTime();

        GDIDataTypes.ScPoint getPoint();

        GDIDataTypes.ScPointOrBuilder getPointOrBuilder();

        Forecast.Provider getProvider();

        boolean getRead();

        Forecast.RequestError getRequestError();

        Forecast.Status getStatus();

        Forecast.Type getType();

        GDIDataTypes.UUID getUuid();

        GDIDataTypes.UUIDOrBuilder getUuidOrBuilder();

        int getZoneOffset1Minutes();

        int getZoneOffset2Minutes();

        int getZoneOffset2StartTime();

        boolean hasCreatedTime();

        boolean hasEndTime();

        boolean hasIssuedTime();

        boolean hasLocationUuid();

        boolean hasModifiedTime();

        boolean hasPoint();

        boolean hasProvider();

        boolean hasRead();

        boolean hasRequestError();

        boolean hasStatus();

        boolean hasType();

        boolean hasUuid();

        boolean hasZoneOffset1Minutes();

        boolean hasZoneOffset2Minutes();

        boolean hasZoneOffset2StartTime();
    }

    public interface ForecastStatusNotificationOrBuilder extends MessageOrBuilder {
        Forecast getForecasts(int i14);

        int getForecastsCount();

        List<Forecast> getForecastsList();

        ForecastOrBuilder getForecastsOrBuilder(int i14);

        List<? extends ForecastOrBuilder> getForecastsOrBuilderList();
    }

    public interface GenericItemReferenceExtOrBuilder extends MessageOrBuilder {
        ForecastDaySummary getDaySummary();

        ForecastDaySummaryOrBuilder getDaySummaryOrBuilder();

        Forecast getForecast();

        ForecastOrBuilder getForecastOrBuilder();

        LandForecastDetail getLandDetail();

        LandForecastDetailOrBuilder getLandDetailOrBuilder();

        Location getLocation();

        LocationOrBuilder getLocationOrBuilder();

        MarineForecastDetail getMarineDetail();

        MarineForecastDetailOrBuilder getMarineDetailOrBuilder();

        boolean hasDaySummary();

        boolean hasForecast();

        boolean hasLandDetail();

        boolean hasLocation();

        boolean hasMarineDetail();
    }

    public interface InReachWeatherServiceOrBuilder extends MessageOrBuilder {
        CapabilitiesRequest getCapabilitiesRequest();

        CapabilitiesRequestOrBuilder getCapabilitiesRequestOrBuilder();

        CapabilitiesResponse getCapabilitiesResponse();

        CapabilitiesResponseOrBuilder getCapabilitiesResponseOrBuilder();

        ForecastStatusNotification getForecastStatusNotification();

        ForecastStatusNotificationOrBuilder getForecastStatusNotificationOrBuilder();

        LocationModifiedNotification getLocationModifiedNotification();

        LocationModifiedNotificationOrBuilder getLocationModifiedNotificationOrBuilder();

        RequestForecastRequest getRequestForecastRequest();

        RequestForecastRequestOrBuilder getRequestForecastRequestOrBuilder();

        RequestForecastResponse getRequestForecastResponse();

        RequestForecastResponseOrBuilder getRequestForecastResponseOrBuilder();

        SubscribeRequest getSubscribeRequest();

        SubscribeRequestOrBuilder getSubscribeRequestOrBuilder();

        SubscribeResponse getSubscribeResponse();

        SubscribeResponseOrBuilder getSubscribeResponseOrBuilder();

        SyncRequest getSyncRequest();

        SyncRequestOrBuilder getSyncRequestOrBuilder();

        SyncResponse getSyncResponse();

        SyncResponseOrBuilder getSyncResponseOrBuilder();

        boolean hasCapabilitiesRequest();

        boolean hasCapabilitiesResponse();

        boolean hasForecastStatusNotification();

        boolean hasLocationModifiedNotification();

        boolean hasRequestForecastRequest();

        boolean hasRequestForecastResponse();

        boolean hasSubscribeRequest();

        boolean hasSubscribeResponse();

        boolean hasSyncRequest();

        boolean hasSyncResponse();
    }

    public interface LandForecastDetailOrBuilder extends MessageOrBuilder {
        ForecastAirQuality getAirQuality();

        float getCloudCeilingHeightM();

        int getCloudCoverPercent();

        int getDetailTime();

        float getDewPointC();

        float getFeelsLikeTempC();

        float getGustSpeedMps();

        int getHumidityPercent();

        WeatherIcon getIcon();

        boolean getIsNight();

        int getPrecipAmountMm();

        int getPrecipChancePercent();

        Precipitation getPrecipType();

        float getPressureMillibar();

        int getSnowfallAmountMm();

        float getTemperatureC();

        float getUvIndex();

        float getVisibilityMeters();

        int getWindBearingDegrees();

        float getWindSpeedMps();

        boolean hasAirQuality();

        boolean hasCloudCeilingHeightM();

        boolean hasCloudCoverPercent();

        boolean hasDetailTime();

        boolean hasDewPointC();

        boolean hasFeelsLikeTempC();

        boolean hasGustSpeedMps();

        boolean hasHumidityPercent();

        boolean hasIcon();

        boolean hasIsNight();

        boolean hasPrecipAmountMm();

        boolean hasPrecipChancePercent();

        boolean hasPrecipType();

        boolean hasPressureMillibar();

        boolean hasSnowfallAmountMm();

        boolean hasTemperatureC();

        boolean hasUvIndex();

        boolean hasVisibilityMeters();

        boolean hasWindBearingDegrees();

        boolean hasWindSpeedMps();
    }

    public interface LocationModifiedNotificationOrBuilder extends MessageOrBuilder {
        Location getLocation();

        LocationOrBuilder getLocationOrBuilder();

        boolean hasLocation();
    }

    public interface LocationOrBuilder extends MessageOrBuilder {
        boolean getDeleted();

        int getModifiedTime();

        String getName();

        ByteString getNameBytes();

        GDIDataTypes.ScPoint getPoint();

        GDIDataTypes.ScPointOrBuilder getPointOrBuilder();

        GDIDataTypes.UUID getUuid();

        GDIDataTypes.UUIDOrBuilder getUuidOrBuilder();

        boolean hasDeleted();

        boolean hasModifiedTime();

        boolean hasName();

        boolean hasPoint();

        boolean hasUuid();
    }

    public interface LocationsAndForecastsQueryOrBuilder extends MessageOrBuilder {
        int getModifiedAfter();

        boolean hasModifiedAfter();
    }

    public interface MarineForecastDetailOrBuilder extends MessageOrBuilder {
        int getCurrentBearingDegrees();

        float getCurrentSpeedMps();

        int getDetailTime();

        float getGustSpeedMps();

        float getVisibilityMeters();

        int getWaveBearingDegrees();

        float getWaveHeightMeters();

        int getWavePeriodSeconds();

        int getWindBearingDegrees();

        float getWindSpeedMps();

        boolean hasCurrentBearingDegrees();

        boolean hasCurrentSpeedMps();

        boolean hasDetailTime();

        boolean hasGustSpeedMps();

        boolean hasVisibilityMeters();

        boolean hasWaveBearingDegrees();

        boolean hasWaveHeightMeters();

        boolean hasWavePeriodSeconds();

        boolean hasWindBearingDegrees();

        boolean hasWindSpeedMps();
    }

    public interface RequestForecastRequestOrBuilder extends MessageOrBuilder {
        Forecast.Type getForecastTypes(int i14);

        int getForecastTypesCount();

        List<Forecast.Type> getForecastTypesList();

        Location getLocation();

        LocationOrBuilder getLocationOrBuilder();

        boolean hasLocation();
    }

    public interface RequestForecastResponseOrBuilder extends MessageOrBuilder {
        Forecast getForecasts(int i14);

        int getForecastsCount();

        List<Forecast> getForecastsList();

        ForecastOrBuilder getForecastsOrBuilder(int i14);

        List<? extends ForecastOrBuilder> getForecastsOrBuilderList();

        RequestForecastResponse.Status getStatus();

        boolean hasStatus();
    }

    public interface SubscribeRequestOrBuilder extends MessageOrBuilder {
        boolean getWantForecastStatus();

        boolean getWantLocationModified();

        boolean hasWantForecastStatus();

        boolean hasWantLocationModified();
    }

    public interface SubscribeResponseOrBuilder extends MessageOrBuilder {
        SubscribeResponse.Status getStatus();

        boolean hasStatus();
    }

    public interface SyncRequestInfoOrBuilder extends MessageOrBuilder {
        GDIDataTypes.UUID getAppUuid();

        GDIDataTypes.UUIDOrBuilder getAppUuidOrBuilder();

        int getProtocolVersion();

        SyncRequestInfo.SyncType getSyncType();

        boolean hasAppUuid();

        boolean hasProtocolVersion();

        boolean hasSyncType();
    }

    public interface SyncRequestOrBuilder extends MessageOrBuilder {
        int getModifiedTime();

        SyncRequestInfo getRequestInfo();

        SyncRequestInfoOrBuilder getRequestInfoOrBuilder();

        boolean hasModifiedTime();

        boolean hasRequestInfo();
    }

    public interface SyncResponseOrBuilder extends MessageOrBuilder {
        SyncResponse.Status getStatus();

        boolean hasStatus();
    }

    static {
        GeneratedMessage.GeneratedExtension<GDIGenericItemTransferProto.DataTypeConfig, DataTypeConfigExt> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(DataTypeConfigExt.class, DataTypeConfigExt.getDefaultInstance());
        configExt = generatedExtensionNewFileScopedGeneratedExtension;
        GeneratedMessage.GeneratedExtension<GDIGenericItemTransferProto.DataTypeStatus, DataTypeStatusExt> generatedExtensionNewFileScopedGeneratedExtension2 = GeneratedMessage.newFileScopedGeneratedExtension(DataTypeStatusExt.class, DataTypeStatusExt.getDefaultInstance());
        statusExt = generatedExtensionNewFileScopedGeneratedExtension2;
        GeneratedMessage.GeneratedExtension<GDIGenericItemTransferProto.GenericItemReference, GenericItemReferenceExt> generatedExtensionNewFileScopedGeneratedExtension3 = GeneratedMessage.newFileScopedGeneratedExtension(GenericItemReferenceExt.class, GenericItemReferenceExt.getDefaultInstance());
        itemRefExt = generatedExtensionNewFileScopedGeneratedExtension3;
        descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0017GDIInReachWeather.proto\u0012\u0018GDI.Proto.InReachWeather\u001a\u0012GDIDataTypes.proto\u001a\u001cGDIGenericItemTransfer.proto\"¥\u0006\n\u0015InReachWeatherService\u0012K\n\u0014capabilities_request\u0018\u0001 \u0001(\u000b2-.GDI.Proto.InReachWeather.CapabilitiesRequest\u0012M\n\u0015capabilities_response\u0018\u0002 \u0001(\u000b2..GDI.Proto.InReachWeather.CapabilitiesResponse\u0012R\n\u0018request_forecast_request\u0018\u0003 \u0001(\u000b20.GDI.Proto.InReachWeather.RequestForecastRequest\u0012T\n\u0019request_forecast_response\u0018\u0004 \u0001(\u000b21.GDI.Proto.InReachWeather.RequestForecastResponse\u0012;\n\fsync_request\u0018\u0005 \u0001(\u000b2%.GDI.Proto.InReachWeather.SyncRequest\u0012=\n\rsync_response\u0018\u0006 \u0001(\u000b2&.GDI.Proto.InReachWeather.SyncResponse\u0012E\n\u0011subscribe_request\u0018\u0007 \u0001(\u000b2*.GDI.Proto.InReachWeather.SubscribeRequest\u0012G\n\u0012subscribe_response\u0018\b \u0001(\u000b2+.GDI.Proto.InReachWeather.SubscribeResponse\u0012^\n\u001elocation_modified_notification\u0018\t \u0001(\u000b26.GDI.Proto.InReachWeather.LocationModifiedNotification\u0012Z\n\u001cforecast_status_notification\u0018\n \u0001(\u000b24.GDI.Proto.InReachWeather.ForecastStatusNotification\"\u009b\u0002\n\fCapabilities\u0012\u001f\n\u0014max_protocol_version\u0018\u0001 \u0001(\r:\u00011\u0012?\n\u000eforecast_types\u0018\u0002 \u0003(\u000e2'.GDI.Proto.InReachWeather.Forecast.Type\u0012G\n\u0012forecast_providers\u0018\u0003 \u0003(\u000e2+.GDI.Proto.InReachWeather.Forecast.Provider\u0012\u001a\n\u0012max_location_count\u0018\u0004 \u0001(\r\u0012D\n\u0013sync_forecast_types\u0018\u0005 \u0003(\u000e2'.GDI.Proto.InReachWeather.Forecast.Type\"\u009d\u0001\n\bLocation\u0012'\n\u0004uuid\u0018\u0001 \u0001(\u000b2\u0019.GDI.Proto.DataTypes.UUID\u0012\u0016\n\u0007deleted\u0018\u0002 \u0001(\b:\u0005false\u0012\u0015\n\rmodified_time\u0018\u0003 \u0001(\u0007\u0012+\n\u0005point\u0018\u0004 \u0001(\u000b2\u001c.GDI.Proto.DataTypes.ScPoint\u0012\f\n\u0004name\u0018\u0005 \u0001(\t\"ö\b\n\bForecast\u0012'\n\u0004uuid\u0018\u0001 \u0002(\u000b2\u0019.GDI.Proto.DataTypes.UUID\u00120\n\rlocation_uuid\u0018\u0002 \u0001(\u000b2\u0019.GDI.Proto.DataTypes.UUID\u0012+\n\u0005point\u0018\u0003 \u0001(\u000b2\u001c.GDI.Proto.DataTypes.ScPoint\u00125\n\u0004type\u0018\u0004 \u0001(\u000e2'.GDI.Proto.InReachWeather.Forecast.Type\u0012=\n\bprovider\u0018\u0005 \u0001(\u000e2+.GDI.Proto.InReachWeather.Forecast.Provider\u00129\n\u0006status\u0018\u0006 \u0001(\u000e2).GDI.Proto.InReachWeather.Forecast.Status\u0012F\n\rrequest_error\u0018\u0007 \u0001(\u000e2/.GDI.Proto.InReachWeather.Forecast.RequestError\u0012\f\n\u0004read\u0018\b \u0001(\b\u0012\u0015\n\rmodified_time\u0018\t \u0001(\u0007\u0012\u0013\n\u000bissued_time\u0018\n \u0001(\u0007\u0012\u0010\n\bend_time\u0018\u000b \u0001(\u0007\u0012\u001c\n\u0014zone_offset1_minutes\u0018\f \u0001(\u0011\u0012\u001f\n\u0017zone_offset2_start_time\u0018\r \u0001(\u0007\u0012\u001c\n\u0014zone_offset2_minutes\u0018\u000e \u0001(\u0011\u0012\u0014\n\fcreated_time\u0018\u000f \u0001(\u0007\"k\n\u0004Type\u0012\u0019\n\u0015FORECAST_TYPE_INVALID\u0010\u0000\u0012\u0011\n\rINREACH_BASIC\u0010\u0001\u0012\u0013\n\u000fINREACH_PREMIUM\u0010\u0002\u0012\u0012\n\u000eINREACH_MARINE\u0010\u0003\u0012\f\n\bWBL_LAND\u0010\u0004\"Q\n\bProvider\u0012\u001d\n\u0019FORECAST_PROVIDER_UNKNOWN\u0010\u0000\u0012\f\n\bDARK_SKY\u0010\u0001\u0012\t\n\u0005OCENS\u0010\u0002\u0012\r\n\tMETEOBLUE\u0010\u0003\"~\n\u0006Status\u0012\u001b\n\u0017FORECAST_STATUS_UNKNOWN\u0010\u0000\u0012\u0011\n\rREQUEST_ERROR\u0010\u0001\u0012\u0013\n\u000fWAITING_FOR_GPS\u0010\u0002\u0012\n\n\u0006QUEUED\u0010\u0003\u0012\u0015\n\u0011WAITING_FOR_REPLY\u0010\u0004\u0012\f\n\bRECEIVED\u0010\u0005\"é\u0001\n\fRequestError\u0012\"\n\u001eFORECAST_REQUEST_ERROR_UNKNOWN\u0010\u0000\u0012\u0019\n\u0015GENERIC_REQUEST_ERROR\u0010\u0001\u0012\u0014\n\u0010REQUEST_NOT_SENT\u0010\u0002\u0012\u0014\n\u0010RESPONSE_TIMEOUT\u0010\u0003\u0012\u000f\n\u000bNO_COVERAGE\u0010\u0004\u0012\u0010\n\fDECODE_ERROR\u0010\u0005\u0012\u001c\n\u0018SERVER_CONNECTION_FAILED\u0010\u0006\u0012\u0010\n\fSERVER_ERROR\u0010\u0007\u0012\u001b\n\u0017SERVER_RETRIES_EXCEEDED\u0010\b\"\u0086\u0003\n\u0012ForecastDaySummary\u0012\u0012\n\nstart_time\u0018\u0001 \u0002(\u0007\u00123\n\u0004icon\u0018\u0002 \u0001(\u000e2%.GDI.Proto.InReachWeather.WeatherIcon\u0012\u0013\n\u000bhigh_temp_c\u0018\u0003 \u0001(\u0002\u0012\u0012\n\nlow_temp_c\u0018\u0004 \u0001(\u0002\u0012<\n\u000bprecip_type\u0018\u0005 \u0001(\u000e2'.GDI.Proto.InReachWeather.Precipitation\u0012\u001d\n\u0015precip_chance_percent\u0018\u0006 \u0001(\r\u0012\u0018\n\u0010precip_amount_mm\u0018\u0007 \u0001(\r\u0012\u001a\n\u0012snowfall_amount_mm\u0018\b \u0001(\r\u0012@\n\u000bday_of_week\u0018\t \u0001(\u000e2+.GDI.Proto.InReachWeather.ForecastDayOfWeek\u0012\u0014\n\fsunrise_time\u0018\n \u0001(\u0007\u0012\u0013\n\u000bsunset_time\u0018\u000b \u0001(\u0007\"ú\u0004\n\u0012LandForecastDetail\u0012\u0013\n\u000bdetail_time\u0018\u0001 \u0002(\u0007\u00123\n\u0004icon\u0018\u0002 \u0001(\u000e2%.GDI.Proto.InReachWeather.WeatherIcon\u0012\u0015\n\rtemperature_c\u0018\u0003 \u0001(\u0002\u0012\u0019\n\u0011feels_like_temp_c\u0018\u0004 \u0001(\u0002\u0012\u0019\n\u0011pressure_millibar\u0018\u0005 \u0001(\u0002\u0012\u0016\n\u000ewind_speed_mps\u0018\u0006 \u0001(\u0002\u0012\u0016\n\u000egust_speed_mps\u0018\u0007 \u0001(\u0002\u0012\u001c\n\u0014wind_bearing_degrees\u0018\b \u0001(\r\u0012\u0018\n\u0010humidity_percent\u0018\t \u0001(\r\u0012\u001b\n\u0013cloud_cover_percent\u0018\n \u0001(\r\u0012<\n\u000bprecip_type\u0018\u000b \u0001(\u000e2'.GDI.Proto.InReachWeather.Precipitation\u0012\u001d\n\u0015precip_chance_percent\u0018\f \u0001(\r\u0012\u0018\n\u0010precip_amount_mm\u0018\r \u0001(\r\u0012\u001a\n\u0012snowfall_amount_mm\u0018\u000e \u0001(\r\u0012\u0010\n\buv_index\u0018\u000f \u0001(\u0002\u0012\u0013\n\u000bdew_point_c\u0018\u0010 \u0001(\u0002\u0012A\n\u000bair_quality\u0018\u0011 \u0001(\u000e2,.GDI.Proto.InReachWeather.ForecastAirQuality\u0012\u0019\n\u0011visibility_meters\u0018\u0012 \u0001(\u0002\u0012\u0010\n\bis_night\u0018\u0013 \u0001(\b\u0012\u001e\n\u0016cloud_ceiling_height_m\u0018\u0014 \u0001(\u0002\"§\u0002\n\u0014MarineForecastDetail\u0012\u0013\n\u000bdetail_time\u0018\u0001 \u0002(\u0007\u0012\u0019\n\u0011visibility_meters\u0018\u0002 \u0001(\u0002\u0012\u0016\n\u000ewind_speed_mps\u0018\u0003 \u0001(\u0002\u0012\u0016\n\u000egust_speed_mps\u0018\u0004 \u0001(\u0002\u0012\u001c\n\u0014wind_bearing_degrees\u0018\u0005 \u0001(\r\u0012\u001f\n\u0017current_bearing_degrees\u0018\u0006 \u0001(\r\u0012\u0019\n\u0011current_speed_mps\u0018\u0007 \u0001(\u0002\u0012\u001c\n\u0014wave_bearing_degrees\u0018\b \u0001(\r\u0012\u001a\n\u0012wave_height_meters\u0018\t \u0001(\u0002\u0012\u001b\n\u0013wave_period_seconds\u0018\n \u0001(\r\"S\n\u0013CapabilitiesRequest\u0012<\n\fcapabilities\u0018\u0001 \u0001(\u000b2&.GDI.Proto.InReachWeather.Capabilities\"T\n\u0014CapabilitiesResponse\u0012<\n\fcapabilities\u0018\u0001 \u0001(\u000b2&.GDI.Proto.InReachWeather.Capabilities\"\u008f\u0001\n\u0016RequestForecastRequest\u00124\n\blocation\u0018\u0001 \u0001(\u000b2\".GDI.Proto.InReachWeather.Location\u0012?\n\u000eforecast_types\u0018\u0002 \u0003(\u000e2'.GDI.Proto.InReachWeather.Forecast.Type\"·\u0004\n\u0017RequestForecastResponse\u0012H\n\u0006status\u0018\u0001 \u0002(\u000e28.GDI.Proto.InReachWeather.RequestForecastResponse.Status\u00125\n\tforecasts\u0018\u0002 \u0003(\u000b2\".GDI.Proto.InReachWeather.Forecast\"\u009a\u0003\n\u0006Status\u0012\u0012\n\u000eUNKNOWN_STATUS\u0010\u0000\u0012\u0006\n\u0002OK\u0010\u0001\u0012\u0011\n\rGENERIC_ERROR\u0010\u0002\u0012\u0013\n\u000fNOT_IMPLEMENTED\u0010\u0003\u0012\u0011\n\rNOT_ACTIVATED\u0010\u0004\u0012\u0014\n\u0010DELETED_LOCATION\u0010\u0005\u0012\u001d\n\u0019UNSUPPORTED_FORECAST_TYPE\u0010\u0006\u0012\u001c\n\u0018EXCLUSIVE_FORECAST_TYPES\u0010\u0007\u0012\u001a\n\u0016LOCATION_LIMIT_REACHED\u0010\b\u0012\u001b\n\u0017DUPLICATE_FORECAST_TYPE\u0010\t\u0012\u001f\n\u001bLAND_FORECAST_TYPE_REQUIRED\u0010\n\u0012\u001e\n\u001aFAILED_TO_GET_GPS_POSITION\u0010\u000b\u0012\u001b\n\u0017LOCATION_FIELDS_MISSING\u0010\f\u0012\u001d\n\u0019FAILED_TO_CREATE_LOCATION\u0010\r\u0012\u0017\n\u0013COORDINATES_MISSING\u0010\u000e\u0012\u0017\n\u0013UNSUPPORTED_BY_PLAN\u0010\u000f\"Ö\u0001\n\u000fSyncRequestInfo\u0012\u001b\n\u0010protocol_version\u0018\u0001 \u0001(\r:\u00011\u0012+\n\bapp_uuid\u0018\u0002 \u0001(\u000b2\u0019.GDI.Proto.DataTypes.UUID\u0012R\n\tsync_type\u0018\u0003 \u0001(\u000e22.GDI.Proto.InReachWeather.SyncRequestInfo.SyncType:\u000bINCREMENTAL\"%\n\bSyncType\u0012\b\n\u0004FULL\u0010\u0001\u0012\u000f\n\u000bINCREMENTAL\u0010\u0002\"e\n\u000bSyncRequest\u0012?\n\frequest_info\u0018\u0001 \u0001(\u000b2).GDI.Proto.InReachWeather.SyncRequestInfo\u0012\u0015\n\rmodified_time\u0018\u0002 \u0001(\u0007\"Õ\u0001\n\fSyncResponse\u0012=\n\u0006status\u0018\u0001 \u0002(\u000e2-.GDI.Proto.InReachWeather.SyncResponse.Status\"\u0085\u0001\n\u0006Status\u0012\u0012\n\u000eUNKNOWN_STATUS\u0010\u0000\u0012\u0006\n\u0002OK\u0010\u0001\u0012\u000e\n\nUP_TO_DATE\u0010\u0002\u0012\u0011\n\rGENERIC_ERROR\u0010\u0003\u0012\b\n\u0004BUSY\u0010\u0004\u0012 \n\u001cUNSUPPORTED_PROTOCOL_VERSION\u0010\u0005\u0012\u0010\n\fMISSING_INFO\u0010\u0006\"^\n\u0010SubscribeRequest\u0012%\n\u0016want_location_modified\u0018\u0001 \u0001(\b:\u0005false\u0012#\n\u0014want_forecast_status\u0018\u0002 \u0001(\b:\u0005false\"\u0090\u0001\n\u0011SubscribeResponse\u0012B\n\u0006status\u0018\u0001 \u0002(\u000e22.GDI.Proto.InReachWeather.SubscribeResponse.Status\"7\n\u0006Status\u0012\u0012\n\u000eUNKNOWN_STATUS\u0010\u0000\u0012\u0006\n\u0002OK\u0010\u0001\u0012\u0011\n\rGENERIC_ERROR\u0010\u0002\"T\n\u001cLocationModifiedNotification\u00124\n\blocation\u0018\u0001 \u0001(\u000b2\".GDI.Proto.InReachWeather.Location\"S\n\u001aForecastStatusNotification\u00125\n\tforecasts\u0018\u0001 \u0003(\u000b2\".GDI.Proto.InReachWeather.Forecast\"4\n\u001aLocationsAndForecastsQuery\u0012\u0016\n\u000emodified_after\u0018\u0001 \u0001(\u0007\"{\n\u0013ForecastDetailQuery\u00120\n\rforecast_uuid\u0018\u0001 \u0001(\u000b2\u0019.GDI.Proto.DataTypes.UUID\u0012\u0019\n\u0011detail_time_begin\u0018\u0002 \u0001(\u0007\u0012\u0017\n\u000fdetail_time_end\u0018\u0003 \u0001(\u0007\"ú\u0001\n\u0011DataTypeConfigExt\u0012?\n\frequest_info\u0018\u0001 \u0001(\u000b2).GDI.Proto.InReachWeather.SyncRequestInfo\u0012V\n\u0018locs_and_forecasts_query\u0018\u0002 \u0001(\u000b24.GDI.Proto.InReachWeather.LocationsAndForecastsQuery\u0012L\n\u0015forecast_detail_query\u0018\u0003 \u0001(\u000b2-.GDI.Proto.InReachWeather.ForecastDetailQuery\"Ø\u0001\n\u0011DataTypeStatusExt\u0012B\n\u0006status\u0018\u0001 \u0001(\u000e22.GDI.Proto.InReachWeather.DataTypeStatusExt.Status\"\u007f\n\u0006Status\u0012\u0012\n\u000eUNKNOWN_STATUS\u0010\u0000\u0012 \n\u001cUNSUPPORTED_PROTOCOL_VERSION\u0010\u0001\u0012\u0015\n\u0011UNSUPPORTED_QUERY\u0010\u0002\u0012\u0010\n\fMISSING_INFO\u0010\u0003\u0012\u0016\n\u0012FORECAST_NOT_FOUND\u0010\u0004\"Ò\u0002\n\u0017GenericItemReferenceExt\u00124\n\blocation\u0018\u0001 \u0001(\u000b2\".GDI.Proto.InReachWeather.Location\u00124\n\bforecast\u0018\u0002 \u0001(\u000b2\".GDI.Proto.InReachWeather.Forecast\u0012A\n\u000bday_summary\u0018\u0003 \u0001(\u000b2,.GDI.Proto.InReachWeather.ForecastDaySummary\u0012A\n\u000bland_detail\u0018\u0004 \u0001(\u000b2,.GDI.Proto.InReachWeather.LandForecastDetail\u0012E\n\rmarine_detail\u0018\u0005 \u0001(\u000b2..GDI.Proto.InReachWeather.MarineForecastDetail*¤\u0002\n\u0011ForecastDayOfWeek\u0012 \n\u001cFORECAST_DAY_OF_WEEK_INVALID\u0010\u0000\u0012\u001f\n\u001bFORECAST_DAY_OF_WEEK_SUNDAY\u0010\u0001\u0012\u001f\n\u001bFORECAST_DAY_OF_WEEK_MONDAY\u0010\u0002\u0012 \n\u001cFORECAST_DAY_OF_WEEK_TUESDAY\u0010\u0003\u0012\"\n\u001eFORECAST_DAY_OF_WEEK_WEDNESDAY\u0010\u0004\u0012!\n\u001dFORECAST_DAY_OF_WEEK_THURSDAY\u0010\u0005\u0012\u001f\n\u001bFORECAST_DAY_OF_WEEK_FRIDAY\u0010\u0006\u0012!\n\u001dFORECAST_DAY_OF_WEEK_SATURDAY\u0010\u0007*\u0090\r\n\u000bWeatherIcon\u0012\u0018\n\u0014WEATHER_ICON_INVALID\u0010\u0000\u0012\u001a\n\u0016WEATHER_ICON_CLEAR_DAY\u0010\u0001\u0012\u001c\n\u0018WEATHER_ICON_CLEAR_NIGHT\u0010\u0002\u0012\u0017\n\u0013WEATHER_ICON_CLOUDY\u0010\u0003\u0012\"\n\u001eWEATHER_ICON_PARTLY_CLOUDY_DAY\u0010\u0004\u0012$\n WEATHER_ICON_PARTLY_CLOUDY_NIGHT\u0010\u0005\u0012\u0014\n\u0010WEATHER_ICON_FOG\u0010\u0006\u0012\u0015\n\u0011WEATHER_ICON_RAIN\u0010\u0007\u0012\u0015\n\u0011WEATHER_ICON_SNOW\u0010\b\u0012\u0016\n\u0012WEATHER_ICON_SLEET\u0010\t\u0012\u0015\n\u0011WEATHER_ICON_HAIL\u0010\n\u0012\u001d\n\u0019WEATHER_ICON_THUNDERSTORM\u0010\u000b\u0012\u0016\n\u0012WEATHER_ICON_WINDY\u0010\f\u0012\u0018\n\u0014WEATHER_ICON_TORNADO\u0010\r\u0012\u001e\n\u001aWEATHER_ICON_MOSTLY_CLOUDY\u0010\u000e\u0012\u001b\n\u0017WEATHER_ICON_WINTRY_MIX\u0010\u000f\u0012\u0015\n\u0011WEATHER_ICON_HAZY\u0010\u0010\u0012\"\n\u001eWEATHER_ICON_SCATTERED_SHOWERS\u0010\u0011\u0012(\n$WEATHER_ICON_SCATTERED_THUNDERSTORMS\u0010\u0012\u0012&\n\"WEATHER_ICON_UNKNOWN_PRECIPITATION\u0010\u0013\u0012\u001b\n\u0017WEATHER_ICON_LIGHT_RAIN\u0010\u0014\u0012\u001b\n\u0017WEATHER_ICON_HEAVY_RAIN\u0010\u0015\u0012\u001b\n\u0017WEATHER_ICON_LIGHT_SNOW\u0010\u0016\u0012\u001b\n\u0017WEATHER_ICON_HEAVY_SNOW\u0010\u0017\u0012 \n\u001cWEATHER_ICON_LIGHT_RAIN_SNOW\u0010\u0018\u0012 \n\u001cWEATHER_ICON_HEAVY_RAIN_SNOW\u0010\u0019\u0012\u001a\n\u0016WEATHER_ICON_RAIN_SNOW\u0010\u001a\u0012\u001d\n\u0019WEATHER_ICON_PARTLY_CLEAR\u0010\u001b\u0012\u001d\n\u0019WEATHER_ICON_MOSTLY_CLEAR\u0010\u001c\u0012\u001e\n\u001aWEATHER_ICON_LIGHT_SHOWERS\u0010\u001d\u0012\u0018\n\u0014WEATHER_ICON_SHOWERS\u0010\u001e\u0012\u001e\n\u001aWEATHER_ICON_HEAVY_SHOWERS\u0010\u001f\u0012\"\n\u001eWEATHER_ICON_CHANCE_OF_SHOWERS\u0010 \u0012(\n$WEATHER_ICON_CHANCE_OF_THUNDERSTORMS\u0010!\u0012\u0015\n\u0011WEATHER_ICON_MIST\u0010\"\u0012\u0015\n\u0011WEATHER_ICON_DUST\u0010#\u0012\u0018\n\u0014WEATHER_ICON_DRIZZLE\u0010$\u0012\u0016\n\u0012WEATHER_ICON_SMOKE\u0010%\u0012\u0014\n\u0010WEATHER_ICON_ICE\u0010&\u0012\u0015\n\u0011WEATHER_ICON_SAND\u0010'\u0012\u0017\n\u0013WEATHER_ICON_SQUALL\u0010(\u0012\u001a\n\u0016WEATHER_ICON_SANDSTORM\u0010)\u0012\u001d\n\u0019WEATHER_ICON_VOLCANIC_ASH\u0010*\u0012\u0015\n\u0011WEATHER_ICON_HAZE\u0010+\u0012\u0015\n\u0011WEATHER_ICON_FAIR\u0010,\u0012\u001a\n\u0016WEATHER_ICON_HURRICANE\u0010-\u0012\u001f\n\u001bWEATHER_ICON_TROPICAL_STORM\u0010.\u0012\u001f\n\u001bWEATHER_ICON_CHANCE_OF_SNOW\u0010/\u0012$\n WEATHER_ICON_CHANCE_OF_RAIN_SNOW\u00100\u0012&\n\"WEATHER_ICON_CLOUDY_CHANCE_OF_RAIN\u00101\u0012&\n\"WEATHER_ICON_CLOUDY_CHANCE_OF_SNOW\u00102\u0012+\n'WEATHER_ICON_CLOUDY_CHANCE_OF_RAIN_SNOW\u00103\u0012\u0019\n\u0015WEATHER_ICON_FLURRIES\u00104\u0012\u001e\n\u001aWEATHER_ICON_FREEZING_RAIN\u00105\u0012\u0019\n\u0015WEATHER_ICON_ICE_SNOW\u00106\u0012\u001c\n\u0018WEATHER_ICON_THIN_CLOUDS\u00107*\u008b\u0001\n\rPrecipitation\u0012\u0019\n\u0015PRECIPITATION_UNKNOWN\u0010\u0000\u0012\u0016\n\u0012PRECIPITATION_NONE\u0010\u0001\u0012\u0016\n\u0012PRECIPITATION_RAIN\u0010\u0002\u0012\u0016\n\u0012PRECIPITATION_SNOW\u0010\u0003\u0012\u0017\n\u0013PRECIPITATION_SLEET\u0010\u0004*\u0097\u0002\n\u0012ForecastAirQuality\u0012 \n\u001cFORECAST_AIR_QUALITY_INVALID\u0010\u0000\u0012\u001d\n\u0019FORECAST_AIR_QUALITY_GOOD\u0010\u0001\u0012!\n\u001dFORECAST_AIR_QUALITY_MODERATE\u0010\u0002\u0012,\n(FORECAST_AIR_QUALITY_UNHEALTHY_SENSITIVE\u0010\u0003\u0012\"\n\u001eFORECAST_AIR_QUALITY_UNHEALTHY\u0010\u0004\u0012'\n#FORECAST_AIR_QUALITY_VERY_UNHEALTHY\u0010\u0005\u0012\"\n\u001eFORECAST_AIR_QUALITY_HAZARDOUS\u0010\u0006:n\n\nconfig_ext\u0012-.GDI.Proto.GenericItemTransfer.DataTypeConfig\u0018g \u0001(\u000b2+.GDI.Proto.InReachWeather.DataTypeConfigExt:n\n\nstatus_ext\u0012-.GDI.Proto.GenericItemTransfer.DataTypeStatus\u0018g \u0001(\u000b2+.GDI.Proto.InReachWeather.DataTypeStatusExt:|\n\fitem_ref_ext\u00123.GDI.Proto.GenericItemTransfer.GenericItemReference\u0018g \u0001(\u000b21.GDI.Proto.InReachWeather.GenericItemReferenceExtB1\n\u001acom.garmin.proto.generatedB\u0011GDIInReachWeatherH\u0003"}, new Descriptors.FileDescriptor[]{GDIDataTypes.getDescriptor(), GDIGenericItemTransferProto.getDescriptor()});
        Descriptors.Descriptor descriptor2 = (Descriptors.Descriptor) f3.u(0);
        internal_static_GDI_Proto_InReachWeather_InReachWeatherService_descriptor = descriptor2;
        internal_static_GDI_Proto_InReachWeather_InReachWeatherService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"CapabilitiesRequest", "CapabilitiesResponse", "RequestForecastRequest", "RequestForecastResponse", "SyncRequest", "SyncResponse", "SubscribeRequest", "SubscribeResponse", "LocationModifiedNotification", "ForecastStatusNotification"});
        Descriptors.Descriptor descriptor3 = (Descriptors.Descriptor) f3.u(1);
        internal_static_GDI_Proto_InReachWeather_Capabilities_descriptor = descriptor3;
        internal_static_GDI_Proto_InReachWeather_Capabilities_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"MaxProtocolVersion", "ForecastTypes", "ForecastProviders", "MaxLocationCount", "SyncForecastTypes"});
        Descriptors.Descriptor descriptor4 = (Descriptors.Descriptor) f3.u(2);
        internal_static_GDI_Proto_InReachWeather_Location_descriptor = descriptor4;
        internal_static_GDI_Proto_InReachWeather_Location_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Uuid", "Deleted", "ModifiedTime", "Point", "Name"});
        Descriptors.Descriptor descriptor5 = (Descriptors.Descriptor) f3.u(3);
        internal_static_GDI_Proto_InReachWeather_Forecast_descriptor = descriptor5;
        internal_static_GDI_Proto_InReachWeather_Forecast_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Uuid", "LocationUuid", "Point", "Type", "Provider", "Status", "RequestError", "Read", "ModifiedTime", "IssuedTime", "EndTime", "ZoneOffset1Minutes", "ZoneOffset2StartTime", "ZoneOffset2Minutes", "CreatedTime"});
        Descriptors.Descriptor descriptor6 = (Descriptors.Descriptor) f3.u(4);
        internal_static_GDI_Proto_InReachWeather_ForecastDaySummary_descriptor = descriptor6;
        internal_static_GDI_Proto_InReachWeather_ForecastDaySummary_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"StartTime", "Icon", "HighTempC", "LowTempC", "PrecipType", "PrecipChancePercent", "PrecipAmountMm", "SnowfallAmountMm", "DayOfWeek", "SunriseTime", "SunsetTime"});
        Descriptors.Descriptor descriptor7 = (Descriptors.Descriptor) f3.u(5);
        internal_static_GDI_Proto_InReachWeather_LandForecastDetail_descriptor = descriptor7;
        internal_static_GDI_Proto_InReachWeather_LandForecastDetail_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"DetailTime", "Icon", "TemperatureC", "FeelsLikeTempC", "PressureMillibar", "WindSpeedMps", "GustSpeedMps", "WindBearingDegrees", "HumidityPercent", "CloudCoverPercent", "PrecipType", "PrecipChancePercent", "PrecipAmountMm", "SnowfallAmountMm", "UvIndex", "DewPointC", "AirQuality", "VisibilityMeters", "IsNight", "CloudCeilingHeightM"});
        Descriptors.Descriptor descriptor8 = (Descriptors.Descriptor) f3.u(6);
        internal_static_GDI_Proto_InReachWeather_MarineForecastDetail_descriptor = descriptor8;
        internal_static_GDI_Proto_InReachWeather_MarineForecastDetail_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"DetailTime", "VisibilityMeters", "WindSpeedMps", "GustSpeedMps", "WindBearingDegrees", "CurrentBearingDegrees", "CurrentSpeedMps", "WaveBearingDegrees", "WaveHeightMeters", "WavePeriodSeconds"});
        Descriptors.Descriptor descriptor9 = (Descriptors.Descriptor) f3.u(7);
        internal_static_GDI_Proto_InReachWeather_CapabilitiesRequest_descriptor = descriptor9;
        internal_static_GDI_Proto_InReachWeather_CapabilitiesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Capabilities"});
        Descriptors.Descriptor descriptor10 = (Descriptors.Descriptor) f3.u(8);
        internal_static_GDI_Proto_InReachWeather_CapabilitiesResponse_descriptor = descriptor10;
        internal_static_GDI_Proto_InReachWeather_CapabilitiesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Capabilities"});
        Descriptors.Descriptor descriptor11 = (Descriptors.Descriptor) f3.u(9);
        internal_static_GDI_Proto_InReachWeather_RequestForecastRequest_descriptor = descriptor11;
        internal_static_GDI_Proto_InReachWeather_RequestForecastRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{HttpHeaders.LOCATION, "ForecastTypes"});
        Descriptors.Descriptor descriptor12 = (Descriptors.Descriptor) f3.u(10);
        internal_static_GDI_Proto_InReachWeather_RequestForecastResponse_descriptor = descriptor12;
        internal_static_GDI_Proto_InReachWeather_RequestForecastResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Status", "Forecasts"});
        Descriptors.Descriptor descriptor13 = (Descriptors.Descriptor) f3.u(11);
        internal_static_GDI_Proto_InReachWeather_SyncRequestInfo_descriptor = descriptor13;
        internal_static_GDI_Proto_InReachWeather_SyncRequestInfo_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"ProtocolVersion", "AppUuid", "SyncType"});
        Descriptors.Descriptor descriptor14 = (Descriptors.Descriptor) f3.u(12);
        internal_static_GDI_Proto_InReachWeather_SyncRequest_descriptor = descriptor14;
        internal_static_GDI_Proto_InReachWeather_SyncRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"RequestInfo", "ModifiedTime"});
        Descriptors.Descriptor descriptor15 = (Descriptors.Descriptor) f3.u(13);
        internal_static_GDI_Proto_InReachWeather_SyncResponse_descriptor = descriptor15;
        internal_static_GDI_Proto_InReachWeather_SyncResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"Status"});
        Descriptors.Descriptor descriptor16 = (Descriptors.Descriptor) f3.u(14);
        internal_static_GDI_Proto_InReachWeather_SubscribeRequest_descriptor = descriptor16;
        internal_static_GDI_Proto_InReachWeather_SubscribeRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"WantLocationModified", "WantForecastStatus"});
        Descriptors.Descriptor descriptor17 = (Descriptors.Descriptor) f3.u(15);
        internal_static_GDI_Proto_InReachWeather_SubscribeResponse_descriptor = descriptor17;
        internal_static_GDI_Proto_InReachWeather_SubscribeResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[]{"Status"});
        Descriptors.Descriptor descriptor18 = (Descriptors.Descriptor) f3.u(16);
        internal_static_GDI_Proto_InReachWeather_LocationModifiedNotification_descriptor = descriptor18;
        internal_static_GDI_Proto_InReachWeather_LocationModifiedNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor18, new String[]{HttpHeaders.LOCATION});
        Descriptors.Descriptor descriptor19 = (Descriptors.Descriptor) f3.u(17);
        internal_static_GDI_Proto_InReachWeather_ForecastStatusNotification_descriptor = descriptor19;
        internal_static_GDI_Proto_InReachWeather_ForecastStatusNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor19, new String[]{"Forecasts"});
        Descriptors.Descriptor descriptor20 = (Descriptors.Descriptor) f3.u(18);
        internal_static_GDI_Proto_InReachWeather_LocationsAndForecastsQuery_descriptor = descriptor20;
        internal_static_GDI_Proto_InReachWeather_LocationsAndForecastsQuery_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor20, new String[]{"ModifiedAfter"});
        Descriptors.Descriptor descriptor21 = (Descriptors.Descriptor) f3.u(19);
        internal_static_GDI_Proto_InReachWeather_ForecastDetailQuery_descriptor = descriptor21;
        internal_static_GDI_Proto_InReachWeather_ForecastDetailQuery_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor21, new String[]{"ForecastUuid", "DetailTimeBegin", "DetailTimeEnd"});
        Descriptors.Descriptor descriptor22 = (Descriptors.Descriptor) f3.u(20);
        internal_static_GDI_Proto_InReachWeather_DataTypeConfigExt_descriptor = descriptor22;
        internal_static_GDI_Proto_InReachWeather_DataTypeConfigExt_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor22, new String[]{"RequestInfo", "LocsAndForecastsQuery", "ForecastDetailQuery"});
        Descriptors.Descriptor descriptor23 = (Descriptors.Descriptor) f3.u(21);
        internal_static_GDI_Proto_InReachWeather_DataTypeStatusExt_descriptor = descriptor23;
        internal_static_GDI_Proto_InReachWeather_DataTypeStatusExt_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor23, new String[]{"Status"});
        Descriptors.Descriptor descriptor24 = (Descriptors.Descriptor) f3.u(22);
        internal_static_GDI_Proto_InReachWeather_GenericItemReferenceExt_descriptor = descriptor24;
        internal_static_GDI_Proto_InReachWeather_GenericItemReferenceExt_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor24, new String[]{HttpHeaders.LOCATION, "Forecast", "DaySummary", "LandDetail", "MarineDetail"});
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(descriptor.getExtensions().get(0));
        generatedExtensionNewFileScopedGeneratedExtension2.internalInit(descriptor.getExtensions().get(1));
        generatedExtensionNewFileScopedGeneratedExtension3.internalInit(descriptor.getExtensions().get(2));
        GDIDataTypes.getDescriptor();
        GDIGenericItemTransferProto.getDescriptor();
    }

    private GDIInReachWeather() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(configExt);
        extensionRegistryLite.add(statusExt);
        extensionRegistryLite.add(itemRefExt);
    }

    public static final class LocationsAndForecastsQuery extends GeneratedMessageV3 implements LocationsAndForecastsQueryOrBuilder {
        public static final int MODIFIED_AFTER_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int modifiedAfter_;
        private static final LocationsAndForecastsQuery DEFAULT_INSTANCE = new LocationsAndForecastsQuery();

        @Deprecated
        public static final Parser<LocationsAndForecastsQuery> PARSER = new AbstractParser<LocationsAndForecastsQuery>() { // from class: com.garmin.proto.generated.GDIInReachWeather.LocationsAndForecastsQuery.1
            @Override // com.google.protobuf.Parser
            public LocationsAndForecastsQuery parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LocationsAndForecastsQuery.newBuilder();
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

        private LocationsAndForecastsQuery(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.modifiedAfter_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LocationsAndForecastsQuery getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_LocationsAndForecastsQuery_descriptor;
        }

        public static Builder newBuilder(LocationsAndForecastsQuery locationsAndForecastsQuery) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(locationsAndForecastsQuery);
        }

        public static LocationsAndForecastsQuery parseDelimitedFrom(InputStream inputStream) {
            return (LocationsAndForecastsQuery) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LocationsAndForecastsQuery parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LocationsAndForecastsQuery> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LocationsAndForecastsQuery)) {
                return super.equals(obj);
            }
            LocationsAndForecastsQuery locationsAndForecastsQuery = (LocationsAndForecastsQuery) obj;
            if (hasModifiedAfter() != locationsAndForecastsQuery.hasModifiedAfter()) {
                return false;
            }
            return (!hasModifiedAfter() || getModifiedAfter() == locationsAndForecastsQuery.getModifiedAfter()) && getUnknownFields().equals(locationsAndForecastsQuery.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LocationsAndForecastsQueryOrBuilder
        public int getModifiedAfter() {
            return this.modifiedAfter_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LocationsAndForecastsQuery> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeFixed32Size(1, this.modifiedAfter_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LocationsAndForecastsQueryOrBuilder
        public boolean hasModifiedAfter() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasModifiedAfter()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getModifiedAfter();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_LocationsAndForecastsQuery_fieldAccessorTable.ensureFieldAccessorsInitialized(LocationsAndForecastsQuery.class, Builder.class);
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
            return new LocationsAndForecastsQuery();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeFixed32(1, this.modifiedAfter_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LocationsAndForecastsQueryOrBuilder {
            private int bitField0_;
            private int modifiedAfter_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(LocationsAndForecastsQuery locationsAndForecastsQuery) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    locationsAndForecastsQuery.modifiedAfter_ = this.modifiedAfter_;
                } else {
                    i14 = 0;
                }
                locationsAndForecastsQuery.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_LocationsAndForecastsQuery_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LocationsAndForecastsQuery build() {
                LocationsAndForecastsQuery locationsAndForecastsQueryBuildPartial = buildPartial();
                if (locationsAndForecastsQueryBuildPartial.isInitialized()) {
                    return locationsAndForecastsQueryBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) locationsAndForecastsQueryBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LocationsAndForecastsQuery buildPartial() {
                LocationsAndForecastsQuery locationsAndForecastsQuery = new LocationsAndForecastsQuery(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(locationsAndForecastsQuery);
                }
                onBuilt();
                return locationsAndForecastsQuery;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.modifiedAfter_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearModifiedAfter() {
                this.bitField0_ &= -2;
                this.modifiedAfter_ = 0;
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
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_LocationsAndForecastsQuery_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LocationsAndForecastsQueryOrBuilder
            public int getModifiedAfter() {
                return this.modifiedAfter_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LocationsAndForecastsQueryOrBuilder
            public boolean hasModifiedAfter() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_LocationsAndForecastsQuery_fieldAccessorTable.ensureFieldAccessorsInitialized(LocationsAndForecastsQuery.class, Builder.class);
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
                                    this.modifiedAfter_ = codedInputStream.readFixed32();
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

            public Builder setModifiedAfter(int i14) {
                this.modifiedAfter_ = i14;
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
            public LocationsAndForecastsQuery getDefaultInstanceForType() {
                return LocationsAndForecastsQuery.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LocationsAndForecastsQuery) {
                    return mergeFrom((LocationsAndForecastsQuery) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LocationsAndForecastsQuery locationsAndForecastsQuery) {
                if (locationsAndForecastsQuery == LocationsAndForecastsQuery.getDefaultInstance()) {
                    return this;
                }
                if (locationsAndForecastsQuery.hasModifiedAfter()) {
                    setModifiedAfter(locationsAndForecastsQuery.getModifiedAfter());
                }
                mergeUnknownFields(locationsAndForecastsQuery.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LocationsAndForecastsQuery getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static LocationsAndForecastsQuery parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LocationsAndForecastsQuery) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LocationsAndForecastsQuery parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ LocationsAndForecastsQuery(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static LocationsAndForecastsQuery parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private LocationsAndForecastsQuery() {
            this.modifiedAfter_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LocationsAndForecastsQuery parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LocationsAndForecastsQuery parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LocationsAndForecastsQuery parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LocationsAndForecastsQuery parseFrom(InputStream inputStream) {
            return (LocationsAndForecastsQuery) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LocationsAndForecastsQuery parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LocationsAndForecastsQuery) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LocationsAndForecastsQuery parseFrom(CodedInputStream codedInputStream) {
            return (LocationsAndForecastsQuery) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LocationsAndForecastsQuery parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LocationsAndForecastsQuery) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class MarineForecastDetail extends GeneratedMessageV3 implements MarineForecastDetailOrBuilder {
        public static final int CURRENT_BEARING_DEGREES_FIELD_NUMBER = 6;
        public static final int CURRENT_SPEED_MPS_FIELD_NUMBER = 7;
        public static final int DETAIL_TIME_FIELD_NUMBER = 1;
        public static final int GUST_SPEED_MPS_FIELD_NUMBER = 4;
        public static final int VISIBILITY_METERS_FIELD_NUMBER = 2;
        public static final int WAVE_BEARING_DEGREES_FIELD_NUMBER = 8;
        public static final int WAVE_HEIGHT_METERS_FIELD_NUMBER = 9;
        public static final int WAVE_PERIOD_SECONDS_FIELD_NUMBER = 10;
        public static final int WIND_BEARING_DEGREES_FIELD_NUMBER = 5;
        public static final int WIND_SPEED_MPS_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int currentBearingDegrees_;
        private float currentSpeedMps_;
        private int detailTime_;
        private float gustSpeedMps_;
        private byte memoizedIsInitialized;
        private float visibilityMeters_;
        private int waveBearingDegrees_;
        private float waveHeightMeters_;
        private int wavePeriodSeconds_;
        private int windBearingDegrees_;
        private float windSpeedMps_;
        private static final MarineForecastDetail DEFAULT_INSTANCE = new MarineForecastDetail();

        @Deprecated
        public static final Parser<MarineForecastDetail> PARSER = new AbstractParser<MarineForecastDetail>() { // from class: com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetail.1
            @Override // com.google.protobuf.Parser
            public MarineForecastDetail parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = MarineForecastDetail.newBuilder();
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

        private MarineForecastDetail(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.detailTime_ = 0;
            this.visibilityMeters_ = 0.0f;
            this.windSpeedMps_ = 0.0f;
            this.gustSpeedMps_ = 0.0f;
            this.windBearingDegrees_ = 0;
            this.currentBearingDegrees_ = 0;
            this.currentSpeedMps_ = 0.0f;
            this.waveBearingDegrees_ = 0;
            this.waveHeightMeters_ = 0.0f;
            this.wavePeriodSeconds_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MarineForecastDetail getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_MarineForecastDetail_descriptor;
        }

        public static Builder newBuilder(MarineForecastDetail marineForecastDetail) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(marineForecastDetail);
        }

        public static MarineForecastDetail parseDelimitedFrom(InputStream inputStream) {
            return (MarineForecastDetail) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MarineForecastDetail parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<MarineForecastDetail> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MarineForecastDetail)) {
                return super.equals(obj);
            }
            MarineForecastDetail marineForecastDetail = (MarineForecastDetail) obj;
            if (hasDetailTime() != marineForecastDetail.hasDetailTime()) {
                return false;
            }
            if ((hasDetailTime() && getDetailTime() != marineForecastDetail.getDetailTime()) || hasVisibilityMeters() != marineForecastDetail.hasVisibilityMeters()) {
                return false;
            }
            if ((hasVisibilityMeters() && Float.floatToIntBits(getVisibilityMeters()) != Float.floatToIntBits(marineForecastDetail.getVisibilityMeters())) || hasWindSpeedMps() != marineForecastDetail.hasWindSpeedMps()) {
                return false;
            }
            if ((hasWindSpeedMps() && Float.floatToIntBits(getWindSpeedMps()) != Float.floatToIntBits(marineForecastDetail.getWindSpeedMps())) || hasGustSpeedMps() != marineForecastDetail.hasGustSpeedMps()) {
                return false;
            }
            if ((hasGustSpeedMps() && Float.floatToIntBits(getGustSpeedMps()) != Float.floatToIntBits(marineForecastDetail.getGustSpeedMps())) || hasWindBearingDegrees() != marineForecastDetail.hasWindBearingDegrees()) {
                return false;
            }
            if ((hasWindBearingDegrees() && getWindBearingDegrees() != marineForecastDetail.getWindBearingDegrees()) || hasCurrentBearingDegrees() != marineForecastDetail.hasCurrentBearingDegrees()) {
                return false;
            }
            if ((hasCurrentBearingDegrees() && getCurrentBearingDegrees() != marineForecastDetail.getCurrentBearingDegrees()) || hasCurrentSpeedMps() != marineForecastDetail.hasCurrentSpeedMps()) {
                return false;
            }
            if ((hasCurrentSpeedMps() && Float.floatToIntBits(getCurrentSpeedMps()) != Float.floatToIntBits(marineForecastDetail.getCurrentSpeedMps())) || hasWaveBearingDegrees() != marineForecastDetail.hasWaveBearingDegrees()) {
                return false;
            }
            if ((hasWaveBearingDegrees() && getWaveBearingDegrees() != marineForecastDetail.getWaveBearingDegrees()) || hasWaveHeightMeters() != marineForecastDetail.hasWaveHeightMeters()) {
                return false;
            }
            if ((!hasWaveHeightMeters() || Float.floatToIntBits(getWaveHeightMeters()) == Float.floatToIntBits(marineForecastDetail.getWaveHeightMeters())) && hasWavePeriodSeconds() == marineForecastDetail.hasWavePeriodSeconds()) {
                return (!hasWavePeriodSeconds() || getWavePeriodSeconds() == marineForecastDetail.getWavePeriodSeconds()) && getUnknownFields().equals(marineForecastDetail.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
        public int getCurrentBearingDegrees() {
            return this.currentBearingDegrees_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
        public float getCurrentSpeedMps() {
            return this.currentSpeedMps_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
        public int getDetailTime() {
            return this.detailTime_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
        public float getGustSpeedMps() {
            return this.gustSpeedMps_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<MarineForecastDetail> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeFixed32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeFixed32Size(1, this.detailTime_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeFloatSize(2, this.visibilityMeters_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeFloatSize(3, this.windSpeedMps_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeFloatSize(4, this.gustSpeedMps_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeUInt32Size(5, this.windBearingDegrees_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeUInt32Size(6, this.currentBearingDegrees_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeFloatSize(7, this.currentSpeedMps_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeUInt32Size(8, this.waveBearingDegrees_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeFloatSize(9, this.waveHeightMeters_);
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeUInt32Size(10, this.wavePeriodSeconds_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeFixed32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
        public float getVisibilityMeters() {
            return this.visibilityMeters_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
        public int getWaveBearingDegrees() {
            return this.waveBearingDegrees_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
        public float getWaveHeightMeters() {
            return this.waveHeightMeters_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
        public int getWavePeriodSeconds() {
            return this.wavePeriodSeconds_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
        public int getWindBearingDegrees() {
            return this.windBearingDegrees_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
        public float getWindSpeedMps() {
            return this.windSpeedMps_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
        public boolean hasCurrentBearingDegrees() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
        public boolean hasCurrentSpeedMps() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
        public boolean hasDetailTime() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
        public boolean hasGustSpeedMps() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
        public boolean hasVisibilityMeters() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
        public boolean hasWaveBearingDegrees() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
        public boolean hasWaveHeightMeters() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
        public boolean hasWavePeriodSeconds() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
        public boolean hasWindBearingDegrees() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
        public boolean hasWindSpeedMps() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasDetailTime()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getDetailTime();
            }
            if (hasVisibilityMeters()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Float.floatToIntBits(getVisibilityMeters());
            }
            if (hasWindSpeedMps()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Float.floatToIntBits(getWindSpeedMps());
            }
            if (hasGustSpeedMps()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Float.floatToIntBits(getGustSpeedMps());
            }
            if (hasWindBearingDegrees()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getWindBearingDegrees();
            }
            if (hasCurrentBearingDegrees()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getCurrentBearingDegrees();
            }
            if (hasCurrentSpeedMps()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + Float.floatToIntBits(getCurrentSpeedMps());
            }
            if (hasWaveBearingDegrees()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getWaveBearingDegrees();
            }
            if (hasWaveHeightMeters()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + Float.floatToIntBits(getWaveHeightMeters());
            }
            if (hasWavePeriodSeconds()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getWavePeriodSeconds();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_MarineForecastDetail_fieldAccessorTable.ensureFieldAccessorsInitialized(MarineForecastDetail.class, Builder.class);
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
            if (hasDetailTime()) {
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
            return new MarineForecastDetail();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeFixed32(1, this.detailTime_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeFloat(2, this.visibilityMeters_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeFloat(3, this.windSpeedMps_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeFloat(4, this.gustSpeedMps_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.windBearingDegrees_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt32(6, this.currentBearingDegrees_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeFloat(7, this.currentSpeedMps_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeUInt32(8, this.waveBearingDegrees_);
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeFloat(9, this.waveHeightMeters_);
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeUInt32(10, this.wavePeriodSeconds_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MarineForecastDetailOrBuilder {
            private int bitField0_;
            private int currentBearingDegrees_;
            private float currentSpeedMps_;
            private int detailTime_;
            private float gustSpeedMps_;
            private float visibilityMeters_;
            private int waveBearingDegrees_;
            private float waveHeightMeters_;
            private int wavePeriodSeconds_;
            private int windBearingDegrees_;
            private float windSpeedMps_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(MarineForecastDetail marineForecastDetail) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    marineForecastDetail.detailTime_ = this.detailTime_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    marineForecastDetail.visibilityMeters_ = this.visibilityMeters_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    marineForecastDetail.windSpeedMps_ = this.windSpeedMps_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    marineForecastDetail.gustSpeedMps_ = this.gustSpeedMps_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    marineForecastDetail.windBearingDegrees_ = this.windBearingDegrees_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    marineForecastDetail.currentBearingDegrees_ = this.currentBearingDegrees_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    marineForecastDetail.currentSpeedMps_ = this.currentSpeedMps_;
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    marineForecastDetail.waveBearingDegrees_ = this.waveBearingDegrees_;
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    marineForecastDetail.waveHeightMeters_ = this.waveHeightMeters_;
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    marineForecastDetail.wavePeriodSeconds_ = this.wavePeriodSeconds_;
                    i14 |= 512;
                }
                marineForecastDetail.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_MarineForecastDetail_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MarineForecastDetail build() {
                MarineForecastDetail marineForecastDetailBuildPartial = buildPartial();
                if (marineForecastDetailBuildPartial.isInitialized()) {
                    return marineForecastDetailBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) marineForecastDetailBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MarineForecastDetail buildPartial() {
                MarineForecastDetail marineForecastDetail = new MarineForecastDetail(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(marineForecastDetail);
                }
                onBuilt();
                return marineForecastDetail;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.detailTime_ = 0;
                this.visibilityMeters_ = 0.0f;
                this.windSpeedMps_ = 0.0f;
                this.gustSpeedMps_ = 0.0f;
                this.windBearingDegrees_ = 0;
                this.currentBearingDegrees_ = 0;
                this.currentSpeedMps_ = 0.0f;
                this.waveBearingDegrees_ = 0;
                this.waveHeightMeters_ = 0.0f;
                this.wavePeriodSeconds_ = 0;
                return this;
            }

            public Builder clearCurrentBearingDegrees() {
                this.bitField0_ &= -33;
                this.currentBearingDegrees_ = 0;
                onChanged();
                return this;
            }

            public Builder clearCurrentSpeedMps() {
                this.bitField0_ &= -65;
                this.currentSpeedMps_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearDetailTime() {
                this.bitField0_ &= -2;
                this.detailTime_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGustSpeedMps() {
                this.bitField0_ &= -9;
                this.gustSpeedMps_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearVisibilityMeters() {
                this.bitField0_ &= -3;
                this.visibilityMeters_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearWaveBearingDegrees() {
                this.bitField0_ &= -129;
                this.waveBearingDegrees_ = 0;
                onChanged();
                return this;
            }

            public Builder clearWaveHeightMeters() {
                this.bitField0_ &= -257;
                this.waveHeightMeters_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearWavePeriodSeconds() {
                this.bitField0_ &= -513;
                this.wavePeriodSeconds_ = 0;
                onChanged();
                return this;
            }

            public Builder clearWindBearingDegrees() {
                this.bitField0_ &= -17;
                this.windBearingDegrees_ = 0;
                onChanged();
                return this;
            }

            public Builder clearWindSpeedMps() {
                this.bitField0_ &= -5;
                this.windSpeedMps_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
            public int getCurrentBearingDegrees() {
                return this.currentBearingDegrees_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
            public float getCurrentSpeedMps() {
                return this.currentSpeedMps_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_MarineForecastDetail_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
            public int getDetailTime() {
                return this.detailTime_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
            public float getGustSpeedMps() {
                return this.gustSpeedMps_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
            public float getVisibilityMeters() {
                return this.visibilityMeters_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
            public int getWaveBearingDegrees() {
                return this.waveBearingDegrees_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
            public float getWaveHeightMeters() {
                return this.waveHeightMeters_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
            public int getWavePeriodSeconds() {
                return this.wavePeriodSeconds_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
            public int getWindBearingDegrees() {
                return this.windBearingDegrees_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
            public float getWindSpeedMps() {
                return this.windSpeedMps_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
            public boolean hasCurrentBearingDegrees() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
            public boolean hasCurrentSpeedMps() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
            public boolean hasDetailTime() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
            public boolean hasGustSpeedMps() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
            public boolean hasVisibilityMeters() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
            public boolean hasWaveBearingDegrees() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
            public boolean hasWaveHeightMeters() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
            public boolean hasWavePeriodSeconds() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
            public boolean hasWindBearingDegrees() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.MarineForecastDetailOrBuilder
            public boolean hasWindSpeedMps() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_MarineForecastDetail_fieldAccessorTable.ensureFieldAccessorsInitialized(MarineForecastDetail.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasDetailTime();
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
                                case 13:
                                    this.detailTime_ = codedInputStream.readFixed32();
                                    this.bitField0_ |= 1;
                                    continue;
                                case 21:
                                    this.visibilityMeters_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 2;
                                    continue;
                                case 29:
                                    this.windSpeedMps_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 4;
                                    continue;
                                case 37:
                                    this.gustSpeedMps_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 8;
                                    continue;
                                case 40:
                                    this.windBearingDegrees_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                    continue;
                                case 48:
                                    this.currentBearingDegrees_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 32;
                                    continue;
                                case 61:
                                    this.currentSpeedMps_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 64;
                                    continue;
                                case 64:
                                    this.waveBearingDegrees_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 128;
                                    continue;
                                case 77:
                                    this.waveHeightMeters_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 256;
                                    continue;
                                case 80:
                                    this.wavePeriodSeconds_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 512;
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

            public Builder setCurrentBearingDegrees(int i14) {
                this.currentBearingDegrees_ = i14;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setCurrentSpeedMps(float f14) {
                this.currentSpeedMps_ = f14;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setDetailTime(int i14) {
                this.detailTime_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setGustSpeedMps(float f14) {
                this.gustSpeedMps_ = f14;
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

            public Builder setVisibilityMeters(float f14) {
                this.visibilityMeters_ = f14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setWaveBearingDegrees(int i14) {
                this.waveBearingDegrees_ = i14;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setWaveHeightMeters(float f14) {
                this.waveHeightMeters_ = f14;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setWavePeriodSeconds(int i14) {
                this.wavePeriodSeconds_ = i14;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setWindBearingDegrees(int i14) {
                this.windBearingDegrees_ = i14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setWindSpeedMps(float f14) {
                this.windSpeedMps_ = f14;
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
            public MarineForecastDetail getDefaultInstanceForType() {
                return MarineForecastDetail.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof MarineForecastDetail) {
                    return mergeFrom((MarineForecastDetail) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(MarineForecastDetail marineForecastDetail) {
                if (marineForecastDetail == MarineForecastDetail.getDefaultInstance()) {
                    return this;
                }
                if (marineForecastDetail.hasDetailTime()) {
                    setDetailTime(marineForecastDetail.getDetailTime());
                }
                if (marineForecastDetail.hasVisibilityMeters()) {
                    setVisibilityMeters(marineForecastDetail.getVisibilityMeters());
                }
                if (marineForecastDetail.hasWindSpeedMps()) {
                    setWindSpeedMps(marineForecastDetail.getWindSpeedMps());
                }
                if (marineForecastDetail.hasGustSpeedMps()) {
                    setGustSpeedMps(marineForecastDetail.getGustSpeedMps());
                }
                if (marineForecastDetail.hasWindBearingDegrees()) {
                    setWindBearingDegrees(marineForecastDetail.getWindBearingDegrees());
                }
                if (marineForecastDetail.hasCurrentBearingDegrees()) {
                    setCurrentBearingDegrees(marineForecastDetail.getCurrentBearingDegrees());
                }
                if (marineForecastDetail.hasCurrentSpeedMps()) {
                    setCurrentSpeedMps(marineForecastDetail.getCurrentSpeedMps());
                }
                if (marineForecastDetail.hasWaveBearingDegrees()) {
                    setWaveBearingDegrees(marineForecastDetail.getWaveBearingDegrees());
                }
                if (marineForecastDetail.hasWaveHeightMeters()) {
                    setWaveHeightMeters(marineForecastDetail.getWaveHeightMeters());
                }
                if (marineForecastDetail.hasWavePeriodSeconds()) {
                    setWavePeriodSeconds(marineForecastDetail.getWavePeriodSeconds());
                }
                mergeUnknownFields(marineForecastDetail.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public MarineForecastDetail getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static MarineForecastDetail parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MarineForecastDetail) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MarineForecastDetail parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static MarineForecastDetail parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MarineForecastDetail parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static MarineForecastDetail parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static MarineForecastDetail parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static MarineForecastDetail parseFrom(InputStream inputStream) {
            return (MarineForecastDetail) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static MarineForecastDetail parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MarineForecastDetail) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MarineForecastDetail parseFrom(CodedInputStream codedInputStream) {
            return (MarineForecastDetail) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static MarineForecastDetail parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MarineForecastDetail) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ MarineForecastDetail(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private MarineForecastDetail() {
            this.detailTime_ = 0;
            this.visibilityMeters_ = 0.0f;
            this.windSpeedMps_ = 0.0f;
            this.gustSpeedMps_ = 0.0f;
            this.windBearingDegrees_ = 0;
            this.currentBearingDegrees_ = 0;
            this.currentSpeedMps_ = 0.0f;
            this.waveBearingDegrees_ = 0;
            this.waveHeightMeters_ = 0.0f;
            this.wavePeriodSeconds_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }
    }

    public static final class SubscribeRequest extends GeneratedMessageV3 implements SubscribeRequestOrBuilder {
        private static final SubscribeRequest DEFAULT_INSTANCE = new SubscribeRequest();

        @Deprecated
        public static final Parser<SubscribeRequest> PARSER = new AbstractParser<SubscribeRequest>() { // from class: com.garmin.proto.generated.GDIInReachWeather.SubscribeRequest.1
            @Override // com.google.protobuf.Parser
            public SubscribeRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SubscribeRequest.newBuilder();
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
        public static final int WANT_FORECAST_STATUS_FIELD_NUMBER = 2;
        public static final int WANT_LOCATION_MODIFIED_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private boolean wantForecastStatus_;
        private boolean wantLocationModified_;

        private SubscribeRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.wantLocationModified_ = false;
            this.wantForecastStatus_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SubscribeRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_SubscribeRequest_descriptor;
        }

        public static Builder newBuilder(SubscribeRequest subscribeRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(subscribeRequest);
        }

        public static SubscribeRequest parseDelimitedFrom(InputStream inputStream) {
            return (SubscribeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SubscribeRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SubscribeRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SubscribeRequest)) {
                return super.equals(obj);
            }
            SubscribeRequest subscribeRequest = (SubscribeRequest) obj;
            if (hasWantLocationModified() != subscribeRequest.hasWantLocationModified()) {
                return false;
            }
            if ((!hasWantLocationModified() || getWantLocationModified() == subscribeRequest.getWantLocationModified()) && hasWantForecastStatus() == subscribeRequest.hasWantForecastStatus()) {
                return (!hasWantForecastStatus() || getWantForecastStatus() == subscribeRequest.getWantForecastStatus()) && getUnknownFields().equals(subscribeRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SubscribeRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.wantLocationModified_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(2, this.wantForecastStatus_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBoolSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.SubscribeRequestOrBuilder
        public boolean getWantForecastStatus() {
            return this.wantForecastStatus_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.SubscribeRequestOrBuilder
        public boolean getWantLocationModified() {
            return this.wantLocationModified_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.SubscribeRequestOrBuilder
        public boolean hasWantForecastStatus() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.SubscribeRequestOrBuilder
        public boolean hasWantLocationModified() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasWantLocationModified()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getWantLocationModified());
            }
            if (hasWantForecastStatus()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getWantForecastStatus());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_SubscribeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SubscribeRequest.class, Builder.class);
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
            return new SubscribeRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.wantLocationModified_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.wantForecastStatus_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SubscribeRequestOrBuilder {
            private int bitField0_;
            private boolean wantForecastStatus_;
            private boolean wantLocationModified_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(SubscribeRequest subscribeRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    subscribeRequest.wantLocationModified_ = this.wantLocationModified_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    subscribeRequest.wantForecastStatus_ = this.wantForecastStatus_;
                    i14 |= 2;
                }
                subscribeRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_SubscribeRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SubscribeRequest build() {
                SubscribeRequest subscribeRequestBuildPartial = buildPartial();
                if (subscribeRequestBuildPartial.isInitialized()) {
                    return subscribeRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) subscribeRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SubscribeRequest buildPartial() {
                SubscribeRequest subscribeRequest = new SubscribeRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(subscribeRequest);
                }
                onBuilt();
                return subscribeRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.wantLocationModified_ = false;
                this.wantForecastStatus_ = false;
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

            public Builder clearWantForecastStatus() {
                this.bitField0_ &= -3;
                this.wantForecastStatus_ = false;
                onChanged();
                return this;
            }

            public Builder clearWantLocationModified() {
                this.bitField0_ &= -2;
                this.wantLocationModified_ = false;
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
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_SubscribeRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.SubscribeRequestOrBuilder
            public boolean getWantForecastStatus() {
                return this.wantForecastStatus_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.SubscribeRequestOrBuilder
            public boolean getWantLocationModified() {
                return this.wantLocationModified_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.SubscribeRequestOrBuilder
            public boolean hasWantForecastStatus() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.SubscribeRequestOrBuilder
            public boolean hasWantLocationModified() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_SubscribeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SubscribeRequest.class, Builder.class);
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
                                    this.wantLocationModified_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.wantForecastStatus_ = codedInputStream.readBool();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setWantForecastStatus(boolean z14) {
                this.wantForecastStatus_ = z14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setWantLocationModified(boolean z14) {
                this.wantLocationModified_ = z14;
                this.bitField0_ |= 1;
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
            public SubscribeRequest getDefaultInstanceForType() {
                return SubscribeRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SubscribeRequest) {
                    return mergeFrom((SubscribeRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SubscribeRequest subscribeRequest) {
                if (subscribeRequest == SubscribeRequest.getDefaultInstance()) {
                    return this;
                }
                if (subscribeRequest.hasWantLocationModified()) {
                    setWantLocationModified(subscribeRequest.getWantLocationModified());
                }
                if (subscribeRequest.hasWantForecastStatus()) {
                    setWantForecastStatus(subscribeRequest.getWantForecastStatus());
                }
                mergeUnknownFields(subscribeRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SubscribeRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SubscribeRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SubscribeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SubscribeRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SubscribeRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SubscribeRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ SubscribeRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SubscribeRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private SubscribeRequest() {
            this.wantLocationModified_ = false;
            this.wantForecastStatus_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SubscribeRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SubscribeRequest parseFrom(InputStream inputStream) {
            return (SubscribeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SubscribeRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SubscribeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SubscribeRequest parseFrom(CodedInputStream codedInputStream) {
            return (SubscribeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SubscribeRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SubscribeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Capabilities extends GeneratedMessageV3 implements CapabilitiesOrBuilder {
        public static final int FORECAST_PROVIDERS_FIELD_NUMBER = 3;
        public static final int FORECAST_TYPES_FIELD_NUMBER = 2;
        public static final int MAX_LOCATION_COUNT_FIELD_NUMBER = 4;
        public static final int MAX_PROTOCOL_VERSION_FIELD_NUMBER = 1;
        public static final int SYNC_FORECAST_TYPES_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private List<Integer> forecastProviders_;
        private List<Integer> forecastTypes_;
        private int maxLocationCount_;
        private int maxProtocolVersion_;
        private byte memoizedIsInitialized;
        private List<Integer> syncForecastTypes_;
        private static final Internal.ListAdapter.Converter<Integer, Forecast.Type> forecastTypes_converter_ = new Internal.ListAdapter.Converter<Integer, Forecast.Type>() { // from class: com.garmin.proto.generated.GDIInReachWeather.Capabilities.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public Forecast.Type convert(Integer num) {
                Forecast.Type typeForNumber = Forecast.Type.forNumber(num.intValue());
                return typeForNumber == null ? Forecast.Type.FORECAST_TYPE_INVALID : typeForNumber;
            }
        };
        private static final Internal.ListAdapter.Converter<Integer, Forecast.Provider> forecastProviders_converter_ = new Internal.ListAdapter.Converter<Integer, Forecast.Provider>() { // from class: com.garmin.proto.generated.GDIInReachWeather.Capabilities.2
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public Forecast.Provider convert(Integer num) {
                Forecast.Provider providerForNumber = Forecast.Provider.forNumber(num.intValue());
                return providerForNumber == null ? Forecast.Provider.FORECAST_PROVIDER_UNKNOWN : providerForNumber;
            }
        };
        private static final Internal.ListAdapter.Converter<Integer, Forecast.Type> syncForecastTypes_converter_ = new Internal.ListAdapter.Converter<Integer, Forecast.Type>() { // from class: com.garmin.proto.generated.GDIInReachWeather.Capabilities.3
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public Forecast.Type convert(Integer num) {
                Forecast.Type typeForNumber = Forecast.Type.forNumber(num.intValue());
                return typeForNumber == null ? Forecast.Type.FORECAST_TYPE_INVALID : typeForNumber;
            }
        };
        private static final Capabilities DEFAULT_INSTANCE = new Capabilities();

        @Deprecated
        public static final Parser<Capabilities> PARSER = new AbstractParser<Capabilities>() { // from class: com.garmin.proto.generated.GDIInReachWeather.Capabilities.4
            @Override // com.google.protobuf.Parser
            public Capabilities parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Capabilities.newBuilder();
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

        private Capabilities() {
            this.maxLocationCount_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.maxProtocolVersion_ = 1;
            List<Integer> list = Collections.EMPTY_LIST;
            this.forecastTypes_ = list;
            this.forecastProviders_ = list;
            this.syncForecastTypes_ = list;
        }

        public static Capabilities getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_Capabilities_descriptor;
        }

        public static Builder newBuilder(Capabilities capabilities) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(capabilities);
        }

        public static Capabilities parseDelimitedFrom(InputStream inputStream) {
            return (Capabilities) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Capabilities parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Capabilities> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Capabilities)) {
                return super.equals(obj);
            }
            Capabilities capabilities = (Capabilities) obj;
            if (hasMaxProtocolVersion() != capabilities.hasMaxProtocolVersion()) {
                return false;
            }
            if ((!hasMaxProtocolVersion() || getMaxProtocolVersion() == capabilities.getMaxProtocolVersion()) && this.forecastTypes_.equals(capabilities.forecastTypes_) && this.forecastProviders_.equals(capabilities.forecastProviders_) && hasMaxLocationCount() == capabilities.hasMaxLocationCount()) {
                return (!hasMaxLocationCount() || getMaxLocationCount() == capabilities.getMaxLocationCount()) && this.syncForecastTypes_.equals(capabilities.syncForecastTypes_) && getUnknownFields().equals(capabilities.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.CapabilitiesOrBuilder
        public Forecast.Provider getForecastProviders(int i14) {
            return forecastProviders_converter_.convert(this.forecastProviders_.get(i14));
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.CapabilitiesOrBuilder
        public int getForecastProvidersCount() {
            return this.forecastProviders_.size();
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.CapabilitiesOrBuilder
        public List<Forecast.Provider> getForecastProvidersList() {
            return new Internal.ListAdapter(this.forecastProviders_, forecastProviders_converter_);
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.CapabilitiesOrBuilder
        public Forecast.Type getForecastTypes(int i14) {
            return forecastTypes_converter_.convert(this.forecastTypes_.get(i14));
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.CapabilitiesOrBuilder
        public int getForecastTypesCount() {
            return this.forecastTypes_.size();
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.CapabilitiesOrBuilder
        public List<Forecast.Type> getForecastTypesList() {
            return new Internal.ListAdapter(this.forecastTypes_, forecastTypes_converter_);
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.CapabilitiesOrBuilder
        public int getMaxLocationCount() {
            return this.maxLocationCount_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.CapabilitiesOrBuilder
        public int getMaxProtocolVersion() {
            return this.maxProtocolVersion_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Capabilities> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            List<Integer> list;
            List<Integer> list2;
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int i15 = 0;
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.maxProtocolVersion_) : 0;
            int i16 = 0;
            int iA = 0;
            while (true) {
                int size = this.forecastTypes_.size();
                list = this.forecastTypes_;
                if (i16 >= size) {
                    break;
                }
                iA = f3.a(iA, list.get(i16));
                i16++;
            }
            int size2 = list.size() + iComputeUInt32Size + iA;
            int i17 = 0;
            int iA2 = 0;
            while (true) {
                int size3 = this.forecastProviders_.size();
                list2 = this.forecastProviders_;
                if (i17 >= size3) {
                    break;
                }
                iA2 = f3.a(iA2, list2.get(i17));
                i17++;
            }
            int size4 = list2.size() + size2 + iA2;
            if ((this.bitField0_ & 2) != 0) {
                size4 += CodedOutputStream.computeUInt32Size(4, this.maxLocationCount_);
            }
            int iA3 = 0;
            while (true) {
                int size5 = this.syncForecastTypes_.size();
                List<Integer> list3 = this.syncForecastTypes_;
                if (i15 >= size5) {
                    int serializedSize = getUnknownFields().getSerializedSize() + list3.size() + size4 + iA3;
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }
                iA3 = f3.a(iA3, list3.get(i15));
                i15++;
            }
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.CapabilitiesOrBuilder
        public Forecast.Type getSyncForecastTypes(int i14) {
            return syncForecastTypes_converter_.convert(this.syncForecastTypes_.get(i14));
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.CapabilitiesOrBuilder
        public int getSyncForecastTypesCount() {
            return this.syncForecastTypes_.size();
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.CapabilitiesOrBuilder
        public List<Forecast.Type> getSyncForecastTypesList() {
            return new Internal.ListAdapter(this.syncForecastTypes_, syncForecastTypes_converter_);
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.CapabilitiesOrBuilder
        public boolean hasMaxLocationCount() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.CapabilitiesOrBuilder
        public boolean hasMaxProtocolVersion() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasMaxProtocolVersion()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getMaxProtocolVersion();
            }
            if (getForecastTypesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.forecastTypes_.hashCode();
            }
            if (getForecastProvidersCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + this.forecastProviders_.hashCode();
            }
            if (hasMaxLocationCount()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getMaxLocationCount();
            }
            if (getSyncForecastTypesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + this.syncForecastTypes_.hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_Capabilities_fieldAccessorTable.ensureFieldAccessorsInitialized(Capabilities.class, Builder.class);
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
            return new Capabilities();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.maxProtocolVersion_);
            }
            int iF = 0;
            int iF2 = 0;
            while (iF2 < this.forecastTypes_.size()) {
                iF2 = f3.f(this.forecastTypes_.get(iF2), codedOutputStream, 2, iF2, 1);
            }
            int iF3 = 0;
            while (iF3 < this.forecastProviders_.size()) {
                iF3 = f3.f(this.forecastProviders_.get(iF3), codedOutputStream, 3, iF3, 1);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(4, this.maxLocationCount_);
            }
            while (iF < this.syncForecastTypes_.size()) {
                iF = f3.f(this.syncForecastTypes_.get(iF), codedOutputStream, 5, iF, 1);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesOrBuilder {
            private int bitField0_;
            private List<Integer> forecastProviders_;
            private List<Integer> forecastTypes_;
            private int maxLocationCount_;
            private int maxProtocolVersion_;
            private List<Integer> syncForecastTypes_;

            private Builder() {
                this.maxProtocolVersion_ = 1;
                List<Integer> list = Collections.EMPTY_LIST;
                this.forecastTypes_ = list;
                this.forecastProviders_ = list;
                this.syncForecastTypes_ = list;
            }

            private void buildPartial0(Capabilities capabilities) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    capabilities.maxProtocolVersion_ = this.maxProtocolVersion_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 8) != 0) {
                    capabilities.maxLocationCount_ = this.maxLocationCount_;
                    i14 |= 2;
                }
                capabilities.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(Capabilities capabilities) {
                if ((this.bitField0_ & 2) != 0) {
                    this.forecastTypes_ = Collections.unmodifiableList(this.forecastTypes_);
                    this.bitField0_ &= -3;
                }
                capabilities.forecastTypes_ = this.forecastTypes_;
                if ((this.bitField0_ & 4) != 0) {
                    this.forecastProviders_ = Collections.unmodifiableList(this.forecastProviders_);
                    this.bitField0_ &= -5;
                }
                capabilities.forecastProviders_ = this.forecastProviders_;
                if ((this.bitField0_ & 16) != 0) {
                    this.syncForecastTypes_ = Collections.unmodifiableList(this.syncForecastTypes_);
                    this.bitField0_ &= -17;
                }
                capabilities.syncForecastTypes_ = this.syncForecastTypes_;
            }

            private void ensureForecastProvidersIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.forecastProviders_ = new ArrayList(this.forecastProviders_);
                    this.bitField0_ |= 4;
                }
            }

            private void ensureForecastTypesIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.forecastTypes_ = new ArrayList(this.forecastTypes_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureSyncForecastTypesIsMutable() {
                if ((this.bitField0_ & 16) == 0) {
                    this.syncForecastTypes_ = new ArrayList(this.syncForecastTypes_);
                    this.bitField0_ |= 16;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_Capabilities_descriptor;
            }

            public Builder addAllForecastProviders(Iterable<? extends Forecast.Provider> iterable) {
                ensureForecastProvidersIsMutable();
                Iterator<? extends Forecast.Provider> it = iterable.iterator();
                while (it.hasNext()) {
                    this.forecastProviders_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllForecastTypes(Iterable<? extends Forecast.Type> iterable) {
                ensureForecastTypesIsMutable();
                Iterator<? extends Forecast.Type> it = iterable.iterator();
                while (it.hasNext()) {
                    this.forecastTypes_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllSyncForecastTypes(Iterable<? extends Forecast.Type> iterable) {
                ensureSyncForecastTypesIsMutable();
                Iterator<? extends Forecast.Type> it = iterable.iterator();
                while (it.hasNext()) {
                    this.syncForecastTypes_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addForecastProviders(Forecast.Provider provider) {
                provider.getClass();
                ensureForecastProvidersIsMutable();
                this.forecastProviders_.add(Integer.valueOf(provider.getNumber()));
                onChanged();
                return this;
            }

            public Builder addForecastTypes(Forecast.Type type) {
                type.getClass();
                ensureForecastTypesIsMutable();
                this.forecastTypes_.add(Integer.valueOf(type.getNumber()));
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addSyncForecastTypes(Forecast.Type type) {
                type.getClass();
                ensureSyncForecastTypesIsMutable();
                this.syncForecastTypes_.add(Integer.valueOf(type.getNumber()));
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Capabilities build() {
                Capabilities capabilitiesBuildPartial = buildPartial();
                if (capabilitiesBuildPartial.isInitialized()) {
                    return capabilitiesBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) capabilitiesBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Capabilities buildPartial() {
                Capabilities capabilities = new Capabilities(this);
                buildPartialRepeatedFields(capabilities);
                if (this.bitField0_ != 0) {
                    buildPartial0(capabilities);
                }
                onBuilt();
                return capabilities;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.maxProtocolVersion_ = 1;
                List<Integer> list = Collections.EMPTY_LIST;
                this.forecastTypes_ = list;
                this.forecastProviders_ = list;
                this.maxLocationCount_ = 0;
                this.syncForecastTypes_ = list;
                this.bitField0_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearForecastProviders() {
                this.forecastProviders_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearForecastTypes() {
                this.forecastTypes_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearMaxLocationCount() {
                this.bitField0_ &= -9;
                this.maxLocationCount_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxProtocolVersion() {
                this.bitField0_ &= -2;
                this.maxProtocolVersion_ = 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSyncForecastTypes() {
                this.syncForecastTypes_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -17;
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
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_Capabilities_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.CapabilitiesOrBuilder
            public Forecast.Provider getForecastProviders(int i14) {
                return (Forecast.Provider) Capabilities.forecastProviders_converter_.convert(this.forecastProviders_.get(i14));
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.CapabilitiesOrBuilder
            public int getForecastProvidersCount() {
                return this.forecastProviders_.size();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.CapabilitiesOrBuilder
            public List<Forecast.Provider> getForecastProvidersList() {
                return new Internal.ListAdapter(this.forecastProviders_, Capabilities.forecastProviders_converter_);
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.CapabilitiesOrBuilder
            public Forecast.Type getForecastTypes(int i14) {
                return (Forecast.Type) Capabilities.forecastTypes_converter_.convert(this.forecastTypes_.get(i14));
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.CapabilitiesOrBuilder
            public int getForecastTypesCount() {
                return this.forecastTypes_.size();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.CapabilitiesOrBuilder
            public List<Forecast.Type> getForecastTypesList() {
                return new Internal.ListAdapter(this.forecastTypes_, Capabilities.forecastTypes_converter_);
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.CapabilitiesOrBuilder
            public int getMaxLocationCount() {
                return this.maxLocationCount_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.CapabilitiesOrBuilder
            public int getMaxProtocolVersion() {
                return this.maxProtocolVersion_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.CapabilitiesOrBuilder
            public Forecast.Type getSyncForecastTypes(int i14) {
                return (Forecast.Type) Capabilities.syncForecastTypes_converter_.convert(this.syncForecastTypes_.get(i14));
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.CapabilitiesOrBuilder
            public int getSyncForecastTypesCount() {
                return this.syncForecastTypes_.size();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.CapabilitiesOrBuilder
            public List<Forecast.Type> getSyncForecastTypesList() {
                return new Internal.ListAdapter(this.syncForecastTypes_, Capabilities.syncForecastTypes_converter_);
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.CapabilitiesOrBuilder
            public boolean hasMaxLocationCount() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.CapabilitiesOrBuilder
            public boolean hasMaxProtocolVersion() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_Capabilities_fieldAccessorTable.ensureFieldAccessorsInitialized(Capabilities.class, Builder.class);
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
                                    this.maxProtocolVersion_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (Forecast.Type.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        ensureForecastTypesIsMutable();
                                        this.forecastTypes_.add(Integer.valueOf(i14));
                                    }
                                } else if (tag == 18) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int i15 = codedInputStream.readEnum();
                                        if (Forecast.Type.forNumber(i15) == null) {
                                            mergeUnknownVarintField(2, i15);
                                        } else {
                                            ensureForecastTypesIsMutable();
                                            this.forecastTypes_.add(Integer.valueOf(i15));
                                        }
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                } else if (tag == 24) {
                                    int i16 = codedInputStream.readEnum();
                                    if (Forecast.Provider.forNumber(i16) == null) {
                                        mergeUnknownVarintField(3, i16);
                                    } else {
                                        ensureForecastProvidersIsMutable();
                                        this.forecastProviders_.add(Integer.valueOf(i16));
                                    }
                                } else if (tag == 26) {
                                    int iPushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int i17 = codedInputStream.readEnum();
                                        if (Forecast.Provider.forNumber(i17) == null) {
                                            mergeUnknownVarintField(3, i17);
                                        } else {
                                            ensureForecastProvidersIsMutable();
                                            this.forecastProviders_.add(Integer.valueOf(i17));
                                        }
                                    }
                                    codedInputStream.popLimit(iPushLimit2);
                                } else if (tag == 32) {
                                    this.maxLocationCount_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    int i18 = codedInputStream.readEnum();
                                    if (Forecast.Type.forNumber(i18) == null) {
                                        mergeUnknownVarintField(5, i18);
                                    } else {
                                        ensureSyncForecastTypesIsMutable();
                                        this.syncForecastTypes_.add(Integer.valueOf(i18));
                                    }
                                } else if (tag == 42) {
                                    int iPushLimit3 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int i19 = codedInputStream.readEnum();
                                        if (Forecast.Type.forNumber(i19) == null) {
                                            mergeUnknownVarintField(5, i19);
                                        } else {
                                            ensureSyncForecastTypesIsMutable();
                                            this.syncForecastTypes_.add(Integer.valueOf(i19));
                                        }
                                    }
                                    codedInputStream.popLimit(iPushLimit3);
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

            public Builder setForecastProviders(int i14, Forecast.Provider provider) {
                provider.getClass();
                ensureForecastProvidersIsMutable();
                this.forecastProviders_.set(i14, Integer.valueOf(provider.getNumber()));
                onChanged();
                return this;
            }

            public Builder setForecastTypes(int i14, Forecast.Type type) {
                type.getClass();
                ensureForecastTypesIsMutable();
                this.forecastTypes_.set(i14, Integer.valueOf(type.getNumber()));
                onChanged();
                return this;
            }

            public Builder setMaxLocationCount(int i14) {
                this.maxLocationCount_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setMaxProtocolVersion(int i14) {
                this.maxProtocolVersion_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSyncForecastTypes(int i14, Forecast.Type type) {
                type.getClass();
                ensureSyncForecastTypesIsMutable();
                this.syncForecastTypes_.set(i14, Integer.valueOf(type.getNumber()));
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Capabilities getDefaultInstanceForType() {
                return Capabilities.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.maxProtocolVersion_ = 1;
                List<Integer> list = Collections.EMPTY_LIST;
                this.forecastTypes_ = list;
                this.forecastProviders_ = list;
                this.syncForecastTypes_ = list;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Capabilities) {
                    return mergeFrom((Capabilities) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Capabilities capabilities) {
                if (capabilities == Capabilities.getDefaultInstance()) {
                    return this;
                }
                if (capabilities.hasMaxProtocolVersion()) {
                    setMaxProtocolVersion(capabilities.getMaxProtocolVersion());
                }
                if (!capabilities.forecastTypes_.isEmpty()) {
                    if (this.forecastTypes_.isEmpty()) {
                        this.forecastTypes_ = capabilities.forecastTypes_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureForecastTypesIsMutable();
                        this.forecastTypes_.addAll(capabilities.forecastTypes_);
                    }
                    onChanged();
                }
                if (!capabilities.forecastProviders_.isEmpty()) {
                    if (this.forecastProviders_.isEmpty()) {
                        this.forecastProviders_ = capabilities.forecastProviders_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureForecastProvidersIsMutable();
                        this.forecastProviders_.addAll(capabilities.forecastProviders_);
                    }
                    onChanged();
                }
                if (capabilities.hasMaxLocationCount()) {
                    setMaxLocationCount(capabilities.getMaxLocationCount());
                }
                if (!capabilities.syncForecastTypes_.isEmpty()) {
                    if (this.syncForecastTypes_.isEmpty()) {
                        this.syncForecastTypes_ = capabilities.syncForecastTypes_;
                        this.bitField0_ &= -17;
                    } else {
                        ensureSyncForecastTypesIsMutable();
                        this.syncForecastTypes_.addAll(capabilities.syncForecastTypes_);
                    }
                    onChanged();
                }
                mergeUnknownFields(capabilities.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Capabilities getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Capabilities parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Capabilities) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Capabilities parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Capabilities parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Capabilities parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Capabilities parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Capabilities parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Capabilities parseFrom(InputStream inputStream) {
            return (Capabilities) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Capabilities parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Capabilities) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Capabilities parseFrom(CodedInputStream codedInputStream) {
            return (Capabilities) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Capabilities parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Capabilities) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private Capabilities(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.maxProtocolVersion_ = 1;
            this.maxLocationCount_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ Capabilities(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class CapabilitiesRequest extends GeneratedMessageV3 implements CapabilitiesRequestOrBuilder {
        public static final int CAPABILITIES_FIELD_NUMBER = 1;
        private static final CapabilitiesRequest DEFAULT_INSTANCE = new CapabilitiesRequest();

        @Deprecated
        public static final Parser<CapabilitiesRequest> PARSER = new AbstractParser<CapabilitiesRequest>() { // from class: com.garmin.proto.generated.GDIInReachWeather.CapabilitiesRequest.1
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
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private Capabilities capabilities_;
        private byte memoizedIsInitialized;

        private CapabilitiesRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_CapabilitiesRequest_descriptor;
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
            if (hasCapabilities() != capabilitiesRequest.hasCapabilities()) {
                return false;
            }
            return (!hasCapabilities() || getCapabilities().equals(capabilitiesRequest.getCapabilities())) && getUnknownFields().equals(capabilitiesRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.CapabilitiesRequestOrBuilder
        public Capabilities getCapabilities() {
            Capabilities capabilities = this.capabilities_;
            return capabilities == null ? Capabilities.getDefaultInstance() : capabilities;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.CapabilitiesRequestOrBuilder
        public CapabilitiesOrBuilder getCapabilitiesOrBuilder() {
            Capabilities capabilities = this.capabilities_;
            return capabilities == null ? Capabilities.getDefaultInstance() : capabilities;
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
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getCapabilities()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.CapabilitiesRequestOrBuilder
        public boolean hasCapabilities() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCapabilities()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getCapabilities().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getCapabilities());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> capabilitiesBuilder_;
            private Capabilities capabilities_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(CapabilitiesRequest capabilitiesRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                    capabilitiesRequest.capabilities_ = singleFieldBuilderV3 == null ? this.capabilities_ : (Capabilities) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                capabilitiesRequest.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> getCapabilitiesFieldBuilder() {
                if (this.capabilitiesBuilder_ == null) {
                    this.capabilitiesBuilder_ = new SingleFieldBuilderV3<>(getCapabilities(), getParentForChildren(), isClean());
                    this.capabilities_ = null;
                }
                return this.capabilitiesBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_CapabilitiesRequest_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getCapabilitiesFieldBuilder();
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
                this.capabilities_ = null;
                SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.capabilitiesBuilder_ = null;
                }
                return this;
            }

            public Builder clearCapabilities() {
                this.bitField0_ &= -2;
                this.capabilities_ = null;
                SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.capabilitiesBuilder_ = null;
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

            @Override // com.garmin.proto.generated.GDIInReachWeather.CapabilitiesRequestOrBuilder
            public Capabilities getCapabilities() {
                SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Capabilities) singleFieldBuilderV3.getMessage();
                }
                Capabilities capabilities = this.capabilities_;
                return capabilities == null ? Capabilities.getDefaultInstance() : capabilities;
            }

            public Capabilities.Builder getCapabilitiesBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (Capabilities.Builder) getCapabilitiesFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.CapabilitiesRequestOrBuilder
            public CapabilitiesOrBuilder getCapabilitiesOrBuilder() {
                SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CapabilitiesOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Capabilities capabilities = this.capabilities_;
                return capabilities == null ? Capabilities.getDefaultInstance() : capabilities;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_CapabilitiesRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.CapabilitiesRequestOrBuilder
            public boolean hasCapabilities() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeCapabilities(Capabilities capabilities) {
                Capabilities capabilities2;
                SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(capabilities);
                } else if ((this.bitField0_ & 1) == 0 || (capabilities2 = this.capabilities_) == null || capabilities2 == Capabilities.getDefaultInstance()) {
                    this.capabilities_ = capabilities;
                } else {
                    getCapabilitiesBuilder().mergeFrom(capabilities);
                }
                if (this.capabilities_ != null) {
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
                                    codedInputStream.readMessage(getCapabilitiesFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setCapabilities(Capabilities.Builder builder) {
                SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.capabilities_ = builder.build();
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

            public Builder setCapabilities(Capabilities capabilities) {
                SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    capabilities.getClass();
                    this.capabilities_ = capabilities;
                } else {
                    singleFieldBuilderV3.setMessage(capabilities);
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
                if (capabilitiesRequest.hasCapabilities()) {
                    mergeCapabilities(capabilitiesRequest.getCapabilities());
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
        public static final int CAPABILITIES_FIELD_NUMBER = 1;
        private static final CapabilitiesResponse DEFAULT_INSTANCE = new CapabilitiesResponse();

        @Deprecated
        public static final Parser<CapabilitiesResponse> PARSER = new AbstractParser<CapabilitiesResponse>() { // from class: com.garmin.proto.generated.GDIInReachWeather.CapabilitiesResponse.1
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
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private Capabilities capabilities_;
        private byte memoizedIsInitialized;

        private CapabilitiesResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_CapabilitiesResponse_descriptor;
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
            if (hasCapabilities() != capabilitiesResponse.hasCapabilities()) {
                return false;
            }
            return (!hasCapabilities() || getCapabilities().equals(capabilitiesResponse.getCapabilities())) && getUnknownFields().equals(capabilitiesResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.CapabilitiesResponseOrBuilder
        public Capabilities getCapabilities() {
            Capabilities capabilities = this.capabilities_;
            return capabilities == null ? Capabilities.getDefaultInstance() : capabilities;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.CapabilitiesResponseOrBuilder
        public CapabilitiesOrBuilder getCapabilitiesOrBuilder() {
            Capabilities capabilities = this.capabilities_;
            return capabilities == null ? Capabilities.getDefaultInstance() : capabilities;
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
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getCapabilities()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.CapabilitiesResponseOrBuilder
        public boolean hasCapabilities() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCapabilities()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getCapabilities().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getCapabilities());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> capabilitiesBuilder_;
            private Capabilities capabilities_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(CapabilitiesResponse capabilitiesResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                    capabilitiesResponse.capabilities_ = singleFieldBuilderV3 == null ? this.capabilities_ : (Capabilities) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                capabilitiesResponse.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> getCapabilitiesFieldBuilder() {
                if (this.capabilitiesBuilder_ == null) {
                    this.capabilitiesBuilder_ = new SingleFieldBuilderV3<>(getCapabilities(), getParentForChildren(), isClean());
                    this.capabilities_ = null;
                }
                return this.capabilitiesBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_CapabilitiesResponse_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getCapabilitiesFieldBuilder();
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
                this.capabilities_ = null;
                SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.capabilitiesBuilder_ = null;
                }
                return this;
            }

            public Builder clearCapabilities() {
                this.bitField0_ &= -2;
                this.capabilities_ = null;
                SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.capabilitiesBuilder_ = null;
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

            @Override // com.garmin.proto.generated.GDIInReachWeather.CapabilitiesResponseOrBuilder
            public Capabilities getCapabilities() {
                SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Capabilities) singleFieldBuilderV3.getMessage();
                }
                Capabilities capabilities = this.capabilities_;
                return capabilities == null ? Capabilities.getDefaultInstance() : capabilities;
            }

            public Capabilities.Builder getCapabilitiesBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (Capabilities.Builder) getCapabilitiesFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.CapabilitiesResponseOrBuilder
            public CapabilitiesOrBuilder getCapabilitiesOrBuilder() {
                SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CapabilitiesOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Capabilities capabilities = this.capabilities_;
                return capabilities == null ? Capabilities.getDefaultInstance() : capabilities;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_CapabilitiesResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.CapabilitiesResponseOrBuilder
            public boolean hasCapabilities() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeCapabilities(Capabilities capabilities) {
                Capabilities capabilities2;
                SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(capabilities);
                } else if ((this.bitField0_ & 1) == 0 || (capabilities2 = this.capabilities_) == null || capabilities2 == Capabilities.getDefaultInstance()) {
                    this.capabilities_ = capabilities;
                } else {
                    getCapabilitiesBuilder().mergeFrom(capabilities);
                }
                if (this.capabilities_ != null) {
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
                                    codedInputStream.readMessage(getCapabilitiesFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setCapabilities(Capabilities.Builder builder) {
                SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.capabilities_ = builder.build();
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

            public Builder setCapabilities(Capabilities capabilities) {
                SingleFieldBuilderV3<Capabilities, Capabilities.Builder, CapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    capabilities.getClass();
                    this.capabilities_ = capabilities;
                } else {
                    singleFieldBuilderV3.setMessage(capabilities);
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
                if (capabilitiesResponse.hasCapabilities()) {
                    mergeCapabilities(capabilitiesResponse.getCapabilities());
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

    public static final class DataTypeConfigExt extends GeneratedMessageV3 implements DataTypeConfigExtOrBuilder {
        public static final int FORECAST_DETAIL_QUERY_FIELD_NUMBER = 3;
        public static final int LOCS_AND_FORECASTS_QUERY_FIELD_NUMBER = 2;
        public static final int REQUEST_INFO_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ForecastDetailQuery forecastDetailQuery_;
        private LocationsAndForecastsQuery locsAndForecastsQuery_;
        private byte memoizedIsInitialized;
        private SyncRequestInfo requestInfo_;
        private static final DataTypeConfigExt DEFAULT_INSTANCE = new DataTypeConfigExt();

        @Deprecated
        public static final Parser<DataTypeConfigExt> PARSER = new AbstractParser<DataTypeConfigExt>() { // from class: com.garmin.proto.generated.GDIInReachWeather.DataTypeConfigExt.1
            @Override // com.google.protobuf.Parser
            public DataTypeConfigExt parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DataTypeConfigExt.newBuilder();
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

        private DataTypeConfigExt(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DataTypeConfigExt getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_DataTypeConfigExt_descriptor;
        }

        public static Builder newBuilder(DataTypeConfigExt dataTypeConfigExt) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(dataTypeConfigExt);
        }

        public static DataTypeConfigExt parseDelimitedFrom(InputStream inputStream) {
            return (DataTypeConfigExt) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DataTypeConfigExt parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DataTypeConfigExt> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DataTypeConfigExt)) {
                return super.equals(obj);
            }
            DataTypeConfigExt dataTypeConfigExt = (DataTypeConfigExt) obj;
            if (hasRequestInfo() != dataTypeConfigExt.hasRequestInfo()) {
                return false;
            }
            if ((hasRequestInfo() && !getRequestInfo().equals(dataTypeConfigExt.getRequestInfo())) || hasLocsAndForecastsQuery() != dataTypeConfigExt.hasLocsAndForecastsQuery()) {
                return false;
            }
            if ((!hasLocsAndForecastsQuery() || getLocsAndForecastsQuery().equals(dataTypeConfigExt.getLocsAndForecastsQuery())) && hasForecastDetailQuery() == dataTypeConfigExt.hasForecastDetailQuery()) {
                return (!hasForecastDetailQuery() || getForecastDetailQuery().equals(dataTypeConfigExt.getForecastDetailQuery())) && getUnknownFields().equals(dataTypeConfigExt.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.DataTypeConfigExtOrBuilder
        public ForecastDetailQuery getForecastDetailQuery() {
            ForecastDetailQuery forecastDetailQuery = this.forecastDetailQuery_;
            return forecastDetailQuery == null ? ForecastDetailQuery.getDefaultInstance() : forecastDetailQuery;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.DataTypeConfigExtOrBuilder
        public ForecastDetailQueryOrBuilder getForecastDetailQueryOrBuilder() {
            ForecastDetailQuery forecastDetailQuery = this.forecastDetailQuery_;
            return forecastDetailQuery == null ? ForecastDetailQuery.getDefaultInstance() : forecastDetailQuery;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.DataTypeConfigExtOrBuilder
        public LocationsAndForecastsQuery getLocsAndForecastsQuery() {
            LocationsAndForecastsQuery locationsAndForecastsQuery = this.locsAndForecastsQuery_;
            return locationsAndForecastsQuery == null ? LocationsAndForecastsQuery.getDefaultInstance() : locationsAndForecastsQuery;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.DataTypeConfigExtOrBuilder
        public LocationsAndForecastsQueryOrBuilder getLocsAndForecastsQueryOrBuilder() {
            LocationsAndForecastsQuery locationsAndForecastsQuery = this.locsAndForecastsQuery_;
            return locationsAndForecastsQuery == null ? LocationsAndForecastsQuery.getDefaultInstance() : locationsAndForecastsQuery;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DataTypeConfigExt> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.DataTypeConfigExtOrBuilder
        public SyncRequestInfo getRequestInfo() {
            SyncRequestInfo syncRequestInfo = this.requestInfo_;
            return syncRequestInfo == null ? SyncRequestInfo.getDefaultInstance() : syncRequestInfo;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.DataTypeConfigExtOrBuilder
        public SyncRequestInfoOrBuilder getRequestInfoOrBuilder() {
            SyncRequestInfo syncRequestInfo = this.requestInfo_;
            return syncRequestInfo == null ? SyncRequestInfo.getDefaultInstance() : syncRequestInfo;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getRequestInfo()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getLocsAndForecastsQuery());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getForecastDetailQuery());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.DataTypeConfigExtOrBuilder
        public boolean hasForecastDetailQuery() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.DataTypeConfigExtOrBuilder
        public boolean hasLocsAndForecastsQuery() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.DataTypeConfigExtOrBuilder
        public boolean hasRequestInfo() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasRequestInfo()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getRequestInfo().hashCode();
            }
            if (hasLocsAndForecastsQuery()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getLocsAndForecastsQuery().hashCode();
            }
            if (hasForecastDetailQuery()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getForecastDetailQuery().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_DataTypeConfigExt_fieldAccessorTable.ensureFieldAccessorsInitialized(DataTypeConfigExt.class, Builder.class);
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
            if (hasRequestInfo() && !getRequestInfo().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasForecastDetailQuery() || getForecastDetailQuery().isInitialized()) {
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
            return new DataTypeConfigExt();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getRequestInfo());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getLocsAndForecastsQuery());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getForecastDetailQuery());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DataTypeConfigExtOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<ForecastDetailQuery, ForecastDetailQuery.Builder, ForecastDetailQueryOrBuilder> forecastDetailQueryBuilder_;
            private ForecastDetailQuery forecastDetailQuery_;
            private SingleFieldBuilderV3<LocationsAndForecastsQuery, LocationsAndForecastsQuery.Builder, LocationsAndForecastsQueryOrBuilder> locsAndForecastsQueryBuilder_;
            private LocationsAndForecastsQuery locsAndForecastsQuery_;
            private SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> requestInfoBuilder_;
            private SyncRequestInfo requestInfo_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(DataTypeConfigExt dataTypeConfigExt) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> singleFieldBuilderV3 = this.requestInfoBuilder_;
                    dataTypeConfigExt.requestInfo_ = singleFieldBuilderV3 == null ? this.requestInfo_ : (SyncRequestInfo) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<LocationsAndForecastsQuery, LocationsAndForecastsQuery.Builder, LocationsAndForecastsQueryOrBuilder> singleFieldBuilderV4 = this.locsAndForecastsQueryBuilder_;
                    dataTypeConfigExt.locsAndForecastsQuery_ = singleFieldBuilderV4 == null ? this.locsAndForecastsQuery_ : (LocationsAndForecastsQuery) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<ForecastDetailQuery, ForecastDetailQuery.Builder, ForecastDetailQueryOrBuilder> singleFieldBuilderV5 = this.forecastDetailQueryBuilder_;
                    dataTypeConfigExt.forecastDetailQuery_ = singleFieldBuilderV5 == null ? this.forecastDetailQuery_ : (ForecastDetailQuery) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                dataTypeConfigExt.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_DataTypeConfigExt_descriptor;
            }

            private SingleFieldBuilderV3<ForecastDetailQuery, ForecastDetailQuery.Builder, ForecastDetailQueryOrBuilder> getForecastDetailQueryFieldBuilder() {
                if (this.forecastDetailQueryBuilder_ == null) {
                    this.forecastDetailQueryBuilder_ = new SingleFieldBuilderV3<>(getForecastDetailQuery(), getParentForChildren(), isClean());
                    this.forecastDetailQuery_ = null;
                }
                return this.forecastDetailQueryBuilder_;
            }

            private SingleFieldBuilderV3<LocationsAndForecastsQuery, LocationsAndForecastsQuery.Builder, LocationsAndForecastsQueryOrBuilder> getLocsAndForecastsQueryFieldBuilder() {
                if (this.locsAndForecastsQueryBuilder_ == null) {
                    this.locsAndForecastsQueryBuilder_ = new SingleFieldBuilderV3<>(getLocsAndForecastsQuery(), getParentForChildren(), isClean());
                    this.locsAndForecastsQuery_ = null;
                }
                return this.locsAndForecastsQueryBuilder_;
            }

            private SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> getRequestInfoFieldBuilder() {
                if (this.requestInfoBuilder_ == null) {
                    this.requestInfoBuilder_ = new SingleFieldBuilderV3<>(getRequestInfo(), getParentForChildren(), isClean());
                    this.requestInfo_ = null;
                }
                return this.requestInfoBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getRequestInfoFieldBuilder();
                    getLocsAndForecastsQueryFieldBuilder();
                    getForecastDetailQueryFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DataTypeConfigExt build() {
                DataTypeConfigExt dataTypeConfigExtBuildPartial = buildPartial();
                if (dataTypeConfigExtBuildPartial.isInitialized()) {
                    return dataTypeConfigExtBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dataTypeConfigExtBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DataTypeConfigExt buildPartial() {
                DataTypeConfigExt dataTypeConfigExt = new DataTypeConfigExt(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(dataTypeConfigExt);
                }
                onBuilt();
                return dataTypeConfigExt;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.requestInfo_ = null;
                SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> singleFieldBuilderV3 = this.requestInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.requestInfoBuilder_ = null;
                }
                this.locsAndForecastsQuery_ = null;
                SingleFieldBuilderV3<LocationsAndForecastsQuery, LocationsAndForecastsQuery.Builder, LocationsAndForecastsQueryOrBuilder> singleFieldBuilderV4 = this.locsAndForecastsQueryBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.locsAndForecastsQueryBuilder_ = null;
                }
                this.forecastDetailQuery_ = null;
                SingleFieldBuilderV3<ForecastDetailQuery, ForecastDetailQuery.Builder, ForecastDetailQueryOrBuilder> singleFieldBuilderV5 = this.forecastDetailQueryBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.forecastDetailQueryBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearForecastDetailQuery() {
                this.bitField0_ &= -5;
                this.forecastDetailQuery_ = null;
                SingleFieldBuilderV3<ForecastDetailQuery, ForecastDetailQuery.Builder, ForecastDetailQueryOrBuilder> singleFieldBuilderV3 = this.forecastDetailQueryBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.forecastDetailQueryBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearLocsAndForecastsQuery() {
                this.bitField0_ &= -3;
                this.locsAndForecastsQuery_ = null;
                SingleFieldBuilderV3<LocationsAndForecastsQuery, LocationsAndForecastsQuery.Builder, LocationsAndForecastsQueryOrBuilder> singleFieldBuilderV3 = this.locsAndForecastsQueryBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.locsAndForecastsQueryBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearRequestInfo() {
                this.bitField0_ &= -2;
                this.requestInfo_ = null;
                SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> singleFieldBuilderV3 = this.requestInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.requestInfoBuilder_ = null;
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
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_DataTypeConfigExt_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.DataTypeConfigExtOrBuilder
            public ForecastDetailQuery getForecastDetailQuery() {
                SingleFieldBuilderV3<ForecastDetailQuery, ForecastDetailQuery.Builder, ForecastDetailQueryOrBuilder> singleFieldBuilderV3 = this.forecastDetailQueryBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ForecastDetailQuery) singleFieldBuilderV3.getMessage();
                }
                ForecastDetailQuery forecastDetailQuery = this.forecastDetailQuery_;
                return forecastDetailQuery == null ? ForecastDetailQuery.getDefaultInstance() : forecastDetailQuery;
            }

            public ForecastDetailQuery.Builder getForecastDetailQueryBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (ForecastDetailQuery.Builder) getForecastDetailQueryFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.DataTypeConfigExtOrBuilder
            public ForecastDetailQueryOrBuilder getForecastDetailQueryOrBuilder() {
                SingleFieldBuilderV3<ForecastDetailQuery, ForecastDetailQuery.Builder, ForecastDetailQueryOrBuilder> singleFieldBuilderV3 = this.forecastDetailQueryBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ForecastDetailQueryOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ForecastDetailQuery forecastDetailQuery = this.forecastDetailQuery_;
                return forecastDetailQuery == null ? ForecastDetailQuery.getDefaultInstance() : forecastDetailQuery;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.DataTypeConfigExtOrBuilder
            public LocationsAndForecastsQuery getLocsAndForecastsQuery() {
                SingleFieldBuilderV3<LocationsAndForecastsQuery, LocationsAndForecastsQuery.Builder, LocationsAndForecastsQueryOrBuilder> singleFieldBuilderV3 = this.locsAndForecastsQueryBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LocationsAndForecastsQuery) singleFieldBuilderV3.getMessage();
                }
                LocationsAndForecastsQuery locationsAndForecastsQuery = this.locsAndForecastsQuery_;
                return locationsAndForecastsQuery == null ? LocationsAndForecastsQuery.getDefaultInstance() : locationsAndForecastsQuery;
            }

            public LocationsAndForecastsQuery.Builder getLocsAndForecastsQueryBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (LocationsAndForecastsQuery.Builder) getLocsAndForecastsQueryFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.DataTypeConfigExtOrBuilder
            public LocationsAndForecastsQueryOrBuilder getLocsAndForecastsQueryOrBuilder() {
                SingleFieldBuilderV3<LocationsAndForecastsQuery, LocationsAndForecastsQuery.Builder, LocationsAndForecastsQueryOrBuilder> singleFieldBuilderV3 = this.locsAndForecastsQueryBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LocationsAndForecastsQueryOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LocationsAndForecastsQuery locationsAndForecastsQuery = this.locsAndForecastsQuery_;
                return locationsAndForecastsQuery == null ? LocationsAndForecastsQuery.getDefaultInstance() : locationsAndForecastsQuery;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.DataTypeConfigExtOrBuilder
            public SyncRequestInfo getRequestInfo() {
                SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> singleFieldBuilderV3 = this.requestInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SyncRequestInfo) singleFieldBuilderV3.getMessage();
                }
                SyncRequestInfo syncRequestInfo = this.requestInfo_;
                return syncRequestInfo == null ? SyncRequestInfo.getDefaultInstance() : syncRequestInfo;
            }

            public SyncRequestInfo.Builder getRequestInfoBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SyncRequestInfo.Builder) getRequestInfoFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.DataTypeConfigExtOrBuilder
            public SyncRequestInfoOrBuilder getRequestInfoOrBuilder() {
                SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> singleFieldBuilderV3 = this.requestInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SyncRequestInfoOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SyncRequestInfo syncRequestInfo = this.requestInfo_;
                return syncRequestInfo == null ? SyncRequestInfo.getDefaultInstance() : syncRequestInfo;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.DataTypeConfigExtOrBuilder
            public boolean hasForecastDetailQuery() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.DataTypeConfigExtOrBuilder
            public boolean hasLocsAndForecastsQuery() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.DataTypeConfigExtOrBuilder
            public boolean hasRequestInfo() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_DataTypeConfigExt_fieldAccessorTable.ensureFieldAccessorsInitialized(DataTypeConfigExt.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasRequestInfo() || getRequestInfo().isInitialized()) {
                    return !hasForecastDetailQuery() || getForecastDetailQuery().isInitialized();
                }
                return false;
            }

            public Builder mergeForecastDetailQuery(ForecastDetailQuery forecastDetailQuery) {
                ForecastDetailQuery forecastDetailQuery2;
                SingleFieldBuilderV3<ForecastDetailQuery, ForecastDetailQuery.Builder, ForecastDetailQueryOrBuilder> singleFieldBuilderV3 = this.forecastDetailQueryBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(forecastDetailQuery);
                } else if ((this.bitField0_ & 4) == 0 || (forecastDetailQuery2 = this.forecastDetailQuery_) == null || forecastDetailQuery2 == ForecastDetailQuery.getDefaultInstance()) {
                    this.forecastDetailQuery_ = forecastDetailQuery;
                } else {
                    getForecastDetailQueryBuilder().mergeFrom(forecastDetailQuery);
                }
                if (this.forecastDetailQuery_ != null) {
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
                                if (tag == 10) {
                                    codedInputStream.readMessage(getRequestInfoFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getLocsAndForecastsQueryFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getForecastDetailQueryFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeLocsAndForecastsQuery(LocationsAndForecastsQuery locationsAndForecastsQuery) {
                LocationsAndForecastsQuery locationsAndForecastsQuery2;
                SingleFieldBuilderV3<LocationsAndForecastsQuery, LocationsAndForecastsQuery.Builder, LocationsAndForecastsQueryOrBuilder> singleFieldBuilderV3 = this.locsAndForecastsQueryBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(locationsAndForecastsQuery);
                } else if ((this.bitField0_ & 2) == 0 || (locationsAndForecastsQuery2 = this.locsAndForecastsQuery_) == null || locationsAndForecastsQuery2 == LocationsAndForecastsQuery.getDefaultInstance()) {
                    this.locsAndForecastsQuery_ = locationsAndForecastsQuery;
                } else {
                    getLocsAndForecastsQueryBuilder().mergeFrom(locationsAndForecastsQuery);
                }
                if (this.locsAndForecastsQuery_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeRequestInfo(SyncRequestInfo syncRequestInfo) {
                SyncRequestInfo syncRequestInfo2;
                SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> singleFieldBuilderV3 = this.requestInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(syncRequestInfo);
                } else if ((this.bitField0_ & 1) == 0 || (syncRequestInfo2 = this.requestInfo_) == null || syncRequestInfo2 == SyncRequestInfo.getDefaultInstance()) {
                    this.requestInfo_ = syncRequestInfo;
                } else {
                    getRequestInfoBuilder().mergeFrom(syncRequestInfo);
                }
                if (this.requestInfo_ != null) {
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

            public Builder setForecastDetailQuery(ForecastDetailQuery.Builder builder) {
                SingleFieldBuilderV3<ForecastDetailQuery, ForecastDetailQuery.Builder, ForecastDetailQueryOrBuilder> singleFieldBuilderV3 = this.forecastDetailQueryBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.forecastDetailQuery_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setLocsAndForecastsQuery(LocationsAndForecastsQuery.Builder builder) {
                SingleFieldBuilderV3<LocationsAndForecastsQuery, LocationsAndForecastsQuery.Builder, LocationsAndForecastsQueryOrBuilder> singleFieldBuilderV3 = this.locsAndForecastsQueryBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.locsAndForecastsQuery_ = builder.build();
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

            public Builder setRequestInfo(SyncRequestInfo.Builder builder) {
                SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> singleFieldBuilderV3 = this.requestInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.requestInfo_ = builder.build();
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
            public DataTypeConfigExt getDefaultInstanceForType() {
                return DataTypeConfigExt.getDefaultInstance();
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

            public Builder setForecastDetailQuery(ForecastDetailQuery forecastDetailQuery) {
                SingleFieldBuilderV3<ForecastDetailQuery, ForecastDetailQuery.Builder, ForecastDetailQueryOrBuilder> singleFieldBuilderV3 = this.forecastDetailQueryBuilder_;
                if (singleFieldBuilderV3 == null) {
                    forecastDetailQuery.getClass();
                    this.forecastDetailQuery_ = forecastDetailQuery;
                } else {
                    singleFieldBuilderV3.setMessage(forecastDetailQuery);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setLocsAndForecastsQuery(LocationsAndForecastsQuery locationsAndForecastsQuery) {
                SingleFieldBuilderV3<LocationsAndForecastsQuery, LocationsAndForecastsQuery.Builder, LocationsAndForecastsQueryOrBuilder> singleFieldBuilderV3 = this.locsAndForecastsQueryBuilder_;
                if (singleFieldBuilderV3 == null) {
                    locationsAndForecastsQuery.getClass();
                    this.locsAndForecastsQuery_ = locationsAndForecastsQuery;
                } else {
                    singleFieldBuilderV3.setMessage(locationsAndForecastsQuery);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setRequestInfo(SyncRequestInfo syncRequestInfo) {
                SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> singleFieldBuilderV3 = this.requestInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    syncRequestInfo.getClass();
                    this.requestInfo_ = syncRequestInfo;
                } else {
                    singleFieldBuilderV3.setMessage(syncRequestInfo);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DataTypeConfigExt) {
                    return mergeFrom((DataTypeConfigExt) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DataTypeConfigExt dataTypeConfigExt) {
                if (dataTypeConfigExt == DataTypeConfigExt.getDefaultInstance()) {
                    return this;
                }
                if (dataTypeConfigExt.hasRequestInfo()) {
                    mergeRequestInfo(dataTypeConfigExt.getRequestInfo());
                }
                if (dataTypeConfigExt.hasLocsAndForecastsQuery()) {
                    mergeLocsAndForecastsQuery(dataTypeConfigExt.getLocsAndForecastsQuery());
                }
                if (dataTypeConfigExt.hasForecastDetailQuery()) {
                    mergeForecastDetailQuery(dataTypeConfigExt.getForecastDetailQuery());
                }
                mergeUnknownFields(dataTypeConfigExt.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DataTypeConfigExt getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ DataTypeConfigExt(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private DataTypeConfigExt() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DataTypeConfigExt parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataTypeConfigExt) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DataTypeConfigExt parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DataTypeConfigExt parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DataTypeConfigExt parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DataTypeConfigExt parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DataTypeConfigExt parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DataTypeConfigExt parseFrom(InputStream inputStream) {
            return (DataTypeConfigExt) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DataTypeConfigExt parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataTypeConfigExt) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DataTypeConfigExt parseFrom(CodedInputStream codedInputStream) {
            return (DataTypeConfigExt) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DataTypeConfigExt parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataTypeConfigExt) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DataTypeStatusExt extends GeneratedMessageV3 implements DataTypeStatusExtOrBuilder {
        private static final DataTypeStatusExt DEFAULT_INSTANCE = new DataTypeStatusExt();

        @Deprecated
        public static final Parser<DataTypeStatusExt> PARSER = new AbstractParser<DataTypeStatusExt>() { // from class: com.garmin.proto.generated.GDIInReachWeather.DataTypeStatusExt.1
            @Override // com.google.protobuf.Parser
            public DataTypeStatusExt parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DataTypeStatusExt.newBuilder();
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

        private DataTypeStatusExt(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DataTypeStatusExt getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_DataTypeStatusExt_descriptor;
        }

        public static Builder newBuilder(DataTypeStatusExt dataTypeStatusExt) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(dataTypeStatusExt);
        }

        public static DataTypeStatusExt parseDelimitedFrom(InputStream inputStream) {
            return (DataTypeStatusExt) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DataTypeStatusExt parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DataTypeStatusExt> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DataTypeStatusExt)) {
                return super.equals(obj);
            }
            DataTypeStatusExt dataTypeStatusExt = (DataTypeStatusExt) obj;
            if (hasStatus() != dataTypeStatusExt.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == dataTypeStatusExt.status_) && getUnknownFields().equals(dataTypeStatusExt.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DataTypeStatusExt> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIInReachWeather.DataTypeStatusExtOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.UNKNOWN_STATUS : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.DataTypeStatusExtOrBuilder
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
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_DataTypeStatusExt_fieldAccessorTable.ensureFieldAccessorsInitialized(DataTypeStatusExt.class, Builder.class);
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
            return new DataTypeStatusExt();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DataTypeStatusExtOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(DataTypeStatusExt dataTypeStatusExt) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    dataTypeStatusExt.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                dataTypeStatusExt.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_DataTypeStatusExt_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DataTypeStatusExt build() {
                DataTypeStatusExt dataTypeStatusExtBuildPartial = buildPartial();
                if (dataTypeStatusExtBuildPartial.isInitialized()) {
                    return dataTypeStatusExtBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dataTypeStatusExtBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DataTypeStatusExt buildPartial() {
                DataTypeStatusExt dataTypeStatusExt = new DataTypeStatusExt(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(dataTypeStatusExt);
                }
                onBuilt();
                return dataTypeStatusExt;
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
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_DataTypeStatusExt_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.DataTypeStatusExtOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.UNKNOWN_STATUS : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.DataTypeStatusExtOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_DataTypeStatusExt_fieldAccessorTable.ensureFieldAccessorsInitialized(DataTypeStatusExt.class, Builder.class);
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
            public DataTypeStatusExt getDefaultInstanceForType() {
                return DataTypeStatusExt.getDefaultInstance();
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
                if (message instanceof DataTypeStatusExt) {
                    return mergeFrom((DataTypeStatusExt) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DataTypeStatusExt dataTypeStatusExt) {
                if (dataTypeStatusExt == DataTypeStatusExt.getDefaultInstance()) {
                    return this;
                }
                if (dataTypeStatusExt.hasStatus()) {
                    setStatus(dataTypeStatusExt.getStatus());
                }
                mergeUnknownFields(dataTypeStatusExt.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DataTypeStatusExt getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DataTypeStatusExt parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataTypeStatusExt) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DataTypeStatusExt parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ DataTypeStatusExt(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DataTypeStatusExt parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private DataTypeStatusExt() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DataTypeStatusExt parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DataTypeStatusExt parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DataTypeStatusExt parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DataTypeStatusExt parseFrom(InputStream inputStream) {
            return (DataTypeStatusExt) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DataTypeStatusExt parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataTypeStatusExt) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DataTypeStatusExt parseFrom(CodedInputStream codedInputStream) {
            return (DataTypeStatusExt) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DataTypeStatusExt parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataTypeStatusExt) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            UNKNOWN_STATUS(0),
            UNSUPPORTED_PROTOCOL_VERSION(1),
            UNSUPPORTED_QUERY(2),
            MISSING_INFO(3),
            FORECAST_NOT_FOUND(4);

            public static final int FORECAST_NOT_FOUND_VALUE = 4;
            public static final int MISSING_INFO_VALUE = 3;
            public static final int UNKNOWN_STATUS_VALUE = 0;
            public static final int UNSUPPORTED_PROTOCOL_VERSION_VALUE = 1;
            public static final int UNSUPPORTED_QUERY_VALUE = 2;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIInReachWeather.DataTypeStatusExt.Status.1
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
                    return UNKNOWN_STATUS;
                }
                if (i14 == 1) {
                    return UNSUPPORTED_PROTOCOL_VERSION;
                }
                if (i14 == 2) {
                    return UNSUPPORTED_QUERY;
                }
                if (i14 == 3) {
                    return MISSING_INFO;
                }
                if (i14 != 4) {
                    return null;
                }
                return FORECAST_NOT_FOUND;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return DataTypeStatusExt.getDescriptor().getEnumTypes().get(0);
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

    public static final class Forecast extends GeneratedMessageV3 implements ForecastOrBuilder {
        public static final int CREATED_TIME_FIELD_NUMBER = 15;
        public static final int END_TIME_FIELD_NUMBER = 11;
        public static final int ISSUED_TIME_FIELD_NUMBER = 10;
        public static final int LOCATION_UUID_FIELD_NUMBER = 2;
        public static final int MODIFIED_TIME_FIELD_NUMBER = 9;
        public static final int POINT_FIELD_NUMBER = 3;
        public static final int PROVIDER_FIELD_NUMBER = 5;
        public static final int READ_FIELD_NUMBER = 8;
        public static final int REQUEST_ERROR_FIELD_NUMBER = 7;
        public static final int STATUS_FIELD_NUMBER = 6;
        public static final int TYPE_FIELD_NUMBER = 4;
        public static final int UUID_FIELD_NUMBER = 1;
        public static final int ZONE_OFFSET1_MINUTES_FIELD_NUMBER = 12;
        public static final int ZONE_OFFSET2_MINUTES_FIELD_NUMBER = 14;
        public static final int ZONE_OFFSET2_START_TIME_FIELD_NUMBER = 13;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int createdTime_;
        private int endTime_;
        private int issuedTime_;
        private GDIDataTypes.UUID locationUuid_;
        private byte memoizedIsInitialized;
        private int modifiedTime_;
        private GDIDataTypes.ScPoint point_;
        private int provider_;
        private boolean read_;
        private int requestError_;
        private int status_;
        private int type_;
        private GDIDataTypes.UUID uuid_;
        private int zoneOffset1Minutes_;
        private int zoneOffset2Minutes_;
        private int zoneOffset2StartTime_;
        private static final Forecast DEFAULT_INSTANCE = new Forecast();

        @Deprecated
        public static final Parser<Forecast> PARSER = new AbstractParser<Forecast>() { // from class: com.garmin.proto.generated.GDIInReachWeather.Forecast.1
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

        private Forecast(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.type_ = 0;
            this.provider_ = 0;
            this.status_ = 0;
            this.requestError_ = 0;
            this.read_ = false;
            this.modifiedTime_ = 0;
            this.issuedTime_ = 0;
            this.endTime_ = 0;
            this.zoneOffset1Minutes_ = 0;
            this.zoneOffset2StartTime_ = 0;
            this.zoneOffset2Minutes_ = 0;
            this.createdTime_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Forecast getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_Forecast_descriptor;
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
            if (hasUuid() != forecast.hasUuid()) {
                return false;
            }
            if ((hasUuid() && !getUuid().equals(forecast.getUuid())) || hasLocationUuid() != forecast.hasLocationUuid()) {
                return false;
            }
            if ((hasLocationUuid() && !getLocationUuid().equals(forecast.getLocationUuid())) || hasPoint() != forecast.hasPoint()) {
                return false;
            }
            if ((hasPoint() && !getPoint().equals(forecast.getPoint())) || hasType() != forecast.hasType()) {
                return false;
            }
            if ((hasType() && this.type_ != forecast.type_) || hasProvider() != forecast.hasProvider()) {
                return false;
            }
            if ((hasProvider() && this.provider_ != forecast.provider_) || hasStatus() != forecast.hasStatus()) {
                return false;
            }
            if ((hasStatus() && this.status_ != forecast.status_) || hasRequestError() != forecast.hasRequestError()) {
                return false;
            }
            if ((hasRequestError() && this.requestError_ != forecast.requestError_) || hasRead() != forecast.hasRead()) {
                return false;
            }
            if ((hasRead() && getRead() != forecast.getRead()) || hasModifiedTime() != forecast.hasModifiedTime()) {
                return false;
            }
            if ((hasModifiedTime() && getModifiedTime() != forecast.getModifiedTime()) || hasIssuedTime() != forecast.hasIssuedTime()) {
                return false;
            }
            if ((hasIssuedTime() && getIssuedTime() != forecast.getIssuedTime()) || hasEndTime() != forecast.hasEndTime()) {
                return false;
            }
            if ((hasEndTime() && getEndTime() != forecast.getEndTime()) || hasZoneOffset1Minutes() != forecast.hasZoneOffset1Minutes()) {
                return false;
            }
            if ((hasZoneOffset1Minutes() && getZoneOffset1Minutes() != forecast.getZoneOffset1Minutes()) || hasZoneOffset2StartTime() != forecast.hasZoneOffset2StartTime()) {
                return false;
            }
            if ((hasZoneOffset2StartTime() && getZoneOffset2StartTime() != forecast.getZoneOffset2StartTime()) || hasZoneOffset2Minutes() != forecast.hasZoneOffset2Minutes()) {
                return false;
            }
            if ((!hasZoneOffset2Minutes() || getZoneOffset2Minutes() == forecast.getZoneOffset2Minutes()) && hasCreatedTime() == forecast.hasCreatedTime()) {
                return (!hasCreatedTime() || getCreatedTime() == forecast.getCreatedTime()) && getUnknownFields().equals(forecast.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
        public int getCreatedTime() {
            return this.createdTime_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
        public int getEndTime() {
            return this.endTime_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
        public int getIssuedTime() {
            return this.issuedTime_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
        public GDIDataTypes.UUID getLocationUuid() {
            GDIDataTypes.UUID uuid = this.locationUuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
        public GDIDataTypes.UUIDOrBuilder getLocationUuidOrBuilder() {
            GDIDataTypes.UUID uuid = this.locationUuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
        public int getModifiedTime() {
            return this.modifiedTime_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Forecast> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
        public GDIDataTypes.ScPoint getPoint() {
            GDIDataTypes.ScPoint scPoint = this.point_;
            return scPoint == null ? GDIDataTypes.ScPoint.getDefaultInstance() : scPoint;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
        public GDIDataTypes.ScPointOrBuilder getPointOrBuilder() {
            GDIDataTypes.ScPoint scPoint = this.point_;
            return scPoint == null ? GDIDataTypes.ScPoint.getDefaultInstance() : scPoint;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
        public Provider getProvider() {
            Provider providerForNumber = Provider.forNumber(this.provider_);
            return providerForNumber == null ? Provider.FORECAST_PROVIDER_UNKNOWN : providerForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
        public boolean getRead() {
            return this.read_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
        public RequestError getRequestError() {
            RequestError requestErrorForNumber = RequestError.forNumber(this.requestError_);
            return requestErrorForNumber == null ? RequestError.FORECAST_REQUEST_ERROR_UNKNOWN : requestErrorForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getUuid()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getLocationUuid());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getPoint());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(4, this.type_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(5, this.provider_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(6, this.status_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(7, this.requestError_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeBoolSize(8, this.read_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeMessageSize += CodedOutputStream.computeFixed32Size(9, this.modifiedTime_);
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeMessageSize += CodedOutputStream.computeFixed32Size(10, this.issuedTime_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeMessageSize += CodedOutputStream.computeFixed32Size(11, this.endTime_);
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeMessageSize += CodedOutputStream.computeSInt32Size(12, this.zoneOffset1Minutes_);
            }
            if ((this.bitField0_ & 4096) != 0) {
                iComputeMessageSize += CodedOutputStream.computeFixed32Size(13, this.zoneOffset2StartTime_);
            }
            if ((this.bitField0_ & 8192) != 0) {
                iComputeMessageSize += CodedOutputStream.computeSInt32Size(14, this.zoneOffset2Minutes_);
            }
            if ((this.bitField0_ & 16384) != 0) {
                iComputeMessageSize += CodedOutputStream.computeFixed32Size(15, this.createdTime_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.FORECAST_STATUS_UNKNOWN : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
        public Type getType() {
            Type typeForNumber = Type.forNumber(this.type_);
            return typeForNumber == null ? Type.FORECAST_TYPE_INVALID : typeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
        public GDIDataTypes.UUID getUuid() {
            GDIDataTypes.UUID uuid = this.uuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
        public GDIDataTypes.UUIDOrBuilder getUuidOrBuilder() {
            GDIDataTypes.UUID uuid = this.uuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
        public int getZoneOffset1Minutes() {
            return this.zoneOffset1Minutes_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
        public int getZoneOffset2Minutes() {
            return this.zoneOffset2Minutes_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
        public int getZoneOffset2StartTime() {
            return this.zoneOffset2StartTime_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
        public boolean hasCreatedTime() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
        public boolean hasEndTime() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
        public boolean hasIssuedTime() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
        public boolean hasLocationUuid() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
        public boolean hasModifiedTime() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
        public boolean hasPoint() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
        public boolean hasProvider() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
        public boolean hasRead() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
        public boolean hasRequestError() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
        public boolean hasType() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
        public boolean hasUuid() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
        public boolean hasZoneOffset1Minutes() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
        public boolean hasZoneOffset2Minutes() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
        public boolean hasZoneOffset2StartTime() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasUuid()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getUuid().hashCode();
            }
            if (hasLocationUuid()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getLocationUuid().hashCode();
            }
            if (hasPoint()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getPoint().hashCode();
            }
            if (hasType()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + this.type_;
            }
            if (hasProvider()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + this.provider_;
            }
            if (hasStatus()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + this.status_;
            }
            if (hasRequestError()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + this.requestError_;
            }
            if (hasRead()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + Internal.hashBoolean(getRead());
            }
            if (hasModifiedTime()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getModifiedTime();
            }
            if (hasIssuedTime()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getIssuedTime();
            }
            if (hasEndTime()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getEndTime();
            }
            if (hasZoneOffset1Minutes()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + getZoneOffset1Minutes();
            }
            if (hasZoneOffset2StartTime()) {
                iHashCode = e5.c(iHashCode, 37, 13, 53) + getZoneOffset2StartTime();
            }
            if (hasZoneOffset2Minutes()) {
                iHashCode = e5.c(iHashCode, 37, 14, 53) + getZoneOffset2Minutes();
            }
            if (hasCreatedTime()) {
                iHashCode = e5.c(iHashCode, 37, 15, 53) + getCreatedTime();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_Forecast_fieldAccessorTable.ensureFieldAccessorsInitialized(Forecast.class, Builder.class);
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
            if (!hasUuid()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!getUuid().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasLocationUuid() && !getLocationUuid().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasPoint() || getPoint().isInitialized()) {
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
                codedOutputStream.writeMessage(1, getUuid());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getLocationUuid());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getPoint());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeEnum(4, this.type_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeEnum(5, this.provider_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeEnum(6, this.status_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeEnum(7, this.requestError_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeBool(8, this.read_);
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeFixed32(9, this.modifiedTime_);
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeFixed32(10, this.issuedTime_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeFixed32(11, this.endTime_);
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeSInt32(12, this.zoneOffset1Minutes_);
            }
            if ((this.bitField0_ & 4096) != 0) {
                codedOutputStream.writeFixed32(13, this.zoneOffset2StartTime_);
            }
            if ((this.bitField0_ & 8192) != 0) {
                codedOutputStream.writeSInt32(14, this.zoneOffset2Minutes_);
            }
            if ((this.bitField0_ & 16384) != 0) {
                codedOutputStream.writeFixed32(15, this.createdTime_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ForecastOrBuilder {
            private int bitField0_;
            private int createdTime_;
            private int endTime_;
            private int issuedTime_;
            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> locationUuidBuilder_;
            private GDIDataTypes.UUID locationUuid_;
            private int modifiedTime_;
            private SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> pointBuilder_;
            private GDIDataTypes.ScPoint point_;
            private int provider_;
            private boolean read_;
            private int requestError_;
            private int status_;
            private int type_;
            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> uuidBuilder_;
            private GDIDataTypes.UUID uuid_;
            private int zoneOffset1Minutes_;
            private int zoneOffset2Minutes_;
            private int zoneOffset2StartTime_;

            private Builder() {
                this.type_ = 0;
                this.provider_ = 0;
                this.status_ = 0;
                this.requestError_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Forecast forecast) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                    forecast.uuid_ = singleFieldBuilderV3 == null ? this.uuid_ : (GDIDataTypes.UUID) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV4 = this.locationUuidBuilder_;
                    forecast.locationUuid_ = singleFieldBuilderV4 == null ? this.locationUuid_ : (GDIDataTypes.UUID) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV5 = this.pointBuilder_;
                    forecast.point_ = singleFieldBuilderV5 == null ? this.point_ : (GDIDataTypes.ScPoint) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    forecast.type_ = this.type_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    forecast.provider_ = this.provider_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    forecast.status_ = this.status_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    forecast.requestError_ = this.requestError_;
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    forecast.read_ = this.read_;
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    forecast.modifiedTime_ = this.modifiedTime_;
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    forecast.issuedTime_ = this.issuedTime_;
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    forecast.endTime_ = this.endTime_;
                    i14 |= 1024;
                }
                if ((i15 & 2048) != 0) {
                    forecast.zoneOffset1Minutes_ = this.zoneOffset1Minutes_;
                    i14 |= 2048;
                }
                if ((i15 & 4096) != 0) {
                    forecast.zoneOffset2StartTime_ = this.zoneOffset2StartTime_;
                    i14 |= 4096;
                }
                if ((i15 & 8192) != 0) {
                    forecast.zoneOffset2Minutes_ = this.zoneOffset2Minutes_;
                    i14 |= 8192;
                }
                if ((i15 & 16384) != 0) {
                    forecast.createdTime_ = this.createdTime_;
                    i14 |= 16384;
                }
                forecast.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_Forecast_descriptor;
            }

            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> getLocationUuidFieldBuilder() {
                if (this.locationUuidBuilder_ == null) {
                    this.locationUuidBuilder_ = new SingleFieldBuilderV3<>(getLocationUuid(), getParentForChildren(), isClean());
                    this.locationUuid_ = null;
                }
                return this.locationUuidBuilder_;
            }

            private SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> getPointFieldBuilder() {
                if (this.pointBuilder_ == null) {
                    this.pointBuilder_ = new SingleFieldBuilderV3<>(getPoint(), getParentForChildren(), isClean());
                    this.point_ = null;
                }
                return this.pointBuilder_;
            }

            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> getUuidFieldBuilder() {
                if (this.uuidBuilder_ == null) {
                    this.uuidBuilder_ = new SingleFieldBuilderV3<>(getUuid(), getParentForChildren(), isClean());
                    this.uuid_ = null;
                }
                return this.uuidBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getUuidFieldBuilder();
                    getLocationUuidFieldBuilder();
                    getPointFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
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
                this.uuid_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.uuidBuilder_ = null;
                }
                this.locationUuid_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV4 = this.locationUuidBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.locationUuidBuilder_ = null;
                }
                this.point_ = null;
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV5 = this.pointBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.pointBuilder_ = null;
                }
                this.type_ = 0;
                this.provider_ = 0;
                this.status_ = 0;
                this.requestError_ = 0;
                this.read_ = false;
                this.modifiedTime_ = 0;
                this.issuedTime_ = 0;
                this.endTime_ = 0;
                this.zoneOffset1Minutes_ = 0;
                this.zoneOffset2StartTime_ = 0;
                this.zoneOffset2Minutes_ = 0;
                this.createdTime_ = 0;
                return this;
            }

            public Builder clearCreatedTime() {
                this.bitField0_ &= -16385;
                this.createdTime_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEndTime() {
                this.bitField0_ &= -1025;
                this.endTime_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearIssuedTime() {
                this.bitField0_ &= -513;
                this.issuedTime_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLocationUuid() {
                this.bitField0_ &= -3;
                this.locationUuid_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.locationUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.locationUuidBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearModifiedTime() {
                this.bitField0_ &= -257;
                this.modifiedTime_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPoint() {
                this.bitField0_ &= -5;
                this.point_ = null;
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.pointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.pointBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearProvider() {
                this.bitField0_ &= -17;
                this.provider_ = 0;
                onChanged();
                return this;
            }

            public Builder clearRead() {
                this.bitField0_ &= -129;
                this.read_ = false;
                onChanged();
                return this;
            }

            public Builder clearRequestError() {
                this.bitField0_ &= -65;
                this.requestError_ = 0;
                onChanged();
                return this;
            }

            public Builder clearStatus() {
                this.bitField0_ &= -33;
                this.status_ = 0;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.bitField0_ &= -9;
                this.type_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUuid() {
                this.bitField0_ &= -2;
                this.uuid_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.uuidBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearZoneOffset1Minutes() {
                this.bitField0_ &= -2049;
                this.zoneOffset1Minutes_ = 0;
                onChanged();
                return this;
            }

            public Builder clearZoneOffset2Minutes() {
                this.bitField0_ &= -8193;
                this.zoneOffset2Minutes_ = 0;
                onChanged();
                return this;
            }

            public Builder clearZoneOffset2StartTime() {
                this.bitField0_ &= -4097;
                this.zoneOffset2StartTime_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
            public int getCreatedTime() {
                return this.createdTime_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_Forecast_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
            public int getEndTime() {
                return this.endTime_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
            public int getIssuedTime() {
                return this.issuedTime_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
            public GDIDataTypes.UUID getLocationUuid() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.locationUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUID) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.UUID uuid = this.locationUuid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            public GDIDataTypes.UUID.Builder getLocationUuidBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (GDIDataTypes.UUID.Builder) getLocationUuidFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
            public GDIDataTypes.UUIDOrBuilder getLocationUuidOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.locationUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUIDOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.UUID uuid = this.locationUuid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
            public int getModifiedTime() {
                return this.modifiedTime_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
            public GDIDataTypes.ScPoint getPoint() {
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.pointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.ScPoint) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.ScPoint scPoint = this.point_;
                return scPoint == null ? GDIDataTypes.ScPoint.getDefaultInstance() : scPoint;
            }

            public GDIDataTypes.ScPoint.Builder getPointBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (GDIDataTypes.ScPoint.Builder) getPointFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
            public GDIDataTypes.ScPointOrBuilder getPointOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.pointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.ScPointOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.ScPoint scPoint = this.point_;
                return scPoint == null ? GDIDataTypes.ScPoint.getDefaultInstance() : scPoint;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
            public Provider getProvider() {
                Provider providerForNumber = Provider.forNumber(this.provider_);
                return providerForNumber == null ? Provider.FORECAST_PROVIDER_UNKNOWN : providerForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
            public boolean getRead() {
                return this.read_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
            public RequestError getRequestError() {
                RequestError requestErrorForNumber = RequestError.forNumber(this.requestError_);
                return requestErrorForNumber == null ? RequestError.FORECAST_REQUEST_ERROR_UNKNOWN : requestErrorForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.FORECAST_STATUS_UNKNOWN : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
            public Type getType() {
                Type typeForNumber = Type.forNumber(this.type_);
                return typeForNumber == null ? Type.FORECAST_TYPE_INVALID : typeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
            public GDIDataTypes.UUID getUuid() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUID) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.UUID uuid = this.uuid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            public GDIDataTypes.UUID.Builder getUuidBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (GDIDataTypes.UUID.Builder) getUuidFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
            public GDIDataTypes.UUIDOrBuilder getUuidOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUIDOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.UUID uuid = this.uuid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
            public int getZoneOffset1Minutes() {
                return this.zoneOffset1Minutes_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
            public int getZoneOffset2Minutes() {
                return this.zoneOffset2Minutes_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
            public int getZoneOffset2StartTime() {
                return this.zoneOffset2StartTime_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
            public boolean hasCreatedTime() {
                return (this.bitField0_ & 16384) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
            public boolean hasEndTime() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
            public boolean hasIssuedTime() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
            public boolean hasLocationUuid() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
            public boolean hasModifiedTime() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
            public boolean hasPoint() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
            public boolean hasProvider() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
            public boolean hasRead() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
            public boolean hasRequestError() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
            public boolean hasType() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
            public boolean hasUuid() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
            public boolean hasZoneOffset1Minutes() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
            public boolean hasZoneOffset2Minutes() {
                return (this.bitField0_ & 8192) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastOrBuilder
            public boolean hasZoneOffset2StartTime() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_Forecast_fieldAccessorTable.ensureFieldAccessorsInitialized(Forecast.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasUuid() || !getUuid().isInitialized()) {
                    return false;
                }
                if (!hasLocationUuid() || getLocationUuid().isInitialized()) {
                    return !hasPoint() || getPoint().isInitialized();
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
                                    codedInputStream.readMessage(getUuidFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                    continue;
                                case 18:
                                    codedInputStream.readMessage(getLocationUuidFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                    continue;
                                case 26:
                                    codedInputStream.readMessage(getPointFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                    continue;
                                case 32:
                                    int i14 = codedInputStream.readEnum();
                                    if (Type.forNumber(i14) == null) {
                                        mergeUnknownVarintField(4, i14);
                                    } else {
                                        this.type_ = i14;
                                        this.bitField0_ |= 8;
                                        continue;
                                    }
                                    break;
                                case 40:
                                    int i15 = codedInputStream.readEnum();
                                    if (Provider.forNumber(i15) == null) {
                                        mergeUnknownVarintField(5, i15);
                                    } else {
                                        this.provider_ = i15;
                                        this.bitField0_ |= 16;
                                        continue;
                                    }
                                    break;
                                case 48:
                                    int i16 = codedInputStream.readEnum();
                                    if (Status.forNumber(i16) == null) {
                                        mergeUnknownVarintField(6, i16);
                                    } else {
                                        this.status_ = i16;
                                        this.bitField0_ |= 32;
                                        continue;
                                    }
                                    break;
                                case 56:
                                    int i17 = codedInputStream.readEnum();
                                    if (RequestError.forNumber(i17) == null) {
                                        mergeUnknownVarintField(7, i17);
                                    } else {
                                        this.requestError_ = i17;
                                        this.bitField0_ |= 64;
                                        continue;
                                    }
                                    break;
                                case 64:
                                    this.read_ = codedInputStream.readBool();
                                    this.bitField0_ |= 128;
                                    continue;
                                case 77:
                                    this.modifiedTime_ = codedInputStream.readFixed32();
                                    this.bitField0_ |= 256;
                                    continue;
                                case 85:
                                    this.issuedTime_ = codedInputStream.readFixed32();
                                    this.bitField0_ |= 512;
                                    continue;
                                case 93:
                                    this.endTime_ = codedInputStream.readFixed32();
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 96:
                                    this.zoneOffset1Minutes_ = codedInputStream.readSInt32();
                                    this.bitField0_ |= 2048;
                                    continue;
                                case 109:
                                    this.zoneOffset2StartTime_ = codedInputStream.readFixed32();
                                    this.bitField0_ |= 4096;
                                    continue;
                                case 112:
                                    this.zoneOffset2Minutes_ = codedInputStream.readSInt32();
                                    this.bitField0_ |= 8192;
                                    continue;
                                case 125:
                                    this.createdTime_ = codedInputStream.readFixed32();
                                    this.bitField0_ |= 16384;
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

            public Builder mergeLocationUuid(GDIDataTypes.UUID uuid) {
                GDIDataTypes.UUID uuid2;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.locationUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(uuid);
                } else if ((this.bitField0_ & 2) == 0 || (uuid2 = this.locationUuid_) == null || uuid2 == GDIDataTypes.UUID.getDefaultInstance()) {
                    this.locationUuid_ = uuid;
                } else {
                    getLocationUuidBuilder().mergeFrom(uuid);
                }
                if (this.locationUuid_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergePoint(GDIDataTypes.ScPoint scPoint) {
                GDIDataTypes.ScPoint scPoint2;
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.pointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(scPoint);
                } else if ((this.bitField0_ & 4) == 0 || (scPoint2 = this.point_) == null || scPoint2 == GDIDataTypes.ScPoint.getDefaultInstance()) {
                    this.point_ = scPoint;
                } else {
                    getPointBuilder().mergeFrom(scPoint);
                }
                if (this.point_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder mergeUuid(GDIDataTypes.UUID uuid) {
                GDIDataTypes.UUID uuid2;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(uuid);
                } else if ((this.bitField0_ & 1) == 0 || (uuid2 = this.uuid_) == null || uuid2 == GDIDataTypes.UUID.getDefaultInstance()) {
                    this.uuid_ = uuid;
                } else {
                    getUuidBuilder().mergeFrom(uuid);
                }
                if (this.uuid_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder setCreatedTime(int i14) {
                this.createdTime_ = i14;
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setEndTime(int i14) {
                this.endTime_ = i14;
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setIssuedTime(int i14) {
                this.issuedTime_ = i14;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setLocationUuid(GDIDataTypes.UUID.Builder builder) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.locationUuidBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.locationUuid_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setModifiedTime(int i14) {
                this.modifiedTime_ = i14;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setPoint(GDIDataTypes.ScPoint.Builder builder) {
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.pointBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.point_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setProvider(Provider provider) {
                provider.getClass();
                this.bitField0_ |= 16;
                this.provider_ = provider.getNumber();
                onChanged();
                return this;
            }

            public Builder setRead(boolean z14) {
                this.read_ = z14;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setRequestError(RequestError requestError) {
                requestError.getClass();
                this.bitField0_ |= 64;
                this.requestError_ = requestError.getNumber();
                onChanged();
                return this;
            }

            public Builder setStatus(Status status) {
                status.getClass();
                this.bitField0_ |= 32;
                this.status_ = status.getNumber();
                onChanged();
                return this;
            }

            public Builder setType(Type type) {
                type.getClass();
                this.bitField0_ |= 8;
                this.type_ = type.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setUuid(GDIDataTypes.UUID.Builder builder) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.uuid_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setZoneOffset1Minutes(int i14) {
                this.zoneOffset1Minutes_ = i14;
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setZoneOffset2Minutes(int i14) {
                this.zoneOffset2Minutes_ = i14;
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setZoneOffset2StartTime(int i14) {
                this.zoneOffset2StartTime_ = i14;
                this.bitField0_ |= 4096;
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

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.type_ = 0;
                this.provider_ = 0;
                this.status_ = 0;
                this.requestError_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setLocationUuid(GDIDataTypes.UUID uuid) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.locationUuidBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uuid.getClass();
                    this.locationUuid_ = uuid;
                } else {
                    singleFieldBuilderV3.setMessage(uuid);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setPoint(GDIDataTypes.ScPoint scPoint) {
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.pointBuilder_;
                if (singleFieldBuilderV3 == null) {
                    scPoint.getClass();
                    this.point_ = scPoint;
                } else {
                    singleFieldBuilderV3.setMessage(scPoint);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setUuid(GDIDataTypes.UUID uuid) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uuid.getClass();
                    this.uuid_ = uuid;
                } else {
                    singleFieldBuilderV3.setMessage(uuid);
                }
                this.bitField0_ |= 1;
                onChanged();
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

            public Builder mergeFrom(Forecast forecast) {
                if (forecast == Forecast.getDefaultInstance()) {
                    return this;
                }
                if (forecast.hasUuid()) {
                    mergeUuid(forecast.getUuid());
                }
                if (forecast.hasLocationUuid()) {
                    mergeLocationUuid(forecast.getLocationUuid());
                }
                if (forecast.hasPoint()) {
                    mergePoint(forecast.getPoint());
                }
                if (forecast.hasType()) {
                    setType(forecast.getType());
                }
                if (forecast.hasProvider()) {
                    setProvider(forecast.getProvider());
                }
                if (forecast.hasStatus()) {
                    setStatus(forecast.getStatus());
                }
                if (forecast.hasRequestError()) {
                    setRequestError(forecast.getRequestError());
                }
                if (forecast.hasRead()) {
                    setRead(forecast.getRead());
                }
                if (forecast.hasModifiedTime()) {
                    setModifiedTime(forecast.getModifiedTime());
                }
                if (forecast.hasIssuedTime()) {
                    setIssuedTime(forecast.getIssuedTime());
                }
                if (forecast.hasEndTime()) {
                    setEndTime(forecast.getEndTime());
                }
                if (forecast.hasZoneOffset1Minutes()) {
                    setZoneOffset1Minutes(forecast.getZoneOffset1Minutes());
                }
                if (forecast.hasZoneOffset2StartTime()) {
                    setZoneOffset2StartTime(forecast.getZoneOffset2StartTime());
                }
                if (forecast.hasZoneOffset2Minutes()) {
                    setZoneOffset2Minutes(forecast.getZoneOffset2Minutes());
                }
                if (forecast.hasCreatedTime()) {
                    setCreatedTime(forecast.getCreatedTime());
                }
                mergeUnknownFields(forecast.getUnknownFields());
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

        public enum Provider implements ProtocolMessageEnum {
            FORECAST_PROVIDER_UNKNOWN(0),
            DARK_SKY(1),
            OCENS(2),
            METEOBLUE(3);

            public static final int DARK_SKY_VALUE = 1;
            public static final int FORECAST_PROVIDER_UNKNOWN_VALUE = 0;
            public static final int METEOBLUE_VALUE = 3;
            public static final int OCENS_VALUE = 2;
            private final int value;
            private static final Internal.EnumLiteMap<Provider> internalValueMap = new Internal.EnumLiteMap<Provider>() { // from class: com.garmin.proto.generated.GDIInReachWeather.Forecast.Provider.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Provider findValueByNumber(int i14) {
                    return Provider.forNumber(i14);
                }
            };
            private static final Provider[] VALUES = values();

            Provider(int i14) {
                this.value = i14;
            }

            public static Provider forNumber(int i14) {
                if (i14 == 0) {
                    return FORECAST_PROVIDER_UNKNOWN;
                }
                if (i14 == 1) {
                    return DARK_SKY;
                }
                if (i14 == 2) {
                    return OCENS;
                }
                if (i14 != 3) {
                    return null;
                }
                return METEOBLUE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Forecast.getDescriptor().getEnumTypes().get(1);
            }

            public static Internal.EnumLiteMap<Provider> internalGetValueMap() {
                return internalValueMap;
            }

            public static Provider valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Provider valueOf(int i14) {
                return forNumber(i14);
            }
        }

        public enum RequestError implements ProtocolMessageEnum {
            FORECAST_REQUEST_ERROR_UNKNOWN(0),
            GENERIC_REQUEST_ERROR(1),
            REQUEST_NOT_SENT(2),
            RESPONSE_TIMEOUT(3),
            NO_COVERAGE(4),
            DECODE_ERROR(5),
            SERVER_CONNECTION_FAILED(6),
            SERVER_ERROR(7),
            SERVER_RETRIES_EXCEEDED(8);

            public static final int DECODE_ERROR_VALUE = 5;
            public static final int FORECAST_REQUEST_ERROR_UNKNOWN_VALUE = 0;
            public static final int GENERIC_REQUEST_ERROR_VALUE = 1;
            public static final int NO_COVERAGE_VALUE = 4;
            public static final int REQUEST_NOT_SENT_VALUE = 2;
            public static final int RESPONSE_TIMEOUT_VALUE = 3;
            public static final int SERVER_CONNECTION_FAILED_VALUE = 6;
            public static final int SERVER_ERROR_VALUE = 7;
            public static final int SERVER_RETRIES_EXCEEDED_VALUE = 8;
            private final int value;
            private static final Internal.EnumLiteMap<RequestError> internalValueMap = new Internal.EnumLiteMap<RequestError>() { // from class: com.garmin.proto.generated.GDIInReachWeather.Forecast.RequestError.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public RequestError findValueByNumber(int i14) {
                    return RequestError.forNumber(i14);
                }
            };
            private static final RequestError[] VALUES = values();

            RequestError(int i14) {
                this.value = i14;
            }

            public static RequestError forNumber(int i14) {
                switch (i14) {
                    case 0:
                        return FORECAST_REQUEST_ERROR_UNKNOWN;
                    case 1:
                        return GENERIC_REQUEST_ERROR;
                    case 2:
                        return REQUEST_NOT_SENT;
                    case 3:
                        return RESPONSE_TIMEOUT;
                    case 4:
                        return NO_COVERAGE;
                    case 5:
                        return DECODE_ERROR;
                    case 6:
                        return SERVER_CONNECTION_FAILED;
                    case 7:
                        return SERVER_ERROR;
                    case 8:
                        return SERVER_RETRIES_EXCEEDED;
                    default:
                        return null;
                }
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Forecast.getDescriptor().getEnumTypes().get(3);
            }

            public static Internal.EnumLiteMap<RequestError> internalGetValueMap() {
                return internalValueMap;
            }

            public static RequestError valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static RequestError valueOf(int i14) {
                return forNumber(i14);
            }
        }

        public enum Status implements ProtocolMessageEnum {
            FORECAST_STATUS_UNKNOWN(0),
            REQUEST_ERROR(1),
            WAITING_FOR_GPS(2),
            QUEUED(3),
            WAITING_FOR_REPLY(4),
            RECEIVED(5);

            public static final int FORECAST_STATUS_UNKNOWN_VALUE = 0;
            public static final int QUEUED_VALUE = 3;
            public static final int RECEIVED_VALUE = 5;
            public static final int REQUEST_ERROR_VALUE = 1;
            public static final int WAITING_FOR_GPS_VALUE = 2;
            public static final int WAITING_FOR_REPLY_VALUE = 4;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIInReachWeather.Forecast.Status.1
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
                    return FORECAST_STATUS_UNKNOWN;
                }
                if (i14 == 1) {
                    return REQUEST_ERROR;
                }
                if (i14 == 2) {
                    return WAITING_FOR_GPS;
                }
                if (i14 == 3) {
                    return QUEUED;
                }
                if (i14 == 4) {
                    return WAITING_FOR_REPLY;
                }
                if (i14 != 5) {
                    return null;
                }
                return RECEIVED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Forecast.getDescriptor().getEnumTypes().get(2);
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

        public enum Type implements ProtocolMessageEnum {
            FORECAST_TYPE_INVALID(0),
            INREACH_BASIC(1),
            INREACH_PREMIUM(2),
            INREACH_MARINE(3),
            WBL_LAND(4);

            public static final int FORECAST_TYPE_INVALID_VALUE = 0;
            public static final int INREACH_BASIC_VALUE = 1;
            public static final int INREACH_MARINE_VALUE = 3;
            public static final int INREACH_PREMIUM_VALUE = 2;
            public static final int WBL_LAND_VALUE = 4;
            private final int value;
            private static final Internal.EnumLiteMap<Type> internalValueMap = new Internal.EnumLiteMap<Type>() { // from class: com.garmin.proto.generated.GDIInReachWeather.Forecast.Type.1
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
                if (i14 == 0) {
                    return FORECAST_TYPE_INVALID;
                }
                if (i14 == 1) {
                    return INREACH_BASIC;
                }
                if (i14 == 2) {
                    return INREACH_PREMIUM;
                }
                if (i14 == 3) {
                    return INREACH_MARINE;
                }
                if (i14 != 4) {
                    return null;
                }
                return WBL_LAND;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return Forecast.getDescriptor().getEnumTypes().get(0);
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

        public /* synthetic */ Forecast(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private Forecast() {
            this.read_ = false;
            this.modifiedTime_ = 0;
            this.issuedTime_ = 0;
            this.endTime_ = 0;
            this.zoneOffset1Minutes_ = 0;
            this.zoneOffset2StartTime_ = 0;
            this.zoneOffset2Minutes_ = 0;
            this.createdTime_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
            this.provider_ = 0;
            this.status_ = 0;
            this.requestError_ = 0;
        }
    }

    public static final class ForecastDaySummary extends GeneratedMessageV3 implements ForecastDaySummaryOrBuilder {
        public static final int DAY_OF_WEEK_FIELD_NUMBER = 9;
        public static final int HIGH_TEMP_C_FIELD_NUMBER = 3;
        public static final int ICON_FIELD_NUMBER = 2;
        public static final int LOW_TEMP_C_FIELD_NUMBER = 4;
        public static final int PRECIP_AMOUNT_MM_FIELD_NUMBER = 7;
        public static final int PRECIP_CHANCE_PERCENT_FIELD_NUMBER = 6;
        public static final int PRECIP_TYPE_FIELD_NUMBER = 5;
        public static final int SNOWFALL_AMOUNT_MM_FIELD_NUMBER = 8;
        public static final int START_TIME_FIELD_NUMBER = 1;
        public static final int SUNRISE_TIME_FIELD_NUMBER = 10;
        public static final int SUNSET_TIME_FIELD_NUMBER = 11;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int dayOfWeek_;
        private float highTempC_;
        private int icon_;
        private float lowTempC_;
        private byte memoizedIsInitialized;
        private int precipAmountMm_;
        private int precipChancePercent_;
        private int precipType_;
        private int snowfallAmountMm_;
        private int startTime_;
        private int sunriseTime_;
        private int sunsetTime_;
        private static final ForecastDaySummary DEFAULT_INSTANCE = new ForecastDaySummary();

        @Deprecated
        public static final Parser<ForecastDaySummary> PARSER = new AbstractParser<ForecastDaySummary>() { // from class: com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummary.1
            @Override // com.google.protobuf.Parser
            public ForecastDaySummary parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ForecastDaySummary.newBuilder();
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

        private ForecastDaySummary(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.startTime_ = 0;
            this.icon_ = 0;
            this.highTempC_ = 0.0f;
            this.lowTempC_ = 0.0f;
            this.precipType_ = 0;
            this.precipChancePercent_ = 0;
            this.precipAmountMm_ = 0;
            this.snowfallAmountMm_ = 0;
            this.dayOfWeek_ = 0;
            this.sunriseTime_ = 0;
            this.sunsetTime_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ForecastDaySummary getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_ForecastDaySummary_descriptor;
        }

        public static Builder newBuilder(ForecastDaySummary forecastDaySummary) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(forecastDaySummary);
        }

        public static ForecastDaySummary parseDelimitedFrom(InputStream inputStream) {
            return (ForecastDaySummary) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ForecastDaySummary parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ForecastDaySummary> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ForecastDaySummary)) {
                return super.equals(obj);
            }
            ForecastDaySummary forecastDaySummary = (ForecastDaySummary) obj;
            if (hasStartTime() != forecastDaySummary.hasStartTime()) {
                return false;
            }
            if ((hasStartTime() && getStartTime() != forecastDaySummary.getStartTime()) || hasIcon() != forecastDaySummary.hasIcon()) {
                return false;
            }
            if ((hasIcon() && this.icon_ != forecastDaySummary.icon_) || hasHighTempC() != forecastDaySummary.hasHighTempC()) {
                return false;
            }
            if ((hasHighTempC() && Float.floatToIntBits(getHighTempC()) != Float.floatToIntBits(forecastDaySummary.getHighTempC())) || hasLowTempC() != forecastDaySummary.hasLowTempC()) {
                return false;
            }
            if ((hasLowTempC() && Float.floatToIntBits(getLowTempC()) != Float.floatToIntBits(forecastDaySummary.getLowTempC())) || hasPrecipType() != forecastDaySummary.hasPrecipType()) {
                return false;
            }
            if ((hasPrecipType() && this.precipType_ != forecastDaySummary.precipType_) || hasPrecipChancePercent() != forecastDaySummary.hasPrecipChancePercent()) {
                return false;
            }
            if ((hasPrecipChancePercent() && getPrecipChancePercent() != forecastDaySummary.getPrecipChancePercent()) || hasPrecipAmountMm() != forecastDaySummary.hasPrecipAmountMm()) {
                return false;
            }
            if ((hasPrecipAmountMm() && getPrecipAmountMm() != forecastDaySummary.getPrecipAmountMm()) || hasSnowfallAmountMm() != forecastDaySummary.hasSnowfallAmountMm()) {
                return false;
            }
            if ((hasSnowfallAmountMm() && getSnowfallAmountMm() != forecastDaySummary.getSnowfallAmountMm()) || hasDayOfWeek() != forecastDaySummary.hasDayOfWeek()) {
                return false;
            }
            if ((hasDayOfWeek() && this.dayOfWeek_ != forecastDaySummary.dayOfWeek_) || hasSunriseTime() != forecastDaySummary.hasSunriseTime()) {
                return false;
            }
            if ((!hasSunriseTime() || getSunriseTime() == forecastDaySummary.getSunriseTime()) && hasSunsetTime() == forecastDaySummary.hasSunsetTime()) {
                return (!hasSunsetTime() || getSunsetTime() == forecastDaySummary.getSunsetTime()) && getUnknownFields().equals(forecastDaySummary.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
        public ForecastDayOfWeek getDayOfWeek() {
            ForecastDayOfWeek forecastDayOfWeekForNumber = ForecastDayOfWeek.forNumber(this.dayOfWeek_);
            return forecastDayOfWeekForNumber == null ? ForecastDayOfWeek.FORECAST_DAY_OF_WEEK_INVALID : forecastDayOfWeekForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
        public float getHighTempC() {
            return this.highTempC_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
        public WeatherIcon getIcon() {
            WeatherIcon weatherIconForNumber = WeatherIcon.forNumber(this.icon_);
            return weatherIconForNumber == null ? WeatherIcon.WEATHER_ICON_INVALID : weatherIconForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
        public float getLowTempC() {
            return this.lowTempC_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ForecastDaySummary> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
        public int getPrecipAmountMm() {
            return this.precipAmountMm_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
        public int getPrecipChancePercent() {
            return this.precipChancePercent_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
        public Precipitation getPrecipType() {
            Precipitation precipitationForNumber = Precipitation.forNumber(this.precipType_);
            return precipitationForNumber == null ? Precipitation.PRECIPITATION_UNKNOWN : precipitationForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeFixed32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeFixed32Size(1, this.startTime_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeEnumSize(2, this.icon_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeFloatSize(3, this.highTempC_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeFloatSize(4, this.lowTempC_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeEnumSize(5, this.precipType_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeUInt32Size(6, this.precipChancePercent_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeUInt32Size(7, this.precipAmountMm_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeUInt32Size(8, this.snowfallAmountMm_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeEnumSize(9, this.dayOfWeek_);
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeFixed32Size(10, this.sunriseTime_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeFixed32Size(11, this.sunsetTime_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeFixed32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
        public int getSnowfallAmountMm() {
            return this.snowfallAmountMm_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
        public int getStartTime() {
            return this.startTime_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
        public int getSunriseTime() {
            return this.sunriseTime_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
        public int getSunsetTime() {
            return this.sunsetTime_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
        public boolean hasDayOfWeek() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
        public boolean hasHighTempC() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
        public boolean hasIcon() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
        public boolean hasLowTempC() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
        public boolean hasPrecipAmountMm() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
        public boolean hasPrecipChancePercent() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
        public boolean hasPrecipType() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
        public boolean hasSnowfallAmountMm() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
        public boolean hasStartTime() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
        public boolean hasSunriseTime() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
        public boolean hasSunsetTime() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasStartTime()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getStartTime();
            }
            if (hasIcon()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.icon_;
            }
            if (hasHighTempC()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Float.floatToIntBits(getHighTempC());
            }
            if (hasLowTempC()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Float.floatToIntBits(getLowTempC());
            }
            if (hasPrecipType()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + this.precipType_;
            }
            if (hasPrecipChancePercent()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getPrecipChancePercent();
            }
            if (hasPrecipAmountMm()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getPrecipAmountMm();
            }
            if (hasSnowfallAmountMm()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getSnowfallAmountMm();
            }
            if (hasDayOfWeek()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + this.dayOfWeek_;
            }
            if (hasSunriseTime()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getSunriseTime();
            }
            if (hasSunsetTime()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getSunsetTime();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_ForecastDaySummary_fieldAccessorTable.ensureFieldAccessorsInitialized(ForecastDaySummary.class, Builder.class);
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
            if (hasStartTime()) {
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
            return new ForecastDaySummary();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeFixed32(1, this.startTime_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.icon_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeFloat(3, this.highTempC_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeFloat(4, this.lowTempC_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeEnum(5, this.precipType_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt32(6, this.precipChancePercent_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeUInt32(7, this.precipAmountMm_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeUInt32(8, this.snowfallAmountMm_);
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeEnum(9, this.dayOfWeek_);
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeFixed32(10, this.sunriseTime_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeFixed32(11, this.sunsetTime_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ForecastDaySummaryOrBuilder {
            private int bitField0_;
            private int dayOfWeek_;
            private float highTempC_;
            private int icon_;
            private float lowTempC_;
            private int precipAmountMm_;
            private int precipChancePercent_;
            private int precipType_;
            private int snowfallAmountMm_;
            private int startTime_;
            private int sunriseTime_;
            private int sunsetTime_;

            private Builder() {
                this.icon_ = 0;
                this.precipType_ = 0;
                this.dayOfWeek_ = 0;
            }

            private void buildPartial0(ForecastDaySummary forecastDaySummary) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    forecastDaySummary.startTime_ = this.startTime_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    forecastDaySummary.icon_ = this.icon_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    forecastDaySummary.highTempC_ = this.highTempC_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    forecastDaySummary.lowTempC_ = this.lowTempC_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    forecastDaySummary.precipType_ = this.precipType_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    forecastDaySummary.precipChancePercent_ = this.precipChancePercent_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    forecastDaySummary.precipAmountMm_ = this.precipAmountMm_;
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    forecastDaySummary.snowfallAmountMm_ = this.snowfallAmountMm_;
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    forecastDaySummary.dayOfWeek_ = this.dayOfWeek_;
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    forecastDaySummary.sunriseTime_ = this.sunriseTime_;
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    forecastDaySummary.sunsetTime_ = this.sunsetTime_;
                    i14 |= 1024;
                }
                forecastDaySummary.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_ForecastDaySummary_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ForecastDaySummary build() {
                ForecastDaySummary forecastDaySummaryBuildPartial = buildPartial();
                if (forecastDaySummaryBuildPartial.isInitialized()) {
                    return forecastDaySummaryBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) forecastDaySummaryBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ForecastDaySummary buildPartial() {
                ForecastDaySummary forecastDaySummary = new ForecastDaySummary(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(forecastDaySummary);
                }
                onBuilt();
                return forecastDaySummary;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.startTime_ = 0;
                this.icon_ = 0;
                this.highTempC_ = 0.0f;
                this.lowTempC_ = 0.0f;
                this.precipType_ = 0;
                this.precipChancePercent_ = 0;
                this.precipAmountMm_ = 0;
                this.snowfallAmountMm_ = 0;
                this.dayOfWeek_ = 0;
                this.sunriseTime_ = 0;
                this.sunsetTime_ = 0;
                return this;
            }

            public Builder clearDayOfWeek() {
                this.bitField0_ &= -257;
                this.dayOfWeek_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearHighTempC() {
                this.bitField0_ &= -5;
                this.highTempC_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearIcon() {
                this.bitField0_ &= -3;
                this.icon_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLowTempC() {
                this.bitField0_ &= -9;
                this.lowTempC_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPrecipAmountMm() {
                this.bitField0_ &= -65;
                this.precipAmountMm_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPrecipChancePercent() {
                this.bitField0_ &= -33;
                this.precipChancePercent_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPrecipType() {
                this.bitField0_ &= -17;
                this.precipType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSnowfallAmountMm() {
                this.bitField0_ &= -129;
                this.snowfallAmountMm_ = 0;
                onChanged();
                return this;
            }

            public Builder clearStartTime() {
                this.bitField0_ &= -2;
                this.startTime_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSunriseTime() {
                this.bitField0_ &= -513;
                this.sunriseTime_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSunsetTime() {
                this.bitField0_ &= -1025;
                this.sunsetTime_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
            public ForecastDayOfWeek getDayOfWeek() {
                ForecastDayOfWeek forecastDayOfWeekForNumber = ForecastDayOfWeek.forNumber(this.dayOfWeek_);
                return forecastDayOfWeekForNumber == null ? ForecastDayOfWeek.FORECAST_DAY_OF_WEEK_INVALID : forecastDayOfWeekForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_ForecastDaySummary_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
            public float getHighTempC() {
                return this.highTempC_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
            public WeatherIcon getIcon() {
                WeatherIcon weatherIconForNumber = WeatherIcon.forNumber(this.icon_);
                return weatherIconForNumber == null ? WeatherIcon.WEATHER_ICON_INVALID : weatherIconForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
            public float getLowTempC() {
                return this.lowTempC_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
            public int getPrecipAmountMm() {
                return this.precipAmountMm_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
            public int getPrecipChancePercent() {
                return this.precipChancePercent_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
            public Precipitation getPrecipType() {
                Precipitation precipitationForNumber = Precipitation.forNumber(this.precipType_);
                return precipitationForNumber == null ? Precipitation.PRECIPITATION_UNKNOWN : precipitationForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
            public int getSnowfallAmountMm() {
                return this.snowfallAmountMm_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
            public int getStartTime() {
                return this.startTime_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
            public int getSunriseTime() {
                return this.sunriseTime_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
            public int getSunsetTime() {
                return this.sunsetTime_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
            public boolean hasDayOfWeek() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
            public boolean hasHighTempC() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
            public boolean hasIcon() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
            public boolean hasLowTempC() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
            public boolean hasPrecipAmountMm() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
            public boolean hasPrecipChancePercent() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
            public boolean hasPrecipType() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
            public boolean hasSnowfallAmountMm() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
            public boolean hasStartTime() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
            public boolean hasSunriseTime() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDaySummaryOrBuilder
            public boolean hasSunsetTime() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_ForecastDaySummary_fieldAccessorTable.ensureFieldAccessorsInitialized(ForecastDaySummary.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasStartTime();
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
                                case 13:
                                    this.startTime_ = codedInputStream.readFixed32();
                                    this.bitField0_ |= 1;
                                    continue;
                                case 16:
                                    int i14 = codedInputStream.readEnum();
                                    if (WeatherIcon.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.icon_ = i14;
                                        this.bitField0_ |= 2;
                                        continue;
                                    }
                                    break;
                                case 29:
                                    this.highTempC_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 4;
                                    continue;
                                case 37:
                                    this.lowTempC_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 8;
                                    continue;
                                case 40:
                                    int i15 = codedInputStream.readEnum();
                                    if (Precipitation.forNumber(i15) == null) {
                                        mergeUnknownVarintField(5, i15);
                                    } else {
                                        this.precipType_ = i15;
                                        this.bitField0_ |= 16;
                                        continue;
                                    }
                                    break;
                                case 48:
                                    this.precipChancePercent_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 32;
                                    continue;
                                case 56:
                                    this.precipAmountMm_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 64;
                                    continue;
                                case 64:
                                    this.snowfallAmountMm_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 128;
                                    continue;
                                case 72:
                                    int i16 = codedInputStream.readEnum();
                                    if (ForecastDayOfWeek.forNumber(i16) == null) {
                                        mergeUnknownVarintField(9, i16);
                                    } else {
                                        this.dayOfWeek_ = i16;
                                        this.bitField0_ |= 256;
                                        continue;
                                    }
                                    break;
                                case 85:
                                    this.sunriseTime_ = codedInputStream.readFixed32();
                                    this.bitField0_ |= 512;
                                    continue;
                                case 93:
                                    this.sunsetTime_ = codedInputStream.readFixed32();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setDayOfWeek(ForecastDayOfWeek forecastDayOfWeek) {
                forecastDayOfWeek.getClass();
                this.bitField0_ |= 256;
                this.dayOfWeek_ = forecastDayOfWeek.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setHighTempC(float f14) {
                this.highTempC_ = f14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setIcon(WeatherIcon weatherIcon) {
                weatherIcon.getClass();
                this.bitField0_ |= 2;
                this.icon_ = weatherIcon.getNumber();
                onChanged();
                return this;
            }

            public Builder setLowTempC(float f14) {
                this.lowTempC_ = f14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setPrecipAmountMm(int i14) {
                this.precipAmountMm_ = i14;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setPrecipChancePercent(int i14) {
                this.precipChancePercent_ = i14;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setPrecipType(Precipitation precipitation) {
                precipitation.getClass();
                this.bitField0_ |= 16;
                this.precipType_ = precipitation.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSnowfallAmountMm(int i14) {
                this.snowfallAmountMm_ = i14;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setStartTime(int i14) {
                this.startTime_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSunriseTime(int i14) {
                this.sunriseTime_ = i14;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setSunsetTime(int i14) {
                this.sunsetTime_ = i14;
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ForecastDaySummary getDefaultInstanceForType() {
                return ForecastDaySummary.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.icon_ = 0;
                this.precipType_ = 0;
                this.dayOfWeek_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ForecastDaySummary) {
                    return mergeFrom((ForecastDaySummary) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ForecastDaySummary forecastDaySummary) {
                if (forecastDaySummary == ForecastDaySummary.getDefaultInstance()) {
                    return this;
                }
                if (forecastDaySummary.hasStartTime()) {
                    setStartTime(forecastDaySummary.getStartTime());
                }
                if (forecastDaySummary.hasIcon()) {
                    setIcon(forecastDaySummary.getIcon());
                }
                if (forecastDaySummary.hasHighTempC()) {
                    setHighTempC(forecastDaySummary.getHighTempC());
                }
                if (forecastDaySummary.hasLowTempC()) {
                    setLowTempC(forecastDaySummary.getLowTempC());
                }
                if (forecastDaySummary.hasPrecipType()) {
                    setPrecipType(forecastDaySummary.getPrecipType());
                }
                if (forecastDaySummary.hasPrecipChancePercent()) {
                    setPrecipChancePercent(forecastDaySummary.getPrecipChancePercent());
                }
                if (forecastDaySummary.hasPrecipAmountMm()) {
                    setPrecipAmountMm(forecastDaySummary.getPrecipAmountMm());
                }
                if (forecastDaySummary.hasSnowfallAmountMm()) {
                    setSnowfallAmountMm(forecastDaySummary.getSnowfallAmountMm());
                }
                if (forecastDaySummary.hasDayOfWeek()) {
                    setDayOfWeek(forecastDaySummary.getDayOfWeek());
                }
                if (forecastDaySummary.hasSunriseTime()) {
                    setSunriseTime(forecastDaySummary.getSunriseTime());
                }
                if (forecastDaySummary.hasSunsetTime()) {
                    setSunsetTime(forecastDaySummary.getSunsetTime());
                }
                mergeUnknownFields(forecastDaySummary.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ForecastDaySummary getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ForecastDaySummary parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ForecastDaySummary) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ForecastDaySummary parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ForecastDaySummary parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ForecastDaySummary parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ForecastDaySummary parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ForecastDaySummary parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ForecastDaySummary parseFrom(InputStream inputStream) {
            return (ForecastDaySummary) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ForecastDaySummary parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ForecastDaySummary) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ForecastDaySummary parseFrom(CodedInputStream codedInputStream) {
            return (ForecastDaySummary) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ForecastDaySummary parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ForecastDaySummary) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ ForecastDaySummary(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private ForecastDaySummary() {
            this.startTime_ = 0;
            this.highTempC_ = 0.0f;
            this.lowTempC_ = 0.0f;
            this.precipChancePercent_ = 0;
            this.precipAmountMm_ = 0;
            this.snowfallAmountMm_ = 0;
            this.sunriseTime_ = 0;
            this.sunsetTime_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.icon_ = 0;
            this.precipType_ = 0;
            this.dayOfWeek_ = 0;
        }
    }

    public static final class ForecastDetailQuery extends GeneratedMessageV3 implements ForecastDetailQueryOrBuilder {
        public static final int DETAIL_TIME_BEGIN_FIELD_NUMBER = 2;
        public static final int DETAIL_TIME_END_FIELD_NUMBER = 3;
        public static final int FORECAST_UUID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int detailTimeBegin_;
        private int detailTimeEnd_;
        private GDIDataTypes.UUID forecastUuid_;
        private byte memoizedIsInitialized;
        private static final ForecastDetailQuery DEFAULT_INSTANCE = new ForecastDetailQuery();

        @Deprecated
        public static final Parser<ForecastDetailQuery> PARSER = new AbstractParser<ForecastDetailQuery>() { // from class: com.garmin.proto.generated.GDIInReachWeather.ForecastDetailQuery.1
            @Override // com.google.protobuf.Parser
            public ForecastDetailQuery parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ForecastDetailQuery.newBuilder();
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

        private ForecastDetailQuery(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.detailTimeBegin_ = 0;
            this.detailTimeEnd_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ForecastDetailQuery getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_ForecastDetailQuery_descriptor;
        }

        public static Builder newBuilder(ForecastDetailQuery forecastDetailQuery) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(forecastDetailQuery);
        }

        public static ForecastDetailQuery parseDelimitedFrom(InputStream inputStream) {
            return (ForecastDetailQuery) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ForecastDetailQuery parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ForecastDetailQuery> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ForecastDetailQuery)) {
                return super.equals(obj);
            }
            ForecastDetailQuery forecastDetailQuery = (ForecastDetailQuery) obj;
            if (hasForecastUuid() != forecastDetailQuery.hasForecastUuid()) {
                return false;
            }
            if ((hasForecastUuid() && !getForecastUuid().equals(forecastDetailQuery.getForecastUuid())) || hasDetailTimeBegin() != forecastDetailQuery.hasDetailTimeBegin()) {
                return false;
            }
            if ((!hasDetailTimeBegin() || getDetailTimeBegin() == forecastDetailQuery.getDetailTimeBegin()) && hasDetailTimeEnd() == forecastDetailQuery.hasDetailTimeEnd()) {
                return (!hasDetailTimeEnd() || getDetailTimeEnd() == forecastDetailQuery.getDetailTimeEnd()) && getUnknownFields().equals(forecastDetailQuery.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDetailQueryOrBuilder
        public int getDetailTimeBegin() {
            return this.detailTimeBegin_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDetailQueryOrBuilder
        public int getDetailTimeEnd() {
            return this.detailTimeEnd_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDetailQueryOrBuilder
        public GDIDataTypes.UUID getForecastUuid() {
            GDIDataTypes.UUID uuid = this.forecastUuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDetailQueryOrBuilder
        public GDIDataTypes.UUIDOrBuilder getForecastUuidOrBuilder() {
            GDIDataTypes.UUID uuid = this.forecastUuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ForecastDetailQuery> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getForecastUuid()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeFixed32Size(2, this.detailTimeBegin_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeFixed32Size(3, this.detailTimeEnd_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDetailQueryOrBuilder
        public boolean hasDetailTimeBegin() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDetailQueryOrBuilder
        public boolean hasDetailTimeEnd() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDetailQueryOrBuilder
        public boolean hasForecastUuid() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasForecastUuid()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getForecastUuid().hashCode();
            }
            if (hasDetailTimeBegin()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getDetailTimeBegin();
            }
            if (hasDetailTimeEnd()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getDetailTimeEnd();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_ForecastDetailQuery_fieldAccessorTable.ensureFieldAccessorsInitialized(ForecastDetailQuery.class, Builder.class);
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
            if (!hasForecastUuid() || getForecastUuid().isInitialized()) {
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
            return new ForecastDetailQuery();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getForecastUuid());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeFixed32(2, this.detailTimeBegin_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeFixed32(3, this.detailTimeEnd_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ForecastDetailQueryOrBuilder {
            private int bitField0_;
            private int detailTimeBegin_;
            private int detailTimeEnd_;
            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> forecastUuidBuilder_;
            private GDIDataTypes.UUID forecastUuid_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ForecastDetailQuery forecastDetailQuery) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.forecastUuidBuilder_;
                    forecastDetailQuery.forecastUuid_ = singleFieldBuilderV3 == null ? this.forecastUuid_ : (GDIDataTypes.UUID) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    forecastDetailQuery.detailTimeBegin_ = this.detailTimeBegin_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    forecastDetailQuery.detailTimeEnd_ = this.detailTimeEnd_;
                    i14 |= 4;
                }
                forecastDetailQuery.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_ForecastDetailQuery_descriptor;
            }

            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> getForecastUuidFieldBuilder() {
                if (this.forecastUuidBuilder_ == null) {
                    this.forecastUuidBuilder_ = new SingleFieldBuilderV3<>(getForecastUuid(), getParentForChildren(), isClean());
                    this.forecastUuid_ = null;
                }
                return this.forecastUuidBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getForecastUuidFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ForecastDetailQuery build() {
                ForecastDetailQuery forecastDetailQueryBuildPartial = buildPartial();
                if (forecastDetailQueryBuildPartial.isInitialized()) {
                    return forecastDetailQueryBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) forecastDetailQueryBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ForecastDetailQuery buildPartial() {
                ForecastDetailQuery forecastDetailQuery = new ForecastDetailQuery(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(forecastDetailQuery);
                }
                onBuilt();
                return forecastDetailQuery;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.forecastUuid_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.forecastUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.forecastUuidBuilder_ = null;
                }
                this.detailTimeBegin_ = 0;
                this.detailTimeEnd_ = 0;
                return this;
            }

            public Builder clearDetailTimeBegin() {
                this.bitField0_ &= -3;
                this.detailTimeBegin_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDetailTimeEnd() {
                this.bitField0_ &= -5;
                this.detailTimeEnd_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearForecastUuid() {
                this.bitField0_ &= -2;
                this.forecastUuid_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.forecastUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.forecastUuidBuilder_ = null;
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
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_ForecastDetailQuery_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDetailQueryOrBuilder
            public int getDetailTimeBegin() {
                return this.detailTimeBegin_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDetailQueryOrBuilder
            public int getDetailTimeEnd() {
                return this.detailTimeEnd_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDetailQueryOrBuilder
            public GDIDataTypes.UUID getForecastUuid() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.forecastUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUID) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.UUID uuid = this.forecastUuid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            public GDIDataTypes.UUID.Builder getForecastUuidBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (GDIDataTypes.UUID.Builder) getForecastUuidFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDetailQueryOrBuilder
            public GDIDataTypes.UUIDOrBuilder getForecastUuidOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.forecastUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUIDOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.UUID uuid = this.forecastUuid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDetailQueryOrBuilder
            public boolean hasDetailTimeBegin() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDetailQueryOrBuilder
            public boolean hasDetailTimeEnd() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastDetailQueryOrBuilder
            public boolean hasForecastUuid() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_ForecastDetailQuery_fieldAccessorTable.ensureFieldAccessorsInitialized(ForecastDetailQuery.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasForecastUuid() || getForecastUuid().isInitialized();
            }

            public Builder mergeForecastUuid(GDIDataTypes.UUID uuid) {
                GDIDataTypes.UUID uuid2;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.forecastUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(uuid);
                } else if ((this.bitField0_ & 1) == 0 || (uuid2 = this.forecastUuid_) == null || uuid2 == GDIDataTypes.UUID.getDefaultInstance()) {
                    this.forecastUuid_ = uuid;
                } else {
                    getForecastUuidBuilder().mergeFrom(uuid);
                }
                if (this.forecastUuid_ != null) {
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
                                    codedInputStream.readMessage(getForecastUuidFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 21) {
                                    this.detailTimeBegin_ = codedInputStream.readFixed32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 29) {
                                    this.detailTimeEnd_ = codedInputStream.readFixed32();
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

            public Builder setDetailTimeBegin(int i14) {
                this.detailTimeBegin_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setDetailTimeEnd(int i14) {
                this.detailTimeEnd_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setForecastUuid(GDIDataTypes.UUID.Builder builder) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.forecastUuidBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.forecastUuid_ = builder.build();
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
            public ForecastDetailQuery getDefaultInstanceForType() {
                return ForecastDetailQuery.getDefaultInstance();
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

            public Builder setForecastUuid(GDIDataTypes.UUID uuid) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.forecastUuidBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uuid.getClass();
                    this.forecastUuid_ = uuid;
                } else {
                    singleFieldBuilderV3.setMessage(uuid);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ForecastDetailQuery) {
                    return mergeFrom((ForecastDetailQuery) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ForecastDetailQuery forecastDetailQuery) {
                if (forecastDetailQuery == ForecastDetailQuery.getDefaultInstance()) {
                    return this;
                }
                if (forecastDetailQuery.hasForecastUuid()) {
                    mergeForecastUuid(forecastDetailQuery.getForecastUuid());
                }
                if (forecastDetailQuery.hasDetailTimeBegin()) {
                    setDetailTimeBegin(forecastDetailQuery.getDetailTimeBegin());
                }
                if (forecastDetailQuery.hasDetailTimeEnd()) {
                    setDetailTimeEnd(forecastDetailQuery.getDetailTimeEnd());
                }
                mergeUnknownFields(forecastDetailQuery.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ForecastDetailQuery getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ForecastDetailQuery parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ForecastDetailQuery) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ForecastDetailQuery parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ForecastDetailQuery parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ForecastDetailQuery parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ ForecastDetailQuery(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ForecastDetailQuery parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private ForecastDetailQuery() {
            this.detailTimeBegin_ = 0;
            this.detailTimeEnd_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ForecastDetailQuery parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ForecastDetailQuery parseFrom(InputStream inputStream) {
            return (ForecastDetailQuery) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ForecastDetailQuery parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ForecastDetailQuery) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ForecastDetailQuery parseFrom(CodedInputStream codedInputStream) {
            return (ForecastDetailQuery) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ForecastDetailQuery parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ForecastDetailQuery) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ForecastStatusNotification extends GeneratedMessageV3 implements ForecastStatusNotificationOrBuilder {
        public static final int FORECASTS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<Forecast> forecasts_;
        private byte memoizedIsInitialized;
        private static final ForecastStatusNotification DEFAULT_INSTANCE = new ForecastStatusNotification();

        @Deprecated
        public static final Parser<ForecastStatusNotification> PARSER = new AbstractParser<ForecastStatusNotification>() { // from class: com.garmin.proto.generated.GDIInReachWeather.ForecastStatusNotification.1
            @Override // com.google.protobuf.Parser
            public ForecastStatusNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ForecastStatusNotification.newBuilder();
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

        private ForecastStatusNotification() {
            this.memoizedIsInitialized = (byte) -1;
            this.forecasts_ = Collections.EMPTY_LIST;
        }

        public static ForecastStatusNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_ForecastStatusNotification_descriptor;
        }

        public static Builder newBuilder(ForecastStatusNotification forecastStatusNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(forecastStatusNotification);
        }

        public static ForecastStatusNotification parseDelimitedFrom(InputStream inputStream) {
            return (ForecastStatusNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ForecastStatusNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ForecastStatusNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ForecastStatusNotification)) {
                return super.equals(obj);
            }
            ForecastStatusNotification forecastStatusNotification = (ForecastStatusNotification) obj;
            return getForecastsList().equals(forecastStatusNotification.getForecastsList()) && getUnknownFields().equals(forecastStatusNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastStatusNotificationOrBuilder
        public Forecast getForecasts(int i14) {
            return this.forecasts_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastStatusNotificationOrBuilder
        public int getForecastsCount() {
            return this.forecasts_.size();
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastStatusNotificationOrBuilder
        public List<Forecast> getForecastsList() {
            return this.forecasts_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastStatusNotificationOrBuilder
        public ForecastOrBuilder getForecastsOrBuilder(int i14) {
            return this.forecasts_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastStatusNotificationOrBuilder
        public List<? extends ForecastOrBuilder> getForecastsOrBuilderList() {
            return this.forecasts_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ForecastStatusNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = 0;
            for (int i15 = 0; i15 < this.forecasts_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.forecasts_.get(i15));
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
            if (getForecastsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getForecastsList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_ForecastStatusNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ForecastStatusNotification.class, Builder.class);
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
            for (int i14 = 0; i14 < getForecastsCount(); i14++) {
                if (!getForecasts(i14).isInitialized()) {
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
            return new ForecastStatusNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.forecasts_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.forecasts_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ForecastStatusNotificationOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> forecastsBuilder_;
            private List<Forecast> forecasts_;

            private Builder() {
                this.forecasts_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(ForecastStatusNotification forecastStatusNotification) {
            }

            private void buildPartialRepeatedFields(ForecastStatusNotification forecastStatusNotification) {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    forecastStatusNotification.forecasts_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.forecasts_ = Collections.unmodifiableList(this.forecasts_);
                    this.bitField0_ &= -2;
                }
                forecastStatusNotification.forecasts_ = this.forecasts_;
            }

            private void ensureForecastsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.forecasts_ = new ArrayList(this.forecasts_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_ForecastStatusNotification_descriptor;
            }

            private RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> getForecastsFieldBuilder() {
                if (this.forecastsBuilder_ == null) {
                    this.forecastsBuilder_ = new RepeatedFieldBuilderV3<>(this.forecasts_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.forecasts_ = null;
                }
                return this.forecastsBuilder_;
            }

            public Builder addAllForecasts(Iterable<? extends Forecast> iterable) {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureForecastsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.forecasts_);
                onChanged();
                return this;
            }

            public Builder addForecasts(Forecast.Builder builder) {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureForecastsIsMutable();
                this.forecasts_.add(builder.build());
                onChanged();
                return this;
            }

            public Forecast.Builder addForecastsBuilder() {
                return (Forecast.Builder) getForecastsFieldBuilder().addBuilder(Forecast.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ForecastStatusNotification build() {
                ForecastStatusNotification forecastStatusNotificationBuildPartial = buildPartial();
                if (forecastStatusNotificationBuildPartial.isInitialized()) {
                    return forecastStatusNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) forecastStatusNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ForecastStatusNotification buildPartial() {
                ForecastStatusNotification forecastStatusNotification = new ForecastStatusNotification(this);
                buildPartialRepeatedFields(forecastStatusNotification);
                if (this.bitField0_ != 0) {
                    buildPartial0(forecastStatusNotification);
                }
                onBuilt();
                return forecastStatusNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.forecasts_ = Collections.EMPTY_LIST;
                } else {
                    this.forecasts_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearForecasts() {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.forecasts_ = Collections.EMPTY_LIST;
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
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_ForecastStatusNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastStatusNotificationOrBuilder
            public Forecast getForecasts(int i14) {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.forecasts_.get(i14) : (Forecast) repeatedFieldBuilderV3.getMessage(i14);
            }

            public Forecast.Builder getForecastsBuilder(int i14) {
                return (Forecast.Builder) getForecastsFieldBuilder().getBuilder(i14);
            }

            public List<Forecast.Builder> getForecastsBuilderList() {
                return getForecastsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastStatusNotificationOrBuilder
            public int getForecastsCount() {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.forecasts_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastStatusNotificationOrBuilder
            public List<Forecast> getForecastsList() {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.forecasts_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastStatusNotificationOrBuilder
            public ForecastOrBuilder getForecastsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.forecasts_.get(i14) : (ForecastOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.ForecastStatusNotificationOrBuilder
            public List<? extends ForecastOrBuilder> getForecastsOrBuilderList() {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.forecasts_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_ForecastStatusNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ForecastStatusNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i14 = 0; i14 < getForecastsCount(); i14++) {
                    if (!getForecasts(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(ForecastStatusNotification forecastStatusNotification) {
                if (forecastStatusNotification == ForecastStatusNotification.getDefaultInstance()) {
                    return this;
                }
                if (this.forecastsBuilder_ == null) {
                    if (!forecastStatusNotification.forecasts_.isEmpty()) {
                        if (this.forecasts_.isEmpty()) {
                            this.forecasts_ = forecastStatusNotification.forecasts_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureForecastsIsMutable();
                            this.forecasts_.addAll(forecastStatusNotification.forecasts_);
                        }
                        onChanged();
                    }
                } else if (!forecastStatusNotification.forecasts_.isEmpty()) {
                    boolean zIsEmpty = this.forecastsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastsBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.forecastsBuilder_ = null;
                        this.forecasts_ = forecastStatusNotification.forecasts_;
                        this.bitField0_ &= -2;
                        this.forecastsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getForecastsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(forecastStatusNotification.forecasts_);
                    }
                }
                mergeUnknownFields(forecastStatusNotification.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeForecasts(int i14) {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureForecastsIsMutable();
                this.forecasts_.remove(i14);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setForecasts(int i14, Forecast.Builder builder) {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureForecastsIsMutable();
                this.forecasts_.set(i14, builder.build());
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
            public ForecastStatusNotification getDefaultInstanceForType() {
                return ForecastStatusNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.forecasts_ = Collections.EMPTY_LIST;
            }

            public Forecast.Builder addForecastsBuilder(int i14) {
                return (Forecast.Builder) getForecastsFieldBuilder().addBuilder(i14, Forecast.getDefaultInstance());
            }

            public Builder addForecasts(int i14, Forecast forecast) {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    forecast.getClass();
                    ensureForecastsIsMutable();
                    this.forecasts_.add(i14, forecast);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, forecast);
                return this;
            }

            public Builder setForecasts(int i14, Forecast forecast) {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    forecast.getClass();
                    ensureForecastsIsMutable();
                    this.forecasts_.set(i14, forecast);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, forecast);
                return this;
            }

            public Builder addForecasts(Forecast forecast) {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    forecast.getClass();
                    ensureForecastsIsMutable();
                    this.forecasts_.add(forecast);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(forecast);
                return this;
            }

            public Builder addForecasts(int i14, Forecast.Builder builder) {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureForecastsIsMutable();
                    this.forecasts_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ForecastStatusNotification) {
                    return mergeFrom((ForecastStatusNotification) message);
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
                                    Forecast forecast = (Forecast) codedInputStream.readMessage(Forecast.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureForecastsIsMutable();
                                        this.forecasts_.add(forecast);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(forecast);
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
        public ForecastStatusNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ForecastStatusNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ForecastStatusNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ForecastStatusNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ForecastStatusNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ForecastStatusNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ForecastStatusNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ForecastStatusNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ ForecastStatusNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ForecastStatusNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ForecastStatusNotification parseFrom(InputStream inputStream) {
            return (ForecastStatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ForecastStatusNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ForecastStatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ForecastStatusNotification parseFrom(CodedInputStream codedInputStream) {
            return (ForecastStatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ForecastStatusNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ForecastStatusNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class GenericItemReferenceExt extends GeneratedMessageV3 implements GenericItemReferenceExtOrBuilder {
        public static final int DAY_SUMMARY_FIELD_NUMBER = 3;
        public static final int FORECAST_FIELD_NUMBER = 2;
        public static final int LAND_DETAIL_FIELD_NUMBER = 4;
        public static final int LOCATION_FIELD_NUMBER = 1;
        public static final int MARINE_DETAIL_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ForecastDaySummary daySummary_;
        private Forecast forecast_;
        private LandForecastDetail landDetail_;
        private Location location_;
        private MarineForecastDetail marineDetail_;
        private byte memoizedIsInitialized;
        private static final GenericItemReferenceExt DEFAULT_INSTANCE = new GenericItemReferenceExt();

        @Deprecated
        public static final Parser<GenericItemReferenceExt> PARSER = new AbstractParser<GenericItemReferenceExt>() { // from class: com.garmin.proto.generated.GDIInReachWeather.GenericItemReferenceExt.1
            @Override // com.google.protobuf.Parser
            public GenericItemReferenceExt parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GenericItemReferenceExt.newBuilder();
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

        private GenericItemReferenceExt(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GenericItemReferenceExt getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_GenericItemReferenceExt_descriptor;
        }

        public static Builder newBuilder(GenericItemReferenceExt genericItemReferenceExt) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(genericItemReferenceExt);
        }

        public static GenericItemReferenceExt parseDelimitedFrom(InputStream inputStream) {
            return (GenericItemReferenceExt) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GenericItemReferenceExt parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GenericItemReferenceExt> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GenericItemReferenceExt)) {
                return super.equals(obj);
            }
            GenericItemReferenceExt genericItemReferenceExt = (GenericItemReferenceExt) obj;
            if (hasLocation() != genericItemReferenceExt.hasLocation()) {
                return false;
            }
            if ((hasLocation() && !getLocation().equals(genericItemReferenceExt.getLocation())) || hasForecast() != genericItemReferenceExt.hasForecast()) {
                return false;
            }
            if ((hasForecast() && !getForecast().equals(genericItemReferenceExt.getForecast())) || hasDaySummary() != genericItemReferenceExt.hasDaySummary()) {
                return false;
            }
            if ((hasDaySummary() && !getDaySummary().equals(genericItemReferenceExt.getDaySummary())) || hasLandDetail() != genericItemReferenceExt.hasLandDetail()) {
                return false;
            }
            if ((!hasLandDetail() || getLandDetail().equals(genericItemReferenceExt.getLandDetail())) && hasMarineDetail() == genericItemReferenceExt.hasMarineDetail()) {
                return (!hasMarineDetail() || getMarineDetail().equals(genericItemReferenceExt.getMarineDetail())) && getUnknownFields().equals(genericItemReferenceExt.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.GenericItemReferenceExtOrBuilder
        public ForecastDaySummary getDaySummary() {
            ForecastDaySummary forecastDaySummary = this.daySummary_;
            return forecastDaySummary == null ? ForecastDaySummary.getDefaultInstance() : forecastDaySummary;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.GenericItemReferenceExtOrBuilder
        public ForecastDaySummaryOrBuilder getDaySummaryOrBuilder() {
            ForecastDaySummary forecastDaySummary = this.daySummary_;
            return forecastDaySummary == null ? ForecastDaySummary.getDefaultInstance() : forecastDaySummary;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.GenericItemReferenceExtOrBuilder
        public Forecast getForecast() {
            Forecast forecast = this.forecast_;
            return forecast == null ? Forecast.getDefaultInstance() : forecast;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.GenericItemReferenceExtOrBuilder
        public ForecastOrBuilder getForecastOrBuilder() {
            Forecast forecast = this.forecast_;
            return forecast == null ? Forecast.getDefaultInstance() : forecast;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.GenericItemReferenceExtOrBuilder
        public LandForecastDetail getLandDetail() {
            LandForecastDetail landForecastDetail = this.landDetail_;
            return landForecastDetail == null ? LandForecastDetail.getDefaultInstance() : landForecastDetail;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.GenericItemReferenceExtOrBuilder
        public LandForecastDetailOrBuilder getLandDetailOrBuilder() {
            LandForecastDetail landForecastDetail = this.landDetail_;
            return landForecastDetail == null ? LandForecastDetail.getDefaultInstance() : landForecastDetail;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.GenericItemReferenceExtOrBuilder
        public Location getLocation() {
            Location location = this.location_;
            return location == null ? Location.getDefaultInstance() : location;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.GenericItemReferenceExtOrBuilder
        public LocationOrBuilder getLocationOrBuilder() {
            Location location = this.location_;
            return location == null ? Location.getDefaultInstance() : location;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.GenericItemReferenceExtOrBuilder
        public MarineForecastDetail getMarineDetail() {
            MarineForecastDetail marineForecastDetail = this.marineDetail_;
            return marineForecastDetail == null ? MarineForecastDetail.getDefaultInstance() : marineForecastDetail;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.GenericItemReferenceExtOrBuilder
        public MarineForecastDetailOrBuilder getMarineDetailOrBuilder() {
            MarineForecastDetail marineForecastDetail = this.marineDetail_;
            return marineForecastDetail == null ? MarineForecastDetail.getDefaultInstance() : marineForecastDetail;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GenericItemReferenceExt> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getLocation()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getForecast());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getDaySummary());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getLandDetail());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getMarineDetail());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.GenericItemReferenceExtOrBuilder
        public boolean hasDaySummary() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.GenericItemReferenceExtOrBuilder
        public boolean hasForecast() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.GenericItemReferenceExtOrBuilder
        public boolean hasLandDetail() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.GenericItemReferenceExtOrBuilder
        public boolean hasLocation() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.GenericItemReferenceExtOrBuilder
        public boolean hasMarineDetail() {
            return (this.bitField0_ & 16) != 0;
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
            if (hasForecast()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getForecast().hashCode();
            }
            if (hasDaySummary()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getDaySummary().hashCode();
            }
            if (hasLandDetail()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getLandDetail().hashCode();
            }
            if (hasMarineDetail()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getMarineDetail().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_GenericItemReferenceExt_fieldAccessorTable.ensureFieldAccessorsInitialized(GenericItemReferenceExt.class, Builder.class);
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
            if (hasLocation() && !getLocation().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasForecast() && !getForecast().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasDaySummary() && !getDaySummary().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasLandDetail() && !getLandDetail().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasMarineDetail() || getMarineDetail().isInitialized()) {
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
            return new GenericItemReferenceExt();
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
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getForecast());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getDaySummary());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getLandDetail());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getMarineDetail());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GenericItemReferenceExtOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<ForecastDaySummary, ForecastDaySummary.Builder, ForecastDaySummaryOrBuilder> daySummaryBuilder_;
            private ForecastDaySummary daySummary_;
            private SingleFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> forecastBuilder_;
            private Forecast forecast_;
            private SingleFieldBuilderV3<LandForecastDetail, LandForecastDetail.Builder, LandForecastDetailOrBuilder> landDetailBuilder_;
            private LandForecastDetail landDetail_;
            private SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> locationBuilder_;
            private Location location_;
            private SingleFieldBuilderV3<MarineForecastDetail, MarineForecastDetail.Builder, MarineForecastDetailOrBuilder> marineDetailBuilder_;
            private MarineForecastDetail marineDetail_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(GenericItemReferenceExt genericItemReferenceExt) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                    genericItemReferenceExt.location_ = singleFieldBuilderV3 == null ? this.location_ : (Location) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> singleFieldBuilderV4 = this.forecastBuilder_;
                    genericItemReferenceExt.forecast_ = singleFieldBuilderV4 == null ? this.forecast_ : (Forecast) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<ForecastDaySummary, ForecastDaySummary.Builder, ForecastDaySummaryOrBuilder> singleFieldBuilderV5 = this.daySummaryBuilder_;
                    genericItemReferenceExt.daySummary_ = singleFieldBuilderV5 == null ? this.daySummary_ : (ForecastDaySummary) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<LandForecastDetail, LandForecastDetail.Builder, LandForecastDetailOrBuilder> singleFieldBuilderV6 = this.landDetailBuilder_;
                    genericItemReferenceExt.landDetail_ = singleFieldBuilderV6 == null ? this.landDetail_ : (LandForecastDetail) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<MarineForecastDetail, MarineForecastDetail.Builder, MarineForecastDetailOrBuilder> singleFieldBuilderV7 = this.marineDetailBuilder_;
                    genericItemReferenceExt.marineDetail_ = singleFieldBuilderV7 == null ? this.marineDetail_ : (MarineForecastDetail) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                genericItemReferenceExt.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<ForecastDaySummary, ForecastDaySummary.Builder, ForecastDaySummaryOrBuilder> getDaySummaryFieldBuilder() {
                if (this.daySummaryBuilder_ == null) {
                    this.daySummaryBuilder_ = new SingleFieldBuilderV3<>(getDaySummary(), getParentForChildren(), isClean());
                    this.daySummary_ = null;
                }
                return this.daySummaryBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_GenericItemReferenceExt_descriptor;
            }

            private SingleFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> getForecastFieldBuilder() {
                if (this.forecastBuilder_ == null) {
                    this.forecastBuilder_ = new SingleFieldBuilderV3<>(getForecast(), getParentForChildren(), isClean());
                    this.forecast_ = null;
                }
                return this.forecastBuilder_;
            }

            private SingleFieldBuilderV3<LandForecastDetail, LandForecastDetail.Builder, LandForecastDetailOrBuilder> getLandDetailFieldBuilder() {
                if (this.landDetailBuilder_ == null) {
                    this.landDetailBuilder_ = new SingleFieldBuilderV3<>(getLandDetail(), getParentForChildren(), isClean());
                    this.landDetail_ = null;
                }
                return this.landDetailBuilder_;
            }

            private SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> getLocationFieldBuilder() {
                if (this.locationBuilder_ == null) {
                    this.locationBuilder_ = new SingleFieldBuilderV3<>(getLocation(), getParentForChildren(), isClean());
                    this.location_ = null;
                }
                return this.locationBuilder_;
            }

            private SingleFieldBuilderV3<MarineForecastDetail, MarineForecastDetail.Builder, MarineForecastDetailOrBuilder> getMarineDetailFieldBuilder() {
                if (this.marineDetailBuilder_ == null) {
                    this.marineDetailBuilder_ = new SingleFieldBuilderV3<>(getMarineDetail(), getParentForChildren(), isClean());
                    this.marineDetail_ = null;
                }
                return this.marineDetailBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getLocationFieldBuilder();
                    getForecastFieldBuilder();
                    getDaySummaryFieldBuilder();
                    getLandDetailFieldBuilder();
                    getMarineDetailFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GenericItemReferenceExt build() {
                GenericItemReferenceExt genericItemReferenceExtBuildPartial = buildPartial();
                if (genericItemReferenceExtBuildPartial.isInitialized()) {
                    return genericItemReferenceExtBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) genericItemReferenceExtBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GenericItemReferenceExt buildPartial() {
                GenericItemReferenceExt genericItemReferenceExt = new GenericItemReferenceExt(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(genericItemReferenceExt);
                }
                onBuilt();
                return genericItemReferenceExt;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.location_ = null;
                SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.locationBuilder_ = null;
                }
                this.forecast_ = null;
                SingleFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> singleFieldBuilderV4 = this.forecastBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.forecastBuilder_ = null;
                }
                this.daySummary_ = null;
                SingleFieldBuilderV3<ForecastDaySummary, ForecastDaySummary.Builder, ForecastDaySummaryOrBuilder> singleFieldBuilderV5 = this.daySummaryBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.daySummaryBuilder_ = null;
                }
                this.landDetail_ = null;
                SingleFieldBuilderV3<LandForecastDetail, LandForecastDetail.Builder, LandForecastDetailOrBuilder> singleFieldBuilderV6 = this.landDetailBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.landDetailBuilder_ = null;
                }
                this.marineDetail_ = null;
                SingleFieldBuilderV3<MarineForecastDetail, MarineForecastDetail.Builder, MarineForecastDetailOrBuilder> singleFieldBuilderV7 = this.marineDetailBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.marineDetailBuilder_ = null;
                }
                return this;
            }

            public Builder clearDaySummary() {
                this.bitField0_ &= -5;
                this.daySummary_ = null;
                SingleFieldBuilderV3<ForecastDaySummary, ForecastDaySummary.Builder, ForecastDaySummaryOrBuilder> singleFieldBuilderV3 = this.daySummaryBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.daySummaryBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearForecast() {
                this.bitField0_ &= -3;
                this.forecast_ = null;
                SingleFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> singleFieldBuilderV3 = this.forecastBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.forecastBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearLandDetail() {
                this.bitField0_ &= -9;
                this.landDetail_ = null;
                SingleFieldBuilderV3<LandForecastDetail, LandForecastDetail.Builder, LandForecastDetailOrBuilder> singleFieldBuilderV3 = this.landDetailBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.landDetailBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearLocation() {
                this.bitField0_ &= -2;
                this.location_ = null;
                SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.locationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearMarineDetail() {
                this.bitField0_ &= -17;
                this.marineDetail_ = null;
                SingleFieldBuilderV3<MarineForecastDetail, MarineForecastDetail.Builder, MarineForecastDetailOrBuilder> singleFieldBuilderV3 = this.marineDetailBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.marineDetailBuilder_ = null;
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

            @Override // com.garmin.proto.generated.GDIInReachWeather.GenericItemReferenceExtOrBuilder
            public ForecastDaySummary getDaySummary() {
                SingleFieldBuilderV3<ForecastDaySummary, ForecastDaySummary.Builder, ForecastDaySummaryOrBuilder> singleFieldBuilderV3 = this.daySummaryBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ForecastDaySummary) singleFieldBuilderV3.getMessage();
                }
                ForecastDaySummary forecastDaySummary = this.daySummary_;
                return forecastDaySummary == null ? ForecastDaySummary.getDefaultInstance() : forecastDaySummary;
            }

            public ForecastDaySummary.Builder getDaySummaryBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (ForecastDaySummary.Builder) getDaySummaryFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.GenericItemReferenceExtOrBuilder
            public ForecastDaySummaryOrBuilder getDaySummaryOrBuilder() {
                SingleFieldBuilderV3<ForecastDaySummary, ForecastDaySummary.Builder, ForecastDaySummaryOrBuilder> singleFieldBuilderV3 = this.daySummaryBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ForecastDaySummaryOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ForecastDaySummary forecastDaySummary = this.daySummary_;
                return forecastDaySummary == null ? ForecastDaySummary.getDefaultInstance() : forecastDaySummary;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_GenericItemReferenceExt_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.GenericItemReferenceExtOrBuilder
            public Forecast getForecast() {
                SingleFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> singleFieldBuilderV3 = this.forecastBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Forecast) singleFieldBuilderV3.getMessage();
                }
                Forecast forecast = this.forecast_;
                return forecast == null ? Forecast.getDefaultInstance() : forecast;
            }

            public Forecast.Builder getForecastBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (Forecast.Builder) getForecastFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.GenericItemReferenceExtOrBuilder
            public ForecastOrBuilder getForecastOrBuilder() {
                SingleFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> singleFieldBuilderV3 = this.forecastBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ForecastOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Forecast forecast = this.forecast_;
                return forecast == null ? Forecast.getDefaultInstance() : forecast;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.GenericItemReferenceExtOrBuilder
            public LandForecastDetail getLandDetail() {
                SingleFieldBuilderV3<LandForecastDetail, LandForecastDetail.Builder, LandForecastDetailOrBuilder> singleFieldBuilderV3 = this.landDetailBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LandForecastDetail) singleFieldBuilderV3.getMessage();
                }
                LandForecastDetail landForecastDetail = this.landDetail_;
                return landForecastDetail == null ? LandForecastDetail.getDefaultInstance() : landForecastDetail;
            }

            public LandForecastDetail.Builder getLandDetailBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (LandForecastDetail.Builder) getLandDetailFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.GenericItemReferenceExtOrBuilder
            public LandForecastDetailOrBuilder getLandDetailOrBuilder() {
                SingleFieldBuilderV3<LandForecastDetail, LandForecastDetail.Builder, LandForecastDetailOrBuilder> singleFieldBuilderV3 = this.landDetailBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LandForecastDetailOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LandForecastDetail landForecastDetail = this.landDetail_;
                return landForecastDetail == null ? LandForecastDetail.getDefaultInstance() : landForecastDetail;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.GenericItemReferenceExtOrBuilder
            public Location getLocation() {
                SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Location) singleFieldBuilderV3.getMessage();
                }
                Location location = this.location_;
                return location == null ? Location.getDefaultInstance() : location;
            }

            public Location.Builder getLocationBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (Location.Builder) getLocationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.GenericItemReferenceExtOrBuilder
            public LocationOrBuilder getLocationOrBuilder() {
                SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LocationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Location location = this.location_;
                return location == null ? Location.getDefaultInstance() : location;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.GenericItemReferenceExtOrBuilder
            public MarineForecastDetail getMarineDetail() {
                SingleFieldBuilderV3<MarineForecastDetail, MarineForecastDetail.Builder, MarineForecastDetailOrBuilder> singleFieldBuilderV3 = this.marineDetailBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (MarineForecastDetail) singleFieldBuilderV3.getMessage();
                }
                MarineForecastDetail marineForecastDetail = this.marineDetail_;
                return marineForecastDetail == null ? MarineForecastDetail.getDefaultInstance() : marineForecastDetail;
            }

            public MarineForecastDetail.Builder getMarineDetailBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (MarineForecastDetail.Builder) getMarineDetailFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.GenericItemReferenceExtOrBuilder
            public MarineForecastDetailOrBuilder getMarineDetailOrBuilder() {
                SingleFieldBuilderV3<MarineForecastDetail, MarineForecastDetail.Builder, MarineForecastDetailOrBuilder> singleFieldBuilderV3 = this.marineDetailBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (MarineForecastDetailOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                MarineForecastDetail marineForecastDetail = this.marineDetail_;
                return marineForecastDetail == null ? MarineForecastDetail.getDefaultInstance() : marineForecastDetail;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.GenericItemReferenceExtOrBuilder
            public boolean hasDaySummary() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.GenericItemReferenceExtOrBuilder
            public boolean hasForecast() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.GenericItemReferenceExtOrBuilder
            public boolean hasLandDetail() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.GenericItemReferenceExtOrBuilder
            public boolean hasLocation() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.GenericItemReferenceExtOrBuilder
            public boolean hasMarineDetail() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_GenericItemReferenceExt_fieldAccessorTable.ensureFieldAccessorsInitialized(GenericItemReferenceExt.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasLocation() && !getLocation().isInitialized()) {
                    return false;
                }
                if (hasForecast() && !getForecast().isInitialized()) {
                    return false;
                }
                if (hasDaySummary() && !getDaySummary().isInitialized()) {
                    return false;
                }
                if (!hasLandDetail() || getLandDetail().isInitialized()) {
                    return !hasMarineDetail() || getMarineDetail().isInitialized();
                }
                return false;
            }

            public Builder mergeDaySummary(ForecastDaySummary forecastDaySummary) {
                ForecastDaySummary forecastDaySummary2;
                SingleFieldBuilderV3<ForecastDaySummary, ForecastDaySummary.Builder, ForecastDaySummaryOrBuilder> singleFieldBuilderV3 = this.daySummaryBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(forecastDaySummary);
                } else if ((this.bitField0_ & 4) == 0 || (forecastDaySummary2 = this.daySummary_) == null || forecastDaySummary2 == ForecastDaySummary.getDefaultInstance()) {
                    this.daySummary_ = forecastDaySummary;
                } else {
                    getDaySummaryBuilder().mergeFrom(forecastDaySummary);
                }
                if (this.daySummary_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeForecast(Forecast forecast) {
                Forecast forecast2;
                SingleFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> singleFieldBuilderV3 = this.forecastBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(forecast);
                } else if ((this.bitField0_ & 2) == 0 || (forecast2 = this.forecast_) == null || forecast2 == Forecast.getDefaultInstance()) {
                    this.forecast_ = forecast;
                } else {
                    getForecastBuilder().mergeFrom(forecast);
                }
                if (this.forecast_ != null) {
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
                                    codedInputStream.readMessage(getLocationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getForecastFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getDaySummaryFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getLandDetailFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(getMarineDetailFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeLandDetail(LandForecastDetail landForecastDetail) {
                LandForecastDetail landForecastDetail2;
                SingleFieldBuilderV3<LandForecastDetail, LandForecastDetail.Builder, LandForecastDetailOrBuilder> singleFieldBuilderV3 = this.landDetailBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(landForecastDetail);
                } else if ((this.bitField0_ & 8) == 0 || (landForecastDetail2 = this.landDetail_) == null || landForecastDetail2 == LandForecastDetail.getDefaultInstance()) {
                    this.landDetail_ = landForecastDetail;
                } else {
                    getLandDetailBuilder().mergeFrom(landForecastDetail);
                }
                if (this.landDetail_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeLocation(Location location) {
                Location location2;
                SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(location);
                } else if ((this.bitField0_ & 1) == 0 || (location2 = this.location_) == null || location2 == Location.getDefaultInstance()) {
                    this.location_ = location;
                } else {
                    getLocationBuilder().mergeFrom(location);
                }
                if (this.location_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeMarineDetail(MarineForecastDetail marineForecastDetail) {
                MarineForecastDetail marineForecastDetail2;
                SingleFieldBuilderV3<MarineForecastDetail, MarineForecastDetail.Builder, MarineForecastDetailOrBuilder> singleFieldBuilderV3 = this.marineDetailBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(marineForecastDetail);
                } else if ((this.bitField0_ & 16) == 0 || (marineForecastDetail2 = this.marineDetail_) == null || marineForecastDetail2 == MarineForecastDetail.getDefaultInstance()) {
                    this.marineDetail_ = marineForecastDetail;
                } else {
                    getMarineDetailBuilder().mergeFrom(marineForecastDetail);
                }
                if (this.marineDetail_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setDaySummary(ForecastDaySummary.Builder builder) {
                SingleFieldBuilderV3<ForecastDaySummary, ForecastDaySummary.Builder, ForecastDaySummaryOrBuilder> singleFieldBuilderV3 = this.daySummaryBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.daySummary_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setForecast(Forecast.Builder builder) {
                SingleFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> singleFieldBuilderV3 = this.forecastBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.forecast_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setLandDetail(LandForecastDetail.Builder builder) {
                SingleFieldBuilderV3<LandForecastDetail, LandForecastDetail.Builder, LandForecastDetailOrBuilder> singleFieldBuilderV3 = this.landDetailBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.landDetail_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setLocation(Location.Builder builder) {
                SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.location_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setMarineDetail(MarineForecastDetail.Builder builder) {
                SingleFieldBuilderV3<MarineForecastDetail, MarineForecastDetail.Builder, MarineForecastDetailOrBuilder> singleFieldBuilderV3 = this.marineDetailBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.marineDetail_ = builder.build();
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
            public GenericItemReferenceExt getDefaultInstanceForType() {
                return GenericItemReferenceExt.getDefaultInstance();
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

            public Builder setDaySummary(ForecastDaySummary forecastDaySummary) {
                SingleFieldBuilderV3<ForecastDaySummary, ForecastDaySummary.Builder, ForecastDaySummaryOrBuilder> singleFieldBuilderV3 = this.daySummaryBuilder_;
                if (singleFieldBuilderV3 == null) {
                    forecastDaySummary.getClass();
                    this.daySummary_ = forecastDaySummary;
                } else {
                    singleFieldBuilderV3.setMessage(forecastDaySummary);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setForecast(Forecast forecast) {
                SingleFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> singleFieldBuilderV3 = this.forecastBuilder_;
                if (singleFieldBuilderV3 == null) {
                    forecast.getClass();
                    this.forecast_ = forecast;
                } else {
                    singleFieldBuilderV3.setMessage(forecast);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setLandDetail(LandForecastDetail landForecastDetail) {
                SingleFieldBuilderV3<LandForecastDetail, LandForecastDetail.Builder, LandForecastDetailOrBuilder> singleFieldBuilderV3 = this.landDetailBuilder_;
                if (singleFieldBuilderV3 == null) {
                    landForecastDetail.getClass();
                    this.landDetail_ = landForecastDetail;
                } else {
                    singleFieldBuilderV3.setMessage(landForecastDetail);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setLocation(Location location) {
                SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    location.getClass();
                    this.location_ = location;
                } else {
                    singleFieldBuilderV3.setMessage(location);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setMarineDetail(MarineForecastDetail marineForecastDetail) {
                SingleFieldBuilderV3<MarineForecastDetail, MarineForecastDetail.Builder, MarineForecastDetailOrBuilder> singleFieldBuilderV3 = this.marineDetailBuilder_;
                if (singleFieldBuilderV3 == null) {
                    marineForecastDetail.getClass();
                    this.marineDetail_ = marineForecastDetail;
                } else {
                    singleFieldBuilderV3.setMessage(marineForecastDetail);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GenericItemReferenceExt) {
                    return mergeFrom((GenericItemReferenceExt) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GenericItemReferenceExt genericItemReferenceExt) {
                if (genericItemReferenceExt == GenericItemReferenceExt.getDefaultInstance()) {
                    return this;
                }
                if (genericItemReferenceExt.hasLocation()) {
                    mergeLocation(genericItemReferenceExt.getLocation());
                }
                if (genericItemReferenceExt.hasForecast()) {
                    mergeForecast(genericItemReferenceExt.getForecast());
                }
                if (genericItemReferenceExt.hasDaySummary()) {
                    mergeDaySummary(genericItemReferenceExt.getDaySummary());
                }
                if (genericItemReferenceExt.hasLandDetail()) {
                    mergeLandDetail(genericItemReferenceExt.getLandDetail());
                }
                if (genericItemReferenceExt.hasMarineDetail()) {
                    mergeMarineDetail(genericItemReferenceExt.getMarineDetail());
                }
                mergeUnknownFields(genericItemReferenceExt.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GenericItemReferenceExt getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ GenericItemReferenceExt(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private GenericItemReferenceExt() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GenericItemReferenceExt parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GenericItemReferenceExt) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GenericItemReferenceExt parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GenericItemReferenceExt parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GenericItemReferenceExt parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GenericItemReferenceExt parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GenericItemReferenceExt parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GenericItemReferenceExt parseFrom(InputStream inputStream) {
            return (GenericItemReferenceExt) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GenericItemReferenceExt parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GenericItemReferenceExt) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GenericItemReferenceExt parseFrom(CodedInputStream codedInputStream) {
            return (GenericItemReferenceExt) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GenericItemReferenceExt parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GenericItemReferenceExt) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class InReachWeatherService extends GeneratedMessageV3 implements InReachWeatherServiceOrBuilder {
        public static final int CAPABILITIES_REQUEST_FIELD_NUMBER = 1;
        public static final int CAPABILITIES_RESPONSE_FIELD_NUMBER = 2;
        public static final int FORECAST_STATUS_NOTIFICATION_FIELD_NUMBER = 10;
        public static final int LOCATION_MODIFIED_NOTIFICATION_FIELD_NUMBER = 9;
        public static final int REQUEST_FORECAST_REQUEST_FIELD_NUMBER = 3;
        public static final int REQUEST_FORECAST_RESPONSE_FIELD_NUMBER = 4;
        public static final int SUBSCRIBE_REQUEST_FIELD_NUMBER = 7;
        public static final int SUBSCRIBE_RESPONSE_FIELD_NUMBER = 8;
        public static final int SYNC_REQUEST_FIELD_NUMBER = 5;
        public static final int SYNC_RESPONSE_FIELD_NUMBER = 6;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private CapabilitiesRequest capabilitiesRequest_;
        private CapabilitiesResponse capabilitiesResponse_;
        private ForecastStatusNotification forecastStatusNotification_;
        private LocationModifiedNotification locationModifiedNotification_;
        private byte memoizedIsInitialized;
        private RequestForecastRequest requestForecastRequest_;
        private RequestForecastResponse requestForecastResponse_;
        private SubscribeRequest subscribeRequest_;
        private SubscribeResponse subscribeResponse_;
        private SyncRequest syncRequest_;
        private SyncResponse syncResponse_;
        private static final InReachWeatherService DEFAULT_INSTANCE = new InReachWeatherService();

        @Deprecated
        public static final Parser<InReachWeatherService> PARSER = new AbstractParser<InReachWeatherService>() { // from class: com.garmin.proto.generated.GDIInReachWeather.InReachWeatherService.1
            @Override // com.google.protobuf.Parser
            public InReachWeatherService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = InReachWeatherService.newBuilder();
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

        private InReachWeatherService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static InReachWeatherService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_InReachWeatherService_descriptor;
        }

        public static Builder newBuilder(InReachWeatherService inReachWeatherService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(inReachWeatherService);
        }

        public static InReachWeatherService parseDelimitedFrom(InputStream inputStream) {
            return (InReachWeatherService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static InReachWeatherService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<InReachWeatherService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InReachWeatherService)) {
                return super.equals(obj);
            }
            InReachWeatherService inReachWeatherService = (InReachWeatherService) obj;
            if (hasCapabilitiesRequest() != inReachWeatherService.hasCapabilitiesRequest()) {
                return false;
            }
            if ((hasCapabilitiesRequest() && !getCapabilitiesRequest().equals(inReachWeatherService.getCapabilitiesRequest())) || hasCapabilitiesResponse() != inReachWeatherService.hasCapabilitiesResponse()) {
                return false;
            }
            if ((hasCapabilitiesResponse() && !getCapabilitiesResponse().equals(inReachWeatherService.getCapabilitiesResponse())) || hasRequestForecastRequest() != inReachWeatherService.hasRequestForecastRequest()) {
                return false;
            }
            if ((hasRequestForecastRequest() && !getRequestForecastRequest().equals(inReachWeatherService.getRequestForecastRequest())) || hasRequestForecastResponse() != inReachWeatherService.hasRequestForecastResponse()) {
                return false;
            }
            if ((hasRequestForecastResponse() && !getRequestForecastResponse().equals(inReachWeatherService.getRequestForecastResponse())) || hasSyncRequest() != inReachWeatherService.hasSyncRequest()) {
                return false;
            }
            if ((hasSyncRequest() && !getSyncRequest().equals(inReachWeatherService.getSyncRequest())) || hasSyncResponse() != inReachWeatherService.hasSyncResponse()) {
                return false;
            }
            if ((hasSyncResponse() && !getSyncResponse().equals(inReachWeatherService.getSyncResponse())) || hasSubscribeRequest() != inReachWeatherService.hasSubscribeRequest()) {
                return false;
            }
            if ((hasSubscribeRequest() && !getSubscribeRequest().equals(inReachWeatherService.getSubscribeRequest())) || hasSubscribeResponse() != inReachWeatherService.hasSubscribeResponse()) {
                return false;
            }
            if ((hasSubscribeResponse() && !getSubscribeResponse().equals(inReachWeatherService.getSubscribeResponse())) || hasLocationModifiedNotification() != inReachWeatherService.hasLocationModifiedNotification()) {
                return false;
            }
            if ((!hasLocationModifiedNotification() || getLocationModifiedNotification().equals(inReachWeatherService.getLocationModifiedNotification())) && hasForecastStatusNotification() == inReachWeatherService.hasForecastStatusNotification()) {
                return (!hasForecastStatusNotification() || getForecastStatusNotification().equals(inReachWeatherService.getForecastStatusNotification())) && getUnknownFields().equals(inReachWeatherService.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
        public CapabilitiesRequest getCapabilitiesRequest() {
            CapabilitiesRequest capabilitiesRequest = this.capabilitiesRequest_;
            return capabilitiesRequest == null ? CapabilitiesRequest.getDefaultInstance() : capabilitiesRequest;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
        public CapabilitiesRequestOrBuilder getCapabilitiesRequestOrBuilder() {
            CapabilitiesRequest capabilitiesRequest = this.capabilitiesRequest_;
            return capabilitiesRequest == null ? CapabilitiesRequest.getDefaultInstance() : capabilitiesRequest;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
        public CapabilitiesResponse getCapabilitiesResponse() {
            CapabilitiesResponse capabilitiesResponse = this.capabilitiesResponse_;
            return capabilitiesResponse == null ? CapabilitiesResponse.getDefaultInstance() : capabilitiesResponse;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
        public CapabilitiesResponseOrBuilder getCapabilitiesResponseOrBuilder() {
            CapabilitiesResponse capabilitiesResponse = this.capabilitiesResponse_;
            return capabilitiesResponse == null ? CapabilitiesResponse.getDefaultInstance() : capabilitiesResponse;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
        public ForecastStatusNotification getForecastStatusNotification() {
            ForecastStatusNotification forecastStatusNotification = this.forecastStatusNotification_;
            return forecastStatusNotification == null ? ForecastStatusNotification.getDefaultInstance() : forecastStatusNotification;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
        public ForecastStatusNotificationOrBuilder getForecastStatusNotificationOrBuilder() {
            ForecastStatusNotification forecastStatusNotification = this.forecastStatusNotification_;
            return forecastStatusNotification == null ? ForecastStatusNotification.getDefaultInstance() : forecastStatusNotification;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
        public LocationModifiedNotification getLocationModifiedNotification() {
            LocationModifiedNotification locationModifiedNotification = this.locationModifiedNotification_;
            return locationModifiedNotification == null ? LocationModifiedNotification.getDefaultInstance() : locationModifiedNotification;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
        public LocationModifiedNotificationOrBuilder getLocationModifiedNotificationOrBuilder() {
            LocationModifiedNotification locationModifiedNotification = this.locationModifiedNotification_;
            return locationModifiedNotification == null ? LocationModifiedNotification.getDefaultInstance() : locationModifiedNotification;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<InReachWeatherService> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
        public RequestForecastRequest getRequestForecastRequest() {
            RequestForecastRequest requestForecastRequest = this.requestForecastRequest_;
            return requestForecastRequest == null ? RequestForecastRequest.getDefaultInstance() : requestForecastRequest;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
        public RequestForecastRequestOrBuilder getRequestForecastRequestOrBuilder() {
            RequestForecastRequest requestForecastRequest = this.requestForecastRequest_;
            return requestForecastRequest == null ? RequestForecastRequest.getDefaultInstance() : requestForecastRequest;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
        public RequestForecastResponse getRequestForecastResponse() {
            RequestForecastResponse requestForecastResponse = this.requestForecastResponse_;
            return requestForecastResponse == null ? RequestForecastResponse.getDefaultInstance() : requestForecastResponse;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
        public RequestForecastResponseOrBuilder getRequestForecastResponseOrBuilder() {
            RequestForecastResponse requestForecastResponse = this.requestForecastResponse_;
            return requestForecastResponse == null ? RequestForecastResponse.getDefaultInstance() : requestForecastResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getCapabilitiesRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getCapabilitiesResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getRequestForecastRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getRequestForecastResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getSyncRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getSyncResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getSubscribeRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, getSubscribeResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(9, getLocationModifiedNotification());
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(10, getForecastStatusNotification());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
        public SubscribeRequest getSubscribeRequest() {
            SubscribeRequest subscribeRequest = this.subscribeRequest_;
            return subscribeRequest == null ? SubscribeRequest.getDefaultInstance() : subscribeRequest;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
        public SubscribeRequestOrBuilder getSubscribeRequestOrBuilder() {
            SubscribeRequest subscribeRequest = this.subscribeRequest_;
            return subscribeRequest == null ? SubscribeRequest.getDefaultInstance() : subscribeRequest;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
        public SubscribeResponse getSubscribeResponse() {
            SubscribeResponse subscribeResponse = this.subscribeResponse_;
            return subscribeResponse == null ? SubscribeResponse.getDefaultInstance() : subscribeResponse;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
        public SubscribeResponseOrBuilder getSubscribeResponseOrBuilder() {
            SubscribeResponse subscribeResponse = this.subscribeResponse_;
            return subscribeResponse == null ? SubscribeResponse.getDefaultInstance() : subscribeResponse;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
        public SyncRequest getSyncRequest() {
            SyncRequest syncRequest = this.syncRequest_;
            return syncRequest == null ? SyncRequest.getDefaultInstance() : syncRequest;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
        public SyncRequestOrBuilder getSyncRequestOrBuilder() {
            SyncRequest syncRequest = this.syncRequest_;
            return syncRequest == null ? SyncRequest.getDefaultInstance() : syncRequest;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
        public SyncResponse getSyncResponse() {
            SyncResponse syncResponse = this.syncResponse_;
            return syncResponse == null ? SyncResponse.getDefaultInstance() : syncResponse;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
        public SyncResponseOrBuilder getSyncResponseOrBuilder() {
            SyncResponse syncResponse = this.syncResponse_;
            return syncResponse == null ? SyncResponse.getDefaultInstance() : syncResponse;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
        public boolean hasCapabilitiesRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
        public boolean hasCapabilitiesResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
        public boolean hasForecastStatusNotification() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
        public boolean hasLocationModifiedNotification() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
        public boolean hasRequestForecastRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
        public boolean hasRequestForecastResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
        public boolean hasSubscribeRequest() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
        public boolean hasSubscribeResponse() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
        public boolean hasSyncRequest() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
        public boolean hasSyncResponse() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCapabilitiesRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getCapabilitiesRequest().hashCode();
            }
            if (hasCapabilitiesResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getCapabilitiesResponse().hashCode();
            }
            if (hasRequestForecastRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getRequestForecastRequest().hashCode();
            }
            if (hasRequestForecastResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getRequestForecastResponse().hashCode();
            }
            if (hasSyncRequest()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getSyncRequest().hashCode();
            }
            if (hasSyncResponse()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getSyncResponse().hashCode();
            }
            if (hasSubscribeRequest()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getSubscribeRequest().hashCode();
            }
            if (hasSubscribeResponse()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getSubscribeResponse().hashCode();
            }
            if (hasLocationModifiedNotification()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getLocationModifiedNotification().hashCode();
            }
            if (hasForecastStatusNotification()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getForecastStatusNotification().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_InReachWeatherService_fieldAccessorTable.ensureFieldAccessorsInitialized(InReachWeatherService.class, Builder.class);
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
            if (hasRequestForecastRequest() && !getRequestForecastRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasRequestForecastResponse() && !getRequestForecastResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSyncRequest() && !getSyncRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSyncResponse() && !getSyncResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSubscribeResponse() && !getSubscribeResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasLocationModifiedNotification() && !getLocationModifiedNotification().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasForecastStatusNotification() || getForecastStatusNotification().isInitialized()) {
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
            return new InReachWeatherService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getCapabilitiesRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getCapabilitiesResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getRequestForecastRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getRequestForecastResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getSyncRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getSyncResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getSubscribeRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(8, getSubscribeResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(9, getLocationModifiedNotification());
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeMessage(10, getForecastStatusNotification());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements InReachWeatherServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<CapabilitiesRequest, CapabilitiesRequest.Builder, CapabilitiesRequestOrBuilder> capabilitiesRequestBuilder_;
            private CapabilitiesRequest capabilitiesRequest_;
            private SingleFieldBuilderV3<CapabilitiesResponse, CapabilitiesResponse.Builder, CapabilitiesResponseOrBuilder> capabilitiesResponseBuilder_;
            private CapabilitiesResponse capabilitiesResponse_;
            private SingleFieldBuilderV3<ForecastStatusNotification, ForecastStatusNotification.Builder, ForecastStatusNotificationOrBuilder> forecastStatusNotificationBuilder_;
            private ForecastStatusNotification forecastStatusNotification_;
            private SingleFieldBuilderV3<LocationModifiedNotification, LocationModifiedNotification.Builder, LocationModifiedNotificationOrBuilder> locationModifiedNotificationBuilder_;
            private LocationModifiedNotification locationModifiedNotification_;
            private SingleFieldBuilderV3<RequestForecastRequest, RequestForecastRequest.Builder, RequestForecastRequestOrBuilder> requestForecastRequestBuilder_;
            private RequestForecastRequest requestForecastRequest_;
            private SingleFieldBuilderV3<RequestForecastResponse, RequestForecastResponse.Builder, RequestForecastResponseOrBuilder> requestForecastResponseBuilder_;
            private RequestForecastResponse requestForecastResponse_;
            private SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> subscribeRequestBuilder_;
            private SubscribeRequest subscribeRequest_;
            private SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> subscribeResponseBuilder_;
            private SubscribeResponse subscribeResponse_;
            private SingleFieldBuilderV3<SyncRequest, SyncRequest.Builder, SyncRequestOrBuilder> syncRequestBuilder_;
            private SyncRequest syncRequest_;
            private SingleFieldBuilderV3<SyncResponse, SyncResponse.Builder, SyncResponseOrBuilder> syncResponseBuilder_;
            private SyncResponse syncResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(InReachWeatherService inReachWeatherService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<CapabilitiesRequest, CapabilitiesRequest.Builder, CapabilitiesRequestOrBuilder> singleFieldBuilderV3 = this.capabilitiesRequestBuilder_;
                    inReachWeatherService.capabilitiesRequest_ = singleFieldBuilderV3 == null ? this.capabilitiesRequest_ : (CapabilitiesRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<CapabilitiesResponse, CapabilitiesResponse.Builder, CapabilitiesResponseOrBuilder> singleFieldBuilderV4 = this.capabilitiesResponseBuilder_;
                    inReachWeatherService.capabilitiesResponse_ = singleFieldBuilderV4 == null ? this.capabilitiesResponse_ : (CapabilitiesResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<RequestForecastRequest, RequestForecastRequest.Builder, RequestForecastRequestOrBuilder> singleFieldBuilderV5 = this.requestForecastRequestBuilder_;
                    inReachWeatherService.requestForecastRequest_ = singleFieldBuilderV5 == null ? this.requestForecastRequest_ : (RequestForecastRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<RequestForecastResponse, RequestForecastResponse.Builder, RequestForecastResponseOrBuilder> singleFieldBuilderV6 = this.requestForecastResponseBuilder_;
                    inReachWeatherService.requestForecastResponse_ = singleFieldBuilderV6 == null ? this.requestForecastResponse_ : (RequestForecastResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<SyncRequest, SyncRequest.Builder, SyncRequestOrBuilder> singleFieldBuilderV7 = this.syncRequestBuilder_;
                    inReachWeatherService.syncRequest_ = singleFieldBuilderV7 == null ? this.syncRequest_ : (SyncRequest) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<SyncResponse, SyncResponse.Builder, SyncResponseOrBuilder> singleFieldBuilderV8 = this.syncResponseBuilder_;
                    inReachWeatherService.syncResponse_ = singleFieldBuilderV8 == null ? this.syncResponse_ : (SyncResponse) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> singleFieldBuilderV9 = this.subscribeRequestBuilder_;
                    inReachWeatherService.subscribeRequest_ = singleFieldBuilderV9 == null ? this.subscribeRequest_ : (SubscribeRequest) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> singleFieldBuilderV10 = this.subscribeResponseBuilder_;
                    inReachWeatherService.subscribeResponse_ = singleFieldBuilderV10 == null ? this.subscribeResponse_ : (SubscribeResponse) singleFieldBuilderV10.build();
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    SingleFieldBuilderV3<LocationModifiedNotification, LocationModifiedNotification.Builder, LocationModifiedNotificationOrBuilder> singleFieldBuilderV11 = this.locationModifiedNotificationBuilder_;
                    inReachWeatherService.locationModifiedNotification_ = singleFieldBuilderV11 == null ? this.locationModifiedNotification_ : (LocationModifiedNotification) singleFieldBuilderV11.build();
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    SingleFieldBuilderV3<ForecastStatusNotification, ForecastStatusNotification.Builder, ForecastStatusNotificationOrBuilder> singleFieldBuilderV12 = this.forecastStatusNotificationBuilder_;
                    inReachWeatherService.forecastStatusNotification_ = singleFieldBuilderV12 == null ? this.forecastStatusNotification_ : (ForecastStatusNotification) singleFieldBuilderV12.build();
                    i14 |= 512;
                }
                inReachWeatherService.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<CapabilitiesRequest, CapabilitiesRequest.Builder, CapabilitiesRequestOrBuilder> getCapabilitiesRequestFieldBuilder() {
                if (this.capabilitiesRequestBuilder_ == null) {
                    this.capabilitiesRequestBuilder_ = new SingleFieldBuilderV3<>(getCapabilitiesRequest(), getParentForChildren(), isClean());
                    this.capabilitiesRequest_ = null;
                }
                return this.capabilitiesRequestBuilder_;
            }

            private SingleFieldBuilderV3<CapabilitiesResponse, CapabilitiesResponse.Builder, CapabilitiesResponseOrBuilder> getCapabilitiesResponseFieldBuilder() {
                if (this.capabilitiesResponseBuilder_ == null) {
                    this.capabilitiesResponseBuilder_ = new SingleFieldBuilderV3<>(getCapabilitiesResponse(), getParentForChildren(), isClean());
                    this.capabilitiesResponse_ = null;
                }
                return this.capabilitiesResponseBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_InReachWeatherService_descriptor;
            }

            private SingleFieldBuilderV3<ForecastStatusNotification, ForecastStatusNotification.Builder, ForecastStatusNotificationOrBuilder> getForecastStatusNotificationFieldBuilder() {
                if (this.forecastStatusNotificationBuilder_ == null) {
                    this.forecastStatusNotificationBuilder_ = new SingleFieldBuilderV3<>(getForecastStatusNotification(), getParentForChildren(), isClean());
                    this.forecastStatusNotification_ = null;
                }
                return this.forecastStatusNotificationBuilder_;
            }

            private SingleFieldBuilderV3<LocationModifiedNotification, LocationModifiedNotification.Builder, LocationModifiedNotificationOrBuilder> getLocationModifiedNotificationFieldBuilder() {
                if (this.locationModifiedNotificationBuilder_ == null) {
                    this.locationModifiedNotificationBuilder_ = new SingleFieldBuilderV3<>(getLocationModifiedNotification(), getParentForChildren(), isClean());
                    this.locationModifiedNotification_ = null;
                }
                return this.locationModifiedNotificationBuilder_;
            }

            private SingleFieldBuilderV3<RequestForecastRequest, RequestForecastRequest.Builder, RequestForecastRequestOrBuilder> getRequestForecastRequestFieldBuilder() {
                if (this.requestForecastRequestBuilder_ == null) {
                    this.requestForecastRequestBuilder_ = new SingleFieldBuilderV3<>(getRequestForecastRequest(), getParentForChildren(), isClean());
                    this.requestForecastRequest_ = null;
                }
                return this.requestForecastRequestBuilder_;
            }

            private SingleFieldBuilderV3<RequestForecastResponse, RequestForecastResponse.Builder, RequestForecastResponseOrBuilder> getRequestForecastResponseFieldBuilder() {
                if (this.requestForecastResponseBuilder_ == null) {
                    this.requestForecastResponseBuilder_ = new SingleFieldBuilderV3<>(getRequestForecastResponse(), getParentForChildren(), isClean());
                    this.requestForecastResponse_ = null;
                }
                return this.requestForecastResponseBuilder_;
            }

            private SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> getSubscribeRequestFieldBuilder() {
                if (this.subscribeRequestBuilder_ == null) {
                    this.subscribeRequestBuilder_ = new SingleFieldBuilderV3<>(getSubscribeRequest(), getParentForChildren(), isClean());
                    this.subscribeRequest_ = null;
                }
                return this.subscribeRequestBuilder_;
            }

            private SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> getSubscribeResponseFieldBuilder() {
                if (this.subscribeResponseBuilder_ == null) {
                    this.subscribeResponseBuilder_ = new SingleFieldBuilderV3<>(getSubscribeResponse(), getParentForChildren(), isClean());
                    this.subscribeResponse_ = null;
                }
                return this.subscribeResponseBuilder_;
            }

            private SingleFieldBuilderV3<SyncRequest, SyncRequest.Builder, SyncRequestOrBuilder> getSyncRequestFieldBuilder() {
                if (this.syncRequestBuilder_ == null) {
                    this.syncRequestBuilder_ = new SingleFieldBuilderV3<>(getSyncRequest(), getParentForChildren(), isClean());
                    this.syncRequest_ = null;
                }
                return this.syncRequestBuilder_;
            }

            private SingleFieldBuilderV3<SyncResponse, SyncResponse.Builder, SyncResponseOrBuilder> getSyncResponseFieldBuilder() {
                if (this.syncResponseBuilder_ == null) {
                    this.syncResponseBuilder_ = new SingleFieldBuilderV3<>(getSyncResponse(), getParentForChildren(), isClean());
                    this.syncResponse_ = null;
                }
                return this.syncResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getCapabilitiesRequestFieldBuilder();
                    getCapabilitiesResponseFieldBuilder();
                    getRequestForecastRequestFieldBuilder();
                    getRequestForecastResponseFieldBuilder();
                    getSyncRequestFieldBuilder();
                    getSyncResponseFieldBuilder();
                    getSubscribeRequestFieldBuilder();
                    getSubscribeResponseFieldBuilder();
                    getLocationModifiedNotificationFieldBuilder();
                    getForecastStatusNotificationFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InReachWeatherService build() {
                InReachWeatherService inReachWeatherServiceBuildPartial = buildPartial();
                if (inReachWeatherServiceBuildPartial.isInitialized()) {
                    return inReachWeatherServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) inReachWeatherServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InReachWeatherService buildPartial() {
                InReachWeatherService inReachWeatherService = new InReachWeatherService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(inReachWeatherService);
                }
                onBuilt();
                return inReachWeatherService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.capabilitiesRequest_ = null;
                SingleFieldBuilderV3<CapabilitiesRequest, CapabilitiesRequest.Builder, CapabilitiesRequestOrBuilder> singleFieldBuilderV3 = this.capabilitiesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.capabilitiesRequestBuilder_ = null;
                }
                this.capabilitiesResponse_ = null;
                SingleFieldBuilderV3<CapabilitiesResponse, CapabilitiesResponse.Builder, CapabilitiesResponseOrBuilder> singleFieldBuilderV4 = this.capabilitiesResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.capabilitiesResponseBuilder_ = null;
                }
                this.requestForecastRequest_ = null;
                SingleFieldBuilderV3<RequestForecastRequest, RequestForecastRequest.Builder, RequestForecastRequestOrBuilder> singleFieldBuilderV5 = this.requestForecastRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.requestForecastRequestBuilder_ = null;
                }
                this.requestForecastResponse_ = null;
                SingleFieldBuilderV3<RequestForecastResponse, RequestForecastResponse.Builder, RequestForecastResponseOrBuilder> singleFieldBuilderV6 = this.requestForecastResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.requestForecastResponseBuilder_ = null;
                }
                this.syncRequest_ = null;
                SingleFieldBuilderV3<SyncRequest, SyncRequest.Builder, SyncRequestOrBuilder> singleFieldBuilderV7 = this.syncRequestBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.syncRequestBuilder_ = null;
                }
                this.syncResponse_ = null;
                SingleFieldBuilderV3<SyncResponse, SyncResponse.Builder, SyncResponseOrBuilder> singleFieldBuilderV8 = this.syncResponseBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.syncResponseBuilder_ = null;
                }
                this.subscribeRequest_ = null;
                SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> singleFieldBuilderV9 = this.subscribeRequestBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.subscribeRequestBuilder_ = null;
                }
                this.subscribeResponse_ = null;
                SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> singleFieldBuilderV10 = this.subscribeResponseBuilder_;
                if (singleFieldBuilderV10 != null) {
                    singleFieldBuilderV10.dispose();
                    this.subscribeResponseBuilder_ = null;
                }
                this.locationModifiedNotification_ = null;
                SingleFieldBuilderV3<LocationModifiedNotification, LocationModifiedNotification.Builder, LocationModifiedNotificationOrBuilder> singleFieldBuilderV11 = this.locationModifiedNotificationBuilder_;
                if (singleFieldBuilderV11 != null) {
                    singleFieldBuilderV11.dispose();
                    this.locationModifiedNotificationBuilder_ = null;
                }
                this.forecastStatusNotification_ = null;
                SingleFieldBuilderV3<ForecastStatusNotification, ForecastStatusNotification.Builder, ForecastStatusNotificationOrBuilder> singleFieldBuilderV12 = this.forecastStatusNotificationBuilder_;
                if (singleFieldBuilderV12 != null) {
                    singleFieldBuilderV12.dispose();
                    this.forecastStatusNotificationBuilder_ = null;
                }
                return this;
            }

            public Builder clearCapabilitiesRequest() {
                this.bitField0_ &= -2;
                this.capabilitiesRequest_ = null;
                SingleFieldBuilderV3<CapabilitiesRequest, CapabilitiesRequest.Builder, CapabilitiesRequestOrBuilder> singleFieldBuilderV3 = this.capabilitiesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.capabilitiesRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearCapabilitiesResponse() {
                this.bitField0_ &= -3;
                this.capabilitiesResponse_ = null;
                SingleFieldBuilderV3<CapabilitiesResponse, CapabilitiesResponse.Builder, CapabilitiesResponseOrBuilder> singleFieldBuilderV3 = this.capabilitiesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.capabilitiesResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearForecastStatusNotification() {
                this.bitField0_ &= -513;
                this.forecastStatusNotification_ = null;
                SingleFieldBuilderV3<ForecastStatusNotification, ForecastStatusNotification.Builder, ForecastStatusNotificationOrBuilder> singleFieldBuilderV3 = this.forecastStatusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.forecastStatusNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearLocationModifiedNotification() {
                this.bitField0_ &= -257;
                this.locationModifiedNotification_ = null;
                SingleFieldBuilderV3<LocationModifiedNotification, LocationModifiedNotification.Builder, LocationModifiedNotificationOrBuilder> singleFieldBuilderV3 = this.locationModifiedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.locationModifiedNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearRequestForecastRequest() {
                this.bitField0_ &= -5;
                this.requestForecastRequest_ = null;
                SingleFieldBuilderV3<RequestForecastRequest, RequestForecastRequest.Builder, RequestForecastRequestOrBuilder> singleFieldBuilderV3 = this.requestForecastRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.requestForecastRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearRequestForecastResponse() {
                this.bitField0_ &= -9;
                this.requestForecastResponse_ = null;
                SingleFieldBuilderV3<RequestForecastResponse, RequestForecastResponse.Builder, RequestForecastResponseOrBuilder> singleFieldBuilderV3 = this.requestForecastResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.requestForecastResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSubscribeRequest() {
                this.bitField0_ &= -65;
                this.subscribeRequest_ = null;
                SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> singleFieldBuilderV3 = this.subscribeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.subscribeRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSubscribeResponse() {
                this.bitField0_ &= -129;
                this.subscribeResponse_ = null;
                SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> singleFieldBuilderV3 = this.subscribeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.subscribeResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSyncRequest() {
                this.bitField0_ &= -17;
                this.syncRequest_ = null;
                SingleFieldBuilderV3<SyncRequest, SyncRequest.Builder, SyncRequestOrBuilder> singleFieldBuilderV3 = this.syncRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.syncRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSyncResponse() {
                this.bitField0_ &= -33;
                this.syncResponse_ = null;
                SingleFieldBuilderV3<SyncResponse, SyncResponse.Builder, SyncResponseOrBuilder> singleFieldBuilderV3 = this.syncResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.syncResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
            public CapabilitiesRequest getCapabilitiesRequest() {
                SingleFieldBuilderV3<CapabilitiesRequest, CapabilitiesRequest.Builder, CapabilitiesRequestOrBuilder> singleFieldBuilderV3 = this.capabilitiesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CapabilitiesRequest) singleFieldBuilderV3.getMessage();
                }
                CapabilitiesRequest capabilitiesRequest = this.capabilitiesRequest_;
                return capabilitiesRequest == null ? CapabilitiesRequest.getDefaultInstance() : capabilitiesRequest;
            }

            public CapabilitiesRequest.Builder getCapabilitiesRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (CapabilitiesRequest.Builder) getCapabilitiesRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
            public CapabilitiesRequestOrBuilder getCapabilitiesRequestOrBuilder() {
                SingleFieldBuilderV3<CapabilitiesRequest, CapabilitiesRequest.Builder, CapabilitiesRequestOrBuilder> singleFieldBuilderV3 = this.capabilitiesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CapabilitiesRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CapabilitiesRequest capabilitiesRequest = this.capabilitiesRequest_;
                return capabilitiesRequest == null ? CapabilitiesRequest.getDefaultInstance() : capabilitiesRequest;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
            public CapabilitiesResponse getCapabilitiesResponse() {
                SingleFieldBuilderV3<CapabilitiesResponse, CapabilitiesResponse.Builder, CapabilitiesResponseOrBuilder> singleFieldBuilderV3 = this.capabilitiesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CapabilitiesResponse) singleFieldBuilderV3.getMessage();
                }
                CapabilitiesResponse capabilitiesResponse = this.capabilitiesResponse_;
                return capabilitiesResponse == null ? CapabilitiesResponse.getDefaultInstance() : capabilitiesResponse;
            }

            public CapabilitiesResponse.Builder getCapabilitiesResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (CapabilitiesResponse.Builder) getCapabilitiesResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
            public CapabilitiesResponseOrBuilder getCapabilitiesResponseOrBuilder() {
                SingleFieldBuilderV3<CapabilitiesResponse, CapabilitiesResponse.Builder, CapabilitiesResponseOrBuilder> singleFieldBuilderV3 = this.capabilitiesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CapabilitiesResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CapabilitiesResponse capabilitiesResponse = this.capabilitiesResponse_;
                return capabilitiesResponse == null ? CapabilitiesResponse.getDefaultInstance() : capabilitiesResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_InReachWeatherService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
            public ForecastStatusNotification getForecastStatusNotification() {
                SingleFieldBuilderV3<ForecastStatusNotification, ForecastStatusNotification.Builder, ForecastStatusNotificationOrBuilder> singleFieldBuilderV3 = this.forecastStatusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ForecastStatusNotification) singleFieldBuilderV3.getMessage();
                }
                ForecastStatusNotification forecastStatusNotification = this.forecastStatusNotification_;
                return forecastStatusNotification == null ? ForecastStatusNotification.getDefaultInstance() : forecastStatusNotification;
            }

            public ForecastStatusNotification.Builder getForecastStatusNotificationBuilder() {
                this.bitField0_ |= 512;
                onChanged();
                return (ForecastStatusNotification.Builder) getForecastStatusNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
            public ForecastStatusNotificationOrBuilder getForecastStatusNotificationOrBuilder() {
                SingleFieldBuilderV3<ForecastStatusNotification, ForecastStatusNotification.Builder, ForecastStatusNotificationOrBuilder> singleFieldBuilderV3 = this.forecastStatusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ForecastStatusNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ForecastStatusNotification forecastStatusNotification = this.forecastStatusNotification_;
                return forecastStatusNotification == null ? ForecastStatusNotification.getDefaultInstance() : forecastStatusNotification;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
            public LocationModifiedNotification getLocationModifiedNotification() {
                SingleFieldBuilderV3<LocationModifiedNotification, LocationModifiedNotification.Builder, LocationModifiedNotificationOrBuilder> singleFieldBuilderV3 = this.locationModifiedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LocationModifiedNotification) singleFieldBuilderV3.getMessage();
                }
                LocationModifiedNotification locationModifiedNotification = this.locationModifiedNotification_;
                return locationModifiedNotification == null ? LocationModifiedNotification.getDefaultInstance() : locationModifiedNotification;
            }

            public LocationModifiedNotification.Builder getLocationModifiedNotificationBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (LocationModifiedNotification.Builder) getLocationModifiedNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
            public LocationModifiedNotificationOrBuilder getLocationModifiedNotificationOrBuilder() {
                SingleFieldBuilderV3<LocationModifiedNotification, LocationModifiedNotification.Builder, LocationModifiedNotificationOrBuilder> singleFieldBuilderV3 = this.locationModifiedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LocationModifiedNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LocationModifiedNotification locationModifiedNotification = this.locationModifiedNotification_;
                return locationModifiedNotification == null ? LocationModifiedNotification.getDefaultInstance() : locationModifiedNotification;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
            public RequestForecastRequest getRequestForecastRequest() {
                SingleFieldBuilderV3<RequestForecastRequest, RequestForecastRequest.Builder, RequestForecastRequestOrBuilder> singleFieldBuilderV3 = this.requestForecastRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RequestForecastRequest) singleFieldBuilderV3.getMessage();
                }
                RequestForecastRequest requestForecastRequest = this.requestForecastRequest_;
                return requestForecastRequest == null ? RequestForecastRequest.getDefaultInstance() : requestForecastRequest;
            }

            public RequestForecastRequest.Builder getRequestForecastRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (RequestForecastRequest.Builder) getRequestForecastRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
            public RequestForecastRequestOrBuilder getRequestForecastRequestOrBuilder() {
                SingleFieldBuilderV3<RequestForecastRequest, RequestForecastRequest.Builder, RequestForecastRequestOrBuilder> singleFieldBuilderV3 = this.requestForecastRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RequestForecastRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                RequestForecastRequest requestForecastRequest = this.requestForecastRequest_;
                return requestForecastRequest == null ? RequestForecastRequest.getDefaultInstance() : requestForecastRequest;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
            public RequestForecastResponse getRequestForecastResponse() {
                SingleFieldBuilderV3<RequestForecastResponse, RequestForecastResponse.Builder, RequestForecastResponseOrBuilder> singleFieldBuilderV3 = this.requestForecastResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RequestForecastResponse) singleFieldBuilderV3.getMessage();
                }
                RequestForecastResponse requestForecastResponse = this.requestForecastResponse_;
                return requestForecastResponse == null ? RequestForecastResponse.getDefaultInstance() : requestForecastResponse;
            }

            public RequestForecastResponse.Builder getRequestForecastResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (RequestForecastResponse.Builder) getRequestForecastResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
            public RequestForecastResponseOrBuilder getRequestForecastResponseOrBuilder() {
                SingleFieldBuilderV3<RequestForecastResponse, RequestForecastResponse.Builder, RequestForecastResponseOrBuilder> singleFieldBuilderV3 = this.requestForecastResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RequestForecastResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                RequestForecastResponse requestForecastResponse = this.requestForecastResponse_;
                return requestForecastResponse == null ? RequestForecastResponse.getDefaultInstance() : requestForecastResponse;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
            public SubscribeRequest getSubscribeRequest() {
                SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> singleFieldBuilderV3 = this.subscribeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SubscribeRequest) singleFieldBuilderV3.getMessage();
                }
                SubscribeRequest subscribeRequest = this.subscribeRequest_;
                return subscribeRequest == null ? SubscribeRequest.getDefaultInstance() : subscribeRequest;
            }

            public SubscribeRequest.Builder getSubscribeRequestBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (SubscribeRequest.Builder) getSubscribeRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
            public SubscribeRequestOrBuilder getSubscribeRequestOrBuilder() {
                SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> singleFieldBuilderV3 = this.subscribeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SubscribeRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SubscribeRequest subscribeRequest = this.subscribeRequest_;
                return subscribeRequest == null ? SubscribeRequest.getDefaultInstance() : subscribeRequest;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
            public SubscribeResponse getSubscribeResponse() {
                SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> singleFieldBuilderV3 = this.subscribeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SubscribeResponse) singleFieldBuilderV3.getMessage();
                }
                SubscribeResponse subscribeResponse = this.subscribeResponse_;
                return subscribeResponse == null ? SubscribeResponse.getDefaultInstance() : subscribeResponse;
            }

            public SubscribeResponse.Builder getSubscribeResponseBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (SubscribeResponse.Builder) getSubscribeResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
            public SubscribeResponseOrBuilder getSubscribeResponseOrBuilder() {
                SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> singleFieldBuilderV3 = this.subscribeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SubscribeResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SubscribeResponse subscribeResponse = this.subscribeResponse_;
                return subscribeResponse == null ? SubscribeResponse.getDefaultInstance() : subscribeResponse;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
            public SyncRequest getSyncRequest() {
                SingleFieldBuilderV3<SyncRequest, SyncRequest.Builder, SyncRequestOrBuilder> singleFieldBuilderV3 = this.syncRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SyncRequest) singleFieldBuilderV3.getMessage();
                }
                SyncRequest syncRequest = this.syncRequest_;
                return syncRequest == null ? SyncRequest.getDefaultInstance() : syncRequest;
            }

            public SyncRequest.Builder getSyncRequestBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (SyncRequest.Builder) getSyncRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
            public SyncRequestOrBuilder getSyncRequestOrBuilder() {
                SingleFieldBuilderV3<SyncRequest, SyncRequest.Builder, SyncRequestOrBuilder> singleFieldBuilderV3 = this.syncRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SyncRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SyncRequest syncRequest = this.syncRequest_;
                return syncRequest == null ? SyncRequest.getDefaultInstance() : syncRequest;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
            public SyncResponse getSyncResponse() {
                SingleFieldBuilderV3<SyncResponse, SyncResponse.Builder, SyncResponseOrBuilder> singleFieldBuilderV3 = this.syncResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SyncResponse) singleFieldBuilderV3.getMessage();
                }
                SyncResponse syncResponse = this.syncResponse_;
                return syncResponse == null ? SyncResponse.getDefaultInstance() : syncResponse;
            }

            public SyncResponse.Builder getSyncResponseBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (SyncResponse.Builder) getSyncResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
            public SyncResponseOrBuilder getSyncResponseOrBuilder() {
                SingleFieldBuilderV3<SyncResponse, SyncResponse.Builder, SyncResponseOrBuilder> singleFieldBuilderV3 = this.syncResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SyncResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SyncResponse syncResponse = this.syncResponse_;
                return syncResponse == null ? SyncResponse.getDefaultInstance() : syncResponse;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
            public boolean hasCapabilitiesRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
            public boolean hasCapabilitiesResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
            public boolean hasForecastStatusNotification() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
            public boolean hasLocationModifiedNotification() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
            public boolean hasRequestForecastRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
            public boolean hasRequestForecastResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
            public boolean hasSubscribeRequest() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
            public boolean hasSubscribeResponse() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
            public boolean hasSyncRequest() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.InReachWeatherServiceOrBuilder
            public boolean hasSyncResponse() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_InReachWeatherService_fieldAccessorTable.ensureFieldAccessorsInitialized(InReachWeatherService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasRequestForecastRequest() && !getRequestForecastRequest().isInitialized()) {
                    return false;
                }
                if (hasRequestForecastResponse() && !getRequestForecastResponse().isInitialized()) {
                    return false;
                }
                if (hasSyncRequest() && !getSyncRequest().isInitialized()) {
                    return false;
                }
                if (hasSyncResponse() && !getSyncResponse().isInitialized()) {
                    return false;
                }
                if (hasSubscribeResponse() && !getSubscribeResponse().isInitialized()) {
                    return false;
                }
                if (!hasLocationModifiedNotification() || getLocationModifiedNotification().isInitialized()) {
                    return !hasForecastStatusNotification() || getForecastStatusNotification().isInitialized();
                }
                return false;
            }

            public Builder mergeCapabilitiesRequest(CapabilitiesRequest capabilitiesRequest) {
                CapabilitiesRequest capabilitiesRequest2;
                SingleFieldBuilderV3<CapabilitiesRequest, CapabilitiesRequest.Builder, CapabilitiesRequestOrBuilder> singleFieldBuilderV3 = this.capabilitiesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(capabilitiesRequest);
                } else if ((this.bitField0_ & 1) == 0 || (capabilitiesRequest2 = this.capabilitiesRequest_) == null || capabilitiesRequest2 == CapabilitiesRequest.getDefaultInstance()) {
                    this.capabilitiesRequest_ = capabilitiesRequest;
                } else {
                    getCapabilitiesRequestBuilder().mergeFrom(capabilitiesRequest);
                }
                if (this.capabilitiesRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeCapabilitiesResponse(CapabilitiesResponse capabilitiesResponse) {
                CapabilitiesResponse capabilitiesResponse2;
                SingleFieldBuilderV3<CapabilitiesResponse, CapabilitiesResponse.Builder, CapabilitiesResponseOrBuilder> singleFieldBuilderV3 = this.capabilitiesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(capabilitiesResponse);
                } else if ((this.bitField0_ & 2) == 0 || (capabilitiesResponse2 = this.capabilitiesResponse_) == null || capabilitiesResponse2 == CapabilitiesResponse.getDefaultInstance()) {
                    this.capabilitiesResponse_ = capabilitiesResponse;
                } else {
                    getCapabilitiesResponseBuilder().mergeFrom(capabilitiesResponse);
                }
                if (this.capabilitiesResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeForecastStatusNotification(ForecastStatusNotification forecastStatusNotification) {
                ForecastStatusNotification forecastStatusNotification2;
                SingleFieldBuilderV3<ForecastStatusNotification, ForecastStatusNotification.Builder, ForecastStatusNotificationOrBuilder> singleFieldBuilderV3 = this.forecastStatusNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(forecastStatusNotification);
                } else if ((this.bitField0_ & 512) == 0 || (forecastStatusNotification2 = this.forecastStatusNotification_) == null || forecastStatusNotification2 == ForecastStatusNotification.getDefaultInstance()) {
                    this.forecastStatusNotification_ = forecastStatusNotification;
                } else {
                    getForecastStatusNotificationBuilder().mergeFrom(forecastStatusNotification);
                }
                if (this.forecastStatusNotification_ != null) {
                    this.bitField0_ |= 512;
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
                                    codedInputStream.readMessage(getCapabilitiesRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                    continue;
                                case 18:
                                    codedInputStream.readMessage(getCapabilitiesResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                    continue;
                                case 26:
                                    codedInputStream.readMessage(getRequestForecastRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                    continue;
                                case 34:
                                    codedInputStream.readMessage(getRequestForecastResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                    continue;
                                case 42:
                                    codedInputStream.readMessage(getSyncRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                    continue;
                                case 50:
                                    codedInputStream.readMessage(getSyncResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                    continue;
                                case 58:
                                    codedInputStream.readMessage(getSubscribeRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                    continue;
                                case 66:
                                    codedInputStream.readMessage(getSubscribeResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
                                    continue;
                                case 74:
                                    codedInputStream.readMessage(getLocationModifiedNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 256;
                                    continue;
                                case 82:
                                    codedInputStream.readMessage(getForecastStatusNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 512;
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

            public Builder mergeLocationModifiedNotification(LocationModifiedNotification locationModifiedNotification) {
                LocationModifiedNotification locationModifiedNotification2;
                SingleFieldBuilderV3<LocationModifiedNotification, LocationModifiedNotification.Builder, LocationModifiedNotificationOrBuilder> singleFieldBuilderV3 = this.locationModifiedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(locationModifiedNotification);
                } else if ((this.bitField0_ & 256) == 0 || (locationModifiedNotification2 = this.locationModifiedNotification_) == null || locationModifiedNotification2 == LocationModifiedNotification.getDefaultInstance()) {
                    this.locationModifiedNotification_ = locationModifiedNotification;
                } else {
                    getLocationModifiedNotificationBuilder().mergeFrom(locationModifiedNotification);
                }
                if (this.locationModifiedNotification_ != null) {
                    this.bitField0_ |= 256;
                    onChanged();
                }
                return this;
            }

            public Builder mergeRequestForecastRequest(RequestForecastRequest requestForecastRequest) {
                RequestForecastRequest requestForecastRequest2;
                SingleFieldBuilderV3<RequestForecastRequest, RequestForecastRequest.Builder, RequestForecastRequestOrBuilder> singleFieldBuilderV3 = this.requestForecastRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(requestForecastRequest);
                } else if ((this.bitField0_ & 4) == 0 || (requestForecastRequest2 = this.requestForecastRequest_) == null || requestForecastRequest2 == RequestForecastRequest.getDefaultInstance()) {
                    this.requestForecastRequest_ = requestForecastRequest;
                } else {
                    getRequestForecastRequestBuilder().mergeFrom(requestForecastRequest);
                }
                if (this.requestForecastRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeRequestForecastResponse(RequestForecastResponse requestForecastResponse) {
                RequestForecastResponse requestForecastResponse2;
                SingleFieldBuilderV3<RequestForecastResponse, RequestForecastResponse.Builder, RequestForecastResponseOrBuilder> singleFieldBuilderV3 = this.requestForecastResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(requestForecastResponse);
                } else if ((this.bitField0_ & 8) == 0 || (requestForecastResponse2 = this.requestForecastResponse_) == null || requestForecastResponse2 == RequestForecastResponse.getDefaultInstance()) {
                    this.requestForecastResponse_ = requestForecastResponse;
                } else {
                    getRequestForecastResponseBuilder().mergeFrom(requestForecastResponse);
                }
                if (this.requestForecastResponse_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSubscribeRequest(SubscribeRequest subscribeRequest) {
                SubscribeRequest subscribeRequest2;
                SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> singleFieldBuilderV3 = this.subscribeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(subscribeRequest);
                } else if ((this.bitField0_ & 64) == 0 || (subscribeRequest2 = this.subscribeRequest_) == null || subscribeRequest2 == SubscribeRequest.getDefaultInstance()) {
                    this.subscribeRequest_ = subscribeRequest;
                } else {
                    getSubscribeRequestBuilder().mergeFrom(subscribeRequest);
                }
                if (this.subscribeRequest_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSubscribeResponse(SubscribeResponse subscribeResponse) {
                SubscribeResponse subscribeResponse2;
                SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> singleFieldBuilderV3 = this.subscribeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(subscribeResponse);
                } else if ((this.bitField0_ & 128) == 0 || (subscribeResponse2 = this.subscribeResponse_) == null || subscribeResponse2 == SubscribeResponse.getDefaultInstance()) {
                    this.subscribeResponse_ = subscribeResponse;
                } else {
                    getSubscribeResponseBuilder().mergeFrom(subscribeResponse);
                }
                if (this.subscribeResponse_ != null) {
                    this.bitField0_ |= 128;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSyncRequest(SyncRequest syncRequest) {
                SyncRequest syncRequest2;
                SingleFieldBuilderV3<SyncRequest, SyncRequest.Builder, SyncRequestOrBuilder> singleFieldBuilderV3 = this.syncRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(syncRequest);
                } else if ((this.bitField0_ & 16) == 0 || (syncRequest2 = this.syncRequest_) == null || syncRequest2 == SyncRequest.getDefaultInstance()) {
                    this.syncRequest_ = syncRequest;
                } else {
                    getSyncRequestBuilder().mergeFrom(syncRequest);
                }
                if (this.syncRequest_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSyncResponse(SyncResponse syncResponse) {
                SyncResponse syncResponse2;
                SingleFieldBuilderV3<SyncResponse, SyncResponse.Builder, SyncResponseOrBuilder> singleFieldBuilderV3 = this.syncResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(syncResponse);
                } else if ((this.bitField0_ & 32) == 0 || (syncResponse2 = this.syncResponse_) == null || syncResponse2 == SyncResponse.getDefaultInstance()) {
                    this.syncResponse_ = syncResponse;
                } else {
                    getSyncResponseBuilder().mergeFrom(syncResponse);
                }
                if (this.syncResponse_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setCapabilitiesRequest(CapabilitiesRequest.Builder builder) {
                SingleFieldBuilderV3<CapabilitiesRequest, CapabilitiesRequest.Builder, CapabilitiesRequestOrBuilder> singleFieldBuilderV3 = this.capabilitiesRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.capabilitiesRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setCapabilitiesResponse(CapabilitiesResponse.Builder builder) {
                SingleFieldBuilderV3<CapabilitiesResponse, CapabilitiesResponse.Builder, CapabilitiesResponseOrBuilder> singleFieldBuilderV3 = this.capabilitiesResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.capabilitiesResponse_ = builder.build();
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

            public Builder setForecastStatusNotification(ForecastStatusNotification.Builder builder) {
                SingleFieldBuilderV3<ForecastStatusNotification, ForecastStatusNotification.Builder, ForecastStatusNotificationOrBuilder> singleFieldBuilderV3 = this.forecastStatusNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.forecastStatusNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setLocationModifiedNotification(LocationModifiedNotification.Builder builder) {
                SingleFieldBuilderV3<LocationModifiedNotification, LocationModifiedNotification.Builder, LocationModifiedNotificationOrBuilder> singleFieldBuilderV3 = this.locationModifiedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.locationModifiedNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setRequestForecastRequest(RequestForecastRequest.Builder builder) {
                SingleFieldBuilderV3<RequestForecastRequest, RequestForecastRequest.Builder, RequestForecastRequestOrBuilder> singleFieldBuilderV3 = this.requestForecastRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.requestForecastRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setRequestForecastResponse(RequestForecastResponse.Builder builder) {
                SingleFieldBuilderV3<RequestForecastResponse, RequestForecastResponse.Builder, RequestForecastResponseOrBuilder> singleFieldBuilderV3 = this.requestForecastResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.requestForecastResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSubscribeRequest(SubscribeRequest.Builder builder) {
                SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> singleFieldBuilderV3 = this.subscribeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.subscribeRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setSubscribeResponse(SubscribeResponse.Builder builder) {
                SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> singleFieldBuilderV3 = this.subscribeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.subscribeResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setSyncRequest(SyncRequest.Builder builder) {
                SingleFieldBuilderV3<SyncRequest, SyncRequest.Builder, SyncRequestOrBuilder> singleFieldBuilderV3 = this.syncRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.syncRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setSyncResponse(SyncResponse.Builder builder) {
                SingleFieldBuilderV3<SyncResponse, SyncResponse.Builder, SyncResponseOrBuilder> singleFieldBuilderV3 = this.syncResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.syncResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public InReachWeatherService getDefaultInstanceForType() {
                return InReachWeatherService.getDefaultInstance();
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

            public Builder setCapabilitiesRequest(CapabilitiesRequest capabilitiesRequest) {
                SingleFieldBuilderV3<CapabilitiesRequest, CapabilitiesRequest.Builder, CapabilitiesRequestOrBuilder> singleFieldBuilderV3 = this.capabilitiesRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    capabilitiesRequest.getClass();
                    this.capabilitiesRequest_ = capabilitiesRequest;
                } else {
                    singleFieldBuilderV3.setMessage(capabilitiesRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setCapabilitiesResponse(CapabilitiesResponse capabilitiesResponse) {
                SingleFieldBuilderV3<CapabilitiesResponse, CapabilitiesResponse.Builder, CapabilitiesResponseOrBuilder> singleFieldBuilderV3 = this.capabilitiesResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    capabilitiesResponse.getClass();
                    this.capabilitiesResponse_ = capabilitiesResponse;
                } else {
                    singleFieldBuilderV3.setMessage(capabilitiesResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setForecastStatusNotification(ForecastStatusNotification forecastStatusNotification) {
                SingleFieldBuilderV3<ForecastStatusNotification, ForecastStatusNotification.Builder, ForecastStatusNotificationOrBuilder> singleFieldBuilderV3 = this.forecastStatusNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    forecastStatusNotification.getClass();
                    this.forecastStatusNotification_ = forecastStatusNotification;
                } else {
                    singleFieldBuilderV3.setMessage(forecastStatusNotification);
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setLocationModifiedNotification(LocationModifiedNotification locationModifiedNotification) {
                SingleFieldBuilderV3<LocationModifiedNotification, LocationModifiedNotification.Builder, LocationModifiedNotificationOrBuilder> singleFieldBuilderV3 = this.locationModifiedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    locationModifiedNotification.getClass();
                    this.locationModifiedNotification_ = locationModifiedNotification;
                } else {
                    singleFieldBuilderV3.setMessage(locationModifiedNotification);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setRequestForecastRequest(RequestForecastRequest requestForecastRequest) {
                SingleFieldBuilderV3<RequestForecastRequest, RequestForecastRequest.Builder, RequestForecastRequestOrBuilder> singleFieldBuilderV3 = this.requestForecastRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    requestForecastRequest.getClass();
                    this.requestForecastRequest_ = requestForecastRequest;
                } else {
                    singleFieldBuilderV3.setMessage(requestForecastRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setRequestForecastResponse(RequestForecastResponse requestForecastResponse) {
                SingleFieldBuilderV3<RequestForecastResponse, RequestForecastResponse.Builder, RequestForecastResponseOrBuilder> singleFieldBuilderV3 = this.requestForecastResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    requestForecastResponse.getClass();
                    this.requestForecastResponse_ = requestForecastResponse;
                } else {
                    singleFieldBuilderV3.setMessage(requestForecastResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSubscribeRequest(SubscribeRequest subscribeRequest) {
                SingleFieldBuilderV3<SubscribeRequest, SubscribeRequest.Builder, SubscribeRequestOrBuilder> singleFieldBuilderV3 = this.subscribeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    subscribeRequest.getClass();
                    this.subscribeRequest_ = subscribeRequest;
                } else {
                    singleFieldBuilderV3.setMessage(subscribeRequest);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setSubscribeResponse(SubscribeResponse subscribeResponse) {
                SingleFieldBuilderV3<SubscribeResponse, SubscribeResponse.Builder, SubscribeResponseOrBuilder> singleFieldBuilderV3 = this.subscribeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    subscribeResponse.getClass();
                    this.subscribeResponse_ = subscribeResponse;
                } else {
                    singleFieldBuilderV3.setMessage(subscribeResponse);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setSyncRequest(SyncRequest syncRequest) {
                SingleFieldBuilderV3<SyncRequest, SyncRequest.Builder, SyncRequestOrBuilder> singleFieldBuilderV3 = this.syncRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    syncRequest.getClass();
                    this.syncRequest_ = syncRequest;
                } else {
                    singleFieldBuilderV3.setMessage(syncRequest);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setSyncResponse(SyncResponse syncResponse) {
                SingleFieldBuilderV3<SyncResponse, SyncResponse.Builder, SyncResponseOrBuilder> singleFieldBuilderV3 = this.syncResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    syncResponse.getClass();
                    this.syncResponse_ = syncResponse;
                } else {
                    singleFieldBuilderV3.setMessage(syncResponse);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof InReachWeatherService) {
                    return mergeFrom((InReachWeatherService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(InReachWeatherService inReachWeatherService) {
                if (inReachWeatherService == InReachWeatherService.getDefaultInstance()) {
                    return this;
                }
                if (inReachWeatherService.hasCapabilitiesRequest()) {
                    mergeCapabilitiesRequest(inReachWeatherService.getCapabilitiesRequest());
                }
                if (inReachWeatherService.hasCapabilitiesResponse()) {
                    mergeCapabilitiesResponse(inReachWeatherService.getCapabilitiesResponse());
                }
                if (inReachWeatherService.hasRequestForecastRequest()) {
                    mergeRequestForecastRequest(inReachWeatherService.getRequestForecastRequest());
                }
                if (inReachWeatherService.hasRequestForecastResponse()) {
                    mergeRequestForecastResponse(inReachWeatherService.getRequestForecastResponse());
                }
                if (inReachWeatherService.hasSyncRequest()) {
                    mergeSyncRequest(inReachWeatherService.getSyncRequest());
                }
                if (inReachWeatherService.hasSyncResponse()) {
                    mergeSyncResponse(inReachWeatherService.getSyncResponse());
                }
                if (inReachWeatherService.hasSubscribeRequest()) {
                    mergeSubscribeRequest(inReachWeatherService.getSubscribeRequest());
                }
                if (inReachWeatherService.hasSubscribeResponse()) {
                    mergeSubscribeResponse(inReachWeatherService.getSubscribeResponse());
                }
                if (inReachWeatherService.hasLocationModifiedNotification()) {
                    mergeLocationModifiedNotification(inReachWeatherService.getLocationModifiedNotification());
                }
                if (inReachWeatherService.hasForecastStatusNotification()) {
                    mergeForecastStatusNotification(inReachWeatherService.getForecastStatusNotification());
                }
                mergeUnknownFields(inReachWeatherService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public InReachWeatherService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ InReachWeatherService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private InReachWeatherService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static InReachWeatherService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InReachWeatherService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InReachWeatherService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static InReachWeatherService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static InReachWeatherService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static InReachWeatherService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static InReachWeatherService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static InReachWeatherService parseFrom(InputStream inputStream) {
            return (InReachWeatherService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static InReachWeatherService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InReachWeatherService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InReachWeatherService parseFrom(CodedInputStream codedInputStream) {
            return (InReachWeatherService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static InReachWeatherService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InReachWeatherService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class LandForecastDetail extends GeneratedMessageV3 implements LandForecastDetailOrBuilder {
        public static final int AIR_QUALITY_FIELD_NUMBER = 17;
        public static final int CLOUD_CEILING_HEIGHT_M_FIELD_NUMBER = 20;
        public static final int CLOUD_COVER_PERCENT_FIELD_NUMBER = 10;
        public static final int DETAIL_TIME_FIELD_NUMBER = 1;
        public static final int DEW_POINT_C_FIELD_NUMBER = 16;
        public static final int FEELS_LIKE_TEMP_C_FIELD_NUMBER = 4;
        public static final int GUST_SPEED_MPS_FIELD_NUMBER = 7;
        public static final int HUMIDITY_PERCENT_FIELD_NUMBER = 9;
        public static final int ICON_FIELD_NUMBER = 2;
        public static final int IS_NIGHT_FIELD_NUMBER = 19;
        public static final int PRECIP_AMOUNT_MM_FIELD_NUMBER = 13;
        public static final int PRECIP_CHANCE_PERCENT_FIELD_NUMBER = 12;
        public static final int PRECIP_TYPE_FIELD_NUMBER = 11;
        public static final int PRESSURE_MILLIBAR_FIELD_NUMBER = 5;
        public static final int SNOWFALL_AMOUNT_MM_FIELD_NUMBER = 14;
        public static final int TEMPERATURE_C_FIELD_NUMBER = 3;
        public static final int UV_INDEX_FIELD_NUMBER = 15;
        public static final int VISIBILITY_METERS_FIELD_NUMBER = 18;
        public static final int WIND_BEARING_DEGREES_FIELD_NUMBER = 8;
        public static final int WIND_SPEED_MPS_FIELD_NUMBER = 6;
        private static final long serialVersionUID = 0;
        private int airQuality_;
        private int bitField0_;
        private float cloudCeilingHeightM_;
        private int cloudCoverPercent_;
        private int detailTime_;
        private float dewPointC_;
        private float feelsLikeTempC_;
        private float gustSpeedMps_;
        private int humidityPercent_;
        private int icon_;
        private boolean isNight_;
        private byte memoizedIsInitialized;
        private int precipAmountMm_;
        private int precipChancePercent_;
        private int precipType_;
        private float pressureMillibar_;
        private int snowfallAmountMm_;
        private float temperatureC_;
        private float uvIndex_;
        private float visibilityMeters_;
        private int windBearingDegrees_;
        private float windSpeedMps_;
        private static final LandForecastDetail DEFAULT_INSTANCE = new LandForecastDetail();

        @Deprecated
        public static final Parser<LandForecastDetail> PARSER = new AbstractParser<LandForecastDetail>() { // from class: com.garmin.proto.generated.GDIInReachWeather.LandForecastDetail.1
            @Override // com.google.protobuf.Parser
            public LandForecastDetail parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LandForecastDetail.newBuilder();
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

        private LandForecastDetail(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.detailTime_ = 0;
            this.icon_ = 0;
            this.temperatureC_ = 0.0f;
            this.feelsLikeTempC_ = 0.0f;
            this.pressureMillibar_ = 0.0f;
            this.windSpeedMps_ = 0.0f;
            this.gustSpeedMps_ = 0.0f;
            this.windBearingDegrees_ = 0;
            this.humidityPercent_ = 0;
            this.cloudCoverPercent_ = 0;
            this.precipType_ = 0;
            this.precipChancePercent_ = 0;
            this.precipAmountMm_ = 0;
            this.snowfallAmountMm_ = 0;
            this.uvIndex_ = 0.0f;
            this.dewPointC_ = 0.0f;
            this.airQuality_ = 0;
            this.visibilityMeters_ = 0.0f;
            this.isNight_ = false;
            this.cloudCeilingHeightM_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LandForecastDetail getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_LandForecastDetail_descriptor;
        }

        public static Builder newBuilder(LandForecastDetail landForecastDetail) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(landForecastDetail);
        }

        public static LandForecastDetail parseDelimitedFrom(InputStream inputStream) {
            return (LandForecastDetail) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LandForecastDetail parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LandForecastDetail> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LandForecastDetail)) {
                return super.equals(obj);
            }
            LandForecastDetail landForecastDetail = (LandForecastDetail) obj;
            if (hasDetailTime() != landForecastDetail.hasDetailTime()) {
                return false;
            }
            if ((hasDetailTime() && getDetailTime() != landForecastDetail.getDetailTime()) || hasIcon() != landForecastDetail.hasIcon()) {
                return false;
            }
            if ((hasIcon() && this.icon_ != landForecastDetail.icon_) || hasTemperatureC() != landForecastDetail.hasTemperatureC()) {
                return false;
            }
            if ((hasTemperatureC() && Float.floatToIntBits(getTemperatureC()) != Float.floatToIntBits(landForecastDetail.getTemperatureC())) || hasFeelsLikeTempC() != landForecastDetail.hasFeelsLikeTempC()) {
                return false;
            }
            if ((hasFeelsLikeTempC() && Float.floatToIntBits(getFeelsLikeTempC()) != Float.floatToIntBits(landForecastDetail.getFeelsLikeTempC())) || hasPressureMillibar() != landForecastDetail.hasPressureMillibar()) {
                return false;
            }
            if ((hasPressureMillibar() && Float.floatToIntBits(getPressureMillibar()) != Float.floatToIntBits(landForecastDetail.getPressureMillibar())) || hasWindSpeedMps() != landForecastDetail.hasWindSpeedMps()) {
                return false;
            }
            if ((hasWindSpeedMps() && Float.floatToIntBits(getWindSpeedMps()) != Float.floatToIntBits(landForecastDetail.getWindSpeedMps())) || hasGustSpeedMps() != landForecastDetail.hasGustSpeedMps()) {
                return false;
            }
            if ((hasGustSpeedMps() && Float.floatToIntBits(getGustSpeedMps()) != Float.floatToIntBits(landForecastDetail.getGustSpeedMps())) || hasWindBearingDegrees() != landForecastDetail.hasWindBearingDegrees()) {
                return false;
            }
            if ((hasWindBearingDegrees() && getWindBearingDegrees() != landForecastDetail.getWindBearingDegrees()) || hasHumidityPercent() != landForecastDetail.hasHumidityPercent()) {
                return false;
            }
            if ((hasHumidityPercent() && getHumidityPercent() != landForecastDetail.getHumidityPercent()) || hasCloudCoverPercent() != landForecastDetail.hasCloudCoverPercent()) {
                return false;
            }
            if ((hasCloudCoverPercent() && getCloudCoverPercent() != landForecastDetail.getCloudCoverPercent()) || hasPrecipType() != landForecastDetail.hasPrecipType()) {
                return false;
            }
            if ((hasPrecipType() && this.precipType_ != landForecastDetail.precipType_) || hasPrecipChancePercent() != landForecastDetail.hasPrecipChancePercent()) {
                return false;
            }
            if ((hasPrecipChancePercent() && getPrecipChancePercent() != landForecastDetail.getPrecipChancePercent()) || hasPrecipAmountMm() != landForecastDetail.hasPrecipAmountMm()) {
                return false;
            }
            if ((hasPrecipAmountMm() && getPrecipAmountMm() != landForecastDetail.getPrecipAmountMm()) || hasSnowfallAmountMm() != landForecastDetail.hasSnowfallAmountMm()) {
                return false;
            }
            if ((hasSnowfallAmountMm() && getSnowfallAmountMm() != landForecastDetail.getSnowfallAmountMm()) || hasUvIndex() != landForecastDetail.hasUvIndex()) {
                return false;
            }
            if ((hasUvIndex() && Float.floatToIntBits(getUvIndex()) != Float.floatToIntBits(landForecastDetail.getUvIndex())) || hasDewPointC() != landForecastDetail.hasDewPointC()) {
                return false;
            }
            if ((hasDewPointC() && Float.floatToIntBits(getDewPointC()) != Float.floatToIntBits(landForecastDetail.getDewPointC())) || hasAirQuality() != landForecastDetail.hasAirQuality()) {
                return false;
            }
            if ((hasAirQuality() && this.airQuality_ != landForecastDetail.airQuality_) || hasVisibilityMeters() != landForecastDetail.hasVisibilityMeters()) {
                return false;
            }
            if ((hasVisibilityMeters() && Float.floatToIntBits(getVisibilityMeters()) != Float.floatToIntBits(landForecastDetail.getVisibilityMeters())) || hasIsNight() != landForecastDetail.hasIsNight()) {
                return false;
            }
            if ((!hasIsNight() || getIsNight() == landForecastDetail.getIsNight()) && hasCloudCeilingHeightM() == landForecastDetail.hasCloudCeilingHeightM()) {
                return (!hasCloudCeilingHeightM() || Float.floatToIntBits(getCloudCeilingHeightM()) == Float.floatToIntBits(landForecastDetail.getCloudCeilingHeightM())) && getUnknownFields().equals(landForecastDetail.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public ForecastAirQuality getAirQuality() {
            ForecastAirQuality forecastAirQualityForNumber = ForecastAirQuality.forNumber(this.airQuality_);
            return forecastAirQualityForNumber == null ? ForecastAirQuality.FORECAST_AIR_QUALITY_INVALID : forecastAirQualityForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public float getCloudCeilingHeightM() {
            return this.cloudCeilingHeightM_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public int getCloudCoverPercent() {
            return this.cloudCoverPercent_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public int getDetailTime() {
            return this.detailTime_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public float getDewPointC() {
            return this.dewPointC_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public float getFeelsLikeTempC() {
            return this.feelsLikeTempC_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public float getGustSpeedMps() {
            return this.gustSpeedMps_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public int getHumidityPercent() {
            return this.humidityPercent_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public WeatherIcon getIcon() {
            WeatherIcon weatherIconForNumber = WeatherIcon.forNumber(this.icon_);
            return weatherIconForNumber == null ? WeatherIcon.WEATHER_ICON_INVALID : weatherIconForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public boolean getIsNight() {
            return this.isNight_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LandForecastDetail> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public int getPrecipAmountMm() {
            return this.precipAmountMm_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public int getPrecipChancePercent() {
            return this.precipChancePercent_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public Precipitation getPrecipType() {
            Precipitation precipitationForNumber = Precipitation.forNumber(this.precipType_);
            return precipitationForNumber == null ? Precipitation.PRECIPITATION_UNKNOWN : precipitationForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public float getPressureMillibar() {
            return this.pressureMillibar_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeFixed32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeFixed32Size(1, this.detailTime_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeEnumSize(2, this.icon_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeFloatSize(3, this.temperatureC_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeFloatSize(4, this.feelsLikeTempC_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeFloatSize(5, this.pressureMillibar_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeFloatSize(6, this.windSpeedMps_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeFloatSize(7, this.gustSpeedMps_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeUInt32Size(8, this.windBearingDegrees_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeUInt32Size(9, this.humidityPercent_);
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeUInt32Size(10, this.cloudCoverPercent_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeEnumSize(11, this.precipType_);
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeUInt32Size(12, this.precipChancePercent_);
            }
            if ((this.bitField0_ & 4096) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeUInt32Size(13, this.precipAmountMm_);
            }
            if ((this.bitField0_ & 8192) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeUInt32Size(14, this.snowfallAmountMm_);
            }
            if ((this.bitField0_ & 16384) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeFloatSize(15, this.uvIndex_);
            }
            if ((this.bitField0_ & 32768) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeFloatSize(16, this.dewPointC_);
            }
            if ((this.bitField0_ & 65536) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeEnumSize(17, this.airQuality_);
            }
            if ((this.bitField0_ & 131072) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeFloatSize(18, this.visibilityMeters_);
            }
            if ((this.bitField0_ & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeBoolSize(19, this.isNight_);
            }
            if ((this.bitField0_ & 524288) != 0) {
                iComputeFixed32Size += CodedOutputStream.computeFloatSize(20, this.cloudCeilingHeightM_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeFixed32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public int getSnowfallAmountMm() {
            return this.snowfallAmountMm_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public float getTemperatureC() {
            return this.temperatureC_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public float getUvIndex() {
            return this.uvIndex_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public float getVisibilityMeters() {
            return this.visibilityMeters_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public int getWindBearingDegrees() {
            return this.windBearingDegrees_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public float getWindSpeedMps() {
            return this.windSpeedMps_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public boolean hasAirQuality() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public boolean hasCloudCeilingHeightM() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public boolean hasCloudCoverPercent() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public boolean hasDetailTime() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public boolean hasDewPointC() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public boolean hasFeelsLikeTempC() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public boolean hasGustSpeedMps() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public boolean hasHumidityPercent() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public boolean hasIcon() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public boolean hasIsNight() {
            return (this.bitField0_ & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public boolean hasPrecipAmountMm() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public boolean hasPrecipChancePercent() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public boolean hasPrecipType() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public boolean hasPressureMillibar() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public boolean hasSnowfallAmountMm() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public boolean hasTemperatureC() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public boolean hasUvIndex() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public boolean hasVisibilityMeters() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public boolean hasWindBearingDegrees() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
        public boolean hasWindSpeedMps() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasDetailTime()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getDetailTime();
            }
            if (hasIcon()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.icon_;
            }
            if (hasTemperatureC()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Float.floatToIntBits(getTemperatureC());
            }
            if (hasFeelsLikeTempC()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Float.floatToIntBits(getFeelsLikeTempC());
            }
            if (hasPressureMillibar()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + Float.floatToIntBits(getPressureMillibar());
            }
            if (hasWindSpeedMps()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + Float.floatToIntBits(getWindSpeedMps());
            }
            if (hasGustSpeedMps()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + Float.floatToIntBits(getGustSpeedMps());
            }
            if (hasWindBearingDegrees()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getWindBearingDegrees();
            }
            if (hasHumidityPercent()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getHumidityPercent();
            }
            if (hasCloudCoverPercent()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getCloudCoverPercent();
            }
            if (hasPrecipType()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + this.precipType_;
            }
            if (hasPrecipChancePercent()) {
                iHashCode = e5.c(iHashCode, 37, 12, 53) + getPrecipChancePercent();
            }
            if (hasPrecipAmountMm()) {
                iHashCode = e5.c(iHashCode, 37, 13, 53) + getPrecipAmountMm();
            }
            if (hasSnowfallAmountMm()) {
                iHashCode = e5.c(iHashCode, 37, 14, 53) + getSnowfallAmountMm();
            }
            if (hasUvIndex()) {
                iHashCode = e5.c(iHashCode, 37, 15, 53) + Float.floatToIntBits(getUvIndex());
            }
            if (hasDewPointC()) {
                iHashCode = e5.c(iHashCode, 37, 16, 53) + Float.floatToIntBits(getDewPointC());
            }
            if (hasAirQuality()) {
                iHashCode = e5.c(iHashCode, 37, 17, 53) + this.airQuality_;
            }
            if (hasVisibilityMeters()) {
                iHashCode = e5.c(iHashCode, 37, 18, 53) + Float.floatToIntBits(getVisibilityMeters());
            }
            if (hasIsNight()) {
                iHashCode = e5.c(iHashCode, 37, 19, 53) + Internal.hashBoolean(getIsNight());
            }
            if (hasCloudCeilingHeightM()) {
                iHashCode = e5.c(iHashCode, 37, 20, 53) + Float.floatToIntBits(getCloudCeilingHeightM());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_LandForecastDetail_fieldAccessorTable.ensureFieldAccessorsInitialized(LandForecastDetail.class, Builder.class);
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
            if (hasDetailTime()) {
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
            return new LandForecastDetail();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeFixed32(1, this.detailTime_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.icon_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeFloat(3, this.temperatureC_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeFloat(4, this.feelsLikeTempC_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeFloat(5, this.pressureMillibar_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeFloat(6, this.windSpeedMps_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeFloat(7, this.gustSpeedMps_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeUInt32(8, this.windBearingDegrees_);
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeUInt32(9, this.humidityPercent_);
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeUInt32(10, this.cloudCoverPercent_);
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeEnum(11, this.precipType_);
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeUInt32(12, this.precipChancePercent_);
            }
            if ((this.bitField0_ & 4096) != 0) {
                codedOutputStream.writeUInt32(13, this.precipAmountMm_);
            }
            if ((this.bitField0_ & 8192) != 0) {
                codedOutputStream.writeUInt32(14, this.snowfallAmountMm_);
            }
            if ((this.bitField0_ & 16384) != 0) {
                codedOutputStream.writeFloat(15, this.uvIndex_);
            }
            if ((this.bitField0_ & 32768) != 0) {
                codedOutputStream.writeFloat(16, this.dewPointC_);
            }
            if ((this.bitField0_ & 65536) != 0) {
                codedOutputStream.writeEnum(17, this.airQuality_);
            }
            if ((this.bitField0_ & 131072) != 0) {
                codedOutputStream.writeFloat(18, this.visibilityMeters_);
            }
            if ((this.bitField0_ & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
                codedOutputStream.writeBool(19, this.isNight_);
            }
            if ((this.bitField0_ & 524288) != 0) {
                codedOutputStream.writeFloat(20, this.cloudCeilingHeightM_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LandForecastDetailOrBuilder {
            private int airQuality_;
            private int bitField0_;
            private float cloudCeilingHeightM_;
            private int cloudCoverPercent_;
            private int detailTime_;
            private float dewPointC_;
            private float feelsLikeTempC_;
            private float gustSpeedMps_;
            private int humidityPercent_;
            private int icon_;
            private boolean isNight_;
            private int precipAmountMm_;
            private int precipChancePercent_;
            private int precipType_;
            private float pressureMillibar_;
            private int snowfallAmountMm_;
            private float temperatureC_;
            private float uvIndex_;
            private float visibilityMeters_;
            private int windBearingDegrees_;
            private float windSpeedMps_;

            private Builder() {
                this.icon_ = 0;
                this.precipType_ = 0;
                this.airQuality_ = 0;
            }

            private void buildPartial0(LandForecastDetail landForecastDetail) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    landForecastDetail.detailTime_ = this.detailTime_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    landForecastDetail.icon_ = this.icon_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    landForecastDetail.temperatureC_ = this.temperatureC_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    landForecastDetail.feelsLikeTempC_ = this.feelsLikeTempC_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    landForecastDetail.pressureMillibar_ = this.pressureMillibar_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    landForecastDetail.windSpeedMps_ = this.windSpeedMps_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    landForecastDetail.gustSpeedMps_ = this.gustSpeedMps_;
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    landForecastDetail.windBearingDegrees_ = this.windBearingDegrees_;
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    landForecastDetail.humidityPercent_ = this.humidityPercent_;
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    landForecastDetail.cloudCoverPercent_ = this.cloudCoverPercent_;
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    landForecastDetail.precipType_ = this.precipType_;
                    i14 |= 1024;
                }
                if ((i15 & 2048) != 0) {
                    landForecastDetail.precipChancePercent_ = this.precipChancePercent_;
                    i14 |= 2048;
                }
                if ((i15 & 4096) != 0) {
                    landForecastDetail.precipAmountMm_ = this.precipAmountMm_;
                    i14 |= 4096;
                }
                if ((i15 & 8192) != 0) {
                    landForecastDetail.snowfallAmountMm_ = this.snowfallAmountMm_;
                    i14 |= 8192;
                }
                if ((i15 & 16384) != 0) {
                    landForecastDetail.uvIndex_ = this.uvIndex_;
                    i14 |= 16384;
                }
                if ((i15 & 32768) != 0) {
                    landForecastDetail.dewPointC_ = this.dewPointC_;
                    i14 |= 32768;
                }
                if ((i15 & 65536) != 0) {
                    landForecastDetail.airQuality_ = this.airQuality_;
                    i14 |= 65536;
                }
                if ((i15 & 131072) != 0) {
                    landForecastDetail.visibilityMeters_ = this.visibilityMeters_;
                    i14 |= 131072;
                }
                if ((i15 & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0) {
                    landForecastDetail.isNight_ = this.isNight_;
                    i14 |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                }
                if ((i15 & 524288) != 0) {
                    landForecastDetail.cloudCeilingHeightM_ = this.cloudCeilingHeightM_;
                    i14 |= 524288;
                }
                landForecastDetail.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_LandForecastDetail_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LandForecastDetail build() {
                LandForecastDetail landForecastDetailBuildPartial = buildPartial();
                if (landForecastDetailBuildPartial.isInitialized()) {
                    return landForecastDetailBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) landForecastDetailBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LandForecastDetail buildPartial() {
                LandForecastDetail landForecastDetail = new LandForecastDetail(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(landForecastDetail);
                }
                onBuilt();
                return landForecastDetail;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.detailTime_ = 0;
                this.icon_ = 0;
                this.temperatureC_ = 0.0f;
                this.feelsLikeTempC_ = 0.0f;
                this.pressureMillibar_ = 0.0f;
                this.windSpeedMps_ = 0.0f;
                this.gustSpeedMps_ = 0.0f;
                this.windBearingDegrees_ = 0;
                this.humidityPercent_ = 0;
                this.cloudCoverPercent_ = 0;
                this.precipType_ = 0;
                this.precipChancePercent_ = 0;
                this.precipAmountMm_ = 0;
                this.snowfallAmountMm_ = 0;
                this.uvIndex_ = 0.0f;
                this.dewPointC_ = 0.0f;
                this.airQuality_ = 0;
                this.visibilityMeters_ = 0.0f;
                this.isNight_ = false;
                this.cloudCeilingHeightM_ = 0.0f;
                return this;
            }

            public Builder clearAirQuality() {
                this.bitField0_ &= -65537;
                this.airQuality_ = 0;
                onChanged();
                return this;
            }

            public Builder clearCloudCeilingHeightM() {
                this.bitField0_ &= -524289;
                this.cloudCeilingHeightM_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearCloudCoverPercent() {
                this.bitField0_ &= -513;
                this.cloudCoverPercent_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDetailTime() {
                this.bitField0_ &= -2;
                this.detailTime_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDewPointC() {
                this.bitField0_ &= -32769;
                this.dewPointC_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearFeelsLikeTempC() {
                this.bitField0_ &= -9;
                this.feelsLikeTempC_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGustSpeedMps() {
                this.bitField0_ &= -65;
                this.gustSpeedMps_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearHumidityPercent() {
                this.bitField0_ &= -257;
                this.humidityPercent_ = 0;
                onChanged();
                return this;
            }

            public Builder clearIcon() {
                this.bitField0_ &= -3;
                this.icon_ = 0;
                onChanged();
                return this;
            }

            public Builder clearIsNight() {
                this.bitField0_ &= -262145;
                this.isNight_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPrecipAmountMm() {
                this.bitField0_ &= -4097;
                this.precipAmountMm_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPrecipChancePercent() {
                this.bitField0_ &= -2049;
                this.precipChancePercent_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPrecipType() {
                this.bitField0_ &= -1025;
                this.precipType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearPressureMillibar() {
                this.bitField0_ &= -17;
                this.pressureMillibar_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearSnowfallAmountMm() {
                this.bitField0_ &= -8193;
                this.snowfallAmountMm_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTemperatureC() {
                this.bitField0_ &= -5;
                this.temperatureC_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearUvIndex() {
                this.bitField0_ &= -16385;
                this.uvIndex_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearVisibilityMeters() {
                this.bitField0_ &= -131073;
                this.visibilityMeters_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearWindBearingDegrees() {
                this.bitField0_ &= -129;
                this.windBearingDegrees_ = 0;
                onChanged();
                return this;
            }

            public Builder clearWindSpeedMps() {
                this.bitField0_ &= -33;
                this.windSpeedMps_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public ForecastAirQuality getAirQuality() {
                ForecastAirQuality forecastAirQualityForNumber = ForecastAirQuality.forNumber(this.airQuality_);
                return forecastAirQualityForNumber == null ? ForecastAirQuality.FORECAST_AIR_QUALITY_INVALID : forecastAirQualityForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public float getCloudCeilingHeightM() {
                return this.cloudCeilingHeightM_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public int getCloudCoverPercent() {
                return this.cloudCoverPercent_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_LandForecastDetail_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public int getDetailTime() {
                return this.detailTime_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public float getDewPointC() {
                return this.dewPointC_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public float getFeelsLikeTempC() {
                return this.feelsLikeTempC_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public float getGustSpeedMps() {
                return this.gustSpeedMps_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public int getHumidityPercent() {
                return this.humidityPercent_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public WeatherIcon getIcon() {
                WeatherIcon weatherIconForNumber = WeatherIcon.forNumber(this.icon_);
                return weatherIconForNumber == null ? WeatherIcon.WEATHER_ICON_INVALID : weatherIconForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public boolean getIsNight() {
                return this.isNight_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public int getPrecipAmountMm() {
                return this.precipAmountMm_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public int getPrecipChancePercent() {
                return this.precipChancePercent_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public Precipitation getPrecipType() {
                Precipitation precipitationForNumber = Precipitation.forNumber(this.precipType_);
                return precipitationForNumber == null ? Precipitation.PRECIPITATION_UNKNOWN : precipitationForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public float getPressureMillibar() {
                return this.pressureMillibar_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public int getSnowfallAmountMm() {
                return this.snowfallAmountMm_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public float getTemperatureC() {
                return this.temperatureC_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public float getUvIndex() {
                return this.uvIndex_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public float getVisibilityMeters() {
                return this.visibilityMeters_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public int getWindBearingDegrees() {
                return this.windBearingDegrees_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public float getWindSpeedMps() {
                return this.windSpeedMps_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public boolean hasAirQuality() {
                return (this.bitField0_ & 65536) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public boolean hasCloudCeilingHeightM() {
                return (this.bitField0_ & 524288) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public boolean hasCloudCoverPercent() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public boolean hasDetailTime() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public boolean hasDewPointC() {
                return (this.bitField0_ & 32768) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public boolean hasFeelsLikeTempC() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public boolean hasGustSpeedMps() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public boolean hasHumidityPercent() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public boolean hasIcon() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public boolean hasIsNight() {
                return (this.bitField0_ & GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public boolean hasPrecipAmountMm() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public boolean hasPrecipChancePercent() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public boolean hasPrecipType() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public boolean hasPressureMillibar() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public boolean hasSnowfallAmountMm() {
                return (this.bitField0_ & 8192) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public boolean hasTemperatureC() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public boolean hasUvIndex() {
                return (this.bitField0_ & 16384) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public boolean hasVisibilityMeters() {
                return (this.bitField0_ & 131072) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public boolean hasWindBearingDegrees() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LandForecastDetailOrBuilder
            public boolean hasWindSpeedMps() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_LandForecastDetail_fieldAccessorTable.ensureFieldAccessorsInitialized(LandForecastDetail.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasDetailTime();
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
                                case 13:
                                    this.detailTime_ = codedInputStream.readFixed32();
                                    this.bitField0_ |= 1;
                                    continue;
                                case 16:
                                    int i14 = codedInputStream.readEnum();
                                    if (WeatherIcon.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.icon_ = i14;
                                        this.bitField0_ |= 2;
                                        continue;
                                    }
                                    break;
                                case 29:
                                    this.temperatureC_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 4;
                                    continue;
                                case 37:
                                    this.feelsLikeTempC_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 8;
                                    continue;
                                case 45:
                                    this.pressureMillibar_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 16;
                                    continue;
                                case 53:
                                    this.windSpeedMps_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 32;
                                    continue;
                                case 61:
                                    this.gustSpeedMps_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 64;
                                    continue;
                                case 64:
                                    this.windBearingDegrees_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 128;
                                    continue;
                                case 72:
                                    this.humidityPercent_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 256;
                                    continue;
                                case 80:
                                    this.cloudCoverPercent_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 512;
                                    continue;
                                case 88:
                                    int i15 = codedInputStream.readEnum();
                                    if (Precipitation.forNumber(i15) == null) {
                                        mergeUnknownVarintField(11, i15);
                                    } else {
                                        this.precipType_ = i15;
                                        this.bitField0_ |= 1024;
                                        continue;
                                    }
                                    break;
                                case 96:
                                    this.precipChancePercent_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2048;
                                    continue;
                                case 104:
                                    this.precipAmountMm_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4096;
                                    continue;
                                case 112:
                                    this.snowfallAmountMm_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8192;
                                    continue;
                                case 125:
                                    this.uvIndex_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 16384;
                                    continue;
                                case 133:
                                    this.dewPointC_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 32768;
                                    continue;
                                case SyslogConstants.LOG_LOCAL1 /* 136 */:
                                    int i16 = codedInputStream.readEnum();
                                    if (ForecastAirQuality.forNumber(i16) == null) {
                                        mergeUnknownVarintField(17, i16);
                                    } else {
                                        this.airQuality_ = i16;
                                        this.bitField0_ |= 65536;
                                        continue;
                                    }
                                    break;
                                case 149:
                                    this.visibilityMeters_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 131072;
                                    continue;
                                case SyslogConstants.LOG_LOCAL3 /* 152 */:
                                    this.isNight_ = codedInputStream.readBool();
                                    this.bitField0_ |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                                    continue;
                                case 165:
                                    this.cloudCeilingHeightM_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 524288;
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

            public Builder setAirQuality(ForecastAirQuality forecastAirQuality) {
                forecastAirQuality.getClass();
                this.bitField0_ |= 65536;
                this.airQuality_ = forecastAirQuality.getNumber();
                onChanged();
                return this;
            }

            public Builder setCloudCeilingHeightM(float f14) {
                this.cloudCeilingHeightM_ = f14;
                this.bitField0_ |= 524288;
                onChanged();
                return this;
            }

            public Builder setCloudCoverPercent(int i14) {
                this.cloudCoverPercent_ = i14;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setDetailTime(int i14) {
                this.detailTime_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setDewPointC(float f14) {
                this.dewPointC_ = f14;
                this.bitField0_ |= 32768;
                onChanged();
                return this;
            }

            public Builder setFeelsLikeTempC(float f14) {
                this.feelsLikeTempC_ = f14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setGustSpeedMps(float f14) {
                this.gustSpeedMps_ = f14;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setHumidityPercent(int i14) {
                this.humidityPercent_ = i14;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setIcon(WeatherIcon weatherIcon) {
                weatherIcon.getClass();
                this.bitField0_ |= 2;
                this.icon_ = weatherIcon.getNumber();
                onChanged();
                return this;
            }

            public Builder setIsNight(boolean z14) {
                this.isNight_ = z14;
                this.bitField0_ |= GDIInReachMessaging.Capabilities.MessagingCapability.PLAN_CHANGE_VALUE;
                onChanged();
                return this;
            }

            public Builder setPrecipAmountMm(int i14) {
                this.precipAmountMm_ = i14;
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setPrecipChancePercent(int i14) {
                this.precipChancePercent_ = i14;
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setPrecipType(Precipitation precipitation) {
                precipitation.getClass();
                this.bitField0_ |= 1024;
                this.precipType_ = precipitation.getNumber();
                onChanged();
                return this;
            }

            public Builder setPressureMillibar(float f14) {
                this.pressureMillibar_ = f14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSnowfallAmountMm(int i14) {
                this.snowfallAmountMm_ = i14;
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setTemperatureC(float f14) {
                this.temperatureC_ = f14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setUvIndex(float f14) {
                this.uvIndex_ = f14;
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setVisibilityMeters(float f14) {
                this.visibilityMeters_ = f14;
                this.bitField0_ |= 131072;
                onChanged();
                return this;
            }

            public Builder setWindBearingDegrees(int i14) {
                this.windBearingDegrees_ = i14;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setWindSpeedMps(float f14) {
                this.windSpeedMps_ = f14;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public LandForecastDetail getDefaultInstanceForType() {
                return LandForecastDetail.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.icon_ = 0;
                this.precipType_ = 0;
                this.airQuality_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LandForecastDetail) {
                    return mergeFrom((LandForecastDetail) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LandForecastDetail landForecastDetail) {
                if (landForecastDetail == LandForecastDetail.getDefaultInstance()) {
                    return this;
                }
                if (landForecastDetail.hasDetailTime()) {
                    setDetailTime(landForecastDetail.getDetailTime());
                }
                if (landForecastDetail.hasIcon()) {
                    setIcon(landForecastDetail.getIcon());
                }
                if (landForecastDetail.hasTemperatureC()) {
                    setTemperatureC(landForecastDetail.getTemperatureC());
                }
                if (landForecastDetail.hasFeelsLikeTempC()) {
                    setFeelsLikeTempC(landForecastDetail.getFeelsLikeTempC());
                }
                if (landForecastDetail.hasPressureMillibar()) {
                    setPressureMillibar(landForecastDetail.getPressureMillibar());
                }
                if (landForecastDetail.hasWindSpeedMps()) {
                    setWindSpeedMps(landForecastDetail.getWindSpeedMps());
                }
                if (landForecastDetail.hasGustSpeedMps()) {
                    setGustSpeedMps(landForecastDetail.getGustSpeedMps());
                }
                if (landForecastDetail.hasWindBearingDegrees()) {
                    setWindBearingDegrees(landForecastDetail.getWindBearingDegrees());
                }
                if (landForecastDetail.hasHumidityPercent()) {
                    setHumidityPercent(landForecastDetail.getHumidityPercent());
                }
                if (landForecastDetail.hasCloudCoverPercent()) {
                    setCloudCoverPercent(landForecastDetail.getCloudCoverPercent());
                }
                if (landForecastDetail.hasPrecipType()) {
                    setPrecipType(landForecastDetail.getPrecipType());
                }
                if (landForecastDetail.hasPrecipChancePercent()) {
                    setPrecipChancePercent(landForecastDetail.getPrecipChancePercent());
                }
                if (landForecastDetail.hasPrecipAmountMm()) {
                    setPrecipAmountMm(landForecastDetail.getPrecipAmountMm());
                }
                if (landForecastDetail.hasSnowfallAmountMm()) {
                    setSnowfallAmountMm(landForecastDetail.getSnowfallAmountMm());
                }
                if (landForecastDetail.hasUvIndex()) {
                    setUvIndex(landForecastDetail.getUvIndex());
                }
                if (landForecastDetail.hasDewPointC()) {
                    setDewPointC(landForecastDetail.getDewPointC());
                }
                if (landForecastDetail.hasAirQuality()) {
                    setAirQuality(landForecastDetail.getAirQuality());
                }
                if (landForecastDetail.hasVisibilityMeters()) {
                    setVisibilityMeters(landForecastDetail.getVisibilityMeters());
                }
                if (landForecastDetail.hasIsNight()) {
                    setIsNight(landForecastDetail.getIsNight());
                }
                if (landForecastDetail.hasCloudCeilingHeightM()) {
                    setCloudCeilingHeightM(landForecastDetail.getCloudCeilingHeightM());
                }
                mergeUnknownFields(landForecastDetail.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LandForecastDetail getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static LandForecastDetail parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LandForecastDetail) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LandForecastDetail parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LandForecastDetail parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LandForecastDetail parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LandForecastDetail parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LandForecastDetail parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LandForecastDetail parseFrom(InputStream inputStream) {
            return (LandForecastDetail) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LandForecastDetail parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LandForecastDetail) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LandForecastDetail parseFrom(CodedInputStream codedInputStream) {
            return (LandForecastDetail) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LandForecastDetail parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LandForecastDetail) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ LandForecastDetail(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private LandForecastDetail() {
            this.detailTime_ = 0;
            this.temperatureC_ = 0.0f;
            this.feelsLikeTempC_ = 0.0f;
            this.pressureMillibar_ = 0.0f;
            this.windSpeedMps_ = 0.0f;
            this.gustSpeedMps_ = 0.0f;
            this.windBearingDegrees_ = 0;
            this.humidityPercent_ = 0;
            this.cloudCoverPercent_ = 0;
            this.precipChancePercent_ = 0;
            this.precipAmountMm_ = 0;
            this.snowfallAmountMm_ = 0;
            this.uvIndex_ = 0.0f;
            this.dewPointC_ = 0.0f;
            this.visibilityMeters_ = 0.0f;
            this.isNight_ = false;
            this.cloudCeilingHeightM_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
            this.icon_ = 0;
            this.precipType_ = 0;
            this.airQuality_ = 0;
        }
    }

    public static final class Location extends GeneratedMessageV3 implements LocationOrBuilder {
        public static final int DELETED_FIELD_NUMBER = 2;
        public static final int MODIFIED_TIME_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 5;
        public static final int POINT_FIELD_NUMBER = 4;
        public static final int UUID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean deleted_;
        private byte memoizedIsInitialized;
        private int modifiedTime_;
        private volatile Object name_;
        private GDIDataTypes.ScPoint point_;
        private GDIDataTypes.UUID uuid_;
        private static final Location DEFAULT_INSTANCE = new Location();

        @Deprecated
        public static final Parser<Location> PARSER = new AbstractParser<Location>() { // from class: com.garmin.proto.generated.GDIInReachWeather.Location.1
            @Override // com.google.protobuf.Parser
            public Location parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Location.newBuilder();
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

        private Location() {
            this.deleted_ = false;
            this.modifiedTime_ = 0;
            this.name_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
        }

        public static Location getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_Location_descriptor;
        }

        public static Builder newBuilder(Location location) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(location);
        }

        public static Location parseDelimitedFrom(InputStream inputStream) {
            return (Location) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Location parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Location> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Location)) {
                return super.equals(obj);
            }
            Location location = (Location) obj;
            if (hasUuid() != location.hasUuid()) {
                return false;
            }
            if ((hasUuid() && !getUuid().equals(location.getUuid())) || hasDeleted() != location.hasDeleted()) {
                return false;
            }
            if ((hasDeleted() && getDeleted() != location.getDeleted()) || hasModifiedTime() != location.hasModifiedTime()) {
                return false;
            }
            if ((hasModifiedTime() && getModifiedTime() != location.getModifiedTime()) || hasPoint() != location.hasPoint()) {
                return false;
            }
            if ((!hasPoint() || getPoint().equals(location.getPoint())) && hasName() == location.hasName()) {
                return (!hasName() || getName().equals(location.getName())) && getUnknownFields().equals(location.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LocationOrBuilder
        public boolean getDeleted() {
            return this.deleted_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LocationOrBuilder
        public int getModifiedTime() {
            return this.modifiedTime_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LocationOrBuilder
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

        @Override // com.garmin.proto.generated.GDIInReachWeather.LocationOrBuilder
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
        public Parser<Location> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LocationOrBuilder
        public GDIDataTypes.ScPoint getPoint() {
            GDIDataTypes.ScPoint scPoint = this.point_;
            return scPoint == null ? GDIDataTypes.ScPoint.getDefaultInstance() : scPoint;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LocationOrBuilder
        public GDIDataTypes.ScPointOrBuilder getPointOrBuilder() {
            GDIDataTypes.ScPoint scPoint = this.point_;
            return scPoint == null ? GDIDataTypes.ScPoint.getDefaultInstance() : scPoint;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getUuid()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeBoolSize(2, this.deleted_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeFixed32Size(3, this.modifiedTime_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getPoint());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += GeneratedMessageV3.computeStringSize(5, this.name_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LocationOrBuilder
        public GDIDataTypes.UUID getUuid() {
            GDIDataTypes.UUID uuid = this.uuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LocationOrBuilder
        public GDIDataTypes.UUIDOrBuilder getUuidOrBuilder() {
            GDIDataTypes.UUID uuid = this.uuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LocationOrBuilder
        public boolean hasDeleted() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LocationOrBuilder
        public boolean hasModifiedTime() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LocationOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LocationOrBuilder
        public boolean hasPoint() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LocationOrBuilder
        public boolean hasUuid() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasUuid()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getUuid().hashCode();
            }
            if (hasDeleted()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getDeleted());
            }
            if (hasModifiedTime()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getModifiedTime();
            }
            if (hasPoint()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getPoint().hashCode();
            }
            if (hasName()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getName().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_Location_fieldAccessorTable.ensureFieldAccessorsInitialized(Location.class, Builder.class);
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
            if (hasUuid() && !getUuid().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasPoint() || getPoint().isInitialized()) {
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
            return new Location();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getUuid());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.deleted_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeFixed32(3, this.modifiedTime_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getPoint());
            }
            if ((this.bitField0_ & 16) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 5, this.name_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LocationOrBuilder {
            private int bitField0_;
            private boolean deleted_;
            private int modifiedTime_;
            private Object name_;
            private SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> pointBuilder_;
            private GDIDataTypes.ScPoint point_;
            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> uuidBuilder_;
            private GDIDataTypes.UUID uuid_;

            private Builder() {
                this.name_ = "";
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Location location) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                    location.uuid_ = singleFieldBuilderV3 == null ? this.uuid_ : (GDIDataTypes.UUID) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    location.deleted_ = this.deleted_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    location.modifiedTime_ = this.modifiedTime_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV4 = this.pointBuilder_;
                    location.point_ = singleFieldBuilderV4 == null ? this.point_ : (GDIDataTypes.ScPoint) singleFieldBuilderV4.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    location.name_ = this.name_;
                    i14 |= 16;
                }
                location.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_Location_descriptor;
            }

            private SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> getPointFieldBuilder() {
                if (this.pointBuilder_ == null) {
                    this.pointBuilder_ = new SingleFieldBuilderV3<>(getPoint(), getParentForChildren(), isClean());
                    this.point_ = null;
                }
                return this.pointBuilder_;
            }

            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> getUuidFieldBuilder() {
                if (this.uuidBuilder_ == null) {
                    this.uuidBuilder_ = new SingleFieldBuilderV3<>(getUuid(), getParentForChildren(), isClean());
                    this.uuid_ = null;
                }
                return this.uuidBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getUuidFieldBuilder();
                    getPointFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Location build() {
                Location locationBuildPartial = buildPartial();
                if (locationBuildPartial.isInitialized()) {
                    return locationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) locationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Location buildPartial() {
                Location location = new Location(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(location);
                }
                onBuilt();
                return location;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.uuid_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.uuidBuilder_ = null;
                }
                this.deleted_ = false;
                this.modifiedTime_ = 0;
                this.point_ = null;
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV4 = this.pointBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.pointBuilder_ = null;
                }
                this.name_ = "";
                return this;
            }

            public Builder clearDeleted() {
                this.bitField0_ &= -3;
                this.deleted_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearModifiedTime() {
                this.bitField0_ &= -5;
                this.modifiedTime_ = 0;
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.name_ = Location.getDefaultInstance().getName();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPoint() {
                this.bitField0_ &= -9;
                this.point_ = null;
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.pointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.pointBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearUuid() {
                this.bitField0_ &= -2;
                this.uuid_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.uuidBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LocationOrBuilder
            public boolean getDeleted() {
                return this.deleted_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_Location_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LocationOrBuilder
            public int getModifiedTime() {
                return this.modifiedTime_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LocationOrBuilder
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

            @Override // com.garmin.proto.generated.GDIInReachWeather.LocationOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LocationOrBuilder
            public GDIDataTypes.ScPoint getPoint() {
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.pointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.ScPoint) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.ScPoint scPoint = this.point_;
                return scPoint == null ? GDIDataTypes.ScPoint.getDefaultInstance() : scPoint;
            }

            public GDIDataTypes.ScPoint.Builder getPointBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (GDIDataTypes.ScPoint.Builder) getPointFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LocationOrBuilder
            public GDIDataTypes.ScPointOrBuilder getPointOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.pointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.ScPointOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.ScPoint scPoint = this.point_;
                return scPoint == null ? GDIDataTypes.ScPoint.getDefaultInstance() : scPoint;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LocationOrBuilder
            public GDIDataTypes.UUID getUuid() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUID) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.UUID uuid = this.uuid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            public GDIDataTypes.UUID.Builder getUuidBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (GDIDataTypes.UUID.Builder) getUuidFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LocationOrBuilder
            public GDIDataTypes.UUIDOrBuilder getUuidOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUIDOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.UUID uuid = this.uuid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LocationOrBuilder
            public boolean hasDeleted() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LocationOrBuilder
            public boolean hasModifiedTime() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LocationOrBuilder
            public boolean hasName() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LocationOrBuilder
            public boolean hasPoint() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LocationOrBuilder
            public boolean hasUuid() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_Location_fieldAccessorTable.ensureFieldAccessorsInitialized(Location.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasUuid() || getUuid().isInitialized()) {
                    return !hasPoint() || getPoint().isInitialized();
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
                                    codedInputStream.readMessage(getUuidFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.deleted_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2;
                                } else if (tag == 29) {
                                    this.modifiedTime_ = codedInputStream.readFixed32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getPointFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    this.name_ = codedInputStream.readBytes();
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

            public Builder mergePoint(GDIDataTypes.ScPoint scPoint) {
                GDIDataTypes.ScPoint scPoint2;
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.pointBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(scPoint);
                } else if ((this.bitField0_ & 8) == 0 || (scPoint2 = this.point_) == null || scPoint2 == GDIDataTypes.ScPoint.getDefaultInstance()) {
                    this.point_ = scPoint;
                } else {
                    getPointBuilder().mergeFrom(scPoint);
                }
                if (this.point_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder mergeUuid(GDIDataTypes.UUID uuid) {
                GDIDataTypes.UUID uuid2;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(uuid);
                } else if ((this.bitField0_ & 1) == 0 || (uuid2 = this.uuid_) == null || uuid2 == GDIDataTypes.UUID.getDefaultInstance()) {
                    this.uuid_ = uuid;
                } else {
                    getUuidBuilder().mergeFrom(uuid);
                }
                if (this.uuid_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder setDeleted(boolean z14) {
                this.deleted_ = z14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setModifiedTime(int i14) {
                this.modifiedTime_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setName(String str) {
                str.getClass();
                this.name_ = str;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                byteString.getClass();
                this.name_ = byteString;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setPoint(GDIDataTypes.ScPoint.Builder builder) {
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.pointBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.point_ = builder.build();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setUuid(GDIDataTypes.UUID.Builder builder) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.uuid_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Location getDefaultInstanceForType() {
                return Location.getDefaultInstance();
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
                maybeForceBuilderInitialization();
            }

            public Builder setPoint(GDIDataTypes.ScPoint scPoint) {
                SingleFieldBuilderV3<GDIDataTypes.ScPoint, GDIDataTypes.ScPoint.Builder, GDIDataTypes.ScPointOrBuilder> singleFieldBuilderV3 = this.pointBuilder_;
                if (singleFieldBuilderV3 == null) {
                    scPoint.getClass();
                    this.point_ = scPoint;
                } else {
                    singleFieldBuilderV3.setMessage(scPoint);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setUuid(GDIDataTypes.UUID uuid) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uuid.getClass();
                    this.uuid_ = uuid;
                } else {
                    singleFieldBuilderV3.setMessage(uuid);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Location) {
                    return mergeFrom((Location) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Location location) {
                if (location == Location.getDefaultInstance()) {
                    return this;
                }
                if (location.hasUuid()) {
                    mergeUuid(location.getUuid());
                }
                if (location.hasDeleted()) {
                    setDeleted(location.getDeleted());
                }
                if (location.hasModifiedTime()) {
                    setModifiedTime(location.getModifiedTime());
                }
                if (location.hasPoint()) {
                    mergePoint(location.getPoint());
                }
                if (location.hasName()) {
                    this.name_ = location.name_;
                    this.bitField0_ |= 16;
                    onChanged();
                }
                mergeUnknownFields(location.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Location getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Location parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Location) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Location parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Location parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Location parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Location parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Location parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Location parseFrom(InputStream inputStream) {
            return (Location) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Location parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Location) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private Location(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.deleted_ = false;
            this.modifiedTime_ = 0;
            this.name_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Location parseFrom(CodedInputStream codedInputStream) {
            return (Location) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Location parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Location) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ Location(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class LocationModifiedNotification extends GeneratedMessageV3 implements LocationModifiedNotificationOrBuilder {
        public static final int LOCATION_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private Location location_;
        private byte memoizedIsInitialized;
        private static final LocationModifiedNotification DEFAULT_INSTANCE = new LocationModifiedNotification();

        @Deprecated
        public static final Parser<LocationModifiedNotification> PARSER = new AbstractParser<LocationModifiedNotification>() { // from class: com.garmin.proto.generated.GDIInReachWeather.LocationModifiedNotification.1
            @Override // com.google.protobuf.Parser
            public LocationModifiedNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LocationModifiedNotification.newBuilder();
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

        private LocationModifiedNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LocationModifiedNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_LocationModifiedNotification_descriptor;
        }

        public static Builder newBuilder(LocationModifiedNotification locationModifiedNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(locationModifiedNotification);
        }

        public static LocationModifiedNotification parseDelimitedFrom(InputStream inputStream) {
            return (LocationModifiedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LocationModifiedNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LocationModifiedNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LocationModifiedNotification)) {
                return super.equals(obj);
            }
            LocationModifiedNotification locationModifiedNotification = (LocationModifiedNotification) obj;
            if (hasLocation() != locationModifiedNotification.hasLocation()) {
                return false;
            }
            return (!hasLocation() || getLocation().equals(locationModifiedNotification.getLocation())) && getUnknownFields().equals(locationModifiedNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LocationModifiedNotificationOrBuilder
        public Location getLocation() {
            Location location = this.location_;
            return location == null ? Location.getDefaultInstance() : location;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.LocationModifiedNotificationOrBuilder
        public LocationOrBuilder getLocationOrBuilder() {
            Location location = this.location_;
            return location == null ? Location.getDefaultInstance() : location;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LocationModifiedNotification> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIInReachWeather.LocationModifiedNotificationOrBuilder
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
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_LocationModifiedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(LocationModifiedNotification.class, Builder.class);
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
            return new LocationModifiedNotification();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LocationModifiedNotificationOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> locationBuilder_;
            private Location location_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(LocationModifiedNotification locationModifiedNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                    locationModifiedNotification.location_ = singleFieldBuilderV3 == null ? this.location_ : (Location) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                locationModifiedNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_LocationModifiedNotification_descriptor;
            }

            private SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> getLocationFieldBuilder() {
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
            public LocationModifiedNotification build() {
                LocationModifiedNotification locationModifiedNotificationBuildPartial = buildPartial();
                if (locationModifiedNotificationBuildPartial.isInitialized()) {
                    return locationModifiedNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) locationModifiedNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LocationModifiedNotification buildPartial() {
                LocationModifiedNotification locationModifiedNotification = new LocationModifiedNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(locationModifiedNotification);
                }
                onBuilt();
                return locationModifiedNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.location_ = null;
                SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
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
                SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
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
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_LocationModifiedNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LocationModifiedNotificationOrBuilder
            public Location getLocation() {
                SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Location) singleFieldBuilderV3.getMessage();
                }
                Location location = this.location_;
                return location == null ? Location.getDefaultInstance() : location;
            }

            public Location.Builder getLocationBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (Location.Builder) getLocationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LocationModifiedNotificationOrBuilder
            public LocationOrBuilder getLocationOrBuilder() {
                SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LocationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Location location = this.location_;
                return location == null ? Location.getDefaultInstance() : location;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.LocationModifiedNotificationOrBuilder
            public boolean hasLocation() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_LocationModifiedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(LocationModifiedNotification.class, Builder.class);
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

            public Builder mergeLocation(Location location) {
                Location location2;
                SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(location);
                } else if ((this.bitField0_ & 1) == 0 || (location2 = this.location_) == null || location2 == Location.getDefaultInstance()) {
                    this.location_ = location;
                } else {
                    getLocationBuilder().mergeFrom(location);
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

            public Builder setLocation(Location.Builder builder) {
                SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
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
            public LocationModifiedNotification getDefaultInstanceForType() {
                return LocationModifiedNotification.getDefaultInstance();
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

            public Builder setLocation(Location location) {
                SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    location.getClass();
                    this.location_ = location;
                } else {
                    singleFieldBuilderV3.setMessage(location);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LocationModifiedNotification) {
                    return mergeFrom((LocationModifiedNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LocationModifiedNotification locationModifiedNotification) {
                if (locationModifiedNotification == LocationModifiedNotification.getDefaultInstance()) {
                    return this;
                }
                if (locationModifiedNotification.hasLocation()) {
                    mergeLocation(locationModifiedNotification.getLocation());
                }
                mergeUnknownFields(locationModifiedNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LocationModifiedNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ LocationModifiedNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private LocationModifiedNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LocationModifiedNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LocationModifiedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LocationModifiedNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LocationModifiedNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LocationModifiedNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LocationModifiedNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LocationModifiedNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LocationModifiedNotification parseFrom(InputStream inputStream) {
            return (LocationModifiedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LocationModifiedNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LocationModifiedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LocationModifiedNotification parseFrom(CodedInputStream codedInputStream) {
            return (LocationModifiedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LocationModifiedNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LocationModifiedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class RequestForecastRequest extends GeneratedMessageV3 implements RequestForecastRequestOrBuilder {
        public static final int FORECAST_TYPES_FIELD_NUMBER = 2;
        public static final int LOCATION_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private List<Integer> forecastTypes_;
        private Location location_;
        private byte memoizedIsInitialized;
        private static final Internal.ListAdapter.Converter<Integer, Forecast.Type> forecastTypes_converter_ = new Internal.ListAdapter.Converter<Integer, Forecast.Type>() { // from class: com.garmin.proto.generated.GDIInReachWeather.RequestForecastRequest.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public Forecast.Type convert(Integer num) {
                Forecast.Type typeForNumber = Forecast.Type.forNumber(num.intValue());
                return typeForNumber == null ? Forecast.Type.FORECAST_TYPE_INVALID : typeForNumber;
            }
        };
        private static final RequestForecastRequest DEFAULT_INSTANCE = new RequestForecastRequest();

        @Deprecated
        public static final Parser<RequestForecastRequest> PARSER = new AbstractParser<RequestForecastRequest>() { // from class: com.garmin.proto.generated.GDIInReachWeather.RequestForecastRequest.2
            @Override // com.google.protobuf.Parser
            public RequestForecastRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = RequestForecastRequest.newBuilder();
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

        private RequestForecastRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.forecastTypes_ = Collections.EMPTY_LIST;
        }

        public static RequestForecastRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_RequestForecastRequest_descriptor;
        }

        public static Builder newBuilder(RequestForecastRequest requestForecastRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(requestForecastRequest);
        }

        public static RequestForecastRequest parseDelimitedFrom(InputStream inputStream) {
            return (RequestForecastRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static RequestForecastRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<RequestForecastRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RequestForecastRequest)) {
                return super.equals(obj);
            }
            RequestForecastRequest requestForecastRequest = (RequestForecastRequest) obj;
            if (hasLocation() != requestForecastRequest.hasLocation()) {
                return false;
            }
            return (!hasLocation() || getLocation().equals(requestForecastRequest.getLocation())) && this.forecastTypes_.equals(requestForecastRequest.forecastTypes_) && getUnknownFields().equals(requestForecastRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.RequestForecastRequestOrBuilder
        public Forecast.Type getForecastTypes(int i14) {
            return forecastTypes_converter_.convert(this.forecastTypes_.get(i14));
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.RequestForecastRequestOrBuilder
        public int getForecastTypesCount() {
            return this.forecastTypes_.size();
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.RequestForecastRequestOrBuilder
        public List<Forecast.Type> getForecastTypesList() {
            return new Internal.ListAdapter(this.forecastTypes_, forecastTypes_converter_);
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.RequestForecastRequestOrBuilder
        public Location getLocation() {
            Location location = this.location_;
            return location == null ? Location.getDefaultInstance() : location;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.RequestForecastRequestOrBuilder
        public LocationOrBuilder getLocationOrBuilder() {
            Location location = this.location_;
            return location == null ? Location.getDefaultInstance() : location;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<RequestForecastRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int i15 = 0;
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getLocation()) : 0;
            int iA = 0;
            while (true) {
                int size = this.forecastTypes_.size();
                List<Integer> list = this.forecastTypes_;
                if (i15 >= size) {
                    int serializedSize = getUnknownFields().getSerializedSize() + list.size() + iComputeMessageSize + iA;
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }
                iA = f3.a(iA, list.get(i15));
                i15++;
            }
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.RequestForecastRequestOrBuilder
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
            if (getForecastTypesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.forecastTypes_.hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_RequestForecastRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(RequestForecastRequest.class, Builder.class);
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
            return new RequestForecastRequest();
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
            int iF = 0;
            while (iF < this.forecastTypes_.size()) {
                iF = f3.f(this.forecastTypes_.get(iF), codedOutputStream, 2, iF, 1);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RequestForecastRequestOrBuilder {
            private int bitField0_;
            private List<Integer> forecastTypes_;
            private SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> locationBuilder_;
            private Location location_;

            private Builder() {
                this.forecastTypes_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(RequestForecastRequest requestForecastRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                    requestForecastRequest.location_ = singleFieldBuilderV3 == null ? this.location_ : (Location) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                requestForecastRequest.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(RequestForecastRequest requestForecastRequest) {
                if ((this.bitField0_ & 2) != 0) {
                    this.forecastTypes_ = Collections.unmodifiableList(this.forecastTypes_);
                    this.bitField0_ &= -3;
                }
                requestForecastRequest.forecastTypes_ = this.forecastTypes_;
            }

            private void ensureForecastTypesIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.forecastTypes_ = new ArrayList(this.forecastTypes_);
                    this.bitField0_ |= 2;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_RequestForecastRequest_descriptor;
            }

            private SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> getLocationFieldBuilder() {
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

            public Builder addAllForecastTypes(Iterable<? extends Forecast.Type> iterable) {
                ensureForecastTypesIsMutable();
                Iterator<? extends Forecast.Type> it = iterable.iterator();
                while (it.hasNext()) {
                    this.forecastTypes_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addForecastTypes(Forecast.Type type) {
                type.getClass();
                ensureForecastTypesIsMutable();
                this.forecastTypes_.add(Integer.valueOf(type.getNumber()));
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RequestForecastRequest build() {
                RequestForecastRequest requestForecastRequestBuildPartial = buildPartial();
                if (requestForecastRequestBuildPartial.isInitialized()) {
                    return requestForecastRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) requestForecastRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RequestForecastRequest buildPartial() {
                RequestForecastRequest requestForecastRequest = new RequestForecastRequest(this);
                buildPartialRepeatedFields(requestForecastRequest);
                if (this.bitField0_ != 0) {
                    buildPartial0(requestForecastRequest);
                }
                onBuilt();
                return requestForecastRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.location_ = null;
                SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.locationBuilder_ = null;
                }
                this.forecastTypes_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearForecastTypes() {
                this.forecastTypes_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearLocation() {
                this.bitField0_ &= -2;
                this.location_ = null;
                SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
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
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_RequestForecastRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.RequestForecastRequestOrBuilder
            public Forecast.Type getForecastTypes(int i14) {
                return (Forecast.Type) RequestForecastRequest.forecastTypes_converter_.convert(this.forecastTypes_.get(i14));
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.RequestForecastRequestOrBuilder
            public int getForecastTypesCount() {
                return this.forecastTypes_.size();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.RequestForecastRequestOrBuilder
            public List<Forecast.Type> getForecastTypesList() {
                return new Internal.ListAdapter(this.forecastTypes_, RequestForecastRequest.forecastTypes_converter_);
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.RequestForecastRequestOrBuilder
            public Location getLocation() {
                SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Location) singleFieldBuilderV3.getMessage();
                }
                Location location = this.location_;
                return location == null ? Location.getDefaultInstance() : location;
            }

            public Location.Builder getLocationBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (Location.Builder) getLocationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.RequestForecastRequestOrBuilder
            public LocationOrBuilder getLocationOrBuilder() {
                SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LocationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Location location = this.location_;
                return location == null ? Location.getDefaultInstance() : location;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.RequestForecastRequestOrBuilder
            public boolean hasLocation() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_RequestForecastRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(RequestForecastRequest.class, Builder.class);
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
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (Forecast.Type.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        ensureForecastTypesIsMutable();
                                        this.forecastTypes_.add(Integer.valueOf(i14));
                                    }
                                } else if (tag == 18) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int i15 = codedInputStream.readEnum();
                                        if (Forecast.Type.forNumber(i15) == null) {
                                            mergeUnknownVarintField(2, i15);
                                        } else {
                                            ensureForecastTypesIsMutable();
                                            this.forecastTypes_.add(Integer.valueOf(i15));
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

            public Builder mergeLocation(Location location) {
                Location location2;
                SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(location);
                } else if ((this.bitField0_ & 1) == 0 || (location2 = this.location_) == null || location2 == Location.getDefaultInstance()) {
                    this.location_ = location;
                } else {
                    getLocationBuilder().mergeFrom(location);
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

            public Builder setForecastTypes(int i14, Forecast.Type type) {
                type.getClass();
                ensureForecastTypesIsMutable();
                this.forecastTypes_.set(i14, Integer.valueOf(type.getNumber()));
                onChanged();
                return this;
            }

            public Builder setLocation(Location.Builder builder) {
                SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
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
            public RequestForecastRequest getDefaultInstanceForType() {
                return RequestForecastRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.forecastTypes_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public Builder setLocation(Location location) {
                SingleFieldBuilderV3<Location, Location.Builder, LocationOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    location.getClass();
                    this.location_ = location;
                } else {
                    singleFieldBuilderV3.setMessage(location);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof RequestForecastRequest) {
                    return mergeFrom((RequestForecastRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(RequestForecastRequest requestForecastRequest) {
                if (requestForecastRequest == RequestForecastRequest.getDefaultInstance()) {
                    return this;
                }
                if (requestForecastRequest.hasLocation()) {
                    mergeLocation(requestForecastRequest.getLocation());
                }
                if (!requestForecastRequest.forecastTypes_.isEmpty()) {
                    if (this.forecastTypes_.isEmpty()) {
                        this.forecastTypes_ = requestForecastRequest.forecastTypes_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureForecastTypesIsMutable();
                        this.forecastTypes_.addAll(requestForecastRequest.forecastTypes_);
                    }
                    onChanged();
                }
                mergeUnknownFields(requestForecastRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public RequestForecastRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static RequestForecastRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RequestForecastRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RequestForecastRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static RequestForecastRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private RequestForecastRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static RequestForecastRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static RequestForecastRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ RequestForecastRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static RequestForecastRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static RequestForecastRequest parseFrom(InputStream inputStream) {
            return (RequestForecastRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static RequestForecastRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RequestForecastRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RequestForecastRequest parseFrom(CodedInputStream codedInputStream) {
            return (RequestForecastRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static RequestForecastRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RequestForecastRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class RequestForecastResponse extends GeneratedMessageV3 implements RequestForecastResponseOrBuilder {
        public static final int FORECASTS_FIELD_NUMBER = 2;
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private List<Forecast> forecasts_;
        private byte memoizedIsInitialized;
        private int status_;
        private static final RequestForecastResponse DEFAULT_INSTANCE = new RequestForecastResponse();

        @Deprecated
        public static final Parser<RequestForecastResponse> PARSER = new AbstractParser<RequestForecastResponse>() { // from class: com.garmin.proto.generated.GDIInReachWeather.RequestForecastResponse.1
            @Override // com.google.protobuf.Parser
            public RequestForecastResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = RequestForecastResponse.newBuilder();
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

        private RequestForecastResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
            this.forecasts_ = Collections.EMPTY_LIST;
        }

        public static RequestForecastResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_RequestForecastResponse_descriptor;
        }

        public static Builder newBuilder(RequestForecastResponse requestForecastResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(requestForecastResponse);
        }

        public static RequestForecastResponse parseDelimitedFrom(InputStream inputStream) {
            return (RequestForecastResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static RequestForecastResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<RequestForecastResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RequestForecastResponse)) {
                return super.equals(obj);
            }
            RequestForecastResponse requestForecastResponse = (RequestForecastResponse) obj;
            if (hasStatus() != requestForecastResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == requestForecastResponse.status_) && getForecastsList().equals(requestForecastResponse.getForecastsList()) && getUnknownFields().equals(requestForecastResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.RequestForecastResponseOrBuilder
        public Forecast getForecasts(int i14) {
            return this.forecasts_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.RequestForecastResponseOrBuilder
        public int getForecastsCount() {
            return this.forecasts_.size();
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.RequestForecastResponseOrBuilder
        public List<Forecast> getForecastsList() {
            return this.forecasts_;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.RequestForecastResponseOrBuilder
        public ForecastOrBuilder getForecastsOrBuilder(int i14) {
            return this.forecasts_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.RequestForecastResponseOrBuilder
        public List<? extends ForecastOrBuilder> getForecastsOrBuilderList() {
            return this.forecasts_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<RequestForecastResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.status_) : 0;
            for (int i15 = 0; i15 < this.forecasts_.size(); i15++) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, this.forecasts_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.RequestForecastResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.UNKNOWN_STATUS : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.RequestForecastResponseOrBuilder
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
            if (getForecastsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getForecastsList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_RequestForecastResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(RequestForecastResponse.class, Builder.class);
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
            for (int i14 = 0; i14 < getForecastsCount(); i14++) {
                if (!getForecasts(i14).isInitialized()) {
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
            return new RequestForecastResponse();
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
            for (int i14 = 0; i14 < this.forecasts_.size(); i14++) {
                codedOutputStream.writeMessage(2, this.forecasts_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RequestForecastResponseOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> forecastsBuilder_;
            private List<Forecast> forecasts_;
            private int status_;

            private Builder() {
                this.status_ = 0;
                this.forecasts_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(RequestForecastResponse requestForecastResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    requestForecastResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                requestForecastResponse.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(RequestForecastResponse requestForecastResponse) {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    requestForecastResponse.forecasts_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 2) != 0) {
                    this.forecasts_ = Collections.unmodifiableList(this.forecasts_);
                    this.bitField0_ &= -3;
                }
                requestForecastResponse.forecasts_ = this.forecasts_;
            }

            private void ensureForecastsIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.forecasts_ = new ArrayList(this.forecasts_);
                    this.bitField0_ |= 2;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_RequestForecastResponse_descriptor;
            }

            private RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> getForecastsFieldBuilder() {
                if (this.forecastsBuilder_ == null) {
                    this.forecastsBuilder_ = new RepeatedFieldBuilderV3<>(this.forecasts_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.forecasts_ = null;
                }
                return this.forecastsBuilder_;
            }

            public Builder addAllForecasts(Iterable<? extends Forecast> iterable) {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureForecastsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.forecasts_);
                onChanged();
                return this;
            }

            public Builder addForecasts(Forecast.Builder builder) {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureForecastsIsMutable();
                this.forecasts_.add(builder.build());
                onChanged();
                return this;
            }

            public Forecast.Builder addForecastsBuilder() {
                return (Forecast.Builder) getForecastsFieldBuilder().addBuilder(Forecast.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RequestForecastResponse build() {
                RequestForecastResponse requestForecastResponseBuildPartial = buildPartial();
                if (requestForecastResponseBuildPartial.isInitialized()) {
                    return requestForecastResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) requestForecastResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RequestForecastResponse buildPartial() {
                RequestForecastResponse requestForecastResponse = new RequestForecastResponse(this);
                buildPartialRepeatedFields(requestForecastResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(requestForecastResponse);
                }
                onBuilt();
                return requestForecastResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.forecasts_ = Collections.EMPTY_LIST;
                } else {
                    this.forecasts_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -3;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearForecasts() {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.forecasts_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
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
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_RequestForecastResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.RequestForecastResponseOrBuilder
            public Forecast getForecasts(int i14) {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.forecasts_.get(i14) : (Forecast) repeatedFieldBuilderV3.getMessage(i14);
            }

            public Forecast.Builder getForecastsBuilder(int i14) {
                return (Forecast.Builder) getForecastsFieldBuilder().getBuilder(i14);
            }

            public List<Forecast.Builder> getForecastsBuilderList() {
                return getForecastsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.RequestForecastResponseOrBuilder
            public int getForecastsCount() {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.forecasts_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.RequestForecastResponseOrBuilder
            public List<Forecast> getForecastsList() {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.forecasts_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.RequestForecastResponseOrBuilder
            public ForecastOrBuilder getForecastsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.forecasts_.get(i14) : (ForecastOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.RequestForecastResponseOrBuilder
            public List<? extends ForecastOrBuilder> getForecastsOrBuilderList() {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.forecasts_);
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.RequestForecastResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.UNKNOWN_STATUS : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.RequestForecastResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_RequestForecastResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(RequestForecastResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasStatus()) {
                    return false;
                }
                for (int i14 = 0; i14 < getForecastsCount(); i14++) {
                    if (!getForecasts(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(RequestForecastResponse requestForecastResponse) {
                if (requestForecastResponse == RequestForecastResponse.getDefaultInstance()) {
                    return this;
                }
                if (requestForecastResponse.hasStatus()) {
                    setStatus(requestForecastResponse.getStatus());
                }
                if (this.forecastsBuilder_ == null) {
                    if (!requestForecastResponse.forecasts_.isEmpty()) {
                        if (this.forecasts_.isEmpty()) {
                            this.forecasts_ = requestForecastResponse.forecasts_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureForecastsIsMutable();
                            this.forecasts_.addAll(requestForecastResponse.forecasts_);
                        }
                        onChanged();
                    }
                } else if (!requestForecastResponse.forecasts_.isEmpty()) {
                    boolean zIsEmpty = this.forecastsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastsBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.forecastsBuilder_ = null;
                        this.forecasts_ = requestForecastResponse.forecasts_;
                        this.bitField0_ &= -3;
                        this.forecastsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getForecastsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(requestForecastResponse.forecasts_);
                    }
                }
                mergeUnknownFields(requestForecastResponse.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeForecasts(int i14) {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureForecastsIsMutable();
                this.forecasts_.remove(i14);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setForecasts(int i14, Forecast.Builder builder) {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureForecastsIsMutable();
                this.forecasts_.set(i14, builder.build());
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
            public RequestForecastResponse getDefaultInstanceForType() {
                return RequestForecastResponse.getDefaultInstance();
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
                this.forecasts_ = Collections.EMPTY_LIST;
            }

            public Forecast.Builder addForecastsBuilder(int i14) {
                return (Forecast.Builder) getForecastsFieldBuilder().addBuilder(i14, Forecast.getDefaultInstance());
            }

            public Builder addForecasts(int i14, Forecast forecast) {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    forecast.getClass();
                    ensureForecastsIsMutable();
                    this.forecasts_.add(i14, forecast);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, forecast);
                return this;
            }

            public Builder setForecasts(int i14, Forecast forecast) {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    forecast.getClass();
                    ensureForecastsIsMutable();
                    this.forecasts_.set(i14, forecast);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, forecast);
                return this;
            }

            public Builder addForecasts(Forecast forecast) {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    forecast.getClass();
                    ensureForecastsIsMutable();
                    this.forecasts_.add(forecast);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(forecast);
                return this;
            }

            public Builder addForecasts(int i14, Forecast.Builder builder) {
                RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureForecastsIsMutable();
                    this.forecasts_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof RequestForecastResponse) {
                    return mergeFrom((RequestForecastResponse) message);
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
                                    Forecast forecast = (Forecast) codedInputStream.readMessage(Forecast.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<Forecast, Forecast.Builder, ForecastOrBuilder> repeatedFieldBuilderV3 = this.forecastsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureForecastsIsMutable();
                                        this.forecasts_.add(forecast);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(forecast);
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
        public RequestForecastResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static RequestForecastResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RequestForecastResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RequestForecastResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static RequestForecastResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static RequestForecastResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static RequestForecastResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static RequestForecastResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private RequestForecastResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static RequestForecastResponse parseFrom(InputStream inputStream) {
            return (RequestForecastResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static RequestForecastResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RequestForecastResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ RequestForecastResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static RequestForecastResponse parseFrom(CodedInputStream codedInputStream) {
            return (RequestForecastResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static RequestForecastResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RequestForecastResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            UNKNOWN_STATUS(0),
            OK(1),
            GENERIC_ERROR(2),
            NOT_IMPLEMENTED(3),
            NOT_ACTIVATED(4),
            DELETED_LOCATION(5),
            UNSUPPORTED_FORECAST_TYPE(6),
            EXCLUSIVE_FORECAST_TYPES(7),
            LOCATION_LIMIT_REACHED(8),
            DUPLICATE_FORECAST_TYPE(9),
            LAND_FORECAST_TYPE_REQUIRED(10),
            FAILED_TO_GET_GPS_POSITION(11),
            LOCATION_FIELDS_MISSING(12),
            FAILED_TO_CREATE_LOCATION(13),
            COORDINATES_MISSING(14),
            UNSUPPORTED_BY_PLAN(15);

            public static final int COORDINATES_MISSING_VALUE = 14;
            public static final int DELETED_LOCATION_VALUE = 5;
            public static final int DUPLICATE_FORECAST_TYPE_VALUE = 9;
            public static final int EXCLUSIVE_FORECAST_TYPES_VALUE = 7;
            public static final int FAILED_TO_CREATE_LOCATION_VALUE = 13;
            public static final int FAILED_TO_GET_GPS_POSITION_VALUE = 11;
            public static final int GENERIC_ERROR_VALUE = 2;
            public static final int LAND_FORECAST_TYPE_REQUIRED_VALUE = 10;
            public static final int LOCATION_FIELDS_MISSING_VALUE = 12;
            public static final int LOCATION_LIMIT_REACHED_VALUE = 8;
            public static final int NOT_ACTIVATED_VALUE = 4;
            public static final int NOT_IMPLEMENTED_VALUE = 3;
            public static final int OK_VALUE = 1;
            public static final int UNKNOWN_STATUS_VALUE = 0;
            public static final int UNSUPPORTED_BY_PLAN_VALUE = 15;
            public static final int UNSUPPORTED_FORECAST_TYPE_VALUE = 6;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIInReachWeather.RequestForecastResponse.Status.1
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
                switch (i14) {
                    case 0:
                        return UNKNOWN_STATUS;
                    case 1:
                        return OK;
                    case 2:
                        return GENERIC_ERROR;
                    case 3:
                        return NOT_IMPLEMENTED;
                    case 4:
                        return NOT_ACTIVATED;
                    case 5:
                        return DELETED_LOCATION;
                    case 6:
                        return UNSUPPORTED_FORECAST_TYPE;
                    case 7:
                        return EXCLUSIVE_FORECAST_TYPES;
                    case 8:
                        return LOCATION_LIMIT_REACHED;
                    case 9:
                        return DUPLICATE_FORECAST_TYPE;
                    case 10:
                        return LAND_FORECAST_TYPE_REQUIRED;
                    case 11:
                        return FAILED_TO_GET_GPS_POSITION;
                    case 12:
                        return LOCATION_FIELDS_MISSING;
                    case 13:
                        return FAILED_TO_CREATE_LOCATION;
                    case 14:
                        return COORDINATES_MISSING;
                    case 15:
                        return UNSUPPORTED_BY_PLAN;
                    default:
                        return null;
                }
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return RequestForecastResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class SubscribeResponse extends GeneratedMessageV3 implements SubscribeResponseOrBuilder {
        private static final SubscribeResponse DEFAULT_INSTANCE = new SubscribeResponse();

        @Deprecated
        public static final Parser<SubscribeResponse> PARSER = new AbstractParser<SubscribeResponse>() { // from class: com.garmin.proto.generated.GDIInReachWeather.SubscribeResponse.1
            @Override // com.google.protobuf.Parser
            public SubscribeResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SubscribeResponse.newBuilder();
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

        private SubscribeResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SubscribeResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_SubscribeResponse_descriptor;
        }

        public static Builder newBuilder(SubscribeResponse subscribeResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(subscribeResponse);
        }

        public static SubscribeResponse parseDelimitedFrom(InputStream inputStream) {
            return (SubscribeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SubscribeResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SubscribeResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SubscribeResponse)) {
                return super.equals(obj);
            }
            SubscribeResponse subscribeResponse = (SubscribeResponse) obj;
            if (hasStatus() != subscribeResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == subscribeResponse.status_) && getUnknownFields().equals(subscribeResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SubscribeResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIInReachWeather.SubscribeResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.UNKNOWN_STATUS : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.SubscribeResponseOrBuilder
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
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_SubscribeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SubscribeResponse.class, Builder.class);
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
            return new SubscribeResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SubscribeResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(SubscribeResponse subscribeResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    subscribeResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                subscribeResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_SubscribeResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SubscribeResponse build() {
                SubscribeResponse subscribeResponseBuildPartial = buildPartial();
                if (subscribeResponseBuildPartial.isInitialized()) {
                    return subscribeResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) subscribeResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SubscribeResponse buildPartial() {
                SubscribeResponse subscribeResponse = new SubscribeResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(subscribeResponse);
                }
                onBuilt();
                return subscribeResponse;
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
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_SubscribeResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.SubscribeResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.UNKNOWN_STATUS : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.SubscribeResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_SubscribeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SubscribeResponse.class, Builder.class);
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
                                    if (Status.forNumber(i14) == null) {
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
            public SubscribeResponse getDefaultInstanceForType() {
                return SubscribeResponse.getDefaultInstance();
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
                if (message instanceof SubscribeResponse) {
                    return mergeFrom((SubscribeResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SubscribeResponse subscribeResponse) {
                if (subscribeResponse == SubscribeResponse.getDefaultInstance()) {
                    return this;
                }
                if (subscribeResponse.hasStatus()) {
                    setStatus(subscribeResponse.getStatus());
                }
                mergeUnknownFields(subscribeResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SubscribeResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SubscribeResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SubscribeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SubscribeResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ SubscribeResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SubscribeResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SubscribeResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SubscribeResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SubscribeResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SubscribeResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SubscribeResponse parseFrom(InputStream inputStream) {
            return (SubscribeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SubscribeResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SubscribeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SubscribeResponse parseFrom(CodedInputStream codedInputStream) {
            return (SubscribeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SubscribeResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SubscribeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            UNKNOWN_STATUS(0),
            OK(1),
            GENERIC_ERROR(2);

            public static final int GENERIC_ERROR_VALUE = 2;
            public static final int OK_VALUE = 1;
            public static final int UNKNOWN_STATUS_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIInReachWeather.SubscribeResponse.Status.1
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
                    return UNKNOWN_STATUS;
                }
                if (i14 == 1) {
                    return OK;
                }
                if (i14 != 2) {
                    return null;
                }
                return GENERIC_ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return SubscribeResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class SyncRequest extends GeneratedMessageV3 implements SyncRequestOrBuilder {
        public static final int MODIFIED_TIME_FIELD_NUMBER = 2;
        public static final int REQUEST_INFO_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int modifiedTime_;
        private SyncRequestInfo requestInfo_;
        private static final SyncRequest DEFAULT_INSTANCE = new SyncRequest();

        @Deprecated
        public static final Parser<SyncRequest> PARSER = new AbstractParser<SyncRequest>() { // from class: com.garmin.proto.generated.GDIInReachWeather.SyncRequest.1
            @Override // com.google.protobuf.Parser
            public SyncRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SyncRequest.newBuilder();
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

        private SyncRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.modifiedTime_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SyncRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_SyncRequest_descriptor;
        }

        public static Builder newBuilder(SyncRequest syncRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(syncRequest);
        }

        public static SyncRequest parseDelimitedFrom(InputStream inputStream) {
            return (SyncRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SyncRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SyncRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SyncRequest)) {
                return super.equals(obj);
            }
            SyncRequest syncRequest = (SyncRequest) obj;
            if (hasRequestInfo() != syncRequest.hasRequestInfo()) {
                return false;
            }
            if ((!hasRequestInfo() || getRequestInfo().equals(syncRequest.getRequestInfo())) && hasModifiedTime() == syncRequest.hasModifiedTime()) {
                return (!hasModifiedTime() || getModifiedTime() == syncRequest.getModifiedTime()) && getUnknownFields().equals(syncRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.SyncRequestOrBuilder
        public int getModifiedTime() {
            return this.modifiedTime_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SyncRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.SyncRequestOrBuilder
        public SyncRequestInfo getRequestInfo() {
            SyncRequestInfo syncRequestInfo = this.requestInfo_;
            return syncRequestInfo == null ? SyncRequestInfo.getDefaultInstance() : syncRequestInfo;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.SyncRequestOrBuilder
        public SyncRequestInfoOrBuilder getRequestInfoOrBuilder() {
            SyncRequestInfo syncRequestInfo = this.requestInfo_;
            return syncRequestInfo == null ? SyncRequestInfo.getDefaultInstance() : syncRequestInfo;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getRequestInfo()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeFixed32Size(2, this.modifiedTime_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.SyncRequestOrBuilder
        public boolean hasModifiedTime() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.SyncRequestOrBuilder
        public boolean hasRequestInfo() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasRequestInfo()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getRequestInfo().hashCode();
            }
            if (hasModifiedTime()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getModifiedTime();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_SyncRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SyncRequest.class, Builder.class);
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
            if (!hasRequestInfo() || getRequestInfo().isInitialized()) {
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
            return new SyncRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getRequestInfo());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeFixed32(2, this.modifiedTime_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SyncRequestOrBuilder {
            private int bitField0_;
            private int modifiedTime_;
            private SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> requestInfoBuilder_;
            private SyncRequestInfo requestInfo_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(SyncRequest syncRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> singleFieldBuilderV3 = this.requestInfoBuilder_;
                    syncRequest.requestInfo_ = singleFieldBuilderV3 == null ? this.requestInfo_ : (SyncRequestInfo) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    syncRequest.modifiedTime_ = this.modifiedTime_;
                    i14 |= 2;
                }
                syncRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_SyncRequest_descriptor;
            }

            private SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> getRequestInfoFieldBuilder() {
                if (this.requestInfoBuilder_ == null) {
                    this.requestInfoBuilder_ = new SingleFieldBuilderV3<>(getRequestInfo(), getParentForChildren(), isClean());
                    this.requestInfo_ = null;
                }
                return this.requestInfoBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getRequestInfoFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SyncRequest build() {
                SyncRequest syncRequestBuildPartial = buildPartial();
                if (syncRequestBuildPartial.isInitialized()) {
                    return syncRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) syncRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SyncRequest buildPartial() {
                SyncRequest syncRequest = new SyncRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(syncRequest);
                }
                onBuilt();
                return syncRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.requestInfo_ = null;
                SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> singleFieldBuilderV3 = this.requestInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.requestInfoBuilder_ = null;
                }
                this.modifiedTime_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearModifiedTime() {
                this.bitField0_ &= -3;
                this.modifiedTime_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearRequestInfo() {
                this.bitField0_ &= -2;
                this.requestInfo_ = null;
                SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> singleFieldBuilderV3 = this.requestInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.requestInfoBuilder_ = null;
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
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_SyncRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.SyncRequestOrBuilder
            public int getModifiedTime() {
                return this.modifiedTime_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.SyncRequestOrBuilder
            public SyncRequestInfo getRequestInfo() {
                SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> singleFieldBuilderV3 = this.requestInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SyncRequestInfo) singleFieldBuilderV3.getMessage();
                }
                SyncRequestInfo syncRequestInfo = this.requestInfo_;
                return syncRequestInfo == null ? SyncRequestInfo.getDefaultInstance() : syncRequestInfo;
            }

            public SyncRequestInfo.Builder getRequestInfoBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SyncRequestInfo.Builder) getRequestInfoFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.SyncRequestOrBuilder
            public SyncRequestInfoOrBuilder getRequestInfoOrBuilder() {
                SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> singleFieldBuilderV3 = this.requestInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SyncRequestInfoOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SyncRequestInfo syncRequestInfo = this.requestInfo_;
                return syncRequestInfo == null ? SyncRequestInfo.getDefaultInstance() : syncRequestInfo;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.SyncRequestOrBuilder
            public boolean hasModifiedTime() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.SyncRequestOrBuilder
            public boolean hasRequestInfo() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_SyncRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SyncRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasRequestInfo() || getRequestInfo().isInitialized();
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
                                    codedInputStream.readMessage(getRequestInfoFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 21) {
                                    this.modifiedTime_ = codedInputStream.readFixed32();
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

            public Builder mergeRequestInfo(SyncRequestInfo syncRequestInfo) {
                SyncRequestInfo syncRequestInfo2;
                SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> singleFieldBuilderV3 = this.requestInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(syncRequestInfo);
                } else if ((this.bitField0_ & 1) == 0 || (syncRequestInfo2 = this.requestInfo_) == null || syncRequestInfo2 == SyncRequestInfo.getDefaultInstance()) {
                    this.requestInfo_ = syncRequestInfo;
                } else {
                    getRequestInfoBuilder().mergeFrom(syncRequestInfo);
                }
                if (this.requestInfo_ != null) {
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

            public Builder setModifiedTime(int i14) {
                this.modifiedTime_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setRequestInfo(SyncRequestInfo.Builder builder) {
                SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> singleFieldBuilderV3 = this.requestInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.requestInfo_ = builder.build();
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
            public SyncRequest getDefaultInstanceForType() {
                return SyncRequest.getDefaultInstance();
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

            public Builder setRequestInfo(SyncRequestInfo syncRequestInfo) {
                SingleFieldBuilderV3<SyncRequestInfo, SyncRequestInfo.Builder, SyncRequestInfoOrBuilder> singleFieldBuilderV3 = this.requestInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    syncRequestInfo.getClass();
                    this.requestInfo_ = syncRequestInfo;
                } else {
                    singleFieldBuilderV3.setMessage(syncRequestInfo);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SyncRequest) {
                    return mergeFrom((SyncRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SyncRequest syncRequest) {
                if (syncRequest == SyncRequest.getDefaultInstance()) {
                    return this;
                }
                if (syncRequest.hasRequestInfo()) {
                    mergeRequestInfo(syncRequest.getRequestInfo());
                }
                if (syncRequest.hasModifiedTime()) {
                    setModifiedTime(syncRequest.getModifiedTime());
                }
                mergeUnknownFields(syncRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SyncRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SyncRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SyncRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SyncRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ SyncRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SyncRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SyncRequest() {
            this.modifiedTime_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SyncRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SyncRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SyncRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SyncRequest parseFrom(InputStream inputStream) {
            return (SyncRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SyncRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SyncRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SyncRequest parseFrom(CodedInputStream codedInputStream) {
            return (SyncRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SyncRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SyncRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SyncRequestInfo extends GeneratedMessageV3 implements SyncRequestInfoOrBuilder {
        public static final int APP_UUID_FIELD_NUMBER = 2;
        private static final SyncRequestInfo DEFAULT_INSTANCE = new SyncRequestInfo();

        @Deprecated
        public static final Parser<SyncRequestInfo> PARSER = new AbstractParser<SyncRequestInfo>() { // from class: com.garmin.proto.generated.GDIInReachWeather.SyncRequestInfo.1
            @Override // com.google.protobuf.Parser
            public SyncRequestInfo parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SyncRequestInfo.newBuilder();
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
        public static final int PROTOCOL_VERSION_FIELD_NUMBER = 1;
        public static final int SYNC_TYPE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private GDIDataTypes.UUID appUuid_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int protocolVersion_;
        private int syncType_;

        private SyncRequestInfo(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.protocolVersion_ = 1;
            this.syncType_ = 2;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SyncRequestInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_SyncRequestInfo_descriptor;
        }

        public static Builder newBuilder(SyncRequestInfo syncRequestInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(syncRequestInfo);
        }

        public static SyncRequestInfo parseDelimitedFrom(InputStream inputStream) {
            return (SyncRequestInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SyncRequestInfo parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SyncRequestInfo> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SyncRequestInfo)) {
                return super.equals(obj);
            }
            SyncRequestInfo syncRequestInfo = (SyncRequestInfo) obj;
            if (hasProtocolVersion() != syncRequestInfo.hasProtocolVersion()) {
                return false;
            }
            if ((hasProtocolVersion() && getProtocolVersion() != syncRequestInfo.getProtocolVersion()) || hasAppUuid() != syncRequestInfo.hasAppUuid()) {
                return false;
            }
            if ((!hasAppUuid() || getAppUuid().equals(syncRequestInfo.getAppUuid())) && hasSyncType() == syncRequestInfo.hasSyncType()) {
                return (!hasSyncType() || this.syncType_ == syncRequestInfo.syncType_) && getUnknownFields().equals(syncRequestInfo.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.SyncRequestInfoOrBuilder
        public GDIDataTypes.UUID getAppUuid() {
            GDIDataTypes.UUID uuid = this.appUuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.SyncRequestInfoOrBuilder
        public GDIDataTypes.UUIDOrBuilder getAppUuidOrBuilder() {
            GDIDataTypes.UUID uuid = this.appUuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SyncRequestInfo> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.SyncRequestInfoOrBuilder
        public int getProtocolVersion() {
            return this.protocolVersion_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.protocolVersion_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(2, getAppUuid());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(3, this.syncType_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.SyncRequestInfoOrBuilder
        public SyncType getSyncType() {
            SyncType syncTypeForNumber = SyncType.forNumber(this.syncType_);
            return syncTypeForNumber == null ? SyncType.INCREMENTAL : syncTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.SyncRequestInfoOrBuilder
        public boolean hasAppUuid() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.SyncRequestInfoOrBuilder
        public boolean hasProtocolVersion() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.SyncRequestInfoOrBuilder
        public boolean hasSyncType() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasProtocolVersion()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getProtocolVersion();
            }
            if (hasAppUuid()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getAppUuid().hashCode();
            }
            if (hasSyncType()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + this.syncType_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_SyncRequestInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SyncRequestInfo.class, Builder.class);
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
            if (!hasAppUuid() || getAppUuid().isInitialized()) {
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
            return new SyncRequestInfo();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.protocolVersion_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getAppUuid());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(3, this.syncType_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SyncRequestInfoOrBuilder {
            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> appUuidBuilder_;
            private GDIDataTypes.UUID appUuid_;
            private int bitField0_;
            private int protocolVersion_;
            private int syncType_;

            private Builder() {
                this.protocolVersion_ = 1;
                this.syncType_ = 2;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(SyncRequestInfo syncRequestInfo) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    syncRequestInfo.protocolVersion_ = this.protocolVersion_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.appUuidBuilder_;
                    syncRequestInfo.appUuid_ = singleFieldBuilderV3 == null ? this.appUuid_ : (GDIDataTypes.UUID) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    syncRequestInfo.syncType_ = this.syncType_;
                    i14 |= 4;
                }
                syncRequestInfo.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> getAppUuidFieldBuilder() {
                if (this.appUuidBuilder_ == null) {
                    this.appUuidBuilder_ = new SingleFieldBuilderV3<>(getAppUuid(), getParentForChildren(), isClean());
                    this.appUuid_ = null;
                }
                return this.appUuidBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_SyncRequestInfo_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getAppUuidFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SyncRequestInfo build() {
                SyncRequestInfo syncRequestInfoBuildPartial = buildPartial();
                if (syncRequestInfoBuildPartial.isInitialized()) {
                    return syncRequestInfoBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) syncRequestInfoBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SyncRequestInfo buildPartial() {
                SyncRequestInfo syncRequestInfo = new SyncRequestInfo(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(syncRequestInfo);
                }
                onBuilt();
                return syncRequestInfo;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.protocolVersion_ = 1;
                this.appUuid_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.appUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.appUuidBuilder_ = null;
                }
                this.syncType_ = 2;
                return this;
            }

            public Builder clearAppUuid() {
                this.bitField0_ &= -3;
                this.appUuid_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.appUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.appUuidBuilder_ = null;
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

            public Builder clearProtocolVersion() {
                this.bitField0_ &= -2;
                this.protocolVersion_ = 1;
                onChanged();
                return this;
            }

            public Builder clearSyncType() {
                this.bitField0_ &= -5;
                this.syncType_ = 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.SyncRequestInfoOrBuilder
            public GDIDataTypes.UUID getAppUuid() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.appUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUID) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.UUID uuid = this.appUuid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            public GDIDataTypes.UUID.Builder getAppUuidBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (GDIDataTypes.UUID.Builder) getAppUuidFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.SyncRequestInfoOrBuilder
            public GDIDataTypes.UUIDOrBuilder getAppUuidOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.appUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUIDOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.UUID uuid = this.appUuid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_SyncRequestInfo_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.SyncRequestInfoOrBuilder
            public int getProtocolVersion() {
                return this.protocolVersion_;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.SyncRequestInfoOrBuilder
            public SyncType getSyncType() {
                SyncType syncTypeForNumber = SyncType.forNumber(this.syncType_);
                return syncTypeForNumber == null ? SyncType.INCREMENTAL : syncTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.SyncRequestInfoOrBuilder
            public boolean hasAppUuid() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.SyncRequestInfoOrBuilder
            public boolean hasProtocolVersion() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.SyncRequestInfoOrBuilder
            public boolean hasSyncType() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_SyncRequestInfo_fieldAccessorTable.ensureFieldAccessorsInitialized(SyncRequestInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasAppUuid() || getAppUuid().isInitialized();
            }

            public Builder mergeAppUuid(GDIDataTypes.UUID uuid) {
                GDIDataTypes.UUID uuid2;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.appUuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(uuid);
                } else if ((this.bitField0_ & 2) == 0 || (uuid2 = this.appUuid_) == null || uuid2 == GDIDataTypes.UUID.getDefaultInstance()) {
                    this.appUuid_ = uuid;
                } else {
                    getAppUuidBuilder().mergeFrom(uuid);
                }
                if (this.appUuid_ != null) {
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
                                    this.protocolVersion_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getAppUuidFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    int i14 = codedInputStream.readEnum();
                                    if (SyncType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(3, i14);
                                    } else {
                                        this.syncType_ = i14;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setAppUuid(GDIDataTypes.UUID.Builder builder) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.appUuidBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.appUuid_ = builder.build();
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

            public Builder setProtocolVersion(int i14) {
                this.protocolVersion_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSyncType(SyncType syncType) {
                syncType.getClass();
                this.bitField0_ |= 4;
                this.syncType_ = syncType.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SyncRequestInfo getDefaultInstanceForType() {
                return SyncRequestInfo.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.protocolVersion_ = 1;
                this.syncType_ = 2;
                maybeForceBuilderInitialization();
            }

            public Builder setAppUuid(GDIDataTypes.UUID uuid) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.appUuidBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uuid.getClass();
                    this.appUuid_ = uuid;
                } else {
                    singleFieldBuilderV3.setMessage(uuid);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SyncRequestInfo) {
                    return mergeFrom((SyncRequestInfo) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SyncRequestInfo syncRequestInfo) {
                if (syncRequestInfo == SyncRequestInfo.getDefaultInstance()) {
                    return this;
                }
                if (syncRequestInfo.hasProtocolVersion()) {
                    setProtocolVersion(syncRequestInfo.getProtocolVersion());
                }
                if (syncRequestInfo.hasAppUuid()) {
                    mergeAppUuid(syncRequestInfo.getAppUuid());
                }
                if (syncRequestInfo.hasSyncType()) {
                    setSyncType(syncRequestInfo.getSyncType());
                }
                mergeUnknownFields(syncRequestInfo.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SyncRequestInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SyncRequestInfo parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SyncRequestInfo) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SyncRequestInfo parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SyncRequestInfo parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SyncRequestInfo parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SyncRequestInfo parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ SyncRequestInfo(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SyncRequestInfo parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private SyncRequestInfo() {
            this.memoizedIsInitialized = (byte) -1;
            this.protocolVersion_ = 1;
            this.syncType_ = 2;
        }

        public static SyncRequestInfo parseFrom(InputStream inputStream) {
            return (SyncRequestInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SyncRequestInfo parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SyncRequestInfo) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SyncRequestInfo parseFrom(CodedInputStream codedInputStream) {
            return (SyncRequestInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SyncRequestInfo parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SyncRequestInfo) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum SyncType implements ProtocolMessageEnum {
            FULL(1),
            INCREMENTAL(2);

            public static final int FULL_VALUE = 1;
            public static final int INCREMENTAL_VALUE = 2;
            private final int value;
            private static final Internal.EnumLiteMap<SyncType> internalValueMap = new Internal.EnumLiteMap<SyncType>() { // from class: com.garmin.proto.generated.GDIInReachWeather.SyncRequestInfo.SyncType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SyncType findValueByNumber(int i14) {
                    return SyncType.forNumber(i14);
                }
            };
            private static final SyncType[] VALUES = values();

            SyncType(int i14) {
                this.value = i14;
            }

            public static SyncType forNumber(int i14) {
                if (i14 == 1) {
                    return FULL;
                }
                if (i14 != 2) {
                    return null;
                }
                return INCREMENTAL;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return SyncRequestInfo.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<SyncType> internalGetValueMap() {
                return internalValueMap;
            }

            public static SyncType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static SyncType valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class SyncResponse extends GeneratedMessageV3 implements SyncResponseOrBuilder {
        private static final SyncResponse DEFAULT_INSTANCE = new SyncResponse();

        @Deprecated
        public static final Parser<SyncResponse> PARSER = new AbstractParser<SyncResponse>() { // from class: com.garmin.proto.generated.GDIInReachWeather.SyncResponse.1
            @Override // com.google.protobuf.Parser
            public SyncResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SyncResponse.newBuilder();
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

        private SyncResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SyncResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_SyncResponse_descriptor;
        }

        public static Builder newBuilder(SyncResponse syncResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(syncResponse);
        }

        public static SyncResponse parseDelimitedFrom(InputStream inputStream) {
            return (SyncResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SyncResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SyncResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SyncResponse)) {
                return super.equals(obj);
            }
            SyncResponse syncResponse = (SyncResponse) obj;
            if (hasStatus() != syncResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == syncResponse.status_) && getUnknownFields().equals(syncResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SyncResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIInReachWeather.SyncResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.UNKNOWN_STATUS : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInReachWeather.SyncResponseOrBuilder
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
            return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_SyncResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SyncResponse.class, Builder.class);
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
            return new SyncResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SyncResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(SyncResponse syncResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    syncResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                syncResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_SyncResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SyncResponse build() {
                SyncResponse syncResponseBuildPartial = buildPartial();
                if (syncResponseBuildPartial.isInitialized()) {
                    return syncResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) syncResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SyncResponse buildPartial() {
                SyncResponse syncResponse = new SyncResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(syncResponse);
                }
                onBuilt();
                return syncResponse;
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
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_SyncResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.SyncResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.UNKNOWN_STATUS : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInReachWeather.SyncResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInReachWeather.internal_static_GDI_Proto_InReachWeather_SyncResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SyncResponse.class, Builder.class);
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
                                    if (Status.forNumber(i14) == null) {
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
            public SyncResponse getDefaultInstanceForType() {
                return SyncResponse.getDefaultInstance();
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
                if (message instanceof SyncResponse) {
                    return mergeFrom((SyncResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SyncResponse syncResponse) {
                if (syncResponse == SyncResponse.getDefaultInstance()) {
                    return this;
                }
                if (syncResponse.hasStatus()) {
                    setStatus(syncResponse.getStatus());
                }
                mergeUnknownFields(syncResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SyncResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SyncResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SyncResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SyncResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ SyncResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SyncResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SyncResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SyncResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SyncResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SyncResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SyncResponse parseFrom(InputStream inputStream) {
            return (SyncResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SyncResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SyncResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SyncResponse parseFrom(CodedInputStream codedInputStream) {
            return (SyncResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SyncResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SyncResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            UNKNOWN_STATUS(0),
            OK(1),
            UP_TO_DATE(2),
            GENERIC_ERROR(3),
            BUSY(4),
            UNSUPPORTED_PROTOCOL_VERSION(5),
            MISSING_INFO(6);

            public static final int BUSY_VALUE = 4;
            public static final int GENERIC_ERROR_VALUE = 3;
            public static final int MISSING_INFO_VALUE = 6;
            public static final int OK_VALUE = 1;
            public static final int UNKNOWN_STATUS_VALUE = 0;
            public static final int UNSUPPORTED_PROTOCOL_VERSION_VALUE = 5;
            public static final int UP_TO_DATE_VALUE = 2;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIInReachWeather.SyncResponse.Status.1
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
                switch (i14) {
                    case 0:
                        return UNKNOWN_STATUS;
                    case 1:
                        return OK;
                    case 2:
                        return UP_TO_DATE;
                    case 3:
                        return GENERIC_ERROR;
                    case 4:
                        return BUSY;
                    case 5:
                        return UNSUPPORTED_PROTOCOL_VERSION;
                    case 6:
                        return MISSING_INFO;
                    default:
                        return null;
                }
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return SyncResponse.getDescriptor().getEnumTypes().get(0);
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

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public enum ForecastAirQuality implements ProtocolMessageEnum {
        FORECAST_AIR_QUALITY_INVALID(0),
        FORECAST_AIR_QUALITY_GOOD(1),
        FORECAST_AIR_QUALITY_MODERATE(2),
        FORECAST_AIR_QUALITY_UNHEALTHY_SENSITIVE(3),
        FORECAST_AIR_QUALITY_UNHEALTHY(4),
        FORECAST_AIR_QUALITY_VERY_UNHEALTHY(5),
        FORECAST_AIR_QUALITY_HAZARDOUS(6);

        public static final int FORECAST_AIR_QUALITY_GOOD_VALUE = 1;
        public static final int FORECAST_AIR_QUALITY_HAZARDOUS_VALUE = 6;
        public static final int FORECAST_AIR_QUALITY_INVALID_VALUE = 0;
        public static final int FORECAST_AIR_QUALITY_MODERATE_VALUE = 2;
        public static final int FORECAST_AIR_QUALITY_UNHEALTHY_SENSITIVE_VALUE = 3;
        public static final int FORECAST_AIR_QUALITY_UNHEALTHY_VALUE = 4;
        public static final int FORECAST_AIR_QUALITY_VERY_UNHEALTHY_VALUE = 5;
        private final int value;
        private static final Internal.EnumLiteMap<ForecastAirQuality> internalValueMap = new Internal.EnumLiteMap<ForecastAirQuality>() { // from class: com.garmin.proto.generated.GDIInReachWeather.ForecastAirQuality.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ForecastAirQuality findValueByNumber(int i14) {
                return ForecastAirQuality.forNumber(i14);
            }
        };
        private static final ForecastAirQuality[] VALUES = values();

        ForecastAirQuality(int i14) {
            this.value = i14;
        }

        public static ForecastAirQuality forNumber(int i14) {
            switch (i14) {
                case 0:
                    return FORECAST_AIR_QUALITY_INVALID;
                case 1:
                    return FORECAST_AIR_QUALITY_GOOD;
                case 2:
                    return FORECAST_AIR_QUALITY_MODERATE;
                case 3:
                    return FORECAST_AIR_QUALITY_UNHEALTHY_SENSITIVE;
                case 4:
                    return FORECAST_AIR_QUALITY_UNHEALTHY;
                case 5:
                    return FORECAST_AIR_QUALITY_VERY_UNHEALTHY;
                case 6:
                    return FORECAST_AIR_QUALITY_HAZARDOUS;
                default:
                    return null;
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIInReachWeather.getDescriptor().getEnumTypes().get(3);
        }

        public static Internal.EnumLiteMap<ForecastAirQuality> internalGetValueMap() {
            return internalValueMap;
        }

        public static ForecastAirQuality valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static ForecastAirQuality valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum ForecastDayOfWeek implements ProtocolMessageEnum {
        FORECAST_DAY_OF_WEEK_INVALID(0),
        FORECAST_DAY_OF_WEEK_SUNDAY(1),
        FORECAST_DAY_OF_WEEK_MONDAY(2),
        FORECAST_DAY_OF_WEEK_TUESDAY(3),
        FORECAST_DAY_OF_WEEK_WEDNESDAY(4),
        FORECAST_DAY_OF_WEEK_THURSDAY(5),
        FORECAST_DAY_OF_WEEK_FRIDAY(6),
        FORECAST_DAY_OF_WEEK_SATURDAY(7);

        public static final int FORECAST_DAY_OF_WEEK_FRIDAY_VALUE = 6;
        public static final int FORECAST_DAY_OF_WEEK_INVALID_VALUE = 0;
        public static final int FORECAST_DAY_OF_WEEK_MONDAY_VALUE = 2;
        public static final int FORECAST_DAY_OF_WEEK_SATURDAY_VALUE = 7;
        public static final int FORECAST_DAY_OF_WEEK_SUNDAY_VALUE = 1;
        public static final int FORECAST_DAY_OF_WEEK_THURSDAY_VALUE = 5;
        public static final int FORECAST_DAY_OF_WEEK_TUESDAY_VALUE = 3;
        public static final int FORECAST_DAY_OF_WEEK_WEDNESDAY_VALUE = 4;
        private final int value;
        private static final Internal.EnumLiteMap<ForecastDayOfWeek> internalValueMap = new Internal.EnumLiteMap<ForecastDayOfWeek>() { // from class: com.garmin.proto.generated.GDIInReachWeather.ForecastDayOfWeek.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ForecastDayOfWeek findValueByNumber(int i14) {
                return ForecastDayOfWeek.forNumber(i14);
            }
        };
        private static final ForecastDayOfWeek[] VALUES = values();

        ForecastDayOfWeek(int i14) {
            this.value = i14;
        }

        public static ForecastDayOfWeek forNumber(int i14) {
            switch (i14) {
                case 0:
                    return FORECAST_DAY_OF_WEEK_INVALID;
                case 1:
                    return FORECAST_DAY_OF_WEEK_SUNDAY;
                case 2:
                    return FORECAST_DAY_OF_WEEK_MONDAY;
                case 3:
                    return FORECAST_DAY_OF_WEEK_TUESDAY;
                case 4:
                    return FORECAST_DAY_OF_WEEK_WEDNESDAY;
                case 5:
                    return FORECAST_DAY_OF_WEEK_THURSDAY;
                case 6:
                    return FORECAST_DAY_OF_WEEK_FRIDAY;
                case 7:
                    return FORECAST_DAY_OF_WEEK_SATURDAY;
                default:
                    return null;
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIInReachWeather.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<ForecastDayOfWeek> internalGetValueMap() {
            return internalValueMap;
        }

        public static ForecastDayOfWeek valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static ForecastDayOfWeek valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum Precipitation implements ProtocolMessageEnum {
        PRECIPITATION_UNKNOWN(0),
        PRECIPITATION_NONE(1),
        PRECIPITATION_RAIN(2),
        PRECIPITATION_SNOW(3),
        PRECIPITATION_SLEET(4);

        public static final int PRECIPITATION_NONE_VALUE = 1;
        public static final int PRECIPITATION_RAIN_VALUE = 2;
        public static final int PRECIPITATION_SLEET_VALUE = 4;
        public static final int PRECIPITATION_SNOW_VALUE = 3;
        public static final int PRECIPITATION_UNKNOWN_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<Precipitation> internalValueMap = new Internal.EnumLiteMap<Precipitation>() { // from class: com.garmin.proto.generated.GDIInReachWeather.Precipitation.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public Precipitation findValueByNumber(int i14) {
                return Precipitation.forNumber(i14);
            }
        };
        private static final Precipitation[] VALUES = values();

        Precipitation(int i14) {
            this.value = i14;
        }

        public static Precipitation forNumber(int i14) {
            if (i14 == 0) {
                return PRECIPITATION_UNKNOWN;
            }
            if (i14 == 1) {
                return PRECIPITATION_NONE;
            }
            if (i14 == 2) {
                return PRECIPITATION_RAIN;
            }
            if (i14 == 3) {
                return PRECIPITATION_SNOW;
            }
            if (i14 != 4) {
                return null;
            }
            return PRECIPITATION_SLEET;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIInReachWeather.getDescriptor().getEnumTypes().get(2);
        }

        public static Internal.EnumLiteMap<Precipitation> internalGetValueMap() {
            return internalValueMap;
        }

        public static Precipitation valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static Precipitation valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum WeatherIcon implements ProtocolMessageEnum {
        WEATHER_ICON_INVALID(0),
        WEATHER_ICON_CLEAR_DAY(1),
        WEATHER_ICON_CLEAR_NIGHT(2),
        WEATHER_ICON_CLOUDY(3),
        WEATHER_ICON_PARTLY_CLOUDY_DAY(4),
        WEATHER_ICON_PARTLY_CLOUDY_NIGHT(5),
        WEATHER_ICON_FOG(6),
        WEATHER_ICON_RAIN(7),
        WEATHER_ICON_SNOW(8),
        WEATHER_ICON_SLEET(9),
        WEATHER_ICON_HAIL(10),
        WEATHER_ICON_THUNDERSTORM(11),
        WEATHER_ICON_WINDY(12),
        WEATHER_ICON_TORNADO(13),
        WEATHER_ICON_MOSTLY_CLOUDY(14),
        WEATHER_ICON_WINTRY_MIX(15),
        WEATHER_ICON_HAZY(16),
        WEATHER_ICON_SCATTERED_SHOWERS(17),
        WEATHER_ICON_SCATTERED_THUNDERSTORMS(18),
        WEATHER_ICON_UNKNOWN_PRECIPITATION(19),
        WEATHER_ICON_LIGHT_RAIN(20),
        WEATHER_ICON_HEAVY_RAIN(21),
        WEATHER_ICON_LIGHT_SNOW(22),
        WEATHER_ICON_HEAVY_SNOW(23),
        WEATHER_ICON_LIGHT_RAIN_SNOW(24),
        WEATHER_ICON_HEAVY_RAIN_SNOW(25),
        WEATHER_ICON_RAIN_SNOW(26),
        WEATHER_ICON_PARTLY_CLEAR(27),
        WEATHER_ICON_MOSTLY_CLEAR(28),
        WEATHER_ICON_LIGHT_SHOWERS(29),
        WEATHER_ICON_SHOWERS(30),
        WEATHER_ICON_HEAVY_SHOWERS(31),
        WEATHER_ICON_CHANCE_OF_SHOWERS(32),
        WEATHER_ICON_CHANCE_OF_THUNDERSTORMS(33),
        WEATHER_ICON_MIST(34),
        WEATHER_ICON_DUST(35),
        WEATHER_ICON_DRIZZLE(36),
        WEATHER_ICON_SMOKE(37),
        WEATHER_ICON_ICE(38),
        WEATHER_ICON_SAND(39),
        WEATHER_ICON_SQUALL(40),
        WEATHER_ICON_SANDSTORM(41),
        WEATHER_ICON_VOLCANIC_ASH(42),
        WEATHER_ICON_HAZE(43),
        WEATHER_ICON_FAIR(44),
        WEATHER_ICON_HURRICANE(45),
        WEATHER_ICON_TROPICAL_STORM(46),
        WEATHER_ICON_CHANCE_OF_SNOW(47),
        WEATHER_ICON_CHANCE_OF_RAIN_SNOW(48),
        WEATHER_ICON_CLOUDY_CHANCE_OF_RAIN(49),
        WEATHER_ICON_CLOUDY_CHANCE_OF_SNOW(50),
        WEATHER_ICON_CLOUDY_CHANCE_OF_RAIN_SNOW(51),
        WEATHER_ICON_FLURRIES(52),
        WEATHER_ICON_FREEZING_RAIN(53),
        WEATHER_ICON_ICE_SNOW(54),
        WEATHER_ICON_THIN_CLOUDS(55);

        public static final int WEATHER_ICON_CHANCE_OF_RAIN_SNOW_VALUE = 48;
        public static final int WEATHER_ICON_CHANCE_OF_SHOWERS_VALUE = 32;
        public static final int WEATHER_ICON_CHANCE_OF_SNOW_VALUE = 47;
        public static final int WEATHER_ICON_CHANCE_OF_THUNDERSTORMS_VALUE = 33;
        public static final int WEATHER_ICON_CLEAR_DAY_VALUE = 1;
        public static final int WEATHER_ICON_CLEAR_NIGHT_VALUE = 2;
        public static final int WEATHER_ICON_CLOUDY_CHANCE_OF_RAIN_SNOW_VALUE = 51;
        public static final int WEATHER_ICON_CLOUDY_CHANCE_OF_RAIN_VALUE = 49;
        public static final int WEATHER_ICON_CLOUDY_CHANCE_OF_SNOW_VALUE = 50;
        public static final int WEATHER_ICON_CLOUDY_VALUE = 3;
        public static final int WEATHER_ICON_DRIZZLE_VALUE = 36;
        public static final int WEATHER_ICON_DUST_VALUE = 35;
        public static final int WEATHER_ICON_FAIR_VALUE = 44;
        public static final int WEATHER_ICON_FLURRIES_VALUE = 52;
        public static final int WEATHER_ICON_FOG_VALUE = 6;
        public static final int WEATHER_ICON_FREEZING_RAIN_VALUE = 53;
        public static final int WEATHER_ICON_HAIL_VALUE = 10;
        public static final int WEATHER_ICON_HAZE_VALUE = 43;
        public static final int WEATHER_ICON_HAZY_VALUE = 16;
        public static final int WEATHER_ICON_HEAVY_RAIN_SNOW_VALUE = 25;
        public static final int WEATHER_ICON_HEAVY_RAIN_VALUE = 21;
        public static final int WEATHER_ICON_HEAVY_SHOWERS_VALUE = 31;
        public static final int WEATHER_ICON_HEAVY_SNOW_VALUE = 23;
        public static final int WEATHER_ICON_HURRICANE_VALUE = 45;
        public static final int WEATHER_ICON_ICE_SNOW_VALUE = 54;
        public static final int WEATHER_ICON_ICE_VALUE = 38;
        public static final int WEATHER_ICON_INVALID_VALUE = 0;
        public static final int WEATHER_ICON_LIGHT_RAIN_SNOW_VALUE = 24;
        public static final int WEATHER_ICON_LIGHT_RAIN_VALUE = 20;
        public static final int WEATHER_ICON_LIGHT_SHOWERS_VALUE = 29;
        public static final int WEATHER_ICON_LIGHT_SNOW_VALUE = 22;
        public static final int WEATHER_ICON_MIST_VALUE = 34;
        public static final int WEATHER_ICON_MOSTLY_CLEAR_VALUE = 28;
        public static final int WEATHER_ICON_MOSTLY_CLOUDY_VALUE = 14;
        public static final int WEATHER_ICON_PARTLY_CLEAR_VALUE = 27;
        public static final int WEATHER_ICON_PARTLY_CLOUDY_DAY_VALUE = 4;
        public static final int WEATHER_ICON_PARTLY_CLOUDY_NIGHT_VALUE = 5;
        public static final int WEATHER_ICON_RAIN_SNOW_VALUE = 26;
        public static final int WEATHER_ICON_RAIN_VALUE = 7;
        public static final int WEATHER_ICON_SANDSTORM_VALUE = 41;
        public static final int WEATHER_ICON_SAND_VALUE = 39;
        public static final int WEATHER_ICON_SCATTERED_SHOWERS_VALUE = 17;
        public static final int WEATHER_ICON_SCATTERED_THUNDERSTORMS_VALUE = 18;
        public static final int WEATHER_ICON_SHOWERS_VALUE = 30;
        public static final int WEATHER_ICON_SLEET_VALUE = 9;
        public static final int WEATHER_ICON_SMOKE_VALUE = 37;
        public static final int WEATHER_ICON_SNOW_VALUE = 8;
        public static final int WEATHER_ICON_SQUALL_VALUE = 40;
        public static final int WEATHER_ICON_THIN_CLOUDS_VALUE = 55;
        public static final int WEATHER_ICON_THUNDERSTORM_VALUE = 11;
        public static final int WEATHER_ICON_TORNADO_VALUE = 13;
        public static final int WEATHER_ICON_TROPICAL_STORM_VALUE = 46;
        public static final int WEATHER_ICON_UNKNOWN_PRECIPITATION_VALUE = 19;
        public static final int WEATHER_ICON_VOLCANIC_ASH_VALUE = 42;
        public static final int WEATHER_ICON_WINDY_VALUE = 12;
        public static final int WEATHER_ICON_WINTRY_MIX_VALUE = 15;
        private final int value;
        private static final Internal.EnumLiteMap<WeatherIcon> internalValueMap = new Internal.EnumLiteMap<WeatherIcon>() { // from class: com.garmin.proto.generated.GDIInReachWeather.WeatherIcon.1
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
                    return WEATHER_ICON_INVALID;
                case 1:
                    return WEATHER_ICON_CLEAR_DAY;
                case 2:
                    return WEATHER_ICON_CLEAR_NIGHT;
                case 3:
                    return WEATHER_ICON_CLOUDY;
                case 4:
                    return WEATHER_ICON_PARTLY_CLOUDY_DAY;
                case 5:
                    return WEATHER_ICON_PARTLY_CLOUDY_NIGHT;
                case 6:
                    return WEATHER_ICON_FOG;
                case 7:
                    return WEATHER_ICON_RAIN;
                case 8:
                    return WEATHER_ICON_SNOW;
                case 9:
                    return WEATHER_ICON_SLEET;
                case 10:
                    return WEATHER_ICON_HAIL;
                case 11:
                    return WEATHER_ICON_THUNDERSTORM;
                case 12:
                    return WEATHER_ICON_WINDY;
                case 13:
                    return WEATHER_ICON_TORNADO;
                case 14:
                    return WEATHER_ICON_MOSTLY_CLOUDY;
                case 15:
                    return WEATHER_ICON_WINTRY_MIX;
                case 16:
                    return WEATHER_ICON_HAZY;
                case 17:
                    return WEATHER_ICON_SCATTERED_SHOWERS;
                case 18:
                    return WEATHER_ICON_SCATTERED_THUNDERSTORMS;
                case 19:
                    return WEATHER_ICON_UNKNOWN_PRECIPITATION;
                case 20:
                    return WEATHER_ICON_LIGHT_RAIN;
                case 21:
                    return WEATHER_ICON_HEAVY_RAIN;
                case 22:
                    return WEATHER_ICON_LIGHT_SNOW;
                case 23:
                    return WEATHER_ICON_HEAVY_SNOW;
                case 24:
                    return WEATHER_ICON_LIGHT_RAIN_SNOW;
                case 25:
                    return WEATHER_ICON_HEAVY_RAIN_SNOW;
                case 26:
                    return WEATHER_ICON_RAIN_SNOW;
                case 27:
                    return WEATHER_ICON_PARTLY_CLEAR;
                case 28:
                    return WEATHER_ICON_MOSTLY_CLEAR;
                case 29:
                    return WEATHER_ICON_LIGHT_SHOWERS;
                case 30:
                    return WEATHER_ICON_SHOWERS;
                case 31:
                    return WEATHER_ICON_HEAVY_SHOWERS;
                case 32:
                    return WEATHER_ICON_CHANCE_OF_SHOWERS;
                case 33:
                    return WEATHER_ICON_CHANCE_OF_THUNDERSTORMS;
                case 34:
                    return WEATHER_ICON_MIST;
                case 35:
                    return WEATHER_ICON_DUST;
                case 36:
                    return WEATHER_ICON_DRIZZLE;
                case 37:
                    return WEATHER_ICON_SMOKE;
                case 38:
                    return WEATHER_ICON_ICE;
                case 39:
                    return WEATHER_ICON_SAND;
                case 40:
                    return WEATHER_ICON_SQUALL;
                case 41:
                    return WEATHER_ICON_SANDSTORM;
                case 42:
                    return WEATHER_ICON_VOLCANIC_ASH;
                case 43:
                    return WEATHER_ICON_HAZE;
                case 44:
                    return WEATHER_ICON_FAIR;
                case 45:
                    return WEATHER_ICON_HURRICANE;
                case 46:
                    return WEATHER_ICON_TROPICAL_STORM;
                case 47:
                    return WEATHER_ICON_CHANCE_OF_SNOW;
                case 48:
                    return WEATHER_ICON_CHANCE_OF_RAIN_SNOW;
                case 49:
                    return WEATHER_ICON_CLOUDY_CHANCE_OF_RAIN;
                case 50:
                    return WEATHER_ICON_CLOUDY_CHANCE_OF_SNOW;
                case 51:
                    return WEATHER_ICON_CLOUDY_CHANCE_OF_RAIN_SNOW;
                case 52:
                    return WEATHER_ICON_FLURRIES;
                case 53:
                    return WEATHER_ICON_FREEZING_RAIN;
                case 54:
                    return WEATHER_ICON_ICE_SNOW;
                case 55:
                    return WEATHER_ICON_THIN_CLOUDS;
                default:
                    return null;
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIInReachWeather.getDescriptor().getEnumTypes().get(1);
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
}
