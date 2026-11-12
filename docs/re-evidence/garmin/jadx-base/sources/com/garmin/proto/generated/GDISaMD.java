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
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import i3.e5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import vb.h;

/* JADX INFO: loaded from: classes6.dex */
public final class GDISaMD {
    public static final int REQUESTSAMDCAPABILITIES_FIELD_NUMBER = 10;
    public static final int RESPONSESAMDCAPABILITIES_FIELD_NUMBER = 10;
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SaMD_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SaMD_Service_fieldAccessorTable;
    public static final GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesRequest, ByteString> requestSaMDCapabilities;
    public static final GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesResponse, ByteString> responseSaMDCapabilities;

    public interface ServiceOrBuilder extends MessageOrBuilder {
        ByteString getEcgService();

        ByteString getGarminHealthService();

        String getGarminHealthServiceFileTransfer();

        ByteString getGarminHealthServiceFileTransferBytes();

        boolean hasEcgService();

        boolean hasGarminHealthService();

        boolean hasGarminHealthServiceFileTransfer();
    }

    static {
        GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesRequest, ByteString> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(ByteString.class, null);
        requestSaMDCapabilities = generatedExtensionNewFileScopedGeneratedExtension;
        GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesResponse, ByteString> generatedExtensionNewFileScopedGeneratedExtension2 = GeneratedMessage.newFileScopedGeneratedExtension(ByteString.class, null);
        responseSaMDCapabilities = generatedExtensionNewFileScopedGeneratedExtension2;
        descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\rGDISaMD.proto\u0012\u000eGDI.Proto.SaMD\u001a\rGDICore.proto\"j\n\u0007Service\u0012\u001d\n\u0015garmin_health_service\u0018\u0001 \u0001(\f\u0012\u0013\n\u000becg_service\u0018\u0002 \u0001(\f\u0012+\n#garmin_health_service_file_transfer\u0018\u0003 \u0001(\t*^\n\u000eCapabilityBits\u0012\u0019\n\u0015EMBEDDED_HEALTH_TOKEN\u0010\u0000\u0012\u000f\n\u000bECG_SERVICE\u0010\u0001\u0012\u0011\n\rFILE_TRANSFER\u0010\u0002\u0012\r\n\tDATA_XFER\u0010\u0003*\u009f\u0001\n\u0012SaMDCommonFailures\u0012\t\n\u0005OTHER\u0010\u0000\u0012\r\n\tNOT_READY\u0010\u0001\u0012\u000e\n\nGHS_SERVER\u0010\u0002\u0012\u0019\n\u0015NO_NETWORK_CONNECTION\u0010\u0003\u0012\u0015\n\u0011NO_UPLOAD_CONSENT\u0010\u0004\u0012\u0018\n\u0014NO_APP_AUTHORIZATION\u0010\u0005\u0012\u0013\n\u000fSAMDID_MISMATCH\u0010\u0006:K\n\u0017requestSaMDCapabilities\u0012*.GDI.Proto.Core.FeatureCapabilitiesRequest\u0018\n \u0001(\f:M\n\u0018responseSaMDCapabilities\u0012+.GDI.Proto.Core.FeatureCapabilitiesResponse\u0018\n \u0001(\fB'\n\u001acom.garmin.proto.generatedB\u0007GDISaMDH\u0003"}, new Descriptors.FileDescriptor[]{GDICore.getDescriptor()});
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_SaMD_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_SaMD_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"GarminHealthService", "EcgService", "GarminHealthServiceFileTransfer"});
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(descriptor.getExtensions().get(0));
        generatedExtensionNewFileScopedGeneratedExtension2.internalInit(descriptor.getExtensions().get(1));
        GDICore.getDescriptor();
    }

    private GDISaMD() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(requestSaMDCapabilities);
        extensionRegistryLite.add(responseSaMDCapabilities);
    }

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        public static final int ECG_SERVICE_FIELD_NUMBER = 2;
        public static final int GARMIN_HEALTH_SERVICE_FIELD_NUMBER = 1;
        public static final int GARMIN_HEALTH_SERVICE_FILE_TRANSFER_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString ecgService_;
        private volatile Object garminHealthServiceFileTransfer_;
        private ByteString garminHealthService_;
        private byte memoizedIsInitialized;
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDISaMD.Service.1
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

        private Service() {
            ByteString byteString = ByteString.EMPTY;
            this.garminHealthService_ = byteString;
            this.ecgService_ = byteString;
            this.garminHealthServiceFileTransfer_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.garminHealthService_ = byteString;
            this.ecgService_ = byteString;
            this.garminHealthServiceFileTransfer_ = "";
        }

        public static Service getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISaMD.internal_static_GDI_Proto_SaMD_Service_descriptor;
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
            if (hasGarminHealthService() != service.hasGarminHealthService()) {
                return false;
            }
            if ((hasGarminHealthService() && !getGarminHealthService().equals(service.getGarminHealthService())) || hasEcgService() != service.hasEcgService()) {
                return false;
            }
            if ((!hasEcgService() || getEcgService().equals(service.getEcgService())) && hasGarminHealthServiceFileTransfer() == service.hasGarminHealthServiceFileTransfer()) {
                return (!hasGarminHealthServiceFileTransfer() || getGarminHealthServiceFileTransfer().equals(service.getGarminHealthServiceFileTransfer())) && getUnknownFields().equals(service.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDISaMD.ServiceOrBuilder
        public ByteString getEcgService() {
            return this.ecgService_;
        }

        @Override // com.garmin.proto.generated.GDISaMD.ServiceOrBuilder
        public ByteString getGarminHealthService() {
            return this.garminHealthService_;
        }

        @Override // com.garmin.proto.generated.GDISaMD.ServiceOrBuilder
        public String getGarminHealthServiceFileTransfer() {
            Object obj = this.garminHealthServiceFileTransfer_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.garminHealthServiceFileTransfer_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDISaMD.ServiceOrBuilder
        public ByteString getGarminHealthServiceFileTransferBytes() {
            Object obj = this.garminHealthServiceFileTransfer_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.garminHealthServiceFileTransfer_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
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
            int iComputeBytesSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.garminHealthService_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBytesSize += CodedOutputStream.computeBytesSize(2, this.ecgService_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeBytesSize += GeneratedMessageV3.computeStringSize(3, this.garminHealthServiceFileTransfer_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBytesSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISaMD.ServiceOrBuilder
        public boolean hasEcgService() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDISaMD.ServiceOrBuilder
        public boolean hasGarminHealthService() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDISaMD.ServiceOrBuilder
        public boolean hasGarminHealthServiceFileTransfer() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasGarminHealthService()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getGarminHealthService().hashCode();
            }
            if (hasEcgService()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getEcgService().hashCode();
            }
            if (hasGarminHealthServiceFileTransfer()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getGarminHealthServiceFileTransfer().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISaMD.internal_static_GDI_Proto_SaMD_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
                codedOutputStream.writeBytes(1, this.garminHealthService_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBytes(2, this.ecgService_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.garminHealthServiceFileTransfer_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private int bitField0_;
            private ByteString ecgService_;
            private Object garminHealthServiceFileTransfer_;
            private ByteString garminHealthService_;

            private Builder() {
                ByteString byteString = ByteString.EMPTY;
                this.garminHealthService_ = byteString;
                this.ecgService_ = byteString;
                this.garminHealthServiceFileTransfer_ = "";
            }

            private void buildPartial0(Service service) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    service.garminHealthService_ = this.garminHealthService_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    service.ecgService_ = this.ecgService_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    service.garminHealthServiceFileTransfer_ = this.garminHealthServiceFileTransfer_;
                    i14 |= 4;
                }
                service.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISaMD.internal_static_GDI_Proto_SaMD_Service_descriptor;
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
                ByteString byteString = ByteString.EMPTY;
                this.garminHealthService_ = byteString;
                this.ecgService_ = byteString;
                this.garminHealthServiceFileTransfer_ = "";
                return this;
            }

            public Builder clearEcgService() {
                this.bitField0_ &= -3;
                this.ecgService_ = Service.getDefaultInstance().getEcgService();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGarminHealthService() {
                this.bitField0_ &= -2;
                this.garminHealthService_ = Service.getDefaultInstance().getGarminHealthService();
                onChanged();
                return this;
            }

            public Builder clearGarminHealthServiceFileTransfer() {
                this.garminHealthServiceFileTransfer_ = Service.getDefaultInstance().getGarminHealthServiceFileTransfer();
                this.bitField0_ &= -5;
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
                return GDISaMD.internal_static_GDI_Proto_SaMD_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISaMD.ServiceOrBuilder
            public ByteString getEcgService() {
                return this.ecgService_;
            }

            @Override // com.garmin.proto.generated.GDISaMD.ServiceOrBuilder
            public ByteString getGarminHealthService() {
                return this.garminHealthService_;
            }

            @Override // com.garmin.proto.generated.GDISaMD.ServiceOrBuilder
            public String getGarminHealthServiceFileTransfer() {
                Object obj = this.garminHealthServiceFileTransfer_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.garminHealthServiceFileTransfer_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDISaMD.ServiceOrBuilder
            public ByteString getGarminHealthServiceFileTransferBytes() {
                Object obj = this.garminHealthServiceFileTransfer_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.garminHealthServiceFileTransfer_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDISaMD.ServiceOrBuilder
            public boolean hasEcgService() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDISaMD.ServiceOrBuilder
            public boolean hasGarminHealthService() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDISaMD.ServiceOrBuilder
            public boolean hasGarminHealthServiceFileTransfer() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISaMD.internal_static_GDI_Proto_SaMD_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
                                    this.garminHealthService_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.ecgService_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.garminHealthServiceFileTransfer_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
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

            public Builder setEcgService(ByteString byteString) {
                byteString.getClass();
                this.ecgService_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setGarminHealthService(ByteString byteString) {
                byteString.getClass();
                this.garminHealthService_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setGarminHealthServiceFileTransfer(String str) {
                str.getClass();
                this.garminHealthServiceFileTransfer_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setGarminHealthServiceFileTransferBytes(ByteString byteString) {
                byteString.getClass();
                this.garminHealthServiceFileTransfer_ = byteString;
                this.bitField0_ |= 4;
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
                ByteString byteString = ByteString.EMPTY;
                this.garminHealthService_ = byteString;
                this.ecgService_ = byteString;
                this.garminHealthServiceFileTransfer_ = "";
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
                if (service.hasGarminHealthService()) {
                    setGarminHealthService(service.getGarminHealthService());
                }
                if (service.hasEcgService()) {
                    setEcgService(service.getEcgService());
                }
                if (service.hasGarminHealthServiceFileTransfer()) {
                    this.garminHealthServiceFileTransfer_ = service.garminHealthServiceFileTransfer_;
                    this.bitField0_ |= 4;
                    onChanged();
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

        private Service(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            ByteString byteString = ByteString.EMPTY;
            this.garminHealthService_ = byteString;
            this.ecgService_ = byteString;
            this.garminHealthServiceFileTransfer_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ Service(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public enum CapabilityBits implements ProtocolMessageEnum {
        EMBEDDED_HEALTH_TOKEN(0),
        ECG_SERVICE(1),
        FILE_TRANSFER(2),
        DATA_XFER(3);

        public static final int DATA_XFER_VALUE = 3;
        public static final int ECG_SERVICE_VALUE = 1;
        public static final int EMBEDDED_HEALTH_TOKEN_VALUE = 0;
        public static final int FILE_TRANSFER_VALUE = 2;
        private final int value;
        private static final Internal.EnumLiteMap<CapabilityBits> internalValueMap = new Internal.EnumLiteMap<CapabilityBits>() { // from class: com.garmin.proto.generated.GDISaMD.CapabilityBits.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public CapabilityBits findValueByNumber(int i14) {
                return CapabilityBits.forNumber(i14);
            }
        };
        private static final CapabilityBits[] VALUES = values();

        CapabilityBits(int i14) {
            this.value = i14;
        }

        public static CapabilityBits forNumber(int i14) {
            if (i14 == 0) {
                return EMBEDDED_HEALTH_TOKEN;
            }
            if (i14 == 1) {
                return ECG_SERVICE;
            }
            if (i14 == 2) {
                return FILE_TRANSFER;
            }
            if (i14 != 3) {
                return null;
            }
            return DATA_XFER;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDISaMD.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<CapabilityBits> internalGetValueMap() {
            return internalValueMap;
        }

        public static CapabilityBits valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static CapabilityBits valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum SaMDCommonFailures implements ProtocolMessageEnum {
        OTHER(0),
        NOT_READY(1),
        GHS_SERVER(2),
        NO_NETWORK_CONNECTION(3),
        NO_UPLOAD_CONSENT(4),
        NO_APP_AUTHORIZATION(5),
        SAMDID_MISMATCH(6);

        public static final int GHS_SERVER_VALUE = 2;
        public static final int NOT_READY_VALUE = 1;
        public static final int NO_APP_AUTHORIZATION_VALUE = 5;
        public static final int NO_NETWORK_CONNECTION_VALUE = 3;
        public static final int NO_UPLOAD_CONSENT_VALUE = 4;
        public static final int OTHER_VALUE = 0;
        public static final int SAMDID_MISMATCH_VALUE = 6;
        private final int value;
        private static final Internal.EnumLiteMap<SaMDCommonFailures> internalValueMap = new Internal.EnumLiteMap<SaMDCommonFailures>() { // from class: com.garmin.proto.generated.GDISaMD.SaMDCommonFailures.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SaMDCommonFailures findValueByNumber(int i14) {
                return SaMDCommonFailures.forNumber(i14);
            }
        };
        private static final SaMDCommonFailures[] VALUES = values();

        SaMDCommonFailures(int i14) {
            this.value = i14;
        }

        public static SaMDCommonFailures forNumber(int i14) {
            switch (i14) {
                case 0:
                    return OTHER;
                case 1:
                    return NOT_READY;
                case 2:
                    return GHS_SERVER;
                case 3:
                    return NO_NETWORK_CONNECTION;
                case 4:
                    return NO_UPLOAD_CONSENT;
                case 5:
                    return NO_APP_AUTHORIZATION;
                case 6:
                    return SAMDID_MISMATCH;
                default:
                    return null;
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDISaMD.getDescriptor().getEnumTypes().get(1);
        }

        public static Internal.EnumLiteMap<SaMDCommonFailures> internalGetValueMap() {
            return internalValueMap;
        }

        public static SaMDCommonFailures valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static SaMDCommonFailures valueOf(int i14) {
            return forNumber(i14);
        }
    }
}
