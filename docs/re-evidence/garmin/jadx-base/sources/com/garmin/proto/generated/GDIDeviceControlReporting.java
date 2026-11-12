package com.garmin.proto.generated;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import i3.e5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes4.dex */
public final class GDIDeviceControlReporting {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001fGDIDeviceControlReporting.proto\u0012 GDI.Proto.DeviceControlReporting\u001a\rGDICore.proto\u001a\u0015GDIEventSharing.proto\"»\u0001\n\u0007Service\u0012V\n\u0012controller_request\u0018\u0001 \u0001(\u000b2:.GDI.Proto.DeviceControlReporting.ControllingDeviceRequest\u0012X\n\u0013controller_response\u0018\u0002 \u0001(\u000b2;.GDI.Proto.DeviceControlReporting.ControllingDeviceResponse\"«\u0001\n\u0011ControllingDevice\u0012?\n\u0006status\u0018\u0001 \u0001(\u000e2/.GDI.Proto.DeviceControlReporting.ControlStatus\u0012\f\n\u0004name\u0018\u0002 \u0001(\t\u0012G\n\u000econtrol_device\u0018\u0003 \u0001(\u000e2/.GDI.Proto.DeviceControlReporting.ControlDevice\"c\n\u0018ControllingDeviceRequest\u0012G\n\u000econtrol_device\u0018\u0001 \u0001(\u000e2/.GDI.Proto.DeviceControlReporting.ControlDevice\"`\n\u0019ControllingDeviceResponse\u0012C\n\u0006device\u0018\u0001 \u0001(\u000b23.GDI.Proto.DeviceControlReporting.ControllingDevice\"à\u0001\n\u001dControllingDeviceNotification\u0012D\n\u0007devices\u0018\u0001 \u0003(\u000b23.GDI.Proto.DeviceControlReporting.ControllingDevice2y\n\u0004data\u0012).GDI.Proto.EventSharing.AlertNotification\u0018\u0080\b \u0001(\u000b2?.GDI.Proto.DeviceControlReporting.ControllingDeviceNotification*Y\n\rControlStatus\u0012\u0010\n\fUNCONTROLLED\u0010\u0000\u0012\r\n\tREQUESTED\u0010\u0001\u0012\u000b\n\u0007GRANTED\u0010\u0002\u0012\f\n\bREJECTED\u0010\u0003\u0012\f\n\bRELEASED\u0010\u0004*)\n\rControlDevice\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u000b\n\u0007TRAINER\u0010\u0001B9\n\u001acom.garmin.proto.generatedB\u0019GDIDeviceControlReportingH\u0003"}, new Descriptors.FileDescriptor[]{GDICore.getDescriptor(), GDIEventSharingProto.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DeviceControlReporting_ControllingDeviceNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DeviceControlReporting_ControllingDeviceNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DeviceControlReporting_ControllingDeviceRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DeviceControlReporting_ControllingDeviceRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DeviceControlReporting_ControllingDeviceResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DeviceControlReporting_ControllingDeviceResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DeviceControlReporting_ControllingDevice_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DeviceControlReporting_ControllingDevice_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DeviceControlReporting_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DeviceControlReporting_Service_fieldAccessorTable;

    public interface ControllingDeviceNotificationOrBuilder extends MessageOrBuilder {
        ControllingDevice getDevices(int i14);

        int getDevicesCount();

        List<ControllingDevice> getDevicesList();

        ControllingDeviceOrBuilder getDevicesOrBuilder(int i14);

        List<? extends ControllingDeviceOrBuilder> getDevicesOrBuilderList();
    }

    public interface ControllingDeviceOrBuilder extends MessageOrBuilder {
        ControlDevice getControlDevice();

        String getName();

        ByteString getNameBytes();

        ControlStatus getStatus();

        boolean hasControlDevice();

        boolean hasName();

        boolean hasStatus();
    }

    public interface ControllingDeviceRequestOrBuilder extends MessageOrBuilder {
        ControlDevice getControlDevice();

        boolean hasControlDevice();
    }

    public interface ControllingDeviceResponseOrBuilder extends MessageOrBuilder {
        ControllingDevice getDevice();

        ControllingDeviceOrBuilder getDeviceOrBuilder();

        boolean hasDevice();
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
        ControllingDeviceRequest getControllerRequest();

        ControllingDeviceRequestOrBuilder getControllerRequestOrBuilder();

        ControllingDeviceResponse getControllerResponse();

        ControllingDeviceResponseOrBuilder getControllerResponseOrBuilder();

        boolean hasControllerRequest();

        boolean hasControllerResponse();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_DeviceControlReporting_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_DeviceControlReporting_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"ControllerRequest", "ControllerResponse"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_DeviceControlReporting_ControllingDevice_descriptor = descriptor3;
        internal_static_GDI_Proto_DeviceControlReporting_ControllingDevice_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Status", "Name", "ControlDevice"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_DeviceControlReporting_ControllingDeviceRequest_descriptor = descriptor4;
        internal_static_GDI_Proto_DeviceControlReporting_ControllingDeviceRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"ControlDevice"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_DeviceControlReporting_ControllingDeviceResponse_descriptor = descriptor5;
        internal_static_GDI_Proto_DeviceControlReporting_ControllingDeviceResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Device"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_DeviceControlReporting_ControllingDeviceNotification_descriptor = descriptor6;
        internal_static_GDI_Proto_DeviceControlReporting_ControllingDeviceNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Devices"});
        GDICore.getDescriptor();
        GDIEventSharingProto.getDescriptor();
    }

