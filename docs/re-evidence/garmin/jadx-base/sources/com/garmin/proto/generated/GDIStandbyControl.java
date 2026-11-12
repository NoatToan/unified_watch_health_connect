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

/* JADX INFO: loaded from: classes13.dex */
public final class GDIStandbyControl {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0017GDIStandbyControl.proto\u0012\u0018GDI.Proto.StandbyControl\"«\u0001\n\u0007Service\u0012N\n\u0016enable_pairing_request\u0018\u0001 \u0001(\u000b2..GDI.Proto.StandbyControl.EnablePairingRequest\u0012P\n\u0017enable_pairing_response\u0018\u0002 \u0001(\u000b2/.GDI.Proto.StandbyControl.EnablePairingResponse\"\u0016\n\u0014EnablePairingRequest\"£\u0001\n\u0015EnablePairingResponse\u0012F\n\u0006status\u0018\u0001 \u0001(\u000e26.GDI.Proto.StandbyControl.EnablePairingResponse.Status\"B\n\u0006Status\u0012\u0012\n\u000eSTATUS_UNKNOWN\u0010\u0000\u0012\u0013\n\u000fSTATUS_ACCEPTED\u0010\u0001\u0012\u000f\n\u000bSTATUS_BUSY\u0010\u0002B1\n\u001acom.garmin.proto.generatedB\u0011GDIStandbyControlH\u0003"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor internal_static_GDI_Proto_StandbyControl_EnablePairingRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_StandbyControl_EnablePairingRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_StandbyControl_EnablePairingResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_StandbyControl_EnablePairingResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_StandbyControl_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_StandbyControl_Service_fieldAccessorTable;

    public interface EnablePairingRequestOrBuilder extends MessageOrBuilder {
    }

    public interface EnablePairingResponseOrBuilder extends MessageOrBuilder {
        EnablePairingResponse.Status getStatus();

        boolean hasStatus();
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
        EnablePairingRequest getEnablePairingRequest();

        EnablePairingRequestOrBuilder getEnablePairingRequestOrBuilder();

        EnablePairingResponse getEnablePairingResponse();

        EnablePairingResponseOrBuilder getEnablePairingResponseOrBuilder();

        boolean hasEnablePairingRequest();

