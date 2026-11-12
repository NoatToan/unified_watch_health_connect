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
import java.util.Iterator;
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes4.dex */
public final class GDIGNCS {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\rGDIGNCS.proto\u0012\u000eGDI.Proto.GNCS\u001a\rGDICore.proto\u001a\u0012GDIDataTypes.proto\"\u009b\u0002\n\u0013CapabilitiesRequest\u0012\u0012\n\nnp_version\u0018\u0001 \u0001(\r\u0012P\n\u001cnotification_disabled_reason\u0018\u0002 \u0001(\u000e2*.GDI.Proto.GNCS.NotificationDisabledReason\u0012 \n\u0018default_messaging_app_id\u0018\u0003 \u0001(\t\u0012\u001d\n\u0015default_dialer_app_id\u0018\u0004 \u0001(\t2]\n\u0004gncs\u0012*.GDI.Proto.Core.FeatureCapabilitiesRequest\u0018\f \u0001(\u000b2#.GDI.Proto.GNCS.CapabilitiesRequest\"©\u0001\n\u0014CapabilitiesResponse\u0012\u0012\n\nnc_version\u0018\u0001 \u0001(\r\u0012\u001c\n\u0014support_blocked_apps\u0018\u0002 \u0001(\b2_\n\u0004gncs\u0012+.GDI.Proto.Core.FeatureCapabilitiesResponse\u0018\f \u0001(\u000b2$.GDI.Proto.GNCS.CapabilitiesResponse\"Ç\u0002\n\u0007Service\u00123\n\rmedia_request\u0018\u0001 \u0001(\u000b2\u001c.GDI.Proto.GNCS.MediaRequest\u00125\n\u000emedia_response\u0018\u0002 \u0001(\u000b2\u001d.GDI.Proto.GNCS.MediaResponse\u0012R\n\u001dblocked_app_hash_notification\u0018\u0003 \u0001(\u000b2+.GDI.Proto.GNCS.BlockedAppsHashNotification\u0012<\n\u0012app_status_request\u0018\u0004 \u0001(\u000b2 .GDI.Proto.GNCS.AppStatusRequest\u0012>\n\u0013app_status_response\u0018\u0005 \u0001(\u000b2!.GDI.Proto.GNCS.AppStatusResponse\"`\n\u0011DisplayAttributes\u0012\u0010\n\bwidth_px\u0018\u0001 \u0001(\r\u0012\u0011\n\theight_px\u0018\u0002 \u0001(\r\u0012\u0015\n\rmax_byte_size\u0018\u0003 \u0001(\r\u0012\u000f\n\u0007quality\u0018\u0004 \u0001(\r\"¢\u0001\n\fMediaRequest\u0012\u0018\n\u0010notification_uid\u0018\u0001 \u0001(\r\u0012\r\n\u0005index\u0018\u0002 \u0001(\r\u00125\n\nattributes\u0018\u0003 \u0001(\u000b2!.GDI.Proto.GNCS.DisplayAttributes\u00122\n\u000fsupported_types\u0018\u0004 \u0003(\u000e2\u0019.GDI.Proto.GNCS.MediaType\"\u009d\u0002\n\rMediaResponse\u00124\n\u0006status\u0018\u0001 \u0001(\u000e2$.GDI.Proto.GNCS.MediaResponse.Status\u0012\u0018\n\u0010notification_uid\u0018\u0002 \u0001(\r\u0012\r\n\u0005index\u0018\u0003 \u0001(\r\u0012'\n\u0004type\u0018\u0004 \u0001(\u000e2\u0019.GDI.Proto.GNCS.MediaType\u0012<\n\rtransfer_info\u0018\u0005 \u0001(\u000b2%.GDI.Proto.DataTypes.DataTransferItem\"F\n\u0006Status\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u000b\n\u0007SUCCESS\u0010\u0001\u0012\u000f\n\u000bINVALID_UID\u0010\u0002\u0012\u0011\n\rINVALID_INDEX\u0010\u0003\"8\n\u001bBlockedAppsHashNotification\u0012\u0019\n\u0011blocked_apps_hash\u0018\u0001 \u0001(\f\"x\n\u0010AppStatusRequest\u00127\n\u0006status\u0018\u0001 \u0001(\u000e2'.GDI.Proto.GNCS.AppStatusRequest.Status\"+\n\u0006Status\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u000b\n\u0007BLOCKED\u0010\u0001\u0012\u0007\n\u0003ALL\u0010\u0002\"<\n\u0011AppStatusResponse\u0012'\n\u0004apps\u0018\u0001 \u0003(\u000b2\u0019.GDI.Proto.GNCS.AppStatus\"\u0090\u0001\n\tAppStatus\u0012\u0012\n\npackage_id\u0018\u0001 \u0001(\t\u0012\f\n\u0004name\u0018\u0002 \u0001(\t\u00120\n\u0006status\u0018\u0003 \u0001(\u000e2 .GDI.Proto.GNCS.AppStatus.Status\"/\n\u0006Status\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u000b\n\u0007BLOCKED\u0010\u0001\u0012\u000b\n\u0007ALLOWED\u0010\u0002*j\n\u001aNotificationDisabledReason\u0012\u0019\n\u0015LOW_RAM_MOBILE_DEVICE\u0010\u0001\u0012\u001a\n\u0016PERMISSION_NOT_GRANTED\u0010\u0002\u0012\u0015\n\u0011SERVICE_NOT_BOUND\u0010\u0003*\u001e\n\tMediaType\u0012\u0007\n\u0003PNG\u0010\u0000\u0012\b\n\u0004JPEG\u0010\u0001B'\n\u001acom.garmin.proto.generatedB\u0007GDIGNCSH\u0003"}, new Descriptors.FileDescriptor[]{GDICore.getDescriptor(), GDIDataTypes.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GNCS_AppStatusRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GNCS_AppStatusRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GNCS_AppStatusResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GNCS_AppStatusResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GNCS_AppStatus_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GNCS_AppStatus_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GNCS_BlockedAppsHashNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GNCS_BlockedAppsHashNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GNCS_CapabilitiesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GNCS_CapabilitiesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GNCS_CapabilitiesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GNCS_CapabilitiesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GNCS_DisplayAttributes_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GNCS_DisplayAttributes_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GNCS_MediaRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GNCS_MediaRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GNCS_MediaResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GNCS_MediaResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GNCS_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GNCS_Service_fieldAccessorTable;

    public interface AppStatusOrBuilder extends MessageOrBuilder {
        String getName();

        ByteString getNameBytes();

        String getPackageId();

        ByteString getPackageIdBytes();

        AppStatus.Status getStatus();

        boolean hasName();

        boolean hasPackageId();

        boolean hasStatus();
    }

    public interface AppStatusRequestOrBuilder extends MessageOrBuilder {
        AppStatusRequest.Status getStatus();

        boolean hasStatus();
    }

    public interface AppStatusResponseOrBuilder extends MessageOrBuilder {
        AppStatus getApps(int i14);

        int getAppsCount();

        List<AppStatus> getAppsList();

        AppStatusOrBuilder getAppsOrBuilder(int i14);

        List<? extends AppStatusOrBuilder> getAppsOrBuilderList();
    }

    public interface BlockedAppsHashNotificationOrBuilder extends MessageOrBuilder {
        ByteString getBlockedAppsHash();

        boolean hasBlockedAppsHash();
    }

    public interface CapabilitiesRequestOrBuilder extends MessageOrBuilder {
        String getDefaultDialerAppId();

        ByteString getDefaultDialerAppIdBytes();

        String getDefaultMessagingAppId();

        ByteString getDefaultMessagingAppIdBytes();

        NotificationDisabledReason getNotificationDisabledReason();

        int getNpVersion();

        boolean hasDefaultDialerAppId();

        boolean hasDefaultMessagingAppId();

        boolean hasNotificationDisabledReason();

        boolean hasNpVersion();
    }

    public interface CapabilitiesResponseOrBuilder extends MessageOrBuilder {
        int getNcVersion();

        boolean getSupportBlockedApps();

        boolean hasNcVersion();

        boolean hasSupportBlockedApps();
    }

    public interface DisplayAttributesOrBuilder extends MessageOrBuilder {
        int getHeightPx();

        int getMaxByteSize();

        int getQuality();

        int getWidthPx();

        boolean hasHeightPx();

        boolean hasMaxByteSize();

        boolean hasQuality();

        boolean hasWidthPx();
    }

    public interface MediaRequestOrBuilder extends MessageOrBuilder {
        DisplayAttributes getAttributes();

        DisplayAttributesOrBuilder getAttributesOrBuilder();

        int getIndex();

        int getNotificationUid();

        MediaType getSupportedTypes(int i14);

        int getSupportedTypesCount();

        List<MediaType> getSupportedTypesList();

        boolean hasAttributes();

        boolean hasIndex();

        boolean hasNotificationUid();
    }

    public interface MediaResponseOrBuilder extends MessageOrBuilder {
        int getIndex();

        int getNotificationUid();

        MediaResponse.Status getStatus();

        GDIDataTypes.DataTransferItem getTransferInfo();

        GDIDataTypes.DataTransferItemOrBuilder getTransferInfoOrBuilder();

        MediaType getType();

        boolean hasIndex();

        boolean hasNotificationUid();

        boolean hasStatus();

        boolean hasTransferInfo();

        boolean hasType();
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
        AppStatusRequest getAppStatusRequest();

        AppStatusRequestOrBuilder getAppStatusRequestOrBuilder();

        AppStatusResponse getAppStatusResponse();

        AppStatusResponseOrBuilder getAppStatusResponseOrBuilder();

        BlockedAppsHashNotification getBlockedAppHashNotification();

        BlockedAppsHashNotificationOrBuilder getBlockedAppHashNotificationOrBuilder();

        MediaRequest getMediaRequest();

        MediaRequestOrBuilder getMediaRequestOrBuilder();

        MediaResponse getMediaResponse();

        MediaResponseOrBuilder getMediaResponseOrBuilder();

        boolean hasAppStatusRequest();

        boolean hasAppStatusResponse();

        boolean hasBlockedAppHashNotification();

        boolean hasMediaRequest();

