package com.xmlywind.wire.protobuf;

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
public final class ServiceDescriptorProto extends Message<ServiceDescriptorProto, Builder> {
    public static final ProtoAdapter<ServiceDescriptorProto> ADAPTER = new ProtoAdapter_ServiceDescriptorProto();
    public static final String DEFAULT_NAME = "";
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.google.protobuf.MethodDescriptorProto#ADAPTER", label = WireField.Label.REPEATED, tag = 2)
    public final List<MethodDescriptorProto> method;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", tag = 1)
    public final String name;

    @WireField(adapter = "com.google.protobuf.ServiceOptions#ADAPTER", tag = 3)
    public final ServiceOptions options;

    public static final class Builder extends Message.Builder<ServiceDescriptorProto, Builder> {
        public List<MethodDescriptorProto> method = Internal.newMutableList();
        public String name;
        public ServiceOptions options;

        @Override // com.xmlywind.wire.Message.Builder
        public ServiceDescriptorProto build() {
            return new ServiceDescriptorProto(this.name, this.method, this.options, super.buildUnknownFields());
        }

        public Builder method(List<MethodDescriptorProto> list) {
            Internal.checkElementsNotNull(list);
            this.method = list;
            return this;
        }

        public Builder name(String str) {
            this.name = str;
            return this;
        }

        public Builder options(ServiceOptions serviceOptions) {
            this.options = serviceOptions;
            return this;
        }
    }

    public static final class ProtoAdapter_ServiceDescriptorProto extends ProtoAdapter<ServiceDescriptorProto> {
        public ProtoAdapter_ServiceDescriptorProto() {
            super(FieldEncoding.LENGTH_DELIMITED, ServiceDescriptorProto.class);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.xmlywind.wire.ProtoAdapter
        public ServiceDescriptorProto decode(ProtoReader protoReader) {
            Builder builder = new Builder();
            long jBeginMessage = protoReader.beginMessage();
            while (true) {
                int iNextTag = protoReader.nextTag();
                if (iNextTag == -1) {
                    protoReader.endMessage(jBeginMessage);
                    return builder.build();
                }
                if (iNextTag == 1) {
                    builder.name(ProtoAdapter.STRING.decode(protoReader));
                } else if (iNextTag == 2) {
                    builder.method.add(MethodDescriptorProto.ADAPTER.decode(protoReader));
                } else if (iNextTag != 3) {
                    FieldEncoding fieldEncodingPeekFieldEncoding = protoReader.peekFieldEncoding();
                    builder.addUnknownField(iNextTag, fieldEncodingPeekFieldEncoding, fieldEncodingPeekFieldEncoding.rawProtoAdapter().decode(protoReader));
                } else {
                    builder.options(ServiceOptions.ADAPTER.decode(protoReader));
                }
            }
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public void encode(ProtoWriter protoWriter, ServiceDescriptorProto serviceDescriptorProto) {
            ProtoAdapter.STRING.encodeWithTag(protoWriter, 1, serviceDescriptorProto.name);
            MethodDescriptorProto.ADAPTER.asRepeated().encodeWithTag(protoWriter, 2, serviceDescriptorProto.method);
            ServiceOptions.ADAPTER.encodeWithTag(protoWriter, 3, serviceDescriptorProto.options);
            protoWriter.writeBytes(serviceDescriptorProto.unknownFields());
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public int encodedSize(ServiceDescriptorProto serviceDescriptorProto) {
            return ProtoAdapter.STRING.encodedSizeWithTag(1, serviceDescriptorProto.name) + MethodDescriptorProto.ADAPTER.asRepeated().encodedSizeWithTag(2, serviceDescriptorProto.method) + ServiceOptions.ADAPTER.encodedSizeWithTag(3, serviceDescriptorProto.options) + serviceDescriptorProto.unknownFields().size();
        }

        @Override // com.xmlywind.wire.ProtoAdapter
        public ServiceDescriptorProto redact(ServiceDescriptorProto serviceDescriptorProto) {
            Builder builderNewBuilder = serviceDescriptorProto.newBuilder();
            Internal.redactElements(builderNewBuilder.method, MethodDescriptorProto.ADAPTER);
            ServiceOptions serviceOptions = builderNewBuilder.options;
            if (serviceOptions != null) {
                builderNewBuilder.options = ServiceOptions.ADAPTER.redact(serviceOptions);
            }
            builderNewBuilder.clearUnknownFields();
            return builderNewBuilder.build();
        }
    }

    public ServiceDescriptorProto(String str, List<MethodDescriptorProto> list, ServiceOptions serviceOptions) {
        this(str, list, serviceOptions, ByteString.EMPTY);
    }

    public ServiceDescriptorProto(String str, List<MethodDescriptorProto> list, ServiceOptions serviceOptions, ByteString byteString) {
        super(ADAPTER, byteString);
        this.name = str;
        this.method = Internal.immutableCopyOf("method", list);
        this.options = serviceOptions;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof ServiceDescriptorProto)) {
                return false;
            }
            ServiceDescriptorProto serviceDescriptorProto = (ServiceDescriptorProto) obj;
            if (!unknownFields().equals(serviceDescriptorProto.unknownFields()) || !Internal.equals(this.name, serviceDescriptorProto.name) || !this.method.equals(serviceDescriptorProto.method) || !Internal.equals(this.options, serviceDescriptorProto.options)) {
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
        int iHashCode3 = this.method.hashCode();
        ServiceOptions serviceOptions = this.options;
        int iHashCode4 = ((((iHashCode2 + (iHashCode * 37)) * 37) + iHashCode3) * 37) + (serviceOptions != null ? serviceOptions.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.xmlywind.wire.Message
    public Builder newBuilder() {
        Builder builder = new Builder();
        builder.name = this.name;
        builder.method = Internal.copyOf("method", this.method);
        builder.options = this.options;
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
        if (!this.method.isEmpty()) {
            sb.append(", method=");
            sb.append(this.method);
        }
        if (this.options != null) {
            sb.append(", options=");
            sb.append(this.options);
        }
        StringBuilder sbReplace = sb.replace(0, 2, "ServiceDescriptorProto{");
        sbReplace.append('}');
        return sbReplace.toString();
    }
}
