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
public final class GDIInstantInput {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0015GDIInstantInput.proto\u0012\u0016GDI.Proto.InstantInput\"\u008d\u0004\n\u0013InstantInputService\u0012B\n\rinput_content\u0018\u0001 \u0001(\u000b2+.GDI.Proto.InstantInput.InstantInputMessage\u0012G\n\rstart_request\u0018\u0002 \u0001(\u000b20.GDI.Proto.InstantInput.InstantInputStartRequest\u0012I\n\u000estart_response\u0018\u0003 \u0001(\u000b21.GDI.Proto.InstantInput.InstantInputStartResponse\u0012C\n\u000bend_request\u0018\u0004 \u0001(\u000b2..GDI.Proto.InstantInput.InstantInputEndRequest\u0012E\n\fend_response\u0018\u0005 \u0001(\u000b2/.GDI.Proto.InstantInput.InstantInputEndResponse\u0012K\n\u000frestart_request\u0018\u0006 \u0001(\u000b22.GDI.Proto.InstantInput.InstantInputRestartRequest\u0012E\n\fsync_request\u0018\u0007 \u0001(\u000b2/.GDI.Proto.InstantInput.InstantInputSyncRequest\"<\n\u0013InstantInputMessage\u0012\u000f\n\u0007content\u0018\u0001 \u0001(\t\u0012\u0014\n\fcontent_size\u0018\u0002 \u0001(\r\"å\u0001\n\u0018InstantInputStartRequest\u0012\u0011\n\tcode_page\u0018\u0001 \u0001(\r\u0012\u0010\n\bmax_size\u0018\u0002 \u0001(\r\u0012\u000f\n\u0007content\u0018\u0003 \u0001(\t\u0012\u0014\n\fcontent_size\u0018\u0004 \u0001(\r\u0012I\n\u0007command\u0018\u0005 \u0001(\u000e28.GDI.Proto.InstantInput.InstantInputStartRequest.Command\"2\n\u0007Command\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\n\n\u0006RENAME\u0010\u0001\u0012\u000e\n\nPOI_SEARCH\u0010\u0002\"\u001c\n\u001aInstantInputRestartRequest\"\u0019\n\u0017InstantInputSyncRequest\"R\n\u0019InstantInputStartResponse\u00125\n\u0006result\u0018\u0001 \u0001(\u000e2%.GDI.Proto.InstantInput.CommandResult\"\u0092\u0001\n\u0016InstantInputEndRequest\u0012G\n\u0007command\u0018\u0001 \u0001(\u000e26.GDI.Proto.InstantInput.InstantInputEndRequest.Command\"/\n\u0007Command\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\n\n\u0006CANCEL\u0010\u0001\u0012\u000b\n\u0007CONFIRM\u0010\u0002\"P\n\u0017InstantInputEndResponse\u00125\n\u0006result\u0018\u0001 \u0001(\u000e2%.GDI.Proto.InstantInput.CommandResult*6\n\rCommandResult\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u000b\n\u0007SUCCESS\u0010\u0001\u0012\u000b\n\u0007FAILURE\u0010\u0002B/\n\u001acom.garmin.proto.generatedB\u000fGDIInstantInputH\u0003"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InstantInput_InstantInputEndRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InstantInput_InstantInputEndRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InstantInput_InstantInputEndResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InstantInput_InstantInputEndResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InstantInput_InstantInputMessage_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InstantInput_InstantInputMessage_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InstantInput_InstantInputRestartRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InstantInput_InstantInputRestartRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InstantInput_InstantInputService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InstantInput_InstantInputService_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InstantInput_InstantInputStartRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InstantInput_InstantInputStartRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InstantInput_InstantInputStartResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InstantInput_InstantInputStartResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_InstantInput_InstantInputSyncRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_InstantInput_InstantInputSyncRequest_fieldAccessorTable;

    public interface InstantInputEndRequestOrBuilder extends MessageOrBuilder {
        InstantInputEndRequest.Command getCommand();

        boolean hasCommand();
    }

    public interface InstantInputEndResponseOrBuilder extends MessageOrBuilder {
        CommandResult getResult();

        boolean hasResult();
    }

    public interface InstantInputMessageOrBuilder extends MessageOrBuilder {
        String getContent();

        ByteString getContentBytes();

        int getContentSize();

        boolean hasContent();

        boolean hasContentSize();
    }

    public interface InstantInputRestartRequestOrBuilder extends MessageOrBuilder {
    }

    public interface InstantInputServiceOrBuilder extends MessageOrBuilder {
        InstantInputEndRequest getEndRequest();

        InstantInputEndRequestOrBuilder getEndRequestOrBuilder();

        InstantInputEndResponse getEndResponse();

        InstantInputEndResponseOrBuilder getEndResponseOrBuilder();

        InstantInputMessage getInputContent();

        InstantInputMessageOrBuilder getInputContentOrBuilder();

        InstantInputRestartRequest getRestartRequest();

        InstantInputRestartRequestOrBuilder getRestartRequestOrBuilder();

        InstantInputStartRequest getStartRequest();

        InstantInputStartRequestOrBuilder getStartRequestOrBuilder();

        InstantInputStartResponse getStartResponse();

        InstantInputStartResponseOrBuilder getStartResponseOrBuilder();

        InstantInputSyncRequest getSyncRequest();

        InstantInputSyncRequestOrBuilder getSyncRequestOrBuilder();

        boolean hasEndRequest();

        boolean hasEndResponse();

        boolean hasInputContent();

        boolean hasRestartRequest();

        boolean hasStartRequest();

        boolean hasStartResponse();

        boolean hasSyncRequest();
    }

    public interface InstantInputStartRequestOrBuilder extends MessageOrBuilder {
        int getCodePage();

        InstantInputStartRequest.Command getCommand();

        String getContent();

        ByteString getContentBytes();

        int getContentSize();

        int getMaxSize();

        boolean hasCodePage();

        boolean hasCommand();

        boolean hasContent();

        boolean hasContentSize();

        boolean hasMaxSize();
    }

    public interface InstantInputStartResponseOrBuilder extends MessageOrBuilder {
        CommandResult getResult();

        boolean hasResult();
    }

