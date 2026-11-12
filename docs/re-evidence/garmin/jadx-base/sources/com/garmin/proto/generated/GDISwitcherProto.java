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

/* JADX INFO: loaded from: classes13.dex */
public final class GDISwitcherProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0011GDISwitcher.proto\u0012\u0012GDI.Proto.Switcher\u001a\u0015GDIEventSharing.proto\"Ö\u0003\n\bSwitcher\u0012A\n\u000estatus_request\u0018\u0001 \u0001(\u000b2).GDI.Proto.Switcher.SwitcherStatusRequest\u0012C\n\u000fstatus_response\u0018\u0002 \u0001(\u000b2*.GDI.Proto.Switcher.SwitcherStatusResponse\u0012P\n\u0015status_change_request\u0018\u0003 \u0001(\u000b21.GDI.Proto.Switcher.SwitcherSettingsChangeRequest\u0012R\n\u0016status_change_response\u0018\u0004 \u0001(\u000b22.GDI.Proto.Switcher.SwitcherSettingsChangeResponse\u0012L\n\u0018restore_defaults_request\u0018\u0005 \u0001(\u000b2*.GDI.Proto.Switcher.RestoreDefaultsRequest\u0012N\n\u0019restore_defaults_response\u0018\u0006 \u0001(\u000b2+.GDI.Proto.Switcher.RestoreDefaultsResponse\"\u0017\n\u0015SwitcherStatusRequest\"\u0094\u0001\n\u0016SwitcherStatusResponse\u0012?\n\u0011switcher_settings\u0018\u0001 \u0001(\u000b2$.GDI.Proto.Switcher.SwitcherSettings\u00129\n\u000eswitcher_state\u0018\u0002 \u0001(\u000b2!.GDI.Proto.Switcher.SwitcherState\"\u0018\n\u0016RestoreDefaultsRequest\"¥\u0001\n\u0017RestoreDefaultsResponse\u0012Q\n\u0006status\u0018\u0001 \u0001(\u000e2A.GDI.Proto.Switcher.RestoreDefaultsResponse.RestoreDefaultsStatus\"7\n\u0015RestoreDefaultsStatus\u0012\u000b\n\u0007SUCCESS\u0010\u0000\u0012\u0011\n\rUNKNOWN_ERROR\u0010\u0001\"\u009b\u0001\n\u001dSwitcherSettingsChangeRequest\u0012?\n\u0011switcher_settings\u0018\u0001 \u0001(\u000b2$.GDI.Proto.Switcher.SwitcherSettings\u00129\n\u000eswitcher_state\u0018\u0002 \u0001(\u000b2!.GDI.Proto.Switcher.SwitcherState\"±\u0001\n\u001eSwitcherSettingsChangeResponse\u0012W\n\u0006status\u0018\u0001 \u0001(\u000e2G.GDI.Proto.Switcher.SwitcherSettingsChangeResponse.SettingsChangeStatus\"6\n\u0014SettingsChangeStatus\u0012\u000b\n\u0007SUCCESS\u0010\u0000\u0012\u0011\n\rUNKNOWN_ERROR\u0010\u0001\"\u0090\u0002\n\u001bSwitcherStatusChangeDetails\u0012?\n\u0011switcher_settings\u0018\u0001 \u0001(\u000b2$.GDI.Proto.Switcher.SwitcherSettings\u00129\n\u000eswitcher_state\u0018\u0002 \u0001(\u000b2!.GDI.Proto.Switcher.SwitcherState2u\n\u0010switcher_details\u0012).GDI.Proto.EventSharing.AlertNotification\u0018è\u0007 \u0001(\u000b2/.GDI.Proto.Switcher.SwitcherStatusChangeDetails\"ç\u0001\n\u0010SwitcherSettings\u0012;\n\u000fswitch_settings\u0018\u0001 \u0003(\u000b2\".GDI.Proto.Switcher.SwitchSettings\u0012;\n\u000fcustom_settings\u0018\u0002 \u0003(\u000b2\".GDI.Proto.Switcher.SwitchSettings\u00129\n\u000einput_settings\u0018\u0003 \u0003(\u000b2!.GDI.Proto.Switcher.InputSettings\u0012\u0010\n\bauto_off\u0018\u0004 \u0001(\b\u0012\f\n\u0004name\u0018\u0005 \u0001(\t\"Ç\u0001\n\rSwitcherState\u0012\u0017\n\u000fbattery_voltage\u0018\u0001 \u0001(\u0002\u0012\u001c\n\u0014low_voltage_shutdown\u0018\u0002 \u0001(\b\u0012\u0012\n\noverloaded\u0018\u0003 \u0001(\b\u0012\u0013\n\u000btemperature\u0018\u0004 \u0001(\u0002\u0012\u001e\n\u0016pending_update_version\u0018\u0005 \u0001(\r\u00126\n\rswitch_states\u0018\u0006 \u0003(\u000b2\u001f.GDI.Proto.Switcher.SwitchState\"m\n\u000bSwitchState\u0012\u0011\n\tswitch_id\u0018\u0001 \u0001(\r\u0012\u0016\n\u000eamperage_level\u0018\u0002 \u0001(\u0002\u0012\u000e\n\u0006custom\u0018\u0003 \u0001(\b\u0012\u000f\n\u0007enabled\u0018\u0004 \u0001(\b\u0012\u0012\n\noverloaded\u0018\u0005 \u0001(\b\"ä\u0004\n\u000eSwitchSettings\u0012\u0011\n\tswitch_id\u0018\u0001 \u0001(\r\u0012\u0012\n\nbrightness\u0018\u0002 \u0001(\r\u0012;\n\u0004mode\u0018\u0003 \u0001(\u000e2-.GDI.Proto.Switcher.SwitchSettings.SwitchMode\u0012\u0011\n\ton_period\u0018\u0004 \u0001(\r\u0012\u0012\n\noff_period\u0018\u0005 \u0001(\r\u0012\f\n\u0004name\u0018d \u0001(\t\u0012\r\n\u0005color\u0018e \u0001(\r\u0012\f\n\u0004icon\u0018f \u0001(\r\"3\n\nSwitchMode\u0012\n\n\u0006TOGGLE\u0010\u0000\u0012\r\n\tMOMENTARY\u0010\u0001\u0012\n\n\u0006STROBE\u0010\u0002\"æ\u0002\n\u0004Icon\u0012\b\n\u0004NONE\u0010\u0000\u0012\r\n\tHEADLIGHT\u0010\u0001\u0012\u0010\n\fADDT_BATTERY\u0010\u0002\u0012\u0012\n\u000eAIR_COMPRESSOR\u0010\u0003\u0012\f\n\bCB_RADIO\u0010\u0004\u0012\r\n\tDFF_LOCKS\u0010\u0005\u0012\u0007\n\u0003FAN\u0010\u0006\u0012\u0013\n\u000fFLASHING_LIGHTS\u0010\u0007\u0012\r\n\tFOG_LIGHT\u0010\b\u0012\n\n\u0006FRIDGE\u0010\t\u0012\n\n\u0006GAUGES\u0010\n\u0012\u000f\n\u000bHEADLIGHT_R\u0010\u000b\u0012\u0010\n\fHEATED_SEATS\u0010\f\u0012\u000b\n\u0007HEATERS\u0010\r\u0012\u0012\n\u000eINTERIOR_LIGHT\u0010\u000e\u0012\r\n\tLIGHT_BAR\u0010\u000f\u0012\u000f\n\u000bSOLAR_PANEL\u0010\u0010\u0012\f\n\bSPEAKERS\u0010\u0011\u0012\u0010\n\fSTROBE_LIGHT\u0010\u0012\u0012\u0011\n\rUNDERCARRIAGE\u0010\u0013\u0012\u000f\n\u000bUSB_CHARGER\u0010\u0014\u0012\b\n\u0004WIFI\u0010\u0015\u0012\u000b\n\u0007WINCHES\u0010\u0016\"³\u0001\n\rInputSettings\u0012\u0010\n\binput_id\u0018\u0001 \u0001(\r\u0012\f\n\u0004name\u0018\u0002 \u0001(\t\u0012\u000f\n\u0007enabled\u0018\u0003 \u0001(\b\u00127\n\u000erising_actions\u0018\u0004 \u0003(\u000b2\u001f.GDI.Proto.Switcher.InputAction\u00128\n\u000ffalling_actions\u0018\u0005 \u0003(\u000b2\u001f.GDI.Proto.Switcher.InputAction\"\u009c\u0001\n\u000bInputAction\u0012\u0011\n\tswitch_id\u0018\u0001 \u0001(\r\u0012?\n\u000baction_type\u0018\u0002 \u0001(\u000e2*.GDI.Proto.Switcher.InputAction.ActionType\"9\n\nActionType\u0012\r\n\tSWITCH_ON\u0010\u0000\u0012\u000e\n\nSWITCH_OFF\u0010\u0001\u0012\f\n\bDISABLED\u0010\u0002B0\n\u001acom.garmin.proto.generatedB\u0010GDISwitcherProtoH\u0003"}, new Descriptors.FileDescriptor[]{GDIEventSharingProto.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Switcher_InputAction_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Switcher_InputAction_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Switcher_InputSettings_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Switcher_InputSettings_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Switcher_RestoreDefaultsRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Switcher_RestoreDefaultsRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Switcher_RestoreDefaultsResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Switcher_RestoreDefaultsResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Switcher_SwitchSettings_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Switcher_SwitchSettings_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Switcher_SwitchState_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Switcher_SwitchState_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Switcher_SwitcherSettingsChangeRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Switcher_SwitcherSettingsChangeRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Switcher_SwitcherSettingsChangeResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Switcher_SwitcherSettingsChangeResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Switcher_SwitcherSettings_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Switcher_SwitcherSettings_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Switcher_SwitcherState_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Switcher_SwitcherState_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Switcher_SwitcherStatusChangeDetails_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Switcher_SwitcherStatusChangeDetails_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Switcher_SwitcherStatusRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Switcher_SwitcherStatusRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Switcher_SwitcherStatusResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Switcher_SwitcherStatusResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Switcher_Switcher_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Switcher_Switcher_fieldAccessorTable;

    public interface InputActionOrBuilder extends MessageOrBuilder {
        InputAction.ActionType getActionType();

        int getSwitchId();

        boolean hasActionType();

        boolean hasSwitchId();
    }

    public interface InputSettingsOrBuilder extends MessageOrBuilder {
        boolean getEnabled();

        InputAction getFallingActions(int i14);

        int getFallingActionsCount();

        List<InputAction> getFallingActionsList();

        InputActionOrBuilder getFallingActionsOrBuilder(int i14);

        List<? extends InputActionOrBuilder> getFallingActionsOrBuilderList();

        int getInputId();

        String getName();

        ByteString getNameBytes();

        InputAction getRisingActions(int i14);

        int getRisingActionsCount();

        List<InputAction> getRisingActionsList();

        InputActionOrBuilder getRisingActionsOrBuilder(int i14);

        List<? extends InputActionOrBuilder> getRisingActionsOrBuilderList();

        boolean hasEnabled();

        boolean hasInputId();

        boolean hasName();
    }

    public interface RestoreDefaultsRequestOrBuilder extends MessageOrBuilder {
    }

    public interface RestoreDefaultsResponseOrBuilder extends MessageOrBuilder {
        RestoreDefaultsResponse.RestoreDefaultsStatus getStatus();

        boolean hasStatus();
    }

    public interface SwitchSettingsOrBuilder extends MessageOrBuilder {
        int getBrightness();

        int getColor();

        int getIcon();

        SwitchSettings.SwitchMode getMode();

        String getName();

        ByteString getNameBytes();

        int getOffPeriod();

        int getOnPeriod();

        int getSwitchId();

        boolean hasBrightness();

        boolean hasColor();

        boolean hasIcon();

        boolean hasMode();

        boolean hasName();

        boolean hasOffPeriod();

        boolean hasOnPeriod();

        boolean hasSwitchId();
    }

    public interface SwitchStateOrBuilder extends MessageOrBuilder {
        float getAmperageLevel();

        boolean getCustom();

        boolean getEnabled();

        boolean getOverloaded();

        int getSwitchId();

        boolean hasAmperageLevel();

        boolean hasCustom();

        boolean hasEnabled();

        boolean hasOverloaded();

        boolean hasSwitchId();
    }

    public interface SwitcherOrBuilder extends MessageOrBuilder {
        RestoreDefaultsRequest getRestoreDefaultsRequest();

        RestoreDefaultsRequestOrBuilder getRestoreDefaultsRequestOrBuilder();

        RestoreDefaultsResponse getRestoreDefaultsResponse();

        RestoreDefaultsResponseOrBuilder getRestoreDefaultsResponseOrBuilder();

        SwitcherSettingsChangeRequest getStatusChangeRequest();

        SwitcherSettingsChangeRequestOrBuilder getStatusChangeRequestOrBuilder();

        SwitcherSettingsChangeResponse getStatusChangeResponse();

        SwitcherSettingsChangeResponseOrBuilder getStatusChangeResponseOrBuilder();

        SwitcherStatusRequest getStatusRequest();

        SwitcherStatusRequestOrBuilder getStatusRequestOrBuilder();

        SwitcherStatusResponse getStatusResponse();

        SwitcherStatusResponseOrBuilder getStatusResponseOrBuilder();

        boolean hasRestoreDefaultsRequest();

        boolean hasRestoreDefaultsResponse();

        boolean hasStatusChangeRequest();

        boolean hasStatusChangeResponse();

        boolean hasStatusRequest();

        boolean hasStatusResponse();
    }

    public interface SwitcherSettingsChangeRequestOrBuilder extends MessageOrBuilder {
        SwitcherSettings getSwitcherSettings();

        SwitcherSettingsOrBuilder getSwitcherSettingsOrBuilder();

        SwitcherState getSwitcherState();

        SwitcherStateOrBuilder getSwitcherStateOrBuilder();

        boolean hasSwitcherSettings();

        boolean hasSwitcherState();
    }

    public interface SwitcherSettingsChangeResponseOrBuilder extends MessageOrBuilder {
        SwitcherSettingsChangeResponse.SettingsChangeStatus getStatus();

        boolean hasStatus();
    }

    public interface SwitcherSettingsOrBuilder extends MessageOrBuilder {
        boolean getAutoOff();

        SwitchSettings getCustomSettings(int i14);

        int getCustomSettingsCount();

        List<SwitchSettings> getCustomSettingsList();

        SwitchSettingsOrBuilder getCustomSettingsOrBuilder(int i14);

        List<? extends SwitchSettingsOrBuilder> getCustomSettingsOrBuilderList();

        InputSettings getInputSettings(int i14);

        int getInputSettingsCount();

        List<InputSettings> getInputSettingsList();

        InputSettingsOrBuilder getInputSettingsOrBuilder(int i14);

        List<? extends InputSettingsOrBuilder> getInputSettingsOrBuilderList();

        String getName();

        ByteString getNameBytes();

        SwitchSettings getSwitchSettings(int i14);

        int getSwitchSettingsCount();

        List<SwitchSettings> getSwitchSettingsList();

        SwitchSettingsOrBuilder getSwitchSettingsOrBuilder(int i14);

        List<? extends SwitchSettingsOrBuilder> getSwitchSettingsOrBuilderList();

        boolean hasAutoOff();

        boolean hasName();
    }

    public interface SwitcherStateOrBuilder extends MessageOrBuilder {
        float getBatteryVoltage();

        boolean getLowVoltageShutdown();

        boolean getOverloaded();

        int getPendingUpdateVersion();

        SwitchState getSwitchStates(int i14);

        int getSwitchStatesCount();

        List<SwitchState> getSwitchStatesList();

        SwitchStateOrBuilder getSwitchStatesOrBuilder(int i14);

        List<? extends SwitchStateOrBuilder> getSwitchStatesOrBuilderList();

        float getTemperature();

        boolean hasBatteryVoltage();

        boolean hasLowVoltageShutdown();

        boolean hasOverloaded();

        boolean hasPendingUpdateVersion();

        boolean hasTemperature();
    }

    public interface SwitcherStatusChangeDetailsOrBuilder extends MessageOrBuilder {
        SwitcherSettings getSwitcherSettings();

        SwitcherSettingsOrBuilder getSwitcherSettingsOrBuilder();

        SwitcherState getSwitcherState();

        SwitcherStateOrBuilder getSwitcherStateOrBuilder();

        boolean hasSwitcherSettings();

        boolean hasSwitcherState();
    }

    public interface SwitcherStatusRequestOrBuilder extends MessageOrBuilder {
    }

    public interface SwitcherStatusResponseOrBuilder extends MessageOrBuilder {
        SwitcherSettings getSwitcherSettings();

        SwitcherSettingsOrBuilder getSwitcherSettingsOrBuilder();

        SwitcherState getSwitcherState();

        SwitcherStateOrBuilder getSwitcherStateOrBuilder();

        boolean hasSwitcherSettings();

