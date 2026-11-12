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

/* JADX INFO: loaded from: classes4.dex */
public final class GDIGarminConnect {
    public static final int REQUEST_GARMIN_CONNECT_CAPABILITES_FIELD_NUMBER = 11;
    public static final int RESPONSE_GARMIN_CONNECT_CAPABILITES_FIELD_NUMBER = 11;
    private static Descriptors.FileDescriptor descriptor;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GarminConnect_CheckDownloadQueueRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GarminConnect_CheckDownloadQueueRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GarminConnect_CheckDownloadQueueResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GarminConnect_CheckDownloadQueueResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GarminConnect_ClientFeatureCapabilities_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GarminConnect_ClientFeatureCapabilities_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GarminConnect_ContactsUpdateRequestNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GarminConnect_ContactsUpdateRequestNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GarminConnect_CutWellnessFilesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GarminConnect_CutWellnessFilesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GarminConnect_CutWellnessFilesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GarminConnect_CutWellnessFilesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GarminConnect_LifestyleLoggingUpdateRequestNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GarminConnect_LifestyleLoggingUpdateRequestNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GarminConnect_ServerFeatureCapabilities_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GarminConnect_ServerFeatureCapabilities_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GarminConnect_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GarminConnect_Service_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GarminConnect_WellnessThresholdMetNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GarminConnect_WellnessThresholdMetNotification_fieldAccessorTable;
    public static final GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesRequest, ClientFeatureCapabilities> requestGarminConnectCapabilites;
    public static final GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesResponse, ServerFeatureCapabilities> responseGarminConnectCapabilites;

    public interface CheckDownloadQueueRequestOrBuilder extends MessageOrBuilder {
        boolean getForceBetaSoftwareUpdateCheck();

        Priority getPriority();

        boolean hasForceBetaSoftwareUpdateCheck();

        boolean hasPriority();
    }

    public interface CheckDownloadQueueResponseOrBuilder extends MessageOrBuilder {
        CheckDownloadQueueResponse.Status getStatus();

        boolean hasStatus();
    }

    public interface ClientFeatureCapabilitiesOrBuilder extends MessageOrBuilder {
        int getVersion();

        boolean getWellnessThresholdMetSupport();

        boolean hasVersion();

        boolean hasWellnessThresholdMetSupport();
    }

    public interface ContactsUpdateRequestNotificationOrBuilder extends MessageOrBuilder {
    }

    public interface CutWellnessFilesRequestOrBuilder extends MessageOrBuilder {
        Priority getPriority();

        boolean hasPriority();
    }

    public interface CutWellnessFilesResponseOrBuilder extends MessageOrBuilder {
        CutWellnessFilesResponse.Status getStatus();

        boolean hasStatus();
    }

    public interface LifestyleLoggingUpdateRequestNotificationOrBuilder extends MessageOrBuilder {
    }

    public interface ServerFeatureCapabilitiesOrBuilder extends MessageOrBuilder {
        boolean getLifestyleLoggingSupport();

        boolean getWellnessSupport();

        boolean hasLifestyleLoggingSupport();

        boolean hasWellnessSupport();
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
        CheckDownloadQueueRequest getCheckDownloadQueueRequest();

        CheckDownloadQueueRequestOrBuilder getCheckDownloadQueueRequestOrBuilder();

        CheckDownloadQueueResponse getCheckDownloadQueueResponse();

        CheckDownloadQueueResponseOrBuilder getCheckDownloadQueueResponseOrBuilder();

        ContactsUpdateRequestNotification getContactsUpdateRequestNotification();

        ContactsUpdateRequestNotificationOrBuilder getContactsUpdateRequestNotificationOrBuilder();

        CutWellnessFilesRequest getCutWellnessFilesRequest();

        CutWellnessFilesRequestOrBuilder getCutWellnessFilesRequestOrBuilder();

        CutWellnessFilesResponse getCutWellnessFilesResponse();

        CutWellnessFilesResponseOrBuilder getCutWellnessFilesResponseOrBuilder();

        LifestyleLoggingUpdateRequestNotification getLifestyleLoggingUpdateRequestNotification();

        LifestyleLoggingUpdateRequestNotificationOrBuilder getLifestyleLoggingUpdateRequestNotificationOrBuilder();

        WellnessThresholdMetNotification getWellnessThresholdMetNotification();

        WellnessThresholdMetNotificationOrBuilder getWellnessThresholdMetNotificationOrBuilder();

        boolean hasCheckDownloadQueueRequest();

        boolean hasCheckDownloadQueueResponse();

        boolean hasContactsUpdateRequestNotification();

        boolean hasCutWellnessFilesRequest();

        boolean hasCutWellnessFilesResponse();

        boolean hasLifestyleLoggingUpdateRequestNotification();

        boolean hasWellnessThresholdMetNotification();
    }

    public interface WellnessThresholdMetNotificationOrBuilder extends MessageOrBuilder {
    }

