package com.garmin.proto.generated;

import com.garmin.android.apps.connectmobile.f3;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes5.dex */
public final class GDIKidDevice {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0012GDIKidDevice.proto\u0012\u0013GDI.Proto.KidDevice\u001a\u0014GDICredentials.proto\"í\u0004\n\u0010KidDeviceService\u0012H\n\u0010it_oauth_request\u0018\u0001 \u0001(\u000b2..GDI.Proto.KidDevice.ITOAuthCredentialsRequest\u0012J\n\u0011it_oauth_response\u0018\u0002 \u0001(\u000b2/.GDI.Proto.KidDevice.ITOAuthCredentialsResponse\u0012K\n\u0017kid_credentials_request\u0018\u0005 \u0001(\u000b2*.GDI.Proto.KidDevice.KidCredentialsRequest\u0012M\n\u0018kid_credentials_response\u0018\u0006 \u0001(\u000b2+.GDI.Proto.KidDevice.KidCredentialsResponse\u0012M\n\u0012user_timer_details\u0018\u0010 \u0001(\u000b21.GDI.Proto.KidDevice.UserTimerDetailsNotification\u0012o\n*initial_setup_items_completed_notification\u0018\u0011 \u0001(\u000b2;.GDI.Proto.KidDevice.InitialSetupItemsCompletedNotification\u0012g\n&initial_setup_items_begin_notification\u0018\u0012 \u0001(\u000b27.GDI.Proto.KidDevice.InitialSetupItemsBeginNotification\"®\u0001\n\u0011OAuth2Credentials\u0012\u0014\n\faccess_token\u0018\u0001 \u0002(\t\u0012\u0012\n\ntoken_type\u0018\u0002 \u0002(\t\u0012\u0015\n\rrefresh_token\u0018\u0003 \u0002(\t\u0012\u0012\n\nexpires_in\u0018\u0004 \u0002(\r\u0012\r\n\u0005scope\u0018\u0005 \u0002(\t\u0012 \n\u0018refresh_token_expires_in\u0018\u0006 \u0002(\t\u0012\u0013\n\u000bcustomer_id\u0018\u0007 \u0002(\t\"\u001b\n\u0019ITOAuthCredentialsRequest\"\u0018\n\u0016KidCredentialsResponse\"È\u0003\n\u001cUserTimerDetailsNotification\u0012\u0019\n\u0011current_timestamp\u0018\u0001 \u0001(\r\u0012\u001e\n\u0016timer_duration_seconds\u0018\u0002 \u0001(\r\u0012S\n\ftimer_action\u0018\u0003 \u0001(\u000e2=.GDI.Proto.KidDevice.UserTimerDetailsNotification.TimerAction\u0012O\n\ntimer_type\u0018\u0004 \u0001(\u000e2;.GDI.Proto.KidDevice.UserTimerDetailsNotification.TimerType\"l\n\tTimerType\u0012\u000e\n\nTOOTHBRUSH\u0010\u0000\u0012\f\n\bPRACTICE\u0010\u0001\u0012\u000e\n\nSCREENTIME\u0010\u0002\u0012\n\n\u0006EATING\u0010\u0003\u0012\n\n\u0006PENCIL\u0010\u0004\u0012\f\n\bTOYTRAIN\u0010\u0005\u0012\u000b\n\u0007GENERIC\u0010\u0006\"Y\n\u000bTimerAction\u0012\u000b\n\u0007STARTED\u0010\u0000\u0012\u000b\n\u0007STOPPED\u0010\u0001\u0012\n\n\u0006PAUSED\u0010\u0002\u0012\u000b\n\u0007RESUMED\u0010\u0003\u0012\t\n\u0005RESET\u0010\u0004\u0012\f\n\bCANCELED\u0010\u0005\"è\u0001\n&InitialSetupItemsCompletedNotification\u0012?\n\u0010successful_items\u0018\u0001 \u0003(\u000e2%.GDI.Proto.KidDevice.InitialSetupItem\u0012;\n\ffailed_items\u0018\u0002 \u0003(\u000e2%.GDI.Proto.KidDevice.InitialSetupItem\u0012@\n\u0011unsupported_items\u0018\u0003 \u0003(\u000e2%.GDI.Proto.KidDevice.InitialSetupItem\"\u0091\u0001\n\u001aITOAuthCredentialsResponse\u0012;\n\u000bcredentials\u0018\u0001 \u0001(\u000b2&.GDI.Proto.KidDevice.OAuth2Credentials\u00126\n\fgcs_location\u0018\u0002 \u0001(\u000e2 .GDI.Proto.KidDevice.GCSLocation\"£\u0002\n\u0015KidCredentialsRequest\u0012F\n\u0016it_oauth_2_credentials\u0018\u0001 \u0001(\u000b2&.GDI.Proto.KidDevice.OAuth2Credentials\u00126\n\fgcs_location\u0018\u0002 \u0001(\u000e2 .GDI.Proto.KidDevice.GCSLocation\u0012J\n\u0016di_oauth_2_credentials\u0018\u0004 \u0001(\u000b2*.GDI.Proto.Credentials.DIOAuth2Credentials\u0012>\n\u000fsip_credentials\u0018\u0005 \u0001(\u000b2%.GDI.Proto.Credentials.SIPCredentials\"e\n\"InitialSetupItemsBeginNotification\u0012?\n\u0010items_to_request\u0018\u0001 \u0003(\u000e2%.GDI.Proto.KidDevice.InitialSetupItem*=\n\u000bGCSLocation\u0012\u000e\n\nPRODUCTION\u0010\u0000\u0012\t\n\u0005CHINA\u0010\u0001\u0012\b\n\u0004TEST\u0010\u0002\u0012\t\n\u0005STAGE\u0010\u0003*f\n\u0010InitialSetupItem\u0012\f\n\bCONTACTS\u0010\u0000\u0012\r\n\tGEOFENCES\u0010\u0001\u0012\u0018\n\u0014PRESET_TEXT_MESSAGES\u0010\u0002\u0012\n\n\u0006CHORES\u0010\u0003\u0012\u000f\n\u000bLEADERBOARD\u0010\u0004B,\n\u001acom.garmin.proto.generatedB\fGDIKidDeviceH\u0003"}, new Descriptors.FileDescriptor[]{GDICredentials.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_KidDevice_ITOAuthCredentialsRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_KidDevice_ITOAuthCredentialsRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_KidDevice_ITOAuthCredentialsResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_KidDevice_ITOAuthCredentialsResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_KidDevice_InitialSetupItemsBeginNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_KidDevice_InitialSetupItemsBeginNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_KidDevice_InitialSetupItemsCompletedNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_KidDevice_InitialSetupItemsCompletedNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_KidDevice_KidCredentialsRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_KidDevice_KidCredentialsRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_KidDevice_KidCredentialsResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_KidDevice_KidCredentialsResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_KidDevice_KidDeviceService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_KidDevice_KidDeviceService_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_KidDevice_OAuth2Credentials_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_KidDevice_OAuth2Credentials_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_KidDevice_UserTimerDetailsNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_KidDevice_UserTimerDetailsNotification_fieldAccessorTable;

    public interface ITOAuthCredentialsRequestOrBuilder extends MessageOrBuilder {
    }

    public interface ITOAuthCredentialsResponseOrBuilder extends MessageOrBuilder {
        OAuth2Credentials getCredentials();

        OAuth2CredentialsOrBuilder getCredentialsOrBuilder();

        GCSLocation getGcsLocation();

        boolean hasCredentials();

        boolean hasGcsLocation();
    }

    public interface InitialSetupItemsBeginNotificationOrBuilder extends MessageOrBuilder {
        InitialSetupItem getItemsToRequest(int i14);

        int getItemsToRequestCount();

        List<InitialSetupItem> getItemsToRequestList();
    }

    public interface InitialSetupItemsCompletedNotificationOrBuilder extends MessageOrBuilder {
        InitialSetupItem getFailedItems(int i14);

        int getFailedItemsCount();

        List<InitialSetupItem> getFailedItemsList();

        InitialSetupItem getSuccessfulItems(int i14);

        int getSuccessfulItemsCount();

        List<InitialSetupItem> getSuccessfulItemsList();

        InitialSetupItem getUnsupportedItems(int i14);

        int getUnsupportedItemsCount();

        List<InitialSetupItem> getUnsupportedItemsList();
    }

    public interface KidCredentialsRequestOrBuilder extends MessageOrBuilder {
        GDICredentials.DIOAuth2Credentials getDiOauth2Credentials();

        GDICredentials.DIOAuth2CredentialsOrBuilder getDiOauth2CredentialsOrBuilder();

        GCSLocation getGcsLocation();

        OAuth2Credentials getItOauth2Credentials();

        OAuth2CredentialsOrBuilder getItOauth2CredentialsOrBuilder();

        GDICredentials.SIPCredentials getSipCredentials();

        GDICredentials.SIPCredentialsOrBuilder getSipCredentialsOrBuilder();

        boolean hasDiOauth2Credentials();

        boolean hasGcsLocation();

        boolean hasItOauth2Credentials();

        boolean hasSipCredentials();
    }

    public interface KidCredentialsResponseOrBuilder extends MessageOrBuilder {
    }

    public interface KidDeviceServiceOrBuilder extends MessageOrBuilder {
        InitialSetupItemsBeginNotification getInitialSetupItemsBeginNotification();

        InitialSetupItemsBeginNotificationOrBuilder getInitialSetupItemsBeginNotificationOrBuilder();

        InitialSetupItemsCompletedNotification getInitialSetupItemsCompletedNotification();

        InitialSetupItemsCompletedNotificationOrBuilder getInitialSetupItemsCompletedNotificationOrBuilder();

        ITOAuthCredentialsRequest getItOauthRequest();

        ITOAuthCredentialsRequestOrBuilder getItOauthRequestOrBuilder();

        ITOAuthCredentialsResponse getItOauthResponse();

        ITOAuthCredentialsResponseOrBuilder getItOauthResponseOrBuilder();

        KidCredentialsRequest getKidCredentialsRequest();

        KidCredentialsRequestOrBuilder getKidCredentialsRequestOrBuilder();

        KidCredentialsResponse getKidCredentialsResponse();

        KidCredentialsResponseOrBuilder getKidCredentialsResponseOrBuilder();

        UserTimerDetailsNotification getUserTimerDetails();

        UserTimerDetailsNotificationOrBuilder getUserTimerDetailsOrBuilder();

        boolean hasInitialSetupItemsBeginNotification();

        boolean hasInitialSetupItemsCompletedNotification();

        boolean hasItOauthRequest();

        boolean hasItOauthResponse();

        boolean hasKidCredentialsRequest();

        boolean hasKidCredentialsResponse();

        boolean hasUserTimerDetails();
    }

    public interface OAuth2CredentialsOrBuilder extends MessageOrBuilder {
        String getAccessToken();

        ByteString getAccessTokenBytes();

        String getCustomerId();

        ByteString getCustomerIdBytes();

        int getExpiresIn();

        String getRefreshToken();

        ByteString getRefreshTokenBytes();

        String getRefreshTokenExpiresIn();

        ByteString getRefreshTokenExpiresInBytes();

        String getScope();

        ByteString getScopeBytes();

        String getTokenType();

        ByteString getTokenTypeBytes();

        boolean hasAccessToken();

        boolean hasCustomerId();

        boolean hasExpiresIn();

        boolean hasRefreshToken();

        boolean hasRefreshTokenExpiresIn();

        boolean hasScope();

        boolean hasTokenType();
    }

    public interface UserTimerDetailsNotificationOrBuilder extends MessageOrBuilder {
        int getCurrentTimestamp();

        UserTimerDetailsNotification.TimerAction getTimerAction();

        int getTimerDurationSeconds();

        UserTimerDetailsNotification.TimerType getTimerType();

        boolean hasCurrentTimestamp();

        boolean hasTimerAction();

        boolean hasTimerDurationSeconds();

