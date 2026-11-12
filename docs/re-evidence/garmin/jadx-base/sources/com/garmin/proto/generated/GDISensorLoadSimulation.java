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

/* JADX INFO: loaded from: classes6.dex */
public final class GDISensorLoadSimulation {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001dGDISensorLoadSimulation.proto\u0012\u001eGDI.Proto.SensorLoadSimulation\"c\n\u0007Service\u0012X\n\u0018sensor_load_notification\u0018\u0001 \u0001(\u000b26.GDI.Proto.SensorLoadSimulation.SensorLoadNotification\"<\n\u0016SensorLoadNotification\u0012\u000f\n\u0007payload\u0018\u0001 \u0001(\f\u0012\u0011\n\ttimestamp\u0018\u0002 \u0001(\rB7\n\u001acom.garmin.proto.generatedB\u0017GDISensorLoadSimulationH\u0003"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SensorLoadSimulation_SensorLoadNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SensorLoadSimulation_SensorLoadNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SensorLoadSimulation_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SensorLoadSimulation_Service_fieldAccessorTable;

    public interface SensorLoadNotificationOrBuilder extends MessageOrBuilder {
        ByteString getPayload();

        int getTimestamp();

        boolean hasPayload();

        boolean hasTimestamp();
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
        SensorLoadNotification getSensorLoadNotification();

        SensorLoadNotificationOrBuilder getSensorLoadNotificationOrBuilder();

        boolean hasSensorLoadNotification();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_SensorLoadSimulation_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_SensorLoadSimulation_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"SensorLoadNotification"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_SensorLoadSimulation_SensorLoadNotification_descriptor = descriptor3;
        internal_static_GDI_Proto_SensorLoadSimulation_SensorLoadNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Payload", "Timestamp"});
    }

    private GDISensorLoadSimulation() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class SensorLoadNotification extends GeneratedMessageV3 implements SensorLoadNotificationOrBuilder {
        private static final SensorLoadNotification DEFAULT_INSTANCE = new SensorLoadNotification();

        @Deprecated
        public static final Parser<SensorLoadNotification> PARSER = new AbstractParser<SensorLoadNotification>() { // from class: com.garmin.proto.generated.GDISensorLoadSimulation.SensorLoadNotification.1
            @Override // com.google.protobuf.Parser
            public SensorLoadNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SensorLoadNotification.newBuilder();
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
        public static final int TIMESTAMP_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private ByteString payload_;
        private int timestamp_;

        private SensorLoadNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.payload_ = ByteString.EMPTY;
            this.timestamp_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SensorLoadNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISensorLoadSimulation.internal_static_GDI_Proto_SensorLoadSimulation_SensorLoadNotification_descriptor;
        }

        public static Builder newBuilder(SensorLoadNotification sensorLoadNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sensorLoadNotification);
        }

