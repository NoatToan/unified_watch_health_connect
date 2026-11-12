package com.xmlywind.sdk.common.models.sigdsp.pb;

import android.os.Parcelable;
import com.huami.passport.Configs;
import com.xmlywind.wire.AndroidMessage;
import com.xmlywind.wire.FieldEncoding;
import com.xmlywind.wire.Message;
import com.xmlywind.wire.ProtoAdapter;
import com.xmlywind.wire.ProtoReader;
import com.xmlywind.wire.ProtoWriter;
import com.xmlywind.wire.WireField;
import com.xmlywind.wire.internal.Internal;
import com.xmlywind.wire.okio.ByteString;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public final class Network extends AndroidMessage<Network, Builder> {
    public static final ProtoAdapter<Network> ADAPTER;
    public static final Parcelable.Creator<Network> CREATOR;
    public static final String DEFAULT_CARRIER_NAME = "";
    public static final Integer DEFAULT_CONNECTION_TYPE;
    public static final String DEFAULT_IPV4 = "";
    public static final String DEFAULT_MAC = "";
    public static final String DEFAULT_OPERATOR = "";
    public static final Integer DEFAULT_OPERATOR_TYPE;
    public static final String DEFAULT_UA = "";
    public static final String DEFAULT_WIFI_ID = "";
    public static final String DEFAULT_WIFI_MAC = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 10)
    public final String carrier_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 2)
    public final Integer connection_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 9)
    public final Map<String, String> ips;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String ipv4;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 6)
    public final String mac;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 5)
    public final String operator;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 3)
    public final Integer operator_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String ua;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 8)
    public final String wifi_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 7)
    public final String wifi_mac;

    public static final class Builder extends Message.Builder<Network, Builder> {
        public String carrier_name;
        public String ipv4 = "";
        public Integer connection_type = Network.DEFAULT_CONNECTION_TYPE;
        public Integer operator_type = Network.DEFAULT_OPERATOR_TYPE;
        public String ua = "";
        public String operator = "";
        public String mac = "";
        public String wifi_mac = "";
        public String wifi_id = "";
        public Map<String, String> ips = Internal.newMutableMap();

        @Override // com.xmlywind.wire.Message.Builder
        public Network build() {
            return new Network(this.ipv4, this.connection_type, this.operator_type, this.ua, this.operator, this.mac, this.wifi_mac, this.wifi_id, this.ips, this.carrier_name, super.buildUnknownFields());
        }

        public Builder carrier_name(String str) {
            this.carrier_name = str;
            return this;
        }

        public Builder connection_type(Integer num) {
            this.connection_type = num;
            return this;
        }

        public Builder ips(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.ips = map;
            return this;
        }

        public Builder ipv4(String str) {
            this.ipv4 = str;
            return this;
        }

        public Builder mac(String str) {
            this.mac = str;
            return this;
        }

        public Builder operator(String str) {
            this.operator = str;
            return this;
        }

        public Builder operator_type(Integer num) {
            this.operator_type = num;
            return this;
        }

        public Builder ua(String str) {
            this.ua = str;
            return this;
        }

        public Builder wifi_id(String str) {
            this.wifi_id = str;
            return this;
        }

        public Builder wifi_mac(String str) {
            this.wifi_mac = str;
            return this;
        }
    }

    public static final class ProtoAdapter_Network extends ProtoAdapter<Network> {
        private final ProtoAdapter<Map<String, String>> a;

        public ProtoAdapter_Network() {
            super(FieldEncoding.LENGTH_DELIMITED, Network.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.a = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.xmlywind.wire.ProtoAdapter
        public Network decode(ProtoReader protoReader) {
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
                        builder.ipv4(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 2:
                        builder.connection_type(ProtoAdapter.UINT32.decode(protoReader));
                        break;
                    case 3:
                        builder.operator_type(ProtoAdapter.UINT32.decode(protoReader));
                        break;
                    case 4:
                        builder.ua(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 5:
                        builder.operator(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 6:
                        builder.mac(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 7:
                        builder.wifi_mac(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 8:
                        builder.wifi_id(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 9:
                        builder.ips.putAll(this.a.decode(protoReader));
                        break;
                    case 10:
                        builder.carrier_name(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    default:
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                }
            }
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, Network network) {
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            protoAdapter.encodeWithTag(protoWriter, 1, network.ipv4);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.UINT32;
            protoAdapter2.encodeWithTag(protoWriter, 2, network.connection_type);
            protoAdapter2.encodeWithTag(protoWriter, 3, network.operator_type);
            protoAdapter.encodeWithTag(protoWriter, 4, network.ua);
            protoAdapter.encodeWithTag(protoWriter, 5, network.operator);
            protoAdapter.encodeWithTag(protoWriter, 6, network.mac);
            protoAdapter.encodeWithTag(protoWriter, 7, network.wifi_mac);
            protoAdapter.encodeWithTag(protoWriter, 8, network.wifi_id);
            this.a.encodeWithTag(protoWriter, 9, network.ips);
            protoAdapter.encodeWithTag(protoWriter, 10, network.carrier_name);
            protoWriter.writeBytes(network.unknownFields());
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public int encodedSize(Network network) {
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, network.ipv4);
            ProtoAdapter<Integer> protoAdapter2 = ProtoAdapter.UINT32;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, network.connection_type) + protoAdapter2.encodedSizeWithTag(3, network.operator_type) + protoAdapter.encodedSizeWithTag(4, network.ua) + protoAdapter.encodedSizeWithTag(5, network.operator) + protoAdapter.encodedSizeWithTag(6, network.mac) + protoAdapter.encodedSizeWithTag(7, network.wifi_mac) + protoAdapter.encodedSizeWithTag(8, network.wifi_id) + this.a.encodedSizeWithTag(9, network.ips) + protoAdapter.encodedSizeWithTag(10, network.carrier_name) + network.unknownFields().size();
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public Network redact(Network network) {
            Builder builderNewBuilder = network.newBuilder();
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    static {
        ProtoAdapter_Network protoAdapter_Network = new ProtoAdapter_Network();
        ADAPTER = protoAdapter_Network;
        CREATOR = AndroidMessage.newCreator(protoAdapter_Network);
        DEFAULT_CONNECTION_TYPE = 0;
        DEFAULT_OPERATOR_TYPE = 0;
    }

    public Network(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, String str7) {
        this(str, num, num2, str2, str3, str4, str5, str6, map, str7, ByteString.EMPTY);
    }

    public Network(String str, Integer num, Integer num2, String str2, String str3, String str4, String str5, String str6, Map<String, String> map, String str7, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ipv4 = str;
        this.connection_type = num;
        this.operator_type = num2;
        this.ua = str2;
        this.operator = str3;
        this.mac = str4;
        this.wifi_mac = str5;
        this.wifi_id = str6;
        this.ips = Internal.immutableCopyOf(Configs.Params.IPS, map);
        this.carrier_name = str7;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof Network)) {
                return false;
            }
            Network network = (Network) obj;
            if (!unknownFields().equals(network.unknownFields()) || !Internal.equals(this.ipv4, network.ipv4) || !Internal.equals(this.connection_type, network.connection_type) || !Internal.equals(this.operator_type, network.operator_type) || !Internal.equals(this.ua, network.ua) || !Internal.equals(this.operator, network.operator) || !Internal.equals(this.mac, network.mac) || !Internal.equals(this.wifi_mac, network.wifi_mac) || !Internal.equals(this.wifi_id, network.wifi_id) || !this.ips.equals(network.ips) || !Internal.equals(this.carrier_name, network.carrier_name)) {
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
        String str = this.ipv4;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        Integer num = this.connection_type;
        int iHashCode3 = num != null ? num.hashCode() : 0;
        Integer num2 = this.operator_type;
        int iHashCode4 = num2 != null ? num2.hashCode() : 0;
        String str2 = this.ua;
        int iHashCode5 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.operator;
        int iHashCode6 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.mac;
        int iHashCode7 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.wifi_mac;
        int iHashCode8 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.wifi_id;
        int iHashCode9 = str6 != null ? str6.hashCode() : 0;
        int iHashCode10 = this.ips.hashCode();
        String str7 = this.carrier_name;
        int iHashCode11 = ((((iHashCode9 + ((iHashCode8 + ((iHashCode7 + ((iHashCode6 + ((iHashCode5 + ((iHashCode4 + ((iHashCode3 + ((iHashCode2 + (iHashCode * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37)) * 37) + iHashCode10) * 37) + (str7 != null ? str7.hashCode() : 0);
        this.hashCode = iHashCode11;
        return iHashCode11;
    }

    @Override // com.xmlywind.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.ipv4 = this.ipv4;
        builder.connection_type = this.connection_type;
        builder.operator_type = this.operator_type;
        builder.ua = this.ua;
        builder.operator = this.operator;
        builder.mac = this.mac;
        builder.wifi_mac = this.wifi_mac;
        builder.wifi_id = this.wifi_id;
        builder.ips = Internal.copyOf(Configs.Params.IPS, this.ips);
        builder.carrier_name = this.carrier_name;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.xmlywind.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.ipv4 != null) {
            sb.append(", ipv4=");
            sb.append(this.ipv4);
        }
        if (this.connection_type != null) {
            sb.append(", connection_type=");
            sb.append(this.connection_type);
        }
        if (this.operator_type != null) {
            sb.append(", operator_type=");
            sb.append(this.operator_type);
        }
        if (this.ua != null) {
            sb.append(", ua=");
            sb.append(this.ua);
        }
        if (this.operator != null) {
            sb.append(", operator=");
            sb.append(this.operator);
        }
        if (this.mac != null) {
            sb.append(", mac=");
            sb.append(this.mac);
        }
        if (this.wifi_mac != null) {
            sb.append(", wifi_mac=");
            sb.append(this.wifi_mac);
        }
        if (this.wifi_id != null) {
            sb.append(", wifi_id=");
            sb.append(this.wifi_id);
        }
        if (!this.ips.isEmpty()) {
            sb.append(", ips=");
            sb.append(this.ips);
        }
        if (this.carrier_name != null) {
            sb.append(", carrier_name=");
            sb.append(this.carrier_name);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "Network{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
