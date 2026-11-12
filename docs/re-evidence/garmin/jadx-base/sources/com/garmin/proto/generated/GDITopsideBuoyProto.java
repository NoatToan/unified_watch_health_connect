package com.garmin.proto.generated;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
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

/* JADX INFO: loaded from: classes13.dex */
public final class GDITopsideBuoyProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0014GDITopsideBuoy.proto\u0012\u0015GDI.Proto.TopsideBuoy\"k\n\u0007Service\u0012`\n!wifi_connection_data_notification\u0018\u0001 \u0001(\u000b25.GDI.Proto.TopsideBuoy.WifiConnectionDataNotification\"U\n\u0012WifiConnectionData\u0012\f\n\u0004ssid\u0018\u0001 \u0001(\t\u0012\u0010\n\bpassword\u0018\u0002 \u0001(\f\u0012\u000f\n\u0007mac_adr\u0018\u0003 \u0001(\f\u0012\u000e\n\u0006ant_id\u0018\u0004 \u0001(\r\"i\n\u001eWifiConnectionDataNotification\u0012G\n\u0014wifi_connection_data\u0018\u0001 \u0001(\u000b2).GDI.Proto.TopsideBuoy.WifiConnectionDataB3\n\u001acom.garmin.proto.generatedB\u0013GDITopsideBuoyProtoH\u0003"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor internal_static_GDI_Proto_TopsideBuoy_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_TopsideBuoy_Service_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_TopsideBuoy_WifiConnectionDataNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_TopsideBuoy_WifiConnectionDataNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_TopsideBuoy_WifiConnectionData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_TopsideBuoy_WifiConnectionData_fieldAccessorTable;

    public interface ServiceOrBuilder extends MessageOrBuilder {
        WifiConnectionDataNotification getWifiConnectionDataNotification();

        WifiConnectionDataNotificationOrBuilder getWifiConnectionDataNotificationOrBuilder();

        boolean hasWifiConnectionDataNotification();
    }

    public interface WifiConnectionDataNotificationOrBuilder extends MessageOrBuilder {
        WifiConnectionData getWifiConnectionData();

        WifiConnectionDataOrBuilder getWifiConnectionDataOrBuilder();

        boolean hasWifiConnectionData();
    }

    public interface WifiConnectionDataOrBuilder extends MessageOrBuilder {
        int getAntId();

        ByteString getMacAdr();

        ByteString getPassword();

        String getSsid();

        ByteString getSsidBytes();

        boolean hasAntId();

        boolean hasMacAdr();

        boolean hasPassword();

        boolean hasSsid();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_TopsideBuoy_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_TopsideBuoy_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"WifiConnectionDataNotification"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_TopsideBuoy_WifiConnectionData_descriptor = descriptor3;
        internal_static_GDI_Proto_TopsideBuoy_WifiConnectionData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Ssid", "Password", "MacAdr", "AntId"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_TopsideBuoy_WifiConnectionDataNotification_descriptor = descriptor4;
        internal_static_GDI_Proto_TopsideBuoy_WifiConnectionDataNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"WifiConnectionData"});
    }

    private GDITopsideBuoyProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDITopsideBuoyProto.Service.1
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
        public static final int WIFI_CONNECTION_DATA_NOTIFICATION_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private WifiConnectionDataNotification wifiConnectionDataNotification_;

        private Service(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Service getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDITopsideBuoyProto.internal_static_GDI_Proto_TopsideBuoy_Service_descriptor;
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
            if (hasWifiConnectionDataNotification() != service.hasWifiConnectionDataNotification()) {
                return false;
            }
            return (!hasWifiConnectionDataNotification() || getWifiConnectionDataNotification().equals(service.getWifiConnectionDataNotification())) && getUnknownFields().equals(service.getUnknownFields());
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
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getWifiConnectionDataNotification()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDITopsideBuoyProto.ServiceOrBuilder
        public WifiConnectionDataNotification getWifiConnectionDataNotification() {
            WifiConnectionDataNotification wifiConnectionDataNotification = this.wifiConnectionDataNotification_;
            return wifiConnectionDataNotification == null ? WifiConnectionDataNotification.getDefaultInstance() : wifiConnectionDataNotification;
        }

        @Override // com.garmin.proto.generated.GDITopsideBuoyProto.ServiceOrBuilder
        public WifiConnectionDataNotificationOrBuilder getWifiConnectionDataNotificationOrBuilder() {
            WifiConnectionDataNotification wifiConnectionDataNotification = this.wifiConnectionDataNotification_;
            return wifiConnectionDataNotification == null ? WifiConnectionDataNotification.getDefaultInstance() : wifiConnectionDataNotification;
        }

        @Override // com.garmin.proto.generated.GDITopsideBuoyProto.ServiceOrBuilder
        public boolean hasWifiConnectionDataNotification() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasWifiConnectionDataNotification()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getWifiConnectionDataNotification().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDITopsideBuoyProto.internal_static_GDI_Proto_TopsideBuoy_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getWifiConnectionDataNotification());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<WifiConnectionDataNotification, WifiConnectionDataNotification.Builder, WifiConnectionDataNotificationOrBuilder> wifiConnectionDataNotificationBuilder_;
            private WifiConnectionDataNotification wifiConnectionDataNotification_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Service service) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<WifiConnectionDataNotification, WifiConnectionDataNotification.Builder, WifiConnectionDataNotificationOrBuilder> singleFieldBuilderV3 = this.wifiConnectionDataNotificationBuilder_;
                    service.wifiConnectionDataNotification_ = singleFieldBuilderV3 == null ? this.wifiConnectionDataNotification_ : (WifiConnectionDataNotification) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                service.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDITopsideBuoyProto.internal_static_GDI_Proto_TopsideBuoy_Service_descriptor;
            }

            private SingleFieldBuilderV3<WifiConnectionDataNotification, WifiConnectionDataNotification.Builder, WifiConnectionDataNotificationOrBuilder> getWifiConnectionDataNotificationFieldBuilder() {
                if (this.wifiConnectionDataNotificationBuilder_ == null) {
                    this.wifiConnectionDataNotificationBuilder_ = new SingleFieldBuilderV3<>(getWifiConnectionDataNotification(), getParentForChildren(), isClean());
                    this.wifiConnectionDataNotification_ = null;
                }
                return this.wifiConnectionDataNotificationBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getWifiConnectionDataNotificationFieldBuilder();
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
                this.wifiConnectionDataNotification_ = null;
                SingleFieldBuilderV3<WifiConnectionDataNotification, WifiConnectionDataNotification.Builder, WifiConnectionDataNotificationOrBuilder> singleFieldBuilderV3 = this.wifiConnectionDataNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.wifiConnectionDataNotificationBuilder_ = null;
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

            public Builder clearWifiConnectionDataNotification() {
                this.bitField0_ &= -2;
                this.wifiConnectionDataNotification_ = null;
                SingleFieldBuilderV3<WifiConnectionDataNotification, WifiConnectionDataNotification.Builder, WifiConnectionDataNotificationOrBuilder> singleFieldBuilderV3 = this.wifiConnectionDataNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.wifiConnectionDataNotificationBuilder_ = null;
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
                return GDITopsideBuoyProto.internal_static_GDI_Proto_TopsideBuoy_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.GDITopsideBuoyProto.ServiceOrBuilder
            public WifiConnectionDataNotification getWifiConnectionDataNotification() {
                SingleFieldBuilderV3<WifiConnectionDataNotification, WifiConnectionDataNotification.Builder, WifiConnectionDataNotificationOrBuilder> singleFieldBuilderV3 = this.wifiConnectionDataNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WifiConnectionDataNotification) singleFieldBuilderV3.getMessage();
                }
                WifiConnectionDataNotification wifiConnectionDataNotification = this.wifiConnectionDataNotification_;
                return wifiConnectionDataNotification == null ? WifiConnectionDataNotification.getDefaultInstance() : wifiConnectionDataNotification;
            }

            public WifiConnectionDataNotification.Builder getWifiConnectionDataNotificationBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (WifiConnectionDataNotification.Builder) getWifiConnectionDataNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDITopsideBuoyProto.ServiceOrBuilder
            public WifiConnectionDataNotificationOrBuilder getWifiConnectionDataNotificationOrBuilder() {
                SingleFieldBuilderV3<WifiConnectionDataNotification, WifiConnectionDataNotification.Builder, WifiConnectionDataNotificationOrBuilder> singleFieldBuilderV3 = this.wifiConnectionDataNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WifiConnectionDataNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                WifiConnectionDataNotification wifiConnectionDataNotification = this.wifiConnectionDataNotification_;
                return wifiConnectionDataNotification == null ? WifiConnectionDataNotification.getDefaultInstance() : wifiConnectionDataNotification;
            }

            @Override // com.garmin.proto.generated.GDITopsideBuoyProto.ServiceOrBuilder
            public boolean hasWifiConnectionDataNotification() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDITopsideBuoyProto.internal_static_GDI_Proto_TopsideBuoy_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
                                    codedInputStream.readMessage(getWifiConnectionDataNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeWifiConnectionDataNotification(WifiConnectionDataNotification wifiConnectionDataNotification) {
                WifiConnectionDataNotification wifiConnectionDataNotification2;
                SingleFieldBuilderV3<WifiConnectionDataNotification, WifiConnectionDataNotification.Builder, WifiConnectionDataNotificationOrBuilder> singleFieldBuilderV3 = this.wifiConnectionDataNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(wifiConnectionDataNotification);
                } else if ((this.bitField0_ & 1) == 0 || (wifiConnectionDataNotification2 = this.wifiConnectionDataNotification_) == null || wifiConnectionDataNotification2 == WifiConnectionDataNotification.getDefaultInstance()) {
                    this.wifiConnectionDataNotification_ = wifiConnectionDataNotification;
                } else {
                    getWifiConnectionDataNotificationBuilder().mergeFrom(wifiConnectionDataNotification);
                }
                if (this.wifiConnectionDataNotification_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
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

            public Builder setWifiConnectionDataNotification(WifiConnectionDataNotification.Builder builder) {
                SingleFieldBuilderV3<WifiConnectionDataNotification, WifiConnectionDataNotification.Builder, WifiConnectionDataNotificationOrBuilder> singleFieldBuilderV3 = this.wifiConnectionDataNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.wifiConnectionDataNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
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

            public Builder setWifiConnectionDataNotification(WifiConnectionDataNotification wifiConnectionDataNotification) {
                SingleFieldBuilderV3<WifiConnectionDataNotification, WifiConnectionDataNotification.Builder, WifiConnectionDataNotificationOrBuilder> singleFieldBuilderV3 = this.wifiConnectionDataNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    wifiConnectionDataNotification.getClass();
                    this.wifiConnectionDataNotification_ = wifiConnectionDataNotification;
                } else {
                    singleFieldBuilderV3.setMessage(wifiConnectionDataNotification);
                }
                this.bitField0_ |= 1;
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
                if (service.hasWifiConnectionDataNotification()) {
                    mergeWifiConnectionDataNotification(service.getWifiConnectionDataNotification());
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

    public static final class WifiConnectionData extends GeneratedMessageV3 implements WifiConnectionDataOrBuilder {
        public static final int ANT_ID_FIELD_NUMBER = 4;
        public static final int MAC_ADR_FIELD_NUMBER = 3;
        public static final int PASSWORD_FIELD_NUMBER = 2;
        public static final int SSID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int antId_;
        private int bitField0_;
        private ByteString macAdr_;
        private byte memoizedIsInitialized;
        private ByteString password_;
        private volatile Object ssid_;
        private static final WifiConnectionData DEFAULT_INSTANCE = new WifiConnectionData();

        @Deprecated
        public static final Parser<WifiConnectionData> PARSER = new AbstractParser<WifiConnectionData>() { // from class: com.garmin.proto.generated.GDITopsideBuoyProto.WifiConnectionData.1
            @Override // com.google.protobuf.Parser
            public WifiConnectionData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = WifiConnectionData.newBuilder();
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

        private WifiConnectionData() {
            this.ssid_ = "";
            ByteString byteString = ByteString.EMPTY;
            this.password_ = byteString;
            this.macAdr_ = byteString;
            this.antId_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.ssid_ = "";
            this.password_ = byteString;
            this.macAdr_ = byteString;
        }

        public static WifiConnectionData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDITopsideBuoyProto.internal_static_GDI_Proto_TopsideBuoy_WifiConnectionData_descriptor;
        }

        public static Builder newBuilder(WifiConnectionData wifiConnectionData) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(wifiConnectionData);
        }

        public static WifiConnectionData parseDelimitedFrom(InputStream inputStream) {
            return (WifiConnectionData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static WifiConnectionData parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<WifiConnectionData> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WifiConnectionData)) {
                return super.equals(obj);
            }
            WifiConnectionData wifiConnectionData = (WifiConnectionData) obj;
            if (hasSsid() != wifiConnectionData.hasSsid()) {
                return false;
            }
            if ((hasSsid() && !getSsid().equals(wifiConnectionData.getSsid())) || hasPassword() != wifiConnectionData.hasPassword()) {
                return false;
            }
            if ((hasPassword() && !getPassword().equals(wifiConnectionData.getPassword())) || hasMacAdr() != wifiConnectionData.hasMacAdr()) {
                return false;
            }
            if ((!hasMacAdr() || getMacAdr().equals(wifiConnectionData.getMacAdr())) && hasAntId() == wifiConnectionData.hasAntId()) {
                return (!hasAntId() || getAntId() == wifiConnectionData.getAntId()) && getUnknownFields().equals(wifiConnectionData.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDITopsideBuoyProto.WifiConnectionDataOrBuilder
        public int getAntId() {
            return this.antId_;
        }

        @Override // com.garmin.proto.generated.GDITopsideBuoyProto.WifiConnectionDataOrBuilder
        public ByteString getMacAdr() {
            return this.macAdr_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<WifiConnectionData> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDITopsideBuoyProto.WifiConnectionDataOrBuilder
        public ByteString getPassword() {
            return this.password_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.ssid_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeBytesSize(2, this.password_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.computeBytesSize(3, this.macAdr_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(4, this.antId_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDITopsideBuoyProto.WifiConnectionDataOrBuilder
        public String getSsid() {
            Object obj = this.ssid_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.ssid_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDITopsideBuoyProto.WifiConnectionDataOrBuilder
        public ByteString getSsidBytes() {
            Object obj = this.ssid_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.ssid_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDITopsideBuoyProto.WifiConnectionDataOrBuilder
        public boolean hasAntId() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDITopsideBuoyProto.WifiConnectionDataOrBuilder
        public boolean hasMacAdr() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDITopsideBuoyProto.WifiConnectionDataOrBuilder
        public boolean hasPassword() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDITopsideBuoyProto.WifiConnectionDataOrBuilder
        public boolean hasSsid() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSsid()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSsid().hashCode();
            }
            if (hasPassword()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getPassword().hashCode();
            }
            if (hasMacAdr()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getMacAdr().hashCode();
            }
            if (hasAntId()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getAntId();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDITopsideBuoyProto.internal_static_GDI_Proto_TopsideBuoy_WifiConnectionData_fieldAccessorTable.ensureFieldAccessorsInitialized(WifiConnectionData.class, Builder.class);
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
            return new WifiConnectionData();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.ssid_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBytes(2, this.password_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBytes(3, this.macAdr_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.antId_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WifiConnectionDataOrBuilder {
            private int antId_;
            private int bitField0_;
            private ByteString macAdr_;
            private ByteString password_;
            private Object ssid_;

            private Builder() {
                this.ssid_ = "";
                ByteString byteString = ByteString.EMPTY;
                this.password_ = byteString;
                this.macAdr_ = byteString;
            }

            private void buildPartial0(WifiConnectionData wifiConnectionData) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    wifiConnectionData.ssid_ = this.ssid_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    wifiConnectionData.password_ = this.password_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    wifiConnectionData.macAdr_ = this.macAdr_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    wifiConnectionData.antId_ = this.antId_;
                    i14 |= 8;
                }
                wifiConnectionData.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDITopsideBuoyProto.internal_static_GDI_Proto_TopsideBuoy_WifiConnectionData_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WifiConnectionData build() {
                WifiConnectionData wifiConnectionDataBuildPartial = buildPartial();
                if (wifiConnectionDataBuildPartial.isInitialized()) {
                    return wifiConnectionDataBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) wifiConnectionDataBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WifiConnectionData buildPartial() {
                WifiConnectionData wifiConnectionData = new WifiConnectionData(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(wifiConnectionData);
                }
                onBuilt();
                return wifiConnectionData;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.ssid_ = "";
                ByteString byteString = ByteString.EMPTY;
                this.password_ = byteString;
                this.macAdr_ = byteString;
                this.antId_ = 0;
                return this;
            }

            public Builder clearAntId() {
                this.bitField0_ &= -9;
                this.antId_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMacAdr() {
                this.bitField0_ &= -5;
                this.macAdr_ = WifiConnectionData.getDefaultInstance().getMacAdr();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPassword() {
                this.bitField0_ &= -3;
                this.password_ = WifiConnectionData.getDefaultInstance().getPassword();
                onChanged();
                return this;
            }

            public Builder clearSsid() {
                this.ssid_ = WifiConnectionData.getDefaultInstance().getSsid();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDITopsideBuoyProto.WifiConnectionDataOrBuilder
            public int getAntId() {
                return this.antId_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDITopsideBuoyProto.internal_static_GDI_Proto_TopsideBuoy_WifiConnectionData_descriptor;
            }

            @Override // com.garmin.proto.generated.GDITopsideBuoyProto.WifiConnectionDataOrBuilder
            public ByteString getMacAdr() {
                return this.macAdr_;
            }

            @Override // com.garmin.proto.generated.GDITopsideBuoyProto.WifiConnectionDataOrBuilder
            public ByteString getPassword() {
                return this.password_;
            }

            @Override // com.garmin.proto.generated.GDITopsideBuoyProto.WifiConnectionDataOrBuilder
            public String getSsid() {
                Object obj = this.ssid_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.ssid_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDITopsideBuoyProto.WifiConnectionDataOrBuilder
            public ByteString getSsidBytes() {
                Object obj = this.ssid_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.ssid_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDITopsideBuoyProto.WifiConnectionDataOrBuilder
            public boolean hasAntId() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDITopsideBuoyProto.WifiConnectionDataOrBuilder
            public boolean hasMacAdr() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDITopsideBuoyProto.WifiConnectionDataOrBuilder
            public boolean hasPassword() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDITopsideBuoyProto.WifiConnectionDataOrBuilder
            public boolean hasSsid() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDITopsideBuoyProto.internal_static_GDI_Proto_TopsideBuoy_WifiConnectionData_fieldAccessorTable.ensureFieldAccessorsInitialized(WifiConnectionData.class, Builder.class);
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
                                    this.ssid_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.password_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.macAdr_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.antId_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
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

            public Builder setAntId(int i14) {
                this.antId_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setMacAdr(ByteString byteString) {
                byteString.getClass();
                this.macAdr_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPassword(ByteString byteString) {
                byteString.getClass();
                this.password_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSsid(String str) {
                str.getClass();
                this.ssid_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSsidBytes(ByteString byteString) {
                byteString.getClass();
                this.ssid_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public WifiConnectionData getDefaultInstanceForType() {
                return WifiConnectionData.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.ssid_ = "";
                ByteString byteString = ByteString.EMPTY;
                this.password_ = byteString;
                this.macAdr_ = byteString;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof WifiConnectionData) {
                    return mergeFrom((WifiConnectionData) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(WifiConnectionData wifiConnectionData) {
                if (wifiConnectionData == WifiConnectionData.getDefaultInstance()) {
                    return this;
                }
                if (wifiConnectionData.hasSsid()) {
                    this.ssid_ = wifiConnectionData.ssid_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (wifiConnectionData.hasPassword()) {
                    setPassword(wifiConnectionData.getPassword());
                }
                if (wifiConnectionData.hasMacAdr()) {
                    setMacAdr(wifiConnectionData.getMacAdr());
                }
                if (wifiConnectionData.hasAntId()) {
                    setAntId(wifiConnectionData.getAntId());
                }
                mergeUnknownFields(wifiConnectionData.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public WifiConnectionData getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static WifiConnectionData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WifiConnectionData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WifiConnectionData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static WifiConnectionData parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static WifiConnectionData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static WifiConnectionData parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static WifiConnectionData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static WifiConnectionData parseFrom(InputStream inputStream) {
            return (WifiConnectionData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static WifiConnectionData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WifiConnectionData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WifiConnectionData parseFrom(CodedInputStream codedInputStream) {
            return (WifiConnectionData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static WifiConnectionData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WifiConnectionData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private WifiConnectionData(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.ssid_ = "";
            ByteString byteString = ByteString.EMPTY;
            this.password_ = byteString;
            this.macAdr_ = byteString;
            this.antId_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ WifiConnectionData(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class WifiConnectionDataNotification extends GeneratedMessageV3 implements WifiConnectionDataNotificationOrBuilder {
        private static final WifiConnectionDataNotification DEFAULT_INSTANCE = new WifiConnectionDataNotification();

        @Deprecated
        public static final Parser<WifiConnectionDataNotification> PARSER = new AbstractParser<WifiConnectionDataNotification>() { // from class: com.garmin.proto.generated.GDITopsideBuoyProto.WifiConnectionDataNotification.1
            @Override // com.google.protobuf.Parser
            public WifiConnectionDataNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = WifiConnectionDataNotification.newBuilder();
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
        public static final int WIFI_CONNECTION_DATA_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private WifiConnectionData wifiConnectionData_;

        private WifiConnectionDataNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WifiConnectionDataNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDITopsideBuoyProto.internal_static_GDI_Proto_TopsideBuoy_WifiConnectionDataNotification_descriptor;
        }

        public static Builder newBuilder(WifiConnectionDataNotification wifiConnectionDataNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(wifiConnectionDataNotification);
        }

        public static WifiConnectionDataNotification parseDelimitedFrom(InputStream inputStream) {
            return (WifiConnectionDataNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static WifiConnectionDataNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<WifiConnectionDataNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof WifiConnectionDataNotification)) {
                return super.equals(obj);
            }
            WifiConnectionDataNotification wifiConnectionDataNotification = (WifiConnectionDataNotification) obj;
            if (hasWifiConnectionData() != wifiConnectionDataNotification.hasWifiConnectionData()) {
                return false;
            }
            return (!hasWifiConnectionData() || getWifiConnectionData().equals(wifiConnectionDataNotification.getWifiConnectionData())) && getUnknownFields().equals(wifiConnectionDataNotification.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<WifiConnectionDataNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getWifiConnectionData()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDITopsideBuoyProto.WifiConnectionDataNotificationOrBuilder
        public WifiConnectionData getWifiConnectionData() {
            WifiConnectionData wifiConnectionData = this.wifiConnectionData_;
            return wifiConnectionData == null ? WifiConnectionData.getDefaultInstance() : wifiConnectionData;
        }

        @Override // com.garmin.proto.generated.GDITopsideBuoyProto.WifiConnectionDataNotificationOrBuilder
        public WifiConnectionDataOrBuilder getWifiConnectionDataOrBuilder() {
            WifiConnectionData wifiConnectionData = this.wifiConnectionData_;
            return wifiConnectionData == null ? WifiConnectionData.getDefaultInstance() : wifiConnectionData;
        }

        @Override // com.garmin.proto.generated.GDITopsideBuoyProto.WifiConnectionDataNotificationOrBuilder
        public boolean hasWifiConnectionData() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasWifiConnectionData()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getWifiConnectionData().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDITopsideBuoyProto.internal_static_GDI_Proto_TopsideBuoy_WifiConnectionDataNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(WifiConnectionDataNotification.class, Builder.class);
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
            return new WifiConnectionDataNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getWifiConnectionData());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WifiConnectionDataNotificationOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<WifiConnectionData, WifiConnectionData.Builder, WifiConnectionDataOrBuilder> wifiConnectionDataBuilder_;
            private WifiConnectionData wifiConnectionData_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(WifiConnectionDataNotification wifiConnectionDataNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<WifiConnectionData, WifiConnectionData.Builder, WifiConnectionDataOrBuilder> singleFieldBuilderV3 = this.wifiConnectionDataBuilder_;
                    wifiConnectionDataNotification.wifiConnectionData_ = singleFieldBuilderV3 == null ? this.wifiConnectionData_ : (WifiConnectionData) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                wifiConnectionDataNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDITopsideBuoyProto.internal_static_GDI_Proto_TopsideBuoy_WifiConnectionDataNotification_descriptor;
            }

            private SingleFieldBuilderV3<WifiConnectionData, WifiConnectionData.Builder, WifiConnectionDataOrBuilder> getWifiConnectionDataFieldBuilder() {
                if (this.wifiConnectionDataBuilder_ == null) {
                    this.wifiConnectionDataBuilder_ = new SingleFieldBuilderV3<>(getWifiConnectionData(), getParentForChildren(), isClean());
                    this.wifiConnectionData_ = null;
                }
                return this.wifiConnectionDataBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getWifiConnectionDataFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WifiConnectionDataNotification build() {
                WifiConnectionDataNotification wifiConnectionDataNotificationBuildPartial = buildPartial();
                if (wifiConnectionDataNotificationBuildPartial.isInitialized()) {
                    return wifiConnectionDataNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) wifiConnectionDataNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WifiConnectionDataNotification buildPartial() {
                WifiConnectionDataNotification wifiConnectionDataNotification = new WifiConnectionDataNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(wifiConnectionDataNotification);
                }
                onBuilt();
                return wifiConnectionDataNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.wifiConnectionData_ = null;
                SingleFieldBuilderV3<WifiConnectionData, WifiConnectionData.Builder, WifiConnectionDataOrBuilder> singleFieldBuilderV3 = this.wifiConnectionDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.wifiConnectionDataBuilder_ = null;
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

            public Builder clearWifiConnectionData() {
                this.bitField0_ &= -2;
                this.wifiConnectionData_ = null;
                SingleFieldBuilderV3<WifiConnectionData, WifiConnectionData.Builder, WifiConnectionDataOrBuilder> singleFieldBuilderV3 = this.wifiConnectionDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.wifiConnectionDataBuilder_ = null;
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
                return GDITopsideBuoyProto.internal_static_GDI_Proto_TopsideBuoy_WifiConnectionDataNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDITopsideBuoyProto.WifiConnectionDataNotificationOrBuilder
            public WifiConnectionData getWifiConnectionData() {
                SingleFieldBuilderV3<WifiConnectionData, WifiConnectionData.Builder, WifiConnectionDataOrBuilder> singleFieldBuilderV3 = this.wifiConnectionDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WifiConnectionData) singleFieldBuilderV3.getMessage();
                }
                WifiConnectionData wifiConnectionData = this.wifiConnectionData_;
                return wifiConnectionData == null ? WifiConnectionData.getDefaultInstance() : wifiConnectionData;
            }

            public WifiConnectionData.Builder getWifiConnectionDataBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (WifiConnectionData.Builder) getWifiConnectionDataFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDITopsideBuoyProto.WifiConnectionDataNotificationOrBuilder
            public WifiConnectionDataOrBuilder getWifiConnectionDataOrBuilder() {
                SingleFieldBuilderV3<WifiConnectionData, WifiConnectionData.Builder, WifiConnectionDataOrBuilder> singleFieldBuilderV3 = this.wifiConnectionDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WifiConnectionDataOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                WifiConnectionData wifiConnectionData = this.wifiConnectionData_;
                return wifiConnectionData == null ? WifiConnectionData.getDefaultInstance() : wifiConnectionData;
            }

            @Override // com.garmin.proto.generated.GDITopsideBuoyProto.WifiConnectionDataNotificationOrBuilder
            public boolean hasWifiConnectionData() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDITopsideBuoyProto.internal_static_GDI_Proto_TopsideBuoy_WifiConnectionDataNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(WifiConnectionDataNotification.class, Builder.class);
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
                                    codedInputStream.readMessage(getWifiConnectionDataFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeWifiConnectionData(WifiConnectionData wifiConnectionData) {
                WifiConnectionData wifiConnectionData2;
                SingleFieldBuilderV3<WifiConnectionData, WifiConnectionData.Builder, WifiConnectionDataOrBuilder> singleFieldBuilderV3 = this.wifiConnectionDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(wifiConnectionData);
                } else if ((this.bitField0_ & 1) == 0 || (wifiConnectionData2 = this.wifiConnectionData_) == null || wifiConnectionData2 == WifiConnectionData.getDefaultInstance()) {
                    this.wifiConnectionData_ = wifiConnectionData;
                } else {
                    getWifiConnectionDataBuilder().mergeFrom(wifiConnectionData);
                }
                if (this.wifiConnectionData_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
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

            public Builder setWifiConnectionData(WifiConnectionData.Builder builder) {
                SingleFieldBuilderV3<WifiConnectionData, WifiConnectionData.Builder, WifiConnectionDataOrBuilder> singleFieldBuilderV3 = this.wifiConnectionDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.wifiConnectionData_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public WifiConnectionDataNotification getDefaultInstanceForType() {
                return WifiConnectionDataNotification.getDefaultInstance();
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

            public Builder setWifiConnectionData(WifiConnectionData wifiConnectionData) {
                SingleFieldBuilderV3<WifiConnectionData, WifiConnectionData.Builder, WifiConnectionDataOrBuilder> singleFieldBuilderV3 = this.wifiConnectionDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    wifiConnectionData.getClass();
                    this.wifiConnectionData_ = wifiConnectionData;
                } else {
                    singleFieldBuilderV3.setMessage(wifiConnectionData);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof WifiConnectionDataNotification) {
                    return mergeFrom((WifiConnectionDataNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(WifiConnectionDataNotification wifiConnectionDataNotification) {
                if (wifiConnectionDataNotification == WifiConnectionDataNotification.getDefaultInstance()) {
                    return this;
                }
                if (wifiConnectionDataNotification.hasWifiConnectionData()) {
                    mergeWifiConnectionData(wifiConnectionDataNotification.getWifiConnectionData());
                }
                mergeUnknownFields(wifiConnectionDataNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public WifiConnectionDataNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ WifiConnectionDataNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private WifiConnectionDataNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WifiConnectionDataNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WifiConnectionDataNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WifiConnectionDataNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static WifiConnectionDataNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static WifiConnectionDataNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static WifiConnectionDataNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static WifiConnectionDataNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static WifiConnectionDataNotification parseFrom(InputStream inputStream) {
            return (WifiConnectionDataNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static WifiConnectionDataNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WifiConnectionDataNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WifiConnectionDataNotification parseFrom(CodedInputStream codedInputStream) {
            return (WifiConnectionDataNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static WifiConnectionDataNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WifiConnectionDataNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
