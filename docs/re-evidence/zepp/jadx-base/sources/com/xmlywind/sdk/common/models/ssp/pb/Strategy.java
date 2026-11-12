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
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public final class Strategy extends AndroidMessage<Strategy, Builder> {
    public static final ProtoAdapter<Strategy> ADAPTER;
    public static final Parcelable.Creator<Strategy> CREATOR;
    public static final String DEFAULT_ADAPTER = "";
    public static final Integer DEFAULT_AD_EXPIRE_TIME;
    public static final String DEFAULT_CHANNEL_ID = "";
    public static final Boolean DEFAULT_ENABLE_EXTRA_CLOSE_CALLBACK;
    public static final String DEFAULT_NAME = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 5)
    public final Integer ad_expire_time;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final String adapter;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String channel_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 6)
    public final Boolean enable_extra_close_callback;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final Map<String, String> options;

    public static final class Builder extends Message.Builder<Strategy, Builder> {
        public Map<String, String> options;
        public String name = "";
        public String adapter = "";
        public String channel_id = "";
        public Integer ad_expire_time = Strategy.DEFAULT_AD_EXPIRE_TIME;
        public Boolean enable_extra_close_callback = Strategy.DEFAULT_ENABLE_EXTRA_CLOSE_CALLBACK;

        public Builder() {
            this.options = new HashMap();
            this.options = Internal.newMutableMap();
        }

        public Builder ad_expire_time(Integer num) {
            this.ad_expire_time = num;
            return this;
        }

        public Builder adapter(String str) {
            this.adapter = str;
            return this;
        }

        @Override // com.xmlywind.wire.Message.Builder
        public Strategy build() {
            return new Strategy(this.name, this.options, this.adapter, this.channel_id, this.ad_expire_time, this.enable_extra_close_callback, super.buildUnknownFields());
        }

        public Builder channel_id(String str) {
            this.channel_id = str;
            return this;
        }

        public Builder enable_extra_close_callback(Boolean bool) {
            this.enable_extra_close_callback = bool;
            return this;
        }

        public Builder name(String str) {
            this.name = str;
            return this;
        }

        public Builder options(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.options = map;
            return this;
        }
    }

    public static final class ProtoAdapter_Strategy extends ProtoAdapter<Strategy> {
        private final ProtoAdapter<Map<String, String>> a;

        public ProtoAdapter_Strategy() {
            super(FieldEncoding.LENGTH_DELIMITED, Strategy.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.a = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.xmlywind.wire.ProtoAdapter
        public Strategy decode(ProtoReader protoReader) {
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
                        builder.name(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 2:
                        builder.options.putAll(this.a.decode(protoReader));
                        break;
                    case 3:
                        builder.adapter(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 4:
                        builder.channel_id(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 5:
                        builder.ad_expire_time(ProtoAdapter.UINT32.decode(protoReader));
                        break;
                    case 6:
                        builder.enable_extra_close_callback(ProtoAdapter.BOOL.decode(protoReader));
                        break;
                    default:
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            }
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, Strategy strategy) {
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, strategy.name);
            this.a.encodeWithTag(protoWriter, 2, strategy.options);
            protoAdapter.encodeWithTag(protoWriter, 3, strategy.adapter);
            protoAdapter.encodeWithTag(protoWriter, 4, strategy.channel_id);
            ProtoAdapter.UINT32.encodeWithTag(protoWriter, 5, strategy.ad_expire_time);
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 6, strategy.enable_extra_close_callback);
            protoWriter.writeBytes(strategy.unknownFields());
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public int encodedSize(Strategy strategy) {
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            return protoAdapter.encodedSizeWithTag(1, strategy.name) + this.a.encodedSizeWithTag(2, strategy.options) + protoAdapter.encodedSizeWithTag(3, strategy.adapter) + protoAdapter.encodedSizeWithTag(4, strategy.channel_id) + ProtoAdapter.UINT32.encodedSizeWithTag(5, strategy.ad_expire_time) + ProtoAdapter.BOOL.encodedSizeWithTag(6, strategy.enable_extra_close_callback) + strategy.unknownFields().size();
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public Strategy redact(Strategy strategy) {
            Builder builderNewBuilder = strategy.newBuilder();
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    static {
        ProtoAdapter_Strategy protoAdapter_Strategy = new ProtoAdapter_Strategy();
        ADAPTER = protoAdapter_Strategy;
        CREATOR = AndroidMessage.newCreator(protoAdapter_Strategy);
        DEFAULT_AD_EXPIRE_TIME = 0;
        DEFAULT_ENABLE_EXTRA_CLOSE_CALLBACK = Boolean.FALSE;
    }

    public Strategy(String str, Map<String, String> map, String str2, String str3, Integer num, Boolean bool) {
        this(str, map, str2, str3, num, bool, ByteString.EMPTY);
    }

    public Strategy(String str, Map<String, String> map, String str2, String str3, Integer num, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        this.name = str;
        this.options = Internal.immutableCopyOf("options", map);
        this.adapter = str2;
        this.channel_id = str3;
        this.ad_expire_time = num;
        this.enable_extra_close_callback = bool;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof Strategy)) {
                return false;
            }
            Strategy strategy = (Strategy) obj;
            if (!unknownFields().equals(strategy.unknownFields()) || !Internal.equals(this.name, strategy.name) || !this.options.equals(strategy.options) || !Internal.equals(this.adapter, strategy.adapter) || !Internal.equals(this.channel_id, strategy.channel_id) || !Internal.equals(this.ad_expire_time, strategy.ad_expire_time) || !Internal.equals(this.enable_extra_close_callback, strategy.enable_extra_close_callback)) {
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
        String str = this.name;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        int iHashCode3 = this.options.hashCode();
        String str2 = this.adapter;
        int iHashCode4 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.channel_id;
        int iHashCode5 = str3 != null ? str3.hashCode() : 0;
        Integer num = this.ad_expire_time;
        int iHashCode6 = num != null ? num.hashCode() : 0;
        Boolean bool = this.enable_extra_close_callback;
        int iHashCode7 = ((iHashCode6 + ((iHashCode5 + ((iHashCode4 + ((((iHashCode2 + (iHashCode * 37)) * 37) + iHashCode3) * 37)) * 37)) * 37)) * 37) + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode7;
        return iHashCode7;
    }

    @Override // com.xmlywind.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.name = this.name;
        builder.options = Internal.copyOf("options", this.options);
        builder.adapter = this.adapter;
        builder.channel_id = this.channel_id;
        builder.ad_expire_time = DEFAULT_AD_EXPIRE_TIME;
        builder.enable_extra_close_callback = this.enable_extra_close_callback;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.xmlywind.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.name != null) {
            sb.append(", name=");
            sb.append(this.name);
        }
        if (!this.options.isEmpty()) {
            sb.append(", options=");
            sb.append(this.options);
        }
        if (this.adapter != null) {
            sb.append(", adapter=");
            sb.append(this.adapter);
        }
        if (this.channel_id != null) {
            sb.append(", channel_id=");
            sb.append(this.channel_id);
        }
        if (this.ad_expire_time != null) {
            sb.append(", ad_expire_time=");
            sb.append(this.ad_expire_time);
        }
        if (this.enable_extra_close_callback != null) {
            sb.append(", enable_extra_close_callback=");
            sb.append(this.enable_extra_close_callback);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "Strategy{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