    private GDIDeviceControlReporting() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(ControllingDeviceNotification.data);
    }

    public static final class ControllingDevice extends GeneratedMessageV3 implements ControllingDeviceOrBuilder {
        public static final int CONTROL_DEVICE_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int controlDevice_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private int status_;
        private static final ControllingDevice DEFAULT_INSTANCE = new ControllingDevice();

        @Deprecated
        public static final Parser<ControllingDevice> PARSER = new AbstractParser<ControllingDevice>() { // from class: com.garmin.proto.generated.GDIDeviceControlReporting.ControllingDevice.1
            @Override // com.google.protobuf.Parser
            public ControllingDevice parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ControllingDevice.newBuilder();
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

        private ControllingDevice() {
            this.status_ = 0;
            this.name_ = "";
            this.controlDevice_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
            this.name_ = "";
            this.controlDevice_ = 0;
        }

        public static ControllingDevice getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDeviceControlReporting.internal_static_GDI_Proto_DeviceControlReporting_ControllingDevice_descriptor;
        }

        public static Builder newBuilder(ControllingDevice controllingDevice) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(controllingDevice);
        }

        public static ControllingDevice parseDelimitedFrom(InputStream inputStream) {
            return (ControllingDevice) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ControllingDevice parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ControllingDevice> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ControllingDevice)) {
                return super.equals(obj);
            }
            ControllingDevice controllingDevice = (ControllingDevice) obj;
            if (hasStatus() != controllingDevice.hasStatus()) {
                return false;
            }
            if ((hasStatus() && this.status_ != controllingDevice.status_) || hasName() != controllingDevice.hasName()) {
                return false;
            }
            if ((!hasName() || getName().equals(controllingDevice.getName())) && hasControlDevice() == controllingDevice.hasControlDevice()) {
                return (!hasControlDevice() || this.controlDevice_ == controllingDevice.controlDevice_) && getUnknownFields().equals(controllingDevice.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ControllingDeviceOrBuilder
        public ControlDevice getControlDevice() {
            ControlDevice controlDeviceForNumber = ControlDevice.forNumber(this.controlDevice_);
            return controlDeviceForNumber == null ? ControlDevice.UNKNOWN : controlDeviceForNumber;
        }

        @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ControllingDeviceOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.name_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ControllingDeviceOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ControllingDevice> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.status_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += GeneratedMessageV3.computeStringSize(2, this.name_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(3, this.controlDevice_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ControllingDeviceOrBuilder
        public ControlStatus getStatus() {
            ControlStatus controlStatusForNumber = ControlStatus.forNumber(this.status_);
            return controlStatusForNumber == null ? ControlStatus.UNCONTROLLED : controlStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ControllingDeviceOrBuilder
        public boolean hasControlDevice() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ControllingDeviceOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ControllingDeviceOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasStatus()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.status_;
            }
            if (hasName()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getName().hashCode();
            }
            if (hasControlDevice()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + this.controlDevice_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDeviceControlReporting.internal_static_GDI_Proto_DeviceControlReporting_ControllingDevice_fieldAccessorTable.ensureFieldAccessorsInitialized(ControllingDevice.class, Builder.class);
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
            return new ControllingDevice();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.status_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.name_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(3, this.controlDevice_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ControllingDeviceOrBuilder {
            private int bitField0_;
            private int controlDevice_;
            private Object name_;
            private int status_;

            private Builder() {
                this.status_ = 0;
                this.name_ = "";
                this.controlDevice_ = 0;
            }

            private void buildPartial0(ControllingDevice controllingDevice) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    controllingDevice.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    controllingDevice.name_ = this.name_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    controllingDevice.controlDevice_ = this.controlDevice_;
                    i14 |= 4;
                }
                controllingDevice.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDeviceControlReporting.internal_static_GDI_Proto_DeviceControlReporting_ControllingDevice_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ControllingDevice build() {
                ControllingDevice controllingDeviceBuildPartial = buildPartial();
                if (controllingDeviceBuildPartial.isInitialized()) {
                    return controllingDeviceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) controllingDeviceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ControllingDevice buildPartial() {
                ControllingDevice controllingDevice = new ControllingDevice(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(controllingDevice);
                }
                onBuilt();
                return controllingDevice;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                this.name_ = "";
                this.controlDevice_ = 0;
                return this;
            }

            public Builder clearControlDevice() {
                this.bitField0_ &= -5;
                this.controlDevice_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearName() {
                this.name_ = ControllingDevice.getDefaultInstance().getName();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearStatus() {
                this.bitField0_ &= -2;
                this.status_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ControllingDeviceOrBuilder
            public ControlDevice getControlDevice() {
                ControlDevice controlDeviceForNumber = ControlDevice.forNumber(this.controlDevice_);
                return controlDeviceForNumber == null ? ControlDevice.UNKNOWN : controlDeviceForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDeviceControlReporting.internal_static_GDI_Proto_DeviceControlReporting_ControllingDevice_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ControllingDeviceOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.name_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ControllingDeviceOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ControllingDeviceOrBuilder
            public ControlStatus getStatus() {
                ControlStatus controlStatusForNumber = ControlStatus.forNumber(this.status_);
                return controlStatusForNumber == null ? ControlStatus.UNCONTROLLED : controlStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ControllingDeviceOrBuilder
            public boolean hasControlDevice() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ControllingDeviceOrBuilder
            public boolean hasName() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ControllingDeviceOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDeviceControlReporting.internal_static_GDI_Proto_DeviceControlReporting_ControllingDevice_fieldAccessorTable.ensureFieldAccessorsInitialized(ControllingDevice.class, Builder.class);
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
                                    if (ControlStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    this.name_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    int i15 = codedInputStream.readEnum();
                                    if (ControlDevice.forNumber(i15) == null) {
                                        mergeUnknownVarintField(3, i15);
                                    } else {
                                        this.controlDevice_ = i15;
                                        this.bitField0_ |= 4;
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

            public Builder setControlDevice(ControlDevice controlDevice) {
                controlDevice.getClass();
                this.bitField0_ |= 4;
                this.controlDevice_ = controlDevice.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setName(String str) {
                str.getClass();
                this.name_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                byteString.getClass();
                this.name_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStatus(ControlStatus controlStatus) {
                controlStatus.getClass();
                this.bitField0_ |= 1;
                this.status_ = controlStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ControllingDevice getDefaultInstanceForType() {
                return ControllingDevice.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.status_ = 0;
                this.name_ = "";
                this.controlDevice_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ControllingDevice) {
                    return mergeFrom((ControllingDevice) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ControllingDevice controllingDevice) {
                if (controllingDevice == ControllingDevice.getDefaultInstance()) {
                    return this;
                }
                if (controllingDevice.hasStatus()) {
                    setStatus(controllingDevice.getStatus());
                }
                if (controllingDevice.hasName()) {
                    this.name_ = controllingDevice.name_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (controllingDevice.hasControlDevice()) {
                    setControlDevice(controllingDevice.getControlDevice());
                }
                mergeUnknownFields(controllingDevice.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ControllingDevice getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ControllingDevice parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ControllingDevice) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ControllingDevice parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ControllingDevice parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ControllingDevice parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ControllingDevice parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ControllingDevice parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ControllingDevice parseFrom(InputStream inputStream) {
            return (ControllingDevice) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ControllingDevice parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ControllingDevice) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ControllingDevice parseFrom(CodedInputStream codedInputStream) {
            return (ControllingDevice) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ControllingDevice parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ControllingDevice) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private ControllingDevice(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.name_ = "";
            this.controlDevice_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ ControllingDevice(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class ControllingDeviceNotification extends GeneratedMessageV3 implements ControllingDeviceNotificationOrBuilder {
        public static final int DATA_FIELD_NUMBER = 1024;
        public static final int DEVICES_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<ControllingDevice> devices_;
        private byte memoizedIsInitialized;
        private static final ControllingDeviceNotification DEFAULT_INSTANCE = new ControllingDeviceNotification();

        @Deprecated
        public static final Parser<ControllingDeviceNotification> PARSER = new AbstractParser<ControllingDeviceNotification>() { // from class: com.garmin.proto.generated.GDIDeviceControlReporting.ControllingDeviceNotification.1
            @Override // com.google.protobuf.Parser
            public ControllingDeviceNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ControllingDeviceNotification.newBuilder();
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
        public static final GeneratedMessage.GeneratedExtension<GDIEventSharingProto.AlertNotification, ControllingDeviceNotification> data = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, ControllingDeviceNotification.class, getDefaultInstance());

        private ControllingDeviceNotification() {
            this.memoizedIsInitialized = (byte) -1;
            this.devices_ = Collections.EMPTY_LIST;
        }

        public static ControllingDeviceNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDeviceControlReporting.internal_static_GDI_Proto_DeviceControlReporting_ControllingDeviceNotification_descriptor;
        }

        public static Builder newBuilder(ControllingDeviceNotification controllingDeviceNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(controllingDeviceNotification);
        }

        public static ControllingDeviceNotification parseDelimitedFrom(InputStream inputStream) {
            return (ControllingDeviceNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ControllingDeviceNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ControllingDeviceNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ControllingDeviceNotification)) {
                return super.equals(obj);
            }
            ControllingDeviceNotification controllingDeviceNotification = (ControllingDeviceNotification) obj;
            return getDevicesList().equals(controllingDeviceNotification.getDevicesList()) && getUnknownFields().equals(controllingDeviceNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ControllingDeviceNotificationOrBuilder
        public ControllingDevice getDevices(int i14) {
            return this.devices_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ControllingDeviceNotificationOrBuilder
        public int getDevicesCount() {
            return this.devices_.size();
        }

        @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ControllingDeviceNotificationOrBuilder
        public List<ControllingDevice> getDevicesList() {
            return this.devices_;
        }

        @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ControllingDeviceNotificationOrBuilder
        public ControllingDeviceOrBuilder getDevicesOrBuilder(int i14) {
            return this.devices_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ControllingDeviceNotificationOrBuilder
        public List<? extends ControllingDeviceOrBuilder> getDevicesOrBuilderList() {
            return this.devices_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ControllingDeviceNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = 0;
            for (int i15 = 0; i15 < this.devices_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.devices_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getDevicesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getDevicesList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDeviceControlReporting.internal_static_GDI_Proto_DeviceControlReporting_ControllingDeviceNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ControllingDeviceNotification.class, Builder.class);
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
            return new ControllingDeviceNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.devices_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.devices_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ControllingDeviceNotificationOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<ControllingDevice, ControllingDevice.Builder, ControllingDeviceOrBuilder> devicesBuilder_;
            private List<ControllingDevice> devices_;

            private Builder() {
                this.devices_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(ControllingDeviceNotification controllingDeviceNotification) {
            }

            private void buildPartialRepeatedFields(ControllingDeviceNotification controllingDeviceNotification) {
                RepeatedFieldBuilderV3<ControllingDevice, ControllingDevice.Builder, ControllingDeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    controllingDeviceNotification.devices_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.devices_ = Collections.unmodifiableList(this.devices_);
                    this.bitField0_ &= -2;
                }
                controllingDeviceNotification.devices_ = this.devices_;
            }

            private void ensureDevicesIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.devices_ = new ArrayList(this.devices_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDeviceControlReporting.internal_static_GDI_Proto_DeviceControlReporting_ControllingDeviceNotification_descriptor;
            }

            private RepeatedFieldBuilderV3<ControllingDevice, ControllingDevice.Builder, ControllingDeviceOrBuilder> getDevicesFieldBuilder() {
                if (this.devicesBuilder_ == null) {
                    this.devicesBuilder_ = new RepeatedFieldBuilderV3<>(this.devices_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.devices_ = null;
                }
                return this.devicesBuilder_;
            }

            public Builder addAllDevices(Iterable<? extends ControllingDevice> iterable) {
                RepeatedFieldBuilderV3<ControllingDevice, ControllingDevice.Builder, ControllingDeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureDevicesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.devices_);
                onChanged();
                return this;
            }

            public Builder addDevices(ControllingDevice.Builder builder) {
                RepeatedFieldBuilderV3<ControllingDevice, ControllingDevice.Builder, ControllingDeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureDevicesIsMutable();
                this.devices_.add(builder.build());
                onChanged();
                return this;
            }

            public ControllingDevice.Builder addDevicesBuilder() {
                return (ControllingDevice.Builder) getDevicesFieldBuilder().addBuilder(ControllingDevice.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ControllingDeviceNotification build() {
                ControllingDeviceNotification controllingDeviceNotificationBuildPartial = buildPartial();
                if (controllingDeviceNotificationBuildPartial.isInitialized()) {
                    return controllingDeviceNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) controllingDeviceNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ControllingDeviceNotification buildPartial() {
                ControllingDeviceNotification controllingDeviceNotification = new ControllingDeviceNotification(this);
                buildPartialRepeatedFields(controllingDeviceNotification);
                if (this.bitField0_ != 0) {
                    buildPartial0(controllingDeviceNotification);
                }
                onBuilt();
                return controllingDeviceNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<ControllingDevice, ControllingDevice.Builder, ControllingDeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.devices_ = Collections.EMPTY_LIST;
                } else {
                    this.devices_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                return this;
            }

            public Builder clearDevices() {
                RepeatedFieldBuilderV3<ControllingDevice, ControllingDevice.Builder, ControllingDeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.devices_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
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
                return GDIDeviceControlReporting.internal_static_GDI_Proto_DeviceControlReporting_ControllingDeviceNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ControllingDeviceNotificationOrBuilder
            public ControllingDevice getDevices(int i14) {
                RepeatedFieldBuilderV3<ControllingDevice, ControllingDevice.Builder, ControllingDeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.devices_.get(i14) : (ControllingDevice) repeatedFieldBuilderV3.getMessage(i14);
            }

            public ControllingDevice.Builder getDevicesBuilder(int i14) {
                return (ControllingDevice.Builder) getDevicesFieldBuilder().getBuilder(i14);
            }

            public List<ControllingDevice.Builder> getDevicesBuilderList() {
                return getDevicesFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ControllingDeviceNotificationOrBuilder
            public int getDevicesCount() {
                RepeatedFieldBuilderV3<ControllingDevice, ControllingDevice.Builder, ControllingDeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.devices_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ControllingDeviceNotificationOrBuilder
            public List<ControllingDevice> getDevicesList() {
                RepeatedFieldBuilderV3<ControllingDevice, ControllingDevice.Builder, ControllingDeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.devices_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ControllingDeviceNotificationOrBuilder
            public ControllingDeviceOrBuilder getDevicesOrBuilder(int i14) {
                RepeatedFieldBuilderV3<ControllingDevice, ControllingDevice.Builder, ControllingDeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.devices_.get(i14) : (ControllingDeviceOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ControllingDeviceNotificationOrBuilder
            public List<? extends ControllingDeviceOrBuilder> getDevicesOrBuilderList() {
                RepeatedFieldBuilderV3<ControllingDevice, ControllingDevice.Builder, ControllingDeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.devices_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDeviceControlReporting.internal_static_GDI_Proto_DeviceControlReporting_ControllingDeviceNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ControllingDeviceNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(ControllingDeviceNotification controllingDeviceNotification) {
                if (controllingDeviceNotification == ControllingDeviceNotification.getDefaultInstance()) {
                    return this;
                }
                if (this.devicesBuilder_ == null) {
                    if (!controllingDeviceNotification.devices_.isEmpty()) {
                        if (this.devices_.isEmpty()) {
                            this.devices_ = controllingDeviceNotification.devices_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureDevicesIsMutable();
                            this.devices_.addAll(controllingDeviceNotification.devices_);
                        }
                        onChanged();
                    }
                } else if (!controllingDeviceNotification.devices_.isEmpty()) {
                    boolean zIsEmpty = this.devicesBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<ControllingDevice, ControllingDevice.Builder, ControllingDeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.devicesBuilder_ = null;
                        this.devices_ = controllingDeviceNotification.devices_;
                        this.bitField0_ &= -2;
                        this.devicesBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getDevicesFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(controllingDeviceNotification.devices_);
                    }
                }
                mergeUnknownFields(controllingDeviceNotification.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeDevices(int i14) {
                RepeatedFieldBuilderV3<ControllingDevice, ControllingDevice.Builder, ControllingDeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureDevicesIsMutable();
                this.devices_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setDevices(int i14, ControllingDevice.Builder builder) {
                RepeatedFieldBuilderV3<ControllingDevice, ControllingDevice.Builder, ControllingDeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureDevicesIsMutable();
                this.devices_.set(i14, builder.build());
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
            public ControllingDeviceNotification getDefaultInstanceForType() {
                return ControllingDeviceNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.devices_ = Collections.EMPTY_LIST;
            }

            public ControllingDevice.Builder addDevicesBuilder(int i14) {
                return (ControllingDevice.Builder) getDevicesFieldBuilder().addBuilder(i14, ControllingDevice.getDefaultInstance());
            }

            public Builder addDevices(int i14, ControllingDevice controllingDevice) {
                RepeatedFieldBuilderV3<ControllingDevice, ControllingDevice.Builder, ControllingDeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    controllingDevice.getClass();
                    ensureDevicesIsMutable();
                    this.devices_.add(i14, controllingDevice);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, controllingDevice);
                return this;
            }

            public Builder setDevices(int i14, ControllingDevice controllingDevice) {
                RepeatedFieldBuilderV3<ControllingDevice, ControllingDevice.Builder, ControllingDeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    controllingDevice.getClass();
                    ensureDevicesIsMutable();
                    this.devices_.set(i14, controllingDevice);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, controllingDevice);
                return this;
            }

            public Builder addDevices(ControllingDevice controllingDevice) {
                RepeatedFieldBuilderV3<ControllingDevice, ControllingDevice.Builder, ControllingDeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    controllingDevice.getClass();
                    ensureDevicesIsMutable();
                    this.devices_.add(controllingDevice);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(controllingDevice);
                return this;
            }

            public Builder addDevices(int i14, ControllingDevice.Builder builder) {
                RepeatedFieldBuilderV3<ControllingDevice, ControllingDevice.Builder, ControllingDeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDevicesIsMutable();
                    this.devices_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ControllingDeviceNotification) {
                    return mergeFrom((ControllingDeviceNotification) message);
                }
                super.mergeFrom(message);
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
                                if (tag != 10) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    ControllingDevice controllingDevice = (ControllingDevice) codedInputStream.readMessage(ControllingDevice.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<ControllingDevice, ControllingDevice.Builder, ControllingDeviceOrBuilder> repeatedFieldBuilderV3 = this.devicesBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureDevicesIsMutable();
                                        this.devices_.add(controllingDevice);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(controllingDevice);
                                    }
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
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ControllingDeviceNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ControllingDeviceNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ControllingDeviceNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ControllingDeviceNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ControllingDeviceNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ControllingDeviceNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ControllingDeviceNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ControllingDeviceNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ ControllingDeviceNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ControllingDeviceNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ControllingDeviceNotification parseFrom(InputStream inputStream) {
            return (ControllingDeviceNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ControllingDeviceNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ControllingDeviceNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ControllingDeviceNotification parseFrom(CodedInputStream codedInputStream) {
            return (ControllingDeviceNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ControllingDeviceNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ControllingDeviceNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ControllingDeviceRequest extends GeneratedMessageV3 implements ControllingDeviceRequestOrBuilder {
        public static final int CONTROL_DEVICE_FIELD_NUMBER = 1;
        private static final ControllingDeviceRequest DEFAULT_INSTANCE = new ControllingDeviceRequest();

        @Deprecated
        public static final Parser<ControllingDeviceRequest> PARSER = new AbstractParser<ControllingDeviceRequest>() { // from class: com.garmin.proto.generated.GDIDeviceControlReporting.ControllingDeviceRequest.1
            @Override // com.google.protobuf.Parser
            public ControllingDeviceRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ControllingDeviceRequest.newBuilder();
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
        private int controlDevice_;
        private byte memoizedIsInitialized;

        private ControllingDeviceRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.controlDevice_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ControllingDeviceRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDeviceControlReporting.internal_static_GDI_Proto_DeviceControlReporting_ControllingDeviceRequest_descriptor;
        }

        public static Builder newBuilder(ControllingDeviceRequest controllingDeviceRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(controllingDeviceRequest);
        }

        public static ControllingDeviceRequest parseDelimitedFrom(InputStream inputStream) {
            return (ControllingDeviceRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ControllingDeviceRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ControllingDeviceRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ControllingDeviceRequest)) {
                return super.equals(obj);
            }
            ControllingDeviceRequest controllingDeviceRequest = (ControllingDeviceRequest) obj;
            if (hasControlDevice() != controllingDeviceRequest.hasControlDevice()) {
                return false;
            }
            return (!hasControlDevice() || this.controlDevice_ == controllingDeviceRequest.controlDevice_) && getUnknownFields().equals(controllingDeviceRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ControllingDeviceRequestOrBuilder
        public ControlDevice getControlDevice() {
            ControlDevice controlDeviceForNumber = ControlDevice.forNumber(this.controlDevice_);
            return controlDeviceForNumber == null ? ControlDevice.UNKNOWN : controlDeviceForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ControllingDeviceRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.controlDevice_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ControllingDeviceRequestOrBuilder
        public boolean hasControlDevice() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasControlDevice()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.controlDevice_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDeviceControlReporting.internal_static_GDI_Proto_DeviceControlReporting_ControllingDeviceRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ControllingDeviceRequest.class, Builder.class);
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
            return new ControllingDeviceRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.controlDevice_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ControllingDeviceRequestOrBuilder {
            private int bitField0_;
            private int controlDevice_;

            private Builder() {
                this.controlDevice_ = 0;
            }

            private void buildPartial0(ControllingDeviceRequest controllingDeviceRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    controllingDeviceRequest.controlDevice_ = this.controlDevice_;
                } else {
                    i14 = 0;
                }
                controllingDeviceRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDeviceControlReporting.internal_static_GDI_Proto_DeviceControlReporting_ControllingDeviceRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ControllingDeviceRequest build() {
                ControllingDeviceRequest controllingDeviceRequestBuildPartial = buildPartial();
                if (controllingDeviceRequestBuildPartial.isInitialized()) {
                    return controllingDeviceRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) controllingDeviceRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ControllingDeviceRequest buildPartial() {
                ControllingDeviceRequest controllingDeviceRequest = new ControllingDeviceRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(controllingDeviceRequest);
                }
                onBuilt();
                return controllingDeviceRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.controlDevice_ = 0;
                return this;
            }

            public Builder clearControlDevice() {
                this.bitField0_ &= -2;
                this.controlDevice_ = 0;
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

            @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ControllingDeviceRequestOrBuilder
            public ControlDevice getControlDevice() {
                ControlDevice controlDeviceForNumber = ControlDevice.forNumber(this.controlDevice_);
                return controlDeviceForNumber == null ? ControlDevice.UNKNOWN : controlDeviceForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDeviceControlReporting.internal_static_GDI_Proto_DeviceControlReporting_ControllingDeviceRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ControllingDeviceRequestOrBuilder
            public boolean hasControlDevice() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDeviceControlReporting.internal_static_GDI_Proto_DeviceControlReporting_ControllingDeviceRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ControllingDeviceRequest.class, Builder.class);
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
                                    if (ControlDevice.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.controlDevice_ = i14;
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

            public Builder setControlDevice(ControlDevice controlDevice) {
                controlDevice.getClass();
                this.bitField0_ |= 1;
                this.controlDevice_ = controlDevice.getNumber();
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
            public ControllingDeviceRequest getDefaultInstanceForType() {
                return ControllingDeviceRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.controlDevice_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ControllingDeviceRequest) {
                    return mergeFrom((ControllingDeviceRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ControllingDeviceRequest controllingDeviceRequest) {
                if (controllingDeviceRequest == ControllingDeviceRequest.getDefaultInstance()) {
                    return this;
                }
                if (controllingDeviceRequest.hasControlDevice()) {
                    setControlDevice(controllingDeviceRequest.getControlDevice());
                }
                mergeUnknownFields(controllingDeviceRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ControllingDeviceRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ControllingDeviceRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ControllingDeviceRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ControllingDeviceRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ControllingDeviceRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ControllingDeviceRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ControllingDeviceRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.controlDevice_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ControllingDeviceRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ControllingDeviceRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ControllingDeviceRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ControllingDeviceRequest parseFrom(InputStream inputStream) {
            return (ControllingDeviceRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ControllingDeviceRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ControllingDeviceRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ControllingDeviceRequest parseFrom(CodedInputStream codedInputStream) {
            return (ControllingDeviceRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ControllingDeviceRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ControllingDeviceRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ControllingDeviceResponse extends GeneratedMessageV3 implements ControllingDeviceResponseOrBuilder {
        public static final int DEVICE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ControllingDevice device_;
        private byte memoizedIsInitialized;
        private static final ControllingDeviceResponse DEFAULT_INSTANCE = new ControllingDeviceResponse();

        @Deprecated
        public static final Parser<ControllingDeviceResponse> PARSER = new AbstractParser<ControllingDeviceResponse>() { // from class: com.garmin.proto.generated.GDIDeviceControlReporting.ControllingDeviceResponse.1
            @Override // com.google.protobuf.Parser
            public ControllingDeviceResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ControllingDeviceResponse.newBuilder();
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

        private ControllingDeviceResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ControllingDeviceResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDeviceControlReporting.internal_static_GDI_Proto_DeviceControlReporting_ControllingDeviceResponse_descriptor;
        }

        public static Builder newBuilder(ControllingDeviceResponse controllingDeviceResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(controllingDeviceResponse);
        }

        public static ControllingDeviceResponse parseDelimitedFrom(InputStream inputStream) {
            return (ControllingDeviceResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ControllingDeviceResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ControllingDeviceResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ControllingDeviceResponse)) {
                return super.equals(obj);
            }
            ControllingDeviceResponse controllingDeviceResponse = (ControllingDeviceResponse) obj;
            if (hasDevice() != controllingDeviceResponse.hasDevice()) {
                return false;
            }
            return (!hasDevice() || getDevice().equals(controllingDeviceResponse.getDevice())) && getUnknownFields().equals(controllingDeviceResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ControllingDeviceResponseOrBuilder
        public ControllingDevice getDevice() {
            ControllingDevice controllingDevice = this.device_;
            return controllingDevice == null ? ControllingDevice.getDefaultInstance() : controllingDevice;
        }

        @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ControllingDeviceResponseOrBuilder
        public ControllingDeviceOrBuilder getDeviceOrBuilder() {
            ControllingDevice controllingDevice = this.device_;
            return controllingDevice == null ? ControllingDevice.getDefaultInstance() : controllingDevice;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ControllingDeviceResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getDevice()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ControllingDeviceResponseOrBuilder
        public boolean hasDevice() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasDevice()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getDevice().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDeviceControlReporting.internal_static_GDI_Proto_DeviceControlReporting_ControllingDeviceResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ControllingDeviceResponse.class, Builder.class);
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
            return new ControllingDeviceResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getDevice());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ControllingDeviceResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<ControllingDevice, ControllingDevice.Builder, ControllingDeviceOrBuilder> deviceBuilder_;
            private ControllingDevice device_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ControllingDeviceResponse controllingDeviceResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<ControllingDevice, ControllingDevice.Builder, ControllingDeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
                    controllingDeviceResponse.device_ = singleFieldBuilderV3 == null ? this.device_ : (ControllingDevice) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                controllingDeviceResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDeviceControlReporting.internal_static_GDI_Proto_DeviceControlReporting_ControllingDeviceResponse_descriptor;
            }

            private SingleFieldBuilderV3<ControllingDevice, ControllingDevice.Builder, ControllingDeviceOrBuilder> getDeviceFieldBuilder() {
                if (this.deviceBuilder_ == null) {
                    this.deviceBuilder_ = new SingleFieldBuilderV3<>(getDevice(), getParentForChildren(), isClean());
                    this.device_ = null;
                }
                return this.deviceBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getDeviceFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ControllingDeviceResponse build() {
                ControllingDeviceResponse controllingDeviceResponseBuildPartial = buildPartial();
                if (controllingDeviceResponseBuildPartial.isInitialized()) {
                    return controllingDeviceResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) controllingDeviceResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ControllingDeviceResponse buildPartial() {
                ControllingDeviceResponse controllingDeviceResponse = new ControllingDeviceResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(controllingDeviceResponse);
                }
                onBuilt();
                return controllingDeviceResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.device_ = null;
                SingleFieldBuilderV3<ControllingDevice, ControllingDevice.Builder, ControllingDeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.deviceBuilder_ = null;
                }
                return this;
            }

            public Builder clearDevice() {
                this.bitField0_ &= -2;
                this.device_ = null;
                SingleFieldBuilderV3<ControllingDevice, ControllingDevice.Builder, ControllingDeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.deviceBuilder_ = null;
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
                return GDIDeviceControlReporting.internal_static_GDI_Proto_DeviceControlReporting_ControllingDeviceResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ControllingDeviceResponseOrBuilder
            public ControllingDevice getDevice() {
                SingleFieldBuilderV3<ControllingDevice, ControllingDevice.Builder, ControllingDeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ControllingDevice) singleFieldBuilderV3.getMessage();
                }
                ControllingDevice controllingDevice = this.device_;
                return controllingDevice == null ? ControllingDevice.getDefaultInstance() : controllingDevice;
            }

            public ControllingDevice.Builder getDeviceBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (ControllingDevice.Builder) getDeviceFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ControllingDeviceResponseOrBuilder
            public ControllingDeviceOrBuilder getDeviceOrBuilder() {
                SingleFieldBuilderV3<ControllingDevice, ControllingDevice.Builder, ControllingDeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ControllingDeviceOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ControllingDevice controllingDevice = this.device_;
                return controllingDevice == null ? ControllingDevice.getDefaultInstance() : controllingDevice;
            }

            @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ControllingDeviceResponseOrBuilder
            public boolean hasDevice() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDeviceControlReporting.internal_static_GDI_Proto_DeviceControlReporting_ControllingDeviceResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ControllingDeviceResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeDevice(ControllingDevice controllingDevice) {
                ControllingDevice controllingDevice2;
                SingleFieldBuilderV3<ControllingDevice, ControllingDevice.Builder, ControllingDeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(controllingDevice);
                } else if ((this.bitField0_ & 1) == 0 || (controllingDevice2 = this.device_) == null || controllingDevice2 == ControllingDevice.getDefaultInstance()) {
                    this.device_ = controllingDevice;
                } else {
                    getDeviceBuilder().mergeFrom(controllingDevice);
                }
                if (this.device_ != null) {
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
                                    codedInputStream.readMessage(getDeviceFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setDevice(ControllingDevice.Builder builder) {
                SingleFieldBuilderV3<ControllingDevice, ControllingDevice.Builder, ControllingDeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.device_ = builder.build();
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
            public ControllingDeviceResponse getDefaultInstanceForType() {
                return ControllingDeviceResponse.getDefaultInstance();
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

            public Builder setDevice(ControllingDevice controllingDevice) {
                SingleFieldBuilderV3<ControllingDevice, ControllingDevice.Builder, ControllingDeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
                if (singleFieldBuilderV3 == null) {
                    controllingDevice.getClass();
                    this.device_ = controllingDevice;
                } else {
                    singleFieldBuilderV3.setMessage(controllingDevice);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ControllingDeviceResponse) {
                    return mergeFrom((ControllingDeviceResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ControllingDeviceResponse controllingDeviceResponse) {
                if (controllingDeviceResponse == ControllingDeviceResponse.getDefaultInstance()) {
                    return this;
                }
                if (controllingDeviceResponse.hasDevice()) {
                    mergeDevice(controllingDeviceResponse.getDevice());
                }
                mergeUnknownFields(controllingDeviceResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ControllingDeviceResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ ControllingDeviceResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private ControllingDeviceResponse() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ControllingDeviceResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ControllingDeviceResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ControllingDeviceResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ControllingDeviceResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ControllingDeviceResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ControllingDeviceResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ControllingDeviceResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ControllingDeviceResponse parseFrom(InputStream inputStream) {
            return (ControllingDeviceResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ControllingDeviceResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ControllingDeviceResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ControllingDeviceResponse parseFrom(CodedInputStream codedInputStream) {
            return (ControllingDeviceResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ControllingDeviceResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ControllingDeviceResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        public static final int CONTROLLER_REQUEST_FIELD_NUMBER = 1;
        public static final int CONTROLLER_RESPONSE_FIELD_NUMBER = 2;
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDIDeviceControlReporting.Service.1
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
        private ControllingDeviceRequest controllerRequest_;
        private ControllingDeviceResponse controllerResponse_;
        private byte memoizedIsInitialized;

        private Service(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Service getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDeviceControlReporting.internal_static_GDI_Proto_DeviceControlReporting_Service_descriptor;
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
            if (hasControllerRequest() != service.hasControllerRequest()) {
                return false;
            }
            if ((!hasControllerRequest() || getControllerRequest().equals(service.getControllerRequest())) && hasControllerResponse() == service.hasControllerResponse()) {
                return (!hasControllerResponse() || getControllerResponse().equals(service.getControllerResponse())) && getUnknownFields().equals(service.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ServiceOrBuilder
        public ControllingDeviceRequest getControllerRequest() {
            ControllingDeviceRequest controllingDeviceRequest = this.controllerRequest_;
            return controllingDeviceRequest == null ? ControllingDeviceRequest.getDefaultInstance() : controllingDeviceRequest;
        }

        @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ServiceOrBuilder
        public ControllingDeviceRequestOrBuilder getControllerRequestOrBuilder() {
            ControllingDeviceRequest controllingDeviceRequest = this.controllerRequest_;
            return controllingDeviceRequest == null ? ControllingDeviceRequest.getDefaultInstance() : controllingDeviceRequest;
        }

        @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ServiceOrBuilder
        public ControllingDeviceResponse getControllerResponse() {
            ControllingDeviceResponse controllingDeviceResponse = this.controllerResponse_;
            return controllingDeviceResponse == null ? ControllingDeviceResponse.getDefaultInstance() : controllingDeviceResponse;
        }

        @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ServiceOrBuilder
        public ControllingDeviceResponseOrBuilder getControllerResponseOrBuilder() {
            ControllingDeviceResponse controllingDeviceResponse = this.controllerResponse_;
            return controllingDeviceResponse == null ? ControllingDeviceResponse.getDefaultInstance() : controllingDeviceResponse;
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
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getControllerRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getControllerResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ServiceOrBuilder
        public boolean hasControllerRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ServiceOrBuilder
        public boolean hasControllerResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasControllerRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getControllerRequest().hashCode();
            }
            if (hasControllerResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getControllerResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDeviceControlReporting.internal_static_GDI_Proto_DeviceControlReporting_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getControllerRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getControllerResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<ControllingDeviceRequest, ControllingDeviceRequest.Builder, ControllingDeviceRequestOrBuilder> controllerRequestBuilder_;
            private ControllingDeviceRequest controllerRequest_;
            private SingleFieldBuilderV3<ControllingDeviceResponse, ControllingDeviceResponse.Builder, ControllingDeviceResponseOrBuilder> controllerResponseBuilder_;
            private ControllingDeviceResponse controllerResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Service service) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<ControllingDeviceRequest, ControllingDeviceRequest.Builder, ControllingDeviceRequestOrBuilder> singleFieldBuilderV3 = this.controllerRequestBuilder_;
                    service.controllerRequest_ = singleFieldBuilderV3 == null ? this.controllerRequest_ : (ControllingDeviceRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<ControllingDeviceResponse, ControllingDeviceResponse.Builder, ControllingDeviceResponseOrBuilder> singleFieldBuilderV4 = this.controllerResponseBuilder_;
                    service.controllerResponse_ = singleFieldBuilderV4 == null ? this.controllerResponse_ : (ControllingDeviceResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                service.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<ControllingDeviceRequest, ControllingDeviceRequest.Builder, ControllingDeviceRequestOrBuilder> getControllerRequestFieldBuilder() {
                if (this.controllerRequestBuilder_ == null) {
                    this.controllerRequestBuilder_ = new SingleFieldBuilderV3<>(getControllerRequest(), getParentForChildren(), isClean());
                    this.controllerRequest_ = null;
                }
                return this.controllerRequestBuilder_;
            }

            private SingleFieldBuilderV3<ControllingDeviceResponse, ControllingDeviceResponse.Builder, ControllingDeviceResponseOrBuilder> getControllerResponseFieldBuilder() {
                if (this.controllerResponseBuilder_ == null) {
                    this.controllerResponseBuilder_ = new SingleFieldBuilderV3<>(getControllerResponse(), getParentForChildren(), isClean());
                    this.controllerResponse_ = null;
                }
                return this.controllerResponseBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDeviceControlReporting.internal_static_GDI_Proto_DeviceControlReporting_Service_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getControllerRequestFieldBuilder();
                    getControllerResponseFieldBuilder();
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
                this.controllerRequest_ = null;
                SingleFieldBuilderV3<ControllingDeviceRequest, ControllingDeviceRequest.Builder, ControllingDeviceRequestOrBuilder> singleFieldBuilderV3 = this.controllerRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.controllerRequestBuilder_ = null;
                }
                this.controllerResponse_ = null;
                SingleFieldBuilderV3<ControllingDeviceResponse, ControllingDeviceResponse.Builder, ControllingDeviceResponseOrBuilder> singleFieldBuilderV4 = this.controllerResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.controllerResponseBuilder_ = null;
                }
                return this;
            }

            public Builder clearControllerRequest() {
                this.bitField0_ &= -2;
                this.controllerRequest_ = null;
                SingleFieldBuilderV3<ControllingDeviceRequest, ControllingDeviceRequest.Builder, ControllingDeviceRequestOrBuilder> singleFieldBuilderV3 = this.controllerRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.controllerRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearControllerResponse() {
                this.bitField0_ &= -3;
                this.controllerResponse_ = null;
                SingleFieldBuilderV3<ControllingDeviceResponse, ControllingDeviceResponse.Builder, ControllingDeviceResponseOrBuilder> singleFieldBuilderV3 = this.controllerResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.controllerResponseBuilder_ = null;
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

            @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ServiceOrBuilder
            public ControllingDeviceRequest getControllerRequest() {
                SingleFieldBuilderV3<ControllingDeviceRequest, ControllingDeviceRequest.Builder, ControllingDeviceRequestOrBuilder> singleFieldBuilderV3 = this.controllerRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ControllingDeviceRequest) singleFieldBuilderV3.getMessage();
                }
                ControllingDeviceRequest controllingDeviceRequest = this.controllerRequest_;
                return controllingDeviceRequest == null ? ControllingDeviceRequest.getDefaultInstance() : controllingDeviceRequest;
            }

            public ControllingDeviceRequest.Builder getControllerRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (ControllingDeviceRequest.Builder) getControllerRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ServiceOrBuilder
            public ControllingDeviceRequestOrBuilder getControllerRequestOrBuilder() {
                SingleFieldBuilderV3<ControllingDeviceRequest, ControllingDeviceRequest.Builder, ControllingDeviceRequestOrBuilder> singleFieldBuilderV3 = this.controllerRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ControllingDeviceRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ControllingDeviceRequest controllingDeviceRequest = this.controllerRequest_;
                return controllingDeviceRequest == null ? ControllingDeviceRequest.getDefaultInstance() : controllingDeviceRequest;
            }

            @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ServiceOrBuilder
            public ControllingDeviceResponse getControllerResponse() {
                SingleFieldBuilderV3<ControllingDeviceResponse, ControllingDeviceResponse.Builder, ControllingDeviceResponseOrBuilder> singleFieldBuilderV3 = this.controllerResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ControllingDeviceResponse) singleFieldBuilderV3.getMessage();
                }
                ControllingDeviceResponse controllingDeviceResponse = this.controllerResponse_;
                return controllingDeviceResponse == null ? ControllingDeviceResponse.getDefaultInstance() : controllingDeviceResponse;
            }

            public ControllingDeviceResponse.Builder getControllerResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (ControllingDeviceResponse.Builder) getControllerResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ServiceOrBuilder
            public ControllingDeviceResponseOrBuilder getControllerResponseOrBuilder() {
                SingleFieldBuilderV3<ControllingDeviceResponse, ControllingDeviceResponse.Builder, ControllingDeviceResponseOrBuilder> singleFieldBuilderV3 = this.controllerResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ControllingDeviceResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ControllingDeviceResponse controllingDeviceResponse = this.controllerResponse_;
                return controllingDeviceResponse == null ? ControllingDeviceResponse.getDefaultInstance() : controllingDeviceResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDeviceControlReporting.internal_static_GDI_Proto_DeviceControlReporting_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ServiceOrBuilder
            public boolean hasControllerRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDeviceControlReporting.ServiceOrBuilder
            public boolean hasControllerResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDeviceControlReporting.internal_static_GDI_Proto_DeviceControlReporting_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeControllerRequest(ControllingDeviceRequest controllingDeviceRequest) {
                ControllingDeviceRequest controllingDeviceRequest2;
                SingleFieldBuilderV3<ControllingDeviceRequest, ControllingDeviceRequest.Builder, ControllingDeviceRequestOrBuilder> singleFieldBuilderV3 = this.controllerRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(controllingDeviceRequest);
                } else if ((this.bitField0_ & 1) == 0 || (controllingDeviceRequest2 = this.controllerRequest_) == null || controllingDeviceRequest2 == ControllingDeviceRequest.getDefaultInstance()) {
                    this.controllerRequest_ = controllingDeviceRequest;
                } else {
                    getControllerRequestBuilder().mergeFrom(controllingDeviceRequest);
                }
                if (this.controllerRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeControllerResponse(ControllingDeviceResponse controllingDeviceResponse) {
                ControllingDeviceResponse controllingDeviceResponse2;
                SingleFieldBuilderV3<ControllingDeviceResponse, ControllingDeviceResponse.Builder, ControllingDeviceResponseOrBuilder> singleFieldBuilderV3 = this.controllerResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(controllingDeviceResponse);
                } else if ((this.bitField0_ & 2) == 0 || (controllingDeviceResponse2 = this.controllerResponse_) == null || controllingDeviceResponse2 == ControllingDeviceResponse.getDefaultInstance()) {
                    this.controllerResponse_ = controllingDeviceResponse;
                } else {
                    getControllerResponseBuilder().mergeFrom(controllingDeviceResponse);
                }
                if (this.controllerResponse_ != null) {
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
                                    codedInputStream.readMessage(getControllerRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getControllerResponseFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setControllerRequest(ControllingDeviceRequest.Builder builder) {
                SingleFieldBuilderV3<ControllingDeviceRequest, ControllingDeviceRequest.Builder, ControllingDeviceRequestOrBuilder> singleFieldBuilderV3 = this.controllerRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.controllerRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setControllerResponse(ControllingDeviceResponse.Builder builder) {
                SingleFieldBuilderV3<ControllingDeviceResponse, ControllingDeviceResponse.Builder, ControllingDeviceResponseOrBuilder> singleFieldBuilderV3 = this.controllerResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.controllerResponse_ = builder.build();
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

            public Builder setControllerRequest(ControllingDeviceRequest controllingDeviceRequest) {
                SingleFieldBuilderV3<ControllingDeviceRequest, ControllingDeviceRequest.Builder, ControllingDeviceRequestOrBuilder> singleFieldBuilderV3 = this.controllerRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    controllingDeviceRequest.getClass();
                    this.controllerRequest_ = controllingDeviceRequest;
                } else {
                    singleFieldBuilderV3.setMessage(controllingDeviceRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setControllerResponse(ControllingDeviceResponse controllingDeviceResponse) {
                SingleFieldBuilderV3<ControllingDeviceResponse, ControllingDeviceResponse.Builder, ControllingDeviceResponseOrBuilder> singleFieldBuilderV3 = this.controllerResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    controllingDeviceResponse.getClass();
                    this.controllerResponse_ = controllingDeviceResponse;
                } else {
                    singleFieldBuilderV3.setMessage(controllingDeviceResponse);
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
                if (service.hasControllerRequest()) {
                    mergeControllerRequest(service.getControllerRequest());
                }
                if (service.hasControllerResponse()) {
                    mergeControllerResponse(service.getControllerResponse());
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

    public enum ControlDevice implements ProtocolMessageEnum {
        UNKNOWN(0),
        TRAINER(1);

        public static final int TRAINER_VALUE = 1;
        public static final int UNKNOWN_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<ControlDevice> internalValueMap = new Internal.EnumLiteMap<ControlDevice>() { // from class: com.garmin.proto.generated.GDIDeviceControlReporting.ControlDevice.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ControlDevice findValueByNumber(int i14) {
                return ControlDevice.forNumber(i14);
            }
        };
        private static final ControlDevice[] VALUES = values();

        ControlDevice(int i14) {
            this.value = i14;
        }

        public static ControlDevice forNumber(int i14) {
            if (i14 == 0) {
                return UNKNOWN;
            }
            if (i14 != 1) {
                return null;
            }
            return TRAINER;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIDeviceControlReporting.getDescriptor().getEnumTypes().get(1);
        }

        public static Internal.EnumLiteMap<ControlDevice> internalGetValueMap() {
            return internalValueMap;
        }

        public static ControlDevice valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static ControlDevice valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum ControlStatus implements ProtocolMessageEnum {
        UNCONTROLLED(0),
        REQUESTED(1),
        GRANTED(2),
        REJECTED(3),
        RELEASED(4);

        public static final int GRANTED_VALUE = 2;
        public static final int REJECTED_VALUE = 3;
        public static final int RELEASED_VALUE = 4;
        public static final int REQUESTED_VALUE = 1;
        public static final int UNCONTROLLED_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<ControlStatus> internalValueMap = new Internal.EnumLiteMap<ControlStatus>() { // from class: com.garmin.proto.generated.GDIDeviceControlReporting.ControlStatus.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ControlStatus findValueByNumber(int i14) {
                return ControlStatus.forNumber(i14);
            }
        };
        private static final ControlStatus[] VALUES = values();

        ControlStatus(int i14) {
            this.value = i14;
        }

        public static ControlStatus forNumber(int i14) {
            if (i14 == 0) {
                return UNCONTROLLED;
            }
            if (i14 == 1) {
                return REQUESTED;
            }
            if (i14 == 2) {
                return GRANTED;
            }
            if (i14 == 3) {
                return REJECTED;
            }
            if (i14 != 4) {
                return null;
            }
            return RELEASED;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIDeviceControlReporting.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<ControlStatus> internalGetValueMap() {
            return internalValueMap;
        }

        public static ControlStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static ControlStatus valueOf(int i14) {
            return forNumber(i14);
        }
    }
}
