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
public final class EmergencyAssistanceProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0019emergencyassistance.proto\u0012\u001dCSM.Proto.EmergencyAssistance\u001a\u000fdataTypes.proto\"\u0081\u0001\n\u001aEmergencyAssistanceRequest\u0012c\n\u001eemergency_notification_request\u0018\u0001 \u0001(\u000b2;.CSM.Proto.EmergencyAssistance.EmergencyNotificationRequest\"\u0084\u0001\n\u001bEmergencyAssistanceResponse\u0012e\n\u001femergency_notification_response\u0018\u0001 \u0001(\u000b2<.CSM.Proto.EmergencyAssistance.EmergencyNotificationResponse\"¡\u0002\n\u001cEmergencyNotificationRequest\u0012+\n\bposition\u0018\u0001 \u0001(\u000b2\u0019.CSM.Proto.Common.ScPoint\u0012\u0013\n\u000bsender_name\u0018\u0002 \u0001(\t\u0012\u001b\n\u0013message_template_id\u0018\u0003 \u0001(\t\u0012\u0019\n\u0011emergency_SMS_msg\u0018\u0004 \u0001(\t\u0012=\n\u0011emergency_contact\u0018\u0005 \u0003(\u000b2\".CSM.Proto.Common.EmergencyContact\u0012-\n\blanguage\u0018\u0006 \u0001(\u000e2\u001b.CSM.Proto.Common.Languages\u0012\u0019\n\u0011gcUserDisplayname\u0018\u0007 \u0001(\t\"u\n\u001dEmergencyNotificationResponse\u0012T\n\u0006status\u0018\u0001 \u0001(\u000e2@.CSM.Proto.EmergencyAssistance.EmergencyAssistanceResponseStatus:\u0002OK*C\n!EmergencyAssistanceResponseStatus\u0012\u0006\n\u0002OK\u0010\u0000\u0012\u0016\n\u0012ERROR_ALERT_FAILED\u0010\u0001B<\n\u001ecom.garmin.gcsprotos.generatedB\u0018EmergencyAssistanceProtoH\u0003"}, new Descriptors.FileDescriptor[]{DataTypesProto.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_CSM_Proto_EmergencyAssistance_EmergencyAssistanceRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CSM_Proto_EmergencyAssistance_EmergencyAssistanceRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_CSM_Proto_EmergencyAssistance_EmergencyAssistanceResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CSM_Proto_EmergencyAssistance_EmergencyAssistanceResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_CSM_Proto_EmergencyAssistance_EmergencyNotificationRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CSM_Proto_EmergencyAssistance_EmergencyNotificationRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_CSM_Proto_EmergencyAssistance_EmergencyNotificationResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_CSM_Proto_EmergencyAssistance_EmergencyNotificationResponse_fieldAccessorTable;

    public interface EmergencyAssistanceRequestOrBuilder extends MessageOrBuilder {
        EmergencyNotificationRequest getEmergencyNotificationRequest();

        EmergencyNotificationRequestOrBuilder getEmergencyNotificationRequestOrBuilder();

        boolean hasEmergencyNotificationRequest();
    }

    public interface EmergencyAssistanceResponseOrBuilder extends MessageOrBuilder {
        EmergencyNotificationResponse getEmergencyNotificationResponse();

        EmergencyNotificationResponseOrBuilder getEmergencyNotificationResponseOrBuilder();

        boolean hasEmergencyNotificationResponse();
    }

    public interface EmergencyNotificationRequestOrBuilder extends MessageOrBuilder {
        DataTypesProto.EmergencyContact getEmergencyContact(int i14);

        int getEmergencyContactCount();

        List<DataTypesProto.EmergencyContact> getEmergencyContactList();

        DataTypesProto.EmergencyContactOrBuilder getEmergencyContactOrBuilder(int i14);

        List<? extends DataTypesProto.EmergencyContactOrBuilder> getEmergencyContactOrBuilderList();

        String getEmergencySMSMsg();

        ByteString getEmergencySMSMsgBytes();

        String getGcUserDisplayname();

        ByteString getGcUserDisplaynameBytes();

        DataTypesProto.Languages getLanguage();

        String getMessageTemplateId();

        ByteString getMessageTemplateIdBytes();

        DataTypesProto.ScPoint getPosition();

        DataTypesProto.ScPointOrBuilder getPositionOrBuilder();

        String getSenderName();

        ByteString getSenderNameBytes();

        boolean hasEmergencySMSMsg();

        boolean hasGcUserDisplayname();

        boolean hasLanguage();

        boolean hasMessageTemplateId();

        boolean hasPosition();

        boolean hasSenderName();
    }

    public interface EmergencyNotificationResponseOrBuilder extends MessageOrBuilder {
        EmergencyAssistanceResponseStatus getStatus();

        boolean hasStatus();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_CSM_Proto_EmergencyAssistance_EmergencyAssistanceRequest_descriptor = descriptor2;
        internal_static_CSM_Proto_EmergencyAssistance_EmergencyAssistanceRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"EmergencyNotificationRequest"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_CSM_Proto_EmergencyAssistance_EmergencyAssistanceResponse_descriptor = descriptor3;
        internal_static_CSM_Proto_EmergencyAssistance_EmergencyAssistanceResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"EmergencyNotificationResponse"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_CSM_Proto_EmergencyAssistance_EmergencyNotificationRequest_descriptor = descriptor4;
        internal_static_CSM_Proto_EmergencyAssistance_EmergencyNotificationRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Position", "SenderName", "MessageTemplateId", "EmergencySMSMsg", "EmergencyContact", "Language", "GcUserDisplayname"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_CSM_Proto_EmergencyAssistance_EmergencyNotificationResponse_descriptor = descriptor5;
        internal_static_CSM_Proto_EmergencyAssistance_EmergencyNotificationResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Status"});
        DataTypesProto.getDescriptor();
    }

    private EmergencyAssistanceProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class EmergencyAssistanceRequest extends GeneratedMessageV3 implements EmergencyAssistanceRequestOrBuilder {
        public static final int EMERGENCY_NOTIFICATION_REQUEST_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private EmergencyNotificationRequest emergencyNotificationRequest_;
        private byte memoizedIsInitialized;
        private static final EmergencyAssistanceRequest DEFAULT_INSTANCE = new EmergencyAssistanceRequest();

        @Deprecated
        public static final Parser<EmergencyAssistanceRequest> PARSER = new AbstractParser<EmergencyAssistanceRequest>() { // from class: com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyAssistanceRequest.1
            @Override // com.google.protobuf.Parser
            public EmergencyAssistanceRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = EmergencyAssistanceRequest.newBuilder();
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

        private EmergencyAssistanceRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EmergencyAssistanceRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EmergencyAssistanceProto.internal_static_CSM_Proto_EmergencyAssistance_EmergencyAssistanceRequest_descriptor;
        }

        public static Builder newBuilder(EmergencyAssistanceRequest emergencyAssistanceRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(emergencyAssistanceRequest);
        }

        public static EmergencyAssistanceRequest parseDelimitedFrom(InputStream inputStream) {
            return (EmergencyAssistanceRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EmergencyAssistanceRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<EmergencyAssistanceRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EmergencyAssistanceRequest)) {
                return super.equals(obj);
            }
            EmergencyAssistanceRequest emergencyAssistanceRequest = (EmergencyAssistanceRequest) obj;
            if (hasEmergencyNotificationRequest() != emergencyAssistanceRequest.hasEmergencyNotificationRequest()) {
                return false;
            }
            return (!hasEmergencyNotificationRequest() || getEmergencyNotificationRequest().equals(emergencyAssistanceRequest.getEmergencyNotificationRequest())) && getUnknownFields().equals(emergencyAssistanceRequest.getUnknownFields());
        }

        @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyAssistanceRequestOrBuilder
        public EmergencyNotificationRequest getEmergencyNotificationRequest() {
            EmergencyNotificationRequest emergencyNotificationRequest = this.emergencyNotificationRequest_;
            return emergencyNotificationRequest == null ? EmergencyNotificationRequest.getDefaultInstance() : emergencyNotificationRequest;
        }

