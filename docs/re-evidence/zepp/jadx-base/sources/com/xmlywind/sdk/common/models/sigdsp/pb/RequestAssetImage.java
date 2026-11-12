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
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class RequestAssetImage extends AndroidMessage<RequestAssetImage, Builder> {
    public static final ProtoAdapter<RequestAssetImage> ADAPTER;
    public static final Parcelable.Creator<RequestAssetImage> CREATOR;
    public static final Integer DEFAULT_H;
    public static final Integer DEFAULT_TYPE;
    public static final Integer DEFAULT_W;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 4)
    public final Integer h;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 2)
    public final List<String> mimes;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 1)
    public final Integer type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 3)
    public final Integer w;

    public static final class Builder extends Message.Builder<RequestAssetImage, Builder> {
        public Integer h;
        public List<String> mimes = Internal.newMutableList();
        public Integer type;
        public Integer w;

        @Override // com.xmlywind.wire.Message.Builder
        public RequestAssetImage build() {
            return new RequestAssetImage(this.type, this.mimes, this.w, this.h, super.buildUnknownFields());
        }

        public Builder h(Integer num) {
            this.h = num;
            return this;
        }

        public Builder mimes(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.mimes = list;
            return this;
        }

        public Builder type(Integer num) {
            this.type = num;
            return this;
        }

        public Builder w(Integer num) {
            this.w = num;
            return this;
        }
    }

    public static final class ProtoAdapter_RequestAssetImage extends ProtoAdapter<RequestAssetImage> {
        public ProtoAdapter_RequestAssetImage() {
            super(FieldEncoding.LENGTH_DELIMITED, RequestAssetImage.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.xmlywind.wire.ProtoAdapter
        public RequestAssetImage decode(ProtoReader protoReader) {
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
                    builder.mimes.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (iNextTag == 3) {
                    builder.w(ProtoAdapter.UINT32.decode(protoReader));
                } else if (iNextTag != 4) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.h(ProtoAdapter.UINT32.decode(protoReader));
                }
            }
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, RequestAssetImage requestAssetImage) {
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.encodeWithTag(protoWriter, 1, requestAssetImage.type);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, requestAssetImage.mimes);
            protoAdapter.encodeWithTag(protoWriter, 3, requestAssetImage.w);
            protoAdapter.encodeWithTag(protoWriter, 4, requestAssetImage.h);
            protoWriter.writeBytes(requestAssetImage.unknownFields());
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public int encodedSize(RequestAssetImage requestAssetImage) {
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            return protoAdapter.encodedSizeWithTag(1, requestAssetImage.type) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, requestAssetImage.mimes) + protoAdapter.encodedSizeWithTag(3, requestAssetImage.w) + protoAdapter.encodedSizeWithTag(4, requestAssetImage.h) + requestAssetImage.unknownFields().size();
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public RequestAssetImage redact(RequestAssetImage requestAssetImage) {
            Builder builderNewBuilder = requestAssetImage.newBuilder();
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    static {
        ProtoAdapter_RequestAssetImage protoAdapter_RequestAssetImage = new ProtoAdapter_RequestAssetImage();
        ADAPTER = protoAdapter_RequestAssetImage;
        CREATOR = AndroidMessage.newCreator(protoAdapter_RequestAssetImage);
        DEFAULT_TYPE = 0;
        DEFAULT_W = 0;
        DEFAULT_H = 0;
    }

    public RequestAssetImage(Integer num, List<String> list, Integer num2, Integer num3) {
        this(num, list, num2, num3, ByteString.EMPTY);
    }

    public RequestAssetImage(Integer num, List<String> list, Integer num2, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.type = num;
        this.mimes = Internal.immutableCopyOf("mimes", list);
        this.w = num2;
        this.h = num3;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof RequestAssetImage)) {
                return false;
            }
            RequestAssetImage requestAssetImage = (RequestAssetImage) obj;
            if (!unknownFields().equals(requestAssetImage.unknownFields()) || !Internal.equals(this.type, requestAssetImage.type) || !this.mimes.equals(requestAssetImage.mimes) || !Internal.equals(this.w, requestAssetImage.w) || !Internal.equals(this.h, requestAssetImage.h)) {
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
        int iHashCode3 = this.mimes.hashCode();
        Integer num2 = this.w;
        int iHashCode4 = num2 != null ? num2.hashCode() : 0;
        Integer num3 = this.h;
        int iHashCode5 = ((iHashCode4 + ((((iHashCode2 + (iHashCode * 37)) * 37) + iHashCode3) * 37)) * 37) + (num3 != null ? num3.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.xmlywind.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.type = this.type;
        builder.mimes = Internal.copyOf("mimes", this.mimes);
        builder.w = this.w;
        builder.h = this.h;
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
        if (!this.mimes.isEmpty()) {
            sb.append(", mimes=");
            sb.append(this.mimes);
        }
        if (this.w != null) {
            sb.append(", w=");
            sb.append(this.w);
        }
        if (this.h != null) {
            sb.append(", h=");
            sb.append(this.h);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "RequestAssetImage{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
