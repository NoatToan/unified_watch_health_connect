package com.xmlywind.sdk.common.models.sigdsp.pb;

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
public final class HeaderBidding extends AndroidMessage<HeaderBidding, Builder> {
    public static final ProtoAdapter<HeaderBidding> ADAPTER;
    public static final Parcelable.Creator<HeaderBidding> CREATOR;
    public static final String DEFAULT_BID_TOKEN = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String bid_token;

    public static final class Builder extends Message.Builder<HeaderBidding, Builder> {
        public String bid_token;

        public Builder bid_token(String str) {
            this.bid_token = str;
            return this;
        }

        @Override // com.xmlywind.wire.Message.Builder
        public HeaderBidding build() {
            return new HeaderBidding(this.bid_token, super.buildUnknownFields());
        }
    }

    public static final class ProtoAdapter_HeaderBidding extends ProtoAdapter<HeaderBidding> {
        public ProtoAdapter_HeaderBidding() {
            super(FieldEncoding.LENGTH_DELIMITED, HeaderBidding.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.xmlywind.wire.ProtoAdapter
        public HeaderBidding decode(ProtoReader protoReader) {
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
                    builder.bid_token(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, HeaderBidding headerBidding) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, headerBidding.bid_token);
            protoWriter.writeBytes(headerBidding.unknownFields());
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public int encodedSize(HeaderBidding headerBidding) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, headerBidding.bid_token) + headerBidding.unknownFields().size();
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public HeaderBidding redact(HeaderBidding headerBidding) {
            Builder builderNewBuilder = headerBidding.newBuilder();
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    static {
        ProtoAdapter_HeaderBidding protoAdapter_HeaderBidding = new ProtoAdapter_HeaderBidding();
        ADAPTER = protoAdapter_HeaderBidding;
        CREATOR = AndroidMessage.newCreator(protoAdapter_HeaderBidding);
    }

    public HeaderBidding(String str) {
        this(str, ByteString.EMPTY);
    }

    public HeaderBidding(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        this.bid_token = str;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof HeaderBidding)) {
                return false;
            }
            HeaderBidding headerBidding = (HeaderBidding) obj;
            if (!unknownFields().equals(headerBidding.unknownFields()) || !Internal.equals(this.bid_token, headerBidding.bid_token)) {
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
        String str = this.bid_token;
        int iHashCode2 = (iHashCode * 37) + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.xmlywind.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.bid_token = this.bid_token;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.xmlywind.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.bid_token != null) {
            sb.append(", bid_token=");
            sb.append(this.bid_token);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "HeaderBidding{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
