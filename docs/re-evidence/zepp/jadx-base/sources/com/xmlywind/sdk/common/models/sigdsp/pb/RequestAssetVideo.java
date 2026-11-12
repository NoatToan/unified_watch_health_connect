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
public final class RequestAssetVideo extends AndroidMessage<RequestAssetVideo, Builder> {
    public static final ProtoAdapter<RequestAssetVideo> ADAPTER;
    public static final Parcelable.Creator<RequestAssetVideo> CREATOR;
    public static final Integer DEFAULT_H;
    public static final Integer DEFAULT_MAX_DURATION;
    public static final Integer DEFAULT_MIN_DURATION;
    public static final Integer DEFAULT_W;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 3)
    public final Integer h;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 5)
    public final Integer max_duration;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 1)
    public final List<String> mimes;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 4)
    public final Integer min_duration;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 2)
    public final Integer w;

    public static final class Builder extends Message.Builder<RequestAssetVideo, Builder> {
        public Integer h;
        public Integer max_duration;
        public List<String> mimes = Internal.newMutableList();
        public Integer min_duration;
        public Integer w;

        @Override // com.xmlywind.wire.Message.Builder
        public RequestAssetVideo build() {
            return new RequestAssetVideo(this.mimes, this.w, this.h, this.min_duration, this.max_duration, super.buildUnknownFields());
        }

        public Builder h(Integer num) {
            this.h = num;
            return this;
        }

        public Builder max_duration(Integer num) {
            this.max_duration = num;
            return this;
        }

        public Builder mimes(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.mimes = list;
            return this;
        }

        public Builder min_duration(Integer num) {
            this.min_duration = num;
            return this;
        }

        public Builder w(Integer num) {
            this.w = num;
            return this;
        }
    }

    public static final class ProtoAdapter_RequestAssetVideo extends ProtoAdapter<RequestAssetVideo> {
        public ProtoAdapter_RequestAssetVideo() {
            super(FieldEncoding.LENGTH_DELIMITED, RequestAssetVideo.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.xmlywind.wire.ProtoAdapter
        public RequestAssetVideo decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    protoReader.endMessage(jBeginMessage);
                    return builder.build();
                }
                if (iNextTag == 1) {
                    builder.mimes.add(ProtoAdapter.STRING.decode(protoReader));
                } else if (iNextTag == 2) {
                    builder.w(ProtoAdapter.UINT32.decode(protoReader));
                } else if (iNextTag == 3) {
                    builder.h(ProtoAdapter.UINT32.decode(protoReader));
                } else if (iNextTag == 4) {
                    builder.min_duration(ProtoAdapter.UINT32.decode(protoReader));
                } else if (iNextTag != 5) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.max_duration(ProtoAdapter.UINT32.decode(protoReader));
                }
            }
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, RequestAssetVideo requestAssetVideo) {
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 1, requestAssetVideo.mimes);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.encodeWithTag(protoWriter, 2, requestAssetVideo.w);
            protoAdapter.encodeWithTag(protoWriter, 3, requestAssetVideo.h);
            protoAdapter.encodeWithTag(protoWriter, 4, requestAssetVideo.min_duration);
            protoAdapter.encodeWithTag(protoWriter, 5, requestAssetVideo.max_duration);
            protoWriter.writeBytes(requestAssetVideo.unknownFields());
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public int encodedSize(RequestAssetVideo requestAssetVideo) {
            int iEncodedSizeWithTag = ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(1, requestAssetVideo.mimes);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, requestAssetVideo.w) + protoAdapter.encodedSizeWithTag(3, requestAssetVideo.h) + protoAdapter.encodedSizeWithTag(4, requestAssetVideo.min_duration) + protoAdapter.encodedSizeWithTag(5, requestAssetVideo.max_duration) + requestAssetVideo.unknownFields().size();
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public RequestAssetVideo redact(RequestAssetVideo requestAssetVideo) {
            Builder builderNewBuilder = requestAssetVideo.newBuilder();
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    static {
        ProtoAdapter_RequestAssetVideo protoAdapter_RequestAssetVideo = new ProtoAdapter_RequestAssetVideo();
        ADAPTER = protoAdapter_RequestAssetVideo;
        CREATOR = AndroidMessage.newCreator(protoAdapter_RequestAssetVideo);
        DEFAULT_W = 0;
        DEFAULT_H = 0;
        DEFAULT_MIN_DURATION = 0;
        DEFAULT_MAX_DURATION = 0;
    }

    public RequestAssetVideo(List<String> list, Integer num, Integer num2, Integer num3, Integer num4) {
        this(list, num, num2, num3, num4, ByteString.EMPTY);
    }

    public RequestAssetVideo(List<String> list, Integer num, Integer num2, Integer num3, Integer num4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.mimes = Internal.immutableCopyOf("mimes", list);
        this.w = num;
        this.h = num2;
        this.min_duration = num3;
        this.max_duration = num4;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof RequestAssetVideo)) {
                return false;
            }
            RequestAssetVideo requestAssetVideo = (RequestAssetVideo) obj;
            if (!unknownFields().equals(requestAssetVideo.unknownFields()) || !this.mimes.equals(requestAssetVideo.mimes) || !Internal.equals(this.w, requestAssetVideo.w) || !Internal.equals(this.h, requestAssetVideo.h) || !Internal.equals(this.min_duration, requestAssetVideo.min_duration) || !Internal.equals(this.max_duration, requestAssetVideo.max_duration)) {
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
        int iHashCode2 = this.mimes.hashCode();
        Integer num = this.w;
        int iHashCode3 = num != null ? num.hashCode() : 0;
        Integer num2 = this.h;
        int iHashCode4 = num2 != null ? num2.hashCode() : 0;
        Integer num3 = this.min_duration;
        int iHashCode5 = num3 != null ? num3.hashCode() : 0;
        Integer num4 = this.max_duration;
        int iHashCode6 = ((iHashCode5 + ((iHashCode4 + ((iHashCode3 + (((iHashCode * 37) + iHashCode2) * 37)) * 37)) * 37)) * 37) + (num4 != null ? num4.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    @Override // com.xmlywind.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.mimes = Internal.copyOf("mimes", this.mimes);
        builder.w = this.w;
        builder.h = this.h;
        builder.min_duration = this.min_duration;
        builder.max_duration = this.max_duration;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.xmlywind.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
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
        if (this.min_duration != null) {
            sb.append(", min_duration=");
            sb.append(this.min_duration);
        }
        if (this.max_duration != null) {
            sb.append(", max_duration=");
            sb.append(this.max_duration);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "RequestAssetVideo{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
