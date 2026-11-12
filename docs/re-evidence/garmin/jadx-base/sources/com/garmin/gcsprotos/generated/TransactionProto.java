package com.garmin.gcsprotos.generated;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
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

/* JADX INFO: loaded from: classes12.dex */
public final class TransactionProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0011transaction.proto\u0012\tCSM.Proto\u001a\u0012requestTypes.proto\u001a\u0013responseTypes.proto\"à\u0002\n\u0012TransactionRequest\u0012\u0017\n\u000ftransaction_key\u0018\u0001 \u0001(\t\u0012\u0016\n\u000eclient_type_id\u0018\u0002 \u0001(\r\u0012\u0013\n\u000bapp_version\u0018\u0003 \u0001(\t\u0012\u0019\n\u0011transaction_count\u0018\u0004 \u0001(\r\u0012\u0011\n\tgarmin_id\u0018\u0005 \u0001(\u0004\u0012:\n\u000fservice_request\u0018\u0007 \u0003(\u000b2!.CSM.Proto.Service.ServiceRequest\u0012B\n\u0013transaction_context\u0018\b \u0001(\u000b2%.CSM.Proto.Service.TransactionContext\u0012\u001b\n\u0013transaction_timeout\u0018\t \u0001(\r\u0012\u0016\n\u000ecorrelation_id\u0018\n \u0001(\t\u0012!\n\u0006device\u0018\u000b \u0001(\u000b2\u0011.CSM.Proto.Device\"ö\u0001\n\u0013TransactionResponse\u0012<\n\u0012transaction_status\u0018\u0001 \u0001(\u000e2\u001c.CSM.Proto.TransactionStatus:\u0002OK\u0012\u001a\n\u0012timestamp_ms_epoch\u0018\u0002 \u0001(\u0004\u0012<\n\u0010service_response\u0018\u0003 \u0003(\u000b2\".CSM.Proto.Service.ServiceResponse\u0012\u0012\n\nrequest_id\u0018\u0004 \u0001(\u0004\u0012\u0016\n\u000ecorrelation_id\u0018\n \u0001(\t\u0012\u001b\n\u0013next_server_address\u0018\u000b \u0001(\t\"g\n\u0006Device\u0012\u0016\n\u000eproduct_number\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007unit_id\u0018\u0002 \u0001(\u0004\u0012\u0018\n\u0010firmware_version\u0018\u0003 \u0001(\t\u0012\u001a\n\u0012paired_app_version\u0018\u0004 \u0001(\t*r\n\u0011TransactionStatus\u0012\u0006\n\u0002OK\u0010\u0000\u0012\u001a\n\u0016AUTHENTICATION_FAILURE\u0010\u0001\u0012\u001a\n\u0016MESSAGE_FORMAT_FAILURE\u0010\u0002\u0012\u001d\n\u0019TOO_MANY_SERVICE_REQUESTS\u0010\u0003B4\n\u001ecom.garmin.gcsprotos.generatedB\u0010TransactionProtoH\u0003"}, new Descriptors.FileDescriptor[]{RequestTypesProto.getDescriptor(), ResponseTypesProto.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_CSM_Proto_Device_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CSM_Proto_Device_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_CSM_Proto_TransactionRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CSM_Proto_TransactionRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_CSM_Proto_TransactionResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CSM_Proto_TransactionResponse_fieldAccessorTable;

    public interface DeviceOrBuilder extends MessageOrBuilder {
        String getFirmwareVersion();

        ByteString getFirmwareVersionBytes();

        String getPairedAppVersion();

        ByteString getPairedAppVersionBytes();

        String getProductNumber();

        ByteString getProductNumberBytes();

        long getUnitId();

        boolean hasFirmwareVersion();

        boolean hasPairedAppVersion();

        boolean hasProductNumber();

        boolean hasUnitId();
    }

    public interface TransactionRequestOrBuilder extends MessageOrBuilder {
        String getAppVersion();

        ByteString getAppVersionBytes();

        int getClientTypeId();

        String getCorrelationId();

        ByteString getCorrelationIdBytes();

        Device getDevice();

        DeviceOrBuilder getDeviceOrBuilder();

        long getGarminId();

        RequestTypesProto.ServiceRequest getServiceRequest(int i14);

        int getServiceRequestCount();

        List<RequestTypesProto.ServiceRequest> getServiceRequestList();

        RequestTypesProto.ServiceRequestOrBuilder getServiceRequestOrBuilder(int i14);

        List<? extends RequestTypesProto.ServiceRequestOrBuilder> getServiceRequestOrBuilderList();

        RequestTypesProto.TransactionContext getTransactionContext();

        RequestTypesProto.TransactionContextOrBuilder getTransactionContextOrBuilder();

        int getTransactionCount();

        String getTransactionKey();

        ByteString getTransactionKeyBytes();

        int getTransactionTimeout();

        boolean hasAppVersion();

        boolean hasClientTypeId();

        boolean hasCorrelationId();

        boolean hasDevice();

        boolean hasGarminId();

        boolean hasTransactionContext();

        boolean hasTransactionCount();

        boolean hasTransactionKey();

        boolean hasTransactionTimeout();
    }

    public interface TransactionResponseOrBuilder extends MessageOrBuilder {
        String getCorrelationId();

        ByteString getCorrelationIdBytes();

        String getNextServerAddress();

        ByteString getNextServerAddressBytes();

        long getRequestId();

        ResponseTypesProto.ServiceResponse getServiceResponse(int i14);

        int getServiceResponseCount();

        List<ResponseTypesProto.ServiceResponse> getServiceResponseList();

        ResponseTypesProto.ServiceResponseOrBuilder getServiceResponseOrBuilder(int i14);

        List<? extends ResponseTypesProto.ServiceResponseOrBuilder> getServiceResponseOrBuilderList();

        long getTimestampMsEpoch();

        TransactionStatus getTransactionStatus();

        boolean hasCorrelationId();

        boolean hasNextServerAddress();

        boolean hasRequestId();

        boolean hasTimestampMsEpoch();

