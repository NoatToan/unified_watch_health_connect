package com.garmin.gcsprotos.generated;

import com.google.common.net.HttpHeaders;
import com.google.protobuf.AbstractMessage;
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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import i3.e5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public final class RequestTypesProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0012requestTypes.proto\u0012\u0011CSM.Proto.Service\u001a\rweather.proto\u001a\nauth.proto\u001a\fgpsFix.proto\u001a\rtracker.proto\u001a\u000fdataTypes.proto\u001a\rfitness.proto\u001a\u0015fitnesstracking.proto\u001a\u0013fitnessDevice.proto\u001a\u0012gpsEphemeris.proto\u001a\u0013fitnessSocial.proto\u001a\u0019emergencyassistance.proto\"Ò\u0007\n\u000eServiceRequest\u0012\u0014\n\fsequence_num\u0018\u0001 \u0001(\r\u0012\u0014\n\fcountry_code\u0018\u0002 \u0001(\t\u0012\u001c\n\rremove_markup\u0018\u0003 \u0001(\b:\u0005false\u0012:\n\u000fweather_request\u0018\u001e \u0001(\u000b2!.CSM.Proto.Weather.WeatherRequest\u00121\n\fauth_request\u0018/ \u0001(\u000b2\u001b.CSM.Proto.Auth.AuthRequest\u00128\n\u000fgps_fix_request\u0018F \u0001(\u000b2\u001f.CSM.Proto.GpsFix.GpsFixRequest\u0012:\n\u000ftracker_request\u0018H \u0001(\u000b2!.CSM.Proto.Tracker.TrackerRequest\u0012E\n\u0017mobile_app_auth_request\u0018P \u0001(\u000b2$.CSM.Proto.Auth.MobileAppAuthRequest\u0012G\n\u0018mobile_app_store_request\u0018Q \u0001(\u000b2%.CSM.Proto.Auth.MobileAppStoreRequest\u0012S\n\u0018fitness_tracking_request\u0018R \u0001(\u000b21.CSM.Proto.FitnessTracking.FitnessTrackingRequest\u0012I\n\u0017fitness_service_request\u0018W \u0001(\u000b2(.CSM.Proto.Fitness.FitnessServiceRequest\u0012\\\n\u001efitness_device_service_request\u0018d \u0001(\u000b24.CSM.Proto.FitnessDevice.FitnessDeviceServiceRequest\u0012D\n\u0015gps_ephemeris_request\u0018e \u0001(\u000b2%.CSM.Proto.GpsFix.GPSEphemerisRequest\u0012\\\n\u001efitness_social_service_request\u0018f \u0001(\u000b24.CSM.Proto.FitnessSocial.FitnessSocialServiceRequest\u0012_\n\u001cemergency_assistance_request\u0018z \u0001(\u000b29.CSM.Proto.EmergencyAssistance.EmergencyAssistanceRequest\"|\n\u0012TransactionContext\u00128\n\u000fdelta_track_log\u0018\u0001 \u0001(\u000b2\u001f.CSM.Proto.Common.DeltaTrackLog\u0012,\n\blocation\u0018\u0002 \u0001(\u000b2\u001a.CSM.Proto.Common.LocationB5\n\u001ecom.garmin.gcsprotos.generatedB\u0011RequestTypesProtoH\u0003"}, new Descriptors.FileDescriptor[]{WeatherProto.getDescriptor(), Auth.getDescriptor(), GpsFixProto.getDescriptor(), TrackerProto.getDescriptor(), DataTypesProto.getDescriptor(), FitnessProto.getDescriptor(), FitnessTrackingProto.getDescriptor(), FitnessDeviceProto.getDescriptor(), GpsEphemerisProto.getDescriptor(), FitnessSocialProto.getDescriptor(), EmergencyAssistanceProto.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_CSM_Proto_Service_ServiceRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CSM_Proto_Service_ServiceRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_CSM_Proto_Service_TransactionContext_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CSM_Proto_Service_TransactionContext_fieldAccessorTable;

    public interface ServiceRequestOrBuilder extends MessageOrBuilder {
        Auth.AuthRequest getAuthRequest();

        Auth.AuthRequestOrBuilder getAuthRequestOrBuilder();

        String getCountryCode();

        ByteString getCountryCodeBytes();

        EmergencyAssistanceProto.EmergencyAssistanceRequest getEmergencyAssistanceRequest();

        EmergencyAssistanceProto.EmergencyAssistanceRequestOrBuilder getEmergencyAssistanceRequestOrBuilder();

        FitnessDeviceProto.FitnessDeviceServiceRequest getFitnessDeviceServiceRequest();

        FitnessDeviceProto.FitnessDeviceServiceRequestOrBuilder getFitnessDeviceServiceRequestOrBuilder();

        FitnessProto.FitnessServiceRequest getFitnessServiceRequest();

        FitnessProto.FitnessServiceRequestOrBuilder getFitnessServiceRequestOrBuilder();

        FitnessSocialProto.FitnessSocialServiceRequest getFitnessSocialServiceRequest();

        FitnessSocialProto.FitnessSocialServiceRequestOrBuilder getFitnessSocialServiceRequestOrBuilder();

        FitnessTrackingProto.FitnessTrackingRequest getFitnessTrackingRequest();

        FitnessTrackingProto.FitnessTrackingRequestOrBuilder getFitnessTrackingRequestOrBuilder();

        GpsEphemerisProto.GPSEphemerisRequest getGpsEphemerisRequest();

        GpsEphemerisProto.GPSEphemerisRequestOrBuilder getGpsEphemerisRequestOrBuilder();

        GpsFixProto.GpsFixRequest getGpsFixRequest();

        GpsFixProto.GpsFixRequestOrBuilder getGpsFixRequestOrBuilder();

        Auth.MobileAppAuthRequest getMobileAppAuthRequest();

        Auth.MobileAppAuthRequestOrBuilder getMobileAppAuthRequestOrBuilder();

        Auth.MobileAppStoreRequest getMobileAppStoreRequest();

        Auth.MobileAppStoreRequestOrBuilder getMobileAppStoreRequestOrBuilder();

        boolean getRemoveMarkup();

        int getSequenceNum();

        TrackerProto.TrackerRequest getTrackerRequest();

        TrackerProto.TrackerRequestOrBuilder getTrackerRequestOrBuilder();

        WeatherProto.WeatherRequest getWeatherRequest();

        WeatherProto.WeatherRequestOrBuilder getWeatherRequestOrBuilder();

        boolean hasAuthRequest();

        boolean hasCountryCode();

        boolean hasEmergencyAssistanceRequest();

        boolean hasFitnessDeviceServiceRequest();

        boolean hasFitnessServiceRequest();

        boolean hasFitnessSocialServiceRequest();

        boolean hasFitnessTrackingRequest();

        boolean hasGpsEphemerisRequest();

        boolean hasGpsFixRequest();

        boolean hasMobileAppAuthRequest();

        boolean hasMobileAppStoreRequest();

        boolean hasRemoveMarkup();

        boolean hasSequenceNum();

        boolean hasTrackerRequest();

        boolean hasWeatherRequest();
    }

    public interface TransactionContextOrBuilder extends MessageOrBuilder {
        DataTypesProto.DeltaTrackLog getDeltaTrackLog();

        DataTypesProto.DeltaTrackLogOrBuilder getDeltaTrackLogOrBuilder();

        DataTypesProto.Location getLocation();

        DataTypesProto.LocationOrBuilder getLocationOrBuilder();

        boolean hasDeltaTrackLog();

        boolean hasLocation();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_CSM_Proto_Service_ServiceRequest_descriptor = descriptor2;
        internal_static_CSM_Proto_Service_ServiceRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"SequenceNum", "CountryCode", "RemoveMarkup", "WeatherRequest", "AuthRequest", "GpsFixRequest", "TrackerRequest", "MobileAppAuthRequest", "MobileAppStoreRequest", "FitnessTrackingRequest", "FitnessServiceRequest", "FitnessDeviceServiceRequest", "GpsEphemerisRequest", "FitnessSocialServiceRequest", "EmergencyAssistanceRequest"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_CSM_Proto_Service_TransactionContext_descriptor = descriptor3;
        internal_static_CSM_Proto_Service_TransactionContext_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"DeltaTrackLog", HttpHeaders.LOCATION});
        WeatherProto.getDescriptor();
        Auth.getDescriptor();
        GpsFixProto.getDescriptor();
        TrackerProto.getDescriptor();
        DataTypesProto.getDescriptor();
        FitnessProto.getDescriptor();
        FitnessTrackingProto.getDescriptor();
        FitnessDeviceProto.getDescriptor();
        GpsEphemerisProto.getDescriptor();
        FitnessSocialProto.getDescriptor();
        EmergencyAssistanceProto.getDescriptor();
    }

    private RequestTypesProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class ServiceRequest extends GeneratedMessageV3 implements ServiceRequestOrBuilder {
        public static final int AUTH_REQUEST_FIELD_NUMBER = 47;
        public static final int COUNTRY_CODE_FIELD_NUMBER = 2;
        public static final int EMERGENCY_ASSISTANCE_REQUEST_FIELD_NUMBER = 122;
        public static final int FITNESS_DEVICE_SERVICE_REQUEST_FIELD_NUMBER = 100;
        public static final int FITNESS_SERVICE_REQUEST_FIELD_NUMBER = 87;
        public static final int FITNESS_SOCIAL_SERVICE_REQUEST_FIELD_NUMBER = 102;
        public static final int FITNESS_TRACKING_REQUEST_FIELD_NUMBER = 82;
        public static final int GPS_EPHEMERIS_REQUEST_FIELD_NUMBER = 101;
        public static final int GPS_FIX_REQUEST_FIELD_NUMBER = 70;
        public static final int MOBILE_APP_AUTH_REQUEST_FIELD_NUMBER = 80;
        public static final int MOBILE_APP_STORE_REQUEST_FIELD_NUMBER = 81;
        public static final int REMOVE_MARKUP_FIELD_NUMBER = 3;
        public static final int SEQUENCE_NUM_FIELD_NUMBER = 1;
        public static final int TRACKER_REQUEST_FIELD_NUMBER = 72;
        public static final int WEATHER_REQUEST_FIELD_NUMBER = 30;
        private static final long serialVersionUID = 0;
        private Auth.AuthRequest authRequest_;
        private int bitField0_;
        private volatile Object countryCode_;
        private EmergencyAssistanceProto.EmergencyAssistanceRequest emergencyAssistanceRequest_;
        private FitnessDeviceProto.FitnessDeviceServiceRequest fitnessDeviceServiceRequest_;
        private FitnessProto.FitnessServiceRequest fitnessServiceRequest_;
        private FitnessSocialProto.FitnessSocialServiceRequest fitnessSocialServiceRequest_;
        private FitnessTrackingProto.FitnessTrackingRequest fitnessTrackingRequest_;
        private GpsEphemerisProto.GPSEphemerisRequest gpsEphemerisRequest_;
        private GpsFixProto.GpsFixRequest gpsFixRequest_;
        private byte memoizedIsInitialized;
        private Auth.MobileAppAuthRequest mobileAppAuthRequest_;
        private Auth.MobileAppStoreRequest mobileAppStoreRequest_;
        private boolean removeMarkup_;
        private int sequenceNum_;
        private TrackerProto.TrackerRequest trackerRequest_;
        private WeatherProto.WeatherRequest weatherRequest_;
        private static final ServiceRequest DEFAULT_INSTANCE = new ServiceRequest();

        @Deprecated
        public static final Parser<ServiceRequest> PARSER = new AbstractParser<ServiceRequest>() { // from class: com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequest.1
            @Override // com.google.protobuf.Parser
            public ServiceRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ServiceRequest.newBuilder();
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

        private ServiceRequest() {
            this.sequenceNum_ = 0;
            this.countryCode_ = "";
            this.removeMarkup_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.countryCode_ = "";
        }

        public static ServiceRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return RequestTypesProto.internal_static_CSM_Proto_Service_ServiceRequest_descriptor;
        }

        public static Builder newBuilder(ServiceRequest serviceRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(serviceRequest);
        }

        public static ServiceRequest parseDelimitedFrom(InputStream inputStream) {
            return (ServiceRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ServiceRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ServiceRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ServiceRequest)) {
                return super.equals(obj);
            }
            ServiceRequest serviceRequest = (ServiceRequest) obj;
            if (hasSequenceNum() != serviceRequest.hasSequenceNum()) {
                return false;
            }
            if ((hasSequenceNum() && getSequenceNum() != serviceRequest.getSequenceNum()) || hasCountryCode() != serviceRequest.hasCountryCode()) {
                return false;
            }
            if ((hasCountryCode() && !getCountryCode().equals(serviceRequest.getCountryCode())) || hasRemoveMarkup() != serviceRequest.hasRemoveMarkup()) {
                return false;
            }
            if ((hasRemoveMarkup() && getRemoveMarkup() != serviceRequest.getRemoveMarkup()) || hasWeatherRequest() != serviceRequest.hasWeatherRequest()) {
                return false;
            }
            if ((hasWeatherRequest() && !getWeatherRequest().equals(serviceRequest.getWeatherRequest())) || hasAuthRequest() != serviceRequest.hasAuthRequest()) {
                return false;
            }
            if ((hasAuthRequest() && !getAuthRequest().equals(serviceRequest.getAuthRequest())) || hasGpsFixRequest() != serviceRequest.hasGpsFixRequest()) {
                return false;
            }
            if ((hasGpsFixRequest() && !getGpsFixRequest().equals(serviceRequest.getGpsFixRequest())) || hasTrackerRequest() != serviceRequest.hasTrackerRequest()) {
                return false;
            }
            if ((hasTrackerRequest() && !getTrackerRequest().equals(serviceRequest.getTrackerRequest())) || hasMobileAppAuthRequest() != serviceRequest.hasMobileAppAuthRequest()) {
                return false;
            }
            if ((hasMobileAppAuthRequest() && !getMobileAppAuthRequest().equals(serviceRequest.getMobileAppAuthRequest())) || hasMobileAppStoreRequest() != serviceRequest.hasMobileAppStoreRequest()) {
                return false;
            }
            if ((hasMobileAppStoreRequest() && !getMobileAppStoreRequest().equals(serviceRequest.getMobileAppStoreRequest())) || hasFitnessTrackingRequest() != serviceRequest.hasFitnessTrackingRequest()) {
                return false;
            }
            if ((hasFitnessTrackingRequest() && !getFitnessTrackingRequest().equals(serviceRequest.getFitnessTrackingRequest())) || hasFitnessServiceRequest() != serviceRequest.hasFitnessServiceRequest()) {
                return false;
            }
            if ((hasFitnessServiceRequest() && !getFitnessServiceRequest().equals(serviceRequest.getFitnessServiceRequest())) || hasFitnessDeviceServiceRequest() != serviceRequest.hasFitnessDeviceServiceRequest()) {
                return false;
            }
            if ((hasFitnessDeviceServiceRequest() && !getFitnessDeviceServiceRequest().equals(serviceRequest.getFitnessDeviceServiceRequest())) || hasGpsEphemerisRequest() != serviceRequest.hasGpsEphemerisRequest()) {
                return false;
            }
            if ((hasGpsEphemerisRequest() && !getGpsEphemerisRequest().equals(serviceRequest.getGpsEphemerisRequest())) || hasFitnessSocialServiceRequest() != serviceRequest.hasFitnessSocialServiceRequest()) {
                return false;
            }
            if ((!hasFitnessSocialServiceRequest() || getFitnessSocialServiceRequest().equals(serviceRequest.getFitnessSocialServiceRequest())) && hasEmergencyAssistanceRequest() == serviceRequest.hasEmergencyAssistanceRequest()) {
                return (!hasEmergencyAssistanceRequest() || getEmergencyAssistanceRequest().equals(serviceRequest.getEmergencyAssistanceRequest())) && getUnknownFields().equals(serviceRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public Auth.AuthRequest getAuthRequest() {
            Auth.AuthRequest authRequest = this.authRequest_;
            return authRequest == null ? Auth.AuthRequest.getDefaultInstance() : authRequest;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public Auth.AuthRequestOrBuilder getAuthRequestOrBuilder() {
            Auth.AuthRequest authRequest = this.authRequest_;
            return authRequest == null ? Auth.AuthRequest.getDefaultInstance() : authRequest;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public String getCountryCode() {
            Object obj = this.countryCode_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.countryCode_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public ByteString getCountryCodeBytes() {
            Object obj = this.countryCode_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.countryCode_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public EmergencyAssistanceProto.EmergencyAssistanceRequest getEmergencyAssistanceRequest() {
            EmergencyAssistanceProto.EmergencyAssistanceRequest emergencyAssistanceRequest = this.emergencyAssistanceRequest_;
            return emergencyAssistanceRequest == null ? EmergencyAssistanceProto.EmergencyAssistanceRequest.getDefaultInstance() : emergencyAssistanceRequest;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public EmergencyAssistanceProto.EmergencyAssistanceRequestOrBuilder getEmergencyAssistanceRequestOrBuilder() {
            EmergencyAssistanceProto.EmergencyAssistanceRequest emergencyAssistanceRequest = this.emergencyAssistanceRequest_;
            return emergencyAssistanceRequest == null ? EmergencyAssistanceProto.EmergencyAssistanceRequest.getDefaultInstance() : emergencyAssistanceRequest;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public FitnessDeviceProto.FitnessDeviceServiceRequest getFitnessDeviceServiceRequest() {
            FitnessDeviceProto.FitnessDeviceServiceRequest fitnessDeviceServiceRequest = this.fitnessDeviceServiceRequest_;
            return fitnessDeviceServiceRequest == null ? FitnessDeviceProto.FitnessDeviceServiceRequest.getDefaultInstance() : fitnessDeviceServiceRequest;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public FitnessDeviceProto.FitnessDeviceServiceRequestOrBuilder getFitnessDeviceServiceRequestOrBuilder() {
            FitnessDeviceProto.FitnessDeviceServiceRequest fitnessDeviceServiceRequest = this.fitnessDeviceServiceRequest_;
            return fitnessDeviceServiceRequest == null ? FitnessDeviceProto.FitnessDeviceServiceRequest.getDefaultInstance() : fitnessDeviceServiceRequest;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public FitnessProto.FitnessServiceRequest getFitnessServiceRequest() {
            FitnessProto.FitnessServiceRequest fitnessServiceRequest = this.fitnessServiceRequest_;
            return fitnessServiceRequest == null ? FitnessProto.FitnessServiceRequest.getDefaultInstance() : fitnessServiceRequest;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public FitnessProto.FitnessServiceRequestOrBuilder getFitnessServiceRequestOrBuilder() {
            FitnessProto.FitnessServiceRequest fitnessServiceRequest = this.fitnessServiceRequest_;
            return fitnessServiceRequest == null ? FitnessProto.FitnessServiceRequest.getDefaultInstance() : fitnessServiceRequest;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public FitnessSocialProto.FitnessSocialServiceRequest getFitnessSocialServiceRequest() {
            FitnessSocialProto.FitnessSocialServiceRequest fitnessSocialServiceRequest = this.fitnessSocialServiceRequest_;
            return fitnessSocialServiceRequest == null ? FitnessSocialProto.FitnessSocialServiceRequest.getDefaultInstance() : fitnessSocialServiceRequest;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public FitnessSocialProto.FitnessSocialServiceRequestOrBuilder getFitnessSocialServiceRequestOrBuilder() {
            FitnessSocialProto.FitnessSocialServiceRequest fitnessSocialServiceRequest = this.fitnessSocialServiceRequest_;
            return fitnessSocialServiceRequest == null ? FitnessSocialProto.FitnessSocialServiceRequest.getDefaultInstance() : fitnessSocialServiceRequest;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public FitnessTrackingProto.FitnessTrackingRequest getFitnessTrackingRequest() {
            FitnessTrackingProto.FitnessTrackingRequest fitnessTrackingRequest = this.fitnessTrackingRequest_;
            return fitnessTrackingRequest == null ? FitnessTrackingProto.FitnessTrackingRequest.getDefaultInstance() : fitnessTrackingRequest;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public FitnessTrackingProto.FitnessTrackingRequestOrBuilder getFitnessTrackingRequestOrBuilder() {
            FitnessTrackingProto.FitnessTrackingRequest fitnessTrackingRequest = this.fitnessTrackingRequest_;
            return fitnessTrackingRequest == null ? FitnessTrackingProto.FitnessTrackingRequest.getDefaultInstance() : fitnessTrackingRequest;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public GpsEphemerisProto.GPSEphemerisRequest getGpsEphemerisRequest() {
            GpsEphemerisProto.GPSEphemerisRequest gPSEphemerisRequest = this.gpsEphemerisRequest_;
            return gPSEphemerisRequest == null ? GpsEphemerisProto.GPSEphemerisRequest.getDefaultInstance() : gPSEphemerisRequest;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public GpsEphemerisProto.GPSEphemerisRequestOrBuilder getGpsEphemerisRequestOrBuilder() {
            GpsEphemerisProto.GPSEphemerisRequest gPSEphemerisRequest = this.gpsEphemerisRequest_;
            return gPSEphemerisRequest == null ? GpsEphemerisProto.GPSEphemerisRequest.getDefaultInstance() : gPSEphemerisRequest;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public GpsFixProto.GpsFixRequest getGpsFixRequest() {
            GpsFixProto.GpsFixRequest gpsFixRequest = this.gpsFixRequest_;
            return gpsFixRequest == null ? GpsFixProto.GpsFixRequest.getDefaultInstance() : gpsFixRequest;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public GpsFixProto.GpsFixRequestOrBuilder getGpsFixRequestOrBuilder() {
            GpsFixProto.GpsFixRequest gpsFixRequest = this.gpsFixRequest_;
            return gpsFixRequest == null ? GpsFixProto.GpsFixRequest.getDefaultInstance() : gpsFixRequest;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public Auth.MobileAppAuthRequest getMobileAppAuthRequest() {
            Auth.MobileAppAuthRequest mobileAppAuthRequest = this.mobileAppAuthRequest_;
            return mobileAppAuthRequest == null ? Auth.MobileAppAuthRequest.getDefaultInstance() : mobileAppAuthRequest;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public Auth.MobileAppAuthRequestOrBuilder getMobileAppAuthRequestOrBuilder() {
            Auth.MobileAppAuthRequest mobileAppAuthRequest = this.mobileAppAuthRequest_;
            return mobileAppAuthRequest == null ? Auth.MobileAppAuthRequest.getDefaultInstance() : mobileAppAuthRequest;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public Auth.MobileAppStoreRequest getMobileAppStoreRequest() {
            Auth.MobileAppStoreRequest mobileAppStoreRequest = this.mobileAppStoreRequest_;
            return mobileAppStoreRequest == null ? Auth.MobileAppStoreRequest.getDefaultInstance() : mobileAppStoreRequest;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public Auth.MobileAppStoreRequestOrBuilder getMobileAppStoreRequestOrBuilder() {
            Auth.MobileAppStoreRequest mobileAppStoreRequest = this.mobileAppStoreRequest_;
            return mobileAppStoreRequest == null ? Auth.MobileAppStoreRequest.getDefaultInstance() : mobileAppStoreRequest;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ServiceRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public boolean getRemoveMarkup() {
            return this.removeMarkup_;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public int getSequenceNum() {
            return this.sequenceNum_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.sequenceNum_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += GeneratedMessageV3.computeStringSize(2, this.countryCode_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(3, this.removeMarkup_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(30, getWeatherRequest());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(47, getAuthRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(70, getGpsFixRequest());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(72, getTrackerRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(80, getMobileAppAuthRequest());
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(81, getMobileAppStoreRequest());
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(82, getFitnessTrackingRequest());
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(87, getFitnessServiceRequest());
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(100, getFitnessDeviceServiceRequest());
            }
            if ((this.bitField0_ & 4096) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(101, getGpsEphemerisRequest());
            }
            if ((this.bitField0_ & 8192) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(102, getFitnessSocialServiceRequest());
            }
            if ((this.bitField0_ & 16384) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(122, getEmergencyAssistanceRequest());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public TrackerProto.TrackerRequest getTrackerRequest() {
            TrackerProto.TrackerRequest trackerRequest = this.trackerRequest_;
            return trackerRequest == null ? TrackerProto.TrackerRequest.getDefaultInstance() : trackerRequest;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public TrackerProto.TrackerRequestOrBuilder getTrackerRequestOrBuilder() {
            TrackerProto.TrackerRequest trackerRequest = this.trackerRequest_;
            return trackerRequest == null ? TrackerProto.TrackerRequest.getDefaultInstance() : trackerRequest;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public WeatherProto.WeatherRequest getWeatherRequest() {
            WeatherProto.WeatherRequest weatherRequest = this.weatherRequest_;
            return weatherRequest == null ? WeatherProto.WeatherRequest.getDefaultInstance() : weatherRequest;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public WeatherProto.WeatherRequestOrBuilder getWeatherRequestOrBuilder() {
            WeatherProto.WeatherRequest weatherRequest = this.weatherRequest_;
            return weatherRequest == null ? WeatherProto.WeatherRequest.getDefaultInstance() : weatherRequest;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public boolean hasAuthRequest() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public boolean hasCountryCode() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public boolean hasEmergencyAssistanceRequest() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public boolean hasFitnessDeviceServiceRequest() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public boolean hasFitnessServiceRequest() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public boolean hasFitnessSocialServiceRequest() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public boolean hasFitnessTrackingRequest() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public boolean hasGpsEphemerisRequest() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public boolean hasGpsFixRequest() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public boolean hasMobileAppAuthRequest() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public boolean hasMobileAppStoreRequest() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public boolean hasRemoveMarkup() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public boolean hasSequenceNum() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public boolean hasTrackerRequest() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
        public boolean hasWeatherRequest() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSequenceNum()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSequenceNum();
            }
            if (hasCountryCode()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getCountryCode().hashCode();
            }
            if (hasRemoveMarkup()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashBoolean(getRemoveMarkup());
            }
            if (hasWeatherRequest()) {
                iHashCode = e5.c(iHashCode, 37, 30, 53) + getWeatherRequest().hashCode();
            }
            if (hasAuthRequest()) {
                iHashCode = e5.c(iHashCode, 37, 47, 53) + getAuthRequest().hashCode();
            }
            if (hasGpsFixRequest()) {
                iHashCode = e5.c(iHashCode, 37, 70, 53) + getGpsFixRequest().hashCode();
            }
            if (hasTrackerRequest()) {
                iHashCode = e5.c(iHashCode, 37, 72, 53) + getTrackerRequest().hashCode();
            }
            if (hasMobileAppAuthRequest()) {
                iHashCode = e5.c(iHashCode, 37, 80, 53) + getMobileAppAuthRequest().hashCode();
            }
            if (hasMobileAppStoreRequest()) {
                iHashCode = e5.c(iHashCode, 37, 81, 53) + getMobileAppStoreRequest().hashCode();
            }
            if (hasFitnessTrackingRequest()) {
                iHashCode = e5.c(iHashCode, 37, 82, 53) + getFitnessTrackingRequest().hashCode();
            }
            if (hasFitnessServiceRequest()) {
                iHashCode = e5.c(iHashCode, 37, 87, 53) + getFitnessServiceRequest().hashCode();
            }
            if (hasFitnessDeviceServiceRequest()) {
                iHashCode = e5.c(iHashCode, 37, 100, 53) + getFitnessDeviceServiceRequest().hashCode();
            }
            if (hasGpsEphemerisRequest()) {
                iHashCode = e5.c(iHashCode, 37, 101, 53) + getGpsEphemerisRequest().hashCode();
            }
            if (hasFitnessSocialServiceRequest()) {
                iHashCode = e5.c(iHashCode, 37, 102, 53) + getFitnessSocialServiceRequest().hashCode();
            }
            if (hasEmergencyAssistanceRequest()) {
                iHashCode = e5.c(iHashCode, 37, 122, 53) + getEmergencyAssistanceRequest().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RequestTypesProto.internal_static_CSM_Proto_Service_ServiceRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ServiceRequest.class, Builder.class);
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
            if (hasWeatherRequest() && !getWeatherRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasAuthRequest() && !getAuthRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasTrackerRequest() && !getTrackerRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasMobileAppAuthRequest() && !getMobileAppAuthRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasMobileAppStoreRequest() && !getMobileAppStoreRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasFitnessTrackingRequest() && !getFitnessTrackingRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasFitnessServiceRequest() && !getFitnessServiceRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasFitnessDeviceServiceRequest() && !getFitnessDeviceServiceRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasFitnessSocialServiceRequest() && !getFitnessSocialServiceRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasEmergencyAssistanceRequest() || getEmergencyAssistanceRequest().isInitialized()) {
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
            return new ServiceRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.sequenceNum_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.countryCode_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(3, this.removeMarkup_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(30, getWeatherRequest());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(47, getAuthRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(70, getGpsFixRequest());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(72, getTrackerRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(80, getMobileAppAuthRequest());
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(81, getMobileAppStoreRequest());
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeMessage(82, getFitnessTrackingRequest());
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeMessage(87, getFitnessServiceRequest());
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeMessage(100, getFitnessDeviceServiceRequest());
            }
            if ((this.bitField0_ & 4096) != 0) {
                codedOutputStream.writeMessage(101, getGpsEphemerisRequest());
            }
            if ((this.bitField0_ & 8192) != 0) {
                codedOutputStream.writeMessage(102, getFitnessSocialServiceRequest());
            }
            if ((this.bitField0_ & 16384) != 0) {
                codedOutputStream.writeMessage(122, getEmergencyAssistanceRequest());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceRequestOrBuilder {
            private SingleFieldBuilderV3<Auth.AuthRequest, Auth.AuthRequest.Builder, Auth.AuthRequestOrBuilder> authRequestBuilder_;
            private Auth.AuthRequest authRequest_;
            private int bitField0_;
            private Object countryCode_;
            private SingleFieldBuilderV3<EmergencyAssistanceProto.EmergencyAssistanceRequest, EmergencyAssistanceProto.EmergencyAssistanceRequest.Builder, EmergencyAssistanceProto.EmergencyAssistanceRequestOrBuilder> emergencyAssistanceRequestBuilder_;
            private EmergencyAssistanceProto.EmergencyAssistanceRequest emergencyAssistanceRequest_;
            private SingleFieldBuilderV3<FitnessDeviceProto.FitnessDeviceServiceRequest, FitnessDeviceProto.FitnessDeviceServiceRequest.Builder, FitnessDeviceProto.FitnessDeviceServiceRequestOrBuilder> fitnessDeviceServiceRequestBuilder_;
            private FitnessDeviceProto.FitnessDeviceServiceRequest fitnessDeviceServiceRequest_;
            private SingleFieldBuilderV3<FitnessProto.FitnessServiceRequest, FitnessProto.FitnessServiceRequest.Builder, FitnessProto.FitnessServiceRequestOrBuilder> fitnessServiceRequestBuilder_;
            private FitnessProto.FitnessServiceRequest fitnessServiceRequest_;
            private SingleFieldBuilderV3<FitnessSocialProto.FitnessSocialServiceRequest, FitnessSocialProto.FitnessSocialServiceRequest.Builder, FitnessSocialProto.FitnessSocialServiceRequestOrBuilder> fitnessSocialServiceRequestBuilder_;
            private FitnessSocialProto.FitnessSocialServiceRequest fitnessSocialServiceRequest_;
            private SingleFieldBuilderV3<FitnessTrackingProto.FitnessTrackingRequest, FitnessTrackingProto.FitnessTrackingRequest.Builder, FitnessTrackingProto.FitnessTrackingRequestOrBuilder> fitnessTrackingRequestBuilder_;
            private FitnessTrackingProto.FitnessTrackingRequest fitnessTrackingRequest_;
            private SingleFieldBuilderV3<GpsEphemerisProto.GPSEphemerisRequest, GpsEphemerisProto.GPSEphemerisRequest.Builder, GpsEphemerisProto.GPSEphemerisRequestOrBuilder> gpsEphemerisRequestBuilder_;
            private GpsEphemerisProto.GPSEphemerisRequest gpsEphemerisRequest_;
            private SingleFieldBuilderV3<GpsFixProto.GpsFixRequest, GpsFixProto.GpsFixRequest.Builder, GpsFixProto.GpsFixRequestOrBuilder> gpsFixRequestBuilder_;
            private GpsFixProto.GpsFixRequest gpsFixRequest_;
            private SingleFieldBuilderV3<Auth.MobileAppAuthRequest, Auth.MobileAppAuthRequest.Builder, Auth.MobileAppAuthRequestOrBuilder> mobileAppAuthRequestBuilder_;
            private Auth.MobileAppAuthRequest mobileAppAuthRequest_;
            private SingleFieldBuilderV3<Auth.MobileAppStoreRequest, Auth.MobileAppStoreRequest.Builder, Auth.MobileAppStoreRequestOrBuilder> mobileAppStoreRequestBuilder_;
            private Auth.MobileAppStoreRequest mobileAppStoreRequest_;
            private boolean removeMarkup_;
            private int sequenceNum_;
            private SingleFieldBuilderV3<TrackerProto.TrackerRequest, TrackerProto.TrackerRequest.Builder, TrackerProto.TrackerRequestOrBuilder> trackerRequestBuilder_;
            private TrackerProto.TrackerRequest trackerRequest_;
            private SingleFieldBuilderV3<WeatherProto.WeatherRequest, WeatherProto.WeatherRequest.Builder, WeatherProto.WeatherRequestOrBuilder> weatherRequestBuilder_;
            private WeatherProto.WeatherRequest weatherRequest_;

            private Builder() {
                this.countryCode_ = "";
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ServiceRequest serviceRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    serviceRequest.sequenceNum_ = this.sequenceNum_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    serviceRequest.countryCode_ = this.countryCode_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    serviceRequest.removeMarkup_ = this.removeMarkup_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<WeatherProto.WeatherRequest, WeatherProto.WeatherRequest.Builder, WeatherProto.WeatherRequestOrBuilder> singleFieldBuilderV3 = this.weatherRequestBuilder_;
                    serviceRequest.weatherRequest_ = singleFieldBuilderV3 == null ? this.weatherRequest_ : (WeatherProto.WeatherRequest) singleFieldBuilderV3.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<Auth.AuthRequest, Auth.AuthRequest.Builder, Auth.AuthRequestOrBuilder> singleFieldBuilderV4 = this.authRequestBuilder_;
                    serviceRequest.authRequest_ = singleFieldBuilderV4 == null ? this.authRequest_ : (Auth.AuthRequest) singleFieldBuilderV4.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<GpsFixProto.GpsFixRequest, GpsFixProto.GpsFixRequest.Builder, GpsFixProto.GpsFixRequestOrBuilder> singleFieldBuilderV5 = this.gpsFixRequestBuilder_;
                    serviceRequest.gpsFixRequest_ = singleFieldBuilderV5 == null ? this.gpsFixRequest_ : (GpsFixProto.GpsFixRequest) singleFieldBuilderV5.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<TrackerProto.TrackerRequest, TrackerProto.TrackerRequest.Builder, TrackerProto.TrackerRequestOrBuilder> singleFieldBuilderV6 = this.trackerRequestBuilder_;
                    serviceRequest.trackerRequest_ = singleFieldBuilderV6 == null ? this.trackerRequest_ : (TrackerProto.TrackerRequest) singleFieldBuilderV6.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<Auth.MobileAppAuthRequest, Auth.MobileAppAuthRequest.Builder, Auth.MobileAppAuthRequestOrBuilder> singleFieldBuilderV7 = this.mobileAppAuthRequestBuilder_;
                    serviceRequest.mobileAppAuthRequest_ = singleFieldBuilderV7 == null ? this.mobileAppAuthRequest_ : (Auth.MobileAppAuthRequest) singleFieldBuilderV7.build();
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    SingleFieldBuilderV3<Auth.MobileAppStoreRequest, Auth.MobileAppStoreRequest.Builder, Auth.MobileAppStoreRequestOrBuilder> singleFieldBuilderV8 = this.mobileAppStoreRequestBuilder_;
                    serviceRequest.mobileAppStoreRequest_ = singleFieldBuilderV8 == null ? this.mobileAppStoreRequest_ : (Auth.MobileAppStoreRequest) singleFieldBuilderV8.build();
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    SingleFieldBuilderV3<FitnessTrackingProto.FitnessTrackingRequest, FitnessTrackingProto.FitnessTrackingRequest.Builder, FitnessTrackingProto.FitnessTrackingRequestOrBuilder> singleFieldBuilderV9 = this.fitnessTrackingRequestBuilder_;
                    serviceRequest.fitnessTrackingRequest_ = singleFieldBuilderV9 == null ? this.fitnessTrackingRequest_ : (FitnessTrackingProto.FitnessTrackingRequest) singleFieldBuilderV9.build();
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    SingleFieldBuilderV3<FitnessProto.FitnessServiceRequest, FitnessProto.FitnessServiceRequest.Builder, FitnessProto.FitnessServiceRequestOrBuilder> singleFieldBuilderV10 = this.fitnessServiceRequestBuilder_;
                    serviceRequest.fitnessServiceRequest_ = singleFieldBuilderV10 == null ? this.fitnessServiceRequest_ : (FitnessProto.FitnessServiceRequest) singleFieldBuilderV10.build();
                    i14 |= 1024;
                }
                if ((i15 & 2048) != 0) {
                    SingleFieldBuilderV3<FitnessDeviceProto.FitnessDeviceServiceRequest, FitnessDeviceProto.FitnessDeviceServiceRequest.Builder, FitnessDeviceProto.FitnessDeviceServiceRequestOrBuilder> singleFieldBuilderV11 = this.fitnessDeviceServiceRequestBuilder_;
                    serviceRequest.fitnessDeviceServiceRequest_ = singleFieldBuilderV11 == null ? this.fitnessDeviceServiceRequest_ : (FitnessDeviceProto.FitnessDeviceServiceRequest) singleFieldBuilderV11.build();
                    i14 |= 2048;
                }
                if ((i15 & 4096) != 0) {
                    SingleFieldBuilderV3<GpsEphemerisProto.GPSEphemerisRequest, GpsEphemerisProto.GPSEphemerisRequest.Builder, GpsEphemerisProto.GPSEphemerisRequestOrBuilder> singleFieldBuilderV12 = this.gpsEphemerisRequestBuilder_;
                    serviceRequest.gpsEphemerisRequest_ = singleFieldBuilderV12 == null ? this.gpsEphemerisRequest_ : (GpsEphemerisProto.GPSEphemerisRequest) singleFieldBuilderV12.build();
                    i14 |= 4096;
                }
                if ((i15 & 8192) != 0) {
                    SingleFieldBuilderV3<FitnessSocialProto.FitnessSocialServiceRequest, FitnessSocialProto.FitnessSocialServiceRequest.Builder, FitnessSocialProto.FitnessSocialServiceRequestOrBuilder> singleFieldBuilderV13 = this.fitnessSocialServiceRequestBuilder_;
                    serviceRequest.fitnessSocialServiceRequest_ = singleFieldBuilderV13 == null ? this.fitnessSocialServiceRequest_ : (FitnessSocialProto.FitnessSocialServiceRequest) singleFieldBuilderV13.build();
                    i14 |= 8192;
                }
                if ((i15 & 16384) != 0) {
                    SingleFieldBuilderV3<EmergencyAssistanceProto.EmergencyAssistanceRequest, EmergencyAssistanceProto.EmergencyAssistanceRequest.Builder, EmergencyAssistanceProto.EmergencyAssistanceRequestOrBuilder> singleFieldBuilderV14 = this.emergencyAssistanceRequestBuilder_;
                    serviceRequest.emergencyAssistanceRequest_ = singleFieldBuilderV14 == null ? this.emergencyAssistanceRequest_ : (EmergencyAssistanceProto.EmergencyAssistanceRequest) singleFieldBuilderV14.build();
                    i14 |= 16384;
                }
                serviceRequest.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<Auth.AuthRequest, Auth.AuthRequest.Builder, Auth.AuthRequestOrBuilder> getAuthRequestFieldBuilder() {
                if (this.authRequestBuilder_ == null) {
                    this.authRequestBuilder_ = new SingleFieldBuilderV3<>(getAuthRequest(), getParentForChildren(), isClean());
                    this.authRequest_ = null;
                }
                return this.authRequestBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return RequestTypesProto.internal_static_CSM_Proto_Service_ServiceRequest_descriptor;
            }

            private SingleFieldBuilderV3<EmergencyAssistanceProto.EmergencyAssistanceRequest, EmergencyAssistanceProto.EmergencyAssistanceRequest.Builder, EmergencyAssistanceProto.EmergencyAssistanceRequestOrBuilder> getEmergencyAssistanceRequestFieldBuilder() {
                if (this.emergencyAssistanceRequestBuilder_ == null) {
                    this.emergencyAssistanceRequestBuilder_ = new SingleFieldBuilderV3<>(getEmergencyAssistanceRequest(), getParentForChildren(), isClean());
                    this.emergencyAssistanceRequest_ = null;
                }
                return this.emergencyAssistanceRequestBuilder_;
            }

            private SingleFieldBuilderV3<FitnessDeviceProto.FitnessDeviceServiceRequest, FitnessDeviceProto.FitnessDeviceServiceRequest.Builder, FitnessDeviceProto.FitnessDeviceServiceRequestOrBuilder> getFitnessDeviceServiceRequestFieldBuilder() {
                if (this.fitnessDeviceServiceRequestBuilder_ == null) {
                    this.fitnessDeviceServiceRequestBuilder_ = new SingleFieldBuilderV3<>(getFitnessDeviceServiceRequest(), getParentForChildren(), isClean());
                    this.fitnessDeviceServiceRequest_ = null;
                }
                return this.fitnessDeviceServiceRequestBuilder_;
            }

            private SingleFieldBuilderV3<FitnessProto.FitnessServiceRequest, FitnessProto.FitnessServiceRequest.Builder, FitnessProto.FitnessServiceRequestOrBuilder> getFitnessServiceRequestFieldBuilder() {
                if (this.fitnessServiceRequestBuilder_ == null) {
                    this.fitnessServiceRequestBuilder_ = new SingleFieldBuilderV3<>(getFitnessServiceRequest(), getParentForChildren(), isClean());
                    this.fitnessServiceRequest_ = null;
                }
                return this.fitnessServiceRequestBuilder_;
            }

            private SingleFieldBuilderV3<FitnessSocialProto.FitnessSocialServiceRequest, FitnessSocialProto.FitnessSocialServiceRequest.Builder, FitnessSocialProto.FitnessSocialServiceRequestOrBuilder> getFitnessSocialServiceRequestFieldBuilder() {
                if (this.fitnessSocialServiceRequestBuilder_ == null) {
                    this.fitnessSocialServiceRequestBuilder_ = new SingleFieldBuilderV3<>(getFitnessSocialServiceRequest(), getParentForChildren(), isClean());
                    this.fitnessSocialServiceRequest_ = null;
                }
                return this.fitnessSocialServiceRequestBuilder_;
            }

            private SingleFieldBuilderV3<FitnessTrackingProto.FitnessTrackingRequest, FitnessTrackingProto.FitnessTrackingRequest.Builder, FitnessTrackingProto.FitnessTrackingRequestOrBuilder> getFitnessTrackingRequestFieldBuilder() {
                if (this.fitnessTrackingRequestBuilder_ == null) {
                    this.fitnessTrackingRequestBuilder_ = new SingleFieldBuilderV3<>(getFitnessTrackingRequest(), getParentForChildren(), isClean());
                    this.fitnessTrackingRequest_ = null;
                }
                return this.fitnessTrackingRequestBuilder_;
            }

            private SingleFieldBuilderV3<GpsEphemerisProto.GPSEphemerisRequest, GpsEphemerisProto.GPSEphemerisRequest.Builder, GpsEphemerisProto.GPSEphemerisRequestOrBuilder> getGpsEphemerisRequestFieldBuilder() {
                if (this.gpsEphemerisRequestBuilder_ == null) {
                    this.gpsEphemerisRequestBuilder_ = new SingleFieldBuilderV3<>(getGpsEphemerisRequest(), getParentForChildren(), isClean());
                    this.gpsEphemerisRequest_ = null;
                }
                return this.gpsEphemerisRequestBuilder_;
            }

            private SingleFieldBuilderV3<GpsFixProto.GpsFixRequest, GpsFixProto.GpsFixRequest.Builder, GpsFixProto.GpsFixRequestOrBuilder> getGpsFixRequestFieldBuilder() {
                if (this.gpsFixRequestBuilder_ == null) {
                    this.gpsFixRequestBuilder_ = new SingleFieldBuilderV3<>(getGpsFixRequest(), getParentForChildren(), isClean());
                    this.gpsFixRequest_ = null;
                }
                return this.gpsFixRequestBuilder_;
            }

            private SingleFieldBuilderV3<Auth.MobileAppAuthRequest, Auth.MobileAppAuthRequest.Builder, Auth.MobileAppAuthRequestOrBuilder> getMobileAppAuthRequestFieldBuilder() {
                if (this.mobileAppAuthRequestBuilder_ == null) {
                    this.mobileAppAuthRequestBuilder_ = new SingleFieldBuilderV3<>(getMobileAppAuthRequest(), getParentForChildren(), isClean());
                    this.mobileAppAuthRequest_ = null;
                }
                return this.mobileAppAuthRequestBuilder_;
            }

            private SingleFieldBuilderV3<Auth.MobileAppStoreRequest, Auth.MobileAppStoreRequest.Builder, Auth.MobileAppStoreRequestOrBuilder> getMobileAppStoreRequestFieldBuilder() {
                if (this.mobileAppStoreRequestBuilder_ == null) {
                    this.mobileAppStoreRequestBuilder_ = new SingleFieldBuilderV3<>(getMobileAppStoreRequest(), getParentForChildren(), isClean());
                    this.mobileAppStoreRequest_ = null;
                }
                return this.mobileAppStoreRequestBuilder_;
            }

            private SingleFieldBuilderV3<TrackerProto.TrackerRequest, TrackerProto.TrackerRequest.Builder, TrackerProto.TrackerRequestOrBuilder> getTrackerRequestFieldBuilder() {
                if (this.trackerRequestBuilder_ == null) {
                    this.trackerRequestBuilder_ = new SingleFieldBuilderV3<>(getTrackerRequest(), getParentForChildren(), isClean());
                    this.trackerRequest_ = null;
                }
                return this.trackerRequestBuilder_;
            }

            private SingleFieldBuilderV3<WeatherProto.WeatherRequest, WeatherProto.WeatherRequest.Builder, WeatherProto.WeatherRequestOrBuilder> getWeatherRequestFieldBuilder() {
                if (this.weatherRequestBuilder_ == null) {
                    this.weatherRequestBuilder_ = new SingleFieldBuilderV3<>(getWeatherRequest(), getParentForChildren(), isClean());
                    this.weatherRequest_ = null;
                }
                return this.weatherRequestBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getWeatherRequestFieldBuilder();
                    getAuthRequestFieldBuilder();
                    getGpsFixRequestFieldBuilder();
                    getTrackerRequestFieldBuilder();
                    getMobileAppAuthRequestFieldBuilder();
                    getMobileAppStoreRequestFieldBuilder();
                    getFitnessTrackingRequestFieldBuilder();
                    getFitnessServiceRequestFieldBuilder();
                    getFitnessDeviceServiceRequestFieldBuilder();
                    getGpsEphemerisRequestFieldBuilder();
                    getFitnessSocialServiceRequestFieldBuilder();
                    getEmergencyAssistanceRequestFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ServiceRequest build() {
                ServiceRequest serviceRequestBuildPartial = buildPartial();
                if (serviceRequestBuildPartial.isInitialized()) {
                    return serviceRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) serviceRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ServiceRequest buildPartial() {
                ServiceRequest serviceRequest = new ServiceRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(serviceRequest);
                }
                onBuilt();
                return serviceRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.sequenceNum_ = 0;
                this.countryCode_ = "";
                this.removeMarkup_ = false;
                this.weatherRequest_ = null;
                SingleFieldBuilderV3<WeatherProto.WeatherRequest, WeatherProto.WeatherRequest.Builder, WeatherProto.WeatherRequestOrBuilder> singleFieldBuilderV3 = this.weatherRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.weatherRequestBuilder_ = null;
                }
                this.authRequest_ = null;
                SingleFieldBuilderV3<Auth.AuthRequest, Auth.AuthRequest.Builder, Auth.AuthRequestOrBuilder> singleFieldBuilderV4 = this.authRequestBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.authRequestBuilder_ = null;
                }
                this.gpsFixRequest_ = null;
                SingleFieldBuilderV3<GpsFixProto.GpsFixRequest, GpsFixProto.GpsFixRequest.Builder, GpsFixProto.GpsFixRequestOrBuilder> singleFieldBuilderV5 = this.gpsFixRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.gpsFixRequestBuilder_ = null;
                }
                this.trackerRequest_ = null;
                SingleFieldBuilderV3<TrackerProto.TrackerRequest, TrackerProto.TrackerRequest.Builder, TrackerProto.TrackerRequestOrBuilder> singleFieldBuilderV6 = this.trackerRequestBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.trackerRequestBuilder_ = null;
                }
                this.mobileAppAuthRequest_ = null;
                SingleFieldBuilderV3<Auth.MobileAppAuthRequest, Auth.MobileAppAuthRequest.Builder, Auth.MobileAppAuthRequestOrBuilder> singleFieldBuilderV7 = this.mobileAppAuthRequestBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.mobileAppAuthRequestBuilder_ = null;
                }
                this.mobileAppStoreRequest_ = null;
                SingleFieldBuilderV3<Auth.MobileAppStoreRequest, Auth.MobileAppStoreRequest.Builder, Auth.MobileAppStoreRequestOrBuilder> singleFieldBuilderV8 = this.mobileAppStoreRequestBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.mobileAppStoreRequestBuilder_ = null;
                }
                this.fitnessTrackingRequest_ = null;
                SingleFieldBuilderV3<FitnessTrackingProto.FitnessTrackingRequest, FitnessTrackingProto.FitnessTrackingRequest.Builder, FitnessTrackingProto.FitnessTrackingRequestOrBuilder> singleFieldBuilderV9 = this.fitnessTrackingRequestBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.fitnessTrackingRequestBuilder_ = null;
                }
                this.fitnessServiceRequest_ = null;
                SingleFieldBuilderV3<FitnessProto.FitnessServiceRequest, FitnessProto.FitnessServiceRequest.Builder, FitnessProto.FitnessServiceRequestOrBuilder> singleFieldBuilderV10 = this.fitnessServiceRequestBuilder_;
                if (singleFieldBuilderV10 != null) {
                    singleFieldBuilderV10.dispose();
                    this.fitnessServiceRequestBuilder_ = null;
                }
                this.fitnessDeviceServiceRequest_ = null;
                SingleFieldBuilderV3<FitnessDeviceProto.FitnessDeviceServiceRequest, FitnessDeviceProto.FitnessDeviceServiceRequest.Builder, FitnessDeviceProto.FitnessDeviceServiceRequestOrBuilder> singleFieldBuilderV11 = this.fitnessDeviceServiceRequestBuilder_;
                if (singleFieldBuilderV11 != null) {
                    singleFieldBuilderV11.dispose();
                    this.fitnessDeviceServiceRequestBuilder_ = null;
                }
                this.gpsEphemerisRequest_ = null;
                SingleFieldBuilderV3<GpsEphemerisProto.GPSEphemerisRequest, GpsEphemerisProto.GPSEphemerisRequest.Builder, GpsEphemerisProto.GPSEphemerisRequestOrBuilder> singleFieldBuilderV12 = this.gpsEphemerisRequestBuilder_;
                if (singleFieldBuilderV12 != null) {
                    singleFieldBuilderV12.dispose();
                    this.gpsEphemerisRequestBuilder_ = null;
                }
                this.fitnessSocialServiceRequest_ = null;
                SingleFieldBuilderV3<FitnessSocialProto.FitnessSocialServiceRequest, FitnessSocialProto.FitnessSocialServiceRequest.Builder, FitnessSocialProto.FitnessSocialServiceRequestOrBuilder> singleFieldBuilderV13 = this.fitnessSocialServiceRequestBuilder_;
                if (singleFieldBuilderV13 != null) {
                    singleFieldBuilderV13.dispose();
                    this.fitnessSocialServiceRequestBuilder_ = null;
                }
                this.emergencyAssistanceRequest_ = null;
                SingleFieldBuilderV3<EmergencyAssistanceProto.EmergencyAssistanceRequest, EmergencyAssistanceProto.EmergencyAssistanceRequest.Builder, EmergencyAssistanceProto.EmergencyAssistanceRequestOrBuilder> singleFieldBuilderV14 = this.emergencyAssistanceRequestBuilder_;
                if (singleFieldBuilderV14 != null) {
                    singleFieldBuilderV14.dispose();
                    this.emergencyAssistanceRequestBuilder_ = null;
                }
                return this;
            }

            public Builder clearAuthRequest() {
                this.bitField0_ &= -17;
                this.authRequest_ = null;
                SingleFieldBuilderV3<Auth.AuthRequest, Auth.AuthRequest.Builder, Auth.AuthRequestOrBuilder> singleFieldBuilderV3 = this.authRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.authRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearCountryCode() {
                this.countryCode_ = ServiceRequest.getDefaultInstance().getCountryCode();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearEmergencyAssistanceRequest() {
                this.bitField0_ &= -16385;
                this.emergencyAssistanceRequest_ = null;
                SingleFieldBuilderV3<EmergencyAssistanceProto.EmergencyAssistanceRequest, EmergencyAssistanceProto.EmergencyAssistanceRequest.Builder, EmergencyAssistanceProto.EmergencyAssistanceRequestOrBuilder> singleFieldBuilderV3 = this.emergencyAssistanceRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.emergencyAssistanceRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearFitnessDeviceServiceRequest() {
                this.bitField0_ &= -2049;
                this.fitnessDeviceServiceRequest_ = null;
                SingleFieldBuilderV3<FitnessDeviceProto.FitnessDeviceServiceRequest, FitnessDeviceProto.FitnessDeviceServiceRequest.Builder, FitnessDeviceProto.FitnessDeviceServiceRequestOrBuilder> singleFieldBuilderV3 = this.fitnessDeviceServiceRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.fitnessDeviceServiceRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearFitnessServiceRequest() {
                this.bitField0_ &= -1025;
                this.fitnessServiceRequest_ = null;
                SingleFieldBuilderV3<FitnessProto.FitnessServiceRequest, FitnessProto.FitnessServiceRequest.Builder, FitnessProto.FitnessServiceRequestOrBuilder> singleFieldBuilderV3 = this.fitnessServiceRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.fitnessServiceRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearFitnessSocialServiceRequest() {
                this.bitField0_ &= -8193;
                this.fitnessSocialServiceRequest_ = null;
                SingleFieldBuilderV3<FitnessSocialProto.FitnessSocialServiceRequest, FitnessSocialProto.FitnessSocialServiceRequest.Builder, FitnessSocialProto.FitnessSocialServiceRequestOrBuilder> singleFieldBuilderV3 = this.fitnessSocialServiceRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.fitnessSocialServiceRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearFitnessTrackingRequest() {
                this.bitField0_ &= -513;
                this.fitnessTrackingRequest_ = null;
                SingleFieldBuilderV3<FitnessTrackingProto.FitnessTrackingRequest, FitnessTrackingProto.FitnessTrackingRequest.Builder, FitnessTrackingProto.FitnessTrackingRequestOrBuilder> singleFieldBuilderV3 = this.fitnessTrackingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.fitnessTrackingRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearGpsEphemerisRequest() {
                this.bitField0_ &= -4097;
                this.gpsEphemerisRequest_ = null;
                SingleFieldBuilderV3<GpsEphemerisProto.GPSEphemerisRequest, GpsEphemerisProto.GPSEphemerisRequest.Builder, GpsEphemerisProto.GPSEphemerisRequestOrBuilder> singleFieldBuilderV3 = this.gpsEphemerisRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.gpsEphemerisRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearGpsFixRequest() {
                this.bitField0_ &= -33;
                this.gpsFixRequest_ = null;
                SingleFieldBuilderV3<GpsFixProto.GpsFixRequest, GpsFixProto.GpsFixRequest.Builder, GpsFixProto.GpsFixRequestOrBuilder> singleFieldBuilderV3 = this.gpsFixRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.gpsFixRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearMobileAppAuthRequest() {
                this.bitField0_ &= -129;
                this.mobileAppAuthRequest_ = null;
                SingleFieldBuilderV3<Auth.MobileAppAuthRequest, Auth.MobileAppAuthRequest.Builder, Auth.MobileAppAuthRequestOrBuilder> singleFieldBuilderV3 = this.mobileAppAuthRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.mobileAppAuthRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearMobileAppStoreRequest() {
                this.bitField0_ &= -257;
                this.mobileAppStoreRequest_ = null;
                SingleFieldBuilderV3<Auth.MobileAppStoreRequest, Auth.MobileAppStoreRequest.Builder, Auth.MobileAppStoreRequestOrBuilder> singleFieldBuilderV3 = this.mobileAppStoreRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.mobileAppStoreRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearRemoveMarkup() {
                this.bitField0_ &= -5;
                this.removeMarkup_ = false;
                onChanged();
                return this;
            }

            public Builder clearSequenceNum() {
                this.bitField0_ &= -2;
                this.sequenceNum_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTrackerRequest() {
                this.bitField0_ &= -65;
                this.trackerRequest_ = null;
                SingleFieldBuilderV3<TrackerProto.TrackerRequest, TrackerProto.TrackerRequest.Builder, TrackerProto.TrackerRequestOrBuilder> singleFieldBuilderV3 = this.trackerRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.trackerRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearWeatherRequest() {
                this.bitField0_ &= -9;
                this.weatherRequest_ = null;
                SingleFieldBuilderV3<WeatherProto.WeatherRequest, WeatherProto.WeatherRequest.Builder, WeatherProto.WeatherRequestOrBuilder> singleFieldBuilderV3 = this.weatherRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.weatherRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public Auth.AuthRequest getAuthRequest() {
                SingleFieldBuilderV3<Auth.AuthRequest, Auth.AuthRequest.Builder, Auth.AuthRequestOrBuilder> singleFieldBuilderV3 = this.authRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Auth.AuthRequest) singleFieldBuilderV3.getMessage();
                }
                Auth.AuthRequest authRequest = this.authRequest_;
                return authRequest == null ? Auth.AuthRequest.getDefaultInstance() : authRequest;
            }

            public Auth.AuthRequest.Builder getAuthRequestBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (Auth.AuthRequest.Builder) getAuthRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public Auth.AuthRequestOrBuilder getAuthRequestOrBuilder() {
                SingleFieldBuilderV3<Auth.AuthRequest, Auth.AuthRequest.Builder, Auth.AuthRequestOrBuilder> singleFieldBuilderV3 = this.authRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Auth.AuthRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Auth.AuthRequest authRequest = this.authRequest_;
                return authRequest == null ? Auth.AuthRequest.getDefaultInstance() : authRequest;
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public String getCountryCode() {
                Object obj = this.countryCode_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.countryCode_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public ByteString getCountryCodeBytes() {
                Object obj = this.countryCode_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.countryCode_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return RequestTypesProto.internal_static_CSM_Proto_Service_ServiceRequest_descriptor;
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public EmergencyAssistanceProto.EmergencyAssistanceRequest getEmergencyAssistanceRequest() {
                SingleFieldBuilderV3<EmergencyAssistanceProto.EmergencyAssistanceRequest, EmergencyAssistanceProto.EmergencyAssistanceRequest.Builder, EmergencyAssistanceProto.EmergencyAssistanceRequestOrBuilder> singleFieldBuilderV3 = this.emergencyAssistanceRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EmergencyAssistanceProto.EmergencyAssistanceRequest) singleFieldBuilderV3.getMessage();
                }
                EmergencyAssistanceProto.EmergencyAssistanceRequest emergencyAssistanceRequest = this.emergencyAssistanceRequest_;
                return emergencyAssistanceRequest == null ? EmergencyAssistanceProto.EmergencyAssistanceRequest.getDefaultInstance() : emergencyAssistanceRequest;
            }

            public EmergencyAssistanceProto.EmergencyAssistanceRequest.Builder getEmergencyAssistanceRequestBuilder() {
                this.bitField0_ |= 16384;
                onChanged();
                return (EmergencyAssistanceProto.EmergencyAssistanceRequest.Builder) getEmergencyAssistanceRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public EmergencyAssistanceProto.EmergencyAssistanceRequestOrBuilder getEmergencyAssistanceRequestOrBuilder() {
                SingleFieldBuilderV3<EmergencyAssistanceProto.EmergencyAssistanceRequest, EmergencyAssistanceProto.EmergencyAssistanceRequest.Builder, EmergencyAssistanceProto.EmergencyAssistanceRequestOrBuilder> singleFieldBuilderV3 = this.emergencyAssistanceRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EmergencyAssistanceProto.EmergencyAssistanceRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                EmergencyAssistanceProto.EmergencyAssistanceRequest emergencyAssistanceRequest = this.emergencyAssistanceRequest_;
                return emergencyAssistanceRequest == null ? EmergencyAssistanceProto.EmergencyAssistanceRequest.getDefaultInstance() : emergencyAssistanceRequest;
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public FitnessDeviceProto.FitnessDeviceServiceRequest getFitnessDeviceServiceRequest() {
                SingleFieldBuilderV3<FitnessDeviceProto.FitnessDeviceServiceRequest, FitnessDeviceProto.FitnessDeviceServiceRequest.Builder, FitnessDeviceProto.FitnessDeviceServiceRequestOrBuilder> singleFieldBuilderV3 = this.fitnessDeviceServiceRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FitnessDeviceProto.FitnessDeviceServiceRequest) singleFieldBuilderV3.getMessage();
                }
                FitnessDeviceProto.FitnessDeviceServiceRequest fitnessDeviceServiceRequest = this.fitnessDeviceServiceRequest_;
                return fitnessDeviceServiceRequest == null ? FitnessDeviceProto.FitnessDeviceServiceRequest.getDefaultInstance() : fitnessDeviceServiceRequest;
            }

            public FitnessDeviceProto.FitnessDeviceServiceRequest.Builder getFitnessDeviceServiceRequestBuilder() {
                this.bitField0_ |= 2048;
                onChanged();
                return (FitnessDeviceProto.FitnessDeviceServiceRequest.Builder) getFitnessDeviceServiceRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public FitnessDeviceProto.FitnessDeviceServiceRequestOrBuilder getFitnessDeviceServiceRequestOrBuilder() {
                SingleFieldBuilderV3<FitnessDeviceProto.FitnessDeviceServiceRequest, FitnessDeviceProto.FitnessDeviceServiceRequest.Builder, FitnessDeviceProto.FitnessDeviceServiceRequestOrBuilder> singleFieldBuilderV3 = this.fitnessDeviceServiceRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FitnessDeviceProto.FitnessDeviceServiceRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                FitnessDeviceProto.FitnessDeviceServiceRequest fitnessDeviceServiceRequest = this.fitnessDeviceServiceRequest_;
                return fitnessDeviceServiceRequest == null ? FitnessDeviceProto.FitnessDeviceServiceRequest.getDefaultInstance() : fitnessDeviceServiceRequest;
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public FitnessProto.FitnessServiceRequest getFitnessServiceRequest() {
                SingleFieldBuilderV3<FitnessProto.FitnessServiceRequest, FitnessProto.FitnessServiceRequest.Builder, FitnessProto.FitnessServiceRequestOrBuilder> singleFieldBuilderV3 = this.fitnessServiceRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FitnessProto.FitnessServiceRequest) singleFieldBuilderV3.getMessage();
                }
                FitnessProto.FitnessServiceRequest fitnessServiceRequest = this.fitnessServiceRequest_;
                return fitnessServiceRequest == null ? FitnessProto.FitnessServiceRequest.getDefaultInstance() : fitnessServiceRequest;
            }

            public FitnessProto.FitnessServiceRequest.Builder getFitnessServiceRequestBuilder() {
                this.bitField0_ |= 1024;
                onChanged();
                return (FitnessProto.FitnessServiceRequest.Builder) getFitnessServiceRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public FitnessProto.FitnessServiceRequestOrBuilder getFitnessServiceRequestOrBuilder() {
                SingleFieldBuilderV3<FitnessProto.FitnessServiceRequest, FitnessProto.FitnessServiceRequest.Builder, FitnessProto.FitnessServiceRequestOrBuilder> singleFieldBuilderV3 = this.fitnessServiceRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FitnessProto.FitnessServiceRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                FitnessProto.FitnessServiceRequest fitnessServiceRequest = this.fitnessServiceRequest_;
                return fitnessServiceRequest == null ? FitnessProto.FitnessServiceRequest.getDefaultInstance() : fitnessServiceRequest;
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public FitnessSocialProto.FitnessSocialServiceRequest getFitnessSocialServiceRequest() {
                SingleFieldBuilderV3<FitnessSocialProto.FitnessSocialServiceRequest, FitnessSocialProto.FitnessSocialServiceRequest.Builder, FitnessSocialProto.FitnessSocialServiceRequestOrBuilder> singleFieldBuilderV3 = this.fitnessSocialServiceRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FitnessSocialProto.FitnessSocialServiceRequest) singleFieldBuilderV3.getMessage();
                }
                FitnessSocialProto.FitnessSocialServiceRequest fitnessSocialServiceRequest = this.fitnessSocialServiceRequest_;
                return fitnessSocialServiceRequest == null ? FitnessSocialProto.FitnessSocialServiceRequest.getDefaultInstance() : fitnessSocialServiceRequest;
            }

            public FitnessSocialProto.FitnessSocialServiceRequest.Builder getFitnessSocialServiceRequestBuilder() {
                this.bitField0_ |= 8192;
                onChanged();
                return (FitnessSocialProto.FitnessSocialServiceRequest.Builder) getFitnessSocialServiceRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public FitnessSocialProto.FitnessSocialServiceRequestOrBuilder getFitnessSocialServiceRequestOrBuilder() {
                SingleFieldBuilderV3<FitnessSocialProto.FitnessSocialServiceRequest, FitnessSocialProto.FitnessSocialServiceRequest.Builder, FitnessSocialProto.FitnessSocialServiceRequestOrBuilder> singleFieldBuilderV3 = this.fitnessSocialServiceRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FitnessSocialProto.FitnessSocialServiceRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                FitnessSocialProto.FitnessSocialServiceRequest fitnessSocialServiceRequest = this.fitnessSocialServiceRequest_;
                return fitnessSocialServiceRequest == null ? FitnessSocialProto.FitnessSocialServiceRequest.getDefaultInstance() : fitnessSocialServiceRequest;
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public FitnessTrackingProto.FitnessTrackingRequest getFitnessTrackingRequest() {
                SingleFieldBuilderV3<FitnessTrackingProto.FitnessTrackingRequest, FitnessTrackingProto.FitnessTrackingRequest.Builder, FitnessTrackingProto.FitnessTrackingRequestOrBuilder> singleFieldBuilderV3 = this.fitnessTrackingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FitnessTrackingProto.FitnessTrackingRequest) singleFieldBuilderV3.getMessage();
                }
                FitnessTrackingProto.FitnessTrackingRequest fitnessTrackingRequest = this.fitnessTrackingRequest_;
                return fitnessTrackingRequest == null ? FitnessTrackingProto.FitnessTrackingRequest.getDefaultInstance() : fitnessTrackingRequest;
            }

            public FitnessTrackingProto.FitnessTrackingRequest.Builder getFitnessTrackingRequestBuilder() {
                this.bitField0_ |= 512;
                onChanged();
                return (FitnessTrackingProto.FitnessTrackingRequest.Builder) getFitnessTrackingRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public FitnessTrackingProto.FitnessTrackingRequestOrBuilder getFitnessTrackingRequestOrBuilder() {
                SingleFieldBuilderV3<FitnessTrackingProto.FitnessTrackingRequest, FitnessTrackingProto.FitnessTrackingRequest.Builder, FitnessTrackingProto.FitnessTrackingRequestOrBuilder> singleFieldBuilderV3 = this.fitnessTrackingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FitnessTrackingProto.FitnessTrackingRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                FitnessTrackingProto.FitnessTrackingRequest fitnessTrackingRequest = this.fitnessTrackingRequest_;
                return fitnessTrackingRequest == null ? FitnessTrackingProto.FitnessTrackingRequest.getDefaultInstance() : fitnessTrackingRequest;
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public GpsEphemerisProto.GPSEphemerisRequest getGpsEphemerisRequest() {
                SingleFieldBuilderV3<GpsEphemerisProto.GPSEphemerisRequest, GpsEphemerisProto.GPSEphemerisRequest.Builder, GpsEphemerisProto.GPSEphemerisRequestOrBuilder> singleFieldBuilderV3 = this.gpsEphemerisRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GpsEphemerisProto.GPSEphemerisRequest) singleFieldBuilderV3.getMessage();
                }
                GpsEphemerisProto.GPSEphemerisRequest gPSEphemerisRequest = this.gpsEphemerisRequest_;
                return gPSEphemerisRequest == null ? GpsEphemerisProto.GPSEphemerisRequest.getDefaultInstance() : gPSEphemerisRequest;
            }

            public GpsEphemerisProto.GPSEphemerisRequest.Builder getGpsEphemerisRequestBuilder() {
                this.bitField0_ |= 4096;
                onChanged();
                return (GpsEphemerisProto.GPSEphemerisRequest.Builder) getGpsEphemerisRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public GpsEphemerisProto.GPSEphemerisRequestOrBuilder getGpsEphemerisRequestOrBuilder() {
                SingleFieldBuilderV3<GpsEphemerisProto.GPSEphemerisRequest, GpsEphemerisProto.GPSEphemerisRequest.Builder, GpsEphemerisProto.GPSEphemerisRequestOrBuilder> singleFieldBuilderV3 = this.gpsEphemerisRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GpsEphemerisProto.GPSEphemerisRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GpsEphemerisProto.GPSEphemerisRequest gPSEphemerisRequest = this.gpsEphemerisRequest_;
                return gPSEphemerisRequest == null ? GpsEphemerisProto.GPSEphemerisRequest.getDefaultInstance() : gPSEphemerisRequest;
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public GpsFixProto.GpsFixRequest getGpsFixRequest() {
                SingleFieldBuilderV3<GpsFixProto.GpsFixRequest, GpsFixProto.GpsFixRequest.Builder, GpsFixProto.GpsFixRequestOrBuilder> singleFieldBuilderV3 = this.gpsFixRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GpsFixProto.GpsFixRequest) singleFieldBuilderV3.getMessage();
                }
                GpsFixProto.GpsFixRequest gpsFixRequest = this.gpsFixRequest_;
                return gpsFixRequest == null ? GpsFixProto.GpsFixRequest.getDefaultInstance() : gpsFixRequest;
            }

            public GpsFixProto.GpsFixRequest.Builder getGpsFixRequestBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (GpsFixProto.GpsFixRequest.Builder) getGpsFixRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public GpsFixProto.GpsFixRequestOrBuilder getGpsFixRequestOrBuilder() {
                SingleFieldBuilderV3<GpsFixProto.GpsFixRequest, GpsFixProto.GpsFixRequest.Builder, GpsFixProto.GpsFixRequestOrBuilder> singleFieldBuilderV3 = this.gpsFixRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GpsFixProto.GpsFixRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GpsFixProto.GpsFixRequest gpsFixRequest = this.gpsFixRequest_;
                return gpsFixRequest == null ? GpsFixProto.GpsFixRequest.getDefaultInstance() : gpsFixRequest;
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public Auth.MobileAppAuthRequest getMobileAppAuthRequest() {
                SingleFieldBuilderV3<Auth.MobileAppAuthRequest, Auth.MobileAppAuthRequest.Builder, Auth.MobileAppAuthRequestOrBuilder> singleFieldBuilderV3 = this.mobileAppAuthRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Auth.MobileAppAuthRequest) singleFieldBuilderV3.getMessage();
                }
                Auth.MobileAppAuthRequest mobileAppAuthRequest = this.mobileAppAuthRequest_;
                return mobileAppAuthRequest == null ? Auth.MobileAppAuthRequest.getDefaultInstance() : mobileAppAuthRequest;
            }

            public Auth.MobileAppAuthRequest.Builder getMobileAppAuthRequestBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (Auth.MobileAppAuthRequest.Builder) getMobileAppAuthRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public Auth.MobileAppAuthRequestOrBuilder getMobileAppAuthRequestOrBuilder() {
                SingleFieldBuilderV3<Auth.MobileAppAuthRequest, Auth.MobileAppAuthRequest.Builder, Auth.MobileAppAuthRequestOrBuilder> singleFieldBuilderV3 = this.mobileAppAuthRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Auth.MobileAppAuthRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Auth.MobileAppAuthRequest mobileAppAuthRequest = this.mobileAppAuthRequest_;
                return mobileAppAuthRequest == null ? Auth.MobileAppAuthRequest.getDefaultInstance() : mobileAppAuthRequest;
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public Auth.MobileAppStoreRequest getMobileAppStoreRequest() {
                SingleFieldBuilderV3<Auth.MobileAppStoreRequest, Auth.MobileAppStoreRequest.Builder, Auth.MobileAppStoreRequestOrBuilder> singleFieldBuilderV3 = this.mobileAppStoreRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Auth.MobileAppStoreRequest) singleFieldBuilderV3.getMessage();
                }
                Auth.MobileAppStoreRequest mobileAppStoreRequest = this.mobileAppStoreRequest_;
                return mobileAppStoreRequest == null ? Auth.MobileAppStoreRequest.getDefaultInstance() : mobileAppStoreRequest;
            }

            public Auth.MobileAppStoreRequest.Builder getMobileAppStoreRequestBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (Auth.MobileAppStoreRequest.Builder) getMobileAppStoreRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public Auth.MobileAppStoreRequestOrBuilder getMobileAppStoreRequestOrBuilder() {
                SingleFieldBuilderV3<Auth.MobileAppStoreRequest, Auth.MobileAppStoreRequest.Builder, Auth.MobileAppStoreRequestOrBuilder> singleFieldBuilderV3 = this.mobileAppStoreRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Auth.MobileAppStoreRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Auth.MobileAppStoreRequest mobileAppStoreRequest = this.mobileAppStoreRequest_;
                return mobileAppStoreRequest == null ? Auth.MobileAppStoreRequest.getDefaultInstance() : mobileAppStoreRequest;
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public boolean getRemoveMarkup() {
                return this.removeMarkup_;
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public int getSequenceNum() {
                return this.sequenceNum_;
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public TrackerProto.TrackerRequest getTrackerRequest() {
                SingleFieldBuilderV3<TrackerProto.TrackerRequest, TrackerProto.TrackerRequest.Builder, TrackerProto.TrackerRequestOrBuilder> singleFieldBuilderV3 = this.trackerRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrackerProto.TrackerRequest) singleFieldBuilderV3.getMessage();
                }
                TrackerProto.TrackerRequest trackerRequest = this.trackerRequest_;
                return trackerRequest == null ? TrackerProto.TrackerRequest.getDefaultInstance() : trackerRequest;
            }

            public TrackerProto.TrackerRequest.Builder getTrackerRequestBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (TrackerProto.TrackerRequest.Builder) getTrackerRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public TrackerProto.TrackerRequestOrBuilder getTrackerRequestOrBuilder() {
                SingleFieldBuilderV3<TrackerProto.TrackerRequest, TrackerProto.TrackerRequest.Builder, TrackerProto.TrackerRequestOrBuilder> singleFieldBuilderV3 = this.trackerRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrackerProto.TrackerRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TrackerProto.TrackerRequest trackerRequest = this.trackerRequest_;
                return trackerRequest == null ? TrackerProto.TrackerRequest.getDefaultInstance() : trackerRequest;
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public WeatherProto.WeatherRequest getWeatherRequest() {
                SingleFieldBuilderV3<WeatherProto.WeatherRequest, WeatherProto.WeatherRequest.Builder, WeatherProto.WeatherRequestOrBuilder> singleFieldBuilderV3 = this.weatherRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WeatherProto.WeatherRequest) singleFieldBuilderV3.getMessage();
                }
                WeatherProto.WeatherRequest weatherRequest = this.weatherRequest_;
                return weatherRequest == null ? WeatherProto.WeatherRequest.getDefaultInstance() : weatherRequest;
            }

            public WeatherProto.WeatherRequest.Builder getWeatherRequestBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (WeatherProto.WeatherRequest.Builder) getWeatherRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public WeatherProto.WeatherRequestOrBuilder getWeatherRequestOrBuilder() {
                SingleFieldBuilderV3<WeatherProto.WeatherRequest, WeatherProto.WeatherRequest.Builder, WeatherProto.WeatherRequestOrBuilder> singleFieldBuilderV3 = this.weatherRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WeatherProto.WeatherRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                WeatherProto.WeatherRequest weatherRequest = this.weatherRequest_;
                return weatherRequest == null ? WeatherProto.WeatherRequest.getDefaultInstance() : weatherRequest;
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public boolean hasAuthRequest() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public boolean hasCountryCode() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public boolean hasEmergencyAssistanceRequest() {
                return (this.bitField0_ & 16384) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public boolean hasFitnessDeviceServiceRequest() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public boolean hasFitnessServiceRequest() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public boolean hasFitnessSocialServiceRequest() {
                return (this.bitField0_ & 8192) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public boolean hasFitnessTrackingRequest() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public boolean hasGpsEphemerisRequest() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public boolean hasGpsFixRequest() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public boolean hasMobileAppAuthRequest() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public boolean hasMobileAppStoreRequest() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public boolean hasRemoveMarkup() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public boolean hasSequenceNum() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public boolean hasTrackerRequest() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.ServiceRequestOrBuilder
            public boolean hasWeatherRequest() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return RequestTypesProto.internal_static_CSM_Proto_Service_ServiceRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ServiceRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasWeatherRequest() && !getWeatherRequest().isInitialized()) {
                    return false;
                }
                if (hasAuthRequest() && !getAuthRequest().isInitialized()) {
                    return false;
                }
                if (hasTrackerRequest() && !getTrackerRequest().isInitialized()) {
                    return false;
                }
                if (hasMobileAppAuthRequest() && !getMobileAppAuthRequest().isInitialized()) {
                    return false;
                }
                if (hasMobileAppStoreRequest() && !getMobileAppStoreRequest().isInitialized()) {
                    return false;
                }
                if (hasFitnessTrackingRequest() && !getFitnessTrackingRequest().isInitialized()) {
                    return false;
                }
                if (hasFitnessServiceRequest() && !getFitnessServiceRequest().isInitialized()) {
                    return false;
                }
                if (hasFitnessDeviceServiceRequest() && !getFitnessDeviceServiceRequest().isInitialized()) {
                    return false;
                }
                if (!hasFitnessSocialServiceRequest() || getFitnessSocialServiceRequest().isInitialized()) {
                    return !hasEmergencyAssistanceRequest() || getEmergencyAssistanceRequest().isInitialized();
                }
                return false;
            }

            public Builder mergeAuthRequest(Auth.AuthRequest authRequest) {
                Auth.AuthRequest authRequest2;
                SingleFieldBuilderV3<Auth.AuthRequest, Auth.AuthRequest.Builder, Auth.AuthRequestOrBuilder> singleFieldBuilderV3 = this.authRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(authRequest);
                } else if ((this.bitField0_ & 16) == 0 || (authRequest2 = this.authRequest_) == null || authRequest2 == Auth.AuthRequest.getDefaultInstance()) {
                    this.authRequest_ = authRequest;
                } else {
                    getAuthRequestBuilder().mergeFrom(authRequest);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder mergeEmergencyAssistanceRequest(EmergencyAssistanceProto.EmergencyAssistanceRequest emergencyAssistanceRequest) {
                EmergencyAssistanceProto.EmergencyAssistanceRequest emergencyAssistanceRequest2;
                SingleFieldBuilderV3<EmergencyAssistanceProto.EmergencyAssistanceRequest, EmergencyAssistanceProto.EmergencyAssistanceRequest.Builder, EmergencyAssistanceProto.EmergencyAssistanceRequestOrBuilder> singleFieldBuilderV3 = this.emergencyAssistanceRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(emergencyAssistanceRequest);
                } else if ((this.bitField0_ & 16384) == 0 || (emergencyAssistanceRequest2 = this.emergencyAssistanceRequest_) == null || emergencyAssistanceRequest2 == EmergencyAssistanceProto.EmergencyAssistanceRequest.getDefaultInstance()) {
                    this.emergencyAssistanceRequest_ = emergencyAssistanceRequest;
                } else {
                    getEmergencyAssistanceRequestBuilder().mergeFrom(emergencyAssistanceRequest);
                }
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder mergeFitnessDeviceServiceRequest(FitnessDeviceProto.FitnessDeviceServiceRequest fitnessDeviceServiceRequest) {
                FitnessDeviceProto.FitnessDeviceServiceRequest fitnessDeviceServiceRequest2;
                SingleFieldBuilderV3<FitnessDeviceProto.FitnessDeviceServiceRequest, FitnessDeviceProto.FitnessDeviceServiceRequest.Builder, FitnessDeviceProto.FitnessDeviceServiceRequestOrBuilder> singleFieldBuilderV3 = this.fitnessDeviceServiceRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(fitnessDeviceServiceRequest);
                } else if ((this.bitField0_ & 2048) == 0 || (fitnessDeviceServiceRequest2 = this.fitnessDeviceServiceRequest_) == null || fitnessDeviceServiceRequest2 == FitnessDeviceProto.FitnessDeviceServiceRequest.getDefaultInstance()) {
                    this.fitnessDeviceServiceRequest_ = fitnessDeviceServiceRequest;
                } else {
                    getFitnessDeviceServiceRequestBuilder().mergeFrom(fitnessDeviceServiceRequest);
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder mergeFitnessServiceRequest(FitnessProto.FitnessServiceRequest fitnessServiceRequest) {
                FitnessProto.FitnessServiceRequest fitnessServiceRequest2;
                SingleFieldBuilderV3<FitnessProto.FitnessServiceRequest, FitnessProto.FitnessServiceRequest.Builder, FitnessProto.FitnessServiceRequestOrBuilder> singleFieldBuilderV3 = this.fitnessServiceRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(fitnessServiceRequest);
                } else if ((this.bitField0_ & 1024) == 0 || (fitnessServiceRequest2 = this.fitnessServiceRequest_) == null || fitnessServiceRequest2 == FitnessProto.FitnessServiceRequest.getDefaultInstance()) {
                    this.fitnessServiceRequest_ = fitnessServiceRequest;
                } else {
                    getFitnessServiceRequestBuilder().mergeFrom(fitnessServiceRequest);
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder mergeFitnessSocialServiceRequest(FitnessSocialProto.FitnessSocialServiceRequest fitnessSocialServiceRequest) {
                FitnessSocialProto.FitnessSocialServiceRequest fitnessSocialServiceRequest2;
                SingleFieldBuilderV3<FitnessSocialProto.FitnessSocialServiceRequest, FitnessSocialProto.FitnessSocialServiceRequest.Builder, FitnessSocialProto.FitnessSocialServiceRequestOrBuilder> singleFieldBuilderV3 = this.fitnessSocialServiceRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(fitnessSocialServiceRequest);
                } else if ((this.bitField0_ & 8192) == 0 || (fitnessSocialServiceRequest2 = this.fitnessSocialServiceRequest_) == null || fitnessSocialServiceRequest2 == FitnessSocialProto.FitnessSocialServiceRequest.getDefaultInstance()) {
                    this.fitnessSocialServiceRequest_ = fitnessSocialServiceRequest;
                } else {
                    getFitnessSocialServiceRequestBuilder().mergeFrom(fitnessSocialServiceRequest);
                }
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder mergeFitnessTrackingRequest(FitnessTrackingProto.FitnessTrackingRequest fitnessTrackingRequest) {
                FitnessTrackingProto.FitnessTrackingRequest fitnessTrackingRequest2;
                SingleFieldBuilderV3<FitnessTrackingProto.FitnessTrackingRequest, FitnessTrackingProto.FitnessTrackingRequest.Builder, FitnessTrackingProto.FitnessTrackingRequestOrBuilder> singleFieldBuilderV3 = this.fitnessTrackingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(fitnessTrackingRequest);
                } else if ((this.bitField0_ & 512) == 0 || (fitnessTrackingRequest2 = this.fitnessTrackingRequest_) == null || fitnessTrackingRequest2 == FitnessTrackingProto.FitnessTrackingRequest.getDefaultInstance()) {
                    this.fitnessTrackingRequest_ = fitnessTrackingRequest;
                } else {
                    getFitnessTrackingRequestBuilder().mergeFrom(fitnessTrackingRequest);
                }
                this.bitField0_ |= 512;
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
                                case 8:
                                    this.sequenceNum_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                    continue;
                                case 18:
                                    this.countryCode_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                    continue;
                                case 24:
                                    this.removeMarkup_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4;
                                    continue;
                                case 242:
                                    codedInputStream.readMessage(getWeatherRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                    continue;
                                case 378:
                                    codedInputStream.readMessage(getAuthRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                    continue;
                                case 562:
                                    codedInputStream.readMessage(getGpsFixRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                    continue;
                                case 578:
                                    codedInputStream.readMessage(getTrackerRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                    continue;
                                case 642:
                                    codedInputStream.readMessage(getMobileAppAuthRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
                                    continue;
                                case 650:
                                    codedInputStream.readMessage(getMobileAppStoreRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 256;
                                    continue;
                                case 658:
                                    codedInputStream.readMessage(getFitnessTrackingRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 512;
                                    continue;
                                case 698:
                                    codedInputStream.readMessage(getFitnessServiceRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 802:
                                    codedInputStream.readMessage(getFitnessDeviceServiceRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2048;
                                    continue;
                                case 810:
                                    codedInputStream.readMessage(getGpsEphemerisRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4096;
                                    continue;
                                case 818:
                                    codedInputStream.readMessage(getFitnessSocialServiceRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8192;
                                    continue;
                                case 978:
                                    codedInputStream.readMessage(getEmergencyAssistanceRequestFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeGpsEphemerisRequest(GpsEphemerisProto.GPSEphemerisRequest gPSEphemerisRequest) {
                GpsEphemerisProto.GPSEphemerisRequest gPSEphemerisRequest2;
                SingleFieldBuilderV3<GpsEphemerisProto.GPSEphemerisRequest, GpsEphemerisProto.GPSEphemerisRequest.Builder, GpsEphemerisProto.GPSEphemerisRequestOrBuilder> singleFieldBuilderV3 = this.gpsEphemerisRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(gPSEphemerisRequest);
                } else if ((this.bitField0_ & 4096) == 0 || (gPSEphemerisRequest2 = this.gpsEphemerisRequest_) == null || gPSEphemerisRequest2 == GpsEphemerisProto.GPSEphemerisRequest.getDefaultInstance()) {
                    this.gpsEphemerisRequest_ = gPSEphemerisRequest;
                } else {
                    getGpsEphemerisRequestBuilder().mergeFrom(gPSEphemerisRequest);
                }
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder mergeGpsFixRequest(GpsFixProto.GpsFixRequest gpsFixRequest) {
                GpsFixProto.GpsFixRequest gpsFixRequest2;
                SingleFieldBuilderV3<GpsFixProto.GpsFixRequest, GpsFixProto.GpsFixRequest.Builder, GpsFixProto.GpsFixRequestOrBuilder> singleFieldBuilderV3 = this.gpsFixRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(gpsFixRequest);
                } else if ((this.bitField0_ & 32) == 0 || (gpsFixRequest2 = this.gpsFixRequest_) == null || gpsFixRequest2 == GpsFixProto.GpsFixRequest.getDefaultInstance()) {
                    this.gpsFixRequest_ = gpsFixRequest;
                } else {
                    getGpsFixRequestBuilder().mergeFrom(gpsFixRequest);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder mergeMobileAppAuthRequest(Auth.MobileAppAuthRequest mobileAppAuthRequest) {
                Auth.MobileAppAuthRequest mobileAppAuthRequest2;
                SingleFieldBuilderV3<Auth.MobileAppAuthRequest, Auth.MobileAppAuthRequest.Builder, Auth.MobileAppAuthRequestOrBuilder> singleFieldBuilderV3 = this.mobileAppAuthRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(mobileAppAuthRequest);
                } else if ((this.bitField0_ & 128) == 0 || (mobileAppAuthRequest2 = this.mobileAppAuthRequest_) == null || mobileAppAuthRequest2 == Auth.MobileAppAuthRequest.getDefaultInstance()) {
                    this.mobileAppAuthRequest_ = mobileAppAuthRequest;
                } else {
                    getMobileAppAuthRequestBuilder().mergeFrom(mobileAppAuthRequest);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder mergeMobileAppStoreRequest(Auth.MobileAppStoreRequest mobileAppStoreRequest) {
                Auth.MobileAppStoreRequest mobileAppStoreRequest2;
                SingleFieldBuilderV3<Auth.MobileAppStoreRequest, Auth.MobileAppStoreRequest.Builder, Auth.MobileAppStoreRequestOrBuilder> singleFieldBuilderV3 = this.mobileAppStoreRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(mobileAppStoreRequest);
                } else if ((this.bitField0_ & 256) == 0 || (mobileAppStoreRequest2 = this.mobileAppStoreRequest_) == null || mobileAppStoreRequest2 == Auth.MobileAppStoreRequest.getDefaultInstance()) {
                    this.mobileAppStoreRequest_ = mobileAppStoreRequest;
                } else {
                    getMobileAppStoreRequestBuilder().mergeFrom(mobileAppStoreRequest);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder mergeTrackerRequest(TrackerProto.TrackerRequest trackerRequest) {
                TrackerProto.TrackerRequest trackerRequest2;
                SingleFieldBuilderV3<TrackerProto.TrackerRequest, TrackerProto.TrackerRequest.Builder, TrackerProto.TrackerRequestOrBuilder> singleFieldBuilderV3 = this.trackerRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(trackerRequest);
                } else if ((this.bitField0_ & 64) == 0 || (trackerRequest2 = this.trackerRequest_) == null || trackerRequest2 == TrackerProto.TrackerRequest.getDefaultInstance()) {
                    this.trackerRequest_ = trackerRequest;
                } else {
                    getTrackerRequestBuilder().mergeFrom(trackerRequest);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder mergeWeatherRequest(WeatherProto.WeatherRequest weatherRequest) {
                WeatherProto.WeatherRequest weatherRequest2;
                SingleFieldBuilderV3<WeatherProto.WeatherRequest, WeatherProto.WeatherRequest.Builder, WeatherProto.WeatherRequestOrBuilder> singleFieldBuilderV3 = this.weatherRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(weatherRequest);
                } else if ((this.bitField0_ & 8) == 0 || (weatherRequest2 = this.weatherRequest_) == null || weatherRequest2 == WeatherProto.WeatherRequest.getDefaultInstance()) {
                    this.weatherRequest_ = weatherRequest;
                } else {
                    getWeatherRequestBuilder().mergeFrom(weatherRequest);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setAuthRequest(Auth.AuthRequest.Builder builder) {
                SingleFieldBuilderV3<Auth.AuthRequest, Auth.AuthRequest.Builder, Auth.AuthRequestOrBuilder> singleFieldBuilderV3 = this.authRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.authRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setCountryCode(String str) {
                str.getClass();
                this.countryCode_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setCountryCodeBytes(ByteString byteString) {
                byteString.getClass();
                this.countryCode_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setEmergencyAssistanceRequest(EmergencyAssistanceProto.EmergencyAssistanceRequest.Builder builder) {
                SingleFieldBuilderV3<EmergencyAssistanceProto.EmergencyAssistanceRequest, EmergencyAssistanceProto.EmergencyAssistanceRequest.Builder, EmergencyAssistanceProto.EmergencyAssistanceRequestOrBuilder> singleFieldBuilderV3 = this.emergencyAssistanceRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.emergencyAssistanceRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setFitnessDeviceServiceRequest(FitnessDeviceProto.FitnessDeviceServiceRequest.Builder builder) {
                SingleFieldBuilderV3<FitnessDeviceProto.FitnessDeviceServiceRequest, FitnessDeviceProto.FitnessDeviceServiceRequest.Builder, FitnessDeviceProto.FitnessDeviceServiceRequestOrBuilder> singleFieldBuilderV3 = this.fitnessDeviceServiceRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.fitnessDeviceServiceRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setFitnessServiceRequest(FitnessProto.FitnessServiceRequest.Builder builder) {
                SingleFieldBuilderV3<FitnessProto.FitnessServiceRequest, FitnessProto.FitnessServiceRequest.Builder, FitnessProto.FitnessServiceRequestOrBuilder> singleFieldBuilderV3 = this.fitnessServiceRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.fitnessServiceRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setFitnessSocialServiceRequest(FitnessSocialProto.FitnessSocialServiceRequest.Builder builder) {
                SingleFieldBuilderV3<FitnessSocialProto.FitnessSocialServiceRequest, FitnessSocialProto.FitnessSocialServiceRequest.Builder, FitnessSocialProto.FitnessSocialServiceRequestOrBuilder> singleFieldBuilderV3 = this.fitnessSocialServiceRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.fitnessSocialServiceRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setFitnessTrackingRequest(FitnessTrackingProto.FitnessTrackingRequest.Builder builder) {
                SingleFieldBuilderV3<FitnessTrackingProto.FitnessTrackingRequest, FitnessTrackingProto.FitnessTrackingRequest.Builder, FitnessTrackingProto.FitnessTrackingRequestOrBuilder> singleFieldBuilderV3 = this.fitnessTrackingRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.fitnessTrackingRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setGpsEphemerisRequest(GpsEphemerisProto.GPSEphemerisRequest.Builder builder) {
                SingleFieldBuilderV3<GpsEphemerisProto.GPSEphemerisRequest, GpsEphemerisProto.GPSEphemerisRequest.Builder, GpsEphemerisProto.GPSEphemerisRequestOrBuilder> singleFieldBuilderV3 = this.gpsEphemerisRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.gpsEphemerisRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setGpsFixRequest(GpsFixProto.GpsFixRequest.Builder builder) {
                SingleFieldBuilderV3<GpsFixProto.GpsFixRequest, GpsFixProto.GpsFixRequest.Builder, GpsFixProto.GpsFixRequestOrBuilder> singleFieldBuilderV3 = this.gpsFixRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.gpsFixRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setMobileAppAuthRequest(Auth.MobileAppAuthRequest.Builder builder) {
                SingleFieldBuilderV3<Auth.MobileAppAuthRequest, Auth.MobileAppAuthRequest.Builder, Auth.MobileAppAuthRequestOrBuilder> singleFieldBuilderV3 = this.mobileAppAuthRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.mobileAppAuthRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setMobileAppStoreRequest(Auth.MobileAppStoreRequest.Builder builder) {
                SingleFieldBuilderV3<Auth.MobileAppStoreRequest, Auth.MobileAppStoreRequest.Builder, Auth.MobileAppStoreRequestOrBuilder> singleFieldBuilderV3 = this.mobileAppStoreRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.mobileAppStoreRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setRemoveMarkup(boolean z14) {
                this.removeMarkup_ = z14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSequenceNum(int i14) {
                this.sequenceNum_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTrackerRequest(TrackerProto.TrackerRequest.Builder builder) {
                SingleFieldBuilderV3<TrackerProto.TrackerRequest, TrackerProto.TrackerRequest.Builder, TrackerProto.TrackerRequestOrBuilder> singleFieldBuilderV3 = this.trackerRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.trackerRequest_ = builder.build();
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

            public Builder setWeatherRequest(WeatherProto.WeatherRequest.Builder builder) {
                SingleFieldBuilderV3<WeatherProto.WeatherRequest, WeatherProto.WeatherRequest.Builder, WeatherProto.WeatherRequestOrBuilder> singleFieldBuilderV3 = this.weatherRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.weatherRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ServiceRequest getDefaultInstanceForType() {
                return ServiceRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.countryCode_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder setAuthRequest(Auth.AuthRequest authRequest) {
                SingleFieldBuilderV3<Auth.AuthRequest, Auth.AuthRequest.Builder, Auth.AuthRequestOrBuilder> singleFieldBuilderV3 = this.authRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    authRequest.getClass();
                    this.authRequest_ = authRequest;
                } else {
                    singleFieldBuilderV3.setMessage(authRequest);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setEmergencyAssistanceRequest(EmergencyAssistanceProto.EmergencyAssistanceRequest emergencyAssistanceRequest) {
                SingleFieldBuilderV3<EmergencyAssistanceProto.EmergencyAssistanceRequest, EmergencyAssistanceProto.EmergencyAssistanceRequest.Builder, EmergencyAssistanceProto.EmergencyAssistanceRequestOrBuilder> singleFieldBuilderV3 = this.emergencyAssistanceRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    emergencyAssistanceRequest.getClass();
                    this.emergencyAssistanceRequest_ = emergencyAssistanceRequest;
                } else {
                    singleFieldBuilderV3.setMessage(emergencyAssistanceRequest);
                }
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setFitnessDeviceServiceRequest(FitnessDeviceProto.FitnessDeviceServiceRequest fitnessDeviceServiceRequest) {
                SingleFieldBuilderV3<FitnessDeviceProto.FitnessDeviceServiceRequest, FitnessDeviceProto.FitnessDeviceServiceRequest.Builder, FitnessDeviceProto.FitnessDeviceServiceRequestOrBuilder> singleFieldBuilderV3 = this.fitnessDeviceServiceRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    fitnessDeviceServiceRequest.getClass();
                    this.fitnessDeviceServiceRequest_ = fitnessDeviceServiceRequest;
                } else {
                    singleFieldBuilderV3.setMessage(fitnessDeviceServiceRequest);
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setFitnessServiceRequest(FitnessProto.FitnessServiceRequest fitnessServiceRequest) {
                SingleFieldBuilderV3<FitnessProto.FitnessServiceRequest, FitnessProto.FitnessServiceRequest.Builder, FitnessProto.FitnessServiceRequestOrBuilder> singleFieldBuilderV3 = this.fitnessServiceRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    fitnessServiceRequest.getClass();
                    this.fitnessServiceRequest_ = fitnessServiceRequest;
                } else {
                    singleFieldBuilderV3.setMessage(fitnessServiceRequest);
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setFitnessSocialServiceRequest(FitnessSocialProto.FitnessSocialServiceRequest fitnessSocialServiceRequest) {
                SingleFieldBuilderV3<FitnessSocialProto.FitnessSocialServiceRequest, FitnessSocialProto.FitnessSocialServiceRequest.Builder, FitnessSocialProto.FitnessSocialServiceRequestOrBuilder> singleFieldBuilderV3 = this.fitnessSocialServiceRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    fitnessSocialServiceRequest.getClass();
                    this.fitnessSocialServiceRequest_ = fitnessSocialServiceRequest;
                } else {
                    singleFieldBuilderV3.setMessage(fitnessSocialServiceRequest);
                }
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setFitnessTrackingRequest(FitnessTrackingProto.FitnessTrackingRequest fitnessTrackingRequest) {
                SingleFieldBuilderV3<FitnessTrackingProto.FitnessTrackingRequest, FitnessTrackingProto.FitnessTrackingRequest.Builder, FitnessTrackingProto.FitnessTrackingRequestOrBuilder> singleFieldBuilderV3 = this.fitnessTrackingRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    fitnessTrackingRequest.getClass();
                    this.fitnessTrackingRequest_ = fitnessTrackingRequest;
                } else {
                    singleFieldBuilderV3.setMessage(fitnessTrackingRequest);
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setGpsEphemerisRequest(GpsEphemerisProto.GPSEphemerisRequest gPSEphemerisRequest) {
                SingleFieldBuilderV3<GpsEphemerisProto.GPSEphemerisRequest, GpsEphemerisProto.GPSEphemerisRequest.Builder, GpsEphemerisProto.GPSEphemerisRequestOrBuilder> singleFieldBuilderV3 = this.gpsEphemerisRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    gPSEphemerisRequest.getClass();
                    this.gpsEphemerisRequest_ = gPSEphemerisRequest;
                } else {
                    singleFieldBuilderV3.setMessage(gPSEphemerisRequest);
                }
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setGpsFixRequest(GpsFixProto.GpsFixRequest gpsFixRequest) {
                SingleFieldBuilderV3<GpsFixProto.GpsFixRequest, GpsFixProto.GpsFixRequest.Builder, GpsFixProto.GpsFixRequestOrBuilder> singleFieldBuilderV3 = this.gpsFixRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    gpsFixRequest.getClass();
                    this.gpsFixRequest_ = gpsFixRequest;
                } else {
                    singleFieldBuilderV3.setMessage(gpsFixRequest);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setMobileAppAuthRequest(Auth.MobileAppAuthRequest mobileAppAuthRequest) {
                SingleFieldBuilderV3<Auth.MobileAppAuthRequest, Auth.MobileAppAuthRequest.Builder, Auth.MobileAppAuthRequestOrBuilder> singleFieldBuilderV3 = this.mobileAppAuthRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    mobileAppAuthRequest.getClass();
                    this.mobileAppAuthRequest_ = mobileAppAuthRequest;
                } else {
                    singleFieldBuilderV3.setMessage(mobileAppAuthRequest);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setMobileAppStoreRequest(Auth.MobileAppStoreRequest mobileAppStoreRequest) {
                SingleFieldBuilderV3<Auth.MobileAppStoreRequest, Auth.MobileAppStoreRequest.Builder, Auth.MobileAppStoreRequestOrBuilder> singleFieldBuilderV3 = this.mobileAppStoreRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    mobileAppStoreRequest.getClass();
                    this.mobileAppStoreRequest_ = mobileAppStoreRequest;
                } else {
                    singleFieldBuilderV3.setMessage(mobileAppStoreRequest);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setTrackerRequest(TrackerProto.TrackerRequest trackerRequest) {
                SingleFieldBuilderV3<TrackerProto.TrackerRequest, TrackerProto.TrackerRequest.Builder, TrackerProto.TrackerRequestOrBuilder> singleFieldBuilderV3 = this.trackerRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    trackerRequest.getClass();
                    this.trackerRequest_ = trackerRequest;
                } else {
                    singleFieldBuilderV3.setMessage(trackerRequest);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setWeatherRequest(WeatherProto.WeatherRequest weatherRequest) {
                SingleFieldBuilderV3<WeatherProto.WeatherRequest, WeatherProto.WeatherRequest.Builder, WeatherProto.WeatherRequestOrBuilder> singleFieldBuilderV3 = this.weatherRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    weatherRequest.getClass();
                    this.weatherRequest_ = weatherRequest;
                } else {
                    singleFieldBuilderV3.setMessage(weatherRequest);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ServiceRequest) {
                    return mergeFrom((ServiceRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ServiceRequest serviceRequest) {
                if (serviceRequest == ServiceRequest.getDefaultInstance()) {
                    return this;
                }
                if (serviceRequest.hasSequenceNum()) {
                    setSequenceNum(serviceRequest.getSequenceNum());
                }
                if (serviceRequest.hasCountryCode()) {
                    this.countryCode_ = serviceRequest.countryCode_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (serviceRequest.hasRemoveMarkup()) {
                    setRemoveMarkup(serviceRequest.getRemoveMarkup());
                }
                if (serviceRequest.hasWeatherRequest()) {
                    mergeWeatherRequest(serviceRequest.getWeatherRequest());
                }
                if (serviceRequest.hasAuthRequest()) {
                    mergeAuthRequest(serviceRequest.getAuthRequest());
                }
                if (serviceRequest.hasGpsFixRequest()) {
                    mergeGpsFixRequest(serviceRequest.getGpsFixRequest());
                }
                if (serviceRequest.hasTrackerRequest()) {
                    mergeTrackerRequest(serviceRequest.getTrackerRequest());
                }
                if (serviceRequest.hasMobileAppAuthRequest()) {
                    mergeMobileAppAuthRequest(serviceRequest.getMobileAppAuthRequest());
                }
                if (serviceRequest.hasMobileAppStoreRequest()) {
                    mergeMobileAppStoreRequest(serviceRequest.getMobileAppStoreRequest());
                }
                if (serviceRequest.hasFitnessTrackingRequest()) {
                    mergeFitnessTrackingRequest(serviceRequest.getFitnessTrackingRequest());
                }
                if (serviceRequest.hasFitnessServiceRequest()) {
                    mergeFitnessServiceRequest(serviceRequest.getFitnessServiceRequest());
                }
                if (serviceRequest.hasFitnessDeviceServiceRequest()) {
                    mergeFitnessDeviceServiceRequest(serviceRequest.getFitnessDeviceServiceRequest());
                }
                if (serviceRequest.hasGpsEphemerisRequest()) {
                    mergeGpsEphemerisRequest(serviceRequest.getGpsEphemerisRequest());
                }
                if (serviceRequest.hasFitnessSocialServiceRequest()) {
                    mergeFitnessSocialServiceRequest(serviceRequest.getFitnessSocialServiceRequest());
                }
                if (serviceRequest.hasEmergencyAssistanceRequest()) {
                    mergeEmergencyAssistanceRequest(serviceRequest.getEmergencyAssistanceRequest());
                }
                mergeUnknownFields(serviceRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ServiceRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ServiceRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ServiceRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ServiceRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ServiceRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ServiceRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ServiceRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ServiceRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ServiceRequest parseFrom(InputStream inputStream) {
            return (ServiceRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ServiceRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ServiceRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private ServiceRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.sequenceNum_ = 0;
            this.countryCode_ = "";
            this.removeMarkup_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ServiceRequest parseFrom(CodedInputStream codedInputStream) {
            return (ServiceRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ServiceRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ServiceRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ ServiceRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class TransactionContext extends GeneratedMessageV3 implements TransactionContextOrBuilder {
        public static final int DELTA_TRACK_LOG_FIELD_NUMBER = 1;
        public static final int LOCATION_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private DataTypesProto.DeltaTrackLog deltaTrackLog_;
        private DataTypesProto.Location location_;
        private byte memoizedIsInitialized;
        private static final TransactionContext DEFAULT_INSTANCE = new TransactionContext();

        @Deprecated
        public static final Parser<TransactionContext> PARSER = new AbstractParser<TransactionContext>() { // from class: com.garmin.gcsprotos.generated.RequestTypesProto.TransactionContext.1
            @Override // com.google.protobuf.Parser
            public TransactionContext parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TransactionContext.newBuilder();
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

        private TransactionContext(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TransactionContext getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return RequestTypesProto.internal_static_CSM_Proto_Service_TransactionContext_descriptor;
        }

        public static Builder newBuilder(TransactionContext transactionContext) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(transactionContext);
        }

        public static TransactionContext parseDelimitedFrom(InputStream inputStream) {
            return (TransactionContext) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TransactionContext parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TransactionContext> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TransactionContext)) {
                return super.equals(obj);
            }
            TransactionContext transactionContext = (TransactionContext) obj;
            if (hasDeltaTrackLog() != transactionContext.hasDeltaTrackLog()) {
                return false;
            }
            if ((!hasDeltaTrackLog() || getDeltaTrackLog().equals(transactionContext.getDeltaTrackLog())) && hasLocation() == transactionContext.hasLocation()) {
                return (!hasLocation() || getLocation().equals(transactionContext.getLocation())) && getUnknownFields().equals(transactionContext.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.TransactionContextOrBuilder
        public DataTypesProto.DeltaTrackLog getDeltaTrackLog() {
            DataTypesProto.DeltaTrackLog deltaTrackLog = this.deltaTrackLog_;
            return deltaTrackLog == null ? DataTypesProto.DeltaTrackLog.getDefaultInstance() : deltaTrackLog;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.TransactionContextOrBuilder
        public DataTypesProto.DeltaTrackLogOrBuilder getDeltaTrackLogOrBuilder() {
            DataTypesProto.DeltaTrackLog deltaTrackLog = this.deltaTrackLog_;
            return deltaTrackLog == null ? DataTypesProto.DeltaTrackLog.getDefaultInstance() : deltaTrackLog;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.TransactionContextOrBuilder
        public DataTypesProto.Location getLocation() {
            DataTypesProto.Location location = this.location_;
            return location == null ? DataTypesProto.Location.getDefaultInstance() : location;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.TransactionContextOrBuilder
        public DataTypesProto.LocationOrBuilder getLocationOrBuilder() {
            DataTypesProto.Location location = this.location_;
            return location == null ? DataTypesProto.Location.getDefaultInstance() : location;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TransactionContext> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getDeltaTrackLog()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getLocation());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.TransactionContextOrBuilder
        public boolean hasDeltaTrackLog() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.RequestTypesProto.TransactionContextOrBuilder
        public boolean hasLocation() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasDeltaTrackLog()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getDeltaTrackLog().hashCode();
            }
            if (hasLocation()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getLocation().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return RequestTypesProto.internal_static_CSM_Proto_Service_TransactionContext_fieldAccessorTable.ensureFieldAccessorsInitialized(TransactionContext.class, Builder.class);
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
            if (hasDeltaTrackLog() && !getDeltaTrackLog().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
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
            return new TransactionContext();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getDeltaTrackLog());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getLocation());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TransactionContextOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<DataTypesProto.DeltaTrackLog, DataTypesProto.DeltaTrackLog.Builder, DataTypesProto.DeltaTrackLogOrBuilder> deltaTrackLogBuilder_;
            private DataTypesProto.DeltaTrackLog deltaTrackLog_;
            private SingleFieldBuilderV3<DataTypesProto.Location, DataTypesProto.Location.Builder, DataTypesProto.LocationOrBuilder> locationBuilder_;
            private DataTypesProto.Location location_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(TransactionContext transactionContext) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<DataTypesProto.DeltaTrackLog, DataTypesProto.DeltaTrackLog.Builder, DataTypesProto.DeltaTrackLogOrBuilder> singleFieldBuilderV3 = this.deltaTrackLogBuilder_;
                    transactionContext.deltaTrackLog_ = singleFieldBuilderV3 == null ? this.deltaTrackLog_ : (DataTypesProto.DeltaTrackLog) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<DataTypesProto.Location, DataTypesProto.Location.Builder, DataTypesProto.LocationOrBuilder> singleFieldBuilderV4 = this.locationBuilder_;
                    transactionContext.location_ = singleFieldBuilderV4 == null ? this.location_ : (DataTypesProto.Location) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                transactionContext.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<DataTypesProto.DeltaTrackLog, DataTypesProto.DeltaTrackLog.Builder, DataTypesProto.DeltaTrackLogOrBuilder> getDeltaTrackLogFieldBuilder() {
                if (this.deltaTrackLogBuilder_ == null) {
                    this.deltaTrackLogBuilder_ = new SingleFieldBuilderV3<>(getDeltaTrackLog(), getParentForChildren(), isClean());
                    this.deltaTrackLog_ = null;
                }
                return this.deltaTrackLogBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return RequestTypesProto.internal_static_CSM_Proto_Service_TransactionContext_descriptor;
            }

            private SingleFieldBuilderV3<DataTypesProto.Location, DataTypesProto.Location.Builder, DataTypesProto.LocationOrBuilder> getLocationFieldBuilder() {
                if (this.locationBuilder_ == null) {
                    this.locationBuilder_ = new SingleFieldBuilderV3<>(getLocation(), getParentForChildren(), isClean());
                    this.location_ = null;
                }
                return this.locationBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getDeltaTrackLogFieldBuilder();
                    getLocationFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TransactionContext build() {
                TransactionContext transactionContextBuildPartial = buildPartial();
                if (transactionContextBuildPartial.isInitialized()) {
                    return transactionContextBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) transactionContextBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TransactionContext buildPartial() {
                TransactionContext transactionContext = new TransactionContext(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(transactionContext);
                }
                onBuilt();
                return transactionContext;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.deltaTrackLog_ = null;
                SingleFieldBuilderV3<DataTypesProto.DeltaTrackLog, DataTypesProto.DeltaTrackLog.Builder, DataTypesProto.DeltaTrackLogOrBuilder> singleFieldBuilderV3 = this.deltaTrackLogBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.deltaTrackLogBuilder_ = null;
                }
                this.location_ = null;
                SingleFieldBuilderV3<DataTypesProto.Location, DataTypesProto.Location.Builder, DataTypesProto.LocationOrBuilder> singleFieldBuilderV4 = this.locationBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.locationBuilder_ = null;
                }
                return this;
            }

            public Builder clearDeltaTrackLog() {
                this.bitField0_ &= -2;
                this.deltaTrackLog_ = null;
                SingleFieldBuilderV3<DataTypesProto.DeltaTrackLog, DataTypesProto.DeltaTrackLog.Builder, DataTypesProto.DeltaTrackLogOrBuilder> singleFieldBuilderV3 = this.deltaTrackLogBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.deltaTrackLogBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLocation() {
                this.bitField0_ &= -3;
                this.location_ = null;
                SingleFieldBuilderV3<DataTypesProto.Location, DataTypesProto.Location.Builder, DataTypesProto.LocationOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
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

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.TransactionContextOrBuilder
            public DataTypesProto.DeltaTrackLog getDeltaTrackLog() {
                SingleFieldBuilderV3<DataTypesProto.DeltaTrackLog, DataTypesProto.DeltaTrackLog.Builder, DataTypesProto.DeltaTrackLogOrBuilder> singleFieldBuilderV3 = this.deltaTrackLogBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypesProto.DeltaTrackLog) singleFieldBuilderV3.getMessage();
                }
                DataTypesProto.DeltaTrackLog deltaTrackLog = this.deltaTrackLog_;
                return deltaTrackLog == null ? DataTypesProto.DeltaTrackLog.getDefaultInstance() : deltaTrackLog;
            }

            public DataTypesProto.DeltaTrackLog.Builder getDeltaTrackLogBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (DataTypesProto.DeltaTrackLog.Builder) getDeltaTrackLogFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.TransactionContextOrBuilder
            public DataTypesProto.DeltaTrackLogOrBuilder getDeltaTrackLogOrBuilder() {
                SingleFieldBuilderV3<DataTypesProto.DeltaTrackLog, DataTypesProto.DeltaTrackLog.Builder, DataTypesProto.DeltaTrackLogOrBuilder> singleFieldBuilderV3 = this.deltaTrackLogBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypesProto.DeltaTrackLogOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DataTypesProto.DeltaTrackLog deltaTrackLog = this.deltaTrackLog_;
                return deltaTrackLog == null ? DataTypesProto.DeltaTrackLog.getDefaultInstance() : deltaTrackLog;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return RequestTypesProto.internal_static_CSM_Proto_Service_TransactionContext_descriptor;
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.TransactionContextOrBuilder
            public DataTypesProto.Location getLocation() {
                SingleFieldBuilderV3<DataTypesProto.Location, DataTypesProto.Location.Builder, DataTypesProto.LocationOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypesProto.Location) singleFieldBuilderV3.getMessage();
                }
                DataTypesProto.Location location = this.location_;
                return location == null ? DataTypesProto.Location.getDefaultInstance() : location;
            }

            public DataTypesProto.Location.Builder getLocationBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (DataTypesProto.Location.Builder) getLocationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.TransactionContextOrBuilder
            public DataTypesProto.LocationOrBuilder getLocationOrBuilder() {
                SingleFieldBuilderV3<DataTypesProto.Location, DataTypesProto.Location.Builder, DataTypesProto.LocationOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypesProto.LocationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DataTypesProto.Location location = this.location_;
                return location == null ? DataTypesProto.Location.getDefaultInstance() : location;
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.TransactionContextOrBuilder
            public boolean hasDeltaTrackLog() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.RequestTypesProto.TransactionContextOrBuilder
            public boolean hasLocation() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return RequestTypesProto.internal_static_CSM_Proto_Service_TransactionContext_fieldAccessorTable.ensureFieldAccessorsInitialized(TransactionContext.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasDeltaTrackLog() || getDeltaTrackLog().isInitialized()) {
                    return !hasLocation() || getLocation().isInitialized();
                }
                return false;
            }

            public Builder mergeDeltaTrackLog(DataTypesProto.DeltaTrackLog deltaTrackLog) {
                DataTypesProto.DeltaTrackLog deltaTrackLog2;
                SingleFieldBuilderV3<DataTypesProto.DeltaTrackLog, DataTypesProto.DeltaTrackLog.Builder, DataTypesProto.DeltaTrackLogOrBuilder> singleFieldBuilderV3 = this.deltaTrackLogBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(deltaTrackLog);
                } else if ((this.bitField0_ & 1) == 0 || (deltaTrackLog2 = this.deltaTrackLog_) == null || deltaTrackLog2 == DataTypesProto.DeltaTrackLog.getDefaultInstance()) {
                    this.deltaTrackLog_ = deltaTrackLog;
                } else {
                    getDeltaTrackLogBuilder().mergeFrom(deltaTrackLog);
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
                                    codedInputStream.readMessage(getDeltaTrackLogFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getLocationFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeLocation(DataTypesProto.Location location) {
                DataTypesProto.Location location2;
                SingleFieldBuilderV3<DataTypesProto.Location, DataTypesProto.Location.Builder, DataTypesProto.LocationOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(location);
                } else if ((this.bitField0_ & 2) == 0 || (location2 = this.location_) == null || location2 == DataTypesProto.Location.getDefaultInstance()) {
                    this.location_ = location;
                } else {
                    getLocationBuilder().mergeFrom(location);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setDeltaTrackLog(DataTypesProto.DeltaTrackLog.Builder builder) {
                SingleFieldBuilderV3<DataTypesProto.DeltaTrackLog, DataTypesProto.DeltaTrackLog.Builder, DataTypesProto.DeltaTrackLogOrBuilder> singleFieldBuilderV3 = this.deltaTrackLogBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.deltaTrackLog_ = builder.build();
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

            public Builder setLocation(DataTypesProto.Location.Builder builder) {
                SingleFieldBuilderV3<DataTypesProto.Location, DataTypesProto.Location.Builder, DataTypesProto.LocationOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.location_ = builder.build();
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
            public TransactionContext getDefaultInstanceForType() {
                return TransactionContext.getDefaultInstance();
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

            public Builder setDeltaTrackLog(DataTypesProto.DeltaTrackLog deltaTrackLog) {
                SingleFieldBuilderV3<DataTypesProto.DeltaTrackLog, DataTypesProto.DeltaTrackLog.Builder, DataTypesProto.DeltaTrackLogOrBuilder> singleFieldBuilderV3 = this.deltaTrackLogBuilder_;
                if (singleFieldBuilderV3 == null) {
                    deltaTrackLog.getClass();
                    this.deltaTrackLog_ = deltaTrackLog;
                } else {
                    singleFieldBuilderV3.setMessage(deltaTrackLog);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setLocation(DataTypesProto.Location location) {
                SingleFieldBuilderV3<DataTypesProto.Location, DataTypesProto.Location.Builder, DataTypesProto.LocationOrBuilder> singleFieldBuilderV3 = this.locationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    location.getClass();
                    this.location_ = location;
                } else {
                    singleFieldBuilderV3.setMessage(location);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TransactionContext) {
                    return mergeFrom((TransactionContext) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TransactionContext transactionContext) {
                if (transactionContext == TransactionContext.getDefaultInstance()) {
                    return this;
                }
                if (transactionContext.hasDeltaTrackLog()) {
                    mergeDeltaTrackLog(transactionContext.getDeltaTrackLog());
                }
                if (transactionContext.hasLocation()) {
                    mergeLocation(transactionContext.getLocation());
                }
                mergeUnknownFields(transactionContext.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TransactionContext getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ TransactionContext(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private TransactionContext() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TransactionContext parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TransactionContext) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TransactionContext parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static TransactionContext parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TransactionContext parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TransactionContext parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static TransactionContext parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static TransactionContext parseFrom(InputStream inputStream) {
            return (TransactionContext) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static TransactionContext parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TransactionContext) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TransactionContext parseFrom(CodedInputStream codedInputStream) {
            return (TransactionContext) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TransactionContext parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TransactionContext) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
