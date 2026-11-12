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
public final class CommonEndpointsConfig extends AndroidMessage<CommonEndpointsConfig, Builder> {
    public static final ProtoAdapter<CommonEndpointsConfig> ADAPTER;
    public static final Parcelable.Creator<CommonEndpointsConfig> CREATOR;
    public static final String DEFAULT_ADS = "";
    public static final String DEFAULT_HB_ADS = "";
    public static final String DEFAULT_LOG = "";
    public static final String DEFAULT_STRATEGY = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String ads;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String hb_ads;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String log;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String strategy;

    public static final class Builder extends Message.Builder<CommonEndpointsConfig, Builder> {
        public String log = "";
        public String ads = "";
        public String strategy = "";
        public String hb_ads = "";

        public Builder ads(String str) {
            this.ads = str;
            return this;
        }

        @Override // com.xmlywind.wire.Message.Builder
        public CommonEndpointsConfig build() {
            return new CommonEndpointsConfig(this.log, this.ads, this.strategy, this.hb_ads, super.buildUnknownFields());
        }

        public Builder hb_ads(String str) {
            this.hb_ads = str;
            return this;
        }

        public Builder log(String str) {
            this.log = str;
            return this;
        }

        public Builder strategy(String str) {
            this.strategy = str;
            return this;
        }
    }

    public static final class ProtoAdapter_CommonEndpointsConfig extends ProtoAdapter<CommonEndpointsConfig> {
        public ProtoAdapter_CommonEndpointsConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, CommonEndpointsConfig.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.xmlywind.wire.ProtoAdapter
        public CommonEndpointsConfig decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    protoReader.endMessage(jBeginMessage);
                    return builder.build();
                }
                if (iNextTag == 1) {
                    builder.log(ProtoAdapter.STRING.decode(protoReader));
                } else if (iNextTag == 2) {
                    builder.ads(ProtoAdapter.STRING.decode(protoReader));
                } else if (iNextTag == 3) {
                    builder.strategy(ProtoAdapter.STRING.decode(protoReader));
                } else if (iNextTag != 4) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.hb_ads(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, CommonEndpointsConfig commonEndpointsConfig) {
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, commonEndpointsConfig.log);
            protoAdapter.encodeWithTag(protoWriter, 2, commonEndpointsConfig.ads);
            protoAdapter.encodeWithTag(protoWriter, 3, commonEndpointsConfig.strategy);
            protoAdapter.encodeWithTag(protoWriter, 4, commonEndpointsConfig.hb_ads);
            protoWriter.writeBytes(commonEndpointsConfig.unknownFields());
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public int encodedSize(CommonEndpointsConfig commonEndpointsConfig) {
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, commonEndpointsConfig.log) + protoAdapter.encodedSizeWithTag(2, commonEndpointsConfig.ads) + protoAdapter.encodedSizeWithTag(3, commonEndpointsConfig.strategy) + protoAdapter.encodedSizeWithTag(4, commonEndpointsConfig.hb_ads) + commonEndpointsConfig.unknownFields().size();
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public CommonEndpointsConfig redact(CommonEndpointsConfig commonEndpointsConfig) {
            Builder builderNewBuilder = commonEndpointsConfig.newBuilder();
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    static {
        ProtoAdapter_CommonEndpointsConfig protoAdapter_CommonEndpointsConfig = new ProtoAdapter_CommonEndpointsConfig();
        ADAPTER = protoAdapter_CommonEndpointsConfig;
        CREATOR = AndroidMessage.newCreator(protoAdapter_CommonEndpointsConfig);
    }

    public CommonEndpointsConfig(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, ByteString.EMPTY);
    }

    public CommonEndpointsConfig(String str, String str2, String str3, String str4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.log = str;
        this.ads = str2;
        this.strategy = str3;
        this.hb_ads = str4;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof CommonEndpointsConfig)) {
                return false;
            }
            CommonEndpointsConfig commonEndpointsConfig = (CommonEndpointsConfig) obj;
            if (!unknownFields().equals(commonEndpointsConfig.unknownFields()) || !Internal.equals(this.log, commonEndpointsConfig.log) || !Internal.equals(this.ads, commonEndpointsConfig.ads) || !Internal.equals(this.strategy, commonEndpointsConfig.strategy) || !Internal.equals(this.hb_ads, commonEndpointsConfig.hb_ads)) {
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
        String str = this.log;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.ads;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.strategy;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.hb_ads;
        int iHashCode5 = ((iHashCode4 + ((iHashCode3 + ((iHashCode2 + (iHashCode * 37)) * 37)) * 37)) * 37) + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.xmlywind.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.log = this.log;
        builder.ads = this.ads;
        builder.strategy = this.strategy;
        builder.hb_ads = this.hb_ads;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.xmlywind.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.log != null) {
            sb.append(", log=");
            sb.append(this.log);
        }
        if (this.ads != null) {
            sb.append(", ads=");
            sb.append(this.ads);
        }
        if (this.strategy != null) {
            sb.append(", strategy=");
            sb.append(this.strategy);
        }
        if (this.hb_ads != null) {
            sb.append(", hb_ads=");
            sb.append(this.hb_ads);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "CommonEndpointsConfig{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