        boolean hasTransactionStatus();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_CSM_Proto_TransactionRequest_descriptor = descriptor2;
        internal_static_CSM_Proto_TransactionRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"TransactionKey", "ClientTypeId", "AppVersion", "TransactionCount", "GarminId", "ServiceRequest", "TransactionContext", "TransactionTimeout", "CorrelationId", "Device"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_CSM_Proto_TransactionResponse_descriptor = descriptor3;
        internal_static_CSM_Proto_TransactionResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"TransactionStatus", "TimestampMsEpoch", "ServiceResponse", "RequestId", "CorrelationId", "NextServerAddress"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_CSM_Proto_Device_descriptor = descriptor4;
        internal_static_CSM_Proto_Device_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"ProductNumber", "UnitId", "FirmwareVersion", "PairedAppVersion"});
        RequestTypesProto.getDescriptor();
        ResponseTypesProto.getDescriptor();
    }

    private TransactionProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class Device extends GeneratedMessageV3 implements DeviceOrBuilder {
        public static final int FIRMWARE_VERSION_FIELD_NUMBER = 3;
        public static final int PAIRED_APP_VERSION_FIELD_NUMBER = 4;
        public static final int PRODUCT_NUMBER_FIELD_NUMBER = 1;
        public static final int UNIT_ID_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object firmwareVersion_;
        private byte memoizedIsInitialized;
        private volatile Object pairedAppVersion_;
        private volatile Object productNumber_;
        private long unitId_;
        private static final Device DEFAULT_INSTANCE = new Device();

        @Deprecated
        public static final Parser<Device> PARSER = new AbstractParser<Device>() { // from class: com.garmin.gcsprotos.generated.TransactionProto.Device.1
            @Override // com.google.protobuf.Parser
            public Device parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Device.newBuilder();
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

        private Device() {
            this.productNumber_ = "";
            this.unitId_ = 0L;
            this.firmwareVersion_ = "";
            this.pairedAppVersion_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.productNumber_ = "";
            this.firmwareVersion_ = "";
            this.pairedAppVersion_ = "";
        }

        public static Device getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return TransactionProto.internal_static_CSM_Proto_Device_descriptor;
        }

        public static Builder newBuilder(Device device) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(device);
        }

        public static Device parseDelimitedFrom(InputStream inputStream) {
            return (Device) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Device parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Device> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Device)) {
                return super.equals(obj);
            }
            Device device = (Device) obj;
            if (hasProductNumber() != device.hasProductNumber()) {
                return false;
            }
            if ((hasProductNumber() && !getProductNumber().equals(device.getProductNumber())) || hasUnitId() != device.hasUnitId()) {
                return false;
            }
            if ((hasUnitId() && getUnitId() != device.getUnitId()) || hasFirmwareVersion() != device.hasFirmwareVersion()) {
                return false;
            }
            if ((!hasFirmwareVersion() || getFirmwareVersion().equals(device.getFirmwareVersion())) && hasPairedAppVersion() == device.hasPairedAppVersion()) {
                return (!hasPairedAppVersion() || getPairedAppVersion().equals(device.getPairedAppVersion())) && getUnknownFields().equals(device.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.DeviceOrBuilder
        public String getFirmwareVersion() {
            Object obj = this.firmwareVersion_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.firmwareVersion_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.DeviceOrBuilder
        public ByteString getFirmwareVersionBytes() {
            Object obj = this.firmwareVersion_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.firmwareVersion_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.DeviceOrBuilder
        public String getPairedAppVersion() {
            Object obj = this.pairedAppVersion_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.pairedAppVersion_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.DeviceOrBuilder
        public ByteString getPairedAppVersionBytes() {
            Object obj = this.pairedAppVersion_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.pairedAppVersion_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Device> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.DeviceOrBuilder
        public String getProductNumber() {
            Object obj = this.productNumber_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.productNumber_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.DeviceOrBuilder
        public ByteString getProductNumberBytes() {
            Object obj = this.productNumber_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.productNumber_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.productNumber_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt64Size(2, this.unitId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.firmwareVersion_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(4, this.pairedAppVersion_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.DeviceOrBuilder
        public long getUnitId() {
            return this.unitId_;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.DeviceOrBuilder
        public boolean hasFirmwareVersion() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.DeviceOrBuilder
        public boolean hasPairedAppVersion() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.DeviceOrBuilder
        public boolean hasProductNumber() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.DeviceOrBuilder
        public boolean hasUnitId() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasProductNumber()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getProductNumber().hashCode();
            }
            if (hasUnitId()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashLong(getUnitId());
            }
            if (hasFirmwareVersion()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getFirmwareVersion().hashCode();
            }
            if (hasPairedAppVersion()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getPairedAppVersion().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TransactionProto.internal_static_CSM_Proto_Device_fieldAccessorTable.ensureFieldAccessorsInitialized(Device.class, Builder.class);
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
            return new Device();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.productNumber_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt64(2, this.unitId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.firmwareVersion_);
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.pairedAppVersion_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DeviceOrBuilder {
            private int bitField0_;
            private Object firmwareVersion_;
            private Object pairedAppVersion_;
            private Object productNumber_;
            private long unitId_;

            private Builder() {
                this.productNumber_ = "";
                this.firmwareVersion_ = "";
                this.pairedAppVersion_ = "";
            }

            private void buildPartial0(Device device) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    device.productNumber_ = this.productNumber_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    device.unitId_ = this.unitId_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    device.firmwareVersion_ = this.firmwareVersion_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    device.pairedAppVersion_ = this.pairedAppVersion_;
                    i14 |= 8;
                }
                device.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return TransactionProto.internal_static_CSM_Proto_Device_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Device build() {
                Device deviceBuildPartial = buildPartial();
                if (deviceBuildPartial.isInitialized()) {
                    return deviceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) deviceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Device buildPartial() {
                Device device = new Device(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(device);
                }
                onBuilt();
                return device;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.productNumber_ = "";
                this.unitId_ = 0L;
                this.firmwareVersion_ = "";
                this.pairedAppVersion_ = "";
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearFirmwareVersion() {
                this.firmwareVersion_ = Device.getDefaultInstance().getFirmwareVersion();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPairedAppVersion() {
                this.pairedAppVersion_ = Device.getDefaultInstance().getPairedAppVersion();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearProductNumber() {
                this.productNumber_ = Device.getDefaultInstance().getProductNumber();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearUnitId() {
                this.bitField0_ &= -3;
                this.unitId_ = 0L;
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
                return TransactionProto.internal_static_CSM_Proto_Device_descriptor;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.DeviceOrBuilder
            public String getFirmwareVersion() {
                Object obj = this.firmwareVersion_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.firmwareVersion_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.DeviceOrBuilder
            public ByteString getFirmwareVersionBytes() {
                Object obj = this.firmwareVersion_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.firmwareVersion_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.DeviceOrBuilder
            public String getPairedAppVersion() {
                Object obj = this.pairedAppVersion_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.pairedAppVersion_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.DeviceOrBuilder
            public ByteString getPairedAppVersionBytes() {
                Object obj = this.pairedAppVersion_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.pairedAppVersion_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.DeviceOrBuilder
            public String getProductNumber() {
                Object obj = this.productNumber_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.productNumber_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.DeviceOrBuilder
            public ByteString getProductNumberBytes() {
                Object obj = this.productNumber_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.productNumber_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.DeviceOrBuilder
            public long getUnitId() {
                return this.unitId_;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.DeviceOrBuilder
            public boolean hasFirmwareVersion() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.DeviceOrBuilder
            public boolean hasPairedAppVersion() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.DeviceOrBuilder
            public boolean hasProductNumber() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.DeviceOrBuilder
            public boolean hasUnitId() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return TransactionProto.internal_static_CSM_Proto_Device_fieldAccessorTable.ensureFieldAccessorsInitialized(Device.class, Builder.class);
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
                                    this.productNumber_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.unitId_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.firmwareVersion_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.pairedAppVersion_ = codedInputStream.readBytes();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setFirmwareVersion(String str) {
                str.getClass();
                this.firmwareVersion_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setFirmwareVersionBytes(ByteString byteString) {
                byteString.getClass();
                this.firmwareVersion_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPairedAppVersion(String str) {
                str.getClass();
                this.pairedAppVersion_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setPairedAppVersionBytes(ByteString byteString) {
                byteString.getClass();
                this.pairedAppVersion_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setProductNumber(String str) {
                str.getClass();
                this.productNumber_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setProductNumberBytes(ByteString byteString) {
                byteString.getClass();
                this.productNumber_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setUnitId(long j8) {
                this.unitId_ = j8;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Device getDefaultInstanceForType() {
                return Device.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.productNumber_ = "";
                this.firmwareVersion_ = "";
                this.pairedAppVersion_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Device) {
                    return mergeFrom((Device) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Device device) {
                if (device == Device.getDefaultInstance()) {
                    return this;
                }
                if (device.hasProductNumber()) {
                    this.productNumber_ = device.productNumber_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (device.hasUnitId()) {
                    setUnitId(device.getUnitId());
                }
                if (device.hasFirmwareVersion()) {
                    this.firmwareVersion_ = device.firmwareVersion_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (device.hasPairedAppVersion()) {
                    this.pairedAppVersion_ = device.pairedAppVersion_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                mergeUnknownFields(device.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Device getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Device parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Device) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Device parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Device parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Device parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Device parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Device parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Device parseFrom(InputStream inputStream) {
            return (Device) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Device parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Device) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Device parseFrom(CodedInputStream codedInputStream) {
            return (Device) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Device parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Device) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private Device(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.productNumber_ = "";
            this.unitId_ = 0L;
            this.firmwareVersion_ = "";
            this.pairedAppVersion_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ Device(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class TransactionRequest extends GeneratedMessageV3 implements TransactionRequestOrBuilder {
        public static final int APP_VERSION_FIELD_NUMBER = 3;
        public static final int CLIENT_TYPE_ID_FIELD_NUMBER = 2;
        public static final int CORRELATION_ID_FIELD_NUMBER = 10;
        public static final int DEVICE_FIELD_NUMBER = 11;
        public static final int GARMIN_ID_FIELD_NUMBER = 5;
        public static final int SERVICE_REQUEST_FIELD_NUMBER = 7;
        public static final int TRANSACTION_CONTEXT_FIELD_NUMBER = 8;
        public static final int TRANSACTION_COUNT_FIELD_NUMBER = 4;
        public static final int TRANSACTION_KEY_FIELD_NUMBER = 1;
        public static final int TRANSACTION_TIMEOUT_FIELD_NUMBER = 9;
        private static final long serialVersionUID = 0;
        private volatile Object appVersion_;
        private int bitField0_;
        private int clientTypeId_;
        private volatile Object correlationId_;
        private Device device_;
        private long garminId_;
        private byte memoizedIsInitialized;
        private List<RequestTypesProto.ServiceRequest> serviceRequest_;
        private RequestTypesProto.TransactionContext transactionContext_;
        private int transactionCount_;
        private volatile Object transactionKey_;
        private int transactionTimeout_;
        private static final TransactionRequest DEFAULT_INSTANCE = new TransactionRequest();

        @Deprecated
        public static final Parser<TransactionRequest> PARSER = new AbstractParser<TransactionRequest>() { // from class: com.garmin.gcsprotos.generated.TransactionProto.TransactionRequest.1
            @Override // com.google.protobuf.Parser
            public TransactionRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TransactionRequest.newBuilder();
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

        private TransactionRequest() {
            this.transactionKey_ = "";
            this.clientTypeId_ = 0;
            this.appVersion_ = "";
            this.transactionCount_ = 0;
            this.garminId_ = 0L;
            this.transactionTimeout_ = 0;
            this.correlationId_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.transactionKey_ = "";
            this.appVersion_ = "";
            this.serviceRequest_ = Collections.EMPTY_LIST;
            this.correlationId_ = "";
        }

        public static TransactionRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return TransactionProto.internal_static_CSM_Proto_TransactionRequest_descriptor;
        }

        public static Builder newBuilder(TransactionRequest transactionRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(transactionRequest);
        }

        public static TransactionRequest parseDelimitedFrom(InputStream inputStream) {
            return (TransactionRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TransactionRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TransactionRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TransactionRequest)) {
                return super.equals(obj);
            }
            TransactionRequest transactionRequest = (TransactionRequest) obj;
            if (hasTransactionKey() != transactionRequest.hasTransactionKey()) {
                return false;
            }
            if ((hasTransactionKey() && !getTransactionKey().equals(transactionRequest.getTransactionKey())) || hasClientTypeId() != transactionRequest.hasClientTypeId()) {
                return false;
            }
            if ((hasClientTypeId() && getClientTypeId() != transactionRequest.getClientTypeId()) || hasAppVersion() != transactionRequest.hasAppVersion()) {
                return false;
            }
            if ((hasAppVersion() && !getAppVersion().equals(transactionRequest.getAppVersion())) || hasTransactionCount() != transactionRequest.hasTransactionCount()) {
                return false;
            }
            if ((hasTransactionCount() && getTransactionCount() != transactionRequest.getTransactionCount()) || hasGarminId() != transactionRequest.hasGarminId()) {
                return false;
            }
            if ((hasGarminId() && getGarminId() != transactionRequest.getGarminId()) || !getServiceRequestList().equals(transactionRequest.getServiceRequestList()) || hasTransactionContext() != transactionRequest.hasTransactionContext()) {
                return false;
            }
            if ((hasTransactionContext() && !getTransactionContext().equals(transactionRequest.getTransactionContext())) || hasTransactionTimeout() != transactionRequest.hasTransactionTimeout()) {
                return false;
            }
            if ((hasTransactionTimeout() && getTransactionTimeout() != transactionRequest.getTransactionTimeout()) || hasCorrelationId() != transactionRequest.hasCorrelationId()) {
                return false;
            }
            if ((!hasCorrelationId() || getCorrelationId().equals(transactionRequest.getCorrelationId())) && hasDevice() == transactionRequest.hasDevice()) {
                return (!hasDevice() || getDevice().equals(transactionRequest.getDevice())) && getUnknownFields().equals(transactionRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
        public String getAppVersion() {
            Object obj = this.appVersion_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.appVersion_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
        public ByteString getAppVersionBytes() {
            Object obj = this.appVersion_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appVersion_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
        public int getClientTypeId() {
            return this.clientTypeId_;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
        public String getCorrelationId() {
            Object obj = this.correlationId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.correlationId_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
        public ByteString getCorrelationIdBytes() {
            Object obj = this.correlationId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.correlationId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
        public Device getDevice() {
            Device device = this.device_;
            return device == null ? Device.getDefaultInstance() : device;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
        public DeviceOrBuilder getDeviceOrBuilder() {
            Device device = this.device_;
            return device == null ? Device.getDefaultInstance() : device;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
        public long getGarminId() {
            return this.garminId_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TransactionRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.transactionKey_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(2, this.clientTypeId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.appVersion_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(4, this.transactionCount_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt64Size(5, this.garminId_);
            }
            for (int i15 = 0; i15 < this.serviceRequest_.size(); i15++) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(7, this.serviceRequest_.get(i15));
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(8, getTransactionContext());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(9, this.transactionTimeout_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(10, this.correlationId_);
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(11, getDevice());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
        public RequestTypesProto.ServiceRequest getServiceRequest(int i14) {
            return this.serviceRequest_.get(i14);
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
        public int getServiceRequestCount() {
            return this.serviceRequest_.size();
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
        public List<RequestTypesProto.ServiceRequest> getServiceRequestList() {
            return this.serviceRequest_;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
        public RequestTypesProto.ServiceRequestOrBuilder getServiceRequestOrBuilder(int i14) {
            return this.serviceRequest_.get(i14);
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
        public List<? extends RequestTypesProto.ServiceRequestOrBuilder> getServiceRequestOrBuilderList() {
            return this.serviceRequest_;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
        public RequestTypesProto.TransactionContext getTransactionContext() {
            RequestTypesProto.TransactionContext transactionContext = this.transactionContext_;
            return transactionContext == null ? RequestTypesProto.TransactionContext.getDefaultInstance() : transactionContext;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
        public RequestTypesProto.TransactionContextOrBuilder getTransactionContextOrBuilder() {
            RequestTypesProto.TransactionContext transactionContext = this.transactionContext_;
            return transactionContext == null ? RequestTypesProto.TransactionContext.getDefaultInstance() : transactionContext;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
        public int getTransactionCount() {
            return this.transactionCount_;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
        public String getTransactionKey() {
            Object obj = this.transactionKey_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.transactionKey_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
        public ByteString getTransactionKeyBytes() {
            Object obj = this.transactionKey_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.transactionKey_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
        public int getTransactionTimeout() {
            return this.transactionTimeout_;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
        public boolean hasAppVersion() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
        public boolean hasClientTypeId() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
        public boolean hasCorrelationId() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
        public boolean hasDevice() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
        public boolean hasGarminId() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
        public boolean hasTransactionContext() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
        public boolean hasTransactionCount() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
        public boolean hasTransactionKey() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
        public boolean hasTransactionTimeout() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasTransactionKey()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getTransactionKey().hashCode();
            }
            if (hasClientTypeId()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getClientTypeId();
            }
            if (hasAppVersion()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getAppVersion().hashCode();
            }
            if (hasTransactionCount()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getTransactionCount();
            }
            if (hasGarminId()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + Internal.hashLong(getGarminId());
            }
            if (getServiceRequestCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getServiceRequestList().hashCode();
            }
            if (hasTransactionContext()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getTransactionContext().hashCode();
            }
            if (hasTransactionTimeout()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getTransactionTimeout();
            }
            if (hasCorrelationId()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getCorrelationId().hashCode();
            }
            if (hasDevice()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getDevice().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TransactionProto.internal_static_CSM_Proto_TransactionRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(TransactionRequest.class, Builder.class);
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
            for (int i14 = 0; i14 < getServiceRequestCount(); i14++) {
                if (!getServiceRequest(i14).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (!hasTransactionContext() || getTransactionContext().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new TransactionRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.transactionKey_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.clientTypeId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.appVersion_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.transactionCount_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt64(5, this.garminId_);
            }
            for (int i14 = 0; i14 < this.serviceRequest_.size(); i14++) {
                codedOutputStream.writeMessage(7, this.serviceRequest_.get(i14));
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(8, getTransactionContext());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeUInt32(9, this.transactionTimeout_);
            }
            if ((this.bitField0_ & 128) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 10, this.correlationId_);
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(11, getDevice());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TransactionRequestOrBuilder {
            private Object appVersion_;
            private int bitField0_;
            private int clientTypeId_;
            private Object correlationId_;
            private SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> deviceBuilder_;
            private Device device_;
            private long garminId_;
            private RepeatedFieldBuilderV3<RequestTypesProto.ServiceRequest, RequestTypesProto.ServiceRequest.Builder, RequestTypesProto.ServiceRequestOrBuilder> serviceRequestBuilder_;
            private List<RequestTypesProto.ServiceRequest> serviceRequest_;
            private SingleFieldBuilderV3<RequestTypesProto.TransactionContext, RequestTypesProto.TransactionContext.Builder, RequestTypesProto.TransactionContextOrBuilder> transactionContextBuilder_;
            private RequestTypesProto.TransactionContext transactionContext_;
            private int transactionCount_;
            private Object transactionKey_;
            private int transactionTimeout_;

            private Builder() {
                this.transactionKey_ = "";
                this.appVersion_ = "";
                this.serviceRequest_ = Collections.EMPTY_LIST;
                this.correlationId_ = "";
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(TransactionRequest transactionRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    transactionRequest.transactionKey_ = this.transactionKey_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    transactionRequest.clientTypeId_ = this.clientTypeId_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    transactionRequest.appVersion_ = this.appVersion_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    transactionRequest.transactionCount_ = this.transactionCount_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    transactionRequest.garminId_ = this.garminId_;
                    i14 |= 16;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<RequestTypesProto.TransactionContext, RequestTypesProto.TransactionContext.Builder, RequestTypesProto.TransactionContextOrBuilder> singleFieldBuilderV3 = this.transactionContextBuilder_;
                    transactionRequest.transactionContext_ = singleFieldBuilderV3 == null ? this.transactionContext_ : (RequestTypesProto.TransactionContext) singleFieldBuilderV3.build();
                    i14 |= 32;
                }
                if ((i15 & 128) != 0) {
                    transactionRequest.transactionTimeout_ = this.transactionTimeout_;
                    i14 |= 64;
                }
                if ((i15 & 256) != 0) {
                    transactionRequest.correlationId_ = this.correlationId_;
                    i14 |= 128;
                }
                if ((i15 & 512) != 0) {
                    SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> singleFieldBuilderV4 = this.deviceBuilder_;
                    transactionRequest.device_ = singleFieldBuilderV4 == null ? this.device_ : (Device) singleFieldBuilderV4.build();
                    i14 |= 256;
                }
                transactionRequest.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(TransactionRequest transactionRequest) {
                RepeatedFieldBuilderV3<RequestTypesProto.ServiceRequest, RequestTypesProto.ServiceRequest.Builder, RequestTypesProto.ServiceRequestOrBuilder> repeatedFieldBuilderV3 = this.serviceRequestBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    transactionRequest.serviceRequest_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 32) != 0) {
                    this.serviceRequest_ = Collections.unmodifiableList(this.serviceRequest_);
                    this.bitField0_ &= -33;
                }
                transactionRequest.serviceRequest_ = this.serviceRequest_;
            }

            private void ensureServiceRequestIsMutable() {
                if ((this.bitField0_ & 32) == 0) {
                    this.serviceRequest_ = new ArrayList(this.serviceRequest_);
                    this.bitField0_ |= 32;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return TransactionProto.internal_static_CSM_Proto_TransactionRequest_descriptor;
            }

            private SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> getDeviceFieldBuilder() {
                if (this.deviceBuilder_ == null) {
                    this.deviceBuilder_ = new SingleFieldBuilderV3<>(getDevice(), getParentForChildren(), isClean());
                    this.device_ = null;
                }
                return this.deviceBuilder_;
            }

            private RepeatedFieldBuilderV3<RequestTypesProto.ServiceRequest, RequestTypesProto.ServiceRequest.Builder, RequestTypesProto.ServiceRequestOrBuilder> getServiceRequestFieldBuilder() {
                if (this.serviceRequestBuilder_ == null) {
                    this.serviceRequestBuilder_ = new RepeatedFieldBuilderV3<>(this.serviceRequest_, (this.bitField0_ & 32) != 0, getParentForChildren(), isClean());
                    this.serviceRequest_ = null;
                }
                return this.serviceRequestBuilder_;
            }

            private SingleFieldBuilderV3<RequestTypesProto.TransactionContext, RequestTypesProto.TransactionContext.Builder, RequestTypesProto.TransactionContextOrBuilder> getTransactionContextFieldBuilder() {
                if (this.transactionContextBuilder_ == null) {
                    this.transactionContextBuilder_ = new SingleFieldBuilderV3<>(getTransactionContext(), getParentForChildren(), isClean());
                    this.transactionContext_ = null;
                }
                return this.transactionContextBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getServiceRequestFieldBuilder();
                    getTransactionContextFieldBuilder();
                    getDeviceFieldBuilder();
                }
            }

            public Builder addAllServiceRequest(Iterable<? extends RequestTypesProto.ServiceRequest> iterable) {
                RepeatedFieldBuilderV3<RequestTypesProto.ServiceRequest, RequestTypesProto.ServiceRequest.Builder, RequestTypesProto.ServiceRequestOrBuilder> repeatedFieldBuilderV3 = this.serviceRequestBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureServiceRequestIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.serviceRequest_);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addServiceRequest(RequestTypesProto.ServiceRequest.Builder builder) {
                RepeatedFieldBuilderV3<RequestTypesProto.ServiceRequest, RequestTypesProto.ServiceRequest.Builder, RequestTypesProto.ServiceRequestOrBuilder> repeatedFieldBuilderV3 = this.serviceRequestBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureServiceRequestIsMutable();
                this.serviceRequest_.add(builder.build());
                onChanged();
                return this;
            }

            public RequestTypesProto.ServiceRequest.Builder addServiceRequestBuilder() {
                return (RequestTypesProto.ServiceRequest.Builder) getServiceRequestFieldBuilder().addBuilder(RequestTypesProto.ServiceRequest.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TransactionRequest build() {
                TransactionRequest transactionRequestBuildPartial = buildPartial();
                if (transactionRequestBuildPartial.isInitialized()) {
                    return transactionRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) transactionRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TransactionRequest buildPartial() {
                TransactionRequest transactionRequest = new TransactionRequest(this);
                buildPartialRepeatedFields(transactionRequest);
                if (this.bitField0_ != 0) {
                    buildPartial0(transactionRequest);
                }
                onBuilt();
                return transactionRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.transactionKey_ = "";
                this.clientTypeId_ = 0;
                this.appVersion_ = "";
                this.transactionCount_ = 0;
                this.garminId_ = 0L;
                RepeatedFieldBuilderV3<RequestTypesProto.ServiceRequest, RequestTypesProto.ServiceRequest.Builder, RequestTypesProto.ServiceRequestOrBuilder> repeatedFieldBuilderV3 = this.serviceRequestBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.serviceRequest_ = Collections.EMPTY_LIST;
                } else {
                    this.serviceRequest_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -33;
                this.transactionContext_ = null;
                SingleFieldBuilderV3<RequestTypesProto.TransactionContext, RequestTypesProto.TransactionContext.Builder, RequestTypesProto.TransactionContextOrBuilder> singleFieldBuilderV3 = this.transactionContextBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.transactionContextBuilder_ = null;
                }
                this.transactionTimeout_ = 0;
                this.correlationId_ = "";
                this.device_ = null;
                SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> singleFieldBuilderV4 = this.deviceBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.deviceBuilder_ = null;
                }
                return this;
            }

            public Builder clearAppVersion() {
                this.appVersion_ = TransactionRequest.getDefaultInstance().getAppVersion();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearClientTypeId() {
                this.bitField0_ &= -3;
                this.clientTypeId_ = 0;
                onChanged();
                return this;
            }

            public Builder clearCorrelationId() {
                this.correlationId_ = TransactionRequest.getDefaultInstance().getCorrelationId();
                this.bitField0_ &= -257;
                onChanged();
                return this;
            }

            public Builder clearDevice() {
                this.bitField0_ &= -513;
                this.device_ = null;
                SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
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

            public Builder clearGarminId() {
                this.bitField0_ &= -17;
                this.garminId_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearServiceRequest() {
                RepeatedFieldBuilderV3<RequestTypesProto.ServiceRequest, RequestTypesProto.ServiceRequest.Builder, RequestTypesProto.ServiceRequestOrBuilder> repeatedFieldBuilderV3 = this.serviceRequestBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.serviceRequest_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -33;
                onChanged();
                return this;
            }

            public Builder clearTransactionContext() {
                this.bitField0_ &= -65;
                this.transactionContext_ = null;
                SingleFieldBuilderV3<RequestTypesProto.TransactionContext, RequestTypesProto.TransactionContext.Builder, RequestTypesProto.TransactionContextOrBuilder> singleFieldBuilderV3 = this.transactionContextBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.transactionContextBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTransactionCount() {
                this.bitField0_ &= -9;
                this.transactionCount_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTransactionKey() {
                this.transactionKey_ = TransactionRequest.getDefaultInstance().getTransactionKey();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearTransactionTimeout() {
                this.bitField0_ &= -129;
                this.transactionTimeout_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
            public String getAppVersion() {
                Object obj = this.appVersion_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.appVersion_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
            public ByteString getAppVersionBytes() {
                Object obj = this.appVersion_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.appVersion_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
            public int getClientTypeId() {
                return this.clientTypeId_;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
            public String getCorrelationId() {
                Object obj = this.correlationId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.correlationId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
            public ByteString getCorrelationIdBytes() {
                Object obj = this.correlationId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.correlationId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return TransactionProto.internal_static_CSM_Proto_TransactionRequest_descriptor;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
            public Device getDevice() {
                SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Device) singleFieldBuilderV3.getMessage();
                }
                Device device = this.device_;
                return device == null ? Device.getDefaultInstance() : device;
            }

            public Device.Builder getDeviceBuilder() {
                this.bitField0_ |= 512;
                onChanged();
                return (Device.Builder) getDeviceFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
            public DeviceOrBuilder getDeviceOrBuilder() {
                SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DeviceOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Device device = this.device_;
                return device == null ? Device.getDefaultInstance() : device;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
            public long getGarminId() {
                return this.garminId_;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
            public RequestTypesProto.ServiceRequest getServiceRequest(int i14) {
                RepeatedFieldBuilderV3<RequestTypesProto.ServiceRequest, RequestTypesProto.ServiceRequest.Builder, RequestTypesProto.ServiceRequestOrBuilder> repeatedFieldBuilderV3 = this.serviceRequestBuilder_;
                return repeatedFieldBuilderV3 == null ? this.serviceRequest_.get(i14) : (RequestTypesProto.ServiceRequest) repeatedFieldBuilderV3.getMessage(i14);
            }

            public RequestTypesProto.ServiceRequest.Builder getServiceRequestBuilder(int i14) {
                return (RequestTypesProto.ServiceRequest.Builder) getServiceRequestFieldBuilder().getBuilder(i14);
            }

            public List<RequestTypesProto.ServiceRequest.Builder> getServiceRequestBuilderList() {
                return getServiceRequestFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
            public int getServiceRequestCount() {
                RepeatedFieldBuilderV3<RequestTypesProto.ServiceRequest, RequestTypesProto.ServiceRequest.Builder, RequestTypesProto.ServiceRequestOrBuilder> repeatedFieldBuilderV3 = this.serviceRequestBuilder_;
                return repeatedFieldBuilderV3 == null ? this.serviceRequest_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
            public List<RequestTypesProto.ServiceRequest> getServiceRequestList() {
                RepeatedFieldBuilderV3<RequestTypesProto.ServiceRequest, RequestTypesProto.ServiceRequest.Builder, RequestTypesProto.ServiceRequestOrBuilder> repeatedFieldBuilderV3 = this.serviceRequestBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.serviceRequest_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
            public RequestTypesProto.ServiceRequestOrBuilder getServiceRequestOrBuilder(int i14) {
                RepeatedFieldBuilderV3<RequestTypesProto.ServiceRequest, RequestTypesProto.ServiceRequest.Builder, RequestTypesProto.ServiceRequestOrBuilder> repeatedFieldBuilderV3 = this.serviceRequestBuilder_;
                return repeatedFieldBuilderV3 == null ? this.serviceRequest_.get(i14) : (RequestTypesProto.ServiceRequestOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
            public List<? extends RequestTypesProto.ServiceRequestOrBuilder> getServiceRequestOrBuilderList() {
                RepeatedFieldBuilderV3<RequestTypesProto.ServiceRequest, RequestTypesProto.ServiceRequest.Builder, RequestTypesProto.ServiceRequestOrBuilder> repeatedFieldBuilderV3 = this.serviceRequestBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.serviceRequest_);
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
            public RequestTypesProto.TransactionContext getTransactionContext() {
                SingleFieldBuilderV3<RequestTypesProto.TransactionContext, RequestTypesProto.TransactionContext.Builder, RequestTypesProto.TransactionContextOrBuilder> singleFieldBuilderV3 = this.transactionContextBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RequestTypesProto.TransactionContext) singleFieldBuilderV3.getMessage();
                }
                RequestTypesProto.TransactionContext transactionContext = this.transactionContext_;
                return transactionContext == null ? RequestTypesProto.TransactionContext.getDefaultInstance() : transactionContext;
            }

            public RequestTypesProto.TransactionContext.Builder getTransactionContextBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (RequestTypesProto.TransactionContext.Builder) getTransactionContextFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
            public RequestTypesProto.TransactionContextOrBuilder getTransactionContextOrBuilder() {
                SingleFieldBuilderV3<RequestTypesProto.TransactionContext, RequestTypesProto.TransactionContext.Builder, RequestTypesProto.TransactionContextOrBuilder> singleFieldBuilderV3 = this.transactionContextBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RequestTypesProto.TransactionContextOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                RequestTypesProto.TransactionContext transactionContext = this.transactionContext_;
                return transactionContext == null ? RequestTypesProto.TransactionContext.getDefaultInstance() : transactionContext;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
            public int getTransactionCount() {
                return this.transactionCount_;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
            public String getTransactionKey() {
                Object obj = this.transactionKey_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.transactionKey_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
            public ByteString getTransactionKeyBytes() {
                Object obj = this.transactionKey_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.transactionKey_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
            public int getTransactionTimeout() {
                return this.transactionTimeout_;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
            public boolean hasAppVersion() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
            public boolean hasClientTypeId() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
            public boolean hasCorrelationId() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
            public boolean hasDevice() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
            public boolean hasGarminId() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
            public boolean hasTransactionContext() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
            public boolean hasTransactionCount() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
            public boolean hasTransactionKey() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionRequestOrBuilder
            public boolean hasTransactionTimeout() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return TransactionProto.internal_static_CSM_Proto_TransactionRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(TransactionRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i14 = 0; i14 < getServiceRequestCount(); i14++) {
                    if (!getServiceRequest(i14).isInitialized()) {
                        return false;
                    }
                }
                return !hasTransactionContext() || getTransactionContext().isInitialized();
            }

            public Builder mergeDevice(Device device) {
                Device device2;
                SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(device);
                } else if ((this.bitField0_ & 512) == 0 || (device2 = this.device_) == null || device2 == Device.getDefaultInstance()) {
                    this.device_ = device;
                } else {
                    getDeviceBuilder().mergeFrom(device);
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder mergeFrom(TransactionRequest transactionRequest) {
                if (transactionRequest == TransactionRequest.getDefaultInstance()) {
                    return this;
                }
                if (transactionRequest.hasTransactionKey()) {
                    this.transactionKey_ = transactionRequest.transactionKey_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (transactionRequest.hasClientTypeId()) {
                    setClientTypeId(transactionRequest.getClientTypeId());
                }
                if (transactionRequest.hasAppVersion()) {
                    this.appVersion_ = transactionRequest.appVersion_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (transactionRequest.hasTransactionCount()) {
                    setTransactionCount(transactionRequest.getTransactionCount());
                }
                if (transactionRequest.hasGarminId()) {
                    setGarminId(transactionRequest.getGarminId());
                }
                if (this.serviceRequestBuilder_ == null) {
                    if (!transactionRequest.serviceRequest_.isEmpty()) {
                        if (this.serviceRequest_.isEmpty()) {
                            this.serviceRequest_ = transactionRequest.serviceRequest_;
                            this.bitField0_ &= -33;
                        } else {
                            ensureServiceRequestIsMutable();
                            this.serviceRequest_.addAll(transactionRequest.serviceRequest_);
                        }
                        onChanged();
                    }
                } else if (!transactionRequest.serviceRequest_.isEmpty()) {
                    boolean zIsEmpty = this.serviceRequestBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<RequestTypesProto.ServiceRequest, RequestTypesProto.ServiceRequest.Builder, RequestTypesProto.ServiceRequestOrBuilder> repeatedFieldBuilderV3 = this.serviceRequestBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.serviceRequestBuilder_ = null;
                        this.serviceRequest_ = transactionRequest.serviceRequest_;
                        this.bitField0_ &= -33;
                        this.serviceRequestBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getServiceRequestFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(transactionRequest.serviceRequest_);
                    }
                }
                if (transactionRequest.hasTransactionContext()) {
                    mergeTransactionContext(transactionRequest.getTransactionContext());
                }
                if (transactionRequest.hasTransactionTimeout()) {
                    setTransactionTimeout(transactionRequest.getTransactionTimeout());
                }
                if (transactionRequest.hasCorrelationId()) {
                    this.correlationId_ = transactionRequest.correlationId_;
                    this.bitField0_ |= 256;
                    onChanged();
                }
                if (transactionRequest.hasDevice()) {
                    mergeDevice(transactionRequest.getDevice());
                }
                mergeUnknownFields(transactionRequest.getUnknownFields());
                onChanged();
                return this;
            }

            public Builder mergeTransactionContext(RequestTypesProto.TransactionContext transactionContext) {
                RequestTypesProto.TransactionContext transactionContext2;
                SingleFieldBuilderV3<RequestTypesProto.TransactionContext, RequestTypesProto.TransactionContext.Builder, RequestTypesProto.TransactionContextOrBuilder> singleFieldBuilderV3 = this.transactionContextBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(transactionContext);
                } else if ((this.bitField0_ & 64) == 0 || (transactionContext2 = this.transactionContext_) == null || transactionContext2 == RequestTypesProto.TransactionContext.getDefaultInstance()) {
                    this.transactionContext_ = transactionContext;
                } else {
                    getTransactionContextBuilder().mergeFrom(transactionContext);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeServiceRequest(int i14) {
                RepeatedFieldBuilderV3<RequestTypesProto.ServiceRequest, RequestTypesProto.ServiceRequest.Builder, RequestTypesProto.ServiceRequestOrBuilder> repeatedFieldBuilderV3 = this.serviceRequestBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureServiceRequestIsMutable();
                this.serviceRequest_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setAppVersion(String str) {
                str.getClass();
                this.appVersion_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setAppVersionBytes(ByteString byteString) {
                byteString.getClass();
                this.appVersion_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setClientTypeId(int i14) {
                this.clientTypeId_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setCorrelationId(String str) {
                str.getClass();
                this.correlationId_ = str;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setCorrelationIdBytes(ByteString byteString) {
                byteString.getClass();
                this.correlationId_ = byteString;
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setDevice(Device.Builder builder) {
                SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.device_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setGarminId(long j8) {
                this.garminId_ = j8;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setServiceRequest(int i14, RequestTypesProto.ServiceRequest.Builder builder) {
                RepeatedFieldBuilderV3<RequestTypesProto.ServiceRequest, RequestTypesProto.ServiceRequest.Builder, RequestTypesProto.ServiceRequestOrBuilder> repeatedFieldBuilderV3 = this.serviceRequestBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureServiceRequestIsMutable();
                this.serviceRequest_.set(i14, builder.build());
                onChanged();
                return this;
            }

            public Builder setTransactionContext(RequestTypesProto.TransactionContext.Builder builder) {
                SingleFieldBuilderV3<RequestTypesProto.TransactionContext, RequestTypesProto.TransactionContext.Builder, RequestTypesProto.TransactionContextOrBuilder> singleFieldBuilderV3 = this.transactionContextBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.transactionContext_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setTransactionCount(int i14) {
                this.transactionCount_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setTransactionKey(String str) {
                str.getClass();
                this.transactionKey_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTransactionKeyBytes(ByteString byteString) {
                byteString.getClass();
                this.transactionKey_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTransactionTimeout(int i14) {
                this.transactionTimeout_ = i14;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public TransactionRequest getDefaultInstanceForType() {
                return TransactionRequest.getDefaultInstance();
            }

            public RequestTypesProto.ServiceRequest.Builder addServiceRequestBuilder(int i14) {
                return (RequestTypesProto.ServiceRequest.Builder) getServiceRequestFieldBuilder().addBuilder(i14, RequestTypesProto.ServiceRequest.getDefaultInstance());
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.transactionKey_ = "";
                this.appVersion_ = "";
                this.serviceRequest_ = Collections.EMPTY_LIST;
                this.correlationId_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder addServiceRequest(int i14, RequestTypesProto.ServiceRequest serviceRequest) {
                RepeatedFieldBuilderV3<RequestTypesProto.ServiceRequest, RequestTypesProto.ServiceRequest.Builder, RequestTypesProto.ServiceRequestOrBuilder> repeatedFieldBuilderV3 = this.serviceRequestBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    serviceRequest.getClass();
                    ensureServiceRequestIsMutable();
                    this.serviceRequest_.add(i14, serviceRequest);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, serviceRequest);
                return this;
            }

            public Builder setDevice(Device device) {
                SingleFieldBuilderV3<Device, Device.Builder, DeviceOrBuilder> singleFieldBuilderV3 = this.deviceBuilder_;
                if (singleFieldBuilderV3 == null) {
                    device.getClass();
                    this.device_ = device;
                } else {
                    singleFieldBuilderV3.setMessage(device);
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setServiceRequest(int i14, RequestTypesProto.ServiceRequest serviceRequest) {
                RepeatedFieldBuilderV3<RequestTypesProto.ServiceRequest, RequestTypesProto.ServiceRequest.Builder, RequestTypesProto.ServiceRequestOrBuilder> repeatedFieldBuilderV3 = this.serviceRequestBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    serviceRequest.getClass();
                    ensureServiceRequestIsMutable();
                    this.serviceRequest_.set(i14, serviceRequest);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, serviceRequest);
                return this;
            }

            public Builder setTransactionContext(RequestTypesProto.TransactionContext transactionContext) {
                SingleFieldBuilderV3<RequestTypesProto.TransactionContext, RequestTypesProto.TransactionContext.Builder, RequestTypesProto.TransactionContextOrBuilder> singleFieldBuilderV3 = this.transactionContextBuilder_;
                if (singleFieldBuilderV3 == null) {
                    transactionContext.getClass();
                    this.transactionContext_ = transactionContext;
                } else {
                    singleFieldBuilderV3.setMessage(transactionContext);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder addServiceRequest(RequestTypesProto.ServiceRequest serviceRequest) {
                RepeatedFieldBuilderV3<RequestTypesProto.ServiceRequest, RequestTypesProto.ServiceRequest.Builder, RequestTypesProto.ServiceRequestOrBuilder> repeatedFieldBuilderV3 = this.serviceRequestBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    serviceRequest.getClass();
                    ensureServiceRequestIsMutable();
                    this.serviceRequest_.add(serviceRequest);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(serviceRequest);
                return this;
            }

            public Builder addServiceRequest(int i14, RequestTypesProto.ServiceRequest.Builder builder) {
                RepeatedFieldBuilderV3<RequestTypesProto.ServiceRequest, RequestTypesProto.ServiceRequest.Builder, RequestTypesProto.ServiceRequestOrBuilder> repeatedFieldBuilderV3 = this.serviceRequestBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureServiceRequestIsMutable();
                    this.serviceRequest_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TransactionRequest) {
                    return mergeFrom((TransactionRequest) message);
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
                            switch (tag) {
                                case 0:
                                    break;
                                case 10:
                                    this.transactionKey_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                    continue;
                                case 16:
                                    this.clientTypeId_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                    continue;
                                case 26:
                                    this.appVersion_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                    continue;
                                case 32:
                                    this.transactionCount_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                    continue;
                                case 40:
                                    this.garminId_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 16;
                                    continue;
                                case 58:
                                    RequestTypesProto.ServiceRequest serviceRequest = (RequestTypesProto.ServiceRequest) codedInputStream.readMessage(RequestTypesProto.ServiceRequest.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<RequestTypesProto.ServiceRequest, RequestTypesProto.ServiceRequest.Builder, RequestTypesProto.ServiceRequestOrBuilder> repeatedFieldBuilderV3 = this.serviceRequestBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureServiceRequestIsMutable();
                                        this.serviceRequest_.add(serviceRequest);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(serviceRequest);
                                        continue;
                                    }
                                    break;
                                case 66:
                                    codedInputStream.readMessage(getTransactionContextFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                    continue;
                                case 72:
                                    this.transactionTimeout_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 128;
                                    continue;
                                case 82:
                                    this.correlationId_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 256;
                                    continue;
                                case 90:
                                    codedInputStream.readMessage(getDeviceFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 512;
                                    continue;
                                default:
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        break;
                                    }
                                    break;
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
        public TransactionRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static TransactionRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TransactionRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TransactionRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static TransactionRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TransactionRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TransactionRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static TransactionRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static TransactionRequest parseFrom(InputStream inputStream) {
            return (TransactionRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static TransactionRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TransactionRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TransactionRequest parseFrom(CodedInputStream codedInputStream) {
            return (TransactionRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TransactionRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TransactionRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private TransactionRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.transactionKey_ = "";
            this.clientTypeId_ = 0;
            this.appVersion_ = "";
            this.transactionCount_ = 0;
            this.garminId_ = 0L;
            this.transactionTimeout_ = 0;
            this.correlationId_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ TransactionRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class TransactionResponse extends GeneratedMessageV3 implements TransactionResponseOrBuilder {
        public static final int CORRELATION_ID_FIELD_NUMBER = 10;
        public static final int NEXT_SERVER_ADDRESS_FIELD_NUMBER = 11;
        public static final int REQUEST_ID_FIELD_NUMBER = 4;
        public static final int SERVICE_RESPONSE_FIELD_NUMBER = 3;
        public static final int TIMESTAMP_MS_EPOCH_FIELD_NUMBER = 2;
        public static final int TRANSACTION_STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object correlationId_;
        private byte memoizedIsInitialized;
        private volatile Object nextServerAddress_;
        private long requestId_;
        private List<ResponseTypesProto.ServiceResponse> serviceResponse_;
        private long timestampMsEpoch_;
        private int transactionStatus_;
        private static final TransactionResponse DEFAULT_INSTANCE = new TransactionResponse();

        @Deprecated
        public static final Parser<TransactionResponse> PARSER = new AbstractParser<TransactionResponse>() { // from class: com.garmin.gcsprotos.generated.TransactionProto.TransactionResponse.1
            @Override // com.google.protobuf.Parser
            public TransactionResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TransactionResponse.newBuilder();
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

        private TransactionResponse() {
            this.transactionStatus_ = 0;
            this.timestampMsEpoch_ = 0L;
            this.requestId_ = 0L;
            this.correlationId_ = "";
            this.nextServerAddress_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.transactionStatus_ = 0;
            this.serviceResponse_ = Collections.EMPTY_LIST;
            this.correlationId_ = "";
            this.nextServerAddress_ = "";
        }

        public static TransactionResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return TransactionProto.internal_static_CSM_Proto_TransactionResponse_descriptor;
        }

        public static Builder newBuilder(TransactionResponse transactionResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(transactionResponse);
        }

        public static TransactionResponse parseDelimitedFrom(InputStream inputStream) {
            return (TransactionResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TransactionResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TransactionResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TransactionResponse)) {
                return super.equals(obj);
            }
            TransactionResponse transactionResponse = (TransactionResponse) obj;
            if (hasTransactionStatus() != transactionResponse.hasTransactionStatus()) {
                return false;
            }
            if ((hasTransactionStatus() && this.transactionStatus_ != transactionResponse.transactionStatus_) || hasTimestampMsEpoch() != transactionResponse.hasTimestampMsEpoch()) {
                return false;
            }
            if ((hasTimestampMsEpoch() && getTimestampMsEpoch() != transactionResponse.getTimestampMsEpoch()) || !getServiceResponseList().equals(transactionResponse.getServiceResponseList()) || hasRequestId() != transactionResponse.hasRequestId()) {
                return false;
            }
            if ((hasRequestId() && getRequestId() != transactionResponse.getRequestId()) || hasCorrelationId() != transactionResponse.hasCorrelationId()) {
                return false;
            }
            if ((!hasCorrelationId() || getCorrelationId().equals(transactionResponse.getCorrelationId())) && hasNextServerAddress() == transactionResponse.hasNextServerAddress()) {
                return (!hasNextServerAddress() || getNextServerAddress().equals(transactionResponse.getNextServerAddress())) && getUnknownFields().equals(transactionResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionResponseOrBuilder
        public String getCorrelationId() {
            Object obj = this.correlationId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.correlationId_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionResponseOrBuilder
        public ByteString getCorrelationIdBytes() {
            Object obj = this.correlationId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.correlationId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionResponseOrBuilder
        public String getNextServerAddress() {
            Object obj = this.nextServerAddress_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.nextServerAddress_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionResponseOrBuilder
        public ByteString getNextServerAddressBytes() {
            Object obj = this.nextServerAddress_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.nextServerAddress_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TransactionResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionResponseOrBuilder
        public long getRequestId() {
            return this.requestId_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.transactionStatus_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt64Size(2, this.timestampMsEpoch_);
            }
            for (int i15 = 0; i15 < this.serviceResponse_.size(); i15++) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(3, this.serviceResponse_.get(i15));
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt64Size(4, this.requestId_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeEnumSize += GeneratedMessageV3.computeStringSize(10, this.correlationId_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeEnumSize += GeneratedMessageV3.computeStringSize(11, this.nextServerAddress_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionResponseOrBuilder
        public ResponseTypesProto.ServiceResponse getServiceResponse(int i14) {
            return this.serviceResponse_.get(i14);
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionResponseOrBuilder
        public int getServiceResponseCount() {
            return this.serviceResponse_.size();
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionResponseOrBuilder
        public List<ResponseTypesProto.ServiceResponse> getServiceResponseList() {
            return this.serviceResponse_;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionResponseOrBuilder
        public ResponseTypesProto.ServiceResponseOrBuilder getServiceResponseOrBuilder(int i14) {
            return this.serviceResponse_.get(i14);
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionResponseOrBuilder
        public List<? extends ResponseTypesProto.ServiceResponseOrBuilder> getServiceResponseOrBuilderList() {
            return this.serviceResponse_;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionResponseOrBuilder
        public long getTimestampMsEpoch() {
            return this.timestampMsEpoch_;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionResponseOrBuilder
        public TransactionStatus getTransactionStatus() {
            TransactionStatus transactionStatusForNumber = TransactionStatus.forNumber(this.transactionStatus_);
            return transactionStatusForNumber == null ? TransactionStatus.OK : transactionStatusForNumber;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionResponseOrBuilder
        public boolean hasCorrelationId() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionResponseOrBuilder
        public boolean hasNextServerAddress() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionResponseOrBuilder
        public boolean hasRequestId() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionResponseOrBuilder
        public boolean hasTimestampMsEpoch() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionResponseOrBuilder
        public boolean hasTransactionStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasTransactionStatus()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.transactionStatus_;
            }
            if (hasTimestampMsEpoch()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashLong(getTimestampMsEpoch());
            }
            if (getServiceResponseCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getServiceResponseList().hashCode();
            }
            if (hasRequestId()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Internal.hashLong(getRequestId());
            }
            if (hasCorrelationId()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getCorrelationId().hashCode();
            }
            if (hasNextServerAddress()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getNextServerAddress().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return TransactionProto.internal_static_CSM_Proto_TransactionResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(TransactionResponse.class, Builder.class);
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
            for (int i14 = 0; i14 < getServiceResponseCount(); i14++) {
                if (!getServiceResponse(i14).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
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
            return new TransactionResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.transactionStatus_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt64(2, this.timestampMsEpoch_);
            }
            for (int i14 = 0; i14 < this.serviceResponse_.size(); i14++) {
                codedOutputStream.writeMessage(3, this.serviceResponse_.get(i14));
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt64(4, this.requestId_);
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 10, this.correlationId_);
            }
            if ((this.bitField0_ & 16) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 11, this.nextServerAddress_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TransactionResponseOrBuilder {
            private int bitField0_;
            private Object correlationId_;
            private Object nextServerAddress_;
            private long requestId_;
            private RepeatedFieldBuilderV3<ResponseTypesProto.ServiceResponse, ResponseTypesProto.ServiceResponse.Builder, ResponseTypesProto.ServiceResponseOrBuilder> serviceResponseBuilder_;
            private List<ResponseTypesProto.ServiceResponse> serviceResponse_;
            private long timestampMsEpoch_;
            private int transactionStatus_;

            private Builder() {
                this.transactionStatus_ = 0;
                this.serviceResponse_ = Collections.EMPTY_LIST;
                this.correlationId_ = "";
                this.nextServerAddress_ = "";
            }

            private void buildPartial0(TransactionResponse transactionResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    transactionResponse.transactionStatus_ = this.transactionStatus_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    transactionResponse.timestampMsEpoch_ = this.timestampMsEpoch_;
                    i14 |= 2;
                }
                if ((i15 & 8) != 0) {
                    transactionResponse.requestId_ = this.requestId_;
                    i14 |= 4;
                }
                if ((i15 & 16) != 0) {
                    transactionResponse.correlationId_ = this.correlationId_;
                    i14 |= 8;
                }
                if ((i15 & 32) != 0) {
                    transactionResponse.nextServerAddress_ = this.nextServerAddress_;
                    i14 |= 16;
                }
                transactionResponse.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(TransactionResponse transactionResponse) {
                RepeatedFieldBuilderV3<ResponseTypesProto.ServiceResponse, ResponseTypesProto.ServiceResponse.Builder, ResponseTypesProto.ServiceResponseOrBuilder> repeatedFieldBuilderV3 = this.serviceResponseBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    transactionResponse.serviceResponse_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 4) != 0) {
                    this.serviceResponse_ = Collections.unmodifiableList(this.serviceResponse_);
                    this.bitField0_ &= -5;
                }
                transactionResponse.serviceResponse_ = this.serviceResponse_;
            }

            private void ensureServiceResponseIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.serviceResponse_ = new ArrayList(this.serviceResponse_);
                    this.bitField0_ |= 4;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return TransactionProto.internal_static_CSM_Proto_TransactionResponse_descriptor;
            }

            private RepeatedFieldBuilderV3<ResponseTypesProto.ServiceResponse, ResponseTypesProto.ServiceResponse.Builder, ResponseTypesProto.ServiceResponseOrBuilder> getServiceResponseFieldBuilder() {
                if (this.serviceResponseBuilder_ == null) {
                    this.serviceResponseBuilder_ = new RepeatedFieldBuilderV3<>(this.serviceResponse_, (this.bitField0_ & 4) != 0, getParentForChildren(), isClean());
                    this.serviceResponse_ = null;
                }
                return this.serviceResponseBuilder_;
            }

            public Builder addAllServiceResponse(Iterable<? extends ResponseTypesProto.ServiceResponse> iterable) {
                RepeatedFieldBuilderV3<ResponseTypesProto.ServiceResponse, ResponseTypesProto.ServiceResponse.Builder, ResponseTypesProto.ServiceResponseOrBuilder> repeatedFieldBuilderV3 = this.serviceResponseBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureServiceResponseIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.serviceResponse_);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addServiceResponse(ResponseTypesProto.ServiceResponse.Builder builder) {
                RepeatedFieldBuilderV3<ResponseTypesProto.ServiceResponse, ResponseTypesProto.ServiceResponse.Builder, ResponseTypesProto.ServiceResponseOrBuilder> repeatedFieldBuilderV3 = this.serviceResponseBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureServiceResponseIsMutable();
                this.serviceResponse_.add(builder.build());
                onChanged();
                return this;
            }

            public ResponseTypesProto.ServiceResponse.Builder addServiceResponseBuilder() {
                return (ResponseTypesProto.ServiceResponse.Builder) getServiceResponseFieldBuilder().addBuilder(ResponseTypesProto.ServiceResponse.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TransactionResponse build() {
                TransactionResponse transactionResponseBuildPartial = buildPartial();
                if (transactionResponseBuildPartial.isInitialized()) {
                    return transactionResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) transactionResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TransactionResponse buildPartial() {
                TransactionResponse transactionResponse = new TransactionResponse(this);
                buildPartialRepeatedFields(transactionResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(transactionResponse);
                }
                onBuilt();
                return transactionResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.transactionStatus_ = 0;
                this.timestampMsEpoch_ = 0L;
                RepeatedFieldBuilderV3<ResponseTypesProto.ServiceResponse, ResponseTypesProto.ServiceResponse.Builder, ResponseTypesProto.ServiceResponseOrBuilder> repeatedFieldBuilderV3 = this.serviceResponseBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.serviceResponse_ = Collections.EMPTY_LIST;
                } else {
                    this.serviceResponse_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -5;
                this.requestId_ = 0L;
                this.correlationId_ = "";
                this.nextServerAddress_ = "";
                return this;
            }

            public Builder clearCorrelationId() {
                this.correlationId_ = TransactionResponse.getDefaultInstance().getCorrelationId();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearNextServerAddress() {
                this.nextServerAddress_ = TransactionResponse.getDefaultInstance().getNextServerAddress();
                this.bitField0_ &= -33;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearRequestId() {
                this.bitField0_ &= -9;
                this.requestId_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearServiceResponse() {
                RepeatedFieldBuilderV3<ResponseTypesProto.ServiceResponse, ResponseTypesProto.ServiceResponse.Builder, ResponseTypesProto.ServiceResponseOrBuilder> repeatedFieldBuilderV3 = this.serviceResponseBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.serviceResponse_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearTimestampMsEpoch() {
                this.bitField0_ &= -3;
                this.timestampMsEpoch_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearTransactionStatus() {
                this.bitField0_ &= -2;
                this.transactionStatus_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionResponseOrBuilder
            public String getCorrelationId() {
                Object obj = this.correlationId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.correlationId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionResponseOrBuilder
            public ByteString getCorrelationIdBytes() {
                Object obj = this.correlationId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.correlationId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return TransactionProto.internal_static_CSM_Proto_TransactionResponse_descriptor;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionResponseOrBuilder
            public String getNextServerAddress() {
                Object obj = this.nextServerAddress_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.nextServerAddress_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionResponseOrBuilder
            public ByteString getNextServerAddressBytes() {
                Object obj = this.nextServerAddress_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.nextServerAddress_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionResponseOrBuilder
            public long getRequestId() {
                return this.requestId_;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionResponseOrBuilder
            public ResponseTypesProto.ServiceResponse getServiceResponse(int i14) {
                RepeatedFieldBuilderV3<ResponseTypesProto.ServiceResponse, ResponseTypesProto.ServiceResponse.Builder, ResponseTypesProto.ServiceResponseOrBuilder> repeatedFieldBuilderV3 = this.serviceResponseBuilder_;
                return repeatedFieldBuilderV3 == null ? this.serviceResponse_.get(i14) : (ResponseTypesProto.ServiceResponse) repeatedFieldBuilderV3.getMessage(i14);
            }

            public ResponseTypesProto.ServiceResponse.Builder getServiceResponseBuilder(int i14) {
                return (ResponseTypesProto.ServiceResponse.Builder) getServiceResponseFieldBuilder().getBuilder(i14);
            }

            public List<ResponseTypesProto.ServiceResponse.Builder> getServiceResponseBuilderList() {
                return getServiceResponseFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionResponseOrBuilder
            public int getServiceResponseCount() {
                RepeatedFieldBuilderV3<ResponseTypesProto.ServiceResponse, ResponseTypesProto.ServiceResponse.Builder, ResponseTypesProto.ServiceResponseOrBuilder> repeatedFieldBuilderV3 = this.serviceResponseBuilder_;
                return repeatedFieldBuilderV3 == null ? this.serviceResponse_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionResponseOrBuilder
            public List<ResponseTypesProto.ServiceResponse> getServiceResponseList() {
                RepeatedFieldBuilderV3<ResponseTypesProto.ServiceResponse, ResponseTypesProto.ServiceResponse.Builder, ResponseTypesProto.ServiceResponseOrBuilder> repeatedFieldBuilderV3 = this.serviceResponseBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.serviceResponse_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionResponseOrBuilder
            public ResponseTypesProto.ServiceResponseOrBuilder getServiceResponseOrBuilder(int i14) {
                RepeatedFieldBuilderV3<ResponseTypesProto.ServiceResponse, ResponseTypesProto.ServiceResponse.Builder, ResponseTypesProto.ServiceResponseOrBuilder> repeatedFieldBuilderV3 = this.serviceResponseBuilder_;
                return repeatedFieldBuilderV3 == null ? this.serviceResponse_.get(i14) : (ResponseTypesProto.ServiceResponseOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionResponseOrBuilder
            public List<? extends ResponseTypesProto.ServiceResponseOrBuilder> getServiceResponseOrBuilderList() {
                RepeatedFieldBuilderV3<ResponseTypesProto.ServiceResponse, ResponseTypesProto.ServiceResponse.Builder, ResponseTypesProto.ServiceResponseOrBuilder> repeatedFieldBuilderV3 = this.serviceResponseBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.serviceResponse_);
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionResponseOrBuilder
            public long getTimestampMsEpoch() {
                return this.timestampMsEpoch_;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionResponseOrBuilder
            public TransactionStatus getTransactionStatus() {
                TransactionStatus transactionStatusForNumber = TransactionStatus.forNumber(this.transactionStatus_);
                return transactionStatusForNumber == null ? TransactionStatus.OK : transactionStatusForNumber;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionResponseOrBuilder
            public boolean hasCorrelationId() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionResponseOrBuilder
            public boolean hasNextServerAddress() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionResponseOrBuilder
            public boolean hasRequestId() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionResponseOrBuilder
            public boolean hasTimestampMsEpoch() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.TransactionProto.TransactionResponseOrBuilder
            public boolean hasTransactionStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return TransactionProto.internal_static_CSM_Proto_TransactionResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(TransactionResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i14 = 0; i14 < getServiceResponseCount(); i14++) {
                    if (!getServiceResponse(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(TransactionResponse transactionResponse) {
                if (transactionResponse == TransactionResponse.getDefaultInstance()) {
                    return this;
                }
                if (transactionResponse.hasTransactionStatus()) {
                    setTransactionStatus(transactionResponse.getTransactionStatus());
                }
                if (transactionResponse.hasTimestampMsEpoch()) {
                    setTimestampMsEpoch(transactionResponse.getTimestampMsEpoch());
                }
                if (this.serviceResponseBuilder_ == null) {
                    if (!transactionResponse.serviceResponse_.isEmpty()) {
                        if (this.serviceResponse_.isEmpty()) {
                            this.serviceResponse_ = transactionResponse.serviceResponse_;
                            this.bitField0_ &= -5;
                        } else {
                            ensureServiceResponseIsMutable();
                            this.serviceResponse_.addAll(transactionResponse.serviceResponse_);
                        }
                        onChanged();
                    }
                } else if (!transactionResponse.serviceResponse_.isEmpty()) {
                    boolean zIsEmpty = this.serviceResponseBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<ResponseTypesProto.ServiceResponse, ResponseTypesProto.ServiceResponse.Builder, ResponseTypesProto.ServiceResponseOrBuilder> repeatedFieldBuilderV3 = this.serviceResponseBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.serviceResponseBuilder_ = null;
                        this.serviceResponse_ = transactionResponse.serviceResponse_;
                        this.bitField0_ &= -5;
                        this.serviceResponseBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getServiceResponseFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(transactionResponse.serviceResponse_);
                    }
                }
                if (transactionResponse.hasRequestId()) {
                    setRequestId(transactionResponse.getRequestId());
                }
                if (transactionResponse.hasCorrelationId()) {
                    this.correlationId_ = transactionResponse.correlationId_;
                    this.bitField0_ |= 16;
                    onChanged();
                }
                if (transactionResponse.hasNextServerAddress()) {
                    this.nextServerAddress_ = transactionResponse.nextServerAddress_;
                    this.bitField0_ |= 32;
                    onChanged();
                }
                mergeUnknownFields(transactionResponse.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeServiceResponse(int i14) {
                RepeatedFieldBuilderV3<ResponseTypesProto.ServiceResponse, ResponseTypesProto.ServiceResponse.Builder, ResponseTypesProto.ServiceResponseOrBuilder> repeatedFieldBuilderV3 = this.serviceResponseBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureServiceResponseIsMutable();
                this.serviceResponse_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setCorrelationId(String str) {
                str.getClass();
                this.correlationId_ = str;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setCorrelationIdBytes(ByteString byteString) {
                byteString.getClass();
                this.correlationId_ = byteString;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setNextServerAddress(String str) {
                str.getClass();
                this.nextServerAddress_ = str;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setNextServerAddressBytes(ByteString byteString) {
                byteString.getClass();
                this.nextServerAddress_ = byteString;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setRequestId(long j8) {
                this.requestId_ = j8;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setServiceResponse(int i14, ResponseTypesProto.ServiceResponse.Builder builder) {
                RepeatedFieldBuilderV3<ResponseTypesProto.ServiceResponse, ResponseTypesProto.ServiceResponse.Builder, ResponseTypesProto.ServiceResponseOrBuilder> repeatedFieldBuilderV3 = this.serviceResponseBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureServiceResponseIsMutable();
                this.serviceResponse_.set(i14, builder.build());
                onChanged();
                return this;
            }

            public Builder setTimestampMsEpoch(long j8) {
                this.timestampMsEpoch_ = j8;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTransactionStatus(TransactionStatus transactionStatus) {
                transactionStatus.getClass();
                this.bitField0_ |= 1;
                this.transactionStatus_ = transactionStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public TransactionResponse getDefaultInstanceForType() {
                return TransactionResponse.getDefaultInstance();
            }

            public ResponseTypesProto.ServiceResponse.Builder addServiceResponseBuilder(int i14) {
                return (ResponseTypesProto.ServiceResponse.Builder) getServiceResponseFieldBuilder().addBuilder(i14, ResponseTypesProto.ServiceResponse.getDefaultInstance());
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.transactionStatus_ = 0;
                this.serviceResponse_ = Collections.EMPTY_LIST;
                this.correlationId_ = "";
                this.nextServerAddress_ = "";
            }

            public Builder addServiceResponse(int i14, ResponseTypesProto.ServiceResponse serviceResponse) {
                RepeatedFieldBuilderV3<ResponseTypesProto.ServiceResponse, ResponseTypesProto.ServiceResponse.Builder, ResponseTypesProto.ServiceResponseOrBuilder> repeatedFieldBuilderV3 = this.serviceResponseBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    serviceResponse.getClass();
                    ensureServiceResponseIsMutable();
                    this.serviceResponse_.add(i14, serviceResponse);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, serviceResponse);
                return this;
            }

            public Builder setServiceResponse(int i14, ResponseTypesProto.ServiceResponse serviceResponse) {
                RepeatedFieldBuilderV3<ResponseTypesProto.ServiceResponse, ResponseTypesProto.ServiceResponse.Builder, ResponseTypesProto.ServiceResponseOrBuilder> repeatedFieldBuilderV3 = this.serviceResponseBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    serviceResponse.getClass();
                    ensureServiceResponseIsMutable();
                    this.serviceResponse_.set(i14, serviceResponse);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, serviceResponse);
                return this;
            }

            public Builder addServiceResponse(ResponseTypesProto.ServiceResponse serviceResponse) {
                RepeatedFieldBuilderV3<ResponseTypesProto.ServiceResponse, ResponseTypesProto.ServiceResponse.Builder, ResponseTypesProto.ServiceResponseOrBuilder> repeatedFieldBuilderV3 = this.serviceResponseBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    serviceResponse.getClass();
                    ensureServiceResponseIsMutable();
                    this.serviceResponse_.add(serviceResponse);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(serviceResponse);
                return this;
            }

            public Builder addServiceResponse(int i14, ResponseTypesProto.ServiceResponse.Builder builder) {
                RepeatedFieldBuilderV3<ResponseTypesProto.ServiceResponse, ResponseTypesProto.ServiceResponse.Builder, ResponseTypesProto.ServiceResponseOrBuilder> repeatedFieldBuilderV3 = this.serviceResponseBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureServiceResponseIsMutable();
                    this.serviceResponse_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TransactionResponse) {
                    return mergeFrom((TransactionResponse) message);
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
                                if (tag == 8) {
                                    int i14 = codedInputStream.readEnum();
                                    if (TransactionStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.transactionStatus_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    this.timestampMsEpoch_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    ResponseTypesProto.ServiceResponse serviceResponse = (ResponseTypesProto.ServiceResponse) codedInputStream.readMessage(ResponseTypesProto.ServiceResponse.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<ResponseTypesProto.ServiceResponse, ResponseTypesProto.ServiceResponse.Builder, ResponseTypesProto.ServiceResponseOrBuilder> repeatedFieldBuilderV3 = this.serviceResponseBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureServiceResponseIsMutable();
                                        this.serviceResponse_.add(serviceResponse);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(serviceResponse);
                                    }
                                } else if (tag == 32) {
                                    this.requestId_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 8;
                                } else if (tag == 82) {
                                    this.correlationId_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 16;
                                } else if (tag != 90) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.nextServerAddress_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 32;
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
        public TransactionResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static TransactionResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TransactionResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TransactionResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static TransactionResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TransactionResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TransactionResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static TransactionResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static TransactionResponse parseFrom(InputStream inputStream) {
            return (TransactionResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static TransactionResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TransactionResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TransactionResponse parseFrom(CodedInputStream codedInputStream) {
            return (TransactionResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TransactionResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TransactionResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private TransactionResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.transactionStatus_ = 0;
            this.timestampMsEpoch_ = 0L;
            this.requestId_ = 0L;
            this.correlationId_ = "";
            this.nextServerAddress_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ TransactionResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public enum TransactionStatus implements ProtocolMessageEnum {
        OK(0),
        AUTHENTICATION_FAILURE(1),
        MESSAGE_FORMAT_FAILURE(2),
        TOO_MANY_SERVICE_REQUESTS(3);

        public static final int AUTHENTICATION_FAILURE_VALUE = 1;
        public static final int MESSAGE_FORMAT_FAILURE_VALUE = 2;
        public static final int OK_VALUE = 0;
        public static final int TOO_MANY_SERVICE_REQUESTS_VALUE = 3;
        private final int value;
        private static final Internal.EnumLiteMap<TransactionStatus> internalValueMap = new Internal.EnumLiteMap<TransactionStatus>() { // from class: com.garmin.gcsprotos.generated.TransactionProto.TransactionStatus.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public TransactionStatus findValueByNumber(int i14) {
                return TransactionStatus.forNumber(i14);
            }
        };
        private static final TransactionStatus[] VALUES = values();

        TransactionStatus(int i14) {
            this.value = i14;
        }

        public static TransactionStatus forNumber(int i14) {
            if (i14 == 0) {
                return OK;
            }
            if (i14 == 1) {
                return AUTHENTICATION_FAILURE;
            }
            if (i14 == 2) {
                return MESSAGE_FORMAT_FAILURE;
            }
            if (i14 != 3) {
                return null;
            }
            return TOO_MANY_SERVICE_REQUESTS;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return TransactionProto.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<TransactionStatus> internalGetValueMap() {
            return internalValueMap;
        }

        public static TransactionStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static TransactionStatus valueOf(int i14) {
            return forNumber(i14);
        }
    }
}
