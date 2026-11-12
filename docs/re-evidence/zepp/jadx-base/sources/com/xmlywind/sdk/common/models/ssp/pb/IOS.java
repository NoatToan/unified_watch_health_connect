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
public final class IOS extends AndroidMessage<IOS, Builder> {
    public static final ProtoAdapter<IOS> ADAPTER;
    public static final Parcelable.Creator<IOS> CREATOR;
    public static final Boolean DEFAULT_DISABLE_UP_IP;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", tag = 1)
    public final Boolean disable_up_ip;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 2)
    public final List<String> ip_names;

    public static final class Builder extends Message.Builder<IOS, Builder> {
        public Boolean disable_up_ip = IOS.DEFAULT_DISABLE_UP_IP;
        public List<String> ip_names = Internal.newMutableList();

        @Override // com.xmlywind.wire.Message.Builder
        public IOS build() {
            return new IOS(this.disable_up_ip, this.ip_names, super.buildUnknownFields());
        }

        public Builder disable_up_ip(Boolean bool) {
            this.disable_up_ip = bool;
            return this;
        }

        public Builder ip_names(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.ip_names = list;
            return this;
        }
    }

    public static final class ProtoAdapter_IOS extends ProtoAdapter<IOS> {
        public ProtoAdapter_IOS() {
            super(FieldEncoding.LENGTH_DELIMITED, IOS.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.xmlywind.wire.ProtoAdapter
        public IOS decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    protoReader.endMessage(jBeginMessage);
                    return builder.build();
                }
                if (iNextTag == 1) {
                    builder.disable_up_ip(ProtoAdapter.BOOL.decode(protoReader));
                } else if (iNextTag != 2) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.ip_names.add(ProtoAdapter.STRING.decode(protoReader));
                }
            }
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, IOS ios) {
            ProtoAdapter.BOOL.encodeWithTag(protoWriter, 1, ios.disable_up_ip);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, ios.ip_names);
            protoWriter.writeBytes(ios.unknownFields());
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public int encodedSize(IOS ios) {
            return ProtoAdapter.BOOL.encodedSizeWithTag(1, ios.disable_up_ip) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, ios.ip_names) + ios.unknownFields().size();
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public IOS redact(IOS ios) {
            Builder builderNewBuilder = ios.newBuilder();
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    static {
        ProtoAdapter_IOS protoAdapter_IOS = new ProtoAdapter_IOS();
        ADAPTER = protoAdapter_IOS;
        CREATOR = AndroidMessage.newCreator(protoAdapter_IOS);
        DEFAULT_DISABLE_UP_IP = Boolean.FALSE;
    }

    public IOS(Boolean bool, List<String> list) {
        this(bool, list, ByteString.EMPTY);
    }

    public IOS(Boolean bool, List<String> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.disable_up_ip = bool;
        this.ip_names = Internal.immutableCopyOf("ip_names", list);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof IOS)) {
                return false;
            }
            IOS ios = (IOS) obj;
            if (!unknownFields().equals(ios.unknownFields()) || !Internal.equals(this.disable_up_ip, ios.disable_up_ip) || !this.ip_names.equals(ios.ip_names)) {
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
        Boolean bool = this.disable_up_ip;
        int iHashCode2 = this.ip_names.hashCode() + (((bool != null ? bool.hashCode() : 0) + (iHashCode * 37)) * 37);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.xmlywind.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.disable_up_ip = this.disable_up_ip;
        builder.ip_names = Internal.copyOf("ip_names", this.ip_names);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.xmlywind.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.disable_up_ip != null) {
            sb.append(", disable_up_ip=");
            sb.append(this.disable_up_ip);
        }
        if (!this.ip_names.isEmpty()) {
            sb.append(", ip_names=");
            sb.append(this.ip_names);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "IOS{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