        boolean hasTimerType();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_KidDevice_KidDeviceService_descriptor = descriptor2;
        internal_static_GDI_Proto_KidDevice_KidDeviceService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"ItOauthRequest", "ItOauthResponse", "KidCredentialsRequest", "KidCredentialsResponse", "UserTimerDetails", "InitialSetupItemsCompletedNotification", "InitialSetupItemsBeginNotification"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_KidDevice_OAuth2Credentials_descriptor = descriptor3;
        internal_static_GDI_Proto_KidDevice_OAuth2Credentials_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"AccessToken", "TokenType", "RefreshToken", "ExpiresIn", "Scope", "RefreshTokenExpiresIn", "CustomerId"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_KidDevice_ITOAuthCredentialsRequest_descriptor = descriptor4;
        internal_static_GDI_Proto_KidDevice_ITOAuthCredentialsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[0]);
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_KidDevice_KidCredentialsResponse_descriptor = descriptor5;
        internal_static_GDI_Proto_KidDevice_KidCredentialsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[0]);
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_KidDevice_UserTimerDetailsNotification_descriptor = descriptor6;
        internal_static_GDI_Proto_KidDevice_UserTimerDetailsNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"CurrentTimestamp", "TimerDurationSeconds", "TimerAction", "TimerType"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_KidDevice_InitialSetupItemsCompletedNotification_descriptor = descriptor7;
        internal_static_GDI_Proto_KidDevice_InitialSetupItemsCompletedNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"SuccessfulItems", "FailedItems", "UnsupportedItems"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_KidDevice_ITOAuthCredentialsResponse_descriptor = descriptor8;
        internal_static_GDI_Proto_KidDevice_ITOAuthCredentialsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Credentials", "GcsLocation"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_KidDevice_KidCredentialsRequest_descriptor = descriptor9;
        internal_static_GDI_Proto_KidDevice_KidCredentialsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"ItOauth2Credentials", "GcsLocation", "DiOauth2Credentials", "SipCredentials"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_GDI_Proto_KidDevice_InitialSetupItemsBeginNotification_descriptor = descriptor10;
        internal_static_GDI_Proto_KidDevice_InitialSetupItemsBeginNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"ItemsToRequest"});
        GDICredentials.getDescriptor();
    }

    private GDIKidDevice() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class ITOAuthCredentialsRequest extends GeneratedMessageV3 implements ITOAuthCredentialsRequestOrBuilder {
        private static final ITOAuthCredentialsRequest DEFAULT_INSTANCE = new ITOAuthCredentialsRequest();

        @Deprecated
        public static final Parser<ITOAuthCredentialsRequest> PARSER = new AbstractParser<ITOAuthCredentialsRequest>() { // from class: com.garmin.proto.generated.GDIKidDevice.ITOAuthCredentialsRequest.1
            @Override // com.google.protobuf.Parser
            public ITOAuthCredentialsRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ITOAuthCredentialsRequest.newBuilder();
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

        private ITOAuthCredentialsRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ITOAuthCredentialsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIKidDevice.internal_static_GDI_Proto_KidDevice_ITOAuthCredentialsRequest_descriptor;
        }

        public static Builder newBuilder(ITOAuthCredentialsRequest iTOAuthCredentialsRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(iTOAuthCredentialsRequest);
        }

        public static ITOAuthCredentialsRequest parseDelimitedFrom(InputStream inputStream) {
            return (ITOAuthCredentialsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ITOAuthCredentialsRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ITOAuthCredentialsRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof ITOAuthCredentialsRequest) {
                return getUnknownFields().equals(((ITOAuthCredentialsRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ITOAuthCredentialsRequest> getParserForType() {
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
            return GDIKidDevice.internal_static_GDI_Proto_KidDevice_ITOAuthCredentialsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ITOAuthCredentialsRequest.class, Builder.class);
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
            return new ITOAuthCredentialsRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ITOAuthCredentialsRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIKidDevice.internal_static_GDI_Proto_KidDevice_ITOAuthCredentialsRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ITOAuthCredentialsRequest build() {
                ITOAuthCredentialsRequest iTOAuthCredentialsRequestBuildPartial = buildPartial();
                if (iTOAuthCredentialsRequestBuildPartial.isInitialized()) {
                    return iTOAuthCredentialsRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) iTOAuthCredentialsRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ITOAuthCredentialsRequest buildPartial() {
                ITOAuthCredentialsRequest iTOAuthCredentialsRequest = new ITOAuthCredentialsRequest(this);
                onBuilt();
                return iTOAuthCredentialsRequest;
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
                return GDIKidDevice.internal_static_GDI_Proto_KidDevice_ITOAuthCredentialsRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIKidDevice.internal_static_GDI_Proto_KidDevice_ITOAuthCredentialsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ITOAuthCredentialsRequest.class, Builder.class);
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
            public ITOAuthCredentialsRequest getDefaultInstanceForType() {
                return ITOAuthCredentialsRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ITOAuthCredentialsRequest) {
                    return mergeFrom((ITOAuthCredentialsRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ITOAuthCredentialsRequest iTOAuthCredentialsRequest) {
                if (iTOAuthCredentialsRequest == ITOAuthCredentialsRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(iTOAuthCredentialsRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ITOAuthCredentialsRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ ITOAuthCredentialsRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private ITOAuthCredentialsRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ITOAuthCredentialsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ITOAuthCredentialsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ITOAuthCredentialsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ITOAuthCredentialsRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ITOAuthCredentialsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ITOAuthCredentialsRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ITOAuthCredentialsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ITOAuthCredentialsRequest parseFrom(InputStream inputStream) {
            return (ITOAuthCredentialsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ITOAuthCredentialsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ITOAuthCredentialsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ITOAuthCredentialsRequest parseFrom(CodedInputStream codedInputStream) {
            return (ITOAuthCredentialsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ITOAuthCredentialsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ITOAuthCredentialsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class KidCredentialsResponse extends GeneratedMessageV3 implements KidCredentialsResponseOrBuilder {
        private static final KidCredentialsResponse DEFAULT_INSTANCE = new KidCredentialsResponse();

        @Deprecated
        public static final Parser<KidCredentialsResponse> PARSER = new AbstractParser<KidCredentialsResponse>() { // from class: com.garmin.proto.generated.GDIKidDevice.KidCredentialsResponse.1
            @Override // com.google.protobuf.Parser
            public KidCredentialsResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = KidCredentialsResponse.newBuilder();
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

        private KidCredentialsResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static KidCredentialsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIKidDevice.internal_static_GDI_Proto_KidDevice_KidCredentialsResponse_descriptor;
        }

        public static Builder newBuilder(KidCredentialsResponse kidCredentialsResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(kidCredentialsResponse);
        }

        public static KidCredentialsResponse parseDelimitedFrom(InputStream inputStream) {
            return (KidCredentialsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static KidCredentialsResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<KidCredentialsResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof KidCredentialsResponse) {
                return getUnknownFields().equals(((KidCredentialsResponse) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<KidCredentialsResponse> getParserForType() {
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
            return GDIKidDevice.internal_static_GDI_Proto_KidDevice_KidCredentialsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(KidCredentialsResponse.class, Builder.class);
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
            return new KidCredentialsResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements KidCredentialsResponseOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIKidDevice.internal_static_GDI_Proto_KidDevice_KidCredentialsResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public KidCredentialsResponse build() {
                KidCredentialsResponse kidCredentialsResponseBuildPartial = buildPartial();
                if (kidCredentialsResponseBuildPartial.isInitialized()) {
                    return kidCredentialsResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) kidCredentialsResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public KidCredentialsResponse buildPartial() {
                KidCredentialsResponse kidCredentialsResponse = new KidCredentialsResponse(this);
                onBuilt();
                return kidCredentialsResponse;
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
                return GDIKidDevice.internal_static_GDI_Proto_KidDevice_KidCredentialsResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIKidDevice.internal_static_GDI_Proto_KidDevice_KidCredentialsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(KidCredentialsResponse.class, Builder.class);
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
            public KidCredentialsResponse getDefaultInstanceForType() {
                return KidCredentialsResponse.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof KidCredentialsResponse) {
                    return mergeFrom((KidCredentialsResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(KidCredentialsResponse kidCredentialsResponse) {
                if (kidCredentialsResponse == KidCredentialsResponse.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(kidCredentialsResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public KidCredentialsResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ KidCredentialsResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private KidCredentialsResponse() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static KidCredentialsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (KidCredentialsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static KidCredentialsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static KidCredentialsResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static KidCredentialsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static KidCredentialsResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static KidCredentialsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static KidCredentialsResponse parseFrom(InputStream inputStream) {
            return (KidCredentialsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static KidCredentialsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (KidCredentialsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static KidCredentialsResponse parseFrom(CodedInputStream codedInputStream) {
            return (KidCredentialsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static KidCredentialsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (KidCredentialsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ITOAuthCredentialsResponse extends GeneratedMessageV3 implements ITOAuthCredentialsResponseOrBuilder {
        public static final int CREDENTIALS_FIELD_NUMBER = 1;
        public static final int GCS_LOCATION_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private OAuth2Credentials credentials_;
        private int gcsLocation_;
        private byte memoizedIsInitialized;
        private static final ITOAuthCredentialsResponse DEFAULT_INSTANCE = new ITOAuthCredentialsResponse();

        @Deprecated
        public static final Parser<ITOAuthCredentialsResponse> PARSER = new AbstractParser<ITOAuthCredentialsResponse>() { // from class: com.garmin.proto.generated.GDIKidDevice.ITOAuthCredentialsResponse.1
            @Override // com.google.protobuf.Parser
            public ITOAuthCredentialsResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ITOAuthCredentialsResponse.newBuilder();
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

        private ITOAuthCredentialsResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.gcsLocation_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ITOAuthCredentialsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIKidDevice.internal_static_GDI_Proto_KidDevice_ITOAuthCredentialsResponse_descriptor;
        }

        public static Builder newBuilder(ITOAuthCredentialsResponse iTOAuthCredentialsResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(iTOAuthCredentialsResponse);
        }

        public static ITOAuthCredentialsResponse parseDelimitedFrom(InputStream inputStream) {
            return (ITOAuthCredentialsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ITOAuthCredentialsResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ITOAuthCredentialsResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ITOAuthCredentialsResponse)) {
                return super.equals(obj);
            }
            ITOAuthCredentialsResponse iTOAuthCredentialsResponse = (ITOAuthCredentialsResponse) obj;
            if (hasCredentials() != iTOAuthCredentialsResponse.hasCredentials()) {
                return false;
            }
            if ((!hasCredentials() || getCredentials().equals(iTOAuthCredentialsResponse.getCredentials())) && hasGcsLocation() == iTOAuthCredentialsResponse.hasGcsLocation()) {
                return (!hasGcsLocation() || this.gcsLocation_ == iTOAuthCredentialsResponse.gcsLocation_) && getUnknownFields().equals(iTOAuthCredentialsResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.ITOAuthCredentialsResponseOrBuilder
        public OAuth2Credentials getCredentials() {
            OAuth2Credentials oAuth2Credentials = this.credentials_;
            return oAuth2Credentials == null ? OAuth2Credentials.getDefaultInstance() : oAuth2Credentials;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.ITOAuthCredentialsResponseOrBuilder
        public OAuth2CredentialsOrBuilder getCredentialsOrBuilder() {
            OAuth2Credentials oAuth2Credentials = this.credentials_;
            return oAuth2Credentials == null ? OAuth2Credentials.getDefaultInstance() : oAuth2Credentials;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.ITOAuthCredentialsResponseOrBuilder
        public GCSLocation getGcsLocation() {
            GCSLocation gCSLocationForNumber = GCSLocation.forNumber(this.gcsLocation_);
            return gCSLocationForNumber == null ? GCSLocation.PRODUCTION : gCSLocationForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ITOAuthCredentialsResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getCredentials()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(2, this.gcsLocation_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.ITOAuthCredentialsResponseOrBuilder
        public boolean hasCredentials() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.ITOAuthCredentialsResponseOrBuilder
        public boolean hasGcsLocation() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCredentials()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getCredentials().hashCode();
            }
            if (hasGcsLocation()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.gcsLocation_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIKidDevice.internal_static_GDI_Proto_KidDevice_ITOAuthCredentialsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ITOAuthCredentialsResponse.class, Builder.class);
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
            if (!hasCredentials() || getCredentials().isInitialized()) {
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
            return new ITOAuthCredentialsResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getCredentials());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.gcsLocation_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ITOAuthCredentialsResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<OAuth2Credentials, OAuth2Credentials.Builder, OAuth2CredentialsOrBuilder> credentialsBuilder_;
            private OAuth2Credentials credentials_;
            private int gcsLocation_;

            private Builder() {
                this.gcsLocation_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ITOAuthCredentialsResponse iTOAuthCredentialsResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<OAuth2Credentials, OAuth2Credentials.Builder, OAuth2CredentialsOrBuilder> singleFieldBuilderV3 = this.credentialsBuilder_;
                    iTOAuthCredentialsResponse.credentials_ = singleFieldBuilderV3 == null ? this.credentials_ : (OAuth2Credentials) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    iTOAuthCredentialsResponse.gcsLocation_ = this.gcsLocation_;
                    i14 |= 2;
                }
                iTOAuthCredentialsResponse.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<OAuth2Credentials, OAuth2Credentials.Builder, OAuth2CredentialsOrBuilder> getCredentialsFieldBuilder() {
                if (this.credentialsBuilder_ == null) {
                    this.credentialsBuilder_ = new SingleFieldBuilderV3<>(getCredentials(), getParentForChildren(), isClean());
                    this.credentials_ = null;
                }
                return this.credentialsBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIKidDevice.internal_static_GDI_Proto_KidDevice_ITOAuthCredentialsResponse_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getCredentialsFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ITOAuthCredentialsResponse build() {
                ITOAuthCredentialsResponse iTOAuthCredentialsResponseBuildPartial = buildPartial();
                if (iTOAuthCredentialsResponseBuildPartial.isInitialized()) {
                    return iTOAuthCredentialsResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) iTOAuthCredentialsResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ITOAuthCredentialsResponse buildPartial() {
                ITOAuthCredentialsResponse iTOAuthCredentialsResponse = new ITOAuthCredentialsResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(iTOAuthCredentialsResponse);
                }
                onBuilt();
                return iTOAuthCredentialsResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.credentials_ = null;
                SingleFieldBuilderV3<OAuth2Credentials, OAuth2Credentials.Builder, OAuth2CredentialsOrBuilder> singleFieldBuilderV3 = this.credentialsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.credentialsBuilder_ = null;
                }
                this.gcsLocation_ = 0;
                return this;
            }

            public Builder clearCredentials() {
                this.bitField0_ &= -2;
                this.credentials_ = null;
                SingleFieldBuilderV3<OAuth2Credentials, OAuth2Credentials.Builder, OAuth2CredentialsOrBuilder> singleFieldBuilderV3 = this.credentialsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.credentialsBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGcsLocation() {
                this.bitField0_ &= -3;
                this.gcsLocation_ = 0;
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

            @Override // com.garmin.proto.generated.GDIKidDevice.ITOAuthCredentialsResponseOrBuilder
            public OAuth2Credentials getCredentials() {
                SingleFieldBuilderV3<OAuth2Credentials, OAuth2Credentials.Builder, OAuth2CredentialsOrBuilder> singleFieldBuilderV3 = this.credentialsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (OAuth2Credentials) singleFieldBuilderV3.getMessage();
                }
                OAuth2Credentials oAuth2Credentials = this.credentials_;
                return oAuth2Credentials == null ? OAuth2Credentials.getDefaultInstance() : oAuth2Credentials;
            }

            public OAuth2Credentials.Builder getCredentialsBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (OAuth2Credentials.Builder) getCredentialsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.ITOAuthCredentialsResponseOrBuilder
            public OAuth2CredentialsOrBuilder getCredentialsOrBuilder() {
                SingleFieldBuilderV3<OAuth2Credentials, OAuth2Credentials.Builder, OAuth2CredentialsOrBuilder> singleFieldBuilderV3 = this.credentialsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (OAuth2CredentialsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                OAuth2Credentials oAuth2Credentials = this.credentials_;
                return oAuth2Credentials == null ? OAuth2Credentials.getDefaultInstance() : oAuth2Credentials;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIKidDevice.internal_static_GDI_Proto_KidDevice_ITOAuthCredentialsResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.ITOAuthCredentialsResponseOrBuilder
            public GCSLocation getGcsLocation() {
                GCSLocation gCSLocationForNumber = GCSLocation.forNumber(this.gcsLocation_);
                return gCSLocationForNumber == null ? GCSLocation.PRODUCTION : gCSLocationForNumber;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.ITOAuthCredentialsResponseOrBuilder
            public boolean hasCredentials() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.ITOAuthCredentialsResponseOrBuilder
            public boolean hasGcsLocation() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIKidDevice.internal_static_GDI_Proto_KidDevice_ITOAuthCredentialsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ITOAuthCredentialsResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasCredentials() || getCredentials().isInitialized();
            }

            public Builder mergeCredentials(OAuth2Credentials oAuth2Credentials) {
                OAuth2Credentials oAuth2Credentials2;
                SingleFieldBuilderV3<OAuth2Credentials, OAuth2Credentials.Builder, OAuth2CredentialsOrBuilder> singleFieldBuilderV3 = this.credentialsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(oAuth2Credentials);
                } else if ((this.bitField0_ & 1) == 0 || (oAuth2Credentials2 = this.credentials_) == null || oAuth2Credentials2 == OAuth2Credentials.getDefaultInstance()) {
                    this.credentials_ = oAuth2Credentials;
                } else {
                    getCredentialsBuilder().mergeFrom(oAuth2Credentials);
                }
                if (this.credentials_ != null) {
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
                                    codedInputStream.readMessage(getCredentialsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (GCSLocation.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.gcsLocation_ = i14;
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

            public Builder setCredentials(OAuth2Credentials.Builder builder) {
                SingleFieldBuilderV3<OAuth2Credentials, OAuth2Credentials.Builder, OAuth2CredentialsOrBuilder> singleFieldBuilderV3 = this.credentialsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.credentials_ = builder.build();
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

            public Builder setGcsLocation(GCSLocation gCSLocation) {
                gCSLocation.getClass();
                this.bitField0_ |= 2;
                this.gcsLocation_ = gCSLocation.getNumber();
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
            public ITOAuthCredentialsResponse getDefaultInstanceForType() {
                return ITOAuthCredentialsResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.gcsLocation_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setCredentials(OAuth2Credentials oAuth2Credentials) {
                SingleFieldBuilderV3<OAuth2Credentials, OAuth2Credentials.Builder, OAuth2CredentialsOrBuilder> singleFieldBuilderV3 = this.credentialsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    oAuth2Credentials.getClass();
                    this.credentials_ = oAuth2Credentials;
                } else {
                    singleFieldBuilderV3.setMessage(oAuth2Credentials);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ITOAuthCredentialsResponse) {
                    return mergeFrom((ITOAuthCredentialsResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ITOAuthCredentialsResponse iTOAuthCredentialsResponse) {
                if (iTOAuthCredentialsResponse == ITOAuthCredentialsResponse.getDefaultInstance()) {
                    return this;
                }
                if (iTOAuthCredentialsResponse.hasCredentials()) {
                    mergeCredentials(iTOAuthCredentialsResponse.getCredentials());
                }
                if (iTOAuthCredentialsResponse.hasGcsLocation()) {
                    setGcsLocation(iTOAuthCredentialsResponse.getGcsLocation());
                }
                mergeUnknownFields(iTOAuthCredentialsResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ITOAuthCredentialsResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ITOAuthCredentialsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ITOAuthCredentialsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ITOAuthCredentialsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ITOAuthCredentialsResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ITOAuthCredentialsResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ITOAuthCredentialsResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.gcsLocation_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ITOAuthCredentialsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ITOAuthCredentialsResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ITOAuthCredentialsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ITOAuthCredentialsResponse parseFrom(InputStream inputStream) {
            return (ITOAuthCredentialsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ITOAuthCredentialsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ITOAuthCredentialsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ITOAuthCredentialsResponse parseFrom(CodedInputStream codedInputStream) {
            return (ITOAuthCredentialsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ITOAuthCredentialsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ITOAuthCredentialsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class InitialSetupItemsBeginNotification extends GeneratedMessageV3 implements InitialSetupItemsBeginNotificationOrBuilder {
        public static final int ITEMS_TO_REQUEST_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<Integer> itemsToRequest_;
        private byte memoizedIsInitialized;
        private static final Internal.ListAdapter.Converter<Integer, InitialSetupItem> itemsToRequest_converter_ = new Internal.ListAdapter.Converter<Integer, InitialSetupItem>() { // from class: com.garmin.proto.generated.GDIKidDevice.InitialSetupItemsBeginNotification.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public InitialSetupItem convert(Integer num) {
                InitialSetupItem initialSetupItemForNumber = InitialSetupItem.forNumber(num.intValue());
                return initialSetupItemForNumber == null ? InitialSetupItem.CONTACTS : initialSetupItemForNumber;
            }
        };
        private static final InitialSetupItemsBeginNotification DEFAULT_INSTANCE = new InitialSetupItemsBeginNotification();

        @Deprecated
        public static final Parser<InitialSetupItemsBeginNotification> PARSER = new AbstractParser<InitialSetupItemsBeginNotification>() { // from class: com.garmin.proto.generated.GDIKidDevice.InitialSetupItemsBeginNotification.2
            @Override // com.google.protobuf.Parser
            public InitialSetupItemsBeginNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = InitialSetupItemsBeginNotification.newBuilder();
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

        private InitialSetupItemsBeginNotification() {
            this.memoizedIsInitialized = (byte) -1;
            this.itemsToRequest_ = Collections.EMPTY_LIST;
        }

        public static InitialSetupItemsBeginNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIKidDevice.internal_static_GDI_Proto_KidDevice_InitialSetupItemsBeginNotification_descriptor;
        }

        public static Builder newBuilder(InitialSetupItemsBeginNotification initialSetupItemsBeginNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(initialSetupItemsBeginNotification);
        }

        public static InitialSetupItemsBeginNotification parseDelimitedFrom(InputStream inputStream) {
            return (InitialSetupItemsBeginNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static InitialSetupItemsBeginNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<InitialSetupItemsBeginNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InitialSetupItemsBeginNotification)) {
                return super.equals(obj);
            }
            InitialSetupItemsBeginNotification initialSetupItemsBeginNotification = (InitialSetupItemsBeginNotification) obj;
            return this.itemsToRequest_.equals(initialSetupItemsBeginNotification.itemsToRequest_) && getUnknownFields().equals(initialSetupItemsBeginNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.InitialSetupItemsBeginNotificationOrBuilder
        public InitialSetupItem getItemsToRequest(int i14) {
            return itemsToRequest_converter_.convert(this.itemsToRequest_.get(i14));
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.InitialSetupItemsBeginNotificationOrBuilder
        public int getItemsToRequestCount() {
            return this.itemsToRequest_.size();
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.InitialSetupItemsBeginNotificationOrBuilder
        public List<InitialSetupItem> getItemsToRequestList() {
            return new Internal.ListAdapter(this.itemsToRequest_, itemsToRequest_converter_);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<InitialSetupItemsBeginNotification> getParserForType() {
            return PARSER;
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
                int size = this.itemsToRequest_.size();
                List<Integer> list = this.itemsToRequest_;
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
            if (getItemsToRequestCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.itemsToRequest_.hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIKidDevice.internal_static_GDI_Proto_KidDevice_InitialSetupItemsBeginNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(InitialSetupItemsBeginNotification.class, Builder.class);
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
            return new InitialSetupItemsBeginNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            int iF = 0;
            while (iF < this.itemsToRequest_.size()) {
                iF = f3.f(this.itemsToRequest_.get(iF), codedOutputStream, 1, iF, 1);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements InitialSetupItemsBeginNotificationOrBuilder {
            private int bitField0_;
            private List<Integer> itemsToRequest_;

            private Builder() {
                this.itemsToRequest_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(InitialSetupItemsBeginNotification initialSetupItemsBeginNotification) {
            }

            private void buildPartialRepeatedFields(InitialSetupItemsBeginNotification initialSetupItemsBeginNotification) {
                if ((this.bitField0_ & 1) != 0) {
                    this.itemsToRequest_ = Collections.unmodifiableList(this.itemsToRequest_);
                    this.bitField0_ &= -2;
                }
                initialSetupItemsBeginNotification.itemsToRequest_ = this.itemsToRequest_;
            }

            private void ensureItemsToRequestIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.itemsToRequest_ = new ArrayList(this.itemsToRequest_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIKidDevice.internal_static_GDI_Proto_KidDevice_InitialSetupItemsBeginNotification_descriptor;
            }

            public Builder addAllItemsToRequest(Iterable<? extends InitialSetupItem> iterable) {
                ensureItemsToRequestIsMutable();
                Iterator<? extends InitialSetupItem> it = iterable.iterator();
                while (it.hasNext()) {
                    this.itemsToRequest_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addItemsToRequest(InitialSetupItem initialSetupItem) {
                initialSetupItem.getClass();
                ensureItemsToRequestIsMutable();
                this.itemsToRequest_.add(Integer.valueOf(initialSetupItem.getNumber()));
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InitialSetupItemsBeginNotification build() {
                InitialSetupItemsBeginNotification initialSetupItemsBeginNotificationBuildPartial = buildPartial();
                if (initialSetupItemsBeginNotificationBuildPartial.isInitialized()) {
                    return initialSetupItemsBeginNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) initialSetupItemsBeginNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InitialSetupItemsBeginNotification buildPartial() {
                InitialSetupItemsBeginNotification initialSetupItemsBeginNotification = new InitialSetupItemsBeginNotification(this);
                buildPartialRepeatedFields(initialSetupItemsBeginNotification);
                if (this.bitField0_ != 0) {
                    buildPartial0(initialSetupItemsBeginNotification);
                }
                onBuilt();
                return initialSetupItemsBeginNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.itemsToRequest_ = Collections.EMPTY_LIST;
                this.bitField0_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearItemsToRequest() {
                this.itemsToRequest_ = Collections.EMPTY_LIST;
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
                return GDIKidDevice.internal_static_GDI_Proto_KidDevice_InitialSetupItemsBeginNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.InitialSetupItemsBeginNotificationOrBuilder
            public InitialSetupItem getItemsToRequest(int i14) {
                return (InitialSetupItem) InitialSetupItemsBeginNotification.itemsToRequest_converter_.convert(this.itemsToRequest_.get(i14));
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.InitialSetupItemsBeginNotificationOrBuilder
            public int getItemsToRequestCount() {
                return this.itemsToRequest_.size();
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.InitialSetupItemsBeginNotificationOrBuilder
            public List<InitialSetupItem> getItemsToRequestList() {
                return new Internal.ListAdapter(this.itemsToRequest_, InitialSetupItemsBeginNotification.itemsToRequest_converter_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIKidDevice.internal_static_GDI_Proto_KidDevice_InitialSetupItemsBeginNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(InitialSetupItemsBeginNotification.class, Builder.class);
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
                                    if (InitialSetupItem.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        ensureItemsToRequestIsMutable();
                                        this.itemsToRequest_.add(Integer.valueOf(i14));
                                    }
                                } else if (tag == 10) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int i15 = codedInputStream.readEnum();
                                        if (InitialSetupItem.forNumber(i15) == null) {
                                            mergeUnknownVarintField(1, i15);
                                        } else {
                                            ensureItemsToRequestIsMutable();
                                            this.itemsToRequest_.add(Integer.valueOf(i15));
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

            public Builder setItemsToRequest(int i14, InitialSetupItem initialSetupItem) {
                initialSetupItem.getClass();
                ensureItemsToRequestIsMutable();
                this.itemsToRequest_.set(i14, Integer.valueOf(initialSetupItem.getNumber()));
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
            public InitialSetupItemsBeginNotification getDefaultInstanceForType() {
                return InitialSetupItemsBeginNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.itemsToRequest_ = Collections.EMPTY_LIST;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof InitialSetupItemsBeginNotification) {
                    return mergeFrom((InitialSetupItemsBeginNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(InitialSetupItemsBeginNotification initialSetupItemsBeginNotification) {
                if (initialSetupItemsBeginNotification == InitialSetupItemsBeginNotification.getDefaultInstance()) {
                    return this;
                }
                if (!initialSetupItemsBeginNotification.itemsToRequest_.isEmpty()) {
                    if (this.itemsToRequest_.isEmpty()) {
                        this.itemsToRequest_ = initialSetupItemsBeginNotification.itemsToRequest_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureItemsToRequestIsMutable();
                        this.itemsToRequest_.addAll(initialSetupItemsBeginNotification.itemsToRequest_);
                    }
                    onChanged();
                }
                mergeUnknownFields(initialSetupItemsBeginNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public InitialSetupItemsBeginNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static InitialSetupItemsBeginNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InitialSetupItemsBeginNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InitialSetupItemsBeginNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static InitialSetupItemsBeginNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private InitialSetupItemsBeginNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static InitialSetupItemsBeginNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static InitialSetupItemsBeginNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ InitialSetupItemsBeginNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static InitialSetupItemsBeginNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static InitialSetupItemsBeginNotification parseFrom(InputStream inputStream) {
            return (InitialSetupItemsBeginNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static InitialSetupItemsBeginNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InitialSetupItemsBeginNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InitialSetupItemsBeginNotification parseFrom(CodedInputStream codedInputStream) {
            return (InitialSetupItemsBeginNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static InitialSetupItemsBeginNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InitialSetupItemsBeginNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class InitialSetupItemsCompletedNotification extends GeneratedMessageV3 implements InitialSetupItemsCompletedNotificationOrBuilder {
        public static final int FAILED_ITEMS_FIELD_NUMBER = 2;
        public static final int SUCCESSFUL_ITEMS_FIELD_NUMBER = 1;
        public static final int UNSUPPORTED_ITEMS_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private List<Integer> failedItems_;
        private byte memoizedIsInitialized;
        private List<Integer> successfulItems_;
        private List<Integer> unsupportedItems_;
        private static final Internal.ListAdapter.Converter<Integer, InitialSetupItem> successfulItems_converter_ = new Internal.ListAdapter.Converter<Integer, InitialSetupItem>() { // from class: com.garmin.proto.generated.GDIKidDevice.InitialSetupItemsCompletedNotification.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public InitialSetupItem convert(Integer num) {
                InitialSetupItem initialSetupItemForNumber = InitialSetupItem.forNumber(num.intValue());
                return initialSetupItemForNumber == null ? InitialSetupItem.CONTACTS : initialSetupItemForNumber;
            }
        };
        private static final Internal.ListAdapter.Converter<Integer, InitialSetupItem> failedItems_converter_ = new Internal.ListAdapter.Converter<Integer, InitialSetupItem>() { // from class: com.garmin.proto.generated.GDIKidDevice.InitialSetupItemsCompletedNotification.2
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public InitialSetupItem convert(Integer num) {
                InitialSetupItem initialSetupItemForNumber = InitialSetupItem.forNumber(num.intValue());
                return initialSetupItemForNumber == null ? InitialSetupItem.CONTACTS : initialSetupItemForNumber;
            }
        };
        private static final Internal.ListAdapter.Converter<Integer, InitialSetupItem> unsupportedItems_converter_ = new Internal.ListAdapter.Converter<Integer, InitialSetupItem>() { // from class: com.garmin.proto.generated.GDIKidDevice.InitialSetupItemsCompletedNotification.3
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public InitialSetupItem convert(Integer num) {
                InitialSetupItem initialSetupItemForNumber = InitialSetupItem.forNumber(num.intValue());
                return initialSetupItemForNumber == null ? InitialSetupItem.CONTACTS : initialSetupItemForNumber;
            }
        };
        private static final InitialSetupItemsCompletedNotification DEFAULT_INSTANCE = new InitialSetupItemsCompletedNotification();

        @Deprecated
        public static final Parser<InitialSetupItemsCompletedNotification> PARSER = new AbstractParser<InitialSetupItemsCompletedNotification>() { // from class: com.garmin.proto.generated.GDIKidDevice.InitialSetupItemsCompletedNotification.4
            @Override // com.google.protobuf.Parser
            public InitialSetupItemsCompletedNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = InitialSetupItemsCompletedNotification.newBuilder();
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

        private InitialSetupItemsCompletedNotification() {
            this.memoizedIsInitialized = (byte) -1;
            List<Integer> list = Collections.EMPTY_LIST;
            this.successfulItems_ = list;
            this.failedItems_ = list;
            this.unsupportedItems_ = list;
        }

        public static InitialSetupItemsCompletedNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIKidDevice.internal_static_GDI_Proto_KidDevice_InitialSetupItemsCompletedNotification_descriptor;
        }

        public static Builder newBuilder(InitialSetupItemsCompletedNotification initialSetupItemsCompletedNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(initialSetupItemsCompletedNotification);
        }

        public static InitialSetupItemsCompletedNotification parseDelimitedFrom(InputStream inputStream) {
            return (InitialSetupItemsCompletedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static InitialSetupItemsCompletedNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<InitialSetupItemsCompletedNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InitialSetupItemsCompletedNotification)) {
                return super.equals(obj);
            }
            InitialSetupItemsCompletedNotification initialSetupItemsCompletedNotification = (InitialSetupItemsCompletedNotification) obj;
            return this.successfulItems_.equals(initialSetupItemsCompletedNotification.successfulItems_) && this.failedItems_.equals(initialSetupItemsCompletedNotification.failedItems_) && this.unsupportedItems_.equals(initialSetupItemsCompletedNotification.unsupportedItems_) && getUnknownFields().equals(initialSetupItemsCompletedNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.InitialSetupItemsCompletedNotificationOrBuilder
        public InitialSetupItem getFailedItems(int i14) {
            return failedItems_converter_.convert(this.failedItems_.get(i14));
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.InitialSetupItemsCompletedNotificationOrBuilder
        public int getFailedItemsCount() {
            return this.failedItems_.size();
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.InitialSetupItemsCompletedNotificationOrBuilder
        public List<InitialSetupItem> getFailedItemsList() {
            return new Internal.ListAdapter(this.failedItems_, failedItems_converter_);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<InitialSetupItemsCompletedNotification> getParserForType() {
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
            int i16 = 0;
            int iA = 0;
            while (true) {
                int size = this.successfulItems_.size();
                list = this.successfulItems_;
                if (i16 >= size) {
                    break;
                }
                iA = f3.a(iA, list.get(i16));
                i16++;
            }
            int size2 = list.size() + iA;
            int i17 = 0;
            int iA2 = 0;
            while (true) {
                int size3 = this.failedItems_.size();
                list2 = this.failedItems_;
                if (i17 >= size3) {
                    break;
                }
                iA2 = f3.a(iA2, list2.get(i17));
                i17++;
            }
            int size4 = list2.size() + size2 + iA2;
            int iA3 = 0;
            while (true) {
                int size5 = this.unsupportedItems_.size();
                List<Integer> list3 = this.unsupportedItems_;
                if (i15 >= size5) {
                    int serializedSize = getUnknownFields().getSerializedSize() + list3.size() + size4 + iA3;
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }
                iA3 = f3.a(iA3, list3.get(i15));
                i15++;
            }
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.InitialSetupItemsCompletedNotificationOrBuilder
        public InitialSetupItem getSuccessfulItems(int i14) {
            return successfulItems_converter_.convert(this.successfulItems_.get(i14));
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.InitialSetupItemsCompletedNotificationOrBuilder
        public int getSuccessfulItemsCount() {
            return this.successfulItems_.size();
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.InitialSetupItemsCompletedNotificationOrBuilder
        public List<InitialSetupItem> getSuccessfulItemsList() {
            return new Internal.ListAdapter(this.successfulItems_, successfulItems_converter_);
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.InitialSetupItemsCompletedNotificationOrBuilder
        public InitialSetupItem getUnsupportedItems(int i14) {
            return unsupportedItems_converter_.convert(this.unsupportedItems_.get(i14));
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.InitialSetupItemsCompletedNotificationOrBuilder
        public int getUnsupportedItemsCount() {
            return this.unsupportedItems_.size();
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.InitialSetupItemsCompletedNotificationOrBuilder
        public List<InitialSetupItem> getUnsupportedItemsList() {
            return new Internal.ListAdapter(this.unsupportedItems_, unsupportedItems_converter_);
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getSuccessfulItemsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.successfulItems_.hashCode();
            }
            if (getFailedItemsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.failedItems_.hashCode();
            }
            if (getUnsupportedItemsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + this.unsupportedItems_.hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIKidDevice.internal_static_GDI_Proto_KidDevice_InitialSetupItemsCompletedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(InitialSetupItemsCompletedNotification.class, Builder.class);
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
            return new InitialSetupItemsCompletedNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            int iF = 0;
            int iF2 = 0;
            while (iF2 < this.successfulItems_.size()) {
                iF2 = f3.f(this.successfulItems_.get(iF2), codedOutputStream, 1, iF2, 1);
            }
            int iF3 = 0;
            while (iF3 < this.failedItems_.size()) {
                iF3 = f3.f(this.failedItems_.get(iF3), codedOutputStream, 2, iF3, 1);
            }
            while (iF < this.unsupportedItems_.size()) {
                iF = f3.f(this.unsupportedItems_.get(iF), codedOutputStream, 3, iF, 1);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements InitialSetupItemsCompletedNotificationOrBuilder {
            private int bitField0_;
            private List<Integer> failedItems_;
            private List<Integer> successfulItems_;
            private List<Integer> unsupportedItems_;

            private Builder() {
                List<Integer> list = Collections.EMPTY_LIST;
                this.successfulItems_ = list;
                this.failedItems_ = list;
                this.unsupportedItems_ = list;
            }

            private void buildPartial0(InitialSetupItemsCompletedNotification initialSetupItemsCompletedNotification) {
            }

            private void buildPartialRepeatedFields(InitialSetupItemsCompletedNotification initialSetupItemsCompletedNotification) {
                if ((this.bitField0_ & 1) != 0) {
                    this.successfulItems_ = Collections.unmodifiableList(this.successfulItems_);
                    this.bitField0_ &= -2;
                }
                initialSetupItemsCompletedNotification.successfulItems_ = this.successfulItems_;
                if ((this.bitField0_ & 2) != 0) {
                    this.failedItems_ = Collections.unmodifiableList(this.failedItems_);
                    this.bitField0_ &= -3;
                }
                initialSetupItemsCompletedNotification.failedItems_ = this.failedItems_;
                if ((this.bitField0_ & 4) != 0) {
                    this.unsupportedItems_ = Collections.unmodifiableList(this.unsupportedItems_);
                    this.bitField0_ &= -5;
                }
                initialSetupItemsCompletedNotification.unsupportedItems_ = this.unsupportedItems_;
            }

            private void ensureFailedItemsIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.failedItems_ = new ArrayList(this.failedItems_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureSuccessfulItemsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.successfulItems_ = new ArrayList(this.successfulItems_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureUnsupportedItemsIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.unsupportedItems_ = new ArrayList(this.unsupportedItems_);
                    this.bitField0_ |= 4;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIKidDevice.internal_static_GDI_Proto_KidDevice_InitialSetupItemsCompletedNotification_descriptor;
            }

            public Builder addAllFailedItems(Iterable<? extends InitialSetupItem> iterable) {
                ensureFailedItemsIsMutable();
                Iterator<? extends InitialSetupItem> it = iterable.iterator();
                while (it.hasNext()) {
                    this.failedItems_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllSuccessfulItems(Iterable<? extends InitialSetupItem> iterable) {
                ensureSuccessfulItemsIsMutable();
                Iterator<? extends InitialSetupItem> it = iterable.iterator();
                while (it.hasNext()) {
                    this.successfulItems_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllUnsupportedItems(Iterable<? extends InitialSetupItem> iterable) {
                ensureUnsupportedItemsIsMutable();
                Iterator<? extends InitialSetupItem> it = iterable.iterator();
                while (it.hasNext()) {
                    this.unsupportedItems_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addFailedItems(InitialSetupItem initialSetupItem) {
                initialSetupItem.getClass();
                ensureFailedItemsIsMutable();
                this.failedItems_.add(Integer.valueOf(initialSetupItem.getNumber()));
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addSuccessfulItems(InitialSetupItem initialSetupItem) {
                initialSetupItem.getClass();
                ensureSuccessfulItemsIsMutable();
                this.successfulItems_.add(Integer.valueOf(initialSetupItem.getNumber()));
                onChanged();
                return this;
            }

            public Builder addUnsupportedItems(InitialSetupItem initialSetupItem) {
                initialSetupItem.getClass();
                ensureUnsupportedItemsIsMutable();
                this.unsupportedItems_.add(Integer.valueOf(initialSetupItem.getNumber()));
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InitialSetupItemsCompletedNotification build() {
                InitialSetupItemsCompletedNotification initialSetupItemsCompletedNotificationBuildPartial = buildPartial();
                if (initialSetupItemsCompletedNotificationBuildPartial.isInitialized()) {
                    return initialSetupItemsCompletedNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) initialSetupItemsCompletedNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InitialSetupItemsCompletedNotification buildPartial() {
                InitialSetupItemsCompletedNotification initialSetupItemsCompletedNotification = new InitialSetupItemsCompletedNotification(this);
                buildPartialRepeatedFields(initialSetupItemsCompletedNotification);
                if (this.bitField0_ != 0) {
                    buildPartial0(initialSetupItemsCompletedNotification);
                }
                onBuilt();
                return initialSetupItemsCompletedNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                List<Integer> list = Collections.EMPTY_LIST;
                this.successfulItems_ = list;
                this.failedItems_ = list;
                this.unsupportedItems_ = list;
                this.bitField0_ = 0;
                return this;
            }

            public Builder clearFailedItems() {
                this.failedItems_ = Collections.EMPTY_LIST;
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

            public Builder clearSuccessfulItems() {
                this.successfulItems_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearUnsupportedItems() {
                this.unsupportedItems_ = Collections.EMPTY_LIST;
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
                return GDIKidDevice.internal_static_GDI_Proto_KidDevice_InitialSetupItemsCompletedNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.InitialSetupItemsCompletedNotificationOrBuilder
            public InitialSetupItem getFailedItems(int i14) {
                return (InitialSetupItem) InitialSetupItemsCompletedNotification.failedItems_converter_.convert(this.failedItems_.get(i14));
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.InitialSetupItemsCompletedNotificationOrBuilder
            public int getFailedItemsCount() {
                return this.failedItems_.size();
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.InitialSetupItemsCompletedNotificationOrBuilder
            public List<InitialSetupItem> getFailedItemsList() {
                return new Internal.ListAdapter(this.failedItems_, InitialSetupItemsCompletedNotification.failedItems_converter_);
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.InitialSetupItemsCompletedNotificationOrBuilder
            public InitialSetupItem getSuccessfulItems(int i14) {
                return (InitialSetupItem) InitialSetupItemsCompletedNotification.successfulItems_converter_.convert(this.successfulItems_.get(i14));
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.InitialSetupItemsCompletedNotificationOrBuilder
            public int getSuccessfulItemsCount() {
                return this.successfulItems_.size();
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.InitialSetupItemsCompletedNotificationOrBuilder
            public List<InitialSetupItem> getSuccessfulItemsList() {
                return new Internal.ListAdapter(this.successfulItems_, InitialSetupItemsCompletedNotification.successfulItems_converter_);
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.InitialSetupItemsCompletedNotificationOrBuilder
            public InitialSetupItem getUnsupportedItems(int i14) {
                return (InitialSetupItem) InitialSetupItemsCompletedNotification.unsupportedItems_converter_.convert(this.unsupportedItems_.get(i14));
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.InitialSetupItemsCompletedNotificationOrBuilder
            public int getUnsupportedItemsCount() {
                return this.unsupportedItems_.size();
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.InitialSetupItemsCompletedNotificationOrBuilder
            public List<InitialSetupItem> getUnsupportedItemsList() {
                return new Internal.ListAdapter(this.unsupportedItems_, InitialSetupItemsCompletedNotification.unsupportedItems_converter_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIKidDevice.internal_static_GDI_Proto_KidDevice_InitialSetupItemsCompletedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(InitialSetupItemsCompletedNotification.class, Builder.class);
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
                                    if (InitialSetupItem.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        ensureSuccessfulItemsIsMutable();
                                        this.successfulItems_.add(Integer.valueOf(i14));
                                    }
                                } else if (tag == 10) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int i15 = codedInputStream.readEnum();
                                        if (InitialSetupItem.forNumber(i15) == null) {
                                            mergeUnknownVarintField(1, i15);
                                        } else {
                                            ensureSuccessfulItemsIsMutable();
                                            this.successfulItems_.add(Integer.valueOf(i15));
                                        }
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                } else if (tag == 16) {
                                    int i16 = codedInputStream.readEnum();
                                    if (InitialSetupItem.forNumber(i16) == null) {
                                        mergeUnknownVarintField(2, i16);
                                    } else {
                                        ensureFailedItemsIsMutable();
                                        this.failedItems_.add(Integer.valueOf(i16));
                                    }
                                } else if (tag == 18) {
                                    int iPushLimit2 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int i17 = codedInputStream.readEnum();
                                        if (InitialSetupItem.forNumber(i17) == null) {
                                            mergeUnknownVarintField(2, i17);
                                        } else {
                                            ensureFailedItemsIsMutable();
                                            this.failedItems_.add(Integer.valueOf(i17));
                                        }
                                    }
                                    codedInputStream.popLimit(iPushLimit2);
                                } else if (tag == 24) {
                                    int i18 = codedInputStream.readEnum();
                                    if (InitialSetupItem.forNumber(i18) == null) {
                                        mergeUnknownVarintField(3, i18);
                                    } else {
                                        ensureUnsupportedItemsIsMutable();
                                        this.unsupportedItems_.add(Integer.valueOf(i18));
                                    }
                                } else if (tag == 26) {
                                    int iPushLimit3 = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int i19 = codedInputStream.readEnum();
                                        if (InitialSetupItem.forNumber(i19) == null) {
                                            mergeUnknownVarintField(3, i19);
                                        } else {
                                            ensureUnsupportedItemsIsMutable();
                                            this.unsupportedItems_.add(Integer.valueOf(i19));
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

            public Builder setFailedItems(int i14, InitialSetupItem initialSetupItem) {
                initialSetupItem.getClass();
                ensureFailedItemsIsMutable();
                this.failedItems_.set(i14, Integer.valueOf(initialSetupItem.getNumber()));
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

            public Builder setSuccessfulItems(int i14, InitialSetupItem initialSetupItem) {
                initialSetupItem.getClass();
                ensureSuccessfulItemsIsMutable();
                this.successfulItems_.set(i14, Integer.valueOf(initialSetupItem.getNumber()));
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setUnsupportedItems(int i14, InitialSetupItem initialSetupItem) {
                initialSetupItem.getClass();
                ensureUnsupportedItemsIsMutable();
                this.unsupportedItems_.set(i14, Integer.valueOf(initialSetupItem.getNumber()));
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public InitialSetupItemsCompletedNotification getDefaultInstanceForType() {
                return InitialSetupItemsCompletedNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                List<Integer> list = Collections.EMPTY_LIST;
                this.successfulItems_ = list;
                this.failedItems_ = list;
                this.unsupportedItems_ = list;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof InitialSetupItemsCompletedNotification) {
                    return mergeFrom((InitialSetupItemsCompletedNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(InitialSetupItemsCompletedNotification initialSetupItemsCompletedNotification) {
                if (initialSetupItemsCompletedNotification == InitialSetupItemsCompletedNotification.getDefaultInstance()) {
                    return this;
                }
                if (!initialSetupItemsCompletedNotification.successfulItems_.isEmpty()) {
                    if (this.successfulItems_.isEmpty()) {
                        this.successfulItems_ = initialSetupItemsCompletedNotification.successfulItems_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureSuccessfulItemsIsMutable();
                        this.successfulItems_.addAll(initialSetupItemsCompletedNotification.successfulItems_);
                    }
                    onChanged();
                }
                if (!initialSetupItemsCompletedNotification.failedItems_.isEmpty()) {
                    if (this.failedItems_.isEmpty()) {
                        this.failedItems_ = initialSetupItemsCompletedNotification.failedItems_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureFailedItemsIsMutable();
                        this.failedItems_.addAll(initialSetupItemsCompletedNotification.failedItems_);
                    }
                    onChanged();
                }
                if (!initialSetupItemsCompletedNotification.unsupportedItems_.isEmpty()) {
                    if (this.unsupportedItems_.isEmpty()) {
                        this.unsupportedItems_ = initialSetupItemsCompletedNotification.unsupportedItems_;
                        this.bitField0_ &= -5;
                    } else {
                        ensureUnsupportedItemsIsMutable();
                        this.unsupportedItems_.addAll(initialSetupItemsCompletedNotification.unsupportedItems_);
                    }
                    onChanged();
                }
                mergeUnknownFields(initialSetupItemsCompletedNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public InitialSetupItemsCompletedNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static InitialSetupItemsCompletedNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InitialSetupItemsCompletedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InitialSetupItemsCompletedNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static InitialSetupItemsCompletedNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static InitialSetupItemsCompletedNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static InitialSetupItemsCompletedNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static InitialSetupItemsCompletedNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static InitialSetupItemsCompletedNotification parseFrom(InputStream inputStream) {
            return (InitialSetupItemsCompletedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private InitialSetupItemsCompletedNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static InitialSetupItemsCompletedNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InitialSetupItemsCompletedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ InitialSetupItemsCompletedNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static InitialSetupItemsCompletedNotification parseFrom(CodedInputStream codedInputStream) {
            return (InitialSetupItemsCompletedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static InitialSetupItemsCompletedNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InitialSetupItemsCompletedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class KidCredentialsRequest extends GeneratedMessageV3 implements KidCredentialsRequestOrBuilder {
        public static final int DI_OAUTH_2_CREDENTIALS_FIELD_NUMBER = 4;
        public static final int GCS_LOCATION_FIELD_NUMBER = 2;
        public static final int IT_OAUTH_2_CREDENTIALS_FIELD_NUMBER = 1;
        public static final int SIP_CREDENTIALS_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private GDICredentials.DIOAuth2Credentials diOauth2Credentials_;
        private int gcsLocation_;
        private OAuth2Credentials itOauth2Credentials_;
        private byte memoizedIsInitialized;
        private GDICredentials.SIPCredentials sipCredentials_;
        private static final KidCredentialsRequest DEFAULT_INSTANCE = new KidCredentialsRequest();

        @Deprecated
        public static final Parser<KidCredentialsRequest> PARSER = new AbstractParser<KidCredentialsRequest>() { // from class: com.garmin.proto.generated.GDIKidDevice.KidCredentialsRequest.1
            @Override // com.google.protobuf.Parser
            public KidCredentialsRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = KidCredentialsRequest.newBuilder();
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

        private KidCredentialsRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.gcsLocation_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static KidCredentialsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIKidDevice.internal_static_GDI_Proto_KidDevice_KidCredentialsRequest_descriptor;
        }

        public static Builder newBuilder(KidCredentialsRequest kidCredentialsRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(kidCredentialsRequest);
        }

        public static KidCredentialsRequest parseDelimitedFrom(InputStream inputStream) {
            return (KidCredentialsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static KidCredentialsRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<KidCredentialsRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof KidCredentialsRequest)) {
                return super.equals(obj);
            }
            KidCredentialsRequest kidCredentialsRequest = (KidCredentialsRequest) obj;
            if (hasItOauth2Credentials() != kidCredentialsRequest.hasItOauth2Credentials()) {
                return false;
            }
            if ((hasItOauth2Credentials() && !getItOauth2Credentials().equals(kidCredentialsRequest.getItOauth2Credentials())) || hasGcsLocation() != kidCredentialsRequest.hasGcsLocation()) {
                return false;
            }
            if ((hasGcsLocation() && this.gcsLocation_ != kidCredentialsRequest.gcsLocation_) || hasDiOauth2Credentials() != kidCredentialsRequest.hasDiOauth2Credentials()) {
                return false;
            }
            if ((!hasDiOauth2Credentials() || getDiOauth2Credentials().equals(kidCredentialsRequest.getDiOauth2Credentials())) && hasSipCredentials() == kidCredentialsRequest.hasSipCredentials()) {
                return (!hasSipCredentials() || getSipCredentials().equals(kidCredentialsRequest.getSipCredentials())) && getUnknownFields().equals(kidCredentialsRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.KidCredentialsRequestOrBuilder
        public GDICredentials.DIOAuth2Credentials getDiOauth2Credentials() {
            GDICredentials.DIOAuth2Credentials dIOAuth2Credentials = this.diOauth2Credentials_;
            return dIOAuth2Credentials == null ? GDICredentials.DIOAuth2Credentials.getDefaultInstance() : dIOAuth2Credentials;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.KidCredentialsRequestOrBuilder
        public GDICredentials.DIOAuth2CredentialsOrBuilder getDiOauth2CredentialsOrBuilder() {
            GDICredentials.DIOAuth2Credentials dIOAuth2Credentials = this.diOauth2Credentials_;
            return dIOAuth2Credentials == null ? GDICredentials.DIOAuth2Credentials.getDefaultInstance() : dIOAuth2Credentials;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.KidCredentialsRequestOrBuilder
        public GCSLocation getGcsLocation() {
            GCSLocation gCSLocationForNumber = GCSLocation.forNumber(this.gcsLocation_);
            return gCSLocationForNumber == null ? GCSLocation.PRODUCTION : gCSLocationForNumber;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.KidCredentialsRequestOrBuilder
        public OAuth2Credentials getItOauth2Credentials() {
            OAuth2Credentials oAuth2Credentials = this.itOauth2Credentials_;
            return oAuth2Credentials == null ? OAuth2Credentials.getDefaultInstance() : oAuth2Credentials;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.KidCredentialsRequestOrBuilder
        public OAuth2CredentialsOrBuilder getItOauth2CredentialsOrBuilder() {
            OAuth2Credentials oAuth2Credentials = this.itOauth2Credentials_;
            return oAuth2Credentials == null ? OAuth2Credentials.getDefaultInstance() : oAuth2Credentials;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<KidCredentialsRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getItOauth2Credentials()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(2, this.gcsLocation_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getDiOauth2Credentials());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getSipCredentials());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.KidCredentialsRequestOrBuilder
        public GDICredentials.SIPCredentials getSipCredentials() {
            GDICredentials.SIPCredentials sIPCredentials = this.sipCredentials_;
            return sIPCredentials == null ? GDICredentials.SIPCredentials.getDefaultInstance() : sIPCredentials;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.KidCredentialsRequestOrBuilder
        public GDICredentials.SIPCredentialsOrBuilder getSipCredentialsOrBuilder() {
            GDICredentials.SIPCredentials sIPCredentials = this.sipCredentials_;
            return sIPCredentials == null ? GDICredentials.SIPCredentials.getDefaultInstance() : sIPCredentials;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.KidCredentialsRequestOrBuilder
        public boolean hasDiOauth2Credentials() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.KidCredentialsRequestOrBuilder
        public boolean hasGcsLocation() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.KidCredentialsRequestOrBuilder
        public boolean hasItOauth2Credentials() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.KidCredentialsRequestOrBuilder
        public boolean hasSipCredentials() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasItOauth2Credentials()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getItOauth2Credentials().hashCode();
            }
            if (hasGcsLocation()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.gcsLocation_;
            }
            if (hasDiOauth2Credentials()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getDiOauth2Credentials().hashCode();
            }
            if (hasSipCredentials()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getSipCredentials().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIKidDevice.internal_static_GDI_Proto_KidDevice_KidCredentialsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(KidCredentialsRequest.class, Builder.class);
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
            if (!hasItOauth2Credentials() || getItOauth2Credentials().isInitialized()) {
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
            return new KidCredentialsRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getItOauth2Credentials());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.gcsLocation_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(4, getDiOauth2Credentials());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(5, getSipCredentials());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements KidCredentialsRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<GDICredentials.DIOAuth2Credentials, GDICredentials.DIOAuth2Credentials.Builder, GDICredentials.DIOAuth2CredentialsOrBuilder> diOauth2CredentialsBuilder_;
            private GDICredentials.DIOAuth2Credentials diOauth2Credentials_;
            private int gcsLocation_;
            private SingleFieldBuilderV3<OAuth2Credentials, OAuth2Credentials.Builder, OAuth2CredentialsOrBuilder> itOauth2CredentialsBuilder_;
            private OAuth2Credentials itOauth2Credentials_;
            private SingleFieldBuilderV3<GDICredentials.SIPCredentials, GDICredentials.SIPCredentials.Builder, GDICredentials.SIPCredentialsOrBuilder> sipCredentialsBuilder_;
            private GDICredentials.SIPCredentials sipCredentials_;

            private Builder() {
                this.gcsLocation_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(KidCredentialsRequest kidCredentialsRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<OAuth2Credentials, OAuth2Credentials.Builder, OAuth2CredentialsOrBuilder> singleFieldBuilderV3 = this.itOauth2CredentialsBuilder_;
                    kidCredentialsRequest.itOauth2Credentials_ = singleFieldBuilderV3 == null ? this.itOauth2Credentials_ : (OAuth2Credentials) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    kidCredentialsRequest.gcsLocation_ = this.gcsLocation_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<GDICredentials.DIOAuth2Credentials, GDICredentials.DIOAuth2Credentials.Builder, GDICredentials.DIOAuth2CredentialsOrBuilder> singleFieldBuilderV4 = this.diOauth2CredentialsBuilder_;
                    kidCredentialsRequest.diOauth2Credentials_ = singleFieldBuilderV4 == null ? this.diOauth2Credentials_ : (GDICredentials.DIOAuth2Credentials) singleFieldBuilderV4.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<GDICredentials.SIPCredentials, GDICredentials.SIPCredentials.Builder, GDICredentials.SIPCredentialsOrBuilder> singleFieldBuilderV5 = this.sipCredentialsBuilder_;
                    kidCredentialsRequest.sipCredentials_ = singleFieldBuilderV5 == null ? this.sipCredentials_ : (GDICredentials.SIPCredentials) singleFieldBuilderV5.build();
                    i14 |= 8;
                }
                kidCredentialsRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIKidDevice.internal_static_GDI_Proto_KidDevice_KidCredentialsRequest_descriptor;
            }

            private SingleFieldBuilderV3<GDICredentials.DIOAuth2Credentials, GDICredentials.DIOAuth2Credentials.Builder, GDICredentials.DIOAuth2CredentialsOrBuilder> getDiOauth2CredentialsFieldBuilder() {
                if (this.diOauth2CredentialsBuilder_ == null) {
                    this.diOauth2CredentialsBuilder_ = new SingleFieldBuilderV3<>(getDiOauth2Credentials(), getParentForChildren(), isClean());
                    this.diOauth2Credentials_ = null;
                }
                return this.diOauth2CredentialsBuilder_;
            }

            private SingleFieldBuilderV3<OAuth2Credentials, OAuth2Credentials.Builder, OAuth2CredentialsOrBuilder> getItOauth2CredentialsFieldBuilder() {
                if (this.itOauth2CredentialsBuilder_ == null) {
                    this.itOauth2CredentialsBuilder_ = new SingleFieldBuilderV3<>(getItOauth2Credentials(), getParentForChildren(), isClean());
                    this.itOauth2Credentials_ = null;
                }
                return this.itOauth2CredentialsBuilder_;
            }

            private SingleFieldBuilderV3<GDICredentials.SIPCredentials, GDICredentials.SIPCredentials.Builder, GDICredentials.SIPCredentialsOrBuilder> getSipCredentialsFieldBuilder() {
                if (this.sipCredentialsBuilder_ == null) {
                    this.sipCredentialsBuilder_ = new SingleFieldBuilderV3<>(getSipCredentials(), getParentForChildren(), isClean());
                    this.sipCredentials_ = null;
                }
                return this.sipCredentialsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getItOauth2CredentialsFieldBuilder();
                    getDiOauth2CredentialsFieldBuilder();
                    getSipCredentialsFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public KidCredentialsRequest build() {
                KidCredentialsRequest kidCredentialsRequestBuildPartial = buildPartial();
                if (kidCredentialsRequestBuildPartial.isInitialized()) {
                    return kidCredentialsRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) kidCredentialsRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public KidCredentialsRequest buildPartial() {
                KidCredentialsRequest kidCredentialsRequest = new KidCredentialsRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(kidCredentialsRequest);
                }
                onBuilt();
                return kidCredentialsRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.itOauth2Credentials_ = null;
                SingleFieldBuilderV3<OAuth2Credentials, OAuth2Credentials.Builder, OAuth2CredentialsOrBuilder> singleFieldBuilderV3 = this.itOauth2CredentialsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.itOauth2CredentialsBuilder_ = null;
                }
                this.gcsLocation_ = 0;
                this.diOauth2Credentials_ = null;
                SingleFieldBuilderV3<GDICredentials.DIOAuth2Credentials, GDICredentials.DIOAuth2Credentials.Builder, GDICredentials.DIOAuth2CredentialsOrBuilder> singleFieldBuilderV4 = this.diOauth2CredentialsBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.diOauth2CredentialsBuilder_ = null;
                }
                this.sipCredentials_ = null;
                SingleFieldBuilderV3<GDICredentials.SIPCredentials, GDICredentials.SIPCredentials.Builder, GDICredentials.SIPCredentialsOrBuilder> singleFieldBuilderV5 = this.sipCredentialsBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.sipCredentialsBuilder_ = null;
                }
                return this;
            }

            public Builder clearDiOauth2Credentials() {
                this.bitField0_ &= -5;
                this.diOauth2Credentials_ = null;
                SingleFieldBuilderV3<GDICredentials.DIOAuth2Credentials, GDICredentials.DIOAuth2Credentials.Builder, GDICredentials.DIOAuth2CredentialsOrBuilder> singleFieldBuilderV3 = this.diOauth2CredentialsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.diOauth2CredentialsBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGcsLocation() {
                this.bitField0_ &= -3;
                this.gcsLocation_ = 0;
                onChanged();
                return this;
            }

            public Builder clearItOauth2Credentials() {
                this.bitField0_ &= -2;
                this.itOauth2Credentials_ = null;
                SingleFieldBuilderV3<OAuth2Credentials, OAuth2Credentials.Builder, OAuth2CredentialsOrBuilder> singleFieldBuilderV3 = this.itOauth2CredentialsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.itOauth2CredentialsBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSipCredentials() {
                this.bitField0_ &= -9;
                this.sipCredentials_ = null;
                SingleFieldBuilderV3<GDICredentials.SIPCredentials, GDICredentials.SIPCredentials.Builder, GDICredentials.SIPCredentialsOrBuilder> singleFieldBuilderV3 = this.sipCredentialsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sipCredentialsBuilder_ = null;
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
                return GDIKidDevice.internal_static_GDI_Proto_KidDevice_KidCredentialsRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.KidCredentialsRequestOrBuilder
            public GDICredentials.DIOAuth2Credentials getDiOauth2Credentials() {
                SingleFieldBuilderV3<GDICredentials.DIOAuth2Credentials, GDICredentials.DIOAuth2Credentials.Builder, GDICredentials.DIOAuth2CredentialsOrBuilder> singleFieldBuilderV3 = this.diOauth2CredentialsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDICredentials.DIOAuth2Credentials) singleFieldBuilderV3.getMessage();
                }
                GDICredentials.DIOAuth2Credentials dIOAuth2Credentials = this.diOauth2Credentials_;
                return dIOAuth2Credentials == null ? GDICredentials.DIOAuth2Credentials.getDefaultInstance() : dIOAuth2Credentials;
            }

            public GDICredentials.DIOAuth2Credentials.Builder getDiOauth2CredentialsBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (GDICredentials.DIOAuth2Credentials.Builder) getDiOauth2CredentialsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.KidCredentialsRequestOrBuilder
            public GDICredentials.DIOAuth2CredentialsOrBuilder getDiOauth2CredentialsOrBuilder() {
                SingleFieldBuilderV3<GDICredentials.DIOAuth2Credentials, GDICredentials.DIOAuth2Credentials.Builder, GDICredentials.DIOAuth2CredentialsOrBuilder> singleFieldBuilderV3 = this.diOauth2CredentialsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDICredentials.DIOAuth2CredentialsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDICredentials.DIOAuth2Credentials dIOAuth2Credentials = this.diOauth2Credentials_;
                return dIOAuth2Credentials == null ? GDICredentials.DIOAuth2Credentials.getDefaultInstance() : dIOAuth2Credentials;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.KidCredentialsRequestOrBuilder
            public GCSLocation getGcsLocation() {
                GCSLocation gCSLocationForNumber = GCSLocation.forNumber(this.gcsLocation_);
                return gCSLocationForNumber == null ? GCSLocation.PRODUCTION : gCSLocationForNumber;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.KidCredentialsRequestOrBuilder
            public OAuth2Credentials getItOauth2Credentials() {
                SingleFieldBuilderV3<OAuth2Credentials, OAuth2Credentials.Builder, OAuth2CredentialsOrBuilder> singleFieldBuilderV3 = this.itOauth2CredentialsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (OAuth2Credentials) singleFieldBuilderV3.getMessage();
                }
                OAuth2Credentials oAuth2Credentials = this.itOauth2Credentials_;
                return oAuth2Credentials == null ? OAuth2Credentials.getDefaultInstance() : oAuth2Credentials;
            }

            public OAuth2Credentials.Builder getItOauth2CredentialsBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (OAuth2Credentials.Builder) getItOauth2CredentialsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.KidCredentialsRequestOrBuilder
            public OAuth2CredentialsOrBuilder getItOauth2CredentialsOrBuilder() {
                SingleFieldBuilderV3<OAuth2Credentials, OAuth2Credentials.Builder, OAuth2CredentialsOrBuilder> singleFieldBuilderV3 = this.itOauth2CredentialsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (OAuth2CredentialsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                OAuth2Credentials oAuth2Credentials = this.itOauth2Credentials_;
                return oAuth2Credentials == null ? OAuth2Credentials.getDefaultInstance() : oAuth2Credentials;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.KidCredentialsRequestOrBuilder
            public GDICredentials.SIPCredentials getSipCredentials() {
                SingleFieldBuilderV3<GDICredentials.SIPCredentials, GDICredentials.SIPCredentials.Builder, GDICredentials.SIPCredentialsOrBuilder> singleFieldBuilderV3 = this.sipCredentialsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDICredentials.SIPCredentials) singleFieldBuilderV3.getMessage();
                }
                GDICredentials.SIPCredentials sIPCredentials = this.sipCredentials_;
                return sIPCredentials == null ? GDICredentials.SIPCredentials.getDefaultInstance() : sIPCredentials;
            }

            public GDICredentials.SIPCredentials.Builder getSipCredentialsBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (GDICredentials.SIPCredentials.Builder) getSipCredentialsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.KidCredentialsRequestOrBuilder
            public GDICredentials.SIPCredentialsOrBuilder getSipCredentialsOrBuilder() {
                SingleFieldBuilderV3<GDICredentials.SIPCredentials, GDICredentials.SIPCredentials.Builder, GDICredentials.SIPCredentialsOrBuilder> singleFieldBuilderV3 = this.sipCredentialsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDICredentials.SIPCredentialsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDICredentials.SIPCredentials sIPCredentials = this.sipCredentials_;
                return sIPCredentials == null ? GDICredentials.SIPCredentials.getDefaultInstance() : sIPCredentials;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.KidCredentialsRequestOrBuilder
            public boolean hasDiOauth2Credentials() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.KidCredentialsRequestOrBuilder
            public boolean hasGcsLocation() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.KidCredentialsRequestOrBuilder
            public boolean hasItOauth2Credentials() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.KidCredentialsRequestOrBuilder
            public boolean hasSipCredentials() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIKidDevice.internal_static_GDI_Proto_KidDevice_KidCredentialsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(KidCredentialsRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasItOauth2Credentials() || getItOauth2Credentials().isInitialized();
            }

            public Builder mergeDiOauth2Credentials(GDICredentials.DIOAuth2Credentials dIOAuth2Credentials) {
                GDICredentials.DIOAuth2Credentials dIOAuth2Credentials2;
                SingleFieldBuilderV3<GDICredentials.DIOAuth2Credentials, GDICredentials.DIOAuth2Credentials.Builder, GDICredentials.DIOAuth2CredentialsOrBuilder> singleFieldBuilderV3 = this.diOauth2CredentialsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(dIOAuth2Credentials);
                } else if ((this.bitField0_ & 4) == 0 || (dIOAuth2Credentials2 = this.diOauth2Credentials_) == null || dIOAuth2Credentials2 == GDICredentials.DIOAuth2Credentials.getDefaultInstance()) {
                    this.diOauth2Credentials_ = dIOAuth2Credentials;
                } else {
                    getDiOauth2CredentialsBuilder().mergeFrom(dIOAuth2Credentials);
                }
                if (this.diOauth2Credentials_ != null) {
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
                                    codedInputStream.readMessage(getItOauth2CredentialsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (GCSLocation.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.gcsLocation_ = i14;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getDiOauth2CredentialsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(getSipCredentialsFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeItOauth2Credentials(OAuth2Credentials oAuth2Credentials) {
                OAuth2Credentials oAuth2Credentials2;
                SingleFieldBuilderV3<OAuth2Credentials, OAuth2Credentials.Builder, OAuth2CredentialsOrBuilder> singleFieldBuilderV3 = this.itOauth2CredentialsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(oAuth2Credentials);
                } else if ((this.bitField0_ & 1) == 0 || (oAuth2Credentials2 = this.itOauth2Credentials_) == null || oAuth2Credentials2 == OAuth2Credentials.getDefaultInstance()) {
                    this.itOauth2Credentials_ = oAuth2Credentials;
                } else {
                    getItOauth2CredentialsBuilder().mergeFrom(oAuth2Credentials);
                }
                if (this.itOauth2Credentials_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSipCredentials(GDICredentials.SIPCredentials sIPCredentials) {
                GDICredentials.SIPCredentials sIPCredentials2;
                SingleFieldBuilderV3<GDICredentials.SIPCredentials, GDICredentials.SIPCredentials.Builder, GDICredentials.SIPCredentialsOrBuilder> singleFieldBuilderV3 = this.sipCredentialsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(sIPCredentials);
                } else if ((this.bitField0_ & 8) == 0 || (sIPCredentials2 = this.sipCredentials_) == null || sIPCredentials2 == GDICredentials.SIPCredentials.getDefaultInstance()) {
                    this.sipCredentials_ = sIPCredentials;
                } else {
                    getSipCredentialsBuilder().mergeFrom(sIPCredentials);
                }
                if (this.sipCredentials_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setDiOauth2Credentials(GDICredentials.DIOAuth2Credentials.Builder builder) {
                SingleFieldBuilderV3<GDICredentials.DIOAuth2Credentials, GDICredentials.DIOAuth2Credentials.Builder, GDICredentials.DIOAuth2CredentialsOrBuilder> singleFieldBuilderV3 = this.diOauth2CredentialsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.diOauth2Credentials_ = builder.build();
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

            public Builder setGcsLocation(GCSLocation gCSLocation) {
                gCSLocation.getClass();
                this.bitField0_ |= 2;
                this.gcsLocation_ = gCSLocation.getNumber();
                onChanged();
                return this;
            }

            public Builder setItOauth2Credentials(OAuth2Credentials.Builder builder) {
                SingleFieldBuilderV3<OAuth2Credentials, OAuth2Credentials.Builder, OAuth2CredentialsOrBuilder> singleFieldBuilderV3 = this.itOauth2CredentialsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.itOauth2Credentials_ = builder.build();
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

            public Builder setSipCredentials(GDICredentials.SIPCredentials.Builder builder) {
                SingleFieldBuilderV3<GDICredentials.SIPCredentials, GDICredentials.SIPCredentials.Builder, GDICredentials.SIPCredentialsOrBuilder> singleFieldBuilderV3 = this.sipCredentialsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.sipCredentials_ = builder.build();
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
            public KidCredentialsRequest getDefaultInstanceForType() {
                return KidCredentialsRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.gcsLocation_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setDiOauth2Credentials(GDICredentials.DIOAuth2Credentials dIOAuth2Credentials) {
                SingleFieldBuilderV3<GDICredentials.DIOAuth2Credentials, GDICredentials.DIOAuth2Credentials.Builder, GDICredentials.DIOAuth2CredentialsOrBuilder> singleFieldBuilderV3 = this.diOauth2CredentialsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    dIOAuth2Credentials.getClass();
                    this.diOauth2Credentials_ = dIOAuth2Credentials;
                } else {
                    singleFieldBuilderV3.setMessage(dIOAuth2Credentials);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setItOauth2Credentials(OAuth2Credentials oAuth2Credentials) {
                SingleFieldBuilderV3<OAuth2Credentials, OAuth2Credentials.Builder, OAuth2CredentialsOrBuilder> singleFieldBuilderV3 = this.itOauth2CredentialsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    oAuth2Credentials.getClass();
                    this.itOauth2Credentials_ = oAuth2Credentials;
                } else {
                    singleFieldBuilderV3.setMessage(oAuth2Credentials);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSipCredentials(GDICredentials.SIPCredentials sIPCredentials) {
                SingleFieldBuilderV3<GDICredentials.SIPCredentials, GDICredentials.SIPCredentials.Builder, GDICredentials.SIPCredentialsOrBuilder> singleFieldBuilderV3 = this.sipCredentialsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    sIPCredentials.getClass();
                    this.sipCredentials_ = sIPCredentials;
                } else {
                    singleFieldBuilderV3.setMessage(sIPCredentials);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof KidCredentialsRequest) {
                    return mergeFrom((KidCredentialsRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(KidCredentialsRequest kidCredentialsRequest) {
                if (kidCredentialsRequest == KidCredentialsRequest.getDefaultInstance()) {
                    return this;
                }
                if (kidCredentialsRequest.hasItOauth2Credentials()) {
                    mergeItOauth2Credentials(kidCredentialsRequest.getItOauth2Credentials());
                }
                if (kidCredentialsRequest.hasGcsLocation()) {
                    setGcsLocation(kidCredentialsRequest.getGcsLocation());
                }
                if (kidCredentialsRequest.hasDiOauth2Credentials()) {
                    mergeDiOauth2Credentials(kidCredentialsRequest.getDiOauth2Credentials());
                }
                if (kidCredentialsRequest.hasSipCredentials()) {
                    mergeSipCredentials(kidCredentialsRequest.getSipCredentials());
                }
                mergeUnknownFields(kidCredentialsRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public KidCredentialsRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static KidCredentialsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (KidCredentialsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static KidCredentialsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ KidCredentialsRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static KidCredentialsRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private KidCredentialsRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.gcsLocation_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static KidCredentialsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static KidCredentialsRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static KidCredentialsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static KidCredentialsRequest parseFrom(InputStream inputStream) {
            return (KidCredentialsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static KidCredentialsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (KidCredentialsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static KidCredentialsRequest parseFrom(CodedInputStream codedInputStream) {
            return (KidCredentialsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static KidCredentialsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (KidCredentialsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class KidDeviceService extends GeneratedMessageV3 implements KidDeviceServiceOrBuilder {
        public static final int INITIAL_SETUP_ITEMS_BEGIN_NOTIFICATION_FIELD_NUMBER = 18;
        public static final int INITIAL_SETUP_ITEMS_COMPLETED_NOTIFICATION_FIELD_NUMBER = 17;
        public static final int IT_OAUTH_REQUEST_FIELD_NUMBER = 1;
        public static final int IT_OAUTH_RESPONSE_FIELD_NUMBER = 2;
        public static final int KID_CREDENTIALS_REQUEST_FIELD_NUMBER = 5;
        public static final int KID_CREDENTIALS_RESPONSE_FIELD_NUMBER = 6;
        public static final int USER_TIMER_DETAILS_FIELD_NUMBER = 16;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private InitialSetupItemsBeginNotification initialSetupItemsBeginNotification_;
        private InitialSetupItemsCompletedNotification initialSetupItemsCompletedNotification_;
        private ITOAuthCredentialsRequest itOauthRequest_;
        private ITOAuthCredentialsResponse itOauthResponse_;
        private KidCredentialsRequest kidCredentialsRequest_;
        private KidCredentialsResponse kidCredentialsResponse_;
        private byte memoizedIsInitialized;
        private UserTimerDetailsNotification userTimerDetails_;
        private static final KidDeviceService DEFAULT_INSTANCE = new KidDeviceService();

        @Deprecated
        public static final Parser<KidDeviceService> PARSER = new AbstractParser<KidDeviceService>() { // from class: com.garmin.proto.generated.GDIKidDevice.KidDeviceService.1
            @Override // com.google.protobuf.Parser
            public KidDeviceService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = KidDeviceService.newBuilder();
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

        private KidDeviceService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static KidDeviceService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIKidDevice.internal_static_GDI_Proto_KidDevice_KidDeviceService_descriptor;
        }

        public static Builder newBuilder(KidDeviceService kidDeviceService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(kidDeviceService);
        }

        public static KidDeviceService parseDelimitedFrom(InputStream inputStream) {
            return (KidDeviceService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static KidDeviceService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<KidDeviceService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof KidDeviceService)) {
                return super.equals(obj);
            }
            KidDeviceService kidDeviceService = (KidDeviceService) obj;
            if (hasItOauthRequest() != kidDeviceService.hasItOauthRequest()) {
                return false;
            }
            if ((hasItOauthRequest() && !getItOauthRequest().equals(kidDeviceService.getItOauthRequest())) || hasItOauthResponse() != kidDeviceService.hasItOauthResponse()) {
                return false;
            }
            if ((hasItOauthResponse() && !getItOauthResponse().equals(kidDeviceService.getItOauthResponse())) || hasKidCredentialsRequest() != kidDeviceService.hasKidCredentialsRequest()) {
                return false;
            }
            if ((hasKidCredentialsRequest() && !getKidCredentialsRequest().equals(kidDeviceService.getKidCredentialsRequest())) || hasKidCredentialsResponse() != kidDeviceService.hasKidCredentialsResponse()) {
                return false;
            }
            if ((hasKidCredentialsResponse() && !getKidCredentialsResponse().equals(kidDeviceService.getKidCredentialsResponse())) || hasUserTimerDetails() != kidDeviceService.hasUserTimerDetails()) {
                return false;
            }
            if ((hasUserTimerDetails() && !getUserTimerDetails().equals(kidDeviceService.getUserTimerDetails())) || hasInitialSetupItemsCompletedNotification() != kidDeviceService.hasInitialSetupItemsCompletedNotification()) {
                return false;
            }
            if ((!hasInitialSetupItemsCompletedNotification() || getInitialSetupItemsCompletedNotification().equals(kidDeviceService.getInitialSetupItemsCompletedNotification())) && hasInitialSetupItemsBeginNotification() == kidDeviceService.hasInitialSetupItemsBeginNotification()) {
                return (!hasInitialSetupItemsBeginNotification() || getInitialSetupItemsBeginNotification().equals(kidDeviceService.getInitialSetupItemsBeginNotification())) && getUnknownFields().equals(kidDeviceService.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
        public InitialSetupItemsBeginNotification getInitialSetupItemsBeginNotification() {
            InitialSetupItemsBeginNotification initialSetupItemsBeginNotification = this.initialSetupItemsBeginNotification_;
            return initialSetupItemsBeginNotification == null ? InitialSetupItemsBeginNotification.getDefaultInstance() : initialSetupItemsBeginNotification;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
        public InitialSetupItemsBeginNotificationOrBuilder getInitialSetupItemsBeginNotificationOrBuilder() {
            InitialSetupItemsBeginNotification initialSetupItemsBeginNotification = this.initialSetupItemsBeginNotification_;
            return initialSetupItemsBeginNotification == null ? InitialSetupItemsBeginNotification.getDefaultInstance() : initialSetupItemsBeginNotification;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
        public InitialSetupItemsCompletedNotification getInitialSetupItemsCompletedNotification() {
            InitialSetupItemsCompletedNotification initialSetupItemsCompletedNotification = this.initialSetupItemsCompletedNotification_;
            return initialSetupItemsCompletedNotification == null ? InitialSetupItemsCompletedNotification.getDefaultInstance() : initialSetupItemsCompletedNotification;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
        public InitialSetupItemsCompletedNotificationOrBuilder getInitialSetupItemsCompletedNotificationOrBuilder() {
            InitialSetupItemsCompletedNotification initialSetupItemsCompletedNotification = this.initialSetupItemsCompletedNotification_;
            return initialSetupItemsCompletedNotification == null ? InitialSetupItemsCompletedNotification.getDefaultInstance() : initialSetupItemsCompletedNotification;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
        public ITOAuthCredentialsRequest getItOauthRequest() {
            ITOAuthCredentialsRequest iTOAuthCredentialsRequest = this.itOauthRequest_;
            return iTOAuthCredentialsRequest == null ? ITOAuthCredentialsRequest.getDefaultInstance() : iTOAuthCredentialsRequest;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
        public ITOAuthCredentialsRequestOrBuilder getItOauthRequestOrBuilder() {
            ITOAuthCredentialsRequest iTOAuthCredentialsRequest = this.itOauthRequest_;
            return iTOAuthCredentialsRequest == null ? ITOAuthCredentialsRequest.getDefaultInstance() : iTOAuthCredentialsRequest;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
        public ITOAuthCredentialsResponse getItOauthResponse() {
            ITOAuthCredentialsResponse iTOAuthCredentialsResponse = this.itOauthResponse_;
            return iTOAuthCredentialsResponse == null ? ITOAuthCredentialsResponse.getDefaultInstance() : iTOAuthCredentialsResponse;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
        public ITOAuthCredentialsResponseOrBuilder getItOauthResponseOrBuilder() {
            ITOAuthCredentialsResponse iTOAuthCredentialsResponse = this.itOauthResponse_;
            return iTOAuthCredentialsResponse == null ? ITOAuthCredentialsResponse.getDefaultInstance() : iTOAuthCredentialsResponse;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
        public KidCredentialsRequest getKidCredentialsRequest() {
            KidCredentialsRequest kidCredentialsRequest = this.kidCredentialsRequest_;
            return kidCredentialsRequest == null ? KidCredentialsRequest.getDefaultInstance() : kidCredentialsRequest;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
        public KidCredentialsRequestOrBuilder getKidCredentialsRequestOrBuilder() {
            KidCredentialsRequest kidCredentialsRequest = this.kidCredentialsRequest_;
            return kidCredentialsRequest == null ? KidCredentialsRequest.getDefaultInstance() : kidCredentialsRequest;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
        public KidCredentialsResponse getKidCredentialsResponse() {
            KidCredentialsResponse kidCredentialsResponse = this.kidCredentialsResponse_;
            return kidCredentialsResponse == null ? KidCredentialsResponse.getDefaultInstance() : kidCredentialsResponse;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
        public KidCredentialsResponseOrBuilder getKidCredentialsResponseOrBuilder() {
            KidCredentialsResponse kidCredentialsResponse = this.kidCredentialsResponse_;
            return kidCredentialsResponse == null ? KidCredentialsResponse.getDefaultInstance() : kidCredentialsResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<KidDeviceService> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getItOauthRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getItOauthResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getKidCredentialsRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getKidCredentialsResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(16, getUserTimerDetails());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(17, getInitialSetupItemsCompletedNotification());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(18, getInitialSetupItemsBeginNotification());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
        public UserTimerDetailsNotification getUserTimerDetails() {
            UserTimerDetailsNotification userTimerDetailsNotification = this.userTimerDetails_;
            return userTimerDetailsNotification == null ? UserTimerDetailsNotification.getDefaultInstance() : userTimerDetailsNotification;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
        public UserTimerDetailsNotificationOrBuilder getUserTimerDetailsOrBuilder() {
            UserTimerDetailsNotification userTimerDetailsNotification = this.userTimerDetails_;
            return userTimerDetailsNotification == null ? UserTimerDetailsNotification.getDefaultInstance() : userTimerDetailsNotification;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
        public boolean hasInitialSetupItemsBeginNotification() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
        public boolean hasInitialSetupItemsCompletedNotification() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
        public boolean hasItOauthRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
        public boolean hasItOauthResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
        public boolean hasKidCredentialsRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
        public boolean hasKidCredentialsResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
        public boolean hasUserTimerDetails() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasItOauthRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getItOauthRequest().hashCode();
            }
            if (hasItOauthResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getItOauthResponse().hashCode();
            }
            if (hasKidCredentialsRequest()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getKidCredentialsRequest().hashCode();
            }
            if (hasKidCredentialsResponse()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getKidCredentialsResponse().hashCode();
            }
            if (hasUserTimerDetails()) {
                iHashCode = e5.c(iHashCode, 37, 16, 53) + getUserTimerDetails().hashCode();
            }
            if (hasInitialSetupItemsCompletedNotification()) {
                iHashCode = e5.c(iHashCode, 37, 17, 53) + getInitialSetupItemsCompletedNotification().hashCode();
            }
            if (hasInitialSetupItemsBeginNotification()) {
                iHashCode = e5.c(iHashCode, 37, 18, 53) + getInitialSetupItemsBeginNotification().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIKidDevice.internal_static_GDI_Proto_KidDevice_KidDeviceService_fieldAccessorTable.ensureFieldAccessorsInitialized(KidDeviceService.class, Builder.class);
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
            if (hasItOauthResponse() && !getItOauthResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasKidCredentialsRequest() || getKidCredentialsRequest().isInitialized()) {
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
            return new KidDeviceService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getItOauthRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getItOauthResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(5, getKidCredentialsRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(6, getKidCredentialsResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(16, getUserTimerDetails());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(17, getInitialSetupItemsCompletedNotification());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(18, getInitialSetupItemsBeginNotification());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements KidDeviceServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<InitialSetupItemsBeginNotification, InitialSetupItemsBeginNotification.Builder, InitialSetupItemsBeginNotificationOrBuilder> initialSetupItemsBeginNotificationBuilder_;
            private InitialSetupItemsBeginNotification initialSetupItemsBeginNotification_;
            private SingleFieldBuilderV3<InitialSetupItemsCompletedNotification, InitialSetupItemsCompletedNotification.Builder, InitialSetupItemsCompletedNotificationOrBuilder> initialSetupItemsCompletedNotificationBuilder_;
            private InitialSetupItemsCompletedNotification initialSetupItemsCompletedNotification_;
            private SingleFieldBuilderV3<ITOAuthCredentialsRequest, ITOAuthCredentialsRequest.Builder, ITOAuthCredentialsRequestOrBuilder> itOauthRequestBuilder_;
            private ITOAuthCredentialsRequest itOauthRequest_;
            private SingleFieldBuilderV3<ITOAuthCredentialsResponse, ITOAuthCredentialsResponse.Builder, ITOAuthCredentialsResponseOrBuilder> itOauthResponseBuilder_;
            private ITOAuthCredentialsResponse itOauthResponse_;
            private SingleFieldBuilderV3<KidCredentialsRequest, KidCredentialsRequest.Builder, KidCredentialsRequestOrBuilder> kidCredentialsRequestBuilder_;
            private KidCredentialsRequest kidCredentialsRequest_;
            private SingleFieldBuilderV3<KidCredentialsResponse, KidCredentialsResponse.Builder, KidCredentialsResponseOrBuilder> kidCredentialsResponseBuilder_;
            private KidCredentialsResponse kidCredentialsResponse_;
            private SingleFieldBuilderV3<UserTimerDetailsNotification, UserTimerDetailsNotification.Builder, UserTimerDetailsNotificationOrBuilder> userTimerDetailsBuilder_;
            private UserTimerDetailsNotification userTimerDetails_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(KidDeviceService kidDeviceService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<ITOAuthCredentialsRequest, ITOAuthCredentialsRequest.Builder, ITOAuthCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.itOauthRequestBuilder_;
                    kidDeviceService.itOauthRequest_ = singleFieldBuilderV3 == null ? this.itOauthRequest_ : (ITOAuthCredentialsRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<ITOAuthCredentialsResponse, ITOAuthCredentialsResponse.Builder, ITOAuthCredentialsResponseOrBuilder> singleFieldBuilderV4 = this.itOauthResponseBuilder_;
                    kidDeviceService.itOauthResponse_ = singleFieldBuilderV4 == null ? this.itOauthResponse_ : (ITOAuthCredentialsResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<KidCredentialsRequest, KidCredentialsRequest.Builder, KidCredentialsRequestOrBuilder> singleFieldBuilderV5 = this.kidCredentialsRequestBuilder_;
                    kidDeviceService.kidCredentialsRequest_ = singleFieldBuilderV5 == null ? this.kidCredentialsRequest_ : (KidCredentialsRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<KidCredentialsResponse, KidCredentialsResponse.Builder, KidCredentialsResponseOrBuilder> singleFieldBuilderV6 = this.kidCredentialsResponseBuilder_;
                    kidDeviceService.kidCredentialsResponse_ = singleFieldBuilderV6 == null ? this.kidCredentialsResponse_ : (KidCredentialsResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<UserTimerDetailsNotification, UserTimerDetailsNotification.Builder, UserTimerDetailsNotificationOrBuilder> singleFieldBuilderV7 = this.userTimerDetailsBuilder_;
                    kidDeviceService.userTimerDetails_ = singleFieldBuilderV7 == null ? this.userTimerDetails_ : (UserTimerDetailsNotification) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<InitialSetupItemsCompletedNotification, InitialSetupItemsCompletedNotification.Builder, InitialSetupItemsCompletedNotificationOrBuilder> singleFieldBuilderV8 = this.initialSetupItemsCompletedNotificationBuilder_;
                    kidDeviceService.initialSetupItemsCompletedNotification_ = singleFieldBuilderV8 == null ? this.initialSetupItemsCompletedNotification_ : (InitialSetupItemsCompletedNotification) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<InitialSetupItemsBeginNotification, InitialSetupItemsBeginNotification.Builder, InitialSetupItemsBeginNotificationOrBuilder> singleFieldBuilderV9 = this.initialSetupItemsBeginNotificationBuilder_;
                    kidDeviceService.initialSetupItemsBeginNotification_ = singleFieldBuilderV9 == null ? this.initialSetupItemsBeginNotification_ : (InitialSetupItemsBeginNotification) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                kidDeviceService.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIKidDevice.internal_static_GDI_Proto_KidDevice_KidDeviceService_descriptor;
            }

            private SingleFieldBuilderV3<InitialSetupItemsBeginNotification, InitialSetupItemsBeginNotification.Builder, InitialSetupItemsBeginNotificationOrBuilder> getInitialSetupItemsBeginNotificationFieldBuilder() {
                if (this.initialSetupItemsBeginNotificationBuilder_ == null) {
                    this.initialSetupItemsBeginNotificationBuilder_ = new SingleFieldBuilderV3<>(getInitialSetupItemsBeginNotification(), getParentForChildren(), isClean());
                    this.initialSetupItemsBeginNotification_ = null;
                }
                return this.initialSetupItemsBeginNotificationBuilder_;
            }

            private SingleFieldBuilderV3<InitialSetupItemsCompletedNotification, InitialSetupItemsCompletedNotification.Builder, InitialSetupItemsCompletedNotificationOrBuilder> getInitialSetupItemsCompletedNotificationFieldBuilder() {
                if (this.initialSetupItemsCompletedNotificationBuilder_ == null) {
                    this.initialSetupItemsCompletedNotificationBuilder_ = new SingleFieldBuilderV3<>(getInitialSetupItemsCompletedNotification(), getParentForChildren(), isClean());
                    this.initialSetupItemsCompletedNotification_ = null;
                }
                return this.initialSetupItemsCompletedNotificationBuilder_;
            }

            private SingleFieldBuilderV3<ITOAuthCredentialsRequest, ITOAuthCredentialsRequest.Builder, ITOAuthCredentialsRequestOrBuilder> getItOauthRequestFieldBuilder() {
                if (this.itOauthRequestBuilder_ == null) {
                    this.itOauthRequestBuilder_ = new SingleFieldBuilderV3<>(getItOauthRequest(), getParentForChildren(), isClean());
                    this.itOauthRequest_ = null;
                }
                return this.itOauthRequestBuilder_;
            }

            private SingleFieldBuilderV3<ITOAuthCredentialsResponse, ITOAuthCredentialsResponse.Builder, ITOAuthCredentialsResponseOrBuilder> getItOauthResponseFieldBuilder() {
                if (this.itOauthResponseBuilder_ == null) {
                    this.itOauthResponseBuilder_ = new SingleFieldBuilderV3<>(getItOauthResponse(), getParentForChildren(), isClean());
                    this.itOauthResponse_ = null;
                }
                return this.itOauthResponseBuilder_;
            }

            private SingleFieldBuilderV3<KidCredentialsRequest, KidCredentialsRequest.Builder, KidCredentialsRequestOrBuilder> getKidCredentialsRequestFieldBuilder() {
                if (this.kidCredentialsRequestBuilder_ == null) {
                    this.kidCredentialsRequestBuilder_ = new SingleFieldBuilderV3<>(getKidCredentialsRequest(), getParentForChildren(), isClean());
                    this.kidCredentialsRequest_ = null;
                }
                return this.kidCredentialsRequestBuilder_;
            }

            private SingleFieldBuilderV3<KidCredentialsResponse, KidCredentialsResponse.Builder, KidCredentialsResponseOrBuilder> getKidCredentialsResponseFieldBuilder() {
                if (this.kidCredentialsResponseBuilder_ == null) {
                    this.kidCredentialsResponseBuilder_ = new SingleFieldBuilderV3<>(getKidCredentialsResponse(), getParentForChildren(), isClean());
                    this.kidCredentialsResponse_ = null;
                }
                return this.kidCredentialsResponseBuilder_;
            }

            private SingleFieldBuilderV3<UserTimerDetailsNotification, UserTimerDetailsNotification.Builder, UserTimerDetailsNotificationOrBuilder> getUserTimerDetailsFieldBuilder() {
                if (this.userTimerDetailsBuilder_ == null) {
                    this.userTimerDetailsBuilder_ = new SingleFieldBuilderV3<>(getUserTimerDetails(), getParentForChildren(), isClean());
                    this.userTimerDetails_ = null;
                }
                return this.userTimerDetailsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getItOauthRequestFieldBuilder();
                    getItOauthResponseFieldBuilder();
                    getKidCredentialsRequestFieldBuilder();
                    getKidCredentialsResponseFieldBuilder();
                    getUserTimerDetailsFieldBuilder();
                    getInitialSetupItemsCompletedNotificationFieldBuilder();
                    getInitialSetupItemsBeginNotificationFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public KidDeviceService build() {
                KidDeviceService kidDeviceServiceBuildPartial = buildPartial();
                if (kidDeviceServiceBuildPartial.isInitialized()) {
                    return kidDeviceServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) kidDeviceServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public KidDeviceService buildPartial() {
                KidDeviceService kidDeviceService = new KidDeviceService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(kidDeviceService);
                }
                onBuilt();
                return kidDeviceService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.itOauthRequest_ = null;
                SingleFieldBuilderV3<ITOAuthCredentialsRequest, ITOAuthCredentialsRequest.Builder, ITOAuthCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.itOauthRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.itOauthRequestBuilder_ = null;
                }
                this.itOauthResponse_ = null;
                SingleFieldBuilderV3<ITOAuthCredentialsResponse, ITOAuthCredentialsResponse.Builder, ITOAuthCredentialsResponseOrBuilder> singleFieldBuilderV4 = this.itOauthResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.itOauthResponseBuilder_ = null;
                }
                this.kidCredentialsRequest_ = null;
                SingleFieldBuilderV3<KidCredentialsRequest, KidCredentialsRequest.Builder, KidCredentialsRequestOrBuilder> singleFieldBuilderV5 = this.kidCredentialsRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.kidCredentialsRequestBuilder_ = null;
                }
                this.kidCredentialsResponse_ = null;
                SingleFieldBuilderV3<KidCredentialsResponse, KidCredentialsResponse.Builder, KidCredentialsResponseOrBuilder> singleFieldBuilderV6 = this.kidCredentialsResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.kidCredentialsResponseBuilder_ = null;
                }
                this.userTimerDetails_ = null;
                SingleFieldBuilderV3<UserTimerDetailsNotification, UserTimerDetailsNotification.Builder, UserTimerDetailsNotificationOrBuilder> singleFieldBuilderV7 = this.userTimerDetailsBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.userTimerDetailsBuilder_ = null;
                }
                this.initialSetupItemsCompletedNotification_ = null;
                SingleFieldBuilderV3<InitialSetupItemsCompletedNotification, InitialSetupItemsCompletedNotification.Builder, InitialSetupItemsCompletedNotificationOrBuilder> singleFieldBuilderV8 = this.initialSetupItemsCompletedNotificationBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.initialSetupItemsCompletedNotificationBuilder_ = null;
                }
                this.initialSetupItemsBeginNotification_ = null;
                SingleFieldBuilderV3<InitialSetupItemsBeginNotification, InitialSetupItemsBeginNotification.Builder, InitialSetupItemsBeginNotificationOrBuilder> singleFieldBuilderV9 = this.initialSetupItemsBeginNotificationBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.initialSetupItemsBeginNotificationBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearInitialSetupItemsBeginNotification() {
                this.bitField0_ &= -65;
                this.initialSetupItemsBeginNotification_ = null;
                SingleFieldBuilderV3<InitialSetupItemsBeginNotification, InitialSetupItemsBeginNotification.Builder, InitialSetupItemsBeginNotificationOrBuilder> singleFieldBuilderV3 = this.initialSetupItemsBeginNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.initialSetupItemsBeginNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearInitialSetupItemsCompletedNotification() {
                this.bitField0_ &= -33;
                this.initialSetupItemsCompletedNotification_ = null;
                SingleFieldBuilderV3<InitialSetupItemsCompletedNotification, InitialSetupItemsCompletedNotification.Builder, InitialSetupItemsCompletedNotificationOrBuilder> singleFieldBuilderV3 = this.initialSetupItemsCompletedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.initialSetupItemsCompletedNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearItOauthRequest() {
                this.bitField0_ &= -2;
                this.itOauthRequest_ = null;
                SingleFieldBuilderV3<ITOAuthCredentialsRequest, ITOAuthCredentialsRequest.Builder, ITOAuthCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.itOauthRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.itOauthRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearItOauthResponse() {
                this.bitField0_ &= -3;
                this.itOauthResponse_ = null;
                SingleFieldBuilderV3<ITOAuthCredentialsResponse, ITOAuthCredentialsResponse.Builder, ITOAuthCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.itOauthResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.itOauthResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearKidCredentialsRequest() {
                this.bitField0_ &= -5;
                this.kidCredentialsRequest_ = null;
                SingleFieldBuilderV3<KidCredentialsRequest, KidCredentialsRequest.Builder, KidCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.kidCredentialsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.kidCredentialsRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearKidCredentialsResponse() {
                this.bitField0_ &= -9;
                this.kidCredentialsResponse_ = null;
                SingleFieldBuilderV3<KidCredentialsResponse, KidCredentialsResponse.Builder, KidCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.kidCredentialsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.kidCredentialsResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearUserTimerDetails() {
                this.bitField0_ &= -17;
                this.userTimerDetails_ = null;
                SingleFieldBuilderV3<UserTimerDetailsNotification, UserTimerDetailsNotification.Builder, UserTimerDetailsNotificationOrBuilder> singleFieldBuilderV3 = this.userTimerDetailsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.userTimerDetailsBuilder_ = null;
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
                return GDIKidDevice.internal_static_GDI_Proto_KidDevice_KidDeviceService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
            public InitialSetupItemsBeginNotification getInitialSetupItemsBeginNotification() {
                SingleFieldBuilderV3<InitialSetupItemsBeginNotification, InitialSetupItemsBeginNotification.Builder, InitialSetupItemsBeginNotificationOrBuilder> singleFieldBuilderV3 = this.initialSetupItemsBeginNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (InitialSetupItemsBeginNotification) singleFieldBuilderV3.getMessage();
                }
                InitialSetupItemsBeginNotification initialSetupItemsBeginNotification = this.initialSetupItemsBeginNotification_;
                return initialSetupItemsBeginNotification == null ? InitialSetupItemsBeginNotification.getDefaultInstance() : initialSetupItemsBeginNotification;
            }

            public InitialSetupItemsBeginNotification.Builder getInitialSetupItemsBeginNotificationBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (InitialSetupItemsBeginNotification.Builder) getInitialSetupItemsBeginNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
            public InitialSetupItemsBeginNotificationOrBuilder getInitialSetupItemsBeginNotificationOrBuilder() {
                SingleFieldBuilderV3<InitialSetupItemsBeginNotification, InitialSetupItemsBeginNotification.Builder, InitialSetupItemsBeginNotificationOrBuilder> singleFieldBuilderV3 = this.initialSetupItemsBeginNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (InitialSetupItemsBeginNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                InitialSetupItemsBeginNotification initialSetupItemsBeginNotification = this.initialSetupItemsBeginNotification_;
                return initialSetupItemsBeginNotification == null ? InitialSetupItemsBeginNotification.getDefaultInstance() : initialSetupItemsBeginNotification;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
            public InitialSetupItemsCompletedNotification getInitialSetupItemsCompletedNotification() {
                SingleFieldBuilderV3<InitialSetupItemsCompletedNotification, InitialSetupItemsCompletedNotification.Builder, InitialSetupItemsCompletedNotificationOrBuilder> singleFieldBuilderV3 = this.initialSetupItemsCompletedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (InitialSetupItemsCompletedNotification) singleFieldBuilderV3.getMessage();
                }
                InitialSetupItemsCompletedNotification initialSetupItemsCompletedNotification = this.initialSetupItemsCompletedNotification_;
                return initialSetupItemsCompletedNotification == null ? InitialSetupItemsCompletedNotification.getDefaultInstance() : initialSetupItemsCompletedNotification;
            }

            public InitialSetupItemsCompletedNotification.Builder getInitialSetupItemsCompletedNotificationBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (InitialSetupItemsCompletedNotification.Builder) getInitialSetupItemsCompletedNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
            public InitialSetupItemsCompletedNotificationOrBuilder getInitialSetupItemsCompletedNotificationOrBuilder() {
                SingleFieldBuilderV3<InitialSetupItemsCompletedNotification, InitialSetupItemsCompletedNotification.Builder, InitialSetupItemsCompletedNotificationOrBuilder> singleFieldBuilderV3 = this.initialSetupItemsCompletedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (InitialSetupItemsCompletedNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                InitialSetupItemsCompletedNotification initialSetupItemsCompletedNotification = this.initialSetupItemsCompletedNotification_;
                return initialSetupItemsCompletedNotification == null ? InitialSetupItemsCompletedNotification.getDefaultInstance() : initialSetupItemsCompletedNotification;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
            public ITOAuthCredentialsRequest getItOauthRequest() {
                SingleFieldBuilderV3<ITOAuthCredentialsRequest, ITOAuthCredentialsRequest.Builder, ITOAuthCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.itOauthRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ITOAuthCredentialsRequest) singleFieldBuilderV3.getMessage();
                }
                ITOAuthCredentialsRequest iTOAuthCredentialsRequest = this.itOauthRequest_;
                return iTOAuthCredentialsRequest == null ? ITOAuthCredentialsRequest.getDefaultInstance() : iTOAuthCredentialsRequest;
            }

            public ITOAuthCredentialsRequest.Builder getItOauthRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (ITOAuthCredentialsRequest.Builder) getItOauthRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
            public ITOAuthCredentialsRequestOrBuilder getItOauthRequestOrBuilder() {
                SingleFieldBuilderV3<ITOAuthCredentialsRequest, ITOAuthCredentialsRequest.Builder, ITOAuthCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.itOauthRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ITOAuthCredentialsRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ITOAuthCredentialsRequest iTOAuthCredentialsRequest = this.itOauthRequest_;
                return iTOAuthCredentialsRequest == null ? ITOAuthCredentialsRequest.getDefaultInstance() : iTOAuthCredentialsRequest;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
            public ITOAuthCredentialsResponse getItOauthResponse() {
                SingleFieldBuilderV3<ITOAuthCredentialsResponse, ITOAuthCredentialsResponse.Builder, ITOAuthCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.itOauthResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ITOAuthCredentialsResponse) singleFieldBuilderV3.getMessage();
                }
                ITOAuthCredentialsResponse iTOAuthCredentialsResponse = this.itOauthResponse_;
                return iTOAuthCredentialsResponse == null ? ITOAuthCredentialsResponse.getDefaultInstance() : iTOAuthCredentialsResponse;
            }

            public ITOAuthCredentialsResponse.Builder getItOauthResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (ITOAuthCredentialsResponse.Builder) getItOauthResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
            public ITOAuthCredentialsResponseOrBuilder getItOauthResponseOrBuilder() {
                SingleFieldBuilderV3<ITOAuthCredentialsResponse, ITOAuthCredentialsResponse.Builder, ITOAuthCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.itOauthResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ITOAuthCredentialsResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ITOAuthCredentialsResponse iTOAuthCredentialsResponse = this.itOauthResponse_;
                return iTOAuthCredentialsResponse == null ? ITOAuthCredentialsResponse.getDefaultInstance() : iTOAuthCredentialsResponse;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
            public KidCredentialsRequest getKidCredentialsRequest() {
                SingleFieldBuilderV3<KidCredentialsRequest, KidCredentialsRequest.Builder, KidCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.kidCredentialsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (KidCredentialsRequest) singleFieldBuilderV3.getMessage();
                }
                KidCredentialsRequest kidCredentialsRequest = this.kidCredentialsRequest_;
                return kidCredentialsRequest == null ? KidCredentialsRequest.getDefaultInstance() : kidCredentialsRequest;
            }

            public KidCredentialsRequest.Builder getKidCredentialsRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (KidCredentialsRequest.Builder) getKidCredentialsRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
            public KidCredentialsRequestOrBuilder getKidCredentialsRequestOrBuilder() {
                SingleFieldBuilderV3<KidCredentialsRequest, KidCredentialsRequest.Builder, KidCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.kidCredentialsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (KidCredentialsRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                KidCredentialsRequest kidCredentialsRequest = this.kidCredentialsRequest_;
                return kidCredentialsRequest == null ? KidCredentialsRequest.getDefaultInstance() : kidCredentialsRequest;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
            public KidCredentialsResponse getKidCredentialsResponse() {
                SingleFieldBuilderV3<KidCredentialsResponse, KidCredentialsResponse.Builder, KidCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.kidCredentialsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (KidCredentialsResponse) singleFieldBuilderV3.getMessage();
                }
                KidCredentialsResponse kidCredentialsResponse = this.kidCredentialsResponse_;
                return kidCredentialsResponse == null ? KidCredentialsResponse.getDefaultInstance() : kidCredentialsResponse;
            }

            public KidCredentialsResponse.Builder getKidCredentialsResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (KidCredentialsResponse.Builder) getKidCredentialsResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
            public KidCredentialsResponseOrBuilder getKidCredentialsResponseOrBuilder() {
                SingleFieldBuilderV3<KidCredentialsResponse, KidCredentialsResponse.Builder, KidCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.kidCredentialsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (KidCredentialsResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                KidCredentialsResponse kidCredentialsResponse = this.kidCredentialsResponse_;
                return kidCredentialsResponse == null ? KidCredentialsResponse.getDefaultInstance() : kidCredentialsResponse;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
            public UserTimerDetailsNotification getUserTimerDetails() {
                SingleFieldBuilderV3<UserTimerDetailsNotification, UserTimerDetailsNotification.Builder, UserTimerDetailsNotificationOrBuilder> singleFieldBuilderV3 = this.userTimerDetailsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UserTimerDetailsNotification) singleFieldBuilderV3.getMessage();
                }
                UserTimerDetailsNotification userTimerDetailsNotification = this.userTimerDetails_;
                return userTimerDetailsNotification == null ? UserTimerDetailsNotification.getDefaultInstance() : userTimerDetailsNotification;
            }

            public UserTimerDetailsNotification.Builder getUserTimerDetailsBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (UserTimerDetailsNotification.Builder) getUserTimerDetailsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
            public UserTimerDetailsNotificationOrBuilder getUserTimerDetailsOrBuilder() {
                SingleFieldBuilderV3<UserTimerDetailsNotification, UserTimerDetailsNotification.Builder, UserTimerDetailsNotificationOrBuilder> singleFieldBuilderV3 = this.userTimerDetailsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UserTimerDetailsNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                UserTimerDetailsNotification userTimerDetailsNotification = this.userTimerDetails_;
                return userTimerDetailsNotification == null ? UserTimerDetailsNotification.getDefaultInstance() : userTimerDetailsNotification;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
            public boolean hasInitialSetupItemsBeginNotification() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
            public boolean hasInitialSetupItemsCompletedNotification() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
            public boolean hasItOauthRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
            public boolean hasItOauthResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
            public boolean hasKidCredentialsRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
            public boolean hasKidCredentialsResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.KidDeviceServiceOrBuilder
            public boolean hasUserTimerDetails() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIKidDevice.internal_static_GDI_Proto_KidDevice_KidDeviceService_fieldAccessorTable.ensureFieldAccessorsInitialized(KidDeviceService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasItOauthResponse() || getItOauthResponse().isInitialized()) {
                    return !hasKidCredentialsRequest() || getKidCredentialsRequest().isInitialized();
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
                                    codedInputStream.readMessage(getItOauthRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getItOauthResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(getKidCredentialsRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 50) {
                                    codedInputStream.readMessage(getKidCredentialsResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 130) {
                                    codedInputStream.readMessage(getUserTimerDetailsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                } else if (tag == 138) {
                                    codedInputStream.readMessage(getInitialSetupItemsCompletedNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                } else if (tag == 146) {
                                    codedInputStream.readMessage(getInitialSetupItemsBeginNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeInitialSetupItemsBeginNotification(InitialSetupItemsBeginNotification initialSetupItemsBeginNotification) {
                InitialSetupItemsBeginNotification initialSetupItemsBeginNotification2;
                SingleFieldBuilderV3<InitialSetupItemsBeginNotification, InitialSetupItemsBeginNotification.Builder, InitialSetupItemsBeginNotificationOrBuilder> singleFieldBuilderV3 = this.initialSetupItemsBeginNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(initialSetupItemsBeginNotification);
                } else if ((this.bitField0_ & 64) == 0 || (initialSetupItemsBeginNotification2 = this.initialSetupItemsBeginNotification_) == null || initialSetupItemsBeginNotification2 == InitialSetupItemsBeginNotification.getDefaultInstance()) {
                    this.initialSetupItemsBeginNotification_ = initialSetupItemsBeginNotification;
                } else {
                    getInitialSetupItemsBeginNotificationBuilder().mergeFrom(initialSetupItemsBeginNotification);
                }
                if (this.initialSetupItemsBeginNotification_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeInitialSetupItemsCompletedNotification(InitialSetupItemsCompletedNotification initialSetupItemsCompletedNotification) {
                InitialSetupItemsCompletedNotification initialSetupItemsCompletedNotification2;
                SingleFieldBuilderV3<InitialSetupItemsCompletedNotification, InitialSetupItemsCompletedNotification.Builder, InitialSetupItemsCompletedNotificationOrBuilder> singleFieldBuilderV3 = this.initialSetupItemsCompletedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(initialSetupItemsCompletedNotification);
                } else if ((this.bitField0_ & 32) == 0 || (initialSetupItemsCompletedNotification2 = this.initialSetupItemsCompletedNotification_) == null || initialSetupItemsCompletedNotification2 == InitialSetupItemsCompletedNotification.getDefaultInstance()) {
                    this.initialSetupItemsCompletedNotification_ = initialSetupItemsCompletedNotification;
                } else {
                    getInitialSetupItemsCompletedNotificationBuilder().mergeFrom(initialSetupItemsCompletedNotification);
                }
                if (this.initialSetupItemsCompletedNotification_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeItOauthRequest(ITOAuthCredentialsRequest iTOAuthCredentialsRequest) {
                ITOAuthCredentialsRequest iTOAuthCredentialsRequest2;
                SingleFieldBuilderV3<ITOAuthCredentialsRequest, ITOAuthCredentialsRequest.Builder, ITOAuthCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.itOauthRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(iTOAuthCredentialsRequest);
                } else if ((this.bitField0_ & 1) == 0 || (iTOAuthCredentialsRequest2 = this.itOauthRequest_) == null || iTOAuthCredentialsRequest2 == ITOAuthCredentialsRequest.getDefaultInstance()) {
                    this.itOauthRequest_ = iTOAuthCredentialsRequest;
                } else {
                    getItOauthRequestBuilder().mergeFrom(iTOAuthCredentialsRequest);
                }
                if (this.itOauthRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeItOauthResponse(ITOAuthCredentialsResponse iTOAuthCredentialsResponse) {
                ITOAuthCredentialsResponse iTOAuthCredentialsResponse2;
                SingleFieldBuilderV3<ITOAuthCredentialsResponse, ITOAuthCredentialsResponse.Builder, ITOAuthCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.itOauthResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(iTOAuthCredentialsResponse);
                } else if ((this.bitField0_ & 2) == 0 || (iTOAuthCredentialsResponse2 = this.itOauthResponse_) == null || iTOAuthCredentialsResponse2 == ITOAuthCredentialsResponse.getDefaultInstance()) {
                    this.itOauthResponse_ = iTOAuthCredentialsResponse;
                } else {
                    getItOauthResponseBuilder().mergeFrom(iTOAuthCredentialsResponse);
                }
                if (this.itOauthResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeKidCredentialsRequest(KidCredentialsRequest kidCredentialsRequest) {
                KidCredentialsRequest kidCredentialsRequest2;
                SingleFieldBuilderV3<KidCredentialsRequest, KidCredentialsRequest.Builder, KidCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.kidCredentialsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(kidCredentialsRequest);
                } else if ((this.bitField0_ & 4) == 0 || (kidCredentialsRequest2 = this.kidCredentialsRequest_) == null || kidCredentialsRequest2 == KidCredentialsRequest.getDefaultInstance()) {
                    this.kidCredentialsRequest_ = kidCredentialsRequest;
                } else {
                    getKidCredentialsRequestBuilder().mergeFrom(kidCredentialsRequest);
                }
                if (this.kidCredentialsRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeKidCredentialsResponse(KidCredentialsResponse kidCredentialsResponse) {
                KidCredentialsResponse kidCredentialsResponse2;
                SingleFieldBuilderV3<KidCredentialsResponse, KidCredentialsResponse.Builder, KidCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.kidCredentialsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(kidCredentialsResponse);
                } else if ((this.bitField0_ & 8) == 0 || (kidCredentialsResponse2 = this.kidCredentialsResponse_) == null || kidCredentialsResponse2 == KidCredentialsResponse.getDefaultInstance()) {
                    this.kidCredentialsResponse_ = kidCredentialsResponse;
                } else {
                    getKidCredentialsResponseBuilder().mergeFrom(kidCredentialsResponse);
                }
                if (this.kidCredentialsResponse_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder mergeUserTimerDetails(UserTimerDetailsNotification userTimerDetailsNotification) {
                UserTimerDetailsNotification userTimerDetailsNotification2;
                SingleFieldBuilderV3<UserTimerDetailsNotification, UserTimerDetailsNotification.Builder, UserTimerDetailsNotificationOrBuilder> singleFieldBuilderV3 = this.userTimerDetailsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(userTimerDetailsNotification);
                } else if ((this.bitField0_ & 16) == 0 || (userTimerDetailsNotification2 = this.userTimerDetails_) == null || userTimerDetailsNotification2 == UserTimerDetailsNotification.getDefaultInstance()) {
                    this.userTimerDetails_ = userTimerDetailsNotification;
                } else {
                    getUserTimerDetailsBuilder().mergeFrom(userTimerDetailsNotification);
                }
                if (this.userTimerDetails_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setInitialSetupItemsBeginNotification(InitialSetupItemsBeginNotification.Builder builder) {
                SingleFieldBuilderV3<InitialSetupItemsBeginNotification, InitialSetupItemsBeginNotification.Builder, InitialSetupItemsBeginNotificationOrBuilder> singleFieldBuilderV3 = this.initialSetupItemsBeginNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.initialSetupItemsBeginNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setInitialSetupItemsCompletedNotification(InitialSetupItemsCompletedNotification.Builder builder) {
                SingleFieldBuilderV3<InitialSetupItemsCompletedNotification, InitialSetupItemsCompletedNotification.Builder, InitialSetupItemsCompletedNotificationOrBuilder> singleFieldBuilderV3 = this.initialSetupItemsCompletedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.initialSetupItemsCompletedNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setItOauthRequest(ITOAuthCredentialsRequest.Builder builder) {
                SingleFieldBuilderV3<ITOAuthCredentialsRequest, ITOAuthCredentialsRequest.Builder, ITOAuthCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.itOauthRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.itOauthRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setItOauthResponse(ITOAuthCredentialsResponse.Builder builder) {
                SingleFieldBuilderV3<ITOAuthCredentialsResponse, ITOAuthCredentialsResponse.Builder, ITOAuthCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.itOauthResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.itOauthResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setKidCredentialsRequest(KidCredentialsRequest.Builder builder) {
                SingleFieldBuilderV3<KidCredentialsRequest, KidCredentialsRequest.Builder, KidCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.kidCredentialsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.kidCredentialsRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setKidCredentialsResponse(KidCredentialsResponse.Builder builder) {
                SingleFieldBuilderV3<KidCredentialsResponse, KidCredentialsResponse.Builder, KidCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.kidCredentialsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.kidCredentialsResponse_ = builder.build();
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

            public Builder setUserTimerDetails(UserTimerDetailsNotification.Builder builder) {
                SingleFieldBuilderV3<UserTimerDetailsNotification, UserTimerDetailsNotification.Builder, UserTimerDetailsNotificationOrBuilder> singleFieldBuilderV3 = this.userTimerDetailsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.userTimerDetails_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public KidDeviceService getDefaultInstanceForType() {
                return KidDeviceService.getDefaultInstance();
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

            public Builder setInitialSetupItemsBeginNotification(InitialSetupItemsBeginNotification initialSetupItemsBeginNotification) {
                SingleFieldBuilderV3<InitialSetupItemsBeginNotification, InitialSetupItemsBeginNotification.Builder, InitialSetupItemsBeginNotificationOrBuilder> singleFieldBuilderV3 = this.initialSetupItemsBeginNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    initialSetupItemsBeginNotification.getClass();
                    this.initialSetupItemsBeginNotification_ = initialSetupItemsBeginNotification;
                } else {
                    singleFieldBuilderV3.setMessage(initialSetupItemsBeginNotification);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setInitialSetupItemsCompletedNotification(InitialSetupItemsCompletedNotification initialSetupItemsCompletedNotification) {
                SingleFieldBuilderV3<InitialSetupItemsCompletedNotification, InitialSetupItemsCompletedNotification.Builder, InitialSetupItemsCompletedNotificationOrBuilder> singleFieldBuilderV3 = this.initialSetupItemsCompletedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    initialSetupItemsCompletedNotification.getClass();
                    this.initialSetupItemsCompletedNotification_ = initialSetupItemsCompletedNotification;
                } else {
                    singleFieldBuilderV3.setMessage(initialSetupItemsCompletedNotification);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setItOauthRequest(ITOAuthCredentialsRequest iTOAuthCredentialsRequest) {
                SingleFieldBuilderV3<ITOAuthCredentialsRequest, ITOAuthCredentialsRequest.Builder, ITOAuthCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.itOauthRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    iTOAuthCredentialsRequest.getClass();
                    this.itOauthRequest_ = iTOAuthCredentialsRequest;
                } else {
                    singleFieldBuilderV3.setMessage(iTOAuthCredentialsRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setItOauthResponse(ITOAuthCredentialsResponse iTOAuthCredentialsResponse) {
                SingleFieldBuilderV3<ITOAuthCredentialsResponse, ITOAuthCredentialsResponse.Builder, ITOAuthCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.itOauthResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    iTOAuthCredentialsResponse.getClass();
                    this.itOauthResponse_ = iTOAuthCredentialsResponse;
                } else {
                    singleFieldBuilderV3.setMessage(iTOAuthCredentialsResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setKidCredentialsRequest(KidCredentialsRequest kidCredentialsRequest) {
                SingleFieldBuilderV3<KidCredentialsRequest, KidCredentialsRequest.Builder, KidCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.kidCredentialsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    kidCredentialsRequest.getClass();
                    this.kidCredentialsRequest_ = kidCredentialsRequest;
                } else {
                    singleFieldBuilderV3.setMessage(kidCredentialsRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setKidCredentialsResponse(KidCredentialsResponse kidCredentialsResponse) {
                SingleFieldBuilderV3<KidCredentialsResponse, KidCredentialsResponse.Builder, KidCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.kidCredentialsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    kidCredentialsResponse.getClass();
                    this.kidCredentialsResponse_ = kidCredentialsResponse;
                } else {
                    singleFieldBuilderV3.setMessage(kidCredentialsResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setUserTimerDetails(UserTimerDetailsNotification userTimerDetailsNotification) {
                SingleFieldBuilderV3<UserTimerDetailsNotification, UserTimerDetailsNotification.Builder, UserTimerDetailsNotificationOrBuilder> singleFieldBuilderV3 = this.userTimerDetailsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    userTimerDetailsNotification.getClass();
                    this.userTimerDetails_ = userTimerDetailsNotification;
                } else {
                    singleFieldBuilderV3.setMessage(userTimerDetailsNotification);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof KidDeviceService) {
                    return mergeFrom((KidDeviceService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(KidDeviceService kidDeviceService) {
                if (kidDeviceService == KidDeviceService.getDefaultInstance()) {
                    return this;
                }
                if (kidDeviceService.hasItOauthRequest()) {
                    mergeItOauthRequest(kidDeviceService.getItOauthRequest());
                }
                if (kidDeviceService.hasItOauthResponse()) {
                    mergeItOauthResponse(kidDeviceService.getItOauthResponse());
                }
                if (kidDeviceService.hasKidCredentialsRequest()) {
                    mergeKidCredentialsRequest(kidDeviceService.getKidCredentialsRequest());
                }
                if (kidDeviceService.hasKidCredentialsResponse()) {
                    mergeKidCredentialsResponse(kidDeviceService.getKidCredentialsResponse());
                }
                if (kidDeviceService.hasUserTimerDetails()) {
                    mergeUserTimerDetails(kidDeviceService.getUserTimerDetails());
                }
                if (kidDeviceService.hasInitialSetupItemsCompletedNotification()) {
                    mergeInitialSetupItemsCompletedNotification(kidDeviceService.getInitialSetupItemsCompletedNotification());
                }
                if (kidDeviceService.hasInitialSetupItemsBeginNotification()) {
                    mergeInitialSetupItemsBeginNotification(kidDeviceService.getInitialSetupItemsBeginNotification());
                }
                mergeUnknownFields(kidDeviceService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public KidDeviceService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ KidDeviceService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private KidDeviceService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static KidDeviceService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (KidDeviceService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static KidDeviceService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static KidDeviceService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static KidDeviceService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static KidDeviceService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static KidDeviceService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static KidDeviceService parseFrom(InputStream inputStream) {
            return (KidDeviceService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static KidDeviceService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (KidDeviceService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static KidDeviceService parseFrom(CodedInputStream codedInputStream) {
            return (KidDeviceService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static KidDeviceService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (KidDeviceService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OAuth2Credentials extends GeneratedMessageV3 implements OAuth2CredentialsOrBuilder {
        public static final int ACCESS_TOKEN_FIELD_NUMBER = 1;
        public static final int CUSTOMER_ID_FIELD_NUMBER = 7;
        public static final int EXPIRES_IN_FIELD_NUMBER = 4;
        public static final int REFRESH_TOKEN_EXPIRES_IN_FIELD_NUMBER = 6;
        public static final int REFRESH_TOKEN_FIELD_NUMBER = 3;
        public static final int SCOPE_FIELD_NUMBER = 5;
        public static final int TOKEN_TYPE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private volatile Object accessToken_;
        private int bitField0_;
        private volatile Object customerId_;
        private int expiresIn_;
        private byte memoizedIsInitialized;
        private volatile Object refreshTokenExpiresIn_;
        private volatile Object refreshToken_;
        private volatile Object scope_;
        private volatile Object tokenType_;
        private static final OAuth2Credentials DEFAULT_INSTANCE = new OAuth2Credentials();

        @Deprecated
        public static final Parser<OAuth2Credentials> PARSER = new AbstractParser<OAuth2Credentials>() { // from class: com.garmin.proto.generated.GDIKidDevice.OAuth2Credentials.1
            @Override // com.google.protobuf.Parser
            public OAuth2Credentials parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = OAuth2Credentials.newBuilder();
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

        private OAuth2Credentials() {
            this.accessToken_ = "";
            this.tokenType_ = "";
            this.refreshToken_ = "";
            this.expiresIn_ = 0;
            this.scope_ = "";
            this.refreshTokenExpiresIn_ = "";
            this.customerId_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.accessToken_ = "";
            this.tokenType_ = "";
            this.refreshToken_ = "";
            this.scope_ = "";
            this.refreshTokenExpiresIn_ = "";
            this.customerId_ = "";
        }

        public static OAuth2Credentials getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIKidDevice.internal_static_GDI_Proto_KidDevice_OAuth2Credentials_descriptor;
        }

        public static Builder newBuilder(OAuth2Credentials oAuth2Credentials) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(oAuth2Credentials);
        }

        public static OAuth2Credentials parseDelimitedFrom(InputStream inputStream) {
            return (OAuth2Credentials) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static OAuth2Credentials parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<OAuth2Credentials> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OAuth2Credentials)) {
                return super.equals(obj);
            }
            OAuth2Credentials oAuth2Credentials = (OAuth2Credentials) obj;
            if (hasAccessToken() != oAuth2Credentials.hasAccessToken()) {
                return false;
            }
            if ((hasAccessToken() && !getAccessToken().equals(oAuth2Credentials.getAccessToken())) || hasTokenType() != oAuth2Credentials.hasTokenType()) {
                return false;
            }
            if ((hasTokenType() && !getTokenType().equals(oAuth2Credentials.getTokenType())) || hasRefreshToken() != oAuth2Credentials.hasRefreshToken()) {
                return false;
            }
            if ((hasRefreshToken() && !getRefreshToken().equals(oAuth2Credentials.getRefreshToken())) || hasExpiresIn() != oAuth2Credentials.hasExpiresIn()) {
                return false;
            }
            if ((hasExpiresIn() && getExpiresIn() != oAuth2Credentials.getExpiresIn()) || hasScope() != oAuth2Credentials.hasScope()) {
                return false;
            }
            if ((hasScope() && !getScope().equals(oAuth2Credentials.getScope())) || hasRefreshTokenExpiresIn() != oAuth2Credentials.hasRefreshTokenExpiresIn()) {
                return false;
            }
            if ((!hasRefreshTokenExpiresIn() || getRefreshTokenExpiresIn().equals(oAuth2Credentials.getRefreshTokenExpiresIn())) && hasCustomerId() == oAuth2Credentials.hasCustomerId()) {
                return (!hasCustomerId() || getCustomerId().equals(oAuth2Credentials.getCustomerId())) && getUnknownFields().equals(oAuth2Credentials.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
        public String getAccessToken() {
            Object obj = this.accessToken_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.accessToken_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
        public ByteString getAccessTokenBytes() {
            Object obj = this.accessToken_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.accessToken_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
        public String getCustomerId() {
            Object obj = this.customerId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.customerId_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
        public ByteString getCustomerIdBytes() {
            Object obj = this.customerId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.customerId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
        public int getExpiresIn() {
            return this.expiresIn_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<OAuth2Credentials> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
        public String getRefreshToken() {
            Object obj = this.refreshToken_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.refreshToken_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
        public ByteString getRefreshTokenBytes() {
            Object obj = this.refreshToken_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.refreshToken_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
        public String getRefreshTokenExpiresIn() {
            Object obj = this.refreshTokenExpiresIn_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.refreshTokenExpiresIn_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
        public ByteString getRefreshTokenExpiresInBytes() {
            Object obj = this.refreshTokenExpiresIn_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.refreshTokenExpiresIn_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
        public String getScope() {
            Object obj = this.scope_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.scope_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
        public ByteString getScopeBytes() {
            Object obj = this.scope_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.scope_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.accessToken_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.tokenType_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.refreshToken_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(4, this.expiresIn_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(5, this.scope_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(6, this.refreshTokenExpiresIn_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(7, this.customerId_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
        public String getTokenType() {
            Object obj = this.tokenType_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.tokenType_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
        public ByteString getTokenTypeBytes() {
            Object obj = this.tokenType_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.tokenType_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
        public boolean hasAccessToken() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
        public boolean hasCustomerId() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
        public boolean hasExpiresIn() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
        public boolean hasRefreshToken() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
        public boolean hasRefreshTokenExpiresIn() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
        public boolean hasScope() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
        public boolean hasTokenType() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasAccessToken()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getAccessToken().hashCode();
            }
            if (hasTokenType()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getTokenType().hashCode();
            }
            if (hasRefreshToken()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getRefreshToken().hashCode();
            }
            if (hasExpiresIn()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getExpiresIn();
            }
            if (hasScope()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getScope().hashCode();
            }
            if (hasRefreshTokenExpiresIn()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getRefreshTokenExpiresIn().hashCode();
            }
            if (hasCustomerId()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getCustomerId().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIKidDevice.internal_static_GDI_Proto_KidDevice_OAuth2Credentials_fieldAccessorTable.ensureFieldAccessorsInitialized(OAuth2Credentials.class, Builder.class);
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
            if (!hasAccessToken()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasTokenType()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasRefreshToken()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasExpiresIn()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasScope()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasRefreshTokenExpiresIn()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasCustomerId()) {
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
            return new OAuth2Credentials();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.accessToken_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.tokenType_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.refreshToken_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.expiresIn_);
            }
            if ((this.bitField0_ & 16) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 5, this.scope_);
            }
            if ((this.bitField0_ & 32) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 6, this.refreshTokenExpiresIn_);
            }
            if ((this.bitField0_ & 64) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 7, this.customerId_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements OAuth2CredentialsOrBuilder {
            private Object accessToken_;
            private int bitField0_;
            private Object customerId_;
            private int expiresIn_;
            private Object refreshTokenExpiresIn_;
            private Object refreshToken_;
            private Object scope_;
            private Object tokenType_;

            private Builder() {
                this.accessToken_ = "";
                this.tokenType_ = "";
                this.refreshToken_ = "";
                this.scope_ = "";
                this.refreshTokenExpiresIn_ = "";
                this.customerId_ = "";
            }

            private void buildPartial0(OAuth2Credentials oAuth2Credentials) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    oAuth2Credentials.accessToken_ = this.accessToken_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    oAuth2Credentials.tokenType_ = this.tokenType_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    oAuth2Credentials.refreshToken_ = this.refreshToken_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    oAuth2Credentials.expiresIn_ = this.expiresIn_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    oAuth2Credentials.scope_ = this.scope_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    oAuth2Credentials.refreshTokenExpiresIn_ = this.refreshTokenExpiresIn_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    oAuth2Credentials.customerId_ = this.customerId_;
                    i14 |= 64;
                }
                oAuth2Credentials.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIKidDevice.internal_static_GDI_Proto_KidDevice_OAuth2Credentials_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public OAuth2Credentials build() {
                OAuth2Credentials oAuth2CredentialsBuildPartial = buildPartial();
                if (oAuth2CredentialsBuildPartial.isInitialized()) {
                    return oAuth2CredentialsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) oAuth2CredentialsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public OAuth2Credentials buildPartial() {
                OAuth2Credentials oAuth2Credentials = new OAuth2Credentials(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(oAuth2Credentials);
                }
                onBuilt();
                return oAuth2Credentials;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.accessToken_ = "";
                this.tokenType_ = "";
                this.refreshToken_ = "";
                this.expiresIn_ = 0;
                this.scope_ = "";
                this.refreshTokenExpiresIn_ = "";
                this.customerId_ = "";
                return this;
            }

            public Builder clearAccessToken() {
                this.accessToken_ = OAuth2Credentials.getDefaultInstance().getAccessToken();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearCustomerId() {
                this.customerId_ = OAuth2Credentials.getDefaultInstance().getCustomerId();
                this.bitField0_ &= -65;
                onChanged();
                return this;
            }

            public Builder clearExpiresIn() {
                this.bitField0_ &= -9;
                this.expiresIn_ = 0;
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

            public Builder clearRefreshToken() {
                this.refreshToken_ = OAuth2Credentials.getDefaultInstance().getRefreshToken();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearRefreshTokenExpiresIn() {
                this.refreshTokenExpiresIn_ = OAuth2Credentials.getDefaultInstance().getRefreshTokenExpiresIn();
                this.bitField0_ &= -33;
                onChanged();
                return this;
            }

            public Builder clearScope() {
                this.scope_ = OAuth2Credentials.getDefaultInstance().getScope();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder clearTokenType() {
                this.tokenType_ = OAuth2Credentials.getDefaultInstance().getTokenType();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
            public String getAccessToken() {
                Object obj = this.accessToken_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.accessToken_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
            public ByteString getAccessTokenBytes() {
                Object obj = this.accessToken_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.accessToken_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
            public String getCustomerId() {
                Object obj = this.customerId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.customerId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
            public ByteString getCustomerIdBytes() {
                Object obj = this.customerId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.customerId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIKidDevice.internal_static_GDI_Proto_KidDevice_OAuth2Credentials_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
            public int getExpiresIn() {
                return this.expiresIn_;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
            public String getRefreshToken() {
                Object obj = this.refreshToken_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.refreshToken_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
            public ByteString getRefreshTokenBytes() {
                Object obj = this.refreshToken_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.refreshToken_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
            public String getRefreshTokenExpiresIn() {
                Object obj = this.refreshTokenExpiresIn_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.refreshTokenExpiresIn_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
            public ByteString getRefreshTokenExpiresInBytes() {
                Object obj = this.refreshTokenExpiresIn_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.refreshTokenExpiresIn_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
            public String getScope() {
                Object obj = this.scope_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.scope_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
            public ByteString getScopeBytes() {
                Object obj = this.scope_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.scope_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
            public String getTokenType() {
                Object obj = this.tokenType_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.tokenType_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
            public ByteString getTokenTypeBytes() {
                Object obj = this.tokenType_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.tokenType_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
            public boolean hasAccessToken() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
            public boolean hasCustomerId() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
            public boolean hasExpiresIn() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
            public boolean hasRefreshToken() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
            public boolean hasRefreshTokenExpiresIn() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
            public boolean hasScope() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.OAuth2CredentialsOrBuilder
            public boolean hasTokenType() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIKidDevice.internal_static_GDI_Proto_KidDevice_OAuth2Credentials_fieldAccessorTable.ensureFieldAccessorsInitialized(OAuth2Credentials.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasAccessToken() && hasTokenType() && hasRefreshToken() && hasExpiresIn() && hasScope() && hasRefreshTokenExpiresIn() && hasCustomerId();
            }

            public Builder mergeFrom(OAuth2Credentials oAuth2Credentials) {
                if (oAuth2Credentials == OAuth2Credentials.getDefaultInstance()) {
                    return this;
                }
                if (oAuth2Credentials.hasAccessToken()) {
                    this.accessToken_ = oAuth2Credentials.accessToken_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (oAuth2Credentials.hasTokenType()) {
                    this.tokenType_ = oAuth2Credentials.tokenType_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (oAuth2Credentials.hasRefreshToken()) {
                    this.refreshToken_ = oAuth2Credentials.refreshToken_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (oAuth2Credentials.hasExpiresIn()) {
                    setExpiresIn(oAuth2Credentials.getExpiresIn());
                }
                if (oAuth2Credentials.hasScope()) {
                    this.scope_ = oAuth2Credentials.scope_;
                    this.bitField0_ |= 16;
                    onChanged();
                }
                if (oAuth2Credentials.hasRefreshTokenExpiresIn()) {
                    this.refreshTokenExpiresIn_ = oAuth2Credentials.refreshTokenExpiresIn_;
                    this.bitField0_ |= 32;
                    onChanged();
                }
                if (oAuth2Credentials.hasCustomerId()) {
                    this.customerId_ = oAuth2Credentials.customerId_;
                    this.bitField0_ |= 64;
                    onChanged();
                }
                mergeUnknownFields(oAuth2Credentials.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setAccessToken(String str) {
                str.getClass();
                this.accessToken_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setAccessTokenBytes(ByteString byteString) {
                byteString.getClass();
                this.accessToken_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setCustomerId(String str) {
                str.getClass();
                this.customerId_ = str;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setCustomerIdBytes(ByteString byteString) {
                byteString.getClass();
                this.customerId_ = byteString;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setExpiresIn(int i14) {
                this.expiresIn_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setRefreshToken(String str) {
                str.getClass();
                this.refreshToken_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setRefreshTokenBytes(ByteString byteString) {
                byteString.getClass();
                this.refreshToken_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setRefreshTokenExpiresIn(String str) {
                str.getClass();
                this.refreshTokenExpiresIn_ = str;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setRefreshTokenExpiresInBytes(ByteString byteString) {
                byteString.getClass();
                this.refreshTokenExpiresIn_ = byteString;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setScope(String str) {
                str.getClass();
                this.scope_ = str;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setScopeBytes(ByteString byteString) {
                byteString.getClass();
                this.scope_ = byteString;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setTokenType(String str) {
                str.getClass();
                this.tokenType_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTokenTypeBytes(ByteString byteString) {
                byteString.getClass();
                this.tokenType_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public OAuth2Credentials getDefaultInstanceForType() {
                return OAuth2Credentials.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.accessToken_ = "";
                this.tokenType_ = "";
                this.refreshToken_ = "";
                this.scope_ = "";
                this.refreshTokenExpiresIn_ = "";
                this.customerId_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof OAuth2Credentials) {
                    return mergeFrom((OAuth2Credentials) message);
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
                                    this.accessToken_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.tokenType_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.refreshToken_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.expiresIn_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    this.scope_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 16;
                                } else if (tag == 50) {
                                    this.refreshTokenExpiresIn_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 32;
                                } else if (tag != 58) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.customerId_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 64;
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
        public OAuth2Credentials getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static OAuth2Credentials parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuth2Credentials) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static OAuth2Credentials parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static OAuth2Credentials parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static OAuth2Credentials parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static OAuth2Credentials parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static OAuth2Credentials parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static OAuth2Credentials parseFrom(InputStream inputStream) {
            return (OAuth2Credentials) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static OAuth2Credentials parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuth2Credentials) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static OAuth2Credentials parseFrom(CodedInputStream codedInputStream) {
            return (OAuth2Credentials) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static OAuth2Credentials parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuth2Credentials) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private OAuth2Credentials(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.accessToken_ = "";
            this.tokenType_ = "";
            this.refreshToken_ = "";
            this.expiresIn_ = 0;
            this.scope_ = "";
            this.refreshTokenExpiresIn_ = "";
            this.customerId_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ OAuth2Credentials(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class UserTimerDetailsNotification extends GeneratedMessageV3 implements UserTimerDetailsNotificationOrBuilder {
        public static final int CURRENT_TIMESTAMP_FIELD_NUMBER = 1;
        private static final UserTimerDetailsNotification DEFAULT_INSTANCE = new UserTimerDetailsNotification();

        @Deprecated
        public static final Parser<UserTimerDetailsNotification> PARSER = new AbstractParser<UserTimerDetailsNotification>() { // from class: com.garmin.proto.generated.GDIKidDevice.UserTimerDetailsNotification.1
            @Override // com.google.protobuf.Parser
            public UserTimerDetailsNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = UserTimerDetailsNotification.newBuilder();
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
        public static final int TIMER_ACTION_FIELD_NUMBER = 3;
        public static final int TIMER_DURATION_SECONDS_FIELD_NUMBER = 2;
        public static final int TIMER_TYPE_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int currentTimestamp_;
        private byte memoizedIsInitialized;
        private int timerAction_;
        private int timerDurationSeconds_;
        private int timerType_;

        private UserTimerDetailsNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.currentTimestamp_ = 0;
            this.timerDurationSeconds_ = 0;
            this.timerAction_ = 0;
            this.timerType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UserTimerDetailsNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIKidDevice.internal_static_GDI_Proto_KidDevice_UserTimerDetailsNotification_descriptor;
        }

        public static Builder newBuilder(UserTimerDetailsNotification userTimerDetailsNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(userTimerDetailsNotification);
        }

        public static UserTimerDetailsNotification parseDelimitedFrom(InputStream inputStream) {
            return (UserTimerDetailsNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UserTimerDetailsNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<UserTimerDetailsNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UserTimerDetailsNotification)) {
                return super.equals(obj);
            }
            UserTimerDetailsNotification userTimerDetailsNotification = (UserTimerDetailsNotification) obj;
            if (hasCurrentTimestamp() != userTimerDetailsNotification.hasCurrentTimestamp()) {
                return false;
            }
            if ((hasCurrentTimestamp() && getCurrentTimestamp() != userTimerDetailsNotification.getCurrentTimestamp()) || hasTimerDurationSeconds() != userTimerDetailsNotification.hasTimerDurationSeconds()) {
                return false;
            }
            if ((hasTimerDurationSeconds() && getTimerDurationSeconds() != userTimerDetailsNotification.getTimerDurationSeconds()) || hasTimerAction() != userTimerDetailsNotification.hasTimerAction()) {
                return false;
            }
            if ((!hasTimerAction() || this.timerAction_ == userTimerDetailsNotification.timerAction_) && hasTimerType() == userTimerDetailsNotification.hasTimerType()) {
                return (!hasTimerType() || this.timerType_ == userTimerDetailsNotification.timerType_) && getUnknownFields().equals(userTimerDetailsNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.UserTimerDetailsNotificationOrBuilder
        public int getCurrentTimestamp() {
            return this.currentTimestamp_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<UserTimerDetailsNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.currentTimestamp_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.timerDurationSeconds_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(3, this.timerAction_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(4, this.timerType_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.UserTimerDetailsNotificationOrBuilder
        public TimerAction getTimerAction() {
            TimerAction timerActionForNumber = TimerAction.forNumber(this.timerAction_);
            return timerActionForNumber == null ? TimerAction.STARTED : timerActionForNumber;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.UserTimerDetailsNotificationOrBuilder
        public int getTimerDurationSeconds() {
            return this.timerDurationSeconds_;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.UserTimerDetailsNotificationOrBuilder
        public TimerType getTimerType() {
            TimerType timerTypeForNumber = TimerType.forNumber(this.timerType_);
            return timerTypeForNumber == null ? TimerType.TOOTHBRUSH : timerTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.UserTimerDetailsNotificationOrBuilder
        public boolean hasCurrentTimestamp() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.UserTimerDetailsNotificationOrBuilder
        public boolean hasTimerAction() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.UserTimerDetailsNotificationOrBuilder
        public boolean hasTimerDurationSeconds() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIKidDevice.UserTimerDetailsNotificationOrBuilder
        public boolean hasTimerType() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCurrentTimestamp()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getCurrentTimestamp();
            }
            if (hasTimerDurationSeconds()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getTimerDurationSeconds();
            }
            if (hasTimerAction()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + this.timerAction_;
            }
            if (hasTimerType()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + this.timerType_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIKidDevice.internal_static_GDI_Proto_KidDevice_UserTimerDetailsNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(UserTimerDetailsNotification.class, Builder.class);
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
            return new UserTimerDetailsNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.currentTimestamp_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.timerDurationSeconds_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(3, this.timerAction_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeEnum(4, this.timerType_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UserTimerDetailsNotificationOrBuilder {
            private int bitField0_;
            private int currentTimestamp_;
            private int timerAction_;
            private int timerDurationSeconds_;
            private int timerType_;

            private Builder() {
                this.timerAction_ = 0;
                this.timerType_ = 0;
            }

            private void buildPartial0(UserTimerDetailsNotification userTimerDetailsNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    userTimerDetailsNotification.currentTimestamp_ = this.currentTimestamp_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    userTimerDetailsNotification.timerDurationSeconds_ = this.timerDurationSeconds_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    userTimerDetailsNotification.timerAction_ = this.timerAction_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    userTimerDetailsNotification.timerType_ = this.timerType_;
                    i14 |= 8;
                }
                userTimerDetailsNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIKidDevice.internal_static_GDI_Proto_KidDevice_UserTimerDetailsNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UserTimerDetailsNotification build() {
                UserTimerDetailsNotification userTimerDetailsNotificationBuildPartial = buildPartial();
                if (userTimerDetailsNotificationBuildPartial.isInitialized()) {
                    return userTimerDetailsNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) userTimerDetailsNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UserTimerDetailsNotification buildPartial() {
                UserTimerDetailsNotification userTimerDetailsNotification = new UserTimerDetailsNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(userTimerDetailsNotification);
                }
                onBuilt();
                return userTimerDetailsNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.currentTimestamp_ = 0;
                this.timerDurationSeconds_ = 0;
                this.timerAction_ = 0;
                this.timerType_ = 0;
                return this;
            }

            public Builder clearCurrentTimestamp() {
                this.bitField0_ &= -2;
                this.currentTimestamp_ = 0;
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

            public Builder clearTimerAction() {
                this.bitField0_ &= -5;
                this.timerAction_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTimerDurationSeconds() {
                this.bitField0_ &= -3;
                this.timerDurationSeconds_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTimerType() {
                this.bitField0_ &= -9;
                this.timerType_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.UserTimerDetailsNotificationOrBuilder
            public int getCurrentTimestamp() {
                return this.currentTimestamp_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIKidDevice.internal_static_GDI_Proto_KidDevice_UserTimerDetailsNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.UserTimerDetailsNotificationOrBuilder
            public TimerAction getTimerAction() {
                TimerAction timerActionForNumber = TimerAction.forNumber(this.timerAction_);
                return timerActionForNumber == null ? TimerAction.STARTED : timerActionForNumber;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.UserTimerDetailsNotificationOrBuilder
            public int getTimerDurationSeconds() {
                return this.timerDurationSeconds_;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.UserTimerDetailsNotificationOrBuilder
            public TimerType getTimerType() {
                TimerType timerTypeForNumber = TimerType.forNumber(this.timerType_);
                return timerTypeForNumber == null ? TimerType.TOOTHBRUSH : timerTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.UserTimerDetailsNotificationOrBuilder
            public boolean hasCurrentTimestamp() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.UserTimerDetailsNotificationOrBuilder
            public boolean hasTimerAction() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.UserTimerDetailsNotificationOrBuilder
            public boolean hasTimerDurationSeconds() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIKidDevice.UserTimerDetailsNotificationOrBuilder
            public boolean hasTimerType() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIKidDevice.internal_static_GDI_Proto_KidDevice_UserTimerDetailsNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(UserTimerDetailsNotification.class, Builder.class);
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
                                    this.currentTimestamp_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.timerDurationSeconds_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    int i14 = codedInputStream.readEnum();
                                    if (TimerAction.forNumber(i14) == null) {
                                        mergeUnknownVarintField(3, i14);
                                    } else {
                                        this.timerAction_ = i14;
                                        this.bitField0_ |= 4;
                                    }
                                } else if (tag == 32) {
                                    int i15 = codedInputStream.readEnum();
                                    if (TimerType.forNumber(i15) == null) {
                                        mergeUnknownVarintField(4, i15);
                                    } else {
                                        this.timerType_ = i15;
                                        this.bitField0_ |= 8;
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

            public Builder setCurrentTimestamp(int i14) {
                this.currentTimestamp_ = i14;
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

            public Builder setTimerAction(TimerAction timerAction) {
                timerAction.getClass();
                this.bitField0_ |= 4;
                this.timerAction_ = timerAction.getNumber();
                onChanged();
                return this;
            }

            public Builder setTimerDurationSeconds(int i14) {
                this.timerDurationSeconds_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTimerType(TimerType timerType) {
                timerType.getClass();
                this.bitField0_ |= 8;
                this.timerType_ = timerType.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public UserTimerDetailsNotification getDefaultInstanceForType() {
                return UserTimerDetailsNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.timerAction_ = 0;
                this.timerType_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof UserTimerDetailsNotification) {
                    return mergeFrom((UserTimerDetailsNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(UserTimerDetailsNotification userTimerDetailsNotification) {
                if (userTimerDetailsNotification == UserTimerDetailsNotification.getDefaultInstance()) {
                    return this;
                }
                if (userTimerDetailsNotification.hasCurrentTimestamp()) {
                    setCurrentTimestamp(userTimerDetailsNotification.getCurrentTimestamp());
                }
                if (userTimerDetailsNotification.hasTimerDurationSeconds()) {
                    setTimerDurationSeconds(userTimerDetailsNotification.getTimerDurationSeconds());
                }
                if (userTimerDetailsNotification.hasTimerAction()) {
                    setTimerAction(userTimerDetailsNotification.getTimerAction());
                }
                if (userTimerDetailsNotification.hasTimerType()) {
                    setTimerType(userTimerDetailsNotification.getTimerType());
                }
                mergeUnknownFields(userTimerDetailsNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UserTimerDetailsNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static UserTimerDetailsNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserTimerDetailsNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UserTimerDetailsNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static UserTimerDetailsNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UserTimerDetailsNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UserTimerDetailsNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static UserTimerDetailsNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UserTimerDetailsNotification parseFrom(InputStream inputStream) {
            return (UserTimerDetailsNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ UserTimerDetailsNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static UserTimerDetailsNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserTimerDetailsNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private UserTimerDetailsNotification() {
            this.currentTimestamp_ = 0;
            this.timerDurationSeconds_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.timerAction_ = 0;
            this.timerType_ = 0;
        }

        public static UserTimerDetailsNotification parseFrom(CodedInputStream codedInputStream) {
            return (UserTimerDetailsNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static UserTimerDetailsNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UserTimerDetailsNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum TimerAction implements ProtocolMessageEnum {
            STARTED(0),
            STOPPED(1),
            PAUSED(2),
            RESUMED(3),
            RESET(4),
            CANCELED(5);

            public static final int CANCELED_VALUE = 5;
            public static final int PAUSED_VALUE = 2;
            public static final int RESET_VALUE = 4;
            public static final int RESUMED_VALUE = 3;
            public static final int STARTED_VALUE = 0;
            public static final int STOPPED_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<TimerAction> internalValueMap = new Internal.EnumLiteMap<TimerAction>() { // from class: com.garmin.proto.generated.GDIKidDevice.UserTimerDetailsNotification.TimerAction.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public TimerAction findValueByNumber(int i14) {
                    return TimerAction.forNumber(i14);
                }
            };
            private static final TimerAction[] VALUES = values();

            TimerAction(int i14) {
                this.value = i14;
            }

            public static TimerAction forNumber(int i14) {
                if (i14 == 0) {
                    return STARTED;
                }
                if (i14 == 1) {
                    return STOPPED;
                }
                if (i14 == 2) {
                    return PAUSED;
                }
                if (i14 == 3) {
                    return RESUMED;
                }
                if (i14 == 4) {
                    return RESET;
                }
                if (i14 != 5) {
                    return null;
                }
                return CANCELED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return UserTimerDetailsNotification.getDescriptor().getEnumTypes().get(1);
            }

            public static Internal.EnumLiteMap<TimerAction> internalGetValueMap() {
                return internalValueMap;
            }

            public static TimerAction valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static TimerAction valueOf(int i14) {
                return forNumber(i14);
            }
        }

        public enum TimerType implements ProtocolMessageEnum {
            TOOTHBRUSH(0),
            PRACTICE(1),
            SCREENTIME(2),
            EATING(3),
            PENCIL(4),
            TOYTRAIN(5),
            GENERIC(6);

            public static final int EATING_VALUE = 3;
            public static final int GENERIC_VALUE = 6;
            public static final int PENCIL_VALUE = 4;
            public static final int PRACTICE_VALUE = 1;
            public static final int SCREENTIME_VALUE = 2;
            public static final int TOOTHBRUSH_VALUE = 0;
            public static final int TOYTRAIN_VALUE = 5;
            private final int value;
            private static final Internal.EnumLiteMap<TimerType> internalValueMap = new Internal.EnumLiteMap<TimerType>() { // from class: com.garmin.proto.generated.GDIKidDevice.UserTimerDetailsNotification.TimerType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public TimerType findValueByNumber(int i14) {
                    return TimerType.forNumber(i14);
                }
            };
            private static final TimerType[] VALUES = values();

            TimerType(int i14) {
                this.value = i14;
            }

            public static TimerType forNumber(int i14) {
                switch (i14) {
                    case 0:
                        return TOOTHBRUSH;
                    case 1:
                        return PRACTICE;
                    case 2:
                        return SCREENTIME;
                    case 3:
                        return EATING;
                    case 4:
                        return PENCIL;
                    case 5:
                        return TOYTRAIN;
                    case 6:
                        return GENERIC;
                    default:
                        return null;
                }
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return UserTimerDetailsNotification.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<TimerType> internalGetValueMap() {
                return internalValueMap;
            }

            public static TimerType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static TimerType valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public enum GCSLocation implements ProtocolMessageEnum {
        PRODUCTION(0),
        CHINA(1),
        TEST(2),
        STAGE(3);

        public static final int CHINA_VALUE = 1;
        public static final int PRODUCTION_VALUE = 0;
        public static final int STAGE_VALUE = 3;
        public static final int TEST_VALUE = 2;
        private final int value;
        private static final Internal.EnumLiteMap<GCSLocation> internalValueMap = new Internal.EnumLiteMap<GCSLocation>() { // from class: com.garmin.proto.generated.GDIKidDevice.GCSLocation.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public GCSLocation findValueByNumber(int i14) {
                return GCSLocation.forNumber(i14);
            }
        };
        private static final GCSLocation[] VALUES = values();

        GCSLocation(int i14) {
            this.value = i14;
        }

        public static GCSLocation forNumber(int i14) {
            if (i14 == 0) {
                return PRODUCTION;
            }
            if (i14 == 1) {
                return CHINA;
            }
            if (i14 == 2) {
                return TEST;
            }
            if (i14 != 3) {
                return null;
            }
            return STAGE;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIKidDevice.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<GCSLocation> internalGetValueMap() {
            return internalValueMap;
        }

        public static GCSLocation valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static GCSLocation valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum InitialSetupItem implements ProtocolMessageEnum {
        CONTACTS(0),
        GEOFENCES(1),
        PRESET_TEXT_MESSAGES(2),
        CHORES(3),
        LEADERBOARD(4);

        public static final int CHORES_VALUE = 3;
        public static final int CONTACTS_VALUE = 0;
        public static final int GEOFENCES_VALUE = 1;
        public static final int LEADERBOARD_VALUE = 4;
        public static final int PRESET_TEXT_MESSAGES_VALUE = 2;
        private final int value;
        private static final Internal.EnumLiteMap<InitialSetupItem> internalValueMap = new Internal.EnumLiteMap<InitialSetupItem>() { // from class: com.garmin.proto.generated.GDIKidDevice.InitialSetupItem.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public InitialSetupItem findValueByNumber(int i14) {
                return InitialSetupItem.forNumber(i14);
            }
        };
        private static final InitialSetupItem[] VALUES = values();

        InitialSetupItem(int i14) {
            this.value = i14;
        }

        public static InitialSetupItem forNumber(int i14) {
            if (i14 == 0) {
                return CONTACTS;
            }
            if (i14 == 1) {
                return GEOFENCES;
            }
            if (i14 == 2) {
                return PRESET_TEXT_MESSAGES;
            }
            if (i14 == 3) {
                return CHORES;
            }
            if (i14 != 4) {
                return null;
            }
            return LEADERBOARD;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIKidDevice.getDescriptor().getEnumTypes().get(1);
        }

        public static Internal.EnumLiteMap<InitialSetupItem> internalGetValueMap() {
            return internalValueMap;
        }

        public static InitialSetupItem valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static InitialSetupItem valueOf(int i14) {
            return forNumber(i14);
        }
    }
}
