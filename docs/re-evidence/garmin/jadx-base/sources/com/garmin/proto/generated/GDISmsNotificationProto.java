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
import com.google.protobuf.GeneratedMessage;
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
import java.util.Iterator;
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes6.dex */
public final class GDISmsNotificationProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0018GDISmsNotification.proto\u0012\u0019GDI.Proto.SmsNotification\u001a\rGDICore.proto\"Ó\u0003\n\u0016SmsNotificationService\u0012R\n\u0018sms_send_message_request\u0018\u0001 \u0001(\u000b20.GDI.Proto.SmsNotification.SmsSendMessageRequest\u0012T\n\u0019sms_send_message_response\u0018\u0002 \u0001(\u000b21.GDI.Proto.SmsNotification.SmsSendMessageResponse\u0012i\n$sms_canned_list_changed_notification\u0018\u0003 \u0001(\u000b2;.GDI.Proto.SmsNotification.SmsCannedListChangedNotification\u0012P\n\u0017sms_canned_list_request\u0018\u0004 \u0001(\u000b2/.GDI.Proto.SmsNotification.SmsCannedListRequest\u0012R\n\u0018sms_canned_list_response\u0018\u0005 \u0001(\u000b20.GDI.Proto.SmsNotification.SmsCannedListResponse\"A\n\u0015SmsSendMessageRequest\u0012\u0017\n\u000freceiver_number\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007message\u0018\u0002 \u0001(\t\"¥\u0001\n\u0016SmsSendMessageResponse\u0012Y\n\u0006status\u0018\u0001 \u0001(\u000e2@.GDI.Proto.SmsNotification.SmsSendMessageResponse.ResponseStatus:\u0007SUCCESS\"0\n\u000eResponseStatus\u0012\u000b\n\u0007SUCCESS\u0010\u0000\u0012\u0011\n\rGENERIC_ERROR\u0010\u0001\"d\n SmsCannedListChangedNotification\u0012@\n\rchanged_types\u0018\u0001 \u0003(\u000e2).GDI.Proto.SmsNotification.CannedListType\"Z\n\u0014SmsCannedListRequest\u0012B\n\u000frequested_types\u0018\u0001 \u0003(\u000e2).GDI.Proto.SmsNotification.CannedListType\"[\n\rSmsCannedList\u00127\n\u0004type\u0018\u0001 \u0001(\u000e2).GDI.Proto.SmsNotification.CannedListType\u0012\u0011\n\tresponses\u0018\u0002 \u0003(\t\"Ü\u0001\n\u0015SmsCannedListResponse\u0012X\n\u0006status\u0018\u0001 \u0001(\u000e2?.GDI.Proto.SmsNotification.SmsCannedListResponse.ResponseStatus:\u0007SUCCESS\u00127\n\u0005lists\u0018\u0002 \u0003(\u000b2(.GDI.Proto.SmsNotification.SmsCannedList\"0\n\u000eResponseStatus\u0012\u000b\n\u0007SUCCESS\u0010\u0000\u0012\u0011\n\rGENERIC_ERROR\u0010\u0001\"\u0096\u0001\n\u0013CapabilitiesRequest2\u007f\n\u001bmessages_capability_request\u0012*.GDI.Proto.Core.FeatureCapabilitiesRequest\u0018\u0011 \u0001(\u000b2..GDI.Proto.SmsNotification.CapabilitiesRequest\"Ô\u0001\n\u0014CapabilitiesResponse\u00127\n\u0004type\u0018\u0001 \u0003(\u000e2).GDI.Proto.SmsNotification.CannedListType2\u0082\u0001\n\u001cmessages_capability_response\u0012+.GDI.Proto.Core.FeatureCapabilitiesResponse\u0018\u0011 \u0001(\u000b2/.GDI.Proto.SmsNotification.CapabilitiesResponse*]\n\u000eCannedListType\u0012\u0017\n\u0013PHONE_CALL_RESPONSE\u0010\u0000\u0012\u0018\n\u0014SMS_MESSAGE_RESPONSE\u0010\u0001\u0012\u0018\n\u0014GROUP_TRACK_RESPONSE\u0010\u0002B7\n\u001acom.garmin.proto.generatedB\u0017GDISmsNotificationProtoH\u0003"}, new Descriptors.FileDescriptor[]{GDICore.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SmsNotification_CapabilitiesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SmsNotification_CapabilitiesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SmsNotification_CapabilitiesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SmsNotification_CapabilitiesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SmsNotification_SmsCannedListChangedNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SmsNotification_SmsCannedListChangedNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SmsNotification_SmsCannedListRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SmsNotification_SmsCannedListRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SmsNotification_SmsCannedListResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SmsNotification_SmsCannedListResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SmsNotification_SmsCannedList_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SmsNotification_SmsCannedList_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SmsNotification_SmsNotificationService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SmsNotification_SmsNotificationService_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SmsNotification_SmsSendMessageRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SmsNotification_SmsSendMessageRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_SmsNotification_SmsSendMessageResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_SmsNotification_SmsSendMessageResponse_fieldAccessorTable;

    public interface CapabilitiesRequestOrBuilder extends MessageOrBuilder {
    }

    public interface CapabilitiesResponseOrBuilder extends MessageOrBuilder {
        CannedListType getType(int i14);

        int getTypeCount();

        List<CannedListType> getTypeList();
    }

    public interface SmsCannedListChangedNotificationOrBuilder extends MessageOrBuilder {
        CannedListType getChangedTypes(int i14);

        int getChangedTypesCount();

        List<CannedListType> getChangedTypesList();
    }

    public interface SmsCannedListOrBuilder extends MessageOrBuilder {
        String getResponses(int i14);

        ByteString getResponsesBytes(int i14);

        int getResponsesCount();

        List<String> getResponsesList();

        CannedListType getType();

        boolean hasType();
    }

    public interface SmsCannedListRequestOrBuilder extends MessageOrBuilder {
        CannedListType getRequestedTypes(int i14);

        int getRequestedTypesCount();

        List<CannedListType> getRequestedTypesList();
    }

    public interface SmsCannedListResponseOrBuilder extends MessageOrBuilder {
        SmsCannedList getLists(int i14);

        int getListsCount();

        List<SmsCannedList> getListsList();

        SmsCannedListOrBuilder getListsOrBuilder(int i14);

        List<? extends SmsCannedListOrBuilder> getListsOrBuilderList();

        SmsCannedListResponse.ResponseStatus getStatus();

        boolean hasStatus();
    }

    public interface SmsNotificationServiceOrBuilder extends MessageOrBuilder {
        SmsCannedListChangedNotification getSmsCannedListChangedNotification();

        SmsCannedListChangedNotificationOrBuilder getSmsCannedListChangedNotificationOrBuilder();

        SmsCannedListRequest getSmsCannedListRequest();

        SmsCannedListRequestOrBuilder getSmsCannedListRequestOrBuilder();

        SmsCannedListResponse getSmsCannedListResponse();

        SmsCannedListResponseOrBuilder getSmsCannedListResponseOrBuilder();

        SmsSendMessageRequest getSmsSendMessageRequest();

        SmsSendMessageRequestOrBuilder getSmsSendMessageRequestOrBuilder();

        SmsSendMessageResponse getSmsSendMessageResponse();

        SmsSendMessageResponseOrBuilder getSmsSendMessageResponseOrBuilder();

        boolean hasSmsCannedListChangedNotification();

        boolean hasSmsCannedListRequest();

        boolean hasSmsCannedListResponse();

        boolean hasSmsSendMessageRequest();

        boolean hasSmsSendMessageResponse();
    }

    public interface SmsSendMessageRequestOrBuilder extends MessageOrBuilder {
        String getMessage();

        ByteString getMessageBytes();

        String getReceiverNumber();

        ByteString getReceiverNumberBytes();

        boolean hasMessage();

        boolean hasReceiverNumber();
    }

    /* JADX INFO: loaded from: classes13.dex */
    public interface SmsSendMessageResponseOrBuilder extends MessageOrBuilder {
        SmsSendMessageResponse.ResponseStatus getStatus();

