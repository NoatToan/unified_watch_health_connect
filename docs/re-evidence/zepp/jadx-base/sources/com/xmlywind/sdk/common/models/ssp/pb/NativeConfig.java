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
public final class NativeConfig extends AndroidMessage<NativeConfig, Builder> {
    public static final ProtoAdapter<NativeConfig> ADAPTER;
    public static final Parcelable.Creator<NativeConfig> CREATOR;
    public static final Integer DEFAULT_CACHETOP;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 1)
    public final Integer cacheTop;

    public static final class Builder extends Message.Builder<NativeConfig, Builder> {
        public Integer cacheTop = NativeConfig.DEFAULT_CACHETOP;

        @Override // com.xmlywind.wire.Message.Builder
        public NativeConfig build() {
            return new NativeConfig(this.cacheTop, super.buildUnknownFields());
        }

        public Builder cacheTop(Integer num) {
            this.cacheTop = num;
            return this;
        }
    }

    public static final class ProtoAdapter_NativeConfig extends ProtoAdapter<NativeConfig> {
        public ProtoAdapter_NativeConfig() {
            super(FieldEncoding.LENGTH_DELIMITED, NativeConfig.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.xmlywind.wire.ProtoAdapter
        public NativeConfig decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    protoReader.endMessage(jBeginMessage);
                    return builder.build();
                }
                if (iNextTag != 1) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.cacheTop(ProtoAdapter.INT32.decode(protoReader));
                }
            }
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, NativeConfig nativeConfig) {
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 1, nativeConfig.cacheTop);
            protoWriter.writeBytes(nativeConfig.unknownFields());
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public int encodedSize(NativeConfig nativeConfig) {
            return ProtoAdapter.INT32.encodedSizeWithTag(1, nativeConfig.cacheTop) + nativeConfig.unknownFields().size();
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public NativeConfig redact(NativeConfig nativeConfig) {
            Builder builderNewBuilder = nativeConfig.newBuilder();
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    static {
        ProtoAdapter_NativeConfig protoAdapter_NativeConfig = new ProtoAdapter_NativeConfig();
        ADAPTER = protoAdapter_NativeConfig;
        CREATOR = AndroidMessage.newCreator(protoAdapter_NativeConfig);
        DEFAULT_CACHETOP = 0;
    }

    public NativeConfig(Integer num) {
        this(num, ByteString.EMPTY);
    }

    public NativeConfig(Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        this.cacheTop = num;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof NativeConfig)) {
                return false;
            }
            NativeConfig nativeConfig = (NativeConfig) obj;
            if (!unknownFields().equals(nativeConfig.unknownFields()) || !Internal.equals(this.cacheTop, nativeConfig.cacheTop)) {
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
        Integer num = this.cacheTop;
        int iHashCode2 = (iHashCode * 37) + (num != null ? num.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.xmlywind.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.cacheTop = this.cacheTop;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.xmlywind.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.cacheTop != null) {
            sb.append(", cacheTop=");
            sb.append(this.cacheTop);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "NativeConfig{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
