package com.garmin.gcsprotos.generated;

import com.google.protobuf.AbstractMessage;
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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import i3.e5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import vb.h;

/* JADX INFO: loaded from: classes12.dex */
public final class PairedDeviceAuth {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0016pairedDeviceAuth.proto\u0012\u001aCSM.Proto.PairedDeviceAuth\u001a\u000fdataTypes.proto\"¨\u0001\n\u001cPairedDeviceAuthorizeRequest\u0012B\n\u0016base_device_identifier\u0018\u0001 \u0001(\u000b2\".CSM.Proto.Common.DeviceIdentifier\u0012D\n\u0018paired_device_identifier\u0018\u0002 \u0001(\u000b2\".CSM.Proto.Common.DeviceIdentifier\"ª\u0002\n\u001dPairedDeviceAuthorizeResponse\u0012T\n\u0006status\u0018\u0001 \u0001(\u000e2@.CSM.Proto.PairedDeviceAuth.PairedDeviceAuthorizeResponse.Status:\u0002OK\u0012\u000f\n\u0007txn_key\u0018\u0002 \u0001(\t\u0012D\n\u0018paired_device_identifier\u0018\u0003 \u0001(\u000b2\".CSM.Proto.Common.DeviceIdentifier\"\\\n\u0006Status\u0012\u0006\n\u0002OK\u0010\u0000\u0012#\n\u001fINVALID_BASE_DEVICE_CREDENTIALS\u0010\u0001\u0012%\n!INVALID_PAIRED_DEVICE_CREDENTIALS\u0010\u0002B4\n\u001ecom.garmin.gcsprotos.generatedB\u0010PairedDeviceAuthH\u0003"}, new Descriptors.FileDescriptor[]{DataTypesProto.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_CSM_Proto_PairedDeviceAuth_PairedDeviceAuthorizeRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CSM_Proto_PairedDeviceAuth_PairedDeviceAuthorizeRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_CSM_Proto_PairedDeviceAuth_PairedDeviceAuthorizeResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CSM_Proto_PairedDeviceAuth_PairedDeviceAuthorizeResponse_fieldAccessorTable;

    public interface PairedDeviceAuthorizeRequestOrBuilder extends MessageOrBuilder {
        DataTypesProto.DeviceIdentifier getBaseDeviceIdentifier();

        DataTypesProto.DeviceIdentifierOrBuilder getBaseDeviceIdentifierOrBuilder();

        DataTypesProto.DeviceIdentifier getPairedDeviceIdentifier();

        DataTypesProto.DeviceIdentifierOrBuilder getPairedDeviceIdentifierOrBuilder();

        boolean hasBaseDeviceIdentifier();

        boolean hasPairedDeviceIdentifier();
    }

    public interface PairedDeviceAuthorizeResponseOrBuilder extends MessageOrBuilder {
        DataTypesProto.DeviceIdentifier getPairedDeviceIdentifier();

        DataTypesProto.DeviceIdentifierOrBuilder getPairedDeviceIdentifierOrBuilder();

        PairedDeviceAuthorizeResponse.Status getStatus();

        String getTxnKey();

        ByteString getTxnKeyBytes();

        boolean hasPairedDeviceIdentifier();

        boolean hasStatus();

        boolean hasTxnKey();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_CSM_Proto_PairedDeviceAuth_PairedDeviceAuthorizeRequest_descriptor = descriptor2;
        internal_static_CSM_Proto_PairedDeviceAuth_PairedDeviceAuthorizeRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"BaseDeviceIdentifier", "PairedDeviceIdentifier"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_CSM_Proto_PairedDeviceAuth_PairedDeviceAuthorizeResponse_descriptor = descriptor3;
        internal_static_CSM_Proto_PairedDeviceAuth_PairedDeviceAuthorizeResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Status", "TxnKey", "PairedDeviceIdentifier"});
        DataTypesProto.getDescriptor();
    }

