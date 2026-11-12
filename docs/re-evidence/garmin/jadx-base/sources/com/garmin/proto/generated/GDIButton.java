package com.garmin.proto.generated;

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

/* JADX INFO: loaded from: classes11.dex */
public final class GDIButton {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u000fGDIButton.proto\u0012\u0010GDI.Proto.Button\u001a\rGDICore.proto\u001a\u0015GDIEventSharing.proto\"Õ\u0001\n\u0007Service\u0012>\n\u000econfig_request\u0018\u0001 \u0001(\u000b2&.GDI.Proto.Button.ConfigurationRequest\u0012@\n\u000fconfig_response\u0018\u0002 \u0001(\u000b2'.GDI.Proto.Button.ConfigurationResponse\u0012H\n\u0013config_notification\u0018\u0003 \u0001(\u000b2+.GDI.Proto.Button.ConfigurationNotification\"\u0082\u0001\n\u0013CapabilitiesRequest2k\n\u0010features_request\u0012*.GDI.Proto.Core.FeatureCapabilitiesRequest\u0018\" \u0001(\u000b2%.GDI.Proto.Button.CapabilitiesRequest\"Â\u0001\n\u0014CapabilitiesResponse\u0012:\n\fcapabilities\u0018\u0001 \u0001(\u000b2$.GDI.Proto.Button.RemoteCapabilities2n\n\u0011features_response\u0012+.GDI.Proto.Core.FeatureCapabilitiesResponse\u0018\" \u0001(\u000b2&.GDI.Proto.Button.CapabilitiesResponse\"d\n\u0012RemoteCapabilities\u0012\u0017\n\u000fservice_version\u0018\u0001 \u0001(\r\u00125\n\rbutton_config\u0018\u0002 \u0003(\u000b2\u001e.GDI.Proto.Button.ButtonConfig\"û\u0001\n\fButtonConfig\u0012/\n\tbutton_id\u0018\u0001 \u0001(\u000e2\u001c.GDI.Proto.Button.ButtonType\u0012\u001a\n\u0012enable_short_press\u0018\u0002 \u0001(\b\u0012\u0019\n\u0011enable_hold_press\u0018\u0003 \u0001(\b\u0012\u001e\n\u0016enable_long_hold_press\u0018\u0004 \u0001(\b\u0012\u0018\n\u0010hold_duration_ms\u0018\u0005 \u0001(\r\u0012\u001d\n\u0015long_hold_duration_ms\u0018\u0006 \u0001(\r\u0012*\n\u0004mode\u0018\u0007 \u0001(\u000e2\u001c.GDI.Proto.Button.ButtonMode\"H\n\u0015ConfigurationSettings\u0012/\n\u0007buttons\u0018\u0001 \u0003(\u000b2\u001e.GDI.Proto.Button.ButtonConfig\"O\n\u0014ConfigurationRequest\u00127\n\u0006config\u0018\u0001 \u0001(\u000b2'.GDI.Proto.Button.ConfigurationSettings\"Ý\u0001\n\u0015ConfigurationResponse\u0012K\n\u0006status\u0018\u0001 \u0001(\u000e2;.GDI.Proto.Button.ConfigurationResponse.ConfigurationStatus\u00127\n\u0006config\u0018\u0002 \u0001(\u000b2'.GDI.Proto.Button.ConfigurationSettings\">\n\u0013ConfigurationStatus\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\f\n\bACCEPTED\u0010\u0001\u0012\f\n\bREJECTED\u0010\u0002\"T\n\u0019ConfigurationNotification\u00127\n\u0006config\u0018\u0001 \u0001(\u000b2'.GDI.Proto.Button.ConfigurationSettings\"Ú\u0002\n\u0011EventNotification\u0012/\n\tbutton_id\u0018\u0001 \u0001(\u000e2\u001c.GDI.Proto.Button.ButtonType\u0012:\n\u0006action\u0018\u0002 \u0001(\u000e2*.GDI.Proto.Button.EventNotification.Action\u0012\u0014\n\ftimestamp_ms\u0018\u0003 \u0001(\r\"c\n\u0006Action\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u000f\n\u000bSHORT_PRESS\u0010\u0001\u0012\u000e\n\nHOLD_PRESS\u0010\u0002\u0012\u0013\n\u000fLONG_HOLD_PRESS\u0010\u0003\u0012\t\n\u0005PRESS\u0010\u0004\u0012\u000b\n\u0007RELEASE\u0010\u00052]\n\u0004data\u0012).GDI.Proto.EventSharing.AlertNotification\u0018ý\u0007 \u0001(\u000b2#.GDI.Proto.Button.EventNotification*O\n\nButtonType\u0012\u0017\n\u0013BUTTON_TYPE_UNKNOWN\u0010\u0000\u0012\u0012\n\u000eBUTTON_TYPE_OK\u0010\u0001\u0012\u0014\n\u0010BUTTON_TYPE_PAIR\u0010\u0002*T\n\nButtonMode\u0012\u0017\n\u0013BUTTON_MODE_UNKNOWN\u0010\u0000\u0012\u0018\n\u0014BUTTON_MODE_DISCRETE\u0010\u0001\u0012\u0013\n\u000fBUTTON_MODE_RAW\u0010\u0002B)\n\u001acom.garmin.proto.generatedB\tGDIButtonH\u0003"}, new Descriptors.FileDescriptor[]{GDICore.getDescriptor(), GDIEventSharingProto.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Button_ButtonConfig_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Button_ButtonConfig_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Button_CapabilitiesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Button_CapabilitiesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Button_CapabilitiesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Button_CapabilitiesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Button_ConfigurationNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Button_ConfigurationNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Button_ConfigurationRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Button_ConfigurationRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Button_ConfigurationResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Button_ConfigurationResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Button_ConfigurationSettings_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Button_ConfigurationSettings_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Button_EventNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Button_EventNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Button_RemoteCapabilities_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Button_RemoteCapabilities_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Button_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Button_Service_fieldAccessorTable;

    public interface ButtonConfigOrBuilder extends MessageOrBuilder {
        ButtonType getButtonId();

        boolean getEnableHoldPress();

        boolean getEnableLongHoldPress();

        boolean getEnableShortPress();

        int getHoldDurationMs();

        int getLongHoldDurationMs();

        ButtonMode getMode();

        boolean hasButtonId();

        boolean hasEnableHoldPress();

        boolean hasEnableLongHoldPress();

        boolean hasEnableShortPress();

        boolean hasHoldDurationMs();

        boolean hasLongHoldDurationMs();

        boolean hasMode();
    }

    public interface CapabilitiesRequestOrBuilder extends MessageOrBuilder {
    }

    public interface CapabilitiesResponseOrBuilder extends MessageOrBuilder {
        RemoteCapabilities getCapabilities();

        RemoteCapabilitiesOrBuilder getCapabilitiesOrBuilder();

        boolean hasCapabilities();
    }

    public interface ConfigurationNotificationOrBuilder extends MessageOrBuilder {
        ConfigurationSettings getConfig();

        ConfigurationSettingsOrBuilder getConfigOrBuilder();

        boolean hasConfig();
    }

    public interface ConfigurationRequestOrBuilder extends MessageOrBuilder {
        ConfigurationSettings getConfig();

        ConfigurationSettingsOrBuilder getConfigOrBuilder();

        boolean hasConfig();
    }

    public interface ConfigurationResponseOrBuilder extends MessageOrBuilder {
        ConfigurationSettings getConfig();

        ConfigurationSettingsOrBuilder getConfigOrBuilder();

        ConfigurationResponse.ConfigurationStatus getStatus();

        boolean hasConfig();

        boolean hasStatus();
    }

    public interface ConfigurationSettingsOrBuilder extends MessageOrBuilder {
        ButtonConfig getButtons(int i14);

        int getButtonsCount();

        List<ButtonConfig> getButtonsList();

        ButtonConfigOrBuilder getButtonsOrBuilder(int i14);

        List<? extends ButtonConfigOrBuilder> getButtonsOrBuilderList();
    }

    public interface EventNotificationOrBuilder extends MessageOrBuilder {
        EventNotification.Action getAction();

        ButtonType getButtonId();

        int getTimestampMs();

        boolean hasAction();

        boolean hasButtonId();

        boolean hasTimestampMs();
    }

    public interface RemoteCapabilitiesOrBuilder extends MessageOrBuilder {
        ButtonConfig getButtonConfig(int i14);

        int getButtonConfigCount();

        List<ButtonConfig> getButtonConfigList();

        ButtonConfigOrBuilder getButtonConfigOrBuilder(int i14);

        List<? extends ButtonConfigOrBuilder> getButtonConfigOrBuilderList();

        int getServiceVersion();

        boolean hasServiceVersion();
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
        ConfigurationNotification getConfigNotification();

        ConfigurationNotificationOrBuilder getConfigNotificationOrBuilder();

        ConfigurationRequest getConfigRequest();

        ConfigurationRequestOrBuilder getConfigRequestOrBuilder();

        ConfigurationResponse getConfigResponse();

        ConfigurationResponseOrBuilder getConfigResponseOrBuilder();

        boolean hasConfigNotification();

        boolean hasConfigRequest();

