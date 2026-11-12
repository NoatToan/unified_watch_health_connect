package com.garmin.proto.generated;

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
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes11.dex */
public final class GDIConnectIQHTTPProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0016GDIConnectIQHTTP.proto\u0012\u0017GDI.Proto.ConnectIQHTTP\u001a\rGDICore.proto\u001a\u0012GDIDataTypes.proto\"¹\u0007\n\u0014ConnectIQHTTPService\u0012N\n\u0017connect_iq_http_request\u0018\u0001 \u0001(\u000b2-.GDI.Proto.ConnectIQHTTP.ConnectIQHTTPRequest\u0012P\n\u0018connect_iq_http_response\u0018\u0002 \u0001(\u000b2..GDI.Proto.ConnectIQHTTP.ConnectIQHTTPResponse\u0012P\n\u0018connect_iq_image_request\u0018\u0003 \u0001(\u000b2..GDI.Proto.ConnectIQHTTP.ConnectIQImageRequest\u0012R\n\u0019connect_iq_image_response\u0018\u0004 \u0001(\u000b2/.GDI.Proto.ConnectIQHTTP.ConnectIQImageResponse\u0012I\n\u0014raw_resource_request\u0018\u0005 \u0001(\u000b2+.GDI.Proto.ConnectIQHTTP.RawResourceRequest\u0012K\n\u0015raw_resource_response\u0018\u0006 \u0001(\u000b2,.GDI.Proto.ConnectIQHTTP.RawResourceResponse\u0012P\n\u0018connect_iq_oauth_request\u0018\u0007 \u0001(\u000b2..GDI.Proto.ConnectIQHTTP.ConnectIQOAuthRequest\u0012R\n\u0019connect_iq_oauth_response\u0018\b \u0001(\u000b2/.GDI.Proto.ConnectIQHTTP.ConnectIQOAuthResponse\u0012a\n!connect_iq_oauth_complete_request\u0018\t \u0001(\u000b26.GDI.Proto.ConnectIQHTTP.ConnectIQOAuthCompleteRequest\u0012c\n\"connect_iq_oauth_complete_response\u0018\n \u0001(\u000b27.GDI.Proto.ConnectIQHTTP.ConnectIQOAuthCompleteResponse\u0012S\n\u0019open_webpage_notification\u0018\u000b \u0001(\u000b20.GDI.Proto.ConnectIQHTTP.OpenWebpageNotification\"\u0086\u0005\n\u0014ConnectIQHTTPRequest\u0012\u000b\n\u0003url\u0018\u0001 \u0002(\t\u0012M\n\u000bhttp_method\u0018\u0002 \u0001(\u000e28.GDI.Proto.ConnectIQHTTP.ConnectIQHTTPRequest.HTTPMethod\u0012\u001a\n\u0012http_header_fields\u0018\u0003 \u0001(\f\u0012\u0011\n\thttp_body\u0018\u0004 \u0001(\f\u0012\u001b\n\u0013max_response_length\u0018\u0005 \u0001(\r\u00124\n&include_http_header_fields_in_response\u0018\u0006 \u0001(\b:\u0004true\u0012%\n\u0016compress_response_body\u0018\u0007 \u0001(\b:\u0005false\u0012Q\n\rresponse_type\u0018\b \u0001(\u000e2:.GDI.Proto.ConnectIQHTTP.ConnectIQHTTPRequest.ResponseType\u0012Q\n\u0007version\u0018\t \u0001(\u000e25.GDI.Proto.ConnectIQHTTP.ConnectIQHTTPRequest.Version:\tVERSION_1\"V\n\nHTTPMethod\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u0007\n\u0003GET\u0010\u0001\u0012\u0007\n\u0003PUT\u0010\u0002\u0012\b\n\u0004POST\u0010\u0003\u0012\n\n\u0006DELETE\u0010\u0004\u0012\t\n\u0005PATCH\u0010\u0005\u0012\b\n\u0004HEAD\u0010\u0006\"B\n\fResponseType\u0012\b\n\u0004JSON\u0010\u0000\u0012\u000f\n\u000bURL_ENCODED\u0010\u0001\u0012\u000e\n\nPLAIN_TEXT\u0010\u0002\u0012\u0007\n\u0003XML\u0010\u0003\"'\n\u0007Version\u0012\r\n\tVERSION_1\u0010\u0000\u0012\r\n\tVERSION_2\u0010\u0001\"î\u0004\n\u0015ConnectIQHTTPResponse\u0012M\n\u0006status\u0018\u0001 \u0001(\u000e2=.GDI.Proto.ConnectIQHTTP.ConnectIQHTTPResponse.ResponseStatus\u0012\u0018\n\u0010http_status_code\u0018\u0002 \u0001(\u0005\u0012\u0011\n\thttp_body\u0018\u0003 \u0001(\f\u0012\u001a\n\u0012http_header_fields\u0018\u0004 \u0001(\f\u0012\u0015\n\rinflated_size\u0018\u0005 \u0001(\r\u0012Q\n\rresponse_type\u0018\u0006 \u0001(\u000e2:.GDI.Proto.ConnectIQHTTP.ConnectIQHTTPRequest.ResponseType\"Ò\u0002\n\u000eResponseStatus\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u0006\n\u0002OK\u0010d\u0012*\n%INVALID_HTTP_HEADER_FIELDS_IN_REQUEST\u0010È\u0001\u0012!\n\u001cINVALID_HTTP_BODY_IN_REQUEST\u0010É\u0001\u0012#\n\u001eINVALID_HTTP_METHOD_IN_REQUEST\u0010Ê\u0001\u0012\u001e\n\u0019NETWORK_REQUEST_TIMED_OUT\u0010¬\u0002\u0012*\n%INVALID_HTTP_BODY_IN_NETWORK_RESPONSE\u0010\u0090\u0003\u00123\n.INVALID_HTTP_HEADER_FIELDS_IN_NETWORK_RESPONSE\u0010\u0091\u0003\u0012\u001f\n\u001aNETWORK_RESPONSE_TOO_LARGE\u0010\u0092\u0003\u0012\u0015\n\u0010INSECURE_REQUEST\u0010é\u0007\"\u0092\u0002\n\u0015ConnectIQImageRequest\u0012\u000b\n\u0003url\u0018\u0001 \u0002(\t\u0012\u0012\n\npartNumber\u0018\u0002 \u0002(\r\u0012\u0011\n\tmax_width\u0018\u0003 \u0001(\r\u0012\u0012\n\nmax_height\u0018\u0004 \u0001(\r\u0012\u0010\n\bmax_size\u0018\u0005 \u0001(\r\u0012\u000f\n\u0007palette\u0018\u0006 \u0001(\f\u0012K\n\tdithering\u0018\u0007 \u0001(\u000e28.GDI.Proto.ConnectIQHTTP.ConnectIQImageRequest.Dithering\u0012\u0015\n\ruse_data_xfer\u0018\b \u0001(\b\"*\n\tDithering\u0012\b\n\u0004NONE\u0010\u0000\u0012\u0013\n\u000fFLOYD_STEINBERG\u0010\u0001\"ã\u0002\n\u0016ConnectIQImageResponse\u0012N\n\u0006status\u0018\u0001 \u0001(\u000e2>.GDI.Proto.ConnectIQHTTP.ConnectIQImageResponse.ResponseStatus\u0012\u0018\n\u0010http_status_code\u0018\u0002 \u0001(\u0005\u0012\u0012\n\nimage_data\u0018\u0003 \u0001(\f\u0012\r\n\u0005width\u0018\u0004 \u0001(\r\u0012\u000e\n\u0006height\u0018\u0005 \u0001(\r\u0012\u0015\n\rinflated_size\u0018\u0006 \u0001(\r\u00128\n\txfer_data\u0018\u0007 \u0001(\u000b2%.GDI.Proto.DataTypes.DataTransferItem\"[\n\u000eResponseStatus\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u0006\n\u0002OK\u0010d\u0012\u001e\n\u0019NETWORK_REQUEST_TIMED_OUT\u0010È\u0001\u0012\u0014\n\u000fIMAGE_TOO_LARGE\u0010¬\u0002\"A\n\u0011EncryptedEnvelope\u0012\u0013\n\u000bcipher_text\u0018\u0001 \u0001(\f\u0012\n\n\u0002iv\u0018\u0002 \u0001(\f\u0012\u000b\n\u0003tag\u0018\u0003 \u0001(\f\"ö\u0005\n\u0012RawResourceRequest\u0012\u000b\n\u0003url\u0018\u0001 \u0002(\t\u0012\u0010\n\bmax_size\u0018\u0002 \u0001(\r\u0012K\n\u0006method\u0018\u0003 \u0001(\u000e26.GDI.Proto.ConnectIQHTTP.RawResourceRequest.HTTPMethod:\u0003GET\u0012\f\n\u0004body\u0018\u0004 \u0001(\t\u0012G\n\u0007headers\u0018\u0005 \u0003(\u000b26.GDI.Proto.ConnectIQHTTP.RawResourceRequest.HTTPHeader\u0012\u0015\n\ruse_data_xfer\u0018\u0006 \u0001(\b\u0012\u0010\n\braw_body\u0018\u0007 \u0001(\f\u0012H\n\u0005forms\u0018\b \u0003(\u000b29.GDI.Proto.ConnectIQHTTP.RawResourceRequest.MultipartForm\u0012&\n\u001aconnection_timeout_seconds\u0018\t \u0001(\u0005:\u000260\u0012 \n\u0014read_timeout_seconds\u0018\n \u0001(\u0005:\u000260\u0012E\n\u0011encrypted_request\u0018\u000b \u0001(\u000b2*.GDI.Proto.ConnectIQHTTP.EncryptedEnvelope\u001a(\n\nHTTPHeader\u0012\u000b\n\u0003key\u0018\u0001 \u0002(\t\u0012\r\n\u0005value\u0018\u0002 \u0002(\t\u001a\u0096\u0001\n\rMultipartForm\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u0010\n\bfilename\u0018\u0002 \u0001(\t\u0012\u0014\n\fcontent_type\u0018\u0003 \u0001(\t\u0012\u0015\n\rresource_data\u0018\u0004 \u0001(\f\u00128\n\txfer_data\u0018\u0005 \u0001(\u000b2%.GDI.Proto.DataTypes.DataTransferItem\"V\n\nHTTPMethod\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u0007\n\u0003GET\u0010\u0001\u0012\u0007\n\u0003PUT\u0010\u0002\u0012\b\n\u0004POST\u0010\u0003\u0012\n\n\u0006DELETE\u0010\u0004\u0012\t\n\u0005PATCH\u0010\u0005\u0012\b\n\u0004HEAD\u0010\u0006\"Ø\u0003\n\u0013RawResourceResponse\u0012K\n\u0006status\u0018\u0001 \u0001(\u000e2;.GDI.Proto.ConnectIQHTTP.RawResourceResponse.ResponseStatus\u0012\u0018\n\u0010http_status_code\u0018\u0002 \u0001(\u0005\u0012\u0015\n\rresource_data\u0018\u0003 \u0001(\f\u00128\n\txfer_data\u0018\u0004 \u0001(\u000b2%.GDI.Proto.DataTypes.DataTransferItem\u0012H\n\u0007headers\u0018\u0005 \u0003(\u000b27.GDI.Proto.ConnectIQHTTP.RawResourceResponse.HTTPHeader\u001a(\n\nHTTPHeader\u0012\u000b\n\u0003key\u0018\u0001 \u0002(\t\u0012\r\n\u0005value\u0018\u0002 \u0002(\t\"\u0094\u0001\n\u000eResponseStatus\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u0006\n\u0002OK\u0010d\u0012\u001e\n\u0019NETWORK_REQUEST_TIMED_OUT\u0010È\u0001\u0012\u0013\n\u000eFILE_TOO_LARGE\u0010¬\u0002\u0012\u001f\n\u001aDATA_TRANSFER_ITEM_FAILURE\u0010\u0090\u0003\u0012\u0017\n\u0012DECRYPTION_FAILURE\u0010ô\u0003\"¼\u0001\n\u0013CapabilitiesRequest\u0012\u0017\n\u000fservice_version\u0018\u0001 \u0001(\r\u0012\u0016\n\u000eencryption_key\u0018\u0002 \u0001(\f2t\n\u0012connect_iq_request\u0012*.GDI.Proto.Core.FeatureCapabilitiesRequest\u0018\r \u0001(\u000b2,.GDI.Proto.ConnectIQHTTP.CapabilitiesRequest\"\u008e\u0001\n\u0014CapabilitiesResponse2v\n\u0012connect_iq_request\u0012+.GDI.Proto.Core.FeatureCapabilitiesResponse\u0018\r \u0001(\u000b2-.GDI.Proto.ConnectIQHTTP.CapabilitiesResponse\"ä\u0002\n\u0015ConnectIQOAuthRequest\u0012\u0013\n\u000binitial_url\u0018\u0001 \u0002(\t\u0012\u001e\n\u0016initial_url_parameters\u0018\u0002 \u0001(\f\u0012\u001c\n\u0014parameters_encrypted\u0018\u0003 \u0001(\b\u0012\u001d\n\u0015parameters_compressed\u0018\u0004 \u0001(\b\u0012\u0012\n\nresult_url\u0018\u0005 \u0002(\t\u0012P\n\u000bresult_type\u0018\u0006 \u0001(\u000e2;.GDI.Proto.ConnectIQHTTP.ConnectIQOAuthRequest.ResultFormat\u0012\u0013\n\u000bresult_keys\u0018\u0007 \u0001(\f\u0012\u0010\n\bapp_name\u0018\b \u0001(\t\u0012\u0010\n\bapp_uuid\u0018\t \u0002(\f\u0012\u0012\n\nstore_uuid\u0018\n \u0001(\f\"&\n\fResultFormat\u0012\u0007\n\u0003URL\u0010\u0000\u0012\r\n\tBODY_JSON\u0010\u0001\"º\u0001\n\u0016ConnectIQOAuthResponse\u0012N\n\u0006status\u0018\u0001 \u0002(\u000e2>.GDI.Proto.ConnectIQHTTP.ConnectIQOAuthResponse.ResponseStatus\"P\n\u000eResponseStatus\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u0006\n\u0002OK\u0010\u0001\u0012\u000f\n\u000bBAD_REQUEST\u0010\u0002\u0012\u0018\n\u0014NOTIFICATION_FAILURE\u0010\u0003\"\u0095\u0002\n\u001dConnectIQOAuthCompleteRequest\u0012U\n\u0006status\u0018\u0001 \u0002(\u000e2E.GDI.Proto.ConnectIQHTTP.ConnectIQOAuthCompleteRequest.ResponseStatus\u0012\u0018\n\u0010http_status_code\u0018\u0002 \u0001(\u0005\u0012\u0010\n\bapp_uuid\u0018\u0003 \u0002(\f\u0012\f\n\u0004data\u0018\u0004 \u0001(\f\u0012\u0011\n\tencrypted\u0018\u0005 \u0001(\b\u0012\u0012\n\ncompressed\u0018\u0006 \u0001(\b\"<\n\u000eResponseStatus\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u0006\n\u0002OK\u0010\u0001\u0012\u0015\n\u0011WEB_REQUEST_ERROR\u0010\u0002\"\u009f\u0001\n\u001eConnectIQOAuthCompleteResponse\u0012V\n\u0006status\u0018\u0001 \u0002(\u000e2F.GDI.Proto.ConnectIQHTTP.ConnectIQOAuthCompleteResponse.ResponseStatus\"%\n\u000eResponseStatus\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u0006\n\u0002OK\u0010\u0001\"H\n\u0017OpenWebpageNotification\u0012\u000b\n\u0003url\u0018\u0001 \u0002(\t\u0012\u000e\n\u0006params\u0018\u0002 \u0001(\f\u0012\u0010\n\bapp_name\u0018\u0003 \u0001(\tB5\n\u001acom.garmin.proto.generatedB\u0015GDIConnectIQHTTPProtoH\u0003"}, new Descriptors.FileDescriptor[]{GDICore.getDescriptor(), GDIDataTypes.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQHTTP_CapabilitiesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQHTTP_CapabilitiesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQHTTP_CapabilitiesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQHTTP_CapabilitiesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQHTTPRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQHTTPRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQHTTPResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQHTTPResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQHTTPService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQHTTPService_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQImageRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQImageRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQImageResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQImageResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQOAuthCompleteRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQOAuthCompleteRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQOAuthCompleteResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQOAuthCompleteResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQOAuthRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQOAuthRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQOAuthResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQOAuthResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQHTTP_EncryptedEnvelope_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQHTTP_EncryptedEnvelope_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQHTTP_OpenWebpageNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQHTTP_OpenWebpageNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQHTTP_RawResourceRequest_HTTPHeader_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQHTTP_RawResourceRequest_HTTPHeader_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQHTTP_RawResourceRequest_MultipartForm_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQHTTP_RawResourceRequest_MultipartForm_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQHTTP_RawResourceRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQHTTP_RawResourceRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQHTTP_RawResourceResponse_HTTPHeader_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQHTTP_RawResourceResponse_HTTPHeader_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectIQHTTP_RawResourceResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectIQHTTP_RawResourceResponse_fieldAccessorTable;

    public interface CapabilitiesRequestOrBuilder extends MessageOrBuilder {
        ByteString getEncryptionKey();

        int getServiceVersion();

        boolean hasEncryptionKey();

        boolean hasServiceVersion();
    }

    public interface CapabilitiesResponseOrBuilder extends MessageOrBuilder {
    }

    public interface ConnectIQHTTPRequestOrBuilder extends MessageOrBuilder {
        boolean getCompressResponseBody();

        ByteString getHttpBody();

        ByteString getHttpHeaderFields();

        ConnectIQHTTPRequest.HTTPMethod getHttpMethod();

        boolean getIncludeHttpHeaderFieldsInResponse();

        int getMaxResponseLength();

        ConnectIQHTTPRequest.ResponseType getResponseType();

        String getUrl();

        ByteString getUrlBytes();

        ConnectIQHTTPRequest.Version getVersion();

        boolean hasCompressResponseBody();

        boolean hasHttpBody();

        boolean hasHttpHeaderFields();

        boolean hasHttpMethod();

        boolean hasIncludeHttpHeaderFieldsInResponse();

        boolean hasMaxResponseLength();

        boolean hasResponseType();

        boolean hasUrl();

        boolean hasVersion();
    }

    public interface ConnectIQHTTPResponseOrBuilder extends MessageOrBuilder {
        ByteString getHttpBody();

        ByteString getHttpHeaderFields();

        int getHttpStatusCode();

        int getInflatedSize();

        ConnectIQHTTPRequest.ResponseType getResponseType();

        ConnectIQHTTPResponse.ResponseStatus getStatus();

        boolean hasHttpBody();

        boolean hasHttpHeaderFields();

        boolean hasHttpStatusCode();

        boolean hasInflatedSize();

        boolean hasResponseType();

        boolean hasStatus();
    }

    public interface ConnectIQHTTPServiceOrBuilder extends MessageOrBuilder {
        ConnectIQHTTPRequest getConnectIqHttpRequest();

        ConnectIQHTTPRequestOrBuilder getConnectIqHttpRequestOrBuilder();

        ConnectIQHTTPResponse getConnectIqHttpResponse();

        ConnectIQHTTPResponseOrBuilder getConnectIqHttpResponseOrBuilder();

        ConnectIQImageRequest getConnectIqImageRequest();

        ConnectIQImageRequestOrBuilder getConnectIqImageRequestOrBuilder();

        ConnectIQImageResponse getConnectIqImageResponse();

        ConnectIQImageResponseOrBuilder getConnectIqImageResponseOrBuilder();

        ConnectIQOAuthCompleteRequest getConnectIqOauthCompleteRequest();

        ConnectIQOAuthCompleteRequestOrBuilder getConnectIqOauthCompleteRequestOrBuilder();

        ConnectIQOAuthCompleteResponse getConnectIqOauthCompleteResponse();

        ConnectIQOAuthCompleteResponseOrBuilder getConnectIqOauthCompleteResponseOrBuilder();

        ConnectIQOAuthRequest getConnectIqOauthRequest();

        ConnectIQOAuthRequestOrBuilder getConnectIqOauthRequestOrBuilder();

        ConnectIQOAuthResponse getConnectIqOauthResponse();

        ConnectIQOAuthResponseOrBuilder getConnectIqOauthResponseOrBuilder();

        OpenWebpageNotification getOpenWebpageNotification();

        OpenWebpageNotificationOrBuilder getOpenWebpageNotificationOrBuilder();

        RawResourceRequest getRawResourceRequest();

        RawResourceRequestOrBuilder getRawResourceRequestOrBuilder();

        RawResourceResponse getRawResourceResponse();

        RawResourceResponseOrBuilder getRawResourceResponseOrBuilder();

        boolean hasConnectIqHttpRequest();

        boolean hasConnectIqHttpResponse();

        boolean hasConnectIqImageRequest();

        boolean hasConnectIqImageResponse();

        boolean hasConnectIqOauthCompleteRequest();

        boolean hasConnectIqOauthCompleteResponse();

        boolean hasConnectIqOauthRequest();

        boolean hasConnectIqOauthResponse();

        boolean hasOpenWebpageNotification();

        boolean hasRawResourceRequest();

        boolean hasRawResourceResponse();
    }

    public interface ConnectIQImageRequestOrBuilder extends MessageOrBuilder {
        ConnectIQImageRequest.Dithering getDithering();

        int getMaxHeight();

        int getMaxSize();

        int getMaxWidth();

        ByteString getPalette();

        int getPartNumber();

        String getUrl();

        ByteString getUrlBytes();

        boolean getUseDataXfer();

        boolean hasDithering();

        boolean hasMaxHeight();

        boolean hasMaxSize();

        boolean hasMaxWidth();

        boolean hasPalette();

        boolean hasPartNumber();

        boolean hasUrl();

        boolean hasUseDataXfer();
    }

    public interface ConnectIQImageResponseOrBuilder extends MessageOrBuilder {
        int getHeight();

        int getHttpStatusCode();

        ByteString getImageData();

        int getInflatedSize();

        ConnectIQImageResponse.ResponseStatus getStatus();

        int getWidth();

        GDIDataTypes.DataTransferItem getXferData();

        GDIDataTypes.DataTransferItemOrBuilder getXferDataOrBuilder();

        boolean hasHeight();

        boolean hasHttpStatusCode();

        boolean hasImageData();

        boolean hasInflatedSize();

        boolean hasStatus();

        boolean hasWidth();

        boolean hasXferData();
    }

    /* JADX INFO: loaded from: classes4.dex */
    public interface ConnectIQOAuthCompleteRequestOrBuilder extends MessageOrBuilder {
        ByteString getAppUuid();

        boolean getCompressed();

        ByteString getData();

        boolean getEncrypted();

        int getHttpStatusCode();

        ConnectIQOAuthCompleteRequest.ResponseStatus getStatus();

        boolean hasAppUuid();

        boolean hasCompressed();

        boolean hasData();

        boolean hasEncrypted();

        boolean hasHttpStatusCode();

        boolean hasStatus();
    }

    /* JADX INFO: loaded from: classes4.dex */
    public interface ConnectIQOAuthCompleteResponseOrBuilder extends MessageOrBuilder {
        ConnectIQOAuthCompleteResponse.ResponseStatus getStatus();

        boolean hasStatus();
    }

    /* JADX INFO: loaded from: classes4.dex */
    public interface ConnectIQOAuthRequestOrBuilder extends MessageOrBuilder {
        String getAppName();

        ByteString getAppNameBytes();

        ByteString getAppUuid();

        String getInitialUrl();

        ByteString getInitialUrlBytes();

        ByteString getInitialUrlParameters();

        boolean getParametersCompressed();

        boolean getParametersEncrypted();

        ByteString getResultKeys();

        ConnectIQOAuthRequest.ResultFormat getResultType();

        String getResultUrl();

        ByteString getResultUrlBytes();

        ByteString getStoreUuid();

        boolean hasAppName();

        boolean hasAppUuid();

        boolean hasInitialUrl();

        boolean hasInitialUrlParameters();

        boolean hasParametersCompressed();

        boolean hasParametersEncrypted();

        boolean hasResultKeys();

        boolean hasResultType();

        boolean hasResultUrl();

        boolean hasStoreUuid();
    }

    /* JADX INFO: loaded from: classes4.dex */
    public interface ConnectIQOAuthResponseOrBuilder extends MessageOrBuilder {
        ConnectIQOAuthResponse.ResponseStatus getStatus();

        boolean hasStatus();
    }

    /* JADX INFO: loaded from: classes4.dex */
    public interface EncryptedEnvelopeOrBuilder extends MessageOrBuilder {
        ByteString getCipherText();

        ByteString getIv();

        ByteString getTag();

        boolean hasCipherText();

        boolean hasIv();

        boolean hasTag();
    }

    /* JADX INFO: loaded from: classes4.dex */
    public interface OpenWebpageNotificationOrBuilder extends MessageOrBuilder {
        String getAppName();

        ByteString getAppNameBytes();

        ByteString getParams();

        String getUrl();

        ByteString getUrlBytes();

        boolean hasAppName();

        boolean hasParams();

        boolean hasUrl();
    }

    /* JADX INFO: loaded from: classes4.dex */
    public interface RawResourceRequestOrBuilder extends MessageOrBuilder {
        String getBody();

        ByteString getBodyBytes();

        int getConnectionTimeoutSeconds();

        EncryptedEnvelope getEncryptedRequest();

        EncryptedEnvelopeOrBuilder getEncryptedRequestOrBuilder();

        RawResourceRequest.MultipartForm getForms(int i14);

        int getFormsCount();

        List<RawResourceRequest.MultipartForm> getFormsList();

        RawResourceRequest.MultipartFormOrBuilder getFormsOrBuilder(int i14);

        List<? extends RawResourceRequest.MultipartFormOrBuilder> getFormsOrBuilderList();

        RawResourceRequest.HTTPHeader getHeaders(int i14);

        int getHeadersCount();

        List<RawResourceRequest.HTTPHeader> getHeadersList();

        RawResourceRequest.HTTPHeaderOrBuilder getHeadersOrBuilder(int i14);

        List<? extends RawResourceRequest.HTTPHeaderOrBuilder> getHeadersOrBuilderList();

        int getMaxSize();

        RawResourceRequest.HTTPMethod getMethod();

        ByteString getRawBody();

        int getReadTimeoutSeconds();

        String getUrl();

        ByteString getUrlBytes();

        boolean getUseDataXfer();

        boolean hasBody();

        boolean hasConnectionTimeoutSeconds();

        boolean hasEncryptedRequest();

        boolean hasMaxSize();

        boolean hasMethod();

        boolean hasRawBody();

        boolean hasReadTimeoutSeconds();

        boolean hasUrl();

        boolean hasUseDataXfer();
    }

    /* JADX INFO: loaded from: classes4.dex */
    public interface RawResourceResponseOrBuilder extends MessageOrBuilder {
        RawResourceResponse.HTTPHeader getHeaders(int i14);

        int getHeadersCount();

        List<RawResourceResponse.HTTPHeader> getHeadersList();

        RawResourceResponse.HTTPHeaderOrBuilder getHeadersOrBuilder(int i14);

        List<? extends RawResourceResponse.HTTPHeaderOrBuilder> getHeadersOrBuilderList();

        int getHttpStatusCode();

        ByteString getResourceData();

        RawResourceResponse.ResponseStatus getStatus();

        GDIDataTypes.DataTransferItem getXferData();

        GDIDataTypes.DataTransferItemOrBuilder getXferDataOrBuilder();

        boolean hasHttpStatusCode();

        boolean hasResourceData();

        boolean hasStatus();

        boolean hasXferData();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQHTTPService_descriptor = descriptor2;
        internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQHTTPService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"ConnectIqHttpRequest", "ConnectIqHttpResponse", "ConnectIqImageRequest", "ConnectIqImageResponse", "RawResourceRequest", "RawResourceResponse", "ConnectIqOauthRequest", "ConnectIqOauthResponse", "ConnectIqOauthCompleteRequest", "ConnectIqOauthCompleteResponse", "OpenWebpageNotification"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQHTTPRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQHTTPRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Url", "HttpMethod", "HttpHeaderFields", "HttpBody", "MaxResponseLength", "IncludeHttpHeaderFieldsInResponse", "CompressResponseBody", "ResponseType", "Version"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQHTTPResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQHTTPResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Status", "HttpStatusCode", "HttpBody", "HttpHeaderFields", "InflatedSize", "ResponseType"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQImageRequest_descriptor = descriptor5;
        internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQImageRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Url", "PartNumber", "MaxWidth", "MaxHeight", "MaxSize", "Palette", "Dithering", "UseDataXfer"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQImageResponse_descriptor = descriptor6;
        internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQImageResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Status", "HttpStatusCode", "ImageData", HttpHeaders.WIDTH, "Height", "InflatedSize", "XferData"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_ConnectIQHTTP_EncryptedEnvelope_descriptor = descriptor7;
        internal_static_GDI_Proto_ConnectIQHTTP_EncryptedEnvelope_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"CipherText", "Iv", "Tag"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_ConnectIQHTTP_RawResourceRequest_descriptor = descriptor8;
        internal_static_GDI_Proto_ConnectIQHTTP_RawResourceRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Url", "MaxSize", "Method", "Body", "Headers", "UseDataXfer", "RawBody", "Forms", "ConnectionTimeoutSeconds", "ReadTimeoutSeconds", "EncryptedRequest"});
        Descriptors.Descriptor descriptor9 = descriptor8.getNestedTypes().get(0);
        internal_static_GDI_Proto_ConnectIQHTTP_RawResourceRequest_HTTPHeader_descriptor = descriptor9;
        internal_static_GDI_Proto_ConnectIQHTTP_RawResourceRequest_HTTPHeader_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor10 = descriptor8.getNestedTypes().get(1);
        internal_static_GDI_Proto_ConnectIQHTTP_RawResourceRequest_MultipartForm_descriptor = descriptor10;
        internal_static_GDI_Proto_ConnectIQHTTP_RawResourceRequest_MultipartForm_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Name", "Filename", "ContentType", "ResourceData", "XferData"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_ConnectIQHTTP_RawResourceResponse_descriptor = descriptor11;
        internal_static_GDI_Proto_ConnectIQHTTP_RawResourceResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"Status", "HttpStatusCode", "ResourceData", "XferData", "Headers"});
        Descriptors.Descriptor descriptor12 = descriptor11.getNestedTypes().get(0);
        internal_static_GDI_Proto_ConnectIQHTTP_RawResourceResponse_HTTPHeader_descriptor = descriptor12;
        internal_static_GDI_Proto_ConnectIQHTTP_RawResourceResponse_HTTPHeader_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(8);
        internal_static_GDI_Proto_ConnectIQHTTP_CapabilitiesRequest_descriptor = descriptor13;
        internal_static_GDI_Proto_ConnectIQHTTP_CapabilitiesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"ServiceVersion", "EncryptionKey"});
        Descriptors.Descriptor descriptor14 = getDescriptor().getMessageTypes().get(9);
        internal_static_GDI_Proto_ConnectIQHTTP_CapabilitiesResponse_descriptor = descriptor14;
        internal_static_GDI_Proto_ConnectIQHTTP_CapabilitiesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[0]);
        Descriptors.Descriptor descriptor15 = getDescriptor().getMessageTypes().get(10);
        internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQOAuthRequest_descriptor = descriptor15;
        internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQOAuthRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"InitialUrl", "InitialUrlParameters", "ParametersEncrypted", "ParametersCompressed", "ResultUrl", "ResultType", "ResultKeys", "AppName", "AppUuid", "StoreUuid"});
        Descriptors.Descriptor descriptor16 = getDescriptor().getMessageTypes().get(11);
        internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQOAuthResponse_descriptor = descriptor16;
        internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQOAuthResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"Status"});
        Descriptors.Descriptor descriptor17 = getDescriptor().getMessageTypes().get(12);
        internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQOAuthCompleteRequest_descriptor = descriptor17;
        internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQOAuthCompleteRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor17, new String[]{"Status", "HttpStatusCode", "AppUuid", "Data", "Encrypted", "Compressed"});
        Descriptors.Descriptor descriptor18 = getDescriptor().getMessageTypes().get(13);
        internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQOAuthCompleteResponse_descriptor = descriptor18;
        internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQOAuthCompleteResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor18, new String[]{"Status"});
        Descriptors.Descriptor descriptor19 = getDescriptor().getMessageTypes().get(14);
        internal_static_GDI_Proto_ConnectIQHTTP_OpenWebpageNotification_descriptor = descriptor19;
        internal_static_GDI_Proto_ConnectIQHTTP_OpenWebpageNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor19, new String[]{"Url", "Params", "AppName"});
        GDICore.getDescriptor();
        GDIDataTypes.getDescriptor();
    }

    private GDIConnectIQHTTPProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(CapabilitiesRequest.connectIqRequest);
        extensionRegistryLite.add(CapabilitiesResponse.connectIqRequest);
    }

    public static final class CapabilitiesResponse extends GeneratedMessageV3 implements CapabilitiesResponseOrBuilder {
        public static final int CONNECT_IQ_REQUEST_FIELD_NUMBER = 13;
        private static final CapabilitiesResponse DEFAULT_INSTANCE = new CapabilitiesResponse();

        @Deprecated
        public static final Parser<CapabilitiesResponse> PARSER = new AbstractParser<CapabilitiesResponse>() { // from class: com.garmin.proto.generated.GDIConnectIQHTTPProto.CapabilitiesResponse.1
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
        public static final GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesResponse, CapabilitiesResponse> connectIqRequest = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, CapabilitiesResponse.class, getDefaultInstance());
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
            return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_CapabilitiesResponse_descriptor;
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
            return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_CapabilitiesResponse_descriptor;
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
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_CapabilitiesResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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

    /* JADX INFO: loaded from: classes4.dex */
    public static final class RawResourceRequest extends GeneratedMessageV3 implements RawResourceRequestOrBuilder {
        public static final int BODY_FIELD_NUMBER = 4;
        public static final int CONNECTION_TIMEOUT_SECONDS_FIELD_NUMBER = 9;
        public static final int ENCRYPTED_REQUEST_FIELD_NUMBER = 11;
        public static final int FORMS_FIELD_NUMBER = 8;
        public static final int HEADERS_FIELD_NUMBER = 5;
        public static final int MAX_SIZE_FIELD_NUMBER = 2;
        public static final int METHOD_FIELD_NUMBER = 3;
        public static final int RAW_BODY_FIELD_NUMBER = 7;
        public static final int READ_TIMEOUT_SECONDS_FIELD_NUMBER = 10;
        public static final int URL_FIELD_NUMBER = 1;
        public static final int USE_DATA_XFER_FIELD_NUMBER = 6;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object body_;
        private int connectionTimeoutSeconds_;
        private EncryptedEnvelope encryptedRequest_;
        private List<MultipartForm> forms_;
        private List<HTTPHeader> headers_;
        private int maxSize_;
        private byte memoizedIsInitialized;
        private int method_;
        private ByteString rawBody_;
        private int readTimeoutSeconds_;
        private volatile Object url_;
        private boolean useDataXfer_;
        private static final RawResourceRequest DEFAULT_INSTANCE = new RawResourceRequest();

        @Deprecated
        public static final Parser<RawResourceRequest> PARSER = new AbstractParser<RawResourceRequest>() { // from class: com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.1
            @Override // com.google.protobuf.Parser
            public RawResourceRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = RawResourceRequest.newBuilder();
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

        public interface HTTPHeaderOrBuilder extends MessageOrBuilder {
            String getKey();

            ByteString getKeyBytes();

            String getValue();

            ByteString getValueBytes();

            boolean hasKey();

            boolean hasValue();
        }

        public interface MultipartFormOrBuilder extends MessageOrBuilder {
            String getContentType();

            ByteString getContentTypeBytes();

            String getFilename();

            ByteString getFilenameBytes();

            String getName();

            ByteString getNameBytes();

            ByteString getResourceData();

            GDIDataTypes.DataTransferItem getXferData();

            GDIDataTypes.DataTransferItemOrBuilder getXferDataOrBuilder();

            boolean hasContentType();

            boolean hasFilename();

            boolean hasName();

            boolean hasResourceData();

            boolean hasXferData();
        }

        private RawResourceRequest() {
            this.url_ = "";
            this.maxSize_ = 0;
            this.method_ = 1;
            this.body_ = "";
            this.useDataXfer_ = false;
            ByteString byteString = ByteString.EMPTY;
            this.rawBody_ = byteString;
            this.connectionTimeoutSeconds_ = 60;
            this.readTimeoutSeconds_ = 60;
            this.memoizedIsInitialized = (byte) -1;
            this.url_ = "";
            this.method_ = 1;
            this.body_ = "";
            List list = Collections.EMPTY_LIST;
            this.headers_ = list;
            this.rawBody_ = byteString;
            this.forms_ = list;
            this.connectionTimeoutSeconds_ = 60;
            this.readTimeoutSeconds_ = 60;
        }

        public static RawResourceRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_RawResourceRequest_descriptor;
        }

        public static Builder newBuilder(RawResourceRequest rawResourceRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(rawResourceRequest);
        }

        public static RawResourceRequest parseDelimitedFrom(InputStream inputStream) {
            return (RawResourceRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static RawResourceRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<RawResourceRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RawResourceRequest)) {
                return super.equals(obj);
            }
            RawResourceRequest rawResourceRequest = (RawResourceRequest) obj;
            if (hasUrl() != rawResourceRequest.hasUrl()) {
                return false;
            }
            if ((hasUrl() && !getUrl().equals(rawResourceRequest.getUrl())) || hasMaxSize() != rawResourceRequest.hasMaxSize()) {
                return false;
            }
            if ((hasMaxSize() && getMaxSize() != rawResourceRequest.getMaxSize()) || hasMethod() != rawResourceRequest.hasMethod()) {
                return false;
            }
            if ((hasMethod() && this.method_ != rawResourceRequest.method_) || hasBody() != rawResourceRequest.hasBody()) {
                return false;
            }
            if ((hasBody() && !getBody().equals(rawResourceRequest.getBody())) || !getHeadersList().equals(rawResourceRequest.getHeadersList()) || hasUseDataXfer() != rawResourceRequest.hasUseDataXfer()) {
                return false;
            }
            if ((hasUseDataXfer() && getUseDataXfer() != rawResourceRequest.getUseDataXfer()) || hasRawBody() != rawResourceRequest.hasRawBody()) {
                return false;
            }
            if ((hasRawBody() && !getRawBody().equals(rawResourceRequest.getRawBody())) || !getFormsList().equals(rawResourceRequest.getFormsList()) || hasConnectionTimeoutSeconds() != rawResourceRequest.hasConnectionTimeoutSeconds()) {
                return false;
            }
            if ((hasConnectionTimeoutSeconds() && getConnectionTimeoutSeconds() != rawResourceRequest.getConnectionTimeoutSeconds()) || hasReadTimeoutSeconds() != rawResourceRequest.hasReadTimeoutSeconds()) {
                return false;
            }
            if ((!hasReadTimeoutSeconds() || getReadTimeoutSeconds() == rawResourceRequest.getReadTimeoutSeconds()) && hasEncryptedRequest() == rawResourceRequest.hasEncryptedRequest()) {
                return (!hasEncryptedRequest() || getEncryptedRequest().equals(rawResourceRequest.getEncryptedRequest())) && getUnknownFields().equals(rawResourceRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
        public String getBody() {
            Object obj = this.body_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.body_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
        public ByteString getBodyBytes() {
            Object obj = this.body_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.body_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
        public int getConnectionTimeoutSeconds() {
            return this.connectionTimeoutSeconds_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
        public EncryptedEnvelope getEncryptedRequest() {
            EncryptedEnvelope encryptedEnvelope = this.encryptedRequest_;
            return encryptedEnvelope == null ? EncryptedEnvelope.getDefaultInstance() : encryptedEnvelope;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
        public EncryptedEnvelopeOrBuilder getEncryptedRequestOrBuilder() {
            EncryptedEnvelope encryptedEnvelope = this.encryptedRequest_;
            return encryptedEnvelope == null ? EncryptedEnvelope.getDefaultInstance() : encryptedEnvelope;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
        public MultipartForm getForms(int i14) {
            return this.forms_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
        public int getFormsCount() {
            return this.forms_.size();
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
        public List<MultipartForm> getFormsList() {
            return this.forms_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
        public MultipartFormOrBuilder getFormsOrBuilder(int i14) {
            return this.forms_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
        public List<? extends MultipartFormOrBuilder> getFormsOrBuilderList() {
            return this.forms_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
        public HTTPHeader getHeaders(int i14) {
            return this.headers_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
        public int getHeadersCount() {
            return this.headers_.size();
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
        public List<HTTPHeader> getHeadersList() {
            return this.headers_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
        public HTTPHeaderOrBuilder getHeadersOrBuilder(int i14) {
            return this.headers_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
        public List<? extends HTTPHeaderOrBuilder> getHeadersOrBuilderList() {
            return this.headers_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
        public int getMaxSize() {
            return this.maxSize_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
        public HTTPMethod getMethod() {
            HTTPMethod hTTPMethodForNumber = HTTPMethod.forNumber(this.method_);
            return hTTPMethodForNumber == null ? HTTPMethod.GET : hTTPMethodForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<RawResourceRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
        public ByteString getRawBody() {
            return this.rawBody_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
        public int getReadTimeoutSeconds() {
            return this.readTimeoutSeconds_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.url_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(2, this.maxSize_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(3, this.method_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.body_);
            }
            for (int i15 = 0; i15 < this.headers_.size(); i15++) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(5, this.headers_.get(i15));
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(6, this.useDataXfer_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeStringSize += CodedOutputStream.computeBytesSize(7, this.rawBody_);
            }
            for (int i16 = 0; i16 < this.forms_.size(); i16++) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(8, this.forms_.get(i16));
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(9, this.connectionTimeoutSeconds_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeStringSize += CodedOutputStream.computeInt32Size(10, this.readTimeoutSeconds_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(11, getEncryptedRequest());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
        public String getUrl() {
            Object obj = this.url_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.url_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
        public ByteString getUrlBytes() {
            Object obj = this.url_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.url_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
        public boolean getUseDataXfer() {
            return this.useDataXfer_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
        public boolean hasBody() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
        public boolean hasConnectionTimeoutSeconds() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
        public boolean hasEncryptedRequest() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
        public boolean hasMaxSize() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
        public boolean hasMethod() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
        public boolean hasRawBody() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
        public boolean hasReadTimeoutSeconds() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
        public boolean hasUrl() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
        public boolean hasUseDataXfer() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasUrl()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getUrl().hashCode();
            }
            if (hasMaxSize()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getMaxSize();
            }
            if (hasMethod()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + this.method_;
            }
            if (hasBody()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getBody().hashCode();
            }
            if (getHeadersCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getHeadersList().hashCode();
            }
            if (hasUseDataXfer()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + Internal.hashBoolean(getUseDataXfer());
            }
            if (hasRawBody()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getRawBody().hashCode();
            }
            if (getFormsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getFormsList().hashCode();
            }
            if (hasConnectionTimeoutSeconds()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getConnectionTimeoutSeconds();
            }
            if (hasReadTimeoutSeconds()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getReadTimeoutSeconds();
            }
            if (hasEncryptedRequest()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getEncryptedRequest().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_RawResourceRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(RawResourceRequest.class, Builder.class);
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
            if (!hasUrl()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i14 = 0; i14 < getHeadersCount(); i14++) {
                if (!getHeaders(i14).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i15 = 0; i15 < getFormsCount(); i15++) {
                if (!getForms(i15).isInitialized()) {
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
            return new RawResourceRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.url_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.maxSize_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(3, this.method_);
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.body_);
            }
            for (int i14 = 0; i14 < this.headers_.size(); i14++) {
                codedOutputStream.writeMessage(5, this.headers_.get(i14));
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeBool(6, this.useDataXfer_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeBytes(7, this.rawBody_);
            }
            for (int i15 = 0; i15 < this.forms_.size(); i15++) {
                codedOutputStream.writeMessage(8, this.forms_.get(i15));
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeInt32(9, this.connectionTimeoutSeconds_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeInt32(10, this.readTimeoutSeconds_);
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(11, getEncryptedRequest());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class HTTPHeader extends GeneratedMessageV3 implements HTTPHeaderOrBuilder {
            public static final int KEY_FIELD_NUMBER = 1;
            public static final int VALUE_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private volatile Object key_;
            private byte memoizedIsInitialized;
            private volatile Object value_;
            private static final HTTPHeader DEFAULT_INSTANCE = new HTTPHeader();

            @Deprecated
            public static final Parser<HTTPHeader> PARSER = new AbstractParser<HTTPHeader>() { // from class: com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.HTTPHeader.1
                @Override // com.google.protobuf.Parser
                public HTTPHeader parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = HTTPHeader.newBuilder();
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

            private HTTPHeader() {
                this.key_ = "";
                this.value_ = "";
                this.memoizedIsInitialized = (byte) -1;
                this.key_ = "";
                this.value_ = "";
            }

            public static HTTPHeader getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_RawResourceRequest_HTTPHeader_descriptor;
            }

            public static Builder newBuilder(HTTPHeader hTTPHeader) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(hTTPHeader);
            }

            public static HTTPHeader parseDelimitedFrom(InputStream inputStream) {
                return (HTTPHeader) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static HTTPHeader parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<HTTPHeader> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof HTTPHeader)) {
                    return super.equals(obj);
                }
                HTTPHeader hTTPHeader = (HTTPHeader) obj;
                if (hasKey() != hTTPHeader.hasKey()) {
                    return false;
                }
                if ((!hasKey() || getKey().equals(hTTPHeader.getKey())) && hasValue() == hTTPHeader.hasValue()) {
                    return (!hasValue() || getValue().equals(hTTPHeader.getValue())) && getUnknownFields().equals(hTTPHeader.getUnknownFields());
                }
                return false;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.HTTPHeaderOrBuilder
            public String getKey() {
                Object obj = this.key_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.key_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.HTTPHeaderOrBuilder
            public ByteString getKeyBytes() {
                Object obj = this.key_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.key_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<HTTPHeader> getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i14 = this.memoizedSize;
                if (i14 != -1) {
                    return i14;
                }
                int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.key_) : 0;
                if ((this.bitField0_ & 2) != 0) {
                    iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.value_);
                }
                int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.HTTPHeaderOrBuilder
            public String getValue() {
                Object obj = this.value_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.value_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.HTTPHeaderOrBuilder
            public ByteString getValueBytes() {
                Object obj = this.value_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.value_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.HTTPHeaderOrBuilder
            public boolean hasKey() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.HTTPHeaderOrBuilder
            public boolean hasValue() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i14 = this.memoizedHashCode;
                if (i14 != 0) {
                    return i14;
                }
                int iHashCode = getDescriptor().hashCode() + 779;
                if (hasKey()) {
                    iHashCode = e5.c(iHashCode, 37, 1, 53) + getKey().hashCode();
                }
                if (hasValue()) {
                    iHashCode = e5.c(iHashCode, 37, 2, 53) + getValue().hashCode();
                }
                int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_RawResourceRequest_HTTPHeader_fieldAccessorTable.ensureFieldAccessorsInitialized(HTTPHeader.class, Builder.class);
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
                if (!hasKey()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (hasValue()) {
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
                return new HTTPHeader();
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                int i14 = 0;
                return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                if ((this.bitField0_ & 1) != 0) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.key_);
                }
                if ((this.bitField0_ & 2) != 0) {
                    GeneratedMessageV3.writeString(codedOutputStream, 2, this.value_);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HTTPHeaderOrBuilder {
                private int bitField0_;
                private Object key_;
                private Object value_;

                private Builder() {
                    this.key_ = "";
                    this.value_ = "";
                }

                private void buildPartial0(HTTPHeader hTTPHeader) {
                    int i14;
                    int i15 = this.bitField0_;
                    if ((i15 & 1) != 0) {
                        hTTPHeader.key_ = this.key_;
                        i14 = 1;
                    } else {
                        i14 = 0;
                    }
                    if ((i15 & 2) != 0) {
                        hTTPHeader.value_ = this.value_;
                        i14 |= 2;
                    }
                    hTTPHeader.bitField0_ |= i14;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_RawResourceRequest_HTTPHeader_descriptor;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public HTTPHeader build() {
                    HTTPHeader hTTPHeaderBuildPartial = buildPartial();
                    if (hTTPHeaderBuildPartial.isInitialized()) {
                        return hTTPHeaderBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) hTTPHeaderBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public HTTPHeader buildPartial() {
                    HTTPHeader hTTPHeader = new HTTPHeader(this);
                    if (this.bitField0_ != 0) {
                        buildPartial0(hTTPHeader);
                    }
                    onBuilt();
                    return hTTPHeader;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.key_ = "";
                    this.value_ = "";
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                public Builder clearKey() {
                    this.key_ = HTTPHeader.getDefaultInstance().getKey();
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (Builder) super.clearOneof(oneofDescriptor);
                }

                public Builder clearValue() {
                    this.value_ = HTTPHeader.getDefaultInstance().getValue();
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
                    return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_RawResourceRequest_HTTPHeader_descriptor;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.HTTPHeaderOrBuilder
                public String getKey() {
                    Object obj = this.key_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String stringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.key_ = stringUtf8;
                    }
                    return stringUtf8;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.HTTPHeaderOrBuilder
                public ByteString getKeyBytes() {
                    Object obj = this.key_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.key_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.HTTPHeaderOrBuilder
                public String getValue() {
                    Object obj = this.value_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String stringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.value_ = stringUtf8;
                    }
                    return stringUtf8;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.HTTPHeaderOrBuilder
                public ByteString getValueBytes() {
                    Object obj = this.value_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.value_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.HTTPHeaderOrBuilder
                public boolean hasKey() {
                    return (this.bitField0_ & 1) != 0;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.HTTPHeaderOrBuilder
                public boolean hasValue() {
                    return (this.bitField0_ & 2) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_RawResourceRequest_HTTPHeader_fieldAccessorTable.ensureFieldAccessorsInitialized(HTTPHeader.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return hasKey() && hasValue();
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
                                        this.key_ = codedInputStream.readBytes();
                                        this.bitField0_ |= 1;
                                    } else if (tag == 18) {
                                        this.value_ = codedInputStream.readBytes();
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

                public Builder setKey(String str) {
                    str.getClass();
                    this.key_ = str;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setKeyBytes(ByteString byteString) {
                    byteString.getClass();
                    this.key_ = byteString;
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

                public Builder setValue(String str) {
                    str.getClass();
                    this.value_ = str;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                public Builder setValueBytes(ByteString byteString) {
                    byteString.getClass();
                    this.value_ = byteString;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public HTTPHeader getDefaultInstanceForType() {
                    return HTTPHeader.getDefaultInstance();
                }

                public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                    this(builderParent);
                }

                public /* synthetic */ Builder(int i14) {
                    this();
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.key_ = "";
                    this.value_ = "";
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof HTTPHeader) {
                        return mergeFrom((HTTPHeader) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(HTTPHeader hTTPHeader) {
                    if (hTTPHeader == HTTPHeader.getDefaultInstance()) {
                        return this;
                    }
                    if (hTTPHeader.hasKey()) {
                        this.key_ = hTTPHeader.key_;
                        this.bitField0_ |= 1;
                        onChanged();
                    }
                    if (hTTPHeader.hasValue()) {
                        this.value_ = hTTPHeader.value_;
                        this.bitField0_ |= 2;
                        onChanged();
                    }
                    mergeUnknownFields(hTTPHeader.getUnknownFields());
                    onChanged();
                    return this;
                }
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public HTTPHeader getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public static HTTPHeader parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (HTTPHeader) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static HTTPHeader parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static HTTPHeader parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static HTTPHeader parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static HTTPHeader parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            public static HTTPHeader parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static HTTPHeader parseFrom(InputStream inputStream) {
                return (HTTPHeader) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static HTTPHeader parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (HTTPHeader) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            private HTTPHeader(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.key_ = "";
                this.value_ = "";
                this.memoizedIsInitialized = (byte) -1;
            }

            public static HTTPHeader parseFrom(CodedInputStream codedInputStream) {
                return (HTTPHeader) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static HTTPHeader parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (HTTPHeader) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            public /* synthetic */ HTTPHeader(Builder builder) {
                this((GeneratedMessageV3.Builder<?>) builder);
            }
        }

        public static final class MultipartForm extends GeneratedMessageV3 implements MultipartFormOrBuilder {
            public static final int CONTENT_TYPE_FIELD_NUMBER = 3;
            public static final int FILENAME_FIELD_NUMBER = 2;
            public static final int NAME_FIELD_NUMBER = 1;
            public static final int RESOURCE_DATA_FIELD_NUMBER = 4;
            public static final int XFER_DATA_FIELD_NUMBER = 5;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private volatile Object contentType_;
            private volatile Object filename_;
            private byte memoizedIsInitialized;
            private volatile Object name_;
            private ByteString resourceData_;
            private GDIDataTypes.DataTransferItem xferData_;
            private static final MultipartForm DEFAULT_INSTANCE = new MultipartForm();

            @Deprecated
            public static final Parser<MultipartForm> PARSER = new AbstractParser<MultipartForm>() { // from class: com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.MultipartForm.1
                @Override // com.google.protobuf.Parser
                public MultipartForm parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = MultipartForm.newBuilder();
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

            private MultipartForm() {
                this.name_ = "";
                this.filename_ = "";
                this.contentType_ = "";
                ByteString byteString = ByteString.EMPTY;
                this.resourceData_ = byteString;
                this.memoizedIsInitialized = (byte) -1;
                this.name_ = "";
                this.filename_ = "";
                this.contentType_ = "";
                this.resourceData_ = byteString;
            }

            public static MultipartForm getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_RawResourceRequest_MultipartForm_descriptor;
            }

            public static Builder newBuilder(MultipartForm multipartForm) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(multipartForm);
            }

            public static MultipartForm parseDelimitedFrom(InputStream inputStream) {
                return (MultipartForm) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static MultipartForm parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<MultipartForm> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof MultipartForm)) {
                    return super.equals(obj);
                }
                MultipartForm multipartForm = (MultipartForm) obj;
                if (hasName() != multipartForm.hasName()) {
                    return false;
                }
                if ((hasName() && !getName().equals(multipartForm.getName())) || hasFilename() != multipartForm.hasFilename()) {
                    return false;
                }
                if ((hasFilename() && !getFilename().equals(multipartForm.getFilename())) || hasContentType() != multipartForm.hasContentType()) {
                    return false;
                }
                if ((hasContentType() && !getContentType().equals(multipartForm.getContentType())) || hasResourceData() != multipartForm.hasResourceData()) {
                    return false;
                }
                if ((!hasResourceData() || getResourceData().equals(multipartForm.getResourceData())) && hasXferData() == multipartForm.hasXferData()) {
                    return (!hasXferData() || getXferData().equals(multipartForm.getXferData())) && getUnknownFields().equals(multipartForm.getUnknownFields());
                }
                return false;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.MultipartFormOrBuilder
            public String getContentType() {
                Object obj = this.contentType_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.contentType_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.MultipartFormOrBuilder
            public ByteString getContentTypeBytes() {
                Object obj = this.contentType_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.contentType_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.MultipartFormOrBuilder
            public String getFilename() {
                Object obj = this.filename_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.filename_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.MultipartFormOrBuilder
            public ByteString getFilenameBytes() {
                Object obj = this.filename_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.filename_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.MultipartFormOrBuilder
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

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.MultipartFormOrBuilder
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
            public Parser<MultipartForm> getParserForType() {
                return PARSER;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.MultipartFormOrBuilder
            public ByteString getResourceData() {
                return this.resourceData_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i14 = this.memoizedSize;
                if (i14 != -1) {
                    return i14;
                }
                int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.name_) : 0;
                if ((this.bitField0_ & 2) != 0) {
                    iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.filename_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.contentType_);
                }
                if ((this.bitField0_ & 8) != 0) {
                    iComputeStringSize += CodedOutputStream.computeBytesSize(4, this.resourceData_);
                }
                if ((this.bitField0_ & 16) != 0) {
                    iComputeStringSize += CodedOutputStream.computeMessageSize(5, getXferData());
                }
                int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.MultipartFormOrBuilder
            public GDIDataTypes.DataTransferItem getXferData() {
                GDIDataTypes.DataTransferItem dataTransferItem = this.xferData_;
                return dataTransferItem == null ? GDIDataTypes.DataTransferItem.getDefaultInstance() : dataTransferItem;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.MultipartFormOrBuilder
            public GDIDataTypes.DataTransferItemOrBuilder getXferDataOrBuilder() {
                GDIDataTypes.DataTransferItem dataTransferItem = this.xferData_;
                return dataTransferItem == null ? GDIDataTypes.DataTransferItem.getDefaultInstance() : dataTransferItem;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.MultipartFormOrBuilder
            public boolean hasContentType() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.MultipartFormOrBuilder
            public boolean hasFilename() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.MultipartFormOrBuilder
            public boolean hasName() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.MultipartFormOrBuilder
            public boolean hasResourceData() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.MultipartFormOrBuilder
            public boolean hasXferData() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i14 = this.memoizedHashCode;
                if (i14 != 0) {
                    return i14;
                }
                int iHashCode = getDescriptor().hashCode() + 779;
                if (hasName()) {
                    iHashCode = e5.c(iHashCode, 37, 1, 53) + getName().hashCode();
                }
                if (hasFilename()) {
                    iHashCode = e5.c(iHashCode, 37, 2, 53) + getFilename().hashCode();
                }
                if (hasContentType()) {
                    iHashCode = e5.c(iHashCode, 37, 3, 53) + getContentType().hashCode();
                }
                if (hasResourceData()) {
                    iHashCode = e5.c(iHashCode, 37, 4, 53) + getResourceData().hashCode();
                }
                if (hasXferData()) {
                    iHashCode = e5.c(iHashCode, 37, 5, 53) + getXferData().hashCode();
                }
                int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_RawResourceRequest_MultipartForm_fieldAccessorTable.ensureFieldAccessorsInitialized(MultipartForm.class, Builder.class);
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
                if (!hasXferData() || getXferData().isInitialized()) {
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
                return new MultipartForm();
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                int i14 = 0;
                return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                if ((this.bitField0_ & 1) != 0) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.name_);
                }
                if ((this.bitField0_ & 2) != 0) {
                    GeneratedMessageV3.writeString(codedOutputStream, 2, this.filename_);
                }
                if ((this.bitField0_ & 4) != 0) {
                    GeneratedMessageV3.writeString(codedOutputStream, 3, this.contentType_);
                }
                if ((this.bitField0_ & 8) != 0) {
                    codedOutputStream.writeBytes(4, this.resourceData_);
                }
                if ((this.bitField0_ & 16) != 0) {
                    codedOutputStream.writeMessage(5, getXferData());
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MultipartFormOrBuilder {
                private int bitField0_;
                private Object contentType_;
                private Object filename_;
                private Object name_;
                private ByteString resourceData_;
                private SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> xferDataBuilder_;
                private GDIDataTypes.DataTransferItem xferData_;

                private Builder() {
                    this.name_ = "";
                    this.filename_ = "";
                    this.contentType_ = "";
                    this.resourceData_ = ByteString.EMPTY;
                    maybeForceBuilderInitialization();
                }

                private void buildPartial0(MultipartForm multipartForm) {
                    int i14;
                    int i15 = this.bitField0_;
                    if ((i15 & 1) != 0) {
                        multipartForm.name_ = this.name_;
                        i14 = 1;
                    } else {
                        i14 = 0;
                    }
                    if ((i15 & 2) != 0) {
                        multipartForm.filename_ = this.filename_;
                        i14 |= 2;
                    }
                    if ((i15 & 4) != 0) {
                        multipartForm.contentType_ = this.contentType_;
                        i14 |= 4;
                    }
                    if ((i15 & 8) != 0) {
                        multipartForm.resourceData_ = this.resourceData_;
                        i14 |= 8;
                    }
                    if ((i15 & 16) != 0) {
                        SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                        multipartForm.xferData_ = singleFieldBuilderV3 == null ? this.xferData_ : (GDIDataTypes.DataTransferItem) singleFieldBuilderV3.build();
                        i14 |= 16;
                    }
                    multipartForm.bitField0_ |= i14;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_RawResourceRequest_MultipartForm_descriptor;
                }

                private SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> getXferDataFieldBuilder() {
                    if (this.xferDataBuilder_ == null) {
                        this.xferDataBuilder_ = new SingleFieldBuilderV3<>(getXferData(), getParentForChildren(), isClean());
                        this.xferData_ = null;
                    }
                    return this.xferDataBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                        getXferDataFieldBuilder();
                    }
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public MultipartForm build() {
                    MultipartForm multipartFormBuildPartial = buildPartial();
                    if (multipartFormBuildPartial.isInitialized()) {
                        return multipartFormBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) multipartFormBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public MultipartForm buildPartial() {
                    MultipartForm multipartForm = new MultipartForm(this);
                    if (this.bitField0_ != 0) {
                        buildPartial0(multipartForm);
                    }
                    onBuilt();
                    return multipartForm;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.name_ = "";
                    this.filename_ = "";
                    this.contentType_ = "";
                    this.resourceData_ = ByteString.EMPTY;
                    this.xferData_ = null;
                    SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.dispose();
                        this.xferDataBuilder_ = null;
                    }
                    return this;
                }

                public Builder clearContentType() {
                    this.contentType_ = MultipartForm.getDefaultInstance().getContentType();
                    this.bitField0_ &= -5;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                public Builder clearFilename() {
                    this.filename_ = MultipartForm.getDefaultInstance().getFilename();
                    this.bitField0_ &= -3;
                    onChanged();
                    return this;
                }

                public Builder clearName() {
                    this.name_ = MultipartForm.getDefaultInstance().getName();
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (Builder) super.clearOneof(oneofDescriptor);
                }

                public Builder clearResourceData() {
                    this.bitField0_ &= -9;
                    this.resourceData_ = MultipartForm.getDefaultInstance().getResourceData();
                    onChanged();
                    return this;
                }

                public Builder clearXferData() {
                    this.bitField0_ &= -17;
                    this.xferData_ = null;
                    SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.dispose();
                        this.xferDataBuilder_ = null;
                    }
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
                /* JADX INFO: renamed from: clone */
                public Builder mo57clone() {
                    return (Builder) super.mo57clone();
                }

                @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.MultipartFormOrBuilder
                public String getContentType() {
                    Object obj = this.contentType_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String stringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.contentType_ = stringUtf8;
                    }
                    return stringUtf8;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.MultipartFormOrBuilder
                public ByteString getContentTypeBytes() {
                    Object obj = this.contentType_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.contentType_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_RawResourceRequest_MultipartForm_descriptor;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.MultipartFormOrBuilder
                public String getFilename() {
                    Object obj = this.filename_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String stringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.filename_ = stringUtf8;
                    }
                    return stringUtf8;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.MultipartFormOrBuilder
                public ByteString getFilenameBytes() {
                    Object obj = this.filename_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.filename_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.MultipartFormOrBuilder
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

                @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.MultipartFormOrBuilder
                public ByteString getNameBytes() {
                    Object obj = this.name_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.name_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.MultipartFormOrBuilder
                public ByteString getResourceData() {
                    return this.resourceData_;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.MultipartFormOrBuilder
                public GDIDataTypes.DataTransferItem getXferData() {
                    SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return (GDIDataTypes.DataTransferItem) singleFieldBuilderV3.getMessage();
                    }
                    GDIDataTypes.DataTransferItem dataTransferItem = this.xferData_;
                    return dataTransferItem == null ? GDIDataTypes.DataTransferItem.getDefaultInstance() : dataTransferItem;
                }

                public GDIDataTypes.DataTransferItem.Builder getXferDataBuilder() {
                    this.bitField0_ |= 16;
                    onChanged();
                    return (GDIDataTypes.DataTransferItem.Builder) getXferDataFieldBuilder().getBuilder();
                }

                @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.MultipartFormOrBuilder
                public GDIDataTypes.DataTransferItemOrBuilder getXferDataOrBuilder() {
                    SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return (GDIDataTypes.DataTransferItemOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    GDIDataTypes.DataTransferItem dataTransferItem = this.xferData_;
                    return dataTransferItem == null ? GDIDataTypes.DataTransferItem.getDefaultInstance() : dataTransferItem;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.MultipartFormOrBuilder
                public boolean hasContentType() {
                    return (this.bitField0_ & 4) != 0;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.MultipartFormOrBuilder
                public boolean hasFilename() {
                    return (this.bitField0_ & 2) != 0;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.MultipartFormOrBuilder
                public boolean hasName() {
                    return (this.bitField0_ & 1) != 0;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.MultipartFormOrBuilder
                public boolean hasResourceData() {
                    return (this.bitField0_ & 8) != 0;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.MultipartFormOrBuilder
                public boolean hasXferData() {
                    return (this.bitField0_ & 16) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_RawResourceRequest_MultipartForm_fieldAccessorTable.ensureFieldAccessorsInitialized(MultipartForm.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return !hasXferData() || getXferData().isInitialized();
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
                                        this.name_ = codedInputStream.readBytes();
                                        this.bitField0_ |= 1;
                                    } else if (tag == 18) {
                                        this.filename_ = codedInputStream.readBytes();
                                        this.bitField0_ |= 2;
                                    } else if (tag == 26) {
                                        this.contentType_ = codedInputStream.readBytes();
                                        this.bitField0_ |= 4;
                                    } else if (tag == 34) {
                                        this.resourceData_ = codedInputStream.readBytes();
                                        this.bitField0_ |= 8;
                                    } else if (tag == 42) {
                                        codedInputStream.readMessage(getXferDataFieldBuilder().getBuilder(), extensionRegistryLite);
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

                public Builder mergeXferData(GDIDataTypes.DataTransferItem dataTransferItem) {
                    GDIDataTypes.DataTransferItem dataTransferItem2;
                    SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.mergeFrom(dataTransferItem);
                    } else if ((this.bitField0_ & 16) == 0 || (dataTransferItem2 = this.xferData_) == null || dataTransferItem2 == GDIDataTypes.DataTransferItem.getDefaultInstance()) {
                        this.xferData_ = dataTransferItem;
                    } else {
                        getXferDataBuilder().mergeFrom(dataTransferItem);
                    }
                    if (this.xferData_ != null) {
                        this.bitField0_ |= 16;
                        onChanged();
                    }
                    return this;
                }

                public Builder setContentType(String str) {
                    str.getClass();
                    this.contentType_ = str;
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                public Builder setContentTypeBytes(ByteString byteString) {
                    byteString.getClass();
                    this.contentType_ = byteString;
                    this.bitField0_ |= 4;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.setField(fieldDescriptor, obj);
                }

                public Builder setFilename(String str) {
                    str.getClass();
                    this.filename_ = str;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                public Builder setFilenameBytes(ByteString byteString) {
                    byteString.getClass();
                    this.filename_ = byteString;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                public Builder setName(String str) {
                    str.getClass();
                    this.name_ = str;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setNameBytes(ByteString byteString) {
                    byteString.getClass();
                    this.name_ = byteString;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                    return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
                }

                public Builder setResourceData(ByteString byteString) {
                    byteString.getClass();
                    this.resourceData_ = byteString;
                    this.bitField0_ |= 8;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.setUnknownFields(unknownFieldSet);
                }

                public Builder setXferData(GDIDataTypes.DataTransferItem.Builder builder) {
                    SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.xferData_ = builder.build();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    this.bitField0_ |= 16;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public MultipartForm getDefaultInstanceForType() {
                    return MultipartForm.getDefaultInstance();
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
                    this.filename_ = "";
                    this.contentType_ = "";
                    this.resourceData_ = ByteString.EMPTY;
                    maybeForceBuilderInitialization();
                }

                public Builder setXferData(GDIDataTypes.DataTransferItem dataTransferItem) {
                    SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        dataTransferItem.getClass();
                        this.xferData_ = dataTransferItem;
                    } else {
                        singleFieldBuilderV3.setMessage(dataTransferItem);
                    }
                    this.bitField0_ |= 16;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof MultipartForm) {
                        return mergeFrom((MultipartForm) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(MultipartForm multipartForm) {
                    if (multipartForm == MultipartForm.getDefaultInstance()) {
                        return this;
                    }
                    if (multipartForm.hasName()) {
                        this.name_ = multipartForm.name_;
                        this.bitField0_ |= 1;
                        onChanged();
                    }
                    if (multipartForm.hasFilename()) {
                        this.filename_ = multipartForm.filename_;
                        this.bitField0_ |= 2;
                        onChanged();
                    }
                    if (multipartForm.hasContentType()) {
                        this.contentType_ = multipartForm.contentType_;
                        this.bitField0_ |= 4;
                        onChanged();
                    }
                    if (multipartForm.hasResourceData()) {
                        setResourceData(multipartForm.getResourceData());
                    }
                    if (multipartForm.hasXferData()) {
                        mergeXferData(multipartForm.getXferData());
                    }
                    mergeUnknownFields(multipartForm.getUnknownFields());
                    onChanged();
                    return this;
                }
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public MultipartForm getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public static MultipartForm parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (MultipartForm) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static MultipartForm parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static MultipartForm parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static MultipartForm parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static MultipartForm parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            public static MultipartForm parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static MultipartForm parseFrom(InputStream inputStream) {
                return (MultipartForm) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static MultipartForm parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (MultipartForm) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static MultipartForm parseFrom(CodedInputStream codedInputStream) {
                return (MultipartForm) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static MultipartForm parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (MultipartForm) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            private MultipartForm(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.name_ = "";
                this.filename_ = "";
                this.contentType_ = "";
                this.resourceData_ = ByteString.EMPTY;
                this.memoizedIsInitialized = (byte) -1;
            }

            public /* synthetic */ MultipartForm(Builder builder) {
                this((GeneratedMessageV3.Builder<?>) builder);
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RawResourceRequestOrBuilder {
            private int bitField0_;
            private Object body_;
            private int connectionTimeoutSeconds_;
            private SingleFieldBuilderV3<EncryptedEnvelope, EncryptedEnvelope.Builder, EncryptedEnvelopeOrBuilder> encryptedRequestBuilder_;
            private EncryptedEnvelope encryptedRequest_;
            private RepeatedFieldBuilderV3<MultipartForm, MultipartForm.Builder, MultipartFormOrBuilder> formsBuilder_;
            private List<MultipartForm> forms_;
            private RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> headersBuilder_;
            private List<HTTPHeader> headers_;
            private int maxSize_;
            private int method_;
            private ByteString rawBody_;
            private int readTimeoutSeconds_;
            private Object url_;
            private boolean useDataXfer_;

            private Builder() {
                this.url_ = "";
                this.method_ = 1;
                this.body_ = "";
                List list = Collections.EMPTY_LIST;
                this.headers_ = list;
                this.rawBody_ = ByteString.EMPTY;
                this.forms_ = list;
                this.connectionTimeoutSeconds_ = 60;
                this.readTimeoutSeconds_ = 60;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(RawResourceRequest rawResourceRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    rawResourceRequest.url_ = this.url_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    rawResourceRequest.maxSize_ = this.maxSize_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    rawResourceRequest.method_ = this.method_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    rawResourceRequest.body_ = this.body_;
                    i14 |= 8;
                }
                if ((i15 & 32) != 0) {
                    rawResourceRequest.useDataXfer_ = this.useDataXfer_;
                    i14 |= 16;
                }
                if ((i15 & 64) != 0) {
                    rawResourceRequest.rawBody_ = this.rawBody_;
                    i14 |= 32;
                }
                if ((i15 & 256) != 0) {
                    rawResourceRequest.connectionTimeoutSeconds_ = this.connectionTimeoutSeconds_;
                    i14 |= 64;
                }
                if ((i15 & 512) != 0) {
                    rawResourceRequest.readTimeoutSeconds_ = this.readTimeoutSeconds_;
                    i14 |= 128;
                }
                if ((i15 & 1024) != 0) {
                    SingleFieldBuilderV3<EncryptedEnvelope, EncryptedEnvelope.Builder, EncryptedEnvelopeOrBuilder> singleFieldBuilderV3 = this.encryptedRequestBuilder_;
                    rawResourceRequest.encryptedRequest_ = singleFieldBuilderV3 == null ? this.encryptedRequest_ : (EncryptedEnvelope) singleFieldBuilderV3.build();
                    i14 |= 256;
                }
                rawResourceRequest.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(RawResourceRequest rawResourceRequest) {
                RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> repeatedFieldBuilderV3 = this.headersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 16) != 0) {
                        this.headers_ = Collections.unmodifiableList(this.headers_);
                        this.bitField0_ &= -17;
                    }
                    rawResourceRequest.headers_ = this.headers_;
                } else {
                    rawResourceRequest.headers_ = repeatedFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3<MultipartForm, MultipartForm.Builder, MultipartFormOrBuilder> repeatedFieldBuilderV4 = this.formsBuilder_;
                if (repeatedFieldBuilderV4 != null) {
                    rawResourceRequest.forms_ = repeatedFieldBuilderV4.build();
                    return;
                }
                if ((this.bitField0_ & 128) != 0) {
                    this.forms_ = Collections.unmodifiableList(this.forms_);
                    this.bitField0_ &= -129;
                }
                rawResourceRequest.forms_ = this.forms_;
            }

            private void ensureFormsIsMutable() {
                if ((this.bitField0_ & 128) == 0) {
                    this.forms_ = new ArrayList(this.forms_);
                    this.bitField0_ |= 128;
                }
            }

            private void ensureHeadersIsMutable() {
                if ((this.bitField0_ & 16) == 0) {
                    this.headers_ = new ArrayList(this.headers_);
                    this.bitField0_ |= 16;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_RawResourceRequest_descriptor;
            }

            private SingleFieldBuilderV3<EncryptedEnvelope, EncryptedEnvelope.Builder, EncryptedEnvelopeOrBuilder> getEncryptedRequestFieldBuilder() {
                if (this.encryptedRequestBuilder_ == null) {
                    this.encryptedRequestBuilder_ = new SingleFieldBuilderV3<>(getEncryptedRequest(), getParentForChildren(), isClean());
                    this.encryptedRequest_ = null;
                }
                return this.encryptedRequestBuilder_;
            }

            private RepeatedFieldBuilderV3<MultipartForm, MultipartForm.Builder, MultipartFormOrBuilder> getFormsFieldBuilder() {
                if (this.formsBuilder_ == null) {
                    this.formsBuilder_ = new RepeatedFieldBuilderV3<>(this.forms_, (this.bitField0_ & 128) != 0, getParentForChildren(), isClean());
                    this.forms_ = null;
                }
                return this.formsBuilder_;
            }

            private RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> getHeadersFieldBuilder() {
                if (this.headersBuilder_ == null) {
                    this.headersBuilder_ = new RepeatedFieldBuilderV3<>(this.headers_, (this.bitField0_ & 16) != 0, getParentForChildren(), isClean());
                    this.headers_ = null;
                }
                return this.headersBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getHeadersFieldBuilder();
                    getFormsFieldBuilder();
                    getEncryptedRequestFieldBuilder();
                }
            }

            public Builder addAllForms(Iterable<? extends MultipartForm> iterable) {
                RepeatedFieldBuilderV3<MultipartForm, MultipartForm.Builder, MultipartFormOrBuilder> repeatedFieldBuilderV3 = this.formsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureFormsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.forms_);
                onChanged();
                return this;
            }

            public Builder addAllHeaders(Iterable<? extends HTTPHeader> iterable) {
                RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> repeatedFieldBuilderV3 = this.headersBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureHeadersIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.headers_);
                onChanged();
                return this;
            }

            public Builder addForms(MultipartForm.Builder builder) {
                RepeatedFieldBuilderV3<MultipartForm, MultipartForm.Builder, MultipartFormOrBuilder> repeatedFieldBuilderV3 = this.formsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureFormsIsMutable();
                this.forms_.add(builder.build());
                onChanged();
                return this;
            }

            public MultipartForm.Builder addFormsBuilder() {
                return (MultipartForm.Builder) getFormsFieldBuilder().addBuilder(MultipartForm.getDefaultInstance());
            }

            public Builder addHeaders(HTTPHeader.Builder builder) {
                RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> repeatedFieldBuilderV3 = this.headersBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureHeadersIsMutable();
                this.headers_.add(builder.build());
                onChanged();
                return this;
            }

            public HTTPHeader.Builder addHeadersBuilder() {
                return (HTTPHeader.Builder) getHeadersFieldBuilder().addBuilder(HTTPHeader.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RawResourceRequest build() {
                RawResourceRequest rawResourceRequestBuildPartial = buildPartial();
                if (rawResourceRequestBuildPartial.isInitialized()) {
                    return rawResourceRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) rawResourceRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RawResourceRequest buildPartial() {
                RawResourceRequest rawResourceRequest = new RawResourceRequest(this);
                buildPartialRepeatedFields(rawResourceRequest);
                if (this.bitField0_ != 0) {
                    buildPartial0(rawResourceRequest);
                }
                onBuilt();
                return rawResourceRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.url_ = "";
                this.maxSize_ = 0;
                this.method_ = 1;
                this.body_ = "";
                RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> repeatedFieldBuilderV3 = this.headersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.headers_ = Collections.EMPTY_LIST;
                } else {
                    this.headers_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -17;
                this.useDataXfer_ = false;
                this.rawBody_ = ByteString.EMPTY;
                RepeatedFieldBuilderV3<MultipartForm, MultipartForm.Builder, MultipartFormOrBuilder> repeatedFieldBuilderV4 = this.formsBuilder_;
                if (repeatedFieldBuilderV4 == null) {
                    this.forms_ = Collections.EMPTY_LIST;
                } else {
                    this.forms_ = null;
                    repeatedFieldBuilderV4.clear();
                }
                this.bitField0_ &= -129;
                this.connectionTimeoutSeconds_ = 60;
                this.readTimeoutSeconds_ = 60;
                this.encryptedRequest_ = null;
                SingleFieldBuilderV3<EncryptedEnvelope, EncryptedEnvelope.Builder, EncryptedEnvelopeOrBuilder> singleFieldBuilderV3 = this.encryptedRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.encryptedRequestBuilder_ = null;
                }
                return this;
            }

            public Builder clearBody() {
                this.body_ = RawResourceRequest.getDefaultInstance().getBody();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearConnectionTimeoutSeconds() {
                this.bitField0_ &= -257;
                this.connectionTimeoutSeconds_ = 60;
                onChanged();
                return this;
            }

            public Builder clearEncryptedRequest() {
                this.bitField0_ &= -1025;
                this.encryptedRequest_ = null;
                SingleFieldBuilderV3<EncryptedEnvelope, EncryptedEnvelope.Builder, EncryptedEnvelopeOrBuilder> singleFieldBuilderV3 = this.encryptedRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.encryptedRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearForms() {
                RepeatedFieldBuilderV3<MultipartForm, MultipartForm.Builder, MultipartFormOrBuilder> repeatedFieldBuilderV3 = this.formsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.forms_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -129;
                onChanged();
                return this;
            }

            public Builder clearHeaders() {
                RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> repeatedFieldBuilderV3 = this.headersBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.headers_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder clearMaxSize() {
                this.bitField0_ &= -3;
                this.maxSize_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMethod() {
                this.bitField0_ &= -5;
                this.method_ = 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearRawBody() {
                this.bitField0_ &= -65;
                this.rawBody_ = RawResourceRequest.getDefaultInstance().getRawBody();
                onChanged();
                return this;
            }

            public Builder clearReadTimeoutSeconds() {
                this.bitField0_ &= -513;
                this.readTimeoutSeconds_ = 60;
                onChanged();
                return this;
            }

            public Builder clearUrl() {
                this.url_ = RawResourceRequest.getDefaultInstance().getUrl();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearUseDataXfer() {
                this.bitField0_ &= -33;
                this.useDataXfer_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
            public String getBody() {
                Object obj = this.body_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.body_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
            public ByteString getBodyBytes() {
                Object obj = this.body_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.body_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
            public int getConnectionTimeoutSeconds() {
                return this.connectionTimeoutSeconds_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_RawResourceRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
            public EncryptedEnvelope getEncryptedRequest() {
                SingleFieldBuilderV3<EncryptedEnvelope, EncryptedEnvelope.Builder, EncryptedEnvelopeOrBuilder> singleFieldBuilderV3 = this.encryptedRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EncryptedEnvelope) singleFieldBuilderV3.getMessage();
                }
                EncryptedEnvelope encryptedEnvelope = this.encryptedRequest_;
                return encryptedEnvelope == null ? EncryptedEnvelope.getDefaultInstance() : encryptedEnvelope;
            }

            public EncryptedEnvelope.Builder getEncryptedRequestBuilder() {
                this.bitField0_ |= 1024;
                onChanged();
                return (EncryptedEnvelope.Builder) getEncryptedRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
            public EncryptedEnvelopeOrBuilder getEncryptedRequestOrBuilder() {
                SingleFieldBuilderV3<EncryptedEnvelope, EncryptedEnvelope.Builder, EncryptedEnvelopeOrBuilder> singleFieldBuilderV3 = this.encryptedRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EncryptedEnvelopeOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                EncryptedEnvelope encryptedEnvelope = this.encryptedRequest_;
                return encryptedEnvelope == null ? EncryptedEnvelope.getDefaultInstance() : encryptedEnvelope;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
            public MultipartForm getForms(int i14) {
                RepeatedFieldBuilderV3<MultipartForm, MultipartForm.Builder, MultipartFormOrBuilder> repeatedFieldBuilderV3 = this.formsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.forms_.get(i14) : (MultipartForm) repeatedFieldBuilderV3.getMessage(i14);
            }

            public MultipartForm.Builder getFormsBuilder(int i14) {
                return (MultipartForm.Builder) getFormsFieldBuilder().getBuilder(i14);
            }

            public List<MultipartForm.Builder> getFormsBuilderList() {
                return getFormsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
            public int getFormsCount() {
                RepeatedFieldBuilderV3<MultipartForm, MultipartForm.Builder, MultipartFormOrBuilder> repeatedFieldBuilderV3 = this.formsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.forms_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
            public List<MultipartForm> getFormsList() {
                RepeatedFieldBuilderV3<MultipartForm, MultipartForm.Builder, MultipartFormOrBuilder> repeatedFieldBuilderV3 = this.formsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.forms_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
            public MultipartFormOrBuilder getFormsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<MultipartForm, MultipartForm.Builder, MultipartFormOrBuilder> repeatedFieldBuilderV3 = this.formsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.forms_.get(i14) : (MultipartFormOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
            public List<? extends MultipartFormOrBuilder> getFormsOrBuilderList() {
                RepeatedFieldBuilderV3<MultipartForm, MultipartForm.Builder, MultipartFormOrBuilder> repeatedFieldBuilderV3 = this.formsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.forms_);
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
            public HTTPHeader getHeaders(int i14) {
                RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> repeatedFieldBuilderV3 = this.headersBuilder_;
                return repeatedFieldBuilderV3 == null ? this.headers_.get(i14) : (HTTPHeader) repeatedFieldBuilderV3.getMessage(i14);
            }

            public HTTPHeader.Builder getHeadersBuilder(int i14) {
                return (HTTPHeader.Builder) getHeadersFieldBuilder().getBuilder(i14);
            }

            public List<HTTPHeader.Builder> getHeadersBuilderList() {
                return getHeadersFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
            public int getHeadersCount() {
                RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> repeatedFieldBuilderV3 = this.headersBuilder_;
                return repeatedFieldBuilderV3 == null ? this.headers_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
            public List<HTTPHeader> getHeadersList() {
                RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> repeatedFieldBuilderV3 = this.headersBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.headers_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
            public HTTPHeaderOrBuilder getHeadersOrBuilder(int i14) {
                RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> repeatedFieldBuilderV3 = this.headersBuilder_;
                return repeatedFieldBuilderV3 == null ? this.headers_.get(i14) : (HTTPHeaderOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
            public List<? extends HTTPHeaderOrBuilder> getHeadersOrBuilderList() {
                RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> repeatedFieldBuilderV3 = this.headersBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.headers_);
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
            public int getMaxSize() {
                return this.maxSize_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
            public HTTPMethod getMethod() {
                HTTPMethod hTTPMethodForNumber = HTTPMethod.forNumber(this.method_);
                return hTTPMethodForNumber == null ? HTTPMethod.GET : hTTPMethodForNumber;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
            public ByteString getRawBody() {
                return this.rawBody_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
            public int getReadTimeoutSeconds() {
                return this.readTimeoutSeconds_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
            public String getUrl() {
                Object obj = this.url_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.url_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
            public ByteString getUrlBytes() {
                Object obj = this.url_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.url_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
            public boolean getUseDataXfer() {
                return this.useDataXfer_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
            public boolean hasBody() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
            public boolean hasConnectionTimeoutSeconds() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
            public boolean hasEncryptedRequest() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
            public boolean hasMaxSize() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
            public boolean hasMethod() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
            public boolean hasRawBody() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
            public boolean hasReadTimeoutSeconds() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
            public boolean hasUrl() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequestOrBuilder
            public boolean hasUseDataXfer() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_RawResourceRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(RawResourceRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasUrl()) {
                    return false;
                }
                for (int i14 = 0; i14 < getHeadersCount(); i14++) {
                    if (!getHeaders(i14).isInitialized()) {
                        return false;
                    }
                }
                for (int i15 = 0; i15 < getFormsCount(); i15++) {
                    if (!getForms(i15).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeEncryptedRequest(EncryptedEnvelope encryptedEnvelope) {
                EncryptedEnvelope encryptedEnvelope2;
                SingleFieldBuilderV3<EncryptedEnvelope, EncryptedEnvelope.Builder, EncryptedEnvelopeOrBuilder> singleFieldBuilderV3 = this.encryptedRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(encryptedEnvelope);
                } else if ((this.bitField0_ & 1024) == 0 || (encryptedEnvelope2 = this.encryptedRequest_) == null || encryptedEnvelope2 == EncryptedEnvelope.getDefaultInstance()) {
                    this.encryptedRequest_ = encryptedEnvelope;
                } else {
                    getEncryptedRequestBuilder().mergeFrom(encryptedEnvelope);
                }
                if (this.encryptedRequest_ != null) {
                    this.bitField0_ |= 1024;
                    onChanged();
                }
                return this;
            }

            public Builder mergeFrom(RawResourceRequest rawResourceRequest) {
                if (rawResourceRequest == RawResourceRequest.getDefaultInstance()) {
                    return this;
                }
                if (rawResourceRequest.hasUrl()) {
                    this.url_ = rawResourceRequest.url_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (rawResourceRequest.hasMaxSize()) {
                    setMaxSize(rawResourceRequest.getMaxSize());
                }
                if (rawResourceRequest.hasMethod()) {
                    setMethod(rawResourceRequest.getMethod());
                }
                if (rawResourceRequest.hasBody()) {
                    this.body_ = rawResourceRequest.body_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (this.headersBuilder_ == null) {
                    if (!rawResourceRequest.headers_.isEmpty()) {
                        if (this.headers_.isEmpty()) {
                            this.headers_ = rawResourceRequest.headers_;
                            this.bitField0_ &= -17;
                        } else {
                            ensureHeadersIsMutable();
                            this.headers_.addAll(rawResourceRequest.headers_);
                        }
                        onChanged();
                    }
                } else if (!rawResourceRequest.headers_.isEmpty()) {
                    boolean zIsEmpty = this.headersBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> repeatedFieldBuilderV3 = this.headersBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.headersBuilder_ = null;
                        this.headers_ = rawResourceRequest.headers_;
                        this.bitField0_ &= -17;
                        this.headersBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getHeadersFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(rawResourceRequest.headers_);
                    }
                }
                if (rawResourceRequest.hasUseDataXfer()) {
                    setUseDataXfer(rawResourceRequest.getUseDataXfer());
                }
                if (rawResourceRequest.hasRawBody()) {
                    setRawBody(rawResourceRequest.getRawBody());
                }
                if (this.formsBuilder_ == null) {
                    if (!rawResourceRequest.forms_.isEmpty()) {
                        if (this.forms_.isEmpty()) {
                            this.forms_ = rawResourceRequest.forms_;
                            this.bitField0_ &= -129;
                        } else {
                            ensureFormsIsMutable();
                            this.forms_.addAll(rawResourceRequest.forms_);
                        }
                        onChanged();
                    }
                } else if (!rawResourceRequest.forms_.isEmpty()) {
                    boolean zIsEmpty2 = this.formsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<MultipartForm, MultipartForm.Builder, MultipartFormOrBuilder> repeatedFieldBuilderV4 = this.formsBuilder_;
                    if (zIsEmpty2) {
                        repeatedFieldBuilderV4.dispose();
                        this.formsBuilder_ = null;
                        this.forms_ = rawResourceRequest.forms_;
                        this.bitField0_ &= -129;
                        this.formsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getFormsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV4.addAllMessages(rawResourceRequest.forms_);
                    }
                }
                if (rawResourceRequest.hasConnectionTimeoutSeconds()) {
                    setConnectionTimeoutSeconds(rawResourceRequest.getConnectionTimeoutSeconds());
                }
                if (rawResourceRequest.hasReadTimeoutSeconds()) {
                    setReadTimeoutSeconds(rawResourceRequest.getReadTimeoutSeconds());
                }
                if (rawResourceRequest.hasEncryptedRequest()) {
                    mergeEncryptedRequest(rawResourceRequest.getEncryptedRequest());
                }
                mergeUnknownFields(rawResourceRequest.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeForms(int i14) {
                RepeatedFieldBuilderV3<MultipartForm, MultipartForm.Builder, MultipartFormOrBuilder> repeatedFieldBuilderV3 = this.formsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureFormsIsMutable();
                this.forms_.remove(i14);
                onChanged();
                return this;
            }

            public Builder removeHeaders(int i14) {
                RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> repeatedFieldBuilderV3 = this.headersBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureHeadersIsMutable();
                this.headers_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setBody(String str) {
                str.getClass();
                this.body_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setBodyBytes(ByteString byteString) {
                byteString.getClass();
                this.body_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setConnectionTimeoutSeconds(int i14) {
                this.connectionTimeoutSeconds_ = i14;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setEncryptedRequest(EncryptedEnvelope.Builder builder) {
                SingleFieldBuilderV3<EncryptedEnvelope, EncryptedEnvelope.Builder, EncryptedEnvelopeOrBuilder> singleFieldBuilderV3 = this.encryptedRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.encryptedRequest_ = builder.build();
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

            public Builder setForms(int i14, MultipartForm.Builder builder) {
                RepeatedFieldBuilderV3<MultipartForm, MultipartForm.Builder, MultipartFormOrBuilder> repeatedFieldBuilderV3 = this.formsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureFormsIsMutable();
                this.forms_.set(i14, builder.build());
                onChanged();
                return this;
            }

            public Builder setHeaders(int i14, HTTPHeader.Builder builder) {
                RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> repeatedFieldBuilderV3 = this.headersBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureHeadersIsMutable();
                this.headers_.set(i14, builder.build());
                onChanged();
                return this;
            }

            public Builder setMaxSize(int i14) {
                this.maxSize_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setMethod(HTTPMethod hTTPMethod) {
                hTTPMethod.getClass();
                this.bitField0_ |= 4;
                this.method_ = hTTPMethod.getNumber();
                onChanged();
                return this;
            }

            public Builder setRawBody(ByteString byteString) {
                byteString.getClass();
                this.rawBody_ = byteString;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setReadTimeoutSeconds(int i14) {
                this.readTimeoutSeconds_ = i14;
                this.bitField0_ |= 512;
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

            public Builder setUrl(String str) {
                str.getClass();
                this.url_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                byteString.getClass();
                this.url_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setUseDataXfer(boolean z14) {
                this.useDataXfer_ = z14;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public RawResourceRequest getDefaultInstanceForType() {
                return RawResourceRequest.getDefaultInstance();
            }

            public MultipartForm.Builder addFormsBuilder(int i14) {
                return (MultipartForm.Builder) getFormsFieldBuilder().addBuilder(i14, MultipartForm.getDefaultInstance());
            }

            public HTTPHeader.Builder addHeadersBuilder(int i14) {
                return (HTTPHeader.Builder) getHeadersFieldBuilder().addBuilder(i14, HTTPHeader.getDefaultInstance());
            }

            public Builder addForms(int i14, MultipartForm multipartForm) {
                RepeatedFieldBuilderV3<MultipartForm, MultipartForm.Builder, MultipartFormOrBuilder> repeatedFieldBuilderV3 = this.formsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    multipartForm.getClass();
                    ensureFormsIsMutable();
                    this.forms_.add(i14, multipartForm);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, multipartForm);
                return this;
            }

            public Builder addHeaders(int i14, HTTPHeader hTTPHeader) {
                RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> repeatedFieldBuilderV3 = this.headersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    hTTPHeader.getClass();
                    ensureHeadersIsMutable();
                    this.headers_.add(i14, hTTPHeader);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, hTTPHeader);
                return this;
            }

            public Builder setEncryptedRequest(EncryptedEnvelope encryptedEnvelope) {
                SingleFieldBuilderV3<EncryptedEnvelope, EncryptedEnvelope.Builder, EncryptedEnvelopeOrBuilder> singleFieldBuilderV3 = this.encryptedRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    encryptedEnvelope.getClass();
                    this.encryptedRequest_ = encryptedEnvelope;
                } else {
                    singleFieldBuilderV3.setMessage(encryptedEnvelope);
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setForms(int i14, MultipartForm multipartForm) {
                RepeatedFieldBuilderV3<MultipartForm, MultipartForm.Builder, MultipartFormOrBuilder> repeatedFieldBuilderV3 = this.formsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    multipartForm.getClass();
                    ensureFormsIsMutable();
                    this.forms_.set(i14, multipartForm);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, multipartForm);
                return this;
            }

            public Builder setHeaders(int i14, HTTPHeader hTTPHeader) {
                RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> repeatedFieldBuilderV3 = this.headersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    hTTPHeader.getClass();
                    ensureHeadersIsMutable();
                    this.headers_.set(i14, hTTPHeader);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, hTTPHeader);
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
                this.url_ = "";
                this.method_ = 1;
                this.body_ = "";
                List list = Collections.EMPTY_LIST;
                this.headers_ = list;
                this.rawBody_ = ByteString.EMPTY;
                this.forms_ = list;
                this.connectionTimeoutSeconds_ = 60;
                this.readTimeoutSeconds_ = 60;
                maybeForceBuilderInitialization();
            }

            public Builder addForms(MultipartForm multipartForm) {
                RepeatedFieldBuilderV3<MultipartForm, MultipartForm.Builder, MultipartFormOrBuilder> repeatedFieldBuilderV3 = this.formsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    multipartForm.getClass();
                    ensureFormsIsMutable();
                    this.forms_.add(multipartForm);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(multipartForm);
                return this;
            }

            public Builder addHeaders(HTTPHeader hTTPHeader) {
                RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> repeatedFieldBuilderV3 = this.headersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    hTTPHeader.getClass();
                    ensureHeadersIsMutable();
                    this.headers_.add(hTTPHeader);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(hTTPHeader);
                return this;
            }

            public Builder addForms(int i14, MultipartForm.Builder builder) {
                RepeatedFieldBuilderV3<MultipartForm, MultipartForm.Builder, MultipartFormOrBuilder> repeatedFieldBuilderV3 = this.formsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureFormsIsMutable();
                    this.forms_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            public Builder addHeaders(int i14, HTTPHeader.Builder builder) {
                RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> repeatedFieldBuilderV3 = this.headersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureHeadersIsMutable();
                    this.headers_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof RawResourceRequest) {
                    return mergeFrom((RawResourceRequest) message);
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
                            switch (tag) {
                                case 0:
                                    break;
                                case 10:
                                    this.url_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                    continue;
                                case 16:
                                    this.maxSize_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                    continue;
                                case 24:
                                    int i14 = codedInputStream.readEnum();
                                    if (HTTPMethod.forNumber(i14) == null) {
                                        mergeUnknownVarintField(3, i14);
                                    } else {
                                        this.method_ = i14;
                                        this.bitField0_ |= 4;
                                        continue;
                                    }
                                    break;
                                case 34:
                                    this.body_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 8;
                                    continue;
                                case 42:
                                    HTTPHeader hTTPHeader = (HTTPHeader) codedInputStream.readMessage(HTTPHeader.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> repeatedFieldBuilderV3 = this.headersBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureHeadersIsMutable();
                                        this.headers_.add(hTTPHeader);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(hTTPHeader);
                                        continue;
                                    }
                                    break;
                                case 48:
                                    this.useDataXfer_ = codedInputStream.readBool();
                                    this.bitField0_ |= 32;
                                    continue;
                                case 58:
                                    this.rawBody_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 64;
                                    continue;
                                case 66:
                                    MultipartForm multipartForm = (MultipartForm) codedInputStream.readMessage(MultipartForm.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<MultipartForm, MultipartForm.Builder, MultipartFormOrBuilder> repeatedFieldBuilderV4 = this.formsBuilder_;
                                    if (repeatedFieldBuilderV4 == null) {
                                        ensureFormsIsMutable();
                                        this.forms_.add(multipartForm);
                                    } else {
                                        repeatedFieldBuilderV4.addMessage(multipartForm);
                                        continue;
                                    }
                                    break;
                                case 72:
                                    this.connectionTimeoutSeconds_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 256;
                                    continue;
                                case 80:
                                    this.readTimeoutSeconds_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 512;
                                    continue;
                                case 90:
                                    codedInputStream.readMessage(getEncryptedRequestFieldBuilder().getBuilder(), extensionRegistryLite);
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
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public RawResourceRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static RawResourceRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RawResourceRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RawResourceRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static RawResourceRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static RawResourceRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static RawResourceRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static RawResourceRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static RawResourceRequest parseFrom(InputStream inputStream) {
            return (RawResourceRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static RawResourceRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RawResourceRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RawResourceRequest parseFrom(CodedInputStream codedInputStream) {
            return (RawResourceRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static RawResourceRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RawResourceRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum HTTPMethod implements ProtocolMessageEnum {
            UNKNOWN(0),
            GET(1),
            PUT(2),
            POST(3),
            DELETE(4),
            PATCH(5),
            HEAD(6);

            public static final int DELETE_VALUE = 4;
            public static final int GET_VALUE = 1;
            public static final int HEAD_VALUE = 6;
            public static final int PATCH_VALUE = 5;
            public static final int POST_VALUE = 3;
            public static final int PUT_VALUE = 2;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<HTTPMethod> internalValueMap = new Internal.EnumLiteMap<HTTPMethod>() { // from class: com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceRequest.HTTPMethod.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public HTTPMethod findValueByNumber(int i14) {
                    return HTTPMethod.forNumber(i14);
                }
            };
            private static final HTTPMethod[] VALUES = values();

            HTTPMethod(int i14) {
                this.value = i14;
            }

            public static HTTPMethod forNumber(int i14) {
                switch (i14) {
                    case 0:
                        return UNKNOWN;
                    case 1:
                        return GET;
                    case 2:
                        return PUT;
                    case 3:
                        return POST;
                    case 4:
                        return DELETE;
                    case 5:
                        return PATCH;
                    case 6:
                        return HEAD;
                    default:
                        return null;
                }
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return RawResourceRequest.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<HTTPMethod> internalGetValueMap() {
                return internalValueMap;
            }

            public static HTTPMethod valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static HTTPMethod valueOf(int i14) {
                return forNumber(i14);
            }
        }

        private RawResourceRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.url_ = "";
            this.maxSize_ = 0;
            this.method_ = 1;
            this.body_ = "";
            this.useDataXfer_ = false;
            this.rawBody_ = ByteString.EMPTY;
            this.connectionTimeoutSeconds_ = 60;
            this.readTimeoutSeconds_ = 60;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ RawResourceRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class RawResourceResponse extends GeneratedMessageV3 implements RawResourceResponseOrBuilder {
        public static final int HEADERS_FIELD_NUMBER = 5;
        public static final int HTTP_STATUS_CODE_FIELD_NUMBER = 2;
        public static final int RESOURCE_DATA_FIELD_NUMBER = 3;
        public static final int STATUS_FIELD_NUMBER = 1;
        public static final int XFER_DATA_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private List<HTTPHeader> headers_;
        private int httpStatusCode_;
        private byte memoizedIsInitialized;
        private ByteString resourceData_;
        private int status_;
        private GDIDataTypes.DataTransferItem xferData_;
        private static final RawResourceResponse DEFAULT_INSTANCE = new RawResourceResponse();

        @Deprecated
        public static final Parser<RawResourceResponse> PARSER = new AbstractParser<RawResourceResponse>() { // from class: com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponse.1
            @Override // com.google.protobuf.Parser
            public RawResourceResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = RawResourceResponse.newBuilder();
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

        public interface HTTPHeaderOrBuilder extends MessageOrBuilder {
            String getKey();

            ByteString getKeyBytes();

            String getValue();

            ByteString getValueBytes();

            boolean hasKey();

            boolean hasValue();
        }

        private RawResourceResponse() {
            this.status_ = 0;
            this.httpStatusCode_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
            this.resourceData_ = byteString;
            this.headers_ = Collections.EMPTY_LIST;
        }

        public static RawResourceResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_RawResourceResponse_descriptor;
        }

        public static Builder newBuilder(RawResourceResponse rawResourceResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(rawResourceResponse);
        }

        public static RawResourceResponse parseDelimitedFrom(InputStream inputStream) {
            return (RawResourceResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static RawResourceResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<RawResourceResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RawResourceResponse)) {
                return super.equals(obj);
            }
            RawResourceResponse rawResourceResponse = (RawResourceResponse) obj;
            if (hasStatus() != rawResourceResponse.hasStatus()) {
                return false;
            }
            if ((hasStatus() && this.status_ != rawResourceResponse.status_) || hasHttpStatusCode() != rawResourceResponse.hasHttpStatusCode()) {
                return false;
            }
            if ((hasHttpStatusCode() && getHttpStatusCode() != rawResourceResponse.getHttpStatusCode()) || hasResourceData() != rawResourceResponse.hasResourceData()) {
                return false;
            }
            if ((!hasResourceData() || getResourceData().equals(rawResourceResponse.getResourceData())) && hasXferData() == rawResourceResponse.hasXferData()) {
                return (!hasXferData() || getXferData().equals(rawResourceResponse.getXferData())) && getHeadersList().equals(rawResourceResponse.getHeadersList()) && getUnknownFields().equals(rawResourceResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponseOrBuilder
        public HTTPHeader getHeaders(int i14) {
            return this.headers_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponseOrBuilder
        public int getHeadersCount() {
            return this.headers_.size();
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponseOrBuilder
        public List<HTTPHeader> getHeadersList() {
            return this.headers_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponseOrBuilder
        public HTTPHeaderOrBuilder getHeadersOrBuilder(int i14) {
            return this.headers_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponseOrBuilder
        public List<? extends HTTPHeaderOrBuilder> getHeadersOrBuilderList() {
            return this.headers_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponseOrBuilder
        public int getHttpStatusCode() {
            return this.httpStatusCode_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<RawResourceResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponseOrBuilder
        public ByteString getResourceData() {
            return this.resourceData_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.status_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeInt32Size(2, this.httpStatusCode_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeBytesSize(3, this.resourceData_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(4, getXferData());
            }
            for (int i15 = 0; i15 < this.headers_.size(); i15++) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(5, this.headers_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.UNKNOWN : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponseOrBuilder
        public GDIDataTypes.DataTransferItem getXferData() {
            GDIDataTypes.DataTransferItem dataTransferItem = this.xferData_;
            return dataTransferItem == null ? GDIDataTypes.DataTransferItem.getDefaultInstance() : dataTransferItem;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponseOrBuilder
        public GDIDataTypes.DataTransferItemOrBuilder getXferDataOrBuilder() {
            GDIDataTypes.DataTransferItem dataTransferItem = this.xferData_;
            return dataTransferItem == null ? GDIDataTypes.DataTransferItem.getDefaultInstance() : dataTransferItem;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponseOrBuilder
        public boolean hasHttpStatusCode() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponseOrBuilder
        public boolean hasResourceData() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponseOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponseOrBuilder
        public boolean hasXferData() {
            return (this.bitField0_ & 8) != 0;
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
            if (hasHttpStatusCode()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getHttpStatusCode();
            }
            if (hasResourceData()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getResourceData().hashCode();
            }
            if (hasXferData()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getXferData().hashCode();
            }
            if (getHeadersCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getHeadersList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_RawResourceResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(RawResourceResponse.class, Builder.class);
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
            if (hasXferData() && !getXferData().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i14 = 0; i14 < getHeadersCount(); i14++) {
                if (!getHeaders(i14).isInitialized()) {
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
            return new RawResourceResponse();
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
                codedOutputStream.writeInt32(2, this.httpStatusCode_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBytes(3, this.resourceData_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getXferData());
            }
            for (int i14 = 0; i14 < this.headers_.size(); i14++) {
                codedOutputStream.writeMessage(5, this.headers_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class HTTPHeader extends GeneratedMessageV3 implements HTTPHeaderOrBuilder {
            public static final int KEY_FIELD_NUMBER = 1;
            public static final int VALUE_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private volatile Object key_;
            private byte memoizedIsInitialized;
            private volatile Object value_;
            private static final HTTPHeader DEFAULT_INSTANCE = new HTTPHeader();

            @Deprecated
            public static final Parser<HTTPHeader> PARSER = new AbstractParser<HTTPHeader>() { // from class: com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponse.HTTPHeader.1
                @Override // com.google.protobuf.Parser
                public HTTPHeader parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = HTTPHeader.newBuilder();
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

            private HTTPHeader() {
                this.key_ = "";
                this.value_ = "";
                this.memoizedIsInitialized = (byte) -1;
                this.key_ = "";
                this.value_ = "";
            }

            public static HTTPHeader getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_RawResourceResponse_HTTPHeader_descriptor;
            }

            public static Builder newBuilder(HTTPHeader hTTPHeader) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(hTTPHeader);
            }

            public static HTTPHeader parseDelimitedFrom(InputStream inputStream) {
                return (HTTPHeader) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static HTTPHeader parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<HTTPHeader> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof HTTPHeader)) {
                    return super.equals(obj);
                }
                HTTPHeader hTTPHeader = (HTTPHeader) obj;
                if (hasKey() != hTTPHeader.hasKey()) {
                    return false;
                }
                if ((!hasKey() || getKey().equals(hTTPHeader.getKey())) && hasValue() == hTTPHeader.hasValue()) {
                    return (!hasValue() || getValue().equals(hTTPHeader.getValue())) && getUnknownFields().equals(hTTPHeader.getUnknownFields());
                }
                return false;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponse.HTTPHeaderOrBuilder
            public String getKey() {
                Object obj = this.key_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.key_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponse.HTTPHeaderOrBuilder
            public ByteString getKeyBytes() {
                Object obj = this.key_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.key_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<HTTPHeader> getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i14 = this.memoizedSize;
                if (i14 != -1) {
                    return i14;
                }
                int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.key_) : 0;
                if ((this.bitField0_ & 2) != 0) {
                    iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.value_);
                }
                int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponse.HTTPHeaderOrBuilder
            public String getValue() {
                Object obj = this.value_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.value_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponse.HTTPHeaderOrBuilder
            public ByteString getValueBytes() {
                Object obj = this.value_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.value_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponse.HTTPHeaderOrBuilder
            public boolean hasKey() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponse.HTTPHeaderOrBuilder
            public boolean hasValue() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i14 = this.memoizedHashCode;
                if (i14 != 0) {
                    return i14;
                }
                int iHashCode = getDescriptor().hashCode() + 779;
                if (hasKey()) {
                    iHashCode = e5.c(iHashCode, 37, 1, 53) + getKey().hashCode();
                }
                if (hasValue()) {
                    iHashCode = e5.c(iHashCode, 37, 2, 53) + getValue().hashCode();
                }
                int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_RawResourceResponse_HTTPHeader_fieldAccessorTable.ensureFieldAccessorsInitialized(HTTPHeader.class, Builder.class);
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
                if (!hasKey()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
                if (hasValue()) {
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
                return new HTTPHeader();
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                int i14 = 0;
                return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                if ((this.bitField0_ & 1) != 0) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.key_);
                }
                if ((this.bitField0_ & 2) != 0) {
                    GeneratedMessageV3.writeString(codedOutputStream, 2, this.value_);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HTTPHeaderOrBuilder {
                private int bitField0_;
                private Object key_;
                private Object value_;

                private Builder() {
                    this.key_ = "";
                    this.value_ = "";
                }

                private void buildPartial0(HTTPHeader hTTPHeader) {
                    int i14;
                    int i15 = this.bitField0_;
                    if ((i15 & 1) != 0) {
                        hTTPHeader.key_ = this.key_;
                        i14 = 1;
                    } else {
                        i14 = 0;
                    }
                    if ((i15 & 2) != 0) {
                        hTTPHeader.value_ = this.value_;
                        i14 |= 2;
                    }
                    hTTPHeader.bitField0_ |= i14;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_RawResourceResponse_HTTPHeader_descriptor;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public HTTPHeader build() {
                    HTTPHeader hTTPHeaderBuildPartial = buildPartial();
                    if (hTTPHeaderBuildPartial.isInitialized()) {
                        return hTTPHeaderBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) hTTPHeaderBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public HTTPHeader buildPartial() {
                    HTTPHeader hTTPHeader = new HTTPHeader(this);
                    if (this.bitField0_ != 0) {
                        buildPartial0(hTTPHeader);
                    }
                    onBuilt();
                    return hTTPHeader;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.key_ = "";
                    this.value_ = "";
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                    return (Builder) super.clearField(fieldDescriptor);
                }

                public Builder clearKey() {
                    this.key_ = HTTPHeader.getDefaultInstance().getKey();
                    this.bitField0_ &= -2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                    return (Builder) super.clearOneof(oneofDescriptor);
                }

                public Builder clearValue() {
                    this.value_ = HTTPHeader.getDefaultInstance().getValue();
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
                    return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_RawResourceResponse_HTTPHeader_descriptor;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponse.HTTPHeaderOrBuilder
                public String getKey() {
                    Object obj = this.key_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String stringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.key_ = stringUtf8;
                    }
                    return stringUtf8;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponse.HTTPHeaderOrBuilder
                public ByteString getKeyBytes() {
                    Object obj = this.key_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.key_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponse.HTTPHeaderOrBuilder
                public String getValue() {
                    Object obj = this.value_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String stringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.value_ = stringUtf8;
                    }
                    return stringUtf8;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponse.HTTPHeaderOrBuilder
                public ByteString getValueBytes() {
                    Object obj = this.value_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.value_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponse.HTTPHeaderOrBuilder
                public boolean hasKey() {
                    return (this.bitField0_ & 1) != 0;
                }

                @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponse.HTTPHeaderOrBuilder
                public boolean hasValue() {
                    return (this.bitField0_ & 2) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_RawResourceResponse_HTTPHeader_fieldAccessorTable.ensureFieldAccessorsInitialized(HTTPHeader.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return hasKey() && hasValue();
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
                                        this.key_ = codedInputStream.readBytes();
                                        this.bitField0_ |= 1;
                                    } else if (tag == 18) {
                                        this.value_ = codedInputStream.readBytes();
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

                public Builder setKey(String str) {
                    str.getClass();
                    this.key_ = str;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setKeyBytes(ByteString byteString) {
                    byteString.getClass();
                    this.key_ = byteString;
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

                public Builder setValue(String str) {
                    str.getClass();
                    this.value_ = str;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                public Builder setValueBytes(ByteString byteString) {
                    byteString.getClass();
                    this.value_ = byteString;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public HTTPHeader getDefaultInstanceForType() {
                    return HTTPHeader.getDefaultInstance();
                }

                public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                    this(builderParent);
                }

                public /* synthetic */ Builder(int i14) {
                    this();
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.key_ = "";
                    this.value_ = "";
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof HTTPHeader) {
                        return mergeFrom((HTTPHeader) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(HTTPHeader hTTPHeader) {
                    if (hTTPHeader == HTTPHeader.getDefaultInstance()) {
                        return this;
                    }
                    if (hTTPHeader.hasKey()) {
                        this.key_ = hTTPHeader.key_;
                        this.bitField0_ |= 1;
                        onChanged();
                    }
                    if (hTTPHeader.hasValue()) {
                        this.value_ = hTTPHeader.value_;
                        this.bitField0_ |= 2;
                        onChanged();
                    }
                    mergeUnknownFields(hTTPHeader.getUnknownFields());
                    onChanged();
                    return this;
                }
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public HTTPHeader getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public static HTTPHeader parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (HTTPHeader) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static HTTPHeader parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static HTTPHeader parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static HTTPHeader parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static HTTPHeader parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            public static HTTPHeader parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static HTTPHeader parseFrom(InputStream inputStream) {
                return (HTTPHeader) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static HTTPHeader parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (HTTPHeader) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            private HTTPHeader(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.key_ = "";
                this.value_ = "";
                this.memoizedIsInitialized = (byte) -1;
            }

            public static HTTPHeader parseFrom(CodedInputStream codedInputStream) {
                return (HTTPHeader) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static HTTPHeader parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (HTTPHeader) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            public /* synthetic */ HTTPHeader(Builder builder) {
                this((GeneratedMessageV3.Builder<?>) builder);
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RawResourceResponseOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> headersBuilder_;
            private List<HTTPHeader> headers_;
            private int httpStatusCode_;
            private ByteString resourceData_;
            private int status_;
            private SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> xferDataBuilder_;
            private GDIDataTypes.DataTransferItem xferData_;

            private Builder() {
                this.status_ = 0;
                this.resourceData_ = ByteString.EMPTY;
                this.headers_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(RawResourceResponse rawResourceResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    rawResourceResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    rawResourceResponse.httpStatusCode_ = this.httpStatusCode_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    rawResourceResponse.resourceData_ = this.resourceData_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                    rawResourceResponse.xferData_ = singleFieldBuilderV3 == null ? this.xferData_ : (GDIDataTypes.DataTransferItem) singleFieldBuilderV3.build();
                    i14 |= 8;
                }
                rawResourceResponse.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(RawResourceResponse rawResourceResponse) {
                RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> repeatedFieldBuilderV3 = this.headersBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    rawResourceResponse.headers_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 16) != 0) {
                    this.headers_ = Collections.unmodifiableList(this.headers_);
                    this.bitField0_ &= -17;
                }
                rawResourceResponse.headers_ = this.headers_;
            }

            private void ensureHeadersIsMutable() {
                if ((this.bitField0_ & 16) == 0) {
                    this.headers_ = new ArrayList(this.headers_);
                    this.bitField0_ |= 16;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_RawResourceResponse_descriptor;
            }

            private RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> getHeadersFieldBuilder() {
                if (this.headersBuilder_ == null) {
                    this.headersBuilder_ = new RepeatedFieldBuilderV3<>(this.headers_, (this.bitField0_ & 16) != 0, getParentForChildren(), isClean());
                    this.headers_ = null;
                }
                return this.headersBuilder_;
            }

            private SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> getXferDataFieldBuilder() {
                if (this.xferDataBuilder_ == null) {
                    this.xferDataBuilder_ = new SingleFieldBuilderV3<>(getXferData(), getParentForChildren(), isClean());
                    this.xferData_ = null;
                }
                return this.xferDataBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getXferDataFieldBuilder();
                    getHeadersFieldBuilder();
                }
            }

            public Builder addAllHeaders(Iterable<? extends HTTPHeader> iterable) {
                RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> repeatedFieldBuilderV3 = this.headersBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureHeadersIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.headers_);
                onChanged();
                return this;
            }

            public Builder addHeaders(HTTPHeader.Builder builder) {
                RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> repeatedFieldBuilderV3 = this.headersBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureHeadersIsMutable();
                this.headers_.add(builder.build());
                onChanged();
                return this;
            }

            public HTTPHeader.Builder addHeadersBuilder() {
                return (HTTPHeader.Builder) getHeadersFieldBuilder().addBuilder(HTTPHeader.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RawResourceResponse build() {
                RawResourceResponse rawResourceResponseBuildPartial = buildPartial();
                if (rawResourceResponseBuildPartial.isInitialized()) {
                    return rawResourceResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) rawResourceResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RawResourceResponse buildPartial() {
                RawResourceResponse rawResourceResponse = new RawResourceResponse(this);
                buildPartialRepeatedFields(rawResourceResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(rawResourceResponse);
                }
                onBuilt();
                return rawResourceResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                this.httpStatusCode_ = 0;
                this.resourceData_ = ByteString.EMPTY;
                this.xferData_ = null;
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.xferDataBuilder_ = null;
                }
                RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> repeatedFieldBuilderV3 = this.headersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.headers_ = Collections.EMPTY_LIST;
                } else {
                    this.headers_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -17;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearHeaders() {
                RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> repeatedFieldBuilderV3 = this.headersBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.headers_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder clearHttpStatusCode() {
                this.bitField0_ &= -3;
                this.httpStatusCode_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearResourceData() {
                this.bitField0_ &= -5;
                this.resourceData_ = RawResourceResponse.getDefaultInstance().getResourceData();
                onChanged();
                return this;
            }

            public Builder clearStatus() {
                this.bitField0_ &= -2;
                this.status_ = 0;
                onChanged();
                return this;
            }

            public Builder clearXferData() {
                this.bitField0_ &= -9;
                this.xferData_ = null;
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.xferDataBuilder_ = null;
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
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_RawResourceResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponseOrBuilder
            public HTTPHeader getHeaders(int i14) {
                RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> repeatedFieldBuilderV3 = this.headersBuilder_;
                return repeatedFieldBuilderV3 == null ? this.headers_.get(i14) : (HTTPHeader) repeatedFieldBuilderV3.getMessage(i14);
            }

            public HTTPHeader.Builder getHeadersBuilder(int i14) {
                return (HTTPHeader.Builder) getHeadersFieldBuilder().getBuilder(i14);
            }

            public List<HTTPHeader.Builder> getHeadersBuilderList() {
                return getHeadersFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponseOrBuilder
            public int getHeadersCount() {
                RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> repeatedFieldBuilderV3 = this.headersBuilder_;
                return repeatedFieldBuilderV3 == null ? this.headers_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponseOrBuilder
            public List<HTTPHeader> getHeadersList() {
                RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> repeatedFieldBuilderV3 = this.headersBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.headers_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponseOrBuilder
            public HTTPHeaderOrBuilder getHeadersOrBuilder(int i14) {
                RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> repeatedFieldBuilderV3 = this.headersBuilder_;
                return repeatedFieldBuilderV3 == null ? this.headers_.get(i14) : (HTTPHeaderOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponseOrBuilder
            public List<? extends HTTPHeaderOrBuilder> getHeadersOrBuilderList() {
                RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> repeatedFieldBuilderV3 = this.headersBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.headers_);
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponseOrBuilder
            public int getHttpStatusCode() {
                return this.httpStatusCode_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponseOrBuilder
            public ByteString getResourceData() {
                return this.resourceData_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.UNKNOWN : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponseOrBuilder
            public GDIDataTypes.DataTransferItem getXferData() {
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.DataTransferItem) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.DataTransferItem dataTransferItem = this.xferData_;
                return dataTransferItem == null ? GDIDataTypes.DataTransferItem.getDefaultInstance() : dataTransferItem;
            }

            public GDIDataTypes.DataTransferItem.Builder getXferDataBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (GDIDataTypes.DataTransferItem.Builder) getXferDataFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponseOrBuilder
            public GDIDataTypes.DataTransferItemOrBuilder getXferDataOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.DataTransferItemOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.DataTransferItem dataTransferItem = this.xferData_;
                return dataTransferItem == null ? GDIDataTypes.DataTransferItem.getDefaultInstance() : dataTransferItem;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponseOrBuilder
            public boolean hasHttpStatusCode() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponseOrBuilder
            public boolean hasResourceData() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponseOrBuilder
            public boolean hasXferData() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_RawResourceResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(RawResourceResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasXferData() && !getXferData().isInitialized()) {
                    return false;
                }
                for (int i14 = 0; i14 < getHeadersCount(); i14++) {
                    if (!getHeaders(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(RawResourceResponse rawResourceResponse) {
                if (rawResourceResponse == RawResourceResponse.getDefaultInstance()) {
                    return this;
                }
                if (rawResourceResponse.hasStatus()) {
                    setStatus(rawResourceResponse.getStatus());
                }
                if (rawResourceResponse.hasHttpStatusCode()) {
                    setHttpStatusCode(rawResourceResponse.getHttpStatusCode());
                }
                if (rawResourceResponse.hasResourceData()) {
                    setResourceData(rawResourceResponse.getResourceData());
                }
                if (rawResourceResponse.hasXferData()) {
                    mergeXferData(rawResourceResponse.getXferData());
                }
                if (this.headersBuilder_ == null) {
                    if (!rawResourceResponse.headers_.isEmpty()) {
                        if (this.headers_.isEmpty()) {
                            this.headers_ = rawResourceResponse.headers_;
                            this.bitField0_ &= -17;
                        } else {
                            ensureHeadersIsMutable();
                            this.headers_.addAll(rawResourceResponse.headers_);
                        }
                        onChanged();
                    }
                } else if (!rawResourceResponse.headers_.isEmpty()) {
                    boolean zIsEmpty = this.headersBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> repeatedFieldBuilderV3 = this.headersBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.headersBuilder_ = null;
                        this.headers_ = rawResourceResponse.headers_;
                        this.bitField0_ &= -17;
                        this.headersBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getHeadersFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(rawResourceResponse.headers_);
                    }
                }
                mergeUnknownFields(rawResourceResponse.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder mergeXferData(GDIDataTypes.DataTransferItem dataTransferItem) {
                GDIDataTypes.DataTransferItem dataTransferItem2;
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(dataTransferItem);
                } else if ((this.bitField0_ & 8) == 0 || (dataTransferItem2 = this.xferData_) == null || dataTransferItem2 == GDIDataTypes.DataTransferItem.getDefaultInstance()) {
                    this.xferData_ = dataTransferItem;
                } else {
                    getXferDataBuilder().mergeFrom(dataTransferItem);
                }
                if (this.xferData_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder removeHeaders(int i14) {
                RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> repeatedFieldBuilderV3 = this.headersBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureHeadersIsMutable();
                this.headers_.remove(i14);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setHeaders(int i14, HTTPHeader.Builder builder) {
                RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> repeatedFieldBuilderV3 = this.headersBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureHeadersIsMutable();
                this.headers_.set(i14, builder.build());
                onChanged();
                return this;
            }

            public Builder setHttpStatusCode(int i14) {
                this.httpStatusCode_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setResourceData(ByteString byteString) {
                byteString.getClass();
                this.resourceData_ = byteString;
                this.bitField0_ |= 4;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setXferData(GDIDataTypes.DataTransferItem.Builder builder) {
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.xferData_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public RawResourceResponse getDefaultInstanceForType() {
                return RawResourceResponse.getDefaultInstance();
            }

            public HTTPHeader.Builder addHeadersBuilder(int i14) {
                return (HTTPHeader.Builder) getHeadersFieldBuilder().addBuilder(i14, HTTPHeader.getDefaultInstance());
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
                this.resourceData_ = ByteString.EMPTY;
                this.headers_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public Builder addHeaders(int i14, HTTPHeader hTTPHeader) {
                RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> repeatedFieldBuilderV3 = this.headersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    hTTPHeader.getClass();
                    ensureHeadersIsMutable();
                    this.headers_.add(i14, hTTPHeader);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, hTTPHeader);
                return this;
            }

            public Builder setHeaders(int i14, HTTPHeader hTTPHeader) {
                RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> repeatedFieldBuilderV3 = this.headersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    hTTPHeader.getClass();
                    ensureHeadersIsMutable();
                    this.headers_.set(i14, hTTPHeader);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, hTTPHeader);
                return this;
            }

            public Builder setXferData(GDIDataTypes.DataTransferItem dataTransferItem) {
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    dataTransferItem.getClass();
                    this.xferData_ = dataTransferItem;
                } else {
                    singleFieldBuilderV3.setMessage(dataTransferItem);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder addHeaders(HTTPHeader hTTPHeader) {
                RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> repeatedFieldBuilderV3 = this.headersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    hTTPHeader.getClass();
                    ensureHeadersIsMutable();
                    this.headers_.add(hTTPHeader);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(hTTPHeader);
                return this;
            }

            public Builder addHeaders(int i14, HTTPHeader.Builder builder) {
                RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> repeatedFieldBuilderV3 = this.headersBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureHeadersIsMutable();
                    this.headers_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof RawResourceResponse) {
                    return mergeFrom((RawResourceResponse) message);
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
                                    if (ResponseStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    this.httpStatusCode_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.resourceData_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getXferDataFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag != 42) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    HTTPHeader hTTPHeader = (HTTPHeader) codedInputStream.readMessage(HTTPHeader.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<HTTPHeader, HTTPHeader.Builder, HTTPHeaderOrBuilder> repeatedFieldBuilderV3 = this.headersBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureHeadersIsMutable();
                                        this.headers_.add(hTTPHeader);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(hTTPHeader);
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
        public RawResourceResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static RawResourceResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RawResourceResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RawResourceResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static RawResourceResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static RawResourceResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static RawResourceResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static RawResourceResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static RawResourceResponse parseFrom(InputStream inputStream) {
            return (RawResourceResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static RawResourceResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RawResourceResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RawResourceResponse parseFrom(CodedInputStream codedInputStream) {
            return (RawResourceResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static RawResourceResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RawResourceResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private RawResourceResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.httpStatusCode_ = 0;
            this.resourceData_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            UNKNOWN(0),
            OK(100),
            NETWORK_REQUEST_TIMED_OUT(200),
            FILE_TOO_LARGE(300),
            DATA_TRANSFER_ITEM_FAILURE(400),
            DECRYPTION_FAILURE(500);

            public static final int DATA_TRANSFER_ITEM_FAILURE_VALUE = 400;
            public static final int DECRYPTION_FAILURE_VALUE = 500;
            public static final int FILE_TOO_LARGE_VALUE = 300;
            public static final int NETWORK_REQUEST_TIMED_OUT_VALUE = 200;
            public static final int OK_VALUE = 100;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDIConnectIQHTTPProto.RawResourceResponse.ResponseStatus.1
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
                if (i14 == 100) {
                    return OK;
                }
                if (i14 == 200) {
                    return NETWORK_REQUEST_TIMED_OUT;
                }
                if (i14 == 300) {
                    return FILE_TOO_LARGE;
                }
                if (i14 == 400) {
                    return DATA_TRANSFER_ITEM_FAILURE;
                }
                if (i14 != 500) {
                    return null;
                }
                return DECRYPTION_FAILURE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return RawResourceResponse.getDescriptor().getEnumTypes().get(0);
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

        public /* synthetic */ RawResourceResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class CapabilitiesRequest extends GeneratedMessageV3 implements CapabilitiesRequestOrBuilder {
        public static final int CONNECT_IQ_REQUEST_FIELD_NUMBER = 13;
        public static final int ENCRYPTION_KEY_FIELD_NUMBER = 2;
        public static final int SERVICE_VERSION_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString encryptionKey_;
        private byte memoizedIsInitialized;
        private int serviceVersion_;
        private static final CapabilitiesRequest DEFAULT_INSTANCE = new CapabilitiesRequest();

        @Deprecated
        public static final Parser<CapabilitiesRequest> PARSER = new AbstractParser<CapabilitiesRequest>() { // from class: com.garmin.proto.generated.GDIConnectIQHTTPProto.CapabilitiesRequest.1
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
        public static final GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesRequest, CapabilitiesRequest> connectIqRequest = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, CapabilitiesRequest.class, getDefaultInstance());

        private CapabilitiesRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.serviceVersion_ = 0;
            this.encryptionKey_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_CapabilitiesRequest_descriptor;
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
            if (hasServiceVersion() != capabilitiesRequest.hasServiceVersion()) {
                return false;
            }
            if ((!hasServiceVersion() || getServiceVersion() == capabilitiesRequest.getServiceVersion()) && hasEncryptionKey() == capabilitiesRequest.hasEncryptionKey()) {
                return (!hasEncryptionKey() || getEncryptionKey().equals(capabilitiesRequest.getEncryptionKey())) && getUnknownFields().equals(capabilitiesRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.CapabilitiesRequestOrBuilder
        public ByteString getEncryptionKey() {
            return this.encryptionKey_;
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
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.serviceVersion_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBytesSize(2, this.encryptionKey_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.CapabilitiesRequestOrBuilder
        public int getServiceVersion() {
            return this.serviceVersion_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.CapabilitiesRequestOrBuilder
        public boolean hasEncryptionKey() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.CapabilitiesRequestOrBuilder
        public boolean hasServiceVersion() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasServiceVersion()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getServiceVersion();
            }
            if (hasEncryptionKey()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getEncryptionKey().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
                codedOutputStream.writeUInt32(1, this.serviceVersion_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBytes(2, this.encryptionKey_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesRequestOrBuilder {
            private int bitField0_;
            private ByteString encryptionKey_;
            private int serviceVersion_;

            private Builder() {
                this.encryptionKey_ = ByteString.EMPTY;
            }

            private void buildPartial0(CapabilitiesRequest capabilitiesRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    capabilitiesRequest.serviceVersion_ = this.serviceVersion_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    capabilitiesRequest.encryptionKey_ = this.encryptionKey_;
                    i14 |= 2;
                }
                capabilitiesRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_CapabilitiesRequest_descriptor;
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
                this.serviceVersion_ = 0;
                this.encryptionKey_ = ByteString.EMPTY;
                return this;
            }

            public Builder clearEncryptionKey() {
                this.bitField0_ &= -3;
                this.encryptionKey_ = CapabilitiesRequest.getDefaultInstance().getEncryptionKey();
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

            public Builder clearServiceVersion() {
                this.bitField0_ &= -2;
                this.serviceVersion_ = 0;
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
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_CapabilitiesRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.CapabilitiesRequestOrBuilder
            public ByteString getEncryptionKey() {
                return this.encryptionKey_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.CapabilitiesRequestOrBuilder
            public int getServiceVersion() {
                return this.serviceVersion_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.CapabilitiesRequestOrBuilder
            public boolean hasEncryptionKey() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.CapabilitiesRequestOrBuilder
            public boolean hasServiceVersion() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
                                    this.serviceVersion_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.encryptionKey_ = codedInputStream.readBytes();
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

            public Builder setEncryptionKey(ByteString byteString) {
                byteString.getClass();
                this.encryptionKey_ = byteString;
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

            public Builder setServiceVersion(int i14) {
                this.serviceVersion_ = i14;
                this.bitField0_ |= 1;
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
                this.encryptionKey_ = ByteString.EMPTY;
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
                if (capabilitiesRequest.hasServiceVersion()) {
                    setServiceVersion(capabilitiesRequest.getServiceVersion());
                }
                if (capabilitiesRequest.hasEncryptionKey()) {
                    setEncryptionKey(capabilitiesRequest.getEncryptionKey());
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

        public /* synthetic */ CapabilitiesRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CapabilitiesRequest parseFrom(InputStream inputStream) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private CapabilitiesRequest() {
            this.serviceVersion_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.encryptionKey_ = byteString;
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

    public static final class ConnectIQHTTPRequest extends GeneratedMessageV3 implements ConnectIQHTTPRequestOrBuilder {
        public static final int COMPRESS_RESPONSE_BODY_FIELD_NUMBER = 7;
        public static final int HTTP_BODY_FIELD_NUMBER = 4;
        public static final int HTTP_HEADER_FIELDS_FIELD_NUMBER = 3;
        public static final int HTTP_METHOD_FIELD_NUMBER = 2;
        public static final int INCLUDE_HTTP_HEADER_FIELDS_IN_RESPONSE_FIELD_NUMBER = 6;
        public static final int MAX_RESPONSE_LENGTH_FIELD_NUMBER = 5;
        public static final int RESPONSE_TYPE_FIELD_NUMBER = 8;
        public static final int URL_FIELD_NUMBER = 1;
        public static final int VERSION_FIELD_NUMBER = 9;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean compressResponseBody_;
        private ByteString httpBody_;
        private ByteString httpHeaderFields_;
        private int httpMethod_;
        private boolean includeHttpHeaderFieldsInResponse_;
        private int maxResponseLength_;
        private byte memoizedIsInitialized;
        private int responseType_;
        private volatile Object url_;
        private int version_;
        private static final ConnectIQHTTPRequest DEFAULT_INSTANCE = new ConnectIQHTTPRequest();

        @Deprecated
        public static final Parser<ConnectIQHTTPRequest> PARSER = new AbstractParser<ConnectIQHTTPRequest>() { // from class: com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequest.1
            @Override // com.google.protobuf.Parser
            public ConnectIQHTTPRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConnectIQHTTPRequest.newBuilder();
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

        private ConnectIQHTTPRequest() {
            this.url_ = "";
            this.httpMethod_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.httpHeaderFields_ = byteString;
            this.httpBody_ = byteString;
            this.maxResponseLength_ = 0;
            this.includeHttpHeaderFieldsInResponse_ = true;
            this.compressResponseBody_ = false;
            this.responseType_ = 0;
            this.version_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.url_ = "";
            this.httpMethod_ = 0;
            this.httpHeaderFields_ = byteString;
            this.httpBody_ = byteString;
            this.includeHttpHeaderFieldsInResponse_ = true;
            this.responseType_ = 0;
            this.version_ = 0;
        }

        public static ConnectIQHTTPRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQHTTPRequest_descriptor;
        }

        public static Builder newBuilder(ConnectIQHTTPRequest connectIQHTTPRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(connectIQHTTPRequest);
        }

        public static ConnectIQHTTPRequest parseDelimitedFrom(InputStream inputStream) {
            return (ConnectIQHTTPRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConnectIQHTTPRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConnectIQHTTPRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConnectIQHTTPRequest)) {
                return super.equals(obj);
            }
            ConnectIQHTTPRequest connectIQHTTPRequest = (ConnectIQHTTPRequest) obj;
            if (hasUrl() != connectIQHTTPRequest.hasUrl()) {
                return false;
            }
            if ((hasUrl() && !getUrl().equals(connectIQHTTPRequest.getUrl())) || hasHttpMethod() != connectIQHTTPRequest.hasHttpMethod()) {
                return false;
            }
            if ((hasHttpMethod() && this.httpMethod_ != connectIQHTTPRequest.httpMethod_) || hasHttpHeaderFields() != connectIQHTTPRequest.hasHttpHeaderFields()) {
                return false;
            }
            if ((hasHttpHeaderFields() && !getHttpHeaderFields().equals(connectIQHTTPRequest.getHttpHeaderFields())) || hasHttpBody() != connectIQHTTPRequest.hasHttpBody()) {
                return false;
            }
            if ((hasHttpBody() && !getHttpBody().equals(connectIQHTTPRequest.getHttpBody())) || hasMaxResponseLength() != connectIQHTTPRequest.hasMaxResponseLength()) {
                return false;
            }
            if ((hasMaxResponseLength() && getMaxResponseLength() != connectIQHTTPRequest.getMaxResponseLength()) || hasIncludeHttpHeaderFieldsInResponse() != connectIQHTTPRequest.hasIncludeHttpHeaderFieldsInResponse()) {
                return false;
            }
            if ((hasIncludeHttpHeaderFieldsInResponse() && getIncludeHttpHeaderFieldsInResponse() != connectIQHTTPRequest.getIncludeHttpHeaderFieldsInResponse()) || hasCompressResponseBody() != connectIQHTTPRequest.hasCompressResponseBody()) {
                return false;
            }
            if ((hasCompressResponseBody() && getCompressResponseBody() != connectIQHTTPRequest.getCompressResponseBody()) || hasResponseType() != connectIQHTTPRequest.hasResponseType()) {
                return false;
            }
            if ((!hasResponseType() || this.responseType_ == connectIQHTTPRequest.responseType_) && hasVersion() == connectIQHTTPRequest.hasVersion()) {
                return (!hasVersion() || this.version_ == connectIQHTTPRequest.version_) && getUnknownFields().equals(connectIQHTTPRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequestOrBuilder
        public boolean getCompressResponseBody() {
            return this.compressResponseBody_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequestOrBuilder
        public ByteString getHttpBody() {
            return this.httpBody_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequestOrBuilder
        public ByteString getHttpHeaderFields() {
            return this.httpHeaderFields_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequestOrBuilder
        public HTTPMethod getHttpMethod() {
            HTTPMethod hTTPMethodForNumber = HTTPMethod.forNumber(this.httpMethod_);
            return hTTPMethodForNumber == null ? HTTPMethod.UNKNOWN : hTTPMethodForNumber;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequestOrBuilder
        public boolean getIncludeHttpHeaderFieldsInResponse() {
            return this.includeHttpHeaderFieldsInResponse_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequestOrBuilder
        public int getMaxResponseLength() {
            return this.maxResponseLength_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConnectIQHTTPRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequestOrBuilder
        public ResponseType getResponseType() {
            ResponseType responseTypeForNumber = ResponseType.forNumber(this.responseType_);
            return responseTypeForNumber == null ? ResponseType.JSON : responseTypeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.url_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(2, this.httpMethod_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.computeBytesSize(3, this.httpHeaderFields_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += CodedOutputStream.computeBytesSize(4, this.httpBody_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(5, this.maxResponseLength_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(6, this.includeHttpHeaderFieldsInResponse_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(7, this.compressResponseBody_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(8, this.responseType_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(9, this.version_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequestOrBuilder
        public String getUrl() {
            Object obj = this.url_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.url_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequestOrBuilder
        public ByteString getUrlBytes() {
            Object obj = this.url_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.url_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequestOrBuilder
        public Version getVersion() {
            Version versionForNumber = Version.forNumber(this.version_);
            return versionForNumber == null ? Version.VERSION_1 : versionForNumber;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequestOrBuilder
        public boolean hasCompressResponseBody() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequestOrBuilder
        public boolean hasHttpBody() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequestOrBuilder
        public boolean hasHttpHeaderFields() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequestOrBuilder
        public boolean hasHttpMethod() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequestOrBuilder
        public boolean hasIncludeHttpHeaderFieldsInResponse() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequestOrBuilder
        public boolean hasMaxResponseLength() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequestOrBuilder
        public boolean hasResponseType() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequestOrBuilder
        public boolean hasUrl() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequestOrBuilder
        public boolean hasVersion() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasUrl()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getUrl().hashCode();
            }
            if (hasHttpMethod()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.httpMethod_;
            }
            if (hasHttpHeaderFields()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getHttpHeaderFields().hashCode();
            }
            if (hasHttpBody()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getHttpBody().hashCode();
            }
            if (hasMaxResponseLength()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getMaxResponseLength();
            }
            if (hasIncludeHttpHeaderFieldsInResponse()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + Internal.hashBoolean(getIncludeHttpHeaderFieldsInResponse());
            }
            if (hasCompressResponseBody()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + Internal.hashBoolean(getCompressResponseBody());
            }
            if (hasResponseType()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + this.responseType_;
            }
            if (hasVersion()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + this.version_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQHTTPRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectIQHTTPRequest.class, Builder.class);
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
            if (hasUrl()) {
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
            return new ConnectIQHTTPRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.url_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.httpMethod_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBytes(3, this.httpHeaderFields_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeBytes(4, this.httpBody_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.maxResponseLength_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeBool(6, this.includeHttpHeaderFieldsInResponse_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeBool(7, this.compressResponseBody_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeEnum(8, this.responseType_);
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeEnum(9, this.version_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConnectIQHTTPRequestOrBuilder {
            private int bitField0_;
            private boolean compressResponseBody_;
            private ByteString httpBody_;
            private ByteString httpHeaderFields_;
            private int httpMethod_;
            private boolean includeHttpHeaderFieldsInResponse_;
            private int maxResponseLength_;
            private int responseType_;
            private Object url_;
            private int version_;

            private Builder() {
                this.url_ = "";
                this.httpMethod_ = 0;
                ByteString byteString = ByteString.EMPTY;
                this.httpHeaderFields_ = byteString;
                this.httpBody_ = byteString;
                this.includeHttpHeaderFieldsInResponse_ = true;
                this.responseType_ = 0;
                this.version_ = 0;
            }

            private void buildPartial0(ConnectIQHTTPRequest connectIQHTTPRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    connectIQHTTPRequest.url_ = this.url_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    connectIQHTTPRequest.httpMethod_ = this.httpMethod_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    connectIQHTTPRequest.httpHeaderFields_ = this.httpHeaderFields_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    connectIQHTTPRequest.httpBody_ = this.httpBody_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    connectIQHTTPRequest.maxResponseLength_ = this.maxResponseLength_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    connectIQHTTPRequest.includeHttpHeaderFieldsInResponse_ = this.includeHttpHeaderFieldsInResponse_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    connectIQHTTPRequest.compressResponseBody_ = this.compressResponseBody_;
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    connectIQHTTPRequest.responseType_ = this.responseType_;
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    connectIQHTTPRequest.version_ = this.version_;
                    i14 |= 256;
                }
                connectIQHTTPRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQHTTPRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectIQHTTPRequest build() {
                ConnectIQHTTPRequest connectIQHTTPRequestBuildPartial = buildPartial();
                if (connectIQHTTPRequestBuildPartial.isInitialized()) {
                    return connectIQHTTPRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) connectIQHTTPRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectIQHTTPRequest buildPartial() {
                ConnectIQHTTPRequest connectIQHTTPRequest = new ConnectIQHTTPRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(connectIQHTTPRequest);
                }
                onBuilt();
                return connectIQHTTPRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.url_ = "";
                this.httpMethod_ = 0;
                ByteString byteString = ByteString.EMPTY;
                this.httpHeaderFields_ = byteString;
                this.httpBody_ = byteString;
                this.maxResponseLength_ = 0;
                this.includeHttpHeaderFieldsInResponse_ = true;
                this.compressResponseBody_ = false;
                this.responseType_ = 0;
                this.version_ = 0;
                return this;
            }

            public Builder clearCompressResponseBody() {
                this.bitField0_ &= -65;
                this.compressResponseBody_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearHttpBody() {
                this.bitField0_ &= -9;
                this.httpBody_ = ConnectIQHTTPRequest.getDefaultInstance().getHttpBody();
                onChanged();
                return this;
            }

            public Builder clearHttpHeaderFields() {
                this.bitField0_ &= -5;
                this.httpHeaderFields_ = ConnectIQHTTPRequest.getDefaultInstance().getHttpHeaderFields();
                onChanged();
                return this;
            }

            public Builder clearHttpMethod() {
                this.bitField0_ &= -3;
                this.httpMethod_ = 0;
                onChanged();
                return this;
            }

            public Builder clearIncludeHttpHeaderFieldsInResponse() {
                this.bitField0_ &= -33;
                this.includeHttpHeaderFieldsInResponse_ = true;
                onChanged();
                return this;
            }

            public Builder clearMaxResponseLength() {
                this.bitField0_ &= -17;
                this.maxResponseLength_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearResponseType() {
                this.bitField0_ &= -129;
                this.responseType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUrl() {
                this.url_ = ConnectIQHTTPRequest.getDefaultInstance().getUrl();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearVersion() {
                this.bitField0_ &= -257;
                this.version_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequestOrBuilder
            public boolean getCompressResponseBody() {
                return this.compressResponseBody_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQHTTPRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequestOrBuilder
            public ByteString getHttpBody() {
                return this.httpBody_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequestOrBuilder
            public ByteString getHttpHeaderFields() {
                return this.httpHeaderFields_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequestOrBuilder
            public HTTPMethod getHttpMethod() {
                HTTPMethod hTTPMethodForNumber = HTTPMethod.forNumber(this.httpMethod_);
                return hTTPMethodForNumber == null ? HTTPMethod.UNKNOWN : hTTPMethodForNumber;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequestOrBuilder
            public boolean getIncludeHttpHeaderFieldsInResponse() {
                return this.includeHttpHeaderFieldsInResponse_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequestOrBuilder
            public int getMaxResponseLength() {
                return this.maxResponseLength_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequestOrBuilder
            public ResponseType getResponseType() {
                ResponseType responseTypeForNumber = ResponseType.forNumber(this.responseType_);
                return responseTypeForNumber == null ? ResponseType.JSON : responseTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequestOrBuilder
            public String getUrl() {
                Object obj = this.url_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.url_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequestOrBuilder
            public ByteString getUrlBytes() {
                Object obj = this.url_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.url_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequestOrBuilder
            public Version getVersion() {
                Version versionForNumber = Version.forNumber(this.version_);
                return versionForNumber == null ? Version.VERSION_1 : versionForNumber;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequestOrBuilder
            public boolean hasCompressResponseBody() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequestOrBuilder
            public boolean hasHttpBody() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequestOrBuilder
            public boolean hasHttpHeaderFields() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequestOrBuilder
            public boolean hasHttpMethod() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequestOrBuilder
            public boolean hasIncludeHttpHeaderFieldsInResponse() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequestOrBuilder
            public boolean hasMaxResponseLength() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequestOrBuilder
            public boolean hasResponseType() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequestOrBuilder
            public boolean hasUrl() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequestOrBuilder
            public boolean hasVersion() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQHTTPRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectIQHTTPRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasUrl();
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
                                    this.url_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (HTTPMethod.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.httpMethod_ = i14;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (tag == 26) {
                                    this.httpHeaderFields_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.httpBody_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.maxResponseLength_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                } else if (tag == 48) {
                                    this.includeHttpHeaderFieldsInResponse_ = codedInputStream.readBool();
                                    this.bitField0_ |= 32;
                                } else if (tag == 56) {
                                    this.compressResponseBody_ = codedInputStream.readBool();
                                    this.bitField0_ |= 64;
                                } else if (tag == 64) {
                                    int i15 = codedInputStream.readEnum();
                                    if (ResponseType.forNumber(i15) == null) {
                                        mergeUnknownVarintField(8, i15);
                                    } else {
                                        this.responseType_ = i15;
                                        this.bitField0_ |= 128;
                                    }
                                } else if (tag == 72) {
                                    int i16 = codedInputStream.readEnum();
                                    if (Version.forNumber(i16) == null) {
                                        mergeUnknownVarintField(9, i16);
                                    } else {
                                        this.version_ = i16;
                                        this.bitField0_ |= 256;
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

            public Builder setCompressResponseBody(boolean z14) {
                this.compressResponseBody_ = z14;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setHttpBody(ByteString byteString) {
                byteString.getClass();
                this.httpBody_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setHttpHeaderFields(ByteString byteString) {
                byteString.getClass();
                this.httpHeaderFields_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setHttpMethod(HTTPMethod hTTPMethod) {
                hTTPMethod.getClass();
                this.bitField0_ |= 2;
                this.httpMethod_ = hTTPMethod.getNumber();
                onChanged();
                return this;
            }

            public Builder setIncludeHttpHeaderFieldsInResponse(boolean z14) {
                this.includeHttpHeaderFieldsInResponse_ = z14;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setMaxResponseLength(int i14) {
                this.maxResponseLength_ = i14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setResponseType(ResponseType responseType) {
                responseType.getClass();
                this.bitField0_ |= 128;
                this.responseType_ = responseType.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setUrl(String str) {
                str.getClass();
                this.url_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                byteString.getClass();
                this.url_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setVersion(Version version) {
                version.getClass();
                this.bitField0_ |= 256;
                this.version_ = version.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ConnectIQHTTPRequest getDefaultInstanceForType() {
                return ConnectIQHTTPRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.url_ = "";
                this.httpMethod_ = 0;
                ByteString byteString = ByteString.EMPTY;
                this.httpHeaderFields_ = byteString;
                this.httpBody_ = byteString;
                this.includeHttpHeaderFieldsInResponse_ = true;
                this.responseType_ = 0;
                this.version_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConnectIQHTTPRequest) {
                    return mergeFrom((ConnectIQHTTPRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConnectIQHTTPRequest connectIQHTTPRequest) {
                if (connectIQHTTPRequest == ConnectIQHTTPRequest.getDefaultInstance()) {
                    return this;
                }
                if (connectIQHTTPRequest.hasUrl()) {
                    this.url_ = connectIQHTTPRequest.url_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (connectIQHTTPRequest.hasHttpMethod()) {
                    setHttpMethod(connectIQHTTPRequest.getHttpMethod());
                }
                if (connectIQHTTPRequest.hasHttpHeaderFields()) {
                    setHttpHeaderFields(connectIQHTTPRequest.getHttpHeaderFields());
                }
                if (connectIQHTTPRequest.hasHttpBody()) {
                    setHttpBody(connectIQHTTPRequest.getHttpBody());
                }
                if (connectIQHTTPRequest.hasMaxResponseLength()) {
                    setMaxResponseLength(connectIQHTTPRequest.getMaxResponseLength());
                }
                if (connectIQHTTPRequest.hasIncludeHttpHeaderFieldsInResponse()) {
                    setIncludeHttpHeaderFieldsInResponse(connectIQHTTPRequest.getIncludeHttpHeaderFieldsInResponse());
                }
                if (connectIQHTTPRequest.hasCompressResponseBody()) {
                    setCompressResponseBody(connectIQHTTPRequest.getCompressResponseBody());
                }
                if (connectIQHTTPRequest.hasResponseType()) {
                    setResponseType(connectIQHTTPRequest.getResponseType());
                }
                if (connectIQHTTPRequest.hasVersion()) {
                    setVersion(connectIQHTTPRequest.getVersion());
                }
                mergeUnknownFields(connectIQHTTPRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConnectIQHTTPRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConnectIQHTTPRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQHTTPRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectIQHTTPRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConnectIQHTTPRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConnectIQHTTPRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConnectIQHTTPRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConnectIQHTTPRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConnectIQHTTPRequest parseFrom(InputStream inputStream) {
            return (ConnectIQHTTPRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConnectIQHTTPRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQHTTPRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectIQHTTPRequest parseFrom(CodedInputStream codedInputStream) {
            return (ConnectIQHTTPRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConnectIQHTTPRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQHTTPRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum HTTPMethod implements ProtocolMessageEnum {
            UNKNOWN(0),
            GET(1),
            PUT(2),
            POST(3),
            DELETE(4),
            PATCH(5),
            HEAD(6);

            public static final int DELETE_VALUE = 4;
            public static final int GET_VALUE = 1;
            public static final int HEAD_VALUE = 6;
            public static final int PATCH_VALUE = 5;
            public static final int POST_VALUE = 3;
            public static final int PUT_VALUE = 2;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<HTTPMethod> internalValueMap = new Internal.EnumLiteMap<HTTPMethod>() { // from class: com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequest.HTTPMethod.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public HTTPMethod findValueByNumber(int i14) {
                    return HTTPMethod.forNumber(i14);
                }
            };
            private static final HTTPMethod[] VALUES = values();

            HTTPMethod(int i14) {
                this.value = i14;
            }

            public static HTTPMethod forNumber(int i14) {
                switch (i14) {
                    case 0:
                        return UNKNOWN;
                    case 1:
                        return GET;
                    case 2:
                        return PUT;
                    case 3:
                        return POST;
                    case 4:
                        return DELETE;
                    case 5:
                        return PATCH;
                    case 6:
                        return HEAD;
                    default:
                        return null;
                }
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ConnectIQHTTPRequest.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<HTTPMethod> internalGetValueMap() {
                return internalValueMap;
            }

            public static HTTPMethod valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static HTTPMethod valueOf(int i14) {
                return forNumber(i14);
            }
        }

        public enum ResponseType implements ProtocolMessageEnum {
            JSON(0),
            URL_ENCODED(1),
            PLAIN_TEXT(2),
            XML(3);

            public static final int JSON_VALUE = 0;
            public static final int PLAIN_TEXT_VALUE = 2;
            public static final int URL_ENCODED_VALUE = 1;
            public static final int XML_VALUE = 3;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseType> internalValueMap = new Internal.EnumLiteMap<ResponseType>() { // from class: com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequest.ResponseType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ResponseType findValueByNumber(int i14) {
                    return ResponseType.forNumber(i14);
                }
            };
            private static final ResponseType[] VALUES = values();

            ResponseType(int i14) {
                this.value = i14;
            }

            public static ResponseType forNumber(int i14) {
                if (i14 == 0) {
                    return JSON;
                }
                if (i14 == 1) {
                    return URL_ENCODED;
                }
                if (i14 == 2) {
                    return PLAIN_TEXT;
                }
                if (i14 != 3) {
                    return null;
                }
                return XML;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ConnectIQHTTPRequest.getDescriptor().getEnumTypes().get(1);
            }

            public static Internal.EnumLiteMap<ResponseType> internalGetValueMap() {
                return internalValueMap;
            }

            public static ResponseType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static ResponseType valueOf(int i14) {
                return forNumber(i14);
            }
        }

        public enum Version implements ProtocolMessageEnum {
            VERSION_1(0),
            VERSION_2(1);

            public static final int VERSION_1_VALUE = 0;
            public static final int VERSION_2_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<Version> internalValueMap = new Internal.EnumLiteMap<Version>() { // from class: com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPRequest.Version.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Version findValueByNumber(int i14) {
                    return Version.forNumber(i14);
                }
            };
            private static final Version[] VALUES = values();

            Version(int i14) {
                this.value = i14;
            }

            public static Version forNumber(int i14) {
                if (i14 == 0) {
                    return VERSION_1;
                }
                if (i14 != 1) {
                    return null;
                }
                return VERSION_2;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ConnectIQHTTPRequest.getDescriptor().getEnumTypes().get(2);
            }

            public static Internal.EnumLiteMap<Version> internalGetValueMap() {
                return internalValueMap;
            }

            public static Version valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Version valueOf(int i14) {
                return forNumber(i14);
            }
        }

        private ConnectIQHTTPRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.url_ = "";
            this.httpMethod_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.httpHeaderFields_ = byteString;
            this.httpBody_ = byteString;
            this.maxResponseLength_ = 0;
            this.includeHttpHeaderFieldsInResponse_ = true;
            this.compressResponseBody_ = false;
            this.responseType_ = 0;
            this.version_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ ConnectIQHTTPRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class ConnectIQHTTPResponse extends GeneratedMessageV3 implements ConnectIQHTTPResponseOrBuilder {
        public static final int HTTP_BODY_FIELD_NUMBER = 3;
        public static final int HTTP_HEADER_FIELDS_FIELD_NUMBER = 4;
        public static final int HTTP_STATUS_CODE_FIELD_NUMBER = 2;
        public static final int INFLATED_SIZE_FIELD_NUMBER = 5;
        public static final int RESPONSE_TYPE_FIELD_NUMBER = 6;
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString httpBody_;
        private ByteString httpHeaderFields_;
        private int httpStatusCode_;
        private int inflatedSize_;
        private byte memoizedIsInitialized;
        private int responseType_;
        private int status_;
        private static final ConnectIQHTTPResponse DEFAULT_INSTANCE = new ConnectIQHTTPResponse();

        @Deprecated
        public static final Parser<ConnectIQHTTPResponse> PARSER = new AbstractParser<ConnectIQHTTPResponse>() { // from class: com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPResponse.1
            @Override // com.google.protobuf.Parser
            public ConnectIQHTTPResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConnectIQHTTPResponse.newBuilder();
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

        private ConnectIQHTTPResponse() {
            this.status_ = 0;
            this.httpStatusCode_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.inflatedSize_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
            this.httpBody_ = byteString;
            this.httpHeaderFields_ = byteString;
            this.responseType_ = 0;
        }

        public static ConnectIQHTTPResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQHTTPResponse_descriptor;
        }

        public static Builder newBuilder(ConnectIQHTTPResponse connectIQHTTPResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(connectIQHTTPResponse);
        }

        public static ConnectIQHTTPResponse parseDelimitedFrom(InputStream inputStream) {
            return (ConnectIQHTTPResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConnectIQHTTPResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConnectIQHTTPResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConnectIQHTTPResponse)) {
                return super.equals(obj);
            }
            ConnectIQHTTPResponse connectIQHTTPResponse = (ConnectIQHTTPResponse) obj;
            if (hasStatus() != connectIQHTTPResponse.hasStatus()) {
                return false;
            }
            if ((hasStatus() && this.status_ != connectIQHTTPResponse.status_) || hasHttpStatusCode() != connectIQHTTPResponse.hasHttpStatusCode()) {
                return false;
            }
            if ((hasHttpStatusCode() && getHttpStatusCode() != connectIQHTTPResponse.getHttpStatusCode()) || hasHttpBody() != connectIQHTTPResponse.hasHttpBody()) {
                return false;
            }
            if ((hasHttpBody() && !getHttpBody().equals(connectIQHTTPResponse.getHttpBody())) || hasHttpHeaderFields() != connectIQHTTPResponse.hasHttpHeaderFields()) {
                return false;
            }
            if ((hasHttpHeaderFields() && !getHttpHeaderFields().equals(connectIQHTTPResponse.getHttpHeaderFields())) || hasInflatedSize() != connectIQHTTPResponse.hasInflatedSize()) {
                return false;
            }
            if ((!hasInflatedSize() || getInflatedSize() == connectIQHTTPResponse.getInflatedSize()) && hasResponseType() == connectIQHTTPResponse.hasResponseType()) {
                return (!hasResponseType() || this.responseType_ == connectIQHTTPResponse.responseType_) && getUnknownFields().equals(connectIQHTTPResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPResponseOrBuilder
        public ByteString getHttpBody() {
            return this.httpBody_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPResponseOrBuilder
        public ByteString getHttpHeaderFields() {
            return this.httpHeaderFields_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPResponseOrBuilder
        public int getHttpStatusCode() {
            return this.httpStatusCode_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPResponseOrBuilder
        public int getInflatedSize() {
            return this.inflatedSize_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConnectIQHTTPResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPResponseOrBuilder
        public ConnectIQHTTPRequest.ResponseType getResponseType() {
            ConnectIQHTTPRequest.ResponseType responseTypeForNumber = ConnectIQHTTPRequest.ResponseType.forNumber(this.responseType_);
            return responseTypeForNumber == null ? ConnectIQHTTPRequest.ResponseType.JSON : responseTypeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.status_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeInt32Size(2, this.httpStatusCode_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeBytesSize(3, this.httpBody_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeEnumSize += CodedOutputStream.computeBytesSize(4, this.httpHeaderFields_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(5, this.inflatedSize_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(6, this.responseType_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.UNKNOWN : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPResponseOrBuilder
        public boolean hasHttpBody() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPResponseOrBuilder
        public boolean hasHttpHeaderFields() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPResponseOrBuilder
        public boolean hasHttpStatusCode() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPResponseOrBuilder
        public boolean hasInflatedSize() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPResponseOrBuilder
        public boolean hasResponseType() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPResponseOrBuilder
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
            if (hasHttpStatusCode()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getHttpStatusCode();
            }
            if (hasHttpBody()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getHttpBody().hashCode();
            }
            if (hasHttpHeaderFields()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getHttpHeaderFields().hashCode();
            }
            if (hasInflatedSize()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getInflatedSize();
            }
            if (hasResponseType()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + this.responseType_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQHTTPResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectIQHTTPResponse.class, Builder.class);
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
            return new ConnectIQHTTPResponse();
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
                codedOutputStream.writeInt32(2, this.httpStatusCode_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBytes(3, this.httpBody_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeBytes(4, this.httpHeaderFields_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.inflatedSize_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeEnum(6, this.responseType_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConnectIQHTTPResponseOrBuilder {
            private int bitField0_;
            private ByteString httpBody_;
            private ByteString httpHeaderFields_;
            private int httpStatusCode_;
            private int inflatedSize_;
            private int responseType_;
            private int status_;

            private Builder() {
                this.status_ = 0;
                ByteString byteString = ByteString.EMPTY;
                this.httpBody_ = byteString;
                this.httpHeaderFields_ = byteString;
                this.responseType_ = 0;
            }

            private void buildPartial0(ConnectIQHTTPResponse connectIQHTTPResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    connectIQHTTPResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    connectIQHTTPResponse.httpStatusCode_ = this.httpStatusCode_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    connectIQHTTPResponse.httpBody_ = this.httpBody_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    connectIQHTTPResponse.httpHeaderFields_ = this.httpHeaderFields_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    connectIQHTTPResponse.inflatedSize_ = this.inflatedSize_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    connectIQHTTPResponse.responseType_ = this.responseType_;
                    i14 |= 32;
                }
                connectIQHTTPResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQHTTPResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectIQHTTPResponse build() {
                ConnectIQHTTPResponse connectIQHTTPResponseBuildPartial = buildPartial();
                if (connectIQHTTPResponseBuildPartial.isInitialized()) {
                    return connectIQHTTPResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) connectIQHTTPResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectIQHTTPResponse buildPartial() {
                ConnectIQHTTPResponse connectIQHTTPResponse = new ConnectIQHTTPResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(connectIQHTTPResponse);
                }
                onBuilt();
                return connectIQHTTPResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                this.httpStatusCode_ = 0;
                ByteString byteString = ByteString.EMPTY;
                this.httpBody_ = byteString;
                this.httpHeaderFields_ = byteString;
                this.inflatedSize_ = 0;
                this.responseType_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearHttpBody() {
                this.bitField0_ &= -5;
                this.httpBody_ = ConnectIQHTTPResponse.getDefaultInstance().getHttpBody();
                onChanged();
                return this;
            }

            public Builder clearHttpHeaderFields() {
                this.bitField0_ &= -9;
                this.httpHeaderFields_ = ConnectIQHTTPResponse.getDefaultInstance().getHttpHeaderFields();
                onChanged();
                return this;
            }

            public Builder clearHttpStatusCode() {
                this.bitField0_ &= -3;
                this.httpStatusCode_ = 0;
                onChanged();
                return this;
            }

            public Builder clearInflatedSize() {
                this.bitField0_ &= -17;
                this.inflatedSize_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearResponseType() {
                this.bitField0_ &= -33;
                this.responseType_ = 0;
                onChanged();
                return this;
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
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQHTTPResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPResponseOrBuilder
            public ByteString getHttpBody() {
                return this.httpBody_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPResponseOrBuilder
            public ByteString getHttpHeaderFields() {
                return this.httpHeaderFields_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPResponseOrBuilder
            public int getHttpStatusCode() {
                return this.httpStatusCode_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPResponseOrBuilder
            public int getInflatedSize() {
                return this.inflatedSize_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPResponseOrBuilder
            public ConnectIQHTTPRequest.ResponseType getResponseType() {
                ConnectIQHTTPRequest.ResponseType responseTypeForNumber = ConnectIQHTTPRequest.ResponseType.forNumber(this.responseType_);
                return responseTypeForNumber == null ? ConnectIQHTTPRequest.ResponseType.JSON : responseTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.UNKNOWN : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPResponseOrBuilder
            public boolean hasHttpBody() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPResponseOrBuilder
            public boolean hasHttpHeaderFields() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPResponseOrBuilder
            public boolean hasHttpStatusCode() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPResponseOrBuilder
            public boolean hasInflatedSize() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPResponseOrBuilder
            public boolean hasResponseType() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQHTTPResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectIQHTTPResponse.class, Builder.class);
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
                                    this.httpStatusCode_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.httpBody_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.httpHeaderFields_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.inflatedSize_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                } else if (tag == 48) {
                                    int i15 = codedInputStream.readEnum();
                                    if (ConnectIQHTTPRequest.ResponseType.forNumber(i15) == null) {
                                        mergeUnknownVarintField(6, i15);
                                    } else {
                                        this.responseType_ = i15;
                                        this.bitField0_ |= 32;
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

            public Builder setHttpBody(ByteString byteString) {
                byteString.getClass();
                this.httpBody_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setHttpHeaderFields(ByteString byteString) {
                byteString.getClass();
                this.httpHeaderFields_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setHttpStatusCode(int i14) {
                this.httpStatusCode_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setInflatedSize(int i14) {
                this.inflatedSize_ = i14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setResponseType(ConnectIQHTTPRequest.ResponseType responseType) {
                responseType.getClass();
                this.bitField0_ |= 32;
                this.responseType_ = responseType.getNumber();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ConnectIQHTTPResponse getDefaultInstanceForType() {
                return ConnectIQHTTPResponse.getDefaultInstance();
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
                ByteString byteString = ByteString.EMPTY;
                this.httpBody_ = byteString;
                this.httpHeaderFields_ = byteString;
                this.responseType_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConnectIQHTTPResponse) {
                    return mergeFrom((ConnectIQHTTPResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConnectIQHTTPResponse connectIQHTTPResponse) {
                if (connectIQHTTPResponse == ConnectIQHTTPResponse.getDefaultInstance()) {
                    return this;
                }
                if (connectIQHTTPResponse.hasStatus()) {
                    setStatus(connectIQHTTPResponse.getStatus());
                }
                if (connectIQHTTPResponse.hasHttpStatusCode()) {
                    setHttpStatusCode(connectIQHTTPResponse.getHttpStatusCode());
                }
                if (connectIQHTTPResponse.hasHttpBody()) {
                    setHttpBody(connectIQHTTPResponse.getHttpBody());
                }
                if (connectIQHTTPResponse.hasHttpHeaderFields()) {
                    setHttpHeaderFields(connectIQHTTPResponse.getHttpHeaderFields());
                }
                if (connectIQHTTPResponse.hasInflatedSize()) {
                    setInflatedSize(connectIQHTTPResponse.getInflatedSize());
                }
                if (connectIQHTTPResponse.hasResponseType()) {
                    setResponseType(connectIQHTTPResponse.getResponseType());
                }
                mergeUnknownFields(connectIQHTTPResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConnectIQHTTPResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConnectIQHTTPResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQHTTPResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectIQHTTPResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConnectIQHTTPResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConnectIQHTTPResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConnectIQHTTPResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConnectIQHTTPResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConnectIQHTTPResponse parseFrom(InputStream inputStream) {
            return (ConnectIQHTTPResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConnectIQHTTPResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQHTTPResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectIQHTTPResponse parseFrom(CodedInputStream codedInputStream) {
            return (ConnectIQHTTPResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConnectIQHTTPResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQHTTPResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private ConnectIQHTTPResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.httpStatusCode_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.httpBody_ = byteString;
            this.httpHeaderFields_ = byteString;
            this.inflatedSize_ = 0;
            this.responseType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            UNKNOWN(0),
            OK(100),
            INVALID_HTTP_HEADER_FIELDS_IN_REQUEST(200),
            INVALID_HTTP_BODY_IN_REQUEST(201),
            INVALID_HTTP_METHOD_IN_REQUEST(202),
            NETWORK_REQUEST_TIMED_OUT(300),
            INVALID_HTTP_BODY_IN_NETWORK_RESPONSE(400),
            INVALID_HTTP_HEADER_FIELDS_IN_NETWORK_RESPONSE(INVALID_HTTP_HEADER_FIELDS_IN_NETWORK_RESPONSE_VALUE),
            NETWORK_RESPONSE_TOO_LARGE(402),
            INSECURE_REQUEST(1001);

            public static final int INSECURE_REQUEST_VALUE = 1001;
            public static final int INVALID_HTTP_BODY_IN_NETWORK_RESPONSE_VALUE = 400;
            public static final int INVALID_HTTP_BODY_IN_REQUEST_VALUE = 201;
            public static final int INVALID_HTTP_HEADER_FIELDS_IN_NETWORK_RESPONSE_VALUE = 401;
            public static final int INVALID_HTTP_HEADER_FIELDS_IN_REQUEST_VALUE = 200;
            public static final int INVALID_HTTP_METHOD_IN_REQUEST_VALUE = 202;
            public static final int NETWORK_REQUEST_TIMED_OUT_VALUE = 300;
            public static final int NETWORK_RESPONSE_TOO_LARGE_VALUE = 402;
            public static final int OK_VALUE = 100;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPResponse.ResponseStatus.1
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
                if (i14 == 100) {
                    return OK;
                }
                if (i14 == 300) {
                    return NETWORK_REQUEST_TIMED_OUT;
                }
                if (i14 == 1001) {
                    return INSECURE_REQUEST;
                }
                switch (i14) {
                    case 200:
                        return INVALID_HTTP_HEADER_FIELDS_IN_REQUEST;
                    case 201:
                        return INVALID_HTTP_BODY_IN_REQUEST;
                    case 202:
                        return INVALID_HTTP_METHOD_IN_REQUEST;
                    default:
                        switch (i14) {
                            case 400:
                                return INVALID_HTTP_BODY_IN_NETWORK_RESPONSE;
                            case INVALID_HTTP_HEADER_FIELDS_IN_NETWORK_RESPONSE_VALUE:
                                return INVALID_HTTP_HEADER_FIELDS_IN_NETWORK_RESPONSE;
                            case 402:
                                return NETWORK_RESPONSE_TOO_LARGE;
                            default:
                                return null;
                        }
                }
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ConnectIQHTTPResponse.getDescriptor().getEnumTypes().get(0);
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

        public /* synthetic */ ConnectIQHTTPResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class ConnectIQHTTPService extends GeneratedMessageV3 implements ConnectIQHTTPServiceOrBuilder {
        public static final int CONNECT_IQ_HTTP_REQUEST_FIELD_NUMBER = 1;
        public static final int CONNECT_IQ_HTTP_RESPONSE_FIELD_NUMBER = 2;
        public static final int CONNECT_IQ_IMAGE_REQUEST_FIELD_NUMBER = 3;
        public static final int CONNECT_IQ_IMAGE_RESPONSE_FIELD_NUMBER = 4;
        public static final int CONNECT_IQ_OAUTH_COMPLETE_REQUEST_FIELD_NUMBER = 9;
        public static final int CONNECT_IQ_OAUTH_COMPLETE_RESPONSE_FIELD_NUMBER = 10;
        public static final int CONNECT_IQ_OAUTH_REQUEST_FIELD_NUMBER = 7;
        public static final int CONNECT_IQ_OAUTH_RESPONSE_FIELD_NUMBER = 8;
        public static final int OPEN_WEBPAGE_NOTIFICATION_FIELD_NUMBER = 11;
        public static final int RAW_RESOURCE_REQUEST_FIELD_NUMBER = 5;
        public static final int RAW_RESOURCE_RESPONSE_FIELD_NUMBER = 6;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ConnectIQHTTPRequest connectIqHttpRequest_;
        private ConnectIQHTTPResponse connectIqHttpResponse_;
        private ConnectIQImageRequest connectIqImageRequest_;
        private ConnectIQImageResponse connectIqImageResponse_;
        private ConnectIQOAuthCompleteRequest connectIqOauthCompleteRequest_;
        private ConnectIQOAuthCompleteResponse connectIqOauthCompleteResponse_;
        private ConnectIQOAuthRequest connectIqOauthRequest_;
        private ConnectIQOAuthResponse connectIqOauthResponse_;
        private byte memoizedIsInitialized;
        private OpenWebpageNotification openWebpageNotification_;
        private RawResourceRequest rawResourceRequest_;
        private RawResourceResponse rawResourceResponse_;
        private static final ConnectIQHTTPService DEFAULT_INSTANCE = new ConnectIQHTTPService();

        @Deprecated
        public static final Parser<ConnectIQHTTPService> PARSER = new AbstractParser<ConnectIQHTTPService>() { // from class: com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPService.1
            @Override // com.google.protobuf.Parser
            public ConnectIQHTTPService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConnectIQHTTPService.newBuilder();
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

        private ConnectIQHTTPService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConnectIQHTTPService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQHTTPService_descriptor;
        }

        public static Builder newBuilder(ConnectIQHTTPService connectIQHTTPService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(connectIQHTTPService);
        }

        public static ConnectIQHTTPService parseDelimitedFrom(InputStream inputStream) {
            return (ConnectIQHTTPService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConnectIQHTTPService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConnectIQHTTPService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConnectIQHTTPService)) {
                return super.equals(obj);
            }
            ConnectIQHTTPService connectIQHTTPService = (ConnectIQHTTPService) obj;
            if (hasConnectIqHttpRequest() != connectIQHTTPService.hasConnectIqHttpRequest()) {
                return false;
            }
            if ((hasConnectIqHttpRequest() && !getConnectIqHttpRequest().equals(connectIQHTTPService.getConnectIqHttpRequest())) || hasConnectIqHttpResponse() != connectIQHTTPService.hasConnectIqHttpResponse()) {
                return false;
            }
            if ((hasConnectIqHttpResponse() && !getConnectIqHttpResponse().equals(connectIQHTTPService.getConnectIqHttpResponse())) || hasConnectIqImageRequest() != connectIQHTTPService.hasConnectIqImageRequest()) {
                return false;
            }
            if ((hasConnectIqImageRequest() && !getConnectIqImageRequest().equals(connectIQHTTPService.getConnectIqImageRequest())) || hasConnectIqImageResponse() != connectIQHTTPService.hasConnectIqImageResponse()) {
                return false;
            }
            if ((hasConnectIqImageResponse() && !getConnectIqImageResponse().equals(connectIQHTTPService.getConnectIqImageResponse())) || hasRawResourceRequest() != connectIQHTTPService.hasRawResourceRequest()) {
                return false;
            }
            if ((hasRawResourceRequest() && !getRawResourceRequest().equals(connectIQHTTPService.getRawResourceRequest())) || hasRawResourceResponse() != connectIQHTTPService.hasRawResourceResponse()) {
                return false;
            }
            if ((hasRawResourceResponse() && !getRawResourceResponse().equals(connectIQHTTPService.getRawResourceResponse())) || hasConnectIqOauthRequest() != connectIQHTTPService.hasConnectIqOauthRequest()) {
                return false;
            }
            if ((hasConnectIqOauthRequest() && !getConnectIqOauthRequest().equals(connectIQHTTPService.getConnectIqOauthRequest())) || hasConnectIqOauthResponse() != connectIQHTTPService.hasConnectIqOauthResponse()) {
                return false;
            }
            if ((hasConnectIqOauthResponse() && !getConnectIqOauthResponse().equals(connectIQHTTPService.getConnectIqOauthResponse())) || hasConnectIqOauthCompleteRequest() != connectIQHTTPService.hasConnectIqOauthCompleteRequest()) {
                return false;
            }
            if ((hasConnectIqOauthCompleteRequest() && !getConnectIqOauthCompleteRequest().equals(connectIQHTTPService.getConnectIqOauthCompleteRequest())) || hasConnectIqOauthCompleteResponse() != connectIQHTTPService.hasConnectIqOauthCompleteResponse()) {
                return false;
            }
            if ((!hasConnectIqOauthCompleteResponse() || getConnectIqOauthCompleteResponse().equals(connectIQHTTPService.getConnectIqOauthCompleteResponse())) && hasOpenWebpageNotification() == connectIQHTTPService.hasOpenWebpageNotification()) {
                return (!hasOpenWebpageNotification() || getOpenWebpageNotification().equals(connectIQHTTPService.getOpenWebpageNotification())) && getUnknownFields().equals(connectIQHTTPService.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
        public ConnectIQHTTPRequest getConnectIqHttpRequest() {
            ConnectIQHTTPRequest connectIQHTTPRequest = this.connectIqHttpRequest_;
            return connectIQHTTPRequest == null ? ConnectIQHTTPRequest.getDefaultInstance() : connectIQHTTPRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
        public ConnectIQHTTPRequestOrBuilder getConnectIqHttpRequestOrBuilder() {
            ConnectIQHTTPRequest connectIQHTTPRequest = this.connectIqHttpRequest_;
            return connectIQHTTPRequest == null ? ConnectIQHTTPRequest.getDefaultInstance() : connectIQHTTPRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
        public ConnectIQHTTPResponse getConnectIqHttpResponse() {
            ConnectIQHTTPResponse connectIQHTTPResponse = this.connectIqHttpResponse_;
            return connectIQHTTPResponse == null ? ConnectIQHTTPResponse.getDefaultInstance() : connectIQHTTPResponse;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
        public ConnectIQHTTPResponseOrBuilder getConnectIqHttpResponseOrBuilder() {
            ConnectIQHTTPResponse connectIQHTTPResponse = this.connectIqHttpResponse_;
            return connectIQHTTPResponse == null ? ConnectIQHTTPResponse.getDefaultInstance() : connectIQHTTPResponse;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
        public ConnectIQImageRequest getConnectIqImageRequest() {
            ConnectIQImageRequest connectIQImageRequest = this.connectIqImageRequest_;
            return connectIQImageRequest == null ? ConnectIQImageRequest.getDefaultInstance() : connectIQImageRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
        public ConnectIQImageRequestOrBuilder getConnectIqImageRequestOrBuilder() {
            ConnectIQImageRequest connectIQImageRequest = this.connectIqImageRequest_;
            return connectIQImageRequest == null ? ConnectIQImageRequest.getDefaultInstance() : connectIQImageRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
        public ConnectIQImageResponse getConnectIqImageResponse() {
            ConnectIQImageResponse connectIQImageResponse = this.connectIqImageResponse_;
            return connectIQImageResponse == null ? ConnectIQImageResponse.getDefaultInstance() : connectIQImageResponse;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
        public ConnectIQImageResponseOrBuilder getConnectIqImageResponseOrBuilder() {
            ConnectIQImageResponse connectIQImageResponse = this.connectIqImageResponse_;
            return connectIQImageResponse == null ? ConnectIQImageResponse.getDefaultInstance() : connectIQImageResponse;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
        public ConnectIQOAuthCompleteRequest getConnectIqOauthCompleteRequest() {
            ConnectIQOAuthCompleteRequest connectIQOAuthCompleteRequest = this.connectIqOauthCompleteRequest_;
            return connectIQOAuthCompleteRequest == null ? ConnectIQOAuthCompleteRequest.getDefaultInstance() : connectIQOAuthCompleteRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
        public ConnectIQOAuthCompleteRequestOrBuilder getConnectIqOauthCompleteRequestOrBuilder() {
            ConnectIQOAuthCompleteRequest connectIQOAuthCompleteRequest = this.connectIqOauthCompleteRequest_;
            return connectIQOAuthCompleteRequest == null ? ConnectIQOAuthCompleteRequest.getDefaultInstance() : connectIQOAuthCompleteRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
        public ConnectIQOAuthCompleteResponse getConnectIqOauthCompleteResponse() {
            ConnectIQOAuthCompleteResponse connectIQOAuthCompleteResponse = this.connectIqOauthCompleteResponse_;
            return connectIQOAuthCompleteResponse == null ? ConnectIQOAuthCompleteResponse.getDefaultInstance() : connectIQOAuthCompleteResponse;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
        public ConnectIQOAuthCompleteResponseOrBuilder getConnectIqOauthCompleteResponseOrBuilder() {
            ConnectIQOAuthCompleteResponse connectIQOAuthCompleteResponse = this.connectIqOauthCompleteResponse_;
            return connectIQOAuthCompleteResponse == null ? ConnectIQOAuthCompleteResponse.getDefaultInstance() : connectIQOAuthCompleteResponse;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
        public ConnectIQOAuthRequest getConnectIqOauthRequest() {
            ConnectIQOAuthRequest connectIQOAuthRequest = this.connectIqOauthRequest_;
            return connectIQOAuthRequest == null ? ConnectIQOAuthRequest.getDefaultInstance() : connectIQOAuthRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
        public ConnectIQOAuthRequestOrBuilder getConnectIqOauthRequestOrBuilder() {
            ConnectIQOAuthRequest connectIQOAuthRequest = this.connectIqOauthRequest_;
            return connectIQOAuthRequest == null ? ConnectIQOAuthRequest.getDefaultInstance() : connectIQOAuthRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
        public ConnectIQOAuthResponse getConnectIqOauthResponse() {
            ConnectIQOAuthResponse connectIQOAuthResponse = this.connectIqOauthResponse_;
            return connectIQOAuthResponse == null ? ConnectIQOAuthResponse.getDefaultInstance() : connectIQOAuthResponse;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
        public ConnectIQOAuthResponseOrBuilder getConnectIqOauthResponseOrBuilder() {
            ConnectIQOAuthResponse connectIQOAuthResponse = this.connectIqOauthResponse_;
            return connectIQOAuthResponse == null ? ConnectIQOAuthResponse.getDefaultInstance() : connectIQOAuthResponse;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
        public OpenWebpageNotification getOpenWebpageNotification() {
            OpenWebpageNotification openWebpageNotification = this.openWebpageNotification_;
            return openWebpageNotification == null ? OpenWebpageNotification.getDefaultInstance() : openWebpageNotification;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
        public OpenWebpageNotificationOrBuilder getOpenWebpageNotificationOrBuilder() {
            OpenWebpageNotification openWebpageNotification = this.openWebpageNotification_;
            return openWebpageNotification == null ? OpenWebpageNotification.getDefaultInstance() : openWebpageNotification;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConnectIQHTTPService> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
        public RawResourceRequest getRawResourceRequest() {
            RawResourceRequest rawResourceRequest = this.rawResourceRequest_;
            return rawResourceRequest == null ? RawResourceRequest.getDefaultInstance() : rawResourceRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
        public RawResourceRequestOrBuilder getRawResourceRequestOrBuilder() {
            RawResourceRequest rawResourceRequest = this.rawResourceRequest_;
            return rawResourceRequest == null ? RawResourceRequest.getDefaultInstance() : rawResourceRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
        public RawResourceResponse getRawResourceResponse() {
            RawResourceResponse rawResourceResponse = this.rawResourceResponse_;
            return rawResourceResponse == null ? RawResourceResponse.getDefaultInstance() : rawResourceResponse;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
        public RawResourceResponseOrBuilder getRawResourceResponseOrBuilder() {
            RawResourceResponse rawResourceResponse = this.rawResourceResponse_;
            return rawResourceResponse == null ? RawResourceResponse.getDefaultInstance() : rawResourceResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getConnectIqHttpRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getConnectIqHttpResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getConnectIqImageRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getConnectIqImageResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getRawResourceRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getRawResourceResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getConnectIqOauthRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, getConnectIqOauthResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(9, getConnectIqOauthCompleteRequest());
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(10, getConnectIqOauthCompleteResponse());
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(11, getOpenWebpageNotification());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
        public boolean hasConnectIqHttpRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
        public boolean hasConnectIqHttpResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
        public boolean hasConnectIqImageRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
        public boolean hasConnectIqImageResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
        public boolean hasConnectIqOauthCompleteRequest() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
        public boolean hasConnectIqOauthCompleteResponse() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
        public boolean hasConnectIqOauthRequest() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
        public boolean hasConnectIqOauthResponse() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
        public boolean hasOpenWebpageNotification() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
        public boolean hasRawResourceRequest() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
        public boolean hasRawResourceResponse() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasConnectIqHttpRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getConnectIqHttpRequest().hashCode();
            }
            if (hasConnectIqHttpResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getConnectIqHttpResponse().hashCode();
            }
            if (hasConnectIqImageRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getConnectIqImageRequest().hashCode();
            }
            if (hasConnectIqImageResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getConnectIqImageResponse().hashCode();
            }
            if (hasRawResourceRequest()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getRawResourceRequest().hashCode();
            }
            if (hasRawResourceResponse()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getRawResourceResponse().hashCode();
            }
            if (hasConnectIqOauthRequest()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getConnectIqOauthRequest().hashCode();
            }
            if (hasConnectIqOauthResponse()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getConnectIqOauthResponse().hashCode();
            }
            if (hasConnectIqOauthCompleteRequest()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getConnectIqOauthCompleteRequest().hashCode();
            }
            if (hasConnectIqOauthCompleteResponse()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getConnectIqOauthCompleteResponse().hashCode();
            }
            if (hasOpenWebpageNotification()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getOpenWebpageNotification().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQHTTPService_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectIQHTTPService.class, Builder.class);
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
            if (hasConnectIqHttpRequest() && !getConnectIqHttpRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasConnectIqImageRequest() && !getConnectIqImageRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasConnectIqImageResponse() && !getConnectIqImageResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasRawResourceRequest() && !getRawResourceRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasRawResourceResponse() && !getRawResourceResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasConnectIqOauthRequest() && !getConnectIqOauthRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasConnectIqOauthResponse() && !getConnectIqOauthResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasConnectIqOauthCompleteRequest() && !getConnectIqOauthCompleteRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasConnectIqOauthCompleteResponse() && !getConnectIqOauthCompleteResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasOpenWebpageNotification() || getOpenWebpageNotification().isInitialized()) {
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
            return new ConnectIQHTTPService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getConnectIqHttpRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getConnectIqHttpResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getConnectIqImageRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getConnectIqImageResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getRawResourceRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getRawResourceResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getConnectIqOauthRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(8, getConnectIqOauthResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(9, getConnectIqOauthCompleteRequest());
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeMessage(10, getConnectIqOauthCompleteResponse());
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeMessage(11, getOpenWebpageNotification());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConnectIQHTTPServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<ConnectIQHTTPRequest, ConnectIQHTTPRequest.Builder, ConnectIQHTTPRequestOrBuilder> connectIqHttpRequestBuilder_;
            private ConnectIQHTTPRequest connectIqHttpRequest_;
            private SingleFieldBuilderV3<ConnectIQHTTPResponse, ConnectIQHTTPResponse.Builder, ConnectIQHTTPResponseOrBuilder> connectIqHttpResponseBuilder_;
            private ConnectIQHTTPResponse connectIqHttpResponse_;
            private SingleFieldBuilderV3<ConnectIQImageRequest, ConnectIQImageRequest.Builder, ConnectIQImageRequestOrBuilder> connectIqImageRequestBuilder_;
            private ConnectIQImageRequest connectIqImageRequest_;
            private SingleFieldBuilderV3<ConnectIQImageResponse, ConnectIQImageResponse.Builder, ConnectIQImageResponseOrBuilder> connectIqImageResponseBuilder_;
            private ConnectIQImageResponse connectIqImageResponse_;
            private SingleFieldBuilderV3<ConnectIQOAuthCompleteRequest, ConnectIQOAuthCompleteRequest.Builder, ConnectIQOAuthCompleteRequestOrBuilder> connectIqOauthCompleteRequestBuilder_;
            private ConnectIQOAuthCompleteRequest connectIqOauthCompleteRequest_;
            private SingleFieldBuilderV3<ConnectIQOAuthCompleteResponse, ConnectIQOAuthCompleteResponse.Builder, ConnectIQOAuthCompleteResponseOrBuilder> connectIqOauthCompleteResponseBuilder_;
            private ConnectIQOAuthCompleteResponse connectIqOauthCompleteResponse_;
            private SingleFieldBuilderV3<ConnectIQOAuthRequest, ConnectIQOAuthRequest.Builder, ConnectIQOAuthRequestOrBuilder> connectIqOauthRequestBuilder_;
            private ConnectIQOAuthRequest connectIqOauthRequest_;
            private SingleFieldBuilderV3<ConnectIQOAuthResponse, ConnectIQOAuthResponse.Builder, ConnectIQOAuthResponseOrBuilder> connectIqOauthResponseBuilder_;
            private ConnectIQOAuthResponse connectIqOauthResponse_;
            private SingleFieldBuilderV3<OpenWebpageNotification, OpenWebpageNotification.Builder, OpenWebpageNotificationOrBuilder> openWebpageNotificationBuilder_;
            private OpenWebpageNotification openWebpageNotification_;
            private SingleFieldBuilderV3<RawResourceRequest, RawResourceRequest.Builder, RawResourceRequestOrBuilder> rawResourceRequestBuilder_;
            private RawResourceRequest rawResourceRequest_;
            private SingleFieldBuilderV3<RawResourceResponse, RawResourceResponse.Builder, RawResourceResponseOrBuilder> rawResourceResponseBuilder_;
            private RawResourceResponse rawResourceResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ConnectIQHTTPService connectIQHTTPService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<ConnectIQHTTPRequest, ConnectIQHTTPRequest.Builder, ConnectIQHTTPRequestOrBuilder> singleFieldBuilderV3 = this.connectIqHttpRequestBuilder_;
                    connectIQHTTPService.connectIqHttpRequest_ = singleFieldBuilderV3 == null ? this.connectIqHttpRequest_ : (ConnectIQHTTPRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<ConnectIQHTTPResponse, ConnectIQHTTPResponse.Builder, ConnectIQHTTPResponseOrBuilder> singleFieldBuilderV4 = this.connectIqHttpResponseBuilder_;
                    connectIQHTTPService.connectIqHttpResponse_ = singleFieldBuilderV4 == null ? this.connectIqHttpResponse_ : (ConnectIQHTTPResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<ConnectIQImageRequest, ConnectIQImageRequest.Builder, ConnectIQImageRequestOrBuilder> singleFieldBuilderV5 = this.connectIqImageRequestBuilder_;
                    connectIQHTTPService.connectIqImageRequest_ = singleFieldBuilderV5 == null ? this.connectIqImageRequest_ : (ConnectIQImageRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<ConnectIQImageResponse, ConnectIQImageResponse.Builder, ConnectIQImageResponseOrBuilder> singleFieldBuilderV6 = this.connectIqImageResponseBuilder_;
                    connectIQHTTPService.connectIqImageResponse_ = singleFieldBuilderV6 == null ? this.connectIqImageResponse_ : (ConnectIQImageResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<RawResourceRequest, RawResourceRequest.Builder, RawResourceRequestOrBuilder> singleFieldBuilderV7 = this.rawResourceRequestBuilder_;
                    connectIQHTTPService.rawResourceRequest_ = singleFieldBuilderV7 == null ? this.rawResourceRequest_ : (RawResourceRequest) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<RawResourceResponse, RawResourceResponse.Builder, RawResourceResponseOrBuilder> singleFieldBuilderV8 = this.rawResourceResponseBuilder_;
                    connectIQHTTPService.rawResourceResponse_ = singleFieldBuilderV8 == null ? this.rawResourceResponse_ : (RawResourceResponse) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<ConnectIQOAuthRequest, ConnectIQOAuthRequest.Builder, ConnectIQOAuthRequestOrBuilder> singleFieldBuilderV9 = this.connectIqOauthRequestBuilder_;
                    connectIQHTTPService.connectIqOauthRequest_ = singleFieldBuilderV9 == null ? this.connectIqOauthRequest_ : (ConnectIQOAuthRequest) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<ConnectIQOAuthResponse, ConnectIQOAuthResponse.Builder, ConnectIQOAuthResponseOrBuilder> singleFieldBuilderV10 = this.connectIqOauthResponseBuilder_;
                    connectIQHTTPService.connectIqOauthResponse_ = singleFieldBuilderV10 == null ? this.connectIqOauthResponse_ : (ConnectIQOAuthResponse) singleFieldBuilderV10.build();
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    SingleFieldBuilderV3<ConnectIQOAuthCompleteRequest, ConnectIQOAuthCompleteRequest.Builder, ConnectIQOAuthCompleteRequestOrBuilder> singleFieldBuilderV11 = this.connectIqOauthCompleteRequestBuilder_;
                    connectIQHTTPService.connectIqOauthCompleteRequest_ = singleFieldBuilderV11 == null ? this.connectIqOauthCompleteRequest_ : (ConnectIQOAuthCompleteRequest) singleFieldBuilderV11.build();
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    SingleFieldBuilderV3<ConnectIQOAuthCompleteResponse, ConnectIQOAuthCompleteResponse.Builder, ConnectIQOAuthCompleteResponseOrBuilder> singleFieldBuilderV12 = this.connectIqOauthCompleteResponseBuilder_;
                    connectIQHTTPService.connectIqOauthCompleteResponse_ = singleFieldBuilderV12 == null ? this.connectIqOauthCompleteResponse_ : (ConnectIQOAuthCompleteResponse) singleFieldBuilderV12.build();
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    SingleFieldBuilderV3<OpenWebpageNotification, OpenWebpageNotification.Builder, OpenWebpageNotificationOrBuilder> singleFieldBuilderV13 = this.openWebpageNotificationBuilder_;
                    connectIQHTTPService.openWebpageNotification_ = singleFieldBuilderV13 == null ? this.openWebpageNotification_ : (OpenWebpageNotification) singleFieldBuilderV13.build();
                    i14 |= 1024;
                }
                connectIQHTTPService.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<ConnectIQHTTPRequest, ConnectIQHTTPRequest.Builder, ConnectIQHTTPRequestOrBuilder> getConnectIqHttpRequestFieldBuilder() {
                if (this.connectIqHttpRequestBuilder_ == null) {
                    this.connectIqHttpRequestBuilder_ = new SingleFieldBuilderV3<>(getConnectIqHttpRequest(), getParentForChildren(), isClean());
                    this.connectIqHttpRequest_ = null;
                }
                return this.connectIqHttpRequestBuilder_;
            }

            private SingleFieldBuilderV3<ConnectIQHTTPResponse, ConnectIQHTTPResponse.Builder, ConnectIQHTTPResponseOrBuilder> getConnectIqHttpResponseFieldBuilder() {
                if (this.connectIqHttpResponseBuilder_ == null) {
                    this.connectIqHttpResponseBuilder_ = new SingleFieldBuilderV3<>(getConnectIqHttpResponse(), getParentForChildren(), isClean());
                    this.connectIqHttpResponse_ = null;
                }
                return this.connectIqHttpResponseBuilder_;
            }

            private SingleFieldBuilderV3<ConnectIQImageRequest, ConnectIQImageRequest.Builder, ConnectIQImageRequestOrBuilder> getConnectIqImageRequestFieldBuilder() {
                if (this.connectIqImageRequestBuilder_ == null) {
                    this.connectIqImageRequestBuilder_ = new SingleFieldBuilderV3<>(getConnectIqImageRequest(), getParentForChildren(), isClean());
                    this.connectIqImageRequest_ = null;
                }
                return this.connectIqImageRequestBuilder_;
            }

            private SingleFieldBuilderV3<ConnectIQImageResponse, ConnectIQImageResponse.Builder, ConnectIQImageResponseOrBuilder> getConnectIqImageResponseFieldBuilder() {
                if (this.connectIqImageResponseBuilder_ == null) {
                    this.connectIqImageResponseBuilder_ = new SingleFieldBuilderV3<>(getConnectIqImageResponse(), getParentForChildren(), isClean());
                    this.connectIqImageResponse_ = null;
                }
                return this.connectIqImageResponseBuilder_;
            }

            private SingleFieldBuilderV3<ConnectIQOAuthCompleteRequest, ConnectIQOAuthCompleteRequest.Builder, ConnectIQOAuthCompleteRequestOrBuilder> getConnectIqOauthCompleteRequestFieldBuilder() {
                if (this.connectIqOauthCompleteRequestBuilder_ == null) {
                    this.connectIqOauthCompleteRequestBuilder_ = new SingleFieldBuilderV3<>(getConnectIqOauthCompleteRequest(), getParentForChildren(), isClean());
                    this.connectIqOauthCompleteRequest_ = null;
                }
                return this.connectIqOauthCompleteRequestBuilder_;
            }

            private SingleFieldBuilderV3<ConnectIQOAuthCompleteResponse, ConnectIQOAuthCompleteResponse.Builder, ConnectIQOAuthCompleteResponseOrBuilder> getConnectIqOauthCompleteResponseFieldBuilder() {
                if (this.connectIqOauthCompleteResponseBuilder_ == null) {
                    this.connectIqOauthCompleteResponseBuilder_ = new SingleFieldBuilderV3<>(getConnectIqOauthCompleteResponse(), getParentForChildren(), isClean());
                    this.connectIqOauthCompleteResponse_ = null;
                }
                return this.connectIqOauthCompleteResponseBuilder_;
            }

            private SingleFieldBuilderV3<ConnectIQOAuthRequest, ConnectIQOAuthRequest.Builder, ConnectIQOAuthRequestOrBuilder> getConnectIqOauthRequestFieldBuilder() {
                if (this.connectIqOauthRequestBuilder_ == null) {
                    this.connectIqOauthRequestBuilder_ = new SingleFieldBuilderV3<>(getConnectIqOauthRequest(), getParentForChildren(), isClean());
                    this.connectIqOauthRequest_ = null;
                }
                return this.connectIqOauthRequestBuilder_;
            }

            private SingleFieldBuilderV3<ConnectIQOAuthResponse, ConnectIQOAuthResponse.Builder, ConnectIQOAuthResponseOrBuilder> getConnectIqOauthResponseFieldBuilder() {
                if (this.connectIqOauthResponseBuilder_ == null) {
                    this.connectIqOauthResponseBuilder_ = new SingleFieldBuilderV3<>(getConnectIqOauthResponse(), getParentForChildren(), isClean());
                    this.connectIqOauthResponse_ = null;
                }
                return this.connectIqOauthResponseBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQHTTPService_descriptor;
            }

            private SingleFieldBuilderV3<OpenWebpageNotification, OpenWebpageNotification.Builder, OpenWebpageNotificationOrBuilder> getOpenWebpageNotificationFieldBuilder() {
                if (this.openWebpageNotificationBuilder_ == null) {
                    this.openWebpageNotificationBuilder_ = new SingleFieldBuilderV3<>(getOpenWebpageNotification(), getParentForChildren(), isClean());
                    this.openWebpageNotification_ = null;
                }
                return this.openWebpageNotificationBuilder_;
            }

            private SingleFieldBuilderV3<RawResourceRequest, RawResourceRequest.Builder, RawResourceRequestOrBuilder> getRawResourceRequestFieldBuilder() {
                if (this.rawResourceRequestBuilder_ == null) {
                    this.rawResourceRequestBuilder_ = new SingleFieldBuilderV3<>(getRawResourceRequest(), getParentForChildren(), isClean());
                    this.rawResourceRequest_ = null;
                }
                return this.rawResourceRequestBuilder_;
            }

            private SingleFieldBuilderV3<RawResourceResponse, RawResourceResponse.Builder, RawResourceResponseOrBuilder> getRawResourceResponseFieldBuilder() {
                if (this.rawResourceResponseBuilder_ == null) {
                    this.rawResourceResponseBuilder_ = new SingleFieldBuilderV3<>(getRawResourceResponse(), getParentForChildren(), isClean());
                    this.rawResourceResponse_ = null;
                }
                return this.rawResourceResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getConnectIqHttpRequestFieldBuilder();
                    getConnectIqHttpResponseFieldBuilder();
                    getConnectIqImageRequestFieldBuilder();
                    getConnectIqImageResponseFieldBuilder();
                    getRawResourceRequestFieldBuilder();
                    getRawResourceResponseFieldBuilder();
                    getConnectIqOauthRequestFieldBuilder();
                    getConnectIqOauthResponseFieldBuilder();
                    getConnectIqOauthCompleteRequestFieldBuilder();
                    getConnectIqOauthCompleteResponseFieldBuilder();
                    getOpenWebpageNotificationFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectIQHTTPService build() {
                ConnectIQHTTPService connectIQHTTPServiceBuildPartial = buildPartial();
                if (connectIQHTTPServiceBuildPartial.isInitialized()) {
                    return connectIQHTTPServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) connectIQHTTPServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectIQHTTPService buildPartial() {
                ConnectIQHTTPService connectIQHTTPService = new ConnectIQHTTPService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(connectIQHTTPService);
                }
                onBuilt();
                return connectIQHTTPService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.connectIqHttpRequest_ = null;
                SingleFieldBuilderV3<ConnectIQHTTPRequest, ConnectIQHTTPRequest.Builder, ConnectIQHTTPRequestOrBuilder> singleFieldBuilderV3 = this.connectIqHttpRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.connectIqHttpRequestBuilder_ = null;
                }
                this.connectIqHttpResponse_ = null;
                SingleFieldBuilderV3<ConnectIQHTTPResponse, ConnectIQHTTPResponse.Builder, ConnectIQHTTPResponseOrBuilder> singleFieldBuilderV4 = this.connectIqHttpResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.connectIqHttpResponseBuilder_ = null;
                }
                this.connectIqImageRequest_ = null;
                SingleFieldBuilderV3<ConnectIQImageRequest, ConnectIQImageRequest.Builder, ConnectIQImageRequestOrBuilder> singleFieldBuilderV5 = this.connectIqImageRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.connectIqImageRequestBuilder_ = null;
                }
                this.connectIqImageResponse_ = null;
                SingleFieldBuilderV3<ConnectIQImageResponse, ConnectIQImageResponse.Builder, ConnectIQImageResponseOrBuilder> singleFieldBuilderV6 = this.connectIqImageResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.connectIqImageResponseBuilder_ = null;
                }
                this.rawResourceRequest_ = null;
                SingleFieldBuilderV3<RawResourceRequest, RawResourceRequest.Builder, RawResourceRequestOrBuilder> singleFieldBuilderV7 = this.rawResourceRequestBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.rawResourceRequestBuilder_ = null;
                }
                this.rawResourceResponse_ = null;
                SingleFieldBuilderV3<RawResourceResponse, RawResourceResponse.Builder, RawResourceResponseOrBuilder> singleFieldBuilderV8 = this.rawResourceResponseBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.rawResourceResponseBuilder_ = null;
                }
                this.connectIqOauthRequest_ = null;
                SingleFieldBuilderV3<ConnectIQOAuthRequest, ConnectIQOAuthRequest.Builder, ConnectIQOAuthRequestOrBuilder> singleFieldBuilderV9 = this.connectIqOauthRequestBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.connectIqOauthRequestBuilder_ = null;
                }
                this.connectIqOauthResponse_ = null;
                SingleFieldBuilderV3<ConnectIQOAuthResponse, ConnectIQOAuthResponse.Builder, ConnectIQOAuthResponseOrBuilder> singleFieldBuilderV10 = this.connectIqOauthResponseBuilder_;
                if (singleFieldBuilderV10 != null) {
                    singleFieldBuilderV10.dispose();
                    this.connectIqOauthResponseBuilder_ = null;
                }
                this.connectIqOauthCompleteRequest_ = null;
                SingleFieldBuilderV3<ConnectIQOAuthCompleteRequest, ConnectIQOAuthCompleteRequest.Builder, ConnectIQOAuthCompleteRequestOrBuilder> singleFieldBuilderV11 = this.connectIqOauthCompleteRequestBuilder_;
                if (singleFieldBuilderV11 != null) {
                    singleFieldBuilderV11.dispose();
                    this.connectIqOauthCompleteRequestBuilder_ = null;
                }
                this.connectIqOauthCompleteResponse_ = null;
                SingleFieldBuilderV3<ConnectIQOAuthCompleteResponse, ConnectIQOAuthCompleteResponse.Builder, ConnectIQOAuthCompleteResponseOrBuilder> singleFieldBuilderV12 = this.connectIqOauthCompleteResponseBuilder_;
                if (singleFieldBuilderV12 != null) {
                    singleFieldBuilderV12.dispose();
                    this.connectIqOauthCompleteResponseBuilder_ = null;
                }
                this.openWebpageNotification_ = null;
                SingleFieldBuilderV3<OpenWebpageNotification, OpenWebpageNotification.Builder, OpenWebpageNotificationOrBuilder> singleFieldBuilderV13 = this.openWebpageNotificationBuilder_;
                if (singleFieldBuilderV13 != null) {
                    singleFieldBuilderV13.dispose();
                    this.openWebpageNotificationBuilder_ = null;
                }
                return this;
            }

            public Builder clearConnectIqHttpRequest() {
                this.bitField0_ &= -2;
                this.connectIqHttpRequest_ = null;
                SingleFieldBuilderV3<ConnectIQHTTPRequest, ConnectIQHTTPRequest.Builder, ConnectIQHTTPRequestOrBuilder> singleFieldBuilderV3 = this.connectIqHttpRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.connectIqHttpRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConnectIqHttpResponse() {
                this.bitField0_ &= -3;
                this.connectIqHttpResponse_ = null;
                SingleFieldBuilderV3<ConnectIQHTTPResponse, ConnectIQHTTPResponse.Builder, ConnectIQHTTPResponseOrBuilder> singleFieldBuilderV3 = this.connectIqHttpResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.connectIqHttpResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConnectIqImageRequest() {
                this.bitField0_ &= -5;
                this.connectIqImageRequest_ = null;
                SingleFieldBuilderV3<ConnectIQImageRequest, ConnectIQImageRequest.Builder, ConnectIQImageRequestOrBuilder> singleFieldBuilderV3 = this.connectIqImageRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.connectIqImageRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConnectIqImageResponse() {
                this.bitField0_ &= -9;
                this.connectIqImageResponse_ = null;
                SingleFieldBuilderV3<ConnectIQImageResponse, ConnectIQImageResponse.Builder, ConnectIQImageResponseOrBuilder> singleFieldBuilderV3 = this.connectIqImageResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.connectIqImageResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConnectIqOauthCompleteRequest() {
                this.bitField0_ &= -257;
                this.connectIqOauthCompleteRequest_ = null;
                SingleFieldBuilderV3<ConnectIQOAuthCompleteRequest, ConnectIQOAuthCompleteRequest.Builder, ConnectIQOAuthCompleteRequestOrBuilder> singleFieldBuilderV3 = this.connectIqOauthCompleteRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.connectIqOauthCompleteRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConnectIqOauthCompleteResponse() {
                this.bitField0_ &= -513;
                this.connectIqOauthCompleteResponse_ = null;
                SingleFieldBuilderV3<ConnectIQOAuthCompleteResponse, ConnectIQOAuthCompleteResponse.Builder, ConnectIQOAuthCompleteResponseOrBuilder> singleFieldBuilderV3 = this.connectIqOauthCompleteResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.connectIqOauthCompleteResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConnectIqOauthRequest() {
                this.bitField0_ &= -65;
                this.connectIqOauthRequest_ = null;
                SingleFieldBuilderV3<ConnectIQOAuthRequest, ConnectIQOAuthRequest.Builder, ConnectIQOAuthRequestOrBuilder> singleFieldBuilderV3 = this.connectIqOauthRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.connectIqOauthRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConnectIqOauthResponse() {
                this.bitField0_ &= -129;
                this.connectIqOauthResponse_ = null;
                SingleFieldBuilderV3<ConnectIQOAuthResponse, ConnectIQOAuthResponse.Builder, ConnectIQOAuthResponseOrBuilder> singleFieldBuilderV3 = this.connectIqOauthResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.connectIqOauthResponseBuilder_ = null;
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

            public Builder clearOpenWebpageNotification() {
                this.bitField0_ &= -1025;
                this.openWebpageNotification_ = null;
                SingleFieldBuilderV3<OpenWebpageNotification, OpenWebpageNotification.Builder, OpenWebpageNotificationOrBuilder> singleFieldBuilderV3 = this.openWebpageNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.openWebpageNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearRawResourceRequest() {
                this.bitField0_ &= -17;
                this.rawResourceRequest_ = null;
                SingleFieldBuilderV3<RawResourceRequest, RawResourceRequest.Builder, RawResourceRequestOrBuilder> singleFieldBuilderV3 = this.rawResourceRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.rawResourceRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearRawResourceResponse() {
                this.bitField0_ &= -33;
                this.rawResourceResponse_ = null;
                SingleFieldBuilderV3<RawResourceResponse, RawResourceResponse.Builder, RawResourceResponseOrBuilder> singleFieldBuilderV3 = this.rawResourceResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.rawResourceResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
            public ConnectIQHTTPRequest getConnectIqHttpRequest() {
                SingleFieldBuilderV3<ConnectIQHTTPRequest, ConnectIQHTTPRequest.Builder, ConnectIQHTTPRequestOrBuilder> singleFieldBuilderV3 = this.connectIqHttpRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectIQHTTPRequest) singleFieldBuilderV3.getMessage();
                }
                ConnectIQHTTPRequest connectIQHTTPRequest = this.connectIqHttpRequest_;
                return connectIQHTTPRequest == null ? ConnectIQHTTPRequest.getDefaultInstance() : connectIQHTTPRequest;
            }

            public ConnectIQHTTPRequest.Builder getConnectIqHttpRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (ConnectIQHTTPRequest.Builder) getConnectIqHttpRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
            public ConnectIQHTTPRequestOrBuilder getConnectIqHttpRequestOrBuilder() {
                SingleFieldBuilderV3<ConnectIQHTTPRequest, ConnectIQHTTPRequest.Builder, ConnectIQHTTPRequestOrBuilder> singleFieldBuilderV3 = this.connectIqHttpRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectIQHTTPRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConnectIQHTTPRequest connectIQHTTPRequest = this.connectIqHttpRequest_;
                return connectIQHTTPRequest == null ? ConnectIQHTTPRequest.getDefaultInstance() : connectIQHTTPRequest;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
            public ConnectIQHTTPResponse getConnectIqHttpResponse() {
                SingleFieldBuilderV3<ConnectIQHTTPResponse, ConnectIQHTTPResponse.Builder, ConnectIQHTTPResponseOrBuilder> singleFieldBuilderV3 = this.connectIqHttpResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectIQHTTPResponse) singleFieldBuilderV3.getMessage();
                }
                ConnectIQHTTPResponse connectIQHTTPResponse = this.connectIqHttpResponse_;
                return connectIQHTTPResponse == null ? ConnectIQHTTPResponse.getDefaultInstance() : connectIQHTTPResponse;
            }

            public ConnectIQHTTPResponse.Builder getConnectIqHttpResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (ConnectIQHTTPResponse.Builder) getConnectIqHttpResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
            public ConnectIQHTTPResponseOrBuilder getConnectIqHttpResponseOrBuilder() {
                SingleFieldBuilderV3<ConnectIQHTTPResponse, ConnectIQHTTPResponse.Builder, ConnectIQHTTPResponseOrBuilder> singleFieldBuilderV3 = this.connectIqHttpResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectIQHTTPResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConnectIQHTTPResponse connectIQHTTPResponse = this.connectIqHttpResponse_;
                return connectIQHTTPResponse == null ? ConnectIQHTTPResponse.getDefaultInstance() : connectIQHTTPResponse;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
            public ConnectIQImageRequest getConnectIqImageRequest() {
                SingleFieldBuilderV3<ConnectIQImageRequest, ConnectIQImageRequest.Builder, ConnectIQImageRequestOrBuilder> singleFieldBuilderV3 = this.connectIqImageRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectIQImageRequest) singleFieldBuilderV3.getMessage();
                }
                ConnectIQImageRequest connectIQImageRequest = this.connectIqImageRequest_;
                return connectIQImageRequest == null ? ConnectIQImageRequest.getDefaultInstance() : connectIQImageRequest;
            }

            public ConnectIQImageRequest.Builder getConnectIqImageRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (ConnectIQImageRequest.Builder) getConnectIqImageRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
            public ConnectIQImageRequestOrBuilder getConnectIqImageRequestOrBuilder() {
                SingleFieldBuilderV3<ConnectIQImageRequest, ConnectIQImageRequest.Builder, ConnectIQImageRequestOrBuilder> singleFieldBuilderV3 = this.connectIqImageRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectIQImageRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConnectIQImageRequest connectIQImageRequest = this.connectIqImageRequest_;
                return connectIQImageRequest == null ? ConnectIQImageRequest.getDefaultInstance() : connectIQImageRequest;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
            public ConnectIQImageResponse getConnectIqImageResponse() {
                SingleFieldBuilderV3<ConnectIQImageResponse, ConnectIQImageResponse.Builder, ConnectIQImageResponseOrBuilder> singleFieldBuilderV3 = this.connectIqImageResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectIQImageResponse) singleFieldBuilderV3.getMessage();
                }
                ConnectIQImageResponse connectIQImageResponse = this.connectIqImageResponse_;
                return connectIQImageResponse == null ? ConnectIQImageResponse.getDefaultInstance() : connectIQImageResponse;
            }

            public ConnectIQImageResponse.Builder getConnectIqImageResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (ConnectIQImageResponse.Builder) getConnectIqImageResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
            public ConnectIQImageResponseOrBuilder getConnectIqImageResponseOrBuilder() {
                SingleFieldBuilderV3<ConnectIQImageResponse, ConnectIQImageResponse.Builder, ConnectIQImageResponseOrBuilder> singleFieldBuilderV3 = this.connectIqImageResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectIQImageResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConnectIQImageResponse connectIQImageResponse = this.connectIqImageResponse_;
                return connectIQImageResponse == null ? ConnectIQImageResponse.getDefaultInstance() : connectIQImageResponse;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
            public ConnectIQOAuthCompleteRequest getConnectIqOauthCompleteRequest() {
                SingleFieldBuilderV3<ConnectIQOAuthCompleteRequest, ConnectIQOAuthCompleteRequest.Builder, ConnectIQOAuthCompleteRequestOrBuilder> singleFieldBuilderV3 = this.connectIqOauthCompleteRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectIQOAuthCompleteRequest) singleFieldBuilderV3.getMessage();
                }
                ConnectIQOAuthCompleteRequest connectIQOAuthCompleteRequest = this.connectIqOauthCompleteRequest_;
                return connectIQOAuthCompleteRequest == null ? ConnectIQOAuthCompleteRequest.getDefaultInstance() : connectIQOAuthCompleteRequest;
            }

            public ConnectIQOAuthCompleteRequest.Builder getConnectIqOauthCompleteRequestBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (ConnectIQOAuthCompleteRequest.Builder) getConnectIqOauthCompleteRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
            public ConnectIQOAuthCompleteRequestOrBuilder getConnectIqOauthCompleteRequestOrBuilder() {
                SingleFieldBuilderV3<ConnectIQOAuthCompleteRequest, ConnectIQOAuthCompleteRequest.Builder, ConnectIQOAuthCompleteRequestOrBuilder> singleFieldBuilderV3 = this.connectIqOauthCompleteRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectIQOAuthCompleteRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConnectIQOAuthCompleteRequest connectIQOAuthCompleteRequest = this.connectIqOauthCompleteRequest_;
                return connectIQOAuthCompleteRequest == null ? ConnectIQOAuthCompleteRequest.getDefaultInstance() : connectIQOAuthCompleteRequest;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
            public ConnectIQOAuthCompleteResponse getConnectIqOauthCompleteResponse() {
                SingleFieldBuilderV3<ConnectIQOAuthCompleteResponse, ConnectIQOAuthCompleteResponse.Builder, ConnectIQOAuthCompleteResponseOrBuilder> singleFieldBuilderV3 = this.connectIqOauthCompleteResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectIQOAuthCompleteResponse) singleFieldBuilderV3.getMessage();
                }
                ConnectIQOAuthCompleteResponse connectIQOAuthCompleteResponse = this.connectIqOauthCompleteResponse_;
                return connectIQOAuthCompleteResponse == null ? ConnectIQOAuthCompleteResponse.getDefaultInstance() : connectIQOAuthCompleteResponse;
            }

            public ConnectIQOAuthCompleteResponse.Builder getConnectIqOauthCompleteResponseBuilder() {
                this.bitField0_ |= 512;
                onChanged();
                return (ConnectIQOAuthCompleteResponse.Builder) getConnectIqOauthCompleteResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
            public ConnectIQOAuthCompleteResponseOrBuilder getConnectIqOauthCompleteResponseOrBuilder() {
                SingleFieldBuilderV3<ConnectIQOAuthCompleteResponse, ConnectIQOAuthCompleteResponse.Builder, ConnectIQOAuthCompleteResponseOrBuilder> singleFieldBuilderV3 = this.connectIqOauthCompleteResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectIQOAuthCompleteResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConnectIQOAuthCompleteResponse connectIQOAuthCompleteResponse = this.connectIqOauthCompleteResponse_;
                return connectIQOAuthCompleteResponse == null ? ConnectIQOAuthCompleteResponse.getDefaultInstance() : connectIQOAuthCompleteResponse;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
            public ConnectIQOAuthRequest getConnectIqOauthRequest() {
                SingleFieldBuilderV3<ConnectIQOAuthRequest, ConnectIQOAuthRequest.Builder, ConnectIQOAuthRequestOrBuilder> singleFieldBuilderV3 = this.connectIqOauthRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectIQOAuthRequest) singleFieldBuilderV3.getMessage();
                }
                ConnectIQOAuthRequest connectIQOAuthRequest = this.connectIqOauthRequest_;
                return connectIQOAuthRequest == null ? ConnectIQOAuthRequest.getDefaultInstance() : connectIQOAuthRequest;
            }

            public ConnectIQOAuthRequest.Builder getConnectIqOauthRequestBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (ConnectIQOAuthRequest.Builder) getConnectIqOauthRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
            public ConnectIQOAuthRequestOrBuilder getConnectIqOauthRequestOrBuilder() {
                SingleFieldBuilderV3<ConnectIQOAuthRequest, ConnectIQOAuthRequest.Builder, ConnectIQOAuthRequestOrBuilder> singleFieldBuilderV3 = this.connectIqOauthRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectIQOAuthRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConnectIQOAuthRequest connectIQOAuthRequest = this.connectIqOauthRequest_;
                return connectIQOAuthRequest == null ? ConnectIQOAuthRequest.getDefaultInstance() : connectIQOAuthRequest;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
            public ConnectIQOAuthResponse getConnectIqOauthResponse() {
                SingleFieldBuilderV3<ConnectIQOAuthResponse, ConnectIQOAuthResponse.Builder, ConnectIQOAuthResponseOrBuilder> singleFieldBuilderV3 = this.connectIqOauthResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectIQOAuthResponse) singleFieldBuilderV3.getMessage();
                }
                ConnectIQOAuthResponse connectIQOAuthResponse = this.connectIqOauthResponse_;
                return connectIQOAuthResponse == null ? ConnectIQOAuthResponse.getDefaultInstance() : connectIQOAuthResponse;
            }

            public ConnectIQOAuthResponse.Builder getConnectIqOauthResponseBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (ConnectIQOAuthResponse.Builder) getConnectIqOauthResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
            public ConnectIQOAuthResponseOrBuilder getConnectIqOauthResponseOrBuilder() {
                SingleFieldBuilderV3<ConnectIQOAuthResponse, ConnectIQOAuthResponse.Builder, ConnectIQOAuthResponseOrBuilder> singleFieldBuilderV3 = this.connectIqOauthResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectIQOAuthResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConnectIQOAuthResponse connectIQOAuthResponse = this.connectIqOauthResponse_;
                return connectIQOAuthResponse == null ? ConnectIQOAuthResponse.getDefaultInstance() : connectIQOAuthResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQHTTPService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
            public OpenWebpageNotification getOpenWebpageNotification() {
                SingleFieldBuilderV3<OpenWebpageNotification, OpenWebpageNotification.Builder, OpenWebpageNotificationOrBuilder> singleFieldBuilderV3 = this.openWebpageNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (OpenWebpageNotification) singleFieldBuilderV3.getMessage();
                }
                OpenWebpageNotification openWebpageNotification = this.openWebpageNotification_;
                return openWebpageNotification == null ? OpenWebpageNotification.getDefaultInstance() : openWebpageNotification;
            }

            public OpenWebpageNotification.Builder getOpenWebpageNotificationBuilder() {
                this.bitField0_ |= 1024;
                onChanged();
                return (OpenWebpageNotification.Builder) getOpenWebpageNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
            public OpenWebpageNotificationOrBuilder getOpenWebpageNotificationOrBuilder() {
                SingleFieldBuilderV3<OpenWebpageNotification, OpenWebpageNotification.Builder, OpenWebpageNotificationOrBuilder> singleFieldBuilderV3 = this.openWebpageNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (OpenWebpageNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                OpenWebpageNotification openWebpageNotification = this.openWebpageNotification_;
                return openWebpageNotification == null ? OpenWebpageNotification.getDefaultInstance() : openWebpageNotification;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
            public RawResourceRequest getRawResourceRequest() {
                SingleFieldBuilderV3<RawResourceRequest, RawResourceRequest.Builder, RawResourceRequestOrBuilder> singleFieldBuilderV3 = this.rawResourceRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RawResourceRequest) singleFieldBuilderV3.getMessage();
                }
                RawResourceRequest rawResourceRequest = this.rawResourceRequest_;
                return rawResourceRequest == null ? RawResourceRequest.getDefaultInstance() : rawResourceRequest;
            }

            public RawResourceRequest.Builder getRawResourceRequestBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (RawResourceRequest.Builder) getRawResourceRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
            public RawResourceRequestOrBuilder getRawResourceRequestOrBuilder() {
                SingleFieldBuilderV3<RawResourceRequest, RawResourceRequest.Builder, RawResourceRequestOrBuilder> singleFieldBuilderV3 = this.rawResourceRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RawResourceRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                RawResourceRequest rawResourceRequest = this.rawResourceRequest_;
                return rawResourceRequest == null ? RawResourceRequest.getDefaultInstance() : rawResourceRequest;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
            public RawResourceResponse getRawResourceResponse() {
                SingleFieldBuilderV3<RawResourceResponse, RawResourceResponse.Builder, RawResourceResponseOrBuilder> singleFieldBuilderV3 = this.rawResourceResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RawResourceResponse) singleFieldBuilderV3.getMessage();
                }
                RawResourceResponse rawResourceResponse = this.rawResourceResponse_;
                return rawResourceResponse == null ? RawResourceResponse.getDefaultInstance() : rawResourceResponse;
            }

            public RawResourceResponse.Builder getRawResourceResponseBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (RawResourceResponse.Builder) getRawResourceResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
            public RawResourceResponseOrBuilder getRawResourceResponseOrBuilder() {
                SingleFieldBuilderV3<RawResourceResponse, RawResourceResponse.Builder, RawResourceResponseOrBuilder> singleFieldBuilderV3 = this.rawResourceResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RawResourceResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                RawResourceResponse rawResourceResponse = this.rawResourceResponse_;
                return rawResourceResponse == null ? RawResourceResponse.getDefaultInstance() : rawResourceResponse;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
            public boolean hasConnectIqHttpRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
            public boolean hasConnectIqHttpResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
            public boolean hasConnectIqImageRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
            public boolean hasConnectIqImageResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
            public boolean hasConnectIqOauthCompleteRequest() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
            public boolean hasConnectIqOauthCompleteResponse() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
            public boolean hasConnectIqOauthRequest() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
            public boolean hasConnectIqOauthResponse() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
            public boolean hasOpenWebpageNotification() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
            public boolean hasRawResourceRequest() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQHTTPServiceOrBuilder
            public boolean hasRawResourceResponse() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQHTTPService_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectIQHTTPService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasConnectIqHttpRequest() && !getConnectIqHttpRequest().isInitialized()) {
                    return false;
                }
                if (hasConnectIqImageRequest() && !getConnectIqImageRequest().isInitialized()) {
                    return false;
                }
                if (hasConnectIqImageResponse() && !getConnectIqImageResponse().isInitialized()) {
                    return false;
                }
                if (hasRawResourceRequest() && !getRawResourceRequest().isInitialized()) {
                    return false;
                }
                if (hasRawResourceResponse() && !getRawResourceResponse().isInitialized()) {
                    return false;
                }
                if (hasConnectIqOauthRequest() && !getConnectIqOauthRequest().isInitialized()) {
                    return false;
                }
                if (hasConnectIqOauthResponse() && !getConnectIqOauthResponse().isInitialized()) {
                    return false;
                }
                if (hasConnectIqOauthCompleteRequest() && !getConnectIqOauthCompleteRequest().isInitialized()) {
                    return false;
                }
                if (!hasConnectIqOauthCompleteResponse() || getConnectIqOauthCompleteResponse().isInitialized()) {
                    return !hasOpenWebpageNotification() || getOpenWebpageNotification().isInitialized();
                }
                return false;
            }

            public Builder mergeConnectIqHttpRequest(ConnectIQHTTPRequest connectIQHTTPRequest) {
                ConnectIQHTTPRequest connectIQHTTPRequest2;
                SingleFieldBuilderV3<ConnectIQHTTPRequest, ConnectIQHTTPRequest.Builder, ConnectIQHTTPRequestOrBuilder> singleFieldBuilderV3 = this.connectIqHttpRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(connectIQHTTPRequest);
                } else if ((this.bitField0_ & 1) == 0 || (connectIQHTTPRequest2 = this.connectIqHttpRequest_) == null || connectIQHTTPRequest2 == ConnectIQHTTPRequest.getDefaultInstance()) {
                    this.connectIqHttpRequest_ = connectIQHTTPRequest;
                } else {
                    getConnectIqHttpRequestBuilder().mergeFrom(connectIQHTTPRequest);
                }
                if (this.connectIqHttpRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConnectIqHttpResponse(ConnectIQHTTPResponse connectIQHTTPResponse) {
                ConnectIQHTTPResponse connectIQHTTPResponse2;
                SingleFieldBuilderV3<ConnectIQHTTPResponse, ConnectIQHTTPResponse.Builder, ConnectIQHTTPResponseOrBuilder> singleFieldBuilderV3 = this.connectIqHttpResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(connectIQHTTPResponse);
                } else if ((this.bitField0_ & 2) == 0 || (connectIQHTTPResponse2 = this.connectIqHttpResponse_) == null || connectIQHTTPResponse2 == ConnectIQHTTPResponse.getDefaultInstance()) {
                    this.connectIqHttpResponse_ = connectIQHTTPResponse;
                } else {
                    getConnectIqHttpResponseBuilder().mergeFrom(connectIQHTTPResponse);
                }
                if (this.connectIqHttpResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConnectIqImageRequest(ConnectIQImageRequest connectIQImageRequest) {
                ConnectIQImageRequest connectIQImageRequest2;
                SingleFieldBuilderV3<ConnectIQImageRequest, ConnectIQImageRequest.Builder, ConnectIQImageRequestOrBuilder> singleFieldBuilderV3 = this.connectIqImageRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(connectIQImageRequest);
                } else if ((this.bitField0_ & 4) == 0 || (connectIQImageRequest2 = this.connectIqImageRequest_) == null || connectIQImageRequest2 == ConnectIQImageRequest.getDefaultInstance()) {
                    this.connectIqImageRequest_ = connectIQImageRequest;
                } else {
                    getConnectIqImageRequestBuilder().mergeFrom(connectIQImageRequest);
                }
                if (this.connectIqImageRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConnectIqImageResponse(ConnectIQImageResponse connectIQImageResponse) {
                ConnectIQImageResponse connectIQImageResponse2;
                SingleFieldBuilderV3<ConnectIQImageResponse, ConnectIQImageResponse.Builder, ConnectIQImageResponseOrBuilder> singleFieldBuilderV3 = this.connectIqImageResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(connectIQImageResponse);
                } else if ((this.bitField0_ & 8) == 0 || (connectIQImageResponse2 = this.connectIqImageResponse_) == null || connectIQImageResponse2 == ConnectIQImageResponse.getDefaultInstance()) {
                    this.connectIqImageResponse_ = connectIQImageResponse;
                } else {
                    getConnectIqImageResponseBuilder().mergeFrom(connectIQImageResponse);
                }
                if (this.connectIqImageResponse_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConnectIqOauthCompleteRequest(ConnectIQOAuthCompleteRequest connectIQOAuthCompleteRequest) {
                ConnectIQOAuthCompleteRequest connectIQOAuthCompleteRequest2;
                SingleFieldBuilderV3<ConnectIQOAuthCompleteRequest, ConnectIQOAuthCompleteRequest.Builder, ConnectIQOAuthCompleteRequestOrBuilder> singleFieldBuilderV3 = this.connectIqOauthCompleteRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(connectIQOAuthCompleteRequest);
                } else if ((this.bitField0_ & 256) == 0 || (connectIQOAuthCompleteRequest2 = this.connectIqOauthCompleteRequest_) == null || connectIQOAuthCompleteRequest2 == ConnectIQOAuthCompleteRequest.getDefaultInstance()) {
                    this.connectIqOauthCompleteRequest_ = connectIQOAuthCompleteRequest;
                } else {
                    getConnectIqOauthCompleteRequestBuilder().mergeFrom(connectIQOAuthCompleteRequest);
                }
                if (this.connectIqOauthCompleteRequest_ != null) {
                    this.bitField0_ |= 256;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConnectIqOauthCompleteResponse(ConnectIQOAuthCompleteResponse connectIQOAuthCompleteResponse) {
                ConnectIQOAuthCompleteResponse connectIQOAuthCompleteResponse2;
                SingleFieldBuilderV3<ConnectIQOAuthCompleteResponse, ConnectIQOAuthCompleteResponse.Builder, ConnectIQOAuthCompleteResponseOrBuilder> singleFieldBuilderV3 = this.connectIqOauthCompleteResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(connectIQOAuthCompleteResponse);
                } else if ((this.bitField0_ & 512) == 0 || (connectIQOAuthCompleteResponse2 = this.connectIqOauthCompleteResponse_) == null || connectIQOAuthCompleteResponse2 == ConnectIQOAuthCompleteResponse.getDefaultInstance()) {
                    this.connectIqOauthCompleteResponse_ = connectIQOAuthCompleteResponse;
                } else {
                    getConnectIqOauthCompleteResponseBuilder().mergeFrom(connectIQOAuthCompleteResponse);
                }
                if (this.connectIqOauthCompleteResponse_ != null) {
                    this.bitField0_ |= 512;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConnectIqOauthRequest(ConnectIQOAuthRequest connectIQOAuthRequest) {
                ConnectIQOAuthRequest connectIQOAuthRequest2;
                SingleFieldBuilderV3<ConnectIQOAuthRequest, ConnectIQOAuthRequest.Builder, ConnectIQOAuthRequestOrBuilder> singleFieldBuilderV3 = this.connectIqOauthRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(connectIQOAuthRequest);
                } else if ((this.bitField0_ & 64) == 0 || (connectIQOAuthRequest2 = this.connectIqOauthRequest_) == null || connectIQOAuthRequest2 == ConnectIQOAuthRequest.getDefaultInstance()) {
                    this.connectIqOauthRequest_ = connectIQOAuthRequest;
                } else {
                    getConnectIqOauthRequestBuilder().mergeFrom(connectIQOAuthRequest);
                }
                if (this.connectIqOauthRequest_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConnectIqOauthResponse(ConnectIQOAuthResponse connectIQOAuthResponse) {
                ConnectIQOAuthResponse connectIQOAuthResponse2;
                SingleFieldBuilderV3<ConnectIQOAuthResponse, ConnectIQOAuthResponse.Builder, ConnectIQOAuthResponseOrBuilder> singleFieldBuilderV3 = this.connectIqOauthResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(connectIQOAuthResponse);
                } else if ((this.bitField0_ & 128) == 0 || (connectIQOAuthResponse2 = this.connectIqOauthResponse_) == null || connectIQOAuthResponse2 == ConnectIQOAuthResponse.getDefaultInstance()) {
                    this.connectIqOauthResponse_ = connectIQOAuthResponse;
                } else {
                    getConnectIqOauthResponseBuilder().mergeFrom(connectIQOAuthResponse);
                }
                if (this.connectIqOauthResponse_ != null) {
                    this.bitField0_ |= 128;
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
                                    codedInputStream.readMessage(getConnectIqHttpRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                    continue;
                                case 18:
                                    codedInputStream.readMessage(getConnectIqHttpResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                    continue;
                                case 26:
                                    codedInputStream.readMessage(getConnectIqImageRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                    continue;
                                case 34:
                                    codedInputStream.readMessage(getConnectIqImageResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                    continue;
                                case 42:
                                    codedInputStream.readMessage(getRawResourceRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                    continue;
                                case 50:
                                    codedInputStream.readMessage(getRawResourceResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                    continue;
                                case 58:
                                    codedInputStream.readMessage(getConnectIqOauthRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                    continue;
                                case 66:
                                    codedInputStream.readMessage(getConnectIqOauthResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
                                    continue;
                                case 74:
                                    codedInputStream.readMessage(getConnectIqOauthCompleteRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 256;
                                    continue;
                                case 82:
                                    codedInputStream.readMessage(getConnectIqOauthCompleteResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 512;
                                    continue;
                                case 90:
                                    codedInputStream.readMessage(getOpenWebpageNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeOpenWebpageNotification(OpenWebpageNotification openWebpageNotification) {
                OpenWebpageNotification openWebpageNotification2;
                SingleFieldBuilderV3<OpenWebpageNotification, OpenWebpageNotification.Builder, OpenWebpageNotificationOrBuilder> singleFieldBuilderV3 = this.openWebpageNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(openWebpageNotification);
                } else if ((this.bitField0_ & 1024) == 0 || (openWebpageNotification2 = this.openWebpageNotification_) == null || openWebpageNotification2 == OpenWebpageNotification.getDefaultInstance()) {
                    this.openWebpageNotification_ = openWebpageNotification;
                } else {
                    getOpenWebpageNotificationBuilder().mergeFrom(openWebpageNotification);
                }
                if (this.openWebpageNotification_ != null) {
                    this.bitField0_ |= 1024;
                    onChanged();
                }
                return this;
            }

            public Builder mergeRawResourceRequest(RawResourceRequest rawResourceRequest) {
                RawResourceRequest rawResourceRequest2;
                SingleFieldBuilderV3<RawResourceRequest, RawResourceRequest.Builder, RawResourceRequestOrBuilder> singleFieldBuilderV3 = this.rawResourceRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(rawResourceRequest);
                } else if ((this.bitField0_ & 16) == 0 || (rawResourceRequest2 = this.rawResourceRequest_) == null || rawResourceRequest2 == RawResourceRequest.getDefaultInstance()) {
                    this.rawResourceRequest_ = rawResourceRequest;
                } else {
                    getRawResourceRequestBuilder().mergeFrom(rawResourceRequest);
                }
                if (this.rawResourceRequest_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeRawResourceResponse(RawResourceResponse rawResourceResponse) {
                RawResourceResponse rawResourceResponse2;
                SingleFieldBuilderV3<RawResourceResponse, RawResourceResponse.Builder, RawResourceResponseOrBuilder> singleFieldBuilderV3 = this.rawResourceResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(rawResourceResponse);
                } else if ((this.bitField0_ & 32) == 0 || (rawResourceResponse2 = this.rawResourceResponse_) == null || rawResourceResponse2 == RawResourceResponse.getDefaultInstance()) {
                    this.rawResourceResponse_ = rawResourceResponse;
                } else {
                    getRawResourceResponseBuilder().mergeFrom(rawResourceResponse);
                }
                if (this.rawResourceResponse_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setConnectIqHttpRequest(ConnectIQHTTPRequest.Builder builder) {
                SingleFieldBuilderV3<ConnectIQHTTPRequest, ConnectIQHTTPRequest.Builder, ConnectIQHTTPRequestOrBuilder> singleFieldBuilderV3 = this.connectIqHttpRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.connectIqHttpRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setConnectIqHttpResponse(ConnectIQHTTPResponse.Builder builder) {
                SingleFieldBuilderV3<ConnectIQHTTPResponse, ConnectIQHTTPResponse.Builder, ConnectIQHTTPResponseOrBuilder> singleFieldBuilderV3 = this.connectIqHttpResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.connectIqHttpResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setConnectIqImageRequest(ConnectIQImageRequest.Builder builder) {
                SingleFieldBuilderV3<ConnectIQImageRequest, ConnectIQImageRequest.Builder, ConnectIQImageRequestOrBuilder> singleFieldBuilderV3 = this.connectIqImageRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.connectIqImageRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setConnectIqImageResponse(ConnectIQImageResponse.Builder builder) {
                SingleFieldBuilderV3<ConnectIQImageResponse, ConnectIQImageResponse.Builder, ConnectIQImageResponseOrBuilder> singleFieldBuilderV3 = this.connectIqImageResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.connectIqImageResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setConnectIqOauthCompleteRequest(ConnectIQOAuthCompleteRequest.Builder builder) {
                SingleFieldBuilderV3<ConnectIQOAuthCompleteRequest, ConnectIQOAuthCompleteRequest.Builder, ConnectIQOAuthCompleteRequestOrBuilder> singleFieldBuilderV3 = this.connectIqOauthCompleteRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.connectIqOauthCompleteRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setConnectIqOauthCompleteResponse(ConnectIQOAuthCompleteResponse.Builder builder) {
                SingleFieldBuilderV3<ConnectIQOAuthCompleteResponse, ConnectIQOAuthCompleteResponse.Builder, ConnectIQOAuthCompleteResponseOrBuilder> singleFieldBuilderV3 = this.connectIqOauthCompleteResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.connectIqOauthCompleteResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setConnectIqOauthRequest(ConnectIQOAuthRequest.Builder builder) {
                SingleFieldBuilderV3<ConnectIQOAuthRequest, ConnectIQOAuthRequest.Builder, ConnectIQOAuthRequestOrBuilder> singleFieldBuilderV3 = this.connectIqOauthRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.connectIqOauthRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setConnectIqOauthResponse(ConnectIQOAuthResponse.Builder builder) {
                SingleFieldBuilderV3<ConnectIQOAuthResponse, ConnectIQOAuthResponse.Builder, ConnectIQOAuthResponseOrBuilder> singleFieldBuilderV3 = this.connectIqOauthResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.connectIqOauthResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setOpenWebpageNotification(OpenWebpageNotification.Builder builder) {
                SingleFieldBuilderV3<OpenWebpageNotification, OpenWebpageNotification.Builder, OpenWebpageNotificationOrBuilder> singleFieldBuilderV3 = this.openWebpageNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.openWebpageNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setRawResourceRequest(RawResourceRequest.Builder builder) {
                SingleFieldBuilderV3<RawResourceRequest, RawResourceRequest.Builder, RawResourceRequestOrBuilder> singleFieldBuilderV3 = this.rawResourceRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.rawResourceRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setRawResourceResponse(RawResourceResponse.Builder builder) {
                SingleFieldBuilderV3<RawResourceResponse, RawResourceResponse.Builder, RawResourceResponseOrBuilder> singleFieldBuilderV3 = this.rawResourceResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.rawResourceResponse_ = builder.build();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ConnectIQHTTPService getDefaultInstanceForType() {
                return ConnectIQHTTPService.getDefaultInstance();
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

            public Builder setConnectIqHttpRequest(ConnectIQHTTPRequest connectIQHTTPRequest) {
                SingleFieldBuilderV3<ConnectIQHTTPRequest, ConnectIQHTTPRequest.Builder, ConnectIQHTTPRequestOrBuilder> singleFieldBuilderV3 = this.connectIqHttpRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    connectIQHTTPRequest.getClass();
                    this.connectIqHttpRequest_ = connectIQHTTPRequest;
                } else {
                    singleFieldBuilderV3.setMessage(connectIQHTTPRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setConnectIqHttpResponse(ConnectIQHTTPResponse connectIQHTTPResponse) {
                SingleFieldBuilderV3<ConnectIQHTTPResponse, ConnectIQHTTPResponse.Builder, ConnectIQHTTPResponseOrBuilder> singleFieldBuilderV3 = this.connectIqHttpResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    connectIQHTTPResponse.getClass();
                    this.connectIqHttpResponse_ = connectIQHTTPResponse;
                } else {
                    singleFieldBuilderV3.setMessage(connectIQHTTPResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setConnectIqImageRequest(ConnectIQImageRequest connectIQImageRequest) {
                SingleFieldBuilderV3<ConnectIQImageRequest, ConnectIQImageRequest.Builder, ConnectIQImageRequestOrBuilder> singleFieldBuilderV3 = this.connectIqImageRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    connectIQImageRequest.getClass();
                    this.connectIqImageRequest_ = connectIQImageRequest;
                } else {
                    singleFieldBuilderV3.setMessage(connectIQImageRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setConnectIqImageResponse(ConnectIQImageResponse connectIQImageResponse) {
                SingleFieldBuilderV3<ConnectIQImageResponse, ConnectIQImageResponse.Builder, ConnectIQImageResponseOrBuilder> singleFieldBuilderV3 = this.connectIqImageResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    connectIQImageResponse.getClass();
                    this.connectIqImageResponse_ = connectIQImageResponse;
                } else {
                    singleFieldBuilderV3.setMessage(connectIQImageResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setConnectIqOauthCompleteRequest(ConnectIQOAuthCompleteRequest connectIQOAuthCompleteRequest) {
                SingleFieldBuilderV3<ConnectIQOAuthCompleteRequest, ConnectIQOAuthCompleteRequest.Builder, ConnectIQOAuthCompleteRequestOrBuilder> singleFieldBuilderV3 = this.connectIqOauthCompleteRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    connectIQOAuthCompleteRequest.getClass();
                    this.connectIqOauthCompleteRequest_ = connectIQOAuthCompleteRequest;
                } else {
                    singleFieldBuilderV3.setMessage(connectIQOAuthCompleteRequest);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setConnectIqOauthCompleteResponse(ConnectIQOAuthCompleteResponse connectIQOAuthCompleteResponse) {
                SingleFieldBuilderV3<ConnectIQOAuthCompleteResponse, ConnectIQOAuthCompleteResponse.Builder, ConnectIQOAuthCompleteResponseOrBuilder> singleFieldBuilderV3 = this.connectIqOauthCompleteResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    connectIQOAuthCompleteResponse.getClass();
                    this.connectIqOauthCompleteResponse_ = connectIQOAuthCompleteResponse;
                } else {
                    singleFieldBuilderV3.setMessage(connectIQOAuthCompleteResponse);
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setConnectIqOauthRequest(ConnectIQOAuthRequest connectIQOAuthRequest) {
                SingleFieldBuilderV3<ConnectIQOAuthRequest, ConnectIQOAuthRequest.Builder, ConnectIQOAuthRequestOrBuilder> singleFieldBuilderV3 = this.connectIqOauthRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    connectIQOAuthRequest.getClass();
                    this.connectIqOauthRequest_ = connectIQOAuthRequest;
                } else {
                    singleFieldBuilderV3.setMessage(connectIQOAuthRequest);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setConnectIqOauthResponse(ConnectIQOAuthResponse connectIQOAuthResponse) {
                SingleFieldBuilderV3<ConnectIQOAuthResponse, ConnectIQOAuthResponse.Builder, ConnectIQOAuthResponseOrBuilder> singleFieldBuilderV3 = this.connectIqOauthResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    connectIQOAuthResponse.getClass();
                    this.connectIqOauthResponse_ = connectIQOAuthResponse;
                } else {
                    singleFieldBuilderV3.setMessage(connectIQOAuthResponse);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setOpenWebpageNotification(OpenWebpageNotification openWebpageNotification) {
                SingleFieldBuilderV3<OpenWebpageNotification, OpenWebpageNotification.Builder, OpenWebpageNotificationOrBuilder> singleFieldBuilderV3 = this.openWebpageNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    openWebpageNotification.getClass();
                    this.openWebpageNotification_ = openWebpageNotification;
                } else {
                    singleFieldBuilderV3.setMessage(openWebpageNotification);
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setRawResourceRequest(RawResourceRequest rawResourceRequest) {
                SingleFieldBuilderV3<RawResourceRequest, RawResourceRequest.Builder, RawResourceRequestOrBuilder> singleFieldBuilderV3 = this.rawResourceRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    rawResourceRequest.getClass();
                    this.rawResourceRequest_ = rawResourceRequest;
                } else {
                    singleFieldBuilderV3.setMessage(rawResourceRequest);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setRawResourceResponse(RawResourceResponse rawResourceResponse) {
                SingleFieldBuilderV3<RawResourceResponse, RawResourceResponse.Builder, RawResourceResponseOrBuilder> singleFieldBuilderV3 = this.rawResourceResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    rawResourceResponse.getClass();
                    this.rawResourceResponse_ = rawResourceResponse;
                } else {
                    singleFieldBuilderV3.setMessage(rawResourceResponse);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConnectIQHTTPService) {
                    return mergeFrom((ConnectIQHTTPService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConnectIQHTTPService connectIQHTTPService) {
                if (connectIQHTTPService == ConnectIQHTTPService.getDefaultInstance()) {
                    return this;
                }
                if (connectIQHTTPService.hasConnectIqHttpRequest()) {
                    mergeConnectIqHttpRequest(connectIQHTTPService.getConnectIqHttpRequest());
                }
                if (connectIQHTTPService.hasConnectIqHttpResponse()) {
                    mergeConnectIqHttpResponse(connectIQHTTPService.getConnectIqHttpResponse());
                }
                if (connectIQHTTPService.hasConnectIqImageRequest()) {
                    mergeConnectIqImageRequest(connectIQHTTPService.getConnectIqImageRequest());
                }
                if (connectIQHTTPService.hasConnectIqImageResponse()) {
                    mergeConnectIqImageResponse(connectIQHTTPService.getConnectIqImageResponse());
                }
                if (connectIQHTTPService.hasRawResourceRequest()) {
                    mergeRawResourceRequest(connectIQHTTPService.getRawResourceRequest());
                }
                if (connectIQHTTPService.hasRawResourceResponse()) {
                    mergeRawResourceResponse(connectIQHTTPService.getRawResourceResponse());
                }
                if (connectIQHTTPService.hasConnectIqOauthRequest()) {
                    mergeConnectIqOauthRequest(connectIQHTTPService.getConnectIqOauthRequest());
                }
                if (connectIQHTTPService.hasConnectIqOauthResponse()) {
                    mergeConnectIqOauthResponse(connectIQHTTPService.getConnectIqOauthResponse());
                }
                if (connectIQHTTPService.hasConnectIqOauthCompleteRequest()) {
                    mergeConnectIqOauthCompleteRequest(connectIQHTTPService.getConnectIqOauthCompleteRequest());
                }
                if (connectIQHTTPService.hasConnectIqOauthCompleteResponse()) {
                    mergeConnectIqOauthCompleteResponse(connectIQHTTPService.getConnectIqOauthCompleteResponse());
                }
                if (connectIQHTTPService.hasOpenWebpageNotification()) {
                    mergeOpenWebpageNotification(connectIQHTTPService.getOpenWebpageNotification());
                }
                mergeUnknownFields(connectIQHTTPService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConnectIQHTTPService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ ConnectIQHTTPService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private ConnectIQHTTPService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConnectIQHTTPService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQHTTPService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectIQHTTPService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConnectIQHTTPService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConnectIQHTTPService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConnectIQHTTPService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConnectIQHTTPService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConnectIQHTTPService parseFrom(InputStream inputStream) {
            return (ConnectIQHTTPService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConnectIQHTTPService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQHTTPService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectIQHTTPService parseFrom(CodedInputStream codedInputStream) {
            return (ConnectIQHTTPService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConnectIQHTTPService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQHTTPService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ConnectIQImageRequest extends GeneratedMessageV3 implements ConnectIQImageRequestOrBuilder {
        public static final int DITHERING_FIELD_NUMBER = 7;
        public static final int MAX_HEIGHT_FIELD_NUMBER = 4;
        public static final int MAX_SIZE_FIELD_NUMBER = 5;
        public static final int MAX_WIDTH_FIELD_NUMBER = 3;
        public static final int PALETTE_FIELD_NUMBER = 6;
        public static final int PARTNUMBER_FIELD_NUMBER = 2;
        public static final int URL_FIELD_NUMBER = 1;
        public static final int USE_DATA_XFER_FIELD_NUMBER = 8;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int dithering_;
        private int maxHeight_;
        private int maxSize_;
        private int maxWidth_;
        private byte memoizedIsInitialized;
        private ByteString palette_;
        private int partNumber_;
        private volatile Object url_;
        private boolean useDataXfer_;
        private static final ConnectIQImageRequest DEFAULT_INSTANCE = new ConnectIQImageRequest();

        @Deprecated
        public static final Parser<ConnectIQImageRequest> PARSER = new AbstractParser<ConnectIQImageRequest>() { // from class: com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageRequest.1
            @Override // com.google.protobuf.Parser
            public ConnectIQImageRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConnectIQImageRequest.newBuilder();
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

        private ConnectIQImageRequest() {
            this.url_ = "";
            this.partNumber_ = 0;
            this.maxWidth_ = 0;
            this.maxHeight_ = 0;
            this.maxSize_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.palette_ = byteString;
            this.dithering_ = 0;
            this.useDataXfer_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.url_ = "";
            this.palette_ = byteString;
            this.dithering_ = 0;
        }

        public static ConnectIQImageRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQImageRequest_descriptor;
        }

        public static Builder newBuilder(ConnectIQImageRequest connectIQImageRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(connectIQImageRequest);
        }

        public static ConnectIQImageRequest parseDelimitedFrom(InputStream inputStream) {
            return (ConnectIQImageRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConnectIQImageRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConnectIQImageRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConnectIQImageRequest)) {
                return super.equals(obj);
            }
            ConnectIQImageRequest connectIQImageRequest = (ConnectIQImageRequest) obj;
            if (hasUrl() != connectIQImageRequest.hasUrl()) {
                return false;
            }
            if ((hasUrl() && !getUrl().equals(connectIQImageRequest.getUrl())) || hasPartNumber() != connectIQImageRequest.hasPartNumber()) {
                return false;
            }
            if ((hasPartNumber() && getPartNumber() != connectIQImageRequest.getPartNumber()) || hasMaxWidth() != connectIQImageRequest.hasMaxWidth()) {
                return false;
            }
            if ((hasMaxWidth() && getMaxWidth() != connectIQImageRequest.getMaxWidth()) || hasMaxHeight() != connectIQImageRequest.hasMaxHeight()) {
                return false;
            }
            if ((hasMaxHeight() && getMaxHeight() != connectIQImageRequest.getMaxHeight()) || hasMaxSize() != connectIQImageRequest.hasMaxSize()) {
                return false;
            }
            if ((hasMaxSize() && getMaxSize() != connectIQImageRequest.getMaxSize()) || hasPalette() != connectIQImageRequest.hasPalette()) {
                return false;
            }
            if ((hasPalette() && !getPalette().equals(connectIQImageRequest.getPalette())) || hasDithering() != connectIQImageRequest.hasDithering()) {
                return false;
            }
            if ((!hasDithering() || this.dithering_ == connectIQImageRequest.dithering_) && hasUseDataXfer() == connectIQImageRequest.hasUseDataXfer()) {
                return (!hasUseDataXfer() || getUseDataXfer() == connectIQImageRequest.getUseDataXfer()) && getUnknownFields().equals(connectIQImageRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageRequestOrBuilder
        public Dithering getDithering() {
            Dithering ditheringForNumber = Dithering.forNumber(this.dithering_);
            return ditheringForNumber == null ? Dithering.NONE : ditheringForNumber;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageRequestOrBuilder
        public int getMaxHeight() {
            return this.maxHeight_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageRequestOrBuilder
        public int getMaxSize() {
            return this.maxSize_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageRequestOrBuilder
        public int getMaxWidth() {
            return this.maxWidth_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageRequestOrBuilder
        public ByteString getPalette() {
            return this.palette_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConnectIQImageRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageRequestOrBuilder
        public int getPartNumber() {
            return this.partNumber_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.url_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(2, this.partNumber_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(3, this.maxWidth_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(4, this.maxHeight_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(5, this.maxSize_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeStringSize += CodedOutputStream.computeBytesSize(6, this.palette_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(7, this.dithering_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(8, this.useDataXfer_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageRequestOrBuilder
        public String getUrl() {
            Object obj = this.url_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.url_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageRequestOrBuilder
        public ByteString getUrlBytes() {
            Object obj = this.url_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.url_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageRequestOrBuilder
        public boolean getUseDataXfer() {
            return this.useDataXfer_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageRequestOrBuilder
        public boolean hasDithering() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageRequestOrBuilder
        public boolean hasMaxHeight() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageRequestOrBuilder
        public boolean hasMaxSize() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageRequestOrBuilder
        public boolean hasMaxWidth() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageRequestOrBuilder
        public boolean hasPalette() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageRequestOrBuilder
        public boolean hasPartNumber() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageRequestOrBuilder
        public boolean hasUrl() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageRequestOrBuilder
        public boolean hasUseDataXfer() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasUrl()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getUrl().hashCode();
            }
            if (hasPartNumber()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getPartNumber();
            }
            if (hasMaxWidth()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getMaxWidth();
            }
            if (hasMaxHeight()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getMaxHeight();
            }
            if (hasMaxSize()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getMaxSize();
            }
            if (hasPalette()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getPalette().hashCode();
            }
            if (hasDithering()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + this.dithering_;
            }
            if (hasUseDataXfer()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + Internal.hashBoolean(getUseDataXfer());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQImageRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectIQImageRequest.class, Builder.class);
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
            if (!hasUrl()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasPartNumber()) {
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
            return new ConnectIQImageRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.url_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.partNumber_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.maxWidth_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.maxHeight_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.maxSize_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeBytes(6, this.palette_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeEnum(7, this.dithering_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeBool(8, this.useDataXfer_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConnectIQImageRequestOrBuilder {
            private int bitField0_;
            private int dithering_;
            private int maxHeight_;
            private int maxSize_;
            private int maxWidth_;
            private ByteString palette_;
            private int partNumber_;
            private Object url_;
            private boolean useDataXfer_;

            private Builder() {
                this.url_ = "";
                this.palette_ = ByteString.EMPTY;
                this.dithering_ = 0;
            }

            private void buildPartial0(ConnectIQImageRequest connectIQImageRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    connectIQImageRequest.url_ = this.url_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    connectIQImageRequest.partNumber_ = this.partNumber_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    connectIQImageRequest.maxWidth_ = this.maxWidth_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    connectIQImageRequest.maxHeight_ = this.maxHeight_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    connectIQImageRequest.maxSize_ = this.maxSize_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    connectIQImageRequest.palette_ = this.palette_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    connectIQImageRequest.dithering_ = this.dithering_;
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    connectIQImageRequest.useDataXfer_ = this.useDataXfer_;
                    i14 |= 128;
                }
                connectIQImageRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQImageRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectIQImageRequest build() {
                ConnectIQImageRequest connectIQImageRequestBuildPartial = buildPartial();
                if (connectIQImageRequestBuildPartial.isInitialized()) {
                    return connectIQImageRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) connectIQImageRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectIQImageRequest buildPartial() {
                ConnectIQImageRequest connectIQImageRequest = new ConnectIQImageRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(connectIQImageRequest);
                }
                onBuilt();
                return connectIQImageRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.url_ = "";
                this.partNumber_ = 0;
                this.maxWidth_ = 0;
                this.maxHeight_ = 0;
                this.maxSize_ = 0;
                this.palette_ = ByteString.EMPTY;
                this.dithering_ = 0;
                this.useDataXfer_ = false;
                return this;
            }

            public Builder clearDithering() {
                this.bitField0_ &= -65;
                this.dithering_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMaxHeight() {
                this.bitField0_ &= -9;
                this.maxHeight_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxSize() {
                this.bitField0_ &= -17;
                this.maxSize_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxWidth() {
                this.bitField0_ &= -5;
                this.maxWidth_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPalette() {
                this.bitField0_ &= -33;
                this.palette_ = ConnectIQImageRequest.getDefaultInstance().getPalette();
                onChanged();
                return this;
            }

            public Builder clearPartNumber() {
                this.bitField0_ &= -3;
                this.partNumber_ = 0;
                onChanged();
                return this;
            }

            public Builder clearUrl() {
                this.url_ = ConnectIQImageRequest.getDefaultInstance().getUrl();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearUseDataXfer() {
                this.bitField0_ &= -129;
                this.useDataXfer_ = false;
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
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQImageRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageRequestOrBuilder
            public Dithering getDithering() {
                Dithering ditheringForNumber = Dithering.forNumber(this.dithering_);
                return ditheringForNumber == null ? Dithering.NONE : ditheringForNumber;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageRequestOrBuilder
            public int getMaxHeight() {
                return this.maxHeight_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageRequestOrBuilder
            public int getMaxSize() {
                return this.maxSize_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageRequestOrBuilder
            public int getMaxWidth() {
                return this.maxWidth_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageRequestOrBuilder
            public ByteString getPalette() {
                return this.palette_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageRequestOrBuilder
            public int getPartNumber() {
                return this.partNumber_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageRequestOrBuilder
            public String getUrl() {
                Object obj = this.url_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.url_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageRequestOrBuilder
            public ByteString getUrlBytes() {
                Object obj = this.url_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.url_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageRequestOrBuilder
            public boolean getUseDataXfer() {
                return this.useDataXfer_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageRequestOrBuilder
            public boolean hasDithering() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageRequestOrBuilder
            public boolean hasMaxHeight() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageRequestOrBuilder
            public boolean hasMaxSize() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageRequestOrBuilder
            public boolean hasMaxWidth() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageRequestOrBuilder
            public boolean hasPalette() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageRequestOrBuilder
            public boolean hasPartNumber() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageRequestOrBuilder
            public boolean hasUrl() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageRequestOrBuilder
            public boolean hasUseDataXfer() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQImageRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectIQImageRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasUrl() && hasPartNumber();
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
                                    this.url_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.partNumber_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.maxWidth_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.maxHeight_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.maxSize_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                } else if (tag == 50) {
                                    this.palette_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 32;
                                } else if (tag == 56) {
                                    int i14 = codedInputStream.readEnum();
                                    if (Dithering.forNumber(i14) == null) {
                                        mergeUnknownVarintField(7, i14);
                                    } else {
                                        this.dithering_ = i14;
                                        this.bitField0_ |= 64;
                                    }
                                } else if (tag == 64) {
                                    this.useDataXfer_ = codedInputStream.readBool();
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

            public Builder setDithering(Dithering dithering) {
                dithering.getClass();
                this.bitField0_ |= 64;
                this.dithering_ = dithering.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setMaxHeight(int i14) {
                this.maxHeight_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setMaxSize(int i14) {
                this.maxSize_ = i14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setMaxWidth(int i14) {
                this.maxWidth_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPalette(ByteString byteString) {
                byteString.getClass();
                this.palette_ = byteString;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setPartNumber(int i14) {
                this.partNumber_ = i14;
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

            public Builder setUrl(String str) {
                str.getClass();
                this.url_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                byteString.getClass();
                this.url_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setUseDataXfer(boolean z14) {
                this.useDataXfer_ = z14;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ConnectIQImageRequest getDefaultInstanceForType() {
                return ConnectIQImageRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.url_ = "";
                this.palette_ = ByteString.EMPTY;
                this.dithering_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConnectIQImageRequest) {
                    return mergeFrom((ConnectIQImageRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConnectIQImageRequest connectIQImageRequest) {
                if (connectIQImageRequest == ConnectIQImageRequest.getDefaultInstance()) {
                    return this;
                }
                if (connectIQImageRequest.hasUrl()) {
                    this.url_ = connectIQImageRequest.url_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (connectIQImageRequest.hasPartNumber()) {
                    setPartNumber(connectIQImageRequest.getPartNumber());
                }
                if (connectIQImageRequest.hasMaxWidth()) {
                    setMaxWidth(connectIQImageRequest.getMaxWidth());
                }
                if (connectIQImageRequest.hasMaxHeight()) {
                    setMaxHeight(connectIQImageRequest.getMaxHeight());
                }
                if (connectIQImageRequest.hasMaxSize()) {
                    setMaxSize(connectIQImageRequest.getMaxSize());
                }
                if (connectIQImageRequest.hasPalette()) {
                    setPalette(connectIQImageRequest.getPalette());
                }
                if (connectIQImageRequest.hasDithering()) {
                    setDithering(connectIQImageRequest.getDithering());
                }
                if (connectIQImageRequest.hasUseDataXfer()) {
                    setUseDataXfer(connectIQImageRequest.getUseDataXfer());
                }
                mergeUnknownFields(connectIQImageRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConnectIQImageRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConnectIQImageRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQImageRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectIQImageRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConnectIQImageRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConnectIQImageRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConnectIQImageRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConnectIQImageRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConnectIQImageRequest parseFrom(InputStream inputStream) {
            return (ConnectIQImageRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConnectIQImageRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQImageRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectIQImageRequest parseFrom(CodedInputStream codedInputStream) {
            return (ConnectIQImageRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConnectIQImageRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQImageRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Dithering implements ProtocolMessageEnum {
            NONE(0),
            FLOYD_STEINBERG(1);

            public static final int FLOYD_STEINBERG_VALUE = 1;
            public static final int NONE_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Dithering> internalValueMap = new Internal.EnumLiteMap<Dithering>() { // from class: com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageRequest.Dithering.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Dithering findValueByNumber(int i14) {
                    return Dithering.forNumber(i14);
                }
            };
            private static final Dithering[] VALUES = values();

            Dithering(int i14) {
                this.value = i14;
            }

            public static Dithering forNumber(int i14) {
                if (i14 == 0) {
                    return NONE;
                }
                if (i14 != 1) {
                    return null;
                }
                return FLOYD_STEINBERG;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ConnectIQImageRequest.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Dithering> internalGetValueMap() {
                return internalValueMap;
            }

            public static Dithering valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Dithering valueOf(int i14) {
                return forNumber(i14);
            }
        }

        private ConnectIQImageRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.url_ = "";
            this.partNumber_ = 0;
            this.maxWidth_ = 0;
            this.maxHeight_ = 0;
            this.maxSize_ = 0;
            this.palette_ = ByteString.EMPTY;
            this.dithering_ = 0;
            this.useDataXfer_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ ConnectIQImageRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class ConnectIQImageResponse extends GeneratedMessageV3 implements ConnectIQImageResponseOrBuilder {
        public static final int HEIGHT_FIELD_NUMBER = 5;
        public static final int HTTP_STATUS_CODE_FIELD_NUMBER = 2;
        public static final int IMAGE_DATA_FIELD_NUMBER = 3;
        public static final int INFLATED_SIZE_FIELD_NUMBER = 6;
        public static final int STATUS_FIELD_NUMBER = 1;
        public static final int WIDTH_FIELD_NUMBER = 4;
        public static final int XFER_DATA_FIELD_NUMBER = 7;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int height_;
        private int httpStatusCode_;
        private ByteString imageData_;
        private int inflatedSize_;
        private byte memoizedIsInitialized;
        private int status_;
        private int width_;
        private GDIDataTypes.DataTransferItem xferData_;
        private static final ConnectIQImageResponse DEFAULT_INSTANCE = new ConnectIQImageResponse();

        @Deprecated
        public static final Parser<ConnectIQImageResponse> PARSER = new AbstractParser<ConnectIQImageResponse>() { // from class: com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageResponse.1
            @Override // com.google.protobuf.Parser
            public ConnectIQImageResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConnectIQImageResponse.newBuilder();
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

        private ConnectIQImageResponse() {
            this.status_ = 0;
            this.httpStatusCode_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.width_ = 0;
            this.height_ = 0;
            this.inflatedSize_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
            this.imageData_ = byteString;
        }

        public static ConnectIQImageResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQImageResponse_descriptor;
        }

        public static Builder newBuilder(ConnectIQImageResponse connectIQImageResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(connectIQImageResponse);
        }

        public static ConnectIQImageResponse parseDelimitedFrom(InputStream inputStream) {
            return (ConnectIQImageResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConnectIQImageResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConnectIQImageResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConnectIQImageResponse)) {
                return super.equals(obj);
            }
            ConnectIQImageResponse connectIQImageResponse = (ConnectIQImageResponse) obj;
            if (hasStatus() != connectIQImageResponse.hasStatus()) {
                return false;
            }
            if ((hasStatus() && this.status_ != connectIQImageResponse.status_) || hasHttpStatusCode() != connectIQImageResponse.hasHttpStatusCode()) {
                return false;
            }
            if ((hasHttpStatusCode() && getHttpStatusCode() != connectIQImageResponse.getHttpStatusCode()) || hasImageData() != connectIQImageResponse.hasImageData()) {
                return false;
            }
            if ((hasImageData() && !getImageData().equals(connectIQImageResponse.getImageData())) || hasWidth() != connectIQImageResponse.hasWidth()) {
                return false;
            }
            if ((hasWidth() && getWidth() != connectIQImageResponse.getWidth()) || hasHeight() != connectIQImageResponse.hasHeight()) {
                return false;
            }
            if ((hasHeight() && getHeight() != connectIQImageResponse.getHeight()) || hasInflatedSize() != connectIQImageResponse.hasInflatedSize()) {
                return false;
            }
            if ((!hasInflatedSize() || getInflatedSize() == connectIQImageResponse.getInflatedSize()) && hasXferData() == connectIQImageResponse.hasXferData()) {
                return (!hasXferData() || getXferData().equals(connectIQImageResponse.getXferData())) && getUnknownFields().equals(connectIQImageResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageResponseOrBuilder
        public int getHeight() {
            return this.height_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageResponseOrBuilder
        public int getHttpStatusCode() {
            return this.httpStatusCode_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageResponseOrBuilder
        public ByteString getImageData() {
            return this.imageData_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageResponseOrBuilder
        public int getInflatedSize() {
            return this.inflatedSize_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConnectIQImageResponse> getParserForType() {
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
                iComputeEnumSize += CodedOutputStream.computeInt32Size(2, this.httpStatusCode_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeBytesSize(3, this.imageData_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(4, this.width_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(5, this.height_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(6, this.inflatedSize_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(7, getXferData());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.UNKNOWN : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageResponseOrBuilder
        public int getWidth() {
            return this.width_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageResponseOrBuilder
        public GDIDataTypes.DataTransferItem getXferData() {
            GDIDataTypes.DataTransferItem dataTransferItem = this.xferData_;
            return dataTransferItem == null ? GDIDataTypes.DataTransferItem.getDefaultInstance() : dataTransferItem;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageResponseOrBuilder
        public GDIDataTypes.DataTransferItemOrBuilder getXferDataOrBuilder() {
            GDIDataTypes.DataTransferItem dataTransferItem = this.xferData_;
            return dataTransferItem == null ? GDIDataTypes.DataTransferItem.getDefaultInstance() : dataTransferItem;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageResponseOrBuilder
        public boolean hasHeight() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageResponseOrBuilder
        public boolean hasHttpStatusCode() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageResponseOrBuilder
        public boolean hasImageData() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageResponseOrBuilder
        public boolean hasInflatedSize() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageResponseOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageResponseOrBuilder
        public boolean hasWidth() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageResponseOrBuilder
        public boolean hasXferData() {
            return (this.bitField0_ & 64) != 0;
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
            if (hasHttpStatusCode()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getHttpStatusCode();
            }
            if (hasImageData()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getImageData().hashCode();
            }
            if (hasWidth()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getWidth();
            }
            if (hasHeight()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getHeight();
            }
            if (hasInflatedSize()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getInflatedSize();
            }
            if (hasXferData()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getXferData().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQImageResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectIQImageResponse.class, Builder.class);
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
            if (!hasXferData() || getXferData().isInitialized()) {
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
            return new ConnectIQImageResponse();
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
                codedOutputStream.writeInt32(2, this.httpStatusCode_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBytes(3, this.imageData_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.width_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.height_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt32(6, this.inflatedSize_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getXferData());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConnectIQImageResponseOrBuilder {
            private int bitField0_;
            private int height_;
            private int httpStatusCode_;
            private ByteString imageData_;
            private int inflatedSize_;
            private int status_;
            private int width_;
            private SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> xferDataBuilder_;
            private GDIDataTypes.DataTransferItem xferData_;

            private Builder() {
                this.status_ = 0;
                this.imageData_ = ByteString.EMPTY;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ConnectIQImageResponse connectIQImageResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    connectIQImageResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    connectIQImageResponse.httpStatusCode_ = this.httpStatusCode_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    connectIQImageResponse.imageData_ = this.imageData_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    connectIQImageResponse.width_ = this.width_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    connectIQImageResponse.height_ = this.height_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    connectIQImageResponse.inflatedSize_ = this.inflatedSize_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                    connectIQImageResponse.xferData_ = singleFieldBuilderV3 == null ? this.xferData_ : (GDIDataTypes.DataTransferItem) singleFieldBuilderV3.build();
                    i14 |= 64;
                }
                connectIQImageResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQImageResponse_descriptor;
            }

            private SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> getXferDataFieldBuilder() {
                if (this.xferDataBuilder_ == null) {
                    this.xferDataBuilder_ = new SingleFieldBuilderV3<>(getXferData(), getParentForChildren(), isClean());
                    this.xferData_ = null;
                }
                return this.xferDataBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getXferDataFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectIQImageResponse build() {
                ConnectIQImageResponse connectIQImageResponseBuildPartial = buildPartial();
                if (connectIQImageResponseBuildPartial.isInitialized()) {
                    return connectIQImageResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) connectIQImageResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectIQImageResponse buildPartial() {
                ConnectIQImageResponse connectIQImageResponse = new ConnectIQImageResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(connectIQImageResponse);
                }
                onBuilt();
                return connectIQImageResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                this.httpStatusCode_ = 0;
                this.imageData_ = ByteString.EMPTY;
                this.width_ = 0;
                this.height_ = 0;
                this.inflatedSize_ = 0;
                this.xferData_ = null;
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.xferDataBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearHeight() {
                this.bitField0_ &= -17;
                this.height_ = 0;
                onChanged();
                return this;
            }

            public Builder clearHttpStatusCode() {
                this.bitField0_ &= -3;
                this.httpStatusCode_ = 0;
                onChanged();
                return this;
            }

            public Builder clearImageData() {
                this.bitField0_ &= -5;
                this.imageData_ = ConnectIQImageResponse.getDefaultInstance().getImageData();
                onChanged();
                return this;
            }

            public Builder clearInflatedSize() {
                this.bitField0_ &= -33;
                this.inflatedSize_ = 0;
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

            public Builder clearWidth() {
                this.bitField0_ &= -9;
                this.width_ = 0;
                onChanged();
                return this;
            }

            public Builder clearXferData() {
                this.bitField0_ &= -65;
                this.xferData_ = null;
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.xferDataBuilder_ = null;
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
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQImageResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageResponseOrBuilder
            public int getHeight() {
                return this.height_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageResponseOrBuilder
            public int getHttpStatusCode() {
                return this.httpStatusCode_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageResponseOrBuilder
            public ByteString getImageData() {
                return this.imageData_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageResponseOrBuilder
            public int getInflatedSize() {
                return this.inflatedSize_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.UNKNOWN : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageResponseOrBuilder
            public int getWidth() {
                return this.width_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageResponseOrBuilder
            public GDIDataTypes.DataTransferItem getXferData() {
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.DataTransferItem) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.DataTransferItem dataTransferItem = this.xferData_;
                return dataTransferItem == null ? GDIDataTypes.DataTransferItem.getDefaultInstance() : dataTransferItem;
            }

            public GDIDataTypes.DataTransferItem.Builder getXferDataBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (GDIDataTypes.DataTransferItem.Builder) getXferDataFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageResponseOrBuilder
            public GDIDataTypes.DataTransferItemOrBuilder getXferDataOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.DataTransferItemOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.DataTransferItem dataTransferItem = this.xferData_;
                return dataTransferItem == null ? GDIDataTypes.DataTransferItem.getDefaultInstance() : dataTransferItem;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageResponseOrBuilder
            public boolean hasHeight() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageResponseOrBuilder
            public boolean hasHttpStatusCode() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageResponseOrBuilder
            public boolean hasImageData() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageResponseOrBuilder
            public boolean hasInflatedSize() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageResponseOrBuilder
            public boolean hasWidth() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageResponseOrBuilder
            public boolean hasXferData() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQImageResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectIQImageResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasXferData() || getXferData().isInitialized();
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
                                    this.httpStatusCode_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.imageData_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.width_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.height_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                } else if (tag == 48) {
                                    this.inflatedSize_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 32;
                                } else if (tag == 58) {
                                    codedInputStream.readMessage(getXferDataFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeXferData(GDIDataTypes.DataTransferItem dataTransferItem) {
                GDIDataTypes.DataTransferItem dataTransferItem2;
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(dataTransferItem);
                } else if ((this.bitField0_ & 64) == 0 || (dataTransferItem2 = this.xferData_) == null || dataTransferItem2 == GDIDataTypes.DataTransferItem.getDefaultInstance()) {
                    this.xferData_ = dataTransferItem;
                } else {
                    getXferDataBuilder().mergeFrom(dataTransferItem);
                }
                if (this.xferData_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setHeight(int i14) {
                this.height_ = i14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setHttpStatusCode(int i14) {
                this.httpStatusCode_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setImageData(ByteString byteString) {
                byteString.getClass();
                this.imageData_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setInflatedSize(int i14) {
                this.inflatedSize_ = i14;
                this.bitField0_ |= 32;
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

            public Builder setWidth(int i14) {
                this.width_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setXferData(GDIDataTypes.DataTransferItem.Builder builder) {
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.xferData_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ConnectIQImageResponse getDefaultInstanceForType() {
                return ConnectIQImageResponse.getDefaultInstance();
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
                this.imageData_ = ByteString.EMPTY;
                maybeForceBuilderInitialization();
            }

            public Builder setXferData(GDIDataTypes.DataTransferItem dataTransferItem) {
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    dataTransferItem.getClass();
                    this.xferData_ = dataTransferItem;
                } else {
                    singleFieldBuilderV3.setMessage(dataTransferItem);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConnectIQImageResponse) {
                    return mergeFrom((ConnectIQImageResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConnectIQImageResponse connectIQImageResponse) {
                if (connectIQImageResponse == ConnectIQImageResponse.getDefaultInstance()) {
                    return this;
                }
                if (connectIQImageResponse.hasStatus()) {
                    setStatus(connectIQImageResponse.getStatus());
                }
                if (connectIQImageResponse.hasHttpStatusCode()) {
                    setHttpStatusCode(connectIQImageResponse.getHttpStatusCode());
                }
                if (connectIQImageResponse.hasImageData()) {
                    setImageData(connectIQImageResponse.getImageData());
                }
                if (connectIQImageResponse.hasWidth()) {
                    setWidth(connectIQImageResponse.getWidth());
                }
                if (connectIQImageResponse.hasHeight()) {
                    setHeight(connectIQImageResponse.getHeight());
                }
                if (connectIQImageResponse.hasInflatedSize()) {
                    setInflatedSize(connectIQImageResponse.getInflatedSize());
                }
                if (connectIQImageResponse.hasXferData()) {
                    mergeXferData(connectIQImageResponse.getXferData());
                }
                mergeUnknownFields(connectIQImageResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConnectIQImageResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConnectIQImageResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQImageResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectIQImageResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConnectIQImageResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConnectIQImageResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConnectIQImageResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConnectIQImageResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConnectIQImageResponse parseFrom(InputStream inputStream) {
            return (ConnectIQImageResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConnectIQImageResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQImageResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectIQImageResponse parseFrom(CodedInputStream codedInputStream) {
            return (ConnectIQImageResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConnectIQImageResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQImageResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private ConnectIQImageResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.httpStatusCode_ = 0;
            this.imageData_ = ByteString.EMPTY;
            this.width_ = 0;
            this.height_ = 0;
            this.inflatedSize_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            UNKNOWN(0),
            OK(100),
            NETWORK_REQUEST_TIMED_OUT(200),
            IMAGE_TOO_LARGE(300);

            public static final int IMAGE_TOO_LARGE_VALUE = 300;
            public static final int NETWORK_REQUEST_TIMED_OUT_VALUE = 200;
            public static final int OK_VALUE = 100;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQImageResponse.ResponseStatus.1
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
                if (i14 == 100) {
                    return OK;
                }
                if (i14 == 200) {
                    return NETWORK_REQUEST_TIMED_OUT;
                }
                if (i14 != 300) {
                    return null;
                }
                return IMAGE_TOO_LARGE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ConnectIQImageResponse.getDescriptor().getEnumTypes().get(0);
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

        public /* synthetic */ ConnectIQImageResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class ConnectIQOAuthCompleteRequest extends GeneratedMessageV3 implements ConnectIQOAuthCompleteRequestOrBuilder {
        public static final int APP_UUID_FIELD_NUMBER = 3;
        public static final int COMPRESSED_FIELD_NUMBER = 6;
        public static final int DATA_FIELD_NUMBER = 4;
        public static final int ENCRYPTED_FIELD_NUMBER = 5;
        public static final int HTTP_STATUS_CODE_FIELD_NUMBER = 2;
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private ByteString appUuid_;
        private int bitField0_;
        private boolean compressed_;
        private ByteString data_;
        private boolean encrypted_;
        private int httpStatusCode_;
        private byte memoizedIsInitialized;
        private int status_;
        private static final ConnectIQOAuthCompleteRequest DEFAULT_INSTANCE = new ConnectIQOAuthCompleteRequest();

        @Deprecated
        public static final Parser<ConnectIQOAuthCompleteRequest> PARSER = new AbstractParser<ConnectIQOAuthCompleteRequest>() { // from class: com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest.1
            @Override // com.google.protobuf.Parser
            public ConnectIQOAuthCompleteRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConnectIQOAuthCompleteRequest.newBuilder();
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

        private ConnectIQOAuthCompleteRequest() {
            this.status_ = 0;
            this.httpStatusCode_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.encrypted_ = false;
            this.compressed_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
            this.appUuid_ = byteString;
            this.data_ = byteString;
        }

        public static ConnectIQOAuthCompleteRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQOAuthCompleteRequest_descriptor;
        }

        public static Builder newBuilder(ConnectIQOAuthCompleteRequest connectIQOAuthCompleteRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(connectIQOAuthCompleteRequest);
        }

        public static ConnectIQOAuthCompleteRequest parseDelimitedFrom(InputStream inputStream) {
            return (ConnectIQOAuthCompleteRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConnectIQOAuthCompleteRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConnectIQOAuthCompleteRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConnectIQOAuthCompleteRequest)) {
                return super.equals(obj);
            }
            ConnectIQOAuthCompleteRequest connectIQOAuthCompleteRequest = (ConnectIQOAuthCompleteRequest) obj;
            if (hasStatus() != connectIQOAuthCompleteRequest.hasStatus()) {
                return false;
            }
            if ((hasStatus() && this.status_ != connectIQOAuthCompleteRequest.status_) || hasHttpStatusCode() != connectIQOAuthCompleteRequest.hasHttpStatusCode()) {
                return false;
            }
            if ((hasHttpStatusCode() && getHttpStatusCode() != connectIQOAuthCompleteRequest.getHttpStatusCode()) || hasAppUuid() != connectIQOAuthCompleteRequest.hasAppUuid()) {
                return false;
            }
            if ((hasAppUuid() && !getAppUuid().equals(connectIQOAuthCompleteRequest.getAppUuid())) || hasData() != connectIQOAuthCompleteRequest.hasData()) {
                return false;
            }
            if ((hasData() && !getData().equals(connectIQOAuthCompleteRequest.getData())) || hasEncrypted() != connectIQOAuthCompleteRequest.hasEncrypted()) {
                return false;
            }
            if ((!hasEncrypted() || getEncrypted() == connectIQOAuthCompleteRequest.getEncrypted()) && hasCompressed() == connectIQOAuthCompleteRequest.hasCompressed()) {
                return (!hasCompressed() || getCompressed() == connectIQOAuthCompleteRequest.getCompressed()) && getUnknownFields().equals(connectIQOAuthCompleteRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequestOrBuilder
        public ByteString getAppUuid() {
            return this.appUuid_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequestOrBuilder
        public boolean getCompressed() {
            return this.compressed_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequestOrBuilder
        public ByteString getData() {
            return this.data_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequestOrBuilder
        public boolean getEncrypted() {
            return this.encrypted_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequestOrBuilder
        public int getHttpStatusCode() {
            return this.httpStatusCode_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConnectIQOAuthCompleteRequest> getParserForType() {
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
                iComputeEnumSize += CodedOutputStream.computeInt32Size(2, this.httpStatusCode_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeBytesSize(3, this.appUuid_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeEnumSize += CodedOutputStream.computeBytesSize(4, this.data_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeEnumSize += CodedOutputStream.computeBoolSize(5, this.encrypted_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeEnumSize += CodedOutputStream.computeBoolSize(6, this.compressed_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequestOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.UNKNOWN : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequestOrBuilder
        public boolean hasAppUuid() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequestOrBuilder
        public boolean hasCompressed() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequestOrBuilder
        public boolean hasData() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequestOrBuilder
        public boolean hasEncrypted() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequestOrBuilder
        public boolean hasHttpStatusCode() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequestOrBuilder
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
            if (hasHttpStatusCode()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getHttpStatusCode();
            }
            if (hasAppUuid()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getAppUuid().hashCode();
            }
            if (hasData()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getData().hashCode();
            }
            if (hasEncrypted()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + Internal.hashBoolean(getEncrypted());
            }
            if (hasCompressed()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + Internal.hashBoolean(getCompressed());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQOAuthCompleteRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectIQOAuthCompleteRequest.class, Builder.class);
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
            if (hasAppUuid()) {
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
            return new ConnectIQOAuthCompleteRequest();
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
                codedOutputStream.writeInt32(2, this.httpStatusCode_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBytes(3, this.appUuid_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeBytes(4, this.data_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeBool(5, this.encrypted_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeBool(6, this.compressed_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConnectIQOAuthCompleteRequestOrBuilder {
            private ByteString appUuid_;
            private int bitField0_;
            private boolean compressed_;
            private ByteString data_;
            private boolean encrypted_;
            private int httpStatusCode_;
            private int status_;

            private Builder() {
                this.status_ = 0;
                ByteString byteString = ByteString.EMPTY;
                this.appUuid_ = byteString;
                this.data_ = byteString;
            }

            private void buildPartial0(ConnectIQOAuthCompleteRequest connectIQOAuthCompleteRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    connectIQOAuthCompleteRequest.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    connectIQOAuthCompleteRequest.httpStatusCode_ = this.httpStatusCode_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    connectIQOAuthCompleteRequest.appUuid_ = this.appUuid_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    connectIQOAuthCompleteRequest.data_ = this.data_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    connectIQOAuthCompleteRequest.encrypted_ = this.encrypted_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    connectIQOAuthCompleteRequest.compressed_ = this.compressed_;
                    i14 |= 32;
                }
                connectIQOAuthCompleteRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQOAuthCompleteRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectIQOAuthCompleteRequest build() {
                ConnectIQOAuthCompleteRequest connectIQOAuthCompleteRequestBuildPartial = buildPartial();
                if (connectIQOAuthCompleteRequestBuildPartial.isInitialized()) {
                    return connectIQOAuthCompleteRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) connectIQOAuthCompleteRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectIQOAuthCompleteRequest buildPartial() {
                ConnectIQOAuthCompleteRequest connectIQOAuthCompleteRequest = new ConnectIQOAuthCompleteRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(connectIQOAuthCompleteRequest);
                }
                onBuilt();
                return connectIQOAuthCompleteRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                this.httpStatusCode_ = 0;
                ByteString byteString = ByteString.EMPTY;
                this.appUuid_ = byteString;
                this.data_ = byteString;
                this.encrypted_ = false;
                this.compressed_ = false;
                return this;
            }

            public Builder clearAppUuid() {
                this.bitField0_ &= -5;
                this.appUuid_ = ConnectIQOAuthCompleteRequest.getDefaultInstance().getAppUuid();
                onChanged();
                return this;
            }

            public Builder clearCompressed() {
                this.bitField0_ &= -33;
                this.compressed_ = false;
                onChanged();
                return this;
            }

            public Builder clearData() {
                this.bitField0_ &= -9;
                this.data_ = ConnectIQOAuthCompleteRequest.getDefaultInstance().getData();
                onChanged();
                return this;
            }

            public Builder clearEncrypted() {
                this.bitField0_ &= -17;
                this.encrypted_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearHttpStatusCode() {
                this.bitField0_ &= -3;
                this.httpStatusCode_ = 0;
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

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequestOrBuilder
            public ByteString getAppUuid() {
                return this.appUuid_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequestOrBuilder
            public boolean getCompressed() {
                return this.compressed_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequestOrBuilder
            public ByteString getData() {
                return this.data_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQOAuthCompleteRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequestOrBuilder
            public boolean getEncrypted() {
                return this.encrypted_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequestOrBuilder
            public int getHttpStatusCode() {
                return this.httpStatusCode_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequestOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.UNKNOWN : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequestOrBuilder
            public boolean hasAppUuid() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequestOrBuilder
            public boolean hasCompressed() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequestOrBuilder
            public boolean hasData() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequestOrBuilder
            public boolean hasEncrypted() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequestOrBuilder
            public boolean hasHttpStatusCode() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequestOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQOAuthCompleteRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectIQOAuthCompleteRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasStatus() && hasAppUuid();
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
                                    this.httpStatusCode_ = codedInputStream.readInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.appUuid_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.data_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.encrypted_ = codedInputStream.readBool();
                                    this.bitField0_ |= 16;
                                } else if (tag == 48) {
                                    this.compressed_ = codedInputStream.readBool();
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

            public Builder setAppUuid(ByteString byteString) {
                byteString.getClass();
                this.appUuid_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setCompressed(boolean z14) {
                this.compressed_ = z14;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setData(ByteString byteString) {
                byteString.getClass();
                this.data_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setEncrypted(boolean z14) {
                this.encrypted_ = z14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setHttpStatusCode(int i14) {
                this.httpStatusCode_ = i14;
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
            public ConnectIQOAuthCompleteRequest getDefaultInstanceForType() {
                return ConnectIQOAuthCompleteRequest.getDefaultInstance();
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
                ByteString byteString = ByteString.EMPTY;
                this.appUuid_ = byteString;
                this.data_ = byteString;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConnectIQOAuthCompleteRequest) {
                    return mergeFrom((ConnectIQOAuthCompleteRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConnectIQOAuthCompleteRequest connectIQOAuthCompleteRequest) {
                if (connectIQOAuthCompleteRequest == ConnectIQOAuthCompleteRequest.getDefaultInstance()) {
                    return this;
                }
                if (connectIQOAuthCompleteRequest.hasStatus()) {
                    setStatus(connectIQOAuthCompleteRequest.getStatus());
                }
                if (connectIQOAuthCompleteRequest.hasHttpStatusCode()) {
                    setHttpStatusCode(connectIQOAuthCompleteRequest.getHttpStatusCode());
                }
                if (connectIQOAuthCompleteRequest.hasAppUuid()) {
                    setAppUuid(connectIQOAuthCompleteRequest.getAppUuid());
                }
                if (connectIQOAuthCompleteRequest.hasData()) {
                    setData(connectIQOAuthCompleteRequest.getData());
                }
                if (connectIQOAuthCompleteRequest.hasEncrypted()) {
                    setEncrypted(connectIQOAuthCompleteRequest.getEncrypted());
                }
                if (connectIQOAuthCompleteRequest.hasCompressed()) {
                    setCompressed(connectIQOAuthCompleteRequest.getCompressed());
                }
                mergeUnknownFields(connectIQOAuthCompleteRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConnectIQOAuthCompleteRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConnectIQOAuthCompleteRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQOAuthCompleteRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectIQOAuthCompleteRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConnectIQOAuthCompleteRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConnectIQOAuthCompleteRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConnectIQOAuthCompleteRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConnectIQOAuthCompleteRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConnectIQOAuthCompleteRequest parseFrom(InputStream inputStream) {
            return (ConnectIQOAuthCompleteRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConnectIQOAuthCompleteRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQOAuthCompleteRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectIQOAuthCompleteRequest parseFrom(CodedInputStream codedInputStream) {
            return (ConnectIQOAuthCompleteRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConnectIQOAuthCompleteRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQOAuthCompleteRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private ConnectIQOAuthCompleteRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.httpStatusCode_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.appUuid_ = byteString;
            this.data_ = byteString;
            this.encrypted_ = false;
            this.compressed_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            UNKNOWN(0),
            OK(1),
            WEB_REQUEST_ERROR(2);

            public static final int OK_VALUE = 1;
            public static final int UNKNOWN_VALUE = 0;
            public static final int WEB_REQUEST_ERROR_VALUE = 2;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthCompleteRequest.ResponseStatus.1
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
                if (i14 != 2) {
                    return null;
                }
                return WEB_REQUEST_ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ConnectIQOAuthCompleteRequest.getDescriptor().getEnumTypes().get(0);
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

        public /* synthetic */ ConnectIQOAuthCompleteRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class ConnectIQOAuthCompleteResponse extends GeneratedMessageV3 implements ConnectIQOAuthCompleteResponseOrBuilder {
        private static final ConnectIQOAuthCompleteResponse DEFAULT_INSTANCE = new ConnectIQOAuthCompleteResponse();

        @Deprecated
        public static final Parser<ConnectIQOAuthCompleteResponse> PARSER = new AbstractParser<ConnectIQOAuthCompleteResponse>() { // from class: com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse.1
            @Override // com.google.protobuf.Parser
            public ConnectIQOAuthCompleteResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConnectIQOAuthCompleteResponse.newBuilder();
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

        private ConnectIQOAuthCompleteResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConnectIQOAuthCompleteResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQOAuthCompleteResponse_descriptor;
        }

        public static Builder newBuilder(ConnectIQOAuthCompleteResponse connectIQOAuthCompleteResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(connectIQOAuthCompleteResponse);
        }

        public static ConnectIQOAuthCompleteResponse parseDelimitedFrom(InputStream inputStream) {
            return (ConnectIQOAuthCompleteResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConnectIQOAuthCompleteResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConnectIQOAuthCompleteResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConnectIQOAuthCompleteResponse)) {
                return super.equals(obj);
            }
            ConnectIQOAuthCompleteResponse connectIQOAuthCompleteResponse = (ConnectIQOAuthCompleteResponse) obj;
            if (hasStatus() != connectIQOAuthCompleteResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == connectIQOAuthCompleteResponse.status_) && getUnknownFields().equals(connectIQOAuthCompleteResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConnectIQOAuthCompleteResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.UNKNOWN : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponseOrBuilder
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
            return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQOAuthCompleteResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectIQOAuthCompleteResponse.class, Builder.class);
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
            return new ConnectIQOAuthCompleteResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConnectIQOAuthCompleteResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(ConnectIQOAuthCompleteResponse connectIQOAuthCompleteResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    connectIQOAuthCompleteResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                connectIQOAuthCompleteResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQOAuthCompleteResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectIQOAuthCompleteResponse build() {
                ConnectIQOAuthCompleteResponse connectIQOAuthCompleteResponseBuildPartial = buildPartial();
                if (connectIQOAuthCompleteResponseBuildPartial.isInitialized()) {
                    return connectIQOAuthCompleteResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) connectIQOAuthCompleteResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectIQOAuthCompleteResponse buildPartial() {
                ConnectIQOAuthCompleteResponse connectIQOAuthCompleteResponse = new ConnectIQOAuthCompleteResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(connectIQOAuthCompleteResponse);
                }
                onBuilt();
                return connectIQOAuthCompleteResponse;
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
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQOAuthCompleteResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.UNKNOWN : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQOAuthCompleteResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectIQOAuthCompleteResponse.class, Builder.class);
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
            public ConnectIQOAuthCompleteResponse getDefaultInstanceForType() {
                return ConnectIQOAuthCompleteResponse.getDefaultInstance();
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
                if (message instanceof ConnectIQOAuthCompleteResponse) {
                    return mergeFrom((ConnectIQOAuthCompleteResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConnectIQOAuthCompleteResponse connectIQOAuthCompleteResponse) {
                if (connectIQOAuthCompleteResponse == ConnectIQOAuthCompleteResponse.getDefaultInstance()) {
                    return this;
                }
                if (connectIQOAuthCompleteResponse.hasStatus()) {
                    setStatus(connectIQOAuthCompleteResponse.getStatus());
                }
                mergeUnknownFields(connectIQOAuthCompleteResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConnectIQOAuthCompleteResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConnectIQOAuthCompleteResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQOAuthCompleteResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectIQOAuthCompleteResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ConnectIQOAuthCompleteResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ConnectIQOAuthCompleteResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ConnectIQOAuthCompleteResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConnectIQOAuthCompleteResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConnectIQOAuthCompleteResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConnectIQOAuthCompleteResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConnectIQOAuthCompleteResponse parseFrom(InputStream inputStream) {
            return (ConnectIQOAuthCompleteResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConnectIQOAuthCompleteResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQOAuthCompleteResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectIQOAuthCompleteResponse parseFrom(CodedInputStream codedInputStream) {
            return (ConnectIQOAuthCompleteResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConnectIQOAuthCompleteResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQOAuthCompleteResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            UNKNOWN(0),
            OK(1);

            public static final int OK_VALUE = 1;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthCompleteResponse.ResponseStatus.1
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
                if (i14 != 1) {
                    return null;
                }
                return OK;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ConnectIQOAuthCompleteResponse.getDescriptor().getEnumTypes().get(0);
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

    /* JADX INFO: loaded from: classes4.dex */
    public static final class ConnectIQOAuthRequest extends GeneratedMessageV3 implements ConnectIQOAuthRequestOrBuilder {
        public static final int APP_NAME_FIELD_NUMBER = 8;
        public static final int APP_UUID_FIELD_NUMBER = 9;
        public static final int INITIAL_URL_FIELD_NUMBER = 1;
        public static final int INITIAL_URL_PARAMETERS_FIELD_NUMBER = 2;
        public static final int PARAMETERS_COMPRESSED_FIELD_NUMBER = 4;
        public static final int PARAMETERS_ENCRYPTED_FIELD_NUMBER = 3;
        public static final int RESULT_KEYS_FIELD_NUMBER = 7;
        public static final int RESULT_TYPE_FIELD_NUMBER = 6;
        public static final int RESULT_URL_FIELD_NUMBER = 5;
        public static final int STORE_UUID_FIELD_NUMBER = 10;
        private static final long serialVersionUID = 0;
        private volatile Object appName_;
        private ByteString appUuid_;
        private int bitField0_;
        private ByteString initialUrlParameters_;
        private volatile Object initialUrl_;
        private byte memoizedIsInitialized;
        private boolean parametersCompressed_;
        private boolean parametersEncrypted_;
        private ByteString resultKeys_;
        private int resultType_;
        private volatile Object resultUrl_;
        private ByteString storeUuid_;
        private static final ConnectIQOAuthRequest DEFAULT_INSTANCE = new ConnectIQOAuthRequest();

        @Deprecated
        public static final Parser<ConnectIQOAuthRequest> PARSER = new AbstractParser<ConnectIQOAuthRequest>() { // from class: com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequest.1
            @Override // com.google.protobuf.Parser
            public ConnectIQOAuthRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConnectIQOAuthRequest.newBuilder();
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

        private ConnectIQOAuthRequest() {
            this.initialUrl_ = "";
            ByteString byteString = ByteString.EMPTY;
            this.initialUrlParameters_ = byteString;
            this.parametersEncrypted_ = false;
            this.parametersCompressed_ = false;
            this.resultUrl_ = "";
            this.resultType_ = 0;
            this.resultKeys_ = byteString;
            this.appName_ = "";
            this.appUuid_ = byteString;
            this.storeUuid_ = byteString;
            this.memoizedIsInitialized = (byte) -1;
            this.initialUrl_ = "";
            this.initialUrlParameters_ = byteString;
            this.resultUrl_ = "";
            this.resultType_ = 0;
            this.resultKeys_ = byteString;
            this.appName_ = "";
            this.appUuid_ = byteString;
            this.storeUuid_ = byteString;
        }

        public static ConnectIQOAuthRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQOAuthRequest_descriptor;
        }

        public static Builder newBuilder(ConnectIQOAuthRequest connectIQOAuthRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(connectIQOAuthRequest);
        }

        public static ConnectIQOAuthRequest parseDelimitedFrom(InputStream inputStream) {
            return (ConnectIQOAuthRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConnectIQOAuthRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConnectIQOAuthRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConnectIQOAuthRequest)) {
                return super.equals(obj);
            }
            ConnectIQOAuthRequest connectIQOAuthRequest = (ConnectIQOAuthRequest) obj;
            if (hasInitialUrl() != connectIQOAuthRequest.hasInitialUrl()) {
                return false;
            }
            if ((hasInitialUrl() && !getInitialUrl().equals(connectIQOAuthRequest.getInitialUrl())) || hasInitialUrlParameters() != connectIQOAuthRequest.hasInitialUrlParameters()) {
                return false;
            }
            if ((hasInitialUrlParameters() && !getInitialUrlParameters().equals(connectIQOAuthRequest.getInitialUrlParameters())) || hasParametersEncrypted() != connectIQOAuthRequest.hasParametersEncrypted()) {
                return false;
            }
            if ((hasParametersEncrypted() && getParametersEncrypted() != connectIQOAuthRequest.getParametersEncrypted()) || hasParametersCompressed() != connectIQOAuthRequest.hasParametersCompressed()) {
                return false;
            }
            if ((hasParametersCompressed() && getParametersCompressed() != connectIQOAuthRequest.getParametersCompressed()) || hasResultUrl() != connectIQOAuthRequest.hasResultUrl()) {
                return false;
            }
            if ((hasResultUrl() && !getResultUrl().equals(connectIQOAuthRequest.getResultUrl())) || hasResultType() != connectIQOAuthRequest.hasResultType()) {
                return false;
            }
            if ((hasResultType() && this.resultType_ != connectIQOAuthRequest.resultType_) || hasResultKeys() != connectIQOAuthRequest.hasResultKeys()) {
                return false;
            }
            if ((hasResultKeys() && !getResultKeys().equals(connectIQOAuthRequest.getResultKeys())) || hasAppName() != connectIQOAuthRequest.hasAppName()) {
                return false;
            }
            if ((hasAppName() && !getAppName().equals(connectIQOAuthRequest.getAppName())) || hasAppUuid() != connectIQOAuthRequest.hasAppUuid()) {
                return false;
            }
            if ((!hasAppUuid() || getAppUuid().equals(connectIQOAuthRequest.getAppUuid())) && hasStoreUuid() == connectIQOAuthRequest.hasStoreUuid()) {
                return (!hasStoreUuid() || getStoreUuid().equals(connectIQOAuthRequest.getStoreUuid())) && getUnknownFields().equals(connectIQOAuthRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
        public String getAppName() {
            Object obj = this.appName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.appName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
        public ByteString getAppNameBytes() {
            Object obj = this.appName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
        public ByteString getAppUuid() {
            return this.appUuid_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
        public String getInitialUrl() {
            Object obj = this.initialUrl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.initialUrl_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
        public ByteString getInitialUrlBytes() {
            Object obj = this.initialUrl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.initialUrl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
        public ByteString getInitialUrlParameters() {
            return this.initialUrlParameters_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
        public boolean getParametersCompressed() {
            return this.parametersCompressed_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
        public boolean getParametersEncrypted() {
            return this.parametersEncrypted_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConnectIQOAuthRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
        public ByteString getResultKeys() {
            return this.resultKeys_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
        public ResultFormat getResultType() {
            ResultFormat resultFormatForNumber = ResultFormat.forNumber(this.resultType_);
            return resultFormatForNumber == null ? ResultFormat.URL : resultFormatForNumber;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
        public String getResultUrl() {
            Object obj = this.resultUrl_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.resultUrl_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
        public ByteString getResultUrlBytes() {
            Object obj = this.resultUrl_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.resultUrl_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.initialUrl_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeBytesSize(2, this.initialUrlParameters_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(3, this.parametersEncrypted_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(4, this.parametersCompressed_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(5, this.resultUrl_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(6, this.resultType_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeStringSize += CodedOutputStream.computeBytesSize(7, this.resultKeys_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(8, this.appName_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeStringSize += CodedOutputStream.computeBytesSize(9, this.appUuid_);
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeStringSize += CodedOutputStream.computeBytesSize(10, this.storeUuid_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
        public ByteString getStoreUuid() {
            return this.storeUuid_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
        public boolean hasAppName() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
        public boolean hasAppUuid() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
        public boolean hasInitialUrl() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
        public boolean hasInitialUrlParameters() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
        public boolean hasParametersCompressed() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
        public boolean hasParametersEncrypted() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
        public boolean hasResultKeys() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
        public boolean hasResultType() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
        public boolean hasResultUrl() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
        public boolean hasStoreUuid() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasInitialUrl()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getInitialUrl().hashCode();
            }
            if (hasInitialUrlParameters()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getInitialUrlParameters().hashCode();
            }
            if (hasParametersEncrypted()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashBoolean(getParametersEncrypted());
            }
            if (hasParametersCompressed()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Internal.hashBoolean(getParametersCompressed());
            }
            if (hasResultUrl()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getResultUrl().hashCode();
            }
            if (hasResultType()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + this.resultType_;
            }
            if (hasResultKeys()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getResultKeys().hashCode();
            }
            if (hasAppName()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getAppName().hashCode();
            }
            if (hasAppUuid()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getAppUuid().hashCode();
            }
            if (hasStoreUuid()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getStoreUuid().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQOAuthRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectIQOAuthRequest.class, Builder.class);
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
            if (!hasInitialUrl()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasResultUrl()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasAppUuid()) {
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
            return new ConnectIQOAuthRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.initialUrl_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBytes(2, this.initialUrlParameters_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(3, this.parametersEncrypted_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeBool(4, this.parametersCompressed_);
            }
            if ((this.bitField0_ & 16) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 5, this.resultUrl_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeEnum(6, this.resultType_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeBytes(7, this.resultKeys_);
            }
            if ((this.bitField0_ & 128) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 8, this.appName_);
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeBytes(9, this.appUuid_);
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeBytes(10, this.storeUuid_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConnectIQOAuthRequestOrBuilder {
            private Object appName_;
            private ByteString appUuid_;
            private int bitField0_;
            private ByteString initialUrlParameters_;
            private Object initialUrl_;
            private boolean parametersCompressed_;
            private boolean parametersEncrypted_;
            private ByteString resultKeys_;
            private int resultType_;
            private Object resultUrl_;
            private ByteString storeUuid_;

            private Builder() {
                this.initialUrl_ = "";
                ByteString byteString = ByteString.EMPTY;
                this.initialUrlParameters_ = byteString;
                this.resultUrl_ = "";
                this.resultType_ = 0;
                this.resultKeys_ = byteString;
                this.appName_ = "";
                this.appUuid_ = byteString;
                this.storeUuid_ = byteString;
            }

            private void buildPartial0(ConnectIQOAuthRequest connectIQOAuthRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    connectIQOAuthRequest.initialUrl_ = this.initialUrl_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    connectIQOAuthRequest.initialUrlParameters_ = this.initialUrlParameters_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    connectIQOAuthRequest.parametersEncrypted_ = this.parametersEncrypted_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    connectIQOAuthRequest.parametersCompressed_ = this.parametersCompressed_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    connectIQOAuthRequest.resultUrl_ = this.resultUrl_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    connectIQOAuthRequest.resultType_ = this.resultType_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    connectIQOAuthRequest.resultKeys_ = this.resultKeys_;
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    connectIQOAuthRequest.appName_ = this.appName_;
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    connectIQOAuthRequest.appUuid_ = this.appUuid_;
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    connectIQOAuthRequest.storeUuid_ = this.storeUuid_;
                    i14 |= 512;
                }
                connectIQOAuthRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQOAuthRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectIQOAuthRequest build() {
                ConnectIQOAuthRequest connectIQOAuthRequestBuildPartial = buildPartial();
                if (connectIQOAuthRequestBuildPartial.isInitialized()) {
                    return connectIQOAuthRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) connectIQOAuthRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectIQOAuthRequest buildPartial() {
                ConnectIQOAuthRequest connectIQOAuthRequest = new ConnectIQOAuthRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(connectIQOAuthRequest);
                }
                onBuilt();
                return connectIQOAuthRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.initialUrl_ = "";
                ByteString byteString = ByteString.EMPTY;
                this.initialUrlParameters_ = byteString;
                this.parametersEncrypted_ = false;
                this.parametersCompressed_ = false;
                this.resultUrl_ = "";
                this.resultType_ = 0;
                this.resultKeys_ = byteString;
                this.appName_ = "";
                this.appUuid_ = byteString;
                this.storeUuid_ = byteString;
                return this;
            }

            public Builder clearAppName() {
                this.appName_ = ConnectIQOAuthRequest.getDefaultInstance().getAppName();
                this.bitField0_ &= -129;
                onChanged();
                return this;
            }

            public Builder clearAppUuid() {
                this.bitField0_ &= -257;
                this.appUuid_ = ConnectIQOAuthRequest.getDefaultInstance().getAppUuid();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearInitialUrl() {
                this.initialUrl_ = ConnectIQOAuthRequest.getDefaultInstance().getInitialUrl();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearInitialUrlParameters() {
                this.bitField0_ &= -3;
                this.initialUrlParameters_ = ConnectIQOAuthRequest.getDefaultInstance().getInitialUrlParameters();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearParametersCompressed() {
                this.bitField0_ &= -9;
                this.parametersCompressed_ = false;
                onChanged();
                return this;
            }

            public Builder clearParametersEncrypted() {
                this.bitField0_ &= -5;
                this.parametersEncrypted_ = false;
                onChanged();
                return this;
            }

            public Builder clearResultKeys() {
                this.bitField0_ &= -65;
                this.resultKeys_ = ConnectIQOAuthRequest.getDefaultInstance().getResultKeys();
                onChanged();
                return this;
            }

            public Builder clearResultType() {
                this.bitField0_ &= -33;
                this.resultType_ = 0;
                onChanged();
                return this;
            }

            public Builder clearResultUrl() {
                this.resultUrl_ = ConnectIQOAuthRequest.getDefaultInstance().getResultUrl();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder clearStoreUuid() {
                this.bitField0_ &= -513;
                this.storeUuid_ = ConnectIQOAuthRequest.getDefaultInstance().getStoreUuid();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
            public String getAppName() {
                Object obj = this.appName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.appName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
            public ByteString getAppNameBytes() {
                Object obj = this.appName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.appName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
            public ByteString getAppUuid() {
                return this.appUuid_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQOAuthRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
            public String getInitialUrl() {
                Object obj = this.initialUrl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.initialUrl_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
            public ByteString getInitialUrlBytes() {
                Object obj = this.initialUrl_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.initialUrl_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
            public ByteString getInitialUrlParameters() {
                return this.initialUrlParameters_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
            public boolean getParametersCompressed() {
                return this.parametersCompressed_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
            public boolean getParametersEncrypted() {
                return this.parametersEncrypted_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
            public ByteString getResultKeys() {
                return this.resultKeys_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
            public ResultFormat getResultType() {
                ResultFormat resultFormatForNumber = ResultFormat.forNumber(this.resultType_);
                return resultFormatForNumber == null ? ResultFormat.URL : resultFormatForNumber;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
            public String getResultUrl() {
                Object obj = this.resultUrl_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.resultUrl_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
            public ByteString getResultUrlBytes() {
                Object obj = this.resultUrl_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.resultUrl_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
            public ByteString getStoreUuid() {
                return this.storeUuid_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
            public boolean hasAppName() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
            public boolean hasAppUuid() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
            public boolean hasInitialUrl() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
            public boolean hasInitialUrlParameters() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
            public boolean hasParametersCompressed() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
            public boolean hasParametersEncrypted() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
            public boolean hasResultKeys() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
            public boolean hasResultType() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
            public boolean hasResultUrl() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequestOrBuilder
            public boolean hasStoreUuid() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQOAuthRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectIQOAuthRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasInitialUrl() && hasResultUrl() && hasAppUuid();
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
                                    this.initialUrl_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                    continue;
                                case 18:
                                    this.initialUrlParameters_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                    continue;
                                case 24:
                                    this.parametersEncrypted_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4;
                                    continue;
                                case 32:
                                    this.parametersCompressed_ = codedInputStream.readBool();
                                    this.bitField0_ |= 8;
                                    continue;
                                case 42:
                                    this.resultUrl_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 16;
                                    continue;
                                case 48:
                                    int i14 = codedInputStream.readEnum();
                                    if (ResultFormat.forNumber(i14) == null) {
                                        mergeUnknownVarintField(6, i14);
                                    } else {
                                        this.resultType_ = i14;
                                        this.bitField0_ |= 32;
                                        continue;
                                    }
                                    break;
                                case 58:
                                    this.resultKeys_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 64;
                                    continue;
                                case 66:
                                    this.appName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 128;
                                    continue;
                                case 74:
                                    this.appUuid_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 256;
                                    continue;
                                case 82:
                                    this.storeUuid_ = codedInputStream.readBytes();
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

            public Builder setAppName(String str) {
                str.getClass();
                this.appName_ = str;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setAppNameBytes(ByteString byteString) {
                byteString.getClass();
                this.appName_ = byteString;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setAppUuid(ByteString byteString) {
                byteString.getClass();
                this.appUuid_ = byteString;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setInitialUrl(String str) {
                str.getClass();
                this.initialUrl_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setInitialUrlBytes(ByteString byteString) {
                byteString.getClass();
                this.initialUrl_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setInitialUrlParameters(ByteString byteString) {
                byteString.getClass();
                this.initialUrlParameters_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setParametersCompressed(boolean z14) {
                this.parametersCompressed_ = z14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setParametersEncrypted(boolean z14) {
                this.parametersEncrypted_ = z14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setResultKeys(ByteString byteString) {
                byteString.getClass();
                this.resultKeys_ = byteString;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setResultType(ResultFormat resultFormat) {
                resultFormat.getClass();
                this.bitField0_ |= 32;
                this.resultType_ = resultFormat.getNumber();
                onChanged();
                return this;
            }

            public Builder setResultUrl(String str) {
                str.getClass();
                this.resultUrl_ = str;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setResultUrlBytes(ByteString byteString) {
                byteString.getClass();
                this.resultUrl_ = byteString;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setStoreUuid(ByteString byteString) {
                byteString.getClass();
                this.storeUuid_ = byteString;
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ConnectIQOAuthRequest getDefaultInstanceForType() {
                return ConnectIQOAuthRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.initialUrl_ = "";
                ByteString byteString = ByteString.EMPTY;
                this.initialUrlParameters_ = byteString;
                this.resultUrl_ = "";
                this.resultType_ = 0;
                this.resultKeys_ = byteString;
                this.appName_ = "";
                this.appUuid_ = byteString;
                this.storeUuid_ = byteString;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConnectIQOAuthRequest) {
                    return mergeFrom((ConnectIQOAuthRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConnectIQOAuthRequest connectIQOAuthRequest) {
                if (connectIQOAuthRequest == ConnectIQOAuthRequest.getDefaultInstance()) {
                    return this;
                }
                if (connectIQOAuthRequest.hasInitialUrl()) {
                    this.initialUrl_ = connectIQOAuthRequest.initialUrl_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (connectIQOAuthRequest.hasInitialUrlParameters()) {
                    setInitialUrlParameters(connectIQOAuthRequest.getInitialUrlParameters());
                }
                if (connectIQOAuthRequest.hasParametersEncrypted()) {
                    setParametersEncrypted(connectIQOAuthRequest.getParametersEncrypted());
                }
                if (connectIQOAuthRequest.hasParametersCompressed()) {
                    setParametersCompressed(connectIQOAuthRequest.getParametersCompressed());
                }
                if (connectIQOAuthRequest.hasResultUrl()) {
                    this.resultUrl_ = connectIQOAuthRequest.resultUrl_;
                    this.bitField0_ |= 16;
                    onChanged();
                }
                if (connectIQOAuthRequest.hasResultType()) {
                    setResultType(connectIQOAuthRequest.getResultType());
                }
                if (connectIQOAuthRequest.hasResultKeys()) {
                    setResultKeys(connectIQOAuthRequest.getResultKeys());
                }
                if (connectIQOAuthRequest.hasAppName()) {
                    this.appName_ = connectIQOAuthRequest.appName_;
                    this.bitField0_ |= 128;
                    onChanged();
                }
                if (connectIQOAuthRequest.hasAppUuid()) {
                    setAppUuid(connectIQOAuthRequest.getAppUuid());
                }
                if (connectIQOAuthRequest.hasStoreUuid()) {
                    setStoreUuid(connectIQOAuthRequest.getStoreUuid());
                }
                mergeUnknownFields(connectIQOAuthRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConnectIQOAuthRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConnectIQOAuthRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQOAuthRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectIQOAuthRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConnectIQOAuthRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConnectIQOAuthRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConnectIQOAuthRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConnectIQOAuthRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConnectIQOAuthRequest parseFrom(InputStream inputStream) {
            return (ConnectIQOAuthRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConnectIQOAuthRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQOAuthRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectIQOAuthRequest parseFrom(CodedInputStream codedInputStream) {
            return (ConnectIQOAuthRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConnectIQOAuthRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQOAuthRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResultFormat implements ProtocolMessageEnum {
            URL(0),
            BODY_JSON(1);

            public static final int BODY_JSON_VALUE = 1;
            public static final int URL_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResultFormat> internalValueMap = new Internal.EnumLiteMap<ResultFormat>() { // from class: com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthRequest.ResultFormat.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ResultFormat findValueByNumber(int i14) {
                    return ResultFormat.forNumber(i14);
                }
            };
            private static final ResultFormat[] VALUES = values();

            ResultFormat(int i14) {
                this.value = i14;
            }

            public static ResultFormat forNumber(int i14) {
                if (i14 == 0) {
                    return URL;
                }
                if (i14 != 1) {
                    return null;
                }
                return BODY_JSON;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ConnectIQOAuthRequest.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<ResultFormat> internalGetValueMap() {
                return internalValueMap;
            }

            public static ResultFormat valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static ResultFormat valueOf(int i14) {
                return forNumber(i14);
            }
        }

        private ConnectIQOAuthRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.initialUrl_ = "";
            ByteString byteString = ByteString.EMPTY;
            this.initialUrlParameters_ = byteString;
            this.parametersEncrypted_ = false;
            this.parametersCompressed_ = false;
            this.resultUrl_ = "";
            this.resultType_ = 0;
            this.resultKeys_ = byteString;
            this.appName_ = "";
            this.appUuid_ = byteString;
            this.storeUuid_ = byteString;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ ConnectIQOAuthRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class ConnectIQOAuthResponse extends GeneratedMessageV3 implements ConnectIQOAuthResponseOrBuilder {
        private static final ConnectIQOAuthResponse DEFAULT_INSTANCE = new ConnectIQOAuthResponse();

        @Deprecated
        public static final Parser<ConnectIQOAuthResponse> PARSER = new AbstractParser<ConnectIQOAuthResponse>() { // from class: com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthResponse.1
            @Override // com.google.protobuf.Parser
            public ConnectIQOAuthResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConnectIQOAuthResponse.newBuilder();
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

        private ConnectIQOAuthResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConnectIQOAuthResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQOAuthResponse_descriptor;
        }

        public static Builder newBuilder(ConnectIQOAuthResponse connectIQOAuthResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(connectIQOAuthResponse);
        }

        public static ConnectIQOAuthResponse parseDelimitedFrom(InputStream inputStream) {
            return (ConnectIQOAuthResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConnectIQOAuthResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConnectIQOAuthResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConnectIQOAuthResponse)) {
                return super.equals(obj);
            }
            ConnectIQOAuthResponse connectIQOAuthResponse = (ConnectIQOAuthResponse) obj;
            if (hasStatus() != connectIQOAuthResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == connectIQOAuthResponse.status_) && getUnknownFields().equals(connectIQOAuthResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConnectIQOAuthResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.UNKNOWN : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthResponseOrBuilder
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
            return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQOAuthResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectIQOAuthResponse.class, Builder.class);
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
            return new ConnectIQOAuthResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConnectIQOAuthResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(ConnectIQOAuthResponse connectIQOAuthResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    connectIQOAuthResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                connectIQOAuthResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQOAuthResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectIQOAuthResponse build() {
                ConnectIQOAuthResponse connectIQOAuthResponseBuildPartial = buildPartial();
                if (connectIQOAuthResponseBuildPartial.isInitialized()) {
                    return connectIQOAuthResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) connectIQOAuthResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectIQOAuthResponse buildPartial() {
                ConnectIQOAuthResponse connectIQOAuthResponse = new ConnectIQOAuthResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(connectIQOAuthResponse);
                }
                onBuilt();
                return connectIQOAuthResponse;
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
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQOAuthResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.UNKNOWN : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_ConnectIQOAuthResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectIQOAuthResponse.class, Builder.class);
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
            public ConnectIQOAuthResponse getDefaultInstanceForType() {
                return ConnectIQOAuthResponse.getDefaultInstance();
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
                if (message instanceof ConnectIQOAuthResponse) {
                    return mergeFrom((ConnectIQOAuthResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConnectIQOAuthResponse connectIQOAuthResponse) {
                if (connectIQOAuthResponse == ConnectIQOAuthResponse.getDefaultInstance()) {
                    return this;
                }
                if (connectIQOAuthResponse.hasStatus()) {
                    setStatus(connectIQOAuthResponse.getStatus());
                }
                mergeUnknownFields(connectIQOAuthResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConnectIQOAuthResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConnectIQOAuthResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQOAuthResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectIQOAuthResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ConnectIQOAuthResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ConnectIQOAuthResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ConnectIQOAuthResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConnectIQOAuthResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConnectIQOAuthResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConnectIQOAuthResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConnectIQOAuthResponse parseFrom(InputStream inputStream) {
            return (ConnectIQOAuthResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConnectIQOAuthResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQOAuthResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectIQOAuthResponse parseFrom(CodedInputStream codedInputStream) {
            return (ConnectIQOAuthResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConnectIQOAuthResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectIQOAuthResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            UNKNOWN(0),
            OK(1),
            BAD_REQUEST(2),
            NOTIFICATION_FAILURE(3);

            public static final int BAD_REQUEST_VALUE = 2;
            public static final int NOTIFICATION_FAILURE_VALUE = 3;
            public static final int OK_VALUE = 1;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDIConnectIQHTTPProto.ConnectIQOAuthResponse.ResponseStatus.1
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
                    return BAD_REQUEST;
                }
                if (i14 != 3) {
                    return null;
                }
                return NOTIFICATION_FAILURE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ConnectIQOAuthResponse.getDescriptor().getEnumTypes().get(0);
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

    /* JADX INFO: loaded from: classes4.dex */
    public static final class EncryptedEnvelope extends GeneratedMessageV3 implements EncryptedEnvelopeOrBuilder {
        public static final int CIPHER_TEXT_FIELD_NUMBER = 1;
        public static final int IV_FIELD_NUMBER = 2;
        public static final int TAG_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString cipherText_;
        private ByteString iv_;
        private byte memoizedIsInitialized;
        private ByteString tag_;
        private static final EncryptedEnvelope DEFAULT_INSTANCE = new EncryptedEnvelope();

        @Deprecated
        public static final Parser<EncryptedEnvelope> PARSER = new AbstractParser<EncryptedEnvelope>() { // from class: com.garmin.proto.generated.GDIConnectIQHTTPProto.EncryptedEnvelope.1
            @Override // com.google.protobuf.Parser
            public EncryptedEnvelope parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = EncryptedEnvelope.newBuilder();
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

        private EncryptedEnvelope(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            ByteString byteString = ByteString.EMPTY;
            this.cipherText_ = byteString;
            this.iv_ = byteString;
            this.tag_ = byteString;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EncryptedEnvelope getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_EncryptedEnvelope_descriptor;
        }

        public static Builder newBuilder(EncryptedEnvelope encryptedEnvelope) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(encryptedEnvelope);
        }

        public static EncryptedEnvelope parseDelimitedFrom(InputStream inputStream) {
            return (EncryptedEnvelope) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EncryptedEnvelope parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<EncryptedEnvelope> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EncryptedEnvelope)) {
                return super.equals(obj);
            }
            EncryptedEnvelope encryptedEnvelope = (EncryptedEnvelope) obj;
            if (hasCipherText() != encryptedEnvelope.hasCipherText()) {
                return false;
            }
            if ((hasCipherText() && !getCipherText().equals(encryptedEnvelope.getCipherText())) || hasIv() != encryptedEnvelope.hasIv()) {
                return false;
            }
            if ((!hasIv() || getIv().equals(encryptedEnvelope.getIv())) && hasTag() == encryptedEnvelope.hasTag()) {
                return (!hasTag() || getTag().equals(encryptedEnvelope.getTag())) && getUnknownFields().equals(encryptedEnvelope.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.EncryptedEnvelopeOrBuilder
        public ByteString getCipherText() {
            return this.cipherText_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.EncryptedEnvelopeOrBuilder
        public ByteString getIv() {
            return this.iv_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EncryptedEnvelope> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.cipherText_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBytesSize += CodedOutputStream.computeBytesSize(2, this.iv_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeBytesSize += CodedOutputStream.computeBytesSize(3, this.tag_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBytesSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.EncryptedEnvelopeOrBuilder
        public ByteString getTag() {
            return this.tag_;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.EncryptedEnvelopeOrBuilder
        public boolean hasCipherText() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.EncryptedEnvelopeOrBuilder
        public boolean hasIv() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.EncryptedEnvelopeOrBuilder
        public boolean hasTag() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCipherText()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getCipherText().hashCode();
            }
            if (hasIv()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getIv().hashCode();
            }
            if (hasTag()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getTag().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_EncryptedEnvelope_fieldAccessorTable.ensureFieldAccessorsInitialized(EncryptedEnvelope.class, Builder.class);
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
            return new EncryptedEnvelope();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.cipherText_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBytes(2, this.iv_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBytes(3, this.tag_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EncryptedEnvelopeOrBuilder {
            private int bitField0_;
            private ByteString cipherText_;
            private ByteString iv_;
            private ByteString tag_;

            private Builder() {
                ByteString byteString = ByteString.EMPTY;
                this.cipherText_ = byteString;
                this.iv_ = byteString;
                this.tag_ = byteString;
            }

            private void buildPartial0(EncryptedEnvelope encryptedEnvelope) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    encryptedEnvelope.cipherText_ = this.cipherText_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    encryptedEnvelope.iv_ = this.iv_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    encryptedEnvelope.tag_ = this.tag_;
                    i14 |= 4;
                }
                encryptedEnvelope.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_EncryptedEnvelope_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EncryptedEnvelope build() {
                EncryptedEnvelope encryptedEnvelopeBuildPartial = buildPartial();
                if (encryptedEnvelopeBuildPartial.isInitialized()) {
                    return encryptedEnvelopeBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) encryptedEnvelopeBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EncryptedEnvelope buildPartial() {
                EncryptedEnvelope encryptedEnvelope = new EncryptedEnvelope(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(encryptedEnvelope);
                }
                onBuilt();
                return encryptedEnvelope;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                ByteString byteString = ByteString.EMPTY;
                this.cipherText_ = byteString;
                this.iv_ = byteString;
                this.tag_ = byteString;
                return this;
            }

            public Builder clearCipherText() {
                this.bitField0_ &= -2;
                this.cipherText_ = EncryptedEnvelope.getDefaultInstance().getCipherText();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearIv() {
                this.bitField0_ &= -3;
                this.iv_ = EncryptedEnvelope.getDefaultInstance().getIv();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearTag() {
                this.bitField0_ &= -5;
                this.tag_ = EncryptedEnvelope.getDefaultInstance().getTag();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.EncryptedEnvelopeOrBuilder
            public ByteString getCipherText() {
                return this.cipherText_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_EncryptedEnvelope_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.EncryptedEnvelopeOrBuilder
            public ByteString getIv() {
                return this.iv_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.EncryptedEnvelopeOrBuilder
            public ByteString getTag() {
                return this.tag_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.EncryptedEnvelopeOrBuilder
            public boolean hasCipherText() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.EncryptedEnvelopeOrBuilder
            public boolean hasIv() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.EncryptedEnvelopeOrBuilder
            public boolean hasTag() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_EncryptedEnvelope_fieldAccessorTable.ensureFieldAccessorsInitialized(EncryptedEnvelope.class, Builder.class);
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
                                    this.cipherText_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.iv_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.tag_ = codedInputStream.readBytes();
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

            public Builder setCipherText(ByteString byteString) {
                byteString.getClass();
                this.cipherText_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setIv(ByteString byteString) {
                byteString.getClass();
                this.iv_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setTag(ByteString byteString) {
                byteString.getClass();
                this.tag_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public EncryptedEnvelope getDefaultInstanceForType() {
                return EncryptedEnvelope.getDefaultInstance();
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
                this.cipherText_ = byteString;
                this.iv_ = byteString;
                this.tag_ = byteString;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EncryptedEnvelope) {
                    return mergeFrom((EncryptedEnvelope) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EncryptedEnvelope encryptedEnvelope) {
                if (encryptedEnvelope == EncryptedEnvelope.getDefaultInstance()) {
                    return this;
                }
                if (encryptedEnvelope.hasCipherText()) {
                    setCipherText(encryptedEnvelope.getCipherText());
                }
                if (encryptedEnvelope.hasIv()) {
                    setIv(encryptedEnvelope.getIv());
                }
                if (encryptedEnvelope.hasTag()) {
                    setTag(encryptedEnvelope.getTag());
                }
                mergeUnknownFields(encryptedEnvelope.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EncryptedEnvelope getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static EncryptedEnvelope parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EncryptedEnvelope) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EncryptedEnvelope parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static EncryptedEnvelope parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EncryptedEnvelope parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static EncryptedEnvelope parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static EncryptedEnvelope parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static EncryptedEnvelope parseFrom(InputStream inputStream) {
            return (EncryptedEnvelope) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ EncryptedEnvelope(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private EncryptedEnvelope() {
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.cipherText_ = byteString;
            this.iv_ = byteString;
            this.tag_ = byteString;
        }

        public static EncryptedEnvelope parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EncryptedEnvelope) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EncryptedEnvelope parseFrom(CodedInputStream codedInputStream) {
            return (EncryptedEnvelope) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static EncryptedEnvelope parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EncryptedEnvelope) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class OpenWebpageNotification extends GeneratedMessageV3 implements OpenWebpageNotificationOrBuilder {
        public static final int APP_NAME_FIELD_NUMBER = 3;
        public static final int PARAMS_FIELD_NUMBER = 2;
        public static final int URL_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private volatile Object appName_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private ByteString params_;
        private volatile Object url_;
        private static final OpenWebpageNotification DEFAULT_INSTANCE = new OpenWebpageNotification();

        @Deprecated
        public static final Parser<OpenWebpageNotification> PARSER = new AbstractParser<OpenWebpageNotification>() { // from class: com.garmin.proto.generated.GDIConnectIQHTTPProto.OpenWebpageNotification.1
            @Override // com.google.protobuf.Parser
            public OpenWebpageNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = OpenWebpageNotification.newBuilder();
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

        private OpenWebpageNotification() {
            this.url_ = "";
            ByteString byteString = ByteString.EMPTY;
            this.params_ = byteString;
            this.appName_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.url_ = "";
            this.params_ = byteString;
            this.appName_ = "";
        }

        public static OpenWebpageNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_OpenWebpageNotification_descriptor;
        }

        public static Builder newBuilder(OpenWebpageNotification openWebpageNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(openWebpageNotification);
        }

        public static OpenWebpageNotification parseDelimitedFrom(InputStream inputStream) {
            return (OpenWebpageNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static OpenWebpageNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<OpenWebpageNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OpenWebpageNotification)) {
                return super.equals(obj);
            }
            OpenWebpageNotification openWebpageNotification = (OpenWebpageNotification) obj;
            if (hasUrl() != openWebpageNotification.hasUrl()) {
                return false;
            }
            if ((hasUrl() && !getUrl().equals(openWebpageNotification.getUrl())) || hasParams() != openWebpageNotification.hasParams()) {
                return false;
            }
            if ((!hasParams() || getParams().equals(openWebpageNotification.getParams())) && hasAppName() == openWebpageNotification.hasAppName()) {
                return (!hasAppName() || getAppName().equals(openWebpageNotification.getAppName())) && getUnknownFields().equals(openWebpageNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.OpenWebpageNotificationOrBuilder
        public String getAppName() {
            Object obj = this.appName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.appName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.OpenWebpageNotificationOrBuilder
        public ByteString getAppNameBytes() {
            Object obj = this.appName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.OpenWebpageNotificationOrBuilder
        public ByteString getParams() {
            return this.params_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<OpenWebpageNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.url_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeBytesSize(2, this.params_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.appName_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.OpenWebpageNotificationOrBuilder
        public String getUrl() {
            Object obj = this.url_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.url_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.OpenWebpageNotificationOrBuilder
        public ByteString getUrlBytes() {
            Object obj = this.url_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.url_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.OpenWebpageNotificationOrBuilder
        public boolean hasAppName() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.OpenWebpageNotificationOrBuilder
        public boolean hasParams() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.OpenWebpageNotificationOrBuilder
        public boolean hasUrl() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasUrl()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getUrl().hashCode();
            }
            if (hasParams()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getParams().hashCode();
            }
            if (hasAppName()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getAppName().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_OpenWebpageNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(OpenWebpageNotification.class, Builder.class);
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
            if (hasUrl()) {
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
            return new OpenWebpageNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.url_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBytes(2, this.params_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.appName_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements OpenWebpageNotificationOrBuilder {
            private Object appName_;
            private int bitField0_;
            private ByteString params_;
            private Object url_;

            private Builder() {
                this.url_ = "";
                this.params_ = ByteString.EMPTY;
                this.appName_ = "";
            }

            private void buildPartial0(OpenWebpageNotification openWebpageNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    openWebpageNotification.url_ = this.url_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    openWebpageNotification.params_ = this.params_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    openWebpageNotification.appName_ = this.appName_;
                    i14 |= 4;
                }
                openWebpageNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_OpenWebpageNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public OpenWebpageNotification build() {
                OpenWebpageNotification openWebpageNotificationBuildPartial = buildPartial();
                if (openWebpageNotificationBuildPartial.isInitialized()) {
                    return openWebpageNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) openWebpageNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public OpenWebpageNotification buildPartial() {
                OpenWebpageNotification openWebpageNotification = new OpenWebpageNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(openWebpageNotification);
                }
                onBuilt();
                return openWebpageNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.url_ = "";
                this.params_ = ByteString.EMPTY;
                this.appName_ = "";
                return this;
            }

            public Builder clearAppName() {
                this.appName_ = OpenWebpageNotification.getDefaultInstance().getAppName();
                this.bitField0_ &= -5;
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

            public Builder clearParams() {
                this.bitField0_ &= -3;
                this.params_ = OpenWebpageNotification.getDefaultInstance().getParams();
                onChanged();
                return this;
            }

            public Builder clearUrl() {
                this.url_ = OpenWebpageNotification.getDefaultInstance().getUrl();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.OpenWebpageNotificationOrBuilder
            public String getAppName() {
                Object obj = this.appName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.appName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.OpenWebpageNotificationOrBuilder
            public ByteString getAppNameBytes() {
                Object obj = this.appName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.appName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_OpenWebpageNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.OpenWebpageNotificationOrBuilder
            public ByteString getParams() {
                return this.params_;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.OpenWebpageNotificationOrBuilder
            public String getUrl() {
                Object obj = this.url_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.url_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.OpenWebpageNotificationOrBuilder
            public ByteString getUrlBytes() {
                Object obj = this.url_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.url_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.OpenWebpageNotificationOrBuilder
            public boolean hasAppName() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.OpenWebpageNotificationOrBuilder
            public boolean hasParams() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectIQHTTPProto.OpenWebpageNotificationOrBuilder
            public boolean hasUrl() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectIQHTTPProto.internal_static_GDI_Proto_ConnectIQHTTP_OpenWebpageNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(OpenWebpageNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasUrl();
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
                                    this.url_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.params_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.appName_ = codedInputStream.readBytes();
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

            public Builder setAppName(String str) {
                str.getClass();
                this.appName_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setAppNameBytes(ByteString byteString) {
                byteString.getClass();
                this.appName_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setParams(ByteString byteString) {
                byteString.getClass();
                this.params_ = byteString;
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

            public Builder setUrl(String str) {
                str.getClass();
                this.url_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setUrlBytes(ByteString byteString) {
                byteString.getClass();
                this.url_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public OpenWebpageNotification getDefaultInstanceForType() {
                return OpenWebpageNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.url_ = "";
                this.params_ = ByteString.EMPTY;
                this.appName_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof OpenWebpageNotification) {
                    return mergeFrom((OpenWebpageNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(OpenWebpageNotification openWebpageNotification) {
                if (openWebpageNotification == OpenWebpageNotification.getDefaultInstance()) {
                    return this;
                }
                if (openWebpageNotification.hasUrl()) {
                    this.url_ = openWebpageNotification.url_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (openWebpageNotification.hasParams()) {
                    setParams(openWebpageNotification.getParams());
                }
                if (openWebpageNotification.hasAppName()) {
                    this.appName_ = openWebpageNotification.appName_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                mergeUnknownFields(openWebpageNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public OpenWebpageNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static OpenWebpageNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OpenWebpageNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static OpenWebpageNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static OpenWebpageNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static OpenWebpageNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static OpenWebpageNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static OpenWebpageNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static OpenWebpageNotification parseFrom(InputStream inputStream) {
            return (OpenWebpageNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static OpenWebpageNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OpenWebpageNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static OpenWebpageNotification parseFrom(CodedInputStream codedInputStream) {
            return (OpenWebpageNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static OpenWebpageNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OpenWebpageNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private OpenWebpageNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.url_ = "";
            this.params_ = ByteString.EMPTY;
            this.appName_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ OpenWebpageNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