    static {
        GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesRequest, ClientFeatureCapabilities> generatedExtensionNewFileScopedGeneratedExtension = GeneratedMessage.newFileScopedGeneratedExtension(ClientFeatureCapabilities.class, ClientFeatureCapabilities.getDefaultInstance());
        requestGarminConnectCapabilites = generatedExtensionNewFileScopedGeneratedExtension;
        GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesResponse, ServerFeatureCapabilities> generatedExtensionNewFileScopedGeneratedExtension2 = GeneratedMessage.newFileScopedGeneratedExtension(ServerFeatureCapabilities.class, ServerFeatureCapabilities.getDefaultInstance());
        responseGarminConnectCapabilites = generatedExtensionNewFileScopedGeneratedExtension2;
        descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0016GDIGarminConnect.proto\u0012\u0017GDI.Proto.GarminConnect\u001a\rGDICore.proto\"T\n\u0019ClientFeatureCapabilities\u0012\u000f\n\u0007version\u0018\u0001 \u0001(\r\u0012&\n\u001ewellness_threshold_met_support\u0018\u0002 \u0001(\b\"X\n\u0019ServerFeatureCapabilities\u0012\u0018\n\u0010wellness_support\u0018\u0002 \u0001(\b\u0012!\n\u0019lifestyle_logging_support\u0018\u0003 \u0001(\b\"º\u0005\n\u0007Service\u0012X\n\u001ccheck_download_queue_request\u0018\u0001 \u0001(\u000b22.GDI.Proto.GarminConnect.CheckDownloadQueueRequest\u0012Z\n\u001dcheck_download_queue_response\u0018\u0002 \u0001(\u000b23.GDI.Proto.GarminConnect.CheckDownloadQueueResponse\u0012T\n\u001acut_wellness_files_request\u0018\u0003 \u0001(\u000b20.GDI.Proto.GarminConnect.CutWellnessFilesRequest\u0012V\n\u001bcut_wellness_files_response\u0018\u0004 \u0001(\u000b21.GDI.Proto.GarminConnect.CutWellnessFilesResponse\u0012f\n#wellness_threshold_met_notification\u0018\u0005 \u0001(\u000b29.GDI.Proto.GarminConnect.WellnessThresholdMetNotification\u0012h\n$contacts_update_request_notification\u0018\u0006 \u0001(\u000b2:.GDI.Proto.GarminConnect.ContactsUpdateRequestNotification\u0012y\n-lifestyle_logging_update_request_notification\u0018\u0007 \u0001(\u000b2B.GDI.Proto.GarminConnect.LifestyleLoggingUpdateRequestNotification\"\u0084\u0001\n\u0019CheckDownloadQueueRequest\u0012=\n\bpriority\u0018\u0001 \u0001(\u000e2!.GDI.Proto.GarminConnect.Priority:\bSTANDARD\u0012(\n force_beta_software_update_check\u0018\u0002 \u0001(\b\"\u0099\u0001\n\u001aCheckDownloadQueueResponse\u0012J\n\u0006status\u0018\u0001 \u0001(\u000e2:.GDI.Proto.GarminConnect.CheckDownloadQueueResponse.Status\"/\n\u0006Status\u0012\u000b\n\u0007SUCCESS\u0010\u0000\u0012\u0018\n\u0014FAIL_NO_CONNECTIVITY\u0010\u0001\"X\n\u0017CutWellnessFilesRequest\u0012=\n\bpriority\u0018\u0001 \u0001(\u000e2!.GDI.Proto.GarminConnect.Priority:\bSTANDARD\"\u009b\u0001\n\u0018CutWellnessFilesResponse\u0012H\n\u0006status\u0018\u0001 \u0001(\u000e28.GDI.Proto.GarminConnect.CutWellnessFilesResponse.Status\"5\n\u0006Status\u0012\u000b\n\u0007SUCCESS\u0010\u0000\u0012\u000b\n\u0007IGNORED\u0010\u0001\u0012\u0011\n\rNOT_SUPPORTED\u0010\u0002\"\"\n WellnessThresholdMetNotification\"#\n!ContactsUpdateRequestNotification\"+\n)LifestyleLoggingUpdateRequestNotification*,\n\bPriority\u0012\f\n\bSTANDARD\u0010\u0000\u0012\u0012\n\u000eUSER_INITIATED\u0010\u0001:\u008a\u0001\n\"request_garmin_connect_capabilites\u0012*.GDI.Proto.Core.FeatureCapabilitiesRequest\u0018\u000b \u0001(\u000b22.GDI.Proto.GarminConnect.ClientFeatureCapabilities:\u008c\u0001\n#response_garmin_connect_capabilites\u0012+.GDI.Proto.Core.FeatureCapabilitiesResponse\u0018\u000b \u0001(\u000b22.GDI.Proto.GarminConnect.ServerFeatureCapabilitiesB0\n\u001acom.garmin.proto.generatedB\u0010GDIGarminConnectH\u0003"}, new Descriptors.FileDescriptor[]{GDICore.getDescriptor()});
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_GarminConnect_ClientFeatureCapabilities_descriptor = descriptor2;
        internal_static_GDI_Proto_GarminConnect_ClientFeatureCapabilities_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Version", "WellnessThresholdMetSupport"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_GarminConnect_ServerFeatureCapabilities_descriptor = descriptor3;
        internal_static_GDI_Proto_GarminConnect_ServerFeatureCapabilities_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"WellnessSupport", "LifestyleLoggingSupport"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_GarminConnect_Service_descriptor = descriptor4;
        internal_static_GDI_Proto_GarminConnect_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"CheckDownloadQueueRequest", "CheckDownloadQueueResponse", "CutWellnessFilesRequest", "CutWellnessFilesResponse", "WellnessThresholdMetNotification", "ContactsUpdateRequestNotification", "LifestyleLoggingUpdateRequestNotification"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_GarminConnect_CheckDownloadQueueRequest_descriptor = descriptor5;
        internal_static_GDI_Proto_GarminConnect_CheckDownloadQueueRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Priority", "ForceBetaSoftwareUpdateCheck"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_GarminConnect_CheckDownloadQueueResponse_descriptor = descriptor6;
        internal_static_GDI_Proto_GarminConnect_CheckDownloadQueueResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Status"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_GarminConnect_CutWellnessFilesRequest_descriptor = descriptor7;
        internal_static_GDI_Proto_GarminConnect_CutWellnessFilesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Priority"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_GarminConnect_CutWellnessFilesResponse_descriptor = descriptor8;
        internal_static_GDI_Proto_GarminConnect_CutWellnessFilesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Status"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_GarminConnect_WellnessThresholdMetNotification_descriptor = descriptor9;
        internal_static_GDI_Proto_GarminConnect_WellnessThresholdMetNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[0]);
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_GDI_Proto_GarminConnect_ContactsUpdateRequestNotification_descriptor = descriptor10;
        internal_static_GDI_Proto_GarminConnect_ContactsUpdateRequestNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[0]);
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(9);
        internal_static_GDI_Proto_GarminConnect_LifestyleLoggingUpdateRequestNotification_descriptor = descriptor11;
        internal_static_GDI_Proto_GarminConnect_LifestyleLoggingUpdateRequestNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[0]);
        generatedExtensionNewFileScopedGeneratedExtension.internalInit(descriptor.getExtensions().get(0));
        generatedExtensionNewFileScopedGeneratedExtension2.internalInit(descriptor.getExtensions().get(1));
        GDICore.getDescriptor();
    }

    private GDIGarminConnect() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(requestGarminConnectCapabilites);
        extensionRegistryLite.add(responseGarminConnectCapabilites);
    }

    public static final class ClientFeatureCapabilities extends GeneratedMessageV3 implements ClientFeatureCapabilitiesOrBuilder {
        private static final ClientFeatureCapabilities DEFAULT_INSTANCE = new ClientFeatureCapabilities();

        @Deprecated
        public static final Parser<ClientFeatureCapabilities> PARSER = new AbstractParser<ClientFeatureCapabilities>() { // from class: com.garmin.proto.generated.GDIGarminConnect.ClientFeatureCapabilities.1
            @Override // com.google.protobuf.Parser
            public ClientFeatureCapabilities parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ClientFeatureCapabilities.newBuilder();
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
        public static final int VERSION_FIELD_NUMBER = 1;
        public static final int WELLNESS_THRESHOLD_MET_SUPPORT_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int version_;
        private boolean wellnessThresholdMetSupport_;

        private ClientFeatureCapabilities(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.version_ = 0;
            this.wellnessThresholdMetSupport_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ClientFeatureCapabilities getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_ClientFeatureCapabilities_descriptor;
        }

        public static Builder newBuilder(ClientFeatureCapabilities clientFeatureCapabilities) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(clientFeatureCapabilities);
        }

        public static ClientFeatureCapabilities parseDelimitedFrom(InputStream inputStream) {
            return (ClientFeatureCapabilities) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ClientFeatureCapabilities parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ClientFeatureCapabilities> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ClientFeatureCapabilities)) {
                return super.equals(obj);
            }
            ClientFeatureCapabilities clientFeatureCapabilities = (ClientFeatureCapabilities) obj;
            if (hasVersion() != clientFeatureCapabilities.hasVersion()) {
                return false;
            }
            if ((!hasVersion() || getVersion() == clientFeatureCapabilities.getVersion()) && hasWellnessThresholdMetSupport() == clientFeatureCapabilities.hasWellnessThresholdMetSupport()) {
                return (!hasWellnessThresholdMetSupport() || getWellnessThresholdMetSupport() == clientFeatureCapabilities.getWellnessThresholdMetSupport()) && getUnknownFields().equals(clientFeatureCapabilities.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ClientFeatureCapabilities> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.version_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(2, this.wellnessThresholdMetSupport_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGarminConnect.ClientFeatureCapabilitiesOrBuilder
        public int getVersion() {
            return this.version_;
        }

        @Override // com.garmin.proto.generated.GDIGarminConnect.ClientFeatureCapabilitiesOrBuilder
        public boolean getWellnessThresholdMetSupport() {
            return this.wellnessThresholdMetSupport_;
        }

        @Override // com.garmin.proto.generated.GDIGarminConnect.ClientFeatureCapabilitiesOrBuilder
        public boolean hasVersion() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminConnect.ClientFeatureCapabilitiesOrBuilder
        public boolean hasWellnessThresholdMetSupport() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasVersion()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getVersion();
            }
            if (hasWellnessThresholdMetSupport()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getWellnessThresholdMetSupport());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_ClientFeatureCapabilities_fieldAccessorTable.ensureFieldAccessorsInitialized(ClientFeatureCapabilities.class, Builder.class);
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
            return new ClientFeatureCapabilities();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.version_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.wellnessThresholdMetSupport_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ClientFeatureCapabilitiesOrBuilder {
            private int bitField0_;
            private int version_;
            private boolean wellnessThresholdMetSupport_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(ClientFeatureCapabilities clientFeatureCapabilities) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    clientFeatureCapabilities.version_ = this.version_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    clientFeatureCapabilities.wellnessThresholdMetSupport_ = this.wellnessThresholdMetSupport_;
                    i14 |= 2;
                }
                clientFeatureCapabilities.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_ClientFeatureCapabilities_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ClientFeatureCapabilities build() {
                ClientFeatureCapabilities clientFeatureCapabilitiesBuildPartial = buildPartial();
                if (clientFeatureCapabilitiesBuildPartial.isInitialized()) {
                    return clientFeatureCapabilitiesBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) clientFeatureCapabilitiesBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ClientFeatureCapabilities buildPartial() {
                ClientFeatureCapabilities clientFeatureCapabilities = new ClientFeatureCapabilities(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(clientFeatureCapabilities);
                }
                onBuilt();
                return clientFeatureCapabilities;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.version_ = 0;
                this.wellnessThresholdMetSupport_ = false;
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

            public Builder clearVersion() {
                this.bitField0_ &= -2;
                this.version_ = 0;
                onChanged();
                return this;
            }

            public Builder clearWellnessThresholdMetSupport() {
                this.bitField0_ &= -3;
                this.wellnessThresholdMetSupport_ = false;
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
                return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_ClientFeatureCapabilities_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGarminConnect.ClientFeatureCapabilitiesOrBuilder
            public int getVersion() {
                return this.version_;
            }

            @Override // com.garmin.proto.generated.GDIGarminConnect.ClientFeatureCapabilitiesOrBuilder
            public boolean getWellnessThresholdMetSupport() {
                return this.wellnessThresholdMetSupport_;
            }

            @Override // com.garmin.proto.generated.GDIGarminConnect.ClientFeatureCapabilitiesOrBuilder
            public boolean hasVersion() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminConnect.ClientFeatureCapabilitiesOrBuilder
            public boolean hasWellnessThresholdMetSupport() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_ClientFeatureCapabilities_fieldAccessorTable.ensureFieldAccessorsInitialized(ClientFeatureCapabilities.class, Builder.class);
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
                                    this.version_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.wellnessThresholdMetSupport_ = codedInputStream.readBool();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setVersion(int i14) {
                this.version_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setWellnessThresholdMetSupport(boolean z14) {
                this.wellnessThresholdMetSupport_ = z14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
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
            public ClientFeatureCapabilities getDefaultInstanceForType() {
                return ClientFeatureCapabilities.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ClientFeatureCapabilities) {
                    return mergeFrom((ClientFeatureCapabilities) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ClientFeatureCapabilities clientFeatureCapabilities) {
                if (clientFeatureCapabilities == ClientFeatureCapabilities.getDefaultInstance()) {
                    return this;
                }
                if (clientFeatureCapabilities.hasVersion()) {
                    setVersion(clientFeatureCapabilities.getVersion());
                }
                if (clientFeatureCapabilities.hasWellnessThresholdMetSupport()) {
                    setWellnessThresholdMetSupport(clientFeatureCapabilities.getWellnessThresholdMetSupport());
                }
                mergeUnknownFields(clientFeatureCapabilities.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ClientFeatureCapabilities getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ClientFeatureCapabilities parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClientFeatureCapabilities) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ClientFeatureCapabilities parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ClientFeatureCapabilities parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ClientFeatureCapabilities parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ ClientFeatureCapabilities(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ClientFeatureCapabilities parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private ClientFeatureCapabilities() {
            this.version_ = 0;
            this.wellnessThresholdMetSupport_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ClientFeatureCapabilities parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ClientFeatureCapabilities parseFrom(InputStream inputStream) {
            return (ClientFeatureCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ClientFeatureCapabilities parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClientFeatureCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ClientFeatureCapabilities parseFrom(CodedInputStream codedInputStream) {
            return (ClientFeatureCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ClientFeatureCapabilities parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ClientFeatureCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ContactsUpdateRequestNotification extends GeneratedMessageV3 implements ContactsUpdateRequestNotificationOrBuilder {
        private static final ContactsUpdateRequestNotification DEFAULT_INSTANCE = new ContactsUpdateRequestNotification();

        @Deprecated
        public static final Parser<ContactsUpdateRequestNotification> PARSER = new AbstractParser<ContactsUpdateRequestNotification>() { // from class: com.garmin.proto.generated.GDIGarminConnect.ContactsUpdateRequestNotification.1
            @Override // com.google.protobuf.Parser
            public ContactsUpdateRequestNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ContactsUpdateRequestNotification.newBuilder();
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

        private ContactsUpdateRequestNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ContactsUpdateRequestNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_ContactsUpdateRequestNotification_descriptor;
        }

        public static Builder newBuilder(ContactsUpdateRequestNotification contactsUpdateRequestNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(contactsUpdateRequestNotification);
        }

        public static ContactsUpdateRequestNotification parseDelimitedFrom(InputStream inputStream) {
            return (ContactsUpdateRequestNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ContactsUpdateRequestNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ContactsUpdateRequestNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof ContactsUpdateRequestNotification) {
                return getUnknownFields().equals(((ContactsUpdateRequestNotification) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ContactsUpdateRequestNotification> getParserForType() {
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
            return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_ContactsUpdateRequestNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ContactsUpdateRequestNotification.class, Builder.class);
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
            return new ContactsUpdateRequestNotification();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ContactsUpdateRequestNotificationOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_ContactsUpdateRequestNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ContactsUpdateRequestNotification build() {
                ContactsUpdateRequestNotification contactsUpdateRequestNotificationBuildPartial = buildPartial();
                if (contactsUpdateRequestNotificationBuildPartial.isInitialized()) {
                    return contactsUpdateRequestNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) contactsUpdateRequestNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ContactsUpdateRequestNotification buildPartial() {
                ContactsUpdateRequestNotification contactsUpdateRequestNotification = new ContactsUpdateRequestNotification(this);
                onBuilt();
                return contactsUpdateRequestNotification;
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
                return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_ContactsUpdateRequestNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_ContactsUpdateRequestNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(ContactsUpdateRequestNotification.class, Builder.class);
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
            public ContactsUpdateRequestNotification getDefaultInstanceForType() {
                return ContactsUpdateRequestNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ContactsUpdateRequestNotification) {
                    return mergeFrom((ContactsUpdateRequestNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ContactsUpdateRequestNotification contactsUpdateRequestNotification) {
                if (contactsUpdateRequestNotification == ContactsUpdateRequestNotification.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(contactsUpdateRequestNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ContactsUpdateRequestNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ ContactsUpdateRequestNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private ContactsUpdateRequestNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ContactsUpdateRequestNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ContactsUpdateRequestNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ContactsUpdateRequestNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ContactsUpdateRequestNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ContactsUpdateRequestNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ContactsUpdateRequestNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ContactsUpdateRequestNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ContactsUpdateRequestNotification parseFrom(InputStream inputStream) {
            return (ContactsUpdateRequestNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ContactsUpdateRequestNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ContactsUpdateRequestNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ContactsUpdateRequestNotification parseFrom(CodedInputStream codedInputStream) {
            return (ContactsUpdateRequestNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ContactsUpdateRequestNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ContactsUpdateRequestNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class LifestyleLoggingUpdateRequestNotification extends GeneratedMessageV3 implements LifestyleLoggingUpdateRequestNotificationOrBuilder {
        private static final LifestyleLoggingUpdateRequestNotification DEFAULT_INSTANCE = new LifestyleLoggingUpdateRequestNotification();

        @Deprecated
        public static final Parser<LifestyleLoggingUpdateRequestNotification> PARSER = new AbstractParser<LifestyleLoggingUpdateRequestNotification>() { // from class: com.garmin.proto.generated.GDIGarminConnect.LifestyleLoggingUpdateRequestNotification.1
            @Override // com.google.protobuf.Parser
            public LifestyleLoggingUpdateRequestNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = LifestyleLoggingUpdateRequestNotification.newBuilder();
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

        private LifestyleLoggingUpdateRequestNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LifestyleLoggingUpdateRequestNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_LifestyleLoggingUpdateRequestNotification_descriptor;
        }

        public static Builder newBuilder(LifestyleLoggingUpdateRequestNotification lifestyleLoggingUpdateRequestNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(lifestyleLoggingUpdateRequestNotification);
        }

        public static LifestyleLoggingUpdateRequestNotification parseDelimitedFrom(InputStream inputStream) {
            return (LifestyleLoggingUpdateRequestNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LifestyleLoggingUpdateRequestNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<LifestyleLoggingUpdateRequestNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof LifestyleLoggingUpdateRequestNotification) {
                return getUnknownFields().equals(((LifestyleLoggingUpdateRequestNotification) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<LifestyleLoggingUpdateRequestNotification> getParserForType() {
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
            return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_LifestyleLoggingUpdateRequestNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(LifestyleLoggingUpdateRequestNotification.class, Builder.class);
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
            return new LifestyleLoggingUpdateRequestNotification();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements LifestyleLoggingUpdateRequestNotificationOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_LifestyleLoggingUpdateRequestNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LifestyleLoggingUpdateRequestNotification build() {
                LifestyleLoggingUpdateRequestNotification lifestyleLoggingUpdateRequestNotificationBuildPartial = buildPartial();
                if (lifestyleLoggingUpdateRequestNotificationBuildPartial.isInitialized()) {
                    return lifestyleLoggingUpdateRequestNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) lifestyleLoggingUpdateRequestNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public LifestyleLoggingUpdateRequestNotification buildPartial() {
                LifestyleLoggingUpdateRequestNotification lifestyleLoggingUpdateRequestNotification = new LifestyleLoggingUpdateRequestNotification(this);
                onBuilt();
                return lifestyleLoggingUpdateRequestNotification;
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
                return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_LifestyleLoggingUpdateRequestNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_LifestyleLoggingUpdateRequestNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(LifestyleLoggingUpdateRequestNotification.class, Builder.class);
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
            public LifestyleLoggingUpdateRequestNotification getDefaultInstanceForType() {
                return LifestyleLoggingUpdateRequestNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof LifestyleLoggingUpdateRequestNotification) {
                    return mergeFrom((LifestyleLoggingUpdateRequestNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(LifestyleLoggingUpdateRequestNotification lifestyleLoggingUpdateRequestNotification) {
                if (lifestyleLoggingUpdateRequestNotification == LifestyleLoggingUpdateRequestNotification.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(lifestyleLoggingUpdateRequestNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public LifestyleLoggingUpdateRequestNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ LifestyleLoggingUpdateRequestNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private LifestyleLoggingUpdateRequestNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LifestyleLoggingUpdateRequestNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LifestyleLoggingUpdateRequestNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LifestyleLoggingUpdateRequestNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LifestyleLoggingUpdateRequestNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LifestyleLoggingUpdateRequestNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static LifestyleLoggingUpdateRequestNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static LifestyleLoggingUpdateRequestNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static LifestyleLoggingUpdateRequestNotification parseFrom(InputStream inputStream) {
            return (LifestyleLoggingUpdateRequestNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static LifestyleLoggingUpdateRequestNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LifestyleLoggingUpdateRequestNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static LifestyleLoggingUpdateRequestNotification parseFrom(CodedInputStream codedInputStream) {
            return (LifestyleLoggingUpdateRequestNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static LifestyleLoggingUpdateRequestNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (LifestyleLoggingUpdateRequestNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ServerFeatureCapabilities extends GeneratedMessageV3 implements ServerFeatureCapabilitiesOrBuilder {
        public static final int LIFESTYLE_LOGGING_SUPPORT_FIELD_NUMBER = 3;
        public static final int WELLNESS_SUPPORT_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean lifestyleLoggingSupport_;
        private byte memoizedIsInitialized;
        private boolean wellnessSupport_;
        private static final ServerFeatureCapabilities DEFAULT_INSTANCE = new ServerFeatureCapabilities();

        @Deprecated
        public static final Parser<ServerFeatureCapabilities> PARSER = new AbstractParser<ServerFeatureCapabilities>() { // from class: com.garmin.proto.generated.GDIGarminConnect.ServerFeatureCapabilities.1
            @Override // com.google.protobuf.Parser
            public ServerFeatureCapabilities parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ServerFeatureCapabilities.newBuilder();
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

        private ServerFeatureCapabilities(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.wellnessSupport_ = false;
            this.lifestyleLoggingSupport_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ServerFeatureCapabilities getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_ServerFeatureCapabilities_descriptor;
        }

        public static Builder newBuilder(ServerFeatureCapabilities serverFeatureCapabilities) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(serverFeatureCapabilities);
        }

        public static ServerFeatureCapabilities parseDelimitedFrom(InputStream inputStream) {
            return (ServerFeatureCapabilities) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ServerFeatureCapabilities parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ServerFeatureCapabilities> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ServerFeatureCapabilities)) {
                return super.equals(obj);
            }
            ServerFeatureCapabilities serverFeatureCapabilities = (ServerFeatureCapabilities) obj;
            if (hasWellnessSupport() != serverFeatureCapabilities.hasWellnessSupport()) {
                return false;
            }
            if ((!hasWellnessSupport() || getWellnessSupport() == serverFeatureCapabilities.getWellnessSupport()) && hasLifestyleLoggingSupport() == serverFeatureCapabilities.hasLifestyleLoggingSupport()) {
                return (!hasLifestyleLoggingSupport() || getLifestyleLoggingSupport() == serverFeatureCapabilities.getLifestyleLoggingSupport()) && getUnknownFields().equals(serverFeatureCapabilities.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIGarminConnect.ServerFeatureCapabilitiesOrBuilder
        public boolean getLifestyleLoggingSupport() {
            return this.lifestyleLoggingSupport_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ServerFeatureCapabilities> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBoolSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(2, this.wellnessSupport_) : 0;
            if ((2 & this.bitField0_) != 0) {
                iComputeBoolSize += CodedOutputStream.computeBoolSize(3, this.lifestyleLoggingSupport_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBoolSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGarminConnect.ServerFeatureCapabilitiesOrBuilder
        public boolean getWellnessSupport() {
            return this.wellnessSupport_;
        }

        @Override // com.garmin.proto.generated.GDIGarminConnect.ServerFeatureCapabilitiesOrBuilder
        public boolean hasLifestyleLoggingSupport() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminConnect.ServerFeatureCapabilitiesOrBuilder
        public boolean hasWellnessSupport() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasWellnessSupport()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getWellnessSupport());
            }
            if (hasLifestyleLoggingSupport()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + Internal.hashBoolean(getLifestyleLoggingSupport());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_ServerFeatureCapabilities_fieldAccessorTable.ensureFieldAccessorsInitialized(ServerFeatureCapabilities.class, Builder.class);
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
            return new ServerFeatureCapabilities();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(2, this.wellnessSupport_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(3, this.lifestyleLoggingSupport_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServerFeatureCapabilitiesOrBuilder {
            private int bitField0_;
            private boolean lifestyleLoggingSupport_;
            private boolean wellnessSupport_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(ServerFeatureCapabilities serverFeatureCapabilities) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    serverFeatureCapabilities.wellnessSupport_ = this.wellnessSupport_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    serverFeatureCapabilities.lifestyleLoggingSupport_ = this.lifestyleLoggingSupport_;
                    i14 |= 2;
                }
                serverFeatureCapabilities.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_ServerFeatureCapabilities_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ServerFeatureCapabilities build() {
                ServerFeatureCapabilities serverFeatureCapabilitiesBuildPartial = buildPartial();
                if (serverFeatureCapabilitiesBuildPartial.isInitialized()) {
                    return serverFeatureCapabilitiesBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) serverFeatureCapabilitiesBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ServerFeatureCapabilities buildPartial() {
                ServerFeatureCapabilities serverFeatureCapabilities = new ServerFeatureCapabilities(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(serverFeatureCapabilities);
                }
                onBuilt();
                return serverFeatureCapabilities;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.wellnessSupport_ = false;
                this.lifestyleLoggingSupport_ = false;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLifestyleLoggingSupport() {
                this.bitField0_ &= -3;
                this.lifestyleLoggingSupport_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearWellnessSupport() {
                this.bitField0_ &= -2;
                this.wellnessSupport_ = false;
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
                return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_ServerFeatureCapabilities_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGarminConnect.ServerFeatureCapabilitiesOrBuilder
            public boolean getLifestyleLoggingSupport() {
                return this.lifestyleLoggingSupport_;
            }

            @Override // com.garmin.proto.generated.GDIGarminConnect.ServerFeatureCapabilitiesOrBuilder
            public boolean getWellnessSupport() {
                return this.wellnessSupport_;
            }

            @Override // com.garmin.proto.generated.GDIGarminConnect.ServerFeatureCapabilitiesOrBuilder
            public boolean hasLifestyleLoggingSupport() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminConnect.ServerFeatureCapabilitiesOrBuilder
            public boolean hasWellnessSupport() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_ServerFeatureCapabilities_fieldAccessorTable.ensureFieldAccessorsInitialized(ServerFeatureCapabilities.class, Builder.class);
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
                                    this.wellnessSupport_ = codedInputStream.readBool();
                                    this.bitField0_ |= 1;
                                } else if (tag == 24) {
                                    this.lifestyleLoggingSupport_ = codedInputStream.readBool();
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

            public Builder setLifestyleLoggingSupport(boolean z14) {
                this.lifestyleLoggingSupport_ = z14;
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

            public Builder setWellnessSupport(boolean z14) {
                this.wellnessSupport_ = z14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
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
            public ServerFeatureCapabilities getDefaultInstanceForType() {
                return ServerFeatureCapabilities.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ServerFeatureCapabilities) {
                    return mergeFrom((ServerFeatureCapabilities) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ServerFeatureCapabilities serverFeatureCapabilities) {
                if (serverFeatureCapabilities == ServerFeatureCapabilities.getDefaultInstance()) {
                    return this;
                }
                if (serverFeatureCapabilities.hasWellnessSupport()) {
                    setWellnessSupport(serverFeatureCapabilities.getWellnessSupport());
                }
                if (serverFeatureCapabilities.hasLifestyleLoggingSupport()) {
                    setLifestyleLoggingSupport(serverFeatureCapabilities.getLifestyleLoggingSupport());
                }
                mergeUnknownFields(serverFeatureCapabilities.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ServerFeatureCapabilities getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ServerFeatureCapabilities parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ServerFeatureCapabilities) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ServerFeatureCapabilities parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ServerFeatureCapabilities parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ServerFeatureCapabilities parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ ServerFeatureCapabilities(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ServerFeatureCapabilities parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private ServerFeatureCapabilities() {
            this.wellnessSupport_ = false;
            this.lifestyleLoggingSupport_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ServerFeatureCapabilities parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ServerFeatureCapabilities parseFrom(InputStream inputStream) {
            return (ServerFeatureCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ServerFeatureCapabilities parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ServerFeatureCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ServerFeatureCapabilities parseFrom(CodedInputStream codedInputStream) {
            return (ServerFeatureCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ServerFeatureCapabilities parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ServerFeatureCapabilities) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class WellnessThresholdMetNotification extends GeneratedMessageV3 implements WellnessThresholdMetNotificationOrBuilder {
        private static final WellnessThresholdMetNotification DEFAULT_INSTANCE = new WellnessThresholdMetNotification();

        @Deprecated
        public static final Parser<WellnessThresholdMetNotification> PARSER = new AbstractParser<WellnessThresholdMetNotification>() { // from class: com.garmin.proto.generated.GDIGarminConnect.WellnessThresholdMetNotification.1
            @Override // com.google.protobuf.Parser
            public WellnessThresholdMetNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = WellnessThresholdMetNotification.newBuilder();
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

        private WellnessThresholdMetNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WellnessThresholdMetNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_WellnessThresholdMetNotification_descriptor;
        }

        public static Builder newBuilder(WellnessThresholdMetNotification wellnessThresholdMetNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(wellnessThresholdMetNotification);
        }

        public static WellnessThresholdMetNotification parseDelimitedFrom(InputStream inputStream) {
            return (WellnessThresholdMetNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static WellnessThresholdMetNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<WellnessThresholdMetNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof WellnessThresholdMetNotification) {
                return getUnknownFields().equals(((WellnessThresholdMetNotification) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<WellnessThresholdMetNotification> getParserForType() {
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
            return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_WellnessThresholdMetNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(WellnessThresholdMetNotification.class, Builder.class);
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
            return new WellnessThresholdMetNotification();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements WellnessThresholdMetNotificationOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_WellnessThresholdMetNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WellnessThresholdMetNotification build() {
                WellnessThresholdMetNotification wellnessThresholdMetNotificationBuildPartial = buildPartial();
                if (wellnessThresholdMetNotificationBuildPartial.isInitialized()) {
                    return wellnessThresholdMetNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) wellnessThresholdMetNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public WellnessThresholdMetNotification buildPartial() {
                WellnessThresholdMetNotification wellnessThresholdMetNotification = new WellnessThresholdMetNotification(this);
                onBuilt();
                return wellnessThresholdMetNotification;
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
                return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_WellnessThresholdMetNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_WellnessThresholdMetNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(WellnessThresholdMetNotification.class, Builder.class);
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
            public WellnessThresholdMetNotification getDefaultInstanceForType() {
                return WellnessThresholdMetNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof WellnessThresholdMetNotification) {
                    return mergeFrom((WellnessThresholdMetNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(WellnessThresholdMetNotification wellnessThresholdMetNotification) {
                if (wellnessThresholdMetNotification == WellnessThresholdMetNotification.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(wellnessThresholdMetNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public WellnessThresholdMetNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ WellnessThresholdMetNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private WellnessThresholdMetNotification() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static WellnessThresholdMetNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WellnessThresholdMetNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WellnessThresholdMetNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static WellnessThresholdMetNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static WellnessThresholdMetNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static WellnessThresholdMetNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static WellnessThresholdMetNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static WellnessThresholdMetNotification parseFrom(InputStream inputStream) {
            return (WellnessThresholdMetNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static WellnessThresholdMetNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WellnessThresholdMetNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static WellnessThresholdMetNotification parseFrom(CodedInputStream codedInputStream) {
            return (WellnessThresholdMetNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static WellnessThresholdMetNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WellnessThresholdMetNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CheckDownloadQueueRequest extends GeneratedMessageV3 implements CheckDownloadQueueRequestOrBuilder {
        public static final int FORCE_BETA_SOFTWARE_UPDATE_CHECK_FIELD_NUMBER = 2;
        public static final int PRIORITY_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private boolean forceBetaSoftwareUpdateCheck_;
        private byte memoizedIsInitialized;
        private int priority_;
        private static final CheckDownloadQueueRequest DEFAULT_INSTANCE = new CheckDownloadQueueRequest();

        @Deprecated
        public static final Parser<CheckDownloadQueueRequest> PARSER = new AbstractParser<CheckDownloadQueueRequest>() { // from class: com.garmin.proto.generated.GDIGarminConnect.CheckDownloadQueueRequest.1
            @Override // com.google.protobuf.Parser
            public CheckDownloadQueueRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CheckDownloadQueueRequest.newBuilder();
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

        private CheckDownloadQueueRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.priority_ = 0;
            this.forceBetaSoftwareUpdateCheck_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CheckDownloadQueueRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_CheckDownloadQueueRequest_descriptor;
        }

        public static Builder newBuilder(CheckDownloadQueueRequest checkDownloadQueueRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(checkDownloadQueueRequest);
        }

        public static CheckDownloadQueueRequest parseDelimitedFrom(InputStream inputStream) {
            return (CheckDownloadQueueRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CheckDownloadQueueRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CheckDownloadQueueRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CheckDownloadQueueRequest)) {
                return super.equals(obj);
            }
            CheckDownloadQueueRequest checkDownloadQueueRequest = (CheckDownloadQueueRequest) obj;
            if (hasPriority() != checkDownloadQueueRequest.hasPriority()) {
                return false;
            }
            if ((!hasPriority() || this.priority_ == checkDownloadQueueRequest.priority_) && hasForceBetaSoftwareUpdateCheck() == checkDownloadQueueRequest.hasForceBetaSoftwareUpdateCheck()) {
                return (!hasForceBetaSoftwareUpdateCheck() || getForceBetaSoftwareUpdateCheck() == checkDownloadQueueRequest.getForceBetaSoftwareUpdateCheck()) && getUnknownFields().equals(checkDownloadQueueRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIGarminConnect.CheckDownloadQueueRequestOrBuilder
        public boolean getForceBetaSoftwareUpdateCheck() {
            return this.forceBetaSoftwareUpdateCheck_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CheckDownloadQueueRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIGarminConnect.CheckDownloadQueueRequestOrBuilder
        public Priority getPriority() {
            Priority priorityForNumber = Priority.forNumber(this.priority_);
            return priorityForNumber == null ? Priority.STANDARD : priorityForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.priority_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeBoolSize(2, this.forceBetaSoftwareUpdateCheck_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGarminConnect.CheckDownloadQueueRequestOrBuilder
        public boolean hasForceBetaSoftwareUpdateCheck() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminConnect.CheckDownloadQueueRequestOrBuilder
        public boolean hasPriority() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasPriority()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.priority_;
            }
            if (hasForceBetaSoftwareUpdateCheck()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getForceBetaSoftwareUpdateCheck());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_CheckDownloadQueueRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CheckDownloadQueueRequest.class, Builder.class);
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
            return new CheckDownloadQueueRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.priority_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.forceBetaSoftwareUpdateCheck_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CheckDownloadQueueRequestOrBuilder {
            private int bitField0_;
            private boolean forceBetaSoftwareUpdateCheck_;
            private int priority_;

            private Builder() {
                this.priority_ = 0;
            }

            private void buildPartial0(CheckDownloadQueueRequest checkDownloadQueueRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    checkDownloadQueueRequest.priority_ = this.priority_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    checkDownloadQueueRequest.forceBetaSoftwareUpdateCheck_ = this.forceBetaSoftwareUpdateCheck_;
                    i14 |= 2;
                }
                checkDownloadQueueRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_CheckDownloadQueueRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CheckDownloadQueueRequest build() {
                CheckDownloadQueueRequest checkDownloadQueueRequestBuildPartial = buildPartial();
                if (checkDownloadQueueRequestBuildPartial.isInitialized()) {
                    return checkDownloadQueueRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) checkDownloadQueueRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CheckDownloadQueueRequest buildPartial() {
                CheckDownloadQueueRequest checkDownloadQueueRequest = new CheckDownloadQueueRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(checkDownloadQueueRequest);
                }
                onBuilt();
                return checkDownloadQueueRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.priority_ = 0;
                this.forceBetaSoftwareUpdateCheck_ = false;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearForceBetaSoftwareUpdateCheck() {
                this.bitField0_ &= -3;
                this.forceBetaSoftwareUpdateCheck_ = false;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPriority() {
                this.bitField0_ &= -2;
                this.priority_ = 0;
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
                return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_CheckDownloadQueueRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGarminConnect.CheckDownloadQueueRequestOrBuilder
            public boolean getForceBetaSoftwareUpdateCheck() {
                return this.forceBetaSoftwareUpdateCheck_;
            }

            @Override // com.garmin.proto.generated.GDIGarminConnect.CheckDownloadQueueRequestOrBuilder
            public Priority getPriority() {
                Priority priorityForNumber = Priority.forNumber(this.priority_);
                return priorityForNumber == null ? Priority.STANDARD : priorityForNumber;
            }

            @Override // com.garmin.proto.generated.GDIGarminConnect.CheckDownloadQueueRequestOrBuilder
            public boolean hasForceBetaSoftwareUpdateCheck() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminConnect.CheckDownloadQueueRequestOrBuilder
            public boolean hasPriority() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_CheckDownloadQueueRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CheckDownloadQueueRequest.class, Builder.class);
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
                                    if (Priority.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.priority_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    this.forceBetaSoftwareUpdateCheck_ = codedInputStream.readBool();
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

            public Builder setForceBetaSoftwareUpdateCheck(boolean z14) {
                this.forceBetaSoftwareUpdateCheck_ = z14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setPriority(Priority priority) {
                priority.getClass();
                this.bitField0_ |= 1;
                this.priority_ = priority.getNumber();
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
            public CheckDownloadQueueRequest getDefaultInstanceForType() {
                return CheckDownloadQueueRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.priority_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CheckDownloadQueueRequest) {
                    return mergeFrom((CheckDownloadQueueRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CheckDownloadQueueRequest checkDownloadQueueRequest) {
                if (checkDownloadQueueRequest == CheckDownloadQueueRequest.getDefaultInstance()) {
                    return this;
                }
                if (checkDownloadQueueRequest.hasPriority()) {
                    setPriority(checkDownloadQueueRequest.getPriority());
                }
                if (checkDownloadQueueRequest.hasForceBetaSoftwareUpdateCheck()) {
                    setForceBetaSoftwareUpdateCheck(checkDownloadQueueRequest.getForceBetaSoftwareUpdateCheck());
                }
                mergeUnknownFields(checkDownloadQueueRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CheckDownloadQueueRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static CheckDownloadQueueRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CheckDownloadQueueRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CheckDownloadQueueRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CheckDownloadQueueRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CheckDownloadQueueRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ CheckDownloadQueueRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CheckDownloadQueueRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private CheckDownloadQueueRequest() {
            this.forceBetaSoftwareUpdateCheck_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.priority_ = 0;
        }

        public static CheckDownloadQueueRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CheckDownloadQueueRequest parseFrom(InputStream inputStream) {
            return (CheckDownloadQueueRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CheckDownloadQueueRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CheckDownloadQueueRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CheckDownloadQueueRequest parseFrom(CodedInputStream codedInputStream) {
            return (CheckDownloadQueueRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CheckDownloadQueueRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CheckDownloadQueueRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CheckDownloadQueueResponse extends GeneratedMessageV3 implements CheckDownloadQueueResponseOrBuilder {
        private static final CheckDownloadQueueResponse DEFAULT_INSTANCE = new CheckDownloadQueueResponse();

        @Deprecated
        public static final Parser<CheckDownloadQueueResponse> PARSER = new AbstractParser<CheckDownloadQueueResponse>() { // from class: com.garmin.proto.generated.GDIGarminConnect.CheckDownloadQueueResponse.1
            @Override // com.google.protobuf.Parser
            public CheckDownloadQueueResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CheckDownloadQueueResponse.newBuilder();
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

        private CheckDownloadQueueResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CheckDownloadQueueResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_CheckDownloadQueueResponse_descriptor;
        }

        public static Builder newBuilder(CheckDownloadQueueResponse checkDownloadQueueResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(checkDownloadQueueResponse);
        }

        public static CheckDownloadQueueResponse parseDelimitedFrom(InputStream inputStream) {
            return (CheckDownloadQueueResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CheckDownloadQueueResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CheckDownloadQueueResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CheckDownloadQueueResponse)) {
                return super.equals(obj);
            }
            CheckDownloadQueueResponse checkDownloadQueueResponse = (CheckDownloadQueueResponse) obj;
            if (hasStatus() != checkDownloadQueueResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == checkDownloadQueueResponse.status_) && getUnknownFields().equals(checkDownloadQueueResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CheckDownloadQueueResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIGarminConnect.CheckDownloadQueueResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.SUCCESS : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIGarminConnect.CheckDownloadQueueResponseOrBuilder
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
            return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_CheckDownloadQueueResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CheckDownloadQueueResponse.class, Builder.class);
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
            return new CheckDownloadQueueResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CheckDownloadQueueResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(CheckDownloadQueueResponse checkDownloadQueueResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    checkDownloadQueueResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                checkDownloadQueueResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_CheckDownloadQueueResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CheckDownloadQueueResponse build() {
                CheckDownloadQueueResponse checkDownloadQueueResponseBuildPartial = buildPartial();
                if (checkDownloadQueueResponseBuildPartial.isInitialized()) {
                    return checkDownloadQueueResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) checkDownloadQueueResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CheckDownloadQueueResponse buildPartial() {
                CheckDownloadQueueResponse checkDownloadQueueResponse = new CheckDownloadQueueResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(checkDownloadQueueResponse);
                }
                onBuilt();
                return checkDownloadQueueResponse;
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
                return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_CheckDownloadQueueResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGarminConnect.CheckDownloadQueueResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.SUCCESS : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIGarminConnect.CheckDownloadQueueResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_CheckDownloadQueueResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CheckDownloadQueueResponse.class, Builder.class);
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
            public CheckDownloadQueueResponse getDefaultInstanceForType() {
                return CheckDownloadQueueResponse.getDefaultInstance();
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
                if (message instanceof CheckDownloadQueueResponse) {
                    return mergeFrom((CheckDownloadQueueResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CheckDownloadQueueResponse checkDownloadQueueResponse) {
                if (checkDownloadQueueResponse == CheckDownloadQueueResponse.getDefaultInstance()) {
                    return this;
                }
                if (checkDownloadQueueResponse.hasStatus()) {
                    setStatus(checkDownloadQueueResponse.getStatus());
                }
                mergeUnknownFields(checkDownloadQueueResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CheckDownloadQueueResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static CheckDownloadQueueResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CheckDownloadQueueResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CheckDownloadQueueResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ CheckDownloadQueueResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CheckDownloadQueueResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private CheckDownloadQueueResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CheckDownloadQueueResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CheckDownloadQueueResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CheckDownloadQueueResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CheckDownloadQueueResponse parseFrom(InputStream inputStream) {
            return (CheckDownloadQueueResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CheckDownloadQueueResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CheckDownloadQueueResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CheckDownloadQueueResponse parseFrom(CodedInputStream codedInputStream) {
            return (CheckDownloadQueueResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CheckDownloadQueueResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CheckDownloadQueueResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            SUCCESS(0),
            FAIL_NO_CONNECTIVITY(1);

            public static final int FAIL_NO_CONNECTIVITY_VALUE = 1;
            public static final int SUCCESS_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIGarminConnect.CheckDownloadQueueResponse.Status.1
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
                    return SUCCESS;
                }
                if (i14 != 1) {
                    return null;
                }
                return FAIL_NO_CONNECTIVITY;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return CheckDownloadQueueResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class CutWellnessFilesRequest extends GeneratedMessageV3 implements CutWellnessFilesRequestOrBuilder {
        private static final CutWellnessFilesRequest DEFAULT_INSTANCE = new CutWellnessFilesRequest();

        @Deprecated
        public static final Parser<CutWellnessFilesRequest> PARSER = new AbstractParser<CutWellnessFilesRequest>() { // from class: com.garmin.proto.generated.GDIGarminConnect.CutWellnessFilesRequest.1
            @Override // com.google.protobuf.Parser
            public CutWellnessFilesRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CutWellnessFilesRequest.newBuilder();
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
        public static final int PRIORITY_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int priority_;

        private CutWellnessFilesRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.priority_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CutWellnessFilesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_CutWellnessFilesRequest_descriptor;
        }

        public static Builder newBuilder(CutWellnessFilesRequest cutWellnessFilesRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cutWellnessFilesRequest);
        }

        public static CutWellnessFilesRequest parseDelimitedFrom(InputStream inputStream) {
            return (CutWellnessFilesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CutWellnessFilesRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CutWellnessFilesRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CutWellnessFilesRequest)) {
                return super.equals(obj);
            }
            CutWellnessFilesRequest cutWellnessFilesRequest = (CutWellnessFilesRequest) obj;
            if (hasPriority() != cutWellnessFilesRequest.hasPriority()) {
                return false;
            }
            return (!hasPriority() || this.priority_ == cutWellnessFilesRequest.priority_) && getUnknownFields().equals(cutWellnessFilesRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CutWellnessFilesRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIGarminConnect.CutWellnessFilesRequestOrBuilder
        public Priority getPriority() {
            Priority priorityForNumber = Priority.forNumber(this.priority_);
            return priorityForNumber == null ? Priority.STANDARD : priorityForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.priority_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGarminConnect.CutWellnessFilesRequestOrBuilder
        public boolean hasPriority() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasPriority()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.priority_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_CutWellnessFilesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CutWellnessFilesRequest.class, Builder.class);
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
            return new CutWellnessFilesRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.priority_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CutWellnessFilesRequestOrBuilder {
            private int bitField0_;
            private int priority_;

            private Builder() {
                this.priority_ = 0;
            }

            private void buildPartial0(CutWellnessFilesRequest cutWellnessFilesRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    cutWellnessFilesRequest.priority_ = this.priority_;
                } else {
                    i14 = 0;
                }
                cutWellnessFilesRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_CutWellnessFilesRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CutWellnessFilesRequest build() {
                CutWellnessFilesRequest cutWellnessFilesRequestBuildPartial = buildPartial();
                if (cutWellnessFilesRequestBuildPartial.isInitialized()) {
                    return cutWellnessFilesRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) cutWellnessFilesRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CutWellnessFilesRequest buildPartial() {
                CutWellnessFilesRequest cutWellnessFilesRequest = new CutWellnessFilesRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(cutWellnessFilesRequest);
                }
                onBuilt();
                return cutWellnessFilesRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.priority_ = 0;
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

            public Builder clearPriority() {
                this.bitField0_ &= -2;
                this.priority_ = 0;
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
                return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_CutWellnessFilesRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGarminConnect.CutWellnessFilesRequestOrBuilder
            public Priority getPriority() {
                Priority priorityForNumber = Priority.forNumber(this.priority_);
                return priorityForNumber == null ? Priority.STANDARD : priorityForNumber;
            }

            @Override // com.garmin.proto.generated.GDIGarminConnect.CutWellnessFilesRequestOrBuilder
            public boolean hasPriority() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_CutWellnessFilesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CutWellnessFilesRequest.class, Builder.class);
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
                                    if (Priority.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.priority_ = i14;
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

            public Builder setPriority(Priority priority) {
                priority.getClass();
                this.bitField0_ |= 1;
                this.priority_ = priority.getNumber();
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
            public CutWellnessFilesRequest getDefaultInstanceForType() {
                return CutWellnessFilesRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.priority_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CutWellnessFilesRequest) {
                    return mergeFrom((CutWellnessFilesRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CutWellnessFilesRequest cutWellnessFilesRequest) {
                if (cutWellnessFilesRequest == CutWellnessFilesRequest.getDefaultInstance()) {
                    return this;
                }
                if (cutWellnessFilesRequest.hasPriority()) {
                    setPriority(cutWellnessFilesRequest.getPriority());
                }
                mergeUnknownFields(cutWellnessFilesRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CutWellnessFilesRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static CutWellnessFilesRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CutWellnessFilesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CutWellnessFilesRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ CutWellnessFilesRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CutWellnessFilesRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private CutWellnessFilesRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.priority_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CutWellnessFilesRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CutWellnessFilesRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CutWellnessFilesRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CutWellnessFilesRequest parseFrom(InputStream inputStream) {
            return (CutWellnessFilesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CutWellnessFilesRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CutWellnessFilesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CutWellnessFilesRequest parseFrom(CodedInputStream codedInputStream) {
            return (CutWellnessFilesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CutWellnessFilesRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CutWellnessFilesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CutWellnessFilesResponse extends GeneratedMessageV3 implements CutWellnessFilesResponseOrBuilder {
        private static final CutWellnessFilesResponse DEFAULT_INSTANCE = new CutWellnessFilesResponse();

        @Deprecated
        public static final Parser<CutWellnessFilesResponse> PARSER = new AbstractParser<CutWellnessFilesResponse>() { // from class: com.garmin.proto.generated.GDIGarminConnect.CutWellnessFilesResponse.1
            @Override // com.google.protobuf.Parser
            public CutWellnessFilesResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CutWellnessFilesResponse.newBuilder();
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

        private CutWellnessFilesResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CutWellnessFilesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_CutWellnessFilesResponse_descriptor;
        }

        public static Builder newBuilder(CutWellnessFilesResponse cutWellnessFilesResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cutWellnessFilesResponse);
        }

        public static CutWellnessFilesResponse parseDelimitedFrom(InputStream inputStream) {
            return (CutWellnessFilesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CutWellnessFilesResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CutWellnessFilesResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CutWellnessFilesResponse)) {
                return super.equals(obj);
            }
            CutWellnessFilesResponse cutWellnessFilesResponse = (CutWellnessFilesResponse) obj;
            if (hasStatus() != cutWellnessFilesResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == cutWellnessFilesResponse.status_) && getUnknownFields().equals(cutWellnessFilesResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CutWellnessFilesResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIGarminConnect.CutWellnessFilesResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.SUCCESS : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIGarminConnect.CutWellnessFilesResponseOrBuilder
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
            return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_CutWellnessFilesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CutWellnessFilesResponse.class, Builder.class);
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
            return new CutWellnessFilesResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CutWellnessFilesResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(CutWellnessFilesResponse cutWellnessFilesResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    cutWellnessFilesResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                cutWellnessFilesResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_CutWellnessFilesResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CutWellnessFilesResponse build() {
                CutWellnessFilesResponse cutWellnessFilesResponseBuildPartial = buildPartial();
                if (cutWellnessFilesResponseBuildPartial.isInitialized()) {
                    return cutWellnessFilesResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) cutWellnessFilesResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CutWellnessFilesResponse buildPartial() {
                CutWellnessFilesResponse cutWellnessFilesResponse = new CutWellnessFilesResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(cutWellnessFilesResponse);
                }
                onBuilt();
                return cutWellnessFilesResponse;
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
                return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_CutWellnessFilesResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGarminConnect.CutWellnessFilesResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.SUCCESS : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIGarminConnect.CutWellnessFilesResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_CutWellnessFilesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CutWellnessFilesResponse.class, Builder.class);
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
            public CutWellnessFilesResponse getDefaultInstanceForType() {
                return CutWellnessFilesResponse.getDefaultInstance();
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
                if (message instanceof CutWellnessFilesResponse) {
                    return mergeFrom((CutWellnessFilesResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CutWellnessFilesResponse cutWellnessFilesResponse) {
                if (cutWellnessFilesResponse == CutWellnessFilesResponse.getDefaultInstance()) {
                    return this;
                }
                if (cutWellnessFilesResponse.hasStatus()) {
                    setStatus(cutWellnessFilesResponse.getStatus());
                }
                mergeUnknownFields(cutWellnessFilesResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CutWellnessFilesResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static CutWellnessFilesResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CutWellnessFilesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CutWellnessFilesResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ CutWellnessFilesResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CutWellnessFilesResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private CutWellnessFilesResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CutWellnessFilesResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CutWellnessFilesResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CutWellnessFilesResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CutWellnessFilesResponse parseFrom(InputStream inputStream) {
            return (CutWellnessFilesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CutWellnessFilesResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CutWellnessFilesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CutWellnessFilesResponse parseFrom(CodedInputStream codedInputStream) {
            return (CutWellnessFilesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CutWellnessFilesResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CutWellnessFilesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            SUCCESS(0),
            IGNORED(1),
            NOT_SUPPORTED(2);

            public static final int IGNORED_VALUE = 1;
            public static final int NOT_SUPPORTED_VALUE = 2;
            public static final int SUCCESS_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIGarminConnect.CutWellnessFilesResponse.Status.1
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
                    return SUCCESS;
                }
                if (i14 == 1) {
                    return IGNORED;
                }
                if (i14 != 2) {
                    return null;
                }
                return NOT_SUPPORTED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return CutWellnessFilesResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        public static final int CHECK_DOWNLOAD_QUEUE_REQUEST_FIELD_NUMBER = 1;
        public static final int CHECK_DOWNLOAD_QUEUE_RESPONSE_FIELD_NUMBER = 2;
        public static final int CONTACTS_UPDATE_REQUEST_NOTIFICATION_FIELD_NUMBER = 6;
        public static final int CUT_WELLNESS_FILES_REQUEST_FIELD_NUMBER = 3;
        public static final int CUT_WELLNESS_FILES_RESPONSE_FIELD_NUMBER = 4;
        public static final int LIFESTYLE_LOGGING_UPDATE_REQUEST_NOTIFICATION_FIELD_NUMBER = 7;
        public static final int WELLNESS_THRESHOLD_MET_NOTIFICATION_FIELD_NUMBER = 5;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private CheckDownloadQueueRequest checkDownloadQueueRequest_;
        private CheckDownloadQueueResponse checkDownloadQueueResponse_;
        private ContactsUpdateRequestNotification contactsUpdateRequestNotification_;
        private CutWellnessFilesRequest cutWellnessFilesRequest_;
        private CutWellnessFilesResponse cutWellnessFilesResponse_;
        private LifestyleLoggingUpdateRequestNotification lifestyleLoggingUpdateRequestNotification_;
        private byte memoizedIsInitialized;
        private WellnessThresholdMetNotification wellnessThresholdMetNotification_;
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDIGarminConnect.Service.1
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
            return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_Service_descriptor;
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
            if (hasCheckDownloadQueueRequest() != service.hasCheckDownloadQueueRequest()) {
                return false;
            }
            if ((hasCheckDownloadQueueRequest() && !getCheckDownloadQueueRequest().equals(service.getCheckDownloadQueueRequest())) || hasCheckDownloadQueueResponse() != service.hasCheckDownloadQueueResponse()) {
                return false;
            }
            if ((hasCheckDownloadQueueResponse() && !getCheckDownloadQueueResponse().equals(service.getCheckDownloadQueueResponse())) || hasCutWellnessFilesRequest() != service.hasCutWellnessFilesRequest()) {
                return false;
            }
            if ((hasCutWellnessFilesRequest() && !getCutWellnessFilesRequest().equals(service.getCutWellnessFilesRequest())) || hasCutWellnessFilesResponse() != service.hasCutWellnessFilesResponse()) {
                return false;
            }
            if ((hasCutWellnessFilesResponse() && !getCutWellnessFilesResponse().equals(service.getCutWellnessFilesResponse())) || hasWellnessThresholdMetNotification() != service.hasWellnessThresholdMetNotification()) {
                return false;
            }
            if ((hasWellnessThresholdMetNotification() && !getWellnessThresholdMetNotification().equals(service.getWellnessThresholdMetNotification())) || hasContactsUpdateRequestNotification() != service.hasContactsUpdateRequestNotification()) {
                return false;
            }
            if ((!hasContactsUpdateRequestNotification() || getContactsUpdateRequestNotification().equals(service.getContactsUpdateRequestNotification())) && hasLifestyleLoggingUpdateRequestNotification() == service.hasLifestyleLoggingUpdateRequestNotification()) {
                return (!hasLifestyleLoggingUpdateRequestNotification() || getLifestyleLoggingUpdateRequestNotification().equals(service.getLifestyleLoggingUpdateRequestNotification())) && getUnknownFields().equals(service.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
        public CheckDownloadQueueRequest getCheckDownloadQueueRequest() {
            CheckDownloadQueueRequest checkDownloadQueueRequest = this.checkDownloadQueueRequest_;
            return checkDownloadQueueRequest == null ? CheckDownloadQueueRequest.getDefaultInstance() : checkDownloadQueueRequest;
        }

        @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
        public CheckDownloadQueueRequestOrBuilder getCheckDownloadQueueRequestOrBuilder() {
            CheckDownloadQueueRequest checkDownloadQueueRequest = this.checkDownloadQueueRequest_;
            return checkDownloadQueueRequest == null ? CheckDownloadQueueRequest.getDefaultInstance() : checkDownloadQueueRequest;
        }

        @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
        public CheckDownloadQueueResponse getCheckDownloadQueueResponse() {
            CheckDownloadQueueResponse checkDownloadQueueResponse = this.checkDownloadQueueResponse_;
            return checkDownloadQueueResponse == null ? CheckDownloadQueueResponse.getDefaultInstance() : checkDownloadQueueResponse;
        }

        @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
        public CheckDownloadQueueResponseOrBuilder getCheckDownloadQueueResponseOrBuilder() {
            CheckDownloadQueueResponse checkDownloadQueueResponse = this.checkDownloadQueueResponse_;
            return checkDownloadQueueResponse == null ? CheckDownloadQueueResponse.getDefaultInstance() : checkDownloadQueueResponse;
        }

        @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
        public ContactsUpdateRequestNotification getContactsUpdateRequestNotification() {
            ContactsUpdateRequestNotification contactsUpdateRequestNotification = this.contactsUpdateRequestNotification_;
            return contactsUpdateRequestNotification == null ? ContactsUpdateRequestNotification.getDefaultInstance() : contactsUpdateRequestNotification;
        }

        @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
        public ContactsUpdateRequestNotificationOrBuilder getContactsUpdateRequestNotificationOrBuilder() {
            ContactsUpdateRequestNotification contactsUpdateRequestNotification = this.contactsUpdateRequestNotification_;
            return contactsUpdateRequestNotification == null ? ContactsUpdateRequestNotification.getDefaultInstance() : contactsUpdateRequestNotification;
        }

        @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
        public CutWellnessFilesRequest getCutWellnessFilesRequest() {
            CutWellnessFilesRequest cutWellnessFilesRequest = this.cutWellnessFilesRequest_;
            return cutWellnessFilesRequest == null ? CutWellnessFilesRequest.getDefaultInstance() : cutWellnessFilesRequest;
        }

        @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
        public CutWellnessFilesRequestOrBuilder getCutWellnessFilesRequestOrBuilder() {
            CutWellnessFilesRequest cutWellnessFilesRequest = this.cutWellnessFilesRequest_;
            return cutWellnessFilesRequest == null ? CutWellnessFilesRequest.getDefaultInstance() : cutWellnessFilesRequest;
        }

        @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
        public CutWellnessFilesResponse getCutWellnessFilesResponse() {
            CutWellnessFilesResponse cutWellnessFilesResponse = this.cutWellnessFilesResponse_;
            return cutWellnessFilesResponse == null ? CutWellnessFilesResponse.getDefaultInstance() : cutWellnessFilesResponse;
        }

        @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
        public CutWellnessFilesResponseOrBuilder getCutWellnessFilesResponseOrBuilder() {
            CutWellnessFilesResponse cutWellnessFilesResponse = this.cutWellnessFilesResponse_;
            return cutWellnessFilesResponse == null ? CutWellnessFilesResponse.getDefaultInstance() : cutWellnessFilesResponse;
        }

        @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
        public LifestyleLoggingUpdateRequestNotification getLifestyleLoggingUpdateRequestNotification() {
            LifestyleLoggingUpdateRequestNotification lifestyleLoggingUpdateRequestNotification = this.lifestyleLoggingUpdateRequestNotification_;
            return lifestyleLoggingUpdateRequestNotification == null ? LifestyleLoggingUpdateRequestNotification.getDefaultInstance() : lifestyleLoggingUpdateRequestNotification;
        }

        @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
        public LifestyleLoggingUpdateRequestNotificationOrBuilder getLifestyleLoggingUpdateRequestNotificationOrBuilder() {
            LifestyleLoggingUpdateRequestNotification lifestyleLoggingUpdateRequestNotification = this.lifestyleLoggingUpdateRequestNotification_;
            return lifestyleLoggingUpdateRequestNotification == null ? LifestyleLoggingUpdateRequestNotification.getDefaultInstance() : lifestyleLoggingUpdateRequestNotification;
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
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getCheckDownloadQueueRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getCheckDownloadQueueResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getCutWellnessFilesRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getCutWellnessFilesResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getWellnessThresholdMetNotification());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getContactsUpdateRequestNotification());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getLifestyleLoggingUpdateRequestNotification());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
        public WellnessThresholdMetNotification getWellnessThresholdMetNotification() {
            WellnessThresholdMetNotification wellnessThresholdMetNotification = this.wellnessThresholdMetNotification_;
            return wellnessThresholdMetNotification == null ? WellnessThresholdMetNotification.getDefaultInstance() : wellnessThresholdMetNotification;
        }

        @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
        public WellnessThresholdMetNotificationOrBuilder getWellnessThresholdMetNotificationOrBuilder() {
            WellnessThresholdMetNotification wellnessThresholdMetNotification = this.wellnessThresholdMetNotification_;
            return wellnessThresholdMetNotification == null ? WellnessThresholdMetNotification.getDefaultInstance() : wellnessThresholdMetNotification;
        }

        @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
        public boolean hasCheckDownloadQueueRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
        public boolean hasCheckDownloadQueueResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
        public boolean hasContactsUpdateRequestNotification() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
        public boolean hasCutWellnessFilesRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
        public boolean hasCutWellnessFilesResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
        public boolean hasLifestyleLoggingUpdateRequestNotification() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
        public boolean hasWellnessThresholdMetNotification() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCheckDownloadQueueRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getCheckDownloadQueueRequest().hashCode();
            }
            if (hasCheckDownloadQueueResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getCheckDownloadQueueResponse().hashCode();
            }
            if (hasCutWellnessFilesRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getCutWellnessFilesRequest().hashCode();
            }
            if (hasCutWellnessFilesResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getCutWellnessFilesResponse().hashCode();
            }
            if (hasWellnessThresholdMetNotification()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getWellnessThresholdMetNotification().hashCode();
            }
            if (hasContactsUpdateRequestNotification()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getContactsUpdateRequestNotification().hashCode();
            }
            if (hasLifestyleLoggingUpdateRequestNotification()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getLifestyleLoggingUpdateRequestNotification().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getCheckDownloadQueueRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getCheckDownloadQueueResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getCutWellnessFilesRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getCutWellnessFilesResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getWellnessThresholdMetNotification());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getContactsUpdateRequestNotification());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getLifestyleLoggingUpdateRequestNotification());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<CheckDownloadQueueRequest, CheckDownloadQueueRequest.Builder, CheckDownloadQueueRequestOrBuilder> checkDownloadQueueRequestBuilder_;
            private CheckDownloadQueueRequest checkDownloadQueueRequest_;
            private SingleFieldBuilderV3<CheckDownloadQueueResponse, CheckDownloadQueueResponse.Builder, CheckDownloadQueueResponseOrBuilder> checkDownloadQueueResponseBuilder_;
            private CheckDownloadQueueResponse checkDownloadQueueResponse_;
            private SingleFieldBuilderV3<ContactsUpdateRequestNotification, ContactsUpdateRequestNotification.Builder, ContactsUpdateRequestNotificationOrBuilder> contactsUpdateRequestNotificationBuilder_;
            private ContactsUpdateRequestNotification contactsUpdateRequestNotification_;
            private SingleFieldBuilderV3<CutWellnessFilesRequest, CutWellnessFilesRequest.Builder, CutWellnessFilesRequestOrBuilder> cutWellnessFilesRequestBuilder_;
            private CutWellnessFilesRequest cutWellnessFilesRequest_;
            private SingleFieldBuilderV3<CutWellnessFilesResponse, CutWellnessFilesResponse.Builder, CutWellnessFilesResponseOrBuilder> cutWellnessFilesResponseBuilder_;
            private CutWellnessFilesResponse cutWellnessFilesResponse_;
            private SingleFieldBuilderV3<LifestyleLoggingUpdateRequestNotification, LifestyleLoggingUpdateRequestNotification.Builder, LifestyleLoggingUpdateRequestNotificationOrBuilder> lifestyleLoggingUpdateRequestNotificationBuilder_;
            private LifestyleLoggingUpdateRequestNotification lifestyleLoggingUpdateRequestNotification_;
            private SingleFieldBuilderV3<WellnessThresholdMetNotification, WellnessThresholdMetNotification.Builder, WellnessThresholdMetNotificationOrBuilder> wellnessThresholdMetNotificationBuilder_;
            private WellnessThresholdMetNotification wellnessThresholdMetNotification_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Service service) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<CheckDownloadQueueRequest, CheckDownloadQueueRequest.Builder, CheckDownloadQueueRequestOrBuilder> singleFieldBuilderV3 = this.checkDownloadQueueRequestBuilder_;
                    service.checkDownloadQueueRequest_ = singleFieldBuilderV3 == null ? this.checkDownloadQueueRequest_ : (CheckDownloadQueueRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<CheckDownloadQueueResponse, CheckDownloadQueueResponse.Builder, CheckDownloadQueueResponseOrBuilder> singleFieldBuilderV4 = this.checkDownloadQueueResponseBuilder_;
                    service.checkDownloadQueueResponse_ = singleFieldBuilderV4 == null ? this.checkDownloadQueueResponse_ : (CheckDownloadQueueResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<CutWellnessFilesRequest, CutWellnessFilesRequest.Builder, CutWellnessFilesRequestOrBuilder> singleFieldBuilderV5 = this.cutWellnessFilesRequestBuilder_;
                    service.cutWellnessFilesRequest_ = singleFieldBuilderV5 == null ? this.cutWellnessFilesRequest_ : (CutWellnessFilesRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<CutWellnessFilesResponse, CutWellnessFilesResponse.Builder, CutWellnessFilesResponseOrBuilder> singleFieldBuilderV6 = this.cutWellnessFilesResponseBuilder_;
                    service.cutWellnessFilesResponse_ = singleFieldBuilderV6 == null ? this.cutWellnessFilesResponse_ : (CutWellnessFilesResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<WellnessThresholdMetNotification, WellnessThresholdMetNotification.Builder, WellnessThresholdMetNotificationOrBuilder> singleFieldBuilderV7 = this.wellnessThresholdMetNotificationBuilder_;
                    service.wellnessThresholdMetNotification_ = singleFieldBuilderV7 == null ? this.wellnessThresholdMetNotification_ : (WellnessThresholdMetNotification) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<ContactsUpdateRequestNotification, ContactsUpdateRequestNotification.Builder, ContactsUpdateRequestNotificationOrBuilder> singleFieldBuilderV8 = this.contactsUpdateRequestNotificationBuilder_;
                    service.contactsUpdateRequestNotification_ = singleFieldBuilderV8 == null ? this.contactsUpdateRequestNotification_ : (ContactsUpdateRequestNotification) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<LifestyleLoggingUpdateRequestNotification, LifestyleLoggingUpdateRequestNotification.Builder, LifestyleLoggingUpdateRequestNotificationOrBuilder> singleFieldBuilderV9 = this.lifestyleLoggingUpdateRequestNotificationBuilder_;
                    service.lifestyleLoggingUpdateRequestNotification_ = singleFieldBuilderV9 == null ? this.lifestyleLoggingUpdateRequestNotification_ : (LifestyleLoggingUpdateRequestNotification) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                service.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<CheckDownloadQueueRequest, CheckDownloadQueueRequest.Builder, CheckDownloadQueueRequestOrBuilder> getCheckDownloadQueueRequestFieldBuilder() {
                if (this.checkDownloadQueueRequestBuilder_ == null) {
                    this.checkDownloadQueueRequestBuilder_ = new SingleFieldBuilderV3<>(getCheckDownloadQueueRequest(), getParentForChildren(), isClean());
                    this.checkDownloadQueueRequest_ = null;
                }
                return this.checkDownloadQueueRequestBuilder_;
            }

            private SingleFieldBuilderV3<CheckDownloadQueueResponse, CheckDownloadQueueResponse.Builder, CheckDownloadQueueResponseOrBuilder> getCheckDownloadQueueResponseFieldBuilder() {
                if (this.checkDownloadQueueResponseBuilder_ == null) {
                    this.checkDownloadQueueResponseBuilder_ = new SingleFieldBuilderV3<>(getCheckDownloadQueueResponse(), getParentForChildren(), isClean());
                    this.checkDownloadQueueResponse_ = null;
                }
                return this.checkDownloadQueueResponseBuilder_;
            }

            private SingleFieldBuilderV3<ContactsUpdateRequestNotification, ContactsUpdateRequestNotification.Builder, ContactsUpdateRequestNotificationOrBuilder> getContactsUpdateRequestNotificationFieldBuilder() {
                if (this.contactsUpdateRequestNotificationBuilder_ == null) {
                    this.contactsUpdateRequestNotificationBuilder_ = new SingleFieldBuilderV3<>(getContactsUpdateRequestNotification(), getParentForChildren(), isClean());
                    this.contactsUpdateRequestNotification_ = null;
                }
                return this.contactsUpdateRequestNotificationBuilder_;
            }

            private SingleFieldBuilderV3<CutWellnessFilesRequest, CutWellnessFilesRequest.Builder, CutWellnessFilesRequestOrBuilder> getCutWellnessFilesRequestFieldBuilder() {
                if (this.cutWellnessFilesRequestBuilder_ == null) {
                    this.cutWellnessFilesRequestBuilder_ = new SingleFieldBuilderV3<>(getCutWellnessFilesRequest(), getParentForChildren(), isClean());
                    this.cutWellnessFilesRequest_ = null;
                }
                return this.cutWellnessFilesRequestBuilder_;
            }

            private SingleFieldBuilderV3<CutWellnessFilesResponse, CutWellnessFilesResponse.Builder, CutWellnessFilesResponseOrBuilder> getCutWellnessFilesResponseFieldBuilder() {
                if (this.cutWellnessFilesResponseBuilder_ == null) {
                    this.cutWellnessFilesResponseBuilder_ = new SingleFieldBuilderV3<>(getCutWellnessFilesResponse(), getParentForChildren(), isClean());
                    this.cutWellnessFilesResponse_ = null;
                }
                return this.cutWellnessFilesResponseBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_Service_descriptor;
            }

            private SingleFieldBuilderV3<LifestyleLoggingUpdateRequestNotification, LifestyleLoggingUpdateRequestNotification.Builder, LifestyleLoggingUpdateRequestNotificationOrBuilder> getLifestyleLoggingUpdateRequestNotificationFieldBuilder() {
                if (this.lifestyleLoggingUpdateRequestNotificationBuilder_ == null) {
                    this.lifestyleLoggingUpdateRequestNotificationBuilder_ = new SingleFieldBuilderV3<>(getLifestyleLoggingUpdateRequestNotification(), getParentForChildren(), isClean());
                    this.lifestyleLoggingUpdateRequestNotification_ = null;
                }
                return this.lifestyleLoggingUpdateRequestNotificationBuilder_;
            }

            private SingleFieldBuilderV3<WellnessThresholdMetNotification, WellnessThresholdMetNotification.Builder, WellnessThresholdMetNotificationOrBuilder> getWellnessThresholdMetNotificationFieldBuilder() {
                if (this.wellnessThresholdMetNotificationBuilder_ == null) {
                    this.wellnessThresholdMetNotificationBuilder_ = new SingleFieldBuilderV3<>(getWellnessThresholdMetNotification(), getParentForChildren(), isClean());
                    this.wellnessThresholdMetNotification_ = null;
                }
                return this.wellnessThresholdMetNotificationBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getCheckDownloadQueueRequestFieldBuilder();
                    getCheckDownloadQueueResponseFieldBuilder();
                    getCutWellnessFilesRequestFieldBuilder();
                    getCutWellnessFilesResponseFieldBuilder();
                    getWellnessThresholdMetNotificationFieldBuilder();
                    getContactsUpdateRequestNotificationFieldBuilder();
                    getLifestyleLoggingUpdateRequestNotificationFieldBuilder();
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
                this.checkDownloadQueueRequest_ = null;
                SingleFieldBuilderV3<CheckDownloadQueueRequest, CheckDownloadQueueRequest.Builder, CheckDownloadQueueRequestOrBuilder> singleFieldBuilderV3 = this.checkDownloadQueueRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.checkDownloadQueueRequestBuilder_ = null;
                }
                this.checkDownloadQueueResponse_ = null;
                SingleFieldBuilderV3<CheckDownloadQueueResponse, CheckDownloadQueueResponse.Builder, CheckDownloadQueueResponseOrBuilder> singleFieldBuilderV4 = this.checkDownloadQueueResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.checkDownloadQueueResponseBuilder_ = null;
                }
                this.cutWellnessFilesRequest_ = null;
                SingleFieldBuilderV3<CutWellnessFilesRequest, CutWellnessFilesRequest.Builder, CutWellnessFilesRequestOrBuilder> singleFieldBuilderV5 = this.cutWellnessFilesRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.cutWellnessFilesRequestBuilder_ = null;
                }
                this.cutWellnessFilesResponse_ = null;
                SingleFieldBuilderV3<CutWellnessFilesResponse, CutWellnessFilesResponse.Builder, CutWellnessFilesResponseOrBuilder> singleFieldBuilderV6 = this.cutWellnessFilesResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.cutWellnessFilesResponseBuilder_ = null;
                }
                this.wellnessThresholdMetNotification_ = null;
                SingleFieldBuilderV3<WellnessThresholdMetNotification, WellnessThresholdMetNotification.Builder, WellnessThresholdMetNotificationOrBuilder> singleFieldBuilderV7 = this.wellnessThresholdMetNotificationBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.wellnessThresholdMetNotificationBuilder_ = null;
                }
                this.contactsUpdateRequestNotification_ = null;
                SingleFieldBuilderV3<ContactsUpdateRequestNotification, ContactsUpdateRequestNotification.Builder, ContactsUpdateRequestNotificationOrBuilder> singleFieldBuilderV8 = this.contactsUpdateRequestNotificationBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.contactsUpdateRequestNotificationBuilder_ = null;
                }
                this.lifestyleLoggingUpdateRequestNotification_ = null;
                SingleFieldBuilderV3<LifestyleLoggingUpdateRequestNotification, LifestyleLoggingUpdateRequestNotification.Builder, LifestyleLoggingUpdateRequestNotificationOrBuilder> singleFieldBuilderV9 = this.lifestyleLoggingUpdateRequestNotificationBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.lifestyleLoggingUpdateRequestNotificationBuilder_ = null;
                }
                return this;
            }

            public Builder clearCheckDownloadQueueRequest() {
                this.bitField0_ &= -2;
                this.checkDownloadQueueRequest_ = null;
                SingleFieldBuilderV3<CheckDownloadQueueRequest, CheckDownloadQueueRequest.Builder, CheckDownloadQueueRequestOrBuilder> singleFieldBuilderV3 = this.checkDownloadQueueRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.checkDownloadQueueRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearCheckDownloadQueueResponse() {
                this.bitField0_ &= -3;
                this.checkDownloadQueueResponse_ = null;
                SingleFieldBuilderV3<CheckDownloadQueueResponse, CheckDownloadQueueResponse.Builder, CheckDownloadQueueResponseOrBuilder> singleFieldBuilderV3 = this.checkDownloadQueueResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.checkDownloadQueueResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearContactsUpdateRequestNotification() {
                this.bitField0_ &= -33;
                this.contactsUpdateRequestNotification_ = null;
                SingleFieldBuilderV3<ContactsUpdateRequestNotification, ContactsUpdateRequestNotification.Builder, ContactsUpdateRequestNotificationOrBuilder> singleFieldBuilderV3 = this.contactsUpdateRequestNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.contactsUpdateRequestNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearCutWellnessFilesRequest() {
                this.bitField0_ &= -5;
                this.cutWellnessFilesRequest_ = null;
                SingleFieldBuilderV3<CutWellnessFilesRequest, CutWellnessFilesRequest.Builder, CutWellnessFilesRequestOrBuilder> singleFieldBuilderV3 = this.cutWellnessFilesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.cutWellnessFilesRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearCutWellnessFilesResponse() {
                this.bitField0_ &= -9;
                this.cutWellnessFilesResponse_ = null;
                SingleFieldBuilderV3<CutWellnessFilesResponse, CutWellnessFilesResponse.Builder, CutWellnessFilesResponseOrBuilder> singleFieldBuilderV3 = this.cutWellnessFilesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.cutWellnessFilesResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearLifestyleLoggingUpdateRequestNotification() {
                this.bitField0_ &= -65;
                this.lifestyleLoggingUpdateRequestNotification_ = null;
                SingleFieldBuilderV3<LifestyleLoggingUpdateRequestNotification, LifestyleLoggingUpdateRequestNotification.Builder, LifestyleLoggingUpdateRequestNotificationOrBuilder> singleFieldBuilderV3 = this.lifestyleLoggingUpdateRequestNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.lifestyleLoggingUpdateRequestNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearWellnessThresholdMetNotification() {
                this.bitField0_ &= -17;
                this.wellnessThresholdMetNotification_ = null;
                SingleFieldBuilderV3<WellnessThresholdMetNotification, WellnessThresholdMetNotification.Builder, WellnessThresholdMetNotificationOrBuilder> singleFieldBuilderV3 = this.wellnessThresholdMetNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.wellnessThresholdMetNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
            public CheckDownloadQueueRequest getCheckDownloadQueueRequest() {
                SingleFieldBuilderV3<CheckDownloadQueueRequest, CheckDownloadQueueRequest.Builder, CheckDownloadQueueRequestOrBuilder> singleFieldBuilderV3 = this.checkDownloadQueueRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CheckDownloadQueueRequest) singleFieldBuilderV3.getMessage();
                }
                CheckDownloadQueueRequest checkDownloadQueueRequest = this.checkDownloadQueueRequest_;
                return checkDownloadQueueRequest == null ? CheckDownloadQueueRequest.getDefaultInstance() : checkDownloadQueueRequest;
            }

            public CheckDownloadQueueRequest.Builder getCheckDownloadQueueRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (CheckDownloadQueueRequest.Builder) getCheckDownloadQueueRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
            public CheckDownloadQueueRequestOrBuilder getCheckDownloadQueueRequestOrBuilder() {
                SingleFieldBuilderV3<CheckDownloadQueueRequest, CheckDownloadQueueRequest.Builder, CheckDownloadQueueRequestOrBuilder> singleFieldBuilderV3 = this.checkDownloadQueueRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CheckDownloadQueueRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CheckDownloadQueueRequest checkDownloadQueueRequest = this.checkDownloadQueueRequest_;
                return checkDownloadQueueRequest == null ? CheckDownloadQueueRequest.getDefaultInstance() : checkDownloadQueueRequest;
            }

            @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
            public CheckDownloadQueueResponse getCheckDownloadQueueResponse() {
                SingleFieldBuilderV3<CheckDownloadQueueResponse, CheckDownloadQueueResponse.Builder, CheckDownloadQueueResponseOrBuilder> singleFieldBuilderV3 = this.checkDownloadQueueResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CheckDownloadQueueResponse) singleFieldBuilderV3.getMessage();
                }
                CheckDownloadQueueResponse checkDownloadQueueResponse = this.checkDownloadQueueResponse_;
                return checkDownloadQueueResponse == null ? CheckDownloadQueueResponse.getDefaultInstance() : checkDownloadQueueResponse;
            }

            public CheckDownloadQueueResponse.Builder getCheckDownloadQueueResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (CheckDownloadQueueResponse.Builder) getCheckDownloadQueueResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
            public CheckDownloadQueueResponseOrBuilder getCheckDownloadQueueResponseOrBuilder() {
                SingleFieldBuilderV3<CheckDownloadQueueResponse, CheckDownloadQueueResponse.Builder, CheckDownloadQueueResponseOrBuilder> singleFieldBuilderV3 = this.checkDownloadQueueResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CheckDownloadQueueResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CheckDownloadQueueResponse checkDownloadQueueResponse = this.checkDownloadQueueResponse_;
                return checkDownloadQueueResponse == null ? CheckDownloadQueueResponse.getDefaultInstance() : checkDownloadQueueResponse;
            }

            @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
            public ContactsUpdateRequestNotification getContactsUpdateRequestNotification() {
                SingleFieldBuilderV3<ContactsUpdateRequestNotification, ContactsUpdateRequestNotification.Builder, ContactsUpdateRequestNotificationOrBuilder> singleFieldBuilderV3 = this.contactsUpdateRequestNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ContactsUpdateRequestNotification) singleFieldBuilderV3.getMessage();
                }
                ContactsUpdateRequestNotification contactsUpdateRequestNotification = this.contactsUpdateRequestNotification_;
                return contactsUpdateRequestNotification == null ? ContactsUpdateRequestNotification.getDefaultInstance() : contactsUpdateRequestNotification;
            }

            public ContactsUpdateRequestNotification.Builder getContactsUpdateRequestNotificationBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (ContactsUpdateRequestNotification.Builder) getContactsUpdateRequestNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
            public ContactsUpdateRequestNotificationOrBuilder getContactsUpdateRequestNotificationOrBuilder() {
                SingleFieldBuilderV3<ContactsUpdateRequestNotification, ContactsUpdateRequestNotification.Builder, ContactsUpdateRequestNotificationOrBuilder> singleFieldBuilderV3 = this.contactsUpdateRequestNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ContactsUpdateRequestNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ContactsUpdateRequestNotification contactsUpdateRequestNotification = this.contactsUpdateRequestNotification_;
                return contactsUpdateRequestNotification == null ? ContactsUpdateRequestNotification.getDefaultInstance() : contactsUpdateRequestNotification;
            }

            @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
            public CutWellnessFilesRequest getCutWellnessFilesRequest() {
                SingleFieldBuilderV3<CutWellnessFilesRequest, CutWellnessFilesRequest.Builder, CutWellnessFilesRequestOrBuilder> singleFieldBuilderV3 = this.cutWellnessFilesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CutWellnessFilesRequest) singleFieldBuilderV3.getMessage();
                }
                CutWellnessFilesRequest cutWellnessFilesRequest = this.cutWellnessFilesRequest_;
                return cutWellnessFilesRequest == null ? CutWellnessFilesRequest.getDefaultInstance() : cutWellnessFilesRequest;
            }

            public CutWellnessFilesRequest.Builder getCutWellnessFilesRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (CutWellnessFilesRequest.Builder) getCutWellnessFilesRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
            public CutWellnessFilesRequestOrBuilder getCutWellnessFilesRequestOrBuilder() {
                SingleFieldBuilderV3<CutWellnessFilesRequest, CutWellnessFilesRequest.Builder, CutWellnessFilesRequestOrBuilder> singleFieldBuilderV3 = this.cutWellnessFilesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CutWellnessFilesRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CutWellnessFilesRequest cutWellnessFilesRequest = this.cutWellnessFilesRequest_;
                return cutWellnessFilesRequest == null ? CutWellnessFilesRequest.getDefaultInstance() : cutWellnessFilesRequest;
            }

            @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
            public CutWellnessFilesResponse getCutWellnessFilesResponse() {
                SingleFieldBuilderV3<CutWellnessFilesResponse, CutWellnessFilesResponse.Builder, CutWellnessFilesResponseOrBuilder> singleFieldBuilderV3 = this.cutWellnessFilesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CutWellnessFilesResponse) singleFieldBuilderV3.getMessage();
                }
                CutWellnessFilesResponse cutWellnessFilesResponse = this.cutWellnessFilesResponse_;
                return cutWellnessFilesResponse == null ? CutWellnessFilesResponse.getDefaultInstance() : cutWellnessFilesResponse;
            }

            public CutWellnessFilesResponse.Builder getCutWellnessFilesResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (CutWellnessFilesResponse.Builder) getCutWellnessFilesResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
            public CutWellnessFilesResponseOrBuilder getCutWellnessFilesResponseOrBuilder() {
                SingleFieldBuilderV3<CutWellnessFilesResponse, CutWellnessFilesResponse.Builder, CutWellnessFilesResponseOrBuilder> singleFieldBuilderV3 = this.cutWellnessFilesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CutWellnessFilesResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CutWellnessFilesResponse cutWellnessFilesResponse = this.cutWellnessFilesResponse_;
                return cutWellnessFilesResponse == null ? CutWellnessFilesResponse.getDefaultInstance() : cutWellnessFilesResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
            public LifestyleLoggingUpdateRequestNotification getLifestyleLoggingUpdateRequestNotification() {
                SingleFieldBuilderV3<LifestyleLoggingUpdateRequestNotification, LifestyleLoggingUpdateRequestNotification.Builder, LifestyleLoggingUpdateRequestNotificationOrBuilder> singleFieldBuilderV3 = this.lifestyleLoggingUpdateRequestNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LifestyleLoggingUpdateRequestNotification) singleFieldBuilderV3.getMessage();
                }
                LifestyleLoggingUpdateRequestNotification lifestyleLoggingUpdateRequestNotification = this.lifestyleLoggingUpdateRequestNotification_;
                return lifestyleLoggingUpdateRequestNotification == null ? LifestyleLoggingUpdateRequestNotification.getDefaultInstance() : lifestyleLoggingUpdateRequestNotification;
            }

            public LifestyleLoggingUpdateRequestNotification.Builder getLifestyleLoggingUpdateRequestNotificationBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (LifestyleLoggingUpdateRequestNotification.Builder) getLifestyleLoggingUpdateRequestNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
            public LifestyleLoggingUpdateRequestNotificationOrBuilder getLifestyleLoggingUpdateRequestNotificationOrBuilder() {
                SingleFieldBuilderV3<LifestyleLoggingUpdateRequestNotification, LifestyleLoggingUpdateRequestNotification.Builder, LifestyleLoggingUpdateRequestNotificationOrBuilder> singleFieldBuilderV3 = this.lifestyleLoggingUpdateRequestNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (LifestyleLoggingUpdateRequestNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                LifestyleLoggingUpdateRequestNotification lifestyleLoggingUpdateRequestNotification = this.lifestyleLoggingUpdateRequestNotification_;
                return lifestyleLoggingUpdateRequestNotification == null ? LifestyleLoggingUpdateRequestNotification.getDefaultInstance() : lifestyleLoggingUpdateRequestNotification;
            }

            @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
            public WellnessThresholdMetNotification getWellnessThresholdMetNotification() {
                SingleFieldBuilderV3<WellnessThresholdMetNotification, WellnessThresholdMetNotification.Builder, WellnessThresholdMetNotificationOrBuilder> singleFieldBuilderV3 = this.wellnessThresholdMetNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WellnessThresholdMetNotification) singleFieldBuilderV3.getMessage();
                }
                WellnessThresholdMetNotification wellnessThresholdMetNotification = this.wellnessThresholdMetNotification_;
                return wellnessThresholdMetNotification == null ? WellnessThresholdMetNotification.getDefaultInstance() : wellnessThresholdMetNotification;
            }

            public WellnessThresholdMetNotification.Builder getWellnessThresholdMetNotificationBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (WellnessThresholdMetNotification.Builder) getWellnessThresholdMetNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
            public WellnessThresholdMetNotificationOrBuilder getWellnessThresholdMetNotificationOrBuilder() {
                SingleFieldBuilderV3<WellnessThresholdMetNotification, WellnessThresholdMetNotification.Builder, WellnessThresholdMetNotificationOrBuilder> singleFieldBuilderV3 = this.wellnessThresholdMetNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (WellnessThresholdMetNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                WellnessThresholdMetNotification wellnessThresholdMetNotification = this.wellnessThresholdMetNotification_;
                return wellnessThresholdMetNotification == null ? WellnessThresholdMetNotification.getDefaultInstance() : wellnessThresholdMetNotification;
            }

            @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
            public boolean hasCheckDownloadQueueRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
            public boolean hasCheckDownloadQueueResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
            public boolean hasContactsUpdateRequestNotification() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
            public boolean hasCutWellnessFilesRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
            public boolean hasCutWellnessFilesResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
            public boolean hasLifestyleLoggingUpdateRequestNotification() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminConnect.ServiceOrBuilder
            public boolean hasWellnessThresholdMetNotification() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminConnect.internal_static_GDI_Proto_GarminConnect_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeCheckDownloadQueueRequest(CheckDownloadQueueRequest checkDownloadQueueRequest) {
                CheckDownloadQueueRequest checkDownloadQueueRequest2;
                SingleFieldBuilderV3<CheckDownloadQueueRequest, CheckDownloadQueueRequest.Builder, CheckDownloadQueueRequestOrBuilder> singleFieldBuilderV3 = this.checkDownloadQueueRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(checkDownloadQueueRequest);
                } else if ((this.bitField0_ & 1) == 0 || (checkDownloadQueueRequest2 = this.checkDownloadQueueRequest_) == null || checkDownloadQueueRequest2 == CheckDownloadQueueRequest.getDefaultInstance()) {
                    this.checkDownloadQueueRequest_ = checkDownloadQueueRequest;
                } else {
                    getCheckDownloadQueueRequestBuilder().mergeFrom(checkDownloadQueueRequest);
                }
                if (this.checkDownloadQueueRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeCheckDownloadQueueResponse(CheckDownloadQueueResponse checkDownloadQueueResponse) {
                CheckDownloadQueueResponse checkDownloadQueueResponse2;
                SingleFieldBuilderV3<CheckDownloadQueueResponse, CheckDownloadQueueResponse.Builder, CheckDownloadQueueResponseOrBuilder> singleFieldBuilderV3 = this.checkDownloadQueueResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(checkDownloadQueueResponse);
                } else if ((this.bitField0_ & 2) == 0 || (checkDownloadQueueResponse2 = this.checkDownloadQueueResponse_) == null || checkDownloadQueueResponse2 == CheckDownloadQueueResponse.getDefaultInstance()) {
                    this.checkDownloadQueueResponse_ = checkDownloadQueueResponse;
                } else {
                    getCheckDownloadQueueResponseBuilder().mergeFrom(checkDownloadQueueResponse);
                }
                if (this.checkDownloadQueueResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeContactsUpdateRequestNotification(ContactsUpdateRequestNotification contactsUpdateRequestNotification) {
                ContactsUpdateRequestNotification contactsUpdateRequestNotification2;
                SingleFieldBuilderV3<ContactsUpdateRequestNotification, ContactsUpdateRequestNotification.Builder, ContactsUpdateRequestNotificationOrBuilder> singleFieldBuilderV3 = this.contactsUpdateRequestNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(contactsUpdateRequestNotification);
                } else if ((this.bitField0_ & 32) == 0 || (contactsUpdateRequestNotification2 = this.contactsUpdateRequestNotification_) == null || contactsUpdateRequestNotification2 == ContactsUpdateRequestNotification.getDefaultInstance()) {
                    this.contactsUpdateRequestNotification_ = contactsUpdateRequestNotification;
                } else {
                    getContactsUpdateRequestNotificationBuilder().mergeFrom(contactsUpdateRequestNotification);
                }
                if (this.contactsUpdateRequestNotification_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeCutWellnessFilesRequest(CutWellnessFilesRequest cutWellnessFilesRequest) {
                CutWellnessFilesRequest cutWellnessFilesRequest2;
                SingleFieldBuilderV3<CutWellnessFilesRequest, CutWellnessFilesRequest.Builder, CutWellnessFilesRequestOrBuilder> singleFieldBuilderV3 = this.cutWellnessFilesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(cutWellnessFilesRequest);
                } else if ((this.bitField0_ & 4) == 0 || (cutWellnessFilesRequest2 = this.cutWellnessFilesRequest_) == null || cutWellnessFilesRequest2 == CutWellnessFilesRequest.getDefaultInstance()) {
                    this.cutWellnessFilesRequest_ = cutWellnessFilesRequest;
                } else {
                    getCutWellnessFilesRequestBuilder().mergeFrom(cutWellnessFilesRequest);
                }
                if (this.cutWellnessFilesRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeCutWellnessFilesResponse(CutWellnessFilesResponse cutWellnessFilesResponse) {
                CutWellnessFilesResponse cutWellnessFilesResponse2;
                SingleFieldBuilderV3<CutWellnessFilesResponse, CutWellnessFilesResponse.Builder, CutWellnessFilesResponseOrBuilder> singleFieldBuilderV3 = this.cutWellnessFilesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(cutWellnessFilesResponse);
                } else if ((this.bitField0_ & 8) == 0 || (cutWellnessFilesResponse2 = this.cutWellnessFilesResponse_) == null || cutWellnessFilesResponse2 == CutWellnessFilesResponse.getDefaultInstance()) {
                    this.cutWellnessFilesResponse_ = cutWellnessFilesResponse;
                } else {
                    getCutWellnessFilesResponseBuilder().mergeFrom(cutWellnessFilesResponse);
                }
                if (this.cutWellnessFilesResponse_ != null) {
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
                                    codedInputStream.readMessage(getCheckDownloadQueueRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getCheckDownloadQueueResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getCutWellnessFilesRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getCutWellnessFilesResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(getWellnessThresholdMetNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                } else if (tag == 50) {
                                    codedInputStream.readMessage(getContactsUpdateRequestNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                } else if (tag == 58) {
                                    codedInputStream.readMessage(getLifestyleLoggingUpdateRequestNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
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

            public Builder mergeLifestyleLoggingUpdateRequestNotification(LifestyleLoggingUpdateRequestNotification lifestyleLoggingUpdateRequestNotification) {
                LifestyleLoggingUpdateRequestNotification lifestyleLoggingUpdateRequestNotification2;
                SingleFieldBuilderV3<LifestyleLoggingUpdateRequestNotification, LifestyleLoggingUpdateRequestNotification.Builder, LifestyleLoggingUpdateRequestNotificationOrBuilder> singleFieldBuilderV3 = this.lifestyleLoggingUpdateRequestNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(lifestyleLoggingUpdateRequestNotification);
                } else if ((this.bitField0_ & 64) == 0 || (lifestyleLoggingUpdateRequestNotification2 = this.lifestyleLoggingUpdateRequestNotification_) == null || lifestyleLoggingUpdateRequestNotification2 == LifestyleLoggingUpdateRequestNotification.getDefaultInstance()) {
                    this.lifestyleLoggingUpdateRequestNotification_ = lifestyleLoggingUpdateRequestNotification;
                } else {
                    getLifestyleLoggingUpdateRequestNotificationBuilder().mergeFrom(lifestyleLoggingUpdateRequestNotification);
                }
                if (this.lifestyleLoggingUpdateRequestNotification_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder mergeWellnessThresholdMetNotification(WellnessThresholdMetNotification wellnessThresholdMetNotification) {
                WellnessThresholdMetNotification wellnessThresholdMetNotification2;
                SingleFieldBuilderV3<WellnessThresholdMetNotification, WellnessThresholdMetNotification.Builder, WellnessThresholdMetNotificationOrBuilder> singleFieldBuilderV3 = this.wellnessThresholdMetNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(wellnessThresholdMetNotification);
                } else if ((this.bitField0_ & 16) == 0 || (wellnessThresholdMetNotification2 = this.wellnessThresholdMetNotification_) == null || wellnessThresholdMetNotification2 == WellnessThresholdMetNotification.getDefaultInstance()) {
                    this.wellnessThresholdMetNotification_ = wellnessThresholdMetNotification;
                } else {
                    getWellnessThresholdMetNotificationBuilder().mergeFrom(wellnessThresholdMetNotification);
                }
                if (this.wellnessThresholdMetNotification_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder setCheckDownloadQueueRequest(CheckDownloadQueueRequest.Builder builder) {
                SingleFieldBuilderV3<CheckDownloadQueueRequest, CheckDownloadQueueRequest.Builder, CheckDownloadQueueRequestOrBuilder> singleFieldBuilderV3 = this.checkDownloadQueueRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.checkDownloadQueueRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setCheckDownloadQueueResponse(CheckDownloadQueueResponse.Builder builder) {
                SingleFieldBuilderV3<CheckDownloadQueueResponse, CheckDownloadQueueResponse.Builder, CheckDownloadQueueResponseOrBuilder> singleFieldBuilderV3 = this.checkDownloadQueueResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.checkDownloadQueueResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setContactsUpdateRequestNotification(ContactsUpdateRequestNotification.Builder builder) {
                SingleFieldBuilderV3<ContactsUpdateRequestNotification, ContactsUpdateRequestNotification.Builder, ContactsUpdateRequestNotificationOrBuilder> singleFieldBuilderV3 = this.contactsUpdateRequestNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.contactsUpdateRequestNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setCutWellnessFilesRequest(CutWellnessFilesRequest.Builder builder) {
                SingleFieldBuilderV3<CutWellnessFilesRequest, CutWellnessFilesRequest.Builder, CutWellnessFilesRequestOrBuilder> singleFieldBuilderV3 = this.cutWellnessFilesRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.cutWellnessFilesRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setCutWellnessFilesResponse(CutWellnessFilesResponse.Builder builder) {
                SingleFieldBuilderV3<CutWellnessFilesResponse, CutWellnessFilesResponse.Builder, CutWellnessFilesResponseOrBuilder> singleFieldBuilderV3 = this.cutWellnessFilesResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.cutWellnessFilesResponse_ = builder.build();
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

            public Builder setLifestyleLoggingUpdateRequestNotification(LifestyleLoggingUpdateRequestNotification.Builder builder) {
                SingleFieldBuilderV3<LifestyleLoggingUpdateRequestNotification, LifestyleLoggingUpdateRequestNotification.Builder, LifestyleLoggingUpdateRequestNotificationOrBuilder> singleFieldBuilderV3 = this.lifestyleLoggingUpdateRequestNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.lifestyleLoggingUpdateRequestNotification_ = builder.build();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setWellnessThresholdMetNotification(WellnessThresholdMetNotification.Builder builder) {
                SingleFieldBuilderV3<WellnessThresholdMetNotification, WellnessThresholdMetNotification.Builder, WellnessThresholdMetNotificationOrBuilder> singleFieldBuilderV3 = this.wellnessThresholdMetNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.wellnessThresholdMetNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
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

            public Builder setCheckDownloadQueueRequest(CheckDownloadQueueRequest checkDownloadQueueRequest) {
                SingleFieldBuilderV3<CheckDownloadQueueRequest, CheckDownloadQueueRequest.Builder, CheckDownloadQueueRequestOrBuilder> singleFieldBuilderV3 = this.checkDownloadQueueRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    checkDownloadQueueRequest.getClass();
                    this.checkDownloadQueueRequest_ = checkDownloadQueueRequest;
                } else {
                    singleFieldBuilderV3.setMessage(checkDownloadQueueRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setCheckDownloadQueueResponse(CheckDownloadQueueResponse checkDownloadQueueResponse) {
                SingleFieldBuilderV3<CheckDownloadQueueResponse, CheckDownloadQueueResponse.Builder, CheckDownloadQueueResponseOrBuilder> singleFieldBuilderV3 = this.checkDownloadQueueResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    checkDownloadQueueResponse.getClass();
                    this.checkDownloadQueueResponse_ = checkDownloadQueueResponse;
                } else {
                    singleFieldBuilderV3.setMessage(checkDownloadQueueResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setContactsUpdateRequestNotification(ContactsUpdateRequestNotification contactsUpdateRequestNotification) {
                SingleFieldBuilderV3<ContactsUpdateRequestNotification, ContactsUpdateRequestNotification.Builder, ContactsUpdateRequestNotificationOrBuilder> singleFieldBuilderV3 = this.contactsUpdateRequestNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    contactsUpdateRequestNotification.getClass();
                    this.contactsUpdateRequestNotification_ = contactsUpdateRequestNotification;
                } else {
                    singleFieldBuilderV3.setMessage(contactsUpdateRequestNotification);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setCutWellnessFilesRequest(CutWellnessFilesRequest cutWellnessFilesRequest) {
                SingleFieldBuilderV3<CutWellnessFilesRequest, CutWellnessFilesRequest.Builder, CutWellnessFilesRequestOrBuilder> singleFieldBuilderV3 = this.cutWellnessFilesRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    cutWellnessFilesRequest.getClass();
                    this.cutWellnessFilesRequest_ = cutWellnessFilesRequest;
                } else {
                    singleFieldBuilderV3.setMessage(cutWellnessFilesRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setCutWellnessFilesResponse(CutWellnessFilesResponse cutWellnessFilesResponse) {
                SingleFieldBuilderV3<CutWellnessFilesResponse, CutWellnessFilesResponse.Builder, CutWellnessFilesResponseOrBuilder> singleFieldBuilderV3 = this.cutWellnessFilesResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    cutWellnessFilesResponse.getClass();
                    this.cutWellnessFilesResponse_ = cutWellnessFilesResponse;
                } else {
                    singleFieldBuilderV3.setMessage(cutWellnessFilesResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setLifestyleLoggingUpdateRequestNotification(LifestyleLoggingUpdateRequestNotification lifestyleLoggingUpdateRequestNotification) {
                SingleFieldBuilderV3<LifestyleLoggingUpdateRequestNotification, LifestyleLoggingUpdateRequestNotification.Builder, LifestyleLoggingUpdateRequestNotificationOrBuilder> singleFieldBuilderV3 = this.lifestyleLoggingUpdateRequestNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    lifestyleLoggingUpdateRequestNotification.getClass();
                    this.lifestyleLoggingUpdateRequestNotification_ = lifestyleLoggingUpdateRequestNotification;
                } else {
                    singleFieldBuilderV3.setMessage(lifestyleLoggingUpdateRequestNotification);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setWellnessThresholdMetNotification(WellnessThresholdMetNotification wellnessThresholdMetNotification) {
                SingleFieldBuilderV3<WellnessThresholdMetNotification, WellnessThresholdMetNotification.Builder, WellnessThresholdMetNotificationOrBuilder> singleFieldBuilderV3 = this.wellnessThresholdMetNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    wellnessThresholdMetNotification.getClass();
                    this.wellnessThresholdMetNotification_ = wellnessThresholdMetNotification;
                } else {
                    singleFieldBuilderV3.setMessage(wellnessThresholdMetNotification);
                }
                this.bitField0_ |= 16;
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
                if (service.hasCheckDownloadQueueRequest()) {
                    mergeCheckDownloadQueueRequest(service.getCheckDownloadQueueRequest());
                }
                if (service.hasCheckDownloadQueueResponse()) {
                    mergeCheckDownloadQueueResponse(service.getCheckDownloadQueueResponse());
                }
                if (service.hasCutWellnessFilesRequest()) {
                    mergeCutWellnessFilesRequest(service.getCutWellnessFilesRequest());
                }
                if (service.hasCutWellnessFilesResponse()) {
                    mergeCutWellnessFilesResponse(service.getCutWellnessFilesResponse());
                }
                if (service.hasWellnessThresholdMetNotification()) {
                    mergeWellnessThresholdMetNotification(service.getWellnessThresholdMetNotification());
                }
                if (service.hasContactsUpdateRequestNotification()) {
                    mergeContactsUpdateRequestNotification(service.getContactsUpdateRequestNotification());
                }
                if (service.hasLifestyleLoggingUpdateRequestNotification()) {
                    mergeLifestyleLoggingUpdateRequestNotification(service.getLifestyleLoggingUpdateRequestNotification());
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

    public enum Priority implements ProtocolMessageEnum {
        STANDARD(0),
        USER_INITIATED(1);

        public static final int STANDARD_VALUE = 0;
        public static final int USER_INITIATED_VALUE = 1;
        private final int value;
        private static final Internal.EnumLiteMap<Priority> internalValueMap = new Internal.EnumLiteMap<Priority>() { // from class: com.garmin.proto.generated.GDIGarminConnect.Priority.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public Priority findValueByNumber(int i14) {
                return Priority.forNumber(i14);
            }
        };
        private static final Priority[] VALUES = values();

        Priority(int i14) {
            this.value = i14;
        }

        public static Priority forNumber(int i14) {
            if (i14 == 0) {
                return STANDARD;
            }
            if (i14 != 1) {
                return null;
            }
            return USER_INITIATED;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIGarminConnect.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<Priority> internalGetValueMap() {
            return internalValueMap;
        }

        public static Priority valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static Priority valueOf(int i14) {
            return forNumber(i14);
        }
    }
}