    private PairedDeviceAuth() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class PairedDeviceAuthorizeRequest extends GeneratedMessageV3 implements PairedDeviceAuthorizeRequestOrBuilder {
        public static final int BASE_DEVICE_IDENTIFIER_FIELD_NUMBER = 1;
        public static final int PAIRED_DEVICE_IDENTIFIER_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private DataTypesProto.DeviceIdentifier baseDeviceIdentifier_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private DataTypesProto.DeviceIdentifier pairedDeviceIdentifier_;
        private static final PairedDeviceAuthorizeRequest DEFAULT_INSTANCE = new PairedDeviceAuthorizeRequest();

        @Deprecated
        public static final Parser<PairedDeviceAuthorizeRequest> PARSER = new AbstractParser<PairedDeviceAuthorizeRequest>() { // from class: com.garmin.gcsprotos.generated.PairedDeviceAuth.PairedDeviceAuthorizeRequest.1
            @Override // com.google.protobuf.Parser
            public PairedDeviceAuthorizeRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = PairedDeviceAuthorizeRequest.newBuilder();
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

        private PairedDeviceAuthorizeRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PairedDeviceAuthorizeRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return PairedDeviceAuth.internal_static_CSM_Proto_PairedDeviceAuth_PairedDeviceAuthorizeRequest_descriptor;
        }

        public static Builder newBuilder(PairedDeviceAuthorizeRequest pairedDeviceAuthorizeRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(pairedDeviceAuthorizeRequest);
        }

        public static PairedDeviceAuthorizeRequest parseDelimitedFrom(InputStream inputStream) {
            return (PairedDeviceAuthorizeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PairedDeviceAuthorizeRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<PairedDeviceAuthorizeRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PairedDeviceAuthorizeRequest)) {
                return super.equals(obj);
            }
            PairedDeviceAuthorizeRequest pairedDeviceAuthorizeRequest = (PairedDeviceAuthorizeRequest) obj;
            if (hasBaseDeviceIdentifier() != pairedDeviceAuthorizeRequest.hasBaseDeviceIdentifier()) {
                return false;
            }
            if ((!hasBaseDeviceIdentifier() || getBaseDeviceIdentifier().equals(pairedDeviceAuthorizeRequest.getBaseDeviceIdentifier())) && hasPairedDeviceIdentifier() == pairedDeviceAuthorizeRequest.hasPairedDeviceIdentifier()) {
                return (!hasPairedDeviceIdentifier() || getPairedDeviceIdentifier().equals(pairedDeviceAuthorizeRequest.getPairedDeviceIdentifier())) && getUnknownFields().equals(pairedDeviceAuthorizeRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.gcsprotos.generated.PairedDeviceAuth.PairedDeviceAuthorizeRequestOrBuilder
        public DataTypesProto.DeviceIdentifier getBaseDeviceIdentifier() {
            DataTypesProto.DeviceIdentifier deviceIdentifier = this.baseDeviceIdentifier_;
            return deviceIdentifier == null ? DataTypesProto.DeviceIdentifier.getDefaultInstance() : deviceIdentifier;
        }

        @Override // com.garmin.gcsprotos.generated.PairedDeviceAuth.PairedDeviceAuthorizeRequestOrBuilder
        public DataTypesProto.DeviceIdentifierOrBuilder getBaseDeviceIdentifierOrBuilder() {
            DataTypesProto.DeviceIdentifier deviceIdentifier = this.baseDeviceIdentifier_;
            return deviceIdentifier == null ? DataTypesProto.DeviceIdentifier.getDefaultInstance() : deviceIdentifier;
        }

        @Override // com.garmin.gcsprotos.generated.PairedDeviceAuth.PairedDeviceAuthorizeRequestOrBuilder
        public DataTypesProto.DeviceIdentifier getPairedDeviceIdentifier() {
            DataTypesProto.DeviceIdentifier deviceIdentifier = this.pairedDeviceIdentifier_;
            return deviceIdentifier == null ? DataTypesProto.DeviceIdentifier.getDefaultInstance() : deviceIdentifier;
        }

        @Override // com.garmin.gcsprotos.generated.PairedDeviceAuth.PairedDeviceAuthorizeRequestOrBuilder
        public DataTypesProto.DeviceIdentifierOrBuilder getPairedDeviceIdentifierOrBuilder() {
            DataTypesProto.DeviceIdentifier deviceIdentifier = this.pairedDeviceIdentifier_;
            return deviceIdentifier == null ? DataTypesProto.DeviceIdentifier.getDefaultInstance() : deviceIdentifier;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<PairedDeviceAuthorizeRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getBaseDeviceIdentifier()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getPairedDeviceIdentifier());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.gcsprotos.generated.PairedDeviceAuth.PairedDeviceAuthorizeRequestOrBuilder
        public boolean hasBaseDeviceIdentifier() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.PairedDeviceAuth.PairedDeviceAuthorizeRequestOrBuilder
        public boolean hasPairedDeviceIdentifier() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasBaseDeviceIdentifier()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getBaseDeviceIdentifier().hashCode();
            }
            if (hasPairedDeviceIdentifier()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getPairedDeviceIdentifier().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PairedDeviceAuth.internal_static_CSM_Proto_PairedDeviceAuth_PairedDeviceAuthorizeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(PairedDeviceAuthorizeRequest.class, Builder.class);
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
            return new PairedDeviceAuthorizeRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getBaseDeviceIdentifier());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getPairedDeviceIdentifier());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PairedDeviceAuthorizeRequestOrBuilder {
            private SingleFieldBuilderV3<DataTypesProto.DeviceIdentifier, DataTypesProto.DeviceIdentifier.Builder, DataTypesProto.DeviceIdentifierOrBuilder> baseDeviceIdentifierBuilder_;
            private DataTypesProto.DeviceIdentifier baseDeviceIdentifier_;
            private int bitField0_;
            private SingleFieldBuilderV3<DataTypesProto.DeviceIdentifier, DataTypesProto.DeviceIdentifier.Builder, DataTypesProto.DeviceIdentifierOrBuilder> pairedDeviceIdentifierBuilder_;
            private DataTypesProto.DeviceIdentifier pairedDeviceIdentifier_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(PairedDeviceAuthorizeRequest pairedDeviceAuthorizeRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<DataTypesProto.DeviceIdentifier, DataTypesProto.DeviceIdentifier.Builder, DataTypesProto.DeviceIdentifierOrBuilder> singleFieldBuilderV3 = this.baseDeviceIdentifierBuilder_;
                    pairedDeviceAuthorizeRequest.baseDeviceIdentifier_ = singleFieldBuilderV3 == null ? this.baseDeviceIdentifier_ : (DataTypesProto.DeviceIdentifier) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<DataTypesProto.DeviceIdentifier, DataTypesProto.DeviceIdentifier.Builder, DataTypesProto.DeviceIdentifierOrBuilder> singleFieldBuilderV4 = this.pairedDeviceIdentifierBuilder_;
                    pairedDeviceAuthorizeRequest.pairedDeviceIdentifier_ = singleFieldBuilderV4 == null ? this.pairedDeviceIdentifier_ : (DataTypesProto.DeviceIdentifier) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                pairedDeviceAuthorizeRequest.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<DataTypesProto.DeviceIdentifier, DataTypesProto.DeviceIdentifier.Builder, DataTypesProto.DeviceIdentifierOrBuilder> getBaseDeviceIdentifierFieldBuilder() {
                if (this.baseDeviceIdentifierBuilder_ == null) {
                    this.baseDeviceIdentifierBuilder_ = new SingleFieldBuilderV3<>(getBaseDeviceIdentifier(), getParentForChildren(), isClean());
                    this.baseDeviceIdentifier_ = null;
                }
                return this.baseDeviceIdentifierBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return PairedDeviceAuth.internal_static_CSM_Proto_PairedDeviceAuth_PairedDeviceAuthorizeRequest_descriptor;
            }

            private SingleFieldBuilderV3<DataTypesProto.DeviceIdentifier, DataTypesProto.DeviceIdentifier.Builder, DataTypesProto.DeviceIdentifierOrBuilder> getPairedDeviceIdentifierFieldBuilder() {
                if (this.pairedDeviceIdentifierBuilder_ == null) {
                    this.pairedDeviceIdentifierBuilder_ = new SingleFieldBuilderV3<>(getPairedDeviceIdentifier(), getParentForChildren(), isClean());
                    this.pairedDeviceIdentifier_ = null;
                }
                return this.pairedDeviceIdentifierBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getBaseDeviceIdentifierFieldBuilder();
                    getPairedDeviceIdentifierFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PairedDeviceAuthorizeRequest build() {
                PairedDeviceAuthorizeRequest pairedDeviceAuthorizeRequestBuildPartial = buildPartial();
                if (pairedDeviceAuthorizeRequestBuildPartial.isInitialized()) {
                    return pairedDeviceAuthorizeRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) pairedDeviceAuthorizeRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PairedDeviceAuthorizeRequest buildPartial() {
                PairedDeviceAuthorizeRequest pairedDeviceAuthorizeRequest = new PairedDeviceAuthorizeRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(pairedDeviceAuthorizeRequest);
                }
                onBuilt();
                return pairedDeviceAuthorizeRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.baseDeviceIdentifier_ = null;
                SingleFieldBuilderV3<DataTypesProto.DeviceIdentifier, DataTypesProto.DeviceIdentifier.Builder, DataTypesProto.DeviceIdentifierOrBuilder> singleFieldBuilderV3 = this.baseDeviceIdentifierBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.baseDeviceIdentifierBuilder_ = null;
                }
                this.pairedDeviceIdentifier_ = null;
                SingleFieldBuilderV3<DataTypesProto.DeviceIdentifier, DataTypesProto.DeviceIdentifier.Builder, DataTypesProto.DeviceIdentifierOrBuilder> singleFieldBuilderV4 = this.pairedDeviceIdentifierBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.pairedDeviceIdentifierBuilder_ = null;
                }
                return this;
            }

            public Builder clearBaseDeviceIdentifier() {
                this.bitField0_ &= -2;
                this.baseDeviceIdentifier_ = null;
                SingleFieldBuilderV3<DataTypesProto.DeviceIdentifier, DataTypesProto.DeviceIdentifier.Builder, DataTypesProto.DeviceIdentifierOrBuilder> singleFieldBuilderV3 = this.baseDeviceIdentifierBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.baseDeviceIdentifierBuilder_ = null;
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

            public Builder clearPairedDeviceIdentifier() {
                this.bitField0_ &= -3;
                this.pairedDeviceIdentifier_ = null;
                SingleFieldBuilderV3<DataTypesProto.DeviceIdentifier, DataTypesProto.DeviceIdentifier.Builder, DataTypesProto.DeviceIdentifierOrBuilder> singleFieldBuilderV3 = this.pairedDeviceIdentifierBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.pairedDeviceIdentifierBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.gcsprotos.generated.PairedDeviceAuth.PairedDeviceAuthorizeRequestOrBuilder
            public DataTypesProto.DeviceIdentifier getBaseDeviceIdentifier() {
                SingleFieldBuilderV3<DataTypesProto.DeviceIdentifier, DataTypesProto.DeviceIdentifier.Builder, DataTypesProto.DeviceIdentifierOrBuilder> singleFieldBuilderV3 = this.baseDeviceIdentifierBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypesProto.DeviceIdentifier) singleFieldBuilderV3.getMessage();
                }
                DataTypesProto.DeviceIdentifier deviceIdentifier = this.baseDeviceIdentifier_;
                return deviceIdentifier == null ? DataTypesProto.DeviceIdentifier.getDefaultInstance() : deviceIdentifier;
            }

            public DataTypesProto.DeviceIdentifier.Builder getBaseDeviceIdentifierBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (DataTypesProto.DeviceIdentifier.Builder) getBaseDeviceIdentifierFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.PairedDeviceAuth.PairedDeviceAuthorizeRequestOrBuilder
            public DataTypesProto.DeviceIdentifierOrBuilder getBaseDeviceIdentifierOrBuilder() {
                SingleFieldBuilderV3<DataTypesProto.DeviceIdentifier, DataTypesProto.DeviceIdentifier.Builder, DataTypesProto.DeviceIdentifierOrBuilder> singleFieldBuilderV3 = this.baseDeviceIdentifierBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypesProto.DeviceIdentifierOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DataTypesProto.DeviceIdentifier deviceIdentifier = this.baseDeviceIdentifier_;
                return deviceIdentifier == null ? DataTypesProto.DeviceIdentifier.getDefaultInstance() : deviceIdentifier;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return PairedDeviceAuth.internal_static_CSM_Proto_PairedDeviceAuth_PairedDeviceAuthorizeRequest_descriptor;
            }

            @Override // com.garmin.gcsprotos.generated.PairedDeviceAuth.PairedDeviceAuthorizeRequestOrBuilder
            public DataTypesProto.DeviceIdentifier getPairedDeviceIdentifier() {
                SingleFieldBuilderV3<DataTypesProto.DeviceIdentifier, DataTypesProto.DeviceIdentifier.Builder, DataTypesProto.DeviceIdentifierOrBuilder> singleFieldBuilderV3 = this.pairedDeviceIdentifierBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypesProto.DeviceIdentifier) singleFieldBuilderV3.getMessage();
                }
                DataTypesProto.DeviceIdentifier deviceIdentifier = this.pairedDeviceIdentifier_;
                return deviceIdentifier == null ? DataTypesProto.DeviceIdentifier.getDefaultInstance() : deviceIdentifier;
            }

