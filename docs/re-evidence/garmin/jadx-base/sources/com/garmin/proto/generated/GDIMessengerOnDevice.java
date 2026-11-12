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
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import i3.e5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import vb.h;

/* JADX INFO: loaded from: classes6.dex */
public final class GDIMessengerOnDevice {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001aGDIMessengerOnDevice.proto\u0012\u001bGDI.Proto.MessengerOnDevice\u001a\rGDICore.proto\u001a\u0012GDIDataTypes.proto\"\u009a\u0002\n\u0018MessengerOnDeviceService\u0012M\n\u0014hermes_token_request\u0018\u0001 \u0001(\u000b2/.GDI.Proto.MessengerOnDevice.HermesTokenRequest\u0012O\n\u0015hermes_token_response\u0018\u0002 \u0001(\u000b20.GDI.Proto.MessengerOnDevice.HermesTokenResponse\u0012^\n\u001dhermes_provider_notifications\u0018\u0003 \u0001(\u000b27.GDI.Proto.MessengerOnDevice.HermesProviderNotification\"Z\n\u0012HermesTokenRequest\u0012\u0014\n\fphone_number\u0018\u0001 \u0001(\t\u0012.\n\u000binstance_id\u0018\u0002 \u0001(\u000b2\u0019.GDI.Proto.DataTypes.UUID\"¡\u0003\n\u0013HermesTokenResponse\u0012G\n\u0006status\u0018\u0001 \u0002(\u000e27.GDI.Proto.MessengerOnDevice.HermesTokenResponse.Status\u0012\u0014\n\fphone_number\u0018\u0002 \u0001(\t\u0012.\n\u000binstance_id\u0018\u0003 \u0001(\u000b2\u0019.GDI.Proto.DataTypes.UUID\u0012\u0014\n\fbearer_token\u0018\u0004 \u0001(\t\u0012\u001f\n\u0017bearer_token_expiration\u0018\u0005 \u0001(\u0007\u0012\u0015\n\rrefresh_token\u0018\u0006 \u0001(\t\u0012C\n\u000benvironment\u0018\u0007 \u0001(\u000e2..GDI.Proto.MessengerOnDevice.HermesEnvironment\"h\n\u0006Status\u0012\u0006\n\u0002OK\u0010\u0001\u0012\u0011\n\rGENERIC_ERROR\u0010\u0002\u0012\u0017\n\u0013SERVICE_UNAVAILABLE\u0010\u0003\u0012\u0011\n\rSERVICE_ERROR\u0010\u0004\u0012\u0017\n\u0013NO_INTERNET_GENERIC\u0010\u0005\"Ó\u0002\n\u001aHermesProviderNotification\u0012]\n\u000eservice_status\u0018\u0001 \u0001(\u000e2E.GDI.Proto.MessengerOnDevice.HermesProviderNotification.ServiceStatus\u0012\u001e\n\u0016hermes_token_available\u0018\u0002 \u0001(\b\u0012\u0014\n\fphone_number\u0018\u0003 \u0001(\t\u0012C\n\u000benvironment\u0018\u0004 \u0001(\u000e2..GDI.Proto.MessengerOnDevice.HermesEnvironment\"[\n\rServiceStatus\u0012\r\n\tAVAILABLE\u0010\u0001\u0012\u000f\n\u000bUNAVAILABLE\u0010\u0002\u0012\u0011\n\rSERVICE_ERROR\u0010\u0003\u0012\u0017\n\u0013NO_INTERNET_GENERIC\u0010\u0004\"Ø\u0002\n\u0013CapabilitiesRequest\u0012+\n\u001cinreach_contact_sync_support\u0018\u0001 \u0001(\b:\u0005false\u0012+\n\u001cinreach_message_sync_support\u0018\u0002 \u0001(\b:\u0005false\u0012(\n\u0019inreach_call_sync_support\u0018\u0003 \u0001(\b:\u0005false\u0012.\n\u001finreach_chat_event_sync_support\u0018\u0004 \u0001(\b:\u0005false2\u008c\u0001\n&messenger_on_device_capability_request\u0012*.GDI.Proto.Core.FeatureCapabilitiesRequest\u0018\u0014 \u0001(\u000b20.GDI.Proto.MessengerOnDevice.CapabilitiesRequest\"Ü\u0002\n\u0014CapabilitiesResponse\u0012+\n\u001cinreach_contact_sync_support\u0018\u0001 \u0001(\b:\u0005false\u0012+\n\u001cinreach_message_sync_support\u0018\u0002 \u0001(\b:\u0005false\u0012(\n\u0019inreach_call_sync_support\u0018\u0003 \u0001(\b:\u0005false\u0012.\n\u001finreach_chat_event_sync_support\u0018\u0004 \u0001(\b:\u0005false2\u008f\u0001\n'messenger_on_device_capability_response\u0012+.GDI.Proto.Core.FeatureCapabilitiesResponse\u0018\u0014 \u0001(\u000b21.GDI.Proto.MessengerOnDevice.CapabilitiesResponse*6\n\u0011HermesEnvironment\u0012\u0007\n\u0003DEV\u0010\u0001\u0012\b\n\u0004TEST\u0010\u0002\u0012\u000e\n\nPRODUCTION\u0010\u0003B4\n\u001acom.garmin.proto.generatedB\u0014GDIMessengerOnDeviceH\u0003"}, new Descriptors.FileDescriptor[]{GDICore.getDescriptor(), GDIDataTypes.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_MessengerOnDevice_CapabilitiesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_MessengerOnDevice_CapabilitiesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_MessengerOnDevice_CapabilitiesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_MessengerOnDevice_CapabilitiesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_MessengerOnDevice_HermesProviderNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_MessengerOnDevice_HermesProviderNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_MessengerOnDevice_HermesTokenRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_MessengerOnDevice_HermesTokenRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_MessengerOnDevice_HermesTokenResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_MessengerOnDevice_HermesTokenResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_MessengerOnDevice_MessengerOnDeviceService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_MessengerOnDevice_MessengerOnDeviceService_fieldAccessorTable;

    public interface CapabilitiesRequestOrBuilder extends MessageOrBuilder {
        boolean getInreachCallSyncSupport();

        boolean getInreachChatEventSyncSupport();

        boolean getInreachContactSyncSupport();

        boolean getInreachMessageSyncSupport();

        boolean hasInreachCallSyncSupport();

        boolean hasInreachChatEventSyncSupport();

        boolean hasInreachContactSyncSupport();

        boolean hasInreachMessageSyncSupport();
    }

    public interface CapabilitiesResponseOrBuilder extends MessageOrBuilder {
        boolean getInreachCallSyncSupport();

        boolean getInreachChatEventSyncSupport();

        boolean getInreachContactSyncSupport();

        boolean getInreachMessageSyncSupport();

        boolean hasInreachCallSyncSupport();

        boolean hasInreachChatEventSyncSupport();

        boolean hasInreachContactSyncSupport();

        boolean hasInreachMessageSyncSupport();
    }

    public interface HermesProviderNotificationOrBuilder extends MessageOrBuilder {
        HermesEnvironment getEnvironment();

        boolean getHermesTokenAvailable();

        String getPhoneNumber();

        ByteString getPhoneNumberBytes();

        HermesProviderNotification.ServiceStatus getServiceStatus();

        boolean hasEnvironment();

        boolean hasHermesTokenAvailable();

        boolean hasPhoneNumber();

        boolean hasServiceStatus();
    }

    public interface HermesTokenRequestOrBuilder extends MessageOrBuilder {
        GDIDataTypes.UUID getInstanceId();

        GDIDataTypes.UUIDOrBuilder getInstanceIdOrBuilder();

        String getPhoneNumber();

        ByteString getPhoneNumberBytes();

        boolean hasInstanceId();

        boolean hasPhoneNumber();
    }

    public interface HermesTokenResponseOrBuilder extends MessageOrBuilder {
        String getBearerToken();

        ByteString getBearerTokenBytes();

        int getBearerTokenExpiration();

        HermesEnvironment getEnvironment();

        GDIDataTypes.UUID getInstanceId();

        GDIDataTypes.UUIDOrBuilder getInstanceIdOrBuilder();

        String getPhoneNumber();

        ByteString getPhoneNumberBytes();

        String getRefreshToken();

        ByteString getRefreshTokenBytes();

        HermesTokenResponse.Status getStatus();

        boolean hasBearerToken();

        boolean hasBearerTokenExpiration();

        boolean hasEnvironment();

        boolean hasInstanceId();

        boolean hasPhoneNumber();

        boolean hasRefreshToken();

        boolean hasStatus();
    }

    public interface MessengerOnDeviceServiceOrBuilder extends MessageOrBuilder {
        HermesProviderNotification getHermesProviderNotifications();

        HermesProviderNotificationOrBuilder getHermesProviderNotificationsOrBuilder();

        HermesTokenRequest getHermesTokenRequest();

        HermesTokenRequestOrBuilder getHermesTokenRequestOrBuilder();

        HermesTokenResponse getHermesTokenResponse();

        HermesTokenResponseOrBuilder getHermesTokenResponseOrBuilder();

        boolean hasHermesProviderNotifications();

        boolean hasHermesTokenRequest();

