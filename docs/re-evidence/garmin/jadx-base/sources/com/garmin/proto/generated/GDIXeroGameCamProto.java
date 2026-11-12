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
public final class GDIXeroGameCamProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0014GDIXeroGameCam.proto\u0012\u0015GDI.Proto.XeroGameCam\"\u0093\u0004\n\u0007Service\u0012R\n\u001ainitial_setup_info_request\u0018\u0001 \u0001(\u000b2..GDI.Proto.XeroGameCam.InitialSetupInfoRequest\u0012T\n\u001binitial_setup_info_response\u0018\u0002 \u0001(\u000b2/.GDI.Proto.XeroGameCam.InitialSetupInfoResponse\u0012J\n\u0016switch_to_wifi_request\u0018\u0003 \u0001(\u000b2*.GDI.Proto.XeroGameCam.SwitchToWifiRequest\u0012L\n\u0017switch_to_wifi_response\u0018\u0004 \u0001(\u000b2+.GDI.Proto.XeroGameCam.SwitchToWifiResponse\u0012`\n!start_outdoors_activation_request\u0018\u0005 \u0001(\u000b25.GDI.Proto.XeroGameCam.StartOutdoorsActivationRequest\u0012b\n\"start_outdoors_activation_response\u0018\u0006 \u0001(\u000b26.GDI.Proto.XeroGameCam.StartOutdoorsActivationResponse\"\u0019\n\u0017InitialSetupInfoRequest\"µ\u0001\n\u0018InitialSetupInfoResponse\u0012\f\n\u0004IMEI\u0018\u0001 \u0001(\t\u0012U\n\twifi_data\u0018\u0002 \u0001(\u000b2B.GDI.Proto.XeroGameCam.InitialSetupInfoResponse.WifiConnectionData\u001a4\n\u0012WifiConnectionData\u0012\f\n\u0004ssid\u0018\u0001 \u0001(\t\u0012\u0010\n\bpassword\u0018\u0002 \u0001(\t\"\u0015\n\u0013SwitchToWifiRequest\"\u0096\u0001\n\u0014SwitchToWifiResponse\u0012B\n\u0006status\u0018\u0001 \u0001(\u000e22.GDI.Proto.XeroGameCam.SwitchToWifiResponse.Status\":\n\u0006Status\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u000b\n\u0007SUCCESS\u0010\u0001\u0012\u0016\n\u0012PIN_SWITCH_FAILURE\u0010\u0002\" \n\u001eStartOutdoorsActivationRequest\"\u0094\u0001\n\u001fStartOutdoorsActivationResponse\u0012M\n\u0006status\u0018\u0001 \u0001(\u000e2=.GDI.Proto.XeroGameCam.StartOutdoorsActivationResponse.Status\"\"\n\u0006Status\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u000b\n\u0007SUCCESS\u0010\u0001B3\n\u001acom.garmin.proto.generatedB\u0013GDIXeroGameCamProtoH\u0003"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XeroGameCam_InitialSetupInfoRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XeroGameCam_InitialSetupInfoRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XeroGameCam_InitialSetupInfoResponse_WifiConnectionData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XeroGameCam_InitialSetupInfoResponse_WifiConnectionData_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XeroGameCam_InitialSetupInfoResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XeroGameCam_InitialSetupInfoResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XeroGameCam_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XeroGameCam_Service_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XeroGameCam_StartOutdoorsActivationRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XeroGameCam_StartOutdoorsActivationRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XeroGameCam_StartOutdoorsActivationResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XeroGameCam_StartOutdoorsActivationResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XeroGameCam_SwitchToWifiRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XeroGameCam_SwitchToWifiRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_XeroGameCam_SwitchToWifiResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_XeroGameCam_SwitchToWifiResponse_fieldAccessorTable;

    public interface InitialSetupInfoRequestOrBuilder extends MessageOrBuilder {
    }

    public interface InitialSetupInfoResponseOrBuilder extends MessageOrBuilder {
        String getIMEI();

        ByteString getIMEIBytes();

        InitialSetupInfoResponse.WifiConnectionData getWifiData();

        InitialSetupInfoResponse.WifiConnectionDataOrBuilder getWifiDataOrBuilder();

        boolean hasIMEI();

        boolean hasWifiData();
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
        InitialSetupInfoRequest getInitialSetupInfoRequest();

        InitialSetupInfoRequestOrBuilder getInitialSetupInfoRequestOrBuilder();

        InitialSetupInfoResponse getInitialSetupInfoResponse();

        InitialSetupInfoResponseOrBuilder getInitialSetupInfoResponseOrBuilder();

        StartOutdoorsActivationRequest getStartOutdoorsActivationRequest();

        StartOutdoorsActivationRequestOrBuilder getStartOutdoorsActivationRequestOrBuilder();

        StartOutdoorsActivationResponse getStartOutdoorsActivationResponse();

        StartOutdoorsActivationResponseOrBuilder getStartOutdoorsActivationResponseOrBuilder();

        SwitchToWifiRequest getSwitchToWifiRequest();

        SwitchToWifiRequestOrBuilder getSwitchToWifiRequestOrBuilder();

        SwitchToWifiResponse getSwitchToWifiResponse();

        SwitchToWifiResponseOrBuilder getSwitchToWifiResponseOrBuilder();

        boolean hasInitialSetupInfoRequest();

        boolean hasInitialSetupInfoResponse();

        boolean hasStartOutdoorsActivationRequest();

        boolean hasStartOutdoorsActivationResponse();

        boolean hasSwitchToWifiRequest();

        boolean hasSwitchToWifiResponse();
    }

    public interface StartOutdoorsActivationRequestOrBuilder extends MessageOrBuilder {
    }

    public interface StartOutdoorsActivationResponseOrBuilder extends MessageOrBuilder {
        StartOutdoorsActivationResponse.Status getStatus();

        boolean hasStatus();
    }

    public interface SwitchToWifiRequestOrBuilder extends MessageOrBuilder {
    }

    public interface SwitchToWifiResponseOrBuilder extends MessageOrBuilder {
        SwitchToWifiResponse.Status getStatus();

        boolean hasStatus();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_XeroGameCam_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_XeroGameCam_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"InitialSetupInfoRequest", "InitialSetupInfoResponse", "SwitchToWifiRequest", "SwitchToWifiResponse", "StartOutdoorsActivationRequest", "StartOutdoorsActivationResponse"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_XeroGameCam_InitialSetupInfoRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_XeroGameCam_InitialSetupInfoRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[0]);
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_XeroGameCam_InitialSetupInfoResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_XeroGameCam_InitialSetupInfoResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"IMEI", "WifiData"});
        Descriptors.Descriptor descriptor5 = descriptor4.getNestedTypes().get(0);
        internal_static_GDI_Proto_XeroGameCam_InitialSetupInfoResponse_WifiConnectionData_descriptor = descriptor5;
        internal_static_GDI_Proto_XeroGameCam_InitialSetupInfoResponse_WifiConnectionData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Ssid", "Password"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_XeroGameCam_SwitchToWifiRequest_descriptor = descriptor6;
        internal_static_GDI_Proto_XeroGameCam_SwitchToWifiRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[0]);
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_XeroGameCam_SwitchToWifiResponse_descriptor = descriptor7;
        internal_static_GDI_Proto_XeroGameCam_SwitchToWifiResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Status"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_XeroGameCam_StartOutdoorsActivationRequest_descriptor = descriptor8;
        internal_static_GDI_Proto_XeroGameCam_StartOutdoorsActivationRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[0]);
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_XeroGameCam_StartOutdoorsActivationResponse_descriptor = descriptor9;
        internal_static_GDI_Proto_XeroGameCam_StartOutdoorsActivationResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Status"});
    }

    private GDIXeroGameCamProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class InitialSetupInfoRequest extends GeneratedMessageV3 implements InitialSetupInfoRequestOrBuilder {
        private static final InitialSetupInfoRequest DEFAULT_INSTANCE = new InitialSetupInfoRequest();

        @Deprecated
        public static final Parser<InitialSetupInfoRequest> PARSER = new AbstractParser<InitialSetupInfoRequest>() { // from class: com.garmin.proto.generated.GDIXeroGameCamProto.InitialSetupInfoRequest.1
            @Override // com.google.protobuf.Parser
            public InitialSetupInfoRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = InitialSetupInfoRequest.newBuilder();
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

        private InitialSetupInfoRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static InitialSetupInfoRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_InitialSetupInfoRequest_descriptor;
        }

        public static Builder newBuilder(InitialSetupInfoRequest initialSetupInfoRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(initialSetupInfoRequest);
        }

        public static InitialSetupInfoRequest parseDelimitedFrom(InputStream inputStream) {
            return (InitialSetupInfoRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static InitialSetupInfoRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<InitialSetupInfoRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof InitialSetupInfoRequest) {
                return getUnknownFields().equals(((InitialSetupInfoRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<InitialSetupInfoRequest> getParserForType() {
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
            return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_InitialSetupInfoRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(InitialSetupInfoRequest.class, Builder.class);
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
            return new InitialSetupInfoRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements InitialSetupInfoRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_InitialSetupInfoRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InitialSetupInfoRequest build() {
                InitialSetupInfoRequest initialSetupInfoRequestBuildPartial = buildPartial();
                if (initialSetupInfoRequestBuildPartial.isInitialized()) {
                    return initialSetupInfoRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) initialSetupInfoRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InitialSetupInfoRequest buildPartial() {
                InitialSetupInfoRequest initialSetupInfoRequest = new InitialSetupInfoRequest(this);
                onBuilt();
                return initialSetupInfoRequest;
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
                return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_InitialSetupInfoRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_InitialSetupInfoRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(InitialSetupInfoRequest.class, Builder.class);
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
            public InitialSetupInfoRequest getDefaultInstanceForType() {
                return InitialSetupInfoRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof InitialSetupInfoRequest) {
                    return mergeFrom((InitialSetupInfoRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(InitialSetupInfoRequest initialSetupInfoRequest) {
                if (initialSetupInfoRequest == InitialSetupInfoRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(initialSetupInfoRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public InitialSetupInfoRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ InitialSetupInfoRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private InitialSetupInfoRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static InitialSetupInfoRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InitialSetupInfoRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InitialSetupInfoRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static InitialSetupInfoRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static InitialSetupInfoRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static InitialSetupInfoRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static InitialSetupInfoRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static InitialSetupInfoRequest parseFrom(InputStream inputStream) {
            return (InitialSetupInfoRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static InitialSetupInfoRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InitialSetupInfoRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InitialSetupInfoRequest parseFrom(CodedInputStream codedInputStream) {
            return (InitialSetupInfoRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static InitialSetupInfoRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InitialSetupInfoRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class StartOutdoorsActivationRequest extends GeneratedMessageV3 implements StartOutdoorsActivationRequestOrBuilder {
        private static final StartOutdoorsActivationRequest DEFAULT_INSTANCE = new StartOutdoorsActivationRequest();

        @Deprecated
        public static final Parser<StartOutdoorsActivationRequest> PARSER = new AbstractParser<StartOutdoorsActivationRequest>() { // from class: com.garmin.proto.generated.GDIXeroGameCamProto.StartOutdoorsActivationRequest.1
            @Override // com.google.protobuf.Parser
            public StartOutdoorsActivationRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StartOutdoorsActivationRequest.newBuilder();
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

        private StartOutdoorsActivationRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StartOutdoorsActivationRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_StartOutdoorsActivationRequest_descriptor;
        }

        public static Builder newBuilder(StartOutdoorsActivationRequest startOutdoorsActivationRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(startOutdoorsActivationRequest);
        }

        public static StartOutdoorsActivationRequest parseDelimitedFrom(InputStream inputStream) {
            return (StartOutdoorsActivationRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StartOutdoorsActivationRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StartOutdoorsActivationRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof StartOutdoorsActivationRequest) {
                return getUnknownFields().equals(((StartOutdoorsActivationRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StartOutdoorsActivationRequest> getParserForType() {
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
            return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_StartOutdoorsActivationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StartOutdoorsActivationRequest.class, Builder.class);
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
            return new StartOutdoorsActivationRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StartOutdoorsActivationRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_StartOutdoorsActivationRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StartOutdoorsActivationRequest build() {
                StartOutdoorsActivationRequest startOutdoorsActivationRequestBuildPartial = buildPartial();
                if (startOutdoorsActivationRequestBuildPartial.isInitialized()) {
                    return startOutdoorsActivationRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) startOutdoorsActivationRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StartOutdoorsActivationRequest buildPartial() {
                StartOutdoorsActivationRequest startOutdoorsActivationRequest = new StartOutdoorsActivationRequest(this);
                onBuilt();
                return startOutdoorsActivationRequest;
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
                return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_StartOutdoorsActivationRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_StartOutdoorsActivationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(StartOutdoorsActivationRequest.class, Builder.class);
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
            public StartOutdoorsActivationRequest getDefaultInstanceForType() {
                return StartOutdoorsActivationRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof StartOutdoorsActivationRequest) {
                    return mergeFrom((StartOutdoorsActivationRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StartOutdoorsActivationRequest startOutdoorsActivationRequest) {
                if (startOutdoorsActivationRequest == StartOutdoorsActivationRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(startOutdoorsActivationRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StartOutdoorsActivationRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ StartOutdoorsActivationRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private StartOutdoorsActivationRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StartOutdoorsActivationRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartOutdoorsActivationRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StartOutdoorsActivationRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static StartOutdoorsActivationRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StartOutdoorsActivationRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StartOutdoorsActivationRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StartOutdoorsActivationRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StartOutdoorsActivationRequest parseFrom(InputStream inputStream) {
            return (StartOutdoorsActivationRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StartOutdoorsActivationRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartOutdoorsActivationRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StartOutdoorsActivationRequest parseFrom(CodedInputStream codedInputStream) {
            return (StartOutdoorsActivationRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StartOutdoorsActivationRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartOutdoorsActivationRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SwitchToWifiRequest extends GeneratedMessageV3 implements SwitchToWifiRequestOrBuilder {
        private static final SwitchToWifiRequest DEFAULT_INSTANCE = new SwitchToWifiRequest();

        @Deprecated
        public static final Parser<SwitchToWifiRequest> PARSER = new AbstractParser<SwitchToWifiRequest>() { // from class: com.garmin.proto.generated.GDIXeroGameCamProto.SwitchToWifiRequest.1
            @Override // com.google.protobuf.Parser
            public SwitchToWifiRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SwitchToWifiRequest.newBuilder();
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

        private SwitchToWifiRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SwitchToWifiRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_SwitchToWifiRequest_descriptor;
        }

        public static Builder newBuilder(SwitchToWifiRequest switchToWifiRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(switchToWifiRequest);
        }

        public static SwitchToWifiRequest parseDelimitedFrom(InputStream inputStream) {
            return (SwitchToWifiRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SwitchToWifiRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SwitchToWifiRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof SwitchToWifiRequest) {
                return getUnknownFields().equals(((SwitchToWifiRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SwitchToWifiRequest> getParserForType() {
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
            return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_SwitchToWifiRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SwitchToWifiRequest.class, Builder.class);
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
            return new SwitchToWifiRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SwitchToWifiRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_SwitchToWifiRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwitchToWifiRequest build() {
                SwitchToWifiRequest switchToWifiRequestBuildPartial = buildPartial();
                if (switchToWifiRequestBuildPartial.isInitialized()) {
                    return switchToWifiRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) switchToWifiRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwitchToWifiRequest buildPartial() {
                SwitchToWifiRequest switchToWifiRequest = new SwitchToWifiRequest(this);
                onBuilt();
                return switchToWifiRequest;
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
                return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_SwitchToWifiRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_SwitchToWifiRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SwitchToWifiRequest.class, Builder.class);
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
            public SwitchToWifiRequest getDefaultInstanceForType() {
                return SwitchToWifiRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SwitchToWifiRequest) {
                    return mergeFrom((SwitchToWifiRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SwitchToWifiRequest switchToWifiRequest) {
                if (switchToWifiRequest == SwitchToWifiRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(switchToWifiRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SwitchToWifiRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ SwitchToWifiRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SwitchToWifiRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SwitchToWifiRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwitchToWifiRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwitchToWifiRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SwitchToWifiRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SwitchToWifiRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SwitchToWifiRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SwitchToWifiRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SwitchToWifiRequest parseFrom(InputStream inputStream) {
            return (SwitchToWifiRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SwitchToWifiRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwitchToWifiRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwitchToWifiRequest parseFrom(CodedInputStream codedInputStream) {
            return (SwitchToWifiRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SwitchToWifiRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwitchToWifiRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class InitialSetupInfoResponse extends GeneratedMessageV3 implements InitialSetupInfoResponseOrBuilder {
        public static final int IMEI_FIELD_NUMBER = 1;
        public static final int WIFI_DATA_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object iMEI_;
        private byte memoizedIsInitialized;
        private WifiConnectionData wifiData_;
        private static final InitialSetupInfoResponse DEFAULT_INSTANCE = new InitialSetupInfoResponse();

        @Deprecated
        public static final Parser<InitialSetupInfoResponse> PARSER = new AbstractParser<InitialSetupInfoResponse>() { // from class: com.garmin.proto.generated.GDIXeroGameCamProto.InitialSetupInfoResponse.1
            @Override // com.google.protobuf.Parser
            public InitialSetupInfoResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = InitialSetupInfoResponse.newBuilder();
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

        public interface WifiConnectionDataOrBuilder extends MessageOrBuilder {
            String getPassword();

            ByteString getPasswordBytes();

            String getSsid();

            ByteString getSsidBytes();

            boolean hasPassword();

            boolean hasSsid();
        }

        private InitialSetupInfoResponse() {
            this.iMEI_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.iMEI_ = "";
        }

        public static InitialSetupInfoResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_InitialSetupInfoResponse_descriptor;
        }

        public static Builder newBuilder(InitialSetupInfoResponse initialSetupInfoResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(initialSetupInfoResponse);
        }

        public static InitialSetupInfoResponse parseDelimitedFrom(InputStream inputStream) {
            return (InitialSetupInfoResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static InitialSetupInfoResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<InitialSetupInfoResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InitialSetupInfoResponse)) {
                return super.equals(obj);
            }
            InitialSetupInfoResponse initialSetupInfoResponse = (InitialSetupInfoResponse) obj;
            if (hasIMEI() != initialSetupInfoResponse.hasIMEI()) {
                return false;
            }
            if ((!hasIMEI() || getIMEI().equals(initialSetupInfoResponse.getIMEI())) && hasWifiData() == initialSetupInfoResponse.hasWifiData()) {
                return (!hasWifiData() || getWifiData().equals(initialSetupInfoResponse.getWifiData())) && getUnknownFields().equals(initialSetupInfoResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIXeroGameCamProto.InitialSetupInfoResponseOrBuilder
        public String getIMEI() {
            Object obj = this.iMEI_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.iMEI_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIXeroGameCamProto.InitialSetupInfoResponseOrBuilder
        public ByteString getIMEIBytes() {
            Object obj = this.iMEI_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.iMEI_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<InitialSetupInfoResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.iMEI_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(2, getWifiData());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXeroGameCamProto.InitialSetupInfoResponseOrBuilder
        public WifiConnectionData getWifiData() {
            WifiConnectionData wifiConnectionData = this.wifiData_;
            return wifiConnectionData == null ? WifiConnectionData.getDefaultInstance() : wifiConnectionData;
        }

        @Override // com.garmin.proto.generated.GDIXeroGameCamProto.InitialSetupInfoResponseOrBuilder
        public WifiConnectionDataOrBuilder getWifiDataOrBuilder() {
            WifiConnectionData wifiConnectionData = this.wifiData_;
            return wifiConnectionData == null ? WifiConnectionData.getDefaultInstance() : wifiConnectionData;
        }

        @Override // com.garmin.proto.generated.GDIXeroGameCamProto.InitialSetupInfoResponseOrBuilder
        public boolean hasIMEI() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroGameCamProto.InitialSetupInfoResponseOrBuilder
        public boolean hasWifiData() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasIMEI()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getIMEI().hashCode();
            }
            if (hasWifiData()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getWifiData().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_InitialSetupInfoResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(InitialSetupInfoResponse.class, Builder.class);
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
            return new InitialSetupInfoResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.iMEI_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getWifiData());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class WifiConnectionData extends GeneratedMessageV3 implements WifiConnectionDataOrBuilder {
            private static final WifiConnectionData DEFAULT_INSTANCE = new WifiConnectionData();

            @Deprecated
            public static final Parser<WifiConnectionData> PARSER = new AbstractParser<WifiConnectionData>() { // from class: com.garmin.proto.generated.GDIXeroGameCamProto.InitialSetupInfoResponse.WifiConnectionData.1
                @Override // com.google.protobuf.Parser
                public WifiConnectionData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = WifiConnectionData.newBuilder();
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
            public static final int PASSWORD_FIELD_NUMBER = 2;
            public static final int SSID_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private byte memoizedIsInitialized;
            private volatile Object password_;
            private volatile Object ssid_;

            private WifiConnectionData() {
                this.ssid_ = "";
                this.password_ = "";
                this.memoizedIsInitialized = (byte) -1;
                this.ssid_ = "";
                this.password_ = "";
            }

            public static WifiConnectionData getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_InitialSetupInfoResponse_WifiConnectionData_descriptor;
            }

            public static Builder newBuilder(WifiConnectionData wifiConnectionData) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(wifiConnectionData);
            }

            public static WifiConnectionData parseDelimitedFrom(InputStream inputStream) {
                return (WifiConnectionData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static WifiConnectionData parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<WifiConnectionData> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof WifiConnectionData)) {
                    return super.equals(obj);
                }
                WifiConnectionData wifiConnectionData = (WifiConnectionData) obj;
                if (hasSsid() != wifiConnectionData.hasSsid()) {
                    return false;
                }
                if ((!hasSsid() || getSsid().equals(wifiConnectionData.getSsid())) && hasPassword() == wifiConnectionData.hasPassword()) {
                    return (!hasPassword() || getPassword().equals(wifiConnectionData.getPassword())) && getUnknownFields().equals(wifiConnectionData.getUnknownFields());
                }
                return false;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<WifiConnectionData> getParserForType() {
                return PARSER;
            }

            @Override // com.garmin.proto.generated.GDIXeroGameCamProto.InitialSetupInfoResponse.WifiConnectionDataOrBuilder
            public String getPassword() {
                Object obj = this.password_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.password_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIXeroGameCamProto.InitialSetupInfoResponse.WifiConnectionDataOrBuilder
            public ByteString getPasswordBytes() {
                Object obj = this.password_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.password_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i14 = this.memoizedSize;
                if (i14 != -1) {
                    return i14;
                }
                int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.ssid_) : 0;
                if ((this.bitField0_ & 2) != 0) {
                    iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.password_);
                }
                int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.garmin.proto.generated.GDIXeroGameCamProto.InitialSetupInfoResponse.WifiConnectionDataOrBuilder
            public String getSsid() {
                Object obj = this.ssid_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.ssid_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIXeroGameCamProto.InitialSetupInfoResponse.WifiConnectionDataOrBuilder
            public ByteString getSsidBytes() {
                Object obj = this.ssid_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.ssid_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIXeroGameCamProto.InitialSetupInfoResponse.WifiConnectionDataOrBuilder
            public boolean hasPassword() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroGameCamProto.InitialSetupInfoResponse.WifiConnectionDataOrBuilder
            public boolean hasSsid() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i14 = this.memoizedHashCode;
                if (i14 != 0) {
                    return i14;
                }
                int iHashCode = getDescriptor().hashCode() + 779;
                if (hasSsid()) {
                    iHashCode = e5.c(iHashCode, 37, 1, 53) + getSsid().hashCode();
                }
                if (hasPassword()) {
                    iHashCode = e5.c(iHashCode, 37, 2, 53) + getPassword().hashCode();
                }
                int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_InitialSetupInfoResponse_WifiConnectionData_fieldAccessorTable.ensureFieldAccessorsInitialized(WifiConnectionData.class, Builder.class);
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
                return new WifiConnectionData();
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                int i14 = 0;
                return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                if ((this.bitField0_ & 1) != 0) {
                    GeneratedMessageV3.writeString(codedOutputStream, 1, this.ssid_);
                }
                if ((this.bitField0_ & 2) != 0) {
                    GeneratedMessageV3.writeString(codedOutputStream, 2, this.password_);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WifiConnectionDataOrBuilder {
                private int bitField0_;
                private Object password_;
                private Object ssid_;

                private Builder() {
                    this.ssid_ = "";
                    this.password_ = "";
                }

                private void buildPartial0(WifiConnectionData wifiConnectionData) {
                    int i14;
                    int i15 = this.bitField0_;
                    if ((i15 & 1) != 0) {
                        wifiConnectionData.ssid_ = this.ssid_;
                        i14 = 1;
                    } else {
                        i14 = 0;
                    }
                    if ((i15 & 2) != 0) {
                        wifiConnectionData.password_ = this.password_;
                        i14 |= 2;
                    }
                    wifiConnectionData.bitField0_ |= i14;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_InitialSetupInfoResponse_WifiConnectionData_descriptor;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public WifiConnectionData build() {
                    WifiConnectionData wifiConnectionDataBuildPartial = buildPartial();
                    if (wifiConnectionDataBuildPartial.isInitialized()) {
                        return wifiConnectionDataBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) wifiConnectionDataBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public WifiConnectionData buildPartial() {
                    WifiConnectionData wifiConnectionData = new WifiConnectionData(this);
                    if (this.bitField0_ != 0) {
                        buildPartial0(wifiConnectionData);
                    }
                    onBuilt();
                    return wifiConnectionData;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.ssid_ = "";
                    this.password_ = "";
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

                public Builder clearPassword() {
                    this.password_ = WifiConnectionData.getDefaultInstance().getPassword();
                    this.bitField0_ &= -3;
                    onChanged();
                    return this;
                }

                public Builder clearSsid() {
                    this.ssid_ = WifiConnectionData.getDefaultInstance().getSsid();
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
                    return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_InitialSetupInfoResponse_WifiConnectionData_descriptor;
                }

                @Override // com.garmin.proto.generated.GDIXeroGameCamProto.InitialSetupInfoResponse.WifiConnectionDataOrBuilder
                public String getPassword() {
                    Object obj = this.password_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String stringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.password_ = stringUtf8;
                    }
                    return stringUtf8;
                }

                @Override // com.garmin.proto.generated.GDIXeroGameCamProto.InitialSetupInfoResponse.WifiConnectionDataOrBuilder
                public ByteString getPasswordBytes() {
                    Object obj = this.password_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.password_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.garmin.proto.generated.GDIXeroGameCamProto.InitialSetupInfoResponse.WifiConnectionDataOrBuilder
                public String getSsid() {
                    Object obj = this.ssid_;
                    if (obj instanceof String) {
                        return (String) obj;
                    }
                    ByteString byteString = (ByteString) obj;
                    String stringUtf8 = byteString.toStringUtf8();
                    if (byteString.isValidUtf8()) {
                        this.ssid_ = stringUtf8;
                    }
                    return stringUtf8;
                }

                @Override // com.garmin.proto.generated.GDIXeroGameCamProto.InitialSetupInfoResponse.WifiConnectionDataOrBuilder
                public ByteString getSsidBytes() {
                    Object obj = this.ssid_;
                    if (!(obj instanceof String)) {
                        return (ByteString) obj;
                    }
                    ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                    this.ssid_ = byteStringCopyFromUtf8;
                    return byteStringCopyFromUtf8;
                }

                @Override // com.garmin.proto.generated.GDIXeroGameCamProto.InitialSetupInfoResponse.WifiConnectionDataOrBuilder
                public boolean hasPassword() {
                    return (this.bitField0_ & 2) != 0;
                }

                @Override // com.garmin.proto.generated.GDIXeroGameCamProto.InitialSetupInfoResponse.WifiConnectionDataOrBuilder
                public boolean hasSsid() {
                    return (this.bitField0_ & 1) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_InitialSetupInfoResponse_WifiConnectionData_fieldAccessorTable.ensureFieldAccessorsInitialized(WifiConnectionData.class, Builder.class);
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
                                        this.ssid_ = codedInputStream.readBytes();
                                        this.bitField0_ |= 1;
                                    } else if (tag == 18) {
                                        this.password_ = codedInputStream.readBytes();
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

                public Builder setPassword(String str) {
                    str.getClass();
                    this.password_ = str;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                public Builder setPasswordBytes(ByteString byteString) {
                    byteString.getClass();
                    this.password_ = byteString;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                    return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
                }

                public Builder setSsid(String str) {
                    str.getClass();
                    this.ssid_ = str;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setSsidBytes(ByteString byteString) {
                    byteString.getClass();
                    this.ssid_ = byteString;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.setUnknownFields(unknownFieldSet);
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public WifiConnectionData getDefaultInstanceForType() {
                    return WifiConnectionData.getDefaultInstance();
                }

                public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                    this(builderParent);
                }

                public /* synthetic */ Builder(int i14) {
                    this();
                }

                private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                    super(builderParent);
                    this.ssid_ = "";
                    this.password_ = "";
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof WifiConnectionData) {
                        return mergeFrom((WifiConnectionData) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(WifiConnectionData wifiConnectionData) {
                    if (wifiConnectionData == WifiConnectionData.getDefaultInstance()) {
                        return this;
                    }
                    if (wifiConnectionData.hasSsid()) {
                        this.ssid_ = wifiConnectionData.ssid_;
                        this.bitField0_ |= 1;
                        onChanged();
                    }
                    if (wifiConnectionData.hasPassword()) {
                        this.password_ = wifiConnectionData.password_;
                        this.bitField0_ |= 2;
                        onChanged();
                    }
                    mergeUnknownFields(wifiConnectionData.getUnknownFields());
                    onChanged();
                    return this;
                }
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public WifiConnectionData getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public static WifiConnectionData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (WifiConnectionData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static WifiConnectionData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static WifiConnectionData parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static WifiConnectionData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            public static WifiConnectionData parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            public static WifiConnectionData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static WifiConnectionData parseFrom(InputStream inputStream) {
                return (WifiConnectionData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static WifiConnectionData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (WifiConnectionData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            private WifiConnectionData(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.ssid_ = "";
                this.password_ = "";
                this.memoizedIsInitialized = (byte) -1;
            }

            public static WifiConnectionData parseFrom(CodedInputStream codedInputStream) {
                return (WifiConnectionData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static WifiConnectionData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (WifiConnectionData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }

            public /* synthetic */ WifiConnectionData(Builder builder) {
                this((GeneratedMessageV3.Builder<?>) builder);
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements InitialSetupInfoResponseOrBuilder {
            private int bitField0_;
            private Object iMEI_;
            private SingleFieldBuilderV3<WifiConnectionData, WifiConnectionData.Builder, WifiConnectionDataOrBuilder> wifiDataBuilder_;
            private WifiConnectionData wifiData_;

            private Builder() {
                this.iMEI_ = "";
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(InitialSetupInfoResponse initialSetupInfoResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    initialSetupInfoResponse.iMEI_ = this.iMEI_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<WifiConnectionData, WifiConnectionData.Builder, WifiConnectionDataOrBuilder> singleFieldBuilderV3 = this.wifiDataBuilder_;
                    initialSetupInfoResponse.wifiData_ = singleFieldBuilderV3 == null ? this.wifiData_ : (WifiConnectionData) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                initialSetupInfoResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_InitialSetupInfoResponse_descriptor;
            }

            private SingleFieldBuilderV3<WifiConnectionData, WifiConnectionData.Builder, WifiConnectionDataOrBuilder> getWifiDataFieldBuilder() {
                if (this.wifiDataBuilder_ == null) {
                    this.wifiDataBuilder_ = new SingleFieldBuilderV3<>(getWifiData(), getParentForChildren(), isClean());
                    this.wifiData_ = null;
                }
                return this.wifiDataBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getWifiDataFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InitialSetupInfoResponse build() {
                InitialSetupInfoResponse initialSetupInfoResponseBuildPartial = buildPartial();
                if (initialSetupInfoResponseBuildPartial.isInitialized()) {
                    return initialSetupInfoResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) initialSetupInfoResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InitialSetupInfoResponse buildPartial() {
                InitialSetupInfoResponse initialSetupInfoResponse = new InitialSetupInfoResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(initialSetupInfoResponse);
                }
                onBuilt();
                return initialSetupInfoResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.iMEI_ = "";
                this.wifiData_ = null;
                SingleFieldBuilderV3<WifiConnectionData, WifiConnectionData.Builder, WifiConnectionDataOrBuilder> singleFieldBuilderV3 = this.wifiDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.wifiDataBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearIMEI() {
                this.iMEI_ = InitialSetupInfoResponse.getDefaultInstance().getIMEI();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearWifiData() {
                this.bitField0_ &= -3;
                this.wifiData_ = null;
                SingleFieldBuilderV3<WifiConnectionData, WifiConnectionData.Builder, WifiConnectionDataOrBuilder> singleFieldBuilderV3 = this.wifiDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.wifiDataBuilder_ = null;
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
                return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_InitialSetupInfoResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXeroGameCamProto.InitialSetupInfoResponseOrBuilder
            public String getIMEI() {
                Object obj = this.iMEI_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.iMEI_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIXeroGameCamProto.InitialSetupInfoResponseOrBuilder
            public ByteString getIMEIBytes() {
                Object obj = this.iMEI_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.iMEI_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIXeroGameCamProto.InitialSetupInfoResponseOrBuilder
            public WifiConnectionData getWifiData() {
                SingleFieldBuilderV3<WifiConnectionData, WifiConnectionData.Builder, WifiConnectionDataOrBuilder> singleFieldBuilderV3 = this.wifiDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WifiConnectionData) singleFieldBuilderV3.getMessage();
                }
                WifiConnectionData wifiConnectionData = this.wifiData_;
                return wifiConnectionData == null ? WifiConnectionData.getDefaultInstance() : wifiConnectionData;
            }

            public WifiConnectionData.Builder getWifiDataBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (WifiConnectionData.Builder) getWifiDataFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXeroGameCamProto.InitialSetupInfoResponseOrBuilder
            public WifiConnectionDataOrBuilder getWifiDataOrBuilder() {
                SingleFieldBuilderV3<WifiConnectionData, WifiConnectionData.Builder, WifiConnectionDataOrBuilder> singleFieldBuilderV3 = this.wifiDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WifiConnectionDataOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                WifiConnectionData wifiConnectionData = this.wifiData_;
                return wifiConnectionData == null ? WifiConnectionData.getDefaultInstance() : wifiConnectionData;
            }

            @Override // com.garmin.proto.generated.GDIXeroGameCamProto.InitialSetupInfoResponseOrBuilder
            public boolean hasIMEI() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroGameCamProto.InitialSetupInfoResponseOrBuilder
            public boolean hasWifiData() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_InitialSetupInfoResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(InitialSetupInfoResponse.class, Builder.class);
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
                                    this.iMEI_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getWifiDataFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeWifiData(WifiConnectionData wifiConnectionData) {
                WifiConnectionData wifiConnectionData2;
                SingleFieldBuilderV3<WifiConnectionData, WifiConnectionData.Builder, WifiConnectionDataOrBuilder> singleFieldBuilderV3 = this.wifiDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(wifiConnectionData);
                } else if ((this.bitField0_ & 2) == 0 || (wifiConnectionData2 = this.wifiData_) == null || wifiConnectionData2 == WifiConnectionData.getDefaultInstance()) {
                    this.wifiData_ = wifiConnectionData;
                } else {
                    getWifiDataBuilder().mergeFrom(wifiConnectionData);
                }
                if (this.wifiData_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setIMEI(String str) {
                str.getClass();
                this.iMEI_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setIMEIBytes(ByteString byteString) {
                byteString.getClass();
                this.iMEI_ = byteString;
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

            public Builder setWifiData(WifiConnectionData.Builder builder) {
                SingleFieldBuilderV3<WifiConnectionData, WifiConnectionData.Builder, WifiConnectionDataOrBuilder> singleFieldBuilderV3 = this.wifiDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.wifiData_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public InitialSetupInfoResponse getDefaultInstanceForType() {
                return InitialSetupInfoResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.iMEI_ = "";
                maybeForceBuilderInitialization();
            }

            public Builder setWifiData(WifiConnectionData wifiConnectionData) {
                SingleFieldBuilderV3<WifiConnectionData, WifiConnectionData.Builder, WifiConnectionDataOrBuilder> singleFieldBuilderV3 = this.wifiDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    wifiConnectionData.getClass();
                    this.wifiData_ = wifiConnectionData;
                } else {
                    singleFieldBuilderV3.setMessage(wifiConnectionData);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof InitialSetupInfoResponse) {
                    return mergeFrom((InitialSetupInfoResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(InitialSetupInfoResponse initialSetupInfoResponse) {
                if (initialSetupInfoResponse == InitialSetupInfoResponse.getDefaultInstance()) {
                    return this;
                }
                if (initialSetupInfoResponse.hasIMEI()) {
                    this.iMEI_ = initialSetupInfoResponse.iMEI_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (initialSetupInfoResponse.hasWifiData()) {
                    mergeWifiData(initialSetupInfoResponse.getWifiData());
                }
                mergeUnknownFields(initialSetupInfoResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public InitialSetupInfoResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static InitialSetupInfoResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InitialSetupInfoResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InitialSetupInfoResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static InitialSetupInfoResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static InitialSetupInfoResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static InitialSetupInfoResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private InitialSetupInfoResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.iMEI_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static InitialSetupInfoResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static InitialSetupInfoResponse parseFrom(InputStream inputStream) {
            return (InitialSetupInfoResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ InitialSetupInfoResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static InitialSetupInfoResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InitialSetupInfoResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InitialSetupInfoResponse parseFrom(CodedInputStream codedInputStream) {
            return (InitialSetupInfoResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static InitialSetupInfoResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InitialSetupInfoResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        public static final int INITIAL_SETUP_INFO_REQUEST_FIELD_NUMBER = 1;
        public static final int INITIAL_SETUP_INFO_RESPONSE_FIELD_NUMBER = 2;
        public static final int START_OUTDOORS_ACTIVATION_REQUEST_FIELD_NUMBER = 5;
        public static final int START_OUTDOORS_ACTIVATION_RESPONSE_FIELD_NUMBER = 6;
        public static final int SWITCH_TO_WIFI_REQUEST_FIELD_NUMBER = 3;
        public static final int SWITCH_TO_WIFI_RESPONSE_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private InitialSetupInfoRequest initialSetupInfoRequest_;
        private InitialSetupInfoResponse initialSetupInfoResponse_;
        private byte memoizedIsInitialized;
        private StartOutdoorsActivationRequest startOutdoorsActivationRequest_;
        private StartOutdoorsActivationResponse startOutdoorsActivationResponse_;
        private SwitchToWifiRequest switchToWifiRequest_;
        private SwitchToWifiResponse switchToWifiResponse_;
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDIXeroGameCamProto.Service.1
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
            return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_Service_descriptor;
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
            if (hasInitialSetupInfoRequest() != service.hasInitialSetupInfoRequest()) {
                return false;
            }
            if ((hasInitialSetupInfoRequest() && !getInitialSetupInfoRequest().equals(service.getInitialSetupInfoRequest())) || hasInitialSetupInfoResponse() != service.hasInitialSetupInfoResponse()) {
                return false;
            }
            if ((hasInitialSetupInfoResponse() && !getInitialSetupInfoResponse().equals(service.getInitialSetupInfoResponse())) || hasSwitchToWifiRequest() != service.hasSwitchToWifiRequest()) {
                return false;
            }
            if ((hasSwitchToWifiRequest() && !getSwitchToWifiRequest().equals(service.getSwitchToWifiRequest())) || hasSwitchToWifiResponse() != service.hasSwitchToWifiResponse()) {
                return false;
            }
            if ((hasSwitchToWifiResponse() && !getSwitchToWifiResponse().equals(service.getSwitchToWifiResponse())) || hasStartOutdoorsActivationRequest() != service.hasStartOutdoorsActivationRequest()) {
                return false;
            }
            if ((!hasStartOutdoorsActivationRequest() || getStartOutdoorsActivationRequest().equals(service.getStartOutdoorsActivationRequest())) && hasStartOutdoorsActivationResponse() == service.hasStartOutdoorsActivationResponse()) {
                return (!hasStartOutdoorsActivationResponse() || getStartOutdoorsActivationResponse().equals(service.getStartOutdoorsActivationResponse())) && getUnknownFields().equals(service.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIXeroGameCamProto.ServiceOrBuilder
        public InitialSetupInfoRequest getInitialSetupInfoRequest() {
            InitialSetupInfoRequest initialSetupInfoRequest = this.initialSetupInfoRequest_;
            return initialSetupInfoRequest == null ? InitialSetupInfoRequest.getDefaultInstance() : initialSetupInfoRequest;
        }

        @Override // com.garmin.proto.generated.GDIXeroGameCamProto.ServiceOrBuilder
        public InitialSetupInfoRequestOrBuilder getInitialSetupInfoRequestOrBuilder() {
            InitialSetupInfoRequest initialSetupInfoRequest = this.initialSetupInfoRequest_;
            return initialSetupInfoRequest == null ? InitialSetupInfoRequest.getDefaultInstance() : initialSetupInfoRequest;
        }

        @Override // com.garmin.proto.generated.GDIXeroGameCamProto.ServiceOrBuilder
        public InitialSetupInfoResponse getInitialSetupInfoResponse() {
            InitialSetupInfoResponse initialSetupInfoResponse = this.initialSetupInfoResponse_;
            return initialSetupInfoResponse == null ? InitialSetupInfoResponse.getDefaultInstance() : initialSetupInfoResponse;
        }

        @Override // com.garmin.proto.generated.GDIXeroGameCamProto.ServiceOrBuilder
        public InitialSetupInfoResponseOrBuilder getInitialSetupInfoResponseOrBuilder() {
            InitialSetupInfoResponse initialSetupInfoResponse = this.initialSetupInfoResponse_;
            return initialSetupInfoResponse == null ? InitialSetupInfoResponse.getDefaultInstance() : initialSetupInfoResponse;
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
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getInitialSetupInfoRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getInitialSetupInfoResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getSwitchToWifiRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getSwitchToWifiResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getStartOutdoorsActivationRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getStartOutdoorsActivationResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIXeroGameCamProto.ServiceOrBuilder
        public StartOutdoorsActivationRequest getStartOutdoorsActivationRequest() {
            StartOutdoorsActivationRequest startOutdoorsActivationRequest = this.startOutdoorsActivationRequest_;
            return startOutdoorsActivationRequest == null ? StartOutdoorsActivationRequest.getDefaultInstance() : startOutdoorsActivationRequest;
        }

        @Override // com.garmin.proto.generated.GDIXeroGameCamProto.ServiceOrBuilder
        public StartOutdoorsActivationRequestOrBuilder getStartOutdoorsActivationRequestOrBuilder() {
            StartOutdoorsActivationRequest startOutdoorsActivationRequest = this.startOutdoorsActivationRequest_;
            return startOutdoorsActivationRequest == null ? StartOutdoorsActivationRequest.getDefaultInstance() : startOutdoorsActivationRequest;
        }

        @Override // com.garmin.proto.generated.GDIXeroGameCamProto.ServiceOrBuilder
        public StartOutdoorsActivationResponse getStartOutdoorsActivationResponse() {
            StartOutdoorsActivationResponse startOutdoorsActivationResponse = this.startOutdoorsActivationResponse_;
            return startOutdoorsActivationResponse == null ? StartOutdoorsActivationResponse.getDefaultInstance() : startOutdoorsActivationResponse;
        }

        @Override // com.garmin.proto.generated.GDIXeroGameCamProto.ServiceOrBuilder
        public StartOutdoorsActivationResponseOrBuilder getStartOutdoorsActivationResponseOrBuilder() {
            StartOutdoorsActivationResponse startOutdoorsActivationResponse = this.startOutdoorsActivationResponse_;
            return startOutdoorsActivationResponse == null ? StartOutdoorsActivationResponse.getDefaultInstance() : startOutdoorsActivationResponse;
        }

        @Override // com.garmin.proto.generated.GDIXeroGameCamProto.ServiceOrBuilder
        public SwitchToWifiRequest getSwitchToWifiRequest() {
            SwitchToWifiRequest switchToWifiRequest = this.switchToWifiRequest_;
            return switchToWifiRequest == null ? SwitchToWifiRequest.getDefaultInstance() : switchToWifiRequest;
        }

        @Override // com.garmin.proto.generated.GDIXeroGameCamProto.ServiceOrBuilder
        public SwitchToWifiRequestOrBuilder getSwitchToWifiRequestOrBuilder() {
            SwitchToWifiRequest switchToWifiRequest = this.switchToWifiRequest_;
            return switchToWifiRequest == null ? SwitchToWifiRequest.getDefaultInstance() : switchToWifiRequest;
        }

        @Override // com.garmin.proto.generated.GDIXeroGameCamProto.ServiceOrBuilder
        public SwitchToWifiResponse getSwitchToWifiResponse() {
            SwitchToWifiResponse switchToWifiResponse = this.switchToWifiResponse_;
            return switchToWifiResponse == null ? SwitchToWifiResponse.getDefaultInstance() : switchToWifiResponse;
        }

        @Override // com.garmin.proto.generated.GDIXeroGameCamProto.ServiceOrBuilder
        public SwitchToWifiResponseOrBuilder getSwitchToWifiResponseOrBuilder() {
            SwitchToWifiResponse switchToWifiResponse = this.switchToWifiResponse_;
            return switchToWifiResponse == null ? SwitchToWifiResponse.getDefaultInstance() : switchToWifiResponse;
        }

        @Override // com.garmin.proto.generated.GDIXeroGameCamProto.ServiceOrBuilder
        public boolean hasInitialSetupInfoRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroGameCamProto.ServiceOrBuilder
        public boolean hasInitialSetupInfoResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroGameCamProto.ServiceOrBuilder
        public boolean hasStartOutdoorsActivationRequest() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroGameCamProto.ServiceOrBuilder
        public boolean hasStartOutdoorsActivationResponse() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroGameCamProto.ServiceOrBuilder
        public boolean hasSwitchToWifiRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIXeroGameCamProto.ServiceOrBuilder
        public boolean hasSwitchToWifiResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasInitialSetupInfoRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getInitialSetupInfoRequest().hashCode();
            }
            if (hasInitialSetupInfoResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getInitialSetupInfoResponse().hashCode();
            }
            if (hasSwitchToWifiRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getSwitchToWifiRequest().hashCode();
            }
            if (hasSwitchToWifiResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getSwitchToWifiResponse().hashCode();
            }
            if (hasStartOutdoorsActivationRequest()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getStartOutdoorsActivationRequest().hashCode();
            }
            if (hasStartOutdoorsActivationResponse()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getStartOutdoorsActivationResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getInitialSetupInfoRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getInitialSetupInfoResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getSwitchToWifiRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getSwitchToWifiResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getStartOutdoorsActivationRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getStartOutdoorsActivationResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<InitialSetupInfoRequest, InitialSetupInfoRequest.Builder, InitialSetupInfoRequestOrBuilder> initialSetupInfoRequestBuilder_;
            private InitialSetupInfoRequest initialSetupInfoRequest_;
            private SingleFieldBuilderV3<InitialSetupInfoResponse, InitialSetupInfoResponse.Builder, InitialSetupInfoResponseOrBuilder> initialSetupInfoResponseBuilder_;
            private InitialSetupInfoResponse initialSetupInfoResponse_;
            private SingleFieldBuilderV3<StartOutdoorsActivationRequest, StartOutdoorsActivationRequest.Builder, StartOutdoorsActivationRequestOrBuilder> startOutdoorsActivationRequestBuilder_;
            private StartOutdoorsActivationRequest startOutdoorsActivationRequest_;
            private SingleFieldBuilderV3<StartOutdoorsActivationResponse, StartOutdoorsActivationResponse.Builder, StartOutdoorsActivationResponseOrBuilder> startOutdoorsActivationResponseBuilder_;
            private StartOutdoorsActivationResponse startOutdoorsActivationResponse_;
            private SingleFieldBuilderV3<SwitchToWifiRequest, SwitchToWifiRequest.Builder, SwitchToWifiRequestOrBuilder> switchToWifiRequestBuilder_;
            private SwitchToWifiRequest switchToWifiRequest_;
            private SingleFieldBuilderV3<SwitchToWifiResponse, SwitchToWifiResponse.Builder, SwitchToWifiResponseOrBuilder> switchToWifiResponseBuilder_;
            private SwitchToWifiResponse switchToWifiResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Service service) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<InitialSetupInfoRequest, InitialSetupInfoRequest.Builder, InitialSetupInfoRequestOrBuilder> singleFieldBuilderV3 = this.initialSetupInfoRequestBuilder_;
                    service.initialSetupInfoRequest_ = singleFieldBuilderV3 == null ? this.initialSetupInfoRequest_ : (InitialSetupInfoRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<InitialSetupInfoResponse, InitialSetupInfoResponse.Builder, InitialSetupInfoResponseOrBuilder> singleFieldBuilderV4 = this.initialSetupInfoResponseBuilder_;
                    service.initialSetupInfoResponse_ = singleFieldBuilderV4 == null ? this.initialSetupInfoResponse_ : (InitialSetupInfoResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<SwitchToWifiRequest, SwitchToWifiRequest.Builder, SwitchToWifiRequestOrBuilder> singleFieldBuilderV5 = this.switchToWifiRequestBuilder_;
                    service.switchToWifiRequest_ = singleFieldBuilderV5 == null ? this.switchToWifiRequest_ : (SwitchToWifiRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<SwitchToWifiResponse, SwitchToWifiResponse.Builder, SwitchToWifiResponseOrBuilder> singleFieldBuilderV6 = this.switchToWifiResponseBuilder_;
                    service.switchToWifiResponse_ = singleFieldBuilderV6 == null ? this.switchToWifiResponse_ : (SwitchToWifiResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<StartOutdoorsActivationRequest, StartOutdoorsActivationRequest.Builder, StartOutdoorsActivationRequestOrBuilder> singleFieldBuilderV7 = this.startOutdoorsActivationRequestBuilder_;
                    service.startOutdoorsActivationRequest_ = singleFieldBuilderV7 == null ? this.startOutdoorsActivationRequest_ : (StartOutdoorsActivationRequest) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<StartOutdoorsActivationResponse, StartOutdoorsActivationResponse.Builder, StartOutdoorsActivationResponseOrBuilder> singleFieldBuilderV8 = this.startOutdoorsActivationResponseBuilder_;
                    service.startOutdoorsActivationResponse_ = singleFieldBuilderV8 == null ? this.startOutdoorsActivationResponse_ : (StartOutdoorsActivationResponse) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                service.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_Service_descriptor;
            }

            private SingleFieldBuilderV3<InitialSetupInfoRequest, InitialSetupInfoRequest.Builder, InitialSetupInfoRequestOrBuilder> getInitialSetupInfoRequestFieldBuilder() {
                if (this.initialSetupInfoRequestBuilder_ == null) {
                    this.initialSetupInfoRequestBuilder_ = new SingleFieldBuilderV3<>(getInitialSetupInfoRequest(), getParentForChildren(), isClean());
                    this.initialSetupInfoRequest_ = null;
                }
                return this.initialSetupInfoRequestBuilder_;
            }

            private SingleFieldBuilderV3<InitialSetupInfoResponse, InitialSetupInfoResponse.Builder, InitialSetupInfoResponseOrBuilder> getInitialSetupInfoResponseFieldBuilder() {
                if (this.initialSetupInfoResponseBuilder_ == null) {
                    this.initialSetupInfoResponseBuilder_ = new SingleFieldBuilderV3<>(getInitialSetupInfoResponse(), getParentForChildren(), isClean());
                    this.initialSetupInfoResponse_ = null;
                }
                return this.initialSetupInfoResponseBuilder_;
            }

            private SingleFieldBuilderV3<StartOutdoorsActivationRequest, StartOutdoorsActivationRequest.Builder, StartOutdoorsActivationRequestOrBuilder> getStartOutdoorsActivationRequestFieldBuilder() {
                if (this.startOutdoorsActivationRequestBuilder_ == null) {
                    this.startOutdoorsActivationRequestBuilder_ = new SingleFieldBuilderV3<>(getStartOutdoorsActivationRequest(), getParentForChildren(), isClean());
                    this.startOutdoorsActivationRequest_ = null;
                }
                return this.startOutdoorsActivationRequestBuilder_;
            }

            private SingleFieldBuilderV3<StartOutdoorsActivationResponse, StartOutdoorsActivationResponse.Builder, StartOutdoorsActivationResponseOrBuilder> getStartOutdoorsActivationResponseFieldBuilder() {
                if (this.startOutdoorsActivationResponseBuilder_ == null) {
                    this.startOutdoorsActivationResponseBuilder_ = new SingleFieldBuilderV3<>(getStartOutdoorsActivationResponse(), getParentForChildren(), isClean());
                    this.startOutdoorsActivationResponse_ = null;
                }
                return this.startOutdoorsActivationResponseBuilder_;
            }

            private SingleFieldBuilderV3<SwitchToWifiRequest, SwitchToWifiRequest.Builder, SwitchToWifiRequestOrBuilder> getSwitchToWifiRequestFieldBuilder() {
                if (this.switchToWifiRequestBuilder_ == null) {
                    this.switchToWifiRequestBuilder_ = new SingleFieldBuilderV3<>(getSwitchToWifiRequest(), getParentForChildren(), isClean());
                    this.switchToWifiRequest_ = null;
                }
                return this.switchToWifiRequestBuilder_;
            }

            private SingleFieldBuilderV3<SwitchToWifiResponse, SwitchToWifiResponse.Builder, SwitchToWifiResponseOrBuilder> getSwitchToWifiResponseFieldBuilder() {
                if (this.switchToWifiResponseBuilder_ == null) {
                    this.switchToWifiResponseBuilder_ = new SingleFieldBuilderV3<>(getSwitchToWifiResponse(), getParentForChildren(), isClean());
                    this.switchToWifiResponse_ = null;
                }
                return this.switchToWifiResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getInitialSetupInfoRequestFieldBuilder();
                    getInitialSetupInfoResponseFieldBuilder();
                    getSwitchToWifiRequestFieldBuilder();
                    getSwitchToWifiResponseFieldBuilder();
                    getStartOutdoorsActivationRequestFieldBuilder();
                    getStartOutdoorsActivationResponseFieldBuilder();
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
                this.initialSetupInfoRequest_ = null;
                SingleFieldBuilderV3<InitialSetupInfoRequest, InitialSetupInfoRequest.Builder, InitialSetupInfoRequestOrBuilder> singleFieldBuilderV3 = this.initialSetupInfoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.initialSetupInfoRequestBuilder_ = null;
                }
                this.initialSetupInfoResponse_ = null;
                SingleFieldBuilderV3<InitialSetupInfoResponse, InitialSetupInfoResponse.Builder, InitialSetupInfoResponseOrBuilder> singleFieldBuilderV4 = this.initialSetupInfoResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.initialSetupInfoResponseBuilder_ = null;
                }
                this.switchToWifiRequest_ = null;
                SingleFieldBuilderV3<SwitchToWifiRequest, SwitchToWifiRequest.Builder, SwitchToWifiRequestOrBuilder> singleFieldBuilderV5 = this.switchToWifiRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.switchToWifiRequestBuilder_ = null;
                }
                this.switchToWifiResponse_ = null;
                SingleFieldBuilderV3<SwitchToWifiResponse, SwitchToWifiResponse.Builder, SwitchToWifiResponseOrBuilder> singleFieldBuilderV6 = this.switchToWifiResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.switchToWifiResponseBuilder_ = null;
                }
                this.startOutdoorsActivationRequest_ = null;
                SingleFieldBuilderV3<StartOutdoorsActivationRequest, StartOutdoorsActivationRequest.Builder, StartOutdoorsActivationRequestOrBuilder> singleFieldBuilderV7 = this.startOutdoorsActivationRequestBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.startOutdoorsActivationRequestBuilder_ = null;
                }
                this.startOutdoorsActivationResponse_ = null;
                SingleFieldBuilderV3<StartOutdoorsActivationResponse, StartOutdoorsActivationResponse.Builder, StartOutdoorsActivationResponseOrBuilder> singleFieldBuilderV8 = this.startOutdoorsActivationResponseBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.startOutdoorsActivationResponseBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearInitialSetupInfoRequest() {
                this.bitField0_ &= -2;
                this.initialSetupInfoRequest_ = null;
                SingleFieldBuilderV3<InitialSetupInfoRequest, InitialSetupInfoRequest.Builder, InitialSetupInfoRequestOrBuilder> singleFieldBuilderV3 = this.initialSetupInfoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.initialSetupInfoRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearInitialSetupInfoResponse() {
                this.bitField0_ &= -3;
                this.initialSetupInfoResponse_ = null;
                SingleFieldBuilderV3<InitialSetupInfoResponse, InitialSetupInfoResponse.Builder, InitialSetupInfoResponseOrBuilder> singleFieldBuilderV3 = this.initialSetupInfoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.initialSetupInfoResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearStartOutdoorsActivationRequest() {
                this.bitField0_ &= -17;
                this.startOutdoorsActivationRequest_ = null;
                SingleFieldBuilderV3<StartOutdoorsActivationRequest, StartOutdoorsActivationRequest.Builder, StartOutdoorsActivationRequestOrBuilder> singleFieldBuilderV3 = this.startOutdoorsActivationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.startOutdoorsActivationRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStartOutdoorsActivationResponse() {
                this.bitField0_ &= -33;
                this.startOutdoorsActivationResponse_ = null;
                SingleFieldBuilderV3<StartOutdoorsActivationResponse, StartOutdoorsActivationResponse.Builder, StartOutdoorsActivationResponseOrBuilder> singleFieldBuilderV3 = this.startOutdoorsActivationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.startOutdoorsActivationResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSwitchToWifiRequest() {
                this.bitField0_ &= -5;
                this.switchToWifiRequest_ = null;
                SingleFieldBuilderV3<SwitchToWifiRequest, SwitchToWifiRequest.Builder, SwitchToWifiRequestOrBuilder> singleFieldBuilderV3 = this.switchToWifiRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.switchToWifiRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSwitchToWifiResponse() {
                this.bitField0_ &= -9;
                this.switchToWifiResponse_ = null;
                SingleFieldBuilderV3<SwitchToWifiResponse, SwitchToWifiResponse.Builder, SwitchToWifiResponseOrBuilder> singleFieldBuilderV3 = this.switchToWifiResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.switchToWifiResponseBuilder_ = null;
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
                return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXeroGameCamProto.ServiceOrBuilder
            public InitialSetupInfoRequest getInitialSetupInfoRequest() {
                SingleFieldBuilderV3<InitialSetupInfoRequest, InitialSetupInfoRequest.Builder, InitialSetupInfoRequestOrBuilder> singleFieldBuilderV3 = this.initialSetupInfoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (InitialSetupInfoRequest) singleFieldBuilderV3.getMessage();
                }
                InitialSetupInfoRequest initialSetupInfoRequest = this.initialSetupInfoRequest_;
                return initialSetupInfoRequest == null ? InitialSetupInfoRequest.getDefaultInstance() : initialSetupInfoRequest;
            }

            public InitialSetupInfoRequest.Builder getInitialSetupInfoRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (InitialSetupInfoRequest.Builder) getInitialSetupInfoRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXeroGameCamProto.ServiceOrBuilder
            public InitialSetupInfoRequestOrBuilder getInitialSetupInfoRequestOrBuilder() {
                SingleFieldBuilderV3<InitialSetupInfoRequest, InitialSetupInfoRequest.Builder, InitialSetupInfoRequestOrBuilder> singleFieldBuilderV3 = this.initialSetupInfoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (InitialSetupInfoRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                InitialSetupInfoRequest initialSetupInfoRequest = this.initialSetupInfoRequest_;
                return initialSetupInfoRequest == null ? InitialSetupInfoRequest.getDefaultInstance() : initialSetupInfoRequest;
            }

            @Override // com.garmin.proto.generated.GDIXeroGameCamProto.ServiceOrBuilder
            public InitialSetupInfoResponse getInitialSetupInfoResponse() {
                SingleFieldBuilderV3<InitialSetupInfoResponse, InitialSetupInfoResponse.Builder, InitialSetupInfoResponseOrBuilder> singleFieldBuilderV3 = this.initialSetupInfoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (InitialSetupInfoResponse) singleFieldBuilderV3.getMessage();
                }
                InitialSetupInfoResponse initialSetupInfoResponse = this.initialSetupInfoResponse_;
                return initialSetupInfoResponse == null ? InitialSetupInfoResponse.getDefaultInstance() : initialSetupInfoResponse;
            }

            public InitialSetupInfoResponse.Builder getInitialSetupInfoResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (InitialSetupInfoResponse.Builder) getInitialSetupInfoResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXeroGameCamProto.ServiceOrBuilder
            public InitialSetupInfoResponseOrBuilder getInitialSetupInfoResponseOrBuilder() {
                SingleFieldBuilderV3<InitialSetupInfoResponse, InitialSetupInfoResponse.Builder, InitialSetupInfoResponseOrBuilder> singleFieldBuilderV3 = this.initialSetupInfoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (InitialSetupInfoResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                InitialSetupInfoResponse initialSetupInfoResponse = this.initialSetupInfoResponse_;
                return initialSetupInfoResponse == null ? InitialSetupInfoResponse.getDefaultInstance() : initialSetupInfoResponse;
            }

            @Override // com.garmin.proto.generated.GDIXeroGameCamProto.ServiceOrBuilder
            public StartOutdoorsActivationRequest getStartOutdoorsActivationRequest() {
                SingleFieldBuilderV3<StartOutdoorsActivationRequest, StartOutdoorsActivationRequest.Builder, StartOutdoorsActivationRequestOrBuilder> singleFieldBuilderV3 = this.startOutdoorsActivationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StartOutdoorsActivationRequest) singleFieldBuilderV3.getMessage();
                }
                StartOutdoorsActivationRequest startOutdoorsActivationRequest = this.startOutdoorsActivationRequest_;
                return startOutdoorsActivationRequest == null ? StartOutdoorsActivationRequest.getDefaultInstance() : startOutdoorsActivationRequest;
            }

            public StartOutdoorsActivationRequest.Builder getStartOutdoorsActivationRequestBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (StartOutdoorsActivationRequest.Builder) getStartOutdoorsActivationRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXeroGameCamProto.ServiceOrBuilder
            public StartOutdoorsActivationRequestOrBuilder getStartOutdoorsActivationRequestOrBuilder() {
                SingleFieldBuilderV3<StartOutdoorsActivationRequest, StartOutdoorsActivationRequest.Builder, StartOutdoorsActivationRequestOrBuilder> singleFieldBuilderV3 = this.startOutdoorsActivationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StartOutdoorsActivationRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StartOutdoorsActivationRequest startOutdoorsActivationRequest = this.startOutdoorsActivationRequest_;
                return startOutdoorsActivationRequest == null ? StartOutdoorsActivationRequest.getDefaultInstance() : startOutdoorsActivationRequest;
            }

            @Override // com.garmin.proto.generated.GDIXeroGameCamProto.ServiceOrBuilder
            public StartOutdoorsActivationResponse getStartOutdoorsActivationResponse() {
                SingleFieldBuilderV3<StartOutdoorsActivationResponse, StartOutdoorsActivationResponse.Builder, StartOutdoorsActivationResponseOrBuilder> singleFieldBuilderV3 = this.startOutdoorsActivationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StartOutdoorsActivationResponse) singleFieldBuilderV3.getMessage();
                }
                StartOutdoorsActivationResponse startOutdoorsActivationResponse = this.startOutdoorsActivationResponse_;
                return startOutdoorsActivationResponse == null ? StartOutdoorsActivationResponse.getDefaultInstance() : startOutdoorsActivationResponse;
            }

            public StartOutdoorsActivationResponse.Builder getStartOutdoorsActivationResponseBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (StartOutdoorsActivationResponse.Builder) getStartOutdoorsActivationResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXeroGameCamProto.ServiceOrBuilder
            public StartOutdoorsActivationResponseOrBuilder getStartOutdoorsActivationResponseOrBuilder() {
                SingleFieldBuilderV3<StartOutdoorsActivationResponse, StartOutdoorsActivationResponse.Builder, StartOutdoorsActivationResponseOrBuilder> singleFieldBuilderV3 = this.startOutdoorsActivationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (StartOutdoorsActivationResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                StartOutdoorsActivationResponse startOutdoorsActivationResponse = this.startOutdoorsActivationResponse_;
                return startOutdoorsActivationResponse == null ? StartOutdoorsActivationResponse.getDefaultInstance() : startOutdoorsActivationResponse;
            }

            @Override // com.garmin.proto.generated.GDIXeroGameCamProto.ServiceOrBuilder
            public SwitchToWifiRequest getSwitchToWifiRequest() {
                SingleFieldBuilderV3<SwitchToWifiRequest, SwitchToWifiRequest.Builder, SwitchToWifiRequestOrBuilder> singleFieldBuilderV3 = this.switchToWifiRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwitchToWifiRequest) singleFieldBuilderV3.getMessage();
                }
                SwitchToWifiRequest switchToWifiRequest = this.switchToWifiRequest_;
                return switchToWifiRequest == null ? SwitchToWifiRequest.getDefaultInstance() : switchToWifiRequest;
            }

            public SwitchToWifiRequest.Builder getSwitchToWifiRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (SwitchToWifiRequest.Builder) getSwitchToWifiRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXeroGameCamProto.ServiceOrBuilder
            public SwitchToWifiRequestOrBuilder getSwitchToWifiRequestOrBuilder() {
                SingleFieldBuilderV3<SwitchToWifiRequest, SwitchToWifiRequest.Builder, SwitchToWifiRequestOrBuilder> singleFieldBuilderV3 = this.switchToWifiRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwitchToWifiRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SwitchToWifiRequest switchToWifiRequest = this.switchToWifiRequest_;
                return switchToWifiRequest == null ? SwitchToWifiRequest.getDefaultInstance() : switchToWifiRequest;
            }

            @Override // com.garmin.proto.generated.GDIXeroGameCamProto.ServiceOrBuilder
            public SwitchToWifiResponse getSwitchToWifiResponse() {
                SingleFieldBuilderV3<SwitchToWifiResponse, SwitchToWifiResponse.Builder, SwitchToWifiResponseOrBuilder> singleFieldBuilderV3 = this.switchToWifiResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwitchToWifiResponse) singleFieldBuilderV3.getMessage();
                }
                SwitchToWifiResponse switchToWifiResponse = this.switchToWifiResponse_;
                return switchToWifiResponse == null ? SwitchToWifiResponse.getDefaultInstance() : switchToWifiResponse;
            }

            public SwitchToWifiResponse.Builder getSwitchToWifiResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (SwitchToWifiResponse.Builder) getSwitchToWifiResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIXeroGameCamProto.ServiceOrBuilder
            public SwitchToWifiResponseOrBuilder getSwitchToWifiResponseOrBuilder() {
                SingleFieldBuilderV3<SwitchToWifiResponse, SwitchToWifiResponse.Builder, SwitchToWifiResponseOrBuilder> singleFieldBuilderV3 = this.switchToWifiResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwitchToWifiResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SwitchToWifiResponse switchToWifiResponse = this.switchToWifiResponse_;
                return switchToWifiResponse == null ? SwitchToWifiResponse.getDefaultInstance() : switchToWifiResponse;
            }

            @Override // com.garmin.proto.generated.GDIXeroGameCamProto.ServiceOrBuilder
            public boolean hasInitialSetupInfoRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroGameCamProto.ServiceOrBuilder
            public boolean hasInitialSetupInfoResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroGameCamProto.ServiceOrBuilder
            public boolean hasStartOutdoorsActivationRequest() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroGameCamProto.ServiceOrBuilder
            public boolean hasStartOutdoorsActivationResponse() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroGameCamProto.ServiceOrBuilder
            public boolean hasSwitchToWifiRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIXeroGameCamProto.ServiceOrBuilder
            public boolean hasSwitchToWifiResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
                                    codedInputStream.readMessage(getInitialSetupInfoRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getInitialSetupInfoResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getSwitchToWifiRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getSwitchToWifiResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(getStartOutdoorsActivationRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                } else if (tag == 50) {
                                    codedInputStream.readMessage(getStartOutdoorsActivationResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
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

            public Builder mergeInitialSetupInfoRequest(InitialSetupInfoRequest initialSetupInfoRequest) {
                InitialSetupInfoRequest initialSetupInfoRequest2;
                SingleFieldBuilderV3<InitialSetupInfoRequest, InitialSetupInfoRequest.Builder, InitialSetupInfoRequestOrBuilder> singleFieldBuilderV3 = this.initialSetupInfoRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(initialSetupInfoRequest);
                } else if ((this.bitField0_ & 1) == 0 || (initialSetupInfoRequest2 = this.initialSetupInfoRequest_) == null || initialSetupInfoRequest2 == InitialSetupInfoRequest.getDefaultInstance()) {
                    this.initialSetupInfoRequest_ = initialSetupInfoRequest;
                } else {
                    getInitialSetupInfoRequestBuilder().mergeFrom(initialSetupInfoRequest);
                }
                if (this.initialSetupInfoRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeInitialSetupInfoResponse(InitialSetupInfoResponse initialSetupInfoResponse) {
                InitialSetupInfoResponse initialSetupInfoResponse2;
                SingleFieldBuilderV3<InitialSetupInfoResponse, InitialSetupInfoResponse.Builder, InitialSetupInfoResponseOrBuilder> singleFieldBuilderV3 = this.initialSetupInfoResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(initialSetupInfoResponse);
                } else if ((this.bitField0_ & 2) == 0 || (initialSetupInfoResponse2 = this.initialSetupInfoResponse_) == null || initialSetupInfoResponse2 == InitialSetupInfoResponse.getDefaultInstance()) {
                    this.initialSetupInfoResponse_ = initialSetupInfoResponse;
                } else {
                    getInitialSetupInfoResponseBuilder().mergeFrom(initialSetupInfoResponse);
                }
                if (this.initialSetupInfoResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStartOutdoorsActivationRequest(StartOutdoorsActivationRequest startOutdoorsActivationRequest) {
                StartOutdoorsActivationRequest startOutdoorsActivationRequest2;
                SingleFieldBuilderV3<StartOutdoorsActivationRequest, StartOutdoorsActivationRequest.Builder, StartOutdoorsActivationRequestOrBuilder> singleFieldBuilderV3 = this.startOutdoorsActivationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(startOutdoorsActivationRequest);
                } else if ((this.bitField0_ & 16) == 0 || (startOutdoorsActivationRequest2 = this.startOutdoorsActivationRequest_) == null || startOutdoorsActivationRequest2 == StartOutdoorsActivationRequest.getDefaultInstance()) {
                    this.startOutdoorsActivationRequest_ = startOutdoorsActivationRequest;
                } else {
                    getStartOutdoorsActivationRequestBuilder().mergeFrom(startOutdoorsActivationRequest);
                }
                if (this.startOutdoorsActivationRequest_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStartOutdoorsActivationResponse(StartOutdoorsActivationResponse startOutdoorsActivationResponse) {
                StartOutdoorsActivationResponse startOutdoorsActivationResponse2;
                SingleFieldBuilderV3<StartOutdoorsActivationResponse, StartOutdoorsActivationResponse.Builder, StartOutdoorsActivationResponseOrBuilder> singleFieldBuilderV3 = this.startOutdoorsActivationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(startOutdoorsActivationResponse);
                } else if ((this.bitField0_ & 32) == 0 || (startOutdoorsActivationResponse2 = this.startOutdoorsActivationResponse_) == null || startOutdoorsActivationResponse2 == StartOutdoorsActivationResponse.getDefaultInstance()) {
                    this.startOutdoorsActivationResponse_ = startOutdoorsActivationResponse;
                } else {
                    getStartOutdoorsActivationResponseBuilder().mergeFrom(startOutdoorsActivationResponse);
                }
                if (this.startOutdoorsActivationResponse_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSwitchToWifiRequest(SwitchToWifiRequest switchToWifiRequest) {
                SwitchToWifiRequest switchToWifiRequest2;
                SingleFieldBuilderV3<SwitchToWifiRequest, SwitchToWifiRequest.Builder, SwitchToWifiRequestOrBuilder> singleFieldBuilderV3 = this.switchToWifiRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(switchToWifiRequest);
                } else if ((this.bitField0_ & 4) == 0 || (switchToWifiRequest2 = this.switchToWifiRequest_) == null || switchToWifiRequest2 == SwitchToWifiRequest.getDefaultInstance()) {
                    this.switchToWifiRequest_ = switchToWifiRequest;
                } else {
                    getSwitchToWifiRequestBuilder().mergeFrom(switchToWifiRequest);
                }
                if (this.switchToWifiRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSwitchToWifiResponse(SwitchToWifiResponse switchToWifiResponse) {
                SwitchToWifiResponse switchToWifiResponse2;
                SingleFieldBuilderV3<SwitchToWifiResponse, SwitchToWifiResponse.Builder, SwitchToWifiResponseOrBuilder> singleFieldBuilderV3 = this.switchToWifiResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(switchToWifiResponse);
                } else if ((this.bitField0_ & 8) == 0 || (switchToWifiResponse2 = this.switchToWifiResponse_) == null || switchToWifiResponse2 == SwitchToWifiResponse.getDefaultInstance()) {
                    this.switchToWifiResponse_ = switchToWifiResponse;
                } else {
                    getSwitchToWifiResponseBuilder().mergeFrom(switchToWifiResponse);
                }
                if (this.switchToWifiResponse_ != null) {
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

            public Builder setInitialSetupInfoRequest(InitialSetupInfoRequest.Builder builder) {
                SingleFieldBuilderV3<InitialSetupInfoRequest, InitialSetupInfoRequest.Builder, InitialSetupInfoRequestOrBuilder> singleFieldBuilderV3 = this.initialSetupInfoRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.initialSetupInfoRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setInitialSetupInfoResponse(InitialSetupInfoResponse.Builder builder) {
                SingleFieldBuilderV3<InitialSetupInfoResponse, InitialSetupInfoResponse.Builder, InitialSetupInfoResponseOrBuilder> singleFieldBuilderV3 = this.initialSetupInfoResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.initialSetupInfoResponse_ = builder.build();
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

            public Builder setStartOutdoorsActivationRequest(StartOutdoorsActivationRequest.Builder builder) {
                SingleFieldBuilderV3<StartOutdoorsActivationRequest, StartOutdoorsActivationRequest.Builder, StartOutdoorsActivationRequestOrBuilder> singleFieldBuilderV3 = this.startOutdoorsActivationRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.startOutdoorsActivationRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setStartOutdoorsActivationResponse(StartOutdoorsActivationResponse.Builder builder) {
                SingleFieldBuilderV3<StartOutdoorsActivationResponse, StartOutdoorsActivationResponse.Builder, StartOutdoorsActivationResponseOrBuilder> singleFieldBuilderV3 = this.startOutdoorsActivationResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.startOutdoorsActivationResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setSwitchToWifiRequest(SwitchToWifiRequest.Builder builder) {
                SingleFieldBuilderV3<SwitchToWifiRequest, SwitchToWifiRequest.Builder, SwitchToWifiRequestOrBuilder> singleFieldBuilderV3 = this.switchToWifiRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.switchToWifiRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSwitchToWifiResponse(SwitchToWifiResponse.Builder builder) {
                SingleFieldBuilderV3<SwitchToWifiResponse, SwitchToWifiResponse.Builder, SwitchToWifiResponseOrBuilder> singleFieldBuilderV3 = this.switchToWifiResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.switchToWifiResponse_ = builder.build();
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

            public Builder setInitialSetupInfoRequest(InitialSetupInfoRequest initialSetupInfoRequest) {
                SingleFieldBuilderV3<InitialSetupInfoRequest, InitialSetupInfoRequest.Builder, InitialSetupInfoRequestOrBuilder> singleFieldBuilderV3 = this.initialSetupInfoRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    initialSetupInfoRequest.getClass();
                    this.initialSetupInfoRequest_ = initialSetupInfoRequest;
                } else {
                    singleFieldBuilderV3.setMessage(initialSetupInfoRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setInitialSetupInfoResponse(InitialSetupInfoResponse initialSetupInfoResponse) {
                SingleFieldBuilderV3<InitialSetupInfoResponse, InitialSetupInfoResponse.Builder, InitialSetupInfoResponseOrBuilder> singleFieldBuilderV3 = this.initialSetupInfoResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    initialSetupInfoResponse.getClass();
                    this.initialSetupInfoResponse_ = initialSetupInfoResponse;
                } else {
                    singleFieldBuilderV3.setMessage(initialSetupInfoResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setStartOutdoorsActivationRequest(StartOutdoorsActivationRequest startOutdoorsActivationRequest) {
                SingleFieldBuilderV3<StartOutdoorsActivationRequest, StartOutdoorsActivationRequest.Builder, StartOutdoorsActivationRequestOrBuilder> singleFieldBuilderV3 = this.startOutdoorsActivationRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    startOutdoorsActivationRequest.getClass();
                    this.startOutdoorsActivationRequest_ = startOutdoorsActivationRequest;
                } else {
                    singleFieldBuilderV3.setMessage(startOutdoorsActivationRequest);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setStartOutdoorsActivationResponse(StartOutdoorsActivationResponse startOutdoorsActivationResponse) {
                SingleFieldBuilderV3<StartOutdoorsActivationResponse, StartOutdoorsActivationResponse.Builder, StartOutdoorsActivationResponseOrBuilder> singleFieldBuilderV3 = this.startOutdoorsActivationResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    startOutdoorsActivationResponse.getClass();
                    this.startOutdoorsActivationResponse_ = startOutdoorsActivationResponse;
                } else {
                    singleFieldBuilderV3.setMessage(startOutdoorsActivationResponse);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setSwitchToWifiRequest(SwitchToWifiRequest switchToWifiRequest) {
                SingleFieldBuilderV3<SwitchToWifiRequest, SwitchToWifiRequest.Builder, SwitchToWifiRequestOrBuilder> singleFieldBuilderV3 = this.switchToWifiRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    switchToWifiRequest.getClass();
                    this.switchToWifiRequest_ = switchToWifiRequest;
                } else {
                    singleFieldBuilderV3.setMessage(switchToWifiRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSwitchToWifiResponse(SwitchToWifiResponse switchToWifiResponse) {
                SingleFieldBuilderV3<SwitchToWifiResponse, SwitchToWifiResponse.Builder, SwitchToWifiResponseOrBuilder> singleFieldBuilderV3 = this.switchToWifiResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    switchToWifiResponse.getClass();
                    this.switchToWifiResponse_ = switchToWifiResponse;
                } else {
                    singleFieldBuilderV3.setMessage(switchToWifiResponse);
                }
                this.bitField0_ |= 8;
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
                if (service.hasInitialSetupInfoRequest()) {
                    mergeInitialSetupInfoRequest(service.getInitialSetupInfoRequest());
                }
                if (service.hasInitialSetupInfoResponse()) {
                    mergeInitialSetupInfoResponse(service.getInitialSetupInfoResponse());
                }
                if (service.hasSwitchToWifiRequest()) {
                    mergeSwitchToWifiRequest(service.getSwitchToWifiRequest());
                }
                if (service.hasSwitchToWifiResponse()) {
                    mergeSwitchToWifiResponse(service.getSwitchToWifiResponse());
                }
                if (service.hasStartOutdoorsActivationRequest()) {
                    mergeStartOutdoorsActivationRequest(service.getStartOutdoorsActivationRequest());
                }
                if (service.hasStartOutdoorsActivationResponse()) {
                    mergeStartOutdoorsActivationResponse(service.getStartOutdoorsActivationResponse());
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

    public static final class StartOutdoorsActivationResponse extends GeneratedMessageV3 implements StartOutdoorsActivationResponseOrBuilder {
        private static final StartOutdoorsActivationResponse DEFAULT_INSTANCE = new StartOutdoorsActivationResponse();

        @Deprecated
        public static final Parser<StartOutdoorsActivationResponse> PARSER = new AbstractParser<StartOutdoorsActivationResponse>() { // from class: com.garmin.proto.generated.GDIXeroGameCamProto.StartOutdoorsActivationResponse.1
            @Override // com.google.protobuf.Parser
            public StartOutdoorsActivationResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = StartOutdoorsActivationResponse.newBuilder();
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

        private StartOutdoorsActivationResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static StartOutdoorsActivationResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_StartOutdoorsActivationResponse_descriptor;
        }

        public static Builder newBuilder(StartOutdoorsActivationResponse startOutdoorsActivationResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(startOutdoorsActivationResponse);
        }

        public static StartOutdoorsActivationResponse parseDelimitedFrom(InputStream inputStream) {
            return (StartOutdoorsActivationResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static StartOutdoorsActivationResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<StartOutdoorsActivationResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof StartOutdoorsActivationResponse)) {
                return super.equals(obj);
            }
            StartOutdoorsActivationResponse startOutdoorsActivationResponse = (StartOutdoorsActivationResponse) obj;
            if (hasStatus() != startOutdoorsActivationResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == startOutdoorsActivationResponse.status_) && getUnknownFields().equals(startOutdoorsActivationResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<StartOutdoorsActivationResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIXeroGameCamProto.StartOutdoorsActivationResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.UNKNOWN : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIXeroGameCamProto.StartOutdoorsActivationResponseOrBuilder
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
            return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_StartOutdoorsActivationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StartOutdoorsActivationResponse.class, Builder.class);
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
            return new StartOutdoorsActivationResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StartOutdoorsActivationResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(StartOutdoorsActivationResponse startOutdoorsActivationResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    startOutdoorsActivationResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                startOutdoorsActivationResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_StartOutdoorsActivationResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StartOutdoorsActivationResponse build() {
                StartOutdoorsActivationResponse startOutdoorsActivationResponseBuildPartial = buildPartial();
                if (startOutdoorsActivationResponseBuildPartial.isInitialized()) {
                    return startOutdoorsActivationResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) startOutdoorsActivationResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public StartOutdoorsActivationResponse buildPartial() {
                StartOutdoorsActivationResponse startOutdoorsActivationResponse = new StartOutdoorsActivationResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(startOutdoorsActivationResponse);
                }
                onBuilt();
                return startOutdoorsActivationResponse;
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
                return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_StartOutdoorsActivationResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXeroGameCamProto.StartOutdoorsActivationResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.UNKNOWN : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIXeroGameCamProto.StartOutdoorsActivationResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_StartOutdoorsActivationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(StartOutdoorsActivationResponse.class, Builder.class);
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
            public StartOutdoorsActivationResponse getDefaultInstanceForType() {
                return StartOutdoorsActivationResponse.getDefaultInstance();
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
                if (message instanceof StartOutdoorsActivationResponse) {
                    return mergeFrom((StartOutdoorsActivationResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(StartOutdoorsActivationResponse startOutdoorsActivationResponse) {
                if (startOutdoorsActivationResponse == StartOutdoorsActivationResponse.getDefaultInstance()) {
                    return this;
                }
                if (startOutdoorsActivationResponse.hasStatus()) {
                    setStatus(startOutdoorsActivationResponse.getStatus());
                }
                mergeUnknownFields(startOutdoorsActivationResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public StartOutdoorsActivationResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static StartOutdoorsActivationResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartOutdoorsActivationResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StartOutdoorsActivationResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ StartOutdoorsActivationResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static StartOutdoorsActivationResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private StartOutdoorsActivationResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static StartOutdoorsActivationResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static StartOutdoorsActivationResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static StartOutdoorsActivationResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static StartOutdoorsActivationResponse parseFrom(InputStream inputStream) {
            return (StartOutdoorsActivationResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static StartOutdoorsActivationResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartOutdoorsActivationResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static StartOutdoorsActivationResponse parseFrom(CodedInputStream codedInputStream) {
            return (StartOutdoorsActivationResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static StartOutdoorsActivationResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartOutdoorsActivationResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            UNKNOWN(0),
            SUCCESS(1);

            public static final int SUCCESS_VALUE = 1;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIXeroGameCamProto.StartOutdoorsActivationResponse.Status.1
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
                    return UNKNOWN;
                }
                if (i14 != 1) {
                    return null;
                }
                return SUCCESS;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return StartOutdoorsActivationResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class SwitchToWifiResponse extends GeneratedMessageV3 implements SwitchToWifiResponseOrBuilder {
        private static final SwitchToWifiResponse DEFAULT_INSTANCE = new SwitchToWifiResponse();

        @Deprecated
        public static final Parser<SwitchToWifiResponse> PARSER = new AbstractParser<SwitchToWifiResponse>() { // from class: com.garmin.proto.generated.GDIXeroGameCamProto.SwitchToWifiResponse.1
            @Override // com.google.protobuf.Parser
            public SwitchToWifiResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SwitchToWifiResponse.newBuilder();
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

        private SwitchToWifiResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SwitchToWifiResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_SwitchToWifiResponse_descriptor;
        }

        public static Builder newBuilder(SwitchToWifiResponse switchToWifiResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(switchToWifiResponse);
        }

        public static SwitchToWifiResponse parseDelimitedFrom(InputStream inputStream) {
            return (SwitchToWifiResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SwitchToWifiResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SwitchToWifiResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SwitchToWifiResponse)) {
                return super.equals(obj);
            }
            SwitchToWifiResponse switchToWifiResponse = (SwitchToWifiResponse) obj;
            if (hasStatus() != switchToWifiResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == switchToWifiResponse.status_) && getUnknownFields().equals(switchToWifiResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SwitchToWifiResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIXeroGameCamProto.SwitchToWifiResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.UNKNOWN : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIXeroGameCamProto.SwitchToWifiResponseOrBuilder
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
            return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_SwitchToWifiResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SwitchToWifiResponse.class, Builder.class);
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
            return new SwitchToWifiResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SwitchToWifiResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(SwitchToWifiResponse switchToWifiResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    switchToWifiResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                switchToWifiResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_SwitchToWifiResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwitchToWifiResponse build() {
                SwitchToWifiResponse switchToWifiResponseBuildPartial = buildPartial();
                if (switchToWifiResponseBuildPartial.isInitialized()) {
                    return switchToWifiResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) switchToWifiResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwitchToWifiResponse buildPartial() {
                SwitchToWifiResponse switchToWifiResponse = new SwitchToWifiResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(switchToWifiResponse);
                }
                onBuilt();
                return switchToWifiResponse;
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
                return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_SwitchToWifiResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIXeroGameCamProto.SwitchToWifiResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.UNKNOWN : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIXeroGameCamProto.SwitchToWifiResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIXeroGameCamProto.internal_static_GDI_Proto_XeroGameCam_SwitchToWifiResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SwitchToWifiResponse.class, Builder.class);
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
            public SwitchToWifiResponse getDefaultInstanceForType() {
                return SwitchToWifiResponse.getDefaultInstance();
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
                if (message instanceof SwitchToWifiResponse) {
                    return mergeFrom((SwitchToWifiResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SwitchToWifiResponse switchToWifiResponse) {
                if (switchToWifiResponse == SwitchToWifiResponse.getDefaultInstance()) {
                    return this;
                }
                if (switchToWifiResponse.hasStatus()) {
                    setStatus(switchToWifiResponse.getStatus());
                }
                mergeUnknownFields(switchToWifiResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SwitchToWifiResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SwitchToWifiResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwitchToWifiResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwitchToWifiResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ SwitchToWifiResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SwitchToWifiResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SwitchToWifiResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SwitchToWifiResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SwitchToWifiResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SwitchToWifiResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SwitchToWifiResponse parseFrom(InputStream inputStream) {
            return (SwitchToWifiResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SwitchToWifiResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwitchToWifiResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwitchToWifiResponse parseFrom(CodedInputStream codedInputStream) {
            return (SwitchToWifiResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SwitchToWifiResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwitchToWifiResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            UNKNOWN(0),
            SUCCESS(1),
            PIN_SWITCH_FAILURE(2);

            public static final int PIN_SWITCH_FAILURE_VALUE = 2;
            public static final int SUCCESS_VALUE = 1;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIXeroGameCamProto.SwitchToWifiResponse.Status.1
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
                    return UNKNOWN;
                }
                if (i14 == 1) {
                    return SUCCESS;
                }
                if (i14 != 2) {
                    return null;
                }
                return PIN_SWITCH_FAILURE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return SwitchToWifiResponse.getDescriptor().getEnumTypes().get(0);
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
