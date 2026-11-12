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

/* JADX INFO: loaded from: classes4.dex */
public final class GDIDeviceMessages {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0017GDIDeviceMessages.proto\u0012\u0018GDI.Proto.DeviceMessages\"Ô\u0002\n\u0014DeviceMessageService\u0012T\n\u0011message_subscribe\u0018\u0001 \u0001(\u000b29.GDI.Proto.DeviceMessages.CIQMessageSubscribeNotification\u0012X\n\u0013message_unsubscribe\u0018\u0002 \u0001(\u000b2;.GDI.Proto.DeviceMessages.CIQMessageUnsubscribeNotification\u0012D\n\u000fmessage_request\u0018\u0003 \u0001(\u000b2+.GDI.Proto.DeviceMessages.CIQMessageRequest\u0012F\n\u0010message_response\u0018\u0004 \u0001(\u000b2,.GDI.Proto.DeviceMessages.CIQMessageResponse\"8\n\u001fCIQMessageSubscribeNotification\u0012\u0015\n\rlast_event_id\u0018\u0001 \u0001(\t\"#\n!CIQMessageUnsubscribeNotification\"F\n\u0011CIQMessageRequest\u0012\u0010\n\bevent_id\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006app_id\u0018\u0002 \u0001(\t\u0012\u000f\n\u0007payload\u0018\u0003 \u0001(\t\"\u008f\u0001\n\u0012CIQMessageResponse\u0012\u0010\n\bevent_id\u0018\u0001 \u0001(\t\u0012C\n\u0006status\u0018\u0002 \u0001(\u000e23.GDI.Proto.DeviceMessages.CIQMessageResponse.Status\"\"\n\u0006Status\u0012\u000b\n\u0007SUCCESS\u0010\u0000\u0012\u000b\n\u0007FAILURE\u0010\u0001B1\n\u001acom.garmin.proto.generatedB\u0011GDIDeviceMessagesH\u0003"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DeviceMessages_CIQMessageRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DeviceMessages_CIQMessageRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DeviceMessages_CIQMessageResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DeviceMessages_CIQMessageResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DeviceMessages_CIQMessageSubscribeNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DeviceMessages_CIQMessageSubscribeNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DeviceMessages_CIQMessageUnsubscribeNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DeviceMessages_CIQMessageUnsubscribeNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DeviceMessages_DeviceMessageService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DeviceMessages_DeviceMessageService_fieldAccessorTable;

    public interface CIQMessageRequestOrBuilder extends MessageOrBuilder {
        String getAppId();

        ByteString getAppIdBytes();

        String getEventId();

        ByteString getEventIdBytes();

        String getPayload();

        ByteString getPayloadBytes();

        boolean hasAppId();

        boolean hasEventId();

        boolean hasPayload();
    }

    public interface CIQMessageResponseOrBuilder extends MessageOrBuilder {
        String getEventId();

        ByteString getEventIdBytes();

        CIQMessageResponse.Status getStatus();

        boolean hasEventId();

        boolean hasStatus();
    }

    public interface CIQMessageSubscribeNotificationOrBuilder extends MessageOrBuilder {
        String getLastEventId();

        ByteString getLastEventIdBytes();

        boolean hasLastEventId();
    }

    public interface CIQMessageUnsubscribeNotificationOrBuilder extends MessageOrBuilder {
    }

    public interface DeviceMessageServiceOrBuilder extends MessageOrBuilder {
        CIQMessageRequest getMessageRequest();

        CIQMessageRequestOrBuilder getMessageRequestOrBuilder();

        CIQMessageResponse getMessageResponse();

        CIQMessageResponseOrBuilder getMessageResponseOrBuilder();

        CIQMessageSubscribeNotification getMessageSubscribe();

        CIQMessageSubscribeNotificationOrBuilder getMessageSubscribeOrBuilder();

        CIQMessageUnsubscribeNotification getMessageUnsubscribe();

        CIQMessageUnsubscribeNotificationOrBuilder getMessageUnsubscribeOrBuilder();

        boolean hasMessageRequest();

        boolean hasMessageResponse();

        boolean hasMessageSubscribe();

