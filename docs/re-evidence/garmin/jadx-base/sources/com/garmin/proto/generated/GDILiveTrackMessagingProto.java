package com.garmin.proto.generated;

import com.garmin.android.apps.connectmobile.f3;
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
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ProtocolStringList;
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

/* JADX INFO: loaded from: classes6.dex */
public final class GDILiveTrackMessagingProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001bGDILiveTrackMessaging.proto\u0012\u001cGDI.Proto.LiveTrackMessaging\"¯\u0003\n\u0019LiveTrackMessagingService\u0012b\n\u001fsend_live_track_message_request\u0018\u0001 \u0001(\u000b29.GDI.Proto.LiveTrackMessaging.SendLiveTrackMessageRequest\u0012d\n send_live_track_message_response\u0018\u0002 \u0001(\u000b2:.GDI.Proto.LiveTrackMessaging.SendLiveTrackMessageResponse\u0012b\n\u001fget_live_track_messages_request\u0018\u0003 \u0001(\u000b29.GDI.Proto.LiveTrackMessaging.GetLiveTrackMessagesRequest\u0012d\n get_live_track_messages_response\u0018\u0004 \u0001(\u000b2:.GDI.Proto.LiveTrackMessaging.GetLiveTrackMessagesResponse\"\u0091\u0001\n\u001bSendLiveTrackMessageRequest\u0012\u001d\n\u0015recipient_session_ids\u0018\u0001 \u0003(\t\u0012S\n\u0017live_track_message_body\u0018\u0002 \u0002(\u000b22.GDI.Proto.LiveTrackMessaging.LiveTrackMessageBody\"·\u0003\n\u001cSendLiveTrackMessageResponse\u0012}\n\u001esend_live_track_message_status\u0018\u0001 \u0001(\u000e2U.GDI.Proto.LiveTrackMessaging.SendLiveTrackMessageResponse.SendLiveTrackMessageStatus\u0012_\n\u001esend_live_track_message_errors\u0018\u0002 \u0003(\u000b27.GDI.Proto.LiveTrackMessaging.SendLiveTrackMessageError\"¶\u0001\n\u001aSendLiveTrackMessageStatus\u0012\u0006\n\u0002OK\u0010\u0000\u0012\u0011\n\rUNKNOWN_ERROR\u0010\u0001\u0012\u0013\n\u000fNETWORK_FAILURE\u0010\u0002\u0012\u000b\n\u0007TIMEOUT\u0010\u0003\u0012\u0010\n\fSERVER_ERROR\u0010\u0004\u0012\u001b\n\u0017INVALID_SERVER_RESPONSE\u0010\u0005\u0012\u0015\n\u0011NOT_LIVE_TRACKING\u0010\u0006\u0012\u0015\n\u0011EMPTY_SESSION_IDS\u0010\u0007\"é\u0002\n\u0019SendLiveTrackMessageError\u0012\u0013\n\u000bsession_ids\u0018\u0001 \u0003(\t\u0012x\n\u001dlive_track_message_error_type\u0018\u0002 \u0002(\u000e2Q.GDI.Proto.LiveTrackMessaging.SendLiveTrackMessageError.LiveTrackMessageErrorType\u0012\u001a\n\u0012error_message_text\u0018\u0003 \u0001(\t\" \u0001\n\u0019LiveTrackMessageErrorType\u0012\u0011\n\rUNKNOWN_ERROR\u0010\u0000\u0012\u001a\n\u0016SENDER_SESSION_INVALID\u0010\u0001\u0012\u0018\n\u0014SENDER_SESSION_ENDED\u0010\u0002\u0012\u001d\n\u0019RECIPIENT_SESSION_INVALID\u0010\u0003\u0012\u001b\n\u0017RECIPIENT_SESSION_ENDED\u0010\u0004\"K\n\u001bGetLiveTrackMessagesRequest\u0012,\n!last_received_tracker_message_seq\u0018\u0001 \u0001(\u0004:\u00010\"£\u0003\n\u001cGetLiveTrackMessagesResponse\u0012}\n\u001eget_live_track_messages_status\u0018\u0001 \u0002(\u000e2U.GDI.Proto.LiveTrackMessaging.GetLiveTrackMessagesResponse.GetLiveTrackMessagesStatus\u0012K\n\u0013live_track_messages\u0018\u0002 \u0003(\u000b2..GDI.Proto.LiveTrackMessaging.LiveTrackMessage\u0012\u0015\n\rcall_interval\u0018\u0003 \u0001(\r\"\u009f\u0001\n\u001aGetLiveTrackMessagesStatus\u0012\u0006\n\u0002OK\u0010\u0000\u0012\u0011\n\rUNKNOWN_ERROR\u0010\u0001\u0012\u0013\n\u000fNETWORK_FAILURE\u0010\u0002\u0012\u000b\n\u0007TIMEOUT\u0010\u0003\u0012\u0010\n\fSERVER_ERROR\u0010\u0004\u0012\u001b\n\u0017INVALID_SERVER_RESPONSE\u0010\u0005\u0012\u0015\n\u0011NOT_LIVE_TRACKING\u0010\u0006\"¼\u0001\n\u0010LiveTrackMessage\u0012\u0019\n\u0011sender_session_id\u0018\u0001 \u0002(\t\u0012\u001b\n\u0013sender_display_name\u0018\u0002 \u0002(\t\u0012\u001b\n\u0013tracker_message_seq\u0018\u0003 \u0002(\u0004\u0012S\n\u0017live_track_message_body\u0018\u0004 \u0002(\u000b22.GDI.Proto.LiveTrackMessaging.LiveTrackMessageBody\"S\n\u0014LiveTrackMessageBody\u0012\u0012\n\nmessage_id\u0018\u0001 \u0002(\u0004\u0012\u0014\n\fmessage_text\u0018\u0002 \u0002(\t\u0012\u0011\n\ttimestamp\u0018\u0003 \u0002(\u0004B:\n\u001acom.garmin.proto.generatedB\u001aGDILiveTrackMessagingProtoH\u0003"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LiveTrackMessaging_GetLiveTrackMessagesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LiveTrackMessaging_GetLiveTrackMessagesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LiveTrackMessaging_GetLiveTrackMessagesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LiveTrackMessaging_GetLiveTrackMessagesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LiveTrackMessaging_LiveTrackMessageBody_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LiveTrackMessaging_LiveTrackMessageBody_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LiveTrackMessaging_LiveTrackMessage_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LiveTrackMessaging_LiveTrackMessage_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LiveTrackMessaging_LiveTrackMessagingService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LiveTrackMessaging_LiveTrackMessagingService_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LiveTrackMessaging_SendLiveTrackMessageError_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LiveTrackMessaging_SendLiveTrackMessageError_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LiveTrackMessaging_SendLiveTrackMessageRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LiveTrackMessaging_SendLiveTrackMessageRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_LiveTrackMessaging_SendLiveTrackMessageResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_LiveTrackMessaging_SendLiveTrackMessageResponse_fieldAccessorTable;

    public interface GetLiveTrackMessagesRequestOrBuilder extends MessageOrBuilder {
        long getLastReceivedTrackerMessageSeq();

        boolean hasLastReceivedTrackerMessageSeq();
    }

    public interface GetLiveTrackMessagesResponseOrBuilder extends MessageOrBuilder {
        int getCallInterval();

        GetLiveTrackMessagesResponse.GetLiveTrackMessagesStatus getGetLiveTrackMessagesStatus();

        LiveTrackMessage getLiveTrackMessages(int i14);

        int getLiveTrackMessagesCount();

        List<LiveTrackMessage> getLiveTrackMessagesList();

        LiveTrackMessageOrBuilder getLiveTrackMessagesOrBuilder(int i14);

        List<? extends LiveTrackMessageOrBuilder> getLiveTrackMessagesOrBuilderList();

        boolean hasCallInterval();

        boolean hasGetLiveTrackMessagesStatus();
    }

    public interface LiveTrackMessageBodyOrBuilder extends MessageOrBuilder {
        long getMessageId();

        String getMessageText();

        ByteString getMessageTextBytes();

        long getTimestamp();

        boolean hasMessageId();

        boolean hasMessageText();

        boolean hasTimestamp();
    }

    public interface LiveTrackMessageOrBuilder extends MessageOrBuilder {
        LiveTrackMessageBody getLiveTrackMessageBody();

        LiveTrackMessageBodyOrBuilder getLiveTrackMessageBodyOrBuilder();

        String getSenderDisplayName();

        ByteString getSenderDisplayNameBytes();

        String getSenderSessionId();

        ByteString getSenderSessionIdBytes();

        long getTrackerMessageSeq();

        boolean hasLiveTrackMessageBody();

        boolean hasSenderDisplayName();

        boolean hasSenderSessionId();

        boolean hasTrackerMessageSeq();
    }

    public interface LiveTrackMessagingServiceOrBuilder extends MessageOrBuilder {
        GetLiveTrackMessagesRequest getGetLiveTrackMessagesRequest();

        GetLiveTrackMessagesRequestOrBuilder getGetLiveTrackMessagesRequestOrBuilder();

        GetLiveTrackMessagesResponse getGetLiveTrackMessagesResponse();

        GetLiveTrackMessagesResponseOrBuilder getGetLiveTrackMessagesResponseOrBuilder();

        SendLiveTrackMessageRequest getSendLiveTrackMessageRequest();

        SendLiveTrackMessageRequestOrBuilder getSendLiveTrackMessageRequestOrBuilder();

        SendLiveTrackMessageResponse getSendLiveTrackMessageResponse();

        SendLiveTrackMessageResponseOrBuilder getSendLiveTrackMessageResponseOrBuilder();

        boolean hasGetLiveTrackMessagesRequest();

        boolean hasGetLiveTrackMessagesResponse();

        boolean hasSendLiveTrackMessageRequest();

        boolean hasSendLiveTrackMessageResponse();
    }

    public interface SendLiveTrackMessageErrorOrBuilder extends MessageOrBuilder {
        String getErrorMessageText();

        ByteString getErrorMessageTextBytes();

        SendLiveTrackMessageError.LiveTrackMessageErrorType getLiveTrackMessageErrorType();

        String getSessionIds(int i14);

        ByteString getSessionIdsBytes(int i14);

        int getSessionIdsCount();

        List<String> getSessionIdsList();

        boolean hasErrorMessageText();

        boolean hasLiveTrackMessageErrorType();
    }

    public interface SendLiveTrackMessageRequestOrBuilder extends MessageOrBuilder {
        LiveTrackMessageBody getLiveTrackMessageBody();

        LiveTrackMessageBodyOrBuilder getLiveTrackMessageBodyOrBuilder();

        String getRecipientSessionIds(int i14);

        ByteString getRecipientSessionIdsBytes(int i14);

        int getRecipientSessionIdsCount();

        List<String> getRecipientSessionIdsList();

        boolean hasLiveTrackMessageBody();
    }

    public interface SendLiveTrackMessageResponseOrBuilder extends MessageOrBuilder {
        SendLiveTrackMessageError getSendLiveTrackMessageErrors(int i14);

        int getSendLiveTrackMessageErrorsCount();

        List<SendLiveTrackMessageError> getSendLiveTrackMessageErrorsList();

        SendLiveTrackMessageErrorOrBuilder getSendLiveTrackMessageErrorsOrBuilder(int i14);

        List<? extends SendLiveTrackMessageErrorOrBuilder> getSendLiveTrackMessageErrorsOrBuilderList();

        SendLiveTrackMessageResponse.SendLiveTrackMessageStatus getSendLiveTrackMessageStatus();

        boolean hasSendLiveTrackMessageStatus();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_LiveTrackMessaging_LiveTrackMessagingService_descriptor = descriptor2;
        internal_static_GDI_Proto_LiveTrackMessaging_LiveTrackMessagingService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"SendLiveTrackMessageRequest", "SendLiveTrackMessageResponse", "GetLiveTrackMessagesRequest", "GetLiveTrackMessagesResponse"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_LiveTrackMessaging_SendLiveTrackMessageRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_LiveTrackMessaging_SendLiveTrackMessageRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"RecipientSessionIds", "LiveTrackMessageBody"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_LiveTrackMessaging_SendLiveTrackMessageResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_LiveTrackMessaging_SendLiveTrackMessageResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"SendLiveTrackMessageStatus", "SendLiveTrackMessageErrors"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_LiveTrackMessaging_SendLiveTrackMessageError_descriptor = descriptor5;
        internal_static_GDI_Proto_LiveTrackMessaging_SendLiveTrackMessageError_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"SessionIds", "LiveTrackMessageErrorType", "ErrorMessageText"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_LiveTrackMessaging_GetLiveTrackMessagesRequest_descriptor = descriptor6;
        internal_static_GDI_Proto_LiveTrackMessaging_GetLiveTrackMessagesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"LastReceivedTrackerMessageSeq"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_LiveTrackMessaging_GetLiveTrackMessagesResponse_descriptor = descriptor7;
        internal_static_GDI_Proto_LiveTrackMessaging_GetLiveTrackMessagesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"GetLiveTrackMessagesStatus", "LiveTrackMessages", "CallInterval"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_LiveTrackMessaging_LiveTrackMessage_descriptor = descriptor8;
        internal_static_GDI_Proto_LiveTrackMessaging_LiveTrackMessage_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"SenderSessionId", "SenderDisplayName", "TrackerMessageSeq", "LiveTrackMessageBody"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_LiveTrackMessaging_LiveTrackMessageBody_descriptor = descriptor9;
        internal_static_GDI_Proto_LiveTrackMessaging_LiveTrackMessageBody_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"MessageId", "MessageText", "Timestamp"});
    }

    private GDILiveTrackMessagingProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class GetLiveTrackMessagesRequest extends GeneratedMessageV3 implements GetLiveTrackMessagesRequestOrBuilder {
        public static final int LAST_RECEIVED_TRACKER_MESSAGE_SEQ_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private long lastReceivedTrackerMessageSeq_;
        private byte memoizedIsInitialized;
        private static final GetLiveTrackMessagesRequest DEFAULT_INSTANCE = new GetLiveTrackMessagesRequest();

        @Deprecated
        public static final Parser<GetLiveTrackMessagesRequest> PARSER = new AbstractParser<GetLiveTrackMessagesRequest>() { // from class: com.garmin.proto.generated.GDILiveTrackMessagingProto.GetLiveTrackMessagesRequest.1
            @Override // com.google.protobuf.Parser
            public GetLiveTrackMessagesRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GetLiveTrackMessagesRequest.newBuilder();
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

        private GetLiveTrackMessagesRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.lastReceivedTrackerMessageSeq_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetLiveTrackMessagesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_GetLiveTrackMessagesRequest_descriptor;
        }

        public static Builder newBuilder(GetLiveTrackMessagesRequest getLiveTrackMessagesRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getLiveTrackMessagesRequest);
        }

        public static GetLiveTrackMessagesRequest parseDelimitedFrom(InputStream inputStream) {
            return (GetLiveTrackMessagesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetLiveTrackMessagesRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GetLiveTrackMessagesRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetLiveTrackMessagesRequest)) {
                return super.equals(obj);
            }
            GetLiveTrackMessagesRequest getLiveTrackMessagesRequest = (GetLiveTrackMessagesRequest) obj;
            if (hasLastReceivedTrackerMessageSeq() != getLiveTrackMessagesRequest.hasLastReceivedTrackerMessageSeq()) {
                return false;
            }
            return (!hasLastReceivedTrackerMessageSeq() || getLastReceivedTrackerMessageSeq() == getLiveTrackMessagesRequest.getLastReceivedTrackerMessageSeq()) && getUnknownFields().equals(getLiveTrackMessagesRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.GetLiveTrackMessagesRequestOrBuilder
        public long getLastReceivedTrackerMessageSeq() {
            return this.lastReceivedTrackerMessageSeq_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GetLiveTrackMessagesRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt64Size(1, this.lastReceivedTrackerMessageSeq_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.GetLiveTrackMessagesRequestOrBuilder
        public boolean hasLastReceivedTrackerMessageSeq() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasLastReceivedTrackerMessageSeq()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashLong(getLastReceivedTrackerMessageSeq());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_GetLiveTrackMessagesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetLiveTrackMessagesRequest.class, Builder.class);
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
            return new GetLiveTrackMessagesRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt64(1, this.lastReceivedTrackerMessageSeq_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetLiveTrackMessagesRequestOrBuilder {
            private int bitField0_;
            private long lastReceivedTrackerMessageSeq_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(GetLiveTrackMessagesRequest getLiveTrackMessagesRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    getLiveTrackMessagesRequest.lastReceivedTrackerMessageSeq_ = this.lastReceivedTrackerMessageSeq_;
                } else {
                    i14 = 0;
                }
                getLiveTrackMessagesRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_GetLiveTrackMessagesRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetLiveTrackMessagesRequest build() {
                GetLiveTrackMessagesRequest getLiveTrackMessagesRequestBuildPartial = buildPartial();
                if (getLiveTrackMessagesRequestBuildPartial.isInitialized()) {
                    return getLiveTrackMessagesRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) getLiveTrackMessagesRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetLiveTrackMessagesRequest buildPartial() {
                GetLiveTrackMessagesRequest getLiveTrackMessagesRequest = new GetLiveTrackMessagesRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(getLiveTrackMessagesRequest);
                }
                onBuilt();
                return getLiveTrackMessagesRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.lastReceivedTrackerMessageSeq_ = 0L;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLastReceivedTrackerMessageSeq() {
                this.bitField0_ &= -2;
                this.lastReceivedTrackerMessageSeq_ = 0L;
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
                return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_GetLiveTrackMessagesRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.GetLiveTrackMessagesRequestOrBuilder
            public long getLastReceivedTrackerMessageSeq() {
                return this.lastReceivedTrackerMessageSeq_;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.GetLiveTrackMessagesRequestOrBuilder
            public boolean hasLastReceivedTrackerMessageSeq() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_GetLiveTrackMessagesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetLiveTrackMessagesRequest.class, Builder.class);
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
                                    this.lastReceivedTrackerMessageSeq_ = codedInputStream.readUInt64();
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

            public Builder setLastReceivedTrackerMessageSeq(long j8) {
                this.lastReceivedTrackerMessageSeq_ = j8;
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

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            private Builder() {
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public GetLiveTrackMessagesRequest getDefaultInstanceForType() {
                return GetLiveTrackMessagesRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GetLiveTrackMessagesRequest) {
                    return mergeFrom((GetLiveTrackMessagesRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GetLiveTrackMessagesRequest getLiveTrackMessagesRequest) {
                if (getLiveTrackMessagesRequest == GetLiveTrackMessagesRequest.getDefaultInstance()) {
                    return this;
                }
                if (getLiveTrackMessagesRequest.hasLastReceivedTrackerMessageSeq()) {
                    setLastReceivedTrackerMessageSeq(getLiveTrackMessagesRequest.getLastReceivedTrackerMessageSeq());
                }
                mergeUnknownFields(getLiveTrackMessagesRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GetLiveTrackMessagesRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static GetLiveTrackMessagesRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetLiveTrackMessagesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetLiveTrackMessagesRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GetLiveTrackMessagesRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public /* synthetic */ GetLiveTrackMessagesRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetLiveTrackMessagesRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private GetLiveTrackMessagesRequest() {
            this.lastReceivedTrackerMessageSeq_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetLiveTrackMessagesRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GetLiveTrackMessagesRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GetLiveTrackMessagesRequest parseFrom(InputStream inputStream) {
            return (GetLiveTrackMessagesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GetLiveTrackMessagesRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetLiveTrackMessagesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetLiveTrackMessagesRequest parseFrom(CodedInputStream codedInputStream) {
            return (GetLiveTrackMessagesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GetLiveTrackMessagesRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetLiveTrackMessagesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class GetLiveTrackMessagesResponse extends GeneratedMessageV3 implements GetLiveTrackMessagesResponseOrBuilder {
        public static final int CALL_INTERVAL_FIELD_NUMBER = 3;
        public static final int GET_LIVE_TRACK_MESSAGES_STATUS_FIELD_NUMBER = 1;
        public static final int LIVE_TRACK_MESSAGES_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int callInterval_;
        private int getLiveTrackMessagesStatus_;
        private List<LiveTrackMessage> liveTrackMessages_;
        private byte memoizedIsInitialized;
        private static final GetLiveTrackMessagesResponse DEFAULT_INSTANCE = new GetLiveTrackMessagesResponse();

        @Deprecated
        public static final Parser<GetLiveTrackMessagesResponse> PARSER = new AbstractParser<GetLiveTrackMessagesResponse>() { // from class: com.garmin.proto.generated.GDILiveTrackMessagingProto.GetLiveTrackMessagesResponse.1
            @Override // com.google.protobuf.Parser
            public GetLiveTrackMessagesResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GetLiveTrackMessagesResponse.newBuilder();
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

        private GetLiveTrackMessagesResponse() {
            this.callInterval_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.getLiveTrackMessagesStatus_ = 0;
            this.liveTrackMessages_ = Collections.EMPTY_LIST;
        }

        public static GetLiveTrackMessagesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_GetLiveTrackMessagesResponse_descriptor;
        }

        public static Builder newBuilder(GetLiveTrackMessagesResponse getLiveTrackMessagesResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getLiveTrackMessagesResponse);
        }

        public static GetLiveTrackMessagesResponse parseDelimitedFrom(InputStream inputStream) {
            return (GetLiveTrackMessagesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetLiveTrackMessagesResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GetLiveTrackMessagesResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetLiveTrackMessagesResponse)) {
                return super.equals(obj);
            }
            GetLiveTrackMessagesResponse getLiveTrackMessagesResponse = (GetLiveTrackMessagesResponse) obj;
            if (hasGetLiveTrackMessagesStatus() != getLiveTrackMessagesResponse.hasGetLiveTrackMessagesStatus()) {
                return false;
            }
            if ((!hasGetLiveTrackMessagesStatus() || this.getLiveTrackMessagesStatus_ == getLiveTrackMessagesResponse.getLiveTrackMessagesStatus_) && getLiveTrackMessagesList().equals(getLiveTrackMessagesResponse.getLiveTrackMessagesList()) && hasCallInterval() == getLiveTrackMessagesResponse.hasCallInterval()) {
                return (!hasCallInterval() || getCallInterval() == getLiveTrackMessagesResponse.getCallInterval()) && getUnknownFields().equals(getLiveTrackMessagesResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.GetLiveTrackMessagesResponseOrBuilder
        public int getCallInterval() {
            return this.callInterval_;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.GetLiveTrackMessagesResponseOrBuilder
        public GetLiveTrackMessagesStatus getGetLiveTrackMessagesStatus() {
            GetLiveTrackMessagesStatus getLiveTrackMessagesStatusForNumber = GetLiveTrackMessagesStatus.forNumber(this.getLiveTrackMessagesStatus_);
            return getLiveTrackMessagesStatusForNumber == null ? GetLiveTrackMessagesStatus.OK : getLiveTrackMessagesStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.GetLiveTrackMessagesResponseOrBuilder
        public LiveTrackMessage getLiveTrackMessages(int i14) {
            return this.liveTrackMessages_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.GetLiveTrackMessagesResponseOrBuilder
        public int getLiveTrackMessagesCount() {
            return this.liveTrackMessages_.size();
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.GetLiveTrackMessagesResponseOrBuilder
        public List<LiveTrackMessage> getLiveTrackMessagesList() {
            return this.liveTrackMessages_;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.GetLiveTrackMessagesResponseOrBuilder
        public LiveTrackMessageOrBuilder getLiveTrackMessagesOrBuilder(int i14) {
            return this.liveTrackMessages_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.GetLiveTrackMessagesResponseOrBuilder
        public List<? extends LiveTrackMessageOrBuilder> getLiveTrackMessagesOrBuilderList() {
            return this.liveTrackMessages_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GetLiveTrackMessagesResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.getLiveTrackMessagesStatus_) : 0;
            for (int i15 = 0; i15 < this.liveTrackMessages_.size(); i15++) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, this.liveTrackMessages_.get(i15));
            }
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(3, this.callInterval_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.GetLiveTrackMessagesResponseOrBuilder
        public boolean hasCallInterval() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.GetLiveTrackMessagesResponseOrBuilder
        public boolean hasGetLiveTrackMessagesStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasGetLiveTrackMessagesStatus()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.getLiveTrackMessagesStatus_;
            }
            if (getLiveTrackMessagesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getLiveTrackMessagesList().hashCode();
            }
            if (hasCallInterval()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getCallInterval();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_GetLiveTrackMessagesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetLiveTrackMessagesResponse.class, Builder.class);
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
            if (!hasGetLiveTrackMessagesStatus()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i14 = 0; i14 < getLiveTrackMessagesCount(); i14++) {
                if (!getLiveTrackMessages(i14).isInitialized()) {
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
            return new GetLiveTrackMessagesResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.getLiveTrackMessagesStatus_);
            }
            for (int i14 = 0; i14 < this.liveTrackMessages_.size(); i14++) {
                codedOutputStream.writeMessage(2, this.liveTrackMessages_.get(i14));
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(3, this.callInterval_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetLiveTrackMessagesResponseOrBuilder {
            private int bitField0_;
            private int callInterval_;
            private int getLiveTrackMessagesStatus_;
            private RepeatedFieldBuilderV3<LiveTrackMessage, LiveTrackMessage.Builder, LiveTrackMessageOrBuilder> liveTrackMessagesBuilder_;
            private List<LiveTrackMessage> liveTrackMessages_;

            private Builder() {
                this.getLiveTrackMessagesStatus_ = 0;
                this.liveTrackMessages_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(GetLiveTrackMessagesResponse getLiveTrackMessagesResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    getLiveTrackMessagesResponse.getLiveTrackMessagesStatus_ = this.getLiveTrackMessagesStatus_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 4) != 0) {
                    getLiveTrackMessagesResponse.callInterval_ = this.callInterval_;
                    i14 |= 2;
                }
                getLiveTrackMessagesResponse.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(GetLiveTrackMessagesResponse getLiveTrackMessagesResponse) {
                RepeatedFieldBuilderV3<LiveTrackMessage, LiveTrackMessage.Builder, LiveTrackMessageOrBuilder> repeatedFieldBuilderV3 = this.liveTrackMessagesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    getLiveTrackMessagesResponse.liveTrackMessages_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 2) != 0) {
                    this.liveTrackMessages_ = Collections.unmodifiableList(this.liveTrackMessages_);
                    this.bitField0_ &= -3;
                }
                getLiveTrackMessagesResponse.liveTrackMessages_ = this.liveTrackMessages_;
            }

            private void ensureLiveTrackMessagesIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.liveTrackMessages_ = new ArrayList(this.liveTrackMessages_);
                    this.bitField0_ |= 2;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_GetLiveTrackMessagesResponse_descriptor;
            }

            private RepeatedFieldBuilderV3<LiveTrackMessage, LiveTrackMessage.Builder, LiveTrackMessageOrBuilder> getLiveTrackMessagesFieldBuilder() {
                if (this.liveTrackMessagesBuilder_ == null) {
                    this.liveTrackMessagesBuilder_ = new RepeatedFieldBuilderV3<>(this.liveTrackMessages_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.liveTrackMessages_ = null;
                }
                return this.liveTrackMessagesBuilder_;
            }

            public Builder addAllLiveTrackMessages(Iterable<? extends LiveTrackMessage> iterable) {
                RepeatedFieldBuilderV3<LiveTrackMessage, LiveTrackMessage.Builder, LiveTrackMessageOrBuilder> repeatedFieldBuilderV3 = this.liveTrackMessagesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureLiveTrackMessagesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.liveTrackMessages_);
                onChanged();
                return this;
            }

            public Builder addLiveTrackMessages(LiveTrackMessage.Builder builder) {
                RepeatedFieldBuilderV3<LiveTrackMessage, LiveTrackMessage.Builder, LiveTrackMessageOrBuilder> repeatedFieldBuilderV3 = this.liveTrackMessagesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureLiveTrackMessagesIsMutable();
                this.liveTrackMessages_.add(builder.build());
                onChanged();
                return this;
            }

            public LiveTrackMessage.Builder addLiveTrackMessagesBuilder() {
                return (LiveTrackMessage.Builder) getLiveTrackMessagesFieldBuilder().addBuilder(LiveTrackMessage.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetLiveTrackMessagesResponse build() {
                GetLiveTrackMessagesResponse getLiveTrackMessagesResponseBuildPartial = buildPartial();
                if (getLiveTrackMessagesResponseBuildPartial.isInitialized()) {
                    return getLiveTrackMessagesResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) getLiveTrackMessagesResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetLiveTrackMessagesResponse buildPartial() {
                GetLiveTrackMessagesResponse getLiveTrackMessagesResponse = new GetLiveTrackMessagesResponse(this);
                buildPartialRepeatedFields(getLiveTrackMessagesResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(getLiveTrackMessagesResponse);
                }
                onBuilt();
                return getLiveTrackMessagesResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.getLiveTrackMessagesStatus_ = 0;
                RepeatedFieldBuilderV3<LiveTrackMessage, LiveTrackMessage.Builder, LiveTrackMessageOrBuilder> repeatedFieldBuilderV3 = this.liveTrackMessagesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.liveTrackMessages_ = Collections.EMPTY_LIST;
                } else {
                    this.liveTrackMessages_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -3;
                this.callInterval_ = 0;
                return this;
            }

            public Builder clearCallInterval() {
                this.bitField0_ &= -5;
                this.callInterval_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGetLiveTrackMessagesStatus() {
                this.bitField0_ &= -2;
                this.getLiveTrackMessagesStatus_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLiveTrackMessages() {
                RepeatedFieldBuilderV3<LiveTrackMessage, LiveTrackMessage.Builder, LiveTrackMessageOrBuilder> repeatedFieldBuilderV3 = this.liveTrackMessagesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.liveTrackMessages_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
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

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.GetLiveTrackMessagesResponseOrBuilder
            public int getCallInterval() {
                return this.callInterval_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_GetLiveTrackMessagesResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.GetLiveTrackMessagesResponseOrBuilder
            public GetLiveTrackMessagesStatus getGetLiveTrackMessagesStatus() {
                GetLiveTrackMessagesStatus getLiveTrackMessagesStatusForNumber = GetLiveTrackMessagesStatus.forNumber(this.getLiveTrackMessagesStatus_);
                return getLiveTrackMessagesStatusForNumber == null ? GetLiveTrackMessagesStatus.OK : getLiveTrackMessagesStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.GetLiveTrackMessagesResponseOrBuilder
            public LiveTrackMessage getLiveTrackMessages(int i14) {
                RepeatedFieldBuilderV3<LiveTrackMessage, LiveTrackMessage.Builder, LiveTrackMessageOrBuilder> repeatedFieldBuilderV3 = this.liveTrackMessagesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.liveTrackMessages_.get(i14) : (LiveTrackMessage) repeatedFieldBuilderV3.getMessage(i14);
            }

            public LiveTrackMessage.Builder getLiveTrackMessagesBuilder(int i14) {
                return (LiveTrackMessage.Builder) getLiveTrackMessagesFieldBuilder().getBuilder(i14);
            }

            public List<LiveTrackMessage.Builder> getLiveTrackMessagesBuilderList() {
                return getLiveTrackMessagesFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.GetLiveTrackMessagesResponseOrBuilder
            public int getLiveTrackMessagesCount() {
                RepeatedFieldBuilderV3<LiveTrackMessage, LiveTrackMessage.Builder, LiveTrackMessageOrBuilder> repeatedFieldBuilderV3 = this.liveTrackMessagesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.liveTrackMessages_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.GetLiveTrackMessagesResponseOrBuilder
            public List<LiveTrackMessage> getLiveTrackMessagesList() {
                RepeatedFieldBuilderV3<LiveTrackMessage, LiveTrackMessage.Builder, LiveTrackMessageOrBuilder> repeatedFieldBuilderV3 = this.liveTrackMessagesBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.liveTrackMessages_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.GetLiveTrackMessagesResponseOrBuilder
            public LiveTrackMessageOrBuilder getLiveTrackMessagesOrBuilder(int i14) {
                RepeatedFieldBuilderV3<LiveTrackMessage, LiveTrackMessage.Builder, LiveTrackMessageOrBuilder> repeatedFieldBuilderV3 = this.liveTrackMessagesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.liveTrackMessages_.get(i14) : (LiveTrackMessageOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.GetLiveTrackMessagesResponseOrBuilder
            public List<? extends LiveTrackMessageOrBuilder> getLiveTrackMessagesOrBuilderList() {
                RepeatedFieldBuilderV3<LiveTrackMessage, LiveTrackMessage.Builder, LiveTrackMessageOrBuilder> repeatedFieldBuilderV3 = this.liveTrackMessagesBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.liveTrackMessages_);
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.GetLiveTrackMessagesResponseOrBuilder
            public boolean hasCallInterval() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.GetLiveTrackMessagesResponseOrBuilder
            public boolean hasGetLiveTrackMessagesStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_GetLiveTrackMessagesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetLiveTrackMessagesResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasGetLiveTrackMessagesStatus()) {
                    return false;
                }
                for (int i14 = 0; i14 < getLiveTrackMessagesCount(); i14++) {
                    if (!getLiveTrackMessages(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(GetLiveTrackMessagesResponse getLiveTrackMessagesResponse) {
                if (getLiveTrackMessagesResponse == GetLiveTrackMessagesResponse.getDefaultInstance()) {
                    return this;
                }
                if (getLiveTrackMessagesResponse.hasGetLiveTrackMessagesStatus()) {
                    setGetLiveTrackMessagesStatus(getLiveTrackMessagesResponse.getGetLiveTrackMessagesStatus());
                }
                if (this.liveTrackMessagesBuilder_ == null) {
                    if (!getLiveTrackMessagesResponse.liveTrackMessages_.isEmpty()) {
                        if (this.liveTrackMessages_.isEmpty()) {
                            this.liveTrackMessages_ = getLiveTrackMessagesResponse.liveTrackMessages_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureLiveTrackMessagesIsMutable();
                            this.liveTrackMessages_.addAll(getLiveTrackMessagesResponse.liveTrackMessages_);
                        }
                        onChanged();
                    }
                } else if (!getLiveTrackMessagesResponse.liveTrackMessages_.isEmpty()) {
                    boolean zIsEmpty = this.liveTrackMessagesBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<LiveTrackMessage, LiveTrackMessage.Builder, LiveTrackMessageOrBuilder> repeatedFieldBuilderV3 = this.liveTrackMessagesBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.liveTrackMessagesBuilder_ = null;
                        this.liveTrackMessages_ = getLiveTrackMessagesResponse.liveTrackMessages_;
                        this.bitField0_ &= -3;
                        this.liveTrackMessagesBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getLiveTrackMessagesFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(getLiveTrackMessagesResponse.liveTrackMessages_);
                    }
                }
                if (getLiveTrackMessagesResponse.hasCallInterval()) {
                    setCallInterval(getLiveTrackMessagesResponse.getCallInterval());
                }
                mergeUnknownFields(getLiveTrackMessagesResponse.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeLiveTrackMessages(int i14) {
                RepeatedFieldBuilderV3<LiveTrackMessage, LiveTrackMessage.Builder, LiveTrackMessageOrBuilder> repeatedFieldBuilderV3 = this.liveTrackMessagesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureLiveTrackMessagesIsMutable();
                this.liveTrackMessages_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setCallInterval(int i14) {
                this.callInterval_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setGetLiveTrackMessagesStatus(GetLiveTrackMessagesStatus getLiveTrackMessagesStatus) {
                getLiveTrackMessagesStatus.getClass();
                this.bitField0_ |= 1;
                this.getLiveTrackMessagesStatus_ = getLiveTrackMessagesStatus.getNumber();
                onChanged();
                return this;
            }

            public Builder setLiveTrackMessages(int i14, LiveTrackMessage.Builder builder) {
                RepeatedFieldBuilderV3<LiveTrackMessage, LiveTrackMessage.Builder, LiveTrackMessageOrBuilder> repeatedFieldBuilderV3 = this.liveTrackMessagesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureLiveTrackMessagesIsMutable();
                this.liveTrackMessages_.set(i14, builder.build());
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
            public GetLiveTrackMessagesResponse getDefaultInstanceForType() {
                return GetLiveTrackMessagesResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.getLiveTrackMessagesStatus_ = 0;
                this.liveTrackMessages_ = Collections.EMPTY_LIST;
            }

            public LiveTrackMessage.Builder addLiveTrackMessagesBuilder(int i14) {
                return (LiveTrackMessage.Builder) getLiveTrackMessagesFieldBuilder().addBuilder(i14, LiveTrackMessage.getDefaultInstance());
            }

            public Builder addLiveTrackMessages(int i14, LiveTrackMessage liveTrackMessage) {
                RepeatedFieldBuilderV3<LiveTrackMessage, LiveTrackMessage.Builder, LiveTrackMessageOrBuilder> repeatedFieldBuilderV3 = this.liveTrackMessagesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    liveTrackMessage.getClass();
                    ensureLiveTrackMessagesIsMutable();
                    this.liveTrackMessages_.add(i14, liveTrackMessage);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, liveTrackMessage);
                return this;
            }

            public Builder setLiveTrackMessages(int i14, LiveTrackMessage liveTrackMessage) {
                RepeatedFieldBuilderV3<LiveTrackMessage, LiveTrackMessage.Builder, LiveTrackMessageOrBuilder> repeatedFieldBuilderV3 = this.liveTrackMessagesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    liveTrackMessage.getClass();
                    ensureLiveTrackMessagesIsMutable();
                    this.liveTrackMessages_.set(i14, liveTrackMessage);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, liveTrackMessage);
                return this;
            }

            public Builder addLiveTrackMessages(LiveTrackMessage liveTrackMessage) {
                RepeatedFieldBuilderV3<LiveTrackMessage, LiveTrackMessage.Builder, LiveTrackMessageOrBuilder> repeatedFieldBuilderV3 = this.liveTrackMessagesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    liveTrackMessage.getClass();
                    ensureLiveTrackMessagesIsMutable();
                    this.liveTrackMessages_.add(liveTrackMessage);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(liveTrackMessage);
                return this;
            }

            public Builder addLiveTrackMessages(int i14, LiveTrackMessage.Builder builder) {
                RepeatedFieldBuilderV3<LiveTrackMessage, LiveTrackMessage.Builder, LiveTrackMessageOrBuilder> repeatedFieldBuilderV3 = this.liveTrackMessagesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureLiveTrackMessagesIsMutable();
                    this.liveTrackMessages_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GetLiveTrackMessagesResponse) {
                    return mergeFrom((GetLiveTrackMessagesResponse) message);
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
                                    if (GetLiveTrackMessagesStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.getLiveTrackMessagesStatus_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    LiveTrackMessage liveTrackMessage = (LiveTrackMessage) codedInputStream.readMessage(LiveTrackMessage.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<LiveTrackMessage, LiveTrackMessage.Builder, LiveTrackMessageOrBuilder> repeatedFieldBuilderV3 = this.liveTrackMessagesBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureLiveTrackMessagesIsMutable();
                                        this.liveTrackMessages_.add(liveTrackMessage);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(liveTrackMessage);
                                    }
                                } else if (tag != 24) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.callInterval_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
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
        public GetLiveTrackMessagesResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static GetLiveTrackMessagesResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetLiveTrackMessagesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetLiveTrackMessagesResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GetLiveTrackMessagesResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetLiveTrackMessagesResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GetLiveTrackMessagesResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GetLiveTrackMessagesResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GetLiveTrackMessagesResponse parseFrom(InputStream inputStream) {
            return (GetLiveTrackMessagesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private GetLiveTrackMessagesResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.getLiveTrackMessagesStatus_ = 0;
            this.callInterval_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetLiveTrackMessagesResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetLiveTrackMessagesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetLiveTrackMessagesResponse parseFrom(CodedInputStream codedInputStream) {
            return (GetLiveTrackMessagesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public /* synthetic */ GetLiveTrackMessagesResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static GetLiveTrackMessagesResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetLiveTrackMessagesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum GetLiveTrackMessagesStatus implements ProtocolMessageEnum {
            OK(0),
            UNKNOWN_ERROR(1),
            NETWORK_FAILURE(2),
            TIMEOUT(3),
            SERVER_ERROR(4),
            INVALID_SERVER_RESPONSE(5),
            NOT_LIVE_TRACKING(6);

            public static final int INVALID_SERVER_RESPONSE_VALUE = 5;
            public static final int NETWORK_FAILURE_VALUE = 2;
            public static final int NOT_LIVE_TRACKING_VALUE = 6;
            public static final int OK_VALUE = 0;
            public static final int SERVER_ERROR_VALUE = 4;
            public static final int TIMEOUT_VALUE = 3;
            public static final int UNKNOWN_ERROR_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<GetLiveTrackMessagesStatus> internalValueMap = new Internal.EnumLiteMap<GetLiveTrackMessagesStatus>() { // from class: com.garmin.proto.generated.GDILiveTrackMessagingProto.GetLiveTrackMessagesResponse.GetLiveTrackMessagesStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public GetLiveTrackMessagesStatus findValueByNumber(int i14) {
                    return GetLiveTrackMessagesStatus.forNumber(i14);
                }
            };
            private static final GetLiveTrackMessagesStatus[] VALUES = values();

            GetLiveTrackMessagesStatus(int i14) {
                this.value = i14;
            }

            public static GetLiveTrackMessagesStatus forNumber(int i14) {
                switch (i14) {
                    case 0:
                        return OK;
                    case 1:
                        return UNKNOWN_ERROR;
                    case 2:
                        return NETWORK_FAILURE;
                    case 3:
                        return TIMEOUT;
                    case 4:
                        return SERVER_ERROR;
                    case 5:
                        return INVALID_SERVER_RESPONSE;
                    case 6:
                        return NOT_LIVE_TRACKING;
                    default:
                        return null;
                }
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return GetLiveTrackMessagesResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<GetLiveTrackMessagesStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static GetLiveTrackMessagesStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static GetLiveTrackMessagesStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class LiveTrackMessage extends GeneratedMessageV3 implements LiveTrackMessageOrBuilder {
        public static final int LIVE_TRACK_MESSAGE_BODY_FIELD_NUMBER = 4;
        public static final int SENDER_DISPLAY_NAME_FIELD_NUMBER = 2;
        public static final int SENDER_SESSION_ID_FIELD_NUMBER = 1;
        public static final int TRACKER_MESSAGE_SEQ_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private LiveTrackMessageBody liveTrackMessageBody_;
        private byte memoizedIsInitialized;
        private volatile Object senderDisplayName_;
        private volatile Object senderSessionId_;
        private long trackerMessageSeq_;
        private static final LiveTrackMessage DEFAULT_INSTANCE = new LiveTrackMessage();

        @Deprecated
        public static final Parser<LiveTrackMessage> PARSER = new AbstractParser<LiveTrackMessage>() { // from class: com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessage.1
            @Override // com.google.protobuf.Parser
            public LiveTrackMessage parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LiveTrackMessage.newBuilder();
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

        private LiveTrackMessage() {
            this.senderSessionId_ = "";
            this.senderDisplayName_ = "";
            this.trackerMessageSeq_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
            this.senderSessionId_ = "";
            this.senderDisplayName_ = "";
        }

        public static LiveTrackMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_LiveTrackMessage_descriptor;
        }

        public static Builder newBuilder(LiveTrackMessage liveTrackMessage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(liveTrackMessage);
        }

        public static LiveTrackMessage parseDelimitedFrom(InputStream inputStream) {
            return (LiveTrackMessage) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LiveTrackMessage parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LiveTrackMessage> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LiveTrackMessage)) {
                return super.equals(obj);
            }
            LiveTrackMessage liveTrackMessage = (LiveTrackMessage) obj;
            if (hasSenderSessionId() != liveTrackMessage.hasSenderSessionId()) {
                return false;
            }
            if ((hasSenderSessionId() && !getSenderSessionId().equals(liveTrackMessage.getSenderSessionId())) || hasSenderDisplayName() != liveTrackMessage.hasSenderDisplayName()) {
                return false;
            }
            if ((hasSenderDisplayName() && !getSenderDisplayName().equals(liveTrackMessage.getSenderDisplayName())) || hasTrackerMessageSeq() != liveTrackMessage.hasTrackerMessageSeq()) {
                return false;
            }
            if ((!hasTrackerMessageSeq() || getTrackerMessageSeq() == liveTrackMessage.getTrackerMessageSeq()) && hasLiveTrackMessageBody() == liveTrackMessage.hasLiveTrackMessageBody()) {
                return (!hasLiveTrackMessageBody() || getLiveTrackMessageBody().equals(liveTrackMessage.getLiveTrackMessageBody())) && getUnknownFields().equals(liveTrackMessage.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessageOrBuilder
        public LiveTrackMessageBody getLiveTrackMessageBody() {
            LiveTrackMessageBody liveTrackMessageBody = this.liveTrackMessageBody_;
            return liveTrackMessageBody == null ? LiveTrackMessageBody.getDefaultInstance() : liveTrackMessageBody;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessageOrBuilder
        public LiveTrackMessageBodyOrBuilder getLiveTrackMessageBodyOrBuilder() {
            LiveTrackMessageBody liveTrackMessageBody = this.liveTrackMessageBody_;
            return liveTrackMessageBody == null ? LiveTrackMessageBody.getDefaultInstance() : liveTrackMessageBody;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LiveTrackMessage> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessageOrBuilder
        public String getSenderDisplayName() {
            Object obj = this.senderDisplayName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.senderDisplayName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessageOrBuilder
        public ByteString getSenderDisplayNameBytes() {
            Object obj = this.senderDisplayName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.senderDisplayName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessageOrBuilder
        public String getSenderSessionId() {
            Object obj = this.senderSessionId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.senderSessionId_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessageOrBuilder
        public ByteString getSenderSessionIdBytes() {
            Object obj = this.senderSessionId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.senderSessionId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.senderSessionId_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.senderDisplayName_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt64Size(3, this.trackerMessageSeq_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(4, getLiveTrackMessageBody());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessageOrBuilder
        public long getTrackerMessageSeq() {
            return this.trackerMessageSeq_;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessageOrBuilder
        public boolean hasLiveTrackMessageBody() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessageOrBuilder
        public boolean hasSenderDisplayName() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessageOrBuilder
        public boolean hasSenderSessionId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessageOrBuilder
        public boolean hasTrackerMessageSeq() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSenderSessionId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSenderSessionId().hashCode();
            }
            if (hasSenderDisplayName()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSenderDisplayName().hashCode();
            }
            if (hasTrackerMessageSeq()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashLong(getTrackerMessageSeq());
            }
            if (hasLiveTrackMessageBody()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getLiveTrackMessageBody().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_LiveTrackMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(LiveTrackMessage.class, Builder.class);
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
            if (!hasSenderSessionId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasSenderDisplayName()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasTrackerMessageSeq()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasLiveTrackMessageBody()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (getLiveTrackMessageBody().isInitialized()) {
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
            return new LiveTrackMessage();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.senderSessionId_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.senderDisplayName_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt64(3, this.trackerMessageSeq_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getLiveTrackMessageBody());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LiveTrackMessageOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<LiveTrackMessageBody, LiveTrackMessageBody.Builder, LiveTrackMessageBodyOrBuilder> liveTrackMessageBodyBuilder_;
            private LiveTrackMessageBody liveTrackMessageBody_;
            private Object senderDisplayName_;
            private Object senderSessionId_;
            private long trackerMessageSeq_;

            private Builder() {
                this.senderSessionId_ = "";
                this.senderDisplayName_ = "";
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(LiveTrackMessage liveTrackMessage) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    liveTrackMessage.senderSessionId_ = this.senderSessionId_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    liveTrackMessage.senderDisplayName_ = this.senderDisplayName_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    liveTrackMessage.trackerMessageSeq_ = this.trackerMessageSeq_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<LiveTrackMessageBody, LiveTrackMessageBody.Builder, LiveTrackMessageBodyOrBuilder> singleFieldBuilderV3 = this.liveTrackMessageBodyBuilder_;
                    liveTrackMessage.liveTrackMessageBody_ = singleFieldBuilderV3 == null ? this.liveTrackMessageBody_ : (LiveTrackMessageBody) singleFieldBuilderV3.build();
                    i14 |= 8;
                }
                liveTrackMessage.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_LiveTrackMessage_descriptor;
            }

            private SingleFieldBuilderV3<LiveTrackMessageBody, LiveTrackMessageBody.Builder, LiveTrackMessageBodyOrBuilder> getLiveTrackMessageBodyFieldBuilder() {
                if (this.liveTrackMessageBodyBuilder_ == null) {
                    this.liveTrackMessageBodyBuilder_ = new SingleFieldBuilderV3<>(getLiveTrackMessageBody(), getParentForChildren(), isClean());
                    this.liveTrackMessageBody_ = null;
                }
                return this.liveTrackMessageBodyBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getLiveTrackMessageBodyFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LiveTrackMessage build() {
                LiveTrackMessage liveTrackMessageBuildPartial = buildPartial();
                if (liveTrackMessageBuildPartial.isInitialized()) {
                    return liveTrackMessageBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) liveTrackMessageBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LiveTrackMessage buildPartial() {
                LiveTrackMessage liveTrackMessage = new LiveTrackMessage(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(liveTrackMessage);
                }
                onBuilt();
                return liveTrackMessage;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.senderSessionId_ = "";
                this.senderDisplayName_ = "";
                this.trackerMessageSeq_ = 0L;
                this.liveTrackMessageBody_ = null;
                SingleFieldBuilderV3<LiveTrackMessageBody, LiveTrackMessageBody.Builder, LiveTrackMessageBodyOrBuilder> singleFieldBuilderV3 = this.liveTrackMessageBodyBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.liveTrackMessageBodyBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLiveTrackMessageBody() {
                this.bitField0_ &= -9;
                this.liveTrackMessageBody_ = null;
                SingleFieldBuilderV3<LiveTrackMessageBody, LiveTrackMessageBody.Builder, LiveTrackMessageBodyOrBuilder> singleFieldBuilderV3 = this.liveTrackMessageBodyBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.liveTrackMessageBodyBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSenderDisplayName() {
                this.senderDisplayName_ = LiveTrackMessage.getDefaultInstance().getSenderDisplayName();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearSenderSessionId() {
                this.senderSessionId_ = LiveTrackMessage.getDefaultInstance().getSenderSessionId();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearTrackerMessageSeq() {
                this.bitField0_ &= -5;
                this.trackerMessageSeq_ = 0L;
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
                return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_LiveTrackMessage_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessageOrBuilder
            public LiveTrackMessageBody getLiveTrackMessageBody() {
                SingleFieldBuilderV3<LiveTrackMessageBody, LiveTrackMessageBody.Builder, LiveTrackMessageBodyOrBuilder> singleFieldBuilderV3 = this.liveTrackMessageBodyBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LiveTrackMessageBody) singleFieldBuilderV3.getMessage();
                }
                LiveTrackMessageBody liveTrackMessageBody = this.liveTrackMessageBody_;
                return liveTrackMessageBody == null ? LiveTrackMessageBody.getDefaultInstance() : liveTrackMessageBody;
            }

            public LiveTrackMessageBody.Builder getLiveTrackMessageBodyBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (LiveTrackMessageBody.Builder) getLiveTrackMessageBodyFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessageOrBuilder
            public LiveTrackMessageBodyOrBuilder getLiveTrackMessageBodyOrBuilder() {
                SingleFieldBuilderV3<LiveTrackMessageBody, LiveTrackMessageBody.Builder, LiveTrackMessageBodyOrBuilder> singleFieldBuilderV3 = this.liveTrackMessageBodyBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LiveTrackMessageBodyOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LiveTrackMessageBody liveTrackMessageBody = this.liveTrackMessageBody_;
                return liveTrackMessageBody == null ? LiveTrackMessageBody.getDefaultInstance() : liveTrackMessageBody;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessageOrBuilder
            public String getSenderDisplayName() {
                Object obj = this.senderDisplayName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.senderDisplayName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessageOrBuilder
            public ByteString getSenderDisplayNameBytes() {
                Object obj = this.senderDisplayName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.senderDisplayName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessageOrBuilder
            public String getSenderSessionId() {
                Object obj = this.senderSessionId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.senderSessionId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessageOrBuilder
            public ByteString getSenderSessionIdBytes() {
                Object obj = this.senderSessionId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.senderSessionId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessageOrBuilder
            public long getTrackerMessageSeq() {
                return this.trackerMessageSeq_;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessageOrBuilder
            public boolean hasLiveTrackMessageBody() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessageOrBuilder
            public boolean hasSenderDisplayName() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessageOrBuilder
            public boolean hasSenderSessionId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessageOrBuilder
            public boolean hasTrackerMessageSeq() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_LiveTrackMessage_fieldAccessorTable.ensureFieldAccessorsInitialized(LiveTrackMessage.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasSenderSessionId() && hasSenderDisplayName() && hasTrackerMessageSeq() && hasLiveTrackMessageBody() && getLiveTrackMessageBody().isInitialized();
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
                                    this.senderSessionId_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.senderDisplayName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.trackerMessageSeq_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getLiveTrackMessageBodyFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeLiveTrackMessageBody(LiveTrackMessageBody liveTrackMessageBody) {
                LiveTrackMessageBody liveTrackMessageBody2;
                SingleFieldBuilderV3<LiveTrackMessageBody, LiveTrackMessageBody.Builder, LiveTrackMessageBodyOrBuilder> singleFieldBuilderV3 = this.liveTrackMessageBodyBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(liveTrackMessageBody);
                } else if ((this.bitField0_ & 8) == 0 || (liveTrackMessageBody2 = this.liveTrackMessageBody_) == null || liveTrackMessageBody2 == LiveTrackMessageBody.getDefaultInstance()) {
                    this.liveTrackMessageBody_ = liveTrackMessageBody;
                } else {
                    getLiveTrackMessageBodyBuilder().mergeFrom(liveTrackMessageBody);
                }
                if (this.liveTrackMessageBody_ != null) {
                    this.bitField0_ |= 8;
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

            public Builder setLiveTrackMessageBody(LiveTrackMessageBody.Builder builder) {
                SingleFieldBuilderV3<LiveTrackMessageBody, LiveTrackMessageBody.Builder, LiveTrackMessageBodyOrBuilder> singleFieldBuilderV3 = this.liveTrackMessageBodyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.liveTrackMessageBody_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSenderDisplayName(String str) {
                str.getClass();
                this.senderDisplayName_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSenderDisplayNameBytes(ByteString byteString) {
                byteString.getClass();
                this.senderDisplayName_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSenderSessionId(String str) {
                str.getClass();
                this.senderSessionId_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSenderSessionIdBytes(ByteString byteString) {
                byteString.getClass();
                this.senderSessionId_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTrackerMessageSeq(long j8) {
                this.trackerMessageSeq_ = j8;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public LiveTrackMessage getDefaultInstanceForType() {
                return LiveTrackMessage.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.senderSessionId_ = "";
                this.senderDisplayName_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder setLiveTrackMessageBody(LiveTrackMessageBody liveTrackMessageBody) {
                SingleFieldBuilderV3<LiveTrackMessageBody, LiveTrackMessageBody.Builder, LiveTrackMessageBodyOrBuilder> singleFieldBuilderV3 = this.liveTrackMessageBodyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    liveTrackMessageBody.getClass();
                    this.liveTrackMessageBody_ = liveTrackMessageBody;
                } else {
                    singleFieldBuilderV3.setMessage(liveTrackMessageBody);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LiveTrackMessage) {
                    return mergeFrom((LiveTrackMessage) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LiveTrackMessage liveTrackMessage) {
                if (liveTrackMessage == LiveTrackMessage.getDefaultInstance()) {
                    return this;
                }
                if (liveTrackMessage.hasSenderSessionId()) {
                    this.senderSessionId_ = liveTrackMessage.senderSessionId_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (liveTrackMessage.hasSenderDisplayName()) {
                    this.senderDisplayName_ = liveTrackMessage.senderDisplayName_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (liveTrackMessage.hasTrackerMessageSeq()) {
                    setTrackerMessageSeq(liveTrackMessage.getTrackerMessageSeq());
                }
                if (liveTrackMessage.hasLiveTrackMessageBody()) {
                    mergeLiveTrackMessageBody(liveTrackMessage.getLiveTrackMessageBody());
                }
                mergeUnknownFields(liveTrackMessage.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LiveTrackMessage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static LiveTrackMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LiveTrackMessage) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LiveTrackMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LiveTrackMessage parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveTrackMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LiveTrackMessage parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LiveTrackMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LiveTrackMessage parseFrom(InputStream inputStream) {
            return (LiveTrackMessage) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LiveTrackMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LiveTrackMessage) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LiveTrackMessage parseFrom(CodedInputStream codedInputStream) {
            return (LiveTrackMessage) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LiveTrackMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LiveTrackMessage) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private LiveTrackMessage(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.senderSessionId_ = "";
            this.senderDisplayName_ = "";
            this.trackerMessageSeq_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ LiveTrackMessage(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class LiveTrackMessageBody extends GeneratedMessageV3 implements LiveTrackMessageBodyOrBuilder {
        public static final int MESSAGE_ID_FIELD_NUMBER = 1;
        public static final int MESSAGE_TEXT_FIELD_NUMBER = 2;
        public static final int TIMESTAMP_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private long messageId_;
        private volatile Object messageText_;
        private long timestamp_;
        private static final LiveTrackMessageBody DEFAULT_INSTANCE = new LiveTrackMessageBody();

        @Deprecated
        public static final Parser<LiveTrackMessageBody> PARSER = new AbstractParser<LiveTrackMessageBody>() { // from class: com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessageBody.1
            @Override // com.google.protobuf.Parser
            public LiveTrackMessageBody parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LiveTrackMessageBody.newBuilder();
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

        private LiveTrackMessageBody() {
            this.messageId_ = 0L;
            this.messageText_ = "";
            this.timestamp_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
            this.messageText_ = "";
        }

        public static LiveTrackMessageBody getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_LiveTrackMessageBody_descriptor;
        }

        public static Builder newBuilder(LiveTrackMessageBody liveTrackMessageBody) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(liveTrackMessageBody);
        }

        public static LiveTrackMessageBody parseDelimitedFrom(InputStream inputStream) {
            return (LiveTrackMessageBody) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LiveTrackMessageBody parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LiveTrackMessageBody> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LiveTrackMessageBody)) {
                return super.equals(obj);
            }
            LiveTrackMessageBody liveTrackMessageBody = (LiveTrackMessageBody) obj;
            if (hasMessageId() != liveTrackMessageBody.hasMessageId()) {
                return false;
            }
            if ((hasMessageId() && getMessageId() != liveTrackMessageBody.getMessageId()) || hasMessageText() != liveTrackMessageBody.hasMessageText()) {
                return false;
            }
            if ((!hasMessageText() || getMessageText().equals(liveTrackMessageBody.getMessageText())) && hasTimestamp() == liveTrackMessageBody.hasTimestamp()) {
                return (!hasTimestamp() || getTimestamp() == liveTrackMessageBody.getTimestamp()) && getUnknownFields().equals(liveTrackMessageBody.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessageBodyOrBuilder
        public long getMessageId() {
            return this.messageId_;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessageBodyOrBuilder
        public String getMessageText() {
            Object obj = this.messageText_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.messageText_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessageBodyOrBuilder
        public ByteString getMessageTextBytes() {
            Object obj = this.messageText_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.messageText_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LiveTrackMessageBody> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt64Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt64Size(1, this.messageId_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt64Size += GeneratedMessageV3.computeStringSize(2, this.messageText_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt64Size += CodedOutputStream.computeUInt64Size(3, this.timestamp_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt64Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessageBodyOrBuilder
        public long getTimestamp() {
            return this.timestamp_;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessageBodyOrBuilder
        public boolean hasMessageId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessageBodyOrBuilder
        public boolean hasMessageText() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessageBodyOrBuilder
        public boolean hasTimestamp() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasMessageId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashLong(getMessageId());
            }
            if (hasMessageText()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getMessageText().hashCode();
            }
            if (hasTimestamp()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashLong(getTimestamp());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_LiveTrackMessageBody_fieldAccessorTable.ensureFieldAccessorsInitialized(LiveTrackMessageBody.class, Builder.class);
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
            if (!hasMessageId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasMessageText()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasTimestamp()) {
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
            return new LiveTrackMessageBody();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt64(1, this.messageId_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.messageText_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt64(3, this.timestamp_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LiveTrackMessageBodyOrBuilder {
            private int bitField0_;
            private long messageId_;
            private Object messageText_;
            private long timestamp_;

            private Builder() {
                this.messageText_ = "";
            }

            private void buildPartial0(LiveTrackMessageBody liveTrackMessageBody) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    liveTrackMessageBody.messageId_ = this.messageId_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    liveTrackMessageBody.messageText_ = this.messageText_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    liveTrackMessageBody.timestamp_ = this.timestamp_;
                    i14 |= 4;
                }
                liveTrackMessageBody.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_LiveTrackMessageBody_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LiveTrackMessageBody build() {
                LiveTrackMessageBody liveTrackMessageBodyBuildPartial = buildPartial();
                if (liveTrackMessageBodyBuildPartial.isInitialized()) {
                    return liveTrackMessageBodyBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) liveTrackMessageBodyBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LiveTrackMessageBody buildPartial() {
                LiveTrackMessageBody liveTrackMessageBody = new LiveTrackMessageBody(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(liveTrackMessageBody);
                }
                onBuilt();
                return liveTrackMessageBody;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.messageId_ = 0L;
                this.messageText_ = "";
                this.timestamp_ = 0L;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMessageId() {
                this.bitField0_ &= -2;
                this.messageId_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearMessageText() {
                this.messageText_ = LiveTrackMessageBody.getDefaultInstance().getMessageText();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearTimestamp() {
                this.bitField0_ &= -5;
                this.timestamp_ = 0L;
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
                return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_LiveTrackMessageBody_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessageBodyOrBuilder
            public long getMessageId() {
                return this.messageId_;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessageBodyOrBuilder
            public String getMessageText() {
                Object obj = this.messageText_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.messageText_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessageBodyOrBuilder
            public ByteString getMessageTextBytes() {
                Object obj = this.messageText_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.messageText_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessageBodyOrBuilder
            public long getTimestamp() {
                return this.timestamp_;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessageBodyOrBuilder
            public boolean hasMessageId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessageBodyOrBuilder
            public boolean hasMessageText() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessageBodyOrBuilder
            public boolean hasTimestamp() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_LiveTrackMessageBody_fieldAccessorTable.ensureFieldAccessorsInitialized(LiveTrackMessageBody.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasMessageId() && hasMessageText() && hasTimestamp();
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
                                    this.messageId_ = codedInputStream.readUInt64();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.messageText_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.timestamp_ = codedInputStream.readUInt64();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setMessageId(long j8) {
                this.messageId_ = j8;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setMessageText(String str) {
                str.getClass();
                this.messageText_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setMessageTextBytes(ByteString byteString) {
                byteString.getClass();
                this.messageText_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setTimestamp(long j8) {
                this.timestamp_ = j8;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public LiveTrackMessageBody getDefaultInstanceForType() {
                return LiveTrackMessageBody.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.messageText_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LiveTrackMessageBody) {
                    return mergeFrom((LiveTrackMessageBody) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LiveTrackMessageBody liveTrackMessageBody) {
                if (liveTrackMessageBody == LiveTrackMessageBody.getDefaultInstance()) {
                    return this;
                }
                if (liveTrackMessageBody.hasMessageId()) {
                    setMessageId(liveTrackMessageBody.getMessageId());
                }
                if (liveTrackMessageBody.hasMessageText()) {
                    this.messageText_ = liveTrackMessageBody.messageText_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (liveTrackMessageBody.hasTimestamp()) {
                    setTimestamp(liveTrackMessageBody.getTimestamp());
                }
                mergeUnknownFields(liveTrackMessageBody.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LiveTrackMessageBody getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static LiveTrackMessageBody parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LiveTrackMessageBody) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LiveTrackMessageBody parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LiveTrackMessageBody parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveTrackMessageBody parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LiveTrackMessageBody parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LiveTrackMessageBody parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LiveTrackMessageBody parseFrom(InputStream inputStream) {
            return (LiveTrackMessageBody) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LiveTrackMessageBody parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LiveTrackMessageBody) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LiveTrackMessageBody parseFrom(CodedInputStream codedInputStream) {
            return (LiveTrackMessageBody) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        private LiveTrackMessageBody(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.messageId_ = 0L;
            this.messageText_ = "";
            this.timestamp_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LiveTrackMessageBody parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LiveTrackMessageBody) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ LiveTrackMessageBody(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class LiveTrackMessagingService extends GeneratedMessageV3 implements LiveTrackMessagingServiceOrBuilder {
        public static final int GET_LIVE_TRACK_MESSAGES_REQUEST_FIELD_NUMBER = 3;
        public static final int GET_LIVE_TRACK_MESSAGES_RESPONSE_FIELD_NUMBER = 4;
        public static final int SEND_LIVE_TRACK_MESSAGE_REQUEST_FIELD_NUMBER = 1;
        public static final int SEND_LIVE_TRACK_MESSAGE_RESPONSE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private GetLiveTrackMessagesRequest getLiveTrackMessagesRequest_;
        private GetLiveTrackMessagesResponse getLiveTrackMessagesResponse_;
        private byte memoizedIsInitialized;
        private SendLiveTrackMessageRequest sendLiveTrackMessageRequest_;
        private SendLiveTrackMessageResponse sendLiveTrackMessageResponse_;
        private static final LiveTrackMessagingService DEFAULT_INSTANCE = new LiveTrackMessagingService();

        @Deprecated
        public static final Parser<LiveTrackMessagingService> PARSER = new AbstractParser<LiveTrackMessagingService>() { // from class: com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessagingService.1
            @Override // com.google.protobuf.Parser
            public LiveTrackMessagingService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LiveTrackMessagingService.newBuilder();
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

        private LiveTrackMessagingService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LiveTrackMessagingService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_LiveTrackMessagingService_descriptor;
        }

        public static Builder newBuilder(LiveTrackMessagingService liveTrackMessagingService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(liveTrackMessagingService);
        }

        public static LiveTrackMessagingService parseDelimitedFrom(InputStream inputStream) {
            return (LiveTrackMessagingService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LiveTrackMessagingService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LiveTrackMessagingService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LiveTrackMessagingService)) {
                return super.equals(obj);
            }
            LiveTrackMessagingService liveTrackMessagingService = (LiveTrackMessagingService) obj;
            if (hasSendLiveTrackMessageRequest() != liveTrackMessagingService.hasSendLiveTrackMessageRequest()) {
                return false;
            }
            if ((hasSendLiveTrackMessageRequest() && !getSendLiveTrackMessageRequest().equals(liveTrackMessagingService.getSendLiveTrackMessageRequest())) || hasSendLiveTrackMessageResponse() != liveTrackMessagingService.hasSendLiveTrackMessageResponse()) {
                return false;
            }
            if ((hasSendLiveTrackMessageResponse() && !getSendLiveTrackMessageResponse().equals(liveTrackMessagingService.getSendLiveTrackMessageResponse())) || hasGetLiveTrackMessagesRequest() != liveTrackMessagingService.hasGetLiveTrackMessagesRequest()) {
                return false;
            }
            if ((!hasGetLiveTrackMessagesRequest() || getGetLiveTrackMessagesRequest().equals(liveTrackMessagingService.getGetLiveTrackMessagesRequest())) && hasGetLiveTrackMessagesResponse() == liveTrackMessagingService.hasGetLiveTrackMessagesResponse()) {
                return (!hasGetLiveTrackMessagesResponse() || getGetLiveTrackMessagesResponse().equals(liveTrackMessagingService.getGetLiveTrackMessagesResponse())) && getUnknownFields().equals(liveTrackMessagingService.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessagingServiceOrBuilder
        public GetLiveTrackMessagesRequest getGetLiveTrackMessagesRequest() {
            GetLiveTrackMessagesRequest getLiveTrackMessagesRequest = this.getLiveTrackMessagesRequest_;
            return getLiveTrackMessagesRequest == null ? GetLiveTrackMessagesRequest.getDefaultInstance() : getLiveTrackMessagesRequest;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessagingServiceOrBuilder
        public GetLiveTrackMessagesRequestOrBuilder getGetLiveTrackMessagesRequestOrBuilder() {
            GetLiveTrackMessagesRequest getLiveTrackMessagesRequest = this.getLiveTrackMessagesRequest_;
            return getLiveTrackMessagesRequest == null ? GetLiveTrackMessagesRequest.getDefaultInstance() : getLiveTrackMessagesRequest;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessagingServiceOrBuilder
        public GetLiveTrackMessagesResponse getGetLiveTrackMessagesResponse() {
            GetLiveTrackMessagesResponse getLiveTrackMessagesResponse = this.getLiveTrackMessagesResponse_;
            return getLiveTrackMessagesResponse == null ? GetLiveTrackMessagesResponse.getDefaultInstance() : getLiveTrackMessagesResponse;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessagingServiceOrBuilder
        public GetLiveTrackMessagesResponseOrBuilder getGetLiveTrackMessagesResponseOrBuilder() {
            GetLiveTrackMessagesResponse getLiveTrackMessagesResponse = this.getLiveTrackMessagesResponse_;
            return getLiveTrackMessagesResponse == null ? GetLiveTrackMessagesResponse.getDefaultInstance() : getLiveTrackMessagesResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LiveTrackMessagingService> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessagingServiceOrBuilder
        public SendLiveTrackMessageRequest getSendLiveTrackMessageRequest() {
            SendLiveTrackMessageRequest sendLiveTrackMessageRequest = this.sendLiveTrackMessageRequest_;
            return sendLiveTrackMessageRequest == null ? SendLiveTrackMessageRequest.getDefaultInstance() : sendLiveTrackMessageRequest;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessagingServiceOrBuilder
        public SendLiveTrackMessageRequestOrBuilder getSendLiveTrackMessageRequestOrBuilder() {
            SendLiveTrackMessageRequest sendLiveTrackMessageRequest = this.sendLiveTrackMessageRequest_;
            return sendLiveTrackMessageRequest == null ? SendLiveTrackMessageRequest.getDefaultInstance() : sendLiveTrackMessageRequest;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessagingServiceOrBuilder
        public SendLiveTrackMessageResponse getSendLiveTrackMessageResponse() {
            SendLiveTrackMessageResponse sendLiveTrackMessageResponse = this.sendLiveTrackMessageResponse_;
            return sendLiveTrackMessageResponse == null ? SendLiveTrackMessageResponse.getDefaultInstance() : sendLiveTrackMessageResponse;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessagingServiceOrBuilder
        public SendLiveTrackMessageResponseOrBuilder getSendLiveTrackMessageResponseOrBuilder() {
            SendLiveTrackMessageResponse sendLiveTrackMessageResponse = this.sendLiveTrackMessageResponse_;
            return sendLiveTrackMessageResponse == null ? SendLiveTrackMessageResponse.getDefaultInstance() : sendLiveTrackMessageResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getSendLiveTrackMessageRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getSendLiveTrackMessageResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getGetLiveTrackMessagesRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getGetLiveTrackMessagesResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessagingServiceOrBuilder
        public boolean hasGetLiveTrackMessagesRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessagingServiceOrBuilder
        public boolean hasGetLiveTrackMessagesResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessagingServiceOrBuilder
        public boolean hasSendLiveTrackMessageRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessagingServiceOrBuilder
        public boolean hasSendLiveTrackMessageResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSendLiveTrackMessageRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSendLiveTrackMessageRequest().hashCode();
            }
            if (hasSendLiveTrackMessageResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSendLiveTrackMessageResponse().hashCode();
            }
            if (hasGetLiveTrackMessagesRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getGetLiveTrackMessagesRequest().hashCode();
            }
            if (hasGetLiveTrackMessagesResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getGetLiveTrackMessagesResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_LiveTrackMessagingService_fieldAccessorTable.ensureFieldAccessorsInitialized(LiveTrackMessagingService.class, Builder.class);
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
            if (hasSendLiveTrackMessageRequest() && !getSendLiveTrackMessageRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasSendLiveTrackMessageResponse() && !getSendLiveTrackMessageResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasGetLiveTrackMessagesResponse() || getGetLiveTrackMessagesResponse().isInitialized()) {
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
            return new LiveTrackMessagingService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getSendLiveTrackMessageRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getSendLiveTrackMessageResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getGetLiveTrackMessagesRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getGetLiveTrackMessagesResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LiveTrackMessagingServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<GetLiveTrackMessagesRequest, GetLiveTrackMessagesRequest.Builder, GetLiveTrackMessagesRequestOrBuilder> getLiveTrackMessagesRequestBuilder_;
            private GetLiveTrackMessagesRequest getLiveTrackMessagesRequest_;
            private SingleFieldBuilderV3<GetLiveTrackMessagesResponse, GetLiveTrackMessagesResponse.Builder, GetLiveTrackMessagesResponseOrBuilder> getLiveTrackMessagesResponseBuilder_;
            private GetLiveTrackMessagesResponse getLiveTrackMessagesResponse_;
            private SingleFieldBuilderV3<SendLiveTrackMessageRequest, SendLiveTrackMessageRequest.Builder, SendLiveTrackMessageRequestOrBuilder> sendLiveTrackMessageRequestBuilder_;
            private SendLiveTrackMessageRequest sendLiveTrackMessageRequest_;
            private SingleFieldBuilderV3<SendLiveTrackMessageResponse, SendLiveTrackMessageResponse.Builder, SendLiveTrackMessageResponseOrBuilder> sendLiveTrackMessageResponseBuilder_;
            private SendLiveTrackMessageResponse sendLiveTrackMessageResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(LiveTrackMessagingService liveTrackMessagingService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<SendLiveTrackMessageRequest, SendLiveTrackMessageRequest.Builder, SendLiveTrackMessageRequestOrBuilder> singleFieldBuilderV3 = this.sendLiveTrackMessageRequestBuilder_;
                    liveTrackMessagingService.sendLiveTrackMessageRequest_ = singleFieldBuilderV3 == null ? this.sendLiveTrackMessageRequest_ : (SendLiveTrackMessageRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<SendLiveTrackMessageResponse, SendLiveTrackMessageResponse.Builder, SendLiveTrackMessageResponseOrBuilder> singleFieldBuilderV4 = this.sendLiveTrackMessageResponseBuilder_;
                    liveTrackMessagingService.sendLiveTrackMessageResponse_ = singleFieldBuilderV4 == null ? this.sendLiveTrackMessageResponse_ : (SendLiveTrackMessageResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<GetLiveTrackMessagesRequest, GetLiveTrackMessagesRequest.Builder, GetLiveTrackMessagesRequestOrBuilder> singleFieldBuilderV5 = this.getLiveTrackMessagesRequestBuilder_;
                    liveTrackMessagingService.getLiveTrackMessagesRequest_ = singleFieldBuilderV5 == null ? this.getLiveTrackMessagesRequest_ : (GetLiveTrackMessagesRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<GetLiveTrackMessagesResponse, GetLiveTrackMessagesResponse.Builder, GetLiveTrackMessagesResponseOrBuilder> singleFieldBuilderV6 = this.getLiveTrackMessagesResponseBuilder_;
                    liveTrackMessagingService.getLiveTrackMessagesResponse_ = singleFieldBuilderV6 == null ? this.getLiveTrackMessagesResponse_ : (GetLiveTrackMessagesResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                liveTrackMessagingService.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_LiveTrackMessagingService_descriptor;
            }

            private SingleFieldBuilderV3<GetLiveTrackMessagesRequest, GetLiveTrackMessagesRequest.Builder, GetLiveTrackMessagesRequestOrBuilder> getGetLiveTrackMessagesRequestFieldBuilder() {
                if (this.getLiveTrackMessagesRequestBuilder_ == null) {
                    this.getLiveTrackMessagesRequestBuilder_ = new SingleFieldBuilderV3<>(getGetLiveTrackMessagesRequest(), getParentForChildren(), isClean());
                    this.getLiveTrackMessagesRequest_ = null;
                }
                return this.getLiveTrackMessagesRequestBuilder_;
            }

            private SingleFieldBuilderV3<GetLiveTrackMessagesResponse, GetLiveTrackMessagesResponse.Builder, GetLiveTrackMessagesResponseOrBuilder> getGetLiveTrackMessagesResponseFieldBuilder() {
                if (this.getLiveTrackMessagesResponseBuilder_ == null) {
                    this.getLiveTrackMessagesResponseBuilder_ = new SingleFieldBuilderV3<>(getGetLiveTrackMessagesResponse(), getParentForChildren(), isClean());
                    this.getLiveTrackMessagesResponse_ = null;
                }
                return this.getLiveTrackMessagesResponseBuilder_;
            }

            private SingleFieldBuilderV3<SendLiveTrackMessageRequest, SendLiveTrackMessageRequest.Builder, SendLiveTrackMessageRequestOrBuilder> getSendLiveTrackMessageRequestFieldBuilder() {
                if (this.sendLiveTrackMessageRequestBuilder_ == null) {
                    this.sendLiveTrackMessageRequestBuilder_ = new SingleFieldBuilderV3<>(getSendLiveTrackMessageRequest(), getParentForChildren(), isClean());
                    this.sendLiveTrackMessageRequest_ = null;
                }
                return this.sendLiveTrackMessageRequestBuilder_;
            }

            private SingleFieldBuilderV3<SendLiveTrackMessageResponse, SendLiveTrackMessageResponse.Builder, SendLiveTrackMessageResponseOrBuilder> getSendLiveTrackMessageResponseFieldBuilder() {
                if (this.sendLiveTrackMessageResponseBuilder_ == null) {
                    this.sendLiveTrackMessageResponseBuilder_ = new SingleFieldBuilderV3<>(getSendLiveTrackMessageResponse(), getParentForChildren(), isClean());
                    this.sendLiveTrackMessageResponse_ = null;
                }
                return this.sendLiveTrackMessageResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSendLiveTrackMessageRequestFieldBuilder();
                    getSendLiveTrackMessageResponseFieldBuilder();
                    getGetLiveTrackMessagesRequestFieldBuilder();
                    getGetLiveTrackMessagesResponseFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LiveTrackMessagingService build() {
                LiveTrackMessagingService liveTrackMessagingServiceBuildPartial = buildPartial();
                if (liveTrackMessagingServiceBuildPartial.isInitialized()) {
                    return liveTrackMessagingServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) liveTrackMessagingServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LiveTrackMessagingService buildPartial() {
                LiveTrackMessagingService liveTrackMessagingService = new LiveTrackMessagingService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(liveTrackMessagingService);
                }
                onBuilt();
                return liveTrackMessagingService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.sendLiveTrackMessageRequest_ = null;
                SingleFieldBuilderV3<SendLiveTrackMessageRequest, SendLiveTrackMessageRequest.Builder, SendLiveTrackMessageRequestOrBuilder> singleFieldBuilderV3 = this.sendLiveTrackMessageRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sendLiveTrackMessageRequestBuilder_ = null;
                }
                this.sendLiveTrackMessageResponse_ = null;
                SingleFieldBuilderV3<SendLiveTrackMessageResponse, SendLiveTrackMessageResponse.Builder, SendLiveTrackMessageResponseOrBuilder> singleFieldBuilderV4 = this.sendLiveTrackMessageResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.sendLiveTrackMessageResponseBuilder_ = null;
                }
                this.getLiveTrackMessagesRequest_ = null;
                SingleFieldBuilderV3<GetLiveTrackMessagesRequest, GetLiveTrackMessagesRequest.Builder, GetLiveTrackMessagesRequestOrBuilder> singleFieldBuilderV5 = this.getLiveTrackMessagesRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.getLiveTrackMessagesRequestBuilder_ = null;
                }
                this.getLiveTrackMessagesResponse_ = null;
                SingleFieldBuilderV3<GetLiveTrackMessagesResponse, GetLiveTrackMessagesResponse.Builder, GetLiveTrackMessagesResponseOrBuilder> singleFieldBuilderV6 = this.getLiveTrackMessagesResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.getLiveTrackMessagesResponseBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGetLiveTrackMessagesRequest() {
                this.bitField0_ &= -5;
                this.getLiveTrackMessagesRequest_ = null;
                SingleFieldBuilderV3<GetLiveTrackMessagesRequest, GetLiveTrackMessagesRequest.Builder, GetLiveTrackMessagesRequestOrBuilder> singleFieldBuilderV3 = this.getLiveTrackMessagesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.getLiveTrackMessagesRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearGetLiveTrackMessagesResponse() {
                this.bitField0_ &= -9;
                this.getLiveTrackMessagesResponse_ = null;
                SingleFieldBuilderV3<GetLiveTrackMessagesResponse, GetLiveTrackMessagesResponse.Builder, GetLiveTrackMessagesResponseOrBuilder> singleFieldBuilderV3 = this.getLiveTrackMessagesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.getLiveTrackMessagesResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSendLiveTrackMessageRequest() {
                this.bitField0_ &= -2;
                this.sendLiveTrackMessageRequest_ = null;
                SingleFieldBuilderV3<SendLiveTrackMessageRequest, SendLiveTrackMessageRequest.Builder, SendLiveTrackMessageRequestOrBuilder> singleFieldBuilderV3 = this.sendLiveTrackMessageRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sendLiveTrackMessageRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSendLiveTrackMessageResponse() {
                this.bitField0_ &= -3;
                this.sendLiveTrackMessageResponse_ = null;
                SingleFieldBuilderV3<SendLiveTrackMessageResponse, SendLiveTrackMessageResponse.Builder, SendLiveTrackMessageResponseOrBuilder> singleFieldBuilderV3 = this.sendLiveTrackMessageResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sendLiveTrackMessageResponseBuilder_ = null;
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
                return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_LiveTrackMessagingService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessagingServiceOrBuilder
            public GetLiveTrackMessagesRequest getGetLiveTrackMessagesRequest() {
                SingleFieldBuilderV3<GetLiveTrackMessagesRequest, GetLiveTrackMessagesRequest.Builder, GetLiveTrackMessagesRequestOrBuilder> singleFieldBuilderV3 = this.getLiveTrackMessagesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetLiveTrackMessagesRequest) singleFieldBuilderV3.getMessage();
                }
                GetLiveTrackMessagesRequest getLiveTrackMessagesRequest = this.getLiveTrackMessagesRequest_;
                return getLiveTrackMessagesRequest == null ? GetLiveTrackMessagesRequest.getDefaultInstance() : getLiveTrackMessagesRequest;
            }

            public GetLiveTrackMessagesRequest.Builder getGetLiveTrackMessagesRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (GetLiveTrackMessagesRequest.Builder) getGetLiveTrackMessagesRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessagingServiceOrBuilder
            public GetLiveTrackMessagesRequestOrBuilder getGetLiveTrackMessagesRequestOrBuilder() {
                SingleFieldBuilderV3<GetLiveTrackMessagesRequest, GetLiveTrackMessagesRequest.Builder, GetLiveTrackMessagesRequestOrBuilder> singleFieldBuilderV3 = this.getLiveTrackMessagesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetLiveTrackMessagesRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GetLiveTrackMessagesRequest getLiveTrackMessagesRequest = this.getLiveTrackMessagesRequest_;
                return getLiveTrackMessagesRequest == null ? GetLiveTrackMessagesRequest.getDefaultInstance() : getLiveTrackMessagesRequest;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessagingServiceOrBuilder
            public GetLiveTrackMessagesResponse getGetLiveTrackMessagesResponse() {
                SingleFieldBuilderV3<GetLiveTrackMessagesResponse, GetLiveTrackMessagesResponse.Builder, GetLiveTrackMessagesResponseOrBuilder> singleFieldBuilderV3 = this.getLiveTrackMessagesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetLiveTrackMessagesResponse) singleFieldBuilderV3.getMessage();
                }
                GetLiveTrackMessagesResponse getLiveTrackMessagesResponse = this.getLiveTrackMessagesResponse_;
                return getLiveTrackMessagesResponse == null ? GetLiveTrackMessagesResponse.getDefaultInstance() : getLiveTrackMessagesResponse;
            }

            public GetLiveTrackMessagesResponse.Builder getGetLiveTrackMessagesResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (GetLiveTrackMessagesResponse.Builder) getGetLiveTrackMessagesResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessagingServiceOrBuilder
            public GetLiveTrackMessagesResponseOrBuilder getGetLiveTrackMessagesResponseOrBuilder() {
                SingleFieldBuilderV3<GetLiveTrackMessagesResponse, GetLiveTrackMessagesResponse.Builder, GetLiveTrackMessagesResponseOrBuilder> singleFieldBuilderV3 = this.getLiveTrackMessagesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetLiveTrackMessagesResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GetLiveTrackMessagesResponse getLiveTrackMessagesResponse = this.getLiveTrackMessagesResponse_;
                return getLiveTrackMessagesResponse == null ? GetLiveTrackMessagesResponse.getDefaultInstance() : getLiveTrackMessagesResponse;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessagingServiceOrBuilder
            public SendLiveTrackMessageRequest getSendLiveTrackMessageRequest() {
                SingleFieldBuilderV3<SendLiveTrackMessageRequest, SendLiveTrackMessageRequest.Builder, SendLiveTrackMessageRequestOrBuilder> singleFieldBuilderV3 = this.sendLiveTrackMessageRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SendLiveTrackMessageRequest) singleFieldBuilderV3.getMessage();
                }
                SendLiveTrackMessageRequest sendLiveTrackMessageRequest = this.sendLiveTrackMessageRequest_;
                return sendLiveTrackMessageRequest == null ? SendLiveTrackMessageRequest.getDefaultInstance() : sendLiveTrackMessageRequest;
            }

            public SendLiveTrackMessageRequest.Builder getSendLiveTrackMessageRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SendLiveTrackMessageRequest.Builder) getSendLiveTrackMessageRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessagingServiceOrBuilder
            public SendLiveTrackMessageRequestOrBuilder getSendLiveTrackMessageRequestOrBuilder() {
                SingleFieldBuilderV3<SendLiveTrackMessageRequest, SendLiveTrackMessageRequest.Builder, SendLiveTrackMessageRequestOrBuilder> singleFieldBuilderV3 = this.sendLiveTrackMessageRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SendLiveTrackMessageRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SendLiveTrackMessageRequest sendLiveTrackMessageRequest = this.sendLiveTrackMessageRequest_;
                return sendLiveTrackMessageRequest == null ? SendLiveTrackMessageRequest.getDefaultInstance() : sendLiveTrackMessageRequest;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessagingServiceOrBuilder
            public SendLiveTrackMessageResponse getSendLiveTrackMessageResponse() {
                SingleFieldBuilderV3<SendLiveTrackMessageResponse, SendLiveTrackMessageResponse.Builder, SendLiveTrackMessageResponseOrBuilder> singleFieldBuilderV3 = this.sendLiveTrackMessageResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SendLiveTrackMessageResponse) singleFieldBuilderV3.getMessage();
                }
                SendLiveTrackMessageResponse sendLiveTrackMessageResponse = this.sendLiveTrackMessageResponse_;
                return sendLiveTrackMessageResponse == null ? SendLiveTrackMessageResponse.getDefaultInstance() : sendLiveTrackMessageResponse;
            }

            public SendLiveTrackMessageResponse.Builder getSendLiveTrackMessageResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (SendLiveTrackMessageResponse.Builder) getSendLiveTrackMessageResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessagingServiceOrBuilder
            public SendLiveTrackMessageResponseOrBuilder getSendLiveTrackMessageResponseOrBuilder() {
                SingleFieldBuilderV3<SendLiveTrackMessageResponse, SendLiveTrackMessageResponse.Builder, SendLiveTrackMessageResponseOrBuilder> singleFieldBuilderV3 = this.sendLiveTrackMessageResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SendLiveTrackMessageResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SendLiveTrackMessageResponse sendLiveTrackMessageResponse = this.sendLiveTrackMessageResponse_;
                return sendLiveTrackMessageResponse == null ? SendLiveTrackMessageResponse.getDefaultInstance() : sendLiveTrackMessageResponse;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessagingServiceOrBuilder
            public boolean hasGetLiveTrackMessagesRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessagingServiceOrBuilder
            public boolean hasGetLiveTrackMessagesResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessagingServiceOrBuilder
            public boolean hasSendLiveTrackMessageRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.LiveTrackMessagingServiceOrBuilder
            public boolean hasSendLiveTrackMessageResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_LiveTrackMessagingService_fieldAccessorTable.ensureFieldAccessorsInitialized(LiveTrackMessagingService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasSendLiveTrackMessageRequest() && !getSendLiveTrackMessageRequest().isInitialized()) {
                    return false;
                }
                if (!hasSendLiveTrackMessageResponse() || getSendLiveTrackMessageResponse().isInitialized()) {
                    return !hasGetLiveTrackMessagesResponse() || getGetLiveTrackMessagesResponse().isInitialized();
                }
                return false;
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
                                    codedInputStream.readMessage(getSendLiveTrackMessageRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getSendLiveTrackMessageResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getGetLiveTrackMessagesRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getGetLiveTrackMessagesResponseFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeGetLiveTrackMessagesRequest(GetLiveTrackMessagesRequest getLiveTrackMessagesRequest) {
                GetLiveTrackMessagesRequest getLiveTrackMessagesRequest2;
                SingleFieldBuilderV3<GetLiveTrackMessagesRequest, GetLiveTrackMessagesRequest.Builder, GetLiveTrackMessagesRequestOrBuilder> singleFieldBuilderV3 = this.getLiveTrackMessagesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(getLiveTrackMessagesRequest);
                } else if ((this.bitField0_ & 4) == 0 || (getLiveTrackMessagesRequest2 = this.getLiveTrackMessagesRequest_) == null || getLiveTrackMessagesRequest2 == GetLiveTrackMessagesRequest.getDefaultInstance()) {
                    this.getLiveTrackMessagesRequest_ = getLiveTrackMessagesRequest;
                } else {
                    getGetLiveTrackMessagesRequestBuilder().mergeFrom(getLiveTrackMessagesRequest);
                }
                if (this.getLiveTrackMessagesRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeGetLiveTrackMessagesResponse(GetLiveTrackMessagesResponse getLiveTrackMessagesResponse) {
                GetLiveTrackMessagesResponse getLiveTrackMessagesResponse2;
                SingleFieldBuilderV3<GetLiveTrackMessagesResponse, GetLiveTrackMessagesResponse.Builder, GetLiveTrackMessagesResponseOrBuilder> singleFieldBuilderV3 = this.getLiveTrackMessagesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(getLiveTrackMessagesResponse);
                } else if ((this.bitField0_ & 8) == 0 || (getLiveTrackMessagesResponse2 = this.getLiveTrackMessagesResponse_) == null || getLiveTrackMessagesResponse2 == GetLiveTrackMessagesResponse.getDefaultInstance()) {
                    this.getLiveTrackMessagesResponse_ = getLiveTrackMessagesResponse;
                } else {
                    getGetLiveTrackMessagesResponseBuilder().mergeFrom(getLiveTrackMessagesResponse);
                }
                if (this.getLiveTrackMessagesResponse_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSendLiveTrackMessageRequest(SendLiveTrackMessageRequest sendLiveTrackMessageRequest) {
                SendLiveTrackMessageRequest sendLiveTrackMessageRequest2;
                SingleFieldBuilderV3<SendLiveTrackMessageRequest, SendLiveTrackMessageRequest.Builder, SendLiveTrackMessageRequestOrBuilder> singleFieldBuilderV3 = this.sendLiveTrackMessageRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(sendLiveTrackMessageRequest);
                } else if ((this.bitField0_ & 1) == 0 || (sendLiveTrackMessageRequest2 = this.sendLiveTrackMessageRequest_) == null || sendLiveTrackMessageRequest2 == SendLiveTrackMessageRequest.getDefaultInstance()) {
                    this.sendLiveTrackMessageRequest_ = sendLiveTrackMessageRequest;
                } else {
                    getSendLiveTrackMessageRequestBuilder().mergeFrom(sendLiveTrackMessageRequest);
                }
                if (this.sendLiveTrackMessageRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSendLiveTrackMessageResponse(SendLiveTrackMessageResponse sendLiveTrackMessageResponse) {
                SendLiveTrackMessageResponse sendLiveTrackMessageResponse2;
                SingleFieldBuilderV3<SendLiveTrackMessageResponse, SendLiveTrackMessageResponse.Builder, SendLiveTrackMessageResponseOrBuilder> singleFieldBuilderV3 = this.sendLiveTrackMessageResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(sendLiveTrackMessageResponse);
                } else if ((this.bitField0_ & 2) == 0 || (sendLiveTrackMessageResponse2 = this.sendLiveTrackMessageResponse_) == null || sendLiveTrackMessageResponse2 == SendLiveTrackMessageResponse.getDefaultInstance()) {
                    this.sendLiveTrackMessageResponse_ = sendLiveTrackMessageResponse;
                } else {
                    getSendLiveTrackMessageResponseBuilder().mergeFrom(sendLiveTrackMessageResponse);
                }
                if (this.sendLiveTrackMessageResponse_ != null) {
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

            public Builder setGetLiveTrackMessagesRequest(GetLiveTrackMessagesRequest.Builder builder) {
                SingleFieldBuilderV3<GetLiveTrackMessagesRequest, GetLiveTrackMessagesRequest.Builder, GetLiveTrackMessagesRequestOrBuilder> singleFieldBuilderV3 = this.getLiveTrackMessagesRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.getLiveTrackMessagesRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setGetLiveTrackMessagesResponse(GetLiveTrackMessagesResponse.Builder builder) {
                SingleFieldBuilderV3<GetLiveTrackMessagesResponse, GetLiveTrackMessagesResponse.Builder, GetLiveTrackMessagesResponseOrBuilder> singleFieldBuilderV3 = this.getLiveTrackMessagesResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.getLiveTrackMessagesResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSendLiveTrackMessageRequest(SendLiveTrackMessageRequest.Builder builder) {
                SingleFieldBuilderV3<SendLiveTrackMessageRequest, SendLiveTrackMessageRequest.Builder, SendLiveTrackMessageRequestOrBuilder> singleFieldBuilderV3 = this.sendLiveTrackMessageRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.sendLiveTrackMessageRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSendLiveTrackMessageResponse(SendLiveTrackMessageResponse.Builder builder) {
                SingleFieldBuilderV3<SendLiveTrackMessageResponse, SendLiveTrackMessageResponse.Builder, SendLiveTrackMessageResponseOrBuilder> singleFieldBuilderV3 = this.sendLiveTrackMessageResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.sendLiveTrackMessageResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public LiveTrackMessagingService getDefaultInstanceForType() {
                return LiveTrackMessagingService.getDefaultInstance();
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

            public Builder setGetLiveTrackMessagesRequest(GetLiveTrackMessagesRequest getLiveTrackMessagesRequest) {
                SingleFieldBuilderV3<GetLiveTrackMessagesRequest, GetLiveTrackMessagesRequest.Builder, GetLiveTrackMessagesRequestOrBuilder> singleFieldBuilderV3 = this.getLiveTrackMessagesRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    getLiveTrackMessagesRequest.getClass();
                    this.getLiveTrackMessagesRequest_ = getLiveTrackMessagesRequest;
                } else {
                    singleFieldBuilderV3.setMessage(getLiveTrackMessagesRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setGetLiveTrackMessagesResponse(GetLiveTrackMessagesResponse getLiveTrackMessagesResponse) {
                SingleFieldBuilderV3<GetLiveTrackMessagesResponse, GetLiveTrackMessagesResponse.Builder, GetLiveTrackMessagesResponseOrBuilder> singleFieldBuilderV3 = this.getLiveTrackMessagesResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    getLiveTrackMessagesResponse.getClass();
                    this.getLiveTrackMessagesResponse_ = getLiveTrackMessagesResponse;
                } else {
                    singleFieldBuilderV3.setMessage(getLiveTrackMessagesResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSendLiveTrackMessageRequest(SendLiveTrackMessageRequest sendLiveTrackMessageRequest) {
                SingleFieldBuilderV3<SendLiveTrackMessageRequest, SendLiveTrackMessageRequest.Builder, SendLiveTrackMessageRequestOrBuilder> singleFieldBuilderV3 = this.sendLiveTrackMessageRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    sendLiveTrackMessageRequest.getClass();
                    this.sendLiveTrackMessageRequest_ = sendLiveTrackMessageRequest;
                } else {
                    singleFieldBuilderV3.setMessage(sendLiveTrackMessageRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSendLiveTrackMessageResponse(SendLiveTrackMessageResponse sendLiveTrackMessageResponse) {
                SingleFieldBuilderV3<SendLiveTrackMessageResponse, SendLiveTrackMessageResponse.Builder, SendLiveTrackMessageResponseOrBuilder> singleFieldBuilderV3 = this.sendLiveTrackMessageResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    sendLiveTrackMessageResponse.getClass();
                    this.sendLiveTrackMessageResponse_ = sendLiveTrackMessageResponse;
                } else {
                    singleFieldBuilderV3.setMessage(sendLiveTrackMessageResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LiveTrackMessagingService) {
                    return mergeFrom((LiveTrackMessagingService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LiveTrackMessagingService liveTrackMessagingService) {
                if (liveTrackMessagingService == LiveTrackMessagingService.getDefaultInstance()) {
                    return this;
                }
                if (liveTrackMessagingService.hasSendLiveTrackMessageRequest()) {
                    mergeSendLiveTrackMessageRequest(liveTrackMessagingService.getSendLiveTrackMessageRequest());
                }
                if (liveTrackMessagingService.hasSendLiveTrackMessageResponse()) {
                    mergeSendLiveTrackMessageResponse(liveTrackMessagingService.getSendLiveTrackMessageResponse());
                }
                if (liveTrackMessagingService.hasGetLiveTrackMessagesRequest()) {
                    mergeGetLiveTrackMessagesRequest(liveTrackMessagingService.getGetLiveTrackMessagesRequest());
                }
                if (liveTrackMessagingService.hasGetLiveTrackMessagesResponse()) {
                    mergeGetLiveTrackMessagesResponse(liveTrackMessagingService.getGetLiveTrackMessagesResponse());
                }
                mergeUnknownFields(liveTrackMessagingService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LiveTrackMessagingService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ LiveTrackMessagingService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private LiveTrackMessagingService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LiveTrackMessagingService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LiveTrackMessagingService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LiveTrackMessagingService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LiveTrackMessagingService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LiveTrackMessagingService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LiveTrackMessagingService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LiveTrackMessagingService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LiveTrackMessagingService parseFrom(InputStream inputStream) {
            return (LiveTrackMessagingService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LiveTrackMessagingService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LiveTrackMessagingService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LiveTrackMessagingService parseFrom(CodedInputStream codedInputStream) {
            return (LiveTrackMessagingService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LiveTrackMessagingService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LiveTrackMessagingService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SendLiveTrackMessageError extends GeneratedMessageV3 implements SendLiveTrackMessageErrorOrBuilder {
        public static final int ERROR_MESSAGE_TEXT_FIELD_NUMBER = 3;
        public static final int LIVE_TRACK_MESSAGE_ERROR_TYPE_FIELD_NUMBER = 2;
        public static final int SESSION_IDS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object errorMessageText_;
        private int liveTrackMessageErrorType_;
        private byte memoizedIsInitialized;
        private LazyStringArrayList sessionIds_;
        private static final SendLiveTrackMessageError DEFAULT_INSTANCE = new SendLiveTrackMessageError();

        @Deprecated
        public static final Parser<SendLiveTrackMessageError> PARSER = new AbstractParser<SendLiveTrackMessageError>() { // from class: com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageError.1
            @Override // com.google.protobuf.Parser
            public SendLiveTrackMessageError parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SendLiveTrackMessageError.newBuilder();
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

        private SendLiveTrackMessageError() {
            this.sessionIds_ = LazyStringArrayList.emptyList();
            this.liveTrackMessageErrorType_ = 0;
            this.errorMessageText_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.sessionIds_ = LazyStringArrayList.emptyList();
            this.liveTrackMessageErrorType_ = 0;
            this.errorMessageText_ = "";
        }

        public static SendLiveTrackMessageError getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_SendLiveTrackMessageError_descriptor;
        }

        public static Builder newBuilder(SendLiveTrackMessageError sendLiveTrackMessageError) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sendLiveTrackMessageError);
        }

        public static SendLiveTrackMessageError parseDelimitedFrom(InputStream inputStream) {
            return (SendLiveTrackMessageError) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SendLiveTrackMessageError parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SendLiveTrackMessageError> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SendLiveTrackMessageError)) {
                return super.equals(obj);
            }
            SendLiveTrackMessageError sendLiveTrackMessageError = (SendLiveTrackMessageError) obj;
            if (!getSessionIdsList().equals(sendLiveTrackMessageError.getSessionIdsList()) || hasLiveTrackMessageErrorType() != sendLiveTrackMessageError.hasLiveTrackMessageErrorType()) {
                return false;
            }
            if ((!hasLiveTrackMessageErrorType() || this.liveTrackMessageErrorType_ == sendLiveTrackMessageError.liveTrackMessageErrorType_) && hasErrorMessageText() == sendLiveTrackMessageError.hasErrorMessageText()) {
                return (!hasErrorMessageText() || getErrorMessageText().equals(sendLiveTrackMessageError.getErrorMessageText())) && getUnknownFields().equals(sendLiveTrackMessageError.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageErrorOrBuilder
        public String getErrorMessageText() {
            Object obj = this.errorMessageText_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.errorMessageText_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageErrorOrBuilder
        public ByteString getErrorMessageTextBytes() {
            Object obj = this.errorMessageText_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.errorMessageText_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageErrorOrBuilder
        public LiveTrackMessageErrorType getLiveTrackMessageErrorType() {
            LiveTrackMessageErrorType liveTrackMessageErrorTypeForNumber = LiveTrackMessageErrorType.forNumber(this.liveTrackMessageErrorType_);
            return liveTrackMessageErrorTypeForNumber == null ? LiveTrackMessageErrorType.UNKNOWN_ERROR : liveTrackMessageErrorTypeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SendLiveTrackMessageError> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iD = 0;
            for (int i15 = 0; i15 < this.sessionIds_.size(); i15++) {
                iD = f3.d(this.sessionIds_, i15, iD);
            }
            int size = getSessionIdsList().size() + iD;
            if ((this.bitField0_ & 1) != 0) {
                size += CodedOutputStream.computeEnumSize(2, this.liveTrackMessageErrorType_);
            }
            if ((this.bitField0_ & 2) != 0) {
                size += GeneratedMessageV3.computeStringSize(3, this.errorMessageText_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageErrorOrBuilder
        public String getSessionIds(int i14) {
            return this.sessionIds_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageErrorOrBuilder
        public ByteString getSessionIdsBytes(int i14) {
            return this.sessionIds_.getByteString(i14);
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageErrorOrBuilder
        public int getSessionIdsCount() {
            return this.sessionIds_.size();
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageErrorOrBuilder
        public boolean hasErrorMessageText() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageErrorOrBuilder
        public boolean hasLiveTrackMessageErrorType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getSessionIdsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSessionIdsList().hashCode();
            }
            if (hasLiveTrackMessageErrorType()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.liveTrackMessageErrorType_;
            }
            if (hasErrorMessageText()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getErrorMessageText().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_SendLiveTrackMessageError_fieldAccessorTable.ensureFieldAccessorsInitialized(SendLiveTrackMessageError.class, Builder.class);
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
            if (hasLiveTrackMessageErrorType()) {
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
            return new SendLiveTrackMessageError();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            int iE = 0;
            while (iE < this.sessionIds_.size()) {
                iE = f3.e(this.sessionIds_, iE, codedOutputStream, 1, iE, 1);
            }
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(2, this.liveTrackMessageErrorType_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.errorMessageText_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SendLiveTrackMessageErrorOrBuilder {
            private int bitField0_;
            private Object errorMessageText_;
            private int liveTrackMessageErrorType_;
            private LazyStringArrayList sessionIds_;

            private Builder() {
                this.sessionIds_ = LazyStringArrayList.emptyList();
                this.liveTrackMessageErrorType_ = 0;
                this.errorMessageText_ = "";
            }

            private void buildPartial0(SendLiveTrackMessageError sendLiveTrackMessageError) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    this.sessionIds_.makeImmutable();
                    sendLiveTrackMessageError.sessionIds_ = this.sessionIds_;
                }
                if ((i15 & 2) != 0) {
                    sendLiveTrackMessageError.liveTrackMessageErrorType_ = this.liveTrackMessageErrorType_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 4) != 0) {
                    sendLiveTrackMessageError.errorMessageText_ = this.errorMessageText_;
                    i14 |= 2;
                }
                sendLiveTrackMessageError.bitField0_ |= i14;
            }

            private void ensureSessionIdsIsMutable() {
                if (!this.sessionIds_.isModifiable()) {
                    this.sessionIds_ = new LazyStringArrayList((LazyStringList) this.sessionIds_);
                }
                this.bitField0_ |= 1;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_SendLiveTrackMessageError_descriptor;
            }

            public Builder addAllSessionIds(Iterable<String> iterable) {
                ensureSessionIdsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.sessionIds_);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addSessionIds(String str) {
                str.getClass();
                ensureSessionIdsIsMutable();
                this.sessionIds_.add(str);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder addSessionIdsBytes(ByteString byteString) {
                byteString.getClass();
                ensureSessionIdsIsMutable();
                this.sessionIds_.add(byteString);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SendLiveTrackMessageError build() {
                SendLiveTrackMessageError sendLiveTrackMessageErrorBuildPartial = buildPartial();
                if (sendLiveTrackMessageErrorBuildPartial.isInitialized()) {
                    return sendLiveTrackMessageErrorBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sendLiveTrackMessageErrorBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SendLiveTrackMessageError buildPartial() {
                SendLiveTrackMessageError sendLiveTrackMessageError = new SendLiveTrackMessageError(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sendLiveTrackMessageError);
                }
                onBuilt();
                return sendLiveTrackMessageError;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.sessionIds_ = LazyStringArrayList.emptyList();
                this.liveTrackMessageErrorType_ = 0;
                this.errorMessageText_ = "";
                return this;
            }

            public Builder clearErrorMessageText() {
                this.errorMessageText_ = SendLiveTrackMessageError.getDefaultInstance().getErrorMessageText();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLiveTrackMessageErrorType() {
                this.bitField0_ &= -3;
                this.liveTrackMessageErrorType_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSessionIds() {
                this.sessionIds_ = LazyStringArrayList.emptyList();
                this.bitField0_ &= -2;
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
                return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_SendLiveTrackMessageError_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageErrorOrBuilder
            public String getErrorMessageText() {
                Object obj = this.errorMessageText_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.errorMessageText_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageErrorOrBuilder
            public ByteString getErrorMessageTextBytes() {
                Object obj = this.errorMessageText_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.errorMessageText_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageErrorOrBuilder
            public LiveTrackMessageErrorType getLiveTrackMessageErrorType() {
                LiveTrackMessageErrorType liveTrackMessageErrorTypeForNumber = LiveTrackMessageErrorType.forNumber(this.liveTrackMessageErrorType_);
                return liveTrackMessageErrorTypeForNumber == null ? LiveTrackMessageErrorType.UNKNOWN_ERROR : liveTrackMessageErrorTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageErrorOrBuilder
            public String getSessionIds(int i14) {
                return this.sessionIds_.get(i14);
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageErrorOrBuilder
            public ByteString getSessionIdsBytes(int i14) {
                return this.sessionIds_.getByteString(i14);
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageErrorOrBuilder
            public int getSessionIdsCount() {
                return this.sessionIds_.size();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageErrorOrBuilder
            public ProtocolStringList getSessionIdsList() {
                this.sessionIds_.makeImmutable();
                return this.sessionIds_;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageErrorOrBuilder
            public boolean hasErrorMessageText() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageErrorOrBuilder
            public boolean hasLiveTrackMessageErrorType() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_SendLiveTrackMessageError_fieldAccessorTable.ensureFieldAccessorsInitialized(SendLiveTrackMessageError.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasLiveTrackMessageErrorType();
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
                                    ByteString bytes = codedInputStream.readBytes();
                                    ensureSessionIdsIsMutable();
                                    this.sessionIds_.add(bytes);
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (LiveTrackMessageErrorType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.liveTrackMessageErrorType_ = i14;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (tag == 26) {
                                    this.errorMessageText_ = codedInputStream.readBytes();
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

            public Builder setErrorMessageText(String str) {
                str.getClass();
                this.errorMessageText_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setErrorMessageTextBytes(ByteString byteString) {
                byteString.getClass();
                this.errorMessageText_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setLiveTrackMessageErrorType(LiveTrackMessageErrorType liveTrackMessageErrorType) {
                liveTrackMessageErrorType.getClass();
                this.bitField0_ |= 2;
                this.liveTrackMessageErrorType_ = liveTrackMessageErrorType.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSessionIds(int i14, String str) {
                str.getClass();
                ensureSessionIdsIsMutable();
                this.sessionIds_.set(i14, str);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SendLiveTrackMessageError getDefaultInstanceForType() {
                return SendLiveTrackMessageError.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.sessionIds_ = LazyStringArrayList.emptyList();
                this.liveTrackMessageErrorType_ = 0;
                this.errorMessageText_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SendLiveTrackMessageError) {
                    return mergeFrom((SendLiveTrackMessageError) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SendLiveTrackMessageError sendLiveTrackMessageError) {
                if (sendLiveTrackMessageError == SendLiveTrackMessageError.getDefaultInstance()) {
                    return this;
                }
                if (!sendLiveTrackMessageError.sessionIds_.isEmpty()) {
                    if (this.sessionIds_.isEmpty()) {
                        this.sessionIds_ = sendLiveTrackMessageError.sessionIds_;
                        this.bitField0_ |= 1;
                    } else {
                        ensureSessionIdsIsMutable();
                        this.sessionIds_.addAll(sendLiveTrackMessageError.sessionIds_);
                    }
                    onChanged();
                }
                if (sendLiveTrackMessageError.hasLiveTrackMessageErrorType()) {
                    setLiveTrackMessageErrorType(sendLiveTrackMessageError.getLiveTrackMessageErrorType());
                }
                if (sendLiveTrackMessageError.hasErrorMessageText()) {
                    this.errorMessageText_ = sendLiveTrackMessageError.errorMessageText_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                mergeUnknownFields(sendLiveTrackMessageError.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageErrorOrBuilder
        public ProtocolStringList getSessionIdsList() {
            return this.sessionIds_;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SendLiveTrackMessageError getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SendLiveTrackMessageError parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SendLiveTrackMessageError) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SendLiveTrackMessageError parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SendLiveTrackMessageError parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SendLiveTrackMessageError parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SendLiveTrackMessageError parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SendLiveTrackMessageError parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SendLiveTrackMessageError parseFrom(InputStream inputStream) {
            return (SendLiveTrackMessageError) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SendLiveTrackMessageError parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SendLiveTrackMessageError) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SendLiveTrackMessageError parseFrom(CodedInputStream codedInputStream) {
            return (SendLiveTrackMessageError) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SendLiveTrackMessageError parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SendLiveTrackMessageError) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum LiveTrackMessageErrorType implements ProtocolMessageEnum {
            UNKNOWN_ERROR(0),
            SENDER_SESSION_INVALID(1),
            SENDER_SESSION_ENDED(2),
            RECIPIENT_SESSION_INVALID(3),
            RECIPIENT_SESSION_ENDED(4);

            public static final int RECIPIENT_SESSION_ENDED_VALUE = 4;
            public static final int RECIPIENT_SESSION_INVALID_VALUE = 3;
            public static final int SENDER_SESSION_ENDED_VALUE = 2;
            public static final int SENDER_SESSION_INVALID_VALUE = 1;
            public static final int UNKNOWN_ERROR_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<LiveTrackMessageErrorType> internalValueMap = new Internal.EnumLiteMap<LiveTrackMessageErrorType>() { // from class: com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageError.LiveTrackMessageErrorType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public LiveTrackMessageErrorType findValueByNumber(int i14) {
                    return LiveTrackMessageErrorType.forNumber(i14);
                }
            };
            private static final LiveTrackMessageErrorType[] VALUES = values();

            LiveTrackMessageErrorType(int i14) {
                this.value = i14;
            }

            public static LiveTrackMessageErrorType forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN_ERROR;
                }
                if (i14 == 1) {
                    return SENDER_SESSION_INVALID;
                }
                if (i14 == 2) {
                    return SENDER_SESSION_ENDED;
                }
                if (i14 == 3) {
                    return RECIPIENT_SESSION_INVALID;
                }
                if (i14 != 4) {
                    return null;
                }
                return RECIPIENT_SESSION_ENDED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return SendLiveTrackMessageError.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<LiveTrackMessageErrorType> internalGetValueMap() {
                return internalValueMap;
            }

            public static LiveTrackMessageErrorType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static LiveTrackMessageErrorType valueOf(int i14) {
                return forNumber(i14);
            }
        }

        private SendLiveTrackMessageError(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.sessionIds_ = LazyStringArrayList.emptyList();
            this.liveTrackMessageErrorType_ = 0;
            this.errorMessageText_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ SendLiveTrackMessageError(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class SendLiveTrackMessageRequest extends GeneratedMessageV3 implements SendLiveTrackMessageRequestOrBuilder {
        public static final int LIVE_TRACK_MESSAGE_BODY_FIELD_NUMBER = 2;
        public static final int RECIPIENT_SESSION_IDS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private LiveTrackMessageBody liveTrackMessageBody_;
        private byte memoizedIsInitialized;
        private LazyStringArrayList recipientSessionIds_;
        private static final SendLiveTrackMessageRequest DEFAULT_INSTANCE = new SendLiveTrackMessageRequest();

        @Deprecated
        public static final Parser<SendLiveTrackMessageRequest> PARSER = new AbstractParser<SendLiveTrackMessageRequest>() { // from class: com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageRequest.1
            @Override // com.google.protobuf.Parser
            public SendLiveTrackMessageRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SendLiveTrackMessageRequest.newBuilder();
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

        private SendLiveTrackMessageRequest() {
            this.recipientSessionIds_ = LazyStringArrayList.emptyList();
            this.memoizedIsInitialized = (byte) -1;
            this.recipientSessionIds_ = LazyStringArrayList.emptyList();
        }

        public static SendLiveTrackMessageRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_SendLiveTrackMessageRequest_descriptor;
        }

        public static Builder newBuilder(SendLiveTrackMessageRequest sendLiveTrackMessageRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sendLiveTrackMessageRequest);
        }

        public static SendLiveTrackMessageRequest parseDelimitedFrom(InputStream inputStream) {
            return (SendLiveTrackMessageRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SendLiveTrackMessageRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SendLiveTrackMessageRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SendLiveTrackMessageRequest)) {
                return super.equals(obj);
            }
            SendLiveTrackMessageRequest sendLiveTrackMessageRequest = (SendLiveTrackMessageRequest) obj;
            if (getRecipientSessionIdsList().equals(sendLiveTrackMessageRequest.getRecipientSessionIdsList()) && hasLiveTrackMessageBody() == sendLiveTrackMessageRequest.hasLiveTrackMessageBody()) {
                return (!hasLiveTrackMessageBody() || getLiveTrackMessageBody().equals(sendLiveTrackMessageRequest.getLiveTrackMessageBody())) && getUnknownFields().equals(sendLiveTrackMessageRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageRequestOrBuilder
        public LiveTrackMessageBody getLiveTrackMessageBody() {
            LiveTrackMessageBody liveTrackMessageBody = this.liveTrackMessageBody_;
            return liveTrackMessageBody == null ? LiveTrackMessageBody.getDefaultInstance() : liveTrackMessageBody;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageRequestOrBuilder
        public LiveTrackMessageBodyOrBuilder getLiveTrackMessageBodyOrBuilder() {
            LiveTrackMessageBody liveTrackMessageBody = this.liveTrackMessageBody_;
            return liveTrackMessageBody == null ? LiveTrackMessageBody.getDefaultInstance() : liveTrackMessageBody;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SendLiveTrackMessageRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageRequestOrBuilder
        public String getRecipientSessionIds(int i14) {
            return this.recipientSessionIds_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageRequestOrBuilder
        public ByteString getRecipientSessionIdsBytes(int i14) {
            return this.recipientSessionIds_.getByteString(i14);
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageRequestOrBuilder
        public int getRecipientSessionIdsCount() {
            return this.recipientSessionIds_.size();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iD = 0;
            for (int i15 = 0; i15 < this.recipientSessionIds_.size(); i15++) {
                iD = f3.d(this.recipientSessionIds_, i15, iD);
            }
            int size = getRecipientSessionIdsList().size() + iD;
            if ((this.bitField0_ & 1) != 0) {
                size += CodedOutputStream.computeMessageSize(2, getLiveTrackMessageBody());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageRequestOrBuilder
        public boolean hasLiveTrackMessageBody() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getRecipientSessionIdsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getRecipientSessionIdsList().hashCode();
            }
            if (hasLiveTrackMessageBody()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getLiveTrackMessageBody().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_SendLiveTrackMessageRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SendLiveTrackMessageRequest.class, Builder.class);
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
            if (!hasLiveTrackMessageBody()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (getLiveTrackMessageBody().isInitialized()) {
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
            return new SendLiveTrackMessageRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            int iE = 0;
            while (iE < this.recipientSessionIds_.size()) {
                iE = f3.e(this.recipientSessionIds_, iE, codedOutputStream, 1, iE, 1);
            }
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(2, getLiveTrackMessageBody());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SendLiveTrackMessageRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<LiveTrackMessageBody, LiveTrackMessageBody.Builder, LiveTrackMessageBodyOrBuilder> liveTrackMessageBodyBuilder_;
            private LiveTrackMessageBody liveTrackMessageBody_;
            private LazyStringArrayList recipientSessionIds_;

            private Builder() {
                this.recipientSessionIds_ = LazyStringArrayList.emptyList();
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(SendLiveTrackMessageRequest sendLiveTrackMessageRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    this.recipientSessionIds_.makeImmutable();
                    sendLiveTrackMessageRequest.recipientSessionIds_ = this.recipientSessionIds_;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<LiveTrackMessageBody, LiveTrackMessageBody.Builder, LiveTrackMessageBodyOrBuilder> singleFieldBuilderV3 = this.liveTrackMessageBodyBuilder_;
                    sendLiveTrackMessageRequest.liveTrackMessageBody_ = singleFieldBuilderV3 == null ? this.liveTrackMessageBody_ : (LiveTrackMessageBody) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                sendLiveTrackMessageRequest.bitField0_ = i14 | sendLiveTrackMessageRequest.bitField0_;
            }

            private void ensureRecipientSessionIdsIsMutable() {
                if (!this.recipientSessionIds_.isModifiable()) {
                    this.recipientSessionIds_ = new LazyStringArrayList((LazyStringList) this.recipientSessionIds_);
                }
                this.bitField0_ |= 1;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_SendLiveTrackMessageRequest_descriptor;
            }

            private SingleFieldBuilderV3<LiveTrackMessageBody, LiveTrackMessageBody.Builder, LiveTrackMessageBodyOrBuilder> getLiveTrackMessageBodyFieldBuilder() {
                if (this.liveTrackMessageBodyBuilder_ == null) {
                    this.liveTrackMessageBodyBuilder_ = new SingleFieldBuilderV3<>(getLiveTrackMessageBody(), getParentForChildren(), isClean());
                    this.liveTrackMessageBody_ = null;
                }
                return this.liveTrackMessageBodyBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getLiveTrackMessageBodyFieldBuilder();
                }
            }

            public Builder addAllRecipientSessionIds(Iterable<String> iterable) {
                ensureRecipientSessionIdsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.recipientSessionIds_);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder addRecipientSessionIds(String str) {
                str.getClass();
                ensureRecipientSessionIdsIsMutable();
                this.recipientSessionIds_.add(str);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder addRecipientSessionIdsBytes(ByteString byteString) {
                byteString.getClass();
                ensureRecipientSessionIdsIsMutable();
                this.recipientSessionIds_.add(byteString);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SendLiveTrackMessageRequest build() {
                SendLiveTrackMessageRequest sendLiveTrackMessageRequestBuildPartial = buildPartial();
                if (sendLiveTrackMessageRequestBuildPartial.isInitialized()) {
                    return sendLiveTrackMessageRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sendLiveTrackMessageRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SendLiveTrackMessageRequest buildPartial() {
                SendLiveTrackMessageRequest sendLiveTrackMessageRequest = new SendLiveTrackMessageRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sendLiveTrackMessageRequest);
                }
                onBuilt();
                return sendLiveTrackMessageRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.recipientSessionIds_ = LazyStringArrayList.emptyList();
                this.liveTrackMessageBody_ = null;
                SingleFieldBuilderV3<LiveTrackMessageBody, LiveTrackMessageBody.Builder, LiveTrackMessageBodyOrBuilder> singleFieldBuilderV3 = this.liveTrackMessageBodyBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.liveTrackMessageBodyBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLiveTrackMessageBody() {
                this.bitField0_ &= -3;
                this.liveTrackMessageBody_ = null;
                SingleFieldBuilderV3<LiveTrackMessageBody, LiveTrackMessageBody.Builder, LiveTrackMessageBodyOrBuilder> singleFieldBuilderV3 = this.liveTrackMessageBodyBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.liveTrackMessageBodyBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearRecipientSessionIds() {
                this.recipientSessionIds_ = LazyStringArrayList.emptyList();
                this.bitField0_ &= -2;
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
                return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_SendLiveTrackMessageRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageRequestOrBuilder
            public LiveTrackMessageBody getLiveTrackMessageBody() {
                SingleFieldBuilderV3<LiveTrackMessageBody, LiveTrackMessageBody.Builder, LiveTrackMessageBodyOrBuilder> singleFieldBuilderV3 = this.liveTrackMessageBodyBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LiveTrackMessageBody) singleFieldBuilderV3.getMessage();
                }
                LiveTrackMessageBody liveTrackMessageBody = this.liveTrackMessageBody_;
                return liveTrackMessageBody == null ? LiveTrackMessageBody.getDefaultInstance() : liveTrackMessageBody;
            }

            public LiveTrackMessageBody.Builder getLiveTrackMessageBodyBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (LiveTrackMessageBody.Builder) getLiveTrackMessageBodyFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageRequestOrBuilder
            public LiveTrackMessageBodyOrBuilder getLiveTrackMessageBodyOrBuilder() {
                SingleFieldBuilderV3<LiveTrackMessageBody, LiveTrackMessageBody.Builder, LiveTrackMessageBodyOrBuilder> singleFieldBuilderV3 = this.liveTrackMessageBodyBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LiveTrackMessageBodyOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LiveTrackMessageBody liveTrackMessageBody = this.liveTrackMessageBody_;
                return liveTrackMessageBody == null ? LiveTrackMessageBody.getDefaultInstance() : liveTrackMessageBody;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageRequestOrBuilder
            public String getRecipientSessionIds(int i14) {
                return this.recipientSessionIds_.get(i14);
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageRequestOrBuilder
            public ByteString getRecipientSessionIdsBytes(int i14) {
                return this.recipientSessionIds_.getByteString(i14);
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageRequestOrBuilder
            public int getRecipientSessionIdsCount() {
                return this.recipientSessionIds_.size();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageRequestOrBuilder
            public ProtocolStringList getRecipientSessionIdsList() {
                this.recipientSessionIds_.makeImmutable();
                return this.recipientSessionIds_;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageRequestOrBuilder
            public boolean hasLiveTrackMessageBody() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_SendLiveTrackMessageRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SendLiveTrackMessageRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasLiveTrackMessageBody() && getLiveTrackMessageBody().isInitialized();
            }

            public Builder mergeFrom(SendLiveTrackMessageRequest sendLiveTrackMessageRequest) {
                if (sendLiveTrackMessageRequest == SendLiveTrackMessageRequest.getDefaultInstance()) {
                    return this;
                }
                if (!sendLiveTrackMessageRequest.recipientSessionIds_.isEmpty()) {
                    if (this.recipientSessionIds_.isEmpty()) {
                        this.recipientSessionIds_ = sendLiveTrackMessageRequest.recipientSessionIds_;
                        this.bitField0_ |= 1;
                    } else {
                        ensureRecipientSessionIdsIsMutable();
                        this.recipientSessionIds_.addAll(sendLiveTrackMessageRequest.recipientSessionIds_);
                    }
                    onChanged();
                }
                if (sendLiveTrackMessageRequest.hasLiveTrackMessageBody()) {
                    mergeLiveTrackMessageBody(sendLiveTrackMessageRequest.getLiveTrackMessageBody());
                }
                mergeUnknownFields(sendLiveTrackMessageRequest.getUnknownFields());
                onChanged();
                return this;
            }

            public Builder mergeLiveTrackMessageBody(LiveTrackMessageBody liveTrackMessageBody) {
                LiveTrackMessageBody liveTrackMessageBody2;
                SingleFieldBuilderV3<LiveTrackMessageBody, LiveTrackMessageBody.Builder, LiveTrackMessageBodyOrBuilder> singleFieldBuilderV3 = this.liveTrackMessageBodyBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(liveTrackMessageBody);
                } else if ((this.bitField0_ & 2) == 0 || (liveTrackMessageBody2 = this.liveTrackMessageBody_) == null || liveTrackMessageBody2 == LiveTrackMessageBody.getDefaultInstance()) {
                    this.liveTrackMessageBody_ = liveTrackMessageBody;
                } else {
                    getLiveTrackMessageBodyBuilder().mergeFrom(liveTrackMessageBody);
                }
                if (this.liveTrackMessageBody_ != null) {
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

            public Builder setLiveTrackMessageBody(LiveTrackMessageBody.Builder builder) {
                SingleFieldBuilderV3<LiveTrackMessageBody, LiveTrackMessageBody.Builder, LiveTrackMessageBodyOrBuilder> singleFieldBuilderV3 = this.liveTrackMessageBodyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.liveTrackMessageBody_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setRecipientSessionIds(int i14, String str) {
                str.getClass();
                ensureRecipientSessionIdsIsMutable();
                this.recipientSessionIds_.set(i14, str);
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
            public SendLiveTrackMessageRequest getDefaultInstanceForType() {
                return SendLiveTrackMessageRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.recipientSessionIds_ = LazyStringArrayList.emptyList();
                maybeForceBuilderInitialization();
            }

            public Builder setLiveTrackMessageBody(LiveTrackMessageBody liveTrackMessageBody) {
                SingleFieldBuilderV3<LiveTrackMessageBody, LiveTrackMessageBody.Builder, LiveTrackMessageBodyOrBuilder> singleFieldBuilderV3 = this.liveTrackMessageBodyBuilder_;
                if (singleFieldBuilderV3 == null) {
                    liveTrackMessageBody.getClass();
                    this.liveTrackMessageBody_ = liveTrackMessageBody;
                } else {
                    singleFieldBuilderV3.setMessage(liveTrackMessageBody);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SendLiveTrackMessageRequest) {
                    return mergeFrom((SendLiveTrackMessageRequest) message);
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
                                if (tag == 10) {
                                    ByteString bytes = codedInputStream.readBytes();
                                    ensureRecipientSessionIdsIsMutable();
                                    this.recipientSessionIds_.add(bytes);
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    codedInputStream.readMessage(getLiveTrackMessageBodyFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
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

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageRequestOrBuilder
        public ProtocolStringList getRecipientSessionIdsList() {
            return this.recipientSessionIds_;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SendLiveTrackMessageRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SendLiveTrackMessageRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SendLiveTrackMessageRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SendLiveTrackMessageRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SendLiveTrackMessageRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SendLiveTrackMessageRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SendLiveTrackMessageRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SendLiveTrackMessageRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SendLiveTrackMessageRequest parseFrom(InputStream inputStream) {
            return (SendLiveTrackMessageRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SendLiveTrackMessageRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SendLiveTrackMessageRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SendLiveTrackMessageRequest parseFrom(CodedInputStream codedInputStream) {
            return (SendLiveTrackMessageRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        private SendLiveTrackMessageRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.recipientSessionIds_ = LazyStringArrayList.emptyList();
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SendLiveTrackMessageRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SendLiveTrackMessageRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ SendLiveTrackMessageRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class SendLiveTrackMessageResponse extends GeneratedMessageV3 implements SendLiveTrackMessageResponseOrBuilder {
        private static final SendLiveTrackMessageResponse DEFAULT_INSTANCE = new SendLiveTrackMessageResponse();

        @Deprecated
        public static final Parser<SendLiveTrackMessageResponse> PARSER = new AbstractParser<SendLiveTrackMessageResponse>() { // from class: com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageResponse.1
            @Override // com.google.protobuf.Parser
            public SendLiveTrackMessageResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SendLiveTrackMessageResponse.newBuilder();
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
        public static final int SEND_LIVE_TRACK_MESSAGE_ERRORS_FIELD_NUMBER = 2;
        public static final int SEND_LIVE_TRACK_MESSAGE_STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private List<SendLiveTrackMessageError> sendLiveTrackMessageErrors_;
        private int sendLiveTrackMessageStatus_;

        private SendLiveTrackMessageResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.sendLiveTrackMessageStatus_ = 0;
            this.sendLiveTrackMessageErrors_ = Collections.EMPTY_LIST;
        }

        public static SendLiveTrackMessageResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_SendLiveTrackMessageResponse_descriptor;
        }

        public static Builder newBuilder(SendLiveTrackMessageResponse sendLiveTrackMessageResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sendLiveTrackMessageResponse);
        }

        public static SendLiveTrackMessageResponse parseDelimitedFrom(InputStream inputStream) {
            return (SendLiveTrackMessageResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SendLiveTrackMessageResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SendLiveTrackMessageResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SendLiveTrackMessageResponse)) {
                return super.equals(obj);
            }
            SendLiveTrackMessageResponse sendLiveTrackMessageResponse = (SendLiveTrackMessageResponse) obj;
            if (hasSendLiveTrackMessageStatus() != sendLiveTrackMessageResponse.hasSendLiveTrackMessageStatus()) {
                return false;
            }
            return (!hasSendLiveTrackMessageStatus() || this.sendLiveTrackMessageStatus_ == sendLiveTrackMessageResponse.sendLiveTrackMessageStatus_) && getSendLiveTrackMessageErrorsList().equals(sendLiveTrackMessageResponse.getSendLiveTrackMessageErrorsList()) && getUnknownFields().equals(sendLiveTrackMessageResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SendLiveTrackMessageResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageResponseOrBuilder
        public SendLiveTrackMessageError getSendLiveTrackMessageErrors(int i14) {
            return this.sendLiveTrackMessageErrors_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageResponseOrBuilder
        public int getSendLiveTrackMessageErrorsCount() {
            return this.sendLiveTrackMessageErrors_.size();
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageResponseOrBuilder
        public List<SendLiveTrackMessageError> getSendLiveTrackMessageErrorsList() {
            return this.sendLiveTrackMessageErrors_;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageResponseOrBuilder
        public SendLiveTrackMessageErrorOrBuilder getSendLiveTrackMessageErrorsOrBuilder(int i14) {
            return this.sendLiveTrackMessageErrors_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageResponseOrBuilder
        public List<? extends SendLiveTrackMessageErrorOrBuilder> getSendLiveTrackMessageErrorsOrBuilderList() {
            return this.sendLiveTrackMessageErrors_;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageResponseOrBuilder
        public SendLiveTrackMessageStatus getSendLiveTrackMessageStatus() {
            SendLiveTrackMessageStatus sendLiveTrackMessageStatusForNumber = SendLiveTrackMessageStatus.forNumber(this.sendLiveTrackMessageStatus_);
            return sendLiveTrackMessageStatusForNumber == null ? SendLiveTrackMessageStatus.OK : sendLiveTrackMessageStatusForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.sendLiveTrackMessageStatus_) : 0;
            for (int i15 = 0; i15 < this.sendLiveTrackMessageErrors_.size(); i15++) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, this.sendLiveTrackMessageErrors_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageResponseOrBuilder
        public boolean hasSendLiveTrackMessageStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSendLiveTrackMessageStatus()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.sendLiveTrackMessageStatus_;
            }
            if (getSendLiveTrackMessageErrorsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSendLiveTrackMessageErrorsList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_SendLiveTrackMessageResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SendLiveTrackMessageResponse.class, Builder.class);
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
            for (int i14 = 0; i14 < getSendLiveTrackMessageErrorsCount(); i14++) {
                if (!getSendLiveTrackMessageErrors(i14).isInitialized()) {
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
            return new SendLiveTrackMessageResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.sendLiveTrackMessageStatus_);
            }
            for (int i14 = 0; i14 < this.sendLiveTrackMessageErrors_.size(); i14++) {
                codedOutputStream.writeMessage(2, this.sendLiveTrackMessageErrors_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SendLiveTrackMessageResponseOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<SendLiveTrackMessageError, SendLiveTrackMessageError.Builder, SendLiveTrackMessageErrorOrBuilder> sendLiveTrackMessageErrorsBuilder_;
            private List<SendLiveTrackMessageError> sendLiveTrackMessageErrors_;
            private int sendLiveTrackMessageStatus_;

            private Builder() {
                this.sendLiveTrackMessageStatus_ = 0;
                this.sendLiveTrackMessageErrors_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(SendLiveTrackMessageResponse sendLiveTrackMessageResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    sendLiveTrackMessageResponse.sendLiveTrackMessageStatus_ = this.sendLiveTrackMessageStatus_;
                } else {
                    i14 = 0;
                }
                sendLiveTrackMessageResponse.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(SendLiveTrackMessageResponse sendLiveTrackMessageResponse) {
                RepeatedFieldBuilderV3<SendLiveTrackMessageError, SendLiveTrackMessageError.Builder, SendLiveTrackMessageErrorOrBuilder> repeatedFieldBuilderV3 = this.sendLiveTrackMessageErrorsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    sendLiveTrackMessageResponse.sendLiveTrackMessageErrors_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 2) != 0) {
                    this.sendLiveTrackMessageErrors_ = Collections.unmodifiableList(this.sendLiveTrackMessageErrors_);
                    this.bitField0_ &= -3;
                }
                sendLiveTrackMessageResponse.sendLiveTrackMessageErrors_ = this.sendLiveTrackMessageErrors_;
            }

            private void ensureSendLiveTrackMessageErrorsIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.sendLiveTrackMessageErrors_ = new ArrayList(this.sendLiveTrackMessageErrors_);
                    this.bitField0_ |= 2;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_SendLiveTrackMessageResponse_descriptor;
            }

            private RepeatedFieldBuilderV3<SendLiveTrackMessageError, SendLiveTrackMessageError.Builder, SendLiveTrackMessageErrorOrBuilder> getSendLiveTrackMessageErrorsFieldBuilder() {
                if (this.sendLiveTrackMessageErrorsBuilder_ == null) {
                    this.sendLiveTrackMessageErrorsBuilder_ = new RepeatedFieldBuilderV3<>(this.sendLiveTrackMessageErrors_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.sendLiveTrackMessageErrors_ = null;
                }
                return this.sendLiveTrackMessageErrorsBuilder_;
            }

            public Builder addAllSendLiveTrackMessageErrors(Iterable<? extends SendLiveTrackMessageError> iterable) {
                RepeatedFieldBuilderV3<SendLiveTrackMessageError, SendLiveTrackMessageError.Builder, SendLiveTrackMessageErrorOrBuilder> repeatedFieldBuilderV3 = this.sendLiveTrackMessageErrorsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureSendLiveTrackMessageErrorsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.sendLiveTrackMessageErrors_);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addSendLiveTrackMessageErrors(SendLiveTrackMessageError.Builder builder) {
                RepeatedFieldBuilderV3<SendLiveTrackMessageError, SendLiveTrackMessageError.Builder, SendLiveTrackMessageErrorOrBuilder> repeatedFieldBuilderV3 = this.sendLiveTrackMessageErrorsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureSendLiveTrackMessageErrorsIsMutable();
                this.sendLiveTrackMessageErrors_.add(builder.build());
                onChanged();
                return this;
            }

            public SendLiveTrackMessageError.Builder addSendLiveTrackMessageErrorsBuilder() {
                return (SendLiveTrackMessageError.Builder) getSendLiveTrackMessageErrorsFieldBuilder().addBuilder(SendLiveTrackMessageError.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SendLiveTrackMessageResponse build() {
                SendLiveTrackMessageResponse sendLiveTrackMessageResponseBuildPartial = buildPartial();
                if (sendLiveTrackMessageResponseBuildPartial.isInitialized()) {
                    return sendLiveTrackMessageResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sendLiveTrackMessageResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SendLiveTrackMessageResponse buildPartial() {
                SendLiveTrackMessageResponse sendLiveTrackMessageResponse = new SendLiveTrackMessageResponse(this);
                buildPartialRepeatedFields(sendLiveTrackMessageResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(sendLiveTrackMessageResponse);
                }
                onBuilt();
                return sendLiveTrackMessageResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.sendLiveTrackMessageStatus_ = 0;
                RepeatedFieldBuilderV3<SendLiveTrackMessageError, SendLiveTrackMessageError.Builder, SendLiveTrackMessageErrorOrBuilder> repeatedFieldBuilderV3 = this.sendLiveTrackMessageErrorsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.sendLiveTrackMessageErrors_ = Collections.EMPTY_LIST;
                } else {
                    this.sendLiveTrackMessageErrors_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -3;
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

            public Builder clearSendLiveTrackMessageErrors() {
                RepeatedFieldBuilderV3<SendLiveTrackMessageError, SendLiveTrackMessageError.Builder, SendLiveTrackMessageErrorOrBuilder> repeatedFieldBuilderV3 = this.sendLiveTrackMessageErrorsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.sendLiveTrackMessageErrors_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearSendLiveTrackMessageStatus() {
                this.bitField0_ &= -2;
                this.sendLiveTrackMessageStatus_ = 0;
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
                return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_SendLiveTrackMessageResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageResponseOrBuilder
            public SendLiveTrackMessageError getSendLiveTrackMessageErrors(int i14) {
                RepeatedFieldBuilderV3<SendLiveTrackMessageError, SendLiveTrackMessageError.Builder, SendLiveTrackMessageErrorOrBuilder> repeatedFieldBuilderV3 = this.sendLiveTrackMessageErrorsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.sendLiveTrackMessageErrors_.get(i14) : (SendLiveTrackMessageError) repeatedFieldBuilderV3.getMessage(i14);
            }

            public SendLiveTrackMessageError.Builder getSendLiveTrackMessageErrorsBuilder(int i14) {
                return (SendLiveTrackMessageError.Builder) getSendLiveTrackMessageErrorsFieldBuilder().getBuilder(i14);
            }

            public List<SendLiveTrackMessageError.Builder> getSendLiveTrackMessageErrorsBuilderList() {
                return getSendLiveTrackMessageErrorsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageResponseOrBuilder
            public int getSendLiveTrackMessageErrorsCount() {
                RepeatedFieldBuilderV3<SendLiveTrackMessageError, SendLiveTrackMessageError.Builder, SendLiveTrackMessageErrorOrBuilder> repeatedFieldBuilderV3 = this.sendLiveTrackMessageErrorsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.sendLiveTrackMessageErrors_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageResponseOrBuilder
            public List<SendLiveTrackMessageError> getSendLiveTrackMessageErrorsList() {
                RepeatedFieldBuilderV3<SendLiveTrackMessageError, SendLiveTrackMessageError.Builder, SendLiveTrackMessageErrorOrBuilder> repeatedFieldBuilderV3 = this.sendLiveTrackMessageErrorsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.sendLiveTrackMessageErrors_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageResponseOrBuilder
            public SendLiveTrackMessageErrorOrBuilder getSendLiveTrackMessageErrorsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<SendLiveTrackMessageError, SendLiveTrackMessageError.Builder, SendLiveTrackMessageErrorOrBuilder> repeatedFieldBuilderV3 = this.sendLiveTrackMessageErrorsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.sendLiveTrackMessageErrors_.get(i14) : (SendLiveTrackMessageErrorOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageResponseOrBuilder
            public List<? extends SendLiveTrackMessageErrorOrBuilder> getSendLiveTrackMessageErrorsOrBuilderList() {
                RepeatedFieldBuilderV3<SendLiveTrackMessageError, SendLiveTrackMessageError.Builder, SendLiveTrackMessageErrorOrBuilder> repeatedFieldBuilderV3 = this.sendLiveTrackMessageErrorsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.sendLiveTrackMessageErrors_);
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageResponseOrBuilder
            public SendLiveTrackMessageStatus getSendLiveTrackMessageStatus() {
                SendLiveTrackMessageStatus sendLiveTrackMessageStatusForNumber = SendLiveTrackMessageStatus.forNumber(this.sendLiveTrackMessageStatus_);
                return sendLiveTrackMessageStatusForNumber == null ? SendLiveTrackMessageStatus.OK : sendLiveTrackMessageStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageResponseOrBuilder
            public boolean hasSendLiveTrackMessageStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDILiveTrackMessagingProto.internal_static_GDI_Proto_LiveTrackMessaging_SendLiveTrackMessageResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SendLiveTrackMessageResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i14 = 0; i14 < getSendLiveTrackMessageErrorsCount(); i14++) {
                    if (!getSendLiveTrackMessageErrors(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(SendLiveTrackMessageResponse sendLiveTrackMessageResponse) {
                if (sendLiveTrackMessageResponse == SendLiveTrackMessageResponse.getDefaultInstance()) {
                    return this;
                }
                if (sendLiveTrackMessageResponse.hasSendLiveTrackMessageStatus()) {
                    setSendLiveTrackMessageStatus(sendLiveTrackMessageResponse.getSendLiveTrackMessageStatus());
                }
                if (this.sendLiveTrackMessageErrorsBuilder_ == null) {
                    if (!sendLiveTrackMessageResponse.sendLiveTrackMessageErrors_.isEmpty()) {
                        if (this.sendLiveTrackMessageErrors_.isEmpty()) {
                            this.sendLiveTrackMessageErrors_ = sendLiveTrackMessageResponse.sendLiveTrackMessageErrors_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureSendLiveTrackMessageErrorsIsMutable();
                            this.sendLiveTrackMessageErrors_.addAll(sendLiveTrackMessageResponse.sendLiveTrackMessageErrors_);
                        }
                        onChanged();
                    }
                } else if (!sendLiveTrackMessageResponse.sendLiveTrackMessageErrors_.isEmpty()) {
                    boolean zIsEmpty = this.sendLiveTrackMessageErrorsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<SendLiveTrackMessageError, SendLiveTrackMessageError.Builder, SendLiveTrackMessageErrorOrBuilder> repeatedFieldBuilderV3 = this.sendLiveTrackMessageErrorsBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.sendLiveTrackMessageErrorsBuilder_ = null;
                        this.sendLiveTrackMessageErrors_ = sendLiveTrackMessageResponse.sendLiveTrackMessageErrors_;
                        this.bitField0_ &= -3;
                        this.sendLiveTrackMessageErrorsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getSendLiveTrackMessageErrorsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(sendLiveTrackMessageResponse.sendLiveTrackMessageErrors_);
                    }
                }
                mergeUnknownFields(sendLiveTrackMessageResponse.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeSendLiveTrackMessageErrors(int i14) {
                RepeatedFieldBuilderV3<SendLiveTrackMessageError, SendLiveTrackMessageError.Builder, SendLiveTrackMessageErrorOrBuilder> repeatedFieldBuilderV3 = this.sendLiveTrackMessageErrorsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureSendLiveTrackMessageErrorsIsMutable();
                this.sendLiveTrackMessageErrors_.remove(i14);
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

            public Builder setSendLiveTrackMessageErrors(int i14, SendLiveTrackMessageError.Builder builder) {
                RepeatedFieldBuilderV3<SendLiveTrackMessageError, SendLiveTrackMessageError.Builder, SendLiveTrackMessageErrorOrBuilder> repeatedFieldBuilderV3 = this.sendLiveTrackMessageErrorsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureSendLiveTrackMessageErrorsIsMutable();
                this.sendLiveTrackMessageErrors_.set(i14, builder.build());
                onChanged();
                return this;
            }

            public Builder setSendLiveTrackMessageStatus(SendLiveTrackMessageStatus sendLiveTrackMessageStatus) {
                sendLiveTrackMessageStatus.getClass();
                this.bitField0_ |= 1;
                this.sendLiveTrackMessageStatus_ = sendLiveTrackMessageStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SendLiveTrackMessageResponse getDefaultInstanceForType() {
                return SendLiveTrackMessageResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.sendLiveTrackMessageStatus_ = 0;
                this.sendLiveTrackMessageErrors_ = Collections.EMPTY_LIST;
            }

            public SendLiveTrackMessageError.Builder addSendLiveTrackMessageErrorsBuilder(int i14) {
                return (SendLiveTrackMessageError.Builder) getSendLiveTrackMessageErrorsFieldBuilder().addBuilder(i14, SendLiveTrackMessageError.getDefaultInstance());
            }

            public Builder addSendLiveTrackMessageErrors(int i14, SendLiveTrackMessageError sendLiveTrackMessageError) {
                RepeatedFieldBuilderV3<SendLiveTrackMessageError, SendLiveTrackMessageError.Builder, SendLiveTrackMessageErrorOrBuilder> repeatedFieldBuilderV3 = this.sendLiveTrackMessageErrorsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    sendLiveTrackMessageError.getClass();
                    ensureSendLiveTrackMessageErrorsIsMutable();
                    this.sendLiveTrackMessageErrors_.add(i14, sendLiveTrackMessageError);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, sendLiveTrackMessageError);
                return this;
            }

            public Builder setSendLiveTrackMessageErrors(int i14, SendLiveTrackMessageError sendLiveTrackMessageError) {
                RepeatedFieldBuilderV3<SendLiveTrackMessageError, SendLiveTrackMessageError.Builder, SendLiveTrackMessageErrorOrBuilder> repeatedFieldBuilderV3 = this.sendLiveTrackMessageErrorsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    sendLiveTrackMessageError.getClass();
                    ensureSendLiveTrackMessageErrorsIsMutable();
                    this.sendLiveTrackMessageErrors_.set(i14, sendLiveTrackMessageError);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, sendLiveTrackMessageError);
                return this;
            }

            public Builder addSendLiveTrackMessageErrors(SendLiveTrackMessageError sendLiveTrackMessageError) {
                RepeatedFieldBuilderV3<SendLiveTrackMessageError, SendLiveTrackMessageError.Builder, SendLiveTrackMessageErrorOrBuilder> repeatedFieldBuilderV3 = this.sendLiveTrackMessageErrorsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    sendLiveTrackMessageError.getClass();
                    ensureSendLiveTrackMessageErrorsIsMutable();
                    this.sendLiveTrackMessageErrors_.add(sendLiveTrackMessageError);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(sendLiveTrackMessageError);
                return this;
            }

            public Builder addSendLiveTrackMessageErrors(int i14, SendLiveTrackMessageError.Builder builder) {
                RepeatedFieldBuilderV3<SendLiveTrackMessageError, SendLiveTrackMessageError.Builder, SendLiveTrackMessageErrorOrBuilder> repeatedFieldBuilderV3 = this.sendLiveTrackMessageErrorsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureSendLiveTrackMessageErrorsIsMutable();
                    this.sendLiveTrackMessageErrors_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SendLiveTrackMessageResponse) {
                    return mergeFrom((SendLiveTrackMessageResponse) message);
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
                                    if (SendLiveTrackMessageStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.sendLiveTrackMessageStatus_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    SendLiveTrackMessageError sendLiveTrackMessageError = (SendLiveTrackMessageError) codedInputStream.readMessage(SendLiveTrackMessageError.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<SendLiveTrackMessageError, SendLiveTrackMessageError.Builder, SendLiveTrackMessageErrorOrBuilder> repeatedFieldBuilderV3 = this.sendLiveTrackMessageErrorsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureSendLiveTrackMessageErrorsIsMutable();
                                        this.sendLiveTrackMessageErrors_.add(sendLiveTrackMessageError);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(sendLiveTrackMessageError);
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
        public SendLiveTrackMessageResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SendLiveTrackMessageResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SendLiveTrackMessageResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SendLiveTrackMessageResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SendLiveTrackMessageResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SendLiveTrackMessageResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SendLiveTrackMessageResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SendLiveTrackMessageResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private SendLiveTrackMessageResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.sendLiveTrackMessageStatus_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SendLiveTrackMessageResponse parseFrom(InputStream inputStream) {
            return (SendLiveTrackMessageResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SendLiveTrackMessageResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SendLiveTrackMessageResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ SendLiveTrackMessageResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SendLiveTrackMessageResponse parseFrom(CodedInputStream codedInputStream) {
            return (SendLiveTrackMessageResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SendLiveTrackMessageResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SendLiveTrackMessageResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum SendLiveTrackMessageStatus implements ProtocolMessageEnum {
            OK(0),
            UNKNOWN_ERROR(1),
            NETWORK_FAILURE(2),
            TIMEOUT(3),
            SERVER_ERROR(4),
            INVALID_SERVER_RESPONSE(5),
            NOT_LIVE_TRACKING(6),
            EMPTY_SESSION_IDS(7);

            public static final int EMPTY_SESSION_IDS_VALUE = 7;
            public static final int INVALID_SERVER_RESPONSE_VALUE = 5;
            public static final int NETWORK_FAILURE_VALUE = 2;
            public static final int NOT_LIVE_TRACKING_VALUE = 6;
            public static final int OK_VALUE = 0;
            public static final int SERVER_ERROR_VALUE = 4;
            public static final int TIMEOUT_VALUE = 3;
            public static final int UNKNOWN_ERROR_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<SendLiveTrackMessageStatus> internalValueMap = new Internal.EnumLiteMap<SendLiveTrackMessageStatus>() { // from class: com.garmin.proto.generated.GDILiveTrackMessagingProto.SendLiveTrackMessageResponse.SendLiveTrackMessageStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SendLiveTrackMessageStatus findValueByNumber(int i14) {
                    return SendLiveTrackMessageStatus.forNumber(i14);
                }
            };
            private static final SendLiveTrackMessageStatus[] VALUES = values();

            SendLiveTrackMessageStatus(int i14) {
                this.value = i14;
            }

            public static SendLiveTrackMessageStatus forNumber(int i14) {
                switch (i14) {
                    case 0:
                        return OK;
                    case 1:
                        return UNKNOWN_ERROR;
                    case 2:
                        return NETWORK_FAILURE;
                    case 3:
                        return TIMEOUT;
                    case 4:
                        return SERVER_ERROR;
                    case 5:
                        return INVALID_SERVER_RESPONSE;
                    case 6:
                        return NOT_LIVE_TRACKING;
                    case 7:
                        return EMPTY_SESSION_IDS;
                    default:
                        return null;
                }
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return SendLiveTrackMessageResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<SendLiveTrackMessageStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static SendLiveTrackMessageStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static SendLiveTrackMessageStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