        boolean hasConfigResponse();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_Button_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_Button_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"ConfigRequest", "ConfigResponse", "ConfigNotification"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_Button_CapabilitiesRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_Button_CapabilitiesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[0]);
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_Button_CapabilitiesResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_Button_CapabilitiesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Capabilities"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_Button_RemoteCapabilities_descriptor = descriptor5;
        internal_static_GDI_Proto_Button_RemoteCapabilities_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"ServiceVersion", "ButtonConfig"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_Button_ButtonConfig_descriptor = descriptor6;
        internal_static_GDI_Proto_Button_ButtonConfig_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"ButtonId", "EnableShortPress", "EnableHoldPress", "EnableLongHoldPress", "HoldDurationMs", "LongHoldDurationMs", "Mode"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_Button_ConfigurationSettings_descriptor = descriptor7;
        internal_static_GDI_Proto_Button_ConfigurationSettings_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Buttons"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_Button_ConfigurationRequest_descriptor = descriptor8;
        internal_static_GDI_Proto_Button_ConfigurationRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Config"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_Button_ConfigurationResponse_descriptor = descriptor9;
        internal_static_GDI_Proto_Button_ConfigurationResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Status", "Config"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_GDI_Proto_Button_ConfigurationNotification_descriptor = descriptor10;
        internal_static_GDI_Proto_Button_ConfigurationNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Config"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(9);
        internal_static_GDI_Proto_Button_EventNotification_descriptor = descriptor11;
        internal_static_GDI_Proto_Button_EventNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"ButtonId", "Action", "TimestampMs"});
        GDICore.getDescriptor();
        GDIEventSharingProto.getDescriptor();
    }

    private GDIButton() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(CapabilitiesRequest.featuresRequest);
        extensionRegistryLite.add(CapabilitiesResponse.featuresResponse);
        extensionRegistryLite.add(EventNotification.data);
    }

    public static final class CapabilitiesRequest extends GeneratedMessageV3 implements CapabilitiesRequestOrBuilder {
        public static final int FEATURES_REQUEST_FIELD_NUMBER = 34;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private static final CapabilitiesRequest DEFAULT_INSTANCE = new CapabilitiesRequest();

        @Deprecated
        public static final Parser<CapabilitiesRequest> PARSER = new AbstractParser<CapabilitiesRequest>() { // from class: com.garmin.proto.generated.GDIButton.CapabilitiesRequest.1
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
        public static final GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesRequest, CapabilitiesRequest> featuresRequest = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, CapabilitiesRequest.class, getDefaultInstance());

        private CapabilitiesRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIButton.internal_static_GDI_Proto_Button_CapabilitiesRequest_descriptor;
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
            return GDIButton.internal_static_GDI_Proto_Button_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
                return GDIButton.internal_static_GDI_Proto_Button_CapabilitiesRequest_descriptor;
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
                return GDIButton.internal_static_GDI_Proto_Button_CapabilitiesRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIButton.internal_static_GDI_Proto_Button_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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

    public static final class ButtonConfig extends GeneratedMessageV3 implements ButtonConfigOrBuilder {
        public static final int BUTTON_ID_FIELD_NUMBER = 1;
        public static final int ENABLE_HOLD_PRESS_FIELD_NUMBER = 3;
        public static final int ENABLE_LONG_HOLD_PRESS_FIELD_NUMBER = 4;
        public static final int ENABLE_SHORT_PRESS_FIELD_NUMBER = 2;
        public static final int HOLD_DURATION_MS_FIELD_NUMBER = 5;
        public static final int LONG_HOLD_DURATION_MS_FIELD_NUMBER = 6;
        public static final int MODE_FIELD_NUMBER = 7;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int buttonId_;
        private boolean enableHoldPress_;
        private boolean enableLongHoldPress_;
        private boolean enableShortPress_;
        private int holdDurationMs_;
        private int longHoldDurationMs_;
        private byte memoizedIsInitialized;
        private int mode_;
        private static final ButtonConfig DEFAULT_INSTANCE = new ButtonConfig();

        @Deprecated
        public static final Parser<ButtonConfig> PARSER = new AbstractParser<ButtonConfig>() { // from class: com.garmin.proto.generated.GDIButton.ButtonConfig.1
            @Override // com.google.protobuf.Parser
            public ButtonConfig parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ButtonConfig.newBuilder();
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

        private ButtonConfig(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.buttonId_ = 0;
            this.enableShortPress_ = false;
            this.enableHoldPress_ = false;
            this.enableLongHoldPress_ = false;
            this.holdDurationMs_ = 0;
            this.longHoldDurationMs_ = 0;
            this.mode_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ButtonConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIButton.internal_static_GDI_Proto_Button_ButtonConfig_descriptor;
        }

        public static Builder newBuilder(ButtonConfig buttonConfig) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(buttonConfig);
        }

        public static ButtonConfig parseDelimitedFrom(InputStream inputStream) {
            return (ButtonConfig) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ButtonConfig parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ButtonConfig> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ButtonConfig)) {
                return super.equals(obj);
            }
            ButtonConfig buttonConfig = (ButtonConfig) obj;
            if (hasButtonId() != buttonConfig.hasButtonId()) {
                return false;
            }
            if ((hasButtonId() && this.buttonId_ != buttonConfig.buttonId_) || hasEnableShortPress() != buttonConfig.hasEnableShortPress()) {
                return false;
            }
            if ((hasEnableShortPress() && getEnableShortPress() != buttonConfig.getEnableShortPress()) || hasEnableHoldPress() != buttonConfig.hasEnableHoldPress()) {
                return false;
            }
            if ((hasEnableHoldPress() && getEnableHoldPress() != buttonConfig.getEnableHoldPress()) || hasEnableLongHoldPress() != buttonConfig.hasEnableLongHoldPress()) {
                return false;
            }
            if ((hasEnableLongHoldPress() && getEnableLongHoldPress() != buttonConfig.getEnableLongHoldPress()) || hasHoldDurationMs() != buttonConfig.hasHoldDurationMs()) {
                return false;
            }
            if ((hasHoldDurationMs() && getHoldDurationMs() != buttonConfig.getHoldDurationMs()) || hasLongHoldDurationMs() != buttonConfig.hasLongHoldDurationMs()) {
                return false;
            }
            if ((!hasLongHoldDurationMs() || getLongHoldDurationMs() == buttonConfig.getLongHoldDurationMs()) && hasMode() == buttonConfig.hasMode()) {
                return (!hasMode() || this.mode_ == buttonConfig.mode_) && getUnknownFields().equals(buttonConfig.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIButton.ButtonConfigOrBuilder
        public ButtonType getButtonId() {
            ButtonType buttonTypeForNumber = ButtonType.forNumber(this.buttonId_);
            return buttonTypeForNumber == null ? ButtonType.BUTTON_TYPE_UNKNOWN : buttonTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIButton.ButtonConfigOrBuilder
        public boolean getEnableHoldPress() {
            return this.enableHoldPress_;
        }

        @Override // com.garmin.proto.generated.GDIButton.ButtonConfigOrBuilder
        public boolean getEnableLongHoldPress() {
            return this.enableLongHoldPress_;
        }

        @Override // com.garmin.proto.generated.GDIButton.ButtonConfigOrBuilder
        public boolean getEnableShortPress() {
            return this.enableShortPress_;
        }

        @Override // com.garmin.proto.generated.GDIButton.ButtonConfigOrBuilder
        public int getHoldDurationMs() {
            return this.holdDurationMs_;
        }

        @Override // com.garmin.proto.generated.GDIButton.ButtonConfigOrBuilder
        public int getLongHoldDurationMs() {
            return this.longHoldDurationMs_;
        }

        @Override // com.garmin.proto.generated.GDIButton.ButtonConfigOrBuilder
        public ButtonMode getMode() {
            ButtonMode buttonModeForNumber = ButtonMode.forNumber(this.mode_);
            return buttonModeForNumber == null ? ButtonMode.BUTTON_MODE_UNKNOWN : buttonModeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ButtonConfig> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.buttonId_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeBoolSize(2, this.enableShortPress_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeBoolSize(3, this.enableHoldPress_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeEnumSize += CodedOutputStream.computeBoolSize(4, this.enableLongHoldPress_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(5, this.holdDurationMs_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(6, this.longHoldDurationMs_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(7, this.mode_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIButton.ButtonConfigOrBuilder
        public boolean hasButtonId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIButton.ButtonConfigOrBuilder
        public boolean hasEnableHoldPress() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIButton.ButtonConfigOrBuilder
        public boolean hasEnableLongHoldPress() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIButton.ButtonConfigOrBuilder
        public boolean hasEnableShortPress() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIButton.ButtonConfigOrBuilder
        public boolean hasHoldDurationMs() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIButton.ButtonConfigOrBuilder
        public boolean hasLongHoldDurationMs() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIButton.ButtonConfigOrBuilder
        public boolean hasMode() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasButtonId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.buttonId_;
            }
            if (hasEnableShortPress()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getEnableShortPress());
            }
            if (hasEnableHoldPress()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashBoolean(getEnableHoldPress());
            }
            if (hasEnableLongHoldPress()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Internal.hashBoolean(getEnableLongHoldPress());
            }
            if (hasHoldDurationMs()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getHoldDurationMs();
            }
            if (hasLongHoldDurationMs()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getLongHoldDurationMs();
            }
            if (hasMode()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + this.mode_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIButton.internal_static_GDI_Proto_Button_ButtonConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(ButtonConfig.class, Builder.class);
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
            return new ButtonConfig();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.buttonId_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.enableShortPress_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(3, this.enableHoldPress_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeBool(4, this.enableLongHoldPress_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.holdDurationMs_);
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeUInt32(6, this.longHoldDurationMs_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeEnum(7, this.mode_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ButtonConfigOrBuilder {
            private int bitField0_;
            private int buttonId_;
            private boolean enableHoldPress_;
            private boolean enableLongHoldPress_;
            private boolean enableShortPress_;
            private int holdDurationMs_;
            private int longHoldDurationMs_;
            private int mode_;

            private Builder() {
                this.buttonId_ = 0;
                this.mode_ = 0;
            }

            private void buildPartial0(ButtonConfig buttonConfig) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    buttonConfig.buttonId_ = this.buttonId_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    buttonConfig.enableShortPress_ = this.enableShortPress_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    buttonConfig.enableHoldPress_ = this.enableHoldPress_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    buttonConfig.enableLongHoldPress_ = this.enableLongHoldPress_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    buttonConfig.holdDurationMs_ = this.holdDurationMs_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    buttonConfig.longHoldDurationMs_ = this.longHoldDurationMs_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    buttonConfig.mode_ = this.mode_;
                    i14 |= 64;
                }
                buttonConfig.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIButton.internal_static_GDI_Proto_Button_ButtonConfig_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ButtonConfig build() {
                ButtonConfig buttonConfigBuildPartial = buildPartial();
                if (buttonConfigBuildPartial.isInitialized()) {
                    return buttonConfigBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) buttonConfigBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ButtonConfig buildPartial() {
                ButtonConfig buttonConfig = new ButtonConfig(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(buttonConfig);
                }
                onBuilt();
                return buttonConfig;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.buttonId_ = 0;
                this.enableShortPress_ = false;
                this.enableHoldPress_ = false;
                this.enableLongHoldPress_ = false;
                this.holdDurationMs_ = 0;
                this.longHoldDurationMs_ = 0;
                this.mode_ = 0;
                return this;
            }

            public Builder clearButtonId() {
                this.bitField0_ &= -2;
                this.buttonId_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEnableHoldPress() {
                this.bitField0_ &= -5;
                this.enableHoldPress_ = false;
                onChanged();
                return this;
            }

            public Builder clearEnableLongHoldPress() {
                this.bitField0_ &= -9;
                this.enableLongHoldPress_ = false;
                onChanged();
                return this;
            }

            public Builder clearEnableShortPress() {
                this.bitField0_ &= -3;
                this.enableShortPress_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearHoldDurationMs() {
                this.bitField0_ &= -17;
                this.holdDurationMs_ = 0;
                onChanged();
                return this;
            }

            public Builder clearLongHoldDurationMs() {
                this.bitField0_ &= -33;
                this.longHoldDurationMs_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMode() {
                this.bitField0_ &= -65;
                this.mode_ = 0;
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

            @Override // com.garmin.proto.generated.GDIButton.ButtonConfigOrBuilder
            public ButtonType getButtonId() {
                ButtonType buttonTypeForNumber = ButtonType.forNumber(this.buttonId_);
                return buttonTypeForNumber == null ? ButtonType.BUTTON_TYPE_UNKNOWN : buttonTypeForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIButton.internal_static_GDI_Proto_Button_ButtonConfig_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIButton.ButtonConfigOrBuilder
            public boolean getEnableHoldPress() {
                return this.enableHoldPress_;
            }

            @Override // com.garmin.proto.generated.GDIButton.ButtonConfigOrBuilder
            public boolean getEnableLongHoldPress() {
                return this.enableLongHoldPress_;
            }

            @Override // com.garmin.proto.generated.GDIButton.ButtonConfigOrBuilder
            public boolean getEnableShortPress() {
                return this.enableShortPress_;
            }

            @Override // com.garmin.proto.generated.GDIButton.ButtonConfigOrBuilder
            public int getHoldDurationMs() {
                return this.holdDurationMs_;
            }

            @Override // com.garmin.proto.generated.GDIButton.ButtonConfigOrBuilder
            public int getLongHoldDurationMs() {
                return this.longHoldDurationMs_;
            }

            @Override // com.garmin.proto.generated.GDIButton.ButtonConfigOrBuilder
            public ButtonMode getMode() {
                ButtonMode buttonModeForNumber = ButtonMode.forNumber(this.mode_);
                return buttonModeForNumber == null ? ButtonMode.BUTTON_MODE_UNKNOWN : buttonModeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIButton.ButtonConfigOrBuilder
            public boolean hasButtonId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIButton.ButtonConfigOrBuilder
            public boolean hasEnableHoldPress() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIButton.ButtonConfigOrBuilder
            public boolean hasEnableLongHoldPress() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIButton.ButtonConfigOrBuilder
            public boolean hasEnableShortPress() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIButton.ButtonConfigOrBuilder
            public boolean hasHoldDurationMs() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIButton.ButtonConfigOrBuilder
            public boolean hasLongHoldDurationMs() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIButton.ButtonConfigOrBuilder
            public boolean hasMode() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIButton.internal_static_GDI_Proto_Button_ButtonConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(ButtonConfig.class, Builder.class);
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
                                    if (ButtonType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.buttonId_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    this.enableShortPress_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.enableHoldPress_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.enableLongHoldPress_ = codedInputStream.readBool();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.holdDurationMs_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                } else if (tag == 48) {
                                    this.longHoldDurationMs_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 32;
                                } else if (tag == 56) {
                                    int i15 = codedInputStream.readEnum();
                                    if (ButtonMode.forNumber(i15) == null) {
                                        mergeUnknownVarintField(7, i15);
                                    } else {
                                        this.mode_ = i15;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setButtonId(ButtonType buttonType) {
                buttonType.getClass();
                this.bitField0_ |= 1;
                this.buttonId_ = buttonType.getNumber();
                onChanged();
                return this;
            }

            public Builder setEnableHoldPress(boolean z14) {
                this.enableHoldPress_ = z14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setEnableLongHoldPress(boolean z14) {
                this.enableLongHoldPress_ = z14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setEnableShortPress(boolean z14) {
                this.enableShortPress_ = z14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setHoldDurationMs(int i14) {
                this.holdDurationMs_ = i14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setLongHoldDurationMs(int i14) {
                this.longHoldDurationMs_ = i14;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setMode(ButtonMode buttonMode) {
                buttonMode.getClass();
                this.bitField0_ |= 64;
                this.mode_ = buttonMode.getNumber();
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
            public ButtonConfig getDefaultInstanceForType() {
                return ButtonConfig.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.buttonId_ = 0;
                this.mode_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ButtonConfig) {
                    return mergeFrom((ButtonConfig) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ButtonConfig buttonConfig) {
                if (buttonConfig == ButtonConfig.getDefaultInstance()) {
                    return this;
                }
                if (buttonConfig.hasButtonId()) {
                    setButtonId(buttonConfig.getButtonId());
                }
                if (buttonConfig.hasEnableShortPress()) {
                    setEnableShortPress(buttonConfig.getEnableShortPress());
                }
                if (buttonConfig.hasEnableHoldPress()) {
                    setEnableHoldPress(buttonConfig.getEnableHoldPress());
                }
                if (buttonConfig.hasEnableLongHoldPress()) {
                    setEnableLongHoldPress(buttonConfig.getEnableLongHoldPress());
                }
                if (buttonConfig.hasHoldDurationMs()) {
                    setHoldDurationMs(buttonConfig.getHoldDurationMs());
                }
                if (buttonConfig.hasLongHoldDurationMs()) {
                    setLongHoldDurationMs(buttonConfig.getLongHoldDurationMs());
                }
                if (buttonConfig.hasMode()) {
                    setMode(buttonConfig.getMode());
                }
                mergeUnknownFields(buttonConfig.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ButtonConfig getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ButtonConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ButtonConfig) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ButtonConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ButtonConfig parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ButtonConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ButtonConfig parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ButtonConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ButtonConfig parseFrom(InputStream inputStream) {
            return (ButtonConfig) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ButtonConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ButtonConfig) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ButtonConfig parseFrom(CodedInputStream codedInputStream) {
            return (ButtonConfig) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ButtonConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ButtonConfig) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ ButtonConfig(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private ButtonConfig() {
            this.enableShortPress_ = false;
            this.enableHoldPress_ = false;
            this.enableLongHoldPress_ = false;
            this.holdDurationMs_ = 0;
            this.longHoldDurationMs_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.buttonId_ = 0;
            this.mode_ = 0;
        }
    }

    public static final class CapabilitiesResponse extends GeneratedMessageV3 implements CapabilitiesResponseOrBuilder {
        public static final int CAPABILITIES_FIELD_NUMBER = 1;
        public static final int FEATURES_RESPONSE_FIELD_NUMBER = 34;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private RemoteCapabilities capabilities_;
        private byte memoizedIsInitialized;
        private static final CapabilitiesResponse DEFAULT_INSTANCE = new CapabilitiesResponse();

        @Deprecated
        public static final Parser<CapabilitiesResponse> PARSER = new AbstractParser<CapabilitiesResponse>() { // from class: com.garmin.proto.generated.GDIButton.CapabilitiesResponse.1
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
        public static final GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesResponse, CapabilitiesResponse> featuresResponse = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, CapabilitiesResponse.class, getDefaultInstance());

        private CapabilitiesResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIButton.internal_static_GDI_Proto_Button_CapabilitiesResponse_descriptor;
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
            if (hasCapabilities() != capabilitiesResponse.hasCapabilities()) {
                return false;
            }
            return (!hasCapabilities() || getCapabilities().equals(capabilitiesResponse.getCapabilities())) && getUnknownFields().equals(capabilitiesResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIButton.CapabilitiesResponseOrBuilder
        public RemoteCapabilities getCapabilities() {
            RemoteCapabilities remoteCapabilities = this.capabilities_;
            return remoteCapabilities == null ? RemoteCapabilities.getDefaultInstance() : remoteCapabilities;
        }

        @Override // com.garmin.proto.generated.GDIButton.CapabilitiesResponseOrBuilder
        public RemoteCapabilitiesOrBuilder getCapabilitiesOrBuilder() {
            RemoteCapabilities remoteCapabilities = this.capabilities_;
            return remoteCapabilities == null ? RemoteCapabilities.getDefaultInstance() : remoteCapabilities;
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
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getCapabilities()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIButton.CapabilitiesResponseOrBuilder
        public boolean hasCapabilities() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCapabilities()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getCapabilities().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIButton.internal_static_GDI_Proto_Button_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getCapabilities());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<RemoteCapabilities, RemoteCapabilities.Builder, RemoteCapabilitiesOrBuilder> capabilitiesBuilder_;
            private RemoteCapabilities capabilities_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(CapabilitiesResponse capabilitiesResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<RemoteCapabilities, RemoteCapabilities.Builder, RemoteCapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                    capabilitiesResponse.capabilities_ = singleFieldBuilderV3 == null ? this.capabilities_ : (RemoteCapabilities) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                capabilitiesResponse.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<RemoteCapabilities, RemoteCapabilities.Builder, RemoteCapabilitiesOrBuilder> getCapabilitiesFieldBuilder() {
                if (this.capabilitiesBuilder_ == null) {
                    this.capabilitiesBuilder_ = new SingleFieldBuilderV3<>(getCapabilities(), getParentForChildren(), isClean());
                    this.capabilities_ = null;
                }
                return this.capabilitiesBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIButton.internal_static_GDI_Proto_Button_CapabilitiesResponse_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getCapabilitiesFieldBuilder();
                }
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
                this.capabilities_ = null;
                SingleFieldBuilderV3<RemoteCapabilities, RemoteCapabilities.Builder, RemoteCapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.capabilitiesBuilder_ = null;
                }
                return this;
            }

            public Builder clearCapabilities() {
                this.bitField0_ &= -2;
                this.capabilities_ = null;
                SingleFieldBuilderV3<RemoteCapabilities, RemoteCapabilities.Builder, RemoteCapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.capabilitiesBuilder_ = null;
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

            @Override // com.garmin.proto.generated.GDIButton.CapabilitiesResponseOrBuilder
            public RemoteCapabilities getCapabilities() {
                SingleFieldBuilderV3<RemoteCapabilities, RemoteCapabilities.Builder, RemoteCapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RemoteCapabilities) singleFieldBuilderV3.getMessage();
                }
                RemoteCapabilities remoteCapabilities = this.capabilities_;
                return remoteCapabilities == null ? RemoteCapabilities.getDefaultInstance() : remoteCapabilities;
            }

            public RemoteCapabilities.Builder getCapabilitiesBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (RemoteCapabilities.Builder) getCapabilitiesFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIButton.CapabilitiesResponseOrBuilder
            public RemoteCapabilitiesOrBuilder getCapabilitiesOrBuilder() {
                SingleFieldBuilderV3<RemoteCapabilities, RemoteCapabilities.Builder, RemoteCapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RemoteCapabilitiesOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                RemoteCapabilities remoteCapabilities = this.capabilities_;
                return remoteCapabilities == null ? RemoteCapabilities.getDefaultInstance() : remoteCapabilities;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIButton.internal_static_GDI_Proto_Button_CapabilitiesResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIButton.CapabilitiesResponseOrBuilder
            public boolean hasCapabilities() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIButton.internal_static_GDI_Proto_Button_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeCapabilities(RemoteCapabilities remoteCapabilities) {
                RemoteCapabilities remoteCapabilities2;
                SingleFieldBuilderV3<RemoteCapabilities, RemoteCapabilities.Builder, RemoteCapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(remoteCapabilities);
                } else if ((this.bitField0_ & 1) == 0 || (remoteCapabilities2 = this.capabilities_) == null || remoteCapabilities2 == RemoteCapabilities.getDefaultInstance()) {
                    this.capabilities_ = remoteCapabilities;
                } else {
                    getCapabilitiesBuilder().mergeFrom(remoteCapabilities);
                }
                if (this.capabilities_ != null) {
                    this.bitField0_ |= 1;
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
                                    codedInputStream.readMessage(getCapabilitiesFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setCapabilities(RemoteCapabilities.Builder builder) {
                SingleFieldBuilderV3<RemoteCapabilities, RemoteCapabilities.Builder, RemoteCapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.capabilities_ = builder.build();
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
                maybeForceBuilderInitialization();
            }

            public Builder setCapabilities(RemoteCapabilities remoteCapabilities) {
                SingleFieldBuilderV3<RemoteCapabilities, RemoteCapabilities.Builder, RemoteCapabilitiesOrBuilder> singleFieldBuilderV3 = this.capabilitiesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    remoteCapabilities.getClass();
                    this.capabilities_ = remoteCapabilities;
                } else {
                    singleFieldBuilderV3.setMessage(remoteCapabilities);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
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
                if (capabilitiesResponse.hasCapabilities()) {
                    mergeCapabilities(capabilitiesResponse.getCapabilities());
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

        public /* synthetic */ CapabilitiesResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private CapabilitiesResponse() {
            this.memoizedIsInitialized = (byte) -1;
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

    public static final class ConfigurationNotification extends GeneratedMessageV3 implements ConfigurationNotificationOrBuilder {
        public static final int CONFIG_FIELD_NUMBER = 1;
        private static final ConfigurationNotification DEFAULT_INSTANCE = new ConfigurationNotification();

        @Deprecated
        public static final Parser<ConfigurationNotification> PARSER = new AbstractParser<ConfigurationNotification>() { // from class: com.garmin.proto.generated.GDIButton.ConfigurationNotification.1
            @Override // com.google.protobuf.Parser
            public ConfigurationNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConfigurationNotification.newBuilder();
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
        private ConfigurationSettings config_;
        private byte memoizedIsInitialized;

        private ConfigurationNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConfigurationNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIButton.internal_static_GDI_Proto_Button_ConfigurationNotification_descriptor;
        }

        public static Builder newBuilder(ConfigurationNotification configurationNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(configurationNotification);
        }

        public static ConfigurationNotification parseDelimitedFrom(InputStream inputStream) {
            return (ConfigurationNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConfigurationNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConfigurationNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConfigurationNotification)) {
                return super.equals(obj);
            }
            ConfigurationNotification configurationNotification = (ConfigurationNotification) obj;
            if (hasConfig() != configurationNotification.hasConfig()) {
                return false;
            }
            return (!hasConfig() || getConfig().equals(configurationNotification.getConfig())) && getUnknownFields().equals(configurationNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIButton.ConfigurationNotificationOrBuilder
        public ConfigurationSettings getConfig() {
            ConfigurationSettings configurationSettings = this.config_;
            return configurationSettings == null ? ConfigurationSettings.getDefaultInstance() : configurationSettings;
        }

        @Override // com.garmin.proto.generated.GDIButton.ConfigurationNotificationOrBuilder
        public ConfigurationSettingsOrBuilder getConfigOrBuilder() {
            ConfigurationSettings configurationSettings = this.config_;
            return configurationSettings == null ? ConfigurationSettings.getDefaultInstance() : configurationSettings;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConfigurationNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getConfig()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIButton.ConfigurationNotificationOrBuilder
        public boolean hasConfig() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasConfig()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getConfig().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIButton.internal_static_GDI_Proto_Button_ConfigurationNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigurationNotification.class, Builder.class);
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
            return new ConfigurationNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getConfig());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConfigurationNotificationOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<ConfigurationSettings, ConfigurationSettings.Builder, ConfigurationSettingsOrBuilder> configBuilder_;
            private ConfigurationSettings config_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ConfigurationNotification configurationNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<ConfigurationSettings, ConfigurationSettings.Builder, ConfigurationSettingsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                    configurationNotification.config_ = singleFieldBuilderV3 == null ? this.config_ : (ConfigurationSettings) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                configurationNotification.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<ConfigurationSettings, ConfigurationSettings.Builder, ConfigurationSettingsOrBuilder> getConfigFieldBuilder() {
                if (this.configBuilder_ == null) {
                    this.configBuilder_ = new SingleFieldBuilderV3<>(getConfig(), getParentForChildren(), isClean());
                    this.config_ = null;
                }
                return this.configBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIButton.internal_static_GDI_Proto_Button_ConfigurationNotification_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getConfigFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigurationNotification build() {
                ConfigurationNotification configurationNotificationBuildPartial = buildPartial();
                if (configurationNotificationBuildPartial.isInitialized()) {
                    return configurationNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) configurationNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigurationNotification buildPartial() {
                ConfigurationNotification configurationNotification = new ConfigurationNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(configurationNotification);
                }
                onBuilt();
                return configurationNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.config_ = null;
                SingleFieldBuilderV3<ConfigurationSettings, ConfigurationSettings.Builder, ConfigurationSettingsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configBuilder_ = null;
                }
                return this;
            }

            public Builder clearConfig() {
                this.bitField0_ &= -2;
                this.config_ = null;
                SingleFieldBuilderV3<ConfigurationSettings, ConfigurationSettings.Builder, ConfigurationSettingsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configBuilder_ = null;
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

            @Override // com.garmin.proto.generated.GDIButton.ConfigurationNotificationOrBuilder
            public ConfigurationSettings getConfig() {
                SingleFieldBuilderV3<ConfigurationSettings, ConfigurationSettings.Builder, ConfigurationSettingsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationSettings) singleFieldBuilderV3.getMessage();
                }
                ConfigurationSettings configurationSettings = this.config_;
                return configurationSettings == null ? ConfigurationSettings.getDefaultInstance() : configurationSettings;
            }

            public ConfigurationSettings.Builder getConfigBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (ConfigurationSettings.Builder) getConfigFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIButton.ConfigurationNotificationOrBuilder
            public ConfigurationSettingsOrBuilder getConfigOrBuilder() {
                SingleFieldBuilderV3<ConfigurationSettings, ConfigurationSettings.Builder, ConfigurationSettingsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationSettingsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConfigurationSettings configurationSettings = this.config_;
                return configurationSettings == null ? ConfigurationSettings.getDefaultInstance() : configurationSettings;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIButton.internal_static_GDI_Proto_Button_ConfigurationNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIButton.ConfigurationNotificationOrBuilder
            public boolean hasConfig() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIButton.internal_static_GDI_Proto_Button_ConfigurationNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigurationNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeConfig(ConfigurationSettings configurationSettings) {
                ConfigurationSettings configurationSettings2;
                SingleFieldBuilderV3<ConfigurationSettings, ConfigurationSettings.Builder, ConfigurationSettingsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(configurationSettings);
                } else if ((this.bitField0_ & 1) == 0 || (configurationSettings2 = this.config_) == null || configurationSettings2 == ConfigurationSettings.getDefaultInstance()) {
                    this.config_ = configurationSettings;
                } else {
                    getConfigBuilder().mergeFrom(configurationSettings);
                }
                if (this.config_ != null) {
                    this.bitField0_ |= 1;
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
                                    codedInputStream.readMessage(getConfigFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setConfig(ConfigurationSettings.Builder builder) {
                SingleFieldBuilderV3<ConfigurationSettings, ConfigurationSettings.Builder, ConfigurationSettingsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.config_ = builder.build();
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
            public ConfigurationNotification getDefaultInstanceForType() {
                return ConfigurationNotification.getDefaultInstance();
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

            public Builder setConfig(ConfigurationSettings configurationSettings) {
                SingleFieldBuilderV3<ConfigurationSettings, ConfigurationSettings.Builder, ConfigurationSettingsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configurationSettings.getClass();
                    this.config_ = configurationSettings;
                } else {
                    singleFieldBuilderV3.setMessage(configurationSettings);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConfigurationNotification) {
                    return mergeFrom((ConfigurationNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConfigurationNotification configurationNotification) {
                if (configurationNotification == ConfigurationNotification.getDefaultInstance()) {
                    return this;
                }
                if (configurationNotification.hasConfig()) {
                    mergeConfig(configurationNotification.getConfig());
                }
                mergeUnknownFields(configurationNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConfigurationNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ ConfigurationNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private ConfigurationNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConfigurationNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigurationNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigurationNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConfigurationNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConfigurationNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConfigurationNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConfigurationNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConfigurationNotification parseFrom(InputStream inputStream) {
            return (ConfigurationNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConfigurationNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigurationNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigurationNotification parseFrom(CodedInputStream codedInputStream) {
            return (ConfigurationNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConfigurationNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigurationNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ConfigurationRequest extends GeneratedMessageV3 implements ConfigurationRequestOrBuilder {
        public static final int CONFIG_FIELD_NUMBER = 1;
        private static final ConfigurationRequest DEFAULT_INSTANCE = new ConfigurationRequest();

        @Deprecated
        public static final Parser<ConfigurationRequest> PARSER = new AbstractParser<ConfigurationRequest>() { // from class: com.garmin.proto.generated.GDIButton.ConfigurationRequest.1
            @Override // com.google.protobuf.Parser
            public ConfigurationRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConfigurationRequest.newBuilder();
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
        private ConfigurationSettings config_;
        private byte memoizedIsInitialized;

        private ConfigurationRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConfigurationRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIButton.internal_static_GDI_Proto_Button_ConfigurationRequest_descriptor;
        }

        public static Builder newBuilder(ConfigurationRequest configurationRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(configurationRequest);
        }

        public static ConfigurationRequest parseDelimitedFrom(InputStream inputStream) {
            return (ConfigurationRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConfigurationRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConfigurationRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConfigurationRequest)) {
                return super.equals(obj);
            }
            ConfigurationRequest configurationRequest = (ConfigurationRequest) obj;
            if (hasConfig() != configurationRequest.hasConfig()) {
                return false;
            }
            return (!hasConfig() || getConfig().equals(configurationRequest.getConfig())) && getUnknownFields().equals(configurationRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIButton.ConfigurationRequestOrBuilder
        public ConfigurationSettings getConfig() {
            ConfigurationSettings configurationSettings = this.config_;
            return configurationSettings == null ? ConfigurationSettings.getDefaultInstance() : configurationSettings;
        }

        @Override // com.garmin.proto.generated.GDIButton.ConfigurationRequestOrBuilder
        public ConfigurationSettingsOrBuilder getConfigOrBuilder() {
            ConfigurationSettings configurationSettings = this.config_;
            return configurationSettings == null ? ConfigurationSettings.getDefaultInstance() : configurationSettings;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConfigurationRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getConfig()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIButton.ConfigurationRequestOrBuilder
        public boolean hasConfig() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasConfig()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getConfig().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIButton.internal_static_GDI_Proto_Button_ConfigurationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigurationRequest.class, Builder.class);
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
            return new ConfigurationRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getConfig());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConfigurationRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<ConfigurationSettings, ConfigurationSettings.Builder, ConfigurationSettingsOrBuilder> configBuilder_;
            private ConfigurationSettings config_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ConfigurationRequest configurationRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<ConfigurationSettings, ConfigurationSettings.Builder, ConfigurationSettingsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                    configurationRequest.config_ = singleFieldBuilderV3 == null ? this.config_ : (ConfigurationSettings) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                configurationRequest.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<ConfigurationSettings, ConfigurationSettings.Builder, ConfigurationSettingsOrBuilder> getConfigFieldBuilder() {
                if (this.configBuilder_ == null) {
                    this.configBuilder_ = new SingleFieldBuilderV3<>(getConfig(), getParentForChildren(), isClean());
                    this.config_ = null;
                }
                return this.configBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIButton.internal_static_GDI_Proto_Button_ConfigurationRequest_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getConfigFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigurationRequest build() {
                ConfigurationRequest configurationRequestBuildPartial = buildPartial();
                if (configurationRequestBuildPartial.isInitialized()) {
                    return configurationRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) configurationRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigurationRequest buildPartial() {
                ConfigurationRequest configurationRequest = new ConfigurationRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(configurationRequest);
                }
                onBuilt();
                return configurationRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.config_ = null;
                SingleFieldBuilderV3<ConfigurationSettings, ConfigurationSettings.Builder, ConfigurationSettingsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configBuilder_ = null;
                }
                return this;
            }

            public Builder clearConfig() {
                this.bitField0_ &= -2;
                this.config_ = null;
                SingleFieldBuilderV3<ConfigurationSettings, ConfigurationSettings.Builder, ConfigurationSettingsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configBuilder_ = null;
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

            @Override // com.garmin.proto.generated.GDIButton.ConfigurationRequestOrBuilder
            public ConfigurationSettings getConfig() {
                SingleFieldBuilderV3<ConfigurationSettings, ConfigurationSettings.Builder, ConfigurationSettingsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationSettings) singleFieldBuilderV3.getMessage();
                }
                ConfigurationSettings configurationSettings = this.config_;
                return configurationSettings == null ? ConfigurationSettings.getDefaultInstance() : configurationSettings;
            }

            public ConfigurationSettings.Builder getConfigBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (ConfigurationSettings.Builder) getConfigFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIButton.ConfigurationRequestOrBuilder
            public ConfigurationSettingsOrBuilder getConfigOrBuilder() {
                SingleFieldBuilderV3<ConfigurationSettings, ConfigurationSettings.Builder, ConfigurationSettingsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationSettingsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConfigurationSettings configurationSettings = this.config_;
                return configurationSettings == null ? ConfigurationSettings.getDefaultInstance() : configurationSettings;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIButton.internal_static_GDI_Proto_Button_ConfigurationRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIButton.ConfigurationRequestOrBuilder
            public boolean hasConfig() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIButton.internal_static_GDI_Proto_Button_ConfigurationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigurationRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeConfig(ConfigurationSettings configurationSettings) {
                ConfigurationSettings configurationSettings2;
                SingleFieldBuilderV3<ConfigurationSettings, ConfigurationSettings.Builder, ConfigurationSettingsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(configurationSettings);
                } else if ((this.bitField0_ & 1) == 0 || (configurationSettings2 = this.config_) == null || configurationSettings2 == ConfigurationSettings.getDefaultInstance()) {
                    this.config_ = configurationSettings;
                } else {
                    getConfigBuilder().mergeFrom(configurationSettings);
                }
                if (this.config_ != null) {
                    this.bitField0_ |= 1;
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
                                    codedInputStream.readMessage(getConfigFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setConfig(ConfigurationSettings.Builder builder) {
                SingleFieldBuilderV3<ConfigurationSettings, ConfigurationSettings.Builder, ConfigurationSettingsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.config_ = builder.build();
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
            public ConfigurationRequest getDefaultInstanceForType() {
                return ConfigurationRequest.getDefaultInstance();
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

            public Builder setConfig(ConfigurationSettings configurationSettings) {
                SingleFieldBuilderV3<ConfigurationSettings, ConfigurationSettings.Builder, ConfigurationSettingsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configurationSettings.getClass();
                    this.config_ = configurationSettings;
                } else {
                    singleFieldBuilderV3.setMessage(configurationSettings);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConfigurationRequest) {
                    return mergeFrom((ConfigurationRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConfigurationRequest configurationRequest) {
                if (configurationRequest == ConfigurationRequest.getDefaultInstance()) {
                    return this;
                }
                if (configurationRequest.hasConfig()) {
                    mergeConfig(configurationRequest.getConfig());
                }
                mergeUnknownFields(configurationRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConfigurationRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ ConfigurationRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private ConfigurationRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConfigurationRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigurationRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigurationRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConfigurationRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConfigurationRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConfigurationRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConfigurationRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConfigurationRequest parseFrom(InputStream inputStream) {
            return (ConfigurationRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConfigurationRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigurationRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigurationRequest parseFrom(CodedInputStream codedInputStream) {
            return (ConfigurationRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConfigurationRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigurationRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ConfigurationResponse extends GeneratedMessageV3 implements ConfigurationResponseOrBuilder {
        public static final int CONFIG_FIELD_NUMBER = 2;
        private static final ConfigurationResponse DEFAULT_INSTANCE = new ConfigurationResponse();

        @Deprecated
        public static final Parser<ConfigurationResponse> PARSER = new AbstractParser<ConfigurationResponse>() { // from class: com.garmin.proto.generated.GDIButton.ConfigurationResponse.1
            @Override // com.google.protobuf.Parser
            public ConfigurationResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConfigurationResponse.newBuilder();
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
        private ConfigurationSettings config_;
        private byte memoizedIsInitialized;
        private int status_;

        private ConfigurationResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConfigurationResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIButton.internal_static_GDI_Proto_Button_ConfigurationResponse_descriptor;
        }

        public static Builder newBuilder(ConfigurationResponse configurationResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(configurationResponse);
        }

        public static ConfigurationResponse parseDelimitedFrom(InputStream inputStream) {
            return (ConfigurationResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConfigurationResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConfigurationResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConfigurationResponse)) {
                return super.equals(obj);
            }
            ConfigurationResponse configurationResponse = (ConfigurationResponse) obj;
            if (hasStatus() != configurationResponse.hasStatus()) {
                return false;
            }
            if ((!hasStatus() || this.status_ == configurationResponse.status_) && hasConfig() == configurationResponse.hasConfig()) {
                return (!hasConfig() || getConfig().equals(configurationResponse.getConfig())) && getUnknownFields().equals(configurationResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIButton.ConfigurationResponseOrBuilder
        public ConfigurationSettings getConfig() {
            ConfigurationSettings configurationSettings = this.config_;
            return configurationSettings == null ? ConfigurationSettings.getDefaultInstance() : configurationSettings;
        }

        @Override // com.garmin.proto.generated.GDIButton.ConfigurationResponseOrBuilder
        public ConfigurationSettingsOrBuilder getConfigOrBuilder() {
            ConfigurationSettings configurationSettings = this.config_;
            return configurationSettings == null ? ConfigurationSettings.getDefaultInstance() : configurationSettings;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConfigurationResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.status_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, getConfig());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIButton.ConfigurationResponseOrBuilder
        public ConfigurationStatus getStatus() {
            ConfigurationStatus configurationStatusForNumber = ConfigurationStatus.forNumber(this.status_);
            return configurationStatusForNumber == null ? ConfigurationStatus.UNKNOWN : configurationStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIButton.ConfigurationResponseOrBuilder
        public boolean hasConfig() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIButton.ConfigurationResponseOrBuilder
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
            if (hasConfig()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getConfig().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIButton.internal_static_GDI_Proto_Button_ConfigurationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigurationResponse.class, Builder.class);
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
            return new ConfigurationResponse();
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
                codedOutputStream.writeMessage(2, getConfig());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConfigurationResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<ConfigurationSettings, ConfigurationSettings.Builder, ConfigurationSettingsOrBuilder> configBuilder_;
            private ConfigurationSettings config_;
            private int status_;

            private Builder() {
                this.status_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ConfigurationResponse configurationResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    configurationResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<ConfigurationSettings, ConfigurationSettings.Builder, ConfigurationSettingsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                    configurationResponse.config_ = singleFieldBuilderV3 == null ? this.config_ : (ConfigurationSettings) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                configurationResponse.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<ConfigurationSettings, ConfigurationSettings.Builder, ConfigurationSettingsOrBuilder> getConfigFieldBuilder() {
                if (this.configBuilder_ == null) {
                    this.configBuilder_ = new SingleFieldBuilderV3<>(getConfig(), getParentForChildren(), isClean());
                    this.config_ = null;
                }
                return this.configBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIButton.internal_static_GDI_Proto_Button_ConfigurationResponse_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getConfigFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigurationResponse build() {
                ConfigurationResponse configurationResponseBuildPartial = buildPartial();
                if (configurationResponseBuildPartial.isInitialized()) {
                    return configurationResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) configurationResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigurationResponse buildPartial() {
                ConfigurationResponse configurationResponse = new ConfigurationResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(configurationResponse);
                }
                onBuilt();
                return configurationResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                this.config_ = null;
                SingleFieldBuilderV3<ConfigurationSettings, ConfigurationSettings.Builder, ConfigurationSettingsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configBuilder_ = null;
                }
                return this;
            }

            public Builder clearConfig() {
                this.bitField0_ &= -3;
                this.config_ = null;
                SingleFieldBuilderV3<ConfigurationSettings, ConfigurationSettings.Builder, ConfigurationSettingsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configBuilder_ = null;
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

            @Override // com.garmin.proto.generated.GDIButton.ConfigurationResponseOrBuilder
            public ConfigurationSettings getConfig() {
                SingleFieldBuilderV3<ConfigurationSettings, ConfigurationSettings.Builder, ConfigurationSettingsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationSettings) singleFieldBuilderV3.getMessage();
                }
                ConfigurationSettings configurationSettings = this.config_;
                return configurationSettings == null ? ConfigurationSettings.getDefaultInstance() : configurationSettings;
            }

            public ConfigurationSettings.Builder getConfigBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (ConfigurationSettings.Builder) getConfigFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIButton.ConfigurationResponseOrBuilder
            public ConfigurationSettingsOrBuilder getConfigOrBuilder() {
                SingleFieldBuilderV3<ConfigurationSettings, ConfigurationSettings.Builder, ConfigurationSettingsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationSettingsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConfigurationSettings configurationSettings = this.config_;
                return configurationSettings == null ? ConfigurationSettings.getDefaultInstance() : configurationSettings;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIButton.internal_static_GDI_Proto_Button_ConfigurationResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIButton.ConfigurationResponseOrBuilder
            public ConfigurationStatus getStatus() {
                ConfigurationStatus configurationStatusForNumber = ConfigurationStatus.forNumber(this.status_);
                return configurationStatusForNumber == null ? ConfigurationStatus.UNKNOWN : configurationStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIButton.ConfigurationResponseOrBuilder
            public boolean hasConfig() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIButton.ConfigurationResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIButton.internal_static_GDI_Proto_Button_ConfigurationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigurationResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeConfig(ConfigurationSettings configurationSettings) {
                ConfigurationSettings configurationSettings2;
                SingleFieldBuilderV3<ConfigurationSettings, ConfigurationSettings.Builder, ConfigurationSettingsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(configurationSettings);
                } else if ((this.bitField0_ & 2) == 0 || (configurationSettings2 = this.config_) == null || configurationSettings2 == ConfigurationSettings.getDefaultInstance()) {
                    this.config_ = configurationSettings;
                } else {
                    getConfigBuilder().mergeFrom(configurationSettings);
                }
                if (this.config_ != null) {
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
                                if (tag == 8) {
                                    int i14 = codedInputStream.readEnum();
                                    if (ConfigurationStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getConfigFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setConfig(ConfigurationSettings.Builder builder) {
                SingleFieldBuilderV3<ConfigurationSettings, ConfigurationSettings.Builder, ConfigurationSettingsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.config_ = builder.build();
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

            public Builder setStatus(ConfigurationStatus configurationStatus) {
                configurationStatus.getClass();
                this.bitField0_ |= 1;
                this.status_ = configurationStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ConfigurationResponse getDefaultInstanceForType() {
                return ConfigurationResponse.getDefaultInstance();
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
                maybeForceBuilderInitialization();
            }

            public Builder setConfig(ConfigurationSettings configurationSettings) {
                SingleFieldBuilderV3<ConfigurationSettings, ConfigurationSettings.Builder, ConfigurationSettingsOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configurationSettings.getClass();
                    this.config_ = configurationSettings;
                } else {
                    singleFieldBuilderV3.setMessage(configurationSettings);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConfigurationResponse) {
                    return mergeFrom((ConfigurationResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConfigurationResponse configurationResponse) {
                if (configurationResponse == ConfigurationResponse.getDefaultInstance()) {
                    return this;
                }
                if (configurationResponse.hasStatus()) {
                    setStatus(configurationResponse.getStatus());
                }
                if (configurationResponse.hasConfig()) {
                    mergeConfig(configurationResponse.getConfig());
                }
                mergeUnknownFields(configurationResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConfigurationResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConfigurationResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigurationResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigurationResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ConfigurationResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ConfigurationResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ConfigurationResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConfigurationResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConfigurationResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConfigurationResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConfigurationResponse parseFrom(InputStream inputStream) {
            return (ConfigurationResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConfigurationResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigurationResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigurationResponse parseFrom(CodedInputStream codedInputStream) {
            return (ConfigurationResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConfigurationResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigurationResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ConfigurationStatus implements ProtocolMessageEnum {
            UNKNOWN(0),
            ACCEPTED(1),
            REJECTED(2);

            public static final int ACCEPTED_VALUE = 1;
            public static final int REJECTED_VALUE = 2;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ConfigurationStatus> internalValueMap = new Internal.EnumLiteMap<ConfigurationStatus>() { // from class: com.garmin.proto.generated.GDIButton.ConfigurationResponse.ConfigurationStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ConfigurationStatus findValueByNumber(int i14) {
                    return ConfigurationStatus.forNumber(i14);
                }
            };
            private static final ConfigurationStatus[] VALUES = values();

            ConfigurationStatus(int i14) {
                this.value = i14;
            }

            public static ConfigurationStatus forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN;
                }
                if (i14 == 1) {
                    return ACCEPTED;
                }
                if (i14 != 2) {
                    return null;
                }
                return REJECTED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ConfigurationResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<ConfigurationStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static ConfigurationStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static ConfigurationStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class ConfigurationSettings extends GeneratedMessageV3 implements ConfigurationSettingsOrBuilder {
        public static final int BUTTONS_FIELD_NUMBER = 1;
        private static final ConfigurationSettings DEFAULT_INSTANCE = new ConfigurationSettings();

        @Deprecated
        public static final Parser<ConfigurationSettings> PARSER = new AbstractParser<ConfigurationSettings>() { // from class: com.garmin.proto.generated.GDIButton.ConfigurationSettings.1
            @Override // com.google.protobuf.Parser
            public ConfigurationSettings parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConfigurationSettings.newBuilder();
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
        private List<ButtonConfig> buttons_;
        private byte memoizedIsInitialized;

        private ConfigurationSettings() {
            this.memoizedIsInitialized = (byte) -1;
            this.buttons_ = Collections.EMPTY_LIST;
        }

        public static ConfigurationSettings getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIButton.internal_static_GDI_Proto_Button_ConfigurationSettings_descriptor;
        }

        public static Builder newBuilder(ConfigurationSettings configurationSettings) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(configurationSettings);
        }

        public static ConfigurationSettings parseDelimitedFrom(InputStream inputStream) {
            return (ConfigurationSettings) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConfigurationSettings parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConfigurationSettings> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConfigurationSettings)) {
                return super.equals(obj);
            }
            ConfigurationSettings configurationSettings = (ConfigurationSettings) obj;
            return getButtonsList().equals(configurationSettings.getButtonsList()) && getUnknownFields().equals(configurationSettings.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIButton.ConfigurationSettingsOrBuilder
        public ButtonConfig getButtons(int i14) {
            return this.buttons_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIButton.ConfigurationSettingsOrBuilder
        public int getButtonsCount() {
            return this.buttons_.size();
        }

        @Override // com.garmin.proto.generated.GDIButton.ConfigurationSettingsOrBuilder
        public List<ButtonConfig> getButtonsList() {
            return this.buttons_;
        }

        @Override // com.garmin.proto.generated.GDIButton.ConfigurationSettingsOrBuilder
        public ButtonConfigOrBuilder getButtonsOrBuilder(int i14) {
            return this.buttons_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIButton.ConfigurationSettingsOrBuilder
        public List<? extends ButtonConfigOrBuilder> getButtonsOrBuilderList() {
            return this.buttons_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConfigurationSettings> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = 0;
            for (int i15 = 0; i15 < this.buttons_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.buttons_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getButtonsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getButtonsList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIButton.internal_static_GDI_Proto_Button_ConfigurationSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigurationSettings.class, Builder.class);
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
            return new ConfigurationSettings();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.buttons_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.buttons_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConfigurationSettingsOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> buttonsBuilder_;
            private List<ButtonConfig> buttons_;

            private Builder() {
                this.buttons_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(ConfigurationSettings configurationSettings) {
            }

            private void buildPartialRepeatedFields(ConfigurationSettings configurationSettings) {
                RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> repeatedFieldBuilderV3 = this.buttonsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    configurationSettings.buttons_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.buttons_ = Collections.unmodifiableList(this.buttons_);
                    this.bitField0_ &= -2;
                }
                configurationSettings.buttons_ = this.buttons_;
            }

            private void ensureButtonsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.buttons_ = new ArrayList(this.buttons_);
                    this.bitField0_ |= 1;
                }
            }

            private RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> getButtonsFieldBuilder() {
                if (this.buttonsBuilder_ == null) {
                    this.buttonsBuilder_ = new RepeatedFieldBuilderV3<>(this.buttons_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.buttons_ = null;
                }
                return this.buttonsBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIButton.internal_static_GDI_Proto_Button_ConfigurationSettings_descriptor;
            }

            public Builder addAllButtons(Iterable<? extends ButtonConfig> iterable) {
                RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> repeatedFieldBuilderV3 = this.buttonsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureButtonsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.buttons_);
                onChanged();
                return this;
            }

            public Builder addButtons(ButtonConfig.Builder builder) {
                RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> repeatedFieldBuilderV3 = this.buttonsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureButtonsIsMutable();
                this.buttons_.add(builder.build());
                onChanged();
                return this;
            }

            public ButtonConfig.Builder addButtonsBuilder() {
                return (ButtonConfig.Builder) getButtonsFieldBuilder().addBuilder(ButtonConfig.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigurationSettings build() {
                ConfigurationSettings configurationSettingsBuildPartial = buildPartial();
                if (configurationSettingsBuildPartial.isInitialized()) {
                    return configurationSettingsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) configurationSettingsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConfigurationSettings buildPartial() {
                ConfigurationSettings configurationSettings = new ConfigurationSettings(this);
                buildPartialRepeatedFields(configurationSettings);
                if (this.bitField0_ != 0) {
                    buildPartial0(configurationSettings);
                }
                onBuilt();
                return configurationSettings;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> repeatedFieldBuilderV3 = this.buttonsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.buttons_ = Collections.EMPTY_LIST;
                } else {
                    this.buttons_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                return this;
            }

            public Builder clearButtons() {
                RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> repeatedFieldBuilderV3 = this.buttonsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.buttons_ = Collections.EMPTY_LIST;
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

            @Override // com.garmin.proto.generated.GDIButton.ConfigurationSettingsOrBuilder
            public ButtonConfig getButtons(int i14) {
                RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> repeatedFieldBuilderV3 = this.buttonsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.buttons_.get(i14) : (ButtonConfig) repeatedFieldBuilderV3.getMessage(i14);
            }

            public ButtonConfig.Builder getButtonsBuilder(int i14) {
                return (ButtonConfig.Builder) getButtonsFieldBuilder().getBuilder(i14);
            }

            public List<ButtonConfig.Builder> getButtonsBuilderList() {
                return getButtonsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIButton.ConfigurationSettingsOrBuilder
            public int getButtonsCount() {
                RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> repeatedFieldBuilderV3 = this.buttonsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.buttons_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIButton.ConfigurationSettingsOrBuilder
            public List<ButtonConfig> getButtonsList() {
                RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> repeatedFieldBuilderV3 = this.buttonsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.buttons_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIButton.ConfigurationSettingsOrBuilder
            public ButtonConfigOrBuilder getButtonsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> repeatedFieldBuilderV3 = this.buttonsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.buttons_.get(i14) : (ButtonConfigOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIButton.ConfigurationSettingsOrBuilder
            public List<? extends ButtonConfigOrBuilder> getButtonsOrBuilderList() {
                RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> repeatedFieldBuilderV3 = this.buttonsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.buttons_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIButton.internal_static_GDI_Proto_Button_ConfigurationSettings_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIButton.internal_static_GDI_Proto_Button_ConfigurationSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(ConfigurationSettings.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(ConfigurationSettings configurationSettings) {
                if (configurationSettings == ConfigurationSettings.getDefaultInstance()) {
                    return this;
                }
                if (this.buttonsBuilder_ == null) {
                    if (!configurationSettings.buttons_.isEmpty()) {
                        if (this.buttons_.isEmpty()) {
                            this.buttons_ = configurationSettings.buttons_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureButtonsIsMutable();
                            this.buttons_.addAll(configurationSettings.buttons_);
                        }
                        onChanged();
                    }
                } else if (!configurationSettings.buttons_.isEmpty()) {
                    boolean zIsEmpty = this.buttonsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> repeatedFieldBuilderV3 = this.buttonsBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.buttonsBuilder_ = null;
                        this.buttons_ = configurationSettings.buttons_;
                        this.bitField0_ &= -2;
                        this.buttonsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getButtonsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(configurationSettings.buttons_);
                    }
                }
                mergeUnknownFields(configurationSettings.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeButtons(int i14) {
                RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> repeatedFieldBuilderV3 = this.buttonsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureButtonsIsMutable();
                this.buttons_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setButtons(int i14, ButtonConfig.Builder builder) {
                RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> repeatedFieldBuilderV3 = this.buttonsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureButtonsIsMutable();
                this.buttons_.set(i14, builder.build());
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
            public ConfigurationSettings getDefaultInstanceForType() {
                return ConfigurationSettings.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.buttons_ = Collections.EMPTY_LIST;
            }

            public ButtonConfig.Builder addButtonsBuilder(int i14) {
                return (ButtonConfig.Builder) getButtonsFieldBuilder().addBuilder(i14, ButtonConfig.getDefaultInstance());
            }

            public Builder addButtons(int i14, ButtonConfig buttonConfig) {
                RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> repeatedFieldBuilderV3 = this.buttonsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    buttonConfig.getClass();
                    ensureButtonsIsMutable();
                    this.buttons_.add(i14, buttonConfig);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, buttonConfig);
                return this;
            }

            public Builder setButtons(int i14, ButtonConfig buttonConfig) {
                RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> repeatedFieldBuilderV3 = this.buttonsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    buttonConfig.getClass();
                    ensureButtonsIsMutable();
                    this.buttons_.set(i14, buttonConfig);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, buttonConfig);
                return this;
            }

            public Builder addButtons(ButtonConfig buttonConfig) {
                RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> repeatedFieldBuilderV3 = this.buttonsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    buttonConfig.getClass();
                    ensureButtonsIsMutable();
                    this.buttons_.add(buttonConfig);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(buttonConfig);
                return this;
            }

            public Builder addButtons(int i14, ButtonConfig.Builder builder) {
                RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> repeatedFieldBuilderV3 = this.buttonsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureButtonsIsMutable();
                    this.buttons_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConfigurationSettings) {
                    return mergeFrom((ConfigurationSettings) message);
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
                                if (tag != 10) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    ButtonConfig buttonConfig = (ButtonConfig) codedInputStream.readMessage(ButtonConfig.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> repeatedFieldBuilderV3 = this.buttonsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureButtonsIsMutable();
                                        this.buttons_.add(buttonConfig);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(buttonConfig);
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
        public ConfigurationSettings getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConfigurationSettings parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigurationSettings) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigurationSettings parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConfigurationSettings parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ConfigurationSettings(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConfigurationSettings parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConfigurationSettings parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ ConfigurationSettings(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ConfigurationSettings parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConfigurationSettings parseFrom(InputStream inputStream) {
            return (ConfigurationSettings) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConfigurationSettings parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigurationSettings) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConfigurationSettings parseFrom(CodedInputStream codedInputStream) {
            return (ConfigurationSettings) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConfigurationSettings parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConfigurationSettings) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class EventNotification extends GeneratedMessageV3 implements EventNotificationOrBuilder {
        public static final int ACTION_FIELD_NUMBER = 2;
        public static final int BUTTON_ID_FIELD_NUMBER = 1;
        public static final int DATA_FIELD_NUMBER = 1021;
        public static final int TIMESTAMP_MS_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int action_;
        private int bitField0_;
        private int buttonId_;
        private byte memoizedIsInitialized;
        private int timestampMs_;
        private static final EventNotification DEFAULT_INSTANCE = new EventNotification();

        @Deprecated
        public static final Parser<EventNotification> PARSER = new AbstractParser<EventNotification>() { // from class: com.garmin.proto.generated.GDIButton.EventNotification.1
            @Override // com.google.protobuf.Parser
            public EventNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = EventNotification.newBuilder();
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
        public static final GeneratedMessage.GeneratedExtension<GDIEventSharingProto.AlertNotification, EventNotification> data = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, EventNotification.class, getDefaultInstance());

        private EventNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.buttonId_ = 0;
            this.action_ = 0;
            this.timestampMs_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EventNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIButton.internal_static_GDI_Proto_Button_EventNotification_descriptor;
        }

        public static Builder newBuilder(EventNotification eventNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(eventNotification);
        }

        public static EventNotification parseDelimitedFrom(InputStream inputStream) {
            return (EventNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EventNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<EventNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EventNotification)) {
                return super.equals(obj);
            }
            EventNotification eventNotification = (EventNotification) obj;
            if (hasButtonId() != eventNotification.hasButtonId()) {
                return false;
            }
            if ((hasButtonId() && this.buttonId_ != eventNotification.buttonId_) || hasAction() != eventNotification.hasAction()) {
                return false;
            }
            if ((!hasAction() || this.action_ == eventNotification.action_) && hasTimestampMs() == eventNotification.hasTimestampMs()) {
                return (!hasTimestampMs() || getTimestampMs() == eventNotification.getTimestampMs()) && getUnknownFields().equals(eventNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIButton.EventNotificationOrBuilder
        public Action getAction() {
            Action actionForNumber = Action.forNumber(this.action_);
            return actionForNumber == null ? Action.UNKNOWN : actionForNumber;
        }

        @Override // com.garmin.proto.generated.GDIButton.EventNotificationOrBuilder
        public ButtonType getButtonId() {
            ButtonType buttonTypeForNumber = ButtonType.forNumber(this.buttonId_);
            return buttonTypeForNumber == null ? ButtonType.BUTTON_TYPE_UNKNOWN : buttonTypeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EventNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.buttonId_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(2, this.action_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(3, this.timestampMs_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIButton.EventNotificationOrBuilder
        public int getTimestampMs() {
            return this.timestampMs_;
        }

        @Override // com.garmin.proto.generated.GDIButton.EventNotificationOrBuilder
        public boolean hasAction() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIButton.EventNotificationOrBuilder
        public boolean hasButtonId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIButton.EventNotificationOrBuilder
        public boolean hasTimestampMs() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasButtonId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.buttonId_;
            }
            if (hasAction()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.action_;
            }
            if (hasTimestampMs()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getTimestampMs();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIButton.internal_static_GDI_Proto_Button_EventNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(EventNotification.class, Builder.class);
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
            return new EventNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.buttonId_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.action_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.timestampMs_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EventNotificationOrBuilder {
            private int action_;
            private int bitField0_;
            private int buttonId_;
            private int timestampMs_;

            private Builder() {
                this.buttonId_ = 0;
                this.action_ = 0;
            }

            private void buildPartial0(EventNotification eventNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    eventNotification.buttonId_ = this.buttonId_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    eventNotification.action_ = this.action_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    eventNotification.timestampMs_ = this.timestampMs_;
                    i14 |= 4;
                }
                eventNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIButton.internal_static_GDI_Proto_Button_EventNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EventNotification build() {
                EventNotification eventNotificationBuildPartial = buildPartial();
                if (eventNotificationBuildPartial.isInitialized()) {
                    return eventNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) eventNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EventNotification buildPartial() {
                EventNotification eventNotification = new EventNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(eventNotification);
                }
                onBuilt();
                return eventNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.buttonId_ = 0;
                this.action_ = 0;
                this.timestampMs_ = 0;
                return this;
            }

            public Builder clearAction() {
                this.bitField0_ &= -3;
                this.action_ = 0;
                onChanged();
                return this;
            }

            public Builder clearButtonId() {
                this.bitField0_ &= -2;
                this.buttonId_ = 0;
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

            public Builder clearTimestampMs() {
                this.bitField0_ &= -5;
                this.timestampMs_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIButton.EventNotificationOrBuilder
            public Action getAction() {
                Action actionForNumber = Action.forNumber(this.action_);
                return actionForNumber == null ? Action.UNKNOWN : actionForNumber;
            }

            @Override // com.garmin.proto.generated.GDIButton.EventNotificationOrBuilder
            public ButtonType getButtonId() {
                ButtonType buttonTypeForNumber = ButtonType.forNumber(this.buttonId_);
                return buttonTypeForNumber == null ? ButtonType.BUTTON_TYPE_UNKNOWN : buttonTypeForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIButton.internal_static_GDI_Proto_Button_EventNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIButton.EventNotificationOrBuilder
            public int getTimestampMs() {
                return this.timestampMs_;
            }

            @Override // com.garmin.proto.generated.GDIButton.EventNotificationOrBuilder
            public boolean hasAction() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIButton.EventNotificationOrBuilder
            public boolean hasButtonId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIButton.EventNotificationOrBuilder
            public boolean hasTimestampMs() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIButton.internal_static_GDI_Proto_Button_EventNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(EventNotification.class, Builder.class);
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
                                    if (ButtonType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.buttonId_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    int i15 = codedInputStream.readEnum();
                                    if (Action.forNumber(i15) == null) {
                                        mergeUnknownVarintField(2, i15);
                                    } else {
                                        this.action_ = i15;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (tag == 24) {
                                    this.timestampMs_ = codedInputStream.readUInt32();
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

            public Builder setAction(Action action) {
                action.getClass();
                this.bitField0_ |= 2;
                this.action_ = action.getNumber();
                onChanged();
                return this;
            }

            public Builder setButtonId(ButtonType buttonType) {
                buttonType.getClass();
                this.bitField0_ |= 1;
                this.buttonId_ = buttonType.getNumber();
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

            public Builder setTimestampMs(int i14) {
                this.timestampMs_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public EventNotification getDefaultInstanceForType() {
                return EventNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.buttonId_ = 0;
                this.action_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EventNotification) {
                    return mergeFrom((EventNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EventNotification eventNotification) {
                if (eventNotification == EventNotification.getDefaultInstance()) {
                    return this;
                }
                if (eventNotification.hasButtonId()) {
                    setButtonId(eventNotification.getButtonId());
                }
                if (eventNotification.hasAction()) {
                    setAction(eventNotification.getAction());
                }
                if (eventNotification.hasTimestampMs()) {
                    setTimestampMs(eventNotification.getTimestampMs());
                }
                mergeUnknownFields(eventNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EventNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static EventNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EventNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EventNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static EventNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EventNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static EventNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static EventNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ EventNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static EventNotification parseFrom(InputStream inputStream) {
            return (EventNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private EventNotification() {
            this.timestampMs_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.buttonId_ = 0;
            this.action_ = 0;
        }

        public static EventNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EventNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EventNotification parseFrom(CodedInputStream codedInputStream) {
            return (EventNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static EventNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EventNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Action implements ProtocolMessageEnum {
            UNKNOWN(0),
            SHORT_PRESS(1),
            HOLD_PRESS(2),
            LONG_HOLD_PRESS(3),
            PRESS(4),
            RELEASE(5);

            public static final int HOLD_PRESS_VALUE = 2;
            public static final int LONG_HOLD_PRESS_VALUE = 3;
            public static final int PRESS_VALUE = 4;
            public static final int RELEASE_VALUE = 5;
            public static final int SHORT_PRESS_VALUE = 1;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Action> internalValueMap = new Internal.EnumLiteMap<Action>() { // from class: com.garmin.proto.generated.GDIButton.EventNotification.Action.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Action findValueByNumber(int i14) {
                    return Action.forNumber(i14);
                }
            };
            private static final Action[] VALUES = values();

            Action(int i14) {
                this.value = i14;
            }

            public static Action forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN;
                }
                if (i14 == 1) {
                    return SHORT_PRESS;
                }
                if (i14 == 2) {
                    return HOLD_PRESS;
                }
                if (i14 == 3) {
                    return LONG_HOLD_PRESS;
                }
                if (i14 == 4) {
                    return PRESS;
                }
                if (i14 != 5) {
                    return null;
                }
                return RELEASE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return EventNotification.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Action> internalGetValueMap() {
                return internalValueMap;
            }

            public static Action valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Action valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class RemoteCapabilities extends GeneratedMessageV3 implements RemoteCapabilitiesOrBuilder {
        public static final int BUTTON_CONFIG_FIELD_NUMBER = 2;
        private static final RemoteCapabilities DEFAULT_INSTANCE = new RemoteCapabilities();

        @Deprecated
        public static final Parser<RemoteCapabilities> PARSER = new AbstractParser<RemoteCapabilities>() { // from class: com.garmin.proto.generated.GDIButton.RemoteCapabilities.1
            @Override // com.google.protobuf.Parser
            public RemoteCapabilities parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = RemoteCapabilities.newBuilder();
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
        public static final int SERVICE_VERSION_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private List<ButtonConfig> buttonConfig_;
        private byte memoizedIsInitialized;
        private int serviceVersion_;

        private RemoteCapabilities() {
            this.serviceVersion_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.buttonConfig_ = Collections.EMPTY_LIST;
        }

        public static RemoteCapabilities getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIButton.internal_static_GDI_Proto_Button_RemoteCapabilities_descriptor;
        }

        public static Builder newBuilder(RemoteCapabilities remoteCapabilities) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(remoteCapabilities);
        }

        public static RemoteCapabilities parseDelimitedFrom(InputStream inputStream) {
            return (RemoteCapabilities) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static RemoteCapabilities parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<RemoteCapabilities> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RemoteCapabilities)) {
                return super.equals(obj);
            }
            RemoteCapabilities remoteCapabilities = (RemoteCapabilities) obj;
            if (hasServiceVersion() != remoteCapabilities.hasServiceVersion()) {
                return false;
            }
            return (!hasServiceVersion() || getServiceVersion() == remoteCapabilities.getServiceVersion()) && getButtonConfigList().equals(remoteCapabilities.getButtonConfigList()) && getUnknownFields().equals(remoteCapabilities.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIButton.RemoteCapabilitiesOrBuilder
        public ButtonConfig getButtonConfig(int i14) {
            return this.buttonConfig_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIButton.RemoteCapabilitiesOrBuilder
        public int getButtonConfigCount() {
            return this.buttonConfig_.size();
        }

        @Override // com.garmin.proto.generated.GDIButton.RemoteCapabilitiesOrBuilder
        public List<ButtonConfig> getButtonConfigList() {
            return this.buttonConfig_;
        }

        @Override // com.garmin.proto.generated.GDIButton.RemoteCapabilitiesOrBuilder
        public ButtonConfigOrBuilder getButtonConfigOrBuilder(int i14) {
            return this.buttonConfig_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIButton.RemoteCapabilitiesOrBuilder
        public List<? extends ButtonConfigOrBuilder> getButtonConfigOrBuilderList() {
            return this.buttonConfig_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<RemoteCapabilities> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.serviceVersion_) : 0;
            for (int i15 = 0; i15 < this.buttonConfig_.size(); i15++) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(2, this.buttonConfig_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIButton.RemoteCapabilitiesOrBuilder
        public int getServiceVersion() {
            return this.serviceVersion_;
        }

        @Override // com.garmin.proto.generated.GDIButton.RemoteCapabilitiesOrBuilder
        public boolean hasServiceVersion() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasServiceVersion()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getServiceVersion();
            }
            if (getButtonConfigCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getButtonConfigList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIButton.internal_static_GDI_Proto_Button_RemoteCapabilities_fieldAccessorTable.ensureFieldAccessorsInitialized(RemoteCapabilities.class, Builder.class);
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
            return new RemoteCapabilities();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.serviceVersion_);
            }
            for (int i14 = 0; i14 < this.buttonConfig_.size(); i14++) {
                codedOutputStream.writeMessage(2, this.buttonConfig_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RemoteCapabilitiesOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> buttonConfigBuilder_;
            private List<ButtonConfig> buttonConfig_;
            private int serviceVersion_;

            private Builder() {
                this.buttonConfig_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(RemoteCapabilities remoteCapabilities) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    remoteCapabilities.serviceVersion_ = this.serviceVersion_;
                } else {
                    i14 = 0;
                }
                remoteCapabilities.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(RemoteCapabilities remoteCapabilities) {
                RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> repeatedFieldBuilderV3 = this.buttonConfigBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    remoteCapabilities.buttonConfig_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 2) != 0) {
                    this.buttonConfig_ = Collections.unmodifiableList(this.buttonConfig_);
                    this.bitField0_ &= -3;
                }
                remoteCapabilities.buttonConfig_ = this.buttonConfig_;
            }

            private void ensureButtonConfigIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.buttonConfig_ = new ArrayList(this.buttonConfig_);
                    this.bitField0_ |= 2;
                }
            }

            private RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> getButtonConfigFieldBuilder() {
                if (this.buttonConfigBuilder_ == null) {
                    this.buttonConfigBuilder_ = new RepeatedFieldBuilderV3<>(this.buttonConfig_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.buttonConfig_ = null;
                }
                return this.buttonConfigBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIButton.internal_static_GDI_Proto_Button_RemoteCapabilities_descriptor;
            }

            public Builder addAllButtonConfig(Iterable<? extends ButtonConfig> iterable) {
                RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> repeatedFieldBuilderV3 = this.buttonConfigBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureButtonConfigIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.buttonConfig_);
                onChanged();
                return this;
            }

            public Builder addButtonConfig(ButtonConfig.Builder builder) {
                RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> repeatedFieldBuilderV3 = this.buttonConfigBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureButtonConfigIsMutable();
                this.buttonConfig_.add(builder.build());
                onChanged();
                return this;
            }

            public ButtonConfig.Builder addButtonConfigBuilder() {
                return (ButtonConfig.Builder) getButtonConfigFieldBuilder().addBuilder(ButtonConfig.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RemoteCapabilities build() {
                RemoteCapabilities remoteCapabilitiesBuildPartial = buildPartial();
                if (remoteCapabilitiesBuildPartial.isInitialized()) {
                    return remoteCapabilitiesBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) remoteCapabilitiesBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RemoteCapabilities buildPartial() {
                RemoteCapabilities remoteCapabilities = new RemoteCapabilities(this);
                buildPartialRepeatedFields(remoteCapabilities);
                if (this.bitField0_ != 0) {
                    buildPartial0(remoteCapabilities);
                }
                onBuilt();
                return remoteCapabilities;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.serviceVersion_ = 0;
                RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> repeatedFieldBuilderV3 = this.buttonConfigBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.buttonConfig_ = Collections.EMPTY_LIST;
                } else {
                    this.buttonConfig_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -3;
                return this;
            }

            public Builder clearButtonConfig() {
                RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> repeatedFieldBuilderV3 = this.buttonConfigBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.buttonConfig_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
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

            public Builder clearServiceVersion() {
                this.bitField0_ &= -2;
                this.serviceVersion_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIButton.RemoteCapabilitiesOrBuilder
            public ButtonConfig getButtonConfig(int i14) {
                RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> repeatedFieldBuilderV3 = this.buttonConfigBuilder_;
                return repeatedFieldBuilderV3 == null ? this.buttonConfig_.get(i14) : (ButtonConfig) repeatedFieldBuilderV3.getMessage(i14);
            }

            public ButtonConfig.Builder getButtonConfigBuilder(int i14) {
                return (ButtonConfig.Builder) getButtonConfigFieldBuilder().getBuilder(i14);
            }

            public List<ButtonConfig.Builder> getButtonConfigBuilderList() {
                return getButtonConfigFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIButton.RemoteCapabilitiesOrBuilder
            public int getButtonConfigCount() {
                RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> repeatedFieldBuilderV3 = this.buttonConfigBuilder_;
                return repeatedFieldBuilderV3 == null ? this.buttonConfig_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIButton.RemoteCapabilitiesOrBuilder
            public List<ButtonConfig> getButtonConfigList() {
                RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> repeatedFieldBuilderV3 = this.buttonConfigBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.buttonConfig_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIButton.RemoteCapabilitiesOrBuilder
            public ButtonConfigOrBuilder getButtonConfigOrBuilder(int i14) {
                RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> repeatedFieldBuilderV3 = this.buttonConfigBuilder_;
                return repeatedFieldBuilderV3 == null ? this.buttonConfig_.get(i14) : (ButtonConfigOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIButton.RemoteCapabilitiesOrBuilder
            public List<? extends ButtonConfigOrBuilder> getButtonConfigOrBuilderList() {
                RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> repeatedFieldBuilderV3 = this.buttonConfigBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.buttonConfig_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIButton.internal_static_GDI_Proto_Button_RemoteCapabilities_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIButton.RemoteCapabilitiesOrBuilder
            public int getServiceVersion() {
                return this.serviceVersion_;
            }

            @Override // com.garmin.proto.generated.GDIButton.RemoteCapabilitiesOrBuilder
            public boolean hasServiceVersion() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIButton.internal_static_GDI_Proto_Button_RemoteCapabilities_fieldAccessorTable.ensureFieldAccessorsInitialized(RemoteCapabilities.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(RemoteCapabilities remoteCapabilities) {
                if (remoteCapabilities == RemoteCapabilities.getDefaultInstance()) {
                    return this;
                }
                if (remoteCapabilities.hasServiceVersion()) {
                    setServiceVersion(remoteCapabilities.getServiceVersion());
                }
                if (this.buttonConfigBuilder_ == null) {
                    if (!remoteCapabilities.buttonConfig_.isEmpty()) {
                        if (this.buttonConfig_.isEmpty()) {
                            this.buttonConfig_ = remoteCapabilities.buttonConfig_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureButtonConfigIsMutable();
                            this.buttonConfig_.addAll(remoteCapabilities.buttonConfig_);
                        }
                        onChanged();
                    }
                } else if (!remoteCapabilities.buttonConfig_.isEmpty()) {
                    boolean zIsEmpty = this.buttonConfigBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> repeatedFieldBuilderV3 = this.buttonConfigBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.buttonConfigBuilder_ = null;
                        this.buttonConfig_ = remoteCapabilities.buttonConfig_;
                        this.bitField0_ &= -3;
                        this.buttonConfigBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getButtonConfigFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(remoteCapabilities.buttonConfig_);
                    }
                }
                mergeUnknownFields(remoteCapabilities.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeButtonConfig(int i14) {
                RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> repeatedFieldBuilderV3 = this.buttonConfigBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureButtonConfigIsMutable();
                this.buttonConfig_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setButtonConfig(int i14, ButtonConfig.Builder builder) {
                RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> repeatedFieldBuilderV3 = this.buttonConfigBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureButtonConfigIsMutable();
                this.buttonConfig_.set(i14, builder.build());
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

            public Builder setServiceVersion(int i14) {
                this.serviceVersion_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public RemoteCapabilities getDefaultInstanceForType() {
                return RemoteCapabilities.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.buttonConfig_ = Collections.EMPTY_LIST;
            }

            public ButtonConfig.Builder addButtonConfigBuilder(int i14) {
                return (ButtonConfig.Builder) getButtonConfigFieldBuilder().addBuilder(i14, ButtonConfig.getDefaultInstance());
            }

            public Builder addButtonConfig(int i14, ButtonConfig buttonConfig) {
                RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> repeatedFieldBuilderV3 = this.buttonConfigBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    buttonConfig.getClass();
                    ensureButtonConfigIsMutable();
                    this.buttonConfig_.add(i14, buttonConfig);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, buttonConfig);
                return this;
            }

            public Builder setButtonConfig(int i14, ButtonConfig buttonConfig) {
                RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> repeatedFieldBuilderV3 = this.buttonConfigBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    buttonConfig.getClass();
                    ensureButtonConfigIsMutable();
                    this.buttonConfig_.set(i14, buttonConfig);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, buttonConfig);
                return this;
            }

            public Builder addButtonConfig(ButtonConfig buttonConfig) {
                RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> repeatedFieldBuilderV3 = this.buttonConfigBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    buttonConfig.getClass();
                    ensureButtonConfigIsMutable();
                    this.buttonConfig_.add(buttonConfig);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(buttonConfig);
                return this;
            }

            public Builder addButtonConfig(int i14, ButtonConfig.Builder builder) {
                RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> repeatedFieldBuilderV3 = this.buttonConfigBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureButtonConfigIsMutable();
                    this.buttonConfig_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof RemoteCapabilities) {
                    return mergeFrom((RemoteCapabilities) message);
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
                                    this.serviceVersion_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    ButtonConfig buttonConfig = (ButtonConfig) codedInputStream.readMessage(ButtonConfig.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<ButtonConfig, ButtonConfig.Builder, ButtonConfigOrBuilder> repeatedFieldBuilderV3 = this.buttonConfigBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureButtonConfigIsMutable();
                                        this.buttonConfig_.add(buttonConfig);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(buttonConfig);
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
        public RemoteCapabilities getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static RemoteCapabilities parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RemoteCapabilities) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RemoteCapabilities parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static RemoteCapabilities parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static RemoteCapabilities parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static RemoteCapabilities parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static RemoteCapabilities parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private RemoteCapabilities(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.serviceVersion_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static RemoteCapabilities parseFrom(InputStream inputStream) {
            return (RemoteCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static RemoteCapabilities parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RemoteCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ RemoteCapabilities(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static RemoteCapabilities parseFrom(CodedInputStream codedInputStream) {
            return (RemoteCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static RemoteCapabilities parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RemoteCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        public static final int CONFIG_NOTIFICATION_FIELD_NUMBER = 3;
        public static final int CONFIG_REQUEST_FIELD_NUMBER = 1;
        public static final int CONFIG_RESPONSE_FIELD_NUMBER = 2;
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDIButton.Service.1
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
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ConfigurationNotification configNotification_;
        private ConfigurationRequest configRequest_;
        private ConfigurationResponse configResponse_;
        private byte memoizedIsInitialized;

        private Service(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Service getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIButton.internal_static_GDI_Proto_Button_Service_descriptor;
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
            if (hasConfigRequest() != service.hasConfigRequest()) {
                return false;
            }
            if ((hasConfigRequest() && !getConfigRequest().equals(service.getConfigRequest())) || hasConfigResponse() != service.hasConfigResponse()) {
                return false;
            }
            if ((!hasConfigResponse() || getConfigResponse().equals(service.getConfigResponse())) && hasConfigNotification() == service.hasConfigNotification()) {
                return (!hasConfigNotification() || getConfigNotification().equals(service.getConfigNotification())) && getUnknownFields().equals(service.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIButton.ServiceOrBuilder
        public ConfigurationNotification getConfigNotification() {
            ConfigurationNotification configurationNotification = this.configNotification_;
            return configurationNotification == null ? ConfigurationNotification.getDefaultInstance() : configurationNotification;
        }

        @Override // com.garmin.proto.generated.GDIButton.ServiceOrBuilder
        public ConfigurationNotificationOrBuilder getConfigNotificationOrBuilder() {
            ConfigurationNotification configurationNotification = this.configNotification_;
            return configurationNotification == null ? ConfigurationNotification.getDefaultInstance() : configurationNotification;
        }

        @Override // com.garmin.proto.generated.GDIButton.ServiceOrBuilder
        public ConfigurationRequest getConfigRequest() {
            ConfigurationRequest configurationRequest = this.configRequest_;
            return configurationRequest == null ? ConfigurationRequest.getDefaultInstance() : configurationRequest;
        }

        @Override // com.garmin.proto.generated.GDIButton.ServiceOrBuilder
        public ConfigurationRequestOrBuilder getConfigRequestOrBuilder() {
            ConfigurationRequest configurationRequest = this.configRequest_;
            return configurationRequest == null ? ConfigurationRequest.getDefaultInstance() : configurationRequest;
        }

        @Override // com.garmin.proto.generated.GDIButton.ServiceOrBuilder
        public ConfigurationResponse getConfigResponse() {
            ConfigurationResponse configurationResponse = this.configResponse_;
            return configurationResponse == null ? ConfigurationResponse.getDefaultInstance() : configurationResponse;
        }

        @Override // com.garmin.proto.generated.GDIButton.ServiceOrBuilder
        public ConfigurationResponseOrBuilder getConfigResponseOrBuilder() {
            ConfigurationResponse configurationResponse = this.configResponse_;
            return configurationResponse == null ? ConfigurationResponse.getDefaultInstance() : configurationResponse;
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
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getConfigRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getConfigResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getConfigNotification());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIButton.ServiceOrBuilder
        public boolean hasConfigNotification() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIButton.ServiceOrBuilder
        public boolean hasConfigRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIButton.ServiceOrBuilder
        public boolean hasConfigResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasConfigRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getConfigRequest().hashCode();
            }
            if (hasConfigResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getConfigResponse().hashCode();
            }
            if (hasConfigNotification()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getConfigNotification().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIButton.internal_static_GDI_Proto_Button_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getConfigRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getConfigResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getConfigNotification());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> configNotificationBuilder_;
            private ConfigurationNotification configNotification_;
            private SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> configRequestBuilder_;
            private ConfigurationRequest configRequest_;
            private SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> configResponseBuilder_;
            private ConfigurationResponse configResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Service service) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configRequestBuilder_;
                    service.configRequest_ = singleFieldBuilderV3 == null ? this.configRequest_ : (ConfigurationRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV4 = this.configResponseBuilder_;
                    service.configResponse_ = singleFieldBuilderV4 == null ? this.configResponse_ : (ConfigurationResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV5 = this.configNotificationBuilder_;
                    service.configNotification_ = singleFieldBuilderV5 == null ? this.configNotification_ : (ConfigurationNotification) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                service.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> getConfigNotificationFieldBuilder() {
                if (this.configNotificationBuilder_ == null) {
                    this.configNotificationBuilder_ = new SingleFieldBuilderV3<>(getConfigNotification(), getParentForChildren(), isClean());
                    this.configNotification_ = null;
                }
                return this.configNotificationBuilder_;
            }

            private SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> getConfigRequestFieldBuilder() {
                if (this.configRequestBuilder_ == null) {
                    this.configRequestBuilder_ = new SingleFieldBuilderV3<>(getConfigRequest(), getParentForChildren(), isClean());
                    this.configRequest_ = null;
                }
                return this.configRequestBuilder_;
            }

            private SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> getConfigResponseFieldBuilder() {
                if (this.configResponseBuilder_ == null) {
                    this.configResponseBuilder_ = new SingleFieldBuilderV3<>(getConfigResponse(), getParentForChildren(), isClean());
                    this.configResponse_ = null;
                }
                return this.configResponseBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIButton.internal_static_GDI_Proto_Button_Service_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getConfigRequestFieldBuilder();
                    getConfigResponseFieldBuilder();
                    getConfigNotificationFieldBuilder();
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
                this.configRequest_ = null;
                SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configRequestBuilder_ = null;
                }
                this.configResponse_ = null;
                SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV4 = this.configResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.configResponseBuilder_ = null;
                }
                this.configNotification_ = null;
                SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV5 = this.configNotificationBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.configNotificationBuilder_ = null;
                }
                return this;
            }

            public Builder clearConfigNotification() {
                this.bitField0_ &= -5;
                this.configNotification_ = null;
                SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV3 = this.configNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConfigRequest() {
                this.bitField0_ &= -2;
                this.configRequest_ = null;
                SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConfigResponse() {
                this.bitField0_ &= -3;
                this.configResponse_ = null;
                SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV3 = this.configResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configResponseBuilder_ = null;
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

            @Override // com.garmin.proto.generated.GDIButton.ServiceOrBuilder
            public ConfigurationNotification getConfigNotification() {
                SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV3 = this.configNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationNotification) singleFieldBuilderV3.getMessage();
                }
                ConfigurationNotification configurationNotification = this.configNotification_;
                return configurationNotification == null ? ConfigurationNotification.getDefaultInstance() : configurationNotification;
            }

            public ConfigurationNotification.Builder getConfigNotificationBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (ConfigurationNotification.Builder) getConfigNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIButton.ServiceOrBuilder
            public ConfigurationNotificationOrBuilder getConfigNotificationOrBuilder() {
                SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV3 = this.configNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConfigurationNotification configurationNotification = this.configNotification_;
                return configurationNotification == null ? ConfigurationNotification.getDefaultInstance() : configurationNotification;
            }

            @Override // com.garmin.proto.generated.GDIButton.ServiceOrBuilder
            public ConfigurationRequest getConfigRequest() {
                SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationRequest) singleFieldBuilderV3.getMessage();
                }
                ConfigurationRequest configurationRequest = this.configRequest_;
                return configurationRequest == null ? ConfigurationRequest.getDefaultInstance() : configurationRequest;
            }

            public ConfigurationRequest.Builder getConfigRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (ConfigurationRequest.Builder) getConfigRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIButton.ServiceOrBuilder
            public ConfigurationRequestOrBuilder getConfigRequestOrBuilder() {
                SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConfigurationRequest configurationRequest = this.configRequest_;
                return configurationRequest == null ? ConfigurationRequest.getDefaultInstance() : configurationRequest;
            }

            @Override // com.garmin.proto.generated.GDIButton.ServiceOrBuilder
            public ConfigurationResponse getConfigResponse() {
                SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV3 = this.configResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationResponse) singleFieldBuilderV3.getMessage();
                }
                ConfigurationResponse configurationResponse = this.configResponse_;
                return configurationResponse == null ? ConfigurationResponse.getDefaultInstance() : configurationResponse;
            }

            public ConfigurationResponse.Builder getConfigResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (ConfigurationResponse.Builder) getConfigResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIButton.ServiceOrBuilder
            public ConfigurationResponseOrBuilder getConfigResponseOrBuilder() {
                SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV3 = this.configResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConfigurationResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConfigurationResponse configurationResponse = this.configResponse_;
                return configurationResponse == null ? ConfigurationResponse.getDefaultInstance() : configurationResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIButton.internal_static_GDI_Proto_Button_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIButton.ServiceOrBuilder
            public boolean hasConfigNotification() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIButton.ServiceOrBuilder
            public boolean hasConfigRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIButton.ServiceOrBuilder
            public boolean hasConfigResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIButton.internal_static_GDI_Proto_Button_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeConfigNotification(ConfigurationNotification configurationNotification) {
                ConfigurationNotification configurationNotification2;
                SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV3 = this.configNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(configurationNotification);
                } else if ((this.bitField0_ & 4) == 0 || (configurationNotification2 = this.configNotification_) == null || configurationNotification2 == ConfigurationNotification.getDefaultInstance()) {
                    this.configNotification_ = configurationNotification;
                } else {
                    getConfigNotificationBuilder().mergeFrom(configurationNotification);
                }
                if (this.configNotification_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConfigRequest(ConfigurationRequest configurationRequest) {
                ConfigurationRequest configurationRequest2;
                SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(configurationRequest);
                } else if ((this.bitField0_ & 1) == 0 || (configurationRequest2 = this.configRequest_) == null || configurationRequest2 == ConfigurationRequest.getDefaultInstance()) {
                    this.configRequest_ = configurationRequest;
                } else {
                    getConfigRequestBuilder().mergeFrom(configurationRequest);
                }
                if (this.configRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConfigResponse(ConfigurationResponse configurationResponse) {
                ConfigurationResponse configurationResponse2;
                SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV3 = this.configResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(configurationResponse);
                } else if ((this.bitField0_ & 2) == 0 || (configurationResponse2 = this.configResponse_) == null || configurationResponse2 == ConfigurationResponse.getDefaultInstance()) {
                    this.configResponse_ = configurationResponse;
                } else {
                    getConfigResponseBuilder().mergeFrom(configurationResponse);
                }
                if (this.configResponse_ != null) {
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
                                    codedInputStream.readMessage(getConfigRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getConfigResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getConfigNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setConfigNotification(ConfigurationNotification.Builder builder) {
                SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV3 = this.configNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.configNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setConfigRequest(ConfigurationRequest.Builder builder) {
                SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.configRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setConfigResponse(ConfigurationResponse.Builder builder) {
                SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV3 = this.configResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.configResponse_ = builder.build();
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

            public Builder setConfigNotification(ConfigurationNotification configurationNotification) {
                SingleFieldBuilderV3<ConfigurationNotification, ConfigurationNotification.Builder, ConfigurationNotificationOrBuilder> singleFieldBuilderV3 = this.configNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configurationNotification.getClass();
                    this.configNotification_ = configurationNotification;
                } else {
                    singleFieldBuilderV3.setMessage(configurationNotification);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setConfigRequest(ConfigurationRequest configurationRequest) {
                SingleFieldBuilderV3<ConfigurationRequest, ConfigurationRequest.Builder, ConfigurationRequestOrBuilder> singleFieldBuilderV3 = this.configRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configurationRequest.getClass();
                    this.configRequest_ = configurationRequest;
                } else {
                    singleFieldBuilderV3.setMessage(configurationRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setConfigResponse(ConfigurationResponse configurationResponse) {
                SingleFieldBuilderV3<ConfigurationResponse, ConfigurationResponse.Builder, ConfigurationResponseOrBuilder> singleFieldBuilderV3 = this.configResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    configurationResponse.getClass();
                    this.configResponse_ = configurationResponse;
                } else {
                    singleFieldBuilderV3.setMessage(configurationResponse);
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
                if (service.hasConfigRequest()) {
                    mergeConfigRequest(service.getConfigRequest());
                }
                if (service.hasConfigResponse()) {
                    mergeConfigResponse(service.getConfigResponse());
                }
                if (service.hasConfigNotification()) {
                    mergeConfigNotification(service.getConfigNotification());
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

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public enum ButtonMode implements ProtocolMessageEnum {
        BUTTON_MODE_UNKNOWN(0),
        BUTTON_MODE_DISCRETE(1),
        BUTTON_MODE_RAW(2);

        public static final int BUTTON_MODE_DISCRETE_VALUE = 1;
        public static final int BUTTON_MODE_RAW_VALUE = 2;
        public static final int BUTTON_MODE_UNKNOWN_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<ButtonMode> internalValueMap = new Internal.EnumLiteMap<ButtonMode>() { // from class: com.garmin.proto.generated.GDIButton.ButtonMode.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ButtonMode findValueByNumber(int i14) {
                return ButtonMode.forNumber(i14);
            }
        };
        private static final ButtonMode[] VALUES = values();

        ButtonMode(int i14) {
            this.value = i14;
        }

        public static ButtonMode forNumber(int i14) {
            if (i14 == 0) {
                return BUTTON_MODE_UNKNOWN;
            }
            if (i14 == 1) {
                return BUTTON_MODE_DISCRETE;
            }
            if (i14 != 2) {
                return null;
            }
            return BUTTON_MODE_RAW;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIButton.getDescriptor().getEnumTypes().get(1);
        }

        public static Internal.EnumLiteMap<ButtonMode> internalGetValueMap() {
            return internalValueMap;
        }

        public static ButtonMode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static ButtonMode valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum ButtonType implements ProtocolMessageEnum {
        BUTTON_TYPE_UNKNOWN(0),
        BUTTON_TYPE_OK(1),
        BUTTON_TYPE_PAIR(2);

        public static final int BUTTON_TYPE_OK_VALUE = 1;
        public static final int BUTTON_TYPE_PAIR_VALUE = 2;
        public static final int BUTTON_TYPE_UNKNOWN_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<ButtonType> internalValueMap = new Internal.EnumLiteMap<ButtonType>() { // from class: com.garmin.proto.generated.GDIButton.ButtonType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public ButtonType findValueByNumber(int i14) {
                return ButtonType.forNumber(i14);
            }
        };
        private static final ButtonType[] VALUES = values();

        ButtonType(int i14) {
            this.value = i14;
        }

        public static ButtonType forNumber(int i14) {
            if (i14 == 0) {
                return BUTTON_TYPE_UNKNOWN;
            }
            if (i14 == 1) {
                return BUTTON_TYPE_OK;
            }
            if (i14 != 2) {
                return null;
            }
            return BUTTON_TYPE_PAIR;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIButton.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<ButtonType> internalGetValueMap() {
            return internalValueMap;
        }

        public static ButtonType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static ButtonType valueOf(int i14) {
            return forNumber(i14);
        }
    }
}