        boolean hasEnablePairingResponse();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_StandbyControl_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_StandbyControl_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"EnablePairingRequest", "EnablePairingResponse"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_StandbyControl_EnablePairingRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_StandbyControl_EnablePairingRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[0]);
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_StandbyControl_EnablePairingResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_StandbyControl_EnablePairingResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Status"});
    }

    private GDIStandbyControl() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class EnablePairingRequest extends GeneratedMessageV3 implements EnablePairingRequestOrBuilder {
        private static final EnablePairingRequest DEFAULT_INSTANCE = new EnablePairingRequest();

        @Deprecated
        public static final Parser<EnablePairingRequest> PARSER = new AbstractParser<EnablePairingRequest>() { // from class: com.garmin.proto.generated.GDIStandbyControl.EnablePairingRequest.1
            @Override // com.google.protobuf.Parser
            public EnablePairingRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = EnablePairingRequest.newBuilder();
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

        private EnablePairingRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EnablePairingRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIStandbyControl.internal_static_GDI_Proto_StandbyControl_EnablePairingRequest_descriptor;
        }

        public static Builder newBuilder(EnablePairingRequest enablePairingRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(enablePairingRequest);
        }

        public static EnablePairingRequest parseDelimitedFrom(InputStream inputStream) {
            return (EnablePairingRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EnablePairingRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<EnablePairingRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof EnablePairingRequest) {
                return getUnknownFields().equals(((EnablePairingRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EnablePairingRequest> getParserForType() {
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
            return GDIStandbyControl.internal_static_GDI_Proto_StandbyControl_EnablePairingRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(EnablePairingRequest.class, Builder.class);
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
            return new EnablePairingRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EnablePairingRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIStandbyControl.internal_static_GDI_Proto_StandbyControl_EnablePairingRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EnablePairingRequest build() {
                EnablePairingRequest enablePairingRequestBuildPartial = buildPartial();
                if (enablePairingRequestBuildPartial.isInitialized()) {
                    return enablePairingRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) enablePairingRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EnablePairingRequest buildPartial() {
                EnablePairingRequest enablePairingRequest = new EnablePairingRequest(this);
                onBuilt();
                return enablePairingRequest;
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
                return GDIStandbyControl.internal_static_GDI_Proto_StandbyControl_EnablePairingRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIStandbyControl.internal_static_GDI_Proto_StandbyControl_EnablePairingRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(EnablePairingRequest.class, Builder.class);
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
            public EnablePairingRequest getDefaultInstanceForType() {
                return EnablePairingRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EnablePairingRequest) {
                    return mergeFrom((EnablePairingRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EnablePairingRequest enablePairingRequest) {
                if (enablePairingRequest == EnablePairingRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(enablePairingRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EnablePairingRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ EnablePairingRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private EnablePairingRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EnablePairingRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnablePairingRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EnablePairingRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static EnablePairingRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EnablePairingRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static EnablePairingRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static EnablePairingRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static EnablePairingRequest parseFrom(InputStream inputStream) {
            return (EnablePairingRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static EnablePairingRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnablePairingRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EnablePairingRequest parseFrom(CodedInputStream codedInputStream) {
            return (EnablePairingRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static EnablePairingRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnablePairingRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class EnablePairingResponse extends GeneratedMessageV3 implements EnablePairingResponseOrBuilder {
        private static final EnablePairingResponse DEFAULT_INSTANCE = new EnablePairingResponse();

        @Deprecated
        public static final Parser<EnablePairingResponse> PARSER = new AbstractParser<EnablePairingResponse>() { // from class: com.garmin.proto.generated.GDIStandbyControl.EnablePairingResponse.1
            @Override // com.google.protobuf.Parser
            public EnablePairingResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = EnablePairingResponse.newBuilder();
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
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int status_;

        private EnablePairingResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EnablePairingResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIStandbyControl.internal_static_GDI_Proto_StandbyControl_EnablePairingResponse_descriptor;
        }

        public static Builder newBuilder(EnablePairingResponse enablePairingResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(enablePairingResponse);
        }

        public static EnablePairingResponse parseDelimitedFrom(InputStream inputStream) {
            return (EnablePairingResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EnablePairingResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<EnablePairingResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EnablePairingResponse)) {
                return super.equals(obj);
            }
            EnablePairingResponse enablePairingResponse = (EnablePairingResponse) obj;
            if (hasStatus() != enablePairingResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == enablePairingResponse.status_) && getUnknownFields().equals(enablePairingResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EnablePairingResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.status_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIStandbyControl.EnablePairingResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.STATUS_UNKNOWN : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIStandbyControl.EnablePairingResponseOrBuilder
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
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIStandbyControl.internal_static_GDI_Proto_StandbyControl_EnablePairingResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(EnablePairingResponse.class, Builder.class);
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
            return new EnablePairingResponse();
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
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EnablePairingResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(EnablePairingResponse enablePairingResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    enablePairingResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                enablePairingResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIStandbyControl.internal_static_GDI_Proto_StandbyControl_EnablePairingResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EnablePairingResponse build() {
                EnablePairingResponse enablePairingResponseBuildPartial = buildPartial();
                if (enablePairingResponseBuildPartial.isInitialized()) {
                    return enablePairingResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) enablePairingResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EnablePairingResponse buildPartial() {
                EnablePairingResponse enablePairingResponse = new EnablePairingResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(enablePairingResponse);
                }
                onBuilt();
                return enablePairingResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIStandbyControl.internal_static_GDI_Proto_StandbyControl_EnablePairingResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIStandbyControl.EnablePairingResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.STATUS_UNKNOWN : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIStandbyControl.EnablePairingResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIStandbyControl.internal_static_GDI_Proto_StandbyControl_EnablePairingResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(EnablePairingResponse.class, Builder.class);
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

            public Builder setStatus(Status status) {
                status.getClass();
                this.bitField0_ |= 1;
                this.status_ = status.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public EnablePairingResponse getDefaultInstanceForType() {
                return EnablePairingResponse.getDefaultInstance();
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
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EnablePairingResponse) {
                    return mergeFrom((EnablePairingResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EnablePairingResponse enablePairingResponse) {
                if (enablePairingResponse == EnablePairingResponse.getDefaultInstance()) {
                    return this;
                }
                if (enablePairingResponse.hasStatus()) {
                    setStatus(enablePairingResponse.getStatus());
                }
                mergeUnknownFields(enablePairingResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EnablePairingResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static EnablePairingResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnablePairingResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EnablePairingResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ EnablePairingResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static EnablePairingResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private EnablePairingResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EnablePairingResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static EnablePairingResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static EnablePairingResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static EnablePairingResponse parseFrom(InputStream inputStream) {
            return (EnablePairingResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static EnablePairingResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnablePairingResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EnablePairingResponse parseFrom(CodedInputStream codedInputStream) {
            return (EnablePairingResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static EnablePairingResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EnablePairingResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            STATUS_UNKNOWN(0),
            STATUS_ACCEPTED(1),
            STATUS_BUSY(2);

            public static final int STATUS_ACCEPTED_VALUE = 1;
            public static final int STATUS_BUSY_VALUE = 2;
            public static final int STATUS_UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIStandbyControl.EnablePairingResponse.Status.1
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
                    return STATUS_UNKNOWN;
                }
                if (i14 == 1) {
                    return STATUS_ACCEPTED;
                }
                if (i14 != 2) {
                    return null;
                }
                return STATUS_BUSY;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return EnablePairingResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        public static final int ENABLE_PAIRING_REQUEST_FIELD_NUMBER = 1;
        public static final int ENABLE_PAIRING_RESPONSE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private EnablePairingRequest enablePairingRequest_;
        private EnablePairingResponse enablePairingResponse_;
        private byte memoizedIsInitialized;
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDIStandbyControl.Service.1
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
            return GDIStandbyControl.internal_static_GDI_Proto_StandbyControl_Service_descriptor;
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
            if (hasEnablePairingRequest() != service.hasEnablePairingRequest()) {
                return false;
            }
            if ((!hasEnablePairingRequest() || getEnablePairingRequest().equals(service.getEnablePairingRequest())) && hasEnablePairingResponse() == service.hasEnablePairingResponse()) {
                return (!hasEnablePairingResponse() || getEnablePairingResponse().equals(service.getEnablePairingResponse())) && getUnknownFields().equals(service.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIStandbyControl.ServiceOrBuilder
        public EnablePairingRequest getEnablePairingRequest() {
            EnablePairingRequest enablePairingRequest = this.enablePairingRequest_;
            return enablePairingRequest == null ? EnablePairingRequest.getDefaultInstance() : enablePairingRequest;
        }

        @Override // com.garmin.proto.generated.GDIStandbyControl.ServiceOrBuilder
        public EnablePairingRequestOrBuilder getEnablePairingRequestOrBuilder() {
            EnablePairingRequest enablePairingRequest = this.enablePairingRequest_;
            return enablePairingRequest == null ? EnablePairingRequest.getDefaultInstance() : enablePairingRequest;
        }

        @Override // com.garmin.proto.generated.GDIStandbyControl.ServiceOrBuilder
        public EnablePairingResponse getEnablePairingResponse() {
            EnablePairingResponse enablePairingResponse = this.enablePairingResponse_;
            return enablePairingResponse == null ? EnablePairingResponse.getDefaultInstance() : enablePairingResponse;
        }

        @Override // com.garmin.proto.generated.GDIStandbyControl.ServiceOrBuilder
        public EnablePairingResponseOrBuilder getEnablePairingResponseOrBuilder() {
            EnablePairingResponse enablePairingResponse = this.enablePairingResponse_;
            return enablePairingResponse == null ? EnablePairingResponse.getDefaultInstance() : enablePairingResponse;
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
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getEnablePairingRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getEnablePairingResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIStandbyControl.ServiceOrBuilder
        public boolean hasEnablePairingRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIStandbyControl.ServiceOrBuilder
        public boolean hasEnablePairingResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasEnablePairingRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getEnablePairingRequest().hashCode();
            }
            if (hasEnablePairingResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getEnablePairingResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIStandbyControl.internal_static_GDI_Proto_StandbyControl_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getEnablePairingRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getEnablePairingResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<EnablePairingRequest, EnablePairingRequest.Builder, EnablePairingRequestOrBuilder> enablePairingRequestBuilder_;
            private EnablePairingRequest enablePairingRequest_;
            private SingleFieldBuilderV3<EnablePairingResponse, EnablePairingResponse.Builder, EnablePairingResponseOrBuilder> enablePairingResponseBuilder_;
            private EnablePairingResponse enablePairingResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Service service) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<EnablePairingRequest, EnablePairingRequest.Builder, EnablePairingRequestOrBuilder> singleFieldBuilderV3 = this.enablePairingRequestBuilder_;
                    service.enablePairingRequest_ = singleFieldBuilderV3 == null ? this.enablePairingRequest_ : (EnablePairingRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<EnablePairingResponse, EnablePairingResponse.Builder, EnablePairingResponseOrBuilder> singleFieldBuilderV4 = this.enablePairingResponseBuilder_;
                    service.enablePairingResponse_ = singleFieldBuilderV4 == null ? this.enablePairingResponse_ : (EnablePairingResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                service.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIStandbyControl.internal_static_GDI_Proto_StandbyControl_Service_descriptor;
            }

            private SingleFieldBuilderV3<EnablePairingRequest, EnablePairingRequest.Builder, EnablePairingRequestOrBuilder> getEnablePairingRequestFieldBuilder() {
                if (this.enablePairingRequestBuilder_ == null) {
                    this.enablePairingRequestBuilder_ = new SingleFieldBuilderV3<>(getEnablePairingRequest(), getParentForChildren(), isClean());
                    this.enablePairingRequest_ = null;
                }
                return this.enablePairingRequestBuilder_;
            }

            private SingleFieldBuilderV3<EnablePairingResponse, EnablePairingResponse.Builder, EnablePairingResponseOrBuilder> getEnablePairingResponseFieldBuilder() {
                if (this.enablePairingResponseBuilder_ == null) {
                    this.enablePairingResponseBuilder_ = new SingleFieldBuilderV3<>(getEnablePairingResponse(), getParentForChildren(), isClean());
                    this.enablePairingResponse_ = null;
                }
                return this.enablePairingResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getEnablePairingRequestFieldBuilder();
                    getEnablePairingResponseFieldBuilder();
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
                this.enablePairingRequest_ = null;
                SingleFieldBuilderV3<EnablePairingRequest, EnablePairingRequest.Builder, EnablePairingRequestOrBuilder> singleFieldBuilderV3 = this.enablePairingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.enablePairingRequestBuilder_ = null;
                }
                this.enablePairingResponse_ = null;
                SingleFieldBuilderV3<EnablePairingResponse, EnablePairingResponse.Builder, EnablePairingResponseOrBuilder> singleFieldBuilderV4 = this.enablePairingResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.enablePairingResponseBuilder_ = null;
                }
                return this;
            }

            public Builder clearEnablePairingRequest() {
                this.bitField0_ &= -2;
                this.enablePairingRequest_ = null;
                SingleFieldBuilderV3<EnablePairingRequest, EnablePairingRequest.Builder, EnablePairingRequestOrBuilder> singleFieldBuilderV3 = this.enablePairingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.enablePairingRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearEnablePairingResponse() {
                this.bitField0_ &= -3;
                this.enablePairingResponse_ = null;
                SingleFieldBuilderV3<EnablePairingResponse, EnablePairingResponse.Builder, EnablePairingResponseOrBuilder> singleFieldBuilderV3 = this.enablePairingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.enablePairingResponseBuilder_ = null;
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
                return GDIStandbyControl.internal_static_GDI_Proto_StandbyControl_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIStandbyControl.ServiceOrBuilder
            public EnablePairingRequest getEnablePairingRequest() {
                SingleFieldBuilderV3<EnablePairingRequest, EnablePairingRequest.Builder, EnablePairingRequestOrBuilder> singleFieldBuilderV3 = this.enablePairingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EnablePairingRequest) singleFieldBuilderV3.getMessage();
                }
                EnablePairingRequest enablePairingRequest = this.enablePairingRequest_;
                return enablePairingRequest == null ? EnablePairingRequest.getDefaultInstance() : enablePairingRequest;
            }

            public EnablePairingRequest.Builder getEnablePairingRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (EnablePairingRequest.Builder) getEnablePairingRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIStandbyControl.ServiceOrBuilder
            public EnablePairingRequestOrBuilder getEnablePairingRequestOrBuilder() {
                SingleFieldBuilderV3<EnablePairingRequest, EnablePairingRequest.Builder, EnablePairingRequestOrBuilder> singleFieldBuilderV3 = this.enablePairingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EnablePairingRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                EnablePairingRequest enablePairingRequest = this.enablePairingRequest_;
                return enablePairingRequest == null ? EnablePairingRequest.getDefaultInstance() : enablePairingRequest;
            }

            @Override // com.garmin.proto.generated.GDIStandbyControl.ServiceOrBuilder
            public EnablePairingResponse getEnablePairingResponse() {
                SingleFieldBuilderV3<EnablePairingResponse, EnablePairingResponse.Builder, EnablePairingResponseOrBuilder> singleFieldBuilderV3 = this.enablePairingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EnablePairingResponse) singleFieldBuilderV3.getMessage();
                }
                EnablePairingResponse enablePairingResponse = this.enablePairingResponse_;
                return enablePairingResponse == null ? EnablePairingResponse.getDefaultInstance() : enablePairingResponse;
            }

            public EnablePairingResponse.Builder getEnablePairingResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (EnablePairingResponse.Builder) getEnablePairingResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIStandbyControl.ServiceOrBuilder
            public EnablePairingResponseOrBuilder getEnablePairingResponseOrBuilder() {
                SingleFieldBuilderV3<EnablePairingResponse, EnablePairingResponse.Builder, EnablePairingResponseOrBuilder> singleFieldBuilderV3 = this.enablePairingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EnablePairingResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                EnablePairingResponse enablePairingResponse = this.enablePairingResponse_;
                return enablePairingResponse == null ? EnablePairingResponse.getDefaultInstance() : enablePairingResponse;
            }

            @Override // com.garmin.proto.generated.GDIStandbyControl.ServiceOrBuilder
            public boolean hasEnablePairingRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIStandbyControl.ServiceOrBuilder
            public boolean hasEnablePairingResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIStandbyControl.internal_static_GDI_Proto_StandbyControl_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeEnablePairingRequest(EnablePairingRequest enablePairingRequest) {
                EnablePairingRequest enablePairingRequest2;
                SingleFieldBuilderV3<EnablePairingRequest, EnablePairingRequest.Builder, EnablePairingRequestOrBuilder> singleFieldBuilderV3 = this.enablePairingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(enablePairingRequest);
                } else if ((this.bitField0_ & 1) == 0 || (enablePairingRequest2 = this.enablePairingRequest_) == null || enablePairingRequest2 == EnablePairingRequest.getDefaultInstance()) {
                    this.enablePairingRequest_ = enablePairingRequest;
                } else {
                    getEnablePairingRequestBuilder().mergeFrom(enablePairingRequest);
                }
                if (this.enablePairingRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeEnablePairingResponse(EnablePairingResponse enablePairingResponse) {
                EnablePairingResponse enablePairingResponse2;
                SingleFieldBuilderV3<EnablePairingResponse, EnablePairingResponse.Builder, EnablePairingResponseOrBuilder> singleFieldBuilderV3 = this.enablePairingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(enablePairingResponse);
                } else if ((this.bitField0_ & 2) == 0 || (enablePairingResponse2 = this.enablePairingResponse_) == null || enablePairingResponse2 == EnablePairingResponse.getDefaultInstance()) {
                    this.enablePairingResponse_ = enablePairingResponse;
                } else {
                    getEnablePairingResponseBuilder().mergeFrom(enablePairingResponse);
                }
                if (this.enablePairingResponse_ != null) {
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
                                    codedInputStream.readMessage(getEnablePairingRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getEnablePairingResponseFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setEnablePairingRequest(EnablePairingRequest.Builder builder) {
                SingleFieldBuilderV3<EnablePairingRequest, EnablePairingRequest.Builder, EnablePairingRequestOrBuilder> singleFieldBuilderV3 = this.enablePairingRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.enablePairingRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setEnablePairingResponse(EnablePairingResponse.Builder builder) {
                SingleFieldBuilderV3<EnablePairingResponse, EnablePairingResponse.Builder, EnablePairingResponseOrBuilder> singleFieldBuilderV3 = this.enablePairingResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.enablePairingResponse_ = builder.build();
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

            public Builder setEnablePairingRequest(EnablePairingRequest enablePairingRequest) {
                SingleFieldBuilderV3<EnablePairingRequest, EnablePairingRequest.Builder, EnablePairingRequestOrBuilder> singleFieldBuilderV3 = this.enablePairingRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    enablePairingRequest.getClass();
                    this.enablePairingRequest_ = enablePairingRequest;
                } else {
                    singleFieldBuilderV3.setMessage(enablePairingRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setEnablePairingResponse(EnablePairingResponse enablePairingResponse) {
                SingleFieldBuilderV3<EnablePairingResponse, EnablePairingResponse.Builder, EnablePairingResponseOrBuilder> singleFieldBuilderV3 = this.enablePairingResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    enablePairingResponse.getClass();
                    this.enablePairingResponse_ = enablePairingResponse;
                } else {
                    singleFieldBuilderV3.setMessage(enablePairingResponse);
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
                if (service.hasEnablePairingRequest()) {
                    mergeEnablePairingRequest(service.getEnablePairingRequest());
                }
                if (service.hasEnablePairingResponse()) {
                    mergeEnablePairingResponse(service.getEnablePairingResponse());
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
