package com.xmlywind.sdk.common.models.ssp.pb;

import android.os.Parcelable;
import com.xmlywind.sdk.common.models.sigdsp.pb.Device;
import com.xmlywind.sdk.common.models.sigdsp.pb.Geo;
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
public final class SdkConfigRequest extends AndroidMessage<SdkConfigRequest, Builder> {
    public static final ProtoAdapter<SdkConfigRequest> ADAPTER;
    public static final Parcelable.Creator<SdkConfigRequest> CREATOR;
    public static final String DEFAULT_ANDROID_ID = "";
    public static final String DEFAULT_COUNTRY = "";
    public static final String DEFAULT_GAID = "";
    public static final String DEFAULT_IDFA = "";
    public static final String DEFAULT_IDFV = "";
    public static final String DEFAULT_IMEI = "";
    public static final String DEFAULT_LANGUAGE = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String android_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String country;

    @WireField(adapter = "com.sigmob.sdk.common.models.sigdsp.pb.Device#ADAPTER", tag = 9)
    public final Device device;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public final String gaid;

    @WireField(adapter = "com.sigmob.sdk.common.models.sigdsp.pb.Geo#ADAPTER", tag = 5)
    public final Geo geo;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String idfa;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String idfv;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String imei;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String language;

    public static final class Builder extends Message.Builder<SdkConfigRequest, Builder> {
        public String android_id;
        public String country;
        public Device device;
        public String gaid;
        public Geo geo;
        public String idfa;
        public String idfv;
        public String imei;
        public String language;

        public Builder android_id(String str) {
            this.android_id = str;
            return this;
        }

        @Override // com.xmlywind.wire.Message.Builder
        public SdkConfigRequest build() {
            return new SdkConfigRequest(this.language, this.idfa, this.idfv, this.country, this.geo, this.android_id, this.imei, this.gaid, this.device, super.buildUnknownFields());
        }

        public Builder country(String str) {
            this.country = str;
            return this;
        }

        public Builder device(Device device) {
            this.device = device;
            return this;
        }

        public Builder gaid(String str) {
            this.gaid = str;
            return this;
        }

        public Builder geo(Geo geo) {
            this.geo = geo;
            return this;
        }

        public Builder idfa(String str) {
            this.idfa = str;
            return this;
        }

        public Builder idfv(String str) {
            this.idfv = str;
            return this;
        }

        public Builder imei(String str) {
            this.imei = str;
            return this;
        }

        public Builder language(String str) {
            this.language = str;
            return this;
        }
    }

