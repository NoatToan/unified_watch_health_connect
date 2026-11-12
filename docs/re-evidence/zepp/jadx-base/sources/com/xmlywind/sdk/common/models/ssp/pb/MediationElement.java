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
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public final class MediationElement extends AndroidMessage<MediationElement, Builder> {
    public static final ProtoAdapter<MediationElement> ADAPTER;
    public static final Parcelable.Creator<MediationElement> CREATOR;
    public static final Integer DEFAULT_ELEMENT_ID;
    public static final Integer DEFAULT_MEDIATION_APP_ID;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 1)
    public final Integer element_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 2)
    public final Integer mediation_app_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final Map<String, String> options;

    public static final class Builder extends Message.Builder<MediationElement, Builder> {
        public Integer element_id = MediationElement.DEFAULT_ELEMENT_ID;
        public Integer mediation_app_id = MediationElement.DEFAULT_MEDIATION_APP_ID;
        public Map<String, String> options = Internal.newMutableMap();

        @Override // com.xmlywind.wire.Message.Builder
        public MediationElement build() {
            return new MediationElement(this.element_id, this.mediation_app_id, this.options, super.buildUnknownFields());
        }

        public Builder element_id(Integer num) {
            this.element_id = num;
            return this;
        }

        public Builder mediation_app_id(Integer num) {
            this.mediation_app_id = num;
            return this;
        }

        public Builder options(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.options = map;
            return this;
        }
    }

    public static final class ProtoAdapter_MediationElement extends ProtoAdapter<MediationElement> {
        private final ProtoAdapter<Map<String, String>> a;

        public ProtoAdapter_MediationElement() {
            super(FieldEncoding.LENGTH_DELIMITED, MediationElement.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.a = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.xmlywind.wire.ProtoAdapter
        public MediationElement decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    protoReader.endMessage(jBeginMessage);
                    return builder.build();
                }
                if (iNextTag == 1) {
                    builder.element_id(ProtoAdapter.UINT32.decode(protoReader));
                } else if (iNextTag == 2) {
                    builder.mediation_app_id(ProtoAdapter.UINT32.decode(protoReader));
                } else if (iNextTag != 3) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.options.putAll(this.a.decode(protoReader));
                }
            }
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, MediationElement mediationElement) {
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.encodeWithTag(protoWriter, 1, mediationElement.element_id);
            protoAdapter.encodeWithTag(protoWriter, 2, mediationElement.mediation_app_id);
            this.a.encodeWithTag(protoWriter, 3, mediationElement.options);
            protoWriter.writeBytes(mediationElement.unknownFields());
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public int encodedSize(MediationElement mediationElement) {
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            return protoAdapter.encodedSizeWithTag(1, mediationElement.element_id) + protoAdapter.encodedSizeWithTag(2, mediationElement.mediation_app_id) + this.a.encodedSizeWithTag(3, mediationElement.options) + mediationElement.unknownFields().size();
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public MediationElement redact(MediationElement mediationElement) {
            Builder builderNewBuilder = mediationElement.newBuilder();
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    static {
        ProtoAdapter_MediationElement protoAdapter_MediationElement = new ProtoAdapter_MediationElement();
        ADAPTER = protoAdapter_MediationElement;
        CREATOR = AndroidMessage.newCreator(protoAdapter_MediationElement);
        DEFAULT_ELEMENT_ID = 0;
        DEFAULT_MEDIATION_APP_ID = 0;
    }

    public MediationElement(Integer num, Integer num2, Map<String, String> map) {
        this(num, num2, map, ByteString.EMPTY);
    }

    public MediationElement(Integer num, Integer num2, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.element_id = num;
        this.mediation_app_id = num2;
        this.options = Internal.immutableCopyOf("options", map);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof MediationElement)) {
                return false;
            }
            MediationElement mediationElement = (MediationElement) obj;
            if (!unknownFields().equals(mediationElement.unknownFields()) || !Internal.equals(this.element_id, mediationElement.element_id) || !Internal.equals(this.mediation_app_id, mediationElement.mediation_app_id) || !this.options.equals(mediationElement.options)) {
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
        Integer num = this.element_id;
        int iHashCode2 = num != null ? num.hashCode() : 0;
        Integer num2 = this.mediation_app_id;
        int iHashCode3 = this.options.hashCode() + ((((iHashCode2 + (iHashCode * 37)) * 37) + (num2 != null ? num2.hashCode() : 0)) * 37);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.xmlywind.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.element_id = this.element_id;
        builder.mediation_app_id = this.mediation_app_id;
        builder.options = Internal.copyOf("options", this.options);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.xmlywind.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.element_id != null) {
            sb.append(", element_id=");
            sb.append(this.element_id);
        }
        if (this.mediation_app_id != null) {
            sb.append(", mediation_app_id=");
            sb.append(this.mediation_app_id);
        }
        if (!this.options.isEmpty()) {
            sb.append(", options=");
            sb.append(this.options);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "MediationElement{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
