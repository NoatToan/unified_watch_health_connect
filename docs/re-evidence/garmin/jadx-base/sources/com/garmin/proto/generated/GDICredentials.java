package com.garmin.proto.generated;

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
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ProtocolStringList;
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

/* JADX INFO: loaded from: classes4.dex */
public final class GDICredentials {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0014GDICredentials.proto\u0012\u0015GDI.Proto.Credentials\u001a\rGDICore.proto\"l\n\u0010OAuthCredentials\u0012\u0014\n\fconsumer_key\u0018\u0001 \u0002(\t\u0012\u0017\n\u000fconsumer_secret\u0018\u0002 \u0002(\t\u0012\u0013\n\u000boauth_token\u0018\u0003 \u0002(\t\u0012\u0014\n\foauth_secret\u0018\u0004 \u0002(\t\"\u0082\u0002\n\u0013DIOAuth2Credentials\u0012\u0014\n\faccess_token\u0018\u0001 \u0001(\t\u0012\u0012\n\ntoken_type\u0018\u0002 \u0001(\t\u0012\u0015\n\rrefresh_token\u0018\u0003 \u0001(\t\u0012\u0012\n\nexpires_in\u0018\u0004 \u0001(\r\u0012\r\n\u0005scope\u0018\u0005 \u0001(\t\u0012\u000b\n\u0003jti\u0018\u0006 \u0001(\t\u0012 \n\u0018refresh_token_expires_in\u0018\u0007 \u0001(\r\u0012\u0011\n\tmfa_token\u0018\b \u0001(\t\u0012 \n\u0018mfa_expiration_timestamp\u0018\t \u0001(\t\u0012#\n\u001bmfa_expiration_timestamp_ms\u0018\n \u0001(\u0004\"D\n\u000eSIPCredentials\u0012\u0010\n\busername\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006server\u0018\u0002 \u0001(\t\u0012\u0010\n\bpassword\u0018\u0003 \u0001(\t\"Þ\u0001\n\u0011OAuth2Credentials\u0012\u0014\n\faccess_token\u0018\u0001 \u0001(\t\u0012\u0012\n\ntoken_type\u0018\u0002 \u0001(\t\u0012\u0015\n\rrefresh_token\u0018\u0003 \u0001(\t\u0012\u0012\n\nexpires_in\u0018\u0004 \u0001(\r\u0012\r\n\u0005scope\u0018\u0005 \u0003(\t\u0012\u000b\n\u0003jti\u0018\u0006 \u0001(\t\u0012 \n\u0018refresh_token_expires_in\u0018\u0007 \u0001(\r\u0012\u0011\n\tmfa_token\u0018\b \u0001(\t\u0012#\n\u001bmfa_expiration_timestamp_ms\u0018\t \u0001(\u0004\"\u0082\u0005\n\u0012CredentialsService\u0012J\n\u0010gc_oauth_request\u0018\u0001 \u0001(\u000b20.GDI.Proto.Credentials.GCOAuthCredentialsRequest\u0012L\n\u0011gc_oauth_response\u0018\u0002 \u0001(\u000b21.GDI.Proto.Credentials.GCOAuthCredentialsResponse\u0012M\n\u0012di_oauth_2_request\u0018\u0003 \u0001(\u000b21.GDI.Proto.Credentials.DIOAuth2CredentialsRequest\u0012O\n\u0013di_oauth_2_response\u0018\u0004 \u0001(\u000b22.GDI.Proto.Credentials.DIOAuth2CredentialsResponse\u0012G\n\u000eoauth2_request\u0018\u0005 \u0001(\u000b2/.GDI.Proto.Credentials.OAuth2CredentialsRequest\u0012I\n\u000foauth2_response\u0018\u0006 \u0001(\u000b20.GDI.Proto.Credentials.OAuth2CredentialsResponse\u0012M\n\u0017sip_credentials_request\u0018\u0007 \u0001(\u000b2,.GDI.Proto.Credentials.SIPCredentialsRequest\u0012O\n\u0018sip_credentials_response\u0018\b \u0001(\u000b2-.GDI.Proto.Credentials.SIPCredentialsResponse\"\u001b\n\u0019GCOAuthCredentialsRequest\"\u001c\n\u001aDIOAuth2CredentialsRequest\"\u0017\n\u0015SIPCredentialsRequest\"m\n\u0018OAuth2CredentialsRequest\u0012>\n\u000fcredential_type\u0018\u0001 \u0002(\u000e2%.GDI.Proto.Credentials.CredentialType\u0012\u0011\n\tclient_id\u0018\u0002 \u0001(\t\"\u009a\u0001\n\u001aGCOAuthCredentialsResponse\u0012B\n\u0011oauth_credentials\u0018\u0001 \u0002(\u000b2'.GDI.Proto.Credentials.OAuthCredentials\u00128\n\fgcs_location\u0018\u0002 \u0002(\u000e2\".GDI.Proto.Credentials.GCSLocation\"\u0098\u0001\n\u001bDIOAuth2CredentialsResponse\u0012?\n\u000bcredentials\u0018\u0001 \u0001(\u000b2*.GDI.Proto.Credentials.DIOAuth2Credentials\u00128\n\fgcs_location\u0018\u0002 \u0001(\u000e2\".GDI.Proto.Credentials.GCSLocation\"T\n\u0016SIPCredentialsResponse\u0012:\n\u000bcredentials\u0018\u0001 \u0001(\u000b2%.GDI.Proto.Credentials.SIPCredentials\"Ó\u0001\n\u0019OAuth2CredentialsResponse\u0012>\n\u000fcredential_type\u0018\u0001 \u0002(\u000e2%.GDI.Proto.Credentials.CredentialType\u0012=\n\u000bcredentials\u0018\u0002 \u0001(\u000b2(.GDI.Proto.Credentials.OAuth2Credentials\u00127\n\u000benvironment\u0018\u0003 \u0001(\u000e2\".GDI.Proto.Credentials.GCSLocation\"ö\u0001\n\u0013CapabilitiesRequest\u0012I\n\u001asupported_credential_types\u0018\u0001 \u0003(\u000e2%.GDI.Proto.Credentials.CredentialType\u0012\u001f\n\u0017support_sip_credentials\u0018\u0002 \u0001(\b2s\n\u0013credentials_request\u0012*.GDI.Proto.Core.FeatureCapabilitiesRequest\u0018\u0016 \u0001(\u000b2*.GDI.Proto.Credentials.CapabilitiesRequest\"\u008c\u0001\n\u0014CapabilitiesResponse2t\n\u0013credentials_request\u0012+.GDI.Proto.Core.FeatureCapabilitiesResponse\u0018\u0016 \u0001(\u000b2*.GDI.Proto.Credentials.CapabilitiesRequest*P\n\u000eCredentialType\u0012\u0014\n\u0010ALPHA_IT_OAUTH_2\u0010\u0000\u0012\u0016\n\u0012GENERIC_IT_OAUTH_2\u0010\u0001\u0012\u0010\n\fAMAZON_MUSIC\u0010\u0002*=\n\u000bGCSLocation\u0012\u000e\n\nPRODUCTION\u0010\u0000\u0012\t\n\u0005CHINA\u0010\u0001\u0012\b\n\u0004TEST\u0010\u0002\u0012\t\n\u0005STAGE\u0010\u0003B.\n\u001acom.garmin.proto.generatedB\u000eGDICredentialsH\u0003"}, new Descriptors.FileDescriptor[]{GDICore.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Credentials_CapabilitiesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Credentials_CapabilitiesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Credentials_CapabilitiesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Credentials_CapabilitiesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Credentials_CredentialsService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Credentials_CredentialsService_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Credentials_DIOAuth2CredentialsRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Credentials_DIOAuth2CredentialsRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Credentials_DIOAuth2CredentialsResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Credentials_DIOAuth2CredentialsResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Credentials_DIOAuth2Credentials_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Credentials_DIOAuth2Credentials_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Credentials_GCOAuthCredentialsRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Credentials_GCOAuthCredentialsRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Credentials_GCOAuthCredentialsResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Credentials_GCOAuthCredentialsResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Credentials_OAuth2CredentialsRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Credentials_OAuth2CredentialsRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Credentials_OAuth2CredentialsResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Credentials_OAuth2CredentialsResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Credentials_OAuth2Credentials_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Credentials_OAuth2Credentials_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Credentials_OAuthCredentials_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Credentials_OAuthCredentials_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Credentials_SIPCredentialsRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Credentials_SIPCredentialsRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Credentials_SIPCredentialsResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Credentials_SIPCredentialsResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Credentials_SIPCredentials_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Credentials_SIPCredentials_fieldAccessorTable;

    public interface CapabilitiesRequestOrBuilder extends MessageOrBuilder {
        boolean getSupportSipCredentials();

        CredentialType getSupportedCredentialTypes(int i14);

        int getSupportedCredentialTypesCount();

        List<CredentialType> getSupportedCredentialTypesList();

        boolean hasSupportSipCredentials();
    }

    public interface CapabilitiesResponseOrBuilder extends MessageOrBuilder {
    }

    public interface CredentialsServiceOrBuilder extends MessageOrBuilder {
        DIOAuth2CredentialsRequest getDiOauth2Request();

        DIOAuth2CredentialsRequestOrBuilder getDiOauth2RequestOrBuilder();

        DIOAuth2CredentialsResponse getDiOauth2Response();

        DIOAuth2CredentialsResponseOrBuilder getDiOauth2ResponseOrBuilder();

        GCOAuthCredentialsRequest getGcOauthRequest();

        GCOAuthCredentialsRequestOrBuilder getGcOauthRequestOrBuilder();

        GCOAuthCredentialsResponse getGcOauthResponse();

        GCOAuthCredentialsResponseOrBuilder getGcOauthResponseOrBuilder();

        OAuth2CredentialsRequest getOauth2Request();

        OAuth2CredentialsRequestOrBuilder getOauth2RequestOrBuilder();

        OAuth2CredentialsResponse getOauth2Response();

        OAuth2CredentialsResponseOrBuilder getOauth2ResponseOrBuilder();

        SIPCredentialsRequest getSipCredentialsRequest();

        SIPCredentialsRequestOrBuilder getSipCredentialsRequestOrBuilder();

        SIPCredentialsResponse getSipCredentialsResponse();

        SIPCredentialsResponseOrBuilder getSipCredentialsResponseOrBuilder();

        boolean hasDiOauth2Request();

        boolean hasDiOauth2Response();

        boolean hasGcOauthRequest();

        boolean hasGcOauthResponse();

        boolean hasOauth2Request();

        boolean hasOauth2Response();

        boolean hasSipCredentialsRequest();

        boolean hasSipCredentialsResponse();
    }

    public interface DIOAuth2CredentialsOrBuilder extends MessageOrBuilder {
        String getAccessToken();

        ByteString getAccessTokenBytes();

        int getExpiresIn();

        String getJti();

        ByteString getJtiBytes();

        String getMfaExpirationTimestamp();

        ByteString getMfaExpirationTimestampBytes();

        long getMfaExpirationTimestampMs();

        String getMfaToken();

        ByteString getMfaTokenBytes();

        String getRefreshToken();

        ByteString getRefreshTokenBytes();

        int getRefreshTokenExpiresIn();

        String getScope();

        ByteString getScopeBytes();

        String getTokenType();

        ByteString getTokenTypeBytes();

        boolean hasAccessToken();

        boolean hasExpiresIn();

        boolean hasJti();

        boolean hasMfaExpirationTimestamp();

        boolean hasMfaExpirationTimestampMs();

        boolean hasMfaToken();

        boolean hasRefreshToken();

        boolean hasRefreshTokenExpiresIn();

        boolean hasScope();

        boolean hasTokenType();
    }

    public interface DIOAuth2CredentialsRequestOrBuilder extends MessageOrBuilder {
    }

    public interface DIOAuth2CredentialsResponseOrBuilder extends MessageOrBuilder {
        DIOAuth2Credentials getCredentials();

        DIOAuth2CredentialsOrBuilder getCredentialsOrBuilder();

        GCSLocation getGcsLocation();

        boolean hasCredentials();

        boolean hasGcsLocation();
    }

    public interface GCOAuthCredentialsRequestOrBuilder extends MessageOrBuilder {
    }

    public interface GCOAuthCredentialsResponseOrBuilder extends MessageOrBuilder {
        GCSLocation getGcsLocation();

        OAuthCredentials getOauthCredentials();

        OAuthCredentialsOrBuilder getOauthCredentialsOrBuilder();

        boolean hasGcsLocation();

        boolean hasOauthCredentials();
    }

    public interface OAuth2CredentialsOrBuilder extends MessageOrBuilder {
        String getAccessToken();

        ByteString getAccessTokenBytes();

        int getExpiresIn();

        String getJti();

        ByteString getJtiBytes();

        long getMfaExpirationTimestampMs();

        String getMfaToken();

        ByteString getMfaTokenBytes();

        String getRefreshToken();

        ByteString getRefreshTokenBytes();

        int getRefreshTokenExpiresIn();

        String getScope(int i14);

        ByteString getScopeBytes(int i14);

        int getScopeCount();

        List<String> getScopeList();

        String getTokenType();

        ByteString getTokenTypeBytes();

        boolean hasAccessToken();

        boolean hasExpiresIn();

        boolean hasJti();

        boolean hasMfaExpirationTimestampMs();

        boolean hasMfaToken();

        boolean hasRefreshToken();

        boolean hasRefreshTokenExpiresIn();

        boolean hasTokenType();
    }

    public interface OAuth2CredentialsRequestOrBuilder extends MessageOrBuilder {
        String getClientId();

        ByteString getClientIdBytes();

        CredentialType getCredentialType();

        boolean hasClientId();

        boolean hasCredentialType();
    }

    public interface OAuth2CredentialsResponseOrBuilder extends MessageOrBuilder {
        CredentialType getCredentialType();

        OAuth2Credentials getCredentials();

        OAuth2CredentialsOrBuilder getCredentialsOrBuilder();

        GCSLocation getEnvironment();

        boolean hasCredentialType();

        boolean hasCredentials();

        boolean hasEnvironment();
    }

    public interface OAuthCredentialsOrBuilder extends MessageOrBuilder {
        String getConsumerKey();

        ByteString getConsumerKeyBytes();

        String getConsumerSecret();

        ByteString getConsumerSecretBytes();

        String getOauthSecret();

        ByteString getOauthSecretBytes();

        String getOauthToken();

        ByteString getOauthTokenBytes();

        boolean hasConsumerKey();

        boolean hasConsumerSecret();

        boolean hasOauthSecret();

        boolean hasOauthToken();
    }

    public interface SIPCredentialsOrBuilder extends MessageOrBuilder {
        String getPassword();

        ByteString getPasswordBytes();

        String getServer();

        ByteString getServerBytes();

        String getUsername();

        ByteString getUsernameBytes();

        boolean hasPassword();

        boolean hasServer();

        boolean hasUsername();
    }

    public interface SIPCredentialsRequestOrBuilder extends MessageOrBuilder {
    }

    public interface SIPCredentialsResponseOrBuilder extends MessageOrBuilder {
        SIPCredentials getCredentials();

        SIPCredentialsOrBuilder getCredentialsOrBuilder();

