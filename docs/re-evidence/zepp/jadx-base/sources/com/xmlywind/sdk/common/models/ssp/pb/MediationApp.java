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
public final class MediationApp extends AndroidMessage<MediationApp, Builder> {
    public static final ProtoAdapter<MediationApp> ADAPTER;
    public static final Parcelable.Creator<MediationApp> CREATOR;
    public static final Integer DEFAULT_APP_ID;
    public static final Integer DEFAULT_MEDIATION_CHANNEL_ID;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 1)
    public final Integer app_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 2)
    public final Integer mediation_channel_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 3)
    public final Map<String, String> options;

    public static final class Builder extends Message.Builder<MediationApp, Builder> {
        public Integer app_id = MediationApp.DEFAULT_APP_ID;
        public Integer mediation_channel_id = MediationApp.DEFAULT_MEDIATION_CHANNEL_ID;
        public Map<String, String> options = Internal.newMutableMap();

        public Builder app_id(Integer num) {
            this.app_id = num;
            return this;
        }

        @Override // com.xmlywind.wire.Message.Builder
        public MediationApp build() {
            return new MediationApp(this.app_id, this.mediation_channel_id, this.options, super.buildUnknownFields());
        }

        public Builder mediation_channel_id(Integer num) {
            this.mediation_channel_id = num;
            return this;
        }

        public Builder options(Map<String, String> map) {
            Internal.checkElementsNotNull(map);
            this.options = map;
            return this;
        }
    }

    public static final class ProtoAdapter_MediationApp extends ProtoAdapter<MediationApp> {
        private final ProtoAdapter<Map<String, String>> a;

        public ProtoAdapter_MediationApp() {
            super(FieldEncoding.LENGTH_DELIMITED, MediationApp.class);
            ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
            this.a = ProtoAdapter.newMapAdapter(protoAdapter, protoAdapter);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.xmlywind.wire.ProtoAdapter
        public MediationApp decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    protoReader.endMessage(jBeginMessage);
                    return builder.build();
                }
                if (iNextTag == 1) {
                    builder.app_id(ProtoAdapter.UINT32.decode(protoReader));
                } else if (iNextTag == 2) {
                    builder.mediation_channel_id(ProtoAdapter.UINT32.decode(protoReader));
                } else if (iNextTag != 3) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.options.putAll(this.a.decode(protoReader));
                }
            }
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, MediationApp mediationApp) {
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            protoAdapter.encodeWithTag(protoWriter, 1, mediationApp.app_id);
            protoAdapter.encodeWithTag(protoWriter, 2, mediationApp.mediation_channel_id);
            this.a.encodeWithTag(protoWriter, 3, mediationApp.options);
            protoWriter.writeBytes(mediationApp.unknownFields());
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public int encodedSize(MediationApp mediationApp) {
            ProtoAdapter<Integer> protoAdapter = ProtoAdapter.UINT32;
            return protoAdapter.encodedSizeWithTag(1, mediationApp.app_id) + protoAdapter.encodedSizeWithTag(2, mediationApp.mediation_channel_id) + this.a.encodedSizeWithTag(3, mediationApp.options) + mediationApp.unknownFields().size();
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public MediationApp redact(MediationApp mediationApp) {
            Builder builderNewBuilder = mediationApp.newBuilder();
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    static {
        ProtoAdapter_MediationApp protoAdapter_MediationApp = new ProtoAdapter_MediationApp();
        ADAPTER = protoAdapter_MediationApp;
        CREATOR = AndroidMessage.newCreator(protoAdapter_MediationApp);
        DEFAULT_APP_ID = 0;
        DEFAULT_MEDIATION_CHANNEL_ID = 0;
    }

    public MediationApp(Integer num, Integer num2, Map<String, String> map) {
        this(num, num2, map, ByteString.EMPTY);
    }

    public MediationApp(Integer num, Integer num2, Map<String, String> map, ByteString byteString) {
        super(ADAPTER, byteString);
        this.app_id = num;
        this.mediation_channel_id = num2;
        this.options = Internal.immutableCopyOf("options", map);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof MediationApp)) {
                return false;
            }
            MediationApp mediationApp = (MediationApp) obj;
            if (!unknownFields().equals(mediationApp.unknownFields()) || !Internal.equals(this.app_id, mediationApp.app_id) || !Internal.equals(this.mediation_channel_id, mediationApp.mediation_channel_id) || !this.options.equals(mediationApp.options)) {
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
        Integer num = this.app_id;
        int iHashCode2 = num != null ? num.hashCode() : 0;
        Integer num2 = this.mediation_channel_id;
        int iHashCode3 = this.options.hashCode() + ((((iHashCode2 + (iHashCode * 37)) * 37) + (num2 != null ? num2.hashCode() : 0)) * 37);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.xmlywind.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.app_id = this.app_id;
        builder.mediation_channel_id = this.mediation_channel_id;
        builder.options = Internal.copyOf("options", this.options);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.xmlywind.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.app_id != null) {
            sb.append(", app_id=");
            sb.append(this.app_id);
        }
        if (this.mediation_channel_id != null) {
            sb.append(", mediation_channel_id=");
            sb.append(this.mediation_channel_id);
        }
        if (!this.options.isEmpty()) {
            sb.append(", options=");
            sb.append(this.options);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "MediationApp{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
