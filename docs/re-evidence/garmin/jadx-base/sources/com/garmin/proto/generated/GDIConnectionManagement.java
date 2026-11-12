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
public final class GDIConnectionManagement {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001dGDIConnectionManagement.proto\u0012\u001eGDI.Proto.ConnectionManagement\u001a\rGDICore.proto\"»\u0001\n\u0007Service\u0012V\n\u0017connection_mode_request\u0018\u0001 \u0001(\u000b25.GDI.Proto.ConnectionManagement.ConnectionModeRequest\u0012X\n\u0018connection_mode_response\u0018\u0002 \u0001(\u000b26.GDI.Proto.ConnectionManagement.ConnectionModeResponse\"\u0090\u0001\n\u0013CapabilitiesRequest2y\n\u0010features_request\u0012*.GDI.Proto.Core.FeatureCapabilitiesRequest\u0018\u001c \u0001(\u000b23.GDI.Proto.ConnectionManagement.CapabilitiesRequest\"P\n ConnectionManagementCapabilities\u0012,\n$is_connection_mode_request_supported\u0018\u0001 \u0001(\b\"\u0082\u0002\n\u0014CapabilitiesResponse\u0012l\n\"connection_management_capabilities\u0018\u0001 \u0001(\u000b2@.GDI.Proto.ConnectionManagement.ConnectionManagementCapabilities2|\n\u0011features_response\u0012+.GDI.Proto.Core.FeatureCapabilitiesResponse\u0018\u001c \u0001(\u000b24.GDI.Proto.ConnectionManagement.CapabilitiesResponse\"j\n\u0015ConnectionModeRequest\u0012Q\n\u000fconnection_mode\u0018\u0001 \u0001(\u000e28.GDI.Proto.ConnectionManagement.SupportedConnectionTypes\"â\u0001\n\u0016ConnectionModeResponse\u0012Q\n\bresponse\u0018\u0001 \u0001(\u000e2?.GDI.Proto.ConnectionManagement.ConnectionModeResponse.Response\u0012Q\n\u000fconnection_mode\u0018\u0002 \u0001(\u000e28.GDI.Proto.ConnectionManagement.SupportedConnectionTypes\"\"\n\bResponse\u0012\t\n\u0005ERROR\u0010\u0000\u0012\u000b\n\u0007SUCCESS\u0010\u0001*9\n\u0018SupportedConnectionTypes\u0012\u0007\n\u0003OFF\u0010\u0000\u0012\n\n\u0006SECURE\u0010\u0001\u0012\b\n\u0004OPEN\u0010\u0002B7\n\u001acom.garmin.proto.generatedB\u0017GDIConnectionManagementH\u0003"}, new Descriptors.FileDescriptor[]{GDICore.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectionManagement_CapabilitiesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectionManagement_CapabilitiesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectionManagement_CapabilitiesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectionManagement_CapabilitiesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectionManagement_ConnectionManagementCapabilities_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectionManagement_ConnectionManagementCapabilities_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectionManagement_ConnectionModeRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectionManagement_ConnectionModeRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectionManagement_ConnectionModeResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectionManagement_ConnectionModeResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectionManagement_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectionManagement_Service_fieldAccessorTable;

    public interface CapabilitiesRequestOrBuilder extends MessageOrBuilder {
    }

    public interface CapabilitiesResponseOrBuilder extends MessageOrBuilder {
        ConnectionManagementCapabilities getConnectionManagementCapabilities();

        ConnectionManagementCapabilitiesOrBuilder getConnectionManagementCapabilitiesOrBuilder();

        boolean hasConnectionManagementCapabilities();
    }

    public interface ConnectionManagementCapabilitiesOrBuilder extends MessageOrBuilder {
        boolean getIsConnectionModeRequestSupported();

        boolean hasIsConnectionModeRequestSupported();
    }

    public interface ConnectionModeRequestOrBuilder extends MessageOrBuilder {
        SupportedConnectionTypes getConnectionMode();

        boolean hasConnectionMode();
    }

    public interface ConnectionModeResponseOrBuilder extends MessageOrBuilder {
        SupportedConnectionTypes getConnectionMode();

        ConnectionModeResponse.Response getResponse();

        boolean hasConnectionMode();

        boolean hasResponse();
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
        ConnectionModeRequest getConnectionModeRequest();

        ConnectionModeRequestOrBuilder getConnectionModeRequestOrBuilder();

        ConnectionModeResponse getConnectionModeResponse();

        ConnectionModeResponseOrBuilder getConnectionModeResponseOrBuilder();

        boolean hasConnectionModeRequest();