        boolean hasMediaResponse();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_GNCS_CapabilitiesRequest_descriptor = descriptor2;
        internal_static_GDI_Proto_GNCS_CapabilitiesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"NpVersion", "NotificationDisabledReason", "DefaultMessagingAppId", "DefaultDialerAppId"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_GNCS_CapabilitiesResponse_descriptor = descriptor3;
        internal_static_GDI_Proto_GNCS_CapabilitiesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"NcVersion", "SupportBlockedApps"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_GNCS_Service_descriptor = descriptor4;
        internal_static_GDI_Proto_GNCS_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"MediaRequest", "MediaResponse", "BlockedAppHashNotification", "AppStatusRequest", "AppStatusResponse"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_GNCS_DisplayAttributes_descriptor = descriptor5;
        internal_static_GDI_Proto_GNCS_DisplayAttributes_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"WidthPx", "HeightPx", "MaxByteSize", "Quality"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_GNCS_MediaRequest_descriptor = descriptor6;
        internal_static_GDI_Proto_GNCS_MediaRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"NotificationUid", "Index", "Attributes", "SupportedTypes"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_GNCS_MediaResponse_descriptor = descriptor7;
        internal_static_GDI_Proto_GNCS_MediaResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Status", "NotificationUid", "Index", "Type", "TransferInfo"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_GNCS_BlockedAppsHashNotification_descriptor = descriptor8;
        internal_static_GDI_Proto_GNCS_BlockedAppsHashNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"BlockedAppsHash"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_GNCS_AppStatusRequest_descriptor = descriptor9;
        internal_static_GDI_Proto_GNCS_AppStatusRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Status"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_GDI_Proto_GNCS_AppStatusResponse_descriptor = descriptor10;
        internal_static_GDI_Proto_GNCS_AppStatusResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Apps"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(9);
        internal_static_GDI_Proto_GNCS_AppStatus_descriptor = descriptor11;
        internal_static_GDI_Proto_GNCS_AppStatus_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"PackageId", "Name", "Status"});
        GDICore.getDescriptor();
        GDIDataTypes.getDescriptor();
    }

    private GDIGNCS() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(CapabilitiesRequest.gncs);
        extensionRegistryLite.add(CapabilitiesResponse.gncs);
    }

    public static final class CapabilitiesResponse extends GeneratedMessageV3 implements CapabilitiesResponseOrBuilder {
        public static final int GNCS_FIELD_NUMBER = 12;
        public static final int NC_VERSION_FIELD_NUMBER = 1;
        public static final int SUPPORT_BLOCKED_APPS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int ncVersion_;
        private boolean supportBlockedApps_;
        private static final CapabilitiesResponse DEFAULT_INSTANCE = new CapabilitiesResponse();

        @Deprecated
        public static final Parser<CapabilitiesResponse> PARSER = new AbstractParser<CapabilitiesResponse>() { // from class: com.garmin.proto.generated.GDIGNCS.CapabilitiesResponse.1
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
        public static final GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesResponse, CapabilitiesResponse> gncs = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, CapabilitiesResponse.class, getDefaultInstance());

        private CapabilitiesResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.ncVersion_ = 0;
            this.supportBlockedApps_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGNCS.internal_static_GDI_Proto_GNCS_CapabilitiesResponse_descriptor;
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
            if (hasNcVersion() != capabilitiesResponse.hasNcVersion()) {
                return false;
            }
            if ((!hasNcVersion() || getNcVersion() == capabilitiesResponse.getNcVersion()) && hasSupportBlockedApps() == capabilitiesResponse.hasSupportBlockedApps()) {
                return (!hasSupportBlockedApps() || getSupportBlockedApps() == capabilitiesResponse.getSupportBlockedApps()) && getUnknownFields().equals(capabilitiesResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.CapabilitiesResponseOrBuilder
        public int getNcVersion() {
            return this.ncVersion_;
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
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.ncVersion_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBoolSize(2, this.supportBlockedApps_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.CapabilitiesResponseOrBuilder
        public boolean getSupportBlockedApps() {
            return this.supportBlockedApps_;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.CapabilitiesResponseOrBuilder
        public boolean hasNcVersion() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.CapabilitiesResponseOrBuilder
        public boolean hasSupportBlockedApps() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasNcVersion()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getNcVersion();
            }
            if (hasSupportBlockedApps()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getSupportBlockedApps());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGNCS.internal_static_GDI_Proto_GNCS_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
                codedOutputStream.writeUInt32(1, this.ncVersion_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.supportBlockedApps_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesResponseOrBuilder {
            private int bitField0_;
            private int ncVersion_;
            private boolean supportBlockedApps_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(CapabilitiesResponse capabilitiesResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    capabilitiesResponse.ncVersion_ = this.ncVersion_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    capabilitiesResponse.supportBlockedApps_ = this.supportBlockedApps_;
                    i14 |= 2;
                }
                capabilitiesResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGNCS.internal_static_GDI_Proto_GNCS_CapabilitiesResponse_descriptor;
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
                this.ncVersion_ = 0;
                this.supportBlockedApps_ = false;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearNcVersion() {
                this.bitField0_ &= -2;
                this.ncVersion_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSupportBlockedApps() {
                this.bitField0_ &= -3;
                this.supportBlockedApps_ = false;
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
                return GDIGNCS.internal_static_GDI_Proto_GNCS_CapabilitiesResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.CapabilitiesResponseOrBuilder
            public int getNcVersion() {
                return this.ncVersion_;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.CapabilitiesResponseOrBuilder
            public boolean getSupportBlockedApps() {
                return this.supportBlockedApps_;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.CapabilitiesResponseOrBuilder
            public boolean hasNcVersion() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.CapabilitiesResponseOrBuilder
            public boolean hasSupportBlockedApps() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGNCS.internal_static_GDI_Proto_GNCS_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
                                    this.ncVersion_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.supportBlockedApps_ = codedInputStream.readBool();
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

            public Builder setNcVersion(int i14) {
                this.ncVersion_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSupportBlockedApps(boolean z14) {
                this.supportBlockedApps_ = z14;
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
                if (capabilitiesResponse.hasNcVersion()) {
                    setNcVersion(capabilitiesResponse.getNcVersion());
                }
                if (capabilitiesResponse.hasSupportBlockedApps()) {
                    setSupportBlockedApps(capabilitiesResponse.getSupportBlockedApps());
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

        public /* synthetic */ CapabilitiesResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CapabilitiesResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private CapabilitiesResponse() {
            this.ncVersion_ = 0;
            this.supportBlockedApps_ = false;
            this.memoizedIsInitialized = (byte) -1;
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

    public static final class DisplayAttributes extends GeneratedMessageV3 implements DisplayAttributesOrBuilder {
        public static final int HEIGHT_PX_FIELD_NUMBER = 2;
        public static final int MAX_BYTE_SIZE_FIELD_NUMBER = 3;
        public static final int QUALITY_FIELD_NUMBER = 4;
        public static final int WIDTH_PX_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int heightPx_;
        private int maxByteSize_;
        private byte memoizedIsInitialized;
        private int quality_;
        private int widthPx_;
        private static final DisplayAttributes DEFAULT_INSTANCE = new DisplayAttributes();

        @Deprecated
        public static final Parser<DisplayAttributes> PARSER = new AbstractParser<DisplayAttributes>() { // from class: com.garmin.proto.generated.GDIGNCS.DisplayAttributes.1
            @Override // com.google.protobuf.Parser
            public DisplayAttributes parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DisplayAttributes.newBuilder();
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

        private DisplayAttributes(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.widthPx_ = 0;
            this.heightPx_ = 0;
            this.maxByteSize_ = 0;
            this.quality_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DisplayAttributes getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGNCS.internal_static_GDI_Proto_GNCS_DisplayAttributes_descriptor;
        }

        public static Builder newBuilder(DisplayAttributes displayAttributes) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(displayAttributes);
        }

        public static DisplayAttributes parseDelimitedFrom(InputStream inputStream) {
            return (DisplayAttributes) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DisplayAttributes parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DisplayAttributes> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DisplayAttributes)) {
                return super.equals(obj);
            }
            DisplayAttributes displayAttributes = (DisplayAttributes) obj;
            if (hasWidthPx() != displayAttributes.hasWidthPx()) {
                return false;
            }
            if ((hasWidthPx() && getWidthPx() != displayAttributes.getWidthPx()) || hasHeightPx() != displayAttributes.hasHeightPx()) {
                return false;
            }
            if ((hasHeightPx() && getHeightPx() != displayAttributes.getHeightPx()) || hasMaxByteSize() != displayAttributes.hasMaxByteSize()) {
                return false;
            }
            if ((!hasMaxByteSize() || getMaxByteSize() == displayAttributes.getMaxByteSize()) && hasQuality() == displayAttributes.hasQuality()) {
                return (!hasQuality() || getQuality() == displayAttributes.getQuality()) && getUnknownFields().equals(displayAttributes.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.DisplayAttributesOrBuilder
        public int getHeightPx() {
            return this.heightPx_;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.DisplayAttributesOrBuilder
        public int getMaxByteSize() {
            return this.maxByteSize_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DisplayAttributes> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.DisplayAttributesOrBuilder
        public int getQuality() {
            return this.quality_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.widthPx_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.heightPx_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.maxByteSize_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(4, this.quality_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.DisplayAttributesOrBuilder
        public int getWidthPx() {
            return this.widthPx_;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.DisplayAttributesOrBuilder
        public boolean hasHeightPx() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.DisplayAttributesOrBuilder
        public boolean hasMaxByteSize() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.DisplayAttributesOrBuilder
        public boolean hasQuality() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.DisplayAttributesOrBuilder
        public boolean hasWidthPx() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasWidthPx()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getWidthPx();
            }
            if (hasHeightPx()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getHeightPx();
            }
            if (hasMaxByteSize()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getMaxByteSize();
            }
            if (hasQuality()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getQuality();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGNCS.internal_static_GDI_Proto_GNCS_DisplayAttributes_fieldAccessorTable.ensureFieldAccessorsInitialized(DisplayAttributes.class, Builder.class);
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
            return new DisplayAttributes();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.widthPx_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.heightPx_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.maxByteSize_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.quality_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DisplayAttributesOrBuilder {
            private int bitField0_;
            private int heightPx_;
            private int maxByteSize_;
            private int quality_;
            private int widthPx_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(DisplayAttributes displayAttributes) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    displayAttributes.widthPx_ = this.widthPx_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    displayAttributes.heightPx_ = this.heightPx_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    displayAttributes.maxByteSize_ = this.maxByteSize_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    displayAttributes.quality_ = this.quality_;
                    i14 |= 8;
                }
                displayAttributes.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGNCS.internal_static_GDI_Proto_GNCS_DisplayAttributes_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DisplayAttributes build() {
                DisplayAttributes displayAttributesBuildPartial = buildPartial();
                if (displayAttributesBuildPartial.isInitialized()) {
                    return displayAttributesBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) displayAttributesBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DisplayAttributes buildPartial() {
                DisplayAttributes displayAttributes = new DisplayAttributes(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(displayAttributes);
                }
                onBuilt();
                return displayAttributes;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.widthPx_ = 0;
                this.heightPx_ = 0;
                this.maxByteSize_ = 0;
                this.quality_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearHeightPx() {
                this.bitField0_ &= -3;
                this.heightPx_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxByteSize() {
                this.bitField0_ &= -5;
                this.maxByteSize_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearQuality() {
                this.bitField0_ &= -9;
                this.quality_ = 0;
                onChanged();
                return this;
            }

            public Builder clearWidthPx() {
                this.bitField0_ &= -2;
                this.widthPx_ = 0;
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
                return GDIGNCS.internal_static_GDI_Proto_GNCS_DisplayAttributes_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.DisplayAttributesOrBuilder
            public int getHeightPx() {
                return this.heightPx_;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.DisplayAttributesOrBuilder
            public int getMaxByteSize() {
                return this.maxByteSize_;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.DisplayAttributesOrBuilder
            public int getQuality() {
                return this.quality_;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.DisplayAttributesOrBuilder
            public int getWidthPx() {
                return this.widthPx_;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.DisplayAttributesOrBuilder
            public boolean hasHeightPx() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.DisplayAttributesOrBuilder
            public boolean hasMaxByteSize() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.DisplayAttributesOrBuilder
            public boolean hasQuality() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.DisplayAttributesOrBuilder
            public boolean hasWidthPx() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGNCS.internal_static_GDI_Proto_GNCS_DisplayAttributes_fieldAccessorTable.ensureFieldAccessorsInitialized(DisplayAttributes.class, Builder.class);
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
                                    this.widthPx_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.heightPx_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.maxByteSize_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.quality_ = codedInputStream.readUInt32();
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

            public Builder setHeightPx(int i14) {
                this.heightPx_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setMaxByteSize(int i14) {
                this.maxByteSize_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setQuality(int i14) {
                this.quality_ = i14;
                this.bitField0_ |= 8;
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

            public Builder setWidthPx(int i14) {
                this.widthPx_ = i14;
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
            public DisplayAttributes getDefaultInstanceForType() {
                return DisplayAttributes.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DisplayAttributes) {
                    return mergeFrom((DisplayAttributes) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DisplayAttributes displayAttributes) {
                if (displayAttributes == DisplayAttributes.getDefaultInstance()) {
                    return this;
                }
                if (displayAttributes.hasWidthPx()) {
                    setWidthPx(displayAttributes.getWidthPx());
                }
                if (displayAttributes.hasHeightPx()) {
                    setHeightPx(displayAttributes.getHeightPx());
                }
                if (displayAttributes.hasMaxByteSize()) {
                    setMaxByteSize(displayAttributes.getMaxByteSize());
                }
                if (displayAttributes.hasQuality()) {
                    setQuality(displayAttributes.getQuality());
                }
                mergeUnknownFields(displayAttributes.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DisplayAttributes getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DisplayAttributes parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DisplayAttributes) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DisplayAttributes parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DisplayAttributes parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DisplayAttributes parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DisplayAttributes parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DisplayAttributes parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DisplayAttributes parseFrom(InputStream inputStream) {
            return (DisplayAttributes) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ DisplayAttributes(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DisplayAttributes parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DisplayAttributes) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private DisplayAttributes() {
            this.widthPx_ = 0;
            this.heightPx_ = 0;
            this.maxByteSize_ = 0;
            this.quality_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DisplayAttributes parseFrom(CodedInputStream codedInputStream) {
            return (DisplayAttributes) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DisplayAttributes parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DisplayAttributes) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class AppStatus extends GeneratedMessageV3 implements AppStatusOrBuilder {
        public static final int NAME_FIELD_NUMBER = 2;
        public static final int PACKAGE_ID_FIELD_NUMBER = 1;
        public static final int STATUS_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private volatile Object name_;
        private volatile Object packageId_;
        private int status_;
        private static final AppStatus DEFAULT_INSTANCE = new AppStatus();

        @Deprecated
        public static final Parser<AppStatus> PARSER = new AbstractParser<AppStatus>() { // from class: com.garmin.proto.generated.GDIGNCS.AppStatus.1
            @Override // com.google.protobuf.Parser
            public AppStatus parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AppStatus.newBuilder();
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

        private AppStatus() {
            this.packageId_ = "";
            this.name_ = "";
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.packageId_ = "";
            this.name_ = "";
            this.status_ = 0;
        }

        public static AppStatus getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGNCS.internal_static_GDI_Proto_GNCS_AppStatus_descriptor;
        }

        public static Builder newBuilder(AppStatus appStatus) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(appStatus);
        }

        public static AppStatus parseDelimitedFrom(InputStream inputStream) {
            return (AppStatus) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AppStatus parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AppStatus> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AppStatus)) {
                return super.equals(obj);
            }
            AppStatus appStatus = (AppStatus) obj;
            if (hasPackageId() != appStatus.hasPackageId()) {
                return false;
            }
            if ((hasPackageId() && !getPackageId().equals(appStatus.getPackageId())) || hasName() != appStatus.hasName()) {
                return false;
            }
            if ((!hasName() || getName().equals(appStatus.getName())) && hasStatus() == appStatus.hasStatus()) {
                return (!hasStatus() || this.status_ == appStatus.status_) && getUnknownFields().equals(appStatus.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.AppStatusOrBuilder
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

        @Override // com.garmin.proto.generated.GDIGNCS.AppStatusOrBuilder
        public ByteString getNameBytes() {
            Object obj = this.name_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.name_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.AppStatusOrBuilder
        public String getPackageId() {
            Object obj = this.packageId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.packageId_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.AppStatusOrBuilder
        public ByteString getPackageIdBytes() {
            Object obj = this.packageId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.packageId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AppStatus> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.packageId_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += GeneratedMessageV3.computeStringSize(2, this.name_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(3, this.status_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.AppStatusOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.UNKNOWN : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.AppStatusOrBuilder
        public boolean hasName() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.AppStatusOrBuilder
        public boolean hasPackageId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.AppStatusOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasPackageId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getPackageId().hashCode();
            }
            if (hasName()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getName().hashCode();
            }
            if (hasStatus()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + this.status_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGNCS.internal_static_GDI_Proto_GNCS_AppStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(AppStatus.class, Builder.class);
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
            return new AppStatus();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.packageId_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.name_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(3, this.status_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AppStatusOrBuilder {
            private int bitField0_;
            private Object name_;
            private Object packageId_;
            private int status_;

            private Builder() {
                this.packageId_ = "";
                this.name_ = "";
                this.status_ = 0;
            }

            private void buildPartial0(AppStatus appStatus) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    appStatus.packageId_ = this.packageId_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    appStatus.name_ = this.name_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    appStatus.status_ = this.status_;
                    i14 |= 4;
                }
                appStatus.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGNCS.internal_static_GDI_Proto_GNCS_AppStatus_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AppStatus build() {
                AppStatus appStatusBuildPartial = buildPartial();
                if (appStatusBuildPartial.isInitialized()) {
                    return appStatusBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) appStatusBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AppStatus buildPartial() {
                AppStatus appStatus = new AppStatus(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(appStatus);
                }
                onBuilt();
                return appStatus;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.packageId_ = "";
                this.name_ = "";
                this.status_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearName() {
                this.name_ = AppStatus.getDefaultInstance().getName();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPackageId() {
                this.packageId_ = AppStatus.getDefaultInstance().getPackageId();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearStatus() {
                this.bitField0_ &= -5;
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
                return GDIGNCS.internal_static_GDI_Proto_GNCS_AppStatus_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.AppStatusOrBuilder
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

            @Override // com.garmin.proto.generated.GDIGNCS.AppStatusOrBuilder
            public ByteString getNameBytes() {
                Object obj = this.name_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.name_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.AppStatusOrBuilder
            public String getPackageId() {
                Object obj = this.packageId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.packageId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.AppStatusOrBuilder
            public ByteString getPackageIdBytes() {
                Object obj = this.packageId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.packageId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.AppStatusOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.UNKNOWN : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.AppStatusOrBuilder
            public boolean hasName() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.AppStatusOrBuilder
            public boolean hasPackageId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.AppStatusOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGNCS.internal_static_GDI_Proto_GNCS_AppStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(AppStatus.class, Builder.class);
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
                                    this.packageId_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.name_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    int i14 = codedInputStream.readEnum();
                                    if (Status.forNumber(i14) == null) {
                                        mergeUnknownVarintField(3, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 4;
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

            public Builder setPackageId(String str) {
                str.getClass();
                this.packageId_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setPackageIdBytes(ByteString byteString) {
                byteString.getClass();
                this.packageId_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStatus(Status status) {
                status.getClass();
                this.bitField0_ |= 4;
                this.status_ = status.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public AppStatus getDefaultInstanceForType() {
                return AppStatus.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.packageId_ = "";
                this.name_ = "";
                this.status_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AppStatus) {
                    return mergeFrom((AppStatus) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AppStatus appStatus) {
                if (appStatus == AppStatus.getDefaultInstance()) {
                    return this;
                }
                if (appStatus.hasPackageId()) {
                    this.packageId_ = appStatus.packageId_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (appStatus.hasName()) {
                    this.name_ = appStatus.name_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (appStatus.hasStatus()) {
                    setStatus(appStatus.getStatus());
                }
                mergeUnknownFields(appStatus.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AppStatus getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static AppStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AppStatus) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AppStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AppStatus parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AppStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AppStatus parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AppStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AppStatus parseFrom(InputStream inputStream) {
            return (AppStatus) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AppStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AppStatus) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AppStatus parseFrom(CodedInputStream codedInputStream) {
            return (AppStatus) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AppStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AppStatus) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private AppStatus(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.packageId_ = "";
            this.name_ = "";
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public enum Status implements ProtocolMessageEnum {
            UNKNOWN(0),
            BLOCKED(1),
            ALLOWED(2);

            public static final int ALLOWED_VALUE = 2;
            public static final int BLOCKED_VALUE = 1;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIGNCS.AppStatus.Status.1
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
                    return BLOCKED;
                }
                if (i14 != 2) {
                    return null;
                }
                return ALLOWED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return AppStatus.getDescriptor().getEnumTypes().get(0);
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

        public /* synthetic */ AppStatus(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class AppStatusRequest extends GeneratedMessageV3 implements AppStatusRequestOrBuilder {
        private static final AppStatusRequest DEFAULT_INSTANCE = new AppStatusRequest();

        @Deprecated
        public static final Parser<AppStatusRequest> PARSER = new AbstractParser<AppStatusRequest>() { // from class: com.garmin.proto.generated.GDIGNCS.AppStatusRequest.1
            @Override // com.google.protobuf.Parser
            public AppStatusRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AppStatusRequest.newBuilder();
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

        private AppStatusRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static AppStatusRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGNCS.internal_static_GDI_Proto_GNCS_AppStatusRequest_descriptor;
        }

        public static Builder newBuilder(AppStatusRequest appStatusRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(appStatusRequest);
        }

        public static AppStatusRequest parseDelimitedFrom(InputStream inputStream) {
            return (AppStatusRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AppStatusRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AppStatusRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AppStatusRequest)) {
                return super.equals(obj);
            }
            AppStatusRequest appStatusRequest = (AppStatusRequest) obj;
            if (hasStatus() != appStatusRequest.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == appStatusRequest.status_) && getUnknownFields().equals(appStatusRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AppStatusRequest> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIGNCS.AppStatusRequestOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.UNKNOWN : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.AppStatusRequestOrBuilder
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
            return GDIGNCS.internal_static_GDI_Proto_GNCS_AppStatusRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(AppStatusRequest.class, Builder.class);
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
            return new AppStatusRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AppStatusRequestOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(AppStatusRequest appStatusRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    appStatusRequest.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                appStatusRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGNCS.internal_static_GDI_Proto_GNCS_AppStatusRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AppStatusRequest build() {
                AppStatusRequest appStatusRequestBuildPartial = buildPartial();
                if (appStatusRequestBuildPartial.isInitialized()) {
                    return appStatusRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) appStatusRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AppStatusRequest buildPartial() {
                AppStatusRequest appStatusRequest = new AppStatusRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(appStatusRequest);
                }
                onBuilt();
                return appStatusRequest;
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
                return GDIGNCS.internal_static_GDI_Proto_GNCS_AppStatusRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.AppStatusRequestOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.UNKNOWN : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.AppStatusRequestOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGNCS.internal_static_GDI_Proto_GNCS_AppStatusRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(AppStatusRequest.class, Builder.class);
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
            public AppStatusRequest getDefaultInstanceForType() {
                return AppStatusRequest.getDefaultInstance();
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
                if (message instanceof AppStatusRequest) {
                    return mergeFrom((AppStatusRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(AppStatusRequest appStatusRequest) {
                if (appStatusRequest == AppStatusRequest.getDefaultInstance()) {
                    return this;
                }
                if (appStatusRequest.hasStatus()) {
                    setStatus(appStatusRequest.getStatus());
                }
                mergeUnknownFields(appStatusRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public AppStatusRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static AppStatusRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AppStatusRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AppStatusRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ AppStatusRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static AppStatusRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private AppStatusRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AppStatusRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AppStatusRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static AppStatusRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AppStatusRequest parseFrom(InputStream inputStream) {
            return (AppStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AppStatusRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AppStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AppStatusRequest parseFrom(CodedInputStream codedInputStream) {
            return (AppStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AppStatusRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AppStatusRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            UNKNOWN(0),
            BLOCKED(1),
            ALL(2);

            public static final int ALL_VALUE = 2;
            public static final int BLOCKED_VALUE = 1;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIGNCS.AppStatusRequest.Status.1
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
                    return BLOCKED;
                }
                if (i14 != 2) {
                    return null;
                }
                return ALL;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return AppStatusRequest.getDescriptor().getEnumTypes().get(0);
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

    public static final class AppStatusResponse extends GeneratedMessageV3 implements AppStatusResponseOrBuilder {
        public static final int APPS_FIELD_NUMBER = 1;
        private static final AppStatusResponse DEFAULT_INSTANCE = new AppStatusResponse();

        @Deprecated
        public static final Parser<AppStatusResponse> PARSER = new AbstractParser<AppStatusResponse>() { // from class: com.garmin.proto.generated.GDIGNCS.AppStatusResponse.1
            @Override // com.google.protobuf.Parser
            public AppStatusResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = AppStatusResponse.newBuilder();
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
        private List<AppStatus> apps_;
        private byte memoizedIsInitialized;

        private AppStatusResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.apps_ = Collections.EMPTY_LIST;
        }

        public static AppStatusResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGNCS.internal_static_GDI_Proto_GNCS_AppStatusResponse_descriptor;
        }

        public static Builder newBuilder(AppStatusResponse appStatusResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(appStatusResponse);
        }

        public static AppStatusResponse parseDelimitedFrom(InputStream inputStream) {
            return (AppStatusResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static AppStatusResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<AppStatusResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AppStatusResponse)) {
                return super.equals(obj);
            }
            AppStatusResponse appStatusResponse = (AppStatusResponse) obj;
            return getAppsList().equals(appStatusResponse.getAppsList()) && getUnknownFields().equals(appStatusResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIGNCS.AppStatusResponseOrBuilder
        public AppStatus getApps(int i14) {
            return this.apps_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIGNCS.AppStatusResponseOrBuilder
        public int getAppsCount() {
            return this.apps_.size();
        }

        @Override // com.garmin.proto.generated.GDIGNCS.AppStatusResponseOrBuilder
        public List<AppStatus> getAppsList() {
            return this.apps_;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.AppStatusResponseOrBuilder
        public AppStatusOrBuilder getAppsOrBuilder(int i14) {
            return this.apps_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIGNCS.AppStatusResponseOrBuilder
        public List<? extends AppStatusOrBuilder> getAppsOrBuilderList() {
            return this.apps_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<AppStatusResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = 0;
            for (int i15 = 0; i15 < this.apps_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.apps_.get(i15));
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
            if (getAppsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getAppsList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGNCS.internal_static_GDI_Proto_GNCS_AppStatusResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(AppStatusResponse.class, Builder.class);
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
            return new AppStatusResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.apps_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.apps_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements AppStatusResponseOrBuilder {
            private RepeatedFieldBuilderV3<AppStatus, AppStatus.Builder, AppStatusOrBuilder> appsBuilder_;
            private List<AppStatus> apps_;
            private int bitField0_;

            private Builder() {
                this.apps_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(AppStatusResponse appStatusResponse) {
            }

            private void buildPartialRepeatedFields(AppStatusResponse appStatusResponse) {
                RepeatedFieldBuilderV3<AppStatus, AppStatus.Builder, AppStatusOrBuilder> repeatedFieldBuilderV3 = this.appsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    appStatusResponse.apps_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.apps_ = Collections.unmodifiableList(this.apps_);
                    this.bitField0_ &= -2;
                }
                appStatusResponse.apps_ = this.apps_;
            }

            private void ensureAppsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.apps_ = new ArrayList(this.apps_);
                    this.bitField0_ |= 1;
                }
            }

            private RepeatedFieldBuilderV3<AppStatus, AppStatus.Builder, AppStatusOrBuilder> getAppsFieldBuilder() {
                if (this.appsBuilder_ == null) {
                    this.appsBuilder_ = new RepeatedFieldBuilderV3<>(this.apps_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.apps_ = null;
                }
                return this.appsBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGNCS.internal_static_GDI_Proto_GNCS_AppStatusResponse_descriptor;
            }

            public Builder addAllApps(Iterable<? extends AppStatus> iterable) {
                RepeatedFieldBuilderV3<AppStatus, AppStatus.Builder, AppStatusOrBuilder> repeatedFieldBuilderV3 = this.appsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureAppsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.apps_);
                onChanged();
                return this;
            }

            public Builder addApps(AppStatus.Builder builder) {
                RepeatedFieldBuilderV3<AppStatus, AppStatus.Builder, AppStatusOrBuilder> repeatedFieldBuilderV3 = this.appsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureAppsIsMutable();
                this.apps_.add(builder.build());
                onChanged();
                return this;
            }

            public AppStatus.Builder addAppsBuilder() {
                return (AppStatus.Builder) getAppsFieldBuilder().addBuilder(AppStatus.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AppStatusResponse build() {
                AppStatusResponse appStatusResponseBuildPartial = buildPartial();
                if (appStatusResponseBuildPartial.isInitialized()) {
                    return appStatusResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) appStatusResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public AppStatusResponse buildPartial() {
                AppStatusResponse appStatusResponse = new AppStatusResponse(this);
                buildPartialRepeatedFields(appStatusResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(appStatusResponse);
                }
                onBuilt();
                return appStatusResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<AppStatus, AppStatus.Builder, AppStatusOrBuilder> repeatedFieldBuilderV3 = this.appsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.apps_ = Collections.EMPTY_LIST;
                } else {
                    this.apps_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                return this;
            }

            public Builder clearApps() {
                RepeatedFieldBuilderV3<AppStatus, AppStatus.Builder, AppStatusOrBuilder> repeatedFieldBuilderV3 = this.appsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.apps_ = Collections.EMPTY_LIST;
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

            @Override // com.garmin.proto.generated.GDIGNCS.AppStatusResponseOrBuilder
            public AppStatus getApps(int i14) {
                RepeatedFieldBuilderV3<AppStatus, AppStatus.Builder, AppStatusOrBuilder> repeatedFieldBuilderV3 = this.appsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.apps_.get(i14) : (AppStatus) repeatedFieldBuilderV3.getMessage(i14);
            }

            public AppStatus.Builder getAppsBuilder(int i14) {
                return (AppStatus.Builder) getAppsFieldBuilder().getBuilder(i14);
            }

            public List<AppStatus.Builder> getAppsBuilderList() {
                return getAppsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIGNCS.AppStatusResponseOrBuilder
            public int getAppsCount() {
                RepeatedFieldBuilderV3<AppStatus, AppStatus.Builder, AppStatusOrBuilder> repeatedFieldBuilderV3 = this.appsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.apps_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIGNCS.AppStatusResponseOrBuilder
            public List<AppStatus> getAppsList() {
                RepeatedFieldBuilderV3<AppStatus, AppStatus.Builder, AppStatusOrBuilder> repeatedFieldBuilderV3 = this.appsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.apps_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIGNCS.AppStatusResponseOrBuilder
            public AppStatusOrBuilder getAppsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<AppStatus, AppStatus.Builder, AppStatusOrBuilder> repeatedFieldBuilderV3 = this.appsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.apps_.get(i14) : (AppStatusOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIGNCS.AppStatusResponseOrBuilder
            public List<? extends AppStatusOrBuilder> getAppsOrBuilderList() {
                RepeatedFieldBuilderV3<AppStatus, AppStatus.Builder, AppStatusOrBuilder> repeatedFieldBuilderV3 = this.appsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.apps_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIGNCS.internal_static_GDI_Proto_GNCS_AppStatusResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGNCS.internal_static_GDI_Proto_GNCS_AppStatusResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(AppStatusResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(AppStatusResponse appStatusResponse) {
                if (appStatusResponse == AppStatusResponse.getDefaultInstance()) {
                    return this;
                }
                if (this.appsBuilder_ == null) {
                    if (!appStatusResponse.apps_.isEmpty()) {
                        if (this.apps_.isEmpty()) {
                            this.apps_ = appStatusResponse.apps_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureAppsIsMutable();
                            this.apps_.addAll(appStatusResponse.apps_);
                        }
                        onChanged();
                    }
                } else if (!appStatusResponse.apps_.isEmpty()) {
                    boolean zIsEmpty = this.appsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<AppStatus, AppStatus.Builder, AppStatusOrBuilder> repeatedFieldBuilderV3 = this.appsBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.appsBuilder_ = null;
                        this.apps_ = appStatusResponse.apps_;
                        this.bitField0_ &= -2;
                        this.appsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getAppsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(appStatusResponse.apps_);
                    }
                }
                mergeUnknownFields(appStatusResponse.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeApps(int i14) {
                RepeatedFieldBuilderV3<AppStatus, AppStatus.Builder, AppStatusOrBuilder> repeatedFieldBuilderV3 = this.appsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureAppsIsMutable();
                this.apps_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setApps(int i14, AppStatus.Builder builder) {
                RepeatedFieldBuilderV3<AppStatus, AppStatus.Builder, AppStatusOrBuilder> repeatedFieldBuilderV3 = this.appsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureAppsIsMutable();
                this.apps_.set(i14, builder.build());
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
            public AppStatusResponse getDefaultInstanceForType() {
                return AppStatusResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.apps_ = Collections.EMPTY_LIST;
            }

            public AppStatus.Builder addAppsBuilder(int i14) {
                return (AppStatus.Builder) getAppsFieldBuilder().addBuilder(i14, AppStatus.getDefaultInstance());
            }

            public Builder addApps(int i14, AppStatus appStatus) {
                RepeatedFieldBuilderV3<AppStatus, AppStatus.Builder, AppStatusOrBuilder> repeatedFieldBuilderV3 = this.appsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    appStatus.getClass();
                    ensureAppsIsMutable();
                    this.apps_.add(i14, appStatus);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, appStatus);
                return this;
            }

            public Builder setApps(int i14, AppStatus appStatus) {
                RepeatedFieldBuilderV3<AppStatus, AppStatus.Builder, AppStatusOrBuilder> repeatedFieldBuilderV3 = this.appsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    appStatus.getClass();
                    ensureAppsIsMutable();
                    this.apps_.set(i14, appStatus);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, appStatus);
                return this;
            }

            public Builder addApps(AppStatus appStatus) {
                RepeatedFieldBuilderV3<AppStatus, AppStatus.Builder, AppStatusOrBuilder> repeatedFieldBuilderV3 = this.appsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    appStatus.getClass();
                    ensureAppsIsMutable();
                    this.apps_.add(appStatus);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(appStatus);
                return this;
            }

            public Builder addApps(int i14, AppStatus.Builder builder) {
                RepeatedFieldBuilderV3<AppStatus, AppStatus.Builder, AppStatusOrBuilder> repeatedFieldBuilderV3 = this.appsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureAppsIsMutable();
                    this.apps_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof AppStatusResponse) {
                    return mergeFrom((AppStatusResponse) message);
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
                                    AppStatus appStatus = (AppStatus) codedInputStream.readMessage(AppStatus.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<AppStatus, AppStatus.Builder, AppStatusOrBuilder> repeatedFieldBuilderV3 = this.appsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureAppsIsMutable();
                                        this.apps_.add(appStatus);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(appStatus);
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
        public AppStatusResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static AppStatusResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AppStatusResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AppStatusResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static AppStatusResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private AppStatusResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static AppStatusResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static AppStatusResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ AppStatusResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static AppStatusResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static AppStatusResponse parseFrom(InputStream inputStream) {
            return (AppStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static AppStatusResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AppStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static AppStatusResponse parseFrom(CodedInputStream codedInputStream) {
            return (AppStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static AppStatusResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (AppStatusResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class BlockedAppsHashNotification extends GeneratedMessageV3 implements BlockedAppsHashNotificationOrBuilder {
        public static final int BLOCKED_APPS_HASH_FIELD_NUMBER = 1;
        private static final BlockedAppsHashNotification DEFAULT_INSTANCE = new BlockedAppsHashNotification();

        @Deprecated
        public static final Parser<BlockedAppsHashNotification> PARSER = new AbstractParser<BlockedAppsHashNotification>() { // from class: com.garmin.proto.generated.GDIGNCS.BlockedAppsHashNotification.1
            @Override // com.google.protobuf.Parser
            public BlockedAppsHashNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = BlockedAppsHashNotification.newBuilder();
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
        private ByteString blockedAppsHash_;
        private byte memoizedIsInitialized;

        private BlockedAppsHashNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.blockedAppsHash_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static BlockedAppsHashNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGNCS.internal_static_GDI_Proto_GNCS_BlockedAppsHashNotification_descriptor;
        }

        public static Builder newBuilder(BlockedAppsHashNotification blockedAppsHashNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(blockedAppsHashNotification);
        }

        public static BlockedAppsHashNotification parseDelimitedFrom(InputStream inputStream) {
            return (BlockedAppsHashNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static BlockedAppsHashNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<BlockedAppsHashNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BlockedAppsHashNotification)) {
                return super.equals(obj);
            }
            BlockedAppsHashNotification blockedAppsHashNotification = (BlockedAppsHashNotification) obj;
            if (hasBlockedAppsHash() != blockedAppsHashNotification.hasBlockedAppsHash()) {
                return false;
            }
            return (!hasBlockedAppsHash() || getBlockedAppsHash().equals(blockedAppsHashNotification.getBlockedAppsHash())) && getUnknownFields().equals(blockedAppsHashNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIGNCS.BlockedAppsHashNotificationOrBuilder
        public ByteString getBlockedAppsHash() {
            return this.blockedAppsHash_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<BlockedAppsHashNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.blockedAppsHash_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.BlockedAppsHashNotificationOrBuilder
        public boolean hasBlockedAppsHash() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasBlockedAppsHash()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getBlockedAppsHash().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGNCS.internal_static_GDI_Proto_GNCS_BlockedAppsHashNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(BlockedAppsHashNotification.class, Builder.class);
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
            return new BlockedAppsHashNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.blockedAppsHash_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements BlockedAppsHashNotificationOrBuilder {
            private int bitField0_;
            private ByteString blockedAppsHash_;

            private Builder() {
                this.blockedAppsHash_ = ByteString.EMPTY;
            }

            private void buildPartial0(BlockedAppsHashNotification blockedAppsHashNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    blockedAppsHashNotification.blockedAppsHash_ = this.blockedAppsHash_;
                } else {
                    i14 = 0;
                }
                blockedAppsHashNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGNCS.internal_static_GDI_Proto_GNCS_BlockedAppsHashNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public BlockedAppsHashNotification build() {
                BlockedAppsHashNotification blockedAppsHashNotificationBuildPartial = buildPartial();
                if (blockedAppsHashNotificationBuildPartial.isInitialized()) {
                    return blockedAppsHashNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) blockedAppsHashNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public BlockedAppsHashNotification buildPartial() {
                BlockedAppsHashNotification blockedAppsHashNotification = new BlockedAppsHashNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(blockedAppsHashNotification);
                }
                onBuilt();
                return blockedAppsHashNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.blockedAppsHash_ = ByteString.EMPTY;
                return this;
            }

            public Builder clearBlockedAppsHash() {
                this.bitField0_ &= -2;
                this.blockedAppsHash_ = BlockedAppsHashNotification.getDefaultInstance().getBlockedAppsHash();
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

            @Override // com.garmin.proto.generated.GDIGNCS.BlockedAppsHashNotificationOrBuilder
            public ByteString getBlockedAppsHash() {
                return this.blockedAppsHash_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIGNCS.internal_static_GDI_Proto_GNCS_BlockedAppsHashNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.BlockedAppsHashNotificationOrBuilder
            public boolean hasBlockedAppsHash() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGNCS.internal_static_GDI_Proto_GNCS_BlockedAppsHashNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(BlockedAppsHashNotification.class, Builder.class);
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
                                    this.blockedAppsHash_ = codedInputStream.readBytes();
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

            public Builder setBlockedAppsHash(ByteString byteString) {
                byteString.getClass();
                this.blockedAppsHash_ = byteString;
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
            public BlockedAppsHashNotification getDefaultInstanceForType() {
                return BlockedAppsHashNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.blockedAppsHash_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof BlockedAppsHashNotification) {
                    return mergeFrom((BlockedAppsHashNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(BlockedAppsHashNotification blockedAppsHashNotification) {
                if (blockedAppsHashNotification == BlockedAppsHashNotification.getDefaultInstance()) {
                    return this;
                }
                if (blockedAppsHashNotification.hasBlockedAppsHash()) {
                    setBlockedAppsHash(blockedAppsHashNotification.getBlockedAppsHash());
                }
                mergeUnknownFields(blockedAppsHashNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public BlockedAppsHashNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static BlockedAppsHashNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BlockedAppsHashNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BlockedAppsHashNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static BlockedAppsHashNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public /* synthetic */ BlockedAppsHashNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static BlockedAppsHashNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private BlockedAppsHashNotification() {
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.blockedAppsHash_ = byteString;
        }

        public static BlockedAppsHashNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static BlockedAppsHashNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static BlockedAppsHashNotification parseFrom(InputStream inputStream) {
            return (BlockedAppsHashNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static BlockedAppsHashNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BlockedAppsHashNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static BlockedAppsHashNotification parseFrom(CodedInputStream codedInputStream) {
            return (BlockedAppsHashNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static BlockedAppsHashNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BlockedAppsHashNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CapabilitiesRequest extends GeneratedMessageV3 implements CapabilitiesRequestOrBuilder {
        public static final int DEFAULT_DIALER_APP_ID_FIELD_NUMBER = 4;
        public static final int DEFAULT_MESSAGING_APP_ID_FIELD_NUMBER = 3;
        public static final int GNCS_FIELD_NUMBER = 12;
        public static final int NOTIFICATION_DISABLED_REASON_FIELD_NUMBER = 2;
        public static final int NP_VERSION_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object defaultDialerAppId_;
        private volatile Object defaultMessagingAppId_;
        private byte memoizedIsInitialized;
        private int notificationDisabledReason_;
        private int npVersion_;
        private static final CapabilitiesRequest DEFAULT_INSTANCE = new CapabilitiesRequest();

        @Deprecated
        public static final Parser<CapabilitiesRequest> PARSER = new AbstractParser<CapabilitiesRequest>() { // from class: com.garmin.proto.generated.GDIGNCS.CapabilitiesRequest.1
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
        public static final GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesRequest, CapabilitiesRequest> gncs = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, CapabilitiesRequest.class, getDefaultInstance());

        private CapabilitiesRequest() {
            this.npVersion_ = 0;
            this.notificationDisabledReason_ = 1;
            this.defaultMessagingAppId_ = "";
            this.defaultDialerAppId_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.notificationDisabledReason_ = 1;
            this.defaultMessagingAppId_ = "";
            this.defaultDialerAppId_ = "";
        }

        public static CapabilitiesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGNCS.internal_static_GDI_Proto_GNCS_CapabilitiesRequest_descriptor;
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
            if (hasNpVersion() != capabilitiesRequest.hasNpVersion()) {
                return false;
            }
            if ((hasNpVersion() && getNpVersion() != capabilitiesRequest.getNpVersion()) || hasNotificationDisabledReason() != capabilitiesRequest.hasNotificationDisabledReason()) {
                return false;
            }
            if ((hasNotificationDisabledReason() && this.notificationDisabledReason_ != capabilitiesRequest.notificationDisabledReason_) || hasDefaultMessagingAppId() != capabilitiesRequest.hasDefaultMessagingAppId()) {
                return false;
            }
            if ((!hasDefaultMessagingAppId() || getDefaultMessagingAppId().equals(capabilitiesRequest.getDefaultMessagingAppId())) && hasDefaultDialerAppId() == capabilitiesRequest.hasDefaultDialerAppId()) {
                return (!hasDefaultDialerAppId() || getDefaultDialerAppId().equals(capabilitiesRequest.getDefaultDialerAppId())) && getUnknownFields().equals(capabilitiesRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.CapabilitiesRequestOrBuilder
        public String getDefaultDialerAppId() {
            Object obj = this.defaultDialerAppId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.defaultDialerAppId_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.CapabilitiesRequestOrBuilder
        public ByteString getDefaultDialerAppIdBytes() {
            Object obj = this.defaultDialerAppId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.defaultDialerAppId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.CapabilitiesRequestOrBuilder
        public String getDefaultMessagingAppId() {
            Object obj = this.defaultMessagingAppId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.defaultMessagingAppId_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.CapabilitiesRequestOrBuilder
        public ByteString getDefaultMessagingAppIdBytes() {
            Object obj = this.defaultMessagingAppId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.defaultMessagingAppId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.CapabilitiesRequestOrBuilder
        public NotificationDisabledReason getNotificationDisabledReason() {
            NotificationDisabledReason notificationDisabledReasonForNumber = NotificationDisabledReason.forNumber(this.notificationDisabledReason_);
            return notificationDisabledReasonForNumber == null ? NotificationDisabledReason.LOW_RAM_MOBILE_DEVICE : notificationDisabledReasonForNumber;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.CapabilitiesRequestOrBuilder
        public int getNpVersion() {
            return this.npVersion_;
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
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.npVersion_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(2, this.notificationDisabledReason_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += GeneratedMessageV3.computeStringSize(3, this.defaultMessagingAppId_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += GeneratedMessageV3.computeStringSize(4, this.defaultDialerAppId_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.CapabilitiesRequestOrBuilder
        public boolean hasDefaultDialerAppId() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.CapabilitiesRequestOrBuilder
        public boolean hasDefaultMessagingAppId() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.CapabilitiesRequestOrBuilder
        public boolean hasNotificationDisabledReason() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.CapabilitiesRequestOrBuilder
        public boolean hasNpVersion() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasNpVersion()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getNpVersion();
            }
            if (hasNotificationDisabledReason()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.notificationDisabledReason_;
            }
            if (hasDefaultMessagingAppId()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getDefaultMessagingAppId().hashCode();
            }
            if (hasDefaultDialerAppId()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getDefaultDialerAppId().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGNCS.internal_static_GDI_Proto_GNCS_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
                codedOutputStream.writeUInt32(1, this.npVersion_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.notificationDisabledReason_);
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.defaultMessagingAppId_);
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.defaultDialerAppId_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesRequestOrBuilder {
            private int bitField0_;
            private Object defaultDialerAppId_;
            private Object defaultMessagingAppId_;
            private int notificationDisabledReason_;
            private int npVersion_;

            private Builder() {
                this.notificationDisabledReason_ = 1;
                this.defaultMessagingAppId_ = "";
                this.defaultDialerAppId_ = "";
            }

            private void buildPartial0(CapabilitiesRequest capabilitiesRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    capabilitiesRequest.npVersion_ = this.npVersion_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    capabilitiesRequest.notificationDisabledReason_ = this.notificationDisabledReason_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    capabilitiesRequest.defaultMessagingAppId_ = this.defaultMessagingAppId_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    capabilitiesRequest.defaultDialerAppId_ = this.defaultDialerAppId_;
                    i14 |= 8;
                }
                capabilitiesRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGNCS.internal_static_GDI_Proto_GNCS_CapabilitiesRequest_descriptor;
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
                this.npVersion_ = 0;
                this.notificationDisabledReason_ = 1;
                this.defaultMessagingAppId_ = "";
                this.defaultDialerAppId_ = "";
                return this;
            }

            public Builder clearDefaultDialerAppId() {
                this.defaultDialerAppId_ = CapabilitiesRequest.getDefaultInstance().getDefaultDialerAppId();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearDefaultMessagingAppId() {
                this.defaultMessagingAppId_ = CapabilitiesRequest.getDefaultInstance().getDefaultMessagingAppId();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearNotificationDisabledReason() {
                this.bitField0_ &= -3;
                this.notificationDisabledReason_ = 1;
                onChanged();
                return this;
            }

            public Builder clearNpVersion() {
                this.bitField0_ &= -2;
                this.npVersion_ = 0;
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

            @Override // com.garmin.proto.generated.GDIGNCS.CapabilitiesRequestOrBuilder
            public String getDefaultDialerAppId() {
                Object obj = this.defaultDialerAppId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.defaultDialerAppId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.CapabilitiesRequestOrBuilder
            public ByteString getDefaultDialerAppIdBytes() {
                Object obj = this.defaultDialerAppId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.defaultDialerAppId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.CapabilitiesRequestOrBuilder
            public String getDefaultMessagingAppId() {
                Object obj = this.defaultMessagingAppId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.defaultMessagingAppId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.CapabilitiesRequestOrBuilder
            public ByteString getDefaultMessagingAppIdBytes() {
                Object obj = this.defaultMessagingAppId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.defaultMessagingAppId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIGNCS.internal_static_GDI_Proto_GNCS_CapabilitiesRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.CapabilitiesRequestOrBuilder
            public NotificationDisabledReason getNotificationDisabledReason() {
                NotificationDisabledReason notificationDisabledReasonForNumber = NotificationDisabledReason.forNumber(this.notificationDisabledReason_);
                return notificationDisabledReasonForNumber == null ? NotificationDisabledReason.LOW_RAM_MOBILE_DEVICE : notificationDisabledReasonForNumber;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.CapabilitiesRequestOrBuilder
            public int getNpVersion() {
                return this.npVersion_;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.CapabilitiesRequestOrBuilder
            public boolean hasDefaultDialerAppId() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.CapabilitiesRequestOrBuilder
            public boolean hasDefaultMessagingAppId() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.CapabilitiesRequestOrBuilder
            public boolean hasNotificationDisabledReason() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.CapabilitiesRequestOrBuilder
            public boolean hasNpVersion() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGNCS.internal_static_GDI_Proto_GNCS_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
                                    this.npVersion_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (NotificationDisabledReason.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.notificationDisabledReason_ = i14;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (tag == 26) {
                                    this.defaultMessagingAppId_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.defaultDialerAppId_ = codedInputStream.readBytes();
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

            public Builder setDefaultDialerAppId(String str) {
                str.getClass();
                this.defaultDialerAppId_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setDefaultDialerAppIdBytes(ByteString byteString) {
                byteString.getClass();
                this.defaultDialerAppId_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setDefaultMessagingAppId(String str) {
                str.getClass();
                this.defaultMessagingAppId_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setDefaultMessagingAppIdBytes(ByteString byteString) {
                byteString.getClass();
                this.defaultMessagingAppId_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setNotificationDisabledReason(NotificationDisabledReason notificationDisabledReason) {
                notificationDisabledReason.getClass();
                this.bitField0_ |= 2;
                this.notificationDisabledReason_ = notificationDisabledReason.getNumber();
                onChanged();
                return this;
            }

            public Builder setNpVersion(int i14) {
                this.npVersion_ = i14;
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
            public CapabilitiesRequest getDefaultInstanceForType() {
                return CapabilitiesRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.notificationDisabledReason_ = 1;
                this.defaultMessagingAppId_ = "";
                this.defaultDialerAppId_ = "";
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
                if (capabilitiesRequest.hasNpVersion()) {
                    setNpVersion(capabilitiesRequest.getNpVersion());
                }
                if (capabilitiesRequest.hasNotificationDisabledReason()) {
                    setNotificationDisabledReason(capabilitiesRequest.getNotificationDisabledReason());
                }
                if (capabilitiesRequest.hasDefaultMessagingAppId()) {
                    this.defaultMessagingAppId_ = capabilitiesRequest.defaultMessagingAppId_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (capabilitiesRequest.hasDefaultDialerAppId()) {
                    this.defaultDialerAppId_ = capabilitiesRequest.defaultDialerAppId_;
                    this.bitField0_ |= 8;
                    onChanged();
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

        public static CapabilitiesRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CapabilitiesRequest parseFrom(CodedInputStream codedInputStream) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CapabilitiesRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private CapabilitiesRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.npVersion_ = 0;
            this.notificationDisabledReason_ = 1;
            this.defaultMessagingAppId_ = "";
            this.defaultDialerAppId_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ CapabilitiesRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class MediaRequest extends GeneratedMessageV3 implements MediaRequestOrBuilder {
        public static final int ATTRIBUTES_FIELD_NUMBER = 3;
        public static final int INDEX_FIELD_NUMBER = 2;
        public static final int NOTIFICATION_UID_FIELD_NUMBER = 1;
        public static final int SUPPORTED_TYPES_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private DisplayAttributes attributes_;
        private int bitField0_;
        private int index_;
        private byte memoizedIsInitialized;
        private int notificationUid_;
        private List<Integer> supportedTypes_;
        private static final Internal.ListAdapter.Converter<Integer, MediaType> supportedTypes_converter_ = new Internal.ListAdapter.Converter<Integer, MediaType>() { // from class: com.garmin.proto.generated.GDIGNCS.MediaRequest.1
            @Override // com.google.protobuf.Internal.ListAdapter.Converter
            public MediaType convert(Integer num) {
                MediaType mediaTypeForNumber = MediaType.forNumber(num.intValue());
                return mediaTypeForNumber == null ? MediaType.PNG : mediaTypeForNumber;
            }
        };
        private static final MediaRequest DEFAULT_INSTANCE = new MediaRequest();

        @Deprecated
        public static final Parser<MediaRequest> PARSER = new AbstractParser<MediaRequest>() { // from class: com.garmin.proto.generated.GDIGNCS.MediaRequest.2
            @Override // com.google.protobuf.Parser
            public MediaRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = MediaRequest.newBuilder();
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

        private MediaRequest() {
            this.notificationUid_ = 0;
            this.index_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.supportedTypes_ = Collections.EMPTY_LIST;
        }

        public static MediaRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGNCS.internal_static_GDI_Proto_GNCS_MediaRequest_descriptor;
        }

        public static Builder newBuilder(MediaRequest mediaRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(mediaRequest);
        }

        public static MediaRequest parseDelimitedFrom(InputStream inputStream) {
            return (MediaRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MediaRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<MediaRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MediaRequest)) {
                return super.equals(obj);
            }
            MediaRequest mediaRequest = (MediaRequest) obj;
            if (hasNotificationUid() != mediaRequest.hasNotificationUid()) {
                return false;
            }
            if ((hasNotificationUid() && getNotificationUid() != mediaRequest.getNotificationUid()) || hasIndex() != mediaRequest.hasIndex()) {
                return false;
            }
            if ((!hasIndex() || getIndex() == mediaRequest.getIndex()) && hasAttributes() == mediaRequest.hasAttributes()) {
                return (!hasAttributes() || getAttributes().equals(mediaRequest.getAttributes())) && this.supportedTypes_.equals(mediaRequest.supportedTypes_) && getUnknownFields().equals(mediaRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.MediaRequestOrBuilder
        public DisplayAttributes getAttributes() {
            DisplayAttributes displayAttributes = this.attributes_;
            return displayAttributes == null ? DisplayAttributes.getDefaultInstance() : displayAttributes;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.MediaRequestOrBuilder
        public DisplayAttributesOrBuilder getAttributesOrBuilder() {
            DisplayAttributes displayAttributes = this.attributes_;
            return displayAttributes == null ? DisplayAttributes.getDefaultInstance() : displayAttributes;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.MediaRequestOrBuilder
        public int getIndex() {
            return this.index_;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.MediaRequestOrBuilder
        public int getNotificationUid() {
            return this.notificationUid_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<MediaRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int i15 = 0;
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.notificationUid_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.index_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(3, getAttributes());
            }
            int iA = 0;
            while (true) {
                int size = this.supportedTypes_.size();
                List<Integer> list = this.supportedTypes_;
                if (i15 >= size) {
                    int serializedSize = getUnknownFields().getSerializedSize() + list.size() + iComputeUInt32Size + iA;
                    this.memoizedSize = serializedSize;
                    return serializedSize;
                }
                iA = f3.a(iA, list.get(i15));
                i15++;
            }
        }

        @Override // com.garmin.proto.generated.GDIGNCS.MediaRequestOrBuilder
        public MediaType getSupportedTypes(int i14) {
            return supportedTypes_converter_.convert(this.supportedTypes_.get(i14));
        }

        @Override // com.garmin.proto.generated.GDIGNCS.MediaRequestOrBuilder
        public int getSupportedTypesCount() {
            return this.supportedTypes_.size();
        }

        @Override // com.garmin.proto.generated.GDIGNCS.MediaRequestOrBuilder
        public List<MediaType> getSupportedTypesList() {
            return new Internal.ListAdapter(this.supportedTypes_, supportedTypes_converter_);
        }

        @Override // com.garmin.proto.generated.GDIGNCS.MediaRequestOrBuilder
        public boolean hasAttributes() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.MediaRequestOrBuilder
        public boolean hasIndex() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.MediaRequestOrBuilder
        public boolean hasNotificationUid() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasNotificationUid()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getNotificationUid();
            }
            if (hasIndex()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getIndex();
            }
            if (hasAttributes()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getAttributes().hashCode();
            }
            if (getSupportedTypesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + this.supportedTypes_.hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGNCS.internal_static_GDI_Proto_GNCS_MediaRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(MediaRequest.class, Builder.class);
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
            return new MediaRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.notificationUid_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.index_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getAttributes());
            }
            int iF = 0;
            while (iF < this.supportedTypes_.size()) {
                iF = f3.f(this.supportedTypes_.get(iF), codedOutputStream, 4, iF, 1);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MediaRequestOrBuilder {
            private SingleFieldBuilderV3<DisplayAttributes, DisplayAttributes.Builder, DisplayAttributesOrBuilder> attributesBuilder_;
            private DisplayAttributes attributes_;
            private int bitField0_;
            private int index_;
            private int notificationUid_;
            private List<Integer> supportedTypes_;

            private Builder() {
                this.supportedTypes_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(MediaRequest mediaRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    mediaRequest.notificationUid_ = this.notificationUid_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    mediaRequest.index_ = this.index_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<DisplayAttributes, DisplayAttributes.Builder, DisplayAttributesOrBuilder> singleFieldBuilderV3 = this.attributesBuilder_;
                    mediaRequest.attributes_ = singleFieldBuilderV3 == null ? this.attributes_ : (DisplayAttributes) singleFieldBuilderV3.build();
                    i14 |= 4;
                }
                mediaRequest.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(MediaRequest mediaRequest) {
                if ((this.bitField0_ & 8) != 0) {
                    this.supportedTypes_ = Collections.unmodifiableList(this.supportedTypes_);
                    this.bitField0_ &= -9;
                }
                mediaRequest.supportedTypes_ = this.supportedTypes_;
            }

            private void ensureSupportedTypesIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.supportedTypes_ = new ArrayList(this.supportedTypes_);
                    this.bitField0_ |= 8;
                }
            }

            private SingleFieldBuilderV3<DisplayAttributes, DisplayAttributes.Builder, DisplayAttributesOrBuilder> getAttributesFieldBuilder() {
                if (this.attributesBuilder_ == null) {
                    this.attributesBuilder_ = new SingleFieldBuilderV3<>(getAttributes(), getParentForChildren(), isClean());
                    this.attributes_ = null;
                }
                return this.attributesBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGNCS.internal_static_GDI_Proto_GNCS_MediaRequest_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getAttributesFieldBuilder();
                }
            }

            public Builder addAllSupportedTypes(Iterable<? extends MediaType> iterable) {
                ensureSupportedTypesIsMutable();
                Iterator<? extends MediaType> it = iterable.iterator();
                while (it.hasNext()) {
                    this.supportedTypes_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addSupportedTypes(MediaType mediaType) {
                mediaType.getClass();
                ensureSupportedTypesIsMutable();
                this.supportedTypes_.add(Integer.valueOf(mediaType.getNumber()));
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MediaRequest build() {
                MediaRequest mediaRequestBuildPartial = buildPartial();
                if (mediaRequestBuildPartial.isInitialized()) {
                    return mediaRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) mediaRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MediaRequest buildPartial() {
                MediaRequest mediaRequest = new MediaRequest(this);
                buildPartialRepeatedFields(mediaRequest);
                if (this.bitField0_ != 0) {
                    buildPartial0(mediaRequest);
                }
                onBuilt();
                return mediaRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.notificationUid_ = 0;
                this.index_ = 0;
                this.attributes_ = null;
                SingleFieldBuilderV3<DisplayAttributes, DisplayAttributes.Builder, DisplayAttributesOrBuilder> singleFieldBuilderV3 = this.attributesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.attributesBuilder_ = null;
                }
                this.supportedTypes_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -9;
                return this;
            }

            public Builder clearAttributes() {
                this.bitField0_ &= -5;
                this.attributes_ = null;
                SingleFieldBuilderV3<DisplayAttributes, DisplayAttributes.Builder, DisplayAttributesOrBuilder> singleFieldBuilderV3 = this.attributesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.attributesBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearIndex() {
                this.bitField0_ &= -3;
                this.index_ = 0;
                onChanged();
                return this;
            }

            public Builder clearNotificationUid() {
                this.bitField0_ &= -2;
                this.notificationUid_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSupportedTypes() {
                this.supportedTypes_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIGNCS.MediaRequestOrBuilder
            public DisplayAttributes getAttributes() {
                SingleFieldBuilderV3<DisplayAttributes, DisplayAttributes.Builder, DisplayAttributesOrBuilder> singleFieldBuilderV3 = this.attributesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DisplayAttributes) singleFieldBuilderV3.getMessage();
                }
                DisplayAttributes displayAttributes = this.attributes_;
                return displayAttributes == null ? DisplayAttributes.getDefaultInstance() : displayAttributes;
            }

            public DisplayAttributes.Builder getAttributesBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (DisplayAttributes.Builder) getAttributesFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGNCS.MediaRequestOrBuilder
            public DisplayAttributesOrBuilder getAttributesOrBuilder() {
                SingleFieldBuilderV3<DisplayAttributes, DisplayAttributes.Builder, DisplayAttributesOrBuilder> singleFieldBuilderV3 = this.attributesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DisplayAttributesOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DisplayAttributes displayAttributes = this.attributes_;
                return displayAttributes == null ? DisplayAttributes.getDefaultInstance() : displayAttributes;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIGNCS.internal_static_GDI_Proto_GNCS_MediaRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.MediaRequestOrBuilder
            public int getIndex() {
                return this.index_;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.MediaRequestOrBuilder
            public int getNotificationUid() {
                return this.notificationUid_;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.MediaRequestOrBuilder
            public MediaType getSupportedTypes(int i14) {
                return (MediaType) MediaRequest.supportedTypes_converter_.convert(this.supportedTypes_.get(i14));
            }

            @Override // com.garmin.proto.generated.GDIGNCS.MediaRequestOrBuilder
            public int getSupportedTypesCount() {
                return this.supportedTypes_.size();
            }

            @Override // com.garmin.proto.generated.GDIGNCS.MediaRequestOrBuilder
            public List<MediaType> getSupportedTypesList() {
                return new Internal.ListAdapter(this.supportedTypes_, MediaRequest.supportedTypes_converter_);
            }

            @Override // com.garmin.proto.generated.GDIGNCS.MediaRequestOrBuilder
            public boolean hasAttributes() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.MediaRequestOrBuilder
            public boolean hasIndex() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.MediaRequestOrBuilder
            public boolean hasNotificationUid() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGNCS.internal_static_GDI_Proto_GNCS_MediaRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(MediaRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeAttributes(DisplayAttributes displayAttributes) {
                DisplayAttributes displayAttributes2;
                SingleFieldBuilderV3<DisplayAttributes, DisplayAttributes.Builder, DisplayAttributesOrBuilder> singleFieldBuilderV3 = this.attributesBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(displayAttributes);
                } else if ((this.bitField0_ & 4) == 0 || (displayAttributes2 = this.attributes_) == null || displayAttributes2 == DisplayAttributes.getDefaultInstance()) {
                    this.attributes_ = displayAttributes;
                } else {
                    getAttributesBuilder().mergeFrom(displayAttributes);
                }
                if (this.attributes_ != null) {
                    this.bitField0_ |= 4;
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
                                    this.notificationUid_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.index_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getAttributesFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    int i14 = codedInputStream.readEnum();
                                    if (MediaType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(4, i14);
                                    } else {
                                        ensureSupportedTypesIsMutable();
                                        this.supportedTypes_.add(Integer.valueOf(i14));
                                    }
                                } else if (tag == 34) {
                                    int iPushLimit = codedInputStream.pushLimit(codedInputStream.readRawVarint32());
                                    while (codedInputStream.getBytesUntilLimit() > 0) {
                                        int i15 = codedInputStream.readEnum();
                                        if (MediaType.forNumber(i15) == null) {
                                            mergeUnknownVarintField(4, i15);
                                        } else {
                                            ensureSupportedTypesIsMutable();
                                            this.supportedTypes_.add(Integer.valueOf(i15));
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

            public Builder setAttributes(DisplayAttributes.Builder builder) {
                SingleFieldBuilderV3<DisplayAttributes, DisplayAttributes.Builder, DisplayAttributesOrBuilder> singleFieldBuilderV3 = this.attributesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.attributes_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setIndex(int i14) {
                this.index_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setNotificationUid(int i14) {
                this.notificationUid_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSupportedTypes(int i14, MediaType mediaType) {
                mediaType.getClass();
                ensureSupportedTypesIsMutable();
                this.supportedTypes_.set(i14, Integer.valueOf(mediaType.getNumber()));
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public MediaRequest getDefaultInstanceForType() {
                return MediaRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.supportedTypes_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public Builder setAttributes(DisplayAttributes displayAttributes) {
                SingleFieldBuilderV3<DisplayAttributes, DisplayAttributes.Builder, DisplayAttributesOrBuilder> singleFieldBuilderV3 = this.attributesBuilder_;
                if (singleFieldBuilderV3 == null) {
                    displayAttributes.getClass();
                    this.attributes_ = displayAttributes;
                } else {
                    singleFieldBuilderV3.setMessage(displayAttributes);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof MediaRequest) {
                    return mergeFrom((MediaRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(MediaRequest mediaRequest) {
                if (mediaRequest == MediaRequest.getDefaultInstance()) {
                    return this;
                }
                if (mediaRequest.hasNotificationUid()) {
                    setNotificationUid(mediaRequest.getNotificationUid());
                }
                if (mediaRequest.hasIndex()) {
                    setIndex(mediaRequest.getIndex());
                }
                if (mediaRequest.hasAttributes()) {
                    mergeAttributes(mediaRequest.getAttributes());
                }
                if (!mediaRequest.supportedTypes_.isEmpty()) {
                    if (this.supportedTypes_.isEmpty()) {
                        this.supportedTypes_ = mediaRequest.supportedTypes_;
                        this.bitField0_ &= -9;
                    } else {
                        ensureSupportedTypesIsMutable();
                        this.supportedTypes_.addAll(mediaRequest.supportedTypes_);
                    }
                    onChanged();
                }
                mergeUnknownFields(mediaRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public MediaRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static MediaRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MediaRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MediaRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static MediaRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MediaRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static MediaRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static MediaRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static MediaRequest parseFrom(InputStream inputStream) {
            return (MediaRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private MediaRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.notificationUid_ = 0;
            this.index_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MediaRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MediaRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MediaRequest parseFrom(CodedInputStream codedInputStream) {
            return (MediaRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public /* synthetic */ MediaRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static MediaRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MediaRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class MediaResponse extends GeneratedMessageV3 implements MediaResponseOrBuilder {
        public static final int INDEX_FIELD_NUMBER = 3;
        public static final int NOTIFICATION_UID_FIELD_NUMBER = 2;
        public static final int STATUS_FIELD_NUMBER = 1;
        public static final int TRANSFER_INFO_FIELD_NUMBER = 5;
        public static final int TYPE_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int index_;
        private byte memoizedIsInitialized;
        private int notificationUid_;
        private int status_;
        private GDIDataTypes.DataTransferItem transferInfo_;
        private int type_;
        private static final MediaResponse DEFAULT_INSTANCE = new MediaResponse();

        @Deprecated
        public static final Parser<MediaResponse> PARSER = new AbstractParser<MediaResponse>() { // from class: com.garmin.proto.generated.GDIGNCS.MediaResponse.1
            @Override // com.google.protobuf.Parser
            public MediaResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = MediaResponse.newBuilder();
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

        private MediaResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.notificationUid_ = 0;
            this.index_ = 0;
            this.type_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static MediaResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGNCS.internal_static_GDI_Proto_GNCS_MediaResponse_descriptor;
        }

        public static Builder newBuilder(MediaResponse mediaResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(mediaResponse);
        }

        public static MediaResponse parseDelimitedFrom(InputStream inputStream) {
            return (MediaResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static MediaResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<MediaResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof MediaResponse)) {
                return super.equals(obj);
            }
            MediaResponse mediaResponse = (MediaResponse) obj;
            if (hasStatus() != mediaResponse.hasStatus()) {
                return false;
            }
            if ((hasStatus() && this.status_ != mediaResponse.status_) || hasNotificationUid() != mediaResponse.hasNotificationUid()) {
                return false;
            }
            if ((hasNotificationUid() && getNotificationUid() != mediaResponse.getNotificationUid()) || hasIndex() != mediaResponse.hasIndex()) {
                return false;
            }
            if ((hasIndex() && getIndex() != mediaResponse.getIndex()) || hasType() != mediaResponse.hasType()) {
                return false;
            }
            if ((!hasType() || this.type_ == mediaResponse.type_) && hasTransferInfo() == mediaResponse.hasTransferInfo()) {
                return (!hasTransferInfo() || getTransferInfo().equals(mediaResponse.getTransferInfo())) && getUnknownFields().equals(mediaResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.MediaResponseOrBuilder
        public int getIndex() {
            return this.index_;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.MediaResponseOrBuilder
        public int getNotificationUid() {
            return this.notificationUid_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<MediaResponse> getParserForType() {
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
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(2, this.notificationUid_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(3, this.index_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(4, this.type_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(5, getTransferInfo());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.MediaResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.UNKNOWN : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.MediaResponseOrBuilder
        public GDIDataTypes.DataTransferItem getTransferInfo() {
            GDIDataTypes.DataTransferItem dataTransferItem = this.transferInfo_;
            return dataTransferItem == null ? GDIDataTypes.DataTransferItem.getDefaultInstance() : dataTransferItem;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.MediaResponseOrBuilder
        public GDIDataTypes.DataTransferItemOrBuilder getTransferInfoOrBuilder() {
            GDIDataTypes.DataTransferItem dataTransferItem = this.transferInfo_;
            return dataTransferItem == null ? GDIDataTypes.DataTransferItem.getDefaultInstance() : dataTransferItem;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.MediaResponseOrBuilder
        public MediaType getType() {
            MediaType mediaTypeForNumber = MediaType.forNumber(this.type_);
            return mediaTypeForNumber == null ? MediaType.PNG : mediaTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.MediaResponseOrBuilder
        public boolean hasIndex() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.MediaResponseOrBuilder
        public boolean hasNotificationUid() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.MediaResponseOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.MediaResponseOrBuilder
        public boolean hasTransferInfo() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.MediaResponseOrBuilder
        public boolean hasType() {
            return (this.bitField0_ & 8) != 0;
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
            if (hasNotificationUid()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getNotificationUid();
            }
            if (hasIndex()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getIndex();
            }
            if (hasType()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + this.type_;
            }
            if (hasTransferInfo()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getTransferInfo().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGNCS.internal_static_GDI_Proto_GNCS_MediaResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(MediaResponse.class, Builder.class);
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
            if (!hasTransferInfo() || getTransferInfo().isInitialized()) {
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
            return new MediaResponse();
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
                codedOutputStream.writeUInt32(2, this.notificationUid_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.index_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeEnum(4, this.type_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getTransferInfo());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements MediaResponseOrBuilder {
            private int bitField0_;
            private int index_;
            private int notificationUid_;
            private int status_;
            private SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> transferInfoBuilder_;
            private GDIDataTypes.DataTransferItem transferInfo_;
            private int type_;

            private Builder() {
                this.status_ = 0;
                this.type_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(MediaResponse mediaResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    mediaResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    mediaResponse.notificationUid_ = this.notificationUid_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    mediaResponse.index_ = this.index_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    mediaResponse.type_ = this.type_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.transferInfoBuilder_;
                    mediaResponse.transferInfo_ = singleFieldBuilderV3 == null ? this.transferInfo_ : (GDIDataTypes.DataTransferItem) singleFieldBuilderV3.build();
                    i14 |= 16;
                }
                mediaResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGNCS.internal_static_GDI_Proto_GNCS_MediaResponse_descriptor;
            }

            private SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> getTransferInfoFieldBuilder() {
                if (this.transferInfoBuilder_ == null) {
                    this.transferInfoBuilder_ = new SingleFieldBuilderV3<>(getTransferInfo(), getParentForChildren(), isClean());
                    this.transferInfo_ = null;
                }
                return this.transferInfoBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getTransferInfoFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MediaResponse build() {
                MediaResponse mediaResponseBuildPartial = buildPartial();
                if (mediaResponseBuildPartial.isInitialized()) {
                    return mediaResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) mediaResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public MediaResponse buildPartial() {
                MediaResponse mediaResponse = new MediaResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(mediaResponse);
                }
                onBuilt();
                return mediaResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                this.notificationUid_ = 0;
                this.index_ = 0;
                this.type_ = 0;
                this.transferInfo_ = null;
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.transferInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.transferInfoBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearIndex() {
                this.bitField0_ &= -5;
                this.index_ = 0;
                onChanged();
                return this;
            }

            public Builder clearNotificationUid() {
                this.bitField0_ &= -3;
                this.notificationUid_ = 0;
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

            public Builder clearTransferInfo() {
                this.bitField0_ &= -17;
                this.transferInfo_ = null;
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.transferInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.transferInfoBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.bitField0_ &= -9;
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
                return GDIGNCS.internal_static_GDI_Proto_GNCS_MediaResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.MediaResponseOrBuilder
            public int getIndex() {
                return this.index_;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.MediaResponseOrBuilder
            public int getNotificationUid() {
                return this.notificationUid_;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.MediaResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.UNKNOWN : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.MediaResponseOrBuilder
            public GDIDataTypes.DataTransferItem getTransferInfo() {
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.transferInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.DataTransferItem) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.DataTransferItem dataTransferItem = this.transferInfo_;
                return dataTransferItem == null ? GDIDataTypes.DataTransferItem.getDefaultInstance() : dataTransferItem;
            }

            public GDIDataTypes.DataTransferItem.Builder getTransferInfoBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (GDIDataTypes.DataTransferItem.Builder) getTransferInfoFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGNCS.MediaResponseOrBuilder
            public GDIDataTypes.DataTransferItemOrBuilder getTransferInfoOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.transferInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.DataTransferItemOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.DataTransferItem dataTransferItem = this.transferInfo_;
                return dataTransferItem == null ? GDIDataTypes.DataTransferItem.getDefaultInstance() : dataTransferItem;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.MediaResponseOrBuilder
            public MediaType getType() {
                MediaType mediaTypeForNumber = MediaType.forNumber(this.type_);
                return mediaTypeForNumber == null ? MediaType.PNG : mediaTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.MediaResponseOrBuilder
            public boolean hasIndex() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.MediaResponseOrBuilder
            public boolean hasNotificationUid() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.MediaResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.MediaResponseOrBuilder
            public boolean hasTransferInfo() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.MediaResponseOrBuilder
            public boolean hasType() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGNCS.internal_static_GDI_Proto_GNCS_MediaResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(MediaResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasTransferInfo() || getTransferInfo().isInitialized();
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
                                } else if (tag == 16) {
                                    this.notificationUid_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.index_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    int i15 = codedInputStream.readEnum();
                                    if (MediaType.forNumber(i15) == null) {
                                        mergeUnknownVarintField(4, i15);
                                    } else {
                                        this.type_ = i15;
                                        this.bitField0_ |= 8;
                                    }
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(getTransferInfoFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeTransferInfo(GDIDataTypes.DataTransferItem dataTransferItem) {
                GDIDataTypes.DataTransferItem dataTransferItem2;
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.transferInfoBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(dataTransferItem);
                } else if ((this.bitField0_ & 16) == 0 || (dataTransferItem2 = this.transferInfo_) == null || dataTransferItem2 == GDIDataTypes.DataTransferItem.getDefaultInstance()) {
                    this.transferInfo_ = dataTransferItem;
                } else {
                    getTransferInfoBuilder().mergeFrom(dataTransferItem);
                }
                if (this.transferInfo_ != null) {
                    this.bitField0_ |= 16;
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

            public Builder setIndex(int i14) {
                this.index_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setNotificationUid(int i14) {
                this.notificationUid_ = i14;
                this.bitField0_ |= 2;
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

            public Builder setTransferInfo(GDIDataTypes.DataTransferItem.Builder builder) {
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.transferInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.transferInfo_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setType(MediaType mediaType) {
                mediaType.getClass();
                this.bitField0_ |= 8;
                this.type_ = mediaType.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public MediaResponse getDefaultInstanceForType() {
                return MediaResponse.getDefaultInstance();
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
                this.type_ = 0;
                maybeForceBuilderInitialization();
            }

            public Builder setTransferInfo(GDIDataTypes.DataTransferItem dataTransferItem) {
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.transferInfoBuilder_;
                if (singleFieldBuilderV3 == null) {
                    dataTransferItem.getClass();
                    this.transferInfo_ = dataTransferItem;
                } else {
                    singleFieldBuilderV3.setMessage(dataTransferItem);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof MediaResponse) {
                    return mergeFrom((MediaResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(MediaResponse mediaResponse) {
                if (mediaResponse == MediaResponse.getDefaultInstance()) {
                    return this;
                }
                if (mediaResponse.hasStatus()) {
                    setStatus(mediaResponse.getStatus());
                }
                if (mediaResponse.hasNotificationUid()) {
                    setNotificationUid(mediaResponse.getNotificationUid());
                }
                if (mediaResponse.hasIndex()) {
                    setIndex(mediaResponse.getIndex());
                }
                if (mediaResponse.hasType()) {
                    setType(mediaResponse.getType());
                }
                if (mediaResponse.hasTransferInfo()) {
                    mergeTransferInfo(mediaResponse.getTransferInfo());
                }
                mergeUnknownFields(mediaResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public MediaResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static MediaResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MediaResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static MediaResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static MediaResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static MediaResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static MediaResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static MediaResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static MediaResponse parseFrom(InputStream inputStream) {
            return (MediaResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ MediaResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static MediaResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MediaResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private MediaResponse() {
            this.notificationUid_ = 0;
            this.index_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
            this.type_ = 0;
        }

        public static MediaResponse parseFrom(CodedInputStream codedInputStream) {
            return (MediaResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static MediaResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (MediaResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            UNKNOWN(0),
            SUCCESS(1),
            INVALID_UID(2),
            INVALID_INDEX(3);

            public static final int INVALID_INDEX_VALUE = 3;
            public static final int INVALID_UID_VALUE = 2;
            public static final int SUCCESS_VALUE = 1;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIGNCS.MediaResponse.Status.1
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
                if (i14 == 2) {
                    return INVALID_UID;
                }
                if (i14 != 3) {
                    return null;
                }
                return INVALID_INDEX;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return MediaResponse.getDescriptor().getEnumTypes().get(0);
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
        public static final int APP_STATUS_REQUEST_FIELD_NUMBER = 4;
        public static final int APP_STATUS_RESPONSE_FIELD_NUMBER = 5;
        public static final int BLOCKED_APP_HASH_NOTIFICATION_FIELD_NUMBER = 3;
        public static final int MEDIA_REQUEST_FIELD_NUMBER = 1;
        public static final int MEDIA_RESPONSE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private AppStatusRequest appStatusRequest_;
        private AppStatusResponse appStatusResponse_;
        private int bitField0_;
        private BlockedAppsHashNotification blockedAppHashNotification_;
        private MediaRequest mediaRequest_;
        private MediaResponse mediaResponse_;
        private byte memoizedIsInitialized;
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDIGNCS.Service.1
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
            return GDIGNCS.internal_static_GDI_Proto_GNCS_Service_descriptor;
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
            if (hasMediaRequest() != service.hasMediaRequest()) {
                return false;
            }
            if ((hasMediaRequest() && !getMediaRequest().equals(service.getMediaRequest())) || hasMediaResponse() != service.hasMediaResponse()) {
                return false;
            }
            if ((hasMediaResponse() && !getMediaResponse().equals(service.getMediaResponse())) || hasBlockedAppHashNotification() != service.hasBlockedAppHashNotification()) {
                return false;
            }
            if ((hasBlockedAppHashNotification() && !getBlockedAppHashNotification().equals(service.getBlockedAppHashNotification())) || hasAppStatusRequest() != service.hasAppStatusRequest()) {
                return false;
            }
            if ((!hasAppStatusRequest() || getAppStatusRequest().equals(service.getAppStatusRequest())) && hasAppStatusResponse() == service.hasAppStatusResponse()) {
                return (!hasAppStatusResponse() || getAppStatusResponse().equals(service.getAppStatusResponse())) && getUnknownFields().equals(service.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.ServiceOrBuilder
        public AppStatusRequest getAppStatusRequest() {
            AppStatusRequest appStatusRequest = this.appStatusRequest_;
            return appStatusRequest == null ? AppStatusRequest.getDefaultInstance() : appStatusRequest;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.ServiceOrBuilder
        public AppStatusRequestOrBuilder getAppStatusRequestOrBuilder() {
            AppStatusRequest appStatusRequest = this.appStatusRequest_;
            return appStatusRequest == null ? AppStatusRequest.getDefaultInstance() : appStatusRequest;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.ServiceOrBuilder
        public AppStatusResponse getAppStatusResponse() {
            AppStatusResponse appStatusResponse = this.appStatusResponse_;
            return appStatusResponse == null ? AppStatusResponse.getDefaultInstance() : appStatusResponse;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.ServiceOrBuilder
        public AppStatusResponseOrBuilder getAppStatusResponseOrBuilder() {
            AppStatusResponse appStatusResponse = this.appStatusResponse_;
            return appStatusResponse == null ? AppStatusResponse.getDefaultInstance() : appStatusResponse;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.ServiceOrBuilder
        public BlockedAppsHashNotification getBlockedAppHashNotification() {
            BlockedAppsHashNotification blockedAppsHashNotification = this.blockedAppHashNotification_;
            return blockedAppsHashNotification == null ? BlockedAppsHashNotification.getDefaultInstance() : blockedAppsHashNotification;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.ServiceOrBuilder
        public BlockedAppsHashNotificationOrBuilder getBlockedAppHashNotificationOrBuilder() {
            BlockedAppsHashNotification blockedAppsHashNotification = this.blockedAppHashNotification_;
            return blockedAppsHashNotification == null ? BlockedAppsHashNotification.getDefaultInstance() : blockedAppsHashNotification;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.ServiceOrBuilder
        public MediaRequest getMediaRequest() {
            MediaRequest mediaRequest = this.mediaRequest_;
            return mediaRequest == null ? MediaRequest.getDefaultInstance() : mediaRequest;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.ServiceOrBuilder
        public MediaRequestOrBuilder getMediaRequestOrBuilder() {
            MediaRequest mediaRequest = this.mediaRequest_;
            return mediaRequest == null ? MediaRequest.getDefaultInstance() : mediaRequest;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.ServiceOrBuilder
        public MediaResponse getMediaResponse() {
            MediaResponse mediaResponse = this.mediaResponse_;
            return mediaResponse == null ? MediaResponse.getDefaultInstance() : mediaResponse;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.ServiceOrBuilder
        public MediaResponseOrBuilder getMediaResponseOrBuilder() {
            MediaResponse mediaResponse = this.mediaResponse_;
            return mediaResponse == null ? MediaResponse.getDefaultInstance() : mediaResponse;
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
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getMediaRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getMediaResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getBlockedAppHashNotification());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getAppStatusRequest());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getAppStatusResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.ServiceOrBuilder
        public boolean hasAppStatusRequest() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.ServiceOrBuilder
        public boolean hasAppStatusResponse() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.ServiceOrBuilder
        public boolean hasBlockedAppHashNotification() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.ServiceOrBuilder
        public boolean hasMediaRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGNCS.ServiceOrBuilder
        public boolean hasMediaResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasMediaRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getMediaRequest().hashCode();
            }
            if (hasMediaResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getMediaResponse().hashCode();
            }
            if (hasBlockedAppHashNotification()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getBlockedAppHashNotification().hashCode();
            }
            if (hasAppStatusRequest()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getAppStatusRequest().hashCode();
            }
            if (hasAppStatusResponse()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getAppStatusResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGNCS.internal_static_GDI_Proto_GNCS_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
            if (!hasMediaResponse() || getMediaResponse().isInitialized()) {
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
                codedOutputStream.writeMessage(1, getMediaRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getMediaResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getBlockedAppHashNotification());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getAppStatusRequest());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getAppStatusResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private SingleFieldBuilderV3<AppStatusRequest, AppStatusRequest.Builder, AppStatusRequestOrBuilder> appStatusRequestBuilder_;
            private AppStatusRequest appStatusRequest_;
            private SingleFieldBuilderV3<AppStatusResponse, AppStatusResponse.Builder, AppStatusResponseOrBuilder> appStatusResponseBuilder_;
            private AppStatusResponse appStatusResponse_;
            private int bitField0_;
            private SingleFieldBuilderV3<BlockedAppsHashNotification, BlockedAppsHashNotification.Builder, BlockedAppsHashNotificationOrBuilder> blockedAppHashNotificationBuilder_;
            private BlockedAppsHashNotification blockedAppHashNotification_;
            private SingleFieldBuilderV3<MediaRequest, MediaRequest.Builder, MediaRequestOrBuilder> mediaRequestBuilder_;
            private MediaRequest mediaRequest_;
            private SingleFieldBuilderV3<MediaResponse, MediaResponse.Builder, MediaResponseOrBuilder> mediaResponseBuilder_;
            private MediaResponse mediaResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Service service) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<MediaRequest, MediaRequest.Builder, MediaRequestOrBuilder> singleFieldBuilderV3 = this.mediaRequestBuilder_;
                    service.mediaRequest_ = singleFieldBuilderV3 == null ? this.mediaRequest_ : (MediaRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<MediaResponse, MediaResponse.Builder, MediaResponseOrBuilder> singleFieldBuilderV4 = this.mediaResponseBuilder_;
                    service.mediaResponse_ = singleFieldBuilderV4 == null ? this.mediaResponse_ : (MediaResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<BlockedAppsHashNotification, BlockedAppsHashNotification.Builder, BlockedAppsHashNotificationOrBuilder> singleFieldBuilderV5 = this.blockedAppHashNotificationBuilder_;
                    service.blockedAppHashNotification_ = singleFieldBuilderV5 == null ? this.blockedAppHashNotification_ : (BlockedAppsHashNotification) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<AppStatusRequest, AppStatusRequest.Builder, AppStatusRequestOrBuilder> singleFieldBuilderV6 = this.appStatusRequestBuilder_;
                    service.appStatusRequest_ = singleFieldBuilderV6 == null ? this.appStatusRequest_ : (AppStatusRequest) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<AppStatusResponse, AppStatusResponse.Builder, AppStatusResponseOrBuilder> singleFieldBuilderV7 = this.appStatusResponseBuilder_;
                    service.appStatusResponse_ = singleFieldBuilderV7 == null ? this.appStatusResponse_ : (AppStatusResponse) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                service.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<AppStatusRequest, AppStatusRequest.Builder, AppStatusRequestOrBuilder> getAppStatusRequestFieldBuilder() {
                if (this.appStatusRequestBuilder_ == null) {
                    this.appStatusRequestBuilder_ = new SingleFieldBuilderV3<>(getAppStatusRequest(), getParentForChildren(), isClean());
                    this.appStatusRequest_ = null;
                }
                return this.appStatusRequestBuilder_;
            }

            private SingleFieldBuilderV3<AppStatusResponse, AppStatusResponse.Builder, AppStatusResponseOrBuilder> getAppStatusResponseFieldBuilder() {
                if (this.appStatusResponseBuilder_ == null) {
                    this.appStatusResponseBuilder_ = new SingleFieldBuilderV3<>(getAppStatusResponse(), getParentForChildren(), isClean());
                    this.appStatusResponse_ = null;
                }
                return this.appStatusResponseBuilder_;
            }

            private SingleFieldBuilderV3<BlockedAppsHashNotification, BlockedAppsHashNotification.Builder, BlockedAppsHashNotificationOrBuilder> getBlockedAppHashNotificationFieldBuilder() {
                if (this.blockedAppHashNotificationBuilder_ == null) {
                    this.blockedAppHashNotificationBuilder_ = new SingleFieldBuilderV3<>(getBlockedAppHashNotification(), getParentForChildren(), isClean());
                    this.blockedAppHashNotification_ = null;
                }
                return this.blockedAppHashNotificationBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGNCS.internal_static_GDI_Proto_GNCS_Service_descriptor;
            }

            private SingleFieldBuilderV3<MediaRequest, MediaRequest.Builder, MediaRequestOrBuilder> getMediaRequestFieldBuilder() {
                if (this.mediaRequestBuilder_ == null) {
                    this.mediaRequestBuilder_ = new SingleFieldBuilderV3<>(getMediaRequest(), getParentForChildren(), isClean());
                    this.mediaRequest_ = null;
                }
                return this.mediaRequestBuilder_;
            }

            private SingleFieldBuilderV3<MediaResponse, MediaResponse.Builder, MediaResponseOrBuilder> getMediaResponseFieldBuilder() {
                if (this.mediaResponseBuilder_ == null) {
                    this.mediaResponseBuilder_ = new SingleFieldBuilderV3<>(getMediaResponse(), getParentForChildren(), isClean());
                    this.mediaResponse_ = null;
                }
                return this.mediaResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getMediaRequestFieldBuilder();
                    getMediaResponseFieldBuilder();
                    getBlockedAppHashNotificationFieldBuilder();
                    getAppStatusRequestFieldBuilder();
                    getAppStatusResponseFieldBuilder();
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
                this.mediaRequest_ = null;
                SingleFieldBuilderV3<MediaRequest, MediaRequest.Builder, MediaRequestOrBuilder> singleFieldBuilderV3 = this.mediaRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.mediaRequestBuilder_ = null;
                }
                this.mediaResponse_ = null;
                SingleFieldBuilderV3<MediaResponse, MediaResponse.Builder, MediaResponseOrBuilder> singleFieldBuilderV4 = this.mediaResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.mediaResponseBuilder_ = null;
                }
                this.blockedAppHashNotification_ = null;
                SingleFieldBuilderV3<BlockedAppsHashNotification, BlockedAppsHashNotification.Builder, BlockedAppsHashNotificationOrBuilder> singleFieldBuilderV5 = this.blockedAppHashNotificationBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.blockedAppHashNotificationBuilder_ = null;
                }
                this.appStatusRequest_ = null;
                SingleFieldBuilderV3<AppStatusRequest, AppStatusRequest.Builder, AppStatusRequestOrBuilder> singleFieldBuilderV6 = this.appStatusRequestBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.appStatusRequestBuilder_ = null;
                }
                this.appStatusResponse_ = null;
                SingleFieldBuilderV3<AppStatusResponse, AppStatusResponse.Builder, AppStatusResponseOrBuilder> singleFieldBuilderV7 = this.appStatusResponseBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.appStatusResponseBuilder_ = null;
                }
                return this;
            }

            public Builder clearAppStatusRequest() {
                this.bitField0_ &= -9;
                this.appStatusRequest_ = null;
                SingleFieldBuilderV3<AppStatusRequest, AppStatusRequest.Builder, AppStatusRequestOrBuilder> singleFieldBuilderV3 = this.appStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.appStatusRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearAppStatusResponse() {
                this.bitField0_ &= -17;
                this.appStatusResponse_ = null;
                SingleFieldBuilderV3<AppStatusResponse, AppStatusResponse.Builder, AppStatusResponseOrBuilder> singleFieldBuilderV3 = this.appStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.appStatusResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearBlockedAppHashNotification() {
                this.bitField0_ &= -5;
                this.blockedAppHashNotification_ = null;
                SingleFieldBuilderV3<BlockedAppsHashNotification, BlockedAppsHashNotification.Builder, BlockedAppsHashNotificationOrBuilder> singleFieldBuilderV3 = this.blockedAppHashNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.blockedAppHashNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMediaRequest() {
                this.bitField0_ &= -2;
                this.mediaRequest_ = null;
                SingleFieldBuilderV3<MediaRequest, MediaRequest.Builder, MediaRequestOrBuilder> singleFieldBuilderV3 = this.mediaRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.mediaRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearMediaResponse() {
                this.bitField0_ &= -3;
                this.mediaResponse_ = null;
                SingleFieldBuilderV3<MediaResponse, MediaResponse.Builder, MediaResponseOrBuilder> singleFieldBuilderV3 = this.mediaResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.mediaResponseBuilder_ = null;
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

            @Override // com.garmin.proto.generated.GDIGNCS.ServiceOrBuilder
            public AppStatusRequest getAppStatusRequest() {
                SingleFieldBuilderV3<AppStatusRequest, AppStatusRequest.Builder, AppStatusRequestOrBuilder> singleFieldBuilderV3 = this.appStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AppStatusRequest) singleFieldBuilderV3.getMessage();
                }
                AppStatusRequest appStatusRequest = this.appStatusRequest_;
                return appStatusRequest == null ? AppStatusRequest.getDefaultInstance() : appStatusRequest;
            }

            public AppStatusRequest.Builder getAppStatusRequestBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (AppStatusRequest.Builder) getAppStatusRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGNCS.ServiceOrBuilder
            public AppStatusRequestOrBuilder getAppStatusRequestOrBuilder() {
                SingleFieldBuilderV3<AppStatusRequest, AppStatusRequest.Builder, AppStatusRequestOrBuilder> singleFieldBuilderV3 = this.appStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AppStatusRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AppStatusRequest appStatusRequest = this.appStatusRequest_;
                return appStatusRequest == null ? AppStatusRequest.getDefaultInstance() : appStatusRequest;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.ServiceOrBuilder
            public AppStatusResponse getAppStatusResponse() {
                SingleFieldBuilderV3<AppStatusResponse, AppStatusResponse.Builder, AppStatusResponseOrBuilder> singleFieldBuilderV3 = this.appStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AppStatusResponse) singleFieldBuilderV3.getMessage();
                }
                AppStatusResponse appStatusResponse = this.appStatusResponse_;
                return appStatusResponse == null ? AppStatusResponse.getDefaultInstance() : appStatusResponse;
            }

            public AppStatusResponse.Builder getAppStatusResponseBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (AppStatusResponse.Builder) getAppStatusResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGNCS.ServiceOrBuilder
            public AppStatusResponseOrBuilder getAppStatusResponseOrBuilder() {
                SingleFieldBuilderV3<AppStatusResponse, AppStatusResponse.Builder, AppStatusResponseOrBuilder> singleFieldBuilderV3 = this.appStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (AppStatusResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                AppStatusResponse appStatusResponse = this.appStatusResponse_;
                return appStatusResponse == null ? AppStatusResponse.getDefaultInstance() : appStatusResponse;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.ServiceOrBuilder
            public BlockedAppsHashNotification getBlockedAppHashNotification() {
                SingleFieldBuilderV3<BlockedAppsHashNotification, BlockedAppsHashNotification.Builder, BlockedAppsHashNotificationOrBuilder> singleFieldBuilderV3 = this.blockedAppHashNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (BlockedAppsHashNotification) singleFieldBuilderV3.getMessage();
                }
                BlockedAppsHashNotification blockedAppsHashNotification = this.blockedAppHashNotification_;
                return blockedAppsHashNotification == null ? BlockedAppsHashNotification.getDefaultInstance() : blockedAppsHashNotification;
            }

            public BlockedAppsHashNotification.Builder getBlockedAppHashNotificationBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (BlockedAppsHashNotification.Builder) getBlockedAppHashNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGNCS.ServiceOrBuilder
            public BlockedAppsHashNotificationOrBuilder getBlockedAppHashNotificationOrBuilder() {
                SingleFieldBuilderV3<BlockedAppsHashNotification, BlockedAppsHashNotification.Builder, BlockedAppsHashNotificationOrBuilder> singleFieldBuilderV3 = this.blockedAppHashNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (BlockedAppsHashNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                BlockedAppsHashNotification blockedAppsHashNotification = this.blockedAppHashNotification_;
                return blockedAppsHashNotification == null ? BlockedAppsHashNotification.getDefaultInstance() : blockedAppsHashNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIGNCS.internal_static_GDI_Proto_GNCS_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.ServiceOrBuilder
            public MediaRequest getMediaRequest() {
                SingleFieldBuilderV3<MediaRequest, MediaRequest.Builder, MediaRequestOrBuilder> singleFieldBuilderV3 = this.mediaRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (MediaRequest) singleFieldBuilderV3.getMessage();
                }
                MediaRequest mediaRequest = this.mediaRequest_;
                return mediaRequest == null ? MediaRequest.getDefaultInstance() : mediaRequest;
            }

            public MediaRequest.Builder getMediaRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (MediaRequest.Builder) getMediaRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGNCS.ServiceOrBuilder
            public MediaRequestOrBuilder getMediaRequestOrBuilder() {
                SingleFieldBuilderV3<MediaRequest, MediaRequest.Builder, MediaRequestOrBuilder> singleFieldBuilderV3 = this.mediaRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (MediaRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                MediaRequest mediaRequest = this.mediaRequest_;
                return mediaRequest == null ? MediaRequest.getDefaultInstance() : mediaRequest;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.ServiceOrBuilder
            public MediaResponse getMediaResponse() {
                SingleFieldBuilderV3<MediaResponse, MediaResponse.Builder, MediaResponseOrBuilder> singleFieldBuilderV3 = this.mediaResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (MediaResponse) singleFieldBuilderV3.getMessage();
                }
                MediaResponse mediaResponse = this.mediaResponse_;
                return mediaResponse == null ? MediaResponse.getDefaultInstance() : mediaResponse;
            }

            public MediaResponse.Builder getMediaResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (MediaResponse.Builder) getMediaResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGNCS.ServiceOrBuilder
            public MediaResponseOrBuilder getMediaResponseOrBuilder() {
                SingleFieldBuilderV3<MediaResponse, MediaResponse.Builder, MediaResponseOrBuilder> singleFieldBuilderV3 = this.mediaResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (MediaResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                MediaResponse mediaResponse = this.mediaResponse_;
                return mediaResponse == null ? MediaResponse.getDefaultInstance() : mediaResponse;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.ServiceOrBuilder
            public boolean hasAppStatusRequest() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.ServiceOrBuilder
            public boolean hasAppStatusResponse() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.ServiceOrBuilder
            public boolean hasBlockedAppHashNotification() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.ServiceOrBuilder
            public boolean hasMediaRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGNCS.ServiceOrBuilder
            public boolean hasMediaResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGNCS.internal_static_GDI_Proto_GNCS_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasMediaResponse() || getMediaResponse().isInitialized();
            }

            public Builder mergeAppStatusRequest(AppStatusRequest appStatusRequest) {
                AppStatusRequest appStatusRequest2;
                SingleFieldBuilderV3<AppStatusRequest, AppStatusRequest.Builder, AppStatusRequestOrBuilder> singleFieldBuilderV3 = this.appStatusRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(appStatusRequest);
                } else if ((this.bitField0_ & 8) == 0 || (appStatusRequest2 = this.appStatusRequest_) == null || appStatusRequest2 == AppStatusRequest.getDefaultInstance()) {
                    this.appStatusRequest_ = appStatusRequest;
                } else {
                    getAppStatusRequestBuilder().mergeFrom(appStatusRequest);
                }
                if (this.appStatusRequest_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeAppStatusResponse(AppStatusResponse appStatusResponse) {
                AppStatusResponse appStatusResponse2;
                SingleFieldBuilderV3<AppStatusResponse, AppStatusResponse.Builder, AppStatusResponseOrBuilder> singleFieldBuilderV3 = this.appStatusResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(appStatusResponse);
                } else if ((this.bitField0_ & 16) == 0 || (appStatusResponse2 = this.appStatusResponse_) == null || appStatusResponse2 == AppStatusResponse.getDefaultInstance()) {
                    this.appStatusResponse_ = appStatusResponse;
                } else {
                    getAppStatusResponseBuilder().mergeFrom(appStatusResponse);
                }
                if (this.appStatusResponse_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeBlockedAppHashNotification(BlockedAppsHashNotification blockedAppsHashNotification) {
                BlockedAppsHashNotification blockedAppsHashNotification2;
                SingleFieldBuilderV3<BlockedAppsHashNotification, BlockedAppsHashNotification.Builder, BlockedAppsHashNotificationOrBuilder> singleFieldBuilderV3 = this.blockedAppHashNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(blockedAppsHashNotification);
                } else if ((this.bitField0_ & 4) == 0 || (blockedAppsHashNotification2 = this.blockedAppHashNotification_) == null || blockedAppsHashNotification2 == BlockedAppsHashNotification.getDefaultInstance()) {
                    this.blockedAppHashNotification_ = blockedAppsHashNotification;
                } else {
                    getBlockedAppHashNotificationBuilder().mergeFrom(blockedAppsHashNotification);
                }
                if (this.blockedAppHashNotification_ != null) {
                    this.bitField0_ |= 4;
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
                                    codedInputStream.readMessage(getMediaRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getMediaResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getBlockedAppHashNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getAppStatusRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(getAppStatusResponseFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeMediaRequest(MediaRequest mediaRequest) {
                MediaRequest mediaRequest2;
                SingleFieldBuilderV3<MediaRequest, MediaRequest.Builder, MediaRequestOrBuilder> singleFieldBuilderV3 = this.mediaRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(mediaRequest);
                } else if ((this.bitField0_ & 1) == 0 || (mediaRequest2 = this.mediaRequest_) == null || mediaRequest2 == MediaRequest.getDefaultInstance()) {
                    this.mediaRequest_ = mediaRequest;
                } else {
                    getMediaRequestBuilder().mergeFrom(mediaRequest);
                }
                if (this.mediaRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeMediaResponse(MediaResponse mediaResponse) {
                MediaResponse mediaResponse2;
                SingleFieldBuilderV3<MediaResponse, MediaResponse.Builder, MediaResponseOrBuilder> singleFieldBuilderV3 = this.mediaResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(mediaResponse);
                } else if ((this.bitField0_ & 2) == 0 || (mediaResponse2 = this.mediaResponse_) == null || mediaResponse2 == MediaResponse.getDefaultInstance()) {
                    this.mediaResponse_ = mediaResponse;
                } else {
                    getMediaResponseBuilder().mergeFrom(mediaResponse);
                }
                if (this.mediaResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setAppStatusRequest(AppStatusRequest.Builder builder) {
                SingleFieldBuilderV3<AppStatusRequest, AppStatusRequest.Builder, AppStatusRequestOrBuilder> singleFieldBuilderV3 = this.appStatusRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.appStatusRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setAppStatusResponse(AppStatusResponse.Builder builder) {
                SingleFieldBuilderV3<AppStatusResponse, AppStatusResponse.Builder, AppStatusResponseOrBuilder> singleFieldBuilderV3 = this.appStatusResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.appStatusResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setBlockedAppHashNotification(BlockedAppsHashNotification.Builder builder) {
                SingleFieldBuilderV3<BlockedAppsHashNotification, BlockedAppsHashNotification.Builder, BlockedAppsHashNotificationOrBuilder> singleFieldBuilderV3 = this.blockedAppHashNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.blockedAppHashNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setMediaRequest(MediaRequest.Builder builder) {
                SingleFieldBuilderV3<MediaRequest, MediaRequest.Builder, MediaRequestOrBuilder> singleFieldBuilderV3 = this.mediaRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.mediaRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setMediaResponse(MediaResponse.Builder builder) {
                SingleFieldBuilderV3<MediaResponse, MediaResponse.Builder, MediaResponseOrBuilder> singleFieldBuilderV3 = this.mediaResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.mediaResponse_ = builder.build();
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

            public Builder setAppStatusRequest(AppStatusRequest appStatusRequest) {
                SingleFieldBuilderV3<AppStatusRequest, AppStatusRequest.Builder, AppStatusRequestOrBuilder> singleFieldBuilderV3 = this.appStatusRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    appStatusRequest.getClass();
                    this.appStatusRequest_ = appStatusRequest;
                } else {
                    singleFieldBuilderV3.setMessage(appStatusRequest);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setAppStatusResponse(AppStatusResponse appStatusResponse) {
                SingleFieldBuilderV3<AppStatusResponse, AppStatusResponse.Builder, AppStatusResponseOrBuilder> singleFieldBuilderV3 = this.appStatusResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    appStatusResponse.getClass();
                    this.appStatusResponse_ = appStatusResponse;
                } else {
                    singleFieldBuilderV3.setMessage(appStatusResponse);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setBlockedAppHashNotification(BlockedAppsHashNotification blockedAppsHashNotification) {
                SingleFieldBuilderV3<BlockedAppsHashNotification, BlockedAppsHashNotification.Builder, BlockedAppsHashNotificationOrBuilder> singleFieldBuilderV3 = this.blockedAppHashNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    blockedAppsHashNotification.getClass();
                    this.blockedAppHashNotification_ = blockedAppsHashNotification;
                } else {
                    singleFieldBuilderV3.setMessage(blockedAppsHashNotification);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setMediaRequest(MediaRequest mediaRequest) {
                SingleFieldBuilderV3<MediaRequest, MediaRequest.Builder, MediaRequestOrBuilder> singleFieldBuilderV3 = this.mediaRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    mediaRequest.getClass();
                    this.mediaRequest_ = mediaRequest;
                } else {
                    singleFieldBuilderV3.setMessage(mediaRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setMediaResponse(MediaResponse mediaResponse) {
                SingleFieldBuilderV3<MediaResponse, MediaResponse.Builder, MediaResponseOrBuilder> singleFieldBuilderV3 = this.mediaResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    mediaResponse.getClass();
                    this.mediaResponse_ = mediaResponse;
                } else {
                    singleFieldBuilderV3.setMessage(mediaResponse);
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
                if (service.hasMediaRequest()) {
                    mergeMediaRequest(service.getMediaRequest());
                }
                if (service.hasMediaResponse()) {
                    mergeMediaResponse(service.getMediaResponse());
                }
                if (service.hasBlockedAppHashNotification()) {
                    mergeBlockedAppHashNotification(service.getBlockedAppHashNotification());
                }
                if (service.hasAppStatusRequest()) {
                    mergeAppStatusRequest(service.getAppStatusRequest());
                }
                if (service.hasAppStatusResponse()) {
                    mergeAppStatusResponse(service.getAppStatusResponse());
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

    public enum MediaType implements ProtocolMessageEnum {
        PNG(0),
        JPEG(1);

        public static final int JPEG_VALUE = 1;
        public static final int PNG_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<MediaType> internalValueMap = new Internal.EnumLiteMap<MediaType>() { // from class: com.garmin.proto.generated.GDIGNCS.MediaType.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public MediaType findValueByNumber(int i14) {
                return MediaType.forNumber(i14);
            }
        };
        private static final MediaType[] VALUES = values();

        MediaType(int i14) {
            this.value = i14;
        }

        public static MediaType forNumber(int i14) {
            if (i14 == 0) {
                return PNG;
            }
            if (i14 != 1) {
                return null;
            }
            return JPEG;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIGNCS.getDescriptor().getEnumTypes().get(1);
        }

        public static Internal.EnumLiteMap<MediaType> internalGetValueMap() {
            return internalValueMap;
        }

        public static MediaType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static MediaType valueOf(int i14) {
            return forNumber(i14);
        }
    }

    public enum NotificationDisabledReason implements ProtocolMessageEnum {
        LOW_RAM_MOBILE_DEVICE(1),
        PERMISSION_NOT_GRANTED(2),
        SERVICE_NOT_BOUND(3);

        public static final int LOW_RAM_MOBILE_DEVICE_VALUE = 1;
        public static final int PERMISSION_NOT_GRANTED_VALUE = 2;
        public static final int SERVICE_NOT_BOUND_VALUE = 3;
        private final int value;
        private static final Internal.EnumLiteMap<NotificationDisabledReason> internalValueMap = new Internal.EnumLiteMap<NotificationDisabledReason>() { // from class: com.garmin.proto.generated.GDIGNCS.NotificationDisabledReason.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public NotificationDisabledReason findValueByNumber(int i14) {
                return NotificationDisabledReason.forNumber(i14);
            }
        };
        private static final NotificationDisabledReason[] VALUES = values();

        NotificationDisabledReason(int i14) {
            this.value = i14;
        }

        public static NotificationDisabledReason forNumber(int i14) {
            if (i14 == 1) {
                return LOW_RAM_MOBILE_DEVICE;
            }
            if (i14 == 2) {
                return PERMISSION_NOT_GRANTED;
            }
            if (i14 != 3) {
                return null;
            }
            return SERVICE_NOT_BOUND;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIGNCS.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<NotificationDisabledReason> internalGetValueMap() {
            return internalValueMap;
        }

        public static NotificationDisabledReason valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static NotificationDisabledReason valueOf(int i14) {
            return forNumber(i14);
        }
    }
}