        boolean hasCredentials();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_Credentials_OAuthCredentials_descriptor = descriptor2;
        internal_static_GDI_Proto_Credentials_OAuthCredentials_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"ConsumerKey", "ConsumerSecret", "OauthToken", "OauthSecret"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_Credentials_DIOAuth2Credentials_descriptor = descriptor3;
        internal_static_GDI_Proto_Credentials_DIOAuth2Credentials_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"AccessToken", "TokenType", "RefreshToken", "ExpiresIn", "Scope", "Jti", "RefreshTokenExpiresIn", "MfaToken", "MfaExpirationTimestamp", "MfaExpirationTimestampMs"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_Credentials_SIPCredentials_descriptor = descriptor4;
        internal_static_GDI_Proto_Credentials_SIPCredentials_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Username", HttpHeaders.SERVER, "Password"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_Credentials_OAuth2Credentials_descriptor = descriptor5;
        internal_static_GDI_Proto_Credentials_OAuth2Credentials_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"AccessToken", "TokenType", "RefreshToken", "ExpiresIn", "Scope", "Jti", "RefreshTokenExpiresIn", "MfaToken", "MfaExpirationTimestampMs"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_Credentials_CredentialsService_descriptor = descriptor6;
        internal_static_GDI_Proto_Credentials_CredentialsService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"GcOauthRequest", "GcOauthResponse", "DiOauth2Request", "DiOauth2Response", "Oauth2Request", "Oauth2Response", "SipCredentialsRequest", "SipCredentialsResponse"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_Credentials_GCOAuthCredentialsRequest_descriptor = descriptor7;
        internal_static_GDI_Proto_Credentials_GCOAuthCredentialsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[0]);
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_Credentials_DIOAuth2CredentialsRequest_descriptor = descriptor8;
        internal_static_GDI_Proto_Credentials_DIOAuth2CredentialsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[0]);
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_Credentials_SIPCredentialsRequest_descriptor = descriptor9;
        internal_static_GDI_Proto_Credentials_SIPCredentialsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[0]);
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_GDI_Proto_Credentials_OAuth2CredentialsRequest_descriptor = descriptor10;
        internal_static_GDI_Proto_Credentials_OAuth2CredentialsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"CredentialType", "ClientId"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(9);
        internal_static_GDI_Proto_Credentials_GCOAuthCredentialsResponse_descriptor = descriptor11;
        internal_static_GDI_Proto_Credentials_GCOAuthCredentialsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"OauthCredentials", "GcsLocation"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(10);
        internal_static_GDI_Proto_Credentials_DIOAuth2CredentialsResponse_descriptor = descriptor12;
        internal_static_GDI_Proto_Credentials_DIOAuth2CredentialsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Credentials", "GcsLocation"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(11);
        internal_static_GDI_Proto_Credentials_SIPCredentialsResponse_descriptor = descriptor13;
        internal_static_GDI_Proto_Credentials_SIPCredentialsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"Credentials"});
        Descriptors.Descriptor descriptor14 = getDescriptor().getMessageTypes().get(12);
        internal_static_GDI_Proto_Credentials_OAuth2CredentialsResponse_descriptor = descriptor14;
        internal_static_GDI_Proto_Credentials_OAuth2CredentialsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"CredentialType", "Credentials", "Environment"});
        Descriptors.Descriptor descriptor15 = getDescriptor().getMessageTypes().get(13);
        internal_static_GDI_Proto_Credentials_CapabilitiesRequest_descriptor = descriptor15;
        internal_static_GDI_Proto_Credentials_CapabilitiesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"SupportedCredentialTypes", "SupportSipCredentials"});
        Descriptors.Descriptor descriptor16 = getDescriptor().getMessageTypes().get(14);
        internal_static_GDI_Proto_Credentials_CapabilitiesResponse_descriptor = descriptor16;
        internal_static_GDI_Proto_Credentials_CapabilitiesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[0]);
        GDICore.getDescriptor();
    }

    private GDICredentials() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(CapabilitiesRequest.credentialsRequest);
        extensionRegistryLite.add(CapabilitiesResponse.credentialsRequest);
    }

    public static final class CapabilitiesResponse extends GeneratedMessageV3 implements CapabilitiesResponseOrBuilder {
        public static final int CREDENTIALS_REQUEST_FIELD_NUMBER = 22;
        private static final CapabilitiesResponse DEFAULT_INSTANCE = new CapabilitiesResponse();

        @Deprecated
        public static final Parser<CapabilitiesResponse> PARSER = new AbstractParser<CapabilitiesResponse>() { // from class: com.garmin.proto.generated.GDICredentials.CapabilitiesResponse.1
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
        public static final GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesResponse, CapabilitiesRequest> credentialsRequest = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, CapabilitiesRequest.class, CapabilitiesRequest.getDefaultInstance());
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;

        private CapabilitiesResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICredentials.internal_static_GDI_Proto_Credentials_CapabilitiesResponse_descriptor;
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
            if (obj instanceof CapabilitiesResponse) {
                return getUnknownFields().equals(((CapabilitiesResponse) obj).getUnknownFields());
            }
            return super.equals(obj);
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
            return GDICredentials.internal_static_GDI_Proto_Credentials_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesResponseOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICredentials.internal_static_GDI_Proto_Credentials_CapabilitiesResponse_descriptor;
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
                onBuilt();
                return capabilitiesResponse;
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
                return GDICredentials.internal_static_GDI_Proto_Credentials_CapabilitiesResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICredentials.internal_static_GDI_Proto_Credentials_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
            public CapabilitiesResponse getDefaultInstanceForType() {
                return CapabilitiesResponse.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
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

    public static final class DIOAuth2CredentialsRequest extends GeneratedMessageV3 implements DIOAuth2CredentialsRequestOrBuilder {
        private static final DIOAuth2CredentialsRequest DEFAULT_INSTANCE = new DIOAuth2CredentialsRequest();

        @Deprecated
        public static final Parser<DIOAuth2CredentialsRequest> PARSER = new AbstractParser<DIOAuth2CredentialsRequest>() { // from class: com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsRequest.1
            @Override // com.google.protobuf.Parser
            public DIOAuth2CredentialsRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DIOAuth2CredentialsRequest.newBuilder();
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

        private DIOAuth2CredentialsRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DIOAuth2CredentialsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICredentials.internal_static_GDI_Proto_Credentials_DIOAuth2CredentialsRequest_descriptor;
        }

        public static Builder newBuilder(DIOAuth2CredentialsRequest dIOAuth2CredentialsRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(dIOAuth2CredentialsRequest);
        }

        public static DIOAuth2CredentialsRequest parseDelimitedFrom(InputStream inputStream) {
            return (DIOAuth2CredentialsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DIOAuth2CredentialsRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DIOAuth2CredentialsRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof DIOAuth2CredentialsRequest) {
                return getUnknownFields().equals(((DIOAuth2CredentialsRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DIOAuth2CredentialsRequest> getParserForType() {
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
            return GDICredentials.internal_static_GDI_Proto_Credentials_DIOAuth2CredentialsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(DIOAuth2CredentialsRequest.class, Builder.class);
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
            return new DIOAuth2CredentialsRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DIOAuth2CredentialsRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICredentials.internal_static_GDI_Proto_Credentials_DIOAuth2CredentialsRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DIOAuth2CredentialsRequest build() {
                DIOAuth2CredentialsRequest dIOAuth2CredentialsRequestBuildPartial = buildPartial();
                if (dIOAuth2CredentialsRequestBuildPartial.isInitialized()) {
                    return dIOAuth2CredentialsRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dIOAuth2CredentialsRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DIOAuth2CredentialsRequest buildPartial() {
                DIOAuth2CredentialsRequest dIOAuth2CredentialsRequest = new DIOAuth2CredentialsRequest(this);
                onBuilt();
                return dIOAuth2CredentialsRequest;
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
                return GDICredentials.internal_static_GDI_Proto_Credentials_DIOAuth2CredentialsRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICredentials.internal_static_GDI_Proto_Credentials_DIOAuth2CredentialsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(DIOAuth2CredentialsRequest.class, Builder.class);
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
            public DIOAuth2CredentialsRequest getDefaultInstanceForType() {
                return DIOAuth2CredentialsRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DIOAuth2CredentialsRequest) {
                    return mergeFrom((DIOAuth2CredentialsRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DIOAuth2CredentialsRequest dIOAuth2CredentialsRequest) {
                if (dIOAuth2CredentialsRequest == DIOAuth2CredentialsRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(dIOAuth2CredentialsRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DIOAuth2CredentialsRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ DIOAuth2CredentialsRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private DIOAuth2CredentialsRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DIOAuth2CredentialsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DIOAuth2CredentialsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DIOAuth2CredentialsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DIOAuth2CredentialsRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DIOAuth2CredentialsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DIOAuth2CredentialsRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DIOAuth2CredentialsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DIOAuth2CredentialsRequest parseFrom(InputStream inputStream) {
            return (DIOAuth2CredentialsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DIOAuth2CredentialsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DIOAuth2CredentialsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DIOAuth2CredentialsRequest parseFrom(CodedInputStream codedInputStream) {
            return (DIOAuth2CredentialsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DIOAuth2CredentialsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DIOAuth2CredentialsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class GCOAuthCredentialsRequest extends GeneratedMessageV3 implements GCOAuthCredentialsRequestOrBuilder {
        private static final GCOAuthCredentialsRequest DEFAULT_INSTANCE = new GCOAuthCredentialsRequest();

        @Deprecated
        public static final Parser<GCOAuthCredentialsRequest> PARSER = new AbstractParser<GCOAuthCredentialsRequest>() { // from class: com.garmin.proto.generated.GDICredentials.GCOAuthCredentialsRequest.1
            @Override // com.google.protobuf.Parser
            public GCOAuthCredentialsRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GCOAuthCredentialsRequest.newBuilder();
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

        private GCOAuthCredentialsRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GCOAuthCredentialsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICredentials.internal_static_GDI_Proto_Credentials_GCOAuthCredentialsRequest_descriptor;
        }

        public static Builder newBuilder(GCOAuthCredentialsRequest gCOAuthCredentialsRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(gCOAuthCredentialsRequest);
        }

        public static GCOAuthCredentialsRequest parseDelimitedFrom(InputStream inputStream) {
            return (GCOAuthCredentialsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GCOAuthCredentialsRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GCOAuthCredentialsRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof GCOAuthCredentialsRequest) {
                return getUnknownFields().equals(((GCOAuthCredentialsRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GCOAuthCredentialsRequest> getParserForType() {
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
            return GDICredentials.internal_static_GDI_Proto_Credentials_GCOAuthCredentialsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GCOAuthCredentialsRequest.class, Builder.class);
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
            return new GCOAuthCredentialsRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GCOAuthCredentialsRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICredentials.internal_static_GDI_Proto_Credentials_GCOAuthCredentialsRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GCOAuthCredentialsRequest build() {
                GCOAuthCredentialsRequest gCOAuthCredentialsRequestBuildPartial = buildPartial();
                if (gCOAuthCredentialsRequestBuildPartial.isInitialized()) {
                    return gCOAuthCredentialsRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) gCOAuthCredentialsRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GCOAuthCredentialsRequest buildPartial() {
                GCOAuthCredentialsRequest gCOAuthCredentialsRequest = new GCOAuthCredentialsRequest(this);
                onBuilt();
                return gCOAuthCredentialsRequest;
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
                return GDICredentials.internal_static_GDI_Proto_Credentials_GCOAuthCredentialsRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICredentials.internal_static_GDI_Proto_Credentials_GCOAuthCredentialsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GCOAuthCredentialsRequest.class, Builder.class);
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
            public GCOAuthCredentialsRequest getDefaultInstanceForType() {
                return GCOAuthCredentialsRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GCOAuthCredentialsRequest) {
                    return mergeFrom((GCOAuthCredentialsRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GCOAuthCredentialsRequest gCOAuthCredentialsRequest) {
                if (gCOAuthCredentialsRequest == GCOAuthCredentialsRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(gCOAuthCredentialsRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GCOAuthCredentialsRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ GCOAuthCredentialsRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private GCOAuthCredentialsRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GCOAuthCredentialsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GCOAuthCredentialsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GCOAuthCredentialsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GCOAuthCredentialsRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GCOAuthCredentialsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GCOAuthCredentialsRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GCOAuthCredentialsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GCOAuthCredentialsRequest parseFrom(InputStream inputStream) {
            return (GCOAuthCredentialsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GCOAuthCredentialsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GCOAuthCredentialsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GCOAuthCredentialsRequest parseFrom(CodedInputStream codedInputStream) {
            return (GCOAuthCredentialsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GCOAuthCredentialsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GCOAuthCredentialsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SIPCredentialsRequest extends GeneratedMessageV3 implements SIPCredentialsRequestOrBuilder {
        private static final SIPCredentialsRequest DEFAULT_INSTANCE = new SIPCredentialsRequest();

        @Deprecated
        public static final Parser<SIPCredentialsRequest> PARSER = new AbstractParser<SIPCredentialsRequest>() { // from class: com.garmin.proto.generated.GDICredentials.SIPCredentialsRequest.1
            @Override // com.google.protobuf.Parser
            public SIPCredentialsRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SIPCredentialsRequest.newBuilder();
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

        private SIPCredentialsRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SIPCredentialsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICredentials.internal_static_GDI_Proto_Credentials_SIPCredentialsRequest_descriptor;
        }

        public static Builder newBuilder(SIPCredentialsRequest sIPCredentialsRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sIPCredentialsRequest);
        }

        public static SIPCredentialsRequest parseDelimitedFrom(InputStream inputStream) {
            return (SIPCredentialsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SIPCredentialsRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SIPCredentialsRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof SIPCredentialsRequest) {
                return getUnknownFields().equals(((SIPCredentialsRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SIPCredentialsRequest> getParserForType() {
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
            return GDICredentials.internal_static_GDI_Proto_Credentials_SIPCredentialsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SIPCredentialsRequest.class, Builder.class);
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
            return new SIPCredentialsRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SIPCredentialsRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICredentials.internal_static_GDI_Proto_Credentials_SIPCredentialsRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SIPCredentialsRequest build() {
                SIPCredentialsRequest sIPCredentialsRequestBuildPartial = buildPartial();
                if (sIPCredentialsRequestBuildPartial.isInitialized()) {
                    return sIPCredentialsRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sIPCredentialsRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SIPCredentialsRequest buildPartial() {
                SIPCredentialsRequest sIPCredentialsRequest = new SIPCredentialsRequest(this);
                onBuilt();
                return sIPCredentialsRequest;
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
                return GDICredentials.internal_static_GDI_Proto_Credentials_SIPCredentialsRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICredentials.internal_static_GDI_Proto_Credentials_SIPCredentialsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SIPCredentialsRequest.class, Builder.class);
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
            public SIPCredentialsRequest getDefaultInstanceForType() {
                return SIPCredentialsRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SIPCredentialsRequest) {
                    return mergeFrom((SIPCredentialsRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SIPCredentialsRequest sIPCredentialsRequest) {
                if (sIPCredentialsRequest == SIPCredentialsRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(sIPCredentialsRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SIPCredentialsRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ SIPCredentialsRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SIPCredentialsRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SIPCredentialsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SIPCredentialsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SIPCredentialsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SIPCredentialsRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SIPCredentialsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SIPCredentialsRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SIPCredentialsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SIPCredentialsRequest parseFrom(InputStream inputStream) {
            return (SIPCredentialsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SIPCredentialsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SIPCredentialsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SIPCredentialsRequest parseFrom(CodedInputStream codedInputStream) {
            return (SIPCredentialsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SIPCredentialsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SIPCredentialsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CapabilitiesRequest extends GeneratedMessageV3 implements CapabilitiesRequestOrBuilder {
        public static final int CREDENTIALS_REQUEST_FIELD_NUMBER = 22;
        public static final int SUPPORTED_CREDENTIAL_TYPES_FIELD_NUMBER = 1;
        public static final int SUPPORT_SIP_CREDENTIALS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private boolean supportSipCredentials_;
        private List<Integer> supportedCredentialTypes_;
        private static final Internal.ListAdapter.Converter<Integer, CredentialType> supportedCredentialTypes_converter_ = new Internal.ListAdapter.Converter<Integer, CredentialType>() { // from class: com.garmin.proto.generated.GDICredentials.CapabilitiesRequest.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public CredentialType convert(Integer num) {
                CredentialType credentialTypeForNumber = CredentialType.forNumber(num.intValue());
                return credentialTypeForNumber == null ? CredentialType.ALPHA_IT_OAUTH_2 : credentialTypeForNumber;
            }
        };
        private static final CapabilitiesRequest DEFAULT_INSTANCE = new CapabilitiesRequest();

        @Deprecated
        public static final Parser<CapabilitiesRequest> PARSER = new AbstractParser<CapabilitiesRequest>() { // from class: com.garmin.proto.generated.GDICredentials.CapabilitiesRequest.2
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
        public static final GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesRequest, CapabilitiesRequest> credentialsRequest = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, CapabilitiesRequest.class, getDefaultInstance());

        private CapabilitiesRequest() {
            this.supportSipCredentials_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.supportedCredentialTypes_ = Collections.EMPTY_LIST;
        }

        public static CapabilitiesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICredentials.internal_static_GDI_Proto_Credentials_CapabilitiesRequest_descriptor;
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
            if (this.supportedCredentialTypes_.equals(capabilitiesRequest.supportedCredentialTypes_) && hasSupportSipCredentials() == capabilitiesRequest.hasSupportSipCredentials()) {
                return (!hasSupportSipCredentials() || getSupportSipCredentials() == capabilitiesRequest.getSupportSipCredentials()) && getUnknownFields().equals(capabilitiesRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CapabilitiesRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            List<Integer> list;
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int i15 = 0;
            int iA = 0;
            while (true) {
                int size = this.supportedCredentialTypes_.size();
                list = this.supportedCredentialTypes_;
                if (i15 >= size) {
                    break;
                }
                iA = f3.a(iA, list.get(i15));
                i15++;
            }
            int size2 = list.size() + iA;
            if ((this.bitField0_ & 1) != 0) {
                size2 += CodedOutputStream.computeBoolSize(2, this.supportSipCredentials_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + size2;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICredentials.CapabilitiesRequestOrBuilder
        public boolean getSupportSipCredentials() {
            return this.supportSipCredentials_;
        }

        @Override // com.garmin.proto.generated.GDICredentials.CapabilitiesRequestOrBuilder
        public CredentialType getSupportedCredentialTypes(int i14) {
            return supportedCredentialTypes_converter_.convert(this.supportedCredentialTypes_.get(i14));
        }

        @Override // com.garmin.proto.generated.GDICredentials.CapabilitiesRequestOrBuilder
        public int getSupportedCredentialTypesCount() {
            return this.supportedCredentialTypes_.size();
        }

        @Override // com.garmin.proto.generated.GDICredentials.CapabilitiesRequestOrBuilder
        public List<CredentialType> getSupportedCredentialTypesList() {
            return new Internal.ListAdapter(this.supportedCredentialTypes_, supportedCredentialTypes_converter_);
        }

        @Override // com.garmin.proto.generated.GDICredentials.CapabilitiesRequestOrBuilder
        public boolean hasSupportSipCredentials() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getSupportedCredentialTypesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.supportedCredentialTypes_.hashCode();
            }
            if (hasSupportSipCredentials()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getSupportSipCredentials());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICredentials.internal_static_GDI_Proto_Credentials_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
            int iF = 0;
            while (iF < this.supportedCredentialTypes_.size()) {
                iF = f3.f(this.supportedCredentialTypes_.get(iF), codedOutputStream, 1, iF, 1);
            }
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(2, this.supportSipCredentials_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesRequestOrBuilder {
            private int bitField0_;
            private boolean supportSipCredentials_;
            private List<Integer> supportedCredentialTypes_;

            private Builder() {
                this.supportedCredentialTypes_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(CapabilitiesRequest capabilitiesRequest) {
                int i14;
                if ((this.bitField0_ & 2) != 0) {
                    capabilitiesRequest.supportSipCredentials_ = this.supportSipCredentials_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                capabilitiesRequest.bitField0_ = i14 | capabilitiesRequest.bitField0_;
            }

            private void buildPartialRepeatedFields(CapabilitiesRequest capabilitiesRequest) {
                if ((this.bitField0_ & 1) != 0) {
                    this.supportedCredentialTypes_ = Collections.unmodifiableList(this.supportedCredentialTypes_);
                    this.bitField0_ &= -2;
                }
                capabilitiesRequest.supportedCredentialTypes_ = this.supportedCredentialTypes_;
            }

            private void ensureSupportedCredentialTypesIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.supportedCredentialTypes_ = new ArrayList(this.supportedCredentialTypes_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICredentials.internal_static_GDI_Proto_Credentials_CapabilitiesRequest_descriptor;
            }

            public Builder addAllSupportedCredentialTypes(Iterable<? extends CredentialType> iterable) {
                ensureSupportedCredentialTypesIsMutable();
                Iterator<? extends CredentialType> it = iterable.iterator();
                while (it.hasNext()) {
                    this.supportedCredentialTypes_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addSupportedCredentialTypes(CredentialType credentialType) {
                credentialType.getClass();
                ensureSupportedCredentialTypesIsMutable();
                this.supportedCredentialTypes_.add(Integer.valueOf(credentialType.getNumber()));
                onChanged();
                return this;
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
                buildPartialRepeatedFields(capabilitiesRequest);
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
                this.supportedCredentialTypes_ = Collections.EMPTY_LIST;
                this.bitField0_ = 0;
                this.supportSipCredentials_ = false;
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

            public Builder clearSupportSipCredentials() {
                this.bitField0_ &= -3;
                this.supportSipCredentials_ = false;
                onChanged();
                return this;
            }

            public Builder clearSupportedCredentialTypes() {
                this.supportedCredentialTypes_ = Collections.EMPTY_LIST;
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
                return GDICredentials.internal_static_GDI_Proto_Credentials_CapabilitiesRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICredentials.CapabilitiesRequestOrBuilder
            public boolean getSupportSipCredentials() {
                return this.supportSipCredentials_;
            }

            @Override // com.garmin.proto.generated.GDICredentials.CapabilitiesRequestOrBuilder
            public CredentialType getSupportedCredentialTypes(int i14) {
                return (CredentialType) CapabilitiesRequest.supportedCredentialTypes_converter_.convert(this.supportedCredentialTypes_.get(i14));
            }

            @Override // com.garmin.proto.generated.GDICredentials.CapabilitiesRequestOrBuilder
            public int getSupportedCredentialTypesCount() {
                return this.supportedCredentialTypes_.size();
            }

            @Override // com.garmin.proto.generated.GDICredentials.CapabilitiesRequestOrBuilder
            public List<CredentialType> getSupportedCredentialTypesList() {
                return new Internal.ListAdapter(this.supportedCredentialTypes_, CapabilitiesRequest.supportedCredentialTypes_converter_);
            }

            @Override // com.garmin.proto.generated.GDICredentials.CapabilitiesRequestOrBuilder
            public boolean hasSupportSipCredentials() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICredentials.internal_static_GDI_Proto_Credentials_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
                                    if (CredentialType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        ensureSupportedCredentialTypesIsMutable();
                                        this.supportedCredentialTypes_.add(Integer.valueOf(i14));
                                    }
                                } else if (tag == 10) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int i15 = codedInputStream.readEnum();
                                        if (CredentialType.forNumber(i15) == null) {
                                            mergeUnknownVarintField(1, i15);
                                        } else {
                                            ensureSupportedCredentialTypesIsMutable();
                                            this.supportedCredentialTypes_.add(Integer.valueOf(i15));
                                        }
                                    }
                                    codedInputStream.popLimit(iPushLimit);
                                } else if (tag == 16) {
                                    this.supportSipCredentials_ = codedInputStream.readBool();
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

            public Builder setSupportSipCredentials(boolean z14) {
                this.supportSipCredentials_ = z14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSupportedCredentialTypes(int i14, CredentialType credentialType) {
                credentialType.getClass();
                ensureSupportedCredentialTypesIsMutable();
                this.supportedCredentialTypes_.set(i14, Integer.valueOf(credentialType.getNumber()));
                onChanged();
                return this;
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
                this.supportedCredentialTypes_ = Collections.EMPTY_LIST;
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
                if (!capabilitiesRequest.supportedCredentialTypes_.isEmpty()) {
                    if (this.supportedCredentialTypes_.isEmpty()) {
                        this.supportedCredentialTypes_ = capabilitiesRequest.supportedCredentialTypes_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureSupportedCredentialTypesIsMutable();
                        this.supportedCredentialTypes_.addAll(capabilitiesRequest.supportedCredentialTypes_);
                    }
                    onChanged();
                }
                if (capabilitiesRequest.hasSupportSipCredentials()) {
                    setSupportSipCredentials(capabilitiesRequest.getSupportSipCredentials());
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

        private CapabilitiesRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.supportSipCredentials_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesRequest parseFrom(InputStream inputStream) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CapabilitiesRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ CapabilitiesRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CapabilitiesRequest parseFrom(CodedInputStream codedInputStream) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CapabilitiesRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CredentialsService extends GeneratedMessageV3 implements CredentialsServiceOrBuilder {
        public static final int DI_OAUTH_2_REQUEST_FIELD_NUMBER = 3;
        public static final int DI_OAUTH_2_RESPONSE_FIELD_NUMBER = 4;
        public static final int GC_OAUTH_REQUEST_FIELD_NUMBER = 1;
        public static final int GC_OAUTH_RESPONSE_FIELD_NUMBER = 2;
        public static final int OAUTH2_REQUEST_FIELD_NUMBER = 5;
        public static final int OAUTH2_RESPONSE_FIELD_NUMBER = 6;
        public static final int SIP_CREDENTIALS_REQUEST_FIELD_NUMBER = 7;
        public static final int SIP_CREDENTIALS_RESPONSE_FIELD_NUMBER = 8;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private DIOAuth2CredentialsRequest diOauth2Request_;
        private DIOAuth2CredentialsResponse diOauth2Response_;
        private GCOAuthCredentialsRequest gcOauthRequest_;
        private GCOAuthCredentialsResponse gcOauthResponse_;
        private byte memoizedIsInitialized;
        private OAuth2CredentialsRequest oauth2Request_;
        private OAuth2CredentialsResponse oauth2Response_;
        private SIPCredentialsRequest sipCredentialsRequest_;
        private SIPCredentialsResponse sipCredentialsResponse_;
        private static final CredentialsService DEFAULT_INSTANCE = new CredentialsService();

        @Deprecated
        public static final Parser<CredentialsService> PARSER = new AbstractParser<CredentialsService>() { // from class: com.garmin.proto.generated.GDICredentials.CredentialsService.1
            @Override // com.google.protobuf.Parser
            public CredentialsService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CredentialsService.newBuilder();
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

        private CredentialsService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CredentialsService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICredentials.internal_static_GDI_Proto_Credentials_CredentialsService_descriptor;
        }

        public static Builder newBuilder(CredentialsService credentialsService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(credentialsService);
        }

        public static CredentialsService parseDelimitedFrom(InputStream inputStream) {
            return (CredentialsService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CredentialsService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CredentialsService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CredentialsService)) {
                return super.equals(obj);
            }
            CredentialsService credentialsService = (CredentialsService) obj;
            if (hasGcOauthRequest() != credentialsService.hasGcOauthRequest()) {
                return false;
            }
            if ((hasGcOauthRequest() && !getGcOauthRequest().equals(credentialsService.getGcOauthRequest())) || hasGcOauthResponse() != credentialsService.hasGcOauthResponse()) {
                return false;
            }
            if ((hasGcOauthResponse() && !getGcOauthResponse().equals(credentialsService.getGcOauthResponse())) || hasDiOauth2Request() != credentialsService.hasDiOauth2Request()) {
                return false;
            }
            if ((hasDiOauth2Request() && !getDiOauth2Request().equals(credentialsService.getDiOauth2Request())) || hasDiOauth2Response() != credentialsService.hasDiOauth2Response()) {
                return false;
            }
            if ((hasDiOauth2Response() && !getDiOauth2Response().equals(credentialsService.getDiOauth2Response())) || hasOauth2Request() != credentialsService.hasOauth2Request()) {
                return false;
            }
            if ((hasOauth2Request() && !getOauth2Request().equals(credentialsService.getOauth2Request())) || hasOauth2Response() != credentialsService.hasOauth2Response()) {
                return false;
            }
            if ((hasOauth2Response() && !getOauth2Response().equals(credentialsService.getOauth2Response())) || hasSipCredentialsRequest() != credentialsService.hasSipCredentialsRequest()) {
                return false;
            }
            if ((!hasSipCredentialsRequest() || getSipCredentialsRequest().equals(credentialsService.getSipCredentialsRequest())) && hasSipCredentialsResponse() == credentialsService.hasSipCredentialsResponse()) {
                return (!hasSipCredentialsResponse() || getSipCredentialsResponse().equals(credentialsService.getSipCredentialsResponse())) && getUnknownFields().equals(credentialsService.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
        public DIOAuth2CredentialsRequest getDiOauth2Request() {
            DIOAuth2CredentialsRequest dIOAuth2CredentialsRequest = this.diOauth2Request_;
            return dIOAuth2CredentialsRequest == null ? DIOAuth2CredentialsRequest.getDefaultInstance() : dIOAuth2CredentialsRequest;
        }

        @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
        public DIOAuth2CredentialsRequestOrBuilder getDiOauth2RequestOrBuilder() {
            DIOAuth2CredentialsRequest dIOAuth2CredentialsRequest = this.diOauth2Request_;
            return dIOAuth2CredentialsRequest == null ? DIOAuth2CredentialsRequest.getDefaultInstance() : dIOAuth2CredentialsRequest;
        }

        @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
        public DIOAuth2CredentialsResponse getDiOauth2Response() {
            DIOAuth2CredentialsResponse dIOAuth2CredentialsResponse = this.diOauth2Response_;
            return dIOAuth2CredentialsResponse == null ? DIOAuth2CredentialsResponse.getDefaultInstance() : dIOAuth2CredentialsResponse;
        }

        @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
        public DIOAuth2CredentialsResponseOrBuilder getDiOauth2ResponseOrBuilder() {
            DIOAuth2CredentialsResponse dIOAuth2CredentialsResponse = this.diOauth2Response_;
            return dIOAuth2CredentialsResponse == null ? DIOAuth2CredentialsResponse.getDefaultInstance() : dIOAuth2CredentialsResponse;
        }

        @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
        public GCOAuthCredentialsRequest getGcOauthRequest() {
            GCOAuthCredentialsRequest gCOAuthCredentialsRequest = this.gcOauthRequest_;
            return gCOAuthCredentialsRequest == null ? GCOAuthCredentialsRequest.getDefaultInstance() : gCOAuthCredentialsRequest;
        }

        @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
        public GCOAuthCredentialsRequestOrBuilder getGcOauthRequestOrBuilder() {
            GCOAuthCredentialsRequest gCOAuthCredentialsRequest = this.gcOauthRequest_;
            return gCOAuthCredentialsRequest == null ? GCOAuthCredentialsRequest.getDefaultInstance() : gCOAuthCredentialsRequest;
        }

        @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
        public GCOAuthCredentialsResponse getGcOauthResponse() {
            GCOAuthCredentialsResponse gCOAuthCredentialsResponse = this.gcOauthResponse_;
            return gCOAuthCredentialsResponse == null ? GCOAuthCredentialsResponse.getDefaultInstance() : gCOAuthCredentialsResponse;
        }

        @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
        public GCOAuthCredentialsResponseOrBuilder getGcOauthResponseOrBuilder() {
            GCOAuthCredentialsResponse gCOAuthCredentialsResponse = this.gcOauthResponse_;
            return gCOAuthCredentialsResponse == null ? GCOAuthCredentialsResponse.getDefaultInstance() : gCOAuthCredentialsResponse;
        }

        @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
        public OAuth2CredentialsRequest getOauth2Request() {
            OAuth2CredentialsRequest oAuth2CredentialsRequest = this.oauth2Request_;
            return oAuth2CredentialsRequest == null ? OAuth2CredentialsRequest.getDefaultInstance() : oAuth2CredentialsRequest;
        }

        @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
        public OAuth2CredentialsRequestOrBuilder getOauth2RequestOrBuilder() {
            OAuth2CredentialsRequest oAuth2CredentialsRequest = this.oauth2Request_;
            return oAuth2CredentialsRequest == null ? OAuth2CredentialsRequest.getDefaultInstance() : oAuth2CredentialsRequest;
        }

        @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
        public OAuth2CredentialsResponse getOauth2Response() {
            OAuth2CredentialsResponse oAuth2CredentialsResponse = this.oauth2Response_;
            return oAuth2CredentialsResponse == null ? OAuth2CredentialsResponse.getDefaultInstance() : oAuth2CredentialsResponse;
        }

        @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
        public OAuth2CredentialsResponseOrBuilder getOauth2ResponseOrBuilder() {
            OAuth2CredentialsResponse oAuth2CredentialsResponse = this.oauth2Response_;
            return oAuth2CredentialsResponse == null ? OAuth2CredentialsResponse.getDefaultInstance() : oAuth2CredentialsResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CredentialsService> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getGcOauthRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getGcOauthResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getDiOauth2Request());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getDiOauth2Response());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getOauth2Request());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getOauth2Response());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getSipCredentialsRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, getSipCredentialsResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
        public SIPCredentialsRequest getSipCredentialsRequest() {
            SIPCredentialsRequest sIPCredentialsRequest = this.sipCredentialsRequest_;
            return sIPCredentialsRequest == null ? SIPCredentialsRequest.getDefaultInstance() : sIPCredentialsRequest;
        }

        @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
        public SIPCredentialsRequestOrBuilder getSipCredentialsRequestOrBuilder() {
            SIPCredentialsRequest sIPCredentialsRequest = this.sipCredentialsRequest_;
            return sIPCredentialsRequest == null ? SIPCredentialsRequest.getDefaultInstance() : sIPCredentialsRequest;
        }

        @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
        public SIPCredentialsResponse getSipCredentialsResponse() {
            SIPCredentialsResponse sIPCredentialsResponse = this.sipCredentialsResponse_;
            return sIPCredentialsResponse == null ? SIPCredentialsResponse.getDefaultInstance() : sIPCredentialsResponse;
        }

        @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
        public SIPCredentialsResponseOrBuilder getSipCredentialsResponseOrBuilder() {
            SIPCredentialsResponse sIPCredentialsResponse = this.sipCredentialsResponse_;
            return sIPCredentialsResponse == null ? SIPCredentialsResponse.getDefaultInstance() : sIPCredentialsResponse;
        }

        @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
        public boolean hasDiOauth2Request() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
        public boolean hasDiOauth2Response() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
        public boolean hasGcOauthRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
        public boolean hasGcOauthResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
        public boolean hasOauth2Request() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
        public boolean hasOauth2Response() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
        public boolean hasSipCredentialsRequest() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
        public boolean hasSipCredentialsResponse() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasGcOauthRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getGcOauthRequest().hashCode();
            }
            if (hasGcOauthResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getGcOauthResponse().hashCode();
            }
            if (hasDiOauth2Request()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getDiOauth2Request().hashCode();
            }
            if (hasDiOauth2Response()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getDiOauth2Response().hashCode();
            }
            if (hasOauth2Request()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getOauth2Request().hashCode();
            }
            if (hasOauth2Response()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getOauth2Response().hashCode();
            }
            if (hasSipCredentialsRequest()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getSipCredentialsRequest().hashCode();
            }
            if (hasSipCredentialsResponse()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getSipCredentialsResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICredentials.internal_static_GDI_Proto_Credentials_CredentialsService_fieldAccessorTable.ensureFieldAccessorsInitialized(CredentialsService.class, Builder.class);
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
            if (hasGcOauthResponse() && !getGcOauthResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasOauth2Request() && !getOauth2Request().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasOauth2Response() || getOauth2Response().isInitialized()) {
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
            return new CredentialsService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getGcOauthRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getGcOauthResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getDiOauth2Request());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getDiOauth2Response());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getOauth2Request());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getOauth2Response());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getSipCredentialsRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(8, getSipCredentialsResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CredentialsServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<DIOAuth2CredentialsRequest, DIOAuth2CredentialsRequest.Builder, DIOAuth2CredentialsRequestOrBuilder> diOauth2RequestBuilder_;
            private DIOAuth2CredentialsRequest diOauth2Request_;
            private SingleFieldBuilderV3<DIOAuth2CredentialsResponse, DIOAuth2CredentialsResponse.Builder, DIOAuth2CredentialsResponseOrBuilder> diOauth2ResponseBuilder_;
            private DIOAuth2CredentialsResponse diOauth2Response_;
            private SingleFieldBuilderV3<GCOAuthCredentialsRequest, GCOAuthCredentialsRequest.Builder, GCOAuthCredentialsRequestOrBuilder> gcOauthRequestBuilder_;
            private GCOAuthCredentialsRequest gcOauthRequest_;
            private SingleFieldBuilderV3<GCOAuthCredentialsResponse, GCOAuthCredentialsResponse.Builder, GCOAuthCredentialsResponseOrBuilder> gcOauthResponseBuilder_;
            private GCOAuthCredentialsResponse gcOauthResponse_;
            private SingleFieldBuilderV3<OAuth2CredentialsRequest, OAuth2CredentialsRequest.Builder, OAuth2CredentialsRequestOrBuilder> oauth2RequestBuilder_;
            private OAuth2CredentialsRequest oauth2Request_;
            private SingleFieldBuilderV3<OAuth2CredentialsResponse, OAuth2CredentialsResponse.Builder, OAuth2CredentialsResponseOrBuilder> oauth2ResponseBuilder_;
            private OAuth2CredentialsResponse oauth2Response_;
            private SingleFieldBuilderV3<SIPCredentialsRequest, SIPCredentialsRequest.Builder, SIPCredentialsRequestOrBuilder> sipCredentialsRequestBuilder_;
            private SIPCredentialsRequest sipCredentialsRequest_;
            private SingleFieldBuilderV3<SIPCredentialsResponse, SIPCredentialsResponse.Builder, SIPCredentialsResponseOrBuilder> sipCredentialsResponseBuilder_;
            private SIPCredentialsResponse sipCredentialsResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(CredentialsService credentialsService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<GCOAuthCredentialsRequest, GCOAuthCredentialsRequest.Builder, GCOAuthCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.gcOauthRequestBuilder_;
                    credentialsService.gcOauthRequest_ = singleFieldBuilderV3 == null ? this.gcOauthRequest_ : (GCOAuthCredentialsRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<GCOAuthCredentialsResponse, GCOAuthCredentialsResponse.Builder, GCOAuthCredentialsResponseOrBuilder> singleFieldBuilderV4 = this.gcOauthResponseBuilder_;
                    credentialsService.gcOauthResponse_ = singleFieldBuilderV4 == null ? this.gcOauthResponse_ : (GCOAuthCredentialsResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<DIOAuth2CredentialsRequest, DIOAuth2CredentialsRequest.Builder, DIOAuth2CredentialsRequestOrBuilder> singleFieldBuilderV5 = this.diOauth2RequestBuilder_;
                    credentialsService.diOauth2Request_ = singleFieldBuilderV5 == null ? this.diOauth2Request_ : (DIOAuth2CredentialsRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<DIOAuth2CredentialsResponse, DIOAuth2CredentialsResponse.Builder, DIOAuth2CredentialsResponseOrBuilder> singleFieldBuilderV6 = this.diOauth2ResponseBuilder_;
                    credentialsService.diOauth2Response_ = singleFieldBuilderV6 == null ? this.diOauth2Response_ : (DIOAuth2CredentialsResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<OAuth2CredentialsRequest, OAuth2CredentialsRequest.Builder, OAuth2CredentialsRequestOrBuilder> singleFieldBuilderV7 = this.oauth2RequestBuilder_;
                    credentialsService.oauth2Request_ = singleFieldBuilderV7 == null ? this.oauth2Request_ : (OAuth2CredentialsRequest) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<OAuth2CredentialsResponse, OAuth2CredentialsResponse.Builder, OAuth2CredentialsResponseOrBuilder> singleFieldBuilderV8 = this.oauth2ResponseBuilder_;
                    credentialsService.oauth2Response_ = singleFieldBuilderV8 == null ? this.oauth2Response_ : (OAuth2CredentialsResponse) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<SIPCredentialsRequest, SIPCredentialsRequest.Builder, SIPCredentialsRequestOrBuilder> singleFieldBuilderV9 = this.sipCredentialsRequestBuilder_;
                    credentialsService.sipCredentialsRequest_ = singleFieldBuilderV9 == null ? this.sipCredentialsRequest_ : (SIPCredentialsRequest) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<SIPCredentialsResponse, SIPCredentialsResponse.Builder, SIPCredentialsResponseOrBuilder> singleFieldBuilderV10 = this.sipCredentialsResponseBuilder_;
                    credentialsService.sipCredentialsResponse_ = singleFieldBuilderV10 == null ? this.sipCredentialsResponse_ : (SIPCredentialsResponse) singleFieldBuilderV10.build();
                    i14 |= 128;
                }
                credentialsService.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICredentials.internal_static_GDI_Proto_Credentials_CredentialsService_descriptor;
            }

            private SingleFieldBuilderV3<DIOAuth2CredentialsRequest, DIOAuth2CredentialsRequest.Builder, DIOAuth2CredentialsRequestOrBuilder> getDiOauth2RequestFieldBuilder() {
                if (this.diOauth2RequestBuilder_ == null) {
                    this.diOauth2RequestBuilder_ = new SingleFieldBuilderV3<>(getDiOauth2Request(), getParentForChildren(), isClean());
                    this.diOauth2Request_ = null;
                }
                return this.diOauth2RequestBuilder_;
            }

            private SingleFieldBuilderV3<DIOAuth2CredentialsResponse, DIOAuth2CredentialsResponse.Builder, DIOAuth2CredentialsResponseOrBuilder> getDiOauth2ResponseFieldBuilder() {
                if (this.diOauth2ResponseBuilder_ == null) {
                    this.diOauth2ResponseBuilder_ = new SingleFieldBuilderV3<>(getDiOauth2Response(), getParentForChildren(), isClean());
                    this.diOauth2Response_ = null;
                }
                return this.diOauth2ResponseBuilder_;
            }

            private SingleFieldBuilderV3<GCOAuthCredentialsRequest, GCOAuthCredentialsRequest.Builder, GCOAuthCredentialsRequestOrBuilder> getGcOauthRequestFieldBuilder() {
                if (this.gcOauthRequestBuilder_ == null) {
                    this.gcOauthRequestBuilder_ = new SingleFieldBuilderV3<>(getGcOauthRequest(), getParentForChildren(), isClean());
                    this.gcOauthRequest_ = null;
                }
                return this.gcOauthRequestBuilder_;
            }

            private SingleFieldBuilderV3<GCOAuthCredentialsResponse, GCOAuthCredentialsResponse.Builder, GCOAuthCredentialsResponseOrBuilder> getGcOauthResponseFieldBuilder() {
                if (this.gcOauthResponseBuilder_ == null) {
                    this.gcOauthResponseBuilder_ = new SingleFieldBuilderV3<>(getGcOauthResponse(), getParentForChildren(), isClean());
                    this.gcOauthResponse_ = null;
                }
                return this.gcOauthResponseBuilder_;
            }

            private SingleFieldBuilderV3<OAuth2CredentialsRequest, OAuth2CredentialsRequest.Builder, OAuth2CredentialsRequestOrBuilder> getOauth2RequestFieldBuilder() {
                if (this.oauth2RequestBuilder_ == null) {
                    this.oauth2RequestBuilder_ = new SingleFieldBuilderV3<>(getOauth2Request(), getParentForChildren(), isClean());
                    this.oauth2Request_ = null;
                }
                return this.oauth2RequestBuilder_;
            }

            private SingleFieldBuilderV3<OAuth2CredentialsResponse, OAuth2CredentialsResponse.Builder, OAuth2CredentialsResponseOrBuilder> getOauth2ResponseFieldBuilder() {
                if (this.oauth2ResponseBuilder_ == null) {
                    this.oauth2ResponseBuilder_ = new SingleFieldBuilderV3<>(getOauth2Response(), getParentForChildren(), isClean());
                    this.oauth2Response_ = null;
                }
                return this.oauth2ResponseBuilder_;
            }

            private SingleFieldBuilderV3<SIPCredentialsRequest, SIPCredentialsRequest.Builder, SIPCredentialsRequestOrBuilder> getSipCredentialsRequestFieldBuilder() {
                if (this.sipCredentialsRequestBuilder_ == null) {
                    this.sipCredentialsRequestBuilder_ = new SingleFieldBuilderV3<>(getSipCredentialsRequest(), getParentForChildren(), isClean());
                    this.sipCredentialsRequest_ = null;
                }
                return this.sipCredentialsRequestBuilder_;
            }

            private SingleFieldBuilderV3<SIPCredentialsResponse, SIPCredentialsResponse.Builder, SIPCredentialsResponseOrBuilder> getSipCredentialsResponseFieldBuilder() {
                if (this.sipCredentialsResponseBuilder_ == null) {
                    this.sipCredentialsResponseBuilder_ = new SingleFieldBuilderV3<>(getSipCredentialsResponse(), getParentForChildren(), isClean());
                    this.sipCredentialsResponse_ = null;
                }
                return this.sipCredentialsResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getGcOauthRequestFieldBuilder();
                    getGcOauthResponseFieldBuilder();
                    getDiOauth2RequestFieldBuilder();
                    getDiOauth2ResponseFieldBuilder();
                    getOauth2RequestFieldBuilder();
                    getOauth2ResponseFieldBuilder();
                    getSipCredentialsRequestFieldBuilder();
                    getSipCredentialsResponseFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CredentialsService build() {
                CredentialsService credentialsServiceBuildPartial = buildPartial();
                if (credentialsServiceBuildPartial.isInitialized()) {
                    return credentialsServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) credentialsServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CredentialsService buildPartial() {
                CredentialsService credentialsService = new CredentialsService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(credentialsService);
                }
                onBuilt();
                return credentialsService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.gcOauthRequest_ = null;
                SingleFieldBuilderV3<GCOAuthCredentialsRequest, GCOAuthCredentialsRequest.Builder, GCOAuthCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.gcOauthRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.gcOauthRequestBuilder_ = null;
                }
                this.gcOauthResponse_ = null;
                SingleFieldBuilderV3<GCOAuthCredentialsResponse, GCOAuthCredentialsResponse.Builder, GCOAuthCredentialsResponseOrBuilder> singleFieldBuilderV4 = this.gcOauthResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.gcOauthResponseBuilder_ = null;
                }
                this.diOauth2Request_ = null;
                SingleFieldBuilderV3<DIOAuth2CredentialsRequest, DIOAuth2CredentialsRequest.Builder, DIOAuth2CredentialsRequestOrBuilder> singleFieldBuilderV5 = this.diOauth2RequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.diOauth2RequestBuilder_ = null;
                }
                this.diOauth2Response_ = null;
                SingleFieldBuilderV3<DIOAuth2CredentialsResponse, DIOAuth2CredentialsResponse.Builder, DIOAuth2CredentialsResponseOrBuilder> singleFieldBuilderV6 = this.diOauth2ResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.diOauth2ResponseBuilder_ = null;
                }
                this.oauth2Request_ = null;
                SingleFieldBuilderV3<OAuth2CredentialsRequest, OAuth2CredentialsRequest.Builder, OAuth2CredentialsRequestOrBuilder> singleFieldBuilderV7 = this.oauth2RequestBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.oauth2RequestBuilder_ = null;
                }
                this.oauth2Response_ = null;
                SingleFieldBuilderV3<OAuth2CredentialsResponse, OAuth2CredentialsResponse.Builder, OAuth2CredentialsResponseOrBuilder> singleFieldBuilderV8 = this.oauth2ResponseBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.oauth2ResponseBuilder_ = null;
                }
                this.sipCredentialsRequest_ = null;
                SingleFieldBuilderV3<SIPCredentialsRequest, SIPCredentialsRequest.Builder, SIPCredentialsRequestOrBuilder> singleFieldBuilderV9 = this.sipCredentialsRequestBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.sipCredentialsRequestBuilder_ = null;
                }
                this.sipCredentialsResponse_ = null;
                SingleFieldBuilderV3<SIPCredentialsResponse, SIPCredentialsResponse.Builder, SIPCredentialsResponseOrBuilder> singleFieldBuilderV10 = this.sipCredentialsResponseBuilder_;
                if (singleFieldBuilderV10 != null) {
                    singleFieldBuilderV10.dispose();
                    this.sipCredentialsResponseBuilder_ = null;
                }
                return this;
            }

            public Builder clearDiOauth2Request() {
                this.bitField0_ &= -5;
                this.diOauth2Request_ = null;
                SingleFieldBuilderV3<DIOAuth2CredentialsRequest, DIOAuth2CredentialsRequest.Builder, DIOAuth2CredentialsRequestOrBuilder> singleFieldBuilderV3 = this.diOauth2RequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.diOauth2RequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearDiOauth2Response() {
                this.bitField0_ &= -9;
                this.diOauth2Response_ = null;
                SingleFieldBuilderV3<DIOAuth2CredentialsResponse, DIOAuth2CredentialsResponse.Builder, DIOAuth2CredentialsResponseOrBuilder> singleFieldBuilderV3 = this.diOauth2ResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.diOauth2ResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGcOauthRequest() {
                this.bitField0_ &= -2;
                this.gcOauthRequest_ = null;
                SingleFieldBuilderV3<GCOAuthCredentialsRequest, GCOAuthCredentialsRequest.Builder, GCOAuthCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.gcOauthRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.gcOauthRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearGcOauthResponse() {
                this.bitField0_ &= -3;
                this.gcOauthResponse_ = null;
                SingleFieldBuilderV3<GCOAuthCredentialsResponse, GCOAuthCredentialsResponse.Builder, GCOAuthCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.gcOauthResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.gcOauthResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearOauth2Request() {
                this.bitField0_ &= -17;
                this.oauth2Request_ = null;
                SingleFieldBuilderV3<OAuth2CredentialsRequest, OAuth2CredentialsRequest.Builder, OAuth2CredentialsRequestOrBuilder> singleFieldBuilderV3 = this.oauth2RequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.oauth2RequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearOauth2Response() {
                this.bitField0_ &= -33;
                this.oauth2Response_ = null;
                SingleFieldBuilderV3<OAuth2CredentialsResponse, OAuth2CredentialsResponse.Builder, OAuth2CredentialsResponseOrBuilder> singleFieldBuilderV3 = this.oauth2ResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.oauth2ResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSipCredentialsRequest() {
                this.bitField0_ &= -65;
                this.sipCredentialsRequest_ = null;
                SingleFieldBuilderV3<SIPCredentialsRequest, SIPCredentialsRequest.Builder, SIPCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.sipCredentialsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sipCredentialsRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSipCredentialsResponse() {
                this.bitField0_ &= -129;
                this.sipCredentialsResponse_ = null;
                SingleFieldBuilderV3<SIPCredentialsResponse, SIPCredentialsResponse.Builder, SIPCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.sipCredentialsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sipCredentialsResponseBuilder_ = null;
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
                return GDICredentials.internal_static_GDI_Proto_Credentials_CredentialsService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
            public DIOAuth2CredentialsRequest getDiOauth2Request() {
                SingleFieldBuilderV3<DIOAuth2CredentialsRequest, DIOAuth2CredentialsRequest.Builder, DIOAuth2CredentialsRequestOrBuilder> singleFieldBuilderV3 = this.diOauth2RequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DIOAuth2CredentialsRequest) singleFieldBuilderV3.getMessage();
                }
                DIOAuth2CredentialsRequest dIOAuth2CredentialsRequest = this.diOauth2Request_;
                return dIOAuth2CredentialsRequest == null ? DIOAuth2CredentialsRequest.getDefaultInstance() : dIOAuth2CredentialsRequest;
            }

            public DIOAuth2CredentialsRequest.Builder getDiOauth2RequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (DIOAuth2CredentialsRequest.Builder) getDiOauth2RequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
            public DIOAuth2CredentialsRequestOrBuilder getDiOauth2RequestOrBuilder() {
                SingleFieldBuilderV3<DIOAuth2CredentialsRequest, DIOAuth2CredentialsRequest.Builder, DIOAuth2CredentialsRequestOrBuilder> singleFieldBuilderV3 = this.diOauth2RequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DIOAuth2CredentialsRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DIOAuth2CredentialsRequest dIOAuth2CredentialsRequest = this.diOauth2Request_;
                return dIOAuth2CredentialsRequest == null ? DIOAuth2CredentialsRequest.getDefaultInstance() : dIOAuth2CredentialsRequest;
            }

            @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
            public DIOAuth2CredentialsResponse getDiOauth2Response() {
                SingleFieldBuilderV3<DIOAuth2CredentialsResponse, DIOAuth2CredentialsResponse.Builder, DIOAuth2CredentialsResponseOrBuilder> singleFieldBuilderV3 = this.diOauth2ResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DIOAuth2CredentialsResponse) singleFieldBuilderV3.getMessage();
                }
                DIOAuth2CredentialsResponse dIOAuth2CredentialsResponse = this.diOauth2Response_;
                return dIOAuth2CredentialsResponse == null ? DIOAuth2CredentialsResponse.getDefaultInstance() : dIOAuth2CredentialsResponse;
            }

            public DIOAuth2CredentialsResponse.Builder getDiOauth2ResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (DIOAuth2CredentialsResponse.Builder) getDiOauth2ResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
            public DIOAuth2CredentialsResponseOrBuilder getDiOauth2ResponseOrBuilder() {
                SingleFieldBuilderV3<DIOAuth2CredentialsResponse, DIOAuth2CredentialsResponse.Builder, DIOAuth2CredentialsResponseOrBuilder> singleFieldBuilderV3 = this.diOauth2ResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DIOAuth2CredentialsResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DIOAuth2CredentialsResponse dIOAuth2CredentialsResponse = this.diOauth2Response_;
                return dIOAuth2CredentialsResponse == null ? DIOAuth2CredentialsResponse.getDefaultInstance() : dIOAuth2CredentialsResponse;
            }

            @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
            public GCOAuthCredentialsRequest getGcOauthRequest() {
                SingleFieldBuilderV3<GCOAuthCredentialsRequest, GCOAuthCredentialsRequest.Builder, GCOAuthCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.gcOauthRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GCOAuthCredentialsRequest) singleFieldBuilderV3.getMessage();
                }
                GCOAuthCredentialsRequest gCOAuthCredentialsRequest = this.gcOauthRequest_;
                return gCOAuthCredentialsRequest == null ? GCOAuthCredentialsRequest.getDefaultInstance() : gCOAuthCredentialsRequest;
            }

            public GCOAuthCredentialsRequest.Builder getGcOauthRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (GCOAuthCredentialsRequest.Builder) getGcOauthRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
            public GCOAuthCredentialsRequestOrBuilder getGcOauthRequestOrBuilder() {
                SingleFieldBuilderV3<GCOAuthCredentialsRequest, GCOAuthCredentialsRequest.Builder, GCOAuthCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.gcOauthRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GCOAuthCredentialsRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GCOAuthCredentialsRequest gCOAuthCredentialsRequest = this.gcOauthRequest_;
                return gCOAuthCredentialsRequest == null ? GCOAuthCredentialsRequest.getDefaultInstance() : gCOAuthCredentialsRequest;
            }

            @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
            public GCOAuthCredentialsResponse getGcOauthResponse() {
                SingleFieldBuilderV3<GCOAuthCredentialsResponse, GCOAuthCredentialsResponse.Builder, GCOAuthCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.gcOauthResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GCOAuthCredentialsResponse) singleFieldBuilderV3.getMessage();
                }
                GCOAuthCredentialsResponse gCOAuthCredentialsResponse = this.gcOauthResponse_;
                return gCOAuthCredentialsResponse == null ? GCOAuthCredentialsResponse.getDefaultInstance() : gCOAuthCredentialsResponse;
            }

            public GCOAuthCredentialsResponse.Builder getGcOauthResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (GCOAuthCredentialsResponse.Builder) getGcOauthResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
            public GCOAuthCredentialsResponseOrBuilder getGcOauthResponseOrBuilder() {
                SingleFieldBuilderV3<GCOAuthCredentialsResponse, GCOAuthCredentialsResponse.Builder, GCOAuthCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.gcOauthResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GCOAuthCredentialsResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GCOAuthCredentialsResponse gCOAuthCredentialsResponse = this.gcOauthResponse_;
                return gCOAuthCredentialsResponse == null ? GCOAuthCredentialsResponse.getDefaultInstance() : gCOAuthCredentialsResponse;
            }

            @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
            public OAuth2CredentialsRequest getOauth2Request() {
                SingleFieldBuilderV3<OAuth2CredentialsRequest, OAuth2CredentialsRequest.Builder, OAuth2CredentialsRequestOrBuilder> singleFieldBuilderV3 = this.oauth2RequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (OAuth2CredentialsRequest) singleFieldBuilderV3.getMessage();
                }
                OAuth2CredentialsRequest oAuth2CredentialsRequest = this.oauth2Request_;
                return oAuth2CredentialsRequest == null ? OAuth2CredentialsRequest.getDefaultInstance() : oAuth2CredentialsRequest;
            }

            public OAuth2CredentialsRequest.Builder getOauth2RequestBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (OAuth2CredentialsRequest.Builder) getOauth2RequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
            public OAuth2CredentialsRequestOrBuilder getOauth2RequestOrBuilder() {
                SingleFieldBuilderV3<OAuth2CredentialsRequest, OAuth2CredentialsRequest.Builder, OAuth2CredentialsRequestOrBuilder> singleFieldBuilderV3 = this.oauth2RequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (OAuth2CredentialsRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                OAuth2CredentialsRequest oAuth2CredentialsRequest = this.oauth2Request_;
                return oAuth2CredentialsRequest == null ? OAuth2CredentialsRequest.getDefaultInstance() : oAuth2CredentialsRequest;
            }

            @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
            public OAuth2CredentialsResponse getOauth2Response() {
                SingleFieldBuilderV3<OAuth2CredentialsResponse, OAuth2CredentialsResponse.Builder, OAuth2CredentialsResponseOrBuilder> singleFieldBuilderV3 = this.oauth2ResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (OAuth2CredentialsResponse) singleFieldBuilderV3.getMessage();
                }
                OAuth2CredentialsResponse oAuth2CredentialsResponse = this.oauth2Response_;
                return oAuth2CredentialsResponse == null ? OAuth2CredentialsResponse.getDefaultInstance() : oAuth2CredentialsResponse;
            }

            public OAuth2CredentialsResponse.Builder getOauth2ResponseBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (OAuth2CredentialsResponse.Builder) getOauth2ResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
            public OAuth2CredentialsResponseOrBuilder getOauth2ResponseOrBuilder() {
                SingleFieldBuilderV3<OAuth2CredentialsResponse, OAuth2CredentialsResponse.Builder, OAuth2CredentialsResponseOrBuilder> singleFieldBuilderV3 = this.oauth2ResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (OAuth2CredentialsResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                OAuth2CredentialsResponse oAuth2CredentialsResponse = this.oauth2Response_;
                return oAuth2CredentialsResponse == null ? OAuth2CredentialsResponse.getDefaultInstance() : oAuth2CredentialsResponse;
            }

            @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
            public SIPCredentialsRequest getSipCredentialsRequest() {
                SingleFieldBuilderV3<SIPCredentialsRequest, SIPCredentialsRequest.Builder, SIPCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.sipCredentialsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SIPCredentialsRequest) singleFieldBuilderV3.getMessage();
                }
                SIPCredentialsRequest sIPCredentialsRequest = this.sipCredentialsRequest_;
                return sIPCredentialsRequest == null ? SIPCredentialsRequest.getDefaultInstance() : sIPCredentialsRequest;
            }

            public SIPCredentialsRequest.Builder getSipCredentialsRequestBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (SIPCredentialsRequest.Builder) getSipCredentialsRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
            public SIPCredentialsRequestOrBuilder getSipCredentialsRequestOrBuilder() {
                SingleFieldBuilderV3<SIPCredentialsRequest, SIPCredentialsRequest.Builder, SIPCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.sipCredentialsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SIPCredentialsRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SIPCredentialsRequest sIPCredentialsRequest = this.sipCredentialsRequest_;
                return sIPCredentialsRequest == null ? SIPCredentialsRequest.getDefaultInstance() : sIPCredentialsRequest;
            }

            @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
            public SIPCredentialsResponse getSipCredentialsResponse() {
                SingleFieldBuilderV3<SIPCredentialsResponse, SIPCredentialsResponse.Builder, SIPCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.sipCredentialsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SIPCredentialsResponse) singleFieldBuilderV3.getMessage();
                }
                SIPCredentialsResponse sIPCredentialsResponse = this.sipCredentialsResponse_;
                return sIPCredentialsResponse == null ? SIPCredentialsResponse.getDefaultInstance() : sIPCredentialsResponse;
            }

            public SIPCredentialsResponse.Builder getSipCredentialsResponseBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (SIPCredentialsResponse.Builder) getSipCredentialsResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
            public SIPCredentialsResponseOrBuilder getSipCredentialsResponseOrBuilder() {
                SingleFieldBuilderV3<SIPCredentialsResponse, SIPCredentialsResponse.Builder, SIPCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.sipCredentialsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SIPCredentialsResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SIPCredentialsResponse sIPCredentialsResponse = this.sipCredentialsResponse_;
                return sIPCredentialsResponse == null ? SIPCredentialsResponse.getDefaultInstance() : sIPCredentialsResponse;
            }

            @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
            public boolean hasDiOauth2Request() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
            public boolean hasDiOauth2Response() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
            public boolean hasGcOauthRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
            public boolean hasGcOauthResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
            public boolean hasOauth2Request() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
            public boolean hasOauth2Response() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
            public boolean hasSipCredentialsRequest() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDICredentials.CredentialsServiceOrBuilder
            public boolean hasSipCredentialsResponse() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICredentials.internal_static_GDI_Proto_Credentials_CredentialsService_fieldAccessorTable.ensureFieldAccessorsInitialized(CredentialsService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasGcOauthResponse() && !getGcOauthResponse().isInitialized()) {
                    return false;
                }
                if (!hasOauth2Request() || getOauth2Request().isInitialized()) {
                    return !hasOauth2Response() || getOauth2Response().isInitialized();
                }
                return false;
            }

            public Builder mergeDiOauth2Request(DIOAuth2CredentialsRequest dIOAuth2CredentialsRequest) {
                DIOAuth2CredentialsRequest dIOAuth2CredentialsRequest2;
                SingleFieldBuilderV3<DIOAuth2CredentialsRequest, DIOAuth2CredentialsRequest.Builder, DIOAuth2CredentialsRequestOrBuilder> singleFieldBuilderV3 = this.diOauth2RequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(dIOAuth2CredentialsRequest);
                } else if ((this.bitField0_ & 4) == 0 || (dIOAuth2CredentialsRequest2 = this.diOauth2Request_) == null || dIOAuth2CredentialsRequest2 == DIOAuth2CredentialsRequest.getDefaultInstance()) {
                    this.diOauth2Request_ = dIOAuth2CredentialsRequest;
                } else {
                    getDiOauth2RequestBuilder().mergeFrom(dIOAuth2CredentialsRequest);
                }
                if (this.diOauth2Request_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeDiOauth2Response(DIOAuth2CredentialsResponse dIOAuth2CredentialsResponse) {
                DIOAuth2CredentialsResponse dIOAuth2CredentialsResponse2;
                SingleFieldBuilderV3<DIOAuth2CredentialsResponse, DIOAuth2CredentialsResponse.Builder, DIOAuth2CredentialsResponseOrBuilder> singleFieldBuilderV3 = this.diOauth2ResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(dIOAuth2CredentialsResponse);
                } else if ((this.bitField0_ & 8) == 0 || (dIOAuth2CredentialsResponse2 = this.diOauth2Response_) == null || dIOAuth2CredentialsResponse2 == DIOAuth2CredentialsResponse.getDefaultInstance()) {
                    this.diOauth2Response_ = dIOAuth2CredentialsResponse;
                } else {
                    getDiOauth2ResponseBuilder().mergeFrom(dIOAuth2CredentialsResponse);
                }
                if (this.diOauth2Response_ != null) {
                    this.bitField0_ |= 8;
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
                                    codedInputStream.readMessage(getGcOauthRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getGcOauthResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getDiOauth2RequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getDiOauth2ResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(getOauth2RequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                } else if (tag == 50) {
                                    codedInputStream.readMessage(getOauth2ResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                } else if (tag == 58) {
                                    codedInputStream.readMessage(getSipCredentialsRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                } else if (tag == 66) {
                                    codedInputStream.readMessage(getSipCredentialsResponseFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeGcOauthRequest(GCOAuthCredentialsRequest gCOAuthCredentialsRequest) {
                GCOAuthCredentialsRequest gCOAuthCredentialsRequest2;
                SingleFieldBuilderV3<GCOAuthCredentialsRequest, GCOAuthCredentialsRequest.Builder, GCOAuthCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.gcOauthRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(gCOAuthCredentialsRequest);
                } else if ((this.bitField0_ & 1) == 0 || (gCOAuthCredentialsRequest2 = this.gcOauthRequest_) == null || gCOAuthCredentialsRequest2 == GCOAuthCredentialsRequest.getDefaultInstance()) {
                    this.gcOauthRequest_ = gCOAuthCredentialsRequest;
                } else {
                    getGcOauthRequestBuilder().mergeFrom(gCOAuthCredentialsRequest);
                }
                if (this.gcOauthRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeGcOauthResponse(GCOAuthCredentialsResponse gCOAuthCredentialsResponse) {
                GCOAuthCredentialsResponse gCOAuthCredentialsResponse2;
                SingleFieldBuilderV3<GCOAuthCredentialsResponse, GCOAuthCredentialsResponse.Builder, GCOAuthCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.gcOauthResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(gCOAuthCredentialsResponse);
                } else if ((this.bitField0_ & 2) == 0 || (gCOAuthCredentialsResponse2 = this.gcOauthResponse_) == null || gCOAuthCredentialsResponse2 == GCOAuthCredentialsResponse.getDefaultInstance()) {
                    this.gcOauthResponse_ = gCOAuthCredentialsResponse;
                } else {
                    getGcOauthResponseBuilder().mergeFrom(gCOAuthCredentialsResponse);
                }
                if (this.gcOauthResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeOauth2Request(OAuth2CredentialsRequest oAuth2CredentialsRequest) {
                OAuth2CredentialsRequest oAuth2CredentialsRequest2;
                SingleFieldBuilderV3<OAuth2CredentialsRequest, OAuth2CredentialsRequest.Builder, OAuth2CredentialsRequestOrBuilder> singleFieldBuilderV3 = this.oauth2RequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(oAuth2CredentialsRequest);
                } else if ((this.bitField0_ & 16) == 0 || (oAuth2CredentialsRequest2 = this.oauth2Request_) == null || oAuth2CredentialsRequest2 == OAuth2CredentialsRequest.getDefaultInstance()) {
                    this.oauth2Request_ = oAuth2CredentialsRequest;
                } else {
                    getOauth2RequestBuilder().mergeFrom(oAuth2CredentialsRequest);
                }
                if (this.oauth2Request_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeOauth2Response(OAuth2CredentialsResponse oAuth2CredentialsResponse) {
                OAuth2CredentialsResponse oAuth2CredentialsResponse2;
                SingleFieldBuilderV3<OAuth2CredentialsResponse, OAuth2CredentialsResponse.Builder, OAuth2CredentialsResponseOrBuilder> singleFieldBuilderV3 = this.oauth2ResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(oAuth2CredentialsResponse);
                } else if ((this.bitField0_ & 32) == 0 || (oAuth2CredentialsResponse2 = this.oauth2Response_) == null || oAuth2CredentialsResponse2 == OAuth2CredentialsResponse.getDefaultInstance()) {
                    this.oauth2Response_ = oAuth2CredentialsResponse;
                } else {
                    getOauth2ResponseBuilder().mergeFrom(oAuth2CredentialsResponse);
                }
                if (this.oauth2Response_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSipCredentialsRequest(SIPCredentialsRequest sIPCredentialsRequest) {
                SIPCredentialsRequest sIPCredentialsRequest2;
                SingleFieldBuilderV3<SIPCredentialsRequest, SIPCredentialsRequest.Builder, SIPCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.sipCredentialsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(sIPCredentialsRequest);
                } else if ((this.bitField0_ & 64) == 0 || (sIPCredentialsRequest2 = this.sipCredentialsRequest_) == null || sIPCredentialsRequest2 == SIPCredentialsRequest.getDefaultInstance()) {
                    this.sipCredentialsRequest_ = sIPCredentialsRequest;
                } else {
                    getSipCredentialsRequestBuilder().mergeFrom(sIPCredentialsRequest);
                }
                if (this.sipCredentialsRequest_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSipCredentialsResponse(SIPCredentialsResponse sIPCredentialsResponse) {
                SIPCredentialsResponse sIPCredentialsResponse2;
                SingleFieldBuilderV3<SIPCredentialsResponse, SIPCredentialsResponse.Builder, SIPCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.sipCredentialsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(sIPCredentialsResponse);
                } else if ((this.bitField0_ & 128) == 0 || (sIPCredentialsResponse2 = this.sipCredentialsResponse_) == null || sIPCredentialsResponse2 == SIPCredentialsResponse.getDefaultInstance()) {
                    this.sipCredentialsResponse_ = sIPCredentialsResponse;
                } else {
                    getSipCredentialsResponseBuilder().mergeFrom(sIPCredentialsResponse);
                }
                if (this.sipCredentialsResponse_ != null) {
                    this.bitField0_ |= 128;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setDiOauth2Request(DIOAuth2CredentialsRequest.Builder builder) {
                SingleFieldBuilderV3<DIOAuth2CredentialsRequest, DIOAuth2CredentialsRequest.Builder, DIOAuth2CredentialsRequestOrBuilder> singleFieldBuilderV3 = this.diOauth2RequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.diOauth2Request_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setDiOauth2Response(DIOAuth2CredentialsResponse.Builder builder) {
                SingleFieldBuilderV3<DIOAuth2CredentialsResponse, DIOAuth2CredentialsResponse.Builder, DIOAuth2CredentialsResponseOrBuilder> singleFieldBuilderV3 = this.diOauth2ResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.diOauth2Response_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setGcOauthRequest(GCOAuthCredentialsRequest.Builder builder) {
                SingleFieldBuilderV3<GCOAuthCredentialsRequest, GCOAuthCredentialsRequest.Builder, GCOAuthCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.gcOauthRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.gcOauthRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setGcOauthResponse(GCOAuthCredentialsResponse.Builder builder) {
                SingleFieldBuilderV3<GCOAuthCredentialsResponse, GCOAuthCredentialsResponse.Builder, GCOAuthCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.gcOauthResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.gcOauthResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setOauth2Request(OAuth2CredentialsRequest.Builder builder) {
                SingleFieldBuilderV3<OAuth2CredentialsRequest, OAuth2CredentialsRequest.Builder, OAuth2CredentialsRequestOrBuilder> singleFieldBuilderV3 = this.oauth2RequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.oauth2Request_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setOauth2Response(OAuth2CredentialsResponse.Builder builder) {
                SingleFieldBuilderV3<OAuth2CredentialsResponse, OAuth2CredentialsResponse.Builder, OAuth2CredentialsResponseOrBuilder> singleFieldBuilderV3 = this.oauth2ResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.oauth2Response_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSipCredentialsRequest(SIPCredentialsRequest.Builder builder) {
                SingleFieldBuilderV3<SIPCredentialsRequest, SIPCredentialsRequest.Builder, SIPCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.sipCredentialsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.sipCredentialsRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setSipCredentialsResponse(SIPCredentialsResponse.Builder builder) {
                SingleFieldBuilderV3<SIPCredentialsResponse, SIPCredentialsResponse.Builder, SIPCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.sipCredentialsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.sipCredentialsResponse_ = builder.build();
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

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CredentialsService getDefaultInstanceForType() {
                return CredentialsService.getDefaultInstance();
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

            public Builder setDiOauth2Request(DIOAuth2CredentialsRequest dIOAuth2CredentialsRequest) {
                SingleFieldBuilderV3<DIOAuth2CredentialsRequest, DIOAuth2CredentialsRequest.Builder, DIOAuth2CredentialsRequestOrBuilder> singleFieldBuilderV3 = this.diOauth2RequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    dIOAuth2CredentialsRequest.getClass();
                    this.diOauth2Request_ = dIOAuth2CredentialsRequest;
                } else {
                    singleFieldBuilderV3.setMessage(dIOAuth2CredentialsRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setDiOauth2Response(DIOAuth2CredentialsResponse dIOAuth2CredentialsResponse) {
                SingleFieldBuilderV3<DIOAuth2CredentialsResponse, DIOAuth2CredentialsResponse.Builder, DIOAuth2CredentialsResponseOrBuilder> singleFieldBuilderV3 = this.diOauth2ResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    dIOAuth2CredentialsResponse.getClass();
                    this.diOauth2Response_ = dIOAuth2CredentialsResponse;
                } else {
                    singleFieldBuilderV3.setMessage(dIOAuth2CredentialsResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setGcOauthRequest(GCOAuthCredentialsRequest gCOAuthCredentialsRequest) {
                SingleFieldBuilderV3<GCOAuthCredentialsRequest, GCOAuthCredentialsRequest.Builder, GCOAuthCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.gcOauthRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    gCOAuthCredentialsRequest.getClass();
                    this.gcOauthRequest_ = gCOAuthCredentialsRequest;
                } else {
                    singleFieldBuilderV3.setMessage(gCOAuthCredentialsRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setGcOauthResponse(GCOAuthCredentialsResponse gCOAuthCredentialsResponse) {
                SingleFieldBuilderV3<GCOAuthCredentialsResponse, GCOAuthCredentialsResponse.Builder, GCOAuthCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.gcOauthResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    gCOAuthCredentialsResponse.getClass();
                    this.gcOauthResponse_ = gCOAuthCredentialsResponse;
                } else {
                    singleFieldBuilderV3.setMessage(gCOAuthCredentialsResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setOauth2Request(OAuth2CredentialsRequest oAuth2CredentialsRequest) {
                SingleFieldBuilderV3<OAuth2CredentialsRequest, OAuth2CredentialsRequest.Builder, OAuth2CredentialsRequestOrBuilder> singleFieldBuilderV3 = this.oauth2RequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    oAuth2CredentialsRequest.getClass();
                    this.oauth2Request_ = oAuth2CredentialsRequest;
                } else {
                    singleFieldBuilderV3.setMessage(oAuth2CredentialsRequest);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setOauth2Response(OAuth2CredentialsResponse oAuth2CredentialsResponse) {
                SingleFieldBuilderV3<OAuth2CredentialsResponse, OAuth2CredentialsResponse.Builder, OAuth2CredentialsResponseOrBuilder> singleFieldBuilderV3 = this.oauth2ResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    oAuth2CredentialsResponse.getClass();
                    this.oauth2Response_ = oAuth2CredentialsResponse;
                } else {
                    singleFieldBuilderV3.setMessage(oAuth2CredentialsResponse);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setSipCredentialsRequest(SIPCredentialsRequest sIPCredentialsRequest) {
                SingleFieldBuilderV3<SIPCredentialsRequest, SIPCredentialsRequest.Builder, SIPCredentialsRequestOrBuilder> singleFieldBuilderV3 = this.sipCredentialsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    sIPCredentialsRequest.getClass();
                    this.sipCredentialsRequest_ = sIPCredentialsRequest;
                } else {
                    singleFieldBuilderV3.setMessage(sIPCredentialsRequest);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setSipCredentialsResponse(SIPCredentialsResponse sIPCredentialsResponse) {
                SingleFieldBuilderV3<SIPCredentialsResponse, SIPCredentialsResponse.Builder, SIPCredentialsResponseOrBuilder> singleFieldBuilderV3 = this.sipCredentialsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    sIPCredentialsResponse.getClass();
                    this.sipCredentialsResponse_ = sIPCredentialsResponse;
                } else {
                    singleFieldBuilderV3.setMessage(sIPCredentialsResponse);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CredentialsService) {
                    return mergeFrom((CredentialsService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CredentialsService credentialsService) {
                if (credentialsService == CredentialsService.getDefaultInstance()) {
                    return this;
                }
                if (credentialsService.hasGcOauthRequest()) {
                    mergeGcOauthRequest(credentialsService.getGcOauthRequest());
                }
                if (credentialsService.hasGcOauthResponse()) {
                    mergeGcOauthResponse(credentialsService.getGcOauthResponse());
                }
                if (credentialsService.hasDiOauth2Request()) {
                    mergeDiOauth2Request(credentialsService.getDiOauth2Request());
                }
                if (credentialsService.hasDiOauth2Response()) {
                    mergeDiOauth2Response(credentialsService.getDiOauth2Response());
                }
                if (credentialsService.hasOauth2Request()) {
                    mergeOauth2Request(credentialsService.getOauth2Request());
                }
                if (credentialsService.hasOauth2Response()) {
                    mergeOauth2Response(credentialsService.getOauth2Response());
                }
                if (credentialsService.hasSipCredentialsRequest()) {
                    mergeSipCredentialsRequest(credentialsService.getSipCredentialsRequest());
                }
                if (credentialsService.hasSipCredentialsResponse()) {
                    mergeSipCredentialsResponse(credentialsService.getSipCredentialsResponse());
                }
                mergeUnknownFields(credentialsService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CredentialsService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ CredentialsService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private CredentialsService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CredentialsService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CredentialsService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CredentialsService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CredentialsService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CredentialsService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CredentialsService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CredentialsService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CredentialsService parseFrom(InputStream inputStream) {
            return (CredentialsService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CredentialsService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CredentialsService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CredentialsService parseFrom(CodedInputStream codedInputStream) {
            return (CredentialsService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CredentialsService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CredentialsService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DIOAuth2Credentials extends GeneratedMessageV3 implements DIOAuth2CredentialsOrBuilder {
        public static final int ACCESS_TOKEN_FIELD_NUMBER = 1;
        public static final int EXPIRES_IN_FIELD_NUMBER = 4;
        public static final int JTI_FIELD_NUMBER = 6;
        public static final int MFA_EXPIRATION_TIMESTAMP_FIELD_NUMBER = 9;
        public static final int MFA_EXPIRATION_TIMESTAMP_MS_FIELD_NUMBER = 10;
        public static final int MFA_TOKEN_FIELD_NUMBER = 8;
        public static final int REFRESH_TOKEN_EXPIRES_IN_FIELD_NUMBER = 7;
        public static final int REFRESH_TOKEN_FIELD_NUMBER = 3;
        public static final int SCOPE_FIELD_NUMBER = 5;
        public static final int TOKEN_TYPE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private volatile Object accessToken_;
        private int bitField0_;
        private int expiresIn_;
        private volatile Object jti_;
        private byte memoizedIsInitialized;
        private long mfaExpirationTimestampMs_;
        private volatile Object mfaExpirationTimestamp_;
        private volatile Object mfaToken_;
        private int refreshTokenExpiresIn_;
        private volatile Object refreshToken_;
        private volatile Object scope_;
        private volatile Object tokenType_;
        private static final DIOAuth2Credentials DEFAULT_INSTANCE = new DIOAuth2Credentials();

        @Deprecated
        public static final Parser<DIOAuth2Credentials> PARSER = new AbstractParser<DIOAuth2Credentials>() { // from class: com.garmin.proto.generated.GDICredentials.DIOAuth2Credentials.1
            @Override // com.google.protobuf.Parser
            public DIOAuth2Credentials parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DIOAuth2Credentials.newBuilder();
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

        private DIOAuth2Credentials() {
            this.accessToken_ = "";
            this.tokenType_ = "";
            this.refreshToken_ = "";
            this.expiresIn_ = 0;
            this.scope_ = "";
            this.jti_ = "";
            this.refreshTokenExpiresIn_ = 0;
            this.mfaToken_ = "";
            this.mfaExpirationTimestamp_ = "";
            this.mfaExpirationTimestampMs_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
            this.accessToken_ = "";
            this.tokenType_ = "";
            this.refreshToken_ = "";
            this.scope_ = "";
            this.jti_ = "";
            this.mfaToken_ = "";
            this.mfaExpirationTimestamp_ = "";
        }

        public static DIOAuth2Credentials getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICredentials.internal_static_GDI_Proto_Credentials_DIOAuth2Credentials_descriptor;
        }

        public static Builder newBuilder(DIOAuth2Credentials dIOAuth2Credentials) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(dIOAuth2Credentials);
        }

        public static DIOAuth2Credentials parseDelimitedFrom(InputStream inputStream) {
            return (DIOAuth2Credentials) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DIOAuth2Credentials parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DIOAuth2Credentials> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DIOAuth2Credentials)) {
                return super.equals(obj);
            }
            DIOAuth2Credentials dIOAuth2Credentials = (DIOAuth2Credentials) obj;
            if (hasAccessToken() != dIOAuth2Credentials.hasAccessToken()) {
                return false;
            }
            if ((hasAccessToken() && !getAccessToken().equals(dIOAuth2Credentials.getAccessToken())) || hasTokenType() != dIOAuth2Credentials.hasTokenType()) {
                return false;
            }
            if ((hasTokenType() && !getTokenType().equals(dIOAuth2Credentials.getTokenType())) || hasRefreshToken() != dIOAuth2Credentials.hasRefreshToken()) {
                return false;
            }
            if ((hasRefreshToken() && !getRefreshToken().equals(dIOAuth2Credentials.getRefreshToken())) || hasExpiresIn() != dIOAuth2Credentials.hasExpiresIn()) {
                return false;
            }
            if ((hasExpiresIn() && getExpiresIn() != dIOAuth2Credentials.getExpiresIn()) || hasScope() != dIOAuth2Credentials.hasScope()) {
                return false;
            }
            if ((hasScope() && !getScope().equals(dIOAuth2Credentials.getScope())) || hasJti() != dIOAuth2Credentials.hasJti()) {
                return false;
            }
            if ((hasJti() && !getJti().equals(dIOAuth2Credentials.getJti())) || hasRefreshTokenExpiresIn() != dIOAuth2Credentials.hasRefreshTokenExpiresIn()) {
                return false;
            }
            if ((hasRefreshTokenExpiresIn() && getRefreshTokenExpiresIn() != dIOAuth2Credentials.getRefreshTokenExpiresIn()) || hasMfaToken() != dIOAuth2Credentials.hasMfaToken()) {
                return false;
            }
            if ((hasMfaToken() && !getMfaToken().equals(dIOAuth2Credentials.getMfaToken())) || hasMfaExpirationTimestamp() != dIOAuth2Credentials.hasMfaExpirationTimestamp()) {
                return false;
            }
            if ((!hasMfaExpirationTimestamp() || getMfaExpirationTimestamp().equals(dIOAuth2Credentials.getMfaExpirationTimestamp())) && hasMfaExpirationTimestampMs() == dIOAuth2Credentials.hasMfaExpirationTimestampMs()) {
                return (!hasMfaExpirationTimestampMs() || getMfaExpirationTimestampMs() == dIOAuth2Credentials.getMfaExpirationTimestampMs()) && getUnknownFields().equals(dIOAuth2Credentials.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
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

        @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
        public ByteString getAccessTokenBytes() {
            Object obj = this.accessToken_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.accessToken_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
        public int getExpiresIn() {
            return this.expiresIn_;
        }

        @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
        public String getJti() {
            Object obj = this.jti_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.jti_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
        public ByteString getJtiBytes() {
            Object obj = this.jti_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.jti_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
        public String getMfaExpirationTimestamp() {
            Object obj = this.mfaExpirationTimestamp_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.mfaExpirationTimestamp_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
        public ByteString getMfaExpirationTimestampBytes() {
            Object obj = this.mfaExpirationTimestamp_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.mfaExpirationTimestamp_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
        public long getMfaExpirationTimestampMs() {
            return this.mfaExpirationTimestampMs_;
        }

        @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
        public String getMfaToken() {
            Object obj = this.mfaToken_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.mfaToken_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
        public ByteString getMfaTokenBytes() {
            Object obj = this.mfaToken_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.mfaToken_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DIOAuth2Credentials> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
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

        @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
        public ByteString getRefreshTokenBytes() {
            Object obj = this.refreshToken_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.refreshToken_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
        public int getRefreshTokenExpiresIn() {
            return this.refreshTokenExpiresIn_;
        }

        @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
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

        @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
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
                iComputeStringSize += GeneratedMessageV3.computeStringSize(6, this.jti_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(7, this.refreshTokenExpiresIn_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(8, this.mfaToken_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(9, this.mfaExpirationTimestamp_);
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt64Size(10, this.mfaExpirationTimestampMs_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
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

        @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
        public ByteString getTokenTypeBytes() {
            Object obj = this.tokenType_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.tokenType_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
        public boolean hasAccessToken() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
        public boolean hasExpiresIn() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
        public boolean hasJti() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
        public boolean hasMfaExpirationTimestamp() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
        public boolean hasMfaExpirationTimestampMs() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
        public boolean hasMfaToken() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
        public boolean hasRefreshToken() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
        public boolean hasRefreshTokenExpiresIn() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
        public boolean hasScope() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
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
            if (hasJti()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getJti().hashCode();
            }
            if (hasRefreshTokenExpiresIn()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getRefreshTokenExpiresIn();
            }
            if (hasMfaToken()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getMfaToken().hashCode();
            }
            if (hasMfaExpirationTimestamp()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getMfaExpirationTimestamp().hashCode();
            }
            if (hasMfaExpirationTimestampMs()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + Internal.hashLong(getMfaExpirationTimestampMs());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICredentials.internal_static_GDI_Proto_Credentials_DIOAuth2Credentials_fieldAccessorTable.ensureFieldAccessorsInitialized(DIOAuth2Credentials.class, Builder.class);
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
            return new DIOAuth2Credentials();
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
                GeneratedMessageV3.writeString(codedOutputStream, 6, this.jti_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeUInt32(7, this.refreshTokenExpiresIn_);
            }
            if ((this.bitField0_ & 128) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 8, this.mfaToken_);
            }
            if ((this.bitField0_ & 256) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 9, this.mfaExpirationTimestamp_);
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeUInt64(10, this.mfaExpirationTimestampMs_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DIOAuth2CredentialsOrBuilder {
            private Object accessToken_;
            private int bitField0_;
            private int expiresIn_;
            private Object jti_;
            private long mfaExpirationTimestampMs_;
            private Object mfaExpirationTimestamp_;
            private Object mfaToken_;
            private int refreshTokenExpiresIn_;
            private Object refreshToken_;
            private Object scope_;
            private Object tokenType_;

            private Builder() {
                this.accessToken_ = "";
                this.tokenType_ = "";
                this.refreshToken_ = "";
                this.scope_ = "";
                this.jti_ = "";
                this.mfaToken_ = "";
                this.mfaExpirationTimestamp_ = "";
            }

            private void buildPartial0(DIOAuth2Credentials dIOAuth2Credentials) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    dIOAuth2Credentials.accessToken_ = this.accessToken_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    dIOAuth2Credentials.tokenType_ = this.tokenType_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    dIOAuth2Credentials.refreshToken_ = this.refreshToken_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    dIOAuth2Credentials.expiresIn_ = this.expiresIn_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    dIOAuth2Credentials.scope_ = this.scope_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    dIOAuth2Credentials.jti_ = this.jti_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    dIOAuth2Credentials.refreshTokenExpiresIn_ = this.refreshTokenExpiresIn_;
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    dIOAuth2Credentials.mfaToken_ = this.mfaToken_;
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    dIOAuth2Credentials.mfaExpirationTimestamp_ = this.mfaExpirationTimestamp_;
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    dIOAuth2Credentials.mfaExpirationTimestampMs_ = this.mfaExpirationTimestampMs_;
                    i14 |= 512;
                }
                dIOAuth2Credentials.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICredentials.internal_static_GDI_Proto_Credentials_DIOAuth2Credentials_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DIOAuth2Credentials build() {
                DIOAuth2Credentials dIOAuth2CredentialsBuildPartial = buildPartial();
                if (dIOAuth2CredentialsBuildPartial.isInitialized()) {
                    return dIOAuth2CredentialsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dIOAuth2CredentialsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DIOAuth2Credentials buildPartial() {
                DIOAuth2Credentials dIOAuth2Credentials = new DIOAuth2Credentials(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(dIOAuth2Credentials);
                }
                onBuilt();
                return dIOAuth2Credentials;
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
                this.jti_ = "";
                this.refreshTokenExpiresIn_ = 0;
                this.mfaToken_ = "";
                this.mfaExpirationTimestamp_ = "";
                this.mfaExpirationTimestampMs_ = 0L;
                return this;
            }

            public Builder clearAccessToken() {
                this.accessToken_ = DIOAuth2Credentials.getDefaultInstance().getAccessToken();
                this.bitField0_ &= -2;
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

            public Builder clearJti() {
                this.jti_ = DIOAuth2Credentials.getDefaultInstance().getJti();
                this.bitField0_ &= -33;
                onChanged();
                return this;
            }

            public Builder clearMfaExpirationTimestamp() {
                this.mfaExpirationTimestamp_ = DIOAuth2Credentials.getDefaultInstance().getMfaExpirationTimestamp();
                this.bitField0_ &= -257;
                onChanged();
                return this;
            }

            public Builder clearMfaExpirationTimestampMs() {
                this.bitField0_ &= -513;
                this.mfaExpirationTimestampMs_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearMfaToken() {
                this.mfaToken_ = DIOAuth2Credentials.getDefaultInstance().getMfaToken();
                this.bitField0_ &= -129;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearRefreshToken() {
                this.refreshToken_ = DIOAuth2Credentials.getDefaultInstance().getRefreshToken();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearRefreshTokenExpiresIn() {
                this.bitField0_ &= -65;
                this.refreshTokenExpiresIn_ = 0;
                onChanged();
                return this;
            }

            public Builder clearScope() {
                this.scope_ = DIOAuth2Credentials.getDefaultInstance().getScope();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder clearTokenType() {
                this.tokenType_ = DIOAuth2Credentials.getDefaultInstance().getTokenType();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
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

            @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
            public ByteString getAccessTokenBytes() {
                Object obj = this.accessToken_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.accessToken_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDICredentials.internal_static_GDI_Proto_Credentials_DIOAuth2Credentials_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
            public int getExpiresIn() {
                return this.expiresIn_;
            }

            @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
            public String getJti() {
                Object obj = this.jti_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.jti_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
            public ByteString getJtiBytes() {
                Object obj = this.jti_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.jti_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
            public String getMfaExpirationTimestamp() {
                Object obj = this.mfaExpirationTimestamp_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.mfaExpirationTimestamp_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
            public ByteString getMfaExpirationTimestampBytes() {
                Object obj = this.mfaExpirationTimestamp_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.mfaExpirationTimestamp_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
            public long getMfaExpirationTimestampMs() {
                return this.mfaExpirationTimestampMs_;
            }

            @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
            public String getMfaToken() {
                Object obj = this.mfaToken_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.mfaToken_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
            public ByteString getMfaTokenBytes() {
                Object obj = this.mfaToken_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.mfaToken_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
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

            @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
            public ByteString getRefreshTokenBytes() {
                Object obj = this.refreshToken_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.refreshToken_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
            public int getRefreshTokenExpiresIn() {
                return this.refreshTokenExpiresIn_;
            }

            @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
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

            @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
            public ByteString getScopeBytes() {
                Object obj = this.scope_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.scope_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
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

            @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
            public ByteString getTokenTypeBytes() {
                Object obj = this.tokenType_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.tokenType_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
            public boolean hasAccessToken() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
            public boolean hasExpiresIn() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
            public boolean hasJti() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
            public boolean hasMfaExpirationTimestamp() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
            public boolean hasMfaExpirationTimestampMs() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
            public boolean hasMfaToken() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
            public boolean hasRefreshToken() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
            public boolean hasRefreshTokenExpiresIn() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
            public boolean hasScope() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsOrBuilder
            public boolean hasTokenType() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICredentials.internal_static_GDI_Proto_Credentials_DIOAuth2Credentials_fieldAccessorTable.ensureFieldAccessorsInitialized(DIOAuth2Credentials.class, Builder.class);
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
                                case 10:
                                    this.accessToken_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                    continue;
                                case 18:
                                    this.tokenType_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                    continue;
                                case 26:
                                    this.refreshToken_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                    continue;
                                case 32:
                                    this.expiresIn_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                    continue;
                                case 42:
                                    this.scope_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 16;
                                    continue;
                                case 50:
                                    this.jti_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 32;
                                    continue;
                                case 56:
                                    this.refreshTokenExpiresIn_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 64;
                                    continue;
                                case 66:
                                    this.mfaToken_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 128;
                                    continue;
                                case 74:
                                    this.mfaExpirationTimestamp_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 256;
                                    continue;
                                case 80:
                                    this.mfaExpirationTimestampMs_ = codedInputStream.readUInt64();
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

            public Builder setJti(String str) {
                str.getClass();
                this.jti_ = str;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setJtiBytes(ByteString byteString) {
                byteString.getClass();
                this.jti_ = byteString;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setMfaExpirationTimestamp(String str) {
                str.getClass();
                this.mfaExpirationTimestamp_ = str;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setMfaExpirationTimestampBytes(ByteString byteString) {
                byteString.getClass();
                this.mfaExpirationTimestamp_ = byteString;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setMfaExpirationTimestampMs(long j8) {
                this.mfaExpirationTimestampMs_ = j8;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setMfaToken(String str) {
                str.getClass();
                this.mfaToken_ = str;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setMfaTokenBytes(ByteString byteString) {
                byteString.getClass();
                this.mfaToken_ = byteString;
                this.bitField0_ |= 128;
                onChanged();
                return this;
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

            public Builder setRefreshTokenExpiresIn(int i14) {
                this.refreshTokenExpiresIn_ = i14;
                this.bitField0_ |= 64;
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
            public DIOAuth2Credentials getDefaultInstanceForType() {
                return DIOAuth2Credentials.getDefaultInstance();
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
                this.jti_ = "";
                this.mfaToken_ = "";
                this.mfaExpirationTimestamp_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DIOAuth2Credentials) {
                    return mergeFrom((DIOAuth2Credentials) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DIOAuth2Credentials dIOAuth2Credentials) {
                if (dIOAuth2Credentials == DIOAuth2Credentials.getDefaultInstance()) {
                    return this;
                }
                if (dIOAuth2Credentials.hasAccessToken()) {
                    this.accessToken_ = dIOAuth2Credentials.accessToken_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (dIOAuth2Credentials.hasTokenType()) {
                    this.tokenType_ = dIOAuth2Credentials.tokenType_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (dIOAuth2Credentials.hasRefreshToken()) {
                    this.refreshToken_ = dIOAuth2Credentials.refreshToken_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (dIOAuth2Credentials.hasExpiresIn()) {
                    setExpiresIn(dIOAuth2Credentials.getExpiresIn());
                }
                if (dIOAuth2Credentials.hasScope()) {
                    this.scope_ = dIOAuth2Credentials.scope_;
                    this.bitField0_ |= 16;
                    onChanged();
                }
                if (dIOAuth2Credentials.hasJti()) {
                    this.jti_ = dIOAuth2Credentials.jti_;
                    this.bitField0_ |= 32;
                    onChanged();
                }
                if (dIOAuth2Credentials.hasRefreshTokenExpiresIn()) {
                    setRefreshTokenExpiresIn(dIOAuth2Credentials.getRefreshTokenExpiresIn());
                }
                if (dIOAuth2Credentials.hasMfaToken()) {
                    this.mfaToken_ = dIOAuth2Credentials.mfaToken_;
                    this.bitField0_ |= 128;
                    onChanged();
                }
                if (dIOAuth2Credentials.hasMfaExpirationTimestamp()) {
                    this.mfaExpirationTimestamp_ = dIOAuth2Credentials.mfaExpirationTimestamp_;
                    this.bitField0_ |= 256;
                    onChanged();
                }
                if (dIOAuth2Credentials.hasMfaExpirationTimestampMs()) {
                    setMfaExpirationTimestampMs(dIOAuth2Credentials.getMfaExpirationTimestampMs());
                }
                mergeUnknownFields(dIOAuth2Credentials.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DIOAuth2Credentials getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DIOAuth2Credentials parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DIOAuth2Credentials) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DIOAuth2Credentials parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DIOAuth2Credentials parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DIOAuth2Credentials parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DIOAuth2Credentials parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DIOAuth2Credentials parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DIOAuth2Credentials parseFrom(InputStream inputStream) {
            return (DIOAuth2Credentials) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DIOAuth2Credentials parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DIOAuth2Credentials) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DIOAuth2Credentials parseFrom(CodedInputStream codedInputStream) {
            return (DIOAuth2Credentials) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DIOAuth2Credentials parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DIOAuth2Credentials) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private DIOAuth2Credentials(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.accessToken_ = "";
            this.tokenType_ = "";
            this.refreshToken_ = "";
            this.expiresIn_ = 0;
            this.scope_ = "";
            this.jti_ = "";
            this.refreshTokenExpiresIn_ = 0;
            this.mfaToken_ = "";
            this.mfaExpirationTimestamp_ = "";
            this.mfaExpirationTimestampMs_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ DIOAuth2Credentials(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class DIOAuth2CredentialsResponse extends GeneratedMessageV3 implements DIOAuth2CredentialsResponseOrBuilder {
        public static final int CREDENTIALS_FIELD_NUMBER = 1;
        public static final int GCS_LOCATION_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private DIOAuth2Credentials credentials_;
        private int gcsLocation_;
        private byte memoizedIsInitialized;
        private static final DIOAuth2CredentialsResponse DEFAULT_INSTANCE = new DIOAuth2CredentialsResponse();

        @Deprecated
        public static final Parser<DIOAuth2CredentialsResponse> PARSER = new AbstractParser<DIOAuth2CredentialsResponse>() { // from class: com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsResponse.1
            @Override // com.google.protobuf.Parser
            public DIOAuth2CredentialsResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DIOAuth2CredentialsResponse.newBuilder();
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

        private DIOAuth2CredentialsResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.gcsLocation_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DIOAuth2CredentialsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICredentials.internal_static_GDI_Proto_Credentials_DIOAuth2CredentialsResponse_descriptor;
        }

        public static Builder newBuilder(DIOAuth2CredentialsResponse dIOAuth2CredentialsResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(dIOAuth2CredentialsResponse);
        }

        public static DIOAuth2CredentialsResponse parseDelimitedFrom(InputStream inputStream) {
            return (DIOAuth2CredentialsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DIOAuth2CredentialsResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DIOAuth2CredentialsResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DIOAuth2CredentialsResponse)) {
                return super.equals(obj);
            }
            DIOAuth2CredentialsResponse dIOAuth2CredentialsResponse = (DIOAuth2CredentialsResponse) obj;
            if (hasCredentials() != dIOAuth2CredentialsResponse.hasCredentials()) {
                return false;
            }
            if ((!hasCredentials() || getCredentials().equals(dIOAuth2CredentialsResponse.getCredentials())) && hasGcsLocation() == dIOAuth2CredentialsResponse.hasGcsLocation()) {
                return (!hasGcsLocation() || this.gcsLocation_ == dIOAuth2CredentialsResponse.gcsLocation_) && getUnknownFields().equals(dIOAuth2CredentialsResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsResponseOrBuilder
        public DIOAuth2Credentials getCredentials() {
            DIOAuth2Credentials dIOAuth2Credentials = this.credentials_;
            return dIOAuth2Credentials == null ? DIOAuth2Credentials.getDefaultInstance() : dIOAuth2Credentials;
        }

        @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsResponseOrBuilder
        public DIOAuth2CredentialsOrBuilder getCredentialsOrBuilder() {
            DIOAuth2Credentials dIOAuth2Credentials = this.credentials_;
            return dIOAuth2Credentials == null ? DIOAuth2Credentials.getDefaultInstance() : dIOAuth2Credentials;
        }

        @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsResponseOrBuilder
        public GCSLocation getGcsLocation() {
            GCSLocation gCSLocationForNumber = GCSLocation.forNumber(this.gcsLocation_);
            return gCSLocationForNumber == null ? GCSLocation.PRODUCTION : gCSLocationForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DIOAuth2CredentialsResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsResponseOrBuilder
        public boolean hasCredentials() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsResponseOrBuilder
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
            return GDICredentials.internal_static_GDI_Proto_Credentials_DIOAuth2CredentialsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(DIOAuth2CredentialsResponse.class, Builder.class);
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
            return new DIOAuth2CredentialsResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DIOAuth2CredentialsResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<DIOAuth2Credentials, DIOAuth2Credentials.Builder, DIOAuth2CredentialsOrBuilder> credentialsBuilder_;
            private DIOAuth2Credentials credentials_;
            private int gcsLocation_;

            private Builder() {
                this.gcsLocation_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(DIOAuth2CredentialsResponse dIOAuth2CredentialsResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<DIOAuth2Credentials, DIOAuth2Credentials.Builder, DIOAuth2CredentialsOrBuilder> singleFieldBuilderV3 = this.credentialsBuilder_;
                    dIOAuth2CredentialsResponse.credentials_ = singleFieldBuilderV3 == null ? this.credentials_ : (DIOAuth2Credentials) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    dIOAuth2CredentialsResponse.gcsLocation_ = this.gcsLocation_;
                    i14 |= 2;
                }
                dIOAuth2CredentialsResponse.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<DIOAuth2Credentials, DIOAuth2Credentials.Builder, DIOAuth2CredentialsOrBuilder> getCredentialsFieldBuilder() {
                if (this.credentialsBuilder_ == null) {
                    this.credentialsBuilder_ = new SingleFieldBuilderV3<>(getCredentials(), getParentForChildren(), isClean());
                    this.credentials_ = null;
                }
                return this.credentialsBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICredentials.internal_static_GDI_Proto_Credentials_DIOAuth2CredentialsResponse_descriptor;
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
            public DIOAuth2CredentialsResponse build() {
                DIOAuth2CredentialsResponse dIOAuth2CredentialsResponseBuildPartial = buildPartial();
                if (dIOAuth2CredentialsResponseBuildPartial.isInitialized()) {
                    return dIOAuth2CredentialsResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dIOAuth2CredentialsResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DIOAuth2CredentialsResponse buildPartial() {
                DIOAuth2CredentialsResponse dIOAuth2CredentialsResponse = new DIOAuth2CredentialsResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(dIOAuth2CredentialsResponse);
                }
                onBuilt();
                return dIOAuth2CredentialsResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.credentials_ = null;
                SingleFieldBuilderV3<DIOAuth2Credentials, DIOAuth2Credentials.Builder, DIOAuth2CredentialsOrBuilder> singleFieldBuilderV3 = this.credentialsBuilder_;
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
                SingleFieldBuilderV3<DIOAuth2Credentials, DIOAuth2Credentials.Builder, DIOAuth2CredentialsOrBuilder> singleFieldBuilderV3 = this.credentialsBuilder_;
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

            @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsResponseOrBuilder
            public DIOAuth2Credentials getCredentials() {
                SingleFieldBuilderV3<DIOAuth2Credentials, DIOAuth2Credentials.Builder, DIOAuth2CredentialsOrBuilder> singleFieldBuilderV3 = this.credentialsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DIOAuth2Credentials) singleFieldBuilderV3.getMessage();
                }
                DIOAuth2Credentials dIOAuth2Credentials = this.credentials_;
                return dIOAuth2Credentials == null ? DIOAuth2Credentials.getDefaultInstance() : dIOAuth2Credentials;
            }

            public DIOAuth2Credentials.Builder getCredentialsBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (DIOAuth2Credentials.Builder) getCredentialsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsResponseOrBuilder
            public DIOAuth2CredentialsOrBuilder getCredentialsOrBuilder() {
                SingleFieldBuilderV3<DIOAuth2Credentials, DIOAuth2Credentials.Builder, DIOAuth2CredentialsOrBuilder> singleFieldBuilderV3 = this.credentialsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DIOAuth2CredentialsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DIOAuth2Credentials dIOAuth2Credentials = this.credentials_;
                return dIOAuth2Credentials == null ? DIOAuth2Credentials.getDefaultInstance() : dIOAuth2Credentials;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDICredentials.internal_static_GDI_Proto_Credentials_DIOAuth2CredentialsResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsResponseOrBuilder
            public GCSLocation getGcsLocation() {
                GCSLocation gCSLocationForNumber = GCSLocation.forNumber(this.gcsLocation_);
                return gCSLocationForNumber == null ? GCSLocation.PRODUCTION : gCSLocationForNumber;
            }

            @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsResponseOrBuilder
            public boolean hasCredentials() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDICredentials.DIOAuth2CredentialsResponseOrBuilder
            public boolean hasGcsLocation() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICredentials.internal_static_GDI_Proto_Credentials_DIOAuth2CredentialsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(DIOAuth2CredentialsResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeCredentials(DIOAuth2Credentials dIOAuth2Credentials) {
                DIOAuth2Credentials dIOAuth2Credentials2;
                SingleFieldBuilderV3<DIOAuth2Credentials, DIOAuth2Credentials.Builder, DIOAuth2CredentialsOrBuilder> singleFieldBuilderV3 = this.credentialsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(dIOAuth2Credentials);
                } else if ((this.bitField0_ & 1) == 0 || (dIOAuth2Credentials2 = this.credentials_) == null || dIOAuth2Credentials2 == DIOAuth2Credentials.getDefaultInstance()) {
                    this.credentials_ = dIOAuth2Credentials;
                } else {
                    getCredentialsBuilder().mergeFrom(dIOAuth2Credentials);
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

            public Builder setCredentials(DIOAuth2Credentials.Builder builder) {
                SingleFieldBuilderV3<DIOAuth2Credentials, DIOAuth2Credentials.Builder, DIOAuth2CredentialsOrBuilder> singleFieldBuilderV3 = this.credentialsBuilder_;
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
            public DIOAuth2CredentialsResponse getDefaultInstanceForType() {
                return DIOAuth2CredentialsResponse.getDefaultInstance();
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

            public Builder setCredentials(DIOAuth2Credentials dIOAuth2Credentials) {
                SingleFieldBuilderV3<DIOAuth2Credentials, DIOAuth2Credentials.Builder, DIOAuth2CredentialsOrBuilder> singleFieldBuilderV3 = this.credentialsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    dIOAuth2Credentials.getClass();
                    this.credentials_ = dIOAuth2Credentials;
                } else {
                    singleFieldBuilderV3.setMessage(dIOAuth2Credentials);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DIOAuth2CredentialsResponse) {
                    return mergeFrom((DIOAuth2CredentialsResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DIOAuth2CredentialsResponse dIOAuth2CredentialsResponse) {
                if (dIOAuth2CredentialsResponse == DIOAuth2CredentialsResponse.getDefaultInstance()) {
                    return this;
                }
                if (dIOAuth2CredentialsResponse.hasCredentials()) {
                    mergeCredentials(dIOAuth2CredentialsResponse.getCredentials());
                }
                if (dIOAuth2CredentialsResponse.hasGcsLocation()) {
                    setGcsLocation(dIOAuth2CredentialsResponse.getGcsLocation());
                }
                mergeUnknownFields(dIOAuth2CredentialsResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DIOAuth2CredentialsResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DIOAuth2CredentialsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DIOAuth2CredentialsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DIOAuth2CredentialsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ DIOAuth2CredentialsResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DIOAuth2CredentialsResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private DIOAuth2CredentialsResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.gcsLocation_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DIOAuth2CredentialsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DIOAuth2CredentialsResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DIOAuth2CredentialsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DIOAuth2CredentialsResponse parseFrom(InputStream inputStream) {
            return (DIOAuth2CredentialsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DIOAuth2CredentialsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DIOAuth2CredentialsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DIOAuth2CredentialsResponse parseFrom(CodedInputStream codedInputStream) {
            return (DIOAuth2CredentialsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DIOAuth2CredentialsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DIOAuth2CredentialsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class GCOAuthCredentialsResponse extends GeneratedMessageV3 implements GCOAuthCredentialsResponseOrBuilder {
        public static final int GCS_LOCATION_FIELD_NUMBER = 2;
        public static final int OAUTH_CREDENTIALS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int gcsLocation_;
        private byte memoizedIsInitialized;
        private OAuthCredentials oauthCredentials_;
        private static final GCOAuthCredentialsResponse DEFAULT_INSTANCE = new GCOAuthCredentialsResponse();

        @Deprecated
        public static final Parser<GCOAuthCredentialsResponse> PARSER = new AbstractParser<GCOAuthCredentialsResponse>() { // from class: com.garmin.proto.generated.GDICredentials.GCOAuthCredentialsResponse.1
            @Override // com.google.protobuf.Parser
            public GCOAuthCredentialsResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GCOAuthCredentialsResponse.newBuilder();
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

        private GCOAuthCredentialsResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.gcsLocation_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GCOAuthCredentialsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICredentials.internal_static_GDI_Proto_Credentials_GCOAuthCredentialsResponse_descriptor;
        }

        public static Builder newBuilder(GCOAuthCredentialsResponse gCOAuthCredentialsResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(gCOAuthCredentialsResponse);
        }

        public static GCOAuthCredentialsResponse parseDelimitedFrom(InputStream inputStream) {
            return (GCOAuthCredentialsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GCOAuthCredentialsResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GCOAuthCredentialsResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GCOAuthCredentialsResponse)) {
                return super.equals(obj);
            }
            GCOAuthCredentialsResponse gCOAuthCredentialsResponse = (GCOAuthCredentialsResponse) obj;
            if (hasOauthCredentials() != gCOAuthCredentialsResponse.hasOauthCredentials()) {
                return false;
            }
            if ((!hasOauthCredentials() || getOauthCredentials().equals(gCOAuthCredentialsResponse.getOauthCredentials())) && hasGcsLocation() == gCOAuthCredentialsResponse.hasGcsLocation()) {
                return (!hasGcsLocation() || this.gcsLocation_ == gCOAuthCredentialsResponse.gcsLocation_) && getUnknownFields().equals(gCOAuthCredentialsResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDICredentials.GCOAuthCredentialsResponseOrBuilder
        public GCSLocation getGcsLocation() {
            GCSLocation gCSLocationForNumber = GCSLocation.forNumber(this.gcsLocation_);
            return gCSLocationForNumber == null ? GCSLocation.PRODUCTION : gCSLocationForNumber;
        }

        @Override // com.garmin.proto.generated.GDICredentials.GCOAuthCredentialsResponseOrBuilder
        public OAuthCredentials getOauthCredentials() {
            OAuthCredentials oAuthCredentials = this.oauthCredentials_;
            return oAuthCredentials == null ? OAuthCredentials.getDefaultInstance() : oAuthCredentials;
        }

        @Override // com.garmin.proto.generated.GDICredentials.GCOAuthCredentialsResponseOrBuilder
        public OAuthCredentialsOrBuilder getOauthCredentialsOrBuilder() {
            OAuthCredentials oAuthCredentials = this.oauthCredentials_;
            return oAuthCredentials == null ? OAuthCredentials.getDefaultInstance() : oAuthCredentials;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GCOAuthCredentialsResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getOauthCredentials()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(2, this.gcsLocation_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICredentials.GCOAuthCredentialsResponseOrBuilder
        public boolean hasGcsLocation() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDICredentials.GCOAuthCredentialsResponseOrBuilder
        public boolean hasOauthCredentials() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasOauthCredentials()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getOauthCredentials().hashCode();
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
            return GDICredentials.internal_static_GDI_Proto_Credentials_GCOAuthCredentialsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GCOAuthCredentialsResponse.class, Builder.class);
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
            if (!hasOauthCredentials()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasGcsLocation()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (getOauthCredentials().isInitialized()) {
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
            return new GCOAuthCredentialsResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getOauthCredentials());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.gcsLocation_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GCOAuthCredentialsResponseOrBuilder {
            private int bitField0_;
            private int gcsLocation_;
            private SingleFieldBuilderV3<OAuthCredentials, OAuthCredentials.Builder, OAuthCredentialsOrBuilder> oauthCredentialsBuilder_;
            private OAuthCredentials oauthCredentials_;

            private Builder() {
                this.gcsLocation_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(GCOAuthCredentialsResponse gCOAuthCredentialsResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<OAuthCredentials, OAuthCredentials.Builder, OAuthCredentialsOrBuilder> singleFieldBuilderV3 = this.oauthCredentialsBuilder_;
                    gCOAuthCredentialsResponse.oauthCredentials_ = singleFieldBuilderV3 == null ? this.oauthCredentials_ : (OAuthCredentials) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    gCOAuthCredentialsResponse.gcsLocation_ = this.gcsLocation_;
                    i14 |= 2;
                }
                gCOAuthCredentialsResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICredentials.internal_static_GDI_Proto_Credentials_GCOAuthCredentialsResponse_descriptor;
            }

            private SingleFieldBuilderV3<OAuthCredentials, OAuthCredentials.Builder, OAuthCredentialsOrBuilder> getOauthCredentialsFieldBuilder() {
                if (this.oauthCredentialsBuilder_ == null) {
                    this.oauthCredentialsBuilder_ = new SingleFieldBuilderV3<>(getOauthCredentials(), getParentForChildren(), isClean());
                    this.oauthCredentials_ = null;
                }
                return this.oauthCredentialsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getOauthCredentialsFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GCOAuthCredentialsResponse build() {
                GCOAuthCredentialsResponse gCOAuthCredentialsResponseBuildPartial = buildPartial();
                if (gCOAuthCredentialsResponseBuildPartial.isInitialized()) {
                    return gCOAuthCredentialsResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) gCOAuthCredentialsResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GCOAuthCredentialsResponse buildPartial() {
                GCOAuthCredentialsResponse gCOAuthCredentialsResponse = new GCOAuthCredentialsResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(gCOAuthCredentialsResponse);
                }
                onBuilt();
                return gCOAuthCredentialsResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.oauthCredentials_ = null;
                SingleFieldBuilderV3<OAuthCredentials, OAuthCredentials.Builder, OAuthCredentialsOrBuilder> singleFieldBuilderV3 = this.oauthCredentialsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.oauthCredentialsBuilder_ = null;
                }
                this.gcsLocation_ = 0;
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

            public Builder clearOauthCredentials() {
                this.bitField0_ &= -2;
                this.oauthCredentials_ = null;
                SingleFieldBuilderV3<OAuthCredentials, OAuthCredentials.Builder, OAuthCredentialsOrBuilder> singleFieldBuilderV3 = this.oauthCredentialsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.oauthCredentialsBuilder_ = null;
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
                return GDICredentials.internal_static_GDI_Proto_Credentials_GCOAuthCredentialsResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICredentials.GCOAuthCredentialsResponseOrBuilder
            public GCSLocation getGcsLocation() {
                GCSLocation gCSLocationForNumber = GCSLocation.forNumber(this.gcsLocation_);
                return gCSLocationForNumber == null ? GCSLocation.PRODUCTION : gCSLocationForNumber;
            }

            @Override // com.garmin.proto.generated.GDICredentials.GCOAuthCredentialsResponseOrBuilder
            public OAuthCredentials getOauthCredentials() {
                SingleFieldBuilderV3<OAuthCredentials, OAuthCredentials.Builder, OAuthCredentialsOrBuilder> singleFieldBuilderV3 = this.oauthCredentialsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (OAuthCredentials) singleFieldBuilderV3.getMessage();
                }
                OAuthCredentials oAuthCredentials = this.oauthCredentials_;
                return oAuthCredentials == null ? OAuthCredentials.getDefaultInstance() : oAuthCredentials;
            }

            public OAuthCredentials.Builder getOauthCredentialsBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (OAuthCredentials.Builder) getOauthCredentialsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICredentials.GCOAuthCredentialsResponseOrBuilder
            public OAuthCredentialsOrBuilder getOauthCredentialsOrBuilder() {
                SingleFieldBuilderV3<OAuthCredentials, OAuthCredentials.Builder, OAuthCredentialsOrBuilder> singleFieldBuilderV3 = this.oauthCredentialsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (OAuthCredentialsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                OAuthCredentials oAuthCredentials = this.oauthCredentials_;
                return oAuthCredentials == null ? OAuthCredentials.getDefaultInstance() : oAuthCredentials;
            }

            @Override // com.garmin.proto.generated.GDICredentials.GCOAuthCredentialsResponseOrBuilder
            public boolean hasGcsLocation() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDICredentials.GCOAuthCredentialsResponseOrBuilder
            public boolean hasOauthCredentials() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICredentials.internal_static_GDI_Proto_Credentials_GCOAuthCredentialsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GCOAuthCredentialsResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasOauthCredentials() && hasGcsLocation() && getOauthCredentials().isInitialized();
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
                                    codedInputStream.readMessage(getOauthCredentialsFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeOauthCredentials(OAuthCredentials oAuthCredentials) {
                OAuthCredentials oAuthCredentials2;
                SingleFieldBuilderV3<OAuthCredentials, OAuthCredentials.Builder, OAuthCredentialsOrBuilder> singleFieldBuilderV3 = this.oauthCredentialsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(oAuthCredentials);
                } else if ((this.bitField0_ & 1) == 0 || (oAuthCredentials2 = this.oauthCredentials_) == null || oAuthCredentials2 == OAuthCredentials.getDefaultInstance()) {
                    this.oauthCredentials_ = oAuthCredentials;
                } else {
                    getOauthCredentialsBuilder().mergeFrom(oAuthCredentials);
                }
                if (this.oauthCredentials_ != null) {
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

            public Builder setGcsLocation(GCSLocation gCSLocation) {
                gCSLocation.getClass();
                this.bitField0_ |= 2;
                this.gcsLocation_ = gCSLocation.getNumber();
                onChanged();
                return this;
            }

            public Builder setOauthCredentials(OAuthCredentials.Builder builder) {
                SingleFieldBuilderV3<OAuthCredentials, OAuthCredentials.Builder, OAuthCredentialsOrBuilder> singleFieldBuilderV3 = this.oauthCredentialsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.oauthCredentials_ = builder.build();
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
            public GCOAuthCredentialsResponse getDefaultInstanceForType() {
                return GCOAuthCredentialsResponse.getDefaultInstance();
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

            public Builder setOauthCredentials(OAuthCredentials oAuthCredentials) {
                SingleFieldBuilderV3<OAuthCredentials, OAuthCredentials.Builder, OAuthCredentialsOrBuilder> singleFieldBuilderV3 = this.oauthCredentialsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    oAuthCredentials.getClass();
                    this.oauthCredentials_ = oAuthCredentials;
                } else {
                    singleFieldBuilderV3.setMessage(oAuthCredentials);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GCOAuthCredentialsResponse) {
                    return mergeFrom((GCOAuthCredentialsResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GCOAuthCredentialsResponse gCOAuthCredentialsResponse) {
                if (gCOAuthCredentialsResponse == GCOAuthCredentialsResponse.getDefaultInstance()) {
                    return this;
                }
                if (gCOAuthCredentialsResponse.hasOauthCredentials()) {
                    mergeOauthCredentials(gCOAuthCredentialsResponse.getOauthCredentials());
                }
                if (gCOAuthCredentialsResponse.hasGcsLocation()) {
                    setGcsLocation(gCOAuthCredentialsResponse.getGcsLocation());
                }
                mergeUnknownFields(gCOAuthCredentialsResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GCOAuthCredentialsResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static GCOAuthCredentialsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GCOAuthCredentialsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GCOAuthCredentialsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ GCOAuthCredentialsResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static GCOAuthCredentialsResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private GCOAuthCredentialsResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.gcsLocation_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GCOAuthCredentialsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GCOAuthCredentialsResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GCOAuthCredentialsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GCOAuthCredentialsResponse parseFrom(InputStream inputStream) {
            return (GCOAuthCredentialsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GCOAuthCredentialsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GCOAuthCredentialsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GCOAuthCredentialsResponse parseFrom(CodedInputStream codedInputStream) {
            return (GCOAuthCredentialsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GCOAuthCredentialsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GCOAuthCredentialsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OAuth2Credentials extends GeneratedMessageV3 implements OAuth2CredentialsOrBuilder {
        public static final int ACCESS_TOKEN_FIELD_NUMBER = 1;
        public static final int EXPIRES_IN_FIELD_NUMBER = 4;
        public static final int JTI_FIELD_NUMBER = 6;
        public static final int MFA_EXPIRATION_TIMESTAMP_MS_FIELD_NUMBER = 9;
        public static final int MFA_TOKEN_FIELD_NUMBER = 8;
        public static final int REFRESH_TOKEN_EXPIRES_IN_FIELD_NUMBER = 7;
        public static final int REFRESH_TOKEN_FIELD_NUMBER = 3;
        public static final int SCOPE_FIELD_NUMBER = 5;
        public static final int TOKEN_TYPE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private volatile Object accessToken_;
        private int bitField0_;
        private int expiresIn_;
        private volatile Object jti_;
        private byte memoizedIsInitialized;
        private long mfaExpirationTimestampMs_;
        private volatile Object mfaToken_;
        private int refreshTokenExpiresIn_;
        private volatile Object refreshToken_;
        private LazyStringArrayList scope_;
        private volatile Object tokenType_;
        private static final OAuth2Credentials DEFAULT_INSTANCE = new OAuth2Credentials();

        @Deprecated
        public static final Parser<OAuth2Credentials> PARSER = new AbstractParser<OAuth2Credentials>() { // from class: com.garmin.proto.generated.GDICredentials.OAuth2Credentials.1
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
            this.scope_ = LazyStringArrayList.emptyList();
            this.jti_ = "";
            this.refreshTokenExpiresIn_ = 0;
            this.mfaToken_ = "";
            this.mfaExpirationTimestampMs_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
            this.accessToken_ = "";
            this.tokenType_ = "";
            this.refreshToken_ = "";
            this.scope_ = LazyStringArrayList.emptyList();
            this.jti_ = "";
            this.mfaToken_ = "";
        }

        public static OAuth2Credentials getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICredentials.internal_static_GDI_Proto_Credentials_OAuth2Credentials_descriptor;
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
            if ((hasExpiresIn() && getExpiresIn() != oAuth2Credentials.getExpiresIn()) || !getScopeList().equals(oAuth2Credentials.getScopeList()) || hasJti() != oAuth2Credentials.hasJti()) {
                return false;
            }
            if ((hasJti() && !getJti().equals(oAuth2Credentials.getJti())) || hasRefreshTokenExpiresIn() != oAuth2Credentials.hasRefreshTokenExpiresIn()) {
                return false;
            }
            if ((hasRefreshTokenExpiresIn() && getRefreshTokenExpiresIn() != oAuth2Credentials.getRefreshTokenExpiresIn()) || hasMfaToken() != oAuth2Credentials.hasMfaToken()) {
                return false;
            }
            if ((!hasMfaToken() || getMfaToken().equals(oAuth2Credentials.getMfaToken())) && hasMfaExpirationTimestampMs() == oAuth2Credentials.hasMfaExpirationTimestampMs()) {
                return (!hasMfaExpirationTimestampMs() || getMfaExpirationTimestampMs() == oAuth2Credentials.getMfaExpirationTimestampMs()) && getUnknownFields().equals(oAuth2Credentials.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
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

        @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
        public ByteString getAccessTokenBytes() {
            Object obj = this.accessToken_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.accessToken_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
        public int getExpiresIn() {
            return this.expiresIn_;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
        public String getJti() {
            Object obj = this.jti_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.jti_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
        public ByteString getJtiBytes() {
            Object obj = this.jti_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.jti_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
        public long getMfaExpirationTimestampMs() {
            return this.mfaExpirationTimestampMs_;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
        public String getMfaToken() {
            Object obj = this.mfaToken_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.mfaToken_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
        public ByteString getMfaTokenBytes() {
            Object obj = this.mfaToken_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.mfaToken_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<OAuth2Credentials> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
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

        @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
        public ByteString getRefreshTokenBytes() {
            Object obj = this.refreshToken_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.refreshToken_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
        public int getRefreshTokenExpiresIn() {
            return this.refreshTokenExpiresIn_;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
        public String getScope(int i14) {
            return this.scope_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
        public ByteString getScopeBytes(int i14) {
            return this.scope_.getByteString(i14);
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
        public int getScopeCount() {
            return this.scope_.size();
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
            int iD = 0;
            for (int i15 = 0; i15 < this.scope_.size(); i15++) {
                iD = f3.d(this.scope_, i15, iD);
            }
            int size = getScopeList().size() + iComputeStringSize + iD;
            if ((this.bitField0_ & 16) != 0) {
                size += GeneratedMessageV3.computeStringSize(6, this.jti_);
            }
            if ((this.bitField0_ & 32) != 0) {
                size += CodedOutputStream.computeUInt32Size(7, this.refreshTokenExpiresIn_);
            }
            if ((this.bitField0_ & 64) != 0) {
                size += GeneratedMessageV3.computeStringSize(8, this.mfaToken_);
            }
            if ((this.bitField0_ & 128) != 0) {
                size += CodedOutputStream.computeUInt64Size(9, this.mfaExpirationTimestampMs_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
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

        @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
        public ByteString getTokenTypeBytes() {
            Object obj = this.tokenType_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.tokenType_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
        public boolean hasAccessToken() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
        public boolean hasExpiresIn() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
        public boolean hasJti() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
        public boolean hasMfaExpirationTimestampMs() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
        public boolean hasMfaToken() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
        public boolean hasRefreshToken() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
        public boolean hasRefreshTokenExpiresIn() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
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
            if (getScopeCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getScopeList().hashCode();
            }
            if (hasJti()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getJti().hashCode();
            }
            if (hasRefreshTokenExpiresIn()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getRefreshTokenExpiresIn();
            }
            if (hasMfaToken()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getMfaToken().hashCode();
            }
            if (hasMfaExpirationTimestampMs()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + Internal.hashLong(getMfaExpirationTimestampMs());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICredentials.internal_static_GDI_Proto_Credentials_OAuth2Credentials_fieldAccessorTable.ensureFieldAccessorsInitialized(OAuth2Credentials.class, Builder.class);
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
            int iE = 0;
            while (iE < this.scope_.size()) {
                iE = f3.e(this.scope_, iE, codedOutputStream, 5, iE, 1);
            }
            if ((this.bitField0_ & 16) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 6, this.jti_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt32(7, this.refreshTokenExpiresIn_);
            }
            if ((this.bitField0_ & 64) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 8, this.mfaToken_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeUInt64(9, this.mfaExpirationTimestampMs_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements OAuth2CredentialsOrBuilder {
            private Object accessToken_;
            private int bitField0_;
            private int expiresIn_;
            private Object jti_;
            private long mfaExpirationTimestampMs_;
            private Object mfaToken_;
            private int refreshTokenExpiresIn_;
            private Object refreshToken_;
            private LazyStringArrayList scope_;
            private Object tokenType_;

            private Builder() {
                this.accessToken_ = "";
                this.tokenType_ = "";
                this.refreshToken_ = "";
                this.scope_ = LazyStringArrayList.emptyList();
                this.jti_ = "";
                this.mfaToken_ = "";
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
                    this.scope_.makeImmutable();
                    oAuth2Credentials.scope_ = this.scope_;
                }
                if ((i15 & 32) != 0) {
                    oAuth2Credentials.jti_ = this.jti_;
                    i14 |= 16;
                }
                if ((i15 & 64) != 0) {
                    oAuth2Credentials.refreshTokenExpiresIn_ = this.refreshTokenExpiresIn_;
                    i14 |= 32;
                }
                if ((i15 & 128) != 0) {
                    oAuth2Credentials.mfaToken_ = this.mfaToken_;
                    i14 |= 64;
                }
                if ((i15 & 256) != 0) {
                    oAuth2Credentials.mfaExpirationTimestampMs_ = this.mfaExpirationTimestampMs_;
                    i14 |= 128;
                }
                oAuth2Credentials.bitField0_ |= i14;
            }

            private void ensureScopeIsMutable() {
                if (!this.scope_.isModifiable()) {
                    this.scope_ = new LazyStringArrayList((LazyStringList) this.scope_);
                }
                this.bitField0_ |= 16;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICredentials.internal_static_GDI_Proto_Credentials_OAuth2Credentials_descriptor;
            }

            public Builder addAllScope(Iterable<String> iterable) {
                ensureScopeIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.scope_);
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addScope(String str) {
                str.getClass();
                ensureScopeIsMutable();
                this.scope_.add(str);
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder addScopeBytes(ByteString byteString) {
                byteString.getClass();
                ensureScopeIsMutable();
                this.scope_.add(byteString);
                this.bitField0_ |= 16;
                onChanged();
                return this;
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
                this.scope_ = LazyStringArrayList.emptyList();
                this.jti_ = "";
                this.refreshTokenExpiresIn_ = 0;
                this.mfaToken_ = "";
                this.mfaExpirationTimestampMs_ = 0L;
                return this;
            }

            public Builder clearAccessToken() {
                this.accessToken_ = OAuth2Credentials.getDefaultInstance().getAccessToken();
                this.bitField0_ &= -2;
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

            public Builder clearJti() {
                this.jti_ = OAuth2Credentials.getDefaultInstance().getJti();
                this.bitField0_ &= -33;
                onChanged();
                return this;
            }

            public Builder clearMfaExpirationTimestampMs() {
                this.bitField0_ &= -257;
                this.mfaExpirationTimestampMs_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearMfaToken() {
                this.mfaToken_ = OAuth2Credentials.getDefaultInstance().getMfaToken();
                this.bitField0_ &= -129;
                onChanged();
                return this;
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
                this.bitField0_ &= -65;
                this.refreshTokenExpiresIn_ = 0;
                onChanged();
                return this;
            }

            public Builder clearScope() {
                this.scope_ = LazyStringArrayList.emptyList();
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

            @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
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

            @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
            public ByteString getAccessTokenBytes() {
                Object obj = this.accessToken_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.accessToken_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDICredentials.internal_static_GDI_Proto_Credentials_OAuth2Credentials_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
            public int getExpiresIn() {
                return this.expiresIn_;
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
            public String getJti() {
                Object obj = this.jti_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.jti_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
            public ByteString getJtiBytes() {
                Object obj = this.jti_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.jti_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
            public long getMfaExpirationTimestampMs() {
                return this.mfaExpirationTimestampMs_;
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
            public String getMfaToken() {
                Object obj = this.mfaToken_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.mfaToken_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
            public ByteString getMfaTokenBytes() {
                Object obj = this.mfaToken_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.mfaToken_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
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

            @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
            public ByteString getRefreshTokenBytes() {
                Object obj = this.refreshToken_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.refreshToken_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
            public int getRefreshTokenExpiresIn() {
                return this.refreshTokenExpiresIn_;
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
            public String getScope(int i14) {
                return this.scope_.get(i14);
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
            public ByteString getScopeBytes(int i14) {
                return this.scope_.getByteString(i14);
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
            public int getScopeCount() {
                return this.scope_.size();
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
            public ProtocolStringList getScopeList() {
                this.scope_.makeImmutable();
                return this.scope_;
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
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

            @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
            public ByteString getTokenTypeBytes() {
                Object obj = this.tokenType_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.tokenType_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
            public boolean hasAccessToken() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
            public boolean hasExpiresIn() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
            public boolean hasJti() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
            public boolean hasMfaExpirationTimestampMs() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
            public boolean hasMfaToken() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
            public boolean hasRefreshToken() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
            public boolean hasRefreshTokenExpiresIn() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
            public boolean hasTokenType() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICredentials.internal_static_GDI_Proto_Credentials_OAuth2Credentials_fieldAccessorTable.ensureFieldAccessorsInitialized(OAuth2Credentials.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
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
                if (!oAuth2Credentials.scope_.isEmpty()) {
                    if (this.scope_.isEmpty()) {
                        this.scope_ = oAuth2Credentials.scope_;
                        this.bitField0_ |= 16;
                    } else {
                        ensureScopeIsMutable();
                        this.scope_.addAll(oAuth2Credentials.scope_);
                    }
                    onChanged();
                }
                if (oAuth2Credentials.hasJti()) {
                    this.jti_ = oAuth2Credentials.jti_;
                    this.bitField0_ |= 32;
                    onChanged();
                }
                if (oAuth2Credentials.hasRefreshTokenExpiresIn()) {
                    setRefreshTokenExpiresIn(oAuth2Credentials.getRefreshTokenExpiresIn());
                }
                if (oAuth2Credentials.hasMfaToken()) {
                    this.mfaToken_ = oAuth2Credentials.mfaToken_;
                    this.bitField0_ |= 128;
                    onChanged();
                }
                if (oAuth2Credentials.hasMfaExpirationTimestampMs()) {
                    setMfaExpirationTimestampMs(oAuth2Credentials.getMfaExpirationTimestampMs());
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

            public Builder setJti(String str) {
                str.getClass();
                this.jti_ = str;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setJtiBytes(ByteString byteString) {
                byteString.getClass();
                this.jti_ = byteString;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setMfaExpirationTimestampMs(long j8) {
                this.mfaExpirationTimestampMs_ = j8;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setMfaToken(String str) {
                str.getClass();
                this.mfaToken_ = str;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setMfaTokenBytes(ByteString byteString) {
                byteString.getClass();
                this.mfaToken_ = byteString;
                this.bitField0_ |= 128;
                onChanged();
                return this;
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

            public Builder setRefreshTokenExpiresIn(int i14) {
                this.refreshTokenExpiresIn_ = i14;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setScope(int i14, String str) {
                str.getClass();
                ensureScopeIsMutable();
                this.scope_.set(i14, str);
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
                this.scope_ = LazyStringArrayList.emptyList();
                this.jti_ = "";
                this.mfaToken_ = "";
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
                                    ByteString bytes = codedInputStream.readBytes();
                                    ensureScopeIsMutable();
                                    this.scope_.add(bytes);
                                } else if (tag == 50) {
                                    this.jti_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 32;
                                } else if (tag == 56) {
                                    this.refreshTokenExpiresIn_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 64;
                                } else if (tag == 66) {
                                    this.mfaToken_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 128;
                                } else if (tag != 72) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.mfaExpirationTimestampMs_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 256;
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

        @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsOrBuilder
        public ProtocolStringList getScopeList() {
            return this.scope_;
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
            this.scope_ = LazyStringArrayList.emptyList();
            this.jti_ = "";
            this.refreshTokenExpiresIn_ = 0;
            this.mfaToken_ = "";
            this.mfaExpirationTimestampMs_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ OAuth2Credentials(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class OAuth2CredentialsRequest extends GeneratedMessageV3 implements OAuth2CredentialsRequestOrBuilder {
        public static final int CLIENT_ID_FIELD_NUMBER = 2;
        public static final int CREDENTIAL_TYPE_FIELD_NUMBER = 1;
        private static final OAuth2CredentialsRequest DEFAULT_INSTANCE = new OAuth2CredentialsRequest();

        @Deprecated
        public static final Parser<OAuth2CredentialsRequest> PARSER = new AbstractParser<OAuth2CredentialsRequest>() { // from class: com.garmin.proto.generated.GDICredentials.OAuth2CredentialsRequest.1
            @Override // com.google.protobuf.Parser
            public OAuth2CredentialsRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = OAuth2CredentialsRequest.newBuilder();
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
        private volatile Object clientId_;
        private int credentialType_;
        private byte memoizedIsInitialized;

        private OAuth2CredentialsRequest() {
            this.credentialType_ = 0;
            this.clientId_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.credentialType_ = 0;
            this.clientId_ = "";
        }

        public static OAuth2CredentialsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICredentials.internal_static_GDI_Proto_Credentials_OAuth2CredentialsRequest_descriptor;
        }

        public static Builder newBuilder(OAuth2CredentialsRequest oAuth2CredentialsRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(oAuth2CredentialsRequest);
        }

        public static OAuth2CredentialsRequest parseDelimitedFrom(InputStream inputStream) {
            return (OAuth2CredentialsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static OAuth2CredentialsRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<OAuth2CredentialsRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OAuth2CredentialsRequest)) {
                return super.equals(obj);
            }
            OAuth2CredentialsRequest oAuth2CredentialsRequest = (OAuth2CredentialsRequest) obj;
            if (hasCredentialType() != oAuth2CredentialsRequest.hasCredentialType()) {
                return false;
            }
            if ((!hasCredentialType() || this.credentialType_ == oAuth2CredentialsRequest.credentialType_) && hasClientId() == oAuth2CredentialsRequest.hasClientId()) {
                return (!hasClientId() || getClientId().equals(oAuth2CredentialsRequest.getClientId())) && getUnknownFields().equals(oAuth2CredentialsRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsRequestOrBuilder
        public String getClientId() {
            Object obj = this.clientId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.clientId_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsRequestOrBuilder
        public ByteString getClientIdBytes() {
            Object obj = this.clientId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.clientId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsRequestOrBuilder
        public CredentialType getCredentialType() {
            CredentialType credentialTypeForNumber = CredentialType.forNumber(this.credentialType_);
            return credentialTypeForNumber == null ? CredentialType.ALPHA_IT_OAUTH_2 : credentialTypeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<OAuth2CredentialsRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.credentialType_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += GeneratedMessageV3.computeStringSize(2, this.clientId_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsRequestOrBuilder
        public boolean hasClientId() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsRequestOrBuilder
        public boolean hasCredentialType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCredentialType()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.credentialType_;
            }
            if (hasClientId()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getClientId().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICredentials.internal_static_GDI_Proto_Credentials_OAuth2CredentialsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(OAuth2CredentialsRequest.class, Builder.class);
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
            if (hasCredentialType()) {
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
            return new OAuth2CredentialsRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.credentialType_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.clientId_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements OAuth2CredentialsRequestOrBuilder {
            private int bitField0_;
            private Object clientId_;
            private int credentialType_;

            private Builder() {
                this.credentialType_ = 0;
                this.clientId_ = "";
            }

            private void buildPartial0(OAuth2CredentialsRequest oAuth2CredentialsRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    oAuth2CredentialsRequest.credentialType_ = this.credentialType_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    oAuth2CredentialsRequest.clientId_ = this.clientId_;
                    i14 |= 2;
                }
                oAuth2CredentialsRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICredentials.internal_static_GDI_Proto_Credentials_OAuth2CredentialsRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public OAuth2CredentialsRequest build() {
                OAuth2CredentialsRequest oAuth2CredentialsRequestBuildPartial = buildPartial();
                if (oAuth2CredentialsRequestBuildPartial.isInitialized()) {
                    return oAuth2CredentialsRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) oAuth2CredentialsRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public OAuth2CredentialsRequest buildPartial() {
                OAuth2CredentialsRequest oAuth2CredentialsRequest = new OAuth2CredentialsRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(oAuth2CredentialsRequest);
                }
                onBuilt();
                return oAuth2CredentialsRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.credentialType_ = 0;
                this.clientId_ = "";
                return this;
            }

            public Builder clearClientId() {
                this.clientId_ = OAuth2CredentialsRequest.getDefaultInstance().getClientId();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearCredentialType() {
                this.bitField0_ &= -2;
                this.credentialType_ = 0;
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

            @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsRequestOrBuilder
            public String getClientId() {
                Object obj = this.clientId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.clientId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsRequestOrBuilder
            public ByteString getClientIdBytes() {
                Object obj = this.clientId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.clientId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsRequestOrBuilder
            public CredentialType getCredentialType() {
                CredentialType credentialTypeForNumber = CredentialType.forNumber(this.credentialType_);
                return credentialTypeForNumber == null ? CredentialType.ALPHA_IT_OAUTH_2 : credentialTypeForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDICredentials.internal_static_GDI_Proto_Credentials_OAuth2CredentialsRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsRequestOrBuilder
            public boolean hasClientId() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsRequestOrBuilder
            public boolean hasCredentialType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICredentials.internal_static_GDI_Proto_Credentials_OAuth2CredentialsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(OAuth2CredentialsRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasCredentialType();
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
                                    if (CredentialType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.credentialType_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    this.clientId_ = codedInputStream.readBytes();
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

            public Builder setClientId(String str) {
                str.getClass();
                this.clientId_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setClientIdBytes(ByteString byteString) {
                byteString.getClass();
                this.clientId_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setCredentialType(CredentialType credentialType) {
                credentialType.getClass();
                this.bitField0_ |= 1;
                this.credentialType_ = credentialType.getNumber();
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
            public OAuth2CredentialsRequest getDefaultInstanceForType() {
                return OAuth2CredentialsRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.credentialType_ = 0;
                this.clientId_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof OAuth2CredentialsRequest) {
                    return mergeFrom((OAuth2CredentialsRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(OAuth2CredentialsRequest oAuth2CredentialsRequest) {
                if (oAuth2CredentialsRequest == OAuth2CredentialsRequest.getDefaultInstance()) {
                    return this;
                }
                if (oAuth2CredentialsRequest.hasCredentialType()) {
                    setCredentialType(oAuth2CredentialsRequest.getCredentialType());
                }
                if (oAuth2CredentialsRequest.hasClientId()) {
                    this.clientId_ = oAuth2CredentialsRequest.clientId_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                mergeUnknownFields(oAuth2CredentialsRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public OAuth2CredentialsRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static OAuth2CredentialsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuth2CredentialsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static OAuth2CredentialsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static OAuth2CredentialsRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static OAuth2CredentialsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static OAuth2CredentialsRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static OAuth2CredentialsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static OAuth2CredentialsRequest parseFrom(InputStream inputStream) {
            return (OAuth2CredentialsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static OAuth2CredentialsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuth2CredentialsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private OAuth2CredentialsRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.credentialType_ = 0;
            this.clientId_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static OAuth2CredentialsRequest parseFrom(CodedInputStream codedInputStream) {
            return (OAuth2CredentialsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static OAuth2CredentialsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuth2CredentialsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ OAuth2CredentialsRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class OAuth2CredentialsResponse extends GeneratedMessageV3 implements OAuth2CredentialsResponseOrBuilder {
        public static final int CREDENTIALS_FIELD_NUMBER = 2;
        public static final int CREDENTIAL_TYPE_FIELD_NUMBER = 1;
        public static final int ENVIRONMENT_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int credentialType_;
        private OAuth2Credentials credentials_;
        private int environment_;
        private byte memoizedIsInitialized;
        private static final OAuth2CredentialsResponse DEFAULT_INSTANCE = new OAuth2CredentialsResponse();

        @Deprecated
        public static final Parser<OAuth2CredentialsResponse> PARSER = new AbstractParser<OAuth2CredentialsResponse>() { // from class: com.garmin.proto.generated.GDICredentials.OAuth2CredentialsResponse.1
            @Override // com.google.protobuf.Parser
            public OAuth2CredentialsResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = OAuth2CredentialsResponse.newBuilder();
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

        private OAuth2CredentialsResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.credentialType_ = 0;
            this.environment_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static OAuth2CredentialsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICredentials.internal_static_GDI_Proto_Credentials_OAuth2CredentialsResponse_descriptor;
        }

        public static Builder newBuilder(OAuth2CredentialsResponse oAuth2CredentialsResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(oAuth2CredentialsResponse);
        }

        public static OAuth2CredentialsResponse parseDelimitedFrom(InputStream inputStream) {
            return (OAuth2CredentialsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static OAuth2CredentialsResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<OAuth2CredentialsResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OAuth2CredentialsResponse)) {
                return super.equals(obj);
            }
            OAuth2CredentialsResponse oAuth2CredentialsResponse = (OAuth2CredentialsResponse) obj;
            if (hasCredentialType() != oAuth2CredentialsResponse.hasCredentialType()) {
                return false;
            }
            if ((hasCredentialType() && this.credentialType_ != oAuth2CredentialsResponse.credentialType_) || hasCredentials() != oAuth2CredentialsResponse.hasCredentials()) {
                return false;
            }
            if ((!hasCredentials() || getCredentials().equals(oAuth2CredentialsResponse.getCredentials())) && hasEnvironment() == oAuth2CredentialsResponse.hasEnvironment()) {
                return (!hasEnvironment() || this.environment_ == oAuth2CredentialsResponse.environment_) && getUnknownFields().equals(oAuth2CredentialsResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsResponseOrBuilder
        public CredentialType getCredentialType() {
            CredentialType credentialTypeForNumber = CredentialType.forNumber(this.credentialType_);
            return credentialTypeForNumber == null ? CredentialType.ALPHA_IT_OAUTH_2 : credentialTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsResponseOrBuilder
        public OAuth2Credentials getCredentials() {
            OAuth2Credentials oAuth2Credentials = this.credentials_;
            return oAuth2Credentials == null ? OAuth2Credentials.getDefaultInstance() : oAuth2Credentials;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsResponseOrBuilder
        public OAuth2CredentialsOrBuilder getCredentialsOrBuilder() {
            OAuth2Credentials oAuth2Credentials = this.credentials_;
            return oAuth2Credentials == null ? OAuth2Credentials.getDefaultInstance() : oAuth2Credentials;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsResponseOrBuilder
        public GCSLocation getEnvironment() {
            GCSLocation gCSLocationForNumber = GCSLocation.forNumber(this.environment_);
            return gCSLocationForNumber == null ? GCSLocation.PRODUCTION : gCSLocationForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<OAuth2CredentialsResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.credentialType_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, getCredentials());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(3, this.environment_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsResponseOrBuilder
        public boolean hasCredentialType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsResponseOrBuilder
        public boolean hasCredentials() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsResponseOrBuilder
        public boolean hasEnvironment() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCredentialType()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.credentialType_;
            }
            if (hasCredentials()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getCredentials().hashCode();
            }
            if (hasEnvironment()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + this.environment_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICredentials.internal_static_GDI_Proto_Credentials_OAuth2CredentialsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(OAuth2CredentialsResponse.class, Builder.class);
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
            if (hasCredentialType()) {
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
            return new OAuth2CredentialsResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.credentialType_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getCredentials());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(3, this.environment_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements OAuth2CredentialsResponseOrBuilder {
            private int bitField0_;
            private int credentialType_;
            private SingleFieldBuilderV3<OAuth2Credentials, OAuth2Credentials.Builder, OAuth2CredentialsOrBuilder> credentialsBuilder_;
            private OAuth2Credentials credentials_;
            private int environment_;

            private Builder() {
                this.credentialType_ = 0;
                this.environment_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(OAuth2CredentialsResponse oAuth2CredentialsResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    oAuth2CredentialsResponse.credentialType_ = this.credentialType_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<OAuth2Credentials, OAuth2Credentials.Builder, OAuth2CredentialsOrBuilder> singleFieldBuilderV3 = this.credentialsBuilder_;
                    oAuth2CredentialsResponse.credentials_ = singleFieldBuilderV3 == null ? this.credentials_ : (OAuth2Credentials) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    oAuth2CredentialsResponse.environment_ = this.environment_;
                    i14 |= 4;
                }
                oAuth2CredentialsResponse.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<OAuth2Credentials, OAuth2Credentials.Builder, OAuth2CredentialsOrBuilder> getCredentialsFieldBuilder() {
                if (this.credentialsBuilder_ == null) {
                    this.credentialsBuilder_ = new SingleFieldBuilderV3<>(getCredentials(), getParentForChildren(), isClean());
                    this.credentials_ = null;
                }
                return this.credentialsBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICredentials.internal_static_GDI_Proto_Credentials_OAuth2CredentialsResponse_descriptor;
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
            public OAuth2CredentialsResponse build() {
                OAuth2CredentialsResponse oAuth2CredentialsResponseBuildPartial = buildPartial();
                if (oAuth2CredentialsResponseBuildPartial.isInitialized()) {
                    return oAuth2CredentialsResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) oAuth2CredentialsResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public OAuth2CredentialsResponse buildPartial() {
                OAuth2CredentialsResponse oAuth2CredentialsResponse = new OAuth2CredentialsResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(oAuth2CredentialsResponse);
                }
                onBuilt();
                return oAuth2CredentialsResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.credentialType_ = 0;
                this.credentials_ = null;
                SingleFieldBuilderV3<OAuth2Credentials, OAuth2Credentials.Builder, OAuth2CredentialsOrBuilder> singleFieldBuilderV3 = this.credentialsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.credentialsBuilder_ = null;
                }
                this.environment_ = 0;
                return this;
            }

            public Builder clearCredentialType() {
                this.bitField0_ &= -2;
                this.credentialType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearCredentials() {
                this.bitField0_ &= -3;
                this.credentials_ = null;
                SingleFieldBuilderV3<OAuth2Credentials, OAuth2Credentials.Builder, OAuth2CredentialsOrBuilder> singleFieldBuilderV3 = this.credentialsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.credentialsBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearEnvironment() {
                this.bitField0_ &= -5;
                this.environment_ = 0;
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

            @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsResponseOrBuilder
            public CredentialType getCredentialType() {
                CredentialType credentialTypeForNumber = CredentialType.forNumber(this.credentialType_);
                return credentialTypeForNumber == null ? CredentialType.ALPHA_IT_OAUTH_2 : credentialTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsResponseOrBuilder
            public OAuth2Credentials getCredentials() {
                SingleFieldBuilderV3<OAuth2Credentials, OAuth2Credentials.Builder, OAuth2CredentialsOrBuilder> singleFieldBuilderV3 = this.credentialsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (OAuth2Credentials) singleFieldBuilderV3.getMessage();
                }
                OAuth2Credentials oAuth2Credentials = this.credentials_;
                return oAuth2Credentials == null ? OAuth2Credentials.getDefaultInstance() : oAuth2Credentials;
            }

            public OAuth2Credentials.Builder getCredentialsBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (OAuth2Credentials.Builder) getCredentialsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsResponseOrBuilder
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
                return GDICredentials.internal_static_GDI_Proto_Credentials_OAuth2CredentialsResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsResponseOrBuilder
            public GCSLocation getEnvironment() {
                GCSLocation gCSLocationForNumber = GCSLocation.forNumber(this.environment_);
                return gCSLocationForNumber == null ? GCSLocation.PRODUCTION : gCSLocationForNumber;
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsResponseOrBuilder
            public boolean hasCredentialType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsResponseOrBuilder
            public boolean hasCredentials() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuth2CredentialsResponseOrBuilder
            public boolean hasEnvironment() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICredentials.internal_static_GDI_Proto_Credentials_OAuth2CredentialsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(OAuth2CredentialsResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasCredentialType();
            }

            public Builder mergeCredentials(OAuth2Credentials oAuth2Credentials) {
                OAuth2Credentials oAuth2Credentials2;
                SingleFieldBuilderV3<OAuth2Credentials, OAuth2Credentials.Builder, OAuth2CredentialsOrBuilder> singleFieldBuilderV3 = this.credentialsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(oAuth2Credentials);
                } else if ((this.bitField0_ & 2) == 0 || (oAuth2Credentials2 = this.credentials_) == null || oAuth2Credentials2 == OAuth2Credentials.getDefaultInstance()) {
                    this.credentials_ = oAuth2Credentials;
                } else {
                    getCredentialsBuilder().mergeFrom(oAuth2Credentials);
                }
                if (this.credentials_ != null) {
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
                                    if (CredentialType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.credentialType_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getCredentialsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    int i15 = codedInputStream.readEnum();
                                    if (GCSLocation.forNumber(i15) == null) {
                                        mergeUnknownVarintField(3, i15);
                                    } else {
                                        this.environment_ = i15;
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

            public Builder setCredentialType(CredentialType credentialType) {
                credentialType.getClass();
                this.bitField0_ |= 1;
                this.credentialType_ = credentialType.getNumber();
                onChanged();
                return this;
            }

            public Builder setCredentials(OAuth2Credentials.Builder builder) {
                SingleFieldBuilderV3<OAuth2Credentials, OAuth2Credentials.Builder, OAuth2CredentialsOrBuilder> singleFieldBuilderV3 = this.credentialsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.credentials_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setEnvironment(GCSLocation gCSLocation) {
                gCSLocation.getClass();
                this.bitField0_ |= 4;
                this.environment_ = gCSLocation.getNumber();
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
            public OAuth2CredentialsResponse getDefaultInstanceForType() {
                return OAuth2CredentialsResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.credentialType_ = 0;
                this.environment_ = 0;
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
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof OAuth2CredentialsResponse) {
                    return mergeFrom((OAuth2CredentialsResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(OAuth2CredentialsResponse oAuth2CredentialsResponse) {
                if (oAuth2CredentialsResponse == OAuth2CredentialsResponse.getDefaultInstance()) {
                    return this;
                }
                if (oAuth2CredentialsResponse.hasCredentialType()) {
                    setCredentialType(oAuth2CredentialsResponse.getCredentialType());
                }
                if (oAuth2CredentialsResponse.hasCredentials()) {
                    mergeCredentials(oAuth2CredentialsResponse.getCredentials());
                }
                if (oAuth2CredentialsResponse.hasEnvironment()) {
                    setEnvironment(oAuth2CredentialsResponse.getEnvironment());
                }
                mergeUnknownFields(oAuth2CredentialsResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public OAuth2CredentialsResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static OAuth2CredentialsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuth2CredentialsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static OAuth2CredentialsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static OAuth2CredentialsResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static OAuth2CredentialsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ OAuth2CredentialsResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static OAuth2CredentialsResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private OAuth2CredentialsResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.credentialType_ = 0;
            this.environment_ = 0;
        }

        public static OAuth2CredentialsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static OAuth2CredentialsResponse parseFrom(InputStream inputStream) {
            return (OAuth2CredentialsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static OAuth2CredentialsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuth2CredentialsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static OAuth2CredentialsResponse parseFrom(CodedInputStream codedInputStream) {
            return (OAuth2CredentialsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static OAuth2CredentialsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuth2CredentialsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OAuthCredentials extends GeneratedMessageV3 implements OAuthCredentialsOrBuilder {
        public static final int CONSUMER_KEY_FIELD_NUMBER = 1;
        public static final int CONSUMER_SECRET_FIELD_NUMBER = 2;
        public static final int OAUTH_SECRET_FIELD_NUMBER = 4;
        public static final int OAUTH_TOKEN_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object consumerKey_;
        private volatile Object consumerSecret_;
        private byte memoizedIsInitialized;
        private volatile Object oauthSecret_;
        private volatile Object oauthToken_;
        private static final OAuthCredentials DEFAULT_INSTANCE = new OAuthCredentials();

        @Deprecated
        public static final Parser<OAuthCredentials> PARSER = new AbstractParser<OAuthCredentials>() { // from class: com.garmin.proto.generated.GDICredentials.OAuthCredentials.1
            @Override // com.google.protobuf.Parser
            public OAuthCredentials parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = OAuthCredentials.newBuilder();
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

        private OAuthCredentials() {
            this.consumerKey_ = "";
            this.consumerSecret_ = "";
            this.oauthToken_ = "";
            this.oauthSecret_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.consumerKey_ = "";
            this.consumerSecret_ = "";
            this.oauthToken_ = "";
            this.oauthSecret_ = "";
        }

        public static OAuthCredentials getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICredentials.internal_static_GDI_Proto_Credentials_OAuthCredentials_descriptor;
        }

        public static Builder newBuilder(OAuthCredentials oAuthCredentials) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(oAuthCredentials);
        }

        public static OAuthCredentials parseDelimitedFrom(InputStream inputStream) {
            return (OAuthCredentials) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static OAuthCredentials parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<OAuthCredentials> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OAuthCredentials)) {
                return super.equals(obj);
            }
            OAuthCredentials oAuthCredentials = (OAuthCredentials) obj;
            if (hasConsumerKey() != oAuthCredentials.hasConsumerKey()) {
                return false;
            }
            if ((hasConsumerKey() && !getConsumerKey().equals(oAuthCredentials.getConsumerKey())) || hasConsumerSecret() != oAuthCredentials.hasConsumerSecret()) {
                return false;
            }
            if ((hasConsumerSecret() && !getConsumerSecret().equals(oAuthCredentials.getConsumerSecret())) || hasOauthToken() != oAuthCredentials.hasOauthToken()) {
                return false;
            }
            if ((!hasOauthToken() || getOauthToken().equals(oAuthCredentials.getOauthToken())) && hasOauthSecret() == oAuthCredentials.hasOauthSecret()) {
                return (!hasOauthSecret() || getOauthSecret().equals(oAuthCredentials.getOauthSecret())) && getUnknownFields().equals(oAuthCredentials.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuthCredentialsOrBuilder
        public String getConsumerKey() {
            Object obj = this.consumerKey_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.consumerKey_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuthCredentialsOrBuilder
        public ByteString getConsumerKeyBytes() {
            Object obj = this.consumerKey_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.consumerKey_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuthCredentialsOrBuilder
        public String getConsumerSecret() {
            Object obj = this.consumerSecret_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.consumerSecret_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuthCredentialsOrBuilder
        public ByteString getConsumerSecretBytes() {
            Object obj = this.consumerSecret_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.consumerSecret_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuthCredentialsOrBuilder
        public String getOauthSecret() {
            Object obj = this.oauthSecret_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.oauthSecret_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuthCredentialsOrBuilder
        public ByteString getOauthSecretBytes() {
            Object obj = this.oauthSecret_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.oauthSecret_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuthCredentialsOrBuilder
        public String getOauthToken() {
            Object obj = this.oauthToken_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.oauthToken_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuthCredentialsOrBuilder
        public ByteString getOauthTokenBytes() {
            Object obj = this.oauthToken_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.oauthToken_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<OAuthCredentials> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.consumerKey_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.consumerSecret_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.oauthToken_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.oauthSecret_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuthCredentialsOrBuilder
        public boolean hasConsumerKey() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuthCredentialsOrBuilder
        public boolean hasConsumerSecret() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuthCredentialsOrBuilder
        public boolean hasOauthSecret() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDICredentials.OAuthCredentialsOrBuilder
        public boolean hasOauthToken() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasConsumerKey()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getConsumerKey().hashCode();
            }
            if (hasConsumerSecret()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getConsumerSecret().hashCode();
            }
            if (hasOauthToken()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getOauthToken().hashCode();
            }
            if (hasOauthSecret()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getOauthSecret().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICredentials.internal_static_GDI_Proto_Credentials_OAuthCredentials_fieldAccessorTable.ensureFieldAccessorsInitialized(OAuthCredentials.class, Builder.class);
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
            if (!hasConsumerKey()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasConsumerSecret()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasOauthToken()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasOauthSecret()) {
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
            return new OAuthCredentials();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.consumerKey_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.consumerSecret_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.oauthToken_);
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.oauthSecret_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements OAuthCredentialsOrBuilder {
            private int bitField0_;
            private Object consumerKey_;
            private Object consumerSecret_;
            private Object oauthSecret_;
            private Object oauthToken_;

            private Builder() {
                this.consumerKey_ = "";
                this.consumerSecret_ = "";
                this.oauthToken_ = "";
                this.oauthSecret_ = "";
            }

            private void buildPartial0(OAuthCredentials oAuthCredentials) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    oAuthCredentials.consumerKey_ = this.consumerKey_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    oAuthCredentials.consumerSecret_ = this.consumerSecret_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    oAuthCredentials.oauthToken_ = this.oauthToken_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    oAuthCredentials.oauthSecret_ = this.oauthSecret_;
                    i14 |= 8;
                }
                oAuthCredentials.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICredentials.internal_static_GDI_Proto_Credentials_OAuthCredentials_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public OAuthCredentials build() {
                OAuthCredentials oAuthCredentialsBuildPartial = buildPartial();
                if (oAuthCredentialsBuildPartial.isInitialized()) {
                    return oAuthCredentialsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) oAuthCredentialsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public OAuthCredentials buildPartial() {
                OAuthCredentials oAuthCredentials = new OAuthCredentials(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(oAuthCredentials);
                }
                onBuilt();
                return oAuthCredentials;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.consumerKey_ = "";
                this.consumerSecret_ = "";
                this.oauthToken_ = "";
                this.oauthSecret_ = "";
                return this;
            }

            public Builder clearConsumerKey() {
                this.consumerKey_ = OAuthCredentials.getDefaultInstance().getConsumerKey();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearConsumerSecret() {
                this.consumerSecret_ = OAuthCredentials.getDefaultInstance().getConsumerSecret();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearOauthSecret() {
                this.oauthSecret_ = OAuthCredentials.getDefaultInstance().getOauthSecret();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearOauthToken() {
                this.oauthToken_ = OAuthCredentials.getDefaultInstance().getOauthToken();
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

            @Override // com.garmin.proto.generated.GDICredentials.OAuthCredentialsOrBuilder
            public String getConsumerKey() {
                Object obj = this.consumerKey_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.consumerKey_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuthCredentialsOrBuilder
            public ByteString getConsumerKeyBytes() {
                Object obj = this.consumerKey_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.consumerKey_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuthCredentialsOrBuilder
            public String getConsumerSecret() {
                Object obj = this.consumerSecret_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.consumerSecret_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuthCredentialsOrBuilder
            public ByteString getConsumerSecretBytes() {
                Object obj = this.consumerSecret_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.consumerSecret_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDICredentials.internal_static_GDI_Proto_Credentials_OAuthCredentials_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuthCredentialsOrBuilder
            public String getOauthSecret() {
                Object obj = this.oauthSecret_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.oauthSecret_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuthCredentialsOrBuilder
            public ByteString getOauthSecretBytes() {
                Object obj = this.oauthSecret_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.oauthSecret_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuthCredentialsOrBuilder
            public String getOauthToken() {
                Object obj = this.oauthToken_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.oauthToken_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuthCredentialsOrBuilder
            public ByteString getOauthTokenBytes() {
                Object obj = this.oauthToken_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.oauthToken_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuthCredentialsOrBuilder
            public boolean hasConsumerKey() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuthCredentialsOrBuilder
            public boolean hasConsumerSecret() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuthCredentialsOrBuilder
            public boolean hasOauthSecret() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDICredentials.OAuthCredentialsOrBuilder
            public boolean hasOauthToken() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICredentials.internal_static_GDI_Proto_Credentials_OAuthCredentials_fieldAccessorTable.ensureFieldAccessorsInitialized(OAuthCredentials.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasConsumerKey() && hasConsumerSecret() && hasOauthToken() && hasOauthSecret();
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
                                    this.consumerKey_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.consumerSecret_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.oauthToken_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.oauthSecret_ = codedInputStream.readBytes();
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

            public Builder setConsumerKey(String str) {
                str.getClass();
                this.consumerKey_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setConsumerKeyBytes(ByteString byteString) {
                byteString.getClass();
                this.consumerKey_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setConsumerSecret(String str) {
                str.getClass();
                this.consumerSecret_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setConsumerSecretBytes(ByteString byteString) {
                byteString.getClass();
                this.consumerSecret_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setOauthSecret(String str) {
                str.getClass();
                this.oauthSecret_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setOauthSecretBytes(ByteString byteString) {
                byteString.getClass();
                this.oauthSecret_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setOauthToken(String str) {
                str.getClass();
                this.oauthToken_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setOauthTokenBytes(ByteString byteString) {
                byteString.getClass();
                this.oauthToken_ = byteString;
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
            public OAuthCredentials getDefaultInstanceForType() {
                return OAuthCredentials.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.consumerKey_ = "";
                this.consumerSecret_ = "";
                this.oauthToken_ = "";
                this.oauthSecret_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof OAuthCredentials) {
                    return mergeFrom((OAuthCredentials) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(OAuthCredentials oAuthCredentials) {
                if (oAuthCredentials == OAuthCredentials.getDefaultInstance()) {
                    return this;
                }
                if (oAuthCredentials.hasConsumerKey()) {
                    this.consumerKey_ = oAuthCredentials.consumerKey_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (oAuthCredentials.hasConsumerSecret()) {
                    this.consumerSecret_ = oAuthCredentials.consumerSecret_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (oAuthCredentials.hasOauthToken()) {
                    this.oauthToken_ = oAuthCredentials.oauthToken_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (oAuthCredentials.hasOauthSecret()) {
                    this.oauthSecret_ = oAuthCredentials.oauthSecret_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                mergeUnknownFields(oAuthCredentials.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public OAuthCredentials getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static OAuthCredentials parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthCredentials) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static OAuthCredentials parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static OAuthCredentials parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static OAuthCredentials parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static OAuthCredentials parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static OAuthCredentials parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static OAuthCredentials parseFrom(InputStream inputStream) {
            return (OAuthCredentials) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static OAuthCredentials parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthCredentials) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static OAuthCredentials parseFrom(CodedInputStream codedInputStream) {
            return (OAuthCredentials) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static OAuthCredentials parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthCredentials) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private OAuthCredentials(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.consumerKey_ = "";
            this.consumerSecret_ = "";
            this.oauthToken_ = "";
            this.oauthSecret_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ OAuthCredentials(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class SIPCredentials extends GeneratedMessageV3 implements SIPCredentialsOrBuilder {
        private static final SIPCredentials DEFAULT_INSTANCE = new SIPCredentials();

        @Deprecated
        public static final Parser<SIPCredentials> PARSER = new AbstractParser<SIPCredentials>() { // from class: com.garmin.proto.generated.GDICredentials.SIPCredentials.1
            @Override // com.google.protobuf.Parser
            public SIPCredentials parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SIPCredentials.newBuilder();
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
        public static final int PASSWORD_FIELD_NUMBER = 3;
        public static final int SERVER_FIELD_NUMBER = 2;
        public static final int USERNAME_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private volatile Object password_;
        private volatile Object server_;
        private volatile Object username_;

        private SIPCredentials() {
            this.username_ = "";
            this.server_ = "";
            this.password_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.username_ = "";
            this.server_ = "";
            this.password_ = "";
        }

        public static SIPCredentials getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICredentials.internal_static_GDI_Proto_Credentials_SIPCredentials_descriptor;
        }

        public static Builder newBuilder(SIPCredentials sIPCredentials) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sIPCredentials);
        }

        public static SIPCredentials parseDelimitedFrom(InputStream inputStream) {
            return (SIPCredentials) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SIPCredentials parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SIPCredentials> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SIPCredentials)) {
                return super.equals(obj);
            }
            SIPCredentials sIPCredentials = (SIPCredentials) obj;
            if (hasUsername() != sIPCredentials.hasUsername()) {
                return false;
            }
            if ((hasUsername() && !getUsername().equals(sIPCredentials.getUsername())) || hasServer() != sIPCredentials.hasServer()) {
                return false;
            }
            if ((!hasServer() || getServer().equals(sIPCredentials.getServer())) && hasPassword() == sIPCredentials.hasPassword()) {
                return (!hasPassword() || getPassword().equals(sIPCredentials.getPassword())) && getUnknownFields().equals(sIPCredentials.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SIPCredentials> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDICredentials.SIPCredentialsOrBuilder
        public String getPassword() {
            Object obj = this.password_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.password_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDICredentials.SIPCredentialsOrBuilder
        public ByteString getPasswordBytes() {
            Object obj = this.password_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.password_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.username_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.server_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.password_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICredentials.SIPCredentialsOrBuilder
        public String getServer() {
            Object obj = this.server_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.server_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDICredentials.SIPCredentialsOrBuilder
        public ByteString getServerBytes() {
            Object obj = this.server_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.server_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDICredentials.SIPCredentialsOrBuilder
        public String getUsername() {
            Object obj = this.username_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.username_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDICredentials.SIPCredentialsOrBuilder
        public ByteString getUsernameBytes() {
            Object obj = this.username_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.username_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDICredentials.SIPCredentialsOrBuilder
        public boolean hasPassword() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDICredentials.SIPCredentialsOrBuilder
        public boolean hasServer() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDICredentials.SIPCredentialsOrBuilder
        public boolean hasUsername() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasUsername()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getUsername().hashCode();
            }
            if (hasServer()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getServer().hashCode();
            }
            if (hasPassword()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getPassword().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICredentials.internal_static_GDI_Proto_Credentials_SIPCredentials_fieldAccessorTable.ensureFieldAccessorsInitialized(SIPCredentials.class, Builder.class);
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
            return new SIPCredentials();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.username_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.server_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.password_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SIPCredentialsOrBuilder {
            private int bitField0_;
            private Object password_;
            private Object server_;
            private Object username_;

            private Builder() {
                this.username_ = "";
                this.server_ = "";
                this.password_ = "";
            }

            private void buildPartial0(SIPCredentials sIPCredentials) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    sIPCredentials.username_ = this.username_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    sIPCredentials.server_ = this.server_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    sIPCredentials.password_ = this.password_;
                    i14 |= 4;
                }
                sIPCredentials.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICredentials.internal_static_GDI_Proto_Credentials_SIPCredentials_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SIPCredentials build() {
                SIPCredentials sIPCredentialsBuildPartial = buildPartial();
                if (sIPCredentialsBuildPartial.isInitialized()) {
                    return sIPCredentialsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sIPCredentialsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SIPCredentials buildPartial() {
                SIPCredentials sIPCredentials = new SIPCredentials(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sIPCredentials);
                }
                onBuilt();
                return sIPCredentials;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.username_ = "";
                this.server_ = "";
                this.password_ = "";
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

            public Builder clearPassword() {
                this.password_ = SIPCredentials.getDefaultInstance().getPassword();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearServer() {
                this.server_ = SIPCredentials.getDefaultInstance().getServer();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearUsername() {
                this.username_ = SIPCredentials.getDefaultInstance().getUsername();
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
                return GDICredentials.internal_static_GDI_Proto_Credentials_SIPCredentials_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICredentials.SIPCredentialsOrBuilder
            public String getPassword() {
                Object obj = this.password_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.password_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDICredentials.SIPCredentialsOrBuilder
            public ByteString getPasswordBytes() {
                Object obj = this.password_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.password_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDICredentials.SIPCredentialsOrBuilder
            public String getServer() {
                Object obj = this.server_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.server_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDICredentials.SIPCredentialsOrBuilder
            public ByteString getServerBytes() {
                Object obj = this.server_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.server_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDICredentials.SIPCredentialsOrBuilder
            public String getUsername() {
                Object obj = this.username_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.username_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDICredentials.SIPCredentialsOrBuilder
            public ByteString getUsernameBytes() {
                Object obj = this.username_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.username_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDICredentials.SIPCredentialsOrBuilder
            public boolean hasPassword() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDICredentials.SIPCredentialsOrBuilder
            public boolean hasServer() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDICredentials.SIPCredentialsOrBuilder
            public boolean hasUsername() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICredentials.internal_static_GDI_Proto_Credentials_SIPCredentials_fieldAccessorTable.ensureFieldAccessorsInitialized(SIPCredentials.class, Builder.class);
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
                                    this.username_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.server_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.password_ = codedInputStream.readBytes();
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

            public Builder setPassword(String str) {
                str.getClass();
                this.password_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPasswordBytes(ByteString byteString) {
                byteString.getClass();
                this.password_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setServer(String str) {
                str.getClass();
                this.server_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setServerBytes(ByteString byteString) {
                byteString.getClass();
                this.server_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setUsername(String str) {
                str.getClass();
                this.username_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setUsernameBytes(ByteString byteString) {
                byteString.getClass();
                this.username_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SIPCredentials getDefaultInstanceForType() {
                return SIPCredentials.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.username_ = "";
                this.server_ = "";
                this.password_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SIPCredentials) {
                    return mergeFrom((SIPCredentials) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SIPCredentials sIPCredentials) {
                if (sIPCredentials == SIPCredentials.getDefaultInstance()) {
                    return this;
                }
                if (sIPCredentials.hasUsername()) {
                    this.username_ = sIPCredentials.username_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (sIPCredentials.hasServer()) {
                    this.server_ = sIPCredentials.server_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (sIPCredentials.hasPassword()) {
                    this.password_ = sIPCredentials.password_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                mergeUnknownFields(sIPCredentials.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SIPCredentials getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SIPCredentials parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SIPCredentials) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SIPCredentials parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SIPCredentials parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SIPCredentials parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SIPCredentials parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SIPCredentials parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SIPCredentials parseFrom(InputStream inputStream) {
            return (SIPCredentials) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SIPCredentials parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SIPCredentials) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SIPCredentials parseFrom(CodedInputStream codedInputStream) {
            return (SIPCredentials) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SIPCredentials parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SIPCredentials) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private SIPCredentials(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.username_ = "";
            this.server_ = "";
            this.password_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ SIPCredentials(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class SIPCredentialsResponse extends GeneratedMessageV3 implements SIPCredentialsResponseOrBuilder {
        public static final int CREDENTIALS_FIELD_NUMBER = 1;
        private static final SIPCredentialsResponse DEFAULT_INSTANCE = new SIPCredentialsResponse();

        @Deprecated
        public static final Parser<SIPCredentialsResponse> PARSER = new AbstractParser<SIPCredentialsResponse>() { // from class: com.garmin.proto.generated.GDICredentials.SIPCredentialsResponse.1
            @Override // com.google.protobuf.Parser
            public SIPCredentialsResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SIPCredentialsResponse.newBuilder();
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
        private SIPCredentials credentials_;
        private byte memoizedIsInitialized;

        private SIPCredentialsResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SIPCredentialsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDICredentials.internal_static_GDI_Proto_Credentials_SIPCredentialsResponse_descriptor;
        }

        public static Builder newBuilder(SIPCredentialsResponse sIPCredentialsResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sIPCredentialsResponse);
        }

        public static SIPCredentialsResponse parseDelimitedFrom(InputStream inputStream) {
            return (SIPCredentialsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SIPCredentialsResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SIPCredentialsResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SIPCredentialsResponse)) {
                return super.equals(obj);
            }
            SIPCredentialsResponse sIPCredentialsResponse = (SIPCredentialsResponse) obj;
            if (hasCredentials() != sIPCredentialsResponse.hasCredentials()) {
                return false;
            }
            return (!hasCredentials() || getCredentials().equals(sIPCredentialsResponse.getCredentials())) && getUnknownFields().equals(sIPCredentialsResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDICredentials.SIPCredentialsResponseOrBuilder
        public SIPCredentials getCredentials() {
            SIPCredentials sIPCredentials = this.credentials_;
            return sIPCredentials == null ? SIPCredentials.getDefaultInstance() : sIPCredentials;
        }

        @Override // com.garmin.proto.generated.GDICredentials.SIPCredentialsResponseOrBuilder
        public SIPCredentialsOrBuilder getCredentialsOrBuilder() {
            SIPCredentials sIPCredentials = this.credentials_;
            return sIPCredentials == null ? SIPCredentials.getDefaultInstance() : sIPCredentials;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SIPCredentialsResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getCredentials()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDICredentials.SIPCredentialsResponseOrBuilder
        public boolean hasCredentials() {
            return (this.bitField0_ & 1) != 0;
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
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDICredentials.internal_static_GDI_Proto_Credentials_SIPCredentialsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SIPCredentialsResponse.class, Builder.class);
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
            return new SIPCredentialsResponse();
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
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SIPCredentialsResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<SIPCredentials, SIPCredentials.Builder, SIPCredentialsOrBuilder> credentialsBuilder_;
            private SIPCredentials credentials_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(SIPCredentialsResponse sIPCredentialsResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<SIPCredentials, SIPCredentials.Builder, SIPCredentialsOrBuilder> singleFieldBuilderV3 = this.credentialsBuilder_;
                    sIPCredentialsResponse.credentials_ = singleFieldBuilderV3 == null ? this.credentials_ : (SIPCredentials) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                sIPCredentialsResponse.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<SIPCredentials, SIPCredentials.Builder, SIPCredentialsOrBuilder> getCredentialsFieldBuilder() {
                if (this.credentialsBuilder_ == null) {
                    this.credentialsBuilder_ = new SingleFieldBuilderV3<>(getCredentials(), getParentForChildren(), isClean());
                    this.credentials_ = null;
                }
                return this.credentialsBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDICredentials.internal_static_GDI_Proto_Credentials_SIPCredentialsResponse_descriptor;
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
            public SIPCredentialsResponse build() {
                SIPCredentialsResponse sIPCredentialsResponseBuildPartial = buildPartial();
                if (sIPCredentialsResponseBuildPartial.isInitialized()) {
                    return sIPCredentialsResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sIPCredentialsResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SIPCredentialsResponse buildPartial() {
                SIPCredentialsResponse sIPCredentialsResponse = new SIPCredentialsResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sIPCredentialsResponse);
                }
                onBuilt();
                return sIPCredentialsResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.credentials_ = null;
                SingleFieldBuilderV3<SIPCredentials, SIPCredentials.Builder, SIPCredentialsOrBuilder> singleFieldBuilderV3 = this.credentialsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.credentialsBuilder_ = null;
                }
                return this;
            }

            public Builder clearCredentials() {
                this.bitField0_ &= -2;
                this.credentials_ = null;
                SingleFieldBuilderV3<SIPCredentials, SIPCredentials.Builder, SIPCredentialsOrBuilder> singleFieldBuilderV3 = this.credentialsBuilder_;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDICredentials.SIPCredentialsResponseOrBuilder
            public SIPCredentials getCredentials() {
                SingleFieldBuilderV3<SIPCredentials, SIPCredentials.Builder, SIPCredentialsOrBuilder> singleFieldBuilderV3 = this.credentialsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SIPCredentials) singleFieldBuilderV3.getMessage();
                }
                SIPCredentials sIPCredentials = this.credentials_;
                return sIPCredentials == null ? SIPCredentials.getDefaultInstance() : sIPCredentials;
            }

            public SIPCredentials.Builder getCredentialsBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SIPCredentials.Builder) getCredentialsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDICredentials.SIPCredentialsResponseOrBuilder
            public SIPCredentialsOrBuilder getCredentialsOrBuilder() {
                SingleFieldBuilderV3<SIPCredentials, SIPCredentials.Builder, SIPCredentialsOrBuilder> singleFieldBuilderV3 = this.credentialsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SIPCredentialsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SIPCredentials sIPCredentials = this.credentials_;
                return sIPCredentials == null ? SIPCredentials.getDefaultInstance() : sIPCredentials;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDICredentials.internal_static_GDI_Proto_Credentials_SIPCredentialsResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDICredentials.SIPCredentialsResponseOrBuilder
            public boolean hasCredentials() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDICredentials.internal_static_GDI_Proto_Credentials_SIPCredentialsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SIPCredentialsResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeCredentials(SIPCredentials sIPCredentials) {
                SIPCredentials sIPCredentials2;
                SingleFieldBuilderV3<SIPCredentials, SIPCredentials.Builder, SIPCredentialsOrBuilder> singleFieldBuilderV3 = this.credentialsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(sIPCredentials);
                } else if ((this.bitField0_ & 1) == 0 || (sIPCredentials2 = this.credentials_) == null || sIPCredentials2 == SIPCredentials.getDefaultInstance()) {
                    this.credentials_ = sIPCredentials;
                } else {
                    getCredentialsBuilder().mergeFrom(sIPCredentials);
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

            public Builder setCredentials(SIPCredentials.Builder builder) {
                SingleFieldBuilderV3<SIPCredentials, SIPCredentials.Builder, SIPCredentialsOrBuilder> singleFieldBuilderV3 = this.credentialsBuilder_;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SIPCredentialsResponse getDefaultInstanceForType() {
                return SIPCredentialsResponse.getDefaultInstance();
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

            public Builder setCredentials(SIPCredentials sIPCredentials) {
                SingleFieldBuilderV3<SIPCredentials, SIPCredentials.Builder, SIPCredentialsOrBuilder> singleFieldBuilderV3 = this.credentialsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    sIPCredentials.getClass();
                    this.credentials_ = sIPCredentials;
                } else {
                    singleFieldBuilderV3.setMessage(sIPCredentials);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SIPCredentialsResponse) {
                    return mergeFrom((SIPCredentialsResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SIPCredentialsResponse sIPCredentialsResponse) {
                if (sIPCredentialsResponse == SIPCredentialsResponse.getDefaultInstance()) {
                    return this;
                }
                if (sIPCredentialsResponse.hasCredentials()) {
                    mergeCredentials(sIPCredentialsResponse.getCredentials());
                }
                mergeUnknownFields(sIPCredentialsResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SIPCredentialsResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ SIPCredentialsResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SIPCredentialsResponse() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SIPCredentialsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SIPCredentialsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SIPCredentialsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SIPCredentialsResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SIPCredentialsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SIPCredentialsResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SIPCredentialsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SIPCredentialsResponse parseFrom(InputStream inputStream) {
            return (SIPCredentialsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SIPCredentialsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SIPCredentialsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SIPCredentialsResponse parseFrom(CodedInputStream codedInputStream) {
            return (SIPCredentialsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SIPCredentialsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SIPCredentialsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public enum CredentialType implements ProtocolMessageEnum {
        ALPHA_IT_OAUTH_2(0),
        GENERIC_IT_OAUTH_2(1),
        AMAZON_MUSIC(2);

        public static final int ALPHA_IT_OAUTH_2_VALUE = 0;
        public static final int AMAZON_MUSIC_VALUE = 2;
        public static final int GENERIC_IT_OAUTH_2_VALUE = 1;
        private final int value;
        private static final Internal.EnumLiteMap<CredentialType> internalValueMap = new Internal.EnumLiteMap<CredentialType>() { // from class: com.garmin.proto.generated.GDICredentials.CredentialType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public CredentialType findValueByNumber(int i14) {
                return CredentialType.forNumber(i14);
            }
        };
        private static final CredentialType[] VALUES = values();

        CredentialType(int i14) {
            this.value = i14;
        }

        public static CredentialType forNumber(int i14) {
            if (i14 == 0) {
                return ALPHA_IT_OAUTH_2;
            }
            if (i14 == 1) {
                return GENERIC_IT_OAUTH_2;
            }
            if (i14 != 2) {
                return null;
            }
            return AMAZON_MUSIC;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDICredentials.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<CredentialType> internalGetValueMap() {
            return internalValueMap;
        }

        public static CredentialType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static CredentialType valueOf(int i14) {
            return forNumber(i14);
        }
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
        private static final Internal.EnumLiteMap<GCSLocation> internalValueMap = new Internal.EnumLiteMap<GCSLocation>() { // from class: com.garmin.proto.generated.GDICredentials.GCSLocation.1
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
            return GDICredentials.getDescriptor().getEnumTypes().get(1);
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
}