        boolean hasSwitcherState();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_Switcher_Switcher_descriptor = descriptor2;
        internal_static_GDI_Proto_Switcher_Switcher_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"StatusRequest", "StatusResponse", "StatusChangeRequest", "StatusChangeResponse", "RestoreDefaultsRequest", "RestoreDefaultsResponse"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_Switcher_SwitcherStatusRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_Switcher_SwitcherStatusRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[0]);
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_Switcher_SwitcherStatusResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_Switcher_SwitcherStatusResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"SwitcherSettings", "SwitcherState"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_Switcher_RestoreDefaultsRequest_descriptor = descriptor5;
        internal_static_GDI_Proto_Switcher_RestoreDefaultsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[0]);
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_Switcher_RestoreDefaultsResponse_descriptor = descriptor6;
        internal_static_GDI_Proto_Switcher_RestoreDefaultsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Status"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_Switcher_SwitcherSettingsChangeRequest_descriptor = descriptor7;
        internal_static_GDI_Proto_Switcher_SwitcherSettingsChangeRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"SwitcherSettings", "SwitcherState"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_Switcher_SwitcherSettingsChangeResponse_descriptor = descriptor8;
        internal_static_GDI_Proto_Switcher_SwitcherSettingsChangeResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Status"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_Switcher_SwitcherStatusChangeDetails_descriptor = descriptor9;
        internal_static_GDI_Proto_Switcher_SwitcherStatusChangeDetails_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"SwitcherSettings", "SwitcherState"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_GDI_Proto_Switcher_SwitcherSettings_descriptor = descriptor10;
        internal_static_GDI_Proto_Switcher_SwitcherSettings_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"SwitchSettings", "CustomSettings", "InputSettings", "AutoOff", "Name"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(9);
        internal_static_GDI_Proto_Switcher_SwitcherState_descriptor = descriptor11;
        internal_static_GDI_Proto_Switcher_SwitcherState_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"BatteryVoltage", "LowVoltageShutdown", "Overloaded", "Temperature", "PendingUpdateVersion", "SwitchStates"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(10);
        internal_static_GDI_Proto_Switcher_SwitchState_descriptor = descriptor12;
        internal_static_GDI_Proto_Switcher_SwitchState_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"SwitchId", "AmperageLevel", "Custom", "Enabled", "Overloaded"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(11);
        internal_static_GDI_Proto_Switcher_SwitchSettings_descriptor = descriptor13;
        internal_static_GDI_Proto_Switcher_SwitchSettings_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"SwitchId", "Brightness", "Mode", "OnPeriod", "OffPeriod", "Name", "Color", "Icon"});
        Descriptors.Descriptor descriptor14 = getDescriptor().getMessageTypes().get(12);
        internal_static_GDI_Proto_Switcher_InputSettings_descriptor = descriptor14;
        internal_static_GDI_Proto_Switcher_InputSettings_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"InputId", "Name", "Enabled", "RisingActions", "FallingActions"});
        Descriptors.Descriptor descriptor15 = getDescriptor().getMessageTypes().get(13);
        internal_static_GDI_Proto_Switcher_InputAction_descriptor = descriptor15;
        internal_static_GDI_Proto_Switcher_InputAction_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"SwitchId", "ActionType"});
        GDIEventSharingProto.getDescriptor();
    }

    private GDISwitcherProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(SwitcherStatusChangeDetails.switcherDetails);
    }

    public static final class RestoreDefaultsRequest extends GeneratedMessageV3 implements RestoreDefaultsRequestOrBuilder {
        private static final RestoreDefaultsRequest DEFAULT_INSTANCE = new RestoreDefaultsRequest();

        @Deprecated
        public static final Parser<RestoreDefaultsRequest> PARSER = new AbstractParser<RestoreDefaultsRequest>() { // from class: com.garmin.proto.generated.GDISwitcherProto.RestoreDefaultsRequest.1
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
            return GDISwitcherProto.internal_static_GDI_Proto_Switcher_RestoreDefaultsRequest_descriptor;
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
            return GDISwitcherProto.internal_static_GDI_Proto_Switcher_RestoreDefaultsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(RestoreDefaultsRequest.class, Builder.class);
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
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_RestoreDefaultsRequest_descriptor;
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
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_RestoreDefaultsRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_RestoreDefaultsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(RestoreDefaultsRequest.class, Builder.class);
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

    public static final class SwitchState extends GeneratedMessageV3 implements SwitchStateOrBuilder {
        public static final int AMPERAGE_LEVEL_FIELD_NUMBER = 2;
        public static final int CUSTOM_FIELD_NUMBER = 3;
        public static final int ENABLED_FIELD_NUMBER = 4;
        public static final int OVERLOADED_FIELD_NUMBER = 5;
        public static final int SWITCH_ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private float amperageLevel_;
        private int bitField0_;
        private boolean custom_;
        private boolean enabled_;
        private byte memoizedIsInitialized;
        private boolean overloaded_;
        private int switchId_;
        private static final SwitchState DEFAULT_INSTANCE = new SwitchState();

        @Deprecated
        public static final Parser<SwitchState> PARSER = new AbstractParser<SwitchState>() { // from class: com.garmin.proto.generated.GDISwitcherProto.SwitchState.1
            @Override // com.google.protobuf.Parser
            public SwitchState parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SwitchState.newBuilder();
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

        private SwitchState(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.switchId_ = 0;
            this.amperageLevel_ = 0.0f;
            this.custom_ = false;
            this.enabled_ = false;
            this.overloaded_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SwitchState getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitchState_descriptor;
        }

        public static Builder newBuilder(SwitchState switchState) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(switchState);
        }

        public static SwitchState parseDelimitedFrom(InputStream inputStream) {
            return (SwitchState) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SwitchState parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SwitchState> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SwitchState)) {
                return super.equals(obj);
            }
            SwitchState switchState = (SwitchState) obj;
            if (hasSwitchId() != switchState.hasSwitchId()) {
                return false;
            }
            if ((hasSwitchId() && getSwitchId() != switchState.getSwitchId()) || hasAmperageLevel() != switchState.hasAmperageLevel()) {
                return false;
            }
            if ((hasAmperageLevel() && Float.floatToIntBits(getAmperageLevel()) != Float.floatToIntBits(switchState.getAmperageLevel())) || hasCustom() != switchState.hasCustom()) {
                return false;
            }
            if ((hasCustom() && getCustom() != switchState.getCustom()) || hasEnabled() != switchState.hasEnabled()) {
                return false;
            }
            if ((!hasEnabled() || getEnabled() == switchState.getEnabled()) && hasOverloaded() == switchState.hasOverloaded()) {
                return (!hasOverloaded() || getOverloaded() == switchState.getOverloaded()) && getUnknownFields().equals(switchState.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchStateOrBuilder
        public float getAmperageLevel() {
            return this.amperageLevel_;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchStateOrBuilder
        public boolean getCustom() {
            return this.custom_;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchStateOrBuilder
        public boolean getEnabled() {
            return this.enabled_;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchStateOrBuilder
        public boolean getOverloaded() {
            return this.overloaded_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SwitchState> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.switchId_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeFloatSize(2, this.amperageLevel_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(3, this.custom_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(4, this.enabled_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(5, this.overloaded_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchStateOrBuilder
        public int getSwitchId() {
            return this.switchId_;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchStateOrBuilder
        public boolean hasAmperageLevel() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchStateOrBuilder
        public boolean hasCustom() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchStateOrBuilder
        public boolean hasEnabled() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchStateOrBuilder
        public boolean hasOverloaded() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchStateOrBuilder
        public boolean hasSwitchId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSwitchId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSwitchId();
            }
            if (hasAmperageLevel()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Float.floatToIntBits(getAmperageLevel());
            }
            if (hasCustom()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashBoolean(getCustom());
            }
            if (hasEnabled()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Internal.hashBoolean(getEnabled());
            }
            if (hasOverloaded()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + Internal.hashBoolean(getOverloaded());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitchState_fieldAccessorTable.ensureFieldAccessorsInitialized(SwitchState.class, Builder.class);
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
            return new SwitchState();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.switchId_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeFloat(2, this.amperageLevel_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(3, this.custom_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeBool(4, this.enabled_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeBool(5, this.overloaded_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SwitchStateOrBuilder {
            private float amperageLevel_;
            private int bitField0_;
            private boolean custom_;
            private boolean enabled_;
            private boolean overloaded_;
            private int switchId_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(SwitchState switchState) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    switchState.switchId_ = this.switchId_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    switchState.amperageLevel_ = this.amperageLevel_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    switchState.custom_ = this.custom_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    switchState.enabled_ = this.enabled_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    switchState.overloaded_ = this.overloaded_;
                    i14 |= 16;
                }
                switchState.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitchState_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwitchState build() {
                SwitchState switchStateBuildPartial = buildPartial();
                if (switchStateBuildPartial.isInitialized()) {
                    return switchStateBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) switchStateBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwitchState buildPartial() {
                SwitchState switchState = new SwitchState(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(switchState);
                }
                onBuilt();
                return switchState;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.switchId_ = 0;
                this.amperageLevel_ = 0.0f;
                this.custom_ = false;
                this.enabled_ = false;
                this.overloaded_ = false;
                return this;
            }

            public Builder clearAmperageLevel() {
                this.bitField0_ &= -3;
                this.amperageLevel_ = 0.0f;
                onChanged();
                return this;
            }

            public Builder clearCustom() {
                this.bitField0_ &= -5;
                this.custom_ = false;
                onChanged();
                return this;
            }

            public Builder clearEnabled() {
                this.bitField0_ &= -9;
                this.enabled_ = false;
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

            public Builder clearOverloaded() {
                this.bitField0_ &= -17;
                this.overloaded_ = false;
                onChanged();
                return this;
            }

            public Builder clearSwitchId() {
                this.bitField0_ &= -2;
                this.switchId_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchStateOrBuilder
            public float getAmperageLevel() {
                return this.amperageLevel_;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchStateOrBuilder
            public boolean getCustom() {
                return this.custom_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitchState_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchStateOrBuilder
            public boolean getEnabled() {
                return this.enabled_;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchStateOrBuilder
            public boolean getOverloaded() {
                return this.overloaded_;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchStateOrBuilder
            public int getSwitchId() {
                return this.switchId_;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchStateOrBuilder
            public boolean hasAmperageLevel() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchStateOrBuilder
            public boolean hasCustom() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchStateOrBuilder
            public boolean hasEnabled() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchStateOrBuilder
            public boolean hasOverloaded() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchStateOrBuilder
            public boolean hasSwitchId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitchState_fieldAccessorTable.ensureFieldAccessorsInitialized(SwitchState.class, Builder.class);
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
                                    this.switchId_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 21) {
                                    this.amperageLevel_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.custom_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.enabled_ = codedInputStream.readBool();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.overloaded_ = codedInputStream.readBool();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setAmperageLevel(float f14) {
                this.amperageLevel_ = f14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setCustom(boolean z14) {
                this.custom_ = z14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setEnabled(boolean z14) {
                this.enabled_ = z14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setOverloaded(boolean z14) {
                this.overloaded_ = z14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSwitchId(int i14) {
                this.switchId_ = i14;
                this.bitField0_ |= 1;
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
            public SwitchState getDefaultInstanceForType() {
                return SwitchState.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SwitchState) {
                    return mergeFrom((SwitchState) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SwitchState switchState) {
                if (switchState == SwitchState.getDefaultInstance()) {
                    return this;
                }
                if (switchState.hasSwitchId()) {
                    setSwitchId(switchState.getSwitchId());
                }
                if (switchState.hasAmperageLevel()) {
                    setAmperageLevel(switchState.getAmperageLevel());
                }
                if (switchState.hasCustom()) {
                    setCustom(switchState.getCustom());
                }
                if (switchState.hasEnabled()) {
                    setEnabled(switchState.getEnabled());
                }
                if (switchState.hasOverloaded()) {
                    setOverloaded(switchState.getOverloaded());
                }
                mergeUnknownFields(switchState.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SwitchState getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SwitchState parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwitchState) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwitchState parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SwitchState parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SwitchState parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SwitchState parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SwitchState parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SwitchState parseFrom(InputStream inputStream) {
            return (SwitchState) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SwitchState parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwitchState) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwitchState parseFrom(CodedInputStream codedInputStream) {
            return (SwitchState) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public /* synthetic */ SwitchState(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SwitchState() {
            this.switchId_ = 0;
            this.amperageLevel_ = 0.0f;
            this.custom_ = false;
            this.enabled_ = false;
            this.overloaded_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SwitchState parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwitchState) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SwitcherStatusRequest extends GeneratedMessageV3 implements SwitcherStatusRequestOrBuilder {
        private static final SwitcherStatusRequest DEFAULT_INSTANCE = new SwitcherStatusRequest();

        @Deprecated
        public static final Parser<SwitcherStatusRequest> PARSER = new AbstractParser<SwitcherStatusRequest>() { // from class: com.garmin.proto.generated.GDISwitcherProto.SwitcherStatusRequest.1
            @Override // com.google.protobuf.Parser
            public SwitcherStatusRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SwitcherStatusRequest.newBuilder();
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

        private SwitcherStatusRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SwitcherStatusRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitcherStatusRequest_descriptor;
        }

        public static Builder newBuilder(SwitcherStatusRequest switcherStatusRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(switcherStatusRequest);
        }

        public static SwitcherStatusRequest parseDelimitedFrom(InputStream inputStream) {
            return (SwitcherStatusRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SwitcherStatusRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SwitcherStatusRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof SwitcherStatusRequest) {
                return getUnknownFields().equals(((SwitcherStatusRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SwitcherStatusRequest> getParserForType() {
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
            return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitcherStatusRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SwitcherStatusRequest.class, Builder.class);
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
            return new SwitcherStatusRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SwitcherStatusRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitcherStatusRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwitcherStatusRequest build() {
                SwitcherStatusRequest switcherStatusRequestBuildPartial = buildPartial();
                if (switcherStatusRequestBuildPartial.isInitialized()) {
                    return switcherStatusRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) switcherStatusRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwitcherStatusRequest buildPartial() {
                SwitcherStatusRequest switcherStatusRequest = new SwitcherStatusRequest(this);
                onBuilt();
                return switcherStatusRequest;
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
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitcherStatusRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitcherStatusRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SwitcherStatusRequest.class, Builder.class);
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
            public SwitcherStatusRequest getDefaultInstanceForType() {
                return SwitcherStatusRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SwitcherStatusRequest) {
                    return mergeFrom((SwitcherStatusRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SwitcherStatusRequest switcherStatusRequest) {
                if (switcherStatusRequest == SwitcherStatusRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(switcherStatusRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SwitcherStatusRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ SwitcherStatusRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SwitcherStatusRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SwitcherStatusRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwitcherStatusRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwitcherStatusRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SwitcherStatusRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SwitcherStatusRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SwitcherStatusRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SwitcherStatusRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SwitcherStatusRequest parseFrom(InputStream inputStream) {
            return (SwitcherStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SwitcherStatusRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwitcherStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwitcherStatusRequest parseFrom(CodedInputStream codedInputStream) {
            return (SwitcherStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SwitcherStatusRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwitcherStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class InputAction extends GeneratedMessageV3 implements InputActionOrBuilder {
        public static final int ACTION_TYPE_FIELD_NUMBER = 2;
        private static final InputAction DEFAULT_INSTANCE = new InputAction();

        @Deprecated
        public static final Parser<InputAction> PARSER = new AbstractParser<InputAction>() { // from class: com.garmin.proto.generated.GDISwitcherProto.InputAction.1
            @Override // com.google.protobuf.Parser
            public InputAction parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = InputAction.newBuilder();
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
        public static final int SWITCH_ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int actionType_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int switchId_;

        private InputAction(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.switchId_ = 0;
            this.actionType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static InputAction getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISwitcherProto.internal_static_GDI_Proto_Switcher_InputAction_descriptor;
        }

        public static Builder newBuilder(InputAction inputAction) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(inputAction);
        }

        public static InputAction parseDelimitedFrom(InputStream inputStream) {
            return (InputAction) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static InputAction parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<InputAction> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InputAction)) {
                return super.equals(obj);
            }
            InputAction inputAction = (InputAction) obj;
            if (hasSwitchId() != inputAction.hasSwitchId()) {
                return false;
            }
            if ((!hasSwitchId() || getSwitchId() == inputAction.getSwitchId()) && hasActionType() == inputAction.hasActionType()) {
                return (!hasActionType() || this.actionType_ == inputAction.actionType_) && getUnknownFields().equals(inputAction.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.InputActionOrBuilder
        public ActionType getActionType() {
            ActionType actionTypeForNumber = ActionType.forNumber(this.actionType_);
            return actionTypeForNumber == null ? ActionType.SWITCH_ON : actionTypeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<InputAction> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.switchId_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(2, this.actionType_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.InputActionOrBuilder
        public int getSwitchId() {
            return this.switchId_;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.InputActionOrBuilder
        public boolean hasActionType() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.InputActionOrBuilder
        public boolean hasSwitchId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSwitchId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSwitchId();
            }
            if (hasActionType()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.actionType_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISwitcherProto.internal_static_GDI_Proto_Switcher_InputAction_fieldAccessorTable.ensureFieldAccessorsInitialized(InputAction.class, Builder.class);
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
            return new InputAction();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.switchId_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.actionType_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements InputActionOrBuilder {
            private int actionType_;
            private int bitField0_;
            private int switchId_;

            private Builder() {
                this.actionType_ = 0;
            }

            private void buildPartial0(InputAction inputAction) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    inputAction.switchId_ = this.switchId_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    inputAction.actionType_ = this.actionType_;
                    i14 |= 2;
                }
                inputAction.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_InputAction_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InputAction build() {
                InputAction inputActionBuildPartial = buildPartial();
                if (inputActionBuildPartial.isInitialized()) {
                    return inputActionBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) inputActionBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InputAction buildPartial() {
                InputAction inputAction = new InputAction(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(inputAction);
                }
                onBuilt();
                return inputAction;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.switchId_ = 0;
                this.actionType_ = 0;
                return this;
            }

            public Builder clearActionType() {
                this.bitField0_ &= -3;
                this.actionType_ = 0;
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

            public Builder clearSwitchId() {
                this.bitField0_ &= -2;
                this.switchId_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.InputActionOrBuilder
            public ActionType getActionType() {
                ActionType actionTypeForNumber = ActionType.forNumber(this.actionType_);
                return actionTypeForNumber == null ? ActionType.SWITCH_ON : actionTypeForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_InputAction_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.InputActionOrBuilder
            public int getSwitchId() {
                return this.switchId_;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.InputActionOrBuilder
            public boolean hasActionType() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.InputActionOrBuilder
            public boolean hasSwitchId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_InputAction_fieldAccessorTable.ensureFieldAccessorsInitialized(InputAction.class, Builder.class);
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
                                    this.switchId_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (ActionType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.actionType_ = i14;
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

            public Builder setActionType(ActionType actionType) {
                actionType.getClass();
                this.bitField0_ |= 2;
                this.actionType_ = actionType.getNumber();
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

            public Builder setSwitchId(int i14) {
                this.switchId_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public InputAction getDefaultInstanceForType() {
                return InputAction.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.actionType_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof InputAction) {
                    return mergeFrom((InputAction) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(InputAction inputAction) {
                if (inputAction == InputAction.getDefaultInstance()) {
                    return this;
                }
                if (inputAction.hasSwitchId()) {
                    setSwitchId(inputAction.getSwitchId());
                }
                if (inputAction.hasActionType()) {
                    setActionType(inputAction.getActionType());
                }
                mergeUnknownFields(inputAction.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public InputAction getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static InputAction parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InputAction) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InputAction parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static InputAction parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static InputAction parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ InputAction(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static InputAction parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private InputAction() {
            this.switchId_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.actionType_ = 0;
        }

        public static InputAction parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static InputAction parseFrom(InputStream inputStream) {
            return (InputAction) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static InputAction parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InputAction) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InputAction parseFrom(CodedInputStream codedInputStream) {
            return (InputAction) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static InputAction parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InputAction) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ActionType implements ProtocolMessageEnum {
            SWITCH_ON(0),
            SWITCH_OFF(1),
            DISABLED(2);

            public static final int DISABLED_VALUE = 2;
            public static final int SWITCH_OFF_VALUE = 1;
            public static final int SWITCH_ON_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ActionType> internalValueMap = new Internal.EnumLiteMap<ActionType>() { // from class: com.garmin.proto.generated.GDISwitcherProto.InputAction.ActionType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ActionType findValueByNumber(int i14) {
                    return ActionType.forNumber(i14);
                }
            };
            private static final ActionType[] VALUES = values();

            ActionType(int i14) {
                this.value = i14;
            }

            public static ActionType forNumber(int i14) {
                if (i14 == 0) {
                    return SWITCH_ON;
                }
                if (i14 == 1) {
                    return SWITCH_OFF;
                }
                if (i14 != 2) {
                    return null;
                }
                return DISABLED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return InputAction.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<ActionType> internalGetValueMap() {
                return internalValueMap;
            }

            public static ActionType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static ActionType valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class InputSettings extends GeneratedMessageV3 implements InputSettingsOrBuilder {
        public static final int ENABLED_FIELD_NUMBER = 3;
        public static final int FALLING_ACTIONS_FIELD_NUMBER = 5;
        public static final int INPUT_ID_FIELD_NUMBER = 1;
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int RISING_ACTIONS_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean enabled_;
        private List<InputAction> fallingActions_;
        private int inputId_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private List<InputAction> risingActions_;
        private static final InputSettings DEFAULT_INSTANCE = new InputSettings();

        @Deprecated
        public static final Parser<InputSettings> PARSER = new AbstractParser<InputSettings>() { // from class: com.garmin.proto.generated.GDISwitcherProto.InputSettings.1
            @Override // com.google.protobuf.Parser
            public InputSettings parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = InputSettings.newBuilder();
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

        private InputSettings() {
            this.inputId_ = 0;
            this.name_ = "";
            this.enabled_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.name_ = "";
            List<InputAction> list = Collections.EMPTY_LIST;
            this.risingActions_ = list;
            this.fallingActions_ = list;
        }

        public static InputSettings getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISwitcherProto.internal_static_GDI_Proto_Switcher_InputSettings_descriptor;
        }

        public static Builder newBuilder(InputSettings inputSettings) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(inputSettings);
        }

        public static InputSettings parseDelimitedFrom(InputStream inputStream) {
            return (InputSettings) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static InputSettings parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<InputSettings> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InputSettings)) {
                return super.equals(obj);
            }
            InputSettings inputSettings = (InputSettings) obj;
            if (hasInputId() != inputSettings.hasInputId()) {
                return false;
            }
            if ((hasInputId() && getInputId() != inputSettings.getInputId()) || hasName() != inputSettings.hasName()) {
                return false;
            }
            if ((!hasName() || getName().equals(inputSettings.getName())) && hasEnabled() == inputSettings.hasEnabled()) {
                return (!hasEnabled() || getEnabled() == inputSettings.getEnabled()) && getRisingActionsList().equals(inputSettings.getRisingActionsList()) && getFallingActionsList().equals(inputSettings.getFallingActionsList()) && getUnknownFields().equals(inputSettings.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.InputSettingsOrBuilder
        public boolean getEnabled() {
            return this.enabled_;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.InputSettingsOrBuilder
        public InputAction getFallingActions(int i14) {
            return this.fallingActions_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.InputSettingsOrBuilder
        public int getFallingActionsCount() {
            return this.fallingActions_.size();
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.InputSettingsOrBuilder
        public List<InputAction> getFallingActionsList() {
            return this.fallingActions_;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.InputSettingsOrBuilder
        public InputActionOrBuilder getFallingActionsOrBuilder(int i14) {
            return this.fallingActions_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.InputSettingsOrBuilder
        public List<? extends InputActionOrBuilder> getFallingActionsOrBuilderList() {
            return this.fallingActions_;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.InputSettingsOrBuilder
        public int getInputId() {
            return this.inputId_;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.InputSettingsOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.name_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.InputSettingsOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<InputSettings> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.InputSettingsOrBuilder
        public InputAction getRisingActions(int i14) {
            return this.risingActions_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.InputSettingsOrBuilder
        public int getRisingActionsCount() {
            return this.risingActions_.size();
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.InputSettingsOrBuilder
        public List<InputAction> getRisingActionsList() {
            return this.risingActions_;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.InputSettingsOrBuilder
        public InputActionOrBuilder getRisingActionsOrBuilder(int i14) {
            return this.risingActions_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.InputSettingsOrBuilder
        public List<? extends InputActionOrBuilder> getRisingActionsOrBuilderList() {
            return this.risingActions_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.inputId_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += GeneratedMessageV3.computeStringSize(2, this.name_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(3, this.enabled_);
            }
            for (int i15 = 0; i15 < this.risingActions_.size(); i15++) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(4, this.risingActions_.get(i15));
            }
            for (int i16 = 0; i16 < this.fallingActions_.size(); i16++) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(5, this.fallingActions_.get(i16));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.InputSettingsOrBuilder
        public boolean hasEnabled() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.InputSettingsOrBuilder
        public boolean hasInputId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.InputSettingsOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasInputId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getInputId();
            }
            if (hasName()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getName().hashCode();
            }
            if (hasEnabled()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashBoolean(getEnabled());
            }
            if (getRisingActionsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getRisingActionsList().hashCode();
            }
            if (getFallingActionsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getFallingActionsList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISwitcherProto.internal_static_GDI_Proto_Switcher_InputSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(InputSettings.class, Builder.class);
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
            return new InputSettings();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.inputId_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.name_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(3, this.enabled_);
            }
            for (int i14 = 0; i14 < this.risingActions_.size(); i14++) {
                codedOutputStream.writeMessage(4, this.risingActions_.get(i14));
            }
            for (int i15 = 0; i15 < this.fallingActions_.size(); i15++) {
                codedOutputStream.writeMessage(5, this.fallingActions_.get(i15));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements InputSettingsOrBuilder {
            private int bitField0_;
            private boolean enabled_;
            private RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> fallingActionsBuilder_;
            private List<InputAction> fallingActions_;
            private int inputId_;
            private Object name_;
            private RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> risingActionsBuilder_;
            private List<InputAction> risingActions_;

            private Builder() {
                this.name_ = "";
                List<InputAction> list = Collections.EMPTY_LIST;
                this.risingActions_ = list;
                this.fallingActions_ = list;
            }

            private void buildPartial0(InputSettings inputSettings) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    inputSettings.inputId_ = this.inputId_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    inputSettings.name_ = this.name_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    inputSettings.enabled_ = this.enabled_;
                    i14 |= 4;
                }
                inputSettings.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(InputSettings inputSettings) {
                RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> repeatedFieldBuilderV3 = this.risingActionsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 8) != 0) {
                        this.risingActions_ = Collections.unmodifiableList(this.risingActions_);
                        this.bitField0_ &= -9;
                    }
                    inputSettings.risingActions_ = this.risingActions_;
                } else {
                    inputSettings.risingActions_ = repeatedFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> repeatedFieldBuilderV4 = this.fallingActionsBuilder_;
                if (repeatedFieldBuilderV4 != null) {
                    inputSettings.fallingActions_ = repeatedFieldBuilderV4.build();
                    return;
                }
                if ((this.bitField0_ & 16) != 0) {
                    this.fallingActions_ = Collections.unmodifiableList(this.fallingActions_);
                    this.bitField0_ &= -17;
                }
                inputSettings.fallingActions_ = this.fallingActions_;
            }

            private void ensureFallingActionsIsMutable() {
                if ((this.bitField0_ & 16) == 0) {
                    this.fallingActions_ = new ArrayList(this.fallingActions_);
                    this.bitField0_ |= 16;
                }
            }

            private void ensureRisingActionsIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.risingActions_ = new ArrayList(this.risingActions_);
                    this.bitField0_ |= 8;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_InputSettings_descriptor;
            }

            private RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> getFallingActionsFieldBuilder() {
                if (this.fallingActionsBuilder_ == null) {
                    this.fallingActionsBuilder_ = new RepeatedFieldBuilderV3<>(this.fallingActions_, (this.bitField0_ & 16) != 0, getParentForChildren(), isClean());
                    this.fallingActions_ = null;
                }
                return this.fallingActionsBuilder_;
            }

            private RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> getRisingActionsFieldBuilder() {
                if (this.risingActionsBuilder_ == null) {
                    this.risingActionsBuilder_ = new RepeatedFieldBuilderV3<>(this.risingActions_, (this.bitField0_ & 8) != 0, getParentForChildren(), isClean());
                    this.risingActions_ = null;
                }
                return this.risingActionsBuilder_;
            }

            public Builder addAllFallingActions(Iterable<? extends InputAction> iterable) {
                RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> repeatedFieldBuilderV3 = this.fallingActionsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureFallingActionsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.fallingActions_);
                onChanged();
                return this;
            }

            public Builder addAllRisingActions(Iterable<? extends InputAction> iterable) {
                RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> repeatedFieldBuilderV3 = this.risingActionsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureRisingActionsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.risingActions_);
                onChanged();
                return this;
            }

            public Builder addFallingActions(InputAction.Builder builder) {
                RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> repeatedFieldBuilderV3 = this.fallingActionsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureFallingActionsIsMutable();
                this.fallingActions_.add(builder.build());
                onChanged();
                return this;
            }

            public InputAction.Builder addFallingActionsBuilder() {
                return (InputAction.Builder) getFallingActionsFieldBuilder().addBuilder(InputAction.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addRisingActions(InputAction.Builder builder) {
                RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> repeatedFieldBuilderV3 = this.risingActionsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureRisingActionsIsMutable();
                this.risingActions_.add(builder.build());
                onChanged();
                return this;
            }

            public InputAction.Builder addRisingActionsBuilder() {
                return (InputAction.Builder) getRisingActionsFieldBuilder().addBuilder(InputAction.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InputSettings build() {
                InputSettings inputSettingsBuildPartial = buildPartial();
                if (inputSettingsBuildPartial.isInitialized()) {
                    return inputSettingsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) inputSettingsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InputSettings buildPartial() {
                InputSettings inputSettings = new InputSettings(this);
                buildPartialRepeatedFields(inputSettings);
                if (this.bitField0_ != 0) {
                    buildPartial0(inputSettings);
                }
                onBuilt();
                return inputSettings;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.inputId_ = 0;
                this.name_ = "";
                this.enabled_ = false;
                RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> repeatedFieldBuilderV3 = this.risingActionsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.risingActions_ = Collections.EMPTY_LIST;
                } else {
                    this.risingActions_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -9;
                RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> repeatedFieldBuilderV4 = this.fallingActionsBuilder_;
                if (repeatedFieldBuilderV4 == null) {
                    this.fallingActions_ = Collections.EMPTY_LIST;
                } else {
                    this.fallingActions_ = null;
                    repeatedFieldBuilderV4.clear();
                }
                this.bitField0_ &= -17;
                return this;
            }

            public Builder clearEnabled() {
                this.bitField0_ &= -5;
                this.enabled_ = false;
                onChanged();
                return this;
            }

            public Builder clearFallingActions() {
                RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> repeatedFieldBuilderV3 = this.fallingActionsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.fallingActions_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearInputId() {
                this.bitField0_ &= -2;
                this.inputId_ = 0;
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.name_ = InputSettings.getDefaultInstance().getName();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearRisingActions() {
                RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> repeatedFieldBuilderV3 = this.risingActionsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.risingActions_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -9;
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
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_InputSettings_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.InputSettingsOrBuilder
            public boolean getEnabled() {
                return this.enabled_;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.InputSettingsOrBuilder
            public InputAction getFallingActions(int i14) {
                RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> repeatedFieldBuilderV3 = this.fallingActionsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.fallingActions_.get(i14) : (InputAction) repeatedFieldBuilderV3.getMessage(i14);
            }

            public InputAction.Builder getFallingActionsBuilder(int i14) {
                return (InputAction.Builder) getFallingActionsFieldBuilder().getBuilder(i14);
            }

            public List<InputAction.Builder> getFallingActionsBuilderList() {
                return getFallingActionsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.InputSettingsOrBuilder
            public int getFallingActionsCount() {
                RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> repeatedFieldBuilderV3 = this.fallingActionsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.fallingActions_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.InputSettingsOrBuilder
            public List<InputAction> getFallingActionsList() {
                RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> repeatedFieldBuilderV3 = this.fallingActionsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.fallingActions_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.InputSettingsOrBuilder
            public InputActionOrBuilder getFallingActionsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> repeatedFieldBuilderV3 = this.fallingActionsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.fallingActions_.get(i14) : (InputActionOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.InputSettingsOrBuilder
            public List<? extends InputActionOrBuilder> getFallingActionsOrBuilderList() {
                RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> repeatedFieldBuilderV3 = this.fallingActionsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.fallingActions_);
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.InputSettingsOrBuilder
            public int getInputId() {
                return this.inputId_;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.InputSettingsOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.name_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.InputSettingsOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.InputSettingsOrBuilder
            public InputAction getRisingActions(int i14) {
                RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> repeatedFieldBuilderV3 = this.risingActionsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.risingActions_.get(i14) : (InputAction) repeatedFieldBuilderV3.getMessage(i14);
            }

            public InputAction.Builder getRisingActionsBuilder(int i14) {
                return (InputAction.Builder) getRisingActionsFieldBuilder().getBuilder(i14);
            }

            public List<InputAction.Builder> getRisingActionsBuilderList() {
                return getRisingActionsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.InputSettingsOrBuilder
            public int getRisingActionsCount() {
                RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> repeatedFieldBuilderV3 = this.risingActionsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.risingActions_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.InputSettingsOrBuilder
            public List<InputAction> getRisingActionsList() {
                RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> repeatedFieldBuilderV3 = this.risingActionsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.risingActions_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.InputSettingsOrBuilder
            public InputActionOrBuilder getRisingActionsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> repeatedFieldBuilderV3 = this.risingActionsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.risingActions_.get(i14) : (InputActionOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.InputSettingsOrBuilder
            public List<? extends InputActionOrBuilder> getRisingActionsOrBuilderList() {
                RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> repeatedFieldBuilderV3 = this.risingActionsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.risingActions_);
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.InputSettingsOrBuilder
            public boolean hasEnabled() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.InputSettingsOrBuilder
            public boolean hasInputId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.InputSettingsOrBuilder
            public boolean hasName() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_InputSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(InputSettings.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(InputSettings inputSettings) {
                if (inputSettings == InputSettings.getDefaultInstance()) {
                    return this;
                }
                if (inputSettings.hasInputId()) {
                    setInputId(inputSettings.getInputId());
                }
                if (inputSettings.hasName()) {
                    this.name_ = inputSettings.name_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (inputSettings.hasEnabled()) {
                    setEnabled(inputSettings.getEnabled());
                }
                if (this.risingActionsBuilder_ == null) {
                    if (!inputSettings.risingActions_.isEmpty()) {
                        if (this.risingActions_.isEmpty()) {
                            this.risingActions_ = inputSettings.risingActions_;
                            this.bitField0_ &= -9;
                        } else {
                            ensureRisingActionsIsMutable();
                            this.risingActions_.addAll(inputSettings.risingActions_);
                        }
                        onChanged();
                    }
                } else if (!inputSettings.risingActions_.isEmpty()) {
                    boolean zIsEmpty = this.risingActionsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> repeatedFieldBuilderV3 = this.risingActionsBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.risingActionsBuilder_ = null;
                        this.risingActions_ = inputSettings.risingActions_;
                        this.bitField0_ &= -9;
                        this.risingActionsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getRisingActionsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(inputSettings.risingActions_);
                    }
                }
                if (this.fallingActionsBuilder_ == null) {
                    if (!inputSettings.fallingActions_.isEmpty()) {
                        if (this.fallingActions_.isEmpty()) {
                            this.fallingActions_ = inputSettings.fallingActions_;
                            this.bitField0_ &= -17;
                        } else {
                            ensureFallingActionsIsMutable();
                            this.fallingActions_.addAll(inputSettings.fallingActions_);
                        }
                        onChanged();
                    }
                } else if (!inputSettings.fallingActions_.isEmpty()) {
                    boolean zIsEmpty2 = this.fallingActionsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> repeatedFieldBuilderV4 = this.fallingActionsBuilder_;
                    if (zIsEmpty2) {
                        repeatedFieldBuilderV4.dispose();
                        this.fallingActionsBuilder_ = null;
                        this.fallingActions_ = inputSettings.fallingActions_;
                        this.bitField0_ &= -17;
                        this.fallingActionsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getFallingActionsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV4.addAllMessages(inputSettings.fallingActions_);
                    }
                }
                mergeUnknownFields(inputSettings.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeFallingActions(int i14) {
                RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> repeatedFieldBuilderV3 = this.fallingActionsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureFallingActionsIsMutable();
                this.fallingActions_.remove(i14);
                onChanged();
                return this;
            }

            public Builder removeRisingActions(int i14) {
                RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> repeatedFieldBuilderV3 = this.risingActionsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureRisingActionsIsMutable();
                this.risingActions_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setEnabled(boolean z14) {
                this.enabled_ = z14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setFallingActions(int i14, InputAction.Builder builder) {
                RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> repeatedFieldBuilderV3 = this.fallingActionsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureFallingActionsIsMutable();
                this.fallingActions_.set(i14, builder.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setInputId(int i14) {
                this.inputId_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setName(String str) {
                str.getClass();
                this.name_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                byteString.getClass();
                this.name_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setRisingActions(int i14, InputAction.Builder builder) {
                RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> repeatedFieldBuilderV3 = this.risingActionsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureRisingActionsIsMutable();
                this.risingActions_.set(i14, builder.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public InputSettings getDefaultInstanceForType() {
                return InputSettings.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            public InputAction.Builder addFallingActionsBuilder(int i14) {
                return (InputAction.Builder) getFallingActionsFieldBuilder().addBuilder(i14, InputAction.getDefaultInstance());
            }

            public InputAction.Builder addRisingActionsBuilder(int i14) {
                return (InputAction.Builder) getRisingActionsFieldBuilder().addBuilder(i14, InputAction.getDefaultInstance());
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.name_ = "";
                List<InputAction> list = Collections.EMPTY_LIST;
                this.risingActions_ = list;
                this.fallingActions_ = list;
            }

            public Builder addFallingActions(int i14, InputAction inputAction) {
                RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> repeatedFieldBuilderV3 = this.fallingActionsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    inputAction.getClass();
                    ensureFallingActionsIsMutable();
                    this.fallingActions_.add(i14, inputAction);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, inputAction);
                return this;
            }

            public Builder addRisingActions(int i14, InputAction inputAction) {
                RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> repeatedFieldBuilderV3 = this.risingActionsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    inputAction.getClass();
                    ensureRisingActionsIsMutable();
                    this.risingActions_.add(i14, inputAction);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, inputAction);
                return this;
            }

            public Builder setFallingActions(int i14, InputAction inputAction) {
                RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> repeatedFieldBuilderV3 = this.fallingActionsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    inputAction.getClass();
                    ensureFallingActionsIsMutable();
                    this.fallingActions_.set(i14, inputAction);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, inputAction);
                return this;
            }

            public Builder setRisingActions(int i14, InputAction inputAction) {
                RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> repeatedFieldBuilderV3 = this.risingActionsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    inputAction.getClass();
                    ensureRisingActionsIsMutable();
                    this.risingActions_.set(i14, inputAction);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, inputAction);
                return this;
            }

            public Builder addFallingActions(InputAction inputAction) {
                RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> repeatedFieldBuilderV3 = this.fallingActionsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    inputAction.getClass();
                    ensureFallingActionsIsMutable();
                    this.fallingActions_.add(inputAction);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(inputAction);
                return this;
            }

            public Builder addRisingActions(InputAction inputAction) {
                RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> repeatedFieldBuilderV3 = this.risingActionsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    inputAction.getClass();
                    ensureRisingActionsIsMutable();
                    this.risingActions_.add(inputAction);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(inputAction);
                return this;
            }

            public Builder addFallingActions(int i14, InputAction.Builder builder) {
                RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> repeatedFieldBuilderV3 = this.fallingActionsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureFallingActionsIsMutable();
                    this.fallingActions_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            public Builder addRisingActions(int i14, InputAction.Builder builder) {
                RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> repeatedFieldBuilderV3 = this.risingActionsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureRisingActionsIsMutable();
                    this.risingActions_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof InputSettings) {
                    return mergeFrom((InputSettings) message);
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
                                    this.inputId_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.name_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.enabled_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    InputAction inputAction = (InputAction) codedInputStream.readMessage(InputAction.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> repeatedFieldBuilderV3 = this.risingActionsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureRisingActionsIsMutable();
                                        this.risingActions_.add(inputAction);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(inputAction);
                                    }
                                } else if (tag != 42) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    InputAction inputAction2 = (InputAction) codedInputStream.readMessage(InputAction.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<InputAction, InputAction.Builder, InputActionOrBuilder> repeatedFieldBuilderV4 = this.fallingActionsBuilder_;
                                    if (repeatedFieldBuilderV4 == null) {
                                        ensureFallingActionsIsMutable();
                                        this.fallingActions_.add(inputAction2);
                                    } else {
                                        repeatedFieldBuilderV4.addMessage(inputAction2);
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
        public InputSettings getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static InputSettings parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InputSettings) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InputSettings parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static InputSettings parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static InputSettings parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static InputSettings parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static InputSettings parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static InputSettings parseFrom(InputStream inputStream) {
            return (InputSettings) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static InputSettings parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InputSettings) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InputSettings parseFrom(CodedInputStream codedInputStream) {
            return (InputSettings) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static InputSettings parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InputSettings) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private InputSettings(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.inputId_ = 0;
            this.name_ = "";
            this.enabled_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ InputSettings(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class RestoreDefaultsResponse extends GeneratedMessageV3 implements RestoreDefaultsResponseOrBuilder {
        private static final RestoreDefaultsResponse DEFAULT_INSTANCE = new RestoreDefaultsResponse();

        @Deprecated
        public static final Parser<RestoreDefaultsResponse> PARSER = new AbstractParser<RestoreDefaultsResponse>() { // from class: com.garmin.proto.generated.GDISwitcherProto.RestoreDefaultsResponse.1
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
            return GDISwitcherProto.internal_static_GDI_Proto_Switcher_RestoreDefaultsResponse_descriptor;
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

        @Override // com.garmin.proto.generated.GDISwitcherProto.RestoreDefaultsResponseOrBuilder
        public RestoreDefaultsStatus getStatus() {
            RestoreDefaultsStatus restoreDefaultsStatusForNumber = RestoreDefaultsStatus.forNumber(this.status_);
            return restoreDefaultsStatusForNumber == null ? RestoreDefaultsStatus.SUCCESS : restoreDefaultsStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.RestoreDefaultsResponseOrBuilder
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
            return GDISwitcherProto.internal_static_GDI_Proto_Switcher_RestoreDefaultsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(RestoreDefaultsResponse.class, Builder.class);
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
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_RestoreDefaultsResponse_descriptor;
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
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_RestoreDefaultsResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.RestoreDefaultsResponseOrBuilder
            public RestoreDefaultsStatus getStatus() {
                RestoreDefaultsStatus restoreDefaultsStatusForNumber = RestoreDefaultsStatus.forNumber(this.status_);
                return restoreDefaultsStatusForNumber == null ? RestoreDefaultsStatus.SUCCESS : restoreDefaultsStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.RestoreDefaultsResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_RestoreDefaultsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(RestoreDefaultsResponse.class, Builder.class);
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
            private static final Internal.EnumLiteMap<RestoreDefaultsStatus> internalValueMap = new Internal.EnumLiteMap<RestoreDefaultsStatus>() { // from class: com.garmin.proto.generated.GDISwitcherProto.RestoreDefaultsResponse.RestoreDefaultsStatus.1
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

    public static final class SwitchSettings extends GeneratedMessageV3 implements SwitchSettingsOrBuilder {
        public static final int BRIGHTNESS_FIELD_NUMBER = 2;
        public static final int COLOR_FIELD_NUMBER = 101;
        public static final int ICON_FIELD_NUMBER = 102;
        public static final int MODE_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 100;
        public static final int OFF_PERIOD_FIELD_NUMBER = 5;
        public static final int ON_PERIOD_FIELD_NUMBER = 4;
        public static final int SWITCH_ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int brightness_;
        private int color_;
        private int icon_;
        private byte memoizedIsInitialized;
        private int mode_;
        private volatile Object name_;
        private int offPeriod_;
        private int onPeriod_;
        private int switchId_;
        private static final SwitchSettings DEFAULT_INSTANCE = new SwitchSettings();

        @Deprecated
        public static final Parser<SwitchSettings> PARSER = new AbstractParser<SwitchSettings>() { // from class: com.garmin.proto.generated.GDISwitcherProto.SwitchSettings.1
            @Override // com.google.protobuf.Parser
            public SwitchSettings parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SwitchSettings.newBuilder();
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

        private SwitchSettings() {
            this.switchId_ = 0;
            this.brightness_ = 0;
            this.mode_ = 0;
            this.onPeriod_ = 0;
            this.offPeriod_ = 0;
            this.name_ = "";
            this.color_ = 0;
            this.icon_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.mode_ = 0;
            this.name_ = "";
        }

        public static SwitchSettings getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitchSettings_descriptor;
        }

        public static Builder newBuilder(SwitchSettings switchSettings) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(switchSettings);
        }

        public static SwitchSettings parseDelimitedFrom(InputStream inputStream) {
            return (SwitchSettings) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SwitchSettings parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SwitchSettings> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SwitchSettings)) {
                return super.equals(obj);
            }
            SwitchSettings switchSettings = (SwitchSettings) obj;
            if (hasSwitchId() != switchSettings.hasSwitchId()) {
                return false;
            }
            if ((hasSwitchId() && getSwitchId() != switchSettings.getSwitchId()) || hasBrightness() != switchSettings.hasBrightness()) {
                return false;
            }
            if ((hasBrightness() && getBrightness() != switchSettings.getBrightness()) || hasMode() != switchSettings.hasMode()) {
                return false;
            }
            if ((hasMode() && this.mode_ != switchSettings.mode_) || hasOnPeriod() != switchSettings.hasOnPeriod()) {
                return false;
            }
            if ((hasOnPeriod() && getOnPeriod() != switchSettings.getOnPeriod()) || hasOffPeriod() != switchSettings.hasOffPeriod()) {
                return false;
            }
            if ((hasOffPeriod() && getOffPeriod() != switchSettings.getOffPeriod()) || hasName() != switchSettings.hasName()) {
                return false;
            }
            if ((hasName() && !getName().equals(switchSettings.getName())) || hasColor() != switchSettings.hasColor()) {
                return false;
            }
            if ((!hasColor() || getColor() == switchSettings.getColor()) && hasIcon() == switchSettings.hasIcon()) {
                return (!hasIcon() || getIcon() == switchSettings.getIcon()) && getUnknownFields().equals(switchSettings.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchSettingsOrBuilder
        public int getBrightness() {
            return this.brightness_;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchSettingsOrBuilder
        public int getColor() {
            return this.color_;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchSettingsOrBuilder
        public int getIcon() {
            return this.icon_;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchSettingsOrBuilder
        public SwitchMode getMode() {
            SwitchMode switchModeForNumber = SwitchMode.forNumber(this.mode_);
            return switchModeForNumber == null ? SwitchMode.TOGGLE : switchModeForNumber;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchSettingsOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.name_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchSettingsOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchSettingsOrBuilder
        public int getOffPeriod() {
            return this.offPeriod_;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchSettingsOrBuilder
        public int getOnPeriod() {
            return this.onPeriod_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SwitchSettings> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.switchId_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.brightness_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(3, this.mode_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(4, this.onPeriod_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(5, this.offPeriod_);
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeUInt32Size += GeneratedMessageV3.computeStringSize(100, this.name_);
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(101, this.color_);
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(102, this.icon_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchSettingsOrBuilder
        public int getSwitchId() {
            return this.switchId_;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchSettingsOrBuilder
        public boolean hasBrightness() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchSettingsOrBuilder
        public boolean hasColor() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchSettingsOrBuilder
        public boolean hasIcon() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchSettingsOrBuilder
        public boolean hasMode() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchSettingsOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchSettingsOrBuilder
        public boolean hasOffPeriod() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchSettingsOrBuilder
        public boolean hasOnPeriod() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchSettingsOrBuilder
        public boolean hasSwitchId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSwitchId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSwitchId();
            }
            if (hasBrightness()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getBrightness();
            }
            if (hasMode()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + this.mode_;
            }
            if (hasOnPeriod()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getOnPeriod();
            }
            if (hasOffPeriod()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getOffPeriod();
            }
            if (hasName()) {
                iHashCode = e5.c(iHashCode, 37, 100, 53) + getName().hashCode();
            }
            if (hasColor()) {
                iHashCode = e5.c(iHashCode, 37, 101, 53) + getColor();
            }
            if (hasIcon()) {
                iHashCode = e5.c(iHashCode, 37, 102, 53) + getIcon();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitchSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(SwitchSettings.class, Builder.class);
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
            return new SwitchSettings();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.switchId_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.brightness_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(3, this.mode_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.onPeriod_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.offPeriod_);
            }
            if ((this.bitField0_ & 32) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 100, this.name_);
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeUInt32(101, this.color_);
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeUInt32(102, this.icon_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SwitchSettingsOrBuilder {
            private int bitField0_;
            private int brightness_;
            private int color_;
            private int icon_;
            private int mode_;
            private Object name_;
            private int offPeriod_;
            private int onPeriod_;
            private int switchId_;

            private Builder() {
                this.mode_ = 0;
                this.name_ = "";
            }

            private void buildPartial0(SwitchSettings switchSettings) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    switchSettings.switchId_ = this.switchId_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    switchSettings.brightness_ = this.brightness_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    switchSettings.mode_ = this.mode_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    switchSettings.onPeriod_ = this.onPeriod_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    switchSettings.offPeriod_ = this.offPeriod_;
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    switchSettings.name_ = this.name_;
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    switchSettings.color_ = this.color_;
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    switchSettings.icon_ = this.icon_;
                    i14 |= 128;
                }
                switchSettings.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitchSettings_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwitchSettings build() {
                SwitchSettings switchSettingsBuildPartial = buildPartial();
                if (switchSettingsBuildPartial.isInitialized()) {
                    return switchSettingsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) switchSettingsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwitchSettings buildPartial() {
                SwitchSettings switchSettings = new SwitchSettings(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(switchSettings);
                }
                onBuilt();
                return switchSettings;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.switchId_ = 0;
                this.brightness_ = 0;
                this.mode_ = 0;
                this.onPeriod_ = 0;
                this.offPeriod_ = 0;
                this.name_ = "";
                this.color_ = 0;
                this.icon_ = 0;
                return this;
            }

            public Builder clearBrightness() {
                this.bitField0_ &= -3;
                this.brightness_ = 0;
                onChanged();
                return this;
            }

            public Builder clearColor() {
                this.bitField0_ &= -65;
                this.color_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearIcon() {
                this.bitField0_ &= -129;
                this.icon_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMode() {
                this.bitField0_ &= -5;
                this.mode_ = 0;
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.name_ = SwitchSettings.getDefaultInstance().getName();
                this.bitField0_ &= -33;
                onChanged();
                return this;
            }

            public Builder clearOffPeriod() {
                this.bitField0_ &= -17;
                this.offPeriod_ = 0;
                onChanged();
                return this;
            }

            public Builder clearOnPeriod() {
                this.bitField0_ &= -9;
                this.onPeriod_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSwitchId() {
                this.bitField0_ &= -2;
                this.switchId_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchSettingsOrBuilder
            public int getBrightness() {
                return this.brightness_;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchSettingsOrBuilder
            public int getColor() {
                return this.color_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitchSettings_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchSettingsOrBuilder
            public int getIcon() {
                return this.icon_;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchSettingsOrBuilder
            public SwitchMode getMode() {
                SwitchMode switchModeForNumber = SwitchMode.forNumber(this.mode_);
                return switchModeForNumber == null ? SwitchMode.TOGGLE : switchModeForNumber;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchSettingsOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.name_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchSettingsOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchSettingsOrBuilder
            public int getOffPeriod() {
                return this.offPeriod_;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchSettingsOrBuilder
            public int getOnPeriod() {
                return this.onPeriod_;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchSettingsOrBuilder
            public int getSwitchId() {
                return this.switchId_;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchSettingsOrBuilder
            public boolean hasBrightness() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchSettingsOrBuilder
            public boolean hasColor() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchSettingsOrBuilder
            public boolean hasIcon() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchSettingsOrBuilder
            public boolean hasMode() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchSettingsOrBuilder
            public boolean hasName() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchSettingsOrBuilder
            public boolean hasOffPeriod() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchSettingsOrBuilder
            public boolean hasOnPeriod() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitchSettingsOrBuilder
            public boolean hasSwitchId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitchSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(SwitchSettings.class, Builder.class);
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
                                    this.switchId_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.brightness_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    int i14 = codedInputStream.readEnum();
                                    if (SwitchMode.forNumber(i14) == null) {
                                        mergeUnknownVarintField(3, i14);
                                    } else {
                                        this.mode_ = i14;
                                        this.bitField0_ |= 4;
                                    }
                                } else if (tag == 32) {
                                    this.onPeriod_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.offPeriod_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                } else if (tag == 802) {
                                    this.name_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 32;
                                } else if (tag == 808) {
                                    this.color_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 64;
                                } else if (tag == 816) {
                                    this.icon_ = codedInputStream.readUInt32();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setBrightness(int i14) {
                this.brightness_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setColor(int i14) {
                this.color_ = i14;
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setIcon(int i14) {
                this.icon_ = i14;
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setMode(SwitchMode switchMode) {
                switchMode.getClass();
                this.bitField0_ |= 4;
                this.mode_ = switchMode.getNumber();
                onChanged();
                return this;
            }

            public Builder setName(String str) {
                str.getClass();
                this.name_ = str;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                byteString.getClass();
                this.name_ = byteString;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setOffPeriod(int i14) {
                this.offPeriod_ = i14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setOnPeriod(int i14) {
                this.onPeriod_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSwitchId(int i14) {
                this.switchId_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SwitchSettings getDefaultInstanceForType() {
                return SwitchSettings.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.mode_ = 0;
                this.name_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SwitchSettings) {
                    return mergeFrom((SwitchSettings) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SwitchSettings switchSettings) {
                if (switchSettings == SwitchSettings.getDefaultInstance()) {
                    return this;
                }
                if (switchSettings.hasSwitchId()) {
                    setSwitchId(switchSettings.getSwitchId());
                }
                if (switchSettings.hasBrightness()) {
                    setBrightness(switchSettings.getBrightness());
                }
                if (switchSettings.hasMode()) {
                    setMode(switchSettings.getMode());
                }
                if (switchSettings.hasOnPeriod()) {
                    setOnPeriod(switchSettings.getOnPeriod());
                }
                if (switchSettings.hasOffPeriod()) {
                    setOffPeriod(switchSettings.getOffPeriod());
                }
                if (switchSettings.hasName()) {
                    this.name_ = switchSettings.name_;
                    this.bitField0_ |= 32;
                    onChanged();
                }
                if (switchSettings.hasColor()) {
                    setColor(switchSettings.getColor());
                }
                if (switchSettings.hasIcon()) {
                    setIcon(switchSettings.getIcon());
                }
                mergeUnknownFields(switchSettings.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SwitchSettings getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SwitchSettings parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwitchSettings) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwitchSettings parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SwitchSettings parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SwitchSettings parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SwitchSettings parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SwitchSettings parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SwitchSettings parseFrom(InputStream inputStream) {
            return (SwitchSettings) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SwitchSettings parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwitchSettings) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwitchSettings parseFrom(CodedInputStream codedInputStream) {
            return (SwitchSettings) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SwitchSettings parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwitchSettings) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Icon implements ProtocolMessageEnum {
            NONE(0),
            HEADLIGHT(1),
            ADDT_BATTERY(2),
            AIR_COMPRESSOR(3),
            CB_RADIO(4),
            DFF_LOCKS(5),
            FAN(6),
            FLASHING_LIGHTS(7),
            FOG_LIGHT(8),
            FRIDGE(9),
            GAUGES(10),
            HEADLIGHT_R(11),
            HEATED_SEATS(12),
            HEATERS(13),
            INTERIOR_LIGHT(14),
            LIGHT_BAR(15),
            SOLAR_PANEL(16),
            SPEAKERS(17),
            STROBE_LIGHT(18),
            UNDERCARRIAGE(19),
            USB_CHARGER(20),
            WIFI(21),
            WINCHES(22);

            public static final int ADDT_BATTERY_VALUE = 2;
            public static final int AIR_COMPRESSOR_VALUE = 3;
            public static final int CB_RADIO_VALUE = 4;
            public static final int DFF_LOCKS_VALUE = 5;
            public static final int FAN_VALUE = 6;
            public static final int FLASHING_LIGHTS_VALUE = 7;
            public static final int FOG_LIGHT_VALUE = 8;
            public static final int FRIDGE_VALUE = 9;
            public static final int GAUGES_VALUE = 10;
            public static final int HEADLIGHT_R_VALUE = 11;
            public static final int HEADLIGHT_VALUE = 1;
            public static final int HEATED_SEATS_VALUE = 12;
            public static final int HEATERS_VALUE = 13;
            public static final int INTERIOR_LIGHT_VALUE = 14;
            public static final int LIGHT_BAR_VALUE = 15;
            public static final int NONE_VALUE = 0;
            public static final int SOLAR_PANEL_VALUE = 16;
            public static final int SPEAKERS_VALUE = 17;
            public static final int STROBE_LIGHT_VALUE = 18;
            public static final int UNDERCARRIAGE_VALUE = 19;
            public static final int USB_CHARGER_VALUE = 20;
            public static final int WIFI_VALUE = 21;
            public static final int WINCHES_VALUE = 22;
            private final int value;
            private static final Internal.EnumLiteMap<Icon> internalValueMap = new Internal.EnumLiteMap<Icon>() { // from class: com.garmin.proto.generated.GDISwitcherProto.SwitchSettings.Icon.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Icon findValueByNumber(int i14) {
                    return Icon.forNumber(i14);
                }
            };
            private static final Icon[] VALUES = values();

            Icon(int i14) {
                this.value = i14;
            }

            public static Icon forNumber(int i14) {
                switch (i14) {
                    case 0:
                        return NONE;
                    case 1:
                        return HEADLIGHT;
                    case 2:
                        return ADDT_BATTERY;
                    case 3:
                        return AIR_COMPRESSOR;
                    case 4:
                        return CB_RADIO;
                    case 5:
                        return DFF_LOCKS;
                    case 6:
                        return FAN;
                    case 7:
                        return FLASHING_LIGHTS;
                    case 8:
                        return FOG_LIGHT;
                    case 9:
                        return FRIDGE;
                    case 10:
                        return GAUGES;
                    case 11:
                        return HEADLIGHT_R;
                    case 12:
                        return HEATED_SEATS;
                    case 13:
                        return HEATERS;
                    case 14:
                        return INTERIOR_LIGHT;
                    case 15:
                        return LIGHT_BAR;
                    case 16:
                        return SOLAR_PANEL;
                    case 17:
                        return SPEAKERS;
                    case 18:
                        return STROBE_LIGHT;
                    case 19:
                        return UNDERCARRIAGE;
                    case 20:
                        return USB_CHARGER;
                    case 21:
                        return WIFI;
                    case 22:
                        return WINCHES;
                    default:
                        return null;
                }
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return SwitchSettings.getDescriptor().getEnumTypes().get(1);
            }

            public static Internal.EnumLiteMap<Icon> internalGetValueMap() {
                return internalValueMap;
            }

            public static Icon valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Icon valueOf(int i14) {
                return forNumber(i14);
            }
        }

        public enum SwitchMode implements ProtocolMessageEnum {
            TOGGLE(0),
            MOMENTARY(1),
            STROBE(2);

            public static final int MOMENTARY_VALUE = 1;
            public static final int STROBE_VALUE = 2;
            public static final int TOGGLE_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<SwitchMode> internalValueMap = new Internal.EnumLiteMap<SwitchMode>() { // from class: com.garmin.proto.generated.GDISwitcherProto.SwitchSettings.SwitchMode.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SwitchMode findValueByNumber(int i14) {
                    return SwitchMode.forNumber(i14);
                }
            };
            private static final SwitchMode[] VALUES = values();

            SwitchMode(int i14) {
                this.value = i14;
            }

            public static SwitchMode forNumber(int i14) {
                if (i14 == 0) {
                    return TOGGLE;
                }
                if (i14 == 1) {
                    return MOMENTARY;
                }
                if (i14 != 2) {
                    return null;
                }
                return STROBE;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return SwitchSettings.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<SwitchMode> internalGetValueMap() {
                return internalValueMap;
            }

            public static SwitchMode valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static SwitchMode valueOf(int i14) {
                return forNumber(i14);
            }
        }

        private SwitchSettings(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.switchId_ = 0;
            this.brightness_ = 0;
            this.mode_ = 0;
            this.onPeriod_ = 0;
            this.offPeriod_ = 0;
            this.name_ = "";
            this.color_ = 0;
            this.icon_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ SwitchSettings(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class Switcher extends GeneratedMessageV3 implements SwitcherOrBuilder {
        private static final Switcher DEFAULT_INSTANCE = new Switcher();

        @Deprecated
        public static final Parser<Switcher> PARSER = new AbstractParser<Switcher>() { // from class: com.garmin.proto.generated.GDISwitcherProto.Switcher.1
            @Override // com.google.protobuf.Parser
            public Switcher parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Switcher.newBuilder();
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
        public static final int RESTORE_DEFAULTS_REQUEST_FIELD_NUMBER = 5;
        public static final int RESTORE_DEFAULTS_RESPONSE_FIELD_NUMBER = 6;
        public static final int STATUS_CHANGE_REQUEST_FIELD_NUMBER = 3;
        public static final int STATUS_CHANGE_RESPONSE_FIELD_NUMBER = 4;
        public static final int STATUS_REQUEST_FIELD_NUMBER = 1;
        public static final int STATUS_RESPONSE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private RestoreDefaultsRequest restoreDefaultsRequest_;
        private RestoreDefaultsResponse restoreDefaultsResponse_;
        private SwitcherSettingsChangeRequest statusChangeRequest_;
        private SwitcherSettingsChangeResponse statusChangeResponse_;
        private SwitcherStatusRequest statusRequest_;
        private SwitcherStatusResponse statusResponse_;

        private Switcher(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Switcher getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISwitcherProto.internal_static_GDI_Proto_Switcher_Switcher_descriptor;
        }

        public static Builder newBuilder(Switcher switcher) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(switcher);
        }

        public static Switcher parseDelimitedFrom(InputStream inputStream) {
            return (Switcher) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Switcher parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Switcher> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Switcher)) {
                return super.equals(obj);
            }
            Switcher switcher = (Switcher) obj;
            if (hasStatusRequest() != switcher.hasStatusRequest()) {
                return false;
            }
            if ((hasStatusRequest() && !getStatusRequest().equals(switcher.getStatusRequest())) || hasStatusResponse() != switcher.hasStatusResponse()) {
                return false;
            }
            if ((hasStatusResponse() && !getStatusResponse().equals(switcher.getStatusResponse())) || hasStatusChangeRequest() != switcher.hasStatusChangeRequest()) {
                return false;
            }
            if ((hasStatusChangeRequest() && !getStatusChangeRequest().equals(switcher.getStatusChangeRequest())) || hasStatusChangeResponse() != switcher.hasStatusChangeResponse()) {
                return false;
            }
            if ((hasStatusChangeResponse() && !getStatusChangeResponse().equals(switcher.getStatusChangeResponse())) || hasRestoreDefaultsRequest() != switcher.hasRestoreDefaultsRequest()) {
                return false;
            }
            if ((!hasRestoreDefaultsRequest() || getRestoreDefaultsRequest().equals(switcher.getRestoreDefaultsRequest())) && hasRestoreDefaultsResponse() == switcher.hasRestoreDefaultsResponse()) {
                return (!hasRestoreDefaultsResponse() || getRestoreDefaultsResponse().equals(switcher.getRestoreDefaultsResponse())) && getUnknownFields().equals(switcher.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Switcher> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherOrBuilder
        public RestoreDefaultsRequest getRestoreDefaultsRequest() {
            RestoreDefaultsRequest restoreDefaultsRequest = this.restoreDefaultsRequest_;
            return restoreDefaultsRequest == null ? RestoreDefaultsRequest.getDefaultInstance() : restoreDefaultsRequest;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherOrBuilder
        public RestoreDefaultsRequestOrBuilder getRestoreDefaultsRequestOrBuilder() {
            RestoreDefaultsRequest restoreDefaultsRequest = this.restoreDefaultsRequest_;
            return restoreDefaultsRequest == null ? RestoreDefaultsRequest.getDefaultInstance() : restoreDefaultsRequest;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherOrBuilder
        public RestoreDefaultsResponse getRestoreDefaultsResponse() {
            RestoreDefaultsResponse restoreDefaultsResponse = this.restoreDefaultsResponse_;
            return restoreDefaultsResponse == null ? RestoreDefaultsResponse.getDefaultInstance() : restoreDefaultsResponse;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherOrBuilder
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
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getStatusRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getStatusResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getStatusChangeRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getStatusChangeResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getRestoreDefaultsRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getRestoreDefaultsResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherOrBuilder
        public SwitcherSettingsChangeRequest getStatusChangeRequest() {
            SwitcherSettingsChangeRequest switcherSettingsChangeRequest = this.statusChangeRequest_;
            return switcherSettingsChangeRequest == null ? SwitcherSettingsChangeRequest.getDefaultInstance() : switcherSettingsChangeRequest;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherOrBuilder
        public SwitcherSettingsChangeRequestOrBuilder getStatusChangeRequestOrBuilder() {
            SwitcherSettingsChangeRequest switcherSettingsChangeRequest = this.statusChangeRequest_;
            return switcherSettingsChangeRequest == null ? SwitcherSettingsChangeRequest.getDefaultInstance() : switcherSettingsChangeRequest;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherOrBuilder
        public SwitcherSettingsChangeResponse getStatusChangeResponse() {
            SwitcherSettingsChangeResponse switcherSettingsChangeResponse = this.statusChangeResponse_;
            return switcherSettingsChangeResponse == null ? SwitcherSettingsChangeResponse.getDefaultInstance() : switcherSettingsChangeResponse;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherOrBuilder
        public SwitcherSettingsChangeResponseOrBuilder getStatusChangeResponseOrBuilder() {
            SwitcherSettingsChangeResponse switcherSettingsChangeResponse = this.statusChangeResponse_;
            return switcherSettingsChangeResponse == null ? SwitcherSettingsChangeResponse.getDefaultInstance() : switcherSettingsChangeResponse;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherOrBuilder
        public SwitcherStatusRequest getStatusRequest() {
            SwitcherStatusRequest switcherStatusRequest = this.statusRequest_;
            return switcherStatusRequest == null ? SwitcherStatusRequest.getDefaultInstance() : switcherStatusRequest;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherOrBuilder
        public SwitcherStatusRequestOrBuilder getStatusRequestOrBuilder() {
            SwitcherStatusRequest switcherStatusRequest = this.statusRequest_;
            return switcherStatusRequest == null ? SwitcherStatusRequest.getDefaultInstance() : switcherStatusRequest;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherOrBuilder
        public SwitcherStatusResponse getStatusResponse() {
            SwitcherStatusResponse switcherStatusResponse = this.statusResponse_;
            return switcherStatusResponse == null ? SwitcherStatusResponse.getDefaultInstance() : switcherStatusResponse;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherOrBuilder
        public SwitcherStatusResponseOrBuilder getStatusResponseOrBuilder() {
            SwitcherStatusResponse switcherStatusResponse = this.statusResponse_;
            return switcherStatusResponse == null ? SwitcherStatusResponse.getDefaultInstance() : switcherStatusResponse;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherOrBuilder
        public boolean hasRestoreDefaultsRequest() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherOrBuilder
        public boolean hasRestoreDefaultsResponse() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherOrBuilder
        public boolean hasStatusChangeRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherOrBuilder
        public boolean hasStatusChangeResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherOrBuilder
        public boolean hasStatusRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherOrBuilder
        public boolean hasStatusResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasStatusRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getStatusRequest().hashCode();
            }
            if (hasStatusResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getStatusResponse().hashCode();
            }
            if (hasStatusChangeRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getStatusChangeRequest().hashCode();
            }
            if (hasStatusChangeResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getStatusChangeResponse().hashCode();
            }
            if (hasRestoreDefaultsRequest()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getRestoreDefaultsRequest().hashCode();
            }
            if (hasRestoreDefaultsResponse()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getRestoreDefaultsResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISwitcherProto.internal_static_GDI_Proto_Switcher_Switcher_fieldAccessorTable.ensureFieldAccessorsInitialized(Switcher.class, Builder.class);
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
            return new Switcher();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getStatusRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getStatusResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getStatusChangeRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getStatusChangeResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getRestoreDefaultsRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getRestoreDefaultsResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SwitcherOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<RestoreDefaultsRequest, RestoreDefaultsRequest.Builder, RestoreDefaultsRequestOrBuilder> restoreDefaultsRequestBuilder_;
            private RestoreDefaultsRequest restoreDefaultsRequest_;
            private SingleFieldBuilderV3<RestoreDefaultsResponse, RestoreDefaultsResponse.Builder, RestoreDefaultsResponseOrBuilder> restoreDefaultsResponseBuilder_;
            private RestoreDefaultsResponse restoreDefaultsResponse_;
            private SingleFieldBuilderV3<SwitcherSettingsChangeRequest, SwitcherSettingsChangeRequest.Builder, SwitcherSettingsChangeRequestOrBuilder> statusChangeRequestBuilder_;
            private SwitcherSettingsChangeRequest statusChangeRequest_;
            private SingleFieldBuilderV3<SwitcherSettingsChangeResponse, SwitcherSettingsChangeResponse.Builder, SwitcherSettingsChangeResponseOrBuilder> statusChangeResponseBuilder_;
            private SwitcherSettingsChangeResponse statusChangeResponse_;
            private SingleFieldBuilderV3<SwitcherStatusRequest, SwitcherStatusRequest.Builder, SwitcherStatusRequestOrBuilder> statusRequestBuilder_;
            private SwitcherStatusRequest statusRequest_;
            private SingleFieldBuilderV3<SwitcherStatusResponse, SwitcherStatusResponse.Builder, SwitcherStatusResponseOrBuilder> statusResponseBuilder_;
            private SwitcherStatusResponse statusResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Switcher switcher) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<SwitcherStatusRequest, SwitcherStatusRequest.Builder, SwitcherStatusRequestOrBuilder> singleFieldBuilderV3 = this.statusRequestBuilder_;
                    switcher.statusRequest_ = singleFieldBuilderV3 == null ? this.statusRequest_ : (SwitcherStatusRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<SwitcherStatusResponse, SwitcherStatusResponse.Builder, SwitcherStatusResponseOrBuilder> singleFieldBuilderV4 = this.statusResponseBuilder_;
                    switcher.statusResponse_ = singleFieldBuilderV4 == null ? this.statusResponse_ : (SwitcherStatusResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<SwitcherSettingsChangeRequest, SwitcherSettingsChangeRequest.Builder, SwitcherSettingsChangeRequestOrBuilder> singleFieldBuilderV5 = this.statusChangeRequestBuilder_;
                    switcher.statusChangeRequest_ = singleFieldBuilderV5 == null ? this.statusChangeRequest_ : (SwitcherSettingsChangeRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<SwitcherSettingsChangeResponse, SwitcherSettingsChangeResponse.Builder, SwitcherSettingsChangeResponseOrBuilder> singleFieldBuilderV6 = this.statusChangeResponseBuilder_;
                    switcher.statusChangeResponse_ = singleFieldBuilderV6 == null ? this.statusChangeResponse_ : (SwitcherSettingsChangeResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<RestoreDefaultsRequest, RestoreDefaultsRequest.Builder, RestoreDefaultsRequestOrBuilder> singleFieldBuilderV7 = this.restoreDefaultsRequestBuilder_;
                    switcher.restoreDefaultsRequest_ = singleFieldBuilderV7 == null ? this.restoreDefaultsRequest_ : (RestoreDefaultsRequest) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<RestoreDefaultsResponse, RestoreDefaultsResponse.Builder, RestoreDefaultsResponseOrBuilder> singleFieldBuilderV8 = this.restoreDefaultsResponseBuilder_;
                    switcher.restoreDefaultsResponse_ = singleFieldBuilderV8 == null ? this.restoreDefaultsResponse_ : (RestoreDefaultsResponse) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                switcher.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_Switcher_descriptor;
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

            private SingleFieldBuilderV3<SwitcherSettingsChangeRequest, SwitcherSettingsChangeRequest.Builder, SwitcherSettingsChangeRequestOrBuilder> getStatusChangeRequestFieldBuilder() {
                if (this.statusChangeRequestBuilder_ == null) {
                    this.statusChangeRequestBuilder_ = new SingleFieldBuilderV3<>(getStatusChangeRequest(), getParentForChildren(), isClean());
                    this.statusChangeRequest_ = null;
                }
                return this.statusChangeRequestBuilder_;
            }

            private SingleFieldBuilderV3<SwitcherSettingsChangeResponse, SwitcherSettingsChangeResponse.Builder, SwitcherSettingsChangeResponseOrBuilder> getStatusChangeResponseFieldBuilder() {
                if (this.statusChangeResponseBuilder_ == null) {
                    this.statusChangeResponseBuilder_ = new SingleFieldBuilderV3<>(getStatusChangeResponse(), getParentForChildren(), isClean());
                    this.statusChangeResponse_ = null;
                }
                return this.statusChangeResponseBuilder_;
            }

            private SingleFieldBuilderV3<SwitcherStatusRequest, SwitcherStatusRequest.Builder, SwitcherStatusRequestOrBuilder> getStatusRequestFieldBuilder() {
                if (this.statusRequestBuilder_ == null) {
                    this.statusRequestBuilder_ = new SingleFieldBuilderV3<>(getStatusRequest(), getParentForChildren(), isClean());
                    this.statusRequest_ = null;
                }
                return this.statusRequestBuilder_;
            }

            private SingleFieldBuilderV3<SwitcherStatusResponse, SwitcherStatusResponse.Builder, SwitcherStatusResponseOrBuilder> getStatusResponseFieldBuilder() {
                if (this.statusResponseBuilder_ == null) {
                    this.statusResponseBuilder_ = new SingleFieldBuilderV3<>(getStatusResponse(), getParentForChildren(), isClean());
                    this.statusResponse_ = null;
                }
                return this.statusResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getStatusRequestFieldBuilder();
                    getStatusResponseFieldBuilder();
                    getStatusChangeRequestFieldBuilder();
                    getStatusChangeResponseFieldBuilder();
                    getRestoreDefaultsRequestFieldBuilder();
                    getRestoreDefaultsResponseFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Switcher build() {
                Switcher switcherBuildPartial = buildPartial();
                if (switcherBuildPartial.isInitialized()) {
                    return switcherBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) switcherBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Switcher buildPartial() {
                Switcher switcher = new Switcher(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(switcher);
                }
                onBuilt();
                return switcher;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.statusRequest_ = null;
                SingleFieldBuilderV3<SwitcherStatusRequest, SwitcherStatusRequest.Builder, SwitcherStatusRequestOrBuilder> singleFieldBuilderV3 = this.statusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.statusRequestBuilder_ = null;
                }
                this.statusResponse_ = null;
                SingleFieldBuilderV3<SwitcherStatusResponse, SwitcherStatusResponse.Builder, SwitcherStatusResponseOrBuilder> singleFieldBuilderV4 = this.statusResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.statusResponseBuilder_ = null;
                }
                this.statusChangeRequest_ = null;
                SingleFieldBuilderV3<SwitcherSettingsChangeRequest, SwitcherSettingsChangeRequest.Builder, SwitcherSettingsChangeRequestOrBuilder> singleFieldBuilderV5 = this.statusChangeRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.statusChangeRequestBuilder_ = null;
                }
                this.statusChangeResponse_ = null;
                SingleFieldBuilderV3<SwitcherSettingsChangeResponse, SwitcherSettingsChangeResponse.Builder, SwitcherSettingsChangeResponseOrBuilder> singleFieldBuilderV6 = this.statusChangeResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.statusChangeResponseBuilder_ = null;
                }
                this.restoreDefaultsRequest_ = null;
                SingleFieldBuilderV3<RestoreDefaultsRequest, RestoreDefaultsRequest.Builder, RestoreDefaultsRequestOrBuilder> singleFieldBuilderV7 = this.restoreDefaultsRequestBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.restoreDefaultsRequestBuilder_ = null;
                }
                this.restoreDefaultsResponse_ = null;
                SingleFieldBuilderV3<RestoreDefaultsResponse, RestoreDefaultsResponse.Builder, RestoreDefaultsResponseOrBuilder> singleFieldBuilderV8 = this.restoreDefaultsResponseBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.restoreDefaultsResponseBuilder_ = null;
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

            public Builder clearRestoreDefaultsRequest() {
                this.bitField0_ &= -17;
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
                this.bitField0_ &= -33;
                this.restoreDefaultsResponse_ = null;
                SingleFieldBuilderV3<RestoreDefaultsResponse, RestoreDefaultsResponse.Builder, RestoreDefaultsResponseOrBuilder> singleFieldBuilderV3 = this.restoreDefaultsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.restoreDefaultsResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStatusChangeRequest() {
                this.bitField0_ &= -5;
                this.statusChangeRequest_ = null;
                SingleFieldBuilderV3<SwitcherSettingsChangeRequest, SwitcherSettingsChangeRequest.Builder, SwitcherSettingsChangeRequestOrBuilder> singleFieldBuilderV3 = this.statusChangeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.statusChangeRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStatusChangeResponse() {
                this.bitField0_ &= -9;
                this.statusChangeResponse_ = null;
                SingleFieldBuilderV3<SwitcherSettingsChangeResponse, SwitcherSettingsChangeResponse.Builder, SwitcherSettingsChangeResponseOrBuilder> singleFieldBuilderV3 = this.statusChangeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.statusChangeResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStatusRequest() {
                this.bitField0_ &= -2;
                this.statusRequest_ = null;
                SingleFieldBuilderV3<SwitcherStatusRequest, SwitcherStatusRequest.Builder, SwitcherStatusRequestOrBuilder> singleFieldBuilderV3 = this.statusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.statusRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearStatusResponse() {
                this.bitField0_ &= -3;
                this.statusResponse_ = null;
                SingleFieldBuilderV3<SwitcherStatusResponse, SwitcherStatusResponse.Builder, SwitcherStatusResponseOrBuilder> singleFieldBuilderV3 = this.statusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.statusResponseBuilder_ = null;
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
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_Switcher_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherOrBuilder
            public RestoreDefaultsRequest getRestoreDefaultsRequest() {
                SingleFieldBuilderV3<RestoreDefaultsRequest, RestoreDefaultsRequest.Builder, RestoreDefaultsRequestOrBuilder> singleFieldBuilderV3 = this.restoreDefaultsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RestoreDefaultsRequest) singleFieldBuilderV3.getMessage();
                }
                RestoreDefaultsRequest restoreDefaultsRequest = this.restoreDefaultsRequest_;
                return restoreDefaultsRequest == null ? RestoreDefaultsRequest.getDefaultInstance() : restoreDefaultsRequest;
            }

            public RestoreDefaultsRequest.Builder getRestoreDefaultsRequestBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (RestoreDefaultsRequest.Builder) getRestoreDefaultsRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherOrBuilder
            public RestoreDefaultsRequestOrBuilder getRestoreDefaultsRequestOrBuilder() {
                SingleFieldBuilderV3<RestoreDefaultsRequest, RestoreDefaultsRequest.Builder, RestoreDefaultsRequestOrBuilder> singleFieldBuilderV3 = this.restoreDefaultsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RestoreDefaultsRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                RestoreDefaultsRequest restoreDefaultsRequest = this.restoreDefaultsRequest_;
                return restoreDefaultsRequest == null ? RestoreDefaultsRequest.getDefaultInstance() : restoreDefaultsRequest;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherOrBuilder
            public RestoreDefaultsResponse getRestoreDefaultsResponse() {
                SingleFieldBuilderV3<RestoreDefaultsResponse, RestoreDefaultsResponse.Builder, RestoreDefaultsResponseOrBuilder> singleFieldBuilderV3 = this.restoreDefaultsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RestoreDefaultsResponse) singleFieldBuilderV3.getMessage();
                }
                RestoreDefaultsResponse restoreDefaultsResponse = this.restoreDefaultsResponse_;
                return restoreDefaultsResponse == null ? RestoreDefaultsResponse.getDefaultInstance() : restoreDefaultsResponse;
            }

            public RestoreDefaultsResponse.Builder getRestoreDefaultsResponseBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (RestoreDefaultsResponse.Builder) getRestoreDefaultsResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherOrBuilder
            public RestoreDefaultsResponseOrBuilder getRestoreDefaultsResponseOrBuilder() {
                SingleFieldBuilderV3<RestoreDefaultsResponse, RestoreDefaultsResponse.Builder, RestoreDefaultsResponseOrBuilder> singleFieldBuilderV3 = this.restoreDefaultsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (RestoreDefaultsResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                RestoreDefaultsResponse restoreDefaultsResponse = this.restoreDefaultsResponse_;
                return restoreDefaultsResponse == null ? RestoreDefaultsResponse.getDefaultInstance() : restoreDefaultsResponse;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherOrBuilder
            public SwitcherSettingsChangeRequest getStatusChangeRequest() {
                SingleFieldBuilderV3<SwitcherSettingsChangeRequest, SwitcherSettingsChangeRequest.Builder, SwitcherSettingsChangeRequestOrBuilder> singleFieldBuilderV3 = this.statusChangeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwitcherSettingsChangeRequest) singleFieldBuilderV3.getMessage();
                }
                SwitcherSettingsChangeRequest switcherSettingsChangeRequest = this.statusChangeRequest_;
                return switcherSettingsChangeRequest == null ? SwitcherSettingsChangeRequest.getDefaultInstance() : switcherSettingsChangeRequest;
            }

            public SwitcherSettingsChangeRequest.Builder getStatusChangeRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (SwitcherSettingsChangeRequest.Builder) getStatusChangeRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherOrBuilder
            public SwitcherSettingsChangeRequestOrBuilder getStatusChangeRequestOrBuilder() {
                SingleFieldBuilderV3<SwitcherSettingsChangeRequest, SwitcherSettingsChangeRequest.Builder, SwitcherSettingsChangeRequestOrBuilder> singleFieldBuilderV3 = this.statusChangeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwitcherSettingsChangeRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SwitcherSettingsChangeRequest switcherSettingsChangeRequest = this.statusChangeRequest_;
                return switcherSettingsChangeRequest == null ? SwitcherSettingsChangeRequest.getDefaultInstance() : switcherSettingsChangeRequest;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherOrBuilder
            public SwitcherSettingsChangeResponse getStatusChangeResponse() {
                SingleFieldBuilderV3<SwitcherSettingsChangeResponse, SwitcherSettingsChangeResponse.Builder, SwitcherSettingsChangeResponseOrBuilder> singleFieldBuilderV3 = this.statusChangeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwitcherSettingsChangeResponse) singleFieldBuilderV3.getMessage();
                }
                SwitcherSettingsChangeResponse switcherSettingsChangeResponse = this.statusChangeResponse_;
                return switcherSettingsChangeResponse == null ? SwitcherSettingsChangeResponse.getDefaultInstance() : switcherSettingsChangeResponse;
            }

            public SwitcherSettingsChangeResponse.Builder getStatusChangeResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (SwitcherSettingsChangeResponse.Builder) getStatusChangeResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherOrBuilder
            public SwitcherSettingsChangeResponseOrBuilder getStatusChangeResponseOrBuilder() {
                SingleFieldBuilderV3<SwitcherSettingsChangeResponse, SwitcherSettingsChangeResponse.Builder, SwitcherSettingsChangeResponseOrBuilder> singleFieldBuilderV3 = this.statusChangeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwitcherSettingsChangeResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SwitcherSettingsChangeResponse switcherSettingsChangeResponse = this.statusChangeResponse_;
                return switcherSettingsChangeResponse == null ? SwitcherSettingsChangeResponse.getDefaultInstance() : switcherSettingsChangeResponse;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherOrBuilder
            public SwitcherStatusRequest getStatusRequest() {
                SingleFieldBuilderV3<SwitcherStatusRequest, SwitcherStatusRequest.Builder, SwitcherStatusRequestOrBuilder> singleFieldBuilderV3 = this.statusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwitcherStatusRequest) singleFieldBuilderV3.getMessage();
                }
                SwitcherStatusRequest switcherStatusRequest = this.statusRequest_;
                return switcherStatusRequest == null ? SwitcherStatusRequest.getDefaultInstance() : switcherStatusRequest;
            }

            public SwitcherStatusRequest.Builder getStatusRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SwitcherStatusRequest.Builder) getStatusRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherOrBuilder
            public SwitcherStatusRequestOrBuilder getStatusRequestOrBuilder() {
                SingleFieldBuilderV3<SwitcherStatusRequest, SwitcherStatusRequest.Builder, SwitcherStatusRequestOrBuilder> singleFieldBuilderV3 = this.statusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwitcherStatusRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SwitcherStatusRequest switcherStatusRequest = this.statusRequest_;
                return switcherStatusRequest == null ? SwitcherStatusRequest.getDefaultInstance() : switcherStatusRequest;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherOrBuilder
            public SwitcherStatusResponse getStatusResponse() {
                SingleFieldBuilderV3<SwitcherStatusResponse, SwitcherStatusResponse.Builder, SwitcherStatusResponseOrBuilder> singleFieldBuilderV3 = this.statusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwitcherStatusResponse) singleFieldBuilderV3.getMessage();
                }
                SwitcherStatusResponse switcherStatusResponse = this.statusResponse_;
                return switcherStatusResponse == null ? SwitcherStatusResponse.getDefaultInstance() : switcherStatusResponse;
            }

            public SwitcherStatusResponse.Builder getStatusResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (SwitcherStatusResponse.Builder) getStatusResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherOrBuilder
            public SwitcherStatusResponseOrBuilder getStatusResponseOrBuilder() {
                SingleFieldBuilderV3<SwitcherStatusResponse, SwitcherStatusResponse.Builder, SwitcherStatusResponseOrBuilder> singleFieldBuilderV3 = this.statusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwitcherStatusResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SwitcherStatusResponse switcherStatusResponse = this.statusResponse_;
                return switcherStatusResponse == null ? SwitcherStatusResponse.getDefaultInstance() : switcherStatusResponse;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherOrBuilder
            public boolean hasRestoreDefaultsRequest() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherOrBuilder
            public boolean hasRestoreDefaultsResponse() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherOrBuilder
            public boolean hasStatusChangeRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherOrBuilder
            public boolean hasStatusChangeResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherOrBuilder
            public boolean hasStatusRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherOrBuilder
            public boolean hasStatusResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_Switcher_fieldAccessorTable.ensureFieldAccessorsInitialized(Switcher.class, Builder.class);
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
                                    codedInputStream.readMessage(getStatusRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getStatusResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getStatusChangeRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getStatusChangeResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(getRestoreDefaultsRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                } else if (tag == 50) {
                                    codedInputStream.readMessage(getRestoreDefaultsResponseFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeRestoreDefaultsRequest(RestoreDefaultsRequest restoreDefaultsRequest) {
                RestoreDefaultsRequest restoreDefaultsRequest2;
                SingleFieldBuilderV3<RestoreDefaultsRequest, RestoreDefaultsRequest.Builder, RestoreDefaultsRequestOrBuilder> singleFieldBuilderV3 = this.restoreDefaultsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(restoreDefaultsRequest);
                } else if ((this.bitField0_ & 16) == 0 || (restoreDefaultsRequest2 = this.restoreDefaultsRequest_) == null || restoreDefaultsRequest2 == RestoreDefaultsRequest.getDefaultInstance()) {
                    this.restoreDefaultsRequest_ = restoreDefaultsRequest;
                } else {
                    getRestoreDefaultsRequestBuilder().mergeFrom(restoreDefaultsRequest);
                }
                if (this.restoreDefaultsRequest_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeRestoreDefaultsResponse(RestoreDefaultsResponse restoreDefaultsResponse) {
                RestoreDefaultsResponse restoreDefaultsResponse2;
                SingleFieldBuilderV3<RestoreDefaultsResponse, RestoreDefaultsResponse.Builder, RestoreDefaultsResponseOrBuilder> singleFieldBuilderV3 = this.restoreDefaultsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(restoreDefaultsResponse);
                } else if ((this.bitField0_ & 32) == 0 || (restoreDefaultsResponse2 = this.restoreDefaultsResponse_) == null || restoreDefaultsResponse2 == RestoreDefaultsResponse.getDefaultInstance()) {
                    this.restoreDefaultsResponse_ = restoreDefaultsResponse;
                } else {
                    getRestoreDefaultsResponseBuilder().mergeFrom(restoreDefaultsResponse);
                }
                if (this.restoreDefaultsResponse_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStatusChangeRequest(SwitcherSettingsChangeRequest switcherSettingsChangeRequest) {
                SwitcherSettingsChangeRequest switcherSettingsChangeRequest2;
                SingleFieldBuilderV3<SwitcherSettingsChangeRequest, SwitcherSettingsChangeRequest.Builder, SwitcherSettingsChangeRequestOrBuilder> singleFieldBuilderV3 = this.statusChangeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(switcherSettingsChangeRequest);
                } else if ((this.bitField0_ & 4) == 0 || (switcherSettingsChangeRequest2 = this.statusChangeRequest_) == null || switcherSettingsChangeRequest2 == SwitcherSettingsChangeRequest.getDefaultInstance()) {
                    this.statusChangeRequest_ = switcherSettingsChangeRequest;
                } else {
                    getStatusChangeRequestBuilder().mergeFrom(switcherSettingsChangeRequest);
                }
                if (this.statusChangeRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStatusChangeResponse(SwitcherSettingsChangeResponse switcherSettingsChangeResponse) {
                SwitcherSettingsChangeResponse switcherSettingsChangeResponse2;
                SingleFieldBuilderV3<SwitcherSettingsChangeResponse, SwitcherSettingsChangeResponse.Builder, SwitcherSettingsChangeResponseOrBuilder> singleFieldBuilderV3 = this.statusChangeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(switcherSettingsChangeResponse);
                } else if ((this.bitField0_ & 8) == 0 || (switcherSettingsChangeResponse2 = this.statusChangeResponse_) == null || switcherSettingsChangeResponse2 == SwitcherSettingsChangeResponse.getDefaultInstance()) {
                    this.statusChangeResponse_ = switcherSettingsChangeResponse;
                } else {
                    getStatusChangeResponseBuilder().mergeFrom(switcherSettingsChangeResponse);
                }
                if (this.statusChangeResponse_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStatusRequest(SwitcherStatusRequest switcherStatusRequest) {
                SwitcherStatusRequest switcherStatusRequest2;
                SingleFieldBuilderV3<SwitcherStatusRequest, SwitcherStatusRequest.Builder, SwitcherStatusRequestOrBuilder> singleFieldBuilderV3 = this.statusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(switcherStatusRequest);
                } else if ((this.bitField0_ & 1) == 0 || (switcherStatusRequest2 = this.statusRequest_) == null || switcherStatusRequest2 == SwitcherStatusRequest.getDefaultInstance()) {
                    this.statusRequest_ = switcherStatusRequest;
                } else {
                    getStatusRequestBuilder().mergeFrom(switcherStatusRequest);
                }
                if (this.statusRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeStatusResponse(SwitcherStatusResponse switcherStatusResponse) {
                SwitcherStatusResponse switcherStatusResponse2;
                SingleFieldBuilderV3<SwitcherStatusResponse, SwitcherStatusResponse.Builder, SwitcherStatusResponseOrBuilder> singleFieldBuilderV3 = this.statusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(switcherStatusResponse);
                } else if ((this.bitField0_ & 2) == 0 || (switcherStatusResponse2 = this.statusResponse_) == null || switcherStatusResponse2 == SwitcherStatusResponse.getDefaultInstance()) {
                    this.statusResponse_ = switcherStatusResponse;
                } else {
                    getStatusResponseBuilder().mergeFrom(switcherStatusResponse);
                }
                if (this.statusResponse_ != null) {
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

            public Builder setRestoreDefaultsRequest(RestoreDefaultsRequest.Builder builder) {
                SingleFieldBuilderV3<RestoreDefaultsRequest, RestoreDefaultsRequest.Builder, RestoreDefaultsRequestOrBuilder> singleFieldBuilderV3 = this.restoreDefaultsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.restoreDefaultsRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
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
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setStatusChangeRequest(SwitcherSettingsChangeRequest.Builder builder) {
                SingleFieldBuilderV3<SwitcherSettingsChangeRequest, SwitcherSettingsChangeRequest.Builder, SwitcherSettingsChangeRequestOrBuilder> singleFieldBuilderV3 = this.statusChangeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.statusChangeRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setStatusChangeResponse(SwitcherSettingsChangeResponse.Builder builder) {
                SingleFieldBuilderV3<SwitcherSettingsChangeResponse, SwitcherSettingsChangeResponse.Builder, SwitcherSettingsChangeResponseOrBuilder> singleFieldBuilderV3 = this.statusChangeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.statusChangeResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setStatusRequest(SwitcherStatusRequest.Builder builder) {
                SingleFieldBuilderV3<SwitcherStatusRequest, SwitcherStatusRequest.Builder, SwitcherStatusRequestOrBuilder> singleFieldBuilderV3 = this.statusRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.statusRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setStatusResponse(SwitcherStatusResponse.Builder builder) {
                SingleFieldBuilderV3<SwitcherStatusResponse, SwitcherStatusResponse.Builder, SwitcherStatusResponseOrBuilder> singleFieldBuilderV3 = this.statusResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.statusResponse_ = builder.build();
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
            public Switcher getDefaultInstanceForType() {
                return Switcher.getDefaultInstance();
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

            public Builder setRestoreDefaultsRequest(RestoreDefaultsRequest restoreDefaultsRequest) {
                SingleFieldBuilderV3<RestoreDefaultsRequest, RestoreDefaultsRequest.Builder, RestoreDefaultsRequestOrBuilder> singleFieldBuilderV3 = this.restoreDefaultsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    restoreDefaultsRequest.getClass();
                    this.restoreDefaultsRequest_ = restoreDefaultsRequest;
                } else {
                    singleFieldBuilderV3.setMessage(restoreDefaultsRequest);
                }
                this.bitField0_ |= 16;
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
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setStatusChangeRequest(SwitcherSettingsChangeRequest switcherSettingsChangeRequest) {
                SingleFieldBuilderV3<SwitcherSettingsChangeRequest, SwitcherSettingsChangeRequest.Builder, SwitcherSettingsChangeRequestOrBuilder> singleFieldBuilderV3 = this.statusChangeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    switcherSettingsChangeRequest.getClass();
                    this.statusChangeRequest_ = switcherSettingsChangeRequest;
                } else {
                    singleFieldBuilderV3.setMessage(switcherSettingsChangeRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setStatusChangeResponse(SwitcherSettingsChangeResponse switcherSettingsChangeResponse) {
                SingleFieldBuilderV3<SwitcherSettingsChangeResponse, SwitcherSettingsChangeResponse.Builder, SwitcherSettingsChangeResponseOrBuilder> singleFieldBuilderV3 = this.statusChangeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    switcherSettingsChangeResponse.getClass();
                    this.statusChangeResponse_ = switcherSettingsChangeResponse;
                } else {
                    singleFieldBuilderV3.setMessage(switcherSettingsChangeResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setStatusRequest(SwitcherStatusRequest switcherStatusRequest) {
                SingleFieldBuilderV3<SwitcherStatusRequest, SwitcherStatusRequest.Builder, SwitcherStatusRequestOrBuilder> singleFieldBuilderV3 = this.statusRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    switcherStatusRequest.getClass();
                    this.statusRequest_ = switcherStatusRequest;
                } else {
                    singleFieldBuilderV3.setMessage(switcherStatusRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setStatusResponse(SwitcherStatusResponse switcherStatusResponse) {
                SingleFieldBuilderV3<SwitcherStatusResponse, SwitcherStatusResponse.Builder, SwitcherStatusResponseOrBuilder> singleFieldBuilderV3 = this.statusResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    switcherStatusResponse.getClass();
                    this.statusResponse_ = switcherStatusResponse;
                } else {
                    singleFieldBuilderV3.setMessage(switcherStatusResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Switcher) {
                    return mergeFrom((Switcher) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Switcher switcher) {
                if (switcher == Switcher.getDefaultInstance()) {
                    return this;
                }
                if (switcher.hasStatusRequest()) {
                    mergeStatusRequest(switcher.getStatusRequest());
                }
                if (switcher.hasStatusResponse()) {
                    mergeStatusResponse(switcher.getStatusResponse());
                }
                if (switcher.hasStatusChangeRequest()) {
                    mergeStatusChangeRequest(switcher.getStatusChangeRequest());
                }
                if (switcher.hasStatusChangeResponse()) {
                    mergeStatusChangeResponse(switcher.getStatusChangeResponse());
                }
                if (switcher.hasRestoreDefaultsRequest()) {
                    mergeRestoreDefaultsRequest(switcher.getRestoreDefaultsRequest());
                }
                if (switcher.hasRestoreDefaultsResponse()) {
                    mergeRestoreDefaultsResponse(switcher.getRestoreDefaultsResponse());
                }
                mergeUnknownFields(switcher.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Switcher getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ Switcher(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private Switcher() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Switcher parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Switcher) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Switcher parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Switcher parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Switcher parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Switcher parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Switcher parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Switcher parseFrom(InputStream inputStream) {
            return (Switcher) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Switcher parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Switcher) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Switcher parseFrom(CodedInputStream codedInputStream) {
            return (Switcher) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Switcher parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Switcher) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SwitcherSettings extends GeneratedMessageV3 implements SwitcherSettingsOrBuilder {
        public static final int AUTO_OFF_FIELD_NUMBER = 4;
        public static final int CUSTOM_SETTINGS_FIELD_NUMBER = 2;
        public static final int INPUT_SETTINGS_FIELD_NUMBER = 3;
        public static final int NAME_FIELD_NUMBER = 5;
        public static final int SWITCH_SETTINGS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private boolean autoOff_;
        private int bitField0_;
        private List<SwitchSettings> customSettings_;
        private List<InputSettings> inputSettings_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private List<SwitchSettings> switchSettings_;
        private static final SwitcherSettings DEFAULT_INSTANCE = new SwitcherSettings();

        @Deprecated
        public static final Parser<SwitcherSettings> PARSER = new AbstractParser<SwitcherSettings>() { // from class: com.garmin.proto.generated.GDISwitcherProto.SwitcherSettings.1
            @Override // com.google.protobuf.Parser
            public SwitcherSettings parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SwitcherSettings.newBuilder();
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

        private SwitcherSettings() {
            this.autoOff_ = false;
            this.name_ = "";
            this.memoizedIsInitialized = (byte) -1;
            List list = Collections.EMPTY_LIST;
            this.switchSettings_ = list;
            this.customSettings_ = list;
            this.inputSettings_ = list;
            this.name_ = "";
        }

        public static SwitcherSettings getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitcherSettings_descriptor;
        }

        public static Builder newBuilder(SwitcherSettings switcherSettings) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(switcherSettings);
        }

        public static SwitcherSettings parseDelimitedFrom(InputStream inputStream) {
            return (SwitcherSettings) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SwitcherSettings parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SwitcherSettings> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SwitcherSettings)) {
                return super.equals(obj);
            }
            SwitcherSettings switcherSettings = (SwitcherSettings) obj;
            if (!getSwitchSettingsList().equals(switcherSettings.getSwitchSettingsList()) || !getCustomSettingsList().equals(switcherSettings.getCustomSettingsList()) || !getInputSettingsList().equals(switcherSettings.getInputSettingsList()) || hasAutoOff() != switcherSettings.hasAutoOff()) {
                return false;
            }
            if ((!hasAutoOff() || getAutoOff() == switcherSettings.getAutoOff()) && hasName() == switcherSettings.hasName()) {
                return (!hasName() || getName().equals(switcherSettings.getName())) && getUnknownFields().equals(switcherSettings.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
        public boolean getAutoOff() {
            return this.autoOff_;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
        public SwitchSettings getCustomSettings(int i14) {
            return this.customSettings_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
        public int getCustomSettingsCount() {
            return this.customSettings_.size();
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
        public List<SwitchSettings> getCustomSettingsList() {
            return this.customSettings_;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
        public SwitchSettingsOrBuilder getCustomSettingsOrBuilder(int i14) {
            return this.customSettings_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
        public List<? extends SwitchSettingsOrBuilder> getCustomSettingsOrBuilderList() {
            return this.customSettings_;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
        public InputSettings getInputSettings(int i14) {
            return this.inputSettings_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
        public int getInputSettingsCount() {
            return this.inputSettings_.size();
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
        public List<InputSettings> getInputSettingsList() {
            return this.inputSettings_;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
        public InputSettingsOrBuilder getInputSettingsOrBuilder(int i14) {
            return this.inputSettings_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
        public List<? extends InputSettingsOrBuilder> getInputSettingsOrBuilderList() {
            return this.inputSettings_;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
        public String getName() {
            Object obj = this.name_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.name_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SwitcherSettings> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = 0;
            for (int i15 = 0; i15 < this.switchSettings_.size(); i15++) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(1, this.switchSettings_.get(i15));
            }
            for (int i16 = 0; i16 < this.customSettings_.size(); i16++) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(2, this.customSettings_.get(i16));
            }
            for (int i17 = 0; i17 < this.inputSettings_.size(); i17++) {
                iComputeStringSize += CodedOutputStream.computeMessageSize(3, this.inputSettings_.get(i17));
            }
            if ((this.bitField0_ & 1) != 0) {
                iComputeStringSize += CodedOutputStream.computeBoolSize(4, this.autoOff_);
            }
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(5, this.name_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
        public SwitchSettings getSwitchSettings(int i14) {
            return this.switchSettings_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
        public int getSwitchSettingsCount() {
            return this.switchSettings_.size();
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
        public List<SwitchSettings> getSwitchSettingsList() {
            return this.switchSettings_;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
        public SwitchSettingsOrBuilder getSwitchSettingsOrBuilder(int i14) {
            return this.switchSettings_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
        public List<? extends SwitchSettingsOrBuilder> getSwitchSettingsOrBuilderList() {
            return this.switchSettings_;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
        public boolean hasAutoOff() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getSwitchSettingsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSwitchSettingsList().hashCode();
            }
            if (getCustomSettingsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getCustomSettingsList().hashCode();
            }
            if (getInputSettingsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getInputSettingsList().hashCode();
            }
            if (hasAutoOff()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Internal.hashBoolean(getAutoOff());
            }
            if (hasName()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getName().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitcherSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(SwitcherSettings.class, Builder.class);
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
            return new SwitcherSettings();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.switchSettings_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.switchSettings_.get(i14));
            }
            for (int i15 = 0; i15 < this.customSettings_.size(); i15++) {
                codedOutputStream.writeMessage(2, this.customSettings_.get(i15));
            }
            for (int i16 = 0; i16 < this.inputSettings_.size(); i16++) {
                codedOutputStream.writeMessage(3, this.inputSettings_.get(i16));
            }
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(4, this.autoOff_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 5, this.name_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SwitcherSettingsOrBuilder {
            private boolean autoOff_;
            private int bitField0_;
            private RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> customSettingsBuilder_;
            private List<SwitchSettings> customSettings_;
            private RepeatedFieldBuilderV3<InputSettings, InputSettings.Builder, InputSettingsOrBuilder> inputSettingsBuilder_;
            private List<InputSettings> inputSettings_;
            private Object name_;
            private RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> switchSettingsBuilder_;
            private List<SwitchSettings> switchSettings_;

            private Builder() {
                List list = Collections.EMPTY_LIST;
                this.switchSettings_ = list;
                this.customSettings_ = list;
                this.inputSettings_ = list;
                this.name_ = "";
            }

            private void buildPartial0(SwitcherSettings switcherSettings) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 8) != 0) {
                    switcherSettings.autoOff_ = this.autoOff_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 16) != 0) {
                    switcherSettings.name_ = this.name_;
                    i14 |= 2;
                }
                switcherSettings.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(SwitcherSettings switcherSettings) {
                RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> repeatedFieldBuilderV3 = this.switchSettingsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 1) != 0) {
                        this.switchSettings_ = Collections.unmodifiableList(this.switchSettings_);
                        this.bitField0_ &= -2;
                    }
                    switcherSettings.switchSettings_ = this.switchSettings_;
                } else {
                    switcherSettings.switchSettings_ = repeatedFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> repeatedFieldBuilderV4 = this.customSettingsBuilder_;
                if (repeatedFieldBuilderV4 == null) {
                    if ((this.bitField0_ & 2) != 0) {
                        this.customSettings_ = Collections.unmodifiableList(this.customSettings_);
                        this.bitField0_ &= -3;
                    }
                    switcherSettings.customSettings_ = this.customSettings_;
                } else {
                    switcherSettings.customSettings_ = repeatedFieldBuilderV4.build();
                }
                RepeatedFieldBuilderV3<InputSettings, InputSettings.Builder, InputSettingsOrBuilder> repeatedFieldBuilderV5 = this.inputSettingsBuilder_;
                if (repeatedFieldBuilderV5 != null) {
                    switcherSettings.inputSettings_ = repeatedFieldBuilderV5.build();
                    return;
                }
                if ((this.bitField0_ & 4) != 0) {
                    this.inputSettings_ = Collections.unmodifiableList(this.inputSettings_);
                    this.bitField0_ &= -5;
                }
                switcherSettings.inputSettings_ = this.inputSettings_;
            }

            private void ensureCustomSettingsIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.customSettings_ = new ArrayList(this.customSettings_);
                    this.bitField0_ |= 2;
                }
            }

            private void ensureInputSettingsIsMutable() {
                if ((this.bitField0_ & 4) == 0) {
                    this.inputSettings_ = new ArrayList(this.inputSettings_);
                    this.bitField0_ |= 4;
                }
            }

            private void ensureSwitchSettingsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.switchSettings_ = new ArrayList(this.switchSettings_);
                    this.bitField0_ |= 1;
                }
            }

            private RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> getCustomSettingsFieldBuilder() {
                if (this.customSettingsBuilder_ == null) {
                    this.customSettingsBuilder_ = new RepeatedFieldBuilderV3<>(this.customSettings_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.customSettings_ = null;
                }
                return this.customSettingsBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitcherSettings_descriptor;
            }

            private RepeatedFieldBuilderV3<InputSettings, InputSettings.Builder, InputSettingsOrBuilder> getInputSettingsFieldBuilder() {
                if (this.inputSettingsBuilder_ == null) {
                    this.inputSettingsBuilder_ = new RepeatedFieldBuilderV3<>(this.inputSettings_, (this.bitField0_ & 4) != 0, getParentForChildren(), isClean());
                    this.inputSettings_ = null;
                }
                return this.inputSettingsBuilder_;
            }

            private RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> getSwitchSettingsFieldBuilder() {
                if (this.switchSettingsBuilder_ == null) {
                    this.switchSettingsBuilder_ = new RepeatedFieldBuilderV3<>(this.switchSettings_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.switchSettings_ = null;
                }
                return this.switchSettingsBuilder_;
            }

            public Builder addAllCustomSettings(Iterable<? extends SwitchSettings> iterable) {
                RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> repeatedFieldBuilderV3 = this.customSettingsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureCustomSettingsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.customSettings_);
                onChanged();
                return this;
            }

            public Builder addAllInputSettings(Iterable<? extends InputSettings> iterable) {
                RepeatedFieldBuilderV3<InputSettings, InputSettings.Builder, InputSettingsOrBuilder> repeatedFieldBuilderV3 = this.inputSettingsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureInputSettingsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.inputSettings_);
                onChanged();
                return this;
            }

            public Builder addAllSwitchSettings(Iterable<? extends SwitchSettings> iterable) {
                RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> repeatedFieldBuilderV3 = this.switchSettingsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureSwitchSettingsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.switchSettings_);
                onChanged();
                return this;
            }

            public Builder addCustomSettings(SwitchSettings.Builder builder) {
                RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> repeatedFieldBuilderV3 = this.customSettingsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureCustomSettingsIsMutable();
                this.customSettings_.add(builder.build());
                onChanged();
                return this;
            }

            public SwitchSettings.Builder addCustomSettingsBuilder() {
                return (SwitchSettings.Builder) getCustomSettingsFieldBuilder().addBuilder(SwitchSettings.getDefaultInstance());
            }

            public Builder addInputSettings(InputSettings.Builder builder) {
                RepeatedFieldBuilderV3<InputSettings, InputSettings.Builder, InputSettingsOrBuilder> repeatedFieldBuilderV3 = this.inputSettingsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureInputSettingsIsMutable();
                this.inputSettings_.add(builder.build());
                onChanged();
                return this;
            }

            public InputSettings.Builder addInputSettingsBuilder() {
                return (InputSettings.Builder) getInputSettingsFieldBuilder().addBuilder(InputSettings.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addSwitchSettings(SwitchSettings.Builder builder) {
                RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> repeatedFieldBuilderV3 = this.switchSettingsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureSwitchSettingsIsMutable();
                this.switchSettings_.add(builder.build());
                onChanged();
                return this;
            }

            public SwitchSettings.Builder addSwitchSettingsBuilder() {
                return (SwitchSettings.Builder) getSwitchSettingsFieldBuilder().addBuilder(SwitchSettings.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwitcherSettings build() {
                SwitcherSettings switcherSettingsBuildPartial = buildPartial();
                if (switcherSettingsBuildPartial.isInitialized()) {
                    return switcherSettingsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) switcherSettingsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwitcherSettings buildPartial() {
                SwitcherSettings switcherSettings = new SwitcherSettings(this);
                buildPartialRepeatedFields(switcherSettings);
                if (this.bitField0_ != 0) {
                    buildPartial0(switcherSettings);
                }
                onBuilt();
                return switcherSettings;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> repeatedFieldBuilderV3 = this.switchSettingsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.switchSettings_ = Collections.EMPTY_LIST;
                } else {
                    this.switchSettings_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> repeatedFieldBuilderV4 = this.customSettingsBuilder_;
                if (repeatedFieldBuilderV4 == null) {
                    this.customSettings_ = Collections.EMPTY_LIST;
                } else {
                    this.customSettings_ = null;
                    repeatedFieldBuilderV4.clear();
                }
                this.bitField0_ &= -3;
                RepeatedFieldBuilderV3<InputSettings, InputSettings.Builder, InputSettingsOrBuilder> repeatedFieldBuilderV5 = this.inputSettingsBuilder_;
                if (repeatedFieldBuilderV5 == null) {
                    this.inputSettings_ = Collections.EMPTY_LIST;
                } else {
                    this.inputSettings_ = null;
                    repeatedFieldBuilderV5.clear();
                }
                this.bitField0_ &= -5;
                this.autoOff_ = false;
                this.name_ = "";
                return this;
            }

            public Builder clearAutoOff() {
                this.bitField0_ &= -9;
                this.autoOff_ = false;
                onChanged();
                return this;
            }

            public Builder clearCustomSettings() {
                RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> repeatedFieldBuilderV3 = this.customSettingsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.customSettings_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearInputSettings() {
                RepeatedFieldBuilderV3<InputSettings, InputSettings.Builder, InputSettingsOrBuilder> repeatedFieldBuilderV3 = this.inputSettingsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.inputSettings_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearName() {
                this.name_ = SwitcherSettings.getDefaultInstance().getName();
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSwitchSettings() {
                RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> repeatedFieldBuilderV3 = this.switchSettingsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.switchSettings_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
            public boolean getAutoOff() {
                return this.autoOff_;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
            public SwitchSettings getCustomSettings(int i14) {
                RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> repeatedFieldBuilderV3 = this.customSettingsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.customSettings_.get(i14) : (SwitchSettings) repeatedFieldBuilderV3.getMessage(i14);
            }

            public SwitchSettings.Builder getCustomSettingsBuilder(int i14) {
                return (SwitchSettings.Builder) getCustomSettingsFieldBuilder().getBuilder(i14);
            }

            public List<SwitchSettings.Builder> getCustomSettingsBuilderList() {
                return getCustomSettingsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
            public int getCustomSettingsCount() {
                RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> repeatedFieldBuilderV3 = this.customSettingsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.customSettings_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
            public List<SwitchSettings> getCustomSettingsList() {
                RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> repeatedFieldBuilderV3 = this.customSettingsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.customSettings_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
            public SwitchSettingsOrBuilder getCustomSettingsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> repeatedFieldBuilderV3 = this.customSettingsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.customSettings_.get(i14) : (SwitchSettingsOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
            public List<? extends SwitchSettingsOrBuilder> getCustomSettingsOrBuilderList() {
                RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> repeatedFieldBuilderV3 = this.customSettingsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.customSettings_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitcherSettings_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
            public InputSettings getInputSettings(int i14) {
                RepeatedFieldBuilderV3<InputSettings, InputSettings.Builder, InputSettingsOrBuilder> repeatedFieldBuilderV3 = this.inputSettingsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.inputSettings_.get(i14) : (InputSettings) repeatedFieldBuilderV3.getMessage(i14);
            }

            public InputSettings.Builder getInputSettingsBuilder(int i14) {
                return (InputSettings.Builder) getInputSettingsFieldBuilder().getBuilder(i14);
            }

            public List<InputSettings.Builder> getInputSettingsBuilderList() {
                return getInputSettingsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
            public int getInputSettingsCount() {
                RepeatedFieldBuilderV3<InputSettings, InputSettings.Builder, InputSettingsOrBuilder> repeatedFieldBuilderV3 = this.inputSettingsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.inputSettings_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
            public List<InputSettings> getInputSettingsList() {
                RepeatedFieldBuilderV3<InputSettings, InputSettings.Builder, InputSettingsOrBuilder> repeatedFieldBuilderV3 = this.inputSettingsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.inputSettings_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
            public InputSettingsOrBuilder getInputSettingsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<InputSettings, InputSettings.Builder, InputSettingsOrBuilder> repeatedFieldBuilderV3 = this.inputSettingsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.inputSettings_.get(i14) : (InputSettingsOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
            public List<? extends InputSettingsOrBuilder> getInputSettingsOrBuilderList() {
                RepeatedFieldBuilderV3<InputSettings, InputSettings.Builder, InputSettingsOrBuilder> repeatedFieldBuilderV3 = this.inputSettingsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.inputSettings_);
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
            public String getName() {
                Object obj = this.name_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.name_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
            public SwitchSettings getSwitchSettings(int i14) {
                RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> repeatedFieldBuilderV3 = this.switchSettingsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.switchSettings_.get(i14) : (SwitchSettings) repeatedFieldBuilderV3.getMessage(i14);
            }

            public SwitchSettings.Builder getSwitchSettingsBuilder(int i14) {
                return (SwitchSettings.Builder) getSwitchSettingsFieldBuilder().getBuilder(i14);
            }

            public List<SwitchSettings.Builder> getSwitchSettingsBuilderList() {
                return getSwitchSettingsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
            public int getSwitchSettingsCount() {
                RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> repeatedFieldBuilderV3 = this.switchSettingsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.switchSettings_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
            public List<SwitchSettings> getSwitchSettingsList() {
                RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> repeatedFieldBuilderV3 = this.switchSettingsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.switchSettings_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
            public SwitchSettingsOrBuilder getSwitchSettingsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> repeatedFieldBuilderV3 = this.switchSettingsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.switchSettings_.get(i14) : (SwitchSettingsOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
            public List<? extends SwitchSettingsOrBuilder> getSwitchSettingsOrBuilderList() {
                RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> repeatedFieldBuilderV3 = this.switchSettingsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.switchSettings_);
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
            public boolean hasAutoOff() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsOrBuilder
            public boolean hasName() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitcherSettings_fieldAccessorTable.ensureFieldAccessorsInitialized(SwitcherSettings.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(SwitcherSettings switcherSettings) {
                if (switcherSettings == SwitcherSettings.getDefaultInstance()) {
                    return this;
                }
                if (this.switchSettingsBuilder_ == null) {
                    if (!switcherSettings.switchSettings_.isEmpty()) {
                        if (this.switchSettings_.isEmpty()) {
                            this.switchSettings_ = switcherSettings.switchSettings_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureSwitchSettingsIsMutable();
                            this.switchSettings_.addAll(switcherSettings.switchSettings_);
                        }
                        onChanged();
                    }
                } else if (!switcherSettings.switchSettings_.isEmpty()) {
                    boolean zIsEmpty = this.switchSettingsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> repeatedFieldBuilderV3 = this.switchSettingsBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.switchSettingsBuilder_ = null;
                        this.switchSettings_ = switcherSettings.switchSettings_;
                        this.bitField0_ &= -2;
                        this.switchSettingsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getSwitchSettingsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(switcherSettings.switchSettings_);
                    }
                }
                if (this.customSettingsBuilder_ == null) {
                    if (!switcherSettings.customSettings_.isEmpty()) {
                        if (this.customSettings_.isEmpty()) {
                            this.customSettings_ = switcherSettings.customSettings_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureCustomSettingsIsMutable();
                            this.customSettings_.addAll(switcherSettings.customSettings_);
                        }
                        onChanged();
                    }
                } else if (!switcherSettings.customSettings_.isEmpty()) {
                    boolean zIsEmpty2 = this.customSettingsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> repeatedFieldBuilderV4 = this.customSettingsBuilder_;
                    if (zIsEmpty2) {
                        repeatedFieldBuilderV4.dispose();
                        this.customSettingsBuilder_ = null;
                        this.customSettings_ = switcherSettings.customSettings_;
                        this.bitField0_ &= -3;
                        this.customSettingsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getCustomSettingsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV4.addAllMessages(switcherSettings.customSettings_);
                    }
                }
                if (this.inputSettingsBuilder_ == null) {
                    if (!switcherSettings.inputSettings_.isEmpty()) {
                        if (this.inputSettings_.isEmpty()) {
                            this.inputSettings_ = switcherSettings.inputSettings_;
                            this.bitField0_ &= -5;
                        } else {
                            ensureInputSettingsIsMutable();
                            this.inputSettings_.addAll(switcherSettings.inputSettings_);
                        }
                        onChanged();
                    }
                } else if (!switcherSettings.inputSettings_.isEmpty()) {
                    boolean zIsEmpty3 = this.inputSettingsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<InputSettings, InputSettings.Builder, InputSettingsOrBuilder> repeatedFieldBuilderV5 = this.inputSettingsBuilder_;
                    if (zIsEmpty3) {
                        repeatedFieldBuilderV5.dispose();
                        this.inputSettingsBuilder_ = null;
                        this.inputSettings_ = switcherSettings.inputSettings_;
                        this.bitField0_ &= -5;
                        this.inputSettingsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getInputSettingsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV5.addAllMessages(switcherSettings.inputSettings_);
                    }
                }
                if (switcherSettings.hasAutoOff()) {
                    setAutoOff(switcherSettings.getAutoOff());
                }
                if (switcherSettings.hasName()) {
                    this.name_ = switcherSettings.name_;
                    this.bitField0_ |= 16;
                    onChanged();
                }
                mergeUnknownFields(switcherSettings.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeCustomSettings(int i14) {
                RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> repeatedFieldBuilderV3 = this.customSettingsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureCustomSettingsIsMutable();
                this.customSettings_.remove(i14);
                onChanged();
                return this;
            }

            public Builder removeInputSettings(int i14) {
                RepeatedFieldBuilderV3<InputSettings, InputSettings.Builder, InputSettingsOrBuilder> repeatedFieldBuilderV3 = this.inputSettingsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureInputSettingsIsMutable();
                this.inputSettings_.remove(i14);
                onChanged();
                return this;
            }

            public Builder removeSwitchSettings(int i14) {
                RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> repeatedFieldBuilderV3 = this.switchSettingsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureSwitchSettingsIsMutable();
                this.switchSettings_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setAutoOff(boolean z14) {
                this.autoOff_ = z14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setCustomSettings(int i14, SwitchSettings.Builder builder) {
                RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> repeatedFieldBuilderV3 = this.customSettingsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureCustomSettingsIsMutable();
                this.customSettings_.set(i14, builder.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setInputSettings(int i14, InputSettings.Builder builder) {
                RepeatedFieldBuilderV3<InputSettings, InputSettings.Builder, InputSettingsOrBuilder> repeatedFieldBuilderV3 = this.inputSettingsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureInputSettingsIsMutable();
                this.inputSettings_.set(i14, builder.build());
                onChanged();
                return this;
            }

            public Builder setName(String str) {
                str.getClass();
                this.name_ = str;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setNameBytes(ByteString byteString) {
                byteString.getClass();
                this.name_ = byteString;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSwitchSettings(int i14, SwitchSettings.Builder builder) {
                RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> repeatedFieldBuilderV3 = this.switchSettingsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureSwitchSettingsIsMutable();
                this.switchSettings_.set(i14, builder.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SwitcherSettings getDefaultInstanceForType() {
                return SwitcherSettings.getDefaultInstance();
            }

            public SwitchSettings.Builder addCustomSettingsBuilder(int i14) {
                return (SwitchSettings.Builder) getCustomSettingsFieldBuilder().addBuilder(i14, SwitchSettings.getDefaultInstance());
            }

            public InputSettings.Builder addInputSettingsBuilder(int i14) {
                return (InputSettings.Builder) getInputSettingsFieldBuilder().addBuilder(i14, InputSettings.getDefaultInstance());
            }

            public SwitchSettings.Builder addSwitchSettingsBuilder(int i14) {
                return (SwitchSettings.Builder) getSwitchSettingsFieldBuilder().addBuilder(i14, SwitchSettings.getDefaultInstance());
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                List list = Collections.EMPTY_LIST;
                this.switchSettings_ = list;
                this.customSettings_ = list;
                this.inputSettings_ = list;
                this.name_ = "";
            }

            public Builder addCustomSettings(int i14, SwitchSettings switchSettings) {
                RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> repeatedFieldBuilderV3 = this.customSettingsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    switchSettings.getClass();
                    ensureCustomSettingsIsMutable();
                    this.customSettings_.add(i14, switchSettings);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, switchSettings);
                return this;
            }

            public Builder addInputSettings(int i14, InputSettings inputSettings) {
                RepeatedFieldBuilderV3<InputSettings, InputSettings.Builder, InputSettingsOrBuilder> repeatedFieldBuilderV3 = this.inputSettingsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    inputSettings.getClass();
                    ensureInputSettingsIsMutable();
                    this.inputSettings_.add(i14, inputSettings);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, inputSettings);
                return this;
            }

            public Builder addSwitchSettings(int i14, SwitchSettings switchSettings) {
                RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> repeatedFieldBuilderV3 = this.switchSettingsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    switchSettings.getClass();
                    ensureSwitchSettingsIsMutable();
                    this.switchSettings_.add(i14, switchSettings);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, switchSettings);
                return this;
            }

            public Builder setCustomSettings(int i14, SwitchSettings switchSettings) {
                RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> repeatedFieldBuilderV3 = this.customSettingsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    switchSettings.getClass();
                    ensureCustomSettingsIsMutable();
                    this.customSettings_.set(i14, switchSettings);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, switchSettings);
                return this;
            }

            public Builder setInputSettings(int i14, InputSettings inputSettings) {
                RepeatedFieldBuilderV3<InputSettings, InputSettings.Builder, InputSettingsOrBuilder> repeatedFieldBuilderV3 = this.inputSettingsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    inputSettings.getClass();
                    ensureInputSettingsIsMutable();
                    this.inputSettings_.set(i14, inputSettings);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, inputSettings);
                return this;
            }

            public Builder setSwitchSettings(int i14, SwitchSettings switchSettings) {
                RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> repeatedFieldBuilderV3 = this.switchSettingsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    switchSettings.getClass();
                    ensureSwitchSettingsIsMutable();
                    this.switchSettings_.set(i14, switchSettings);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, switchSettings);
                return this;
            }

            public Builder addCustomSettings(SwitchSettings switchSettings) {
                RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> repeatedFieldBuilderV3 = this.customSettingsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    switchSettings.getClass();
                    ensureCustomSettingsIsMutable();
                    this.customSettings_.add(switchSettings);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(switchSettings);
                return this;
            }

            public Builder addInputSettings(InputSettings inputSettings) {
                RepeatedFieldBuilderV3<InputSettings, InputSettings.Builder, InputSettingsOrBuilder> repeatedFieldBuilderV3 = this.inputSettingsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    inputSettings.getClass();
                    ensureInputSettingsIsMutable();
                    this.inputSettings_.add(inputSettings);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(inputSettings);
                return this;
            }

            public Builder addSwitchSettings(SwitchSettings switchSettings) {
                RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> repeatedFieldBuilderV3 = this.switchSettingsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    switchSettings.getClass();
                    ensureSwitchSettingsIsMutable();
                    this.switchSettings_.add(switchSettings);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(switchSettings);
                return this;
            }

            public Builder addCustomSettings(int i14, SwitchSettings.Builder builder) {
                RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> repeatedFieldBuilderV3 = this.customSettingsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureCustomSettingsIsMutable();
                    this.customSettings_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            public Builder addInputSettings(int i14, InputSettings.Builder builder) {
                RepeatedFieldBuilderV3<InputSettings, InputSettings.Builder, InputSettingsOrBuilder> repeatedFieldBuilderV3 = this.inputSettingsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureInputSettingsIsMutable();
                    this.inputSettings_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            public Builder addSwitchSettings(int i14, SwitchSettings.Builder builder) {
                RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> repeatedFieldBuilderV3 = this.switchSettingsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureSwitchSettingsIsMutable();
                    this.switchSettings_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SwitcherSettings) {
                    return mergeFrom((SwitcherSettings) message);
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
                                    SwitchSettings switchSettings = (SwitchSettings) codedInputStream.readMessage(SwitchSettings.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> repeatedFieldBuilderV3 = this.switchSettingsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureSwitchSettingsIsMutable();
                                        this.switchSettings_.add(switchSettings);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(switchSettings);
                                    }
                                } else if (tag == 18) {
                                    SwitchSettings switchSettings2 = (SwitchSettings) codedInputStream.readMessage(SwitchSettings.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<SwitchSettings, SwitchSettings.Builder, SwitchSettingsOrBuilder> repeatedFieldBuilderV4 = this.customSettingsBuilder_;
                                    if (repeatedFieldBuilderV4 == null) {
                                        ensureCustomSettingsIsMutable();
                                        this.customSettings_.add(switchSettings2);
                                    } else {
                                        repeatedFieldBuilderV4.addMessage(switchSettings2);
                                    }
                                } else if (tag == 26) {
                                    InputSettings inputSettings = (InputSettings) codedInputStream.readMessage(InputSettings.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<InputSettings, InputSettings.Builder, InputSettingsOrBuilder> repeatedFieldBuilderV5 = this.inputSettingsBuilder_;
                                    if (repeatedFieldBuilderV5 == null) {
                                        ensureInputSettingsIsMutable();
                                        this.inputSettings_.add(inputSettings);
                                    } else {
                                        repeatedFieldBuilderV5.addMessage(inputSettings);
                                    }
                                } else if (tag == 32) {
                                    this.autoOff_ = codedInputStream.readBool();
                                    this.bitField0_ |= 8;
                                } else if (tag != 42) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.name_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 16;
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
        public SwitcherSettings getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SwitcherSettings parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwitcherSettings) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwitcherSettings parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SwitcherSettings parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SwitcherSettings parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SwitcherSettings parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SwitcherSettings parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SwitcherSettings parseFrom(InputStream inputStream) {
            return (SwitcherSettings) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SwitcherSettings parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwitcherSettings) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwitcherSettings parseFrom(CodedInputStream codedInputStream) {
            return (SwitcherSettings) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SwitcherSettings parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwitcherSettings) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private SwitcherSettings(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.autoOff_ = false;
            this.name_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ SwitcherSettings(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class SwitcherSettingsChangeRequest extends GeneratedMessageV3 implements SwitcherSettingsChangeRequestOrBuilder {
        private static final SwitcherSettingsChangeRequest DEFAULT_INSTANCE = new SwitcherSettingsChangeRequest();

        @Deprecated
        public static final Parser<SwitcherSettingsChangeRequest> PARSER = new AbstractParser<SwitcherSettingsChangeRequest>() { // from class: com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsChangeRequest.1
            @Override // com.google.protobuf.Parser
            public SwitcherSettingsChangeRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SwitcherSettingsChangeRequest.newBuilder();
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
        public static final int SWITCHER_SETTINGS_FIELD_NUMBER = 1;
        public static final int SWITCHER_STATE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private SwitcherSettings switcherSettings_;
        private SwitcherState switcherState_;

        private SwitcherSettingsChangeRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SwitcherSettingsChangeRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitcherSettingsChangeRequest_descriptor;
        }

        public static Builder newBuilder(SwitcherSettingsChangeRequest switcherSettingsChangeRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(switcherSettingsChangeRequest);
        }

        public static SwitcherSettingsChangeRequest parseDelimitedFrom(InputStream inputStream) {
            return (SwitcherSettingsChangeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SwitcherSettingsChangeRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SwitcherSettingsChangeRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SwitcherSettingsChangeRequest)) {
                return super.equals(obj);
            }
            SwitcherSettingsChangeRequest switcherSettingsChangeRequest = (SwitcherSettingsChangeRequest) obj;
            if (hasSwitcherSettings() != switcherSettingsChangeRequest.hasSwitcherSettings()) {
                return false;
            }
            if ((!hasSwitcherSettings() || getSwitcherSettings().equals(switcherSettingsChangeRequest.getSwitcherSettings())) && hasSwitcherState() == switcherSettingsChangeRequest.hasSwitcherState()) {
                return (!hasSwitcherState() || getSwitcherState().equals(switcherSettingsChangeRequest.getSwitcherState())) && getUnknownFields().equals(switcherSettingsChangeRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SwitcherSettingsChangeRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getSwitcherSettings()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getSwitcherState());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsChangeRequestOrBuilder
        public SwitcherSettings getSwitcherSettings() {
            SwitcherSettings switcherSettings = this.switcherSettings_;
            return switcherSettings == null ? SwitcherSettings.getDefaultInstance() : switcherSettings;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsChangeRequestOrBuilder
        public SwitcherSettingsOrBuilder getSwitcherSettingsOrBuilder() {
            SwitcherSettings switcherSettings = this.switcherSettings_;
            return switcherSettings == null ? SwitcherSettings.getDefaultInstance() : switcherSettings;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsChangeRequestOrBuilder
        public SwitcherState getSwitcherState() {
            SwitcherState switcherState = this.switcherState_;
            return switcherState == null ? SwitcherState.getDefaultInstance() : switcherState;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsChangeRequestOrBuilder
        public SwitcherStateOrBuilder getSwitcherStateOrBuilder() {
            SwitcherState switcherState = this.switcherState_;
            return switcherState == null ? SwitcherState.getDefaultInstance() : switcherState;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsChangeRequestOrBuilder
        public boolean hasSwitcherSettings() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsChangeRequestOrBuilder
        public boolean hasSwitcherState() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSwitcherSettings()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSwitcherSettings().hashCode();
            }
            if (hasSwitcherState()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSwitcherState().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitcherSettingsChangeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SwitcherSettingsChangeRequest.class, Builder.class);
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
            return new SwitcherSettingsChangeRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getSwitcherSettings());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getSwitcherState());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SwitcherSettingsChangeRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<SwitcherSettings, SwitcherSettings.Builder, SwitcherSettingsOrBuilder> switcherSettingsBuilder_;
            private SwitcherSettings switcherSettings_;
            private SingleFieldBuilderV3<SwitcherState, SwitcherState.Builder, SwitcherStateOrBuilder> switcherStateBuilder_;
            private SwitcherState switcherState_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(SwitcherSettingsChangeRequest switcherSettingsChangeRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<SwitcherSettings, SwitcherSettings.Builder, SwitcherSettingsOrBuilder> singleFieldBuilderV3 = this.switcherSettingsBuilder_;
                    switcherSettingsChangeRequest.switcherSettings_ = singleFieldBuilderV3 == null ? this.switcherSettings_ : (SwitcherSettings) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<SwitcherState, SwitcherState.Builder, SwitcherStateOrBuilder> singleFieldBuilderV4 = this.switcherStateBuilder_;
                    switcherSettingsChangeRequest.switcherState_ = singleFieldBuilderV4 == null ? this.switcherState_ : (SwitcherState) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                switcherSettingsChangeRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitcherSettingsChangeRequest_descriptor;
            }

            private SingleFieldBuilderV3<SwitcherSettings, SwitcherSettings.Builder, SwitcherSettingsOrBuilder> getSwitcherSettingsFieldBuilder() {
                if (this.switcherSettingsBuilder_ == null) {
                    this.switcherSettingsBuilder_ = new SingleFieldBuilderV3<>(getSwitcherSettings(), getParentForChildren(), isClean());
                    this.switcherSettings_ = null;
                }
                return this.switcherSettingsBuilder_;
            }

            private SingleFieldBuilderV3<SwitcherState, SwitcherState.Builder, SwitcherStateOrBuilder> getSwitcherStateFieldBuilder() {
                if (this.switcherStateBuilder_ == null) {
                    this.switcherStateBuilder_ = new SingleFieldBuilderV3<>(getSwitcherState(), getParentForChildren(), isClean());
                    this.switcherState_ = null;
                }
                return this.switcherStateBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSwitcherSettingsFieldBuilder();
                    getSwitcherStateFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwitcherSettingsChangeRequest build() {
                SwitcherSettingsChangeRequest switcherSettingsChangeRequestBuildPartial = buildPartial();
                if (switcherSettingsChangeRequestBuildPartial.isInitialized()) {
                    return switcherSettingsChangeRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) switcherSettingsChangeRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwitcherSettingsChangeRequest buildPartial() {
                SwitcherSettingsChangeRequest switcherSettingsChangeRequest = new SwitcherSettingsChangeRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(switcherSettingsChangeRequest);
                }
                onBuilt();
                return switcherSettingsChangeRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.switcherSettings_ = null;
                SingleFieldBuilderV3<SwitcherSettings, SwitcherSettings.Builder, SwitcherSettingsOrBuilder> singleFieldBuilderV3 = this.switcherSettingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.switcherSettingsBuilder_ = null;
                }
                this.switcherState_ = null;
                SingleFieldBuilderV3<SwitcherState, SwitcherState.Builder, SwitcherStateOrBuilder> singleFieldBuilderV4 = this.switcherStateBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.switcherStateBuilder_ = null;
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

            public Builder clearSwitcherSettings() {
                this.bitField0_ &= -2;
                this.switcherSettings_ = null;
                SingleFieldBuilderV3<SwitcherSettings, SwitcherSettings.Builder, SwitcherSettingsOrBuilder> singleFieldBuilderV3 = this.switcherSettingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.switcherSettingsBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSwitcherState() {
                this.bitField0_ &= -3;
                this.switcherState_ = null;
                SingleFieldBuilderV3<SwitcherState, SwitcherState.Builder, SwitcherStateOrBuilder> singleFieldBuilderV3 = this.switcherStateBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.switcherStateBuilder_ = null;
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
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitcherSettingsChangeRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsChangeRequestOrBuilder
            public SwitcherSettings getSwitcherSettings() {
                SingleFieldBuilderV3<SwitcherSettings, SwitcherSettings.Builder, SwitcherSettingsOrBuilder> singleFieldBuilderV3 = this.switcherSettingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwitcherSettings) singleFieldBuilderV3.getMessage();
                }
                SwitcherSettings switcherSettings = this.switcherSettings_;
                return switcherSettings == null ? SwitcherSettings.getDefaultInstance() : switcherSettings;
            }

            public SwitcherSettings.Builder getSwitcherSettingsBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SwitcherSettings.Builder) getSwitcherSettingsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsChangeRequestOrBuilder
            public SwitcherSettingsOrBuilder getSwitcherSettingsOrBuilder() {
                SingleFieldBuilderV3<SwitcherSettings, SwitcherSettings.Builder, SwitcherSettingsOrBuilder> singleFieldBuilderV3 = this.switcherSettingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwitcherSettingsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SwitcherSettings switcherSettings = this.switcherSettings_;
                return switcherSettings == null ? SwitcherSettings.getDefaultInstance() : switcherSettings;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsChangeRequestOrBuilder
            public SwitcherState getSwitcherState() {
                SingleFieldBuilderV3<SwitcherState, SwitcherState.Builder, SwitcherStateOrBuilder> singleFieldBuilderV3 = this.switcherStateBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwitcherState) singleFieldBuilderV3.getMessage();
                }
                SwitcherState switcherState = this.switcherState_;
                return switcherState == null ? SwitcherState.getDefaultInstance() : switcherState;
            }

            public SwitcherState.Builder getSwitcherStateBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (SwitcherState.Builder) getSwitcherStateFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsChangeRequestOrBuilder
            public SwitcherStateOrBuilder getSwitcherStateOrBuilder() {
                SingleFieldBuilderV3<SwitcherState, SwitcherState.Builder, SwitcherStateOrBuilder> singleFieldBuilderV3 = this.switcherStateBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwitcherStateOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SwitcherState switcherState = this.switcherState_;
                return switcherState == null ? SwitcherState.getDefaultInstance() : switcherState;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsChangeRequestOrBuilder
            public boolean hasSwitcherSettings() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsChangeRequestOrBuilder
            public boolean hasSwitcherState() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitcherSettingsChangeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SwitcherSettingsChangeRequest.class, Builder.class);
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
                                    codedInputStream.readMessage(getSwitcherSettingsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getSwitcherStateFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeSwitcherSettings(SwitcherSettings switcherSettings) {
                SwitcherSettings switcherSettings2;
                SingleFieldBuilderV3<SwitcherSettings, SwitcherSettings.Builder, SwitcherSettingsOrBuilder> singleFieldBuilderV3 = this.switcherSettingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(switcherSettings);
                } else if ((this.bitField0_ & 1) == 0 || (switcherSettings2 = this.switcherSettings_) == null || switcherSettings2 == SwitcherSettings.getDefaultInstance()) {
                    this.switcherSettings_ = switcherSettings;
                } else {
                    getSwitcherSettingsBuilder().mergeFrom(switcherSettings);
                }
                if (this.switcherSettings_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSwitcherState(SwitcherState switcherState) {
                SwitcherState switcherState2;
                SingleFieldBuilderV3<SwitcherState, SwitcherState.Builder, SwitcherStateOrBuilder> singleFieldBuilderV3 = this.switcherStateBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(switcherState);
                } else if ((this.bitField0_ & 2) == 0 || (switcherState2 = this.switcherState_) == null || switcherState2 == SwitcherState.getDefaultInstance()) {
                    this.switcherState_ = switcherState;
                } else {
                    getSwitcherStateBuilder().mergeFrom(switcherState);
                }
                if (this.switcherState_ != null) {
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

            public Builder setSwitcherSettings(SwitcherSettings.Builder builder) {
                SingleFieldBuilderV3<SwitcherSettings, SwitcherSettings.Builder, SwitcherSettingsOrBuilder> singleFieldBuilderV3 = this.switcherSettingsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.switcherSettings_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSwitcherState(SwitcherState.Builder builder) {
                SingleFieldBuilderV3<SwitcherState, SwitcherState.Builder, SwitcherStateOrBuilder> singleFieldBuilderV3 = this.switcherStateBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.switcherState_ = builder.build();
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
            public SwitcherSettingsChangeRequest getDefaultInstanceForType() {
                return SwitcherSettingsChangeRequest.getDefaultInstance();
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

            public Builder setSwitcherSettings(SwitcherSettings switcherSettings) {
                SingleFieldBuilderV3<SwitcherSettings, SwitcherSettings.Builder, SwitcherSettingsOrBuilder> singleFieldBuilderV3 = this.switcherSettingsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    switcherSettings.getClass();
                    this.switcherSettings_ = switcherSettings;
                } else {
                    singleFieldBuilderV3.setMessage(switcherSettings);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSwitcherState(SwitcherState switcherState) {
                SingleFieldBuilderV3<SwitcherState, SwitcherState.Builder, SwitcherStateOrBuilder> singleFieldBuilderV3 = this.switcherStateBuilder_;
                if (singleFieldBuilderV3 == null) {
                    switcherState.getClass();
                    this.switcherState_ = switcherState;
                } else {
                    singleFieldBuilderV3.setMessage(switcherState);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SwitcherSettingsChangeRequest) {
                    return mergeFrom((SwitcherSettingsChangeRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SwitcherSettingsChangeRequest switcherSettingsChangeRequest) {
                if (switcherSettingsChangeRequest == SwitcherSettingsChangeRequest.getDefaultInstance()) {
                    return this;
                }
                if (switcherSettingsChangeRequest.hasSwitcherSettings()) {
                    mergeSwitcherSettings(switcherSettingsChangeRequest.getSwitcherSettings());
                }
                if (switcherSettingsChangeRequest.hasSwitcherState()) {
                    mergeSwitcherState(switcherSettingsChangeRequest.getSwitcherState());
                }
                mergeUnknownFields(switcherSettingsChangeRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SwitcherSettingsChangeRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ SwitcherSettingsChangeRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SwitcherSettingsChangeRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SwitcherSettingsChangeRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwitcherSettingsChangeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwitcherSettingsChangeRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SwitcherSettingsChangeRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SwitcherSettingsChangeRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SwitcherSettingsChangeRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SwitcherSettingsChangeRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SwitcherSettingsChangeRequest parseFrom(InputStream inputStream) {
            return (SwitcherSettingsChangeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SwitcherSettingsChangeRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwitcherSettingsChangeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwitcherSettingsChangeRequest parseFrom(CodedInputStream codedInputStream) {
            return (SwitcherSettingsChangeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SwitcherSettingsChangeRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwitcherSettingsChangeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SwitcherSettingsChangeResponse extends GeneratedMessageV3 implements SwitcherSettingsChangeResponseOrBuilder {
        private static final SwitcherSettingsChangeResponse DEFAULT_INSTANCE = new SwitcherSettingsChangeResponse();

        @Deprecated
        public static final Parser<SwitcherSettingsChangeResponse> PARSER = new AbstractParser<SwitcherSettingsChangeResponse>() { // from class: com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsChangeResponse.1
            @Override // com.google.protobuf.Parser
            public SwitcherSettingsChangeResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SwitcherSettingsChangeResponse.newBuilder();
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

        private SwitcherSettingsChangeResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SwitcherSettingsChangeResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitcherSettingsChangeResponse_descriptor;
        }

        public static Builder newBuilder(SwitcherSettingsChangeResponse switcherSettingsChangeResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(switcherSettingsChangeResponse);
        }

        public static SwitcherSettingsChangeResponse parseDelimitedFrom(InputStream inputStream) {
            return (SwitcherSettingsChangeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SwitcherSettingsChangeResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SwitcherSettingsChangeResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SwitcherSettingsChangeResponse)) {
                return super.equals(obj);
            }
            SwitcherSettingsChangeResponse switcherSettingsChangeResponse = (SwitcherSettingsChangeResponse) obj;
            if (hasStatus() != switcherSettingsChangeResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == switcherSettingsChangeResponse.status_) && getUnknownFields().equals(switcherSettingsChangeResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SwitcherSettingsChangeResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsChangeResponseOrBuilder
        public SettingsChangeStatus getStatus() {
            SettingsChangeStatus settingsChangeStatusForNumber = SettingsChangeStatus.forNumber(this.status_);
            return settingsChangeStatusForNumber == null ? SettingsChangeStatus.SUCCESS : settingsChangeStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsChangeResponseOrBuilder
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
            return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitcherSettingsChangeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SwitcherSettingsChangeResponse.class, Builder.class);
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
            return new SwitcherSettingsChangeResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SwitcherSettingsChangeResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(SwitcherSettingsChangeResponse switcherSettingsChangeResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    switcherSettingsChangeResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                switcherSettingsChangeResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitcherSettingsChangeResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwitcherSettingsChangeResponse build() {
                SwitcherSettingsChangeResponse switcherSettingsChangeResponseBuildPartial = buildPartial();
                if (switcherSettingsChangeResponseBuildPartial.isInitialized()) {
                    return switcherSettingsChangeResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) switcherSettingsChangeResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwitcherSettingsChangeResponse buildPartial() {
                SwitcherSettingsChangeResponse switcherSettingsChangeResponse = new SwitcherSettingsChangeResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(switcherSettingsChangeResponse);
                }
                onBuilt();
                return switcherSettingsChangeResponse;
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
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitcherSettingsChangeResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsChangeResponseOrBuilder
            public SettingsChangeStatus getStatus() {
                SettingsChangeStatus settingsChangeStatusForNumber = SettingsChangeStatus.forNumber(this.status_);
                return settingsChangeStatusForNumber == null ? SettingsChangeStatus.SUCCESS : settingsChangeStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsChangeResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitcherSettingsChangeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SwitcherSettingsChangeResponse.class, Builder.class);
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
                                    if (SettingsChangeStatus.forNumber(i14) == null) {
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

            public Builder setStatus(SettingsChangeStatus settingsChangeStatus) {
                settingsChangeStatus.getClass();
                this.bitField0_ |= 1;
                this.status_ = settingsChangeStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SwitcherSettingsChangeResponse getDefaultInstanceForType() {
                return SwitcherSettingsChangeResponse.getDefaultInstance();
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
                if (message instanceof SwitcherSettingsChangeResponse) {
                    return mergeFrom((SwitcherSettingsChangeResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SwitcherSettingsChangeResponse switcherSettingsChangeResponse) {
                if (switcherSettingsChangeResponse == SwitcherSettingsChangeResponse.getDefaultInstance()) {
                    return this;
                }
                if (switcherSettingsChangeResponse.hasStatus()) {
                    setStatus(switcherSettingsChangeResponse.getStatus());
                }
                mergeUnknownFields(switcherSettingsChangeResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SwitcherSettingsChangeResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SwitcherSettingsChangeResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwitcherSettingsChangeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwitcherSettingsChangeResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ SwitcherSettingsChangeResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SwitcherSettingsChangeResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SwitcherSettingsChangeResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SwitcherSettingsChangeResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SwitcherSettingsChangeResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SwitcherSettingsChangeResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SwitcherSettingsChangeResponse parseFrom(InputStream inputStream) {
            return (SwitcherSettingsChangeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SwitcherSettingsChangeResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwitcherSettingsChangeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwitcherSettingsChangeResponse parseFrom(CodedInputStream codedInputStream) {
            return (SwitcherSettingsChangeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SwitcherSettingsChangeResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwitcherSettingsChangeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum SettingsChangeStatus implements ProtocolMessageEnum {
            SUCCESS(0),
            UNKNOWN_ERROR(1);

            public static final int SUCCESS_VALUE = 0;
            public static final int UNKNOWN_ERROR_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<SettingsChangeStatus> internalValueMap = new Internal.EnumLiteMap<SettingsChangeStatus>() { // from class: com.garmin.proto.generated.GDISwitcherProto.SwitcherSettingsChangeResponse.SettingsChangeStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public SettingsChangeStatus findValueByNumber(int i14) {
                    return SettingsChangeStatus.forNumber(i14);
                }
            };
            private static final SettingsChangeStatus[] VALUES = values();

            SettingsChangeStatus(int i14) {
                this.value = i14;
            }

            public static SettingsChangeStatus forNumber(int i14) {
                if (i14 == 0) {
                    return SUCCESS;
                }
                if (i14 != 1) {
                    return null;
                }
                return UNKNOWN_ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return SwitcherSettingsChangeResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<SettingsChangeStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static SettingsChangeStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static SettingsChangeStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class SwitcherState extends GeneratedMessageV3 implements SwitcherStateOrBuilder {
        public static final int BATTERY_VOLTAGE_FIELD_NUMBER = 1;
        public static final int LOW_VOLTAGE_SHUTDOWN_FIELD_NUMBER = 2;
        public static final int OVERLOADED_FIELD_NUMBER = 3;
        public static final int PENDING_UPDATE_VERSION_FIELD_NUMBER = 5;
        public static final int SWITCH_STATES_FIELD_NUMBER = 6;
        public static final int TEMPERATURE_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private float batteryVoltage_;
        private int bitField0_;
        private boolean lowVoltageShutdown_;
        private byte memoizedIsInitialized;
        private boolean overloaded_;
        private int pendingUpdateVersion_;
        private List<SwitchState> switchStates_;
        private float temperature_;
        private static final SwitcherState DEFAULT_INSTANCE = new SwitcherState();

        @Deprecated
        public static final Parser<SwitcherState> PARSER = new AbstractParser<SwitcherState>() { // from class: com.garmin.proto.generated.GDISwitcherProto.SwitcherState.1
            @Override // com.google.protobuf.Parser
            public SwitcherState parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SwitcherState.newBuilder();
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

        private SwitcherState() {
            this.batteryVoltage_ = 0.0f;
            this.lowVoltageShutdown_ = false;
            this.overloaded_ = false;
            this.temperature_ = 0.0f;
            this.pendingUpdateVersion_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.switchStates_ = Collections.EMPTY_LIST;
        }

        public static SwitcherState getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitcherState_descriptor;
        }

        public static Builder newBuilder(SwitcherState switcherState) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(switcherState);
        }

        public static SwitcherState parseDelimitedFrom(InputStream inputStream) {
            return (SwitcherState) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SwitcherState parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SwitcherState> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SwitcherState)) {
                return super.equals(obj);
            }
            SwitcherState switcherState = (SwitcherState) obj;
            if (hasBatteryVoltage() != switcherState.hasBatteryVoltage()) {
                return false;
            }
            if ((hasBatteryVoltage() && Float.floatToIntBits(getBatteryVoltage()) != Float.floatToIntBits(switcherState.getBatteryVoltage())) || hasLowVoltageShutdown() != switcherState.hasLowVoltageShutdown()) {
                return false;
            }
            if ((hasLowVoltageShutdown() && getLowVoltageShutdown() != switcherState.getLowVoltageShutdown()) || hasOverloaded() != switcherState.hasOverloaded()) {
                return false;
            }
            if ((hasOverloaded() && getOverloaded() != switcherState.getOverloaded()) || hasTemperature() != switcherState.hasTemperature()) {
                return false;
            }
            if ((!hasTemperature() || Float.floatToIntBits(getTemperature()) == Float.floatToIntBits(switcherState.getTemperature())) && hasPendingUpdateVersion() == switcherState.hasPendingUpdateVersion()) {
                return (!hasPendingUpdateVersion() || getPendingUpdateVersion() == switcherState.getPendingUpdateVersion()) && getSwitchStatesList().equals(switcherState.getSwitchStatesList()) && getUnknownFields().equals(switcherState.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStateOrBuilder
        public float getBatteryVoltage() {
            return this.batteryVoltage_;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStateOrBuilder
        public boolean getLowVoltageShutdown() {
            return this.lowVoltageShutdown_;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStateOrBuilder
        public boolean getOverloaded() {
            return this.overloaded_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SwitcherState> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStateOrBuilder
        public int getPendingUpdateVersion() {
            return this.pendingUpdateVersion_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeFloatSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeFloatSize(1, this.batteryVoltage_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeFloatSize += CodedOutputStream.computeBoolSize(2, this.lowVoltageShutdown_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeFloatSize += CodedOutputStream.computeBoolSize(3, this.overloaded_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeFloatSize += CodedOutputStream.computeFloatSize(4, this.temperature_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeFloatSize += CodedOutputStream.computeUInt32Size(5, this.pendingUpdateVersion_);
            }
            for (int i15 = 0; i15 < this.switchStates_.size(); i15++) {
                iComputeFloatSize += CodedOutputStream.computeMessageSize(6, this.switchStates_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeFloatSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStateOrBuilder
        public SwitchState getSwitchStates(int i14) {
            return this.switchStates_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStateOrBuilder
        public int getSwitchStatesCount() {
            return this.switchStates_.size();
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStateOrBuilder
        public List<SwitchState> getSwitchStatesList() {
            return this.switchStates_;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStateOrBuilder
        public SwitchStateOrBuilder getSwitchStatesOrBuilder(int i14) {
            return this.switchStates_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStateOrBuilder
        public List<? extends SwitchStateOrBuilder> getSwitchStatesOrBuilderList() {
            return this.switchStates_;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStateOrBuilder
        public float getTemperature() {
            return this.temperature_;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStateOrBuilder
        public boolean hasBatteryVoltage() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStateOrBuilder
        public boolean hasLowVoltageShutdown() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStateOrBuilder
        public boolean hasOverloaded() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStateOrBuilder
        public boolean hasPendingUpdateVersion() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStateOrBuilder
        public boolean hasTemperature() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasBatteryVoltage()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Float.floatToIntBits(getBatteryVoltage());
            }
            if (hasLowVoltageShutdown()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getLowVoltageShutdown());
            }
            if (hasOverloaded()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashBoolean(getOverloaded());
            }
            if (hasTemperature()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + Float.floatToIntBits(getTemperature());
            }
            if (hasPendingUpdateVersion()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getPendingUpdateVersion();
            }
            if (getSwitchStatesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getSwitchStatesList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitcherState_fieldAccessorTable.ensureFieldAccessorsInitialized(SwitcherState.class, Builder.class);
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
            return new SwitcherState();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeFloat(1, this.batteryVoltage_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.lowVoltageShutdown_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBool(3, this.overloaded_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeFloat(4, this.temperature_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(5, this.pendingUpdateVersion_);
            }
            for (int i14 = 0; i14 < this.switchStates_.size(); i14++) {
                codedOutputStream.writeMessage(6, this.switchStates_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SwitcherStateOrBuilder {
            private float batteryVoltage_;
            private int bitField0_;
            private boolean lowVoltageShutdown_;
            private boolean overloaded_;
            private int pendingUpdateVersion_;
            private RepeatedFieldBuilderV3<SwitchState, SwitchState.Builder, SwitchStateOrBuilder> switchStatesBuilder_;
            private List<SwitchState> switchStates_;
            private float temperature_;

            private Builder() {
                this.switchStates_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(SwitcherState switcherState) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    switcherState.batteryVoltage_ = this.batteryVoltage_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    switcherState.lowVoltageShutdown_ = this.lowVoltageShutdown_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    switcherState.overloaded_ = this.overloaded_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    switcherState.temperature_ = this.temperature_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    switcherState.pendingUpdateVersion_ = this.pendingUpdateVersion_;
                    i14 |= 16;
                }
                switcherState.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(SwitcherState switcherState) {
                RepeatedFieldBuilderV3<SwitchState, SwitchState.Builder, SwitchStateOrBuilder> repeatedFieldBuilderV3 = this.switchStatesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    switcherState.switchStates_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 32) != 0) {
                    this.switchStates_ = Collections.unmodifiableList(this.switchStates_);
                    this.bitField0_ &= -33;
                }
                switcherState.switchStates_ = this.switchStates_;
            }

            private void ensureSwitchStatesIsMutable() {
                if ((this.bitField0_ & 32) == 0) {
                    this.switchStates_ = new ArrayList(this.switchStates_);
                    this.bitField0_ |= 32;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitcherState_descriptor;
            }

            private RepeatedFieldBuilderV3<SwitchState, SwitchState.Builder, SwitchStateOrBuilder> getSwitchStatesFieldBuilder() {
                if (this.switchStatesBuilder_ == null) {
                    this.switchStatesBuilder_ = new RepeatedFieldBuilderV3<>(this.switchStates_, (this.bitField0_ & 32) != 0, getParentForChildren(), isClean());
                    this.switchStates_ = null;
                }
                return this.switchStatesBuilder_;
            }

            public Builder addAllSwitchStates(Iterable<? extends SwitchState> iterable) {
                RepeatedFieldBuilderV3<SwitchState, SwitchState.Builder, SwitchStateOrBuilder> repeatedFieldBuilderV3 = this.switchStatesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureSwitchStatesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.switchStates_);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addSwitchStates(SwitchState.Builder builder) {
                RepeatedFieldBuilderV3<SwitchState, SwitchState.Builder, SwitchStateOrBuilder> repeatedFieldBuilderV3 = this.switchStatesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureSwitchStatesIsMutable();
                this.switchStates_.add(builder.build());
                onChanged();
                return this;
            }

            public SwitchState.Builder addSwitchStatesBuilder() {
                return (SwitchState.Builder) getSwitchStatesFieldBuilder().addBuilder(SwitchState.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwitcherState build() {
                SwitcherState switcherStateBuildPartial = buildPartial();
                if (switcherStateBuildPartial.isInitialized()) {
                    return switcherStateBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) switcherStateBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwitcherState buildPartial() {
                SwitcherState switcherState = new SwitcherState(this);
                buildPartialRepeatedFields(switcherState);
                if (this.bitField0_ != 0) {
                    buildPartial0(switcherState);
                }
                onBuilt();
                return switcherState;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.batteryVoltage_ = 0.0f;
                this.lowVoltageShutdown_ = false;
                this.overloaded_ = false;
                this.temperature_ = 0.0f;
                this.pendingUpdateVersion_ = 0;
                RepeatedFieldBuilderV3<SwitchState, SwitchState.Builder, SwitchStateOrBuilder> repeatedFieldBuilderV3 = this.switchStatesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.switchStates_ = Collections.EMPTY_LIST;
                } else {
                    this.switchStates_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -33;
                return this;
            }

            public Builder clearBatteryVoltage() {
                this.bitField0_ &= -2;
                this.batteryVoltage_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLowVoltageShutdown() {
                this.bitField0_ &= -3;
                this.lowVoltageShutdown_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearOverloaded() {
                this.bitField0_ &= -5;
                this.overloaded_ = false;
                onChanged();
                return this;
            }

            public Builder clearPendingUpdateVersion() {
                this.bitField0_ &= -17;
                this.pendingUpdateVersion_ = 0;
                onChanged();
                return this;
            }

            public Builder clearSwitchStates() {
                RepeatedFieldBuilderV3<SwitchState, SwitchState.Builder, SwitchStateOrBuilder> repeatedFieldBuilderV3 = this.switchStatesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.switchStates_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -33;
                onChanged();
                return this;
            }

            public Builder clearTemperature() {
                this.bitField0_ &= -9;
                this.temperature_ = 0.0f;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStateOrBuilder
            public float getBatteryVoltage() {
                return this.batteryVoltage_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitcherState_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStateOrBuilder
            public boolean getLowVoltageShutdown() {
                return this.lowVoltageShutdown_;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStateOrBuilder
            public boolean getOverloaded() {
                return this.overloaded_;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStateOrBuilder
            public int getPendingUpdateVersion() {
                return this.pendingUpdateVersion_;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStateOrBuilder
            public SwitchState getSwitchStates(int i14) {
                RepeatedFieldBuilderV3<SwitchState, SwitchState.Builder, SwitchStateOrBuilder> repeatedFieldBuilderV3 = this.switchStatesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.switchStates_.get(i14) : (SwitchState) repeatedFieldBuilderV3.getMessage(i14);
            }

            public SwitchState.Builder getSwitchStatesBuilder(int i14) {
                return (SwitchState.Builder) getSwitchStatesFieldBuilder().getBuilder(i14);
            }

            public List<SwitchState.Builder> getSwitchStatesBuilderList() {
                return getSwitchStatesFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStateOrBuilder
            public int getSwitchStatesCount() {
                RepeatedFieldBuilderV3<SwitchState, SwitchState.Builder, SwitchStateOrBuilder> repeatedFieldBuilderV3 = this.switchStatesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.switchStates_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStateOrBuilder
            public List<SwitchState> getSwitchStatesList() {
                RepeatedFieldBuilderV3<SwitchState, SwitchState.Builder, SwitchStateOrBuilder> repeatedFieldBuilderV3 = this.switchStatesBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.switchStates_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStateOrBuilder
            public SwitchStateOrBuilder getSwitchStatesOrBuilder(int i14) {
                RepeatedFieldBuilderV3<SwitchState, SwitchState.Builder, SwitchStateOrBuilder> repeatedFieldBuilderV3 = this.switchStatesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.switchStates_.get(i14) : (SwitchStateOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStateOrBuilder
            public List<? extends SwitchStateOrBuilder> getSwitchStatesOrBuilderList() {
                RepeatedFieldBuilderV3<SwitchState, SwitchState.Builder, SwitchStateOrBuilder> repeatedFieldBuilderV3 = this.switchStatesBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.switchStates_);
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStateOrBuilder
            public float getTemperature() {
                return this.temperature_;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStateOrBuilder
            public boolean hasBatteryVoltage() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStateOrBuilder
            public boolean hasLowVoltageShutdown() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStateOrBuilder
            public boolean hasOverloaded() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStateOrBuilder
            public boolean hasPendingUpdateVersion() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStateOrBuilder
            public boolean hasTemperature() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitcherState_fieldAccessorTable.ensureFieldAccessorsInitialized(SwitcherState.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(SwitcherState switcherState) {
                if (switcherState == SwitcherState.getDefaultInstance()) {
                    return this;
                }
                if (switcherState.hasBatteryVoltage()) {
                    setBatteryVoltage(switcherState.getBatteryVoltage());
                }
                if (switcherState.hasLowVoltageShutdown()) {
                    setLowVoltageShutdown(switcherState.getLowVoltageShutdown());
                }
                if (switcherState.hasOverloaded()) {
                    setOverloaded(switcherState.getOverloaded());
                }
                if (switcherState.hasTemperature()) {
                    setTemperature(switcherState.getTemperature());
                }
                if (switcherState.hasPendingUpdateVersion()) {
                    setPendingUpdateVersion(switcherState.getPendingUpdateVersion());
                }
                if (this.switchStatesBuilder_ == null) {
                    if (!switcherState.switchStates_.isEmpty()) {
                        if (this.switchStates_.isEmpty()) {
                            this.switchStates_ = switcherState.switchStates_;
                            this.bitField0_ &= -33;
                        } else {
                            ensureSwitchStatesIsMutable();
                            this.switchStates_.addAll(switcherState.switchStates_);
                        }
                        onChanged();
                    }
                } else if (!switcherState.switchStates_.isEmpty()) {
                    boolean zIsEmpty = this.switchStatesBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<SwitchState, SwitchState.Builder, SwitchStateOrBuilder> repeatedFieldBuilderV3 = this.switchStatesBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.switchStatesBuilder_ = null;
                        this.switchStates_ = switcherState.switchStates_;
                        this.bitField0_ &= -33;
                        this.switchStatesBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getSwitchStatesFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(switcherState.switchStates_);
                    }
                }
                mergeUnknownFields(switcherState.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeSwitchStates(int i14) {
                RepeatedFieldBuilderV3<SwitchState, SwitchState.Builder, SwitchStateOrBuilder> repeatedFieldBuilderV3 = this.switchStatesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureSwitchStatesIsMutable();
                this.switchStates_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setBatteryVoltage(float f14) {
                this.batteryVoltage_ = f14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setLowVoltageShutdown(boolean z14) {
                this.lowVoltageShutdown_ = z14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setOverloaded(boolean z14) {
                this.overloaded_ = z14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPendingUpdateVersion(int i14) {
                this.pendingUpdateVersion_ = i14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSwitchStates(int i14, SwitchState.Builder builder) {
                RepeatedFieldBuilderV3<SwitchState, SwitchState.Builder, SwitchStateOrBuilder> repeatedFieldBuilderV3 = this.switchStatesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureSwitchStatesIsMutable();
                this.switchStates_.set(i14, builder.build());
                onChanged();
                return this;
            }

            public Builder setTemperature(float f14) {
                this.temperature_ = f14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SwitcherState getDefaultInstanceForType() {
                return SwitcherState.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.switchStates_ = Collections.EMPTY_LIST;
            }

            public SwitchState.Builder addSwitchStatesBuilder(int i14) {
                return (SwitchState.Builder) getSwitchStatesFieldBuilder().addBuilder(i14, SwitchState.getDefaultInstance());
            }

            public Builder addSwitchStates(int i14, SwitchState switchState) {
                RepeatedFieldBuilderV3<SwitchState, SwitchState.Builder, SwitchStateOrBuilder> repeatedFieldBuilderV3 = this.switchStatesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    switchState.getClass();
                    ensureSwitchStatesIsMutable();
                    this.switchStates_.add(i14, switchState);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, switchState);
                return this;
            }

            public Builder setSwitchStates(int i14, SwitchState switchState) {
                RepeatedFieldBuilderV3<SwitchState, SwitchState.Builder, SwitchStateOrBuilder> repeatedFieldBuilderV3 = this.switchStatesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    switchState.getClass();
                    ensureSwitchStatesIsMutable();
                    this.switchStates_.set(i14, switchState);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, switchState);
                return this;
            }

            public Builder addSwitchStates(SwitchState switchState) {
                RepeatedFieldBuilderV3<SwitchState, SwitchState.Builder, SwitchStateOrBuilder> repeatedFieldBuilderV3 = this.switchStatesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    switchState.getClass();
                    ensureSwitchStatesIsMutable();
                    this.switchStates_.add(switchState);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(switchState);
                return this;
            }

            public Builder addSwitchStates(int i14, SwitchState.Builder builder) {
                RepeatedFieldBuilderV3<SwitchState, SwitchState.Builder, SwitchStateOrBuilder> repeatedFieldBuilderV3 = this.switchStatesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureSwitchStatesIsMutable();
                    this.switchStates_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SwitcherState) {
                    return mergeFrom((SwitcherState) message);
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
                                if (tag == 13) {
                                    this.batteryVoltage_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.lowVoltageShutdown_ = codedInputStream.readBool();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.overloaded_ = codedInputStream.readBool();
                                    this.bitField0_ |= 4;
                                } else if (tag == 37) {
                                    this.temperature_ = codedInputStream.readFloat();
                                    this.bitField0_ |= 8;
                                } else if (tag == 40) {
                                    this.pendingUpdateVersion_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                } else if (tag != 50) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    SwitchState switchState = (SwitchState) codedInputStream.readMessage(SwitchState.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<SwitchState, SwitchState.Builder, SwitchStateOrBuilder> repeatedFieldBuilderV3 = this.switchStatesBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureSwitchStatesIsMutable();
                                        this.switchStates_.add(switchState);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(switchState);
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
        public SwitcherState getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SwitcherState parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwitcherState) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwitcherState parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SwitcherState parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SwitcherState parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SwitcherState parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SwitcherState parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SwitcherState parseFrom(InputStream inputStream) {
            return (SwitcherState) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SwitcherState parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwitcherState) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwitcherState parseFrom(CodedInputStream codedInputStream) {
            return (SwitcherState) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SwitcherState parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwitcherState) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private SwitcherState(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.batteryVoltage_ = 0.0f;
            this.lowVoltageShutdown_ = false;
            this.overloaded_ = false;
            this.temperature_ = 0.0f;
            this.pendingUpdateVersion_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ SwitcherState(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class SwitcherStatusChangeDetails extends GeneratedMessageV3 implements SwitcherStatusChangeDetailsOrBuilder {
        public static final int SWITCHER_DETAILS_FIELD_NUMBER = 1000;
        public static final int SWITCHER_SETTINGS_FIELD_NUMBER = 1;
        public static final int SWITCHER_STATE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private SwitcherSettings switcherSettings_;
        private SwitcherState switcherState_;
        private static final SwitcherStatusChangeDetails DEFAULT_INSTANCE = new SwitcherStatusChangeDetails();

        @Deprecated
        public static final Parser<SwitcherStatusChangeDetails> PARSER = new AbstractParser<SwitcherStatusChangeDetails>() { // from class: com.garmin.proto.generated.GDISwitcherProto.SwitcherStatusChangeDetails.1
            @Override // com.google.protobuf.Parser
            public SwitcherStatusChangeDetails parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SwitcherStatusChangeDetails.newBuilder();
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
        public static final GeneratedMessage.GeneratedExtension<GDIEventSharingProto.AlertNotification, SwitcherStatusChangeDetails> switcherDetails = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, SwitcherStatusChangeDetails.class, getDefaultInstance());

        private SwitcherStatusChangeDetails(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SwitcherStatusChangeDetails getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitcherStatusChangeDetails_descriptor;
        }

        public static Builder newBuilder(SwitcherStatusChangeDetails switcherStatusChangeDetails) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(switcherStatusChangeDetails);
        }

        public static SwitcherStatusChangeDetails parseDelimitedFrom(InputStream inputStream) {
            return (SwitcherStatusChangeDetails) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SwitcherStatusChangeDetails parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SwitcherStatusChangeDetails> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SwitcherStatusChangeDetails)) {
                return super.equals(obj);
            }
            SwitcherStatusChangeDetails switcherStatusChangeDetails = (SwitcherStatusChangeDetails) obj;
            if (hasSwitcherSettings() != switcherStatusChangeDetails.hasSwitcherSettings()) {
                return false;
            }
            if ((!hasSwitcherSettings() || getSwitcherSettings().equals(switcherStatusChangeDetails.getSwitcherSettings())) && hasSwitcherState() == switcherStatusChangeDetails.hasSwitcherState()) {
                return (!hasSwitcherState() || getSwitcherState().equals(switcherStatusChangeDetails.getSwitcherState())) && getUnknownFields().equals(switcherStatusChangeDetails.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SwitcherStatusChangeDetails> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getSwitcherSettings()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getSwitcherState());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStatusChangeDetailsOrBuilder
        public SwitcherSettings getSwitcherSettings() {
            SwitcherSettings switcherSettings = this.switcherSettings_;
            return switcherSettings == null ? SwitcherSettings.getDefaultInstance() : switcherSettings;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStatusChangeDetailsOrBuilder
        public SwitcherSettingsOrBuilder getSwitcherSettingsOrBuilder() {
            SwitcherSettings switcherSettings = this.switcherSettings_;
            return switcherSettings == null ? SwitcherSettings.getDefaultInstance() : switcherSettings;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStatusChangeDetailsOrBuilder
        public SwitcherState getSwitcherState() {
            SwitcherState switcherState = this.switcherState_;
            return switcherState == null ? SwitcherState.getDefaultInstance() : switcherState;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStatusChangeDetailsOrBuilder
        public SwitcherStateOrBuilder getSwitcherStateOrBuilder() {
            SwitcherState switcherState = this.switcherState_;
            return switcherState == null ? SwitcherState.getDefaultInstance() : switcherState;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStatusChangeDetailsOrBuilder
        public boolean hasSwitcherSettings() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStatusChangeDetailsOrBuilder
        public boolean hasSwitcherState() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSwitcherSettings()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSwitcherSettings().hashCode();
            }
            if (hasSwitcherState()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSwitcherState().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitcherStatusChangeDetails_fieldAccessorTable.ensureFieldAccessorsInitialized(SwitcherStatusChangeDetails.class, Builder.class);
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
            return new SwitcherStatusChangeDetails();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getSwitcherSettings());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getSwitcherState());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SwitcherStatusChangeDetailsOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<SwitcherSettings, SwitcherSettings.Builder, SwitcherSettingsOrBuilder> switcherSettingsBuilder_;
            private SwitcherSettings switcherSettings_;
            private SingleFieldBuilderV3<SwitcherState, SwitcherState.Builder, SwitcherStateOrBuilder> switcherStateBuilder_;
            private SwitcherState switcherState_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(SwitcherStatusChangeDetails switcherStatusChangeDetails) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<SwitcherSettings, SwitcherSettings.Builder, SwitcherSettingsOrBuilder> singleFieldBuilderV3 = this.switcherSettingsBuilder_;
                    switcherStatusChangeDetails.switcherSettings_ = singleFieldBuilderV3 == null ? this.switcherSettings_ : (SwitcherSettings) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<SwitcherState, SwitcherState.Builder, SwitcherStateOrBuilder> singleFieldBuilderV4 = this.switcherStateBuilder_;
                    switcherStatusChangeDetails.switcherState_ = singleFieldBuilderV4 == null ? this.switcherState_ : (SwitcherState) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                switcherStatusChangeDetails.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitcherStatusChangeDetails_descriptor;
            }

            private SingleFieldBuilderV3<SwitcherSettings, SwitcherSettings.Builder, SwitcherSettingsOrBuilder> getSwitcherSettingsFieldBuilder() {
                if (this.switcherSettingsBuilder_ == null) {
                    this.switcherSettingsBuilder_ = new SingleFieldBuilderV3<>(getSwitcherSettings(), getParentForChildren(), isClean());
                    this.switcherSettings_ = null;
                }
                return this.switcherSettingsBuilder_;
            }

            private SingleFieldBuilderV3<SwitcherState, SwitcherState.Builder, SwitcherStateOrBuilder> getSwitcherStateFieldBuilder() {
                if (this.switcherStateBuilder_ == null) {
                    this.switcherStateBuilder_ = new SingleFieldBuilderV3<>(getSwitcherState(), getParentForChildren(), isClean());
                    this.switcherState_ = null;
                }
                return this.switcherStateBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSwitcherSettingsFieldBuilder();
                    getSwitcherStateFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwitcherStatusChangeDetails build() {
                SwitcherStatusChangeDetails switcherStatusChangeDetailsBuildPartial = buildPartial();
                if (switcherStatusChangeDetailsBuildPartial.isInitialized()) {
                    return switcherStatusChangeDetailsBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) switcherStatusChangeDetailsBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwitcherStatusChangeDetails buildPartial() {
                SwitcherStatusChangeDetails switcherStatusChangeDetails = new SwitcherStatusChangeDetails(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(switcherStatusChangeDetails);
                }
                onBuilt();
                return switcherStatusChangeDetails;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.switcherSettings_ = null;
                SingleFieldBuilderV3<SwitcherSettings, SwitcherSettings.Builder, SwitcherSettingsOrBuilder> singleFieldBuilderV3 = this.switcherSettingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.switcherSettingsBuilder_ = null;
                }
                this.switcherState_ = null;
                SingleFieldBuilderV3<SwitcherState, SwitcherState.Builder, SwitcherStateOrBuilder> singleFieldBuilderV4 = this.switcherStateBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.switcherStateBuilder_ = null;
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

            public Builder clearSwitcherSettings() {
                this.bitField0_ &= -2;
                this.switcherSettings_ = null;
                SingleFieldBuilderV3<SwitcherSettings, SwitcherSettings.Builder, SwitcherSettingsOrBuilder> singleFieldBuilderV3 = this.switcherSettingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.switcherSettingsBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSwitcherState() {
                this.bitField0_ &= -3;
                this.switcherState_ = null;
                SingleFieldBuilderV3<SwitcherState, SwitcherState.Builder, SwitcherStateOrBuilder> singleFieldBuilderV3 = this.switcherStateBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.switcherStateBuilder_ = null;
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
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitcherStatusChangeDetails_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStatusChangeDetailsOrBuilder
            public SwitcherSettings getSwitcherSettings() {
                SingleFieldBuilderV3<SwitcherSettings, SwitcherSettings.Builder, SwitcherSettingsOrBuilder> singleFieldBuilderV3 = this.switcherSettingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwitcherSettings) singleFieldBuilderV3.getMessage();
                }
                SwitcherSettings switcherSettings = this.switcherSettings_;
                return switcherSettings == null ? SwitcherSettings.getDefaultInstance() : switcherSettings;
            }

            public SwitcherSettings.Builder getSwitcherSettingsBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SwitcherSettings.Builder) getSwitcherSettingsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStatusChangeDetailsOrBuilder
            public SwitcherSettingsOrBuilder getSwitcherSettingsOrBuilder() {
                SingleFieldBuilderV3<SwitcherSettings, SwitcherSettings.Builder, SwitcherSettingsOrBuilder> singleFieldBuilderV3 = this.switcherSettingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwitcherSettingsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SwitcherSettings switcherSettings = this.switcherSettings_;
                return switcherSettings == null ? SwitcherSettings.getDefaultInstance() : switcherSettings;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStatusChangeDetailsOrBuilder
            public SwitcherState getSwitcherState() {
                SingleFieldBuilderV3<SwitcherState, SwitcherState.Builder, SwitcherStateOrBuilder> singleFieldBuilderV3 = this.switcherStateBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwitcherState) singleFieldBuilderV3.getMessage();
                }
                SwitcherState switcherState = this.switcherState_;
                return switcherState == null ? SwitcherState.getDefaultInstance() : switcherState;
            }

            public SwitcherState.Builder getSwitcherStateBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (SwitcherState.Builder) getSwitcherStateFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStatusChangeDetailsOrBuilder
            public SwitcherStateOrBuilder getSwitcherStateOrBuilder() {
                SingleFieldBuilderV3<SwitcherState, SwitcherState.Builder, SwitcherStateOrBuilder> singleFieldBuilderV3 = this.switcherStateBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwitcherStateOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SwitcherState switcherState = this.switcherState_;
                return switcherState == null ? SwitcherState.getDefaultInstance() : switcherState;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStatusChangeDetailsOrBuilder
            public boolean hasSwitcherSettings() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStatusChangeDetailsOrBuilder
            public boolean hasSwitcherState() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitcherStatusChangeDetails_fieldAccessorTable.ensureFieldAccessorsInitialized(SwitcherStatusChangeDetails.class, Builder.class);
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
                                    codedInputStream.readMessage(getSwitcherSettingsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getSwitcherStateFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeSwitcherSettings(SwitcherSettings switcherSettings) {
                SwitcherSettings switcherSettings2;
                SingleFieldBuilderV3<SwitcherSettings, SwitcherSettings.Builder, SwitcherSettingsOrBuilder> singleFieldBuilderV3 = this.switcherSettingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(switcherSettings);
                } else if ((this.bitField0_ & 1) == 0 || (switcherSettings2 = this.switcherSettings_) == null || switcherSettings2 == SwitcherSettings.getDefaultInstance()) {
                    this.switcherSettings_ = switcherSettings;
                } else {
                    getSwitcherSettingsBuilder().mergeFrom(switcherSettings);
                }
                if (this.switcherSettings_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSwitcherState(SwitcherState switcherState) {
                SwitcherState switcherState2;
                SingleFieldBuilderV3<SwitcherState, SwitcherState.Builder, SwitcherStateOrBuilder> singleFieldBuilderV3 = this.switcherStateBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(switcherState);
                } else if ((this.bitField0_ & 2) == 0 || (switcherState2 = this.switcherState_) == null || switcherState2 == SwitcherState.getDefaultInstance()) {
                    this.switcherState_ = switcherState;
                } else {
                    getSwitcherStateBuilder().mergeFrom(switcherState);
                }
                if (this.switcherState_ != null) {
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

            public Builder setSwitcherSettings(SwitcherSettings.Builder builder) {
                SingleFieldBuilderV3<SwitcherSettings, SwitcherSettings.Builder, SwitcherSettingsOrBuilder> singleFieldBuilderV3 = this.switcherSettingsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.switcherSettings_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSwitcherState(SwitcherState.Builder builder) {
                SingleFieldBuilderV3<SwitcherState, SwitcherState.Builder, SwitcherStateOrBuilder> singleFieldBuilderV3 = this.switcherStateBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.switcherState_ = builder.build();
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
            public SwitcherStatusChangeDetails getDefaultInstanceForType() {
                return SwitcherStatusChangeDetails.getDefaultInstance();
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

            public Builder setSwitcherSettings(SwitcherSettings switcherSettings) {
                SingleFieldBuilderV3<SwitcherSettings, SwitcherSettings.Builder, SwitcherSettingsOrBuilder> singleFieldBuilderV3 = this.switcherSettingsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    switcherSettings.getClass();
                    this.switcherSettings_ = switcherSettings;
                } else {
                    singleFieldBuilderV3.setMessage(switcherSettings);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSwitcherState(SwitcherState switcherState) {
                SingleFieldBuilderV3<SwitcherState, SwitcherState.Builder, SwitcherStateOrBuilder> singleFieldBuilderV3 = this.switcherStateBuilder_;
                if (singleFieldBuilderV3 == null) {
                    switcherState.getClass();
                    this.switcherState_ = switcherState;
                } else {
                    singleFieldBuilderV3.setMessage(switcherState);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SwitcherStatusChangeDetails) {
                    return mergeFrom((SwitcherStatusChangeDetails) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SwitcherStatusChangeDetails switcherStatusChangeDetails) {
                if (switcherStatusChangeDetails == SwitcherStatusChangeDetails.getDefaultInstance()) {
                    return this;
                }
                if (switcherStatusChangeDetails.hasSwitcherSettings()) {
                    mergeSwitcherSettings(switcherStatusChangeDetails.getSwitcherSettings());
                }
                if (switcherStatusChangeDetails.hasSwitcherState()) {
                    mergeSwitcherState(switcherStatusChangeDetails.getSwitcherState());
                }
                mergeUnknownFields(switcherStatusChangeDetails.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SwitcherStatusChangeDetails getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ SwitcherStatusChangeDetails(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SwitcherStatusChangeDetails() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SwitcherStatusChangeDetails parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwitcherStatusChangeDetails) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwitcherStatusChangeDetails parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SwitcherStatusChangeDetails parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SwitcherStatusChangeDetails parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SwitcherStatusChangeDetails parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SwitcherStatusChangeDetails parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SwitcherStatusChangeDetails parseFrom(InputStream inputStream) {
            return (SwitcherStatusChangeDetails) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SwitcherStatusChangeDetails parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwitcherStatusChangeDetails) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwitcherStatusChangeDetails parseFrom(CodedInputStream codedInputStream) {
            return (SwitcherStatusChangeDetails) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SwitcherStatusChangeDetails parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwitcherStatusChangeDetails) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SwitcherStatusResponse extends GeneratedMessageV3 implements SwitcherStatusResponseOrBuilder {
        private static final SwitcherStatusResponse DEFAULT_INSTANCE = new SwitcherStatusResponse();

        @Deprecated
        public static final Parser<SwitcherStatusResponse> PARSER = new AbstractParser<SwitcherStatusResponse>() { // from class: com.garmin.proto.generated.GDISwitcherProto.SwitcherStatusResponse.1
            @Override // com.google.protobuf.Parser
            public SwitcherStatusResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SwitcherStatusResponse.newBuilder();
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
        public static final int SWITCHER_SETTINGS_FIELD_NUMBER = 1;
        public static final int SWITCHER_STATE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private SwitcherSettings switcherSettings_;
        private SwitcherState switcherState_;

        private SwitcherStatusResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SwitcherStatusResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitcherStatusResponse_descriptor;
        }

        public static Builder newBuilder(SwitcherStatusResponse switcherStatusResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(switcherStatusResponse);
        }

        public static SwitcherStatusResponse parseDelimitedFrom(InputStream inputStream) {
            return (SwitcherStatusResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SwitcherStatusResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SwitcherStatusResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SwitcherStatusResponse)) {
                return super.equals(obj);
            }
            SwitcherStatusResponse switcherStatusResponse = (SwitcherStatusResponse) obj;
            if (hasSwitcherSettings() != switcherStatusResponse.hasSwitcherSettings()) {
                return false;
            }
            if ((!hasSwitcherSettings() || getSwitcherSettings().equals(switcherStatusResponse.getSwitcherSettings())) && hasSwitcherState() == switcherStatusResponse.hasSwitcherState()) {
                return (!hasSwitcherState() || getSwitcherState().equals(switcherStatusResponse.getSwitcherState())) && getUnknownFields().equals(switcherStatusResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SwitcherStatusResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getSwitcherSettings()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getSwitcherState());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStatusResponseOrBuilder
        public SwitcherSettings getSwitcherSettings() {
            SwitcherSettings switcherSettings = this.switcherSettings_;
            return switcherSettings == null ? SwitcherSettings.getDefaultInstance() : switcherSettings;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStatusResponseOrBuilder
        public SwitcherSettingsOrBuilder getSwitcherSettingsOrBuilder() {
            SwitcherSettings switcherSettings = this.switcherSettings_;
            return switcherSettings == null ? SwitcherSettings.getDefaultInstance() : switcherSettings;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStatusResponseOrBuilder
        public SwitcherState getSwitcherState() {
            SwitcherState switcherState = this.switcherState_;
            return switcherState == null ? SwitcherState.getDefaultInstance() : switcherState;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStatusResponseOrBuilder
        public SwitcherStateOrBuilder getSwitcherStateOrBuilder() {
            SwitcherState switcherState = this.switcherState_;
            return switcherState == null ? SwitcherState.getDefaultInstance() : switcherState;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStatusResponseOrBuilder
        public boolean hasSwitcherSettings() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStatusResponseOrBuilder
        public boolean hasSwitcherState() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSwitcherSettings()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSwitcherSettings().hashCode();
            }
            if (hasSwitcherState()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSwitcherState().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitcherStatusResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SwitcherStatusResponse.class, Builder.class);
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
            return new SwitcherStatusResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getSwitcherSettings());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getSwitcherState());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SwitcherStatusResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<SwitcherSettings, SwitcherSettings.Builder, SwitcherSettingsOrBuilder> switcherSettingsBuilder_;
            private SwitcherSettings switcherSettings_;
            private SingleFieldBuilderV3<SwitcherState, SwitcherState.Builder, SwitcherStateOrBuilder> switcherStateBuilder_;
            private SwitcherState switcherState_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(SwitcherStatusResponse switcherStatusResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<SwitcherSettings, SwitcherSettings.Builder, SwitcherSettingsOrBuilder> singleFieldBuilderV3 = this.switcherSettingsBuilder_;
                    switcherStatusResponse.switcherSettings_ = singleFieldBuilderV3 == null ? this.switcherSettings_ : (SwitcherSettings) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<SwitcherState, SwitcherState.Builder, SwitcherStateOrBuilder> singleFieldBuilderV4 = this.switcherStateBuilder_;
                    switcherStatusResponse.switcherState_ = singleFieldBuilderV4 == null ? this.switcherState_ : (SwitcherState) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                switcherStatusResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitcherStatusResponse_descriptor;
            }

            private SingleFieldBuilderV3<SwitcherSettings, SwitcherSettings.Builder, SwitcherSettingsOrBuilder> getSwitcherSettingsFieldBuilder() {
                if (this.switcherSettingsBuilder_ == null) {
                    this.switcherSettingsBuilder_ = new SingleFieldBuilderV3<>(getSwitcherSettings(), getParentForChildren(), isClean());
                    this.switcherSettings_ = null;
                }
                return this.switcherSettingsBuilder_;
            }

            private SingleFieldBuilderV3<SwitcherState, SwitcherState.Builder, SwitcherStateOrBuilder> getSwitcherStateFieldBuilder() {
                if (this.switcherStateBuilder_ == null) {
                    this.switcherStateBuilder_ = new SingleFieldBuilderV3<>(getSwitcherState(), getParentForChildren(), isClean());
                    this.switcherState_ = null;
                }
                return this.switcherStateBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSwitcherSettingsFieldBuilder();
                    getSwitcherStateFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwitcherStatusResponse build() {
                SwitcherStatusResponse switcherStatusResponseBuildPartial = buildPartial();
                if (switcherStatusResponseBuildPartial.isInitialized()) {
                    return switcherStatusResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) switcherStatusResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SwitcherStatusResponse buildPartial() {
                SwitcherStatusResponse switcherStatusResponse = new SwitcherStatusResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(switcherStatusResponse);
                }
                onBuilt();
                return switcherStatusResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.switcherSettings_ = null;
                SingleFieldBuilderV3<SwitcherSettings, SwitcherSettings.Builder, SwitcherSettingsOrBuilder> singleFieldBuilderV3 = this.switcherSettingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.switcherSettingsBuilder_ = null;
                }
                this.switcherState_ = null;
                SingleFieldBuilderV3<SwitcherState, SwitcherState.Builder, SwitcherStateOrBuilder> singleFieldBuilderV4 = this.switcherStateBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.switcherStateBuilder_ = null;
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

            public Builder clearSwitcherSettings() {
                this.bitField0_ &= -2;
                this.switcherSettings_ = null;
                SingleFieldBuilderV3<SwitcherSettings, SwitcherSettings.Builder, SwitcherSettingsOrBuilder> singleFieldBuilderV3 = this.switcherSettingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.switcherSettingsBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSwitcherState() {
                this.bitField0_ &= -3;
                this.switcherState_ = null;
                SingleFieldBuilderV3<SwitcherState, SwitcherState.Builder, SwitcherStateOrBuilder> singleFieldBuilderV3 = this.switcherStateBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.switcherStateBuilder_ = null;
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
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitcherStatusResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStatusResponseOrBuilder
            public SwitcherSettings getSwitcherSettings() {
                SingleFieldBuilderV3<SwitcherSettings, SwitcherSettings.Builder, SwitcherSettingsOrBuilder> singleFieldBuilderV3 = this.switcherSettingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwitcherSettings) singleFieldBuilderV3.getMessage();
                }
                SwitcherSettings switcherSettings = this.switcherSettings_;
                return switcherSettings == null ? SwitcherSettings.getDefaultInstance() : switcherSettings;
            }

            public SwitcherSettings.Builder getSwitcherSettingsBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (SwitcherSettings.Builder) getSwitcherSettingsFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStatusResponseOrBuilder
            public SwitcherSettingsOrBuilder getSwitcherSettingsOrBuilder() {
                SingleFieldBuilderV3<SwitcherSettings, SwitcherSettings.Builder, SwitcherSettingsOrBuilder> singleFieldBuilderV3 = this.switcherSettingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwitcherSettingsOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SwitcherSettings switcherSettings = this.switcherSettings_;
                return switcherSettings == null ? SwitcherSettings.getDefaultInstance() : switcherSettings;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStatusResponseOrBuilder
            public SwitcherState getSwitcherState() {
                SingleFieldBuilderV3<SwitcherState, SwitcherState.Builder, SwitcherStateOrBuilder> singleFieldBuilderV3 = this.switcherStateBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwitcherState) singleFieldBuilderV3.getMessage();
                }
                SwitcherState switcherState = this.switcherState_;
                return switcherState == null ? SwitcherState.getDefaultInstance() : switcherState;
            }

            public SwitcherState.Builder getSwitcherStateBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (SwitcherState.Builder) getSwitcherStateFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStatusResponseOrBuilder
            public SwitcherStateOrBuilder getSwitcherStateOrBuilder() {
                SingleFieldBuilderV3<SwitcherState, SwitcherState.Builder, SwitcherStateOrBuilder> singleFieldBuilderV3 = this.switcherStateBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SwitcherStateOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SwitcherState switcherState = this.switcherState_;
                return switcherState == null ? SwitcherState.getDefaultInstance() : switcherState;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStatusResponseOrBuilder
            public boolean hasSwitcherSettings() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDISwitcherProto.SwitcherStatusResponseOrBuilder
            public boolean hasSwitcherState() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDISwitcherProto.internal_static_GDI_Proto_Switcher_SwitcherStatusResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SwitcherStatusResponse.class, Builder.class);
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
                                    codedInputStream.readMessage(getSwitcherSettingsFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getSwitcherStateFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeSwitcherSettings(SwitcherSettings switcherSettings) {
                SwitcherSettings switcherSettings2;
                SingleFieldBuilderV3<SwitcherSettings, SwitcherSettings.Builder, SwitcherSettingsOrBuilder> singleFieldBuilderV3 = this.switcherSettingsBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(switcherSettings);
                } else if ((this.bitField0_ & 1) == 0 || (switcherSettings2 = this.switcherSettings_) == null || switcherSettings2 == SwitcherSettings.getDefaultInstance()) {
                    this.switcherSettings_ = switcherSettings;
                } else {
                    getSwitcherSettingsBuilder().mergeFrom(switcherSettings);
                }
                if (this.switcherSettings_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSwitcherState(SwitcherState switcherState) {
                SwitcherState switcherState2;
                SingleFieldBuilderV3<SwitcherState, SwitcherState.Builder, SwitcherStateOrBuilder> singleFieldBuilderV3 = this.switcherStateBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(switcherState);
                } else if ((this.bitField0_ & 2) == 0 || (switcherState2 = this.switcherState_) == null || switcherState2 == SwitcherState.getDefaultInstance()) {
                    this.switcherState_ = switcherState;
                } else {
                    getSwitcherStateBuilder().mergeFrom(switcherState);
                }
                if (this.switcherState_ != null) {
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

            public Builder setSwitcherSettings(SwitcherSettings.Builder builder) {
                SingleFieldBuilderV3<SwitcherSettings, SwitcherSettings.Builder, SwitcherSettingsOrBuilder> singleFieldBuilderV3 = this.switcherSettingsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.switcherSettings_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSwitcherState(SwitcherState.Builder builder) {
                SingleFieldBuilderV3<SwitcherState, SwitcherState.Builder, SwitcherStateOrBuilder> singleFieldBuilderV3 = this.switcherStateBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.switcherState_ = builder.build();
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
            public SwitcherStatusResponse getDefaultInstanceForType() {
                return SwitcherStatusResponse.getDefaultInstance();
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

            public Builder setSwitcherSettings(SwitcherSettings switcherSettings) {
                SingleFieldBuilderV3<SwitcherSettings, SwitcherSettings.Builder, SwitcherSettingsOrBuilder> singleFieldBuilderV3 = this.switcherSettingsBuilder_;
                if (singleFieldBuilderV3 == null) {
                    switcherSettings.getClass();
                    this.switcherSettings_ = switcherSettings;
                } else {
                    singleFieldBuilderV3.setMessage(switcherSettings);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSwitcherState(SwitcherState switcherState) {
                SingleFieldBuilderV3<SwitcherState, SwitcherState.Builder, SwitcherStateOrBuilder> singleFieldBuilderV3 = this.switcherStateBuilder_;
                if (singleFieldBuilderV3 == null) {
                    switcherState.getClass();
                    this.switcherState_ = switcherState;
                } else {
                    singleFieldBuilderV3.setMessage(switcherState);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SwitcherStatusResponse) {
                    return mergeFrom((SwitcherStatusResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SwitcherStatusResponse switcherStatusResponse) {
                if (switcherStatusResponse == SwitcherStatusResponse.getDefaultInstance()) {
                    return this;
                }
                if (switcherStatusResponse.hasSwitcherSettings()) {
                    mergeSwitcherSettings(switcherStatusResponse.getSwitcherSettings());
                }
                if (switcherStatusResponse.hasSwitcherState()) {
                    mergeSwitcherState(switcherStatusResponse.getSwitcherState());
                }
                mergeUnknownFields(switcherStatusResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SwitcherStatusResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ SwitcherStatusResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private SwitcherStatusResponse() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SwitcherStatusResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwitcherStatusResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwitcherStatusResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SwitcherStatusResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SwitcherStatusResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SwitcherStatusResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static SwitcherStatusResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SwitcherStatusResponse parseFrom(InputStream inputStream) {
            return (SwitcherStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SwitcherStatusResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwitcherStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SwitcherStatusResponse parseFrom(CodedInputStream codedInputStream) {
            return (SwitcherStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SwitcherStatusResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SwitcherStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