            public DataTypesProto.DeviceIdentifier.Builder getPairedDeviceIdentifierBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (DataTypesProto.DeviceIdentifier.Builder) getPairedDeviceIdentifierFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.PairedDeviceAuth.PairedDeviceAuthorizeRequestOrBuilder
            public DataTypesProto.DeviceIdentifierOrBuilder getPairedDeviceIdentifierOrBuilder() {
                SingleFieldBuilderV3<DataTypesProto.DeviceIdentifier, DataTypesProto.DeviceIdentifier.Builder, DataTypesProto.DeviceIdentifierOrBuilder> singleFieldBuilderV3 = this.pairedDeviceIdentifierBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypesProto.DeviceIdentifierOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DataTypesProto.DeviceIdentifier deviceIdentifier = this.pairedDeviceIdentifier_;
                return deviceIdentifier == null ? DataTypesProto.DeviceIdentifier.getDefaultInstance() : deviceIdentifier;
            }

            @Override // com.garmin.gcsprotos.generated.PairedDeviceAuth.PairedDeviceAuthorizeRequestOrBuilder
            public boolean hasBaseDeviceIdentifier() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.PairedDeviceAuth.PairedDeviceAuthorizeRequestOrBuilder
            public boolean hasPairedDeviceIdentifier() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return PairedDeviceAuth.internal_static_CSM_Proto_PairedDeviceAuth_PairedDeviceAuthorizeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(PairedDeviceAuthorizeRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeBaseDeviceIdentifier(DataTypesProto.DeviceIdentifier deviceIdentifier) {
                DataTypesProto.DeviceIdentifier deviceIdentifier2;
                SingleFieldBuilderV3<DataTypesProto.DeviceIdentifier, DataTypesProto.DeviceIdentifier.Builder, DataTypesProto.DeviceIdentifierOrBuilder> singleFieldBuilderV3 = this.baseDeviceIdentifierBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(deviceIdentifier);
                } else if ((this.bitField0_ & 1) == 0 || (deviceIdentifier2 = this.baseDeviceIdentifier_) == null || deviceIdentifier2 == DataTypesProto.DeviceIdentifier.getDefaultInstance()) {
                    this.baseDeviceIdentifier_ = deviceIdentifier;
                } else {
                    getBaseDeviceIdentifierBuilder().mergeFrom(deviceIdentifier);
                }
                this.bitField0_ |= 1;
                onChanged();
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
                                    codedInputStream.readMessage(getBaseDeviceIdentifierFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getPairedDeviceIdentifierFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergePairedDeviceIdentifier(DataTypesProto.DeviceIdentifier deviceIdentifier) {
                DataTypesProto.DeviceIdentifier deviceIdentifier2;
                SingleFieldBuilderV3<DataTypesProto.DeviceIdentifier, DataTypesProto.DeviceIdentifier.Builder, DataTypesProto.DeviceIdentifierOrBuilder> singleFieldBuilderV3 = this.pairedDeviceIdentifierBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(deviceIdentifier);
                } else if ((this.bitField0_ & 2) == 0 || (deviceIdentifier2 = this.pairedDeviceIdentifier_) == null || deviceIdentifier2 == DataTypesProto.DeviceIdentifier.getDefaultInstance()) {
                    this.pairedDeviceIdentifier_ = deviceIdentifier;
                } else {
                    getPairedDeviceIdentifierBuilder().mergeFrom(deviceIdentifier);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setBaseDeviceIdentifier(DataTypesProto.DeviceIdentifier.Builder builder) {
                SingleFieldBuilderV3<DataTypesProto.DeviceIdentifier, DataTypesProto.DeviceIdentifier.Builder, DataTypesProto.DeviceIdentifierOrBuilder> singleFieldBuilderV3 = this.baseDeviceIdentifierBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.baseDeviceIdentifier_ = builder.build();
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

            public Builder setPairedDeviceIdentifier(DataTypesProto.DeviceIdentifier.Builder builder) {
                SingleFieldBuilderV3<DataTypesProto.DeviceIdentifier, DataTypesProto.DeviceIdentifier.Builder, DataTypesProto.DeviceIdentifierOrBuilder> singleFieldBuilderV3 = this.pairedDeviceIdentifierBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.pairedDeviceIdentifier_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
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
            public PairedDeviceAuthorizeRequest getDefaultInstanceForType() {
                return PairedDeviceAuthorizeRequest.getDefaultInstance();
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

            public Builder setBaseDeviceIdentifier(DataTypesProto.DeviceIdentifier deviceIdentifier) {
                SingleFieldBuilderV3<DataTypesProto.DeviceIdentifier, DataTypesProto.DeviceIdentifier.Builder, DataTypesProto.DeviceIdentifierOrBuilder> singleFieldBuilderV3 = this.baseDeviceIdentifierBuilder_;
                if (singleFieldBuilderV3 == null) {
                    deviceIdentifier.getClass();
                    this.baseDeviceIdentifier_ = deviceIdentifier;
                } else {
                    singleFieldBuilderV3.setMessage(deviceIdentifier);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setPairedDeviceIdentifier(DataTypesProto.DeviceIdentifier deviceIdentifier) {
                SingleFieldBuilderV3<DataTypesProto.DeviceIdentifier, DataTypesProto.DeviceIdentifier.Builder, DataTypesProto.DeviceIdentifierOrBuilder> singleFieldBuilderV3 = this.pairedDeviceIdentifierBuilder_;
                if (singleFieldBuilderV3 == null) {
                    deviceIdentifier.getClass();
                    this.pairedDeviceIdentifier_ = deviceIdentifier;
                } else {
                    singleFieldBuilderV3.setMessage(deviceIdentifier);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof PairedDeviceAuthorizeRequest) {
                    return mergeFrom((PairedDeviceAuthorizeRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(PairedDeviceAuthorizeRequest pairedDeviceAuthorizeRequest) {
                if (pairedDeviceAuthorizeRequest == PairedDeviceAuthorizeRequest.getDefaultInstance()) {
                    return this;
                }
                if (pairedDeviceAuthorizeRequest.hasBaseDeviceIdentifier()) {
                    mergeBaseDeviceIdentifier(pairedDeviceAuthorizeRequest.getBaseDeviceIdentifier());
                }
                if (pairedDeviceAuthorizeRequest.hasPairedDeviceIdentifier()) {
                    mergePairedDeviceIdentifier(pairedDeviceAuthorizeRequest.getPairedDeviceIdentifier());
                }
                mergeUnknownFields(pairedDeviceAuthorizeRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PairedDeviceAuthorizeRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ PairedDeviceAuthorizeRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private PairedDeviceAuthorizeRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PairedDeviceAuthorizeRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PairedDeviceAuthorizeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PairedDeviceAuthorizeRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static PairedDeviceAuthorizeRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PairedDeviceAuthorizeRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PairedDeviceAuthorizeRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static PairedDeviceAuthorizeRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static PairedDeviceAuthorizeRequest parseFrom(InputStream inputStream) {
            return (PairedDeviceAuthorizeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static PairedDeviceAuthorizeRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PairedDeviceAuthorizeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PairedDeviceAuthorizeRequest parseFrom(CodedInputStream codedInputStream) {
            return (PairedDeviceAuthorizeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static PairedDeviceAuthorizeRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PairedDeviceAuthorizeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class PairedDeviceAuthorizeResponse extends GeneratedMessageV3 implements PairedDeviceAuthorizeResponseOrBuilder {
        public static final int PAIRED_DEVICE_IDENTIFIER_FIELD_NUMBER = 3;
        public static final int STATUS_FIELD_NUMBER = 1;
        public static final int TXN_KEY_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private DataTypesProto.DeviceIdentifier pairedDeviceIdentifier_;
        private int status_;
        private volatile Object txnKey_;
        private static final PairedDeviceAuthorizeResponse DEFAULT_INSTANCE = new PairedDeviceAuthorizeResponse();

        @Deprecated
        public static final Parser<PairedDeviceAuthorizeResponse> PARSER = new AbstractParser<PairedDeviceAuthorizeResponse>() { // from class: com.garmin.gcsprotos.generated.PairedDeviceAuth.PairedDeviceAuthorizeResponse.1
            @Override // com.google.protobuf.Parser
            public PairedDeviceAuthorizeResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = PairedDeviceAuthorizeResponse.newBuilder();
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

        private PairedDeviceAuthorizeResponse() {
            this.status_ = 0;
            this.txnKey_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
            this.txnKey_ = "";
        }

        public static PairedDeviceAuthorizeResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return PairedDeviceAuth.internal_static_CSM_Proto_PairedDeviceAuth_PairedDeviceAuthorizeResponse_descriptor;
        }

        public static Builder newBuilder(PairedDeviceAuthorizeResponse pairedDeviceAuthorizeResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(pairedDeviceAuthorizeResponse);
        }

        public static PairedDeviceAuthorizeResponse parseDelimitedFrom(InputStream inputStream) {
            return (PairedDeviceAuthorizeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PairedDeviceAuthorizeResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<PairedDeviceAuthorizeResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PairedDeviceAuthorizeResponse)) {
                return super.equals(obj);
            }
            PairedDeviceAuthorizeResponse pairedDeviceAuthorizeResponse = (PairedDeviceAuthorizeResponse) obj;
            if (hasStatus() != pairedDeviceAuthorizeResponse.hasStatus()) {
                return false;
            }
            if ((hasStatus() && this.status_ != pairedDeviceAuthorizeResponse.status_) || hasTxnKey() != pairedDeviceAuthorizeResponse.hasTxnKey()) {
                return false;
            }
            if ((!hasTxnKey() || getTxnKey().equals(pairedDeviceAuthorizeResponse.getTxnKey())) && hasPairedDeviceIdentifier() == pairedDeviceAuthorizeResponse.hasPairedDeviceIdentifier()) {
                return (!hasPairedDeviceIdentifier() || getPairedDeviceIdentifier().equals(pairedDeviceAuthorizeResponse.getPairedDeviceIdentifier())) && getUnknownFields().equals(pairedDeviceAuthorizeResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.gcsprotos.generated.PairedDeviceAuth.PairedDeviceAuthorizeResponseOrBuilder
        public DataTypesProto.DeviceIdentifier getPairedDeviceIdentifier() {
            DataTypesProto.DeviceIdentifier deviceIdentifier = this.pairedDeviceIdentifier_;
            return deviceIdentifier == null ? DataTypesProto.DeviceIdentifier.getDefaultInstance() : deviceIdentifier;
        }

        @Override // com.garmin.gcsprotos.generated.PairedDeviceAuth.PairedDeviceAuthorizeResponseOrBuilder
        public DataTypesProto.DeviceIdentifierOrBuilder getPairedDeviceIdentifierOrBuilder() {
            DataTypesProto.DeviceIdentifier deviceIdentifier = this.pairedDeviceIdentifier_;
            return deviceIdentifier == null ? DataTypesProto.DeviceIdentifier.getDefaultInstance() : deviceIdentifier;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<PairedDeviceAuthorizeResponse> getParserForType() {
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
                iComputeEnumSize += GeneratedMessageV3.computeStringSize(2, this.txnKey_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(3, getPairedDeviceIdentifier());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.gcsprotos.generated.PairedDeviceAuth.PairedDeviceAuthorizeResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.OK : statusForNumber;
        }

        @Override // com.garmin.gcsprotos.generated.PairedDeviceAuth.PairedDeviceAuthorizeResponseOrBuilder
        public String getTxnKey() {
            Object obj = this.txnKey_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.txnKey_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.PairedDeviceAuth.PairedDeviceAuthorizeResponseOrBuilder
        public ByteString getTxnKeyBytes() {
            Object obj = this.txnKey_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.txnKey_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.PairedDeviceAuth.PairedDeviceAuthorizeResponseOrBuilder
        public boolean hasPairedDeviceIdentifier() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.PairedDeviceAuth.PairedDeviceAuthorizeResponseOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.PairedDeviceAuth.PairedDeviceAuthorizeResponseOrBuilder
        public boolean hasTxnKey() {
            return (this.bitField0_ & 2) != 0;
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
            if (hasTxnKey()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getTxnKey().hashCode();
            }
            if (hasPairedDeviceIdentifier()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getPairedDeviceIdentifier().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return PairedDeviceAuth.internal_static_CSM_Proto_PairedDeviceAuth_PairedDeviceAuthorizeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(PairedDeviceAuthorizeResponse.class, Builder.class);
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
            return new PairedDeviceAuthorizeResponse();
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
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.txnKey_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getPairedDeviceIdentifier());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements PairedDeviceAuthorizeResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<DataTypesProto.DeviceIdentifier, DataTypesProto.DeviceIdentifier.Builder, DataTypesProto.DeviceIdentifierOrBuilder> pairedDeviceIdentifierBuilder_;
            private DataTypesProto.DeviceIdentifier pairedDeviceIdentifier_;
            private int status_;
            private Object txnKey_;

            private Builder() {
                this.status_ = 0;
                this.txnKey_ = "";
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(PairedDeviceAuthorizeResponse pairedDeviceAuthorizeResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    pairedDeviceAuthorizeResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    pairedDeviceAuthorizeResponse.txnKey_ = this.txnKey_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<DataTypesProto.DeviceIdentifier, DataTypesProto.DeviceIdentifier.Builder, DataTypesProto.DeviceIdentifierOrBuilder> singleFieldBuilderV3 = this.pairedDeviceIdentifierBuilder_;
                    pairedDeviceAuthorizeResponse.pairedDeviceIdentifier_ = singleFieldBuilderV3 == null ? this.pairedDeviceIdentifier_ : (DataTypesProto.DeviceIdentifier) singleFieldBuilderV3.build();
                    i14 |= 4;
                }
                pairedDeviceAuthorizeResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return PairedDeviceAuth.internal_static_CSM_Proto_PairedDeviceAuth_PairedDeviceAuthorizeResponse_descriptor;
            }

            private SingleFieldBuilderV3<DataTypesProto.DeviceIdentifier, DataTypesProto.DeviceIdentifier.Builder, DataTypesProto.DeviceIdentifierOrBuilder> getPairedDeviceIdentifierFieldBuilder() {
                if (this.pairedDeviceIdentifierBuilder_ == null) {
                    this.pairedDeviceIdentifierBuilder_ = new SingleFieldBuilderV3<>(getPairedDeviceIdentifier(), getParentForChildren(), isClean());
                    this.pairedDeviceIdentifier_ = null;
                }
                return this.pairedDeviceIdentifierBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getPairedDeviceIdentifierFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PairedDeviceAuthorizeResponse build() {
                PairedDeviceAuthorizeResponse pairedDeviceAuthorizeResponseBuildPartial = buildPartial();
                if (pairedDeviceAuthorizeResponseBuildPartial.isInitialized()) {
                    return pairedDeviceAuthorizeResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) pairedDeviceAuthorizeResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public PairedDeviceAuthorizeResponse buildPartial() {
                PairedDeviceAuthorizeResponse pairedDeviceAuthorizeResponse = new PairedDeviceAuthorizeResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(pairedDeviceAuthorizeResponse);
                }
                onBuilt();
                return pairedDeviceAuthorizeResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                this.txnKey_ = "";
                this.pairedDeviceIdentifier_ = null;
                SingleFieldBuilderV3<DataTypesProto.DeviceIdentifier, DataTypesProto.DeviceIdentifier.Builder, DataTypesProto.DeviceIdentifierOrBuilder> singleFieldBuilderV3 = this.pairedDeviceIdentifierBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.pairedDeviceIdentifierBuilder_ = null;
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

            public Builder clearPairedDeviceIdentifier() {
                this.bitField0_ &= -5;
                this.pairedDeviceIdentifier_ = null;
                SingleFieldBuilderV3<DataTypesProto.DeviceIdentifier, DataTypesProto.DeviceIdentifier.Builder, DataTypesProto.DeviceIdentifierOrBuilder> singleFieldBuilderV3 = this.pairedDeviceIdentifierBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.pairedDeviceIdentifierBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStatus() {
                this.bitField0_ &= -2;
                this.status_ = 0;
                onChanged();
                return this;
            }

            public Builder clearTxnKey() {
                this.txnKey_ = PairedDeviceAuthorizeResponse.getDefaultInstance().getTxnKey();
                this.bitField0_ &= -3;
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
                return PairedDeviceAuth.internal_static_CSM_Proto_PairedDeviceAuth_PairedDeviceAuthorizeResponse_descriptor;
            }

            @Override // com.garmin.gcsprotos.generated.PairedDeviceAuth.PairedDeviceAuthorizeResponseOrBuilder
            public DataTypesProto.DeviceIdentifier getPairedDeviceIdentifier() {
                SingleFieldBuilderV3<DataTypesProto.DeviceIdentifier, DataTypesProto.DeviceIdentifier.Builder, DataTypesProto.DeviceIdentifierOrBuilder> singleFieldBuilderV3 = this.pairedDeviceIdentifierBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypesProto.DeviceIdentifier) singleFieldBuilderV3.getMessage();
                }
                DataTypesProto.DeviceIdentifier deviceIdentifier = this.pairedDeviceIdentifier_;
                return deviceIdentifier == null ? DataTypesProto.DeviceIdentifier.getDefaultInstance() : deviceIdentifier;
            }

            public DataTypesProto.DeviceIdentifier.Builder getPairedDeviceIdentifierBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (DataTypesProto.DeviceIdentifier.Builder) getPairedDeviceIdentifierFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.PairedDeviceAuth.PairedDeviceAuthorizeResponseOrBuilder
            public DataTypesProto.DeviceIdentifierOrBuilder getPairedDeviceIdentifierOrBuilder() {
                SingleFieldBuilderV3<DataTypesProto.DeviceIdentifier, DataTypesProto.DeviceIdentifier.Builder, DataTypesProto.DeviceIdentifierOrBuilder> singleFieldBuilderV3 = this.pairedDeviceIdentifierBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypesProto.DeviceIdentifierOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DataTypesProto.DeviceIdentifier deviceIdentifier = this.pairedDeviceIdentifier_;
                return deviceIdentifier == null ? DataTypesProto.DeviceIdentifier.getDefaultInstance() : deviceIdentifier;
            }

            @Override // com.garmin.gcsprotos.generated.PairedDeviceAuth.PairedDeviceAuthorizeResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.OK : statusForNumber;
            }

            @Override // com.garmin.gcsprotos.generated.PairedDeviceAuth.PairedDeviceAuthorizeResponseOrBuilder
            public String getTxnKey() {
                Object obj = this.txnKey_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.txnKey_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.PairedDeviceAuth.PairedDeviceAuthorizeResponseOrBuilder
            public ByteString getTxnKeyBytes() {
                Object obj = this.txnKey_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.txnKey_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.PairedDeviceAuth.PairedDeviceAuthorizeResponseOrBuilder
            public boolean hasPairedDeviceIdentifier() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.PairedDeviceAuth.PairedDeviceAuthorizeResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.PairedDeviceAuth.PairedDeviceAuthorizeResponseOrBuilder
            public boolean hasTxnKey() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return PairedDeviceAuth.internal_static_CSM_Proto_PairedDeviceAuth_PairedDeviceAuthorizeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(PairedDeviceAuthorizeResponse.class, Builder.class);
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
                                    if (Status.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    this.txnKey_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getPairedDeviceIdentifierFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergePairedDeviceIdentifier(DataTypesProto.DeviceIdentifier deviceIdentifier) {
                DataTypesProto.DeviceIdentifier deviceIdentifier2;
                SingleFieldBuilderV3<DataTypesProto.DeviceIdentifier, DataTypesProto.DeviceIdentifier.Builder, DataTypesProto.DeviceIdentifierOrBuilder> singleFieldBuilderV3 = this.pairedDeviceIdentifierBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(deviceIdentifier);
                } else if ((this.bitField0_ & 4) == 0 || (deviceIdentifier2 = this.pairedDeviceIdentifier_) == null || deviceIdentifier2 == DataTypesProto.DeviceIdentifier.getDefaultInstance()) {
                    this.pairedDeviceIdentifier_ = deviceIdentifier;
                } else {
                    getPairedDeviceIdentifierBuilder().mergeFrom(deviceIdentifier);
                }
                this.bitField0_ |= 4;
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

            public Builder setPairedDeviceIdentifier(DataTypesProto.DeviceIdentifier.Builder builder) {
                SingleFieldBuilderV3<DataTypesProto.DeviceIdentifier, DataTypesProto.DeviceIdentifier.Builder, DataTypesProto.DeviceIdentifierOrBuilder> singleFieldBuilderV3 = this.pairedDeviceIdentifierBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.pairedDeviceIdentifier_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStatus(Status status) {
                status.getClass();
                this.bitField0_ |= 1;
                this.status_ = status.getNumber();
                onChanged();
                return this;
            }

            public Builder setTxnKey(String str) {
                str.getClass();
                this.txnKey_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTxnKeyBytes(ByteString byteString) {
                byteString.getClass();
                this.txnKey_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public PairedDeviceAuthorizeResponse getDefaultInstanceForType() {
                return PairedDeviceAuthorizeResponse.getDefaultInstance();
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
                this.txnKey_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder setPairedDeviceIdentifier(DataTypesProto.DeviceIdentifier deviceIdentifier) {
                SingleFieldBuilderV3<DataTypesProto.DeviceIdentifier, DataTypesProto.DeviceIdentifier.Builder, DataTypesProto.DeviceIdentifierOrBuilder> singleFieldBuilderV3 = this.pairedDeviceIdentifierBuilder_;
                if (singleFieldBuilderV3 == null) {
                    deviceIdentifier.getClass();
                    this.pairedDeviceIdentifier_ = deviceIdentifier;
                } else {
                    singleFieldBuilderV3.setMessage(deviceIdentifier);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof PairedDeviceAuthorizeResponse) {
                    return mergeFrom((PairedDeviceAuthorizeResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(PairedDeviceAuthorizeResponse pairedDeviceAuthorizeResponse) {
                if (pairedDeviceAuthorizeResponse == PairedDeviceAuthorizeResponse.getDefaultInstance()) {
                    return this;
                }
                if (pairedDeviceAuthorizeResponse.hasStatus()) {
                    setStatus(pairedDeviceAuthorizeResponse.getStatus());
                }
                if (pairedDeviceAuthorizeResponse.hasTxnKey()) {
                    this.txnKey_ = pairedDeviceAuthorizeResponse.txnKey_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (pairedDeviceAuthorizeResponse.hasPairedDeviceIdentifier()) {
                    mergePairedDeviceIdentifier(pairedDeviceAuthorizeResponse.getPairedDeviceIdentifier());
                }
                mergeUnknownFields(pairedDeviceAuthorizeResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public PairedDeviceAuthorizeResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static PairedDeviceAuthorizeResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PairedDeviceAuthorizeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static PairedDeviceAuthorizeResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static PairedDeviceAuthorizeResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PairedDeviceAuthorizeResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static PairedDeviceAuthorizeResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static PairedDeviceAuthorizeResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static PairedDeviceAuthorizeResponse parseFrom(InputStream inputStream) {
            return (PairedDeviceAuthorizeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static PairedDeviceAuthorizeResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PairedDeviceAuthorizeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private PairedDeviceAuthorizeResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.txnKey_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static PairedDeviceAuthorizeResponse parseFrom(CodedInputStream codedInputStream) {
            return (PairedDeviceAuthorizeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static PairedDeviceAuthorizeResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (PairedDeviceAuthorizeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ PairedDeviceAuthorizeResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public enum Status implements ProtocolMessageEnum {
            OK(0),
            INVALID_BASE_DEVICE_CREDENTIALS(1),
            INVALID_PAIRED_DEVICE_CREDENTIALS(2);

            public static final int INVALID_BASE_DEVICE_CREDENTIALS_VALUE = 1;
            public static final int INVALID_PAIRED_DEVICE_CREDENTIALS_VALUE = 2;
            public static final int OK_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.gcsprotos.generated.PairedDeviceAuth.PairedDeviceAuthorizeResponse.Status.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Status findValueByNumber(int i14) {
                    return Status.forNumber(i14);
                }
            };
            private static final Status[] VALUES = values();

            Status(int i14) {
                this.value = i14;
            }

            public static Status forNumber(int i14) {
                if (i14 == 0) {
                    return OK;
                }
                if (i14 == 1) {
                    return INVALID_BASE_DEVICE_CREDENTIALS;
                }
                if (i14 != 2) {
                    return null;
                }
                return INVALID_PAIRED_DEVICE_CREDENTIALS;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return PairedDeviceAuthorizeResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Status> internalGetValueMap() {
                return internalValueMap;
            }

            public static Status valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Status valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