        @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyAssistanceRequestOrBuilder
        public EmergencyNotificationRequestOrBuilder getEmergencyNotificationRequestOrBuilder() {
            EmergencyNotificationRequest emergencyNotificationRequest = this.emergencyNotificationRequest_;
            return emergencyNotificationRequest == null ? EmergencyNotificationRequest.getDefaultInstance() : emergencyNotificationRequest;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EmergencyAssistanceRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getEmergencyNotificationRequest()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyAssistanceRequestOrBuilder
        public boolean hasEmergencyNotificationRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasEmergencyNotificationRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getEmergencyNotificationRequest().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EmergencyAssistanceProto.internal_static_CSM_Proto_EmergencyAssistance_EmergencyAssistanceRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(EmergencyAssistanceRequest.class, Builder.class);
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
            if (!hasEmergencyNotificationRequest() || getEmergencyNotificationRequest().isInitialized()) {
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
            return new EmergencyAssistanceRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getEmergencyNotificationRequest());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EmergencyAssistanceRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<EmergencyNotificationRequest, EmergencyNotificationRequest.Builder, EmergencyNotificationRequestOrBuilder> emergencyNotificationRequestBuilder_;
            private EmergencyNotificationRequest emergencyNotificationRequest_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(EmergencyAssistanceRequest emergencyAssistanceRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<EmergencyNotificationRequest, EmergencyNotificationRequest.Builder, EmergencyNotificationRequestOrBuilder> singleFieldBuilderV3 = this.emergencyNotificationRequestBuilder_;
                    emergencyAssistanceRequest.emergencyNotificationRequest_ = singleFieldBuilderV3 == null ? this.emergencyNotificationRequest_ : (EmergencyNotificationRequest) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                emergencyAssistanceRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EmergencyAssistanceProto.internal_static_CSM_Proto_EmergencyAssistance_EmergencyAssistanceRequest_descriptor;
            }

            private SingleFieldBuilderV3<EmergencyNotificationRequest, EmergencyNotificationRequest.Builder, EmergencyNotificationRequestOrBuilder> getEmergencyNotificationRequestFieldBuilder() {
                if (this.emergencyNotificationRequestBuilder_ == null) {
                    this.emergencyNotificationRequestBuilder_ = new SingleFieldBuilderV3<>(getEmergencyNotificationRequest(), getParentForChildren(), isClean());
                    this.emergencyNotificationRequest_ = null;
                }
                return this.emergencyNotificationRequestBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getEmergencyNotificationRequestFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EmergencyAssistanceRequest build() {
                EmergencyAssistanceRequest emergencyAssistanceRequestBuildPartial = buildPartial();
                if (emergencyAssistanceRequestBuildPartial.isInitialized()) {
                    return emergencyAssistanceRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) emergencyAssistanceRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EmergencyAssistanceRequest buildPartial() {
                EmergencyAssistanceRequest emergencyAssistanceRequest = new EmergencyAssistanceRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(emergencyAssistanceRequest);
                }
                onBuilt();
                return emergencyAssistanceRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.emergencyNotificationRequest_ = null;
                SingleFieldBuilderV3<EmergencyNotificationRequest, EmergencyNotificationRequest.Builder, EmergencyNotificationRequestOrBuilder> singleFieldBuilderV3 = this.emergencyNotificationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.emergencyNotificationRequestBuilder_ = null;
                }
                return this;
            }

            public Builder clearEmergencyNotificationRequest() {
                this.bitField0_ &= -2;
                this.emergencyNotificationRequest_ = null;
                SingleFieldBuilderV3<EmergencyNotificationRequest, EmergencyNotificationRequest.Builder, EmergencyNotificationRequestOrBuilder> singleFieldBuilderV3 = this.emergencyNotificationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.emergencyNotificationRequestBuilder_ = null;
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
                return EmergencyAssistanceProto.internal_static_CSM_Proto_EmergencyAssistance_EmergencyAssistanceRequest_descriptor;
            }

            @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyAssistanceRequestOrBuilder
            public EmergencyNotificationRequest getEmergencyNotificationRequest() {
                SingleFieldBuilderV3<EmergencyNotificationRequest, EmergencyNotificationRequest.Builder, EmergencyNotificationRequestOrBuilder> singleFieldBuilderV3 = this.emergencyNotificationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EmergencyNotificationRequest) singleFieldBuilderV3.getMessage();
                }
                EmergencyNotificationRequest emergencyNotificationRequest = this.emergencyNotificationRequest_;
                return emergencyNotificationRequest == null ? EmergencyNotificationRequest.getDefaultInstance() : emergencyNotificationRequest;
            }

            public EmergencyNotificationRequest.Builder getEmergencyNotificationRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (EmergencyNotificationRequest.Builder) getEmergencyNotificationRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyAssistanceRequestOrBuilder
            public EmergencyNotificationRequestOrBuilder getEmergencyNotificationRequestOrBuilder() {
                SingleFieldBuilderV3<EmergencyNotificationRequest, EmergencyNotificationRequest.Builder, EmergencyNotificationRequestOrBuilder> singleFieldBuilderV3 = this.emergencyNotificationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EmergencyNotificationRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                EmergencyNotificationRequest emergencyNotificationRequest = this.emergencyNotificationRequest_;
                return emergencyNotificationRequest == null ? EmergencyNotificationRequest.getDefaultInstance() : emergencyNotificationRequest;
            }

            @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyAssistanceRequestOrBuilder
            public boolean hasEmergencyNotificationRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EmergencyAssistanceProto.internal_static_CSM_Proto_EmergencyAssistance_EmergencyAssistanceRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(EmergencyAssistanceRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasEmergencyNotificationRequest() || getEmergencyNotificationRequest().isInitialized();
            }

            public Builder mergeEmergencyNotificationRequest(EmergencyNotificationRequest emergencyNotificationRequest) {
                EmergencyNotificationRequest emergencyNotificationRequest2;
                SingleFieldBuilderV3<EmergencyNotificationRequest, EmergencyNotificationRequest.Builder, EmergencyNotificationRequestOrBuilder> singleFieldBuilderV3 = this.emergencyNotificationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(emergencyNotificationRequest);
                } else if ((this.bitField0_ & 1) == 0 || (emergencyNotificationRequest2 = this.emergencyNotificationRequest_) == null || emergencyNotificationRequest2 == EmergencyNotificationRequest.getDefaultInstance()) {
                    this.emergencyNotificationRequest_ = emergencyNotificationRequest;
                } else {
                    getEmergencyNotificationRequestBuilder().mergeFrom(emergencyNotificationRequest);
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
                                    codedInputStream.readMessage(getEmergencyNotificationRequestFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setEmergencyNotificationRequest(EmergencyNotificationRequest.Builder builder) {
                SingleFieldBuilderV3<EmergencyNotificationRequest, EmergencyNotificationRequest.Builder, EmergencyNotificationRequestOrBuilder> singleFieldBuilderV3 = this.emergencyNotificationRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.emergencyNotificationRequest_ = builder.build();
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
            public EmergencyAssistanceRequest getDefaultInstanceForType() {
                return EmergencyAssistanceRequest.getDefaultInstance();
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

            public Builder setEmergencyNotificationRequest(EmergencyNotificationRequest emergencyNotificationRequest) {
                SingleFieldBuilderV3<EmergencyNotificationRequest, EmergencyNotificationRequest.Builder, EmergencyNotificationRequestOrBuilder> singleFieldBuilderV3 = this.emergencyNotificationRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    emergencyNotificationRequest.getClass();
                    this.emergencyNotificationRequest_ = emergencyNotificationRequest;
                } else {
                    singleFieldBuilderV3.setMessage(emergencyNotificationRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EmergencyAssistanceRequest) {
                    return mergeFrom((EmergencyAssistanceRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EmergencyAssistanceRequest emergencyAssistanceRequest) {
                if (emergencyAssistanceRequest == EmergencyAssistanceRequest.getDefaultInstance()) {
                    return this;
                }
                if (emergencyAssistanceRequest.hasEmergencyNotificationRequest()) {
                    mergeEmergencyNotificationRequest(emergencyAssistanceRequest.getEmergencyNotificationRequest());
                }
                mergeUnknownFields(emergencyAssistanceRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EmergencyAssistanceRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ EmergencyAssistanceRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private EmergencyAssistanceRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EmergencyAssistanceRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EmergencyAssistanceRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EmergencyAssistanceRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static EmergencyAssistanceRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EmergencyAssistanceRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static EmergencyAssistanceRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static EmergencyAssistanceRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static EmergencyAssistanceRequest parseFrom(InputStream inputStream) {
            return (EmergencyAssistanceRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static EmergencyAssistanceRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EmergencyAssistanceRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EmergencyAssistanceRequest parseFrom(CodedInputStream codedInputStream) {
            return (EmergencyAssistanceRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static EmergencyAssistanceRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EmergencyAssistanceRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class EmergencyAssistanceResponse extends GeneratedMessageV3 implements EmergencyAssistanceResponseOrBuilder {
        public static final int EMERGENCY_NOTIFICATION_RESPONSE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private EmergencyNotificationResponse emergencyNotificationResponse_;
        private byte memoizedIsInitialized;
        private static final EmergencyAssistanceResponse DEFAULT_INSTANCE = new EmergencyAssistanceResponse();

        @Deprecated
        public static final Parser<EmergencyAssistanceResponse> PARSER = new AbstractParser<EmergencyAssistanceResponse>() { // from class: com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyAssistanceResponse.1
            @Override // com.google.protobuf.Parser
            public EmergencyAssistanceResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = EmergencyAssistanceResponse.newBuilder();
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

        private EmergencyAssistanceResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EmergencyAssistanceResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EmergencyAssistanceProto.internal_static_CSM_Proto_EmergencyAssistance_EmergencyAssistanceResponse_descriptor;
        }

        public static Builder newBuilder(EmergencyAssistanceResponse emergencyAssistanceResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(emergencyAssistanceResponse);
        }

        public static EmergencyAssistanceResponse parseDelimitedFrom(InputStream inputStream) {
            return (EmergencyAssistanceResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EmergencyAssistanceResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<EmergencyAssistanceResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EmergencyAssistanceResponse)) {
                return super.equals(obj);
            }
            EmergencyAssistanceResponse emergencyAssistanceResponse = (EmergencyAssistanceResponse) obj;
            if (hasEmergencyNotificationResponse() != emergencyAssistanceResponse.hasEmergencyNotificationResponse()) {
                return false;
            }
            return (!hasEmergencyNotificationResponse() || getEmergencyNotificationResponse().equals(emergencyAssistanceResponse.getEmergencyNotificationResponse())) && getUnknownFields().equals(emergencyAssistanceResponse.getUnknownFields());
        }

        @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyAssistanceResponseOrBuilder
        public EmergencyNotificationResponse getEmergencyNotificationResponse() {
            EmergencyNotificationResponse emergencyNotificationResponse = this.emergencyNotificationResponse_;
            return emergencyNotificationResponse == null ? EmergencyNotificationResponse.getDefaultInstance() : emergencyNotificationResponse;
        }

        @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyAssistanceResponseOrBuilder
        public EmergencyNotificationResponseOrBuilder getEmergencyNotificationResponseOrBuilder() {
            EmergencyNotificationResponse emergencyNotificationResponse = this.emergencyNotificationResponse_;
            return emergencyNotificationResponse == null ? EmergencyNotificationResponse.getDefaultInstance() : emergencyNotificationResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EmergencyAssistanceResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getEmergencyNotificationResponse()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyAssistanceResponseOrBuilder
        public boolean hasEmergencyNotificationResponse() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasEmergencyNotificationResponse()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getEmergencyNotificationResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EmergencyAssistanceProto.internal_static_CSM_Proto_EmergencyAssistance_EmergencyAssistanceResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(EmergencyAssistanceResponse.class, Builder.class);
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
            return new EmergencyAssistanceResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getEmergencyNotificationResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EmergencyAssistanceResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<EmergencyNotificationResponse, EmergencyNotificationResponse.Builder, EmergencyNotificationResponseOrBuilder> emergencyNotificationResponseBuilder_;
            private EmergencyNotificationResponse emergencyNotificationResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(EmergencyAssistanceResponse emergencyAssistanceResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<EmergencyNotificationResponse, EmergencyNotificationResponse.Builder, EmergencyNotificationResponseOrBuilder> singleFieldBuilderV3 = this.emergencyNotificationResponseBuilder_;
                    emergencyAssistanceResponse.emergencyNotificationResponse_ = singleFieldBuilderV3 == null ? this.emergencyNotificationResponse_ : (EmergencyNotificationResponse) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                emergencyAssistanceResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EmergencyAssistanceProto.internal_static_CSM_Proto_EmergencyAssistance_EmergencyAssistanceResponse_descriptor;
            }

            private SingleFieldBuilderV3<EmergencyNotificationResponse, EmergencyNotificationResponse.Builder, EmergencyNotificationResponseOrBuilder> getEmergencyNotificationResponseFieldBuilder() {
                if (this.emergencyNotificationResponseBuilder_ == null) {
                    this.emergencyNotificationResponseBuilder_ = new SingleFieldBuilderV3<>(getEmergencyNotificationResponse(), getParentForChildren(), isClean());
                    this.emergencyNotificationResponse_ = null;
                }
                return this.emergencyNotificationResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getEmergencyNotificationResponseFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EmergencyAssistanceResponse build() {
                EmergencyAssistanceResponse emergencyAssistanceResponseBuildPartial = buildPartial();
                if (emergencyAssistanceResponseBuildPartial.isInitialized()) {
                    return emergencyAssistanceResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) emergencyAssistanceResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EmergencyAssistanceResponse buildPartial() {
                EmergencyAssistanceResponse emergencyAssistanceResponse = new EmergencyAssistanceResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(emergencyAssistanceResponse);
                }
                onBuilt();
                return emergencyAssistanceResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.emergencyNotificationResponse_ = null;
                SingleFieldBuilderV3<EmergencyNotificationResponse, EmergencyNotificationResponse.Builder, EmergencyNotificationResponseOrBuilder> singleFieldBuilderV3 = this.emergencyNotificationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.emergencyNotificationResponseBuilder_ = null;
                }
                return this;
            }

            public Builder clearEmergencyNotificationResponse() {
                this.bitField0_ &= -2;
                this.emergencyNotificationResponse_ = null;
                SingleFieldBuilderV3<EmergencyNotificationResponse, EmergencyNotificationResponse.Builder, EmergencyNotificationResponseOrBuilder> singleFieldBuilderV3 = this.emergencyNotificationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.emergencyNotificationResponseBuilder_ = null;
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
                return EmergencyAssistanceProto.internal_static_CSM_Proto_EmergencyAssistance_EmergencyAssistanceResponse_descriptor;
            }

            @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyAssistanceResponseOrBuilder
            public EmergencyNotificationResponse getEmergencyNotificationResponse() {
                SingleFieldBuilderV3<EmergencyNotificationResponse, EmergencyNotificationResponse.Builder, EmergencyNotificationResponseOrBuilder> singleFieldBuilderV3 = this.emergencyNotificationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EmergencyNotificationResponse) singleFieldBuilderV3.getMessage();
                }
                EmergencyNotificationResponse emergencyNotificationResponse = this.emergencyNotificationResponse_;
                return emergencyNotificationResponse == null ? EmergencyNotificationResponse.getDefaultInstance() : emergencyNotificationResponse;
            }

            public EmergencyNotificationResponse.Builder getEmergencyNotificationResponseBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (EmergencyNotificationResponse.Builder) getEmergencyNotificationResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyAssistanceResponseOrBuilder
            public EmergencyNotificationResponseOrBuilder getEmergencyNotificationResponseOrBuilder() {
                SingleFieldBuilderV3<EmergencyNotificationResponse, EmergencyNotificationResponse.Builder, EmergencyNotificationResponseOrBuilder> singleFieldBuilderV3 = this.emergencyNotificationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EmergencyNotificationResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                EmergencyNotificationResponse emergencyNotificationResponse = this.emergencyNotificationResponse_;
                return emergencyNotificationResponse == null ? EmergencyNotificationResponse.getDefaultInstance() : emergencyNotificationResponse;
            }

            @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyAssistanceResponseOrBuilder
            public boolean hasEmergencyNotificationResponse() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EmergencyAssistanceProto.internal_static_CSM_Proto_EmergencyAssistance_EmergencyAssistanceResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(EmergencyAssistanceResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeEmergencyNotificationResponse(EmergencyNotificationResponse emergencyNotificationResponse) {
                EmergencyNotificationResponse emergencyNotificationResponse2;
                SingleFieldBuilderV3<EmergencyNotificationResponse, EmergencyNotificationResponse.Builder, EmergencyNotificationResponseOrBuilder> singleFieldBuilderV3 = this.emergencyNotificationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(emergencyNotificationResponse);
                } else if ((this.bitField0_ & 1) == 0 || (emergencyNotificationResponse2 = this.emergencyNotificationResponse_) == null || emergencyNotificationResponse2 == EmergencyNotificationResponse.getDefaultInstance()) {
                    this.emergencyNotificationResponse_ = emergencyNotificationResponse;
                } else {
                    getEmergencyNotificationResponseBuilder().mergeFrom(emergencyNotificationResponse);
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
                                    codedInputStream.readMessage(getEmergencyNotificationResponseFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setEmergencyNotificationResponse(EmergencyNotificationResponse.Builder builder) {
                SingleFieldBuilderV3<EmergencyNotificationResponse, EmergencyNotificationResponse.Builder, EmergencyNotificationResponseOrBuilder> singleFieldBuilderV3 = this.emergencyNotificationResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.emergencyNotificationResponse_ = builder.build();
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
            public EmergencyAssistanceResponse getDefaultInstanceForType() {
                return EmergencyAssistanceResponse.getDefaultInstance();
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

            public Builder setEmergencyNotificationResponse(EmergencyNotificationResponse emergencyNotificationResponse) {
                SingleFieldBuilderV3<EmergencyNotificationResponse, EmergencyNotificationResponse.Builder, EmergencyNotificationResponseOrBuilder> singleFieldBuilderV3 = this.emergencyNotificationResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    emergencyNotificationResponse.getClass();
                    this.emergencyNotificationResponse_ = emergencyNotificationResponse;
                } else {
                    singleFieldBuilderV3.setMessage(emergencyNotificationResponse);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EmergencyAssistanceResponse) {
                    return mergeFrom((EmergencyAssistanceResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EmergencyAssistanceResponse emergencyAssistanceResponse) {
                if (emergencyAssistanceResponse == EmergencyAssistanceResponse.getDefaultInstance()) {
                    return this;
                }
                if (emergencyAssistanceResponse.hasEmergencyNotificationResponse()) {
                    mergeEmergencyNotificationResponse(emergencyAssistanceResponse.getEmergencyNotificationResponse());
                }
                mergeUnknownFields(emergencyAssistanceResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EmergencyAssistanceResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ EmergencyAssistanceResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private EmergencyAssistanceResponse() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EmergencyAssistanceResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EmergencyAssistanceResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EmergencyAssistanceResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static EmergencyAssistanceResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EmergencyAssistanceResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static EmergencyAssistanceResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static EmergencyAssistanceResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static EmergencyAssistanceResponse parseFrom(InputStream inputStream) {
            return (EmergencyAssistanceResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static EmergencyAssistanceResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EmergencyAssistanceResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EmergencyAssistanceResponse parseFrom(CodedInputStream codedInputStream) {
            return (EmergencyAssistanceResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static EmergencyAssistanceResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EmergencyAssistanceResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class EmergencyNotificationRequest extends GeneratedMessageV3 implements EmergencyNotificationRequestOrBuilder {
        public static final int EMERGENCY_CONTACT_FIELD_NUMBER = 5;
        public static final int EMERGENCY_SMS_MSG_FIELD_NUMBER = 4;
        public static final int GCUSERDISPLAYNAME_FIELD_NUMBER = 7;
        public static final int LANGUAGE_FIELD_NUMBER = 6;
        public static final int MESSAGE_TEMPLATE_ID_FIELD_NUMBER = 3;
        public static final int POSITION_FIELD_NUMBER = 1;
        public static final int SENDER_NAME_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private List<DataTypesProto.EmergencyContact> emergencyContact_;
        private volatile Object emergencySMSMsg_;
        private volatile Object gcUserDisplayname_;
        private int language_;
        private byte memoizedIsInitialized;
        private volatile Object messageTemplateId_;
        private DataTypesProto.ScPoint position_;
        private volatile Object senderName_;
        private static final EmergencyNotificationRequest DEFAULT_INSTANCE = new EmergencyNotificationRequest();

        @Deprecated
        public static final Parser<EmergencyNotificationRequest> PARSER = new AbstractParser<EmergencyNotificationRequest>() { // from class: com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequest.1
            @Override // com.google.protobuf.Parser
            public EmergencyNotificationRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = EmergencyNotificationRequest.newBuilder();
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

        private EmergencyNotificationRequest() {
            this.senderName_ = "";
            this.messageTemplateId_ = "";
            this.emergencySMSMsg_ = "";
            this.language_ = 0;
            this.gcUserDisplayname_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.senderName_ = "";
            this.messageTemplateId_ = "";
            this.emergencySMSMsg_ = "";
            this.emergencyContact_ = Collections.EMPTY_LIST;
            this.language_ = 0;
            this.gcUserDisplayname_ = "";
        }

        public static EmergencyNotificationRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EmergencyAssistanceProto.internal_static_CSM_Proto_EmergencyAssistance_EmergencyNotificationRequest_descriptor;
        }

        public static Builder newBuilder(EmergencyNotificationRequest emergencyNotificationRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(emergencyNotificationRequest);
        }

        public static EmergencyNotificationRequest parseDelimitedFrom(InputStream inputStream) {
            return (EmergencyNotificationRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EmergencyNotificationRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<EmergencyNotificationRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EmergencyNotificationRequest)) {
                return super.equals(obj);
            }
            EmergencyNotificationRequest emergencyNotificationRequest = (EmergencyNotificationRequest) obj;
            if (hasPosition() != emergencyNotificationRequest.hasPosition()) {
                return false;
            }
            if ((hasPosition() && !getPosition().equals(emergencyNotificationRequest.getPosition())) || hasSenderName() != emergencyNotificationRequest.hasSenderName()) {
                return false;
            }
            if ((hasSenderName() && !getSenderName().equals(emergencyNotificationRequest.getSenderName())) || hasMessageTemplateId() != emergencyNotificationRequest.hasMessageTemplateId()) {
                return false;
            }
            if ((hasMessageTemplateId() && !getMessageTemplateId().equals(emergencyNotificationRequest.getMessageTemplateId())) || hasEmergencySMSMsg() != emergencyNotificationRequest.hasEmergencySMSMsg()) {
                return false;
            }
            if ((hasEmergencySMSMsg() && !getEmergencySMSMsg().equals(emergencyNotificationRequest.getEmergencySMSMsg())) || !getEmergencyContactList().equals(emergencyNotificationRequest.getEmergencyContactList()) || hasLanguage() != emergencyNotificationRequest.hasLanguage()) {
                return false;
            }
            if ((!hasLanguage() || this.language_ == emergencyNotificationRequest.language_) && hasGcUserDisplayname() == emergencyNotificationRequest.hasGcUserDisplayname()) {
                return (!hasGcUserDisplayname() || getGcUserDisplayname().equals(emergencyNotificationRequest.getGcUserDisplayname())) && getUnknownFields().equals(emergencyNotificationRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
        public DataTypesProto.EmergencyContact getEmergencyContact(int i14) {
            return this.emergencyContact_.get(i14);
        }

        @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
        public int getEmergencyContactCount() {
            return this.emergencyContact_.size();
        }

        @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
        public List<DataTypesProto.EmergencyContact> getEmergencyContactList() {
            return this.emergencyContact_;
        }

        @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
        public DataTypesProto.EmergencyContactOrBuilder getEmergencyContactOrBuilder(int i14) {
            return this.emergencyContact_.get(i14);
        }

        @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
        public List<? extends DataTypesProto.EmergencyContactOrBuilder> getEmergencyContactOrBuilderList() {
            return this.emergencyContact_;
        }

        @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
        public String getEmergencySMSMsg() {
            Object obj = this.emergencySMSMsg_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.emergencySMSMsg_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
        public ByteString getEmergencySMSMsgBytes() {
            Object obj = this.emergencySMSMsg_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.emergencySMSMsg_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
        public String getGcUserDisplayname() {
            Object obj = this.gcUserDisplayname_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.gcUserDisplayname_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
        public ByteString getGcUserDisplaynameBytes() {
            Object obj = this.gcUserDisplayname_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.gcUserDisplayname_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
        public DataTypesProto.Languages getLanguage() {
            DataTypesProto.Languages languagesForNumber = DataTypesProto.Languages.forNumber(this.language_);
            return languagesForNumber == null ? DataTypesProto.Languages.UNKNOWN : languagesForNumber;
        }

        @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
        public String getMessageTemplateId() {
            Object obj = this.messageTemplateId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.messageTemplateId_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
        public ByteString getMessageTemplateIdBytes() {
            Object obj = this.messageTemplateId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.messageTemplateId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EmergencyNotificationRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
        public DataTypesProto.ScPoint getPosition() {
            DataTypesProto.ScPoint scPoint = this.position_;
            return scPoint == null ? DataTypesProto.ScPoint.getDefaultInstance() : scPoint;
        }

        @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
        public DataTypesProto.ScPointOrBuilder getPositionOrBuilder() {
            DataTypesProto.ScPoint scPoint = this.position_;
            return scPoint == null ? DataTypesProto.ScPoint.getDefaultInstance() : scPoint;
        }

        @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
        public String getSenderName() {
            Object obj = this.senderName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.senderName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
        public ByteString getSenderNameBytes() {
            Object obj = this.senderName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.senderName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getPosition()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += GeneratedMessageV3.computeStringSize(2, this.senderName_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += GeneratedMessageV3.computeStringSize(3, this.messageTemplateId_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += GeneratedMessageV3.computeStringSize(4, this.emergencySMSMsg_);
            }
            for (int i15 = 0; i15 < this.emergencyContact_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, this.emergencyContact_.get(i15));
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(6, this.language_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += GeneratedMessageV3.computeStringSize(7, this.gcUserDisplayname_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
        public boolean hasEmergencySMSMsg() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
        public boolean hasGcUserDisplayname() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
        public boolean hasLanguage() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
        public boolean hasMessageTemplateId() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
        public boolean hasPosition() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
        public boolean hasSenderName() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasPosition()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getPosition().hashCode();
            }
            if (hasSenderName()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSenderName().hashCode();
            }
            if (hasMessageTemplateId()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getMessageTemplateId().hashCode();
            }
            if (hasEmergencySMSMsg()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getEmergencySMSMsg().hashCode();
            }
            if (getEmergencyContactCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getEmergencyContactList().hashCode();
            }
            if (hasLanguage()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + this.language_;
            }
            if (hasGcUserDisplayname()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getGcUserDisplayname().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return EmergencyAssistanceProto.internal_static_CSM_Proto_EmergencyAssistance_EmergencyNotificationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(EmergencyNotificationRequest.class, Builder.class);
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
            if (!hasPosition() || getPosition().isInitialized()) {
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
            return new EmergencyNotificationRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getPosition());
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.senderName_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.messageTemplateId_);
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.emergencySMSMsg_);
            }
            for (int i14 = 0; i14 < this.emergencyContact_.size(); i14++) {
                codedOutputStream.writeMessage(5, this.emergencyContact_.get(i14));
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeEnum(6, this.language_);
            }
            if ((this.bitField0_ & 32) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 7, this.gcUserDisplayname_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EmergencyNotificationRequestOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<DataTypesProto.EmergencyContact, DataTypesProto.EmergencyContact.Builder, DataTypesProto.EmergencyContactOrBuilder> emergencyContactBuilder_;
            private List<DataTypesProto.EmergencyContact> emergencyContact_;
            private Object emergencySMSMsg_;
            private Object gcUserDisplayname_;
            private int language_;
            private Object messageTemplateId_;
            private SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> positionBuilder_;
            private DataTypesProto.ScPoint position_;
            private Object senderName_;

            private Builder() {
                this.senderName_ = "";
                this.messageTemplateId_ = "";
                this.emergencySMSMsg_ = "";
                this.emergencyContact_ = Collections.EMPTY_LIST;
                this.language_ = 0;
                this.gcUserDisplayname_ = "";
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(EmergencyNotificationRequest emergencyNotificationRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                    emergencyNotificationRequest.position_ = singleFieldBuilderV3 == null ? this.position_ : (DataTypesProto.ScPoint) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    emergencyNotificationRequest.senderName_ = this.senderName_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    emergencyNotificationRequest.messageTemplateId_ = this.messageTemplateId_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    emergencyNotificationRequest.emergencySMSMsg_ = this.emergencySMSMsg_;
                    i14 |= 8;
                }
                if ((i15 & 32) != 0) {
                    emergencyNotificationRequest.language_ = this.language_;
                    i14 |= 16;
                }
                if ((i15 & 64) != 0) {
                    emergencyNotificationRequest.gcUserDisplayname_ = this.gcUserDisplayname_;
                    i14 |= 32;
                }
                emergencyNotificationRequest.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(EmergencyNotificationRequest emergencyNotificationRequest) {
                RepeatedFieldBuilderV3<DataTypesProto.EmergencyContact, DataTypesProto.EmergencyContact.Builder, DataTypesProto.EmergencyContactOrBuilder> repeatedFieldBuilderV3 = this.emergencyContactBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    emergencyNotificationRequest.emergencyContact_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 16) != 0) {
                    this.emergencyContact_ = Collections.unmodifiableList(this.emergencyContact_);
                    this.bitField0_ &= -17;
                }
                emergencyNotificationRequest.emergencyContact_ = this.emergencyContact_;
            }

            private void ensureEmergencyContactIsMutable() {
                if ((this.bitField0_ & 16) == 0) {
                    this.emergencyContact_ = new ArrayList(this.emergencyContact_);
                    this.bitField0_ |= 16;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EmergencyAssistanceProto.internal_static_CSM_Proto_EmergencyAssistance_EmergencyNotificationRequest_descriptor;
            }

            private RepeatedFieldBuilderV3<DataTypesProto.EmergencyContact, DataTypesProto.EmergencyContact.Builder, DataTypesProto.EmergencyContactOrBuilder> getEmergencyContactFieldBuilder() {
                if (this.emergencyContactBuilder_ == null) {
                    this.emergencyContactBuilder_ = new RepeatedFieldBuilderV3<>(this.emergencyContact_, (this.bitField0_ & 16) != 0, getParentForChildren(), isClean());
                    this.emergencyContact_ = null;
                }
                return this.emergencyContactBuilder_;
            }

            private SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> getPositionFieldBuilder() {
                if (this.positionBuilder_ == null) {
                    this.positionBuilder_ = new SingleFieldBuilderV3<>(getPosition(), getParentForChildren(), isClean());
                    this.position_ = null;
                }
                return this.positionBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getPositionFieldBuilder();
                    getEmergencyContactFieldBuilder();
                }
            }

            public Builder addAllEmergencyContact(Iterable<? extends DataTypesProto.EmergencyContact> iterable) {
                RepeatedFieldBuilderV3<DataTypesProto.EmergencyContact, DataTypesProto.EmergencyContact.Builder, DataTypesProto.EmergencyContactOrBuilder> repeatedFieldBuilderV3 = this.emergencyContactBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureEmergencyContactIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.emergencyContact_);
                onChanged();
                return this;
            }

            public Builder addEmergencyContact(DataTypesProto.EmergencyContact.Builder builder) {
                RepeatedFieldBuilderV3<DataTypesProto.EmergencyContact, DataTypesProto.EmergencyContact.Builder, DataTypesProto.EmergencyContactOrBuilder> repeatedFieldBuilderV3 = this.emergencyContactBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureEmergencyContactIsMutable();
                this.emergencyContact_.add(builder.build());
                onChanged();
                return this;
            }

            public DataTypesProto.EmergencyContact.Builder addEmergencyContactBuilder() {
                return (DataTypesProto.EmergencyContact.Builder) getEmergencyContactFieldBuilder().addBuilder(DataTypesProto.EmergencyContact.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EmergencyNotificationRequest build() {
                EmergencyNotificationRequest emergencyNotificationRequestBuildPartial = buildPartial();
                if (emergencyNotificationRequestBuildPartial.isInitialized()) {
                    return emergencyNotificationRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) emergencyNotificationRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EmergencyNotificationRequest buildPartial() {
                EmergencyNotificationRequest emergencyNotificationRequest = new EmergencyNotificationRequest(this);
                buildPartialRepeatedFields(emergencyNotificationRequest);
                if (this.bitField0_ != 0) {
                    buildPartial0(emergencyNotificationRequest);
                }
                onBuilt();
                return emergencyNotificationRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.position_ = null;
                SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.positionBuilder_ = null;
                }
                this.senderName_ = "";
                this.messageTemplateId_ = "";
                this.emergencySMSMsg_ = "";
                RepeatedFieldBuilderV3<DataTypesProto.EmergencyContact, DataTypesProto.EmergencyContact.Builder, DataTypesProto.EmergencyContactOrBuilder> repeatedFieldBuilderV3 = this.emergencyContactBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.emergencyContact_ = Collections.EMPTY_LIST;
                } else {
                    this.emergencyContact_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -17;
                this.language_ = 0;
                this.gcUserDisplayname_ = "";
                return this;
            }

            public Builder clearEmergencyContact() {
                RepeatedFieldBuilderV3<DataTypesProto.EmergencyContact, DataTypesProto.EmergencyContact.Builder, DataTypesProto.EmergencyContactOrBuilder> repeatedFieldBuilderV3 = this.emergencyContactBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.emergencyContact_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder clearEmergencySMSMsg() {
                this.emergencySMSMsg_ = EmergencyNotificationRequest.getDefaultInstance().getEmergencySMSMsg();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGcUserDisplayname() {
                this.gcUserDisplayname_ = EmergencyNotificationRequest.getDefaultInstance().getGcUserDisplayname();
                this.bitField0_ &= -65;
                onChanged();
                return this;
            }

            public Builder clearLanguage() {
                this.bitField0_ &= -33;
                this.language_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMessageTemplateId() {
                this.messageTemplateId_ = EmergencyNotificationRequest.getDefaultInstance().getMessageTemplateId();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPosition() {
                this.bitField0_ &= -2;
                this.position_ = null;
                SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.positionBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSenderName() {
                this.senderName_ = EmergencyNotificationRequest.getDefaultInstance().getSenderName();
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
                return EmergencyAssistanceProto.internal_static_CSM_Proto_EmergencyAssistance_EmergencyNotificationRequest_descriptor;
            }

            @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
            public DataTypesProto.EmergencyContact getEmergencyContact(int i14) {
                RepeatedFieldBuilderV3<DataTypesProto.EmergencyContact, DataTypesProto.EmergencyContact.Builder, DataTypesProto.EmergencyContactOrBuilder> repeatedFieldBuilderV3 = this.emergencyContactBuilder_;
                return repeatedFieldBuilderV3 == null ? this.emergencyContact_.get(i14) : (DataTypesProto.EmergencyContact) repeatedFieldBuilderV3.getMessage(i14);
            }

            public DataTypesProto.EmergencyContact.Builder getEmergencyContactBuilder(int i14) {
                return (DataTypesProto.EmergencyContact.Builder) getEmergencyContactFieldBuilder().getBuilder(i14);
            }

            public List<DataTypesProto.EmergencyContact.Builder> getEmergencyContactBuilderList() {
                return getEmergencyContactFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
            public int getEmergencyContactCount() {
                RepeatedFieldBuilderV3<DataTypesProto.EmergencyContact, DataTypesProto.EmergencyContact.Builder, DataTypesProto.EmergencyContactOrBuilder> repeatedFieldBuilderV3 = this.emergencyContactBuilder_;
                return repeatedFieldBuilderV3 == null ? this.emergencyContact_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
            public List<DataTypesProto.EmergencyContact> getEmergencyContactList() {
                RepeatedFieldBuilderV3<DataTypesProto.EmergencyContact, DataTypesProto.EmergencyContact.Builder, DataTypesProto.EmergencyContactOrBuilder> repeatedFieldBuilderV3 = this.emergencyContactBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.emergencyContact_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
            public DataTypesProto.EmergencyContactOrBuilder getEmergencyContactOrBuilder(int i14) {
                RepeatedFieldBuilderV3<DataTypesProto.EmergencyContact, DataTypesProto.EmergencyContact.Builder, DataTypesProto.EmergencyContactOrBuilder> repeatedFieldBuilderV3 = this.emergencyContactBuilder_;
                return repeatedFieldBuilderV3 == null ? this.emergencyContact_.get(i14) : (DataTypesProto.EmergencyContactOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
            public List<? extends DataTypesProto.EmergencyContactOrBuilder> getEmergencyContactOrBuilderList() {
                RepeatedFieldBuilderV3<DataTypesProto.EmergencyContact, DataTypesProto.EmergencyContact.Builder, DataTypesProto.EmergencyContactOrBuilder> repeatedFieldBuilderV3 = this.emergencyContactBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.emergencyContact_);
            }

            @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
            public String getEmergencySMSMsg() {
                Object obj = this.emergencySMSMsg_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.emergencySMSMsg_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
            public ByteString getEmergencySMSMsgBytes() {
                Object obj = this.emergencySMSMsg_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.emergencySMSMsg_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
            public String getGcUserDisplayname() {
                Object obj = this.gcUserDisplayname_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.gcUserDisplayname_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
            public ByteString getGcUserDisplaynameBytes() {
                Object obj = this.gcUserDisplayname_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.gcUserDisplayname_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
            public DataTypesProto.Languages getLanguage() {
                DataTypesProto.Languages languagesForNumber = DataTypesProto.Languages.forNumber(this.language_);
                return languagesForNumber == null ? DataTypesProto.Languages.UNKNOWN : languagesForNumber;
            }

            @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
            public String getMessageTemplateId() {
                Object obj = this.messageTemplateId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.messageTemplateId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
            public ByteString getMessageTemplateIdBytes() {
                Object obj = this.messageTemplateId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.messageTemplateId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
            public DataTypesProto.ScPoint getPosition() {
                SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypesProto.ScPoint) singleFieldBuilderV3.getMessage();
                }
                DataTypesProto.ScPoint scPoint = this.position_;
                return scPoint == null ? DataTypesProto.ScPoint.getDefaultInstance() : scPoint;
            }

            public DataTypesProto.ScPoint.Builder getPositionBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (DataTypesProto.ScPoint.Builder) getPositionFieldBuilder().getBuilder();
            }

            @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
            public DataTypesProto.ScPointOrBuilder getPositionOrBuilder() {
                SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypesProto.ScPointOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DataTypesProto.ScPoint scPoint = this.position_;
                return scPoint == null ? DataTypesProto.ScPoint.getDefaultInstance() : scPoint;
            }

            @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
            public String getSenderName() {
                Object obj = this.senderName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.senderName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
            public ByteString getSenderNameBytes() {
                Object obj = this.senderName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.senderName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
            public boolean hasEmergencySMSMsg() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
            public boolean hasGcUserDisplayname() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
            public boolean hasLanguage() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
            public boolean hasMessageTemplateId() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
            public boolean hasPosition() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationRequestOrBuilder
            public boolean hasSenderName() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EmergencyAssistanceProto.internal_static_CSM_Proto_EmergencyAssistance_EmergencyNotificationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(EmergencyNotificationRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasPosition() || getPosition().isInitialized();
            }

            public Builder mergeFrom(EmergencyNotificationRequest emergencyNotificationRequest) {
                if (emergencyNotificationRequest == EmergencyNotificationRequest.getDefaultInstance()) {
                    return this;
                }
                if (emergencyNotificationRequest.hasPosition()) {
                    mergePosition(emergencyNotificationRequest.getPosition());
                }
                if (emergencyNotificationRequest.hasSenderName()) {
                    this.senderName_ = emergencyNotificationRequest.senderName_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (emergencyNotificationRequest.hasMessageTemplateId()) {
                    this.messageTemplateId_ = emergencyNotificationRequest.messageTemplateId_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (emergencyNotificationRequest.hasEmergencySMSMsg()) {
                    this.emergencySMSMsg_ = emergencyNotificationRequest.emergencySMSMsg_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (this.emergencyContactBuilder_ == null) {
                    if (!emergencyNotificationRequest.emergencyContact_.isEmpty()) {
                        if (this.emergencyContact_.isEmpty()) {
                            this.emergencyContact_ = emergencyNotificationRequest.emergencyContact_;
                            this.bitField0_ &= -17;
                        } else {
                            ensureEmergencyContactIsMutable();
                            this.emergencyContact_.addAll(emergencyNotificationRequest.emergencyContact_);
                        }
                        onChanged();
                    }
                } else if (!emergencyNotificationRequest.emergencyContact_.isEmpty()) {
                    boolean zIsEmpty = this.emergencyContactBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<DataTypesProto.EmergencyContact, DataTypesProto.EmergencyContact.Builder, DataTypesProto.EmergencyContactOrBuilder> repeatedFieldBuilderV3 = this.emergencyContactBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.emergencyContactBuilder_ = null;
                        this.emergencyContact_ = emergencyNotificationRequest.emergencyContact_;
                        this.bitField0_ &= -17;
                        this.emergencyContactBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getEmergencyContactFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(emergencyNotificationRequest.emergencyContact_);
                    }
                }
                if (emergencyNotificationRequest.hasLanguage()) {
                    setLanguage(emergencyNotificationRequest.getLanguage());
                }
                if (emergencyNotificationRequest.hasGcUserDisplayname()) {
                    this.gcUserDisplayname_ = emergencyNotificationRequest.gcUserDisplayname_;
                    this.bitField0_ |= 64;
                    onChanged();
                }
                mergeUnknownFields(emergencyNotificationRequest.getUnknownFields());
                onChanged();
                return this;
            }

            public Builder mergePosition(DataTypesProto.ScPoint scPoint) {
                DataTypesProto.ScPoint scPoint2;
                SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(scPoint);
                } else if ((this.bitField0_ & 1) == 0 || (scPoint2 = this.position_) == null || scPoint2 == DataTypesProto.ScPoint.getDefaultInstance()) {
                    this.position_ = scPoint;
                } else {
                    getPositionBuilder().mergeFrom(scPoint);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeEmergencyContact(int i14) {
                RepeatedFieldBuilderV3<DataTypesProto.EmergencyContact, DataTypesProto.EmergencyContact.Builder, DataTypesProto.EmergencyContactOrBuilder> repeatedFieldBuilderV3 = this.emergencyContactBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureEmergencyContactIsMutable();
                this.emergencyContact_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setEmergencyContact(int i14, DataTypesProto.EmergencyContact.Builder builder) {
                RepeatedFieldBuilderV3<DataTypesProto.EmergencyContact, DataTypesProto.EmergencyContact.Builder, DataTypesProto.EmergencyContactOrBuilder> repeatedFieldBuilderV3 = this.emergencyContactBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureEmergencyContactIsMutable();
                this.emergencyContact_.set(i14, builder.build());
                onChanged();
                return this;
            }

            public Builder setEmergencySMSMsg(String str) {
                str.getClass();
                this.emergencySMSMsg_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setEmergencySMSMsgBytes(ByteString byteString) {
                byteString.getClass();
                this.emergencySMSMsg_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setGcUserDisplayname(String str) {
                str.getClass();
                this.gcUserDisplayname_ = str;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setGcUserDisplaynameBytes(ByteString byteString) {
                byteString.getClass();
                this.gcUserDisplayname_ = byteString;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setLanguage(DataTypesProto.Languages languages) {
                languages.getClass();
                this.bitField0_ |= 32;
                this.language_ = languages.getNumber();
                onChanged();
                return this;
            }

            public Builder setMessageTemplateId(String str) {
                str.getClass();
                this.messageTemplateId_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setMessageTemplateIdBytes(ByteString byteString) {
                byteString.getClass();
                this.messageTemplateId_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPosition(DataTypesProto.ScPoint.Builder builder) {
                SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.position_ = builder.build();
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

            public Builder setSenderName(String str) {
                str.getClass();
                this.senderName_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSenderNameBytes(ByteString byteString) {
                byteString.getClass();
                this.senderName_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public EmergencyNotificationRequest getDefaultInstanceForType() {
                return EmergencyNotificationRequest.getDefaultInstance();
            }

            public DataTypesProto.EmergencyContact.Builder addEmergencyContactBuilder(int i14) {
                return (DataTypesProto.EmergencyContact.Builder) getEmergencyContactFieldBuilder().addBuilder(i14, DataTypesProto.EmergencyContact.getDefaultInstance());
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.senderName_ = "";
                this.messageTemplateId_ = "";
                this.emergencySMSMsg_ = "";
                this.emergencyContact_ = Collections.EMPTY_LIST;
                this.language_ = 0;
                this.gcUserDisplayname_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder addEmergencyContact(int i14, DataTypesProto.EmergencyContact emergencyContact) {
                RepeatedFieldBuilderV3<DataTypesProto.EmergencyContact, DataTypesProto.EmergencyContact.Builder, DataTypesProto.EmergencyContactOrBuilder> repeatedFieldBuilderV3 = this.emergencyContactBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    emergencyContact.getClass();
                    ensureEmergencyContactIsMutable();
                    this.emergencyContact_.add(i14, emergencyContact);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, emergencyContact);
                return this;
            }

            public Builder setEmergencyContact(int i14, DataTypesProto.EmergencyContact emergencyContact) {
                RepeatedFieldBuilderV3<DataTypesProto.EmergencyContact, DataTypesProto.EmergencyContact.Builder, DataTypesProto.EmergencyContactOrBuilder> repeatedFieldBuilderV3 = this.emergencyContactBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    emergencyContact.getClass();
                    ensureEmergencyContactIsMutable();
                    this.emergencyContact_.set(i14, emergencyContact);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, emergencyContact);
                return this;
            }

            public Builder setPosition(DataTypesProto.ScPoint scPoint) {
                SingleFieldBuilderV3<DataTypesProto.ScPoint, DataTypesProto.ScPoint.Builder, DataTypesProto.ScPointOrBuilder> singleFieldBuilderV3 = this.positionBuilder_;
                if (singleFieldBuilderV3 == null) {
                    scPoint.getClass();
                    this.position_ = scPoint;
                } else {
                    singleFieldBuilderV3.setMessage(scPoint);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder addEmergencyContact(DataTypesProto.EmergencyContact emergencyContact) {
                RepeatedFieldBuilderV3<DataTypesProto.EmergencyContact, DataTypesProto.EmergencyContact.Builder, DataTypesProto.EmergencyContactOrBuilder> repeatedFieldBuilderV3 = this.emergencyContactBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    emergencyContact.getClass();
                    ensureEmergencyContactIsMutable();
                    this.emergencyContact_.add(emergencyContact);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(emergencyContact);
                return this;
            }

            public Builder addEmergencyContact(int i14, DataTypesProto.EmergencyContact.Builder builder) {
                RepeatedFieldBuilderV3<DataTypesProto.EmergencyContact, DataTypesProto.EmergencyContact.Builder, DataTypesProto.EmergencyContactOrBuilder> repeatedFieldBuilderV3 = this.emergencyContactBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureEmergencyContactIsMutable();
                    this.emergencyContact_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EmergencyNotificationRequest) {
                    return mergeFrom((EmergencyNotificationRequest) message);
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
                                    codedInputStream.readMessage(getPositionFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.senderName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.messageTemplateId_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.emergencySMSMsg_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    DataTypesProto.EmergencyContact emergencyContact = (DataTypesProto.EmergencyContact) codedInputStream.readMessage(DataTypesProto.EmergencyContact.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<DataTypesProto.EmergencyContact, DataTypesProto.EmergencyContact.Builder, DataTypesProto.EmergencyContactOrBuilder> repeatedFieldBuilderV3 = this.emergencyContactBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureEmergencyContactIsMutable();
                                        this.emergencyContact_.add(emergencyContact);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(emergencyContact);
                                    }
                                } else if (tag == 48) {
                                    int i14 = codedInputStream.readEnum();
                                    if (DataTypesProto.Languages.forNumber(i14) == null) {
                                        mergeUnknownVarintField(6, i14);
                                    } else {
                                        this.language_ = i14;
                                        this.bitField0_ |= 32;
                                    }
                                } else if (tag != 58) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.gcUserDisplayname_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 64;
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
        public EmergencyNotificationRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static EmergencyNotificationRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EmergencyNotificationRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EmergencyNotificationRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static EmergencyNotificationRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EmergencyNotificationRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static EmergencyNotificationRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static EmergencyNotificationRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static EmergencyNotificationRequest parseFrom(InputStream inputStream) {
            return (EmergencyNotificationRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static EmergencyNotificationRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EmergencyNotificationRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EmergencyNotificationRequest parseFrom(CodedInputStream codedInputStream) {
            return (EmergencyNotificationRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static EmergencyNotificationRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EmergencyNotificationRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private EmergencyNotificationRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.senderName_ = "";
            this.messageTemplateId_ = "";
            this.emergencySMSMsg_ = "";
            this.language_ = 0;
            this.gcUserDisplayname_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ EmergencyNotificationRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class EmergencyNotificationResponse extends GeneratedMessageV3 implements EmergencyNotificationResponseOrBuilder {
        private static final EmergencyNotificationResponse DEFAULT_INSTANCE = new EmergencyNotificationResponse();

        @Deprecated
        public static final Parser<EmergencyNotificationResponse> PARSER = new AbstractParser<EmergencyNotificationResponse>() { // from class: com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationResponse.1
            @Override // com.google.protobuf.Parser
            public EmergencyNotificationResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = EmergencyNotificationResponse.newBuilder();
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

        private EmergencyNotificationResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EmergencyNotificationResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return EmergencyAssistanceProto.internal_static_CSM_Proto_EmergencyAssistance_EmergencyNotificationResponse_descriptor;
        }

        public static Builder newBuilder(EmergencyNotificationResponse emergencyNotificationResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(emergencyNotificationResponse);
        }

        public static EmergencyNotificationResponse parseDelimitedFrom(InputStream inputStream) {
            return (EmergencyNotificationResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EmergencyNotificationResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<EmergencyNotificationResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EmergencyNotificationResponse)) {
                return super.equals(obj);
            }
            EmergencyNotificationResponse emergencyNotificationResponse = (EmergencyNotificationResponse) obj;
            if (hasStatus() != emergencyNotificationResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == emergencyNotificationResponse.status_) && getUnknownFields().equals(emergencyNotificationResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EmergencyNotificationResponse> getParserForType() {
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

        @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationResponseOrBuilder
        public EmergencyAssistanceResponseStatus getStatus() {
            EmergencyAssistanceResponseStatus emergencyAssistanceResponseStatusForNumber = EmergencyAssistanceResponseStatus.forNumber(this.status_);
            return emergencyAssistanceResponseStatusForNumber == null ? EmergencyAssistanceResponseStatus.OK : emergencyAssistanceResponseStatusForNumber;
        }

        @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationResponseOrBuilder
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
            return EmergencyAssistanceProto.internal_static_CSM_Proto_EmergencyAssistance_EmergencyNotificationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(EmergencyNotificationResponse.class, Builder.class);
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
            return new EmergencyNotificationResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EmergencyNotificationResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(EmergencyNotificationResponse emergencyNotificationResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    emergencyNotificationResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                emergencyNotificationResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return EmergencyAssistanceProto.internal_static_CSM_Proto_EmergencyAssistance_EmergencyNotificationResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EmergencyNotificationResponse build() {
                EmergencyNotificationResponse emergencyNotificationResponseBuildPartial = buildPartial();
                if (emergencyNotificationResponseBuildPartial.isInitialized()) {
                    return emergencyNotificationResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) emergencyNotificationResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EmergencyNotificationResponse buildPartial() {
                EmergencyNotificationResponse emergencyNotificationResponse = new EmergencyNotificationResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(emergencyNotificationResponse);
                }
                onBuilt();
                return emergencyNotificationResponse;
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
                return EmergencyAssistanceProto.internal_static_CSM_Proto_EmergencyAssistance_EmergencyNotificationResponse_descriptor;
            }

            @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationResponseOrBuilder
            public EmergencyAssistanceResponseStatus getStatus() {
                EmergencyAssistanceResponseStatus emergencyAssistanceResponseStatusForNumber = EmergencyAssistanceResponseStatus.forNumber(this.status_);
                return emergencyAssistanceResponseStatusForNumber == null ? EmergencyAssistanceResponseStatus.OK : emergencyAssistanceResponseStatusForNumber;
            }

            @Override // com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyNotificationResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return EmergencyAssistanceProto.internal_static_CSM_Proto_EmergencyAssistance_EmergencyNotificationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(EmergencyNotificationResponse.class, Builder.class);
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
                                    if (EmergencyAssistanceResponseStatus.forNumber(i14) == null) {
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

            public Builder setStatus(EmergencyAssistanceResponseStatus emergencyAssistanceResponseStatus) {
                emergencyAssistanceResponseStatus.getClass();
                this.bitField0_ |= 1;
                this.status_ = emergencyAssistanceResponseStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public EmergencyNotificationResponse getDefaultInstanceForType() {
                return EmergencyNotificationResponse.getDefaultInstance();
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
                if (message instanceof EmergencyNotificationResponse) {
                    return mergeFrom((EmergencyNotificationResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EmergencyNotificationResponse emergencyNotificationResponse) {
                if (emergencyNotificationResponse == EmergencyNotificationResponse.getDefaultInstance()) {
                    return this;
                }
                if (emergencyNotificationResponse.hasStatus()) {
                    setStatus(emergencyNotificationResponse.getStatus());
                }
                mergeUnknownFields(emergencyNotificationResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EmergencyNotificationResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static EmergencyNotificationResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EmergencyNotificationResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EmergencyNotificationResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ EmergencyNotificationResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static EmergencyNotificationResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private EmergencyNotificationResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EmergencyNotificationResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static EmergencyNotificationResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static EmergencyNotificationResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static EmergencyNotificationResponse parseFrom(InputStream inputStream) {
            return (EmergencyNotificationResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static EmergencyNotificationResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EmergencyNotificationResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EmergencyNotificationResponse parseFrom(CodedInputStream codedInputStream) {
            return (EmergencyNotificationResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static EmergencyNotificationResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EmergencyNotificationResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public enum EmergencyAssistanceResponseStatus implements ProtocolMessageEnum {
        OK(0),
        ERROR_ALERT_FAILED(1);

        public static final int ERROR_ALERT_FAILED_VALUE = 1;
        public static final int OK_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<EmergencyAssistanceResponseStatus> internalValueMap = new Internal.EnumLiteMap<EmergencyAssistanceResponseStatus>() { // from class: com.garmin.gcsprotos.generated.EmergencyAssistanceProto.EmergencyAssistanceResponseStatus.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public EmergencyAssistanceResponseStatus findValueByNumber(int i14) {
                return EmergencyAssistanceResponseStatus.forNumber(i14);
            }
        };
        private static final EmergencyAssistanceResponseStatus[] VALUES = values();

        EmergencyAssistanceResponseStatus(int i14) {
            this.value = i14;
        }

        public static EmergencyAssistanceResponseStatus forNumber(int i14) {
            if (i14 == 0) {
                return OK;
            }
            if (i14 != 1) {
                return null;
            }
            return ERROR_ALERT_FAILED;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return EmergencyAssistanceProto.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<EmergencyAssistanceResponseStatus> internalGetValueMap() {
            return internalValueMap;
        }

        public static EmergencyAssistanceResponseStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static EmergencyAssistanceResponseStatus valueOf(int i14) {
            return forNumber(i14);
        }
    }
}
