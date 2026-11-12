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
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public final class StrategyWaterFall extends AndroidMessage<StrategyWaterFall, Builder> {
    public static final ProtoAdapter<StrategyWaterFall> ADAPTER;
    public static final Parcelable.Creator<StrategyWaterFall> CREATOR;
    public static final Integer DEFAULT_AB_FLAG;
    public static final Integer DEFAULT_CONCURRENT_COUNT;
    public static final Integer DEFAULT_TRAFFIC_WEIGHT;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 1)
    public final Integer ab_flag;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 3)
    public final Integer concurrent_count;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", label = WireField.Label.REPEATED, tag = 4)
    public final List<Integer> element_ids;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 2)
    public final Integer traffic_weight;

    public static final class Builder extends Message.Builder<StrategyWaterFall, Builder> {
        public Integer ab_flag = StrategyWaterFall.DEFAULT_AB_FLAG;
        public Integer traffic_weight = StrategyWaterFall.DEFAULT_TRAFFIC_WEIGHT;
        public Integer concurrent_count = StrategyWaterFall.DEFAULT_CONCURRENT_COUNT;
        public List<Integer> element_ids = Internal.newMutableList();

        public Builder ab_flag(Integer num) {
            this.ab_flag = num;
            return this;
        }

        @Override // com.xmlywind.wire.Message.Builder
        public StrategyWaterFall build() {
            return new StrategyWaterFall(this.ab_flag, this.traffic_weight, this.concurrent_count, this.element_ids, super.buildUnknownFields());
        }

        public Builder concurrent_count(Integer num) {
            this.concurrent_count = num;
            return this;
        }

        public Builder element_ids(List<Integer> list) {
            Internal.checkElementsNotNull(list);
            this.element_ids = list;
            return this;
        }

        public Builder traffic_weight(Integer num) {
            this.traffic_weight = num;
            return this;
        }
    }

    public static final class ProtoAdapter_StrategyWaterFall extends ProtoAdapter<StrategyWaterFall> {
        public ProtoAdapter_StrategyWaterFall() {
            super(FieldEncoding.LENGTH_DELIMITED, StrategyWaterFall.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.xmlywind.wire.ProtoAdapter
        public StrategyWaterFall decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    protoReader.endMessage(jBeginMessage);
                    return builder.build();
                }
                if (iNextTag == 1) {
                    builder.ab_flag(ProtoAdapter.UINT32.decode(protoReader));
                } else if (iNextTag == 2) {
                    builder.traffic_weight(ProtoAdapter.UINT32.decode(protoReader));
                } else if (iNextTag == 3) {
                    builder.concurrent_count(ProtoAdapter.UINT32.decode(protoReader));
                } else if (iNextTag != 4) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.element_ids.add(ProtoAdapter.UINT32.decode(protoReader));
                }
            }
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, StrategyWaterFall strategyWaterFall) {
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.encodeWithTag(protoWriter, 1, strategyWaterFall.ab_flag);
            protoAdapter.encodeWithTag(protoWriter, 2, strategyWaterFall.traffic_weight);
            protoAdapter.encodeWithTag(protoWriter, 3, strategyWaterFall.concurrent_count);
            protoAdapter.asRepeated().encodeWithTag(protoWriter, 4, strategyWaterFall.element_ids);
            protoWriter.writeBytes(strategyWaterFall.unknownFields());
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public int encodedSize(StrategyWaterFall strategyWaterFall) {
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            return protoAdapter.encodedSizeWithTag(1, strategyWaterFall.ab_flag) + protoAdapter.encodedSizeWithTag(2, strategyWaterFall.traffic_weight) + protoAdapter.encodedSizeWithTag(3, strategyWaterFall.concurrent_count) + protoAdapter.asRepeated().encodedSizeWithTag(4, strategyWaterFall.element_ids) + strategyWaterFall.unknownFields().size();
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public StrategyWaterFall redact(StrategyWaterFall strategyWaterFall) {
            Builder builderNewBuilder = strategyWaterFall.newBuilder();
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    static {
        ProtoAdapter_StrategyWaterFall protoAdapter_StrategyWaterFall = new ProtoAdapter_StrategyWaterFall();
        ADAPTER = protoAdapter_StrategyWaterFall;
        CREATOR = AndroidMessage.newCreator(protoAdapter_StrategyWaterFall);
        DEFAULT_AB_FLAG = 0;
        DEFAULT_TRAFFIC_WEIGHT = 0;
        DEFAULT_CONCURRENT_COUNT = 0;
    }

    public StrategyWaterFall(Integer num, Integer num2, Integer num3, List<Integer> list) {
        this(num, num2, num3, list, ByteString.EMPTY);
    }

    public StrategyWaterFall(Integer num, Integer num2, Integer num3, List<Integer> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ab_flag = num;
        this.traffic_weight = num2;
        this.concurrent_count = num3;
        this.element_ids = Internal.immutableCopyOf("element_ids", list);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof StrategyWaterFall)) {
                return false;
            }
            StrategyWaterFall strategyWaterFall = (StrategyWaterFall) obj;
            if (!unknownFields().equals(strategyWaterFall.unknownFields()) || !Internal.equals(this.ab_flag, strategyWaterFall.ab_flag) || !Internal.equals(this.traffic_weight, strategyWaterFall.traffic_weight) || !Internal.equals(this.concurrent_count, strategyWaterFall.concurrent_count) || !this.element_ids.equals(strategyWaterFall.element_ids)) {
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
        Integer num = this.ab_flag;
        int iHashCode2 = num != null ? num.hashCode() : 0;
        Integer num2 = this.traffic_weight;
        int iHashCode3 = num2 != null ? num2.hashCode() : 0;
        Integer num3 = this.concurrent_count;
        int iHashCode4 = this.element_ids.hashCode() + ((((iHashCode3 + ((iHashCode2 + (iHashCode * 37)) * 37)) * 37) + (num3 != null ? num3.hashCode() : 0)) * 37);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.xmlywind.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.ab_flag = this.ab_flag;
        builder.traffic_weight = this.traffic_weight;
        builder.concurrent_count = this.concurrent_count;
        builder.element_ids = Internal.copyOf("element_ids", this.element_ids);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.xmlywind.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.ab_flag != null) {
            sb.append(", ab_flag=");
            sb.append(this.ab_flag);
        }
        if (this.traffic_weight != null) {
            sb.append(", traffic_weight=");
            sb.append(this.traffic_weight);
        }
        if (this.concurrent_count != null) {
            sb.append(", concurrent_count=");
            sb.append(this.concurrent_count);
        }
        if (!this.element_ids.isEmpty()) {
            sb.append(", element_ids=");
            sb.append(this.element_ids);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "StrategyWaterFall{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
