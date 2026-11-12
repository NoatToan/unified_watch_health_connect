package com.garmin.gcsprotos.generated;

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
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import i3.e5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import vb.h;

/* JADX INFO: loaded from: classes12.dex */
public final class ResponseTypesProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0013responseTypes.proto\u0012\u0011CSM.Proto.Service\u001a\rweather.proto\u001a\nauth.proto\u001a\fgpsFix.proto\u001a\rtracker.proto\u001a\rfitness.proto\u001a\u0015fitnesstracking.proto\u001a\u0013fitnessDevice.proto\u001a\u0012gpsEphemeris.proto\u001a\u0013fitnessSocial.proto\u001a\u000fdataTypes.proto\u001a\u0019emergencyassistance.proto\" \b\n\u000fServiceResponse\u0012\u0014\n\fsequence_num\u0018\u0001 \u0001(\r\u0012<\n\u000eservice_status\u0018\u0002 \u0001(\u000e2 .CSM.Proto.Service.ServiceStatus:\u0002OK\u0012\u0017\n\u000fservice_err_msg\u0018\u0003 \u0001(\t\u0012\u0010\n\bgcs_uuid\u0018\u0004 \u0001(\t\u0012<\n\u0010weather_response\u0018\u001e \u0001(\u000b2\".CSM.Proto.Weather.WeatherResponse\u00123\n\rauth_response\u0018/ \u0001(\u000b2\u001c.CSM.Proto.Auth.AuthResponse\u0012:\n\u0010gps_fix_response\u0018F \u0001(\u000b2 .CSM.Proto.GpsFix.GpsFixResponse\u0012<\n\u0010tracker_response\u0018H \u0001(\u000b2\".CSM.Proto.Tracker.TrackerResponse\u0012G\n\u0018mobile_app_auth_response\u0018P \u0001(\u000b2%.CSM.Proto.Auth.MobileAppAuthResponse\u0012I\n\u0019mobile_app_store_response\u0018Q \u0001(\u000b2&.CSM.Proto.Auth.MobileAppStoreResponse\u0012U\n\u0019fitness_tracking_response\u0018R \u0001(\u000b22.CSM.Proto.FitnessTracking.FitnessTrackingResponse\u0012K\n\u0018fitness_service_response\u0018W \u0001(\u000b2).CSM.Proto.Fitness.FitnessServiceResponse\u0012^\n\u001ffitness_device_service_response\u0018e \u0001(\u000b25.CSM.Proto.FitnessDevice.FitnessDeviceServiceResponse\u0012F\n\u0016gps_ephemeris_response\u0018f \u0001(\u000b2&.CSM.Proto.GpsFix.GPSEphemerisResponse\u0012^\n\u001ffitness_social_service_response\u0018g \u0001(\u000b25.CSM.Proto.FitnessSocial.FitnessSocialServiceResponse\u0012a\n\u001demergency_assistance_response\u0018z \u0001(\u000b2:.CSM.Proto.EmergencyAssistance.EmergencyAssistanceResponse*\u0095\u0002\n\rServiceStatus\u0012\u0006\n\u0002OK\u0010\u0000\u0012\u0018\n\u0014PROVIDER_UNAVAILABLE\u0010\u0001\u0012\u0016\n\u0012MISSING_PARAMETERS\u0010\u0002\u0012\u0017\n\u0013OUT_OF_RANGE_VALUES\u0010\u0003\u0012\u0013\n\u000fUNKNOWN_SERVICE\u0010\u0004\u0012\u001e\n\u001aNOT_AUTHORIZED_AT_LOCATION\u0010\u0005\u0012\u0014\n\u0010DATA_UNAVAILABLE\u0010\u0006\u0012\u0017\n\u0013UNHANDLED_EXCEPTION\u0010\u0007\u0012\u0011\n\rINVALID_INPUT\u0010\b\u0012\u0012\n\u000eINTERNAL_ERROR\u0010\t\u0012\u0010\n\fBAD_PROVIDER\u0010\n\u0012\u0014\n\u0010SERVICE_TIME_OUT\u0010\u000bB6\n\u001ecom.garmin.gcsprotos.generatedB\u0012ResponseTypesProtoH\u0003"}, new Descriptors.FileDescriptor[]{WeatherProto.getDescriptor(), Auth.getDescriptor(), GpsFixProto.getDescriptor(), TrackerProto.getDescriptor(), FitnessProto.getDescriptor(), FitnessTrackingProto.getDescriptor(), FitnessDeviceProto.getDescriptor(), GpsEphemerisProto.getDescriptor(), FitnessSocialProto.getDescriptor(), DataTypesProto.getDescriptor(), EmergencyAssistanceProto.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_CSM_Proto_Service_ServiceResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CSM_Proto_Service_ServiceResponse_fieldAccessorTable;

    public interface ServiceResponseOrBuilder extends MessageOrBuilder {
        Auth.AuthResponse getAuthResponse();

        Auth.AuthResponseOrBuilder getAuthResponseOrBuilder();

        EmergencyAssistanceProto.EmergencyAssistanceResponse getEmergencyAssistanceResponse();

        EmergencyAssistanceProto.EmergencyAssistanceResponseOrBuilder getEmergencyAssistanceResponseOrBuilder();

        FitnessDeviceProto.FitnessDeviceServiceResponse getFitnessDeviceServiceResponse();

        FitnessDeviceProto.FitnessDeviceServiceResponseOrBuilder getFitnessDeviceServiceResponseOrBuilder();

        FitnessProto.FitnessServiceResponse getFitnessServiceResponse();

        FitnessProto.FitnessServiceResponseOrBuilder getFitnessServiceResponseOrBuilder();

        FitnessSocialProto.FitnessSocialServiceResponse getFitnessSocialServiceResponse();

        FitnessSocialProto.FitnessSocialServiceResponseOrBuilder getFitnessSocialServiceResponseOrBuilder();

        FitnessTrackingProto.FitnessTrackingResponse getFitnessTrackingResponse();

        FitnessTrackingProto.FitnessTrackingResponseOrBuilder getFitnessTrackingResponseOrBuilder();

        String getGcsUuid();

        ByteString getGcsUuidBytes();

        GpsEphemerisProto.GPSEphemerisResponse getGpsEphemerisResponse();

        GpsEphemerisProto.GPSEphemerisResponseOrBuilder getGpsEphemerisResponseOrBuilder();

        GpsFixProto.GpsFixResponse getGpsFixResponse();

        GpsFixProto.GpsFixResponseOrBuilder getGpsFixResponseOrBuilder();

        Auth.MobileAppAuthResponse getMobileAppAuthResponse();

        Auth.MobileAppAuthResponseOrBuilder getMobileAppAuthResponseOrBuilder();

        Auth.MobileAppStoreResponse getMobileAppStoreResponse();

        Auth.MobileAppStoreResponseOrBuilder getMobileAppStoreResponseOrBuilder();

        int getSequenceNum();

        String getServiceErrMsg();

        ByteString getServiceErrMsgBytes();

        ServiceStatus getServiceStatus();

        TrackerProto.TrackerResponse getTrackerResponse();

        TrackerProto.TrackerResponseOrBuilder getTrackerResponseOrBuilder();

        WeatherProto.WeatherResponse getWeatherResponse();

        WeatherProto.WeatherResponseOrBuilder getWeatherResponseOrBuilder();

        boolean hasAuthResponse();

        boolean hasEmergencyAssistanceResponse();

        boolean hasFitnessDeviceServiceResponse();

        boolean hasFitnessServiceResponse();

        boolean hasFitnessSocialServiceResponse();

        boolean hasFitnessTrackingResponse();

        boolean hasGcsUuid();

        boolean hasGpsEphemerisResponse();

        boolean hasGpsFixResponse();

        boolean hasMobileAppAuthResponse();

        boolean hasMobileAppStoreResponse();

        boolean hasSequenceNum();

        boolean hasServiceErrMsg();

        boolean hasServiceStatus();

        boolean hasTrackerResponse();

