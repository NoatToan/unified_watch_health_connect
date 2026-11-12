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
public final class GDIAntiTheftAlarmProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0017GDIAntiTheftAlarm.proto\u0012\u0018GDI.Proto.AntiTheftAlarm\"¹\u0006\n\u0015AntiTheftAlarmService\u0012N\n\u0016setting_change_request\u0018\u0001 \u0001(\u000b2..GDI.Proto.AntiTheftAlarm.SettingChangeRequest\u0012P\n\u0017setting_change_response\u0018\u000b \u0001(\u000b2/.GDI.Proto.AntiTheftAlarm.SettingChangeResponse\u0012A\n\u000ftrigger_request\u0018\u0002 \u0001(\u000b2(.GDI.Proto.AntiTheftAlarm.TriggerRequest\u0012C\n\u0010trigger_response\u0018\u0003 \u0001(\u000b2).GDI.Proto.AntiTheftAlarm.TriggerResponse\u0012A\n\u000fdisable_request\u0018\u0004 \u0001(\u000b2(.GDI.Proto.AntiTheftAlarm.DisableRequest\u0012C\n\u0010disable_response\u0018\u0005 \u0001(\u000b2).GDI.Proto.AntiTheftAlarm.DisableResponse\u0012X\n\u001bmovement_alert_notification\u0018\u0006 \u0001(\u000b23.GDI.Proto.AntiTheftAlarm.MovementAlertNotification\u0012D\n\u0011reset_pin_request\u0018\u0007 \u0001(\u000b2).GDI.Proto.AntiTheftAlarm.ResetPINRequest\u0012F\n\u0012reset_pin_response\u0018\b \u0001(\u000b2*.GDI.Proto.AntiTheftAlarm.ResetPINResponse\u0012A\n\u000fsetting_request\u0018\t \u0001(\u000b2(.GDI.Proto.AntiTheftAlarm.SettingRequest\u0012C\n\u0010setting_response\u0018\n \u0001(\u000b2).GDI.Proto.AntiTheftAlarm.SettingResponse\"*\n\u0014SettingChangeRequest\u0012\u0012\n\nis_enabled\u0018\u0001 \u0001(\b\"£\u0001\n\u0015SettingChangeResponse\u0012J\n\bresponse\u0018\u0001 \u0002(\u000e28.GDI.Proto.AntiTheftAlarm.SettingChangeResponse.Response\">\n\bResponse\u0012\t\n\u0005ERROR\u0010\u0000\u0012\u000b\n\u0007SUCCESS\u0010\u0001\u0012\u001a\n\u0016ERROR_MODE_ALREADY_SET\u0010\u0002\"\u0010\n\u000eTriggerRequest\"\u009a\u0001\n\u000fTriggerResponse\u0012D\n\bresponse\u0018\u0001 \u0002(\u000e22.GDI.Proto.AntiTheftAlarm.TriggerResponse.Response\"A\n\bResponse\u0012\t\n\u0005ERROR\u0010\u0000\u0012\u000b\n\u0007SUCCESS\u0010\u0001\u0012\u001d\n\u0019ERROR_ALREADY_IN_PROGRESS\u0010\u0002\"\u0010\n\u000eDisableRequest\"\u0098\u0001\n\u000fDisableResponse\u0012D\n\bresponse\u0018\u0001 \u0002(\u000e22.GDI.Proto.AntiTheftAlarm.DisableResponse.Response\"?\n\bResponse\u0012\t\n\u0005ERROR\u0010\u0000\u0012\u000b\n\u0007SUCCESS\u0010\u0001\u0012\u001b\n\u0017ERROR_ALREADY_CANCELLED\u0010\u0002\"\u001b\n\u0019MovementAlertNotification\"\u001e\n\u000fResetPINRequest\u0012\u000b\n\u0003pin\u0018\u0001 \u0001(\r\"}\n\u0010ResetPINResponse\u0012E\n\bresponse\u0018\u0001 \u0002(\u000e23.GDI.Proto.AntiTheftAlarm.ResetPINResponse.Response\"\"\n\bResponse\u0012\t\n\u0005ERROR\u0010\u0000\u0012\u000b\n\u0007SUCCESS\u0010\u0001\"\u0010\n\u000eSettingRequest\"H\n\u000fSettingResponse\u0012\u000b\n\u0003pin\u0018\u0001 \u0001(\r\u0012\u0012\n\nis_enabled\u0018\u0002 \u0001(\b\u0012\u0014\n\fis_triggered\u0018\u0003 \u0001(\bB6\n\u001acom.garmin.proto.generatedB\u0016GDIAntiTheftAlarmProtoH\u0003"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor internal_static_GDI_Proto_AntiTheftAlarm_AntiTheftAlarmService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_AntiTheftAlarm_AntiTheftAlarmService_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_AntiTheftAlarm_DisableRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_AntiTheftAlarm_DisableRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_AntiTheftAlarm_DisableResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_AntiTheftAlarm_DisableResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_AntiTheftAlarm_MovementAlertNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_AntiTheftAlarm_MovementAlertNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_AntiTheftAlarm_ResetPINRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_AntiTheftAlarm_ResetPINRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_AntiTheftAlarm_ResetPINResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_AntiTheftAlarm_ResetPINResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_AntiTheftAlarm_SettingChangeRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_AntiTheftAlarm_SettingChangeRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_AntiTheftAlarm_SettingChangeResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_AntiTheftAlarm_SettingChangeResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_AntiTheftAlarm_SettingRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_AntiTheftAlarm_SettingRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_AntiTheftAlarm_SettingResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_AntiTheftAlarm_SettingResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_AntiTheftAlarm_TriggerRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_AntiTheftAlarm_TriggerRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_AntiTheftAlarm_TriggerResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_AntiTheftAlarm_TriggerResponse_fieldAccessorTable;

    /* JADX INFO: loaded from: classes14.dex */
    public interface AntiTheftAlarmServiceOrBuilder extends MessageOrBuilder {
        DisableRequest getDisableRequest();

        DisableRequestOrBuilder getDisableRequestOrBuilder();

        DisableResponse getDisableResponse();

        DisableResponseOrBuilder getDisableResponseOrBuilder();

        MovementAlertNotification getMovementAlertNotification();

        MovementAlertNotificationOrBuilder getMovementAlertNotificationOrBuilder();

        ResetPINRequest getResetPinRequest();

        ResetPINRequestOrBuilder getResetPinRequestOrBuilder();

        ResetPINResponse getResetPinResponse();

        ResetPINResponseOrBuilder getResetPinResponseOrBuilder();

        SettingChangeRequest getSettingChangeRequest();

        SettingChangeRequestOrBuilder getSettingChangeRequestOrBuilder();

        SettingChangeResponse getSettingChangeResponse();

        SettingChangeResponseOrBuilder getSettingChangeResponseOrBuilder();

        SettingRequest getSettingRequest();

        SettingRequestOrBuilder getSettingRequestOrBuilder();

        SettingResponse getSettingResponse();

        SettingResponseOrBuilder getSettingResponseOrBuilder();

        TriggerRequest getTriggerRequest();

        TriggerRequestOrBuilder getTriggerRequestOrBuilder();

        TriggerResponse getTriggerResponse();

        TriggerResponseOrBuilder getTriggerResponseOrBuilder();

        boolean hasDisableRequest();

        boolean hasDisableResponse();

        boolean hasMovementAlertNotification();

        boolean hasResetPinRequest();

        boolean hasResetPinResponse();

        boolean hasSettingChangeRequest();

        boolean hasSettingChangeResponse();

        boolean hasSettingRequest();

        boolean hasSettingResponse();

        boolean hasTriggerRequest();

        boolean hasTriggerResponse();
    }

    /* JADX INFO: loaded from: classes14.dex */
    public interface DisableRequestOrBuilder extends MessageOrBuilder {
    }

    /* JADX INFO: loaded from: classes14.dex */
    public interface DisableResponseOrBuilder extends MessageOrBuilder {
        DisableResponse.Response getResponse();

        boolean hasResponse();
    }

    /* JADX INFO: loaded from: classes14.dex */
    public interface MovementAlertNotificationOrBuilder extends MessageOrBuilder {
    }

    /* JADX INFO: loaded from: classes14.dex */
    public interface ResetPINRequestOrBuilder extends MessageOrBuilder {
        int getPin();

        boolean hasPin();
    }

    /* JADX INFO: loaded from: classes14.dex */
    public interface ResetPINResponseOrBuilder extends MessageOrBuilder {
        ResetPINResponse.Response getResponse();

        boolean hasResponse();
    }

    /* JADX INFO: loaded from: classes14.dex */
    public interface SettingChangeRequestOrBuilder extends MessageOrBuilder {
        boolean getIsEnabled();

        boolean hasIsEnabled();
    }

    /* JADX INFO: loaded from: classes14.dex */
    public interface SettingChangeResponseOrBuilder extends MessageOrBuilder {
        SettingChangeResponse.Response getResponse();

        boolean hasResponse();
    }

    /* JADX INFO: loaded from: classes14.dex */
    public interface SettingRequestOrBuilder extends MessageOrBuilder {
    }

    /* JADX INFO: loaded from: classes14.dex */
    public interface SettingResponseOrBuilder extends MessageOrBuilder {
        boolean getIsEnabled();

        boolean getIsTriggered();

        int getPin();

        boolean hasIsEnabled();

        boolean hasIsTriggered();

        boolean hasPin();
    }

    /* JADX INFO: loaded from: classes14.dex */
    public interface TriggerRequestOrBuilder extends MessageOrBuilder {
    }

    /* JADX INFO: loaded from: classes14.dex */
    public interface TriggerResponseOrBuilder extends MessageOrBuilder {
        TriggerResponse.Response getResponse();

        boolean hasResponse();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_AntiTheftAlarm_AntiTheftAlarmService_descriptor = descriptor2;
        internal_static_GDI_Proto_AntiTheftAlarm_AntiTheftAlarmService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"SettingChangeRequest", "SettingChangeResponse", "TriggerRequest", "TriggerResponse", "DisableRequest", "DisableResponse", "MovementAlertNotification", "ResetPinRequest", "ResetPinResponse", "SettingRequest", "SettingResponse"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_AntiTheftAlarm_SettingChangeRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_AntiTheftAlarm_SettingChangeRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"IsEnabled"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_AntiTheftAlarm_SettingChangeResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_AntiTheftAlarm_SettingChangeResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Response"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_AntiTheftAlarm_TriggerRequest_descriptor = descriptor5;
        internal_static_GDI_Proto_AntiTheftAlarm_TriggerRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[0]);
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_AntiTheftAlarm_TriggerResponse_descriptor = descriptor6;
        internal_static_GDI_Proto_AntiTheftAlarm_TriggerResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Response"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_AntiTheftAlarm_DisableRequest_descriptor = descriptor7;
        internal_static_GDI_Proto_AntiTheftAlarm_DisableRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[0]);
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_AntiTheftAlarm_DisableResponse_descriptor = descriptor8;
        internal_static_GDI_Proto_AntiTheftAlarm_DisableResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Response"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_AntiTheftAlarm_MovementAlertNotification_descriptor = descriptor9;
        internal_static_GDI_Proto_AntiTheftAlarm_MovementAlertNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[0]);
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_GDI_Proto_AntiTheftAlarm_ResetPINRequest_descriptor = descriptor10;
        internal_static_GDI_Proto_AntiTheftAlarm_ResetPINRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Pin"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(9);
        internal_static_GDI_Proto_AntiTheftAlarm_ResetPINResponse_descriptor = descriptor11;
        internal_static_GDI_Proto_AntiTheftAlarm_ResetPINResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"Response"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(10);
        internal_static_GDI_Proto_AntiTheftAlarm_SettingRequest_descriptor = descriptor12;
        internal_static_GDI_Proto_AntiTheftAlarm_SettingRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[0]);
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(11);
        internal_static_GDI_Proto_AntiTheftAlarm_SettingResponse_descriptor = descriptor13;
        internal_static_GDI_Proto_AntiTheftAlarm_SettingResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"Pin", "IsEnabled", "IsTriggered"});
    }

    private GDIAntiTheftAlarmProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class DisableRequest extends GeneratedMessageV3 implements DisableRequestOrBuilder {
        private static final DisableRequest DEFAULT_INSTANCE = new DisableRequest();

        @Deprecated
        public static final Parser<DisableRequest> PARSER = new AbstractParser<DisableRequest>() { // from class: com.garmin.proto.generated.GDIAntiTheftAlarmProto.DisableRequest.1
            @Override // com.google.protobuf.Parser
            public DisableRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DisableRequest.newBuilder();
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

        private DisableRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DisableRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_DisableRequest_descriptor;
        }

        public static Builder newBuilder(DisableRequest disableRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(disableRequest);
        }

        public static DisableRequest parseDelimitedFrom(InputStream inputStream) {
            return (DisableRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DisableRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DisableRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof DisableRequest) {
                return getUnknownFields().equals(((DisableRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DisableRequest> getParserForType() {
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
            return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_DisableRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(DisableRequest.class, Builder.class);
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
            return new DisableRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DisableRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_DisableRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DisableRequest build() {
                DisableRequest disableRequestBuildPartial = buildPartial();
                if (disableRequestBuildPartial.isInitialized()) {
                    return disableRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) disableRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DisableRequest buildPartial() {
                DisableRequest disableRequest = new DisableRequest(this);
                onBuilt();
                return disableRequest;
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
                return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_DisableRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_DisableRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(DisableRequest.class, Builder.class);
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
            public DisableRequest getDefaultInstanceForType() {
                return DisableRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DisableRequest) {
                    return mergeFrom((DisableRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DisableRequest disableRequest) {
                if (disableRequest == DisableRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(disableRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DisableRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ DisableRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private DisableRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DisableRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DisableRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DisableRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DisableRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DisableRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DisableRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DisableRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DisableRequest parseFrom(InputStream inputStream) {
            return (DisableRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DisableRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DisableRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DisableRequest parseFrom(CodedInputStream codedInputStream) {
            return (DisableRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DisableRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DisableRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class MovementAlertNotification extends GeneratedMessageV3 implements MovementAlertNotificationOrBuilder {
        private static final MovementAlertNotification DEFAULT_INSTANCE = new MovementAlertNotification();

        @Deprecated
        public static final Parser<MovementAlertNotification> PARSER = new AbstractParser<MovementAlertNotification>() { // from class: com.garmin.proto.generated.GDIAntiTheftAlarmProto.MovementAlertNotification.1
            @Override // com.google.protobuf.Parser
            public MovementAlertNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = MovementAlertNotification.newBuilder();
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

        private MovementAlertNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MovementAlertNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_MovementAlertNotification_descriptor;
        }

        public static Builder newBuilder(MovementAlertNotification movementAlertNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(movementAlertNotification);
        }

        public static MovementAlertNotification parseDelimitedFrom(InputStream inputStream) {
            return (MovementAlertNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MovementAlertNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<MovementAlertNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof MovementAlertNotification) {
                return getUnknownFields().equals(((MovementAlertNotification) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<MovementAlertNotification> getParserForType() {
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
            return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_MovementAlertNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(MovementAlertNotification.class, Builder.class);
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
            return new MovementAlertNotification();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MovementAlertNotificationOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_MovementAlertNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MovementAlertNotification build() {
                MovementAlertNotification movementAlertNotificationBuildPartial = buildPartial();
                if (movementAlertNotificationBuildPartial.isInitialized()) {
                    return movementAlertNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) movementAlertNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MovementAlertNotification buildPartial() {
                MovementAlertNotification movementAlertNotification = new MovementAlertNotification(this);
                onBuilt();
                return movementAlertNotification;
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
                return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_MovementAlertNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_MovementAlertNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(MovementAlertNotification.class, Builder.class);
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
            public MovementAlertNotification getDefaultInstanceForType() {
                return MovementAlertNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof MovementAlertNotification) {
                    return mergeFrom((MovementAlertNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(MovementAlertNotification movementAlertNotification) {
                if (movementAlertNotification == MovementAlertNotification.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(movementAlertNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public MovementAlertNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ MovementAlertNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private MovementAlertNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MovementAlertNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MovementAlertNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MovementAlertNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static MovementAlertNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MovementAlertNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static MovementAlertNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static MovementAlertNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static MovementAlertNotification parseFrom(InputStream inputStream) {
            return (MovementAlertNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static MovementAlertNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MovementAlertNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MovementAlertNotification parseFrom(CodedInputStream codedInputStream) {
            return (MovementAlertNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static MovementAlertNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MovementAlertNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class ResetPINRequest extends GeneratedMessageV3 implements ResetPINRequestOrBuilder {
        private static final ResetPINRequest DEFAULT_INSTANCE = new ResetPINRequest();

        @Deprecated
        public static final Parser<ResetPINRequest> PARSER = new AbstractParser<ResetPINRequest>() { // from class: com.garmin.proto.generated.GDIAntiTheftAlarmProto.ResetPINRequest.1
            @Override // com.google.protobuf.Parser
            public ResetPINRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ResetPINRequest.newBuilder();
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
        public static final int PIN_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int pin_;

        private ResetPINRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.pin_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ResetPINRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_ResetPINRequest_descriptor;
        }

        public static Builder newBuilder(ResetPINRequest resetPINRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(resetPINRequest);
        }

        public static ResetPINRequest parseDelimitedFrom(InputStream inputStream) {
            return (ResetPINRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ResetPINRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ResetPINRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ResetPINRequest)) {
                return super.equals(obj);
            }
            ResetPINRequest resetPINRequest = (ResetPINRequest) obj;
            if (hasPin() != resetPINRequest.hasPin()) {
                return false;
            }
            return (!hasPin() || getPin() == resetPINRequest.getPin()) && getUnknownFields().equals(resetPINRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ResetPINRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.ResetPINRequestOrBuilder
        public int getPin() {
            return this.pin_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.pin_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.ResetPINRequestOrBuilder
        public boolean hasPin() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasPin()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getPin();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_ResetPINRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ResetPINRequest.class, Builder.class);
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
            return new ResetPINRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.pin_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ResetPINRequestOrBuilder {
            private int bitField0_;
            private int pin_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(ResetPINRequest resetPINRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    resetPINRequest.pin_ = this.pin_;
                } else {
                    i14 = 0;
                }
                resetPINRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_ResetPINRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ResetPINRequest build() {
                ResetPINRequest resetPINRequestBuildPartial = buildPartial();
                if (resetPINRequestBuildPartial.isInitialized()) {
                    return resetPINRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) resetPINRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ResetPINRequest buildPartial() {
                ResetPINRequest resetPINRequest = new ResetPINRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(resetPINRequest);
                }
                onBuilt();
                return resetPINRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.pin_ = 0;
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

            public Builder clearPin() {
                this.bitField0_ &= -2;
                this.pin_ = 0;
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
                return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_ResetPINRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.ResetPINRequestOrBuilder
            public int getPin() {
                return this.pin_;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.ResetPINRequestOrBuilder
            public boolean hasPin() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_ResetPINRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ResetPINRequest.class, Builder.class);
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
                                    this.pin_ = codedInputStream.readUInt32();
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

            public Builder setPin(int i14) {
                this.pin_ = i14;
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
            public ResetPINRequest getDefaultInstanceForType() {
                return ResetPINRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ResetPINRequest) {
                    return mergeFrom((ResetPINRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ResetPINRequest resetPINRequest) {
                if (resetPINRequest == ResetPINRequest.getDefaultInstance()) {
                    return this;
                }
                if (resetPINRequest.hasPin()) {
                    setPin(resetPINRequest.getPin());
                }
                mergeUnknownFields(resetPINRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ResetPINRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ResetPINRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ResetPINRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ResetPINRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ResetPINRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ResetPINRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ResetPINRequest() {
            this.pin_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ResetPINRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ResetPINRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ResetPINRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ResetPINRequest parseFrom(InputStream inputStream) {
            return (ResetPINRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ResetPINRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ResetPINRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ResetPINRequest parseFrom(CodedInputStream codedInputStream) {
            return (ResetPINRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ResetPINRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ResetPINRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class SettingChangeRequest extends GeneratedMessageV3 implements SettingChangeRequestOrBuilder {
        public static final int IS_ENABLED_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean isEnabled_;
        private byte memoizedIsInitialized;
        private static final SettingChangeRequest DEFAULT_INSTANCE = new SettingChangeRequest();

        @Deprecated
        public static final Parser<SettingChangeRequest> PARSER = new AbstractParser<SettingChangeRequest>() { // from class: com.garmin.proto.generated.GDIAntiTheftAlarmProto.SettingChangeRequest.1
            @Override // com.google.protobuf.Parser
            public SettingChangeRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SettingChangeRequest.newBuilder();
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

        private SettingChangeRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.isEnabled_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SettingChangeRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_SettingChangeRequest_descriptor;
        }

        public static Builder newBuilder(SettingChangeRequest settingChangeRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(settingChangeRequest);
        }

        public static SettingChangeRequest parseDelimitedFrom(InputStream inputStream) {
            return (SettingChangeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SettingChangeRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SettingChangeRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SettingChangeRequest)) {
                return super.equals(obj);
            }
            SettingChangeRequest settingChangeRequest = (SettingChangeRequest) obj;
            if (hasIsEnabled() != settingChangeRequest.hasIsEnabled()) {
                return false;
            }
            return (!hasIsEnabled() || getIsEnabled() == settingChangeRequest.getIsEnabled()) && getUnknownFields().equals(settingChangeRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.SettingChangeRequestOrBuilder
        public boolean getIsEnabled() {
            return this.isEnabled_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SettingChangeRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.isEnabled_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.SettingChangeRequestOrBuilder
        public boolean hasIsEnabled() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasIsEnabled()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getIsEnabled());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_SettingChangeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SettingChangeRequest.class, Builder.class);
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
            return new SettingChangeRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.isEnabled_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SettingChangeRequestOrBuilder {
            private int bitField0_;
            private boolean isEnabled_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(SettingChangeRequest settingChangeRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    settingChangeRequest.isEnabled_ = this.isEnabled_;
                } else {
                    i14 = 0;
                }
                settingChangeRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_SettingChangeRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SettingChangeRequest build() {
                SettingChangeRequest settingChangeRequestBuildPartial = buildPartial();
                if (settingChangeRequestBuildPartial.isInitialized()) {
                    return settingChangeRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) settingChangeRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SettingChangeRequest buildPartial() {
                SettingChangeRequest settingChangeRequest = new SettingChangeRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(settingChangeRequest);
                }
                onBuilt();
                return settingChangeRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.isEnabled_ = false;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearIsEnabled() {
                this.bitField0_ &= -2;
                this.isEnabled_ = false;
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
                return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_SettingChangeRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.SettingChangeRequestOrBuilder
            public boolean getIsEnabled() {
                return this.isEnabled_;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.SettingChangeRequestOrBuilder
            public boolean hasIsEnabled() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_SettingChangeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SettingChangeRequest.class, Builder.class);
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
                                    this.isEnabled_ = codedInputStream.readBool();
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

            public Builder setIsEnabled(boolean z14) {
                this.isEnabled_ = z14;
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
            public SettingChangeRequest getDefaultInstanceForType() {
                return SettingChangeRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SettingChangeRequest) {
                    return mergeFrom((SettingChangeRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SettingChangeRequest settingChangeRequest) {
                if (settingChangeRequest == SettingChangeRequest.getDefaultInstance()) {
                    return this;
                }
                if (settingChangeRequest.hasIsEnabled()) {
                    setIsEnabled(settingChangeRequest.getIsEnabled());
                }
                mergeUnknownFields(settingChangeRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SettingChangeRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SettingChangeRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SettingChangeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SettingChangeRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ SettingChangeRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SettingChangeRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SettingChangeRequest() {
            this.isEnabled_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SettingChangeRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SettingChangeRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SettingChangeRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SettingChangeRequest parseFrom(InputStream inputStream) {
            return (SettingChangeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SettingChangeRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SettingChangeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SettingChangeRequest parseFrom(CodedInputStream codedInputStream) {
            return (SettingChangeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SettingChangeRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SettingChangeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class SettingRequest extends GeneratedMessageV3 implements SettingRequestOrBuilder {
        private static final SettingRequest DEFAULT_INSTANCE = new SettingRequest();

        @Deprecated
        public static final Parser<SettingRequest> PARSER = new AbstractParser<SettingRequest>() { // from class: com.garmin.proto.generated.GDIAntiTheftAlarmProto.SettingRequest.1
            @Override // com.google.protobuf.Parser
            public SettingRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SettingRequest.newBuilder();
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

        private SettingRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SettingRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_SettingRequest_descriptor;
        }

        public static Builder newBuilder(SettingRequest settingRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(settingRequest);
        }

        public static SettingRequest parseDelimitedFrom(InputStream inputStream) {
            return (SettingRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SettingRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SettingRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof SettingRequest) {
                return getUnknownFields().equals(((SettingRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SettingRequest> getParserForType() {
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
            return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_SettingRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SettingRequest.class, Builder.class);
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
            return new SettingRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SettingRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_SettingRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SettingRequest build() {
                SettingRequest settingRequestBuildPartial = buildPartial();
                if (settingRequestBuildPartial.isInitialized()) {
                    return settingRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) settingRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SettingRequest buildPartial() {
                SettingRequest settingRequest = new SettingRequest(this);
                onBuilt();
                return settingRequest;
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
                return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_SettingRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_SettingRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SettingRequest.class, Builder.class);
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
            public SettingRequest getDefaultInstanceForType() {
                return SettingRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SettingRequest) {
                    return mergeFrom((SettingRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SettingRequest settingRequest) {
                if (settingRequest == SettingRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(settingRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SettingRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ SettingRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SettingRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SettingRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SettingRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SettingRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SettingRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SettingRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SettingRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SettingRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SettingRequest parseFrom(InputStream inputStream) {
            return (SettingRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SettingRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SettingRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SettingRequest parseFrom(CodedInputStream codedInputStream) {
            return (SettingRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SettingRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SettingRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class SettingResponse extends GeneratedMessageV3 implements SettingResponseOrBuilder {
        public static final int IS_ENABLED_FIELD_NUMBER = 2;
        public static final int IS_TRIGGERED_FIELD_NUMBER = 3;
        public static final int PIN_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean isEnabled_;
        private boolean isTriggered_;
        private byte memoizedIsInitialized;
        private int pin_;
        private static final SettingResponse DEFAULT_INSTANCE = new SettingResponse();

        @Deprecated
        public static final Parser<SettingResponse> PARSER = new AbstractParser<SettingResponse>() { // from class: com.garmin.proto.generated.GDIAntiTheftAlarmProto.SettingResponse.1
            @Override // com.google.protobuf.Parser
            public SettingResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SettingResponse.newBuilder();
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

        private SettingResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.pin_ = 0;
            this.isEnabled_ = false;
            this.isTriggered_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SettingResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_SettingResponse_descriptor;
        }

        public static Builder newBuilder(SettingResponse settingResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(settingResponse);
        }

        public static SettingResponse parseDelimitedFrom(InputStream inputStream) {
            return (SettingResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SettingResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SettingResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SettingResponse)) {
                return super.equals(obj);
            }
            SettingResponse settingResponse = (SettingResponse) obj;
            if (hasPin() != settingResponse.hasPin()) {
                return false;
            }
            if ((hasPin() && getPin() != settingResponse.getPin()) || hasIsEnabled() != settingResponse.hasIsEnabled()) {
                return false;
            }
            if ((!hasIsEnabled() || getIsEnabled() == settingResponse.getIsEnabled()) && hasIsTriggered() == settingResponse.hasIsTriggered()) {
                return (!hasIsTriggered() || getIsTriggered() == settingResponse.getIsTriggered()) && getUnknownFields().equals(settingResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.SettingResponseOrBuilder
        public boolean getIsEnabled() {
            return this.isEnabled_;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.SettingResponseOrBuilder
        public boolean getIsTriggered() {
            return this.isTriggered_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SettingResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.SettingResponseOrBuilder
        public int getPin() {
            return this.pin_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.pin_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(2, this.isEnabled_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(3, this.isTriggered_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.SettingResponseOrBuilder
        public boolean hasIsEnabled() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.SettingResponseOrBuilder
        public boolean hasIsTriggered() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.SettingResponseOrBuilder
        public boolean hasPin() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasPin()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getPin();
            }
            if (hasIsEnabled()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getIsEnabled());
            }
            if (hasIsTriggered()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashBoolean(getIsTriggered());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_SettingResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SettingResponse.class, Builder.class);
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
            return new SettingResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.pin_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.isEnabled_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(3, this.isTriggered_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SettingResponseOrBuilder {
            private int bitField0_;
            private boolean isEnabled_;
            private boolean isTriggered_;
            private int pin_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(SettingResponse settingResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    settingResponse.pin_ = this.pin_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    settingResponse.isEnabled_ = this.isEnabled_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    settingResponse.isTriggered_ = this.isTriggered_;
                    i14 |= 4;
                }
                settingResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_SettingResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SettingResponse build() {
                SettingResponse settingResponseBuildPartial = buildPartial();
                if (settingResponseBuildPartial.isInitialized()) {
                    return settingResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) settingResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SettingResponse buildPartial() {
                SettingResponse settingResponse = new SettingResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(settingResponse);
                }
                onBuilt();
                return settingResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.pin_ = 0;
                this.isEnabled_ = false;
                this.isTriggered_ = false;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearIsEnabled() {
                this.bitField0_ &= -3;
                this.isEnabled_ = false;
                onChanged();
                return this;
            }

            public Builder clearIsTriggered() {
                this.bitField0_ &= -5;
                this.isTriggered_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPin() {
                this.bitField0_ &= -2;
                this.pin_ = 0;
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
                return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_SettingResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.SettingResponseOrBuilder
            public boolean getIsEnabled() {
                return this.isEnabled_;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.SettingResponseOrBuilder
            public boolean getIsTriggered() {
                return this.isTriggered_;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.SettingResponseOrBuilder
            public int getPin() {
                return this.pin_;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.SettingResponseOrBuilder
            public boolean hasIsEnabled() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.SettingResponseOrBuilder
            public boolean hasIsTriggered() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.SettingResponseOrBuilder
            public boolean hasPin() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_SettingResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SettingResponse.class, Builder.class);
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
                                    this.pin_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.isEnabled_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.isTriggered_ = codedInputStream.readBool();
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

            public Builder setIsEnabled(boolean z14) {
                this.isEnabled_ = z14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setIsTriggered(boolean z14) {
                this.isTriggered_ = z14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPin(int i14) {
                this.pin_ = i14;
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
            public SettingResponse getDefaultInstanceForType() {
                return SettingResponse.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SettingResponse) {
                    return mergeFrom((SettingResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SettingResponse settingResponse) {
                if (settingResponse == SettingResponse.getDefaultInstance()) {
                    return this;
                }
                if (settingResponse.hasPin()) {
                    setPin(settingResponse.getPin());
                }
                if (settingResponse.hasIsEnabled()) {
                    setIsEnabled(settingResponse.getIsEnabled());
                }
                if (settingResponse.hasIsTriggered()) {
                    setIsTriggered(settingResponse.getIsTriggered());
                }
                mergeUnknownFields(settingResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SettingResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SettingResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SettingResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SettingResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SettingResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SettingResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SettingResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SettingResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ SettingResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SettingResponse parseFrom(InputStream inputStream) {
            return (SettingResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private SettingResponse() {
            this.pin_ = 0;
            this.isEnabled_ = false;
            this.isTriggered_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SettingResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SettingResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SettingResponse parseFrom(CodedInputStream codedInputStream) {
            return (SettingResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SettingResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SettingResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class TriggerRequest extends GeneratedMessageV3 implements TriggerRequestOrBuilder {
        private static final TriggerRequest DEFAULT_INSTANCE = new TriggerRequest();

        @Deprecated
        public static final Parser<TriggerRequest> PARSER = new AbstractParser<TriggerRequest>() { // from class: com.garmin.proto.generated.GDIAntiTheftAlarmProto.TriggerRequest.1
            @Override // com.google.protobuf.Parser
            public TriggerRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TriggerRequest.newBuilder();
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

        private TriggerRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TriggerRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_TriggerRequest_descriptor;
        }

        public static Builder newBuilder(TriggerRequest triggerRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(triggerRequest);
        }

        public static TriggerRequest parseDelimitedFrom(InputStream inputStream) {
            return (TriggerRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TriggerRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TriggerRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof TriggerRequest) {
                return getUnknownFields().equals(((TriggerRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TriggerRequest> getParserForType() {
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
            return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_TriggerRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(TriggerRequest.class, Builder.class);
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
            return new TriggerRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TriggerRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_TriggerRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TriggerRequest build() {
                TriggerRequest triggerRequestBuildPartial = buildPartial();
                if (triggerRequestBuildPartial.isInitialized()) {
                    return triggerRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) triggerRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TriggerRequest buildPartial() {
                TriggerRequest triggerRequest = new TriggerRequest(this);
                onBuilt();
                return triggerRequest;
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
                return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_TriggerRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_TriggerRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(TriggerRequest.class, Builder.class);
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
            public TriggerRequest getDefaultInstanceForType() {
                return TriggerRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TriggerRequest) {
                    return mergeFrom((TriggerRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TriggerRequest triggerRequest) {
                if (triggerRequest == TriggerRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(triggerRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TriggerRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ TriggerRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private TriggerRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TriggerRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TriggerRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TriggerRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static TriggerRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TriggerRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TriggerRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static TriggerRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static TriggerRequest parseFrom(InputStream inputStream) {
            return (TriggerRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static TriggerRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TriggerRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TriggerRequest parseFrom(CodedInputStream codedInputStream) {
            return (TriggerRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TriggerRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TriggerRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class AntiTheftAlarmService extends GeneratedMessageV3 implements AntiTheftAlarmServiceOrBuilder {
        public static final int DISABLE_REQUEST_FIELD_NUMBER = 4;
        public static final int DISABLE_RESPONSE_FIELD_NUMBER = 5;
        public static final int MOVEMENT_ALERT_NOTIFICATION_FIELD_NUMBER = 6;
        public static final int RESET_PIN_REQUEST_FIELD_NUMBER = 7;
        public static final int RESET_PIN_RESPONSE_FIELD_NUMBER = 8;
        public static final int SETTING_CHANGE_REQUEST_FIELD_NUMBER = 1;
        public static final int SETTING_CHANGE_RESPONSE_FIELD_NUMBER = 11;
        public static final int SETTING_REQUEST_FIELD_NUMBER = 9;
        public static final int SETTING_RESPONSE_FIELD_NUMBER = 10;
        public static final int TRIGGER_REQUEST_FIELD_NUMBER = 2;
        public static final int TRIGGER_RESPONSE_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private DisableRequest disableRequest_;
        private DisableResponse disableResponse_;
        private byte memoizedIsInitialized;
        private MovementAlertNotification movementAlertNotification_;
        private ResetPINRequest resetPinRequest_;
        private ResetPINResponse resetPinResponse_;
        private SettingChangeRequest settingChangeRequest_;
        private SettingChangeResponse settingChangeResponse_;
        private SettingRequest settingRequest_;
        private SettingResponse settingResponse_;
        private TriggerRequest triggerRequest_;
        private TriggerResponse triggerResponse_;
        private static final AntiTheftAlarmService DEFAULT_INSTANCE = new AntiTheftAlarmService();

        @Deprecated
        public static final Parser<AntiTheftAlarmService> PARSER = new AbstractParser<AntiTheftAlarmService>() { // from class: com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmService.1
            @Override // com.google.protobuf.Parser
            public AntiTheftAlarmService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AntiTheftAlarmService.newBuilder();
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

        private AntiTheftAlarmService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AntiTheftAlarmService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_AntiTheftAlarmService_descriptor;
        }

        public static Builder newBuilder(AntiTheftAlarmService antiTheftAlarmService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(antiTheftAlarmService);
        }

        public static AntiTheftAlarmService parseDelimitedFrom(InputStream inputStream) {
            return (AntiTheftAlarmService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AntiTheftAlarmService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AntiTheftAlarmService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AntiTheftAlarmService)) {
                return super.equals(obj);
            }
            AntiTheftAlarmService antiTheftAlarmService = (AntiTheftAlarmService) obj;
            if (hasSettingChangeRequest() != antiTheftAlarmService.hasSettingChangeRequest()) {
                return false;
            }
            if ((hasSettingChangeRequest() && !getSettingChangeRequest().equals(antiTheftAlarmService.getSettingChangeRequest())) || hasSettingChangeResponse() != antiTheftAlarmService.hasSettingChangeResponse()) {
                return false;
            }
            if ((hasSettingChangeResponse() && !getSettingChangeResponse().equals(antiTheftAlarmService.getSettingChangeResponse())) || hasTriggerRequest() != antiTheftAlarmService.hasTriggerRequest()) {
                return false;
            }
            if ((hasTriggerRequest() && !getTriggerRequest().equals(antiTheftAlarmService.getTriggerRequest())) || hasTriggerResponse() != antiTheftAlarmService.hasTriggerResponse()) {
                return false;
            }
            if ((hasTriggerResponse() && !getTriggerResponse().equals(antiTheftAlarmService.getTriggerResponse())) || hasDisableRequest() != antiTheftAlarmService.hasDisableRequest()) {
                return false;
            }
            if ((hasDisableRequest() && !getDisableRequest().equals(antiTheftAlarmService.getDisableRequest())) || hasDisableResponse() != antiTheftAlarmService.hasDisableResponse()) {
                return false;
            }
            if ((hasDisableResponse() && !getDisableResponse().equals(antiTheftAlarmService.getDisableResponse())) || hasMovementAlertNotification() != antiTheftAlarmService.hasMovementAlertNotification()) {
                return false;
            }
            if ((hasMovementAlertNotification() && !getMovementAlertNotification().equals(antiTheftAlarmService.getMovementAlertNotification())) || hasResetPinRequest() != antiTheftAlarmService.hasResetPinRequest()) {
                return false;
            }
            if ((hasResetPinRequest() && !getResetPinRequest().equals(antiTheftAlarmService.getResetPinRequest())) || hasResetPinResponse() != antiTheftAlarmService.hasResetPinResponse()) {
                return false;
            }
            if ((hasResetPinResponse() && !getResetPinResponse().equals(antiTheftAlarmService.getResetPinResponse())) || hasSettingRequest() != antiTheftAlarmService.hasSettingRequest()) {
                return false;
            }
            if ((!hasSettingRequest() || getSettingRequest().equals(antiTheftAlarmService.getSettingRequest())) && hasSettingResponse() == antiTheftAlarmService.hasSettingResponse()) {
                return (!hasSettingResponse() || getSettingResponse().equals(antiTheftAlarmService.getSettingResponse())) && getUnknownFields().equals(antiTheftAlarmService.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
        public DisableRequest getDisableRequest() {
            DisableRequest disableRequest = this.disableRequest_;
            return disableRequest == null ? DisableRequest.getDefaultInstance() : disableRequest;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
        public DisableRequestOrBuilder getDisableRequestOrBuilder() {
            DisableRequest disableRequest = this.disableRequest_;
            return disableRequest == null ? DisableRequest.getDefaultInstance() : disableRequest;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
        public DisableResponse getDisableResponse() {
            DisableResponse disableResponse = this.disableResponse_;
            return disableResponse == null ? DisableResponse.getDefaultInstance() : disableResponse;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
        public DisableResponseOrBuilder getDisableResponseOrBuilder() {
            DisableResponse disableResponse = this.disableResponse_;
            return disableResponse == null ? DisableResponse.getDefaultInstance() : disableResponse;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
        public MovementAlertNotification getMovementAlertNotification() {
            MovementAlertNotification movementAlertNotification = this.movementAlertNotification_;
            return movementAlertNotification == null ? MovementAlertNotification.getDefaultInstance() : movementAlertNotification;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
        public MovementAlertNotificationOrBuilder getMovementAlertNotificationOrBuilder() {
            MovementAlertNotification movementAlertNotification = this.movementAlertNotification_;
            return movementAlertNotification == null ? MovementAlertNotification.getDefaultInstance() : movementAlertNotification;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AntiTheftAlarmService> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
        public ResetPINRequest getResetPinRequest() {
            ResetPINRequest resetPINRequest = this.resetPinRequest_;
            return resetPINRequest == null ? ResetPINRequest.getDefaultInstance() : resetPINRequest;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
        public ResetPINRequestOrBuilder getResetPinRequestOrBuilder() {
            ResetPINRequest resetPINRequest = this.resetPinRequest_;
            return resetPINRequest == null ? ResetPINRequest.getDefaultInstance() : resetPINRequest;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
        public ResetPINResponse getResetPinResponse() {
            ResetPINResponse resetPINResponse = this.resetPinResponse_;
            return resetPINResponse == null ? ResetPINResponse.getDefaultInstance() : resetPINResponse;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
        public ResetPINResponseOrBuilder getResetPinResponseOrBuilder() {
            ResetPINResponse resetPINResponse = this.resetPinResponse_;
            return resetPINResponse == null ? ResetPINResponse.getDefaultInstance() : resetPINResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getSettingChangeRequest()) : 0;
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getTriggerRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getTriggerResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getDisableRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getDisableResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getMovementAlertNotification());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getResetPinRequest());
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, getResetPinResponse());
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(9, getSettingRequest());
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(10, getSettingResponse());
            }
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(11, getSettingChangeResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
        public SettingChangeRequest getSettingChangeRequest() {
            SettingChangeRequest settingChangeRequest = this.settingChangeRequest_;
            return settingChangeRequest == null ? SettingChangeRequest.getDefaultInstance() : settingChangeRequest;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
        public SettingChangeRequestOrBuilder getSettingChangeRequestOrBuilder() {
            SettingChangeRequest settingChangeRequest = this.settingChangeRequest_;
            return settingChangeRequest == null ? SettingChangeRequest.getDefaultInstance() : settingChangeRequest;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
        public SettingChangeResponse getSettingChangeResponse() {
            SettingChangeResponse settingChangeResponse = this.settingChangeResponse_;
            return settingChangeResponse == null ? SettingChangeResponse.getDefaultInstance() : settingChangeResponse;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
        public SettingChangeResponseOrBuilder getSettingChangeResponseOrBuilder() {
            SettingChangeResponse settingChangeResponse = this.settingChangeResponse_;
            return settingChangeResponse == null ? SettingChangeResponse.getDefaultInstance() : settingChangeResponse;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
        public SettingRequest getSettingRequest() {
            SettingRequest settingRequest = this.settingRequest_;
            return settingRequest == null ? SettingRequest.getDefaultInstance() : settingRequest;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
        public SettingRequestOrBuilder getSettingRequestOrBuilder() {
            SettingRequest settingRequest = this.settingRequest_;
            return settingRequest == null ? SettingRequest.getDefaultInstance() : settingRequest;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
        public SettingResponse getSettingResponse() {
            SettingResponse settingResponse = this.settingResponse_;
            return settingResponse == null ? SettingResponse.getDefaultInstance() : settingResponse;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
        public SettingResponseOrBuilder getSettingResponseOrBuilder() {
            SettingResponse settingResponse = this.settingResponse_;
            return settingResponse == null ? SettingResponse.getDefaultInstance() : settingResponse;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
        public TriggerRequest getTriggerRequest() {
            TriggerRequest triggerRequest = this.triggerRequest_;
            return triggerRequest == null ? TriggerRequest.getDefaultInstance() : triggerRequest;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
        public TriggerRequestOrBuilder getTriggerRequestOrBuilder() {
            TriggerRequest triggerRequest = this.triggerRequest_;
            return triggerRequest == null ? TriggerRequest.getDefaultInstance() : triggerRequest;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
        public TriggerResponse getTriggerResponse() {
            TriggerResponse triggerResponse = this.triggerResponse_;
            return triggerResponse == null ? TriggerResponse.getDefaultInstance() : triggerResponse;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
        public TriggerResponseOrBuilder getTriggerResponseOrBuilder() {
            TriggerResponse triggerResponse = this.triggerResponse_;
            return triggerResponse == null ? TriggerResponse.getDefaultInstance() : triggerResponse;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
        public boolean hasDisableRequest() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
        public boolean hasDisableResponse() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
        public boolean hasMovementAlertNotification() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
        public boolean hasResetPinRequest() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
        public boolean hasResetPinResponse() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
        public boolean hasSettingChangeRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
        public boolean hasSettingChangeResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
        public boolean hasSettingRequest() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
        public boolean hasSettingResponse() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
        public boolean hasTriggerRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
        public boolean hasTriggerResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSettingChangeRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSettingChangeRequest().hashCode();
            }
            if (hasSettingChangeResponse()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getSettingChangeResponse().hashCode();
            }
            if (hasTriggerRequest()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getTriggerRequest().hashCode();
            }
            if (hasTriggerResponse()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getTriggerResponse().hashCode();
            }
            if (hasDisableRequest()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getDisableRequest().hashCode();
            }
            if (hasDisableResponse()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getDisableResponse().hashCode();
            }
            if (hasMovementAlertNotification()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getMovementAlertNotification().hashCode();
            }
            if (hasResetPinRequest()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getResetPinRequest().hashCode();
            }
            if (hasResetPinResponse()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getResetPinResponse().hashCode();
            }
            if (hasSettingRequest()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getSettingRequest().hashCode();
            }
            if (hasSettingResponse()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getSettingResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_AntiTheftAlarmService_fieldAccessorTable.ensureFieldAccessorsInitialized(AntiTheftAlarmService.class, Builder.class);
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
            if (hasSettingChangeResponse() && !getSettingChangeResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasTriggerResponse() && !getTriggerResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasDisableResponse() && !getDisableResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasResetPinResponse() || getResetPinResponse().isInitialized()) {
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
            return new AntiTheftAlarmService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getSettingChangeRequest());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(2, getTriggerRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(3, getTriggerResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(4, getDisableRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(5, getDisableResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(6, getMovementAlertNotification());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(7, getResetPinRequest());
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(8, getResetPinResponse());
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeMessage(9, getSettingRequest());
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeMessage(10, getSettingResponse());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(11, getSettingChangeResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AntiTheftAlarmServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<DisableRequest, DisableRequest.Builder, DisableRequestOrBuilder> disableRequestBuilder_;
            private DisableRequest disableRequest_;
            private SingleFieldBuilderV3<DisableResponse, DisableResponse.Builder, DisableResponseOrBuilder> disableResponseBuilder_;
            private DisableResponse disableResponse_;
            private SingleFieldBuilderV3<MovementAlertNotification, MovementAlertNotification.Builder, MovementAlertNotificationOrBuilder> movementAlertNotificationBuilder_;
            private MovementAlertNotification movementAlertNotification_;
            private SingleFieldBuilderV3<ResetPINRequest, ResetPINRequest.Builder, ResetPINRequestOrBuilder> resetPinRequestBuilder_;
            private ResetPINRequest resetPinRequest_;
            private SingleFieldBuilderV3<ResetPINResponse, ResetPINResponse.Builder, ResetPINResponseOrBuilder> resetPinResponseBuilder_;
            private ResetPINResponse resetPinResponse_;
            private SingleFieldBuilderV3<SettingChangeRequest, SettingChangeRequest.Builder, SettingChangeRequestOrBuilder> settingChangeRequestBuilder_;
            private SettingChangeRequest settingChangeRequest_;
            private SingleFieldBuilderV3<SettingChangeResponse, SettingChangeResponse.Builder, SettingChangeResponseOrBuilder> settingChangeResponseBuilder_;
            private SettingChangeResponse settingChangeResponse_;
            private SingleFieldBuilderV3<SettingRequest, SettingRequest.Builder, SettingRequestOrBuilder> settingRequestBuilder_;
            private SettingRequest settingRequest_;
            private SingleFieldBuilderV3<SettingResponse, SettingResponse.Builder, SettingResponseOrBuilder> settingResponseBuilder_;
            private SettingResponse settingResponse_;
            private SingleFieldBuilderV3<TriggerRequest, TriggerRequest.Builder, TriggerRequestOrBuilder> triggerRequestBuilder_;
            private TriggerRequest triggerRequest_;
            private SingleFieldBuilderV3<TriggerResponse, TriggerResponse.Builder, TriggerResponseOrBuilder> triggerResponseBuilder_;
            private TriggerResponse triggerResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(AntiTheftAlarmService antiTheftAlarmService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<SettingChangeRequest, SettingChangeRequest.Builder, SettingChangeRequestOrBuilder> singleFieldBuilderV3 = this.settingChangeRequestBuilder_;
                    antiTheftAlarmService.settingChangeRequest_ = singleFieldBuilderV3 == null ? this.settingChangeRequest_ : (SettingChangeRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<SettingChangeResponse, SettingChangeResponse.Builder, SettingChangeResponseOrBuilder> singleFieldBuilderV4 = this.settingChangeResponseBuilder_;
                    antiTheftAlarmService.settingChangeResponse_ = singleFieldBuilderV4 == null ? this.settingChangeResponse_ : (SettingChangeResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<TriggerRequest, TriggerRequest.Builder, TriggerRequestOrBuilder> singleFieldBuilderV5 = this.triggerRequestBuilder_;
                    antiTheftAlarmService.triggerRequest_ = singleFieldBuilderV5 == null ? this.triggerRequest_ : (TriggerRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<TriggerResponse, TriggerResponse.Builder, TriggerResponseOrBuilder> singleFieldBuilderV6 = this.triggerResponseBuilder_;
                    antiTheftAlarmService.triggerResponse_ = singleFieldBuilderV6 == null ? this.triggerResponse_ : (TriggerResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<DisableRequest, DisableRequest.Builder, DisableRequestOrBuilder> singleFieldBuilderV7 = this.disableRequestBuilder_;
                    antiTheftAlarmService.disableRequest_ = singleFieldBuilderV7 == null ? this.disableRequest_ : (DisableRequest) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<DisableResponse, DisableResponse.Builder, DisableResponseOrBuilder> singleFieldBuilderV8 = this.disableResponseBuilder_;
                    antiTheftAlarmService.disableResponse_ = singleFieldBuilderV8 == null ? this.disableResponse_ : (DisableResponse) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<MovementAlertNotification, MovementAlertNotification.Builder, MovementAlertNotificationOrBuilder> singleFieldBuilderV9 = this.movementAlertNotificationBuilder_;
                    antiTheftAlarmService.movementAlertNotification_ = singleFieldBuilderV9 == null ? this.movementAlertNotification_ : (MovementAlertNotification) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<ResetPINRequest, ResetPINRequest.Builder, ResetPINRequestOrBuilder> singleFieldBuilderV10 = this.resetPinRequestBuilder_;
                    antiTheftAlarmService.resetPinRequest_ = singleFieldBuilderV10 == null ? this.resetPinRequest_ : (ResetPINRequest) singleFieldBuilderV10.build();
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    SingleFieldBuilderV3<ResetPINResponse, ResetPINResponse.Builder, ResetPINResponseOrBuilder> singleFieldBuilderV11 = this.resetPinResponseBuilder_;
                    antiTheftAlarmService.resetPinResponse_ = singleFieldBuilderV11 == null ? this.resetPinResponse_ : (ResetPINResponse) singleFieldBuilderV11.build();
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    SingleFieldBuilderV3<SettingRequest, SettingRequest.Builder, SettingRequestOrBuilder> singleFieldBuilderV12 = this.settingRequestBuilder_;
                    antiTheftAlarmService.settingRequest_ = singleFieldBuilderV12 == null ? this.settingRequest_ : (SettingRequest) singleFieldBuilderV12.build();
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    SingleFieldBuilderV3<SettingResponse, SettingResponse.Builder, SettingResponseOrBuilder> singleFieldBuilderV13 = this.settingResponseBuilder_;
                    antiTheftAlarmService.settingResponse_ = singleFieldBuilderV13 == null ? this.settingResponse_ : (SettingResponse) singleFieldBuilderV13.build();
                    i14 |= 1024;
                }
                antiTheftAlarmService.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_AntiTheftAlarmService_descriptor;
            }

            private SingleFieldBuilderV3<DisableRequest, DisableRequest.Builder, DisableRequestOrBuilder> getDisableRequestFieldBuilder() {
                if (this.disableRequestBuilder_ == null) {
                    this.disableRequestBuilder_ = new SingleFieldBuilderV3<>(getDisableRequest(), getParentForChildren(), isClean());
                    this.disableRequest_ = null;
                }
                return this.disableRequestBuilder_;
            }

            private SingleFieldBuilderV3<DisableResponse, DisableResponse.Builder, DisableResponseOrBuilder> getDisableResponseFieldBuilder() {
                if (this.disableResponseBuilder_ == null) {
                    this.disableResponseBuilder_ = new SingleFieldBuilderV3<>(getDisableResponse(), getParentForChildren(), isClean());
                    this.disableResponse_ = null;
                }
                return this.disableResponseBuilder_;
            }

            private SingleFieldBuilderV3<MovementAlertNotification, MovementAlertNotification.Builder, MovementAlertNotificationOrBuilder> getMovementAlertNotificationFieldBuilder() {
                if (this.movementAlertNotificationBuilder_ == null) {
                    this.movementAlertNotificationBuilder_ = new SingleFieldBuilderV3<>(getMovementAlertNotification(), getParentForChildren(), isClean());
                    this.movementAlertNotification_ = null;
                }
                return this.movementAlertNotificationBuilder_;
            }

            private SingleFieldBuilderV3<ResetPINRequest, ResetPINRequest.Builder, ResetPINRequestOrBuilder> getResetPinRequestFieldBuilder() {
                if (this.resetPinRequestBuilder_ == null) {
                    this.resetPinRequestBuilder_ = new SingleFieldBuilderV3<>(getResetPinRequest(), getParentForChildren(), isClean());
                    this.resetPinRequest_ = null;
                }
                return this.resetPinRequestBuilder_;
            }

            private SingleFieldBuilderV3<ResetPINResponse, ResetPINResponse.Builder, ResetPINResponseOrBuilder> getResetPinResponseFieldBuilder() {
                if (this.resetPinResponseBuilder_ == null) {
                    this.resetPinResponseBuilder_ = new SingleFieldBuilderV3<>(getResetPinResponse(), getParentForChildren(), isClean());
                    this.resetPinResponse_ = null;
                }
                return this.resetPinResponseBuilder_;
            }

            private SingleFieldBuilderV3<SettingChangeRequest, SettingChangeRequest.Builder, SettingChangeRequestOrBuilder> getSettingChangeRequestFieldBuilder() {
                if (this.settingChangeRequestBuilder_ == null) {
                    this.settingChangeRequestBuilder_ = new SingleFieldBuilderV3<>(getSettingChangeRequest(), getParentForChildren(), isClean());
                    this.settingChangeRequest_ = null;
                }
                return this.settingChangeRequestBuilder_;
            }

            private SingleFieldBuilderV3<SettingChangeResponse, SettingChangeResponse.Builder, SettingChangeResponseOrBuilder> getSettingChangeResponseFieldBuilder() {
                if (this.settingChangeResponseBuilder_ == null) {
                    this.settingChangeResponseBuilder_ = new SingleFieldBuilderV3<>(getSettingChangeResponse(), getParentForChildren(), isClean());
                    this.settingChangeResponse_ = null;
                }
                return this.settingChangeResponseBuilder_;
            }

            private SingleFieldBuilderV3<SettingRequest, SettingRequest.Builder, SettingRequestOrBuilder> getSettingRequestFieldBuilder() {
                if (this.settingRequestBuilder_ == null) {
                    this.settingRequestBuilder_ = new SingleFieldBuilderV3<>(getSettingRequest(), getParentForChildren(), isClean());
                    this.settingRequest_ = null;
                }
                return this.settingRequestBuilder_;
            }

            private SingleFieldBuilderV3<SettingResponse, SettingResponse.Builder, SettingResponseOrBuilder> getSettingResponseFieldBuilder() {
                if (this.settingResponseBuilder_ == null) {
                    this.settingResponseBuilder_ = new SingleFieldBuilderV3<>(getSettingResponse(), getParentForChildren(), isClean());
                    this.settingResponse_ = null;
                }
                return this.settingResponseBuilder_;
            }

            private SingleFieldBuilderV3<TriggerRequest, TriggerRequest.Builder, TriggerRequestOrBuilder> getTriggerRequestFieldBuilder() {
                if (this.triggerRequestBuilder_ == null) {
                    this.triggerRequestBuilder_ = new SingleFieldBuilderV3<>(getTriggerRequest(), getParentForChildren(), isClean());
                    this.triggerRequest_ = null;
                }
                return this.triggerRequestBuilder_;
            }

            private SingleFieldBuilderV3<TriggerResponse, TriggerResponse.Builder, TriggerResponseOrBuilder> getTriggerResponseFieldBuilder() {
                if (this.triggerResponseBuilder_ == null) {
                    this.triggerResponseBuilder_ = new SingleFieldBuilderV3<>(getTriggerResponse(), getParentForChildren(), isClean());
                    this.triggerResponse_ = null;
                }
                return this.triggerResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSettingChangeRequestFieldBuilder();
                    getSettingChangeResponseFieldBuilder();
                    getTriggerRequestFieldBuilder();
                    getTriggerResponseFieldBuilder();
                    getDisableRequestFieldBuilder();
                    getDisableResponseFieldBuilder();
                    getMovementAlertNotificationFieldBuilder();
                    getResetPinRequestFieldBuilder();
                    getResetPinResponseFieldBuilder();
                    getSettingRequestFieldBuilder();
                    getSettingResponseFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AntiTheftAlarmService build() {
                AntiTheftAlarmService antiTheftAlarmServiceBuildPartial = buildPartial();
                if (antiTheftAlarmServiceBuildPartial.isInitialized()) {
                    return antiTheftAlarmServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) antiTheftAlarmServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AntiTheftAlarmService buildPartial() {
                AntiTheftAlarmService antiTheftAlarmService = new AntiTheftAlarmService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(antiTheftAlarmService);
                }
                onBuilt();
                return antiTheftAlarmService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.settingChangeRequest_ = null;
                SingleFieldBuilderV3<SettingChangeRequest, SettingChangeRequest.Builder, SettingChangeRequestOrBuilder> singleFieldBuilderV3 = this.settingChangeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.settingChangeRequestBuilder_ = null;
                }
                this.settingChangeResponse_ = null;
                SingleFieldBuilderV3<SettingChangeResponse, SettingChangeResponse.Builder, SettingChangeResponseOrBuilder> singleFieldBuilderV4 = this.settingChangeResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.settingChangeResponseBuilder_ = null;
                }
                this.triggerRequest_ = null;
                SingleFieldBuilderV3<TriggerRequest, TriggerRequest.Builder, TriggerRequestOrBuilder> singleFieldBuilderV5 = this.triggerRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.triggerRequestBuilder_ = null;
                }
                this.triggerResponse_ = null;
                SingleFieldBuilderV3<TriggerResponse, TriggerResponse.Builder, TriggerResponseOrBuilder> singleFieldBuilderV6 = this.triggerResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.triggerResponseBuilder_ = null;
                }
                this.disableRequest_ = null;
                SingleFieldBuilderV3<DisableRequest, DisableRequest.Builder, DisableRequestOrBuilder> singleFieldBuilderV7 = this.disableRequestBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.disableRequestBuilder_ = null;
                }
                this.disableResponse_ = null;
                SingleFieldBuilderV3<DisableResponse, DisableResponse.Builder, DisableResponseOrBuilder> singleFieldBuilderV8 = this.disableResponseBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.disableResponseBuilder_ = null;
                }
                this.movementAlertNotification_ = null;
                SingleFieldBuilderV3<MovementAlertNotification, MovementAlertNotification.Builder, MovementAlertNotificationOrBuilder> singleFieldBuilderV9 = this.movementAlertNotificationBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.movementAlertNotificationBuilder_ = null;
                }
                this.resetPinRequest_ = null;
                SingleFieldBuilderV3<ResetPINRequest, ResetPINRequest.Builder, ResetPINRequestOrBuilder> singleFieldBuilderV10 = this.resetPinRequestBuilder_;
                if (singleFieldBuilderV10 != null) {
                    singleFieldBuilderV10.dispose();
                    this.resetPinRequestBuilder_ = null;
                }
                this.resetPinResponse_ = null;
                SingleFieldBuilderV3<ResetPINResponse, ResetPINResponse.Builder, ResetPINResponseOrBuilder> singleFieldBuilderV11 = this.resetPinResponseBuilder_;
                if (singleFieldBuilderV11 != null) {
                    singleFieldBuilderV11.dispose();
                    this.resetPinResponseBuilder_ = null;
                }
                this.settingRequest_ = null;
                SingleFieldBuilderV3<SettingRequest, SettingRequest.Builder, SettingRequestOrBuilder> singleFieldBuilderV12 = this.settingRequestBuilder_;
                if (singleFieldBuilderV12 != null) {
                    singleFieldBuilderV12.dispose();
                    this.settingRequestBuilder_ = null;
                }
                this.settingResponse_ = null;
                SingleFieldBuilderV3<SettingResponse, SettingResponse.Builder, SettingResponseOrBuilder> singleFieldBuilderV13 = this.settingResponseBuilder_;
                if (singleFieldBuilderV13 != null) {
                    singleFieldBuilderV13.dispose();
                    this.settingResponseBuilder_ = null;
                }
                return this;
            }

            public Builder clearDisableRequest() {
                this.bitField0_ &= -17;
                this.disableRequest_ = null;
                SingleFieldBuilderV3<DisableRequest, DisableRequest.Builder, DisableRequestOrBuilder> singleFieldBuilderV3 = this.disableRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.disableRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearDisableResponse() {
                this.bitField0_ &= -33;
                this.disableResponse_ = null;
                SingleFieldBuilderV3<DisableResponse, DisableResponse.Builder, DisableResponseOrBuilder> singleFieldBuilderV3 = this.disableResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.disableResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMovementAlertNotification() {
                this.bitField0_ &= -65;
                this.movementAlertNotification_ = null;
                SingleFieldBuilderV3<MovementAlertNotification, MovementAlertNotification.Builder, MovementAlertNotificationOrBuilder> singleFieldBuilderV3 = this.movementAlertNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.movementAlertNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearResetPinRequest() {
                this.bitField0_ &= -129;
                this.resetPinRequest_ = null;
                SingleFieldBuilderV3<ResetPINRequest, ResetPINRequest.Builder, ResetPINRequestOrBuilder> singleFieldBuilderV3 = this.resetPinRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.resetPinRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearResetPinResponse() {
                this.bitField0_ &= -257;
                this.resetPinResponse_ = null;
                SingleFieldBuilderV3<ResetPINResponse, ResetPINResponse.Builder, ResetPINResponseOrBuilder> singleFieldBuilderV3 = this.resetPinResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.resetPinResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSettingChangeRequest() {
                this.bitField0_ &= -2;
                this.settingChangeRequest_ = null;
                SingleFieldBuilderV3<SettingChangeRequest, SettingChangeRequest.Builder, SettingChangeRequestOrBuilder> singleFieldBuilderV3 = this.settingChangeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.settingChangeRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSettingChangeResponse() {
                this.bitField0_ &= -3;
                this.settingChangeResponse_ = null;
                SingleFieldBuilderV3<SettingChangeResponse, SettingChangeResponse.Builder, SettingChangeResponseOrBuilder> singleFieldBuilderV3 = this.settingChangeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.settingChangeResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSettingRequest() {
                this.bitField0_ &= -513;
                this.settingRequest_ = null;
                SingleFieldBuilderV3<SettingRequest, SettingRequest.Builder, SettingRequestOrBuilder> singleFieldBuilderV3 = this.settingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.settingRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSettingResponse() {
                this.bitField0_ &= -1025;
                this.settingResponse_ = null;
                SingleFieldBuilderV3<SettingResponse, SettingResponse.Builder, SettingResponseOrBuilder> singleFieldBuilderV3 = this.settingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.settingResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTriggerRequest() {
                this.bitField0_ &= -5;
                this.triggerRequest_ = null;
                SingleFieldBuilderV3<TriggerRequest, TriggerRequest.Builder, TriggerRequestOrBuilder> singleFieldBuilderV3 = this.triggerRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.triggerRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTriggerResponse() {
                this.bitField0_ &= -9;
                this.triggerResponse_ = null;
                SingleFieldBuilderV3<TriggerResponse, TriggerResponse.Builder, TriggerResponseOrBuilder> singleFieldBuilderV3 = this.triggerResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.triggerResponseBuilder_ = null;
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
                return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_AntiTheftAlarmService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
            public DisableRequest getDisableRequest() {
                SingleFieldBuilderV3<DisableRequest, DisableRequest.Builder, DisableRequestOrBuilder> singleFieldBuilderV3 = this.disableRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DisableRequest) singleFieldBuilderV3.getMessage();
                }
                DisableRequest disableRequest = this.disableRequest_;
                return disableRequest == null ? DisableRequest.getDefaultInstance() : disableRequest;
            }

            public DisableRequest.Builder getDisableRequestBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (DisableRequest.Builder) getDisableRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
            public DisableRequestOrBuilder getDisableRequestOrBuilder() {
                SingleFieldBuilderV3<DisableRequest, DisableRequest.Builder, DisableRequestOrBuilder> singleFieldBuilderV3 = this.disableRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DisableRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DisableRequest disableRequest = this.disableRequest_;
                return disableRequest == null ? DisableRequest.getDefaultInstance() : disableRequest;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
            public DisableResponse getDisableResponse() {
                SingleFieldBuilderV3<DisableResponse, DisableResponse.Builder, DisableResponseOrBuilder> singleFieldBuilderV3 = this.disableResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DisableResponse) singleFieldBuilderV3.getMessage();
                }
                DisableResponse disableResponse = this.disableResponse_;
                return disableResponse == null ? DisableResponse.getDefaultInstance() : disableResponse;
            }

            public DisableResponse.Builder getDisableResponseBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (DisableResponse.Builder) getDisableResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
            public DisableResponseOrBuilder getDisableResponseOrBuilder() {
                SingleFieldBuilderV3<DisableResponse, DisableResponse.Builder, DisableResponseOrBuilder> singleFieldBuilderV3 = this.disableResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DisableResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DisableResponse disableResponse = this.disableResponse_;
                return disableResponse == null ? DisableResponse.getDefaultInstance() : disableResponse;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
            public MovementAlertNotification getMovementAlertNotification() {
                SingleFieldBuilderV3<MovementAlertNotification, MovementAlertNotification.Builder, MovementAlertNotificationOrBuilder> singleFieldBuilderV3 = this.movementAlertNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (MovementAlertNotification) singleFieldBuilderV3.getMessage();
                }
                MovementAlertNotification movementAlertNotification = this.movementAlertNotification_;
                return movementAlertNotification == null ? MovementAlertNotification.getDefaultInstance() : movementAlertNotification;
            }

            public MovementAlertNotification.Builder getMovementAlertNotificationBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (MovementAlertNotification.Builder) getMovementAlertNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
            public MovementAlertNotificationOrBuilder getMovementAlertNotificationOrBuilder() {
                SingleFieldBuilderV3<MovementAlertNotification, MovementAlertNotification.Builder, MovementAlertNotificationOrBuilder> singleFieldBuilderV3 = this.movementAlertNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (MovementAlertNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                MovementAlertNotification movementAlertNotification = this.movementAlertNotification_;
                return movementAlertNotification == null ? MovementAlertNotification.getDefaultInstance() : movementAlertNotification;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
            public ResetPINRequest getResetPinRequest() {
                SingleFieldBuilderV3<ResetPINRequest, ResetPINRequest.Builder, ResetPINRequestOrBuilder> singleFieldBuilderV3 = this.resetPinRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ResetPINRequest) singleFieldBuilderV3.getMessage();
                }
                ResetPINRequest resetPINRequest = this.resetPinRequest_;
                return resetPINRequest == null ? ResetPINRequest.getDefaultInstance() : resetPINRequest;
            }

            public ResetPINRequest.Builder getResetPinRequestBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (ResetPINRequest.Builder) getResetPinRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
            public ResetPINRequestOrBuilder getResetPinRequestOrBuilder() {
                SingleFieldBuilderV3<ResetPINRequest, ResetPINRequest.Builder, ResetPINRequestOrBuilder> singleFieldBuilderV3 = this.resetPinRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ResetPINRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ResetPINRequest resetPINRequest = this.resetPinRequest_;
                return resetPINRequest == null ? ResetPINRequest.getDefaultInstance() : resetPINRequest;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
            public ResetPINResponse getResetPinResponse() {
                SingleFieldBuilderV3<ResetPINResponse, ResetPINResponse.Builder, ResetPINResponseOrBuilder> singleFieldBuilderV3 = this.resetPinResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ResetPINResponse) singleFieldBuilderV3.getMessage();
                }
                ResetPINResponse resetPINResponse = this.resetPinResponse_;
                return resetPINResponse == null ? ResetPINResponse.getDefaultInstance() : resetPINResponse;
            }

            public ResetPINResponse.Builder getResetPinResponseBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (ResetPINResponse.Builder) getResetPinResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
            public ResetPINResponseOrBuilder getResetPinResponseOrBuilder() {
                SingleFieldBuilderV3<ResetPINResponse, ResetPINResponse.Builder, ResetPINResponseOrBuilder> singleFieldBuilderV3 = this.resetPinResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ResetPINResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ResetPINResponse resetPINResponse = this.resetPinResponse_;
                return resetPINResponse == null ? ResetPINResponse.getDefaultInstance() : resetPINResponse;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
            public SettingChangeRequest getSettingChangeRequest() {
                SingleFieldBuilderV3<SettingChangeRequest, SettingChangeRequest.Builder, SettingChangeRequestOrBuilder> singleFieldBuilderV3 = this.settingChangeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SettingChangeRequest) singleFieldBuilderV3.getMessage();
                }
                SettingChangeRequest settingChangeRequest = this.settingChangeRequest_;
                return settingChangeRequest == null ? SettingChangeRequest.getDefaultInstance() : settingChangeRequest;
            }

            public SettingChangeRequest.Builder getSettingChangeRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SettingChangeRequest.Builder) getSettingChangeRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
            public SettingChangeRequestOrBuilder getSettingChangeRequestOrBuilder() {
                SingleFieldBuilderV3<SettingChangeRequest, SettingChangeRequest.Builder, SettingChangeRequestOrBuilder> singleFieldBuilderV3 = this.settingChangeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SettingChangeRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SettingChangeRequest settingChangeRequest = this.settingChangeRequest_;
                return settingChangeRequest == null ? SettingChangeRequest.getDefaultInstance() : settingChangeRequest;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
            public SettingChangeResponse getSettingChangeResponse() {
                SingleFieldBuilderV3<SettingChangeResponse, SettingChangeResponse.Builder, SettingChangeResponseOrBuilder> singleFieldBuilderV3 = this.settingChangeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SettingChangeResponse) singleFieldBuilderV3.getMessage();
                }
                SettingChangeResponse settingChangeResponse = this.settingChangeResponse_;
                return settingChangeResponse == null ? SettingChangeResponse.getDefaultInstance() : settingChangeResponse;
            }

            public SettingChangeResponse.Builder getSettingChangeResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (SettingChangeResponse.Builder) getSettingChangeResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
            public SettingChangeResponseOrBuilder getSettingChangeResponseOrBuilder() {
                SingleFieldBuilderV3<SettingChangeResponse, SettingChangeResponse.Builder, SettingChangeResponseOrBuilder> singleFieldBuilderV3 = this.settingChangeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SettingChangeResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SettingChangeResponse settingChangeResponse = this.settingChangeResponse_;
                return settingChangeResponse == null ? SettingChangeResponse.getDefaultInstance() : settingChangeResponse;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
            public SettingRequest getSettingRequest() {
                SingleFieldBuilderV3<SettingRequest, SettingRequest.Builder, SettingRequestOrBuilder> singleFieldBuilderV3 = this.settingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SettingRequest) singleFieldBuilderV3.getMessage();
                }
                SettingRequest settingRequest = this.settingRequest_;
                return settingRequest == null ? SettingRequest.getDefaultInstance() : settingRequest;
            }

            public SettingRequest.Builder getSettingRequestBuilder() {
                this.bitField0_ |= 512;
                onChanged();
                return (SettingRequest.Builder) getSettingRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
            public SettingRequestOrBuilder getSettingRequestOrBuilder() {
                SingleFieldBuilderV3<SettingRequest, SettingRequest.Builder, SettingRequestOrBuilder> singleFieldBuilderV3 = this.settingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SettingRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SettingRequest settingRequest = this.settingRequest_;
                return settingRequest == null ? SettingRequest.getDefaultInstance() : settingRequest;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
            public SettingResponse getSettingResponse() {
                SingleFieldBuilderV3<SettingResponse, SettingResponse.Builder, SettingResponseOrBuilder> singleFieldBuilderV3 = this.settingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SettingResponse) singleFieldBuilderV3.getMessage();
                }
                SettingResponse settingResponse = this.settingResponse_;
                return settingResponse == null ? SettingResponse.getDefaultInstance() : settingResponse;
            }

            public SettingResponse.Builder getSettingResponseBuilder() {
                this.bitField0_ |= 1024;
                onChanged();
                return (SettingResponse.Builder) getSettingResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
            public SettingResponseOrBuilder getSettingResponseOrBuilder() {
                SingleFieldBuilderV3<SettingResponse, SettingResponse.Builder, SettingResponseOrBuilder> singleFieldBuilderV3 = this.settingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SettingResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SettingResponse settingResponse = this.settingResponse_;
                return settingResponse == null ? SettingResponse.getDefaultInstance() : settingResponse;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
            public TriggerRequest getTriggerRequest() {
                SingleFieldBuilderV3<TriggerRequest, TriggerRequest.Builder, TriggerRequestOrBuilder> singleFieldBuilderV3 = this.triggerRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TriggerRequest) singleFieldBuilderV3.getMessage();
                }
                TriggerRequest triggerRequest = this.triggerRequest_;
                return triggerRequest == null ? TriggerRequest.getDefaultInstance() : triggerRequest;
            }

            public TriggerRequest.Builder getTriggerRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (TriggerRequest.Builder) getTriggerRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
            public TriggerRequestOrBuilder getTriggerRequestOrBuilder() {
                SingleFieldBuilderV3<TriggerRequest, TriggerRequest.Builder, TriggerRequestOrBuilder> singleFieldBuilderV3 = this.triggerRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TriggerRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TriggerRequest triggerRequest = this.triggerRequest_;
                return triggerRequest == null ? TriggerRequest.getDefaultInstance() : triggerRequest;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
            public TriggerResponse getTriggerResponse() {
                SingleFieldBuilderV3<TriggerResponse, TriggerResponse.Builder, TriggerResponseOrBuilder> singleFieldBuilderV3 = this.triggerResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TriggerResponse) singleFieldBuilderV3.getMessage();
                }
                TriggerResponse triggerResponse = this.triggerResponse_;
                return triggerResponse == null ? TriggerResponse.getDefaultInstance() : triggerResponse;
            }

            public TriggerResponse.Builder getTriggerResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (TriggerResponse.Builder) getTriggerResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
            public TriggerResponseOrBuilder getTriggerResponseOrBuilder() {
                SingleFieldBuilderV3<TriggerResponse, TriggerResponse.Builder, TriggerResponseOrBuilder> singleFieldBuilderV3 = this.triggerResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TriggerResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TriggerResponse triggerResponse = this.triggerResponse_;
                return triggerResponse == null ? TriggerResponse.getDefaultInstance() : triggerResponse;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
            public boolean hasDisableRequest() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
            public boolean hasDisableResponse() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
            public boolean hasMovementAlertNotification() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
            public boolean hasResetPinRequest() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
            public boolean hasResetPinResponse() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
            public boolean hasSettingChangeRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
            public boolean hasSettingChangeResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
            public boolean hasSettingRequest() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
            public boolean hasSettingResponse() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
            public boolean hasTriggerRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.AntiTheftAlarmServiceOrBuilder
            public boolean hasTriggerResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_AntiTheftAlarmService_fieldAccessorTable.ensureFieldAccessorsInitialized(AntiTheftAlarmService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasSettingChangeResponse() && !getSettingChangeResponse().isInitialized()) {
                    return false;
                }
                if (hasTriggerResponse() && !getTriggerResponse().isInitialized()) {
                    return false;
                }
                if (!hasDisableResponse() || getDisableResponse().isInitialized()) {
                    return !hasResetPinResponse() || getResetPinResponse().isInitialized();
                }
                return false;
            }

            public Builder mergeDisableRequest(DisableRequest disableRequest) {
                DisableRequest disableRequest2;
                SingleFieldBuilderV3<DisableRequest, DisableRequest.Builder, DisableRequestOrBuilder> singleFieldBuilderV3 = this.disableRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(disableRequest);
                } else if ((this.bitField0_ & 16) == 0 || (disableRequest2 = this.disableRequest_) == null || disableRequest2 == DisableRequest.getDefaultInstance()) {
                    this.disableRequest_ = disableRequest;
                } else {
                    getDisableRequestBuilder().mergeFrom(disableRequest);
                }
                if (this.disableRequest_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeDisableResponse(DisableResponse disableResponse) {
                DisableResponse disableResponse2;
                SingleFieldBuilderV3<DisableResponse, DisableResponse.Builder, DisableResponseOrBuilder> singleFieldBuilderV3 = this.disableResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(disableResponse);
                } else if ((this.bitField0_ & 32) == 0 || (disableResponse2 = this.disableResponse_) == null || disableResponse2 == DisableResponse.getDefaultInstance()) {
                    this.disableResponse_ = disableResponse;
                } else {
                    getDisableResponseBuilder().mergeFrom(disableResponse);
                }
                if (this.disableResponse_ != null) {
                    this.bitField0_ |= 32;
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
                            switch (tag) {
                                case 0:
                                    break;
                                case 10:
                                    codedInputStream.readMessage(getSettingChangeRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                    continue;
                                case 18:
                                    codedInputStream.readMessage(getTriggerRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                    continue;
                                case 26:
                                    codedInputStream.readMessage(getTriggerResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                    continue;
                                case 34:
                                    codedInputStream.readMessage(getDisableRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                    continue;
                                case 42:
                                    codedInputStream.readMessage(getDisableResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                    continue;
                                case 50:
                                    codedInputStream.readMessage(getMovementAlertNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                    continue;
                                case 58:
                                    codedInputStream.readMessage(getResetPinRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
                                    continue;
                                case 66:
                                    codedInputStream.readMessage(getResetPinResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 256;
                                    continue;
                                case 74:
                                    codedInputStream.readMessage(getSettingRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 512;
                                    continue;
                                case 82:
                                    codedInputStream.readMessage(getSettingResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1024;
                                    continue;
                                case 90:
                                    codedInputStream.readMessage(getSettingChangeResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
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

            public Builder mergeMovementAlertNotification(MovementAlertNotification movementAlertNotification) {
                MovementAlertNotification movementAlertNotification2;
                SingleFieldBuilderV3<MovementAlertNotification, MovementAlertNotification.Builder, MovementAlertNotificationOrBuilder> singleFieldBuilderV3 = this.movementAlertNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(movementAlertNotification);
                } else if ((this.bitField0_ & 64) == 0 || (movementAlertNotification2 = this.movementAlertNotification_) == null || movementAlertNotification2 == MovementAlertNotification.getDefaultInstance()) {
                    this.movementAlertNotification_ = movementAlertNotification;
                } else {
                    getMovementAlertNotificationBuilder().mergeFrom(movementAlertNotification);
                }
                if (this.movementAlertNotification_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeResetPinRequest(ResetPINRequest resetPINRequest) {
                ResetPINRequest resetPINRequest2;
                SingleFieldBuilderV3<ResetPINRequest, ResetPINRequest.Builder, ResetPINRequestOrBuilder> singleFieldBuilderV3 = this.resetPinRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(resetPINRequest);
                } else if ((this.bitField0_ & 128) == 0 || (resetPINRequest2 = this.resetPinRequest_) == null || resetPINRequest2 == ResetPINRequest.getDefaultInstance()) {
                    this.resetPinRequest_ = resetPINRequest;
                } else {
                    getResetPinRequestBuilder().mergeFrom(resetPINRequest);
                }
                if (this.resetPinRequest_ != null) {
                    this.bitField0_ |= 128;
                    onChanged();
                }
                return this;
            }

            public Builder mergeResetPinResponse(ResetPINResponse resetPINResponse) {
                ResetPINResponse resetPINResponse2;
                SingleFieldBuilderV3<ResetPINResponse, ResetPINResponse.Builder, ResetPINResponseOrBuilder> singleFieldBuilderV3 = this.resetPinResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(resetPINResponse);
                } else if ((this.bitField0_ & 256) == 0 || (resetPINResponse2 = this.resetPinResponse_) == null || resetPINResponse2 == ResetPINResponse.getDefaultInstance()) {
                    this.resetPinResponse_ = resetPINResponse;
                } else {
                    getResetPinResponseBuilder().mergeFrom(resetPINResponse);
                }
                if (this.resetPinResponse_ != null) {
                    this.bitField0_ |= 256;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSettingChangeRequest(SettingChangeRequest settingChangeRequest) {
                SettingChangeRequest settingChangeRequest2;
                SingleFieldBuilderV3<SettingChangeRequest, SettingChangeRequest.Builder, SettingChangeRequestOrBuilder> singleFieldBuilderV3 = this.settingChangeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(settingChangeRequest);
                } else if ((this.bitField0_ & 1) == 0 || (settingChangeRequest2 = this.settingChangeRequest_) == null || settingChangeRequest2 == SettingChangeRequest.getDefaultInstance()) {
                    this.settingChangeRequest_ = settingChangeRequest;
                } else {
                    getSettingChangeRequestBuilder().mergeFrom(settingChangeRequest);
                }
                if (this.settingChangeRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSettingChangeResponse(SettingChangeResponse settingChangeResponse) {
                SettingChangeResponse settingChangeResponse2;
                SingleFieldBuilderV3<SettingChangeResponse, SettingChangeResponse.Builder, SettingChangeResponseOrBuilder> singleFieldBuilderV3 = this.settingChangeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(settingChangeResponse);
                } else if ((this.bitField0_ & 2) == 0 || (settingChangeResponse2 = this.settingChangeResponse_) == null || settingChangeResponse2 == SettingChangeResponse.getDefaultInstance()) {
                    this.settingChangeResponse_ = settingChangeResponse;
                } else {
                    getSettingChangeResponseBuilder().mergeFrom(settingChangeResponse);
                }
                if (this.settingChangeResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSettingRequest(SettingRequest settingRequest) {
                SettingRequest settingRequest2;
                SingleFieldBuilderV3<SettingRequest, SettingRequest.Builder, SettingRequestOrBuilder> singleFieldBuilderV3 = this.settingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(settingRequest);
                } else if ((this.bitField0_ & 512) == 0 || (settingRequest2 = this.settingRequest_) == null || settingRequest2 == SettingRequest.getDefaultInstance()) {
                    this.settingRequest_ = settingRequest;
                } else {
                    getSettingRequestBuilder().mergeFrom(settingRequest);
                }
                if (this.settingRequest_ != null) {
                    this.bitField0_ |= 512;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSettingResponse(SettingResponse settingResponse) {
                SettingResponse settingResponse2;
                SingleFieldBuilderV3<SettingResponse, SettingResponse.Builder, SettingResponseOrBuilder> singleFieldBuilderV3 = this.settingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(settingResponse);
                } else if ((this.bitField0_ & 1024) == 0 || (settingResponse2 = this.settingResponse_) == null || settingResponse2 == SettingResponse.getDefaultInstance()) {
                    this.settingResponse_ = settingResponse;
                } else {
                    getSettingResponseBuilder().mergeFrom(settingResponse);
                }
                if (this.settingResponse_ != null) {
                    this.bitField0_ |= 1024;
                    onChanged();
                }
                return this;
            }

            public Builder mergeTriggerRequest(TriggerRequest triggerRequest) {
                TriggerRequest triggerRequest2;
                SingleFieldBuilderV3<TriggerRequest, TriggerRequest.Builder, TriggerRequestOrBuilder> singleFieldBuilderV3 = this.triggerRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(triggerRequest);
                } else if ((this.bitField0_ & 4) == 0 || (triggerRequest2 = this.triggerRequest_) == null || triggerRequest2 == TriggerRequest.getDefaultInstance()) {
                    this.triggerRequest_ = triggerRequest;
                } else {
                    getTriggerRequestBuilder().mergeFrom(triggerRequest);
                }
                if (this.triggerRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeTriggerResponse(TriggerResponse triggerResponse) {
                TriggerResponse triggerResponse2;
                SingleFieldBuilderV3<TriggerResponse, TriggerResponse.Builder, TriggerResponseOrBuilder> singleFieldBuilderV3 = this.triggerResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(triggerResponse);
                } else if ((this.bitField0_ & 8) == 0 || (triggerResponse2 = this.triggerResponse_) == null || triggerResponse2 == TriggerResponse.getDefaultInstance()) {
                    this.triggerResponse_ = triggerResponse;
                } else {
                    getTriggerResponseBuilder().mergeFrom(triggerResponse);
                }
                if (this.triggerResponse_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setDisableRequest(DisableRequest.Builder builder) {
                SingleFieldBuilderV3<DisableRequest, DisableRequest.Builder, DisableRequestOrBuilder> singleFieldBuilderV3 = this.disableRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.disableRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setDisableResponse(DisableResponse.Builder builder) {
                SingleFieldBuilderV3<DisableResponse, DisableResponse.Builder, DisableResponseOrBuilder> singleFieldBuilderV3 = this.disableResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.disableResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setMovementAlertNotification(MovementAlertNotification.Builder builder) {
                SingleFieldBuilderV3<MovementAlertNotification, MovementAlertNotification.Builder, MovementAlertNotificationOrBuilder> singleFieldBuilderV3 = this.movementAlertNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.movementAlertNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setResetPinRequest(ResetPINRequest.Builder builder) {
                SingleFieldBuilderV3<ResetPINRequest, ResetPINRequest.Builder, ResetPINRequestOrBuilder> singleFieldBuilderV3 = this.resetPinRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.resetPinRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setResetPinResponse(ResetPINResponse.Builder builder) {
                SingleFieldBuilderV3<ResetPINResponse, ResetPINResponse.Builder, ResetPINResponseOrBuilder> singleFieldBuilderV3 = this.resetPinResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.resetPinResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setSettingChangeRequest(SettingChangeRequest.Builder builder) {
                SingleFieldBuilderV3<SettingChangeRequest, SettingChangeRequest.Builder, SettingChangeRequestOrBuilder> singleFieldBuilderV3 = this.settingChangeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.settingChangeRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSettingChangeResponse(SettingChangeResponse.Builder builder) {
                SingleFieldBuilderV3<SettingChangeResponse, SettingChangeResponse.Builder, SettingChangeResponseOrBuilder> singleFieldBuilderV3 = this.settingChangeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.settingChangeResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSettingRequest(SettingRequest.Builder builder) {
                SingleFieldBuilderV3<SettingRequest, SettingRequest.Builder, SettingRequestOrBuilder> singleFieldBuilderV3 = this.settingRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.settingRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setSettingResponse(SettingResponse.Builder builder) {
                SingleFieldBuilderV3<SettingResponse, SettingResponse.Builder, SettingResponseOrBuilder> singleFieldBuilderV3 = this.settingResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.settingResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setTriggerRequest(TriggerRequest.Builder builder) {
                SingleFieldBuilderV3<TriggerRequest, TriggerRequest.Builder, TriggerRequestOrBuilder> singleFieldBuilderV3 = this.triggerRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.triggerRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setTriggerResponse(TriggerResponse.Builder builder) {
                SingleFieldBuilderV3<TriggerResponse, TriggerResponse.Builder, TriggerResponseOrBuilder> singleFieldBuilderV3 = this.triggerResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.triggerResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AntiTheftAlarmService getDefaultInstanceForType() {
                return AntiTheftAlarmService.getDefaultInstance();
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

            public Builder setDisableRequest(DisableRequest disableRequest) {
                SingleFieldBuilderV3<DisableRequest, DisableRequest.Builder, DisableRequestOrBuilder> singleFieldBuilderV3 = this.disableRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    disableRequest.getClass();
                    this.disableRequest_ = disableRequest;
                } else {
                    singleFieldBuilderV3.setMessage(disableRequest);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setDisableResponse(DisableResponse disableResponse) {
                SingleFieldBuilderV3<DisableResponse, DisableResponse.Builder, DisableResponseOrBuilder> singleFieldBuilderV3 = this.disableResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    disableResponse.getClass();
                    this.disableResponse_ = disableResponse;
                } else {
                    singleFieldBuilderV3.setMessage(disableResponse);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setMovementAlertNotification(MovementAlertNotification movementAlertNotification) {
                SingleFieldBuilderV3<MovementAlertNotification, MovementAlertNotification.Builder, MovementAlertNotificationOrBuilder> singleFieldBuilderV3 = this.movementAlertNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    movementAlertNotification.getClass();
                    this.movementAlertNotification_ = movementAlertNotification;
                } else {
                    singleFieldBuilderV3.setMessage(movementAlertNotification);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setResetPinRequest(ResetPINRequest resetPINRequest) {
                SingleFieldBuilderV3<ResetPINRequest, ResetPINRequest.Builder, ResetPINRequestOrBuilder> singleFieldBuilderV3 = this.resetPinRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    resetPINRequest.getClass();
                    this.resetPinRequest_ = resetPINRequest;
                } else {
                    singleFieldBuilderV3.setMessage(resetPINRequest);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setResetPinResponse(ResetPINResponse resetPINResponse) {
                SingleFieldBuilderV3<ResetPINResponse, ResetPINResponse.Builder, ResetPINResponseOrBuilder> singleFieldBuilderV3 = this.resetPinResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    resetPINResponse.getClass();
                    this.resetPinResponse_ = resetPINResponse;
                } else {
                    singleFieldBuilderV3.setMessage(resetPINResponse);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setSettingChangeRequest(SettingChangeRequest settingChangeRequest) {
                SingleFieldBuilderV3<SettingChangeRequest, SettingChangeRequest.Builder, SettingChangeRequestOrBuilder> singleFieldBuilderV3 = this.settingChangeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    settingChangeRequest.getClass();
                    this.settingChangeRequest_ = settingChangeRequest;
                } else {
                    singleFieldBuilderV3.setMessage(settingChangeRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSettingChangeResponse(SettingChangeResponse settingChangeResponse) {
                SingleFieldBuilderV3<SettingChangeResponse, SettingChangeResponse.Builder, SettingChangeResponseOrBuilder> singleFieldBuilderV3 = this.settingChangeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    settingChangeResponse.getClass();
                    this.settingChangeResponse_ = settingChangeResponse;
                } else {
                    singleFieldBuilderV3.setMessage(settingChangeResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setSettingRequest(SettingRequest settingRequest) {
                SingleFieldBuilderV3<SettingRequest, SettingRequest.Builder, SettingRequestOrBuilder> singleFieldBuilderV3 = this.settingRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    settingRequest.getClass();
                    this.settingRequest_ = settingRequest;
                } else {
                    singleFieldBuilderV3.setMessage(settingRequest);
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setSettingResponse(SettingResponse settingResponse) {
                SingleFieldBuilderV3<SettingResponse, SettingResponse.Builder, SettingResponseOrBuilder> singleFieldBuilderV3 = this.settingResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    settingResponse.getClass();
                    this.settingResponse_ = settingResponse;
                } else {
                    singleFieldBuilderV3.setMessage(settingResponse);
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setTriggerRequest(TriggerRequest triggerRequest) {
                SingleFieldBuilderV3<TriggerRequest, TriggerRequest.Builder, TriggerRequestOrBuilder> singleFieldBuilderV3 = this.triggerRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    triggerRequest.getClass();
                    this.triggerRequest_ = triggerRequest;
                } else {
                    singleFieldBuilderV3.setMessage(triggerRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setTriggerResponse(TriggerResponse triggerResponse) {
                SingleFieldBuilderV3<TriggerResponse, TriggerResponse.Builder, TriggerResponseOrBuilder> singleFieldBuilderV3 = this.triggerResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    triggerResponse.getClass();
                    this.triggerResponse_ = triggerResponse;
                } else {
                    singleFieldBuilderV3.setMessage(triggerResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AntiTheftAlarmService) {
                    return mergeFrom((AntiTheftAlarmService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AntiTheftAlarmService antiTheftAlarmService) {
                if (antiTheftAlarmService == AntiTheftAlarmService.getDefaultInstance()) {
                    return this;
                }
                if (antiTheftAlarmService.hasSettingChangeRequest()) {
                    mergeSettingChangeRequest(antiTheftAlarmService.getSettingChangeRequest());
                }
                if (antiTheftAlarmService.hasSettingChangeResponse()) {
                    mergeSettingChangeResponse(antiTheftAlarmService.getSettingChangeResponse());
                }
                if (antiTheftAlarmService.hasTriggerRequest()) {
                    mergeTriggerRequest(antiTheftAlarmService.getTriggerRequest());
                }
                if (antiTheftAlarmService.hasTriggerResponse()) {
                    mergeTriggerResponse(antiTheftAlarmService.getTriggerResponse());
                }
                if (antiTheftAlarmService.hasDisableRequest()) {
                    mergeDisableRequest(antiTheftAlarmService.getDisableRequest());
                }
                if (antiTheftAlarmService.hasDisableResponse()) {
                    mergeDisableResponse(antiTheftAlarmService.getDisableResponse());
                }
                if (antiTheftAlarmService.hasMovementAlertNotification()) {
                    mergeMovementAlertNotification(antiTheftAlarmService.getMovementAlertNotification());
                }
                if (antiTheftAlarmService.hasResetPinRequest()) {
                    mergeResetPinRequest(antiTheftAlarmService.getResetPinRequest());
                }
                if (antiTheftAlarmService.hasResetPinResponse()) {
                    mergeResetPinResponse(antiTheftAlarmService.getResetPinResponse());
                }
                if (antiTheftAlarmService.hasSettingRequest()) {
                    mergeSettingRequest(antiTheftAlarmService.getSettingRequest());
                }
                if (antiTheftAlarmService.hasSettingResponse()) {
                    mergeSettingResponse(antiTheftAlarmService.getSettingResponse());
                }
                mergeUnknownFields(antiTheftAlarmService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AntiTheftAlarmService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ AntiTheftAlarmService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private AntiTheftAlarmService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AntiTheftAlarmService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AntiTheftAlarmService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AntiTheftAlarmService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AntiTheftAlarmService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AntiTheftAlarmService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AntiTheftAlarmService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AntiTheftAlarmService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AntiTheftAlarmService parseFrom(InputStream inputStream) {
            return (AntiTheftAlarmService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AntiTheftAlarmService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AntiTheftAlarmService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AntiTheftAlarmService parseFrom(CodedInputStream codedInputStream) {
            return (AntiTheftAlarmService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AntiTheftAlarmService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AntiTheftAlarmService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class DisableResponse extends GeneratedMessageV3 implements DisableResponseOrBuilder {
        private static final DisableResponse DEFAULT_INSTANCE = new DisableResponse();

        @Deprecated
        public static final Parser<DisableResponse> PARSER = new AbstractParser<DisableResponse>() { // from class: com.garmin.proto.generated.GDIAntiTheftAlarmProto.DisableResponse.1
            @Override // com.google.protobuf.Parser
            public DisableResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DisableResponse.newBuilder();
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
        public static final int RESPONSE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int response_;

        private DisableResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.response_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DisableResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_DisableResponse_descriptor;
        }

        public static Builder newBuilder(DisableResponse disableResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(disableResponse);
        }

        public static DisableResponse parseDelimitedFrom(InputStream inputStream) {
            return (DisableResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DisableResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DisableResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DisableResponse)) {
                return super.equals(obj);
            }
            DisableResponse disableResponse = (DisableResponse) obj;
            if (hasResponse() != disableResponse.hasResponse()) {
                return false;
            }
            return (!hasResponse() || this.response_ == disableResponse.response_) && getUnknownFields().equals(disableResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DisableResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.DisableResponseOrBuilder
        public Response getResponse() {
            Response responseForNumber = Response.forNumber(this.response_);
            return responseForNumber == null ? Response.ERROR : responseForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.response_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.DisableResponseOrBuilder
        public boolean hasResponse() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasResponse()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.response_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_DisableResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(DisableResponse.class, Builder.class);
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
            if (hasResponse()) {
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
            return new DisableResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.response_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DisableResponseOrBuilder {
            private int bitField0_;
            private int response_;

            private Builder() {
                this.response_ = 0;
            }

            private void buildPartial0(DisableResponse disableResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    disableResponse.response_ = this.response_;
                } else {
                    i14 = 0;
                }
                disableResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_DisableResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DisableResponse build() {
                DisableResponse disableResponseBuildPartial = buildPartial();
                if (disableResponseBuildPartial.isInitialized()) {
                    return disableResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) disableResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DisableResponse buildPartial() {
                DisableResponse disableResponse = new DisableResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(disableResponse);
                }
                onBuilt();
                return disableResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.response_ = 0;
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

            public Builder clearResponse() {
                this.bitField0_ &= -2;
                this.response_ = 0;
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
                return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_DisableResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.DisableResponseOrBuilder
            public Response getResponse() {
                Response responseForNumber = Response.forNumber(this.response_);
                return responseForNumber == null ? Response.ERROR : responseForNumber;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.DisableResponseOrBuilder
            public boolean hasResponse() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_DisableResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(DisableResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasResponse();
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
                                    if (Response.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.response_ = i14;
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

            public Builder setResponse(Response response) {
                response.getClass();
                this.bitField0_ |= 1;
                this.response_ = response.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public DisableResponse getDefaultInstanceForType() {
                return DisableResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.response_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DisableResponse) {
                    return mergeFrom((DisableResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DisableResponse disableResponse) {
                if (disableResponse == DisableResponse.getDefaultInstance()) {
                    return this;
                }
                if (disableResponse.hasResponse()) {
                    setResponse(disableResponse.getResponse());
                }
                mergeUnknownFields(disableResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DisableResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DisableResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DisableResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DisableResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ DisableResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DisableResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private DisableResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.response_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DisableResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DisableResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DisableResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DisableResponse parseFrom(InputStream inputStream) {
            return (DisableResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DisableResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DisableResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DisableResponse parseFrom(CodedInputStream codedInputStream) {
            return (DisableResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DisableResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DisableResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Response implements ProtocolMessageEnum {
            ERROR(0),
            SUCCESS(1),
            ERROR_ALREADY_CANCELLED(2);

            public static final int ERROR_ALREADY_CANCELLED_VALUE = 2;
            public static final int ERROR_VALUE = 0;
            public static final int SUCCESS_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<Response> internalValueMap = new Internal.EnumLiteMap<Response>() { // from class: com.garmin.proto.generated.GDIAntiTheftAlarmProto.DisableResponse.Response.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Response findValueByNumber(int i14) {
                    return Response.forNumber(i14);
                }
            };
            private static final Response[] VALUES = values();

            Response(int i14) {
                this.value = i14;
            }

            public static Response forNumber(int i14) {
                if (i14 == 0) {
                    return ERROR;
                }
                if (i14 == 1) {
                    return SUCCESS;
                }
                if (i14 != 2) {
                    return null;
                }
                return ERROR_ALREADY_CANCELLED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return DisableResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Response> internalGetValueMap() {
                return internalValueMap;
            }

            public static Response valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Response valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class ResetPINResponse extends GeneratedMessageV3 implements ResetPINResponseOrBuilder {
        private static final ResetPINResponse DEFAULT_INSTANCE = new ResetPINResponse();

        @Deprecated
        public static final Parser<ResetPINResponse> PARSER = new AbstractParser<ResetPINResponse>() { // from class: com.garmin.proto.generated.GDIAntiTheftAlarmProto.ResetPINResponse.1
            @Override // com.google.protobuf.Parser
            public ResetPINResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ResetPINResponse.newBuilder();
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
        public static final int RESPONSE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int response_;

        private ResetPINResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.response_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ResetPINResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_ResetPINResponse_descriptor;
        }

        public static Builder newBuilder(ResetPINResponse resetPINResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(resetPINResponse);
        }

        public static ResetPINResponse parseDelimitedFrom(InputStream inputStream) {
            return (ResetPINResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ResetPINResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ResetPINResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ResetPINResponse)) {
                return super.equals(obj);
            }
            ResetPINResponse resetPINResponse = (ResetPINResponse) obj;
            if (hasResponse() != resetPINResponse.hasResponse()) {
                return false;
            }
            return (!hasResponse() || this.response_ == resetPINResponse.response_) && getUnknownFields().equals(resetPINResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ResetPINResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.ResetPINResponseOrBuilder
        public Response getResponse() {
            Response responseForNumber = Response.forNumber(this.response_);
            return responseForNumber == null ? Response.ERROR : responseForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.response_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.ResetPINResponseOrBuilder
        public boolean hasResponse() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasResponse()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.response_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_ResetPINResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ResetPINResponse.class, Builder.class);
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
            if (hasResponse()) {
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
            return new ResetPINResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.response_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ResetPINResponseOrBuilder {
            private int bitField0_;
            private int response_;

            private Builder() {
                this.response_ = 0;
            }

            private void buildPartial0(ResetPINResponse resetPINResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    resetPINResponse.response_ = this.response_;
                } else {
                    i14 = 0;
                }
                resetPINResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_ResetPINResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ResetPINResponse build() {
                ResetPINResponse resetPINResponseBuildPartial = buildPartial();
                if (resetPINResponseBuildPartial.isInitialized()) {
                    return resetPINResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) resetPINResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ResetPINResponse buildPartial() {
                ResetPINResponse resetPINResponse = new ResetPINResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(resetPINResponse);
                }
                onBuilt();
                return resetPINResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.response_ = 0;
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

            public Builder clearResponse() {
                this.bitField0_ &= -2;
                this.response_ = 0;
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
                return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_ResetPINResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.ResetPINResponseOrBuilder
            public Response getResponse() {
                Response responseForNumber = Response.forNumber(this.response_);
                return responseForNumber == null ? Response.ERROR : responseForNumber;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.ResetPINResponseOrBuilder
            public boolean hasResponse() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_ResetPINResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ResetPINResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasResponse();
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
                                    if (Response.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.response_ = i14;
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

            public Builder setResponse(Response response) {
                response.getClass();
                this.bitField0_ |= 1;
                this.response_ = response.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ResetPINResponse getDefaultInstanceForType() {
                return ResetPINResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.response_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ResetPINResponse) {
                    return mergeFrom((ResetPINResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ResetPINResponse resetPINResponse) {
                if (resetPINResponse == ResetPINResponse.getDefaultInstance()) {
                    return this;
                }
                if (resetPINResponse.hasResponse()) {
                    setResponse(resetPINResponse.getResponse());
                }
                mergeUnknownFields(resetPINResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ResetPINResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ResetPINResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ResetPINResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ResetPINResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ResetPINResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ResetPINResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ResetPINResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.response_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ResetPINResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ResetPINResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ResetPINResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ResetPINResponse parseFrom(InputStream inputStream) {
            return (ResetPINResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ResetPINResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ResetPINResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ResetPINResponse parseFrom(CodedInputStream codedInputStream) {
            return (ResetPINResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ResetPINResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ResetPINResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Response implements ProtocolMessageEnum {
            ERROR(0),
            SUCCESS(1);

            public static final int ERROR_VALUE = 0;
            public static final int SUCCESS_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<Response> internalValueMap = new Internal.EnumLiteMap<Response>() { // from class: com.garmin.proto.generated.GDIAntiTheftAlarmProto.ResetPINResponse.Response.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Response findValueByNumber(int i14) {
                    return Response.forNumber(i14);
                }
            };
            private static final Response[] VALUES = values();

            Response(int i14) {
                this.value = i14;
            }

            public static Response forNumber(int i14) {
                if (i14 == 0) {
                    return ERROR;
                }
                if (i14 != 1) {
                    return null;
                }
                return SUCCESS;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ResetPINResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Response> internalGetValueMap() {
                return internalValueMap;
            }

            public static Response valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Response valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class SettingChangeResponse extends GeneratedMessageV3 implements SettingChangeResponseOrBuilder {
        private static final SettingChangeResponse DEFAULT_INSTANCE = new SettingChangeResponse();

        @Deprecated
        public static final Parser<SettingChangeResponse> PARSER = new AbstractParser<SettingChangeResponse>() { // from class: com.garmin.proto.generated.GDIAntiTheftAlarmProto.SettingChangeResponse.1
            @Override // com.google.protobuf.Parser
            public SettingChangeResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SettingChangeResponse.newBuilder();
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
        public static final int RESPONSE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int response_;

        private SettingChangeResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.response_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SettingChangeResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_SettingChangeResponse_descriptor;
        }

        public static Builder newBuilder(SettingChangeResponse settingChangeResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(settingChangeResponse);
        }

        public static SettingChangeResponse parseDelimitedFrom(InputStream inputStream) {
            return (SettingChangeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SettingChangeResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SettingChangeResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SettingChangeResponse)) {
                return super.equals(obj);
            }
            SettingChangeResponse settingChangeResponse = (SettingChangeResponse) obj;
            if (hasResponse() != settingChangeResponse.hasResponse()) {
                return false;
            }
            return (!hasResponse() || this.response_ == settingChangeResponse.response_) && getUnknownFields().equals(settingChangeResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SettingChangeResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.SettingChangeResponseOrBuilder
        public Response getResponse() {
            Response responseForNumber = Response.forNumber(this.response_);
            return responseForNumber == null ? Response.ERROR : responseForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.response_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.SettingChangeResponseOrBuilder
        public boolean hasResponse() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasResponse()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.response_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_SettingChangeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SettingChangeResponse.class, Builder.class);
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
            if (hasResponse()) {
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
            return new SettingChangeResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.response_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SettingChangeResponseOrBuilder {
            private int bitField0_;
            private int response_;

            private Builder() {
                this.response_ = 0;
            }

            private void buildPartial0(SettingChangeResponse settingChangeResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    settingChangeResponse.response_ = this.response_;
                } else {
                    i14 = 0;
                }
                settingChangeResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_SettingChangeResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SettingChangeResponse build() {
                SettingChangeResponse settingChangeResponseBuildPartial = buildPartial();
                if (settingChangeResponseBuildPartial.isInitialized()) {
                    return settingChangeResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) settingChangeResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SettingChangeResponse buildPartial() {
                SettingChangeResponse settingChangeResponse = new SettingChangeResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(settingChangeResponse);
                }
                onBuilt();
                return settingChangeResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.response_ = 0;
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

            public Builder clearResponse() {
                this.bitField0_ &= -2;
                this.response_ = 0;
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
                return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_SettingChangeResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.SettingChangeResponseOrBuilder
            public Response getResponse() {
                Response responseForNumber = Response.forNumber(this.response_);
                return responseForNumber == null ? Response.ERROR : responseForNumber;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.SettingChangeResponseOrBuilder
            public boolean hasResponse() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_SettingChangeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SettingChangeResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasResponse();
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
                                    if (Response.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.response_ = i14;
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

            public Builder setResponse(Response response) {
                response.getClass();
                this.bitField0_ |= 1;
                this.response_ = response.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SettingChangeResponse getDefaultInstanceForType() {
                return SettingChangeResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.response_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SettingChangeResponse) {
                    return mergeFrom((SettingChangeResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SettingChangeResponse settingChangeResponse) {
                if (settingChangeResponse == SettingChangeResponse.getDefaultInstance()) {
                    return this;
                }
                if (settingChangeResponse.hasResponse()) {
                    setResponse(settingChangeResponse.getResponse());
                }
                mergeUnknownFields(settingChangeResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SettingChangeResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SettingChangeResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SettingChangeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SettingChangeResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ SettingChangeResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SettingChangeResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SettingChangeResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.response_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SettingChangeResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SettingChangeResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SettingChangeResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SettingChangeResponse parseFrom(InputStream inputStream) {
            return (SettingChangeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SettingChangeResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SettingChangeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SettingChangeResponse parseFrom(CodedInputStream codedInputStream) {
            return (SettingChangeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SettingChangeResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SettingChangeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Response implements ProtocolMessageEnum {
            ERROR(0),
            SUCCESS(1),
            ERROR_MODE_ALREADY_SET(2);

            public static final int ERROR_MODE_ALREADY_SET_VALUE = 2;
            public static final int ERROR_VALUE = 0;
            public static final int SUCCESS_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<Response> internalValueMap = new Internal.EnumLiteMap<Response>() { // from class: com.garmin.proto.generated.GDIAntiTheftAlarmProto.SettingChangeResponse.Response.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Response findValueByNumber(int i14) {
                    return Response.forNumber(i14);
                }
            };
            private static final Response[] VALUES = values();

            Response(int i14) {
                this.value = i14;
            }

            public static Response forNumber(int i14) {
                if (i14 == 0) {
                    return ERROR;
                }
                if (i14 == 1) {
                    return SUCCESS;
                }
                if (i14 != 2) {
                    return null;
                }
                return ERROR_MODE_ALREADY_SET;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return SettingChangeResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Response> internalGetValueMap() {
                return internalValueMap;
            }

            public static Response valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Response valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class TriggerResponse extends GeneratedMessageV3 implements TriggerResponseOrBuilder {
        private static final TriggerResponse DEFAULT_INSTANCE = new TriggerResponse();

        @Deprecated
        public static final Parser<TriggerResponse> PARSER = new AbstractParser<TriggerResponse>() { // from class: com.garmin.proto.generated.GDIAntiTheftAlarmProto.TriggerResponse.1
            @Override // com.google.protobuf.Parser
            public TriggerResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TriggerResponse.newBuilder();
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
        public static final int RESPONSE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int response_;

        private TriggerResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.response_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TriggerResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_TriggerResponse_descriptor;
        }

        public static Builder newBuilder(TriggerResponse triggerResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(triggerResponse);
        }

        public static TriggerResponse parseDelimitedFrom(InputStream inputStream) {
            return (TriggerResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TriggerResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TriggerResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TriggerResponse)) {
                return super.equals(obj);
            }
            TriggerResponse triggerResponse = (TriggerResponse) obj;
            if (hasResponse() != triggerResponse.hasResponse()) {
                return false;
            }
            return (!hasResponse() || this.response_ == triggerResponse.response_) && getUnknownFields().equals(triggerResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TriggerResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.TriggerResponseOrBuilder
        public Response getResponse() {
            Response responseForNumber = Response.forNumber(this.response_);
            return responseForNumber == null ? Response.ERROR : responseForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.response_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.TriggerResponseOrBuilder
        public boolean hasResponse() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasResponse()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.response_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_TriggerResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(TriggerResponse.class, Builder.class);
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
            if (hasResponse()) {
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
            return new TriggerResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.response_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TriggerResponseOrBuilder {
            private int bitField0_;
            private int response_;

            private Builder() {
                this.response_ = 0;
            }

            private void buildPartial0(TriggerResponse triggerResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    triggerResponse.response_ = this.response_;
                } else {
                    i14 = 0;
                }
                triggerResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_TriggerResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TriggerResponse build() {
                TriggerResponse triggerResponseBuildPartial = buildPartial();
                if (triggerResponseBuildPartial.isInitialized()) {
                    return triggerResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) triggerResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TriggerResponse buildPartial() {
                TriggerResponse triggerResponse = new TriggerResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(triggerResponse);
                }
                onBuilt();
                return triggerResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.response_ = 0;
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

            public Builder clearResponse() {
                this.bitField0_ &= -2;
                this.response_ = 0;
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
                return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_TriggerResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.TriggerResponseOrBuilder
            public Response getResponse() {
                Response responseForNumber = Response.forNumber(this.response_);
                return responseForNumber == null ? Response.ERROR : responseForNumber;
            }

            @Override // com.garmin.proto.generated.GDIAntiTheftAlarmProto.TriggerResponseOrBuilder
            public boolean hasResponse() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIAntiTheftAlarmProto.internal_static_GDI_Proto_AntiTheftAlarm_TriggerResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(TriggerResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasResponse();
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
                                    if (Response.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.response_ = i14;
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

            public Builder setResponse(Response response) {
                response.getClass();
                this.bitField0_ |= 1;
                this.response_ = response.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public TriggerResponse getDefaultInstanceForType() {
                return TriggerResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.response_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TriggerResponse) {
                    return mergeFrom((TriggerResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TriggerResponse triggerResponse) {
                if (triggerResponse == TriggerResponse.getDefaultInstance()) {
                    return this;
                }
                if (triggerResponse.hasResponse()) {
                    setResponse(triggerResponse.getResponse());
                }
                mergeUnknownFields(triggerResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TriggerResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static TriggerResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TriggerResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TriggerResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ TriggerResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static TriggerResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private TriggerResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.response_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TriggerResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TriggerResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static TriggerResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static TriggerResponse parseFrom(InputStream inputStream) {
            return (TriggerResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static TriggerResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TriggerResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TriggerResponse parseFrom(CodedInputStream codedInputStream) {
            return (TriggerResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TriggerResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TriggerResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Response implements ProtocolMessageEnum {
            ERROR(0),
            SUCCESS(1),
            ERROR_ALREADY_IN_PROGRESS(2);

            public static final int ERROR_ALREADY_IN_PROGRESS_VALUE = 2;
            public static final int ERROR_VALUE = 0;
            public static final int SUCCESS_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<Response> internalValueMap = new Internal.EnumLiteMap<Response>() { // from class: com.garmin.proto.generated.GDIAntiTheftAlarmProto.TriggerResponse.Response.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Response findValueByNumber(int i14) {
                    return Response.forNumber(i14);
                }
            };
            private static final Response[] VALUES = values();

            Response(int i14) {
                this.value = i14;
            }

            public static Response forNumber(int i14) {
                if (i14 == 0) {
                    return ERROR;
                }
                if (i14 == 1) {
                    return SUCCESS;
                }
                if (i14 != 2) {
                    return null;
                }
                return ERROR_ALREADY_IN_PROGRESS;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return TriggerResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Response> internalGetValueMap() {
                return internalValueMap;
            }

            public static Response valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Response valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
