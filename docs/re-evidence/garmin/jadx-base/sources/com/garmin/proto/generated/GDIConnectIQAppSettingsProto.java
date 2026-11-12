package com.garmin.proto.generated;

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

/* JADX INFO: loaded from: classes11.dex */
public final class GDIConnectIQAppSettingsProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001dGDIConnectIQAppSettings.proto\u0012\u001eGDI.Proto.ConnectIQAppSettings\"¦\b\n\u001bConnectIQAppSettingsService\u0012W\n\u0018get_app_settings_request\u0018\u0001 \u0001(\u000b25.GDI.Proto.ConnectIQAppSettings.GetAppSettingsRequest\u0012Y\n\u0019get_app_settings_response\u0018\u0002 \u0001(\u000b26.GDI.Proto.ConnectIQAppSettings.GetAppSettingsResponse\u0012Y\n\u0019save_app_settings_request\u0018\u0003 \u0001(\u000b26.GDI.Proto.ConnectIQAppSettings.SaveAppSettingsRequest\u0012[\n\u001asave_app_settings_response\u0018\u0004 \u0001(\u000b27.GDI.Proto.ConnectIQAppSettings.SaveAppSettingsResponse\u0012Y\n\u0019send_app_settings_request\u0018\u0005 \u0001(\u000b26.GDI.Proto.ConnectIQAppSettings.SendAppSettingsRequest\u0012[\n\u001asend_app_settings_response\u0018\u0006 \u0001(\u000b27.GDI.Proto.ConnectIQAppSettings.SendAppSettingsResponse\u0012Y\n\u0019open_app_settings_request\u0018\u0007 \u0001(\u000b26.GDI.Proto.ConnectIQAppSettings.OpenAppSettingsRequest\u0012[\n\u001aopen_app_settings_response\u0018\b \u0001(\u000b27.GDI.Proto.ConnectIQAppSettings.OpenAppSettingsResponse\u0012]\n\u001bverify_app_settings_request\u0018\t \u0001(\u000b28.GDI.Proto.ConnectIQAppSettings.VerifyAppSettingsRequest\u0012_\n\u001cverify_app_settings_response\u0018\n \u0001(\u000b29.GDI.Proto.ConnectIQAppSettings.VerifyAppSettingsResponse\u0012k\n\"verified_app_settings_notification\u0018\u000b \u0001(\u000b2?.GDI.Proto.ConnectIQAppSettings.VerifiedAppSettingsNotification\"/\n\u0015GetAppSettingsRequest\u0012\u0016\n\u000eapp_identifier\u0018\u0001 \u0002(\f\"É\u0001\n\u0016GetAppSettingsResponse\u0012\u0016\n\u000eapp_identifier\u0018\u0001 \u0002(\f\u0012Q\n\bresponse\u0018\u0002 \u0001(\u000e2?.GDI.Proto.ConnectIQAppSettings.GetAppSettingsResponse.Response\"D\n\bResponse\u0012\u0014\n\u0010UNKNOWN_RESPONSE\u0010\u0000\u0012\u000b\n\u0007SUCCESS\u0010\u0001\u0012\u0015\n\u0011APP_NOT_INSTALLED\u0010\u0002\"I\n\u0016SendAppSettingsRequest\u0012\u0016\n\u000eapp_identifier\u0018\u0001 \u0002(\f\u0012\u0017\n\u000fsettings_values\u0018\u0002 \u0001(\f\"\u009c\u0001\n\u0017SendAppSettingsResponse\u0012R\n\bresponse\u0018\u0001 \u0001(\u000e2@.GDI.Proto.ConnectIQAppSettings.SendAppSettingsResponse.Response\"-\n\bResponse\u0012\u0014\n\u0010UNKNOWN_RESPONSE\u0010\u0000\u0012\u000b\n\u0007SUCCESS\u0010\u0001\"I\n\u0016SaveAppSettingsRequest\u0012\u0016\n\u000eapp_identifier\u0018\u0001 \u0002(\f\u0012\u0017\n\u000fsettings_values\u0018\u0002 \u0001(\f\"È\u0001\n\u0017SaveAppSettingsResponse\u0012\u0016\n\u000eapp_identifier\u0018\u0001 \u0002(\f\u0012R\n\bresponse\u0018\u0002 \u0001(\u000e2@.GDI.Proto.ConnectIQAppSettings.SaveAppSettingsResponse.Response\"A\n\bResponse\u0012\u0014\n\u0010UNKNOWN_RESPONSE\u0010\u0000\u0012\u000b\n\u0007SUCCESS\u0010\u0001\u0012\u0012\n\u000eFAILED_TO_SAVE\u0010\u0002\",\n\u0016OpenAppSettingsRequest\u0012\u0012\n\nstore_uuid\u0018\u0001 \u0002(\f\"¾\u0001\n\u0017OpenAppSettingsResponse\u0012\u0016\n\u000eapp_identifier\u0018\u0001 \u0002(\f\u0012V\n\u0006status\u0018\u0002 \u0002(\u000e2F.GDI.Proto.ConnectIQAppSettings.OpenAppSettingsResponse.ResponseStatus\"3\n\u000eResponseStatus\u0012\u0014\n\u0010UNKNOWN_RESPONSE\u0010\u0000\u0012\u000b\n\u0007SUCCESS\u0010\u0001\"J\n\u0018VerifyAppSettingsRequest\u0012\u0012\n\nstore_uuid\u0018\u0001 \u0002(\f\u0012\u000b\n\u0003key\u0018\u0002 \u0002(\f\u0012\r\n\u0005value\u0018\u0003 \u0001(\f\"Û\u0001\n\u0019VerifyAppSettingsResponse\u0012\u0012\n\nstore_uuid\u0018\u0001 \u0002(\f\u0012X\n\u0006status\u0018\u0002 \u0001(\u000e2H.GDI.Proto.ConnectIQAppSettings.VerifyAppSettingsResponse.ResponseStatus\"P\n\u000eResponseStatus\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u0006\n\u0002OK\u0010\u0001\u0012\u0015\n\u0011APP_NOT_INSTALLED\u0010\u0002\u0012\u0012\n\u000eAPP_CANNOT_RUN\u0010\u0003\"ý\u0001\n\u001fVerifiedAppSettingsNotification\u0012\u0012\n\nstore_uuid\u0018\u0001 \u0002(\f\u0012\u000b\n\u0003key\u0018\u0002 \u0001(\f\u0012V\n\u0006result\u0018\u0003 \u0001(\u000e2F.GDI.Proto.ConnectIQAppSettings.VerifiedAppSettingsNotification.Result\u0012\r\n\u0005error\u0018\u0004 \u0001(\f\"R\n\u0006Result\u0012\f\n\bVERIFIED\u0010\u0000\u0012\u0011\n\rUNKNOWN_ERROR\u0010\u0001\u0012\r\n\tAPP_ERROR\u0010\u0002\u0012\u0018\n\u0014VERIFICIATION_FAILED\u0010\u0003B<\n\u001acom.garmin.proto.generatedB\u001cGDIConnectIQAppSettingsProtoH\u0003"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQAppSettings_ConnectIQAppSettingsService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQAppSettings_ConnectIQAppSettingsService_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQAppSettings_GetAppSettingsRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQAppSettings_GetAppSettingsRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQAppSettings_GetAppSettingsResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQAppSettings_GetAppSettingsResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQAppSettings_OpenAppSettingsRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQAppSettings_OpenAppSettingsRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQAppSettings_OpenAppSettingsResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQAppSettings_OpenAppSettingsResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQAppSettings_SaveAppSettingsRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQAppSettings_SaveAppSettingsRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQAppSettings_SaveAppSettingsResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQAppSettings_SaveAppSettingsResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQAppSettings_SendAppSettingsRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQAppSettings_SendAppSettingsRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQAppSettings_SendAppSettingsResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQAppSettings_SendAppSettingsResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQAppSettings_VerifiedAppSettingsNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQAppSettings_VerifiedAppSettingsNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQAppSettings_VerifyAppSettingsRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQAppSettings_VerifyAppSettingsRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQAppSettings_VerifyAppSettingsResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQAppSettings_VerifyAppSettingsResponse_fieldAccessorTable;

    public interface ConnectIQAppSettingsServiceOrBuilder extends MessageOrBuilder {
        GetAppSettingsRequest getGetAppSettingsRequest();

        GetAppSettingsRequestOrBuilder getGetAppSettingsRequestOrBuilder();

        GetAppSettingsResponse getGetAppSettingsResponse();

        GetAppSettingsResponseOrBuilder getGetAppSettingsResponseOrBuilder();

        OpenAppSettingsRequest getOpenAppSettingsRequest();

        OpenAppSettingsRequestOrBuilder getOpenAppSettingsRequestOrBuilder();

        OpenAppSettingsResponse getOpenAppSettingsResponse();

        OpenAppSettingsResponseOrBuilder getOpenAppSettingsResponseOrBuilder();

        SaveAppSettingsRequest getSaveAppSettingsRequest();

        SaveAppSettingsRequestOrBuilder getSaveAppSettingsRequestOrBuilder();

        SaveAppSettingsResponse getSaveAppSettingsResponse();

        SaveAppSettingsResponseOrBuilder getSaveAppSettingsResponseOrBuilder();

        SendAppSettingsRequest getSendAppSettingsRequest();

        SendAppSettingsRequestOrBuilder getSendAppSettingsRequestOrBuilder();

        SendAppSettingsResponse getSendAppSettingsResponse();

        SendAppSettingsResponseOrBuilder getSendAppSettingsResponseOrBuilder();

        VerifiedAppSettingsNotification getVerifiedAppSettingsNotification();

        VerifiedAppSettingsNotificationOrBuilder getVerifiedAppSettingsNotificationOrBuilder();

        VerifyAppSettingsRequest getVerifyAppSettingsRequest();

        VerifyAppSettingsRequestOrBuilder getVerifyAppSettingsRequestOrBuilder();

        VerifyAppSettingsResponse getVerifyAppSettingsResponse();

        VerifyAppSettingsResponseOrBuilder getVerifyAppSettingsResponseOrBuilder();

        boolean hasGetAppSettingsRequest();

        boolean hasGetAppSettingsResponse();

        boolean hasOpenAppSettingsRequest();

        boolean hasOpenAppSettingsResponse();

        boolean hasSaveAppSettingsRequest();

        boolean hasSaveAppSettingsResponse();

        boolean hasSendAppSettingsRequest();

        boolean hasSendAppSettingsResponse();

        boolean hasVerifiedAppSettingsNotification();

        boolean hasVerifyAppSettingsRequest();

        boolean hasVerifyAppSettingsResponse();
    }

    public interface GetAppSettingsRequestOrBuilder extends MessageOrBuilder {
        ByteString getAppIdentifier();

        boolean hasAppIdentifier();
    }

    public interface GetAppSettingsResponseOrBuilder extends MessageOrBuilder {
        ByteString getAppIdentifier();

        GetAppSettingsResponse.Response getResponse();

        boolean hasAppIdentifier();

        boolean hasResponse();
    }

    public interface OpenAppSettingsRequestOrBuilder extends MessageOrBuilder {
        ByteString getStoreUuid();

        boolean hasStoreUuid();
    }

    public interface OpenAppSettingsResponseOrBuilder extends MessageOrBuilder {
        ByteString getAppIdentifier();

        OpenAppSettingsResponse.ResponseStatus getStatus();

        boolean hasAppIdentifier();

        boolean hasStatus();
    }

    public interface SaveAppSettingsRequestOrBuilder extends MessageOrBuilder {
        ByteString getAppIdentifier();

        ByteString getSettingsValues();

        boolean hasAppIdentifier();

        boolean hasSettingsValues();
    }

    public interface SaveAppSettingsResponseOrBuilder extends MessageOrBuilder {
        ByteString getAppIdentifier();

        SaveAppSettingsResponse.Response getResponse();

        boolean hasAppIdentifier();

        boolean hasResponse();
    }

    public interface SendAppSettingsRequestOrBuilder extends MessageOrBuilder {
        ByteString getAppIdentifier();

        ByteString getSettingsValues();

        boolean hasAppIdentifier();

        boolean hasSettingsValues();
    }

    public interface SendAppSettingsResponseOrBuilder extends MessageOrBuilder {
        SendAppSettingsResponse.Response getResponse();

        boolean hasResponse();
    }

    public interface VerifiedAppSettingsNotificationOrBuilder extends MessageOrBuilder {
        ByteString getError();

        ByteString getKey();

        VerifiedAppSettingsNotification.Result getResult();

        ByteString getStoreUuid();

        boolean hasError();

        boolean hasKey();

        boolean hasResult();

        boolean hasStoreUuid();
    }

    public interface VerifyAppSettingsRequestOrBuilder extends MessageOrBuilder {
        ByteString getKey();

        ByteString getStoreUuid();

        ByteString getValue();

        boolean hasKey();

        boolean hasStoreUuid();

        boolean hasValue();
    }

    public interface VerifyAppSettingsResponseOrBuilder extends MessageOrBuilder {
        VerifyAppSettingsResponse.ResponseStatus getStatus();

        ByteString getStoreUuid();

        boolean hasStatus();

        boolean hasStoreUuid();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_ConnectIQAppSettings_ConnectIQAppSettingsService_descriptor = descriptor2;
        internal_static_GDI_Proto_ConnectIQAppSettings_ConnectIQAppSettingsService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"GetAppSettingsRequest", "GetAppSettingsResponse", "SaveAppSettingsRequest", "SaveAppSettingsResponse", "SendAppSettingsRequest", "SendAppSettingsResponse", "OpenAppSettingsRequest", "OpenAppSettingsResponse", "VerifyAppSettingsRequest", "VerifyAppSettingsResponse", "VerifiedAppSettingsNotification"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_ConnectIQAppSettings_GetAppSettingsRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_ConnectIQAppSettings_GetAppSettingsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"AppIdentifier"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_ConnectIQAppSettings_GetAppSettingsResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_ConnectIQAppSettings_GetAppSettingsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"AppIdentifier", "Response"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_ConnectIQAppSettings_SendAppSettingsRequest_descriptor = descriptor5;
        internal_static_GDI_Proto_ConnectIQAppSettings_SendAppSettingsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"AppIdentifier", "SettingsValues"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_ConnectIQAppSettings_SendAppSettingsResponse_descriptor = descriptor6;
        internal_static_GDI_Proto_ConnectIQAppSettings_SendAppSettingsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Response"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_ConnectIQAppSettings_SaveAppSettingsRequest_descriptor = descriptor7;
        internal_static_GDI_Proto_ConnectIQAppSettings_SaveAppSettingsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"AppIdentifier", "SettingsValues"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_ConnectIQAppSettings_SaveAppSettingsResponse_descriptor = descriptor8;
        internal_static_GDI_Proto_ConnectIQAppSettings_SaveAppSettingsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"AppIdentifier", "Response"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_ConnectIQAppSettings_OpenAppSettingsRequest_descriptor = descriptor9;
        internal_static_GDI_Proto_ConnectIQAppSettings_OpenAppSettingsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"StoreUuid"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_GDI_Proto_ConnectIQAppSettings_OpenAppSettingsResponse_descriptor = descriptor10;
        internal_static_GDI_Proto_ConnectIQAppSettings_OpenAppSettingsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"AppIdentifier", "Status"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(9);
        internal_static_GDI_Proto_ConnectIQAppSettings_VerifyAppSettingsRequest_descriptor = descriptor11;
        internal_static_GDI_Proto_ConnectIQAppSettings_VerifyAppSettingsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"StoreUuid", "Key", "Value"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(10);
        internal_static_GDI_Proto_ConnectIQAppSettings_VerifyAppSettingsResponse_descriptor = descriptor12;
        internal_static_GDI_Proto_ConnectIQAppSettings_VerifyAppSettingsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"StoreUuid", "Status"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(11);
        internal_static_GDI_Proto_ConnectIQAppSettings_VerifiedAppSettingsNotification_descriptor = descriptor13;
        internal_static_GDI_Proto_ConnectIQAppSettings_VerifiedAppSettingsNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"StoreUuid", "Key", "Result", "Error"});
    }

    private GDIConnectIQAppSettingsProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class ConnectIQAppSettingsService extends GeneratedMessageV3 implements ConnectIQAppSettingsServiceOrBuilder {
        public static final int GET_APP_SETTINGS_REQUEST_FIELD_NUMBER = 1;
        public static final int GET_APP_SETTINGS_RESPONSE_FIELD_NUMBER = 2;
        public static final int OPEN_APP_SETTINGS_REQUEST_FIELD_NUMBER = 7;
        public static final int OPEN_APP_SETTINGS_RESPONSE_FIELD_NUMBER = 8;
        public static final int SAVE_APP_SETTINGS_REQUEST_FIELD_NUMBER = 3;
        public static final int SAVE_APP_SETTINGS_RESPONSE_FIELD_NUMBER = 4;
        public static final int SEND_APP_SETTINGS_REQUEST_FIELD_NUMBER = 5;
        public static final int SEND_APP_SETTINGS_RESPONSE_FIELD_NUMBER = 6;
        public static final int VERIFIED_APP_SETTINGS_NOTIFICATION_FIELD_NUMBER = 11;
        public static final int VERIFY_APP_SETTINGS_REQUEST_FIELD_NUMBER = 9;
        public static final int VERIFY_APP_SETTINGS_RESPONSE_FIELD_NUMBER = 10;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private GetAppSettingsRequest getAppSettingsRequest_;
        private GetAppSettingsResponse getAppSettingsResponse_;
        private byte memoizedIsInitialized;
        private OpenAppSettingsRequest openAppSettingsRequest_;
        private OpenAppSettingsResponse openAppSettingsResponse_;
        private SaveAppSettingsRequest saveAppSettingsRequest_;
        private SaveAppSettingsResponse saveAppSettingsResponse_;
        private SendAppSettingsRequest sendAppSettingsRequest_;
        private SendAppSettingsResponse sendAppSettingsResponse_;
        private VerifiedAppSettingsNotification verifiedAppSettingsNotification_;
        private VerifyAppSettingsRequest verifyAppSettingsRequest_;
        private VerifyAppSettingsResponse verifyAppSettingsResponse_;
        private static final ConnectIQAppSettingsService DEFAULT_INSTANCE = new ConnectIQAppSettingsService();

        @Deprecated
        public static final Parser<ConnectIQAppSettingsService> PARSER = new AbstractParser<ConnectIQAppSettingsService>() { // from class: com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsService.1
            @Override // com.google.protobuf.Parser
            public ConnectIQAppSettingsService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConnectIQAppSettingsService.newBuilder();
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

        private ConnectIQAppSettingsService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConnectIQAppSettingsService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_ConnectIQAppSettingsService_descriptor;
        }

        public static Builder newBuilder(ConnectIQAppSettingsService connectIQAppSettingsService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(connectIQAppSettingsService);
        }

        public static ConnectIQAppSettingsService parseDelimitedFrom(InputStream inputStream) {
            return (ConnectIQAppSettingsService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConnectIQAppSettingsService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConnectIQAppSettingsService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConnectIQAppSettingsService)) {
                return super.equals(obj);
            }
            ConnectIQAppSettingsService connectIQAppSettingsService = (ConnectIQAppSettingsService) obj;
            if (hasGetAppSettingsRequest() != connectIQAppSettingsService.hasGetAppSettingsRequest()) {
                return false;
            }
            if ((hasGetAppSettingsRequest() && !getGetAppSettingsRequest().equals(connectIQAppSettingsService.getGetAppSettingsRequest())) || hasGetAppSettingsResponse() != connectIQAppSettingsService.hasGetAppSettingsResponse()) {
                return false;
            }
            if ((hasGetAppSettingsResponse() && !getGetAppSettingsResponse().equals(connectIQAppSettingsService.getGetAppSettingsResponse())) || hasSaveAppSettingsRequest() != connectIQAppSettingsService.hasSaveAppSettingsRequest()) {
                return false;
            }
            if ((hasSaveAppSettingsRequest() && !getSaveAppSettingsRequest().equals(connectIQAppSettingsService.getSaveAppSettingsRequest())) || hasSaveAppSettingsResponse() != connectIQAppSettingsService.hasSaveAppSettingsResponse()) {
                return false;
            }
            if ((hasSaveAppSettingsResponse() && !getSaveAppSettingsResponse().equals(connectIQAppSettingsService.getSaveAppSettingsResponse())) || hasSendAppSettingsRequest() != connectIQAppSettingsService.hasSendAppSettingsRequest()) {
                return false;
            }
            if ((hasSendAppSettingsRequest() && !getSendAppSettingsRequest().equals(connectIQAppSettingsService.getSendAppSettingsRequest())) || hasSendAppSettingsResponse() != connectIQAppSettingsService.hasSendAppSettingsResponse()) {
                return false;
            }
            if ((hasSendAppSettingsResponse() && !getSendAppSettingsResponse().equals(connectIQAppSettingsService.getSendAppSettingsResponse())) || hasOpenAppSettingsRequest() != connectIQAppSettingsService.hasOpenAppSettingsRequest()) {
                return false;
            }
            if ((hasOpenAppSettingsRequest() && !getOpenAppSettingsRequest().equals(connectIQAppSettingsService.getOpenAppSettingsRequest())) || hasOpenAppSettingsResponse() != connectIQAppSettingsService.hasOpenAppSettingsResponse()) {
                return false;
            }
            if ((hasOpenAppSettingsResponse() && !getOpenAppSettingsResponse().equals(connectIQAppSettingsService.getOpenAppSettingsResponse())) || hasVerifyAppSettingsRequest() != connectIQAppSettingsService.hasVerifyAppSettingsRequest()) {
                return false;
            }
            if ((hasVerifyAppSettingsRequest() && !getVerifyAppSettingsRequest().equals(connectIQAppSettingsService.getVerifyAppSettingsRequest())) || hasVerifyAppSettingsResponse() != connectIQAppSettingsService.hasVerifyAppSettingsResponse()) {
                return false;
            }
            if ((!hasVerifyAppSettingsResponse() || getVerifyAppSettingsResponse().equals(connectIQAppSettingsService.getVerifyAppSettingsResponse())) && hasVerifiedAppSettingsNotification() == connectIQAppSettingsService.hasVerifiedAppSettingsNotification()) {
                return (!hasVerifiedAppSettingsNotification() || getVerifiedAppSettingsNotification().equals(connectIQAppSettingsService.getVerifiedAppSettingsNotification())) && getUnknownFields().equals(connectIQAppSettingsService.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
        public GetAppSettingsRequest getGetAppSettingsRequest() {
            GetAppSettingsRequest getAppSettingsRequest = this.getAppSettingsRequest_;
            return getAppSettingsRequest == null ? GetAppSettingsRequest.getDefaultInstance() : getAppSettingsRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
        public GetAppSettingsRequestOrBuilder getGetAppSettingsRequestOrBuilder() {
            GetAppSettingsRequest getAppSettingsRequest = this.getAppSettingsRequest_;
            return getAppSettingsRequest == null ? GetAppSettingsRequest.getDefaultInstance() : getAppSettingsRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
        public GetAppSettingsResponse getGetAppSettingsResponse() {
            GetAppSettingsResponse getAppSettingsResponse = this.getAppSettingsResponse_;
            return getAppSettingsResponse == null ? GetAppSettingsResponse.getDefaultInstance() : getAppSettingsResponse;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
        public GetAppSettingsResponseOrBuilder getGetAppSettingsResponseOrBuilder() {
            GetAppSettingsResponse getAppSettingsResponse = this.getAppSettingsResponse_;
            return getAppSettingsResponse == null ? GetAppSettingsResponse.getDefaultInstance() : getAppSettingsResponse;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
        public OpenAppSettingsRequest getOpenAppSettingsRequest() {
            OpenAppSettingsRequest openAppSettingsRequest = this.openAppSettingsRequest_;
            return openAppSettingsRequest == null ? OpenAppSettingsRequest.getDefaultInstance() : openAppSettingsRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
        public OpenAppSettingsRequestOrBuilder getOpenAppSettingsRequestOrBuilder() {
            OpenAppSettingsRequest openAppSettingsRequest = this.openAppSettingsRequest_;
            return openAppSettingsRequest == null ? OpenAppSettingsRequest.getDefaultInstance() : openAppSettingsRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
        public OpenAppSettingsResponse getOpenAppSettingsResponse() {
            OpenAppSettingsResponse openAppSettingsResponse = this.openAppSettingsResponse_;
            return openAppSettingsResponse == null ? OpenAppSettingsResponse.getDefaultInstance() : openAppSettingsResponse;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
        public OpenAppSettingsResponseOrBuilder getOpenAppSettingsResponseOrBuilder() {
            OpenAppSettingsResponse openAppSettingsResponse = this.openAppSettingsResponse_;
            return openAppSettingsResponse == null ? OpenAppSettingsResponse.getDefaultInstance() : openAppSettingsResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConnectIQAppSettingsService> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
        public SaveAppSettingsRequest getSaveAppSettingsRequest() {
            SaveAppSettingsRequest saveAppSettingsRequest = this.saveAppSettingsRequest_;
            return saveAppSettingsRequest == null ? SaveAppSettingsRequest.getDefaultInstance() : saveAppSettingsRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
        public SaveAppSettingsRequestOrBuilder getSaveAppSettingsRequestOrBuilder() {
            SaveAppSettingsRequest saveAppSettingsRequest = this.saveAppSettingsRequest_;
            return saveAppSettingsRequest == null ? SaveAppSettingsRequest.getDefaultInstance() : saveAppSettingsRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
        public SaveAppSettingsResponse getSaveAppSettingsResponse() {
            SaveAppSettingsResponse saveAppSettingsResponse = this.saveAppSettingsResponse_;
            return saveAppSettingsResponse == null ? SaveAppSettingsResponse.getDefaultInstance() : saveAppSettingsResponse;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
        public SaveAppSettingsResponseOrBuilder getSaveAppSettingsResponseOrBuilder() {
            SaveAppSettingsResponse saveAppSettingsResponse = this.saveAppSettingsResponse_;
            return saveAppSettingsResponse == null ? SaveAppSettingsResponse.getDefaultInstance() : saveAppSettingsResponse;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
        public SendAppSettingsRequest getSendAppSettingsRequest() {
            SendAppSettingsRequest sendAppSettingsRequest = this.sendAppSettingsRequest_;
            return sendAppSettingsRequest == null ? SendAppSettingsRequest.getDefaultInstance() : sendAppSettingsRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
        public SendAppSettingsRequestOrBuilder getSendAppSettingsRequestOrBuilder() {
            SendAppSettingsRequest sendAppSettingsRequest = this.sendAppSettingsRequest_;
            return sendAppSettingsRequest == null ? SendAppSettingsRequest.getDefaultInstance() : sendAppSettingsRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
        public SendAppSettingsResponse getSendAppSettingsResponse() {
            SendAppSettingsResponse sendAppSettingsResponse = this.sendAppSettingsResponse_;
            return sendAppSettingsResponse == null ? SendAppSettingsResponse.getDefaultInstance() : sendAppSettingsResponse;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
        public SendAppSettingsResponseOrBuilder getSendAppSettingsResponseOrBuilder() {
            SendAppSettingsResponse sendAppSettingsResponse = this.sendAppSettingsResponse_;
            return sendAppSettingsResponse == null ? SendAppSettingsResponse.getDefaultInstance() : sendAppSettingsResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getGetAppSettingsRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getGetAppSettingsResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getSaveAppSettingsRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getSaveAppSettingsResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getSendAppSettingsRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getSendAppSettingsResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getOpenAppSettingsRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, getOpenAppSettingsResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(9, getVerifyAppSettingsRequest());
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(10, getVerifyAppSettingsResponse());
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(11, getVerifiedAppSettingsNotification());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
        public VerifiedAppSettingsNotification getVerifiedAppSettingsNotification() {
            VerifiedAppSettingsNotification verifiedAppSettingsNotification = this.verifiedAppSettingsNotification_;
            return verifiedAppSettingsNotification == null ? VerifiedAppSettingsNotification.getDefaultInstance() : verifiedAppSettingsNotification;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
        public VerifiedAppSettingsNotificationOrBuilder getVerifiedAppSettingsNotificationOrBuilder() {
            VerifiedAppSettingsNotification verifiedAppSettingsNotification = this.verifiedAppSettingsNotification_;
            return verifiedAppSettingsNotification == null ? VerifiedAppSettingsNotification.getDefaultInstance() : verifiedAppSettingsNotification;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
        public VerifyAppSettingsRequest getVerifyAppSettingsRequest() {
            VerifyAppSettingsRequest verifyAppSettingsRequest = this.verifyAppSettingsRequest_;
            return verifyAppSettingsRequest == null ? VerifyAppSettingsRequest.getDefaultInstance() : verifyAppSettingsRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
        public VerifyAppSettingsRequestOrBuilder getVerifyAppSettingsRequestOrBuilder() {
            VerifyAppSettingsRequest verifyAppSettingsRequest = this.verifyAppSettingsRequest_;
            return verifyAppSettingsRequest == null ? VerifyAppSettingsRequest.getDefaultInstance() : verifyAppSettingsRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
        public VerifyAppSettingsResponse getVerifyAppSettingsResponse() {
            VerifyAppSettingsResponse verifyAppSettingsResponse = this.verifyAppSettingsResponse_;
            return verifyAppSettingsResponse == null ? VerifyAppSettingsResponse.getDefaultInstance() : verifyAppSettingsResponse;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
        public VerifyAppSettingsResponseOrBuilder getVerifyAppSettingsResponseOrBuilder() {
            VerifyAppSettingsResponse verifyAppSettingsResponse = this.verifyAppSettingsResponse_;
            return verifyAppSettingsResponse == null ? VerifyAppSettingsResponse.getDefaultInstance() : verifyAppSettingsResponse;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
        public boolean hasGetAppSettingsRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
        public boolean hasGetAppSettingsResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
        public boolean hasOpenAppSettingsRequest() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
        public boolean hasOpenAppSettingsResponse() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
        public boolean hasSaveAppSettingsRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
        public boolean hasSaveAppSettingsResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
        public boolean hasSendAppSettingsRequest() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
        public boolean hasSendAppSettingsResponse() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
        public boolean hasVerifiedAppSettingsNotification() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
        public boolean hasVerifyAppSettingsRequest() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
        public boolean hasVerifyAppSettingsResponse() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasGetAppSettingsRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getGetAppSettingsRequest().hashCode();
            }
            if (hasGetAppSettingsResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getGetAppSettingsResponse().hashCode();
            }
            if (hasSaveAppSettingsRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getSaveAppSettingsRequest().hashCode();
            }
            if (hasSaveAppSettingsResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getSaveAppSettingsResponse().hashCode();
            }
            if (hasSendAppSettingsRequest()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getSendAppSettingsRequest().hashCode();
            }
            if (hasSendAppSettingsResponse()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getSendAppSettingsResponse().hashCode();
            }
            if (hasOpenAppSettingsRequest()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getOpenAppSettingsRequest().hashCode();
            }
            if (hasOpenAppSettingsResponse()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getOpenAppSettingsResponse().hashCode();
            }
            if (hasVerifyAppSettingsRequest()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getVerifyAppSettingsRequest().hashCode();
            }
            if (hasVerifyAppSettingsResponse()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getVerifyAppSettingsResponse().hashCode();
            }
            if (hasVerifiedAppSettingsNotification()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getVerifiedAppSettingsNotification().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_ConnectIQAppSettingsService_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectIQAppSettingsService.class, Builder.class);
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
            if (hasGetAppSettingsRequest() && !getGetAppSettingsRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasGetAppSettingsResponse() && !getGetAppSettingsResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSaveAppSettingsRequest() && !getSaveAppSettingsRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSaveAppSettingsResponse() && !getSaveAppSettingsResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSendAppSettingsRequest() && !getSendAppSettingsRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasOpenAppSettingsRequest() && !getOpenAppSettingsRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasOpenAppSettingsResponse() && !getOpenAppSettingsResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasVerifyAppSettingsRequest() && !getVerifyAppSettingsRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasVerifyAppSettingsResponse() && !getVerifyAppSettingsResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasVerifiedAppSettingsNotification() || getVerifiedAppSettingsNotification().isInitialized()) {
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
            return new ConnectIQAppSettingsService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getGetAppSettingsRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getGetAppSettingsResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getSaveAppSettingsRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getSaveAppSettingsResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getSendAppSettingsRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getSendAppSettingsResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getOpenAppSettingsRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(8, getOpenAppSettingsResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(9, getVerifyAppSettingsRequest());
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeMessage(10, getVerifyAppSettingsResponse());
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeMessage(11, getVerifiedAppSettingsNotification());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConnectIQAppSettingsServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<GetAppSettingsRequest, GetAppSettingsRequest.Builder, GetAppSettingsRequestOrBuilder> getAppSettingsRequestBuilder_;
            private GetAppSettingsRequest getAppSettingsRequest_;
            private SingleFieldBuilderV3<GetAppSettingsResponse, GetAppSettingsResponse.Builder, GetAppSettingsResponseOrBuilder> getAppSettingsResponseBuilder_;
            private GetAppSettingsResponse getAppSettingsResponse_;
            private SingleFieldBuilderV3<OpenAppSettingsRequest, OpenAppSettingsRequest.Builder, OpenAppSettingsRequestOrBuilder> openAppSettingsRequestBuilder_;
            private OpenAppSettingsRequest openAppSettingsRequest_;
            private SingleFieldBuilderV3<OpenAppSettingsResponse, OpenAppSettingsResponse.Builder, OpenAppSettingsResponseOrBuilder> openAppSettingsResponseBuilder_;
            private OpenAppSettingsResponse openAppSettingsResponse_;
            private SingleFieldBuilderV3<SaveAppSettingsRequest, SaveAppSettingsRequest.Builder, SaveAppSettingsRequestOrBuilder> saveAppSettingsRequestBuilder_;
            private SaveAppSettingsRequest saveAppSettingsRequest_;
            private SingleFieldBuilderV3<SaveAppSettingsResponse, SaveAppSettingsResponse.Builder, SaveAppSettingsResponseOrBuilder> saveAppSettingsResponseBuilder_;
            private SaveAppSettingsResponse saveAppSettingsResponse_;
            private SingleFieldBuilderV3<SendAppSettingsRequest, SendAppSettingsRequest.Builder, SendAppSettingsRequestOrBuilder> sendAppSettingsRequestBuilder_;
            private SendAppSettingsRequest sendAppSettingsRequest_;
            private SingleFieldBuilderV3<SendAppSettingsResponse, SendAppSettingsResponse.Builder, SendAppSettingsResponseOrBuilder> sendAppSettingsResponseBuilder_;
            private SendAppSettingsResponse sendAppSettingsResponse_;
            private SingleFieldBuilderV3<VerifiedAppSettingsNotification, VerifiedAppSettingsNotification.Builder, VerifiedAppSettingsNotificationOrBuilder> verifiedAppSettingsNotificationBuilder_;
            private VerifiedAppSettingsNotification verifiedAppSettingsNotification_;
            private SingleFieldBuilderV3<VerifyAppSettingsRequest, VerifyAppSettingsRequest.Builder, VerifyAppSettingsRequestOrBuilder> verifyAppSettingsRequestBuilder_;
            private VerifyAppSettingsRequest verifyAppSettingsRequest_;
            private SingleFieldBuilderV3<VerifyAppSettingsResponse, VerifyAppSettingsResponse.Builder, VerifyAppSettingsResponseOrBuilder> verifyAppSettingsResponseBuilder_;
            private VerifyAppSettingsResponse verifyAppSettingsResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ConnectIQAppSettingsService connectIQAppSettingsService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<GetAppSettingsRequest, GetAppSettingsRequest.Builder, GetAppSettingsRequestOrBuilder> singleFieldBuilderV3 = this.getAppSettingsRequestBuilder_;
                    connectIQAppSettingsService.getAppSettingsRequest_ = singleFieldBuilderV3 == null ? this.getAppSettingsRequest_ : (GetAppSettingsRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<GetAppSettingsResponse, GetAppSettingsResponse.Builder, GetAppSettingsResponseOrBuilder> singleFieldBuilderV4 = this.getAppSettingsResponseBuilder_;
                    connectIQAppSettingsService.getAppSettingsResponse_ = singleFieldBuilderV4 == null ? this.getAppSettingsResponse_ : (GetAppSettingsResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<SaveAppSettingsRequest, SaveAppSettingsRequest.Builder, SaveAppSettingsRequestOrBuilder> singleFieldBuilderV5 = this.saveAppSettingsRequestBuilder_;
                    connectIQAppSettingsService.saveAppSettingsRequest_ = singleFieldBuilderV5 == null ? this.saveAppSettingsRequest_ : (SaveAppSettingsRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<SaveAppSettingsResponse, SaveAppSettingsResponse.Builder, SaveAppSettingsResponseOrBuilder> singleFieldBuilderV6 = this.saveAppSettingsResponseBuilder_;
                    connectIQAppSettingsService.saveAppSettingsResponse_ = singleFieldBuilderV6 == null ? this.saveAppSettingsResponse_ : (SaveAppSettingsResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<SendAppSettingsRequest, SendAppSettingsRequest.Builder, SendAppSettingsRequestOrBuilder> singleFieldBuilderV7 = this.sendAppSettingsRequestBuilder_;
                    connectIQAppSettingsService.sendAppSettingsRequest_ = singleFieldBuilderV7 == null ? this.sendAppSettingsRequest_ : (SendAppSettingsRequest) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<SendAppSettingsResponse, SendAppSettingsResponse.Builder, SendAppSettingsResponseOrBuilder> singleFieldBuilderV8 = this.sendAppSettingsResponseBuilder_;
                    connectIQAppSettingsService.sendAppSettingsResponse_ = singleFieldBuilderV8 == null ? this.sendAppSettingsResponse_ : (SendAppSettingsResponse) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<OpenAppSettingsRequest, OpenAppSettingsRequest.Builder, OpenAppSettingsRequestOrBuilder> singleFieldBuilderV9 = this.openAppSettingsRequestBuilder_;
                    connectIQAppSettingsService.openAppSettingsRequest_ = singleFieldBuilderV9 == null ? this.openAppSettingsRequest_ : (OpenAppSettingsRequest) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<OpenAppSettingsResponse, OpenAppSettingsResponse.Builder, OpenAppSettingsResponseOrBuilder> singleFieldBuilderV10 = this.openAppSettingsResponseBuilder_;
                    connectIQAppSettingsService.openAppSettingsResponse_ = singleFieldBuilderV10 == null ? this.openAppSettingsResponse_ : (OpenAppSettingsResponse) singleFieldBuilderV10.build();
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    SingleFieldBuilderV3<VerifyAppSettingsRequest, VerifyAppSettingsRequest.Builder, VerifyAppSettingsRequestOrBuilder> singleFieldBuilderV11 = this.verifyAppSettingsRequestBuilder_;
                    connectIQAppSettingsService.verifyAppSettingsRequest_ = singleFieldBuilderV11 == null ? this.verifyAppSettingsRequest_ : (VerifyAppSettingsRequest) singleFieldBuilderV11.build();
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    SingleFieldBuilderV3<VerifyAppSettingsResponse, VerifyAppSettingsResponse.Builder, VerifyAppSettingsResponseOrBuilder> singleFieldBuilderV12 = this.verifyAppSettingsResponseBuilder_;
                    connectIQAppSettingsService.verifyAppSettingsResponse_ = singleFieldBuilderV12 == null ? this.verifyAppSettingsResponse_ : (VerifyAppSettingsResponse) singleFieldBuilderV12.build();
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    SingleFieldBuilderV3<VerifiedAppSettingsNotification, VerifiedAppSettingsNotification.Builder, VerifiedAppSettingsNotificationOrBuilder> singleFieldBuilderV13 = this.verifiedAppSettingsNotificationBuilder_;
                    connectIQAppSettingsService.verifiedAppSettingsNotification_ = singleFieldBuilderV13 == null ? this.verifiedAppSettingsNotification_ : (VerifiedAppSettingsNotification) singleFieldBuilderV13.build();
                    i14 |= 1024;
                }
                connectIQAppSettingsService.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_ConnectIQAppSettingsService_descriptor;
            }

            private SingleFieldBuilderV3<GetAppSettingsRequest, GetAppSettingsRequest.Builder, GetAppSettingsRequestOrBuilder> getGetAppSettingsRequestFieldBuilder() {
                if (this.getAppSettingsRequestBuilder_ == null) {
                    this.getAppSettingsRequestBuilder_ = new SingleFieldBuilderV3<>(getGetAppSettingsRequest(), getParentForChildren(), isClean());
                    this.getAppSettingsRequest_ = null;
                }
                return this.getAppSettingsRequestBuilder_;
            }

            private SingleFieldBuilderV3<GetAppSettingsResponse, GetAppSettingsResponse.Builder, GetAppSettingsResponseOrBuilder> getGetAppSettingsResponseFieldBuilder() {
                if (this.getAppSettingsResponseBuilder_ == null) {
                    this.getAppSettingsResponseBuilder_ = new SingleFieldBuilderV3<>(getGetAppSettingsResponse(), getParentForChildren(), isClean());
                    this.getAppSettingsResponse_ = null;
                }
                return this.getAppSettingsResponseBuilder_;
            }

            private SingleFieldBuilderV3<OpenAppSettingsRequest, OpenAppSettingsRequest.Builder, OpenAppSettingsRequestOrBuilder> getOpenAppSettingsRequestFieldBuilder() {
                if (this.openAppSettingsRequestBuilder_ == null) {
                    this.openAppSettingsRequestBuilder_ = new SingleFieldBuilderV3<>(getOpenAppSettingsRequest(), getParentForChildren(), isClean());
                    this.openAppSettingsRequest_ = null;
                }
                return this.openAppSettingsRequestBuilder_;
            }

            private SingleFieldBuilderV3<OpenAppSettingsResponse, OpenAppSettingsResponse.Builder, OpenAppSettingsResponseOrBuilder> getOpenAppSettingsResponseFieldBuilder() {
                if (this.openAppSettingsResponseBuilder_ == null) {
                    this.openAppSettingsResponseBuilder_ = new SingleFieldBuilderV3<>(getOpenAppSettingsResponse(), getParentForChildren(), isClean());
                    this.openAppSettingsResponse_ = null;
                }
                return this.openAppSettingsResponseBuilder_;
            }

            private SingleFieldBuilderV3<SaveAppSettingsRequest, SaveAppSettingsRequest.Builder, SaveAppSettingsRequestOrBuilder> getSaveAppSettingsRequestFieldBuilder() {
                if (this.saveAppSettingsRequestBuilder_ == null) {
                    this.saveAppSettingsRequestBuilder_ = new SingleFieldBuilderV3<>(getSaveAppSettingsRequest(), getParentForChildren(), isClean());
                    this.saveAppSettingsRequest_ = null;
                }
                return this.saveAppSettingsRequestBuilder_;
            }

            private SingleFieldBuilderV3<SaveAppSettingsResponse, SaveAppSettingsResponse.Builder, SaveAppSettingsResponseOrBuilder> getSaveAppSettingsResponseFieldBuilder() {
                if (this.saveAppSettingsResponseBuilder_ == null) {
                    this.saveAppSettingsResponseBuilder_ = new SingleFieldBuilderV3<>(getSaveAppSettingsResponse(), getParentForChildren(), isClean());
                    this.saveAppSettingsResponse_ = null;
                }
                return this.saveAppSettingsResponseBuilder_;
            }

            private SingleFieldBuilderV3<SendAppSettingsRequest, SendAppSettingsRequest.Builder, SendAppSettingsRequestOrBuilder> getSendAppSettingsRequestFieldBuilder() {
                if (this.sendAppSettingsRequestBuilder_ == null) {
                    this.sendAppSettingsRequestBuilder_ = new SingleFieldBuilderV3<>(getSendAppSettingsRequest(), getParentForChildren(), isClean());
                    this.sendAppSettingsRequest_ = null;
                }
                return this.sendAppSettingsRequestBuilder_;
            }

            private SingleFieldBuilderV3<SendAppSettingsResponse, SendAppSettingsResponse.Builder, SendAppSettingsResponseOrBuilder> getSendAppSettingsResponseFieldBuilder() {
                if (this.sendAppSettingsResponseBuilder_ == null) {
                    this.sendAppSettingsResponseBuilder_ = new SingleFieldBuilderV3<>(getSendAppSettingsResponse(), getParentForChildren(), isClean());
                    this.sendAppSettingsResponse_ = null;
                }
                return this.sendAppSettingsResponseBuilder_;
            }

            private SingleFieldBuilderV3<VerifiedAppSettingsNotification, VerifiedAppSettingsNotification.Builder, VerifiedAppSettingsNotificationOrBuilder> getVerifiedAppSettingsNotificationFieldBuilder() {
                if (this.verifiedAppSettingsNotificationBuilder_ == null) {
                    this.verifiedAppSettingsNotificationBuilder_ = new SingleFieldBuilderV3<>(getVerifiedAppSettingsNotification(), getParentForChildren(), isClean());
                    this.verifiedAppSettingsNotification_ = null;
                }
                return this.verifiedAppSettingsNotificationBuilder_;
            }

            private SingleFieldBuilderV3<VerifyAppSettingsRequest, VerifyAppSettingsRequest.Builder, VerifyAppSettingsRequestOrBuilder> getVerifyAppSettingsRequestFieldBuilder() {
                if (this.verifyAppSettingsRequestBuilder_ == null) {
                    this.verifyAppSettingsRequestBuilder_ = new SingleFieldBuilderV3<>(getVerifyAppSettingsRequest(), getParentForChildren(), isClean());
                    this.verifyAppSettingsRequest_ = null;
                }
                return this.verifyAppSettingsRequestBuilder_;
            }

            private SingleFieldBuilderV3<VerifyAppSettingsResponse, VerifyAppSettingsResponse.Builder, VerifyAppSettingsResponseOrBuilder> getVerifyAppSettingsResponseFieldBuilder() {
                if (this.verifyAppSettingsResponseBuilder_ == null) {
                    this.verifyAppSettingsResponseBuilder_ = new SingleFieldBuilderV3<>(getVerifyAppSettingsResponse(), getParentForChildren(), isClean());
                    this.verifyAppSettingsResponse_ = null;
                }
                return this.verifyAppSettingsResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getGetAppSettingsRequestFieldBuilder();
                    getGetAppSettingsResponseFieldBuilder();
                    getSaveAppSettingsRequestFieldBuilder();
                    getSaveAppSettingsResponseFieldBuilder();
                    getSendAppSettingsRequestFieldBuilder();
                    getSendAppSettingsResponseFieldBuilder();
                    getOpenAppSettingsRequestFieldBuilder();
                    getOpenAppSettingsResponseFieldBuilder();
                    getVerifyAppSettingsRequestFieldBuilder();
                    getVerifyAppSettingsResponseFieldBuilder();
                    getVerifiedAppSettingsNotificationFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectIQAppSettingsService build() {
                ConnectIQAppSettingsService connectIQAppSettingsServiceBuildPartial = buildPartial();
                if (connectIQAppSettingsServiceBuildPartial.isInitialized()) {
                    return connectIQAppSettingsServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) connectIQAppSettingsServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectIQAppSettingsService buildPartial() {
                ConnectIQAppSettingsService connectIQAppSettingsService = new ConnectIQAppSettingsService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(connectIQAppSettingsService);
                }
                onBuilt();
                return connectIQAppSettingsService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.getAppSettingsRequest_ = null;
                SingleFieldBuilderV3<GetAppSettingsRequest, GetAppSettingsRequest.Builder, GetAppSettingsRequestOrBuilder> singleFieldBuilderV3 = this.getAppSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.getAppSettingsRequestBuilder_ = null;
                }
                this.getAppSettingsResponse_ = null;
                SingleFieldBuilderV3<GetAppSettingsResponse, GetAppSettingsResponse.Builder, GetAppSettingsResponseOrBuilder> singleFieldBuilderV4 = this.getAppSettingsResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.getAppSettingsResponseBuilder_ = null;
                }
                this.saveAppSettingsRequest_ = null;
                SingleFieldBuilderV3<SaveAppSettingsRequest, SaveAppSettingsRequest.Builder, SaveAppSettingsRequestOrBuilder> singleFieldBuilderV5 = this.saveAppSettingsRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.saveAppSettingsRequestBuilder_ = null;
                }
                this.saveAppSettingsResponse_ = null;
                SingleFieldBuilderV3<SaveAppSettingsResponse, SaveAppSettingsResponse.Builder, SaveAppSettingsResponseOrBuilder> singleFieldBuilderV6 = this.saveAppSettingsResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.saveAppSettingsResponseBuilder_ = null;
                }
                this.sendAppSettingsRequest_ = null;
                SingleFieldBuilderV3<SendAppSettingsRequest, SendAppSettingsRequest.Builder, SendAppSettingsRequestOrBuilder> singleFieldBuilderV7 = this.sendAppSettingsRequestBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.sendAppSettingsRequestBuilder_ = null;
                }
                this.sendAppSettingsResponse_ = null;
                SingleFieldBuilderV3<SendAppSettingsResponse, SendAppSettingsResponse.Builder, SendAppSettingsResponseOrBuilder> singleFieldBuilderV8 = this.sendAppSettingsResponseBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.sendAppSettingsResponseBuilder_ = null;
                }
                this.openAppSettingsRequest_ = null;
                SingleFieldBuilderV3<OpenAppSettingsRequest, OpenAppSettingsRequest.Builder, OpenAppSettingsRequestOrBuilder> singleFieldBuilderV9 = this.openAppSettingsRequestBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.openAppSettingsRequestBuilder_ = null;
                }
                this.openAppSettingsResponse_ = null;
                SingleFieldBuilderV3<OpenAppSettingsResponse, OpenAppSettingsResponse.Builder, OpenAppSettingsResponseOrBuilder> singleFieldBuilderV10 = this.openAppSettingsResponseBuilder_;
                if (singleFieldBuilderV10 != null) {
                    singleFieldBuilderV10.dispose();
                    this.openAppSettingsResponseBuilder_ = null;
                }
                this.verifyAppSettingsRequest_ = null;
                SingleFieldBuilderV3<VerifyAppSettingsRequest, VerifyAppSettingsRequest.Builder, VerifyAppSettingsRequestOrBuilder> singleFieldBuilderV11 = this.verifyAppSettingsRequestBuilder_;
                if (singleFieldBuilderV11 != null) {
                    singleFieldBuilderV11.dispose();
                    this.verifyAppSettingsRequestBuilder_ = null;
                }
                this.verifyAppSettingsResponse_ = null;
                SingleFieldBuilderV3<VerifyAppSettingsResponse, VerifyAppSettingsResponse.Builder, VerifyAppSettingsResponseOrBuilder> singleFieldBuilderV12 = this.verifyAppSettingsResponseBuilder_;
                if (singleFieldBuilderV12 != null) {
                    singleFieldBuilderV12.dispose();
                    this.verifyAppSettingsResponseBuilder_ = null;
                }
                this.verifiedAppSettingsNotification_ = null;
                SingleFieldBuilderV3<VerifiedAppSettingsNotification, VerifiedAppSettingsNotification.Builder, VerifiedAppSettingsNotificationOrBuilder> singleFieldBuilderV13 = this.verifiedAppSettingsNotificationBuilder_;
                if (singleFieldBuilderV13 != null) {
                    singleFieldBuilderV13.dispose();
                    this.verifiedAppSettingsNotificationBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGetAppSettingsRequest() {
                this.bitField0_ &= -2;
                this.getAppSettingsRequest_ = null;
                SingleFieldBuilderV3<GetAppSettingsRequest, GetAppSettingsRequest.Builder, GetAppSettingsRequestOrBuilder> singleFieldBuilderV3 = this.getAppSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.getAppSettingsRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearGetAppSettingsResponse() {
                this.bitField0_ &= -3;
                this.getAppSettingsResponse_ = null;
                SingleFieldBuilderV3<GetAppSettingsResponse, GetAppSettingsResponse.Builder, GetAppSettingsResponseOrBuilder> singleFieldBuilderV3 = this.getAppSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.getAppSettingsResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearOpenAppSettingsRequest() {
                this.bitField0_ &= -65;
                this.openAppSettingsRequest_ = null;
                SingleFieldBuilderV3<OpenAppSettingsRequest, OpenAppSettingsRequest.Builder, OpenAppSettingsRequestOrBuilder> singleFieldBuilderV3 = this.openAppSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.openAppSettingsRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearOpenAppSettingsResponse() {
                this.bitField0_ &= -129;
                this.openAppSettingsResponse_ = null;
                SingleFieldBuilderV3<OpenAppSettingsResponse, OpenAppSettingsResponse.Builder, OpenAppSettingsResponseOrBuilder> singleFieldBuilderV3 = this.openAppSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.openAppSettingsResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSaveAppSettingsRequest() {
                this.bitField0_ &= -5;
                this.saveAppSettingsRequest_ = null;
                SingleFieldBuilderV3<SaveAppSettingsRequest, SaveAppSettingsRequest.Builder, SaveAppSettingsRequestOrBuilder> singleFieldBuilderV3 = this.saveAppSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.saveAppSettingsRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSaveAppSettingsResponse() {
                this.bitField0_ &= -9;
                this.saveAppSettingsResponse_ = null;
                SingleFieldBuilderV3<SaveAppSettingsResponse, SaveAppSettingsResponse.Builder, SaveAppSettingsResponseOrBuilder> singleFieldBuilderV3 = this.saveAppSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.saveAppSettingsResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSendAppSettingsRequest() {
                this.bitField0_ &= -17;
                this.sendAppSettingsRequest_ = null;
                SingleFieldBuilderV3<SendAppSettingsRequest, SendAppSettingsRequest.Builder, SendAppSettingsRequestOrBuilder> singleFieldBuilderV3 = this.sendAppSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sendAppSettingsRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSendAppSettingsResponse() {
                this.bitField0_ &= -33;
                this.sendAppSettingsResponse_ = null;
                SingleFieldBuilderV3<SendAppSettingsResponse, SendAppSettingsResponse.Builder, SendAppSettingsResponseOrBuilder> singleFieldBuilderV3 = this.sendAppSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sendAppSettingsResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearVerifiedAppSettingsNotification() {
                this.bitField0_ &= -1025;
                this.verifiedAppSettingsNotification_ = null;
                SingleFieldBuilderV3<VerifiedAppSettingsNotification, VerifiedAppSettingsNotification.Builder, VerifiedAppSettingsNotificationOrBuilder> singleFieldBuilderV3 = this.verifiedAppSettingsNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.verifiedAppSettingsNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearVerifyAppSettingsRequest() {
                this.bitField0_ &= -257;
                this.verifyAppSettingsRequest_ = null;
                SingleFieldBuilderV3<VerifyAppSettingsRequest, VerifyAppSettingsRequest.Builder, VerifyAppSettingsRequestOrBuilder> singleFieldBuilderV3 = this.verifyAppSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.verifyAppSettingsRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearVerifyAppSettingsResponse() {
                this.bitField0_ &= -513;
                this.verifyAppSettingsResponse_ = null;
                SingleFieldBuilderV3<VerifyAppSettingsResponse, VerifyAppSettingsResponse.Builder, VerifyAppSettingsResponseOrBuilder> singleFieldBuilderV3 = this.verifyAppSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.verifyAppSettingsResponseBuilder_ = null;
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
                return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_ConnectIQAppSettingsService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
            public GetAppSettingsRequest getGetAppSettingsRequest() {
                SingleFieldBuilderV3<GetAppSettingsRequest, GetAppSettingsRequest.Builder, GetAppSettingsRequestOrBuilder> singleFieldBuilderV3 = this.getAppSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetAppSettingsRequest) singleFieldBuilderV3.getMessage();
                }
                GetAppSettingsRequest getAppSettingsRequest = this.getAppSettingsRequest_;
                return getAppSettingsRequest == null ? GetAppSettingsRequest.getDefaultInstance() : getAppSettingsRequest;
            }

            public GetAppSettingsRequest.Builder getGetAppSettingsRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (GetAppSettingsRequest.Builder) getGetAppSettingsRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
            public GetAppSettingsRequestOrBuilder getGetAppSettingsRequestOrBuilder() {
                SingleFieldBuilderV3<GetAppSettingsRequest, GetAppSettingsRequest.Builder, GetAppSettingsRequestOrBuilder> singleFieldBuilderV3 = this.getAppSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetAppSettingsRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GetAppSettingsRequest getAppSettingsRequest = this.getAppSettingsRequest_;
                return getAppSettingsRequest == null ? GetAppSettingsRequest.getDefaultInstance() : getAppSettingsRequest;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
            public GetAppSettingsResponse getGetAppSettingsResponse() {
                SingleFieldBuilderV3<GetAppSettingsResponse, GetAppSettingsResponse.Builder, GetAppSettingsResponseOrBuilder> singleFieldBuilderV3 = this.getAppSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetAppSettingsResponse) singleFieldBuilderV3.getMessage();
                }
                GetAppSettingsResponse getAppSettingsResponse = this.getAppSettingsResponse_;
                return getAppSettingsResponse == null ? GetAppSettingsResponse.getDefaultInstance() : getAppSettingsResponse;
            }

            public GetAppSettingsResponse.Builder getGetAppSettingsResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (GetAppSettingsResponse.Builder) getGetAppSettingsResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
            public GetAppSettingsResponseOrBuilder getGetAppSettingsResponseOrBuilder() {
                SingleFieldBuilderV3<GetAppSettingsResponse, GetAppSettingsResponse.Builder, GetAppSettingsResponseOrBuilder> singleFieldBuilderV3 = this.getAppSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetAppSettingsResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GetAppSettingsResponse getAppSettingsResponse = this.getAppSettingsResponse_;
                return getAppSettingsResponse == null ? GetAppSettingsResponse.getDefaultInstance() : getAppSettingsResponse;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
            public OpenAppSettingsRequest getOpenAppSettingsRequest() {
                SingleFieldBuilderV3<OpenAppSettingsRequest, OpenAppSettingsRequest.Builder, OpenAppSettingsRequestOrBuilder> singleFieldBuilderV3 = this.openAppSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (OpenAppSettingsRequest) singleFieldBuilderV3.getMessage();
                }
                OpenAppSettingsRequest openAppSettingsRequest = this.openAppSettingsRequest_;
                return openAppSettingsRequest == null ? OpenAppSettingsRequest.getDefaultInstance() : openAppSettingsRequest;
            }

            public OpenAppSettingsRequest.Builder getOpenAppSettingsRequestBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (OpenAppSettingsRequest.Builder) getOpenAppSettingsRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
            public OpenAppSettingsRequestOrBuilder getOpenAppSettingsRequestOrBuilder() {
                SingleFieldBuilderV3<OpenAppSettingsRequest, OpenAppSettingsRequest.Builder, OpenAppSettingsRequestOrBuilder> singleFieldBuilderV3 = this.openAppSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (OpenAppSettingsRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                OpenAppSettingsRequest openAppSettingsRequest = this.openAppSettingsRequest_;
                return openAppSettingsRequest == null ? OpenAppSettingsRequest.getDefaultInstance() : openAppSettingsRequest;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
            public OpenAppSettingsResponse getOpenAppSettingsResponse() {
                SingleFieldBuilderV3<OpenAppSettingsResponse, OpenAppSettingsResponse.Builder, OpenAppSettingsResponseOrBuilder> singleFieldBuilderV3 = this.openAppSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (OpenAppSettingsResponse) singleFieldBuilderV3.getMessage();
                }
                OpenAppSettingsResponse openAppSettingsResponse = this.openAppSettingsResponse_;
                return openAppSettingsResponse == null ? OpenAppSettingsResponse.getDefaultInstance() : openAppSettingsResponse;
            }

            public OpenAppSettingsResponse.Builder getOpenAppSettingsResponseBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (OpenAppSettingsResponse.Builder) getOpenAppSettingsResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
            public OpenAppSettingsResponseOrBuilder getOpenAppSettingsResponseOrBuilder() {
                SingleFieldBuilderV3<OpenAppSettingsResponse, OpenAppSettingsResponse.Builder, OpenAppSettingsResponseOrBuilder> singleFieldBuilderV3 = this.openAppSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (OpenAppSettingsResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                OpenAppSettingsResponse openAppSettingsResponse = this.openAppSettingsResponse_;
                return openAppSettingsResponse == null ? OpenAppSettingsResponse.getDefaultInstance() : openAppSettingsResponse;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
            public SaveAppSettingsRequest getSaveAppSettingsRequest() {
                SingleFieldBuilderV3<SaveAppSettingsRequest, SaveAppSettingsRequest.Builder, SaveAppSettingsRequestOrBuilder> singleFieldBuilderV3 = this.saveAppSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SaveAppSettingsRequest) singleFieldBuilderV3.getMessage();
                }
                SaveAppSettingsRequest saveAppSettingsRequest = this.saveAppSettingsRequest_;
                return saveAppSettingsRequest == null ? SaveAppSettingsRequest.getDefaultInstance() : saveAppSettingsRequest;
            }

            public SaveAppSettingsRequest.Builder getSaveAppSettingsRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (SaveAppSettingsRequest.Builder) getSaveAppSettingsRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
            public SaveAppSettingsRequestOrBuilder getSaveAppSettingsRequestOrBuilder() {
                SingleFieldBuilderV3<SaveAppSettingsRequest, SaveAppSettingsRequest.Builder, SaveAppSettingsRequestOrBuilder> singleFieldBuilderV3 = this.saveAppSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SaveAppSettingsRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SaveAppSettingsRequest saveAppSettingsRequest = this.saveAppSettingsRequest_;
                return saveAppSettingsRequest == null ? SaveAppSettingsRequest.getDefaultInstance() : saveAppSettingsRequest;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
            public SaveAppSettingsResponse getSaveAppSettingsResponse() {
                SingleFieldBuilderV3<SaveAppSettingsResponse, SaveAppSettingsResponse.Builder, SaveAppSettingsResponseOrBuilder> singleFieldBuilderV3 = this.saveAppSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SaveAppSettingsResponse) singleFieldBuilderV3.getMessage();
                }
                SaveAppSettingsResponse saveAppSettingsResponse = this.saveAppSettingsResponse_;
                return saveAppSettingsResponse == null ? SaveAppSettingsResponse.getDefaultInstance() : saveAppSettingsResponse;
            }

            public SaveAppSettingsResponse.Builder getSaveAppSettingsResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (SaveAppSettingsResponse.Builder) getSaveAppSettingsResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
            public SaveAppSettingsResponseOrBuilder getSaveAppSettingsResponseOrBuilder() {
                SingleFieldBuilderV3<SaveAppSettingsResponse, SaveAppSettingsResponse.Builder, SaveAppSettingsResponseOrBuilder> singleFieldBuilderV3 = this.saveAppSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SaveAppSettingsResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SaveAppSettingsResponse saveAppSettingsResponse = this.saveAppSettingsResponse_;
                return saveAppSettingsResponse == null ? SaveAppSettingsResponse.getDefaultInstance() : saveAppSettingsResponse;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
            public SendAppSettingsRequest getSendAppSettingsRequest() {
                SingleFieldBuilderV3<SendAppSettingsRequest, SendAppSettingsRequest.Builder, SendAppSettingsRequestOrBuilder> singleFieldBuilderV3 = this.sendAppSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SendAppSettingsRequest) singleFieldBuilderV3.getMessage();
                }
                SendAppSettingsRequest sendAppSettingsRequest = this.sendAppSettingsRequest_;
                return sendAppSettingsRequest == null ? SendAppSettingsRequest.getDefaultInstance() : sendAppSettingsRequest;
            }

            public SendAppSettingsRequest.Builder getSendAppSettingsRequestBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (SendAppSettingsRequest.Builder) getSendAppSettingsRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
            public SendAppSettingsRequestOrBuilder getSendAppSettingsRequestOrBuilder() {
                SingleFieldBuilderV3<SendAppSettingsRequest, SendAppSettingsRequest.Builder, SendAppSettingsRequestOrBuilder> singleFieldBuilderV3 = this.sendAppSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SendAppSettingsRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SendAppSettingsRequest sendAppSettingsRequest = this.sendAppSettingsRequest_;
                return sendAppSettingsRequest == null ? SendAppSettingsRequest.getDefaultInstance() : sendAppSettingsRequest;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
            public SendAppSettingsResponse getSendAppSettingsResponse() {
                SingleFieldBuilderV3<SendAppSettingsResponse, SendAppSettingsResponse.Builder, SendAppSettingsResponseOrBuilder> singleFieldBuilderV3 = this.sendAppSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SendAppSettingsResponse) singleFieldBuilderV3.getMessage();
                }
                SendAppSettingsResponse sendAppSettingsResponse = this.sendAppSettingsResponse_;
                return sendAppSettingsResponse == null ? SendAppSettingsResponse.getDefaultInstance() : sendAppSettingsResponse;
            }

            public SendAppSettingsResponse.Builder getSendAppSettingsResponseBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (SendAppSettingsResponse.Builder) getSendAppSettingsResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
            public SendAppSettingsResponseOrBuilder getSendAppSettingsResponseOrBuilder() {
                SingleFieldBuilderV3<SendAppSettingsResponse, SendAppSettingsResponse.Builder, SendAppSettingsResponseOrBuilder> singleFieldBuilderV3 = this.sendAppSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SendAppSettingsResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SendAppSettingsResponse sendAppSettingsResponse = this.sendAppSettingsResponse_;
                return sendAppSettingsResponse == null ? SendAppSettingsResponse.getDefaultInstance() : sendAppSettingsResponse;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
            public VerifiedAppSettingsNotification getVerifiedAppSettingsNotification() {
                SingleFieldBuilderV3<VerifiedAppSettingsNotification, VerifiedAppSettingsNotification.Builder, VerifiedAppSettingsNotificationOrBuilder> singleFieldBuilderV3 = this.verifiedAppSettingsNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (VerifiedAppSettingsNotification) singleFieldBuilderV3.getMessage();
                }
                VerifiedAppSettingsNotification verifiedAppSettingsNotification = this.verifiedAppSettingsNotification_;
                return verifiedAppSettingsNotification == null ? VerifiedAppSettingsNotification.getDefaultInstance() : verifiedAppSettingsNotification;
            }

            public VerifiedAppSettingsNotification.Builder getVerifiedAppSettingsNotificationBuilder() {
                this.bitField0_ |= 1024;
                onChanged();
                return (VerifiedAppSettingsNotification.Builder) getVerifiedAppSettingsNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
            public VerifiedAppSettingsNotificationOrBuilder getVerifiedAppSettingsNotificationOrBuilder() {
                SingleFieldBuilderV3<VerifiedAppSettingsNotification, VerifiedAppSettingsNotification.Builder, VerifiedAppSettingsNotificationOrBuilder> singleFieldBuilderV3 = this.verifiedAppSettingsNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (VerifiedAppSettingsNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                VerifiedAppSettingsNotification verifiedAppSettingsNotification = this.verifiedAppSettingsNotification_;
                return verifiedAppSettingsNotification == null ? VerifiedAppSettingsNotification.getDefaultInstance() : verifiedAppSettingsNotification;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
            public VerifyAppSettingsRequest getVerifyAppSettingsRequest() {
                SingleFieldBuilderV3<VerifyAppSettingsRequest, VerifyAppSettingsRequest.Builder, VerifyAppSettingsRequestOrBuilder> singleFieldBuilderV3 = this.verifyAppSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (VerifyAppSettingsRequest) singleFieldBuilderV3.getMessage();
                }
                VerifyAppSettingsRequest verifyAppSettingsRequest = this.verifyAppSettingsRequest_;
                return verifyAppSettingsRequest == null ? VerifyAppSettingsRequest.getDefaultInstance() : verifyAppSettingsRequest;
            }

            public VerifyAppSettingsRequest.Builder getVerifyAppSettingsRequestBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (VerifyAppSettingsRequest.Builder) getVerifyAppSettingsRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
            public VerifyAppSettingsRequestOrBuilder getVerifyAppSettingsRequestOrBuilder() {
                SingleFieldBuilderV3<VerifyAppSettingsRequest, VerifyAppSettingsRequest.Builder, VerifyAppSettingsRequestOrBuilder> singleFieldBuilderV3 = this.verifyAppSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (VerifyAppSettingsRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                VerifyAppSettingsRequest verifyAppSettingsRequest = this.verifyAppSettingsRequest_;
                return verifyAppSettingsRequest == null ? VerifyAppSettingsRequest.getDefaultInstance() : verifyAppSettingsRequest;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
            public VerifyAppSettingsResponse getVerifyAppSettingsResponse() {
                SingleFieldBuilderV3<VerifyAppSettingsResponse, VerifyAppSettingsResponse.Builder, VerifyAppSettingsResponseOrBuilder> singleFieldBuilderV3 = this.verifyAppSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (VerifyAppSettingsResponse) singleFieldBuilderV3.getMessage();
                }
                VerifyAppSettingsResponse verifyAppSettingsResponse = this.verifyAppSettingsResponse_;
                return verifyAppSettingsResponse == null ? VerifyAppSettingsResponse.getDefaultInstance() : verifyAppSettingsResponse;
            }

            public VerifyAppSettingsResponse.Builder getVerifyAppSettingsResponseBuilder() {
                this.bitField0_ |= 512;
                onChanged();
                return (VerifyAppSettingsResponse.Builder) getVerifyAppSettingsResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
            public VerifyAppSettingsResponseOrBuilder getVerifyAppSettingsResponseOrBuilder() {
                SingleFieldBuilderV3<VerifyAppSettingsResponse, VerifyAppSettingsResponse.Builder, VerifyAppSettingsResponseOrBuilder> singleFieldBuilderV3 = this.verifyAppSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (VerifyAppSettingsResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                VerifyAppSettingsResponse verifyAppSettingsResponse = this.verifyAppSettingsResponse_;
                return verifyAppSettingsResponse == null ? VerifyAppSettingsResponse.getDefaultInstance() : verifyAppSettingsResponse;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
            public boolean hasGetAppSettingsRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
            public boolean hasGetAppSettingsResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
            public boolean hasOpenAppSettingsRequest() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
            public boolean hasOpenAppSettingsResponse() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
            public boolean hasSaveAppSettingsRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
            public boolean hasSaveAppSettingsResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
            public boolean hasSendAppSettingsRequest() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
            public boolean hasSendAppSettingsResponse() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
            public boolean hasVerifiedAppSettingsNotification() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
            public boolean hasVerifyAppSettingsRequest() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.ConnectIQAppSettingsServiceOrBuilder
            public boolean hasVerifyAppSettingsResponse() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_ConnectIQAppSettingsService_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectIQAppSettingsService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasGetAppSettingsRequest() && !getGetAppSettingsRequest().isInitialized()) {
                    return false;
                }
                if (hasGetAppSettingsResponse() && !getGetAppSettingsResponse().isInitialized()) {
                    return false;
                }
                if (hasSaveAppSettingsRequest() && !getSaveAppSettingsRequest().isInitialized()) {
                    return false;
                }
                if (hasSaveAppSettingsResponse() && !getSaveAppSettingsResponse().isInitialized()) {
                    return false;
                }
                if (hasSendAppSettingsRequest() && !getSendAppSettingsRequest().isInitialized()) {
                    return false;
                }
                if (hasOpenAppSettingsRequest() && !getOpenAppSettingsRequest().isInitialized()) {
                    return false;
                }
                if (hasOpenAppSettingsResponse() && !getOpenAppSettingsResponse().isInitialized()) {
                    return false;
                }
                if (hasVerifyAppSettingsRequest() && !getVerifyAppSettingsRequest().isInitialized()) {
                    return false;
                }
                if (!hasVerifyAppSettingsResponse() || getVerifyAppSettingsResponse().isInitialized()) {
                    return !hasVerifiedAppSettingsNotification() || getVerifiedAppSettingsNotification().isInitialized();
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
                                    codedInputStream.readMessage(getGetAppSettingsRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                    continue;
                                case 18:
                                    codedInputStream.readMessage(getGetAppSettingsResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                    continue;
                                case 26:
                                    codedInputStream.readMessage(getSaveAppSettingsRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                    continue;
                                case 34:
                                    codedInputStream.readMessage(getSaveAppSettingsResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                    continue;
                                case 42:
                                    codedInputStream.readMessage(getSendAppSettingsRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                    continue;
                                case 50:
                                    codedInputStream.readMessage(getSendAppSettingsResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                    continue;
                                case 58:
                                    codedInputStream.readMessage(getOpenAppSettingsRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                    continue;
                                case 66:
                                    codedInputStream.readMessage(getOpenAppSettingsResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
                                    continue;
                                case 74:
                                    codedInputStream.readMessage(getVerifyAppSettingsRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 256;
                                    continue;
                                case 82:
                                    codedInputStream.readMessage(getVerifyAppSettingsResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 512;
                                    continue;
                                case 90:
                                    codedInputStream.readMessage(getVerifiedAppSettingsNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeGetAppSettingsRequest(GetAppSettingsRequest getAppSettingsRequest) {
                GetAppSettingsRequest getAppSettingsRequest2;
                SingleFieldBuilderV3<GetAppSettingsRequest, GetAppSettingsRequest.Builder, GetAppSettingsRequestOrBuilder> singleFieldBuilderV3 = this.getAppSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(getAppSettingsRequest);
                } else if ((this.bitField0_ & 1) == 0 || (getAppSettingsRequest2 = this.getAppSettingsRequest_) == null || getAppSettingsRequest2 == GetAppSettingsRequest.getDefaultInstance()) {
                    this.getAppSettingsRequest_ = getAppSettingsRequest;
                } else {
                    getGetAppSettingsRequestBuilder().mergeFrom(getAppSettingsRequest);
                }
                if (this.getAppSettingsRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeGetAppSettingsResponse(GetAppSettingsResponse getAppSettingsResponse) {
                GetAppSettingsResponse getAppSettingsResponse2;
                SingleFieldBuilderV3<GetAppSettingsResponse, GetAppSettingsResponse.Builder, GetAppSettingsResponseOrBuilder> singleFieldBuilderV3 = this.getAppSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(getAppSettingsResponse);
                } else if ((this.bitField0_ & 2) == 0 || (getAppSettingsResponse2 = this.getAppSettingsResponse_) == null || getAppSettingsResponse2 == GetAppSettingsResponse.getDefaultInstance()) {
                    this.getAppSettingsResponse_ = getAppSettingsResponse;
                } else {
                    getGetAppSettingsResponseBuilder().mergeFrom(getAppSettingsResponse);
                }
                if (this.getAppSettingsResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeOpenAppSettingsRequest(OpenAppSettingsRequest openAppSettingsRequest) {
                OpenAppSettingsRequest openAppSettingsRequest2;
                SingleFieldBuilderV3<OpenAppSettingsRequest, OpenAppSettingsRequest.Builder, OpenAppSettingsRequestOrBuilder> singleFieldBuilderV3 = this.openAppSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(openAppSettingsRequest);
                } else if ((this.bitField0_ & 64) == 0 || (openAppSettingsRequest2 = this.openAppSettingsRequest_) == null || openAppSettingsRequest2 == OpenAppSettingsRequest.getDefaultInstance()) {
                    this.openAppSettingsRequest_ = openAppSettingsRequest;
                } else {
                    getOpenAppSettingsRequestBuilder().mergeFrom(openAppSettingsRequest);
                }
                if (this.openAppSettingsRequest_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeOpenAppSettingsResponse(OpenAppSettingsResponse openAppSettingsResponse) {
                OpenAppSettingsResponse openAppSettingsResponse2;
                SingleFieldBuilderV3<OpenAppSettingsResponse, OpenAppSettingsResponse.Builder, OpenAppSettingsResponseOrBuilder> singleFieldBuilderV3 = this.openAppSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(openAppSettingsResponse);
                } else if ((this.bitField0_ & 128) == 0 || (openAppSettingsResponse2 = this.openAppSettingsResponse_) == null || openAppSettingsResponse2 == OpenAppSettingsResponse.getDefaultInstance()) {
                    this.openAppSettingsResponse_ = openAppSettingsResponse;
                } else {
                    getOpenAppSettingsResponseBuilder().mergeFrom(openAppSettingsResponse);
                }
                if (this.openAppSettingsResponse_ != null) {
                    this.bitField0_ |= 128;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSaveAppSettingsRequest(SaveAppSettingsRequest saveAppSettingsRequest) {
                SaveAppSettingsRequest saveAppSettingsRequest2;
                SingleFieldBuilderV3<SaveAppSettingsRequest, SaveAppSettingsRequest.Builder, SaveAppSettingsRequestOrBuilder> singleFieldBuilderV3 = this.saveAppSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(saveAppSettingsRequest);
                } else if ((this.bitField0_ & 4) == 0 || (saveAppSettingsRequest2 = this.saveAppSettingsRequest_) == null || saveAppSettingsRequest2 == SaveAppSettingsRequest.getDefaultInstance()) {
                    this.saveAppSettingsRequest_ = saveAppSettingsRequest;
                } else {
                    getSaveAppSettingsRequestBuilder().mergeFrom(saveAppSettingsRequest);
                }
                if (this.saveAppSettingsRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSaveAppSettingsResponse(SaveAppSettingsResponse saveAppSettingsResponse) {
                SaveAppSettingsResponse saveAppSettingsResponse2;
                SingleFieldBuilderV3<SaveAppSettingsResponse, SaveAppSettingsResponse.Builder, SaveAppSettingsResponseOrBuilder> singleFieldBuilderV3 = this.saveAppSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(saveAppSettingsResponse);
                } else if ((this.bitField0_ & 8) == 0 || (saveAppSettingsResponse2 = this.saveAppSettingsResponse_) == null || saveAppSettingsResponse2 == SaveAppSettingsResponse.getDefaultInstance()) {
                    this.saveAppSettingsResponse_ = saveAppSettingsResponse;
                } else {
                    getSaveAppSettingsResponseBuilder().mergeFrom(saveAppSettingsResponse);
                }
                if (this.saveAppSettingsResponse_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSendAppSettingsRequest(SendAppSettingsRequest sendAppSettingsRequest) {
                SendAppSettingsRequest sendAppSettingsRequest2;
                SingleFieldBuilderV3<SendAppSettingsRequest, SendAppSettingsRequest.Builder, SendAppSettingsRequestOrBuilder> singleFieldBuilderV3 = this.sendAppSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(sendAppSettingsRequest);
                } else if ((this.bitField0_ & 16) == 0 || (sendAppSettingsRequest2 = this.sendAppSettingsRequest_) == null || sendAppSettingsRequest2 == SendAppSettingsRequest.getDefaultInstance()) {
                    this.sendAppSettingsRequest_ = sendAppSettingsRequest;
                } else {
                    getSendAppSettingsRequestBuilder().mergeFrom(sendAppSettingsRequest);
                }
                if (this.sendAppSettingsRequest_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSendAppSettingsResponse(SendAppSettingsResponse sendAppSettingsResponse) {
                SendAppSettingsResponse sendAppSettingsResponse2;
                SingleFieldBuilderV3<SendAppSettingsResponse, SendAppSettingsResponse.Builder, SendAppSettingsResponseOrBuilder> singleFieldBuilderV3 = this.sendAppSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(sendAppSettingsResponse);
                } else if ((this.bitField0_ & 32) == 0 || (sendAppSettingsResponse2 = this.sendAppSettingsResponse_) == null || sendAppSettingsResponse2 == SendAppSettingsResponse.getDefaultInstance()) {
                    this.sendAppSettingsResponse_ = sendAppSettingsResponse;
                } else {
                    getSendAppSettingsResponseBuilder().mergeFrom(sendAppSettingsResponse);
                }
                if (this.sendAppSettingsResponse_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder mergeVerifiedAppSettingsNotification(VerifiedAppSettingsNotification verifiedAppSettingsNotification) {
                VerifiedAppSettingsNotification verifiedAppSettingsNotification2;
                SingleFieldBuilderV3<VerifiedAppSettingsNotification, VerifiedAppSettingsNotification.Builder, VerifiedAppSettingsNotificationOrBuilder> singleFieldBuilderV3 = this.verifiedAppSettingsNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(verifiedAppSettingsNotification);
                } else if ((this.bitField0_ & 1024) == 0 || (verifiedAppSettingsNotification2 = this.verifiedAppSettingsNotification_) == null || verifiedAppSettingsNotification2 == VerifiedAppSettingsNotification.getDefaultInstance()) {
                    this.verifiedAppSettingsNotification_ = verifiedAppSettingsNotification;
                } else {
                    getVerifiedAppSettingsNotificationBuilder().mergeFrom(verifiedAppSettingsNotification);
                }
                if (this.verifiedAppSettingsNotification_ != null) {
                    this.bitField0_ |= 1024;
                    onChanged();
                }
                return this;
            }

            public Builder mergeVerifyAppSettingsRequest(VerifyAppSettingsRequest verifyAppSettingsRequest) {
                VerifyAppSettingsRequest verifyAppSettingsRequest2;
                SingleFieldBuilderV3<VerifyAppSettingsRequest, VerifyAppSettingsRequest.Builder, VerifyAppSettingsRequestOrBuilder> singleFieldBuilderV3 = this.verifyAppSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(verifyAppSettingsRequest);
                } else if ((this.bitField0_ & 256) == 0 || (verifyAppSettingsRequest2 = this.verifyAppSettingsRequest_) == null || verifyAppSettingsRequest2 == VerifyAppSettingsRequest.getDefaultInstance()) {
                    this.verifyAppSettingsRequest_ = verifyAppSettingsRequest;
                } else {
                    getVerifyAppSettingsRequestBuilder().mergeFrom(verifyAppSettingsRequest);
                }
                if (this.verifyAppSettingsRequest_ != null) {
                    this.bitField0_ |= 256;
                    onChanged();
                }
                return this;
            }

            public Builder mergeVerifyAppSettingsResponse(VerifyAppSettingsResponse verifyAppSettingsResponse) {
                VerifyAppSettingsResponse verifyAppSettingsResponse2;
                SingleFieldBuilderV3<VerifyAppSettingsResponse, VerifyAppSettingsResponse.Builder, VerifyAppSettingsResponseOrBuilder> singleFieldBuilderV3 = this.verifyAppSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(verifyAppSettingsResponse);
                } else if ((this.bitField0_ & 512) == 0 || (verifyAppSettingsResponse2 = this.verifyAppSettingsResponse_) == null || verifyAppSettingsResponse2 == VerifyAppSettingsResponse.getDefaultInstance()) {
                    this.verifyAppSettingsResponse_ = verifyAppSettingsResponse;
                } else {
                    getVerifyAppSettingsResponseBuilder().mergeFrom(verifyAppSettingsResponse);
                }
                if (this.verifyAppSettingsResponse_ != null) {
                    this.bitField0_ |= 512;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setGetAppSettingsRequest(GetAppSettingsRequest.Builder builder) {
                SingleFieldBuilderV3<GetAppSettingsRequest, GetAppSettingsRequest.Builder, GetAppSettingsRequestOrBuilder> singleFieldBuilderV3 = this.getAppSettingsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.getAppSettingsRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setGetAppSettingsResponse(GetAppSettingsResponse.Builder builder) {
                SingleFieldBuilderV3<GetAppSettingsResponse, GetAppSettingsResponse.Builder, GetAppSettingsResponseOrBuilder> singleFieldBuilderV3 = this.getAppSettingsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.getAppSettingsResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setOpenAppSettingsRequest(OpenAppSettingsRequest.Builder builder) {
                SingleFieldBuilderV3<OpenAppSettingsRequest, OpenAppSettingsRequest.Builder, OpenAppSettingsRequestOrBuilder> singleFieldBuilderV3 = this.openAppSettingsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.openAppSettingsRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setOpenAppSettingsResponse(OpenAppSettingsResponse.Builder builder) {
                SingleFieldBuilderV3<OpenAppSettingsResponse, OpenAppSettingsResponse.Builder, OpenAppSettingsResponseOrBuilder> singleFieldBuilderV3 = this.openAppSettingsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.openAppSettingsResponse_ = builder.build();
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

            public Builder setSaveAppSettingsRequest(SaveAppSettingsRequest.Builder builder) {
                SingleFieldBuilderV3<SaveAppSettingsRequest, SaveAppSettingsRequest.Builder, SaveAppSettingsRequestOrBuilder> singleFieldBuilderV3 = this.saveAppSettingsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.saveAppSettingsRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSaveAppSettingsResponse(SaveAppSettingsResponse.Builder builder) {
                SingleFieldBuilderV3<SaveAppSettingsResponse, SaveAppSettingsResponse.Builder, SaveAppSettingsResponseOrBuilder> singleFieldBuilderV3 = this.saveAppSettingsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.saveAppSettingsResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSendAppSettingsRequest(SendAppSettingsRequest.Builder builder) {
                SingleFieldBuilderV3<SendAppSettingsRequest, SendAppSettingsRequest.Builder, SendAppSettingsRequestOrBuilder> singleFieldBuilderV3 = this.sendAppSettingsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.sendAppSettingsRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setSendAppSettingsResponse(SendAppSettingsResponse.Builder builder) {
                SingleFieldBuilderV3<SendAppSettingsResponse, SendAppSettingsResponse.Builder, SendAppSettingsResponseOrBuilder> singleFieldBuilderV3 = this.sendAppSettingsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.sendAppSettingsResponse_ = builder.build();
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

            public Builder setVerifiedAppSettingsNotification(VerifiedAppSettingsNotification.Builder builder) {
                SingleFieldBuilderV3<VerifiedAppSettingsNotification, VerifiedAppSettingsNotification.Builder, VerifiedAppSettingsNotificationOrBuilder> singleFieldBuilderV3 = this.verifiedAppSettingsNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.verifiedAppSettingsNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setVerifyAppSettingsRequest(VerifyAppSettingsRequest.Builder builder) {
                SingleFieldBuilderV3<VerifyAppSettingsRequest, VerifyAppSettingsRequest.Builder, VerifyAppSettingsRequestOrBuilder> singleFieldBuilderV3 = this.verifyAppSettingsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.verifyAppSettingsRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setVerifyAppSettingsResponse(VerifyAppSettingsResponse.Builder builder) {
                SingleFieldBuilderV3<VerifyAppSettingsResponse, VerifyAppSettingsResponse.Builder, VerifyAppSettingsResponseOrBuilder> singleFieldBuilderV3 = this.verifyAppSettingsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.verifyAppSettingsResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ConnectIQAppSettingsService getDefaultInstanceForType() {
                return ConnectIQAppSettingsService.getDefaultInstance();
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

            public Builder setGetAppSettingsRequest(GetAppSettingsRequest getAppSettingsRequest) {
                SingleFieldBuilderV3<GetAppSettingsRequest, GetAppSettingsRequest.Builder, GetAppSettingsRequestOrBuilder> singleFieldBuilderV3 = this.getAppSettingsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    getAppSettingsRequest.getClass();
                    this.getAppSettingsRequest_ = getAppSettingsRequest;
                } else {
                    singleFieldBuilderV3.setMessage(getAppSettingsRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setGetAppSettingsResponse(GetAppSettingsResponse getAppSettingsResponse) {
                SingleFieldBuilderV3<GetAppSettingsResponse, GetAppSettingsResponse.Builder, GetAppSettingsResponseOrBuilder> singleFieldBuilderV3 = this.getAppSettingsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    getAppSettingsResponse.getClass();
                    this.getAppSettingsResponse_ = getAppSettingsResponse;
                } else {
                    singleFieldBuilderV3.setMessage(getAppSettingsResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setOpenAppSettingsRequest(OpenAppSettingsRequest openAppSettingsRequest) {
                SingleFieldBuilderV3<OpenAppSettingsRequest, OpenAppSettingsRequest.Builder, OpenAppSettingsRequestOrBuilder> singleFieldBuilderV3 = this.openAppSettingsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    openAppSettingsRequest.getClass();
                    this.openAppSettingsRequest_ = openAppSettingsRequest;
                } else {
                    singleFieldBuilderV3.setMessage(openAppSettingsRequest);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setOpenAppSettingsResponse(OpenAppSettingsResponse openAppSettingsResponse) {
                SingleFieldBuilderV3<OpenAppSettingsResponse, OpenAppSettingsResponse.Builder, OpenAppSettingsResponseOrBuilder> singleFieldBuilderV3 = this.openAppSettingsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    openAppSettingsResponse.getClass();
                    this.openAppSettingsResponse_ = openAppSettingsResponse;
                } else {
                    singleFieldBuilderV3.setMessage(openAppSettingsResponse);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setSaveAppSettingsRequest(SaveAppSettingsRequest saveAppSettingsRequest) {
                SingleFieldBuilderV3<SaveAppSettingsRequest, SaveAppSettingsRequest.Builder, SaveAppSettingsRequestOrBuilder> singleFieldBuilderV3 = this.saveAppSettingsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    saveAppSettingsRequest.getClass();
                    this.saveAppSettingsRequest_ = saveAppSettingsRequest;
                } else {
                    singleFieldBuilderV3.setMessage(saveAppSettingsRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSaveAppSettingsResponse(SaveAppSettingsResponse saveAppSettingsResponse) {
                SingleFieldBuilderV3<SaveAppSettingsResponse, SaveAppSettingsResponse.Builder, SaveAppSettingsResponseOrBuilder> singleFieldBuilderV3 = this.saveAppSettingsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    saveAppSettingsResponse.getClass();
                    this.saveAppSettingsResponse_ = saveAppSettingsResponse;
                } else {
                    singleFieldBuilderV3.setMessage(saveAppSettingsResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSendAppSettingsRequest(SendAppSettingsRequest sendAppSettingsRequest) {
                SingleFieldBuilderV3<SendAppSettingsRequest, SendAppSettingsRequest.Builder, SendAppSettingsRequestOrBuilder> singleFieldBuilderV3 = this.sendAppSettingsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    sendAppSettingsRequest.getClass();
                    this.sendAppSettingsRequest_ = sendAppSettingsRequest;
                } else {
                    singleFieldBuilderV3.setMessage(sendAppSettingsRequest);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setSendAppSettingsResponse(SendAppSettingsResponse sendAppSettingsResponse) {
                SingleFieldBuilderV3<SendAppSettingsResponse, SendAppSettingsResponse.Builder, SendAppSettingsResponseOrBuilder> singleFieldBuilderV3 = this.sendAppSettingsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    sendAppSettingsResponse.getClass();
                    this.sendAppSettingsResponse_ = sendAppSettingsResponse;
                } else {
                    singleFieldBuilderV3.setMessage(sendAppSettingsResponse);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setVerifiedAppSettingsNotification(VerifiedAppSettingsNotification verifiedAppSettingsNotification) {
                SingleFieldBuilderV3<VerifiedAppSettingsNotification, VerifiedAppSettingsNotification.Builder, VerifiedAppSettingsNotificationOrBuilder> singleFieldBuilderV3 = this.verifiedAppSettingsNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    verifiedAppSettingsNotification.getClass();
                    this.verifiedAppSettingsNotification_ = verifiedAppSettingsNotification;
                } else {
                    singleFieldBuilderV3.setMessage(verifiedAppSettingsNotification);
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setVerifyAppSettingsRequest(VerifyAppSettingsRequest verifyAppSettingsRequest) {
                SingleFieldBuilderV3<VerifyAppSettingsRequest, VerifyAppSettingsRequest.Builder, VerifyAppSettingsRequestOrBuilder> singleFieldBuilderV3 = this.verifyAppSettingsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    verifyAppSettingsRequest.getClass();
                    this.verifyAppSettingsRequest_ = verifyAppSettingsRequest;
                } else {
                    singleFieldBuilderV3.setMessage(verifyAppSettingsRequest);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setVerifyAppSettingsResponse(VerifyAppSettingsResponse verifyAppSettingsResponse) {
                SingleFieldBuilderV3<VerifyAppSettingsResponse, VerifyAppSettingsResponse.Builder, VerifyAppSettingsResponseOrBuilder> singleFieldBuilderV3 = this.verifyAppSettingsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    verifyAppSettingsResponse.getClass();
                    this.verifyAppSettingsResponse_ = verifyAppSettingsResponse;
                } else {
                    singleFieldBuilderV3.setMessage(verifyAppSettingsResponse);
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConnectIQAppSettingsService) {
                    return mergeFrom((ConnectIQAppSettingsService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConnectIQAppSettingsService connectIQAppSettingsService) {
                if (connectIQAppSettingsService == ConnectIQAppSettingsService.getDefaultInstance()) {
                    return this;
                }
                if (connectIQAppSettingsService.hasGetAppSettingsRequest()) {
                    mergeGetAppSettingsRequest(connectIQAppSettingsService.getGetAppSettingsRequest());
                }
                if (connectIQAppSettingsService.hasGetAppSettingsResponse()) {
                    mergeGetAppSettingsResponse(connectIQAppSettingsService.getGetAppSettingsResponse());
                }
                if (connectIQAppSettingsService.hasSaveAppSettingsRequest()) {
                    mergeSaveAppSettingsRequest(connectIQAppSettingsService.getSaveAppSettingsRequest());
                }
                if (connectIQAppSettingsService.hasSaveAppSettingsResponse()) {
                    mergeSaveAppSettingsResponse(connectIQAppSettingsService.getSaveAppSettingsResponse());
                }
                if (connectIQAppSettingsService.hasSendAppSettingsRequest()) {
                    mergeSendAppSettingsRequest(connectIQAppSettingsService.getSendAppSettingsRequest());
                }
                if (connectIQAppSettingsService.hasSendAppSettingsResponse()) {
                    mergeSendAppSettingsResponse(connectIQAppSettingsService.getSendAppSettingsResponse());
                }
                if (connectIQAppSettingsService.hasOpenAppSettingsRequest()) {
                    mergeOpenAppSettingsRequest(connectIQAppSettingsService.getOpenAppSettingsRequest());
                }
                if (connectIQAppSettingsService.hasOpenAppSettingsResponse()) {
                    mergeOpenAppSettingsResponse(connectIQAppSettingsService.getOpenAppSettingsResponse());
                }
                if (connectIQAppSettingsService.hasVerifyAppSettingsRequest()) {
                    mergeVerifyAppSettingsRequest(connectIQAppSettingsService.getVerifyAppSettingsRequest());
                }
                if (connectIQAppSettingsService.hasVerifyAppSettingsResponse()) {
                    mergeVerifyAppSettingsResponse(connectIQAppSettingsService.getVerifyAppSettingsResponse());
                }
                if (connectIQAppSettingsService.hasVerifiedAppSettingsNotification()) {
                    mergeVerifiedAppSettingsNotification(connectIQAppSettingsService.getVerifiedAppSettingsNotification());
                }
                mergeUnknownFields(connectIQAppSettingsService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConnectIQAppSettingsService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ ConnectIQAppSettingsService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private ConnectIQAppSettingsService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConnectIQAppSettingsService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQAppSettingsService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectIQAppSettingsService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConnectIQAppSettingsService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConnectIQAppSettingsService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConnectIQAppSettingsService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConnectIQAppSettingsService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConnectIQAppSettingsService parseFrom(InputStream inputStream) {
            return (ConnectIQAppSettingsService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConnectIQAppSettingsService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQAppSettingsService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectIQAppSettingsService parseFrom(CodedInputStream codedInputStream) {
            return (ConnectIQAppSettingsService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConnectIQAppSettingsService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQAppSettingsService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class GetAppSettingsRequest extends GeneratedMessageV3 implements GetAppSettingsRequestOrBuilder {
        public static final int APP_IDENTIFIER_FIELD_NUMBER = 1;
        private static final GetAppSettingsRequest DEFAULT_INSTANCE = new GetAppSettingsRequest();

        @Deprecated
        public static final Parser<GetAppSettingsRequest> PARSER = new AbstractParser<GetAppSettingsRequest>() { // from class: com.garmin.proto.generated.GDIConnectIQAppSettingsProto.GetAppSettingsRequest.1
            @Override // com.google.protobuf.Parser
            public GetAppSettingsRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GetAppSettingsRequest.newBuilder();
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
        private ByteString appIdentifier_;
        private int bitField0_;
        private byte memoizedIsInitialized;

        private GetAppSettingsRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.appIdentifier_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetAppSettingsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_GetAppSettingsRequest_descriptor;
        }

        public static Builder newBuilder(GetAppSettingsRequest getAppSettingsRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getAppSettingsRequest);
        }

        public static GetAppSettingsRequest parseDelimitedFrom(InputStream inputStream) {
            return (GetAppSettingsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetAppSettingsRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GetAppSettingsRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetAppSettingsRequest)) {
                return super.equals(obj);
            }
            GetAppSettingsRequest getAppSettingsRequest = (GetAppSettingsRequest) obj;
            if (hasAppIdentifier() != getAppSettingsRequest.hasAppIdentifier()) {
                return false;
            }
            return (!hasAppIdentifier() || getAppIdentifier().equals(getAppSettingsRequest.getAppIdentifier())) && getUnknownFields().equals(getAppSettingsRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.GetAppSettingsRequestOrBuilder
        public ByteString getAppIdentifier() {
            return this.appIdentifier_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GetAppSettingsRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.appIdentifier_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.GetAppSettingsRequestOrBuilder
        public boolean hasAppIdentifier() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasAppIdentifier()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getAppIdentifier().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_GetAppSettingsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetAppSettingsRequest.class, Builder.class);
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
            if (hasAppIdentifier()) {
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
            return new GetAppSettingsRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.appIdentifier_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetAppSettingsRequestOrBuilder {
            private ByteString appIdentifier_;
            private int bitField0_;

            private Builder() {
                this.appIdentifier_ = ByteString.EMPTY;
            }

            private void buildPartial0(GetAppSettingsRequest getAppSettingsRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    getAppSettingsRequest.appIdentifier_ = this.appIdentifier_;
                } else {
                    i14 = 0;
                }
                getAppSettingsRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_GetAppSettingsRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetAppSettingsRequest build() {
                GetAppSettingsRequest getAppSettingsRequestBuildPartial = buildPartial();
                if (getAppSettingsRequestBuildPartial.isInitialized()) {
                    return getAppSettingsRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) getAppSettingsRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetAppSettingsRequest buildPartial() {
                GetAppSettingsRequest getAppSettingsRequest = new GetAppSettingsRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(getAppSettingsRequest);
                }
                onBuilt();
                return getAppSettingsRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.appIdentifier_ = ByteString.EMPTY;
                return this;
            }

            public Builder clearAppIdentifier() {
                this.bitField0_ &= -2;
                this.appIdentifier_ = GetAppSettingsRequest.getDefaultInstance().getAppIdentifier();
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

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.GetAppSettingsRequestOrBuilder
            public ByteString getAppIdentifier() {
                return this.appIdentifier_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_GetAppSettingsRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.GetAppSettingsRequestOrBuilder
            public boolean hasAppIdentifier() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_GetAppSettingsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetAppSettingsRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasAppIdentifier();
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
                                    this.appIdentifier_ = codedInputStream.readBytes();
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

            public Builder setAppIdentifier(ByteString byteString) {
                byteString.getClass();
                this.appIdentifier_ = byteString;
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
            public GetAppSettingsRequest getDefaultInstanceForType() {
                return GetAppSettingsRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.appIdentifier_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GetAppSettingsRequest) {
                    return mergeFrom((GetAppSettingsRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GetAppSettingsRequest getAppSettingsRequest) {
                if (getAppSettingsRequest == GetAppSettingsRequest.getDefaultInstance()) {
                    return this;
                }
                if (getAppSettingsRequest.hasAppIdentifier()) {
                    setAppIdentifier(getAppSettingsRequest.getAppIdentifier());
                }
                mergeUnknownFields(getAppSettingsRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GetAppSettingsRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static GetAppSettingsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetAppSettingsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetAppSettingsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GetAppSettingsRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public /* synthetic */ GetAppSettingsRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetAppSettingsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private GetAppSettingsRequest() {
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.appIdentifier_ = byteString;
        }

        public static GetAppSettingsRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GetAppSettingsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GetAppSettingsRequest parseFrom(InputStream inputStream) {
            return (GetAppSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GetAppSettingsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetAppSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetAppSettingsRequest parseFrom(CodedInputStream codedInputStream) {
            return (GetAppSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GetAppSettingsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetAppSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class GetAppSettingsResponse extends GeneratedMessageV3 implements GetAppSettingsResponseOrBuilder {
        public static final int APP_IDENTIFIER_FIELD_NUMBER = 1;
        private static final GetAppSettingsResponse DEFAULT_INSTANCE = new GetAppSettingsResponse();

        @Deprecated
        public static final Parser<GetAppSettingsResponse> PARSER = new AbstractParser<GetAppSettingsResponse>() { // from class: com.garmin.proto.generated.GDIConnectIQAppSettingsProto.GetAppSettingsResponse.1
            @Override // com.google.protobuf.Parser
            public GetAppSettingsResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GetAppSettingsResponse.newBuilder();
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
        public static final int RESPONSE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private ByteString appIdentifier_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int response_;

        private GetAppSettingsResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.appIdentifier_ = ByteString.EMPTY;
            this.response_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetAppSettingsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_GetAppSettingsResponse_descriptor;
        }

        public static Builder newBuilder(GetAppSettingsResponse getAppSettingsResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getAppSettingsResponse);
        }

        public static GetAppSettingsResponse parseDelimitedFrom(InputStream inputStream) {
            return (GetAppSettingsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetAppSettingsResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GetAppSettingsResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetAppSettingsResponse)) {
                return super.equals(obj);
            }
            GetAppSettingsResponse getAppSettingsResponse = (GetAppSettingsResponse) obj;
            if (hasAppIdentifier() != getAppSettingsResponse.hasAppIdentifier()) {
                return false;
            }
            if ((!hasAppIdentifier() || getAppIdentifier().equals(getAppSettingsResponse.getAppIdentifier())) && hasResponse() == getAppSettingsResponse.hasResponse()) {
                return (!hasResponse() || this.response_ == getAppSettingsResponse.response_) && getUnknownFields().equals(getAppSettingsResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.GetAppSettingsResponseOrBuilder
        public ByteString getAppIdentifier() {
            return this.appIdentifier_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GetAppSettingsResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.GetAppSettingsResponseOrBuilder
        public Response getResponse() {
            Response responseForNumber = Response.forNumber(this.response_);
            return responseForNumber == null ? Response.UNKNOWN_RESPONSE : responseForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.appIdentifier_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBytesSize += CodedOutputStream.computeEnumSize(2, this.response_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBytesSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.GetAppSettingsResponseOrBuilder
        public boolean hasAppIdentifier() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.GetAppSettingsResponseOrBuilder
        public boolean hasResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasAppIdentifier()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getAppIdentifier().hashCode();
            }
            if (hasResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.response_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_GetAppSettingsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetAppSettingsResponse.class, Builder.class);
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
            if (hasAppIdentifier()) {
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
            return new GetAppSettingsResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.appIdentifier_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.response_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetAppSettingsResponseOrBuilder {
            private ByteString appIdentifier_;
            private int bitField0_;
            private int response_;

            private Builder() {
                this.appIdentifier_ = ByteString.EMPTY;
                this.response_ = 0;
            }

            private void buildPartial0(GetAppSettingsResponse getAppSettingsResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    getAppSettingsResponse.appIdentifier_ = this.appIdentifier_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    getAppSettingsResponse.response_ = this.response_;
                    i14 |= 2;
                }
                getAppSettingsResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_GetAppSettingsResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetAppSettingsResponse build() {
                GetAppSettingsResponse getAppSettingsResponseBuildPartial = buildPartial();
                if (getAppSettingsResponseBuildPartial.isInitialized()) {
                    return getAppSettingsResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) getAppSettingsResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetAppSettingsResponse buildPartial() {
                GetAppSettingsResponse getAppSettingsResponse = new GetAppSettingsResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(getAppSettingsResponse);
                }
                onBuilt();
                return getAppSettingsResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.appIdentifier_ = ByteString.EMPTY;
                this.response_ = 0;
                return this;
            }

            public Builder clearAppIdentifier() {
                this.bitField0_ &= -2;
                this.appIdentifier_ = GetAppSettingsResponse.getDefaultInstance().getAppIdentifier();
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

            public Builder clearResponse() {
                this.bitField0_ &= -3;
                this.response_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.GetAppSettingsResponseOrBuilder
            public ByteString getAppIdentifier() {
                return this.appIdentifier_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_GetAppSettingsResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.GetAppSettingsResponseOrBuilder
            public Response getResponse() {
                Response responseForNumber = Response.forNumber(this.response_);
                return responseForNumber == null ? Response.UNKNOWN_RESPONSE : responseForNumber;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.GetAppSettingsResponseOrBuilder
            public boolean hasAppIdentifier() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.GetAppSettingsResponseOrBuilder
            public boolean hasResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_GetAppSettingsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetAppSettingsResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasAppIdentifier();
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
                                    this.appIdentifier_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (Response.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.response_ = i14;
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

            public Builder setAppIdentifier(ByteString byteString) {
                byteString.getClass();
                this.appIdentifier_ = byteString;
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

            public Builder setResponse(Response response) {
                response.getClass();
                this.bitField0_ |= 2;
                this.response_ = response.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public GetAppSettingsResponse getDefaultInstanceForType() {
                return GetAppSettingsResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.appIdentifier_ = ByteString.EMPTY;
                this.response_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GetAppSettingsResponse) {
                    return mergeFrom((GetAppSettingsResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GetAppSettingsResponse getAppSettingsResponse) {
                if (getAppSettingsResponse == GetAppSettingsResponse.getDefaultInstance()) {
                    return this;
                }
                if (getAppSettingsResponse.hasAppIdentifier()) {
                    setAppIdentifier(getAppSettingsResponse.getAppIdentifier());
                }
                if (getAppSettingsResponse.hasResponse()) {
                    setResponse(getAppSettingsResponse.getResponse());
                }
                mergeUnknownFields(getAppSettingsResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GetAppSettingsResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static GetAppSettingsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetAppSettingsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetAppSettingsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GetAppSettingsResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetAppSettingsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GetAppSettingsResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GetAppSettingsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ GetAppSettingsResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static GetAppSettingsResponse parseFrom(InputStream inputStream) {
            return (GetAppSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private GetAppSettingsResponse() {
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.appIdentifier_ = byteString;
            this.response_ = 0;
        }

        public static GetAppSettingsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetAppSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetAppSettingsResponse parseFrom(CodedInputStream codedInputStream) {
            return (GetAppSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GetAppSettingsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetAppSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Response implements ProtocolMessageEnum {
            UNKNOWN_RESPONSE(0),
            SUCCESS(1),
            APP_NOT_INSTALLED(2);

            public static final int APP_NOT_INSTALLED_VALUE = 2;
            public static final int SUCCESS_VALUE = 1;
            public static final int UNKNOWN_RESPONSE_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Response> internalValueMap = new Internal.EnumLiteMap<Response>() { // from class: com.garmin.proto.generated.GDIConnectIQAppSettingsProto.GetAppSettingsResponse.Response.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Response findValueByNumber(int i14) {
                    return Response.forNumber(i14);
                }
            };
            private static final Response[] VALUES = values();

            Response(int i14) {
                this.value = i14;
            }

            public static Response forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN_RESPONSE;
                }
                if (i14 == 1) {
                    return SUCCESS;
                }
                if (i14 != 2) {
                    return null;
                }
                return APP_NOT_INSTALLED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return GetAppSettingsResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Response> internalGetValueMap() {
                return internalValueMap;
            }

            public static Response valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Response valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class OpenAppSettingsRequest extends GeneratedMessageV3 implements OpenAppSettingsRequestOrBuilder {
        private static final OpenAppSettingsRequest DEFAULT_INSTANCE = new OpenAppSettingsRequest();

        @Deprecated
        public static final Parser<OpenAppSettingsRequest> PARSER = new AbstractParser<OpenAppSettingsRequest>() { // from class: com.garmin.proto.generated.GDIConnectIQAppSettingsProto.OpenAppSettingsRequest.1
            @Override // com.google.protobuf.Parser
            public OpenAppSettingsRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = OpenAppSettingsRequest.newBuilder();
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
        public static final int STORE_UUID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private ByteString storeUuid_;

        private OpenAppSettingsRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.storeUuid_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static OpenAppSettingsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_OpenAppSettingsRequest_descriptor;
        }

        public static Builder newBuilder(OpenAppSettingsRequest openAppSettingsRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(openAppSettingsRequest);
        }

        public static OpenAppSettingsRequest parseDelimitedFrom(InputStream inputStream) {
            return (OpenAppSettingsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static OpenAppSettingsRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<OpenAppSettingsRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OpenAppSettingsRequest)) {
                return super.equals(obj);
            }
            OpenAppSettingsRequest openAppSettingsRequest = (OpenAppSettingsRequest) obj;
            if (hasStoreUuid() != openAppSettingsRequest.hasStoreUuid()) {
                return false;
            }
            return (!hasStoreUuid() || getStoreUuid().equals(openAppSettingsRequest.getStoreUuid())) && getUnknownFields().equals(openAppSettingsRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<OpenAppSettingsRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.storeUuid_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.OpenAppSettingsRequestOrBuilder
        public ByteString getStoreUuid() {
            return this.storeUuid_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.OpenAppSettingsRequestOrBuilder
        public boolean hasStoreUuid() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasStoreUuid()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getStoreUuid().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_OpenAppSettingsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(OpenAppSettingsRequest.class, Builder.class);
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
            if (hasStoreUuid()) {
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
            return new OpenAppSettingsRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.storeUuid_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements OpenAppSettingsRequestOrBuilder {
            private int bitField0_;
            private ByteString storeUuid_;

            private Builder() {
                this.storeUuid_ = ByteString.EMPTY;
            }

            private void buildPartial0(OpenAppSettingsRequest openAppSettingsRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    openAppSettingsRequest.storeUuid_ = this.storeUuid_;
                } else {
                    i14 = 0;
                }
                openAppSettingsRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_OpenAppSettingsRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public OpenAppSettingsRequest build() {
                OpenAppSettingsRequest openAppSettingsRequestBuildPartial = buildPartial();
                if (openAppSettingsRequestBuildPartial.isInitialized()) {
                    return openAppSettingsRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) openAppSettingsRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public OpenAppSettingsRequest buildPartial() {
                OpenAppSettingsRequest openAppSettingsRequest = new OpenAppSettingsRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(openAppSettingsRequest);
                }
                onBuilt();
                return openAppSettingsRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.storeUuid_ = ByteString.EMPTY;
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

            public Builder clearStoreUuid() {
                this.bitField0_ &= -2;
                this.storeUuid_ = OpenAppSettingsRequest.getDefaultInstance().getStoreUuid();
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
                return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_OpenAppSettingsRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.OpenAppSettingsRequestOrBuilder
            public ByteString getStoreUuid() {
                return this.storeUuid_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.OpenAppSettingsRequestOrBuilder
            public boolean hasStoreUuid() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_OpenAppSettingsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(OpenAppSettingsRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasStoreUuid();
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
                                    this.storeUuid_ = codedInputStream.readBytes();
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

            public Builder setStoreUuid(ByteString byteString) {
                byteString.getClass();
                this.storeUuid_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public OpenAppSettingsRequest getDefaultInstanceForType() {
                return OpenAppSettingsRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.storeUuid_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof OpenAppSettingsRequest) {
                    return mergeFrom((OpenAppSettingsRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(OpenAppSettingsRequest openAppSettingsRequest) {
                if (openAppSettingsRequest == OpenAppSettingsRequest.getDefaultInstance()) {
                    return this;
                }
                if (openAppSettingsRequest.hasStoreUuid()) {
                    setStoreUuid(openAppSettingsRequest.getStoreUuid());
                }
                mergeUnknownFields(openAppSettingsRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public OpenAppSettingsRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static OpenAppSettingsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OpenAppSettingsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static OpenAppSettingsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static OpenAppSettingsRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public /* synthetic */ OpenAppSettingsRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static OpenAppSettingsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private OpenAppSettingsRequest() {
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.storeUuid_ = byteString;
        }

        public static OpenAppSettingsRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static OpenAppSettingsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static OpenAppSettingsRequest parseFrom(InputStream inputStream) {
            return (OpenAppSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static OpenAppSettingsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OpenAppSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static OpenAppSettingsRequest parseFrom(CodedInputStream codedInputStream) {
            return (OpenAppSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static OpenAppSettingsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OpenAppSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OpenAppSettingsResponse extends GeneratedMessageV3 implements OpenAppSettingsResponseOrBuilder {
        public static final int APP_IDENTIFIER_FIELD_NUMBER = 1;
        private static final OpenAppSettingsResponse DEFAULT_INSTANCE = new OpenAppSettingsResponse();

        @Deprecated
        public static final Parser<OpenAppSettingsResponse> PARSER = new AbstractParser<OpenAppSettingsResponse>() { // from class: com.garmin.proto.generated.GDIConnectIQAppSettingsProto.OpenAppSettingsResponse.1
            @Override // com.google.protobuf.Parser
            public OpenAppSettingsResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = OpenAppSettingsResponse.newBuilder();
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
        public static final int STATUS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private ByteString appIdentifier_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int status_;

        private OpenAppSettingsResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.appIdentifier_ = ByteString.EMPTY;
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static OpenAppSettingsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_OpenAppSettingsResponse_descriptor;
        }

        public static Builder newBuilder(OpenAppSettingsResponse openAppSettingsResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(openAppSettingsResponse);
        }

        public static OpenAppSettingsResponse parseDelimitedFrom(InputStream inputStream) {
            return (OpenAppSettingsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static OpenAppSettingsResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<OpenAppSettingsResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OpenAppSettingsResponse)) {
                return super.equals(obj);
            }
            OpenAppSettingsResponse openAppSettingsResponse = (OpenAppSettingsResponse) obj;
            if (hasAppIdentifier() != openAppSettingsResponse.hasAppIdentifier()) {
                return false;
            }
            if ((!hasAppIdentifier() || getAppIdentifier().equals(openAppSettingsResponse.getAppIdentifier())) && hasStatus() == openAppSettingsResponse.hasStatus()) {
                return (!hasStatus() || this.status_ == openAppSettingsResponse.status_) && getUnknownFields().equals(openAppSettingsResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.OpenAppSettingsResponseOrBuilder
        public ByteString getAppIdentifier() {
            return this.appIdentifier_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<OpenAppSettingsResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.appIdentifier_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBytesSize += CodedOutputStream.computeEnumSize(2, this.status_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBytesSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.OpenAppSettingsResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.OpenAppSettingsResponseOrBuilder
        public boolean hasAppIdentifier() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.OpenAppSettingsResponseOrBuilder
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
            if (hasAppIdentifier()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getAppIdentifier().hashCode();
            }
            if (hasStatus()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.status_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_OpenAppSettingsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(OpenAppSettingsResponse.class, Builder.class);
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
            if (!hasAppIdentifier()) {
                this.memoizedIsInitialized = (byte) 0;
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
            return new OpenAppSettingsResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.appIdentifier_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.status_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements OpenAppSettingsResponseOrBuilder {
            private ByteString appIdentifier_;
            private int bitField0_;
            private int status_;

            private Builder() {
                this.appIdentifier_ = ByteString.EMPTY;
                this.status_ = 0;
            }

            private void buildPartial0(OpenAppSettingsResponse openAppSettingsResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    openAppSettingsResponse.appIdentifier_ = this.appIdentifier_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    openAppSettingsResponse.status_ = this.status_;
                    i14 |= 2;
                }
                openAppSettingsResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_OpenAppSettingsResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public OpenAppSettingsResponse build() {
                OpenAppSettingsResponse openAppSettingsResponseBuildPartial = buildPartial();
                if (openAppSettingsResponseBuildPartial.isInitialized()) {
                    return openAppSettingsResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) openAppSettingsResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public OpenAppSettingsResponse buildPartial() {
                OpenAppSettingsResponse openAppSettingsResponse = new OpenAppSettingsResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(openAppSettingsResponse);
                }
                onBuilt();
                return openAppSettingsResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.appIdentifier_ = ByteString.EMPTY;
                this.status_ = 0;
                return this;
            }

            public Builder clearAppIdentifier() {
                this.bitField0_ &= -2;
                this.appIdentifier_ = OpenAppSettingsResponse.getDefaultInstance().getAppIdentifier();
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

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.OpenAppSettingsResponseOrBuilder
            public ByteString getAppIdentifier() {
                return this.appIdentifier_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_OpenAppSettingsResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.OpenAppSettingsResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.OpenAppSettingsResponseOrBuilder
            public boolean hasAppIdentifier() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.OpenAppSettingsResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_OpenAppSettingsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(OpenAppSettingsResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasAppIdentifier() && hasStatus();
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
                                    this.appIdentifier_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (ResponseStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.status_ = i14;
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

            public Builder setAppIdentifier(ByteString byteString) {
                byteString.getClass();
                this.appIdentifier_ = byteString;
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
            public OpenAppSettingsResponse getDefaultInstanceForType() {
                return OpenAppSettingsResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.appIdentifier_ = ByteString.EMPTY;
                this.status_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof OpenAppSettingsResponse) {
                    return mergeFrom((OpenAppSettingsResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(OpenAppSettingsResponse openAppSettingsResponse) {
                if (openAppSettingsResponse == OpenAppSettingsResponse.getDefaultInstance()) {
                    return this;
                }
                if (openAppSettingsResponse.hasAppIdentifier()) {
                    setAppIdentifier(openAppSettingsResponse.getAppIdentifier());
                }
                if (openAppSettingsResponse.hasStatus()) {
                    setStatus(openAppSettingsResponse.getStatus());
                }
                mergeUnknownFields(openAppSettingsResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public OpenAppSettingsResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static OpenAppSettingsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OpenAppSettingsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static OpenAppSettingsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static OpenAppSettingsResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static OpenAppSettingsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static OpenAppSettingsResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static OpenAppSettingsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ OpenAppSettingsResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static OpenAppSettingsResponse parseFrom(InputStream inputStream) {
            return (OpenAppSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private OpenAppSettingsResponse() {
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.appIdentifier_ = byteString;
            this.status_ = 0;
        }

        public static OpenAppSettingsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OpenAppSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static OpenAppSettingsResponse parseFrom(CodedInputStream codedInputStream) {
            return (OpenAppSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static OpenAppSettingsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OpenAppSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            UNKNOWN_RESPONSE(0),
            SUCCESS(1);

            public static final int SUCCESS_VALUE = 1;
            public static final int UNKNOWN_RESPONSE_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDIConnectIQAppSettingsProto.OpenAppSettingsResponse.ResponseStatus.1
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
                    return UNKNOWN_RESPONSE;
                }
                if (i14 != 1) {
                    return null;
                }
                return SUCCESS;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return OpenAppSettingsResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class SaveAppSettingsRequest extends GeneratedMessageV3 implements SaveAppSettingsRequestOrBuilder {
        public static final int APP_IDENTIFIER_FIELD_NUMBER = 1;
        private static final SaveAppSettingsRequest DEFAULT_INSTANCE = new SaveAppSettingsRequest();

        @Deprecated
        public static final Parser<SaveAppSettingsRequest> PARSER = new AbstractParser<SaveAppSettingsRequest>() { // from class: com.garmin.proto.generated.GDIConnectIQAppSettingsProto.SaveAppSettingsRequest.1
            @Override // com.google.protobuf.Parser
            public SaveAppSettingsRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SaveAppSettingsRequest.newBuilder();
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
        public static final int SETTINGS_VALUES_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private ByteString appIdentifier_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private ByteString settingsValues_;

        private SaveAppSettingsRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            ByteString byteString = ByteString.EMPTY;
            this.appIdentifier_ = byteString;
            this.settingsValues_ = byteString;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SaveAppSettingsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_SaveAppSettingsRequest_descriptor;
        }

        public static Builder newBuilder(SaveAppSettingsRequest saveAppSettingsRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(saveAppSettingsRequest);
        }

        public static SaveAppSettingsRequest parseDelimitedFrom(InputStream inputStream) {
            return (SaveAppSettingsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SaveAppSettingsRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SaveAppSettingsRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SaveAppSettingsRequest)) {
                return super.equals(obj);
            }
            SaveAppSettingsRequest saveAppSettingsRequest = (SaveAppSettingsRequest) obj;
            if (hasAppIdentifier() != saveAppSettingsRequest.hasAppIdentifier()) {
                return false;
            }
            if ((!hasAppIdentifier() || getAppIdentifier().equals(saveAppSettingsRequest.getAppIdentifier())) && hasSettingsValues() == saveAppSettingsRequest.hasSettingsValues()) {
                return (!hasSettingsValues() || getSettingsValues().equals(saveAppSettingsRequest.getSettingsValues())) && getUnknownFields().equals(saveAppSettingsRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.SaveAppSettingsRequestOrBuilder
        public ByteString getAppIdentifier() {
            return this.appIdentifier_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SaveAppSettingsRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.appIdentifier_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBytesSize += CodedOutputStream.computeBytesSize(2, this.settingsValues_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBytesSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.SaveAppSettingsRequestOrBuilder
        public ByteString getSettingsValues() {
            return this.settingsValues_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.SaveAppSettingsRequestOrBuilder
        public boolean hasAppIdentifier() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.SaveAppSettingsRequestOrBuilder
        public boolean hasSettingsValues() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasAppIdentifier()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getAppIdentifier().hashCode();
            }
            if (hasSettingsValues()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSettingsValues().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_SaveAppSettingsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SaveAppSettingsRequest.class, Builder.class);
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
            if (hasAppIdentifier()) {
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
            return new SaveAppSettingsRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.appIdentifier_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBytes(2, this.settingsValues_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SaveAppSettingsRequestOrBuilder {
            private ByteString appIdentifier_;
            private int bitField0_;
            private ByteString settingsValues_;

            private Builder() {
                ByteString byteString = ByteString.EMPTY;
                this.appIdentifier_ = byteString;
                this.settingsValues_ = byteString;
            }

            private void buildPartial0(SaveAppSettingsRequest saveAppSettingsRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    saveAppSettingsRequest.appIdentifier_ = this.appIdentifier_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    saveAppSettingsRequest.settingsValues_ = this.settingsValues_;
                    i14 |= 2;
                }
                saveAppSettingsRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_SaveAppSettingsRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SaveAppSettingsRequest build() {
                SaveAppSettingsRequest saveAppSettingsRequestBuildPartial = buildPartial();
                if (saveAppSettingsRequestBuildPartial.isInitialized()) {
                    return saveAppSettingsRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) saveAppSettingsRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SaveAppSettingsRequest buildPartial() {
                SaveAppSettingsRequest saveAppSettingsRequest = new SaveAppSettingsRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(saveAppSettingsRequest);
                }
                onBuilt();
                return saveAppSettingsRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                ByteString byteString = ByteString.EMPTY;
                this.appIdentifier_ = byteString;
                this.settingsValues_ = byteString;
                return this;
            }

            public Builder clearAppIdentifier() {
                this.bitField0_ &= -2;
                this.appIdentifier_ = SaveAppSettingsRequest.getDefaultInstance().getAppIdentifier();
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

            public Builder clearSettingsValues() {
                this.bitField0_ &= -3;
                this.settingsValues_ = SaveAppSettingsRequest.getDefaultInstance().getSettingsValues();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.SaveAppSettingsRequestOrBuilder
            public ByteString getAppIdentifier() {
                return this.appIdentifier_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_SaveAppSettingsRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.SaveAppSettingsRequestOrBuilder
            public ByteString getSettingsValues() {
                return this.settingsValues_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.SaveAppSettingsRequestOrBuilder
            public boolean hasAppIdentifier() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.SaveAppSettingsRequestOrBuilder
            public boolean hasSettingsValues() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_SaveAppSettingsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SaveAppSettingsRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasAppIdentifier();
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
                                    this.appIdentifier_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.settingsValues_ = codedInputStream.readBytes();
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

            public Builder setAppIdentifier(ByteString byteString) {
                byteString.getClass();
                this.appIdentifier_ = byteString;
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

            public Builder setSettingsValues(ByteString byteString) {
                byteString.getClass();
                this.settingsValues_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SaveAppSettingsRequest getDefaultInstanceForType() {
                return SaveAppSettingsRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                ByteString byteString = ByteString.EMPTY;
                this.appIdentifier_ = byteString;
                this.settingsValues_ = byteString;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SaveAppSettingsRequest) {
                    return mergeFrom((SaveAppSettingsRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SaveAppSettingsRequest saveAppSettingsRequest) {
                if (saveAppSettingsRequest == SaveAppSettingsRequest.getDefaultInstance()) {
                    return this;
                }
                if (saveAppSettingsRequest.hasAppIdentifier()) {
                    setAppIdentifier(saveAppSettingsRequest.getAppIdentifier());
                }
                if (saveAppSettingsRequest.hasSettingsValues()) {
                    setSettingsValues(saveAppSettingsRequest.getSettingsValues());
                }
                mergeUnknownFields(saveAppSettingsRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SaveAppSettingsRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SaveAppSettingsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SaveAppSettingsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SaveAppSettingsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SaveAppSettingsRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SaveAppSettingsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SaveAppSettingsRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ SaveAppSettingsRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SaveAppSettingsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private SaveAppSettingsRequest() {
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.appIdentifier_ = byteString;
            this.settingsValues_ = byteString;
        }

        public static SaveAppSettingsRequest parseFrom(InputStream inputStream) {
            return (SaveAppSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SaveAppSettingsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SaveAppSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SaveAppSettingsRequest parseFrom(CodedInputStream codedInputStream) {
            return (SaveAppSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SaveAppSettingsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SaveAppSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SaveAppSettingsResponse extends GeneratedMessageV3 implements SaveAppSettingsResponseOrBuilder {
        public static final int APP_IDENTIFIER_FIELD_NUMBER = 1;
        private static final SaveAppSettingsResponse DEFAULT_INSTANCE = new SaveAppSettingsResponse();

        @Deprecated
        public static final Parser<SaveAppSettingsResponse> PARSER = new AbstractParser<SaveAppSettingsResponse>() { // from class: com.garmin.proto.generated.GDIConnectIQAppSettingsProto.SaveAppSettingsResponse.1
            @Override // com.google.protobuf.Parser
            public SaveAppSettingsResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SaveAppSettingsResponse.newBuilder();
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
        public static final int RESPONSE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private ByteString appIdentifier_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int response_;

        private SaveAppSettingsResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.appIdentifier_ = ByteString.EMPTY;
            this.response_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SaveAppSettingsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_SaveAppSettingsResponse_descriptor;
        }

        public static Builder newBuilder(SaveAppSettingsResponse saveAppSettingsResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(saveAppSettingsResponse);
        }

        public static SaveAppSettingsResponse parseDelimitedFrom(InputStream inputStream) {
            return (SaveAppSettingsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SaveAppSettingsResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SaveAppSettingsResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SaveAppSettingsResponse)) {
                return super.equals(obj);
            }
            SaveAppSettingsResponse saveAppSettingsResponse = (SaveAppSettingsResponse) obj;
            if (hasAppIdentifier() != saveAppSettingsResponse.hasAppIdentifier()) {
                return false;
            }
            if ((!hasAppIdentifier() || getAppIdentifier().equals(saveAppSettingsResponse.getAppIdentifier())) && hasResponse() == saveAppSettingsResponse.hasResponse()) {
                return (!hasResponse() || this.response_ == saveAppSettingsResponse.response_) && getUnknownFields().equals(saveAppSettingsResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.SaveAppSettingsResponseOrBuilder
        public ByteString getAppIdentifier() {
            return this.appIdentifier_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SaveAppSettingsResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.SaveAppSettingsResponseOrBuilder
        public Response getResponse() {
            Response responseForNumber = Response.forNumber(this.response_);
            return responseForNumber == null ? Response.UNKNOWN_RESPONSE : responseForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.appIdentifier_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBytesSize += CodedOutputStream.computeEnumSize(2, this.response_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBytesSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.SaveAppSettingsResponseOrBuilder
        public boolean hasAppIdentifier() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.SaveAppSettingsResponseOrBuilder
        public boolean hasResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasAppIdentifier()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getAppIdentifier().hashCode();
            }
            if (hasResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.response_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_SaveAppSettingsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SaveAppSettingsResponse.class, Builder.class);
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
            if (hasAppIdentifier()) {
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
            return new SaveAppSettingsResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.appIdentifier_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.response_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SaveAppSettingsResponseOrBuilder {
            private ByteString appIdentifier_;
            private int bitField0_;
            private int response_;

            private Builder() {
                this.appIdentifier_ = ByteString.EMPTY;
                this.response_ = 0;
            }

            private void buildPartial0(SaveAppSettingsResponse saveAppSettingsResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    saveAppSettingsResponse.appIdentifier_ = this.appIdentifier_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    saveAppSettingsResponse.response_ = this.response_;
                    i14 |= 2;
                }
                saveAppSettingsResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_SaveAppSettingsResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SaveAppSettingsResponse build() {
                SaveAppSettingsResponse saveAppSettingsResponseBuildPartial = buildPartial();
                if (saveAppSettingsResponseBuildPartial.isInitialized()) {
                    return saveAppSettingsResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) saveAppSettingsResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SaveAppSettingsResponse buildPartial() {
                SaveAppSettingsResponse saveAppSettingsResponse = new SaveAppSettingsResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(saveAppSettingsResponse);
                }
                onBuilt();
                return saveAppSettingsResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.appIdentifier_ = ByteString.EMPTY;
                this.response_ = 0;
                return this;
            }

            public Builder clearAppIdentifier() {
                this.bitField0_ &= -2;
                this.appIdentifier_ = SaveAppSettingsResponse.getDefaultInstance().getAppIdentifier();
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

            public Builder clearResponse() {
                this.bitField0_ &= -3;
                this.response_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.SaveAppSettingsResponseOrBuilder
            public ByteString getAppIdentifier() {
                return this.appIdentifier_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_SaveAppSettingsResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.SaveAppSettingsResponseOrBuilder
            public Response getResponse() {
                Response responseForNumber = Response.forNumber(this.response_);
                return responseForNumber == null ? Response.UNKNOWN_RESPONSE : responseForNumber;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.SaveAppSettingsResponseOrBuilder
            public boolean hasAppIdentifier() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.SaveAppSettingsResponseOrBuilder
            public boolean hasResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_SaveAppSettingsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SaveAppSettingsResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasAppIdentifier();
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
                                    this.appIdentifier_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (Response.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.response_ = i14;
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

            public Builder setAppIdentifier(ByteString byteString) {
                byteString.getClass();
                this.appIdentifier_ = byteString;
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

            public Builder setResponse(Response response) {
                response.getClass();
                this.bitField0_ |= 2;
                this.response_ = response.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SaveAppSettingsResponse getDefaultInstanceForType() {
                return SaveAppSettingsResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.appIdentifier_ = ByteString.EMPTY;
                this.response_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SaveAppSettingsResponse) {
                    return mergeFrom((SaveAppSettingsResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SaveAppSettingsResponse saveAppSettingsResponse) {
                if (saveAppSettingsResponse == SaveAppSettingsResponse.getDefaultInstance()) {
                    return this;
                }
                if (saveAppSettingsResponse.hasAppIdentifier()) {
                    setAppIdentifier(saveAppSettingsResponse.getAppIdentifier());
                }
                if (saveAppSettingsResponse.hasResponse()) {
                    setResponse(saveAppSettingsResponse.getResponse());
                }
                mergeUnknownFields(saveAppSettingsResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SaveAppSettingsResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SaveAppSettingsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SaveAppSettingsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SaveAppSettingsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SaveAppSettingsResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SaveAppSettingsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SaveAppSettingsResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SaveAppSettingsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ SaveAppSettingsResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SaveAppSettingsResponse parseFrom(InputStream inputStream) {
            return (SaveAppSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private SaveAppSettingsResponse() {
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.appIdentifier_ = byteString;
            this.response_ = 0;
        }

        public static SaveAppSettingsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SaveAppSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SaveAppSettingsResponse parseFrom(CodedInputStream codedInputStream) {
            return (SaveAppSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SaveAppSettingsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SaveAppSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Response implements ProtocolMessageEnum {
            UNKNOWN_RESPONSE(0),
            SUCCESS(1),
            FAILED_TO_SAVE(2);

            public static final int FAILED_TO_SAVE_VALUE = 2;
            public static final int SUCCESS_VALUE = 1;
            public static final int UNKNOWN_RESPONSE_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Response> internalValueMap = new Internal.EnumLiteMap<Response>() { // from class: com.garmin.proto.generated.GDIConnectIQAppSettingsProto.SaveAppSettingsResponse.Response.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Response findValueByNumber(int i14) {
                    return Response.forNumber(i14);
                }
            };
            private static final Response[] VALUES = values();

            Response(int i14) {
                this.value = i14;
            }

            public static Response forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN_RESPONSE;
                }
                if (i14 == 1) {
                    return SUCCESS;
                }
                if (i14 != 2) {
                    return null;
                }
                return FAILED_TO_SAVE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return SaveAppSettingsResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Response> internalGetValueMap() {
                return internalValueMap;
            }

            public static Response valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Response valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class SendAppSettingsRequest extends GeneratedMessageV3 implements SendAppSettingsRequestOrBuilder {
        public static final int APP_IDENTIFIER_FIELD_NUMBER = 1;
        private static final SendAppSettingsRequest DEFAULT_INSTANCE = new SendAppSettingsRequest();

        @Deprecated
        public static final Parser<SendAppSettingsRequest> PARSER = new AbstractParser<SendAppSettingsRequest>() { // from class: com.garmin.proto.generated.GDIConnectIQAppSettingsProto.SendAppSettingsRequest.1
            @Override // com.google.protobuf.Parser
            public SendAppSettingsRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SendAppSettingsRequest.newBuilder();
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
        public static final int SETTINGS_VALUES_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private ByteString appIdentifier_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private ByteString settingsValues_;

        private SendAppSettingsRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            ByteString byteString = ByteString.EMPTY;
            this.appIdentifier_ = byteString;
            this.settingsValues_ = byteString;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SendAppSettingsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_SendAppSettingsRequest_descriptor;
        }

        public static Builder newBuilder(SendAppSettingsRequest sendAppSettingsRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sendAppSettingsRequest);
        }

        public static SendAppSettingsRequest parseDelimitedFrom(InputStream inputStream) {
            return (SendAppSettingsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SendAppSettingsRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SendAppSettingsRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SendAppSettingsRequest)) {
                return super.equals(obj);
            }
            SendAppSettingsRequest sendAppSettingsRequest = (SendAppSettingsRequest) obj;
            if (hasAppIdentifier() != sendAppSettingsRequest.hasAppIdentifier()) {
                return false;
            }
            if ((!hasAppIdentifier() || getAppIdentifier().equals(sendAppSettingsRequest.getAppIdentifier())) && hasSettingsValues() == sendAppSettingsRequest.hasSettingsValues()) {
                return (!hasSettingsValues() || getSettingsValues().equals(sendAppSettingsRequest.getSettingsValues())) && getUnknownFields().equals(sendAppSettingsRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.SendAppSettingsRequestOrBuilder
        public ByteString getAppIdentifier() {
            return this.appIdentifier_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SendAppSettingsRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.appIdentifier_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBytesSize += CodedOutputStream.computeBytesSize(2, this.settingsValues_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBytesSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.SendAppSettingsRequestOrBuilder
        public ByteString getSettingsValues() {
            return this.settingsValues_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.SendAppSettingsRequestOrBuilder
        public boolean hasAppIdentifier() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.SendAppSettingsRequestOrBuilder
        public boolean hasSettingsValues() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasAppIdentifier()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getAppIdentifier().hashCode();
            }
            if (hasSettingsValues()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSettingsValues().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_SendAppSettingsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SendAppSettingsRequest.class, Builder.class);
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
            if (hasAppIdentifier()) {
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
            return new SendAppSettingsRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.appIdentifier_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBytes(2, this.settingsValues_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SendAppSettingsRequestOrBuilder {
            private ByteString appIdentifier_;
            private int bitField0_;
            private ByteString settingsValues_;

            private Builder() {
                ByteString byteString = ByteString.EMPTY;
                this.appIdentifier_ = byteString;
                this.settingsValues_ = byteString;
            }

            private void buildPartial0(SendAppSettingsRequest sendAppSettingsRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    sendAppSettingsRequest.appIdentifier_ = this.appIdentifier_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    sendAppSettingsRequest.settingsValues_ = this.settingsValues_;
                    i14 |= 2;
                }
                sendAppSettingsRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_SendAppSettingsRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SendAppSettingsRequest build() {
                SendAppSettingsRequest sendAppSettingsRequestBuildPartial = buildPartial();
                if (sendAppSettingsRequestBuildPartial.isInitialized()) {
                    return sendAppSettingsRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sendAppSettingsRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SendAppSettingsRequest buildPartial() {
                SendAppSettingsRequest sendAppSettingsRequest = new SendAppSettingsRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sendAppSettingsRequest);
                }
                onBuilt();
                return sendAppSettingsRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                ByteString byteString = ByteString.EMPTY;
                this.appIdentifier_ = byteString;
                this.settingsValues_ = byteString;
                return this;
            }

            public Builder clearAppIdentifier() {
                this.bitField0_ &= -2;
                this.appIdentifier_ = SendAppSettingsRequest.getDefaultInstance().getAppIdentifier();
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

            public Builder clearSettingsValues() {
                this.bitField0_ &= -3;
                this.settingsValues_ = SendAppSettingsRequest.getDefaultInstance().getSettingsValues();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.SendAppSettingsRequestOrBuilder
            public ByteString getAppIdentifier() {
                return this.appIdentifier_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_SendAppSettingsRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.SendAppSettingsRequestOrBuilder
            public ByteString getSettingsValues() {
                return this.settingsValues_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.SendAppSettingsRequestOrBuilder
            public boolean hasAppIdentifier() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.SendAppSettingsRequestOrBuilder
            public boolean hasSettingsValues() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_SendAppSettingsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SendAppSettingsRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasAppIdentifier();
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
                                    this.appIdentifier_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.settingsValues_ = codedInputStream.readBytes();
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

            public Builder setAppIdentifier(ByteString byteString) {
                byteString.getClass();
                this.appIdentifier_ = byteString;
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

            public Builder setSettingsValues(ByteString byteString) {
                byteString.getClass();
                this.settingsValues_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SendAppSettingsRequest getDefaultInstanceForType() {
                return SendAppSettingsRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                ByteString byteString = ByteString.EMPTY;
                this.appIdentifier_ = byteString;
                this.settingsValues_ = byteString;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SendAppSettingsRequest) {
                    return mergeFrom((SendAppSettingsRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SendAppSettingsRequest sendAppSettingsRequest) {
                if (sendAppSettingsRequest == SendAppSettingsRequest.getDefaultInstance()) {
                    return this;
                }
                if (sendAppSettingsRequest.hasAppIdentifier()) {
                    setAppIdentifier(sendAppSettingsRequest.getAppIdentifier());
                }
                if (sendAppSettingsRequest.hasSettingsValues()) {
                    setSettingsValues(sendAppSettingsRequest.getSettingsValues());
                }
                mergeUnknownFields(sendAppSettingsRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SendAppSettingsRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SendAppSettingsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SendAppSettingsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SendAppSettingsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SendAppSettingsRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SendAppSettingsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SendAppSettingsRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ SendAppSettingsRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SendAppSettingsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private SendAppSettingsRequest() {
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.appIdentifier_ = byteString;
            this.settingsValues_ = byteString;
        }

        public static SendAppSettingsRequest parseFrom(InputStream inputStream) {
            return (SendAppSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SendAppSettingsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SendAppSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SendAppSettingsRequest parseFrom(CodedInputStream codedInputStream) {
            return (SendAppSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SendAppSettingsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SendAppSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SendAppSettingsResponse extends GeneratedMessageV3 implements SendAppSettingsResponseOrBuilder {
        private static final SendAppSettingsResponse DEFAULT_INSTANCE = new SendAppSettingsResponse();

        @Deprecated
        public static final Parser<SendAppSettingsResponse> PARSER = new AbstractParser<SendAppSettingsResponse>() { // from class: com.garmin.proto.generated.GDIConnectIQAppSettingsProto.SendAppSettingsResponse.1
            @Override // com.google.protobuf.Parser
            public SendAppSettingsResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SendAppSettingsResponse.newBuilder();
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
        public static final int RESPONSE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int response_;

        private SendAppSettingsResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.response_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SendAppSettingsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_SendAppSettingsResponse_descriptor;
        }

        public static Builder newBuilder(SendAppSettingsResponse sendAppSettingsResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sendAppSettingsResponse);
        }

        public static SendAppSettingsResponse parseDelimitedFrom(InputStream inputStream) {
            return (SendAppSettingsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SendAppSettingsResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SendAppSettingsResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SendAppSettingsResponse)) {
                return super.equals(obj);
            }
            SendAppSettingsResponse sendAppSettingsResponse = (SendAppSettingsResponse) obj;
            if (hasResponse() != sendAppSettingsResponse.hasResponse()) {
                return false;
            }
            return (!hasResponse() || this.response_ == sendAppSettingsResponse.response_) && getUnknownFields().equals(sendAppSettingsResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SendAppSettingsResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.SendAppSettingsResponseOrBuilder
        public Response getResponse() {
            Response responseForNumber = Response.forNumber(this.response_);
            return responseForNumber == null ? Response.UNKNOWN_RESPONSE : responseForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.response_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.SendAppSettingsResponseOrBuilder
        public boolean hasResponse() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasResponse()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.response_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_SendAppSettingsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SendAppSettingsResponse.class, Builder.class);
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
            return new SendAppSettingsResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.response_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SendAppSettingsResponseOrBuilder {
            private int bitField0_;
            private int response_;

            private Builder() {
                this.response_ = 0;
            }

            private void buildPartial0(SendAppSettingsResponse sendAppSettingsResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    sendAppSettingsResponse.response_ = this.response_;
                } else {
                    i14 = 0;
                }
                sendAppSettingsResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_SendAppSettingsResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SendAppSettingsResponse build() {
                SendAppSettingsResponse sendAppSettingsResponseBuildPartial = buildPartial();
                if (sendAppSettingsResponseBuildPartial.isInitialized()) {
                    return sendAppSettingsResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sendAppSettingsResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SendAppSettingsResponse buildPartial() {
                SendAppSettingsResponse sendAppSettingsResponse = new SendAppSettingsResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sendAppSettingsResponse);
                }
                onBuilt();
                return sendAppSettingsResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.response_ = 0;
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

            public Builder clearResponse() {
                this.bitField0_ &= -2;
                this.response_ = 0;
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
                return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_SendAppSettingsResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.SendAppSettingsResponseOrBuilder
            public Response getResponse() {
                Response responseForNumber = Response.forNumber(this.response_);
                return responseForNumber == null ? Response.UNKNOWN_RESPONSE : responseForNumber;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.SendAppSettingsResponseOrBuilder
            public boolean hasResponse() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_SendAppSettingsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SendAppSettingsResponse.class, Builder.class);
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
                                    if (Response.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.response_ = i14;
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

            public Builder setResponse(Response response) {
                response.getClass();
                this.bitField0_ |= 1;
                this.response_ = response.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SendAppSettingsResponse getDefaultInstanceForType() {
                return SendAppSettingsResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.response_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SendAppSettingsResponse) {
                    return mergeFrom((SendAppSettingsResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SendAppSettingsResponse sendAppSettingsResponse) {
                if (sendAppSettingsResponse == SendAppSettingsResponse.getDefaultInstance()) {
                    return this;
                }
                if (sendAppSettingsResponse.hasResponse()) {
                    setResponse(sendAppSettingsResponse.getResponse());
                }
                mergeUnknownFields(sendAppSettingsResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SendAppSettingsResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SendAppSettingsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SendAppSettingsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SendAppSettingsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ SendAppSettingsResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SendAppSettingsResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SendAppSettingsResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.response_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SendAppSettingsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SendAppSettingsResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SendAppSettingsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SendAppSettingsResponse parseFrom(InputStream inputStream) {
            return (SendAppSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SendAppSettingsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SendAppSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SendAppSettingsResponse parseFrom(CodedInputStream codedInputStream) {
            return (SendAppSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SendAppSettingsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SendAppSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Response implements ProtocolMessageEnum {
            UNKNOWN_RESPONSE(0),
            SUCCESS(1);

            public static final int SUCCESS_VALUE = 1;
            public static final int UNKNOWN_RESPONSE_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Response> internalValueMap = new Internal.EnumLiteMap<Response>() { // from class: com.garmin.proto.generated.GDIConnectIQAppSettingsProto.SendAppSettingsResponse.Response.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Response findValueByNumber(int i14) {
                    return Response.forNumber(i14);
                }
            };
            private static final Response[] VALUES = values();

            Response(int i14) {
                this.value = i14;
            }

            public static Response forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN_RESPONSE;
                }
                if (i14 != 1) {
                    return null;
                }
                return SUCCESS;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return SendAppSettingsResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Response> internalGetValueMap() {
                return internalValueMap;
            }

            public static Response valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Response valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class VerifiedAppSettingsNotification extends GeneratedMessageV3 implements VerifiedAppSettingsNotificationOrBuilder {
        public static final int ERROR_FIELD_NUMBER = 4;
        public static final int KEY_FIELD_NUMBER = 2;
        public static final int RESULT_FIELD_NUMBER = 3;
        public static final int STORE_UUID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString error_;
        private ByteString key_;
        private byte memoizedIsInitialized;
        private int result_;
        private ByteString storeUuid_;
        private static final VerifiedAppSettingsNotification DEFAULT_INSTANCE = new VerifiedAppSettingsNotification();

        @Deprecated
        public static final Parser<VerifiedAppSettingsNotification> PARSER = new AbstractParser<VerifiedAppSettingsNotification>() { // from class: com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifiedAppSettingsNotification.1
            @Override // com.google.protobuf.Parser
            public VerifiedAppSettingsNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = VerifiedAppSettingsNotification.newBuilder();
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

        private VerifiedAppSettingsNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            ByteString byteString = ByteString.EMPTY;
            this.storeUuid_ = byteString;
            this.key_ = byteString;
            this.result_ = 0;
            this.error_ = byteString;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static VerifiedAppSettingsNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_VerifiedAppSettingsNotification_descriptor;
        }

        public static Builder newBuilder(VerifiedAppSettingsNotification verifiedAppSettingsNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(verifiedAppSettingsNotification);
        }

        public static VerifiedAppSettingsNotification parseDelimitedFrom(InputStream inputStream) {
            return (VerifiedAppSettingsNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static VerifiedAppSettingsNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<VerifiedAppSettingsNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof VerifiedAppSettingsNotification)) {
                return super.equals(obj);
            }
            VerifiedAppSettingsNotification verifiedAppSettingsNotification = (VerifiedAppSettingsNotification) obj;
            if (hasStoreUuid() != verifiedAppSettingsNotification.hasStoreUuid()) {
                return false;
            }
            if ((hasStoreUuid() && !getStoreUuid().equals(verifiedAppSettingsNotification.getStoreUuid())) || hasKey() != verifiedAppSettingsNotification.hasKey()) {
                return false;
            }
            if ((hasKey() && !getKey().equals(verifiedAppSettingsNotification.getKey())) || hasResult() != verifiedAppSettingsNotification.hasResult()) {
                return false;
            }
            if ((!hasResult() || this.result_ == verifiedAppSettingsNotification.result_) && hasError() == verifiedAppSettingsNotification.hasError()) {
                return (!hasError() || getError().equals(verifiedAppSettingsNotification.getError())) && getUnknownFields().equals(verifiedAppSettingsNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifiedAppSettingsNotificationOrBuilder
        public ByteString getError() {
            return this.error_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifiedAppSettingsNotificationOrBuilder
        public ByteString getKey() {
            return this.key_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<VerifiedAppSettingsNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifiedAppSettingsNotificationOrBuilder
        public Result getResult() {
            Result resultForNumber = Result.forNumber(this.result_);
            return resultForNumber == null ? Result.VERIFIED : resultForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.storeUuid_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBytesSize += CodedOutputStream.computeBytesSize(2, this.key_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeBytesSize += CodedOutputStream.computeEnumSize(3, this.result_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeBytesSize += CodedOutputStream.computeBytesSize(4, this.error_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBytesSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifiedAppSettingsNotificationOrBuilder
        public ByteString getStoreUuid() {
            return this.storeUuid_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifiedAppSettingsNotificationOrBuilder
        public boolean hasError() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifiedAppSettingsNotificationOrBuilder
        public boolean hasKey() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifiedAppSettingsNotificationOrBuilder
        public boolean hasResult() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifiedAppSettingsNotificationOrBuilder
        public boolean hasStoreUuid() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasStoreUuid()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getStoreUuid().hashCode();
            }
            if (hasKey()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getKey().hashCode();
            }
            if (hasResult()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + this.result_;
            }
            if (hasError()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getError().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_VerifiedAppSettingsNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(VerifiedAppSettingsNotification.class, Builder.class);
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
            if (hasStoreUuid()) {
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
            return new VerifiedAppSettingsNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.storeUuid_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBytes(2, this.key_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(3, this.result_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeBytes(4, this.error_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements VerifiedAppSettingsNotificationOrBuilder {
            private int bitField0_;
            private ByteString error_;
            private ByteString key_;
            private int result_;
            private ByteString storeUuid_;

            private Builder() {
                ByteString byteString = ByteString.EMPTY;
                this.storeUuid_ = byteString;
                this.key_ = byteString;
                this.result_ = 0;
                this.error_ = byteString;
            }

            private void buildPartial0(VerifiedAppSettingsNotification verifiedAppSettingsNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    verifiedAppSettingsNotification.storeUuid_ = this.storeUuid_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    verifiedAppSettingsNotification.key_ = this.key_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    verifiedAppSettingsNotification.result_ = this.result_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    verifiedAppSettingsNotification.error_ = this.error_;
                    i14 |= 8;
                }
                verifiedAppSettingsNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_VerifiedAppSettingsNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public VerifiedAppSettingsNotification build() {
                VerifiedAppSettingsNotification verifiedAppSettingsNotificationBuildPartial = buildPartial();
                if (verifiedAppSettingsNotificationBuildPartial.isInitialized()) {
                    return verifiedAppSettingsNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) verifiedAppSettingsNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public VerifiedAppSettingsNotification buildPartial() {
                VerifiedAppSettingsNotification verifiedAppSettingsNotification = new VerifiedAppSettingsNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(verifiedAppSettingsNotification);
                }
                onBuilt();
                return verifiedAppSettingsNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                ByteString byteString = ByteString.EMPTY;
                this.storeUuid_ = byteString;
                this.key_ = byteString;
                this.result_ = 0;
                this.error_ = byteString;
                return this;
            }

            public Builder clearError() {
                this.bitField0_ &= -9;
                this.error_ = VerifiedAppSettingsNotification.getDefaultInstance().getError();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearKey() {
                this.bitField0_ &= -3;
                this.key_ = VerifiedAppSettingsNotification.getDefaultInstance().getKey();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearResult() {
                this.bitField0_ &= -5;
                this.result_ = 0;
                onChanged();
                return this;
            }

            public Builder clearStoreUuid() {
                this.bitField0_ &= -2;
                this.storeUuid_ = VerifiedAppSettingsNotification.getDefaultInstance().getStoreUuid();
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
                return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_VerifiedAppSettingsNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifiedAppSettingsNotificationOrBuilder
            public ByteString getError() {
                return this.error_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifiedAppSettingsNotificationOrBuilder
            public ByteString getKey() {
                return this.key_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifiedAppSettingsNotificationOrBuilder
            public Result getResult() {
                Result resultForNumber = Result.forNumber(this.result_);
                return resultForNumber == null ? Result.VERIFIED : resultForNumber;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifiedAppSettingsNotificationOrBuilder
            public ByteString getStoreUuid() {
                return this.storeUuid_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifiedAppSettingsNotificationOrBuilder
            public boolean hasError() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifiedAppSettingsNotificationOrBuilder
            public boolean hasKey() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifiedAppSettingsNotificationOrBuilder
            public boolean hasResult() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifiedAppSettingsNotificationOrBuilder
            public boolean hasStoreUuid() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_VerifiedAppSettingsNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(VerifiedAppSettingsNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasStoreUuid();
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
                                    this.storeUuid_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.key_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    int i14 = codedInputStream.readEnum();
                                    if (Result.forNumber(i14) == null) {
                                        mergeUnknownVarintField(3, i14);
                                    } else {
                                        this.result_ = i14;
                                        this.bitField0_ |= 4;
                                    }
                                } else if (tag == 34) {
                                    this.error_ = codedInputStream.readBytes();
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

            public Builder setError(ByteString byteString) {
                byteString.getClass();
                this.error_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setKey(ByteString byteString) {
                byteString.getClass();
                this.key_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setResult(Result result) {
                result.getClass();
                this.bitField0_ |= 4;
                this.result_ = result.getNumber();
                onChanged();
                return this;
            }

            public Builder setStoreUuid(ByteString byteString) {
                byteString.getClass();
                this.storeUuid_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public VerifiedAppSettingsNotification getDefaultInstanceForType() {
                return VerifiedAppSettingsNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                ByteString byteString = ByteString.EMPTY;
                this.storeUuid_ = byteString;
                this.key_ = byteString;
                this.result_ = 0;
                this.error_ = byteString;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof VerifiedAppSettingsNotification) {
                    return mergeFrom((VerifiedAppSettingsNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(VerifiedAppSettingsNotification verifiedAppSettingsNotification) {
                if (verifiedAppSettingsNotification == VerifiedAppSettingsNotification.getDefaultInstance()) {
                    return this;
                }
                if (verifiedAppSettingsNotification.hasStoreUuid()) {
                    setStoreUuid(verifiedAppSettingsNotification.getStoreUuid());
                }
                if (verifiedAppSettingsNotification.hasKey()) {
                    setKey(verifiedAppSettingsNotification.getKey());
                }
                if (verifiedAppSettingsNotification.hasResult()) {
                    setResult(verifiedAppSettingsNotification.getResult());
                }
                if (verifiedAppSettingsNotification.hasError()) {
                    setError(verifiedAppSettingsNotification.getError());
                }
                mergeUnknownFields(verifiedAppSettingsNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public VerifiedAppSettingsNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static VerifiedAppSettingsNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VerifiedAppSettingsNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static VerifiedAppSettingsNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static VerifiedAppSettingsNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VerifiedAppSettingsNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static VerifiedAppSettingsNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static VerifiedAppSettingsNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static VerifiedAppSettingsNotification parseFrom(InputStream inputStream) {
            return (VerifiedAppSettingsNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static VerifiedAppSettingsNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VerifiedAppSettingsNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ VerifiedAppSettingsNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static VerifiedAppSettingsNotification parseFrom(CodedInputStream codedInputStream) {
            return (VerifiedAppSettingsNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        private VerifiedAppSettingsNotification() {
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.storeUuid_ = byteString;
            this.key_ = byteString;
            this.result_ = 0;
            this.error_ = byteString;
        }

        public static VerifiedAppSettingsNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VerifiedAppSettingsNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Result implements ProtocolMessageEnum {
            VERIFIED(0),
            UNKNOWN_ERROR(1),
            APP_ERROR(2),
            VERIFICIATION_FAILED(3);

            public static final int APP_ERROR_VALUE = 2;
            public static final int UNKNOWN_ERROR_VALUE = 1;
            public static final int VERIFICIATION_FAILED_VALUE = 3;
            public static final int VERIFIED_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Result> internalValueMap = new Internal.EnumLiteMap<Result>() { // from class: com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifiedAppSettingsNotification.Result.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Result findValueByNumber(int i14) {
                    return Result.forNumber(i14);
                }
            };
            private static final Result[] VALUES = values();

            Result(int i14) {
                this.value = i14;
            }

            public static Result forNumber(int i14) {
                if (i14 == 0) {
                    return VERIFIED;
                }
                if (i14 == 1) {
                    return UNKNOWN_ERROR;
                }
                if (i14 == 2) {
                    return APP_ERROR;
                }
                if (i14 != 3) {
                    return null;
                }
                return VERIFICIATION_FAILED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return VerifiedAppSettingsNotification.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Result> internalGetValueMap() {
                return internalValueMap;
            }

            public static Result valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Result valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class VerifyAppSettingsRequest extends GeneratedMessageV3 implements VerifyAppSettingsRequestOrBuilder {
        public static final int KEY_FIELD_NUMBER = 2;
        public static final int STORE_UUID_FIELD_NUMBER = 1;
        public static final int VALUE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString key_;
        private byte memoizedIsInitialized;
        private ByteString storeUuid_;
        private ByteString value_;
        private static final VerifyAppSettingsRequest DEFAULT_INSTANCE = new VerifyAppSettingsRequest();

        @Deprecated
        public static final Parser<VerifyAppSettingsRequest> PARSER = new AbstractParser<VerifyAppSettingsRequest>() { // from class: com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifyAppSettingsRequest.1
            @Override // com.google.protobuf.Parser
            public VerifyAppSettingsRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = VerifyAppSettingsRequest.newBuilder();
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

        private VerifyAppSettingsRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            ByteString byteString = ByteString.EMPTY;
            this.storeUuid_ = byteString;
            this.key_ = byteString;
            this.value_ = byteString;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static VerifyAppSettingsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_VerifyAppSettingsRequest_descriptor;
        }

        public static Builder newBuilder(VerifyAppSettingsRequest verifyAppSettingsRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(verifyAppSettingsRequest);
        }

        public static VerifyAppSettingsRequest parseDelimitedFrom(InputStream inputStream) {
            return (VerifyAppSettingsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static VerifyAppSettingsRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<VerifyAppSettingsRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof VerifyAppSettingsRequest)) {
                return super.equals(obj);
            }
            VerifyAppSettingsRequest verifyAppSettingsRequest = (VerifyAppSettingsRequest) obj;
            if (hasStoreUuid() != verifyAppSettingsRequest.hasStoreUuid()) {
                return false;
            }
            if ((hasStoreUuid() && !getStoreUuid().equals(verifyAppSettingsRequest.getStoreUuid())) || hasKey() != verifyAppSettingsRequest.hasKey()) {
                return false;
            }
            if ((!hasKey() || getKey().equals(verifyAppSettingsRequest.getKey())) && hasValue() == verifyAppSettingsRequest.hasValue()) {
                return (!hasValue() || getValue().equals(verifyAppSettingsRequest.getValue())) && getUnknownFields().equals(verifyAppSettingsRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifyAppSettingsRequestOrBuilder
        public ByteString getKey() {
            return this.key_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<VerifyAppSettingsRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.storeUuid_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBytesSize += CodedOutputStream.computeBytesSize(2, this.key_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeBytesSize += CodedOutputStream.computeBytesSize(3, this.value_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBytesSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifyAppSettingsRequestOrBuilder
        public ByteString getStoreUuid() {
            return this.storeUuid_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifyAppSettingsRequestOrBuilder
        public ByteString getValue() {
            return this.value_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifyAppSettingsRequestOrBuilder
        public boolean hasKey() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifyAppSettingsRequestOrBuilder
        public boolean hasStoreUuid() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifyAppSettingsRequestOrBuilder
        public boolean hasValue() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasStoreUuid()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getStoreUuid().hashCode();
            }
            if (hasKey()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getKey().hashCode();
            }
            if (hasValue()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getValue().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_VerifyAppSettingsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(VerifyAppSettingsRequest.class, Builder.class);
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
            if (!hasStoreUuid()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasKey()) {
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
            return new VerifyAppSettingsRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.storeUuid_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBytes(2, this.key_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBytes(3, this.value_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements VerifyAppSettingsRequestOrBuilder {
            private int bitField0_;
            private ByteString key_;
            private ByteString storeUuid_;
            private ByteString value_;

            private Builder() {
                ByteString byteString = ByteString.EMPTY;
                this.storeUuid_ = byteString;
                this.key_ = byteString;
                this.value_ = byteString;
            }

            private void buildPartial0(VerifyAppSettingsRequest verifyAppSettingsRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    verifyAppSettingsRequest.storeUuid_ = this.storeUuid_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    verifyAppSettingsRequest.key_ = this.key_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    verifyAppSettingsRequest.value_ = this.value_;
                    i14 |= 4;
                }
                verifyAppSettingsRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_VerifyAppSettingsRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public VerifyAppSettingsRequest build() {
                VerifyAppSettingsRequest verifyAppSettingsRequestBuildPartial = buildPartial();
                if (verifyAppSettingsRequestBuildPartial.isInitialized()) {
                    return verifyAppSettingsRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) verifyAppSettingsRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public VerifyAppSettingsRequest buildPartial() {
                VerifyAppSettingsRequest verifyAppSettingsRequest = new VerifyAppSettingsRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(verifyAppSettingsRequest);
                }
                onBuilt();
                return verifyAppSettingsRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                ByteString byteString = ByteString.EMPTY;
                this.storeUuid_ = byteString;
                this.key_ = byteString;
                this.value_ = byteString;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearKey() {
                this.bitField0_ &= -3;
                this.key_ = VerifyAppSettingsRequest.getDefaultInstance().getKey();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearStoreUuid() {
                this.bitField0_ &= -2;
                this.storeUuid_ = VerifyAppSettingsRequest.getDefaultInstance().getStoreUuid();
                onChanged();
                return this;
            }

            public Builder clearValue() {
                this.bitField0_ &= -5;
                this.value_ = VerifyAppSettingsRequest.getDefaultInstance().getValue();
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
                return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_VerifyAppSettingsRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifyAppSettingsRequestOrBuilder
            public ByteString getKey() {
                return this.key_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifyAppSettingsRequestOrBuilder
            public ByteString getStoreUuid() {
                return this.storeUuid_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifyAppSettingsRequestOrBuilder
            public ByteString getValue() {
                return this.value_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifyAppSettingsRequestOrBuilder
            public boolean hasKey() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifyAppSettingsRequestOrBuilder
            public boolean hasStoreUuid() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifyAppSettingsRequestOrBuilder
            public boolean hasValue() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_VerifyAppSettingsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(VerifyAppSettingsRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasStoreUuid() && hasKey();
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
                                    this.storeUuid_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.key_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.value_ = codedInputStream.readBytes();
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

            public Builder setKey(ByteString byteString) {
                byteString.getClass();
                this.key_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStoreUuid(ByteString byteString) {
                byteString.getClass();
                this.storeUuid_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setValue(ByteString byteString) {
                byteString.getClass();
                this.value_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public VerifyAppSettingsRequest getDefaultInstanceForType() {
                return VerifyAppSettingsRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                ByteString byteString = ByteString.EMPTY;
                this.storeUuid_ = byteString;
                this.key_ = byteString;
                this.value_ = byteString;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof VerifyAppSettingsRequest) {
                    return mergeFrom((VerifyAppSettingsRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(VerifyAppSettingsRequest verifyAppSettingsRequest) {
                if (verifyAppSettingsRequest == VerifyAppSettingsRequest.getDefaultInstance()) {
                    return this;
                }
                if (verifyAppSettingsRequest.hasStoreUuid()) {
                    setStoreUuid(verifyAppSettingsRequest.getStoreUuid());
                }
                if (verifyAppSettingsRequest.hasKey()) {
                    setKey(verifyAppSettingsRequest.getKey());
                }
                if (verifyAppSettingsRequest.hasValue()) {
                    setValue(verifyAppSettingsRequest.getValue());
                }
                mergeUnknownFields(verifyAppSettingsRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public VerifyAppSettingsRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static VerifyAppSettingsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VerifyAppSettingsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static VerifyAppSettingsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static VerifyAppSettingsRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VerifyAppSettingsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static VerifyAppSettingsRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static VerifyAppSettingsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static VerifyAppSettingsRequest parseFrom(InputStream inputStream) {
            return (VerifyAppSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ VerifyAppSettingsRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private VerifyAppSettingsRequest() {
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.storeUuid_ = byteString;
            this.key_ = byteString;
            this.value_ = byteString;
        }

        public static VerifyAppSettingsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VerifyAppSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static VerifyAppSettingsRequest parseFrom(CodedInputStream codedInputStream) {
            return (VerifyAppSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static VerifyAppSettingsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VerifyAppSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class VerifyAppSettingsResponse extends GeneratedMessageV3 implements VerifyAppSettingsResponseOrBuilder {
        private static final VerifyAppSettingsResponse DEFAULT_INSTANCE = new VerifyAppSettingsResponse();

        @Deprecated
        public static final Parser<VerifyAppSettingsResponse> PARSER = new AbstractParser<VerifyAppSettingsResponse>() { // from class: com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifyAppSettingsResponse.1
            @Override // com.google.protobuf.Parser
            public VerifyAppSettingsResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = VerifyAppSettingsResponse.newBuilder();
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
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int STORE_UUID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int status_;
        private ByteString storeUuid_;

        private VerifyAppSettingsResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.storeUuid_ = ByteString.EMPTY;
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static VerifyAppSettingsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_VerifyAppSettingsResponse_descriptor;
        }

        public static Builder newBuilder(VerifyAppSettingsResponse verifyAppSettingsResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(verifyAppSettingsResponse);
        }

        public static VerifyAppSettingsResponse parseDelimitedFrom(InputStream inputStream) {
            return (VerifyAppSettingsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static VerifyAppSettingsResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<VerifyAppSettingsResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof VerifyAppSettingsResponse)) {
                return super.equals(obj);
            }
            VerifyAppSettingsResponse verifyAppSettingsResponse = (VerifyAppSettingsResponse) obj;
            if (hasStoreUuid() != verifyAppSettingsResponse.hasStoreUuid()) {
                return false;
            }
            if ((!hasStoreUuid() || getStoreUuid().equals(verifyAppSettingsResponse.getStoreUuid())) && hasStatus() == verifyAppSettingsResponse.hasStatus()) {
                return (!hasStatus() || this.status_ == verifyAppSettingsResponse.status_) && getUnknownFields().equals(verifyAppSettingsResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<VerifyAppSettingsResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.storeUuid_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBytesSize += CodedOutputStream.computeEnumSize(2, this.status_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBytesSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifyAppSettingsResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.UNKNOWN : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifyAppSettingsResponseOrBuilder
        public ByteString getStoreUuid() {
            return this.storeUuid_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifyAppSettingsResponseOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifyAppSettingsResponseOrBuilder
        public boolean hasStoreUuid() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasStoreUuid()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getStoreUuid().hashCode();
            }
            if (hasStatus()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.status_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_VerifyAppSettingsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(VerifyAppSettingsResponse.class, Builder.class);
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
            if (hasStoreUuid()) {
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
            return new VerifyAppSettingsResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.storeUuid_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.status_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements VerifyAppSettingsResponseOrBuilder {
            private int bitField0_;
            private int status_;
            private ByteString storeUuid_;

            private Builder() {
                this.storeUuid_ = ByteString.EMPTY;
                this.status_ = 0;
            }

            private void buildPartial0(VerifyAppSettingsResponse verifyAppSettingsResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    verifyAppSettingsResponse.storeUuid_ = this.storeUuid_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    verifyAppSettingsResponse.status_ = this.status_;
                    i14 |= 2;
                }
                verifyAppSettingsResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_VerifyAppSettingsResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public VerifyAppSettingsResponse build() {
                VerifyAppSettingsResponse verifyAppSettingsResponseBuildPartial = buildPartial();
                if (verifyAppSettingsResponseBuildPartial.isInitialized()) {
                    return verifyAppSettingsResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) verifyAppSettingsResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public VerifyAppSettingsResponse buildPartial() {
                VerifyAppSettingsResponse verifyAppSettingsResponse = new VerifyAppSettingsResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(verifyAppSettingsResponse);
                }
                onBuilt();
                return verifyAppSettingsResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.storeUuid_ = ByteString.EMPTY;
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
                this.bitField0_ &= -3;
                this.status_ = 0;
                onChanged();
                return this;
            }

            public Builder clearStoreUuid() {
                this.bitField0_ &= -2;
                this.storeUuid_ = VerifyAppSettingsResponse.getDefaultInstance().getStoreUuid();
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
                return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_VerifyAppSettingsResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifyAppSettingsResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.UNKNOWN : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifyAppSettingsResponseOrBuilder
            public ByteString getStoreUuid() {
                return this.storeUuid_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifyAppSettingsResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifyAppSettingsResponseOrBuilder
            public boolean hasStoreUuid() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQAppSettingsProto.internal_static_GDI_Proto_ConnectIQAppSettings_VerifyAppSettingsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(VerifyAppSettingsResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasStoreUuid();
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
                                    this.storeUuid_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (ResponseStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.status_ = i14;
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

            public Builder setStatus(ResponseStatus responseStatus) {
                responseStatus.getClass();
                this.bitField0_ |= 2;
                this.status_ = responseStatus.getNumber();
                onChanged();
                return this;
            }

            public Builder setStoreUuid(ByteString byteString) {
                byteString.getClass();
                this.storeUuid_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public VerifyAppSettingsResponse getDefaultInstanceForType() {
                return VerifyAppSettingsResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.storeUuid_ = ByteString.EMPTY;
                this.status_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof VerifyAppSettingsResponse) {
                    return mergeFrom((VerifyAppSettingsResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(VerifyAppSettingsResponse verifyAppSettingsResponse) {
                if (verifyAppSettingsResponse == VerifyAppSettingsResponse.getDefaultInstance()) {
                    return this;
                }
                if (verifyAppSettingsResponse.hasStoreUuid()) {
                    setStoreUuid(verifyAppSettingsResponse.getStoreUuid());
                }
                if (verifyAppSettingsResponse.hasStatus()) {
                    setStatus(verifyAppSettingsResponse.getStatus());
                }
                mergeUnknownFields(verifyAppSettingsResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public VerifyAppSettingsResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static VerifyAppSettingsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VerifyAppSettingsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static VerifyAppSettingsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static VerifyAppSettingsResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static VerifyAppSettingsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static VerifyAppSettingsResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static VerifyAppSettingsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ VerifyAppSettingsResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static VerifyAppSettingsResponse parseFrom(InputStream inputStream) {
            return (VerifyAppSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private VerifyAppSettingsResponse() {
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.storeUuid_ = byteString;
            this.status_ = 0;
        }

        public static VerifyAppSettingsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VerifyAppSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static VerifyAppSettingsResponse parseFrom(CodedInputStream codedInputStream) {
            return (VerifyAppSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static VerifyAppSettingsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (VerifyAppSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            UNKNOWN(0),
            OK(1),
            APP_NOT_INSTALLED(2),
            APP_CANNOT_RUN(3);

            public static final int APP_CANNOT_RUN_VALUE = 3;
            public static final int APP_NOT_INSTALLED_VALUE = 2;
            public static final int OK_VALUE = 1;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDIConnectIQAppSettingsProto.VerifyAppSettingsResponse.ResponseStatus.1
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
                    return UNKNOWN;
                }
                if (i14 == 1) {
                    return OK;
                }
                if (i14 == 2) {
                    return APP_NOT_INSTALLED;
                }
                if (i14 != 3) {
                    return null;
                }
                return APP_CANNOT_RUN;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return VerifyAppSettingsResponse.getDescriptor().getEnumTypes().get(0);
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
}
