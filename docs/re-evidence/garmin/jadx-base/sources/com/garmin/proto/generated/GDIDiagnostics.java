package com.garmin.proto.generated;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import i3.e5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import vb.h;

/* JADX INFO: loaded from: classes4.dex */
public final class GDIDiagnostics {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0014GDIDiagnostics.proto\u0012\u0015GDI.Proto.Diagnostics\u001a\rGDICore.proto\"\u007f\n\u0007Service\u00128\n\fecho_request\u0018\u0001 \u0001(\u000b2\".GDI.Proto.Diagnostics.EchoRequest\u0012:\n\recho_response\u0018\u0002 \u0001(\u000b2#.GDI.Proto.Diagnostics.EchoResponse\"\u0017\n\u0007Payload\u0012\f\n\u0004data\u0018\u0001 \u0001(\f\">\n\u000bEchoRequest\u0012/\n\u0007payload\u0018\u0001 \u0001(\u000b2\u001e.GDI.Proto.Diagnostics.Payload\"´\u0001\n\fEchoResponse\u0012/\n\u0007payload\u0018\u0001 \u0001(\u000b2\u001e.GDI.Proto.Diagnostics.Payload\u00128\n\u0005error\u0018\u0002 \u0001(\u000e2).GDI.Proto.Diagnostics.EchoResponse.Error\"9\n\u0005Error\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u0010\n\fNO_RESOURCES\u0010\u0001\u0012\u0011\n\rBUFFER_IN_USE\u0010\u0002\"\u0087\u0001\n\u0013CapabilitiesRequest2p\n\u0010features_request\u0012*.GDI.Proto.Core.FeatureCapabilitiesRequest\u0018, \u0001(\u000b2*.GDI.Proto.Diagnostics.CapabilitiesRequest\"'\n\u0017DiagnosticsCapabilities\u0012\f\n\u0004echo\u0018\u0001 \u0001(\b\"Ý\u0001\n\u0014CapabilitiesResponse\u0012P\n\u0018diagnostics_capabilities\u0018\u0001 \u0001(\u000b2..GDI.Proto.Diagnostics.DiagnosticsCapabilities2s\n\u0011features_response\u0012+.GDI.Proto.Core.FeatureCapabilitiesResponse\u0018, \u0001(\u000b2+.GDI.Proto.Diagnostics.CapabilitiesResponseB.\n\u001acom.garmin.proto.generatedB\u000eGDIDiagnosticsH\u0003"}, new Descriptors.FileDescriptor[]{GDICore.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Diagnostics_CapabilitiesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Diagnostics_CapabilitiesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Diagnostics_CapabilitiesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Diagnostics_CapabilitiesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Diagnostics_DiagnosticsCapabilities_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Diagnostics_DiagnosticsCapabilities_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Diagnostics_EchoRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Diagnostics_EchoRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Diagnostics_EchoResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Diagnostics_EchoResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Diagnostics_Payload_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Diagnostics_Payload_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Diagnostics_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Diagnostics_Service_fieldAccessorTable;

    public interface CapabilitiesRequestOrBuilder extends MessageOrBuilder {
    }

    public interface CapabilitiesResponseOrBuilder extends MessageOrBuilder {
        DiagnosticsCapabilities getDiagnosticsCapabilities();

        DiagnosticsCapabilitiesOrBuilder getDiagnosticsCapabilitiesOrBuilder();

        boolean hasDiagnosticsCapabilities();
    }

    public interface DiagnosticsCapabilitiesOrBuilder extends MessageOrBuilder {
        boolean getEcho();

        boolean hasEcho();
    }

    public interface EchoRequestOrBuilder extends MessageOrBuilder {
        Payload getPayload();

        PayloadOrBuilder getPayloadOrBuilder();

        boolean hasPayload();
    }

    public interface EchoResponseOrBuilder extends MessageOrBuilder {
        EchoResponse.Error getError();

        Payload getPayload();

        PayloadOrBuilder getPayloadOrBuilder();

        boolean hasError();

        boolean hasPayload();
    }

    public interface PayloadOrBuilder extends MessageOrBuilder {
        ByteString getData();

        boolean hasData();
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
        EchoRequest getEchoRequest();

        EchoRequestOrBuilder getEchoRequestOrBuilder();

        EchoResponse getEchoResponse();

        EchoResponseOrBuilder getEchoResponseOrBuilder();

        boolean hasEchoRequest();

