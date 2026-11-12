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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import i3.e5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class GDIGarminLink {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0013GDIGarminLink.proto\u0012\u0014GDI.Proto.GarminLink\u001a\rGDICore.proto\"\u0097\u0001\n\u0007Service\u0012D\n\u0013device_info_request\u0018\u0001 \u0001(\u000b2'.GDI.Proto.GarminLink.DeviceInfoRequest\u0012F\n\u0014device_info_response\u0018\u0002 \u0001(\u000b2(.GDI.Proto.GarminLink.DeviceInfoResponse\"«\u0001\n\u0013CapabilitiesRequest\u0012#\n\u001bauto_hr_broadcast_supported\u0018\u0001 \u0001(\b2o\n\u0010features_request\u0012*.GDI.Proto.Core.FeatureCapabilitiesRequest\u0018$ \u0001(\u000b2).GDI.Proto.GarminLink.CapabilitiesRequest\"µ\u0001\n\u0014CapabilitiesResponse\u0012)\n!garmin_link_sensor_type_preferred\u0018\u0001 \u0001(\b2r\n\u0011features_response\u0012+.GDI.Proto.Core.FeatureCapabilitiesResponse\u0018$ \u0001(\u000b2*.GDI.Proto.GarminLink.CapabilitiesResponse\"\u0013\n\u0011DeviceInfoRequest\"%\n\u0012DeviceInfoResponse\u0012\u000f\n\u0007unit_id\u0018\u0001 \u0001(\rB-\n\u001acom.garmin.proto.generatedB\rGDIGarminLinkH\u0003"}, new Descriptors.FileDescriptor[]{GDICore.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GarminLink_CapabilitiesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GarminLink_CapabilitiesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GarminLink_CapabilitiesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GarminLink_CapabilitiesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GarminLink_DeviceInfoRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GarminLink_DeviceInfoRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GarminLink_DeviceInfoResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GarminLink_DeviceInfoResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GarminLink_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GarminLink_Service_fieldAccessorTable;

    public interface CapabilitiesRequestOrBuilder extends MessageOrBuilder {
        boolean getAutoHrBroadcastSupported();

        boolean hasAutoHrBroadcastSupported();
    }

    public interface CapabilitiesResponseOrBuilder extends MessageOrBuilder {
        boolean getGarminLinkSensorTypePreferred();

        boolean hasGarminLinkSensorTypePreferred();
    }

    public interface DeviceInfoRequestOrBuilder extends MessageOrBuilder {
    }

    public interface DeviceInfoResponseOrBuilder extends MessageOrBuilder {
        int getUnitId();

        boolean hasUnitId();
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
        DeviceInfoRequest getDeviceInfoRequest();

        DeviceInfoRequestOrBuilder getDeviceInfoRequestOrBuilder();

        DeviceInfoResponse getDeviceInfoResponse();

        DeviceInfoResponseOrBuilder getDeviceInfoResponseOrBuilder();

        boolean hasDeviceInfoRequest();

        boolean hasDeviceInfoResponse();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_GarminLink_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_GarminLink_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"DeviceInfoRequest", "DeviceInfoResponse"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_GarminLink_CapabilitiesRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_GarminLink_CapabilitiesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"AutoHrBroadcastSupported"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_GarminLink_CapabilitiesResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_GarminLink_CapabilitiesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"GarminLinkSensorTypePreferred"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_GarminLink_DeviceInfoRequest_descriptor = descriptor5;
        internal_static_GDI_Proto_GarminLink_DeviceInfoRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[0]);
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_GarminLink_DeviceInfoResponse_descriptor = descriptor6;
        internal_static_GDI_Proto_GarminLink_DeviceInfoResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"UnitId"});
        GDICore.getDescriptor();
    }

    private GDIGarminLink() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(CapabilitiesRequest.featuresRequest);
        extensionRegistryLite.add(CapabilitiesResponse.featuresResponse);
    }

    public static final class CapabilitiesRequest extends GeneratedMessageV3 implements CapabilitiesRequestOrBuilder {
        public static final int AUTO_HR_BROADCAST_SUPPORTED_FIELD_NUMBER = 1;
        public static final int FEATURES_REQUEST_FIELD_NUMBER = 36;
        private static final long serialVersionUID = 0;
        private boolean autoHrBroadcastSupported_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private static final CapabilitiesRequest DEFAULT_INSTANCE = new CapabilitiesRequest();

        @Deprecated
        public static final Parser<CapabilitiesRequest> PARSER = new AbstractParser<CapabilitiesRequest>() { // from class: com.garmin.proto.generated.GDIGarminLink.CapabilitiesRequest.1
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
            this.autoHrBroadcastSupported_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGarminLink.internal_static_GDI_Proto_GarminLink_CapabilitiesRequest_descriptor;
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
            if (!(obj instanceof CapabilitiesRequest)) {
                return super.equals(obj);
            }
            CapabilitiesRequest capabilitiesRequest = (CapabilitiesRequest) obj;
            if (hasAutoHrBroadcastSupported() != capabilitiesRequest.hasAutoHrBroadcastSupported()) {
                return false;
            }
            return (!hasAutoHrBroadcastSupported() || getAutoHrBroadcastSupported() == capabilitiesRequest.getAutoHrBroadcastSupported()) && getUnknownFields().equals(capabilitiesRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIGarminLink.CapabilitiesRequestOrBuilder
        public boolean getAutoHrBroadcastSupported() {
            return this.autoHrBroadcastSupported_;
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
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.autoHrBroadcastSupported_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGarminLink.CapabilitiesRequestOrBuilder
        public boolean hasAutoHrBroadcastSupported() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasAutoHrBroadcastSupported()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getAutoHrBroadcastSupported());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGarminLink.internal_static_GDI_Proto_GarminLink_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.autoHrBroadcastSupported_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesRequestOrBuilder {
            private boolean autoHrBroadcastSupported_;
            private int bitField0_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(CapabilitiesRequest capabilitiesRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    capabilitiesRequest.autoHrBroadcastSupported_ = this.autoHrBroadcastSupported_;
                } else {
                    i14 = 0;
                }
                capabilitiesRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminLink.internal_static_GDI_Proto_GarminLink_CapabilitiesRequest_descriptor;
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
                if (this.bitField0_ != 0) {
                    buildPartial0(capabilitiesRequest);
                }
                onBuilt();
                return capabilitiesRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.autoHrBroadcastSupported_ = false;
                return this;
            }

            public Builder clearAutoHrBroadcastSupported() {
                this.bitField0_ &= -2;
                this.autoHrBroadcastSupported_ = false;
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

            @Override // com.garmin.proto.generated.GDIGarminLink.CapabilitiesRequestOrBuilder
            public boolean getAutoHrBroadcastSupported() {
                return this.autoHrBroadcastSupported_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIGarminLink.internal_static_GDI_Proto_GarminLink_CapabilitiesRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGarminLink.CapabilitiesRequestOrBuilder
            public boolean hasAutoHrBroadcastSupported() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminLink.internal_static_GDI_Proto_GarminLink_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
                                    this.autoHrBroadcastSupported_ = codedInputStream.readBool();
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

            public Builder setAutoHrBroadcastSupported(boolean z14) {
                this.autoHrBroadcastSupported_ = z14;
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
            public CapabilitiesRequest getDefaultInstanceForType() {
                return CapabilitiesRequest.getDefaultInstance();
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
                if (capabilitiesRequest.hasAutoHrBroadcastSupported()) {
                    setAutoHrBroadcastSupported(capabilitiesRequest.getAutoHrBroadcastSupported());
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

        public /* synthetic */ CapabilitiesRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CapabilitiesRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private CapabilitiesRequest() {
            this.autoHrBroadcastSupported_ = false;
            this.memoizedIsInitialized = (byte) -1;
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

    public static final class CapabilitiesResponse extends GeneratedMessageV3 implements CapabilitiesResponseOrBuilder {
        public static final int FEATURES_RESPONSE_FIELD_NUMBER = 36;
        public static final int GARMIN_LINK_SENSOR_TYPE_PREFERRED_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean garminLinkSensorTypePreferred_;
        private byte memoizedIsInitialized;
        private static final CapabilitiesResponse DEFAULT_INSTANCE = new CapabilitiesResponse();

        @Deprecated
        public static final Parser<CapabilitiesResponse> PARSER = new AbstractParser<CapabilitiesResponse>() { // from class: com.garmin.proto.generated.GDIGarminLink.CapabilitiesResponse.1
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
            this.garminLinkSensorTypePreferred_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGarminLink.internal_static_GDI_Proto_GarminLink_CapabilitiesResponse_descriptor;
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
            if (hasGarminLinkSensorTypePreferred() != capabilitiesResponse.hasGarminLinkSensorTypePreferred()) {
                return false;
            }
            return (!hasGarminLinkSensorTypePreferred() || getGarminLinkSensorTypePreferred() == capabilitiesResponse.getGarminLinkSensorTypePreferred()) && getUnknownFields().equals(capabilitiesResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIGarminLink.CapabilitiesResponseOrBuilder
        public boolean getGarminLinkSensorTypePreferred() {
            return this.garminLinkSensorTypePreferred_;
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
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.garminLinkSensorTypePreferred_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGarminLink.CapabilitiesResponseOrBuilder
        public boolean hasGarminLinkSensorTypePreferred() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasGarminLinkSensorTypePreferred()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getGarminLinkSensorTypePreferred());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGarminLink.internal_static_GDI_Proto_GarminLink_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
                codedOutputStream.writeBool(1, this.garminLinkSensorTypePreferred_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesResponseOrBuilder {
            private int bitField0_;
            private boolean garminLinkSensorTypePreferred_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(CapabilitiesResponse capabilitiesResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    capabilitiesResponse.garminLinkSensorTypePreferred_ = this.garminLinkSensorTypePreferred_;
                } else {
                    i14 = 0;
                }
                capabilitiesResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminLink.internal_static_GDI_Proto_GarminLink_CapabilitiesResponse_descriptor;
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
                this.garminLinkSensorTypePreferred_ = false;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGarminLinkSensorTypePreferred() {
                this.bitField0_ &= -2;
                this.garminLinkSensorTypePreferred_ = false;
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
                return GDIGarminLink.internal_static_GDI_Proto_GarminLink_CapabilitiesResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGarminLink.CapabilitiesResponseOrBuilder
            public boolean getGarminLinkSensorTypePreferred() {
                return this.garminLinkSensorTypePreferred_;
            }

            @Override // com.garmin.proto.generated.GDIGarminLink.CapabilitiesResponseOrBuilder
            public boolean hasGarminLinkSensorTypePreferred() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminLink.internal_static_GDI_Proto_GarminLink_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
                                    this.garminLinkSensorTypePreferred_ = codedInputStream.readBool();
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

            public Builder setGarminLinkSensorTypePreferred(boolean z14) {
                this.garminLinkSensorTypePreferred_ = z14;
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
            public CapabilitiesResponse getDefaultInstanceForType() {
                return CapabilitiesResponse.getDefaultInstance();
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
                if (capabilitiesResponse.hasGarminLinkSensorTypePreferred()) {
                    setGarminLinkSensorTypePreferred(capabilitiesResponse.getGarminLinkSensorTypePreferred());
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

        public /* synthetic */ CapabilitiesResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CapabilitiesResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private CapabilitiesResponse() {
            this.garminLinkSensorTypePreferred_ = false;
            this.memoizedIsInitialized = (byte) -1;
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

    public static final class DeviceInfoRequest extends GeneratedMessageV3 implements DeviceInfoRequestOrBuilder {
        private static final DeviceInfoRequest DEFAULT_INSTANCE = new DeviceInfoRequest();

        @Deprecated
        public static final Parser<DeviceInfoRequest> PARSER = new AbstractParser<DeviceInfoRequest>() { // from class: com.garmin.proto.generated.GDIGarminLink.DeviceInfoRequest.1
            @Override // com.google.protobuf.Parser
            public DeviceInfoRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DeviceInfoRequest.newBuilder();
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
        private byte memoizedIsInitialized;

        private DeviceInfoRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DeviceInfoRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGarminLink.internal_static_GDI_Proto_GarminLink_DeviceInfoRequest_descriptor;
        }

        public static Builder newBuilder(DeviceInfoRequest deviceInfoRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(deviceInfoRequest);
        }

        public static DeviceInfoRequest parseDelimitedFrom(InputStream inputStream) {
            return (DeviceInfoRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DeviceInfoRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DeviceInfoRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof DeviceInfoRequest) {
                return getUnknownFields().equals(((DeviceInfoRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DeviceInfoRequest> getParserForType() {
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
            return GDIGarminLink.internal_static_GDI_Proto_GarminLink_DeviceInfoRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(DeviceInfoRequest.class, Builder.class);
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
            return new DeviceInfoRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DeviceInfoRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminLink.internal_static_GDI_Proto_GarminLink_DeviceInfoRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeviceInfoRequest build() {
                DeviceInfoRequest deviceInfoRequestBuildPartial = buildPartial();
                if (deviceInfoRequestBuildPartial.isInitialized()) {
                    return deviceInfoRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) deviceInfoRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeviceInfoRequest buildPartial() {
                DeviceInfoRequest deviceInfoRequest = new DeviceInfoRequest(this);
                onBuilt();
                return deviceInfoRequest;
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
                return GDIGarminLink.internal_static_GDI_Proto_GarminLink_DeviceInfoRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminLink.internal_static_GDI_Proto_GarminLink_DeviceInfoRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(DeviceInfoRequest.class, Builder.class);
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
            public DeviceInfoRequest getDefaultInstanceForType() {
                return DeviceInfoRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DeviceInfoRequest) {
                    return mergeFrom((DeviceInfoRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DeviceInfoRequest deviceInfoRequest) {
                if (deviceInfoRequest == DeviceInfoRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(deviceInfoRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DeviceInfoRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ DeviceInfoRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private DeviceInfoRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DeviceInfoRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceInfoRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeviceInfoRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DeviceInfoRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DeviceInfoRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DeviceInfoRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DeviceInfoRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DeviceInfoRequest parseFrom(InputStream inputStream) {
            return (DeviceInfoRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DeviceInfoRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceInfoRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeviceInfoRequest parseFrom(CodedInputStream codedInputStream) {
            return (DeviceInfoRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DeviceInfoRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceInfoRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DeviceInfoResponse extends GeneratedMessageV3 implements DeviceInfoResponseOrBuilder {
        private static final DeviceInfoResponse DEFAULT_INSTANCE = new DeviceInfoResponse();

        @Deprecated
        public static final Parser<DeviceInfoResponse> PARSER = new AbstractParser<DeviceInfoResponse>() { // from class: com.garmin.proto.generated.GDIGarminLink.DeviceInfoResponse.1
            @Override // com.google.protobuf.Parser
            public DeviceInfoResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DeviceInfoResponse.newBuilder();
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
        public static final int UNIT_ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int unitId_;

        private DeviceInfoResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.unitId_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DeviceInfoResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGarminLink.internal_static_GDI_Proto_GarminLink_DeviceInfoResponse_descriptor;
        }

        public static Builder newBuilder(DeviceInfoResponse deviceInfoResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(deviceInfoResponse);
        }

        public static DeviceInfoResponse parseDelimitedFrom(InputStream inputStream) {
            return (DeviceInfoResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DeviceInfoResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DeviceInfoResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeviceInfoResponse)) {
                return super.equals(obj);
            }
            DeviceInfoResponse deviceInfoResponse = (DeviceInfoResponse) obj;
            if (hasUnitId() != deviceInfoResponse.hasUnitId()) {
                return false;
            }
            return (!hasUnitId() || getUnitId() == deviceInfoResponse.getUnitId()) && getUnknownFields().equals(deviceInfoResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DeviceInfoResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.unitId_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGarminLink.DeviceInfoResponseOrBuilder
        public int getUnitId() {
            return this.unitId_;
        }

        @Override // com.garmin.proto.generated.GDIGarminLink.DeviceInfoResponseOrBuilder
        public boolean hasUnitId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasUnitId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getUnitId();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGarminLink.internal_static_GDI_Proto_GarminLink_DeviceInfoResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(DeviceInfoResponse.class, Builder.class);
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
            return new DeviceInfoResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.unitId_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DeviceInfoResponseOrBuilder {
            private int bitField0_;
            private int unitId_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(DeviceInfoResponse deviceInfoResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    deviceInfoResponse.unitId_ = this.unitId_;
                } else {
                    i14 = 0;
                }
                deviceInfoResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminLink.internal_static_GDI_Proto_GarminLink_DeviceInfoResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeviceInfoResponse build() {
                DeviceInfoResponse deviceInfoResponseBuildPartial = buildPartial();
                if (deviceInfoResponseBuildPartial.isInitialized()) {
                    return deviceInfoResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) deviceInfoResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeviceInfoResponse buildPartial() {
                DeviceInfoResponse deviceInfoResponse = new DeviceInfoResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(deviceInfoResponse);
                }
                onBuilt();
                return deviceInfoResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.unitId_ = 0;
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

            public Builder clearUnitId() {
                this.bitField0_ &= -2;
                this.unitId_ = 0;
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
                return GDIGarminLink.internal_static_GDI_Proto_GarminLink_DeviceInfoResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGarminLink.DeviceInfoResponseOrBuilder
            public int getUnitId() {
                return this.unitId_;
            }

            @Override // com.garmin.proto.generated.GDIGarminLink.DeviceInfoResponseOrBuilder
            public boolean hasUnitId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminLink.internal_static_GDI_Proto_GarminLink_DeviceInfoResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(DeviceInfoResponse.class, Builder.class);
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
                                    this.unitId_ = codedInputStream.readUInt32();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setUnitId(int i14) {
                this.unitId_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
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
            public DeviceInfoResponse getDefaultInstanceForType() {
                return DeviceInfoResponse.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DeviceInfoResponse) {
                    return mergeFrom((DeviceInfoResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DeviceInfoResponse deviceInfoResponse) {
                if (deviceInfoResponse == DeviceInfoResponse.getDefaultInstance()) {
                    return this;
                }
                if (deviceInfoResponse.hasUnitId()) {
                    setUnitId(deviceInfoResponse.getUnitId());
                }
                mergeUnknownFields(deviceInfoResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DeviceInfoResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DeviceInfoResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceInfoResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeviceInfoResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ DeviceInfoResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DeviceInfoResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private DeviceInfoResponse() {
            this.unitId_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DeviceInfoResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DeviceInfoResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DeviceInfoResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DeviceInfoResponse parseFrom(InputStream inputStream) {
            return (DeviceInfoResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DeviceInfoResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceInfoResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeviceInfoResponse parseFrom(CodedInputStream codedInputStream) {
            return (DeviceInfoResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DeviceInfoResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceInfoResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        public static final int DEVICE_INFO_REQUEST_FIELD_NUMBER = 1;
        public static final int DEVICE_INFO_RESPONSE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private DeviceInfoRequest deviceInfoRequest_;
        private DeviceInfoResponse deviceInfoResponse_;
        private byte memoizedIsInitialized;
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDIGarminLink.Service.1
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
            return GDIGarminLink.internal_static_GDI_Proto_GarminLink_Service_descriptor;
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
            if (hasDeviceInfoRequest() != service.hasDeviceInfoRequest()) {
                return false;
            }
            if ((!hasDeviceInfoRequest() || getDeviceInfoRequest().equals(service.getDeviceInfoRequest())) && hasDeviceInfoResponse() == service.hasDeviceInfoResponse()) {
                return (!hasDeviceInfoResponse() || getDeviceInfoResponse().equals(service.getDeviceInfoResponse())) && getUnknownFields().equals(service.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIGarminLink.ServiceOrBuilder
        public DeviceInfoRequest getDeviceInfoRequest() {
            DeviceInfoRequest deviceInfoRequest = this.deviceInfoRequest_;
            return deviceInfoRequest == null ? DeviceInfoRequest.getDefaultInstance() : deviceInfoRequest;
        }

        @Override // com.garmin.proto.generated.GDIGarminLink.ServiceOrBuilder
        public DeviceInfoRequestOrBuilder getDeviceInfoRequestOrBuilder() {
            DeviceInfoRequest deviceInfoRequest = this.deviceInfoRequest_;
            return deviceInfoRequest == null ? DeviceInfoRequest.getDefaultInstance() : deviceInfoRequest;
        }

        @Override // com.garmin.proto.generated.GDIGarminLink.ServiceOrBuilder
        public DeviceInfoResponse getDeviceInfoResponse() {
            DeviceInfoResponse deviceInfoResponse = this.deviceInfoResponse_;
            return deviceInfoResponse == null ? DeviceInfoResponse.getDefaultInstance() : deviceInfoResponse;
        }

        @Override // com.garmin.proto.generated.GDIGarminLink.ServiceOrBuilder
        public DeviceInfoResponseOrBuilder getDeviceInfoResponseOrBuilder() {
            DeviceInfoResponse deviceInfoResponse = this.deviceInfoResponse_;
            return deviceInfoResponse == null ? DeviceInfoResponse.getDefaultInstance() : deviceInfoResponse;
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
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getDeviceInfoRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getDeviceInfoResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGarminLink.ServiceOrBuilder
        public boolean hasDeviceInfoRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminLink.ServiceOrBuilder
        public boolean hasDeviceInfoResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasDeviceInfoRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getDeviceInfoRequest().hashCode();
            }
            if (hasDeviceInfoResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getDeviceInfoResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGarminLink.internal_static_GDI_Proto_GarminLink_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getDeviceInfoRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getDeviceInfoResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<DeviceInfoRequest, DeviceInfoRequest.Builder, DeviceInfoRequestOrBuilder> deviceInfoRequestBuilder_;
            private DeviceInfoRequest deviceInfoRequest_;
            private SingleFieldBuilderV3<DeviceInfoResponse, DeviceInfoResponse.Builder, DeviceInfoResponseOrBuilder> deviceInfoResponseBuilder_;
            private DeviceInfoResponse deviceInfoResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Service service) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<DeviceInfoRequest, DeviceInfoRequest.Builder, DeviceInfoRequestOrBuilder> singleFieldBuilderV3 = this.deviceInfoRequestBuilder_;
                    service.deviceInfoRequest_ = singleFieldBuilderV3 == null ? this.deviceInfoRequest_ : (DeviceInfoRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<DeviceInfoResponse, DeviceInfoResponse.Builder, DeviceInfoResponseOrBuilder> singleFieldBuilderV4 = this.deviceInfoResponseBuilder_;
                    service.deviceInfoResponse_ = singleFieldBuilderV4 == null ? this.deviceInfoResponse_ : (DeviceInfoResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                service.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminLink.internal_static_GDI_Proto_GarminLink_Service_descriptor;
            }

            private SingleFieldBuilderV3<DeviceInfoRequest, DeviceInfoRequest.Builder, DeviceInfoRequestOrBuilder> getDeviceInfoRequestFieldBuilder() {
                if (this.deviceInfoRequestBuilder_ == null) {
                    this.deviceInfoRequestBuilder_ = new SingleFieldBuilderV3<>(getDeviceInfoRequest(), getParentForChildren(), isClean());
                    this.deviceInfoRequest_ = null;
                }
                return this.deviceInfoRequestBuilder_;
            }

            private SingleFieldBuilderV3<DeviceInfoResponse, DeviceInfoResponse.Builder, DeviceInfoResponseOrBuilder> getDeviceInfoResponseFieldBuilder() {
                if (this.deviceInfoResponseBuilder_ == null) {
                    this.deviceInfoResponseBuilder_ = new SingleFieldBuilderV3<>(getDeviceInfoResponse(), getParentForChildren(), isClean());
                    this.deviceInfoResponse_ = null;
                }
                return this.deviceInfoResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getDeviceInfoRequestFieldBuilder();
                    getDeviceInfoResponseFieldBuilder();
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
                this.deviceInfoRequest_ = null;
                SingleFieldBuilderV3<DeviceInfoRequest, DeviceInfoRequest.Builder, DeviceInfoRequestOrBuilder> singleFieldBuilderV3 = this.deviceInfoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.deviceInfoRequestBuilder_ = null;
                }
                this.deviceInfoResponse_ = null;
                SingleFieldBuilderV3<DeviceInfoResponse, DeviceInfoResponse.Builder, DeviceInfoResponseOrBuilder> singleFieldBuilderV4 = this.deviceInfoResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.deviceInfoResponseBuilder_ = null;
                }
                return this;
            }

            public Builder clearDeviceInfoRequest() {
                this.bitField0_ &= -2;
                this.deviceInfoRequest_ = null;
                SingleFieldBuilderV3<DeviceInfoRequest, DeviceInfoRequest.Builder, DeviceInfoRequestOrBuilder> singleFieldBuilderV3 = this.deviceInfoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.deviceInfoRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearDeviceInfoResponse() {
                this.bitField0_ &= -3;
                this.deviceInfoResponse_ = null;
                SingleFieldBuilderV3<DeviceInfoResponse, DeviceInfoResponse.Builder, DeviceInfoResponseOrBuilder> singleFieldBuilderV3 = this.deviceInfoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.deviceInfoResponseBuilder_ = null;
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
                return GDIGarminLink.internal_static_GDI_Proto_GarminLink_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGarminLink.ServiceOrBuilder
            public DeviceInfoRequest getDeviceInfoRequest() {
                SingleFieldBuilderV3<DeviceInfoRequest, DeviceInfoRequest.Builder, DeviceInfoRequestOrBuilder> singleFieldBuilderV3 = this.deviceInfoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeviceInfoRequest) singleFieldBuilderV3.getMessage();
                }
                DeviceInfoRequest deviceInfoRequest = this.deviceInfoRequest_;
                return deviceInfoRequest == null ? DeviceInfoRequest.getDefaultInstance() : deviceInfoRequest;
            }

            public DeviceInfoRequest.Builder getDeviceInfoRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (DeviceInfoRequest.Builder) getDeviceInfoRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGarminLink.ServiceOrBuilder
            public DeviceInfoRequestOrBuilder getDeviceInfoRequestOrBuilder() {
                SingleFieldBuilderV3<DeviceInfoRequest, DeviceInfoRequest.Builder, DeviceInfoRequestOrBuilder> singleFieldBuilderV3 = this.deviceInfoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeviceInfoRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DeviceInfoRequest deviceInfoRequest = this.deviceInfoRequest_;
                return deviceInfoRequest == null ? DeviceInfoRequest.getDefaultInstance() : deviceInfoRequest;
            }

            @Override // com.garmin.proto.generated.GDIGarminLink.ServiceOrBuilder
            public DeviceInfoResponse getDeviceInfoResponse() {
                SingleFieldBuilderV3<DeviceInfoResponse, DeviceInfoResponse.Builder, DeviceInfoResponseOrBuilder> singleFieldBuilderV3 = this.deviceInfoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeviceInfoResponse) singleFieldBuilderV3.getMessage();
                }
                DeviceInfoResponse deviceInfoResponse = this.deviceInfoResponse_;
                return deviceInfoResponse == null ? DeviceInfoResponse.getDefaultInstance() : deviceInfoResponse;
            }

            public DeviceInfoResponse.Builder getDeviceInfoResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (DeviceInfoResponse.Builder) getDeviceInfoResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGarminLink.ServiceOrBuilder
            public DeviceInfoResponseOrBuilder getDeviceInfoResponseOrBuilder() {
                SingleFieldBuilderV3<DeviceInfoResponse, DeviceInfoResponse.Builder, DeviceInfoResponseOrBuilder> singleFieldBuilderV3 = this.deviceInfoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeviceInfoResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DeviceInfoResponse deviceInfoResponse = this.deviceInfoResponse_;
                return deviceInfoResponse == null ? DeviceInfoResponse.getDefaultInstance() : deviceInfoResponse;
            }

            @Override // com.garmin.proto.generated.GDIGarminLink.ServiceOrBuilder
            public boolean hasDeviceInfoRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminLink.ServiceOrBuilder
            public boolean hasDeviceInfoResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminLink.internal_static_GDI_Proto_GarminLink_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeDeviceInfoRequest(DeviceInfoRequest deviceInfoRequest) {
                DeviceInfoRequest deviceInfoRequest2;
                SingleFieldBuilderV3<DeviceInfoRequest, DeviceInfoRequest.Builder, DeviceInfoRequestOrBuilder> singleFieldBuilderV3 = this.deviceInfoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(deviceInfoRequest);
                } else if ((this.bitField0_ & 1) == 0 || (deviceInfoRequest2 = this.deviceInfoRequest_) == null || deviceInfoRequest2 == DeviceInfoRequest.getDefaultInstance()) {
                    this.deviceInfoRequest_ = deviceInfoRequest;
                } else {
                    getDeviceInfoRequestBuilder().mergeFrom(deviceInfoRequest);
                }
                if (this.deviceInfoRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeDeviceInfoResponse(DeviceInfoResponse deviceInfoResponse) {
                DeviceInfoResponse deviceInfoResponse2;
                SingleFieldBuilderV3<DeviceInfoResponse, DeviceInfoResponse.Builder, DeviceInfoResponseOrBuilder> singleFieldBuilderV3 = this.deviceInfoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(deviceInfoResponse);
                } else if ((this.bitField0_ & 2) == 0 || (deviceInfoResponse2 = this.deviceInfoResponse_) == null || deviceInfoResponse2 == DeviceInfoResponse.getDefaultInstance()) {
                    this.deviceInfoResponse_ = deviceInfoResponse;
                } else {
                    getDeviceInfoResponseBuilder().mergeFrom(deviceInfoResponse);
                }
                if (this.deviceInfoResponse_ != null) {
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
                                    codedInputStream.readMessage(getDeviceInfoRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getDeviceInfoResponseFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setDeviceInfoRequest(DeviceInfoRequest.Builder builder) {
                SingleFieldBuilderV3<DeviceInfoRequest, DeviceInfoRequest.Builder, DeviceInfoRequestOrBuilder> singleFieldBuilderV3 = this.deviceInfoRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.deviceInfoRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setDeviceInfoResponse(DeviceInfoResponse.Builder builder) {
                SingleFieldBuilderV3<DeviceInfoResponse, DeviceInfoResponse.Builder, DeviceInfoResponseOrBuilder> singleFieldBuilderV3 = this.deviceInfoResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.deviceInfoResponse_ = builder.build();
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

            public Builder setDeviceInfoRequest(DeviceInfoRequest deviceInfoRequest) {
                SingleFieldBuilderV3<DeviceInfoRequest, DeviceInfoRequest.Builder, DeviceInfoRequestOrBuilder> singleFieldBuilderV3 = this.deviceInfoRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    deviceInfoRequest.getClass();
                    this.deviceInfoRequest_ = deviceInfoRequest;
                } else {
                    singleFieldBuilderV3.setMessage(deviceInfoRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setDeviceInfoResponse(DeviceInfoResponse deviceInfoResponse) {
                SingleFieldBuilderV3<DeviceInfoResponse, DeviceInfoResponse.Builder, DeviceInfoResponseOrBuilder> singleFieldBuilderV3 = this.deviceInfoResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    deviceInfoResponse.getClass();
                    this.deviceInfoResponse_ = deviceInfoResponse;
                } else {
                    singleFieldBuilderV3.setMessage(deviceInfoResponse);
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
                if (service.hasDeviceInfoRequest()) {
                    mergeDeviceInfoRequest(service.getDeviceInfoRequest());
                }
                if (service.hasDeviceInfoResponse()) {
                    mergeDeviceInfoResponse(service.getDeviceInfoResponse());
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
