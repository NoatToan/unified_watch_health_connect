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
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public final class BidRequest extends AndroidMessage<BidRequest, Builder> {
    public static final ProtoAdapter<BidRequest> ADAPTER;
    public static final Parcelable.Creator<BidRequest> CREATOR;
    public static final Boolean DEFAULT_AD_IS_EXPIRED;
    public static final Boolean DEFAULT_DISABLE_MEDIATION;
    public static final String DEFAULT_REQUEST_ID = "";
    public static final Integer DEFAULT_REQUEST_SCENE_TYPE;
    public static final Long DEFAULT_REQ_TIMESTAMP;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 9)
    public final Boolean ad_is_expired;

    @WireField(adapter = "com.sigmob.sdk.common.models.sigdsp.pb.Version#ADAPTER", tag = 2)
    public final Version api_version;

    @WireField(adapter = "com.sigmob.sdk.common.models.sigdsp.pb.App#ADAPTER", tag = 3)
    public final App app;

    @WireField(adapter = "com.sigmob.sdk.common.models.sigdsp.pb.Device#ADAPTER", tag = 4)
    public final Device device;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 11)
    public final Boolean disable_mediation;

    @WireField(adapter = "com.sigmob.sdk.common.models.sigdsp.pb.HeaderBidding#ADAPTER", tag = 16)
    public final HeaderBidding header_bidding;

    @WireField(adapter = "com.sigmob.sdk.common.models.sigdsp.pb.Network#ADAPTER", tag = 5)
    public final Network network;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 15)
    public final Map<String, String> options;

    @WireField(adapter = "com.sigmob.sdk.common.models.sigdsp.pb.Privacy#ADAPTER", tag = 10)
    public final Privacy privacy;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT64", tag = 7)
    public final Long req_timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String request_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 8)
    public final Integer request_scene_type;

    @WireField(adapter = "com.sigmob.sdk.common.models.sigdsp.pb.AdSlot#ADAPTER", label = WireField.Label.REPEATED, tag = 6)
    public final List<AdSlot> slots;

    @WireField(adapter = "com.sigmob.sdk.common.models.sigdsp.pb.User#ADAPTER", tag = 17)
    public final User user;

    public static final class Builder extends Message.Builder<BidRequest, Builder> {
        public Version api_version;
        public App app;
        public Device device;
        public HeaderBidding header_bidding;
        public Network network;
        public Privacy privacy;
        public User user;
        public String request_id = "";
        public Long req_timestamp = BidRequest.DEFAULT_REQ_TIMESTAMP;
        public Integer request_scene_type = BidRequest.DEFAULT_REQUEST_SCENE_TYPE;
        public Boolean ad_is_expired = BidRequest.DEFAULT_AD_IS_EXPIRED;
        public Boolean disable_mediation = BidRequest.DEFAULT_DISABLE_MEDIATION;
        public List<AdSlot> slots = Internal.newMutableList();
        public Map<String, String> options = Internal.newMutableMap();

        public Builder ad_is_expired(Boolean bool) {
            this.ad_is_expired = bool;
            return this;
        }

        public Builder api_version(Version version) {
            this.api_version = version;
            return this;
        }

        public Builder app(App app) {
            this.app = app;
            return this;
        }

        @Override // com.xmlywind.wire.Message.Builder
        public BidRequest build() {
            return new BidRequest(this.request_id, this.api_version, this.app, this.device, this.network, this.slots, this.req_timestamp, this.request_scene_type, this.ad_is_expired, this.privacy, this.disable_mediation, this.options, this.header_bidding, this.user, super.buildUnknownFields());
        }

        public Builder device(Device device) {
            this.device = device;
            return this;
        }

        public Builder disable_mediation(Boolean bool) {
            this.disable_mediation = bool;
            return this;
        }

        public Builder header_bidding(HeaderBidding headerBidding) {
            this.header_bidding = headerBidding;
            return this;
        }

        public Builder network(Network network) {
            this.network = network;
            return this;
        }

        public Builder options(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.options = map;
            return this;
        }

        public Builder privacy(Privacy privacy) {
            this.privacy = privacy;
            return this;
        }

        public Builder req_timestamp(Long l) {
            this.req_timestamp = l;
            return this;
        }

        public Builder request_id(String str) {
            this.request_id = str;
            return this;
        }

        public Builder request_scene_type(Integer num) {
            this.request_scene_type = num;
            return this;
        }

        public Builder slots(List<AdSlot> list) {
            Internal.checkElementsNotNull(list);
            this.slots = list;
            return this;
        }

        public Builder user(User user) {
            this.user = user;
            return this;
        }
    }

    public static final class ProtoAdapter_BidRequest extends ProtoAdapter<BidRequest> {
        private final ProtoAdapter<Map<String, String>> a;

        public ProtoAdapter_BidRequest() {
            super(FieldEncoding.LENGTH_DELIMITED, BidRequest.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.a = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.xmlywind.wire.ProtoAdapter
        public BidRequest decode(ProtoReader protoReader) {
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
                        builder.request_id(ProtoAdapter.STRING.decode(protoReader));
                        break;
                    case 2:
                        builder.api_version(Version.ADAPTER.decode(protoReader));
                        break;
                    case 3:
                        builder.app(App.ADAPTER.decode(protoReader));
                        break;
                    case 4:
                        builder.device(Device.ADAPTER.decode(protoReader));
                        break;
                    case 5:
                        builder.network(Network.ADAPTER.decode(protoReader));
                        break;
                    case 6:
                        builder.slots.add(AdSlot.ADAPTER.decode(protoReader));
                        break;
                    case 7:
                        builder.req_timestamp(ProtoAdapter.INT64.decode(protoReader));
                        break;
                    case 8:
                        builder.request_scene_type(ProtoAdapter.UINT32.decode(protoReader));
                        break;
                    case 9:
                        builder.ad_is_expired(ProtoAdapter.BOOL.decode(protoReader));
                        break;
                    case 10:
                        builder.privacy(Privacy.ADAPTER.decode(protoReader));
                        break;
                    case 11:
                        builder.disable_mediation(ProtoAdapter.BOOL.decode(protoReader));
                        break;
                    case 12:
                    case 13:
                    case 14:
                    default:
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        break;
                    case 15:
                        builder.options.putAll(this.a.decode(protoReader));
                        break;
                    case 16:
                        builder.header_bidding(HeaderBidding.ADAPTER.decode(protoReader));
                        break;
                    case 17:
                        builder.user(User.ADAPTER.decode(protoReader));
                        break;
                }
            }
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, BidRequest bidRequest) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, bidRequest.request_id);
            Version.ADAPTER.encodeWithTag(protoWriter, 2, bidRequest.api_version);
            App.ADAPTER.encodeWithTag(protoWriter, 3, bidRequest.app);
            Device.ADAPTER.encodeWithTag(protoWriter, 4, bidRequest.device);
            Network.ADAPTER.encodeWithTag(protoWriter, 5, bidRequest.network);
            AdSlot.ADAPTER.asRepeated().encodeWithTag(protoWriter, 6, bidRequest.slots);
            ProtoAdapter.INT64.encodeWithTag(protoWriter, 7, bidRequest.req_timestamp);
            ProtoAdapter.UINT32.encodeWithTag(protoWriter, 8, bidRequest.request_scene_type);
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            protoAdapter.encodeWithTag(protoWriter, 9, bidRequest.ad_is_expired);
            Privacy.ADAPTER.encodeWithTag(protoWriter, 10, bidRequest.privacy);
            protoAdapter.encodeWithTag(protoWriter, 11, bidRequest.disable_mediation);
            this.a.encodeWithTag(protoWriter, 15, bidRequest.options);
            HeaderBidding.ADAPTER.encodeWithTag(protoWriter, 16, bidRequest.header_bidding);
            User.ADAPTER.encodeWithTag(protoWriter, 17, bidRequest.user);
            protoWriter.writeBytes(bidRequest.unknownFields());
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public int encodedSize(BidRequest bidRequest) {
            int iEncodedSizeWithTag = ProtoAdapter.STRING.encodedSizeWithTag(1, bidRequest.request_id) + Version.ADAPTER.encodedSizeWithTag(2, bidRequest.api_version) + App.ADAPTER.encodedSizeWithTag(3, bidRequest.app) + Device.ADAPTER.encodedSizeWithTag(4, bidRequest.device) + Network.ADAPTER.encodedSizeWithTag(5, bidRequest.network) + AdSlot.ADAPTER.asRepeated().encodedSizeWithTag(6, bidRequest.slots) + ProtoAdapter.INT64.encodedSizeWithTag(7, bidRequest.req_timestamp) + ProtoAdapter.UINT32.encodedSizeWithTag(8, bidRequest.request_scene_type);
            ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
            return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(9, bidRequest.ad_is_expired) + Privacy.ADAPTER.encodedSizeWithTag(10, bidRequest.privacy) + protoAdapter.encodedSizeWithTag(11, bidRequest.disable_mediation) + this.a.encodedSizeWithTag(15, bidRequest.options) + HeaderBidding.ADAPTER.encodedSizeWithTag(16, bidRequest.header_bidding) + User.ADAPTER.encodedSizeWithTag(17, bidRequest.user) + bidRequest.unknownFields().size();
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public BidRequest redact(BidRequest bidRequest) {
            Builder builderNewBuilder = bidRequest.newBuilder();
            Version version = builderNewBuilder.api_version;
            if (version != null) {
                builderNewBuilder.api_version = Version.ADAPTER.redact(version);
            }
            App app = builderNewBuilder.app;
            if (app != null) {
                builderNewBuilder.app = App.ADAPTER.redact(app);
            }
            Device device = builderNewBuilder.device;
            if (device != null) {
                builderNewBuilder.device = Device.ADAPTER.redact(device);
            }
            Network network = builderNewBuilder.network;
            if (network != null) {
                builderNewBuilder.network = Network.ADAPTER.redact(network);
            }
            Internal.redactElements(builderNewBuilder.slots, AdSlot.ADAPTER);
            Privacy privacy = builderNewBuilder.privacy;
            if (privacy != null) {
                builderNewBuilder.privacy = Privacy.ADAPTER.redact(privacy);
            }
            HeaderBidding headerBidding = builderNewBuilder.header_bidding;
            if (headerBidding != null) {
                builderNewBuilder.header_bidding = HeaderBidding.ADAPTER.redact(headerBidding);
            }
            User user = builderNewBuilder.user;
            if (user != null) {
                builderNewBuilder.user = User.ADAPTER.redact(user);
            }
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    static {
        ProtoAdapter_BidRequest protoAdapter_BidRequest = new ProtoAdapter_BidRequest();
        ADAPTER = protoAdapter_BidRequest;
        CREATOR = AndroidMessage.newCreator(protoAdapter_BidRequest);
        DEFAULT_REQ_TIMESTAMP = 0L;
        DEFAULT_REQUEST_SCENE_TYPE = 0;
        DEFAULT_AD_IS_EXPIRED = Boolean.FALSE;
        DEFAULT_DISABLE_MEDIATION = Boolean.TRUE;
    }

    public BidRequest(String str, Version version, App app, Device device, Network network, List<AdSlot> list, Long l, Integer num, Boolean bool, Privacy privacy, Boolean bool2, Map<String, String> map, HeaderBidding headerBidding, User user) {
        this(str, version, app, device, network, list, l, num, bool, privacy, bool2, map, headerBidding, user, ByteString.EMPTY);
    }

    public BidRequest(String str, Version version, App app, Device device, Network network, List<AdSlot> list, Long l, Integer num, Boolean bool, Privacy privacy, Boolean bool2, Map<String, String> map, HeaderBidding headerBidding, User user, ByteString byteString) {
        super(ADAPTER, byteString);
        this.request_id = str;
        this.api_version = version;
        this.app = app;
        this.device = device;
        this.network = network;
        this.slots = Internal.immutableCopyOf("slots", list);
        this.req_timestamp = l;
        this.request_scene_type = num;
        this.ad_is_expired = bool;
        this.privacy = privacy;
        this.disable_mediation = bool2;
        this.options = Internal.immutableCopyOf("options", map);
        this.header_bidding = headerBidding;
        this.user = user;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof BidRequest)) {
                return false;
            }
            BidRequest bidRequest = (BidRequest) obj;
            if (!unknownFields().equals(bidRequest.unknownFields()) || !Internal.equals(this.request_id, bidRequest.request_id) || !Internal.equals(this.api_version, bidRequest.api_version) || !Internal.equals(this.app, bidRequest.app) || !Internal.equals(this.device, bidRequest.device) || !Internal.equals(this.network, bidRequest.network) || !this.slots.equals(bidRequest.slots) || !Internal.equals(this.req_timestamp, bidRequest.req_timestamp) || !Internal.equals(this.request_scene_type, bidRequest.request_scene_type) || !Internal.equals(this.ad_is_expired, bidRequest.ad_is_expired) || !Internal.equals(this.privacy, bidRequest.privacy) || !Internal.equals(this.disable_mediation, bidRequest.disable_mediation) || !this.options.equals(bidRequest.options) || !Internal.equals(this.header_bidding, bidRequest.header_bidding) || !Internal.equals(this.user, bidRequest.user)) {
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
        String str = this.request_id;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        Version version = this.api_version;
        int iHashCode3 = version != null ? version.hashCode() : 0;
        App app = this.app;
        int iHashCode4 = app != null ? app.hashCode() : 0;
        Device device = this.device;
        int iHashCode5 = device != null ? device.hashCode() : 0;
        Network network = this.network;
        int iHashCode6 = network != null ? network.hashCode() : 0;
        int iHashCode7 = this.slots.hashCode();
        Long l = this.req_timestamp;
        int iHashCode8 = l != null ? l.hashCode() : 0;
        Integer num = this.request_scene_type;
        int iHashCode9 = num != null ? num.hashCode() : 0;
        Boolean bool = this.ad_is_expired;
        int iHashCode10 = bool != null ? bool.hashCode() : 0;
        Privacy privacy = this.privacy;
        int iHashCode11 = privacy != null ? privacy.hashCode() : 0;
        Boolean bool2 = this.disable_mediation;
        int iHashCode12 = bool2 != null ? bool2.hashCode() : 0;
        int iHashCode13 = this.options.hashCode();
        HeaderBidding headerBidding = this.header_bidding;
        int iHashCode14 = headerBidding != null ? headerBidding.hashCode() : 0;
        User user = this.user;
        int iHashCode15 = ((iHashCode14 + ((((iHashCode12 + ((iHashCode11 + ((iHashCode10 + ((iHashCode9 + ((iHashCode8 + ((((iHashCode6 + ((iHashCode5 + ((iHashCode4 + ((iHashCode3 + ((iHashCode2 + (iHashCode * 37)) * 37)) * 37)) * 37)) * 37)) * 37) + iHashCode7) * 37)) * 37)) * 37)) * 37)) * 37)) * 37) + iHashCode13) * 37)) * 37) + (user != null ? user.hashCode() : 0);
        this.hashCode = iHashCode15;
        return iHashCode15;
    }

    @Override // com.xmlywind.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.request_id = this.request_id;
        builder.api_version = this.api_version;
        builder.app = this.app;
        builder.device = this.device;
        builder.network = this.network;
        builder.slots = Internal.copyOf("slots", this.slots);
        builder.req_timestamp = this.req_timestamp;
        builder.request_scene_type = this.request_scene_type;
        builder.ad_is_expired = this.ad_is_expired;
        builder.privacy = this.privacy;
        builder.disable_mediation = this.disable_mediation;
        builder.options = Internal.copyOf("options", this.options);
        builder.header_bidding = this.header_bidding;
        builder.user = this.user;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.xmlywind.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.request_id != null) {
            sb.append(", request_id=");
            sb.append(this.request_id);
        }
        if (this.api_version != null) {
            sb.append(", api_version=");
            sb.append(this.api_version);
        }
        if (this.app != null) {
            sb.append(", app=");
            sb.append(this.app);
        }
        if (this.device != null) {
            sb.append(", device=");
            sb.append(this.device);
        }
        if (this.network != null) {
            sb.append(", network=");
            sb.append(this.network);
        }
        if (!this.slots.isEmpty()) {
            sb.append(", slots=");
            sb.append(this.slots);
        }
        if (this.req_timestamp != null) {
            sb.append(", req_timestamp=");
            sb.append(this.req_timestamp);
        }
        if (this.request_scene_type != null) {
            sb.append(", request_scene_type=");
            sb.append(this.request_scene_type);
        }
        if (this.ad_is_expired != null) {
            sb.append(", ad_is_expired=");
            sb.append(this.ad_is_expired);
        }
        if (this.privacy != null) {
            sb.append(", privacy=");
            sb.append(this.privacy);
        }
        if (this.disable_mediation != null) {
            sb.append(", disable_mediation=");
            sb.append(this.disable_mediation);
        }
        if (!this.options.isEmpty()) {
            sb.append(", options=");
            sb.append(this.options);
        }
        if (this.header_bidding != null) {
            sb.append(", header_bidding=");
            sb.append(this.header_bidding);
        }
        if (this.user != null) {
            sb.append(", user=");
            sb.append(this.user);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "BidRequest{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
