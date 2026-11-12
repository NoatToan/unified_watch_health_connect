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
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
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

/* JADX INFO: loaded from: classes4.dex */
public final class GDIConnectedDevicesReporting {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\"GDIConnectedDevicesReporting.proto\u0012#GDI.Proto.ConnectedDevicesReporting\u001a\rGDICore.proto\"Ï\u0006\n\u0007Service\u0012_\n\u0019connected_devices_request\u0018\u0001 \u0001(\u000b2<.GDI.Proto.ConnectedDevicesReporting.ConnectedDevicesRequest\u0012a\n\u001aconnected_devices_response\u0018\u0002 \u0001(\u000b2=.GDI.Proto.ConnectedDevicesReporting.ConnectedDevicesResponse\u0012v\n%connection_alert_registration_request\u0018\u0003 \u0001(\u000b2G.GDI.Proto.ConnectedDevicesReporting.ConnectionAlertRegistrationRequest\u0012x\n&connection_alert_registration_response\u0018\u0004 \u0001(\u000b2H.GDI.Proto.ConnectedDevicesReporting.ConnectionAlertRegistrationResponse\u0012^\n\u0018device_connected_request\u0018\u0005 \u0001(\u000b2<.GDI.Proto.ConnectedDevicesReporting.DevicesConnectedRequest\u0012`\n\u0019device_connected_response\u0018\u0006 \u0001(\u000b2=.GDI.Proto.ConnectedDevicesReporting.DevicesConnectedResponse\u0012d\n\u001bdevice_disconnected_request\u0018\u0007 \u0001(\u000b2?.GDI.Proto.ConnectedDevicesReporting.DevicesDisconnectedRequest\u0012f\n\u001cdevice_disconnected_response\u0018\b \u0001(\u000b2@.GDI.Proto.ConnectedDevicesReporting.DevicesDisconnectedResponse\"7\n\u000fConnectedDevice\u0012\u0013\n\u000bdevice_name\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007unit_id\u0018\u0002 \u0001(\r\"\u0019\n\u0017ConnectedDevicesRequest\"k\n\u0018ConnectedDevicesResponse\u0012O\n\u0011connected_devices\u0018\u0001 \u0003(\u000b24.GDI.Proto.ConnectedDevicesReporting.ConnectedDevice\"s\n\"ConnectionAlertRegistrationRequest\u0012M\n\u000ftracked_devices\u0018\u0001 \u0003(\u000b24.GDI.Proto.ConnectedDevicesReporting.ConnectedDevice\"%\n#ConnectionAlertRegistrationResponse\"^\n\u0017DevicesConnectedRequest\u0012C\n\u0005other\u0018\u0001 \u0003(\u000b24.GDI.Proto.ConnectedDevicesReporting.ConnectedDevice\"*\n\u0018DevicesConnectedResponse\u0012\u000e\n\u0006status\u0018\u0001 \u0003(\r\"a\n\u001aDevicesDisconnectedRequest\u0012C\n\u0005other\u0018\u0001 \u0003(\u000b24.GDI.Proto.ConnectedDevicesReporting.ConnectedDevice\"-\n\u001bDevicesDisconnectedResponse\u0012\u000e\n\u0006status\u0018\u0001 \u0003(\r\"Ý\u0001\n\u0013CapabilitiesRequest\u0012*\n\"device_connection_alerts_supported\u0018\u0001 \u0001(\b\u0012\u001a\n\u0012requests_supported\u0018\u0002 \u0001(\b2~\n\u0010features_request\u0012*.GDI.Proto.Core.FeatureCapabilitiesRequest\u0018  \u0001(\u000b28.GDI.Proto.ConnectedDevicesReporting.CapabilitiesRequest\"ý\u0001\n\u0014CapabilitiesResponse\u0012\u001d\n\u0015max_connected_devices\u0018\u0001 \u0001(\r\u0012B\n\u0004self\u0018\u0002 \u0001(\u000b24.GDI.Proto.ConnectedDevicesReporting.ConnectedDevice2\u0081\u0001\n\u0011features_response\u0012+.GDI.Proto.Core.FeatureCapabilitiesResponse\u0018  \u0001(\u000b29.GDI.Proto.ConnectedDevicesReporting.CapabilitiesResponseB<\n\u001acom.garmin.proto.generatedB\u001cGDIConnectedDevicesReportingH\u0003"}, new Descriptors.FileDescriptor[]{GDICore.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectedDevicesReporting_CapabilitiesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectedDevicesReporting_CapabilitiesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectedDevicesReporting_CapabilitiesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectedDevicesReporting_CapabilitiesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectedDevice_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectedDevice_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectedDevicesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectedDevicesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectedDevicesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectedDevicesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectionAlertRegistrationRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectionAlertRegistrationRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectionAlertRegistrationResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectionAlertRegistrationResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectedDevicesReporting_DevicesConnectedRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectedDevicesReporting_DevicesConnectedRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectedDevicesReporting_DevicesConnectedResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectedDevicesReporting_DevicesConnectedResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectedDevicesReporting_DevicesDisconnectedRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectedDevicesReporting_DevicesDisconnectedRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectedDevicesReporting_DevicesDisconnectedResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectedDevicesReporting_DevicesDisconnectedResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ConnectedDevicesReporting_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ConnectedDevicesReporting_Service_fieldAccessorTable;

    public interface CapabilitiesRequestOrBuilder extends MessageOrBuilder {
        boolean getDeviceConnectionAlertsSupported();

        boolean getRequestsSupported();

        boolean hasDeviceConnectionAlertsSupported();

        boolean hasRequestsSupported();
    }

    public interface CapabilitiesResponseOrBuilder extends MessageOrBuilder {
        int getMaxConnectedDevices();

        ConnectedDevice getSelf();

        ConnectedDeviceOrBuilder getSelfOrBuilder();

        boolean hasMaxConnectedDevices();

        boolean hasSelf();
    }

    public interface ConnectedDeviceOrBuilder extends MessageOrBuilder {
        String getDeviceName();

        ByteString getDeviceNameBytes();

        int getUnitId();

        boolean hasDeviceName();

        boolean hasUnitId();
    }

    public interface ConnectedDevicesRequestOrBuilder extends MessageOrBuilder {
    }

    public interface ConnectedDevicesResponseOrBuilder extends MessageOrBuilder {
        ConnectedDevice getConnectedDevices(int i14);

        int getConnectedDevicesCount();

        List<ConnectedDevice> getConnectedDevicesList();

        ConnectedDeviceOrBuilder getConnectedDevicesOrBuilder(int i14);

        List<? extends ConnectedDeviceOrBuilder> getConnectedDevicesOrBuilderList();
    }

    public interface ConnectionAlertRegistrationRequestOrBuilder extends MessageOrBuilder {
        ConnectedDevice getTrackedDevices(int i14);

        int getTrackedDevicesCount();

        List<ConnectedDevice> getTrackedDevicesList();

        ConnectedDeviceOrBuilder getTrackedDevicesOrBuilder(int i14);

        List<? extends ConnectedDeviceOrBuilder> getTrackedDevicesOrBuilderList();
    }

    public interface ConnectionAlertRegistrationResponseOrBuilder extends MessageOrBuilder {
    }

    public interface DevicesConnectedRequestOrBuilder extends MessageOrBuilder {
        ConnectedDevice getOther(int i14);

        int getOtherCount();

        List<ConnectedDevice> getOtherList();

        ConnectedDeviceOrBuilder getOtherOrBuilder(int i14);

        List<? extends ConnectedDeviceOrBuilder> getOtherOrBuilderList();
    }

    public interface DevicesConnectedResponseOrBuilder extends MessageOrBuilder {
        int getStatus(int i14);

        int getStatusCount();

        List<Integer> getStatusList();
    }

    public interface DevicesDisconnectedRequestOrBuilder extends MessageOrBuilder {
        ConnectedDevice getOther(int i14);

        int getOtherCount();

        List<ConnectedDevice> getOtherList();

        ConnectedDeviceOrBuilder getOtherOrBuilder(int i14);

        List<? extends ConnectedDeviceOrBuilder> getOtherOrBuilderList();
    }

    public interface DevicesDisconnectedResponseOrBuilder extends MessageOrBuilder {
        int getStatus(int i14);

        int getStatusCount();

        List<Integer> getStatusList();
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
        ConnectedDevicesRequest getConnectedDevicesRequest();

        ConnectedDevicesRequestOrBuilder getConnectedDevicesRequestOrBuilder();

        ConnectedDevicesResponse getConnectedDevicesResponse();

        ConnectedDevicesResponseOrBuilder getConnectedDevicesResponseOrBuilder();

        ConnectionAlertRegistrationRequest getConnectionAlertRegistrationRequest();

        ConnectionAlertRegistrationRequestOrBuilder getConnectionAlertRegistrationRequestOrBuilder();

        ConnectionAlertRegistrationResponse getConnectionAlertRegistrationResponse();

        ConnectionAlertRegistrationResponseOrBuilder getConnectionAlertRegistrationResponseOrBuilder();

        DevicesConnectedRequest getDeviceConnectedRequest();

        DevicesConnectedRequestOrBuilder getDeviceConnectedRequestOrBuilder();

        DevicesConnectedResponse getDeviceConnectedResponse();

        DevicesConnectedResponseOrBuilder getDeviceConnectedResponseOrBuilder();

        DevicesDisconnectedRequest getDeviceDisconnectedRequest();

        DevicesDisconnectedRequestOrBuilder getDeviceDisconnectedRequestOrBuilder();

        DevicesDisconnectedResponse getDeviceDisconnectedResponse();

        DevicesDisconnectedResponseOrBuilder getDeviceDisconnectedResponseOrBuilder();

        boolean hasConnectedDevicesRequest();

        boolean hasConnectedDevicesResponse();

        boolean hasConnectionAlertRegistrationRequest();

        boolean hasConnectionAlertRegistrationResponse();

        boolean hasDeviceConnectedRequest();

        boolean hasDeviceConnectedResponse();

        boolean hasDeviceDisconnectedRequest();

