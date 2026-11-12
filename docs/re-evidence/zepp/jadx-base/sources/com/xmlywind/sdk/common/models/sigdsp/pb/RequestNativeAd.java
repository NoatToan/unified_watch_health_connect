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
public final class RequestNativeAd extends AndroidMessage<RequestNativeAd, Builder> {
    public static final ProtoAdapter<RequestNativeAd> ADAPTER;
    public static final Parcelable.Creator<RequestNativeAd> CREATOR;
    public static final Integer DEFAULT_H;
    public static final Integer DEFAULT_W;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.sigmob.sdk.common.models.sigdsp.pb.RequestAsset#ADAPTER", label = WireField.Label.REPEATED, tag = 1)
    public final List<RequestAsset> assets;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 3)
    public final Integer h;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 2)
    public final Integer w;

    public static final class Builder extends Message.Builder<RequestNativeAd, Builder> {
        public List<RequestAsset> assets = Internal.newMutableList();
        public Integer h;
        public Integer w;

        public Builder assets(List<RequestAsset> list) {
            Internal.checkElementsNotNull(list);
            this.assets = list;
            return this;
        }

        @Override // com.xmlywind.wire.Message.Builder
        public RequestNativeAd build() {
            return new RequestNativeAd(this.assets, this.w, this.h, super.buildUnknownFields());
        }

        public Builder h(Integer num) {
            this.h = num;
            return this;
        }

        public Builder w(Integer num) {
            this.w = num;
            return this;
        }
    }

    public static final class ProtoAdapter_RequestNativeAd extends ProtoAdapter<RequestNativeAd> {
        public ProtoAdapter_RequestNativeAd() {
            super(FieldEncoding.LENGTH_DELIMITED, RequestNativeAd.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.xmlywind.wire.ProtoAdapter
        public RequestNativeAd decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    protoReader.endMessage(jBeginMessage);
                    return builder.build();
                }
                if (iNextTag == 1) {
                    builder.assets.add(RequestAsset.ADAPTER.decode(protoReader));
                } else if (iNextTag == 2) {
                    builder.w(ProtoAdapter.UINT32.decode(protoReader));
                } else if (iNextTag != 3) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.h(ProtoAdapter.UINT32.decode(protoReader));
                }
            }
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, RequestNativeAd requestNativeAd) {
            RequestAsset.ADAPTER.asRepeated().encodeWithTag(protoWriter, 1, requestNativeAd.assets);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.encodeWithTag(protoWriter, 2, requestNativeAd.w);
            protoAdapter.encodeWithTag(protoWriter, 3, requestNativeAd.h);
            protoWriter.writeBytes(requestNativeAd.unknownFields());
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public int encodedSize(RequestNativeAd requestNativeAd) {
            int iEncodedSizeWithTag = RequestAsset.ADAPTER.asRepeated().encodedSizeWithTag(1, requestNativeAd.assets);
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, requestNativeAd.w) + protoAdapter.encodedSizeWithTag(3, requestNativeAd.h) + requestNativeAd.unknownFields().size();
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public RequestNativeAd redact(RequestNativeAd requestNativeAd) {
            Builder builderNewBuilder = requestNativeAd.newBuilder();
            Internal.redactElements(builderNewBuilder.assets, RequestAsset.ADAPTER);
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    static {
        ProtoAdapter_RequestNativeAd protoAdapter_RequestNativeAd = new ProtoAdapter_RequestNativeAd();
        ADAPTER = protoAdapter_RequestNativeAd;
        CREATOR = AndroidMessage.newCreator(protoAdapter_RequestNativeAd);
        DEFAULT_W = 0;
        DEFAULT_H = 0;
    }

    public RequestNativeAd(List<RequestAsset> list, Integer num, Integer num2) {
        this(list, num, num2, ByteString.EMPTY);
    }

    public RequestNativeAd(List<RequestAsset> list, Integer num, Integer num2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.assets = Internal.immutableCopyOf("assets", list);
        this.w = num;
        this.h = num2;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof RequestNativeAd)) {
                return false;
            }
            RequestNativeAd requestNativeAd = (RequestNativeAd) obj;
            if (!unknownFields().equals(requestNativeAd.unknownFields()) || !this.assets.equals(requestNativeAd.assets) || !Internal.equals(this.w, requestNativeAd.w) || !Internal.equals(this.h, requestNativeAd.h)) {
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
        int iHashCode2 = this.assets.hashCode();
        Integer num = this.w;
        int iHashCode3 = num != null ? num.hashCode() : 0;
        Integer num2 = this.h;
        int iHashCode4 = ((iHashCode3 + (((iHashCode * 37) + iHashCode2) * 37)) * 37) + (num2 != null ? num2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.xmlywind.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.assets = Internal.copyOf("assets", this.assets);
        builder.w = this.w;
        builder.h = this.h;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.xmlywind.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.assets.isEmpty()) {
            sb.append(", assets=");
            sb.append(this.assets);
        }
        if (this.w != null) {
            sb.append(", w=");
            sb.append(this.w);
        }
        if (this.h != null) {
            sb.append(", h=");
            sb.append(this.h);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "RequestNativeAd{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
