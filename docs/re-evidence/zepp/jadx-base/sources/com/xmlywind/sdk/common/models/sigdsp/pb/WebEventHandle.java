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

/* JADX INFO: loaded from: classes22.dex */
public final class WebEventHandle extends AndroidMessage<WebEventHandle, Builder> {
    public static final ProtoAdapter<WebEventHandle> ADAPTER;
    public static final Parcelable.Creator<WebEventHandle> CREATOR;
    public static final Integer DEFAULT_HANDLE_TYPE;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.sigmob.sdk.common.models.sigdsp.pb.WebEvent#ADAPTER", label = WireField.Label.REPEATED, tag = 3)
    public final List<WebEvent> events;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, tag = 2)
    public final List<String> handle_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT32", tag = 1)
    public final Integer handle_type;

    public static final class Builder extends Message.Builder<WebEventHandle, Builder> {
        public Integer handle_type;
        public List<String> handle_name = Internal.newMutableList();
        public List<WebEvent> events = Internal.newMutableList();

        @Override // com.xmlywind.wire.Message.Builder
        public WebEventHandle build() {
            return new WebEventHandle(this.handle_type, this.handle_name, this.events, super.buildUnknownFields());
        }

        public Builder events(List<WebEvent> list) {
            Internal.checkElementsNotNull(list);
            this.events = list;
            return this;
        }

        public Builder handle_name(List<String> list) {
            Internal.checkElementsNotNull(list);
            this.handle_name = list;
            return this;
        }

        public Builder handle_type(Integer num) {
            this.handle_type = num;
            return this;
        }
    }

    public static final class ProtoAdapter_WebEventHandle extends ProtoAdapter<WebEventHandle> {
        public ProtoAdapter_WebEventHandle() {
            super(FieldEncoding.LENGTH_DELIMITED, WebEventHandle.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.xmlywind.wire.ProtoAdapter
        public WebEventHandle decode(ProtoReader protoReader) {
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
                if (iNextTag != 1) {
                    if (iNextTag == 2) {
                        list = builder.handle_name;
                        protoAdapter = ProtoAdapter.STRING;
                    } else if (iNextTag != 3) {
                        FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                        builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                    } else {
                        list = builder.events;
                        protoAdapter = WebEvent.ADAPTER;
                    }
                    list.add(protoAdapter.decode(protoReader));
                } else {
                    builder.handle_type(ProtoAdapter.UINT32.decode(protoReader));
                }
            }
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, WebEventHandle webEventHandle) {
            ProtoAdapter.UINT32.encodeWithTag(protoWriter, 1, webEventHandle.handle_type);
            ProtoAdapter.STRING.asRepeated().encodeWithTag(protoWriter, 2, webEventHandle.handle_name);
            WebEvent.ADAPTER.asRepeated().encodeWithTag(protoWriter, 3, webEventHandle.events);
            protoWriter.writeBytes(webEventHandle.unknownFields());
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public int encodedSize(WebEventHandle webEventHandle) {
            return ProtoAdapter.UINT32.encodedSizeWithTag(1, webEventHandle.handle_type) + ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, webEventHandle.handle_name) + WebEvent.ADAPTER.asRepeated().encodedSizeWithTag(3, webEventHandle.events) + webEventHandle.unknownFields().size();
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public WebEventHandle redact(WebEventHandle webEventHandle) {
            Builder builderNewBuilder = webEventHandle.newBuilder();
            Internal.redactElements(builderNewBuilder.events, WebEvent.ADAPTER);
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    static {
        ProtoAdapter_WebEventHandle protoAdapter_WebEventHandle = new ProtoAdapter_WebEventHandle();
        ADAPTER = protoAdapter_WebEventHandle;
        CREATOR = AndroidMessage.newCreator(protoAdapter_WebEventHandle);
        DEFAULT_HANDLE_TYPE = 0;
    }

    public WebEventHandle(Integer num, List<String> list, List<WebEvent> list2) {
        this(num, list, list2, ByteString.EMPTY);
    }

    public WebEventHandle(Integer num, List<String> list, List<WebEvent> list2, ByteString byteString) {
        super(ADAPTER, byteString);
        this.handle_type = num;
        this.handle_name = Internal.immutableCopyOf("handle_name", list);
        this.events = Internal.immutableCopyOf("events", list2);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof WebEventHandle)) {
                return false;
            }
            WebEventHandle webEventHandle = (WebEventHandle) obj;
            if (!unknownFields().equals(webEventHandle.unknownFields()) || !Internal.equals(this.handle_type, webEventHandle.handle_type) || !this.handle_name.equals(webEventHandle.handle_name) || !this.events.equals(webEventHandle.events)) {
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
        Integer num = this.handle_type;
        int iHashCode2 = this.events.hashCode() + (((((num != null ? num.hashCode() : 0) + (iHashCode * 37)) * 37) + this.handle_name.hashCode()) * 37);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.xmlywind.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.handle_type = this.handle_type;
        builder.handle_name = Internal.copyOf("handle_name", this.handle_name);
        builder.events = Internal.copyOf("events", this.events);
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    @Override // com.xmlywind.wire.Message
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.handle_type != null) {
            sb.append(", handle_type=");
            sb.append(this.handle_type);
        }
        if (!this.handle_name.isEmpty()) {
            sb.append(", handle_name=");
            sb.append(this.handle_name);
        }
        if (!this.events.isEmpty()) {
            sb.append(", events=");
            sb.append(this.events);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "WebEventHandle{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