        boolean hasDeviceDisconnectedResponse();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_ConnectedDevicesReporting_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_ConnectedDevicesReporting_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"ConnectedDevicesRequest", "ConnectedDevicesResponse", "ConnectionAlertRegistrationRequest", "ConnectionAlertRegistrationResponse", "DeviceConnectedRequest", "DeviceConnectedResponse", "DeviceDisconnectedRequest", "DeviceDisconnectedResponse"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectedDevice_descriptor = descriptor3;
        internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectedDevice_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"DeviceName", "UnitId"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectedDevicesRequest_descriptor = descriptor4;
        internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectedDevicesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[0]);
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectedDevicesResponse_descriptor = descriptor5;
        internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectedDevicesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"ConnectedDevices"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectionAlertRegistrationRequest_descriptor = descriptor6;
        internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectionAlertRegistrationRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"TrackedDevices"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectionAlertRegistrationResponse_descriptor = descriptor7;
        internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectionAlertRegistrationResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[0]);
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_ConnectedDevicesReporting_DevicesConnectedRequest_descriptor = descriptor8;
        internal_static_GDI_Proto_ConnectedDevicesReporting_DevicesConnectedRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Other"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_ConnectedDevicesReporting_DevicesConnectedResponse_descriptor = descriptor9;
        internal_static_GDI_Proto_ConnectedDevicesReporting_DevicesConnectedResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Status"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_GDI_Proto_ConnectedDevicesReporting_DevicesDisconnectedRequest_descriptor = descriptor10;
        internal_static_GDI_Proto_ConnectedDevicesReporting_DevicesDisconnectedRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Other"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(9);
        internal_static_GDI_Proto_ConnectedDevicesReporting_DevicesDisconnectedResponse_descriptor = descriptor11;
        internal_static_GDI_Proto_ConnectedDevicesReporting_DevicesDisconnectedResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"Status"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(10);
        internal_static_GDI_Proto_ConnectedDevicesReporting_CapabilitiesRequest_descriptor = descriptor12;
        internal_static_GDI_Proto_ConnectedDevicesReporting_CapabilitiesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"DeviceConnectionAlertsSupported", "RequestsSupported"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(11);
        internal_static_GDI_Proto_ConnectedDevicesReporting_CapabilitiesResponse_descriptor = descriptor13;
        internal_static_GDI_Proto_ConnectedDevicesReporting_CapabilitiesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"MaxConnectedDevices", "Self"});
        GDICore.getDescriptor();
    }

    private GDIConnectedDevicesReporting() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(CapabilitiesRequest.featuresRequest);
        extensionRegistryLite.add(CapabilitiesResponse.featuresResponse);
    }

    public static final class CapabilitiesRequest extends GeneratedMessageV3 implements CapabilitiesRequestOrBuilder {
        public static final int DEVICE_CONNECTION_ALERTS_SUPPORTED_FIELD_NUMBER = 1;
        public static final int FEATURES_REQUEST_FIELD_NUMBER = 32;
        public static final int REQUESTS_SUPPORTED_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean deviceConnectionAlertsSupported_;
        private byte memoizedIsInitialized;
        private boolean requestsSupported_;
        private static final CapabilitiesRequest DEFAULT_INSTANCE = new CapabilitiesRequest();

        @Deprecated
        public static final Parser<CapabilitiesRequest> PARSER = new AbstractParser<CapabilitiesRequest>() { // from class: com.garmin.proto.generated.GDIConnectedDevicesReporting.CapabilitiesRequest.1
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
            this.deviceConnectionAlertsSupported_ = false;
            this.requestsSupported_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_CapabilitiesRequest_descriptor;
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
            if (hasDeviceConnectionAlertsSupported() != capabilitiesRequest.hasDeviceConnectionAlertsSupported()) {
                return false;
            }
            if ((!hasDeviceConnectionAlertsSupported() || getDeviceConnectionAlertsSupported() == capabilitiesRequest.getDeviceConnectionAlertsSupported()) && hasRequestsSupported() == capabilitiesRequest.hasRequestsSupported()) {
                return (!hasRequestsSupported() || getRequestsSupported() == capabilitiesRequest.getRequestsSupported()) && getUnknownFields().equals(capabilitiesRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.CapabilitiesRequestOrBuilder
        public boolean getDeviceConnectionAlertsSupported() {
            return this.deviceConnectionAlertsSupported_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CapabilitiesRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.CapabilitiesRequestOrBuilder
        public boolean getRequestsSupported() {
            return this.requestsSupported_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.deviceConnectionAlertsSupported_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(2, this.requestsSupported_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBoolSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.CapabilitiesRequestOrBuilder
        public boolean hasDeviceConnectionAlertsSupported() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.CapabilitiesRequestOrBuilder
        public boolean hasRequestsSupported() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasDeviceConnectionAlertsSupported()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getDeviceConnectionAlertsSupported());
            }
            if (hasRequestsSupported()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getRequestsSupported());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
                codedOutputStream.writeBool(1, this.deviceConnectionAlertsSupported_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.requestsSupported_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesRequestOrBuilder {
            private int bitField0_;
            private boolean deviceConnectionAlertsSupported_;
            private boolean requestsSupported_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(CapabilitiesRequest capabilitiesRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    capabilitiesRequest.deviceConnectionAlertsSupported_ = this.deviceConnectionAlertsSupported_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    capabilitiesRequest.requestsSupported_ = this.requestsSupported_;
                    i14 |= 2;
                }
                capabilitiesRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_CapabilitiesRequest_descriptor;
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
                this.deviceConnectionAlertsSupported_ = false;
                this.requestsSupported_ = false;
                return this;
            }

            public Builder clearDeviceConnectionAlertsSupported() {
                this.bitField0_ &= -2;
                this.deviceConnectionAlertsSupported_ = false;
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

            public Builder clearRequestsSupported() {
                this.bitField0_ &= -3;
                this.requestsSupported_ = false;
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
                return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_CapabilitiesRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.CapabilitiesRequestOrBuilder
            public boolean getDeviceConnectionAlertsSupported() {
                return this.deviceConnectionAlertsSupported_;
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.CapabilitiesRequestOrBuilder
            public boolean getRequestsSupported() {
                return this.requestsSupported_;
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.CapabilitiesRequestOrBuilder
            public boolean hasDeviceConnectionAlertsSupported() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.CapabilitiesRequestOrBuilder
            public boolean hasRequestsSupported() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
                                    this.deviceConnectionAlertsSupported_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.requestsSupported_ = codedInputStream.readBool();
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

            public Builder setDeviceConnectionAlertsSupported(boolean z14) {
                this.deviceConnectionAlertsSupported_ = z14;
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

            public Builder setRequestsSupported(boolean z14) {
                this.requestsSupported_ = z14;
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
                if (capabilitiesRequest.hasDeviceConnectionAlertsSupported()) {
                    setDeviceConnectionAlertsSupported(capabilitiesRequest.getDeviceConnectionAlertsSupported());
                }
                if (capabilitiesRequest.hasRequestsSupported()) {
                    setRequestsSupported(capabilitiesRequest.getRequestsSupported());
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

        public /* synthetic */ CapabilitiesRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CapabilitiesRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private CapabilitiesRequest() {
            this.deviceConnectionAlertsSupported_ = false;
            this.requestsSupported_ = false;
            this.memoizedIsInitialized = (byte) -1;
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

    public static final class ConnectedDevicesRequest extends GeneratedMessageV3 implements ConnectedDevicesRequestOrBuilder {
        private static final ConnectedDevicesRequest DEFAULT_INSTANCE = new ConnectedDevicesRequest();

        @Deprecated
        public static final Parser<ConnectedDevicesRequest> PARSER = new AbstractParser<ConnectedDevicesRequest>() { // from class: com.garmin.proto.generated.GDIConnectedDevicesReporting.ConnectedDevicesRequest.1
            @Override // com.google.protobuf.Parser
            public ConnectedDevicesRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConnectedDevicesRequest.newBuilder();
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

        private ConnectedDevicesRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConnectedDevicesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectedDevicesRequest_descriptor;
        }

        public static Builder newBuilder(ConnectedDevicesRequest connectedDevicesRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(connectedDevicesRequest);
        }

        public static ConnectedDevicesRequest parseDelimitedFrom(InputStream inputStream) {
            return (ConnectedDevicesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConnectedDevicesRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConnectedDevicesRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof ConnectedDevicesRequest) {
                return getUnknownFields().equals(((ConnectedDevicesRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConnectedDevicesRequest> getParserForType() {
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
            return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectedDevicesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectedDevicesRequest.class, Builder.class);
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
            return new ConnectedDevicesRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConnectedDevicesRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectedDevicesRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectedDevicesRequest build() {
                ConnectedDevicesRequest connectedDevicesRequestBuildPartial = buildPartial();
                if (connectedDevicesRequestBuildPartial.isInitialized()) {
                    return connectedDevicesRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) connectedDevicesRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectedDevicesRequest buildPartial() {
                ConnectedDevicesRequest connectedDevicesRequest = new ConnectedDevicesRequest(this);
                onBuilt();
                return connectedDevicesRequest;
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
                return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectedDevicesRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectedDevicesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectedDevicesRequest.class, Builder.class);
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
            public ConnectedDevicesRequest getDefaultInstanceForType() {
                return ConnectedDevicesRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConnectedDevicesRequest) {
                    return mergeFrom((ConnectedDevicesRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConnectedDevicesRequest connectedDevicesRequest) {
                if (connectedDevicesRequest == ConnectedDevicesRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(connectedDevicesRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConnectedDevicesRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ ConnectedDevicesRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private ConnectedDevicesRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConnectedDevicesRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectedDevicesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectedDevicesRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConnectedDevicesRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConnectedDevicesRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConnectedDevicesRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConnectedDevicesRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConnectedDevicesRequest parseFrom(InputStream inputStream) {
            return (ConnectedDevicesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConnectedDevicesRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectedDevicesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectedDevicesRequest parseFrom(CodedInputStream codedInputStream) {
            return (ConnectedDevicesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConnectedDevicesRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectedDevicesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ConnectionAlertRegistrationResponse extends GeneratedMessageV3 implements ConnectionAlertRegistrationResponseOrBuilder {
        private static final ConnectionAlertRegistrationResponse DEFAULT_INSTANCE = new ConnectionAlertRegistrationResponse();

        @Deprecated
        public static final Parser<ConnectionAlertRegistrationResponse> PARSER = new AbstractParser<ConnectionAlertRegistrationResponse>() { // from class: com.garmin.proto.generated.GDIConnectedDevicesReporting.ConnectionAlertRegistrationResponse.1
            @Override // com.google.protobuf.Parser
            public ConnectionAlertRegistrationResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConnectionAlertRegistrationResponse.newBuilder();
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

        private ConnectionAlertRegistrationResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConnectionAlertRegistrationResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectionAlertRegistrationResponse_descriptor;
        }

        public static Builder newBuilder(ConnectionAlertRegistrationResponse connectionAlertRegistrationResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(connectionAlertRegistrationResponse);
        }

        public static ConnectionAlertRegistrationResponse parseDelimitedFrom(InputStream inputStream) {
            return (ConnectionAlertRegistrationResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConnectionAlertRegistrationResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConnectionAlertRegistrationResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof ConnectionAlertRegistrationResponse) {
                return getUnknownFields().equals(((ConnectionAlertRegistrationResponse) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConnectionAlertRegistrationResponse> getParserForType() {
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
            return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectionAlertRegistrationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectionAlertRegistrationResponse.class, Builder.class);
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
            return new ConnectionAlertRegistrationResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConnectionAlertRegistrationResponseOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectionAlertRegistrationResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectionAlertRegistrationResponse build() {
                ConnectionAlertRegistrationResponse connectionAlertRegistrationResponseBuildPartial = buildPartial();
                if (connectionAlertRegistrationResponseBuildPartial.isInitialized()) {
                    return connectionAlertRegistrationResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) connectionAlertRegistrationResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectionAlertRegistrationResponse buildPartial() {
                ConnectionAlertRegistrationResponse connectionAlertRegistrationResponse = new ConnectionAlertRegistrationResponse(this);
                onBuilt();
                return connectionAlertRegistrationResponse;
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
                return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectionAlertRegistrationResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectionAlertRegistrationResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectionAlertRegistrationResponse.class, Builder.class);
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
            public ConnectionAlertRegistrationResponse getDefaultInstanceForType() {
                return ConnectionAlertRegistrationResponse.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConnectionAlertRegistrationResponse) {
                    return mergeFrom((ConnectionAlertRegistrationResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConnectionAlertRegistrationResponse connectionAlertRegistrationResponse) {
                if (connectionAlertRegistrationResponse == ConnectionAlertRegistrationResponse.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(connectionAlertRegistrationResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConnectionAlertRegistrationResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ ConnectionAlertRegistrationResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private ConnectionAlertRegistrationResponse() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConnectionAlertRegistrationResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectionAlertRegistrationResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectionAlertRegistrationResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConnectionAlertRegistrationResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConnectionAlertRegistrationResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConnectionAlertRegistrationResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConnectionAlertRegistrationResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConnectionAlertRegistrationResponse parseFrom(InputStream inputStream) {
            return (ConnectionAlertRegistrationResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConnectionAlertRegistrationResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectionAlertRegistrationResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectionAlertRegistrationResponse parseFrom(CodedInputStream codedInputStream) {
            return (ConnectionAlertRegistrationResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConnectionAlertRegistrationResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectionAlertRegistrationResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CapabilitiesResponse extends GeneratedMessageV3 implements CapabilitiesResponseOrBuilder {
        public static final int FEATURES_RESPONSE_FIELD_NUMBER = 32;
        public static final int MAX_CONNECTED_DEVICES_FIELD_NUMBER = 1;
        public static final int SELF_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int maxConnectedDevices_;
        private byte memoizedIsInitialized;
        private ConnectedDevice self_;
        private static final CapabilitiesResponse DEFAULT_INSTANCE = new CapabilitiesResponse();

        @Deprecated
        public static final Parser<CapabilitiesResponse> PARSER = new AbstractParser<CapabilitiesResponse>() { // from class: com.garmin.proto.generated.GDIConnectedDevicesReporting.CapabilitiesResponse.1
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
            this.maxConnectedDevices_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_CapabilitiesResponse_descriptor;
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
            if (hasMaxConnectedDevices() != capabilitiesResponse.hasMaxConnectedDevices()) {
                return false;
            }
            if ((!hasMaxConnectedDevices() || getMaxConnectedDevices() == capabilitiesResponse.getMaxConnectedDevices()) && hasSelf() == capabilitiesResponse.hasSelf()) {
                return (!hasSelf() || getSelf().equals(capabilitiesResponse.getSelf())) && getUnknownFields().equals(capabilitiesResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.CapabilitiesResponseOrBuilder
        public int getMaxConnectedDevices() {
            return this.maxConnectedDevices_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CapabilitiesResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.CapabilitiesResponseOrBuilder
        public ConnectedDevice getSelf() {
            ConnectedDevice connectedDevice = this.self_;
            return connectedDevice == null ? ConnectedDevice.getDefaultInstance() : connectedDevice;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.CapabilitiesResponseOrBuilder
        public ConnectedDeviceOrBuilder getSelfOrBuilder() {
            ConnectedDevice connectedDevice = this.self_;
            return connectedDevice == null ? ConnectedDevice.getDefaultInstance() : connectedDevice;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.maxConnectedDevices_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(2, getSelf());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.CapabilitiesResponseOrBuilder
        public boolean hasMaxConnectedDevices() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.CapabilitiesResponseOrBuilder
        public boolean hasSelf() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasMaxConnectedDevices()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getMaxConnectedDevices();
            }
            if (hasSelf()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSelf().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
                codedOutputStream.writeUInt32(1, this.maxConnectedDevices_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getSelf());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesResponseOrBuilder {
            private int bitField0_;
            private int maxConnectedDevices_;
            private SingleFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> selfBuilder_;
            private ConnectedDevice self_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(CapabilitiesResponse capabilitiesResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    capabilitiesResponse.maxConnectedDevices_ = this.maxConnectedDevices_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> singleFieldBuilderV3 = this.selfBuilder_;
                    capabilitiesResponse.self_ = singleFieldBuilderV3 == null ? this.self_ : (ConnectedDevice) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                capabilitiesResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_CapabilitiesResponse_descriptor;
            }

            private SingleFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> getSelfFieldBuilder() {
                if (this.selfBuilder_ == null) {
                    this.selfBuilder_ = new SingleFieldBuilderV3<>(getSelf(), getParentForChildren(), isClean());
                    this.self_ = null;
                }
                return this.selfBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getSelfFieldBuilder();
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
                this.maxConnectedDevices_ = 0;
                this.self_ = null;
                SingleFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> singleFieldBuilderV3 = this.selfBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.selfBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMaxConnectedDevices() {
                this.bitField0_ &= -2;
                this.maxConnectedDevices_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSelf() {
                this.bitField0_ &= -3;
                this.self_ = null;
                SingleFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> singleFieldBuilderV3 = this.selfBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.selfBuilder_ = null;
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
                return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_CapabilitiesResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.CapabilitiesResponseOrBuilder
            public int getMaxConnectedDevices() {
                return this.maxConnectedDevices_;
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.CapabilitiesResponseOrBuilder
            public ConnectedDevice getSelf() {
                SingleFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> singleFieldBuilderV3 = this.selfBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectedDevice) singleFieldBuilderV3.getMessage();
                }
                ConnectedDevice connectedDevice = this.self_;
                return connectedDevice == null ? ConnectedDevice.getDefaultInstance() : connectedDevice;
            }

            public ConnectedDevice.Builder getSelfBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (ConnectedDevice.Builder) getSelfFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.CapabilitiesResponseOrBuilder
            public ConnectedDeviceOrBuilder getSelfOrBuilder() {
                SingleFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> singleFieldBuilderV3 = this.selfBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectedDeviceOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConnectedDevice connectedDevice = this.self_;
                return connectedDevice == null ? ConnectedDevice.getDefaultInstance() : connectedDevice;
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.CapabilitiesResponseOrBuilder
            public boolean hasMaxConnectedDevices() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.CapabilitiesResponseOrBuilder
            public boolean hasSelf() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
                                    this.maxConnectedDevices_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getSelfFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeSelf(ConnectedDevice connectedDevice) {
                ConnectedDevice connectedDevice2;
                SingleFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> singleFieldBuilderV3 = this.selfBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(connectedDevice);
                } else if ((this.bitField0_ & 2) == 0 || (connectedDevice2 = this.self_) == null || connectedDevice2 == ConnectedDevice.getDefaultInstance()) {
                    this.self_ = connectedDevice;
                } else {
                    getSelfBuilder().mergeFrom(connectedDevice);
                }
                if (this.self_ != null) {
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

            public Builder setMaxConnectedDevices(int i14) {
                this.maxConnectedDevices_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSelf(ConnectedDevice.Builder builder) {
                SingleFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> singleFieldBuilderV3 = this.selfBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.self_ = builder.build();
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

            public Builder setSelf(ConnectedDevice connectedDevice) {
                SingleFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> singleFieldBuilderV3 = this.selfBuilder_;
                if (singleFieldBuilderV3 == null) {
                    connectedDevice.getClass();
                    this.self_ = connectedDevice;
                } else {
                    singleFieldBuilderV3.setMessage(connectedDevice);
                }
                this.bitField0_ |= 2;
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
                if (capabilitiesResponse.hasMaxConnectedDevices()) {
                    setMaxConnectedDevices(capabilitiesResponse.getMaxConnectedDevices());
                }
                if (capabilitiesResponse.hasSelf()) {
                    mergeSelf(capabilitiesResponse.getSelf());
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

        public /* synthetic */ CapabilitiesResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CapabilitiesResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private CapabilitiesResponse() {
            this.maxConnectedDevices_ = 0;
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

    public static final class ConnectedDevice extends GeneratedMessageV3 implements ConnectedDeviceOrBuilder {
        public static final int DEVICE_NAME_FIELD_NUMBER = 1;
        public static final int UNIT_ID_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object deviceName_;
        private byte memoizedIsInitialized;
        private int unitId_;
        private static final ConnectedDevice DEFAULT_INSTANCE = new ConnectedDevice();

        @Deprecated
        public static final Parser<ConnectedDevice> PARSER = new AbstractParser<ConnectedDevice>() { // from class: com.garmin.proto.generated.GDIConnectedDevicesReporting.ConnectedDevice.1
            @Override // com.google.protobuf.Parser
            public ConnectedDevice parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConnectedDevice.newBuilder();
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

        private ConnectedDevice() {
            this.deviceName_ = "";
            this.unitId_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.deviceName_ = "";
        }

        public static ConnectedDevice getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectedDevice_descriptor;
        }

        public static Builder newBuilder(ConnectedDevice connectedDevice) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(connectedDevice);
        }

        public static ConnectedDevice parseDelimitedFrom(InputStream inputStream) {
            return (ConnectedDevice) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConnectedDevice parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConnectedDevice> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConnectedDevice)) {
                return super.equals(obj);
            }
            ConnectedDevice connectedDevice = (ConnectedDevice) obj;
            if (hasDeviceName() != connectedDevice.hasDeviceName()) {
                return false;
            }
            if ((!hasDeviceName() || getDeviceName().equals(connectedDevice.getDeviceName())) && hasUnitId() == connectedDevice.hasUnitId()) {
                return (!hasUnitId() || getUnitId() == connectedDevice.getUnitId()) && getUnknownFields().equals(connectedDevice.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ConnectedDeviceOrBuilder
        public String getDeviceName() {
            Object obj = this.deviceName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.deviceName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ConnectedDeviceOrBuilder
        public ByteString getDeviceNameBytes() {
            Object obj = this.deviceName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.deviceName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConnectedDevice> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.deviceName_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeUInt32Size(2, this.unitId_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ConnectedDeviceOrBuilder
        public int getUnitId() {
            return this.unitId_;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ConnectedDeviceOrBuilder
        public boolean hasDeviceName() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ConnectedDeviceOrBuilder
        public boolean hasUnitId() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasDeviceName()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getDeviceName().hashCode();
            }
            if (hasUnitId()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getUnitId();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectedDevice_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectedDevice.class, Builder.class);
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
            return new ConnectedDevice();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.deviceName_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.unitId_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConnectedDeviceOrBuilder {
            private int bitField0_;
            private Object deviceName_;
            private int unitId_;

            private Builder() {
                this.deviceName_ = "";
            }

            private void buildPartial0(ConnectedDevice connectedDevice) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    connectedDevice.deviceName_ = this.deviceName_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    connectedDevice.unitId_ = this.unitId_;
                    i14 |= 2;
                }
                connectedDevice.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectedDevice_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectedDevice build() {
                ConnectedDevice connectedDeviceBuildPartial = buildPartial();
                if (connectedDeviceBuildPartial.isInitialized()) {
                    return connectedDeviceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) connectedDeviceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectedDevice buildPartial() {
                ConnectedDevice connectedDevice = new ConnectedDevice(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(connectedDevice);
                }
                onBuilt();
                return connectedDevice;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.deviceName_ = "";
                this.unitId_ = 0;
                return this;
            }

            public Builder clearDeviceName() {
                this.deviceName_ = ConnectedDevice.getDefaultInstance().getDeviceName();
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

            public Builder clearUnitId() {
                this.bitField0_ &= -3;
                this.unitId_ = 0;
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
                return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectedDevice_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ConnectedDeviceOrBuilder
            public String getDeviceName() {
                Object obj = this.deviceName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.deviceName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ConnectedDeviceOrBuilder
            public ByteString getDeviceNameBytes() {
                Object obj = this.deviceName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.deviceName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ConnectedDeviceOrBuilder
            public int getUnitId() {
                return this.unitId_;
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ConnectedDeviceOrBuilder
            public boolean hasDeviceName() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ConnectedDeviceOrBuilder
            public boolean hasUnitId() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectedDevice_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectedDevice.class, Builder.class);
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
                                    this.deviceName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.unitId_ = codedInputStream.readUInt32();
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

            public Builder setDeviceName(String str) {
                str.getClass();
                this.deviceName_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setDeviceNameBytes(ByteString byteString) {
                byteString.getClass();
                this.deviceName_ = byteString;
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

            public Builder setUnitId(int i14) {
                this.unitId_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ConnectedDevice getDefaultInstanceForType() {
                return ConnectedDevice.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.deviceName_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConnectedDevice) {
                    return mergeFrom((ConnectedDevice) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConnectedDevice connectedDevice) {
                if (connectedDevice == ConnectedDevice.getDefaultInstance()) {
                    return this;
                }
                if (connectedDevice.hasDeviceName()) {
                    this.deviceName_ = connectedDevice.deviceName_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (connectedDevice.hasUnitId()) {
                    setUnitId(connectedDevice.getUnitId());
                }
                mergeUnknownFields(connectedDevice.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConnectedDevice getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConnectedDevice parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectedDevice) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectedDevice parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConnectedDevice parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConnectedDevice parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConnectedDevice parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConnectedDevice parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConnectedDevice parseFrom(InputStream inputStream) {
            return (ConnectedDevice) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private ConnectedDevice(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.deviceName_ = "";
            this.unitId_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConnectedDevice parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectedDevice) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectedDevice parseFrom(CodedInputStream codedInputStream) {
            return (ConnectedDevice) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public /* synthetic */ ConnectedDevice(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ConnectedDevice parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectedDevice) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ConnectedDevicesResponse extends GeneratedMessageV3 implements ConnectedDevicesResponseOrBuilder {
        public static final int CONNECTED_DEVICES_FIELD_NUMBER = 1;
        private static final ConnectedDevicesResponse DEFAULT_INSTANCE = new ConnectedDevicesResponse();

        @Deprecated
        public static final Parser<ConnectedDevicesResponse> PARSER = new AbstractParser<ConnectedDevicesResponse>() { // from class: com.garmin.proto.generated.GDIConnectedDevicesReporting.ConnectedDevicesResponse.1
            @Override // com.google.protobuf.Parser
            public ConnectedDevicesResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConnectedDevicesResponse.newBuilder();
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
        private List<ConnectedDevice> connectedDevices_;
        private byte memoizedIsInitialized;

        private ConnectedDevicesResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.connectedDevices_ = Collections.EMPTY_LIST;
        }

        public static ConnectedDevicesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectedDevicesResponse_descriptor;
        }

        public static Builder newBuilder(ConnectedDevicesResponse connectedDevicesResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(connectedDevicesResponse);
        }

        public static ConnectedDevicesResponse parseDelimitedFrom(InputStream inputStream) {
            return (ConnectedDevicesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConnectedDevicesResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConnectedDevicesResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConnectedDevicesResponse)) {
                return super.equals(obj);
            }
            ConnectedDevicesResponse connectedDevicesResponse = (ConnectedDevicesResponse) obj;
            return getConnectedDevicesList().equals(connectedDevicesResponse.getConnectedDevicesList()) && getUnknownFields().equals(connectedDevicesResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ConnectedDevicesResponseOrBuilder
        public ConnectedDevice getConnectedDevices(int i14) {
            return this.connectedDevices_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ConnectedDevicesResponseOrBuilder
        public int getConnectedDevicesCount() {
            return this.connectedDevices_.size();
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ConnectedDevicesResponseOrBuilder
        public List<ConnectedDevice> getConnectedDevicesList() {
            return this.connectedDevices_;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ConnectedDevicesResponseOrBuilder
        public ConnectedDeviceOrBuilder getConnectedDevicesOrBuilder(int i14) {
            return this.connectedDevices_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ConnectedDevicesResponseOrBuilder
        public List<? extends ConnectedDeviceOrBuilder> getConnectedDevicesOrBuilderList() {
            return this.connectedDevices_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConnectedDevicesResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = 0;
            for (int i15 = 0; i15 < this.connectedDevices_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.connectedDevices_.get(i15));
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
            if (getConnectedDevicesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getConnectedDevicesList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectedDevicesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectedDevicesResponse.class, Builder.class);
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
            return new ConnectedDevicesResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.connectedDevices_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.connectedDevices_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConnectedDevicesResponseOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> connectedDevicesBuilder_;
            private List<ConnectedDevice> connectedDevices_;

            private Builder() {
                this.connectedDevices_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(ConnectedDevicesResponse connectedDevicesResponse) {
            }

            private void buildPartialRepeatedFields(ConnectedDevicesResponse connectedDevicesResponse) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.connectedDevicesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    connectedDevicesResponse.connectedDevices_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.connectedDevices_ = Collections.unmodifiableList(this.connectedDevices_);
                    this.bitField0_ &= -2;
                }
                connectedDevicesResponse.connectedDevices_ = this.connectedDevices_;
            }

            private void ensureConnectedDevicesIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.connectedDevices_ = new ArrayList(this.connectedDevices_);
                    this.bitField0_ |= 1;
                }
            }

            private RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> getConnectedDevicesFieldBuilder() {
                if (this.connectedDevicesBuilder_ == null) {
                    this.connectedDevicesBuilder_ = new RepeatedFieldBuilderV3<>(this.connectedDevices_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.connectedDevices_ = null;
                }
                return this.connectedDevicesBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectedDevicesResponse_descriptor;
            }

            public Builder addAllConnectedDevices(Iterable<? extends ConnectedDevice> iterable) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.connectedDevicesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureConnectedDevicesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.connectedDevices_);
                onChanged();
                return this;
            }

            public Builder addConnectedDevices(ConnectedDevice.Builder builder) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.connectedDevicesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureConnectedDevicesIsMutable();
                this.connectedDevices_.add(builder.build());
                onChanged();
                return this;
            }

            public ConnectedDevice.Builder addConnectedDevicesBuilder() {
                return (ConnectedDevice.Builder) getConnectedDevicesFieldBuilder().addBuilder(ConnectedDevice.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectedDevicesResponse build() {
                ConnectedDevicesResponse connectedDevicesResponseBuildPartial = buildPartial();
                if (connectedDevicesResponseBuildPartial.isInitialized()) {
                    return connectedDevicesResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) connectedDevicesResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectedDevicesResponse buildPartial() {
                ConnectedDevicesResponse connectedDevicesResponse = new ConnectedDevicesResponse(this);
                buildPartialRepeatedFields(connectedDevicesResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(connectedDevicesResponse);
                }
                onBuilt();
                return connectedDevicesResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.connectedDevicesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.connectedDevices_ = Collections.EMPTY_LIST;
                } else {
                    this.connectedDevices_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                return this;
            }

            public Builder clearConnectedDevices() {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.connectedDevicesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.connectedDevices_ = Collections.EMPTY_LIST;
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

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ConnectedDevicesResponseOrBuilder
            public ConnectedDevice getConnectedDevices(int i14) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.connectedDevicesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.connectedDevices_.get(i14) : (ConnectedDevice) repeatedFieldBuilderV3.getMessage(i14);
            }

            public ConnectedDevice.Builder getConnectedDevicesBuilder(int i14) {
                return (ConnectedDevice.Builder) getConnectedDevicesFieldBuilder().getBuilder(i14);
            }

            public List<ConnectedDevice.Builder> getConnectedDevicesBuilderList() {
                return getConnectedDevicesFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ConnectedDevicesResponseOrBuilder
            public int getConnectedDevicesCount() {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.connectedDevicesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.connectedDevices_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ConnectedDevicesResponseOrBuilder
            public List<ConnectedDevice> getConnectedDevicesList() {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.connectedDevicesBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.connectedDevices_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ConnectedDevicesResponseOrBuilder
            public ConnectedDeviceOrBuilder getConnectedDevicesOrBuilder(int i14) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.connectedDevicesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.connectedDevices_.get(i14) : (ConnectedDeviceOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ConnectedDevicesResponseOrBuilder
            public List<? extends ConnectedDeviceOrBuilder> getConnectedDevicesOrBuilderList() {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.connectedDevicesBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.connectedDevices_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectedDevicesResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectedDevicesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectedDevicesResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(ConnectedDevicesResponse connectedDevicesResponse) {
                if (connectedDevicesResponse == ConnectedDevicesResponse.getDefaultInstance()) {
                    return this;
                }
                if (this.connectedDevicesBuilder_ == null) {
                    if (!connectedDevicesResponse.connectedDevices_.isEmpty()) {
                        if (this.connectedDevices_.isEmpty()) {
                            this.connectedDevices_ = connectedDevicesResponse.connectedDevices_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureConnectedDevicesIsMutable();
                            this.connectedDevices_.addAll(connectedDevicesResponse.connectedDevices_);
                        }
                        onChanged();
                    }
                } else if (!connectedDevicesResponse.connectedDevices_.isEmpty()) {
                    boolean zIsEmpty = this.connectedDevicesBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.connectedDevicesBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.connectedDevicesBuilder_ = null;
                        this.connectedDevices_ = connectedDevicesResponse.connectedDevices_;
                        this.bitField0_ &= -2;
                        this.connectedDevicesBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getConnectedDevicesFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(connectedDevicesResponse.connectedDevices_);
                    }
                }
                mergeUnknownFields(connectedDevicesResponse.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeConnectedDevices(int i14) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.connectedDevicesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureConnectedDevicesIsMutable();
                this.connectedDevices_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setConnectedDevices(int i14, ConnectedDevice.Builder builder) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.connectedDevicesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureConnectedDevicesIsMutable();
                this.connectedDevices_.set(i14, builder.build());
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
            public ConnectedDevicesResponse getDefaultInstanceForType() {
                return ConnectedDevicesResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.connectedDevices_ = Collections.EMPTY_LIST;
            }

            public ConnectedDevice.Builder addConnectedDevicesBuilder(int i14) {
                return (ConnectedDevice.Builder) getConnectedDevicesFieldBuilder().addBuilder(i14, ConnectedDevice.getDefaultInstance());
            }

            public Builder addConnectedDevices(int i14, ConnectedDevice connectedDevice) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.connectedDevicesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    connectedDevice.getClass();
                    ensureConnectedDevicesIsMutable();
                    this.connectedDevices_.add(i14, connectedDevice);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, connectedDevice);
                return this;
            }

            public Builder setConnectedDevices(int i14, ConnectedDevice connectedDevice) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.connectedDevicesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    connectedDevice.getClass();
                    ensureConnectedDevicesIsMutable();
                    this.connectedDevices_.set(i14, connectedDevice);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, connectedDevice);
                return this;
            }

            public Builder addConnectedDevices(ConnectedDevice connectedDevice) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.connectedDevicesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    connectedDevice.getClass();
                    ensureConnectedDevicesIsMutable();
                    this.connectedDevices_.add(connectedDevice);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(connectedDevice);
                return this;
            }

            public Builder addConnectedDevices(int i14, ConnectedDevice.Builder builder) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.connectedDevicesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureConnectedDevicesIsMutable();
                    this.connectedDevices_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConnectedDevicesResponse) {
                    return mergeFrom((ConnectedDevicesResponse) message);
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
                                    ConnectedDevice connectedDevice = (ConnectedDevice) codedInputStream.readMessage(ConnectedDevice.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.connectedDevicesBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureConnectedDevicesIsMutable();
                                        this.connectedDevices_.add(connectedDevice);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(connectedDevice);
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
        public ConnectedDevicesResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConnectedDevicesResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectedDevicesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectedDevicesResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConnectedDevicesResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ConnectedDevicesResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConnectedDevicesResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConnectedDevicesResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ ConnectedDevicesResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ConnectedDevicesResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConnectedDevicesResponse parseFrom(InputStream inputStream) {
            return (ConnectedDevicesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConnectedDevicesResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectedDevicesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectedDevicesResponse parseFrom(CodedInputStream codedInputStream) {
            return (ConnectedDevicesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConnectedDevicesResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectedDevicesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ConnectionAlertRegistrationRequest extends GeneratedMessageV3 implements ConnectionAlertRegistrationRequestOrBuilder {
        private static final ConnectionAlertRegistrationRequest DEFAULT_INSTANCE = new ConnectionAlertRegistrationRequest();

        @Deprecated
        public static final Parser<ConnectionAlertRegistrationRequest> PARSER = new AbstractParser<ConnectionAlertRegistrationRequest>() { // from class: com.garmin.proto.generated.GDIConnectedDevicesReporting.ConnectionAlertRegistrationRequest.1
            @Override // com.google.protobuf.Parser
            public ConnectionAlertRegistrationRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConnectionAlertRegistrationRequest.newBuilder();
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
        public static final int TRACKED_DEVICES_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private List<ConnectedDevice> trackedDevices_;

        private ConnectionAlertRegistrationRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.trackedDevices_ = Collections.EMPTY_LIST;
        }

        public static ConnectionAlertRegistrationRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectionAlertRegistrationRequest_descriptor;
        }

        public static Builder newBuilder(ConnectionAlertRegistrationRequest connectionAlertRegistrationRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(connectionAlertRegistrationRequest);
        }

        public static ConnectionAlertRegistrationRequest parseDelimitedFrom(InputStream inputStream) {
            return (ConnectionAlertRegistrationRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConnectionAlertRegistrationRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConnectionAlertRegistrationRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConnectionAlertRegistrationRequest)) {
                return super.equals(obj);
            }
            ConnectionAlertRegistrationRequest connectionAlertRegistrationRequest = (ConnectionAlertRegistrationRequest) obj;
            return getTrackedDevicesList().equals(connectionAlertRegistrationRequest.getTrackedDevicesList()) && getUnknownFields().equals(connectionAlertRegistrationRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConnectionAlertRegistrationRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = 0;
            for (int i15 = 0; i15 < this.trackedDevices_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.trackedDevices_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ConnectionAlertRegistrationRequestOrBuilder
        public ConnectedDevice getTrackedDevices(int i14) {
            return this.trackedDevices_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ConnectionAlertRegistrationRequestOrBuilder
        public int getTrackedDevicesCount() {
            return this.trackedDevices_.size();
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ConnectionAlertRegistrationRequestOrBuilder
        public List<ConnectedDevice> getTrackedDevicesList() {
            return this.trackedDevices_;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ConnectionAlertRegistrationRequestOrBuilder
        public ConnectedDeviceOrBuilder getTrackedDevicesOrBuilder(int i14) {
            return this.trackedDevices_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ConnectionAlertRegistrationRequestOrBuilder
        public List<? extends ConnectedDeviceOrBuilder> getTrackedDevicesOrBuilderList() {
            return this.trackedDevices_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getTrackedDevicesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getTrackedDevicesList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectionAlertRegistrationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectionAlertRegistrationRequest.class, Builder.class);
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
            return new ConnectionAlertRegistrationRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.trackedDevices_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.trackedDevices_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConnectionAlertRegistrationRequestOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> trackedDevicesBuilder_;
            private List<ConnectedDevice> trackedDevices_;

            private Builder() {
                this.trackedDevices_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(ConnectionAlertRegistrationRequest connectionAlertRegistrationRequest) {
            }

            private void buildPartialRepeatedFields(ConnectionAlertRegistrationRequest connectionAlertRegistrationRequest) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.trackedDevicesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    connectionAlertRegistrationRequest.trackedDevices_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.trackedDevices_ = Collections.unmodifiableList(this.trackedDevices_);
                    this.bitField0_ &= -2;
                }
                connectionAlertRegistrationRequest.trackedDevices_ = this.trackedDevices_;
            }

            private void ensureTrackedDevicesIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.trackedDevices_ = new ArrayList(this.trackedDevices_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectionAlertRegistrationRequest_descriptor;
            }

            private RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> getTrackedDevicesFieldBuilder() {
                if (this.trackedDevicesBuilder_ == null) {
                    this.trackedDevicesBuilder_ = new RepeatedFieldBuilderV3<>(this.trackedDevices_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.trackedDevices_ = null;
                }
                return this.trackedDevicesBuilder_;
            }

            public Builder addAllTrackedDevices(Iterable<? extends ConnectedDevice> iterable) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.trackedDevicesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureTrackedDevicesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.trackedDevices_);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addTrackedDevices(ConnectedDevice.Builder builder) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.trackedDevicesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureTrackedDevicesIsMutable();
                this.trackedDevices_.add(builder.build());
                onChanged();
                return this;
            }

            public ConnectedDevice.Builder addTrackedDevicesBuilder() {
                return (ConnectedDevice.Builder) getTrackedDevicesFieldBuilder().addBuilder(ConnectedDevice.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectionAlertRegistrationRequest build() {
                ConnectionAlertRegistrationRequest connectionAlertRegistrationRequestBuildPartial = buildPartial();
                if (connectionAlertRegistrationRequestBuildPartial.isInitialized()) {
                    return connectionAlertRegistrationRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) connectionAlertRegistrationRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConnectionAlertRegistrationRequest buildPartial() {
                ConnectionAlertRegistrationRequest connectionAlertRegistrationRequest = new ConnectionAlertRegistrationRequest(this);
                buildPartialRepeatedFields(connectionAlertRegistrationRequest);
                if (this.bitField0_ != 0) {
                    buildPartial0(connectionAlertRegistrationRequest);
                }
                onBuilt();
                return connectionAlertRegistrationRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.trackedDevicesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.trackedDevices_ = Collections.EMPTY_LIST;
                } else {
                    this.trackedDevices_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
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

            public Builder clearTrackedDevices() {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.trackedDevicesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.trackedDevices_ = Collections.EMPTY_LIST;
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
                return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectionAlertRegistrationRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ConnectionAlertRegistrationRequestOrBuilder
            public ConnectedDevice getTrackedDevices(int i14) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.trackedDevicesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.trackedDevices_.get(i14) : (ConnectedDevice) repeatedFieldBuilderV3.getMessage(i14);
            }

            public ConnectedDevice.Builder getTrackedDevicesBuilder(int i14) {
                return (ConnectedDevice.Builder) getTrackedDevicesFieldBuilder().getBuilder(i14);
            }

            public List<ConnectedDevice.Builder> getTrackedDevicesBuilderList() {
                return getTrackedDevicesFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ConnectionAlertRegistrationRequestOrBuilder
            public int getTrackedDevicesCount() {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.trackedDevicesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.trackedDevices_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ConnectionAlertRegistrationRequestOrBuilder
            public List<ConnectedDevice> getTrackedDevicesList() {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.trackedDevicesBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.trackedDevices_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ConnectionAlertRegistrationRequestOrBuilder
            public ConnectedDeviceOrBuilder getTrackedDevicesOrBuilder(int i14) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.trackedDevicesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.trackedDevices_.get(i14) : (ConnectedDeviceOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ConnectionAlertRegistrationRequestOrBuilder
            public List<? extends ConnectedDeviceOrBuilder> getTrackedDevicesOrBuilderList() {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.trackedDevicesBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.trackedDevices_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_ConnectionAlertRegistrationRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConnectionAlertRegistrationRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(ConnectionAlertRegistrationRequest connectionAlertRegistrationRequest) {
                if (connectionAlertRegistrationRequest == ConnectionAlertRegistrationRequest.getDefaultInstance()) {
                    return this;
                }
                if (this.trackedDevicesBuilder_ == null) {
                    if (!connectionAlertRegistrationRequest.trackedDevices_.isEmpty()) {
                        if (this.trackedDevices_.isEmpty()) {
                            this.trackedDevices_ = connectionAlertRegistrationRequest.trackedDevices_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureTrackedDevicesIsMutable();
                            this.trackedDevices_.addAll(connectionAlertRegistrationRequest.trackedDevices_);
                        }
                        onChanged();
                    }
                } else if (!connectionAlertRegistrationRequest.trackedDevices_.isEmpty()) {
                    boolean zIsEmpty = this.trackedDevicesBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.trackedDevicesBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.trackedDevicesBuilder_ = null;
                        this.trackedDevices_ = connectionAlertRegistrationRequest.trackedDevices_;
                        this.bitField0_ &= -2;
                        this.trackedDevicesBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getTrackedDevicesFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(connectionAlertRegistrationRequest.trackedDevices_);
                    }
                }
                mergeUnknownFields(connectionAlertRegistrationRequest.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeTrackedDevices(int i14) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.trackedDevicesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureTrackedDevicesIsMutable();
                this.trackedDevices_.remove(i14);
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

            public Builder setTrackedDevices(int i14, ConnectedDevice.Builder builder) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.trackedDevicesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureTrackedDevicesIsMutable();
                this.trackedDevices_.set(i14, builder.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ConnectionAlertRegistrationRequest getDefaultInstanceForType() {
                return ConnectionAlertRegistrationRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.trackedDevices_ = Collections.EMPTY_LIST;
            }

            public ConnectedDevice.Builder addTrackedDevicesBuilder(int i14) {
                return (ConnectedDevice.Builder) getTrackedDevicesFieldBuilder().addBuilder(i14, ConnectedDevice.getDefaultInstance());
            }

            public Builder addTrackedDevices(int i14, ConnectedDevice connectedDevice) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.trackedDevicesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    connectedDevice.getClass();
                    ensureTrackedDevicesIsMutable();
                    this.trackedDevices_.add(i14, connectedDevice);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, connectedDevice);
                return this;
            }

            public Builder setTrackedDevices(int i14, ConnectedDevice connectedDevice) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.trackedDevicesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    connectedDevice.getClass();
                    ensureTrackedDevicesIsMutable();
                    this.trackedDevices_.set(i14, connectedDevice);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, connectedDevice);
                return this;
            }

            public Builder addTrackedDevices(ConnectedDevice connectedDevice) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.trackedDevicesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    connectedDevice.getClass();
                    ensureTrackedDevicesIsMutable();
                    this.trackedDevices_.add(connectedDevice);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(connectedDevice);
                return this;
            }

            public Builder addTrackedDevices(int i14, ConnectedDevice.Builder builder) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.trackedDevicesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureTrackedDevicesIsMutable();
                    this.trackedDevices_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConnectionAlertRegistrationRequest) {
                    return mergeFrom((ConnectionAlertRegistrationRequest) message);
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
                                    ConnectedDevice connectedDevice = (ConnectedDevice) codedInputStream.readMessage(ConnectedDevice.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.trackedDevicesBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureTrackedDevicesIsMutable();
                                        this.trackedDevices_.add(connectedDevice);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(connectedDevice);
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
        public ConnectionAlertRegistrationRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConnectionAlertRegistrationRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectionAlertRegistrationRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectionAlertRegistrationRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConnectionAlertRegistrationRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ConnectionAlertRegistrationRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConnectionAlertRegistrationRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConnectionAlertRegistrationRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ ConnectionAlertRegistrationRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ConnectionAlertRegistrationRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConnectionAlertRegistrationRequest parseFrom(InputStream inputStream) {
            return (ConnectionAlertRegistrationRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConnectionAlertRegistrationRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectionAlertRegistrationRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConnectionAlertRegistrationRequest parseFrom(CodedInputStream codedInputStream) {
            return (ConnectionAlertRegistrationRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConnectionAlertRegistrationRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConnectionAlertRegistrationRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DevicesConnectedRequest extends GeneratedMessageV3 implements DevicesConnectedRequestOrBuilder {
        public static final int OTHER_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private List<ConnectedDevice> other_;
        private static final DevicesConnectedRequest DEFAULT_INSTANCE = new DevicesConnectedRequest();

        @Deprecated
        public static final Parser<DevicesConnectedRequest> PARSER = new AbstractParser<DevicesConnectedRequest>() { // from class: com.garmin.proto.generated.GDIConnectedDevicesReporting.DevicesConnectedRequest.1
            @Override // com.google.protobuf.Parser
            public DevicesConnectedRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DevicesConnectedRequest.newBuilder();
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

        private DevicesConnectedRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.other_ = Collections.EMPTY_LIST;
        }

        public static DevicesConnectedRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_DevicesConnectedRequest_descriptor;
        }

        public static Builder newBuilder(DevicesConnectedRequest devicesConnectedRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(devicesConnectedRequest);
        }

        public static DevicesConnectedRequest parseDelimitedFrom(InputStream inputStream) {
            return (DevicesConnectedRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DevicesConnectedRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DevicesConnectedRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DevicesConnectedRequest)) {
                return super.equals(obj);
            }
            DevicesConnectedRequest devicesConnectedRequest = (DevicesConnectedRequest) obj;
            return getOtherList().equals(devicesConnectedRequest.getOtherList()) && getUnknownFields().equals(devicesConnectedRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.DevicesConnectedRequestOrBuilder
        public ConnectedDevice getOther(int i14) {
            return this.other_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.DevicesConnectedRequestOrBuilder
        public int getOtherCount() {
            return this.other_.size();
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.DevicesConnectedRequestOrBuilder
        public List<ConnectedDevice> getOtherList() {
            return this.other_;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.DevicesConnectedRequestOrBuilder
        public ConnectedDeviceOrBuilder getOtherOrBuilder(int i14) {
            return this.other_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.DevicesConnectedRequestOrBuilder
        public List<? extends ConnectedDeviceOrBuilder> getOtherOrBuilderList() {
            return this.other_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DevicesConnectedRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = 0;
            for (int i15 = 0; i15 < this.other_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.other_.get(i15));
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
            if (getOtherCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getOtherList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_DevicesConnectedRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(DevicesConnectedRequest.class, Builder.class);
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
            return new DevicesConnectedRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.other_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.other_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DevicesConnectedRequestOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> otherBuilder_;
            private List<ConnectedDevice> other_;

            private Builder() {
                this.other_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(DevicesConnectedRequest devicesConnectedRequest) {
            }

            private void buildPartialRepeatedFields(DevicesConnectedRequest devicesConnectedRequest) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.otherBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    devicesConnectedRequest.other_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.other_ = Collections.unmodifiableList(this.other_);
                    this.bitField0_ &= -2;
                }
                devicesConnectedRequest.other_ = this.other_;
            }

            private void ensureOtherIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.other_ = new ArrayList(this.other_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_DevicesConnectedRequest_descriptor;
            }

            private RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> getOtherFieldBuilder() {
                if (this.otherBuilder_ == null) {
                    this.otherBuilder_ = new RepeatedFieldBuilderV3<>(this.other_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.other_ = null;
                }
                return this.otherBuilder_;
            }

            public Builder addAllOther(Iterable<? extends ConnectedDevice> iterable) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.otherBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureOtherIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.other_);
                onChanged();
                return this;
            }

            public Builder addOther(ConnectedDevice.Builder builder) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.otherBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureOtherIsMutable();
                this.other_.add(builder.build());
                onChanged();
                return this;
            }

            public ConnectedDevice.Builder addOtherBuilder() {
                return (ConnectedDevice.Builder) getOtherFieldBuilder().addBuilder(ConnectedDevice.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DevicesConnectedRequest build() {
                DevicesConnectedRequest devicesConnectedRequestBuildPartial = buildPartial();
                if (devicesConnectedRequestBuildPartial.isInitialized()) {
                    return devicesConnectedRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) devicesConnectedRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DevicesConnectedRequest buildPartial() {
                DevicesConnectedRequest devicesConnectedRequest = new DevicesConnectedRequest(this);
                buildPartialRepeatedFields(devicesConnectedRequest);
                if (this.bitField0_ != 0) {
                    buildPartial0(devicesConnectedRequest);
                }
                onBuilt();
                return devicesConnectedRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.otherBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.other_ = Collections.EMPTY_LIST;
                } else {
                    this.other_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
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

            public Builder clearOther() {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.otherBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.other_ = Collections.EMPTY_LIST;
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
                return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_DevicesConnectedRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.DevicesConnectedRequestOrBuilder
            public ConnectedDevice getOther(int i14) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.otherBuilder_;
                return repeatedFieldBuilderV3 == null ? this.other_.get(i14) : (ConnectedDevice) repeatedFieldBuilderV3.getMessage(i14);
            }

            public ConnectedDevice.Builder getOtherBuilder(int i14) {
                return (ConnectedDevice.Builder) getOtherFieldBuilder().getBuilder(i14);
            }

            public List<ConnectedDevice.Builder> getOtherBuilderList() {
                return getOtherFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.DevicesConnectedRequestOrBuilder
            public int getOtherCount() {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.otherBuilder_;
                return repeatedFieldBuilderV3 == null ? this.other_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.DevicesConnectedRequestOrBuilder
            public List<ConnectedDevice> getOtherList() {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.otherBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.other_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.DevicesConnectedRequestOrBuilder
            public ConnectedDeviceOrBuilder getOtherOrBuilder(int i14) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.otherBuilder_;
                return repeatedFieldBuilderV3 == null ? this.other_.get(i14) : (ConnectedDeviceOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.DevicesConnectedRequestOrBuilder
            public List<? extends ConnectedDeviceOrBuilder> getOtherOrBuilderList() {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.otherBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.other_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_DevicesConnectedRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(DevicesConnectedRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(DevicesConnectedRequest devicesConnectedRequest) {
                if (devicesConnectedRequest == DevicesConnectedRequest.getDefaultInstance()) {
                    return this;
                }
                if (this.otherBuilder_ == null) {
                    if (!devicesConnectedRequest.other_.isEmpty()) {
                        if (this.other_.isEmpty()) {
                            this.other_ = devicesConnectedRequest.other_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureOtherIsMutable();
                            this.other_.addAll(devicesConnectedRequest.other_);
                        }
                        onChanged();
                    }
                } else if (!devicesConnectedRequest.other_.isEmpty()) {
                    boolean zIsEmpty = this.otherBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.otherBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.otherBuilder_ = null;
                        this.other_ = devicesConnectedRequest.other_;
                        this.bitField0_ &= -2;
                        this.otherBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getOtherFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(devicesConnectedRequest.other_);
                    }
                }
                mergeUnknownFields(devicesConnectedRequest.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeOther(int i14) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.otherBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureOtherIsMutable();
                this.other_.remove(i14);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setOther(int i14, ConnectedDevice.Builder builder) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.otherBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureOtherIsMutable();
                this.other_.set(i14, builder.build());
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
            public DevicesConnectedRequest getDefaultInstanceForType() {
                return DevicesConnectedRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.other_ = Collections.EMPTY_LIST;
            }

            public ConnectedDevice.Builder addOtherBuilder(int i14) {
                return (ConnectedDevice.Builder) getOtherFieldBuilder().addBuilder(i14, ConnectedDevice.getDefaultInstance());
            }

            public Builder addOther(int i14, ConnectedDevice connectedDevice) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.otherBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    connectedDevice.getClass();
                    ensureOtherIsMutable();
                    this.other_.add(i14, connectedDevice);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, connectedDevice);
                return this;
            }

            public Builder setOther(int i14, ConnectedDevice connectedDevice) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.otherBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    connectedDevice.getClass();
                    ensureOtherIsMutable();
                    this.other_.set(i14, connectedDevice);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, connectedDevice);
                return this;
            }

            public Builder addOther(ConnectedDevice connectedDevice) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.otherBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    connectedDevice.getClass();
                    ensureOtherIsMutable();
                    this.other_.add(connectedDevice);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(connectedDevice);
                return this;
            }

            public Builder addOther(int i14, ConnectedDevice.Builder builder) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.otherBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureOtherIsMutable();
                    this.other_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DevicesConnectedRequest) {
                    return mergeFrom((DevicesConnectedRequest) message);
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
                                    ConnectedDevice connectedDevice = (ConnectedDevice) codedInputStream.readMessage(ConnectedDevice.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.otherBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureOtherIsMutable();
                                        this.other_.add(connectedDevice);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(connectedDevice);
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
        public DevicesConnectedRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DevicesConnectedRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DevicesConnectedRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DevicesConnectedRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DevicesConnectedRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private DevicesConnectedRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DevicesConnectedRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DevicesConnectedRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ DevicesConnectedRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DevicesConnectedRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DevicesConnectedRequest parseFrom(InputStream inputStream) {
            return (DevicesConnectedRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DevicesConnectedRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DevicesConnectedRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DevicesConnectedRequest parseFrom(CodedInputStream codedInputStream) {
            return (DevicesConnectedRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DevicesConnectedRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DevicesConnectedRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DevicesConnectedResponse extends GeneratedMessageV3 implements DevicesConnectedResponseOrBuilder {
        private static final DevicesConnectedResponse DEFAULT_INSTANCE = new DevicesConnectedResponse();

        @Deprecated
        public static final Parser<DevicesConnectedResponse> PARSER = new AbstractParser<DevicesConnectedResponse>() { // from class: com.garmin.proto.generated.GDIConnectedDevicesReporting.DevicesConnectedResponse.1
            @Override // com.google.protobuf.Parser
            public DevicesConnectedResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DevicesConnectedResponse.newBuilder();
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
        private byte memoizedIsInitialized;
        private Internal.IntList status_;

        private DevicesConnectedResponse() {
            this.status_ = GeneratedMessageV3.emptyIntList();
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = GeneratedMessageV3.emptyIntList();
        }

        public static DevicesConnectedResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_DevicesConnectedResponse_descriptor;
        }

        public static Builder newBuilder(DevicesConnectedResponse devicesConnectedResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(devicesConnectedResponse);
        }

        public static DevicesConnectedResponse parseDelimitedFrom(InputStream inputStream) {
            return (DevicesConnectedResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DevicesConnectedResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DevicesConnectedResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DevicesConnectedResponse)) {
                return super.equals(obj);
            }
            DevicesConnectedResponse devicesConnectedResponse = (DevicesConnectedResponse) obj;
            return getStatusList().equals(devicesConnectedResponse.getStatusList()) && getUnknownFields().equals(devicesConnectedResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DevicesConnectedResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iB = 0;
            for (int i15 = 0; i15 < this.status_.size(); i15++) {
                iB = f3.b(this.status_, i15, iB);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + getStatusList().size() + iB;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.DevicesConnectedResponseOrBuilder
        public int getStatus(int i14) {
            return this.status_.getInt(i14);
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.DevicesConnectedResponseOrBuilder
        public int getStatusCount() {
            return this.status_.size();
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.DevicesConnectedResponseOrBuilder
        public List<Integer> getStatusList() {
            return this.status_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getStatusCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getStatusList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_DevicesConnectedResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(DevicesConnectedResponse.class, Builder.class);
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
            return new DevicesConnectedResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            int iC = 0;
            while (iC < this.status_.size()) {
                iC = f3.c(this.status_, iC, codedOutputStream, 1, iC, 1);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DevicesConnectedResponseOrBuilder {
            private int bitField0_;
            private Internal.IntList status_;

            private Builder() {
                this.status_ = GeneratedMessageV3.emptyIntList();
            }

            private void buildPartial0(DevicesConnectedResponse devicesConnectedResponse) {
                if ((this.bitField0_ & 1) != 0) {
                    this.status_.makeImmutable();
                    devicesConnectedResponse.status_ = this.status_;
                }
            }

            private void ensureStatusIsMutable() {
                if (!this.status_.isModifiable()) {
                    this.status_ = (Internal.IntList) GeneratedMessageV3.makeMutableCopy(this.status_);
                }
                this.bitField0_ |= 1;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_DevicesConnectedResponse_descriptor;
            }

            public Builder addAllStatus(Iterable<? extends Integer> iterable) {
                ensureStatusIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.status_);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addStatus(int i14) {
                ensureStatusIsMutable();
                this.status_.addInt(i14);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DevicesConnectedResponse build() {
                DevicesConnectedResponse devicesConnectedResponseBuildPartial = buildPartial();
                if (devicesConnectedResponseBuildPartial.isInitialized()) {
                    return devicesConnectedResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) devicesConnectedResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DevicesConnectedResponse buildPartial() {
                DevicesConnectedResponse devicesConnectedResponse = new DevicesConnectedResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(devicesConnectedResponse);
                }
                onBuilt();
                return devicesConnectedResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = GeneratedMessageV3.emptyIntList();
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
                this.status_ = GeneratedMessageV3.emptyIntList();
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
                return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_DevicesConnectedResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.DevicesConnectedResponseOrBuilder
            public int getStatus(int i14) {
                return this.status_.getInt(i14);
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.DevicesConnectedResponseOrBuilder
            public int getStatusCount() {
                return this.status_.size();
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.DevicesConnectedResponseOrBuilder
            public List<Integer> getStatusList() {
                this.status_.makeImmutable();
                return this.status_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_DevicesConnectedResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(DevicesConnectedResponse.class, Builder.class);
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
                                    int uInt32 = codedInputStream.readUInt32();
                                    ensureStatusIsMutable();
                                    this.status_.addInt(uInt32);
                                } else if (tag == 10) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    ensureStatusIsMutable();
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.status_.addInt(codedInputStream.readUInt32());
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

            public Builder setStatus(int i14, int i15) {
                ensureStatusIsMutable();
                this.status_.setInt(i14, i15);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public DevicesConnectedResponse getDefaultInstanceForType() {
                return DevicesConnectedResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.status_ = GeneratedMessageV3.emptyIntList();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DevicesConnectedResponse) {
                    return mergeFrom((DevicesConnectedResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DevicesConnectedResponse devicesConnectedResponse) {
                if (devicesConnectedResponse == DevicesConnectedResponse.getDefaultInstance()) {
                    return this;
                }
                if (!devicesConnectedResponse.status_.isEmpty()) {
                    if (this.status_.isEmpty()) {
                        Internal.IntList intList = devicesConnectedResponse.status_;
                        this.status_ = intList;
                        intList.makeImmutable();
                        this.bitField0_ |= 1;
                    } else {
                        ensureStatusIsMutable();
                        this.status_.addAll(devicesConnectedResponse.status_);
                    }
                    onChanged();
                }
                mergeUnknownFields(devicesConnectedResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DevicesConnectedResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DevicesConnectedResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DevicesConnectedResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DevicesConnectedResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DevicesConnectedResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DevicesConnectedResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DevicesConnectedResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DevicesConnectedResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DevicesConnectedResponse parseFrom(InputStream inputStream) {
            return (DevicesConnectedResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DevicesConnectedResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DevicesConnectedResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DevicesConnectedResponse parseFrom(CodedInputStream codedInputStream) {
            return (DevicesConnectedResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        private DevicesConnectedResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = GeneratedMessageV3.emptyIntList();
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DevicesConnectedResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DevicesConnectedResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ DevicesConnectedResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class DevicesDisconnectedRequest extends GeneratedMessageV3 implements DevicesDisconnectedRequestOrBuilder {
        public static final int OTHER_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private List<ConnectedDevice> other_;
        private static final DevicesDisconnectedRequest DEFAULT_INSTANCE = new DevicesDisconnectedRequest();

        @Deprecated
        public static final Parser<DevicesDisconnectedRequest> PARSER = new AbstractParser<DevicesDisconnectedRequest>() { // from class: com.garmin.proto.generated.GDIConnectedDevicesReporting.DevicesDisconnectedRequest.1
            @Override // com.google.protobuf.Parser
            public DevicesDisconnectedRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DevicesDisconnectedRequest.newBuilder();
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

        private DevicesDisconnectedRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.other_ = Collections.EMPTY_LIST;
        }

        public static DevicesDisconnectedRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_DevicesDisconnectedRequest_descriptor;
        }

        public static Builder newBuilder(DevicesDisconnectedRequest devicesDisconnectedRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(devicesDisconnectedRequest);
        }

        public static DevicesDisconnectedRequest parseDelimitedFrom(InputStream inputStream) {
            return (DevicesDisconnectedRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DevicesDisconnectedRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DevicesDisconnectedRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DevicesDisconnectedRequest)) {
                return super.equals(obj);
            }
            DevicesDisconnectedRequest devicesDisconnectedRequest = (DevicesDisconnectedRequest) obj;
            return getOtherList().equals(devicesDisconnectedRequest.getOtherList()) && getUnknownFields().equals(devicesDisconnectedRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.DevicesDisconnectedRequestOrBuilder
        public ConnectedDevice getOther(int i14) {
            return this.other_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.DevicesDisconnectedRequestOrBuilder
        public int getOtherCount() {
            return this.other_.size();
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.DevicesDisconnectedRequestOrBuilder
        public List<ConnectedDevice> getOtherList() {
            return this.other_;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.DevicesDisconnectedRequestOrBuilder
        public ConnectedDeviceOrBuilder getOtherOrBuilder(int i14) {
            return this.other_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.DevicesDisconnectedRequestOrBuilder
        public List<? extends ConnectedDeviceOrBuilder> getOtherOrBuilderList() {
            return this.other_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DevicesDisconnectedRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = 0;
            for (int i15 = 0; i15 < this.other_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.other_.get(i15));
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
            if (getOtherCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getOtherList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_DevicesDisconnectedRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(DevicesDisconnectedRequest.class, Builder.class);
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
            return new DevicesDisconnectedRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.other_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.other_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DevicesDisconnectedRequestOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> otherBuilder_;
            private List<ConnectedDevice> other_;

            private Builder() {
                this.other_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(DevicesDisconnectedRequest devicesDisconnectedRequest) {
            }

            private void buildPartialRepeatedFields(DevicesDisconnectedRequest devicesDisconnectedRequest) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.otherBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    devicesDisconnectedRequest.other_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.other_ = Collections.unmodifiableList(this.other_);
                    this.bitField0_ &= -2;
                }
                devicesDisconnectedRequest.other_ = this.other_;
            }

            private void ensureOtherIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.other_ = new ArrayList(this.other_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_DevicesDisconnectedRequest_descriptor;
            }

            private RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> getOtherFieldBuilder() {
                if (this.otherBuilder_ == null) {
                    this.otherBuilder_ = new RepeatedFieldBuilderV3<>(this.other_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.other_ = null;
                }
                return this.otherBuilder_;
            }

            public Builder addAllOther(Iterable<? extends ConnectedDevice> iterable) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.otherBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureOtherIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.other_);
                onChanged();
                return this;
            }

            public Builder addOther(ConnectedDevice.Builder builder) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.otherBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureOtherIsMutable();
                this.other_.add(builder.build());
                onChanged();
                return this;
            }

            public ConnectedDevice.Builder addOtherBuilder() {
                return (ConnectedDevice.Builder) getOtherFieldBuilder().addBuilder(ConnectedDevice.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DevicesDisconnectedRequest build() {
                DevicesDisconnectedRequest devicesDisconnectedRequestBuildPartial = buildPartial();
                if (devicesDisconnectedRequestBuildPartial.isInitialized()) {
                    return devicesDisconnectedRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) devicesDisconnectedRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DevicesDisconnectedRequest buildPartial() {
                DevicesDisconnectedRequest devicesDisconnectedRequest = new DevicesDisconnectedRequest(this);
                buildPartialRepeatedFields(devicesDisconnectedRequest);
                if (this.bitField0_ != 0) {
                    buildPartial0(devicesDisconnectedRequest);
                }
                onBuilt();
                return devicesDisconnectedRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.otherBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.other_ = Collections.EMPTY_LIST;
                } else {
                    this.other_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
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

            public Builder clearOther() {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.otherBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.other_ = Collections.EMPTY_LIST;
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
                return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_DevicesDisconnectedRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.DevicesDisconnectedRequestOrBuilder
            public ConnectedDevice getOther(int i14) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.otherBuilder_;
                return repeatedFieldBuilderV3 == null ? this.other_.get(i14) : (ConnectedDevice) repeatedFieldBuilderV3.getMessage(i14);
            }

            public ConnectedDevice.Builder getOtherBuilder(int i14) {
                return (ConnectedDevice.Builder) getOtherFieldBuilder().getBuilder(i14);
            }

            public List<ConnectedDevice.Builder> getOtherBuilderList() {
                return getOtherFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.DevicesDisconnectedRequestOrBuilder
            public int getOtherCount() {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.otherBuilder_;
                return repeatedFieldBuilderV3 == null ? this.other_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.DevicesDisconnectedRequestOrBuilder
            public List<ConnectedDevice> getOtherList() {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.otherBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.other_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.DevicesDisconnectedRequestOrBuilder
            public ConnectedDeviceOrBuilder getOtherOrBuilder(int i14) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.otherBuilder_;
                return repeatedFieldBuilderV3 == null ? this.other_.get(i14) : (ConnectedDeviceOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.DevicesDisconnectedRequestOrBuilder
            public List<? extends ConnectedDeviceOrBuilder> getOtherOrBuilderList() {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.otherBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.other_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_DevicesDisconnectedRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(DevicesDisconnectedRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(DevicesDisconnectedRequest devicesDisconnectedRequest) {
                if (devicesDisconnectedRequest == DevicesDisconnectedRequest.getDefaultInstance()) {
                    return this;
                }
                if (this.otherBuilder_ == null) {
                    if (!devicesDisconnectedRequest.other_.isEmpty()) {
                        if (this.other_.isEmpty()) {
                            this.other_ = devicesDisconnectedRequest.other_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureOtherIsMutable();
                            this.other_.addAll(devicesDisconnectedRequest.other_);
                        }
                        onChanged();
                    }
                } else if (!devicesDisconnectedRequest.other_.isEmpty()) {
                    boolean zIsEmpty = this.otherBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.otherBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.otherBuilder_ = null;
                        this.other_ = devicesDisconnectedRequest.other_;
                        this.bitField0_ &= -2;
                        this.otherBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getOtherFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(devicesDisconnectedRequest.other_);
                    }
                }
                mergeUnknownFields(devicesDisconnectedRequest.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeOther(int i14) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.otherBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureOtherIsMutable();
                this.other_.remove(i14);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setOther(int i14, ConnectedDevice.Builder builder) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.otherBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureOtherIsMutable();
                this.other_.set(i14, builder.build());
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
            public DevicesDisconnectedRequest getDefaultInstanceForType() {
                return DevicesDisconnectedRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.other_ = Collections.EMPTY_LIST;
            }

            public ConnectedDevice.Builder addOtherBuilder(int i14) {
                return (ConnectedDevice.Builder) getOtherFieldBuilder().addBuilder(i14, ConnectedDevice.getDefaultInstance());
            }

            public Builder addOther(int i14, ConnectedDevice connectedDevice) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.otherBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    connectedDevice.getClass();
                    ensureOtherIsMutable();
                    this.other_.add(i14, connectedDevice);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, connectedDevice);
                return this;
            }

            public Builder setOther(int i14, ConnectedDevice connectedDevice) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.otherBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    connectedDevice.getClass();
                    ensureOtherIsMutable();
                    this.other_.set(i14, connectedDevice);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, connectedDevice);
                return this;
            }

            public Builder addOther(ConnectedDevice connectedDevice) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.otherBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    connectedDevice.getClass();
                    ensureOtherIsMutable();
                    this.other_.add(connectedDevice);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(connectedDevice);
                return this;
            }

            public Builder addOther(int i14, ConnectedDevice.Builder builder) {
                RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.otherBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureOtherIsMutable();
                    this.other_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DevicesDisconnectedRequest) {
                    return mergeFrom((DevicesDisconnectedRequest) message);
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
                                    ConnectedDevice connectedDevice = (ConnectedDevice) codedInputStream.readMessage(ConnectedDevice.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<ConnectedDevice, ConnectedDevice.Builder, ConnectedDeviceOrBuilder> repeatedFieldBuilderV3 = this.otherBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureOtherIsMutable();
                                        this.other_.add(connectedDevice);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(connectedDevice);
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
        public DevicesDisconnectedRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DevicesDisconnectedRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DevicesDisconnectedRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DevicesDisconnectedRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DevicesDisconnectedRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private DevicesDisconnectedRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DevicesDisconnectedRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DevicesDisconnectedRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ DevicesDisconnectedRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DevicesDisconnectedRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DevicesDisconnectedRequest parseFrom(InputStream inputStream) {
            return (DevicesDisconnectedRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DevicesDisconnectedRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DevicesDisconnectedRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DevicesDisconnectedRequest parseFrom(CodedInputStream codedInputStream) {
            return (DevicesDisconnectedRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DevicesDisconnectedRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DevicesDisconnectedRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DevicesDisconnectedResponse extends GeneratedMessageV3 implements DevicesDisconnectedResponseOrBuilder {
        private static final DevicesDisconnectedResponse DEFAULT_INSTANCE = new DevicesDisconnectedResponse();

        @Deprecated
        public static final Parser<DevicesDisconnectedResponse> PARSER = new AbstractParser<DevicesDisconnectedResponse>() { // from class: com.garmin.proto.generated.GDIConnectedDevicesReporting.DevicesDisconnectedResponse.1
            @Override // com.google.protobuf.Parser
            public DevicesDisconnectedResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DevicesDisconnectedResponse.newBuilder();
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
        private byte memoizedIsInitialized;
        private Internal.IntList status_;

        private DevicesDisconnectedResponse() {
            this.status_ = GeneratedMessageV3.emptyIntList();
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = GeneratedMessageV3.emptyIntList();
        }

        public static DevicesDisconnectedResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_DevicesDisconnectedResponse_descriptor;
        }

        public static Builder newBuilder(DevicesDisconnectedResponse devicesDisconnectedResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(devicesDisconnectedResponse);
        }

        public static DevicesDisconnectedResponse parseDelimitedFrom(InputStream inputStream) {
            return (DevicesDisconnectedResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DevicesDisconnectedResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DevicesDisconnectedResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DevicesDisconnectedResponse)) {
                return super.equals(obj);
            }
            DevicesDisconnectedResponse devicesDisconnectedResponse = (DevicesDisconnectedResponse) obj;
            return getStatusList().equals(devicesDisconnectedResponse.getStatusList()) && getUnknownFields().equals(devicesDisconnectedResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DevicesDisconnectedResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iB = 0;
            for (int i15 = 0; i15 < this.status_.size(); i15++) {
                iB = f3.b(this.status_, i15, iB);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + getStatusList().size() + iB;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.DevicesDisconnectedResponseOrBuilder
        public int getStatus(int i14) {
            return this.status_.getInt(i14);
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.DevicesDisconnectedResponseOrBuilder
        public int getStatusCount() {
            return this.status_.size();
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.DevicesDisconnectedResponseOrBuilder
        public List<Integer> getStatusList() {
            return this.status_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getStatusCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getStatusList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_DevicesDisconnectedResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(DevicesDisconnectedResponse.class, Builder.class);
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
            return new DevicesDisconnectedResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            int iC = 0;
            while (iC < this.status_.size()) {
                iC = f3.c(this.status_, iC, codedOutputStream, 1, iC, 1);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DevicesDisconnectedResponseOrBuilder {
            private int bitField0_;
            private Internal.IntList status_;

            private Builder() {
                this.status_ = GeneratedMessageV3.emptyIntList();
            }

            private void buildPartial0(DevicesDisconnectedResponse devicesDisconnectedResponse) {
                if ((this.bitField0_ & 1) != 0) {
                    this.status_.makeImmutable();
                    devicesDisconnectedResponse.status_ = this.status_;
                }
            }

            private void ensureStatusIsMutable() {
                if (!this.status_.isModifiable()) {
                    this.status_ = (Internal.IntList) GeneratedMessageV3.makeMutableCopy(this.status_);
                }
                this.bitField0_ |= 1;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_DevicesDisconnectedResponse_descriptor;
            }

            public Builder addAllStatus(Iterable<? extends Integer> iterable) {
                ensureStatusIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.status_);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addStatus(int i14) {
                ensureStatusIsMutable();
                this.status_.addInt(i14);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DevicesDisconnectedResponse build() {
                DevicesDisconnectedResponse devicesDisconnectedResponseBuildPartial = buildPartial();
                if (devicesDisconnectedResponseBuildPartial.isInitialized()) {
                    return devicesDisconnectedResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) devicesDisconnectedResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DevicesDisconnectedResponse buildPartial() {
                DevicesDisconnectedResponse devicesDisconnectedResponse = new DevicesDisconnectedResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(devicesDisconnectedResponse);
                }
                onBuilt();
                return devicesDisconnectedResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = GeneratedMessageV3.emptyIntList();
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
                this.status_ = GeneratedMessageV3.emptyIntList();
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
                return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_DevicesDisconnectedResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.DevicesDisconnectedResponseOrBuilder
            public int getStatus(int i14) {
                return this.status_.getInt(i14);
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.DevicesDisconnectedResponseOrBuilder
            public int getStatusCount() {
                return this.status_.size();
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.DevicesDisconnectedResponseOrBuilder
            public List<Integer> getStatusList() {
                this.status_.makeImmutable();
                return this.status_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_DevicesDisconnectedResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(DevicesDisconnectedResponse.class, Builder.class);
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
                                    int uInt32 = codedInputStream.readUInt32();
                                    ensureStatusIsMutable();
                                    this.status_.addInt(uInt32);
                                } else if (tag == 10) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    ensureStatusIsMutable();
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        this.status_.addInt(codedInputStream.readUInt32());
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

            public Builder setStatus(int i14, int i15) {
                ensureStatusIsMutable();
                this.status_.setInt(i14, i15);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public DevicesDisconnectedResponse getDefaultInstanceForType() {
                return DevicesDisconnectedResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.status_ = GeneratedMessageV3.emptyIntList();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DevicesDisconnectedResponse) {
                    return mergeFrom((DevicesDisconnectedResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DevicesDisconnectedResponse devicesDisconnectedResponse) {
                if (devicesDisconnectedResponse == DevicesDisconnectedResponse.getDefaultInstance()) {
                    return this;
                }
                if (!devicesDisconnectedResponse.status_.isEmpty()) {
                    if (this.status_.isEmpty()) {
                        Internal.IntList intList = devicesDisconnectedResponse.status_;
                        this.status_ = intList;
                        intList.makeImmutable();
                        this.bitField0_ |= 1;
                    } else {
                        ensureStatusIsMutable();
                        this.status_.addAll(devicesDisconnectedResponse.status_);
                    }
                    onChanged();
                }
                mergeUnknownFields(devicesDisconnectedResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DevicesDisconnectedResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DevicesDisconnectedResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DevicesDisconnectedResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DevicesDisconnectedResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DevicesDisconnectedResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DevicesDisconnectedResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DevicesDisconnectedResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DevicesDisconnectedResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DevicesDisconnectedResponse parseFrom(InputStream inputStream) {
            return (DevicesDisconnectedResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DevicesDisconnectedResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DevicesDisconnectedResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DevicesDisconnectedResponse parseFrom(CodedInputStream codedInputStream) {
            return (DevicesDisconnectedResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        private DevicesDisconnectedResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = GeneratedMessageV3.emptyIntList();
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DevicesDisconnectedResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DevicesDisconnectedResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ DevicesDisconnectedResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        public static final int CONNECTED_DEVICES_REQUEST_FIELD_NUMBER = 1;
        public static final int CONNECTED_DEVICES_RESPONSE_FIELD_NUMBER = 2;
        public static final int CONNECTION_ALERT_REGISTRATION_REQUEST_FIELD_NUMBER = 3;
        public static final int CONNECTION_ALERT_REGISTRATION_RESPONSE_FIELD_NUMBER = 4;
        public static final int DEVICE_CONNECTED_REQUEST_FIELD_NUMBER = 5;
        public static final int DEVICE_CONNECTED_RESPONSE_FIELD_NUMBER = 6;
        public static final int DEVICE_DISCONNECTED_REQUEST_FIELD_NUMBER = 7;
        public static final int DEVICE_DISCONNECTED_RESPONSE_FIELD_NUMBER = 8;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ConnectedDevicesRequest connectedDevicesRequest_;
        private ConnectedDevicesResponse connectedDevicesResponse_;
        private ConnectionAlertRegistrationRequest connectionAlertRegistrationRequest_;
        private ConnectionAlertRegistrationResponse connectionAlertRegistrationResponse_;
        private DevicesConnectedRequest deviceConnectedRequest_;
        private DevicesConnectedResponse deviceConnectedResponse_;
        private DevicesDisconnectedRequest deviceDisconnectedRequest_;
        private DevicesDisconnectedResponse deviceDisconnectedResponse_;
        private byte memoizedIsInitialized;
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDIConnectedDevicesReporting.Service.1
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
            return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_Service_descriptor;
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
            if (hasConnectedDevicesRequest() != service.hasConnectedDevicesRequest()) {
                return false;
            }
            if ((hasConnectedDevicesRequest() && !getConnectedDevicesRequest().equals(service.getConnectedDevicesRequest())) || hasConnectedDevicesResponse() != service.hasConnectedDevicesResponse()) {
                return false;
            }
            if ((hasConnectedDevicesResponse() && !getConnectedDevicesResponse().equals(service.getConnectedDevicesResponse())) || hasConnectionAlertRegistrationRequest() != service.hasConnectionAlertRegistrationRequest()) {
                return false;
            }
            if ((hasConnectionAlertRegistrationRequest() && !getConnectionAlertRegistrationRequest().equals(service.getConnectionAlertRegistrationRequest())) || hasConnectionAlertRegistrationResponse() != service.hasConnectionAlertRegistrationResponse()) {
                return false;
            }
            if ((hasConnectionAlertRegistrationResponse() && !getConnectionAlertRegistrationResponse().equals(service.getConnectionAlertRegistrationResponse())) || hasDeviceConnectedRequest() != service.hasDeviceConnectedRequest()) {
                return false;
            }
            if ((hasDeviceConnectedRequest() && !getDeviceConnectedRequest().equals(service.getDeviceConnectedRequest())) || hasDeviceConnectedResponse() != service.hasDeviceConnectedResponse()) {
                return false;
            }
            if ((hasDeviceConnectedResponse() && !getDeviceConnectedResponse().equals(service.getDeviceConnectedResponse())) || hasDeviceDisconnectedRequest() != service.hasDeviceDisconnectedRequest()) {
                return false;
            }
            if ((!hasDeviceDisconnectedRequest() || getDeviceDisconnectedRequest().equals(service.getDeviceDisconnectedRequest())) && hasDeviceDisconnectedResponse() == service.hasDeviceDisconnectedResponse()) {
                return (!hasDeviceDisconnectedResponse() || getDeviceDisconnectedResponse().equals(service.getDeviceDisconnectedResponse())) && getUnknownFields().equals(service.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
        public ConnectedDevicesRequest getConnectedDevicesRequest() {
            ConnectedDevicesRequest connectedDevicesRequest = this.connectedDevicesRequest_;
            return connectedDevicesRequest == null ? ConnectedDevicesRequest.getDefaultInstance() : connectedDevicesRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
        public ConnectedDevicesRequestOrBuilder getConnectedDevicesRequestOrBuilder() {
            ConnectedDevicesRequest connectedDevicesRequest = this.connectedDevicesRequest_;
            return connectedDevicesRequest == null ? ConnectedDevicesRequest.getDefaultInstance() : connectedDevicesRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
        public ConnectedDevicesResponse getConnectedDevicesResponse() {
            ConnectedDevicesResponse connectedDevicesResponse = this.connectedDevicesResponse_;
            return connectedDevicesResponse == null ? ConnectedDevicesResponse.getDefaultInstance() : connectedDevicesResponse;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
        public ConnectedDevicesResponseOrBuilder getConnectedDevicesResponseOrBuilder() {
            ConnectedDevicesResponse connectedDevicesResponse = this.connectedDevicesResponse_;
            return connectedDevicesResponse == null ? ConnectedDevicesResponse.getDefaultInstance() : connectedDevicesResponse;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
        public ConnectionAlertRegistrationRequest getConnectionAlertRegistrationRequest() {
            ConnectionAlertRegistrationRequest connectionAlertRegistrationRequest = this.connectionAlertRegistrationRequest_;
            return connectionAlertRegistrationRequest == null ? ConnectionAlertRegistrationRequest.getDefaultInstance() : connectionAlertRegistrationRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
        public ConnectionAlertRegistrationRequestOrBuilder getConnectionAlertRegistrationRequestOrBuilder() {
            ConnectionAlertRegistrationRequest connectionAlertRegistrationRequest = this.connectionAlertRegistrationRequest_;
            return connectionAlertRegistrationRequest == null ? ConnectionAlertRegistrationRequest.getDefaultInstance() : connectionAlertRegistrationRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
        public ConnectionAlertRegistrationResponse getConnectionAlertRegistrationResponse() {
            ConnectionAlertRegistrationResponse connectionAlertRegistrationResponse = this.connectionAlertRegistrationResponse_;
            return connectionAlertRegistrationResponse == null ? ConnectionAlertRegistrationResponse.getDefaultInstance() : connectionAlertRegistrationResponse;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
        public ConnectionAlertRegistrationResponseOrBuilder getConnectionAlertRegistrationResponseOrBuilder() {
            ConnectionAlertRegistrationResponse connectionAlertRegistrationResponse = this.connectionAlertRegistrationResponse_;
            return connectionAlertRegistrationResponse == null ? ConnectionAlertRegistrationResponse.getDefaultInstance() : connectionAlertRegistrationResponse;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
        public DevicesConnectedRequest getDeviceConnectedRequest() {
            DevicesConnectedRequest devicesConnectedRequest = this.deviceConnectedRequest_;
            return devicesConnectedRequest == null ? DevicesConnectedRequest.getDefaultInstance() : devicesConnectedRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
        public DevicesConnectedRequestOrBuilder getDeviceConnectedRequestOrBuilder() {
            DevicesConnectedRequest devicesConnectedRequest = this.deviceConnectedRequest_;
            return devicesConnectedRequest == null ? DevicesConnectedRequest.getDefaultInstance() : devicesConnectedRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
        public DevicesConnectedResponse getDeviceConnectedResponse() {
            DevicesConnectedResponse devicesConnectedResponse = this.deviceConnectedResponse_;
            return devicesConnectedResponse == null ? DevicesConnectedResponse.getDefaultInstance() : devicesConnectedResponse;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
        public DevicesConnectedResponseOrBuilder getDeviceConnectedResponseOrBuilder() {
            DevicesConnectedResponse devicesConnectedResponse = this.deviceConnectedResponse_;
            return devicesConnectedResponse == null ? DevicesConnectedResponse.getDefaultInstance() : devicesConnectedResponse;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
        public DevicesDisconnectedRequest getDeviceDisconnectedRequest() {
            DevicesDisconnectedRequest devicesDisconnectedRequest = this.deviceDisconnectedRequest_;
            return devicesDisconnectedRequest == null ? DevicesDisconnectedRequest.getDefaultInstance() : devicesDisconnectedRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
        public DevicesDisconnectedRequestOrBuilder getDeviceDisconnectedRequestOrBuilder() {
            DevicesDisconnectedRequest devicesDisconnectedRequest = this.deviceDisconnectedRequest_;
            return devicesDisconnectedRequest == null ? DevicesDisconnectedRequest.getDefaultInstance() : devicesDisconnectedRequest;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
        public DevicesDisconnectedResponse getDeviceDisconnectedResponse() {
            DevicesDisconnectedResponse devicesDisconnectedResponse = this.deviceDisconnectedResponse_;
            return devicesDisconnectedResponse == null ? DevicesDisconnectedResponse.getDefaultInstance() : devicesDisconnectedResponse;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
        public DevicesDisconnectedResponseOrBuilder getDeviceDisconnectedResponseOrBuilder() {
            DevicesDisconnectedResponse devicesDisconnectedResponse = this.deviceDisconnectedResponse_;
            return devicesDisconnectedResponse == null ? DevicesDisconnectedResponse.getDefaultInstance() : devicesDisconnectedResponse;
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
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getConnectedDevicesRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getConnectedDevicesResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getConnectionAlertRegistrationRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getConnectionAlertRegistrationResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getDeviceConnectedRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getDeviceConnectedResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getDeviceDisconnectedRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, getDeviceDisconnectedResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
        public boolean hasConnectedDevicesRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
        public boolean hasConnectedDevicesResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
        public boolean hasConnectionAlertRegistrationRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
        public boolean hasConnectionAlertRegistrationResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
        public boolean hasDeviceConnectedRequest() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
        public boolean hasDeviceConnectedResponse() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
        public boolean hasDeviceDisconnectedRequest() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
        public boolean hasDeviceDisconnectedResponse() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasConnectedDevicesRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getConnectedDevicesRequest().hashCode();
            }
            if (hasConnectedDevicesResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getConnectedDevicesResponse().hashCode();
            }
            if (hasConnectionAlertRegistrationRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getConnectionAlertRegistrationRequest().hashCode();
            }
            if (hasConnectionAlertRegistrationResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getConnectionAlertRegistrationResponse().hashCode();
            }
            if (hasDeviceConnectedRequest()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getDeviceConnectedRequest().hashCode();
            }
            if (hasDeviceConnectedResponse()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getDeviceConnectedResponse().hashCode();
            }
            if (hasDeviceDisconnectedRequest()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getDeviceDisconnectedRequest().hashCode();
            }
            if (hasDeviceDisconnectedResponse()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getDeviceDisconnectedResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getConnectedDevicesRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getConnectedDevicesResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getConnectionAlertRegistrationRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getConnectionAlertRegistrationResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getDeviceConnectedRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getDeviceConnectedResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getDeviceDisconnectedRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(8, getDeviceDisconnectedResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<ConnectedDevicesRequest, ConnectedDevicesRequest.Builder, ConnectedDevicesRequestOrBuilder> connectedDevicesRequestBuilder_;
            private ConnectedDevicesRequest connectedDevicesRequest_;
            private SingleFieldBuilderV3<ConnectedDevicesResponse, ConnectedDevicesResponse.Builder, ConnectedDevicesResponseOrBuilder> connectedDevicesResponseBuilder_;
            private ConnectedDevicesResponse connectedDevicesResponse_;
            private SingleFieldBuilderV3<ConnectionAlertRegistrationRequest, ConnectionAlertRegistrationRequest.Builder, ConnectionAlertRegistrationRequestOrBuilder> connectionAlertRegistrationRequestBuilder_;
            private ConnectionAlertRegistrationRequest connectionAlertRegistrationRequest_;
            private SingleFieldBuilderV3<ConnectionAlertRegistrationResponse, ConnectionAlertRegistrationResponse.Builder, ConnectionAlertRegistrationResponseOrBuilder> connectionAlertRegistrationResponseBuilder_;
            private ConnectionAlertRegistrationResponse connectionAlertRegistrationResponse_;
            private SingleFieldBuilderV3<DevicesConnectedRequest, DevicesConnectedRequest.Builder, DevicesConnectedRequestOrBuilder> deviceConnectedRequestBuilder_;
            private DevicesConnectedRequest deviceConnectedRequest_;
            private SingleFieldBuilderV3<DevicesConnectedResponse, DevicesConnectedResponse.Builder, DevicesConnectedResponseOrBuilder> deviceConnectedResponseBuilder_;
            private DevicesConnectedResponse deviceConnectedResponse_;
            private SingleFieldBuilderV3<DevicesDisconnectedRequest, DevicesDisconnectedRequest.Builder, DevicesDisconnectedRequestOrBuilder> deviceDisconnectedRequestBuilder_;
            private DevicesDisconnectedRequest deviceDisconnectedRequest_;
            private SingleFieldBuilderV3<DevicesDisconnectedResponse, DevicesDisconnectedResponse.Builder, DevicesDisconnectedResponseOrBuilder> deviceDisconnectedResponseBuilder_;
            private DevicesDisconnectedResponse deviceDisconnectedResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Service service) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<ConnectedDevicesRequest, ConnectedDevicesRequest.Builder, ConnectedDevicesRequestOrBuilder> singleFieldBuilderV3 = this.connectedDevicesRequestBuilder_;
                    service.connectedDevicesRequest_ = singleFieldBuilderV3 == null ? this.connectedDevicesRequest_ : (ConnectedDevicesRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<ConnectedDevicesResponse, ConnectedDevicesResponse.Builder, ConnectedDevicesResponseOrBuilder> singleFieldBuilderV4 = this.connectedDevicesResponseBuilder_;
                    service.connectedDevicesResponse_ = singleFieldBuilderV4 == null ? this.connectedDevicesResponse_ : (ConnectedDevicesResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<ConnectionAlertRegistrationRequest, ConnectionAlertRegistrationRequest.Builder, ConnectionAlertRegistrationRequestOrBuilder> singleFieldBuilderV5 = this.connectionAlertRegistrationRequestBuilder_;
                    service.connectionAlertRegistrationRequest_ = singleFieldBuilderV5 == null ? this.connectionAlertRegistrationRequest_ : (ConnectionAlertRegistrationRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<ConnectionAlertRegistrationResponse, ConnectionAlertRegistrationResponse.Builder, ConnectionAlertRegistrationResponseOrBuilder> singleFieldBuilderV6 = this.connectionAlertRegistrationResponseBuilder_;
                    service.connectionAlertRegistrationResponse_ = singleFieldBuilderV6 == null ? this.connectionAlertRegistrationResponse_ : (ConnectionAlertRegistrationResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<DevicesConnectedRequest, DevicesConnectedRequest.Builder, DevicesConnectedRequestOrBuilder> singleFieldBuilderV7 = this.deviceConnectedRequestBuilder_;
                    service.deviceConnectedRequest_ = singleFieldBuilderV7 == null ? this.deviceConnectedRequest_ : (DevicesConnectedRequest) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<DevicesConnectedResponse, DevicesConnectedResponse.Builder, DevicesConnectedResponseOrBuilder> singleFieldBuilderV8 = this.deviceConnectedResponseBuilder_;
                    service.deviceConnectedResponse_ = singleFieldBuilderV8 == null ? this.deviceConnectedResponse_ : (DevicesConnectedResponse) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<DevicesDisconnectedRequest, DevicesDisconnectedRequest.Builder, DevicesDisconnectedRequestOrBuilder> singleFieldBuilderV9 = this.deviceDisconnectedRequestBuilder_;
                    service.deviceDisconnectedRequest_ = singleFieldBuilderV9 == null ? this.deviceDisconnectedRequest_ : (DevicesDisconnectedRequest) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<DevicesDisconnectedResponse, DevicesDisconnectedResponse.Builder, DevicesDisconnectedResponseOrBuilder> singleFieldBuilderV10 = this.deviceDisconnectedResponseBuilder_;
                    service.deviceDisconnectedResponse_ = singleFieldBuilderV10 == null ? this.deviceDisconnectedResponse_ : (DevicesDisconnectedResponse) singleFieldBuilderV10.build();
                    i14 |= 128;
                }
                service.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<ConnectedDevicesRequest, ConnectedDevicesRequest.Builder, ConnectedDevicesRequestOrBuilder> getConnectedDevicesRequestFieldBuilder() {
                if (this.connectedDevicesRequestBuilder_ == null) {
                    this.connectedDevicesRequestBuilder_ = new SingleFieldBuilderV3<>(getConnectedDevicesRequest(), getParentForChildren(), isClean());
                    this.connectedDevicesRequest_ = null;
                }
                return this.connectedDevicesRequestBuilder_;
            }

            private SingleFieldBuilderV3<ConnectedDevicesResponse, ConnectedDevicesResponse.Builder, ConnectedDevicesResponseOrBuilder> getConnectedDevicesResponseFieldBuilder() {
                if (this.connectedDevicesResponseBuilder_ == null) {
                    this.connectedDevicesResponseBuilder_ = new SingleFieldBuilderV3<>(getConnectedDevicesResponse(), getParentForChildren(), isClean());
                    this.connectedDevicesResponse_ = null;
                }
                return this.connectedDevicesResponseBuilder_;
            }

            private SingleFieldBuilderV3<ConnectionAlertRegistrationRequest, ConnectionAlertRegistrationRequest.Builder, ConnectionAlertRegistrationRequestOrBuilder> getConnectionAlertRegistrationRequestFieldBuilder() {
                if (this.connectionAlertRegistrationRequestBuilder_ == null) {
                    this.connectionAlertRegistrationRequestBuilder_ = new SingleFieldBuilderV3<>(getConnectionAlertRegistrationRequest(), getParentForChildren(), isClean());
                    this.connectionAlertRegistrationRequest_ = null;
                }
                return this.connectionAlertRegistrationRequestBuilder_;
            }

            private SingleFieldBuilderV3<ConnectionAlertRegistrationResponse, ConnectionAlertRegistrationResponse.Builder, ConnectionAlertRegistrationResponseOrBuilder> getConnectionAlertRegistrationResponseFieldBuilder() {
                if (this.connectionAlertRegistrationResponseBuilder_ == null) {
                    this.connectionAlertRegistrationResponseBuilder_ = new SingleFieldBuilderV3<>(getConnectionAlertRegistrationResponse(), getParentForChildren(), isClean());
                    this.connectionAlertRegistrationResponse_ = null;
                }
                return this.connectionAlertRegistrationResponseBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_Service_descriptor;
            }

            private SingleFieldBuilderV3<DevicesConnectedRequest, DevicesConnectedRequest.Builder, DevicesConnectedRequestOrBuilder> getDeviceConnectedRequestFieldBuilder() {
                if (this.deviceConnectedRequestBuilder_ == null) {
                    this.deviceConnectedRequestBuilder_ = new SingleFieldBuilderV3<>(getDeviceConnectedRequest(), getParentForChildren(), isClean());
                    this.deviceConnectedRequest_ = null;
                }
                return this.deviceConnectedRequestBuilder_;
            }

            private SingleFieldBuilderV3<DevicesConnectedResponse, DevicesConnectedResponse.Builder, DevicesConnectedResponseOrBuilder> getDeviceConnectedResponseFieldBuilder() {
                if (this.deviceConnectedResponseBuilder_ == null) {
                    this.deviceConnectedResponseBuilder_ = new SingleFieldBuilderV3<>(getDeviceConnectedResponse(), getParentForChildren(), isClean());
                    this.deviceConnectedResponse_ = null;
                }
                return this.deviceConnectedResponseBuilder_;
            }

            private SingleFieldBuilderV3<DevicesDisconnectedRequest, DevicesDisconnectedRequest.Builder, DevicesDisconnectedRequestOrBuilder> getDeviceDisconnectedRequestFieldBuilder() {
                if (this.deviceDisconnectedRequestBuilder_ == null) {
                    this.deviceDisconnectedRequestBuilder_ = new SingleFieldBuilderV3<>(getDeviceDisconnectedRequest(), getParentForChildren(), isClean());
                    this.deviceDisconnectedRequest_ = null;
                }
                return this.deviceDisconnectedRequestBuilder_;
            }

            private SingleFieldBuilderV3<DevicesDisconnectedResponse, DevicesDisconnectedResponse.Builder, DevicesDisconnectedResponseOrBuilder> getDeviceDisconnectedResponseFieldBuilder() {
                if (this.deviceDisconnectedResponseBuilder_ == null) {
                    this.deviceDisconnectedResponseBuilder_ = new SingleFieldBuilderV3<>(getDeviceDisconnectedResponse(), getParentForChildren(), isClean());
                    this.deviceDisconnectedResponse_ = null;
                }
                return this.deviceDisconnectedResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getConnectedDevicesRequestFieldBuilder();
                    getConnectedDevicesResponseFieldBuilder();
                    getConnectionAlertRegistrationRequestFieldBuilder();
                    getConnectionAlertRegistrationResponseFieldBuilder();
                    getDeviceConnectedRequestFieldBuilder();
                    getDeviceConnectedResponseFieldBuilder();
                    getDeviceDisconnectedRequestFieldBuilder();
                    getDeviceDisconnectedResponseFieldBuilder();
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
                this.connectedDevicesRequest_ = null;
                SingleFieldBuilderV3<ConnectedDevicesRequest, ConnectedDevicesRequest.Builder, ConnectedDevicesRequestOrBuilder> singleFieldBuilderV3 = this.connectedDevicesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.connectedDevicesRequestBuilder_ = null;
                }
                this.connectedDevicesResponse_ = null;
                SingleFieldBuilderV3<ConnectedDevicesResponse, ConnectedDevicesResponse.Builder, ConnectedDevicesResponseOrBuilder> singleFieldBuilderV4 = this.connectedDevicesResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.connectedDevicesResponseBuilder_ = null;
                }
                this.connectionAlertRegistrationRequest_ = null;
                SingleFieldBuilderV3<ConnectionAlertRegistrationRequest, ConnectionAlertRegistrationRequest.Builder, ConnectionAlertRegistrationRequestOrBuilder> singleFieldBuilderV5 = this.connectionAlertRegistrationRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.connectionAlertRegistrationRequestBuilder_ = null;
                }
                this.connectionAlertRegistrationResponse_ = null;
                SingleFieldBuilderV3<ConnectionAlertRegistrationResponse, ConnectionAlertRegistrationResponse.Builder, ConnectionAlertRegistrationResponseOrBuilder> singleFieldBuilderV6 = this.connectionAlertRegistrationResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.connectionAlertRegistrationResponseBuilder_ = null;
                }
                this.deviceConnectedRequest_ = null;
                SingleFieldBuilderV3<DevicesConnectedRequest, DevicesConnectedRequest.Builder, DevicesConnectedRequestOrBuilder> singleFieldBuilderV7 = this.deviceConnectedRequestBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.deviceConnectedRequestBuilder_ = null;
                }
                this.deviceConnectedResponse_ = null;
                SingleFieldBuilderV3<DevicesConnectedResponse, DevicesConnectedResponse.Builder, DevicesConnectedResponseOrBuilder> singleFieldBuilderV8 = this.deviceConnectedResponseBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.deviceConnectedResponseBuilder_ = null;
                }
                this.deviceDisconnectedRequest_ = null;
                SingleFieldBuilderV3<DevicesDisconnectedRequest, DevicesDisconnectedRequest.Builder, DevicesDisconnectedRequestOrBuilder> singleFieldBuilderV9 = this.deviceDisconnectedRequestBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.deviceDisconnectedRequestBuilder_ = null;
                }
                this.deviceDisconnectedResponse_ = null;
                SingleFieldBuilderV3<DevicesDisconnectedResponse, DevicesDisconnectedResponse.Builder, DevicesDisconnectedResponseOrBuilder> singleFieldBuilderV10 = this.deviceDisconnectedResponseBuilder_;
                if (singleFieldBuilderV10 != null) {
                    singleFieldBuilderV10.dispose();
                    this.deviceDisconnectedResponseBuilder_ = null;
                }
                return this;
            }

            public Builder clearConnectedDevicesRequest() {
                this.bitField0_ &= -2;
                this.connectedDevicesRequest_ = null;
                SingleFieldBuilderV3<ConnectedDevicesRequest, ConnectedDevicesRequest.Builder, ConnectedDevicesRequestOrBuilder> singleFieldBuilderV3 = this.connectedDevicesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.connectedDevicesRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConnectedDevicesResponse() {
                this.bitField0_ &= -3;
                this.connectedDevicesResponse_ = null;
                SingleFieldBuilderV3<ConnectedDevicesResponse, ConnectedDevicesResponse.Builder, ConnectedDevicesResponseOrBuilder> singleFieldBuilderV3 = this.connectedDevicesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.connectedDevicesResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConnectionAlertRegistrationRequest() {
                this.bitField0_ &= -5;
                this.connectionAlertRegistrationRequest_ = null;
                SingleFieldBuilderV3<ConnectionAlertRegistrationRequest, ConnectionAlertRegistrationRequest.Builder, ConnectionAlertRegistrationRequestOrBuilder> singleFieldBuilderV3 = this.connectionAlertRegistrationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.connectionAlertRegistrationRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConnectionAlertRegistrationResponse() {
                this.bitField0_ &= -9;
                this.connectionAlertRegistrationResponse_ = null;
                SingleFieldBuilderV3<ConnectionAlertRegistrationResponse, ConnectionAlertRegistrationResponse.Builder, ConnectionAlertRegistrationResponseOrBuilder> singleFieldBuilderV3 = this.connectionAlertRegistrationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.connectionAlertRegistrationResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearDeviceConnectedRequest() {
                this.bitField0_ &= -17;
                this.deviceConnectedRequest_ = null;
                SingleFieldBuilderV3<DevicesConnectedRequest, DevicesConnectedRequest.Builder, DevicesConnectedRequestOrBuilder> singleFieldBuilderV3 = this.deviceConnectedRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.deviceConnectedRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearDeviceConnectedResponse() {
                this.bitField0_ &= -33;
                this.deviceConnectedResponse_ = null;
                SingleFieldBuilderV3<DevicesConnectedResponse, DevicesConnectedResponse.Builder, DevicesConnectedResponseOrBuilder> singleFieldBuilderV3 = this.deviceConnectedResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.deviceConnectedResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearDeviceDisconnectedRequest() {
                this.bitField0_ &= -65;
                this.deviceDisconnectedRequest_ = null;
                SingleFieldBuilderV3<DevicesDisconnectedRequest, DevicesDisconnectedRequest.Builder, DevicesDisconnectedRequestOrBuilder> singleFieldBuilderV3 = this.deviceDisconnectedRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.deviceDisconnectedRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearDeviceDisconnectedResponse() {
                this.bitField0_ &= -129;
                this.deviceDisconnectedResponse_ = null;
                SingleFieldBuilderV3<DevicesDisconnectedResponse, DevicesDisconnectedResponse.Builder, DevicesDisconnectedResponseOrBuilder> singleFieldBuilderV3 = this.deviceDisconnectedResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.deviceDisconnectedResponseBuilder_ = null;
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

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
            public ConnectedDevicesRequest getConnectedDevicesRequest() {
                SingleFieldBuilderV3<ConnectedDevicesRequest, ConnectedDevicesRequest.Builder, ConnectedDevicesRequestOrBuilder> singleFieldBuilderV3 = this.connectedDevicesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectedDevicesRequest) singleFieldBuilderV3.getMessage();
                }
                ConnectedDevicesRequest connectedDevicesRequest = this.connectedDevicesRequest_;
                return connectedDevicesRequest == null ? ConnectedDevicesRequest.getDefaultInstance() : connectedDevicesRequest;
            }

            public ConnectedDevicesRequest.Builder getConnectedDevicesRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (ConnectedDevicesRequest.Builder) getConnectedDevicesRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
            public ConnectedDevicesRequestOrBuilder getConnectedDevicesRequestOrBuilder() {
                SingleFieldBuilderV3<ConnectedDevicesRequest, ConnectedDevicesRequest.Builder, ConnectedDevicesRequestOrBuilder> singleFieldBuilderV3 = this.connectedDevicesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectedDevicesRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConnectedDevicesRequest connectedDevicesRequest = this.connectedDevicesRequest_;
                return connectedDevicesRequest == null ? ConnectedDevicesRequest.getDefaultInstance() : connectedDevicesRequest;
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
            public ConnectedDevicesResponse getConnectedDevicesResponse() {
                SingleFieldBuilderV3<ConnectedDevicesResponse, ConnectedDevicesResponse.Builder, ConnectedDevicesResponseOrBuilder> singleFieldBuilderV3 = this.connectedDevicesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectedDevicesResponse) singleFieldBuilderV3.getMessage();
                }
                ConnectedDevicesResponse connectedDevicesResponse = this.connectedDevicesResponse_;
                return connectedDevicesResponse == null ? ConnectedDevicesResponse.getDefaultInstance() : connectedDevicesResponse;
            }

            public ConnectedDevicesResponse.Builder getConnectedDevicesResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (ConnectedDevicesResponse.Builder) getConnectedDevicesResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
            public ConnectedDevicesResponseOrBuilder getConnectedDevicesResponseOrBuilder() {
                SingleFieldBuilderV3<ConnectedDevicesResponse, ConnectedDevicesResponse.Builder, ConnectedDevicesResponseOrBuilder> singleFieldBuilderV3 = this.connectedDevicesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectedDevicesResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConnectedDevicesResponse connectedDevicesResponse = this.connectedDevicesResponse_;
                return connectedDevicesResponse == null ? ConnectedDevicesResponse.getDefaultInstance() : connectedDevicesResponse;
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
            public ConnectionAlertRegistrationRequest getConnectionAlertRegistrationRequest() {
                SingleFieldBuilderV3<ConnectionAlertRegistrationRequest, ConnectionAlertRegistrationRequest.Builder, ConnectionAlertRegistrationRequestOrBuilder> singleFieldBuilderV3 = this.connectionAlertRegistrationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectionAlertRegistrationRequest) singleFieldBuilderV3.getMessage();
                }
                ConnectionAlertRegistrationRequest connectionAlertRegistrationRequest = this.connectionAlertRegistrationRequest_;
                return connectionAlertRegistrationRequest == null ? ConnectionAlertRegistrationRequest.getDefaultInstance() : connectionAlertRegistrationRequest;
            }

            public ConnectionAlertRegistrationRequest.Builder getConnectionAlertRegistrationRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (ConnectionAlertRegistrationRequest.Builder) getConnectionAlertRegistrationRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
            public ConnectionAlertRegistrationRequestOrBuilder getConnectionAlertRegistrationRequestOrBuilder() {
                SingleFieldBuilderV3<ConnectionAlertRegistrationRequest, ConnectionAlertRegistrationRequest.Builder, ConnectionAlertRegistrationRequestOrBuilder> singleFieldBuilderV3 = this.connectionAlertRegistrationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectionAlertRegistrationRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConnectionAlertRegistrationRequest connectionAlertRegistrationRequest = this.connectionAlertRegistrationRequest_;
                return connectionAlertRegistrationRequest == null ? ConnectionAlertRegistrationRequest.getDefaultInstance() : connectionAlertRegistrationRequest;
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
            public ConnectionAlertRegistrationResponse getConnectionAlertRegistrationResponse() {
                SingleFieldBuilderV3<ConnectionAlertRegistrationResponse, ConnectionAlertRegistrationResponse.Builder, ConnectionAlertRegistrationResponseOrBuilder> singleFieldBuilderV3 = this.connectionAlertRegistrationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectionAlertRegistrationResponse) singleFieldBuilderV3.getMessage();
                }
                ConnectionAlertRegistrationResponse connectionAlertRegistrationResponse = this.connectionAlertRegistrationResponse_;
                return connectionAlertRegistrationResponse == null ? ConnectionAlertRegistrationResponse.getDefaultInstance() : connectionAlertRegistrationResponse;
            }

            public ConnectionAlertRegistrationResponse.Builder getConnectionAlertRegistrationResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (ConnectionAlertRegistrationResponse.Builder) getConnectionAlertRegistrationResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
            public ConnectionAlertRegistrationResponseOrBuilder getConnectionAlertRegistrationResponseOrBuilder() {
                SingleFieldBuilderV3<ConnectionAlertRegistrationResponse, ConnectionAlertRegistrationResponse.Builder, ConnectionAlertRegistrationResponseOrBuilder> singleFieldBuilderV3 = this.connectionAlertRegistrationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConnectionAlertRegistrationResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConnectionAlertRegistrationResponse connectionAlertRegistrationResponse = this.connectionAlertRegistrationResponse_;
                return connectionAlertRegistrationResponse == null ? ConnectionAlertRegistrationResponse.getDefaultInstance() : connectionAlertRegistrationResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
            public DevicesConnectedRequest getDeviceConnectedRequest() {
                SingleFieldBuilderV3<DevicesConnectedRequest, DevicesConnectedRequest.Builder, DevicesConnectedRequestOrBuilder> singleFieldBuilderV3 = this.deviceConnectedRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DevicesConnectedRequest) singleFieldBuilderV3.getMessage();
                }
                DevicesConnectedRequest devicesConnectedRequest = this.deviceConnectedRequest_;
                return devicesConnectedRequest == null ? DevicesConnectedRequest.getDefaultInstance() : devicesConnectedRequest;
            }

            public DevicesConnectedRequest.Builder getDeviceConnectedRequestBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (DevicesConnectedRequest.Builder) getDeviceConnectedRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
            public DevicesConnectedRequestOrBuilder getDeviceConnectedRequestOrBuilder() {
                SingleFieldBuilderV3<DevicesConnectedRequest, DevicesConnectedRequest.Builder, DevicesConnectedRequestOrBuilder> singleFieldBuilderV3 = this.deviceConnectedRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DevicesConnectedRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DevicesConnectedRequest devicesConnectedRequest = this.deviceConnectedRequest_;
                return devicesConnectedRequest == null ? DevicesConnectedRequest.getDefaultInstance() : devicesConnectedRequest;
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
            public DevicesConnectedResponse getDeviceConnectedResponse() {
                SingleFieldBuilderV3<DevicesConnectedResponse, DevicesConnectedResponse.Builder, DevicesConnectedResponseOrBuilder> singleFieldBuilderV3 = this.deviceConnectedResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DevicesConnectedResponse) singleFieldBuilderV3.getMessage();
                }
                DevicesConnectedResponse devicesConnectedResponse = this.deviceConnectedResponse_;
                return devicesConnectedResponse == null ? DevicesConnectedResponse.getDefaultInstance() : devicesConnectedResponse;
            }

            public DevicesConnectedResponse.Builder getDeviceConnectedResponseBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (DevicesConnectedResponse.Builder) getDeviceConnectedResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
            public DevicesConnectedResponseOrBuilder getDeviceConnectedResponseOrBuilder() {
                SingleFieldBuilderV3<DevicesConnectedResponse, DevicesConnectedResponse.Builder, DevicesConnectedResponseOrBuilder> singleFieldBuilderV3 = this.deviceConnectedResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DevicesConnectedResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DevicesConnectedResponse devicesConnectedResponse = this.deviceConnectedResponse_;
                return devicesConnectedResponse == null ? DevicesConnectedResponse.getDefaultInstance() : devicesConnectedResponse;
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
            public DevicesDisconnectedRequest getDeviceDisconnectedRequest() {
                SingleFieldBuilderV3<DevicesDisconnectedRequest, DevicesDisconnectedRequest.Builder, DevicesDisconnectedRequestOrBuilder> singleFieldBuilderV3 = this.deviceDisconnectedRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DevicesDisconnectedRequest) singleFieldBuilderV3.getMessage();
                }
                DevicesDisconnectedRequest devicesDisconnectedRequest = this.deviceDisconnectedRequest_;
                return devicesDisconnectedRequest == null ? DevicesDisconnectedRequest.getDefaultInstance() : devicesDisconnectedRequest;
            }

            public DevicesDisconnectedRequest.Builder getDeviceDisconnectedRequestBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (DevicesDisconnectedRequest.Builder) getDeviceDisconnectedRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
            public DevicesDisconnectedRequestOrBuilder getDeviceDisconnectedRequestOrBuilder() {
                SingleFieldBuilderV3<DevicesDisconnectedRequest, DevicesDisconnectedRequest.Builder, DevicesDisconnectedRequestOrBuilder> singleFieldBuilderV3 = this.deviceDisconnectedRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DevicesDisconnectedRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DevicesDisconnectedRequest devicesDisconnectedRequest = this.deviceDisconnectedRequest_;
                return devicesDisconnectedRequest == null ? DevicesDisconnectedRequest.getDefaultInstance() : devicesDisconnectedRequest;
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
            public DevicesDisconnectedResponse getDeviceDisconnectedResponse() {
                SingleFieldBuilderV3<DevicesDisconnectedResponse, DevicesDisconnectedResponse.Builder, DevicesDisconnectedResponseOrBuilder> singleFieldBuilderV3 = this.deviceDisconnectedResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DevicesDisconnectedResponse) singleFieldBuilderV3.getMessage();
                }
                DevicesDisconnectedResponse devicesDisconnectedResponse = this.deviceDisconnectedResponse_;
                return devicesDisconnectedResponse == null ? DevicesDisconnectedResponse.getDefaultInstance() : devicesDisconnectedResponse;
            }

            public DevicesDisconnectedResponse.Builder getDeviceDisconnectedResponseBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (DevicesDisconnectedResponse.Builder) getDeviceDisconnectedResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
            public DevicesDisconnectedResponseOrBuilder getDeviceDisconnectedResponseOrBuilder() {
                SingleFieldBuilderV3<DevicesDisconnectedResponse, DevicesDisconnectedResponse.Builder, DevicesDisconnectedResponseOrBuilder> singleFieldBuilderV3 = this.deviceDisconnectedResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DevicesDisconnectedResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DevicesDisconnectedResponse devicesDisconnectedResponse = this.deviceDisconnectedResponse_;
                return devicesDisconnectedResponse == null ? DevicesDisconnectedResponse.getDefaultInstance() : devicesDisconnectedResponse;
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
            public boolean hasConnectedDevicesRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
            public boolean hasConnectedDevicesResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
            public boolean hasConnectionAlertRegistrationRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
            public boolean hasConnectionAlertRegistrationResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
            public boolean hasDeviceConnectedRequest() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
            public boolean hasDeviceConnectedResponse() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
            public boolean hasDeviceDisconnectedRequest() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIConnectedDevicesReporting.ServiceOrBuilder
            public boolean hasDeviceDisconnectedResponse() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIConnectedDevicesReporting.internal_static_GDI_Proto_ConnectedDevicesReporting_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeConnectedDevicesRequest(ConnectedDevicesRequest connectedDevicesRequest) {
                ConnectedDevicesRequest connectedDevicesRequest2;
                SingleFieldBuilderV3<ConnectedDevicesRequest, ConnectedDevicesRequest.Builder, ConnectedDevicesRequestOrBuilder> singleFieldBuilderV3 = this.connectedDevicesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(connectedDevicesRequest);
                } else if ((this.bitField0_ & 1) == 0 || (connectedDevicesRequest2 = this.connectedDevicesRequest_) == null || connectedDevicesRequest2 == ConnectedDevicesRequest.getDefaultInstance()) {
                    this.connectedDevicesRequest_ = connectedDevicesRequest;
                } else {
                    getConnectedDevicesRequestBuilder().mergeFrom(connectedDevicesRequest);
                }
                if (this.connectedDevicesRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConnectedDevicesResponse(ConnectedDevicesResponse connectedDevicesResponse) {
                ConnectedDevicesResponse connectedDevicesResponse2;
                SingleFieldBuilderV3<ConnectedDevicesResponse, ConnectedDevicesResponse.Builder, ConnectedDevicesResponseOrBuilder> singleFieldBuilderV3 = this.connectedDevicesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(connectedDevicesResponse);
                } else if ((this.bitField0_ & 2) == 0 || (connectedDevicesResponse2 = this.connectedDevicesResponse_) == null || connectedDevicesResponse2 == ConnectedDevicesResponse.getDefaultInstance()) {
                    this.connectedDevicesResponse_ = connectedDevicesResponse;
                } else {
                    getConnectedDevicesResponseBuilder().mergeFrom(connectedDevicesResponse);
                }
                if (this.connectedDevicesResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConnectionAlertRegistrationRequest(ConnectionAlertRegistrationRequest connectionAlertRegistrationRequest) {
                ConnectionAlertRegistrationRequest connectionAlertRegistrationRequest2;
                SingleFieldBuilderV3<ConnectionAlertRegistrationRequest, ConnectionAlertRegistrationRequest.Builder, ConnectionAlertRegistrationRequestOrBuilder> singleFieldBuilderV3 = this.connectionAlertRegistrationRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(connectionAlertRegistrationRequest);
                } else if ((this.bitField0_ & 4) == 0 || (connectionAlertRegistrationRequest2 = this.connectionAlertRegistrationRequest_) == null || connectionAlertRegistrationRequest2 == ConnectionAlertRegistrationRequest.getDefaultInstance()) {
                    this.connectionAlertRegistrationRequest_ = connectionAlertRegistrationRequest;
                } else {
                    getConnectionAlertRegistrationRequestBuilder().mergeFrom(connectionAlertRegistrationRequest);
                }
                if (this.connectionAlertRegistrationRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConnectionAlertRegistrationResponse(ConnectionAlertRegistrationResponse connectionAlertRegistrationResponse) {
                ConnectionAlertRegistrationResponse connectionAlertRegistrationResponse2;
                SingleFieldBuilderV3<ConnectionAlertRegistrationResponse, ConnectionAlertRegistrationResponse.Builder, ConnectionAlertRegistrationResponseOrBuilder> singleFieldBuilderV3 = this.connectionAlertRegistrationResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(connectionAlertRegistrationResponse);
                } else if ((this.bitField0_ & 8) == 0 || (connectionAlertRegistrationResponse2 = this.connectionAlertRegistrationResponse_) == null || connectionAlertRegistrationResponse2 == ConnectionAlertRegistrationResponse.getDefaultInstance()) {
                    this.connectionAlertRegistrationResponse_ = connectionAlertRegistrationResponse;
                } else {
                    getConnectionAlertRegistrationResponseBuilder().mergeFrom(connectionAlertRegistrationResponse);
                }
                if (this.connectionAlertRegistrationResponse_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeDeviceConnectedRequest(DevicesConnectedRequest devicesConnectedRequest) {
                DevicesConnectedRequest devicesConnectedRequest2;
                SingleFieldBuilderV3<DevicesConnectedRequest, DevicesConnectedRequest.Builder, DevicesConnectedRequestOrBuilder> singleFieldBuilderV3 = this.deviceConnectedRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(devicesConnectedRequest);
                } else if ((this.bitField0_ & 16) == 0 || (devicesConnectedRequest2 = this.deviceConnectedRequest_) == null || devicesConnectedRequest2 == DevicesConnectedRequest.getDefaultInstance()) {
                    this.deviceConnectedRequest_ = devicesConnectedRequest;
                } else {
                    getDeviceConnectedRequestBuilder().mergeFrom(devicesConnectedRequest);
                }
                if (this.deviceConnectedRequest_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeDeviceConnectedResponse(DevicesConnectedResponse devicesConnectedResponse) {
                DevicesConnectedResponse devicesConnectedResponse2;
                SingleFieldBuilderV3<DevicesConnectedResponse, DevicesConnectedResponse.Builder, DevicesConnectedResponseOrBuilder> singleFieldBuilderV3 = this.deviceConnectedResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(devicesConnectedResponse);
                } else if ((this.bitField0_ & 32) == 0 || (devicesConnectedResponse2 = this.deviceConnectedResponse_) == null || devicesConnectedResponse2 == DevicesConnectedResponse.getDefaultInstance()) {
                    this.deviceConnectedResponse_ = devicesConnectedResponse;
                } else {
                    getDeviceConnectedResponseBuilder().mergeFrom(devicesConnectedResponse);
                }
                if (this.deviceConnectedResponse_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeDeviceDisconnectedRequest(DevicesDisconnectedRequest devicesDisconnectedRequest) {
                DevicesDisconnectedRequest devicesDisconnectedRequest2;
                SingleFieldBuilderV3<DevicesDisconnectedRequest, DevicesDisconnectedRequest.Builder, DevicesDisconnectedRequestOrBuilder> singleFieldBuilderV3 = this.deviceDisconnectedRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(devicesDisconnectedRequest);
                } else if ((this.bitField0_ & 64) == 0 || (devicesDisconnectedRequest2 = this.deviceDisconnectedRequest_) == null || devicesDisconnectedRequest2 == DevicesDisconnectedRequest.getDefaultInstance()) {
                    this.deviceDisconnectedRequest_ = devicesDisconnectedRequest;
                } else {
                    getDeviceDisconnectedRequestBuilder().mergeFrom(devicesDisconnectedRequest);
                }
                if (this.deviceDisconnectedRequest_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeDeviceDisconnectedResponse(DevicesDisconnectedResponse devicesDisconnectedResponse) {
                DevicesDisconnectedResponse devicesDisconnectedResponse2;
                SingleFieldBuilderV3<DevicesDisconnectedResponse, DevicesDisconnectedResponse.Builder, DevicesDisconnectedResponseOrBuilder> singleFieldBuilderV3 = this.deviceDisconnectedResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(devicesDisconnectedResponse);
                } else if ((this.bitField0_ & 128) == 0 || (devicesDisconnectedResponse2 = this.deviceDisconnectedResponse_) == null || devicesDisconnectedResponse2 == DevicesDisconnectedResponse.getDefaultInstance()) {
                    this.deviceDisconnectedResponse_ = devicesDisconnectedResponse;
                } else {
                    getDeviceDisconnectedResponseBuilder().mergeFrom(devicesDisconnectedResponse);
                }
                if (this.deviceDisconnectedResponse_ != null) {
                    this.bitField0_ |= 128;
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
                                    codedInputStream.readMessage(getConnectedDevicesRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getConnectedDevicesResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getConnectionAlertRegistrationRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getConnectionAlertRegistrationResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(getDeviceConnectedRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                } else if (tag == 50) {
                                    codedInputStream.readMessage(getDeviceConnectedResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                } else if (tag == 58) {
                                    codedInputStream.readMessage(getDeviceDisconnectedRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                } else if (tag == 66) {
                                    codedInputStream.readMessage(getDeviceDisconnectedResponseFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setConnectedDevicesRequest(ConnectedDevicesRequest.Builder builder) {
                SingleFieldBuilderV3<ConnectedDevicesRequest, ConnectedDevicesRequest.Builder, ConnectedDevicesRequestOrBuilder> singleFieldBuilderV3 = this.connectedDevicesRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.connectedDevicesRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setConnectedDevicesResponse(ConnectedDevicesResponse.Builder builder) {
                SingleFieldBuilderV3<ConnectedDevicesResponse, ConnectedDevicesResponse.Builder, ConnectedDevicesResponseOrBuilder> singleFieldBuilderV3 = this.connectedDevicesResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.connectedDevicesResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setConnectionAlertRegistrationRequest(ConnectionAlertRegistrationRequest.Builder builder) {
                SingleFieldBuilderV3<ConnectionAlertRegistrationRequest, ConnectionAlertRegistrationRequest.Builder, ConnectionAlertRegistrationRequestOrBuilder> singleFieldBuilderV3 = this.connectionAlertRegistrationRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.connectionAlertRegistrationRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setConnectionAlertRegistrationResponse(ConnectionAlertRegistrationResponse.Builder builder) {
                SingleFieldBuilderV3<ConnectionAlertRegistrationResponse, ConnectionAlertRegistrationResponse.Builder, ConnectionAlertRegistrationResponseOrBuilder> singleFieldBuilderV3 = this.connectionAlertRegistrationResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.connectionAlertRegistrationResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setDeviceConnectedRequest(DevicesConnectedRequest.Builder builder) {
                SingleFieldBuilderV3<DevicesConnectedRequest, DevicesConnectedRequest.Builder, DevicesConnectedRequestOrBuilder> singleFieldBuilderV3 = this.deviceConnectedRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.deviceConnectedRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setDeviceConnectedResponse(DevicesConnectedResponse.Builder builder) {
                SingleFieldBuilderV3<DevicesConnectedResponse, DevicesConnectedResponse.Builder, DevicesConnectedResponseOrBuilder> singleFieldBuilderV3 = this.deviceConnectedResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.deviceConnectedResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setDeviceDisconnectedRequest(DevicesDisconnectedRequest.Builder builder) {
                SingleFieldBuilderV3<DevicesDisconnectedRequest, DevicesDisconnectedRequest.Builder, DevicesDisconnectedRequestOrBuilder> singleFieldBuilderV3 = this.deviceDisconnectedRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.deviceDisconnectedRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setDeviceDisconnectedResponse(DevicesDisconnectedResponse.Builder builder) {
                SingleFieldBuilderV3<DevicesDisconnectedResponse, DevicesDisconnectedResponse.Builder, DevicesDisconnectedResponseOrBuilder> singleFieldBuilderV3 = this.deviceDisconnectedResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.deviceDisconnectedResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 128;
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

            public Builder setConnectedDevicesRequest(ConnectedDevicesRequest connectedDevicesRequest) {
                SingleFieldBuilderV3<ConnectedDevicesRequest, ConnectedDevicesRequest.Builder, ConnectedDevicesRequestOrBuilder> singleFieldBuilderV3 = this.connectedDevicesRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    connectedDevicesRequest.getClass();
                    this.connectedDevicesRequest_ = connectedDevicesRequest;
                } else {
                    singleFieldBuilderV3.setMessage(connectedDevicesRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setConnectedDevicesResponse(ConnectedDevicesResponse connectedDevicesResponse) {
                SingleFieldBuilderV3<ConnectedDevicesResponse, ConnectedDevicesResponse.Builder, ConnectedDevicesResponseOrBuilder> singleFieldBuilderV3 = this.connectedDevicesResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    connectedDevicesResponse.getClass();
                    this.connectedDevicesResponse_ = connectedDevicesResponse;
                } else {
                    singleFieldBuilderV3.setMessage(connectedDevicesResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setConnectionAlertRegistrationRequest(ConnectionAlertRegistrationRequest connectionAlertRegistrationRequest) {
                SingleFieldBuilderV3<ConnectionAlertRegistrationRequest, ConnectionAlertRegistrationRequest.Builder, ConnectionAlertRegistrationRequestOrBuilder> singleFieldBuilderV3 = this.connectionAlertRegistrationRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    connectionAlertRegistrationRequest.getClass();
                    this.connectionAlertRegistrationRequest_ = connectionAlertRegistrationRequest;
                } else {
                    singleFieldBuilderV3.setMessage(connectionAlertRegistrationRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setConnectionAlertRegistrationResponse(ConnectionAlertRegistrationResponse connectionAlertRegistrationResponse) {
                SingleFieldBuilderV3<ConnectionAlertRegistrationResponse, ConnectionAlertRegistrationResponse.Builder, ConnectionAlertRegistrationResponseOrBuilder> singleFieldBuilderV3 = this.connectionAlertRegistrationResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    connectionAlertRegistrationResponse.getClass();
                    this.connectionAlertRegistrationResponse_ = connectionAlertRegistrationResponse;
                } else {
                    singleFieldBuilderV3.setMessage(connectionAlertRegistrationResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setDeviceConnectedRequest(DevicesConnectedRequest devicesConnectedRequest) {
                SingleFieldBuilderV3<DevicesConnectedRequest, DevicesConnectedRequest.Builder, DevicesConnectedRequestOrBuilder> singleFieldBuilderV3 = this.deviceConnectedRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    devicesConnectedRequest.getClass();
                    this.deviceConnectedRequest_ = devicesConnectedRequest;
                } else {
                    singleFieldBuilderV3.setMessage(devicesConnectedRequest);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setDeviceConnectedResponse(DevicesConnectedResponse devicesConnectedResponse) {
                SingleFieldBuilderV3<DevicesConnectedResponse, DevicesConnectedResponse.Builder, DevicesConnectedResponseOrBuilder> singleFieldBuilderV3 = this.deviceConnectedResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    devicesConnectedResponse.getClass();
                    this.deviceConnectedResponse_ = devicesConnectedResponse;
                } else {
                    singleFieldBuilderV3.setMessage(devicesConnectedResponse);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setDeviceDisconnectedRequest(DevicesDisconnectedRequest devicesDisconnectedRequest) {
                SingleFieldBuilderV3<DevicesDisconnectedRequest, DevicesDisconnectedRequest.Builder, DevicesDisconnectedRequestOrBuilder> singleFieldBuilderV3 = this.deviceDisconnectedRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    devicesDisconnectedRequest.getClass();
                    this.deviceDisconnectedRequest_ = devicesDisconnectedRequest;
                } else {
                    singleFieldBuilderV3.setMessage(devicesDisconnectedRequest);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setDeviceDisconnectedResponse(DevicesDisconnectedResponse devicesDisconnectedResponse) {
                SingleFieldBuilderV3<DevicesDisconnectedResponse, DevicesDisconnectedResponse.Builder, DevicesDisconnectedResponseOrBuilder> singleFieldBuilderV3 = this.deviceDisconnectedResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    devicesDisconnectedResponse.getClass();
                    this.deviceDisconnectedResponse_ = devicesDisconnectedResponse;
                } else {
                    singleFieldBuilderV3.setMessage(devicesDisconnectedResponse);
                }
                this.bitField0_ |= 128;
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
                if (service.hasConnectedDevicesRequest()) {
                    mergeConnectedDevicesRequest(service.getConnectedDevicesRequest());
                }
                if (service.hasConnectedDevicesResponse()) {
                    mergeConnectedDevicesResponse(service.getConnectedDevicesResponse());
                }
                if (service.hasConnectionAlertRegistrationRequest()) {
                    mergeConnectionAlertRegistrationRequest(service.getConnectionAlertRegistrationRequest());
                }
                if (service.hasConnectionAlertRegistrationResponse()) {
                    mergeConnectionAlertRegistrationResponse(service.getConnectionAlertRegistrationResponse());
                }
                if (service.hasDeviceConnectedRequest()) {
                    mergeDeviceConnectedRequest(service.getDeviceConnectedRequest());
                }
                if (service.hasDeviceConnectedResponse()) {
                    mergeDeviceConnectedResponse(service.getDeviceConnectedResponse());
                }
                if (service.hasDeviceDisconnectedRequest()) {
                    mergeDeviceDisconnectedRequest(service.getDeviceDisconnectedRequest());
                }
                if (service.hasDeviceDisconnectedResponse()) {
                    mergeDeviceDisconnectedResponse(service.getDeviceDisconnectedResponse());
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
}