        boolean hasStatus();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_SmsNotification_SmsNotificationService_descriptor = descriptor2;
        internal_static_GDI_Proto_SmsNotification_SmsNotificationService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"SmsSendMessageRequest", "SmsSendMessageResponse", "SmsCannedListChangedNotification", "SmsCannedListRequest", "SmsCannedListResponse"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_SmsNotification_SmsSendMessageRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_SmsNotification_SmsSendMessageRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"ReceiverNumber", "Message"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_SmsNotification_SmsSendMessageResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_SmsNotification_SmsSendMessageResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Status"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_SmsNotification_SmsCannedListChangedNotification_descriptor = descriptor5;
        internal_static_GDI_Proto_SmsNotification_SmsCannedListChangedNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"ChangedTypes"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_SmsNotification_SmsCannedListRequest_descriptor = descriptor6;
        internal_static_GDI_Proto_SmsNotification_SmsCannedListRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"RequestedTypes"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_SmsNotification_SmsCannedList_descriptor = descriptor7;
        internal_static_GDI_Proto_SmsNotification_SmsCannedList_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Type", "Responses"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_SmsNotification_SmsCannedListResponse_descriptor = descriptor8;
        internal_static_GDI_Proto_SmsNotification_SmsCannedListResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Status", "Lists"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_SmsNotification_CapabilitiesRequest_descriptor = descriptor9;
        internal_static_GDI_Proto_SmsNotification_CapabilitiesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[0]);
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_GDI_Proto_SmsNotification_CapabilitiesResponse_descriptor = descriptor10;
        internal_static_GDI_Proto_SmsNotification_CapabilitiesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Type"});
        GDICore.getDescriptor();
    }

    private GDISmsNotificationProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(CapabilitiesRequest.messagesCapabilityRequest);
        extensionRegistryLite.add(CapabilitiesResponse.messagesCapabilityResponse);
    }

    public static final class CapabilitiesRequest extends GeneratedMessageV3 implements CapabilitiesRequestOrBuilder {
        public static final int MESSAGES_CAPABILITY_REQUEST_FIELD_NUMBER = 17;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private static final CapabilitiesRequest DEFAULT_INSTANCE = new CapabilitiesRequest();

        @Deprecated
        public static final Parser<CapabilitiesRequest> PARSER = new AbstractParser<CapabilitiesRequest>() { // from class: com.garmin.proto.generated.GDISmsNotificationProto.CapabilitiesRequest.1
            @Override // com.google.protobuf.Parser
            public CapabilitiesRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CapabilitiesRequest.newBuilder();
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
        public static final GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesRequest, CapabilitiesRequest> messagesCapabilityRequest = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, CapabilitiesRequest.class, getDefaultInstance());

        private CapabilitiesRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_CapabilitiesRequest_descriptor;
        }

        public static Builder newBuilder(CapabilitiesRequest capabilitiesRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(capabilitiesRequest);
        }

        public static CapabilitiesRequest parseDelimitedFrom(InputStream inputStream) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CapabilitiesRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CapabilitiesRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof CapabilitiesRequest) {
                return getUnknownFields().equals(((CapabilitiesRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CapabilitiesRequest> getParserForType() {
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
            return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
            return new CapabilitiesRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_CapabilitiesRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CapabilitiesRequest build() {
                CapabilitiesRequest capabilitiesRequestBuildPartial = buildPartial();
                if (capabilitiesRequestBuildPartial.isInitialized()) {
                    return capabilitiesRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) capabilitiesRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CapabilitiesRequest buildPartial() {
                CapabilitiesRequest capabilitiesRequest = new CapabilitiesRequest(this);
                onBuilt();
                return capabilitiesRequest;
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
                return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_CapabilitiesRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
            public CapabilitiesRequest getDefaultInstanceForType() {
                return CapabilitiesRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CapabilitiesRequest) {
                    return mergeFrom((CapabilitiesRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CapabilitiesRequest capabilitiesRequest) {
                if (capabilitiesRequest == CapabilitiesRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(capabilitiesRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CapabilitiesRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ CapabilitiesRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private CapabilitiesRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CapabilitiesRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CapabilitiesRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CapabilitiesRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CapabilitiesRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CapabilitiesRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CapabilitiesRequest parseFrom(InputStream inputStream) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CapabilitiesRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CapabilitiesRequest parseFrom(CodedInputStream codedInputStream) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CapabilitiesRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CapabilitiesResponse extends GeneratedMessageV3 implements CapabilitiesResponseOrBuilder {
        public static final int MESSAGES_CAPABILITY_RESPONSE_FIELD_NUMBER = 17;
        public static final int TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private List<Integer> type_;
        private static final Internal.ListAdapter.Converter<Integer, CannedListType> type_converter_ = new Internal.ListAdapter.Converter<Integer, CannedListType>() { // from class: com.garmin.proto.generated.GDISmsNotificationProto.CapabilitiesResponse.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public CannedListType convert(Integer num) {
                CannedListType cannedListTypeForNumber = CannedListType.forNumber(num.intValue());
                return cannedListTypeForNumber == null ? CannedListType.PHONE_CALL_RESPONSE : cannedListTypeForNumber;
            }
        };
        private static final CapabilitiesResponse DEFAULT_INSTANCE = new CapabilitiesResponse();

        @Deprecated
        public static final Parser<CapabilitiesResponse> PARSER = new AbstractParser<CapabilitiesResponse>() { // from class: com.garmin.proto.generated.GDISmsNotificationProto.CapabilitiesResponse.2
            @Override // com.google.protobuf.Parser
            public CapabilitiesResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CapabilitiesResponse.newBuilder();
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
        public static final GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesResponse, CapabilitiesResponse> messagesCapabilityResponse = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, CapabilitiesResponse.class, getDefaultInstance());

        private CapabilitiesResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = Collections.EMPTY_LIST;
        }

        public static CapabilitiesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_CapabilitiesResponse_descriptor;
        }

        public static Builder newBuilder(CapabilitiesResponse capabilitiesResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(capabilitiesResponse);
        }

        public static CapabilitiesResponse parseDelimitedFrom(InputStream inputStream) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CapabilitiesResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CapabilitiesResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CapabilitiesResponse)) {
                return super.equals(obj);
            }
            CapabilitiesResponse capabilitiesResponse = (CapabilitiesResponse) obj;
            return this.type_.equals(capabilitiesResponse.type_) && getUnknownFields().equals(capabilitiesResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CapabilitiesResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int i15 = 0;
            int iA = 0;
            while (true) {
                int size = this.type_.size();
                List<Integer> list = this.type_;
                if (i15 >= size) {
                    int serializedSize = getUnknownFields().getSerializedSize() + list.size() + iA;
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }
                iA = f3.a(iA, list.get(i15));
                i15++;
            }
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.CapabilitiesResponseOrBuilder
        public CannedListType getType(int i14) {
            return type_converter_.convert(this.type_.get(i14));
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.CapabilitiesResponseOrBuilder
        public int getTypeCount() {
            return this.type_.size();
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.CapabilitiesResponseOrBuilder
        public List<CannedListType> getTypeList() {
            return new Internal.ListAdapter(this.type_, type_converter_);
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getTypeCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.type_.hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
            return new CapabilitiesResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            int iF = 0;
            while (iF < this.type_.size()) {
                iF = f3.f(this.type_.get(iF), codedOutputStream, 1, iF, 1);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesResponseOrBuilder {
            private int bitField0_;
            private List<Integer> type_;

            private Builder() {
                this.type_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(CapabilitiesResponse capabilitiesResponse) {
            }

            private void buildPartialRepeatedFields(CapabilitiesResponse capabilitiesResponse) {
                if ((this.bitField0_ & 1) != 0) {
                    this.type_ = Collections.unmodifiableList(this.type_);
                    this.bitField0_ &= -2;
                }
                capabilitiesResponse.type_ = this.type_;
            }

            private void ensureTypeIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.type_ = new ArrayList(this.type_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_CapabilitiesResponse_descriptor;
            }

            public Builder addAllType(Iterable<? extends CannedListType> iterable) {
                ensureTypeIsMutable();
                Iterator<? extends CannedListType> it = iterable.iterator();
                while (it.hasNext()) {
                    this.type_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addType(CannedListType cannedListType) {
                cannedListType.getClass();
                ensureTypeIsMutable();
                this.type_.add(Integer.valueOf(cannedListType.getNumber()));
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CapabilitiesResponse build() {
                CapabilitiesResponse capabilitiesResponseBuildPartial = buildPartial();
                if (capabilitiesResponseBuildPartial.isInitialized()) {
                    return capabilitiesResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) capabilitiesResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CapabilitiesResponse buildPartial() {
                CapabilitiesResponse capabilitiesResponse = new CapabilitiesResponse(this);
                buildPartialRepeatedFields(capabilitiesResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(capabilitiesResponse);
                }
                onBuilt();
                return capabilitiesResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.type_ = Collections.EMPTY_LIST;
                this.bitField0_ = 0;
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

            public Builder clearType() {
                this.type_ = Collections.EMPTY_LIST;
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
                return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_CapabilitiesResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.CapabilitiesResponseOrBuilder
            public CannedListType getType(int i14) {
                return (CannedListType) CapabilitiesResponse.type_converter_.convert(this.type_.get(i14));
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.CapabilitiesResponseOrBuilder
            public int getTypeCount() {
                return this.type_.size();
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.CapabilitiesResponseOrBuilder
            public List<CannedListType> getTypeList() {
                return new Internal.ListAdapter(this.type_, CapabilitiesResponse.type_converter_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
                                    if (CannedListType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        ensureTypeIsMutable();
                                        this.type_.add(Integer.valueOf(i14));
                                    }
                                } else if (tag == 10) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int i15 = codedInputStream.readEnum();
                                        if (CannedListType.forNumber(i15) == null) {
                                            mergeUnknownVarintField(1, i15);
                                        } else {
                                            ensureTypeIsMutable();
                                            this.type_.add(Integer.valueOf(i15));
                                        }
                                    }
                                    codedInputStream.popLimit(iPushLimit);
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

            public Builder setType(int i14, CannedListType cannedListType) {
                cannedListType.getClass();
                ensureTypeIsMutable();
                this.type_.set(i14, Integer.valueOf(cannedListType.getNumber()));
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CapabilitiesResponse getDefaultInstanceForType() {
                return CapabilitiesResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.type_ = Collections.EMPTY_LIST;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CapabilitiesResponse) {
                    return mergeFrom((CapabilitiesResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CapabilitiesResponse capabilitiesResponse) {
                if (capabilitiesResponse == CapabilitiesResponse.getDefaultInstance()) {
                    return this;
                }
                if (!capabilitiesResponse.type_.isEmpty()) {
                    if (this.type_.isEmpty()) {
                        this.type_ = capabilitiesResponse.type_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureTypeIsMutable();
                        this.type_.addAll(capabilitiesResponse.type_);
                    }
                    onChanged();
                }
                mergeUnknownFields(capabilitiesResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CapabilitiesResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static CapabilitiesResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CapabilitiesResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CapabilitiesResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private CapabilitiesResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CapabilitiesResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CapabilitiesResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ CapabilitiesResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CapabilitiesResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CapabilitiesResponse parseFrom(InputStream inputStream) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CapabilitiesResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CapabilitiesResponse parseFrom(CodedInputStream codedInputStream) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CapabilitiesResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SmsCannedList extends GeneratedMessageV3 implements SmsCannedListOrBuilder {
        private static final SmsCannedList DEFAULT_INSTANCE = new SmsCannedList();

        @Deprecated
        public static final Parser<SmsCannedList> PARSER = new AbstractParser<SmsCannedList>() { // from class: com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedList.1
            @Override // com.google.protobuf.Parser
            public SmsCannedList parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SmsCannedList.newBuilder();
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
        public static final int RESPONSES_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private LazyStringArrayList responses_;
        private int type_;

        private SmsCannedList() {
            this.type_ = 0;
            this.responses_ = LazyStringArrayList.emptyList();
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
            this.responses_ = LazyStringArrayList.emptyList();
        }

        public static SmsCannedList getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_SmsCannedList_descriptor;
        }

        public static Builder newBuilder(SmsCannedList smsCannedList) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(smsCannedList);
        }

        public static SmsCannedList parseDelimitedFrom(InputStream inputStream) {
            return (SmsCannedList) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SmsCannedList parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SmsCannedList> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SmsCannedList)) {
                return super.equals(obj);
            }
            SmsCannedList smsCannedList = (SmsCannedList) obj;
            if (hasType() != smsCannedList.hasType()) {
                return false;
            }
            return (!hasType() || this.type_ == smsCannedList.type_) && getResponsesList().equals(smsCannedList.getResponsesList()) && getUnknownFields().equals(smsCannedList.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SmsCannedList> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListOrBuilder
        public String getResponses(int i14) {
            return this.responses_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListOrBuilder
        public ByteString getResponsesBytes(int i14) {
            return this.responses_.getByteString(i14);
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListOrBuilder
        public int getResponsesCount() {
            return this.responses_.size();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.type_) : 0;
            int iD = 0;
            for (int i15 = 0; i15 < this.responses_.size(); i15++) {
                iD = f3.d(this.responses_, i15, iD);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + getResponsesList().size() + iComputeEnumSize + iD;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListOrBuilder
        public CannedListType getType() {
            CannedListType cannedListTypeForNumber = CannedListType.forNumber(this.type_);
            return cannedListTypeForNumber == null ? CannedListType.PHONE_CALL_RESPONSE : cannedListTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListOrBuilder
        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasType()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.type_;
            }
            if (getResponsesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getResponsesList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_SmsCannedList_fieldAccessorTable.ensureFieldAccessorsInitialized(SmsCannedList.class, Builder.class);
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
            return new SmsCannedList();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.type_);
            }
            int iE = 0;
            while (iE < this.responses_.size()) {
                iE = f3.e(this.responses_, iE, codedOutputStream, 2, iE, 1);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SmsCannedListOrBuilder {
            private int bitField0_;
            private LazyStringArrayList responses_;
            private int type_;

            private Builder() {
                this.type_ = 0;
                this.responses_ = LazyStringArrayList.emptyList();
            }

            private void buildPartial0(SmsCannedList smsCannedList) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    smsCannedList.type_ = this.type_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    this.responses_.makeImmutable();
                    smsCannedList.responses_ = this.responses_;
                }
                smsCannedList.bitField0_ |= i14;
            }

            private void ensureResponsesIsMutable() {
                if (!this.responses_.isModifiable()) {
                    this.responses_ = new LazyStringArrayList((LazyStringList) this.responses_);
                }
                this.bitField0_ |= 2;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_SmsCannedList_descriptor;
            }

            public Builder addAllResponses(Iterable<String> iterable) {
                ensureResponsesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.responses_);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addResponses(String str) {
                str.getClass();
                ensureResponsesIsMutable();
                this.responses_.add(str);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder addResponsesBytes(ByteString byteString) {
                byteString.getClass();
                ensureResponsesIsMutable();
                this.responses_.add(byteString);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SmsCannedList build() {
                SmsCannedList smsCannedListBuildPartial = buildPartial();
                if (smsCannedListBuildPartial.isInitialized()) {
                    return smsCannedListBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) smsCannedListBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SmsCannedList buildPartial() {
                SmsCannedList smsCannedList = new SmsCannedList(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(smsCannedList);
                }
                onBuilt();
                return smsCannedList;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.type_ = 0;
                this.responses_ = LazyStringArrayList.emptyList();
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

            public Builder clearResponses() {
                this.responses_ = LazyStringArrayList.emptyList();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.bitField0_ &= -2;
                this.type_ = 0;
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
                return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_SmsCannedList_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListOrBuilder
            public String getResponses(int i14) {
                return this.responses_.get(i14);
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListOrBuilder
            public ByteString getResponsesBytes(int i14) {
                return this.responses_.getByteString(i14);
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListOrBuilder
            public int getResponsesCount() {
                return this.responses_.size();
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListOrBuilder
            public ProtocolStringList getResponsesList() {
                this.responses_.makeImmutable();
                return this.responses_;
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListOrBuilder
            public CannedListType getType() {
                CannedListType cannedListTypeForNumber = CannedListType.forNumber(this.type_);
                return cannedListTypeForNumber == null ? CannedListType.PHONE_CALL_RESPONSE : cannedListTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListOrBuilder
            public boolean hasType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_SmsCannedList_fieldAccessorTable.ensureFieldAccessorsInitialized(SmsCannedList.class, Builder.class);
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
                                    if (CannedListType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.type_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    ByteString bytes = codedInputStream.readBytes();
                                    ensureResponsesIsMutable();
                                    this.responses_.add(bytes);
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

            public Builder setResponses(int i14, String str) {
                str.getClass();
                ensureResponsesIsMutable();
                this.responses_.set(i14, str);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setType(CannedListType cannedListType) {
                cannedListType.getClass();
                this.bitField0_ |= 1;
                this.type_ = cannedListType.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SmsCannedList getDefaultInstanceForType() {
                return SmsCannedList.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.type_ = 0;
                this.responses_ = LazyStringArrayList.emptyList();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SmsCannedList) {
                    return mergeFrom((SmsCannedList) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SmsCannedList smsCannedList) {
                if (smsCannedList == SmsCannedList.getDefaultInstance()) {
                    return this;
                }
                if (smsCannedList.hasType()) {
                    setType(smsCannedList.getType());
                }
                if (!smsCannedList.responses_.isEmpty()) {
                    if (this.responses_.isEmpty()) {
                        this.responses_ = smsCannedList.responses_;
                        this.bitField0_ |= 2;
                    } else {
                        ensureResponsesIsMutable();
                        this.responses_.addAll(smsCannedList.responses_);
                    }
                    onChanged();
                }
                mergeUnknownFields(smsCannedList.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListOrBuilder
        public ProtocolStringList getResponsesList() {
            return this.responses_;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SmsCannedList getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SmsCannedList parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SmsCannedList) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SmsCannedList parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SmsCannedList parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SmsCannedList parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SmsCannedList parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SmsCannedList parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SmsCannedList parseFrom(InputStream inputStream) {
            return (SmsCannedList) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SmsCannedList parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SmsCannedList) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SmsCannedList parseFrom(CodedInputStream codedInputStream) {
            return (SmsCannedList) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SmsCannedList parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SmsCannedList) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private SmsCannedList(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.type_ = 0;
            this.responses_ = LazyStringArrayList.emptyList();
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ SmsCannedList(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class SmsCannedListChangedNotification extends GeneratedMessageV3 implements SmsCannedListChangedNotificationOrBuilder {
        public static final int CHANGED_TYPES_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<Integer> changedTypes_;
        private byte memoizedIsInitialized;
        private static final Internal.ListAdapter.Converter<Integer, CannedListType> changedTypes_converter_ = new Internal.ListAdapter.Converter<Integer, CannedListType>() { // from class: com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListChangedNotification.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public CannedListType convert(Integer num) {
                CannedListType cannedListTypeForNumber = CannedListType.forNumber(num.intValue());
                return cannedListTypeForNumber == null ? CannedListType.PHONE_CALL_RESPONSE : cannedListTypeForNumber;
            }
        };
        private static final SmsCannedListChangedNotification DEFAULT_INSTANCE = new SmsCannedListChangedNotification();

        @Deprecated
        public static final Parser<SmsCannedListChangedNotification> PARSER = new AbstractParser<SmsCannedListChangedNotification>() { // from class: com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListChangedNotification.2
            @Override // com.google.protobuf.Parser
            public SmsCannedListChangedNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SmsCannedListChangedNotification.newBuilder();
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

        private SmsCannedListChangedNotification() {
            this.memoizedIsInitialized = (byte) -1;
            this.changedTypes_ = Collections.EMPTY_LIST;
        }

        public static SmsCannedListChangedNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_SmsCannedListChangedNotification_descriptor;
        }

        public static Builder newBuilder(SmsCannedListChangedNotification smsCannedListChangedNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(smsCannedListChangedNotification);
        }

        public static SmsCannedListChangedNotification parseDelimitedFrom(InputStream inputStream) {
            return (SmsCannedListChangedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SmsCannedListChangedNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SmsCannedListChangedNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SmsCannedListChangedNotification)) {
                return super.equals(obj);
            }
            SmsCannedListChangedNotification smsCannedListChangedNotification = (SmsCannedListChangedNotification) obj;
            return this.changedTypes_.equals(smsCannedListChangedNotification.changedTypes_) && getUnknownFields().equals(smsCannedListChangedNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListChangedNotificationOrBuilder
        public CannedListType getChangedTypes(int i14) {
            return changedTypes_converter_.convert(this.changedTypes_.get(i14));
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListChangedNotificationOrBuilder
        public int getChangedTypesCount() {
            return this.changedTypes_.size();
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListChangedNotificationOrBuilder
        public List<CannedListType> getChangedTypesList() {
            return new Internal.ListAdapter(this.changedTypes_, changedTypes_converter_);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SmsCannedListChangedNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int i15 = 0;
            int iA = 0;
            while (true) {
                int size = this.changedTypes_.size();
                List<Integer> list = this.changedTypes_;
                if (i15 >= size) {
                    int serializedSize = getUnknownFields().getSerializedSize() + list.size() + iA;
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }
                iA = f3.a(iA, list.get(i15));
                i15++;
            }
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getChangedTypesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.changedTypes_.hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_SmsCannedListChangedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SmsCannedListChangedNotification.class, Builder.class);
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
            return new SmsCannedListChangedNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            int iF = 0;
            while (iF < this.changedTypes_.size()) {
                iF = f3.f(this.changedTypes_.get(iF), codedOutputStream, 1, iF, 1);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SmsCannedListChangedNotificationOrBuilder {
            private int bitField0_;
            private List<Integer> changedTypes_;

            private Builder() {
                this.changedTypes_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(SmsCannedListChangedNotification smsCannedListChangedNotification) {
            }

            private void buildPartialRepeatedFields(SmsCannedListChangedNotification smsCannedListChangedNotification) {
                if ((this.bitField0_ & 1) != 0) {
                    this.changedTypes_ = Collections.unmodifiableList(this.changedTypes_);
                    this.bitField0_ &= -2;
                }
                smsCannedListChangedNotification.changedTypes_ = this.changedTypes_;
            }

            private void ensureChangedTypesIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.changedTypes_ = new ArrayList(this.changedTypes_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_SmsCannedListChangedNotification_descriptor;
            }

            public Builder addAllChangedTypes(Iterable<? extends CannedListType> iterable) {
                ensureChangedTypesIsMutable();
                Iterator<? extends CannedListType> it = iterable.iterator();
                while (it.hasNext()) {
                    this.changedTypes_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addChangedTypes(CannedListType cannedListType) {
                cannedListType.getClass();
                ensureChangedTypesIsMutable();
                this.changedTypes_.add(Integer.valueOf(cannedListType.getNumber()));
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SmsCannedListChangedNotification build() {
                SmsCannedListChangedNotification smsCannedListChangedNotificationBuildPartial = buildPartial();
                if (smsCannedListChangedNotificationBuildPartial.isInitialized()) {
                    return smsCannedListChangedNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) smsCannedListChangedNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SmsCannedListChangedNotification buildPartial() {
                SmsCannedListChangedNotification smsCannedListChangedNotification = new SmsCannedListChangedNotification(this);
                buildPartialRepeatedFields(smsCannedListChangedNotification);
                if (this.bitField0_ != 0) {
                    buildPartial0(smsCannedListChangedNotification);
                }
                onBuilt();
                return smsCannedListChangedNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.changedTypes_ = Collections.EMPTY_LIST;
                this.bitField0_ = 0;
                return this;
            }

            public Builder clearChangedTypes() {
                this.changedTypes_ = Collections.EMPTY_LIST;
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

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListChangedNotificationOrBuilder
            public CannedListType getChangedTypes(int i14) {
                return (CannedListType) SmsCannedListChangedNotification.changedTypes_converter_.convert(this.changedTypes_.get(i14));
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListChangedNotificationOrBuilder
            public int getChangedTypesCount() {
                return this.changedTypes_.size();
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListChangedNotificationOrBuilder
            public List<CannedListType> getChangedTypesList() {
                return new Internal.ListAdapter(this.changedTypes_, SmsCannedListChangedNotification.changedTypes_converter_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_SmsCannedListChangedNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_SmsCannedListChangedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SmsCannedListChangedNotification.class, Builder.class);
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
                                    if (CannedListType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        ensureChangedTypesIsMutable();
                                        this.changedTypes_.add(Integer.valueOf(i14));
                                    }
                                } else if (tag == 10) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int i15 = codedInputStream.readEnum();
                                        if (CannedListType.forNumber(i15) == null) {
                                            mergeUnknownVarintField(1, i15);
                                        } else {
                                            ensureChangedTypesIsMutable();
                                            this.changedTypes_.add(Integer.valueOf(i15));
                                        }
                                    }
                                    codedInputStream.popLimit(iPushLimit);
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

            public Builder setChangedTypes(int i14, CannedListType cannedListType) {
                cannedListType.getClass();
                ensureChangedTypesIsMutable();
                this.changedTypes_.set(i14, Integer.valueOf(cannedListType.getNumber()));
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
            public SmsCannedListChangedNotification getDefaultInstanceForType() {
                return SmsCannedListChangedNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.changedTypes_ = Collections.EMPTY_LIST;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SmsCannedListChangedNotification) {
                    return mergeFrom((SmsCannedListChangedNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SmsCannedListChangedNotification smsCannedListChangedNotification) {
                if (smsCannedListChangedNotification == SmsCannedListChangedNotification.getDefaultInstance()) {
                    return this;
                }
                if (!smsCannedListChangedNotification.changedTypes_.isEmpty()) {
                    if (this.changedTypes_.isEmpty()) {
                        this.changedTypes_ = smsCannedListChangedNotification.changedTypes_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureChangedTypesIsMutable();
                        this.changedTypes_.addAll(smsCannedListChangedNotification.changedTypes_);
                    }
                    onChanged();
                }
                mergeUnknownFields(smsCannedListChangedNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SmsCannedListChangedNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SmsCannedListChangedNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SmsCannedListChangedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SmsCannedListChangedNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SmsCannedListChangedNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SmsCannedListChangedNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SmsCannedListChangedNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SmsCannedListChangedNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ SmsCannedListChangedNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SmsCannedListChangedNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SmsCannedListChangedNotification parseFrom(InputStream inputStream) {
            return (SmsCannedListChangedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SmsCannedListChangedNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SmsCannedListChangedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SmsCannedListChangedNotification parseFrom(CodedInputStream codedInputStream) {
            return (SmsCannedListChangedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SmsCannedListChangedNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SmsCannedListChangedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SmsCannedListRequest extends GeneratedMessageV3 implements SmsCannedListRequestOrBuilder {
        public static final int REQUESTED_TYPES_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private List<Integer> requestedTypes_;
        private static final Internal.ListAdapter.Converter<Integer, CannedListType> requestedTypes_converter_ = new Internal.ListAdapter.Converter<Integer, CannedListType>() { // from class: com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListRequest.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public CannedListType convert(Integer num) {
                CannedListType cannedListTypeForNumber = CannedListType.forNumber(num.intValue());
                return cannedListTypeForNumber == null ? CannedListType.PHONE_CALL_RESPONSE : cannedListTypeForNumber;
            }
        };
        private static final SmsCannedListRequest DEFAULT_INSTANCE = new SmsCannedListRequest();

        @Deprecated
        public static final Parser<SmsCannedListRequest> PARSER = new AbstractParser<SmsCannedListRequest>() { // from class: com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListRequest.2
            @Override // com.google.protobuf.Parser
            public SmsCannedListRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SmsCannedListRequest.newBuilder();
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

        private SmsCannedListRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.requestedTypes_ = Collections.EMPTY_LIST;
        }

        public static SmsCannedListRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_SmsCannedListRequest_descriptor;
        }

        public static Builder newBuilder(SmsCannedListRequest smsCannedListRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(smsCannedListRequest);
        }

        public static SmsCannedListRequest parseDelimitedFrom(InputStream inputStream) {
            return (SmsCannedListRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SmsCannedListRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SmsCannedListRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SmsCannedListRequest)) {
                return super.equals(obj);
            }
            SmsCannedListRequest smsCannedListRequest = (SmsCannedListRequest) obj;
            return this.requestedTypes_.equals(smsCannedListRequest.requestedTypes_) && getUnknownFields().equals(smsCannedListRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SmsCannedListRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListRequestOrBuilder
        public CannedListType getRequestedTypes(int i14) {
            return requestedTypes_converter_.convert(this.requestedTypes_.get(i14));
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListRequestOrBuilder
        public int getRequestedTypesCount() {
            return this.requestedTypes_.size();
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListRequestOrBuilder
        public List<CannedListType> getRequestedTypesList() {
            return new Internal.ListAdapter(this.requestedTypes_, requestedTypes_converter_);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int i15 = 0;
            int iA = 0;
            while (true) {
                int size = this.requestedTypes_.size();
                List<Integer> list = this.requestedTypes_;
                if (i15 >= size) {
                    int serializedSize = getUnknownFields().getSerializedSize() + list.size() + iA;
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }
                iA = f3.a(iA, list.get(i15));
                i15++;
            }
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getRequestedTypesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.requestedTypes_.hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_SmsCannedListRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SmsCannedListRequest.class, Builder.class);
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
            return new SmsCannedListRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            int iF = 0;
            while (iF < this.requestedTypes_.size()) {
                iF = f3.f(this.requestedTypes_.get(iF), codedOutputStream, 1, iF, 1);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SmsCannedListRequestOrBuilder {
            private int bitField0_;
            private List<Integer> requestedTypes_;

            private Builder() {
                this.requestedTypes_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(SmsCannedListRequest smsCannedListRequest) {
            }

            private void buildPartialRepeatedFields(SmsCannedListRequest smsCannedListRequest) {
                if ((this.bitField0_ & 1) != 0) {
                    this.requestedTypes_ = Collections.unmodifiableList(this.requestedTypes_);
                    this.bitField0_ &= -2;
                }
                smsCannedListRequest.requestedTypes_ = this.requestedTypes_;
            }

            private void ensureRequestedTypesIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.requestedTypes_ = new ArrayList(this.requestedTypes_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_SmsCannedListRequest_descriptor;
            }

            public Builder addAllRequestedTypes(Iterable<? extends CannedListType> iterable) {
                ensureRequestedTypesIsMutable();
                Iterator<? extends CannedListType> it = iterable.iterator();
                while (it.hasNext()) {
                    this.requestedTypes_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addRequestedTypes(CannedListType cannedListType) {
                cannedListType.getClass();
                ensureRequestedTypesIsMutable();
                this.requestedTypes_.add(Integer.valueOf(cannedListType.getNumber()));
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SmsCannedListRequest build() {
                SmsCannedListRequest smsCannedListRequestBuildPartial = buildPartial();
                if (smsCannedListRequestBuildPartial.isInitialized()) {
                    return smsCannedListRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) smsCannedListRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SmsCannedListRequest buildPartial() {
                SmsCannedListRequest smsCannedListRequest = new SmsCannedListRequest(this);
                buildPartialRepeatedFields(smsCannedListRequest);
                if (this.bitField0_ != 0) {
                    buildPartial0(smsCannedListRequest);
                }
                onBuilt();
                return smsCannedListRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.requestedTypes_ = Collections.EMPTY_LIST;
                this.bitField0_ = 0;
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

            public Builder clearRequestedTypes() {
                this.requestedTypes_ = Collections.EMPTY_LIST;
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
                return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_SmsCannedListRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListRequestOrBuilder
            public CannedListType getRequestedTypes(int i14) {
                return (CannedListType) SmsCannedListRequest.requestedTypes_converter_.convert(this.requestedTypes_.get(i14));
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListRequestOrBuilder
            public int getRequestedTypesCount() {
                return this.requestedTypes_.size();
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListRequestOrBuilder
            public List<CannedListType> getRequestedTypesList() {
                return new Internal.ListAdapter(this.requestedTypes_, SmsCannedListRequest.requestedTypes_converter_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_SmsCannedListRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SmsCannedListRequest.class, Builder.class);
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
                                    if (CannedListType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        ensureRequestedTypesIsMutable();
                                        this.requestedTypes_.add(Integer.valueOf(i14));
                                    }
                                } else if (tag == 10) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int i15 = codedInputStream.readEnum();
                                        if (CannedListType.forNumber(i15) == null) {
                                            mergeUnknownVarintField(1, i15);
                                        } else {
                                            ensureRequestedTypesIsMutable();
                                            this.requestedTypes_.add(Integer.valueOf(i15));
                                        }
                                    }
                                    codedInputStream.popLimit(iPushLimit);
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

            public Builder setRequestedTypes(int i14, CannedListType cannedListType) {
                cannedListType.getClass();
                ensureRequestedTypesIsMutable();
                this.requestedTypes_.set(i14, Integer.valueOf(cannedListType.getNumber()));
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SmsCannedListRequest getDefaultInstanceForType() {
                return SmsCannedListRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.requestedTypes_ = Collections.EMPTY_LIST;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SmsCannedListRequest) {
                    return mergeFrom((SmsCannedListRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SmsCannedListRequest smsCannedListRequest) {
                if (smsCannedListRequest == SmsCannedListRequest.getDefaultInstance()) {
                    return this;
                }
                if (!smsCannedListRequest.requestedTypes_.isEmpty()) {
                    if (this.requestedTypes_.isEmpty()) {
                        this.requestedTypes_ = smsCannedListRequest.requestedTypes_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureRequestedTypesIsMutable();
                        this.requestedTypes_.addAll(smsCannedListRequest.requestedTypes_);
                    }
                    onChanged();
                }
                mergeUnknownFields(smsCannedListRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SmsCannedListRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SmsCannedListRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SmsCannedListRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SmsCannedListRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SmsCannedListRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SmsCannedListRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SmsCannedListRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SmsCannedListRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ SmsCannedListRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SmsCannedListRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SmsCannedListRequest parseFrom(InputStream inputStream) {
            return (SmsCannedListRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SmsCannedListRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SmsCannedListRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SmsCannedListRequest parseFrom(CodedInputStream codedInputStream) {
            return (SmsCannedListRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SmsCannedListRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SmsCannedListRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SmsCannedListResponse extends GeneratedMessageV3 implements SmsCannedListResponseOrBuilder {
        public static final int LISTS_FIELD_NUMBER = 2;
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private List<SmsCannedList> lists_;
        private byte memoizedIsInitialized;
        private int status_;
        private static final SmsCannedListResponse DEFAULT_INSTANCE = new SmsCannedListResponse();

        @Deprecated
        public static final Parser<SmsCannedListResponse> PARSER = new AbstractParser<SmsCannedListResponse>() { // from class: com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListResponse.1
            @Override // com.google.protobuf.Parser
            public SmsCannedListResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SmsCannedListResponse.newBuilder();
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

        private SmsCannedListResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
            this.lists_ = Collections.EMPTY_LIST;
        }

        public static SmsCannedListResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_SmsCannedListResponse_descriptor;
        }

        public static Builder newBuilder(SmsCannedListResponse smsCannedListResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(smsCannedListResponse);
        }

        public static SmsCannedListResponse parseDelimitedFrom(InputStream inputStream) {
            return (SmsCannedListResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SmsCannedListResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SmsCannedListResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SmsCannedListResponse)) {
                return super.equals(obj);
            }
            SmsCannedListResponse smsCannedListResponse = (SmsCannedListResponse) obj;
            if (hasStatus() != smsCannedListResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == smsCannedListResponse.status_) && getListsList().equals(smsCannedListResponse.getListsList()) && getUnknownFields().equals(smsCannedListResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListResponseOrBuilder
        public SmsCannedList getLists(int i14) {
            return this.lists_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListResponseOrBuilder
        public int getListsCount() {
            return this.lists_.size();
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListResponseOrBuilder
        public List<SmsCannedList> getListsList() {
            return this.lists_;
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListResponseOrBuilder
        public SmsCannedListOrBuilder getListsOrBuilder(int i14) {
            return this.lists_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListResponseOrBuilder
        public List<? extends SmsCannedListOrBuilder> getListsOrBuilderList() {
            return this.lists_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SmsCannedListResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.status_) : 0;
            for (int i15 = 0; i15 < this.lists_.size(); i15++) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, this.lists_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.SUCCESS : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListResponseOrBuilder
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
            if (getListsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getListsList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_SmsCannedListResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SmsCannedListResponse.class, Builder.class);
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
            return new SmsCannedListResponse();
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
            for (int i14 = 0; i14 < this.lists_.size(); i14++) {
                codedOutputStream.writeMessage(2, this.lists_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SmsCannedListResponseOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<SmsCannedList, SmsCannedList.Builder, SmsCannedListOrBuilder> listsBuilder_;
            private List<SmsCannedList> lists_;
            private int status_;

            private Builder() {
                this.status_ = 0;
                this.lists_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(SmsCannedListResponse smsCannedListResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    smsCannedListResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                smsCannedListResponse.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(SmsCannedListResponse smsCannedListResponse) {
                RepeatedFieldBuilderV3<SmsCannedList, SmsCannedList.Builder, SmsCannedListOrBuilder> repeatedFieldBuilderV3 = this.listsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    smsCannedListResponse.lists_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 2) != 0) {
                    this.lists_ = Collections.unmodifiableList(this.lists_);
                    this.bitField0_ &= -3;
                }
                smsCannedListResponse.lists_ = this.lists_;
            }

            private void ensureListsIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.lists_ = new ArrayList(this.lists_);
                    this.bitField0_ |= 2;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_SmsCannedListResponse_descriptor;
            }

            private RepeatedFieldBuilderV3<SmsCannedList, SmsCannedList.Builder, SmsCannedListOrBuilder> getListsFieldBuilder() {
                if (this.listsBuilder_ == null) {
                    this.listsBuilder_ = new RepeatedFieldBuilderV3<>(this.lists_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.lists_ = null;
                }
                return this.listsBuilder_;
            }

            public Builder addAllLists(Iterable<? extends SmsCannedList> iterable) {
                RepeatedFieldBuilderV3<SmsCannedList, SmsCannedList.Builder, SmsCannedListOrBuilder> repeatedFieldBuilderV3 = this.listsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureListsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.lists_);
                onChanged();
                return this;
            }

            public Builder addLists(SmsCannedList.Builder builder) {
                RepeatedFieldBuilderV3<SmsCannedList, SmsCannedList.Builder, SmsCannedListOrBuilder> repeatedFieldBuilderV3 = this.listsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureListsIsMutable();
                this.lists_.add(builder.build());
                onChanged();
                return this;
            }

            public SmsCannedList.Builder addListsBuilder() {
                return (SmsCannedList.Builder) getListsFieldBuilder().addBuilder(SmsCannedList.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SmsCannedListResponse build() {
                SmsCannedListResponse smsCannedListResponseBuildPartial = buildPartial();
                if (smsCannedListResponseBuildPartial.isInitialized()) {
                    return smsCannedListResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) smsCannedListResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SmsCannedListResponse buildPartial() {
                SmsCannedListResponse smsCannedListResponse = new SmsCannedListResponse(this);
                buildPartialRepeatedFields(smsCannedListResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(smsCannedListResponse);
                }
                onBuilt();
                return smsCannedListResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                RepeatedFieldBuilderV3<SmsCannedList, SmsCannedList.Builder, SmsCannedListOrBuilder> repeatedFieldBuilderV3 = this.listsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.lists_ = Collections.EMPTY_LIST;
                } else {
                    this.lists_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -3;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLists() {
                RepeatedFieldBuilderV3<SmsCannedList, SmsCannedList.Builder, SmsCannedListOrBuilder> repeatedFieldBuilderV3 = this.listsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.lists_ = Collections.EMPTY_LIST;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_SmsCannedListResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListResponseOrBuilder
            public SmsCannedList getLists(int i14) {
                RepeatedFieldBuilderV3<SmsCannedList, SmsCannedList.Builder, SmsCannedListOrBuilder> repeatedFieldBuilderV3 = this.listsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.lists_.get(i14) : (SmsCannedList) repeatedFieldBuilderV3.getMessage(i14);
            }

            public SmsCannedList.Builder getListsBuilder(int i14) {
                return (SmsCannedList.Builder) getListsFieldBuilder().getBuilder(i14);
            }

            public List<SmsCannedList.Builder> getListsBuilderList() {
                return getListsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListResponseOrBuilder
            public int getListsCount() {
                RepeatedFieldBuilderV3<SmsCannedList, SmsCannedList.Builder, SmsCannedListOrBuilder> repeatedFieldBuilderV3 = this.listsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.lists_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListResponseOrBuilder
            public List<SmsCannedList> getListsList() {
                RepeatedFieldBuilderV3<SmsCannedList, SmsCannedList.Builder, SmsCannedListOrBuilder> repeatedFieldBuilderV3 = this.listsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.lists_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListResponseOrBuilder
            public SmsCannedListOrBuilder getListsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<SmsCannedList, SmsCannedList.Builder, SmsCannedListOrBuilder> repeatedFieldBuilderV3 = this.listsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.lists_.get(i14) : (SmsCannedListOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListResponseOrBuilder
            public List<? extends SmsCannedListOrBuilder> getListsOrBuilderList() {
                RepeatedFieldBuilderV3<SmsCannedList, SmsCannedList.Builder, SmsCannedListOrBuilder> repeatedFieldBuilderV3 = this.listsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.lists_);
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.SUCCESS : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_SmsCannedListResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SmsCannedListResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(SmsCannedListResponse smsCannedListResponse) {
                if (smsCannedListResponse == SmsCannedListResponse.getDefaultInstance()) {
                    return this;
                }
                if (smsCannedListResponse.hasStatus()) {
                    setStatus(smsCannedListResponse.getStatus());
                }
                if (this.listsBuilder_ == null) {
                    if (!smsCannedListResponse.lists_.isEmpty()) {
                        if (this.lists_.isEmpty()) {
                            this.lists_ = smsCannedListResponse.lists_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureListsIsMutable();
                            this.lists_.addAll(smsCannedListResponse.lists_);
                        }
                        onChanged();
                    }
                } else if (!smsCannedListResponse.lists_.isEmpty()) {
                    boolean zIsEmpty = this.listsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<SmsCannedList, SmsCannedList.Builder, SmsCannedListOrBuilder> repeatedFieldBuilderV3 = this.listsBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.listsBuilder_ = null;
                        this.lists_ = smsCannedListResponse.lists_;
                        this.bitField0_ &= -3;
                        this.listsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getListsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(smsCannedListResponse.lists_);
                    }
                }
                mergeUnknownFields(smsCannedListResponse.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeLists(int i14) {
                RepeatedFieldBuilderV3<SmsCannedList, SmsCannedList.Builder, SmsCannedListOrBuilder> repeatedFieldBuilderV3 = this.listsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureListsIsMutable();
                this.lists_.remove(i14);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setLists(int i14, SmsCannedList.Builder builder) {
                RepeatedFieldBuilderV3<SmsCannedList, SmsCannedList.Builder, SmsCannedListOrBuilder> repeatedFieldBuilderV3 = this.listsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureListsIsMutable();
                this.lists_.set(i14, builder.build());
                onChanged();
                return this;
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
            public SmsCannedListResponse getDefaultInstanceForType() {
                return SmsCannedListResponse.getDefaultInstance();
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
                this.lists_ = Collections.EMPTY_LIST;
            }

            public SmsCannedList.Builder addListsBuilder(int i14) {
                return (SmsCannedList.Builder) getListsFieldBuilder().addBuilder(i14, SmsCannedList.getDefaultInstance());
            }

            public Builder addLists(int i14, SmsCannedList smsCannedList) {
                RepeatedFieldBuilderV3<SmsCannedList, SmsCannedList.Builder, SmsCannedListOrBuilder> repeatedFieldBuilderV3 = this.listsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    smsCannedList.getClass();
                    ensureListsIsMutable();
                    this.lists_.add(i14, smsCannedList);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, smsCannedList);
                return this;
            }

            public Builder setLists(int i14, SmsCannedList smsCannedList) {
                RepeatedFieldBuilderV3<SmsCannedList, SmsCannedList.Builder, SmsCannedListOrBuilder> repeatedFieldBuilderV3 = this.listsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    smsCannedList.getClass();
                    ensureListsIsMutable();
                    this.lists_.set(i14, smsCannedList);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, smsCannedList);
                return this;
            }

            public Builder addLists(SmsCannedList smsCannedList) {
                RepeatedFieldBuilderV3<SmsCannedList, SmsCannedList.Builder, SmsCannedListOrBuilder> repeatedFieldBuilderV3 = this.listsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    smsCannedList.getClass();
                    ensureListsIsMutable();
                    this.lists_.add(smsCannedList);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(smsCannedList);
                return this;
            }

            public Builder addLists(int i14, SmsCannedList.Builder builder) {
                RepeatedFieldBuilderV3<SmsCannedList, SmsCannedList.Builder, SmsCannedListOrBuilder> repeatedFieldBuilderV3 = this.listsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureListsIsMutable();
                    this.lists_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SmsCannedListResponse) {
                    return mergeFrom((SmsCannedListResponse) message);
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
                                    if (ResponseStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    SmsCannedList smsCannedList = (SmsCannedList) codedInputStream.readMessage(SmsCannedList.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<SmsCannedList, SmsCannedList.Builder, SmsCannedListOrBuilder> repeatedFieldBuilderV3 = this.listsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureListsIsMutable();
                                        this.lists_.add(smsCannedList);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(smsCannedList);
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
        public SmsCannedListResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SmsCannedListResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SmsCannedListResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SmsCannedListResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SmsCannedListResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SmsCannedListResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SmsCannedListResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SmsCannedListResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private SmsCannedListResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SmsCannedListResponse parseFrom(InputStream inputStream) {
            return (SmsCannedListResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SmsCannedListResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SmsCannedListResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ SmsCannedListResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SmsCannedListResponse parseFrom(CodedInputStream codedInputStream) {
            return (SmsCannedListResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SmsCannedListResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SmsCannedListResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            SUCCESS(0),
            GENERIC_ERROR(1);

            public static final int GENERIC_ERROR_VALUE = 1;
            public static final int SUCCESS_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDISmsNotificationProto.SmsCannedListResponse.ResponseStatus.1
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
                    return SUCCESS;
                }
                if (i14 != 1) {
                    return null;
                }
                return GENERIC_ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return SmsCannedListResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class SmsNotificationService extends GeneratedMessageV3 implements SmsNotificationServiceOrBuilder {
        private static final SmsNotificationService DEFAULT_INSTANCE = new SmsNotificationService();

        @Deprecated
        public static final Parser<SmsNotificationService> PARSER = new AbstractParser<SmsNotificationService>() { // from class: com.garmin.proto.generated.GDISmsNotificationProto.SmsNotificationService.1
            @Override // com.google.protobuf.Parser
            public SmsNotificationService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SmsNotificationService.newBuilder();
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
        public static final int SMS_CANNED_LIST_CHANGED_NOTIFICATION_FIELD_NUMBER = 3;
        public static final int SMS_CANNED_LIST_REQUEST_FIELD_NUMBER = 4;
        public static final int SMS_CANNED_LIST_RESPONSE_FIELD_NUMBER = 5;
        public static final int SMS_SEND_MESSAGE_REQUEST_FIELD_NUMBER = 1;
        public static final int SMS_SEND_MESSAGE_RESPONSE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private SmsCannedListChangedNotification smsCannedListChangedNotification_;
        private SmsCannedListRequest smsCannedListRequest_;
        private SmsCannedListResponse smsCannedListResponse_;
        private SmsSendMessageRequest smsSendMessageRequest_;
        private SmsSendMessageResponse smsSendMessageResponse_;

        private SmsNotificationService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SmsNotificationService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_SmsNotificationService_descriptor;
        }

        public static Builder newBuilder(SmsNotificationService smsNotificationService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(smsNotificationService);
        }

        public static SmsNotificationService parseDelimitedFrom(InputStream inputStream) {
            return (SmsNotificationService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SmsNotificationService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SmsNotificationService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SmsNotificationService)) {
                return super.equals(obj);
            }
            SmsNotificationService smsNotificationService = (SmsNotificationService) obj;
            if (hasSmsSendMessageRequest() != smsNotificationService.hasSmsSendMessageRequest()) {
                return false;
            }
            if ((hasSmsSendMessageRequest() && !getSmsSendMessageRequest().equals(smsNotificationService.getSmsSendMessageRequest())) || hasSmsSendMessageResponse() != smsNotificationService.hasSmsSendMessageResponse()) {
                return false;
            }
            if ((hasSmsSendMessageResponse() && !getSmsSendMessageResponse().equals(smsNotificationService.getSmsSendMessageResponse())) || hasSmsCannedListChangedNotification() != smsNotificationService.hasSmsCannedListChangedNotification()) {
                return false;
            }
            if ((hasSmsCannedListChangedNotification() && !getSmsCannedListChangedNotification().equals(smsNotificationService.getSmsCannedListChangedNotification())) || hasSmsCannedListRequest() != smsNotificationService.hasSmsCannedListRequest()) {
                return false;
            }
            if ((!hasSmsCannedListRequest() || getSmsCannedListRequest().equals(smsNotificationService.getSmsCannedListRequest())) && hasSmsCannedListResponse() == smsNotificationService.hasSmsCannedListResponse()) {
                return (!hasSmsCannedListResponse() || getSmsCannedListResponse().equals(smsNotificationService.getSmsCannedListResponse())) && getUnknownFields().equals(smsNotificationService.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SmsNotificationService> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getSmsSendMessageRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getSmsSendMessageResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getSmsCannedListChangedNotification());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getSmsCannedListRequest());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getSmsCannedListResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsNotificationServiceOrBuilder
        public SmsCannedListChangedNotification getSmsCannedListChangedNotification() {
            SmsCannedListChangedNotification smsCannedListChangedNotification = this.smsCannedListChangedNotification_;
            return smsCannedListChangedNotification == null ? SmsCannedListChangedNotification.getDefaultInstance() : smsCannedListChangedNotification;
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsNotificationServiceOrBuilder
        public SmsCannedListChangedNotificationOrBuilder getSmsCannedListChangedNotificationOrBuilder() {
            SmsCannedListChangedNotification smsCannedListChangedNotification = this.smsCannedListChangedNotification_;
            return smsCannedListChangedNotification == null ? SmsCannedListChangedNotification.getDefaultInstance() : smsCannedListChangedNotification;
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsNotificationServiceOrBuilder
        public SmsCannedListRequest getSmsCannedListRequest() {
            SmsCannedListRequest smsCannedListRequest = this.smsCannedListRequest_;
            return smsCannedListRequest == null ? SmsCannedListRequest.getDefaultInstance() : smsCannedListRequest;
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsNotificationServiceOrBuilder
        public SmsCannedListRequestOrBuilder getSmsCannedListRequestOrBuilder() {
            SmsCannedListRequest smsCannedListRequest = this.smsCannedListRequest_;
            return smsCannedListRequest == null ? SmsCannedListRequest.getDefaultInstance() : smsCannedListRequest;
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsNotificationServiceOrBuilder
        public SmsCannedListResponse getSmsCannedListResponse() {
            SmsCannedListResponse smsCannedListResponse = this.smsCannedListResponse_;
            return smsCannedListResponse == null ? SmsCannedListResponse.getDefaultInstance() : smsCannedListResponse;
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsNotificationServiceOrBuilder
        public SmsCannedListResponseOrBuilder getSmsCannedListResponseOrBuilder() {
            SmsCannedListResponse smsCannedListResponse = this.smsCannedListResponse_;
            return smsCannedListResponse == null ? SmsCannedListResponse.getDefaultInstance() : smsCannedListResponse;
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsNotificationServiceOrBuilder
        public SmsSendMessageRequest getSmsSendMessageRequest() {
            SmsSendMessageRequest smsSendMessageRequest = this.smsSendMessageRequest_;
            return smsSendMessageRequest == null ? SmsSendMessageRequest.getDefaultInstance() : smsSendMessageRequest;
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsNotificationServiceOrBuilder
        public SmsSendMessageRequestOrBuilder getSmsSendMessageRequestOrBuilder() {
            SmsSendMessageRequest smsSendMessageRequest = this.smsSendMessageRequest_;
            return smsSendMessageRequest == null ? SmsSendMessageRequest.getDefaultInstance() : smsSendMessageRequest;
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsNotificationServiceOrBuilder
        public SmsSendMessageResponse getSmsSendMessageResponse() {
            SmsSendMessageResponse smsSendMessageResponse = this.smsSendMessageResponse_;
            return smsSendMessageResponse == null ? SmsSendMessageResponse.getDefaultInstance() : smsSendMessageResponse;
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsNotificationServiceOrBuilder
        public SmsSendMessageResponseOrBuilder getSmsSendMessageResponseOrBuilder() {
            SmsSendMessageResponse smsSendMessageResponse = this.smsSendMessageResponse_;
            return smsSendMessageResponse == null ? SmsSendMessageResponse.getDefaultInstance() : smsSendMessageResponse;
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsNotificationServiceOrBuilder
        public boolean hasSmsCannedListChangedNotification() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsNotificationServiceOrBuilder
        public boolean hasSmsCannedListRequest() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsNotificationServiceOrBuilder
        public boolean hasSmsCannedListResponse() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsNotificationServiceOrBuilder
        public boolean hasSmsSendMessageRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsNotificationServiceOrBuilder
        public boolean hasSmsSendMessageResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSmsSendMessageRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSmsSendMessageRequest().hashCode();
            }
            if (hasSmsSendMessageResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSmsSendMessageResponse().hashCode();
            }
            if (hasSmsCannedListChangedNotification()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getSmsCannedListChangedNotification().hashCode();
            }
            if (hasSmsCannedListRequest()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getSmsCannedListRequest().hashCode();
            }
            if (hasSmsCannedListResponse()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getSmsCannedListResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_SmsNotificationService_fieldAccessorTable.ensureFieldAccessorsInitialized(SmsNotificationService.class, Builder.class);
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
            return new SmsNotificationService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getSmsSendMessageRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getSmsSendMessageResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getSmsCannedListChangedNotification());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getSmsCannedListRequest());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getSmsCannedListResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SmsNotificationServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<SmsCannedListChangedNotification, SmsCannedListChangedNotification.Builder, SmsCannedListChangedNotificationOrBuilder> smsCannedListChangedNotificationBuilder_;
            private SmsCannedListChangedNotification smsCannedListChangedNotification_;
            private SingleFieldBuilderV3<SmsCannedListRequest, SmsCannedListRequest.Builder, SmsCannedListRequestOrBuilder> smsCannedListRequestBuilder_;
            private SmsCannedListRequest smsCannedListRequest_;
            private SingleFieldBuilderV3<SmsCannedListResponse, SmsCannedListResponse.Builder, SmsCannedListResponseOrBuilder> smsCannedListResponseBuilder_;
            private SmsCannedListResponse smsCannedListResponse_;
            private SingleFieldBuilderV3<SmsSendMessageRequest, SmsSendMessageRequest.Builder, SmsSendMessageRequestOrBuilder> smsSendMessageRequestBuilder_;
            private SmsSendMessageRequest smsSendMessageRequest_;
            private SingleFieldBuilderV3<SmsSendMessageResponse, SmsSendMessageResponse.Builder, SmsSendMessageResponseOrBuilder> smsSendMessageResponseBuilder_;
            private SmsSendMessageResponse smsSendMessageResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(SmsNotificationService smsNotificationService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<SmsSendMessageRequest, SmsSendMessageRequest.Builder, SmsSendMessageRequestOrBuilder> singleFieldBuilderV3 = this.smsSendMessageRequestBuilder_;
                    smsNotificationService.smsSendMessageRequest_ = singleFieldBuilderV3 == null ? this.smsSendMessageRequest_ : (SmsSendMessageRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<SmsSendMessageResponse, SmsSendMessageResponse.Builder, SmsSendMessageResponseOrBuilder> singleFieldBuilderV4 = this.smsSendMessageResponseBuilder_;
                    smsNotificationService.smsSendMessageResponse_ = singleFieldBuilderV4 == null ? this.smsSendMessageResponse_ : (SmsSendMessageResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<SmsCannedListChangedNotification, SmsCannedListChangedNotification.Builder, SmsCannedListChangedNotificationOrBuilder> singleFieldBuilderV5 = this.smsCannedListChangedNotificationBuilder_;
                    smsNotificationService.smsCannedListChangedNotification_ = singleFieldBuilderV5 == null ? this.smsCannedListChangedNotification_ : (SmsCannedListChangedNotification) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<SmsCannedListRequest, SmsCannedListRequest.Builder, SmsCannedListRequestOrBuilder> singleFieldBuilderV6 = this.smsCannedListRequestBuilder_;
                    smsNotificationService.smsCannedListRequest_ = singleFieldBuilderV6 == null ? this.smsCannedListRequest_ : (SmsCannedListRequest) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<SmsCannedListResponse, SmsCannedListResponse.Builder, SmsCannedListResponseOrBuilder> singleFieldBuilderV7 = this.smsCannedListResponseBuilder_;
                    smsNotificationService.smsCannedListResponse_ = singleFieldBuilderV7 == null ? this.smsCannedListResponse_ : (SmsCannedListResponse) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                smsNotificationService.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_SmsNotificationService_descriptor;
            }

            private SingleFieldBuilderV3<SmsCannedListChangedNotification, SmsCannedListChangedNotification.Builder, SmsCannedListChangedNotificationOrBuilder> getSmsCannedListChangedNotificationFieldBuilder() {
                if (this.smsCannedListChangedNotificationBuilder_ == null) {
                    this.smsCannedListChangedNotificationBuilder_ = new SingleFieldBuilderV3<>(getSmsCannedListChangedNotification(), getParentForChildren(), isClean());
                    this.smsCannedListChangedNotification_ = null;
                }
                return this.smsCannedListChangedNotificationBuilder_;
            }

            private SingleFieldBuilderV3<SmsCannedListRequest, SmsCannedListRequest.Builder, SmsCannedListRequestOrBuilder> getSmsCannedListRequestFieldBuilder() {
                if (this.smsCannedListRequestBuilder_ == null) {
                    this.smsCannedListRequestBuilder_ = new SingleFieldBuilderV3<>(getSmsCannedListRequest(), getParentForChildren(), isClean());
                    this.smsCannedListRequest_ = null;
                }
                return this.smsCannedListRequestBuilder_;
            }

            private SingleFieldBuilderV3<SmsCannedListResponse, SmsCannedListResponse.Builder, SmsCannedListResponseOrBuilder> getSmsCannedListResponseFieldBuilder() {
                if (this.smsCannedListResponseBuilder_ == null) {
                    this.smsCannedListResponseBuilder_ = new SingleFieldBuilderV3<>(getSmsCannedListResponse(), getParentForChildren(), isClean());
                    this.smsCannedListResponse_ = null;
                }
                return this.smsCannedListResponseBuilder_;
            }

            private SingleFieldBuilderV3<SmsSendMessageRequest, SmsSendMessageRequest.Builder, SmsSendMessageRequestOrBuilder> getSmsSendMessageRequestFieldBuilder() {
                if (this.smsSendMessageRequestBuilder_ == null) {
                    this.smsSendMessageRequestBuilder_ = new SingleFieldBuilderV3<>(getSmsSendMessageRequest(), getParentForChildren(), isClean());
                    this.smsSendMessageRequest_ = null;
                }
                return this.smsSendMessageRequestBuilder_;
            }

            private SingleFieldBuilderV3<SmsSendMessageResponse, SmsSendMessageResponse.Builder, SmsSendMessageResponseOrBuilder> getSmsSendMessageResponseFieldBuilder() {
                if (this.smsSendMessageResponseBuilder_ == null) {
                    this.smsSendMessageResponseBuilder_ = new SingleFieldBuilderV3<>(getSmsSendMessageResponse(), getParentForChildren(), isClean());
                    this.smsSendMessageResponse_ = null;
                }
                return this.smsSendMessageResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSmsSendMessageRequestFieldBuilder();
                    getSmsSendMessageResponseFieldBuilder();
                    getSmsCannedListChangedNotificationFieldBuilder();
                    getSmsCannedListRequestFieldBuilder();
                    getSmsCannedListResponseFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SmsNotificationService build() {
                SmsNotificationService smsNotificationServiceBuildPartial = buildPartial();
                if (smsNotificationServiceBuildPartial.isInitialized()) {
                    return smsNotificationServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) smsNotificationServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SmsNotificationService buildPartial() {
                SmsNotificationService smsNotificationService = new SmsNotificationService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(smsNotificationService);
                }
                onBuilt();
                return smsNotificationService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.smsSendMessageRequest_ = null;
                SingleFieldBuilderV3<SmsSendMessageRequest, SmsSendMessageRequest.Builder, SmsSendMessageRequestOrBuilder> singleFieldBuilderV3 = this.smsSendMessageRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.smsSendMessageRequestBuilder_ = null;
                }
                this.smsSendMessageResponse_ = null;
                SingleFieldBuilderV3<SmsSendMessageResponse, SmsSendMessageResponse.Builder, SmsSendMessageResponseOrBuilder> singleFieldBuilderV4 = this.smsSendMessageResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.smsSendMessageResponseBuilder_ = null;
                }
                this.smsCannedListChangedNotification_ = null;
                SingleFieldBuilderV3<SmsCannedListChangedNotification, SmsCannedListChangedNotification.Builder, SmsCannedListChangedNotificationOrBuilder> singleFieldBuilderV5 = this.smsCannedListChangedNotificationBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.smsCannedListChangedNotificationBuilder_ = null;
                }
                this.smsCannedListRequest_ = null;
                SingleFieldBuilderV3<SmsCannedListRequest, SmsCannedListRequest.Builder, SmsCannedListRequestOrBuilder> singleFieldBuilderV6 = this.smsCannedListRequestBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.smsCannedListRequestBuilder_ = null;
                }
                this.smsCannedListResponse_ = null;
                SingleFieldBuilderV3<SmsCannedListResponse, SmsCannedListResponse.Builder, SmsCannedListResponseOrBuilder> singleFieldBuilderV7 = this.smsCannedListResponseBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.smsCannedListResponseBuilder_ = null;
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

            public Builder clearSmsCannedListChangedNotification() {
                this.bitField0_ &= -5;
                this.smsCannedListChangedNotification_ = null;
                SingleFieldBuilderV3<SmsCannedListChangedNotification, SmsCannedListChangedNotification.Builder, SmsCannedListChangedNotificationOrBuilder> singleFieldBuilderV3 = this.smsCannedListChangedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.smsCannedListChangedNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSmsCannedListRequest() {
                this.bitField0_ &= -9;
                this.smsCannedListRequest_ = null;
                SingleFieldBuilderV3<SmsCannedListRequest, SmsCannedListRequest.Builder, SmsCannedListRequestOrBuilder> singleFieldBuilderV3 = this.smsCannedListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.smsCannedListRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSmsCannedListResponse() {
                this.bitField0_ &= -17;
                this.smsCannedListResponse_ = null;
                SingleFieldBuilderV3<SmsCannedListResponse, SmsCannedListResponse.Builder, SmsCannedListResponseOrBuilder> singleFieldBuilderV3 = this.smsCannedListResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.smsCannedListResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSmsSendMessageRequest() {
                this.bitField0_ &= -2;
                this.smsSendMessageRequest_ = null;
                SingleFieldBuilderV3<SmsSendMessageRequest, SmsSendMessageRequest.Builder, SmsSendMessageRequestOrBuilder> singleFieldBuilderV3 = this.smsSendMessageRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.smsSendMessageRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSmsSendMessageResponse() {
                this.bitField0_ &= -3;
                this.smsSendMessageResponse_ = null;
                SingleFieldBuilderV3<SmsSendMessageResponse, SmsSendMessageResponse.Builder, SmsSendMessageResponseOrBuilder> singleFieldBuilderV3 = this.smsSendMessageResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.smsSendMessageResponseBuilder_ = null;
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
                return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_SmsNotificationService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsNotificationServiceOrBuilder
            public SmsCannedListChangedNotification getSmsCannedListChangedNotification() {
                SingleFieldBuilderV3<SmsCannedListChangedNotification, SmsCannedListChangedNotification.Builder, SmsCannedListChangedNotificationOrBuilder> singleFieldBuilderV3 = this.smsCannedListChangedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SmsCannedListChangedNotification) singleFieldBuilderV3.getMessage();
                }
                SmsCannedListChangedNotification smsCannedListChangedNotification = this.smsCannedListChangedNotification_;
                return smsCannedListChangedNotification == null ? SmsCannedListChangedNotification.getDefaultInstance() : smsCannedListChangedNotification;
            }

            public SmsCannedListChangedNotification.Builder getSmsCannedListChangedNotificationBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (SmsCannedListChangedNotification.Builder) getSmsCannedListChangedNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsNotificationServiceOrBuilder
            public SmsCannedListChangedNotificationOrBuilder getSmsCannedListChangedNotificationOrBuilder() {
                SingleFieldBuilderV3<SmsCannedListChangedNotification, SmsCannedListChangedNotification.Builder, SmsCannedListChangedNotificationOrBuilder> singleFieldBuilderV3 = this.smsCannedListChangedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SmsCannedListChangedNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SmsCannedListChangedNotification smsCannedListChangedNotification = this.smsCannedListChangedNotification_;
                return smsCannedListChangedNotification == null ? SmsCannedListChangedNotification.getDefaultInstance() : smsCannedListChangedNotification;
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsNotificationServiceOrBuilder
            public SmsCannedListRequest getSmsCannedListRequest() {
                SingleFieldBuilderV3<SmsCannedListRequest, SmsCannedListRequest.Builder, SmsCannedListRequestOrBuilder> singleFieldBuilderV3 = this.smsCannedListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SmsCannedListRequest) singleFieldBuilderV3.getMessage();
                }
                SmsCannedListRequest smsCannedListRequest = this.smsCannedListRequest_;
                return smsCannedListRequest == null ? SmsCannedListRequest.getDefaultInstance() : smsCannedListRequest;
            }

            public SmsCannedListRequest.Builder getSmsCannedListRequestBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (SmsCannedListRequest.Builder) getSmsCannedListRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsNotificationServiceOrBuilder
            public SmsCannedListRequestOrBuilder getSmsCannedListRequestOrBuilder() {
                SingleFieldBuilderV3<SmsCannedListRequest, SmsCannedListRequest.Builder, SmsCannedListRequestOrBuilder> singleFieldBuilderV3 = this.smsCannedListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SmsCannedListRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SmsCannedListRequest smsCannedListRequest = this.smsCannedListRequest_;
                return smsCannedListRequest == null ? SmsCannedListRequest.getDefaultInstance() : smsCannedListRequest;
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsNotificationServiceOrBuilder
            public SmsCannedListResponse getSmsCannedListResponse() {
                SingleFieldBuilderV3<SmsCannedListResponse, SmsCannedListResponse.Builder, SmsCannedListResponseOrBuilder> singleFieldBuilderV3 = this.smsCannedListResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SmsCannedListResponse) singleFieldBuilderV3.getMessage();
                }
                SmsCannedListResponse smsCannedListResponse = this.smsCannedListResponse_;
                return smsCannedListResponse == null ? SmsCannedListResponse.getDefaultInstance() : smsCannedListResponse;
            }

            public SmsCannedListResponse.Builder getSmsCannedListResponseBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (SmsCannedListResponse.Builder) getSmsCannedListResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsNotificationServiceOrBuilder
            public SmsCannedListResponseOrBuilder getSmsCannedListResponseOrBuilder() {
                SingleFieldBuilderV3<SmsCannedListResponse, SmsCannedListResponse.Builder, SmsCannedListResponseOrBuilder> singleFieldBuilderV3 = this.smsCannedListResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SmsCannedListResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SmsCannedListResponse smsCannedListResponse = this.smsCannedListResponse_;
                return smsCannedListResponse == null ? SmsCannedListResponse.getDefaultInstance() : smsCannedListResponse;
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsNotificationServiceOrBuilder
            public SmsSendMessageRequest getSmsSendMessageRequest() {
                SingleFieldBuilderV3<SmsSendMessageRequest, SmsSendMessageRequest.Builder, SmsSendMessageRequestOrBuilder> singleFieldBuilderV3 = this.smsSendMessageRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SmsSendMessageRequest) singleFieldBuilderV3.getMessage();
                }
                SmsSendMessageRequest smsSendMessageRequest = this.smsSendMessageRequest_;
                return smsSendMessageRequest == null ? SmsSendMessageRequest.getDefaultInstance() : smsSendMessageRequest;
            }

            public SmsSendMessageRequest.Builder getSmsSendMessageRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SmsSendMessageRequest.Builder) getSmsSendMessageRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsNotificationServiceOrBuilder
            public SmsSendMessageRequestOrBuilder getSmsSendMessageRequestOrBuilder() {
                SingleFieldBuilderV3<SmsSendMessageRequest, SmsSendMessageRequest.Builder, SmsSendMessageRequestOrBuilder> singleFieldBuilderV3 = this.smsSendMessageRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SmsSendMessageRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SmsSendMessageRequest smsSendMessageRequest = this.smsSendMessageRequest_;
                return smsSendMessageRequest == null ? SmsSendMessageRequest.getDefaultInstance() : smsSendMessageRequest;
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsNotificationServiceOrBuilder
            public SmsSendMessageResponse getSmsSendMessageResponse() {
                SingleFieldBuilderV3<SmsSendMessageResponse, SmsSendMessageResponse.Builder, SmsSendMessageResponseOrBuilder> singleFieldBuilderV3 = this.smsSendMessageResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SmsSendMessageResponse) singleFieldBuilderV3.getMessage();
                }
                SmsSendMessageResponse smsSendMessageResponse = this.smsSendMessageResponse_;
                return smsSendMessageResponse == null ? SmsSendMessageResponse.getDefaultInstance() : smsSendMessageResponse;
            }

            public SmsSendMessageResponse.Builder getSmsSendMessageResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (SmsSendMessageResponse.Builder) getSmsSendMessageResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsNotificationServiceOrBuilder
            public SmsSendMessageResponseOrBuilder getSmsSendMessageResponseOrBuilder() {
                SingleFieldBuilderV3<SmsSendMessageResponse, SmsSendMessageResponse.Builder, SmsSendMessageResponseOrBuilder> singleFieldBuilderV3 = this.smsSendMessageResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SmsSendMessageResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SmsSendMessageResponse smsSendMessageResponse = this.smsSendMessageResponse_;
                return smsSendMessageResponse == null ? SmsSendMessageResponse.getDefaultInstance() : smsSendMessageResponse;
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsNotificationServiceOrBuilder
            public boolean hasSmsCannedListChangedNotification() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsNotificationServiceOrBuilder
            public boolean hasSmsCannedListRequest() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsNotificationServiceOrBuilder
            public boolean hasSmsCannedListResponse() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsNotificationServiceOrBuilder
            public boolean hasSmsSendMessageRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsNotificationServiceOrBuilder
            public boolean hasSmsSendMessageResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_SmsNotificationService_fieldAccessorTable.ensureFieldAccessorsInitialized(SmsNotificationService.class, Builder.class);
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
                                    codedInputStream.readMessage(getSmsSendMessageRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getSmsSendMessageResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getSmsCannedListChangedNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getSmsCannedListRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(getSmsCannedListResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
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

            public Builder mergeSmsCannedListChangedNotification(SmsCannedListChangedNotification smsCannedListChangedNotification) {
                SmsCannedListChangedNotification smsCannedListChangedNotification2;
                SingleFieldBuilderV3<SmsCannedListChangedNotification, SmsCannedListChangedNotification.Builder, SmsCannedListChangedNotificationOrBuilder> singleFieldBuilderV3 = this.smsCannedListChangedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(smsCannedListChangedNotification);
                } else if ((this.bitField0_ & 4) == 0 || (smsCannedListChangedNotification2 = this.smsCannedListChangedNotification_) == null || smsCannedListChangedNotification2 == SmsCannedListChangedNotification.getDefaultInstance()) {
                    this.smsCannedListChangedNotification_ = smsCannedListChangedNotification;
                } else {
                    getSmsCannedListChangedNotificationBuilder().mergeFrom(smsCannedListChangedNotification);
                }
                if (this.smsCannedListChangedNotification_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSmsCannedListRequest(SmsCannedListRequest smsCannedListRequest) {
                SmsCannedListRequest smsCannedListRequest2;
                SingleFieldBuilderV3<SmsCannedListRequest, SmsCannedListRequest.Builder, SmsCannedListRequestOrBuilder> singleFieldBuilderV3 = this.smsCannedListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(smsCannedListRequest);
                } else if ((this.bitField0_ & 8) == 0 || (smsCannedListRequest2 = this.smsCannedListRequest_) == null || smsCannedListRequest2 == SmsCannedListRequest.getDefaultInstance()) {
                    this.smsCannedListRequest_ = smsCannedListRequest;
                } else {
                    getSmsCannedListRequestBuilder().mergeFrom(smsCannedListRequest);
                }
                if (this.smsCannedListRequest_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSmsCannedListResponse(SmsCannedListResponse smsCannedListResponse) {
                SmsCannedListResponse smsCannedListResponse2;
                SingleFieldBuilderV3<SmsCannedListResponse, SmsCannedListResponse.Builder, SmsCannedListResponseOrBuilder> singleFieldBuilderV3 = this.smsCannedListResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(smsCannedListResponse);
                } else if ((this.bitField0_ & 16) == 0 || (smsCannedListResponse2 = this.smsCannedListResponse_) == null || smsCannedListResponse2 == SmsCannedListResponse.getDefaultInstance()) {
                    this.smsCannedListResponse_ = smsCannedListResponse;
                } else {
                    getSmsCannedListResponseBuilder().mergeFrom(smsCannedListResponse);
                }
                if (this.smsCannedListResponse_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSmsSendMessageRequest(SmsSendMessageRequest smsSendMessageRequest) {
                SmsSendMessageRequest smsSendMessageRequest2;
                SingleFieldBuilderV3<SmsSendMessageRequest, SmsSendMessageRequest.Builder, SmsSendMessageRequestOrBuilder> singleFieldBuilderV3 = this.smsSendMessageRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(smsSendMessageRequest);
                } else if ((this.bitField0_ & 1) == 0 || (smsSendMessageRequest2 = this.smsSendMessageRequest_) == null || smsSendMessageRequest2 == SmsSendMessageRequest.getDefaultInstance()) {
                    this.smsSendMessageRequest_ = smsSendMessageRequest;
                } else {
                    getSmsSendMessageRequestBuilder().mergeFrom(smsSendMessageRequest);
                }
                if (this.smsSendMessageRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSmsSendMessageResponse(SmsSendMessageResponse smsSendMessageResponse) {
                SmsSendMessageResponse smsSendMessageResponse2;
                SingleFieldBuilderV3<SmsSendMessageResponse, SmsSendMessageResponse.Builder, SmsSendMessageResponseOrBuilder> singleFieldBuilderV3 = this.smsSendMessageResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(smsSendMessageResponse);
                } else if ((this.bitField0_ & 2) == 0 || (smsSendMessageResponse2 = this.smsSendMessageResponse_) == null || smsSendMessageResponse2 == SmsSendMessageResponse.getDefaultInstance()) {
                    this.smsSendMessageResponse_ = smsSendMessageResponse;
                } else {
                    getSmsSendMessageResponseBuilder().mergeFrom(smsSendMessageResponse);
                }
                if (this.smsSendMessageResponse_ != null) {
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSmsCannedListChangedNotification(SmsCannedListChangedNotification.Builder builder) {
                SingleFieldBuilderV3<SmsCannedListChangedNotification, SmsCannedListChangedNotification.Builder, SmsCannedListChangedNotificationOrBuilder> singleFieldBuilderV3 = this.smsCannedListChangedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.smsCannedListChangedNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSmsCannedListRequest(SmsCannedListRequest.Builder builder) {
                SingleFieldBuilderV3<SmsCannedListRequest, SmsCannedListRequest.Builder, SmsCannedListRequestOrBuilder> singleFieldBuilderV3 = this.smsCannedListRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.smsCannedListRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSmsCannedListResponse(SmsCannedListResponse.Builder builder) {
                SingleFieldBuilderV3<SmsCannedListResponse, SmsCannedListResponse.Builder, SmsCannedListResponseOrBuilder> singleFieldBuilderV3 = this.smsCannedListResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.smsCannedListResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setSmsSendMessageRequest(SmsSendMessageRequest.Builder builder) {
                SingleFieldBuilderV3<SmsSendMessageRequest, SmsSendMessageRequest.Builder, SmsSendMessageRequestOrBuilder> singleFieldBuilderV3 = this.smsSendMessageRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.smsSendMessageRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSmsSendMessageResponse(SmsSendMessageResponse.Builder builder) {
                SingleFieldBuilderV3<SmsSendMessageResponse, SmsSendMessageResponse.Builder, SmsSendMessageResponseOrBuilder> singleFieldBuilderV3 = this.smsSendMessageResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.smsSendMessageResponse_ = builder.build();
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
            public SmsNotificationService getDefaultInstanceForType() {
                return SmsNotificationService.getDefaultInstance();
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

            public Builder setSmsCannedListChangedNotification(SmsCannedListChangedNotification smsCannedListChangedNotification) {
                SingleFieldBuilderV3<SmsCannedListChangedNotification, SmsCannedListChangedNotification.Builder, SmsCannedListChangedNotificationOrBuilder> singleFieldBuilderV3 = this.smsCannedListChangedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    smsCannedListChangedNotification.getClass();
                    this.smsCannedListChangedNotification_ = smsCannedListChangedNotification;
                } else {
                    singleFieldBuilderV3.setMessage(smsCannedListChangedNotification);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSmsCannedListRequest(SmsCannedListRequest smsCannedListRequest) {
                SingleFieldBuilderV3<SmsCannedListRequest, SmsCannedListRequest.Builder, SmsCannedListRequestOrBuilder> singleFieldBuilderV3 = this.smsCannedListRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    smsCannedListRequest.getClass();
                    this.smsCannedListRequest_ = smsCannedListRequest;
                } else {
                    singleFieldBuilderV3.setMessage(smsCannedListRequest);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSmsCannedListResponse(SmsCannedListResponse smsCannedListResponse) {
                SingleFieldBuilderV3<SmsCannedListResponse, SmsCannedListResponse.Builder, SmsCannedListResponseOrBuilder> singleFieldBuilderV3 = this.smsCannedListResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    smsCannedListResponse.getClass();
                    this.smsCannedListResponse_ = smsCannedListResponse;
                } else {
                    singleFieldBuilderV3.setMessage(smsCannedListResponse);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setSmsSendMessageRequest(SmsSendMessageRequest smsSendMessageRequest) {
                SingleFieldBuilderV3<SmsSendMessageRequest, SmsSendMessageRequest.Builder, SmsSendMessageRequestOrBuilder> singleFieldBuilderV3 = this.smsSendMessageRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    smsSendMessageRequest.getClass();
                    this.smsSendMessageRequest_ = smsSendMessageRequest;
                } else {
                    singleFieldBuilderV3.setMessage(smsSendMessageRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSmsSendMessageResponse(SmsSendMessageResponse smsSendMessageResponse) {
                SingleFieldBuilderV3<SmsSendMessageResponse, SmsSendMessageResponse.Builder, SmsSendMessageResponseOrBuilder> singleFieldBuilderV3 = this.smsSendMessageResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    smsSendMessageResponse.getClass();
                    this.smsSendMessageResponse_ = smsSendMessageResponse;
                } else {
                    singleFieldBuilderV3.setMessage(smsSendMessageResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SmsNotificationService) {
                    return mergeFrom((SmsNotificationService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SmsNotificationService smsNotificationService) {
                if (smsNotificationService == SmsNotificationService.getDefaultInstance()) {
                    return this;
                }
                if (smsNotificationService.hasSmsSendMessageRequest()) {
                    mergeSmsSendMessageRequest(smsNotificationService.getSmsSendMessageRequest());
                }
                if (smsNotificationService.hasSmsSendMessageResponse()) {
                    mergeSmsSendMessageResponse(smsNotificationService.getSmsSendMessageResponse());
                }
                if (smsNotificationService.hasSmsCannedListChangedNotification()) {
                    mergeSmsCannedListChangedNotification(smsNotificationService.getSmsCannedListChangedNotification());
                }
                if (smsNotificationService.hasSmsCannedListRequest()) {
                    mergeSmsCannedListRequest(smsNotificationService.getSmsCannedListRequest());
                }
                if (smsNotificationService.hasSmsCannedListResponse()) {
                    mergeSmsCannedListResponse(smsNotificationService.getSmsCannedListResponse());
                }
                mergeUnknownFields(smsNotificationService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SmsNotificationService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ SmsNotificationService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SmsNotificationService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SmsNotificationService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SmsNotificationService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SmsNotificationService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SmsNotificationService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SmsNotificationService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SmsNotificationService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SmsNotificationService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SmsNotificationService parseFrom(InputStream inputStream) {
            return (SmsNotificationService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SmsNotificationService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SmsNotificationService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SmsNotificationService parseFrom(CodedInputStream codedInputStream) {
            return (SmsNotificationService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SmsNotificationService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SmsNotificationService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SmsSendMessageRequest extends GeneratedMessageV3 implements SmsSendMessageRequestOrBuilder {
        public static final int MESSAGE_FIELD_NUMBER = 2;
        public static final int RECEIVER_NUMBER_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private volatile Object message_;
        private volatile Object receiverNumber_;
        private static final SmsSendMessageRequest DEFAULT_INSTANCE = new SmsSendMessageRequest();

        @Deprecated
        public static final Parser<SmsSendMessageRequest> PARSER = new AbstractParser<SmsSendMessageRequest>() { // from class: com.garmin.proto.generated.GDISmsNotificationProto.SmsSendMessageRequest.1
            @Override // com.google.protobuf.Parser
            public SmsSendMessageRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SmsSendMessageRequest.newBuilder();
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

        private SmsSendMessageRequest() {
            this.receiverNumber_ = "";
            this.message_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.receiverNumber_ = "";
            this.message_ = "";
        }

        public static SmsSendMessageRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_SmsSendMessageRequest_descriptor;
        }

        public static Builder newBuilder(SmsSendMessageRequest smsSendMessageRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(smsSendMessageRequest);
        }

        public static SmsSendMessageRequest parseDelimitedFrom(InputStream inputStream) {
            return (SmsSendMessageRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SmsSendMessageRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SmsSendMessageRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SmsSendMessageRequest)) {
                return super.equals(obj);
            }
            SmsSendMessageRequest smsSendMessageRequest = (SmsSendMessageRequest) obj;
            if (hasReceiverNumber() != smsSendMessageRequest.hasReceiverNumber()) {
                return false;
            }
            if ((!hasReceiverNumber() || getReceiverNumber().equals(smsSendMessageRequest.getReceiverNumber())) && hasMessage() == smsSendMessageRequest.hasMessage()) {
                return (!hasMessage() || getMessage().equals(smsSendMessageRequest.getMessage())) && getUnknownFields().equals(smsSendMessageRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsSendMessageRequestOrBuilder
        public String getMessage() {
            Object obj = this.message_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.message_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsSendMessageRequestOrBuilder
        public ByteString getMessageBytes() {
            Object obj = this.message_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.message_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SmsSendMessageRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsSendMessageRequestOrBuilder
        public String getReceiverNumber() {
            Object obj = this.receiverNumber_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.receiverNumber_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsSendMessageRequestOrBuilder
        public ByteString getReceiverNumberBytes() {
            Object obj = this.receiverNumber_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.receiverNumber_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.receiverNumber_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.message_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsSendMessageRequestOrBuilder
        public boolean hasMessage() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsSendMessageRequestOrBuilder
        public boolean hasReceiverNumber() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasReceiverNumber()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getReceiverNumber().hashCode();
            }
            if (hasMessage()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getMessage().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_SmsSendMessageRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SmsSendMessageRequest.class, Builder.class);
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
            return new SmsSendMessageRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.receiverNumber_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.message_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SmsSendMessageRequestOrBuilder {
            private int bitField0_;
            private Object message_;
            private Object receiverNumber_;

            private Builder() {
                this.receiverNumber_ = "";
                this.message_ = "";
            }

            private void buildPartial0(SmsSendMessageRequest smsSendMessageRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    smsSendMessageRequest.receiverNumber_ = this.receiverNumber_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    smsSendMessageRequest.message_ = this.message_;
                    i14 |= 2;
                }
                smsSendMessageRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_SmsSendMessageRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SmsSendMessageRequest build() {
                SmsSendMessageRequest smsSendMessageRequestBuildPartial = buildPartial();
                if (smsSendMessageRequestBuildPartial.isInitialized()) {
                    return smsSendMessageRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) smsSendMessageRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SmsSendMessageRequest buildPartial() {
                SmsSendMessageRequest smsSendMessageRequest = new SmsSendMessageRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(smsSendMessageRequest);
                }
                onBuilt();
                return smsSendMessageRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.receiverNumber_ = "";
                this.message_ = "";
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMessage() {
                this.message_ = SmsSendMessageRequest.getDefaultInstance().getMessage();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearReceiverNumber() {
                this.receiverNumber_ = SmsSendMessageRequest.getDefaultInstance().getReceiverNumber();
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
                return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_SmsSendMessageRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsSendMessageRequestOrBuilder
            public String getMessage() {
                Object obj = this.message_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.message_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsSendMessageRequestOrBuilder
            public ByteString getMessageBytes() {
                Object obj = this.message_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.message_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsSendMessageRequestOrBuilder
            public String getReceiverNumber() {
                Object obj = this.receiverNumber_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.receiverNumber_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsSendMessageRequestOrBuilder
            public ByteString getReceiverNumberBytes() {
                Object obj = this.receiverNumber_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.receiverNumber_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsSendMessageRequestOrBuilder
            public boolean hasMessage() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsSendMessageRequestOrBuilder
            public boolean hasReceiverNumber() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_SmsSendMessageRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SmsSendMessageRequest.class, Builder.class);
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
                                    this.receiverNumber_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.message_ = codedInputStream.readBytes();
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

            public Builder setMessage(String str) {
                str.getClass();
                this.message_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setMessageBytes(ByteString byteString) {
                byteString.getClass();
                this.message_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setReceiverNumber(String str) {
                str.getClass();
                this.receiverNumber_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setReceiverNumberBytes(ByteString byteString) {
                byteString.getClass();
                this.receiverNumber_ = byteString;
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
            public SmsSendMessageRequest getDefaultInstanceForType() {
                return SmsSendMessageRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.receiverNumber_ = "";
                this.message_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SmsSendMessageRequest) {
                    return mergeFrom((SmsSendMessageRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SmsSendMessageRequest smsSendMessageRequest) {
                if (smsSendMessageRequest == SmsSendMessageRequest.getDefaultInstance()) {
                    return this;
                }
                if (smsSendMessageRequest.hasReceiverNumber()) {
                    this.receiverNumber_ = smsSendMessageRequest.receiverNumber_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (smsSendMessageRequest.hasMessage()) {
                    this.message_ = smsSendMessageRequest.message_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                mergeUnknownFields(smsSendMessageRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SmsSendMessageRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SmsSendMessageRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SmsSendMessageRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SmsSendMessageRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SmsSendMessageRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SmsSendMessageRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SmsSendMessageRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SmsSendMessageRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SmsSendMessageRequest parseFrom(InputStream inputStream) {
            return (SmsSendMessageRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SmsSendMessageRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SmsSendMessageRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private SmsSendMessageRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.receiverNumber_ = "";
            this.message_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SmsSendMessageRequest parseFrom(CodedInputStream codedInputStream) {
            return (SmsSendMessageRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SmsSendMessageRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SmsSendMessageRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ SmsSendMessageRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class SmsSendMessageResponse extends GeneratedMessageV3 implements SmsSendMessageResponseOrBuilder {
        private static final SmsSendMessageResponse DEFAULT_INSTANCE = new SmsSendMessageResponse();

        @Deprecated
        public static final Parser<SmsSendMessageResponse> PARSER = new AbstractParser<SmsSendMessageResponse>() { // from class: com.garmin.proto.generated.GDISmsNotificationProto.SmsSendMessageResponse.1
            @Override // com.google.protobuf.Parser
            public SmsSendMessageResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SmsSendMessageResponse.newBuilder();
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

        private SmsSendMessageResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SmsSendMessageResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_SmsSendMessageResponse_descriptor;
        }

        public static Builder newBuilder(SmsSendMessageResponse smsSendMessageResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(smsSendMessageResponse);
        }

        public static SmsSendMessageResponse parseDelimitedFrom(InputStream inputStream) {
            return (SmsSendMessageResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SmsSendMessageResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SmsSendMessageResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SmsSendMessageResponse)) {
                return super.equals(obj);
            }
            SmsSendMessageResponse smsSendMessageResponse = (SmsSendMessageResponse) obj;
            if (hasStatus() != smsSendMessageResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == smsSendMessageResponse.status_) && getUnknownFields().equals(smsSendMessageResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SmsSendMessageResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsSendMessageResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.SUCCESS : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsSendMessageResponseOrBuilder
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
            return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_SmsSendMessageResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SmsSendMessageResponse.class, Builder.class);
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
            return new SmsSendMessageResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SmsSendMessageResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(SmsSendMessageResponse smsSendMessageResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    smsSendMessageResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                smsSendMessageResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_SmsSendMessageResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SmsSendMessageResponse build() {
                SmsSendMessageResponse smsSendMessageResponseBuildPartial = buildPartial();
                if (smsSendMessageResponseBuildPartial.isInitialized()) {
                    return smsSendMessageResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) smsSendMessageResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SmsSendMessageResponse buildPartial() {
                SmsSendMessageResponse smsSendMessageResponse = new SmsSendMessageResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(smsSendMessageResponse);
                }
                onBuilt();
                return smsSendMessageResponse;
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
                return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_SmsSendMessageResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsSendMessageResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.SUCCESS : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDISmsNotificationProto.SmsSendMessageResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISmsNotificationProto.internal_static_GDI_Proto_SmsNotification_SmsSendMessageResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SmsSendMessageResponse.class, Builder.class);
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
            public SmsSendMessageResponse getDefaultInstanceForType() {
                return SmsSendMessageResponse.getDefaultInstance();
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
                if (message instanceof SmsSendMessageResponse) {
                    return mergeFrom((SmsSendMessageResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SmsSendMessageResponse smsSendMessageResponse) {
                if (smsSendMessageResponse == SmsSendMessageResponse.getDefaultInstance()) {
                    return this;
                }
                if (smsSendMessageResponse.hasStatus()) {
                    setStatus(smsSendMessageResponse.getStatus());
                }
                mergeUnknownFields(smsSendMessageResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SmsSendMessageResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SmsSendMessageResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SmsSendMessageResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SmsSendMessageResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ SmsSendMessageResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SmsSendMessageResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SmsSendMessageResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SmsSendMessageResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SmsSendMessageResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SmsSendMessageResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SmsSendMessageResponse parseFrom(InputStream inputStream) {
            return (SmsSendMessageResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SmsSendMessageResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SmsSendMessageResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SmsSendMessageResponse parseFrom(CodedInputStream codedInputStream) {
            return (SmsSendMessageResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SmsSendMessageResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SmsSendMessageResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        /* JADX INFO: loaded from: classes13.dex */
        public enum ResponseStatus implements ProtocolMessageEnum {
            SUCCESS(0),
            GENERIC_ERROR(1);

            public static final int GENERIC_ERROR_VALUE = 1;
            public static final int SUCCESS_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDISmsNotificationProto.SmsSendMessageResponse.ResponseStatus.1
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
                    return SUCCESS;
                }
                if (i14 != 1) {
                    return null;
                }
                return GENERIC_ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return SmsSendMessageResponse.getDescriptor().getEnumTypes().get(0);
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

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public enum CannedListType implements ProtocolMessageEnum {
        PHONE_CALL_RESPONSE(0),
        SMS_MESSAGE_RESPONSE(1),
        GROUP_TRACK_RESPONSE(2);

        public static final int GROUP_TRACK_RESPONSE_VALUE = 2;
        public static final int PHONE_CALL_RESPONSE_VALUE = 0;
        public static final int SMS_MESSAGE_RESPONSE_VALUE = 1;
        private final int value;
        private static final Internal.EnumLiteMap<CannedListType> internalValueMap = new Internal.EnumLiteMap<CannedListType>() { // from class: com.garmin.proto.generated.GDISmsNotificationProto.CannedListType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public CannedListType findValueByNumber(int i14) {
                return CannedListType.forNumber(i14);
            }
        };
        private static final CannedListType[] VALUES = values();

        CannedListType(int i14) {
            this.value = i14;
        }

        public static CannedListType forNumber(int i14) {
            if (i14 == 0) {
                return PHONE_CALL_RESPONSE;
            }
            if (i14 == 1) {
                return SMS_MESSAGE_RESPONSE;
            }
            if (i14 != 2) {
                return null;
            }
            return GROUP_TRACK_RESPONSE;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDISmsNotificationProto.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<CannedListType> internalGetValueMap() {
            return internalValueMap;
        }

        public static CannedListType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static CannedListType valueOf(int i14) {
            return forNumber(i14);
        }
    }
}
