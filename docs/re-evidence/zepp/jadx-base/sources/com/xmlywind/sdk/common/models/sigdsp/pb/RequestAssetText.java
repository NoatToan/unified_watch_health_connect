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
public final class RequestAssetText extends AndroidMessage<RequestAssetText, Builder> {
    public static final ProtoAdapter<RequestAssetText> ADAPTER;
    public static final Parcelable.Creator<RequestAssetText> CREATOR;
    public static final Integer DEFAULT_MAX_LENGTH;
    public static final Integer DEFAULT_MIN_LENGTH;
    public static final Integer DEFAULT_TYPE;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 3)
    public final Integer max_length;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 2)
    public final Integer min_length;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 1)
    public final Integer type;

    public static final class Builder extends Message.Builder<RequestAssetText, Builder> {
        public Integer max_length;
        public Integer min_length;
        public Integer type;

        @Override // com.xmlywind.wire.Message.Builder
        public RequestAssetText build() {
            return new RequestAssetText(this.type, this.min_length, this.max_length, super.buildUnknownFields());
        }

        public Builder max_length(Integer num) {
            this.max_length = num;
            return this;
        }

        public Builder min_length(Integer num) {
            this.min_length = num;
            return this;
        }

        public Builder type(Integer num) {
            this.type = num;
            return this;
        }
    }

    public static final class ProtoAdapter_RequestAssetText extends ProtoAdapter<RequestAssetText> {
        public ProtoAdapter_RequestAssetText() {
            super(FieldEncoding.LENGTH_DELIMITED, RequestAssetText.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.xmlywind.wire.ProtoAdapter
        public RequestAssetText decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    protoReader.endMessage(jBeginMessage);
                    return builder.build();
                }
                if (iNextTag == 1) {
                    builder.type(ProtoAdapter.UINT32.decode(protoReader));
                } else if (iNextTag == 2) {
                    builder.min_length(ProtoAdapter.UINT32.decode(protoReader));
                } else if (iNextTag != 3) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.max_length(ProtoAdapter.UINT32.decode(protoReader));
                }
            }
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, RequestAssetText requestAssetText) {
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.encodeWithTag(protoWriter, 1, requestAssetText.type);
            protoAdapter.encodeWithTag(protoWriter, 2, requestAssetText.min_length);
            protoAdapter.encodeWithTag(protoWriter, 3, requestAssetText.max_length);
            protoWriter.writeBytes(requestAssetText.unknownFields());
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public int encodedSize(RequestAssetText requestAssetText) {
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            return protoAdapter.encodedSizeWithTag(1, requestAssetText.type) + protoAdapter.encodedSizeWithTag(2, requestAssetText.min_length) + protoAdapter.encodedSizeWithTag(3, requestAssetText.max_length) + requestAssetText.unknownFields().size();
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public RequestAssetText redact(RequestAssetText requestAssetText) {
            Builder builderNewBuilder = requestAssetText.newBuilder();
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    static {
        ProtoAdapter_RequestAssetText protoAdapter_RequestAssetText = new ProtoAdapter_RequestAssetText();
        ADAPTER = protoAdapter_RequestAssetText;
        CREATOR = AndroidMessage.newCreator(protoAdapter_RequestAssetText);
        DEFAULT_TYPE = 0;
        DEFAULT_MIN_LENGTH = 0;
        DEFAULT_MAX_LENGTH = 0;
    }

    public RequestAssetText(Integer num, Integer num2, Integer num3) {
        this(num, num2, num3, ByteString.EMPTY);
    }

    public RequestAssetText(Integer num, Integer num2, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = num;
        this.min_length = num2;
        this.max_length = num3;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof RequestAssetText)) {
                return false;
            }
            RequestAssetText requestAssetText = (RequestAssetText) obj;
            if (!unknownFields().equals(requestAssetText.unknownFields()) || !Internal.equals(this.type, requestAssetText.type) || !Internal.equals(this.min_length, requestAssetText.min_length) || !Internal.equals(this.max_length, requestAssetText.max_length)) {
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
        Integer num = this.type;
        int iHashCode2 = num != null ? num.hashCode() : 0;
        Integer num2 = this.min_length;
        int iHashCode3 = num2 != null ? num2.hashCode() : 0;
        Integer num3 = this.max_length;
        int iHashCode4 = ((iHashCode3 + ((iHashCode2 + (iHashCode * 37)) * 37)) * 37) + (num3 != null ? num3.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.xmlywind.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.type = this.type;
        builder.min_length = this.min_length;
        builder.max_length = this.max_length;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.xmlywind.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.type != null) {
            sb.append(", type=");
            sb.append(this.type);
        }
        if (this.min_length != null) {
            sb.append(", min_length=");
            sb.append(this.min_length);
        }
        if (this.max_length != null) {
            sb.append(", max_length=");
            sb.append(this.max_length);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "RequestAssetText{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