        boolean hasConnectionModeResponse();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_ConnectionManagement_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_ConnectionManagement_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"ConnectionModeRequest", "ConnectionModeResponse"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_ConnectionManagement_CapabilitiesRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_ConnectionManagement_CapabilitiesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[0]);
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_ConnectionManagement_ConnectionManagementCapabilities_descriptor = descriptor4;
        internal_static_GDI_Proto_ConnectionManagement_ConnectionManagementCapabilities_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"IsConnectionModeRequestSupported"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_ConnectionManagement_CapabilitiesResponse_descriptor = descriptor5;
        internal_static_GDI_Proto_ConnectionManagement_CapabilitiesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"ConnectionManagementCapabilities"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_ConnectionManagement_ConnectionModeRequest_descriptor = descriptor6;
        internal_static_GDI_Proto_ConnectionManagement_ConnectionModeRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"ConnectionMode"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_ConnectionManagement_ConnectionModeResponse_descriptor = descriptor7;
        internal_static_GDI_Proto_ConnectionManagement_ConnectionModeResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Response", "ConnectionMode"});
        GDICore.getDescriptor();
    }

    private GDIConnectionManagement() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(CapabilitiesRequest.featuresRequest);
        extensionRegistryLite.add(CapabilitiesResponse.featuresResponse);
    }

    public static final class CapabilitiesRequest extends GeneratedMessageV3 implements CapabilitiesRequestOrBuilder {
        public static final int FEATURES_REQUEST_FIELD_NUMBER = 28;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private static final CapabilitiesRequest DEFAULT_INSTANCE = new CapabilitiesRequest();

        @Deprecated
        public static final Parser<CapabilitiesRequest> PARSER = new AbstractParser<CapabilitiesRequest>() { // from class: com.garmin.proto.generated.GDIConnectionManagement.CapabilitiesRequest.1
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
            return GDIConnectionManagement.internal_static_GDI_Proto_ConnectionManagement_CapabilitiesRequest_descriptor;
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
            return GDIConnectionManagement.internal_static_GDI_Proto_ConnectionManagement_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
                return GDIConnectionManagement.internal_static_GDI_Proto_ConnectionManagement_CapabilitiesRequest_descriptor;
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
                return GDIConnectionManagement.internal_static_GDI_Proto_ConnectionManagement_CapabilitiesRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectionManagement.internal_static_GDI_Proto_ConnectionManagement_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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

    public static final class ConnectionManagementCapabilities extends GeneratedMessageV3 implements ConnectionManagementCapabilitiesOrBuilder {
        public static final int IS_CONNECTION_MODE_REQUEST_SUPPORTED_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean isConnectionModeRequestSupported_;
        private byte memoizedIsInitialized;
        private static final ConnectionManagementCapabilities DEFAULT_INSTANCE = new ConnectionManagementCapabilities();

        @Deprecated
        public static final Parser<ConnectionManagementCapabilities> PARSER = new AbstractParser<ConnectionManagementCapabilities>() { // from class: com.garmin.proto.generated.GDIConnectionManagement.ConnectionManagementCapabilities.1
            @Override // com.google.protobuf.Parser
            public ConnectionManagementCapabilities parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConnectionManagementCapabilities.newBuilder();
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

        private ConnectionManagementCapabilities(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.isConnectionModeRequestSupported_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConnectionManagementCapabilities getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectionManagement.internal_static_GDI_Proto_ConnectionManagement_ConnectionManagementCapabilities_descriptor;
        }

        public static Builder newBuilder(ConnectionManagementCapabilities connectionManagementCapabilities) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(connectionManagementCapabilities);
        }

        public static ConnectionManagementCapabilities parseDelimitedFrom(InputStream inputStream) {
            return (ConnectionManagementCapabilities) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConnectionManagementCapabilities parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConnectionManagementCapabilities> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConnectionManagementCapabilities)) {
                return super.equals(obj);
            }
            ConnectionManagementCapabilities connectionManagementCapabilities = (ConnectionManagementCapabilities) obj;
            if (hasIsConnectionModeRequestSupported() != connectionManagementCapabilities.hasIsConnectionModeRequestSupported()) {
                return false;
            }
            return (!hasIsConnectionModeRequestSupported() || getIsConnectionModeRequestSupported() == connectionManagementCapabilities.getIsConnectionModeRequestSupported()) && getUnknownFields().equals(connectionManagementCapabilities.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIConnectionManagement.ConnectionManagementCapabilitiesOrBuilder
        public boolean getIsConnectionModeRequestSupported() {
            return this.isConnectionModeRequestSupported_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConnectionManagementCapabilities> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.isConnectionModeRequestSupported_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectionManagement.ConnectionManagementCapabilitiesOrBuilder
        public boolean hasIsConnectionModeRequestSupported() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasIsConnectionModeRequestSupported()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getIsConnectionModeRequestSupported());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectionManagement.internal_static_GDI_Proto_ConnectionManagement_ConnectionManagementCapabilities_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectionManagementCapabilities.class, Builder.class);
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
            return new ConnectionManagementCapabilities();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.isConnectionModeRequestSupported_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConnectionManagementCapabilitiesOrBuilder {
            private int bitField0_;
            private boolean isConnectionModeRequestSupported_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(ConnectionManagementCapabilities connectionManagementCapabilities) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    connectionManagementCapabilities.isConnectionModeRequestSupported_ = this.isConnectionModeRequestSupported_;
                } else {
                    i14 = 0;
                }
                connectionManagementCapabilities.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectionManagement.internal_static_GDI_Proto_ConnectionManagement_ConnectionManagementCapabilities_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectionManagementCapabilities build() {
                ConnectionManagementCapabilities connectionManagementCapabilitiesBuildPartial = buildPartial();
                if (connectionManagementCapabilitiesBuildPartial.isInitialized()) {
                    return connectionManagementCapabilitiesBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) connectionManagementCapabilitiesBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectionManagementCapabilities buildPartial() {
                ConnectionManagementCapabilities connectionManagementCapabilities = new ConnectionManagementCapabilities(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(connectionManagementCapabilities);
                }
                onBuilt();
                return connectionManagementCapabilities;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.isConnectionModeRequestSupported_ = false;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearIsConnectionModeRequestSupported() {
                this.bitField0_ &= -2;
                this.isConnectionModeRequestSupported_ = false;
                onChanged();
                return this;
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
                return GDIConnectionManagement.internal_static_GDI_Proto_ConnectionManagement_ConnectionManagementCapabilities_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectionManagement.ConnectionManagementCapabilitiesOrBuilder
            public boolean getIsConnectionModeRequestSupported() {
                return this.isConnectionModeRequestSupported_;
            }

            @Override // com.garmin.proto.generated.GDIConnectionManagement.ConnectionManagementCapabilitiesOrBuilder
            public boolean hasIsConnectionModeRequestSupported() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectionManagement.internal_static_GDI_Proto_ConnectionManagement_ConnectionManagementCapabilities_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectionManagementCapabilities.class, Builder.class);
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
                                    this.isConnectionModeRequestSupported_ = codedInputStream.readBool();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setIsConnectionModeRequestSupported(boolean z14) {
                this.isConnectionModeRequestSupported_ = z14;
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

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            private Builder() {
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ConnectionManagementCapabilities getDefaultInstanceForType() {
                return ConnectionManagementCapabilities.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConnectionManagementCapabilities) {
                    return mergeFrom((ConnectionManagementCapabilities) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConnectionManagementCapabilities connectionManagementCapabilities) {
                if (connectionManagementCapabilities == ConnectionManagementCapabilities.getDefaultInstance()) {
                    return this;
                }
                if (connectionManagementCapabilities.hasIsConnectionModeRequestSupported()) {
                    setIsConnectionModeRequestSupported(connectionManagementCapabilities.getIsConnectionModeRequestSupported());
                }
                mergeUnknownFields(connectionManagementCapabilities.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConnectionManagementCapabilities getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConnectionManagementCapabilities parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectionManagementCapabilities) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectionManagementCapabilities parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ConnectionManagementCapabilities(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ConnectionManagementCapabilities parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ConnectionManagementCapabilities() {
            this.isConnectionModeRequestSupported_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConnectionManagementCapabilities parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConnectionManagementCapabilities parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConnectionManagementCapabilities parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConnectionManagementCapabilities parseFrom(InputStream inputStream) {
            return (ConnectionManagementCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConnectionManagementCapabilities parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectionManagementCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectionManagementCapabilities parseFrom(CodedInputStream codedInputStream) {
            return (ConnectionManagementCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConnectionManagementCapabilities parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectionManagementCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CapabilitiesResponse extends GeneratedMessageV3 implements CapabilitiesResponseOrBuilder {
        public static final int CONNECTION_MANAGEMENT_CAPABILITIES_FIELD_NUMBER = 1;
        public static final int FEATURES_RESPONSE_FIELD_NUMBER = 28;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ConnectionManagementCapabilities connectionManagementCapabilities_;
        private byte memoizedIsInitialized;
        private static final CapabilitiesResponse DEFAULT_INSTANCE = new CapabilitiesResponse();

        @Deprecated
        public static final Parser<CapabilitiesResponse> PARSER = new AbstractParser<CapabilitiesResponse>() { // from class: com.garmin.proto.generated.GDIConnectionManagement.CapabilitiesResponse.1
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
            return GDIConnectionManagement.internal_static_GDI_Proto_ConnectionManagement_CapabilitiesResponse_descriptor;
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
            if (hasConnectionManagementCapabilities() != capabilitiesResponse.hasConnectionManagementCapabilities()) {
                return false;
            }
            return (!hasConnectionManagementCapabilities() || getConnectionManagementCapabilities().equals(capabilitiesResponse.getConnectionManagementCapabilities())) && getUnknownFields().equals(capabilitiesResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIConnectionManagement.CapabilitiesResponseOrBuilder
        public ConnectionManagementCapabilities getConnectionManagementCapabilities() {
            ConnectionManagementCapabilities connectionManagementCapabilities = this.connectionManagementCapabilities_;
            return connectionManagementCapabilities == null ? ConnectionManagementCapabilities.getDefaultInstance() : connectionManagementCapabilities;
        }

        @Override // com.garmin.proto.generated.GDIConnectionManagement.CapabilitiesResponseOrBuilder
        public ConnectionManagementCapabilitiesOrBuilder getConnectionManagementCapabilitiesOrBuilder() {
            ConnectionManagementCapabilities connectionManagementCapabilities = this.connectionManagementCapabilities_;
            return connectionManagementCapabilities == null ? ConnectionManagementCapabilities.getDefaultInstance() : connectionManagementCapabilities;
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
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getConnectionManagementCapabilities()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectionManagement.CapabilitiesResponseOrBuilder
        public boolean hasConnectionManagementCapabilities() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasConnectionManagementCapabilities()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getConnectionManagementCapabilities().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectionManagement.internal_static_GDI_Proto_ConnectionManagement_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getConnectionManagementCapabilities());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<ConnectionManagementCapabilities, ConnectionManagementCapabilities.Builder, ConnectionManagementCapabilitiesOrBuilder> connectionManagementCapabilitiesBuilder_;
            private ConnectionManagementCapabilities connectionManagementCapabilities_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(CapabilitiesResponse capabilitiesResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<ConnectionManagementCapabilities, ConnectionManagementCapabilities.Builder, ConnectionManagementCapabilitiesOrBuilder> singleFieldBuilderV3 = this.connectionManagementCapabilitiesBuilder_;
                    capabilitiesResponse.connectionManagementCapabilities_ = singleFieldBuilderV3 == null ? this.connectionManagementCapabilities_ : (ConnectionManagementCapabilities) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                capabilitiesResponse.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<ConnectionManagementCapabilities, ConnectionManagementCapabilities.Builder, ConnectionManagementCapabilitiesOrBuilder> getConnectionManagementCapabilitiesFieldBuilder() {
                if (this.connectionManagementCapabilitiesBuilder_ == null) {
                    this.connectionManagementCapabilitiesBuilder_ = new SingleFieldBuilderV3<>(getConnectionManagementCapabilities(), getParentForChildren(), isClean());
                    this.connectionManagementCapabilities_ = null;
                }
                return this.connectionManagementCapabilitiesBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectionManagement.internal_static_GDI_Proto_ConnectionManagement_CapabilitiesResponse_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getConnectionManagementCapabilitiesFieldBuilder();
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
                this.connectionManagementCapabilities_ = null;
                SingleFieldBuilderV3<ConnectionManagementCapabilities, ConnectionManagementCapabilities.Builder, ConnectionManagementCapabilitiesOrBuilder> singleFieldBuilderV3 = this.connectionManagementCapabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.connectionManagementCapabilitiesBuilder_ = null;
                }
                return this;
            }

            public Builder clearConnectionManagementCapabilities() {
                this.bitField0_ &= -2;
                this.connectionManagementCapabilities_ = null;
                SingleFieldBuilderV3<ConnectionManagementCapabilities, ConnectionManagementCapabilities.Builder, ConnectionManagementCapabilitiesOrBuilder> singleFieldBuilderV3 = this.connectionManagementCapabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.connectionManagementCapabilitiesBuilder_ = null;
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

            @Override // com.garmin.proto.generated.GDIConnectionManagement.CapabilitiesResponseOrBuilder
            public ConnectionManagementCapabilities getConnectionManagementCapabilities() {
                SingleFieldBuilderV3<ConnectionManagementCapabilities, ConnectionManagementCapabilities.Builder, ConnectionManagementCapabilitiesOrBuilder> singleFieldBuilderV3 = this.connectionManagementCapabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectionManagementCapabilities) singleFieldBuilderV3.getMessage();
                }
                ConnectionManagementCapabilities connectionManagementCapabilities = this.connectionManagementCapabilities_;
                return connectionManagementCapabilities == null ? ConnectionManagementCapabilities.getDefaultInstance() : connectionManagementCapabilities;
            }

            public ConnectionManagementCapabilities.Builder getConnectionManagementCapabilitiesBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (ConnectionManagementCapabilities.Builder) getConnectionManagementCapabilitiesFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectionManagement.CapabilitiesResponseOrBuilder
            public ConnectionManagementCapabilitiesOrBuilder getConnectionManagementCapabilitiesOrBuilder() {
                SingleFieldBuilderV3<ConnectionManagementCapabilities, ConnectionManagementCapabilities.Builder, ConnectionManagementCapabilitiesOrBuilder> singleFieldBuilderV3 = this.connectionManagementCapabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectionManagementCapabilitiesOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConnectionManagementCapabilities connectionManagementCapabilities = this.connectionManagementCapabilities_;
                return connectionManagementCapabilities == null ? ConnectionManagementCapabilities.getDefaultInstance() : connectionManagementCapabilities;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIConnectionManagement.internal_static_GDI_Proto_ConnectionManagement_CapabilitiesResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectionManagement.CapabilitiesResponseOrBuilder
            public boolean hasConnectionManagementCapabilities() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectionManagement.internal_static_GDI_Proto_ConnectionManagement_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeConnectionManagementCapabilities(ConnectionManagementCapabilities connectionManagementCapabilities) {
                ConnectionManagementCapabilities connectionManagementCapabilities2;
                SingleFieldBuilderV3<ConnectionManagementCapabilities, ConnectionManagementCapabilities.Builder, ConnectionManagementCapabilitiesOrBuilder> singleFieldBuilderV3 = this.connectionManagementCapabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(connectionManagementCapabilities);
                } else if ((this.bitField0_ & 1) == 0 || (connectionManagementCapabilities2 = this.connectionManagementCapabilities_) == null || connectionManagementCapabilities2 == ConnectionManagementCapabilities.getDefaultInstance()) {
                    this.connectionManagementCapabilities_ = connectionManagementCapabilities;
                } else {
                    getConnectionManagementCapabilitiesBuilder().mergeFrom(connectionManagementCapabilities);
                }
                if (this.connectionManagementCapabilities_ != null) {
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
                                    codedInputStream.readMessage(getConnectionManagementCapabilitiesFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setConnectionManagementCapabilities(ConnectionManagementCapabilities.Builder builder) {
                SingleFieldBuilderV3<ConnectionManagementCapabilities, ConnectionManagementCapabilities.Builder, ConnectionManagementCapabilitiesOrBuilder> singleFieldBuilderV3 = this.connectionManagementCapabilitiesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.connectionManagementCapabilities_ = builder.build();
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

            public Builder setConnectionManagementCapabilities(ConnectionManagementCapabilities connectionManagementCapabilities) {
                SingleFieldBuilderV3<ConnectionManagementCapabilities, ConnectionManagementCapabilities.Builder, ConnectionManagementCapabilitiesOrBuilder> singleFieldBuilderV3 = this.connectionManagementCapabilitiesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    connectionManagementCapabilities.getClass();
                    this.connectionManagementCapabilities_ = connectionManagementCapabilities;
                } else {
                    singleFieldBuilderV3.setMessage(connectionManagementCapabilities);
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
                if (capabilitiesResponse.hasConnectionManagementCapabilities()) {
                    mergeConnectionManagementCapabilities(capabilitiesResponse.getConnectionManagementCapabilities());
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

    public static final class ConnectionModeRequest extends GeneratedMessageV3 implements ConnectionModeRequestOrBuilder {
        public static final int CONNECTION_MODE_FIELD_NUMBER = 1;
        private static final ConnectionModeRequest DEFAULT_INSTANCE = new ConnectionModeRequest();

        @Deprecated
        public static final Parser<ConnectionModeRequest> PARSER = new AbstractParser<ConnectionModeRequest>() { // from class: com.garmin.proto.generated.GDIConnectionManagement.ConnectionModeRequest.1
            @Override // com.google.protobuf.Parser
            public ConnectionModeRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConnectionModeRequest.newBuilder();
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
        private int connectionMode_;
        private byte memoizedIsInitialized;

        private ConnectionModeRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.connectionMode_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConnectionModeRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectionManagement.internal_static_GDI_Proto_ConnectionManagement_ConnectionModeRequest_descriptor;
        }

        public static Builder newBuilder(ConnectionModeRequest connectionModeRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(connectionModeRequest);
        }

        public static ConnectionModeRequest parseDelimitedFrom(InputStream inputStream) {
            return (ConnectionModeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConnectionModeRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConnectionModeRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConnectionModeRequest)) {
                return super.equals(obj);
            }
            ConnectionModeRequest connectionModeRequest = (ConnectionModeRequest) obj;
            if (hasConnectionMode() != connectionModeRequest.hasConnectionMode()) {
                return false;
            }
            return (!hasConnectionMode() || this.connectionMode_ == connectionModeRequest.connectionMode_) && getUnknownFields().equals(connectionModeRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIConnectionManagement.ConnectionModeRequestOrBuilder
        public SupportedConnectionTypes getConnectionMode() {
            SupportedConnectionTypes supportedConnectionTypesForNumber = SupportedConnectionTypes.forNumber(this.connectionMode_);
            return supportedConnectionTypesForNumber == null ? SupportedConnectionTypes.OFF : supportedConnectionTypesForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConnectionModeRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.connectionMode_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectionManagement.ConnectionModeRequestOrBuilder
        public boolean hasConnectionMode() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasConnectionMode()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.connectionMode_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectionManagement.internal_static_GDI_Proto_ConnectionManagement_ConnectionModeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectionModeRequest.class, Builder.class);
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
            return new ConnectionModeRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.connectionMode_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConnectionModeRequestOrBuilder {
            private int bitField0_;
            private int connectionMode_;

            private Builder() {
                this.connectionMode_ = 0;
            }

            private void buildPartial0(ConnectionModeRequest connectionModeRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    connectionModeRequest.connectionMode_ = this.connectionMode_;
                } else {
                    i14 = 0;
                }
                connectionModeRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectionManagement.internal_static_GDI_Proto_ConnectionManagement_ConnectionModeRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectionModeRequest build() {
                ConnectionModeRequest connectionModeRequestBuildPartial = buildPartial();
                if (connectionModeRequestBuildPartial.isInitialized()) {
                    return connectionModeRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) connectionModeRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectionModeRequest buildPartial() {
                ConnectionModeRequest connectionModeRequest = new ConnectionModeRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(connectionModeRequest);
                }
                onBuilt();
                return connectionModeRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.connectionMode_ = 0;
                return this;
            }

            public Builder clearConnectionMode() {
                this.bitField0_ &= -2;
                this.connectionMode_ = 0;
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

            @Override // com.garmin.proto.generated.GDIConnectionManagement.ConnectionModeRequestOrBuilder
            public SupportedConnectionTypes getConnectionMode() {
                SupportedConnectionTypes supportedConnectionTypesForNumber = SupportedConnectionTypes.forNumber(this.connectionMode_);
                return supportedConnectionTypesForNumber == null ? SupportedConnectionTypes.OFF : supportedConnectionTypesForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIConnectionManagement.internal_static_GDI_Proto_ConnectionManagement_ConnectionModeRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectionManagement.ConnectionModeRequestOrBuilder
            public boolean hasConnectionMode() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectionManagement.internal_static_GDI_Proto_ConnectionManagement_ConnectionModeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectionModeRequest.class, Builder.class);
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
                                    int i14 = codedInputStream.readEnum();
                                    if (SupportedConnectionTypes.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.connectionMode_ = i14;
                                        this.bitField0_ |= 1;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setConnectionMode(SupportedConnectionTypes supportedConnectionTypes) {
                supportedConnectionTypes.getClass();
                this.bitField0_ |= 1;
                this.connectionMode_ = supportedConnectionTypes.getNumber();
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
            public ConnectionModeRequest getDefaultInstanceForType() {
                return ConnectionModeRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.connectionMode_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConnectionModeRequest) {
                    return mergeFrom((ConnectionModeRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConnectionModeRequest connectionModeRequest) {
                if (connectionModeRequest == ConnectionModeRequest.getDefaultInstance()) {
                    return this;
                }
                if (connectionModeRequest.hasConnectionMode()) {
                    setConnectionMode(connectionModeRequest.getConnectionMode());
                }
                mergeUnknownFields(connectionModeRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConnectionModeRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConnectionModeRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectionModeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectionModeRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ConnectionModeRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ConnectionModeRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ConnectionModeRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.connectionMode_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConnectionModeRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConnectionModeRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConnectionModeRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConnectionModeRequest parseFrom(InputStream inputStream) {
            return (ConnectionModeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConnectionModeRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectionModeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectionModeRequest parseFrom(CodedInputStream codedInputStream) {
            return (ConnectionModeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConnectionModeRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectionModeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ConnectionModeResponse extends GeneratedMessageV3 implements ConnectionModeResponseOrBuilder {
        public static final int CONNECTION_MODE_FIELD_NUMBER = 2;
        private static final ConnectionModeResponse DEFAULT_INSTANCE = new ConnectionModeResponse();

        @Deprecated
        public static final Parser<ConnectionModeResponse> PARSER = new AbstractParser<ConnectionModeResponse>() { // from class: com.garmin.proto.generated.GDIConnectionManagement.ConnectionModeResponse.1
            @Override // com.google.protobuf.Parser
            public ConnectionModeResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConnectionModeResponse.newBuilder();
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
        public static final int RESPONSE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int connectionMode_;
        private byte memoizedIsInitialized;
        private int response_;

        private ConnectionModeResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.response_ = 0;
            this.connectionMode_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConnectionModeResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectionManagement.internal_static_GDI_Proto_ConnectionManagement_ConnectionModeResponse_descriptor;
        }

        public static Builder newBuilder(ConnectionModeResponse connectionModeResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(connectionModeResponse);
        }

        public static ConnectionModeResponse parseDelimitedFrom(InputStream inputStream) {
            return (ConnectionModeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConnectionModeResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConnectionModeResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConnectionModeResponse)) {
                return super.equals(obj);
            }
            ConnectionModeResponse connectionModeResponse = (ConnectionModeResponse) obj;
            if (hasResponse() != connectionModeResponse.hasResponse()) {
                return false;
            }
            if ((!hasResponse() || this.response_ == connectionModeResponse.response_) && hasConnectionMode() == connectionModeResponse.hasConnectionMode()) {
                return (!hasConnectionMode() || this.connectionMode_ == connectionModeResponse.connectionMode_) && getUnknownFields().equals(connectionModeResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIConnectionManagement.ConnectionModeResponseOrBuilder
        public SupportedConnectionTypes getConnectionMode() {
            SupportedConnectionTypes supportedConnectionTypesForNumber = SupportedConnectionTypes.forNumber(this.connectionMode_);
            return supportedConnectionTypesForNumber == null ? SupportedConnectionTypes.OFF : supportedConnectionTypesForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConnectionModeResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIConnectionManagement.ConnectionModeResponseOrBuilder
        public Response getResponse() {
            Response responseForNumber = Response.forNumber(this.response_);
            return responseForNumber == null ? Response.ERROR : responseForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.response_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(2, this.connectionMode_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectionManagement.ConnectionModeResponseOrBuilder
        public boolean hasConnectionMode() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectionManagement.ConnectionModeResponseOrBuilder
        public boolean hasResponse() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasResponse()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.response_;
            }
            if (hasConnectionMode()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.connectionMode_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectionManagement.internal_static_GDI_Proto_ConnectionManagement_ConnectionModeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectionModeResponse.class, Builder.class);
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
            return new ConnectionModeResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.response_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.connectionMode_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConnectionModeResponseOrBuilder {
            private int bitField0_;
            private int connectionMode_;
            private int response_;

            private Builder() {
                this.response_ = 0;
                this.connectionMode_ = 0;
            }

            private void buildPartial0(ConnectionModeResponse connectionModeResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    connectionModeResponse.response_ = this.response_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    connectionModeResponse.connectionMode_ = this.connectionMode_;
                    i14 |= 2;
                }
                connectionModeResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectionManagement.internal_static_GDI_Proto_ConnectionManagement_ConnectionModeResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectionModeResponse build() {
                ConnectionModeResponse connectionModeResponseBuildPartial = buildPartial();
                if (connectionModeResponseBuildPartial.isInitialized()) {
                    return connectionModeResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) connectionModeResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectionModeResponse buildPartial() {
                ConnectionModeResponse connectionModeResponse = new ConnectionModeResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(connectionModeResponse);
                }
                onBuilt();
                return connectionModeResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.response_ = 0;
                this.connectionMode_ = 0;
                return this;
            }

            public Builder clearConnectionMode() {
                this.bitField0_ &= -3;
                this.connectionMode_ = 0;
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

            public Builder clearResponse() {
                this.bitField0_ &= -2;
                this.response_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIConnectionManagement.ConnectionModeResponseOrBuilder
            public SupportedConnectionTypes getConnectionMode() {
                SupportedConnectionTypes supportedConnectionTypesForNumber = SupportedConnectionTypes.forNumber(this.connectionMode_);
                return supportedConnectionTypesForNumber == null ? SupportedConnectionTypes.OFF : supportedConnectionTypesForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIConnectionManagement.internal_static_GDI_Proto_ConnectionManagement_ConnectionModeResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectionManagement.ConnectionModeResponseOrBuilder
            public Response getResponse() {
                Response responseForNumber = Response.forNumber(this.response_);
                return responseForNumber == null ? Response.ERROR : responseForNumber;
            }

            @Override // com.garmin.proto.generated.GDIConnectionManagement.ConnectionModeResponseOrBuilder
            public boolean hasConnectionMode() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectionManagement.ConnectionModeResponseOrBuilder
            public boolean hasResponse() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectionManagement.internal_static_GDI_Proto_ConnectionManagement_ConnectionModeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectionModeResponse.class, Builder.class);
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
                                    int i14 = codedInputStream.readEnum();
                                    if (Response.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.response_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    int i15 = codedInputStream.readEnum();
                                    if (SupportedConnectionTypes.forNumber(i15) == null) {
                                        mergeUnknownVarintField(2, i15);
                                    } else {
                                        this.connectionMode_ = i15;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setConnectionMode(SupportedConnectionTypes supportedConnectionTypes) {
                supportedConnectionTypes.getClass();
                this.bitField0_ |= 2;
                this.connectionMode_ = supportedConnectionTypes.getNumber();
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

            public Builder setResponse(Response response) {
                response.getClass();
                this.bitField0_ |= 1;
                this.response_ = response.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ConnectionModeResponse getDefaultInstanceForType() {
                return ConnectionModeResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.response_ = 0;
                this.connectionMode_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConnectionModeResponse) {
                    return mergeFrom((ConnectionModeResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConnectionModeResponse connectionModeResponse) {
                if (connectionModeResponse == ConnectionModeResponse.getDefaultInstance()) {
                    return this;
                }
                if (connectionModeResponse.hasResponse()) {
                    setResponse(connectionModeResponse.getResponse());
                }
                if (connectionModeResponse.hasConnectionMode()) {
                    setConnectionMode(connectionModeResponse.getConnectionMode());
                }
                mergeUnknownFields(connectionModeResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConnectionModeResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConnectionModeResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectionModeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectionModeResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConnectionModeResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConnectionModeResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ ConnectionModeResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ConnectionModeResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private ConnectionModeResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.response_ = 0;
            this.connectionMode_ = 0;
        }

        public static ConnectionModeResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConnectionModeResponse parseFrom(InputStream inputStream) {
            return (ConnectionModeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConnectionModeResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectionModeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectionModeResponse parseFrom(CodedInputStream codedInputStream) {
            return (ConnectionModeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConnectionModeResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectionModeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Response implements ProtocolMessageEnum {
            ERROR(0),
            SUCCESS(1);

            public static final int ERROR_VALUE = 0;
            public static final int SUCCESS_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<Response> internalValueMap = new Internal.EnumLiteMap<Response>() { // from class: com.garmin.proto.generated.GDIConnectionManagement.ConnectionModeResponse.Response.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Response findValueByNumber(int i14) {
                    return Response.forNumber(i14);
                }
            };
            private static final Response[] VALUES = values();

            Response(int i14) {
                this.value = i14;
            }

            public static Response forNumber(int i14) {
                if (i14 == 0) {
                    return ERROR;
                }
                if (i14 != 1) {
                    return null;
                }
                return SUCCESS;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ConnectionModeResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Response> internalGetValueMap() {
                return internalValueMap;
            }

            public static Response valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Response valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        public static final int CONNECTION_MODE_REQUEST_FIELD_NUMBER = 1;
        public static final int CONNECTION_MODE_RESPONSE_FIELD_NUMBER = 2;
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDIConnectionManagement.Service.1
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
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ConnectionModeRequest connectionModeRequest_;
        private ConnectionModeResponse connectionModeResponse_;
        private byte memoizedIsInitialized;

        private Service(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Service getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectionManagement.internal_static_GDI_Proto_ConnectionManagement_Service_descriptor;
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
            if (hasConnectionModeRequest() != service.hasConnectionModeRequest()) {
                return false;
            }
            if ((!hasConnectionModeRequest() || getConnectionModeRequest().equals(service.getConnectionModeRequest())) && hasConnectionModeResponse() == service.hasConnectionModeResponse()) {
                return (!hasConnectionModeResponse() || getConnectionModeResponse().equals(service.getConnectionModeResponse())) && getUnknownFields().equals(service.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIConnectionManagement.ServiceOrBuilder
        public ConnectionModeRequest getConnectionModeRequest() {
            ConnectionModeRequest connectionModeRequest = this.connectionModeRequest_;
            return connectionModeRequest == null ? ConnectionModeRequest.getDefaultInstance() : connectionModeRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectionManagement.ServiceOrBuilder
        public ConnectionModeRequestOrBuilder getConnectionModeRequestOrBuilder() {
            ConnectionModeRequest connectionModeRequest = this.connectionModeRequest_;
            return connectionModeRequest == null ? ConnectionModeRequest.getDefaultInstance() : connectionModeRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectionManagement.ServiceOrBuilder
        public ConnectionModeResponse getConnectionModeResponse() {
            ConnectionModeResponse connectionModeResponse = this.connectionModeResponse_;
            return connectionModeResponse == null ? ConnectionModeResponse.getDefaultInstance() : connectionModeResponse;
        }

        @Override // com.garmin.proto.generated.GDIConnectionManagement.ServiceOrBuilder
        public ConnectionModeResponseOrBuilder getConnectionModeResponseOrBuilder() {
            ConnectionModeResponse connectionModeResponse = this.connectionModeResponse_;
            return connectionModeResponse == null ? ConnectionModeResponse.getDefaultInstance() : connectionModeResponse;
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
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getConnectionModeRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getConnectionModeResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectionManagement.ServiceOrBuilder
        public boolean hasConnectionModeRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectionManagement.ServiceOrBuilder
        public boolean hasConnectionModeResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasConnectionModeRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getConnectionModeRequest().hashCode();
            }
            if (hasConnectionModeResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getConnectionModeResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectionManagement.internal_static_GDI_Proto_ConnectionManagement_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getConnectionModeRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getConnectionModeResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<ConnectionModeRequest, ConnectionModeRequest.Builder, ConnectionModeRequestOrBuilder> connectionModeRequestBuilder_;
            private ConnectionModeRequest connectionModeRequest_;
            private SingleFieldBuilderV3<ConnectionModeResponse, ConnectionModeResponse.Builder, ConnectionModeResponseOrBuilder> connectionModeResponseBuilder_;
            private ConnectionModeResponse connectionModeResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Service service) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<ConnectionModeRequest, ConnectionModeRequest.Builder, ConnectionModeRequestOrBuilder> singleFieldBuilderV3 = this.connectionModeRequestBuilder_;
                    service.connectionModeRequest_ = singleFieldBuilderV3 == null ? this.connectionModeRequest_ : (ConnectionModeRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<ConnectionModeResponse, ConnectionModeResponse.Builder, ConnectionModeResponseOrBuilder> singleFieldBuilderV4 = this.connectionModeResponseBuilder_;
                    service.connectionModeResponse_ = singleFieldBuilderV4 == null ? this.connectionModeResponse_ : (ConnectionModeResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                service.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<ConnectionModeRequest, ConnectionModeRequest.Builder, ConnectionModeRequestOrBuilder> getConnectionModeRequestFieldBuilder() {
                if (this.connectionModeRequestBuilder_ == null) {
                    this.connectionModeRequestBuilder_ = new SingleFieldBuilderV3<>(getConnectionModeRequest(), getParentForChildren(), isClean());
                    this.connectionModeRequest_ = null;
                }
                return this.connectionModeRequestBuilder_;
            }

            private SingleFieldBuilderV3<ConnectionModeResponse, ConnectionModeResponse.Builder, ConnectionModeResponseOrBuilder> getConnectionModeResponseFieldBuilder() {
                if (this.connectionModeResponseBuilder_ == null) {
                    this.connectionModeResponseBuilder_ = new SingleFieldBuilderV3<>(getConnectionModeResponse(), getParentForChildren(), isClean());
                    this.connectionModeResponse_ = null;
                }
                return this.connectionModeResponseBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectionManagement.internal_static_GDI_Proto_ConnectionManagement_Service_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getConnectionModeRequestFieldBuilder();
                    getConnectionModeResponseFieldBuilder();
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
                this.connectionModeRequest_ = null;
                SingleFieldBuilderV3<ConnectionModeRequest, ConnectionModeRequest.Builder, ConnectionModeRequestOrBuilder> singleFieldBuilderV3 = this.connectionModeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.connectionModeRequestBuilder_ = null;
                }
                this.connectionModeResponse_ = null;
                SingleFieldBuilderV3<ConnectionModeResponse, ConnectionModeResponse.Builder, ConnectionModeResponseOrBuilder> singleFieldBuilderV4 = this.connectionModeResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.connectionModeResponseBuilder_ = null;
                }
                return this;
            }

            public Builder clearConnectionModeRequest() {
                this.bitField0_ &= -2;
                this.connectionModeRequest_ = null;
                SingleFieldBuilderV3<ConnectionModeRequest, ConnectionModeRequest.Builder, ConnectionModeRequestOrBuilder> singleFieldBuilderV3 = this.connectionModeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.connectionModeRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConnectionModeResponse() {
                this.bitField0_ &= -3;
                this.connectionModeResponse_ = null;
                SingleFieldBuilderV3<ConnectionModeResponse, ConnectionModeResponse.Builder, ConnectionModeResponseOrBuilder> singleFieldBuilderV3 = this.connectionModeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.connectionModeResponseBuilder_ = null;
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

            @Override // com.garmin.proto.generated.GDIConnectionManagement.ServiceOrBuilder
            public ConnectionModeRequest getConnectionModeRequest() {
                SingleFieldBuilderV3<ConnectionModeRequest, ConnectionModeRequest.Builder, ConnectionModeRequestOrBuilder> singleFieldBuilderV3 = this.connectionModeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectionModeRequest) singleFieldBuilderV3.getMessage();
                }
                ConnectionModeRequest connectionModeRequest = this.connectionModeRequest_;
                return connectionModeRequest == null ? ConnectionModeRequest.getDefaultInstance() : connectionModeRequest;
            }

            public ConnectionModeRequest.Builder getConnectionModeRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (ConnectionModeRequest.Builder) getConnectionModeRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectionManagement.ServiceOrBuilder
            public ConnectionModeRequestOrBuilder getConnectionModeRequestOrBuilder() {
                SingleFieldBuilderV3<ConnectionModeRequest, ConnectionModeRequest.Builder, ConnectionModeRequestOrBuilder> singleFieldBuilderV3 = this.connectionModeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectionModeRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConnectionModeRequest connectionModeRequest = this.connectionModeRequest_;
                return connectionModeRequest == null ? ConnectionModeRequest.getDefaultInstance() : connectionModeRequest;
            }

            @Override // com.garmin.proto.generated.GDIConnectionManagement.ServiceOrBuilder
            public ConnectionModeResponse getConnectionModeResponse() {
                SingleFieldBuilderV3<ConnectionModeResponse, ConnectionModeResponse.Builder, ConnectionModeResponseOrBuilder> singleFieldBuilderV3 = this.connectionModeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectionModeResponse) singleFieldBuilderV3.getMessage();
                }
                ConnectionModeResponse connectionModeResponse = this.connectionModeResponse_;
                return connectionModeResponse == null ? ConnectionModeResponse.getDefaultInstance() : connectionModeResponse;
            }

            public ConnectionModeResponse.Builder getConnectionModeResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (ConnectionModeResponse.Builder) getConnectionModeResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectionManagement.ServiceOrBuilder
            public ConnectionModeResponseOrBuilder getConnectionModeResponseOrBuilder() {
                SingleFieldBuilderV3<ConnectionModeResponse, ConnectionModeResponse.Builder, ConnectionModeResponseOrBuilder> singleFieldBuilderV3 = this.connectionModeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectionModeResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConnectionModeResponse connectionModeResponse = this.connectionModeResponse_;
                return connectionModeResponse == null ? ConnectionModeResponse.getDefaultInstance() : connectionModeResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIConnectionManagement.internal_static_GDI_Proto_ConnectionManagement_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectionManagement.ServiceOrBuilder
            public boolean hasConnectionModeRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectionManagement.ServiceOrBuilder
            public boolean hasConnectionModeResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectionManagement.internal_static_GDI_Proto_ConnectionManagement_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeConnectionModeRequest(ConnectionModeRequest connectionModeRequest) {
                ConnectionModeRequest connectionModeRequest2;
                SingleFieldBuilderV3<ConnectionModeRequest, ConnectionModeRequest.Builder, ConnectionModeRequestOrBuilder> singleFieldBuilderV3 = this.connectionModeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(connectionModeRequest);
                } else if ((this.bitField0_ & 1) == 0 || (connectionModeRequest2 = this.connectionModeRequest_) == null || connectionModeRequest2 == ConnectionModeRequest.getDefaultInstance()) {
                    this.connectionModeRequest_ = connectionModeRequest;
                } else {
                    getConnectionModeRequestBuilder().mergeFrom(connectionModeRequest);
                }
                if (this.connectionModeRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConnectionModeResponse(ConnectionModeResponse connectionModeResponse) {
                ConnectionModeResponse connectionModeResponse2;
                SingleFieldBuilderV3<ConnectionModeResponse, ConnectionModeResponse.Builder, ConnectionModeResponseOrBuilder> singleFieldBuilderV3 = this.connectionModeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(connectionModeResponse);
                } else if ((this.bitField0_ & 2) == 0 || (connectionModeResponse2 = this.connectionModeResponse_) == null || connectionModeResponse2 == ConnectionModeResponse.getDefaultInstance()) {
                    this.connectionModeResponse_ = connectionModeResponse;
                } else {
                    getConnectionModeResponseBuilder().mergeFrom(connectionModeResponse);
                }
                if (this.connectionModeResponse_ != null) {
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
                                    codedInputStream.readMessage(getConnectionModeRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getConnectionModeResponseFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setConnectionModeRequest(ConnectionModeRequest.Builder builder) {
                SingleFieldBuilderV3<ConnectionModeRequest, ConnectionModeRequest.Builder, ConnectionModeRequestOrBuilder> singleFieldBuilderV3 = this.connectionModeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.connectionModeRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setConnectionModeResponse(ConnectionModeResponse.Builder builder) {
                SingleFieldBuilderV3<ConnectionModeResponse, ConnectionModeResponse.Builder, ConnectionModeResponseOrBuilder> singleFieldBuilderV3 = this.connectionModeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.connectionModeResponse_ = builder.build();
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

            public Builder setConnectionModeRequest(ConnectionModeRequest connectionModeRequest) {
                SingleFieldBuilderV3<ConnectionModeRequest, ConnectionModeRequest.Builder, ConnectionModeRequestOrBuilder> singleFieldBuilderV3 = this.connectionModeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    connectionModeRequest.getClass();
                    this.connectionModeRequest_ = connectionModeRequest;
                } else {
                    singleFieldBuilderV3.setMessage(connectionModeRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setConnectionModeResponse(ConnectionModeResponse connectionModeResponse) {
                SingleFieldBuilderV3<ConnectionModeResponse, ConnectionModeResponse.Builder, ConnectionModeResponseOrBuilder> singleFieldBuilderV3 = this.connectionModeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    connectionModeResponse.getClass();
                    this.connectionModeResponse_ = connectionModeResponse;
                } else {
                    singleFieldBuilderV3.setMessage(connectionModeResponse);
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
                if (service.hasConnectionModeRequest()) {
                    mergeConnectionModeRequest(service.getConnectionModeRequest());
                }
                if (service.hasConnectionModeResponse()) {
                    mergeConnectionModeResponse(service.getConnectionModeResponse());
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

    public enum SupportedConnectionTypes implements ProtocolMessageEnum {
        OFF(0),
        SECURE(1),
        OPEN(2);

        public static final int OFF_VALUE = 0;
        public static final int OPEN_VALUE = 2;
        public static final int SECURE_VALUE = 1;
        private final int value;
        private static final Internal.EnumLiteMap<SupportedConnectionTypes> internalValueMap = new Internal.EnumLiteMap<SupportedConnectionTypes>() { // from class: com.garmin.proto.generated.GDIConnectionManagement.SupportedConnectionTypes.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SupportedConnectionTypes findValueByNumber(int i14) {
                return SupportedConnectionTypes.forNumber(i14);
            }
        };
        private static final SupportedConnectionTypes[] VALUES = values();

        SupportedConnectionTypes(int i14) {
            this.value = i14;
        }

        public static SupportedConnectionTypes forNumber(int i14) {
            if (i14 == 0) {
                return OFF;
            }
            if (i14 == 1) {
                return SECURE;
            }
            if (i14 != 2) {
                return null;
            }
            return OPEN;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIConnectionManagement.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<SupportedConnectionTypes> internalGetValueMap() {
            return internalValueMap;
        }

        public static SupportedConnectionTypes valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static SupportedConnectionTypes valueOf(int i14) {
            return forNumber(i14);
        }
    }
}
