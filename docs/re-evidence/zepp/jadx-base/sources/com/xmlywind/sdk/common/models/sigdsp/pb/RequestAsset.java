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
public final class RequestAsset extends AndroidMessage<RequestAsset, Builder> {
    public static final ProtoAdapter<RequestAsset> ADAPTER;
    public static final Parcelable.Creator<RequestAsset> CREATOR;
    public static final Integer DEFAULT_ID;
    public static final Integer DEFAULT_REQUIRED;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 1)
    public final Integer id;

    @WireField(adapter = "com.sigmob.sdk.common.models.sigdsp.pb.RequestAssetImage#ADAPTER", tag = 4)
    public final RequestAssetImage image;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 2)
    public final Integer required;

    @WireField(adapter = "com.sigmob.sdk.common.models.sigdsp.pb.RequestAssetText#ADAPTER", tag = 5)
    public final RequestAssetText text;

    @WireField(adapter = "com.sigmob.sdk.common.models.sigdsp.pb.RequestAssetVideo#ADAPTER", tag = 3)
    public final RequestAssetVideo video;

    public static final class Builder extends Message.Builder<RequestAsset, Builder> {
        public Integer id;
        public RequestAssetImage image;
        public Integer required;
        public RequestAssetText text;
        public RequestAssetVideo video;

        @Override // com.xmlywind.wire.Message.Builder
        public RequestAsset build() {
            return new RequestAsset(this.id, this.required, this.video, this.image, this.text, super.buildUnknownFields());
        }

        public Builder id(Integer num) {
            this.id = num;
            return this;
        }

        public Builder image(RequestAssetImage requestAssetImage) {
            this.image = requestAssetImage;
            return this;
        }

        public Builder required(Integer num) {
            this.required = num;
            return this;
        }

        public Builder text(RequestAssetText requestAssetText) {
            this.text = requestAssetText;
            return this;
        }

        public Builder video(RequestAssetVideo requestAssetVideo) {
            this.video = requestAssetVideo;
            return this;
        }
    }

    public static final class ProtoAdapter_RequestAsset extends ProtoAdapter<RequestAsset> {
        public ProtoAdapter_RequestAsset() {
            super(FieldEncoding.LENGTH_DELIMITED, RequestAsset.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.xmlywind.wire.ProtoAdapter
        public RequestAsset decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    protoReader.endMessage(jBeginMessage);
                    return builder.build();
                }
                if (iNextTag == 1) {
                    builder.id(ProtoAdapter.UINT32.decode(protoReader));
                } else if (iNextTag == 2) {
                    builder.required(ProtoAdapter.UINT32.decode(protoReader));
                } else if (iNextTag == 3) {
                    builder.video(RequestAssetVideo.ADAPTER.decode(protoReader));
                } else if (iNextTag == 4) {
                    builder.image(RequestAssetImage.ADAPTER.decode(protoReader));
                } else if (iNextTag != 5) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.text(RequestAssetText.ADAPTER.decode(protoReader));
                }
            }
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, RequestAsset requestAsset) {
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.encodeWithTag(protoWriter, 1, requestAsset.id);
            protoAdapter.encodeWithTag(protoWriter, 2, requestAsset.required);
            RequestAssetVideo.ADAPTER.encodeWithTag(protoWriter, 3, requestAsset.video);
            RequestAssetImage.ADAPTER.encodeWithTag(protoWriter, 4, requestAsset.image);
            RequestAssetText.ADAPTER.encodeWithTag(protoWriter, 5, requestAsset.text);
            protoWriter.writeBytes(requestAsset.unknownFields());
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public int encodedSize(RequestAsset requestAsset) {
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            return protoAdapter.encodedSizeWithTag(1, requestAsset.id) + protoAdapter.encodedSizeWithTag(2, requestAsset.required) + RequestAssetVideo.ADAPTER.encodedSizeWithTag(3, requestAsset.video) + RequestAssetImage.ADAPTER.encodedSizeWithTag(4, requestAsset.image) + RequestAssetText.ADAPTER.encodedSizeWithTag(5, requestAsset.text) + requestAsset.unknownFields().size();
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public RequestAsset redact(RequestAsset requestAsset) {
            Builder builderNewBuilder = requestAsset.newBuilder();
            RequestAssetVideo requestAssetVideo = builderNewBuilder.video;
            if (requestAssetVideo != null) {
                builderNewBuilder.video = RequestAssetVideo.ADAPTER.redact(requestAssetVideo);
            }
            RequestAssetImage requestAssetImage = builderNewBuilder.image;
            if (requestAssetImage != null) {
                builderNewBuilder.image = RequestAssetImage.ADAPTER.redact(requestAssetImage);
            }
            RequestAssetText requestAssetText = builderNewBuilder.text;
            if (requestAssetText != null) {
                builderNewBuilder.text = RequestAssetText.ADAPTER.redact(requestAssetText);
            }
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    static {
        ProtoAdapter_RequestAsset protoAdapter_RequestAsset = new ProtoAdapter_RequestAsset();
        ADAPTER = protoAdapter_RequestAsset;
        CREATOR = AndroidMessage.newCreator(protoAdapter_RequestAsset);
        DEFAULT_ID = 0;
        DEFAULT_REQUIRED = 0;
    }

    public RequestAsset(Integer num, Integer num2, RequestAssetVideo requestAssetVideo, RequestAssetImage requestAssetImage, RequestAssetText requestAssetText) {
        this(num, num2, requestAssetVideo, requestAssetImage, requestAssetText, ByteString.EMPTY);
    }

    public RequestAsset(Integer num, Integer num2, RequestAssetVideo requestAssetVideo, RequestAssetImage requestAssetImage, RequestAssetText requestAssetText, ByteString byteString) {
        super(ADAPTER, byteString);
        this.id = num;
        this.required = num2;
        this.video = requestAssetVideo;
        this.image = requestAssetImage;
        this.text = requestAssetText;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof RequestAsset)) {
                return false;
            }
            RequestAsset requestAsset = (RequestAsset) obj;
            if (!unknownFields().equals(requestAsset.unknownFields()) || !Internal.equals(this.id, requestAsset.id) || !Internal.equals(this.required, requestAsset.required) || !Internal.equals(this.video, requestAsset.video) || !Internal.equals(this.image, requestAsset.image) || !Internal.equals(this.text, requestAsset.text)) {
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
        Integer num = this.id;
        int iHashCode2 = num != null ? num.hashCode() : 0;
        Integer num2 = this.required;
        int iHashCode3 = num2 != null ? num2.hashCode() : 0;
        RequestAssetVideo requestAssetVideo = this.video;
        int iHashCode4 = requestAssetVideo != null ? requestAssetVideo.hashCode() : 0;
        RequestAssetImage requestAssetImage = this.image;
        int iHashCode5 = requestAssetImage != null ? requestAssetImage.hashCode() : 0;
        RequestAssetText requestAssetText = this.text;
        int iHashCode6 = ((iHashCode5 + ((iHashCode4 + ((iHashCode3 + ((iHashCode2 + (iHashCode * 37)) * 37)) * 37)) * 37)) * 37) + (requestAssetText != null ? requestAssetText.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.xmlywind.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.id = this.id;
        builder.required = this.required;
        builder.video = this.video;
        builder.image = this.image;
        builder.text = this.text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.xmlywind.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.id != null) {
            sb.append(", id=");
            sb.append(this.id);
        }
        if (this.required != null) {
            sb.append(", required=");
            sb.append(this.required);
        }
        if (this.video != null) {
            sb.append(", video=");
            sb.append(this.video);
        }
        if (this.image != null) {
            sb.append(", image=");
            sb.append(this.image);
        }
        if (this.text != null) {
            sb.append(", text=");
            sb.append(this.text);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "RequestAsset{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