        boolean hasEchoResponse();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_Diagnostics_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_Diagnostics_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"EchoRequest", "EchoResponse"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_Diagnostics_Payload_descriptor = descriptor3;
        internal_static_GDI_Proto_Diagnostics_Payload_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Data"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_Diagnostics_EchoRequest_descriptor = descriptor4;
        internal_static_GDI_Proto_Diagnostics_EchoRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Payload"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_Diagnostics_EchoResponse_descriptor = descriptor5;
        internal_static_GDI_Proto_Diagnostics_EchoResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Payload", "Error"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_Diagnostics_CapabilitiesRequest_descriptor = descriptor6;
        internal_static_GDI_Proto_Diagnostics_CapabilitiesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[0]);
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_Diagnostics_DiagnosticsCapabilities_descriptor = descriptor7;
        internal_static_GDI_Proto_Diagnostics_DiagnosticsCapabilities_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Echo"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_Diagnostics_CapabilitiesResponse_descriptor = descriptor8;
        internal_static_GDI_Proto_Diagnostics_CapabilitiesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"DiagnosticsCapabilities"});
        GDICore.getDescriptor();
    }

    private GDIDiagnostics() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(CapabilitiesRequest.featuresRequest);
        extensionRegistryLite.add(CapabilitiesResponse.featuresResponse);
    }

    public static final class CapabilitiesRequest extends GeneratedMessageV3 implements CapabilitiesRequestOrBuilder {
        public static final int FEATURES_REQUEST_FIELD_NUMBER = 44;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private static final CapabilitiesRequest DEFAULT_INSTANCE = new CapabilitiesRequest();

        @Deprecated
        public static final Parser<CapabilitiesRequest> PARSER = new AbstractParser<CapabilitiesRequest>() { // from class: com.garmin.proto.generated.GDIDiagnostics.CapabilitiesRequest.1
            @Override // com.google.protobuf.Parser
            public CapabilitiesRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CapabilitiesRequest.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };
        public static final GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesRequest, CapabilitiesRequest> featuresRequest = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, CapabilitiesRequest.class, getDefaultInstance());

        private CapabilitiesRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDiagnostics.internal_static_GDI_Proto_Diagnostics_CapabilitiesRequest_descriptor;
        }

        public static Builder newBuilder(CapabilitiesRequest capabilitiesRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(capabilitiesRequest);
        }

        public static CapabilitiesRequest parseDelimitedFrom(InputStream inputStream) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CapabilitiesRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CapabilitiesRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof CapabilitiesRequest) {
                return getUnknownFields().equals(((CapabilitiesRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CapabilitiesRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getUnknownFields().hashCode() + ((getDescriptor().hashCode() + 779) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDiagnostics.internal_static_GDI_Proto_Diagnostics_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new CapabilitiesRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDiagnostics.internal_static_GDI_Proto_Diagnostics_CapabilitiesRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CapabilitiesRequest build() {
                CapabilitiesRequest capabilitiesRequestBuildPartial = buildPartial();
                if (capabilitiesRequestBuildPartial.isInitialized()) {
                    return capabilitiesRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) capabilitiesRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CapabilitiesRequest buildPartial() {
                CapabilitiesRequest capabilitiesRequest = new CapabilitiesRequest(this);
                onBuilt();
                return capabilitiesRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDiagnostics.internal_static_GDI_Proto_Diagnostics_CapabilitiesRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDiagnostics.internal_static_GDI_Proto_Diagnostics_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag == 0 || !super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                z14 = true;
                            }
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            private Builder() {
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CapabilitiesRequest getDefaultInstanceForType() {
                return CapabilitiesRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CapabilitiesRequest) {
                    return mergeFrom((CapabilitiesRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CapabilitiesRequest capabilitiesRequest) {
                if (capabilitiesRequest == CapabilitiesRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(capabilitiesRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CapabilitiesRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ CapabilitiesRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private CapabilitiesRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CapabilitiesRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CapabilitiesRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CapabilitiesRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CapabilitiesRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CapabilitiesRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CapabilitiesRequest parseFrom(InputStream inputStream) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CapabilitiesRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CapabilitiesRequest parseFrom(CodedInputStream codedInputStream) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CapabilitiesRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DiagnosticsCapabilities extends GeneratedMessageV3 implements DiagnosticsCapabilitiesOrBuilder {
        public static final int ECHO_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean echo_;
        private byte memoizedIsInitialized;
        private static final DiagnosticsCapabilities DEFAULT_INSTANCE = new DiagnosticsCapabilities();

        @Deprecated
        public static final Parser<DiagnosticsCapabilities> PARSER = new AbstractParser<DiagnosticsCapabilities>() { // from class: com.garmin.proto.generated.GDIDiagnostics.DiagnosticsCapabilities.1
            @Override // com.google.protobuf.Parser
            public DiagnosticsCapabilities parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DiagnosticsCapabilities.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        private DiagnosticsCapabilities(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.echo_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DiagnosticsCapabilities getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDiagnostics.internal_static_GDI_Proto_Diagnostics_DiagnosticsCapabilities_descriptor;
        }

        public static Builder newBuilder(DiagnosticsCapabilities diagnosticsCapabilities) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(diagnosticsCapabilities);
        }

        public static DiagnosticsCapabilities parseDelimitedFrom(InputStream inputStream) {
            return (DiagnosticsCapabilities) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DiagnosticsCapabilities parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DiagnosticsCapabilities> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DiagnosticsCapabilities)) {
                return super.equals(obj);
            }
            DiagnosticsCapabilities diagnosticsCapabilities = (DiagnosticsCapabilities) obj;
            if (hasEcho() != diagnosticsCapabilities.hasEcho()) {
                return false;
            }
            return (!hasEcho() || getEcho() == diagnosticsCapabilities.getEcho()) && getUnknownFields().equals(diagnosticsCapabilities.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIDiagnostics.DiagnosticsCapabilitiesOrBuilder
        public boolean getEcho() {
            return this.echo_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DiagnosticsCapabilities> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.echo_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDiagnostics.DiagnosticsCapabilitiesOrBuilder
        public boolean hasEcho() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasEcho()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getEcho());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDiagnostics.internal_static_GDI_Proto_Diagnostics_DiagnosticsCapabilities_fieldAccessorTable.ensureFieldAccessorsInitialized(DiagnosticsCapabilities.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new DiagnosticsCapabilities();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.echo_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DiagnosticsCapabilitiesOrBuilder {
            private int bitField0_;
            private boolean echo_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(DiagnosticsCapabilities diagnosticsCapabilities) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    diagnosticsCapabilities.echo_ = this.echo_;
                } else {
                    i14 = 0;
                }
                diagnosticsCapabilities.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDiagnostics.internal_static_GDI_Proto_Diagnostics_DiagnosticsCapabilities_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DiagnosticsCapabilities build() {
                DiagnosticsCapabilities diagnosticsCapabilitiesBuildPartial = buildPartial();
                if (diagnosticsCapabilitiesBuildPartial.isInitialized()) {
                    return diagnosticsCapabilitiesBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) diagnosticsCapabilitiesBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DiagnosticsCapabilities buildPartial() {
                DiagnosticsCapabilities diagnosticsCapabilities = new DiagnosticsCapabilities(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(diagnosticsCapabilities);
                }
                onBuilt();
                return diagnosticsCapabilities;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.echo_ = false;
                return this;
            }

            public Builder clearEcho() {
                this.bitField0_ &= -2;
                this.echo_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDiagnostics.internal_static_GDI_Proto_Diagnostics_DiagnosticsCapabilities_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDiagnostics.DiagnosticsCapabilitiesOrBuilder
            public boolean getEcho() {
                return this.echo_;
            }

            @Override // com.garmin.proto.generated.GDIDiagnostics.DiagnosticsCapabilitiesOrBuilder
            public boolean hasEcho() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDiagnostics.internal_static_GDI_Proto_Diagnostics_DiagnosticsCapabilities_fieldAccessorTable.ensureFieldAccessorsInitialized(DiagnosticsCapabilities.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    this.echo_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z14 = true;
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setEcho(boolean z14) {
                this.echo_ = z14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            private Builder() {
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public DiagnosticsCapabilities getDefaultInstanceForType() {
                return DiagnosticsCapabilities.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DiagnosticsCapabilities) {
                    return mergeFrom((DiagnosticsCapabilities) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DiagnosticsCapabilities diagnosticsCapabilities) {
                if (diagnosticsCapabilities == DiagnosticsCapabilities.getDefaultInstance()) {
                    return this;
                }
                if (diagnosticsCapabilities.hasEcho()) {
                    setEcho(diagnosticsCapabilities.getEcho());
                }
                mergeUnknownFields(diagnosticsCapabilities.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DiagnosticsCapabilities getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DiagnosticsCapabilities parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DiagnosticsCapabilities) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DiagnosticsCapabilities parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ DiagnosticsCapabilities(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DiagnosticsCapabilities parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private DiagnosticsCapabilities() {
            this.echo_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DiagnosticsCapabilities parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DiagnosticsCapabilities parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DiagnosticsCapabilities parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DiagnosticsCapabilities parseFrom(InputStream inputStream) {
            return (DiagnosticsCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DiagnosticsCapabilities parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DiagnosticsCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DiagnosticsCapabilities parseFrom(CodedInputStream codedInputStream) {
            return (DiagnosticsCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DiagnosticsCapabilities parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DiagnosticsCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CapabilitiesResponse extends GeneratedMessageV3 implements CapabilitiesResponseOrBuilder {
        public static final int DIAGNOSTICS_CAPABILITIES_FIELD_NUMBER = 1;
        public static final int FEATURES_RESPONSE_FIELD_NUMBER = 44;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private DiagnosticsCapabilities diagnosticsCapabilities_;
        private byte memoizedIsInitialized;
        private static final CapabilitiesResponse DEFAULT_INSTANCE = new CapabilitiesResponse();

        @Deprecated
        public static final Parser<CapabilitiesResponse> PARSER = new AbstractParser<CapabilitiesResponse>() { // from class: com.garmin.proto.generated.GDIDiagnostics.CapabilitiesResponse.1
            @Override // com.google.protobuf.Parser
            public CapabilitiesResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CapabilitiesResponse.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };
        public static final GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesResponse, CapabilitiesResponse> featuresResponse = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, CapabilitiesResponse.class, getDefaultInstance());

        private CapabilitiesResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDiagnostics.internal_static_GDI_Proto_Diagnostics_CapabilitiesResponse_descriptor;
        }

        public static Builder newBuilder(CapabilitiesResponse capabilitiesResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(capabilitiesResponse);
        }

        public static CapabilitiesResponse parseDelimitedFrom(InputStream inputStream) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CapabilitiesResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CapabilitiesResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CapabilitiesResponse)) {
                return super.equals(obj);
            }
            CapabilitiesResponse capabilitiesResponse = (CapabilitiesResponse) obj;
            if (hasDiagnosticsCapabilities() != capabilitiesResponse.hasDiagnosticsCapabilities()) {
                return false;
            }
            return (!hasDiagnosticsCapabilities() || getDiagnosticsCapabilities().equals(capabilitiesResponse.getDiagnosticsCapabilities())) && getUnknownFields().equals(capabilitiesResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIDiagnostics.CapabilitiesResponseOrBuilder
        public DiagnosticsCapabilities getDiagnosticsCapabilities() {
            DiagnosticsCapabilities diagnosticsCapabilities = this.diagnosticsCapabilities_;
            return diagnosticsCapabilities == null ? DiagnosticsCapabilities.getDefaultInstance() : diagnosticsCapabilities;
        }

        @Override // com.garmin.proto.generated.GDIDiagnostics.CapabilitiesResponseOrBuilder
        public DiagnosticsCapabilitiesOrBuilder getDiagnosticsCapabilitiesOrBuilder() {
            DiagnosticsCapabilities diagnosticsCapabilities = this.diagnosticsCapabilities_;
            return diagnosticsCapabilities == null ? DiagnosticsCapabilities.getDefaultInstance() : diagnosticsCapabilities;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CapabilitiesResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getDiagnosticsCapabilities()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDiagnostics.CapabilitiesResponseOrBuilder
        public boolean hasDiagnosticsCapabilities() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasDiagnosticsCapabilities()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getDiagnosticsCapabilities().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDiagnostics.internal_static_GDI_Proto_Diagnostics_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new CapabilitiesResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getDiagnosticsCapabilities());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<DiagnosticsCapabilities, DiagnosticsCapabilities.Builder, DiagnosticsCapabilitiesOrBuilder> diagnosticsCapabilitiesBuilder_;
            private DiagnosticsCapabilities diagnosticsCapabilities_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(CapabilitiesResponse capabilitiesResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<DiagnosticsCapabilities, DiagnosticsCapabilities.Builder, DiagnosticsCapabilitiesOrBuilder> singleFieldBuilderV3 = this.diagnosticsCapabilitiesBuilder_;
                    capabilitiesResponse.diagnosticsCapabilities_ = singleFieldBuilderV3 == null ? this.diagnosticsCapabilities_ : (DiagnosticsCapabilities) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                capabilitiesResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDiagnostics.internal_static_GDI_Proto_Diagnostics_CapabilitiesResponse_descriptor;
            }

            private SingleFieldBuilderV3<DiagnosticsCapabilities, DiagnosticsCapabilities.Builder, DiagnosticsCapabilitiesOrBuilder> getDiagnosticsCapabilitiesFieldBuilder() {
                if (this.diagnosticsCapabilitiesBuilder_ == null) {
                    this.diagnosticsCapabilitiesBuilder_ = new SingleFieldBuilderV3<>(getDiagnosticsCapabilities(), getParentForChildren(), isClean());
                    this.diagnosticsCapabilities_ = null;
                }
                return this.diagnosticsCapabilitiesBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getDiagnosticsCapabilitiesFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CapabilitiesResponse build() {
                CapabilitiesResponse capabilitiesResponseBuildPartial = buildPartial();
                if (capabilitiesResponseBuildPartial.isInitialized()) {
                    return capabilitiesResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) capabilitiesResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CapabilitiesResponse buildPartial() {
                CapabilitiesResponse capabilitiesResponse = new CapabilitiesResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(capabilitiesResponse);
                }
                onBuilt();
                return capabilitiesResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.diagnosticsCapabilities_ = null;
                SingleFieldBuilderV3<DiagnosticsCapabilities, DiagnosticsCapabilities.Builder, DiagnosticsCapabilitiesOrBuilder> singleFieldBuilderV3 = this.diagnosticsCapabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.diagnosticsCapabilitiesBuilder_ = null;
                }
                return this;
            }

            public Builder clearDiagnosticsCapabilities() {
                this.bitField0_ &= -2;
                this.diagnosticsCapabilities_ = null;
                SingleFieldBuilderV3<DiagnosticsCapabilities, DiagnosticsCapabilities.Builder, DiagnosticsCapabilitiesOrBuilder> singleFieldBuilderV3 = this.diagnosticsCapabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.diagnosticsCapabilitiesBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDiagnostics.internal_static_GDI_Proto_Diagnostics_CapabilitiesResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDiagnostics.CapabilitiesResponseOrBuilder
            public DiagnosticsCapabilities getDiagnosticsCapabilities() {
                SingleFieldBuilderV3<DiagnosticsCapabilities, DiagnosticsCapabilities.Builder, DiagnosticsCapabilitiesOrBuilder> singleFieldBuilderV3 = this.diagnosticsCapabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DiagnosticsCapabilities) singleFieldBuilderV3.getMessage();
                }
                DiagnosticsCapabilities diagnosticsCapabilities = this.diagnosticsCapabilities_;
                return diagnosticsCapabilities == null ? DiagnosticsCapabilities.getDefaultInstance() : diagnosticsCapabilities;
            }

            public DiagnosticsCapabilities.Builder getDiagnosticsCapabilitiesBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (DiagnosticsCapabilities.Builder) getDiagnosticsCapabilitiesFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDiagnostics.CapabilitiesResponseOrBuilder
            public DiagnosticsCapabilitiesOrBuilder getDiagnosticsCapabilitiesOrBuilder() {
                SingleFieldBuilderV3<DiagnosticsCapabilities, DiagnosticsCapabilities.Builder, DiagnosticsCapabilitiesOrBuilder> singleFieldBuilderV3 = this.diagnosticsCapabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DiagnosticsCapabilitiesOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DiagnosticsCapabilities diagnosticsCapabilities = this.diagnosticsCapabilities_;
                return diagnosticsCapabilities == null ? DiagnosticsCapabilities.getDefaultInstance() : diagnosticsCapabilities;
            }

            @Override // com.garmin.proto.generated.GDIDiagnostics.CapabilitiesResponseOrBuilder
            public boolean hasDiagnosticsCapabilities() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDiagnostics.internal_static_GDI_Proto_Diagnostics_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeDiagnosticsCapabilities(DiagnosticsCapabilities diagnosticsCapabilities) {
                DiagnosticsCapabilities diagnosticsCapabilities2;
                SingleFieldBuilderV3<DiagnosticsCapabilities, DiagnosticsCapabilities.Builder, DiagnosticsCapabilitiesOrBuilder> singleFieldBuilderV3 = this.diagnosticsCapabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(diagnosticsCapabilities);
                } else if ((this.bitField0_ & 1) == 0 || (diagnosticsCapabilities2 = this.diagnosticsCapabilities_) == null || diagnosticsCapabilities2 == DiagnosticsCapabilities.getDefaultInstance()) {
                    this.diagnosticsCapabilities_ = diagnosticsCapabilities;
                } else {
                    getDiagnosticsCapabilitiesBuilder().mergeFrom(diagnosticsCapabilities);
                }
                if (this.diagnosticsCapabilities_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    codedInputStream.readMessage(getDiagnosticsCapabilitiesFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z14 = true;
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setDiagnosticsCapabilities(DiagnosticsCapabilities.Builder builder) {
                SingleFieldBuilderV3<DiagnosticsCapabilities, DiagnosticsCapabilities.Builder, DiagnosticsCapabilitiesOrBuilder> singleFieldBuilderV3 = this.diagnosticsCapabilitiesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.diagnosticsCapabilities_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CapabilitiesResponse getDefaultInstanceForType() {
                return CapabilitiesResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            public Builder setDiagnosticsCapabilities(DiagnosticsCapabilities diagnosticsCapabilities) {
                SingleFieldBuilderV3<DiagnosticsCapabilities, DiagnosticsCapabilities.Builder, DiagnosticsCapabilitiesOrBuilder> singleFieldBuilderV3 = this.diagnosticsCapabilitiesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    diagnosticsCapabilities.getClass();
                    this.diagnosticsCapabilities_ = diagnosticsCapabilities;
                } else {
                    singleFieldBuilderV3.setMessage(diagnosticsCapabilities);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CapabilitiesResponse) {
                    return mergeFrom((CapabilitiesResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CapabilitiesResponse capabilitiesResponse) {
                if (capabilitiesResponse == CapabilitiesResponse.getDefaultInstance()) {
                    return this;
                }
                if (capabilitiesResponse.hasDiagnosticsCapabilities()) {
                    mergeDiagnosticsCapabilities(capabilitiesResponse.getDiagnosticsCapabilities());
                }
                mergeUnknownFields(capabilitiesResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CapabilitiesResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ CapabilitiesResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private CapabilitiesResponse() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CapabilitiesResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CapabilitiesResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CapabilitiesResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CapabilitiesResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CapabilitiesResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CapabilitiesResponse parseFrom(InputStream inputStream) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CapabilitiesResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CapabilitiesResponse parseFrom(CodedInputStream codedInputStream) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CapabilitiesResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class EchoRequest extends GeneratedMessageV3 implements EchoRequestOrBuilder {
        private static final EchoRequest DEFAULT_INSTANCE = new EchoRequest();

        @Deprecated
        public static final Parser<EchoRequest> PARSER = new AbstractParser<EchoRequest>() { // from class: com.garmin.proto.generated.GDIDiagnostics.EchoRequest.1
            @Override // com.google.protobuf.Parser
            public EchoRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = EchoRequest.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };
        public static final int PAYLOAD_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private Payload payload_;

        private EchoRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EchoRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDiagnostics.internal_static_GDI_Proto_Diagnostics_EchoRequest_descriptor;
        }

        public static Builder newBuilder(EchoRequest echoRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(echoRequest);
        }

        public static EchoRequest parseDelimitedFrom(InputStream inputStream) {
            return (EchoRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EchoRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<EchoRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EchoRequest)) {
                return super.equals(obj);
            }
            EchoRequest echoRequest = (EchoRequest) obj;
            if (hasPayload() != echoRequest.hasPayload()) {
                return false;
            }
            return (!hasPayload() || getPayload().equals(echoRequest.getPayload())) && getUnknownFields().equals(echoRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EchoRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIDiagnostics.EchoRequestOrBuilder
        public Payload getPayload() {
            Payload payload = this.payload_;
            return payload == null ? Payload.getDefaultInstance() : payload;
        }

        @Override // com.garmin.proto.generated.GDIDiagnostics.EchoRequestOrBuilder
        public PayloadOrBuilder getPayloadOrBuilder() {
            Payload payload = this.payload_;
            return payload == null ? Payload.getDefaultInstance() : payload;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getPayload()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDiagnostics.EchoRequestOrBuilder
        public boolean hasPayload() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasPayload()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getPayload().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDiagnostics.internal_static_GDI_Proto_Diagnostics_EchoRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(EchoRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new EchoRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getPayload());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EchoRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<Payload, Payload.Builder, PayloadOrBuilder> payloadBuilder_;
            private Payload payload_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(EchoRequest echoRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<Payload, Payload.Builder, PayloadOrBuilder> singleFieldBuilderV3 = this.payloadBuilder_;
                    echoRequest.payload_ = singleFieldBuilderV3 == null ? this.payload_ : (Payload) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                echoRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDiagnostics.internal_static_GDI_Proto_Diagnostics_EchoRequest_descriptor;
            }

            private SingleFieldBuilderV3<Payload, Payload.Builder, PayloadOrBuilder> getPayloadFieldBuilder() {
                if (this.payloadBuilder_ == null) {
                    this.payloadBuilder_ = new SingleFieldBuilderV3<>(getPayload(), getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                return this.payloadBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getPayloadFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EchoRequest build() {
                EchoRequest echoRequestBuildPartial = buildPartial();
                if (echoRequestBuildPartial.isInitialized()) {
                    return echoRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) echoRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EchoRequest buildPartial() {
                EchoRequest echoRequest = new EchoRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(echoRequest);
                }
                onBuilt();
                return echoRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.payload_ = null;
                SingleFieldBuilderV3<Payload, Payload.Builder, PayloadOrBuilder> singleFieldBuilderV3 = this.payloadBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.payloadBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPayload() {
                this.bitField0_ &= -2;
                this.payload_ = null;
                SingleFieldBuilderV3<Payload, Payload.Builder, PayloadOrBuilder> singleFieldBuilderV3 = this.payloadBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.payloadBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDiagnostics.internal_static_GDI_Proto_Diagnostics_EchoRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDiagnostics.EchoRequestOrBuilder
            public Payload getPayload() {
                SingleFieldBuilderV3<Payload, Payload.Builder, PayloadOrBuilder> singleFieldBuilderV3 = this.payloadBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Payload) singleFieldBuilderV3.getMessage();
                }
                Payload payload = this.payload_;
                return payload == null ? Payload.getDefaultInstance() : payload;
            }

            public Payload.Builder getPayloadBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (Payload.Builder) getPayloadFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDiagnostics.EchoRequestOrBuilder
            public PayloadOrBuilder getPayloadOrBuilder() {
                SingleFieldBuilderV3<Payload, Payload.Builder, PayloadOrBuilder> singleFieldBuilderV3 = this.payloadBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PayloadOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Payload payload = this.payload_;
                return payload == null ? Payload.getDefaultInstance() : payload;
            }

            @Override // com.garmin.proto.generated.GDIDiagnostics.EchoRequestOrBuilder
            public boolean hasPayload() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDiagnostics.internal_static_GDI_Proto_Diagnostics_EchoRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(EchoRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    codedInputStream.readMessage(getPayloadFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z14 = true;
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            public Builder mergePayload(Payload payload) {
                Payload payload2;
                SingleFieldBuilderV3<Payload, Payload.Builder, PayloadOrBuilder> singleFieldBuilderV3 = this.payloadBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(payload);
                } else if ((this.bitField0_ & 1) == 0 || (payload2 = this.payload_) == null || payload2 == Payload.getDefaultInstance()) {
                    this.payload_ = payload;
                } else {
                    getPayloadBuilder().mergeFrom(payload);
                }
                if (this.payload_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setPayload(Payload.Builder builder) {
                SingleFieldBuilderV3<Payload, Payload.Builder, PayloadOrBuilder> singleFieldBuilderV3 = this.payloadBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public EchoRequest getDefaultInstanceForType() {
                return EchoRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            public Builder setPayload(Payload payload) {
                SingleFieldBuilderV3<Payload, Payload.Builder, PayloadOrBuilder> singleFieldBuilderV3 = this.payloadBuilder_;
                if (singleFieldBuilderV3 == null) {
                    payload.getClass();
                    this.payload_ = payload;
                } else {
                    singleFieldBuilderV3.setMessage(payload);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EchoRequest) {
                    return mergeFrom((EchoRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EchoRequest echoRequest) {
                if (echoRequest == EchoRequest.getDefaultInstance()) {
                    return this;
                }
                if (echoRequest.hasPayload()) {
                    mergePayload(echoRequest.getPayload());
                }
                mergeUnknownFields(echoRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EchoRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ EchoRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private EchoRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EchoRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EchoRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EchoRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static EchoRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EchoRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static EchoRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static EchoRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static EchoRequest parseFrom(InputStream inputStream) {
            return (EchoRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static EchoRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EchoRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EchoRequest parseFrom(CodedInputStream codedInputStream) {
            return (EchoRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static EchoRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EchoRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class EchoResponse extends GeneratedMessageV3 implements EchoResponseOrBuilder {
        public static final int ERROR_FIELD_NUMBER = 2;
        public static final int PAYLOAD_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int error_;
        private byte memoizedIsInitialized;
        private Payload payload_;
        private static final EchoResponse DEFAULT_INSTANCE = new EchoResponse();

        @Deprecated
        public static final Parser<EchoResponse> PARSER = new AbstractParser<EchoResponse>() { // from class: com.garmin.proto.generated.GDIDiagnostics.EchoResponse.1
            @Override // com.google.protobuf.Parser
            public EchoResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = EchoResponse.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        private EchoResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.error_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EchoResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDiagnostics.internal_static_GDI_Proto_Diagnostics_EchoResponse_descriptor;
        }

        public static Builder newBuilder(EchoResponse echoResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(echoResponse);
        }

        public static EchoResponse parseDelimitedFrom(InputStream inputStream) {
            return (EchoResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EchoResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<EchoResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EchoResponse)) {
                return super.equals(obj);
            }
            EchoResponse echoResponse = (EchoResponse) obj;
            if (hasPayload() != echoResponse.hasPayload()) {
                return false;
            }
            if ((!hasPayload() || getPayload().equals(echoResponse.getPayload())) && hasError() == echoResponse.hasError()) {
                return (!hasError() || this.error_ == echoResponse.error_) && getUnknownFields().equals(echoResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDiagnostics.EchoResponseOrBuilder
        public Error getError() {
            Error errorForNumber = Error.forNumber(this.error_);
            return errorForNumber == null ? Error.UNKNOWN : errorForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EchoResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIDiagnostics.EchoResponseOrBuilder
        public Payload getPayload() {
            Payload payload = this.payload_;
            return payload == null ? Payload.getDefaultInstance() : payload;
        }

        @Override // com.garmin.proto.generated.GDIDiagnostics.EchoResponseOrBuilder
        public PayloadOrBuilder getPayloadOrBuilder() {
            Payload payload = this.payload_;
            return payload == null ? Payload.getDefaultInstance() : payload;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getPayload()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(2, this.error_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDiagnostics.EchoResponseOrBuilder
        public boolean hasError() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDiagnostics.EchoResponseOrBuilder
        public boolean hasPayload() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasPayload()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getPayload().hashCode();
            }
            if (hasError()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.error_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDiagnostics.internal_static_GDI_Proto_Diagnostics_EchoResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(EchoResponse.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new EchoResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getPayload());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.error_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EchoResponseOrBuilder {
            private int bitField0_;
            private int error_;
            private SingleFieldBuilderV3<Payload, Payload.Builder, PayloadOrBuilder> payloadBuilder_;
            private Payload payload_;

            private Builder() {
                this.error_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(EchoResponse echoResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<Payload, Payload.Builder, PayloadOrBuilder> singleFieldBuilderV3 = this.payloadBuilder_;
                    echoResponse.payload_ = singleFieldBuilderV3 == null ? this.payload_ : (Payload) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    echoResponse.error_ = this.error_;
                    i14 |= 2;
                }
                echoResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDiagnostics.internal_static_GDI_Proto_Diagnostics_EchoResponse_descriptor;
            }

            private SingleFieldBuilderV3<Payload, Payload.Builder, PayloadOrBuilder> getPayloadFieldBuilder() {
                if (this.payloadBuilder_ == null) {
                    this.payloadBuilder_ = new SingleFieldBuilderV3<>(getPayload(), getParentForChildren(), isClean());
                    this.payload_ = null;
                }
                return this.payloadBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getPayloadFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EchoResponse build() {
                EchoResponse echoResponseBuildPartial = buildPartial();
                if (echoResponseBuildPartial.isInitialized()) {
                    return echoResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) echoResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EchoResponse buildPartial() {
                EchoResponse echoResponse = new EchoResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(echoResponse);
                }
                onBuilt();
                return echoResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.payload_ = null;
                SingleFieldBuilderV3<Payload, Payload.Builder, PayloadOrBuilder> singleFieldBuilderV3 = this.payloadBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.payloadBuilder_ = null;
                }
                this.error_ = 0;
                return this;
            }

            public Builder clearError() {
                this.bitField0_ &= -3;
                this.error_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPayload() {
                this.bitField0_ &= -2;
                this.payload_ = null;
                SingleFieldBuilderV3<Payload, Payload.Builder, PayloadOrBuilder> singleFieldBuilderV3 = this.payloadBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.payloadBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDiagnostics.internal_static_GDI_Proto_Diagnostics_EchoResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDiagnostics.EchoResponseOrBuilder
            public Error getError() {
                Error errorForNumber = Error.forNumber(this.error_);
                return errorForNumber == null ? Error.UNKNOWN : errorForNumber;
            }

            @Override // com.garmin.proto.generated.GDIDiagnostics.EchoResponseOrBuilder
            public Payload getPayload() {
                SingleFieldBuilderV3<Payload, Payload.Builder, PayloadOrBuilder> singleFieldBuilderV3 = this.payloadBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Payload) singleFieldBuilderV3.getMessage();
                }
                Payload payload = this.payload_;
                return payload == null ? Payload.getDefaultInstance() : payload;
            }

            public Payload.Builder getPayloadBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (Payload.Builder) getPayloadFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDiagnostics.EchoResponseOrBuilder
            public PayloadOrBuilder getPayloadOrBuilder() {
                SingleFieldBuilderV3<Payload, Payload.Builder, PayloadOrBuilder> singleFieldBuilderV3 = this.payloadBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (PayloadOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Payload payload = this.payload_;
                return payload == null ? Payload.getDefaultInstance() : payload;
            }

            @Override // com.garmin.proto.generated.GDIDiagnostics.EchoResponseOrBuilder
            public boolean hasError() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDiagnostics.EchoResponseOrBuilder
            public boolean hasPayload() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDiagnostics.internal_static_GDI_Proto_Diagnostics_EchoResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(EchoResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    codedInputStream.readMessage(getPayloadFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (Error.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.error_ = i14;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z14 = true;
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            public Builder mergePayload(Payload payload) {
                Payload payload2;
                SingleFieldBuilderV3<Payload, Payload.Builder, PayloadOrBuilder> singleFieldBuilderV3 = this.payloadBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(payload);
                } else if ((this.bitField0_ & 1) == 0 || (payload2 = this.payload_) == null || payload2 == Payload.getDefaultInstance()) {
                    this.payload_ = payload;
                } else {
                    getPayloadBuilder().mergeFrom(payload);
                }
                if (this.payload_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setError(Error error) {
                error.getClass();
                this.bitField0_ |= 2;
                this.error_ = error.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setPayload(Payload.Builder builder) {
                SingleFieldBuilderV3<Payload, Payload.Builder, PayloadOrBuilder> singleFieldBuilderV3 = this.payloadBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.payload_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public EchoResponse getDefaultInstanceForType() {
                return EchoResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.error_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setPayload(Payload payload) {
                SingleFieldBuilderV3<Payload, Payload.Builder, PayloadOrBuilder> singleFieldBuilderV3 = this.payloadBuilder_;
                if (singleFieldBuilderV3 == null) {
                    payload.getClass();
                    this.payload_ = payload;
                } else {
                    singleFieldBuilderV3.setMessage(payload);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EchoResponse) {
                    return mergeFrom((EchoResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EchoResponse echoResponse) {
                if (echoResponse == EchoResponse.getDefaultInstance()) {
                    return this;
                }
                if (echoResponse.hasPayload()) {
                    mergePayload(echoResponse.getPayload());
                }
                if (echoResponse.hasError()) {
                    setError(echoResponse.getError());
                }
                mergeUnknownFields(echoResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EchoResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static EchoResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EchoResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EchoResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ EchoResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static EchoResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private EchoResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.error_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EchoResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static EchoResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static EchoResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static EchoResponse parseFrom(InputStream inputStream) {
            return (EchoResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static EchoResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EchoResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EchoResponse parseFrom(CodedInputStream codedInputStream) {
            return (EchoResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static EchoResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EchoResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Error implements ProtocolMessageEnum {
            UNKNOWN(0),
            NO_RESOURCES(1),
            BUFFER_IN_USE(2);

            public static final int BUFFER_IN_USE_VALUE = 2;
            public static final int NO_RESOURCES_VALUE = 1;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Error> internalValueMap = new Internal.EnumLiteMap<Error>() { // from class: com.garmin.proto.generated.GDIDiagnostics.EchoResponse.Error.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Error findValueByNumber(int i14) {
                    return Error.forNumber(i14);
                }
            };
            private static final Error[] VALUES = values();

            Error(int i14) {
                this.value = i14;
            }

            public static Error forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN;
                }
                if (i14 == 1) {
                    return NO_RESOURCES;
                }
                if (i14 != 2) {
                    return null;
                }
                return BUFFER_IN_USE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return EchoResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Error> internalGetValueMap() {
                return internalValueMap;
            }

            public static Error valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                h.s("EnumValueDescriptor is not for this type.");
                return null;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                return getDescriptor().getValues().get(ordinal());
            }

            @Deprecated
            public static Error valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class Payload extends GeneratedMessageV3 implements PayloadOrBuilder {
        public static final int DATA_FIELD_NUMBER = 1;
        private static final Payload DEFAULT_INSTANCE = new Payload();

        @Deprecated
        public static final Parser<Payload> PARSER = new AbstractParser<Payload>() { // from class: com.garmin.proto.generated.GDIDiagnostics.Payload.1
            @Override // com.google.protobuf.Parser
            public Payload parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Payload.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString data_;
        private byte memoizedIsInitialized;

        private Payload(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.data_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Payload getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDiagnostics.internal_static_GDI_Proto_Diagnostics_Payload_descriptor;
        }

        public static Builder newBuilder(Payload payload) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(payload);
        }

        public static Payload parseDelimitedFrom(InputStream inputStream) {
            return (Payload) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Payload parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Payload> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Payload)) {
                return super.equals(obj);
            }
            Payload payload = (Payload) obj;
            if (hasData() != payload.hasData()) {
                return false;
            }
            return (!hasData() || getData().equals(payload.getData())) && getUnknownFields().equals(payload.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIDiagnostics.PayloadOrBuilder
        public ByteString getData() {
            return this.data_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Payload> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.data_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDiagnostics.PayloadOrBuilder
        public boolean hasData() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasData()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getData().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDiagnostics.internal_static_GDI_Proto_Diagnostics_Payload_fieldAccessorTable.ensureFieldAccessorsInitialized(Payload.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Payload();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.data_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PayloadOrBuilder {
            private int bitField0_;
            private ByteString data_;

            private Builder() {
                this.data_ = ByteString.EMPTY;
            }

            private void buildPartial0(Payload payload) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    payload.data_ = this.data_;
                } else {
                    i14 = 0;
                }
                payload.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDiagnostics.internal_static_GDI_Proto_Diagnostics_Payload_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Payload build() {
                Payload payloadBuildPartial = buildPartial();
                if (payloadBuildPartial.isInitialized()) {
                    return payloadBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) payloadBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Payload buildPartial() {
                Payload payload = new Payload(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(payload);
                }
                onBuilt();
                return payload;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.data_ = ByteString.EMPTY;
                return this;
            }

            public Builder clearData() {
                this.bitField0_ &= -2;
                this.data_ = Payload.getDefaultInstance().getData();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIDiagnostics.PayloadOrBuilder
            public ByteString getData() {
                return this.data_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDiagnostics.internal_static_GDI_Proto_Diagnostics_Payload_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDiagnostics.PayloadOrBuilder
            public boolean hasData() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDiagnostics.internal_static_GDI_Proto_Diagnostics_Payload_fieldAccessorTable.ensureFieldAccessorsInitialized(Payload.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.data_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z14 = true;
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setData(ByteString byteString) {
                byteString.getClass();
                this.data_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Payload getDefaultInstanceForType() {
                return Payload.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.data_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Payload) {
                    return mergeFrom((Payload) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Payload payload) {
                if (payload == Payload.getDefaultInstance()) {
                    return this;
                }
                if (payload.hasData()) {
                    setData(payload.getData());
                }
                mergeUnknownFields(payload.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Payload getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Payload parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Payload) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Payload parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Payload parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public /* synthetic */ Payload(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Payload parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private Payload() {
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.data_ = byteString;
        }

        public static Payload parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Payload parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Payload parseFrom(InputStream inputStream) {
            return (Payload) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Payload parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Payload) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Payload parseFrom(CodedInputStream codedInputStream) {
            return (Payload) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Payload parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Payload) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        public static final int ECHO_REQUEST_FIELD_NUMBER = 1;
        public static final int ECHO_RESPONSE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private EchoRequest echoRequest_;
        private EchoResponse echoResponse_;
        private byte memoizedIsInitialized;
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDIDiagnostics.Service.1
            @Override // com.google.protobuf.Parser
            public Service parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Service.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        private Service(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Service getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDiagnostics.internal_static_GDI_Proto_Diagnostics_Service_descriptor;
        }

        public static Builder newBuilder(Service service) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(service);
        }

        public static Service parseDelimitedFrom(InputStream inputStream) {
            return (Service) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Service parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Service> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Service)) {
                return super.equals(obj);
            }
            Service service = (Service) obj;
            if (hasEchoRequest() != service.hasEchoRequest()) {
                return false;
            }
            if ((!hasEchoRequest() || getEchoRequest().equals(service.getEchoRequest())) && hasEchoResponse() == service.hasEchoResponse()) {
                return (!hasEchoResponse() || getEchoResponse().equals(service.getEchoResponse())) && getUnknownFields().equals(service.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDiagnostics.ServiceOrBuilder
        public EchoRequest getEchoRequest() {
            EchoRequest echoRequest = this.echoRequest_;
            return echoRequest == null ? EchoRequest.getDefaultInstance() : echoRequest;
        }

        @Override // com.garmin.proto.generated.GDIDiagnostics.ServiceOrBuilder
        public EchoRequestOrBuilder getEchoRequestOrBuilder() {
            EchoRequest echoRequest = this.echoRequest_;
            return echoRequest == null ? EchoRequest.getDefaultInstance() : echoRequest;
        }

        @Override // com.garmin.proto.generated.GDIDiagnostics.ServiceOrBuilder
        public EchoResponse getEchoResponse() {
            EchoResponse echoResponse = this.echoResponse_;
            return echoResponse == null ? EchoResponse.getDefaultInstance() : echoResponse;
        }

        @Override // com.garmin.proto.generated.GDIDiagnostics.ServiceOrBuilder
        public EchoResponseOrBuilder getEchoResponseOrBuilder() {
            EchoResponse echoResponse = this.echoResponse_;
            return echoResponse == null ? EchoResponse.getDefaultInstance() : echoResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Service> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getEchoRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getEchoResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDiagnostics.ServiceOrBuilder
        public boolean hasEchoRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDiagnostics.ServiceOrBuilder
        public boolean hasEchoResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasEchoRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getEchoRequest().hashCode();
            }
            if (hasEchoResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getEchoResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDiagnostics.internal_static_GDI_Proto_Diagnostics_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Service();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getEchoRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getEchoResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<EchoRequest, EchoRequest.Builder, EchoRequestOrBuilder> echoRequestBuilder_;
            private EchoRequest echoRequest_;
            private SingleFieldBuilderV3<EchoResponse, EchoResponse.Builder, EchoResponseOrBuilder> echoResponseBuilder_;
            private EchoResponse echoResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Service service) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<EchoRequest, EchoRequest.Builder, EchoRequestOrBuilder> singleFieldBuilderV3 = this.echoRequestBuilder_;
                    service.echoRequest_ = singleFieldBuilderV3 == null ? this.echoRequest_ : (EchoRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<EchoResponse, EchoResponse.Builder, EchoResponseOrBuilder> singleFieldBuilderV4 = this.echoResponseBuilder_;
                    service.echoResponse_ = singleFieldBuilderV4 == null ? this.echoResponse_ : (EchoResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                service.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDiagnostics.internal_static_GDI_Proto_Diagnostics_Service_descriptor;
            }

            private SingleFieldBuilderV3<EchoRequest, EchoRequest.Builder, EchoRequestOrBuilder> getEchoRequestFieldBuilder() {
                if (this.echoRequestBuilder_ == null) {
                    this.echoRequestBuilder_ = new SingleFieldBuilderV3<>(getEchoRequest(), getParentForChildren(), isClean());
                    this.echoRequest_ = null;
                }
                return this.echoRequestBuilder_;
            }

            private SingleFieldBuilderV3<EchoResponse, EchoResponse.Builder, EchoResponseOrBuilder> getEchoResponseFieldBuilder() {
                if (this.echoResponseBuilder_ == null) {
                    this.echoResponseBuilder_ = new SingleFieldBuilderV3<>(getEchoResponse(), getParentForChildren(), isClean());
                    this.echoResponse_ = null;
                }
                return this.echoResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getEchoRequestFieldBuilder();
                    getEchoResponseFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Service build() {
                Service serviceBuildPartial = buildPartial();
                if (serviceBuildPartial.isInitialized()) {
                    return serviceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) serviceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Service buildPartial() {
                Service service = new Service(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(service);
                }
                onBuilt();
                return service;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.echoRequest_ = null;
                SingleFieldBuilderV3<EchoRequest, EchoRequest.Builder, EchoRequestOrBuilder> singleFieldBuilderV3 = this.echoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.echoRequestBuilder_ = null;
                }
                this.echoResponse_ = null;
                SingleFieldBuilderV3<EchoResponse, EchoResponse.Builder, EchoResponseOrBuilder> singleFieldBuilderV4 = this.echoResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.echoResponseBuilder_ = null;
                }
                return this;
            }

            public Builder clearEchoRequest() {
                this.bitField0_ &= -2;
                this.echoRequest_ = null;
                SingleFieldBuilderV3<EchoRequest, EchoRequest.Builder, EchoRequestOrBuilder> singleFieldBuilderV3 = this.echoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.echoRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearEchoResponse() {
                this.bitField0_ &= -3;
                this.echoResponse_ = null;
                SingleFieldBuilderV3<EchoResponse, EchoResponse.Builder, EchoResponseOrBuilder> singleFieldBuilderV3 = this.echoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.echoResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDiagnostics.internal_static_GDI_Proto_Diagnostics_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDiagnostics.ServiceOrBuilder
            public EchoRequest getEchoRequest() {
                SingleFieldBuilderV3<EchoRequest, EchoRequest.Builder, EchoRequestOrBuilder> singleFieldBuilderV3 = this.echoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EchoRequest) singleFieldBuilderV3.getMessage();
                }
                EchoRequest echoRequest = this.echoRequest_;
                return echoRequest == null ? EchoRequest.getDefaultInstance() : echoRequest;
            }

            public EchoRequest.Builder getEchoRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (EchoRequest.Builder) getEchoRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDiagnostics.ServiceOrBuilder
            public EchoRequestOrBuilder getEchoRequestOrBuilder() {
                SingleFieldBuilderV3<EchoRequest, EchoRequest.Builder, EchoRequestOrBuilder> singleFieldBuilderV3 = this.echoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EchoRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                EchoRequest echoRequest = this.echoRequest_;
                return echoRequest == null ? EchoRequest.getDefaultInstance() : echoRequest;
            }

            @Override // com.garmin.proto.generated.GDIDiagnostics.ServiceOrBuilder
            public EchoResponse getEchoResponse() {
                SingleFieldBuilderV3<EchoResponse, EchoResponse.Builder, EchoResponseOrBuilder> singleFieldBuilderV3 = this.echoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EchoResponse) singleFieldBuilderV3.getMessage();
                }
                EchoResponse echoResponse = this.echoResponse_;
                return echoResponse == null ? EchoResponse.getDefaultInstance() : echoResponse;
            }

            public EchoResponse.Builder getEchoResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (EchoResponse.Builder) getEchoResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDiagnostics.ServiceOrBuilder
            public EchoResponseOrBuilder getEchoResponseOrBuilder() {
                SingleFieldBuilderV3<EchoResponse, EchoResponse.Builder, EchoResponseOrBuilder> singleFieldBuilderV3 = this.echoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EchoResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                EchoResponse echoResponse = this.echoResponse_;
                return echoResponse == null ? EchoResponse.getDefaultInstance() : echoResponse;
            }

            @Override // com.garmin.proto.generated.GDIDiagnostics.ServiceOrBuilder
            public boolean hasEchoRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDiagnostics.ServiceOrBuilder
            public boolean hasEchoResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDiagnostics.internal_static_GDI_Proto_Diagnostics_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeEchoRequest(EchoRequest echoRequest) {
                EchoRequest echoRequest2;
                SingleFieldBuilderV3<EchoRequest, EchoRequest.Builder, EchoRequestOrBuilder> singleFieldBuilderV3 = this.echoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(echoRequest);
                } else if ((this.bitField0_ & 1) == 0 || (echoRequest2 = this.echoRequest_) == null || echoRequest2 == EchoRequest.getDefaultInstance()) {
                    this.echoRequest_ = echoRequest;
                } else {
                    getEchoRequestBuilder().mergeFrom(echoRequest);
                }
                if (this.echoRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeEchoResponse(EchoResponse echoResponse) {
                EchoResponse echoResponse2;
                SingleFieldBuilderV3<EchoResponse, EchoResponse.Builder, EchoResponseOrBuilder> singleFieldBuilderV3 = this.echoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(echoResponse);
                } else if ((this.bitField0_ & 2) == 0 || (echoResponse2 = this.echoResponse_) == null || echoResponse2 == EchoResponse.getDefaultInstance()) {
                    this.echoResponse_ = echoResponse;
                } else {
                    getEchoResponseBuilder().mergeFrom(echoResponse);
                }
                if (this.echoResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    codedInputStream.readMessage(getEchoRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getEchoResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z14 = true;
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setEchoRequest(EchoRequest.Builder builder) {
                SingleFieldBuilderV3<EchoRequest, EchoRequest.Builder, EchoRequestOrBuilder> singleFieldBuilderV3 = this.echoRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.echoRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setEchoResponse(EchoResponse.Builder builder) {
                SingleFieldBuilderV3<EchoResponse, EchoResponse.Builder, EchoResponseOrBuilder> singleFieldBuilderV3 = this.echoResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.echoResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Service getDefaultInstanceForType() {
                return Service.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            public Builder setEchoRequest(EchoRequest echoRequest) {
                SingleFieldBuilderV3<EchoRequest, EchoRequest.Builder, EchoRequestOrBuilder> singleFieldBuilderV3 = this.echoRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    echoRequest.getClass();
                    this.echoRequest_ = echoRequest;
                } else {
                    singleFieldBuilderV3.setMessage(echoRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setEchoResponse(EchoResponse echoResponse) {
                SingleFieldBuilderV3<EchoResponse, EchoResponse.Builder, EchoResponseOrBuilder> singleFieldBuilderV3 = this.echoResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    echoResponse.getClass();
                    this.echoResponse_ = echoResponse;
                } else {
                    singleFieldBuilderV3.setMessage(echoResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Service) {
                    return mergeFrom((Service) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Service service) {
                if (service == Service.getDefaultInstance()) {
                    return this;
                }
                if (service.hasEchoRequest()) {
                    mergeEchoRequest(service.getEchoRequest());
                }
                if (service.hasEchoResponse()) {
                    mergeEchoResponse(service.getEchoResponse());
                }
                mergeUnknownFields(service.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Service getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ Service(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private Service() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Service parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Service) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Service parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Service parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Service parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Service parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Service parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Service parseFrom(InputStream inputStream) {
            return (Service) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Service parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Service) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Service parseFrom(CodedInputStream codedInputStream) {
            return (Service) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Service parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Service) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
