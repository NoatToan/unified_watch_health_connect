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
public final class RvEndpointsConfig extends AndroidMessage<RvEndpointsConfig, Builder> {
    public static final ProtoAdapter<RvEndpointsConfig> ADAPTER;
    public static final Parcelable.Creator<RvEndpointsConfig> CREATOR;
    public static final String DEFAULT_ADS = "";
    public static final String DEFAULT_STRATEGY = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String ads;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String strategy;

    public static final class Builder extends Message.Builder<RvEndpointsConfig, Builder> {
        public String ads = "";
        public String strategy = "";

        public Builder ads(String str) {
            this.ads = str;
            return this;
        }

        @Override // com.xmlywind.wire.Message.Builder
        public RvEndpointsConfig build() {
            return new RvEndpointsConfig(this.ads, this.strategy, super.buildUnknownFields());
        }

        public Builder strategy(String str) {
            this.strategy = str;
            return this;
        }
    }

    public static final class ProtoAdapter_RvEndpointsConfig extends ProtoAdapter<RvEndpointsConfig> {
        public ProtoAdapter_RvEndpointsConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, RvEndpointsConfig.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.xmlywind.wire.ProtoAdapter
        public RvEndpointsConfig decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    protoReader.endMessage(jBeginMessage);
                    return builder.build();
                }
                if (iNextTag == 1) {
                    builder.ads(ProtoAdapter.STRING.decode(protoReader));
                } else if (iNextTag != 2) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.strategy(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, RvEndpointsConfig rvEndpointsConfig) {
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, rvEndpointsConfig.ads);
            protoAdapter.encodeWithTag(protoWriter, 2, rvEndpointsConfig.strategy);
            protoWriter.writeBytes(rvEndpointsConfig.unknownFields());
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public int encodedSize(RvEndpointsConfig rvEndpointsConfig) {
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, rvEndpointsConfig.ads) + protoAdapter.encodedSizeWithTag(2, rvEndpointsConfig.strategy) + rvEndpointsConfig.unknownFields().size();
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public RvEndpointsConfig redact(RvEndpointsConfig rvEndpointsConfig) {
            Builder builderNewBuilder = rvEndpointsConfig.newBuilder();
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    static {
        ProtoAdapter_RvEndpointsConfig protoAdapter_RvEndpointsConfig = new ProtoAdapter_RvEndpointsConfig();
        ADAPTER = protoAdapter_RvEndpointsConfig;
        CREATOR = AndroidMessage.newCreator(protoAdapter_RvEndpointsConfig);
    }

    public RvEndpointsConfig(String str, String str2) {
        this(str, str2, ByteString.EMPTY);
    }

    public RvEndpointsConfig(String str, String str2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ads = str;
        this.strategy = str2;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof RvEndpointsConfig)) {
                return false;
            }
            RvEndpointsConfig rvEndpointsConfig = (RvEndpointsConfig) obj;
            if (!unknownFields().equals(rvEndpointsConfig.unknownFields()) || !Internal.equals(this.ads, rvEndpointsConfig.ads) || !Internal.equals(this.strategy, rvEndpointsConfig.strategy)) {
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
        String str = this.ads;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.strategy;
        int iHashCode3 = ((iHashCode2 + (iHashCode * 37)) * 37) + (str2 != null ? str2.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.xmlywind.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.ads = this.ads;
        builder.strategy = this.strategy;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.xmlywind.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.ads != null) {
            sb.append(", ads=");
            sb.append(this.ads);
        }
        if (this.strategy != null) {
            sb.append(", strategy=");
            sb.append(this.strategy);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "RvEndpointsConfig{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