        boolean hasMessageUnsubscribe();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_DeviceMessages_DeviceMessageService_descriptor = descriptor2;
        internal_static_GDI_Proto_DeviceMessages_DeviceMessageService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"MessageSubscribe", "MessageUnsubscribe", "MessageRequest", "MessageResponse"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_DeviceMessages_CIQMessageSubscribeNotification_descriptor = descriptor3;
        internal_static_GDI_Proto_DeviceMessages_CIQMessageSubscribeNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"LastEventId"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_DeviceMessages_CIQMessageUnsubscribeNotification_descriptor = descriptor4;
        internal_static_GDI_Proto_DeviceMessages_CIQMessageUnsubscribeNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[0]);
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_DeviceMessages_CIQMessageRequest_descriptor = descriptor5;
        internal_static_GDI_Proto_DeviceMessages_CIQMessageRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"EventId", "AppId", "Payload"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_DeviceMessages_CIQMessageResponse_descriptor = descriptor6;
        internal_static_GDI_Proto_DeviceMessages_CIQMessageResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"EventId", "Status"});
    }

    private GDIDeviceMessages() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class CIQMessageUnsubscribeNotification extends GeneratedMessageV3 implements CIQMessageUnsubscribeNotificationOrBuilder {
        private static final CIQMessageUnsubscribeNotification DEFAULT_INSTANCE = new CIQMessageUnsubscribeNotification();

        @Deprecated
        public static final Parser<CIQMessageUnsubscribeNotification> PARSER = new AbstractParser<CIQMessageUnsubscribeNotification>() { // from class: com.garmin.proto.generated.GDIDeviceMessages.CIQMessageUnsubscribeNotification.1
            @Override // com.google.protobuf.Parser
            public CIQMessageUnsubscribeNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CIQMessageUnsubscribeNotification.newBuilder();
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

        private CIQMessageUnsubscribeNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CIQMessageUnsubscribeNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDeviceMessages.internal_static_GDI_Proto_DeviceMessages_CIQMessageUnsubscribeNotification_descriptor;
        }

        public static Builder newBuilder(CIQMessageUnsubscribeNotification cIQMessageUnsubscribeNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cIQMessageUnsubscribeNotification);
        }

        public static CIQMessageUnsubscribeNotification parseDelimitedFrom(InputStream inputStream) {
            return (CIQMessageUnsubscribeNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CIQMessageUnsubscribeNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CIQMessageUnsubscribeNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof CIQMessageUnsubscribeNotification) {
                return getUnknownFields().equals(((CIQMessageUnsubscribeNotification) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CIQMessageUnsubscribeNotification> getParserForType() {
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
            return GDIDeviceMessages.internal_static_GDI_Proto_DeviceMessages_CIQMessageUnsubscribeNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(CIQMessageUnsubscribeNotification.class, Builder.class);
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
            return new CIQMessageUnsubscribeNotification();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CIQMessageUnsubscribeNotificationOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDeviceMessages.internal_static_GDI_Proto_DeviceMessages_CIQMessageUnsubscribeNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CIQMessageUnsubscribeNotification build() {
                CIQMessageUnsubscribeNotification cIQMessageUnsubscribeNotificationBuildPartial = buildPartial();
                if (cIQMessageUnsubscribeNotificationBuildPartial.isInitialized()) {
                    return cIQMessageUnsubscribeNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) cIQMessageUnsubscribeNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CIQMessageUnsubscribeNotification buildPartial() {
                CIQMessageUnsubscribeNotification cIQMessageUnsubscribeNotification = new CIQMessageUnsubscribeNotification(this);
                onBuilt();
                return cIQMessageUnsubscribeNotification;
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
                return GDIDeviceMessages.internal_static_GDI_Proto_DeviceMessages_CIQMessageUnsubscribeNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDeviceMessages.internal_static_GDI_Proto_DeviceMessages_CIQMessageUnsubscribeNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(CIQMessageUnsubscribeNotification.class, Builder.class);
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
            public CIQMessageUnsubscribeNotification getDefaultInstanceForType() {
                return CIQMessageUnsubscribeNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CIQMessageUnsubscribeNotification) {
                    return mergeFrom((CIQMessageUnsubscribeNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CIQMessageUnsubscribeNotification cIQMessageUnsubscribeNotification) {
                if (cIQMessageUnsubscribeNotification == CIQMessageUnsubscribeNotification.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(cIQMessageUnsubscribeNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CIQMessageUnsubscribeNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ CIQMessageUnsubscribeNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private CIQMessageUnsubscribeNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CIQMessageUnsubscribeNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CIQMessageUnsubscribeNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CIQMessageUnsubscribeNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CIQMessageUnsubscribeNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CIQMessageUnsubscribeNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CIQMessageUnsubscribeNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CIQMessageUnsubscribeNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CIQMessageUnsubscribeNotification parseFrom(InputStream inputStream) {
            return (CIQMessageUnsubscribeNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CIQMessageUnsubscribeNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CIQMessageUnsubscribeNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CIQMessageUnsubscribeNotification parseFrom(CodedInputStream codedInputStream) {
            return (CIQMessageUnsubscribeNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CIQMessageUnsubscribeNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CIQMessageUnsubscribeNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CIQMessageRequest extends GeneratedMessageV3 implements CIQMessageRequestOrBuilder {
        public static final int APP_ID_FIELD_NUMBER = 2;
        public static final int EVENT_ID_FIELD_NUMBER = 1;
        public static final int PAYLOAD_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private volatile Object appId_;
        private int bitField0_;
        private volatile Object eventId_;
        private byte memoizedIsInitialized;
        private volatile Object payload_;
        private static final CIQMessageRequest DEFAULT_INSTANCE = new CIQMessageRequest();

        @Deprecated
        public static final Parser<CIQMessageRequest> PARSER = new AbstractParser<CIQMessageRequest>() { // from class: com.garmin.proto.generated.GDIDeviceMessages.CIQMessageRequest.1
            @Override // com.google.protobuf.Parser
            public CIQMessageRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CIQMessageRequest.newBuilder();
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

        private CIQMessageRequest() {
            this.eventId_ = "";
            this.appId_ = "";
            this.payload_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.eventId_ = "";
            this.appId_ = "";
            this.payload_ = "";
        }

        public static CIQMessageRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDeviceMessages.internal_static_GDI_Proto_DeviceMessages_CIQMessageRequest_descriptor;
        }

        public static Builder newBuilder(CIQMessageRequest cIQMessageRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cIQMessageRequest);
        }

        public static CIQMessageRequest parseDelimitedFrom(InputStream inputStream) {
            return (CIQMessageRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CIQMessageRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CIQMessageRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CIQMessageRequest)) {
                return super.equals(obj);
            }
            CIQMessageRequest cIQMessageRequest = (CIQMessageRequest) obj;
            if (hasEventId() != cIQMessageRequest.hasEventId()) {
                return false;
            }
            if ((hasEventId() && !getEventId().equals(cIQMessageRequest.getEventId())) || hasAppId() != cIQMessageRequest.hasAppId()) {
                return false;
            }
            if ((!hasAppId() || getAppId().equals(cIQMessageRequest.getAppId())) && hasPayload() == cIQMessageRequest.hasPayload()) {
                return (!hasPayload() || getPayload().equals(cIQMessageRequest.getPayload())) && getUnknownFields().equals(cIQMessageRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDeviceMessages.CIQMessageRequestOrBuilder
        public String getAppId() {
            Object obj = this.appId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.appId_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIDeviceMessages.CIQMessageRequestOrBuilder
        public ByteString getAppIdBytes() {
            Object obj = this.appId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.appId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIDeviceMessages.CIQMessageRequestOrBuilder
        public String getEventId() {
            Object obj = this.eventId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.eventId_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIDeviceMessages.CIQMessageRequestOrBuilder
        public ByteString getEventIdBytes() {
            Object obj = this.eventId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.eventId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CIQMessageRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIDeviceMessages.CIQMessageRequestOrBuilder
        public String getPayload() {
            Object obj = this.payload_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.payload_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIDeviceMessages.CIQMessageRequestOrBuilder
        public ByteString getPayloadBytes() {
            Object obj = this.payload_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.payload_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.eventId_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.appId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(3, this.payload_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDeviceMessages.CIQMessageRequestOrBuilder
        public boolean hasAppId() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDeviceMessages.CIQMessageRequestOrBuilder
        public boolean hasEventId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDeviceMessages.CIQMessageRequestOrBuilder
        public boolean hasPayload() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasEventId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getEventId().hashCode();
            }
            if (hasAppId()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getAppId().hashCode();
            }
            if (hasPayload()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getPayload().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDeviceMessages.internal_static_GDI_Proto_DeviceMessages_CIQMessageRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CIQMessageRequest.class, Builder.class);
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
            return new CIQMessageRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.eventId_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.appId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.payload_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CIQMessageRequestOrBuilder {
            private Object appId_;
            private int bitField0_;
            private Object eventId_;
            private Object payload_;

            private Builder() {
                this.eventId_ = "";
                this.appId_ = "";
                this.payload_ = "";
            }

            private void buildPartial0(CIQMessageRequest cIQMessageRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    cIQMessageRequest.eventId_ = this.eventId_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    cIQMessageRequest.appId_ = this.appId_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    cIQMessageRequest.payload_ = this.payload_;
                    i14 |= 4;
                }
                cIQMessageRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDeviceMessages.internal_static_GDI_Proto_DeviceMessages_CIQMessageRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CIQMessageRequest build() {
                CIQMessageRequest cIQMessageRequestBuildPartial = buildPartial();
                if (cIQMessageRequestBuildPartial.isInitialized()) {
                    return cIQMessageRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) cIQMessageRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CIQMessageRequest buildPartial() {
                CIQMessageRequest cIQMessageRequest = new CIQMessageRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(cIQMessageRequest);
                }
                onBuilt();
                return cIQMessageRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.eventId_ = "";
                this.appId_ = "";
                this.payload_ = "";
                return this;
            }

            public Builder clearAppId() {
                this.appId_ = CIQMessageRequest.getDefaultInstance().getAppId();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearEventId() {
                this.eventId_ = CIQMessageRequest.getDefaultInstance().getEventId();
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

            public Builder clearPayload() {
                this.payload_ = CIQMessageRequest.getDefaultInstance().getPayload();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIDeviceMessages.CIQMessageRequestOrBuilder
            public String getAppId() {
                Object obj = this.appId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.appId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDeviceMessages.CIQMessageRequestOrBuilder
            public ByteString getAppIdBytes() {
                Object obj = this.appId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.appId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDeviceMessages.internal_static_GDI_Proto_DeviceMessages_CIQMessageRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDeviceMessages.CIQMessageRequestOrBuilder
            public String getEventId() {
                Object obj = this.eventId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.eventId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDeviceMessages.CIQMessageRequestOrBuilder
            public ByteString getEventIdBytes() {
                Object obj = this.eventId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.eventId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDeviceMessages.CIQMessageRequestOrBuilder
            public String getPayload() {
                Object obj = this.payload_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.payload_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDeviceMessages.CIQMessageRequestOrBuilder
            public ByteString getPayloadBytes() {
                Object obj = this.payload_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.payload_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDeviceMessages.CIQMessageRequestOrBuilder
            public boolean hasAppId() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDeviceMessages.CIQMessageRequestOrBuilder
            public boolean hasEventId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDeviceMessages.CIQMessageRequestOrBuilder
            public boolean hasPayload() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDeviceMessages.internal_static_GDI_Proto_DeviceMessages_CIQMessageRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CIQMessageRequest.class, Builder.class);
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
                                    this.eventId_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.appId_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.payload_ = codedInputStream.readBytes();
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

            public Builder setAppId(String str) {
                str.getClass();
                this.appId_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setAppIdBytes(ByteString byteString) {
                byteString.getClass();
                this.appId_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setEventId(String str) {
                str.getClass();
                this.eventId_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setEventIdBytes(ByteString byteString) {
                byteString.getClass();
                this.eventId_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setPayload(String str) {
                str.getClass();
                this.payload_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPayloadBytes(ByteString byteString) {
                byteString.getClass();
                this.payload_ = byteString;
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
            public CIQMessageRequest getDefaultInstanceForType() {
                return CIQMessageRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.eventId_ = "";
                this.appId_ = "";
                this.payload_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CIQMessageRequest) {
                    return mergeFrom((CIQMessageRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CIQMessageRequest cIQMessageRequest) {
                if (cIQMessageRequest == CIQMessageRequest.getDefaultInstance()) {
                    return this;
                }
                if (cIQMessageRequest.hasEventId()) {
                    this.eventId_ = cIQMessageRequest.eventId_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (cIQMessageRequest.hasAppId()) {
                    this.appId_ = cIQMessageRequest.appId_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (cIQMessageRequest.hasPayload()) {
                    this.payload_ = cIQMessageRequest.payload_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                mergeUnknownFields(cIQMessageRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CIQMessageRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static CIQMessageRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CIQMessageRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CIQMessageRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CIQMessageRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CIQMessageRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CIQMessageRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CIQMessageRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CIQMessageRequest parseFrom(InputStream inputStream) {
            return (CIQMessageRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CIQMessageRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CIQMessageRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CIQMessageRequest parseFrom(CodedInputStream codedInputStream) {
            return (CIQMessageRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CIQMessageRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CIQMessageRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private CIQMessageRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.eventId_ = "";
            this.appId_ = "";
            this.payload_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ CIQMessageRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class CIQMessageResponse extends GeneratedMessageV3 implements CIQMessageResponseOrBuilder {
        public static final int EVENT_ID_FIELD_NUMBER = 1;
        public static final int STATUS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object eventId_;
        private byte memoizedIsInitialized;
        private int status_;
        private static final CIQMessageResponse DEFAULT_INSTANCE = new CIQMessageResponse();

        @Deprecated
        public static final Parser<CIQMessageResponse> PARSER = new AbstractParser<CIQMessageResponse>() { // from class: com.garmin.proto.generated.GDIDeviceMessages.CIQMessageResponse.1
            @Override // com.google.protobuf.Parser
            public CIQMessageResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CIQMessageResponse.newBuilder();
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

        private CIQMessageResponse() {
            this.eventId_ = "";
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.eventId_ = "";
            this.status_ = 0;
        }

        public static CIQMessageResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDeviceMessages.internal_static_GDI_Proto_DeviceMessages_CIQMessageResponse_descriptor;
        }

        public static Builder newBuilder(CIQMessageResponse cIQMessageResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cIQMessageResponse);
        }

        public static CIQMessageResponse parseDelimitedFrom(InputStream inputStream) {
            return (CIQMessageResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CIQMessageResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CIQMessageResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CIQMessageResponse)) {
                return super.equals(obj);
            }
            CIQMessageResponse cIQMessageResponse = (CIQMessageResponse) obj;
            if (hasEventId() != cIQMessageResponse.hasEventId()) {
                return false;
            }
            if ((!hasEventId() || getEventId().equals(cIQMessageResponse.getEventId())) && hasStatus() == cIQMessageResponse.hasStatus()) {
                return (!hasStatus() || this.status_ == cIQMessageResponse.status_) && getUnknownFields().equals(cIQMessageResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDeviceMessages.CIQMessageResponseOrBuilder
        public String getEventId() {
            Object obj = this.eventId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.eventId_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIDeviceMessages.CIQMessageResponseOrBuilder
        public ByteString getEventIdBytes() {
            Object obj = this.eventId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.eventId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CIQMessageResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.eventId_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(2, this.status_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDeviceMessages.CIQMessageResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.SUCCESS : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIDeviceMessages.CIQMessageResponseOrBuilder
        public boolean hasEventId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDeviceMessages.CIQMessageResponseOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasEventId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getEventId().hashCode();
            }
            if (hasStatus()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.status_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDeviceMessages.internal_static_GDI_Proto_DeviceMessages_CIQMessageResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CIQMessageResponse.class, Builder.class);
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
            return new CIQMessageResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.eventId_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.status_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CIQMessageResponseOrBuilder {
            private int bitField0_;
            private Object eventId_;
            private int status_;

            private Builder() {
                this.eventId_ = "";
                this.status_ = 0;
            }

            private void buildPartial0(CIQMessageResponse cIQMessageResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    cIQMessageResponse.eventId_ = this.eventId_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    cIQMessageResponse.status_ = this.status_;
                    i14 |= 2;
                }
                cIQMessageResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDeviceMessages.internal_static_GDI_Proto_DeviceMessages_CIQMessageResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CIQMessageResponse build() {
                CIQMessageResponse cIQMessageResponseBuildPartial = buildPartial();
                if (cIQMessageResponseBuildPartial.isInitialized()) {
                    return cIQMessageResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) cIQMessageResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CIQMessageResponse buildPartial() {
                CIQMessageResponse cIQMessageResponse = new CIQMessageResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(cIQMessageResponse);
                }
                onBuilt();
                return cIQMessageResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.eventId_ = "";
                this.status_ = 0;
                return this;
            }

            public Builder clearEventId() {
                this.eventId_ = CIQMessageResponse.getDefaultInstance().getEventId();
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

            public Builder clearStatus() {
                this.bitField0_ &= -3;
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
                return GDIDeviceMessages.internal_static_GDI_Proto_DeviceMessages_CIQMessageResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDeviceMessages.CIQMessageResponseOrBuilder
            public String getEventId() {
                Object obj = this.eventId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.eventId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDeviceMessages.CIQMessageResponseOrBuilder
            public ByteString getEventIdBytes() {
                Object obj = this.eventId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.eventId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDeviceMessages.CIQMessageResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.SUCCESS : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIDeviceMessages.CIQMessageResponseOrBuilder
            public boolean hasEventId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDeviceMessages.CIQMessageResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDeviceMessages.internal_static_GDI_Proto_DeviceMessages_CIQMessageResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CIQMessageResponse.class, Builder.class);
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
                                    this.eventId_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (Status.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 2;
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

            public Builder setEventId(String str) {
                str.getClass();
                this.eventId_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setEventIdBytes(ByteString byteString) {
                byteString.getClass();
                this.eventId_ = byteString;
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

            public Builder setStatus(Status status) {
                status.getClass();
                this.bitField0_ |= 2;
                this.status_ = status.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CIQMessageResponse getDefaultInstanceForType() {
                return CIQMessageResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.eventId_ = "";
                this.status_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CIQMessageResponse) {
                    return mergeFrom((CIQMessageResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CIQMessageResponse cIQMessageResponse) {
                if (cIQMessageResponse == CIQMessageResponse.getDefaultInstance()) {
                    return this;
                }
                if (cIQMessageResponse.hasEventId()) {
                    this.eventId_ = cIQMessageResponse.eventId_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (cIQMessageResponse.hasStatus()) {
                    setStatus(cIQMessageResponse.getStatus());
                }
                mergeUnknownFields(cIQMessageResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CIQMessageResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static CIQMessageResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CIQMessageResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CIQMessageResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CIQMessageResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CIQMessageResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CIQMessageResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CIQMessageResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CIQMessageResponse parseFrom(InputStream inputStream) {
            return (CIQMessageResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CIQMessageResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CIQMessageResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private CIQMessageResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.eventId_ = "";
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CIQMessageResponse parseFrom(CodedInputStream codedInputStream) {
            return (CIQMessageResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CIQMessageResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CIQMessageResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ CIQMessageResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public enum Status implements ProtocolMessageEnum {
            SUCCESS(0),
            FAILURE(1);

            public static final int FAILURE_VALUE = 1;
            public static final int SUCCESS_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIDeviceMessages.CIQMessageResponse.Status.1
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
                    return SUCCESS;
                }
                if (i14 != 1) {
                    return null;
                }
                return FAILURE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return CIQMessageResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class CIQMessageSubscribeNotification extends GeneratedMessageV3 implements CIQMessageSubscribeNotificationOrBuilder {
        public static final int LAST_EVENT_ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object lastEventId_;
        private byte memoizedIsInitialized;
        private static final CIQMessageSubscribeNotification DEFAULT_INSTANCE = new CIQMessageSubscribeNotification();

        @Deprecated
        public static final Parser<CIQMessageSubscribeNotification> PARSER = new AbstractParser<CIQMessageSubscribeNotification>() { // from class: com.garmin.proto.generated.GDIDeviceMessages.CIQMessageSubscribeNotification.1
            @Override // com.google.protobuf.Parser
            public CIQMessageSubscribeNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CIQMessageSubscribeNotification.newBuilder();
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

        private CIQMessageSubscribeNotification() {
            this.lastEventId_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.lastEventId_ = "";
        }

        public static CIQMessageSubscribeNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDeviceMessages.internal_static_GDI_Proto_DeviceMessages_CIQMessageSubscribeNotification_descriptor;
        }

        public static Builder newBuilder(CIQMessageSubscribeNotification cIQMessageSubscribeNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cIQMessageSubscribeNotification);
        }

        public static CIQMessageSubscribeNotification parseDelimitedFrom(InputStream inputStream) {
            return (CIQMessageSubscribeNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CIQMessageSubscribeNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CIQMessageSubscribeNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CIQMessageSubscribeNotification)) {
                return super.equals(obj);
            }
            CIQMessageSubscribeNotification cIQMessageSubscribeNotification = (CIQMessageSubscribeNotification) obj;
            if (hasLastEventId() != cIQMessageSubscribeNotification.hasLastEventId()) {
                return false;
            }
            return (!hasLastEventId() || getLastEventId().equals(cIQMessageSubscribeNotification.getLastEventId())) && getUnknownFields().equals(cIQMessageSubscribeNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIDeviceMessages.CIQMessageSubscribeNotificationOrBuilder
        public String getLastEventId() {
            Object obj = this.lastEventId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.lastEventId_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIDeviceMessages.CIQMessageSubscribeNotificationOrBuilder
        public ByteString getLastEventIdBytes() {
            Object obj = this.lastEventId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.lastEventId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CIQMessageSubscribeNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.lastEventId_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDeviceMessages.CIQMessageSubscribeNotificationOrBuilder
        public boolean hasLastEventId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasLastEventId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getLastEventId().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDeviceMessages.internal_static_GDI_Proto_DeviceMessages_CIQMessageSubscribeNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(CIQMessageSubscribeNotification.class, Builder.class);
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
            return new CIQMessageSubscribeNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.lastEventId_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CIQMessageSubscribeNotificationOrBuilder {
            private int bitField0_;
            private Object lastEventId_;

            private Builder() {
                this.lastEventId_ = "";
            }

            private void buildPartial0(CIQMessageSubscribeNotification cIQMessageSubscribeNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    cIQMessageSubscribeNotification.lastEventId_ = this.lastEventId_;
                } else {
                    i14 = 0;
                }
                cIQMessageSubscribeNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDeviceMessages.internal_static_GDI_Proto_DeviceMessages_CIQMessageSubscribeNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CIQMessageSubscribeNotification build() {
                CIQMessageSubscribeNotification cIQMessageSubscribeNotificationBuildPartial = buildPartial();
                if (cIQMessageSubscribeNotificationBuildPartial.isInitialized()) {
                    return cIQMessageSubscribeNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) cIQMessageSubscribeNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CIQMessageSubscribeNotification buildPartial() {
                CIQMessageSubscribeNotification cIQMessageSubscribeNotification = new CIQMessageSubscribeNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(cIQMessageSubscribeNotification);
                }
                onBuilt();
                return cIQMessageSubscribeNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.lastEventId_ = "";
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLastEventId() {
                this.lastEventId_ = CIQMessageSubscribeNotification.getDefaultInstance().getLastEventId();
                this.bitField0_ &= -2;
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
                return GDIDeviceMessages.internal_static_GDI_Proto_DeviceMessages_CIQMessageSubscribeNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDeviceMessages.CIQMessageSubscribeNotificationOrBuilder
            public String getLastEventId() {
                Object obj = this.lastEventId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.lastEventId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDeviceMessages.CIQMessageSubscribeNotificationOrBuilder
            public ByteString getLastEventIdBytes() {
                Object obj = this.lastEventId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.lastEventId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIDeviceMessages.CIQMessageSubscribeNotificationOrBuilder
            public boolean hasLastEventId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDeviceMessages.internal_static_GDI_Proto_DeviceMessages_CIQMessageSubscribeNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(CIQMessageSubscribeNotification.class, Builder.class);
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
                                    this.lastEventId_ = codedInputStream.readBytes();
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

            public Builder setLastEventId(String str) {
                str.getClass();
                this.lastEventId_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setLastEventIdBytes(ByteString byteString) {
                byteString.getClass();
                this.lastEventId_ = byteString;
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
            public CIQMessageSubscribeNotification getDefaultInstanceForType() {
                return CIQMessageSubscribeNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.lastEventId_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CIQMessageSubscribeNotification) {
                    return mergeFrom((CIQMessageSubscribeNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CIQMessageSubscribeNotification cIQMessageSubscribeNotification) {
                if (cIQMessageSubscribeNotification == CIQMessageSubscribeNotification.getDefaultInstance()) {
                    return this;
                }
                if (cIQMessageSubscribeNotification.hasLastEventId()) {
                    this.lastEventId_ = cIQMessageSubscribeNotification.lastEventId_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                mergeUnknownFields(cIQMessageSubscribeNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CIQMessageSubscribeNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static CIQMessageSubscribeNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CIQMessageSubscribeNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CIQMessageSubscribeNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CIQMessageSubscribeNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CIQMessageSubscribeNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CIQMessageSubscribeNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private CIQMessageSubscribeNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.lastEventId_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CIQMessageSubscribeNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CIQMessageSubscribeNotification parseFrom(InputStream inputStream) {
            return (CIQMessageSubscribeNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ CIQMessageSubscribeNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CIQMessageSubscribeNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CIQMessageSubscribeNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CIQMessageSubscribeNotification parseFrom(CodedInputStream codedInputStream) {
            return (CIQMessageSubscribeNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CIQMessageSubscribeNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CIQMessageSubscribeNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DeviceMessageService extends GeneratedMessageV3 implements DeviceMessageServiceOrBuilder {
        public static final int MESSAGE_REQUEST_FIELD_NUMBER = 3;
        public static final int MESSAGE_RESPONSE_FIELD_NUMBER = 4;
        public static final int MESSAGE_SUBSCRIBE_FIELD_NUMBER = 1;
        public static final int MESSAGE_UNSUBSCRIBE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private CIQMessageRequest messageRequest_;
        private CIQMessageResponse messageResponse_;
        private CIQMessageSubscribeNotification messageSubscribe_;
        private CIQMessageUnsubscribeNotification messageUnsubscribe_;
        private static final DeviceMessageService DEFAULT_INSTANCE = new DeviceMessageService();

        @Deprecated
        public static final Parser<DeviceMessageService> PARSER = new AbstractParser<DeviceMessageService>() { // from class: com.garmin.proto.generated.GDIDeviceMessages.DeviceMessageService.1
            @Override // com.google.protobuf.Parser
            public DeviceMessageService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DeviceMessageService.newBuilder();
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

        private DeviceMessageService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DeviceMessageService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDeviceMessages.internal_static_GDI_Proto_DeviceMessages_DeviceMessageService_descriptor;
        }

        public static Builder newBuilder(DeviceMessageService deviceMessageService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(deviceMessageService);
        }

        public static DeviceMessageService parseDelimitedFrom(InputStream inputStream) {
            return (DeviceMessageService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DeviceMessageService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DeviceMessageService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeviceMessageService)) {
                return super.equals(obj);
            }
            DeviceMessageService deviceMessageService = (DeviceMessageService) obj;
            if (hasMessageSubscribe() != deviceMessageService.hasMessageSubscribe()) {
                return false;
            }
            if ((hasMessageSubscribe() && !getMessageSubscribe().equals(deviceMessageService.getMessageSubscribe())) || hasMessageUnsubscribe() != deviceMessageService.hasMessageUnsubscribe()) {
                return false;
            }
            if ((hasMessageUnsubscribe() && !getMessageUnsubscribe().equals(deviceMessageService.getMessageUnsubscribe())) || hasMessageRequest() != deviceMessageService.hasMessageRequest()) {
                return false;
            }
            if ((!hasMessageRequest() || getMessageRequest().equals(deviceMessageService.getMessageRequest())) && hasMessageResponse() == deviceMessageService.hasMessageResponse()) {
                return (!hasMessageResponse() || getMessageResponse().equals(deviceMessageService.getMessageResponse())) && getUnknownFields().equals(deviceMessageService.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDeviceMessages.DeviceMessageServiceOrBuilder
        public CIQMessageRequest getMessageRequest() {
            CIQMessageRequest cIQMessageRequest = this.messageRequest_;
            return cIQMessageRequest == null ? CIQMessageRequest.getDefaultInstance() : cIQMessageRequest;
        }

        @Override // com.garmin.proto.generated.GDIDeviceMessages.DeviceMessageServiceOrBuilder
        public CIQMessageRequestOrBuilder getMessageRequestOrBuilder() {
            CIQMessageRequest cIQMessageRequest = this.messageRequest_;
            return cIQMessageRequest == null ? CIQMessageRequest.getDefaultInstance() : cIQMessageRequest;
        }

        @Override // com.garmin.proto.generated.GDIDeviceMessages.DeviceMessageServiceOrBuilder
        public CIQMessageResponse getMessageResponse() {
            CIQMessageResponse cIQMessageResponse = this.messageResponse_;
            return cIQMessageResponse == null ? CIQMessageResponse.getDefaultInstance() : cIQMessageResponse;
        }

        @Override // com.garmin.proto.generated.GDIDeviceMessages.DeviceMessageServiceOrBuilder
        public CIQMessageResponseOrBuilder getMessageResponseOrBuilder() {
            CIQMessageResponse cIQMessageResponse = this.messageResponse_;
            return cIQMessageResponse == null ? CIQMessageResponse.getDefaultInstance() : cIQMessageResponse;
        }

        @Override // com.garmin.proto.generated.GDIDeviceMessages.DeviceMessageServiceOrBuilder
        public CIQMessageSubscribeNotification getMessageSubscribe() {
            CIQMessageSubscribeNotification cIQMessageSubscribeNotification = this.messageSubscribe_;
            return cIQMessageSubscribeNotification == null ? CIQMessageSubscribeNotification.getDefaultInstance() : cIQMessageSubscribeNotification;
        }

        @Override // com.garmin.proto.generated.GDIDeviceMessages.DeviceMessageServiceOrBuilder
        public CIQMessageSubscribeNotificationOrBuilder getMessageSubscribeOrBuilder() {
            CIQMessageSubscribeNotification cIQMessageSubscribeNotification = this.messageSubscribe_;
            return cIQMessageSubscribeNotification == null ? CIQMessageSubscribeNotification.getDefaultInstance() : cIQMessageSubscribeNotification;
        }

        @Override // com.garmin.proto.generated.GDIDeviceMessages.DeviceMessageServiceOrBuilder
        public CIQMessageUnsubscribeNotification getMessageUnsubscribe() {
            CIQMessageUnsubscribeNotification cIQMessageUnsubscribeNotification = this.messageUnsubscribe_;
            return cIQMessageUnsubscribeNotification == null ? CIQMessageUnsubscribeNotification.getDefaultInstance() : cIQMessageUnsubscribeNotification;
        }

        @Override // com.garmin.proto.generated.GDIDeviceMessages.DeviceMessageServiceOrBuilder
        public CIQMessageUnsubscribeNotificationOrBuilder getMessageUnsubscribeOrBuilder() {
            CIQMessageUnsubscribeNotification cIQMessageUnsubscribeNotification = this.messageUnsubscribe_;
            return cIQMessageUnsubscribeNotification == null ? CIQMessageUnsubscribeNotification.getDefaultInstance() : cIQMessageUnsubscribeNotification;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DeviceMessageService> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getMessageSubscribe()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getMessageUnsubscribe());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getMessageRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getMessageResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDeviceMessages.DeviceMessageServiceOrBuilder
        public boolean hasMessageRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDeviceMessages.DeviceMessageServiceOrBuilder
        public boolean hasMessageResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDeviceMessages.DeviceMessageServiceOrBuilder
        public boolean hasMessageSubscribe() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDeviceMessages.DeviceMessageServiceOrBuilder
        public boolean hasMessageUnsubscribe() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasMessageSubscribe()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getMessageSubscribe().hashCode();
            }
            if (hasMessageUnsubscribe()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getMessageUnsubscribe().hashCode();
            }
            if (hasMessageRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getMessageRequest().hashCode();
            }
            if (hasMessageResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getMessageResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDeviceMessages.internal_static_GDI_Proto_DeviceMessages_DeviceMessageService_fieldAccessorTable.ensureFieldAccessorsInitialized(DeviceMessageService.class, Builder.class);
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
            return new DeviceMessageService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getMessageSubscribe());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getMessageUnsubscribe());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getMessageRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getMessageResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DeviceMessageServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<CIQMessageRequest, CIQMessageRequest.Builder, CIQMessageRequestOrBuilder> messageRequestBuilder_;
            private CIQMessageRequest messageRequest_;
            private SingleFieldBuilderV3<CIQMessageResponse, CIQMessageResponse.Builder, CIQMessageResponseOrBuilder> messageResponseBuilder_;
            private CIQMessageResponse messageResponse_;
            private SingleFieldBuilderV3<CIQMessageSubscribeNotification, CIQMessageSubscribeNotification.Builder, CIQMessageSubscribeNotificationOrBuilder> messageSubscribeBuilder_;
            private CIQMessageSubscribeNotification messageSubscribe_;
            private SingleFieldBuilderV3<CIQMessageUnsubscribeNotification, CIQMessageUnsubscribeNotification.Builder, CIQMessageUnsubscribeNotificationOrBuilder> messageUnsubscribeBuilder_;
            private CIQMessageUnsubscribeNotification messageUnsubscribe_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(DeviceMessageService deviceMessageService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<CIQMessageSubscribeNotification, CIQMessageSubscribeNotification.Builder, CIQMessageSubscribeNotificationOrBuilder> singleFieldBuilderV3 = this.messageSubscribeBuilder_;
                    deviceMessageService.messageSubscribe_ = singleFieldBuilderV3 == null ? this.messageSubscribe_ : (CIQMessageSubscribeNotification) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<CIQMessageUnsubscribeNotification, CIQMessageUnsubscribeNotification.Builder, CIQMessageUnsubscribeNotificationOrBuilder> singleFieldBuilderV4 = this.messageUnsubscribeBuilder_;
                    deviceMessageService.messageUnsubscribe_ = singleFieldBuilderV4 == null ? this.messageUnsubscribe_ : (CIQMessageUnsubscribeNotification) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<CIQMessageRequest, CIQMessageRequest.Builder, CIQMessageRequestOrBuilder> singleFieldBuilderV5 = this.messageRequestBuilder_;
                    deviceMessageService.messageRequest_ = singleFieldBuilderV5 == null ? this.messageRequest_ : (CIQMessageRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<CIQMessageResponse, CIQMessageResponse.Builder, CIQMessageResponseOrBuilder> singleFieldBuilderV6 = this.messageResponseBuilder_;
                    deviceMessageService.messageResponse_ = singleFieldBuilderV6 == null ? this.messageResponse_ : (CIQMessageResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                deviceMessageService.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDeviceMessages.internal_static_GDI_Proto_DeviceMessages_DeviceMessageService_descriptor;
            }

            private SingleFieldBuilderV3<CIQMessageRequest, CIQMessageRequest.Builder, CIQMessageRequestOrBuilder> getMessageRequestFieldBuilder() {
                if (this.messageRequestBuilder_ == null) {
                    this.messageRequestBuilder_ = new SingleFieldBuilderV3<>(getMessageRequest(), getParentForChildren(), isClean());
                    this.messageRequest_ = null;
                }
                return this.messageRequestBuilder_;
            }

            private SingleFieldBuilderV3<CIQMessageResponse, CIQMessageResponse.Builder, CIQMessageResponseOrBuilder> getMessageResponseFieldBuilder() {
                if (this.messageResponseBuilder_ == null) {
                    this.messageResponseBuilder_ = new SingleFieldBuilderV3<>(getMessageResponse(), getParentForChildren(), isClean());
                    this.messageResponse_ = null;
                }
                return this.messageResponseBuilder_;
            }

            private SingleFieldBuilderV3<CIQMessageSubscribeNotification, CIQMessageSubscribeNotification.Builder, CIQMessageSubscribeNotificationOrBuilder> getMessageSubscribeFieldBuilder() {
                if (this.messageSubscribeBuilder_ == null) {
                    this.messageSubscribeBuilder_ = new SingleFieldBuilderV3<>(getMessageSubscribe(), getParentForChildren(), isClean());
                    this.messageSubscribe_ = null;
                }
                return this.messageSubscribeBuilder_;
            }

            private SingleFieldBuilderV3<CIQMessageUnsubscribeNotification, CIQMessageUnsubscribeNotification.Builder, CIQMessageUnsubscribeNotificationOrBuilder> getMessageUnsubscribeFieldBuilder() {
                if (this.messageUnsubscribeBuilder_ == null) {
                    this.messageUnsubscribeBuilder_ = new SingleFieldBuilderV3<>(getMessageUnsubscribe(), getParentForChildren(), isClean());
                    this.messageUnsubscribe_ = null;
                }
                return this.messageUnsubscribeBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getMessageSubscribeFieldBuilder();
                    getMessageUnsubscribeFieldBuilder();
                    getMessageRequestFieldBuilder();
                    getMessageResponseFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeviceMessageService build() {
                DeviceMessageService deviceMessageServiceBuildPartial = buildPartial();
                if (deviceMessageServiceBuildPartial.isInitialized()) {
                    return deviceMessageServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) deviceMessageServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeviceMessageService buildPartial() {
                DeviceMessageService deviceMessageService = new DeviceMessageService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(deviceMessageService);
                }
                onBuilt();
                return deviceMessageService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.messageSubscribe_ = null;
                SingleFieldBuilderV3<CIQMessageSubscribeNotification, CIQMessageSubscribeNotification.Builder, CIQMessageSubscribeNotificationOrBuilder> singleFieldBuilderV3 = this.messageSubscribeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.messageSubscribeBuilder_ = null;
                }
                this.messageUnsubscribe_ = null;
                SingleFieldBuilderV3<CIQMessageUnsubscribeNotification, CIQMessageUnsubscribeNotification.Builder, CIQMessageUnsubscribeNotificationOrBuilder> singleFieldBuilderV4 = this.messageUnsubscribeBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.messageUnsubscribeBuilder_ = null;
                }
                this.messageRequest_ = null;
                SingleFieldBuilderV3<CIQMessageRequest, CIQMessageRequest.Builder, CIQMessageRequestOrBuilder> singleFieldBuilderV5 = this.messageRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.messageRequestBuilder_ = null;
                }
                this.messageResponse_ = null;
                SingleFieldBuilderV3<CIQMessageResponse, CIQMessageResponse.Builder, CIQMessageResponseOrBuilder> singleFieldBuilderV6 = this.messageResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.messageResponseBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMessageRequest() {
                this.bitField0_ &= -5;
                this.messageRequest_ = null;
                SingleFieldBuilderV3<CIQMessageRequest, CIQMessageRequest.Builder, CIQMessageRequestOrBuilder> singleFieldBuilderV3 = this.messageRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.messageRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearMessageResponse() {
                this.bitField0_ &= -9;
                this.messageResponse_ = null;
                SingleFieldBuilderV3<CIQMessageResponse, CIQMessageResponse.Builder, CIQMessageResponseOrBuilder> singleFieldBuilderV3 = this.messageResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.messageResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearMessageSubscribe() {
                this.bitField0_ &= -2;
                this.messageSubscribe_ = null;
                SingleFieldBuilderV3<CIQMessageSubscribeNotification, CIQMessageSubscribeNotification.Builder, CIQMessageSubscribeNotificationOrBuilder> singleFieldBuilderV3 = this.messageSubscribeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.messageSubscribeBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearMessageUnsubscribe() {
                this.bitField0_ &= -3;
                this.messageUnsubscribe_ = null;
                SingleFieldBuilderV3<CIQMessageUnsubscribeNotification, CIQMessageUnsubscribeNotification.Builder, CIQMessageUnsubscribeNotificationOrBuilder> singleFieldBuilderV3 = this.messageUnsubscribeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.messageUnsubscribeBuilder_ = null;
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
                return GDIDeviceMessages.internal_static_GDI_Proto_DeviceMessages_DeviceMessageService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDeviceMessages.DeviceMessageServiceOrBuilder
            public CIQMessageRequest getMessageRequest() {
                SingleFieldBuilderV3<CIQMessageRequest, CIQMessageRequest.Builder, CIQMessageRequestOrBuilder> singleFieldBuilderV3 = this.messageRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CIQMessageRequest) singleFieldBuilderV3.getMessage();
                }
                CIQMessageRequest cIQMessageRequest = this.messageRequest_;
                return cIQMessageRequest == null ? CIQMessageRequest.getDefaultInstance() : cIQMessageRequest;
            }

            public CIQMessageRequest.Builder getMessageRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (CIQMessageRequest.Builder) getMessageRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDeviceMessages.DeviceMessageServiceOrBuilder
            public CIQMessageRequestOrBuilder getMessageRequestOrBuilder() {
                SingleFieldBuilderV3<CIQMessageRequest, CIQMessageRequest.Builder, CIQMessageRequestOrBuilder> singleFieldBuilderV3 = this.messageRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CIQMessageRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CIQMessageRequest cIQMessageRequest = this.messageRequest_;
                return cIQMessageRequest == null ? CIQMessageRequest.getDefaultInstance() : cIQMessageRequest;
            }

            @Override // com.garmin.proto.generated.GDIDeviceMessages.DeviceMessageServiceOrBuilder
            public CIQMessageResponse getMessageResponse() {
                SingleFieldBuilderV3<CIQMessageResponse, CIQMessageResponse.Builder, CIQMessageResponseOrBuilder> singleFieldBuilderV3 = this.messageResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CIQMessageResponse) singleFieldBuilderV3.getMessage();
                }
                CIQMessageResponse cIQMessageResponse = this.messageResponse_;
                return cIQMessageResponse == null ? CIQMessageResponse.getDefaultInstance() : cIQMessageResponse;
            }

            public CIQMessageResponse.Builder getMessageResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (CIQMessageResponse.Builder) getMessageResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDeviceMessages.DeviceMessageServiceOrBuilder
            public CIQMessageResponseOrBuilder getMessageResponseOrBuilder() {
                SingleFieldBuilderV3<CIQMessageResponse, CIQMessageResponse.Builder, CIQMessageResponseOrBuilder> singleFieldBuilderV3 = this.messageResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CIQMessageResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CIQMessageResponse cIQMessageResponse = this.messageResponse_;
                return cIQMessageResponse == null ? CIQMessageResponse.getDefaultInstance() : cIQMessageResponse;
            }

            @Override // com.garmin.proto.generated.GDIDeviceMessages.DeviceMessageServiceOrBuilder
            public CIQMessageSubscribeNotification getMessageSubscribe() {
                SingleFieldBuilderV3<CIQMessageSubscribeNotification, CIQMessageSubscribeNotification.Builder, CIQMessageSubscribeNotificationOrBuilder> singleFieldBuilderV3 = this.messageSubscribeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CIQMessageSubscribeNotification) singleFieldBuilderV3.getMessage();
                }
                CIQMessageSubscribeNotification cIQMessageSubscribeNotification = this.messageSubscribe_;
                return cIQMessageSubscribeNotification == null ? CIQMessageSubscribeNotification.getDefaultInstance() : cIQMessageSubscribeNotification;
            }

            public CIQMessageSubscribeNotification.Builder getMessageSubscribeBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (CIQMessageSubscribeNotification.Builder) getMessageSubscribeFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDeviceMessages.DeviceMessageServiceOrBuilder
            public CIQMessageSubscribeNotificationOrBuilder getMessageSubscribeOrBuilder() {
                SingleFieldBuilderV3<CIQMessageSubscribeNotification, CIQMessageSubscribeNotification.Builder, CIQMessageSubscribeNotificationOrBuilder> singleFieldBuilderV3 = this.messageSubscribeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CIQMessageSubscribeNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CIQMessageSubscribeNotification cIQMessageSubscribeNotification = this.messageSubscribe_;
                return cIQMessageSubscribeNotification == null ? CIQMessageSubscribeNotification.getDefaultInstance() : cIQMessageSubscribeNotification;
            }

            @Override // com.garmin.proto.generated.GDIDeviceMessages.DeviceMessageServiceOrBuilder
            public CIQMessageUnsubscribeNotification getMessageUnsubscribe() {
                SingleFieldBuilderV3<CIQMessageUnsubscribeNotification, CIQMessageUnsubscribeNotification.Builder, CIQMessageUnsubscribeNotificationOrBuilder> singleFieldBuilderV3 = this.messageUnsubscribeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CIQMessageUnsubscribeNotification) singleFieldBuilderV3.getMessage();
                }
                CIQMessageUnsubscribeNotification cIQMessageUnsubscribeNotification = this.messageUnsubscribe_;
                return cIQMessageUnsubscribeNotification == null ? CIQMessageUnsubscribeNotification.getDefaultInstance() : cIQMessageUnsubscribeNotification;
            }

            public CIQMessageUnsubscribeNotification.Builder getMessageUnsubscribeBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (CIQMessageUnsubscribeNotification.Builder) getMessageUnsubscribeFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDeviceMessages.DeviceMessageServiceOrBuilder
            public CIQMessageUnsubscribeNotificationOrBuilder getMessageUnsubscribeOrBuilder() {
                SingleFieldBuilderV3<CIQMessageUnsubscribeNotification, CIQMessageUnsubscribeNotification.Builder, CIQMessageUnsubscribeNotificationOrBuilder> singleFieldBuilderV3 = this.messageUnsubscribeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CIQMessageUnsubscribeNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CIQMessageUnsubscribeNotification cIQMessageUnsubscribeNotification = this.messageUnsubscribe_;
                return cIQMessageUnsubscribeNotification == null ? CIQMessageUnsubscribeNotification.getDefaultInstance() : cIQMessageUnsubscribeNotification;
            }

            @Override // com.garmin.proto.generated.GDIDeviceMessages.DeviceMessageServiceOrBuilder
            public boolean hasMessageRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDeviceMessages.DeviceMessageServiceOrBuilder
            public boolean hasMessageResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDeviceMessages.DeviceMessageServiceOrBuilder
            public boolean hasMessageSubscribe() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDeviceMessages.DeviceMessageServiceOrBuilder
            public boolean hasMessageUnsubscribe() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDeviceMessages.internal_static_GDI_Proto_DeviceMessages_DeviceMessageService_fieldAccessorTable.ensureFieldAccessorsInitialized(DeviceMessageService.class, Builder.class);
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
                                    codedInputStream.readMessage(getMessageSubscribeFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getMessageUnsubscribeFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getMessageRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getMessageResponseFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeMessageRequest(CIQMessageRequest cIQMessageRequest) {
                CIQMessageRequest cIQMessageRequest2;
                SingleFieldBuilderV3<CIQMessageRequest, CIQMessageRequest.Builder, CIQMessageRequestOrBuilder> singleFieldBuilderV3 = this.messageRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(cIQMessageRequest);
                } else if ((this.bitField0_ & 4) == 0 || (cIQMessageRequest2 = this.messageRequest_) == null || cIQMessageRequest2 == CIQMessageRequest.getDefaultInstance()) {
                    this.messageRequest_ = cIQMessageRequest;
                } else {
                    getMessageRequestBuilder().mergeFrom(cIQMessageRequest);
                }
                if (this.messageRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeMessageResponse(CIQMessageResponse cIQMessageResponse) {
                CIQMessageResponse cIQMessageResponse2;
                SingleFieldBuilderV3<CIQMessageResponse, CIQMessageResponse.Builder, CIQMessageResponseOrBuilder> singleFieldBuilderV3 = this.messageResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(cIQMessageResponse);
                } else if ((this.bitField0_ & 8) == 0 || (cIQMessageResponse2 = this.messageResponse_) == null || cIQMessageResponse2 == CIQMessageResponse.getDefaultInstance()) {
                    this.messageResponse_ = cIQMessageResponse;
                } else {
                    getMessageResponseBuilder().mergeFrom(cIQMessageResponse);
                }
                if (this.messageResponse_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeMessageSubscribe(CIQMessageSubscribeNotification cIQMessageSubscribeNotification) {
                CIQMessageSubscribeNotification cIQMessageSubscribeNotification2;
                SingleFieldBuilderV3<CIQMessageSubscribeNotification, CIQMessageSubscribeNotification.Builder, CIQMessageSubscribeNotificationOrBuilder> singleFieldBuilderV3 = this.messageSubscribeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(cIQMessageSubscribeNotification);
                } else if ((this.bitField0_ & 1) == 0 || (cIQMessageSubscribeNotification2 = this.messageSubscribe_) == null || cIQMessageSubscribeNotification2 == CIQMessageSubscribeNotification.getDefaultInstance()) {
                    this.messageSubscribe_ = cIQMessageSubscribeNotification;
                } else {
                    getMessageSubscribeBuilder().mergeFrom(cIQMessageSubscribeNotification);
                }
                if (this.messageSubscribe_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeMessageUnsubscribe(CIQMessageUnsubscribeNotification cIQMessageUnsubscribeNotification) {
                CIQMessageUnsubscribeNotification cIQMessageUnsubscribeNotification2;
                SingleFieldBuilderV3<CIQMessageUnsubscribeNotification, CIQMessageUnsubscribeNotification.Builder, CIQMessageUnsubscribeNotificationOrBuilder> singleFieldBuilderV3 = this.messageUnsubscribeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(cIQMessageUnsubscribeNotification);
                } else if ((this.bitField0_ & 2) == 0 || (cIQMessageUnsubscribeNotification2 = this.messageUnsubscribe_) == null || cIQMessageUnsubscribeNotification2 == CIQMessageUnsubscribeNotification.getDefaultInstance()) {
                    this.messageUnsubscribe_ = cIQMessageUnsubscribeNotification;
                } else {
                    getMessageUnsubscribeBuilder().mergeFrom(cIQMessageUnsubscribeNotification);
                }
                if (this.messageUnsubscribe_ != null) {
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

            public Builder setMessageRequest(CIQMessageRequest.Builder builder) {
                SingleFieldBuilderV3<CIQMessageRequest, CIQMessageRequest.Builder, CIQMessageRequestOrBuilder> singleFieldBuilderV3 = this.messageRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.messageRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setMessageResponse(CIQMessageResponse.Builder builder) {
                SingleFieldBuilderV3<CIQMessageResponse, CIQMessageResponse.Builder, CIQMessageResponseOrBuilder> singleFieldBuilderV3 = this.messageResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.messageResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setMessageSubscribe(CIQMessageSubscribeNotification.Builder builder) {
                SingleFieldBuilderV3<CIQMessageSubscribeNotification, CIQMessageSubscribeNotification.Builder, CIQMessageSubscribeNotificationOrBuilder> singleFieldBuilderV3 = this.messageSubscribeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.messageSubscribe_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setMessageUnsubscribe(CIQMessageUnsubscribeNotification.Builder builder) {
                SingleFieldBuilderV3<CIQMessageUnsubscribeNotification, CIQMessageUnsubscribeNotification.Builder, CIQMessageUnsubscribeNotificationOrBuilder> singleFieldBuilderV3 = this.messageUnsubscribeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.messageUnsubscribe_ = builder.build();
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
            public DeviceMessageService getDefaultInstanceForType() {
                return DeviceMessageService.getDefaultInstance();
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

            public Builder setMessageRequest(CIQMessageRequest cIQMessageRequest) {
                SingleFieldBuilderV3<CIQMessageRequest, CIQMessageRequest.Builder, CIQMessageRequestOrBuilder> singleFieldBuilderV3 = this.messageRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    cIQMessageRequest.getClass();
                    this.messageRequest_ = cIQMessageRequest;
                } else {
                    singleFieldBuilderV3.setMessage(cIQMessageRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setMessageResponse(CIQMessageResponse cIQMessageResponse) {
                SingleFieldBuilderV3<CIQMessageResponse, CIQMessageResponse.Builder, CIQMessageResponseOrBuilder> singleFieldBuilderV3 = this.messageResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    cIQMessageResponse.getClass();
                    this.messageResponse_ = cIQMessageResponse;
                } else {
                    singleFieldBuilderV3.setMessage(cIQMessageResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setMessageSubscribe(CIQMessageSubscribeNotification cIQMessageSubscribeNotification) {
                SingleFieldBuilderV3<CIQMessageSubscribeNotification, CIQMessageSubscribeNotification.Builder, CIQMessageSubscribeNotificationOrBuilder> singleFieldBuilderV3 = this.messageSubscribeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    cIQMessageSubscribeNotification.getClass();
                    this.messageSubscribe_ = cIQMessageSubscribeNotification;
                } else {
                    singleFieldBuilderV3.setMessage(cIQMessageSubscribeNotification);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setMessageUnsubscribe(CIQMessageUnsubscribeNotification cIQMessageUnsubscribeNotification) {
                SingleFieldBuilderV3<CIQMessageUnsubscribeNotification, CIQMessageUnsubscribeNotification.Builder, CIQMessageUnsubscribeNotificationOrBuilder> singleFieldBuilderV3 = this.messageUnsubscribeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    cIQMessageUnsubscribeNotification.getClass();
                    this.messageUnsubscribe_ = cIQMessageUnsubscribeNotification;
                } else {
                    singleFieldBuilderV3.setMessage(cIQMessageUnsubscribeNotification);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DeviceMessageService) {
                    return mergeFrom((DeviceMessageService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DeviceMessageService deviceMessageService) {
                if (deviceMessageService == DeviceMessageService.getDefaultInstance()) {
                    return this;
                }
                if (deviceMessageService.hasMessageSubscribe()) {
                    mergeMessageSubscribe(deviceMessageService.getMessageSubscribe());
                }
                if (deviceMessageService.hasMessageUnsubscribe()) {
                    mergeMessageUnsubscribe(deviceMessageService.getMessageUnsubscribe());
                }
                if (deviceMessageService.hasMessageRequest()) {
                    mergeMessageRequest(deviceMessageService.getMessageRequest());
                }
                if (deviceMessageService.hasMessageResponse()) {
                    mergeMessageResponse(deviceMessageService.getMessageResponse());
                }
                mergeUnknownFields(deviceMessageService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DeviceMessageService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ DeviceMessageService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private DeviceMessageService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DeviceMessageService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceMessageService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeviceMessageService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DeviceMessageService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DeviceMessageService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DeviceMessageService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DeviceMessageService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DeviceMessageService parseFrom(InputStream inputStream) {
            return (DeviceMessageService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DeviceMessageService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceMessageService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeviceMessageService parseFrom(CodedInputStream codedInputStream) {
            return (DeviceMessageService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DeviceMessageService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeviceMessageService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
