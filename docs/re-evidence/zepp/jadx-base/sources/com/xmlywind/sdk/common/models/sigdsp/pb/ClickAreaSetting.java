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
public final class ClickAreaSetting extends AndroidMessage<ClickAreaSetting, Builder> {
    public static final ProtoAdapter<ClickAreaSetting> ADAPTER;
    public static final Parcelable.Creator<ClickAreaSetting> CREATOR;
    public static final Float DEFAULT_BOTTOM;
    public static final Float DEFAULT_LEFT;
    public static final Float DEFAULT_RIGHT;
    public static final Float DEFAULT_TOP;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 3)
    public final Float bottom;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 2)
    public final Float left;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 4)
    public final Float right;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", tag = 1)
    public final Float top;

    public static final class Builder extends Message.Builder<ClickAreaSetting, Builder> {
        public Float top = ClickAreaSetting.DEFAULT_TOP;
        public Float left = ClickAreaSetting.DEFAULT_LEFT;
        public Float bottom = ClickAreaSetting.DEFAULT_BOTTOM;
        public Float right = ClickAreaSetting.DEFAULT_RIGHT;

        public Builder bottom(Float f) {
            this.bottom = f;
            return this;
        }

        @Override // com.xmlywind.wire.Message.Builder
        public ClickAreaSetting build() {
            return new ClickAreaSetting(this.top, this.left, this.bottom, this.right, super.buildUnknownFields());
        }

        public Builder left(Float f) {
            this.left = f;
            return this;
        }

        public Builder right(Float f) {
            this.right = f;
            return this;
        }

        public Builder top(Float f) {
            this.top = f;
            return this;
        }
    }

    public static final class ProtoAdapter_ClickAreaSetting extends ProtoAdapter<ClickAreaSetting> {
        public ProtoAdapter_ClickAreaSetting() {
            super(FieldEncoding.LENGTH_DELIMITED, ClickAreaSetting.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.xmlywind.wire.ProtoAdapter
        public ClickAreaSetting decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    protoReader.endMessage(jBeginMessage);
                    return builder.build();
                }
                if (iNextTag == 1) {
                    builder.top(ProtoAdapter.FLOAT.decode(protoReader));
                } else if (iNextTag == 2) {
                    builder.left(ProtoAdapter.FLOAT.decode(protoReader));
                } else if (iNextTag == 3) {
                    builder.bottom(ProtoAdapter.FLOAT.decode(protoReader));
                } else if (iNextTag != 4) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.right(ProtoAdapter.FLOAT.decode(protoReader));
                }
            }
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, ClickAreaSetting clickAreaSetting) {
            ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
            protoAdapter.encodeWithTag(protoWriter, 1, clickAreaSetting.top);
            protoAdapter.encodeWithTag(protoWriter, 2, clickAreaSetting.left);
            protoAdapter.encodeWithTag(protoWriter, 3, clickAreaSetting.bottom);
            protoAdapter.encodeWithTag(protoWriter, 4, clickAreaSetting.right);
            protoWriter.writeBytes(clickAreaSetting.unknownFields());
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public int encodedSize(ClickAreaSetting clickAreaSetting) {
            ProtoAdapter<Float> protoAdapter = ProtoAdapter.FLOAT;
            return protoAdapter.encodedSizeWithTag(1, clickAreaSetting.top) + protoAdapter.encodedSizeWithTag(2, clickAreaSetting.left) + protoAdapter.encodedSizeWithTag(3, clickAreaSetting.bottom) + protoAdapter.encodedSizeWithTag(4, clickAreaSetting.right) + clickAreaSetting.unknownFields().size();
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public ClickAreaSetting redact(ClickAreaSetting clickAreaSetting) {
            Builder builderNewBuilder = clickAreaSetting.newBuilder();
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    static {
        ProtoAdapter_ClickAreaSetting protoAdapter_ClickAreaSetting = new ProtoAdapter_ClickAreaSetting();
        ADAPTER = protoAdapter_ClickAreaSetting;
        CREATOR = AndroidMessage.newCreator(protoAdapter_ClickAreaSetting);
        Float fValueOf = Float.valueOf(0.0f);
        DEFAULT_TOP = fValueOf;
        DEFAULT_LEFT = fValueOf;
        DEFAULT_BOTTOM = fValueOf;
        DEFAULT_RIGHT = fValueOf;
    }

    public ClickAreaSetting(Float f, Float f2, Float f3, Float f4) {
        this(f, f2, f3, f4, ByteString.EMPTY);
    }

    public ClickAreaSetting(Float f, Float f2, Float f3, Float f4, ByteString byteString) {
        super(ADAPTER, byteString);
        this.top = f;
        this.left = f2;
        this.bottom = f3;
        this.right = f4;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof ClickAreaSetting)) {
                return false;
            }
            ClickAreaSetting clickAreaSetting = (ClickAreaSetting) obj;
            if (!unknownFields().equals(clickAreaSetting.unknownFields()) || !Internal.equals(this.top, clickAreaSetting.top) || !Internal.equals(this.left, clickAreaSetting.left) || !Internal.equals(this.bottom, clickAreaSetting.bottom) || !Internal.equals(this.right, clickAreaSetting.right)) {
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
        Float f = this.top;
        int iHashCode2 = f != null ? f.hashCode() : 0;
        Float f2 = this.left;
        int iHashCode3 = f2 != null ? f2.hashCode() : 0;
        Float f3 = this.bottom;
        int iHashCode4 = f3 != null ? f3.hashCode() : 0;
        Float f4 = this.right;
        int iHashCode5 = ((iHashCode4 + ((iHashCode3 + ((iHashCode2 + (iHashCode * 37)) * 37)) * 37)) * 37) + (f4 != null ? f4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.xmlywind.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.top = this.top;
        builder.left = this.left;
        builder.bottom = this.bottom;
        builder.right = this.right;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.xmlywind.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.top != null) {
            sb.append(", top=");
            sb.append(this.top);
        }
        if (this.left != null) {
            sb.append(", left=");
            sb.append(this.left);
        }
        if (this.bottom != null) {
            sb.append(", bottom=");
            sb.append(this.bottom);
        }
        if (this.right != null) {
            sb.append(", right=");
            sb.append(this.right);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "ClickAreaSetting{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
