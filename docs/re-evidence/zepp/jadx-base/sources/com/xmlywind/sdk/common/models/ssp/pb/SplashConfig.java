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
public final class SplashConfig extends AndroidMessage<SplashConfig, Builder> {
    public static final ProtoAdapter<SplashConfig> ADAPTER;
    public static final Parcelable.Creator<SplashConfig> CREATOR;
    public static final Integer DEFAULT_CACHETOP;
    public static final Integer DEFAULT_MATERIAL_EXPIRED_TIME;
    public static final Integer DEFAULT_SHOWDURATION;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 2)
    public final Integer cacheTop;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer material_expired_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 1)
    public final Integer showDuration;

    public static final class Builder extends Message.Builder<SplashConfig, Builder> {
        public Integer showDuration = SplashConfig.DEFAULT_SHOWDURATION;
        public Integer cacheTop = SplashConfig.DEFAULT_CACHETOP;
        public Integer material_expired_time = SplashConfig.DEFAULT_MATERIAL_EXPIRED_TIME;

        @Override // com.xmlywind.wire.Message.Builder
        public SplashConfig build() {
            return new SplashConfig(this.showDuration, this.cacheTop, this.material_expired_time, super.buildUnknownFields());
        }

        public Builder cacheTop(Integer num) {
            this.cacheTop = num;
            return this;
        }

        public Builder material_expired_time(Integer num) {
            this.material_expired_time = num;
            return this;
        }

        public Builder showDuration(Integer num) {
            this.showDuration = num;
            return this;
        }
    }

    public static final class ProtoAdapter_SplashConfig extends ProtoAdapter<SplashConfig> {
        public ProtoAdapter_SplashConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, SplashConfig.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.xmlywind.wire.ProtoAdapter
        public SplashConfig decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    protoReader.endMessage(jBeginMessage);
                    return builder.build();
                }
                if (iNextTag == 1) {
                    builder.showDuration(ProtoAdapter.UINT32.decode(protoReader));
                } else if (iNextTag == 2) {
                    builder.cacheTop(ProtoAdapter.INT32.decode(protoReader));
                } else if (iNextTag != 3) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.material_expired_time(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, SplashConfig splashConfig) {
            ProtoAdapter.UINT32.encodeWithTag(protoWriter, 1, splashConfig.showDuration);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            protoAdapter.encodeWithTag(protoWriter, 2, splashConfig.cacheTop);
            protoAdapter.encodeWithTag(protoWriter, 3, splashConfig.material_expired_time);
            protoWriter.writeBytes(splashConfig.unknownFields());
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public int encodedSize(SplashConfig splashConfig) {
            int iEncodedSizeWithTag = ProtoAdapter.UINT32.encodedSizeWithTag(1, splashConfig.showDuration);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.INT32;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, splashConfig.cacheTop) + protoAdapter.encodedSizeWithTag(3, splashConfig.material_expired_time) + splashConfig.unknownFields().size();
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public SplashConfig redact(SplashConfig splashConfig) {
            Builder builderNewBuilder = splashConfig.newBuilder();
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    static {
        ProtoAdapter_SplashConfig protoAdapter_SplashConfig = new ProtoAdapter_SplashConfig();
        ADAPTER = protoAdapter_SplashConfig;
        CREATOR = AndroidMessage.newCreator(protoAdapter_SplashConfig);
        DEFAULT_SHOWDURATION = 0;
        DEFAULT_CACHETOP = 50;
        DEFAULT_MATERIAL_EXPIRED_TIME = 3;
    }

    public SplashConfig(Integer num, Integer num2, Integer num3) {
        this(num, num2, num3, ByteString.EMPTY);
    }

    public SplashConfig(Integer num, Integer num2, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.showDuration = num;
        this.cacheTop = num2;
        this.material_expired_time = num3;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof SplashConfig)) {
                return false;
            }
            SplashConfig splashConfig = (SplashConfig) obj;
            if (!unknownFields().equals(splashConfig.unknownFields()) || !Internal.equals(this.showDuration, splashConfig.showDuration) || !Internal.equals(this.cacheTop, splashConfig.cacheTop) || !Internal.equals(this.material_expired_time, splashConfig.material_expired_time)) {
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
        Integer num = this.showDuration;
        int iHashCode2 = num != null ? num.hashCode() : 0;
        Integer num2 = this.cacheTop;
        int iHashCode3 = num2 != null ? num2.hashCode() : 0;
        Integer num3 = this.material_expired_time;
        int iHashCode4 = ((iHashCode3 + ((iHashCode2 + (iHashCode * 37)) * 37)) * 37) + (num3 != null ? num3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.xmlywind.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.showDuration = this.showDuration;
        builder.cacheTop = this.cacheTop;
        builder.material_expired_time = this.material_expired_time;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.xmlywind.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.showDuration != null) {
            sb.append(", showDuration=");
            sb.append(this.showDuration);
        }
        if (this.cacheTop != null) {
            sb.append(", cacheTop=");
            sb.append(this.cacheTop);
        }
        if (this.material_expired_time != null) {
            sb.append(", material_expired_time=");
            sb.append(this.material_expired_time);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "SplashConfig{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
