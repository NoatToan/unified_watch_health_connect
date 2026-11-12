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
public final class SdkConfigV2 extends AndroidMessage<SdkConfigV2, Builder> {
    public static final ProtoAdapter<SdkConfigV2> ADAPTER;
    public static final Parcelable.Creator<SdkConfigV2> CREATOR;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.sigmob.sdk.base.models.ssp.pb.Android#ADAPTER", tag = 3)
    public final Android android_config;

    @WireField(adapter = "com.sigmob.sdk.base.models.ssp.pb.Common#ADAPTER", tag = 1)
    public final Common common_config;

    @WireField(adapter = "com.sigmob.sdk.base.models.ssp.pb.IOS#ADAPTER", tag = 2)
    public final IOS ios_config;

    public static final class Builder extends Message.Builder<SdkConfigV2, Builder> {
        public Android android_config;
        public Common common_config;
        public IOS ios_config;

        public Builder android_config(Android android2) {
            this.android_config = android2;
            return this;
        }

        @Override // com.xmlywind.wire.Message.Builder
        public SdkConfigV2 build() {
            return new SdkConfigV2(this.common_config, this.ios_config, this.android_config, super.buildUnknownFields());
        }

        public Builder common_config(Common common) {
            this.common_config = common;
            return this;
        }

        public Builder ios_config(IOS ios) {
            this.ios_config = ios;
            return this;
        }
    }

    public static final class ProtoAdapter_SdkConfigV2 extends ProtoAdapter<SdkConfigV2> {
        public ProtoAdapter_SdkConfigV2() {
            super(FieldEncoding.LENGTH_DELIMITED, SdkConfigV2.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.xmlywind.wire.ProtoAdapter
        public SdkConfigV2 decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    protoReader.endMessage(jBeginMessage);
                    return builder.build();
                }
                if (iNextTag == 1) {
                    builder.common_config(Common.ADAPTER.decode(protoReader));
                } else if (iNextTag == 2) {
                    builder.ios_config(IOS.ADAPTER.decode(protoReader));
                } else if (iNextTag != 3) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.android_config(Android.ADAPTER.decode(protoReader));
                }
            }
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, SdkConfigV2 sdkConfigV2) {
            Common.ADAPTER.encodeWithTag(protoWriter, 1, sdkConfigV2.common_config);
            IOS.ADAPTER.encodeWithTag(protoWriter, 2, sdkConfigV2.ios_config);
            Android.ADAPTER.encodeWithTag(protoWriter, 3, sdkConfigV2.android_config);
            protoWriter.writeBytes(sdkConfigV2.unknownFields());
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public int encodedSize(SdkConfigV2 sdkConfigV2) {
            return Common.ADAPTER.encodedSizeWithTag(1, sdkConfigV2.common_config) + IOS.ADAPTER.encodedSizeWithTag(2, sdkConfigV2.ios_config) + Android.ADAPTER.encodedSizeWithTag(3, sdkConfigV2.android_config) + sdkConfigV2.unknownFields().size();
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public SdkConfigV2 redact(SdkConfigV2 sdkConfigV2) {
            Builder builderNewBuilder = sdkConfigV2.newBuilder();
            Common common = builderNewBuilder.common_config;
            if (common != null) {
                builderNewBuilder.common_config = Common.ADAPTER.redact(common);
            }
            IOS ios = builderNewBuilder.ios_config;
            if (ios != null) {
                builderNewBuilder.ios_config = IOS.ADAPTER.redact(ios);
            }
            Android android2 = builderNewBuilder.android_config;
            if (android2 != null) {
                builderNewBuilder.android_config = Android.ADAPTER.redact(android2);
            }
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    static {
        ProtoAdapter_SdkConfigV2 protoAdapter_SdkConfigV2 = new ProtoAdapter_SdkConfigV2();
        ADAPTER = protoAdapter_SdkConfigV2;
        CREATOR = AndroidMessage.newCreator(protoAdapter_SdkConfigV2);
    }

    public SdkConfigV2(Common common, IOS ios, Android android2) {
        this(common, ios, android2, ByteString.EMPTY);
    }

    public SdkConfigV2(Common common, IOS ios, Android android2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.common_config = common;
        this.ios_config = ios;
        this.android_config = android2;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof SdkConfigV2)) {
                return false;
            }
            SdkConfigV2 sdkConfigV2 = (SdkConfigV2) obj;
            if (!unknownFields().equals(sdkConfigV2.unknownFields()) || !Internal.equals(this.common_config, sdkConfigV2.common_config) || !Internal.equals(this.ios_config, sdkConfigV2.ios_config) || !Internal.equals(this.android_config, sdkConfigV2.android_config)) {
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
        Common common = this.common_config;
        int iHashCode2 = common != null ? common.hashCode() : 0;
        IOS ios = this.ios_config;
        int iHashCode3 = ios != null ? ios.hashCode() : 0;
        Android android2 = this.android_config;
        int iHashCode4 = ((iHashCode3 + ((iHashCode2 + (iHashCode * 37)) * 37)) * 37) + (android2 != null ? android2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.xmlywind.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.common_config = this.common_config;
        builder.ios_config = this.ios_config;
        builder.android_config = this.android_config;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.xmlywind.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.common_config != null) {
            sb.append(", common_config=");
            sb.append(this.common_config);
        }
        if (this.ios_config != null) {
            sb.append(", ios_config=");
            sb.append(this.ios_config);
        }
        if (this.android_config != null) {
            sb.append(", android_config=");
            sb.append(this.android_config);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "SdkConfigV2{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
