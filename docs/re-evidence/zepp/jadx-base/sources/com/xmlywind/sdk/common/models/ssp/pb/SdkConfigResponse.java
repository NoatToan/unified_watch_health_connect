package com.xmlywind.sdk.common.models.ssp.pb;

import android.os.Parcelable;
import com.xmlywind.wire.AndroidMessage;
import com.xmlywind.wire.FieldEncoding;
import com.xmlywind.wire.Message;
import com.xmlywind.wire.ProtoAdapter;
import com.xmlywind.wire.ProtoReader;
import com.xmlywind.wire.ProtoWriter;
import com.xmlywind.wire.WireField;
import com.xmlywind.wire.internal.Internal;
import com.xmlywind.wire.okio.ByteString;

/* JADX INFO: loaded from: classes22.dex */
public final class SdkConfigResponse extends AndroidMessage<SdkConfigResponse, Builder> {
    public static final ProtoAdapter<SdkConfigResponse> ADAPTER;
    public static final Parcelable.Creator<SdkConfigResponse> CREATOR;
    public static final Integer DEFAULT_CODE;
    public static final String DEFAULT_ERROR_MESSAGE = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 1)
    public final Integer code;

    @WireField(adapter = "com.sigmob.sdk.base.models.ssp.pb.SdkConfig#ADAPTER", tag = 3)
    public final SdkConfig config;

    @WireField(adapter = "com.sigmob.sdk.base.models.ssp.pb.SdkConfigV2#ADAPTER", tag = 4)
    public final SdkConfigV2 config_v2;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String error_message;

    public static final class Builder extends Message.Builder<SdkConfigResponse, Builder> {
        public SdkConfig config;
        public SdkConfigV2 config_v2;
        public Integer code = SdkConfigResponse.DEFAULT_CODE;
        public String error_message = "";

        @Override // com.xmlywind.wire.Message.Builder
        public SdkConfigResponse build() {
            return new SdkConfigResponse(this.code, this.error_message, this.config, this.config_v2, super.buildUnknownFields());
        }

        public Builder code(Integer num) {
            this.code = num;
            return this;
        }

        public Builder config(SdkConfig sdkConfig) {
            this.config = sdkConfig;
            return this;
        }

        public Builder config_v2(SdkConfigV2 sdkConfigV2) {
            this.config_v2 = sdkConfigV2;
            return this;
        }

        public Builder error_message(String str) {
            this.error_message = str;
            return this;
        }
    }

    public static final class ProtoAdapter_SdkConfigResponse extends ProtoAdapter<SdkConfigResponse> {
        public ProtoAdapter_SdkConfigResponse() {
            super(FieldEncoding.LENGTH_DELIMITED, SdkConfigResponse.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.xmlywind.wire.ProtoAdapter
        public SdkConfigResponse decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    protoReader.endMessage(jBeginMessage);
                    return builder.build();
                }
                if (iNextTag == 1) {
                    builder.code(ProtoAdapter.UINT32.decode(protoReader));
                } else if (iNextTag == 2) {
                    builder.error_message(ProtoAdapter.STRING.decode(protoReader));
                } else if (iNextTag == 3) {
                    builder.config(SdkConfig.ADAPTER.decode(protoReader));
                } else if (iNextTag != 4) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.config_v2(SdkConfigV2.ADAPTER.decode(protoReader));
                }
            }
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, SdkConfigResponse sdkConfigResponse) {
            ProtoAdapter.UINT32.encodeWithTag(protoWriter, 1, sdkConfigResponse.code);
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 2, sdkConfigResponse.error_message);
            SdkConfig.ADAPTER.encodeWithTag(protoWriter, 3, sdkConfigResponse.config);
            SdkConfigV2.ADAPTER.encodeWithTag(protoWriter, 4, sdkConfigResponse.config_v2);
            protoWriter.writeBytes(sdkConfigResponse.unknownFields());
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public int encodedSize(SdkConfigResponse sdkConfigResponse) {
            return ProtoAdapter.UINT32.encodedSizeWithTag(1, sdkConfigResponse.code) + ProtoAdapter.STRING.encodedSizeWithTag(2, sdkConfigResponse.error_message) + SdkConfig.ADAPTER.encodedSizeWithTag(3, sdkConfigResponse.config) + SdkConfigV2.ADAPTER.encodedSizeWithTag(4, sdkConfigResponse.config_v2) + sdkConfigResponse.unknownFields().size();
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public SdkConfigResponse redact(SdkConfigResponse sdkConfigResponse) {
            Builder builderNewBuilder = sdkConfigResponse.newBuilder();
            SdkConfig sdkConfig = builderNewBuilder.config;
            if (sdkConfig != null) {
                builderNewBuilder.config = SdkConfig.ADAPTER.redact(sdkConfig);
            }
            SdkConfigV2 sdkConfigV2 = builderNewBuilder.config_v2;
            if (sdkConfigV2 != null) {
                builderNewBuilder.config_v2 = SdkConfigV2.ADAPTER.redact(sdkConfigV2);
            }
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    static {
        ProtoAdapter_SdkConfigResponse protoAdapter_SdkConfigResponse = new ProtoAdapter_SdkConfigResponse();
        ADAPTER = protoAdapter_SdkConfigResponse;
        CREATOR = AndroidMessage.newCreator(protoAdapter_SdkConfigResponse);
        DEFAULT_CODE = 0;
    }

    public SdkConfigResponse(Integer num, String str, SdkConfig sdkConfig, SdkConfigV2 sdkConfigV2) {
        this(num, str, sdkConfig, sdkConfigV2, ByteString.EMPTY);
    }

    public SdkConfigResponse(Integer num, String str, SdkConfig sdkConfig, SdkConfigV2 sdkConfigV2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.code = num;
        this.error_message = str;
        this.config = sdkConfig;
        this.config_v2 = sdkConfigV2;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof SdkConfigResponse)) {
                return false;
            }
            SdkConfigResponse sdkConfigResponse = (SdkConfigResponse) obj;
            if (!unknownFields().equals(sdkConfigResponse.unknownFields()) || !Internal.equals(this.code, sdkConfigResponse.code) || !Internal.equals(this.error_message, sdkConfigResponse.error_message) || !Internal.equals(this.config, sdkConfigResponse.config) || !Internal.equals(this.config_v2, sdkConfigResponse.config_v2)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode();
        Integer num = this.code;
        int iHashCode2 = num != null ? num.hashCode() : 0;
        String str = this.error_message;
        int iHashCode3 = str != null ? str.hashCode() : 0;
        SdkConfig sdkConfig = this.config;
        int iHashCode4 = sdkConfig != null ? sdkConfig.hashCode() : 0;
        SdkConfigV2 sdkConfigV2 = this.config_v2;
        int iHashCode5 = ((iHashCode4 + ((iHashCode3 + ((iHashCode2 + (iHashCode * 37)) * 37)) * 37)) * 37) + (sdkConfigV2 != null ? sdkConfigV2.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.xmlywind.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.code = this.code;
        builder.error_message = this.error_message;
        builder.config = this.config;
        builder.config_v2 = this.config_v2;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.xmlywind.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.code != null) {
            sb.append(", code=");
            sb.append(this.code);
        }
        if (this.error_message != null) {
            sb.append(", error_message=");
            sb.append(this.error_message);
        }
        if (this.config != null) {
            sb.append(", config=");
            sb.append(this.config);
        }
        if (this.config_v2 != null) {
            sb.append(", config_v2=");
            sb.append(this.config_v2);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "SdkConfigResponse{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
