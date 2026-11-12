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

/* JADX INFO: loaded from: classes5.dex */
public final class GDIIopMessage {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0013GDIIopMessage.proto\u0012\u0014GDI.Proto.IopMessage\"\u0097\u0001\n\u0007Service\u0012D\n\u0013iop_message_request\u0018\u0001 \u0001(\u000b2'.GDI.Proto.IopMessage.IopMessageRequest\u0012F\n\u0014iop_message_response\u0018\u0002 \u0001(\u000b2(.GDI.Proto.IopMessage.IopMessageResponse\"H\n\u0011IopMessageRequest\u00123\n\niop_packet\u0018\u0001 \u0001(\u000b2\u001f.GDI.Proto.IopMessage.IopPacket\"\u0082\u0001\n\u0012IopMessageResponse\u0012G\n\u0006status\u0018\u0001 \u0001(\u000e27.GDI.Proto.IopMessage.IopMessageResponse.ResponseStatus\"#\n\u000eResponseStatus\u0012\u0006\n\u0002OK\u0010\u0000\u0012\t\n\u0005ERROR\u0010\u0001\"%\n\tIopPacket\u0012\n\n\u0002id\u0018\u0001 \u0002(\r\u0012\f\n\u0004data\u0018\u0002 \u0001(\fB-\n\u001acom.garmin.proto.generatedB\rGDIIopMessageH\u0003"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor internal_static_GDI_Proto_IopMessage_IopMessageRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_IopMessage_IopMessageRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_IopMessage_IopMessageResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_IopMessage_IopMessageResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_IopMessage_IopPacket_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_IopMessage_IopPacket_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_IopMessage_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_IopMessage_Service_fieldAccessorTable;

    public interface IopMessageRequestOrBuilder extends MessageOrBuilder {
        IopPacket getIopPacket();

        IopPacketOrBuilder getIopPacketOrBuilder();

        boolean hasIopPacket();
    }

    public interface IopMessageResponseOrBuilder extends MessageOrBuilder {
        IopMessageResponse.ResponseStatus getStatus();

        boolean hasStatus();
    }

    public interface IopPacketOrBuilder extends MessageOrBuilder {
        ByteString getData();

        int getId();

        boolean hasData();

        boolean hasId();
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
        IopMessageRequest getIopMessageRequest();

        IopMessageRequestOrBuilder getIopMessageRequestOrBuilder();

        IopMessageResponse getIopMessageResponse();

        IopMessageResponseOrBuilder getIopMessageResponseOrBuilder();

        boolean hasIopMessageRequest();

        boolean hasIopMessageResponse();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_IopMessage_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_IopMessage_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"IopMessageRequest", "IopMessageResponse"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_IopMessage_IopMessageRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_IopMessage_IopMessageRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"IopPacket"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_IopMessage_IopMessageResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_IopMessage_IopMessageResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Status"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_IopMessage_IopPacket_descriptor = descriptor5;
        internal_static_GDI_Proto_IopMessage_IopPacket_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Id", "Data"});
    }