        boolean hasHermesTokenResponse();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_MessengerOnDevice_MessengerOnDeviceService_descriptor = descriptor2;
        internal_static_GDI_Proto_MessengerOnDevice_MessengerOnDeviceService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"HermesTokenRequest", "HermesTokenResponse", "HermesProviderNotifications"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_MessengerOnDevice_HermesTokenRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_MessengerOnDevice_HermesTokenRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"PhoneNumber", "InstanceId"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_MessengerOnDevice_HermesTokenResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_MessengerOnDevice_HermesTokenResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Status", "PhoneNumber", "InstanceId", "BearerToken", "BearerTokenExpiration", "RefreshToken", "Environment"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_MessengerOnDevice_HermesProviderNotification_descriptor = descriptor5;
        internal_static_GDI_Proto_MessengerOnDevice_HermesProviderNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"ServiceStatus", "HermesTokenAvailable", "PhoneNumber", "Environment"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_MessengerOnDevice_CapabilitiesRequest_descriptor = descriptor6;
        internal_static_GDI_Proto_MessengerOnDevice_CapabilitiesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"InreachContactSyncSupport", "InreachMessageSyncSupport", "InreachCallSyncSupport", "InreachChatEventSyncSupport"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_MessengerOnDevice_CapabilitiesResponse_descriptor = descriptor7;
        internal_static_GDI_Proto_MessengerOnDevice_CapabilitiesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"InreachContactSyncSupport", "InreachMessageSyncSupport", "InreachCallSyncSupport", "InreachChatEventSyncSupport"});
        GDICore.getDescriptor();
        GDIDataTypes.getDescriptor();
    }

    private GDIMessengerOnDevice() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(CapabilitiesRequest.messengerOnDeviceCapabilityRequest);
        extensionRegistryLite.add(CapabilitiesResponse.messengerOnDeviceCapabilityResponse);
    }

    public static final class CapabilitiesRequest extends GeneratedMessageV3 implements CapabilitiesRequestOrBuilder {
        public static final int INREACH_CALL_SYNC_SUPPORT_FIELD_NUMBER = 3;
        public static final int INREACH_CHAT_EVENT_SYNC_SUPPORT_FIELD_NUMBER = 4;
        public static final int INREACH_CONTACT_SYNC_SUPPORT_FIELD_NUMBER = 1;
        public static final int INREACH_MESSAGE_SYNC_SUPPORT_FIELD_NUMBER = 2;
        public static final int MESSENGER_ON_DEVICE_CAPABILITY_REQUEST_FIELD_NUMBER = 20;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean inreachCallSyncSupport_;
        private boolean inreachChatEventSyncSupport_;
        private boolean inreachContactSyncSupport_;
        private boolean inreachMessageSyncSupport_;
        private byte memoizedIsInitialized;
        private static final CapabilitiesRequest DEFAULT_INSTANCE = new CapabilitiesRequest();

        @Deprecated
        public static final Parser<CapabilitiesRequest> PARSER = new AbstractParser<CapabilitiesRequest>() { // from class: com.garmin.proto.generated.GDIMessengerOnDevice.CapabilitiesRequest.1
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
        public static final GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesRequest, CapabilitiesRequest> messengerOnDeviceCapabilityRequest = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, CapabilitiesRequest.class, getDefaultInstance());

        private CapabilitiesRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.inreachContactSyncSupport_ = false;
            this.inreachMessageSyncSupport_ = false;
            this.inreachCallSyncSupport_ = false;
            this.inreachChatEventSyncSupport_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIMessengerOnDevice.internal_static_GDI_Proto_MessengerOnDevice_CapabilitiesRequest_descriptor;
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
            if (!(obj instanceof CapabilitiesRequest)) {
                return super.equals(obj);
            }
            CapabilitiesRequest capabilitiesRequest = (CapabilitiesRequest) obj;
            if (hasInreachContactSyncSupport() != capabilitiesRequest.hasInreachContactSyncSupport()) {
                return false;
            }
            if ((hasInreachContactSyncSupport() && getInreachContactSyncSupport() != capabilitiesRequest.getInreachContactSyncSupport()) || hasInreachMessageSyncSupport() != capabilitiesRequest.hasInreachMessageSyncSupport()) {
                return false;
            }
            if ((hasInreachMessageSyncSupport() && getInreachMessageSyncSupport() != capabilitiesRequest.getInreachMessageSyncSupport()) || hasInreachCallSyncSupport() != capabilitiesRequest.hasInreachCallSyncSupport()) {
                return false;
            }
            if ((!hasInreachCallSyncSupport() || getInreachCallSyncSupport() == capabilitiesRequest.getInreachCallSyncSupport()) && hasInreachChatEventSyncSupport() == capabilitiesRequest.hasInreachChatEventSyncSupport()) {
                return (!hasInreachChatEventSyncSupport() || getInreachChatEventSyncSupport() == capabilitiesRequest.getInreachChatEventSyncSupport()) && getUnknownFields().equals(capabilitiesRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.CapabilitiesRequestOrBuilder
        public boolean getInreachCallSyncSupport() {
            return this.inreachCallSyncSupport_;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.CapabilitiesRequestOrBuilder
        public boolean getInreachChatEventSyncSupport() {
            return this.inreachChatEventSyncSupport_;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.CapabilitiesRequestOrBuilder
        public boolean getInreachContactSyncSupport() {
            return this.inreachContactSyncSupport_;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.CapabilitiesRequestOrBuilder
        public boolean getInreachMessageSyncSupport() {
            return this.inreachMessageSyncSupport_;
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
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.inreachContactSyncSupport_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(2, this.inreachMessageSyncSupport_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(3, this.inreachCallSyncSupport_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(4, this.inreachChatEventSyncSupport_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBoolSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.CapabilitiesRequestOrBuilder
        public boolean hasInreachCallSyncSupport() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.CapabilitiesRequestOrBuilder
        public boolean hasInreachChatEventSyncSupport() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.CapabilitiesRequestOrBuilder
        public boolean hasInreachContactSyncSupport() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.CapabilitiesRequestOrBuilder
        public boolean hasInreachMessageSyncSupport() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasInreachContactSyncSupport()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getInreachContactSyncSupport());
            }
            if (hasInreachMessageSyncSupport()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getInreachMessageSyncSupport());
            }
            if (hasInreachCallSyncSupport()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashBoolean(getInreachCallSyncSupport());
            }
            if (hasInreachChatEventSyncSupport()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Internal.hashBoolean(getInreachChatEventSyncSupport());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIMessengerOnDevice.internal_static_GDI_Proto_MessengerOnDevice_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.inreachContactSyncSupport_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.inreachMessageSyncSupport_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(3, this.inreachCallSyncSupport_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeBool(4, this.inreachChatEventSyncSupport_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesRequestOrBuilder {
            private int bitField0_;
            private boolean inreachCallSyncSupport_;
            private boolean inreachChatEventSyncSupport_;
            private boolean inreachContactSyncSupport_;
            private boolean inreachMessageSyncSupport_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(CapabilitiesRequest capabilitiesRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    capabilitiesRequest.inreachContactSyncSupport_ = this.inreachContactSyncSupport_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    capabilitiesRequest.inreachMessageSyncSupport_ = this.inreachMessageSyncSupport_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    capabilitiesRequest.inreachCallSyncSupport_ = this.inreachCallSyncSupport_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    capabilitiesRequest.inreachChatEventSyncSupport_ = this.inreachChatEventSyncSupport_;
                    i14 |= 8;
                }
                capabilitiesRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIMessengerOnDevice.internal_static_GDI_Proto_MessengerOnDevice_CapabilitiesRequest_descriptor;
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
                if (this.bitField0_ != 0) {
                    buildPartial0(capabilitiesRequest);
                }
                onBuilt();
                return capabilitiesRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.inreachContactSyncSupport_ = false;
                this.inreachMessageSyncSupport_ = false;
                this.inreachCallSyncSupport_ = false;
                this.inreachChatEventSyncSupport_ = false;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearInreachCallSyncSupport() {
                this.bitField0_ &= -5;
                this.inreachCallSyncSupport_ = false;
                onChanged();
                return this;
            }

            public Builder clearInreachChatEventSyncSupport() {
                this.bitField0_ &= -9;
                this.inreachChatEventSyncSupport_ = false;
                onChanged();
                return this;
            }

            public Builder clearInreachContactSyncSupport() {
                this.bitField0_ &= -2;
                this.inreachContactSyncSupport_ = false;
                onChanged();
                return this;
            }

            public Builder clearInreachMessageSyncSupport() {
                this.bitField0_ &= -3;
                this.inreachMessageSyncSupport_ = false;
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
                return GDIMessengerOnDevice.internal_static_GDI_Proto_MessengerOnDevice_CapabilitiesRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.CapabilitiesRequestOrBuilder
            public boolean getInreachCallSyncSupport() {
                return this.inreachCallSyncSupport_;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.CapabilitiesRequestOrBuilder
            public boolean getInreachChatEventSyncSupport() {
                return this.inreachChatEventSyncSupport_;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.CapabilitiesRequestOrBuilder
            public boolean getInreachContactSyncSupport() {
                return this.inreachContactSyncSupport_;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.CapabilitiesRequestOrBuilder
            public boolean getInreachMessageSyncSupport() {
                return this.inreachMessageSyncSupport_;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.CapabilitiesRequestOrBuilder
            public boolean hasInreachCallSyncSupport() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.CapabilitiesRequestOrBuilder
            public boolean hasInreachChatEventSyncSupport() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.CapabilitiesRequestOrBuilder
            public boolean hasInreachContactSyncSupport() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.CapabilitiesRequestOrBuilder
            public boolean hasInreachMessageSyncSupport() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIMessengerOnDevice.internal_static_GDI_Proto_MessengerOnDevice_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
                                    this.inreachContactSyncSupport_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.inreachMessageSyncSupport_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.inreachCallSyncSupport_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.inreachChatEventSyncSupport_ = codedInputStream.readBool();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setInreachCallSyncSupport(boolean z14) {
                this.inreachCallSyncSupport_ = z14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setInreachChatEventSyncSupport(boolean z14) {
                this.inreachChatEventSyncSupport_ = z14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setInreachContactSyncSupport(boolean z14) {
                this.inreachContactSyncSupport_ = z14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setInreachMessageSyncSupport(boolean z14) {
                this.inreachMessageSyncSupport_ = z14;
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
                if (capabilitiesRequest.hasInreachContactSyncSupport()) {
                    setInreachContactSyncSupport(capabilitiesRequest.getInreachContactSyncSupport());
                }
                if (capabilitiesRequest.hasInreachMessageSyncSupport()) {
                    setInreachMessageSyncSupport(capabilitiesRequest.getInreachMessageSyncSupport());
                }
                if (capabilitiesRequest.hasInreachCallSyncSupport()) {
                    setInreachCallSyncSupport(capabilitiesRequest.getInreachCallSyncSupport());
                }
                if (capabilitiesRequest.hasInreachChatEventSyncSupport()) {
                    setInreachChatEventSyncSupport(capabilitiesRequest.getInreachChatEventSyncSupport());
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

        public /* synthetic */ CapabilitiesRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CapabilitiesRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private CapabilitiesRequest() {
            this.inreachContactSyncSupport_ = false;
            this.inreachMessageSyncSupport_ = false;
            this.inreachCallSyncSupport_ = false;
            this.inreachChatEventSyncSupport_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesRequest parseFrom(CodedInputStream codedInputStream) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CapabilitiesRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CapabilitiesResponse extends GeneratedMessageV3 implements CapabilitiesResponseOrBuilder {
        public static final int INREACH_CALL_SYNC_SUPPORT_FIELD_NUMBER = 3;
        public static final int INREACH_CHAT_EVENT_SYNC_SUPPORT_FIELD_NUMBER = 4;
        public static final int INREACH_CONTACT_SYNC_SUPPORT_FIELD_NUMBER = 1;
        public static final int INREACH_MESSAGE_SYNC_SUPPORT_FIELD_NUMBER = 2;
        public static final int MESSENGER_ON_DEVICE_CAPABILITY_RESPONSE_FIELD_NUMBER = 20;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean inreachCallSyncSupport_;
        private boolean inreachChatEventSyncSupport_;
        private boolean inreachContactSyncSupport_;
        private boolean inreachMessageSyncSupport_;
        private byte memoizedIsInitialized;
        private static final CapabilitiesResponse DEFAULT_INSTANCE = new CapabilitiesResponse();

        @Deprecated
        public static final Parser<CapabilitiesResponse> PARSER = new AbstractParser<CapabilitiesResponse>() { // from class: com.garmin.proto.generated.GDIMessengerOnDevice.CapabilitiesResponse.1
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
        public static final GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesResponse, CapabilitiesResponse> messengerOnDeviceCapabilityResponse = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, CapabilitiesResponse.class, getDefaultInstance());

        private CapabilitiesResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.inreachContactSyncSupport_ = false;
            this.inreachMessageSyncSupport_ = false;
            this.inreachCallSyncSupport_ = false;
            this.inreachChatEventSyncSupport_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIMessengerOnDevice.internal_static_GDI_Proto_MessengerOnDevice_CapabilitiesResponse_descriptor;
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
            if (hasInreachContactSyncSupport() != capabilitiesResponse.hasInreachContactSyncSupport()) {
                return false;
            }
            if ((hasInreachContactSyncSupport() && getInreachContactSyncSupport() != capabilitiesResponse.getInreachContactSyncSupport()) || hasInreachMessageSyncSupport() != capabilitiesResponse.hasInreachMessageSyncSupport()) {
                return false;
            }
            if ((hasInreachMessageSyncSupport() && getInreachMessageSyncSupport() != capabilitiesResponse.getInreachMessageSyncSupport()) || hasInreachCallSyncSupport() != capabilitiesResponse.hasInreachCallSyncSupport()) {
                return false;
            }
            if ((!hasInreachCallSyncSupport() || getInreachCallSyncSupport() == capabilitiesResponse.getInreachCallSyncSupport()) && hasInreachChatEventSyncSupport() == capabilitiesResponse.hasInreachChatEventSyncSupport()) {
                return (!hasInreachChatEventSyncSupport() || getInreachChatEventSyncSupport() == capabilitiesResponse.getInreachChatEventSyncSupport()) && getUnknownFields().equals(capabilitiesResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.CapabilitiesResponseOrBuilder
        public boolean getInreachCallSyncSupport() {
            return this.inreachCallSyncSupport_;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.CapabilitiesResponseOrBuilder
        public boolean getInreachChatEventSyncSupport() {
            return this.inreachChatEventSyncSupport_;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.CapabilitiesResponseOrBuilder
        public boolean getInreachContactSyncSupport() {
            return this.inreachContactSyncSupport_;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.CapabilitiesResponseOrBuilder
        public boolean getInreachMessageSyncSupport() {
            return this.inreachMessageSyncSupport_;
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
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.inreachContactSyncSupport_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(2, this.inreachMessageSyncSupport_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(3, this.inreachCallSyncSupport_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(4, this.inreachChatEventSyncSupport_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBoolSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.CapabilitiesResponseOrBuilder
        public boolean hasInreachCallSyncSupport() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.CapabilitiesResponseOrBuilder
        public boolean hasInreachChatEventSyncSupport() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.CapabilitiesResponseOrBuilder
        public boolean hasInreachContactSyncSupport() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.CapabilitiesResponseOrBuilder
        public boolean hasInreachMessageSyncSupport() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasInreachContactSyncSupport()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getInreachContactSyncSupport());
            }
            if (hasInreachMessageSyncSupport()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getInreachMessageSyncSupport());
            }
            if (hasInreachCallSyncSupport()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashBoolean(getInreachCallSyncSupport());
            }
            if (hasInreachChatEventSyncSupport()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Internal.hashBoolean(getInreachChatEventSyncSupport());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIMessengerOnDevice.internal_static_GDI_Proto_MessengerOnDevice_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.inreachContactSyncSupport_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.inreachMessageSyncSupport_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(3, this.inreachCallSyncSupport_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeBool(4, this.inreachChatEventSyncSupport_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesResponseOrBuilder {
            private int bitField0_;
            private boolean inreachCallSyncSupport_;
            private boolean inreachChatEventSyncSupport_;
            private boolean inreachContactSyncSupport_;
            private boolean inreachMessageSyncSupport_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(CapabilitiesResponse capabilitiesResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    capabilitiesResponse.inreachContactSyncSupport_ = this.inreachContactSyncSupport_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    capabilitiesResponse.inreachMessageSyncSupport_ = this.inreachMessageSyncSupport_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    capabilitiesResponse.inreachCallSyncSupport_ = this.inreachCallSyncSupport_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    capabilitiesResponse.inreachChatEventSyncSupport_ = this.inreachChatEventSyncSupport_;
                    i14 |= 8;
                }
                capabilitiesResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIMessengerOnDevice.internal_static_GDI_Proto_MessengerOnDevice_CapabilitiesResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
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
                this.inreachContactSyncSupport_ = false;
                this.inreachMessageSyncSupport_ = false;
                this.inreachCallSyncSupport_ = false;
                this.inreachChatEventSyncSupport_ = false;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearInreachCallSyncSupport() {
                this.bitField0_ &= -5;
                this.inreachCallSyncSupport_ = false;
                onChanged();
                return this;
            }

            public Builder clearInreachChatEventSyncSupport() {
                this.bitField0_ &= -9;
                this.inreachChatEventSyncSupport_ = false;
                onChanged();
                return this;
            }

            public Builder clearInreachContactSyncSupport() {
                this.bitField0_ &= -2;
                this.inreachContactSyncSupport_ = false;
                onChanged();
                return this;
            }

            public Builder clearInreachMessageSyncSupport() {
                this.bitField0_ &= -3;
                this.inreachMessageSyncSupport_ = false;
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
                return GDIMessengerOnDevice.internal_static_GDI_Proto_MessengerOnDevice_CapabilitiesResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.CapabilitiesResponseOrBuilder
            public boolean getInreachCallSyncSupport() {
                return this.inreachCallSyncSupport_;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.CapabilitiesResponseOrBuilder
            public boolean getInreachChatEventSyncSupport() {
                return this.inreachChatEventSyncSupport_;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.CapabilitiesResponseOrBuilder
            public boolean getInreachContactSyncSupport() {
                return this.inreachContactSyncSupport_;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.CapabilitiesResponseOrBuilder
            public boolean getInreachMessageSyncSupport() {
                return this.inreachMessageSyncSupport_;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.CapabilitiesResponseOrBuilder
            public boolean hasInreachCallSyncSupport() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.CapabilitiesResponseOrBuilder
            public boolean hasInreachChatEventSyncSupport() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.CapabilitiesResponseOrBuilder
            public boolean hasInreachContactSyncSupport() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.CapabilitiesResponseOrBuilder
            public boolean hasInreachMessageSyncSupport() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIMessengerOnDevice.internal_static_GDI_Proto_MessengerOnDevice_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
                                    this.inreachContactSyncSupport_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.inreachMessageSyncSupport_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.inreachCallSyncSupport_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.inreachChatEventSyncSupport_ = codedInputStream.readBool();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setInreachCallSyncSupport(boolean z14) {
                this.inreachCallSyncSupport_ = z14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setInreachChatEventSyncSupport(boolean z14) {
                this.inreachChatEventSyncSupport_ = z14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setInreachContactSyncSupport(boolean z14) {
                this.inreachContactSyncSupport_ = z14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setInreachMessageSyncSupport(boolean z14) {
                this.inreachMessageSyncSupport_ = z14;
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

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            private Builder() {
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CapabilitiesResponse getDefaultInstanceForType() {
                return CapabilitiesResponse.getDefaultInstance();
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
                if (capabilitiesResponse.hasInreachContactSyncSupport()) {
                    setInreachContactSyncSupport(capabilitiesResponse.getInreachContactSyncSupport());
                }
                if (capabilitiesResponse.hasInreachMessageSyncSupport()) {
                    setInreachMessageSyncSupport(capabilitiesResponse.getInreachMessageSyncSupport());
                }
                if (capabilitiesResponse.hasInreachCallSyncSupport()) {
                    setInreachCallSyncSupport(capabilitiesResponse.getInreachCallSyncSupport());
                }
                if (capabilitiesResponse.hasInreachChatEventSyncSupport()) {
                    setInreachChatEventSyncSupport(capabilitiesResponse.getInreachChatEventSyncSupport());
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

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CapabilitiesResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CapabilitiesResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CapabilitiesResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CapabilitiesResponse parseFrom(InputStream inputStream) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ CapabilitiesResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CapabilitiesResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private CapabilitiesResponse() {
            this.inreachContactSyncSupport_ = false;
            this.inreachMessageSyncSupport_ = false;
            this.inreachCallSyncSupport_ = false;
            this.inreachChatEventSyncSupport_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesResponse parseFrom(CodedInputStream codedInputStream) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CapabilitiesResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class HermesProviderNotification extends GeneratedMessageV3 implements HermesProviderNotificationOrBuilder {
        public static final int ENVIRONMENT_FIELD_NUMBER = 4;
        public static final int HERMES_TOKEN_AVAILABLE_FIELD_NUMBER = 2;
        public static final int PHONE_NUMBER_FIELD_NUMBER = 3;
        public static final int SERVICE_STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int environment_;
        private boolean hermesTokenAvailable_;
        private byte memoizedIsInitialized;
        private volatile Object phoneNumber_;
        private int serviceStatus_;
        private static final HermesProviderNotification DEFAULT_INSTANCE = new HermesProviderNotification();

        @Deprecated
        public static final Parser<HermesProviderNotification> PARSER = new AbstractParser<HermesProviderNotification>() { // from class: com.garmin.proto.generated.GDIMessengerOnDevice.HermesProviderNotification.1
            @Override // com.google.protobuf.Parser
            public HermesProviderNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = HermesProviderNotification.newBuilder();
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

        private HermesProviderNotification() {
            this.serviceStatus_ = 1;
            this.hermesTokenAvailable_ = false;
            this.phoneNumber_ = "";
            this.environment_ = 1;
            this.memoizedIsInitialized = (byte) -1;
            this.serviceStatus_ = 1;
            this.phoneNumber_ = "";
            this.environment_ = 1;
        }

        public static HermesProviderNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIMessengerOnDevice.internal_static_GDI_Proto_MessengerOnDevice_HermesProviderNotification_descriptor;
        }

        public static Builder newBuilder(HermesProviderNotification hermesProviderNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(hermesProviderNotification);
        }

        public static HermesProviderNotification parseDelimitedFrom(InputStream inputStream) {
            return (HermesProviderNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static HermesProviderNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<HermesProviderNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HermesProviderNotification)) {
                return super.equals(obj);
            }
            HermesProviderNotification hermesProviderNotification = (HermesProviderNotification) obj;
            if (hasServiceStatus() != hermesProviderNotification.hasServiceStatus()) {
                return false;
            }
            if ((hasServiceStatus() && this.serviceStatus_ != hermesProviderNotification.serviceStatus_) || hasHermesTokenAvailable() != hermesProviderNotification.hasHermesTokenAvailable()) {
                return false;
            }
            if ((hasHermesTokenAvailable() && getHermesTokenAvailable() != hermesProviderNotification.getHermesTokenAvailable()) || hasPhoneNumber() != hermesProviderNotification.hasPhoneNumber()) {
                return false;
            }
            if ((!hasPhoneNumber() || getPhoneNumber().equals(hermesProviderNotification.getPhoneNumber())) && hasEnvironment() == hermesProviderNotification.hasEnvironment()) {
                return (!hasEnvironment() || this.environment_ == hermesProviderNotification.environment_) && getUnknownFields().equals(hermesProviderNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesProviderNotificationOrBuilder
        public HermesEnvironment getEnvironment() {
            HermesEnvironment hermesEnvironmentForNumber = HermesEnvironment.forNumber(this.environment_);
            return hermesEnvironmentForNumber == null ? HermesEnvironment.DEV : hermesEnvironmentForNumber;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesProviderNotificationOrBuilder
        public boolean getHermesTokenAvailable() {
            return this.hermesTokenAvailable_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<HermesProviderNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesProviderNotificationOrBuilder
        public String getPhoneNumber() {
            Object obj = this.phoneNumber_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.phoneNumber_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesProviderNotificationOrBuilder
        public ByteString getPhoneNumberBytes() {
            Object obj = this.phoneNumber_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.phoneNumber_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.serviceStatus_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeBoolSize(2, this.hermesTokenAvailable_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += GeneratedMessageV3.computeStringSize(3, this.phoneNumber_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(4, this.environment_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesProviderNotificationOrBuilder
        public ServiceStatus getServiceStatus() {
            ServiceStatus serviceStatusForNumber = ServiceStatus.forNumber(this.serviceStatus_);
            return serviceStatusForNumber == null ? ServiceStatus.AVAILABLE : serviceStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesProviderNotificationOrBuilder
        public boolean hasEnvironment() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesProviderNotificationOrBuilder
        public boolean hasHermesTokenAvailable() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesProviderNotificationOrBuilder
        public boolean hasPhoneNumber() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesProviderNotificationOrBuilder
        public boolean hasServiceStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasServiceStatus()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.serviceStatus_;
            }
            if (hasHermesTokenAvailable()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getHermesTokenAvailable());
            }
            if (hasPhoneNumber()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getPhoneNumber().hashCode();
            }
            if (hasEnvironment()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + this.environment_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIMessengerOnDevice.internal_static_GDI_Proto_MessengerOnDevice_HermesProviderNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(HermesProviderNotification.class, Builder.class);
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
            return new HermesProviderNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.serviceStatus_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.hermesTokenAvailable_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.phoneNumber_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeEnum(4, this.environment_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HermesProviderNotificationOrBuilder {
            private int bitField0_;
            private int environment_;
            private boolean hermesTokenAvailable_;
            private Object phoneNumber_;
            private int serviceStatus_;

            private Builder() {
                this.serviceStatus_ = 1;
                this.phoneNumber_ = "";
                this.environment_ = 1;
            }

            private void buildPartial0(HermesProviderNotification hermesProviderNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    hermesProviderNotification.serviceStatus_ = this.serviceStatus_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    hermesProviderNotification.hermesTokenAvailable_ = this.hermesTokenAvailable_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    hermesProviderNotification.phoneNumber_ = this.phoneNumber_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    hermesProviderNotification.environment_ = this.environment_;
                    i14 |= 8;
                }
                hermesProviderNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIMessengerOnDevice.internal_static_GDI_Proto_MessengerOnDevice_HermesProviderNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HermesProviderNotification build() {
                HermesProviderNotification hermesProviderNotificationBuildPartial = buildPartial();
                if (hermesProviderNotificationBuildPartial.isInitialized()) {
                    return hermesProviderNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) hermesProviderNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HermesProviderNotification buildPartial() {
                HermesProviderNotification hermesProviderNotification = new HermesProviderNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(hermesProviderNotification);
                }
                onBuilt();
                return hermesProviderNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.serviceStatus_ = 1;
                this.hermesTokenAvailable_ = false;
                this.phoneNumber_ = "";
                this.environment_ = 1;
                return this;
            }

            public Builder clearEnvironment() {
                this.bitField0_ &= -9;
                this.environment_ = 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearHermesTokenAvailable() {
                this.bitField0_ &= -3;
                this.hermesTokenAvailable_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPhoneNumber() {
                this.phoneNumber_ = HermesProviderNotification.getDefaultInstance().getPhoneNumber();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearServiceStatus() {
                this.bitField0_ &= -2;
                this.serviceStatus_ = 1;
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
                return GDIMessengerOnDevice.internal_static_GDI_Proto_MessengerOnDevice_HermesProviderNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesProviderNotificationOrBuilder
            public HermesEnvironment getEnvironment() {
                HermesEnvironment hermesEnvironmentForNumber = HermesEnvironment.forNumber(this.environment_);
                return hermesEnvironmentForNumber == null ? HermesEnvironment.DEV : hermesEnvironmentForNumber;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesProviderNotificationOrBuilder
            public boolean getHermesTokenAvailable() {
                return this.hermesTokenAvailable_;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesProviderNotificationOrBuilder
            public String getPhoneNumber() {
                Object obj = this.phoneNumber_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.phoneNumber_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesProviderNotificationOrBuilder
            public ByteString getPhoneNumberBytes() {
                Object obj = this.phoneNumber_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.phoneNumber_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesProviderNotificationOrBuilder
            public ServiceStatus getServiceStatus() {
                ServiceStatus serviceStatusForNumber = ServiceStatus.forNumber(this.serviceStatus_);
                return serviceStatusForNumber == null ? ServiceStatus.AVAILABLE : serviceStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesProviderNotificationOrBuilder
            public boolean hasEnvironment() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesProviderNotificationOrBuilder
            public boolean hasHermesTokenAvailable() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesProviderNotificationOrBuilder
            public boolean hasPhoneNumber() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesProviderNotificationOrBuilder
            public boolean hasServiceStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIMessengerOnDevice.internal_static_GDI_Proto_MessengerOnDevice_HermesProviderNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(HermesProviderNotification.class, Builder.class);
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
                                    if (ServiceStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.serviceStatus_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    this.hermesTokenAvailable_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.phoneNumber_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    int i15 = codedInputStream.readEnum();
                                    if (HermesEnvironment.forNumber(i15) == null) {
                                        mergeUnknownVarintField(4, i15);
                                    } else {
                                        this.environment_ = i15;
                                        this.bitField0_ |= 8;
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

            public Builder setEnvironment(HermesEnvironment hermesEnvironment) {
                hermesEnvironment.getClass();
                this.bitField0_ |= 8;
                this.environment_ = hermesEnvironment.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setHermesTokenAvailable(boolean z14) {
                this.hermesTokenAvailable_ = z14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setPhoneNumber(String str) {
                str.getClass();
                this.phoneNumber_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPhoneNumberBytes(ByteString byteString) {
                byteString.getClass();
                this.phoneNumber_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setServiceStatus(ServiceStatus serviceStatus) {
                serviceStatus.getClass();
                this.bitField0_ |= 1;
                this.serviceStatus_ = serviceStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public HermesProviderNotification getDefaultInstanceForType() {
                return HermesProviderNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.serviceStatus_ = 1;
                this.phoneNumber_ = "";
                this.environment_ = 1;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof HermesProviderNotification) {
                    return mergeFrom((HermesProviderNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(HermesProviderNotification hermesProviderNotification) {
                if (hermesProviderNotification == HermesProviderNotification.getDefaultInstance()) {
                    return this;
                }
                if (hermesProviderNotification.hasServiceStatus()) {
                    setServiceStatus(hermesProviderNotification.getServiceStatus());
                }
                if (hermesProviderNotification.hasHermesTokenAvailable()) {
                    setHermesTokenAvailable(hermesProviderNotification.getHermesTokenAvailable());
                }
                if (hermesProviderNotification.hasPhoneNumber()) {
                    this.phoneNumber_ = hermesProviderNotification.phoneNumber_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (hermesProviderNotification.hasEnvironment()) {
                    setEnvironment(hermesProviderNotification.getEnvironment());
                }
                mergeUnknownFields(hermesProviderNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public HermesProviderNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static HermesProviderNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HermesProviderNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HermesProviderNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static HermesProviderNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static HermesProviderNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static HermesProviderNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static HermesProviderNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static HermesProviderNotification parseFrom(InputStream inputStream) {
            return (HermesProviderNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static HermesProviderNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HermesProviderNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HermesProviderNotification parseFrom(CodedInputStream codedInputStream) {
            return (HermesProviderNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static HermesProviderNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HermesProviderNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ServiceStatus implements ProtocolMessageEnum {
            AVAILABLE(1),
            UNAVAILABLE(2),
            SERVICE_ERROR(3),
            NO_INTERNET_GENERIC(4);

            public static final int AVAILABLE_VALUE = 1;
            public static final int NO_INTERNET_GENERIC_VALUE = 4;
            public static final int SERVICE_ERROR_VALUE = 3;
            public static final int UNAVAILABLE_VALUE = 2;
            private final int value;
            private static final Internal.EnumLiteMap<ServiceStatus> internalValueMap = new Internal.EnumLiteMap<ServiceStatus>() { // from class: com.garmin.proto.generated.GDIMessengerOnDevice.HermesProviderNotification.ServiceStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ServiceStatus findValueByNumber(int i14) {
                    return ServiceStatus.forNumber(i14);
                }
            };
            private static final ServiceStatus[] VALUES = values();

            ServiceStatus(int i14) {
                this.value = i14;
            }

            public static ServiceStatus forNumber(int i14) {
                if (i14 == 1) {
                    return AVAILABLE;
                }
                if (i14 == 2) {
                    return UNAVAILABLE;
                }
                if (i14 == 3) {
                    return SERVICE_ERROR;
                }
                if (i14 != 4) {
                    return null;
                }
                return NO_INTERNET_GENERIC;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return HermesProviderNotification.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<ServiceStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static ServiceStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static ServiceStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }

        private HermesProviderNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.serviceStatus_ = 1;
            this.hermesTokenAvailable_ = false;
            this.phoneNumber_ = "";
            this.environment_ = 1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ HermesProviderNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class HermesTokenRequest extends GeneratedMessageV3 implements HermesTokenRequestOrBuilder {
        public static final int INSTANCE_ID_FIELD_NUMBER = 2;
        public static final int PHONE_NUMBER_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private GDIDataTypes.UUID instanceId_;
        private byte memoizedIsInitialized;
        private volatile Object phoneNumber_;
        private static final HermesTokenRequest DEFAULT_INSTANCE = new HermesTokenRequest();

        @Deprecated
        public static final Parser<HermesTokenRequest> PARSER = new AbstractParser<HermesTokenRequest>() { // from class: com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenRequest.1
            @Override // com.google.protobuf.Parser
            public HermesTokenRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = HermesTokenRequest.newBuilder();
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

        private HermesTokenRequest() {
            this.phoneNumber_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.phoneNumber_ = "";
        }

        public static HermesTokenRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIMessengerOnDevice.internal_static_GDI_Proto_MessengerOnDevice_HermesTokenRequest_descriptor;
        }

        public static Builder newBuilder(HermesTokenRequest hermesTokenRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(hermesTokenRequest);
        }

        public static HermesTokenRequest parseDelimitedFrom(InputStream inputStream) {
            return (HermesTokenRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static HermesTokenRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<HermesTokenRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HermesTokenRequest)) {
                return super.equals(obj);
            }
            HermesTokenRequest hermesTokenRequest = (HermesTokenRequest) obj;
            if (hasPhoneNumber() != hermesTokenRequest.hasPhoneNumber()) {
                return false;
            }
            if ((!hasPhoneNumber() || getPhoneNumber().equals(hermesTokenRequest.getPhoneNumber())) && hasInstanceId() == hermesTokenRequest.hasInstanceId()) {
                return (!hasInstanceId() || getInstanceId().equals(hermesTokenRequest.getInstanceId())) && getUnknownFields().equals(hermesTokenRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenRequestOrBuilder
        public GDIDataTypes.UUID getInstanceId() {
            GDIDataTypes.UUID uuid = this.instanceId_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenRequestOrBuilder
        public GDIDataTypes.UUIDOrBuilder getInstanceIdOrBuilder() {
            GDIDataTypes.UUID uuid = this.instanceId_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<HermesTokenRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenRequestOrBuilder
        public String getPhoneNumber() {
            Object obj = this.phoneNumber_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.phoneNumber_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenRequestOrBuilder
        public ByteString getPhoneNumberBytes() {
            Object obj = this.phoneNumber_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.phoneNumber_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.phoneNumber_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(2, getInstanceId());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenRequestOrBuilder
        public boolean hasInstanceId() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenRequestOrBuilder
        public boolean hasPhoneNumber() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasPhoneNumber()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getPhoneNumber().hashCode();
            }
            if (hasInstanceId()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getInstanceId().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIMessengerOnDevice.internal_static_GDI_Proto_MessengerOnDevice_HermesTokenRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(HermesTokenRequest.class, Builder.class);
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
            if (!hasInstanceId() || getInstanceId().isInitialized()) {
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
            return new HermesTokenRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.phoneNumber_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getInstanceId());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HermesTokenRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> instanceIdBuilder_;
            private GDIDataTypes.UUID instanceId_;
            private Object phoneNumber_;

            private Builder() {
                this.phoneNumber_ = "";
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(HermesTokenRequest hermesTokenRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    hermesTokenRequest.phoneNumber_ = this.phoneNumber_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.instanceIdBuilder_;
                    hermesTokenRequest.instanceId_ = singleFieldBuilderV3 == null ? this.instanceId_ : (GDIDataTypes.UUID) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                hermesTokenRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIMessengerOnDevice.internal_static_GDI_Proto_MessengerOnDevice_HermesTokenRequest_descriptor;
            }

            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> getInstanceIdFieldBuilder() {
                if (this.instanceIdBuilder_ == null) {
                    this.instanceIdBuilder_ = new SingleFieldBuilderV3<>(getInstanceId(), getParentForChildren(), isClean());
                    this.instanceId_ = null;
                }
                return this.instanceIdBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getInstanceIdFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HermesTokenRequest build() {
                HermesTokenRequest hermesTokenRequestBuildPartial = buildPartial();
                if (hermesTokenRequestBuildPartial.isInitialized()) {
                    return hermesTokenRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) hermesTokenRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HermesTokenRequest buildPartial() {
                HermesTokenRequest hermesTokenRequest = new HermesTokenRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(hermesTokenRequest);
                }
                onBuilt();
                return hermesTokenRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.phoneNumber_ = "";
                this.instanceId_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.instanceIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.instanceIdBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearInstanceId() {
                this.bitField0_ &= -3;
                this.instanceId_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.instanceIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.instanceIdBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPhoneNumber() {
                this.phoneNumber_ = HermesTokenRequest.getDefaultInstance().getPhoneNumber();
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
                return GDIMessengerOnDevice.internal_static_GDI_Proto_MessengerOnDevice_HermesTokenRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenRequestOrBuilder
            public GDIDataTypes.UUID getInstanceId() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.instanceIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUID) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.UUID uuid = this.instanceId_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            public GDIDataTypes.UUID.Builder getInstanceIdBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (GDIDataTypes.UUID.Builder) getInstanceIdFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenRequestOrBuilder
            public GDIDataTypes.UUIDOrBuilder getInstanceIdOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.instanceIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUIDOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.UUID uuid = this.instanceId_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenRequestOrBuilder
            public String getPhoneNumber() {
                Object obj = this.phoneNumber_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.phoneNumber_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenRequestOrBuilder
            public ByteString getPhoneNumberBytes() {
                Object obj = this.phoneNumber_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.phoneNumber_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenRequestOrBuilder
            public boolean hasInstanceId() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenRequestOrBuilder
            public boolean hasPhoneNumber() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIMessengerOnDevice.internal_static_GDI_Proto_MessengerOnDevice_HermesTokenRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(HermesTokenRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasInstanceId() || getInstanceId().isInitialized();
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
                                    this.phoneNumber_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getInstanceIdFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeInstanceId(GDIDataTypes.UUID uuid) {
                GDIDataTypes.UUID uuid2;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.instanceIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(uuid);
                } else if ((this.bitField0_ & 2) == 0 || (uuid2 = this.instanceId_) == null || uuid2 == GDIDataTypes.UUID.getDefaultInstance()) {
                    this.instanceId_ = uuid;
                } else {
                    getInstanceIdBuilder().mergeFrom(uuid);
                }
                if (this.instanceId_ != null) {
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

            public Builder setInstanceId(GDIDataTypes.UUID.Builder builder) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.instanceIdBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.instanceId_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setPhoneNumber(String str) {
                str.getClass();
                this.phoneNumber_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setPhoneNumberBytes(ByteString byteString) {
                byteString.getClass();
                this.phoneNumber_ = byteString;
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
            public HermesTokenRequest getDefaultInstanceForType() {
                return HermesTokenRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.phoneNumber_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder setInstanceId(GDIDataTypes.UUID uuid) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.instanceIdBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uuid.getClass();
                    this.instanceId_ = uuid;
                } else {
                    singleFieldBuilderV3.setMessage(uuid);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof HermesTokenRequest) {
                    return mergeFrom((HermesTokenRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(HermesTokenRequest hermesTokenRequest) {
                if (hermesTokenRequest == HermesTokenRequest.getDefaultInstance()) {
                    return this;
                }
                if (hermesTokenRequest.hasPhoneNumber()) {
                    this.phoneNumber_ = hermesTokenRequest.phoneNumber_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (hermesTokenRequest.hasInstanceId()) {
                    mergeInstanceId(hermesTokenRequest.getInstanceId());
                }
                mergeUnknownFields(hermesTokenRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public HermesTokenRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static HermesTokenRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HermesTokenRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HermesTokenRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static HermesTokenRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static HermesTokenRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static HermesTokenRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private HermesTokenRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.phoneNumber_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static HermesTokenRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static HermesTokenRequest parseFrom(InputStream inputStream) {
            return (HermesTokenRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ HermesTokenRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static HermesTokenRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HermesTokenRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HermesTokenRequest parseFrom(CodedInputStream codedInputStream) {
            return (HermesTokenRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static HermesTokenRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HermesTokenRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class HermesTokenResponse extends GeneratedMessageV3 implements HermesTokenResponseOrBuilder {
        public static final int BEARER_TOKEN_EXPIRATION_FIELD_NUMBER = 5;
        public static final int BEARER_TOKEN_FIELD_NUMBER = 4;
        public static final int ENVIRONMENT_FIELD_NUMBER = 7;
        public static final int INSTANCE_ID_FIELD_NUMBER = 3;
        public static final int PHONE_NUMBER_FIELD_NUMBER = 2;
        public static final int REFRESH_TOKEN_FIELD_NUMBER = 6;
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bearerTokenExpiration_;
        private volatile Object bearerToken_;
        private int bitField0_;
        private int environment_;
        private GDIDataTypes.UUID instanceId_;
        private byte memoizedIsInitialized;
        private volatile Object phoneNumber_;
        private volatile Object refreshToken_;
        private int status_;
        private static final HermesTokenResponse DEFAULT_INSTANCE = new HermesTokenResponse();

        @Deprecated
        public static final Parser<HermesTokenResponse> PARSER = new AbstractParser<HermesTokenResponse>() { // from class: com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenResponse.1
            @Override // com.google.protobuf.Parser
            public HermesTokenResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = HermesTokenResponse.newBuilder();
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

        private HermesTokenResponse() {
            this.status_ = 1;
            this.phoneNumber_ = "";
            this.bearerToken_ = "";
            this.bearerTokenExpiration_ = 0;
            this.refreshToken_ = "";
            this.environment_ = 1;
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 1;
            this.phoneNumber_ = "";
            this.bearerToken_ = "";
            this.refreshToken_ = "";
            this.environment_ = 1;
        }

        public static HermesTokenResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIMessengerOnDevice.internal_static_GDI_Proto_MessengerOnDevice_HermesTokenResponse_descriptor;
        }

        public static Builder newBuilder(HermesTokenResponse hermesTokenResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(hermesTokenResponse);
        }

        public static HermesTokenResponse parseDelimitedFrom(InputStream inputStream) {
            return (HermesTokenResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static HermesTokenResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<HermesTokenResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof HermesTokenResponse)) {
                return super.equals(obj);
            }
            HermesTokenResponse hermesTokenResponse = (HermesTokenResponse) obj;
            if (hasStatus() != hermesTokenResponse.hasStatus()) {
                return false;
            }
            if ((hasStatus() && this.status_ != hermesTokenResponse.status_) || hasPhoneNumber() != hermesTokenResponse.hasPhoneNumber()) {
                return false;
            }
            if ((hasPhoneNumber() && !getPhoneNumber().equals(hermesTokenResponse.getPhoneNumber())) || hasInstanceId() != hermesTokenResponse.hasInstanceId()) {
                return false;
            }
            if ((hasInstanceId() && !getInstanceId().equals(hermesTokenResponse.getInstanceId())) || hasBearerToken() != hermesTokenResponse.hasBearerToken()) {
                return false;
            }
            if ((hasBearerToken() && !getBearerToken().equals(hermesTokenResponse.getBearerToken())) || hasBearerTokenExpiration() != hermesTokenResponse.hasBearerTokenExpiration()) {
                return false;
            }
            if ((hasBearerTokenExpiration() && getBearerTokenExpiration() != hermesTokenResponse.getBearerTokenExpiration()) || hasRefreshToken() != hermesTokenResponse.hasRefreshToken()) {
                return false;
            }
            if ((!hasRefreshToken() || getRefreshToken().equals(hermesTokenResponse.getRefreshToken())) && hasEnvironment() == hermesTokenResponse.hasEnvironment()) {
                return (!hasEnvironment() || this.environment_ == hermesTokenResponse.environment_) && getUnknownFields().equals(hermesTokenResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenResponseOrBuilder
        public String getBearerToken() {
            Object obj = this.bearerToken_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.bearerToken_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenResponseOrBuilder
        public ByteString getBearerTokenBytes() {
            Object obj = this.bearerToken_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.bearerToken_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenResponseOrBuilder
        public int getBearerTokenExpiration() {
            return this.bearerTokenExpiration_;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenResponseOrBuilder
        public HermesEnvironment getEnvironment() {
            HermesEnvironment hermesEnvironmentForNumber = HermesEnvironment.forNumber(this.environment_);
            return hermesEnvironmentForNumber == null ? HermesEnvironment.DEV : hermesEnvironmentForNumber;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenResponseOrBuilder
        public GDIDataTypes.UUID getInstanceId() {
            GDIDataTypes.UUID uuid = this.instanceId_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenResponseOrBuilder
        public GDIDataTypes.UUIDOrBuilder getInstanceIdOrBuilder() {
            GDIDataTypes.UUID uuid = this.instanceId_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<HermesTokenResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenResponseOrBuilder
        public String getPhoneNumber() {
            Object obj = this.phoneNumber_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.phoneNumber_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenResponseOrBuilder
        public ByteString getPhoneNumberBytes() {
            Object obj = this.phoneNumber_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.phoneNumber_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenResponseOrBuilder
        public String getRefreshToken() {
            Object obj = this.refreshToken_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.refreshToken_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenResponseOrBuilder
        public ByteString getRefreshTokenBytes() {
            Object obj = this.refreshToken_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.refreshToken_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.status_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += GeneratedMessageV3.computeStringSize(2, this.phoneNumber_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(3, getInstanceId());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeEnumSize += GeneratedMessageV3.computeStringSize(4, this.bearerToken_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeEnumSize += CodedOutputStream.computeFixed32Size(5, this.bearerTokenExpiration_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeEnumSize += GeneratedMessageV3.computeStringSize(6, this.refreshToken_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(7, this.environment_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.OK : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenResponseOrBuilder
        public boolean hasBearerToken() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenResponseOrBuilder
        public boolean hasBearerTokenExpiration() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenResponseOrBuilder
        public boolean hasEnvironment() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenResponseOrBuilder
        public boolean hasInstanceId() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenResponseOrBuilder
        public boolean hasPhoneNumber() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenResponseOrBuilder
        public boolean hasRefreshToken() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenResponseOrBuilder
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
            if (hasPhoneNumber()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getPhoneNumber().hashCode();
            }
            if (hasInstanceId()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getInstanceId().hashCode();
            }
            if (hasBearerToken()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getBearerToken().hashCode();
            }
            if (hasBearerTokenExpiration()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getBearerTokenExpiration();
            }
            if (hasRefreshToken()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getRefreshToken().hashCode();
            }
            if (hasEnvironment()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + this.environment_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIMessengerOnDevice.internal_static_GDI_Proto_MessengerOnDevice_HermesTokenResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(HermesTokenResponse.class, Builder.class);
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
            if (!hasStatus()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasInstanceId() || getInstanceId().isInitialized()) {
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
            return new HermesTokenResponse();
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
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.phoneNumber_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getInstanceId());
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.bearerToken_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeFixed32(5, this.bearerTokenExpiration_);
            }
            if ((this.bitField0_ & 32) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 6, this.refreshToken_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeEnum(7, this.environment_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements HermesTokenResponseOrBuilder {
            private int bearerTokenExpiration_;
            private Object bearerToken_;
            private int bitField0_;
            private int environment_;
            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> instanceIdBuilder_;
            private GDIDataTypes.UUID instanceId_;
            private Object phoneNumber_;
            private Object refreshToken_;
            private int status_;

            private Builder() {
                this.status_ = 1;
                this.phoneNumber_ = "";
                this.bearerToken_ = "";
                this.refreshToken_ = "";
                this.environment_ = 1;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(HermesTokenResponse hermesTokenResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    hermesTokenResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    hermesTokenResponse.phoneNumber_ = this.phoneNumber_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.instanceIdBuilder_;
                    hermesTokenResponse.instanceId_ = singleFieldBuilderV3 == null ? this.instanceId_ : (GDIDataTypes.UUID) singleFieldBuilderV3.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    hermesTokenResponse.bearerToken_ = this.bearerToken_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    hermesTokenResponse.bearerTokenExpiration_ = this.bearerTokenExpiration_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    hermesTokenResponse.refreshToken_ = this.refreshToken_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    hermesTokenResponse.environment_ = this.environment_;
                    i14 |= 64;
                }
                hermesTokenResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIMessengerOnDevice.internal_static_GDI_Proto_MessengerOnDevice_HermesTokenResponse_descriptor;
            }

            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> getInstanceIdFieldBuilder() {
                if (this.instanceIdBuilder_ == null) {
                    this.instanceIdBuilder_ = new SingleFieldBuilderV3<>(getInstanceId(), getParentForChildren(), isClean());
                    this.instanceId_ = null;
                }
                return this.instanceIdBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getInstanceIdFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HermesTokenResponse build() {
                HermesTokenResponse hermesTokenResponseBuildPartial = buildPartial();
                if (hermesTokenResponseBuildPartial.isInitialized()) {
                    return hermesTokenResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) hermesTokenResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public HermesTokenResponse buildPartial() {
                HermesTokenResponse hermesTokenResponse = new HermesTokenResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(hermesTokenResponse);
                }
                onBuilt();
                return hermesTokenResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 1;
                this.phoneNumber_ = "";
                this.instanceId_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.instanceIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.instanceIdBuilder_ = null;
                }
                this.bearerToken_ = "";
                this.bearerTokenExpiration_ = 0;
                this.refreshToken_ = "";
                this.environment_ = 1;
                return this;
            }

            public Builder clearBearerToken() {
                this.bearerToken_ = HermesTokenResponse.getDefaultInstance().getBearerToken();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearBearerTokenExpiration() {
                this.bitField0_ &= -17;
                this.bearerTokenExpiration_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEnvironment() {
                this.bitField0_ &= -65;
                this.environment_ = 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearInstanceId() {
                this.bitField0_ &= -5;
                this.instanceId_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.instanceIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.instanceIdBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPhoneNumber() {
                this.phoneNumber_ = HermesTokenResponse.getDefaultInstance().getPhoneNumber();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearRefreshToken() {
                this.refreshToken_ = HermesTokenResponse.getDefaultInstance().getRefreshToken();
                this.bitField0_ &= -33;
                onChanged();
                return this;
            }

            public Builder clearStatus() {
                this.bitField0_ &= -2;
                this.status_ = 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenResponseOrBuilder
            public String getBearerToken() {
                Object obj = this.bearerToken_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.bearerToken_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenResponseOrBuilder
            public ByteString getBearerTokenBytes() {
                Object obj = this.bearerToken_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.bearerToken_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenResponseOrBuilder
            public int getBearerTokenExpiration() {
                return this.bearerTokenExpiration_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIMessengerOnDevice.internal_static_GDI_Proto_MessengerOnDevice_HermesTokenResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenResponseOrBuilder
            public HermesEnvironment getEnvironment() {
                HermesEnvironment hermesEnvironmentForNumber = HermesEnvironment.forNumber(this.environment_);
                return hermesEnvironmentForNumber == null ? HermesEnvironment.DEV : hermesEnvironmentForNumber;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenResponseOrBuilder
            public GDIDataTypes.UUID getInstanceId() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.instanceIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUID) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.UUID uuid = this.instanceId_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            public GDIDataTypes.UUID.Builder getInstanceIdBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (GDIDataTypes.UUID.Builder) getInstanceIdFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenResponseOrBuilder
            public GDIDataTypes.UUIDOrBuilder getInstanceIdOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.instanceIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUIDOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.UUID uuid = this.instanceId_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenResponseOrBuilder
            public String getPhoneNumber() {
                Object obj = this.phoneNumber_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.phoneNumber_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenResponseOrBuilder
            public ByteString getPhoneNumberBytes() {
                Object obj = this.phoneNumber_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.phoneNumber_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenResponseOrBuilder
            public String getRefreshToken() {
                Object obj = this.refreshToken_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.refreshToken_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenResponseOrBuilder
            public ByteString getRefreshTokenBytes() {
                Object obj = this.refreshToken_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.refreshToken_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.OK : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenResponseOrBuilder
            public boolean hasBearerToken() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenResponseOrBuilder
            public boolean hasBearerTokenExpiration() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenResponseOrBuilder
            public boolean hasEnvironment() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenResponseOrBuilder
            public boolean hasInstanceId() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenResponseOrBuilder
            public boolean hasPhoneNumber() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenResponseOrBuilder
            public boolean hasRefreshToken() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIMessengerOnDevice.internal_static_GDI_Proto_MessengerOnDevice_HermesTokenResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(HermesTokenResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasStatus()) {
                    return !hasInstanceId() || getInstanceId().isInitialized();
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
                                if (tag == 8) {
                                    int i14 = codedInputStream.readEnum();
                                    if (Status.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    this.phoneNumber_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getInstanceIdFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.bearerToken_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 8;
                                } else if (tag == 45) {
                                    this.bearerTokenExpiration_ = codedInputStream.readFixed32();
                                    this.bitField0_ |= 16;
                                } else if (tag == 50) {
                                    this.refreshToken_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 32;
                                } else if (tag == 56) {
                                    int i15 = codedInputStream.readEnum();
                                    if (HermesEnvironment.forNumber(i15) == null) {
                                        mergeUnknownVarintField(7, i15);
                                    } else {
                                        this.environment_ = i15;
                                        this.bitField0_ |= 64;
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

            public Builder mergeInstanceId(GDIDataTypes.UUID uuid) {
                GDIDataTypes.UUID uuid2;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.instanceIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(uuid);
                } else if ((this.bitField0_ & 4) == 0 || (uuid2 = this.instanceId_) == null || uuid2 == GDIDataTypes.UUID.getDefaultInstance()) {
                    this.instanceId_ = uuid;
                } else {
                    getInstanceIdBuilder().mergeFrom(uuid);
                }
                if (this.instanceId_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setBearerToken(String str) {
                str.getClass();
                this.bearerToken_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setBearerTokenBytes(ByteString byteString) {
                byteString.getClass();
                this.bearerToken_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setBearerTokenExpiration(int i14) {
                this.bearerTokenExpiration_ = i14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setEnvironment(HermesEnvironment hermesEnvironment) {
                hermesEnvironment.getClass();
                this.bitField0_ |= 64;
                this.environment_ = hermesEnvironment.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setInstanceId(GDIDataTypes.UUID.Builder builder) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.instanceIdBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.instanceId_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPhoneNumber(String str) {
                str.getClass();
                this.phoneNumber_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setPhoneNumberBytes(ByteString byteString) {
                byteString.getClass();
                this.phoneNumber_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setRefreshToken(String str) {
                str.getClass();
                this.refreshToken_ = str;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setRefreshTokenBytes(ByteString byteString) {
                byteString.getClass();
                this.refreshToken_ = byteString;
                this.bitField0_ |= 32;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public HermesTokenResponse getDefaultInstanceForType() {
                return HermesTokenResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.status_ = 1;
                this.phoneNumber_ = "";
                this.bearerToken_ = "";
                this.refreshToken_ = "";
                this.environment_ = 1;
                maybeForceBuilderInitialization();
            }

            public Builder setInstanceId(GDIDataTypes.UUID uuid) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.instanceIdBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uuid.getClass();
                    this.instanceId_ = uuid;
                } else {
                    singleFieldBuilderV3.setMessage(uuid);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof HermesTokenResponse) {
                    return mergeFrom((HermesTokenResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(HermesTokenResponse hermesTokenResponse) {
                if (hermesTokenResponse == HermesTokenResponse.getDefaultInstance()) {
                    return this;
                }
                if (hermesTokenResponse.hasStatus()) {
                    setStatus(hermesTokenResponse.getStatus());
                }
                if (hermesTokenResponse.hasPhoneNumber()) {
                    this.phoneNumber_ = hermesTokenResponse.phoneNumber_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (hermesTokenResponse.hasInstanceId()) {
                    mergeInstanceId(hermesTokenResponse.getInstanceId());
                }
                if (hermesTokenResponse.hasBearerToken()) {
                    this.bearerToken_ = hermesTokenResponse.bearerToken_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (hermesTokenResponse.hasBearerTokenExpiration()) {
                    setBearerTokenExpiration(hermesTokenResponse.getBearerTokenExpiration());
                }
                if (hermesTokenResponse.hasRefreshToken()) {
                    this.refreshToken_ = hermesTokenResponse.refreshToken_;
                    this.bitField0_ |= 32;
                    onChanged();
                }
                if (hermesTokenResponse.hasEnvironment()) {
                    setEnvironment(hermesTokenResponse.getEnvironment());
                }
                mergeUnknownFields(hermesTokenResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public HermesTokenResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static HermesTokenResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HermesTokenResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HermesTokenResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static HermesTokenResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static HermesTokenResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static HermesTokenResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static HermesTokenResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static HermesTokenResponse parseFrom(InputStream inputStream) {
            return (HermesTokenResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static HermesTokenResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HermesTokenResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static HermesTokenResponse parseFrom(CodedInputStream codedInputStream) {
            return (HermesTokenResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static HermesTokenResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (HermesTokenResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            OK(1),
            GENERIC_ERROR(2),
            SERVICE_UNAVAILABLE(3),
            SERVICE_ERROR(4),
            NO_INTERNET_GENERIC(5);

            public static final int GENERIC_ERROR_VALUE = 2;
            public static final int NO_INTERNET_GENERIC_VALUE = 5;
            public static final int OK_VALUE = 1;
            public static final int SERVICE_ERROR_VALUE = 4;
            public static final int SERVICE_UNAVAILABLE_VALUE = 3;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIMessengerOnDevice.HermesTokenResponse.Status.1
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
                if (i14 == 1) {
                    return OK;
                }
                if (i14 == 2) {
                    return GENERIC_ERROR;
                }
                if (i14 == 3) {
                    return SERVICE_UNAVAILABLE;
                }
                if (i14 == 4) {
                    return SERVICE_ERROR;
                }
                if (i14 != 5) {
                    return null;
                }
                return NO_INTERNET_GENERIC;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return HermesTokenResponse.getDescriptor().getEnumTypes().get(0);
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

        private HermesTokenResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 1;
            this.phoneNumber_ = "";
            this.bearerToken_ = "";
            this.bearerTokenExpiration_ = 0;
            this.refreshToken_ = "";
            this.environment_ = 1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ HermesTokenResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class MessengerOnDeviceService extends GeneratedMessageV3 implements MessengerOnDeviceServiceOrBuilder {
        public static final int HERMES_PROVIDER_NOTIFICATIONS_FIELD_NUMBER = 3;
        public static final int HERMES_TOKEN_REQUEST_FIELD_NUMBER = 1;
        public static final int HERMES_TOKEN_RESPONSE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private HermesProviderNotification hermesProviderNotifications_;
        private HermesTokenRequest hermesTokenRequest_;
        private HermesTokenResponse hermesTokenResponse_;
        private byte memoizedIsInitialized;
        private static final MessengerOnDeviceService DEFAULT_INSTANCE = new MessengerOnDeviceService();

        @Deprecated
        public static final Parser<MessengerOnDeviceService> PARSER = new AbstractParser<MessengerOnDeviceService>() { // from class: com.garmin.proto.generated.GDIMessengerOnDevice.MessengerOnDeviceService.1
            @Override // com.google.protobuf.Parser
            public MessengerOnDeviceService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = MessengerOnDeviceService.newBuilder();
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

        private MessengerOnDeviceService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MessengerOnDeviceService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIMessengerOnDevice.internal_static_GDI_Proto_MessengerOnDevice_MessengerOnDeviceService_descriptor;
        }

        public static Builder newBuilder(MessengerOnDeviceService messengerOnDeviceService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(messengerOnDeviceService);
        }

        public static MessengerOnDeviceService parseDelimitedFrom(InputStream inputStream) {
            return (MessengerOnDeviceService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MessengerOnDeviceService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<MessengerOnDeviceService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MessengerOnDeviceService)) {
                return super.equals(obj);
            }
            MessengerOnDeviceService messengerOnDeviceService = (MessengerOnDeviceService) obj;
            if (hasHermesTokenRequest() != messengerOnDeviceService.hasHermesTokenRequest()) {
                return false;
            }
            if ((hasHermesTokenRequest() && !getHermesTokenRequest().equals(messengerOnDeviceService.getHermesTokenRequest())) || hasHermesTokenResponse() != messengerOnDeviceService.hasHermesTokenResponse()) {
                return false;
            }
            if ((!hasHermesTokenResponse() || getHermesTokenResponse().equals(messengerOnDeviceService.getHermesTokenResponse())) && hasHermesProviderNotifications() == messengerOnDeviceService.hasHermesProviderNotifications()) {
                return (!hasHermesProviderNotifications() || getHermesProviderNotifications().equals(messengerOnDeviceService.getHermesProviderNotifications())) && getUnknownFields().equals(messengerOnDeviceService.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.MessengerOnDeviceServiceOrBuilder
        public HermesProviderNotification getHermesProviderNotifications() {
            HermesProviderNotification hermesProviderNotification = this.hermesProviderNotifications_;
            return hermesProviderNotification == null ? HermesProviderNotification.getDefaultInstance() : hermesProviderNotification;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.MessengerOnDeviceServiceOrBuilder
        public HermesProviderNotificationOrBuilder getHermesProviderNotificationsOrBuilder() {
            HermesProviderNotification hermesProviderNotification = this.hermesProviderNotifications_;
            return hermesProviderNotification == null ? HermesProviderNotification.getDefaultInstance() : hermesProviderNotification;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.MessengerOnDeviceServiceOrBuilder
        public HermesTokenRequest getHermesTokenRequest() {
            HermesTokenRequest hermesTokenRequest = this.hermesTokenRequest_;
            return hermesTokenRequest == null ? HermesTokenRequest.getDefaultInstance() : hermesTokenRequest;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.MessengerOnDeviceServiceOrBuilder
        public HermesTokenRequestOrBuilder getHermesTokenRequestOrBuilder() {
            HermesTokenRequest hermesTokenRequest = this.hermesTokenRequest_;
            return hermesTokenRequest == null ? HermesTokenRequest.getDefaultInstance() : hermesTokenRequest;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.MessengerOnDeviceServiceOrBuilder
        public HermesTokenResponse getHermesTokenResponse() {
            HermesTokenResponse hermesTokenResponse = this.hermesTokenResponse_;
            return hermesTokenResponse == null ? HermesTokenResponse.getDefaultInstance() : hermesTokenResponse;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.MessengerOnDeviceServiceOrBuilder
        public HermesTokenResponseOrBuilder getHermesTokenResponseOrBuilder() {
            HermesTokenResponse hermesTokenResponse = this.hermesTokenResponse_;
            return hermesTokenResponse == null ? HermesTokenResponse.getDefaultInstance() : hermesTokenResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<MessengerOnDeviceService> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getHermesTokenRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getHermesTokenResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getHermesProviderNotifications());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.MessengerOnDeviceServiceOrBuilder
        public boolean hasHermesProviderNotifications() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.MessengerOnDeviceServiceOrBuilder
        public boolean hasHermesTokenRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIMessengerOnDevice.MessengerOnDeviceServiceOrBuilder
        public boolean hasHermesTokenResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasHermesTokenRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getHermesTokenRequest().hashCode();
            }
            if (hasHermesTokenResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getHermesTokenResponse().hashCode();
            }
            if (hasHermesProviderNotifications()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getHermesProviderNotifications().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIMessengerOnDevice.internal_static_GDI_Proto_MessengerOnDevice_MessengerOnDeviceService_fieldAccessorTable.ensureFieldAccessorsInitialized(MessengerOnDeviceService.class, Builder.class);
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
            if (hasHermesTokenRequest() && !getHermesTokenRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasHermesTokenResponse() || getHermesTokenResponse().isInitialized()) {
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
            return new MessengerOnDeviceService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getHermesTokenRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getHermesTokenResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getHermesProviderNotifications());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MessengerOnDeviceServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<HermesProviderNotification, HermesProviderNotification.Builder, HermesProviderNotificationOrBuilder> hermesProviderNotificationsBuilder_;
            private HermesProviderNotification hermesProviderNotifications_;
            private SingleFieldBuilderV3<HermesTokenRequest, HermesTokenRequest.Builder, HermesTokenRequestOrBuilder> hermesTokenRequestBuilder_;
            private HermesTokenRequest hermesTokenRequest_;
            private SingleFieldBuilderV3<HermesTokenResponse, HermesTokenResponse.Builder, HermesTokenResponseOrBuilder> hermesTokenResponseBuilder_;
            private HermesTokenResponse hermesTokenResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(MessengerOnDeviceService messengerOnDeviceService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<HermesTokenRequest, HermesTokenRequest.Builder, HermesTokenRequestOrBuilder> singleFieldBuilderV3 = this.hermesTokenRequestBuilder_;
                    messengerOnDeviceService.hermesTokenRequest_ = singleFieldBuilderV3 == null ? this.hermesTokenRequest_ : (HermesTokenRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<HermesTokenResponse, HermesTokenResponse.Builder, HermesTokenResponseOrBuilder> singleFieldBuilderV4 = this.hermesTokenResponseBuilder_;
                    messengerOnDeviceService.hermesTokenResponse_ = singleFieldBuilderV4 == null ? this.hermesTokenResponse_ : (HermesTokenResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<HermesProviderNotification, HermesProviderNotification.Builder, HermesProviderNotificationOrBuilder> singleFieldBuilderV5 = this.hermesProviderNotificationsBuilder_;
                    messengerOnDeviceService.hermesProviderNotifications_ = singleFieldBuilderV5 == null ? this.hermesProviderNotifications_ : (HermesProviderNotification) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                messengerOnDeviceService.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIMessengerOnDevice.internal_static_GDI_Proto_MessengerOnDevice_MessengerOnDeviceService_descriptor;
            }

            private SingleFieldBuilderV3<HermesProviderNotification, HermesProviderNotification.Builder, HermesProviderNotificationOrBuilder> getHermesProviderNotificationsFieldBuilder() {
                if (this.hermesProviderNotificationsBuilder_ == null) {
                    this.hermesProviderNotificationsBuilder_ = new SingleFieldBuilderV3<>(getHermesProviderNotifications(), getParentForChildren(), isClean());
                    this.hermesProviderNotifications_ = null;
                }
                return this.hermesProviderNotificationsBuilder_;
            }

            private SingleFieldBuilderV3<HermesTokenRequest, HermesTokenRequest.Builder, HermesTokenRequestOrBuilder> getHermesTokenRequestFieldBuilder() {
                if (this.hermesTokenRequestBuilder_ == null) {
                    this.hermesTokenRequestBuilder_ = new SingleFieldBuilderV3<>(getHermesTokenRequest(), getParentForChildren(), isClean());
                    this.hermesTokenRequest_ = null;
                }
                return this.hermesTokenRequestBuilder_;
            }

            private SingleFieldBuilderV3<HermesTokenResponse, HermesTokenResponse.Builder, HermesTokenResponseOrBuilder> getHermesTokenResponseFieldBuilder() {
                if (this.hermesTokenResponseBuilder_ == null) {
                    this.hermesTokenResponseBuilder_ = new SingleFieldBuilderV3<>(getHermesTokenResponse(), getParentForChildren(), isClean());
                    this.hermesTokenResponse_ = null;
                }
                return this.hermesTokenResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getHermesTokenRequestFieldBuilder();
                    getHermesTokenResponseFieldBuilder();
                    getHermesProviderNotificationsFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MessengerOnDeviceService build() {
                MessengerOnDeviceService messengerOnDeviceServiceBuildPartial = buildPartial();
                if (messengerOnDeviceServiceBuildPartial.isInitialized()) {
                    return messengerOnDeviceServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) messengerOnDeviceServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MessengerOnDeviceService buildPartial() {
                MessengerOnDeviceService messengerOnDeviceService = new MessengerOnDeviceService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(messengerOnDeviceService);
                }
                onBuilt();
                return messengerOnDeviceService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.hermesTokenRequest_ = null;
                SingleFieldBuilderV3<HermesTokenRequest, HermesTokenRequest.Builder, HermesTokenRequestOrBuilder> singleFieldBuilderV3 = this.hermesTokenRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.hermesTokenRequestBuilder_ = null;
                }
                this.hermesTokenResponse_ = null;
                SingleFieldBuilderV3<HermesTokenResponse, HermesTokenResponse.Builder, HermesTokenResponseOrBuilder> singleFieldBuilderV4 = this.hermesTokenResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.hermesTokenResponseBuilder_ = null;
                }
                this.hermesProviderNotifications_ = null;
                SingleFieldBuilderV3<HermesProviderNotification, HermesProviderNotification.Builder, HermesProviderNotificationOrBuilder> singleFieldBuilderV5 = this.hermesProviderNotificationsBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.hermesProviderNotificationsBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearHermesProviderNotifications() {
                this.bitField0_ &= -5;
                this.hermesProviderNotifications_ = null;
                SingleFieldBuilderV3<HermesProviderNotification, HermesProviderNotification.Builder, HermesProviderNotificationOrBuilder> singleFieldBuilderV3 = this.hermesProviderNotificationsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.hermesProviderNotificationsBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearHermesTokenRequest() {
                this.bitField0_ &= -2;
                this.hermesTokenRequest_ = null;
                SingleFieldBuilderV3<HermesTokenRequest, HermesTokenRequest.Builder, HermesTokenRequestOrBuilder> singleFieldBuilderV3 = this.hermesTokenRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.hermesTokenRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearHermesTokenResponse() {
                this.bitField0_ &= -3;
                this.hermesTokenResponse_ = null;
                SingleFieldBuilderV3<HermesTokenResponse, HermesTokenResponse.Builder, HermesTokenResponseOrBuilder> singleFieldBuilderV3 = this.hermesTokenResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.hermesTokenResponseBuilder_ = null;
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
                return GDIMessengerOnDevice.internal_static_GDI_Proto_MessengerOnDevice_MessengerOnDeviceService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.MessengerOnDeviceServiceOrBuilder
            public HermesProviderNotification getHermesProviderNotifications() {
                SingleFieldBuilderV3<HermesProviderNotification, HermesProviderNotification.Builder, HermesProviderNotificationOrBuilder> singleFieldBuilderV3 = this.hermesProviderNotificationsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HermesProviderNotification) singleFieldBuilderV3.getMessage();
                }
                HermesProviderNotification hermesProviderNotification = this.hermesProviderNotifications_;
                return hermesProviderNotification == null ? HermesProviderNotification.getDefaultInstance() : hermesProviderNotification;
            }

            public HermesProviderNotification.Builder getHermesProviderNotificationsBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (HermesProviderNotification.Builder) getHermesProviderNotificationsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.MessengerOnDeviceServiceOrBuilder
            public HermesProviderNotificationOrBuilder getHermesProviderNotificationsOrBuilder() {
                SingleFieldBuilderV3<HermesProviderNotification, HermesProviderNotification.Builder, HermesProviderNotificationOrBuilder> singleFieldBuilderV3 = this.hermesProviderNotificationsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HermesProviderNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                HermesProviderNotification hermesProviderNotification = this.hermesProviderNotifications_;
                return hermesProviderNotification == null ? HermesProviderNotification.getDefaultInstance() : hermesProviderNotification;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.MessengerOnDeviceServiceOrBuilder
            public HermesTokenRequest getHermesTokenRequest() {
                SingleFieldBuilderV3<HermesTokenRequest, HermesTokenRequest.Builder, HermesTokenRequestOrBuilder> singleFieldBuilderV3 = this.hermesTokenRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HermesTokenRequest) singleFieldBuilderV3.getMessage();
                }
                HermesTokenRequest hermesTokenRequest = this.hermesTokenRequest_;
                return hermesTokenRequest == null ? HermesTokenRequest.getDefaultInstance() : hermesTokenRequest;
            }

            public HermesTokenRequest.Builder getHermesTokenRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (HermesTokenRequest.Builder) getHermesTokenRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.MessengerOnDeviceServiceOrBuilder
            public HermesTokenRequestOrBuilder getHermesTokenRequestOrBuilder() {
                SingleFieldBuilderV3<HermesTokenRequest, HermesTokenRequest.Builder, HermesTokenRequestOrBuilder> singleFieldBuilderV3 = this.hermesTokenRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HermesTokenRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                HermesTokenRequest hermesTokenRequest = this.hermesTokenRequest_;
                return hermesTokenRequest == null ? HermesTokenRequest.getDefaultInstance() : hermesTokenRequest;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.MessengerOnDeviceServiceOrBuilder
            public HermesTokenResponse getHermesTokenResponse() {
                SingleFieldBuilderV3<HermesTokenResponse, HermesTokenResponse.Builder, HermesTokenResponseOrBuilder> singleFieldBuilderV3 = this.hermesTokenResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HermesTokenResponse) singleFieldBuilderV3.getMessage();
                }
                HermesTokenResponse hermesTokenResponse = this.hermesTokenResponse_;
                return hermesTokenResponse == null ? HermesTokenResponse.getDefaultInstance() : hermesTokenResponse;
            }

            public HermesTokenResponse.Builder getHermesTokenResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (HermesTokenResponse.Builder) getHermesTokenResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.MessengerOnDeviceServiceOrBuilder
            public HermesTokenResponseOrBuilder getHermesTokenResponseOrBuilder() {
                SingleFieldBuilderV3<HermesTokenResponse, HermesTokenResponse.Builder, HermesTokenResponseOrBuilder> singleFieldBuilderV3 = this.hermesTokenResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (HermesTokenResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                HermesTokenResponse hermesTokenResponse = this.hermesTokenResponse_;
                return hermesTokenResponse == null ? HermesTokenResponse.getDefaultInstance() : hermesTokenResponse;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.MessengerOnDeviceServiceOrBuilder
            public boolean hasHermesProviderNotifications() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.MessengerOnDeviceServiceOrBuilder
            public boolean hasHermesTokenRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIMessengerOnDevice.MessengerOnDeviceServiceOrBuilder
            public boolean hasHermesTokenResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIMessengerOnDevice.internal_static_GDI_Proto_MessengerOnDevice_MessengerOnDeviceService_fieldAccessorTable.ensureFieldAccessorsInitialized(MessengerOnDeviceService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasHermesTokenRequest() || getHermesTokenRequest().isInitialized()) {
                    return !hasHermesTokenResponse() || getHermesTokenResponse().isInitialized();
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
                                    codedInputStream.readMessage(getHermesTokenRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getHermesTokenResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getHermesProviderNotificationsFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeHermesProviderNotifications(HermesProviderNotification hermesProviderNotification) {
                HermesProviderNotification hermesProviderNotification2;
                SingleFieldBuilderV3<HermesProviderNotification, HermesProviderNotification.Builder, HermesProviderNotificationOrBuilder> singleFieldBuilderV3 = this.hermesProviderNotificationsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(hermesProviderNotification);
                } else if ((this.bitField0_ & 4) == 0 || (hermesProviderNotification2 = this.hermesProviderNotifications_) == null || hermesProviderNotification2 == HermesProviderNotification.getDefaultInstance()) {
                    this.hermesProviderNotifications_ = hermesProviderNotification;
                } else {
                    getHermesProviderNotificationsBuilder().mergeFrom(hermesProviderNotification);
                }
                if (this.hermesProviderNotifications_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeHermesTokenRequest(HermesTokenRequest hermesTokenRequest) {
                HermesTokenRequest hermesTokenRequest2;
                SingleFieldBuilderV3<HermesTokenRequest, HermesTokenRequest.Builder, HermesTokenRequestOrBuilder> singleFieldBuilderV3 = this.hermesTokenRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(hermesTokenRequest);
                } else if ((this.bitField0_ & 1) == 0 || (hermesTokenRequest2 = this.hermesTokenRequest_) == null || hermesTokenRequest2 == HermesTokenRequest.getDefaultInstance()) {
                    this.hermesTokenRequest_ = hermesTokenRequest;
                } else {
                    getHermesTokenRequestBuilder().mergeFrom(hermesTokenRequest);
                }
                if (this.hermesTokenRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeHermesTokenResponse(HermesTokenResponse hermesTokenResponse) {
                HermesTokenResponse hermesTokenResponse2;
                SingleFieldBuilderV3<HermesTokenResponse, HermesTokenResponse.Builder, HermesTokenResponseOrBuilder> singleFieldBuilderV3 = this.hermesTokenResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(hermesTokenResponse);
                } else if ((this.bitField0_ & 2) == 0 || (hermesTokenResponse2 = this.hermesTokenResponse_) == null || hermesTokenResponse2 == HermesTokenResponse.getDefaultInstance()) {
                    this.hermesTokenResponse_ = hermesTokenResponse;
                } else {
                    getHermesTokenResponseBuilder().mergeFrom(hermesTokenResponse);
                }
                if (this.hermesTokenResponse_ != null) {
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

            public Builder setHermesProviderNotifications(HermesProviderNotification.Builder builder) {
                SingleFieldBuilderV3<HermesProviderNotification, HermesProviderNotification.Builder, HermesProviderNotificationOrBuilder> singleFieldBuilderV3 = this.hermesProviderNotificationsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.hermesProviderNotifications_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setHermesTokenRequest(HermesTokenRequest.Builder builder) {
                SingleFieldBuilderV3<HermesTokenRequest, HermesTokenRequest.Builder, HermesTokenRequestOrBuilder> singleFieldBuilderV3 = this.hermesTokenRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.hermesTokenRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setHermesTokenResponse(HermesTokenResponse.Builder builder) {
                SingleFieldBuilderV3<HermesTokenResponse, HermesTokenResponse.Builder, HermesTokenResponseOrBuilder> singleFieldBuilderV3 = this.hermesTokenResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.hermesTokenResponse_ = builder.build();
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
            public MessengerOnDeviceService getDefaultInstanceForType() {
                return MessengerOnDeviceService.getDefaultInstance();
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

            public Builder setHermesProviderNotifications(HermesProviderNotification hermesProviderNotification) {
                SingleFieldBuilderV3<HermesProviderNotification, HermesProviderNotification.Builder, HermesProviderNotificationOrBuilder> singleFieldBuilderV3 = this.hermesProviderNotificationsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    hermesProviderNotification.getClass();
                    this.hermesProviderNotifications_ = hermesProviderNotification;
                } else {
                    singleFieldBuilderV3.setMessage(hermesProviderNotification);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setHermesTokenRequest(HermesTokenRequest hermesTokenRequest) {
                SingleFieldBuilderV3<HermesTokenRequest, HermesTokenRequest.Builder, HermesTokenRequestOrBuilder> singleFieldBuilderV3 = this.hermesTokenRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    hermesTokenRequest.getClass();
                    this.hermesTokenRequest_ = hermesTokenRequest;
                } else {
                    singleFieldBuilderV3.setMessage(hermesTokenRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setHermesTokenResponse(HermesTokenResponse hermesTokenResponse) {
                SingleFieldBuilderV3<HermesTokenResponse, HermesTokenResponse.Builder, HermesTokenResponseOrBuilder> singleFieldBuilderV3 = this.hermesTokenResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    hermesTokenResponse.getClass();
                    this.hermesTokenResponse_ = hermesTokenResponse;
                } else {
                    singleFieldBuilderV3.setMessage(hermesTokenResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof MessengerOnDeviceService) {
                    return mergeFrom((MessengerOnDeviceService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(MessengerOnDeviceService messengerOnDeviceService) {
                if (messengerOnDeviceService == MessengerOnDeviceService.getDefaultInstance()) {
                    return this;
                }
                if (messengerOnDeviceService.hasHermesTokenRequest()) {
                    mergeHermesTokenRequest(messengerOnDeviceService.getHermesTokenRequest());
                }
                if (messengerOnDeviceService.hasHermesTokenResponse()) {
                    mergeHermesTokenResponse(messengerOnDeviceService.getHermesTokenResponse());
                }
                if (messengerOnDeviceService.hasHermesProviderNotifications()) {
                    mergeHermesProviderNotifications(messengerOnDeviceService.getHermesProviderNotifications());
                }
                mergeUnknownFields(messengerOnDeviceService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public MessengerOnDeviceService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ MessengerOnDeviceService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private MessengerOnDeviceService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MessengerOnDeviceService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MessengerOnDeviceService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MessengerOnDeviceService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static MessengerOnDeviceService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MessengerOnDeviceService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static MessengerOnDeviceService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static MessengerOnDeviceService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static MessengerOnDeviceService parseFrom(InputStream inputStream) {
            return (MessengerOnDeviceService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static MessengerOnDeviceService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MessengerOnDeviceService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MessengerOnDeviceService parseFrom(CodedInputStream codedInputStream) {
            return (MessengerOnDeviceService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static MessengerOnDeviceService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MessengerOnDeviceService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public enum HermesEnvironment implements ProtocolMessageEnum {
        DEV(1),
        TEST(2),
        PRODUCTION(3);

        public static final int DEV_VALUE = 1;
        public static final int PRODUCTION_VALUE = 3;
        public static final int TEST_VALUE = 2;
        private final int value;
        private static final Internal.EnumLiteMap<HermesEnvironment> internalValueMap = new Internal.EnumLiteMap<HermesEnvironment>() { // from class: com.garmin.proto.generated.GDIMessengerOnDevice.HermesEnvironment.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public HermesEnvironment findValueByNumber(int i14) {
                return HermesEnvironment.forNumber(i14);
            }
        };
        private static final HermesEnvironment[] VALUES = values();

        HermesEnvironment(int i14) {
            this.value = i14;
        }

        public static HermesEnvironment forNumber(int i14) {
            if (i14 == 1) {
                return DEV;
            }
            if (i14 == 2) {
                return TEST;
            }
            if (i14 != 3) {
                return null;
            }
            return PRODUCTION;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIMessengerOnDevice.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<HermesEnvironment> internalGetValueMap() {
            return internalValueMap;
        }

        public static HermesEnvironment valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static HermesEnvironment valueOf(int i14) {
            return forNumber(i14);
        }
    }
}
