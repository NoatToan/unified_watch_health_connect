package com.xmlywind.sdk.common.models.ssp.pb;

import android.os.Parcelable;
import com.xmlywind.sdk.common.models.sigdsp.pb.AdSlot;
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
public final class StrategyResponse extends AndroidMessage<StrategyResponse, Builder> {
    public static final ProtoAdapter<StrategyResponse> ADAPTER;
    public static final Parcelable.Creator<StrategyResponse> CREATOR;
    public static final Integer DEFAULT_CODE;
    public static final String DEFAULT_ERROR_MESSAGE = "";
    public static final Integer DEFAULT_MAX_CONCURRENT_OPERATION_COUNT;
    public static final Integer DEFAULT_SINGLE_CHANNEL_TIMEOUT;
    public static final String DEFAULT_UID = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 1)
    public final Integer code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 2)
    public final String error_message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 6)
    public final Integer max_concurrent_operation_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 7)
    public final Integer single_channel_timeout;

    @WireField(adapter = "com.sigmob.sdk.common.models.sigdsp.pb.AdSlot#ADAPTER", label = WireField.Label.REPEATED, tag = 5)
    public final List<AdSlot> slots;

    @WireField(adapter = "com.sigmob.sdk.base.models.ssp.pb.Strategy#ADAPTER", label = WireField.Label.REPEATED, tag = 3)
    public final List<Strategy> strategy;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 4)
    public final String uid;

    public static final class Builder extends Message.Builder<StrategyResponse, Builder> {
        public Integer code = StrategyResponse.DEFAULT_CODE;
        public String error_message = "";
        public String uid = "";
        public Integer max_concurrent_operation_count = StrategyResponse.DEFAULT_MAX_CONCURRENT_OPERATION_COUNT;
        public Integer single_channel_timeout = StrategyResponse.DEFAULT_SINGLE_CHANNEL_TIMEOUT;
        public List<Strategy> strategy = Internal.newMutableList();
        public List<AdSlot> slots = Internal.newMutableList();

        @Override // com.xmlywind.wire.Message.Builder
        public StrategyResponse build() {
            return new StrategyResponse(this.code, this.error_message, this.strategy, this.uid, this.slots, this.max_concurrent_operation_count, this.single_channel_timeout, super.buildUnknownFields());
        }

        public Builder code(Integer num) {
            this.code = num;
            return this;
        }

        public Builder error_message(String str) {
            this.error_message = str;
            return this;
        }

        public Builder max_concurrent_operation_count(Integer num) {
            this.max_concurrent_operation_count = num;
            return this;
        }

        public Builder single_channel_timeout(Integer num) {
            this.single_channel_timeout = num;
            return this;
        }

        public Builder slots(List<AdSlot> list) {
            Internal.checkElementsNotNull(list);
            this.slots = list;
            return this;
        }

        public Builder strategy(List<Strategy> list) {
            Internal.checkElementsNotNull(list);
            this.strategy = list;
            return this;
        }

        public Builder uid(String str) {
            this.uid = str;
            return this;
        }
    }

    public static final class ProtoAdapter_StrategyResponse extends ProtoAdapter<StrategyResponse> {
        public ProtoAdapter_StrategyResponse() {
            super(FieldEncoding.LENGTH_DELIMITED, StrategyResponse.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.xmlywind.wire.ProtoAdapter
        public StrategyResponse decode(ProtoReader protoReader) {
            List list;
            ProtoAdapter protoAdapter;
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
                        builder.code(ProtoAdapter.UINT32.decode(protoReader));
                        continue;
                    case 2:
                        builder.error_message(ProtoAdapter.STRING.decode(protoReader));
                        continue;
                    case 3:
                        list = builder.strategy;
                        protoAdapter = Strategy.ADAPTER;
                        break;
                    case 4:
                        builder.uid(ProtoAdapter.STRING.decode(protoReader));
                        continue;
                    case 5:
                        list = builder.slots;
                        protoAdapter = AdSlot.ADAPTER;
                        break;
                    case 6:
                        builder.max_concurrent_operation_count(ProtoAdapter.UINT32.decode(protoReader));
                        continue;
                    case 7:
                        builder.single_channel_timeout(ProtoAdapter.UINT32.decode(protoReader));
                        continue;
                    default:
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                        continue;
                }
                list.add(protoAdapter.decode(protoReader));
            }
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, StrategyResponse strategyResponse) {
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.encodeWithTag(protoWriter, 1, strategyResponse.code);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            protoAdapter2.encodeWithTag(protoWriter, 2, strategyResponse.error_message);
            Strategy.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, strategyResponse.strategy);
            protoAdapter2.encodeWithTag(protoWriter, 4, strategyResponse.uid);
            AdSlot.ADAPTER.asRepeated().encodeWithTag(protoWriter, 5, strategyResponse.slots);
            protoAdapter.encodeWithTag(protoWriter, 6, strategyResponse.max_concurrent_operation_count);
            protoAdapter.encodeWithTag(protoWriter, 7, strategyResponse.single_channel_timeout);
            protoWriter.writeBytes(strategyResponse.unknownFields());
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public int encodedSize(StrategyResponse strategyResponse) {
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            int iEncodedSizeWithTag = protoAdapter.encodedSizeWithTag(1, strategyResponse.code);
            ProtoAdapter<String> protoAdapter2 = ProtoAdapter.STRING;
            return iEncodedSizeWithTag + protoAdapter2.encodedSizeWithTag(2, strategyResponse.error_message) + Strategy.ADAPTER.asRepeated().encodedSizeWithTag(3, strategyResponse.strategy) + protoAdapter2.encodedSizeWithTag(4, strategyResponse.uid) + AdSlot.ADAPTER.asRepeated().encodedSizeWithTag(5, strategyResponse.slots) + protoAdapter.encodedSizeWithTag(6, strategyResponse.max_concurrent_operation_count) + protoAdapter.encodedSizeWithTag(7, strategyResponse.single_channel_timeout) + strategyResponse.unknownFields().size();
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public StrategyResponse redact(StrategyResponse strategyResponse) {
            Builder builderNewBuilder = strategyResponse.newBuilder();
            Internal.redactElements(builderNewBuilder.strategy, Strategy.ADAPTER);
            Internal.redactElements(builderNewBuilder.slots, AdSlot.ADAPTER);
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    static {
        ProtoAdapter_StrategyResponse protoAdapter_StrategyResponse = new ProtoAdapter_StrategyResponse();
        ADAPTER = protoAdapter_StrategyResponse;
        CREATOR = AndroidMessage.newCreator(protoAdapter_StrategyResponse);
        DEFAULT_CODE = 0;
        DEFAULT_MAX_CONCURRENT_OPERATION_COUNT = 0;
        DEFAULT_SINGLE_CHANNEL_TIMEOUT = 0;
    }

    public StrategyResponse(Integer num, String str, List<Strategy> list, String str2, List<AdSlot> list2, Integer num2, Integer num3) {
        this(num, str, list, str2, list2, num2, num3, ByteString.EMPTY);
    }

    public StrategyResponse(Integer num, String str, List<Strategy> list, String str2, List<AdSlot> list2, Integer num2, Integer num3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.code = num;
        this.error_message = str;
        this.strategy = Internal.immutableCopyOf("strategy", list);
        this.uid = str2;
        this.slots = Internal.immutableCopyOf("slots", list2);
        this.max_concurrent_operation_count = num2;
        this.single_channel_timeout = num3;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof StrategyResponse)) {
                return false;
            }
            StrategyResponse strategyResponse = (StrategyResponse) obj;
            if (!unknownFields().equals(strategyResponse.unknownFields()) || !Internal.equals(this.code, strategyResponse.code) || !Internal.equals(this.error_message, strategyResponse.error_message) || !this.strategy.equals(strategyResponse.strategy) || !Internal.equals(this.uid, strategyResponse.uid) || !this.slots.equals(strategyResponse.slots) || !Internal.equals(this.max_concurrent_operation_count, strategyResponse.max_concurrent_operation_count) || !Internal.equals(this.single_channel_timeout, strategyResponse.single_channel_timeout)) {
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
        Integer num = this.code;
        int iHashCode2 = num != null ? num.hashCode() : 0;
        String str = this.error_message;
        int iHashCode3 = str != null ? str.hashCode() : 0;
        int iHashCode4 = this.strategy.hashCode();
        String str2 = this.uid;
        int iHashCode5 = str2 != null ? str2.hashCode() : 0;
        int iHashCode6 = this.slots.hashCode();
        Integer num2 = this.max_concurrent_operation_count;
        int iHashCode7 = num2 != null ? num2.hashCode() : 0;
        Integer num3 = this.single_channel_timeout;
        int iHashCode8 = ((iHashCode7 + ((((iHashCode5 + ((((iHashCode3 + ((iHashCode2 + (iHashCode * 37)) * 37)) * 37) + iHashCode4) * 37)) * 37) + iHashCode6) * 37)) * 37) + (num3 != null ? num3.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.xmlywind.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.code = this.code;
        builder.error_message = this.error_message;
        builder.strategy = Internal.copyOf("strategy", this.strategy);
        builder.uid = this.uid;
        builder.slots = Internal.copyOf("slots", this.slots);
        builder.max_concurrent_operation_count = this.max_concurrent_operation_count;
        builder.single_channel_timeout = this.single_channel_timeout;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.xmlywind.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.code != null) {
            sb.append(", code=");
            sb.append(this.code);
        }
        if (this.error_message != null) {
            sb.append(", error_message=");
            sb.append(this.error_message);
        }
        if (!this.strategy.isEmpty()) {
            sb.append(", strategy=");
            sb.append(this.strategy);
        }
        if (this.uid != null) {
            sb.append(", uid=");
            sb.append(this.uid);
        }
        if (!this.slots.isEmpty()) {
            sb.append(", slots=");
            sb.append(this.slots);
        }
        if (this.max_concurrent_operation_count != null) {
            sb.append(", max_concurrent_operation_count=");
            sb.append(this.max_concurrent_operation_count);
        }
        if (this.single_channel_timeout != null) {
            sb.append(", single_channel_timeout=");
            sb.append(this.single_channel_timeout);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "StrategyResponse{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