    private GDIIopMessage() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class IopMessageRequest extends GeneratedMessageV3 implements IopMessageRequestOrBuilder {
        public static final int IOP_PACKET_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private IopPacket iopPacket_;
        private byte memoizedIsInitialized;
        private static final IopMessageRequest DEFAULT_INSTANCE = new IopMessageRequest();

        @Deprecated
        public static final Parser<IopMessageRequest> PARSER = new AbstractParser<IopMessageRequest>() { // from class: com.garmin.proto.generated.GDIIopMessage.IopMessageRequest.1
            @Override // com.google.protobuf.Parser
            public IopMessageRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = IopMessageRequest.newBuilder();
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

        private IopMessageRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static IopMessageRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIIopMessage.internal_static_GDI_Proto_IopMessage_IopMessageRequest_descriptor;
        }

        public static Builder newBuilder(IopMessageRequest iopMessageRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(iopMessageRequest);
        }

        public static IopMessageRequest parseDelimitedFrom(InputStream inputStream) {
            return (IopMessageRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static IopMessageRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<IopMessageRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IopMessageRequest)) {
                return super.equals(obj);
            }
            IopMessageRequest iopMessageRequest = (IopMessageRequest) obj;
            if (hasIopPacket() != iopMessageRequest.hasIopPacket()) {
                return false;
            }
            return (!hasIopPacket() || getIopPacket().equals(iopMessageRequest.getIopPacket())) && getUnknownFields().equals(iopMessageRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIIopMessage.IopMessageRequestOrBuilder
        public IopPacket getIopPacket() {
            IopPacket iopPacket = this.iopPacket_;
            return iopPacket == null ? IopPacket.getDefaultInstance() : iopPacket;
        }

        @Override // com.garmin.proto.generated.GDIIopMessage.IopMessageRequestOrBuilder
        public IopPacketOrBuilder getIopPacketOrBuilder() {
            IopPacket iopPacket = this.iopPacket_;
            return iopPacket == null ? IopPacket.getDefaultInstance() : iopPacket;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<IopMessageRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getIopPacket()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIIopMessage.IopMessageRequestOrBuilder
        public boolean hasIopPacket() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasIopPacket()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getIopPacket().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIIopMessage.internal_static_GDI_Proto_IopMessage_IopMessageRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(IopMessageRequest.class, Builder.class);
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
            if (!hasIopPacket() || getIopPacket().isInitialized()) {
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
            return new IopMessageRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getIopPacket());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements IopMessageRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<IopPacket, IopPacket.Builder, IopPacketOrBuilder> iopPacketBuilder_;
            private IopPacket iopPacket_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(IopMessageRequest iopMessageRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<IopPacket, IopPacket.Builder, IopPacketOrBuilder> singleFieldBuilderV3 = this.iopPacketBuilder_;
                    iopMessageRequest.iopPacket_ = singleFieldBuilderV3 == null ? this.iopPacket_ : (IopPacket) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                iopMessageRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIIopMessage.internal_static_GDI_Proto_IopMessage_IopMessageRequest_descriptor;
            }

            private SingleFieldBuilderV3<IopPacket, IopPacket.Builder, IopPacketOrBuilder> getIopPacketFieldBuilder() {
                if (this.iopPacketBuilder_ == null) {
                    this.iopPacketBuilder_ = new SingleFieldBuilderV3<>(getIopPacket(), getParentForChildren(), isClean());
                    this.iopPacket_ = null;
                }
                return this.iopPacketBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getIopPacketFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public IopMessageRequest build() {
                IopMessageRequest iopMessageRequestBuildPartial = buildPartial();
                if (iopMessageRequestBuildPartial.isInitialized()) {
                    return iopMessageRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) iopMessageRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public IopMessageRequest buildPartial() {
                IopMessageRequest iopMessageRequest = new IopMessageRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(iopMessageRequest);
                }
                onBuilt();
                return iopMessageRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.iopPacket_ = null;
                SingleFieldBuilderV3<IopPacket, IopPacket.Builder, IopPacketOrBuilder> singleFieldBuilderV3 = this.iopPacketBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.iopPacketBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearIopPacket() {
                this.bitField0_ &= -2;
                this.iopPacket_ = null;
                SingleFieldBuilderV3<IopPacket, IopPacket.Builder, IopPacketOrBuilder> singleFieldBuilderV3 = this.iopPacketBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.iopPacketBuilder_ = null;
                }
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
                return GDIIopMessage.internal_static_GDI_Proto_IopMessage_IopMessageRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIIopMessage.IopMessageRequestOrBuilder
            public IopPacket getIopPacket() {
                SingleFieldBuilderV3<IopPacket, IopPacket.Builder, IopPacketOrBuilder> singleFieldBuilderV3 = this.iopPacketBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (IopPacket) singleFieldBuilderV3.getMessage();
                }
                IopPacket iopPacket = this.iopPacket_;
                return iopPacket == null ? IopPacket.getDefaultInstance() : iopPacket;
            }

            public IopPacket.Builder getIopPacketBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (IopPacket.Builder) getIopPacketFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIopMessage.IopMessageRequestOrBuilder
            public IopPacketOrBuilder getIopPacketOrBuilder() {
                SingleFieldBuilderV3<IopPacket, IopPacket.Builder, IopPacketOrBuilder> singleFieldBuilderV3 = this.iopPacketBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (IopPacketOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                IopPacket iopPacket = this.iopPacket_;
                return iopPacket == null ? IopPacket.getDefaultInstance() : iopPacket;
            }

            @Override // com.garmin.proto.generated.GDIIopMessage.IopMessageRequestOrBuilder
            public boolean hasIopPacket() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIIopMessage.internal_static_GDI_Proto_IopMessage_IopMessageRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(IopMessageRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasIopPacket() || getIopPacket().isInitialized();
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
                                    codedInputStream.readMessage(getIopPacketFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeIopPacket(IopPacket iopPacket) {
                IopPacket iopPacket2;
                SingleFieldBuilderV3<IopPacket, IopPacket.Builder, IopPacketOrBuilder> singleFieldBuilderV3 = this.iopPacketBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(iopPacket);
                } else if ((this.bitField0_ & 1) == 0 || (iopPacket2 = this.iopPacket_) == null || iopPacket2 == IopPacket.getDefaultInstance()) {
                    this.iopPacket_ = iopPacket;
                } else {
                    getIopPacketBuilder().mergeFrom(iopPacket);
                }
                if (this.iopPacket_ != null) {
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

            public Builder setIopPacket(IopPacket.Builder builder) {
                SingleFieldBuilderV3<IopPacket, IopPacket.Builder, IopPacketOrBuilder> singleFieldBuilderV3 = this.iopPacketBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.iopPacket_ = builder.build();
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
            public IopMessageRequest getDefaultInstanceForType() {
                return IopMessageRequest.getDefaultInstance();
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

            public Builder setIopPacket(IopPacket iopPacket) {
                SingleFieldBuilderV3<IopPacket, IopPacket.Builder, IopPacketOrBuilder> singleFieldBuilderV3 = this.iopPacketBuilder_;
                if (singleFieldBuilderV3 == null) {
                    iopPacket.getClass();
                    this.iopPacket_ = iopPacket;
                } else {
                    singleFieldBuilderV3.setMessage(iopPacket);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof IopMessageRequest) {
                    return mergeFrom((IopMessageRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(IopMessageRequest iopMessageRequest) {
                if (iopMessageRequest == IopMessageRequest.getDefaultInstance()) {
                    return this;
                }
                if (iopMessageRequest.hasIopPacket()) {
                    mergeIopPacket(iopMessageRequest.getIopPacket());
                }
                mergeUnknownFields(iopMessageRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public IopMessageRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ IopMessageRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private IopMessageRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static IopMessageRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IopMessageRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static IopMessageRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static IopMessageRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static IopMessageRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static IopMessageRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static IopMessageRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static IopMessageRequest parseFrom(InputStream inputStream) {
            return (IopMessageRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static IopMessageRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IopMessageRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static IopMessageRequest parseFrom(CodedInputStream codedInputStream) {
            return (IopMessageRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static IopMessageRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IopMessageRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class IopMessageResponse extends GeneratedMessageV3 implements IopMessageResponseOrBuilder {
        private static final IopMessageResponse DEFAULT_INSTANCE = new IopMessageResponse();

        @Deprecated
        public static final Parser<IopMessageResponse> PARSER = new AbstractParser<IopMessageResponse>() { // from class: com.garmin.proto.generated.GDIIopMessage.IopMessageResponse.1
            @Override // com.google.protobuf.Parser
            public IopMessageResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = IopMessageResponse.newBuilder();
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

        private IopMessageResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static IopMessageResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIIopMessage.internal_static_GDI_Proto_IopMessage_IopMessageResponse_descriptor;
        }

        public static Builder newBuilder(IopMessageResponse iopMessageResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(iopMessageResponse);
        }

        public static IopMessageResponse parseDelimitedFrom(InputStream inputStream) {
            return (IopMessageResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static IopMessageResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<IopMessageResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IopMessageResponse)) {
                return super.equals(obj);
            }
            IopMessageResponse iopMessageResponse = (IopMessageResponse) obj;
            if (hasStatus() != iopMessageResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == iopMessageResponse.status_) && getUnknownFields().equals(iopMessageResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<IopMessageResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIIopMessage.IopMessageResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.OK : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIIopMessage.IopMessageResponseOrBuilder
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
            return GDIIopMessage.internal_static_GDI_Proto_IopMessage_IopMessageResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(IopMessageResponse.class, Builder.class);
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
            return new IopMessageResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements IopMessageResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(IopMessageResponse iopMessageResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    iopMessageResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                iopMessageResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIIopMessage.internal_static_GDI_Proto_IopMessage_IopMessageResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public IopMessageResponse build() {
                IopMessageResponse iopMessageResponseBuildPartial = buildPartial();
                if (iopMessageResponseBuildPartial.isInitialized()) {
                    return iopMessageResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) iopMessageResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public IopMessageResponse buildPartial() {
                IopMessageResponse iopMessageResponse = new IopMessageResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(iopMessageResponse);
                }
                onBuilt();
                return iopMessageResponse;
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
                return GDIIopMessage.internal_static_GDI_Proto_IopMessage_IopMessageResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIIopMessage.IopMessageResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.OK : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIIopMessage.IopMessageResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIIopMessage.internal_static_GDI_Proto_IopMessage_IopMessageResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(IopMessageResponse.class, Builder.class);
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
                                    if (ResponseStatus.forNumber(i14) == null) {
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

            public Builder setStatus(ResponseStatus responseStatus) {
                responseStatus.getClass();
                this.bitField0_ |= 1;
                this.status_ = responseStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public IopMessageResponse getDefaultInstanceForType() {
                return IopMessageResponse.getDefaultInstance();
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
                if (message instanceof IopMessageResponse) {
                    return mergeFrom((IopMessageResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(IopMessageResponse iopMessageResponse) {
                if (iopMessageResponse == IopMessageResponse.getDefaultInstance()) {
                    return this;
                }
                if (iopMessageResponse.hasStatus()) {
                    setStatus(iopMessageResponse.getStatus());
                }
                mergeUnknownFields(iopMessageResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public IopMessageResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static IopMessageResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IopMessageResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static IopMessageResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ IopMessageResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static IopMessageResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private IopMessageResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static IopMessageResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static IopMessageResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static IopMessageResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static IopMessageResponse parseFrom(InputStream inputStream) {
            return (IopMessageResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static IopMessageResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IopMessageResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static IopMessageResponse parseFrom(CodedInputStream codedInputStream) {
            return (IopMessageResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static IopMessageResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IopMessageResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            OK(0),
            ERROR(1);

            public static final int ERROR_VALUE = 1;
            public static final int OK_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDIIopMessage.IopMessageResponse.ResponseStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ResponseStatus findValueByNumber(int i14) {
                    return ResponseStatus.forNumber(i14);
                }
            };
            private static final ResponseStatus[] VALUES = values();

            ResponseStatus(int i14) {
                this.value = i14;
            }

            public static ResponseStatus forNumber(int i14) {
                if (i14 == 0) {
                    return OK;
                }
                if (i14 != 1) {
                    return null;
                }
                return ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return IopMessageResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<ResponseStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static ResponseStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static ResponseStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class IopPacket extends GeneratedMessageV3 implements IopPacketOrBuilder {
        public static final int DATA_FIELD_NUMBER = 2;
        public static final int ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString data_;
        private int id_;
        private byte memoizedIsInitialized;
        private static final IopPacket DEFAULT_INSTANCE = new IopPacket();

        @Deprecated
        public static final Parser<IopPacket> PARSER = new AbstractParser<IopPacket>() { // from class: com.garmin.proto.generated.GDIIopMessage.IopPacket.1
            @Override // com.google.protobuf.Parser
            public IopPacket parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = IopPacket.newBuilder();
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

        private IopPacket(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.id_ = 0;
            this.data_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static IopPacket getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIIopMessage.internal_static_GDI_Proto_IopMessage_IopPacket_descriptor;
        }

        public static Builder newBuilder(IopPacket iopPacket) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(iopPacket);
        }

        public static IopPacket parseDelimitedFrom(InputStream inputStream) {
            return (IopPacket) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static IopPacket parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<IopPacket> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof IopPacket)) {
                return super.equals(obj);
            }
            IopPacket iopPacket = (IopPacket) obj;
            if (hasId() != iopPacket.hasId()) {
                return false;
            }
            if ((!hasId() || getId() == iopPacket.getId()) && hasData() == iopPacket.hasData()) {
                return (!hasData() || getData().equals(iopPacket.getData())) && getUnknownFields().equals(iopPacket.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIIopMessage.IopPacketOrBuilder
        public ByteString getData() {
            return this.data_;
        }

        @Override // com.garmin.proto.generated.GDIIopMessage.IopPacketOrBuilder
        public int getId() {
            return this.id_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<IopPacket> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.id_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBytesSize(2, this.data_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIIopMessage.IopPacketOrBuilder
        public boolean hasData() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIIopMessage.IopPacketOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getId();
            }
            if (hasData()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getData().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIIopMessage.internal_static_GDI_Proto_IopMessage_IopPacket_fieldAccessorTable.ensureFieldAccessorsInitialized(IopPacket.class, Builder.class);
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
            if (hasId()) {
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
            return new IopPacket();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.id_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBytes(2, this.data_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements IopPacketOrBuilder {
            private int bitField0_;
            private ByteString data_;
            private int id_;

            private Builder() {
                this.data_ = ByteString.EMPTY;
            }

            private void buildPartial0(IopPacket iopPacket) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    iopPacket.id_ = this.id_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    iopPacket.data_ = this.data_;
                    i14 |= 2;
                }
                iopPacket.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIIopMessage.internal_static_GDI_Proto_IopMessage_IopPacket_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public IopPacket build() {
                IopPacket iopPacketBuildPartial = buildPartial();
                if (iopPacketBuildPartial.isInitialized()) {
                    return iopPacketBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) iopPacketBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public IopPacket buildPartial() {
                IopPacket iopPacket = new IopPacket(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(iopPacket);
                }
                onBuilt();
                return iopPacket;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = 0;
                this.data_ = ByteString.EMPTY;
                return this;
            }

            public Builder clearData() {
                this.bitField0_ &= -3;
                this.data_ = IopPacket.getDefaultInstance().getData();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearId() {
                this.bitField0_ &= -2;
                this.id_ = 0;
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

            @Override // com.garmin.proto.generated.GDIIopMessage.IopPacketOrBuilder
            public ByteString getData() {
                return this.data_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIIopMessage.internal_static_GDI_Proto_IopMessage_IopPacket_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIIopMessage.IopPacketOrBuilder
            public int getId() {
                return this.id_;
            }

            @Override // com.garmin.proto.generated.GDIIopMessage.IopPacketOrBuilder
            public boolean hasData() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIIopMessage.IopPacketOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIIopMessage.internal_static_GDI_Proto_IopMessage_IopPacket_fieldAccessorTable.ensureFieldAccessorsInitialized(IopPacket.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasId();
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
                                    this.id_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.data_ = codedInputStream.readBytes();
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

            public Builder setData(ByteString byteString) {
                byteString.getClass();
                this.data_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setId(int i14) {
                this.id_ = i14;
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
            public IopPacket getDefaultInstanceForType() {
                return IopPacket.getDefaultInstance();
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
                if (message instanceof IopPacket) {
                    return mergeFrom((IopPacket) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(IopPacket iopPacket) {
                if (iopPacket == IopPacket.getDefaultInstance()) {
                    return this;
                }
                if (iopPacket.hasId()) {
                    setId(iopPacket.getId());
                }
                if (iopPacket.hasData()) {
                    setData(iopPacket.getData());
                }
                mergeUnknownFields(iopPacket.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public IopPacket getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static IopPacket parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IopPacket) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static IopPacket parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static IopPacket parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static IopPacket parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static IopPacket parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static IopPacket parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ IopPacket(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static IopPacket parseFrom(InputStream inputStream) {
            return (IopPacket) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private IopPacket() {
            this.id_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.data_ = byteString;
        }

        public static IopPacket parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IopPacket) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static IopPacket parseFrom(CodedInputStream codedInputStream) {
            return (IopPacket) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static IopPacket parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (IopPacket) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        public static final int IOP_MESSAGE_REQUEST_FIELD_NUMBER = 1;
        public static final int IOP_MESSAGE_RESPONSE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private IopMessageRequest iopMessageRequest_;
        private IopMessageResponse iopMessageResponse_;
        private byte memoizedIsInitialized;
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDIIopMessage.Service.1
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
            return GDIIopMessage.internal_static_GDI_Proto_IopMessage_Service_descriptor;
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
            if (hasIopMessageRequest() != service.hasIopMessageRequest()) {
                return false;
            }
            if ((!hasIopMessageRequest() || getIopMessageRequest().equals(service.getIopMessageRequest())) && hasIopMessageResponse() == service.hasIopMessageResponse()) {
                return (!hasIopMessageResponse() || getIopMessageResponse().equals(service.getIopMessageResponse())) && getUnknownFields().equals(service.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIIopMessage.ServiceOrBuilder
        public IopMessageRequest getIopMessageRequest() {
            IopMessageRequest iopMessageRequest = this.iopMessageRequest_;
            return iopMessageRequest == null ? IopMessageRequest.getDefaultInstance() : iopMessageRequest;
        }

        @Override // com.garmin.proto.generated.GDIIopMessage.ServiceOrBuilder
        public IopMessageRequestOrBuilder getIopMessageRequestOrBuilder() {
            IopMessageRequest iopMessageRequest = this.iopMessageRequest_;
            return iopMessageRequest == null ? IopMessageRequest.getDefaultInstance() : iopMessageRequest;
        }

        @Override // com.garmin.proto.generated.GDIIopMessage.ServiceOrBuilder
        public IopMessageResponse getIopMessageResponse() {
            IopMessageResponse iopMessageResponse = this.iopMessageResponse_;
            return iopMessageResponse == null ? IopMessageResponse.getDefaultInstance() : iopMessageResponse;
        }

        @Override // com.garmin.proto.generated.GDIIopMessage.ServiceOrBuilder
        public IopMessageResponseOrBuilder getIopMessageResponseOrBuilder() {
            IopMessageResponse iopMessageResponse = this.iopMessageResponse_;
            return iopMessageResponse == null ? IopMessageResponse.getDefaultInstance() : iopMessageResponse;
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
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getIopMessageRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getIopMessageResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIIopMessage.ServiceOrBuilder
        public boolean hasIopMessageRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIIopMessage.ServiceOrBuilder
        public boolean hasIopMessageResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasIopMessageRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getIopMessageRequest().hashCode();
            }
            if (hasIopMessageResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getIopMessageResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIIopMessage.internal_static_GDI_Proto_IopMessage_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
            if (!hasIopMessageRequest() || getIopMessageRequest().isInitialized()) {
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
                codedOutputStream.writeMessage(1, getIopMessageRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getIopMessageResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<IopMessageRequest, IopMessageRequest.Builder, IopMessageRequestOrBuilder> iopMessageRequestBuilder_;
            private IopMessageRequest iopMessageRequest_;
            private SingleFieldBuilderV3<IopMessageResponse, IopMessageResponse.Builder, IopMessageResponseOrBuilder> iopMessageResponseBuilder_;
            private IopMessageResponse iopMessageResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Service service) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<IopMessageRequest, IopMessageRequest.Builder, IopMessageRequestOrBuilder> singleFieldBuilderV3 = this.iopMessageRequestBuilder_;
                    service.iopMessageRequest_ = singleFieldBuilderV3 == null ? this.iopMessageRequest_ : (IopMessageRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<IopMessageResponse, IopMessageResponse.Builder, IopMessageResponseOrBuilder> singleFieldBuilderV4 = this.iopMessageResponseBuilder_;
                    service.iopMessageResponse_ = singleFieldBuilderV4 == null ? this.iopMessageResponse_ : (IopMessageResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                service.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIIopMessage.internal_static_GDI_Proto_IopMessage_Service_descriptor;
            }

            private SingleFieldBuilderV3<IopMessageRequest, IopMessageRequest.Builder, IopMessageRequestOrBuilder> getIopMessageRequestFieldBuilder() {
                if (this.iopMessageRequestBuilder_ == null) {
                    this.iopMessageRequestBuilder_ = new SingleFieldBuilderV3<>(getIopMessageRequest(), getParentForChildren(), isClean());
                    this.iopMessageRequest_ = null;
                }
                return this.iopMessageRequestBuilder_;
            }

            private SingleFieldBuilderV3<IopMessageResponse, IopMessageResponse.Builder, IopMessageResponseOrBuilder> getIopMessageResponseFieldBuilder() {
                if (this.iopMessageResponseBuilder_ == null) {
                    this.iopMessageResponseBuilder_ = new SingleFieldBuilderV3<>(getIopMessageResponse(), getParentForChildren(), isClean());
                    this.iopMessageResponse_ = null;
                }
                return this.iopMessageResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getIopMessageRequestFieldBuilder();
                    getIopMessageResponseFieldBuilder();
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
                this.iopMessageRequest_ = null;
                SingleFieldBuilderV3<IopMessageRequest, IopMessageRequest.Builder, IopMessageRequestOrBuilder> singleFieldBuilderV3 = this.iopMessageRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.iopMessageRequestBuilder_ = null;
                }
                this.iopMessageResponse_ = null;
                SingleFieldBuilderV3<IopMessageResponse, IopMessageResponse.Builder, IopMessageResponseOrBuilder> singleFieldBuilderV4 = this.iopMessageResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.iopMessageResponseBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearIopMessageRequest() {
                this.bitField0_ &= -2;
                this.iopMessageRequest_ = null;
                SingleFieldBuilderV3<IopMessageRequest, IopMessageRequest.Builder, IopMessageRequestOrBuilder> singleFieldBuilderV3 = this.iopMessageRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.iopMessageRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearIopMessageResponse() {
                this.bitField0_ &= -3;
                this.iopMessageResponse_ = null;
                SingleFieldBuilderV3<IopMessageResponse, IopMessageResponse.Builder, IopMessageResponseOrBuilder> singleFieldBuilderV3 = this.iopMessageResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.iopMessageResponseBuilder_ = null;
                }
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
                return GDIIopMessage.internal_static_GDI_Proto_IopMessage_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIIopMessage.ServiceOrBuilder
            public IopMessageRequest getIopMessageRequest() {
                SingleFieldBuilderV3<IopMessageRequest, IopMessageRequest.Builder, IopMessageRequestOrBuilder> singleFieldBuilderV3 = this.iopMessageRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (IopMessageRequest) singleFieldBuilderV3.getMessage();
                }
                IopMessageRequest iopMessageRequest = this.iopMessageRequest_;
                return iopMessageRequest == null ? IopMessageRequest.getDefaultInstance() : iopMessageRequest;
            }

            public IopMessageRequest.Builder getIopMessageRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (IopMessageRequest.Builder) getIopMessageRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIopMessage.ServiceOrBuilder
            public IopMessageRequestOrBuilder getIopMessageRequestOrBuilder() {
                SingleFieldBuilderV3<IopMessageRequest, IopMessageRequest.Builder, IopMessageRequestOrBuilder> singleFieldBuilderV3 = this.iopMessageRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (IopMessageRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                IopMessageRequest iopMessageRequest = this.iopMessageRequest_;
                return iopMessageRequest == null ? IopMessageRequest.getDefaultInstance() : iopMessageRequest;
            }

            @Override // com.garmin.proto.generated.GDIIopMessage.ServiceOrBuilder
            public IopMessageResponse getIopMessageResponse() {
                SingleFieldBuilderV3<IopMessageResponse, IopMessageResponse.Builder, IopMessageResponseOrBuilder> singleFieldBuilderV3 = this.iopMessageResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (IopMessageResponse) singleFieldBuilderV3.getMessage();
                }
                IopMessageResponse iopMessageResponse = this.iopMessageResponse_;
                return iopMessageResponse == null ? IopMessageResponse.getDefaultInstance() : iopMessageResponse;
            }

            public IopMessageResponse.Builder getIopMessageResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (IopMessageResponse.Builder) getIopMessageResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIIopMessage.ServiceOrBuilder
            public IopMessageResponseOrBuilder getIopMessageResponseOrBuilder() {
                SingleFieldBuilderV3<IopMessageResponse, IopMessageResponse.Builder, IopMessageResponseOrBuilder> singleFieldBuilderV3 = this.iopMessageResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (IopMessageResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                IopMessageResponse iopMessageResponse = this.iopMessageResponse_;
                return iopMessageResponse == null ? IopMessageResponse.getDefaultInstance() : iopMessageResponse;
            }

            @Override // com.garmin.proto.generated.GDIIopMessage.ServiceOrBuilder
            public boolean hasIopMessageRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIIopMessage.ServiceOrBuilder
            public boolean hasIopMessageResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIIopMessage.internal_static_GDI_Proto_IopMessage_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasIopMessageRequest() || getIopMessageRequest().isInitialized();
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
                                    codedInputStream.readMessage(getIopMessageRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getIopMessageResponseFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeIopMessageRequest(IopMessageRequest iopMessageRequest) {
                IopMessageRequest iopMessageRequest2;
                SingleFieldBuilderV3<IopMessageRequest, IopMessageRequest.Builder, IopMessageRequestOrBuilder> singleFieldBuilderV3 = this.iopMessageRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(iopMessageRequest);
                } else if ((this.bitField0_ & 1) == 0 || (iopMessageRequest2 = this.iopMessageRequest_) == null || iopMessageRequest2 == IopMessageRequest.getDefaultInstance()) {
                    this.iopMessageRequest_ = iopMessageRequest;
                } else {
                    getIopMessageRequestBuilder().mergeFrom(iopMessageRequest);
                }
                if (this.iopMessageRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeIopMessageResponse(IopMessageResponse iopMessageResponse) {
                IopMessageResponse iopMessageResponse2;
                SingleFieldBuilderV3<IopMessageResponse, IopMessageResponse.Builder, IopMessageResponseOrBuilder> singleFieldBuilderV3 = this.iopMessageResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(iopMessageResponse);
                } else if ((this.bitField0_ & 2) == 0 || (iopMessageResponse2 = this.iopMessageResponse_) == null || iopMessageResponse2 == IopMessageResponse.getDefaultInstance()) {
                    this.iopMessageResponse_ = iopMessageResponse;
                } else {
                    getIopMessageResponseBuilder().mergeFrom(iopMessageResponse);
                }
                if (this.iopMessageResponse_ != null) {
                    this.bitField0_ |= 2;
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

            public Builder setIopMessageRequest(IopMessageRequest.Builder builder) {
                SingleFieldBuilderV3<IopMessageRequest, IopMessageRequest.Builder, IopMessageRequestOrBuilder> singleFieldBuilderV3 = this.iopMessageRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.iopMessageRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setIopMessageResponse(IopMessageResponse.Builder builder) {
                SingleFieldBuilderV3<IopMessageResponse, IopMessageResponse.Builder, IopMessageResponseOrBuilder> singleFieldBuilderV3 = this.iopMessageResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.iopMessageResponse_ = builder.build();
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

            public Builder setIopMessageRequest(IopMessageRequest iopMessageRequest) {
                SingleFieldBuilderV3<IopMessageRequest, IopMessageRequest.Builder, IopMessageRequestOrBuilder> singleFieldBuilderV3 = this.iopMessageRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    iopMessageRequest.getClass();
                    this.iopMessageRequest_ = iopMessageRequest;
                } else {
                    singleFieldBuilderV3.setMessage(iopMessageRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setIopMessageResponse(IopMessageResponse iopMessageResponse) {
                SingleFieldBuilderV3<IopMessageResponse, IopMessageResponse.Builder, IopMessageResponseOrBuilder> singleFieldBuilderV3 = this.iopMessageResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    iopMessageResponse.getClass();
                    this.iopMessageResponse_ = iopMessageResponse;
                } else {
                    singleFieldBuilderV3.setMessage(iopMessageResponse);
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
                if (service.hasIopMessageRequest()) {
                    mergeIopMessageRequest(service.getIopMessageRequest());
                }
                if (service.hasIopMessageResponse()) {
                    mergeIopMessageResponse(service.getIopMessageResponse());
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
