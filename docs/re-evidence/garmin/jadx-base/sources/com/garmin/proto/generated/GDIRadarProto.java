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
public final class GDIRadarProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u000eGDIRadar.proto\u0012\u000fGDI.Proto.Radar\u001a\u0015GDIEventSharing.proto\"±\u0004\n\u0007Service\u0012=\n\u0010settings_request\u0018\u0001 \u0001(\u000b2#.GDI.Proto.Radar.GetSettingsRequest\u0012?\n\u0011settings_response\u0018\u0002 \u0001(\u000b2$.GDI.Proto.Radar.GetSettingsResponse\u0012G\n\u0017change_settings_request\u0018\u0003 \u0001(\u000b2&.GDI.Proto.Radar.ChangeSettingsRequest\u0012I\n\u0018change_settings_response\u0018\u0004 \u0001(\u000b2'.GDI.Proto.Radar.ChangeSettingsResponse\u0012;\n\u0011test_mode_request\u0018\u0005 \u0001(\u000b2 .GDI.Proto.Radar.TestModeRequest\u0012=\n\u0012test_mode_response\u0018\u0006 \u0001(\u000b2!.GDI.Proto.Radar.TestModeResponse\u0012I\n\u0018restore_defaults_request\u0018\u0007 \u0001(\u000b2'.GDI.Proto.Radar.RestoreDefaultsRequest\u0012K\n\u0019restore_defaults_response\u0018\b \u0001(\u000b2(.GDI.Proto.Radar.RestoreDefaultsResponse\"@\n\u000fLimpModeControl\u0012\u0014\n\fforce_enable\u0018\u0001 \u0001(\b\u0012\u0017\n\u000fspeed_threshold\u0018\u0002 \u0001(\u0002\"À\u0001\n\rAlertSettings\u0012?\n\u000bsensitivity\u0018\u0001 \u0001(\u000e2*.GDI.Proto.Radar.AlertSettings.Sensitivity\u0012\u001a\n\u0012enable_rear_lights\u0018\u0002 \u0001(\b\u0012\u001b\n\u0013enable_audio_alerts\u0018\u0003 \u0001(\b\"5\n\u000bSensitivity\u0012\u0007\n\u0003OFF\u0010\u0000\u0012\u0007\n\u0003LOW\u0010\u0001\u0012\n\n\u0006NORMAL\u0010\u0002\u0012\b\n\u0004HIGH\u0010\u0003\"ö\u0001\n\bSettings\u00129\n\u0011blind_spot_alerts\u0018\u0001 \u0001(\u000b2\u001e.GDI.Proto.Radar.AlertSettings\u00123\n\u000brear_alerts\u0018\u0002 \u0001(\u000b2\u001e.GDI.Proto.Radar.AlertSettings\u0012\u0018\n\u0010demo_mode_active\u0018\u0003 \u0001(\b\u0012;\n\u0011limp_mode_control\u0018\u0004 \u0001(\u000b2 .GDI.Proto.Radar.LimpModeControl\u0012#\n\u001blight_level_updates_enabled\u0018\u0005 \u0001(\b\"\u0014\n\u0012GetSettingsRequest\"t\n\u0013GetSettingsResponse\u0012+\n\bsettings\u0018\u0001 \u0001(\u000b2\u0019.GDI.Proto.Radar.Settings\u00120\n\u000blight_level\u0018\u0002 \u0001(\u000e2\u001b.GDI.Proto.Radar.LightLevel\"D\n\u0015ChangeSettingsRequest\u0012+\n\bsettings\u0018\u0001 \u0001(\u000b2\u0019.GDI.Proto.Radar.Settings\"\u009e\u0001\n\u0016ChangeSettingsResponse\u0012L\n\u0006status\u0018\u0001 \u0001(\u000e2<.GDI.Proto.Radar.ChangeSettingsResponse.ChangeSettingsStatus\"6\n\u0014ChangeSettingsStatus\u0012\u000b\n\u0007SUCCESS\u0010\u0000\u0012\u0011\n\rUNKNOWN_ERROR\u0010\u0001\"Û\u0001\n\u0015SettingsChangeDetails\u0012+\n\bsettings\u0018\u0001 \u0001(\u000b2\u0019.GDI.Proto.Radar.Settings\u00120\n\u000blight_level\u0018\u0002 \u0001(\u000e2\u001b.GDI.Proto.Radar.LightLevel2c\n\u0007details\u0012).GDI.Proto.EventSharing.AlertNotification\u0018ó\u0007 \u0001(\u000b2&.GDI.Proto.Radar.SettingsChangeDetails\"\u009e\u0001\n\u000fTestModeRequest\u0012=\n\u0005state\u0018\u0002 \u0001(\u000e2..GDI.Proto.Radar.TestModeRequest.TestModeState\"L\n\rTestModeState\u0012\u0007\n\u0003OFF\u0010\u0000\u0012\u000f\n\u000bLEFT_LIGHTS\u0010\u0001\u0012\u000f\n\u000bREAR_LIGHTS\u0010\u0002\u0012\u0010\n\fRIGHT_LIGHTS\u0010\u0003\"\u0086\u0001\n\u0010TestModeResponse\u0012@\n\u0006status\u0018\u0001 \u0001(\u000e20.GDI.Proto.Radar.TestModeResponse.TestModeStatus\"0\n\u000eTestModeStatus\u0012\u000b\n\u0007SUCCESS\u0010\u0000\u0012\u0011\n\rUNKNOWN_ERROR\u0010\u0001\"\u0018\n\u0016RestoreDefaultsRequest\"¢\u0001\n\u0017RestoreDefaultsResponse\u0012N\n\u0006status\u0018\u0001 \u0001(\u000e2>.GDI.Proto.Radar.RestoreDefaultsResponse.RestoreDefaultsStatus\"7\n\u0015RestoreDefaultsStatus\u0012\u000b\n\u0007SUCCESS\u0010\u0000\u0012\u0011\n\rUNKNOWN_ERROR\u0010\u0001*J\n\nLightLevel\u0012\u0007\n\u0003DAY\u0010\u0000\u0012\r\n\tVERY_HIGH\u0010\u0001\u0012\b\n\u0004HIGH\u0010\u0002\u0012\u0007\n\u0003MED\u0010\u0003\u0012\u0007\n\u0003LOW\u0010\u0004\u0012\b\n\u0004DARK\u0010\u0005B-\n\u001acom.garmin.proto.generatedB\rGDIRadarProtoH\u0003"}, new Descriptors.FileDescriptor[]{GDIEventSharingProto.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Radar_AlertSettings_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Radar_AlertSettings_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Radar_ChangeSettingsRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Radar_ChangeSettingsRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Radar_ChangeSettingsResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Radar_ChangeSettingsResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Radar_GetSettingsRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Radar_GetSettingsRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Radar_GetSettingsResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Radar_GetSettingsResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Radar_LimpModeControl_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Radar_LimpModeControl_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Radar_RestoreDefaultsRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Radar_RestoreDefaultsRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Radar_RestoreDefaultsResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Radar_RestoreDefaultsResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Radar_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Radar_Service_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Radar_SettingsChangeDetails_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Radar_SettingsChangeDetails_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Radar_Settings_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Radar_Settings_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Radar_TestModeRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Radar_TestModeRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Radar_TestModeResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Radar_TestModeResponse_fieldAccessorTable;

    public interface AlertSettingsOrBuilder extends MessageOrBuilder {
        boolean getEnableAudioAlerts();

        boolean getEnableRearLights();

        AlertSettings.Sensitivity getSensitivity();

        boolean hasEnableAudioAlerts();

        boolean hasEnableRearLights();

        boolean hasSensitivity();
    }

    public interface ChangeSettingsRequestOrBuilder extends MessageOrBuilder {
        Settings getSettings();

        SettingsOrBuilder getSettingsOrBuilder();

        boolean hasSettings();
    }

    public interface ChangeSettingsResponseOrBuilder extends MessageOrBuilder {
        ChangeSettingsResponse.ChangeSettingsStatus getStatus();

        boolean hasStatus();
    }

    public interface GetSettingsRequestOrBuilder extends MessageOrBuilder {
    }

    public interface GetSettingsResponseOrBuilder extends MessageOrBuilder {
        LightLevel getLightLevel();

        Settings getSettings();

        SettingsOrBuilder getSettingsOrBuilder();

        boolean hasLightLevel();

        boolean hasSettings();
    }

    public interface LimpModeControlOrBuilder extends MessageOrBuilder {
        boolean getForceEnable();

        float getSpeedThreshold();

        boolean hasForceEnable();

        boolean hasSpeedThreshold();
    }

    public interface RestoreDefaultsRequestOrBuilder extends MessageOrBuilder {
    }

    public interface RestoreDefaultsResponseOrBuilder extends MessageOrBuilder {
        RestoreDefaultsResponse.RestoreDefaultsStatus getStatus();

        boolean hasStatus();
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
        ChangeSettingsRequest getChangeSettingsRequest();

        ChangeSettingsRequestOrBuilder getChangeSettingsRequestOrBuilder();

        ChangeSettingsResponse getChangeSettingsResponse();

        ChangeSettingsResponseOrBuilder getChangeSettingsResponseOrBuilder();

        RestoreDefaultsRequest getRestoreDefaultsRequest();

        RestoreDefaultsRequestOrBuilder getRestoreDefaultsRequestOrBuilder();

        RestoreDefaultsResponse getRestoreDefaultsResponse();

        RestoreDefaultsResponseOrBuilder getRestoreDefaultsResponseOrBuilder();

        GetSettingsRequest getSettingsRequest();

        GetSettingsRequestOrBuilder getSettingsRequestOrBuilder();

        GetSettingsResponse getSettingsResponse();

        GetSettingsResponseOrBuilder getSettingsResponseOrBuilder();

        TestModeRequest getTestModeRequest();

        TestModeRequestOrBuilder getTestModeRequestOrBuilder();

        TestModeResponse getTestModeResponse();

        TestModeResponseOrBuilder getTestModeResponseOrBuilder();

        boolean hasChangeSettingsRequest();

        boolean hasChangeSettingsResponse();

        boolean hasRestoreDefaultsRequest();

        boolean hasRestoreDefaultsResponse();

        boolean hasSettingsRequest();

        boolean hasSettingsResponse();

        boolean hasTestModeRequest();

        boolean hasTestModeResponse();
    }

    public interface SettingsChangeDetailsOrBuilder extends MessageOrBuilder {
        LightLevel getLightLevel();

        Settings getSettings();

        SettingsOrBuilder getSettingsOrBuilder();

        boolean hasLightLevel();

        boolean hasSettings();
    }

    public interface SettingsOrBuilder extends MessageOrBuilder {
        AlertSettings getBlindSpotAlerts();

        AlertSettingsOrBuilder getBlindSpotAlertsOrBuilder();

        boolean getDemoModeActive();

        boolean getLightLevelUpdatesEnabled();

        LimpModeControl getLimpModeControl();

        LimpModeControlOrBuilder getLimpModeControlOrBuilder();

        AlertSettings getRearAlerts();

        AlertSettingsOrBuilder getRearAlertsOrBuilder();

        boolean hasBlindSpotAlerts();

        boolean hasDemoModeActive();

        boolean hasLightLevelUpdatesEnabled();

        boolean hasLimpModeControl();

        boolean hasRearAlerts();
    }

    public interface TestModeRequestOrBuilder extends MessageOrBuilder {
        TestModeRequest.TestModeState getState();

        boolean hasState();
    }

    public interface TestModeResponseOrBuilder extends MessageOrBuilder {
        TestModeResponse.TestModeStatus getStatus();