        boolean hasWeatherResponse();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_CSM_Proto_Service_ServiceResponse_descriptor = descriptor2;
        internal_static_CSM_Proto_Service_ServiceResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"SequenceNum", "ServiceStatus", "ServiceErrMsg", "GcsUuid", "WeatherResponse", "AuthResponse", "GpsFixResponse", "TrackerResponse", "MobileAppAuthResponse", "MobileAppStoreResponse", "FitnessTrackingResponse", "FitnessServiceResponse", "FitnessDeviceServiceResponse", "GpsEphemerisResponse", "FitnessSocialServiceResponse", "EmergencyAssistanceResponse"});
        WeatherProto.getDescriptor();
        Auth.getDescriptor();
        GpsFixProto.getDescriptor();
        TrackerProto.getDescriptor();
        FitnessProto.getDescriptor();
        FitnessTrackingProto.getDescriptor();
        FitnessDeviceProto.getDescriptor();
        GpsEphemerisProto.getDescriptor();
        FitnessSocialProto.getDescriptor();
        DataTypesProto.getDescriptor();
        EmergencyAssistanceProto.getDescriptor();
    }

    private ResponseTypesProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class ServiceResponse extends GeneratedMessageV3 implements ServiceResponseOrBuilder {
        public static final int AUTH_RESPONSE_FIELD_NUMBER = 47;
        public static final int EMERGENCY_ASSISTANCE_RESPONSE_FIELD_NUMBER = 122;
        public static final int FITNESS_DEVICE_SERVICE_RESPONSE_FIELD_NUMBER = 101;
        public static final int FITNESS_SERVICE_RESPONSE_FIELD_NUMBER = 87;
        public static final int FITNESS_SOCIAL_SERVICE_RESPONSE_FIELD_NUMBER = 103;
        public static final int FITNESS_TRACKING_RESPONSE_FIELD_NUMBER = 82;
        public static final int GCS_UUID_FIELD_NUMBER = 4;
        public static final int GPS_EPHEMERIS_RESPONSE_FIELD_NUMBER = 102;
        public static final int GPS_FIX_RESPONSE_FIELD_NUMBER = 70;
        public static final int MOBILE_APP_AUTH_RESPONSE_FIELD_NUMBER = 80;
        public static final int MOBILE_APP_STORE_RESPONSE_FIELD_NUMBER = 81;
        public static final int SEQUENCE_NUM_FIELD_NUMBER = 1;
        public static final int SERVICE_ERR_MSG_FIELD_NUMBER = 3;
        public static final int SERVICE_STATUS_FIELD_NUMBER = 2;
        public static final int TRACKER_RESPONSE_FIELD_NUMBER = 72;
        public static final int WEATHER_RESPONSE_FIELD_NUMBER = 30;
        private static final long serialVersionUID = 0;
        private Auth.AuthResponse authResponse_;
        private int bitField0_;
        private EmergencyAssistanceProto.EmergencyAssistanceResponse emergencyAssistanceResponse_;
        private FitnessDeviceProto.FitnessDeviceServiceResponse fitnessDeviceServiceResponse_;
        private FitnessProto.FitnessServiceResponse fitnessServiceResponse_;
        private FitnessSocialProto.FitnessSocialServiceResponse fitnessSocialServiceResponse_;
        private FitnessTrackingProto.FitnessTrackingResponse fitnessTrackingResponse_;
        private volatile Object gcsUuid_;
        private GpsEphemerisProto.GPSEphemerisResponse gpsEphemerisResponse_;
        private GpsFixProto.GpsFixResponse gpsFixResponse_;
        private byte memoizedIsInitialized;
        private Auth.MobileAppAuthResponse mobileAppAuthResponse_;
        private Auth.MobileAppStoreResponse mobileAppStoreResponse_;
        private int sequenceNum_;
        private volatile Object serviceErrMsg_;
        private int serviceStatus_;
        private TrackerProto.TrackerResponse trackerResponse_;
        private WeatherProto.WeatherResponse weatherResponse_;
        private static final ServiceResponse DEFAULT_INSTANCE = new ServiceResponse();

        @Deprecated
        public static final Parser<ServiceResponse> PARSER = new AbstractParser<ServiceResponse>() { // from class: com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponse.1
            @Override // com.google.protobuf.Parser
            public ServiceResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ServiceResponse.newBuilder();
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

        private ServiceResponse() {
            this.sequenceNum_ = 0;
            this.serviceStatus_ = 0;
            this.serviceErrMsg_ = "";
            this.gcsUuid_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.serviceStatus_ = 0;
            this.serviceErrMsg_ = "";
            this.gcsUuid_ = "";
        }

        public static ServiceResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return ResponseTypesProto.internal_static_CSM_Proto_Service_ServiceResponse_descriptor;
        }

        public static Builder newBuilder(ServiceResponse serviceResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(serviceResponse);
        }

        public static ServiceResponse parseDelimitedFrom(InputStream inputStream) {
            return (ServiceResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ServiceResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ServiceResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ServiceResponse)) {
                return super.equals(obj);
            }
            ServiceResponse serviceResponse = (ServiceResponse) obj;
            if (hasSequenceNum() != serviceResponse.hasSequenceNum()) {
                return false;
            }
            if ((hasSequenceNum() && getSequenceNum() != serviceResponse.getSequenceNum()) || hasServiceStatus() != serviceResponse.hasServiceStatus()) {
                return false;
            }
            if ((hasServiceStatus() && this.serviceStatus_ != serviceResponse.serviceStatus_) || hasServiceErrMsg() != serviceResponse.hasServiceErrMsg()) {
                return false;
            }
            if ((hasServiceErrMsg() && !getServiceErrMsg().equals(serviceResponse.getServiceErrMsg())) || hasGcsUuid() != serviceResponse.hasGcsUuid()) {
                return false;
            }
            if ((hasGcsUuid() && !getGcsUuid().equals(serviceResponse.getGcsUuid())) || hasWeatherResponse() != serviceResponse.hasWeatherResponse()) {
                return false;
            }
            if ((hasWeatherResponse() && !getWeatherResponse().equals(serviceResponse.getWeatherResponse())) || hasAuthResponse() != serviceResponse.hasAuthResponse()) {
                return false;
            }
            if ((hasAuthResponse() && !getAuthResponse().equals(serviceResponse.getAuthResponse())) || hasGpsFixResponse() != serviceResponse.hasGpsFixResponse()) {
                return false;
            }
            if ((hasGpsFixResponse() && !getGpsFixResponse().equals(serviceResponse.getGpsFixResponse())) || hasTrackerResponse() != serviceResponse.hasTrackerResponse()) {
                return false;
            }
            if ((hasTrackerResponse() && !getTrackerResponse().equals(serviceResponse.getTrackerResponse())) || hasMobileAppAuthResponse() != serviceResponse.hasMobileAppAuthResponse()) {
                return false;
            }
            if ((hasMobileAppAuthResponse() && !getMobileAppAuthResponse().equals(serviceResponse.getMobileAppAuthResponse())) || hasMobileAppStoreResponse() != serviceResponse.hasMobileAppStoreResponse()) {
                return false;
            }
            if ((hasMobileAppStoreResponse() && !getMobileAppStoreResponse().equals(serviceResponse.getMobileAppStoreResponse())) || hasFitnessTrackingResponse() != serviceResponse.hasFitnessTrackingResponse()) {
                return false;
            }
            if ((hasFitnessTrackingResponse() && !getFitnessTrackingResponse().equals(serviceResponse.getFitnessTrackingResponse())) || hasFitnessServiceResponse() != serviceResponse.hasFitnessServiceResponse()) {
                return false;
            }
            if ((hasFitnessServiceResponse() && !getFitnessServiceResponse().equals(serviceResponse.getFitnessServiceResponse())) || hasFitnessDeviceServiceResponse() != serviceResponse.hasFitnessDeviceServiceResponse()) {
                return false;
            }
            if ((hasFitnessDeviceServiceResponse() && !getFitnessDeviceServiceResponse().equals(serviceResponse.getFitnessDeviceServiceResponse())) || hasGpsEphemerisResponse() != serviceResponse.hasGpsEphemerisResponse()) {
                return false;
            }
            if ((hasGpsEphemerisResponse() && !getGpsEphemerisResponse().equals(serviceResponse.getGpsEphemerisResponse())) || hasFitnessSocialServiceResponse() != serviceResponse.hasFitnessSocialServiceResponse()) {
                return false;
            }
            if ((!hasFitnessSocialServiceResponse() || getFitnessSocialServiceResponse().equals(serviceResponse.getFitnessSocialServiceResponse())) && hasEmergencyAssistanceResponse() == serviceResponse.hasEmergencyAssistanceResponse()) {
                return (!hasEmergencyAssistanceResponse() || getEmergencyAssistanceResponse().equals(serviceResponse.getEmergencyAssistanceResponse())) && getUnknownFields().equals(serviceResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public Auth.AuthResponse getAuthResponse() {
            Auth.AuthResponse authResponse = this.authResponse_;
            return authResponse == null ? Auth.AuthResponse.getDefaultInstance() : authResponse;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public Auth.AuthResponseOrBuilder getAuthResponseOrBuilder() {
            Auth.AuthResponse authResponse = this.authResponse_;
            return authResponse == null ? Auth.AuthResponse.getDefaultInstance() : authResponse;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public EmergencyAssistanceProto.EmergencyAssistanceResponse getEmergencyAssistanceResponse() {
            EmergencyAssistanceProto.EmergencyAssistanceResponse emergencyAssistanceResponse = this.emergencyAssistanceResponse_;
            return emergencyAssistanceResponse == null ? EmergencyAssistanceProto.EmergencyAssistanceResponse.getDefaultInstance() : emergencyAssistanceResponse;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public EmergencyAssistanceProto.EmergencyAssistanceResponseOrBuilder getEmergencyAssistanceResponseOrBuilder() {
            EmergencyAssistanceProto.EmergencyAssistanceResponse emergencyAssistanceResponse = this.emergencyAssistanceResponse_;
            return emergencyAssistanceResponse == null ? EmergencyAssistanceProto.EmergencyAssistanceResponse.getDefaultInstance() : emergencyAssistanceResponse;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public FitnessDeviceProto.FitnessDeviceServiceResponse getFitnessDeviceServiceResponse() {
            FitnessDeviceProto.FitnessDeviceServiceResponse fitnessDeviceServiceResponse = this.fitnessDeviceServiceResponse_;
            return fitnessDeviceServiceResponse == null ? FitnessDeviceProto.FitnessDeviceServiceResponse.getDefaultInstance() : fitnessDeviceServiceResponse;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public FitnessDeviceProto.FitnessDeviceServiceResponseOrBuilder getFitnessDeviceServiceResponseOrBuilder() {
            FitnessDeviceProto.FitnessDeviceServiceResponse fitnessDeviceServiceResponse = this.fitnessDeviceServiceResponse_;
            return fitnessDeviceServiceResponse == null ? FitnessDeviceProto.FitnessDeviceServiceResponse.getDefaultInstance() : fitnessDeviceServiceResponse;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public FitnessProto.FitnessServiceResponse getFitnessServiceResponse() {
            FitnessProto.FitnessServiceResponse fitnessServiceResponse = this.fitnessServiceResponse_;
            return fitnessServiceResponse == null ? FitnessProto.FitnessServiceResponse.getDefaultInstance() : fitnessServiceResponse;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public FitnessProto.FitnessServiceResponseOrBuilder getFitnessServiceResponseOrBuilder() {
            FitnessProto.FitnessServiceResponse fitnessServiceResponse = this.fitnessServiceResponse_;
            return fitnessServiceResponse == null ? FitnessProto.FitnessServiceResponse.getDefaultInstance() : fitnessServiceResponse;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public FitnessSocialProto.FitnessSocialServiceResponse getFitnessSocialServiceResponse() {
            FitnessSocialProto.FitnessSocialServiceResponse fitnessSocialServiceResponse = this.fitnessSocialServiceResponse_;
            return fitnessSocialServiceResponse == null ? FitnessSocialProto.FitnessSocialServiceResponse.getDefaultInstance() : fitnessSocialServiceResponse;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public FitnessSocialProto.FitnessSocialServiceResponseOrBuilder getFitnessSocialServiceResponseOrBuilder() {
            FitnessSocialProto.FitnessSocialServiceResponse fitnessSocialServiceResponse = this.fitnessSocialServiceResponse_;
            return fitnessSocialServiceResponse == null ? FitnessSocialProto.FitnessSocialServiceResponse.getDefaultInstance() : fitnessSocialServiceResponse;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public FitnessTrackingProto.FitnessTrackingResponse getFitnessTrackingResponse() {
            FitnessTrackingProto.FitnessTrackingResponse fitnessTrackingResponse = this.fitnessTrackingResponse_;
            return fitnessTrackingResponse == null ? FitnessTrackingProto.FitnessTrackingResponse.getDefaultInstance() : fitnessTrackingResponse;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public FitnessTrackingProto.FitnessTrackingResponseOrBuilder getFitnessTrackingResponseOrBuilder() {
            FitnessTrackingProto.FitnessTrackingResponse fitnessTrackingResponse = this.fitnessTrackingResponse_;
            return fitnessTrackingResponse == null ? FitnessTrackingProto.FitnessTrackingResponse.getDefaultInstance() : fitnessTrackingResponse;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public String getGcsUuid() {
            Object obj = this.gcsUuid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.gcsUuid_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public ByteString getGcsUuidBytes() {
            Object obj = this.gcsUuid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.gcsUuid_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public GpsEphemerisProto.GPSEphemerisResponse getGpsEphemerisResponse() {
            GpsEphemerisProto.GPSEphemerisResponse gPSEphemerisResponse = this.gpsEphemerisResponse_;
            return gPSEphemerisResponse == null ? GpsEphemerisProto.GPSEphemerisResponse.getDefaultInstance() : gPSEphemerisResponse;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public GpsEphemerisProto.GPSEphemerisResponseOrBuilder getGpsEphemerisResponseOrBuilder() {
            GpsEphemerisProto.GPSEphemerisResponse gPSEphemerisResponse = this.gpsEphemerisResponse_;
            return gPSEphemerisResponse == null ? GpsEphemerisProto.GPSEphemerisResponse.getDefaultInstance() : gPSEphemerisResponse;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public GpsFixProto.GpsFixResponse getGpsFixResponse() {
            GpsFixProto.GpsFixResponse gpsFixResponse = this.gpsFixResponse_;
            return gpsFixResponse == null ? GpsFixProto.GpsFixResponse.getDefaultInstance() : gpsFixResponse;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public GpsFixProto.GpsFixResponseOrBuilder getGpsFixResponseOrBuilder() {
            GpsFixProto.GpsFixResponse gpsFixResponse = this.gpsFixResponse_;
            return gpsFixResponse == null ? GpsFixProto.GpsFixResponse.getDefaultInstance() : gpsFixResponse;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public Auth.MobileAppAuthResponse getMobileAppAuthResponse() {
            Auth.MobileAppAuthResponse mobileAppAuthResponse = this.mobileAppAuthResponse_;
            return mobileAppAuthResponse == null ? Auth.MobileAppAuthResponse.getDefaultInstance() : mobileAppAuthResponse;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public Auth.MobileAppAuthResponseOrBuilder getMobileAppAuthResponseOrBuilder() {
            Auth.MobileAppAuthResponse mobileAppAuthResponse = this.mobileAppAuthResponse_;
            return mobileAppAuthResponse == null ? Auth.MobileAppAuthResponse.getDefaultInstance() : mobileAppAuthResponse;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public Auth.MobileAppStoreResponse getMobileAppStoreResponse() {
            Auth.MobileAppStoreResponse mobileAppStoreResponse = this.mobileAppStoreResponse_;
            return mobileAppStoreResponse == null ? Auth.MobileAppStoreResponse.getDefaultInstance() : mobileAppStoreResponse;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public Auth.MobileAppStoreResponseOrBuilder getMobileAppStoreResponseOrBuilder() {
            Auth.MobileAppStoreResponse mobileAppStoreResponse = this.mobileAppStoreResponse_;
            return mobileAppStoreResponse == null ? Auth.MobileAppStoreResponse.getDefaultInstance() : mobileAppStoreResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ServiceResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
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
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(2, this.serviceStatus_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += GeneratedMessageV3.computeStringSize(3, this.serviceErrMsg_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += GeneratedMessageV3.computeStringSize(4, this.gcsUuid_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(30, getWeatherResponse());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(47, getAuthResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(70, getGpsFixResponse());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(72, getTrackerResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(80, getMobileAppAuthResponse());
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(81, getMobileAppStoreResponse());
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(82, getFitnessTrackingResponse());
            }
            if ((this.bitField0_ & 2048) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(87, getFitnessServiceResponse());
            }
            if ((this.bitField0_ & 4096) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(101, getFitnessDeviceServiceResponse());
            }
            if ((this.bitField0_ & 8192) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(102, getGpsEphemerisResponse());
            }
            if ((this.bitField0_ & 16384) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(103, getFitnessSocialServiceResponse());
            }
            if ((this.bitField0_ & 32768) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(122, getEmergencyAssistanceResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public String getServiceErrMsg() {
            Object obj = this.serviceErrMsg_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.serviceErrMsg_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public ByteString getServiceErrMsgBytes() {
            Object obj = this.serviceErrMsg_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.serviceErrMsg_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public ServiceStatus getServiceStatus() {
            ServiceStatus serviceStatusForNumber = ServiceStatus.forNumber(this.serviceStatus_);
            return serviceStatusForNumber == null ? ServiceStatus.OK : serviceStatusForNumber;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public TrackerProto.TrackerResponse getTrackerResponse() {
            TrackerProto.TrackerResponse trackerResponse = this.trackerResponse_;
            return trackerResponse == null ? TrackerProto.TrackerResponse.getDefaultInstance() : trackerResponse;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public TrackerProto.TrackerResponseOrBuilder getTrackerResponseOrBuilder() {
            TrackerProto.TrackerResponse trackerResponse = this.trackerResponse_;
            return trackerResponse == null ? TrackerProto.TrackerResponse.getDefaultInstance() : trackerResponse;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public WeatherProto.WeatherResponse getWeatherResponse() {
            WeatherProto.WeatherResponse weatherResponse = this.weatherResponse_;
            return weatherResponse == null ? WeatherProto.WeatherResponse.getDefaultInstance() : weatherResponse;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public WeatherProto.WeatherResponseOrBuilder getWeatherResponseOrBuilder() {
            WeatherProto.WeatherResponse weatherResponse = this.weatherResponse_;
            return weatherResponse == null ? WeatherProto.WeatherResponse.getDefaultInstance() : weatherResponse;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public boolean hasAuthResponse() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public boolean hasEmergencyAssistanceResponse() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public boolean hasFitnessDeviceServiceResponse() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public boolean hasFitnessServiceResponse() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public boolean hasFitnessSocialServiceResponse() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public boolean hasFitnessTrackingResponse() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public boolean hasGcsUuid() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public boolean hasGpsEphemerisResponse() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public boolean hasGpsFixResponse() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public boolean hasMobileAppAuthResponse() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public boolean hasMobileAppStoreResponse() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public boolean hasSequenceNum() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public boolean hasServiceErrMsg() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public boolean hasServiceStatus() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public boolean hasTrackerResponse() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
        public boolean hasWeatherResponse() {
            return (this.bitField0_ & 16) != 0;
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
            if (hasServiceStatus()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.serviceStatus_;
            }
            if (hasServiceErrMsg()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getServiceErrMsg().hashCode();
            }
            if (hasGcsUuid()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getGcsUuid().hashCode();
            }
            if (hasWeatherResponse()) {
                iHashCode = e5.c(iHashCode, 37, 30, 53) + getWeatherResponse().hashCode();
            }
            if (hasAuthResponse()) {
                iHashCode = e5.c(iHashCode, 37, 47, 53) + getAuthResponse().hashCode();
            }
            if (hasGpsFixResponse()) {
                iHashCode = e5.c(iHashCode, 37, 70, 53) + getGpsFixResponse().hashCode();
            }
            if (hasTrackerResponse()) {
                iHashCode = e5.c(iHashCode, 37, 72, 53) + getTrackerResponse().hashCode();
            }
            if (hasMobileAppAuthResponse()) {
                iHashCode = e5.c(iHashCode, 37, 80, 53) + getMobileAppAuthResponse().hashCode();
            }
            if (hasMobileAppStoreResponse()) {
                iHashCode = e5.c(iHashCode, 37, 81, 53) + getMobileAppStoreResponse().hashCode();
            }
            if (hasFitnessTrackingResponse()) {
                iHashCode = e5.c(iHashCode, 37, 82, 53) + getFitnessTrackingResponse().hashCode();
            }
            if (hasFitnessServiceResponse()) {
                iHashCode = e5.c(iHashCode, 37, 87, 53) + getFitnessServiceResponse().hashCode();
            }
            if (hasFitnessDeviceServiceResponse()) {
                iHashCode = e5.c(iHashCode, 37, 101, 53) + getFitnessDeviceServiceResponse().hashCode();
            }
            if (hasGpsEphemerisResponse()) {
                iHashCode = e5.c(iHashCode, 37, 102, 53) + getGpsEphemerisResponse().hashCode();
            }
            if (hasFitnessSocialServiceResponse()) {
                iHashCode = e5.c(iHashCode, 37, 103, 53) + getFitnessSocialServiceResponse().hashCode();
            }
            if (hasEmergencyAssistanceResponse()) {
                iHashCode = e5.c(iHashCode, 37, 122, 53) + getEmergencyAssistanceResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return ResponseTypesProto.internal_static_CSM_Proto_Service_ServiceResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ServiceResponse.class, Builder.class);
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
            if (hasWeatherResponse() && !getWeatherResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasAuthResponse() && !getAuthResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasTrackerResponse() && !getTrackerResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasMobileAppAuthResponse() && !getMobileAppAuthResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasMobileAppStoreResponse() && !getMobileAppStoreResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasFitnessTrackingResponse() && !getFitnessTrackingResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasFitnessServiceResponse() && !getFitnessServiceResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasFitnessDeviceServiceResponse() && !getFitnessDeviceServiceResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasFitnessSocialServiceResponse() || getFitnessSocialServiceResponse().isInitialized()) {
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
            return new ServiceResponse();
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
                codedOutputStream.writeEnum(2, this.serviceStatus_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.serviceErrMsg_);
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.gcsUuid_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(30, getWeatherResponse());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(47, getAuthResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(70, getGpsFixResponse());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(72, getTrackerResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(80, getMobileAppAuthResponse());
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeMessage(81, getMobileAppStoreResponse());
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeMessage(82, getFitnessTrackingResponse());
            }
            if ((this.bitField0_ & 2048) != 0) {
                codedOutputStream.writeMessage(87, getFitnessServiceResponse());
            }
            if ((this.bitField0_ & 4096) != 0) {
                codedOutputStream.writeMessage(101, getFitnessDeviceServiceResponse());
            }
            if ((this.bitField0_ & 8192) != 0) {
                codedOutputStream.writeMessage(102, getGpsEphemerisResponse());
            }
            if ((this.bitField0_ & 16384) != 0) {
                codedOutputStream.writeMessage(103, getFitnessSocialServiceResponse());
            }
            if ((this.bitField0_ & 32768) != 0) {
                codedOutputStream.writeMessage(122, getEmergencyAssistanceResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceResponseOrBuilder {
            private SingleFieldBuilderV3<Auth.AuthResponse, Auth.AuthResponse.Builder, Auth.AuthResponseOrBuilder> authResponseBuilder_;
            private Auth.AuthResponse authResponse_;
            private int bitField0_;
            private SingleFieldBuilderV3<EmergencyAssistanceProto.EmergencyAssistanceResponse, EmergencyAssistanceProto.EmergencyAssistanceResponse.Builder, EmergencyAssistanceProto.EmergencyAssistanceResponseOrBuilder> emergencyAssistanceResponseBuilder_;
            private EmergencyAssistanceProto.EmergencyAssistanceResponse emergencyAssistanceResponse_;
            private SingleFieldBuilderV3<FitnessDeviceProto.FitnessDeviceServiceResponse, FitnessDeviceProto.FitnessDeviceServiceResponse.Builder, FitnessDeviceProto.FitnessDeviceServiceResponseOrBuilder> fitnessDeviceServiceResponseBuilder_;
            private FitnessDeviceProto.FitnessDeviceServiceResponse fitnessDeviceServiceResponse_;
            private SingleFieldBuilderV3<FitnessProto.FitnessServiceResponse, FitnessProto.FitnessServiceResponse.Builder, FitnessProto.FitnessServiceResponseOrBuilder> fitnessServiceResponseBuilder_;
            private FitnessProto.FitnessServiceResponse fitnessServiceResponse_;
            private SingleFieldBuilderV3<FitnessSocialProto.FitnessSocialServiceResponse, FitnessSocialProto.FitnessSocialServiceResponse.Builder, FitnessSocialProto.FitnessSocialServiceResponseOrBuilder> fitnessSocialServiceResponseBuilder_;
            private FitnessSocialProto.FitnessSocialServiceResponse fitnessSocialServiceResponse_;
            private SingleFieldBuilderV3<FitnessTrackingProto.FitnessTrackingResponse, FitnessTrackingProto.FitnessTrackingResponse.Builder, FitnessTrackingProto.FitnessTrackingResponseOrBuilder> fitnessTrackingResponseBuilder_;
            private FitnessTrackingProto.FitnessTrackingResponse fitnessTrackingResponse_;
            private Object gcsUuid_;
            private SingleFieldBuilderV3<GpsEphemerisProto.GPSEphemerisResponse, GpsEphemerisProto.GPSEphemerisResponse.Builder, GpsEphemerisProto.GPSEphemerisResponseOrBuilder> gpsEphemerisResponseBuilder_;
            private GpsEphemerisProto.GPSEphemerisResponse gpsEphemerisResponse_;
            private SingleFieldBuilderV3<GpsFixProto.GpsFixResponse, GpsFixProto.GpsFixResponse.Builder, GpsFixProto.GpsFixResponseOrBuilder> gpsFixResponseBuilder_;
            private GpsFixProto.GpsFixResponse gpsFixResponse_;
            private SingleFieldBuilderV3<Auth.MobileAppAuthResponse, Auth.MobileAppAuthResponse.Builder, Auth.MobileAppAuthResponseOrBuilder> mobileAppAuthResponseBuilder_;
            private Auth.MobileAppAuthResponse mobileAppAuthResponse_;
            private SingleFieldBuilderV3<Auth.MobileAppStoreResponse, Auth.MobileAppStoreResponse.Builder, Auth.MobileAppStoreResponseOrBuilder> mobileAppStoreResponseBuilder_;
            private Auth.MobileAppStoreResponse mobileAppStoreResponse_;
            private int sequenceNum_;
            private Object serviceErrMsg_;
            private int serviceStatus_;
            private SingleFieldBuilderV3<TrackerProto.TrackerResponse, TrackerProto.TrackerResponse.Builder, TrackerProto.TrackerResponseOrBuilder> trackerResponseBuilder_;
            private TrackerProto.TrackerResponse trackerResponse_;
            private SingleFieldBuilderV3<WeatherProto.WeatherResponse, WeatherProto.WeatherResponse.Builder, WeatherProto.WeatherResponseOrBuilder> weatherResponseBuilder_;
            private WeatherProto.WeatherResponse weatherResponse_;

            private Builder() {
                this.serviceStatus_ = 0;
                this.serviceErrMsg_ = "";
                this.gcsUuid_ = "";
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ServiceResponse serviceResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    serviceResponse.sequenceNum_ = this.sequenceNum_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    serviceResponse.serviceStatus_ = this.serviceStatus_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    serviceResponse.serviceErrMsg_ = this.serviceErrMsg_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    serviceResponse.gcsUuid_ = this.gcsUuid_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<WeatherProto.WeatherResponse, WeatherProto.WeatherResponse.Builder, WeatherProto.WeatherResponseOrBuilder> singleFieldBuilderV3 = this.weatherResponseBuilder_;
                    serviceResponse.weatherResponse_ = singleFieldBuilderV3 == null ? this.weatherResponse_ : (WeatherProto.WeatherResponse) singleFieldBuilderV3.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<Auth.AuthResponse, Auth.AuthResponse.Builder, Auth.AuthResponseOrBuilder> singleFieldBuilderV4 = this.authResponseBuilder_;
                    serviceResponse.authResponse_ = singleFieldBuilderV4 == null ? this.authResponse_ : (Auth.AuthResponse) singleFieldBuilderV4.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<GpsFixProto.GpsFixResponse, GpsFixProto.GpsFixResponse.Builder, GpsFixProto.GpsFixResponseOrBuilder> singleFieldBuilderV5 = this.gpsFixResponseBuilder_;
                    serviceResponse.gpsFixResponse_ = singleFieldBuilderV5 == null ? this.gpsFixResponse_ : (GpsFixProto.GpsFixResponse) singleFieldBuilderV5.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<TrackerProto.TrackerResponse, TrackerProto.TrackerResponse.Builder, TrackerProto.TrackerResponseOrBuilder> singleFieldBuilderV6 = this.trackerResponseBuilder_;
                    serviceResponse.trackerResponse_ = singleFieldBuilderV6 == null ? this.trackerResponse_ : (TrackerProto.TrackerResponse) singleFieldBuilderV6.build();
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    SingleFieldBuilderV3<Auth.MobileAppAuthResponse, Auth.MobileAppAuthResponse.Builder, Auth.MobileAppAuthResponseOrBuilder> singleFieldBuilderV7 = this.mobileAppAuthResponseBuilder_;
                    serviceResponse.mobileAppAuthResponse_ = singleFieldBuilderV7 == null ? this.mobileAppAuthResponse_ : (Auth.MobileAppAuthResponse) singleFieldBuilderV7.build();
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    SingleFieldBuilderV3<Auth.MobileAppStoreResponse, Auth.MobileAppStoreResponse.Builder, Auth.MobileAppStoreResponseOrBuilder> singleFieldBuilderV8 = this.mobileAppStoreResponseBuilder_;
                    serviceResponse.mobileAppStoreResponse_ = singleFieldBuilderV8 == null ? this.mobileAppStoreResponse_ : (Auth.MobileAppStoreResponse) singleFieldBuilderV8.build();
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    SingleFieldBuilderV3<FitnessTrackingProto.FitnessTrackingResponse, FitnessTrackingProto.FitnessTrackingResponse.Builder, FitnessTrackingProto.FitnessTrackingResponseOrBuilder> singleFieldBuilderV9 = this.fitnessTrackingResponseBuilder_;
                    serviceResponse.fitnessTrackingResponse_ = singleFieldBuilderV9 == null ? this.fitnessTrackingResponse_ : (FitnessTrackingProto.FitnessTrackingResponse) singleFieldBuilderV9.build();
                    i14 |= 1024;
                }
                if ((i15 & 2048) != 0) {
                    SingleFieldBuilderV3<FitnessProto.FitnessServiceResponse, FitnessProto.FitnessServiceResponse.Builder, FitnessProto.FitnessServiceResponseOrBuilder> singleFieldBuilderV10 = this.fitnessServiceResponseBuilder_;
                    serviceResponse.fitnessServiceResponse_ = singleFieldBuilderV10 == null ? this.fitnessServiceResponse_ : (FitnessProto.FitnessServiceResponse) singleFieldBuilderV10.build();
                    i14 |= 2048;
                }
                if ((i15 & 4096) != 0) {
                    SingleFieldBuilderV3<FitnessDeviceProto.FitnessDeviceServiceResponse, FitnessDeviceProto.FitnessDeviceServiceResponse.Builder, FitnessDeviceProto.FitnessDeviceServiceResponseOrBuilder> singleFieldBuilderV11 = this.fitnessDeviceServiceResponseBuilder_;
                    serviceResponse.fitnessDeviceServiceResponse_ = singleFieldBuilderV11 == null ? this.fitnessDeviceServiceResponse_ : (FitnessDeviceProto.FitnessDeviceServiceResponse) singleFieldBuilderV11.build();
                    i14 |= 4096;
                }
                if ((i15 & 8192) != 0) {
                    SingleFieldBuilderV3<GpsEphemerisProto.GPSEphemerisResponse, GpsEphemerisProto.GPSEphemerisResponse.Builder, GpsEphemerisProto.GPSEphemerisResponseOrBuilder> singleFieldBuilderV12 = this.gpsEphemerisResponseBuilder_;
                    serviceResponse.gpsEphemerisResponse_ = singleFieldBuilderV12 == null ? this.gpsEphemerisResponse_ : (GpsEphemerisProto.GPSEphemerisResponse) singleFieldBuilderV12.build();
                    i14 |= 8192;
                }
                if ((i15 & 16384) != 0) {
                    SingleFieldBuilderV3<FitnessSocialProto.FitnessSocialServiceResponse, FitnessSocialProto.FitnessSocialServiceResponse.Builder, FitnessSocialProto.FitnessSocialServiceResponseOrBuilder> singleFieldBuilderV13 = this.fitnessSocialServiceResponseBuilder_;
                    serviceResponse.fitnessSocialServiceResponse_ = singleFieldBuilderV13 == null ? this.fitnessSocialServiceResponse_ : (FitnessSocialProto.FitnessSocialServiceResponse) singleFieldBuilderV13.build();
                    i14 |= 16384;
                }
                if ((i15 & 32768) != 0) {
                    SingleFieldBuilderV3<EmergencyAssistanceProto.EmergencyAssistanceResponse, EmergencyAssistanceProto.EmergencyAssistanceResponse.Builder, EmergencyAssistanceProto.EmergencyAssistanceResponseOrBuilder> singleFieldBuilderV14 = this.emergencyAssistanceResponseBuilder_;
                    serviceResponse.emergencyAssistanceResponse_ = singleFieldBuilderV14 == null ? this.emergencyAssistanceResponse_ : (EmergencyAssistanceProto.EmergencyAssistanceResponse) singleFieldBuilderV14.build();
                    i14 |= 32768;
                }
                serviceResponse.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<Auth.AuthResponse, Auth.AuthResponse.Builder, Auth.AuthResponseOrBuilder> getAuthResponseFieldBuilder() {
                if (this.authResponseBuilder_ == null) {
                    this.authResponseBuilder_ = new SingleFieldBuilderV3<>(getAuthResponse(), getParentForChildren(), isClean());
                    this.authResponse_ = null;
                }
                return this.authResponseBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return ResponseTypesProto.internal_static_CSM_Proto_Service_ServiceResponse_descriptor;
            }

            private SingleFieldBuilderV3<EmergencyAssistanceProto.EmergencyAssistanceResponse, EmergencyAssistanceProto.EmergencyAssistanceResponse.Builder, EmergencyAssistanceProto.EmergencyAssistanceResponseOrBuilder> getEmergencyAssistanceResponseFieldBuilder() {
                if (this.emergencyAssistanceResponseBuilder_ == null) {
                    this.emergencyAssistanceResponseBuilder_ = new SingleFieldBuilderV3<>(getEmergencyAssistanceResponse(), getParentForChildren(), isClean());
                    this.emergencyAssistanceResponse_ = null;
                }
                return this.emergencyAssistanceResponseBuilder_;
            }

            private SingleFieldBuilderV3<FitnessDeviceProto.FitnessDeviceServiceResponse, FitnessDeviceProto.FitnessDeviceServiceResponse.Builder, FitnessDeviceProto.FitnessDeviceServiceResponseOrBuilder> getFitnessDeviceServiceResponseFieldBuilder() {
                if (this.fitnessDeviceServiceResponseBuilder_ == null) {
                    this.fitnessDeviceServiceResponseBuilder_ = new SingleFieldBuilderV3<>(getFitnessDeviceServiceResponse(), getParentForChildren(), isClean());
                    this.fitnessDeviceServiceResponse_ = null;
                }
                return this.fitnessDeviceServiceResponseBuilder_;
            }

            private SingleFieldBuilderV3<FitnessProto.FitnessServiceResponse, FitnessProto.FitnessServiceResponse.Builder, FitnessProto.FitnessServiceResponseOrBuilder> getFitnessServiceResponseFieldBuilder() {
                if (this.fitnessServiceResponseBuilder_ == null) {
                    this.fitnessServiceResponseBuilder_ = new SingleFieldBuilderV3<>(getFitnessServiceResponse(), getParentForChildren(), isClean());
                    this.fitnessServiceResponse_ = null;
                }
                return this.fitnessServiceResponseBuilder_;
            }

            private SingleFieldBuilderV3<FitnessSocialProto.FitnessSocialServiceResponse, FitnessSocialProto.FitnessSocialServiceResponse.Builder, FitnessSocialProto.FitnessSocialServiceResponseOrBuilder> getFitnessSocialServiceResponseFieldBuilder() {
                if (this.fitnessSocialServiceResponseBuilder_ == null) {
                    this.fitnessSocialServiceResponseBuilder_ = new SingleFieldBuilderV3<>(getFitnessSocialServiceResponse(), getParentForChildren(), isClean());
                    this.fitnessSocialServiceResponse_ = null;
                }
                return this.fitnessSocialServiceResponseBuilder_;
            }

            private SingleFieldBuilderV3<FitnessTrackingProto.FitnessTrackingResponse, FitnessTrackingProto.FitnessTrackingResponse.Builder, FitnessTrackingProto.FitnessTrackingResponseOrBuilder> getFitnessTrackingResponseFieldBuilder() {
                if (this.fitnessTrackingResponseBuilder_ == null) {
                    this.fitnessTrackingResponseBuilder_ = new SingleFieldBuilderV3<>(getFitnessTrackingResponse(), getParentForChildren(), isClean());
                    this.fitnessTrackingResponse_ = null;
                }
                return this.fitnessTrackingResponseBuilder_;
            }

            private SingleFieldBuilderV3<GpsEphemerisProto.GPSEphemerisResponse, GpsEphemerisProto.GPSEphemerisResponse.Builder, GpsEphemerisProto.GPSEphemerisResponseOrBuilder> getGpsEphemerisResponseFieldBuilder() {
                if (this.gpsEphemerisResponseBuilder_ == null) {
                    this.gpsEphemerisResponseBuilder_ = new SingleFieldBuilderV3<>(getGpsEphemerisResponse(), getParentForChildren(), isClean());
                    this.gpsEphemerisResponse_ = null;
                }
                return this.gpsEphemerisResponseBuilder_;
            }

            private SingleFieldBuilderV3<GpsFixProto.GpsFixResponse, GpsFixProto.GpsFixResponse.Builder, GpsFixProto.GpsFixResponseOrBuilder> getGpsFixResponseFieldBuilder() {
                if (this.gpsFixResponseBuilder_ == null) {
                    this.gpsFixResponseBuilder_ = new SingleFieldBuilderV3<>(getGpsFixResponse(), getParentForChildren(), isClean());
                    this.gpsFixResponse_ = null;
                }
                return this.gpsFixResponseBuilder_;
            }

            private SingleFieldBuilderV3<Auth.MobileAppAuthResponse, Auth.MobileAppAuthResponse.Builder, Auth.MobileAppAuthResponseOrBuilder> getMobileAppAuthResponseFieldBuilder() {
                if (this.mobileAppAuthResponseBuilder_ == null) {
                    this.mobileAppAuthResponseBuilder_ = new SingleFieldBuilderV3<>(getMobileAppAuthResponse(), getParentForChildren(), isClean());
                    this.mobileAppAuthResponse_ = null;
                }
                return this.mobileAppAuthResponseBuilder_;
            }

            private SingleFieldBuilderV3<Auth.MobileAppStoreResponse, Auth.MobileAppStoreResponse.Builder, Auth.MobileAppStoreResponseOrBuilder> getMobileAppStoreResponseFieldBuilder() {
                if (this.mobileAppStoreResponseBuilder_ == null) {
                    this.mobileAppStoreResponseBuilder_ = new SingleFieldBuilderV3<>(getMobileAppStoreResponse(), getParentForChildren(), isClean());
                    this.mobileAppStoreResponse_ = null;
                }
                return this.mobileAppStoreResponseBuilder_;
            }

            private SingleFieldBuilderV3<TrackerProto.TrackerResponse, TrackerProto.TrackerResponse.Builder, TrackerProto.TrackerResponseOrBuilder> getTrackerResponseFieldBuilder() {
                if (this.trackerResponseBuilder_ == null) {
                    this.trackerResponseBuilder_ = new SingleFieldBuilderV3<>(getTrackerResponse(), getParentForChildren(), isClean());
                    this.trackerResponse_ = null;
                }
                return this.trackerResponseBuilder_;
            }

            private SingleFieldBuilderV3<WeatherProto.WeatherResponse, WeatherProto.WeatherResponse.Builder, WeatherProto.WeatherResponseOrBuilder> getWeatherResponseFieldBuilder() {
                if (this.weatherResponseBuilder_ == null) {
                    this.weatherResponseBuilder_ = new SingleFieldBuilderV3<>(getWeatherResponse(), getParentForChildren(), isClean());
                    this.weatherResponse_ = null;
                }
                return this.weatherResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getWeatherResponseFieldBuilder();
                    getAuthResponseFieldBuilder();
                    getGpsFixResponseFieldBuilder();
                    getTrackerResponseFieldBuilder();
                    getMobileAppAuthResponseFieldBuilder();
                    getMobileAppStoreResponseFieldBuilder();
                    getFitnessTrackingResponseFieldBuilder();
                    getFitnessServiceResponseFieldBuilder();
                    getFitnessDeviceServiceResponseFieldBuilder();
                    getGpsEphemerisResponseFieldBuilder();
                    getFitnessSocialServiceResponseFieldBuilder();
                    getEmergencyAssistanceResponseFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ServiceResponse build() {
                ServiceResponse serviceResponseBuildPartial = buildPartial();
                if (serviceResponseBuildPartial.isInitialized()) {
                    return serviceResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) serviceResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ServiceResponse buildPartial() {
                ServiceResponse serviceResponse = new ServiceResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(serviceResponse);
                }
                onBuilt();
                return serviceResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.sequenceNum_ = 0;
                this.serviceStatus_ = 0;
                this.serviceErrMsg_ = "";
                this.gcsUuid_ = "";
                this.weatherResponse_ = null;
                SingleFieldBuilderV3<WeatherProto.WeatherResponse, WeatherProto.WeatherResponse.Builder, WeatherProto.WeatherResponseOrBuilder> singleFieldBuilderV3 = this.weatherResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.weatherResponseBuilder_ = null;
                }
                this.authResponse_ = null;
                SingleFieldBuilderV3<Auth.AuthResponse, Auth.AuthResponse.Builder, Auth.AuthResponseOrBuilder> singleFieldBuilderV4 = this.authResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.authResponseBuilder_ = null;
                }
                this.gpsFixResponse_ = null;
                SingleFieldBuilderV3<GpsFixProto.GpsFixResponse, GpsFixProto.GpsFixResponse.Builder, GpsFixProto.GpsFixResponseOrBuilder> singleFieldBuilderV5 = this.gpsFixResponseBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.gpsFixResponseBuilder_ = null;
                }
                this.trackerResponse_ = null;
                SingleFieldBuilderV3<TrackerProto.TrackerResponse, TrackerProto.TrackerResponse.Builder, TrackerProto.TrackerResponseOrBuilder> singleFieldBuilderV6 = this.trackerResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.trackerResponseBuilder_ = null;
                }
                this.mobileAppAuthResponse_ = null;
                SingleFieldBuilderV3<Auth.MobileAppAuthResponse, Auth.MobileAppAuthResponse.Builder, Auth.MobileAppAuthResponseOrBuilder> singleFieldBuilderV7 = this.mobileAppAuthResponseBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.mobileAppAuthResponseBuilder_ = null;
                }
                this.mobileAppStoreResponse_ = null;
                SingleFieldBuilderV3<Auth.MobileAppStoreResponse, Auth.MobileAppStoreResponse.Builder, Auth.MobileAppStoreResponseOrBuilder> singleFieldBuilderV8 = this.mobileAppStoreResponseBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.mobileAppStoreResponseBuilder_ = null;
                }
                this.fitnessTrackingResponse_ = null;
                SingleFieldBuilderV3<FitnessTrackingProto.FitnessTrackingResponse, FitnessTrackingProto.FitnessTrackingResponse.Builder, FitnessTrackingProto.FitnessTrackingResponseOrBuilder> singleFieldBuilderV9 = this.fitnessTrackingResponseBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.fitnessTrackingResponseBuilder_ = null;
                }
                this.fitnessServiceResponse_ = null;
                SingleFieldBuilderV3<FitnessProto.FitnessServiceResponse, FitnessProto.FitnessServiceResponse.Builder, FitnessProto.FitnessServiceResponseOrBuilder> singleFieldBuilderV10 = this.fitnessServiceResponseBuilder_;
                if (singleFieldBuilderV10 != null) {
                    singleFieldBuilderV10.dispose();
                    this.fitnessServiceResponseBuilder_ = null;
                }
                this.fitnessDeviceServiceResponse_ = null;
                SingleFieldBuilderV3<FitnessDeviceProto.FitnessDeviceServiceResponse, FitnessDeviceProto.FitnessDeviceServiceResponse.Builder, FitnessDeviceProto.FitnessDeviceServiceResponseOrBuilder> singleFieldBuilderV11 = this.fitnessDeviceServiceResponseBuilder_;
                if (singleFieldBuilderV11 != null) {
                    singleFieldBuilderV11.dispose();
                    this.fitnessDeviceServiceResponseBuilder_ = null;
                }
                this.gpsEphemerisResponse_ = null;
                SingleFieldBuilderV3<GpsEphemerisProto.GPSEphemerisResponse, GpsEphemerisProto.GPSEphemerisResponse.Builder, GpsEphemerisProto.GPSEphemerisResponseOrBuilder> singleFieldBuilderV12 = this.gpsEphemerisResponseBuilder_;
                if (singleFieldBuilderV12 != null) {
                    singleFieldBuilderV12.dispose();
                    this.gpsEphemerisResponseBuilder_ = null;
                }
                this.fitnessSocialServiceResponse_ = null;
                SingleFieldBuilderV3<FitnessSocialProto.FitnessSocialServiceResponse, FitnessSocialProto.FitnessSocialServiceResponse.Builder, FitnessSocialProto.FitnessSocialServiceResponseOrBuilder> singleFieldBuilderV13 = this.fitnessSocialServiceResponseBuilder_;
                if (singleFieldBuilderV13 != null) {
                    singleFieldBuilderV13.dispose();
                    this.fitnessSocialServiceResponseBuilder_ = null;
                }
                this.emergencyAssistanceResponse_ = null;
                SingleFieldBuilderV3<EmergencyAssistanceProto.EmergencyAssistanceResponse, EmergencyAssistanceProto.EmergencyAssistanceResponse.Builder, EmergencyAssistanceProto.EmergencyAssistanceResponseOrBuilder> singleFieldBuilderV14 = this.emergencyAssistanceResponseBuilder_;
                if (singleFieldBuilderV14 != null) {
                    singleFieldBuilderV14.dispose();
                    this.emergencyAssistanceResponseBuilder_ = null;
                }
                return this;
            }

            public Builder clearAuthResponse() {
                this.bitField0_ &= -33;
                this.authResponse_ = null;
                SingleFieldBuilderV3<Auth.AuthResponse, Auth.AuthResponse.Builder, Auth.AuthResponseOrBuilder> singleFieldBuilderV3 = this.authResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.authResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearEmergencyAssistanceResponse() {
                this.bitField0_ &= -32769;
                this.emergencyAssistanceResponse_ = null;
                SingleFieldBuilderV3<EmergencyAssistanceProto.EmergencyAssistanceResponse, EmergencyAssistanceProto.EmergencyAssistanceResponse.Builder, EmergencyAssistanceProto.EmergencyAssistanceResponseOrBuilder> singleFieldBuilderV3 = this.emergencyAssistanceResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.emergencyAssistanceResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearFitnessDeviceServiceResponse() {
                this.bitField0_ &= -4097;
                this.fitnessDeviceServiceResponse_ = null;
                SingleFieldBuilderV3<FitnessDeviceProto.FitnessDeviceServiceResponse, FitnessDeviceProto.FitnessDeviceServiceResponse.Builder, FitnessDeviceProto.FitnessDeviceServiceResponseOrBuilder> singleFieldBuilderV3 = this.fitnessDeviceServiceResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.fitnessDeviceServiceResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearFitnessServiceResponse() {
                this.bitField0_ &= -2049;
                this.fitnessServiceResponse_ = null;
                SingleFieldBuilderV3<FitnessProto.FitnessServiceResponse, FitnessProto.FitnessServiceResponse.Builder, FitnessProto.FitnessServiceResponseOrBuilder> singleFieldBuilderV3 = this.fitnessServiceResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.fitnessServiceResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearFitnessSocialServiceResponse() {
                this.bitField0_ &= -16385;
                this.fitnessSocialServiceResponse_ = null;
                SingleFieldBuilderV3<FitnessSocialProto.FitnessSocialServiceResponse, FitnessSocialProto.FitnessSocialServiceResponse.Builder, FitnessSocialProto.FitnessSocialServiceResponseOrBuilder> singleFieldBuilderV3 = this.fitnessSocialServiceResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.fitnessSocialServiceResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearFitnessTrackingResponse() {
                this.bitField0_ &= -1025;
                this.fitnessTrackingResponse_ = null;
                SingleFieldBuilderV3<FitnessTrackingProto.FitnessTrackingResponse, FitnessTrackingProto.FitnessTrackingResponse.Builder, FitnessTrackingProto.FitnessTrackingResponseOrBuilder> singleFieldBuilderV3 = this.fitnessTrackingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.fitnessTrackingResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearGcsUuid() {
                this.gcsUuid_ = ServiceResponse.getDefaultInstance().getGcsUuid();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearGpsEphemerisResponse() {
                this.bitField0_ &= -8193;
                this.gpsEphemerisResponse_ = null;
                SingleFieldBuilderV3<GpsEphemerisProto.GPSEphemerisResponse, GpsEphemerisProto.GPSEphemerisResponse.Builder, GpsEphemerisProto.GPSEphemerisResponseOrBuilder> singleFieldBuilderV3 = this.gpsEphemerisResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.gpsEphemerisResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearGpsFixResponse() {
                this.bitField0_ &= -65;
                this.gpsFixResponse_ = null;
                SingleFieldBuilderV3<GpsFixProto.GpsFixResponse, GpsFixProto.GpsFixResponse.Builder, GpsFixProto.GpsFixResponseOrBuilder> singleFieldBuilderV3 = this.gpsFixResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.gpsFixResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearMobileAppAuthResponse() {
                this.bitField0_ &= -257;
                this.mobileAppAuthResponse_ = null;
                SingleFieldBuilderV3<Auth.MobileAppAuthResponse, Auth.MobileAppAuthResponse.Builder, Auth.MobileAppAuthResponseOrBuilder> singleFieldBuilderV3 = this.mobileAppAuthResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.mobileAppAuthResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearMobileAppStoreResponse() {
                this.bitField0_ &= -513;
                this.mobileAppStoreResponse_ = null;
                SingleFieldBuilderV3<Auth.MobileAppStoreResponse, Auth.MobileAppStoreResponse.Builder, Auth.MobileAppStoreResponseOrBuilder> singleFieldBuilderV3 = this.mobileAppStoreResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.mobileAppStoreResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSequenceNum() {
                this.bitField0_ &= -2;
                this.sequenceNum_ = 0;
                onChanged();
                return this;
            }

            public Builder clearServiceErrMsg() {
                this.serviceErrMsg_ = ServiceResponse.getDefaultInstance().getServiceErrMsg();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearServiceStatus() {
                this.bitField0_ &= -3;
                this.serviceStatus_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTrackerResponse() {
                this.bitField0_ &= -129;
                this.trackerResponse_ = null;
                SingleFieldBuilderV3<TrackerProto.TrackerResponse, TrackerProto.TrackerResponse.Builder, TrackerProto.TrackerResponseOrBuilder> singleFieldBuilderV3 = this.trackerResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.trackerResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearWeatherResponse() {
                this.bitField0_ &= -17;
                this.weatherResponse_ = null;
                SingleFieldBuilderV3<WeatherProto.WeatherResponse, WeatherProto.WeatherResponse.Builder, WeatherProto.WeatherResponseOrBuilder> singleFieldBuilderV3 = this.weatherResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.weatherResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public Auth.AuthResponse getAuthResponse() {
                SingleFieldBuilderV3<Auth.AuthResponse, Auth.AuthResponse.Builder, Auth.AuthResponseOrBuilder> singleFieldBuilderV3 = this.authResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Auth.AuthResponse) singleFieldBuilderV3.getMessage();
                }
                Auth.AuthResponse authResponse = this.authResponse_;
                return authResponse == null ? Auth.AuthResponse.getDefaultInstance() : authResponse;
            }

            public Auth.AuthResponse.Builder getAuthResponseBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (Auth.AuthResponse.Builder) getAuthResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public Auth.AuthResponseOrBuilder getAuthResponseOrBuilder() {
                SingleFieldBuilderV3<Auth.AuthResponse, Auth.AuthResponse.Builder, Auth.AuthResponseOrBuilder> singleFieldBuilderV3 = this.authResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Auth.AuthResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Auth.AuthResponse authResponse = this.authResponse_;
                return authResponse == null ? Auth.AuthResponse.getDefaultInstance() : authResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return ResponseTypesProto.internal_static_CSM_Proto_Service_ServiceResponse_descriptor;
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public EmergencyAssistanceProto.EmergencyAssistanceResponse getEmergencyAssistanceResponse() {
                SingleFieldBuilderV3<EmergencyAssistanceProto.EmergencyAssistanceResponse, EmergencyAssistanceProto.EmergencyAssistanceResponse.Builder, EmergencyAssistanceProto.EmergencyAssistanceResponseOrBuilder> singleFieldBuilderV3 = this.emergencyAssistanceResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EmergencyAssistanceProto.EmergencyAssistanceResponse) singleFieldBuilderV3.getMessage();
                }
                EmergencyAssistanceProto.EmergencyAssistanceResponse emergencyAssistanceResponse = this.emergencyAssistanceResponse_;
                return emergencyAssistanceResponse == null ? EmergencyAssistanceProto.EmergencyAssistanceResponse.getDefaultInstance() : emergencyAssistanceResponse;
            }

            public EmergencyAssistanceProto.EmergencyAssistanceResponse.Builder getEmergencyAssistanceResponseBuilder() {
                this.bitField0_ |= 32768;
                onChanged();
                return (EmergencyAssistanceProto.EmergencyAssistanceResponse.Builder) getEmergencyAssistanceResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public EmergencyAssistanceProto.EmergencyAssistanceResponseOrBuilder getEmergencyAssistanceResponseOrBuilder() {
                SingleFieldBuilderV3<EmergencyAssistanceProto.EmergencyAssistanceResponse, EmergencyAssistanceProto.EmergencyAssistanceResponse.Builder, EmergencyAssistanceProto.EmergencyAssistanceResponseOrBuilder> singleFieldBuilderV3 = this.emergencyAssistanceResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EmergencyAssistanceProto.EmergencyAssistanceResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                EmergencyAssistanceProto.EmergencyAssistanceResponse emergencyAssistanceResponse = this.emergencyAssistanceResponse_;
                return emergencyAssistanceResponse == null ? EmergencyAssistanceProto.EmergencyAssistanceResponse.getDefaultInstance() : emergencyAssistanceResponse;
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public FitnessDeviceProto.FitnessDeviceServiceResponse getFitnessDeviceServiceResponse() {
                SingleFieldBuilderV3<FitnessDeviceProto.FitnessDeviceServiceResponse, FitnessDeviceProto.FitnessDeviceServiceResponse.Builder, FitnessDeviceProto.FitnessDeviceServiceResponseOrBuilder> singleFieldBuilderV3 = this.fitnessDeviceServiceResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FitnessDeviceProto.FitnessDeviceServiceResponse) singleFieldBuilderV3.getMessage();
                }
                FitnessDeviceProto.FitnessDeviceServiceResponse fitnessDeviceServiceResponse = this.fitnessDeviceServiceResponse_;
                return fitnessDeviceServiceResponse == null ? FitnessDeviceProto.FitnessDeviceServiceResponse.getDefaultInstance() : fitnessDeviceServiceResponse;
            }

            public FitnessDeviceProto.FitnessDeviceServiceResponse.Builder getFitnessDeviceServiceResponseBuilder() {
                this.bitField0_ |= 4096;
                onChanged();
                return (FitnessDeviceProto.FitnessDeviceServiceResponse.Builder) getFitnessDeviceServiceResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public FitnessDeviceProto.FitnessDeviceServiceResponseOrBuilder getFitnessDeviceServiceResponseOrBuilder() {
                SingleFieldBuilderV3<FitnessDeviceProto.FitnessDeviceServiceResponse, FitnessDeviceProto.FitnessDeviceServiceResponse.Builder, FitnessDeviceProto.FitnessDeviceServiceResponseOrBuilder> singleFieldBuilderV3 = this.fitnessDeviceServiceResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FitnessDeviceProto.FitnessDeviceServiceResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                FitnessDeviceProto.FitnessDeviceServiceResponse fitnessDeviceServiceResponse = this.fitnessDeviceServiceResponse_;
                return fitnessDeviceServiceResponse == null ? FitnessDeviceProto.FitnessDeviceServiceResponse.getDefaultInstance() : fitnessDeviceServiceResponse;
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public FitnessProto.FitnessServiceResponse getFitnessServiceResponse() {
                SingleFieldBuilderV3<FitnessProto.FitnessServiceResponse, FitnessProto.FitnessServiceResponse.Builder, FitnessProto.FitnessServiceResponseOrBuilder> singleFieldBuilderV3 = this.fitnessServiceResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FitnessProto.FitnessServiceResponse) singleFieldBuilderV3.getMessage();
                }
                FitnessProto.FitnessServiceResponse fitnessServiceResponse = this.fitnessServiceResponse_;
                return fitnessServiceResponse == null ? FitnessProto.FitnessServiceResponse.getDefaultInstance() : fitnessServiceResponse;
            }

            public FitnessProto.FitnessServiceResponse.Builder getFitnessServiceResponseBuilder() {
                this.bitField0_ |= 2048;
                onChanged();
                return (FitnessProto.FitnessServiceResponse.Builder) getFitnessServiceResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public FitnessProto.FitnessServiceResponseOrBuilder getFitnessServiceResponseOrBuilder() {
                SingleFieldBuilderV3<FitnessProto.FitnessServiceResponse, FitnessProto.FitnessServiceResponse.Builder, FitnessProto.FitnessServiceResponseOrBuilder> singleFieldBuilderV3 = this.fitnessServiceResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FitnessProto.FitnessServiceResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                FitnessProto.FitnessServiceResponse fitnessServiceResponse = this.fitnessServiceResponse_;
                return fitnessServiceResponse == null ? FitnessProto.FitnessServiceResponse.getDefaultInstance() : fitnessServiceResponse;
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public FitnessSocialProto.FitnessSocialServiceResponse getFitnessSocialServiceResponse() {
                SingleFieldBuilderV3<FitnessSocialProto.FitnessSocialServiceResponse, FitnessSocialProto.FitnessSocialServiceResponse.Builder, FitnessSocialProto.FitnessSocialServiceResponseOrBuilder> singleFieldBuilderV3 = this.fitnessSocialServiceResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FitnessSocialProto.FitnessSocialServiceResponse) singleFieldBuilderV3.getMessage();
                }
                FitnessSocialProto.FitnessSocialServiceResponse fitnessSocialServiceResponse = this.fitnessSocialServiceResponse_;
                return fitnessSocialServiceResponse == null ? FitnessSocialProto.FitnessSocialServiceResponse.getDefaultInstance() : fitnessSocialServiceResponse;
            }

            public FitnessSocialProto.FitnessSocialServiceResponse.Builder getFitnessSocialServiceResponseBuilder() {
                this.bitField0_ |= 16384;
                onChanged();
                return (FitnessSocialProto.FitnessSocialServiceResponse.Builder) getFitnessSocialServiceResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public FitnessSocialProto.FitnessSocialServiceResponseOrBuilder getFitnessSocialServiceResponseOrBuilder() {
                SingleFieldBuilderV3<FitnessSocialProto.FitnessSocialServiceResponse, FitnessSocialProto.FitnessSocialServiceResponse.Builder, FitnessSocialProto.FitnessSocialServiceResponseOrBuilder> singleFieldBuilderV3 = this.fitnessSocialServiceResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FitnessSocialProto.FitnessSocialServiceResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                FitnessSocialProto.FitnessSocialServiceResponse fitnessSocialServiceResponse = this.fitnessSocialServiceResponse_;
                return fitnessSocialServiceResponse == null ? FitnessSocialProto.FitnessSocialServiceResponse.getDefaultInstance() : fitnessSocialServiceResponse;
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public FitnessTrackingProto.FitnessTrackingResponse getFitnessTrackingResponse() {
                SingleFieldBuilderV3<FitnessTrackingProto.FitnessTrackingResponse, FitnessTrackingProto.FitnessTrackingResponse.Builder, FitnessTrackingProto.FitnessTrackingResponseOrBuilder> singleFieldBuilderV3 = this.fitnessTrackingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FitnessTrackingProto.FitnessTrackingResponse) singleFieldBuilderV3.getMessage();
                }
                FitnessTrackingProto.FitnessTrackingResponse fitnessTrackingResponse = this.fitnessTrackingResponse_;
                return fitnessTrackingResponse == null ? FitnessTrackingProto.FitnessTrackingResponse.getDefaultInstance() : fitnessTrackingResponse;
            }

            public FitnessTrackingProto.FitnessTrackingResponse.Builder getFitnessTrackingResponseBuilder() {
                this.bitField0_ |= 1024;
                onChanged();
                return (FitnessTrackingProto.FitnessTrackingResponse.Builder) getFitnessTrackingResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public FitnessTrackingProto.FitnessTrackingResponseOrBuilder getFitnessTrackingResponseOrBuilder() {
                SingleFieldBuilderV3<FitnessTrackingProto.FitnessTrackingResponse, FitnessTrackingProto.FitnessTrackingResponse.Builder, FitnessTrackingProto.FitnessTrackingResponseOrBuilder> singleFieldBuilderV3 = this.fitnessTrackingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FitnessTrackingProto.FitnessTrackingResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                FitnessTrackingProto.FitnessTrackingResponse fitnessTrackingResponse = this.fitnessTrackingResponse_;
                return fitnessTrackingResponse == null ? FitnessTrackingProto.FitnessTrackingResponse.getDefaultInstance() : fitnessTrackingResponse;
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public String getGcsUuid() {
                Object obj = this.gcsUuid_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.gcsUuid_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public ByteString getGcsUuidBytes() {
                Object obj = this.gcsUuid_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.gcsUuid_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public GpsEphemerisProto.GPSEphemerisResponse getGpsEphemerisResponse() {
                SingleFieldBuilderV3<GpsEphemerisProto.GPSEphemerisResponse, GpsEphemerisProto.GPSEphemerisResponse.Builder, GpsEphemerisProto.GPSEphemerisResponseOrBuilder> singleFieldBuilderV3 = this.gpsEphemerisResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GpsEphemerisProto.GPSEphemerisResponse) singleFieldBuilderV3.getMessage();
                }
                GpsEphemerisProto.GPSEphemerisResponse gPSEphemerisResponse = this.gpsEphemerisResponse_;
                return gPSEphemerisResponse == null ? GpsEphemerisProto.GPSEphemerisResponse.getDefaultInstance() : gPSEphemerisResponse;
            }

            public GpsEphemerisProto.GPSEphemerisResponse.Builder getGpsEphemerisResponseBuilder() {
                this.bitField0_ |= 8192;
                onChanged();
                return (GpsEphemerisProto.GPSEphemerisResponse.Builder) getGpsEphemerisResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public GpsEphemerisProto.GPSEphemerisResponseOrBuilder getGpsEphemerisResponseOrBuilder() {
                SingleFieldBuilderV3<GpsEphemerisProto.GPSEphemerisResponse, GpsEphemerisProto.GPSEphemerisResponse.Builder, GpsEphemerisProto.GPSEphemerisResponseOrBuilder> singleFieldBuilderV3 = this.gpsEphemerisResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GpsEphemerisProto.GPSEphemerisResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GpsEphemerisProto.GPSEphemerisResponse gPSEphemerisResponse = this.gpsEphemerisResponse_;
                return gPSEphemerisResponse == null ? GpsEphemerisProto.GPSEphemerisResponse.getDefaultInstance() : gPSEphemerisResponse;
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public GpsFixProto.GpsFixResponse getGpsFixResponse() {
                SingleFieldBuilderV3<GpsFixProto.GpsFixResponse, GpsFixProto.GpsFixResponse.Builder, GpsFixProto.GpsFixResponseOrBuilder> singleFieldBuilderV3 = this.gpsFixResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GpsFixProto.GpsFixResponse) singleFieldBuilderV3.getMessage();
                }
                GpsFixProto.GpsFixResponse gpsFixResponse = this.gpsFixResponse_;
                return gpsFixResponse == null ? GpsFixProto.GpsFixResponse.getDefaultInstance() : gpsFixResponse;
            }

            public GpsFixProto.GpsFixResponse.Builder getGpsFixResponseBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (GpsFixProto.GpsFixResponse.Builder) getGpsFixResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public GpsFixProto.GpsFixResponseOrBuilder getGpsFixResponseOrBuilder() {
                SingleFieldBuilderV3<GpsFixProto.GpsFixResponse, GpsFixProto.GpsFixResponse.Builder, GpsFixProto.GpsFixResponseOrBuilder> singleFieldBuilderV3 = this.gpsFixResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GpsFixProto.GpsFixResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GpsFixProto.GpsFixResponse gpsFixResponse = this.gpsFixResponse_;
                return gpsFixResponse == null ? GpsFixProto.GpsFixResponse.getDefaultInstance() : gpsFixResponse;
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public Auth.MobileAppAuthResponse getMobileAppAuthResponse() {
                SingleFieldBuilderV3<Auth.MobileAppAuthResponse, Auth.MobileAppAuthResponse.Builder, Auth.MobileAppAuthResponseOrBuilder> singleFieldBuilderV3 = this.mobileAppAuthResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Auth.MobileAppAuthResponse) singleFieldBuilderV3.getMessage();
                }
                Auth.MobileAppAuthResponse mobileAppAuthResponse = this.mobileAppAuthResponse_;
                return mobileAppAuthResponse == null ? Auth.MobileAppAuthResponse.getDefaultInstance() : mobileAppAuthResponse;
            }

            public Auth.MobileAppAuthResponse.Builder getMobileAppAuthResponseBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (Auth.MobileAppAuthResponse.Builder) getMobileAppAuthResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public Auth.MobileAppAuthResponseOrBuilder getMobileAppAuthResponseOrBuilder() {
                SingleFieldBuilderV3<Auth.MobileAppAuthResponse, Auth.MobileAppAuthResponse.Builder, Auth.MobileAppAuthResponseOrBuilder> singleFieldBuilderV3 = this.mobileAppAuthResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Auth.MobileAppAuthResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Auth.MobileAppAuthResponse mobileAppAuthResponse = this.mobileAppAuthResponse_;
                return mobileAppAuthResponse == null ? Auth.MobileAppAuthResponse.getDefaultInstance() : mobileAppAuthResponse;
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public Auth.MobileAppStoreResponse getMobileAppStoreResponse() {
                SingleFieldBuilderV3<Auth.MobileAppStoreResponse, Auth.MobileAppStoreResponse.Builder, Auth.MobileAppStoreResponseOrBuilder> singleFieldBuilderV3 = this.mobileAppStoreResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Auth.MobileAppStoreResponse) singleFieldBuilderV3.getMessage();
                }
                Auth.MobileAppStoreResponse mobileAppStoreResponse = this.mobileAppStoreResponse_;
                return mobileAppStoreResponse == null ? Auth.MobileAppStoreResponse.getDefaultInstance() : mobileAppStoreResponse;
            }

            public Auth.MobileAppStoreResponse.Builder getMobileAppStoreResponseBuilder() {
                this.bitField0_ |= 512;
                onChanged();
                return (Auth.MobileAppStoreResponse.Builder) getMobileAppStoreResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public Auth.MobileAppStoreResponseOrBuilder getMobileAppStoreResponseOrBuilder() {
                SingleFieldBuilderV3<Auth.MobileAppStoreResponse, Auth.MobileAppStoreResponse.Builder, Auth.MobileAppStoreResponseOrBuilder> singleFieldBuilderV3 = this.mobileAppStoreResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Auth.MobileAppStoreResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Auth.MobileAppStoreResponse mobileAppStoreResponse = this.mobileAppStoreResponse_;
                return mobileAppStoreResponse == null ? Auth.MobileAppStoreResponse.getDefaultInstance() : mobileAppStoreResponse;
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public int getSequenceNum() {
                return this.sequenceNum_;
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public String getServiceErrMsg() {
                Object obj = this.serviceErrMsg_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.serviceErrMsg_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public ByteString getServiceErrMsgBytes() {
                Object obj = this.serviceErrMsg_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.serviceErrMsg_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public ServiceStatus getServiceStatus() {
                ServiceStatus serviceStatusForNumber = ServiceStatus.forNumber(this.serviceStatus_);
                return serviceStatusForNumber == null ? ServiceStatus.OK : serviceStatusForNumber;
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public TrackerProto.TrackerResponse getTrackerResponse() {
                SingleFieldBuilderV3<TrackerProto.TrackerResponse, TrackerProto.TrackerResponse.Builder, TrackerProto.TrackerResponseOrBuilder> singleFieldBuilderV3 = this.trackerResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrackerProto.TrackerResponse) singleFieldBuilderV3.getMessage();
                }
                TrackerProto.TrackerResponse trackerResponse = this.trackerResponse_;
                return trackerResponse == null ? TrackerProto.TrackerResponse.getDefaultInstance() : trackerResponse;
            }

            public TrackerProto.TrackerResponse.Builder getTrackerResponseBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (TrackerProto.TrackerResponse.Builder) getTrackerResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public TrackerProto.TrackerResponseOrBuilder getTrackerResponseOrBuilder() {
                SingleFieldBuilderV3<TrackerProto.TrackerResponse, TrackerProto.TrackerResponse.Builder, TrackerProto.TrackerResponseOrBuilder> singleFieldBuilderV3 = this.trackerResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TrackerProto.TrackerResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TrackerProto.TrackerResponse trackerResponse = this.trackerResponse_;
                return trackerResponse == null ? TrackerProto.TrackerResponse.getDefaultInstance() : trackerResponse;
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public WeatherProto.WeatherResponse getWeatherResponse() {
                SingleFieldBuilderV3<WeatherProto.WeatherResponse, WeatherProto.WeatherResponse.Builder, WeatherProto.WeatherResponseOrBuilder> singleFieldBuilderV3 = this.weatherResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WeatherProto.WeatherResponse) singleFieldBuilderV3.getMessage();
                }
                WeatherProto.WeatherResponse weatherResponse = this.weatherResponse_;
                return weatherResponse == null ? WeatherProto.WeatherResponse.getDefaultInstance() : weatherResponse;
            }

            public WeatherProto.WeatherResponse.Builder getWeatherResponseBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (WeatherProto.WeatherResponse.Builder) getWeatherResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public WeatherProto.WeatherResponseOrBuilder getWeatherResponseOrBuilder() {
                SingleFieldBuilderV3<WeatherProto.WeatherResponse, WeatherProto.WeatherResponse.Builder, WeatherProto.WeatherResponseOrBuilder> singleFieldBuilderV3 = this.weatherResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WeatherProto.WeatherResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                WeatherProto.WeatherResponse weatherResponse = this.weatherResponse_;
                return weatherResponse == null ? WeatherProto.WeatherResponse.getDefaultInstance() : weatherResponse;
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public boolean hasAuthResponse() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public boolean hasEmergencyAssistanceResponse() {
                return (this.bitField0_ & 32768) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public boolean hasFitnessDeviceServiceResponse() {
                return (this.bitField0_ & 4096) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public boolean hasFitnessServiceResponse() {
                return (this.bitField0_ & 2048) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public boolean hasFitnessSocialServiceResponse() {
                return (this.bitField0_ & 16384) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public boolean hasFitnessTrackingResponse() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public boolean hasGcsUuid() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public boolean hasGpsEphemerisResponse() {
                return (this.bitField0_ & 8192) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public boolean hasGpsFixResponse() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public boolean hasMobileAppAuthResponse() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public boolean hasMobileAppStoreResponse() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public boolean hasSequenceNum() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public boolean hasServiceErrMsg() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public boolean hasServiceStatus() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public boolean hasTrackerResponse() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceResponseOrBuilder
            public boolean hasWeatherResponse() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return ResponseTypesProto.internal_static_CSM_Proto_Service_ServiceResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ServiceResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasWeatherResponse() && !getWeatherResponse().isInitialized()) {
                    return false;
                }
                if (hasAuthResponse() && !getAuthResponse().isInitialized()) {
                    return false;
                }
                if (hasTrackerResponse() && !getTrackerResponse().isInitialized()) {
                    return false;
                }
                if (hasMobileAppAuthResponse() && !getMobileAppAuthResponse().isInitialized()) {
                    return false;
                }
                if (hasMobileAppStoreResponse() && !getMobileAppStoreResponse().isInitialized()) {
                    return false;
                }
                if (hasFitnessTrackingResponse() && !getFitnessTrackingResponse().isInitialized()) {
                    return false;
                }
                if (hasFitnessServiceResponse() && !getFitnessServiceResponse().isInitialized()) {
                    return false;
                }
                if (!hasFitnessDeviceServiceResponse() || getFitnessDeviceServiceResponse().isInitialized()) {
                    return !hasFitnessSocialServiceResponse() || getFitnessSocialServiceResponse().isInitialized();
                }
                return false;
            }

            public Builder mergeAuthResponse(Auth.AuthResponse authResponse) {
                Auth.AuthResponse authResponse2;
                SingleFieldBuilderV3<Auth.AuthResponse, Auth.AuthResponse.Builder, Auth.AuthResponseOrBuilder> singleFieldBuilderV3 = this.authResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(authResponse);
                } else if ((this.bitField0_ & 32) == 0 || (authResponse2 = this.authResponse_) == null || authResponse2 == Auth.AuthResponse.getDefaultInstance()) {
                    this.authResponse_ = authResponse;
                } else {
                    getAuthResponseBuilder().mergeFrom(authResponse);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder mergeEmergencyAssistanceResponse(EmergencyAssistanceProto.EmergencyAssistanceResponse emergencyAssistanceResponse) {
                EmergencyAssistanceProto.EmergencyAssistanceResponse emergencyAssistanceResponse2;
                SingleFieldBuilderV3<EmergencyAssistanceProto.EmergencyAssistanceResponse, EmergencyAssistanceProto.EmergencyAssistanceResponse.Builder, EmergencyAssistanceProto.EmergencyAssistanceResponseOrBuilder> singleFieldBuilderV3 = this.emergencyAssistanceResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(emergencyAssistanceResponse);
                } else if ((this.bitField0_ & 32768) == 0 || (emergencyAssistanceResponse2 = this.emergencyAssistanceResponse_) == null || emergencyAssistanceResponse2 == EmergencyAssistanceProto.EmergencyAssistanceResponse.getDefaultInstance()) {
                    this.emergencyAssistanceResponse_ = emergencyAssistanceResponse;
                } else {
                    getEmergencyAssistanceResponseBuilder().mergeFrom(emergencyAssistanceResponse);
                }
                this.bitField0_ |= 32768;
                onChanged();
                return this;
            }

            public Builder mergeFitnessDeviceServiceResponse(FitnessDeviceProto.FitnessDeviceServiceResponse fitnessDeviceServiceResponse) {
                FitnessDeviceProto.FitnessDeviceServiceResponse fitnessDeviceServiceResponse2;
                SingleFieldBuilderV3<FitnessDeviceProto.FitnessDeviceServiceResponse, FitnessDeviceProto.FitnessDeviceServiceResponse.Builder, FitnessDeviceProto.FitnessDeviceServiceResponseOrBuilder> singleFieldBuilderV3 = this.fitnessDeviceServiceResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(fitnessDeviceServiceResponse);
                } else if ((this.bitField0_ & 4096) == 0 || (fitnessDeviceServiceResponse2 = this.fitnessDeviceServiceResponse_) == null || fitnessDeviceServiceResponse2 == FitnessDeviceProto.FitnessDeviceServiceResponse.getDefaultInstance()) {
                    this.fitnessDeviceServiceResponse_ = fitnessDeviceServiceResponse;
                } else {
                    getFitnessDeviceServiceResponseBuilder().mergeFrom(fitnessDeviceServiceResponse);
                }
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder mergeFitnessServiceResponse(FitnessProto.FitnessServiceResponse fitnessServiceResponse) {
                FitnessProto.FitnessServiceResponse fitnessServiceResponse2;
                SingleFieldBuilderV3<FitnessProto.FitnessServiceResponse, FitnessProto.FitnessServiceResponse.Builder, FitnessProto.FitnessServiceResponseOrBuilder> singleFieldBuilderV3 = this.fitnessServiceResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(fitnessServiceResponse);
                } else if ((this.bitField0_ & 2048) == 0 || (fitnessServiceResponse2 = this.fitnessServiceResponse_) == null || fitnessServiceResponse2 == FitnessProto.FitnessServiceResponse.getDefaultInstance()) {
                    this.fitnessServiceResponse_ = fitnessServiceResponse;
                } else {
                    getFitnessServiceResponseBuilder().mergeFrom(fitnessServiceResponse);
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder mergeFitnessSocialServiceResponse(FitnessSocialProto.FitnessSocialServiceResponse fitnessSocialServiceResponse) {
                FitnessSocialProto.FitnessSocialServiceResponse fitnessSocialServiceResponse2;
                SingleFieldBuilderV3<FitnessSocialProto.FitnessSocialServiceResponse, FitnessSocialProto.FitnessSocialServiceResponse.Builder, FitnessSocialProto.FitnessSocialServiceResponseOrBuilder> singleFieldBuilderV3 = this.fitnessSocialServiceResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(fitnessSocialServiceResponse);
                } else if ((this.bitField0_ & 16384) == 0 || (fitnessSocialServiceResponse2 = this.fitnessSocialServiceResponse_) == null || fitnessSocialServiceResponse2 == FitnessSocialProto.FitnessSocialServiceResponse.getDefaultInstance()) {
                    this.fitnessSocialServiceResponse_ = fitnessSocialServiceResponse;
                } else {
                    getFitnessSocialServiceResponseBuilder().mergeFrom(fitnessSocialServiceResponse);
                }
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder mergeFitnessTrackingResponse(FitnessTrackingProto.FitnessTrackingResponse fitnessTrackingResponse) {
                FitnessTrackingProto.FitnessTrackingResponse fitnessTrackingResponse2;
                SingleFieldBuilderV3<FitnessTrackingProto.FitnessTrackingResponse, FitnessTrackingProto.FitnessTrackingResponse.Builder, FitnessTrackingProto.FitnessTrackingResponseOrBuilder> singleFieldBuilderV3 = this.fitnessTrackingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(fitnessTrackingResponse);
                } else if ((this.bitField0_ & 1024) == 0 || (fitnessTrackingResponse2 = this.fitnessTrackingResponse_) == null || fitnessTrackingResponse2 == FitnessTrackingProto.FitnessTrackingResponse.getDefaultInstance()) {
                    this.fitnessTrackingResponse_ = fitnessTrackingResponse;
                } else {
                    getFitnessTrackingResponseBuilder().mergeFrom(fitnessTrackingResponse);
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
                                case 8:
                                    this.sequenceNum_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                    continue;
                                case 16:
                                    int i14 = codedInputStream.readEnum();
                                    if (ServiceStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.serviceStatus_ = i14;
                                        this.bitField0_ |= 2;
                                        continue;
                                    }
                                    break;
                                case 26:
                                    this.serviceErrMsg_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                    continue;
                                case 34:
                                    this.gcsUuid_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 8;
                                    continue;
                                case 242:
                                    codedInputStream.readMessage(getWeatherResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                    continue;
                                case 378:
                                    codedInputStream.readMessage(getAuthResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                    continue;
                                case 562:
                                    codedInputStream.readMessage(getGpsFixResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                    continue;
                                case 578:
                                    codedInputStream.readMessage(getTrackerResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
                                    continue;
                                case 642:
                                    codedInputStream.readMessage(getMobileAppAuthResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 256;
                                    continue;
                                case 650:
                                    codedInputStream.readMessage(getMobileAppStoreResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 512;
                                    continue;
                                case 658:
                                    codedInputStream.readMessage(getFitnessTrackingResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 698:
                                    codedInputStream.readMessage(getFitnessServiceResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2048;
                                    continue;
                                case 810:
                                    codedInputStream.readMessage(getFitnessDeviceServiceResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4096;
                                    continue;
                                case 818:
                                    codedInputStream.readMessage(getGpsEphemerisResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8192;
                                    continue;
                                case 826:
                                    codedInputStream.readMessage(getFitnessSocialServiceResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16384;
                                    continue;
                                case 978:
                                    codedInputStream.readMessage(getEmergencyAssistanceResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32768;
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

            public Builder mergeGpsEphemerisResponse(GpsEphemerisProto.GPSEphemerisResponse gPSEphemerisResponse) {
                GpsEphemerisProto.GPSEphemerisResponse gPSEphemerisResponse2;
                SingleFieldBuilderV3<GpsEphemerisProto.GPSEphemerisResponse, GpsEphemerisProto.GPSEphemerisResponse.Builder, GpsEphemerisProto.GPSEphemerisResponseOrBuilder> singleFieldBuilderV3 = this.gpsEphemerisResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(gPSEphemerisResponse);
                } else if ((this.bitField0_ & 8192) == 0 || (gPSEphemerisResponse2 = this.gpsEphemerisResponse_) == null || gPSEphemerisResponse2 == GpsEphemerisProto.GPSEphemerisResponse.getDefaultInstance()) {
                    this.gpsEphemerisResponse_ = gPSEphemerisResponse;
                } else {
                    getGpsEphemerisResponseBuilder().mergeFrom(gPSEphemerisResponse);
                }
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder mergeGpsFixResponse(GpsFixProto.GpsFixResponse gpsFixResponse) {
                GpsFixProto.GpsFixResponse gpsFixResponse2;
                SingleFieldBuilderV3<GpsFixProto.GpsFixResponse, GpsFixProto.GpsFixResponse.Builder, GpsFixProto.GpsFixResponseOrBuilder> singleFieldBuilderV3 = this.gpsFixResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(gpsFixResponse);
                } else if ((this.bitField0_ & 64) == 0 || (gpsFixResponse2 = this.gpsFixResponse_) == null || gpsFixResponse2 == GpsFixProto.GpsFixResponse.getDefaultInstance()) {
                    this.gpsFixResponse_ = gpsFixResponse;
                } else {
                    getGpsFixResponseBuilder().mergeFrom(gpsFixResponse);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder mergeMobileAppAuthResponse(Auth.MobileAppAuthResponse mobileAppAuthResponse) {
                Auth.MobileAppAuthResponse mobileAppAuthResponse2;
                SingleFieldBuilderV3<Auth.MobileAppAuthResponse, Auth.MobileAppAuthResponse.Builder, Auth.MobileAppAuthResponseOrBuilder> singleFieldBuilderV3 = this.mobileAppAuthResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(mobileAppAuthResponse);
                } else if ((this.bitField0_ & 256) == 0 || (mobileAppAuthResponse2 = this.mobileAppAuthResponse_) == null || mobileAppAuthResponse2 == Auth.MobileAppAuthResponse.getDefaultInstance()) {
                    this.mobileAppAuthResponse_ = mobileAppAuthResponse;
                } else {
                    getMobileAppAuthResponseBuilder().mergeFrom(mobileAppAuthResponse);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder mergeMobileAppStoreResponse(Auth.MobileAppStoreResponse mobileAppStoreResponse) {
                Auth.MobileAppStoreResponse mobileAppStoreResponse2;
                SingleFieldBuilderV3<Auth.MobileAppStoreResponse, Auth.MobileAppStoreResponse.Builder, Auth.MobileAppStoreResponseOrBuilder> singleFieldBuilderV3 = this.mobileAppStoreResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(mobileAppStoreResponse);
                } else if ((this.bitField0_ & 512) == 0 || (mobileAppStoreResponse2 = this.mobileAppStoreResponse_) == null || mobileAppStoreResponse2 == Auth.MobileAppStoreResponse.getDefaultInstance()) {
                    this.mobileAppStoreResponse_ = mobileAppStoreResponse;
                } else {
                    getMobileAppStoreResponseBuilder().mergeFrom(mobileAppStoreResponse);
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder mergeTrackerResponse(TrackerProto.TrackerResponse trackerResponse) {
                TrackerProto.TrackerResponse trackerResponse2;
                SingleFieldBuilderV3<TrackerProto.TrackerResponse, TrackerProto.TrackerResponse.Builder, TrackerProto.TrackerResponseOrBuilder> singleFieldBuilderV3 = this.trackerResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(trackerResponse);
                } else if ((this.bitField0_ & 128) == 0 || (trackerResponse2 = this.trackerResponse_) == null || trackerResponse2 == TrackerProto.TrackerResponse.getDefaultInstance()) {
                    this.trackerResponse_ = trackerResponse;
                } else {
                    getTrackerResponseBuilder().mergeFrom(trackerResponse);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder mergeWeatherResponse(WeatherProto.WeatherResponse weatherResponse) {
                WeatherProto.WeatherResponse weatherResponse2;
                SingleFieldBuilderV3<WeatherProto.WeatherResponse, WeatherProto.WeatherResponse.Builder, WeatherProto.WeatherResponseOrBuilder> singleFieldBuilderV3 = this.weatherResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(weatherResponse);
                } else if ((this.bitField0_ & 16) == 0 || (weatherResponse2 = this.weatherResponse_) == null || weatherResponse2 == WeatherProto.WeatherResponse.getDefaultInstance()) {
                    this.weatherResponse_ = weatherResponse;
                } else {
                    getWeatherResponseBuilder().mergeFrom(weatherResponse);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setAuthResponse(Auth.AuthResponse.Builder builder) {
                SingleFieldBuilderV3<Auth.AuthResponse, Auth.AuthResponse.Builder, Auth.AuthResponseOrBuilder> singleFieldBuilderV3 = this.authResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.authResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setEmergencyAssistanceResponse(EmergencyAssistanceProto.EmergencyAssistanceResponse.Builder builder) {
                SingleFieldBuilderV3<EmergencyAssistanceProto.EmergencyAssistanceResponse, EmergencyAssistanceProto.EmergencyAssistanceResponse.Builder, EmergencyAssistanceProto.EmergencyAssistanceResponseOrBuilder> singleFieldBuilderV3 = this.emergencyAssistanceResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.emergencyAssistanceResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32768;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setFitnessDeviceServiceResponse(FitnessDeviceProto.FitnessDeviceServiceResponse.Builder builder) {
                SingleFieldBuilderV3<FitnessDeviceProto.FitnessDeviceServiceResponse, FitnessDeviceProto.FitnessDeviceServiceResponse.Builder, FitnessDeviceProto.FitnessDeviceServiceResponseOrBuilder> singleFieldBuilderV3 = this.fitnessDeviceServiceResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.fitnessDeviceServiceResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setFitnessServiceResponse(FitnessProto.FitnessServiceResponse.Builder builder) {
                SingleFieldBuilderV3<FitnessProto.FitnessServiceResponse, FitnessProto.FitnessServiceResponse.Builder, FitnessProto.FitnessServiceResponseOrBuilder> singleFieldBuilderV3 = this.fitnessServiceResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.fitnessServiceResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setFitnessSocialServiceResponse(FitnessSocialProto.FitnessSocialServiceResponse.Builder builder) {
                SingleFieldBuilderV3<FitnessSocialProto.FitnessSocialServiceResponse, FitnessSocialProto.FitnessSocialServiceResponse.Builder, FitnessSocialProto.FitnessSocialServiceResponseOrBuilder> singleFieldBuilderV3 = this.fitnessSocialServiceResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.fitnessSocialServiceResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setFitnessTrackingResponse(FitnessTrackingProto.FitnessTrackingResponse.Builder builder) {
                SingleFieldBuilderV3<FitnessTrackingProto.FitnessTrackingResponse, FitnessTrackingProto.FitnessTrackingResponse.Builder, FitnessTrackingProto.FitnessTrackingResponseOrBuilder> singleFieldBuilderV3 = this.fitnessTrackingResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.fitnessTrackingResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setGcsUuid(String str) {
                str.getClass();
                this.gcsUuid_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setGcsUuidBytes(ByteString byteString) {
                byteString.getClass();
                this.gcsUuid_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setGpsEphemerisResponse(GpsEphemerisProto.GPSEphemerisResponse.Builder builder) {
                SingleFieldBuilderV3<GpsEphemerisProto.GPSEphemerisResponse, GpsEphemerisProto.GPSEphemerisResponse.Builder, GpsEphemerisProto.GPSEphemerisResponseOrBuilder> singleFieldBuilderV3 = this.gpsEphemerisResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.gpsEphemerisResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setGpsFixResponse(GpsFixProto.GpsFixResponse.Builder builder) {
                SingleFieldBuilderV3<GpsFixProto.GpsFixResponse, GpsFixProto.GpsFixResponse.Builder, GpsFixProto.GpsFixResponseOrBuilder> singleFieldBuilderV3 = this.gpsFixResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.gpsFixResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setMobileAppAuthResponse(Auth.MobileAppAuthResponse.Builder builder) {
                SingleFieldBuilderV3<Auth.MobileAppAuthResponse, Auth.MobileAppAuthResponse.Builder, Auth.MobileAppAuthResponseOrBuilder> singleFieldBuilderV3 = this.mobileAppAuthResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.mobileAppAuthResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setMobileAppStoreResponse(Auth.MobileAppStoreResponse.Builder builder) {
                SingleFieldBuilderV3<Auth.MobileAppStoreResponse, Auth.MobileAppStoreResponse.Builder, Auth.MobileAppStoreResponseOrBuilder> singleFieldBuilderV3 = this.mobileAppStoreResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.mobileAppStoreResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 512;
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

            public Builder setServiceErrMsg(String str) {
                str.getClass();
                this.serviceErrMsg_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setServiceErrMsgBytes(ByteString byteString) {
                byteString.getClass();
                this.serviceErrMsg_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setServiceStatus(ServiceStatus serviceStatus) {
                serviceStatus.getClass();
                this.bitField0_ |= 2;
                this.serviceStatus_ = serviceStatus.getNumber();
                onChanged();
                return this;
            }

            public Builder setTrackerResponse(TrackerProto.TrackerResponse.Builder builder) {
                SingleFieldBuilderV3<TrackerProto.TrackerResponse, TrackerProto.TrackerResponse.Builder, TrackerProto.TrackerResponseOrBuilder> singleFieldBuilderV3 = this.trackerResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.trackerResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setWeatherResponse(WeatherProto.WeatherResponse.Builder builder) {
                SingleFieldBuilderV3<WeatherProto.WeatherResponse, WeatherProto.WeatherResponse.Builder, WeatherProto.WeatherResponseOrBuilder> singleFieldBuilderV3 = this.weatherResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.weatherResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ServiceResponse getDefaultInstanceForType() {
                return ServiceResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.serviceStatus_ = 0;
                this.serviceErrMsg_ = "";
                this.gcsUuid_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder setAuthResponse(Auth.AuthResponse authResponse) {
                SingleFieldBuilderV3<Auth.AuthResponse, Auth.AuthResponse.Builder, Auth.AuthResponseOrBuilder> singleFieldBuilderV3 = this.authResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    authResponse.getClass();
                    this.authResponse_ = authResponse;
                } else {
                    singleFieldBuilderV3.setMessage(authResponse);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setFitnessDeviceServiceResponse(FitnessDeviceProto.FitnessDeviceServiceResponse fitnessDeviceServiceResponse) {
                SingleFieldBuilderV3<FitnessDeviceProto.FitnessDeviceServiceResponse, FitnessDeviceProto.FitnessDeviceServiceResponse.Builder, FitnessDeviceProto.FitnessDeviceServiceResponseOrBuilder> singleFieldBuilderV3 = this.fitnessDeviceServiceResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    fitnessDeviceServiceResponse.getClass();
                    this.fitnessDeviceServiceResponse_ = fitnessDeviceServiceResponse;
                } else {
                    singleFieldBuilderV3.setMessage(fitnessDeviceServiceResponse);
                }
                this.bitField0_ |= 4096;
                onChanged();
                return this;
            }

            public Builder setFitnessServiceResponse(FitnessProto.FitnessServiceResponse fitnessServiceResponse) {
                SingleFieldBuilderV3<FitnessProto.FitnessServiceResponse, FitnessProto.FitnessServiceResponse.Builder, FitnessProto.FitnessServiceResponseOrBuilder> singleFieldBuilderV3 = this.fitnessServiceResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    fitnessServiceResponse.getClass();
                    this.fitnessServiceResponse_ = fitnessServiceResponse;
                } else {
                    singleFieldBuilderV3.setMessage(fitnessServiceResponse);
                }
                this.bitField0_ |= 2048;
                onChanged();
                return this;
            }

            public Builder setFitnessSocialServiceResponse(FitnessSocialProto.FitnessSocialServiceResponse fitnessSocialServiceResponse) {
                SingleFieldBuilderV3<FitnessSocialProto.FitnessSocialServiceResponse, FitnessSocialProto.FitnessSocialServiceResponse.Builder, FitnessSocialProto.FitnessSocialServiceResponseOrBuilder> singleFieldBuilderV3 = this.fitnessSocialServiceResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    fitnessSocialServiceResponse.getClass();
                    this.fitnessSocialServiceResponse_ = fitnessSocialServiceResponse;
                } else {
                    singleFieldBuilderV3.setMessage(fitnessSocialServiceResponse);
                }
                this.bitField0_ |= 16384;
                onChanged();
                return this;
            }

            public Builder setFitnessTrackingResponse(FitnessTrackingProto.FitnessTrackingResponse fitnessTrackingResponse) {
                SingleFieldBuilderV3<FitnessTrackingProto.FitnessTrackingResponse, FitnessTrackingProto.FitnessTrackingResponse.Builder, FitnessTrackingProto.FitnessTrackingResponseOrBuilder> singleFieldBuilderV3 = this.fitnessTrackingResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    fitnessTrackingResponse.getClass();
                    this.fitnessTrackingResponse_ = fitnessTrackingResponse;
                } else {
                    singleFieldBuilderV3.setMessage(fitnessTrackingResponse);
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setGpsEphemerisResponse(GpsEphemerisProto.GPSEphemerisResponse gPSEphemerisResponse) {
                SingleFieldBuilderV3<GpsEphemerisProto.GPSEphemerisResponse, GpsEphemerisProto.GPSEphemerisResponse.Builder, GpsEphemerisProto.GPSEphemerisResponseOrBuilder> singleFieldBuilderV3 = this.gpsEphemerisResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    gPSEphemerisResponse.getClass();
                    this.gpsEphemerisResponse_ = gPSEphemerisResponse;
                } else {
                    singleFieldBuilderV3.setMessage(gPSEphemerisResponse);
                }
                this.bitField0_ |= 8192;
                onChanged();
                return this;
            }

            public Builder setGpsFixResponse(GpsFixProto.GpsFixResponse gpsFixResponse) {
                SingleFieldBuilderV3<GpsFixProto.GpsFixResponse, GpsFixProto.GpsFixResponse.Builder, GpsFixProto.GpsFixResponseOrBuilder> singleFieldBuilderV3 = this.gpsFixResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    gpsFixResponse.getClass();
                    this.gpsFixResponse_ = gpsFixResponse;
                } else {
                    singleFieldBuilderV3.setMessage(gpsFixResponse);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setMobileAppAuthResponse(Auth.MobileAppAuthResponse mobileAppAuthResponse) {
                SingleFieldBuilderV3<Auth.MobileAppAuthResponse, Auth.MobileAppAuthResponse.Builder, Auth.MobileAppAuthResponseOrBuilder> singleFieldBuilderV3 = this.mobileAppAuthResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    mobileAppAuthResponse.getClass();
                    this.mobileAppAuthResponse_ = mobileAppAuthResponse;
                } else {
                    singleFieldBuilderV3.setMessage(mobileAppAuthResponse);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setMobileAppStoreResponse(Auth.MobileAppStoreResponse mobileAppStoreResponse) {
                SingleFieldBuilderV3<Auth.MobileAppStoreResponse, Auth.MobileAppStoreResponse.Builder, Auth.MobileAppStoreResponseOrBuilder> singleFieldBuilderV3 = this.mobileAppStoreResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    mobileAppStoreResponse.getClass();
                    this.mobileAppStoreResponse_ = mobileAppStoreResponse;
                } else {
                    singleFieldBuilderV3.setMessage(mobileAppStoreResponse);
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setTrackerResponse(TrackerProto.TrackerResponse trackerResponse) {
                SingleFieldBuilderV3<TrackerProto.TrackerResponse, TrackerProto.TrackerResponse.Builder, TrackerProto.TrackerResponseOrBuilder> singleFieldBuilderV3 = this.trackerResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    trackerResponse.getClass();
                    this.trackerResponse_ = trackerResponse;
                } else {
                    singleFieldBuilderV3.setMessage(trackerResponse);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setWeatherResponse(WeatherProto.WeatherResponse weatherResponse) {
                SingleFieldBuilderV3<WeatherProto.WeatherResponse, WeatherProto.WeatherResponse.Builder, WeatherProto.WeatherResponseOrBuilder> singleFieldBuilderV3 = this.weatherResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    weatherResponse.getClass();
                    this.weatherResponse_ = weatherResponse;
                } else {
                    singleFieldBuilderV3.setMessage(weatherResponse);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setEmergencyAssistanceResponse(EmergencyAssistanceProto.EmergencyAssistanceResponse emergencyAssistanceResponse) {
                SingleFieldBuilderV3<EmergencyAssistanceProto.EmergencyAssistanceResponse, EmergencyAssistanceProto.EmergencyAssistanceResponse.Builder, EmergencyAssistanceProto.EmergencyAssistanceResponseOrBuilder> singleFieldBuilderV3 = this.emergencyAssistanceResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    emergencyAssistanceResponse.getClass();
                    this.emergencyAssistanceResponse_ = emergencyAssistanceResponse;
                } else {
                    singleFieldBuilderV3.setMessage(emergencyAssistanceResponse);
                }
                this.bitField0_ |= 32768;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ServiceResponse) {
                    return mergeFrom((ServiceResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ServiceResponse serviceResponse) {
                if (serviceResponse == ServiceResponse.getDefaultInstance()) {
                    return this;
                }
                if (serviceResponse.hasSequenceNum()) {
                    setSequenceNum(serviceResponse.getSequenceNum());
                }
                if (serviceResponse.hasServiceStatus()) {
                    setServiceStatus(serviceResponse.getServiceStatus());
                }
                if (serviceResponse.hasServiceErrMsg()) {
                    this.serviceErrMsg_ = serviceResponse.serviceErrMsg_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (serviceResponse.hasGcsUuid()) {
                    this.gcsUuid_ = serviceResponse.gcsUuid_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (serviceResponse.hasWeatherResponse()) {
                    mergeWeatherResponse(serviceResponse.getWeatherResponse());
                }
                if (serviceResponse.hasAuthResponse()) {
                    mergeAuthResponse(serviceResponse.getAuthResponse());
                }
                if (serviceResponse.hasGpsFixResponse()) {
                    mergeGpsFixResponse(serviceResponse.getGpsFixResponse());
                }
                if (serviceResponse.hasTrackerResponse()) {
                    mergeTrackerResponse(serviceResponse.getTrackerResponse());
                }
                if (serviceResponse.hasMobileAppAuthResponse()) {
                    mergeMobileAppAuthResponse(serviceResponse.getMobileAppAuthResponse());
                }
                if (serviceResponse.hasMobileAppStoreResponse()) {
                    mergeMobileAppStoreResponse(serviceResponse.getMobileAppStoreResponse());
                }
                if (serviceResponse.hasFitnessTrackingResponse()) {
                    mergeFitnessTrackingResponse(serviceResponse.getFitnessTrackingResponse());
                }
                if (serviceResponse.hasFitnessServiceResponse()) {
                    mergeFitnessServiceResponse(serviceResponse.getFitnessServiceResponse());
                }
                if (serviceResponse.hasFitnessDeviceServiceResponse()) {
                    mergeFitnessDeviceServiceResponse(serviceResponse.getFitnessDeviceServiceResponse());
                }
                if (serviceResponse.hasGpsEphemerisResponse()) {
                    mergeGpsEphemerisResponse(serviceResponse.getGpsEphemerisResponse());
                }
                if (serviceResponse.hasFitnessSocialServiceResponse()) {
                    mergeFitnessSocialServiceResponse(serviceResponse.getFitnessSocialServiceResponse());
                }
                if (serviceResponse.hasEmergencyAssistanceResponse()) {
                    mergeEmergencyAssistanceResponse(serviceResponse.getEmergencyAssistanceResponse());
                }
                mergeUnknownFields(serviceResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ServiceResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ServiceResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ServiceResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ServiceResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ServiceResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ServiceResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ServiceResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ServiceResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ServiceResponse parseFrom(InputStream inputStream) {
            return (ServiceResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ServiceResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ServiceResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ServiceResponse parseFrom(CodedInputStream codedInputStream) {
            return (ServiceResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ServiceResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ServiceResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private ServiceResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.sequenceNum_ = 0;
            this.serviceStatus_ = 0;
            this.serviceErrMsg_ = "";
            this.gcsUuid_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ ServiceResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public enum ServiceStatus implements ProtocolMessageEnum {
        OK(0),
        PROVIDER_UNAVAILABLE(1),
        MISSING_PARAMETERS(2),
        OUT_OF_RANGE_VALUES(3),
        UNKNOWN_SERVICE(4),
        NOT_AUTHORIZED_AT_LOCATION(5),
        DATA_UNAVAILABLE(6),
        UNHANDLED_EXCEPTION(7),
        INVALID_INPUT(8),
        INTERNAL_ERROR(9),
        BAD_PROVIDER(10),
        SERVICE_TIME_OUT(11);

        public static final int BAD_PROVIDER_VALUE = 10;
        public static final int DATA_UNAVAILABLE_VALUE = 6;
        public static final int INTERNAL_ERROR_VALUE = 9;
        public static final int INVALID_INPUT_VALUE = 8;
        public static final int MISSING_PARAMETERS_VALUE = 2;
        public static final int NOT_AUTHORIZED_AT_LOCATION_VALUE = 5;
        public static final int OK_VALUE = 0;
        public static final int OUT_OF_RANGE_VALUES_VALUE = 3;
        public static final int PROVIDER_UNAVAILABLE_VALUE = 1;
        public static final int SERVICE_TIME_OUT_VALUE = 11;
        public static final int UNHANDLED_EXCEPTION_VALUE = 7;
        public static final int UNKNOWN_SERVICE_VALUE = 4;
        private final int value;
        private static final Internal.EnumLiteMap<ServiceStatus> internalValueMap = new Internal.EnumLiteMap<ServiceStatus>() { // from class: com.garmin.gcsprotos.generated.ResponseTypesProto.ServiceStatus.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ServiceStatus findValueByNumber(int i14) {
                return ServiceStatus.forNumber(i14);
            }
        };
        private static final ServiceStatus[] VALUES = values();

        ServiceStatus(int i14) {
            this.value = i14;
        }

        public static ServiceStatus forNumber(int i14) {
            switch (i14) {
                case 0:
                    return OK;
                case 1:
                    return PROVIDER_UNAVAILABLE;
                case 2:
                    return MISSING_PARAMETERS;
                case 3:
                    return OUT_OF_RANGE_VALUES;
                case 4:
                    return UNKNOWN_SERVICE;
                case 5:
                    return NOT_AUTHORIZED_AT_LOCATION;
                case 6:
                    return DATA_UNAVAILABLE;
                case 7:
                    return UNHANDLED_EXCEPTION;
                case 8:
                    return INVALID_INPUT;
                case 9:
                    return INTERNAL_ERROR;
                case 10:
                    return BAD_PROVIDER;
                case 11:
                    return SERVICE_TIME_OUT;
                default:
                    return null;
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return ResponseTypesProto.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<ServiceStatus> internalGetValueMap() {
            return internalValueMap;
        }

        public static ServiceStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static ServiceStatus valueOf(int i14) {
            return forNumber(i14);
        }
    }
}