        public static SensorLoadNotification parseDelimitedFrom(InputStream inputStream) {
            return (SensorLoadNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SensorLoadNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SensorLoadNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SensorLoadNotification)) {
                return super.equals(obj);
            }
            SensorLoadNotification sensorLoadNotification = (SensorLoadNotification) obj;
            if (hasPayload() != sensorLoadNotification.hasPayload()) {
                return false;
            }
            if ((!hasPayload() || getPayload().equals(sensorLoadNotification.getPayload())) && hasTimestamp() == sensorLoadNotification.hasTimestamp()) {
                return (!hasTimestamp() || getTimestamp() == sensorLoadNotification.getTimestamp()) && getUnknownFields().equals(sensorLoadNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SensorLoadNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDISensorLoadSimulation.SensorLoadNotificationOrBuilder
        public ByteString getPayload() {
            return this.payload_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.payload_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBytesSize += CodedOutputStream.computeUInt32Size(2, this.timestamp_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBytesSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISensorLoadSimulation.SensorLoadNotificationOrBuilder
        public int getTimestamp() {
            return this.timestamp_;
        }

        @Override // com.garmin.proto.generated.GDISensorLoadSimulation.SensorLoadNotificationOrBuilder
        public boolean hasPayload() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDISensorLoadSimulation.SensorLoadNotificationOrBuilder
        public boolean hasTimestamp() {
            return (this.bitField0_ & 2) != 0;
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
            if (hasTimestamp()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getTimestamp();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISensorLoadSimulation.internal_static_GDI_Proto_SensorLoadSimulation_SensorLoadNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SensorLoadNotification.class, Builder.class);
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
            return new SensorLoadNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.payload_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.timestamp_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SensorLoadNotificationOrBuilder {
            private int bitField0_;
            private ByteString payload_;
            private int timestamp_;

            private Builder() {
                this.payload_ = ByteString.EMPTY;
            }

            private void buildPartial0(SensorLoadNotification sensorLoadNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    sensorLoadNotification.payload_ = this.payload_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    sensorLoadNotification.timestamp_ = this.timestamp_;
                    i14 |= 2;
                }
                sensorLoadNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISensorLoadSimulation.internal_static_GDI_Proto_SensorLoadSimulation_SensorLoadNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SensorLoadNotification build() {
                SensorLoadNotification sensorLoadNotificationBuildPartial = buildPartial();
                if (sensorLoadNotificationBuildPartial.isInitialized()) {
                    return sensorLoadNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sensorLoadNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SensorLoadNotification buildPartial() {
                SensorLoadNotification sensorLoadNotification = new SensorLoadNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sensorLoadNotification);
                }
                onBuilt();
                return sensorLoadNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.payload_ = ByteString.EMPTY;
                this.timestamp_ = 0;
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
                this.payload_ = SensorLoadNotification.getDefaultInstance().getPayload();
                onChanged();
                return this;
            }

            public Builder clearTimestamp() {
                this.bitField0_ &= -3;
                this.timestamp_ = 0;
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
                return GDISensorLoadSimulation.internal_static_GDI_Proto_SensorLoadSimulation_SensorLoadNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISensorLoadSimulation.SensorLoadNotificationOrBuilder
            public ByteString getPayload() {
                return this.payload_;
            }

            @Override // com.garmin.proto.generated.GDISensorLoadSimulation.SensorLoadNotificationOrBuilder
            public int getTimestamp() {
                return this.timestamp_;
            }

            @Override // com.garmin.proto.generated.GDISensorLoadSimulation.SensorLoadNotificationOrBuilder
            public boolean hasPayload() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDISensorLoadSimulation.SensorLoadNotificationOrBuilder
            public boolean hasTimestamp() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISensorLoadSimulation.internal_static_GDI_Proto_SensorLoadSimulation_SensorLoadNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SensorLoadNotification.class, Builder.class);
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
                                    this.payload_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.timestamp_ = codedInputStream.readUInt32();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setPayload(ByteString byteString) {
                byteString.getClass();
                this.payload_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setTimestamp(int i14) {
                this.timestamp_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SensorLoadNotification getDefaultInstanceForType() {
                return SensorLoadNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.payload_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SensorLoadNotification) {
                    return mergeFrom((SensorLoadNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SensorLoadNotification sensorLoadNotification) {
                if (sensorLoadNotification == SensorLoadNotification.getDefaultInstance()) {
                    return this;
                }
                if (sensorLoadNotification.hasPayload()) {
                    setPayload(sensorLoadNotification.getPayload());
                }
                if (sensorLoadNotification.hasTimestamp()) {
                    setTimestamp(sensorLoadNotification.getTimestamp());
                }
                mergeUnknownFields(sensorLoadNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SensorLoadNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SensorLoadNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SensorLoadNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SensorLoadNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SensorLoadNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SensorLoadNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SensorLoadNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SensorLoadNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ SensorLoadNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SensorLoadNotification parseFrom(InputStream inputStream) {
            return (SensorLoadNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private SensorLoadNotification() {
            ByteString byteString = ByteString.EMPTY;
            this.timestamp_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.payload_ = byteString;
        }

        public static SensorLoadNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SensorLoadNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SensorLoadNotification parseFrom(CodedInputStream codedInputStream) {
            return (SensorLoadNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SensorLoadNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SensorLoadNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDISensorLoadSimulation.Service.1
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
        public static final int SENSOR_LOAD_NOTIFICATION_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private SensorLoadNotification sensorLoadNotification_;

        private Service(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Service getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISensorLoadSimulation.internal_static_GDI_Proto_SensorLoadSimulation_Service_descriptor;
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
            if (hasSensorLoadNotification() != service.hasSensorLoadNotification()) {
                return false;
            }
            return (!hasSensorLoadNotification() || getSensorLoadNotification().equals(service.getSensorLoadNotification())) && getUnknownFields().equals(service.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Service> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDISensorLoadSimulation.ServiceOrBuilder
        public SensorLoadNotification getSensorLoadNotification() {
            SensorLoadNotification sensorLoadNotification = this.sensorLoadNotification_;
            return sensorLoadNotification == null ? SensorLoadNotification.getDefaultInstance() : sensorLoadNotification;
        }

        @Override // com.garmin.proto.generated.GDISensorLoadSimulation.ServiceOrBuilder
        public SensorLoadNotificationOrBuilder getSensorLoadNotificationOrBuilder() {
            SensorLoadNotification sensorLoadNotification = this.sensorLoadNotification_;
            return sensorLoadNotification == null ? SensorLoadNotification.getDefaultInstance() : sensorLoadNotification;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getSensorLoadNotification()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISensorLoadSimulation.ServiceOrBuilder
        public boolean hasSensorLoadNotification() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSensorLoadNotification()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSensorLoadNotification().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISensorLoadSimulation.internal_static_GDI_Proto_SensorLoadSimulation_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getSensorLoadNotification());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<SensorLoadNotification, SensorLoadNotification.Builder, SensorLoadNotificationOrBuilder> sensorLoadNotificationBuilder_;
            private SensorLoadNotification sensorLoadNotification_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Service service) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<SensorLoadNotification, SensorLoadNotification.Builder, SensorLoadNotificationOrBuilder> singleFieldBuilderV3 = this.sensorLoadNotificationBuilder_;
                    service.sensorLoadNotification_ = singleFieldBuilderV3 == null ? this.sensorLoadNotification_ : (SensorLoadNotification) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                service.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISensorLoadSimulation.internal_static_GDI_Proto_SensorLoadSimulation_Service_descriptor;
            }

            private SingleFieldBuilderV3<SensorLoadNotification, SensorLoadNotification.Builder, SensorLoadNotificationOrBuilder> getSensorLoadNotificationFieldBuilder() {
                if (this.sensorLoadNotificationBuilder_ == null) {
                    this.sensorLoadNotificationBuilder_ = new SingleFieldBuilderV3<>(getSensorLoadNotification(), getParentForChildren(), isClean());
                    this.sensorLoadNotification_ = null;
                }
                return this.sensorLoadNotificationBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSensorLoadNotificationFieldBuilder();
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
                this.sensorLoadNotification_ = null;
                SingleFieldBuilderV3<SensorLoadNotification, SensorLoadNotification.Builder, SensorLoadNotificationOrBuilder> singleFieldBuilderV3 = this.sensorLoadNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sensorLoadNotificationBuilder_ = null;
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

            public Builder clearSensorLoadNotification() {
                this.bitField0_ &= -2;
                this.sensorLoadNotification_ = null;
                SingleFieldBuilderV3<SensorLoadNotification, SensorLoadNotification.Builder, SensorLoadNotificationOrBuilder> singleFieldBuilderV3 = this.sensorLoadNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sensorLoadNotificationBuilder_ = null;
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
                return GDISensorLoadSimulation.internal_static_GDI_Proto_SensorLoadSimulation_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISensorLoadSimulation.ServiceOrBuilder
            public SensorLoadNotification getSensorLoadNotification() {
                SingleFieldBuilderV3<SensorLoadNotification, SensorLoadNotification.Builder, SensorLoadNotificationOrBuilder> singleFieldBuilderV3 = this.sensorLoadNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SensorLoadNotification) singleFieldBuilderV3.getMessage();
                }
                SensorLoadNotification sensorLoadNotification = this.sensorLoadNotification_;
                return sensorLoadNotification == null ? SensorLoadNotification.getDefaultInstance() : sensorLoadNotification;
            }

            public SensorLoadNotification.Builder getSensorLoadNotificationBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SensorLoadNotification.Builder) getSensorLoadNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISensorLoadSimulation.ServiceOrBuilder
            public SensorLoadNotificationOrBuilder getSensorLoadNotificationOrBuilder() {
                SingleFieldBuilderV3<SensorLoadNotification, SensorLoadNotification.Builder, SensorLoadNotificationOrBuilder> singleFieldBuilderV3 = this.sensorLoadNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SensorLoadNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SensorLoadNotification sensorLoadNotification = this.sensorLoadNotification_;
                return sensorLoadNotification == null ? SensorLoadNotification.getDefaultInstance() : sensorLoadNotification;
            }

            @Override // com.garmin.proto.generated.GDISensorLoadSimulation.ServiceOrBuilder
            public boolean hasSensorLoadNotification() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISensorLoadSimulation.internal_static_GDI_Proto_SensorLoadSimulation_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
                                    codedInputStream.readMessage(getSensorLoadNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeSensorLoadNotification(SensorLoadNotification sensorLoadNotification) {
                SensorLoadNotification sensorLoadNotification2;
                SingleFieldBuilderV3<SensorLoadNotification, SensorLoadNotification.Builder, SensorLoadNotificationOrBuilder> singleFieldBuilderV3 = this.sensorLoadNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(sensorLoadNotification);
                } else if ((this.bitField0_ & 1) == 0 || (sensorLoadNotification2 = this.sensorLoadNotification_) == null || sensorLoadNotification2 == SensorLoadNotification.getDefaultInstance()) {
                    this.sensorLoadNotification_ = sensorLoadNotification;
                } else {
                    getSensorLoadNotificationBuilder().mergeFrom(sensorLoadNotification);
                }
                if (this.sensorLoadNotification_ != null) {
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSensorLoadNotification(SensorLoadNotification.Builder builder) {
                SingleFieldBuilderV3<SensorLoadNotification, SensorLoadNotification.Builder, SensorLoadNotificationOrBuilder> singleFieldBuilderV3 = this.sensorLoadNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.sensorLoadNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
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

            public Builder setSensorLoadNotification(SensorLoadNotification sensorLoadNotification) {
                SingleFieldBuilderV3<SensorLoadNotification, SensorLoadNotification.Builder, SensorLoadNotificationOrBuilder> singleFieldBuilderV3 = this.sensorLoadNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    sensorLoadNotification.getClass();
                    this.sensorLoadNotification_ = sensorLoadNotification;
                } else {
                    singleFieldBuilderV3.setMessage(sensorLoadNotification);
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
                if (service.hasSensorLoadNotification()) {
                    mergeSensorLoadNotification(service.getSensorLoadNotification());
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

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