        boolean hasStatus();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_Radar_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_Radar_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"SettingsRequest", "SettingsResponse", "ChangeSettingsRequest", "ChangeSettingsResponse", "TestModeRequest", "TestModeResponse", "RestoreDefaultsRequest", "RestoreDefaultsResponse"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_Radar_LimpModeControl_descriptor = descriptor3;
        internal_static_GDI_Proto_Radar_LimpModeControl_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"ForceEnable", "SpeedThreshold"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_Radar_AlertSettings_descriptor = descriptor4;
        internal_static_GDI_Proto_Radar_AlertSettings_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Sensitivity", "EnableRearLights", "EnableAudioAlerts"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_Radar_Settings_descriptor = descriptor5;
        internal_static_GDI_Proto_Radar_Settings_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"BlindSpotAlerts", "RearAlerts", "DemoModeActive", "LimpModeControl", "LightLevelUpdatesEnabled"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_Radar_GetSettingsRequest_descriptor = descriptor6;
        internal_static_GDI_Proto_Radar_GetSettingsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[0]);
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_Radar_GetSettingsResponse_descriptor = descriptor7;
        internal_static_GDI_Proto_Radar_GetSettingsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Settings", "LightLevel"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_Radar_ChangeSettingsRequest_descriptor = descriptor8;
        internal_static_GDI_Proto_Radar_ChangeSettingsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Settings"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_Radar_ChangeSettingsResponse_descriptor = descriptor9;
        internal_static_GDI_Proto_Radar_ChangeSettingsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Status"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_GDI_Proto_Radar_SettingsChangeDetails_descriptor = descriptor10;
        internal_static_GDI_Proto_Radar_SettingsChangeDetails_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Settings", "LightLevel"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(9);
        internal_static_GDI_Proto_Radar_TestModeRequest_descriptor = descriptor11;
        internal_static_GDI_Proto_Radar_TestModeRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"State"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(10);
        internal_static_GDI_Proto_Radar_TestModeResponse_descriptor = descriptor12;
        internal_static_GDI_Proto_Radar_TestModeResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Status"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(11);
        internal_static_GDI_Proto_Radar_RestoreDefaultsRequest_descriptor = descriptor13;
        internal_static_GDI_Proto_Radar_RestoreDefaultsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[0]);
        Descriptors.Descriptor descriptor14 = getDescriptor().getMessageTypes().get(12);
        internal_static_GDI_Proto_Radar_RestoreDefaultsResponse_descriptor = descriptor14;
        internal_static_GDI_Proto_Radar_RestoreDefaultsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"Status"});
        GDIEventSharingProto.getDescriptor();
    }

    private GDIRadarProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(SettingsChangeDetails.details);
    }

    public static final class GetSettingsRequest extends GeneratedMessageV3 implements GetSettingsRequestOrBuilder {
        private static final GetSettingsRequest DEFAULT_INSTANCE = new GetSettingsRequest();

        @Deprecated
        public static final Parser<GetSettingsRequest> PARSER = new AbstractParser<GetSettingsRequest>() { // from class: com.garmin.proto.generated.GDIRadarProto.GetSettingsRequest.1
            @Override // com.google.protobuf.Parser
            public GetSettingsRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GetSettingsRequest.newBuilder();
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

        private GetSettingsRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetSettingsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRadarProto.internal_static_GDI_Proto_Radar_GetSettingsRequest_descriptor;
        }

        public static Builder newBuilder(GetSettingsRequest getSettingsRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getSettingsRequest);
        }

        public static GetSettingsRequest parseDelimitedFrom(InputStream inputStream) {
            return (GetSettingsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetSettingsRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GetSettingsRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof GetSettingsRequest) {
                return getUnknownFields().equals(((GetSettingsRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GetSettingsRequest> getParserForType() {
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
            return GDIRadarProto.internal_static_GDI_Proto_Radar_GetSettingsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetSettingsRequest.class, Builder.class);
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
            return new GetSettingsRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetSettingsRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRadarProto.internal_static_GDI_Proto_Radar_GetSettingsRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetSettingsRequest build() {
                GetSettingsRequest getSettingsRequestBuildPartial = buildPartial();
                if (getSettingsRequestBuildPartial.isInitialized()) {
                    return getSettingsRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) getSettingsRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetSettingsRequest buildPartial() {
                GetSettingsRequest getSettingsRequest = new GetSettingsRequest(this);
                onBuilt();
                return getSettingsRequest;
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
                return GDIRadarProto.internal_static_GDI_Proto_Radar_GetSettingsRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRadarProto.internal_static_GDI_Proto_Radar_GetSettingsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetSettingsRequest.class, Builder.class);
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
            public GetSettingsRequest getDefaultInstanceForType() {
                return GetSettingsRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GetSettingsRequest) {
                    return mergeFrom((GetSettingsRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GetSettingsRequest getSettingsRequest) {
                if (getSettingsRequest == GetSettingsRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(getSettingsRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GetSettingsRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ GetSettingsRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private GetSettingsRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetSettingsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetSettingsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetSettingsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GetSettingsRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetSettingsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GetSettingsRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GetSettingsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GetSettingsRequest parseFrom(InputStream inputStream) {
            return (GetSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GetSettingsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetSettingsRequest parseFrom(CodedInputStream codedInputStream) {
            return (GetSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GetSettingsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class LimpModeControl extends GeneratedMessageV3 implements LimpModeControlOrBuilder {
        public static final int FORCE_ENABLE_FIELD_NUMBER = 1;
        public static final int SPEED_THRESHOLD_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean forceEnable_;
        private byte memoizedIsInitialized;
        private float speedThreshold_;
        private static final LimpModeControl DEFAULT_INSTANCE = new LimpModeControl();

        @Deprecated
        public static final Parser<LimpModeControl> PARSER = new AbstractParser<LimpModeControl>() { // from class: com.garmin.proto.generated.GDIRadarProto.LimpModeControl.1
            @Override // com.google.protobuf.Parser
            public LimpModeControl parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LimpModeControl.newBuilder();
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

        private LimpModeControl(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.forceEnable_ = false;
            this.speedThreshold_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LimpModeControl getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRadarProto.internal_static_GDI_Proto_Radar_LimpModeControl_descriptor;
        }

        public static Builder newBuilder(LimpModeControl limpModeControl) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(limpModeControl);
        }

        public static LimpModeControl parseDelimitedFrom(InputStream inputStream) {
            return (LimpModeControl) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LimpModeControl parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LimpModeControl> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LimpModeControl)) {
                return super.equals(obj);
            }
            LimpModeControl limpModeControl = (LimpModeControl) obj;
            if (hasForceEnable() != limpModeControl.hasForceEnable()) {
                return false;
            }
            if ((!hasForceEnable() || getForceEnable() == limpModeControl.getForceEnable()) && hasSpeedThreshold() == limpModeControl.hasSpeedThreshold()) {
                return (!hasSpeedThreshold() || Float.floatToIntBits(getSpeedThreshold()) == Float.floatToIntBits(limpModeControl.getSpeedThreshold())) && getUnknownFields().equals(limpModeControl.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.LimpModeControlOrBuilder
        public boolean getForceEnable() {
            return this.forceEnable_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LimpModeControl> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.forceEnable_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeFloatSize(2, this.speedThreshold_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBoolSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.LimpModeControlOrBuilder
        public float getSpeedThreshold() {
            return this.speedThreshold_;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.LimpModeControlOrBuilder
        public boolean hasForceEnable() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.LimpModeControlOrBuilder
        public boolean hasSpeedThreshold() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasForceEnable()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getForceEnable());
            }
            if (hasSpeedThreshold()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Float.floatToIntBits(getSpeedThreshold());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRadarProto.internal_static_GDI_Proto_Radar_LimpModeControl_fieldAccessorTable.ensureFieldAccessorsInitialized(LimpModeControl.class, Builder.class);
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
            return new LimpModeControl();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.forceEnable_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeFloat(2, this.speedThreshold_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LimpModeControlOrBuilder {
            private int bitField0_;
            private boolean forceEnable_;
            private float speedThreshold_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(LimpModeControl limpModeControl) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    limpModeControl.forceEnable_ = this.forceEnable_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    limpModeControl.speedThreshold_ = this.speedThreshold_;
                    i14 |= 2;
                }
                limpModeControl.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRadarProto.internal_static_GDI_Proto_Radar_LimpModeControl_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LimpModeControl build() {
                LimpModeControl limpModeControlBuildPartial = buildPartial();
                if (limpModeControlBuildPartial.isInitialized()) {
                    return limpModeControlBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) limpModeControlBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LimpModeControl buildPartial() {
                LimpModeControl limpModeControl = new LimpModeControl(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(limpModeControl);
                }
                onBuilt();
                return limpModeControl;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.forceEnable_ = false;
                this.speedThreshold_ = 0.0f;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearForceEnable() {
                this.bitField0_ &= -2;
                this.forceEnable_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSpeedThreshold() {
                this.bitField0_ &= -3;
                this.speedThreshold_ = 0.0f;
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
                return GDIRadarProto.internal_static_GDI_Proto_Radar_LimpModeControl_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.LimpModeControlOrBuilder
            public boolean getForceEnable() {
                return this.forceEnable_;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.LimpModeControlOrBuilder
            public float getSpeedThreshold() {
                return this.speedThreshold_;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.LimpModeControlOrBuilder
            public boolean hasForceEnable() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.LimpModeControlOrBuilder
            public boolean hasSpeedThreshold() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRadarProto.internal_static_GDI_Proto_Radar_LimpModeControl_fieldAccessorTable.ensureFieldAccessorsInitialized(LimpModeControl.class, Builder.class);
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
                                    this.forceEnable_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag == 21) {
                                    this.speedThreshold_ = codedInputStream.readFloat();
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

            public Builder setForceEnable(boolean z14) {
                this.forceEnable_ = z14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSpeedThreshold(float f14) {
                this.speedThreshold_ = f14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
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
            public LimpModeControl getDefaultInstanceForType() {
                return LimpModeControl.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LimpModeControl) {
                    return mergeFrom((LimpModeControl) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LimpModeControl limpModeControl) {
                if (limpModeControl == LimpModeControl.getDefaultInstance()) {
                    return this;
                }
                if (limpModeControl.hasForceEnable()) {
                    setForceEnable(limpModeControl.getForceEnable());
                }
                if (limpModeControl.hasSpeedThreshold()) {
                    setSpeedThreshold(limpModeControl.getSpeedThreshold());
                }
                mergeUnknownFields(limpModeControl.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LimpModeControl getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static LimpModeControl parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LimpModeControl) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LimpModeControl parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LimpModeControl parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LimpModeControl parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LimpModeControl parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ LimpModeControl(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static LimpModeControl parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private LimpModeControl() {
            this.forceEnable_ = false;
            this.speedThreshold_ = 0.0f;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LimpModeControl parseFrom(InputStream inputStream) {
            return (LimpModeControl) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LimpModeControl parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LimpModeControl) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LimpModeControl parseFrom(CodedInputStream codedInputStream) {
            return (LimpModeControl) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LimpModeControl parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LimpModeControl) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class RestoreDefaultsRequest extends GeneratedMessageV3 implements RestoreDefaultsRequestOrBuilder {
        private static final RestoreDefaultsRequest DEFAULT_INSTANCE = new RestoreDefaultsRequest();

        @Deprecated
        public static final Parser<RestoreDefaultsRequest> PARSER = new AbstractParser<RestoreDefaultsRequest>() { // from class: com.garmin.proto.generated.GDIRadarProto.RestoreDefaultsRequest.1
            @Override // com.google.protobuf.Parser
            public RestoreDefaultsRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = RestoreDefaultsRequest.newBuilder();
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

        private RestoreDefaultsRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static RestoreDefaultsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRadarProto.internal_static_GDI_Proto_Radar_RestoreDefaultsRequest_descriptor;
        }

        public static Builder newBuilder(RestoreDefaultsRequest restoreDefaultsRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(restoreDefaultsRequest);
        }

        public static RestoreDefaultsRequest parseDelimitedFrom(InputStream inputStream) {
            return (RestoreDefaultsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static RestoreDefaultsRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<RestoreDefaultsRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof RestoreDefaultsRequest) {
                return getUnknownFields().equals(((RestoreDefaultsRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<RestoreDefaultsRequest> getParserForType() {
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
            return GDIRadarProto.internal_static_GDI_Proto_Radar_RestoreDefaultsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(RestoreDefaultsRequest.class, Builder.class);
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
            return new RestoreDefaultsRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RestoreDefaultsRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRadarProto.internal_static_GDI_Proto_Radar_RestoreDefaultsRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RestoreDefaultsRequest build() {
                RestoreDefaultsRequest restoreDefaultsRequestBuildPartial = buildPartial();
                if (restoreDefaultsRequestBuildPartial.isInitialized()) {
                    return restoreDefaultsRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) restoreDefaultsRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RestoreDefaultsRequest buildPartial() {
                RestoreDefaultsRequest restoreDefaultsRequest = new RestoreDefaultsRequest(this);
                onBuilt();
                return restoreDefaultsRequest;
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
                return GDIRadarProto.internal_static_GDI_Proto_Radar_RestoreDefaultsRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRadarProto.internal_static_GDI_Proto_Radar_RestoreDefaultsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(RestoreDefaultsRequest.class, Builder.class);
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
            public RestoreDefaultsRequest getDefaultInstanceForType() {
                return RestoreDefaultsRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof RestoreDefaultsRequest) {
                    return mergeFrom((RestoreDefaultsRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(RestoreDefaultsRequest restoreDefaultsRequest) {
                if (restoreDefaultsRequest == RestoreDefaultsRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(restoreDefaultsRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public RestoreDefaultsRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ RestoreDefaultsRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private RestoreDefaultsRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static RestoreDefaultsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RestoreDefaultsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RestoreDefaultsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static RestoreDefaultsRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static RestoreDefaultsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static RestoreDefaultsRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static RestoreDefaultsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static RestoreDefaultsRequest parseFrom(InputStream inputStream) {
            return (RestoreDefaultsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static RestoreDefaultsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RestoreDefaultsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RestoreDefaultsRequest parseFrom(CodedInputStream codedInputStream) {
            return (RestoreDefaultsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static RestoreDefaultsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RestoreDefaultsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class AlertSettings extends GeneratedMessageV3 implements AlertSettingsOrBuilder {
        public static final int ENABLE_AUDIO_ALERTS_FIELD_NUMBER = 3;
        public static final int ENABLE_REAR_LIGHTS_FIELD_NUMBER = 2;
        public static final int SENSITIVITY_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean enableAudioAlerts_;
        private boolean enableRearLights_;
        private byte memoizedIsInitialized;
        private int sensitivity_;
        private static final AlertSettings DEFAULT_INSTANCE = new AlertSettings();

        @Deprecated
        public static final Parser<AlertSettings> PARSER = new AbstractParser<AlertSettings>() { // from class: com.garmin.proto.generated.GDIRadarProto.AlertSettings.1
            @Override // com.google.protobuf.Parser
            public AlertSettings parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AlertSettings.newBuilder();
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

        private AlertSettings(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.sensitivity_ = 0;
            this.enableRearLights_ = false;
            this.enableAudioAlerts_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AlertSettings getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRadarProto.internal_static_GDI_Proto_Radar_AlertSettings_descriptor;
        }

        public static Builder newBuilder(AlertSettings alertSettings) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(alertSettings);
        }

        public static AlertSettings parseDelimitedFrom(InputStream inputStream) {
            return (AlertSettings) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AlertSettings parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AlertSettings> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AlertSettings)) {
                return super.equals(obj);
            }
            AlertSettings alertSettings = (AlertSettings) obj;
            if (hasSensitivity() != alertSettings.hasSensitivity()) {
                return false;
            }
            if ((hasSensitivity() && this.sensitivity_ != alertSettings.sensitivity_) || hasEnableRearLights() != alertSettings.hasEnableRearLights()) {
                return false;
            }
            if ((!hasEnableRearLights() || getEnableRearLights() == alertSettings.getEnableRearLights()) && hasEnableAudioAlerts() == alertSettings.hasEnableAudioAlerts()) {
                return (!hasEnableAudioAlerts() || getEnableAudioAlerts() == alertSettings.getEnableAudioAlerts()) && getUnknownFields().equals(alertSettings.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.AlertSettingsOrBuilder
        public boolean getEnableAudioAlerts() {
            return this.enableAudioAlerts_;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.AlertSettingsOrBuilder
        public boolean getEnableRearLights() {
            return this.enableRearLights_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AlertSettings> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.AlertSettingsOrBuilder
        public Sensitivity getSensitivity() {
            Sensitivity sensitivityForNumber = Sensitivity.forNumber(this.sensitivity_);
            return sensitivityForNumber == null ? Sensitivity.OFF : sensitivityForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.sensitivity_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeBoolSize(2, this.enableRearLights_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeBoolSize(3, this.enableAudioAlerts_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.AlertSettingsOrBuilder
        public boolean hasEnableAudioAlerts() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.AlertSettingsOrBuilder
        public boolean hasEnableRearLights() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.AlertSettingsOrBuilder
        public boolean hasSensitivity() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSensitivity()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.sensitivity_;
            }
            if (hasEnableRearLights()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getEnableRearLights());
            }
            if (hasEnableAudioAlerts()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashBoolean(getEnableAudioAlerts());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRadarProto.internal_static_GDI_Proto_Radar_AlertSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(AlertSettings.class, Builder.class);
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
            return new AlertSettings();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.sensitivity_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.enableRearLights_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(3, this.enableAudioAlerts_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AlertSettingsOrBuilder {
            private int bitField0_;
            private boolean enableAudioAlerts_;
            private boolean enableRearLights_;
            private int sensitivity_;

            private Builder() {
                this.sensitivity_ = 0;
            }

            private void buildPartial0(AlertSettings alertSettings) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    alertSettings.sensitivity_ = this.sensitivity_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    alertSettings.enableRearLights_ = this.enableRearLights_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    alertSettings.enableAudioAlerts_ = this.enableAudioAlerts_;
                    i14 |= 4;
                }
                alertSettings.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRadarProto.internal_static_GDI_Proto_Radar_AlertSettings_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlertSettings build() {
                AlertSettings alertSettingsBuildPartial = buildPartial();
                if (alertSettingsBuildPartial.isInitialized()) {
                    return alertSettingsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) alertSettingsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AlertSettings buildPartial() {
                AlertSettings alertSettings = new AlertSettings(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(alertSettings);
                }
                onBuilt();
                return alertSettings;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.sensitivity_ = 0;
                this.enableRearLights_ = false;
                this.enableAudioAlerts_ = false;
                return this;
            }

            public Builder clearEnableAudioAlerts() {
                this.bitField0_ &= -5;
                this.enableAudioAlerts_ = false;
                onChanged();
                return this;
            }

            public Builder clearEnableRearLights() {
                this.bitField0_ &= -3;
                this.enableRearLights_ = false;
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

            public Builder clearSensitivity() {
                this.bitField0_ &= -2;
                this.sensitivity_ = 0;
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
                return GDIRadarProto.internal_static_GDI_Proto_Radar_AlertSettings_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.AlertSettingsOrBuilder
            public boolean getEnableAudioAlerts() {
                return this.enableAudioAlerts_;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.AlertSettingsOrBuilder
            public boolean getEnableRearLights() {
                return this.enableRearLights_;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.AlertSettingsOrBuilder
            public Sensitivity getSensitivity() {
                Sensitivity sensitivityForNumber = Sensitivity.forNumber(this.sensitivity_);
                return sensitivityForNumber == null ? Sensitivity.OFF : sensitivityForNumber;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.AlertSettingsOrBuilder
            public boolean hasEnableAudioAlerts() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.AlertSettingsOrBuilder
            public boolean hasEnableRearLights() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.AlertSettingsOrBuilder
            public boolean hasSensitivity() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRadarProto.internal_static_GDI_Proto_Radar_AlertSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(AlertSettings.class, Builder.class);
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
                                    if (Sensitivity.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.sensitivity_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    this.enableRearLights_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.enableAudioAlerts_ = codedInputStream.readBool();
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

            public Builder setEnableAudioAlerts(boolean z14) {
                this.enableAudioAlerts_ = z14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setEnableRearLights(boolean z14) {
                this.enableRearLights_ = z14;
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

            public Builder setSensitivity(Sensitivity sensitivity) {
                sensitivity.getClass();
                this.bitField0_ |= 1;
                this.sensitivity_ = sensitivity.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AlertSettings getDefaultInstanceForType() {
                return AlertSettings.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.sensitivity_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AlertSettings) {
                    return mergeFrom((AlertSettings) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AlertSettings alertSettings) {
                if (alertSettings == AlertSettings.getDefaultInstance()) {
                    return this;
                }
                if (alertSettings.hasSensitivity()) {
                    setSensitivity(alertSettings.getSensitivity());
                }
                if (alertSettings.hasEnableRearLights()) {
                    setEnableRearLights(alertSettings.getEnableRearLights());
                }
                if (alertSettings.hasEnableAudioAlerts()) {
                    setEnableAudioAlerts(alertSettings.getEnableAudioAlerts());
                }
                mergeUnknownFields(alertSettings.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AlertSettings getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static AlertSettings parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlertSettings) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlertSettings parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AlertSettings parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AlertSettings parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AlertSettings parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AlertSettings parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ AlertSettings(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static AlertSettings parseFrom(InputStream inputStream) {
            return (AlertSettings) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private AlertSettings() {
            this.enableRearLights_ = false;
            this.enableAudioAlerts_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.sensitivity_ = 0;
        }

        public static AlertSettings parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlertSettings) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AlertSettings parseFrom(CodedInputStream codedInputStream) {
            return (AlertSettings) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AlertSettings parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AlertSettings) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Sensitivity implements ProtocolMessageEnum {
            OFF(0),
            LOW(1),
            NORMAL(2),
            HIGH(3);

            public static final int HIGH_VALUE = 3;
            public static final int LOW_VALUE = 1;
            public static final int NORMAL_VALUE = 2;
            public static final int OFF_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Sensitivity> internalValueMap = new Internal.EnumLiteMap<Sensitivity>() { // from class: com.garmin.proto.generated.GDIRadarProto.AlertSettings.Sensitivity.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Sensitivity findValueByNumber(int i14) {
                    return Sensitivity.forNumber(i14);
                }
            };
            private static final Sensitivity[] VALUES = values();

            Sensitivity(int i14) {
                this.value = i14;
            }

            public static Sensitivity forNumber(int i14) {
                if (i14 == 0) {
                    return OFF;
                }
                if (i14 == 1) {
                    return LOW;
                }
                if (i14 == 2) {
                    return NORMAL;
                }
                if (i14 != 3) {
                    return null;
                }
                return HIGH;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return AlertSettings.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Sensitivity> internalGetValueMap() {
                return internalValueMap;
            }

            public static Sensitivity valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Sensitivity valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class ChangeSettingsRequest extends GeneratedMessageV3 implements ChangeSettingsRequestOrBuilder {
        private static final ChangeSettingsRequest DEFAULT_INSTANCE = new ChangeSettingsRequest();

        @Deprecated
        public static final Parser<ChangeSettingsRequest> PARSER = new AbstractParser<ChangeSettingsRequest>() { // from class: com.garmin.proto.generated.GDIRadarProto.ChangeSettingsRequest.1
            @Override // com.google.protobuf.Parser
            public ChangeSettingsRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ChangeSettingsRequest.newBuilder();
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
        public static final int SETTINGS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private Settings settings_;

        private ChangeSettingsRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ChangeSettingsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRadarProto.internal_static_GDI_Proto_Radar_ChangeSettingsRequest_descriptor;
        }

        public static Builder newBuilder(ChangeSettingsRequest changeSettingsRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(changeSettingsRequest);
        }

        public static ChangeSettingsRequest parseDelimitedFrom(InputStream inputStream) {
            return (ChangeSettingsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ChangeSettingsRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ChangeSettingsRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ChangeSettingsRequest)) {
                return super.equals(obj);
            }
            ChangeSettingsRequest changeSettingsRequest = (ChangeSettingsRequest) obj;
            if (hasSettings() != changeSettingsRequest.hasSettings()) {
                return false;
            }
            return (!hasSettings() || getSettings().equals(changeSettingsRequest.getSettings())) && getUnknownFields().equals(changeSettingsRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ChangeSettingsRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getSettings()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.ChangeSettingsRequestOrBuilder
        public Settings getSettings() {
            Settings settings = this.settings_;
            return settings == null ? Settings.getDefaultInstance() : settings;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.ChangeSettingsRequestOrBuilder
        public SettingsOrBuilder getSettingsOrBuilder() {
            Settings settings = this.settings_;
            return settings == null ? Settings.getDefaultInstance() : settings;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.ChangeSettingsRequestOrBuilder
        public boolean hasSettings() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSettings()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSettings().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRadarProto.internal_static_GDI_Proto_Radar_ChangeSettingsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ChangeSettingsRequest.class, Builder.class);
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
            return new ChangeSettingsRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getSettings());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ChangeSettingsRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<Settings, Settings.Builder, SettingsOrBuilder> settingsBuilder_;
            private Settings settings_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ChangeSettingsRequest changeSettingsRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<Settings, Settings.Builder, SettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                    changeSettingsRequest.settings_ = singleFieldBuilderV3 == null ? this.settings_ : (Settings) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                changeSettingsRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRadarProto.internal_static_GDI_Proto_Radar_ChangeSettingsRequest_descriptor;
            }

            private SingleFieldBuilderV3<Settings, Settings.Builder, SettingsOrBuilder> getSettingsFieldBuilder() {
                if (this.settingsBuilder_ == null) {
                    this.settingsBuilder_ = new SingleFieldBuilderV3<>(getSettings(), getParentForChildren(), isClean());
                    this.settings_ = null;
                }
                return this.settingsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSettingsFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ChangeSettingsRequest build() {
                ChangeSettingsRequest changeSettingsRequestBuildPartial = buildPartial();
                if (changeSettingsRequestBuildPartial.isInitialized()) {
                    return changeSettingsRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) changeSettingsRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ChangeSettingsRequest buildPartial() {
                ChangeSettingsRequest changeSettingsRequest = new ChangeSettingsRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(changeSettingsRequest);
                }
                onBuilt();
                return changeSettingsRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.settings_ = null;
                SingleFieldBuilderV3<Settings, Settings.Builder, SettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.settingsBuilder_ = null;
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

            public Builder clearSettings() {
                this.bitField0_ &= -2;
                this.settings_ = null;
                SingleFieldBuilderV3<Settings, Settings.Builder, SettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.settingsBuilder_ = null;
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
                return GDIRadarProto.internal_static_GDI_Proto_Radar_ChangeSettingsRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.ChangeSettingsRequestOrBuilder
            public Settings getSettings() {
                SingleFieldBuilderV3<Settings, Settings.Builder, SettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Settings) singleFieldBuilderV3.getMessage();
                }
                Settings settings = this.settings_;
                return settings == null ? Settings.getDefaultInstance() : settings;
            }

            public Settings.Builder getSettingsBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (Settings.Builder) getSettingsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.ChangeSettingsRequestOrBuilder
            public SettingsOrBuilder getSettingsOrBuilder() {
                SingleFieldBuilderV3<Settings, Settings.Builder, SettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SettingsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Settings settings = this.settings_;
                return settings == null ? Settings.getDefaultInstance() : settings;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.ChangeSettingsRequestOrBuilder
            public boolean hasSettings() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRadarProto.internal_static_GDI_Proto_Radar_ChangeSettingsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ChangeSettingsRequest.class, Builder.class);
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
                                    codedInputStream.readMessage(getSettingsFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeSettings(Settings settings) {
                Settings settings2;
                SingleFieldBuilderV3<Settings, Settings.Builder, SettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(settings);
                } else if ((this.bitField0_ & 1) == 0 || (settings2 = this.settings_) == null || settings2 == Settings.getDefaultInstance()) {
                    this.settings_ = settings;
                } else {
                    getSettingsBuilder().mergeFrom(settings);
                }
                if (this.settings_ != null) {
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSettings(Settings.Builder builder) {
                SingleFieldBuilderV3<Settings, Settings.Builder, SettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.settings_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ChangeSettingsRequest getDefaultInstanceForType() {
                return ChangeSettingsRequest.getDefaultInstance();
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

            public Builder setSettings(Settings settings) {
                SingleFieldBuilderV3<Settings, Settings.Builder, SettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    settings.getClass();
                    this.settings_ = settings;
                } else {
                    singleFieldBuilderV3.setMessage(settings);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ChangeSettingsRequest) {
                    return mergeFrom((ChangeSettingsRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ChangeSettingsRequest changeSettingsRequest) {
                if (changeSettingsRequest == ChangeSettingsRequest.getDefaultInstance()) {
                    return this;
                }
                if (changeSettingsRequest.hasSettings()) {
                    mergeSettings(changeSettingsRequest.getSettings());
                }
                mergeUnknownFields(changeSettingsRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ChangeSettingsRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ ChangeSettingsRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private ChangeSettingsRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ChangeSettingsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChangeSettingsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ChangeSettingsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ChangeSettingsRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ChangeSettingsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ChangeSettingsRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ChangeSettingsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ChangeSettingsRequest parseFrom(InputStream inputStream) {
            return (ChangeSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ChangeSettingsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChangeSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ChangeSettingsRequest parseFrom(CodedInputStream codedInputStream) {
            return (ChangeSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ChangeSettingsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChangeSettingsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ChangeSettingsResponse extends GeneratedMessageV3 implements ChangeSettingsResponseOrBuilder {
        private static final ChangeSettingsResponse DEFAULT_INSTANCE = new ChangeSettingsResponse();

        @Deprecated
        public static final Parser<ChangeSettingsResponse> PARSER = new AbstractParser<ChangeSettingsResponse>() { // from class: com.garmin.proto.generated.GDIRadarProto.ChangeSettingsResponse.1
            @Override // com.google.protobuf.Parser
            public ChangeSettingsResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ChangeSettingsResponse.newBuilder();
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

        private ChangeSettingsResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ChangeSettingsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRadarProto.internal_static_GDI_Proto_Radar_ChangeSettingsResponse_descriptor;
        }

        public static Builder newBuilder(ChangeSettingsResponse changeSettingsResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(changeSettingsResponse);
        }

        public static ChangeSettingsResponse parseDelimitedFrom(InputStream inputStream) {
            return (ChangeSettingsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ChangeSettingsResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ChangeSettingsResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ChangeSettingsResponse)) {
                return super.equals(obj);
            }
            ChangeSettingsResponse changeSettingsResponse = (ChangeSettingsResponse) obj;
            if (hasStatus() != changeSettingsResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == changeSettingsResponse.status_) && getUnknownFields().equals(changeSettingsResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ChangeSettingsResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIRadarProto.ChangeSettingsResponseOrBuilder
        public ChangeSettingsStatus getStatus() {
            ChangeSettingsStatus changeSettingsStatusForNumber = ChangeSettingsStatus.forNumber(this.status_);
            return changeSettingsStatusForNumber == null ? ChangeSettingsStatus.SUCCESS : changeSettingsStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.ChangeSettingsResponseOrBuilder
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
            return GDIRadarProto.internal_static_GDI_Proto_Radar_ChangeSettingsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ChangeSettingsResponse.class, Builder.class);
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
            return new ChangeSettingsResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ChangeSettingsResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(ChangeSettingsResponse changeSettingsResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    changeSettingsResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                changeSettingsResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRadarProto.internal_static_GDI_Proto_Radar_ChangeSettingsResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ChangeSettingsResponse build() {
                ChangeSettingsResponse changeSettingsResponseBuildPartial = buildPartial();
                if (changeSettingsResponseBuildPartial.isInitialized()) {
                    return changeSettingsResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) changeSettingsResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ChangeSettingsResponse buildPartial() {
                ChangeSettingsResponse changeSettingsResponse = new ChangeSettingsResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(changeSettingsResponse);
                }
                onBuilt();
                return changeSettingsResponse;
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
                return GDIRadarProto.internal_static_GDI_Proto_Radar_ChangeSettingsResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.ChangeSettingsResponseOrBuilder
            public ChangeSettingsStatus getStatus() {
                ChangeSettingsStatus changeSettingsStatusForNumber = ChangeSettingsStatus.forNumber(this.status_);
                return changeSettingsStatusForNumber == null ? ChangeSettingsStatus.SUCCESS : changeSettingsStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.ChangeSettingsResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRadarProto.internal_static_GDI_Proto_Radar_ChangeSettingsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ChangeSettingsResponse.class, Builder.class);
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
                                    if (ChangeSettingsStatus.forNumber(i14) == null) {
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

            public Builder setStatus(ChangeSettingsStatus changeSettingsStatus) {
                changeSettingsStatus.getClass();
                this.bitField0_ |= 1;
                this.status_ = changeSettingsStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ChangeSettingsResponse getDefaultInstanceForType() {
                return ChangeSettingsResponse.getDefaultInstance();
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
                if (message instanceof ChangeSettingsResponse) {
                    return mergeFrom((ChangeSettingsResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ChangeSettingsResponse changeSettingsResponse) {
                if (changeSettingsResponse == ChangeSettingsResponse.getDefaultInstance()) {
                    return this;
                }
                if (changeSettingsResponse.hasStatus()) {
                    setStatus(changeSettingsResponse.getStatus());
                }
                mergeUnknownFields(changeSettingsResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ChangeSettingsResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ChangeSettingsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChangeSettingsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ChangeSettingsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ChangeSettingsResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ChangeSettingsResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ChangeSettingsResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ChangeSettingsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ChangeSettingsResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ChangeSettingsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ChangeSettingsResponse parseFrom(InputStream inputStream) {
            return (ChangeSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ChangeSettingsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChangeSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ChangeSettingsResponse parseFrom(CodedInputStream codedInputStream) {
            return (ChangeSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ChangeSettingsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ChangeSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ChangeSettingsStatus implements ProtocolMessageEnum {
            SUCCESS(0),
            UNKNOWN_ERROR(1);

            public static final int SUCCESS_VALUE = 0;
            public static final int UNKNOWN_ERROR_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<ChangeSettingsStatus> internalValueMap = new Internal.EnumLiteMap<ChangeSettingsStatus>() { // from class: com.garmin.proto.generated.GDIRadarProto.ChangeSettingsResponse.ChangeSettingsStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ChangeSettingsStatus findValueByNumber(int i14) {
                    return ChangeSettingsStatus.forNumber(i14);
                }
            };
            private static final ChangeSettingsStatus[] VALUES = values();

            ChangeSettingsStatus(int i14) {
                this.value = i14;
            }

            public static ChangeSettingsStatus forNumber(int i14) {
                if (i14 == 0) {
                    return SUCCESS;
                }
                if (i14 != 1) {
                    return null;
                }
                return UNKNOWN_ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ChangeSettingsResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<ChangeSettingsStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static ChangeSettingsStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static ChangeSettingsStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class GetSettingsResponse extends GeneratedMessageV3 implements GetSettingsResponseOrBuilder {
        public static final int LIGHT_LEVEL_FIELD_NUMBER = 2;
        public static final int SETTINGS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int lightLevel_;
        private byte memoizedIsInitialized;
        private Settings settings_;
        private static final GetSettingsResponse DEFAULT_INSTANCE = new GetSettingsResponse();

        @Deprecated
        public static final Parser<GetSettingsResponse> PARSER = new AbstractParser<GetSettingsResponse>() { // from class: com.garmin.proto.generated.GDIRadarProto.GetSettingsResponse.1
            @Override // com.google.protobuf.Parser
            public GetSettingsResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GetSettingsResponse.newBuilder();
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

        private GetSettingsResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.lightLevel_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetSettingsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRadarProto.internal_static_GDI_Proto_Radar_GetSettingsResponse_descriptor;
        }

        public static Builder newBuilder(GetSettingsResponse getSettingsResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getSettingsResponse);
        }

        public static GetSettingsResponse parseDelimitedFrom(InputStream inputStream) {
            return (GetSettingsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetSettingsResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GetSettingsResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetSettingsResponse)) {
                return super.equals(obj);
            }
            GetSettingsResponse getSettingsResponse = (GetSettingsResponse) obj;
            if (hasSettings() != getSettingsResponse.hasSettings()) {
                return false;
            }
            if ((!hasSettings() || getSettings().equals(getSettingsResponse.getSettings())) && hasLightLevel() == getSettingsResponse.hasLightLevel()) {
                return (!hasLightLevel() || this.lightLevel_ == getSettingsResponse.lightLevel_) && getUnknownFields().equals(getSettingsResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.GetSettingsResponseOrBuilder
        public LightLevel getLightLevel() {
            LightLevel lightLevelForNumber = LightLevel.forNumber(this.lightLevel_);
            return lightLevelForNumber == null ? LightLevel.DAY : lightLevelForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GetSettingsResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getSettings()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(2, this.lightLevel_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.GetSettingsResponseOrBuilder
        public Settings getSettings() {
            Settings settings = this.settings_;
            return settings == null ? Settings.getDefaultInstance() : settings;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.GetSettingsResponseOrBuilder
        public SettingsOrBuilder getSettingsOrBuilder() {
            Settings settings = this.settings_;
            return settings == null ? Settings.getDefaultInstance() : settings;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.GetSettingsResponseOrBuilder
        public boolean hasLightLevel() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.GetSettingsResponseOrBuilder
        public boolean hasSettings() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSettings()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSettings().hashCode();
            }
            if (hasLightLevel()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.lightLevel_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRadarProto.internal_static_GDI_Proto_Radar_GetSettingsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetSettingsResponse.class, Builder.class);
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
            return new GetSettingsResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getSettings());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.lightLevel_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetSettingsResponseOrBuilder {
            private int bitField0_;
            private int lightLevel_;
            private SingleFieldBuilderV3<Settings, Settings.Builder, SettingsOrBuilder> settingsBuilder_;
            private Settings settings_;

            private Builder() {
                this.lightLevel_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(GetSettingsResponse getSettingsResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<Settings, Settings.Builder, SettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                    getSettingsResponse.settings_ = singleFieldBuilderV3 == null ? this.settings_ : (Settings) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    getSettingsResponse.lightLevel_ = this.lightLevel_;
                    i14 |= 2;
                }
                getSettingsResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRadarProto.internal_static_GDI_Proto_Radar_GetSettingsResponse_descriptor;
            }

            private SingleFieldBuilderV3<Settings, Settings.Builder, SettingsOrBuilder> getSettingsFieldBuilder() {
                if (this.settingsBuilder_ == null) {
                    this.settingsBuilder_ = new SingleFieldBuilderV3<>(getSettings(), getParentForChildren(), isClean());
                    this.settings_ = null;
                }
                return this.settingsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSettingsFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetSettingsResponse build() {
                GetSettingsResponse getSettingsResponseBuildPartial = buildPartial();
                if (getSettingsResponseBuildPartial.isInitialized()) {
                    return getSettingsResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) getSettingsResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetSettingsResponse buildPartial() {
                GetSettingsResponse getSettingsResponse = new GetSettingsResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(getSettingsResponse);
                }
                onBuilt();
                return getSettingsResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.settings_ = null;
                SingleFieldBuilderV3<Settings, Settings.Builder, SettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.settingsBuilder_ = null;
                }
                this.lightLevel_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLightLevel() {
                this.bitField0_ &= -3;
                this.lightLevel_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSettings() {
                this.bitField0_ &= -2;
                this.settings_ = null;
                SingleFieldBuilderV3<Settings, Settings.Builder, SettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.settingsBuilder_ = null;
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
                return GDIRadarProto.internal_static_GDI_Proto_Radar_GetSettingsResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.GetSettingsResponseOrBuilder
            public LightLevel getLightLevel() {
                LightLevel lightLevelForNumber = LightLevel.forNumber(this.lightLevel_);
                return lightLevelForNumber == null ? LightLevel.DAY : lightLevelForNumber;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.GetSettingsResponseOrBuilder
            public Settings getSettings() {
                SingleFieldBuilderV3<Settings, Settings.Builder, SettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Settings) singleFieldBuilderV3.getMessage();
                }
                Settings settings = this.settings_;
                return settings == null ? Settings.getDefaultInstance() : settings;
            }

            public Settings.Builder getSettingsBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (Settings.Builder) getSettingsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.GetSettingsResponseOrBuilder
            public SettingsOrBuilder getSettingsOrBuilder() {
                SingleFieldBuilderV3<Settings, Settings.Builder, SettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SettingsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Settings settings = this.settings_;
                return settings == null ? Settings.getDefaultInstance() : settings;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.GetSettingsResponseOrBuilder
            public boolean hasLightLevel() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.GetSettingsResponseOrBuilder
            public boolean hasSettings() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRadarProto.internal_static_GDI_Proto_Radar_GetSettingsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetSettingsResponse.class, Builder.class);
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
                                    codedInputStream.readMessage(getSettingsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (LightLevel.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.lightLevel_ = i14;
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

            public Builder mergeSettings(Settings settings) {
                Settings settings2;
                SingleFieldBuilderV3<Settings, Settings.Builder, SettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(settings);
                } else if ((this.bitField0_ & 1) == 0 || (settings2 = this.settings_) == null || settings2 == Settings.getDefaultInstance()) {
                    this.settings_ = settings;
                } else {
                    getSettingsBuilder().mergeFrom(settings);
                }
                if (this.settings_ != null) {
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

            public Builder setLightLevel(LightLevel lightLevel) {
                lightLevel.getClass();
                this.bitField0_ |= 2;
                this.lightLevel_ = lightLevel.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSettings(Settings.Builder builder) {
                SingleFieldBuilderV3<Settings, Settings.Builder, SettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.settings_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public GetSettingsResponse getDefaultInstanceForType() {
                return GetSettingsResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.lightLevel_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setSettings(Settings settings) {
                SingleFieldBuilderV3<Settings, Settings.Builder, SettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    settings.getClass();
                    this.settings_ = settings;
                } else {
                    singleFieldBuilderV3.setMessage(settings);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GetSettingsResponse) {
                    return mergeFrom((GetSettingsResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GetSettingsResponse getSettingsResponse) {
                if (getSettingsResponse == GetSettingsResponse.getDefaultInstance()) {
                    return this;
                }
                if (getSettingsResponse.hasSettings()) {
                    mergeSettings(getSettingsResponse.getSettings());
                }
                if (getSettingsResponse.hasLightLevel()) {
                    setLightLevel(getSettingsResponse.getLightLevel());
                }
                mergeUnknownFields(getSettingsResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GetSettingsResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static GetSettingsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetSettingsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetSettingsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ GetSettingsResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static GetSettingsResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private GetSettingsResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.lightLevel_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetSettingsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GetSettingsResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GetSettingsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GetSettingsResponse parseFrom(InputStream inputStream) {
            return (GetSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GetSettingsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetSettingsResponse parseFrom(CodedInputStream codedInputStream) {
            return (GetSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GetSettingsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetSettingsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class RestoreDefaultsResponse extends GeneratedMessageV3 implements RestoreDefaultsResponseOrBuilder {
        private static final RestoreDefaultsResponse DEFAULT_INSTANCE = new RestoreDefaultsResponse();

        @Deprecated
        public static final Parser<RestoreDefaultsResponse> PARSER = new AbstractParser<RestoreDefaultsResponse>() { // from class: com.garmin.proto.generated.GDIRadarProto.RestoreDefaultsResponse.1
            @Override // com.google.protobuf.Parser
            public RestoreDefaultsResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = RestoreDefaultsResponse.newBuilder();
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

        private RestoreDefaultsResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static RestoreDefaultsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRadarProto.internal_static_GDI_Proto_Radar_RestoreDefaultsResponse_descriptor;
        }

        public static Builder newBuilder(RestoreDefaultsResponse restoreDefaultsResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(restoreDefaultsResponse);
        }

        public static RestoreDefaultsResponse parseDelimitedFrom(InputStream inputStream) {
            return (RestoreDefaultsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static RestoreDefaultsResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<RestoreDefaultsResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof RestoreDefaultsResponse)) {
                return super.equals(obj);
            }
            RestoreDefaultsResponse restoreDefaultsResponse = (RestoreDefaultsResponse) obj;
            if (hasStatus() != restoreDefaultsResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == restoreDefaultsResponse.status_) && getUnknownFields().equals(restoreDefaultsResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<RestoreDefaultsResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIRadarProto.RestoreDefaultsResponseOrBuilder
        public RestoreDefaultsStatus getStatus() {
            RestoreDefaultsStatus restoreDefaultsStatusForNumber = RestoreDefaultsStatus.forNumber(this.status_);
            return restoreDefaultsStatusForNumber == null ? RestoreDefaultsStatus.SUCCESS : restoreDefaultsStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.RestoreDefaultsResponseOrBuilder
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
            return GDIRadarProto.internal_static_GDI_Proto_Radar_RestoreDefaultsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(RestoreDefaultsResponse.class, Builder.class);
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
            return new RestoreDefaultsResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements RestoreDefaultsResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(RestoreDefaultsResponse restoreDefaultsResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    restoreDefaultsResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                restoreDefaultsResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRadarProto.internal_static_GDI_Proto_Radar_RestoreDefaultsResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RestoreDefaultsResponse build() {
                RestoreDefaultsResponse restoreDefaultsResponseBuildPartial = buildPartial();
                if (restoreDefaultsResponseBuildPartial.isInitialized()) {
                    return restoreDefaultsResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) restoreDefaultsResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public RestoreDefaultsResponse buildPartial() {
                RestoreDefaultsResponse restoreDefaultsResponse = new RestoreDefaultsResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(restoreDefaultsResponse);
                }
                onBuilt();
                return restoreDefaultsResponse;
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
                return GDIRadarProto.internal_static_GDI_Proto_Radar_RestoreDefaultsResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.RestoreDefaultsResponseOrBuilder
            public RestoreDefaultsStatus getStatus() {
                RestoreDefaultsStatus restoreDefaultsStatusForNumber = RestoreDefaultsStatus.forNumber(this.status_);
                return restoreDefaultsStatusForNumber == null ? RestoreDefaultsStatus.SUCCESS : restoreDefaultsStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.RestoreDefaultsResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRadarProto.internal_static_GDI_Proto_Radar_RestoreDefaultsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(RestoreDefaultsResponse.class, Builder.class);
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
                                    if (RestoreDefaultsStatus.forNumber(i14) == null) {
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

            public Builder setStatus(RestoreDefaultsStatus restoreDefaultsStatus) {
                restoreDefaultsStatus.getClass();
                this.bitField0_ |= 1;
                this.status_ = restoreDefaultsStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public RestoreDefaultsResponse getDefaultInstanceForType() {
                return RestoreDefaultsResponse.getDefaultInstance();
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
                if (message instanceof RestoreDefaultsResponse) {
                    return mergeFrom((RestoreDefaultsResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(RestoreDefaultsResponse restoreDefaultsResponse) {
                if (restoreDefaultsResponse == RestoreDefaultsResponse.getDefaultInstance()) {
                    return this;
                }
                if (restoreDefaultsResponse.hasStatus()) {
                    setStatus(restoreDefaultsResponse.getStatus());
                }
                mergeUnknownFields(restoreDefaultsResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public RestoreDefaultsResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static RestoreDefaultsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RestoreDefaultsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RestoreDefaultsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ RestoreDefaultsResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static RestoreDefaultsResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private RestoreDefaultsResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static RestoreDefaultsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static RestoreDefaultsResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static RestoreDefaultsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static RestoreDefaultsResponse parseFrom(InputStream inputStream) {
            return (RestoreDefaultsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static RestoreDefaultsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RestoreDefaultsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static RestoreDefaultsResponse parseFrom(CodedInputStream codedInputStream) {
            return (RestoreDefaultsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static RestoreDefaultsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RestoreDefaultsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum RestoreDefaultsStatus implements ProtocolMessageEnum {
            SUCCESS(0),
            UNKNOWN_ERROR(1);

            public static final int SUCCESS_VALUE = 0;
            public static final int UNKNOWN_ERROR_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<RestoreDefaultsStatus> internalValueMap = new Internal.EnumLiteMap<RestoreDefaultsStatus>() { // from class: com.garmin.proto.generated.GDIRadarProto.RestoreDefaultsResponse.RestoreDefaultsStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public RestoreDefaultsStatus findValueByNumber(int i14) {
                    return RestoreDefaultsStatus.forNumber(i14);
                }
            };
            private static final RestoreDefaultsStatus[] VALUES = values();

            RestoreDefaultsStatus(int i14) {
                this.value = i14;
            }

            public static RestoreDefaultsStatus forNumber(int i14) {
                if (i14 == 0) {
                    return SUCCESS;
                }
                if (i14 != 1) {
                    return null;
                }
                return UNKNOWN_ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return RestoreDefaultsResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<RestoreDefaultsStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static RestoreDefaultsStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static RestoreDefaultsStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        public static final int CHANGE_SETTINGS_REQUEST_FIELD_NUMBER = 3;
        public static final int CHANGE_SETTINGS_RESPONSE_FIELD_NUMBER = 4;
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDIRadarProto.Service.1
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
        public static final int RESTORE_DEFAULTS_REQUEST_FIELD_NUMBER = 7;
        public static final int RESTORE_DEFAULTS_RESPONSE_FIELD_NUMBER = 8;
        public static final int SETTINGS_REQUEST_FIELD_NUMBER = 1;
        public static final int SETTINGS_RESPONSE_FIELD_NUMBER = 2;
        public static final int TEST_MODE_REQUEST_FIELD_NUMBER = 5;
        public static final int TEST_MODE_RESPONSE_FIELD_NUMBER = 6;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ChangeSettingsRequest changeSettingsRequest_;
        private ChangeSettingsResponse changeSettingsResponse_;
        private byte memoizedIsInitialized;
        private RestoreDefaultsRequest restoreDefaultsRequest_;
        private RestoreDefaultsResponse restoreDefaultsResponse_;
        private GetSettingsRequest settingsRequest_;
        private GetSettingsResponse settingsResponse_;
        private TestModeRequest testModeRequest_;
        private TestModeResponse testModeResponse_;

        private Service(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Service getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRadarProto.internal_static_GDI_Proto_Radar_Service_descriptor;
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
            if (hasSettingsRequest() != service.hasSettingsRequest()) {
                return false;
            }
            if ((hasSettingsRequest() && !getSettingsRequest().equals(service.getSettingsRequest())) || hasSettingsResponse() != service.hasSettingsResponse()) {
                return false;
            }
            if ((hasSettingsResponse() && !getSettingsResponse().equals(service.getSettingsResponse())) || hasChangeSettingsRequest() != service.hasChangeSettingsRequest()) {
                return false;
            }
            if ((hasChangeSettingsRequest() && !getChangeSettingsRequest().equals(service.getChangeSettingsRequest())) || hasChangeSettingsResponse() != service.hasChangeSettingsResponse()) {
                return false;
            }
            if ((hasChangeSettingsResponse() && !getChangeSettingsResponse().equals(service.getChangeSettingsResponse())) || hasTestModeRequest() != service.hasTestModeRequest()) {
                return false;
            }
            if ((hasTestModeRequest() && !getTestModeRequest().equals(service.getTestModeRequest())) || hasTestModeResponse() != service.hasTestModeResponse()) {
                return false;
            }
            if ((hasTestModeResponse() && !getTestModeResponse().equals(service.getTestModeResponse())) || hasRestoreDefaultsRequest() != service.hasRestoreDefaultsRequest()) {
                return false;
            }
            if ((!hasRestoreDefaultsRequest() || getRestoreDefaultsRequest().equals(service.getRestoreDefaultsRequest())) && hasRestoreDefaultsResponse() == service.hasRestoreDefaultsResponse()) {
                return (!hasRestoreDefaultsResponse() || getRestoreDefaultsResponse().equals(service.getRestoreDefaultsResponse())) && getUnknownFields().equals(service.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
        public ChangeSettingsRequest getChangeSettingsRequest() {
            ChangeSettingsRequest changeSettingsRequest = this.changeSettingsRequest_;
            return changeSettingsRequest == null ? ChangeSettingsRequest.getDefaultInstance() : changeSettingsRequest;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
        public ChangeSettingsRequestOrBuilder getChangeSettingsRequestOrBuilder() {
            ChangeSettingsRequest changeSettingsRequest = this.changeSettingsRequest_;
            return changeSettingsRequest == null ? ChangeSettingsRequest.getDefaultInstance() : changeSettingsRequest;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
        public ChangeSettingsResponse getChangeSettingsResponse() {
            ChangeSettingsResponse changeSettingsResponse = this.changeSettingsResponse_;
            return changeSettingsResponse == null ? ChangeSettingsResponse.getDefaultInstance() : changeSettingsResponse;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
        public ChangeSettingsResponseOrBuilder getChangeSettingsResponseOrBuilder() {
            ChangeSettingsResponse changeSettingsResponse = this.changeSettingsResponse_;
            return changeSettingsResponse == null ? ChangeSettingsResponse.getDefaultInstance() : changeSettingsResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Service> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
        public RestoreDefaultsRequest getRestoreDefaultsRequest() {
            RestoreDefaultsRequest restoreDefaultsRequest = this.restoreDefaultsRequest_;
            return restoreDefaultsRequest == null ? RestoreDefaultsRequest.getDefaultInstance() : restoreDefaultsRequest;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
        public RestoreDefaultsRequestOrBuilder getRestoreDefaultsRequestOrBuilder() {
            RestoreDefaultsRequest restoreDefaultsRequest = this.restoreDefaultsRequest_;
            return restoreDefaultsRequest == null ? RestoreDefaultsRequest.getDefaultInstance() : restoreDefaultsRequest;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
        public RestoreDefaultsResponse getRestoreDefaultsResponse() {
            RestoreDefaultsResponse restoreDefaultsResponse = this.restoreDefaultsResponse_;
            return restoreDefaultsResponse == null ? RestoreDefaultsResponse.getDefaultInstance() : restoreDefaultsResponse;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
        public RestoreDefaultsResponseOrBuilder getRestoreDefaultsResponseOrBuilder() {
            RestoreDefaultsResponse restoreDefaultsResponse = this.restoreDefaultsResponse_;
            return restoreDefaultsResponse == null ? RestoreDefaultsResponse.getDefaultInstance() : restoreDefaultsResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getSettingsRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getSettingsResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getChangeSettingsRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getChangeSettingsResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getTestModeRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getTestModeResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getRestoreDefaultsRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, getRestoreDefaultsResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
        public GetSettingsRequest getSettingsRequest() {
            GetSettingsRequest getSettingsRequest = this.settingsRequest_;
            return getSettingsRequest == null ? GetSettingsRequest.getDefaultInstance() : getSettingsRequest;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
        public GetSettingsRequestOrBuilder getSettingsRequestOrBuilder() {
            GetSettingsRequest getSettingsRequest = this.settingsRequest_;
            return getSettingsRequest == null ? GetSettingsRequest.getDefaultInstance() : getSettingsRequest;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
        public GetSettingsResponse getSettingsResponse() {
            GetSettingsResponse getSettingsResponse = this.settingsResponse_;
            return getSettingsResponse == null ? GetSettingsResponse.getDefaultInstance() : getSettingsResponse;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
        public GetSettingsResponseOrBuilder getSettingsResponseOrBuilder() {
            GetSettingsResponse getSettingsResponse = this.settingsResponse_;
            return getSettingsResponse == null ? GetSettingsResponse.getDefaultInstance() : getSettingsResponse;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
        public TestModeRequest getTestModeRequest() {
            TestModeRequest testModeRequest = this.testModeRequest_;
            return testModeRequest == null ? TestModeRequest.getDefaultInstance() : testModeRequest;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
        public TestModeRequestOrBuilder getTestModeRequestOrBuilder() {
            TestModeRequest testModeRequest = this.testModeRequest_;
            return testModeRequest == null ? TestModeRequest.getDefaultInstance() : testModeRequest;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
        public TestModeResponse getTestModeResponse() {
            TestModeResponse testModeResponse = this.testModeResponse_;
            return testModeResponse == null ? TestModeResponse.getDefaultInstance() : testModeResponse;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
        public TestModeResponseOrBuilder getTestModeResponseOrBuilder() {
            TestModeResponse testModeResponse = this.testModeResponse_;
            return testModeResponse == null ? TestModeResponse.getDefaultInstance() : testModeResponse;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
        public boolean hasChangeSettingsRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
        public boolean hasChangeSettingsResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
        public boolean hasRestoreDefaultsRequest() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
        public boolean hasRestoreDefaultsResponse() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
        public boolean hasSettingsRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
        public boolean hasSettingsResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
        public boolean hasTestModeRequest() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
        public boolean hasTestModeResponse() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSettingsRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSettingsRequest().hashCode();
            }
            if (hasSettingsResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSettingsResponse().hashCode();
            }
            if (hasChangeSettingsRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getChangeSettingsRequest().hashCode();
            }
            if (hasChangeSettingsResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getChangeSettingsResponse().hashCode();
            }
            if (hasTestModeRequest()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getTestModeRequest().hashCode();
            }
            if (hasTestModeResponse()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getTestModeResponse().hashCode();
            }
            if (hasRestoreDefaultsRequest()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getRestoreDefaultsRequest().hashCode();
            }
            if (hasRestoreDefaultsResponse()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getRestoreDefaultsResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRadarProto.internal_static_GDI_Proto_Radar_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getSettingsRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getSettingsResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getChangeSettingsRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getChangeSettingsResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getTestModeRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getTestModeResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getRestoreDefaultsRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(8, getRestoreDefaultsResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<ChangeSettingsRequest, ChangeSettingsRequest.Builder, ChangeSettingsRequestOrBuilder> changeSettingsRequestBuilder_;
            private ChangeSettingsRequest changeSettingsRequest_;
            private SingleFieldBuilderV3<ChangeSettingsResponse, ChangeSettingsResponse.Builder, ChangeSettingsResponseOrBuilder> changeSettingsResponseBuilder_;
            private ChangeSettingsResponse changeSettingsResponse_;
            private SingleFieldBuilderV3<RestoreDefaultsRequest, RestoreDefaultsRequest.Builder, RestoreDefaultsRequestOrBuilder> restoreDefaultsRequestBuilder_;
            private RestoreDefaultsRequest restoreDefaultsRequest_;
            private SingleFieldBuilderV3<RestoreDefaultsResponse, RestoreDefaultsResponse.Builder, RestoreDefaultsResponseOrBuilder> restoreDefaultsResponseBuilder_;
            private RestoreDefaultsResponse restoreDefaultsResponse_;
            private SingleFieldBuilderV3<GetSettingsRequest, GetSettingsRequest.Builder, GetSettingsRequestOrBuilder> settingsRequestBuilder_;
            private GetSettingsRequest settingsRequest_;
            private SingleFieldBuilderV3<GetSettingsResponse, GetSettingsResponse.Builder, GetSettingsResponseOrBuilder> settingsResponseBuilder_;
            private GetSettingsResponse settingsResponse_;
            private SingleFieldBuilderV3<TestModeRequest, TestModeRequest.Builder, TestModeRequestOrBuilder> testModeRequestBuilder_;
            private TestModeRequest testModeRequest_;
            private SingleFieldBuilderV3<TestModeResponse, TestModeResponse.Builder, TestModeResponseOrBuilder> testModeResponseBuilder_;
            private TestModeResponse testModeResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Service service) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<GetSettingsRequest, GetSettingsRequest.Builder, GetSettingsRequestOrBuilder> singleFieldBuilderV3 = this.settingsRequestBuilder_;
                    service.settingsRequest_ = singleFieldBuilderV3 == null ? this.settingsRequest_ : (GetSettingsRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<GetSettingsResponse, GetSettingsResponse.Builder, GetSettingsResponseOrBuilder> singleFieldBuilderV4 = this.settingsResponseBuilder_;
                    service.settingsResponse_ = singleFieldBuilderV4 == null ? this.settingsResponse_ : (GetSettingsResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<ChangeSettingsRequest, ChangeSettingsRequest.Builder, ChangeSettingsRequestOrBuilder> singleFieldBuilderV5 = this.changeSettingsRequestBuilder_;
                    service.changeSettingsRequest_ = singleFieldBuilderV5 == null ? this.changeSettingsRequest_ : (ChangeSettingsRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<ChangeSettingsResponse, ChangeSettingsResponse.Builder, ChangeSettingsResponseOrBuilder> singleFieldBuilderV6 = this.changeSettingsResponseBuilder_;
                    service.changeSettingsResponse_ = singleFieldBuilderV6 == null ? this.changeSettingsResponse_ : (ChangeSettingsResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<TestModeRequest, TestModeRequest.Builder, TestModeRequestOrBuilder> singleFieldBuilderV7 = this.testModeRequestBuilder_;
                    service.testModeRequest_ = singleFieldBuilderV7 == null ? this.testModeRequest_ : (TestModeRequest) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<TestModeResponse, TestModeResponse.Builder, TestModeResponseOrBuilder> singleFieldBuilderV8 = this.testModeResponseBuilder_;
                    service.testModeResponse_ = singleFieldBuilderV8 == null ? this.testModeResponse_ : (TestModeResponse) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<RestoreDefaultsRequest, RestoreDefaultsRequest.Builder, RestoreDefaultsRequestOrBuilder> singleFieldBuilderV9 = this.restoreDefaultsRequestBuilder_;
                    service.restoreDefaultsRequest_ = singleFieldBuilderV9 == null ? this.restoreDefaultsRequest_ : (RestoreDefaultsRequest) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<RestoreDefaultsResponse, RestoreDefaultsResponse.Builder, RestoreDefaultsResponseOrBuilder> singleFieldBuilderV10 = this.restoreDefaultsResponseBuilder_;
                    service.restoreDefaultsResponse_ = singleFieldBuilderV10 == null ? this.restoreDefaultsResponse_ : (RestoreDefaultsResponse) singleFieldBuilderV10.build();
                    i14 |= 128;
                }
                service.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<ChangeSettingsRequest, ChangeSettingsRequest.Builder, ChangeSettingsRequestOrBuilder> getChangeSettingsRequestFieldBuilder() {
                if (this.changeSettingsRequestBuilder_ == null) {
                    this.changeSettingsRequestBuilder_ = new SingleFieldBuilderV3<>(getChangeSettingsRequest(), getParentForChildren(), isClean());
                    this.changeSettingsRequest_ = null;
                }
                return this.changeSettingsRequestBuilder_;
            }

            private SingleFieldBuilderV3<ChangeSettingsResponse, ChangeSettingsResponse.Builder, ChangeSettingsResponseOrBuilder> getChangeSettingsResponseFieldBuilder() {
                if (this.changeSettingsResponseBuilder_ == null) {
                    this.changeSettingsResponseBuilder_ = new SingleFieldBuilderV3<>(getChangeSettingsResponse(), getParentForChildren(), isClean());
                    this.changeSettingsResponse_ = null;
                }
                return this.changeSettingsResponseBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRadarProto.internal_static_GDI_Proto_Radar_Service_descriptor;
            }

            private SingleFieldBuilderV3<RestoreDefaultsRequest, RestoreDefaultsRequest.Builder, RestoreDefaultsRequestOrBuilder> getRestoreDefaultsRequestFieldBuilder() {
                if (this.restoreDefaultsRequestBuilder_ == null) {
                    this.restoreDefaultsRequestBuilder_ = new SingleFieldBuilderV3<>(getRestoreDefaultsRequest(), getParentForChildren(), isClean());
                    this.restoreDefaultsRequest_ = null;
                }
                return this.restoreDefaultsRequestBuilder_;
            }

            private SingleFieldBuilderV3<RestoreDefaultsResponse, RestoreDefaultsResponse.Builder, RestoreDefaultsResponseOrBuilder> getRestoreDefaultsResponseFieldBuilder() {
                if (this.restoreDefaultsResponseBuilder_ == null) {
                    this.restoreDefaultsResponseBuilder_ = new SingleFieldBuilderV3<>(getRestoreDefaultsResponse(), getParentForChildren(), isClean());
                    this.restoreDefaultsResponse_ = null;
                }
                return this.restoreDefaultsResponseBuilder_;
            }

            private SingleFieldBuilderV3<GetSettingsRequest, GetSettingsRequest.Builder, GetSettingsRequestOrBuilder> getSettingsRequestFieldBuilder() {
                if (this.settingsRequestBuilder_ == null) {
                    this.settingsRequestBuilder_ = new SingleFieldBuilderV3<>(getSettingsRequest(), getParentForChildren(), isClean());
                    this.settingsRequest_ = null;
                }
                return this.settingsRequestBuilder_;
            }

            private SingleFieldBuilderV3<GetSettingsResponse, GetSettingsResponse.Builder, GetSettingsResponseOrBuilder> getSettingsResponseFieldBuilder() {
                if (this.settingsResponseBuilder_ == null) {
                    this.settingsResponseBuilder_ = new SingleFieldBuilderV3<>(getSettingsResponse(), getParentForChildren(), isClean());
                    this.settingsResponse_ = null;
                }
                return this.settingsResponseBuilder_;
            }

            private SingleFieldBuilderV3<TestModeRequest, TestModeRequest.Builder, TestModeRequestOrBuilder> getTestModeRequestFieldBuilder() {
                if (this.testModeRequestBuilder_ == null) {
                    this.testModeRequestBuilder_ = new SingleFieldBuilderV3<>(getTestModeRequest(), getParentForChildren(), isClean());
                    this.testModeRequest_ = null;
                }
                return this.testModeRequestBuilder_;
            }

            private SingleFieldBuilderV3<TestModeResponse, TestModeResponse.Builder, TestModeResponseOrBuilder> getTestModeResponseFieldBuilder() {
                if (this.testModeResponseBuilder_ == null) {
                    this.testModeResponseBuilder_ = new SingleFieldBuilderV3<>(getTestModeResponse(), getParentForChildren(), isClean());
                    this.testModeResponse_ = null;
                }
                return this.testModeResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSettingsRequestFieldBuilder();
                    getSettingsResponseFieldBuilder();
                    getChangeSettingsRequestFieldBuilder();
                    getChangeSettingsResponseFieldBuilder();
                    getTestModeRequestFieldBuilder();
                    getTestModeResponseFieldBuilder();
                    getRestoreDefaultsRequestFieldBuilder();
                    getRestoreDefaultsResponseFieldBuilder();
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
                this.settingsRequest_ = null;
                SingleFieldBuilderV3<GetSettingsRequest, GetSettingsRequest.Builder, GetSettingsRequestOrBuilder> singleFieldBuilderV3 = this.settingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.settingsRequestBuilder_ = null;
                }
                this.settingsResponse_ = null;
                SingleFieldBuilderV3<GetSettingsResponse, GetSettingsResponse.Builder, GetSettingsResponseOrBuilder> singleFieldBuilderV4 = this.settingsResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.settingsResponseBuilder_ = null;
                }
                this.changeSettingsRequest_ = null;
                SingleFieldBuilderV3<ChangeSettingsRequest, ChangeSettingsRequest.Builder, ChangeSettingsRequestOrBuilder> singleFieldBuilderV5 = this.changeSettingsRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.changeSettingsRequestBuilder_ = null;
                }
                this.changeSettingsResponse_ = null;
                SingleFieldBuilderV3<ChangeSettingsResponse, ChangeSettingsResponse.Builder, ChangeSettingsResponseOrBuilder> singleFieldBuilderV6 = this.changeSettingsResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.changeSettingsResponseBuilder_ = null;
                }
                this.testModeRequest_ = null;
                SingleFieldBuilderV3<TestModeRequest, TestModeRequest.Builder, TestModeRequestOrBuilder> singleFieldBuilderV7 = this.testModeRequestBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.testModeRequestBuilder_ = null;
                }
                this.testModeResponse_ = null;
                SingleFieldBuilderV3<TestModeResponse, TestModeResponse.Builder, TestModeResponseOrBuilder> singleFieldBuilderV8 = this.testModeResponseBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.testModeResponseBuilder_ = null;
                }
                this.restoreDefaultsRequest_ = null;
                SingleFieldBuilderV3<RestoreDefaultsRequest, RestoreDefaultsRequest.Builder, RestoreDefaultsRequestOrBuilder> singleFieldBuilderV9 = this.restoreDefaultsRequestBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.restoreDefaultsRequestBuilder_ = null;
                }
                this.restoreDefaultsResponse_ = null;
                SingleFieldBuilderV3<RestoreDefaultsResponse, RestoreDefaultsResponse.Builder, RestoreDefaultsResponseOrBuilder> singleFieldBuilderV10 = this.restoreDefaultsResponseBuilder_;
                if (singleFieldBuilderV10 != null) {
                    singleFieldBuilderV10.dispose();
                    this.restoreDefaultsResponseBuilder_ = null;
                }
                return this;
            }

            public Builder clearChangeSettingsRequest() {
                this.bitField0_ &= -5;
                this.changeSettingsRequest_ = null;
                SingleFieldBuilderV3<ChangeSettingsRequest, ChangeSettingsRequest.Builder, ChangeSettingsRequestOrBuilder> singleFieldBuilderV3 = this.changeSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.changeSettingsRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearChangeSettingsResponse() {
                this.bitField0_ &= -9;
                this.changeSettingsResponse_ = null;
                SingleFieldBuilderV3<ChangeSettingsResponse, ChangeSettingsResponse.Builder, ChangeSettingsResponseOrBuilder> singleFieldBuilderV3 = this.changeSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.changeSettingsResponseBuilder_ = null;
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

            public Builder clearRestoreDefaultsRequest() {
                this.bitField0_ &= -65;
                this.restoreDefaultsRequest_ = null;
                SingleFieldBuilderV3<RestoreDefaultsRequest, RestoreDefaultsRequest.Builder, RestoreDefaultsRequestOrBuilder> singleFieldBuilderV3 = this.restoreDefaultsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.restoreDefaultsRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearRestoreDefaultsResponse() {
                this.bitField0_ &= -129;
                this.restoreDefaultsResponse_ = null;
                SingleFieldBuilderV3<RestoreDefaultsResponse, RestoreDefaultsResponse.Builder, RestoreDefaultsResponseOrBuilder> singleFieldBuilderV3 = this.restoreDefaultsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.restoreDefaultsResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSettingsRequest() {
                this.bitField0_ &= -2;
                this.settingsRequest_ = null;
                SingleFieldBuilderV3<GetSettingsRequest, GetSettingsRequest.Builder, GetSettingsRequestOrBuilder> singleFieldBuilderV3 = this.settingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.settingsRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSettingsResponse() {
                this.bitField0_ &= -3;
                this.settingsResponse_ = null;
                SingleFieldBuilderV3<GetSettingsResponse, GetSettingsResponse.Builder, GetSettingsResponseOrBuilder> singleFieldBuilderV3 = this.settingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.settingsResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTestModeRequest() {
                this.bitField0_ &= -17;
                this.testModeRequest_ = null;
                SingleFieldBuilderV3<TestModeRequest, TestModeRequest.Builder, TestModeRequestOrBuilder> singleFieldBuilderV3 = this.testModeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.testModeRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTestModeResponse() {
                this.bitField0_ &= -33;
                this.testModeResponse_ = null;
                SingleFieldBuilderV3<TestModeResponse, TestModeResponse.Builder, TestModeResponseOrBuilder> singleFieldBuilderV3 = this.testModeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.testModeResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
            public ChangeSettingsRequest getChangeSettingsRequest() {
                SingleFieldBuilderV3<ChangeSettingsRequest, ChangeSettingsRequest.Builder, ChangeSettingsRequestOrBuilder> singleFieldBuilderV3 = this.changeSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ChangeSettingsRequest) singleFieldBuilderV3.getMessage();
                }
                ChangeSettingsRequest changeSettingsRequest = this.changeSettingsRequest_;
                return changeSettingsRequest == null ? ChangeSettingsRequest.getDefaultInstance() : changeSettingsRequest;
            }

            public ChangeSettingsRequest.Builder getChangeSettingsRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (ChangeSettingsRequest.Builder) getChangeSettingsRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
            public ChangeSettingsRequestOrBuilder getChangeSettingsRequestOrBuilder() {
                SingleFieldBuilderV3<ChangeSettingsRequest, ChangeSettingsRequest.Builder, ChangeSettingsRequestOrBuilder> singleFieldBuilderV3 = this.changeSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ChangeSettingsRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ChangeSettingsRequest changeSettingsRequest = this.changeSettingsRequest_;
                return changeSettingsRequest == null ? ChangeSettingsRequest.getDefaultInstance() : changeSettingsRequest;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
            public ChangeSettingsResponse getChangeSettingsResponse() {
                SingleFieldBuilderV3<ChangeSettingsResponse, ChangeSettingsResponse.Builder, ChangeSettingsResponseOrBuilder> singleFieldBuilderV3 = this.changeSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ChangeSettingsResponse) singleFieldBuilderV3.getMessage();
                }
                ChangeSettingsResponse changeSettingsResponse = this.changeSettingsResponse_;
                return changeSettingsResponse == null ? ChangeSettingsResponse.getDefaultInstance() : changeSettingsResponse;
            }

            public ChangeSettingsResponse.Builder getChangeSettingsResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (ChangeSettingsResponse.Builder) getChangeSettingsResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
            public ChangeSettingsResponseOrBuilder getChangeSettingsResponseOrBuilder() {
                SingleFieldBuilderV3<ChangeSettingsResponse, ChangeSettingsResponse.Builder, ChangeSettingsResponseOrBuilder> singleFieldBuilderV3 = this.changeSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ChangeSettingsResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ChangeSettingsResponse changeSettingsResponse = this.changeSettingsResponse_;
                return changeSettingsResponse == null ? ChangeSettingsResponse.getDefaultInstance() : changeSettingsResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIRadarProto.internal_static_GDI_Proto_Radar_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
            public RestoreDefaultsRequest getRestoreDefaultsRequest() {
                SingleFieldBuilderV3<RestoreDefaultsRequest, RestoreDefaultsRequest.Builder, RestoreDefaultsRequestOrBuilder> singleFieldBuilderV3 = this.restoreDefaultsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RestoreDefaultsRequest) singleFieldBuilderV3.getMessage();
                }
                RestoreDefaultsRequest restoreDefaultsRequest = this.restoreDefaultsRequest_;
                return restoreDefaultsRequest == null ? RestoreDefaultsRequest.getDefaultInstance() : restoreDefaultsRequest;
            }

            public RestoreDefaultsRequest.Builder getRestoreDefaultsRequestBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (RestoreDefaultsRequest.Builder) getRestoreDefaultsRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
            public RestoreDefaultsRequestOrBuilder getRestoreDefaultsRequestOrBuilder() {
                SingleFieldBuilderV3<RestoreDefaultsRequest, RestoreDefaultsRequest.Builder, RestoreDefaultsRequestOrBuilder> singleFieldBuilderV3 = this.restoreDefaultsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RestoreDefaultsRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                RestoreDefaultsRequest restoreDefaultsRequest = this.restoreDefaultsRequest_;
                return restoreDefaultsRequest == null ? RestoreDefaultsRequest.getDefaultInstance() : restoreDefaultsRequest;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
            public RestoreDefaultsResponse getRestoreDefaultsResponse() {
                SingleFieldBuilderV3<RestoreDefaultsResponse, RestoreDefaultsResponse.Builder, RestoreDefaultsResponseOrBuilder> singleFieldBuilderV3 = this.restoreDefaultsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RestoreDefaultsResponse) singleFieldBuilderV3.getMessage();
                }
                RestoreDefaultsResponse restoreDefaultsResponse = this.restoreDefaultsResponse_;
                return restoreDefaultsResponse == null ? RestoreDefaultsResponse.getDefaultInstance() : restoreDefaultsResponse;
            }

            public RestoreDefaultsResponse.Builder getRestoreDefaultsResponseBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (RestoreDefaultsResponse.Builder) getRestoreDefaultsResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
            public RestoreDefaultsResponseOrBuilder getRestoreDefaultsResponseOrBuilder() {
                SingleFieldBuilderV3<RestoreDefaultsResponse, RestoreDefaultsResponse.Builder, RestoreDefaultsResponseOrBuilder> singleFieldBuilderV3 = this.restoreDefaultsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RestoreDefaultsResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                RestoreDefaultsResponse restoreDefaultsResponse = this.restoreDefaultsResponse_;
                return restoreDefaultsResponse == null ? RestoreDefaultsResponse.getDefaultInstance() : restoreDefaultsResponse;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
            public GetSettingsRequest getSettingsRequest() {
                SingleFieldBuilderV3<GetSettingsRequest, GetSettingsRequest.Builder, GetSettingsRequestOrBuilder> singleFieldBuilderV3 = this.settingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetSettingsRequest) singleFieldBuilderV3.getMessage();
                }
                GetSettingsRequest getSettingsRequest = this.settingsRequest_;
                return getSettingsRequest == null ? GetSettingsRequest.getDefaultInstance() : getSettingsRequest;
            }

            public GetSettingsRequest.Builder getSettingsRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (GetSettingsRequest.Builder) getSettingsRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
            public GetSettingsRequestOrBuilder getSettingsRequestOrBuilder() {
                SingleFieldBuilderV3<GetSettingsRequest, GetSettingsRequest.Builder, GetSettingsRequestOrBuilder> singleFieldBuilderV3 = this.settingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetSettingsRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GetSettingsRequest getSettingsRequest = this.settingsRequest_;
                return getSettingsRequest == null ? GetSettingsRequest.getDefaultInstance() : getSettingsRequest;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
            public GetSettingsResponse getSettingsResponse() {
                SingleFieldBuilderV3<GetSettingsResponse, GetSettingsResponse.Builder, GetSettingsResponseOrBuilder> singleFieldBuilderV3 = this.settingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetSettingsResponse) singleFieldBuilderV3.getMessage();
                }
                GetSettingsResponse getSettingsResponse = this.settingsResponse_;
                return getSettingsResponse == null ? GetSettingsResponse.getDefaultInstance() : getSettingsResponse;
            }

            public GetSettingsResponse.Builder getSettingsResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (GetSettingsResponse.Builder) getSettingsResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
            public GetSettingsResponseOrBuilder getSettingsResponseOrBuilder() {
                SingleFieldBuilderV3<GetSettingsResponse, GetSettingsResponse.Builder, GetSettingsResponseOrBuilder> singleFieldBuilderV3 = this.settingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetSettingsResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GetSettingsResponse getSettingsResponse = this.settingsResponse_;
                return getSettingsResponse == null ? GetSettingsResponse.getDefaultInstance() : getSettingsResponse;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
            public TestModeRequest getTestModeRequest() {
                SingleFieldBuilderV3<TestModeRequest, TestModeRequest.Builder, TestModeRequestOrBuilder> singleFieldBuilderV3 = this.testModeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TestModeRequest) singleFieldBuilderV3.getMessage();
                }
                TestModeRequest testModeRequest = this.testModeRequest_;
                return testModeRequest == null ? TestModeRequest.getDefaultInstance() : testModeRequest;
            }

            public TestModeRequest.Builder getTestModeRequestBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (TestModeRequest.Builder) getTestModeRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
            public TestModeRequestOrBuilder getTestModeRequestOrBuilder() {
                SingleFieldBuilderV3<TestModeRequest, TestModeRequest.Builder, TestModeRequestOrBuilder> singleFieldBuilderV3 = this.testModeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TestModeRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TestModeRequest testModeRequest = this.testModeRequest_;
                return testModeRequest == null ? TestModeRequest.getDefaultInstance() : testModeRequest;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
            public TestModeResponse getTestModeResponse() {
                SingleFieldBuilderV3<TestModeResponse, TestModeResponse.Builder, TestModeResponseOrBuilder> singleFieldBuilderV3 = this.testModeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TestModeResponse) singleFieldBuilderV3.getMessage();
                }
                TestModeResponse testModeResponse = this.testModeResponse_;
                return testModeResponse == null ? TestModeResponse.getDefaultInstance() : testModeResponse;
            }

            public TestModeResponse.Builder getTestModeResponseBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (TestModeResponse.Builder) getTestModeResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
            public TestModeResponseOrBuilder getTestModeResponseOrBuilder() {
                SingleFieldBuilderV3<TestModeResponse, TestModeResponse.Builder, TestModeResponseOrBuilder> singleFieldBuilderV3 = this.testModeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TestModeResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TestModeResponse testModeResponse = this.testModeResponse_;
                return testModeResponse == null ? TestModeResponse.getDefaultInstance() : testModeResponse;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
            public boolean hasChangeSettingsRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
            public boolean hasChangeSettingsResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
            public boolean hasRestoreDefaultsRequest() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
            public boolean hasRestoreDefaultsResponse() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
            public boolean hasSettingsRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
            public boolean hasSettingsResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
            public boolean hasTestModeRequest() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.ServiceOrBuilder
            public boolean hasTestModeResponse() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRadarProto.internal_static_GDI_Proto_Radar_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeChangeSettingsRequest(ChangeSettingsRequest changeSettingsRequest) {
                ChangeSettingsRequest changeSettingsRequest2;
                SingleFieldBuilderV3<ChangeSettingsRequest, ChangeSettingsRequest.Builder, ChangeSettingsRequestOrBuilder> singleFieldBuilderV3 = this.changeSettingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(changeSettingsRequest);
                } else if ((this.bitField0_ & 4) == 0 || (changeSettingsRequest2 = this.changeSettingsRequest_) == null || changeSettingsRequest2 == ChangeSettingsRequest.getDefaultInstance()) {
                    this.changeSettingsRequest_ = changeSettingsRequest;
                } else {
                    getChangeSettingsRequestBuilder().mergeFrom(changeSettingsRequest);
                }
                if (this.changeSettingsRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeChangeSettingsResponse(ChangeSettingsResponse changeSettingsResponse) {
                ChangeSettingsResponse changeSettingsResponse2;
                SingleFieldBuilderV3<ChangeSettingsResponse, ChangeSettingsResponse.Builder, ChangeSettingsResponseOrBuilder> singleFieldBuilderV3 = this.changeSettingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(changeSettingsResponse);
                } else if ((this.bitField0_ & 8) == 0 || (changeSettingsResponse2 = this.changeSettingsResponse_) == null || changeSettingsResponse2 == ChangeSettingsResponse.getDefaultInstance()) {
                    this.changeSettingsResponse_ = changeSettingsResponse;
                } else {
                    getChangeSettingsResponseBuilder().mergeFrom(changeSettingsResponse);
                }
                if (this.changeSettingsResponse_ != null) {
                    this.bitField0_ |= 8;
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
                                    codedInputStream.readMessage(getSettingsRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getSettingsResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getChangeSettingsRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getChangeSettingsResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(getTestModeRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                } else if (tag == 50) {
                                    codedInputStream.readMessage(getTestModeResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                } else if (tag == 58) {
                                    codedInputStream.readMessage(getRestoreDefaultsRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                } else if (tag == 66) {
                                    codedInputStream.readMessage(getRestoreDefaultsResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
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

            public Builder mergeRestoreDefaultsRequest(RestoreDefaultsRequest restoreDefaultsRequest) {
                RestoreDefaultsRequest restoreDefaultsRequest2;
                SingleFieldBuilderV3<RestoreDefaultsRequest, RestoreDefaultsRequest.Builder, RestoreDefaultsRequestOrBuilder> singleFieldBuilderV3 = this.restoreDefaultsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(restoreDefaultsRequest);
                } else if ((this.bitField0_ & 64) == 0 || (restoreDefaultsRequest2 = this.restoreDefaultsRequest_) == null || restoreDefaultsRequest2 == RestoreDefaultsRequest.getDefaultInstance()) {
                    this.restoreDefaultsRequest_ = restoreDefaultsRequest;
                } else {
                    getRestoreDefaultsRequestBuilder().mergeFrom(restoreDefaultsRequest);
                }
                if (this.restoreDefaultsRequest_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeRestoreDefaultsResponse(RestoreDefaultsResponse restoreDefaultsResponse) {
                RestoreDefaultsResponse restoreDefaultsResponse2;
                SingleFieldBuilderV3<RestoreDefaultsResponse, RestoreDefaultsResponse.Builder, RestoreDefaultsResponseOrBuilder> singleFieldBuilderV3 = this.restoreDefaultsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(restoreDefaultsResponse);
                } else if ((this.bitField0_ & 128) == 0 || (restoreDefaultsResponse2 = this.restoreDefaultsResponse_) == null || restoreDefaultsResponse2 == RestoreDefaultsResponse.getDefaultInstance()) {
                    this.restoreDefaultsResponse_ = restoreDefaultsResponse;
                } else {
                    getRestoreDefaultsResponseBuilder().mergeFrom(restoreDefaultsResponse);
                }
                if (this.restoreDefaultsResponse_ != null) {
                    this.bitField0_ |= 128;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSettingsRequest(GetSettingsRequest getSettingsRequest) {
                GetSettingsRequest getSettingsRequest2;
                SingleFieldBuilderV3<GetSettingsRequest, GetSettingsRequest.Builder, GetSettingsRequestOrBuilder> singleFieldBuilderV3 = this.settingsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(getSettingsRequest);
                } else if ((this.bitField0_ & 1) == 0 || (getSettingsRequest2 = this.settingsRequest_) == null || getSettingsRequest2 == GetSettingsRequest.getDefaultInstance()) {
                    this.settingsRequest_ = getSettingsRequest;
                } else {
                    getSettingsRequestBuilder().mergeFrom(getSettingsRequest);
                }
                if (this.settingsRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSettingsResponse(GetSettingsResponse getSettingsResponse) {
                GetSettingsResponse getSettingsResponse2;
                SingleFieldBuilderV3<GetSettingsResponse, GetSettingsResponse.Builder, GetSettingsResponseOrBuilder> singleFieldBuilderV3 = this.settingsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(getSettingsResponse);
                } else if ((this.bitField0_ & 2) == 0 || (getSettingsResponse2 = this.settingsResponse_) == null || getSettingsResponse2 == GetSettingsResponse.getDefaultInstance()) {
                    this.settingsResponse_ = getSettingsResponse;
                } else {
                    getSettingsResponseBuilder().mergeFrom(getSettingsResponse);
                }
                if (this.settingsResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeTestModeRequest(TestModeRequest testModeRequest) {
                TestModeRequest testModeRequest2;
                SingleFieldBuilderV3<TestModeRequest, TestModeRequest.Builder, TestModeRequestOrBuilder> singleFieldBuilderV3 = this.testModeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(testModeRequest);
                } else if ((this.bitField0_ & 16) == 0 || (testModeRequest2 = this.testModeRequest_) == null || testModeRequest2 == TestModeRequest.getDefaultInstance()) {
                    this.testModeRequest_ = testModeRequest;
                } else {
                    getTestModeRequestBuilder().mergeFrom(testModeRequest);
                }
                if (this.testModeRequest_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeTestModeResponse(TestModeResponse testModeResponse) {
                TestModeResponse testModeResponse2;
                SingleFieldBuilderV3<TestModeResponse, TestModeResponse.Builder, TestModeResponseOrBuilder> singleFieldBuilderV3 = this.testModeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(testModeResponse);
                } else if ((this.bitField0_ & 32) == 0 || (testModeResponse2 = this.testModeResponse_) == null || testModeResponse2 == TestModeResponse.getDefaultInstance()) {
                    this.testModeResponse_ = testModeResponse;
                } else {
                    getTestModeResponseBuilder().mergeFrom(testModeResponse);
                }
                if (this.testModeResponse_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setChangeSettingsRequest(ChangeSettingsRequest.Builder builder) {
                SingleFieldBuilderV3<ChangeSettingsRequest, ChangeSettingsRequest.Builder, ChangeSettingsRequestOrBuilder> singleFieldBuilderV3 = this.changeSettingsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.changeSettingsRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setChangeSettingsResponse(ChangeSettingsResponse.Builder builder) {
                SingleFieldBuilderV3<ChangeSettingsResponse, ChangeSettingsResponse.Builder, ChangeSettingsResponseOrBuilder> singleFieldBuilderV3 = this.changeSettingsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.changeSettingsResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
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

            public Builder setRestoreDefaultsRequest(RestoreDefaultsRequest.Builder builder) {
                SingleFieldBuilderV3<RestoreDefaultsRequest, RestoreDefaultsRequest.Builder, RestoreDefaultsRequestOrBuilder> singleFieldBuilderV3 = this.restoreDefaultsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.restoreDefaultsRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setRestoreDefaultsResponse(RestoreDefaultsResponse.Builder builder) {
                SingleFieldBuilderV3<RestoreDefaultsResponse, RestoreDefaultsResponse.Builder, RestoreDefaultsResponseOrBuilder> singleFieldBuilderV3 = this.restoreDefaultsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.restoreDefaultsResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setSettingsRequest(GetSettingsRequest.Builder builder) {
                SingleFieldBuilderV3<GetSettingsRequest, GetSettingsRequest.Builder, GetSettingsRequestOrBuilder> singleFieldBuilderV3 = this.settingsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.settingsRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSettingsResponse(GetSettingsResponse.Builder builder) {
                SingleFieldBuilderV3<GetSettingsResponse, GetSettingsResponse.Builder, GetSettingsResponseOrBuilder> singleFieldBuilderV3 = this.settingsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.settingsResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTestModeRequest(TestModeRequest.Builder builder) {
                SingleFieldBuilderV3<TestModeRequest, TestModeRequest.Builder, TestModeRequestOrBuilder> singleFieldBuilderV3 = this.testModeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.testModeRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setTestModeResponse(TestModeResponse.Builder builder) {
                SingleFieldBuilderV3<TestModeResponse, TestModeResponse.Builder, TestModeResponseOrBuilder> singleFieldBuilderV3 = this.testModeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.testModeResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
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

            public Builder setChangeSettingsRequest(ChangeSettingsRequest changeSettingsRequest) {
                SingleFieldBuilderV3<ChangeSettingsRequest, ChangeSettingsRequest.Builder, ChangeSettingsRequestOrBuilder> singleFieldBuilderV3 = this.changeSettingsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    changeSettingsRequest.getClass();
                    this.changeSettingsRequest_ = changeSettingsRequest;
                } else {
                    singleFieldBuilderV3.setMessage(changeSettingsRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setChangeSettingsResponse(ChangeSettingsResponse changeSettingsResponse) {
                SingleFieldBuilderV3<ChangeSettingsResponse, ChangeSettingsResponse.Builder, ChangeSettingsResponseOrBuilder> singleFieldBuilderV3 = this.changeSettingsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    changeSettingsResponse.getClass();
                    this.changeSettingsResponse_ = changeSettingsResponse;
                } else {
                    singleFieldBuilderV3.setMessage(changeSettingsResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setRestoreDefaultsRequest(RestoreDefaultsRequest restoreDefaultsRequest) {
                SingleFieldBuilderV3<RestoreDefaultsRequest, RestoreDefaultsRequest.Builder, RestoreDefaultsRequestOrBuilder> singleFieldBuilderV3 = this.restoreDefaultsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    restoreDefaultsRequest.getClass();
                    this.restoreDefaultsRequest_ = restoreDefaultsRequest;
                } else {
                    singleFieldBuilderV3.setMessage(restoreDefaultsRequest);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setRestoreDefaultsResponse(RestoreDefaultsResponse restoreDefaultsResponse) {
                SingleFieldBuilderV3<RestoreDefaultsResponse, RestoreDefaultsResponse.Builder, RestoreDefaultsResponseOrBuilder> singleFieldBuilderV3 = this.restoreDefaultsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    restoreDefaultsResponse.getClass();
                    this.restoreDefaultsResponse_ = restoreDefaultsResponse;
                } else {
                    singleFieldBuilderV3.setMessage(restoreDefaultsResponse);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setSettingsRequest(GetSettingsRequest getSettingsRequest) {
                SingleFieldBuilderV3<GetSettingsRequest, GetSettingsRequest.Builder, GetSettingsRequestOrBuilder> singleFieldBuilderV3 = this.settingsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    getSettingsRequest.getClass();
                    this.settingsRequest_ = getSettingsRequest;
                } else {
                    singleFieldBuilderV3.setMessage(getSettingsRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSettingsResponse(GetSettingsResponse getSettingsResponse) {
                SingleFieldBuilderV3<GetSettingsResponse, GetSettingsResponse.Builder, GetSettingsResponseOrBuilder> singleFieldBuilderV3 = this.settingsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    getSettingsResponse.getClass();
                    this.settingsResponse_ = getSettingsResponse;
                } else {
                    singleFieldBuilderV3.setMessage(getSettingsResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTestModeRequest(TestModeRequest testModeRequest) {
                SingleFieldBuilderV3<TestModeRequest, TestModeRequest.Builder, TestModeRequestOrBuilder> singleFieldBuilderV3 = this.testModeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    testModeRequest.getClass();
                    this.testModeRequest_ = testModeRequest;
                } else {
                    singleFieldBuilderV3.setMessage(testModeRequest);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setTestModeResponse(TestModeResponse testModeResponse) {
                SingleFieldBuilderV3<TestModeResponse, TestModeResponse.Builder, TestModeResponseOrBuilder> singleFieldBuilderV3 = this.testModeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    testModeResponse.getClass();
                    this.testModeResponse_ = testModeResponse;
                } else {
                    singleFieldBuilderV3.setMessage(testModeResponse);
                }
                this.bitField0_ |= 32;
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
                if (service.hasSettingsRequest()) {
                    mergeSettingsRequest(service.getSettingsRequest());
                }
                if (service.hasSettingsResponse()) {
                    mergeSettingsResponse(service.getSettingsResponse());
                }
                if (service.hasChangeSettingsRequest()) {
                    mergeChangeSettingsRequest(service.getChangeSettingsRequest());
                }
                if (service.hasChangeSettingsResponse()) {
                    mergeChangeSettingsResponse(service.getChangeSettingsResponse());
                }
                if (service.hasTestModeRequest()) {
                    mergeTestModeRequest(service.getTestModeRequest());
                }
                if (service.hasTestModeResponse()) {
                    mergeTestModeResponse(service.getTestModeResponse());
                }
                if (service.hasRestoreDefaultsRequest()) {
                    mergeRestoreDefaultsRequest(service.getRestoreDefaultsRequest());
                }
                if (service.hasRestoreDefaultsResponse()) {
                    mergeRestoreDefaultsResponse(service.getRestoreDefaultsResponse());
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

    public static final class Settings extends GeneratedMessageV3 implements SettingsOrBuilder {
        public static final int BLIND_SPOT_ALERTS_FIELD_NUMBER = 1;
        public static final int DEMO_MODE_ACTIVE_FIELD_NUMBER = 3;
        public static final int LIGHT_LEVEL_UPDATES_ENABLED_FIELD_NUMBER = 5;
        public static final int LIMP_MODE_CONTROL_FIELD_NUMBER = 4;
        public static final int REAR_ALERTS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private AlertSettings blindSpotAlerts_;
        private boolean demoModeActive_;
        private boolean lightLevelUpdatesEnabled_;
        private LimpModeControl limpModeControl_;
        private byte memoizedIsInitialized;
        private AlertSettings rearAlerts_;
        private static final Settings DEFAULT_INSTANCE = new Settings();

        @Deprecated
        public static final Parser<Settings> PARSER = new AbstractParser<Settings>() { // from class: com.garmin.proto.generated.GDIRadarProto.Settings.1
            @Override // com.google.protobuf.Parser
            public Settings parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Settings.newBuilder();
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

        private Settings(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.demoModeActive_ = false;
            this.lightLevelUpdatesEnabled_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Settings getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRadarProto.internal_static_GDI_Proto_Radar_Settings_descriptor;
        }

        public static Builder newBuilder(Settings settings) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(settings);
        }

        public static Settings parseDelimitedFrom(InputStream inputStream) {
            return (Settings) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Settings parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Settings> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Settings)) {
                return super.equals(obj);
            }
            Settings settings = (Settings) obj;
            if (hasBlindSpotAlerts() != settings.hasBlindSpotAlerts()) {
                return false;
            }
            if ((hasBlindSpotAlerts() && !getBlindSpotAlerts().equals(settings.getBlindSpotAlerts())) || hasRearAlerts() != settings.hasRearAlerts()) {
                return false;
            }
            if ((hasRearAlerts() && !getRearAlerts().equals(settings.getRearAlerts())) || hasDemoModeActive() != settings.hasDemoModeActive()) {
                return false;
            }
            if ((hasDemoModeActive() && getDemoModeActive() != settings.getDemoModeActive()) || hasLimpModeControl() != settings.hasLimpModeControl()) {
                return false;
            }
            if ((!hasLimpModeControl() || getLimpModeControl().equals(settings.getLimpModeControl())) && hasLightLevelUpdatesEnabled() == settings.hasLightLevelUpdatesEnabled()) {
                return (!hasLightLevelUpdatesEnabled() || getLightLevelUpdatesEnabled() == settings.getLightLevelUpdatesEnabled()) && getUnknownFields().equals(settings.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.SettingsOrBuilder
        public AlertSettings getBlindSpotAlerts() {
            AlertSettings alertSettings = this.blindSpotAlerts_;
            return alertSettings == null ? AlertSettings.getDefaultInstance() : alertSettings;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.SettingsOrBuilder
        public AlertSettingsOrBuilder getBlindSpotAlertsOrBuilder() {
            AlertSettings alertSettings = this.blindSpotAlerts_;
            return alertSettings == null ? AlertSettings.getDefaultInstance() : alertSettings;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.SettingsOrBuilder
        public boolean getDemoModeActive() {
            return this.demoModeActive_;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.SettingsOrBuilder
        public boolean getLightLevelUpdatesEnabled() {
            return this.lightLevelUpdatesEnabled_;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.SettingsOrBuilder
        public LimpModeControl getLimpModeControl() {
            LimpModeControl limpModeControl = this.limpModeControl_;
            return limpModeControl == null ? LimpModeControl.getDefaultInstance() : limpModeControl;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.SettingsOrBuilder
        public LimpModeControlOrBuilder getLimpModeControlOrBuilder() {
            LimpModeControl limpModeControl = this.limpModeControl_;
            return limpModeControl == null ? LimpModeControl.getDefaultInstance() : limpModeControl;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Settings> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.SettingsOrBuilder
        public AlertSettings getRearAlerts() {
            AlertSettings alertSettings = this.rearAlerts_;
            return alertSettings == null ? AlertSettings.getDefaultInstance() : alertSettings;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.SettingsOrBuilder
        public AlertSettingsOrBuilder getRearAlertsOrBuilder() {
            AlertSettings alertSettings = this.rearAlerts_;
            return alertSettings == null ? AlertSettings.getDefaultInstance() : alertSettings;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getBlindSpotAlerts()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getRearAlerts());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeBoolSize(3, this.demoModeActive_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getLimpModeControl());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeBoolSize(5, this.lightLevelUpdatesEnabled_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.SettingsOrBuilder
        public boolean hasBlindSpotAlerts() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.SettingsOrBuilder
        public boolean hasDemoModeActive() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.SettingsOrBuilder
        public boolean hasLightLevelUpdatesEnabled() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.SettingsOrBuilder
        public boolean hasLimpModeControl() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.SettingsOrBuilder
        public boolean hasRearAlerts() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasBlindSpotAlerts()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getBlindSpotAlerts().hashCode();
            }
            if (hasRearAlerts()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getRearAlerts().hashCode();
            }
            if (hasDemoModeActive()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashBoolean(getDemoModeActive());
            }
            if (hasLimpModeControl()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getLimpModeControl().hashCode();
            }
            if (hasLightLevelUpdatesEnabled()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + Internal.hashBoolean(getLightLevelUpdatesEnabled());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRadarProto.internal_static_GDI_Proto_Radar_Settings_fieldAccessorTable.ensureFieldAccessorsInitialized(Settings.class, Builder.class);
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
            return new Settings();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getBlindSpotAlerts());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getRearAlerts());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(3, this.demoModeActive_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getLimpModeControl());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeBool(5, this.lightLevelUpdatesEnabled_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SettingsOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<AlertSettings, AlertSettings.Builder, AlertSettingsOrBuilder> blindSpotAlertsBuilder_;
            private AlertSettings blindSpotAlerts_;
            private boolean demoModeActive_;
            private boolean lightLevelUpdatesEnabled_;
            private SingleFieldBuilderV3<LimpModeControl, LimpModeControl.Builder, LimpModeControlOrBuilder> limpModeControlBuilder_;
            private LimpModeControl limpModeControl_;
            private SingleFieldBuilderV3<AlertSettings, AlertSettings.Builder, AlertSettingsOrBuilder> rearAlertsBuilder_;
            private AlertSettings rearAlerts_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Settings settings) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<AlertSettings, AlertSettings.Builder, AlertSettingsOrBuilder> singleFieldBuilderV3 = this.blindSpotAlertsBuilder_;
                    settings.blindSpotAlerts_ = singleFieldBuilderV3 == null ? this.blindSpotAlerts_ : (AlertSettings) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<AlertSettings, AlertSettings.Builder, AlertSettingsOrBuilder> singleFieldBuilderV4 = this.rearAlertsBuilder_;
                    settings.rearAlerts_ = singleFieldBuilderV4 == null ? this.rearAlerts_ : (AlertSettings) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    settings.demoModeActive_ = this.demoModeActive_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<LimpModeControl, LimpModeControl.Builder, LimpModeControlOrBuilder> singleFieldBuilderV5 = this.limpModeControlBuilder_;
                    settings.limpModeControl_ = singleFieldBuilderV5 == null ? this.limpModeControl_ : (LimpModeControl) singleFieldBuilderV5.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    settings.lightLevelUpdatesEnabled_ = this.lightLevelUpdatesEnabled_;
                    i14 |= 16;
                }
                settings.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<AlertSettings, AlertSettings.Builder, AlertSettingsOrBuilder> getBlindSpotAlertsFieldBuilder() {
                if (this.blindSpotAlertsBuilder_ == null) {
                    this.blindSpotAlertsBuilder_ = new SingleFieldBuilderV3<>(getBlindSpotAlerts(), getParentForChildren(), isClean());
                    this.blindSpotAlerts_ = null;
                }
                return this.blindSpotAlertsBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRadarProto.internal_static_GDI_Proto_Radar_Settings_descriptor;
            }

            private SingleFieldBuilderV3<LimpModeControl, LimpModeControl.Builder, LimpModeControlOrBuilder> getLimpModeControlFieldBuilder() {
                if (this.limpModeControlBuilder_ == null) {
                    this.limpModeControlBuilder_ = new SingleFieldBuilderV3<>(getLimpModeControl(), getParentForChildren(), isClean());
                    this.limpModeControl_ = null;
                }
                return this.limpModeControlBuilder_;
            }

            private SingleFieldBuilderV3<AlertSettings, AlertSettings.Builder, AlertSettingsOrBuilder> getRearAlertsFieldBuilder() {
                if (this.rearAlertsBuilder_ == null) {
                    this.rearAlertsBuilder_ = new SingleFieldBuilderV3<>(getRearAlerts(), getParentForChildren(), isClean());
                    this.rearAlerts_ = null;
                }
                return this.rearAlertsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getBlindSpotAlertsFieldBuilder();
                    getRearAlertsFieldBuilder();
                    getLimpModeControlFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Settings build() {
                Settings settingsBuildPartial = buildPartial();
                if (settingsBuildPartial.isInitialized()) {
                    return settingsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) settingsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Settings buildPartial() {
                Settings settings = new Settings(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(settings);
                }
                onBuilt();
                return settings;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.blindSpotAlerts_ = null;
                SingleFieldBuilderV3<AlertSettings, AlertSettings.Builder, AlertSettingsOrBuilder> singleFieldBuilderV3 = this.blindSpotAlertsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.blindSpotAlertsBuilder_ = null;
                }
                this.rearAlerts_ = null;
                SingleFieldBuilderV3<AlertSettings, AlertSettings.Builder, AlertSettingsOrBuilder> singleFieldBuilderV4 = this.rearAlertsBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.rearAlertsBuilder_ = null;
                }
                this.demoModeActive_ = false;
                this.limpModeControl_ = null;
                SingleFieldBuilderV3<LimpModeControl, LimpModeControl.Builder, LimpModeControlOrBuilder> singleFieldBuilderV5 = this.limpModeControlBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.limpModeControlBuilder_ = null;
                }
                this.lightLevelUpdatesEnabled_ = false;
                return this;
            }

            public Builder clearBlindSpotAlerts() {
                this.bitField0_ &= -2;
                this.blindSpotAlerts_ = null;
                SingleFieldBuilderV3<AlertSettings, AlertSettings.Builder, AlertSettingsOrBuilder> singleFieldBuilderV3 = this.blindSpotAlertsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.blindSpotAlertsBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearDemoModeActive() {
                this.bitField0_ &= -5;
                this.demoModeActive_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLightLevelUpdatesEnabled() {
                this.bitField0_ &= -17;
                this.lightLevelUpdatesEnabled_ = false;
                onChanged();
                return this;
            }

            public Builder clearLimpModeControl() {
                this.bitField0_ &= -9;
                this.limpModeControl_ = null;
                SingleFieldBuilderV3<LimpModeControl, LimpModeControl.Builder, LimpModeControlOrBuilder> singleFieldBuilderV3 = this.limpModeControlBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.limpModeControlBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearRearAlerts() {
                this.bitField0_ &= -3;
                this.rearAlerts_ = null;
                SingleFieldBuilderV3<AlertSettings, AlertSettings.Builder, AlertSettingsOrBuilder> singleFieldBuilderV3 = this.rearAlertsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.rearAlertsBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.SettingsOrBuilder
            public AlertSettings getBlindSpotAlerts() {
                SingleFieldBuilderV3<AlertSettings, AlertSettings.Builder, AlertSettingsOrBuilder> singleFieldBuilderV3 = this.blindSpotAlertsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlertSettings) singleFieldBuilderV3.getMessage();
                }
                AlertSettings alertSettings = this.blindSpotAlerts_;
                return alertSettings == null ? AlertSettings.getDefaultInstance() : alertSettings;
            }

            public AlertSettings.Builder getBlindSpotAlertsBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (AlertSettings.Builder) getBlindSpotAlertsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.SettingsOrBuilder
            public AlertSettingsOrBuilder getBlindSpotAlertsOrBuilder() {
                SingleFieldBuilderV3<AlertSettings, AlertSettings.Builder, AlertSettingsOrBuilder> singleFieldBuilderV3 = this.blindSpotAlertsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlertSettingsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AlertSettings alertSettings = this.blindSpotAlerts_;
                return alertSettings == null ? AlertSettings.getDefaultInstance() : alertSettings;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.SettingsOrBuilder
            public boolean getDemoModeActive() {
                return this.demoModeActive_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIRadarProto.internal_static_GDI_Proto_Radar_Settings_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.SettingsOrBuilder
            public boolean getLightLevelUpdatesEnabled() {
                return this.lightLevelUpdatesEnabled_;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.SettingsOrBuilder
            public LimpModeControl getLimpModeControl() {
                SingleFieldBuilderV3<LimpModeControl, LimpModeControl.Builder, LimpModeControlOrBuilder> singleFieldBuilderV3 = this.limpModeControlBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LimpModeControl) singleFieldBuilderV3.getMessage();
                }
                LimpModeControl limpModeControl = this.limpModeControl_;
                return limpModeControl == null ? LimpModeControl.getDefaultInstance() : limpModeControl;
            }

            public LimpModeControl.Builder getLimpModeControlBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (LimpModeControl.Builder) getLimpModeControlFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.SettingsOrBuilder
            public LimpModeControlOrBuilder getLimpModeControlOrBuilder() {
                SingleFieldBuilderV3<LimpModeControl, LimpModeControl.Builder, LimpModeControlOrBuilder> singleFieldBuilderV3 = this.limpModeControlBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LimpModeControlOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LimpModeControl limpModeControl = this.limpModeControl_;
                return limpModeControl == null ? LimpModeControl.getDefaultInstance() : limpModeControl;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.SettingsOrBuilder
            public AlertSettings getRearAlerts() {
                SingleFieldBuilderV3<AlertSettings, AlertSettings.Builder, AlertSettingsOrBuilder> singleFieldBuilderV3 = this.rearAlertsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlertSettings) singleFieldBuilderV3.getMessage();
                }
                AlertSettings alertSettings = this.rearAlerts_;
                return alertSettings == null ? AlertSettings.getDefaultInstance() : alertSettings;
            }

            public AlertSettings.Builder getRearAlertsBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (AlertSettings.Builder) getRearAlertsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.SettingsOrBuilder
            public AlertSettingsOrBuilder getRearAlertsOrBuilder() {
                SingleFieldBuilderV3<AlertSettings, AlertSettings.Builder, AlertSettingsOrBuilder> singleFieldBuilderV3 = this.rearAlertsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AlertSettingsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AlertSettings alertSettings = this.rearAlerts_;
                return alertSettings == null ? AlertSettings.getDefaultInstance() : alertSettings;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.SettingsOrBuilder
            public boolean hasBlindSpotAlerts() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.SettingsOrBuilder
            public boolean hasDemoModeActive() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.SettingsOrBuilder
            public boolean hasLightLevelUpdatesEnabled() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.SettingsOrBuilder
            public boolean hasLimpModeControl() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.SettingsOrBuilder
            public boolean hasRearAlerts() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRadarProto.internal_static_GDI_Proto_Radar_Settings_fieldAccessorTable.ensureFieldAccessorsInitialized(Settings.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeBlindSpotAlerts(AlertSettings alertSettings) {
                AlertSettings alertSettings2;
                SingleFieldBuilderV3<AlertSettings, AlertSettings.Builder, AlertSettingsOrBuilder> singleFieldBuilderV3 = this.blindSpotAlertsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(alertSettings);
                } else if ((this.bitField0_ & 1) == 0 || (alertSettings2 = this.blindSpotAlerts_) == null || alertSettings2 == AlertSettings.getDefaultInstance()) {
                    this.blindSpotAlerts_ = alertSettings;
                } else {
                    getBlindSpotAlertsBuilder().mergeFrom(alertSettings);
                }
                if (this.blindSpotAlerts_ != null) {
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
                                    codedInputStream.readMessage(getBlindSpotAlertsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getRearAlertsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.demoModeActive_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getLimpModeControlFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.lightLevelUpdatesEnabled_ = codedInputStream.readBool();
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

            public Builder mergeLimpModeControl(LimpModeControl limpModeControl) {
                LimpModeControl limpModeControl2;
                SingleFieldBuilderV3<LimpModeControl, LimpModeControl.Builder, LimpModeControlOrBuilder> singleFieldBuilderV3 = this.limpModeControlBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(limpModeControl);
                } else if ((this.bitField0_ & 8) == 0 || (limpModeControl2 = this.limpModeControl_) == null || limpModeControl2 == LimpModeControl.getDefaultInstance()) {
                    this.limpModeControl_ = limpModeControl;
                } else {
                    getLimpModeControlBuilder().mergeFrom(limpModeControl);
                }
                if (this.limpModeControl_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeRearAlerts(AlertSettings alertSettings) {
                AlertSettings alertSettings2;
                SingleFieldBuilderV3<AlertSettings, AlertSettings.Builder, AlertSettingsOrBuilder> singleFieldBuilderV3 = this.rearAlertsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(alertSettings);
                } else if ((this.bitField0_ & 2) == 0 || (alertSettings2 = this.rearAlerts_) == null || alertSettings2 == AlertSettings.getDefaultInstance()) {
                    this.rearAlerts_ = alertSettings;
                } else {
                    getRearAlertsBuilder().mergeFrom(alertSettings);
                }
                if (this.rearAlerts_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setBlindSpotAlerts(AlertSettings.Builder builder) {
                SingleFieldBuilderV3<AlertSettings, AlertSettings.Builder, AlertSettingsOrBuilder> singleFieldBuilderV3 = this.blindSpotAlertsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.blindSpotAlerts_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setDemoModeActive(boolean z14) {
                this.demoModeActive_ = z14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setLightLevelUpdatesEnabled(boolean z14) {
                this.lightLevelUpdatesEnabled_ = z14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setLimpModeControl(LimpModeControl.Builder builder) {
                SingleFieldBuilderV3<LimpModeControl, LimpModeControl.Builder, LimpModeControlOrBuilder> singleFieldBuilderV3 = this.limpModeControlBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.limpModeControl_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setRearAlerts(AlertSettings.Builder builder) {
                SingleFieldBuilderV3<AlertSettings, AlertSettings.Builder, AlertSettingsOrBuilder> singleFieldBuilderV3 = this.rearAlertsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.rearAlerts_ = builder.build();
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
            public Settings getDefaultInstanceForType() {
                return Settings.getDefaultInstance();
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

            public Builder setBlindSpotAlerts(AlertSettings alertSettings) {
                SingleFieldBuilderV3<AlertSettings, AlertSettings.Builder, AlertSettingsOrBuilder> singleFieldBuilderV3 = this.blindSpotAlertsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    alertSettings.getClass();
                    this.blindSpotAlerts_ = alertSettings;
                } else {
                    singleFieldBuilderV3.setMessage(alertSettings);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setLimpModeControl(LimpModeControl limpModeControl) {
                SingleFieldBuilderV3<LimpModeControl, LimpModeControl.Builder, LimpModeControlOrBuilder> singleFieldBuilderV3 = this.limpModeControlBuilder_;
                if (singleFieldBuilderV3 == null) {
                    limpModeControl.getClass();
                    this.limpModeControl_ = limpModeControl;
                } else {
                    singleFieldBuilderV3.setMessage(limpModeControl);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setRearAlerts(AlertSettings alertSettings) {
                SingleFieldBuilderV3<AlertSettings, AlertSettings.Builder, AlertSettingsOrBuilder> singleFieldBuilderV3 = this.rearAlertsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    alertSettings.getClass();
                    this.rearAlerts_ = alertSettings;
                } else {
                    singleFieldBuilderV3.setMessage(alertSettings);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Settings) {
                    return mergeFrom((Settings) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Settings settings) {
                if (settings == Settings.getDefaultInstance()) {
                    return this;
                }
                if (settings.hasBlindSpotAlerts()) {
                    mergeBlindSpotAlerts(settings.getBlindSpotAlerts());
                }
                if (settings.hasRearAlerts()) {
                    mergeRearAlerts(settings.getRearAlerts());
                }
                if (settings.hasDemoModeActive()) {
                    setDemoModeActive(settings.getDemoModeActive());
                }
                if (settings.hasLimpModeControl()) {
                    mergeLimpModeControl(settings.getLimpModeControl());
                }
                if (settings.hasLightLevelUpdatesEnabled()) {
                    setLightLevelUpdatesEnabled(settings.getLightLevelUpdatesEnabled());
                }
                mergeUnknownFields(settings.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Settings getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static Settings parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Settings) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Settings parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Settings parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Settings parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ Settings(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Settings parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private Settings() {
            this.demoModeActive_ = false;
            this.lightLevelUpdatesEnabled_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Settings parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Settings parseFrom(InputStream inputStream) {
            return (Settings) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Settings parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Settings) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Settings parseFrom(CodedInputStream codedInputStream) {
            return (Settings) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Settings parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Settings) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SettingsChangeDetails extends GeneratedMessageV3 implements SettingsChangeDetailsOrBuilder {
        public static final int DETAILS_FIELD_NUMBER = 1011;
        public static final int LIGHT_LEVEL_FIELD_NUMBER = 2;
        public static final int SETTINGS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int lightLevel_;
        private byte memoizedIsInitialized;
        private Settings settings_;
        private static final SettingsChangeDetails DEFAULT_INSTANCE = new SettingsChangeDetails();

        @Deprecated
        public static final Parser<SettingsChangeDetails> PARSER = new AbstractParser<SettingsChangeDetails>() { // from class: com.garmin.proto.generated.GDIRadarProto.SettingsChangeDetails.1
            @Override // com.google.protobuf.Parser
            public SettingsChangeDetails parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SettingsChangeDetails.newBuilder();
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
        public static final GeneratedMessage.GeneratedExtension<GDIEventSharingProto.AlertNotification, SettingsChangeDetails> details = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, SettingsChangeDetails.class, getDefaultInstance());

        private SettingsChangeDetails(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.lightLevel_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SettingsChangeDetails getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRadarProto.internal_static_GDI_Proto_Radar_SettingsChangeDetails_descriptor;
        }

        public static Builder newBuilder(SettingsChangeDetails settingsChangeDetails) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(settingsChangeDetails);
        }

        public static SettingsChangeDetails parseDelimitedFrom(InputStream inputStream) {
            return (SettingsChangeDetails) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SettingsChangeDetails parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SettingsChangeDetails> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SettingsChangeDetails)) {
                return super.equals(obj);
            }
            SettingsChangeDetails settingsChangeDetails = (SettingsChangeDetails) obj;
            if (hasSettings() != settingsChangeDetails.hasSettings()) {
                return false;
            }
            if ((!hasSettings() || getSettings().equals(settingsChangeDetails.getSettings())) && hasLightLevel() == settingsChangeDetails.hasLightLevel()) {
                return (!hasLightLevel() || this.lightLevel_ == settingsChangeDetails.lightLevel_) && getUnknownFields().equals(settingsChangeDetails.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.SettingsChangeDetailsOrBuilder
        public LightLevel getLightLevel() {
            LightLevel lightLevelForNumber = LightLevel.forNumber(this.lightLevel_);
            return lightLevelForNumber == null ? LightLevel.DAY : lightLevelForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SettingsChangeDetails> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getSettings()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(2, this.lightLevel_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.SettingsChangeDetailsOrBuilder
        public Settings getSettings() {
            Settings settings = this.settings_;
            return settings == null ? Settings.getDefaultInstance() : settings;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.SettingsChangeDetailsOrBuilder
        public SettingsOrBuilder getSettingsOrBuilder() {
            Settings settings = this.settings_;
            return settings == null ? Settings.getDefaultInstance() : settings;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.SettingsChangeDetailsOrBuilder
        public boolean hasLightLevel() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.SettingsChangeDetailsOrBuilder
        public boolean hasSettings() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSettings()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSettings().hashCode();
            }
            if (hasLightLevel()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.lightLevel_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRadarProto.internal_static_GDI_Proto_Radar_SettingsChangeDetails_fieldAccessorTable.ensureFieldAccessorsInitialized(SettingsChangeDetails.class, Builder.class);
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
            return new SettingsChangeDetails();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getSettings());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.lightLevel_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SettingsChangeDetailsOrBuilder {
            private int bitField0_;
            private int lightLevel_;
            private SingleFieldBuilderV3<Settings, Settings.Builder, SettingsOrBuilder> settingsBuilder_;
            private Settings settings_;

            private Builder() {
                this.lightLevel_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(SettingsChangeDetails settingsChangeDetails) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<Settings, Settings.Builder, SettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                    settingsChangeDetails.settings_ = singleFieldBuilderV3 == null ? this.settings_ : (Settings) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    settingsChangeDetails.lightLevel_ = this.lightLevel_;
                    i14 |= 2;
                }
                settingsChangeDetails.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRadarProto.internal_static_GDI_Proto_Radar_SettingsChangeDetails_descriptor;
            }

            private SingleFieldBuilderV3<Settings, Settings.Builder, SettingsOrBuilder> getSettingsFieldBuilder() {
                if (this.settingsBuilder_ == null) {
                    this.settingsBuilder_ = new SingleFieldBuilderV3<>(getSettings(), getParentForChildren(), isClean());
                    this.settings_ = null;
                }
                return this.settingsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSettingsFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SettingsChangeDetails build() {
                SettingsChangeDetails settingsChangeDetailsBuildPartial = buildPartial();
                if (settingsChangeDetailsBuildPartial.isInitialized()) {
                    return settingsChangeDetailsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) settingsChangeDetailsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SettingsChangeDetails buildPartial() {
                SettingsChangeDetails settingsChangeDetails = new SettingsChangeDetails(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(settingsChangeDetails);
                }
                onBuilt();
                return settingsChangeDetails;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.settings_ = null;
                SingleFieldBuilderV3<Settings, Settings.Builder, SettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.settingsBuilder_ = null;
                }
                this.lightLevel_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLightLevel() {
                this.bitField0_ &= -3;
                this.lightLevel_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSettings() {
                this.bitField0_ &= -2;
                this.settings_ = null;
                SingleFieldBuilderV3<Settings, Settings.Builder, SettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.settingsBuilder_ = null;
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
                return GDIRadarProto.internal_static_GDI_Proto_Radar_SettingsChangeDetails_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.SettingsChangeDetailsOrBuilder
            public LightLevel getLightLevel() {
                LightLevel lightLevelForNumber = LightLevel.forNumber(this.lightLevel_);
                return lightLevelForNumber == null ? LightLevel.DAY : lightLevelForNumber;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.SettingsChangeDetailsOrBuilder
            public Settings getSettings() {
                SingleFieldBuilderV3<Settings, Settings.Builder, SettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (Settings) singleFieldBuilderV3.getMessage();
                }
                Settings settings = this.settings_;
                return settings == null ? Settings.getDefaultInstance() : settings;
            }

            public Settings.Builder getSettingsBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (Settings.Builder) getSettingsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.SettingsChangeDetailsOrBuilder
            public SettingsOrBuilder getSettingsOrBuilder() {
                SingleFieldBuilderV3<Settings, Settings.Builder, SettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SettingsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                Settings settings = this.settings_;
                return settings == null ? Settings.getDefaultInstance() : settings;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.SettingsChangeDetailsOrBuilder
            public boolean hasLightLevel() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.SettingsChangeDetailsOrBuilder
            public boolean hasSettings() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRadarProto.internal_static_GDI_Proto_Radar_SettingsChangeDetails_fieldAccessorTable.ensureFieldAccessorsInitialized(SettingsChangeDetails.class, Builder.class);
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
                                    codedInputStream.readMessage(getSettingsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (LightLevel.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.lightLevel_ = i14;
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

            public Builder mergeSettings(Settings settings) {
                Settings settings2;
                SingleFieldBuilderV3<Settings, Settings.Builder, SettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(settings);
                } else if ((this.bitField0_ & 1) == 0 || (settings2 = this.settings_) == null || settings2 == Settings.getDefaultInstance()) {
                    this.settings_ = settings;
                } else {
                    getSettingsBuilder().mergeFrom(settings);
                }
                if (this.settings_ != null) {
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

            public Builder setLightLevel(LightLevel lightLevel) {
                lightLevel.getClass();
                this.bitField0_ |= 2;
                this.lightLevel_ = lightLevel.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSettings(Settings.Builder builder) {
                SingleFieldBuilderV3<Settings, Settings.Builder, SettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.settings_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SettingsChangeDetails getDefaultInstanceForType() {
                return SettingsChangeDetails.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.lightLevel_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setSettings(Settings settings) {
                SingleFieldBuilderV3<Settings, Settings.Builder, SettingsOrBuilder> singleFieldBuilderV3 = this.settingsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    settings.getClass();
                    this.settings_ = settings;
                } else {
                    singleFieldBuilderV3.setMessage(settings);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SettingsChangeDetails) {
                    return mergeFrom((SettingsChangeDetails) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SettingsChangeDetails settingsChangeDetails) {
                if (settingsChangeDetails == SettingsChangeDetails.getDefaultInstance()) {
                    return this;
                }
                if (settingsChangeDetails.hasSettings()) {
                    mergeSettings(settingsChangeDetails.getSettings());
                }
                if (settingsChangeDetails.hasLightLevel()) {
                    setLightLevel(settingsChangeDetails.getLightLevel());
                }
                mergeUnknownFields(settingsChangeDetails.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SettingsChangeDetails getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SettingsChangeDetails parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SettingsChangeDetails) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SettingsChangeDetails parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ SettingsChangeDetails(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SettingsChangeDetails parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SettingsChangeDetails() {
            this.memoizedIsInitialized = (byte) -1;
            this.lightLevel_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SettingsChangeDetails parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SettingsChangeDetails parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SettingsChangeDetails parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SettingsChangeDetails parseFrom(InputStream inputStream) {
            return (SettingsChangeDetails) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SettingsChangeDetails parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SettingsChangeDetails) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SettingsChangeDetails parseFrom(CodedInputStream codedInputStream) {
            return (SettingsChangeDetails) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SettingsChangeDetails parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SettingsChangeDetails) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class TestModeRequest extends GeneratedMessageV3 implements TestModeRequestOrBuilder {
        private static final TestModeRequest DEFAULT_INSTANCE = new TestModeRequest();

        @Deprecated
        public static final Parser<TestModeRequest> PARSER = new AbstractParser<TestModeRequest>() { // from class: com.garmin.proto.generated.GDIRadarProto.TestModeRequest.1
            @Override // com.google.protobuf.Parser
            public TestModeRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TestModeRequest.newBuilder();
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
        public static final int STATE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int state_;

        private TestModeRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.state_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TestModeRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRadarProto.internal_static_GDI_Proto_Radar_TestModeRequest_descriptor;
        }

        public static Builder newBuilder(TestModeRequest testModeRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(testModeRequest);
        }

        public static TestModeRequest parseDelimitedFrom(InputStream inputStream) {
            return (TestModeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TestModeRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TestModeRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TestModeRequest)) {
                return super.equals(obj);
            }
            TestModeRequest testModeRequest = (TestModeRequest) obj;
            if (hasState() != testModeRequest.hasState()) {
                return false;
            }
            return (!hasState() || this.state_ == testModeRequest.state_) && getUnknownFields().equals(testModeRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TestModeRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(2, this.state_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.TestModeRequestOrBuilder
        public TestModeState getState() {
            TestModeState testModeStateForNumber = TestModeState.forNumber(this.state_);
            return testModeStateForNumber == null ? TestModeState.OFF : testModeStateForNumber;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.TestModeRequestOrBuilder
        public boolean hasState() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasState()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.state_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRadarProto.internal_static_GDI_Proto_Radar_TestModeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(TestModeRequest.class, Builder.class);
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
            return new TestModeRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(2, this.state_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TestModeRequestOrBuilder {
            private int bitField0_;
            private int state_;

            private Builder() {
                this.state_ = 0;
            }

            private void buildPartial0(TestModeRequest testModeRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    testModeRequest.state_ = this.state_;
                } else {
                    i14 = 0;
                }
                testModeRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRadarProto.internal_static_GDI_Proto_Radar_TestModeRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TestModeRequest build() {
                TestModeRequest testModeRequestBuildPartial = buildPartial();
                if (testModeRequestBuildPartial.isInitialized()) {
                    return testModeRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) testModeRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TestModeRequest buildPartial() {
                TestModeRequest testModeRequest = new TestModeRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(testModeRequest);
                }
                onBuilt();
                return testModeRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.state_ = 0;
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

            public Builder clearState() {
                this.bitField0_ &= -2;
                this.state_ = 0;
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
                return GDIRadarProto.internal_static_GDI_Proto_Radar_TestModeRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.TestModeRequestOrBuilder
            public TestModeState getState() {
                TestModeState testModeStateForNumber = TestModeState.forNumber(this.state_);
                return testModeStateForNumber == null ? TestModeState.OFF : testModeStateForNumber;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.TestModeRequestOrBuilder
            public boolean hasState() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRadarProto.internal_static_GDI_Proto_Radar_TestModeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(TestModeRequest.class, Builder.class);
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
                                if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (TestModeState.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.state_ = i14;
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

            public Builder setState(TestModeState testModeState) {
                testModeState.getClass();
                this.bitField0_ |= 1;
                this.state_ = testModeState.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public TestModeRequest getDefaultInstanceForType() {
                return TestModeRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.state_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TestModeRequest) {
                    return mergeFrom((TestModeRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TestModeRequest testModeRequest) {
                if (testModeRequest == TestModeRequest.getDefaultInstance()) {
                    return this;
                }
                if (testModeRequest.hasState()) {
                    setState(testModeRequest.getState());
                }
                mergeUnknownFields(testModeRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TestModeRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static TestModeRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TestModeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TestModeRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ TestModeRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static TestModeRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private TestModeRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.state_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TestModeRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TestModeRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static TestModeRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static TestModeRequest parseFrom(InputStream inputStream) {
            return (TestModeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static TestModeRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TestModeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TestModeRequest parseFrom(CodedInputStream codedInputStream) {
            return (TestModeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TestModeRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TestModeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum TestModeState implements ProtocolMessageEnum {
            OFF(0),
            LEFT_LIGHTS(1),
            REAR_LIGHTS(2),
            RIGHT_LIGHTS(3);

            public static final int LEFT_LIGHTS_VALUE = 1;
            public static final int OFF_VALUE = 0;
            public static final int REAR_LIGHTS_VALUE = 2;
            public static final int RIGHT_LIGHTS_VALUE = 3;
            private final int value;
            private static final Internal.EnumLiteMap<TestModeState> internalValueMap = new Internal.EnumLiteMap<TestModeState>() { // from class: com.garmin.proto.generated.GDIRadarProto.TestModeRequest.TestModeState.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public TestModeState findValueByNumber(int i14) {
                    return TestModeState.forNumber(i14);
                }
            };
            private static final TestModeState[] VALUES = values();

            TestModeState(int i14) {
                this.value = i14;
            }

            public static TestModeState forNumber(int i14) {
                if (i14 == 0) {
                    return OFF;
                }
                if (i14 == 1) {
                    return LEFT_LIGHTS;
                }
                if (i14 == 2) {
                    return REAR_LIGHTS;
                }
                if (i14 != 3) {
                    return null;
                }
                return RIGHT_LIGHTS;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return TestModeRequest.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<TestModeState> internalGetValueMap() {
                return internalValueMap;
            }

            public static TestModeState valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static TestModeState valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class TestModeResponse extends GeneratedMessageV3 implements TestModeResponseOrBuilder {
        private static final TestModeResponse DEFAULT_INSTANCE = new TestModeResponse();

        @Deprecated
        public static final Parser<TestModeResponse> PARSER = new AbstractParser<TestModeResponse>() { // from class: com.garmin.proto.generated.GDIRadarProto.TestModeResponse.1
            @Override // com.google.protobuf.Parser
            public TestModeResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TestModeResponse.newBuilder();
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

        private TestModeResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TestModeResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRadarProto.internal_static_GDI_Proto_Radar_TestModeResponse_descriptor;
        }

        public static Builder newBuilder(TestModeResponse testModeResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(testModeResponse);
        }

        public static TestModeResponse parseDelimitedFrom(InputStream inputStream) {
            return (TestModeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TestModeResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TestModeResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TestModeResponse)) {
                return super.equals(obj);
            }
            TestModeResponse testModeResponse = (TestModeResponse) obj;
            if (hasStatus() != testModeResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == testModeResponse.status_) && getUnknownFields().equals(testModeResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TestModeResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIRadarProto.TestModeResponseOrBuilder
        public TestModeStatus getStatus() {
            TestModeStatus testModeStatusForNumber = TestModeStatus.forNumber(this.status_);
            return testModeStatusForNumber == null ? TestModeStatus.SUCCESS : testModeStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIRadarProto.TestModeResponseOrBuilder
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
            return GDIRadarProto.internal_static_GDI_Proto_Radar_TestModeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(TestModeResponse.class, Builder.class);
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
            return new TestModeResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TestModeResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(TestModeResponse testModeResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    testModeResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                testModeResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRadarProto.internal_static_GDI_Proto_Radar_TestModeResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TestModeResponse build() {
                TestModeResponse testModeResponseBuildPartial = buildPartial();
                if (testModeResponseBuildPartial.isInitialized()) {
                    return testModeResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) testModeResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TestModeResponse buildPartial() {
                TestModeResponse testModeResponse = new TestModeResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(testModeResponse);
                }
                onBuilt();
                return testModeResponse;
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
                return GDIRadarProto.internal_static_GDI_Proto_Radar_TestModeResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.TestModeResponseOrBuilder
            public TestModeStatus getStatus() {
                TestModeStatus testModeStatusForNumber = TestModeStatus.forNumber(this.status_);
                return testModeStatusForNumber == null ? TestModeStatus.SUCCESS : testModeStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIRadarProto.TestModeResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRadarProto.internal_static_GDI_Proto_Radar_TestModeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(TestModeResponse.class, Builder.class);
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
                                    if (TestModeStatus.forNumber(i14) == null) {
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

            public Builder setStatus(TestModeStatus testModeStatus) {
                testModeStatus.getClass();
                this.bitField0_ |= 1;
                this.status_ = testModeStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public TestModeResponse getDefaultInstanceForType() {
                return TestModeResponse.getDefaultInstance();
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
                if (message instanceof TestModeResponse) {
                    return mergeFrom((TestModeResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TestModeResponse testModeResponse) {
                if (testModeResponse == TestModeResponse.getDefaultInstance()) {
                    return this;
                }
                if (testModeResponse.hasStatus()) {
                    setStatus(testModeResponse.getStatus());
                }
                mergeUnknownFields(testModeResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TestModeResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static TestModeResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TestModeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TestModeResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ TestModeResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static TestModeResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private TestModeResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TestModeResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TestModeResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static TestModeResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static TestModeResponse parseFrom(InputStream inputStream) {
            return (TestModeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static TestModeResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TestModeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TestModeResponse parseFrom(CodedInputStream codedInputStream) {
            return (TestModeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TestModeResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TestModeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum TestModeStatus implements ProtocolMessageEnum {
            SUCCESS(0),
            UNKNOWN_ERROR(1);

            public static final int SUCCESS_VALUE = 0;
            public static final int UNKNOWN_ERROR_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<TestModeStatus> internalValueMap = new Internal.EnumLiteMap<TestModeStatus>() { // from class: com.garmin.proto.generated.GDIRadarProto.TestModeResponse.TestModeStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public TestModeStatus findValueByNumber(int i14) {
                    return TestModeStatus.forNumber(i14);
                }
            };
            private static final TestModeStatus[] VALUES = values();

            TestModeStatus(int i14) {
                this.value = i14;
            }

            public static TestModeStatus forNumber(int i14) {
                if (i14 == 0) {
                    return SUCCESS;
                }
                if (i14 != 1) {
                    return null;
                }
                return UNKNOWN_ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return TestModeResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<TestModeStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static TestModeStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static TestModeStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public enum LightLevel implements ProtocolMessageEnum {
        DAY(0),
        VERY_HIGH(1),
        HIGH(2),
        MED(3),
        LOW(4),
        DARK(5);

        public static final int DARK_VALUE = 5;
        public static final int DAY_VALUE = 0;
        public static final int HIGH_VALUE = 2;
        public static final int LOW_VALUE = 4;
        public static final int MED_VALUE = 3;
        public static final int VERY_HIGH_VALUE = 1;
        private final int value;
        private static final Internal.EnumLiteMap<LightLevel> internalValueMap = new Internal.EnumLiteMap<LightLevel>() { // from class: com.garmin.proto.generated.GDIRadarProto.LightLevel.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public LightLevel findValueByNumber(int i14) {
                return LightLevel.forNumber(i14);
            }
        };
        private static final LightLevel[] VALUES = values();

        LightLevel(int i14) {
            this.value = i14;
        }

        public static LightLevel forNumber(int i14) {
            if (i14 == 0) {
                return DAY;
            }
            if (i14 == 1) {
                return VERY_HIGH;
            }
            if (i14 == 2) {
                return HIGH;
            }
            if (i14 == 3) {
                return MED;
            }
            if (i14 == 4) {
                return LOW;
            }
            if (i14 != 5) {
                return null;
            }
            return DARK;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIRadarProto.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<LightLevel> internalGetValueMap() {
            return internalValueMap;
        }

        public static LightLevel valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static LightLevel valueOf(int i14) {
            return forNumber(i14);
        }
    }
}