    public static final class ProtoAdapter_SdkConfigRequest extends ProtoAdapter<SdkConfigRequest> {
        public ProtoAdapter_SdkConfigRequest() {
            super(FieldEncoding.LENGTH_DELIMITED, SdkConfigRequest.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.xmlywind.wire.ProtoAdapter
        public SdkConfigRequest decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    protoReader.endMessage(jBeginMessage);
                    return builder.build();
                }
                switch (iNextTag) {
                    case 1:
                        builder.language(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 2:
                        builder.idfa(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 3:
                        builder.idfv(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 4:
                        builder.country(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 5:
                        builder.geo(Geo.ADAPTER.decode(protoReader));
                        break;
                    case 6:
                        builder.android_id(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 7:
                        builder.imei(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 8:
                        builder.gaid(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 9:
                        builder.device(Device.ADAPTER.decode(protoReader));
                        break;
                    default:
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            }
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, SdkConfigRequest sdkConfigRequest) {
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, sdkConfigRequest.language);
            protoAdapter.encodeWithTag(protoWriter, 2, sdkConfigRequest.idfa);
            protoAdapter.encodeWithTag(protoWriter, 3, sdkConfigRequest.idfv);
            protoAdapter.encodeWithTag(protoWriter, 4, sdkConfigRequest.country);
            Geo.ADAPTER.encodeWithTag(protoWriter, 5, sdkConfigRequest.geo);
            protoAdapter.encodeWithTag(protoWriter, 6, sdkConfigRequest.android_id);
            protoAdapter.encodeWithTag(protoWriter, 7, sdkConfigRequest.imei);
            protoAdapter.encodeWithTag(protoWriter, 8, sdkConfigRequest.gaid);
            Device.ADAPTER.encodeWithTag(protoWriter, 9, sdkConfigRequest.device);
            protoWriter.writeBytes(sdkConfigRequest.unknownFields());
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public int encodedSize(SdkConfigRequest sdkConfigRequest) {
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, sdkConfigRequest.language) + protoAdapter.encodedSizeWithTag(2, sdkConfigRequest.idfa) + protoAdapter.encodedSizeWithTag(3, sdkConfigRequest.idfv) + protoAdapter.encodedSizeWithTag(4, sdkConfigRequest.country) + Geo.ADAPTER.encodedSizeWithTag(5, sdkConfigRequest.geo) + protoAdapter.encodedSizeWithTag(6, sdkConfigRequest.android_id) + protoAdapter.encodedSizeWithTag(7, sdkConfigRequest.imei) + protoAdapter.encodedSizeWithTag(8, sdkConfigRequest.gaid) + Device.ADAPTER.encodedSizeWithTag(9, sdkConfigRequest.device) + sdkConfigRequest.unknownFields().size();
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public SdkConfigRequest redact(SdkConfigRequest sdkConfigRequest) {
            Builder builderNewBuilder = sdkConfigRequest.newBuilder();
            Geo geo = builderNewBuilder.geo;
            if (geo != null) {
                builderNewBuilder.geo = Geo.ADAPTER.redact(geo);
            }
            Device device = builderNewBuilder.device;
            if (device != null) {
                builderNewBuilder.device = Device.ADAPTER.redact(device);
            }
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    static {
        ProtoAdapter_SdkConfigRequest protoAdapter_SdkConfigRequest = new ProtoAdapter_SdkConfigRequest();
        ADAPTER = protoAdapter_SdkConfigRequest;
        CREATOR = AndroidMessage.newCreator(protoAdapter_SdkConfigRequest);
    }

    public SdkConfigRequest(String str, String str2, String str3, String str4, Geo geo, String str5, String str6, String str7, Device device) {
        this(str, str2, str3, str4, geo, str5, str6, str7, device, ByteString.EMPTY);
    }

    public SdkConfigRequest(String str, String str2, String str3, String str4, Geo geo, String str5, String str6, String str7, Device device, ByteString byteString) {
        super(ADAPTER, byteString);
        this.language = str;
        this.idfa = str2;
        this.idfv = str3;
        this.country = str4;
        this.geo = geo;
        this.android_id = str5;
        this.imei = str6;
        this.gaid = str7;
        this.device = device;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof SdkConfigRequest)) {
                return false;
            }
            SdkConfigRequest sdkConfigRequest = (SdkConfigRequest) obj;
            if (!unknownFields().equals(sdkConfigRequest.unknownFields()) || !Internal.equals(this.language, sdkConfigRequest.language) || !Internal.equals(this.idfa, sdkConfigRequest.idfa) || !Internal.equals(this.idfv, sdkConfigRequest.idfv) || !Internal.equals(this.country, sdkConfigRequest.country) || !Internal.equals(this.geo, sdkConfigRequest.geo) || !Internal.equals(this.android_id, sdkConfigRequest.android_id) || !Internal.equals(this.imei, sdkConfigRequest.imei) || !Internal.equals(this.gaid, sdkConfigRequest.gaid) || !Internal.equals(this.device, sdkConfigRequest.device)) {
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
        String str = this.language;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.idfa;
        int iHashCode3 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.idfv;
        int iHashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.country;
        int iHashCode5 = str4 != null ? str4.hashCode() : 0;
        Geo geo = this.geo;
        int iHashCode6 = geo != null ? geo.hashCode() : 0;
        String str5 = this.android_id;
        int iHashCode7 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.imei;
        int iHashCode8 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.gaid;
        int iHashCode9 = str7 != null ? str7.hashCode() : 0;
        Device device = this.device;
        int iHashCode10 = ((iHashCode9 + ((iHashCode8 + ((iHashCode7 + ((iHashCode6 + ((iHashCode5 + ((iHashCode4 + ((iHashCode3 + ((iHashCode2 + (iHashCode * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37) + (device != null ? device.hashCode() : 0);
        this.hashCode = iHashCode10;
        return iHashCode10;
    }

    @Override // com.xmlywind.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.language = this.language;
        builder.idfa = this.idfa;
        builder.idfv = this.idfv;
        builder.country = this.country;
        builder.geo = this.geo;
        builder.android_id = this.android_id;
        builder.imei = this.imei;
        builder.gaid = this.gaid;
        builder.device = this.device;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.xmlywind.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.language != null) {
            sb.append(", language=");
            sb.append(this.language);
        }
        if (this.idfa != null) {
            sb.append(", idfa=");
            sb.append(this.idfa);
        }
        if (this.idfv != null) {
            sb.append(", idfv=");
            sb.append(this.idfv);
        }
        if (this.country != null) {
            sb.append(", country=");
            sb.append(this.country);
        }
        if (this.geo != null) {
            sb.append(", geo=");
            sb.append(this.geo);
        }
        if (this.android_id != null) {
            sb.append(", android_id=");
            sb.append(this.android_id);
        }
        if (this.imei != null) {
            sb.append(", imei=");
            sb.append(this.imei);
        }
        if (this.gaid != null) {
            sb.append(", gaid=");
            sb.append(this.gaid);
        }
        if (this.device != null) {
            sb.append(", device=");
            sb.append(this.device);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "SdkConfigRequest{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