    public interface InstantInputSyncRequestOrBuilder extends MessageOrBuilder {
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_InstantInput_InstantInputService_descriptor = descriptor2;
        internal_static_GDI_Proto_InstantInput_InstantInputService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"InputContent", "StartRequest", "StartResponse", "EndRequest", "EndResponse", "RestartRequest", "SyncRequest"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_InstantInput_InstantInputMessage_descriptor = descriptor3;
        internal_static_GDI_Proto_InstantInput_InstantInputMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Content", "ContentSize"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_InstantInput_InstantInputStartRequest_descriptor = descriptor4;
        internal_static_GDI_Proto_InstantInput_InstantInputStartRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"CodePage", "MaxSize", "Content", "ContentSize", "Command"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_InstantInput_InstantInputRestartRequest_descriptor = descriptor5;
        internal_static_GDI_Proto_InstantInput_InstantInputRestartRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[0]);
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_InstantInput_InstantInputSyncRequest_descriptor = descriptor6;
        internal_static_GDI_Proto_InstantInput_InstantInputSyncRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[0]);
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_InstantInput_InstantInputStartResponse_descriptor = descriptor7;
        internal_static_GDI_Proto_InstantInput_InstantInputStartResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Result"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_InstantInput_InstantInputEndRequest_descriptor = descriptor8;
        internal_static_GDI_Proto_InstantInput_InstantInputEndRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Command"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_InstantInput_InstantInputEndResponse_descriptor = descriptor9;
        internal_static_GDI_Proto_InstantInput_InstantInputEndResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Result"});
    }

    private GDIInstantInput() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class InstantInputRestartRequest extends GeneratedMessageV3 implements InstantInputRestartRequestOrBuilder {
        private static final InstantInputRestartRequest DEFAULT_INSTANCE = new InstantInputRestartRequest();

        @Deprecated
        public static final Parser<InstantInputRestartRequest> PARSER = new AbstractParser<InstantInputRestartRequest>() { // from class: com.garmin.proto.generated.GDIInstantInput.InstantInputRestartRequest.1
            @Override // com.google.protobuf.Parser
            public InstantInputRestartRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = InstantInputRestartRequest.newBuilder();
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

        private InstantInputRestartRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static InstantInputRestartRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputRestartRequest_descriptor;
        }

        public static Builder newBuilder(InstantInputRestartRequest instantInputRestartRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(instantInputRestartRequest);
        }

        public static InstantInputRestartRequest parseDelimitedFrom(InputStream inputStream) {
            return (InstantInputRestartRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static InstantInputRestartRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<InstantInputRestartRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof InstantInputRestartRequest) {
                return getUnknownFields().equals(((InstantInputRestartRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<InstantInputRestartRequest> getParserForType() {
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
            return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputRestartRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(InstantInputRestartRequest.class, Builder.class);
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
            return new InstantInputRestartRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements InstantInputRestartRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputRestartRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InstantInputRestartRequest build() {
                InstantInputRestartRequest instantInputRestartRequestBuildPartial = buildPartial();
                if (instantInputRestartRequestBuildPartial.isInitialized()) {
                    return instantInputRestartRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) instantInputRestartRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InstantInputRestartRequest buildPartial() {
                InstantInputRestartRequest instantInputRestartRequest = new InstantInputRestartRequest(this);
                onBuilt();
                return instantInputRestartRequest;
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
                return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputRestartRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputRestartRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(InstantInputRestartRequest.class, Builder.class);
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
            public InstantInputRestartRequest getDefaultInstanceForType() {
                return InstantInputRestartRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof InstantInputRestartRequest) {
                    return mergeFrom((InstantInputRestartRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(InstantInputRestartRequest instantInputRestartRequest) {
                if (instantInputRestartRequest == InstantInputRestartRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(instantInputRestartRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public InstantInputRestartRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ InstantInputRestartRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private InstantInputRestartRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static InstantInputRestartRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InstantInputRestartRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InstantInputRestartRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static InstantInputRestartRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static InstantInputRestartRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static InstantInputRestartRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static InstantInputRestartRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static InstantInputRestartRequest parseFrom(InputStream inputStream) {
            return (InstantInputRestartRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static InstantInputRestartRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InstantInputRestartRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InstantInputRestartRequest parseFrom(CodedInputStream codedInputStream) {
            return (InstantInputRestartRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static InstantInputRestartRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InstantInputRestartRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class InstantInputSyncRequest extends GeneratedMessageV3 implements InstantInputSyncRequestOrBuilder {
        private static final InstantInputSyncRequest DEFAULT_INSTANCE = new InstantInputSyncRequest();

        @Deprecated
        public static final Parser<InstantInputSyncRequest> PARSER = new AbstractParser<InstantInputSyncRequest>() { // from class: com.garmin.proto.generated.GDIInstantInput.InstantInputSyncRequest.1
            @Override // com.google.protobuf.Parser
            public InstantInputSyncRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = InstantInputSyncRequest.newBuilder();
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

        private InstantInputSyncRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static InstantInputSyncRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputSyncRequest_descriptor;
        }

        public static Builder newBuilder(InstantInputSyncRequest instantInputSyncRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(instantInputSyncRequest);
        }

        public static InstantInputSyncRequest parseDelimitedFrom(InputStream inputStream) {
            return (InstantInputSyncRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static InstantInputSyncRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<InstantInputSyncRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof InstantInputSyncRequest) {
                return getUnknownFields().equals(((InstantInputSyncRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<InstantInputSyncRequest> getParserForType() {
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
            return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputSyncRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(InstantInputSyncRequest.class, Builder.class);
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
            return new InstantInputSyncRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements InstantInputSyncRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputSyncRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InstantInputSyncRequest build() {
                InstantInputSyncRequest instantInputSyncRequestBuildPartial = buildPartial();
                if (instantInputSyncRequestBuildPartial.isInitialized()) {
                    return instantInputSyncRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) instantInputSyncRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InstantInputSyncRequest buildPartial() {
                InstantInputSyncRequest instantInputSyncRequest = new InstantInputSyncRequest(this);
                onBuilt();
                return instantInputSyncRequest;
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
                return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputSyncRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputSyncRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(InstantInputSyncRequest.class, Builder.class);
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
            public InstantInputSyncRequest getDefaultInstanceForType() {
                return InstantInputSyncRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof InstantInputSyncRequest) {
                    return mergeFrom((InstantInputSyncRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(InstantInputSyncRequest instantInputSyncRequest) {
                if (instantInputSyncRequest == InstantInputSyncRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(instantInputSyncRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public InstantInputSyncRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ InstantInputSyncRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private InstantInputSyncRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static InstantInputSyncRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InstantInputSyncRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InstantInputSyncRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static InstantInputSyncRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static InstantInputSyncRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static InstantInputSyncRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static InstantInputSyncRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static InstantInputSyncRequest parseFrom(InputStream inputStream) {
            return (InstantInputSyncRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static InstantInputSyncRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InstantInputSyncRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InstantInputSyncRequest parseFrom(CodedInputStream codedInputStream) {
            return (InstantInputSyncRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static InstantInputSyncRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InstantInputSyncRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class InstantInputEndRequest extends GeneratedMessageV3 implements InstantInputEndRequestOrBuilder {
        public static final int COMMAND_FIELD_NUMBER = 1;
        private static final InstantInputEndRequest DEFAULT_INSTANCE = new InstantInputEndRequest();

        @Deprecated
        public static final Parser<InstantInputEndRequest> PARSER = new AbstractParser<InstantInputEndRequest>() { // from class: com.garmin.proto.generated.GDIInstantInput.InstantInputEndRequest.1
            @Override // com.google.protobuf.Parser
            public InstantInputEndRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = InstantInputEndRequest.newBuilder();
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
        private int command_;
        private byte memoizedIsInitialized;

        private InstantInputEndRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.command_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static InstantInputEndRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputEndRequest_descriptor;
        }

        public static Builder newBuilder(InstantInputEndRequest instantInputEndRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(instantInputEndRequest);
        }

        public static InstantInputEndRequest parseDelimitedFrom(InputStream inputStream) {
            return (InstantInputEndRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static InstantInputEndRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<InstantInputEndRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InstantInputEndRequest)) {
                return super.equals(obj);
            }
            InstantInputEndRequest instantInputEndRequest = (InstantInputEndRequest) obj;
            if (hasCommand() != instantInputEndRequest.hasCommand()) {
                return false;
            }
            return (!hasCommand() || this.command_ == instantInputEndRequest.command_) && getUnknownFields().equals(instantInputEndRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputEndRequestOrBuilder
        public Command getCommand() {
            Command commandForNumber = Command.forNumber(this.command_);
            return commandForNumber == null ? Command.UNKNOWN : commandForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<InstantInputEndRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.command_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputEndRequestOrBuilder
        public boolean hasCommand() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCommand()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.command_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputEndRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(InstantInputEndRequest.class, Builder.class);
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
            return new InstantInputEndRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.command_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements InstantInputEndRequestOrBuilder {
            private int bitField0_;
            private int command_;

            private Builder() {
                this.command_ = 0;
            }

            private void buildPartial0(InstantInputEndRequest instantInputEndRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    instantInputEndRequest.command_ = this.command_;
                } else {
                    i14 = 0;
                }
                instantInputEndRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputEndRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InstantInputEndRequest build() {
                InstantInputEndRequest instantInputEndRequestBuildPartial = buildPartial();
                if (instantInputEndRequestBuildPartial.isInitialized()) {
                    return instantInputEndRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) instantInputEndRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InstantInputEndRequest buildPartial() {
                InstantInputEndRequest instantInputEndRequest = new InstantInputEndRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(instantInputEndRequest);
                }
                onBuilt();
                return instantInputEndRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.command_ = 0;
                return this;
            }

            public Builder clearCommand() {
                this.bitField0_ &= -2;
                this.command_ = 0;
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

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputEndRequestOrBuilder
            public Command getCommand() {
                Command commandForNumber = Command.forNumber(this.command_);
                return commandForNumber == null ? Command.UNKNOWN : commandForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputEndRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputEndRequestOrBuilder
            public boolean hasCommand() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputEndRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(InstantInputEndRequest.class, Builder.class);
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
                                    if (Command.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.command_ = i14;
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

            public Builder setCommand(Command command) {
                command.getClass();
                this.bitField0_ |= 1;
                this.command_ = command.getNumber();
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
            public InstantInputEndRequest getDefaultInstanceForType() {
                return InstantInputEndRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.command_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof InstantInputEndRequest) {
                    return mergeFrom((InstantInputEndRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(InstantInputEndRequest instantInputEndRequest) {
                if (instantInputEndRequest == InstantInputEndRequest.getDefaultInstance()) {
                    return this;
                }
                if (instantInputEndRequest.hasCommand()) {
                    setCommand(instantInputEndRequest.getCommand());
                }
                mergeUnknownFields(instantInputEndRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public InstantInputEndRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static InstantInputEndRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InstantInputEndRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InstantInputEndRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ InstantInputEndRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static InstantInputEndRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private InstantInputEndRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.command_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static InstantInputEndRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static InstantInputEndRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static InstantInputEndRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static InstantInputEndRequest parseFrom(InputStream inputStream) {
            return (InstantInputEndRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static InstantInputEndRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InstantInputEndRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InstantInputEndRequest parseFrom(CodedInputStream codedInputStream) {
            return (InstantInputEndRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static InstantInputEndRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InstantInputEndRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Command implements ProtocolMessageEnum {
            UNKNOWN(0),
            CANCEL(1),
            CONFIRM(2);

            public static final int CANCEL_VALUE = 1;
            public static final int CONFIRM_VALUE = 2;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Command> internalValueMap = new Internal.EnumLiteMap<Command>() { // from class: com.garmin.proto.generated.GDIInstantInput.InstantInputEndRequest.Command.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Command findValueByNumber(int i14) {
                    return Command.forNumber(i14);
                }
            };
            private static final Command[] VALUES = values();

            Command(int i14) {
                this.value = i14;
            }

            public static Command forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN;
                }
                if (i14 == 1) {
                    return CANCEL;
                }
                if (i14 != 2) {
                    return null;
                }
                return CONFIRM;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return InstantInputEndRequest.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Command> internalGetValueMap() {
                return internalValueMap;
            }

            public static Command valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Command valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class InstantInputEndResponse extends GeneratedMessageV3 implements InstantInputEndResponseOrBuilder {
        private static final InstantInputEndResponse DEFAULT_INSTANCE = new InstantInputEndResponse();

        @Deprecated
        public static final Parser<InstantInputEndResponse> PARSER = new AbstractParser<InstantInputEndResponse>() { // from class: com.garmin.proto.generated.GDIInstantInput.InstantInputEndResponse.1
            @Override // com.google.protobuf.Parser
            public InstantInputEndResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = InstantInputEndResponse.newBuilder();
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
        public static final int RESULT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int result_;

        private InstantInputEndResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.result_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static InstantInputEndResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputEndResponse_descriptor;
        }

        public static Builder newBuilder(InstantInputEndResponse instantInputEndResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(instantInputEndResponse);
        }

        public static InstantInputEndResponse parseDelimitedFrom(InputStream inputStream) {
            return (InstantInputEndResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static InstantInputEndResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<InstantInputEndResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InstantInputEndResponse)) {
                return super.equals(obj);
            }
            InstantInputEndResponse instantInputEndResponse = (InstantInputEndResponse) obj;
            if (hasResult() != instantInputEndResponse.hasResult()) {
                return false;
            }
            return (!hasResult() || this.result_ == instantInputEndResponse.result_) && getUnknownFields().equals(instantInputEndResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<InstantInputEndResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputEndResponseOrBuilder
        public CommandResult getResult() {
            CommandResult commandResultForNumber = CommandResult.forNumber(this.result_);
            return commandResultForNumber == null ? CommandResult.UNKNOWN : commandResultForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.result_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputEndResponseOrBuilder
        public boolean hasResult() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasResult()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.result_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputEndResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(InstantInputEndResponse.class, Builder.class);
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
            return new InstantInputEndResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.result_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements InstantInputEndResponseOrBuilder {
            private int bitField0_;
            private int result_;

            private Builder() {
                this.result_ = 0;
            }

            private void buildPartial0(InstantInputEndResponse instantInputEndResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    instantInputEndResponse.result_ = this.result_;
                } else {
                    i14 = 0;
                }
                instantInputEndResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputEndResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InstantInputEndResponse build() {
                InstantInputEndResponse instantInputEndResponseBuildPartial = buildPartial();
                if (instantInputEndResponseBuildPartial.isInitialized()) {
                    return instantInputEndResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) instantInputEndResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InstantInputEndResponse buildPartial() {
                InstantInputEndResponse instantInputEndResponse = new InstantInputEndResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(instantInputEndResponse);
                }
                onBuilt();
                return instantInputEndResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.result_ = 0;
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

            public Builder clearResult() {
                this.bitField0_ &= -2;
                this.result_ = 0;
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
                return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputEndResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputEndResponseOrBuilder
            public CommandResult getResult() {
                CommandResult commandResultForNumber = CommandResult.forNumber(this.result_);
                return commandResultForNumber == null ? CommandResult.UNKNOWN : commandResultForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputEndResponseOrBuilder
            public boolean hasResult() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputEndResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(InstantInputEndResponse.class, Builder.class);
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
                                    if (CommandResult.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.result_ = i14;
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

            public Builder setResult(CommandResult commandResult) {
                commandResult.getClass();
                this.bitField0_ |= 1;
                this.result_ = commandResult.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public InstantInputEndResponse getDefaultInstanceForType() {
                return InstantInputEndResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.result_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof InstantInputEndResponse) {
                    return mergeFrom((InstantInputEndResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(InstantInputEndResponse instantInputEndResponse) {
                if (instantInputEndResponse == InstantInputEndResponse.getDefaultInstance()) {
                    return this;
                }
                if (instantInputEndResponse.hasResult()) {
                    setResult(instantInputEndResponse.getResult());
                }
                mergeUnknownFields(instantInputEndResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public InstantInputEndResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static InstantInputEndResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InstantInputEndResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InstantInputEndResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ InstantInputEndResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static InstantInputEndResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private InstantInputEndResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.result_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static InstantInputEndResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static InstantInputEndResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static InstantInputEndResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static InstantInputEndResponse parseFrom(InputStream inputStream) {
            return (InstantInputEndResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static InstantInputEndResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InstantInputEndResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InstantInputEndResponse parseFrom(CodedInputStream codedInputStream) {
            return (InstantInputEndResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static InstantInputEndResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InstantInputEndResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class InstantInputMessage extends GeneratedMessageV3 implements InstantInputMessageOrBuilder {
        public static final int CONTENT_FIELD_NUMBER = 1;
        public static final int CONTENT_SIZE_FIELD_NUMBER = 2;
        private static final InstantInputMessage DEFAULT_INSTANCE = new InstantInputMessage();

        @Deprecated
        public static final Parser<InstantInputMessage> PARSER = new AbstractParser<InstantInputMessage>() { // from class: com.garmin.proto.generated.GDIInstantInput.InstantInputMessage.1
            @Override // com.google.protobuf.Parser
            public InstantInputMessage parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = InstantInputMessage.newBuilder();
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
        private int contentSize_;
        private volatile Object content_;
        private byte memoizedIsInitialized;

        private InstantInputMessage() {
            this.content_ = "";
            this.contentSize_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.content_ = "";
        }

        public static InstantInputMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputMessage_descriptor;
        }

        public static Builder newBuilder(InstantInputMessage instantInputMessage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(instantInputMessage);
        }

        public static InstantInputMessage parseDelimitedFrom(InputStream inputStream) {
            return (InstantInputMessage) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static InstantInputMessage parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<InstantInputMessage> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InstantInputMessage)) {
                return super.equals(obj);
            }
            InstantInputMessage instantInputMessage = (InstantInputMessage) obj;
            if (hasContent() != instantInputMessage.hasContent()) {
                return false;
            }
            if ((!hasContent() || getContent().equals(instantInputMessage.getContent())) && hasContentSize() == instantInputMessage.hasContentSize()) {
                return (!hasContentSize() || getContentSize() == instantInputMessage.getContentSize()) && getUnknownFields().equals(instantInputMessage.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputMessageOrBuilder
        public String getContent() {
            Object obj = this.content_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.content_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputMessageOrBuilder
        public ByteString getContentBytes() {
            Object obj = this.content_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.content_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputMessageOrBuilder
        public int getContentSize() {
            return this.contentSize_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<InstantInputMessage> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.content_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(2, this.contentSize_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputMessageOrBuilder
        public boolean hasContent() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputMessageOrBuilder
        public boolean hasContentSize() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasContent()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getContent().hashCode();
            }
            if (hasContentSize()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getContentSize();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(InstantInputMessage.class, Builder.class);
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
            return new InstantInputMessage();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.content_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.contentSize_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements InstantInputMessageOrBuilder {
            private int bitField0_;
            private int contentSize_;
            private Object content_;

            private Builder() {
                this.content_ = "";
            }

            private void buildPartial0(InstantInputMessage instantInputMessage) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    instantInputMessage.content_ = this.content_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    instantInputMessage.contentSize_ = this.contentSize_;
                    i14 |= 2;
                }
                instantInputMessage.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputMessage_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InstantInputMessage build() {
                InstantInputMessage instantInputMessageBuildPartial = buildPartial();
                if (instantInputMessageBuildPartial.isInitialized()) {
                    return instantInputMessageBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) instantInputMessageBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InstantInputMessage buildPartial() {
                InstantInputMessage instantInputMessage = new InstantInputMessage(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(instantInputMessage);
                }
                onBuilt();
                return instantInputMessage;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.content_ = "";
                this.contentSize_ = 0;
                return this;
            }

            public Builder clearContent() {
                this.content_ = InstantInputMessage.getDefaultInstance().getContent();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearContentSize() {
                this.bitField0_ &= -3;
                this.contentSize_ = 0;
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

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputMessageOrBuilder
            public String getContent() {
                Object obj = this.content_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.content_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputMessageOrBuilder
            public ByteString getContentBytes() {
                Object obj = this.content_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.content_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputMessageOrBuilder
            public int getContentSize() {
                return this.contentSize_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputMessage_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputMessageOrBuilder
            public boolean hasContent() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputMessageOrBuilder
            public boolean hasContentSize() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(InstantInputMessage.class, Builder.class);
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
                                    this.content_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.contentSize_ = codedInputStream.readUInt32();
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

            public Builder setContent(String str) {
                str.getClass();
                this.content_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setContentBytes(ByteString byteString) {
                byteString.getClass();
                this.content_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setContentSize(int i14) {
                this.contentSize_ = i14;
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
            public InstantInputMessage getDefaultInstanceForType() {
                return InstantInputMessage.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.content_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof InstantInputMessage) {
                    return mergeFrom((InstantInputMessage) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(InstantInputMessage instantInputMessage) {
                if (instantInputMessage == InstantInputMessage.getDefaultInstance()) {
                    return this;
                }
                if (instantInputMessage.hasContent()) {
                    this.content_ = instantInputMessage.content_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (instantInputMessage.hasContentSize()) {
                    setContentSize(instantInputMessage.getContentSize());
                }
                mergeUnknownFields(instantInputMessage.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public InstantInputMessage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static InstantInputMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InstantInputMessage) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InstantInputMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static InstantInputMessage parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static InstantInputMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static InstantInputMessage parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static InstantInputMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static InstantInputMessage parseFrom(InputStream inputStream) {
            return (InstantInputMessage) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private InstantInputMessage(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.content_ = "";
            this.contentSize_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static InstantInputMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InstantInputMessage) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InstantInputMessage parseFrom(CodedInputStream codedInputStream) {
            return (InstantInputMessage) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public /* synthetic */ InstantInputMessage(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static InstantInputMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InstantInputMessage) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class InstantInputService extends GeneratedMessageV3 implements InstantInputServiceOrBuilder {
        public static final int END_REQUEST_FIELD_NUMBER = 4;
        public static final int END_RESPONSE_FIELD_NUMBER = 5;
        public static final int INPUT_CONTENT_FIELD_NUMBER = 1;
        public static final int RESTART_REQUEST_FIELD_NUMBER = 6;
        public static final int START_REQUEST_FIELD_NUMBER = 2;
        public static final int START_RESPONSE_FIELD_NUMBER = 3;
        public static final int SYNC_REQUEST_FIELD_NUMBER = 7;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private InstantInputEndRequest endRequest_;
        private InstantInputEndResponse endResponse_;
        private InstantInputMessage inputContent_;
        private byte memoizedIsInitialized;
        private InstantInputRestartRequest restartRequest_;
        private InstantInputStartRequest startRequest_;
        private InstantInputStartResponse startResponse_;
        private InstantInputSyncRequest syncRequest_;
        private static final InstantInputService DEFAULT_INSTANCE = new InstantInputService();

        @Deprecated
        public static final Parser<InstantInputService> PARSER = new AbstractParser<InstantInputService>() { // from class: com.garmin.proto.generated.GDIInstantInput.InstantInputService.1
            @Override // com.google.protobuf.Parser
            public InstantInputService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = InstantInputService.newBuilder();
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

        private InstantInputService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static InstantInputService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputService_descriptor;
        }

        public static Builder newBuilder(InstantInputService instantInputService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(instantInputService);
        }

        public static InstantInputService parseDelimitedFrom(InputStream inputStream) {
            return (InstantInputService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static InstantInputService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<InstantInputService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InstantInputService)) {
                return super.equals(obj);
            }
            InstantInputService instantInputService = (InstantInputService) obj;
            if (hasInputContent() != instantInputService.hasInputContent()) {
                return false;
            }
            if ((hasInputContent() && !getInputContent().equals(instantInputService.getInputContent())) || hasStartRequest() != instantInputService.hasStartRequest()) {
                return false;
            }
            if ((hasStartRequest() && !getStartRequest().equals(instantInputService.getStartRequest())) || hasStartResponse() != instantInputService.hasStartResponse()) {
                return false;
            }
            if ((hasStartResponse() && !getStartResponse().equals(instantInputService.getStartResponse())) || hasEndRequest() != instantInputService.hasEndRequest()) {
                return false;
            }
            if ((hasEndRequest() && !getEndRequest().equals(instantInputService.getEndRequest())) || hasEndResponse() != instantInputService.hasEndResponse()) {
                return false;
            }
            if ((hasEndResponse() && !getEndResponse().equals(instantInputService.getEndResponse())) || hasRestartRequest() != instantInputService.hasRestartRequest()) {
                return false;
            }
            if ((!hasRestartRequest() || getRestartRequest().equals(instantInputService.getRestartRequest())) && hasSyncRequest() == instantInputService.hasSyncRequest()) {
                return (!hasSyncRequest() || getSyncRequest().equals(instantInputService.getSyncRequest())) && getUnknownFields().equals(instantInputService.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
        public InstantInputEndRequest getEndRequest() {
            InstantInputEndRequest instantInputEndRequest = this.endRequest_;
            return instantInputEndRequest == null ? InstantInputEndRequest.getDefaultInstance() : instantInputEndRequest;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
        public InstantInputEndRequestOrBuilder getEndRequestOrBuilder() {
            InstantInputEndRequest instantInputEndRequest = this.endRequest_;
            return instantInputEndRequest == null ? InstantInputEndRequest.getDefaultInstance() : instantInputEndRequest;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
        public InstantInputEndResponse getEndResponse() {
            InstantInputEndResponse instantInputEndResponse = this.endResponse_;
            return instantInputEndResponse == null ? InstantInputEndResponse.getDefaultInstance() : instantInputEndResponse;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
        public InstantInputEndResponseOrBuilder getEndResponseOrBuilder() {
            InstantInputEndResponse instantInputEndResponse = this.endResponse_;
            return instantInputEndResponse == null ? InstantInputEndResponse.getDefaultInstance() : instantInputEndResponse;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
        public InstantInputMessage getInputContent() {
            InstantInputMessage instantInputMessage = this.inputContent_;
            return instantInputMessage == null ? InstantInputMessage.getDefaultInstance() : instantInputMessage;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
        public InstantInputMessageOrBuilder getInputContentOrBuilder() {
            InstantInputMessage instantInputMessage = this.inputContent_;
            return instantInputMessage == null ? InstantInputMessage.getDefaultInstance() : instantInputMessage;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<InstantInputService> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
        public InstantInputRestartRequest getRestartRequest() {
            InstantInputRestartRequest instantInputRestartRequest = this.restartRequest_;
            return instantInputRestartRequest == null ? InstantInputRestartRequest.getDefaultInstance() : instantInputRestartRequest;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
        public InstantInputRestartRequestOrBuilder getRestartRequestOrBuilder() {
            InstantInputRestartRequest instantInputRestartRequest = this.restartRequest_;
            return instantInputRestartRequest == null ? InstantInputRestartRequest.getDefaultInstance() : instantInputRestartRequest;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getInputContent()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getStartRequest());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getStartResponse());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getEndRequest());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getEndResponse());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getRestartRequest());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getSyncRequest());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
        public InstantInputStartRequest getStartRequest() {
            InstantInputStartRequest instantInputStartRequest = this.startRequest_;
            return instantInputStartRequest == null ? InstantInputStartRequest.getDefaultInstance() : instantInputStartRequest;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
        public InstantInputStartRequestOrBuilder getStartRequestOrBuilder() {
            InstantInputStartRequest instantInputStartRequest = this.startRequest_;
            return instantInputStartRequest == null ? InstantInputStartRequest.getDefaultInstance() : instantInputStartRequest;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
        public InstantInputStartResponse getStartResponse() {
            InstantInputStartResponse instantInputStartResponse = this.startResponse_;
            return instantInputStartResponse == null ? InstantInputStartResponse.getDefaultInstance() : instantInputStartResponse;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
        public InstantInputStartResponseOrBuilder getStartResponseOrBuilder() {
            InstantInputStartResponse instantInputStartResponse = this.startResponse_;
            return instantInputStartResponse == null ? InstantInputStartResponse.getDefaultInstance() : instantInputStartResponse;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
        public InstantInputSyncRequest getSyncRequest() {
            InstantInputSyncRequest instantInputSyncRequest = this.syncRequest_;
            return instantInputSyncRequest == null ? InstantInputSyncRequest.getDefaultInstance() : instantInputSyncRequest;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
        public InstantInputSyncRequestOrBuilder getSyncRequestOrBuilder() {
            InstantInputSyncRequest instantInputSyncRequest = this.syncRequest_;
            return instantInputSyncRequest == null ? InstantInputSyncRequest.getDefaultInstance() : instantInputSyncRequest;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
        public boolean hasEndRequest() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
        public boolean hasEndResponse() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
        public boolean hasInputContent() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
        public boolean hasRestartRequest() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
        public boolean hasStartRequest() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
        public boolean hasStartResponse() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
        public boolean hasSyncRequest() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasInputContent()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getInputContent().hashCode();
            }
            if (hasStartRequest()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getStartRequest().hashCode();
            }
            if (hasStartResponse()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getStartResponse().hashCode();
            }
            if (hasEndRequest()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getEndRequest().hashCode();
            }
            if (hasEndResponse()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getEndResponse().hashCode();
            }
            if (hasRestartRequest()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getRestartRequest().hashCode();
            }
            if (hasSyncRequest()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getSyncRequest().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputService_fieldAccessorTable.ensureFieldAccessorsInitialized(InstantInputService.class, Builder.class);
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
            return new InstantInputService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getInputContent());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getStartRequest());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getStartResponse());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getEndRequest());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getEndResponse());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getRestartRequest());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getSyncRequest());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements InstantInputServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<InstantInputEndRequest, InstantInputEndRequest.Builder, InstantInputEndRequestOrBuilder> endRequestBuilder_;
            private InstantInputEndRequest endRequest_;
            private SingleFieldBuilderV3<InstantInputEndResponse, InstantInputEndResponse.Builder, InstantInputEndResponseOrBuilder> endResponseBuilder_;
            private InstantInputEndResponse endResponse_;
            private SingleFieldBuilderV3<InstantInputMessage, InstantInputMessage.Builder, InstantInputMessageOrBuilder> inputContentBuilder_;
            private InstantInputMessage inputContent_;
            private SingleFieldBuilderV3<InstantInputRestartRequest, InstantInputRestartRequest.Builder, InstantInputRestartRequestOrBuilder> restartRequestBuilder_;
            private InstantInputRestartRequest restartRequest_;
            private SingleFieldBuilderV3<InstantInputStartRequest, InstantInputStartRequest.Builder, InstantInputStartRequestOrBuilder> startRequestBuilder_;
            private InstantInputStartRequest startRequest_;
            private SingleFieldBuilderV3<InstantInputStartResponse, InstantInputStartResponse.Builder, InstantInputStartResponseOrBuilder> startResponseBuilder_;
            private InstantInputStartResponse startResponse_;
            private SingleFieldBuilderV3<InstantInputSyncRequest, InstantInputSyncRequest.Builder, InstantInputSyncRequestOrBuilder> syncRequestBuilder_;
            private InstantInputSyncRequest syncRequest_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(InstantInputService instantInputService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<InstantInputMessage, InstantInputMessage.Builder, InstantInputMessageOrBuilder> singleFieldBuilderV3 = this.inputContentBuilder_;
                    instantInputService.inputContent_ = singleFieldBuilderV3 == null ? this.inputContent_ : (InstantInputMessage) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<InstantInputStartRequest, InstantInputStartRequest.Builder, InstantInputStartRequestOrBuilder> singleFieldBuilderV4 = this.startRequestBuilder_;
                    instantInputService.startRequest_ = singleFieldBuilderV4 == null ? this.startRequest_ : (InstantInputStartRequest) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<InstantInputStartResponse, InstantInputStartResponse.Builder, InstantInputStartResponseOrBuilder> singleFieldBuilderV5 = this.startResponseBuilder_;
                    instantInputService.startResponse_ = singleFieldBuilderV5 == null ? this.startResponse_ : (InstantInputStartResponse) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<InstantInputEndRequest, InstantInputEndRequest.Builder, InstantInputEndRequestOrBuilder> singleFieldBuilderV6 = this.endRequestBuilder_;
                    instantInputService.endRequest_ = singleFieldBuilderV6 == null ? this.endRequest_ : (InstantInputEndRequest) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<InstantInputEndResponse, InstantInputEndResponse.Builder, InstantInputEndResponseOrBuilder> singleFieldBuilderV7 = this.endResponseBuilder_;
                    instantInputService.endResponse_ = singleFieldBuilderV7 == null ? this.endResponse_ : (InstantInputEndResponse) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<InstantInputRestartRequest, InstantInputRestartRequest.Builder, InstantInputRestartRequestOrBuilder> singleFieldBuilderV8 = this.restartRequestBuilder_;
                    instantInputService.restartRequest_ = singleFieldBuilderV8 == null ? this.restartRequest_ : (InstantInputRestartRequest) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<InstantInputSyncRequest, InstantInputSyncRequest.Builder, InstantInputSyncRequestOrBuilder> singleFieldBuilderV9 = this.syncRequestBuilder_;
                    instantInputService.syncRequest_ = singleFieldBuilderV9 == null ? this.syncRequest_ : (InstantInputSyncRequest) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                instantInputService.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputService_descriptor;
            }

            private SingleFieldBuilderV3<InstantInputEndRequest, InstantInputEndRequest.Builder, InstantInputEndRequestOrBuilder> getEndRequestFieldBuilder() {
                if (this.endRequestBuilder_ == null) {
                    this.endRequestBuilder_ = new SingleFieldBuilderV3<>(getEndRequest(), getParentForChildren(), isClean());
                    this.endRequest_ = null;
                }
                return this.endRequestBuilder_;
            }

            private SingleFieldBuilderV3<InstantInputEndResponse, InstantInputEndResponse.Builder, InstantInputEndResponseOrBuilder> getEndResponseFieldBuilder() {
                if (this.endResponseBuilder_ == null) {
                    this.endResponseBuilder_ = new SingleFieldBuilderV3<>(getEndResponse(), getParentForChildren(), isClean());
                    this.endResponse_ = null;
                }
                return this.endResponseBuilder_;
            }

            private SingleFieldBuilderV3<InstantInputMessage, InstantInputMessage.Builder, InstantInputMessageOrBuilder> getInputContentFieldBuilder() {
                if (this.inputContentBuilder_ == null) {
                    this.inputContentBuilder_ = new SingleFieldBuilderV3<>(getInputContent(), getParentForChildren(), isClean());
                    this.inputContent_ = null;
                }
                return this.inputContentBuilder_;
            }

            private SingleFieldBuilderV3<InstantInputRestartRequest, InstantInputRestartRequest.Builder, InstantInputRestartRequestOrBuilder> getRestartRequestFieldBuilder() {
                if (this.restartRequestBuilder_ == null) {
                    this.restartRequestBuilder_ = new SingleFieldBuilderV3<>(getRestartRequest(), getParentForChildren(), isClean());
                    this.restartRequest_ = null;
                }
                return this.restartRequestBuilder_;
            }

            private SingleFieldBuilderV3<InstantInputStartRequest, InstantInputStartRequest.Builder, InstantInputStartRequestOrBuilder> getStartRequestFieldBuilder() {
                if (this.startRequestBuilder_ == null) {
                    this.startRequestBuilder_ = new SingleFieldBuilderV3<>(getStartRequest(), getParentForChildren(), isClean());
                    this.startRequest_ = null;
                }
                return this.startRequestBuilder_;
            }

            private SingleFieldBuilderV3<InstantInputStartResponse, InstantInputStartResponse.Builder, InstantInputStartResponseOrBuilder> getStartResponseFieldBuilder() {
                if (this.startResponseBuilder_ == null) {
                    this.startResponseBuilder_ = new SingleFieldBuilderV3<>(getStartResponse(), getParentForChildren(), isClean());
                    this.startResponse_ = null;
                }
                return this.startResponseBuilder_;
            }

            private SingleFieldBuilderV3<InstantInputSyncRequest, InstantInputSyncRequest.Builder, InstantInputSyncRequestOrBuilder> getSyncRequestFieldBuilder() {
                if (this.syncRequestBuilder_ == null) {
                    this.syncRequestBuilder_ = new SingleFieldBuilderV3<>(getSyncRequest(), getParentForChildren(), isClean());
                    this.syncRequest_ = null;
                }
                return this.syncRequestBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getInputContentFieldBuilder();
                    getStartRequestFieldBuilder();
                    getStartResponseFieldBuilder();
                    getEndRequestFieldBuilder();
                    getEndResponseFieldBuilder();
                    getRestartRequestFieldBuilder();
                    getSyncRequestFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InstantInputService build() {
                InstantInputService instantInputServiceBuildPartial = buildPartial();
                if (instantInputServiceBuildPartial.isInitialized()) {
                    return instantInputServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) instantInputServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InstantInputService buildPartial() {
                InstantInputService instantInputService = new InstantInputService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(instantInputService);
                }
                onBuilt();
                return instantInputService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.inputContent_ = null;
                SingleFieldBuilderV3<InstantInputMessage, InstantInputMessage.Builder, InstantInputMessageOrBuilder> singleFieldBuilderV3 = this.inputContentBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.inputContentBuilder_ = null;
                }
                this.startRequest_ = null;
                SingleFieldBuilderV3<InstantInputStartRequest, InstantInputStartRequest.Builder, InstantInputStartRequestOrBuilder> singleFieldBuilderV4 = this.startRequestBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.startRequestBuilder_ = null;
                }
                this.startResponse_ = null;
                SingleFieldBuilderV3<InstantInputStartResponse, InstantInputStartResponse.Builder, InstantInputStartResponseOrBuilder> singleFieldBuilderV5 = this.startResponseBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.startResponseBuilder_ = null;
                }
                this.endRequest_ = null;
                SingleFieldBuilderV3<InstantInputEndRequest, InstantInputEndRequest.Builder, InstantInputEndRequestOrBuilder> singleFieldBuilderV6 = this.endRequestBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.endRequestBuilder_ = null;
                }
                this.endResponse_ = null;
                SingleFieldBuilderV3<InstantInputEndResponse, InstantInputEndResponse.Builder, InstantInputEndResponseOrBuilder> singleFieldBuilderV7 = this.endResponseBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.endResponseBuilder_ = null;
                }
                this.restartRequest_ = null;
                SingleFieldBuilderV3<InstantInputRestartRequest, InstantInputRestartRequest.Builder, InstantInputRestartRequestOrBuilder> singleFieldBuilderV8 = this.restartRequestBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.restartRequestBuilder_ = null;
                }
                this.syncRequest_ = null;
                SingleFieldBuilderV3<InstantInputSyncRequest, InstantInputSyncRequest.Builder, InstantInputSyncRequestOrBuilder> singleFieldBuilderV9 = this.syncRequestBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.syncRequestBuilder_ = null;
                }
                return this;
            }

            public Builder clearEndRequest() {
                this.bitField0_ &= -9;
                this.endRequest_ = null;
                SingleFieldBuilderV3<InstantInputEndRequest, InstantInputEndRequest.Builder, InstantInputEndRequestOrBuilder> singleFieldBuilderV3 = this.endRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.endRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearEndResponse() {
                this.bitField0_ &= -17;
                this.endResponse_ = null;
                SingleFieldBuilderV3<InstantInputEndResponse, InstantInputEndResponse.Builder, InstantInputEndResponseOrBuilder> singleFieldBuilderV3 = this.endResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.endResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearInputContent() {
                this.bitField0_ &= -2;
                this.inputContent_ = null;
                SingleFieldBuilderV3<InstantInputMessage, InstantInputMessage.Builder, InstantInputMessageOrBuilder> singleFieldBuilderV3 = this.inputContentBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.inputContentBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearRestartRequest() {
                this.bitField0_ &= -33;
                this.restartRequest_ = null;
                SingleFieldBuilderV3<InstantInputRestartRequest, InstantInputRestartRequest.Builder, InstantInputRestartRequestOrBuilder> singleFieldBuilderV3 = this.restartRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.restartRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStartRequest() {
                this.bitField0_ &= -3;
                this.startRequest_ = null;
                SingleFieldBuilderV3<InstantInputStartRequest, InstantInputStartRequest.Builder, InstantInputStartRequestOrBuilder> singleFieldBuilderV3 = this.startRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.startRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStartResponse() {
                this.bitField0_ &= -5;
                this.startResponse_ = null;
                SingleFieldBuilderV3<InstantInputStartResponse, InstantInputStartResponse.Builder, InstantInputStartResponseOrBuilder> singleFieldBuilderV3 = this.startResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.startResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSyncRequest() {
                this.bitField0_ &= -65;
                this.syncRequest_ = null;
                SingleFieldBuilderV3<InstantInputSyncRequest, InstantInputSyncRequest.Builder, InstantInputSyncRequestOrBuilder> singleFieldBuilderV3 = this.syncRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.syncRequestBuilder_ = null;
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
                return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
            public InstantInputEndRequest getEndRequest() {
                SingleFieldBuilderV3<InstantInputEndRequest, InstantInputEndRequest.Builder, InstantInputEndRequestOrBuilder> singleFieldBuilderV3 = this.endRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (InstantInputEndRequest) singleFieldBuilderV3.getMessage();
                }
                InstantInputEndRequest instantInputEndRequest = this.endRequest_;
                return instantInputEndRequest == null ? InstantInputEndRequest.getDefaultInstance() : instantInputEndRequest;
            }

            public InstantInputEndRequest.Builder getEndRequestBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (InstantInputEndRequest.Builder) getEndRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
            public InstantInputEndRequestOrBuilder getEndRequestOrBuilder() {
                SingleFieldBuilderV3<InstantInputEndRequest, InstantInputEndRequest.Builder, InstantInputEndRequestOrBuilder> singleFieldBuilderV3 = this.endRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (InstantInputEndRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                InstantInputEndRequest instantInputEndRequest = this.endRequest_;
                return instantInputEndRequest == null ? InstantInputEndRequest.getDefaultInstance() : instantInputEndRequest;
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
            public InstantInputEndResponse getEndResponse() {
                SingleFieldBuilderV3<InstantInputEndResponse, InstantInputEndResponse.Builder, InstantInputEndResponseOrBuilder> singleFieldBuilderV3 = this.endResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (InstantInputEndResponse) singleFieldBuilderV3.getMessage();
                }
                InstantInputEndResponse instantInputEndResponse = this.endResponse_;
                return instantInputEndResponse == null ? InstantInputEndResponse.getDefaultInstance() : instantInputEndResponse;
            }

            public InstantInputEndResponse.Builder getEndResponseBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (InstantInputEndResponse.Builder) getEndResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
            public InstantInputEndResponseOrBuilder getEndResponseOrBuilder() {
                SingleFieldBuilderV3<InstantInputEndResponse, InstantInputEndResponse.Builder, InstantInputEndResponseOrBuilder> singleFieldBuilderV3 = this.endResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (InstantInputEndResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                InstantInputEndResponse instantInputEndResponse = this.endResponse_;
                return instantInputEndResponse == null ? InstantInputEndResponse.getDefaultInstance() : instantInputEndResponse;
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
            public InstantInputMessage getInputContent() {
                SingleFieldBuilderV3<InstantInputMessage, InstantInputMessage.Builder, InstantInputMessageOrBuilder> singleFieldBuilderV3 = this.inputContentBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (InstantInputMessage) singleFieldBuilderV3.getMessage();
                }
                InstantInputMessage instantInputMessage = this.inputContent_;
                return instantInputMessage == null ? InstantInputMessage.getDefaultInstance() : instantInputMessage;
            }

            public InstantInputMessage.Builder getInputContentBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (InstantInputMessage.Builder) getInputContentFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
            public InstantInputMessageOrBuilder getInputContentOrBuilder() {
                SingleFieldBuilderV3<InstantInputMessage, InstantInputMessage.Builder, InstantInputMessageOrBuilder> singleFieldBuilderV3 = this.inputContentBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (InstantInputMessageOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                InstantInputMessage instantInputMessage = this.inputContent_;
                return instantInputMessage == null ? InstantInputMessage.getDefaultInstance() : instantInputMessage;
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
            public InstantInputRestartRequest getRestartRequest() {
                SingleFieldBuilderV3<InstantInputRestartRequest, InstantInputRestartRequest.Builder, InstantInputRestartRequestOrBuilder> singleFieldBuilderV3 = this.restartRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (InstantInputRestartRequest) singleFieldBuilderV3.getMessage();
                }
                InstantInputRestartRequest instantInputRestartRequest = this.restartRequest_;
                return instantInputRestartRequest == null ? InstantInputRestartRequest.getDefaultInstance() : instantInputRestartRequest;
            }

            public InstantInputRestartRequest.Builder getRestartRequestBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (InstantInputRestartRequest.Builder) getRestartRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
            public InstantInputRestartRequestOrBuilder getRestartRequestOrBuilder() {
                SingleFieldBuilderV3<InstantInputRestartRequest, InstantInputRestartRequest.Builder, InstantInputRestartRequestOrBuilder> singleFieldBuilderV3 = this.restartRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (InstantInputRestartRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                InstantInputRestartRequest instantInputRestartRequest = this.restartRequest_;
                return instantInputRestartRequest == null ? InstantInputRestartRequest.getDefaultInstance() : instantInputRestartRequest;
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
            public InstantInputStartRequest getStartRequest() {
                SingleFieldBuilderV3<InstantInputStartRequest, InstantInputStartRequest.Builder, InstantInputStartRequestOrBuilder> singleFieldBuilderV3 = this.startRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (InstantInputStartRequest) singleFieldBuilderV3.getMessage();
                }
                InstantInputStartRequest instantInputStartRequest = this.startRequest_;
                return instantInputStartRequest == null ? InstantInputStartRequest.getDefaultInstance() : instantInputStartRequest;
            }

            public InstantInputStartRequest.Builder getStartRequestBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (InstantInputStartRequest.Builder) getStartRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
            public InstantInputStartRequestOrBuilder getStartRequestOrBuilder() {
                SingleFieldBuilderV3<InstantInputStartRequest, InstantInputStartRequest.Builder, InstantInputStartRequestOrBuilder> singleFieldBuilderV3 = this.startRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (InstantInputStartRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                InstantInputStartRequest instantInputStartRequest = this.startRequest_;
                return instantInputStartRequest == null ? InstantInputStartRequest.getDefaultInstance() : instantInputStartRequest;
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
            public InstantInputStartResponse getStartResponse() {
                SingleFieldBuilderV3<InstantInputStartResponse, InstantInputStartResponse.Builder, InstantInputStartResponseOrBuilder> singleFieldBuilderV3 = this.startResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (InstantInputStartResponse) singleFieldBuilderV3.getMessage();
                }
                InstantInputStartResponse instantInputStartResponse = this.startResponse_;
                return instantInputStartResponse == null ? InstantInputStartResponse.getDefaultInstance() : instantInputStartResponse;
            }

            public InstantInputStartResponse.Builder getStartResponseBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (InstantInputStartResponse.Builder) getStartResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
            public InstantInputStartResponseOrBuilder getStartResponseOrBuilder() {
                SingleFieldBuilderV3<InstantInputStartResponse, InstantInputStartResponse.Builder, InstantInputStartResponseOrBuilder> singleFieldBuilderV3 = this.startResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (InstantInputStartResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                InstantInputStartResponse instantInputStartResponse = this.startResponse_;
                return instantInputStartResponse == null ? InstantInputStartResponse.getDefaultInstance() : instantInputStartResponse;
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
            public InstantInputSyncRequest getSyncRequest() {
                SingleFieldBuilderV3<InstantInputSyncRequest, InstantInputSyncRequest.Builder, InstantInputSyncRequestOrBuilder> singleFieldBuilderV3 = this.syncRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (InstantInputSyncRequest) singleFieldBuilderV3.getMessage();
                }
                InstantInputSyncRequest instantInputSyncRequest = this.syncRequest_;
                return instantInputSyncRequest == null ? InstantInputSyncRequest.getDefaultInstance() : instantInputSyncRequest;
            }

            public InstantInputSyncRequest.Builder getSyncRequestBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (InstantInputSyncRequest.Builder) getSyncRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
            public InstantInputSyncRequestOrBuilder getSyncRequestOrBuilder() {
                SingleFieldBuilderV3<InstantInputSyncRequest, InstantInputSyncRequest.Builder, InstantInputSyncRequestOrBuilder> singleFieldBuilderV3 = this.syncRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (InstantInputSyncRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                InstantInputSyncRequest instantInputSyncRequest = this.syncRequest_;
                return instantInputSyncRequest == null ? InstantInputSyncRequest.getDefaultInstance() : instantInputSyncRequest;
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
            public boolean hasEndRequest() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
            public boolean hasEndResponse() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
            public boolean hasInputContent() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
            public boolean hasRestartRequest() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
            public boolean hasStartRequest() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
            public boolean hasStartResponse() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputServiceOrBuilder
            public boolean hasSyncRequest() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputService_fieldAccessorTable.ensureFieldAccessorsInitialized(InstantInputService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeEndRequest(InstantInputEndRequest instantInputEndRequest) {
                InstantInputEndRequest instantInputEndRequest2;
                SingleFieldBuilderV3<InstantInputEndRequest, InstantInputEndRequest.Builder, InstantInputEndRequestOrBuilder> singleFieldBuilderV3 = this.endRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(instantInputEndRequest);
                } else if ((this.bitField0_ & 8) == 0 || (instantInputEndRequest2 = this.endRequest_) == null || instantInputEndRequest2 == InstantInputEndRequest.getDefaultInstance()) {
                    this.endRequest_ = instantInputEndRequest;
                } else {
                    getEndRequestBuilder().mergeFrom(instantInputEndRequest);
                }
                if (this.endRequest_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeEndResponse(InstantInputEndResponse instantInputEndResponse) {
                InstantInputEndResponse instantInputEndResponse2;
                SingleFieldBuilderV3<InstantInputEndResponse, InstantInputEndResponse.Builder, InstantInputEndResponseOrBuilder> singleFieldBuilderV3 = this.endResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(instantInputEndResponse);
                } else if ((this.bitField0_ & 16) == 0 || (instantInputEndResponse2 = this.endResponse_) == null || instantInputEndResponse2 == InstantInputEndResponse.getDefaultInstance()) {
                    this.endResponse_ = instantInputEndResponse;
                } else {
                    getEndResponseBuilder().mergeFrom(instantInputEndResponse);
                }
                if (this.endResponse_ != null) {
                    this.bitField0_ |= 16;
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
                                    codedInputStream.readMessage(getInputContentFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getStartRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getStartResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getEndRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(getEndResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                } else if (tag == 50) {
                                    codedInputStream.readMessage(getRestartRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                } else if (tag == 58) {
                                    codedInputStream.readMessage(getSyncRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
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

            public Builder mergeInputContent(InstantInputMessage instantInputMessage) {
                InstantInputMessage instantInputMessage2;
                SingleFieldBuilderV3<InstantInputMessage, InstantInputMessage.Builder, InstantInputMessageOrBuilder> singleFieldBuilderV3 = this.inputContentBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(instantInputMessage);
                } else if ((this.bitField0_ & 1) == 0 || (instantInputMessage2 = this.inputContent_) == null || instantInputMessage2 == InstantInputMessage.getDefaultInstance()) {
                    this.inputContent_ = instantInputMessage;
                } else {
                    getInputContentBuilder().mergeFrom(instantInputMessage);
                }
                if (this.inputContent_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeRestartRequest(InstantInputRestartRequest instantInputRestartRequest) {
                InstantInputRestartRequest instantInputRestartRequest2;
                SingleFieldBuilderV3<InstantInputRestartRequest, InstantInputRestartRequest.Builder, InstantInputRestartRequestOrBuilder> singleFieldBuilderV3 = this.restartRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(instantInputRestartRequest);
                } else if ((this.bitField0_ & 32) == 0 || (instantInputRestartRequest2 = this.restartRequest_) == null || instantInputRestartRequest2 == InstantInputRestartRequest.getDefaultInstance()) {
                    this.restartRequest_ = instantInputRestartRequest;
                } else {
                    getRestartRequestBuilder().mergeFrom(instantInputRestartRequest);
                }
                if (this.restartRequest_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStartRequest(InstantInputStartRequest instantInputStartRequest) {
                InstantInputStartRequest instantInputStartRequest2;
                SingleFieldBuilderV3<InstantInputStartRequest, InstantInputStartRequest.Builder, InstantInputStartRequestOrBuilder> singleFieldBuilderV3 = this.startRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(instantInputStartRequest);
                } else if ((this.bitField0_ & 2) == 0 || (instantInputStartRequest2 = this.startRequest_) == null || instantInputStartRequest2 == InstantInputStartRequest.getDefaultInstance()) {
                    this.startRequest_ = instantInputStartRequest;
                } else {
                    getStartRequestBuilder().mergeFrom(instantInputStartRequest);
                }
                if (this.startRequest_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStartResponse(InstantInputStartResponse instantInputStartResponse) {
                InstantInputStartResponse instantInputStartResponse2;
                SingleFieldBuilderV3<InstantInputStartResponse, InstantInputStartResponse.Builder, InstantInputStartResponseOrBuilder> singleFieldBuilderV3 = this.startResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(instantInputStartResponse);
                } else if ((this.bitField0_ & 4) == 0 || (instantInputStartResponse2 = this.startResponse_) == null || instantInputStartResponse2 == InstantInputStartResponse.getDefaultInstance()) {
                    this.startResponse_ = instantInputStartResponse;
                } else {
                    getStartResponseBuilder().mergeFrom(instantInputStartResponse);
                }
                if (this.startResponse_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSyncRequest(InstantInputSyncRequest instantInputSyncRequest) {
                InstantInputSyncRequest instantInputSyncRequest2;
                SingleFieldBuilderV3<InstantInputSyncRequest, InstantInputSyncRequest.Builder, InstantInputSyncRequestOrBuilder> singleFieldBuilderV3 = this.syncRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(instantInputSyncRequest);
                } else if ((this.bitField0_ & 64) == 0 || (instantInputSyncRequest2 = this.syncRequest_) == null || instantInputSyncRequest2 == InstantInputSyncRequest.getDefaultInstance()) {
                    this.syncRequest_ = instantInputSyncRequest;
                } else {
                    getSyncRequestBuilder().mergeFrom(instantInputSyncRequest);
                }
                if (this.syncRequest_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setEndRequest(InstantInputEndRequest.Builder builder) {
                SingleFieldBuilderV3<InstantInputEndRequest, InstantInputEndRequest.Builder, InstantInputEndRequestOrBuilder> singleFieldBuilderV3 = this.endRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.endRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setEndResponse(InstantInputEndResponse.Builder builder) {
                SingleFieldBuilderV3<InstantInputEndResponse, InstantInputEndResponse.Builder, InstantInputEndResponseOrBuilder> singleFieldBuilderV3 = this.endResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.endResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setInputContent(InstantInputMessage.Builder builder) {
                SingleFieldBuilderV3<InstantInputMessage, InstantInputMessage.Builder, InstantInputMessageOrBuilder> singleFieldBuilderV3 = this.inputContentBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.inputContent_ = builder.build();
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

            public Builder setRestartRequest(InstantInputRestartRequest.Builder builder) {
                SingleFieldBuilderV3<InstantInputRestartRequest, InstantInputRestartRequest.Builder, InstantInputRestartRequestOrBuilder> singleFieldBuilderV3 = this.restartRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.restartRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setStartRequest(InstantInputStartRequest.Builder builder) {
                SingleFieldBuilderV3<InstantInputStartRequest, InstantInputStartRequest.Builder, InstantInputStartRequestOrBuilder> singleFieldBuilderV3 = this.startRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.startRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setStartResponse(InstantInputStartResponse.Builder builder) {
                SingleFieldBuilderV3<InstantInputStartResponse, InstantInputStartResponse.Builder, InstantInputStartResponseOrBuilder> singleFieldBuilderV3 = this.startResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.startResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSyncRequest(InstantInputSyncRequest.Builder builder) {
                SingleFieldBuilderV3<InstantInputSyncRequest, InstantInputSyncRequest.Builder, InstantInputSyncRequestOrBuilder> singleFieldBuilderV3 = this.syncRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.syncRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public InstantInputService getDefaultInstanceForType() {
                return InstantInputService.getDefaultInstance();
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

            public Builder setEndRequest(InstantInputEndRequest instantInputEndRequest) {
                SingleFieldBuilderV3<InstantInputEndRequest, InstantInputEndRequest.Builder, InstantInputEndRequestOrBuilder> singleFieldBuilderV3 = this.endRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    instantInputEndRequest.getClass();
                    this.endRequest_ = instantInputEndRequest;
                } else {
                    singleFieldBuilderV3.setMessage(instantInputEndRequest);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setEndResponse(InstantInputEndResponse instantInputEndResponse) {
                SingleFieldBuilderV3<InstantInputEndResponse, InstantInputEndResponse.Builder, InstantInputEndResponseOrBuilder> singleFieldBuilderV3 = this.endResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    instantInputEndResponse.getClass();
                    this.endResponse_ = instantInputEndResponse;
                } else {
                    singleFieldBuilderV3.setMessage(instantInputEndResponse);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setInputContent(InstantInputMessage instantInputMessage) {
                SingleFieldBuilderV3<InstantInputMessage, InstantInputMessage.Builder, InstantInputMessageOrBuilder> singleFieldBuilderV3 = this.inputContentBuilder_;
                if (singleFieldBuilderV3 == null) {
                    instantInputMessage.getClass();
                    this.inputContent_ = instantInputMessage;
                } else {
                    singleFieldBuilderV3.setMessage(instantInputMessage);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setRestartRequest(InstantInputRestartRequest instantInputRestartRequest) {
                SingleFieldBuilderV3<InstantInputRestartRequest, InstantInputRestartRequest.Builder, InstantInputRestartRequestOrBuilder> singleFieldBuilderV3 = this.restartRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    instantInputRestartRequest.getClass();
                    this.restartRequest_ = instantInputRestartRequest;
                } else {
                    singleFieldBuilderV3.setMessage(instantInputRestartRequest);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setStartRequest(InstantInputStartRequest instantInputStartRequest) {
                SingleFieldBuilderV3<InstantInputStartRequest, InstantInputStartRequest.Builder, InstantInputStartRequestOrBuilder> singleFieldBuilderV3 = this.startRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    instantInputStartRequest.getClass();
                    this.startRequest_ = instantInputStartRequest;
                } else {
                    singleFieldBuilderV3.setMessage(instantInputStartRequest);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setStartResponse(InstantInputStartResponse instantInputStartResponse) {
                SingleFieldBuilderV3<InstantInputStartResponse, InstantInputStartResponse.Builder, InstantInputStartResponseOrBuilder> singleFieldBuilderV3 = this.startResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    instantInputStartResponse.getClass();
                    this.startResponse_ = instantInputStartResponse;
                } else {
                    singleFieldBuilderV3.setMessage(instantInputStartResponse);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSyncRequest(InstantInputSyncRequest instantInputSyncRequest) {
                SingleFieldBuilderV3<InstantInputSyncRequest, InstantInputSyncRequest.Builder, InstantInputSyncRequestOrBuilder> singleFieldBuilderV3 = this.syncRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    instantInputSyncRequest.getClass();
                    this.syncRequest_ = instantInputSyncRequest;
                } else {
                    singleFieldBuilderV3.setMessage(instantInputSyncRequest);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof InstantInputService) {
                    return mergeFrom((InstantInputService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(InstantInputService instantInputService) {
                if (instantInputService == InstantInputService.getDefaultInstance()) {
                    return this;
                }
                if (instantInputService.hasInputContent()) {
                    mergeInputContent(instantInputService.getInputContent());
                }
                if (instantInputService.hasStartRequest()) {
                    mergeStartRequest(instantInputService.getStartRequest());
                }
                if (instantInputService.hasStartResponse()) {
                    mergeStartResponse(instantInputService.getStartResponse());
                }
                if (instantInputService.hasEndRequest()) {
                    mergeEndRequest(instantInputService.getEndRequest());
                }
                if (instantInputService.hasEndResponse()) {
                    mergeEndResponse(instantInputService.getEndResponse());
                }
                if (instantInputService.hasRestartRequest()) {
                    mergeRestartRequest(instantInputService.getRestartRequest());
                }
                if (instantInputService.hasSyncRequest()) {
                    mergeSyncRequest(instantInputService.getSyncRequest());
                }
                mergeUnknownFields(instantInputService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public InstantInputService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ InstantInputService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private InstantInputService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static InstantInputService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InstantInputService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InstantInputService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static InstantInputService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static InstantInputService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static InstantInputService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static InstantInputService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static InstantInputService parseFrom(InputStream inputStream) {
            return (InstantInputService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static InstantInputService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InstantInputService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InstantInputService parseFrom(CodedInputStream codedInputStream) {
            return (InstantInputService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static InstantInputService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InstantInputService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class InstantInputStartRequest extends GeneratedMessageV3 implements InstantInputStartRequestOrBuilder {
        public static final int CODE_PAGE_FIELD_NUMBER = 1;
        public static final int COMMAND_FIELD_NUMBER = 5;
        public static final int CONTENT_FIELD_NUMBER = 3;
        public static final int CONTENT_SIZE_FIELD_NUMBER = 4;
        public static final int MAX_SIZE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int codePage_;
        private int command_;
        private int contentSize_;
        private volatile Object content_;
        private int maxSize_;
        private byte memoizedIsInitialized;
        private static final InstantInputStartRequest DEFAULT_INSTANCE = new InstantInputStartRequest();

        @Deprecated
        public static final Parser<InstantInputStartRequest> PARSER = new AbstractParser<InstantInputStartRequest>() { // from class: com.garmin.proto.generated.GDIInstantInput.InstantInputStartRequest.1
            @Override // com.google.protobuf.Parser
            public InstantInputStartRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = InstantInputStartRequest.newBuilder();
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

        private InstantInputStartRequest() {
            this.codePage_ = 0;
            this.maxSize_ = 0;
            this.content_ = "";
            this.contentSize_ = 0;
            this.command_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.content_ = "";
            this.command_ = 0;
        }

        public static InstantInputStartRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputStartRequest_descriptor;
        }

        public static Builder newBuilder(InstantInputStartRequest instantInputStartRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(instantInputStartRequest);
        }

        public static InstantInputStartRequest parseDelimitedFrom(InputStream inputStream) {
            return (InstantInputStartRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static InstantInputStartRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<InstantInputStartRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InstantInputStartRequest)) {
                return super.equals(obj);
            }
            InstantInputStartRequest instantInputStartRequest = (InstantInputStartRequest) obj;
            if (hasCodePage() != instantInputStartRequest.hasCodePage()) {
                return false;
            }
            if ((hasCodePage() && getCodePage() != instantInputStartRequest.getCodePage()) || hasMaxSize() != instantInputStartRequest.hasMaxSize()) {
                return false;
            }
            if ((hasMaxSize() && getMaxSize() != instantInputStartRequest.getMaxSize()) || hasContent() != instantInputStartRequest.hasContent()) {
                return false;
            }
            if ((hasContent() && !getContent().equals(instantInputStartRequest.getContent())) || hasContentSize() != instantInputStartRequest.hasContentSize()) {
                return false;
            }
            if ((!hasContentSize() || getContentSize() == instantInputStartRequest.getContentSize()) && hasCommand() == instantInputStartRequest.hasCommand()) {
                return (!hasCommand() || this.command_ == instantInputStartRequest.command_) && getUnknownFields().equals(instantInputStartRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputStartRequestOrBuilder
        public int getCodePage() {
            return this.codePage_;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputStartRequestOrBuilder
        public Command getCommand() {
            Command commandForNumber = Command.forNumber(this.command_);
            return commandForNumber == null ? Command.UNKNOWN : commandForNumber;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputStartRequestOrBuilder
        public String getContent() {
            Object obj = this.content_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.content_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputStartRequestOrBuilder
        public ByteString getContentBytes() {
            Object obj = this.content_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.content_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputStartRequestOrBuilder
        public int getContentSize() {
            return this.contentSize_;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputStartRequestOrBuilder
        public int getMaxSize() {
            return this.maxSize_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<InstantInputStartRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.codePage_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.maxSize_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += GeneratedMessageV3.computeStringSize(3, this.content_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(4, this.contentSize_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(5, this.command_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputStartRequestOrBuilder
        public boolean hasCodePage() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputStartRequestOrBuilder
        public boolean hasCommand() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputStartRequestOrBuilder
        public boolean hasContent() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputStartRequestOrBuilder
        public boolean hasContentSize() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputStartRequestOrBuilder
        public boolean hasMaxSize() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCodePage()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getCodePage();
            }
            if (hasMaxSize()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getMaxSize();
            }
            if (hasContent()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getContent().hashCode();
            }
            if (hasContentSize()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getContentSize();
            }
            if (hasCommand()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + this.command_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputStartRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(InstantInputStartRequest.class, Builder.class);
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
            return new InstantInputStartRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.codePage_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.maxSize_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.content_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.contentSize_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeEnum(5, this.command_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements InstantInputStartRequestOrBuilder {
            private int bitField0_;
            private int codePage_;
            private int command_;
            private int contentSize_;
            private Object content_;
            private int maxSize_;

            private Builder() {
                this.content_ = "";
                this.command_ = 0;
            }

            private void buildPartial0(InstantInputStartRequest instantInputStartRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    instantInputStartRequest.codePage_ = this.codePage_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    instantInputStartRequest.maxSize_ = this.maxSize_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    instantInputStartRequest.content_ = this.content_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    instantInputStartRequest.contentSize_ = this.contentSize_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    instantInputStartRequest.command_ = this.command_;
                    i14 |= 16;
                }
                instantInputStartRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputStartRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InstantInputStartRequest build() {
                InstantInputStartRequest instantInputStartRequestBuildPartial = buildPartial();
                if (instantInputStartRequestBuildPartial.isInitialized()) {
                    return instantInputStartRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) instantInputStartRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InstantInputStartRequest buildPartial() {
                InstantInputStartRequest instantInputStartRequest = new InstantInputStartRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(instantInputStartRequest);
                }
                onBuilt();
                return instantInputStartRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.codePage_ = 0;
                this.maxSize_ = 0;
                this.content_ = "";
                this.contentSize_ = 0;
                this.command_ = 0;
                return this;
            }

            public Builder clearCodePage() {
                this.bitField0_ &= -2;
                this.codePage_ = 0;
                onChanged();
                return this;
            }

            public Builder clearCommand() {
                this.bitField0_ &= -17;
                this.command_ = 0;
                onChanged();
                return this;
            }

            public Builder clearContent() {
                this.content_ = InstantInputStartRequest.getDefaultInstance().getContent();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearContentSize() {
                this.bitField0_ &= -9;
                this.contentSize_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMaxSize() {
                this.bitField0_ &= -3;
                this.maxSize_ = 0;
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

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputStartRequestOrBuilder
            public int getCodePage() {
                return this.codePage_;
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputStartRequestOrBuilder
            public Command getCommand() {
                Command commandForNumber = Command.forNumber(this.command_);
                return commandForNumber == null ? Command.UNKNOWN : commandForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputStartRequestOrBuilder
            public String getContent() {
                Object obj = this.content_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.content_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputStartRequestOrBuilder
            public ByteString getContentBytes() {
                Object obj = this.content_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.content_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputStartRequestOrBuilder
            public int getContentSize() {
                return this.contentSize_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputStartRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputStartRequestOrBuilder
            public int getMaxSize() {
                return this.maxSize_;
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputStartRequestOrBuilder
            public boolean hasCodePage() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputStartRequestOrBuilder
            public boolean hasCommand() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputStartRequestOrBuilder
            public boolean hasContent() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputStartRequestOrBuilder
            public boolean hasContentSize() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputStartRequestOrBuilder
            public boolean hasMaxSize() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputStartRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(InstantInputStartRequest.class, Builder.class);
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
                                    this.codePage_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.maxSize_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.content_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.contentSize_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    int i14 = codedInputStream.readEnum();
                                    if (Command.forNumber(i14) == null) {
                                        mergeUnknownVarintField(5, i14);
                                    } else {
                                        this.command_ = i14;
                                        this.bitField0_ |= 16;
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

            public Builder setCodePage(int i14) {
                this.codePage_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setCommand(Command command) {
                command.getClass();
                this.bitField0_ |= 16;
                this.command_ = command.getNumber();
                onChanged();
                return this;
            }

            public Builder setContent(String str) {
                str.getClass();
                this.content_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setContentBytes(ByteString byteString) {
                byteString.getClass();
                this.content_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setContentSize(int i14) {
                this.contentSize_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setMaxSize(int i14) {
                this.maxSize_ = i14;
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
            public InstantInputStartRequest getDefaultInstanceForType() {
                return InstantInputStartRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.content_ = "";
                this.command_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof InstantInputStartRequest) {
                    return mergeFrom((InstantInputStartRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(InstantInputStartRequest instantInputStartRequest) {
                if (instantInputStartRequest == InstantInputStartRequest.getDefaultInstance()) {
                    return this;
                }
                if (instantInputStartRequest.hasCodePage()) {
                    setCodePage(instantInputStartRequest.getCodePage());
                }
                if (instantInputStartRequest.hasMaxSize()) {
                    setMaxSize(instantInputStartRequest.getMaxSize());
                }
                if (instantInputStartRequest.hasContent()) {
                    this.content_ = instantInputStartRequest.content_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (instantInputStartRequest.hasContentSize()) {
                    setContentSize(instantInputStartRequest.getContentSize());
                }
                if (instantInputStartRequest.hasCommand()) {
                    setCommand(instantInputStartRequest.getCommand());
                }
                mergeUnknownFields(instantInputStartRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public InstantInputStartRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static InstantInputStartRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InstantInputStartRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InstantInputStartRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static InstantInputStartRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static InstantInputStartRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static InstantInputStartRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static InstantInputStartRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static InstantInputStartRequest parseFrom(InputStream inputStream) {
            return (InstantInputStartRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static InstantInputStartRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InstantInputStartRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InstantInputStartRequest parseFrom(CodedInputStream codedInputStream) {
            return (InstantInputStartRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static InstantInputStartRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InstantInputStartRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private InstantInputStartRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.codePage_ = 0;
            this.maxSize_ = 0;
            this.content_ = "";
            this.contentSize_ = 0;
            this.command_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public enum Command implements ProtocolMessageEnum {
            UNKNOWN(0),
            RENAME(1),
            POI_SEARCH(2);

            public static final int POI_SEARCH_VALUE = 2;
            public static final int RENAME_VALUE = 1;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Command> internalValueMap = new Internal.EnumLiteMap<Command>() { // from class: com.garmin.proto.generated.GDIInstantInput.InstantInputStartRequest.Command.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Command findValueByNumber(int i14) {
                    return Command.forNumber(i14);
                }
            };
            private static final Command[] VALUES = values();

            Command(int i14) {
                this.value = i14;
            }

            public static Command forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN;
                }
                if (i14 == 1) {
                    return RENAME;
                }
                if (i14 != 2) {
                    return null;
                }
                return POI_SEARCH;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return InstantInputStartRequest.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Command> internalGetValueMap() {
                return internalValueMap;
            }

            public static Command valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Command valueOf(int i14) {
                return forNumber(i14);
            }
        }

        public /* synthetic */ InstantInputStartRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class InstantInputStartResponse extends GeneratedMessageV3 implements InstantInputStartResponseOrBuilder {
        private static final InstantInputStartResponse DEFAULT_INSTANCE = new InstantInputStartResponse();

        @Deprecated
        public static final Parser<InstantInputStartResponse> PARSER = new AbstractParser<InstantInputStartResponse>() { // from class: com.garmin.proto.generated.GDIInstantInput.InstantInputStartResponse.1
            @Override // com.google.protobuf.Parser
            public InstantInputStartResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = InstantInputStartResponse.newBuilder();
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
        public static final int RESULT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int result_;

        private InstantInputStartResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.result_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static InstantInputStartResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputStartResponse_descriptor;
        }

        public static Builder newBuilder(InstantInputStartResponse instantInputStartResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(instantInputStartResponse);
        }

        public static InstantInputStartResponse parseDelimitedFrom(InputStream inputStream) {
            return (InstantInputStartResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static InstantInputStartResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<InstantInputStartResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InstantInputStartResponse)) {
                return super.equals(obj);
            }
            InstantInputStartResponse instantInputStartResponse = (InstantInputStartResponse) obj;
            if (hasResult() != instantInputStartResponse.hasResult()) {
                return false;
            }
            return (!hasResult() || this.result_ == instantInputStartResponse.result_) && getUnknownFields().equals(instantInputStartResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<InstantInputStartResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputStartResponseOrBuilder
        public CommandResult getResult() {
            CommandResult commandResultForNumber = CommandResult.forNumber(this.result_);
            return commandResultForNumber == null ? CommandResult.UNKNOWN : commandResultForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.result_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputStartResponseOrBuilder
        public boolean hasResult() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasResult()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.result_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputStartResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(InstantInputStartResponse.class, Builder.class);
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
            return new InstantInputStartResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.result_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements InstantInputStartResponseOrBuilder {
            private int bitField0_;
            private int result_;

            private Builder() {
                this.result_ = 0;
            }

            private void buildPartial0(InstantInputStartResponse instantInputStartResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    instantInputStartResponse.result_ = this.result_;
                } else {
                    i14 = 0;
                }
                instantInputStartResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputStartResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InstantInputStartResponse build() {
                InstantInputStartResponse instantInputStartResponseBuildPartial = buildPartial();
                if (instantInputStartResponseBuildPartial.isInitialized()) {
                    return instantInputStartResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) instantInputStartResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InstantInputStartResponse buildPartial() {
                InstantInputStartResponse instantInputStartResponse = new InstantInputStartResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(instantInputStartResponse);
                }
                onBuilt();
                return instantInputStartResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.result_ = 0;
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

            public Builder clearResult() {
                this.bitField0_ &= -2;
                this.result_ = 0;
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
                return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputStartResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputStartResponseOrBuilder
            public CommandResult getResult() {
                CommandResult commandResultForNumber = CommandResult.forNumber(this.result_);
                return commandResultForNumber == null ? CommandResult.UNKNOWN : commandResultForNumber;
            }

            @Override // com.garmin.proto.generated.GDIInstantInput.InstantInputStartResponseOrBuilder
            public boolean hasResult() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIInstantInput.internal_static_GDI_Proto_InstantInput_InstantInputStartResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(InstantInputStartResponse.class, Builder.class);
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
                                    if (CommandResult.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.result_ = i14;
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

            public Builder setResult(CommandResult commandResult) {
                commandResult.getClass();
                this.bitField0_ |= 1;
                this.result_ = commandResult.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public InstantInputStartResponse getDefaultInstanceForType() {
                return InstantInputStartResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.result_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof InstantInputStartResponse) {
                    return mergeFrom((InstantInputStartResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(InstantInputStartResponse instantInputStartResponse) {
                if (instantInputStartResponse == InstantInputStartResponse.getDefaultInstance()) {
                    return this;
                }
                if (instantInputStartResponse.hasResult()) {
                    setResult(instantInputStartResponse.getResult());
                }
                mergeUnknownFields(instantInputStartResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public InstantInputStartResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static InstantInputStartResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InstantInputStartResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InstantInputStartResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ InstantInputStartResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static InstantInputStartResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private InstantInputStartResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.result_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static InstantInputStartResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static InstantInputStartResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static InstantInputStartResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static InstantInputStartResponse parseFrom(InputStream inputStream) {
            return (InstantInputStartResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static InstantInputStartResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InstantInputStartResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InstantInputStartResponse parseFrom(CodedInputStream codedInputStream) {
            return (InstantInputStartResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static InstantInputStartResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InstantInputStartResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public enum CommandResult implements ProtocolMessageEnum {
        UNKNOWN(0),
        SUCCESS(1),
        FAILURE(2);

        public static final int FAILURE_VALUE = 2;
        public static final int SUCCESS_VALUE = 1;
        public static final int UNKNOWN_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<CommandResult> internalValueMap = new Internal.EnumLiteMap<CommandResult>() { // from class: com.garmin.proto.generated.GDIInstantInput.CommandResult.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public CommandResult findValueByNumber(int i14) {
                return CommandResult.forNumber(i14);
            }
        };
        private static final CommandResult[] VALUES = values();

        CommandResult(int i14) {
            this.value = i14;
        }

        public static CommandResult forNumber(int i14) {
            if (i14 == 0) {
                return UNKNOWN;
            }
            if (i14 == 1) {
                return SUCCESS;
            }
            if (i14 != 2) {
                return null;
            }
            return FAILURE;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIInstantInput.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<CommandResult> internalGetValueMap() {
            return internalValueMap;
        }

        public static CommandResult valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static CommandResult valueOf(int i14) {
            return forNumber(i14);
        }
    }
}
