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
public final class AdSetting extends AndroidMessage<AdSetting, Builder> {
    public static final ProtoAdapter<AdSetting> ADAPTER;
    public static final Parcelable.Creator<AdSetting> CREATOR;
    public static final Integer DEFAULT_RETRY_COUNT;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", tag = 3)
    public final Integer retry_count;

    @WireField(adapter = "com.sigmob.sdk.common.models.sigdsp.pb.RvAdSetting#ADAPTER", tag = 1)
    public final RvAdSetting rv_setting;

    @WireField(adapter = "com.sigmob.sdk.common.models.sigdsp.pb.SingleNativeAdSetting#ADAPTER", tag = 4)
    public final SingleNativeAdSetting single_native_setting;

    @WireField(adapter = "com.sigmob.sdk.common.models.sigdsp.pb.SplashAdSetting#ADAPTER", tag = 2)
    public final SplashAdSetting splash_setting;

    public static final class Builder extends Message.Builder<AdSetting, Builder> {
        public Integer retry_count = AdSetting.DEFAULT_RETRY_COUNT;
        public RvAdSetting rv_setting;
        public SingleNativeAdSetting single_native_setting;
        public SplashAdSetting splash_setting;

        @Override // com.xmlywind.wire.Message.Builder
        public AdSetting build() {
            return new AdSetting(this.rv_setting, this.splash_setting, this.retry_count, this.single_native_setting, super.buildUnknownFields());
        }

        public Builder retry_count(Integer num) {
            this.retry_count = num;
            return this;
        }

        public Builder rv_setting(RvAdSetting rvAdSetting) {
            this.rv_setting = rvAdSetting;
            return this;
        }

        public Builder single_native_setting(SingleNativeAdSetting singleNativeAdSetting) {
            this.single_native_setting = singleNativeAdSetting;
            return this;
        }

        public Builder splash_setting(SplashAdSetting splashAdSetting) {
            this.splash_setting = splashAdSetting;
            return this;
        }
    }

    public static final class ProtoAdapter_AdSetting extends ProtoAdapter<AdSetting> {
        public ProtoAdapter_AdSetting() {
            super(FieldEncoding.LENGTH_DELIMITED, AdSetting.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.xmlywind.wire.ProtoAdapter
        public AdSetting decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    protoReader.endMessage(jBeginMessage);
                    return builder.build();
                }
                if (iNextTag == 1) {
                    builder.rv_setting(RvAdSetting.ADAPTER.decode(protoReader));
                } else if (iNextTag == 2) {
                    builder.splash_setting(SplashAdSetting.ADAPTER.decode(protoReader));
                } else if (iNextTag == 3) {
                    builder.retry_count(ProtoAdapter.INT32.decode(protoReader));
                } else if (iNextTag != 4) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.single_native_setting(SingleNativeAdSetting.ADAPTER.decode(protoReader));
                }
            }
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, AdSetting adSetting) {
            RvAdSetting.ADAPTER.encodeWithTag(protoWriter, 1, adSetting.rv_setting);
            SplashAdSetting.ADAPTER.encodeWithTag(protoWriter, 2, adSetting.splash_setting);
            ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, adSetting.retry_count);
            SingleNativeAdSetting.ADAPTER.encodeWithTag(protoWriter, 4, adSetting.single_native_setting);
            protoWriter.writeBytes(adSetting.unknownFields());
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public int encodedSize(AdSetting adSetting) {
            return RvAdSetting.ADAPTER.encodedSizeWithTag(1, adSetting.rv_setting) + SplashAdSetting.ADAPTER.encodedSizeWithTag(2, adSetting.splash_setting) + ProtoAdapter.INT32.encodedSizeWithTag(3, adSetting.retry_count) + SingleNativeAdSetting.ADAPTER.encodedSizeWithTag(4, adSetting.single_native_setting) + adSetting.unknownFields().size();
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public AdSetting redact(AdSetting adSetting) {
            Builder builderNewBuilder = adSetting.newBuilder();
            RvAdSetting rvAdSetting = builderNewBuilder.rv_setting;
            if (rvAdSetting != null) {
                builderNewBuilder.rv_setting = RvAdSetting.ADAPTER.redact(rvAdSetting);
            }
            SplashAdSetting splashAdSetting = builderNewBuilder.splash_setting;
            if (splashAdSetting != null) {
                builderNewBuilder.splash_setting = SplashAdSetting.ADAPTER.redact(splashAdSetting);
            }
            SingleNativeAdSetting singleNativeAdSetting = builderNewBuilder.single_native_setting;
            if (singleNativeAdSetting != null) {
                builderNewBuilder.single_native_setting = SingleNativeAdSetting.ADAPTER.redact(singleNativeAdSetting);
            }
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    static {
        ProtoAdapter_AdSetting protoAdapter_AdSetting = new ProtoAdapter_AdSetting();
        ADAPTER = protoAdapter_AdSetting;
        CREATOR = AndroidMessage.newCreator(protoAdapter_AdSetting);
        DEFAULT_RETRY_COUNT = 0;
    }

    public AdSetting(RvAdSetting rvAdSetting, SplashAdSetting splashAdSetting, Integer num, SingleNativeAdSetting singleNativeAdSetting) {
        this(rvAdSetting, splashAdSetting, num, singleNativeAdSetting, ByteString.EMPTY);
    }

    public AdSetting(RvAdSetting rvAdSetting, SplashAdSetting splashAdSetting, Integer num, SingleNativeAdSetting singleNativeAdSetting, ByteString byteString) {
        super(ADAPTER, byteString);
        this.rv_setting = rvAdSetting;
        this.splash_setting = splashAdSetting;
        this.retry_count = num;
        this.single_native_setting = singleNativeAdSetting;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof AdSetting)) {
                return false;
            }
            AdSetting adSetting = (AdSetting) obj;
            if (!unknownFields().equals(adSetting.unknownFields()) || !Internal.equals(this.rv_setting, adSetting.rv_setting) || !Internal.equals(this.splash_setting, adSetting.splash_setting) || !Internal.equals(this.retry_count, adSetting.retry_count) || !Internal.equals(this.single_native_setting, adSetting.single_native_setting)) {
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
        RvAdSetting rvAdSetting = this.rv_setting;
        int iHashCode2 = rvAdSetting != null ? rvAdSetting.hashCode() : 0;
        SplashAdSetting splashAdSetting = this.splash_setting;
        int iHashCode3 = splashAdSetting != null ? splashAdSetting.hashCode() : 0;
        Integer num = this.retry_count;
        int iHashCode4 = num != null ? num.hashCode() : 0;
        SingleNativeAdSetting singleNativeAdSetting = this.single_native_setting;
        int iHashCode5 = ((iHashCode4 + ((iHashCode3 + ((iHashCode2 + (iHashCode * 37)) * 37)) * 37)) * 37) + (singleNativeAdSetting != null ? singleNativeAdSetting.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.xmlywind.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.rv_setting = this.rv_setting;
        builder.splash_setting = this.splash_setting;
        builder.retry_count = this.retry_count;
        builder.single_native_setting = this.single_native_setting;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.xmlywind.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.rv_setting != null) {
            sb.append(", rv_setting=");
            sb.append(this.rv_setting);
        }
        if (this.splash_setting != null) {
            sb.append(", splash_setting=");
            sb.append(this.splash_setting);
        }
        if (this.retry_count != null) {
            sb.append(", retry_count=");
            sb.append(this.retry_count);
        }
        if (this.single_native_setting != null) {
            sb.append(", single_native_setting=");
            sb.append(this.single_native_setting);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "AdSetting{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
